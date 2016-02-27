package game;

import java.util.Hashtable;

class C_100085_a extends C_100336_im implements C_100259_ll
{
	static C_100029_gn field_102576_K;
	static C_100202_qi field_102569_L;
	static String field_102564_D;
	static String field_102570_M;
	static C_100302_ka field_102572_O;
	static int field_102565_E;
	C_100202_qi field_102567_G;
	static int field_102571_N;
	static int[] field_102573_H;
	static String field_102566_F;
	static String field_102574_I;
	static int field_102575_J;
	private static final String[] field_102568_P;
	
	final boolean func_102520_a(int arg0, C_100336_im arg1, int arg2, int arg3, int arg4, int arg5, int arg6)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #10
		// @05: new game.C_100019_wl
		// @08: dup
		// @09: aload_0
		// @0A: getfield game.C_100202_qi game.C_100085_a.field_102567_G
		// @0D: invokespecial game.C_100019_wl.<init>(game.C_100202_qi)void
		// @10: astore #8
		// @12: aload #8
		// @14: bipush -128 (0x80)
		// @16: invokevirtual game.C_100019_wl.func_103827_a(byte)game.C_100158_da
		// @19: checkcast game.C_100336_im
		// @1C: astore #9
		// @1E: aconst_null
		// @1F: aload #9
		// @21: if_acmpeq @73
		// @24: aload #9
		// @26: sipush 31025 (0x7931)
		// @29: invokevirtual game.C_100336_im.func_100587_d(int)boolean
		// @2C: iload #10
		// @2E: ifne @7D
		// @31: ifeq @73
		// @34: goto @38
		// @37: athrow
		// @38: aload #9
		// @3A: iload_1
		// @3B: aload_2
		// @3C: bipush -109 (0x93)
		// @3E: iload #4
		// @40: iload #5
		// @42: aload_0
		// @43: getfield int game.C_100085_a.field_102541_w
		// @46: ineg
		// @47: isub
		// @48: iload #6
		// @4A: aload_0
		// @4B: getfield int game.C_100085_a.field_102538_m
		// @4E: iadd
		// @4F: iload #7
		// @51: invokevirtual game.C_100336_im.func_102520_a(int, game.C_100336_im, int, int, int, int, int)boolean
		// @54: ifne @5F
		// @57: goto @5B
		// @5A: athrow
		// @5B: goto @61
		// @5E: athrow
		// @5F: iconst_1
		// @60: ireturn
		// @61: aload #8
		// @63: sipush -30820 (0x879C)
		// @66: invokevirtual game.C_100019_wl.func_103836_b(int)game.C_100158_da
		// @69: checkcast game.C_100336_im
		// @6C: astore #9
		// @6E: iload #10
		// @70: ifeq @1E
		// @73: bipush -89 (0xA7)
		// @75: bipush 32 (0x20)
		// @77: iload_3
		// @78: isub
		// @79: bipush 52 (0x34)
		// @7B: idiv
		// @7C: idiv
		// @7D: istore #9
		// @7F: iconst_0
		// @80: ireturn
		// @81: astore #8
		// @83: aload #8
		// @85: new java.lang.StringBuilder
		// @88: dup
		// @89: invokespecial java.lang.StringBuilder.<init>()void
		// @8C: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @8F: bipush 15 (0x0F)
		// @91: aaload
		// @92: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @95: iload_1
		// @96: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @99: bipush 44 (0x2C)
		// @9B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9E: aload_2
		// @9F: ifnull @AB
		// @A2: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @A5: iconst_4
		// @A6: aaload
		// @A7: goto @B0
		// @AA: athrow
		// @AB: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @AE: iconst_5
		// @AF: aaload
		// @B0: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @B3: bipush 44 (0x2C)
		// @B5: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B8: iload_3
		// @B9: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @BC: bipush 44 (0x2C)
		// @BE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C1: iload #4
		// @C3: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @C6: bipush 44 (0x2C)
		// @C8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @CB: iload #5
		// @CD: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @D0: bipush 44 (0x2C)
		// @D2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D5: iload #6
		// @D7: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @DA: bipush 44 (0x2C)
		// @DC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @DF: iload #7
		// @E1: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @E4: bipush 41 (0x29)
		// @E6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @E9: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @EC: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @EF: athrow
	}
	
	static final void func_102554_a(byte arg0, C_100037_wb[] arg1)
	{
		// @00: aload_1
		// @01: putstatic game.C_100037_wb[] game.C_100097_k.field_104584_a
		// @04: bipush -43 (0xD5)
		// @06: bipush 20 (0x14)
		// @08: iload_0
		// @09: isub
		// @0A: bipush 54 (0x36)
		// @0C: idiv
		// @0D: irem
		// @0E: istore_2
		// @0F: getstatic game.C_100037_wb[] game.C_100097_k.field_104584_a
		// @12: ifnull @2A
		// @15: aload_1
		// @16: arraylength
		// @17: iconst_3
		// @18: if_icmpge @2A
		// @1B: goto @1F
		// @1E: athrow
		// @1F: new java.lang.IllegalArgumentException
		// @22: dup
		// @23: ldc ""
		// @25: invokespecial java.lang.IllegalArgumentException.<init>(java.lang.String)void
		// @28: athrow
		// @29: athrow
		// @2A: goto @69
		// @2D: astore_2
		// @2E: aload_2
		// @2F: new java.lang.StringBuilder
		// @32: dup
		// @33: invokespecial java.lang.StringBuilder.<init>()void
		// @36: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @39: bipush 11 (0x0B)
		// @3B: aaload
		// @3C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3F: iload_0
		// @40: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @43: bipush 44 (0x2C)
		// @45: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @48: aload_1
		// @49: ifnull @55
		// @4C: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @4F: iconst_4
		// @50: aaload
		// @51: goto @5A
		// @54: athrow
		// @55: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @58: iconst_5
		// @59: aaload
		// @5A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @5D: bipush 41 (0x29)
		// @5F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @62: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @65: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @68: athrow
		// @69: return
	}
	
	private final void func_102557_i(int arg0)
	{
		// @00: new game.C_100019_wl
		// @03: dup
		// @04: aload_0
		// @05: getfield game.C_100202_qi game.C_100085_a.field_102567_G
		// @08: invokespecial game.C_100019_wl.<init>(game.C_100202_qi)void
		// @0B: astore_2
		// @0C: aload_2
		// @0D: bipush -128 (0x80)
		// @0F: invokevirtual game.C_100019_wl.func_103827_a(byte)game.C_100158_da
		// @12: checkcast game.C_100336_im
		// @15: astore_3
		// @16: aload_3
		// @17: ifnull @31
		// @1A: aload_3
		// @1B: iload_1
		// @1C: sipush 10955 (0x2ACB)
		// @1F: ixor
		// @20: invokevirtual game.C_100336_im.func_102530_f(int)void
		// @23: aload_2
		// @24: sipush -30820 (0x879C)
		// @27: invokevirtual game.C_100019_wl.func_103836_b(int)game.C_100158_da
		// @2A: checkcast game.C_100336_im
		// @2D: astore_3
		// @2E: goto @16
		// @31: iload_1
		// @32: bipush 10 (0x0A)
		// @34: if_icmpeq @42
		// @37: aconst_null
		// @38: checkcast game.C_100302_ka
		// @3B: putstatic game.C_100302_ka game.C_100085_a.field_102572_O
		// @3E: goto @42
		// @41: athrow
		// @42: goto @67
		// @45: astore_2
		// @46: aload_2
		// @47: new java.lang.StringBuilder
		// @4A: dup
		// @4B: invokespecial java.lang.StringBuilder.<init>()void
		// @4E: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @51: bipush 17 (0x11)
		// @53: aaload
		// @54: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @57: iload_1
		// @58: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5B: bipush 41 (0x29)
		// @5D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @60: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @63: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @66: athrow
		// @67: return
	}
	
	void func_102513_a(C_100336_im arg0, int arg1, int arg2, int arg3)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #7
		// @05: aload_0
		// @06: aload_1
		// @07: iload_2
		// @08: iload_3
		// @09: iload #4
		// @0B: invokespecial game.C_100336_im.func_102513_a(game.C_100336_im, int, int, int)void
		// @0E: new game.C_100019_wl
		// @11: dup
		// @12: aload_0
		// @13: getfield game.C_100202_qi game.C_100085_a.field_102567_G
		// @16: invokespecial game.C_100019_wl.<init>(game.C_100202_qi)void
		// @19: astore #5
		// @1B: aload #5
		// @1D: bipush -128 (0x80)
		// @1F: invokevirtual game.C_100019_wl.func_103827_a(byte)game.C_100158_da
		// @22: checkcast game.C_100336_im
		// @25: astore #6
		// @27: aconst_null
		// @28: aload #6
		// @2A: if_acmpeq @60
		// @2D: aload #6
		// @2F: sipush 31025 (0x7931)
		// @32: invokevirtual game.C_100336_im.func_100587_d(int)boolean
		// @35: ifeq @60
		// @38: aload #6
		// @3A: aload_1
		// @3B: aload_0
		// @3C: getfield int game.C_100085_a.field_102541_w
		// @3F: iload_2
		// @40: iadd
		// @41: iload_3
		// @42: iconst_0
		// @43: iadd
		// @44: aload_0
		// @45: getfield int game.C_100085_a.field_102538_m
		// @48: iload #4
		// @4A: iadd
		// @4B: invokevirtual game.C_100336_im.func_102513_a(game.C_100336_im, int, int, int)void
		// @4E: aload #5
		// @50: sipush -30820 (0x879C)
		// @53: invokevirtual game.C_100019_wl.func_103836_b(int)game.C_100158_da
		// @56: checkcast game.C_100336_im
		// @59: astore #6
		// @5B: iload #7
		// @5D: ifeq @27
		// @60: goto @B4
		// @63: astore #5
		// @65: aload #5
		// @67: new java.lang.StringBuilder
		// @6A: dup
		// @6B: invokespecial java.lang.StringBuilder.<init>()void
		// @6E: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @71: bipush 24 (0x18)
		// @73: aaload
		// @74: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @77: aload_1
		// @78: ifnull @84
		// @7B: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @7E: iconst_4
		// @7F: aaload
		// @80: goto @89
		// @83: athrow
		// @84: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @87: iconst_5
		// @88: aaload
		// @89: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @8C: bipush 44 (0x2C)
		// @8E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @91: iload_2
		// @92: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @95: bipush 44 (0x2C)
		// @97: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9A: iload_3
		// @9B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @9E: bipush 44 (0x2C)
		// @A0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A3: iload #4
		// @A5: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A8: bipush 41 (0x29)
		// @AA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @AD: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @B0: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @B3: athrow
		// @B4: return
	}
	
	static final C_100130_tf func_102562_a(String arg0, int arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #5
		// @05: iload_1
		// @06: sipush 7872 (0x1EC0)
		// @09: if_icmpeq @16
		// @0C: bipush 81 (0x51)
		// @0E: invokestatic game.C_100085_a.func_102560_h(int)boolean
		// @11: pop
		// @12: goto @16
		// @15: athrow
		// @16: aload_0
		// @17: invokevirtual java.lang.String.length()int
		// @1A: istore_2
		// @1B: iconst_0
		// @1C: istore_3
		// @1D: iload_3
		// @1E: iload_2
		// @1F: if_icmpge @47
		// @22: aload_0
		// @23: iload_3
		// @24: invokevirtual java.lang.String.charAt(int)char
		// @27: istore #4
		// @29: bipush 48 (0x30)
		// @2B: iload #4
		// @2D: if_icmpgt @3D
		// @30: bipush -58 (0xC6)
		// @32: iload #4
		// @34: iconst_m1
		// @35: ixor
		// @36: if_icmple @3F
		// @39: goto @3D
		// @3C: athrow
		// @3D: aconst_null
		// @3E: areturn
		// @3F: iinc #3 +1
		// @42: iload #5
		// @44: ifeq @1D
		// @47: getstatic game.C_100130_tf game.C_100132_td.field_104975_c
		// @4A: areturn
		// @4B: astore_2
		// @4C: aload_2
		// @4D: new java.lang.StringBuilder
		// @50: dup
		// @51: invokespecial java.lang.StringBuilder.<init>()void
		// @54: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @57: bipush 23 (0x17)
		// @59: aaload
		// @5A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @5D: aload_0
		// @5E: ifnull @6A
		// @61: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @64: iconst_4
		// @65: aaload
		// @66: goto @6F
		// @69: athrow
		// @6A: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @6D: iconst_5
		// @6E: aaload
		// @6F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @72: bipush 44 (0x2C)
		// @74: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @77: iload_1
		// @78: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7B: bipush 41 (0x29)
		// @7D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @80: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @83: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @86: athrow
	}
	
	boolean func_102506_a(char arg0, int arg1, int arg2, C_100336_im arg3)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #7
		// @005: new game.C_100019_wl
		// @008: dup
		// @009: aload_0
		// @00A: getfield game.C_100202_qi game.C_100085_a.field_102567_G
		// @00D: invokespecial game.C_100019_wl.<init>(game.C_100202_qi)void
		// @010: astore #5
		// @012: iload_3
		// @013: sipush 22545 (0x5811)
		// @016: if_icmpeq @026
		// @019: bipush -73 (0xB7)
		// @01B: aconst_null
		// @01C: checkcast game.C_100037_wb[]
		// @01F: invokestatic game.C_100085_a.func_102554_a(byte, game.C_100037_wb[])void
		// @022: goto @026
		// @025: athrow
		// @026: aload #5
		// @028: bipush -128 (0x80)
		// @02A: invokevirtual game.C_100019_wl.func_103827_a(byte)game.C_100158_da
		// @02D: checkcast game.C_100336_im
		// @030: astore #6
		// @032: aload #6
		// @034: ifnull @080
		// @037: aload #6
		// @039: sipush 31025 (0x7931)
		// @03C: invokevirtual game.C_100336_im.func_100587_d(int)boolean
		// @03F: iload #7
		// @041: ifne @081
		// @044: ifeq @080
		// @047: goto @04B
		// @04A: athrow
		// @04B: aload #6
		// @04D: bipush 29 (0x1D)
		// @04F: invokevirtual game.C_100336_im.func_102515_d(byte)boolean
		// @052: ifeq @06E
		// @055: goto @059
		// @058: athrow
		// @059: aload #6
		// @05B: iload_1
		// @05C: iload_2
		// @05D: iload_3
		// @05E: iconst_0
		// @05F: iadd
		// @060: aload #4
		// @062: invokevirtual game.C_100336_im.func_102506_a(char, int, int, game.C_100336_im)boolean
		// @065: ifeq @06E
		// @068: goto @06C
		// @06B: athrow
		// @06C: iconst_1
		// @06D: ireturn
		// @06E: aload #5
		// @070: sipush -30820 (0x879C)
		// @073: invokevirtual game.C_100019_wl.func_103836_b(int)game.C_100158_da
		// @076: checkcast game.C_100336_im
		// @079: astore #6
		// @07B: iload #7
		// @07D: ifeq @032
		// @080: iload_2
		// @081: istore #6
		// @083: bipush 80 (0x50)
		// @085: iload #6
		// @087: if_icmpeq @08E
		// @08A: goto @0B0
		// @08D: athrow
		// @08E: getstatic boolean[] game.C_100309_lk.field_103258_hb
		// @091: bipush 81 (0x51)
		// @093: baload
		// @094: ifeq @0A6
		// @097: aload_0
		// @098: aload #4
		// @09A: iload_3
		// @09B: sipush 22639 (0x586F)
		// @09E: ixor
		// @09F: invokevirtual game.C_100085_a.func_102555_a(game.C_100336_im, int)boolean
		// @0A2: goto @0AF
		// @0A5: athrow
		// @0A6: aload_0
		// @0A7: sipush -17543 (0xBB79)
		// @0AA: aload #4
		// @0AC: invokevirtual game.C_100085_a.func_102558_b(int, game.C_100336_im)boolean
		// @0AF: ireturn
		// @0B0: iconst_0
		// @0B1: ireturn
		// @0B2: astore #5
		// @0B4: aload #5
		// @0B6: new java.lang.StringBuilder
		// @0B9: dup
		// @0BA: invokespecial java.lang.StringBuilder.<init>()void
		// @0BD: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @0C0: bipush 10 (0x0A)
		// @0C2: aaload
		// @0C3: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0C6: iload_1
		// @0C7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0CA: bipush 44 (0x2C)
		// @0CC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0CF: iload_2
		// @0D0: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0D3: bipush 44 (0x2C)
		// @0D5: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0D8: iload_3
		// @0D9: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0DC: bipush 44 (0x2C)
		// @0DE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0E1: aload #4
		// @0E3: ifnull @0EF
		// @0E6: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @0E9: iconst_4
		// @0EA: aaload
		// @0EB: goto @0F4
		// @0EE: athrow
		// @0EF: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @0F2: iconst_5
		// @0F3: aaload
		// @0F4: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0F7: bipush 41 (0x29)
		// @0F9: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0FC: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @0FF: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @102: athrow
	}
	
	final int func_102527_g(int arg0)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #6
		// @05: iload_1
		// @06: sipush -21742 (0xAB12)
		// @09: if_icmpeq @15
		// @0C: bipush -57 (0xC7)
		// @0E: putstatic int game.C_100085_a.field_102565_E
		// @11: goto @15
		// @14: athrow
		// @15: iconst_0
		// @16: istore_2
		// @17: new game.C_100019_wl
		// @1A: dup
		// @1B: aload_0
		// @1C: getfield game.C_100202_qi game.C_100085_a.field_102567_G
		// @1F: invokespecial game.C_100019_wl.<init>(game.C_100202_qi)void
		// @22: astore_3
		// @23: aload_3
		// @24: bipush -128 (0x80)
		// @26: invokevirtual game.C_100019_wl.func_103827_a(byte)game.C_100158_da
		// @29: checkcast game.C_100336_im
		// @2C: astore #4
		// @2E: aconst_null
		// @2F: aload #4
		// @31: if_acmpeq @65
		// @34: aload #4
		// @36: sipush -21742 (0xAB12)
		// @39: invokevirtual game.C_100336_im.func_102527_g(int)int
		// @3C: istore #5
		// @3E: iload #5
		// @40: iconst_m1
		// @41: ixor
		// @42: iload #6
		// @44: ifne @66
		// @47: iload_2
		// @48: iconst_m1
		// @49: ixor
		// @4A: if_icmpge @54
		// @4D: goto @51
		// @50: athrow
		// @51: iload #5
		// @53: istore_2
		// @54: aload_3
		// @55: sipush -30820 (0x879C)
		// @58: invokevirtual game.C_100019_wl.func_103836_b(int)game.C_100158_da
		// @5B: checkcast game.C_100336_im
		// @5E: astore #4
		// @60: iload #6
		// @62: ifeq @2E
		// @65: iload_2
		// @66: ireturn
		// @67: astore_2
		// @68: aload_2
		// @69: new java.lang.StringBuilder
		// @6C: dup
		// @6D: invokespecial java.lang.StringBuilder.<init>()void
		// @70: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @73: bipush 9 (0x09)
		// @75: aaload
		// @76: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @79: iload_1
		// @7A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7D: bipush 41 (0x29)
		// @7F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @82: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @85: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @88: athrow
	}
	
	private final void func_102556_a(StringBuilder arg0, int arg1, int arg2, Hashtable arg3)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #8
		// @05: iload_2
		// @06: bipush 10 (0x0A)
		// @08: if_icmpeq @19
		// @0B: aload_0
		// @0C: iconst_2
		// @0D: bipush -14 (0xF2)
		// @0F: bipush 53 (0x35)
		// @11: iconst_3
		// @12: invokevirtual game.C_100085_a.func_102528_a(int, int, int, byte)void
		// @15: goto @19
		// @18: athrow
		// @19: new game.C_100019_wl
		// @1C: dup
		// @1D: aload_0
		// @1E: getfield game.C_100202_qi game.C_100085_a.field_102567_G
		// @21: invokespecial game.C_100019_wl.<init>(game.C_100202_qi)void
		// @24: astore #5
		// @26: aload #5
		// @28: bipush -128 (0x80)
		// @2A: invokevirtual game.C_100019_wl.func_103827_a(byte)game.C_100158_da
		// @2D: checkcast game.C_100336_im
		// @30: astore #6
		// @32: aload #6
		// @34: ifnull @88
		// @37: aload_1
		// @38: bipush 10 (0x0A)
		// @3A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3D: pop
		// @3E: iload #8
		// @40: ifne @ED
		// @43: iconst_0
		// @44: istore #7
		// @46: iload #7
		// @48: iconst_m1
		// @49: ixor
		// @4A: iload_3
		// @4B: iconst_m1
		// @4C: ixor
		// @4D: if_icmplt @68
		// @50: aload_1
		// @51: bipush 32 (0x20)
		// @53: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @56: pop
		// @57: iinc #7 +1
		// @5A: iload #8
		// @5C: ifne @83
		// @5F: iload #8
		// @61: ifeq @46
		// @64: goto @68
		// @67: athrow
		// @68: aload #6
		// @6A: iload_3
		// @6B: iconst_1
		// @6C: iadd
		// @6D: bipush -111 (0x91)
		// @6F: aload_1
		// @70: aload #4
		// @72: invokevirtual game.C_100336_im.func_102510_a(int, byte, java.lang.StringBuilder, java.util.Hashtable)java.lang.StringBuilder
		// @75: pop
		// @76: aload #5
		// @78: sipush -30820 (0x879C)
		// @7B: invokevirtual game.C_100019_wl.func_103836_b(int)game.C_100158_da
		// @7E: checkcast game.C_100336_im
		// @81: astore #6
		// @83: iload #8
		// @85: ifeq @32
		// @88: goto @ED
		// @8B: astore #5
		// @8D: aload #5
		// @8F: new java.lang.StringBuilder
		// @92: dup
		// @93: invokespecial java.lang.StringBuilder.<init>()void
		// @96: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @99: bipush 8 (0x08)
		// @9B: aaload
		// @9C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @9F: aload_1
		// @A0: ifnull @AC
		// @A3: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @A6: iconst_4
		// @A7: aaload
		// @A8: goto @B1
		// @AB: athrow
		// @AC: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @AF: iconst_5
		// @B0: aaload
		// @B1: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @B4: bipush 44 (0x2C)
		// @B6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B9: iload_2
		// @BA: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @BD: bipush 44 (0x2C)
		// @BF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C2: iload_3
		// @C3: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @C6: bipush 44 (0x2C)
		// @C8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @CB: aload #4
		// @CD: ifnull @D9
		// @D0: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @D3: iconst_4
		// @D4: aaload
		// @D5: goto @DE
		// @D8: athrow
		// @D9: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @DC: iconst_5
		// @DD: aaload
		// @DE: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @E1: bipush 41 (0x29)
		// @E3: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @E6: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @E9: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @EC: athrow
		// @ED: return
	}
	
	static final boolean func_102560_h(int arg0)
	{
		// @00: iload_0
		// @01: sipush 32212 (0x7DD4)
		// @04: if_icmpeq @14
		// @07: bipush 14 (0x0E)
		// @09: aconst_null
		// @0A: checkcast game.C_100037_wb[]
		// @0D: invokestatic game.C_100085_a.func_102554_a(byte, game.C_100037_wb[])void
		// @10: goto @14
		// @13: athrow
		// @14: getstatic boolean game.C_100284_nj.field_106772_a
		// @17: ifeq @24
		// @1A: getstatic boolean game.C_100156_sk.field_105384_w
		// @1D: ifne @30
		// @20: goto @24
		// @23: athrow
		// @24: bipush -25 (0xE7)
		// @26: invokestatic game.C_100234_ob.func_106268_c(byte)boolean
		// @29: ifeq @35
		// @2C: goto @30
		// @2F: athrow
		// @30: iconst_1
		// @31: goto @36
		// @34: athrow
		// @35: iconst_0
		// @36: ireturn
		// @37: astore_1
		// @38: aload_1
		// @39: new java.lang.StringBuilder
		// @3C: dup
		// @3D: invokespecial java.lang.StringBuilder.<init>()void
		// @40: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @43: iconst_1
		// @44: aaload
		// @45: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @48: iload_0
		// @49: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4C: bipush 41 (0x29)
		// @4E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @51: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @54: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @57: athrow
	}
	
	final StringBuilder func_102510_a(int arg0, byte arg1, StringBuilder arg2, Hashtable arg3)
	{
		// @00: bipush -39 (0xD9)
		// @02: iload_2
		// @03: bipush -42 (0xD6)
		// @05: isub
		// @06: bipush 63 (0x3F)
		// @08: idiv
		// @09: idiv
		// @0A: istore #5
		// @0C: aload_0
		// @0D: aload #4
		// @0F: iload_1
		// @10: aload_3
		// @11: bipush -76 (0xB4)
		// @13: invokevirtual game.C_100085_a.func_102516_a(java.util.Hashtable, int, java.lang.StringBuilder, byte)boolean
		// @16: ifeq @31
		// @19: aload_0
		// @1A: bipush -125 (0x83)
		// @1C: aload_3
		// @1D: iload_1
		// @1E: aload #4
		// @20: invokevirtual game.C_100085_a.func_102518_a(byte, java.lang.StringBuilder, int, java.util.Hashtable)void
		// @23: aload_0
		// @24: aload_3
		// @25: bipush 10 (0x0A)
		// @27: iload_1
		// @28: aload #4
		// @2A: invokespecial game.C_100085_a.func_102556_a(java.lang.StringBuilder, int, int, java.util.Hashtable)void
		// @2D: goto @31
		// @30: athrow
		// @31: aload_3
		// @32: areturn
		// @33: astore #5
		// @35: aload #5
		// @37: new java.lang.StringBuilder
		// @3A: dup
		// @3B: invokespecial java.lang.StringBuilder.<init>()void
		// @3E: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @41: bipush 18 (0x12)
		// @43: aaload
		// @44: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @47: iload_1
		// @48: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4B: bipush 44 (0x2C)
		// @4D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @50: iload_2
		// @51: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @54: bipush 44 (0x2C)
		// @56: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @59: aload_3
		// @5A: ifnull @66
		// @5D: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @60: iconst_4
		// @61: aaload
		// @62: goto @6B
		// @65: athrow
		// @66: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @69: iconst_5
		// @6A: aaload
		// @6B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @6E: bipush 44 (0x2C)
		// @70: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @73: aload #4
		// @75: ifnull @81
		// @78: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @7B: iconst_4
		// @7C: aaload
		// @7D: goto @86
		// @80: athrow
		// @81: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @84: iconst_5
		// @85: aaload
		// @86: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @89: bipush 41 (0x29)
		// @8B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @91: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @94: athrow
	}
	
	final boolean func_102515_d(byte arg0)
	{
		// @00: iload_1
		// @01: bipush 10 (0x0A)
		// @03: if_icmpge @13
		// @06: bipush -89 (0xA7)
		// @08: aconst_null
		// @09: checkcast game.C_100037_wb[]
		// @0C: invokestatic game.C_100085_a.func_102554_a(byte, game.C_100037_wb[])void
		// @0F: goto @13
		// @12: athrow
		// @13: aload_0
		// @14: iconst_m1
		// @15: invokevirtual game.C_100085_a.func_102559_j(int)game.C_100336_im
		// @18: ifnull @20
		// @1B: iconst_1
		// @1C: goto @21
		// @1F: athrow
		// @20: iconst_0
		// @21: ireturn
		// @22: astore_2
		// @23: aload_2
		// @24: new java.lang.StringBuilder
		// @27: dup
		// @28: invokespecial java.lang.StringBuilder.<init>()void
		// @2B: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @2E: iconst_0
		// @2F: aaload
		// @30: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @33: iload_1
		// @34: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @37: bipush 41 (0x29)
		// @39: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @42: athrow
	}
	
	void func_102524_a(int arg0, int arg1, int arg2, int arg3, byte arg4)
	{
		// @00: aload_0
		// @01: iload_1
		// @02: iload_2
		// @03: iload_3
		// @04: iload #4
		// @06: bipush 126 (0x7E)
		// @08: invokespecial game.C_100336_im.func_102524_a(int, int, int, int, byte)void
		// @0B: bipush 92 (0x5C)
		// @0D: iload #5
		// @0F: bipush -11 (0xF5)
		// @11: isub
		// @12: bipush 48 (0x30)
		// @14: idiv
		// @15: irem
		// @16: istore #6
		// @18: aload_0
		// @19: bipush 10 (0x0A)
		// @1B: invokespecial game.C_100085_a.func_102557_i(int)void
		// @1E: goto @6B
		// @21: astore #6
		// @23: aload #6
		// @25: new java.lang.StringBuilder
		// @28: dup
		// @29: invokespecial java.lang.StringBuilder.<init>()void
		// @2C: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @2F: bipush 22 (0x16)
		// @31: aaload
		// @32: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @35: iload_1
		// @36: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @39: bipush 44 (0x2C)
		// @3B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3E: iload_2
		// @3F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @42: bipush 44 (0x2C)
		// @44: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @47: iload_3
		// @48: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4B: bipush 44 (0x2C)
		// @4D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @50: iload #4
		// @52: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @55: bipush 44 (0x2C)
		// @57: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5A: iload #5
		// @5C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5F: bipush 41 (0x29)
		// @61: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @64: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @67: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @6A: athrow
		// @6B: return
	}
	
	C_100085_a(int arg0, int arg1, int arg2, int arg3, C_100326_ic arg4)
	{
		// @00: aload_0
		// @01: iload_1
		// @02: iload_2
		// @03: iload_3
		// @04: iload #4
		// @06: aload #5
		// @08: aconst_null
		// @09: invokespecial game.C_100336_im.<init>(int, int, int, int, game.C_100326_ic, game.C_100337_in)void
		// @0C: aload_0
		// @0D: new game.C_100202_qi
		// @10: dup
		// @11: invokespecial game.C_100202_qi.<init>()void
		// @14: putfield game.C_100202_qi game.C_100085_a.field_102567_G
		// @17: return
	}
	
	final boolean func_102558_b(int arg0, C_100336_im arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #7
		// @05: aload_0
		// @06: getfield game.C_100202_qi game.C_100085_a.field_102567_G
		// @09: bipush 110 (0x6E)
		// @0B: invokevirtual game.C_100202_qi.func_105895_d(byte)boolean
		// @0E: ifeq @13
		// @11: iconst_0
		// @12: ireturn
		// @13: iload_1
		// @14: sipush -17543 (0xBB79)
		// @17: if_icmpeq @25
		// @1A: aconst_null
		// @1B: checkcast java.lang.String
		// @1E: putstatic java.lang.String game.C_100085_a.field_102564_D
		// @21: goto @25
		// @24: athrow
		// @25: new game.C_100019_wl
		// @28: dup
		// @29: aload_0
		// @2A: getfield game.C_100202_qi game.C_100085_a.field_102567_G
		// @2D: invokespecial game.C_100019_wl.<init>(game.C_100202_qi)void
		// @30: astore_3
		// @31: aload_3
		// @32: bipush -128 (0x80)
		// @34: invokevirtual game.C_100019_wl.func_103827_a(byte)game.C_100158_da
		// @37: checkcast game.C_100336_im
		// @3A: astore #4
		// @3C: aload #4
		// @3E: ifnull @BB
		// @41: aload #4
		// @43: bipush 104 (0x68)
		// @45: invokevirtual game.C_100336_im.func_102515_d(byte)boolean
		// @48: iload #7
		// @4A: ifne @BC
		// @4D: ifeq @AA
		// @50: goto @54
		// @53: athrow
		// @54: new game.C_100019_wl
		// @57: dup
		// @58: aload_0
		// @59: getfield game.C_100202_qi game.C_100085_a.field_102567_G
		// @5C: invokespecial game.C_100019_wl.<init>(game.C_100202_qi)void
		// @5F: astore #5
		// @61: aload #5
		// @63: iload_1
		// @64: ldc 1221484070 (0x48ce5e26)
		// @66: ixor
		// @67: aload #4
		// @69: invokevirtual game.C_100019_wl.func_103839_b(int, game.C_100158_da)game.C_100158_da
		// @6C: pop
		// @6D: aload #5
		// @6F: sipush -30820 (0x879C)
		// @72: invokevirtual game.C_100019_wl.func_103836_b(int)game.C_100158_da
		// @75: checkcast game.C_100336_im
		// @78: astore #6
		// @7A: aconst_null
		// @7B: aload #6
		// @7D: if_acmpeq @AA
		// @80: aload #6
		// @82: iconst_1
		// @83: aload_2
		// @84: invokevirtual game.C_100336_im.func_102522_a(int, game.C_100336_im)boolean
		// @87: iload #7
		// @89: ifne @BC
		// @8C: ifne @96
		// @8F: goto @93
		// @92: athrow
		// @93: goto @98
		// @96: iconst_1
		// @97: ireturn
		// @98: aload #5
		// @9A: sipush -30820 (0x879C)
		// @9D: invokevirtual game.C_100019_wl.func_103836_b(int)game.C_100158_da
		// @A0: checkcast game.C_100336_im
		// @A3: astore #6
		// @A5: iload #7
		// @A7: ifeq @7A
		// @AA: aload_3
		// @AB: sipush -30820 (0x879C)
		// @AE: invokevirtual game.C_100019_wl.func_103836_b(int)game.C_100158_da
		// @B1: checkcast game.C_100336_im
		// @B4: astore #4
		// @B6: iload #7
		// @B8: ifeq @3C
		// @BB: iconst_0
		// @BC: ireturn
		// @BD: astore_3
		// @BE: aload_3
		// @BF: new java.lang.StringBuilder
		// @C2: dup
		// @C3: invokespecial java.lang.StringBuilder.<init>()void
		// @C6: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @C9: bipush 6 (0x06)
		// @CB: aaload
		// @CC: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @CF: iload_1
		// @D0: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @D3: bipush 44 (0x2C)
		// @D5: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D8: aload_2
		// @D9: ifnull @E5
		// @DC: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @DF: iconst_4
		// @E0: aaload
		// @E1: goto @EA
		// @E4: athrow
		// @E5: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @E8: iconst_5
		// @E9: aaload
		// @EA: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @ED: bipush 41 (0x29)
		// @EF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @F2: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @F5: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @F8: athrow
	}
	
	void func_102528_a(int arg0, int arg1, int arg2, byte arg3)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #7
		// @05: iload #4
		// @07: bipush -126 (0x82)
		// @09: if_icmple @25
		// @0C: aload_0
		// @0D: bipush 74 (0x4A)
		// @0F: aconst_null
		// @10: checkcast game.C_100336_im
		// @13: bipush -22 (0xEA)
		// @15: bipush 82 (0x52)
		// @17: bipush -59 (0xC5)
		// @19: bipush 101 (0x65)
		// @1B: bipush -56 (0xC8)
		// @1D: invokevirtual game.C_100085_a.func_102520_a(int, game.C_100336_im, int, int, int, int, int)boolean
		// @20: pop
		// @21: goto @25
		// @24: athrow
		// @25: iconst_m1
		// @26: iload_1
		// @27: iconst_m1
		// @28: ixor
		// @29: if_icmpne @4B
		// @2C: aload_0
		// @2D: getfield game.C_100326_ic game.C_100085_a.field_102533_B
		// @30: ifnull @4B
		// @33: goto @37
		// @36: athrow
		// @37: aload_0
		// @38: getfield game.C_100326_ic game.C_100085_a.field_102533_B
		// @3B: iconst_1
		// @3C: sipush -26568 (0x9838)
		// @3F: iload_3
		// @40: iload_2
		// @41: aload_0
		// @42: invokeinterface game.C_100326_ic.func_100362_a(boolean, int, int, int, game.C_100336_im)void
		// @47: goto @4B
		// @4A: athrow
		// @4B: new game.C_100019_wl
		// @4E: dup
		// @4F: aload_0
		// @50: getfield game.C_100202_qi game.C_100085_a.field_102567_G
		// @53: invokespecial game.C_100019_wl.<init>(game.C_100202_qi)void
		// @56: astore #5
		// @58: aload #5
		// @5A: iconst_1
		// @5B: invokevirtual game.C_100019_wl.func_103837_b(boolean)game.C_100158_da
		// @5E: checkcast game.C_100336_im
		// @61: astore #6
		// @63: aconst_null
		// @64: aload #6
		// @66: if_acmpeq @98
		// @69: aload #6
		// @6B: iload_1
		// @6C: aload_0
		// @6D: getfield int game.C_100085_a.field_102541_w
		// @70: iload_2
		// @71: iadd
		// @72: iload_3
		// @73: aload_0
		// @74: getfield int game.C_100085_a.field_102538_m
		// @77: iadd
		// @78: bipush -127 (0x81)
		// @7A: invokevirtual game.C_100336_im.func_102528_a(int, int, int, byte)void
		// @7D: aload #5
		// @7F: sipush -21976 (0xAA28)
		// @82: invokevirtual game.C_100019_wl.func_103828_c(int)game.C_100158_da
		// @85: checkcast game.C_100336_im
		// @88: astore #6
		// @8A: iload #7
		// @8C: ifne @DA
		// @8F: iload #7
		// @91: ifeq @63
		// @94: goto @98
		// @97: athrow
		// @98: goto @DA
		// @9B: astore #5
		// @9D: aload #5
		// @9F: new java.lang.StringBuilder
		// @A2: dup
		// @A3: invokespecial java.lang.StringBuilder.<init>()void
		// @A6: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @A9: iconst_2
		// @AA: aaload
		// @AB: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @AE: iload_1
		// @AF: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @B2: bipush 44 (0x2C)
		// @B4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B7: iload_2
		// @B8: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @BB: bipush 44 (0x2C)
		// @BD: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C0: iload_3
		// @C1: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @C4: bipush 44 (0x2C)
		// @C6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C9: iload #4
		// @CB: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @CE: bipush 41 (0x29)
		// @D0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D3: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @D6: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @D9: athrow
		// @DA: return
	}
	
	final void func_102561_b(C_100336_im arg0, int arg1)
	{
		// @00: aload_0
		// @01: getfield game.C_100202_qi game.C_100085_a.field_102567_G
		// @04: bipush 124 (0x7C)
		// @06: aload_1
		// @07: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0A: iload_2
		// @0B: iconst_1
		// @0C: if_icmpeq @16
		// @0F: aload_0
		// @10: bipush 113 (0x71)
		// @12: invokevirtual game.C_100085_a.func_102525_c(byte)java.lang.String
		// @15: pop
		// @16: goto @55
		// @19: astore_3
		// @1A: aload_3
		// @1B: new java.lang.StringBuilder
		// @1E: dup
		// @1F: invokespecial java.lang.StringBuilder.<init>()void
		// @22: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @25: bipush 21 (0x15)
		// @27: aaload
		// @28: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2B: aload_1
		// @2C: ifnull @38
		// @2F: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @32: iconst_4
		// @33: aaload
		// @34: goto @3D
		// @37: athrow
		// @38: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @3B: iconst_5
		// @3C: aaload
		// @3D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @40: bipush 44 (0x2C)
		// @42: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @45: iload_2
		// @46: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @49: bipush 41 (0x29)
		// @4B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @51: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @54: athrow
		// @55: return
	}
	
	String func_102525_c(byte arg0)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #5
		// @05: new game.C_100019_wl
		// @08: dup
		// @09: aload_0
		// @0A: getfield game.C_100202_qi game.C_100085_a.field_102567_G
		// @0D: invokespecial game.C_100019_wl.<init>(game.C_100202_qi)void
		// @10: astore_2
		// @11: iload_1
		// @12: bipush 34 (0x22)
		// @14: if_icmpge @22
		// @17: aconst_null
		// @18: checkcast int[]
		// @1B: putstatic int[] game.C_100085_a.field_102573_H
		// @1E: goto @22
		// @21: athrow
		// @22: aload_2
		// @23: bipush -128 (0x80)
		// @25: invokevirtual game.C_100019_wl.func_103827_a(byte)game.C_100158_da
		// @28: checkcast game.C_100336_im
		// @2B: astore_3
		// @2C: aload_3
		// @2D: ifnull @5A
		// @30: aload_3
		// @31: bipush 89 (0x59)
		// @33: invokevirtual game.C_100336_im.func_102525_c(byte)java.lang.String
		// @36: astore #4
		// @38: aconst_null
		// @39: iload #5
		// @3B: ifne @5B
		// @3E: aload #4
		// @40: if_acmpeq @4A
		// @43: goto @47
		// @46: athrow
		// @47: aload #4
		// @49: areturn
		// @4A: aload_2
		// @4B: sipush -30820 (0x879C)
		// @4E: invokevirtual game.C_100019_wl.func_103836_b(int)game.C_100158_da
		// @51: checkcast game.C_100336_im
		// @54: astore_3
		// @55: iload #5
		// @57: ifeq @2C
		// @5A: aconst_null
		// @5B: areturn
		// @5C: astore_2
		// @5D: aload_2
		// @5E: new java.lang.StringBuilder
		// @61: dup
		// @62: invokespecial java.lang.StringBuilder.<init>()void
		// @65: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @68: bipush 19 (0x13)
		// @6A: aaload
		// @6B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @6E: iload_1
		// @6F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @72: bipush 41 (0x29)
		// @74: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @77: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @7A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @7D: athrow
	}
	
	final boolean func_102522_a(int arg0, C_100336_im arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #5
		// @05: new game.C_100019_wl
		// @08: dup
		// @09: aload_0
		// @0A: getfield game.C_100202_qi game.C_100085_a.field_102567_G
		// @0D: invokespecial game.C_100019_wl.<init>(game.C_100202_qi)void
		// @10: astore_3
		// @11: iload_1
		// @12: iconst_1
		// @13: if_icmpeq @22
		// @16: aload_0
		// @17: aconst_null
		// @18: checkcast game.C_100202_qi
		// @1B: putfield game.C_100202_qi game.C_100085_a.field_102567_G
		// @1E: goto @22
		// @21: athrow
		// @22: aload_3
		// @23: bipush -128 (0x80)
		// @25: invokevirtual game.C_100019_wl.func_103827_a(byte)game.C_100158_da
		// @28: checkcast game.C_100336_im
		// @2B: astore #4
		// @2D: aconst_null
		// @2E: aload #4
		// @30: if_acmpeq @5C
		// @33: aload #4
		// @35: iconst_1
		// @36: aload_2
		// @37: invokevirtual game.C_100336_im.func_102522_a(int, game.C_100336_im)boolean
		// @3A: iload #5
		// @3C: ifne @5D
		// @3F: ifne @49
		// @42: goto @46
		// @45: athrow
		// @46: goto @4B
		// @49: iconst_1
		// @4A: ireturn
		// @4B: aload_3
		// @4C: sipush -30820 (0x879C)
		// @4F: invokevirtual game.C_100019_wl.func_103836_b(int)game.C_100158_da
		// @52: checkcast game.C_100336_im
		// @55: astore #4
		// @57: iload #5
		// @59: ifeq @2D
		// @5C: iconst_0
		// @5D: ireturn
		// @5E: astore_3
		// @5F: aload_3
		// @60: new java.lang.StringBuilder
		// @63: dup
		// @64: invokespecial java.lang.StringBuilder.<init>()void
		// @67: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @6A: bipush 12 (0x0C)
		// @6C: aaload
		// @6D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @70: iload_1
		// @71: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @74: bipush 44 (0x2C)
		// @76: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @79: aload_2
		// @7A: ifnull @86
		// @7D: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @80: iconst_4
		// @81: aaload
		// @82: goto @8B
		// @85: athrow
		// @86: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @89: iconst_5
		// @8A: aaload
		// @8B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @8E: bipush 41 (0x29)
		// @90: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @93: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @96: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @99: athrow
	}
	
	public static void func_102563_e(byte arg0)
	{
		// @00: iload_0
		// @01: bipush 81 (0x51)
		// @03: if_icmpeq @07
		// @06: return
		// @07: aconst_null
		// @08: putstatic game.C_100029_gn game.C_100085_a.field_102576_K
		// @0B: aconst_null
		// @0C: putstatic java.lang.String game.C_100085_a.field_102574_I
		// @0F: aconst_null
		// @10: putstatic game.C_100302_ka game.C_100085_a.field_102572_O
		// @13: aconst_null
		// @14: putstatic java.lang.String game.C_100085_a.field_102570_M
		// @17: aconst_null
		// @18: putstatic int[] game.C_100085_a.field_102573_H
		// @1B: aconst_null
		// @1C: putstatic java.lang.String game.C_100085_a.field_102566_F
		// @1F: aconst_null
		// @20: putstatic java.lang.String game.C_100085_a.field_102564_D
		// @23: aconst_null
		// @24: putstatic game.C_100202_qi game.C_100085_a.field_102569_L
		// @27: goto @4C
		// @2A: astore_1
		// @2B: aload_1
		// @2C: new java.lang.StringBuilder
		// @2F: dup
		// @30: invokespecial java.lang.StringBuilder.<init>()void
		// @33: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @36: bipush 7 (0x07)
		// @38: aaload
		// @39: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3C: iload_0
		// @3D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @40: bipush 41 (0x29)
		// @42: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @45: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @48: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4B: athrow
		// @4C: return
	}
	
	final void func_102519_a(byte arg0, int arg1, int arg2, int arg3, C_100336_im arg4, int arg5)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #9
		// @05: new game.C_100019_wl
		// @08: dup
		// @09: aload_0
		// @0A: getfield game.C_100202_qi game.C_100085_a.field_102567_G
		// @0D: invokespecial game.C_100019_wl.<init>(game.C_100202_qi)void
		// @10: astore #7
		// @12: iload_1
		// @13: bipush 122 (0x7A)
		// @15: if_icmpeq @19
		// @18: return
		// @19: aload #7
		// @1B: bipush -128 (0x80)
		// @1D: invokevirtual game.C_100019_wl.func_103827_a(byte)game.C_100158_da
		// @20: checkcast game.C_100336_im
		// @23: astore #8
		// @25: aconst_null
		// @26: aload #8
		// @28: if_acmpeq @63
		// @2B: aload #8
		// @2D: sipush 31025 (0x7931)
		// @30: invokevirtual game.C_100336_im.func_100587_d(int)boolean
		// @33: ifeq @63
		// @36: aload #8
		// @38: bipush 122 (0x7A)
		// @3A: aload_0
		// @3B: getfield int game.C_100085_a.field_102538_m
		// @3E: iload_2
		// @3F: iadd
		// @40: iload_3
		// @41: iload #4
		// @43: aload #5
		// @45: iload #6
		// @47: aload_0
		// @48: getfield int game.C_100085_a.field_102541_w
		// @4B: iadd
		// @4C: invokevirtual game.C_100336_im.func_102519_a(byte, int, int, int, game.C_100336_im, int)void
		// @4F: aload #7
		// @51: iload_1
		// @52: sipush -30746 (0x87E6)
		// @55: ixor
		// @56: invokevirtual game.C_100019_wl.func_103836_b(int)game.C_100158_da
		// @59: checkcast game.C_100336_im
		// @5C: astore #8
		// @5E: iload #9
		// @60: ifeq @25
		// @63: goto @CB
		// @66: astore #7
		// @68: aload #7
		// @6A: new java.lang.StringBuilder
		// @6D: dup
		// @6E: invokespecial java.lang.StringBuilder.<init>()void
		// @71: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @74: bipush 13 (0x0D)
		// @76: aaload
		// @77: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @7A: iload_1
		// @7B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7E: bipush 44 (0x2C)
		// @80: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @83: iload_2
		// @84: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @87: bipush 44 (0x2C)
		// @89: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8C: iload_3
		// @8D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @90: bipush 44 (0x2C)
		// @92: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @95: iload #4
		// @97: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @9A: bipush 44 (0x2C)
		// @9C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9F: aload #5
		// @A1: ifnull @AD
		// @A4: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @A7: iconst_4
		// @A8: aaload
		// @A9: goto @B2
		// @AC: athrow
		// @AD: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @B0: iconst_5
		// @B1: aaload
		// @B2: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @B5: bipush 44 (0x2C)
		// @B7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @BA: iload #6
		// @BC: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @BF: bipush 41 (0x29)
		// @C1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C4: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @C7: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @CA: athrow
		// @CB: return
	}
	
	final boolean func_102555_a(C_100336_im arg0, int arg1)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #7
		// @005: aload_0
		// @006: getfield game.C_100202_qi game.C_100085_a.field_102567_G
		// @009: bipush 120 (0x78)
		// @00B: invokevirtual game.C_100202_qi.func_105895_d(byte)boolean
		// @00E: ifeq @013
		// @011: iconst_0
		// @012: ireturn
		// @013: new game.C_100019_wl
		// @016: dup
		// @017: aload_0
		// @018: getfield game.C_100202_qi game.C_100085_a.field_102567_G
		// @01B: invokespecial game.C_100019_wl.<init>(game.C_100202_qi)void
		// @01E: astore_3
		// @01F: iload_2
		// @020: bipush 102 (0x66)
		// @022: if_icmpge @039
		// @025: aload_0
		// @026: aconst_null
		// @027: checkcast java.lang.StringBuilder
		// @02A: bipush -63 (0xC1)
		// @02C: bipush 25 (0x19)
		// @02E: aconst_null
		// @02F: checkcast java.util.Hashtable
		// @032: invokespecial game.C_100085_a.func_102556_a(java.lang.StringBuilder, int, int, java.util.Hashtable)void
		// @035: goto @039
		// @038: athrow
		// @039: aload_3
		// @03A: iconst_1
		// @03B: invokevirtual game.C_100019_wl.func_103837_b(boolean)game.C_100158_da
		// @03E: checkcast game.C_100336_im
		// @041: astore #4
		// @043: aload #4
		// @045: ifnull @0C9
		// @048: aload #4
		// @04A: bipush 66 (0x42)
		// @04C: invokevirtual game.C_100336_im.func_102515_d(byte)boolean
		// @04F: iload #7
		// @051: ifne @0CA
		// @054: ifne @064
		// @057: goto @05B
		// @05A: athrow
		// @05B: iload #7
		// @05D: ifeq @0B8
		// @060: goto @064
		// @063: athrow
		// @064: new game.C_100019_wl
		// @067: dup
		// @068: aload_0
		// @069: getfield game.C_100202_qi game.C_100085_a.field_102567_G
		// @06C: invokespecial game.C_100019_wl.<init>(game.C_100202_qi)void
		// @06F: astore #5
		// @071: aload #5
		// @073: bipush -122 (0x86)
		// @075: aload #4
		// @077: invokevirtual game.C_100019_wl.func_103835_a(int, game.C_100158_da)game.C_100158_da
		// @07A: pop
		// @07B: aload #5
		// @07D: sipush -21976 (0xAA28)
		// @080: invokevirtual game.C_100019_wl.func_103828_c(int)game.C_100158_da
		// @083: checkcast game.C_100336_im
		// @086: astore #6
		// @088: aconst_null
		// @089: aload #6
		// @08B: if_acmpeq @0B8
		// @08E: aload #6
		// @090: iconst_1
		// @091: aload_1
		// @092: invokevirtual game.C_100336_im.func_102522_a(int, game.C_100336_im)boolean
		// @095: iload #7
		// @097: ifne @0CA
		// @09A: ifne @0A4
		// @09D: goto @0A1
		// @0A0: athrow
		// @0A1: goto @0A6
		// @0A4: iconst_1
		// @0A5: ireturn
		// @0A6: aload #5
		// @0A8: sipush -21976 (0xAA28)
		// @0AB: invokevirtual game.C_100019_wl.func_103828_c(int)game.C_100158_da
		// @0AE: checkcast game.C_100336_im
		// @0B1: astore #6
		// @0B3: iload #7
		// @0B5: ifeq @088
		// @0B8: aload_3
		// @0B9: sipush -21976 (0xAA28)
		// @0BC: invokevirtual game.C_100019_wl.func_103828_c(int)game.C_100158_da
		// @0BF: checkcast game.C_100336_im
		// @0C2: astore #4
		// @0C4: iload #7
		// @0C6: ifeq @043
		// @0C9: iconst_0
		// @0CA: ireturn
		// @0CB: astore_3
		// @0CC: aload_3
		// @0CD: new java.lang.StringBuilder
		// @0D0: dup
		// @0D1: invokespecial java.lang.StringBuilder.<init>()void
		// @0D4: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @0D7: bipush 14 (0x0E)
		// @0D9: aaload
		// @0DA: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0DD: aload_1
		// @0DE: ifnull @0EA
		// @0E1: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @0E4: iconst_4
		// @0E5: aaload
		// @0E6: goto @0EF
		// @0E9: athrow
		// @0EA: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @0ED: iconst_5
		// @0EE: aaload
		// @0EF: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0F2: bipush 44 (0x2C)
		// @0F4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0F7: iload_2
		// @0F8: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0FB: bipush 41 (0x29)
		// @0FD: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @100: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @103: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @106: athrow
	}
	
	final void func_102526_b(boolean arg0)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #4
		// @05: new game.C_100019_wl
		// @08: dup
		// @09: aload_0
		// @0A: getfield game.C_100202_qi game.C_100085_a.field_102567_G
		// @0D: invokespecial game.C_100019_wl.<init>(game.C_100202_qi)void
		// @10: astore_2
		// @11: aload_2
		// @12: bipush -128 (0x80)
		// @14: invokevirtual game.C_100019_wl.func_103827_a(byte)game.C_100158_da
		// @17: checkcast game.C_100336_im
		// @1A: astore_3
		// @1B: iload_1
		// @1C: ifeq @2B
		// @1F: aload_0
		// @20: aconst_null
		// @21: checkcast game.C_100202_qi
		// @24: putfield game.C_100202_qi game.C_100085_a.field_102567_G
		// @27: goto @2B
		// @2A: athrow
		// @2B: aconst_null
		// @2C: aload_3
		// @2D: if_acmpeq @4E
		// @30: aload_3
		// @31: iload_1
		// @32: invokevirtual game.C_100336_im.func_102526_b(boolean)void
		// @35: aload_2
		// @36: sipush -30820 (0x879C)
		// @39: invokevirtual game.C_100019_wl.func_103836_b(int)game.C_100158_da
		// @3C: checkcast game.C_100336_im
		// @3F: astore_3
		// @40: iload #4
		// @42: ifne @72
		// @45: iload #4
		// @47: ifeq @2B
		// @4A: goto @4E
		// @4D: athrow
		// @4E: goto @72
		// @51: astore_2
		// @52: aload_2
		// @53: new java.lang.StringBuilder
		// @56: dup
		// @57: invokespecial java.lang.StringBuilder.<init>()void
		// @5A: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @5D: iconst_3
		// @5E: aaload
		// @5F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @62: iload_1
		// @63: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @66: bipush 41 (0x29)
		// @68: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @6E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @71: athrow
		// @72: return
	}
	
	C_100336_im func_102559_j(int arg0)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #4
		// @05: new game.C_100019_wl
		// @08: dup
		// @09: aload_0
		// @0A: getfield game.C_100202_qi game.C_100085_a.field_102567_G
		// @0D: invokespecial game.C_100019_wl.<init>(game.C_100202_qi)void
		// @10: astore_2
		// @11: aload_2
		// @12: bipush -128 (0x80)
		// @14: invokevirtual game.C_100019_wl.func_103827_a(byte)game.C_100158_da
		// @17: checkcast game.C_100336_im
		// @1A: astore_3
		// @1B: aconst_null
		// @1C: aload_3
		// @1D: if_acmpeq @47
		// @20: aload_3
		// @21: bipush 25 (0x19)
		// @23: invokevirtual game.C_100336_im.func_102515_d(byte)boolean
		// @26: iload #4
		// @28: ifne @48
		// @2B: ifne @35
		// @2E: goto @32
		// @31: athrow
		// @32: goto @37
		// @35: aload_3
		// @36: areturn
		// @37: aload_2
		// @38: sipush -30820 (0x879C)
		// @3B: invokevirtual game.C_100019_wl.func_103836_b(int)game.C_100158_da
		// @3E: checkcast game.C_100336_im
		// @41: astore_3
		// @42: iload #4
		// @44: ifeq @1B
		// @47: iload_1
		// @48: iconst_m1
		// @49: if_icmpeq @65
		// @4C: aload_0
		// @4D: bipush 24 (0x18)
		// @4F: aconst_null
		// @50: checkcast game.C_100336_im
		// @53: bipush -117 (0x8B)
		// @55: bipush -77 (0xB3)
		// @57: bipush 75 (0x4B)
		// @59: bipush 7 (0x07)
		// @5B: bipush -43 (0xD5)
		// @5D: invokevirtual game.C_100085_a.func_102520_a(int, game.C_100336_im, int, int, int, int, int)boolean
		// @60: pop
		// @61: goto @65
		// @64: athrow
		// @65: aconst_null
		// @66: areturn
		// @67: astore_2
		// @68: aload_2
		// @69: new java.lang.StringBuilder
		// @6C: dup
		// @6D: invokespecial java.lang.StringBuilder.<init>()void
		// @70: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @73: bipush 16 (0x10)
		// @75: aaload
		// @76: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @79: iload_1
		// @7A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7D: bipush 41 (0x29)
		// @7F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @82: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @85: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @88: athrow
	}
	
	final boolean func_102512_b(int arg0, C_100336_im arg1, int arg2, int arg3, int arg4, int arg5, int arg6)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #10
		// @05: new game.C_100019_wl
		// @08: dup
		// @09: aload_0
		// @0A: getfield game.C_100202_qi game.C_100085_a.field_102567_G
		// @0D: invokespecial game.C_100019_wl.<init>(game.C_100202_qi)void
		// @10: astore #8
		// @12: iload #4
		// @14: bipush -20 (0xEC)
		// @16: if_icmplt @29
		// @19: aload_0
		// @1A: bipush 24 (0x18)
		// @1C: bipush 36 (0x24)
		// @1E: bipush -22 (0xEA)
		// @20: bipush 54 (0x36)
		// @22: invokevirtual game.C_100085_a.func_102528_a(int, int, int, byte)void
		// @25: goto @29
		// @28: athrow
		// @29: aload #8
		// @2B: bipush -128 (0x80)
		// @2D: invokevirtual game.C_100019_wl.func_103827_a(byte)game.C_100158_da
		// @30: checkcast game.C_100336_im
		// @33: astore #9
		// @35: aload #9
		// @37: ifnull @8B
		// @3A: aload #9
		// @3C: sipush 31025 (0x7931)
		// @3F: invokevirtual game.C_100336_im.func_100587_d(int)boolean
		// @42: iload #10
		// @44: ifne @8C
		// @47: ifeq @8B
		// @4A: goto @4E
		// @4D: athrow
		// @4E: aload #9
		// @50: bipush 45 (0x2D)
		// @52: invokevirtual game.C_100336_im.func_102515_d(byte)boolean
		// @55: ifeq @79
		// @58: goto @5C
		// @5B: athrow
		// @5C: aload #9
		// @5E: iload_1
		// @5F: aload_2
		// @60: iload_3
		// @61: bipush -86 (0xAA)
		// @63: iload #5
		// @65: iload #6
		// @67: iload #7
		// @69: invokevirtual game.C_100336_im.func_102512_b(int, game.C_100336_im, int, int, int, int, int)boolean
		// @6C: ifne @77
		// @6F: goto @73
		// @72: athrow
		// @73: goto @79
		// @76: athrow
		// @77: iconst_1
		// @78: ireturn
		// @79: aload #8
		// @7B: sipush -30820 (0x879C)
		// @7E: invokevirtual game.C_100019_wl.func_103836_b(int)game.C_100158_da
		// @81: checkcast game.C_100336_im
		// @84: astore #9
		// @86: iload #10
		// @88: ifeq @35
		// @8B: iconst_0
		// @8C: ireturn
		// @8D: astore #8
		// @8F: aload #8
		// @91: new java.lang.StringBuilder
		// @94: dup
		// @95: invokespecial java.lang.StringBuilder.<init>()void
		// @98: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @9B: bipush 20 (0x14)
		// @9D: aaload
		// @9E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @A1: iload_1
		// @A2: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A5: bipush 44 (0x2C)
		// @A7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @AA: aload_2
		// @AB: ifnull @B7
		// @AE: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @B1: iconst_4
		// @B2: aaload
		// @B3: goto @BC
		// @B6: athrow
		// @B7: getstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @BA: iconst_5
		// @BB: aaload
		// @BC: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @BF: bipush 44 (0x2C)
		// @C1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C4: iload_3
		// @C5: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @C8: bipush 44 (0x2C)
		// @CA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @CD: iload #4
		// @CF: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @D2: bipush 44 (0x2C)
		// @D4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D7: iload #5
		// @D9: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @DC: bipush 44 (0x2C)
		// @DE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @E1: iload #6
		// @E3: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @E6: bipush 44 (0x2C)
		// @E8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @EB: iload #7
		// @ED: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @F0: bipush 41 (0x29)
		// @F2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @F5: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @F8: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @FB: athrow
	}
	
	static
	{
		// @000: bipush 25 (0x19)
		// @002: anewarray java.lang.String
		// @005: dup
		// @006: iconst_0
		// @007: ldc "N^q@3"
		// @009: invokestatic game.C_100085_a.func_102553_z(java.lang.String)char[]
		// @00C: invokestatic game.C_100085_a.func_102552_z(char[])java.lang.String
		// @00F: aastore
		// @010: dup
		// @011: iconst_1
		// @012: ldc "N^b)"
		// @014: invokestatic game.C_100085_a.func_102553_z(java.lang.String)char[]
		// @017: invokestatic game.C_100085_a.func_102552_z(char[])java.lang.String
		// @01A: aastore
		// @01B: dup
		// @01C: iconst_2
		// @01D: ldc "N^w)"
		// @01F: invokestatic game.C_100085_a.func_102553_z(java.lang.String)char[]
		// @022: invokestatic game.C_100085_a.func_102552_z(char[])java.lang.String
		// @025: aastore
		// @026: dup
		// @027: iconst_3
		// @028: ldc "N^c)"
		// @02A: invokestatic game.C_100085_a.func_102553_z(java.lang.String)char[]
		// @02D: invokestatic game.C_100085_a.func_102552_z(char[])java.lang.String
		// @030: aastore
		// @031: dup
		// @032: iconst_4
		// @033: ldc "T^\u001a/f"
		// @035: invokestatic game.C_100085_a.func_102553_z(java.lang.String)char[]
		// @038: invokestatic game.C_100085_a.func_102552_z(char[])java.lang.String
		// @03B: aastore
		// @03C: dup
		// @03D: iconst_5
		// @03E: ldc "A\u0005Xm"
		// @040: invokestatic game.C_100085_a.func_102553_z(java.lang.String)char[]
		// @043: invokestatic game.C_100085_a.func_102552_z(char[])java.lang.String
		// @046: aastore
		// @047: dup
		// @048: bipush 6 (0x06)
		// @04A: ldc "N^|)"
		// @04C: invokestatic game.C_100085_a.func_102553_z(java.lang.String)char[]
		// @04F: invokestatic game.C_100085_a.func_102552_z(char[])java.lang.String
		// @052: aastore
		// @053: dup
		// @054: bipush 7 (0x07)
		// @056: ldc "N^v@3"
		// @058: invokestatic game.C_100085_a.func_102553_z(java.lang.String)char[]
		// @05B: invokestatic game.C_100085_a.func_102552_z(char[])java.lang.String
		// @05E: aastore
		// @05F: dup
		// @060: bipush 8 (0x08)
		// @062: ldc "N^s)"
		// @064: invokestatic game.C_100085_a.func_102553_z(java.lang.String)char[]
		// @067: invokestatic game.C_100085_a.func_102552_z(char[])java.lang.String
		// @06A: aastore
		// @06B: dup
		// @06C: bipush 9 (0x09)
		// @06E: ldc "N^p@3"
		// @070: invokestatic game.C_100085_a.func_102553_z(java.lang.String)char[]
		// @073: invokestatic game.C_100085_a.func_102552_z(char[])java.lang.String
		// @076: aastore
		// @077: dup
		// @078: bipush 10 (0x0A)
		// @07A: ldc "N^r@3"
		// @07C: invokestatic game.C_100085_a.func_102553_z(java.lang.String)char[]
		// @07F: invokestatic game.C_100085_a.func_102552_z(char[])java.lang.String
		// @082: aastore
		// @083: dup
		// @084: bipush 11 (0x0B)
		// @086: ldc "N^v)"
		// @088: invokestatic game.C_100085_a.func_102553_z(java.lang.String)char[]
		// @08B: invokestatic game.C_100085_a.func_102552_z(char[])java.lang.String
		// @08E: aastore
		// @08F: dup
		// @090: bipush 12 (0x0C)
		// @092: ldc "N^g)"
		// @094: invokestatic game.C_100085_a.func_102553_z(java.lang.String)char[]
		// @097: invokestatic game.C_100085_a.func_102552_z(char[])java.lang.String
		// @09A: aastore
		// @09B: dup
		// @09C: bipush 13 (0x0D)
		// @09E: ldc "N^`)"
		// @0A0: invokestatic game.C_100085_a.func_102553_z(java.lang.String)char[]
		// @0A3: invokestatic game.C_100085_a.func_102552_z(char[])java.lang.String
		// @0A6: aastore
		// @0A7: dup
		// @0A8: bipush 14 (0x0E)
		// @0AA: ldc "N^})"
		// @0AC: invokestatic game.C_100085_a.func_102553_z(java.lang.String)char[]
		// @0AF: invokestatic game.C_100085_a.func_102552_z(char[])java.lang.String
		// @0B2: aastore
		// @0B3: dup
		// @0B4: bipush 15 (0x0F)
		// @0B6: ldc "N^a)"
		// @0B8: invokestatic game.C_100085_a.func_102553_z(java.lang.String)char[]
		// @0BB: invokestatic game.C_100085_a.func_102552_z(char[])java.lang.String
		// @0BE: aastore
		// @0BF: dup
		// @0C0: bipush 16 (0x10)
		// @0C2: ldc "N^p)"
		// @0C4: invokestatic game.C_100085_a.func_102553_z(java.lang.String)char[]
		// @0C7: invokestatic game.C_100085_a.func_102552_z(char[])java.lang.String
		// @0CA: aastore
		// @0CB: dup
		// @0CC: bipush 17 (0x11)
		// @0CE: ldc "N^f)"
		// @0D0: invokestatic game.C_100085_a.func_102553_z(java.lang.String)char[]
		// @0D3: invokestatic game.C_100085_a.func_102552_z(char[])java.lang.String
		// @0D6: aastore
		// @0D7: dup
		// @0D8: bipush 18 (0x12)
		// @0DA: ldc "N^u@3"
		// @0DC: invokestatic game.C_100085_a.func_102553_z(java.lang.String)char[]
		// @0DF: invokestatic game.C_100085_a.func_102552_z(char[])java.lang.String
		// @0E2: aastore
		// @0E3: dup
		// @0E4: bipush 19 (0x13)
		// @0E6: ldc "N^r)"
		// @0E8: invokestatic game.C_100085_a.func_102553_z(java.lang.String)char[]
		// @0EB: invokestatic game.C_100085_a.func_102552_z(char[])java.lang.String
		// @0EE: aastore
		// @0EF: dup
		// @0F0: bipush 20 (0x14)
		// @0F2: ldc "N^w@3"
		// @0F4: invokestatic game.C_100085_a.func_102553_z(java.lang.String)char[]
		// @0F7: invokestatic game.C_100085_a.func_102552_z(char[])java.lang.String
		// @0FA: aastore
		// @0FB: dup
		// @0FC: bipush 21 (0x15)
		// @0FE: ldc "N^q)"
		// @100: invokestatic game.C_100085_a.func_102553_z(java.lang.String)char[]
		// @103: invokestatic game.C_100085_a.func_102552_z(char[])java.lang.String
		// @106: aastore
		// @107: dup
		// @108: bipush 22 (0x16)
		// @10A: ldc "N^x@3"
		// @10C: invokestatic game.C_100085_a.func_102553_z(java.lang.String)char[]
		// @10F: invokestatic game.C_100085_a.func_102552_z(char[])java.lang.String
		// @112: aastore
		// @113: dup
		// @114: bipush 23 (0x17)
		// @116: ldc "N^u)"
		// @118: invokestatic game.C_100085_a.func_102553_z(java.lang.String)char[]
		// @11B: invokestatic game.C_100085_a.func_102552_z(char[])java.lang.String
		// @11E: aastore
		// @11F: dup
		// @120: bipush 24 (0x18)
		// @122: ldc "N^e)"
		// @124: invokestatic game.C_100085_a.func_102553_z(java.lang.String)char[]
		// @127: invokestatic game.C_100085_a.func_102552_z(char[])java.lang.String
		// @12A: aastore
		// @12B: putstatic java.lang.String[] game.C_100085_a.field_102568_P
		// @12E: ldc "l\u001fZgrH\u0005F`oF\u001fZ"
		// @130: invokestatic game.C_100085_a.func_102553_z(java.lang.String)char[]
		// @133: invokestatic game.C_100085_a.func_102552_z(char[])java.lang.String
		// @136: putstatic java.lang.String game.C_100085_a.field_102570_M
		// @139: ldc "`\u0000Qo"
		// @13B: invokestatic game.C_100085_a.func_102553_z(java.lang.String)char[]
		// @13E: invokestatic game.C_100085_a.func_102552_z(char[])java.lang.String
		// @141: putstatic java.lang.String game.C_100085_a.field_102564_D
		// @144: iconst_0
		// @145: putstatic int game.C_100085_a.field_102571_N
		// @148: ldc "Z\u001eXhvF\u0004Qe"
		// @14A: invokestatic game.C_100085_a.func_102553_z(java.lang.String)char[]
		// @14D: invokestatic game.C_100085_a.func_102552_z(char[])java.lang.String
		// @150: putstatic java.lang.String game.C_100085_a.field_102574_I
		// @153: iconst_0
		// @154: putstatic int game.C_100085_a.field_102565_E
		// @157: return
	}
	
	private static char[] func_102553_z(String arg0)
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
		// @0E: bipush 27 (0x1B)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_102552_z(char[] arg0)
	{
		// @00: aload_0
		// @01: dup
		// @02: arraylength
		// @03: swap
		// @04: iconst_0
		// @05: istore_1
		// @06: goto @4B
		// @09: dup
		// @0A: iload_1
		// @0B: dup2
		// @0C: caload
		// @0D: iload_1
		// @0E: iconst_5
		// @0F: irem
		// @10: tableswitch def: @43, for 0: @30, for 1: @35, for 2: @3A, for 3: @3F
		// @30: bipush 47 (0x2F)
		// @32: goto @45
		// @35: bipush 112 (0x70)
		// @37: goto @45
		// @3A: bipush 52 (0x34)
		// @3C: goto @45
		// @3F: iconst_1
		// @40: goto @45
		// @43: bipush 27 (0x1B)
		// @45: ixor
		// @46: i2c
		// @47: castore
		// @48: iinc #1 +1
		// @4B: swap
		// @4C: dup_x1
		// @4D: iload_1
		// @4E: if_icmpgt @09
		// @51: new java.lang.String
		// @54: dup_x1
		// @55: swap
		// @56: invokespecial java.lang.String.<init>(char[])void
		// @59: invokevirtual java.lang.String.intern()java.lang.String
		// @5C: areturn
	}
}
