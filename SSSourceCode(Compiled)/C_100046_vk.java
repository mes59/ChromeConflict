package game;

final class C_100046_vk extends C_100341_jd implements C_100334_ik
{
	static String field_102768_vb;
	private C_100218_am field_102767_wb;
	static C_100302_ka field_102764_yb;
	static String[] field_102766_xb;
	static C_100037_wb[] field_102762_tb;
	static C_100268_mk field_102763_sb;
	static int[] field_102765_ub;
	private static final String[] field_102761_zb;
	
	private final void func_102760_p(int arg0)
	{
		// @00: bipush -114 (0x8E)
		// @02: iload_1
		// @03: bipush 38 (0x26)
		// @05: isub
		// @06: bipush 33 (0x21)
		// @08: idiv
		// @09: idiv
		// @0A: istore_2
		// @0B: aload_0
		// @0C: getfield boolean game.C_100046_vk.field_102619_V
		// @0F: ifeq @16
		// @12: goto @17
		// @15: athrow
		// @16: return
		// @17: aload_0
		// @18: iconst_0
		// @19: putfield boolean game.C_100046_vk.field_102619_V
		// @1C: goto @41
		// @1F: astore_2
		// @20: aload_2
		// @21: new java.lang.StringBuilder
		// @24: dup
		// @25: invokespecial java.lang.StringBuilder.<init>()void
		// @28: getstatic java.lang.String[] game.C_100046_vk.field_102761_zb
		// @2B: bipush 6 (0x06)
		// @2D: aaload
		// @2E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @31: iload_1
		// @32: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @35: bipush 41 (0x29)
		// @37: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @40: athrow
		// @41: return
	}
	
	public final void func_102581_a(int arg0, int arg1, byte arg2, C_100218_am arg3, int arg4)
	{
		// @00: aload #4
		// @02: aload_0
		// @03: getfield game.C_100218_am game.C_100046_vk.field_102767_wb
		// @06: if_acmpeq @0D
		// @09: goto @13
		// @0C: athrow
		// @0D: aload_0
		// @0E: bipush -4 (0xFC)
		// @10: invokespecial game.C_100046_vk.func_102760_p(int)void
		// @13: bipush 89 (0x59)
		// @15: bipush -2 (0xFE)
		// @17: iload_3
		// @18: isub
		// @19: bipush 52 (0x34)
		// @1B: idiv
		// @1C: idiv
		// @1D: istore #6
		// @1F: goto @7C
		// @22: astore #6
		// @24: aload #6
		// @26: new java.lang.StringBuilder
		// @29: dup
		// @2A: invokespecial java.lang.StringBuilder.<init>()void
		// @2D: getstatic java.lang.String[] game.C_100046_vk.field_102761_zb
		// @30: iconst_4
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
		// @50: aload #4
		// @52: ifnull @5E
		// @55: getstatic java.lang.String[] game.C_100046_vk.field_102761_zb
		// @58: iconst_2
		// @59: aaload
		// @5A: goto @63
		// @5D: athrow
		// @5E: getstatic java.lang.String[] game.C_100046_vk.field_102761_zb
		// @61: iconst_1
		// @62: aaload
		// @63: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @66: bipush 44 (0x2C)
		// @68: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6B: iload #5
		// @6D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @70: bipush 41 (0x29)
		// @72: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @75: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @78: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @7B: athrow
		// @7C: return
	}
	
	public static void func_102759_h(byte arg0)
	{
		// @00: aconst_null
		// @01: putstatic game.C_100268_mk game.C_100046_vk.field_102763_sb
		// @04: aconst_null
		// @05: putstatic game.C_100302_ka game.C_100046_vk.field_102764_yb
		// @08: aconst_null
		// @09: putstatic java.lang.String[] game.C_100046_vk.field_102766_xb
		// @0C: iload_0
		// @0D: bipush -95 (0xA1)
		// @0F: if_icmple @13
		// @12: return
		// @13: aconst_null
		// @14: putstatic game.C_100037_wb[] game.C_100046_vk.field_102762_tb
		// @17: aconst_null
		// @18: putstatic java.lang.String game.C_100046_vk.field_102768_vb
		// @1B: aconst_null
		// @1C: putstatic int[] game.C_100046_vk.field_102765_ub
		// @1F: goto @43
		// @22: astore_1
		// @23: aload_1
		// @24: new java.lang.StringBuilder
		// @27: dup
		// @28: invokespecial java.lang.StringBuilder.<init>()void
		// @2B: getstatic java.lang.String[] game.C_100046_vk.field_102761_zb
		// @2E: iconst_5
		// @2F: aaload
		// @30: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @33: iload_0
		// @34: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @37: bipush 41 (0x29)
		// @39: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @42: athrow
		// @43: return
	}
	
	C_100046_vk(C_100029_gn arg0, C_100186_rl arg1)
	{
		// @000: aload_0
		// @001: aload_1
		// @002: sipush 200 (0x00C8)
		// @005: sipush 150 (0x0096)
		// @008: invokespecial game.C_100341_jd.<init>(game.C_100029_gn, int, int)void
		// @00B: aconst_null
		// @00C: astore_3
		// @00D: aload_2
		// @00E: getstatic game.C_100186_rl game.C_100152_bd.field_105206_l
		// @011: if_acmpne @01B
		// @014: getstatic java.lang.String game.C_100188_rj.field_105740_a
		// @017: astore_3
		// @018: goto @068
		// @01B: getstatic game.C_100186_rl game.C_100306_kn.field_107142_i
		// @01E: aload_2
		// @01F: if_acmpeq @03F
		// @022: aload_2
		// @023: getstatic game.C_100186_rl game.C_100031_gl.field_103972_i
		// @026: if_acmpne @068
		// @029: goto @02D
		// @02C: athrow
		// @02D: aload_0
		// @02E: dup
		// @02F: getfield int game.C_100046_vk.field_102544_t
		// @032: bipush 30 (0x1E)
		// @034: iadd
		// @035: putfield int game.C_100046_vk.field_102544_t
		// @038: getstatic java.lang.String game.C_100192_rf.field_101677_F
		// @03B: astore_3
		// @03C: goto @068
		// @03F: getstatic java.lang.String game.C_100049_vf.field_104217_r
		// @042: astore_3
		// @043: aload_0
		// @044: dup
		// @045: getfield int game.C_100046_vk.field_102544_t
		// @048: bipush 10 (0x0A)
		// @04A: iadd
		// @04B: putfield int game.C_100046_vk.field_102544_t
		// @04E: iconst_0
		// @04F: invokestatic game.C_100233_oa.func_106225_a(boolean)boolean
		// @052: ifne @059
		// @055: goto @068
		// @058: athrow
		// @059: aload_0
		// @05A: dup
		// @05B: getfield int game.C_100046_vk.field_102544_t
		// @05E: bipush 20 (0x14)
		// @060: iadd
		// @061: putfield int game.C_100046_vk.field_102544_t
		// @064: getstatic java.lang.String game.C_100045_vj.field_100612_v
		// @067: astore_3
		// @068: new game.C_100336_im
		// @06B: dup
		// @06C: aload_3
		// @06D: aconst_null
		// @06E: invokespecial game.C_100336_im.<init>(java.lang.String, game.C_100337_in)void
		// @071: astore #4
		// @073: aload #4
		// @075: bipush 80 (0x50)
		// @077: putfield int game.C_100336_im.field_102544_t
		// @07A: aload #4
		// @07C: iconst_0
		// @07D: putfield int game.C_100336_im.field_102538_m
		// @080: aload #4
		// @082: bipush 50 (0x32)
		// @084: putfield int game.C_100336_im.field_102541_w
		// @087: aload #4
		// @089: aload_0
		// @08A: getfield int game.C_100046_vk.field_102537_l
		// @08D: putfield int game.C_100336_im.field_102537_l
		// @090: aload #4
		// @092: new game.C_100256_pk
		// @095: dup
		// @096: getstatic game.C_100112_r game.C_100318_hj.field_107198_b
		// @099: bipush 10 (0x0A)
		// @09B: bipush 10 (0x0A)
		// @09D: iconst_0
		// @09E: bipush 10 (0x0A)
		// @0A0: ldc 16777215 (0xffffff)
		// @0A2: iconst_m1
		// @0A3: iconst_1
		// @0A4: iconst_0
		// @0A5: bipush 16 (0x10)
		// @0A7: iconst_0
		// @0A8: iconst_0
		// @0A9: iconst_1
		// @0AA: invokespecial game.C_100256_pk.<init>(game.C_100112_r, int, int, int, int, int, int, int, int, int, int, int, boolean)void
		// @0AD: putfield game.C_100326_ic game.C_100336_im.field_102533_B
		// @0B0: aload_0
		// @0B1: aload #4
		// @0B3: iconst_1
		// @0B4: invokevirtual game.C_100046_vk.func_102561_b(game.C_100336_im, int)void
		// @0B7: aload_0
		// @0B8: aload_0
		// @0B9: bipush 82 (0x52)
		// @0BB: aload_0
		// @0BC: getstatic java.lang.String game.C_100180_ce.field_104807_v
		// @0BF: invokespecial game.C_100046_vk.func_102758_a(byte, game.C_100337_in, java.lang.String)game.C_100218_am
		// @0C2: putfield game.C_100218_am game.C_100046_vk.field_102767_wb
		// @0C5: goto @114
		// @0C8: astore_3
		// @0C9: aload_3
		// @0CA: new java.lang.StringBuilder
		// @0CD: dup
		// @0CE: invokespecial java.lang.StringBuilder.<init>()void
		// @0D1: getstatic java.lang.String[] game.C_100046_vk.field_102761_zb
		// @0D4: iconst_3
		// @0D5: aaload
		// @0D6: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0D9: aload_1
		// @0DA: ifnull @0E6
		// @0DD: getstatic java.lang.String[] game.C_100046_vk.field_102761_zb
		// @0E0: iconst_2
		// @0E1: aaload
		// @0E2: goto @0EB
		// @0E5: athrow
		// @0E6: getstatic java.lang.String[] game.C_100046_vk.field_102761_zb
		// @0E9: iconst_1
		// @0EA: aaload
		// @0EB: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0EE: bipush 44 (0x2C)
		// @0F0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0F3: aload_2
		// @0F4: ifnull @100
		// @0F7: getstatic java.lang.String[] game.C_100046_vk.field_102761_zb
		// @0FA: iconst_2
		// @0FB: aaload
		// @0FC: goto @105
		// @0FF: athrow
		// @100: getstatic java.lang.String[] game.C_100046_vk.field_102761_zb
		// @103: iconst_1
		// @104: aaload
		// @105: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @108: bipush 41 (0x29)
		// @10A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @10D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @110: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @113: athrow
		// @114: return
	}
	
	static final void func_102757_a(int arg0, String[] arg1)
	{
		// @00: aconst_null
		// @01: getstatic game.C_100053_vn game.C_100282_nh.field_102713_Jb
		// @04: if_acmpeq @18
		// @07: getstatic game.C_100053_vn game.C_100282_nh.field_102713_Jb
		// @0A: getfield game.C_100162_sc game.C_100053_vn.field_102839_S
		// @0D: aload_1
		// @0E: sipush 28857 (0x70B9)
		// @11: invokevirtual game.C_100162_sc.func_102855_a(java.lang.String[], int)void
		// @14: goto @18
		// @17: athrow
		// @18: iload_0
		// @19: bipush -21 (0xEB)
		// @1B: if_icmple @1F
		// @1E: return
		// @1F: getstatic game.C_100128_ca game.C_100280_nf.field_101172_t
		// @22: ifnull @32
		// @25: getstatic game.C_100128_ca game.C_100280_nf.field_101172_t
		// @28: getfield game.C_100162_sc game.C_100128_ca.field_102803_T
		// @2B: aload_1
		// @2C: sipush 28857 (0x70B9)
		// @2F: invokevirtual game.C_100162_sc.func_102855_a(java.lang.String[], int)void
		// @32: goto @70
		// @35: astore_2
		// @36: aload_2
		// @37: new java.lang.StringBuilder
		// @3A: dup
		// @3B: invokespecial java.lang.StringBuilder.<init>()void
		// @3E: getstatic java.lang.String[] game.C_100046_vk.field_102761_zb
		// @41: iconst_0
		// @42: aaload
		// @43: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @46: iload_0
		// @47: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4A: bipush 44 (0x2C)
		// @4C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4F: aload_1
		// @50: ifnull @5C
		// @53: getstatic java.lang.String[] game.C_100046_vk.field_102761_zb
		// @56: iconst_2
		// @57: aaload
		// @58: goto @61
		// @5B: athrow
		// @5C: getstatic java.lang.String[] game.C_100046_vk.field_102761_zb
		// @5F: iconst_1
		// @60: aaload
		// @61: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @64: bipush 41 (0x29)
		// @66: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @69: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @6C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @6F: athrow
		// @70: return
	}
	
	private final C_100218_am func_102758_a(byte arg0, C_100337_in arg1, String arg2)
	{
		// @00: new game.C_100218_am
		// @03: dup
		// @04: aload_3
		// @05: aload_2
		// @06: invokespecial game.C_100218_am.<init>(java.lang.String, game.C_100337_in)void
		// @09: astore #4
		// @0B: aload #4
		// @0D: new game.C_100310_lj
		// @10: dup
		// @11: invokespecial game.C_100310_lj.<init>()void
		// @14: putfield game.C_100326_ic game.C_100218_am.field_102533_B
		// @17: iload_1
		// @18: bipush 75 (0x4B)
		// @1A: if_icmpgt @31
		// @1D: aload_0
		// @1E: bipush 48 (0x30)
		// @20: bipush 40 (0x28)
		// @22: bipush -58 (0xC6)
		// @24: aconst_null
		// @25: checkcast game.C_100218_am
		// @28: bipush 78 (0x4E)
		// @2A: invokevirtual game.C_100046_vk.func_102581_a(int, int, byte, game.C_100218_am, int)void
		// @2D: goto @31
		// @30: athrow
		// @31: aload_0
		// @32: getfield int game.C_100046_vk.field_102544_t
		// @35: bipush -6 (0xFA)
		// @37: iadd
		// @38: istore #5
		// @3A: aload_0
		// @3B: dup
		// @3C: getfield int game.C_100046_vk.field_102544_t
		// @3F: bipush 38 (0x26)
		// @41: iadd
		// @42: putfield int game.C_100046_vk.field_102544_t
		// @45: aload #4
		// @47: bipush 30 (0x1E)
		// @49: iload #5
		// @4B: bipush 15 (0x0F)
		// @4D: bipush -16 (0xF0)
		// @4F: aload_0
		// @50: getfield int game.C_100046_vk.field_102537_l
		// @53: iadd
		// @54: bipush -14 (0xF2)
		// @56: iadd
		// @57: bipush 117 (0x75)
		// @59: invokevirtual game.C_100218_am.func_102524_a(int, int, int, int, byte)void
		// @5C: aload_0
		// @5D: aload #4
		// @5F: iconst_1
		// @60: invokevirtual game.C_100046_vk.func_102561_b(game.C_100336_im, int)void
		// @63: aload_0
		// @64: sipush 10945 (0x2AC1)
		// @67: invokevirtual game.C_100046_vk.func_102530_f(int)void
		// @6A: aload #4
		// @6C: areturn
		// @6D: astore #4
		// @6F: aload #4
		// @71: new java.lang.StringBuilder
		// @74: dup
		// @75: invokespecial java.lang.StringBuilder.<init>()void
		// @78: getstatic java.lang.String[] game.C_100046_vk.field_102761_zb
		// @7B: bipush 7 (0x07)
		// @7D: aaload
		// @7E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @81: iload_1
		// @82: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @85: bipush 44 (0x2C)
		// @87: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8A: aload_2
		// @8B: ifnull @97
		// @8E: getstatic java.lang.String[] game.C_100046_vk.field_102761_zb
		// @91: iconst_2
		// @92: aaload
		// @93: goto @9C
		// @96: athrow
		// @97: getstatic java.lang.String[] game.C_100046_vk.field_102761_zb
		// @9A: iconst_1
		// @9B: aaload
		// @9C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @9F: bipush 44 (0x2C)
		// @A1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A4: aload_3
		// @A5: ifnull @B1
		// @A8: getstatic java.lang.String[] game.C_100046_vk.field_102761_zb
		// @AB: iconst_2
		// @AC: aaload
		// @AD: goto @B6
		// @B0: athrow
		// @B1: getstatic java.lang.String[] game.C_100046_vk.field_102761_zb
		// @B4: iconst_1
		// @B5: aaload
		// @B6: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @B9: bipush 41 (0x29)
		// @BB: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @BE: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @C1: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @C4: athrow
	}
	
	static
	{
		// @00: bipush 8 (0x08)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "GFcQ]\u0019"
		// @09: invokestatic game.C_100046_vk.func_102756_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100046_vk.func_102755_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "_X!u"
		// @14: invokestatic game.C_100046_vk.func_102756_z(java.lang.String)char[]
		// @17: invokestatic game.C_100046_vk.func_102755_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "J\u0003c7a"
		// @1F: invokestatic game.C_100046_vk.func_102756_z(java.lang.String)char[]
		// @22: invokestatic game.C_100046_vk.func_102755_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "GFc%u_D9'4"
		// @2A: invokestatic game.C_100046_vk.func_102756_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100046_vk.func_102755_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "GFcS]\u0019"
		// @35: invokestatic game.C_100046_vk.func_102756_z(java.lang.String)char[]
		// @38: invokestatic game.C_100046_vk.func_102755_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "GFcR]\u0019"
		// @40: invokestatic game.C_100046_vk.func_102756_z(java.lang.String)char[]
		// @43: invokestatic game.C_100046_vk.func_102755_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "GFc^]\u0019"
		// @4C: invokestatic game.C_100046_vk.func_102756_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100046_vk.func_102755_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "GFcP]\u0019"
		// @58: invokestatic game.C_100046_vk.func_102756_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100046_vk.func_102755_z(char[])java.lang.String
		// @5E: aastore
		// @5F: putstatic java.lang.String[] game.C_100046_vk.field_102761_zb
		// @62: ldc "pI)9rP@("
		// @64: invokestatic game.C_100046_vk.func_102756_z(java.lang.String)char[]
		// @67: invokestatic game.C_100046_vk.func_102755_z(char[])java.lang.String
		// @6A: putstatic java.lang.String game.C_100046_vk.field_102768_vb
		// @6D: aconst_null
		// @6E: putstatic game.C_100302_ka game.C_100046_vk.field_102764_yb
		// @71: bipush 7 (0x07)
		// @73: newarray int[]
		// @75: dup
		// @76: iconst_0
		// @77: bipush 14 (0x0E)
		// @79: iastore
		// @7A: dup
		// @7B: iconst_1
		// @7C: bipush 15 (0x0F)
		// @7E: iastore
		// @7F: dup
		// @80: iconst_2
		// @81: bipush 16 (0x10)
		// @83: iastore
		// @84: dup
		// @85: iconst_3
		// @86: bipush 22 (0x16)
		// @88: iastore
		// @89: dup
		// @8A: iconst_4
		// @8B: iconst_4
		// @8C: iastore
		// @8D: dup
		// @8E: iconst_5
		// @8F: iconst_m1
		// @90: iastore
		// @91: dup
		// @92: bipush 6 (0x06)
		// @94: bipush 8 (0x08)
		// @96: iastore
		// @97: putstatic int[] game.C_100046_vk.field_102765_ub
		// @9A: new game.C_100268_mk
		// @9D: dup
		// @9E: invokespecial game.C_100268_mk.<init>()void
		// @A1: putstatic game.C_100268_mk game.C_100046_vk.field_102763_sb
		// @A4: return
	}
	
	private static char[] func_102756_z(String arg0)
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
		// @0E: bipush 28 (0x1C)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_102755_z(char[] arg0)
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
		// @30: bipush 49 (0x31)
		// @32: goto @46
		// @35: bipush 45 (0x2D)
		// @37: goto @46
		// @3A: bipush 77 (0x4D)
		// @3C: goto @46
		// @3F: bipush 25 (0x19)
		// @41: goto @46
		// @44: bipush 28 (0x1C)
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
