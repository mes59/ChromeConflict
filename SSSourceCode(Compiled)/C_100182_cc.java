package game;

final class C_100182_cc extends C_100112_r
{
	private int[][] field_101779_R;
	private byte[][] field_101780_J;
	
	private static final void func_101778_a(int arg0, int[] arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9)
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
		// @21: aload_2
		// @22: iload #4
		// @24: iinc #4 +1
		// @27: baload
		// @28: dup
		// @29: istore_0
		// @2A: ifeq @3E
		// @2D: aload_1
		// @2E: iload #5
		// @30: iinc #5 +1
		// @33: aload_3
		// @34: iload_0
		// @35: sipush 255 (0x00FF)
		// @38: iand
		// @39: iaload
		// @3A: iastore
		// @3B: goto @41
		// @3E: iinc #5 +1
		// @41: aload_2
		// @42: iload #4
		// @44: iinc #4 +1
		// @47: baload
		// @48: dup
		// @49: istore_0
		// @4A: ifeq @5E
		// @4D: aload_1
		// @4E: iload #5
		// @50: iinc #5 +1
		// @53: aload_3
		// @54: iload_0
		// @55: sipush 255 (0x00FF)
		// @58: iand
		// @59: iaload
		// @5A: iastore
		// @5B: goto @61
		// @5E: iinc #5 +1
		// @61: aload_2
		// @62: iload #4
		// @64: iinc #4 +1
		// @67: baload
		// @68: dup
		// @69: istore_0
		// @6A: ifeq @7E
		// @6D: aload_1
		// @6E: iload #5
		// @70: iinc #5 +1
		// @73: aload_3
		// @74: iload_0
		// @75: sipush 255 (0x00FF)
		// @78: iand
		// @79: iaload
		// @7A: iastore
		// @7B: goto @81
		// @7E: iinc #5 +1
		// @81: aload_2
		// @82: iload #4
		// @84: iinc #4 +1
		// @87: baload
		// @88: dup
		// @89: istore_0
		// @8A: ifeq @9E
		// @8D: aload_1
		// @8E: iload #5
		// @90: iinc #5 +1
		// @93: aload_3
		// @94: iload_0
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
		// @B0: aload_2
		// @B1: iload #4
		// @B3: iinc #4 +1
		// @B6: baload
		// @B7: dup
		// @B8: istore_0
		// @B9: ifeq @CD
		// @BC: aload_1
		// @BD: iload #5
		// @BF: iinc #5 +1
		// @C2: aload_3
		// @C3: iload_0
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
	
	final void func_101723_a(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7)
	{
		// @000: iload_2
		// @001: iload_3
		// @002: getstatic int game.C_100196_rb.field_105819_e
		// @005: imul
		// @006: iadd
		// @007: istore #9
		// @009: getstatic int game.C_100196_rb.field_105819_e
		// @00C: iload #4
		// @00E: isub
		// @00F: istore #10
		// @011: iconst_0
		// @012: istore #11
		// @014: iconst_0
		// @015: istore #12
		// @017: iload_3
		// @018: getstatic int game.C_100196_rb.field_105816_f
		// @01B: if_icmpge @045
		// @01E: getstatic int game.C_100196_rb.field_105816_f
		// @021: iload_3
		// @022: isub
		// @023: istore #13
		// @025: iload #5
		// @027: iload #13
		// @029: isub
		// @02A: istore #5
		// @02C: getstatic int game.C_100196_rb.field_105816_f
		// @02F: istore_3
		// @030: iload #12
		// @032: iload #13
		// @034: iload #4
		// @036: imul
		// @037: iadd
		// @038: istore #12
		// @03A: iload #9
		// @03C: iload #13
		// @03E: getstatic int game.C_100196_rb.field_105819_e
		// @041: imul
		// @042: iadd
		// @043: istore #9
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
		// @068: istore #13
		// @06A: iload #4
		// @06C: iload #13
		// @06E: isub
		// @06F: istore #4
		// @071: getstatic int game.C_100196_rb.field_105827_i
		// @074: istore_2
		// @075: iload #12
		// @077: iload #13
		// @079: iadd
		// @07A: istore #12
		// @07C: iload #9
		// @07E: iload #13
		// @080: iadd
		// @081: istore #9
		// @083: iload #11
		// @085: iload #13
		// @087: iadd
		// @088: istore #11
		// @08A: iload #10
		// @08C: iload #13
		// @08E: iadd
		// @08F: istore #10
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
		// @0A3: istore #13
		// @0A5: iload #4
		// @0A7: iload #13
		// @0A9: isub
		// @0AA: istore #4
		// @0AC: iload #11
		// @0AE: iload #13
		// @0B0: iadd
		// @0B1: istore #11
		// @0B3: iload #10
		// @0B5: iload #13
		// @0B7: iadd
		// @0B8: istore #10
		// @0BA: iload #4
		// @0BC: ifle @0C4
		// @0BF: iload #5
		// @0C1: ifgt @0C5
		// @0C4: return
		// @0C5: iload #8
		// @0C7: ifeq @0E9
		// @0CA: getstatic int[] game.C_100196_rb.field_105818_d
		// @0CD: aload_0
		// @0CE: getfield byte[][] game.C_100182_cc.field_101780_J
		// @0D1: iload_1
		// @0D2: aaload
		// @0D3: iload #6
		// @0D5: iload #12
		// @0D7: iload #9
		// @0D9: iload #4
		// @0DB: iload #5
		// @0DD: iload #10
		// @0DF: iload #11
		// @0E1: iload #7
		// @0E3: invokestatic game.C_100317_lb.func_101786_a(int[], byte[], int, int, int, int, int, int, int, int)void
		// @0E6: goto @10B
		// @0E9: iconst_0
		// @0EA: getstatic int[] game.C_100196_rb.field_105818_d
		// @0ED: aload_0
		// @0EE: getfield byte[][] game.C_100182_cc.field_101780_J
		// @0F1: iload_1
		// @0F2: aaload
		// @0F3: aload_0
		// @0F4: getfield int[][] game.C_100182_cc.field_101779_R
		// @0F7: iload #6
		// @0F9: aaload
		// @0FA: iload #12
		// @0FC: iload #9
		// @0FE: iload #4
		// @100: iload #5
		// @102: iload #10
		// @104: iload #11
		// @106: iload #7
		// @108: invokestatic game.C_100182_cc.func_101777_a(int, int[], byte[], int[], int, int, int, int, int, int, int)void
		// @10B: return
	}
	
	C_100182_cc(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6)
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
		// @12: putfield byte[][] game.C_100182_cc.field_101780_J
		// @15: aload_0
		// @16: aload #7
		// @18: putfield byte[][] game.C_100182_cc.field_101780_J
		// @1B: aload_0
		// @1C: iconst_4
		// @1D: anewarray int[]
		// @20: putfield int[][] game.C_100182_cc.field_101779_R
		// @23: aload_0
		// @24: getfield int[][] game.C_100182_cc.field_101779_R
		// @27: iconst_0
		// @28: aload #6
		// @2A: aastore
		// @2B: return
	}
	
	private static final void func_101777_a(int arg0, int[] arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10)
	{
		// @00: sipush 256 (0x0100)
		// @03: iload #10
		// @05: isub
		// @06: istore #11
		// @08: iload #7
		// @0A: ineg
		// @0B: istore #12
		// @0D: iload #12
		// @0F: ifge @8A
		// @12: iload #6
		// @14: ineg
		// @15: istore #13
		// @17: iload #13
		// @19: ifge @76
		// @1C: aload_2
		// @1D: iload #4
		// @1F: iinc #4 +1
		// @22: baload
		// @23: dup
		// @24: istore_0
		// @25: ifeq @6D
		// @28: aload_1
		// @29: iload #5
		// @2B: iaload
		// @2C: istore #14
		// @2E: aload_3
		// @2F: iload_0
		// @30: sipush 255 (0x00FF)
		// @33: iand
		// @34: iaload
		// @35: istore #15
		// @37: aload_1
		// @38: iload #5
		// @3A: iinc #5 +1
		// @3D: iload #15
		// @3F: ldc 16711935 (0xff00ff)
		// @41: iand
		// @42: iload #10
		// @44: imul
		// @45: iload #14
		// @47: ldc 16711935 (0xff00ff)
		// @49: iand
		// @4A: iload #11
		// @4C: imul
		// @4D: iadd
		// @4E: ldc -16711936 (0xff00ff00)
		// @50: iand
		// @51: iload #15
		// @53: ldc 65280 (0xff00)
		// @55: iand
		// @56: iload #10
		// @58: imul
		// @59: iload #14
		// @5B: ldc 65280 (0xff00)
		// @5D: iand
		// @5E: iload #11
		// @60: imul
		// @61: iadd
		// @62: ldc 16711680 (0xff0000)
		// @64: iand
		// @65: iadd
		// @66: bipush 8 (0x08)
		// @68: ishr
		// @69: iastore
		// @6A: goto @70
		// @6D: iinc #5 +1
		// @70: iinc #13 +1
		// @73: goto @17
		// @76: iload #5
		// @78: iload #8
		// @7A: iadd
		// @7B: istore #5
		// @7D: iload #4
		// @7F: iload #9
		// @81: iadd
		// @82: istore #4
		// @84: iinc #12 +1
		// @87: goto @0D
		// @8A: return
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
		// @0C5: iload #7
		// @0C7: ifeq @0E7
		// @0CA: getstatic int[] game.C_100196_rb.field_105818_d
		// @0CD: aload_0
		// @0CE: getfield byte[][] game.C_100182_cc.field_101780_J
		// @0D1: iload_1
		// @0D2: aaload
		// @0D3: iload #6
		// @0D5: iload #11
		// @0D7: iload #8
		// @0D9: iload #4
		// @0DB: iload #5
		// @0DD: iload #9
		// @0DF: iload #10
		// @0E1: invokestatic game.C_100317_lb.func_101787_a(int[], byte[], int, int, int, int, int, int, int)void
		// @0E4: goto @107
		// @0E7: iconst_0
		// @0E8: getstatic int[] game.C_100196_rb.field_105818_d
		// @0EB: aload_0
		// @0EC: getfield byte[][] game.C_100182_cc.field_101780_J
		// @0EF: iload_1
		// @0F0: aaload
		// @0F1: aload_0
		// @0F2: getfield int[][] game.C_100182_cc.field_101779_R
		// @0F5: iload #6
		// @0F7: aaload
		// @0F8: iload #11
		// @0FA: iload #8
		// @0FC: iload #4
		// @0FE: iload #5
		// @100: iload #9
		// @102: iload #10
		// @104: invokestatic game.C_100182_cc.func_101778_a(int, int[], byte[], int[], int, int, int, int, int, int)void
		// @107: return
	}
}
