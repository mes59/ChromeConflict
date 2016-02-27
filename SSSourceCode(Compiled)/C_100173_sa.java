package game;

final class C_100173_sa
{
	private int field_105595_c;
	private int[] field_105601_i;
	private int[] field_105593_e;
	private static float[] field_105592_d;
	private static int[] field_105596_a;
	private int[] field_105599_k;
	private static int[] field_105597_l;
	private static boolean[] field_105590_f;
	private int[][] field_105594_b;
	private static int[] field_105591_g;
	private int[] field_105600_h;
	private int[] field_105598_j;
	
	private final int func_105585_a(int arg0, int arg1, int arg2, int arg3, int arg4)
	{
		// @00: iload #4
		// @02: iload_2
		// @03: isub
		// @04: istore #6
		// @06: iload_3
		// @07: iload_1
		// @08: isub
		// @09: istore #7
		// @0B: iload #6
		// @0D: ifge @17
		// @10: iload #6
		// @12: ineg
		// @13: goto @19
		// @16: athrow
		// @17: iload #6
		// @19: istore #8
		// @1B: iload #8
		// @1D: iload #5
		// @1F: iload_1
		// @20: isub
		// @21: imul
		// @22: istore #9
		// @24: iload #9
		// @26: iload #7
		// @28: idiv
		// @29: istore #10
		// @2B: iload #6
		// @2D: ifge @38
		// @30: iload_2
		// @31: iload #10
		// @33: isub
		// @34: goto @3C
		// @37: athrow
		// @38: iload_2
		// @39: iload #10
		// @3B: iadd
		// @3C: ireturn
	}
	
	private static final int func_105583_b(int[] arg0, int arg1)
	{
		// @00: aload_0
		// @01: iload_1
		// @02: iaload
		// @03: istore_2
		// @04: iconst_m1
		// @05: istore_3
		// @06: ldc 2147483647 (0x7fffffff)
		// @08: istore #4
		// @0A: iconst_0
		// @0B: istore #5
		// @0D: iload #5
		// @0F: iload_1
		// @10: if_icmpge @37
		// @13: aload_0
		// @14: iload #5
		// @16: iaload
		// @17: istore #6
		// @19: iload #6
		// @1B: iload_2
		// @1C: if_icmple @31
		// @1F: iload #6
		// @21: iload #4
		// @23: if_icmpge @31
		// @26: goto @2A
		// @29: athrow
		// @2A: iload #5
		// @2C: istore_3
		// @2D: iload #6
		// @2F: istore #4
		// @31: iinc #5 +1
		// @34: goto @0D
		// @37: iload_3
		// @38: ireturn
	}
	
	final boolean func_105588_a()
	{
		// @00: invokestatic game.C_100319_hk.func_101426_a()int
		// @03: ifeq @0B
		// @06: iconst_1
		// @07: goto @0C
		// @0A: athrow
		// @0B: iconst_0
		// @0C: istore_1
		// @0D: iload_1
		// @0E: ifne @14
		// @11: iconst_0
		// @12: ireturn
		// @13: athrow
		// @14: aload_0
		// @15: getfield int[] game.C_100173_sa.field_105600_h
		// @18: arraylength
		// @19: istore_2
		// @1A: iconst_0
		// @1B: istore_3
		// @1C: iload_3
		// @1D: iload_2
		// @1E: if_icmpge @33
		// @21: getstatic int[] game.C_100173_sa.field_105597_l
		// @24: iload_3
		// @25: aload_0
		// @26: getfield int[] game.C_100173_sa.field_105600_h
		// @29: iload_3
		// @2A: iaload
		// @2B: iastore
		// @2C: iinc #3 +1
		// @2F: goto @1C
		// @32: athrow
		// @33: getstatic int[] game.C_100173_sa.field_105591_g
		// @36: aload_0
		// @37: getfield int game.C_100173_sa.field_105595_c
		// @3A: iconst_1
		// @3B: isub
		// @3C: iaload
		// @3D: istore_3
		// @3E: iload_3
		// @3F: iconst_1
		// @40: isub
		// @41: sipush 18986 (0x4A2A)
		// @44: invokestatic game.C_100310_lj.func_100538_b(int, int)int
		// @47: istore #4
		// @49: getstatic int[] game.C_100173_sa.field_105596_a
		// @4C: iconst_0
		// @4D: iload #4
		// @4F: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @52: iastore
		// @53: getstatic int[] game.C_100173_sa.field_105596_a
		// @56: iconst_1
		// @57: iload #4
		// @59: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @5C: iastore
		// @5D: iconst_2
		// @5E: istore #5
		// @60: iconst_0
		// @61: istore #6
		// @63: iload #6
		// @65: aload_0
		// @66: getfield int[] game.C_100173_sa.field_105598_j
		// @69: arraylength
		// @6A: if_icmpge @F0
		// @6D: aload_0
		// @6E: getfield int[] game.C_100173_sa.field_105598_j
		// @71: iload #6
		// @73: iaload
		// @74: istore #7
		// @76: aload_0
		// @77: getfield int[] game.C_100173_sa.field_105599_k
		// @7A: iload #7
		// @7C: iaload
		// @7D: istore #8
		// @7F: aload_0
		// @80: getfield int[] game.C_100173_sa.field_105593_e
		// @83: iload #7
		// @85: iaload
		// @86: istore #9
		// @88: iconst_1
		// @89: iload #9
		// @8B: ishl
		// @8C: iconst_1
		// @8D: isub
		// @8E: istore #10
		// @90: iconst_0
		// @91: istore #11
		// @93: iload #9
		// @95: ifle @A8
		// @98: getstatic game.C_100258_lm[] game.C_100319_hk.field_101450_m
		// @9B: aload_0
		// @9C: getfield int[] game.C_100173_sa.field_105601_i
		// @9F: iload #7
		// @A1: iaload
		// @A2: aaload
		// @A3: invokevirtual game.C_100258_lm.func_106488_a()int
		// @A6: istore #11
		// @A8: iconst_0
		// @A9: istore #12
		// @AB: iload #12
		// @AD: iload #8
		// @AF: if_icmpge @EA
		// @B2: aload_0
		// @B3: getfield int[][] game.C_100173_sa.field_105594_b
		// @B6: iload #7
		// @B8: aaload
		// @B9: iload #11
		// @BB: iload #10
		// @BD: iand
		// @BE: iaload
		// @BF: istore #13
		// @C1: iload #11
		// @C3: iload #9
		// @C5: iushr
		// @C6: istore #11
		// @C8: getstatic int[] game.C_100173_sa.field_105596_a
		// @CB: iload #5
		// @CD: iinc #5 +1
		// @D0: iload #13
		// @D2: iflt @E2
		// @D5: getstatic game.C_100258_lm[] game.C_100319_hk.field_101450_m
		// @D8: iload #13
		// @DA: aaload
		// @DB: invokevirtual game.C_100258_lm.func_106488_a()int
		// @DE: goto @E3
		// @E1: athrow
		// @E2: iconst_0
		// @E3: iastore
		// @E4: iinc #12 +1
		// @E7: goto @AB
		// @EA: iinc #6 +1
		// @ED: goto @63
		// @F0: iconst_1
		// @F1: ireturn
	}
	
	private final void func_105582_a(int arg0, int arg1, int arg2, int arg3, float[] arg4, int arg5)
	{
		// @00: iload #4
		// @02: iload_2
		// @03: isub
		// @04: istore #7
		// @06: iload_3
		// @07: iload_1
		// @08: isub
		// @09: istore #8
		// @0B: iload #7
		// @0D: ifge @17
		// @10: iload #7
		// @12: ineg
		// @13: goto @19
		// @16: athrow
		// @17: iload #7
		// @19: istore #9
		// @1B: iload #7
		// @1D: iload #8
		// @1F: idiv
		// @20: istore #10
		// @22: iload_2
		// @23: istore #11
		// @25: iconst_0
		// @26: istore #12
		// @28: iload #7
		// @2A: ifge @35
		// @2D: iload #10
		// @2F: iconst_1
		// @30: isub
		// @31: goto @39
		// @34: athrow
		// @35: iload #10
		// @37: iconst_1
		// @38: iadd
		// @39: istore #13
		// @3B: iload #9
		// @3D: iload #10
		// @3F: ifge @49
		// @42: iload #10
		// @44: ineg
		// @45: goto @4B
		// @48: athrow
		// @49: iload #10
		// @4B: iload #8
		// @4D: imul
		// @4E: isub
		// @4F: istore #9
		// @51: aload #5
		// @53: iload_1
		// @54: dup2
		// @55: faload
		// @56: getstatic float[] game.C_100173_sa.field_105592_d
		// @59: iload #11
		// @5B: faload
		// @5C: fmul
		// @5D: fastore
		// @5E: iload_3
		// @5F: iload #6
		// @61: if_icmple @67
		// @64: iload #6
		// @66: istore_3
		// @67: iload_1
		// @68: iconst_1
		// @69: iadd
		// @6A: istore #14
		// @6C: iload #14
		// @6E: iload_3
		// @6F: if_icmpge @AC
		// @72: iload #12
		// @74: iload #9
		// @76: iadd
		// @77: istore #12
		// @79: iload #12
		// @7B: iload #8
		// @7D: if_icmplt @91
		// @80: iload #12
		// @82: iload #8
		// @84: isub
		// @85: istore #12
		// @87: iload #11
		// @89: iload #13
		// @8B: iadd
		// @8C: istore #11
		// @8E: goto @98
		// @91: iload #11
		// @93: iload #10
		// @95: iadd
		// @96: istore #11
		// @98: aload #5
		// @9A: iload #14
		// @9C: dup2
		// @9D: faload
		// @9E: getstatic float[] game.C_100173_sa.field_105592_d
		// @A1: iload #11
		// @A3: faload
		// @A4: fmul
		// @A5: fastore
		// @A6: iinc #14 +1
		// @A9: goto @6C
		// @AC: return
	}
	
	private final void func_105589_a(int arg0, int arg1)
	{
		// @00: iload_1
		// @01: iload_2
		// @02: if_icmplt @07
		// @05: return
		// @06: athrow
		// @07: iload_1
		// @08: istore_3
		// @09: getstatic int[] game.C_100173_sa.field_105597_l
		// @0C: iload_3
		// @0D: iaload
		// @0E: istore #4
		// @10: getstatic int[] game.C_100173_sa.field_105596_a
		// @13: iload_3
		// @14: iaload
		// @15: istore #5
		// @17: getstatic boolean[] game.C_100173_sa.field_105590_f
		// @1A: iload_3
		// @1B: baload
		// @1C: istore #6
		// @1E: iload_1
		// @1F: iconst_1
		// @20: iadd
		// @21: istore #7
		// @23: iload #7
		// @25: iload_2
		// @26: if_icmpgt @83
		// @29: getstatic int[] game.C_100173_sa.field_105597_l
		// @2C: iload #7
		// @2E: iaload
		// @2F: istore #8
		// @31: iload #8
		// @33: iload #4
		// @35: if_icmpge @7D
		// @38: getstatic int[] game.C_100173_sa.field_105597_l
		// @3B: iload_3
		// @3C: iload #8
		// @3E: iastore
		// @3F: getstatic int[] game.C_100173_sa.field_105596_a
		// @42: iload_3
		// @43: getstatic int[] game.C_100173_sa.field_105596_a
		// @46: iload #7
		// @48: iaload
		// @49: iastore
		// @4A: getstatic boolean[] game.C_100173_sa.field_105590_f
		// @4D: iload_3
		// @4E: getstatic boolean[] game.C_100173_sa.field_105590_f
		// @51: iload #7
		// @53: baload
		// @54: bastore
		// @55: iinc #3 +1
		// @58: getstatic int[] game.C_100173_sa.field_105597_l
		// @5B: iload #7
		// @5D: getstatic int[] game.C_100173_sa.field_105597_l
		// @60: iload_3
		// @61: iaload
		// @62: iastore
		// @63: getstatic int[] game.C_100173_sa.field_105596_a
		// @66: iload #7
		// @68: getstatic int[] game.C_100173_sa.field_105596_a
		// @6B: iload_3
		// @6C: iaload
		// @6D: iastore
		// @6E: getstatic boolean[] game.C_100173_sa.field_105590_f
		// @71: iload #7
		// @73: getstatic boolean[] game.C_100173_sa.field_105590_f
		// @76: iload_3
		// @77: baload
		// @78: bastore
		// @79: goto @7D
		// @7C: athrow
		// @7D: iinc #7 +1
		// @80: goto @23
		// @83: getstatic int[] game.C_100173_sa.field_105597_l
		// @86: iload_3
		// @87: iload #4
		// @89: iastore
		// @8A: getstatic int[] game.C_100173_sa.field_105596_a
		// @8D: iload_3
		// @8E: iload #5
		// @90: iastore
		// @91: getstatic boolean[] game.C_100173_sa.field_105590_f
		// @94: iload_3
		// @95: iload #6
		// @97: bastore
		// @98: aload_0
		// @99: iload_1
		// @9A: iload_3
		// @9B: iconst_1
		// @9C: isub
		// @9D: invokespecial game.C_100173_sa.func_105589_a(int, int)void
		// @A0: aload_0
		// @A1: iload_3
		// @A2: iconst_1
		// @A3: iadd
		// @A4: iload_2
		// @A5: invokespecial game.C_100173_sa.func_105589_a(int, int)void
		// @A8: return
	}
	
	public static void func_105587_b()
	{
		// @00: aconst_null
		// @01: putstatic int[] game.C_100173_sa.field_105591_g
		// @04: aconst_null
		// @05: putstatic float[] game.C_100173_sa.field_105592_d
		// @08: aconst_null
		// @09: putstatic int[] game.C_100173_sa.field_105597_l
		// @0C: aconst_null
		// @0D: putstatic int[] game.C_100173_sa.field_105596_a
		// @10: aconst_null
		// @11: putstatic boolean[] game.C_100173_sa.field_105590_f
		// @14: return
	}
	
	final void func_105584_a(float[] arg0, int arg1)
	{
		// @000: aload_0
		// @001: getfield int[] game.C_100173_sa.field_105600_h
		// @004: arraylength
		// @005: istore_3
		// @006: getstatic int[] game.C_100173_sa.field_105591_g
		// @009: aload_0
		// @00A: getfield int game.C_100173_sa.field_105595_c
		// @00D: iconst_1
		// @00E: isub
		// @00F: iaload
		// @010: istore #4
		// @012: getstatic boolean[] game.C_100173_sa.field_105590_f
		// @015: astore #5
		// @017: getstatic boolean[] game.C_100173_sa.field_105590_f
		// @01A: iconst_1
		// @01B: iconst_1
		// @01C: bastore
		// @01D: aload #5
		// @01F: iconst_0
		// @020: iconst_1
		// @021: bastore
		// @022: iconst_2
		// @023: istore #6
		// @025: iload #6
		// @027: iload_3
		// @028: if_icmpge @115
		// @02B: getstatic int[] game.C_100173_sa.field_105597_l
		// @02E: iload #6
		// @030: invokestatic game.C_100173_sa.func_105586_a(int[], int)int
		// @033: istore #7
		// @035: getstatic int[] game.C_100173_sa.field_105597_l
		// @038: iload #6
		// @03A: invokestatic game.C_100173_sa.func_105583_b(int[], int)int
		// @03D: istore #8
		// @03F: aload_0
		// @040: getstatic int[] game.C_100173_sa.field_105597_l
		// @043: iload #7
		// @045: iaload
		// @046: getstatic int[] game.C_100173_sa.field_105596_a
		// @049: iload #7
		// @04B: iaload
		// @04C: getstatic int[] game.C_100173_sa.field_105597_l
		// @04F: iload #8
		// @051: iaload
		// @052: getstatic int[] game.C_100173_sa.field_105596_a
		// @055: iload #8
		// @057: iaload
		// @058: getstatic int[] game.C_100173_sa.field_105597_l
		// @05B: iload #6
		// @05D: iaload
		// @05E: invokespecial game.C_100173_sa.func_105585_a(int, int, int, int, int)int
		// @061: istore #9
		// @063: getstatic int[] game.C_100173_sa.field_105596_a
		// @066: iload #6
		// @068: iaload
		// @069: istore #10
		// @06B: iload #4
		// @06D: iload #9
		// @06F: isub
		// @070: istore #11
		// @072: iload #9
		// @074: istore #12
		// @076: iload #11
		// @078: iload #12
		// @07A: if_icmpge @083
		// @07D: iload #11
		// @07F: goto @085
		// @082: athrow
		// @083: iload #12
		// @085: iconst_1
		// @086: ishl
		// @087: istore #13
		// @089: iload #10
		// @08B: ifeq @100
		// @08E: getstatic boolean[] game.C_100173_sa.field_105590_f
		// @091: astore #14
		// @093: iload #7
		// @095: istore #15
		// @097: getstatic boolean[] game.C_100173_sa.field_105590_f
		// @09A: iload #8
		// @09C: iconst_1
		// @09D: bastore
		// @09E: aload #14
		// @0A0: iload #15
		// @0A2: iconst_1
		// @0A3: bastore
		// @0A4: getstatic boolean[] game.C_100173_sa.field_105590_f
		// @0A7: iload #6
		// @0A9: iconst_1
		// @0AA: bastore
		// @0AB: iload #10
		// @0AD: iload #13
		// @0AF: if_icmplt @0DC
		// @0B2: getstatic int[] game.C_100173_sa.field_105596_a
		// @0B5: iload #6
		// @0B7: iload #11
		// @0B9: iload #12
		// @0BB: if_icmple @0CE
		// @0BE: goto @0C2
		// @0C1: athrow
		// @0C2: iload #10
		// @0C4: iload #12
		// @0C6: isub
		// @0C7: iload #9
		// @0C9: iadd
		// @0CA: goto @0D8
		// @0CD: athrow
		// @0CE: iload #9
		// @0D0: iload #10
		// @0D2: isub
		// @0D3: iload #11
		// @0D5: iadd
		// @0D6: iconst_1
		// @0D7: isub
		// @0D8: iastore
		// @0D9: goto @0FD
		// @0DC: getstatic int[] game.C_100173_sa.field_105596_a
		// @0DF: iload #6
		// @0E1: iload #10
		// @0E3: iconst_1
		// @0E4: iand
		// @0E5: ifeq @0F5
		// @0E8: iload #9
		// @0EA: iload #10
		// @0EC: iconst_1
		// @0ED: iadd
		// @0EE: iconst_2
		// @0EF: idiv
		// @0F0: isub
		// @0F1: goto @0FC
		// @0F4: athrow
		// @0F5: iload #9
		// @0F7: iload #10
		// @0F9: iconst_2
		// @0FA: idiv
		// @0FB: iadd
		// @0FC: iastore
		// @0FD: goto @10F
		// @100: getstatic boolean[] game.C_100173_sa.field_105590_f
		// @103: iload #6
		// @105: iconst_0
		// @106: bastore
		// @107: getstatic int[] game.C_100173_sa.field_105596_a
		// @10A: iload #6
		// @10C: iload #9
		// @10E: iastore
		// @10F: iinc #6 +1
		// @112: goto @025
		// @115: aload_0
		// @116: iconst_0
		// @117: iload_3
		// @118: iconst_1
		// @119: isub
		// @11A: invokespecial game.C_100173_sa.func_105589_a(int, int)void
		// @11D: iconst_0
		// @11E: istore #6
		// @120: getstatic int[] game.C_100173_sa.field_105596_a
		// @123: iconst_0
		// @124: iaload
		// @125: aload_0
		// @126: getfield int game.C_100173_sa.field_105595_c
		// @129: imul
		// @12A: istore #7
		// @12C: iconst_1
		// @12D: istore #8
		// @12F: iload #8
		// @131: iload_3
		// @132: if_icmpge @17B
		// @135: getstatic boolean[] game.C_100173_sa.field_105590_f
		// @138: iload #8
		// @13A: baload
		// @13B: ifeq @175
		// @13E: goto @142
		// @141: athrow
		// @142: getstatic int[] game.C_100173_sa.field_105597_l
		// @145: iload #8
		// @147: iaload
		// @148: istore #9
		// @14A: getstatic int[] game.C_100173_sa.field_105596_a
		// @14D: iload #8
		// @14F: iaload
		// @150: aload_0
		// @151: getfield int game.C_100173_sa.field_105595_c
		// @154: imul
		// @155: istore #10
		// @157: aload_0
		// @158: iload #6
		// @15A: iload #7
		// @15C: iload #9
		// @15E: iload #10
		// @160: aload_1
		// @161: iload_2
		// @162: invokespecial game.C_100173_sa.func_105582_a(int, int, int, int, float[], int)void
		// @165: iload #9
		// @167: iload_2
		// @168: if_icmplt @16D
		// @16B: return
		// @16C: athrow
		// @16D: iload #9
		// @16F: istore #6
		// @171: iload #10
		// @173: istore #7
		// @175: iinc #8 +1
		// @178: goto @12F
		// @17B: getstatic float[] game.C_100173_sa.field_105592_d
		// @17E: iload #7
		// @180: faload
		// @181: fstore #8
		// @183: iload #6
		// @185: istore #9
		// @187: iload #9
		// @189: iload_2
		// @18A: if_icmpge @19D
		// @18D: aload_1
		// @18E: iload #9
		// @190: dup2
		// @191: faload
		// @192: fload #8
		// @194: fmul
		// @195: fastore
		// @196: iinc #9 +1
		// @199: goto @187
		// @19C: athrow
		// @19D: return
	}
	
	private static final int func_105586_a(int[] arg0, int arg1)
	{
		// @00: aload_0
		// @01: iload_1
		// @02: iaload
		// @03: istore_2
		// @04: iconst_m1
		// @05: istore_3
		// @06: ldc -2147483648 (0x80000000)
		// @08: istore #4
		// @0A: iconst_0
		// @0B: istore #5
		// @0D: iload #5
		// @0F: iload_1
		// @10: if_icmpge @37
		// @13: aload_0
		// @14: iload #5
		// @16: iaload
		// @17: istore #6
		// @19: iload #6
		// @1B: iload_2
		// @1C: if_icmpge @31
		// @1F: iload #6
		// @21: iload #4
		// @23: if_icmple @31
		// @26: goto @2A
		// @29: athrow
		// @2A: iload #5
		// @2C: istore_3
		// @2D: iload #6
		// @2F: istore #4
		// @31: iinc #5 +1
		// @34: goto @0D
		// @37: iload_3
		// @38: ireturn
	}
	
	C_100173_sa()
	{
		// @000: aload_0
		// @001: invokespecial java.lang.Object.<init>()void
		// @004: bipush 16 (0x10)
		// @006: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @009: istore_1
		// @00A: iload_1
		// @00B: iconst_1
		// @00C: if_icmpeq @018
		// @00F: new java.lang.RuntimeException
		// @012: dup
		// @013: invokespecial java.lang.RuntimeException.<init>()void
		// @016: athrow
		// @017: athrow
		// @018: iconst_5
		// @019: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @01C: istore_2
		// @01D: iconst_0
		// @01E: istore_3
		// @01F: aload_0
		// @020: iload_2
		// @021: newarray int[]
		// @023: putfield int[] game.C_100173_sa.field_105598_j
		// @026: iconst_0
		// @027: istore #4
		// @029: iload #4
		// @02B: iload_2
		// @02C: if_icmpge @04F
		// @02F: iconst_4
		// @030: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @033: istore #5
		// @035: aload_0
		// @036: getfield int[] game.C_100173_sa.field_105598_j
		// @039: iload #4
		// @03B: iload #5
		// @03D: iastore
		// @03E: iload #5
		// @040: iload_3
		// @041: if_icmplt @049
		// @044: iload #5
		// @046: iconst_1
		// @047: iadd
		// @048: istore_3
		// @049: iinc #4 +1
		// @04C: goto @029
		// @04F: aload_0
		// @050: iload_3
		// @051: newarray int[]
		// @053: putfield int[] game.C_100173_sa.field_105599_k
		// @056: aload_0
		// @057: iload_3
		// @058: newarray int[]
		// @05A: putfield int[] game.C_100173_sa.field_105593_e
		// @05D: aload_0
		// @05E: iload_3
		// @05F: newarray int[]
		// @061: putfield int[] game.C_100173_sa.field_105601_i
		// @064: aload_0
		// @065: iload_3
		// @066: anewarray int[]
		// @069: putfield int[][] game.C_100173_sa.field_105594_b
		// @06C: iconst_0
		// @06D: istore #4
		// @06F: iload #4
		// @071: iload_3
		// @072: if_icmpge @0DD
		// @075: aload_0
		// @076: getfield int[] game.C_100173_sa.field_105599_k
		// @079: iload #4
		// @07B: iconst_3
		// @07C: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @07F: iconst_1
		// @080: iadd
		// @081: iastore
		// @082: aload_0
		// @083: getfield int[] game.C_100173_sa.field_105593_e
		// @086: iload #4
		// @088: iconst_2
		// @089: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @08C: dup_x2
		// @08D: iastore
		// @08E: istore #5
		// @090: iload #5
		// @092: ifeq @0A5
		// @095: aload_0
		// @096: getfield int[] game.C_100173_sa.field_105601_i
		// @099: iload #4
		// @09B: bipush 8 (0x08)
		// @09D: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @0A0: iastore
		// @0A1: goto @0A5
		// @0A4: athrow
		// @0A5: iconst_1
		// @0A6: iload #5
		// @0A8: ishl
		// @0A9: istore #5
		// @0AB: iload #5
		// @0AD: newarray int[]
		// @0AF: astore #6
		// @0B1: aload_0
		// @0B2: getfield int[][] game.C_100173_sa.field_105594_b
		// @0B5: iload #4
		// @0B7: aload #6
		// @0B9: aastore
		// @0BA: iconst_0
		// @0BB: istore #7
		// @0BD: iload #7
		// @0BF: iload #5
		// @0C1: if_icmpge @0D7
		// @0C4: aload #6
		// @0C6: iload #7
		// @0C8: bipush 8 (0x08)
		// @0CA: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @0CD: iconst_1
		// @0CE: isub
		// @0CF: iastore
		// @0D0: iinc #7 +1
		// @0D3: goto @0BD
		// @0D6: athrow
		// @0D7: iinc #4 +1
		// @0DA: goto @06F
		// @0DD: aload_0
		// @0DE: iconst_2
		// @0DF: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @0E2: iconst_1
		// @0E3: iadd
		// @0E4: putfield int game.C_100173_sa.field_105595_c
		// @0E7: iconst_4
		// @0E8: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @0EB: istore #4
		// @0ED: iconst_2
		// @0EE: istore #5
		// @0F0: iconst_0
		// @0F1: istore #6
		// @0F3: iload #6
		// @0F5: iload_2
		// @0F6: if_icmpge @110
		// @0F9: iload #5
		// @0FB: aload_0
		// @0FC: getfield int[] game.C_100173_sa.field_105599_k
		// @0FF: aload_0
		// @100: getfield int[] game.C_100173_sa.field_105598_j
		// @103: iload #6
		// @105: iaload
		// @106: iaload
		// @107: iadd
		// @108: istore #5
		// @10A: iinc #6 +1
		// @10D: goto @0F3
		// @110: aload_0
		// @111: iload #5
		// @113: newarray int[]
		// @115: putfield int[] game.C_100173_sa.field_105600_h
		// @118: aload_0
		// @119: getfield int[] game.C_100173_sa.field_105600_h
		// @11C: iconst_0
		// @11D: iconst_0
		// @11E: iastore
		// @11F: aload_0
		// @120: getfield int[] game.C_100173_sa.field_105600_h
		// @123: iconst_1
		// @124: iconst_1
		// @125: iload #4
		// @127: ishl
		// @128: iastore
		// @129: iconst_2
		// @12A: istore #5
		// @12C: iconst_0
		// @12D: istore #6
		// @12F: iload #6
		// @131: iload_2
		// @132: if_icmpge @169
		// @135: aload_0
		// @136: getfield int[] game.C_100173_sa.field_105598_j
		// @139: iload #6
		// @13B: iaload
		// @13C: istore #7
		// @13E: iconst_0
		// @13F: istore #8
		// @141: iload #8
		// @143: aload_0
		// @144: getfield int[] game.C_100173_sa.field_105599_k
		// @147: iload #7
		// @149: iaload
		// @14A: if_icmpge @163
		// @14D: aload_0
		// @14E: getfield int[] game.C_100173_sa.field_105600_h
		// @151: iload #5
		// @153: iinc #5 +1
		// @156: iload #4
		// @158: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @15B: iastore
		// @15C: iinc #8 +1
		// @15F: goto @141
		// @162: athrow
		// @163: iinc #6 +1
		// @166: goto @12F
		// @169: getstatic int[] game.C_100173_sa.field_105597_l
		// @16C: ifnull @17C
		// @16F: getstatic int[] game.C_100173_sa.field_105597_l
		// @172: arraylength
		// @173: iload #5
		// @175: if_icmpge @195
		// @178: goto @17C
		// @17B: athrow
		// @17C: iload #5
		// @17E: newarray int[]
		// @180: putstatic int[] game.C_100173_sa.field_105597_l
		// @183: iload #5
		// @185: newarray int[]
		// @187: putstatic int[] game.C_100173_sa.field_105596_a
		// @18A: iload #5
		// @18C: newarray boolean[]
		// @18E: putstatic boolean[] game.C_100173_sa.field_105590_f
		// @191: goto @195
		// @194: athrow
		// @195: return
	}
	
	static
	{
		// @000: sipush 256 (0x0100)
		// @003: newarray float[]
		// @005: dup
		// @006: iconst_0
		// @007: ldc 1.0649863E-7
		// @009: fastore
		// @00A: dup
		// @00B: iconst_1
		// @00C: ldc 1.1341951E-7
		// @00E: fastore
		// @00F: dup
		// @010: iconst_2
		// @011: ldc 1.2079015E-7
		// @013: fastore
		// @014: dup
		// @015: iconst_3
		// @016: ldc 1.2863978E-7
		// @018: fastore
		// @019: dup
		// @01A: iconst_4
		// @01B: ldc 1.369995E-7
		// @01D: fastore
		// @01E: dup
		// @01F: iconst_5
		// @020: ldc 1.459025E-7
		// @022: fastore
		// @023: dup
		// @024: bipush 6 (0x06)
		// @026: ldc 1.5538409E-7
		// @028: fastore
		// @029: dup
		// @02A: bipush 7 (0x07)
		// @02C: ldc 1.6548181E-7
		// @02E: fastore
		// @02F: dup
		// @030: bipush 8 (0x08)
		// @032: ldc 1.7623574E-7
		// @034: fastore
		// @035: dup
		// @036: bipush 9 (0x09)
		// @038: ldc 1.8768856E-7
		// @03A: fastore
		// @03B: dup
		// @03C: bipush 10 (0x0A)
		// @03E: ldc 1.998856E-7
		// @040: fastore
		// @041: dup
		// @042: bipush 11 (0x0B)
		// @044: ldc 2.128753E-7
		// @046: fastore
		// @047: dup
		// @048: bipush 12 (0x0C)
		// @04A: ldc 2.2670913E-7
		// @04C: fastore
		// @04D: dup
		// @04E: bipush 13 (0x0D)
		// @050: ldc 2.4144197E-7
		// @052: fastore
		// @053: dup
		// @054: bipush 14 (0x0E)
		// @056: ldc 2.5713223E-7
		// @058: fastore
		// @059: dup
		// @05A: bipush 15 (0x0F)
		// @05C: ldc 2.7384212E-7
		// @05E: fastore
		// @05F: dup
		// @060: bipush 16 (0x10)
		// @062: ldc 2.9163792E-7
		// @064: fastore
		// @065: dup
		// @066: bipush 17 (0x11)
		// @068: ldc 3.1059022E-7
		// @06A: fastore
		// @06B: dup
		// @06C: bipush 18 (0x12)
		// @06E: ldc 3.307741E-7
		// @070: fastore
		// @071: dup
		// @072: bipush 19 (0x13)
		// @074: ldc 3.5226967E-7
		// @076: fastore
		// @077: dup
		// @078: bipush 20 (0x14)
		// @07A: ldc 3.7516213E-7
		// @07C: fastore
		// @07D: dup
		// @07E: bipush 21 (0x15)
		// @080: ldc 3.995423E-7
		// @082: fastore
		// @083: dup
		// @084: bipush 22 (0x16)
		// @086: ldc 4.255068E-7
		// @088: fastore
		// @089: dup
		// @08A: bipush 23 (0x17)
		// @08C: ldc 4.5315863E-7
		// @08E: fastore
		// @08F: dup
		// @090: bipush 24 (0x18)
		// @092: ldc 4.8260745E-7
		// @094: fastore
		// @095: dup
		// @096: bipush 25 (0x19)
		// @098: ldc 5.1397E-7
		// @09A: fastore
		// @09B: dup
		// @09C: bipush 26 (0x1A)
		// @09E: ldc 5.4737063E-7
		// @0A0: fastore
		// @0A1: dup
		// @0A2: bipush 27 (0x1B)
		// @0A4: ldc 5.829419E-7
		// @0A6: fastore
		// @0A7: dup
		// @0A8: bipush 28 (0x1C)
		// @0AA: ldc 6.208247E-7
		// @0AC: fastore
		// @0AD: dup
		// @0AE: bipush 29 (0x1D)
		// @0B0: ldc 6.611694E-7
		// @0B2: fastore
		// @0B3: dup
		// @0B4: bipush 30 (0x1E)
		// @0B6: ldc 7.041359E-7
		// @0B8: fastore
		// @0B9: dup
		// @0BA: bipush 31 (0x1F)
		// @0BC: ldc 7.4989464E-7
		// @0BE: fastore
		// @0BF: dup
		// @0C0: bipush 32 (0x20)
		// @0C2: ldc 7.98627E-7
		// @0C4: fastore
		// @0C5: dup
		// @0C6: bipush 33 (0x21)
		// @0C8: ldc 8.505263E-7
		// @0CA: fastore
		// @0CB: dup
		// @0CC: bipush 34 (0x22)
		// @0CE: ldc 9.057983E-7
		// @0D0: fastore
		// @0D1: dup
		// @0D2: bipush 35 (0x23)
		// @0D4: ldc 9.646621E-7
		// @0D6: fastore
		// @0D7: dup
		// @0D8: bipush 36 (0x24)
		// @0DA: ldc 1.0273513E-6
		// @0DC: fastore
		// @0DD: dup
		// @0DE: bipush 37 (0x25)
		// @0E0: ldc 1.0941144E-6
		// @0E2: fastore
		// @0E3: dup
		// @0E4: bipush 38 (0x26)
		// @0E6: ldc 1.1652161E-6
		// @0E8: fastore
		// @0E9: dup
		// @0EA: bipush 39 (0x27)
		// @0EC: ldc 1.2409384E-6
		// @0EE: fastore
		// @0EF: dup
		// @0F0: bipush 40 (0x28)
		// @0F2: ldc 1.3215816E-6
		// @0F4: fastore
		// @0F5: dup
		// @0F6: bipush 41 (0x29)
		// @0F8: ldc 1.4074654E-6
		// @0FA: fastore
		// @0FB: dup
		// @0FC: bipush 42 (0x2A)
		// @0FE: ldc 1.4989305E-6
		// @100: fastore
		// @101: dup
		// @102: bipush 43 (0x2B)
		// @104: ldc 1.5963394E-6
		// @106: fastore
		// @107: dup
		// @108: bipush 44 (0x2C)
		// @10A: ldc 1.7000785E-6
		// @10C: fastore
		// @10D: dup
		// @10E: bipush 45 (0x2D)
		// @110: ldc 1.8105592E-6
		// @112: fastore
		// @113: dup
		// @114: bipush 46 (0x2E)
		// @116: ldc 1.9282195E-6
		// @118: fastore
		// @119: dup
		// @11A: bipush 47 (0x2F)
		// @11C: ldc 2.053526E-6
		// @11E: fastore
		// @11F: dup
		// @120: bipush 48 (0x30)
		// @122: ldc 2.1869757E-6
		// @124: fastore
		// @125: dup
		// @126: bipush 49 (0x31)
		// @128: ldc 2.3290977E-6
		// @12A: fastore
		// @12B: dup
		// @12C: bipush 50 (0x32)
		// @12E: ldc 2.4804558E-6
		// @130: fastore
		// @131: dup
		// @132: bipush 51 (0x33)
		// @134: ldc 2.6416496E-6
		// @136: fastore
		// @137: dup
		// @138: bipush 52 (0x34)
		// @13A: ldc 2.813319E-6
		// @13C: fastore
		// @13D: dup
		// @13E: bipush 53 (0x35)
		// @140: ldc 2.9961443E-6
		// @142: fastore
		// @143: dup
		// @144: bipush 54 (0x36)
		// @146: ldc 3.1908505E-6
		// @148: fastore
		// @149: dup
		// @14A: bipush 55 (0x37)
		// @14C: ldc 3.39821E-6
		// @14E: fastore
		// @14F: dup
		// @150: bipush 56 (0x38)
		// @152: ldc 3.619045E-6
		// @154: fastore
		// @155: dup
		// @156: bipush 57 (0x39)
		// @158: ldc 3.8542307E-6
		// @15A: fastore
		// @15B: dup
		// @15C: bipush 58 (0x3A)
		// @15E: ldc 4.1047006E-6
		// @160: fastore
		// @161: dup
		// @162: bipush 59 (0x3B)
		// @164: ldc 4.371447E-6
		// @166: fastore
		// @167: dup
		// @168: bipush 60 (0x3C)
		// @16A: ldc 4.6555283E-6
		// @16C: fastore
		// @16D: dup
		// @16E: bipush 61 (0x3D)
		// @170: ldc 4.958071E-6
		// @172: fastore
		// @173: dup
		// @174: bipush 62 (0x3E)
		// @176: ldc 5.280274E-6
		// @178: fastore
		// @179: dup
		// @17A: bipush 63 (0x3F)
		// @17C: ldc 5.623416E-6
		// @17E: fastore
		// @17F: dup
		// @180: bipush 64 (0x40)
		// @182: ldc 5.988857E-6
		// @184: fastore
		// @185: dup
		// @186: bipush 65 (0x41)
		// @188: ldc 6.3780467E-6
		// @18A: fastore
		// @18B: dup
		// @18C: bipush 66 (0x42)
		// @18E: ldc 6.7925284E-6
		// @190: fastore
		// @191: dup
		// @192: bipush 67 (0x43)
		// @194: ldc 7.2339453E-6
		// @196: fastore
		// @197: dup
		// @198: bipush 68 (0x44)
		// @19A: ldc 7.704048E-6
		// @19C: fastore
		// @19D: dup
		// @19E: bipush 69 (0x45)
		// @1A0: ldc 8.2047E-6
		// @1A2: fastore
		// @1A3: dup
		// @1A4: bipush 70 (0x46)
		// @1A6: ldc 8.737888E-6
		// @1A8: fastore
		// @1A9: dup
		// @1AA: bipush 71 (0x47)
		// @1AC: ldc 9.305725E-6
		// @1AE: fastore
		// @1AF: dup
		// @1B0: bipush 72 (0x48)
		// @1B2: ldc 9.910464E-6
		// @1B4: fastore
		// @1B5: dup
		// @1B6: bipush 73 (0x49)
		// @1B8: ldc 1.0554501E-5
		// @1BA: fastore
		// @1BB: dup
		// @1BC: bipush 74 (0x4A)
		// @1BE: ldc 1.1240392E-5
		// @1C0: fastore
		// @1C1: dup
		// @1C2: bipush 75 (0x4B)
		// @1C4: ldc 1.1970856E-5
		// @1C6: fastore
		// @1C7: dup
		// @1C8: bipush 76 (0x4C)
		// @1CA: ldc 1.2748789E-5
		// @1CC: fastore
		// @1CD: dup
		// @1CE: bipush 77 (0x4D)
		// @1D0: ldc 1.3577278E-5
		// @1D2: fastore
		// @1D3: dup
		// @1D4: bipush 78 (0x4E)
		// @1D6: ldc 1.4459606E-5
		// @1D8: fastore
		// @1D9: dup
		// @1DA: bipush 79 (0x4F)
		// @1DC: ldc 1.5399271E-5
		// @1DE: fastore
		// @1DF: dup
		// @1E0: bipush 80 (0x50)
		// @1E2: ldc 1.6400005E-5
		// @1E4: fastore
		// @1E5: dup
		// @1E6: bipush 81 (0x51)
		// @1E8: ldc 1.7465769E-5
		// @1EA: fastore
		// @1EB: dup
		// @1EC: bipush 82 (0x52)
		// @1EE: ldc 1.8600793E-5
		// @1F0: fastore
		// @1F1: dup
		// @1F2: bipush 83 (0x53)
		// @1F4: ldc 1.9809577E-5
		// @1F6: fastore
		// @1F7: dup
		// @1F8: bipush 84 (0x54)
		// @1FA: ldc 2.1096914E-5
		// @1FC: fastore
		// @1FD: dup
		// @1FE: bipush 85 (0x55)
		// @200: ldc 2.2467912E-5
		// @202: fastore
		// @203: dup
		// @204: bipush 86 (0x56)
		// @206: ldc 2.3928002E-5
		// @208: fastore
		// @209: dup
		// @20A: bipush 87 (0x57)
		// @20C: ldc 2.5482977E-5
		// @20E: fastore
		// @20F: dup
		// @210: bipush 88 (0x58)
		// @212: ldc 2.7139005E-5
		// @214: fastore
		// @215: dup
		// @216: bipush 89 (0x59)
		// @218: ldc 2.890265E-5
		// @21A: fastore
		// @21B: dup
		// @21C: bipush 90 (0x5A)
		// @21E: ldc 3.078091E-5
		// @220: fastore
		// @221: dup
		// @222: bipush 91 (0x5B)
		// @224: ldc 3.2781227E-5
		// @226: fastore
		// @227: dup
		// @228: bipush 92 (0x5C)
		// @22A: ldc 3.4911533E-5
		// @22C: fastore
		// @22D: dup
		// @22E: bipush 93 (0x5D)
		// @230: ldc 3.718028E-5
		// @232: fastore
		// @233: dup
		// @234: bipush 94 (0x5E)
		// @236: ldc 3.9596467E-5
		// @238: fastore
		// @239: dup
		// @23A: bipush 95 (0x5F)
		// @23C: ldc 4.2169668E-5
		// @23E: fastore
		// @23F: dup
		// @240: bipush 96 (0x60)
		// @242: ldc 4.491009E-5
		// @244: fastore
		// @245: dup
		// @246: bipush 97 (0x61)
		// @248: ldc 4.7828602E-5
		// @24A: fastore
		// @24B: dup
		// @24C: bipush 98 (0x62)
		// @24E: ldc 5.0936775E-5
		// @250: fastore
		// @251: dup
		// @252: bipush 99 (0x63)
		// @254: ldc 5.424693E-5
		// @256: fastore
		// @257: dup
		// @258: bipush 100 (0x64)
		// @25A: ldc 5.7772202E-5
		// @25C: fastore
		// @25D: dup
		// @25E: bipush 101 (0x65)
		// @260: ldc 6.152657E-5
		// @262: fastore
		// @263: dup
		// @264: bipush 102 (0x66)
		// @266: ldc 6.552491E-5
		// @268: fastore
		// @269: dup
		// @26A: bipush 103 (0x67)
		// @26C: ldc 6.9783084E-5
		// @26E: fastore
		// @26F: dup
		// @270: bipush 104 (0x68)
		// @272: ldc 7.4317984E-5
		// @274: fastore
		// @275: dup
		// @276: bipush 105 (0x69)
		// @278: ldc 7.914758E-5
		// @27A: fastore
		// @27B: dup
		// @27C: bipush 106 (0x6A)
		// @27E: ldc 8.429104E-5
		// @280: fastore
		// @281: dup
		// @282: bipush 107 (0x6B)
		// @284: ldc 8.976875E-5
		// @286: fastore
		// @287: dup
		// @288: bipush 108 (0x6C)
		// @28A: ldc 9.560242E-5
		// @28C: fastore
		// @28D: dup
		// @28E: bipush 109 (0x6D)
		// @290: ldc 1.0181521E-4
		// @292: fastore
		// @293: dup
		// @294: bipush 110 (0x6E)
		// @296: ldc 1.0843174E-4
		// @298: fastore
		// @299: dup
		// @29A: bipush 111 (0x6F)
		// @29C: ldc 1.1547824E-4
		// @29E: fastore
		// @29F: dup
		// @2A0: bipush 112 (0x70)
		// @2A2: ldc 1.2298267E-4
		// @2A4: fastore
		// @2A5: dup
		// @2A6: bipush 113 (0x71)
		// @2A8: ldc 1.3097477E-4
		// @2AA: fastore
		// @2AB: dup
		// @2AC: bipush 114 (0x72)
		// @2AE: ldc 1.3948625E-4
		// @2B0: fastore
		// @2B1: dup
		// @2B2: bipush 115 (0x73)
		// @2B4: ldc 1.4855085E-4
		// @2B6: fastore
		// @2B7: dup
		// @2B8: bipush 116 (0x74)
		// @2BA: ldc 1.5820454E-4
		// @2BC: fastore
		// @2BD: dup
		// @2BE: bipush 117 (0x75)
		// @2C0: ldc 1.6848555E-4
		// @2C2: fastore
		// @2C3: dup
		// @2C4: bipush 118 (0x76)
		// @2C6: ldc 1.7943469E-4
		// @2C8: fastore
		// @2C9: dup
		// @2CA: bipush 119 (0x77)
		// @2CC: ldc 1.9109536E-4
		// @2CE: fastore
		// @2CF: dup
		// @2D0: bipush 120 (0x78)
		// @2D2: ldc 2.0351382E-4
		// @2D4: fastore
		// @2D5: dup
		// @2D6: bipush 121 (0x79)
		// @2D8: ldc 2.167393E-4
		// @2DA: fastore
		// @2DB: dup
		// @2DC: bipush 122 (0x7A)
		// @2DE: ldc 2.3082423E-4
		// @2E0: fastore
		// @2E1: dup
		// @2E2: bipush 123 (0x7B)
		// @2E4: ldc 2.4582449E-4
		// @2E6: fastore
		// @2E7: dup
		// @2E8: bipush 124 (0x7C)
		// @2EA: ldc 2.6179955E-4
		// @2EC: fastore
		// @2ED: dup
		// @2EE: bipush 125 (0x7D)
		// @2F0: ldc 2.7881275E-4
		// @2F2: fastore
		// @2F3: dup
		// @2F4: bipush 126 (0x7E)
		// @2F6: ldc 2.9693157E-4
		// @2F8: fastore
		// @2F9: dup
		// @2FA: bipush 127 (0x7F)
		// @2FC: ldc 3.1622787E-4
		// @2FE: fastore
		// @2FF: dup
		// @300: sipush 128 (0x0080)
		// @303: ldc 3.3677815E-4
		// @305: fastore
		// @306: dup
		// @307: sipush 129 (0x0081)
		// @30A: ldc 3.5866388E-4
		// @30C: fastore
		// @30D: dup
		// @30E: sipush 130 (0x0082)
		// @311: ldc 3.8197188E-4
		// @313: fastore
		// @314: dup
		// @315: sipush 131 (0x0083)
		// @318: ldc 4.0679457E-4
		// @31A: fastore
		// @31B: dup
		// @31C: sipush 132 (0x0084)
		// @31F: ldc 4.3323037E-4
		// @321: fastore
		// @322: dup
		// @323: sipush 133 (0x0085)
		// @326: ldc 4.613841E-4
		// @328: fastore
		// @329: dup
		// @32A: sipush 134 (0x0086)
		// @32D: ldc 4.913675E-4
		// @32F: fastore
		// @330: dup
		// @331: sipush 135 (0x0087)
		// @334: ldc 5.2329927E-4
		// @336: fastore
		// @337: dup
		// @338: sipush 136 (0x0088)
		// @33B: ldc 5.573062E-4
		// @33D: fastore
		// @33E: dup
		// @33F: sipush 137 (0x0089)
		// @342: ldc 5.935231E-4
		// @344: fastore
		// @345: dup
		// @346: sipush 138 (0x008A)
		// @349: ldc 6.320936E-4
		// @34B: fastore
		// @34C: dup
		// @34D: sipush 139 (0x008B)
		// @350: ldc 6.731706E-4
		// @352: fastore
		// @353: dup
		// @354: sipush 140 (0x008C)
		// @357: ldc 7.16917E-4
		// @359: fastore
		// @35A: dup
		// @35B: sipush 141 (0x008D)
		// @35E: ldc 7.635063E-4
		// @360: fastore
		// @361: dup
		// @362: sipush 142 (0x008E)
		// @365: ldc 8.1312325E-4
		// @367: fastore
		// @368: dup
		// @369: sipush 143 (0x008F)
		// @36C: ldc 8.6596457E-4
		// @36E: fastore
		// @36F: dup
		// @370: sipush 144 (0x0090)
		// @373: ldc 9.2223985E-4
		// @375: fastore
		// @376: dup
		// @377: sipush 145 (0x0091)
		// @37A: ldc 9.821722E-4
		// @37C: fastore
		// @37D: dup
		// @37E: sipush 146 (0x0092)
		// @381: ldc 0.0010459992
		// @383: fastore
		// @384: dup
		// @385: sipush 147 (0x0093)
		// @388: ldc 0.0011139743
		// @38A: fastore
		// @38B: dup
		// @38C: sipush 148 (0x0094)
		// @38F: ldc 0.0011863665
		// @391: fastore
		// @392: dup
		// @393: sipush 149 (0x0095)
		// @396: ldc 0.0012634633
		// @398: fastore
		// @399: dup
		// @39A: sipush 150 (0x0096)
		// @39D: ldc 0.0013455702
		// @39F: fastore
		// @3A0: dup
		// @3A1: sipush 151 (0x0097)
		// @3A4: ldc 0.0014330129
		// @3A6: fastore
		// @3A7: dup
		// @3A8: sipush 152 (0x0098)
		// @3AB: ldc 0.0015261382
		// @3AD: fastore
		// @3AE: dup
		// @3AF: sipush 153 (0x0099)
		// @3B2: ldc 0.0016253153
		// @3B4: fastore
		// @3B5: dup
		// @3B6: sipush 154 (0x009A)
		// @3B9: ldc 0.0017309374
		// @3BB: fastore
		// @3BC: dup
		// @3BD: sipush 155 (0x009B)
		// @3C0: ldc 0.0018434235
		// @3C2: fastore
		// @3C3: dup
		// @3C4: sipush 156 (0x009C)
		// @3C7: ldc 0.0019632196
		// @3C9: fastore
		// @3CA: dup
		// @3CB: sipush 157 (0x009D)
		// @3CE: ldc 0.0020908006
		// @3D0: fastore
		// @3D1: dup
		// @3D2: sipush 158 (0x009E)
		// @3D5: ldc 0.0022266726
		// @3D7: fastore
		// @3D8: dup
		// @3D9: sipush 159 (0x009F)
		// @3DC: ldc 0.0023713743
		// @3DE: fastore
		// @3DF: dup
		// @3E0: sipush 160 (0x00A0)
		// @3E3: ldc 0.0025254795
		// @3E5: fastore
		// @3E6: dup
		// @3E7: sipush 161 (0x00A1)
		// @3EA: ldc 0.0026895993
		// @3EC: fastore
		// @3ED: dup
		// @3EE: sipush 162 (0x00A2)
		// @3F1: ldc 0.0028643848
		// @3F3: fastore
		// @3F4: dup
		// @3F5: sipush 163 (0x00A3)
		// @3F8: ldc 0.0030505287
		// @3FA: fastore
		// @3FB: dup
		// @3FC: sipush 164 (0x00A4)
		// @3FF: ldc 0.003248769
		// @401: fastore
		// @402: dup
		// @403: sipush 165 (0x00A5)
		// @406: ldc 0.0034598925
		// @408: fastore
		// @409: dup
		// @40A: sipush 166 (0x00A6)
		// @40D: ldc 0.0036847359
		// @40F: fastore
		// @410: dup
		// @411: sipush 167 (0x00A7)
		// @414: ldc 0.0039241905
		// @416: fastore
		// @417: dup
		// @418: sipush 168 (0x00A8)
		// @41B: ldc 0.0041792067
		// @41D: fastore
		// @41E: dup
		// @41F: sipush 169 (0x00A9)
		// @422: ldc 0.004450795
		// @424: fastore
		// @425: dup
		// @426: sipush 170 (0x00AA)
		// @429: ldc 0.004740033
		// @42B: fastore
		// @42C: dup
		// @42D: sipush 171 (0x00AB)
		// @430: ldc 0.005048067
		// @432: fastore
		// @433: dup
		// @434: sipush 172 (0x00AC)
		// @437: ldc 0.0053761187
		// @439: fastore
		// @43A: dup
		// @43B: sipush 173 (0x00AD)
		// @43E: ldc 0.005725489
		// @440: fastore
		// @441: dup
		// @442: sipush 174 (0x00AE)
		// @445: ldc 0.0060975635
		// @447: fastore
		// @448: dup
		// @449: sipush 175 (0x00AF)
		// @44C: ldc 0.0064938175
		// @44E: fastore
		// @44F: dup
		// @450: sipush 176 (0x00B0)
		// @453: ldc 0.0069158226
		// @455: fastore
		// @456: dup
		// @457: sipush 177 (0x00B1)
		// @45A: ldc 0.0073652514
		// @45C: fastore
		// @45D: dup
		// @45E: sipush 178 (0x00B2)
		// @461: ldc 0.007843887
		// @463: fastore
		// @464: dup
		// @465: sipush 179 (0x00B3)
		// @468: ldc 0.008353627
		// @46A: fastore
		// @46B: dup
		// @46C: sipush 180 (0x00B4)
		// @46F: ldc 0.008896492
		// @471: fastore
		// @472: dup
		// @473: sipush 181 (0x00B5)
		// @476: ldc 0.009474637
		// @478: fastore
		// @479: dup
		// @47A: sipush 182 (0x00B6)
		// @47D: ldc 0.010090352
		// @47F: fastore
		// @480: dup
		// @481: sipush 183 (0x00B7)
		// @484: ldc 0.01074608
		// @486: fastore
		// @487: dup
		// @488: sipush 184 (0x00B8)
		// @48B: ldc 0.011444421
		// @48D: fastore
		// @48E: dup
		// @48F: sipush 185 (0x00B9)
		// @492: ldc 0.012188144
		// @494: fastore
		// @495: dup
		// @496: sipush 186 (0x00BA)
		// @499: ldc 0.012980198
		// @49B: fastore
		// @49C: dup
		// @49D: sipush 187 (0x00BB)
		// @4A0: ldc 0.013823725
		// @4A2: fastore
		// @4A3: dup
		// @4A4: sipush 188 (0x00BC)
		// @4A7: ldc 0.014722068
		// @4A9: fastore
		// @4AA: dup
		// @4AB: sipush 189 (0x00BD)
		// @4AE: ldc 0.015678791
		// @4B0: fastore
		// @4B1: dup
		// @4B2: sipush 190 (0x00BE)
		// @4B5: ldc 0.016697686
		// @4B7: fastore
		// @4B8: dup
		// @4B9: sipush 191 (0x00BF)
		// @4BC: ldc 0.017782796
		// @4BE: fastore
		// @4BF: dup
		// @4C0: sipush 192 (0x00C0)
		// @4C3: ldc 0.018938422
		// @4C5: fastore
		// @4C6: dup
		// @4C7: sipush 193 (0x00C1)
		// @4CA: ldc 0.020169148
		// @4CC: fastore
		// @4CD: dup
		// @4CE: sipush 194 (0x00C2)
		// @4D1: ldc 0.021479854
		// @4D3: fastore
		// @4D4: dup
		// @4D5: sipush 195 (0x00C3)
		// @4D8: ldc 0.022875736
		// @4DA: fastore
		// @4DB: dup
		// @4DC: sipush 196 (0x00C4)
		// @4DF: ldc 0.02436233
		// @4E1: fastore
		// @4E2: dup
		// @4E3: sipush 197 (0x00C5)
		// @4E6: ldc 0.025945531
		// @4E8: fastore
		// @4E9: dup
		// @4EA: sipush 198 (0x00C6)
		// @4ED: ldc 0.027631618
		// @4EF: fastore
		// @4F0: dup
		// @4F1: sipush 199 (0x00C7)
		// @4F4: ldc 0.029427277
		// @4F6: fastore
		// @4F7: dup
		// @4F8: sipush 200 (0x00C8)
		// @4FB: ldc 0.031339627
		// @4FD: fastore
		// @4FE: dup
		// @4FF: sipush 201 (0x00C9)
		// @502: ldc 0.03337625
		// @504: fastore
		// @505: dup
		// @506: sipush 202 (0x00CA)
		// @509: ldc 0.035545226
		// @50B: fastore
		// @50C: dup
		// @50D: sipush 203 (0x00CB)
		// @510: ldc 0.037855156
		// @512: fastore
		// @513: dup
		// @514: sipush 204 (0x00CC)
		// @517: ldc 0.0403152
		// @519: fastore
		// @51A: dup
		// @51B: sipush 205 (0x00CD)
		// @51E: ldc 0.042935107
		// @520: fastore
		// @521: dup
		// @522: sipush 206 (0x00CE)
		// @525: ldc 0.045725275
		// @527: fastore
		// @528: dup
		// @529: sipush 207 (0x00CF)
		// @52C: ldc 0.048696756
		// @52E: fastore
		// @52F: dup
		// @530: sipush 208 (0x00D0)
		// @533: ldc 0.05186135
		// @535: fastore
		// @536: dup
		// @537: sipush 209 (0x00D1)
		// @53A: ldc 0.05523159
		// @53C: fastore
		// @53D: dup
		// @53E: sipush 210 (0x00D2)
		// @541: ldc 0.05882085
		// @543: fastore
		// @544: dup
		// @545: sipush 211 (0x00D3)
		// @548: ldc 0.062643364
		// @54A: fastore
		// @54B: dup
		// @54C: sipush 212 (0x00D4)
		// @54F: ldc 0.06671428
		// @551: fastore
		// @552: dup
		// @553: sipush 213 (0x00D5)
		// @556: ldc 0.07104975
		// @558: fastore
		// @559: dup
		// @55A: sipush 214 (0x00D6)
		// @55D: ldc 0.075666964
		// @55F: fastore
		// @560: dup
		// @561: sipush 215 (0x00D7)
		// @564: ldc 0.08058423
		// @566: fastore
		// @567: dup
		// @568: sipush 216 (0x00D8)
		// @56B: ldc 0.08582105
		// @56D: fastore
		// @56E: dup
		// @56F: sipush 217 (0x00D9)
		// @572: ldc 0.09139818
		// @574: fastore
		// @575: dup
		// @576: sipush 218 (0x00DA)
		// @579: ldc 0.097337745
		// @57B: fastore
		// @57C: dup
		// @57D: sipush 219 (0x00DB)
		// @580: ldc 0.1036633
		// @582: fastore
		// @583: dup
		// @584: sipush 220 (0x00DC)
		// @587: ldc 0.11039993
		// @589: fastore
		// @58A: dup
		// @58B: sipush 221 (0x00DD)
		// @58E: ldc 0.11757434
		// @590: fastore
		// @591: dup
		// @592: sipush 222 (0x00DE)
		// @595: ldc 0.12521498
		// @597: fastore
		// @598: dup
		// @599: sipush 223 (0x00DF)
		// @59C: ldc 0.13335215
		// @59E: fastore
		// @59F: dup
		// @5A0: sipush 224 (0x00E0)
		// @5A3: ldc 0.14201812
		// @5A5: fastore
		// @5A6: dup
		// @5A7: sipush 225 (0x00E1)
		// @5AA: ldc 0.15124726
		// @5AC: fastore
		// @5AD: dup
		// @5AE: sipush 226 (0x00E2)
		// @5B1: ldc 0.16107617
		// @5B3: fastore
		// @5B4: dup
		// @5B5: sipush 227 (0x00E3)
		// @5B8: ldc_w 0.1715438
		// @5BB: fastore
		// @5BC: dup
		// @5BD: sipush 228 (0x00E4)
		// @5C0: ldc_w 0.18269168
		// @5C3: fastore
		// @5C4: dup
		// @5C5: sipush 229 (0x00E5)
		// @5C8: ldc_w 0.19456401
		// @5CB: fastore
		// @5CC: dup
		// @5CD: sipush 230 (0x00E6)
		// @5D0: ldc_w 0.20720787
		// @5D3: fastore
		// @5D4: dup
		// @5D5: sipush 231 (0x00E7)
		// @5D8: ldc_w 0.22067343
		// @5DB: fastore
		// @5DC: dup
		// @5DD: sipush 232 (0x00E8)
		// @5E0: ldc_w 0.23501402
		// @5E3: fastore
		// @5E4: dup
		// @5E5: sipush 233 (0x00E9)
		// @5E8: ldc_w 0.25028655
		// @5EB: fastore
		// @5EC: dup
		// @5ED: sipush 234 (0x00EA)
		// @5F0: ldc_w 0.26655158
		// @5F3: fastore
		// @5F4: dup
		// @5F5: sipush 235 (0x00EB)
		// @5F8: ldc_w 0.28387362
		// @5FB: fastore
		// @5FC: dup
		// @5FD: sipush 236 (0x00EC)
		// @600: ldc_w 0.3023213
		// @603: fastore
		// @604: dup
		// @605: sipush 237 (0x00ED)
		// @608: ldc_w 0.32196787
		// @60B: fastore
		// @60C: dup
		// @60D: sipush 238 (0x00EE)
		// @610: ldc_w 0.34289113
		// @613: fastore
		// @614: dup
		// @615: sipush 239 (0x00EF)
		// @618: ldc_w 0.36517414
		// @61B: fastore
		// @61C: dup
		// @61D: sipush 240 (0x00F0)
		// @620: ldc_w 0.3889052
		// @623: fastore
		// @624: dup
		// @625: sipush 241 (0x00F1)
		// @628: ldc_w 0.41417846
		// @62B: fastore
		// @62C: dup
		// @62D: sipush 242 (0x00F2)
		// @630: ldc_w 0.44109413
		// @633: fastore
		// @634: dup
		// @635: sipush 243 (0x00F3)
		// @638: ldc_w 0.4697589
		// @63B: fastore
		// @63C: dup
		// @63D: sipush 244 (0x00F4)
		// @640: ldc_w 0.50028646
		// @643: fastore
		// @644: dup
		// @645: sipush 245 (0x00F5)
		// @648: ldc_w 0.53279793
		// @64B: fastore
		// @64C: dup
		// @64D: sipush 246 (0x00F6)
		// @650: ldc_w 0.5674221
		// @653: fastore
		// @654: dup
		// @655: sipush 247 (0x00F7)
		// @658: ldc_w 0.6042964
		// @65B: fastore
		// @65C: dup
		// @65D: sipush 248 (0x00F8)
		// @660: ldc_w 0.64356697
		// @663: fastore
		// @664: dup
		// @665: sipush 249 (0x00F9)
		// @668: ldc_w 0.6853896
		// @66B: fastore
		// @66C: dup
		// @66D: sipush 250 (0x00FA)
		// @670: ldc_w 0.72993004
		// @673: fastore
		// @674: dup
		// @675: sipush 251 (0x00FB)
		// @678: ldc_w 0.777365
		// @67B: fastore
		// @67C: dup
		// @67D: sipush 252 (0x00FC)
		// @680: ldc_w 0.8278826
		// @683: fastore
		// @684: dup
		// @685: sipush 253 (0x00FD)
		// @688: ldc_w 0.88168305
		// @68B: fastore
		// @68C: dup
		// @68D: sipush 254 (0x00FE)
		// @690: ldc_w 0.9389798
		// @693: fastore
		// @694: dup
		// @695: sipush 255 (0x00FF)
		// @698: fconst_1
		// @699: fastore
		// @69A: putstatic float[] game.C_100173_sa.field_105592_d
		// @69D: iconst_4
		// @69E: newarray int[]
		// @6A0: dup
		// @6A1: iconst_0
		// @6A2: sipush 256 (0x0100)
		// @6A5: iastore
		// @6A6: dup
		// @6A7: iconst_1
		// @6A8: sipush 128 (0x0080)
		// @6AB: iastore
		// @6AC: dup
		// @6AD: iconst_2
		// @6AE: bipush 86 (0x56)
		// @6B0: iastore
		// @6B1: dup
		// @6B2: iconst_3
		// @6B3: bipush 64 (0x40)
		// @6B5: iastore
		// @6B6: putstatic int[] game.C_100173_sa.field_105591_g
		// @6B9: return
	}
}
