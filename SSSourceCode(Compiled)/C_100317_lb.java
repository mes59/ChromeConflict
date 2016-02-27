package game;

final class C_100317_lb extends C_100112_r
{
	private byte[][] field_101788_J;
	
	private static final void func_101785_a(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int[] arg11, int[] arg12)
	{
		// @00: iload_2
		// @01: getstatic int game.C_100196_rb.field_105827_i
		// @04: isub
		// @05: istore #13
		// @07: iload_3
		// @08: getstatic int game.C_100196_rb.field_105816_f
		// @0B: isub
		// @0C: istore #14
		// @0E: iload #14
		// @10: istore #15
		// @12: iload #15
		// @14: iload #14
		// @16: iload #5
		// @18: iadd
		// @19: if_icmpge @FB
		// @1C: aload #11
		// @1E: iload #15
		// @20: iaload
		// @21: istore #16
		// @23: aload #12
		// @25: iload #15
		// @27: iaload
		// @28: istore #17
		// @2A: iload #4
		// @2C: istore #18
		// @2E: iload #13
		// @30: iload #16
		// @32: if_icmple @64
		// @35: iload #13
		// @37: iload #16
		// @39: isub
		// @3A: istore #19
		// @3C: iload #19
		// @3E: iload #17
		// @40: if_icmplt @5A
		// @43: iload #7
		// @45: iload #4
		// @47: iload #10
		// @49: iadd
		// @4A: iadd
		// @4B: istore #7
		// @4D: iload #8
		// @4F: iload #4
		// @51: iload #9
		// @53: iadd
		// @54: iadd
		// @55: istore #8
		// @57: goto @F5
		// @5A: iload #17
		// @5C: iload #19
		// @5E: isub
		// @5F: istore #17
		// @61: goto @9E
		// @64: iload #16
		// @66: iload #13
		// @68: isub
		// @69: istore #19
		// @6B: iload #19
		// @6D: iload #4
		// @6F: if_icmplt @89
		// @72: iload #7
		// @74: iload #4
		// @76: iload #10
		// @78: iadd
		// @79: iadd
		// @7A: istore #7
		// @7C: iload #8
		// @7E: iload #4
		// @80: iload #9
		// @82: iadd
		// @83: iadd
		// @84: istore #8
		// @86: goto @F5
		// @89: iload #7
		// @8B: iload #19
		// @8D: iadd
		// @8E: istore #7
		// @90: iload #18
		// @92: iload #19
		// @94: isub
		// @95: istore #18
		// @97: iload #8
		// @99: iload #19
		// @9B: iadd
		// @9C: istore #8
		// @9E: iconst_0
		// @9F: istore #19
		// @A1: iload #18
		// @A3: iload #17
		// @A5: if_icmpge @AF
		// @A8: iload #18
		// @AA: istore #17
		// @AC: goto @B6
		// @AF: iload #18
		// @B1: iload #17
		// @B3: isub
		// @B4: istore #19
		// @B6: iload #17
		// @B8: ineg
		// @B9: istore #20
		// @BB: iload #20
		// @BD: ifge @E1
		// @C0: aload_1
		// @C1: iload #7
		// @C3: iinc #7 +1
		// @C6: baload
		// @C7: ifeq @D8
		// @CA: getstatic int[] game.C_100196_rb.field_105818_d
		// @CD: iload #8
		// @CF: iinc #8 +1
		// @D2: iload #6
		// @D4: iastore
		// @D5: goto @DB
		// @D8: iinc #8 +1
		// @DB: iinc #20 +1
		// @DE: goto @BB
		// @E1: iload #7
		// @E3: iload #19
		// @E5: iload #10
		// @E7: iadd
		// @E8: iadd
		// @E9: istore #7
		// @EB: iload #8
		// @ED: iload #19
		// @EF: iload #9
		// @F1: iadd
		// @F2: iadd
		// @F3: istore #8
		// @F5: iinc #15 +1
		// @F8: goto @12
		// @FB: return
	}
	
	final void func_101723_a(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7)
	{
		// @00: iload_2
		// @01: iload_3
		// @02: getstatic int game.C_100196_rb.field_105819_e
		// @05: imul
		// @06: iadd
		// @07: istore #9
		// @09: getstatic int game.C_100196_rb.field_105819_e
		// @0C: iload #4
		// @0E: isub
		// @0F: istore #10
		// @11: iconst_0
		// @12: istore #11
		// @14: iconst_0
		// @15: istore #12
		// @17: iload_3
		// @18: getstatic int game.C_100196_rb.field_105816_f
		// @1B: if_icmpge @45
		// @1E: getstatic int game.C_100196_rb.field_105816_f
		// @21: iload_3
		// @22: isub
		// @23: istore #13
		// @25: iload #5
		// @27: iload #13
		// @29: isub
		// @2A: istore #5
		// @2C: getstatic int game.C_100196_rb.field_105816_f
		// @2F: istore_3
		// @30: iload #12
		// @32: iload #13
		// @34: iload #4
		// @36: imul
		// @37: iadd
		// @38: istore #12
		// @3A: iload #9
		// @3C: iload #13
		// @3E: getstatic int game.C_100196_rb.field_105819_e
		// @41: imul
		// @42: iadd
		// @43: istore #9
		// @45: iload_3
		// @46: iload #5
		// @48: iadd
		// @49: getstatic int game.C_100196_rb.field_105823_l
		// @4C: if_icmple @5C
		// @4F: iload #5
		// @51: iload_3
		// @52: iload #5
		// @54: iadd
		// @55: getstatic int game.C_100196_rb.field_105823_l
		// @58: isub
		// @59: isub
		// @5A: istore #5
		// @5C: iload_2
		// @5D: getstatic int game.C_100196_rb.field_105827_i
		// @60: if_icmpge @91
		// @63: getstatic int game.C_100196_rb.field_105827_i
		// @66: iload_2
		// @67: isub
		// @68: istore #13
		// @6A: iload #4
		// @6C: iload #13
		// @6E: isub
		// @6F: istore #4
		// @71: getstatic int game.C_100196_rb.field_105827_i
		// @74: istore_2
		// @75: iload #12
		// @77: iload #13
		// @79: iadd
		// @7A: istore #12
		// @7C: iload #9
		// @7E: iload #13
		// @80: iadd
		// @81: istore #9
		// @83: iload #11
		// @85: iload #13
		// @87: iadd
		// @88: istore #11
		// @8A: iload #10
		// @8C: iload #13
		// @8E: iadd
		// @8F: istore #10
		// @91: iload_2
		// @92: iload #4
		// @94: iadd
		// @95: getstatic int game.C_100196_rb.field_105820_b
		// @98: if_icmple @BA
		// @9B: iload_2
		// @9C: iload #4
		// @9E: iadd
		// @9F: getstatic int game.C_100196_rb.field_105820_b
		// @A2: isub
		// @A3: istore #13
		// @A5: iload #4
		// @A7: iload #13
		// @A9: isub
		// @AA: istore #4
		// @AC: iload #11
		// @AE: iload #13
		// @B0: iadd
		// @B1: istore #11
		// @B3: iload #10
		// @B5: iload #13
		// @B7: iadd
		// @B8: istore #10
		// @BA: iload #4
		// @BC: ifle @C4
		// @BF: iload #5
		// @C1: ifgt @C5
		// @C4: return
		// @C5: getstatic int[] game.C_100196_rb.field_105818_d
		// @C8: aload_0
		// @C9: getfield byte[][] game.C_100317_lb.field_101788_J
		// @CC: iload_1
		// @CD: aaload
		// @CE: iload #6
		// @D0: iload #12
		// @D2: iload #9
		// @D4: iload #4
		// @D6: iload #5
		// @D8: iload #10
		// @DA: iload #11
		// @DC: iload #7
		// @DE: invokestatic game.C_100317_lb.func_101786_a(int[], byte[], int, int, int, int, int, int, int, int)void
		// @E1: return
	}
	
	C_100317_lb(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5)
	{
		// @00: aload_0
		// @01: aload_1
		// @02: aload_2
		// @03: aload_3
		// @04: aload #4
		// @06: aload #5
		// @08: invokespecial game.C_100112_r.<init>(byte[], int[], int[], int[], int[])void
		// @0B: aload_0
		// @0C: sipush 256 (0x0100)
		// @0F: anewarray byte[]
		// @12: putfield byte[][] game.C_100317_lb.field_101788_J
		// @15: aload_0
		// @16: aload #6
		// @18: putfield byte[][] game.C_100317_lb.field_101788_J
		// @1B: return
	}
	
	final void func_101733_a(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6)
	{
		// @000: iload_2
		// @001: iload_3
		// @002: getstatic int game.C_100196_rb.field_105819_e
		// @005: imul
		// @006: iadd
		// @007: istore #8
		// @009: getstatic int game.C_100196_rb.field_105819_e
		// @00C: iload #4
		// @00E: isub
		// @00F: istore #9
		// @011: iconst_0
		// @012: istore #10
		// @014: iconst_0
		// @015: istore #11
		// @017: iload_3
		// @018: getstatic int game.C_100196_rb.field_105816_f
		// @01B: if_icmpge @045
		// @01E: getstatic int game.C_100196_rb.field_105816_f
		// @021: iload_3
		// @022: isub
		// @023: istore #12
		// @025: iload #5
		// @027: iload #12
		// @029: isub
		// @02A: istore #5
		// @02C: getstatic int game.C_100196_rb.field_105816_f
		// @02F: istore_3
		// @030: iload #11
		// @032: iload #12
		// @034: iload #4
		// @036: imul
		// @037: iadd
		// @038: istore #11
		// @03A: iload #8
		// @03C: iload #12
		// @03E: getstatic int game.C_100196_rb.field_105819_e
		// @041: imul
		// @042: iadd
		// @043: istore #8
		// @045: iload_3
		// @046: iload #5
		// @048: iadd
		// @049: getstatic int game.C_100196_rb.field_105823_l
		// @04C: if_icmple @05C
		// @04F: iload #5
		// @051: iload_3
		// @052: iload #5
		// @054: iadd
		// @055: getstatic int game.C_100196_rb.field_105823_l
		// @058: isub
		// @059: isub
		// @05A: istore #5
		// @05C: iload_2
		// @05D: getstatic int game.C_100196_rb.field_105827_i
		// @060: if_icmpge @091
		// @063: getstatic int game.C_100196_rb.field_105827_i
		// @066: iload_2
		// @067: isub
		// @068: istore #12
		// @06A: iload #4
		// @06C: iload #12
		// @06E: isub
		// @06F: istore #4
		// @071: getstatic int game.C_100196_rb.field_105827_i
		// @074: istore_2
		// @075: iload #11
		// @077: iload #12
		// @079: iadd
		// @07A: istore #11
		// @07C: iload #8
		// @07E: iload #12
		// @080: iadd
		// @081: istore #8
		// @083: iload #10
		// @085: iload #12
		// @087: iadd
		// @088: istore #10
		// @08A: iload #9
		// @08C: iload #12
		// @08E: iadd
		// @08F: istore #9
		// @091: iload_2
		// @092: iload #4
		// @094: iadd
		// @095: getstatic int game.C_100196_rb.field_105820_b
		// @098: if_icmple @0BA
		// @09B: iload_2
		// @09C: iload #4
		// @09E: iadd
		// @09F: getstatic int game.C_100196_rb.field_105820_b
		// @0A2: isub
		// @0A3: istore #12
		// @0A5: iload #4
		// @0A7: iload #12
		// @0A9: isub
		// @0AA: istore #4
		// @0AC: iload #10
		// @0AE: iload #12
		// @0B0: iadd
		// @0B1: istore #10
		// @0B3: iload #9
		// @0B5: iload #12
		// @0B7: iadd
		// @0B8: istore #9
		// @0BA: iload #4
		// @0BC: ifle @0C4
		// @0BF: iload #5
		// @0C1: ifgt @0C5
		// @0C4: return
		// @0C5: getstatic int[] game.C_100196_rb.field_105825_k
		// @0C8: ifnull @0F0
		// @0CB: getstatic int[] game.C_100196_rb.field_105818_d
		// @0CE: aload_0
		// @0CF: getfield byte[][] game.C_100317_lb.field_101788_J
		// @0D2: iload_1
		// @0D3: aaload
		// @0D4: iload_2
		// @0D5: iload_3
		// @0D6: iload #4
		// @0D8: iload #5
		// @0DA: iload #6
		// @0DC: iload #11
		// @0DE: iload #8
		// @0E0: iload #9
		// @0E2: iload #10
		// @0E4: getstatic int[] game.C_100196_rb.field_105825_k
		// @0E7: getstatic int[] game.C_100196_rb.field_105824_j
		// @0EA: invokestatic game.C_100317_lb.func_101785_a(int[], byte[], int, int, int, int, int, int, int, int, int, int[], int[])void
		// @0ED: goto @10A
		// @0F0: getstatic int[] game.C_100196_rb.field_105818_d
		// @0F3: aload_0
		// @0F4: getfield byte[][] game.C_100317_lb.field_101788_J
		// @0F7: iload_1
		// @0F8: aaload
		// @0F9: iload #6
		// @0FB: iload #11
		// @0FD: iload #8
		// @0FF: iload #4
		// @101: iload #5
		// @103: iload #9
		// @105: iload #10
		// @107: invokestatic game.C_100317_lb.func_101787_a(int[], byte[], int, int, int, int, int, int, int)void
		// @10A: return
	}
	
	static final void func_101786_a(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9)
	{
		// @00: iload_2
		// @01: ldc 16711935 (0xff00ff)
		// @03: iand
		// @04: iload #9
		// @06: imul
		// @07: ldc -16711936 (0xff00ff00)
		// @09: iand
		// @0A: iload_2
		// @0B: ldc 65280 (0xff00)
		// @0D: iand
		// @0E: iload #9
		// @10: imul
		// @11: ldc 16711680 (0xff0000)
		// @13: iand
		// @14: iadd
		// @15: bipush 8 (0x08)
		// @17: ishr
		// @18: istore_2
		// @19: sipush 256 (0x0100)
		// @1C: iload #9
		// @1E: isub
		// @1F: istore #9
		// @21: iload #6
		// @23: ineg
		// @24: istore #10
		// @26: iload #10
		// @28: ifge @85
		// @2B: iload #5
		// @2D: ineg
		// @2E: istore #11
		// @30: iload #11
		// @32: ifge @73
		// @35: aload_1
		// @36: iload_3
		// @37: iinc #3 +1
		// @3A: baload
		// @3B: ifeq @6A
		// @3E: aload_0
		// @3F: iload #4
		// @41: iaload
		// @42: istore #12
		// @44: aload_0
		// @45: iload #4
		// @47: iinc #4 +1
		// @4A: iload #12
		// @4C: ldc 16711935 (0xff00ff)
		// @4E: iand
		// @4F: iload #9
		// @51: imul
		// @52: ldc -16711936 (0xff00ff00)
		// @54: iand
		// @55: iload #12
		// @57: ldc 65280 (0xff00)
		// @59: iand
		// @5A: iload #9
		// @5C: imul
		// @5D: ldc 16711680 (0xff0000)
		// @5F: iand
		// @60: iadd
		// @61: bipush 8 (0x08)
		// @63: ishr
		// @64: iload_2
		// @65: iadd
		// @66: iastore
		// @67: goto @6D
		// @6A: iinc #4 +1
		// @6D: iinc #11 +1
		// @70: goto @30
		// @73: iload #4
		// @75: iload #7
		// @77: iadd
		// @78: istore #4
		// @7A: iload_3
		// @7B: iload #8
		// @7D: iadd
		// @7E: istore_3
		// @7F: iinc #10 +1
		// @82: goto @26
		// @85: return
	}
	
	static final void func_101787_a(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8)
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
		// @15: ifge @BB
		// @18: iload #9
		// @1A: istore #11
		// @1C: iload #11
		// @1E: ifge @83
		// @21: aload_1
		// @22: iload_3
		// @23: iinc #3 +1
		// @26: baload
		// @27: ifeq @35
		// @2A: aload_0
		// @2B: iload #4
		// @2D: iinc #4 +1
		// @30: iload_2
		// @31: iastore
		// @32: goto @38
		// @35: iinc #4 +1
		// @38: aload_1
		// @39: iload_3
		// @3A: iinc #3 +1
		// @3D: baload
		// @3E: ifeq @4C
		// @41: aload_0
		// @42: iload #4
		// @44: iinc #4 +1
		// @47: iload_2
		// @48: iastore
		// @49: goto @4F
		// @4C: iinc #4 +1
		// @4F: aload_1
		// @50: iload_3
		// @51: iinc #3 +1
		// @54: baload
		// @55: ifeq @63
		// @58: aload_0
		// @59: iload #4
		// @5B: iinc #4 +1
		// @5E: iload_2
		// @5F: iastore
		// @60: goto @66
		// @63: iinc #4 +1
		// @66: aload_1
		// @67: iload_3
		// @68: iinc #3 +1
		// @6B: baload
		// @6C: ifeq @7A
		// @6F: aload_0
		// @70: iload #4
		// @72: iinc #4 +1
		// @75: iload_2
		// @76: iastore
		// @77: goto @7D
		// @7A: iinc #4 +1
		// @7D: iinc #11 +1
		// @80: goto @1C
		// @83: iload #5
		// @85: istore #11
		// @87: iload #11
		// @89: ifge @A9
		// @8C: aload_1
		// @8D: iload_3
		// @8E: iinc #3 +1
		// @91: baload
		// @92: ifeq @A0
		// @95: aload_0
		// @96: iload #4
		// @98: iinc #4 +1
		// @9B: iload_2
		// @9C: iastore
		// @9D: goto @A3
		// @A0: iinc #4 +1
		// @A3: iinc #11 +1
		// @A6: goto @87
		// @A9: iload #4
		// @AB: iload #7
		// @AD: iadd
		// @AE: istore #4
		// @B0: iload_3
		// @B1: iload #8
		// @B3: iadd
		// @B4: istore_3
		// @B5: iinc #10 +1
		// @B8: goto @13
		// @BB: return
	}
}
