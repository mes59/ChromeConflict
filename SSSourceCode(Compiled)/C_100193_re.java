package game;

final class C_100193_re extends C_100112_r
{
	private byte[][] field_101784_J;
	
	private static final byte[][] func_101781_a(int[] arg0, byte[][] arg1)
	{
		// @00: iconst_0
		// @01: istore_2
		// @02: iload_2
		// @03: aload_0
		// @04: arraylength
		// @05: if_icmpge @34
		// @08: aload_0
		// @09: iload_2
		// @0A: iaload
		// @0B: istore_3
		// @0C: iload_3
		// @0D: bipush 15 (0x0F)
		// @0F: ishr
		// @10: sipush 510 (0x01FE)
		// @13: iand
		// @14: iload_3
		// @15: sipush 255 (0x00FF)
		// @18: iand
		// @19: iadd
		// @1A: istore #4
		// @1C: aload_0
		// @1D: iload_2
		// @1E: iload #4
		// @20: iconst_3
		// @21: idiv
		// @22: iload_3
		// @23: bipush 8 (0x08)
		// @25: ishr
		// @26: sipush 255 (0x00FF)
		// @29: iand
		// @2A: iadd
		// @2B: iconst_1
		// @2C: ishr
		// @2D: iastore
		// @2E: iinc #2 +1
		// @31: goto @02
		// @34: aload_1
		// @35: astore_2
		// @36: iconst_0
		// @37: istore_3
		// @38: iload_3
		// @39: aload_2
		// @3A: arraylength
		// @3B: if_icmpge @70
		// @3E: aload_2
		// @3F: iload_3
		// @40: aaload
		// @41: astore #4
		// @43: iconst_0
		// @44: istore #5
		// @46: iload #5
		// @48: aload #4
		// @4A: arraylength
		// @4B: if_icmpge @6A
		// @4E: aload #4
		// @50: iload #5
		// @52: baload
		// @53: istore #6
		// @55: iload #6
		// @57: ifeq @64
		// @5A: aload #4
		// @5C: iload #5
		// @5E: aload_0
		// @5F: iload #6
		// @61: iaload
		// @62: i2b
		// @63: bastore
		// @64: iinc #5 +1
		// @67: goto @46
		// @6A: iinc #3 +1
		// @6D: goto @38
		// @70: aload_1
		// @71: areturn
	}
	
	C_100193_re(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6)
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
		// @12: putfield byte[][] game.C_100193_re.field_101784_J
		// @15: aload_0
		// @16: aload #6
		// @18: aload #7
		// @1A: invokestatic game.C_100193_re.func_101781_a(int[], byte[][])byte[][]
		// @1D: putfield byte[][] game.C_100193_re.field_101784_J
		// @20: return
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
		// @0CE: getfield byte[][] game.C_100193_re.field_101784_J
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
		// @0E4: goto @101
		// @0E7: getstatic int[] game.C_100196_rb.field_105818_d
		// @0EA: aload_0
		// @0EB: getfield byte[][] game.C_100193_re.field_101784_J
		// @0EE: iload_1
		// @0EF: aaload
		// @0F0: iload #6
		// @0F2: iload #11
		// @0F4: iload #8
		// @0F6: iload #4
		// @0F8: iload #5
		// @0FA: iload #9
		// @0FC: iload #10
		// @0FE: invokestatic game.C_100193_re.func_101783_a(int[], byte[], int, int, int, int, int, int, int)void
		// @101: return
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
		// @0CE: getfield byte[][] game.C_100193_re.field_101784_J
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
		// @0E6: goto @105
		// @0E9: getstatic int[] game.C_100196_rb.field_105818_d
		// @0EC: aload_0
		// @0ED: getfield byte[][] game.C_100193_re.field_101784_J
		// @0F0: iload_1
		// @0F1: aaload
		// @0F2: iload #6
		// @0F4: iload #12
		// @0F6: iload #9
		// @0F8: iload #4
		// @0FA: iload #5
		// @0FC: iload #10
		// @0FE: iload #11
		// @100: iload #7
		// @102: invokestatic game.C_100193_re.func_101782_a(int[], byte[], int, int, int, int, int, int, int, int)void
		// @105: return
	}
	
	private static final void func_101783_a(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8)
	{
		// @00: iload #6
		// @02: ineg
		// @03: istore #9
		// @05: iload #9
		// @07: ifge @8F
		// @0A: iload #5
		// @0C: ineg
		// @0D: istore #10
		// @0F: iload #10
		// @11: ifge @7D
		// @14: sipush 255 (0x00FF)
		// @17: aload_1
		// @18: iload_3
		// @19: iinc #3 +1
		// @1C: baload
		// @1D: iand
		// @1E: istore #11
		// @20: iload #11
		// @22: ifeq @74
		// @25: iload_2
		// @26: ldc 16711935 (0xff00ff)
		// @28: iand
		// @29: iload #11
		// @2B: imul
		// @2C: ldc -16711936 (0xff00ff00)
		// @2E: iand
		// @2F: iload_2
		// @30: ldc 65280 (0xff00)
		// @32: iand
		// @33: iload #11
		// @35: imul
		// @36: ldc 16711680 (0xff0000)
		// @38: iand
		// @39: iadd
		// @3A: bipush 8 (0x08)
		// @3C: ishr
		// @3D: istore #12
		// @3F: sipush 256 (0x0100)
		// @42: iload #11
		// @44: isub
		// @45: istore #11
		// @47: aload_0
		// @48: iload #4
		// @4A: iaload
		// @4B: istore #13
		// @4D: aload_0
		// @4E: iload #4
		// @50: iinc #4 +1
		// @53: iload #13
		// @55: ldc 16711935 (0xff00ff)
		// @57: iand
		// @58: iload #11
		// @5A: imul
		// @5B: ldc -16711936 (0xff00ff00)
		// @5D: iand
		// @5E: iload #13
		// @60: ldc 65280 (0xff00)
		// @62: iand
		// @63: iload #11
		// @65: imul
		// @66: ldc 16711680 (0xff0000)
		// @68: iand
		// @69: iadd
		// @6A: bipush 8 (0x08)
		// @6C: ishr
		// @6D: iload #12
		// @6F: iadd
		// @70: iastore
		// @71: goto @77
		// @74: iinc #4 +1
		// @77: iinc #10 +1
		// @7A: goto @0F
		// @7D: iload #4
		// @7F: iload #7
		// @81: iadd
		// @82: istore #4
		// @84: iload_3
		// @85: iload #8
		// @87: iadd
		// @88: istore_3
		// @89: iinc #9 +1
		// @8C: goto @05
		// @8F: return
	}
	
	private static final void func_101782_a(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9)
	{
		// @00: iload #6
		// @02: ineg
		// @03: istore #10
		// @05: iload #10
		// @07: ifge @95
		// @0A: iload #5
		// @0C: ineg
		// @0D: istore #11
		// @0F: iload #11
		// @11: ifge @83
		// @14: sipush 255 (0x00FF)
		// @17: aload_1
		// @18: iload_3
		// @19: iinc #3 +1
		// @1C: baload
		// @1D: iand
		// @1E: iload #9
		// @20: imul
		// @21: bipush 8 (0x08)
		// @23: ishr
		// @24: istore #12
		// @26: iload #12
		// @28: ifeq @7A
		// @2B: iload_2
		// @2C: ldc 16711935 (0xff00ff)
		// @2E: iand
		// @2F: iload #12
		// @31: imul
		// @32: ldc -16711936 (0xff00ff00)
		// @34: iand
		// @35: iload_2
		// @36: ldc 65280 (0xff00)
		// @38: iand
		// @39: iload #12
		// @3B: imul
		// @3C: ldc 16711680 (0xff0000)
		// @3E: iand
		// @3F: iadd
		// @40: bipush 8 (0x08)
		// @42: ishr
		// @43: istore #13
		// @45: sipush 256 (0x0100)
		// @48: iload #12
		// @4A: isub
		// @4B: istore #12
		// @4D: aload_0
		// @4E: iload #4
		// @50: iaload
		// @51: istore #14
		// @53: aload_0
		// @54: iload #4
		// @56: iinc #4 +1
		// @59: iload #14
		// @5B: ldc 16711935 (0xff00ff)
		// @5D: iand
		// @5E: iload #12
		// @60: imul
		// @61: ldc -16711936 (0xff00ff00)
		// @63: iand
		// @64: iload #14
		// @66: ldc 65280 (0xff00)
		// @68: iand
		// @69: iload #12
		// @6B: imul
		// @6C: ldc 16711680 (0xff0000)
		// @6E: iand
		// @6F: iadd
		// @70: bipush 8 (0x08)
		// @72: ishr
		// @73: iload #13
		// @75: iadd
		// @76: iastore
		// @77: goto @7D
		// @7A: iinc #4 +1
		// @7D: iinc #11 +1
		// @80: goto @0F
		// @83: iload #4
		// @85: iload #7
		// @87: iadd
		// @88: istore #4
		// @8A: iload_3
		// @8B: iload #8
		// @8D: iadd
		// @8E: istore_3
		// @8F: iinc #10 +1
		// @92: goto @05
		// @95: return
	}
}
