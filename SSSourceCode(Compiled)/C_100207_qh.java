package game;

final class C_100207_qh extends C_100085_a implements C_100334_ik
{
	private C_100218_am field_102874_T;
	static int field_102877_Q;
	static String[] field_102876_V;
	static String field_102880_R;
	static String field_102884_Z;
	static String field_102882_Y;
	static byte[] field_102879_S;
	private C_100218_am field_102883_X;
	static String field_102878_P;
	static boolean[] field_102873_U;
	private C_100218_am field_102875_W;
	private static final String[] field_102881_ab;
	
	public static void func_102868_a(byte arg0)
	{
		// @00: aconst_null
		// @01: putstatic boolean[] game.C_100207_qh.field_102873_U
		// @04: aconst_null
		// @05: putstatic byte[] game.C_100207_qh.field_102879_S
		// @08: bipush 23 (0x17)
		// @0A: iload_0
		// @0B: bipush 27 (0x1B)
		// @0D: isub
		// @0E: bipush 50 (0x32)
		// @10: idiv
		// @11: idiv
		// @12: istore_1
		// @13: aconst_null
		// @14: putstatic java.lang.String game.C_100207_qh.field_102882_Y
		// @17: aconst_null
		// @18: putstatic java.lang.String game.C_100207_qh.field_102880_R
		// @1B: aconst_null
		// @1C: putstatic java.lang.String game.C_100207_qh.field_102884_Z
		// @1F: aconst_null
		// @20: putstatic java.lang.String game.C_100207_qh.field_102878_P
		// @23: aconst_null
		// @24: putstatic java.lang.String[] game.C_100207_qh.field_102876_V
		// @27: goto @4C
		// @2A: astore_1
		// @2B: aload_1
		// @2C: new java.lang.StringBuilder
		// @2F: dup
		// @30: invokespecial java.lang.StringBuilder.<init>()void
		// @33: getstatic java.lang.String[] game.C_100207_qh.field_102881_ab
		// @36: bipush 10 (0x0A)
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
	
	static final void func_102871_k(int arg0)
	{
		// @00: ldc ""
		// @02: aconst_null
		// @03: bipush -126 (0x82)
		// @05: invokestatic game.C_100179_ch.func_100803_a(java.lang.String, java.lang.String, int)void
		// @08: iload_0
		// @09: sipush -3476 (0xF26C)
		// @0C: if_icmpeq @16
		// @0F: aconst_null
		// @10: checkcast java.lang.String
		// @13: putstatic java.lang.String game.C_100207_qh.field_102882_Y
		// @16: goto @3A
		// @19: astore_1
		// @1A: aload_1
		// @1B: new java.lang.StringBuilder
		// @1E: dup
		// @1F: invokespecial java.lang.StringBuilder.<init>()void
		// @22: getstatic java.lang.String[] game.C_100207_qh.field_102881_ab
		// @25: iconst_5
		// @26: aaload
		// @27: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2A: iload_0
		// @2B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2E: bipush 41 (0x29)
		// @30: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @33: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @36: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @39: athrow
		// @3A: return
	}
	
	static final boolean func_102872_a(int arg0, C_100327_ib arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #4
		// @05: iload_0
		// @06: sipush -2018 (0xF81E)
		// @09: ixor
		// @0A: invokestatic game.C_100100_i.func_102004_l(int)boolean
		// @0D: ifne @24
		// @10: iconst_0
		// @11: sipush -11145 (0xD477)
		// @14: aload_1
		// @15: getfield int game.C_100327_ib.field_102494_P
		// @18: invokestatic game.C_100080_b.func_104421_a(boolean, int, int)boolean
		// @1B: ifeq @24
		// @1E: goto @22
		// @21: athrow
		// @22: iconst_0
		// @23: ireturn
		// @24: aload_1
		// @25: getfield int game.C_100327_ib.field_102494_P
		// @28: getstatic int[] game.C_100257_ln.field_106481_d
		// @2B: bipush -100 (0x9C)
		// @2D: invokestatic game.C_100097_k.func_104572_a(int, int[], int)boolean
		// @30: ifeq @35
		// @33: iconst_1
		// @34: ireturn
		// @35: bipush -2 (0xFE)
		// @37: aload_1
		// @38: getfield int game.C_100327_ib.field_102497_w
		// @3B: iconst_m1
		// @3C: ixor
		// @3D: if_icmpne @42
		// @40: iconst_0
		// @41: ireturn
		// @42: bipush 117 (0x75)
		// @44: getstatic int[] game.C_100280_nf.field_101178_o
		// @47: iconst_0
		// @48: iaload
		// @49: invokestatic game.C_100042_we.func_104129_b(int, int)int[]
		// @4C: astore_2
		// @4D: iload_0
		// @4E: sipush 1951 (0x079F)
		// @51: if_icmpeq @62
		// @54: bipush 113 (0x71)
		// @56: bipush -72 (0xB8)
		// @58: bipush 53 (0x35)
		// @5A: iconst_1
		// @5B: invokestatic game.C_100207_qh.func_102865_a(int, int, int, boolean)void
		// @5E: goto @62
		// @61: athrow
		// @62: iconst_0
		// @63: istore_3
		// @64: aload_2
		// @65: arraylength
		// @66: bipush -8 (0xF8)
		// @68: iadd
		// @69: iconst_m1
		// @6A: ixor
		// @6B: iload_3
		// @6C: iconst_m1
		// @6D: ixor
		// @6E: if_icmpge @8E
		// @71: aload_1
		// @72: getfield int game.C_100327_ib.field_102494_P
		// @75: iload #4
		// @77: ifne @8F
		// @7A: aload_2
		// @7B: iload_3
		// @7C: iaload
		// @7D: if_icmpne @86
		// @80: goto @84
		// @83: athrow
		// @84: iconst_1
		// @85: ireturn
		// @86: iinc #3 +1
		// @89: iload #4
		// @8B: ifeq @64
		// @8E: iconst_0
		// @8F: ireturn
		// @90: astore_2
		// @91: aload_2
		// @92: new java.lang.StringBuilder
		// @95: dup
		// @96: invokespecial java.lang.StringBuilder.<init>()void
		// @99: getstatic java.lang.String[] game.C_100207_qh.field_102881_ab
		// @9C: bipush 8 (0x08)
		// @9E: aaload
		// @9F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @A2: iload_0
		// @A3: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A6: bipush 44 (0x2C)
		// @A8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @AB: aload_1
		// @AC: ifnull @B8
		// @AF: getstatic java.lang.String[] game.C_100207_qh.field_102881_ab
		// @B2: iconst_2
		// @B3: aaload
		// @B4: goto @BD
		// @B7: athrow
		// @B8: getstatic java.lang.String[] game.C_100207_qh.field_102881_ab
		// @BB: iconst_0
		// @BC: aaload
		// @BD: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @C0: bipush 41 (0x29)
		// @C2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C5: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @C8: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @CB: athrow
	}
	
	public final void func_102581_a(int arg0, int arg1, byte arg2, C_100218_am arg3, int arg4)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #7
		// @05: bipush 31 (0x1F)
		// @07: iload_3
		// @08: bipush -2 (0xFE)
		// @0A: isub
		// @0B: bipush 52 (0x34)
		// @0D: idiv
		// @0E: idiv
		// @0F: istore #6
		// @11: aload_0
		// @12: getfield game.C_100218_am game.C_100207_qh.field_102883_X
		// @15: aload #4
		// @17: if_acmpeq @50
		// @1A: aload #4
		// @1C: aload_0
		// @1D: getfield game.C_100218_am game.C_100207_qh.field_102874_T
		// @20: if_acmpeq @42
		// @23: goto @27
		// @26: athrow
		// @27: aload #4
		// @29: aload_0
		// @2A: getfield game.C_100218_am game.C_100207_qh.field_102875_W
		// @2D: if_acmpeq @38
		// @30: goto @34
		// @33: athrow
		// @34: goto @5A
		// @37: athrow
		// @38: bipush -60 (0xC4)
		// @3A: invokestatic game.C_100059_df.func_101587_i(int)void
		// @3D: iload #7
		// @3F: ifeq @5A
		// @42: bipush -110 (0x92)
		// @44: invokestatic game.C_100211_qd.func_102124_l(int)void
		// @47: iload #7
		// @49: ifeq @5A
		// @4C: goto @50
		// @4F: athrow
		// @50: sipush -3476 (0xF26C)
		// @53: invokestatic game.C_100207_qh.func_102871_k(int)void
		// @56: goto @5A
		// @59: athrow
		// @5A: goto @B8
		// @5D: astore #6
		// @5F: aload #6
		// @61: new java.lang.StringBuilder
		// @64: dup
		// @65: invokespecial java.lang.StringBuilder.<init>()void
		// @68: getstatic java.lang.String[] game.C_100207_qh.field_102881_ab
		// @6B: bipush 11 (0x0B)
		// @6D: aaload
		// @6E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @71: iload_1
		// @72: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @75: bipush 44 (0x2C)
		// @77: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7A: iload_2
		// @7B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7E: bipush 44 (0x2C)
		// @80: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @83: iload_3
		// @84: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @87: bipush 44 (0x2C)
		// @89: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8C: aload #4
		// @8E: ifnull @9A
		// @91: getstatic java.lang.String[] game.C_100207_qh.field_102881_ab
		// @94: iconst_2
		// @95: aaload
		// @96: goto @9F
		// @99: athrow
		// @9A: getstatic java.lang.String[] game.C_100207_qh.field_102881_ab
		// @9D: iconst_0
		// @9E: aaload
		// @9F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @A2: bipush 44 (0x2C)
		// @A4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A7: iload #5
		// @A9: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @AC: bipush 41 (0x29)
		// @AE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B1: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @B4: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @B7: athrow
		// @B8: return
	}
	
	final boolean func_102506_a(char arg0, int arg1, int arg2, C_100336_im arg3)
	{
		// @00: iload_3
		// @01: sipush 22545 (0x5811)
		// @04: if_icmpeq @09
		// @07: iconst_1
		// @08: ireturn
		// @09: aload_0
		// @0A: iload_1
		// @0B: iload_2
		// @0C: iload_3
		// @0D: iconst_0
		// @0E: iadd
		// @0F: aload #4
		// @11: invokespecial game.C_100085_a.func_102506_a(char, int, int, game.C_100336_im)boolean
		// @14: ifeq @19
		// @17: iconst_1
		// @18: ireturn
		// @19: bipush -99 (0x9D)
		// @1B: iload_2
		// @1C: iconst_m1
		// @1D: ixor
		// @1E: if_icmpeq @25
		// @21: goto @31
		// @24: athrow
		// @25: aload_0
		// @26: aload #4
		// @28: iload_3
		// @29: sipush -22438 (0xA85A)
		// @2C: iadd
		// @2D: invokevirtual game.C_100207_qh.func_102555_a(game.C_100336_im, int)boolean
		// @30: ireturn
		// @31: iload_2
		// @32: iconst_m1
		// @33: ixor
		// @34: bipush -100 (0x9C)
		// @36: if_icmpne @43
		// @39: aload_0
		// @3A: sipush -17543 (0xBB79)
		// @3D: aload #4
		// @3F: invokevirtual game.C_100207_qh.func_102558_b(int, game.C_100336_im)boolean
		// @42: ireturn
		// @43: iconst_0
		// @44: ireturn
		// @45: astore #5
		// @47: aload #5
		// @49: new java.lang.StringBuilder
		// @4C: dup
		// @4D: invokespecial java.lang.StringBuilder.<init>()void
		// @50: getstatic java.lang.String[] game.C_100207_qh.field_102881_ab
		// @53: iconst_3
		// @54: aaload
		// @55: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @58: iload_1
		// @59: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5C: bipush 44 (0x2C)
		// @5E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @61: iload_2
		// @62: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @65: bipush 44 (0x2C)
		// @67: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6A: iload_3
		// @6B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6E: bipush 44 (0x2C)
		// @70: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @73: aload #4
		// @75: ifnull @81
		// @78: getstatic java.lang.String[] game.C_100207_qh.field_102881_ab
		// @7B: iconst_2
		// @7C: aaload
		// @7D: goto @86
		// @80: athrow
		// @81: getstatic java.lang.String[] game.C_100207_qh.field_102881_ab
		// @84: iconst_0
		// @85: aaload
		// @86: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @89: bipush 41 (0x29)
		// @8B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @91: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @94: athrow
	}
	
	static final void func_102865_a(int arg0, int arg1, int arg2, boolean arg3)
	{
		// @00: bipush 104 (0x68)
		// @02: iload_3
		// @03: invokestatic game.C_100270_mi.func_102255_b(int, boolean)void
		// @06: iload_0
		// @07: bipush -30 (0xE2)
		// @09: if_icmplt @1C
		// @0C: bipush 69 (0x45)
		// @0E: aconst_null
		// @0F: checkcast java.lang.String
		// @12: bipush -17 (0xEF)
		// @14: invokestatic game.C_100207_qh.func_102866_a(byte, java.lang.String, int)java.lang.String
		// @17: pop
		// @18: goto @1C
		// @1B: athrow
		// @1C: iload_3
		// @1D: iload_2
		// @1E: iload_1
		// @1F: sipush -641 (0xFD7F)
		// @22: invokestatic game.C_100154_sl.func_105328_a(boolean, int, int, int)void
		// @25: goto @67
		// @28: astore #4
		// @2A: aload #4
		// @2C: new java.lang.StringBuilder
		// @2F: dup
		// @30: invokespecial java.lang.StringBuilder.<init>()void
		// @33: getstatic java.lang.String[] game.C_100207_qh.field_102881_ab
		// @36: bipush 9 (0x09)
		// @38: aaload
		// @39: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3C: iload_0
		// @3D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @40: bipush 44 (0x2C)
		// @42: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @45: iload_1
		// @46: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @49: bipush 44 (0x2C)
		// @4B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4E: iload_2
		// @4F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @52: bipush 44 (0x2C)
		// @54: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @57: iload_3
		// @58: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @5B: bipush 41 (0x29)
		// @5D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @60: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @63: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @66: athrow
		// @67: return
	}
	
	static final String func_102866_a(byte arg0, String arg1, int arg2)
	{
		// @000: aload_1
		// @001: bipush 8 (0x08)
		// @003: invokestatic game.C_100240_oj.func_106310_a(java.lang.CharSequence, byte)boolean
		// @006: ifne @00D
		// @009: getstatic java.lang.String game.C_100315_la.field_107175_g
		// @00C: areturn
		// @00D: aload_1
		// @00E: iload_0
		// @00F: sipush -7415 (0xE309)
		// @012: iadd
		// @013: invokestatic game.C_100050_vg.func_100621_a(java.lang.String, int)boolean
		// @016: ifeq @01D
		// @019: getstatic java.lang.String game.C_100255_pj.field_105253_u
		// @01C: areturn
		// @01D: bipush -3 (0xFD)
		// @01F: getstatic int game.C_100062_dk.field_104281_d
		// @022: iconst_m1
		// @023: ixor
		// @024: if_icmpeq @02B
		// @027: getstatic java.lang.String game.C_100066_dl.field_101645_y
		// @02A: areturn
		// @02B: aload_1
		// @02C: bipush -45 (0xD3)
		// @02E: invokestatic game.C_100032_gk.func_103125_a(java.lang.String, byte)boolean
		// @031: ifne @038
		// @034: goto @04C
		// @037: athrow
		// @038: iload_0
		// @039: sipush -30878 (0x8762)
		// @03C: ixor
		// @03D: iconst_1
		// @03E: anewarray java.lang.String
		// @041: dup
		// @042: iconst_0
		// @043: aload_1
		// @044: aastore
		// @045: getstatic java.lang.String game.C_100203_ql.field_105928_d
		// @048: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @04B: areturn
		// @04C: bipush -101 (0x9B)
		// @04E: getstatic int game.C_100316_lc.field_102407_A
		// @051: iconst_m1
		// @052: ixor
		// @053: if_icmpge @05A
		// @056: goto @05E
		// @059: athrow
		// @05A: getstatic java.lang.String game.C_100231_oc.field_102195_Xb
		// @05D: areturn
		// @05E: aload_1
		// @05F: bipush 120 (0x78)
		// @061: invokestatic game.C_100099_fb.func_103035_a(java.lang.String, byte)boolean
		// @064: ifeq @079
		// @067: sipush -30945 (0x871F)
		// @06A: iconst_1
		// @06B: anewarray java.lang.String
		// @06E: dup
		// @06F: iconst_0
		// @070: aload_1
		// @071: aastore
		// @072: getstatic java.lang.String game.C_100143_bl.field_105099_f
		// @075: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @078: areturn
		// @079: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @07C: astore_3
		// @07D: aload_3
		// @07E: iload_2
		// @07F: bipush 106 (0x6A)
		// @081: invokevirtual game.C_100278_nd.func_101189_h(int, int)void
		// @084: iload_0
		// @085: bipush 125 (0x7D)
		// @087: if_icmpeq @095
		// @08A: aconst_null
		// @08B: checkcast java.lang.String
		// @08E: putstatic java.lang.String game.C_100207_qh.field_102878_P
		// @091: goto @095
		// @094: athrow
		// @095: aload_3
		// @096: dup
		// @097: getfield int game.C_100278_nd.field_101177_n
		// @09A: iconst_1
		// @09B: iadd
		// @09C: putfield int game.C_100278_nd.field_101177_n
		// @09F: aload_3
		// @0A0: getfield int game.C_100278_nd.field_101177_n
		// @0A3: istore #4
		// @0A5: aload_3
		// @0A6: sipush 7838 (0x1E9E)
		// @0A9: iconst_2
		// @0AA: invokevirtual game.C_100278_nd.func_101169_f(int, int)void
		// @0AD: aload_3
		// @0AE: iload_0
		// @0AF: sipush -28490 (0x90B6)
		// @0B2: iadd
		// @0B3: aload_1
		// @0B4: invokevirtual game.C_100278_nd.func_101167_a(int, java.lang.String)void
		// @0B7: aload_3
		// @0B8: iload #4
		// @0BA: ineg
		// @0BB: aload_3
		// @0BC: getfield int game.C_100278_nd.field_101177_n
		// @0BF: iadd
		// @0C0: bipush -118 (0x8A)
		// @0C2: invokevirtual game.C_100278_nd.func_101139_c(int, byte)void
		// @0C5: aconst_null
		// @0C6: areturn
		// @0C7: astore_3
		// @0C8: aload_3
		// @0C9: new java.lang.StringBuilder
		// @0CC: dup
		// @0CD: invokespecial java.lang.StringBuilder.<init>()void
		// @0D0: getstatic java.lang.String[] game.C_100207_qh.field_102881_ab
		// @0D3: bipush 6 (0x06)
		// @0D5: aaload
		// @0D6: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0D9: iload_0
		// @0DA: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0DD: bipush 44 (0x2C)
		// @0DF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0E2: aload_1
		// @0E3: ifnull @0EF
		// @0E6: getstatic java.lang.String[] game.C_100207_qh.field_102881_ab
		// @0E9: iconst_2
		// @0EA: aaload
		// @0EB: goto @0F4
		// @0EE: athrow
		// @0EF: getstatic java.lang.String[] game.C_100207_qh.field_102881_ab
		// @0F2: iconst_0
		// @0F3: aaload
		// @0F4: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0F7: bipush 44 (0x2C)
		// @0F9: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0FC: iload_2
		// @0FD: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @100: bipush 41 (0x29)
		// @102: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @105: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @108: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @10B: athrow
	}
	
	final void func_102528_a(int arg0, int arg1, int arg2, byte arg3)
	{
		// @00: iload_3
		// @01: aload_0
		// @02: getfield int game.C_100207_qh.field_102538_m
		// @05: iadd
		// @06: istore #5
		// @08: iload #4
		// @0A: bipush -126 (0x82)
		// @0C: if_icmple @1A
		// @0F: aconst_null
		// @10: checkcast byte[]
		// @13: putstatic byte[] game.C_100207_qh.field_102879_S
		// @16: goto @1A
		// @19: athrow
		// @1A: iload_2
		// @1B: aload_0
		// @1C: getfield int game.C_100207_qh.field_102541_w
		// @1F: iadd
		// @20: istore #6
		// @22: getstatic game.C_100112_r game.C_100230_of.field_106205_g
		// @25: getstatic java.lang.String game.C_100047_vh.field_104154_a
		// @28: iload #5
		// @2A: bipush 20 (0x14)
		// @2C: iadd
		// @2D: iload #6
		// @2F: bipush -20 (0xEC)
		// @31: isub
		// @32: aload_0
		// @33: getfield int game.C_100207_qh.field_102537_l
		// @36: bipush 40 (0x28)
		// @38: isub
		// @39: aload_0
		// @3A: getfield int game.C_100207_qh.field_102544_t
		// @3D: bipush -50 (0xCE)
		// @3F: iadd
		// @40: ldc 16777215 (0xffffff)
		// @42: iconst_m1
		// @43: iconst_1
		// @44: iconst_0
		// @45: getstatic game.C_100112_r game.C_100230_of.field_106205_g
		// @48: getfield int game.C_100112_r.field_101772_Q
		// @4B: invokevirtual game.C_100112_r.func_101729_a(java.lang.String, int, int, int, int, int, int, int, int, int)int
		// @4E: pop
		// @4F: aload_0
		// @50: iload_1
		// @51: iload_2
		// @52: iload_3
		// @53: bipush -127 (0x81)
		// @55: invokespecial game.C_100085_a.func_102528_a(int, int, int, byte)void
		// @58: goto @9A
		// @5B: astore #5
		// @5D: aload #5
		// @5F: new java.lang.StringBuilder
		// @62: dup
		// @63: invokespecial java.lang.StringBuilder.<init>()void
		// @66: getstatic java.lang.String[] game.C_100207_qh.field_102881_ab
		// @69: iconst_4
		// @6A: aaload
		// @6B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @6E: iload_1
		// @6F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @72: bipush 44 (0x2C)
		// @74: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @77: iload_2
		// @78: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7B: bipush 44 (0x2C)
		// @7D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @80: iload_3
		// @81: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @84: bipush 44 (0x2C)
		// @86: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @89: iload #4
		// @8B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8E: bipush 41 (0x29)
		// @90: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @93: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @96: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @99: athrow
		// @9A: return
	}
	
	public C_100207_qh()
	{
		// @000: aload_0
		// @001: iconst_0
		// @002: iconst_0
		// @003: sipush 476 (0x01DC)
		// @006: sipush 225 (0x00E1)
		// @009: aconst_null
		// @00A: invokespecial game.C_100085_a.<init>(int, int, int, int, game.C_100326_ic)void
		// @00D: aload_0
		// @00E: new game.C_100218_am
		// @011: dup
		// @012: getstatic java.lang.String game.C_100203_ql.field_105930_b
		// @015: aconst_null
		// @016: invokespecial game.C_100218_am.<init>(java.lang.String, game.C_100337_in)void
		// @019: putfield game.C_100218_am game.C_100207_qh.field_102874_T
		// @01C: aload_0
		// @01D: new game.C_100218_am
		// @020: dup
		// @021: getstatic java.lang.String game.C_100207_qh.field_102882_Y
		// @024: aconst_null
		// @025: invokespecial game.C_100218_am.<init>(java.lang.String, game.C_100337_in)void
		// @028: putfield game.C_100218_am game.C_100207_qh.field_102883_X
		// @02B: aload_0
		// @02C: new game.C_100218_am
		// @02F: dup
		// @030: getstatic java.lang.String game.C_100287_nm.field_106833_i
		// @033: aconst_null
		// @034: invokespecial game.C_100218_am.<init>(java.lang.String, game.C_100337_in)void
		// @037: putfield game.C_100218_am game.C_100207_qh.field_102875_W
		// @03A: new game.C_100310_lj
		// @03D: dup
		// @03E: invokespecial game.C_100310_lj.<init>()void
		// @041: astore_1
		// @042: aload_0
		// @043: getfield game.C_100218_am game.C_100207_qh.field_102874_T
		// @046: aload_1
		// @047: putfield game.C_100326_ic game.C_100218_am.field_102533_B
		// @04A: aload_0
		// @04B: getfield game.C_100218_am game.C_100207_qh.field_102883_X
		// @04E: aload_1
		// @04F: putfield game.C_100326_ic game.C_100218_am.field_102533_B
		// @052: aload_0
		// @053: getfield game.C_100218_am game.C_100207_qh.field_102875_W
		// @056: aload_1
		// @057: putfield game.C_100326_ic game.C_100218_am.field_102533_B
		// @05A: iconst_4
		// @05B: istore_2
		// @05C: sipush 326 (0x0146)
		// @05F: istore_3
		// @060: iload_2
		// @061: ineg
		// @062: iload_3
		// @063: iadd
		// @064: ldc 358802689 (0x1562e501)
		// @066: ishr
		// @067: istore #4
		// @069: aload_0
		// @06A: getfield game.C_100218_am game.C_100207_qh.field_102883_X
		// @06D: bipush 30 (0x1E)
		// @06F: bipush -48 (0xD0)
		// @071: aload_0
		// @072: getfield int game.C_100207_qh.field_102544_t
		// @075: iload_2
		// @076: isub
		// @077: iadd
		// @078: iload_3
		// @079: ineg
		// @07A: aload_0
		// @07B: getfield int game.C_100207_qh.field_102537_l
		// @07E: iadd
		// @07F: ldc -916139423 (0xc964d261)
		// @081: ishr
		// @082: iload #4
		// @084: bipush 98 (0x62)
		// @086: invokevirtual game.C_100218_am.func_102524_a(int, int, int, int, byte)void
		// @089: aload_0
		// @08A: getfield game.C_100218_am game.C_100207_qh.field_102875_W
		// @08D: bipush 30 (0x1E)
		// @08F: iload_2
		// @090: ineg
		// @091: aload_0
		// @092: getfield int game.C_100207_qh.field_102544_t
		// @095: bipush -48 (0xD0)
		// @097: iadd
		// @098: iadd
		// @099: iload_2
		// @09A: aload_0
		// @09B: getfield int game.C_100207_qh.field_102537_l
		// @09E: iload_3
		// @09F: ineg
		// @0A0: iadd
		// @0A1: ldc -105387807 (0xf9b7e8e1)
		// @0A3: ishr
		// @0A4: iadd
		// @0A5: iload #4
		// @0A7: iadd
		// @0A8: iload #4
		// @0AA: bipush 80 (0x50)
		// @0AC: invokevirtual game.C_100218_am.func_102524_a(int, int, int, int, byte)void
		// @0AF: aload_0
		// @0B0: getfield game.C_100218_am game.C_100207_qh.field_102874_T
		// @0B3: bipush 30 (0x1E)
		// @0B5: aload_0
		// @0B6: getfield int game.C_100207_qh.field_102544_t
		// @0B9: bipush 78 (0x4E)
		// @0BB: isub
		// @0BC: iconst_2
		// @0BD: iload_2
		// @0BE: imul
		// @0BF: ineg
		// @0C0: iadd
		// @0C1: aload_0
		// @0C2: getfield int game.C_100207_qh.field_102537_l
		// @0C5: iload_3
		// @0C6: isub
		// @0C7: ldc -11886271 (0xff4aa141)
		// @0C9: ishr
		// @0CA: iload_3
		// @0CB: bipush -93 (0xA3)
		// @0CD: invokevirtual game.C_100218_am.func_102524_a(int, int, int, int, byte)void
		// @0D0: aload_0
		// @0D1: getfield game.C_100218_am game.C_100207_qh.field_102883_X
		// @0D4: aload_0
		// @0D5: putfield game.C_100337_in game.C_100218_am.field_102543_u
		// @0D8: aload_0
		// @0D9: getfield game.C_100218_am game.C_100207_qh.field_102874_T
		// @0DC: aload_0
		// @0DD: putfield game.C_100337_in game.C_100218_am.field_102543_u
		// @0E0: aload_0
		// @0E1: getfield game.C_100218_am game.C_100207_qh.field_102874_T
		// @0E4: getstatic java.lang.String game.C_100169_co.field_105528_a
		// @0E7: putfield java.lang.String game.C_100218_am.field_102536_o
		// @0EA: aload_0
		// @0EB: getfield game.C_100218_am game.C_100207_qh.field_102875_W
		// @0EE: aload_0
		// @0EF: putfield game.C_100337_in game.C_100218_am.field_102543_u
		// @0F2: aload_0
		// @0F3: getfield game.C_100218_am game.C_100207_qh.field_102875_W
		// @0F6: getstatic java.lang.String game.C_100155_dc.field_105348_g
		// @0F9: putfield java.lang.String game.C_100218_am.field_102536_o
		// @0FC: aload_0
		// @0FD: aload_0
		// @0FE: getfield game.C_100218_am game.C_100207_qh.field_102883_X
		// @101: iconst_1
		// @102: invokevirtual game.C_100207_qh.func_102561_b(game.C_100336_im, int)void
		// @105: aload_0
		// @106: aload_0
		// @107: getfield game.C_100218_am game.C_100207_qh.field_102874_T
		// @10A: iconst_1
		// @10B: invokevirtual game.C_100207_qh.func_102561_b(game.C_100336_im, int)void
		// @10E: aload_0
		// @10F: aload_0
		// @110: getfield game.C_100218_am game.C_100207_qh.field_102875_W
		// @113: iconst_1
		// @114: invokevirtual game.C_100207_qh.func_102561_b(game.C_100336_im, int)void
		// @117: goto @126
		// @11A: astore_1
		// @11B: aload_1
		// @11C: getstatic java.lang.String[] game.C_100207_qh.field_102881_ab
		// @11F: bipush 7 (0x07)
		// @121: aaload
		// @122: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @125: athrow
		// @126: return
	}
	
	static final C_100037_wb[] func_102870_a(C_100037_wb arg0, int arg1)
	{
		// @00: bipush 9 (0x09)
		// @02: anewarray game.C_100037_wb
		// @05: astore_2
		// @06: aload_2
		// @07: iconst_4
		// @08: aload_0
		// @09: aastore
		// @0A: iload_1
		// @0B: ifeq @13
		// @0E: aconst_null
		// @0F: checkcast game.C_100037_wb[]
		// @12: areturn
		// @13: aload_2
		// @14: areturn
		// @15: astore_2
		// @16: aload_2
		// @17: new java.lang.StringBuilder
		// @1A: dup
		// @1B: invokespecial java.lang.StringBuilder.<init>()void
		// @1E: getstatic java.lang.String[] game.C_100207_qh.field_102881_ab
		// @21: iconst_1
		// @22: aaload
		// @23: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @26: aload_0
		// @27: ifnull @33
		// @2A: getstatic java.lang.String[] game.C_100207_qh.field_102881_ab
		// @2D: iconst_2
		// @2E: aaload
		// @2F: goto @38
		// @32: athrow
		// @33: getstatic java.lang.String[] game.C_100207_qh.field_102881_ab
		// @36: iconst_0
		// @37: aaload
		// @38: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3B: bipush 44 (0x2C)
		// @3D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @40: iload_1
		// @41: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @44: bipush 41 (0x29)
		// @46: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @49: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4F: athrow
	}
	
	static
	{
		// @000: bipush 12 (0x0C)
		// @002: anewarray java.lang.String
		// @005: dup
		// @006: iconst_0
		// @007: ldc "8]qS"
		// @009: invokestatic game.C_100207_qh.func_102869_z(java.lang.String)char[]
		// @00C: invokestatic game.C_100207_qh.func_102867_z(char[])java.lang.String
		// @00F: aastore
		// @010: dup
		// @011: iconst_1
		// @012: ldc "'@3x5~"
		// @014: invokestatic game.C_100207_qh.func_102869_z(java.lang.String)char[]
		// @017: invokestatic game.C_100207_qh.func_102867_z(char[])java.lang.String
		// @01A: aastore
		// @01B: dup
		// @01C: iconst_2
		// @01D: ldc "-\u00063\u0011\t"
		// @01F: invokestatic game.C_100207_qh.func_102869_z(java.lang.String)char[]
		// @022: invokestatic game.C_100207_qh.func_102867_z(char[])java.lang.String
		// @025: aastore
		// @026: dup
		// @027: iconst_3
		// @028: ldc "'@3y5~"
		// @02A: invokestatic game.C_100207_qh.func_102869_z(java.lang.String)char[]
		// @02D: invokestatic game.C_100207_qh.func_102867_z(char[])java.lang.String
		// @030: aastore
		// @031: dup
		// @032: iconst_4
		// @033: ldc "'@3|\\"
		// @035: invokestatic game.C_100207_qh.func_102869_z(java.lang.String)char[]
		// @038: invokestatic game.C_100207_qh.func_102867_z(char[])java.lang.String
		// @03B: aastore
		// @03C: dup
		// @03D: iconst_5
		// @03E: ldc "'@3v5~"
		// @040: invokestatic game.C_100207_qh.func_102869_z(java.lang.String)char[]
		// @043: invokestatic game.C_100207_qh.func_102867_z(char[])java.lang.String
		// @046: aastore
		// @047: dup
		// @048: bipush 6 (0x06)
		// @04A: ldc "'@3w5~"
		// @04C: invokestatic game.C_100207_qh.func_102869_z(java.lang.String)char[]
		// @04F: invokestatic game.C_100207_qh.func_102867_z(char[])java.lang.String
		// @052: aastore
		// @053: dup
		// @054: bipush 7 (0x07)
		// @056: ldc "'@3\u0003\u001d8Ai\u0001\\\u007f"
		// @058: invokestatic game.C_100207_qh.func_102869_z(java.lang.String)char[]
		// @05B: invokestatic game.C_100207_qh.func_102867_z(char[])java.lang.String
		// @05E: aastore
		// @05F: dup
		// @060: bipush 8 (0x08)
		// @062: ldc "'@3r5~"
		// @064: invokestatic game.C_100207_qh.func_102869_z(java.lang.String)char[]
		// @067: invokestatic game.C_100207_qh.func_102867_z(char[])java.lang.String
		// @06A: aastore
		// @06B: dup
		// @06C: bipush 9 (0x09)
		// @06E: ldc "'@3t5~"
		// @070: invokestatic game.C_100207_qh.func_102869_z(java.lang.String)char[]
		// @073: invokestatic game.C_100207_qh.func_102867_z(char[])java.lang.String
		// @076: aastore
		// @077: dup
		// @078: bipush 10 (0x0A)
		// @07A: ldc "'@3q5~"
		// @07C: invokestatic game.C_100207_qh.func_102869_z(java.lang.String)char[]
		// @07F: invokestatic game.C_100207_qh.func_102867_z(char[])java.lang.String
		// @082: aastore
		// @083: dup
		// @084: bipush 11 (0x0B)
		// @086: ldc "'@3u5~"
		// @088: invokestatic game.C_100207_qh.func_102869_z(java.lang.String)char[]
		// @08B: invokestatic game.C_100207_qh.func_102867_z(char[])java.lang.String
		// @08E: aastore
		// @08F: putstatic java.lang.String[] game.C_100207_qh.field_102881_ab
		// @092: bipush 8 (0x08)
		// @094: anewarray java.lang.String
		// @097: dup
		// @098: iconst_0
		// @099: ldc "\u0006gJz&voXq1\u0004iIv;\u0018"
		// @09B: invokestatic game.C_100207_qh.func_102869_z(java.lang.String)char[]
		// @09E: invokestatic game.C_100207_qh.func_102867_z(char[])java.lang.String
		// @0A1: aastore
		// @0A2: dup
		// @0A3: iconst_1
		// @0A4: ldc "\u0013fXm3\u000f\u0008Nk;\u0004iZz"
		// @0A6: invokestatic game.C_100207_qh.func_102869_z(java.lang.String)char[]
		// @0A9: invokestatic game.C_100207_qh.func_102867_z(char[])java.lang.String
		// @0AC: aastore
		// @0AD: dup
		// @0AE: iconst_2
		// @0AF: ldc "\u0013fXm3\u000f\u0008Nw=\u0013dYv:\u0011"
		// @0B1: invokestatic game.C_100207_qh.func_102869_z(java.lang.String)char[]
		// @0B4: invokestatic game.C_100207_qh.func_102867_z(char[])java.lang.String
		// @0B7: aastore
		// @0B8: dup
		// @0B9: iconst_3
		// @0BA: ldc "\u0017zPp!\u0004"
		// @0BC: invokestatic game.C_100207_qh.func_102869_z(java.lang.String)char[]
		// @0BF: invokestatic game.C_100207_qh.func_102867_z(char[])java.lang.String
		// @0C2: aastore
		// @0C3: dup
		// @0C4: iconst_4
		// @0C5: ldc "\u0002iOx1\u0002aSx"
		// @0C7: invokestatic game.C_100207_qh.func_102869_z(java.lang.String)char[]
		// @0CA: invokestatic game.C_100207_qh.func_102867_z(char[])java.lang.String
		// @0CD: aastore
		// @0CE: dup
		// @0CF: iconst_5
		// @0D0: ldc "\u0001m\\o;\u0018\u0008Xq<\u0017f^z9\u0013fI"
		// @0D2: invokestatic game.C_100207_qh.func_102869_z(java.lang.String)char[]
		// @0D5: invokestatic game.C_100207_qh.func_102867_z(char[])java.lang.String
		// @0D8: aastore
		// @0D9: dup
		// @0DA: bipush 6 (0x06)
		// @0DC: ldc "\u0002z\\q'\u0006gOk5\u0002aRq"
		// @0DE: invokestatic game.C_100207_qh.func_102869_z(java.lang.String)char[]
		// @0E1: invokestatic game.C_100207_qh.func_102867_z(char[])java.lang.String
		// @0E4: aastore
		// @0E5: dup
		// @0E6: bipush 7 (0x07)
		// @0E8: ldc "\u0019|Uz&"
		// @0EA: invokestatic game.C_100207_qh.func_102869_z(java.lang.String)char[]
		// @0ED: invokestatic game.C_100207_qh.func_102867_z(char[])java.lang.String
		// @0F0: aastore
		// @0F1: putstatic java.lang.String[] game.C_100207_qh.field_102876_V
		// @0F4: ldc "\u0013p^s!\u0005aKz"
		// @0F6: invokestatic game.C_100207_qh.func_102869_z(java.lang.String)char[]
		// @0F9: invokestatic game.C_100207_qh.func_102867_z(char[])java.lang.String
		// @0FC: putstatic java.lang.String game.C_100207_qh.field_102880_R
		// @0FF: iconst_m1
		// @100: putstatic int game.C_100207_qh.field_102877_Q
		// @103: ldc "\u0011G=}\u00155C"
		// @105: invokestatic game.C_100207_qh.func_102869_z(java.lang.String)char[]
		// @108: invokestatic game.C_100207_qh.func_102867_z(char[])java.lang.String
		// @10B: putstatic java.lang.String game.C_100207_qh.field_102882_Y
		// @10E: ldc "\u0013F~P\u0001$IzV\u001a1\u0008oJ\u00183\u0008\u007fM\u00117CtQ\u0013"
		// @110: invokestatic game.C_100207_qh.func_102869_z(java.lang.String)char[]
		// @113: invokestatic game.C_100207_qh.func_102867_z(char[])java.lang.String
		// @116: putstatic java.lang.String game.C_100207_qh.field_102884_Z
		// @119: ldc "\u0002G=O\u00187Q=^T;]qK\u001d&D|F\u0011$\u0008z^\u00193\u0004=O\u00183InZT:Gz\u001f\u001d8\u0008rMT5Zx^\u00003\u0008|\u001f\u0012$Mx\u001f\u00155KrJ\u001a\"\u0006"
		// @11B: invokestatic game.C_100207_qh.func_102869_z(java.lang.String)char[]
		// @11E: invokestatic game.C_100207_qh.func_102867_z(char[])java.lang.String
		// @121: putstatic java.lang.String game.C_100207_qh.field_102878_P
		// @124: return
	}
	
	private static char[] func_102869_z(String arg0)
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
		// @0E: bipush 116 (0x74)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_102867_z(char[] arg0)
	{
		// @00: aload_0
		// @01: dup
		// @02: arraylength
		// @03: swap
		// @04: iconst_0
		// @05: istore_1
		// @06: goto @4C
		// @09: dup
		// @0A: iload_1
		// @0B: dup2
		// @0C: caload
		// @0D: iload_1
		// @0E: iconst_5
		// @0F: irem
		// @10: tableswitch def: @44, for 0: @30, for 1: @35, for 2: @3A, for 3: @3F
		// @30: bipush 86 (0x56)
		// @32: goto @46
		// @35: bipush 40 (0x28)
		// @37: goto @46
		// @3A: bipush 29 (0x1D)
		// @3C: goto @46
		// @3F: bipush 63 (0x3F)
		// @41: goto @46
		// @44: bipush 116 (0x74)
		// @46: ixor
		// @47: i2c
		// @48: castore
		// @49: iinc #1 +1
		// @4C: swap
		// @4D: dup_x1
		// @4E: iload_1
		// @4F: if_icmpgt @09
		// @52: new java.lang.String
		// @55: dup_x1
		// @56: swap
		// @57: invokespecial java.lang.String.<init>(char[])void
		// @5A: invokevirtual java.lang.String.intern()java.lang.String
		// @5D: areturn
	}
}
