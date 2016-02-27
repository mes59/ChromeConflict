package game;

final class C_100153_be extends C_100295_kh
{
	byte[] field_105319_u;
	int[] field_105320_t;
	
	final C_100037_wb func_105309_b()
	{
		// @00: aload_0
		// @01: getfield int game.C_100153_be.field_105298_m
		// @04: aload_0
		// @05: getfield int game.C_100153_be.field_105304_r
		// @08: imul
		// @09: istore_1
		// @0A: iload_1
		// @0B: newarray int[]
		// @0D: astore_2
		// @0E: iconst_0
		// @0F: istore_3
		// @10: iload_3
		// @11: iload_1
		// @12: if_icmpge @2D
		// @15: aload_2
		// @16: iload_3
		// @17: aload_0
		// @18: getfield int[] game.C_100153_be.field_105320_t
		// @1B: aload_0
		// @1C: getfield byte[] game.C_100153_be.field_105319_u
		// @1F: iload_3
		// @20: baload
		// @21: sipush 255 (0x00FF)
		// @24: iand
		// @25: iaload
		// @26: iastore
		// @27: iinc #3 +1
		// @2A: goto @10
		// @2D: new game.C_100037_wb
		// @30: dup
		// @31: aload_0
		// @32: getfield int game.C_100153_be.field_105301_h
		// @35: aload_0
		// @36: getfield int game.C_100153_be.field_105303_s
		// @39: aload_0
		// @3A: getfield int game.C_100153_be.field_105297_l
		// @3D: aload_0
		// @3E: getfield int game.C_100153_be.field_105300_k
		// @41: aload_0
		// @42: getfield int game.C_100153_be.field_105298_m
		// @45: aload_0
		// @46: getfield int game.C_100153_be.field_105304_r
		// @49: aload_2
		// @4A: invokespecial game.C_100037_wb.<init>(int, int, int, int, int, int, int[])void
		// @4D: areturn
	}
	
	final void func_105315_a(int arg0, int arg1, int arg2, int arg3, int arg4)
	{
		// @000: aload_0
		// @001: getfield int game.C_100153_be.field_105298_m
		// @004: istore #6
		// @006: aload_0
		// @007: getfield int game.C_100153_be.field_105304_r
		// @00A: istore #7
		// @00C: iconst_0
		// @00D: istore #8
		// @00F: iconst_0
		// @010: istore #9
		// @012: aload_0
		// @013: getfield int game.C_100153_be.field_105301_h
		// @016: istore #10
		// @018: aload_0
		// @019: getfield int game.C_100153_be.field_105303_s
		// @01C: istore #11
		// @01E: iload #10
		// @020: bipush 16 (0x10)
		// @022: ishl
		// @023: iload_3
		// @024: idiv
		// @025: istore #12
		// @027: iload #11
		// @029: bipush 16 (0x10)
		// @02B: ishl
		// @02C: iload #4
		// @02E: idiv
		// @02F: istore #13
		// @031: aload_0
		// @032: getfield int game.C_100153_be.field_105297_l
		// @035: ifle @060
		// @038: aload_0
		// @039: getfield int game.C_100153_be.field_105297_l
		// @03C: bipush 16 (0x10)
		// @03E: ishl
		// @03F: iload #12
		// @041: iadd
		// @042: iconst_1
		// @043: isub
		// @044: iload #12
		// @046: idiv
		// @047: istore #14
		// @049: iload_1
		// @04A: iload #14
		// @04C: iadd
		// @04D: istore_1
		// @04E: iload #8
		// @050: iload #14
		// @052: iload #12
		// @054: imul
		// @055: aload_0
		// @056: getfield int game.C_100153_be.field_105297_l
		// @059: bipush 16 (0x10)
		// @05B: ishl
		// @05C: isub
		// @05D: iadd
		// @05E: istore #8
		// @060: aload_0
		// @061: getfield int game.C_100153_be.field_105300_k
		// @064: ifle @08F
		// @067: aload_0
		// @068: getfield int game.C_100153_be.field_105300_k
		// @06B: bipush 16 (0x10)
		// @06D: ishl
		// @06E: iload #13
		// @070: iadd
		// @071: iconst_1
		// @072: isub
		// @073: iload #13
		// @075: idiv
		// @076: istore #14
		// @078: iload_2
		// @079: iload #14
		// @07B: iadd
		// @07C: istore_2
		// @07D: iload #9
		// @07F: iload #14
		// @081: iload #13
		// @083: imul
		// @084: aload_0
		// @085: getfield int game.C_100153_be.field_105300_k
		// @088: bipush 16 (0x10)
		// @08A: ishl
		// @08B: isub
		// @08C: iadd
		// @08D: istore #9
		// @08F: iload #6
		// @091: iload #10
		// @093: if_icmpge @0A7
		// @096: iload #6
		// @098: bipush 16 (0x10)
		// @09A: ishl
		// @09B: iload #8
		// @09D: isub
		// @09E: iload #12
		// @0A0: iadd
		// @0A1: iconst_1
		// @0A2: isub
		// @0A3: iload #12
		// @0A5: idiv
		// @0A6: istore_3
		// @0A7: iload #7
		// @0A9: iload #11
		// @0AB: if_icmpge @0C0
		// @0AE: iload #7
		// @0B0: bipush 16 (0x10)
		// @0B2: ishl
		// @0B3: iload #9
		// @0B5: isub
		// @0B6: iload #13
		// @0B8: iadd
		// @0B9: iconst_1
		// @0BA: isub
		// @0BB: iload #13
		// @0BD: idiv
		// @0BE: istore #4
		// @0C0: iload_1
		// @0C1: iload_2
		// @0C2: getstatic int game.C_100196_rb.field_105819_e
		// @0C5: imul
		// @0C6: iadd
		// @0C7: istore #14
		// @0C9: getstatic int game.C_100196_rb.field_105819_e
		// @0CC: iload_3
		// @0CD: isub
		// @0CE: istore #15
		// @0D0: iload_2
		// @0D1: iload #4
		// @0D3: iadd
		// @0D4: getstatic int game.C_100196_rb.field_105823_l
		// @0D7: if_icmple @0E7
		// @0DA: iload #4
		// @0DC: iload_2
		// @0DD: iload #4
		// @0DF: iadd
		// @0E0: getstatic int game.C_100196_rb.field_105823_l
		// @0E3: isub
		// @0E4: isub
		// @0E5: istore #4
		// @0E7: iload_2
		// @0E8: getstatic int game.C_100196_rb.field_105816_f
		// @0EB: if_icmpge @111
		// @0EE: getstatic int game.C_100196_rb.field_105816_f
		// @0F1: iload_2
		// @0F2: isub
		// @0F3: istore #16
		// @0F5: iload #4
		// @0F7: iload #16
		// @0F9: isub
		// @0FA: istore #4
		// @0FC: iload #14
		// @0FE: iload #16
		// @100: getstatic int game.C_100196_rb.field_105819_e
		// @103: imul
		// @104: iadd
		// @105: istore #14
		// @107: iload #9
		// @109: iload #13
		// @10B: iload #16
		// @10D: imul
		// @10E: iadd
		// @10F: istore #9
		// @111: iload_1
		// @112: iload_3
		// @113: iadd
		// @114: getstatic int game.C_100196_rb.field_105820_b
		// @117: if_icmple @12F
		// @11A: iload_1
		// @11B: iload_3
		// @11C: iadd
		// @11D: getstatic int game.C_100196_rb.field_105820_b
		// @120: isub
		// @121: istore #16
		// @123: iload_3
		// @124: iload #16
		// @126: isub
		// @127: istore_3
		// @128: iload #15
		// @12A: iload #16
		// @12C: iadd
		// @12D: istore #15
		// @12F: iload_1
		// @130: getstatic int game.C_100196_rb.field_105827_i
		// @133: if_icmpge @15A
		// @136: getstatic int game.C_100196_rb.field_105827_i
		// @139: iload_1
		// @13A: isub
		// @13B: istore #16
		// @13D: iload_3
		// @13E: iload #16
		// @140: isub
		// @141: istore_3
		// @142: iload #14
		// @144: iload #16
		// @146: iadd
		// @147: istore #14
		// @149: iload #8
		// @14B: iload #12
		// @14D: iload #16
		// @14F: imul
		// @150: iadd
		// @151: istore #8
		// @153: iload #15
		// @155: iload #16
		// @157: iadd
		// @158: istore #15
		// @15A: getstatic int[] game.C_100196_rb.field_105818_d
		// @15D: aload_0
		// @15E: getfield byte[] game.C_100153_be.field_105319_u
		// @161: aload_0
		// @162: getfield int[] game.C_100153_be.field_105320_t
		// @165: iload #8
		// @167: iload #9
		// @169: iload #14
		// @16B: iload #15
		// @16D: iload_3
		// @16E: iload #4
		// @170: iload #12
		// @172: iload #13
		// @174: iload #6
		// @176: iload #5
		// @178: invokestatic game.C_100153_be.func_105313_a(int[], byte[], int[], int, int, int, int, int, int, int, int, int, int)void
		// @17B: return
	}
	
	private static final void func_105311_a(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9)
	{
		// @00: iload #6
		// @02: iconst_2
		// @03: ishr
		// @04: ineg
		// @05: istore #10
		// @07: iload #6
		// @09: iconst_3
		// @0A: iand
		// @0B: ineg
		// @0C: istore #6
		// @0E: iload #7
		// @10: ineg
		// @11: istore #11
		// @13: iload #11
		// @15: ifge @EA
		// @18: iload #10
		// @1A: istore #12
		// @1C: iload #12
		// @1E: ifge @A7
		// @21: aload_1
		// @22: iload #4
		// @24: iinc #4 +1
		// @27: baload
		// @28: istore_3
		// @29: iload_3
		// @2A: ifeq @3E
		// @2D: aload_0
		// @2E: iload #5
		// @30: iinc #5 +1
		// @33: aload_2
		// @34: iload_3
		// @35: sipush 255 (0x00FF)
		// @38: iand
		// @39: iaload
		// @3A: iastore
		// @3B: goto @41
		// @3E: iinc #5 +1
		// @41: aload_1
		// @42: iload #4
		// @44: iinc #4 +1
		// @47: baload
		// @48: istore_3
		// @49: iload_3
		// @4A: ifeq @5E
		// @4D: aload_0
		// @4E: iload #5
		// @50: iinc #5 +1
		// @53: aload_2
		// @54: iload_3
		// @55: sipush 255 (0x00FF)
		// @58: iand
		// @59: iaload
		// @5A: iastore
		// @5B: goto @61
		// @5E: iinc #5 +1
		// @61: aload_1
		// @62: iload #4
		// @64: iinc #4 +1
		// @67: baload
		// @68: istore_3
		// @69: iload_3
		// @6A: ifeq @7E
		// @6D: aload_0
		// @6E: iload #5
		// @70: iinc #5 +1
		// @73: aload_2
		// @74: iload_3
		// @75: sipush 255 (0x00FF)
		// @78: iand
		// @79: iaload
		// @7A: iastore
		// @7B: goto @81
		// @7E: iinc #5 +1
		// @81: aload_1
		// @82: iload #4
		// @84: iinc #4 +1
		// @87: baload
		// @88: istore_3
		// @89: iload_3
		// @8A: ifeq @9E
		// @8D: aload_0
		// @8E: iload #5
		// @90: iinc #5 +1
		// @93: aload_2
		// @94: iload_3
		// @95: sipush 255 (0x00FF)
		// @98: iand
		// @99: iaload
		// @9A: iastore
		// @9B: goto @A1
		// @9E: iinc #5 +1
		// @A1: iinc #12 +1
		// @A4: goto @1C
		// @A7: iload #6
		// @A9: istore #12
		// @AB: iload #12
		// @AD: ifge @D6
		// @B0: aload_1
		// @B1: iload #4
		// @B3: iinc #4 +1
		// @B6: baload
		// @B7: istore_3
		// @B8: iload_3
		// @B9: ifeq @CD
		// @BC: aload_0
		// @BD: iload #5
		// @BF: iinc #5 +1
		// @C2: aload_2
		// @C3: iload_3
		// @C4: sipush 255 (0x00FF)
		// @C7: iand
		// @C8: iaload
		// @C9: iastore
		// @CA: goto @D0
		// @CD: iinc #5 +1
		// @D0: iinc #12 +1
		// @D3: goto @AB
		// @D6: iload #5
		// @D8: iload #8
		// @DA: iadd
		// @DB: istore #5
		// @DD: iload #4
		// @DF: iload #9
		// @E1: iadd
		// @E2: istore #4
		// @E4: iinc #11 +1
		// @E7: goto @13
		// @EA: return
	}
	
	private static final void func_105314_a(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11)
	{
		// @00: iload_3
		// @01: istore #12
		// @03: iload #8
		// @05: ineg
		// @06: istore #13
		// @08: iload #13
		// @0A: ifge @68
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
		// @1E: ifge @51
		// @21: aload_1
		// @22: iload_3
		// @23: bipush 16 (0x10)
		// @25: ishr
		// @26: iload #14
		// @28: iadd
		// @29: baload
		// @2A: istore #16
		// @2C: iload #16
		// @2E: ifeq @43
		// @31: aload_0
		// @32: iload #5
		// @34: iinc #5 +1
		// @37: aload_2
		// @38: iload #16
		// @3A: sipush 255 (0x00FF)
		// @3D: iand
		// @3E: iaload
		// @3F: iastore
		// @40: goto @46
		// @43: iinc #5 +1
		// @46: iload_3
		// @47: iload #9
		// @49: iadd
		// @4A: istore_3
		// @4B: iinc #15 +1
		// @4E: goto @1C
		// @51: iload #4
		// @53: iload #10
		// @55: iadd
		// @56: istore #4
		// @58: iload #12
		// @5A: istore_3
		// @5B: iload #5
		// @5D: iload #6
		// @5F: iadd
		// @60: istore #5
		// @62: iinc #13 +1
		// @65: goto @08
		// @68: return
	}
	
	final C_100153_be func_105310_a()
	{
		// @00: new game.C_100153_be
		// @03: dup
		// @04: aload_0
		// @05: getfield int game.C_100153_be.field_105298_m
		// @08: aload_0
		// @09: getfield int game.C_100153_be.field_105304_r
		// @0C: aload_0
		// @0D: getfield int[] game.C_100153_be.field_105320_t
		// @10: arraylength
		// @11: invokespecial game.C_100153_be.<init>(int, int, int)void
		// @14: astore_1
		// @15: aload_1
		// @16: aload_0
		// @17: getfield int game.C_100153_be.field_105301_h
		// @1A: putfield int game.C_100153_be.field_105301_h
		// @1D: aload_1
		// @1E: aload_0
		// @1F: getfield int game.C_100153_be.field_105303_s
		// @22: putfield int game.C_100153_be.field_105303_s
		// @25: aload_1
		// @26: aload_0
		// @27: getfield int game.C_100153_be.field_105301_h
		// @2A: aload_0
		// @2B: getfield int game.C_100153_be.field_105298_m
		// @2E: isub
		// @2F: aload_0
		// @30: getfield int game.C_100153_be.field_105297_l
		// @33: isub
		// @34: putfield int game.C_100153_be.field_105297_l
		// @37: aload_1
		// @38: aload_0
		// @39: getfield int game.C_100153_be.field_105300_k
		// @3C: putfield int game.C_100153_be.field_105300_k
		// @3F: aload_0
		// @40: getfield int[] game.C_100153_be.field_105320_t
		// @43: arraylength
		// @44: istore_2
		// @45: iconst_0
		// @46: istore_3
		// @47: iload_3
		// @48: iload_2
		// @49: if_icmpge @5E
		// @4C: aload_1
		// @4D: getfield int[] game.C_100153_be.field_105320_t
		// @50: iload_3
		// @51: aload_0
		// @52: getfield int[] game.C_100153_be.field_105320_t
		// @55: iload_3
		// @56: iaload
		// @57: iastore
		// @58: iinc #3 +1
		// @5B: goto @47
		// @5E: iconst_0
		// @5F: istore_3
		// @60: iload_3
		// @61: aload_0
		// @62: getfield int game.C_100153_be.field_105304_r
		// @65: if_icmpge @A3
		// @68: iconst_0
		// @69: istore #4
		// @6B: iload #4
		// @6D: aload_0
		// @6E: getfield int game.C_100153_be.field_105298_m
		// @71: if_icmpge @9D
		// @74: aload_1
		// @75: getfield byte[] game.C_100153_be.field_105319_u
		// @78: iload_3
		// @79: aload_0
		// @7A: getfield int game.C_100153_be.field_105298_m
		// @7D: imul
		// @7E: iload #4
		// @80: iadd
		// @81: aload_0
		// @82: getfield byte[] game.C_100153_be.field_105319_u
		// @85: iload_3
		// @86: aload_0
		// @87: getfield int game.C_100153_be.field_105298_m
		// @8A: imul
		// @8B: aload_0
		// @8C: getfield int game.C_100153_be.field_105298_m
		// @8F: iadd
		// @90: iconst_1
		// @91: isub
		// @92: iload #4
		// @94: isub
		// @95: baload
		// @96: bastore
		// @97: iinc #4 +1
		// @9A: goto @6B
		// @9D: iinc #3 +1
		// @A0: goto @60
		// @A3: aload_1
		// @A4: areturn
	}
	
	private static final void func_105313_a(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12)
	{
		// @00: iload_3
		// @01: istore #13
		// @03: iload #12
		// @05: bipush 16 (0x10)
		// @07: ishr
		// @08: sipush 255 (0x00FF)
		// @0B: iand
		// @0C: istore #14
		// @0E: iload #12
		// @10: bipush 8 (0x08)
		// @12: ishr
		// @13: sipush 255 (0x00FF)
		// @16: iand
		// @17: istore #15
		// @19: iload #12
		// @1B: sipush 255 (0x00FF)
		// @1E: iand
		// @1F: istore #16
		// @21: iload #8
		// @23: ineg
		// @24: istore #17
		// @26: iload #17
		// @28: ifge @C6
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
		// @3C: ifge @AF
		// @3F: aload_1
		// @40: iload_3
		// @41: bipush 16 (0x10)
		// @43: ishr
		// @44: iload #18
		// @46: iadd
		// @47: baload
		// @48: istore #20
		// @4A: iload #20
		// @4C: ifeq @A1
		// @4F: aload_2
		// @50: iload #20
		// @52: sipush 255 (0x00FF)
		// @55: iand
		// @56: iaload
		// @57: istore #20
		// @59: iload #20
		// @5B: bipush 16 (0x10)
		// @5D: ishr
		// @5E: sipush 255 (0x00FF)
		// @61: iand
		// @62: istore #21
		// @64: iload #20
		// @66: bipush 8 (0x08)
		// @68: ishr
		// @69: sipush 255 (0x00FF)
		// @6C: iand
		// @6D: istore #22
		// @6F: iload #20
		// @71: sipush 255 (0x00FF)
		// @74: iand
		// @75: istore #23
		// @77: aload_0
		// @78: iload #5
		// @7A: iinc #5 +1
		// @7D: iload #21
		// @7F: iload #14
		// @81: imul
		// @82: bipush 8 (0x08)
		// @84: ishr
		// @85: bipush 16 (0x10)
		// @87: ishl
		// @88: iload #22
		// @8A: iload #15
		// @8C: imul
		// @8D: bipush 8 (0x08)
		// @8F: ishr
		// @90: bipush 8 (0x08)
		// @92: ishl
		// @93: iadd
		// @94: iload #23
		// @96: iload #16
		// @98: imul
		// @99: bipush 8 (0x08)
		// @9B: ishr
		// @9C: iadd
		// @9D: iastore
		// @9E: goto @A4
		// @A1: iinc #5 +1
		// @A4: iload_3
		// @A5: iload #9
		// @A7: iadd
		// @A8: istore_3
		// @A9: iinc #19 +1
		// @AC: goto @3A
		// @AF: iload #4
		// @B1: iload #10
		// @B3: iadd
		// @B4: istore #4
		// @B6: iload #13
		// @B8: istore_3
		// @B9: iload #5
		// @BB: iload #6
		// @BD: iadd
		// @BE: istore #5
		// @C0: iinc #17 +1
		// @C3: goto @26
		// @C6: return
	}
	
	private static final void func_105317_b(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9)
	{
		// @00: sipush 256 (0x0100)
		// @03: iload #9
		// @05: isub
		// @06: istore #10
		// @08: iload #6
		// @0A: ineg
		// @0B: istore #11
		// @0D: iload #11
		// @0F: ifge @8A
		// @12: iload #5
		// @14: ineg
		// @15: istore #12
		// @17: iload #12
		// @19: ifge @78
		// @1C: aload_1
		// @1D: iload_3
		// @1E: iinc #3 +1
		// @21: baload
		// @22: istore #13
		// @24: iload #13
		// @26: ifeq @6F
		// @29: aload_2
		// @2A: iload #13
		// @2C: sipush 255 (0x00FF)
		// @2F: iand
		// @30: iaload
		// @31: istore #13
		// @33: aload_0
		// @34: iload #4
		// @36: iaload
		// @37: istore #14
		// @39: aload_0
		// @3A: iload #4
		// @3C: iinc #4 +1
		// @3F: iload #13
		// @41: ldc 16711935 (0xff00ff)
		// @43: iand
		// @44: iload #9
		// @46: imul
		// @47: iload #14
		// @49: ldc 16711935 (0xff00ff)
		// @4B: iand
		// @4C: iload #10
		// @4E: imul
		// @4F: iadd
		// @50: ldc -16711936 (0xff00ff00)
		// @52: iand
		// @53: iload #13
		// @55: ldc 65280 (0xff00)
		// @57: iand
		// @58: iload #9
		// @5A: imul
		// @5B: iload #14
		// @5D: ldc 65280 (0xff00)
		// @5F: iand
		// @60: iload #10
		// @62: imul
		// @63: iadd
		// @64: ldc 16711680 (0xff0000)
		// @66: iand
		// @67: iadd
		// @68: bipush 8 (0x08)
		// @6A: ishr
		// @6B: iastore
		// @6C: goto @72
		// @6F: iinc #4 +1
		// @72: iinc #12 +1
		// @75: goto @17
		// @78: iload #4
		// @7A: iload #7
		// @7C: iadd
		// @7D: istore #4
		// @7F: iload_3
		// @80: iload #8
		// @82: iadd
		// @83: istore_3
		// @84: iinc #11 +1
		// @87: goto @0D
		// @8A: return
	}
	
	final void func_105286_a(int arg0, int arg1)
	{
		// @00: iload_1
		// @01: aload_0
		// @02: getfield int game.C_100153_be.field_105297_l
		// @05: iadd
		// @06: istore_1
		// @07: iload_2
		// @08: aload_0
		// @09: getfield int game.C_100153_be.field_105300_k
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
		// @1A: getfield int game.C_100153_be.field_105304_r
		// @1D: istore #5
		// @1F: aload_0
		// @20: getfield int game.C_100153_be.field_105298_m
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
		// @DE: getfield byte[] game.C_100153_be.field_105319_u
		// @E1: aload_0
		// @E2: getfield int[] game.C_100153_be.field_105320_t
		// @E5: iconst_0
		// @E6: iload #4
		// @E8: iload_3
		// @E9: iload #6
		// @EB: iload #5
		// @ED: iload #7
		// @EF: iload #8
		// @F1: invokestatic game.C_100153_be.func_105311_a(int[], byte[], int[], int, int, int, int, int, int, int)void
		// @F4: return
	}
	
	final void func_105316_a(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
	{
		// @000: iload #6
		// @002: ifne @006
		// @005: return
		// @006: iload_1
		// @007: aload_0
		// @008: getfield int game.C_100153_be.field_105297_l
		// @00B: iconst_4
		// @00C: ishl
		// @00D: isub
		// @00E: istore_1
		// @00F: iload_2
		// @010: aload_0
		// @011: getfield int game.C_100153_be.field_105300_k
		// @014: iconst_4
		// @015: ishl
		// @016: isub
		// @017: istore_2
		// @018: iload #5
		// @01A: ldc 65535 (0xffff)
		// @01C: iand
		// @01D: i2d
		// @01E: ldc2_w 9.587379924285257E-5
		// @021: dmul
		// @022: dstore #7
		// @024: dload #7
		// @026: invokestatic java.lang.Math.sin(double)double
		// @029: iload #6
		// @02B: i2d
		// @02C: dmul
		// @02D: ldc2_w 0.5
		// @030: dadd
		// @031: invokestatic java.lang.Math.floor(double)double
		// @034: d2i
		// @035: istore #9
		// @037: dload #7
		// @039: invokestatic java.lang.Math.cos(double)double
		// @03C: iload #6
		// @03E: i2d
		// @03F: dmul
		// @040: ldc2_w 0.5
		// @043: dadd
		// @044: invokestatic java.lang.Math.floor(double)double
		// @047: d2i
		// @048: istore #10
		// @04A: iload_1
		// @04B: ineg
		// @04C: iload #10
		// @04E: imul
		// @04F: iload_2
		// @050: ineg
		// @051: iload #9
		// @053: imul
		// @054: iadd
		// @055: istore #11
		// @057: iload_1
		// @058: ineg
		// @059: ineg
		// @05A: iload #9
		// @05C: imul
		// @05D: iload_2
		// @05E: ineg
		// @05F: iload #10
		// @061: imul
		// @062: iadd
		// @063: istore #12
		// @065: aload_0
		// @066: getfield int game.C_100153_be.field_105298_m
		// @069: iconst_4
		// @06A: ishl
		// @06B: iload_1
		// @06C: isub
		// @06D: iload #10
		// @06F: imul
		// @070: iload_2
		// @071: ineg
		// @072: iload #9
		// @074: imul
		// @075: iadd
		// @076: istore #13
		// @078: aload_0
		// @079: getfield int game.C_100153_be.field_105298_m
		// @07C: iconst_4
		// @07D: ishl
		// @07E: iload_1
		// @07F: isub
		// @080: ineg
		// @081: iload #9
		// @083: imul
		// @084: iload_2
		// @085: ineg
		// @086: iload #10
		// @088: imul
		// @089: iadd
		// @08A: istore #14
		// @08C: iload_1
		// @08D: ineg
		// @08E: iload #10
		// @090: imul
		// @091: aload_0
		// @092: getfield int game.C_100153_be.field_105304_r
		// @095: iconst_4
		// @096: ishl
		// @097: iload_2
		// @098: isub
		// @099: iload #9
		// @09B: imul
		// @09C: iadd
		// @09D: istore #15
		// @09F: iload_1
		// @0A0: ineg
		// @0A1: ineg
		// @0A2: iload #9
		// @0A4: imul
		// @0A5: aload_0
		// @0A6: getfield int game.C_100153_be.field_105304_r
		// @0A9: iconst_4
		// @0AA: ishl
		// @0AB: iload_2
		// @0AC: isub
		// @0AD: iload #10
		// @0AF: imul
		// @0B0: iadd
		// @0B1: istore #16
		// @0B3: aload_0
		// @0B4: getfield int game.C_100153_be.field_105298_m
		// @0B7: iconst_4
		// @0B8: ishl
		// @0B9: iload_1
		// @0BA: isub
		// @0BB: iload #10
		// @0BD: imul
		// @0BE: aload_0
		// @0BF: getfield int game.C_100153_be.field_105304_r
		// @0C2: iconst_4
		// @0C3: ishl
		// @0C4: iload_2
		// @0C5: isub
		// @0C6: iload #9
		// @0C8: imul
		// @0C9: iadd
		// @0CA: istore #17
		// @0CC: aload_0
		// @0CD: getfield int game.C_100153_be.field_105298_m
		// @0D0: iconst_4
		// @0D1: ishl
		// @0D2: iload_1
		// @0D3: isub
		// @0D4: ineg
		// @0D5: iload #9
		// @0D7: imul
		// @0D8: aload_0
		// @0D9: getfield int game.C_100153_be.field_105304_r
		// @0DC: iconst_4
		// @0DD: ishl
		// @0DE: iload_2
		// @0DF: isub
		// @0E0: iload #10
		// @0E2: imul
		// @0E3: iadd
		// @0E4: istore #18
		// @0E6: iload #11
		// @0E8: iload #13
		// @0EA: if_icmpge @0F8
		// @0ED: iload #11
		// @0EF: istore #19
		// @0F1: iload #13
		// @0F3: istore #20
		// @0F5: goto @100
		// @0F8: iload #13
		// @0FA: istore #19
		// @0FC: iload #11
		// @0FE: istore #20
		// @100: iload #15
		// @102: iload #19
		// @104: if_icmpge @10B
		// @107: iload #15
		// @109: istore #19
		// @10B: iload #17
		// @10D: iload #19
		// @10F: if_icmpge @116
		// @112: iload #17
		// @114: istore #19
		// @116: iload #15
		// @118: iload #20
		// @11A: if_icmple @121
		// @11D: iload #15
		// @11F: istore #20
		// @121: iload #17
		// @123: iload #20
		// @125: if_icmple @12C
		// @128: iload #17
		// @12A: istore #20
		// @12C: iload #12
		// @12E: iload #14
		// @130: if_icmpge @13E
		// @133: iload #12
		// @135: istore #21
		// @137: iload #14
		// @139: istore #22
		// @13B: goto @146
		// @13E: iload #14
		// @140: istore #21
		// @142: iload #12
		// @144: istore #22
		// @146: iload #16
		// @148: iload #21
		// @14A: if_icmpge @151
		// @14D: iload #16
		// @14F: istore #21
		// @151: iload #18
		// @153: iload #21
		// @155: if_icmpge @15C
		// @158: iload #18
		// @15A: istore #21
		// @15C: iload #16
		// @15E: iload #22
		// @160: if_icmple @167
		// @163: iload #16
		// @165: istore #22
		// @167: iload #18
		// @169: iload #22
		// @16B: if_icmple @172
		// @16E: iload #18
		// @170: istore #22
		// @172: iload #19
		// @174: bipush 12 (0x0C)
		// @176: ishr
		// @177: istore #19
		// @179: iload #20
		// @17B: sipush 4095 (0x0FFF)
		// @17E: iadd
		// @17F: bipush 12 (0x0C)
		// @181: ishr
		// @182: istore #20
		// @184: iload #21
		// @186: bipush 12 (0x0C)
		// @188: ishr
		// @189: istore #21
		// @18B: iload #22
		// @18D: sipush 4095 (0x0FFF)
		// @190: iadd
		// @191: bipush 12 (0x0C)
		// @193: ishr
		// @194: istore #22
		// @196: iload #19
		// @198: iload_3
		// @199: iadd
		// @19A: istore #19
		// @19C: iload #20
		// @19E: iload_3
		// @19F: iadd
		// @1A0: istore #20
		// @1A2: iload #21
		// @1A4: iload #4
		// @1A6: iadd
		// @1A7: istore #21
		// @1A9: iload #22
		// @1AB: iload #4
		// @1AD: iadd
		// @1AE: istore #22
		// @1B0: iload #19
		// @1B2: iconst_4
		// @1B3: ishr
		// @1B4: istore #19
		// @1B6: iload #20
		// @1B8: bipush 15 (0x0F)
		// @1BA: iadd
		// @1BB: iconst_4
		// @1BC: ishr
		// @1BD: istore #20
		// @1BF: iload #21
		// @1C1: iconst_4
		// @1C2: ishr
		// @1C3: istore #21
		// @1C5: iload #22
		// @1C7: bipush 15 (0x0F)
		// @1C9: iadd
		// @1CA: iconst_4
		// @1CB: ishr
		// @1CC: istore #22
		// @1CE: iload #19
		// @1D0: getstatic int game.C_100196_rb.field_105827_i
		// @1D3: if_icmpge @1DB
		// @1D6: getstatic int game.C_100196_rb.field_105827_i
		// @1D9: istore #19
		// @1DB: iload #20
		// @1DD: getstatic int game.C_100196_rb.field_105820_b
		// @1E0: if_icmple @1E8
		// @1E3: getstatic int game.C_100196_rb.field_105820_b
		// @1E6: istore #20
		// @1E8: iload #21
		// @1EA: getstatic int game.C_100196_rb.field_105816_f
		// @1ED: if_icmpge @1F5
		// @1F0: getstatic int game.C_100196_rb.field_105816_f
		// @1F3: istore #21
		// @1F5: iload #22
		// @1F7: getstatic int game.C_100196_rb.field_105823_l
		// @1FA: if_icmple @202
		// @1FD: getstatic int game.C_100196_rb.field_105823_l
		// @200: istore #22
		// @202: iload #19
		// @204: iload #20
		// @206: isub
		// @207: istore #20
		// @209: iload #20
		// @20B: iflt @20F
		// @20E: return
		// @20F: iload #21
		// @211: iload #22
		// @213: isub
		// @214: istore #22
		// @216: iload #22
		// @218: iflt @21C
		// @21B: return
		// @21C: iload #21
		// @21E: getstatic int game.C_100196_rb.field_105819_e
		// @221: imul
		// @222: iload #19
		// @224: iadd
		// @225: istore #23
		// @227: ldc2_w 1.6777216E7
		// @22A: iload #6
		// @22C: i2d
		// @22D: ddiv
		// @22E: dstore #24
		// @230: dload #7
		// @232: invokestatic java.lang.Math.sin(double)double
		// @235: dload #24
		// @237: dmul
		// @238: ldc2_w 0.5
		// @23B: dadd
		// @23C: invokestatic java.lang.Math.floor(double)double
		// @23F: d2i
		// @240: istore #26
		// @242: dload #7
		// @244: invokestatic java.lang.Math.cos(double)double
		// @247: dload #24
		// @249: dmul
		// @24A: ldc2_w 0.5
		// @24D: dadd
		// @24E: invokestatic java.lang.Math.floor(double)double
		// @251: d2i
		// @252: istore #27
		// @254: iload #19
		// @256: iconst_4
		// @257: ishl
		// @258: bipush 8 (0x08)
		// @25A: iadd
		// @25B: iload_3
		// @25C: isub
		// @25D: istore #28
		// @25F: iload #21
		// @261: iconst_4
		// @262: ishl
		// @263: bipush 8 (0x08)
		// @265: iadd
		// @266: iload #4
		// @268: isub
		// @269: istore #29
		// @26B: iload_1
		// @26C: bipush 8 (0x08)
		// @26E: ishl
		// @26F: iload #29
		// @271: iload #26
		// @273: imul
		// @274: iconst_4
		// @275: ishr
		// @276: isub
		// @277: istore #30
		// @279: iload_2
		// @27A: bipush 8 (0x08)
		// @27C: ishl
		// @27D: iload #29
		// @27F: iload #27
		// @281: imul
		// @282: iconst_4
		// @283: ishr
		// @284: iadd
		// @285: istore #31
		// @287: iload #27
		// @289: ifne @4E4
		// @28C: iload #26
		// @28E: ifne @328
		// @291: iload #22
		// @293: istore #33
		// @295: iload #33
		// @297: ifge @325
		// @29A: iload #23
		// @29C: istore #34
		// @29E: iload #30
		// @2A0: istore #35
		// @2A2: iload #31
		// @2A4: istore #36
		// @2A6: iload #20
		// @2A8: istore #37
		// @2AA: iload #35
		// @2AC: ifge @2B2
		// @2AF: goto @317
		// @2B2: iload #36
		// @2B4: ifge @2BA
		// @2B7: goto @317
		// @2BA: iload #35
		// @2BC: aload_0
		// @2BD: getfield int game.C_100153_be.field_105298_m
		// @2C0: bipush 12 (0x0C)
		// @2C2: ishl
		// @2C3: isub
		// @2C4: iflt @2CA
		// @2C7: goto @317
		// @2CA: iload #36
		// @2CC: aload_0
		// @2CD: getfield int game.C_100153_be.field_105304_r
		// @2D0: bipush 12 (0x0C)
		// @2D2: ishl
		// @2D3: isub
		// @2D4: iflt @2DA
		// @2D7: goto @317
		// @2DA: iload #37
		// @2DC: ifge @317
		// @2DF: aload_0
		// @2E0: getfield int[] game.C_100153_be.field_105320_t
		// @2E3: aload_0
		// @2E4: getfield byte[] game.C_100153_be.field_105319_u
		// @2E7: iload #36
		// @2E9: bipush 12 (0x0C)
		// @2EB: ishr
		// @2EC: aload_0
		// @2ED: getfield int game.C_100153_be.field_105298_m
		// @2F0: imul
		// @2F1: iload #35
		// @2F3: bipush 12 (0x0C)
		// @2F5: ishr
		// @2F6: iadd
		// @2F7: baload
		// @2F8: iaload
		// @2F9: istore #38
		// @2FB: iload #38
		// @2FD: ifeq @30E
		// @300: getstatic int[] game.C_100196_rb.field_105818_d
		// @303: iload #34
		// @305: iinc #34 +1
		// @308: iload #38
		// @30A: iastore
		// @30B: goto @311
		// @30E: iinc #34 +1
		// @311: iinc #37 +1
		// @314: goto @2DA
		// @317: iinc #33 +1
		// @31A: iload #23
		// @31C: getstatic int game.C_100196_rb.field_105819_e
		// @31F: iadd
		// @320: istore #23
		// @322: goto @295
		// @325: goto @B81
		// @328: iload #26
		// @32A: ifge @408
		// @32D: iload #22
		// @32F: istore #33
		// @331: iload #33
		// @333: ifge @405
		// @336: iload #23
		// @338: istore #34
		// @33A: iload #30
		// @33C: istore #35
		// @33E: iload #31
		// @340: iload #28
		// @342: iload #26
		// @344: imul
		// @345: iconst_4
		// @346: ishr
		// @347: iadd
		// @348: istore #36
		// @34A: iload #20
		// @34C: istore #37
		// @34E: iload #35
		// @350: ifge @356
		// @353: goto @3F0
		// @356: iload #35
		// @358: aload_0
		// @359: getfield int game.C_100153_be.field_105298_m
		// @35C: bipush 12 (0x0C)
		// @35E: ishl
		// @35F: isub
		// @360: iflt @366
		// @363: goto @3F0
		// @366: iload #36
		// @368: aload_0
		// @369: getfield int game.C_100153_be.field_105304_r
		// @36C: bipush 12 (0x0C)
		// @36E: ishl
		// @36F: isub
		// @370: dup
		// @371: istore #32
		// @373: iflt @398
		// @376: iload #26
		// @378: iload #32
		// @37A: isub
		// @37B: iload #26
		// @37D: idiv
		// @37E: istore #32
		// @380: iload #37
		// @382: iload #32
		// @384: iadd
		// @385: istore #37
		// @387: iload #36
		// @389: iload #26
		// @38B: iload #32
		// @38D: imul
		// @38E: iadd
		// @38F: istore #36
		// @391: iload #34
		// @393: iload #32
		// @395: iadd
		// @396: istore #34
		// @398: iload #36
		// @39A: iload #26
		// @39C: isub
		// @39D: iload #26
		// @39F: idiv
		// @3A0: dup
		// @3A1: istore #32
		// @3A3: iload #37
		// @3A5: if_icmple @3AC
		// @3A8: iload #32
		// @3AA: istore #37
		// @3AC: iload #37
		// @3AE: ifge @3F0
		// @3B1: aload_0
		// @3B2: getfield int[] game.C_100153_be.field_105320_t
		// @3B5: aload_0
		// @3B6: getfield byte[] game.C_100153_be.field_105319_u
		// @3B9: iload #36
		// @3BB: bipush 12 (0x0C)
		// @3BD: ishr
		// @3BE: aload_0
		// @3BF: getfield int game.C_100153_be.field_105298_m
		// @3C2: imul
		// @3C3: iload #35
		// @3C5: bipush 12 (0x0C)
		// @3C7: ishr
		// @3C8: iadd
		// @3C9: baload
		// @3CA: iaload
		// @3CB: istore #38
		// @3CD: iload #38
		// @3CF: ifeq @3E0
		// @3D2: getstatic int[] game.C_100196_rb.field_105818_d
		// @3D5: iload #34
		// @3D7: iinc #34 +1
		// @3DA: iload #38
		// @3DC: iastore
		// @3DD: goto @3E3
		// @3E0: iinc #34 +1
		// @3E3: iload #36
		// @3E5: iload #26
		// @3E7: iadd
		// @3E8: istore #36
		// @3EA: iinc #37 +1
		// @3ED: goto @3AC
		// @3F0: iinc #33 +1
		// @3F3: iload #30
		// @3F5: iload #26
		// @3F7: isub
		// @3F8: istore #30
		// @3FA: iload #23
		// @3FC: getstatic int game.C_100196_rb.field_105819_e
		// @3FF: iadd
		// @400: istore #23
		// @402: goto @331
		// @405: goto @B81
		// @408: iload #22
		// @40A: istore #33
		// @40C: iload #33
		// @40E: ifge @4E1
		// @411: iload #23
		// @413: istore #34
		// @415: iload #30
		// @417: istore #35
		// @419: iload #31
		// @41B: iload #28
		// @41D: iload #26
		// @41F: imul
		// @420: iconst_4
		// @421: ishr
		// @422: iadd
		// @423: istore #36
		// @425: iload #20
		// @427: istore #37
		// @429: iload #35
		// @42B: ifge @431
		// @42E: goto @4CC
		// @431: iload #35
		// @433: aload_0
		// @434: getfield int game.C_100153_be.field_105298_m
		// @437: bipush 12 (0x0C)
		// @439: ishl
		// @43A: isub
		// @43B: iflt @441
		// @43E: goto @4CC
		// @441: iload #36
		// @443: ifge @46A
		// @446: iload #26
		// @448: iconst_1
		// @449: isub
		// @44A: iload #36
		// @44C: isub
		// @44D: iload #26
		// @44F: idiv
		// @450: istore #32
		// @452: iload #37
		// @454: iload #32
		// @456: iadd
		// @457: istore #37
		// @459: iload #36
		// @45B: iload #26
		// @45D: iload #32
		// @45F: imul
		// @460: iadd
		// @461: istore #36
		// @463: iload #34
		// @465: iload #32
		// @467: iadd
		// @468: istore #34
		// @46A: iconst_1
		// @46B: iload #36
		// @46D: iadd
		// @46E: aload_0
		// @46F: getfield int game.C_100153_be.field_105304_r
		// @472: bipush 12 (0x0C)
		// @474: ishl
		// @475: isub
		// @476: iload #26
		// @478: isub
		// @479: iload #26
		// @47B: idiv
		// @47C: dup
		// @47D: istore #32
		// @47F: iload #37
		// @481: if_icmple @488
		// @484: iload #32
		// @486: istore #37
		// @488: iload #37
		// @48A: ifge @4CC
		// @48D: aload_0
		// @48E: getfield int[] game.C_100153_be.field_105320_t
		// @491: aload_0
		// @492: getfield byte[] game.C_100153_be.field_105319_u
		// @495: iload #36
		// @497: bipush 12 (0x0C)
		// @499: ishr
		// @49A: aload_0
		// @49B: getfield int game.C_100153_be.field_105298_m
		// @49E: imul
		// @49F: iload #35
		// @4A1: bipush 12 (0x0C)
		// @4A3: ishr
		// @4A4: iadd
		// @4A5: baload
		// @4A6: iaload
		// @4A7: istore #38
		// @4A9: iload #38
		// @4AB: ifeq @4BC
		// @4AE: getstatic int[] game.C_100196_rb.field_105818_d
		// @4B1: iload #34
		// @4B3: iinc #34 +1
		// @4B6: iload #38
		// @4B8: iastore
		// @4B9: goto @4BF
		// @4BC: iinc #34 +1
		// @4BF: iload #36
		// @4C1: iload #26
		// @4C3: iadd
		// @4C4: istore #36
		// @4C6: iinc #37 +1
		// @4C9: goto @488
		// @4CC: iinc #33 +1
		// @4CF: iload #30
		// @4D1: iload #26
		// @4D3: isub
		// @4D4: istore #30
		// @4D6: iload #23
		// @4D8: getstatic int game.C_100196_rb.field_105819_e
		// @4DB: iadd
		// @4DC: istore #23
		// @4DE: goto @40C
		// @4E1: goto @B81
		// @4E4: iload #27
		// @4E6: ifge @835
		// @4E9: iload #26
		// @4EB: ifne @5C9
		// @4EE: iload #22
		// @4F0: istore #33
		// @4F2: iload #33
		// @4F4: ifge @5C6
		// @4F7: iload #23
		// @4F9: istore #34
		// @4FB: iload #30
		// @4FD: iload #28
		// @4FF: iload #27
		// @501: imul
		// @502: iconst_4
		// @503: ishr
		// @504: iadd
		// @505: istore #35
		// @507: iload #31
		// @509: istore #36
		// @50B: iload #20
		// @50D: istore #37
		// @50F: iload #36
		// @511: ifge @517
		// @514: goto @5B1
		// @517: iload #36
		// @519: aload_0
		// @51A: getfield int game.C_100153_be.field_105304_r
		// @51D: bipush 12 (0x0C)
		// @51F: ishl
		// @520: isub
		// @521: iflt @527
		// @524: goto @5B1
		// @527: iload #35
		// @529: aload_0
		// @52A: getfield int game.C_100153_be.field_105298_m
		// @52D: bipush 12 (0x0C)
		// @52F: ishl
		// @530: isub
		// @531: dup
		// @532: istore #32
		// @534: iflt @559
		// @537: iload #27
		// @539: iload #32
		// @53B: isub
		// @53C: iload #27
		// @53E: idiv
		// @53F: istore #32
		// @541: iload #37
		// @543: iload #32
		// @545: iadd
		// @546: istore #37
		// @548: iload #35
		// @54A: iload #27
		// @54C: iload #32
		// @54E: imul
		// @54F: iadd
		// @550: istore #35
		// @552: iload #34
		// @554: iload #32
		// @556: iadd
		// @557: istore #34
		// @559: iload #35
		// @55B: iload #27
		// @55D: isub
		// @55E: iload #27
		// @560: idiv
		// @561: dup
		// @562: istore #32
		// @564: iload #37
		// @566: if_icmple @56D
		// @569: iload #32
		// @56B: istore #37
		// @56D: iload #37
		// @56F: ifge @5B1
		// @572: aload_0
		// @573: getfield int[] game.C_100153_be.field_105320_t
		// @576: aload_0
		// @577: getfield byte[] game.C_100153_be.field_105319_u
		// @57A: iload #36
		// @57C: bipush 12 (0x0C)
		// @57E: ishr
		// @57F: aload_0
		// @580: getfield int game.C_100153_be.field_105298_m
		// @583: imul
		// @584: iload #35
		// @586: bipush 12 (0x0C)
		// @588: ishr
		// @589: iadd
		// @58A: baload
		// @58B: iaload
		// @58C: istore #38
		// @58E: iload #38
		// @590: ifeq @5A1
		// @593: getstatic int[] game.C_100196_rb.field_105818_d
		// @596: iload #34
		// @598: iinc #34 +1
		// @59B: iload #38
		// @59D: iastore
		// @59E: goto @5A4
		// @5A1: iinc #34 +1
		// @5A4: iload #35
		// @5A6: iload #27
		// @5A8: iadd
		// @5A9: istore #35
		// @5AB: iinc #37 +1
		// @5AE: goto @56D
		// @5B1: iinc #33 +1
		// @5B4: iload #31
		// @5B6: iload #27
		// @5B8: iadd
		// @5B9: istore #31
		// @5BB: iload #23
		// @5BD: getstatic int game.C_100196_rb.field_105819_e
		// @5C0: iadd
		// @5C1: istore #23
		// @5C3: goto @4F2
		// @5C6: goto @B81
		// @5C9: iload #26
		// @5CB: ifge @701
		// @5CE: iload #22
		// @5D0: istore #33
		// @5D2: iload #33
		// @5D4: ifge @6FE
		// @5D7: iload #23
		// @5D9: istore #34
		// @5DB: iload #30
		// @5DD: iload #28
		// @5DF: iload #27
		// @5E1: imul
		// @5E2: iconst_4
		// @5E3: ishr
		// @5E4: iadd
		// @5E5: istore #35
		// @5E7: iload #31
		// @5E9: iload #28
		// @5EB: iload #26
		// @5ED: imul
		// @5EE: iconst_4
		// @5EF: ishr
		// @5F0: iadd
		// @5F1: istore #36
		// @5F3: iload #20
		// @5F5: istore #37
		// @5F7: iload #35
		// @5F9: aload_0
		// @5FA: getfield int game.C_100153_be.field_105298_m
		// @5FD: bipush 12 (0x0C)
		// @5FF: ishl
		// @600: isub
		// @601: dup
		// @602: istore #32
		// @604: iflt @633
		// @607: iload #27
		// @609: iload #32
		// @60B: isub
		// @60C: iload #27
		// @60E: idiv
		// @60F: istore #32
		// @611: iload #37
		// @613: iload #32
		// @615: iadd
		// @616: istore #37
		// @618: iload #35
		// @61A: iload #27
		// @61C: iload #32
		// @61E: imul
		// @61F: iadd
		// @620: istore #35
		// @622: iload #36
		// @624: iload #26
		// @626: iload #32
		// @628: imul
		// @629: iadd
		// @62A: istore #36
		// @62C: iload #34
		// @62E: iload #32
		// @630: iadd
		// @631: istore #34
		// @633: iload #35
		// @635: iload #27
		// @637: isub
		// @638: iload #27
		// @63A: idiv
		// @63B: dup
		// @63C: istore #32
		// @63E: iload #37
		// @640: if_icmple @647
		// @643: iload #32
		// @645: istore #37
		// @647: iload #36
		// @649: aload_0
		// @64A: getfield int game.C_100153_be.field_105304_r
		// @64D: bipush 12 (0x0C)
		// @64F: ishl
		// @650: isub
		// @651: dup
		// @652: istore #32
		// @654: iflt @683
		// @657: iload #26
		// @659: iload #32
		// @65B: isub
		// @65C: iload #26
		// @65E: idiv
		// @65F: istore #32
		// @661: iload #37
		// @663: iload #32
		// @665: iadd
		// @666: istore #37
		// @668: iload #35
		// @66A: iload #27
		// @66C: iload #32
		// @66E: imul
		// @66F: iadd
		// @670: istore #35
		// @672: iload #36
		// @674: iload #26
		// @676: iload #32
		// @678: imul
		// @679: iadd
		// @67A: istore #36
		// @67C: iload #34
		// @67E: iload #32
		// @680: iadd
		// @681: istore #34
		// @683: iload #36
		// @685: iload #26
		// @687: isub
		// @688: iload #26
		// @68A: idiv
		// @68B: dup
		// @68C: istore #32
		// @68E: iload #37
		// @690: if_icmple @697
		// @693: iload #32
		// @695: istore #37
		// @697: iload #37
		// @699: ifge @6E2
		// @69C: aload_0
		// @69D: getfield int[] game.C_100153_be.field_105320_t
		// @6A0: aload_0
		// @6A1: getfield byte[] game.C_100153_be.field_105319_u
		// @6A4: iload #36
		// @6A6: bipush 12 (0x0C)
		// @6A8: ishr
		// @6A9: aload_0
		// @6AA: getfield int game.C_100153_be.field_105298_m
		// @6AD: imul
		// @6AE: iload #35
		// @6B0: bipush 12 (0x0C)
		// @6B2: ishr
		// @6B3: iadd
		// @6B4: baload
		// @6B5: iaload
		// @6B6: istore #38
		// @6B8: iload #38
		// @6BA: ifeq @6CB
		// @6BD: getstatic int[] game.C_100196_rb.field_105818_d
		// @6C0: iload #34
		// @6C2: iinc #34 +1
		// @6C5: iload #38
		// @6C7: iastore
		// @6C8: goto @6CE
		// @6CB: iinc #34 +1
		// @6CE: iload #35
		// @6D0: iload #27
		// @6D2: iadd
		// @6D3: istore #35
		// @6D5: iload #36
		// @6D7: iload #26
		// @6D9: iadd
		// @6DA: istore #36
		// @6DC: iinc #37 +1
		// @6DF: goto @697
		// @6E2: iinc #33 +1
		// @6E5: iload #30
		// @6E7: iload #26
		// @6E9: isub
		// @6EA: istore #30
		// @6EC: iload #31
		// @6EE: iload #27
		// @6F0: iadd
		// @6F1: istore #31
		// @6F3: iload #23
		// @6F5: getstatic int game.C_100196_rb.field_105819_e
		// @6F8: iadd
		// @6F9: istore #23
		// @6FB: goto @5D2
		// @6FE: goto @B81
		// @701: iload #22
		// @703: istore #33
		// @705: iload #33
		// @707: ifge @832
		// @70A: iload #23
		// @70C: istore #34
		// @70E: iload #30
		// @710: iload #28
		// @712: iload #27
		// @714: imul
		// @715: iconst_4
		// @716: ishr
		// @717: iadd
		// @718: istore #35
		// @71A: iload #31
		// @71C: iload #28
		// @71E: iload #26
		// @720: imul
		// @721: iconst_4
		// @722: ishr
		// @723: iadd
		// @724: istore #36
		// @726: iload #20
		// @728: istore #37
		// @72A: iload #35
		// @72C: aload_0
		// @72D: getfield int game.C_100153_be.field_105298_m
		// @730: bipush 12 (0x0C)
		// @732: ishl
		// @733: isub
		// @734: dup
		// @735: istore #32
		// @737: iflt @766
		// @73A: iload #27
		// @73C: iload #32
		// @73E: isub
		// @73F: iload #27
		// @741: idiv
		// @742: istore #32
		// @744: iload #37
		// @746: iload #32
		// @748: iadd
		// @749: istore #37
		// @74B: iload #35
		// @74D: iload #27
		// @74F: iload #32
		// @751: imul
		// @752: iadd
		// @753: istore #35
		// @755: iload #36
		// @757: iload #26
		// @759: iload #32
		// @75B: imul
		// @75C: iadd
		// @75D: istore #36
		// @75F: iload #34
		// @761: iload #32
		// @763: iadd
		// @764: istore #34
		// @766: iload #35
		// @768: iload #27
		// @76A: isub
		// @76B: iload #27
		// @76D: idiv
		// @76E: dup
		// @76F: istore #32
		// @771: iload #37
		// @773: if_icmple @77A
		// @776: iload #32
		// @778: istore #37
		// @77A: iload #36
		// @77C: ifge @7AD
		// @77F: iload #26
		// @781: iconst_1
		// @782: isub
		// @783: iload #36
		// @785: isub
		// @786: iload #26
		// @788: idiv
		// @789: istore #32
		// @78B: iload #37
		// @78D: iload #32
		// @78F: iadd
		// @790: istore #37
		// @792: iload #35
		// @794: iload #27
		// @796: iload #32
		// @798: imul
		// @799: iadd
		// @79A: istore #35
		// @79C: iload #36
		// @79E: iload #26
		// @7A0: iload #32
		// @7A2: imul
		// @7A3: iadd
		// @7A4: istore #36
		// @7A6: iload #34
		// @7A8: iload #32
		// @7AA: iadd
		// @7AB: istore #34
		// @7AD: iconst_1
		// @7AE: iload #36
		// @7B0: iadd
		// @7B1: aload_0
		// @7B2: getfield int game.C_100153_be.field_105304_r
		// @7B5: bipush 12 (0x0C)
		// @7B7: ishl
		// @7B8: isub
		// @7B9: iload #26
		// @7BB: isub
		// @7BC: iload #26
		// @7BE: idiv
		// @7BF: dup
		// @7C0: istore #32
		// @7C2: iload #37
		// @7C4: if_icmple @7CB
		// @7C7: iload #32
		// @7C9: istore #37
		// @7CB: iload #37
		// @7CD: ifge @816
		// @7D0: aload_0
		// @7D1: getfield int[] game.C_100153_be.field_105320_t
		// @7D4: aload_0
		// @7D5: getfield byte[] game.C_100153_be.field_105319_u
		// @7D8: iload #36
		// @7DA: bipush 12 (0x0C)
		// @7DC: ishr
		// @7DD: aload_0
		// @7DE: getfield int game.C_100153_be.field_105298_m
		// @7E1: imul
		// @7E2: iload #35
		// @7E4: bipush 12 (0x0C)
		// @7E6: ishr
		// @7E7: iadd
		// @7E8: baload
		// @7E9: iaload
		// @7EA: istore #38
		// @7EC: iload #38
		// @7EE: ifeq @7FF
		// @7F1: getstatic int[] game.C_100196_rb.field_105818_d
		// @7F4: iload #34
		// @7F6: iinc #34 +1
		// @7F9: iload #38
		// @7FB: iastore
		// @7FC: goto @802
		// @7FF: iinc #34 +1
		// @802: iload #35
		// @804: iload #27
		// @806: iadd
		// @807: istore #35
		// @809: iload #36
		// @80B: iload #26
		// @80D: iadd
		// @80E: istore #36
		// @810: iinc #37 +1
		// @813: goto @7CB
		// @816: iinc #33 +1
		// @819: iload #30
		// @81B: iload #26
		// @81D: isub
		// @81E: istore #30
		// @820: iload #31
		// @822: iload #27
		// @824: iadd
		// @825: istore #31
		// @827: iload #23
		// @829: getstatic int game.C_100196_rb.field_105819_e
		// @82C: iadd
		// @82D: istore #23
		// @82F: goto @705
		// @832: goto @B81
		// @835: iload #26
		// @837: ifne @916
		// @83A: iload #22
		// @83C: istore #33
		// @83E: iload #33
		// @840: ifge @913
		// @843: iload #23
		// @845: istore #34
		// @847: iload #30
		// @849: iload #28
		// @84B: iload #27
		// @84D: imul
		// @84E: iconst_4
		// @84F: ishr
		// @850: iadd
		// @851: istore #35
		// @853: iload #31
		// @855: istore #36
		// @857: iload #20
		// @859: istore #37
		// @85B: iload #36
		// @85D: ifge @863
		// @860: goto @8FE
		// @863: iload #36
		// @865: aload_0
		// @866: getfield int game.C_100153_be.field_105304_r
		// @869: bipush 12 (0x0C)
		// @86B: ishl
		// @86C: isub
		// @86D: iflt @873
		// @870: goto @8FE
		// @873: iload #35
		// @875: ifge @89C
		// @878: iload #27
		// @87A: iconst_1
		// @87B: isub
		// @87C: iload #35
		// @87E: isub
		// @87F: iload #27
		// @881: idiv
		// @882: istore #32
		// @884: iload #37
		// @886: iload #32
		// @888: iadd
		// @889: istore #37
		// @88B: iload #35
		// @88D: iload #27
		// @88F: iload #32
		// @891: imul
		// @892: iadd
		// @893: istore #35
		// @895: iload #34
		// @897: iload #32
		// @899: iadd
		// @89A: istore #34
		// @89C: iconst_1
		// @89D: iload #35
		// @89F: iadd
		// @8A0: aload_0
		// @8A1: getfield int game.C_100153_be.field_105298_m
		// @8A4: bipush 12 (0x0C)
		// @8A6: ishl
		// @8A7: isub
		// @8A8: iload #27
		// @8AA: isub
		// @8AB: iload #27
		// @8AD: idiv
		// @8AE: dup
		// @8AF: istore #32
		// @8B1: iload #37
		// @8B3: if_icmple @8BA
		// @8B6: iload #32
		// @8B8: istore #37
		// @8BA: iload #37
		// @8BC: ifge @8FE
		// @8BF: aload_0
		// @8C0: getfield int[] game.C_100153_be.field_105320_t
		// @8C3: aload_0
		// @8C4: getfield byte[] game.C_100153_be.field_105319_u
		// @8C7: iload #36
		// @8C9: bipush 12 (0x0C)
		// @8CB: ishr
		// @8CC: aload_0
		// @8CD: getfield int game.C_100153_be.field_105298_m
		// @8D0: imul
		// @8D1: iload #35
		// @8D3: bipush 12 (0x0C)
		// @8D5: ishr
		// @8D6: iadd
		// @8D7: baload
		// @8D8: iaload
		// @8D9: istore #38
		// @8DB: iload #38
		// @8DD: ifeq @8EE
		// @8E0: getstatic int[] game.C_100196_rb.field_105818_d
		// @8E3: iload #34
		// @8E5: iinc #34 +1
		// @8E8: iload #38
		// @8EA: iastore
		// @8EB: goto @8F1
		// @8EE: iinc #34 +1
		// @8F1: iload #35
		// @8F3: iload #27
		// @8F5: iadd
		// @8F6: istore #35
		// @8F8: iinc #37 +1
		// @8FB: goto @8BA
		// @8FE: iinc #33 +1
		// @901: iload #31
		// @903: iload #27
		// @905: iadd
		// @906: istore #31
		// @908: iload #23
		// @90A: getstatic int game.C_100196_rb.field_105819_e
		// @90D: iadd
		// @90E: istore #23
		// @910: goto @83E
		// @913: goto @B81
		// @916: iload #26
		// @918: ifge @A4F
		// @91B: iload #22
		// @91D: istore #33
		// @91F: iload #33
		// @921: ifge @A4C
		// @924: iload #23
		// @926: istore #34
		// @928: iload #30
		// @92A: iload #28
		// @92C: iload #27
		// @92E: imul
		// @92F: iconst_4
		// @930: ishr
		// @931: iadd
		// @932: istore #35
		// @934: iload #31
		// @936: iload #28
		// @938: iload #26
		// @93A: imul
		// @93B: iconst_4
		// @93C: ishr
		// @93D: iadd
		// @93E: istore #36
		// @940: iload #20
		// @942: istore #37
		// @944: iload #35
		// @946: ifge @977
		// @949: iload #27
		// @94B: iconst_1
		// @94C: isub
		// @94D: iload #35
		// @94F: isub
		// @950: iload #27
		// @952: idiv
		// @953: istore #32
		// @955: iload #37
		// @957: iload #32
		// @959: iadd
		// @95A: istore #37
		// @95C: iload #35
		// @95E: iload #27
		// @960: iload #32
		// @962: imul
		// @963: iadd
		// @964: istore #35
		// @966: iload #36
		// @968: iload #26
		// @96A: iload #32
		// @96C: imul
		// @96D: iadd
		// @96E: istore #36
		// @970: iload #34
		// @972: iload #32
		// @974: iadd
		// @975: istore #34
		// @977: iconst_1
		// @978: iload #35
		// @97A: iadd
		// @97B: aload_0
		// @97C: getfield int game.C_100153_be.field_105298_m
		// @97F: bipush 12 (0x0C)
		// @981: ishl
		// @982: isub
		// @983: iload #27
		// @985: isub
		// @986: iload #27
		// @988: idiv
		// @989: dup
		// @98A: istore #32
		// @98C: iload #37
		// @98E: if_icmple @995
		// @991: iload #32
		// @993: istore #37
		// @995: iload #36
		// @997: aload_0
		// @998: getfield int game.C_100153_be.field_105304_r
		// @99B: bipush 12 (0x0C)
		// @99D: ishl
		// @99E: isub
		// @99F: dup
		// @9A0: istore #32
		// @9A2: iflt @9D1
		// @9A5: iload #26
		// @9A7: iload #32
		// @9A9: isub
		// @9AA: iload #26
		// @9AC: idiv
		// @9AD: istore #32
		// @9AF: iload #37
		// @9B1: iload #32
		// @9B3: iadd
		// @9B4: istore #37
		// @9B6: iload #35
		// @9B8: iload #27
		// @9BA: iload #32
		// @9BC: imul
		// @9BD: iadd
		// @9BE: istore #35
		// @9C0: iload #36
		// @9C2: iload #26
		// @9C4: iload #32
		// @9C6: imul
		// @9C7: iadd
		// @9C8: istore #36
		// @9CA: iload #34
		// @9CC: iload #32
		// @9CE: iadd
		// @9CF: istore #34
		// @9D1: iload #36
		// @9D3: iload #26
		// @9D5: isub
		// @9D6: iload #26
		// @9D8: idiv
		// @9D9: dup
		// @9DA: istore #32
		// @9DC: iload #37
		// @9DE: if_icmple @9E5
		// @9E1: iload #32
		// @9E3: istore #37
		// @9E5: iload #37
		// @9E7: ifge @A30
		// @9EA: aload_0
		// @9EB: getfield int[] game.C_100153_be.field_105320_t
		// @9EE: aload_0
		// @9EF: getfield byte[] game.C_100153_be.field_105319_u
		// @9F2: iload #36
		// @9F4: bipush 12 (0x0C)
		// @9F6: ishr
		// @9F7: aload_0
		// @9F8: getfield int game.C_100153_be.field_105298_m
		// @9FB: imul
		// @9FC: iload #35
		// @9FE: bipush 12 (0x0C)
		// @A00: ishr
		// @A01: iadd
		// @A02: baload
		// @A03: iaload
		// @A04: istore #38
		// @A06: iload #38
		// @A08: ifeq @A19
		// @A0B: getstatic int[] game.C_100196_rb.field_105818_d
		// @A0E: iload #34
		// @A10: iinc #34 +1
		// @A13: iload #38
		// @A15: iastore
		// @A16: goto @A1C
		// @A19: iinc #34 +1
		// @A1C: iload #35
		// @A1E: iload #27
		// @A20: iadd
		// @A21: istore #35
		// @A23: iload #36
		// @A25: iload #26
		// @A27: iadd
		// @A28: istore #36
		// @A2A: iinc #37 +1
		// @A2D: goto @9E5
		// @A30: iinc #33 +1
		// @A33: iload #30
		// @A35: iload #26
		// @A37: isub
		// @A38: istore #30
		// @A3A: iload #31
		// @A3C: iload #27
		// @A3E: iadd
		// @A3F: istore #31
		// @A41: iload #23
		// @A43: getstatic int game.C_100196_rb.field_105819_e
		// @A46: iadd
		// @A47: istore #23
		// @A49: goto @91F
		// @A4C: goto @B81
		// @A4F: iload #22
		// @A51: istore #33
		// @A53: iload #33
		// @A55: ifge @B81
		// @A58: iload #23
		// @A5A: istore #34
		// @A5C: iload #30
		// @A5E: iload #28
		// @A60: iload #27
		// @A62: imul
		// @A63: iconst_4
		// @A64: ishr
		// @A65: iadd
		// @A66: istore #35
		// @A68: iload #31
		// @A6A: iload #28
		// @A6C: iload #26
		// @A6E: imul
		// @A6F: iconst_4
		// @A70: ishr
		// @A71: iadd
		// @A72: istore #36
		// @A74: iload #20
		// @A76: istore #37
		// @A78: iload #35
		// @A7A: ifge @AAB
		// @A7D: iload #27
		// @A7F: iconst_1
		// @A80: isub
		// @A81: iload #35
		// @A83: isub
		// @A84: iload #27
		// @A86: idiv
		// @A87: istore #32
		// @A89: iload #37
		// @A8B: iload #32
		// @A8D: iadd
		// @A8E: istore #37
		// @A90: iload #35
		// @A92: iload #27
		// @A94: iload #32
		// @A96: imul
		// @A97: iadd
		// @A98: istore #35
		// @A9A: iload #36
		// @A9C: iload #26
		// @A9E: iload #32
		// @AA0: imul
		// @AA1: iadd
		// @AA2: istore #36
		// @AA4: iload #34
		// @AA6: iload #32
		// @AA8: iadd
		// @AA9: istore #34
		// @AAB: iconst_1
		// @AAC: iload #35
		// @AAE: iadd
		// @AAF: aload_0
		// @AB0: getfield int game.C_100153_be.field_105298_m
		// @AB3: bipush 12 (0x0C)
		// @AB5: ishl
		// @AB6: isub
		// @AB7: iload #27
		// @AB9: isub
		// @ABA: iload #27
		// @ABC: idiv
		// @ABD: dup
		// @ABE: istore #32
		// @AC0: iload #37
		// @AC2: if_icmple @AC9
		// @AC5: iload #32
		// @AC7: istore #37
		// @AC9: iload #36
		// @ACB: ifge @AFC
		// @ACE: iload #26
		// @AD0: iconst_1
		// @AD1: isub
		// @AD2: iload #36
		// @AD4: isub
		// @AD5: iload #26
		// @AD7: idiv
		// @AD8: istore #32
		// @ADA: iload #37
		// @ADC: iload #32
		// @ADE: iadd
		// @ADF: istore #37
		// @AE1: iload #35
		// @AE3: iload #27
		// @AE5: iload #32
		// @AE7: imul
		// @AE8: iadd
		// @AE9: istore #35
		// @AEB: iload #36
		// @AED: iload #26
		// @AEF: iload #32
		// @AF1: imul
		// @AF2: iadd
		// @AF3: istore #36
		// @AF5: iload #34
		// @AF7: iload #32
		// @AF9: iadd
		// @AFA: istore #34
		// @AFC: iconst_1
		// @AFD: iload #36
		// @AFF: iadd
		// @B00: aload_0
		// @B01: getfield int game.C_100153_be.field_105304_r
		// @B04: bipush 12 (0x0C)
		// @B06: ishl
		// @B07: isub
		// @B08: iload #26
		// @B0A: isub
		// @B0B: iload #26
		// @B0D: idiv
		// @B0E: dup
		// @B0F: istore #32
		// @B11: iload #37
		// @B13: if_icmple @B1A
		// @B16: iload #32
		// @B18: istore #37
		// @B1A: iload #37
		// @B1C: ifge @B65
		// @B1F: aload_0
		// @B20: getfield int[] game.C_100153_be.field_105320_t
		// @B23: aload_0
		// @B24: getfield byte[] game.C_100153_be.field_105319_u
		// @B27: iload #36
		// @B29: bipush 12 (0x0C)
		// @B2B: ishr
		// @B2C: aload_0
		// @B2D: getfield int game.C_100153_be.field_105298_m
		// @B30: imul
		// @B31: iload #35
		// @B33: bipush 12 (0x0C)
		// @B35: ishr
		// @B36: iadd
		// @B37: baload
		// @B38: iaload
		// @B39: istore #38
		// @B3B: iload #38
		// @B3D: ifeq @B4E
		// @B40: getstatic int[] game.C_100196_rb.field_105818_d
		// @B43: iload #34
		// @B45: iinc #34 +1
		// @B48: iload #38
		// @B4A: iastore
		// @B4B: goto @B51
		// @B4E: iinc #34 +1
		// @B51: iload #35
		// @B53: iload #27
		// @B55: iadd
		// @B56: istore #35
		// @B58: iload #36
		// @B5A: iload #26
		// @B5C: iadd
		// @B5D: istore #36
		// @B5F: iinc #37 +1
		// @B62: goto @B1A
		// @B65: iinc #33 +1
		// @B68: iload #30
		// @B6A: iload #26
		// @B6C: isub
		// @B6D: istore #30
		// @B6F: iload #31
		// @B71: iload #27
		// @B73: iadd
		// @B74: istore #31
		// @B76: iload #23
		// @B78: getstatic int game.C_100196_rb.field_105819_e
		// @B7B: iadd
		// @B7C: istore #23
		// @B7E: goto @A53
		// @B81: return
	}
	
	final void func_105308_a(int arg0, int arg1, int arg2, int arg3)
	{
		// @000: aload_0
		// @001: getfield int game.C_100153_be.field_105298_m
		// @004: istore #5
		// @006: aload_0
		// @007: getfield int game.C_100153_be.field_105304_r
		// @00A: istore #6
		// @00C: iconst_0
		// @00D: istore #7
		// @00F: iconst_0
		// @010: istore #8
		// @012: aload_0
		// @013: getfield int game.C_100153_be.field_105301_h
		// @016: istore #9
		// @018: aload_0
		// @019: getfield int game.C_100153_be.field_105303_s
		// @01C: istore #10
		// @01E: iload #9
		// @020: bipush 16 (0x10)
		// @022: ishl
		// @023: iload_3
		// @024: idiv
		// @025: istore #11
		// @027: iload #10
		// @029: bipush 16 (0x10)
		// @02B: ishl
		// @02C: iload #4
		// @02E: idiv
		// @02F: istore #12
		// @031: aload_0
		// @032: getfield int game.C_100153_be.field_105297_l
		// @035: ifle @060
		// @038: aload_0
		// @039: getfield int game.C_100153_be.field_105297_l
		// @03C: bipush 16 (0x10)
		// @03E: ishl
		// @03F: iload #11
		// @041: iadd
		// @042: iconst_1
		// @043: isub
		// @044: iload #11
		// @046: idiv
		// @047: istore #13
		// @049: iload_1
		// @04A: iload #13
		// @04C: iadd
		// @04D: istore_1
		// @04E: iload #7
		// @050: iload #13
		// @052: iload #11
		// @054: imul
		// @055: aload_0
		// @056: getfield int game.C_100153_be.field_105297_l
		// @059: bipush 16 (0x10)
		// @05B: ishl
		// @05C: isub
		// @05D: iadd
		// @05E: istore #7
		// @060: aload_0
		// @061: getfield int game.C_100153_be.field_105300_k
		// @064: ifle @08F
		// @067: aload_0
		// @068: getfield int game.C_100153_be.field_105300_k
		// @06B: bipush 16 (0x10)
		// @06D: ishl
		// @06E: iload #12
		// @070: iadd
		// @071: iconst_1
		// @072: isub
		// @073: iload #12
		// @075: idiv
		// @076: istore #13
		// @078: iload_2
		// @079: iload #13
		// @07B: iadd
		// @07C: istore_2
		// @07D: iload #8
		// @07F: iload #13
		// @081: iload #12
		// @083: imul
		// @084: aload_0
		// @085: getfield int game.C_100153_be.field_105300_k
		// @088: bipush 16 (0x10)
		// @08A: ishl
		// @08B: isub
		// @08C: iadd
		// @08D: istore #8
		// @08F: iload #5
		// @091: iload #9
		// @093: if_icmpge @0A7
		// @096: iload #5
		// @098: bipush 16 (0x10)
		// @09A: ishl
		// @09B: iload #7
		// @09D: isub
		// @09E: iload #11
		// @0A0: iadd
		// @0A1: iconst_1
		// @0A2: isub
		// @0A3: iload #11
		// @0A5: idiv
		// @0A6: istore_3
		// @0A7: iload #6
		// @0A9: iload #10
		// @0AB: if_icmpge @0C0
		// @0AE: iload #6
		// @0B0: bipush 16 (0x10)
		// @0B2: ishl
		// @0B3: iload #8
		// @0B5: isub
		// @0B6: iload #12
		// @0B8: iadd
		// @0B9: iconst_1
		// @0BA: isub
		// @0BB: iload #12
		// @0BD: idiv
		// @0BE: istore #4
		// @0C0: iload_1
		// @0C1: iload_2
		// @0C2: getstatic int game.C_100196_rb.field_105819_e
		// @0C5: imul
		// @0C6: iadd
		// @0C7: istore #13
		// @0C9: getstatic int game.C_100196_rb.field_105819_e
		// @0CC: iload_3
		// @0CD: isub
		// @0CE: istore #14
		// @0D0: iload_2
		// @0D1: iload #4
		// @0D3: iadd
		// @0D4: getstatic int game.C_100196_rb.field_105823_l
		// @0D7: if_icmple @0E7
		// @0DA: iload #4
		// @0DC: iload_2
		// @0DD: iload #4
		// @0DF: iadd
		// @0E0: getstatic int game.C_100196_rb.field_105823_l
		// @0E3: isub
		// @0E4: isub
		// @0E5: istore #4
		// @0E7: iload_2
		// @0E8: getstatic int game.C_100196_rb.field_105816_f
		// @0EB: if_icmpge @111
		// @0EE: getstatic int game.C_100196_rb.field_105816_f
		// @0F1: iload_2
		// @0F2: isub
		// @0F3: istore #15
		// @0F5: iload #4
		// @0F7: iload #15
		// @0F9: isub
		// @0FA: istore #4
		// @0FC: iload #13
		// @0FE: iload #15
		// @100: getstatic int game.C_100196_rb.field_105819_e
		// @103: imul
		// @104: iadd
		// @105: istore #13
		// @107: iload #8
		// @109: iload #12
		// @10B: iload #15
		// @10D: imul
		// @10E: iadd
		// @10F: istore #8
		// @111: iload_1
		// @112: iload_3
		// @113: iadd
		// @114: getstatic int game.C_100196_rb.field_105820_b
		// @117: if_icmple @12F
		// @11A: iload_1
		// @11B: iload_3
		// @11C: iadd
		// @11D: getstatic int game.C_100196_rb.field_105820_b
		// @120: isub
		// @121: istore #15
		// @123: iload_3
		// @124: iload #15
		// @126: isub
		// @127: istore_3
		// @128: iload #14
		// @12A: iload #15
		// @12C: iadd
		// @12D: istore #14
		// @12F: iload_1
		// @130: getstatic int game.C_100196_rb.field_105827_i
		// @133: if_icmpge @15A
		// @136: getstatic int game.C_100196_rb.field_105827_i
		// @139: iload_1
		// @13A: isub
		// @13B: istore #15
		// @13D: iload_3
		// @13E: iload #15
		// @140: isub
		// @141: istore_3
		// @142: iload #13
		// @144: iload #15
		// @146: iadd
		// @147: istore #13
		// @149: iload #7
		// @14B: iload #11
		// @14D: iload #15
		// @14F: imul
		// @150: iadd
		// @151: istore #7
		// @153: iload #14
		// @155: iload #15
		// @157: iadd
		// @158: istore #14
		// @15A: getstatic int[] game.C_100196_rb.field_105818_d
		// @15D: aload_0
		// @15E: getfield byte[] game.C_100153_be.field_105319_u
		// @161: aload_0
		// @162: getfield int[] game.C_100153_be.field_105320_t
		// @165: iload #7
		// @167: iload #8
		// @169: iload #13
		// @16B: iload #14
		// @16D: iload_3
		// @16E: iload #4
		// @170: iload #11
		// @172: iload #12
		// @174: iload #5
		// @176: invokestatic game.C_100153_be.func_105314_a(int[], byte[], int[], int, int, int, int, int, int, int, int, int)void
		// @179: return
	}
	
	C_100153_be(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7)
	{
		// @00: aload_0
		// @01: invokespecial game.C_100295_kh.<init>()void
		// @04: aload_0
		// @05: iload_1
		// @06: putfield int game.C_100153_be.field_105301_h
		// @09: aload_0
		// @0A: iload_2
		// @0B: putfield int game.C_100153_be.field_105303_s
		// @0E: aload_0
		// @0F: iload_3
		// @10: putfield int game.C_100153_be.field_105297_l
		// @13: aload_0
		// @14: iload #4
		// @16: putfield int game.C_100153_be.field_105300_k
		// @19: aload_0
		// @1A: iload #5
		// @1C: putfield int game.C_100153_be.field_105298_m
		// @1F: aload_0
		// @20: iload #6
		// @22: putfield int game.C_100153_be.field_105304_r
		// @25: aload_0
		// @26: aload #7
		// @28: putfield byte[] game.C_100153_be.field_105319_u
		// @2B: aload_0
		// @2C: aload #8
		// @2E: putfield int[] game.C_100153_be.field_105320_t
		// @31: return
	}
	
	final void func_105318_c(int arg0, int arg1)
	{
		// @000: aload_0
		// @001: getfield int game.C_100153_be.field_105298_m
		// @004: iconst_1
		// @005: ishr
		// @006: istore_3
		// @007: aload_0
		// @008: getfield int game.C_100153_be.field_105304_r
		// @00B: iconst_1
		// @00C: ishr
		// @00D: istore #4
		// @00F: iload_1
		// @010: aload_0
		// @011: getfield int game.C_100153_be.field_105297_l
		// @014: iconst_2
		// @015: idiv
		// @016: iadd
		// @017: istore_1
		// @018: iload_2
		// @019: aload_0
		// @01A: getfield int game.C_100153_be.field_105300_k
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
		// @04B: getfield int game.C_100153_be.field_105298_m
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
		// @07D: getfield int game.C_100153_be.field_105304_r
		// @080: iconst_2
		// @081: isub
		// @082: istore #8
		// @084: iconst_4
		// @085: newarray int[]
		// @087: astore #9
		// @089: iload #7
		// @08B: istore #10
		// @08D: iload #10
		// @08F: iload #8
		// @091: if_icmpgt @198
		// @094: iload #5
		// @096: istore #11
		// @098: iload #11
		// @09A: iload #6
		// @09C: if_icmpgt @192
		// @09F: iload #10
		// @0A1: aload_0
		// @0A2: getfield int game.C_100153_be.field_105298_m
		// @0A5: imul
		// @0A6: iload #11
		// @0A8: iadd
		// @0A9: istore #12
		// @0AB: iload_2
		// @0AC: iload #10
		// @0AE: iconst_1
		// @0AF: ishr
		// @0B0: iadd
		// @0B1: getstatic int game.C_100196_rb.field_105819_e
		// @0B4: imul
		// @0B5: iload_1
		// @0B6: iload #11
		// @0B8: iconst_1
		// @0B9: ishr
		// @0BA: iadd
		// @0BB: iadd
		// @0BC: istore #13
		// @0BE: aload #9
		// @0C0: iconst_0
		// @0C1: aload_0
		// @0C2: getfield int[] game.C_100153_be.field_105320_t
		// @0C5: aload_0
		// @0C6: getfield byte[] game.C_100153_be.field_105319_u
		// @0C9: iload #12
		// @0CB: baload
		// @0CC: sipush 255 (0x00FF)
		// @0CF: iand
		// @0D0: iaload
		// @0D1: iastore
		// @0D2: aload #9
		// @0D4: iconst_1
		// @0D5: aload_0
		// @0D6: getfield int[] game.C_100153_be.field_105320_t
		// @0D9: aload_0
		// @0DA: getfield byte[] game.C_100153_be.field_105319_u
		// @0DD: iload #12
		// @0DF: iconst_1
		// @0E0: iadd
		// @0E1: baload
		// @0E2: sipush 255 (0x00FF)
		// @0E5: iand
		// @0E6: iaload
		// @0E7: iastore
		// @0E8: aload #9
		// @0EA: iconst_2
		// @0EB: aload_0
		// @0EC: getfield int[] game.C_100153_be.field_105320_t
		// @0EF: aload_0
		// @0F0: getfield byte[] game.C_100153_be.field_105319_u
		// @0F3: iload #12
		// @0F5: aload_0
		// @0F6: getfield int game.C_100153_be.field_105298_m
		// @0F9: iadd
		// @0FA: baload
		// @0FB: sipush 255 (0x00FF)
		// @0FE: iand
		// @0FF: iaload
		// @100: iastore
		// @101: aload #9
		// @103: iconst_3
		// @104: aload_0
		// @105: getfield int[] game.C_100153_be.field_105320_t
		// @108: aload_0
		// @109: getfield byte[] game.C_100153_be.field_105319_u
		// @10C: iload #12
		// @10E: iconst_1
		// @10F: iadd
		// @110: baload
		// @111: sipush 255 (0x00FF)
		// @114: iand
		// @115: iaload
		// @116: iastore
		// @117: iconst_0
		// @118: istore #14
		// @11A: iconst_0
		// @11B: istore #15
		// @11D: iconst_0
		// @11E: istore #16
		// @120: iconst_0
		// @121: istore #17
		// @123: iload #17
		// @125: iconst_4
		// @126: if_icmpge @172
		// @129: aload #9
		// @12B: iload #17
		// @12D: iaload
		// @12E: ifne @13C
		// @131: aload #9
		// @133: iload #17
		// @135: getstatic int[] game.C_100196_rb.field_105818_d
		// @138: iload #13
		// @13A: iaload
		// @13B: iastore
		// @13C: iload #14
		// @13E: aload #9
		// @140: iload #17
		// @142: iaload
		// @143: bipush 16 (0x10)
		// @145: ishr
		// @146: sipush 255 (0x00FF)
		// @149: iand
		// @14A: iadd
		// @14B: istore #14
		// @14D: iload #15
		// @14F: aload #9
		// @151: iload #17
		// @153: iaload
		// @154: bipush 8 (0x08)
		// @156: ishr
		// @157: sipush 255 (0x00FF)
		// @15A: iand
		// @15B: iadd
		// @15C: istore #15
		// @15E: iload #16
		// @160: aload #9
		// @162: iload #17
		// @164: iaload
		// @165: sipush 255 (0x00FF)
		// @168: iand
		// @169: iadd
		// @16A: istore #16
		// @16C: iinc #17 +1
		// @16F: goto @123
		// @172: getstatic int[] game.C_100196_rb.field_105818_d
		// @175: iload #13
		// @177: iload #14
		// @179: iconst_2
		// @17A: ishr
		// @17B: bipush 16 (0x10)
		// @17D: ishl
		// @17E: iload #15
		// @180: iconst_2
		// @181: ishr
		// @182: bipush 8 (0x08)
		// @184: ishl
		// @185: ior
		// @186: iload #16
		// @188: iconst_2
		// @189: ishr
		// @18A: ior
		// @18B: iastore
		// @18C: iinc #11 +2
		// @18F: goto @098
		// @192: iinc #10 +2
		// @195: goto @08D
		// @198: return
	}
	
	final void func_105287_a(int arg0, int arg1, int arg2)
	{
		// @00: iload_1
		// @01: aload_0
		// @02: getfield int game.C_100153_be.field_105297_l
		// @05: iadd
		// @06: istore_1
		// @07: iload_2
		// @08: aload_0
		// @09: getfield int game.C_100153_be.field_105300_k
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
		// @1B: getfield int game.C_100153_be.field_105304_r
		// @1E: istore #6
		// @20: aload_0
		// @21: getfield int game.C_100153_be.field_105298_m
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
		// @E3: getfield byte[] game.C_100153_be.field_105319_u
		// @E6: aload_0
		// @E7: getfield int[] game.C_100153_be.field_105320_t
		// @EA: iload #5
		// @EC: iload #4
		// @EE: iload #7
		// @F0: iload #6
		// @F2: iload #8
		// @F4: iload #9
		// @F6: iload_3
		// @F7: invokestatic game.C_100153_be.func_105317_b(int[], byte[], int[], int, int, int, int, int, int, int)void
		// @FA: return
	}
	
	final void func_105312_b(int arg0, int arg1)
	{
		// @000: aload_0
		// @001: getfield int game.C_100153_be.field_105298_m
		// @004: iconst_2
		// @005: ishr
		// @006: istore_3
		// @007: aload_0
		// @008: getfield int game.C_100153_be.field_105304_r
		// @00B: iconst_2
		// @00C: ishr
		// @00D: istore #4
		// @00F: iload_1
		// @010: aload_0
		// @011: getfield int game.C_100153_be.field_105297_l
		// @014: iconst_4
		// @015: idiv
		// @016: iadd
		// @017: istore_1
		// @018: iload_2
		// @019: aload_0
		// @01A: getfield int game.C_100153_be.field_105300_k
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
		// @04B: getfield int game.C_100153_be.field_105298_m
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
		// @07D: getfield int game.C_100153_be.field_105304_r
		// @080: iconst_4
		// @081: isub
		// @082: istore #8
		// @084: iload #7
		// @086: istore #9
		// @088: iload #9
		// @08A: iload #8
		// @08C: if_icmpgt @13D
		// @08F: iload #5
		// @091: istore #10
		// @093: iload #10
		// @095: iload #6
		// @097: if_icmpgt @137
		// @09A: iload #9
		// @09C: aload_0
		// @09D: getfield int game.C_100153_be.field_105298_m
		// @0A0: imul
		// @0A1: iload #10
		// @0A3: iadd
		// @0A4: istore #11
		// @0A6: iload_2
		// @0A7: iload #9
		// @0A9: iconst_2
		// @0AA: ishr
		// @0AB: iadd
		// @0AC: getstatic int game.C_100196_rb.field_105819_e
		// @0AF: imul
		// @0B0: iload_1
		// @0B1: iload #10
		// @0B3: iconst_2
		// @0B4: ishr
		// @0B5: iadd
		// @0B6: iadd
		// @0B7: istore #12
		// @0B9: iconst_0
		// @0BA: istore #13
		// @0BC: iconst_0
		// @0BD: istore #14
		// @0BF: iconst_0
		// @0C0: istore #15
		// @0C2: iconst_0
		// @0C3: istore #16
		// @0C5: iload #16
		// @0C7: iconst_4
		// @0C8: if_icmpge @11E
		// @0CB: iconst_0
		// @0CC: istore #17
		// @0CE: iload #17
		// @0D0: iconst_4
		// @0D1: if_icmpge @118
		// @0D4: aload_0
		// @0D5: getfield int[] game.C_100153_be.field_105320_t
		// @0D8: aload_0
		// @0D9: getfield byte[] game.C_100153_be.field_105319_u
		// @0DC: iload #11
		// @0DE: iload #16
		// @0E0: aload_0
		// @0E1: getfield int game.C_100153_be.field_105298_m
		// @0E4: imul
		// @0E5: iadd
		// @0E6: iload #17
		// @0E8: iadd
		// @0E9: baload
		// @0EA: sipush 255 (0x00FF)
		// @0ED: iand
		// @0EE: iaload
		// @0EF: istore #13
		// @0F1: iload #13
		// @0F3: ifne @0FE
		// @0F6: getstatic int[] game.C_100196_rb.field_105818_d
		// @0F9: iload #12
		// @0FB: iaload
		// @0FC: istore #13
		// @0FE: iload #14
		// @100: iload #13
		// @102: ldc 16711935 (0xff00ff)
		// @104: iand
		// @105: iadd
		// @106: istore #14
		// @108: iload #15
		// @10A: iload #13
		// @10C: ldc 65280 (0xff00)
		// @10E: iand
		// @10F: iadd
		// @110: istore #15
		// @112: iinc #17 +1
		// @115: goto @0CE
		// @118: iinc #16 +1
		// @11B: goto @0C5
		// @11E: getstatic int[] game.C_100196_rb.field_105818_d
		// @121: iload #12
		// @123: iload #14
		// @125: ldc 267390960 (0xff00ff0)
		// @127: iand
		// @128: iload #15
		// @12A: ldc 1044480 (0xff000)
		// @12C: iand
		// @12D: ior
		// @12E: iconst_4
		// @12F: ishr
		// @130: iastore
		// @131: iinc #10 +4
		// @134: goto @093
		// @137: iinc #9 +4
		// @13A: goto @088
		// @13D: return
	}
	
	C_100153_be(int arg0, int arg1, int arg2)
	{
		// @00: aload_0
		// @01: invokespecial game.C_100295_kh.<init>()void
		// @04: aload_0
		// @05: aload_0
		// @06: iload_1
		// @07: dup_x1
		// @08: putfield int game.C_100153_be.field_105298_m
		// @0B: putfield int game.C_100153_be.field_105301_h
		// @0E: aload_0
		// @0F: aload_0
		// @10: iload_2
		// @11: dup_x1
		// @12: putfield int game.C_100153_be.field_105304_r
		// @15: putfield int game.C_100153_be.field_105303_s
		// @18: aload_0
		// @19: iconst_0
		// @1A: putfield int game.C_100153_be.field_105300_k
		// @1D: aload_0
		// @1E: iconst_0
		// @1F: putfield int game.C_100153_be.field_105297_l
		// @22: aload_0
		// @23: iload_1
		// @24: iload_2
		// @25: imul
		// @26: newarray byte[]
		// @28: putfield byte[] game.C_100153_be.field_105319_u
		// @2B: aload_0
		// @2C: iload_3
		// @2D: newarray int[]
		// @2F: putfield int[] game.C_100153_be.field_105320_t
		// @32: return
	}
}
