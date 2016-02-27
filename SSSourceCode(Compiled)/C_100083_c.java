package game;

class C_100083_c extends C_100218_am
{
	private C_100202_qi field_103169_P;
	static C_100037_wb field_103167_V;
	static int field_103171_R;
	static volatile int field_103172_O;
	private C_100297_kf field_103166_W;
	static C_100302_ka field_103164_U;
	private String[] field_103165_T;
	static C_100202_qi field_103168_Q;
	static C_100037_wb field_103170_S;
	static String field_103174_X;
	private static final String[] field_103173_Y;
	
	final void func_103157_b(int arg0, int arg1, int arg2, int arg3)
	{
		// @00: aload_0
		// @01: aload_0
		// @02: getfield game.C_100326_ic game.C_100083_c.field_102533_B
		// @05: checkcast game.C_100184_rn
		// @08: iconst_3
		// @09: aload_0
		// @0A: invokeinterface game.C_100184_rn.func_100442_a(int, game.C_100336_im)int
		// @0F: iload_3
		// @10: iload_2
		// @11: iload_1
		// @12: bipush -60 (0xC4)
		// @14: invokevirtual game.C_100083_c.func_102524_a(int, int, int, int, byte)void
		// @17: iload #4
		// @19: iconst_m1
		// @1A: if_icmpeq @24
		// @1D: aconst_null
		// @1E: checkcast game.C_100037_wb
		// @21: putstatic game.C_100037_wb game.C_100083_c.field_103167_V
		// @24: goto @67
		// @27: astore #5
		// @29: aload #5
		// @2B: new java.lang.StringBuilder
		// @2E: dup
		// @2F: invokespecial java.lang.StringBuilder.<init>()void
		// @32: getstatic java.lang.String[] game.C_100083_c.field_103173_Y
		// @35: bipush 15 (0x0F)
		// @37: aaload
		// @38: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3B: iload_1
		// @3C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3F: bipush 44 (0x2C)
		// @41: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @44: iload_2
		// @45: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @48: bipush 44 (0x2C)
		// @4A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4D: iload_3
		// @4E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @51: bipush 44 (0x2C)
		// @53: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @56: iload #4
		// @58: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5B: bipush 41 (0x29)
		// @5D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @60: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @63: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @66: athrow
		// @67: return
	}
	
	void func_102528_a(int arg0, int arg1, int arg2, byte arg3)
	{
		// @00: aload_0
		// @01: iload_1
		// @02: iload_2
		// @03: iload_3
		// @04: bipush -128 (0x80)
		// @06: invokespecial game.C_100218_am.func_102528_a(int, int, int, byte)void
		// @09: iload_1
		// @0A: iconst_m1
		// @0B: ixor
		// @0C: iconst_m1
		// @0D: if_icmpne @13
		// @10: goto @14
		// @13: return
		// @14: aload_0
		// @15: getfield game.C_100326_ic game.C_100083_c.field_102533_B
		// @18: checkcast game.C_100184_rn
		// @1B: astore #5
		// @1D: iload #4
		// @1F: bipush -126 (0x82)
		// @21: if_icmple @30
		// @24: aload_0
		// @25: aconst_null
		// @26: checkcast game.C_100297_kf
		// @29: putfield game.C_100297_kf game.C_100083_c.field_103166_W
		// @2C: goto @30
		// @2F: athrow
		// @30: aload_0
		// @31: getfield game.C_100297_kf game.C_100083_c.field_103166_W
		// @34: astore #6
		// @36: aconst_null
		// @37: aload #6
		// @39: if_acmpeq @8B
		// @3C: aload #5
		// @3E: aload_0
		// @3F: iload_3
		// @40: iconst_0
		// @41: invokeinterface game.C_100184_rn.func_100440_a(game.C_100336_im, int, boolean)int
		// @46: istore #7
		// @48: aload #5
		// @4A: iconst_0
		// @4B: iload_2
		// @4C: aload_0
		// @4D: invokeinterface game.C_100184_rn.func_100436_a(boolean, int, game.C_100336_im)int
		// @52: istore #8
		// @54: aload #6
		// @56: getfield int game.C_100297_kf.field_101235_r
		// @59: bipush -2 (0xFE)
		// @5B: isub
		// @5C: bipush -2 (0xFE)
		// @5E: aload #6
		// @60: getfield int game.C_100297_kf.field_101241_m
		// @63: iload #7
		// @65: iadd
		// @66: iadd
		// @67: sipush 11534 (0x2D0E)
		// @6A: iconst_2
		// @6B: aload #6
		// @6D: getfield int game.C_100297_kf.field_101239_o
		// @70: iadd
		// @71: iload #8
		// @73: aload #6
		// @75: getfield int game.C_100297_kf.field_101242_j
		// @78: iadd
		// @79: iconst_2
		// @7A: isub
		// @7B: invokestatic game.C_100010_ff.func_103692_a(int, int, int, int, int)void
		// @7E: aload #6
		// @80: getfield game.C_100297_kf game.C_100297_kf.field_101238_n
		// @83: astore #6
		// @85: aconst_null
		// @86: aload #6
		// @88: if_acmpne @54
		// @8B: goto @CE
		// @8E: astore #5
		// @90: aload #5
		// @92: new java.lang.StringBuilder
		// @95: dup
		// @96: invokespecial java.lang.StringBuilder.<init>()void
		// @99: getstatic java.lang.String[] game.C_100083_c.field_103173_Y
		// @9C: bipush 11 (0x0B)
		// @9E: aaload
		// @9F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @A2: iload_1
		// @A3: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A6: bipush 44 (0x2C)
		// @A8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @AB: iload_2
		// @AC: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @AF: bipush 44 (0x2C)
		// @B1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B4: iload_3
		// @B5: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @B8: bipush 44 (0x2C)
		// @BA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @BD: iload #4
		// @BF: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @C2: bipush 41 (0x29)
		// @C4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C7: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @CA: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @CD: athrow
		// @CE: return
	}
	
	final void func_103101_a(int arg0, int arg1, int arg2, int arg3)
	{
		// @00: aload_0
		// @01: iload_1
		// @02: iload_2
		// @03: iload_3
		// @04: iload #4
		// @06: invokespecial game.C_100218_am.func_103101_a(int, int, int, int)void
		// @09: iload_2
		// @0A: aload_0
		// @0B: getfield int game.C_100083_c.field_102538_m
		// @0E: ineg
		// @0F: iadd
		// @10: istore #5
		// @12: aload_0
		// @13: getfield int game.C_100083_c.field_102541_w
		// @16: ineg
		// @17: iload #4
		// @19: iadd
		// @1A: istore #6
		// @1C: aload_0
		// @1D: iload_1
		// @1E: sipush -30521 (0x88C7)
		// @21: iadd
		// @22: iload #5
		// @24: iload #6
		// @26: invokespecial game.C_100083_c.func_103159_b(int, int, int)game.C_100297_kf
		// @29: astore #7
		// @2B: aload #7
		// @2D: ifnull @53
		// @30: aload_0
		// @31: getfield game.C_100337_in game.C_100083_c.field_102543_u
		// @34: ifnonnull @3F
		// @37: goto @3B
		// @3A: athrow
		// @3B: goto @53
		// @3E: athrow
		// @3F: aload_0
		// @40: getfield game.C_100337_in game.C_100083_c.field_102543_u
		// @43: checkcast game.C_100237_ok
		// @46: aload #7
		// @48: getfield int game.C_100297_kf.field_101236_q
		// @4B: iload_3
		// @4C: iconst_m1
		// @4D: aload_0
		// @4E: invokeinterface game.C_100237_ok.func_102769_a(int, int, int, game.C_100083_c)void
		// @53: goto @96
		// @56: astore #5
		// @58: aload #5
		// @5A: new java.lang.StringBuilder
		// @5D: dup
		// @5E: invokespecial java.lang.StringBuilder.<init>()void
		// @61: getstatic java.lang.String[] game.C_100083_c.field_103173_Y
		// @64: bipush 14 (0x0E)
		// @66: aaload
		// @67: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @6A: iload_1
		// @6B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6E: bipush 44 (0x2C)
		// @70: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @73: iload_2
		// @74: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @77: bipush 44 (0x2C)
		// @79: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7C: iload_3
		// @7D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @80: bipush 44 (0x2C)
		// @82: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @85: iload #4
		// @87: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8A: bipush 41 (0x29)
		// @8C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @92: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @95: athrow
		// @96: return
	}
	
	C_100083_c(String arg0, C_100326_ic arg1)
	{
		// @00: aload_0
		// @01: aload_1
		// @02: aconst_null
		// @03: invokespecial game.C_100218_am.<init>(java.lang.String, game.C_100337_in)void
		// @06: aload_0
		// @07: aconst_null
		// @08: putfield game.C_100297_kf game.C_100083_c.field_103166_W
		// @0B: aload_0
		// @0C: aload_2
		// @0D: putfield game.C_100326_ic game.C_100083_c.field_102533_B
		// @10: goto @60
		// @13: astore_3
		// @14: aload_3
		// @15: new java.lang.StringBuilder
		// @18: dup
		// @19: invokespecial java.lang.StringBuilder.<init>()void
		// @1C: getstatic java.lang.String[] game.C_100083_c.field_103173_Y
		// @1F: bipush 13 (0x0D)
		// @21: aaload
		// @22: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @25: aload_1
		// @26: ifnull @32
		// @29: getstatic java.lang.String[] game.C_100083_c.field_103173_Y
		// @2C: iconst_1
		// @2D: aaload
		// @2E: goto @37
		// @31: athrow
		// @32: getstatic java.lang.String[] game.C_100083_c.field_103173_Y
		// @35: iconst_2
		// @36: aaload
		// @37: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3A: bipush 44 (0x2C)
		// @3C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3F: aload_2
		// @40: ifnull @4C
		// @43: getstatic java.lang.String[] game.C_100083_c.field_103173_Y
		// @46: iconst_1
		// @47: aaload
		// @48: goto @51
		// @4B: athrow
		// @4C: getstatic java.lang.String[] game.C_100083_c.field_103173_Y
		// @4F: iconst_2
		// @50: aaload
		// @51: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @54: bipush 41 (0x29)
		// @56: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @59: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @5C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @5F: athrow
		// @60: return
	}
	
	void func_102513_a(C_100336_im arg0, int arg1, int arg2, int arg3)
	{
		// @00: aload_0
		// @01: aload_1
		// @02: iload_2
		// @03: iload_3
		// @04: iload #4
		// @06: invokespecial game.C_100218_am.func_102513_a(game.C_100336_im, int, int, int)void
		// @09: aload_0
		// @0A: aconst_null
		// @0B: putfield game.C_100297_kf game.C_100083_c.field_103166_W
		// @0E: aload_0
		// @0F: getfield boolean game.C_100083_c.field_102539_j
		// @12: ifeq @42
		// @15: iload #4
		// @17: ineg
		// @18: getstatic int game.C_100015_wh.field_103781_g
		// @1B: iadd
		// @1C: aload_0
		// @1D: getfield int game.C_100083_c.field_102538_m
		// @20: ineg
		// @21: iadd
		// @22: istore #5
		// @24: aload_0
		// @25: getfield int game.C_100083_c.field_102541_w
		// @28: ineg
		// @29: iload_2
		// @2A: ineg
		// @2B: getstatic int game.C_100338_jc.field_105370_l
		// @2E: iadd
		// @2F: iadd
		// @30: istore #6
		// @32: aload_0
		// @33: aload_0
		// @34: iload_3
		// @35: bipush -50 (0xCE)
		// @37: ixor
		// @38: iload #5
		// @3A: iload #6
		// @3C: invokespecial game.C_100083_c.func_103159_b(int, int, int)game.C_100297_kf
		// @3F: putfield game.C_100297_kf game.C_100083_c.field_103166_W
		// @42: goto @95
		// @45: astore #5
		// @47: aload #5
		// @49: new java.lang.StringBuilder
		// @4C: dup
		// @4D: invokespecial java.lang.StringBuilder.<init>()void
		// @50: getstatic java.lang.String[] game.C_100083_c.field_103173_Y
		// @53: iconst_3
		// @54: aaload
		// @55: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @58: aload_1
		// @59: ifnull @65
		// @5C: getstatic java.lang.String[] game.C_100083_c.field_103173_Y
		// @5F: iconst_1
		// @60: aaload
		// @61: goto @6A
		// @64: athrow
		// @65: getstatic java.lang.String[] game.C_100083_c.field_103173_Y
		// @68: iconst_2
		// @69: aaload
		// @6A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @6D: bipush 44 (0x2C)
		// @6F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @72: iload_2
		// @73: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @76: bipush 44 (0x2C)
		// @78: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7B: iload_3
		// @7C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7F: bipush 44 (0x2C)
		// @81: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @84: iload #4
		// @86: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @89: bipush 41 (0x29)
		// @8B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @91: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @94: athrow
		// @95: return
	}
	
	public static void func_103162_k(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic game.C_100302_ka game.C_100083_c.field_103164_U
		// @04: aconst_null
		// @05: putstatic game.C_100037_wb game.C_100083_c.field_103170_S
		// @08: aconst_null
		// @09: putstatic game.C_100202_qi game.C_100083_c.field_103168_Q
		// @0C: aconst_null
		// @0D: putstatic java.lang.String game.C_100083_c.field_103174_X
		// @10: iload_0
		// @11: ifeq @1F
		// @14: aconst_null
		// @15: checkcast game.C_100202_qi
		// @18: putstatic game.C_100202_qi game.C_100083_c.field_103168_Q
		// @1B: goto @1F
		// @1E: athrow
		// @1F: aconst_null
		// @20: putstatic game.C_100037_wb game.C_100083_c.field_103167_V
		// @23: goto @48
		// @26: astore_1
		// @27: aload_1
		// @28: new java.lang.StringBuilder
		// @2B: dup
		// @2C: invokespecial java.lang.StringBuilder.<init>()void
		// @2F: getstatic java.lang.String[] game.C_100083_c.field_103173_Y
		// @32: bipush 7 (0x07)
		// @34: aaload
		// @35: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @38: iload_0
		// @39: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3C: bipush 41 (0x29)
		// @3E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @41: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @44: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @47: athrow
		// @48: return
	}
	
	final void func_103163_j(int arg0)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #16
		// @005: aload_0
		// @006: new game.C_100202_qi
		// @009: dup
		// @00A: invokespecial game.C_100202_qi.<init>()void
		// @00D: putfield game.C_100202_qi game.C_100083_c.field_103169_P
		// @010: iload_1
		// @011: istore_2
		// @012: aload_0
		// @013: getfield game.C_100326_ic game.C_100083_c.field_102533_B
		// @016: checkcast game.C_100184_rn
		// @019: astore_3
		// @01A: aload_3
		// @01B: bipush 102 (0x66)
		// @01D: aload_0
		// @01E: invokeinterface game.C_100184_rn.func_100434_b(int, game.C_100336_im)game.C_100205_qf
		// @023: astore #4
		// @025: aload_0
		// @026: getfield java.lang.String game.C_100083_c.field_102534_C
		// @029: getstatic java.lang.String[] game.C_100083_c.field_103173_Y
		// @02C: bipush 10 (0x0A)
		// @02E: aaload
		// @02F: iload_2
		// @030: invokevirtual java.lang.String.indexOf(java.lang.String, int)int
		// @033: istore #5
		// @035: iconst_0
		// @036: iload #5
		// @038: iconst_m1
		// @039: ixor
		// @03A: if_icmpne @042
		// @03D: iload #16
		// @03F: ifeq @154
		// @042: aload_0
		// @043: getfield java.lang.String game.C_100083_c.field_102534_C
		// @046: ldc ">"
		// @048: iload #5
		// @04A: invokevirtual java.lang.String.indexOf(java.lang.String, int)int
		// @04D: istore #7
		// @04F: aload_0
		// @050: getfield java.lang.String game.C_100083_c.field_102534_C
		// @053: iload #5
		// @055: bipush -9 (0xF7)
		// @057: isub
		// @058: iload #7
		// @05A: invokevirtual java.lang.String.substring(int, int)java.lang.String
		// @05D: astore #6
		// @05F: aload #6
		// @061: invokestatic java.lang.Integer.parseInt(java.lang.String)int
		// @064: istore #7
		// @066: aload_0
		// @067: getfield java.lang.String game.C_100083_c.field_102534_C
		// @06A: getstatic java.lang.String[] game.C_100083_c.field_103173_Y
		// @06D: bipush 8 (0x08)
		// @06F: aaload
		// @070: iload #5
		// @072: invokevirtual java.lang.String.indexOf(java.lang.String, int)int
		// @075: istore_2
		// @076: aload #4
		// @078: iconst_1
		// @079: iload #5
		// @07B: invokevirtual game.C_100205_qf.func_103673_a(int, int)int
		// @07E: istore #8
		// @080: aload #4
		// @082: iload_1
		// @083: iconst_1
		// @084: iadd
		// @085: iload_2
		// @086: invokevirtual game.C_100205_qf.func_103673_a(int, int)int
		// @089: istore #9
		// @08B: aconst_null
		// @08C: astore #10
		// @08E: iload #8
		// @090: istore #11
		// @092: iload #11
		// @094: iconst_m1
		// @095: ixor
		// @096: iload #9
		// @098: iconst_m1
		// @099: ixor
		// @09A: if_icmplt @14F
		// @09D: aload #4
		// @09F: getfield game.C_100306_kn[] game.C_100205_qf.field_103677_g
		// @0A2: iload #11
		// @0A4: aaload
		// @0A5: astore #12
		// @0A7: iload #8
		// @0A9: iload #11
		// @0AB: iload #16
		// @0AD: ifne @03A
		// @0B0: if_icmpeq @0BE
		// @0B3: aload #12
		// @0B5: getfield int[] game.C_100306_kn.field_107130_g
		// @0B8: iconst_0
		// @0B9: iaload
		// @0BA: goto @0C7
		// @0BD: athrow
		// @0BE: aload #4
		// @0C0: iload #5
		// @0C2: ldc 6316128 (0x606060)
		// @0C4: invokevirtual game.C_100205_qf.func_103665_b(int, int)int
		// @0C7: istore #13
		// @0C9: iload #9
		// @0CB: iconst_m1
		// @0CC: ixor
		// @0CD: iload #11
		// @0CF: iconst_m1
		// @0D0: ixor
		// @0D1: if_icmpne @0E0
		// @0D4: aload #4
		// @0D6: iload_2
		// @0D7: ldc 6316128 (0x606060)
		// @0D9: invokevirtual game.C_100205_qf.func_103665_b(int, int)int
		// @0DC: goto @0F8
		// @0DF: athrow
		// @0E0: aload #12
		// @0E2: ifnull @0F7
		// @0E5: aload #12
		// @0E7: getfield int[] game.C_100306_kn.field_107130_g
		// @0EA: aload #12
		// @0EC: getfield int[] game.C_100306_kn.field_107130_g
		// @0EF: arraylength
		// @0F0: iconst_m1
		// @0F1: iadd
		// @0F2: iaload
		// @0F3: goto @0F8
		// @0F6: athrow
		// @0F7: iconst_0
		// @0F8: istore #14
		// @0FA: new game.C_100297_kf
		// @0FD: dup
		// @0FE: iload #7
		// @100: iload #13
		// @102: aload #12
		// @104: getfield int game.C_100306_kn.field_107129_f
		// @107: iload #14
		// @109: iload #13
		// @10B: ineg
		// @10C: iadd
		// @10D: aload_3
		// @10E: iconst_1
		// @10F: invokeinterface game.C_100184_rn.func_100437_a(boolean)int
		// @114: aload #12
		// @116: getfield int game.C_100306_kn.field_107129_f
		// @119: ineg
		// @11A: aload #12
		// @11C: getfield int game.C_100306_kn.field_107135_a
		// @11F: iadd
		// @120: invokestatic java.lang.Math.max(int, int)int
		// @123: invokespecial game.C_100297_kf.<init>(int, int, int, int, int)void
		// @126: astore #15
		// @128: aload #10
		// @12A: ifnonnull @131
		// @12D: goto @138
		// @130: athrow
		// @131: aload #10
		// @133: aload #15
		// @135: putfield game.C_100297_kf game.C_100297_kf.field_101238_n
		// @138: aload_0
		// @139: getfield game.C_100202_qi game.C_100083_c.field_103169_P
		// @13C: bipush 125 (0x7D)
		// @13E: aload #15
		// @140: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @143: aload #15
		// @145: astore #10
		// @147: iinc #11 +1
		// @14A: iload #16
		// @14C: ifeq @092
		// @14F: iload #16
		// @151: ifeq @025
		// @154: goto @179
		// @157: astore_2
		// @158: aload_2
		// @159: new java.lang.StringBuilder
		// @15C: dup
		// @15D: invokespecial java.lang.StringBuilder.<init>()void
		// @160: getstatic java.lang.String[] game.C_100083_c.field_103173_Y
		// @163: bipush 9 (0x09)
		// @165: aaload
		// @166: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @169: iload_1
		// @16A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @16D: bipush 41 (0x29)
		// @16F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @172: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @175: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @178: athrow
		// @179: return
	}
	
	final void func_103158_a(String arg0, int arg1, int arg2)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #6
		// @05: aload_0
		// @06: getfield java.lang.String[] game.C_100083_c.field_103165_T
		// @09: ifnull @1D
		// @0C: aload_0
		// @0D: getfield java.lang.String[] game.C_100083_c.field_103165_T
		// @10: arraylength
		// @11: iload_3
		// @12: if_icmple @1D
		// @15: goto @19
		// @18: athrow
		// @19: goto @5D
		// @1C: athrow
		// @1D: iload_3
		// @1E: iconst_m1
		// @1F: isub
		// @20: anewarray java.lang.String
		// @23: astore #4
		// @25: aconst_null
		// @26: aload_0
		// @27: getfield java.lang.String[] game.C_100083_c.field_103165_T
		// @2A: if_acmpeq @57
		// @2D: iconst_0
		// @2E: istore #5
		// @30: iload #5
		// @32: aload_0
		// @33: getfield java.lang.String[] game.C_100083_c.field_103165_T
		// @36: arraylength
		// @37: if_icmpge @57
		// @3A: aload #4
		// @3C: iload #5
		// @3E: aload_0
		// @3F: getfield java.lang.String[] game.C_100083_c.field_103165_T
		// @42: iload #5
		// @44: aaload
		// @45: aastore
		// @46: iinc #5 +1
		// @49: iload #6
		// @4B: ifne @5D
		// @4E: iload #6
		// @50: ifeq @30
		// @53: goto @57
		// @56: athrow
		// @57: aload_0
		// @58: aload #4
		// @5A: putfield java.lang.String[] game.C_100083_c.field_103165_T
		// @5D: iload_2
		// @5E: bipush 20 (0x14)
		// @60: if_icmpge @64
		// @63: return
		// @64: aload_0
		// @65: getfield java.lang.String[] game.C_100083_c.field_103165_T
		// @68: iload_3
		// @69: aload_1
		// @6A: aastore
		// @6B: goto @B5
		// @6E: astore #4
		// @70: aload #4
		// @72: new java.lang.StringBuilder
		// @75: dup
		// @76: invokespecial java.lang.StringBuilder.<init>()void
		// @79: getstatic java.lang.String[] game.C_100083_c.field_103173_Y
		// @7C: bipush 6 (0x06)
		// @7E: aaload
		// @7F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @82: aload_1
		// @83: ifnull @8F
		// @86: getstatic java.lang.String[] game.C_100083_c.field_103173_Y
		// @89: iconst_1
		// @8A: aaload
		// @8B: goto @94
		// @8E: athrow
		// @8F: getstatic java.lang.String[] game.C_100083_c.field_103173_Y
		// @92: iconst_2
		// @93: aaload
		// @94: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @97: bipush 44 (0x2C)
		// @99: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9C: iload_2
		// @9D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A0: bipush 44 (0x2C)
		// @A2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A5: iload_3
		// @A6: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A9: bipush 41 (0x29)
		// @AB: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @AE: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @B1: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @B4: athrow
		// @B5: return
	}
	
	String func_102525_c(byte arg0)
	{
		// @00: aload_0
		// @01: getfield game.C_100297_kf game.C_100083_c.field_103166_W
		// @04: ifnull @13
		// @07: aconst_null
		// @08: aload_0
		// @09: getfield java.lang.String[] game.C_100083_c.field_103165_T
		// @0C: if_acmpne @15
		// @0F: goto @13
		// @12: athrow
		// @13: aconst_null
		// @14: areturn
		// @15: aload_0
		// @16: getfield java.lang.String[] game.C_100083_c.field_103165_T
		// @19: arraylength
		// @1A: iconst_m1
		// @1B: ixor
		// @1C: aload_0
		// @1D: getfield game.C_100297_kf game.C_100083_c.field_103166_W
		// @20: getfield int game.C_100297_kf.field_101236_q
		// @23: iconst_m1
		// @24: ixor
		// @25: if_icmpge @2C
		// @28: goto @2E
		// @2B: athrow
		// @2C: aconst_null
		// @2D: areturn
		// @2E: iload_1
		// @2F: bipush 34 (0x22)
		// @31: if_icmpge @3D
		// @34: bipush -9 (0xF7)
		// @36: putstatic int game.C_100083_c.field_103172_O
		// @39: goto @3D
		// @3C: athrow
		// @3D: aload_0
		// @3E: getfield java.lang.String[] game.C_100083_c.field_103165_T
		// @41: aload_0
		// @42: getfield game.C_100297_kf game.C_100083_c.field_103166_W
		// @45: getfield int game.C_100297_kf.field_101236_q
		// @48: aaload
		// @49: areturn
		// @4A: astore_2
		// @4B: aload_2
		// @4C: new java.lang.StringBuilder
		// @4F: dup
		// @50: invokespecial java.lang.StringBuilder.<init>()void
		// @53: getstatic java.lang.String[] game.C_100083_c.field_103173_Y
		// @56: iconst_5
		// @57: aaload
		// @58: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @5B: iload_1
		// @5C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5F: bipush 41 (0x29)
		// @61: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @64: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @67: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @6A: athrow
	}
	
	final void func_102524_a(int arg0, int arg1, int arg2, int arg3, byte arg4)
	{
		// @00: aload_0
		// @01: iload_1
		// @02: iload_2
		// @03: iload_3
		// @04: iload #4
		// @06: bipush 70 (0x46)
		// @08: invokespecial game.C_100218_am.func_102524_a(int, int, int, int, byte)void
		// @0B: aload_0
		// @0C: iconst_0
		// @0D: invokevirtual game.C_100083_c.func_103163_j(int)void
		// @10: bipush -69 (0xBB)
		// @12: bipush -11 (0xF5)
		// @14: iload #5
		// @16: isub
		// @17: bipush 48 (0x30)
		// @19: idiv
		// @1A: irem
		// @1B: istore #6
		// @1D: goto @69
		// @20: astore #6
		// @22: aload #6
		// @24: new java.lang.StringBuilder
		// @27: dup
		// @28: invokespecial java.lang.StringBuilder.<init>()void
		// @2B: getstatic java.lang.String[] game.C_100083_c.field_103173_Y
		// @2E: iconst_0
		// @2F: aaload
		// @30: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @33: iload_1
		// @34: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @37: bipush 44 (0x2C)
		// @39: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3C: iload_2
		// @3D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @40: bipush 44 (0x2C)
		// @42: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @45: iload_3
		// @46: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @49: bipush 44 (0x2C)
		// @4B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4E: iload #4
		// @50: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @53: bipush 44 (0x2C)
		// @55: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @58: iload #5
		// @5A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5D: bipush 41 (0x29)
		// @5F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @62: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @65: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @68: athrow
		// @69: return
	}
	
	boolean func_102522_a(int arg0, C_100336_im arg1)
	{
		// @00: iload_1
		// @01: iconst_1
		// @02: if_icmpeq @15
		// @05: aload_0
		// @06: bipush -9 (0xF7)
		// @08: bipush 97 (0x61)
		// @0A: bipush -43 (0xD5)
		// @0C: bipush -25 (0xE7)
		// @0E: invokevirtual game.C_100083_c.func_102528_a(int, int, int, byte)void
		// @11: goto @15
		// @14: athrow
		// @15: iconst_0
		// @16: ireturn
		// @17: astore_3
		// @18: aload_3
		// @19: new java.lang.StringBuilder
		// @1C: dup
		// @1D: invokespecial java.lang.StringBuilder.<init>()void
		// @20: getstatic java.lang.String[] game.C_100083_c.field_103173_Y
		// @23: iconst_4
		// @24: aaload
		// @25: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @28: iload_1
		// @29: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2C: bipush 44 (0x2C)
		// @2E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @31: aload_2
		// @32: ifnull @3E
		// @35: getstatic java.lang.String[] game.C_100083_c.field_103173_Y
		// @38: iconst_1
		// @39: aaload
		// @3A: goto @43
		// @3D: athrow
		// @3E: getstatic java.lang.String[] game.C_100083_c.field_103173_Y
		// @41: iconst_2
		// @42: aaload
		// @43: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @46: bipush 41 (0x29)
		// @48: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @51: athrow
	}
	
	private final C_100297_kf func_103159_b(int arg0, int arg1, int arg2)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #6
		// @05: aload_0
		// @06: getfield game.C_100202_qi game.C_100083_c.field_103169_P
		// @09: bipush 106 (0x6A)
		// @0B: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @0E: checkcast game.C_100297_kf
		// @11: astore #4
		// @13: iload_1
		// @14: bipush -20 (0xEC)
		// @16: if_icmplt @22
		// @19: bipush 76 (0x4C)
		// @1B: putstatic int game.C_100083_c.field_103171_R
		// @1E: goto @22
		// @21: athrow
		// @22: aload #4
		// @24: ifnull @A8
		// @27: aload #4
		// @29: astore #5
		// @2B: aconst_null
		// @2C: aload #5
		// @2E: if_acmpeq @95
		// @31: aload #5
		// @33: iload #6
		// @35: ifne @A1
		// @38: getfield int game.C_100297_kf.field_101241_m
		// @3B: iconst_m1
		// @3C: ixor
		// @3D: iload_2
		// @3E: iconst_m1
		// @3F: ixor
		// @40: if_icmplt @89
		// @43: goto @47
		// @46: athrow
		// @47: iload_3
		// @48: iconst_m1
		// @49: ixor
		// @4A: aload #5
		// @4C: getfield int game.C_100297_kf.field_101242_j
		// @4F: iconst_m1
		// @50: ixor
		// @51: if_icmpgt @89
		// @54: goto @58
		// @57: athrow
		// @58: aload #5
		// @5A: getfield int game.C_100297_kf.field_101241_m
		// @5D: aload #5
		// @5F: getfield int game.C_100297_kf.field_101239_o
		// @62: iadd
		// @63: iconst_m1
		// @64: ixor
		// @65: iload_2
		// @66: iconst_m1
		// @67: ixor
		// @68: if_icmpge @89
		// @6B: goto @6F
		// @6E: athrow
		// @6F: aload #5
		// @71: getfield int game.C_100297_kf.field_101235_r
		// @74: aload #5
		// @76: getfield int game.C_100297_kf.field_101242_j
		// @79: iadd
		// @7A: iconst_m1
		// @7B: ixor
		// @7C: iload_3
		// @7D: iconst_m1
		// @7E: ixor
		// @7F: if_icmpgt @89
		// @82: goto @86
		// @85: athrow
		// @86: aload #4
		// @88: areturn
		// @89: aload #5
		// @8B: getfield game.C_100297_kf game.C_100297_kf.field_101238_n
		// @8E: astore #5
		// @90: iload #6
		// @92: ifeq @2B
		// @95: aload_0
		// @96: getfield game.C_100202_qi game.C_100083_c.field_103169_P
		// @99: bipush 70 (0x46)
		// @9B: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @9E: checkcast game.C_100297_kf
		// @A1: astore #4
		// @A3: iload #6
		// @A5: ifeq @22
		// @A8: aconst_null
		// @A9: areturn
		// @AA: astore #4
		// @AC: aload #4
		// @AE: new java.lang.StringBuilder
		// @B1: dup
		// @B2: invokespecial java.lang.StringBuilder.<init>()void
		// @B5: getstatic java.lang.String[] game.C_100083_c.field_103173_Y
		// @B8: bipush 12 (0x0C)
		// @BA: aaload
		// @BB: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @BE: iload_1
		// @BF: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @C2: bipush 44 (0x2C)
		// @C4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C7: iload_2
		// @C8: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @CB: bipush 44 (0x2C)
		// @CD: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D0: iload_3
		// @D1: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @D4: bipush 41 (0x29)
		// @D6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D9: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @DC: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @DF: athrow
	}
	
	static
	{
		// @00: bipush 16 (0x10)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "UYkN>"
		// @09: invokestatic game.C_100083_c.func_103161_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100083_c.func_103160_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "MY\t!k"
		// @14: invokestatic game.C_100083_c.func_103161_z(java.lang.String)char[]
		// @17: invokestatic game.C_100083_c.func_103160_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "X\u0002Kc"
		// @1F: invokestatic game.C_100083_c.func_103161_z(java.lang.String)char[]
		// @22: invokestatic game.C_100083_c.func_103160_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "UYv'"
		// @2A: invokestatic game.C_100083_c.func_103161_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100083_c.func_103160_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "UYt'"
		// @35: invokestatic game.C_100083_c.func_103161_z(java.lang.String)char[]
		// @38: invokestatic game.C_100083_c.func_103160_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "UYa'"
		// @40: invokestatic game.C_100083_c.func_103161_z(java.lang.String)char[]
		// @43: invokestatic game.C_100083_c.func_103160_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "UYo'"
		// @4C: invokestatic game.C_100083_c.func_103161_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100083_c.func_103160_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "UYn'"
		// @58: invokestatic game.C_100083_c.func_103161_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100083_c.func_103160_z(char[])java.lang.String
		// @5E: aastore
		// @5F: dup
		// @60: bipush 8 (0x08)
		// @62: ldc "\nXO`bE\u0007H{("
		// @64: invokestatic game.C_100083_c.func_103161_z(java.lang.String)char[]
		// @67: invokestatic game.C_100083_c.func_103160_z(char[])java.lang.String
		// @6A: aastore
		// @6B: dup
		// @6C: bipush 9 (0x09)
		// @6E: ldc "UYq'"
		// @70: invokestatic game.C_100083_c.func_103161_z(java.lang.String)char[]
		// @73: invokestatic game.C_100083_c.func_103160_z(char[])java.lang.String
		// @76: aastore
		// @77: dup
		// @78: bipush 10 (0x0A)
		// @7A: ldc "\n\u001fH{eF\u0018S2"
		// @7C: invokestatic game.C_100083_c.func_103161_z(java.lang.String)char[]
		// @7F: invokestatic game.C_100083_c.func_103160_z(char[])java.lang.String
		// @82: aastore
		// @83: dup
		// @84: bipush 11 (0x0B)
		// @86: ldc "UYd'"
		// @88: invokestatic game.C_100083_c.func_103161_z(java.lang.String)char[]
		// @8B: invokestatic game.C_100083_c.func_103160_z(char[])java.lang.String
		// @8E: aastore
		// @8F: dup
		// @90: bipush 12 (0x0C)
		// @92: ldc "UYb'"
		// @94: invokestatic game.C_100083_c.func_103161_z(java.lang.String)char[]
		// @97: invokestatic game.C_100083_c.func_103160_z(char[])java.lang.String
		// @9A: aastore
		// @9B: dup
		// @9C: bipush 13 (0x0D)
		// @9E: ldc "UY\u001bfx_\u0003\u0019'"
		// @A0: invokestatic game.C_100083_c.func_103161_z(java.lang.String)char[]
		// @A3: invokestatic game.C_100083_c.func_103160_z(char[])java.lang.String
		// @A6: aastore
		// @A7: dup
		// @A8: bipush 14 (0x0E)
		// @AA: ldc "UY`'"
		// @AC: invokestatic game.C_100083_c.func_103161_z(java.lang.String)char[]
		// @AF: invokestatic game.C_100083_c.func_103160_z(char[])java.lang.String
		// @B2: aastore
		// @B3: dup
		// @B4: bipush 15 (0x0F)
		// @B6: ldc "UYu'"
		// @B8: invokestatic game.C_100083_c.func_103161_z(java.lang.String)char[]
		// @BB: invokestatic game.C_100083_c.func_103160_z(char[])java.lang.String
		// @BE: aastore
		// @BF: putstatic java.lang.String[] game.C_100083_c.field_103173_Y
		// @C2: iconst_0
		// @C3: putstatic int game.C_100083_c.field_103171_R
		// @C6: iconst_0
		// @C7: putstatic int game.C_100083_c.field_103172_O
		// @CA: new game.C_100037_wb
		// @CD: dup
		// @CE: sipush 270 (0x010E)
		// @D1: bipush 70 (0x46)
		// @D3: invokespecial game.C_100037_wb.<init>(int, int)void
		// @D6: putstatic game.C_100037_wb game.C_100083_c.field_103170_S
		// @D9: ldc "p\u0005Hb6Y\u0019Kv6\nR\u001719[\u0018I{~"
		// @DB: invokestatic game.C_100083_c.func_103161_z(java.lang.String)char[]
		// @DE: invokestatic game.C_100083_c.func_103160_z(char[])java.lang.String
		// @E1: putstatic java.lang.String game.C_100083_c.field_103174_X
		// @E4: return
	}
	
	private static char[] func_103161_z(String arg0)
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
		// @0E: bipush 22 (0x16)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_103160_z(char[] arg0)
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
		// @30: bipush 54 (0x36)
		// @32: goto @46
		// @35: bipush 119 (0x77)
		// @37: goto @46
		// @3A: bipush 39 (0x27)
		// @3C: goto @46
		// @3F: bipush 15 (0x0F)
		// @41: goto @46
		// @44: bipush 22 (0x16)
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
