package game;

final class C_100228_nn
{
	private C_100098_h field_106193_k;
	static String[] field_106188_b;
	static int[] field_106190_a;
	static String field_106194_h;
	private C_100098_h field_106192_j;
	static String field_106195_i;
	static int[] field_106191_l;
	static C_100260_mc field_106189_c;
	private C_100119_ua field_106187_e;
	static C_100302_ka field_106185_g;
	static C_100037_wb field_106186_d;
	private C_100119_ua field_106184_f;
	private static final String[] field_106196_z;
	
	final C_100214_al func_106175_a(String arg0, String arg1, int arg2)
	{
		// @00: iload_3
		// @01: iconst_1
		// @02: if_icmpeq @0A
		// @05: aconst_null
		// @06: checkcast game.C_100214_al
		// @09: areturn
		// @0A: aload_0
		// @0B: aconst_null
		// @0C: bipush 80 (0x50)
		// @0E: aload_2
		// @0F: aload_1
		// @10: invokespecial game.C_100228_nn.func_106177_a(int[], int, java.lang.String, java.lang.String)game.C_100214_al
		// @13: areturn
		// @14: astore #4
		// @16: aload #4
		// @18: new java.lang.StringBuilder
		// @1B: dup
		// @1C: invokespecial java.lang.StringBuilder.<init>()void
		// @1F: getstatic java.lang.String[] game.C_100228_nn.field_106196_z
		// @22: bipush 9 (0x09)
		// @24: aaload
		// @25: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @28: aload_1
		// @29: ifnull @35
		// @2C: getstatic java.lang.String[] game.C_100228_nn.field_106196_z
		// @2F: iconst_1
		// @30: aaload
		// @31: goto @3A
		// @34: athrow
		// @35: getstatic java.lang.String[] game.C_100228_nn.field_106196_z
		// @38: iconst_0
		// @39: aaload
		// @3A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3D: bipush 44 (0x2C)
		// @3F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @42: aload_2
		// @43: ifnull @4F
		// @46: getstatic java.lang.String[] game.C_100228_nn.field_106196_z
		// @49: iconst_1
		// @4A: aaload
		// @4B: goto @54
		// @4E: athrow
		// @4F: getstatic java.lang.String[] game.C_100228_nn.field_106196_z
		// @52: iconst_0
		// @53: aaload
		// @54: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @57: bipush 44 (0x2C)
		// @59: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5C: iload_3
		// @5D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @60: bipush 41 (0x29)
		// @62: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @65: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @68: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @6B: athrow
	}
	
	private final C_100214_al func_106177_a(int[] arg0, int arg1, String arg2, String arg3)
	{
		// @00: aload_0
		// @01: getfield game.C_100098_h game.C_100228_nn.field_106192_j
		// @04: sipush -10719 (0xD621)
		// @07: aload_3
		// @08: invokevirtual game.C_100098_h.func_104601_b(int, java.lang.String)int
		// @0B: istore #5
		// @0D: iload #5
		// @0F: iconst_m1
		// @10: ixor
		// @11: iconst_m1
		// @12: if_icmpgt @19
		// @15: goto @1B
		// @18: athrow
		// @19: aconst_null
		// @1A: areturn
		// @1B: aload_0
		// @1C: getfield game.C_100098_h game.C_100228_nn.field_106192_j
		// @1F: aload #4
		// @21: iload #5
		// @23: iconst_0
		// @24: invokevirtual game.C_100098_h.func_104600_a(java.lang.String, int, int)int
		// @27: istore #6
		// @29: iconst_0
		// @2A: iload #6
		// @2C: if_icmple @31
		// @2F: aconst_null
		// @30: areturn
		// @31: iload_2
		// @32: bipush 40 (0x28)
		// @34: if_icmpgt @40
		// @37: bipush -17 (0xEF)
		// @39: invokestatic game.C_100228_nn.func_106178_a(int)void
		// @3C: goto @40
		// @3F: athrow
		// @40: aload_0
		// @41: iload #6
		// @43: bipush 113 (0x71)
		// @45: aload_1
		// @46: iload #5
		// @48: invokespecial game.C_100228_nn.func_106183_a(int, byte, int[], int)game.C_100214_al
		// @4B: areturn
		// @4C: astore #5
		// @4E: aload #5
		// @50: new java.lang.StringBuilder
		// @53: dup
		// @54: invokespecial java.lang.StringBuilder.<init>()void
		// @57: getstatic java.lang.String[] game.C_100228_nn.field_106196_z
		// @5A: bipush 8 (0x08)
		// @5C: aaload
		// @5D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @60: aload_1
		// @61: ifnull @6D
		// @64: getstatic java.lang.String[] game.C_100228_nn.field_106196_z
		// @67: iconst_1
		// @68: aaload
		// @69: goto @72
		// @6C: athrow
		// @6D: getstatic java.lang.String[] game.C_100228_nn.field_106196_z
		// @70: iconst_0
		// @71: aaload
		// @72: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @75: bipush 44 (0x2C)
		// @77: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7A: iload_2
		// @7B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7E: bipush 44 (0x2C)
		// @80: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @83: aload_3
		// @84: ifnull @90
		// @87: getstatic java.lang.String[] game.C_100228_nn.field_106196_z
		// @8A: iconst_1
		// @8B: aaload
		// @8C: goto @95
		// @8F: athrow
		// @90: getstatic java.lang.String[] game.C_100228_nn.field_106196_z
		// @93: iconst_0
		// @94: aaload
		// @95: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @98: bipush 44 (0x2C)
		// @9A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9D: aload #4
		// @9F: ifnull @AB
		// @A2: getstatic java.lang.String[] game.C_100228_nn.field_106196_z
		// @A5: iconst_1
		// @A6: aaload
		// @A7: goto @B0
		// @AA: athrow
		// @AB: getstatic java.lang.String[] game.C_100228_nn.field_106196_z
		// @AE: iconst_0
		// @AF: aaload
		// @B0: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @B3: bipush 41 (0x29)
		// @B5: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B8: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @BB: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @BE: athrow
	}
	
	private final C_100214_al func_106183_a(int arg0, byte arg1, int[] arg2, int arg3)
	{
		// @00: iload_1
		// @01: iload #4
		// @03: ldc -805302273 (0xd0000fff)
		// @05: iand
		// @06: ldc -173575452 (0xf5a772e4)
		// @08: ishl
		// @09: iload #4
		// @0B: ldc -1546965716 (0xa3cb2d2c)
		// @0D: iushr
		// @0E: ior
		// @0F: ixor
		// @10: istore #5
		// @12: iload #5
		// @14: iload #4
		// @16: ldc -4146256 (0xffc0bbb0)
		// @18: ishl
		// @19: ior
		// @1A: istore #5
		// @1C: iload #5
		// @1E: i2l
		// @1F: lstore #6
		// @21: aload_0
		// @22: getfield game.C_100119_ua game.C_100228_nn.field_106184_f
		// @25: lload #6
		// @27: bipush 91 (0x5B)
		// @29: invokevirtual game.C_100119_ua.func_104891_a(long, int)game.C_100158_da
		// @2C: checkcast game.C_100214_al
		// @2F: astore #8
		// @31: aload #8
		// @33: ifnonnull @3A
		// @36: goto @3D
		// @39: athrow
		// @3A: aload #8
		// @3C: areturn
		// @3D: aconst_null
		// @3E: aload_3
		// @3F: if_acmpeq @53
		// @42: iconst_0
		// @43: aload_3
		// @44: iconst_0
		// @45: iaload
		// @46: if_icmpge @51
		// @49: goto @4D
		// @4C: athrow
		// @4D: goto @53
		// @50: athrow
		// @51: aconst_null
		// @52: areturn
		// @53: aload_0
		// @54: getfield game.C_100098_h game.C_100228_nn.field_106192_j
		// @57: iload #4
		// @59: iload_1
		// @5A: invokestatic game.C_100076_uk.func_104416_a(game.C_100098_h, int, int)game.C_100076_uk
		// @5D: astore #9
		// @5F: aconst_null
		// @60: aload #9
		// @62: if_acmpeq @69
		// @65: goto @6B
		// @68: athrow
		// @69: aconst_null
		// @6A: areturn
		// @6B: aload #9
		// @6D: invokevirtual game.C_100076_uk.func_104415_b()game.C_100214_al
		// @70: astore #8
		// @72: iload_2
		// @73: bipush 113 (0x71)
		// @75: if_icmpeq @84
		// @78: aload_0
		// @79: aconst_null
		// @7A: checkcast game.C_100119_ua
		// @7D: putfield game.C_100119_ua game.C_100228_nn.field_106184_f
		// @80: goto @84
		// @83: athrow
		// @84: aload_0
		// @85: getfield game.C_100119_ua game.C_100228_nn.field_106184_f
		// @88: aload #8
		// @8A: lload #6
		// @8C: iconst_1
		// @8D: invokevirtual game.C_100119_ua.func_104893_a(game.C_100158_da, long, boolean)void
		// @90: aload_3
		// @91: ifnonnull @98
		// @94: goto @A4
		// @97: athrow
		// @98: aload_3
		// @99: iconst_0
		// @9A: dup2
		// @9B: iaload
		// @9C: aload #8
		// @9E: getfield byte[] game.C_100214_al.field_100885_l
		// @A1: arraylength
		// @A2: isub
		// @A3: iastore
		// @A4: aload #8
		// @A6: areturn
		// @A7: astore #5
		// @A9: aload #5
		// @AB: new java.lang.StringBuilder
		// @AE: dup
		// @AF: invokespecial java.lang.StringBuilder.<init>()void
		// @B2: getstatic java.lang.String[] game.C_100228_nn.field_106196_z
		// @B5: iconst_5
		// @B6: aaload
		// @B7: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @BA: iload_1
		// @BB: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @BE: bipush 44 (0x2C)
		// @C0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C3: iload_2
		// @C4: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @C7: bipush 44 (0x2C)
		// @C9: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @CC: aload_3
		// @CD: ifnull @D9
		// @D0: getstatic java.lang.String[] game.C_100228_nn.field_106196_z
		// @D3: iconst_1
		// @D4: aaload
		// @D5: goto @DE
		// @D8: athrow
		// @D9: getstatic java.lang.String[] game.C_100228_nn.field_106196_z
		// @DC: iconst_0
		// @DD: aaload
		// @DE: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @E1: bipush 44 (0x2C)
		// @E3: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @E6: iload #4
		// @E8: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @EB: bipush 41 (0x29)
		// @ED: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @F0: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @F3: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @F6: athrow
	}
	
	final C_100214_al func_106176_a(int arg0, int arg1, int[] arg2)
	{
		// @00: iload_1
		// @01: aload_0
		// @02: getfield game.C_100098_h game.C_100228_nn.field_106192_j
		// @05: bipush 27 (0x1B)
		// @07: invokevirtual game.C_100098_h.func_104596_a(byte)int
		// @0A: if_icmpeq @11
		// @0D: goto @1B
		// @10: athrow
		// @11: aload_0
		// @12: iload_2
		// @13: bipush 113 (0x71)
		// @15: aload_3
		// @16: iconst_0
		// @17: invokespecial game.C_100228_nn.func_106183_a(int, byte, int[], int)game.C_100214_al
		// @1A: areturn
		// @1B: aload_0
		// @1C: getfield game.C_100098_h game.C_100228_nn.field_106192_j
		// @1F: iload_1
		// @20: bipush 41 (0x29)
		// @22: iadd
		// @23: iload_2
		// @24: invokevirtual game.C_100098_h.func_104591_c(int, int)int
		// @27: iconst_1
		// @28: if_icmpne @35
		// @2B: aload_0
		// @2C: iconst_0
		// @2D: bipush 113 (0x71)
		// @2F: aload_3
		// @30: iload_2
		// @31: invokespecial game.C_100228_nn.func_106183_a(int, byte, int[], int)game.C_100214_al
		// @34: areturn
		// @35: new java.lang.RuntimeException
		// @38: dup
		// @39: invokespecial java.lang.RuntimeException.<init>()void
		// @3C: athrow
		// @3D: astore #4
		// @3F: aload #4
		// @41: new java.lang.StringBuilder
		// @44: dup
		// @45: invokespecial java.lang.StringBuilder.<init>()void
		// @48: getstatic java.lang.String[] game.C_100228_nn.field_106196_z
		// @4B: bipush 7 (0x07)
		// @4D: aaload
		// @4E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @51: iload_1
		// @52: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @55: bipush 44 (0x2C)
		// @57: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5A: iload_2
		// @5B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5E: bipush 44 (0x2C)
		// @60: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @63: aload_3
		// @64: ifnull @70
		// @67: getstatic java.lang.String[] game.C_100228_nn.field_106196_z
		// @6A: iconst_1
		// @6B: aaload
		// @6C: goto @75
		// @6F: athrow
		// @70: getstatic java.lang.String[] game.C_100228_nn.field_106196_z
		// @73: iconst_0
		// @74: aaload
		// @75: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @78: bipush 41 (0x29)
		// @7A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @80: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @83: athrow
	}
	
	private final C_100214_al func_106182_a(boolean arg0, int arg1, int[] arg2, int arg3)
	{
		// @000: iload_2
		// @001: iload #4
		// @003: ldc -388962068 (0xe8d0e8ec)
		// @005: iushr
		// @006: ldc 65520 (0xfff0)
		// @008: iload #4
		// @00A: ldc -1594714556 (0xa0f29644)
		// @00C: ishl
		// @00D: iand
		// @00E: ior
		// @00F: ixor
		// @010: istore #5
		// @012: iload #5
		// @014: iload #4
		// @016: ldc 301378960 (0x11f6ad90)
		// @018: ishl
		// @019: ior
		// @01A: istore #5
		// @01C: ldc2_w 4294967296
		// @01F: iload #5
		// @021: i2l
		// @022: lxor
		// @023: lstore #6
		// @025: aload_0
		// @026: getfield game.C_100119_ua game.C_100228_nn.field_106184_f
		// @029: lload #6
		// @02B: bipush 84 (0x54)
		// @02D: invokevirtual game.C_100119_ua.func_104891_a(long, int)game.C_100158_da
		// @030: checkcast game.C_100214_al
		// @033: astore #8
		// @035: aload #8
		// @037: ifnull @03D
		// @03A: aload #8
		// @03C: areturn
		// @03D: aconst_null
		// @03E: aload_3
		// @03F: if_acmpeq @051
		// @042: aload_3
		// @043: iconst_0
		// @044: iaload
		// @045: iconst_m1
		// @046: ixor
		// @047: iconst_m1
		// @048: if_icmplt @051
		// @04B: goto @04F
		// @04E: athrow
		// @04F: aconst_null
		// @050: areturn
		// @051: aload_0
		// @052: getfield game.C_100119_ua game.C_100228_nn.field_106187_e
		// @055: lload #6
		// @057: bipush 83 (0x53)
		// @059: invokevirtual game.C_100119_ua.func_104891_a(long, int)game.C_100158_da
		// @05C: checkcast game.C_100319_hk
		// @05F: astore #9
		// @061: aconst_null
		// @062: aload #9
		// @064: if_acmpeq @06B
		// @067: goto @08B
		// @06A: athrow
		// @06B: aload_0
		// @06C: getfield game.C_100098_h game.C_100228_nn.field_106193_k
		// @06F: iload #4
		// @071: iload_2
		// @072: invokestatic game.C_100319_hk.func_101423_a(game.C_100098_h, int, int)game.C_100319_hk
		// @075: astore #9
		// @077: aconst_null
		// @078: aload #9
		// @07A: if_acmpne @07F
		// @07D: aconst_null
		// @07E: areturn
		// @07F: aload_0
		// @080: getfield game.C_100119_ua game.C_100228_nn.field_106187_e
		// @083: aload #9
		// @085: lload #6
		// @087: iconst_1
		// @088: invokevirtual game.C_100119_ua.func_104893_a(game.C_100158_da, long, boolean)void
		// @08B: aload #9
		// @08D: aload_3
		// @08E: invokevirtual game.C_100319_hk.func_101419_a(int[])game.C_100214_al
		// @091: astore #8
		// @093: aconst_null
		// @094: aload #8
		// @096: if_acmpeq @09D
		// @099: goto @09F
		// @09C: athrow
		// @09D: aconst_null
		// @09E: areturn
		// @09F: aload #9
		// @0A1: bipush 45 (0x2D)
		// @0A3: invokevirtual game.C_100319_hk.func_100583_c(int)void
		// @0A6: aload_0
		// @0A7: getfield game.C_100119_ua game.C_100228_nn.field_106184_f
		// @0AA: aload #8
		// @0AC: lload #6
		// @0AE: iload_1
		// @0AF: invokevirtual game.C_100119_ua.func_104893_a(game.C_100158_da, long, boolean)void
		// @0B2: aload #8
		// @0B4: areturn
		// @0B5: astore #5
		// @0B7: aload #5
		// @0B9: new java.lang.StringBuilder
		// @0BC: dup
		// @0BD: invokespecial java.lang.StringBuilder.<init>()void
		// @0C0: getstatic java.lang.String[] game.C_100228_nn.field_106196_z
		// @0C3: iconst_2
		// @0C4: aaload
		// @0C5: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0C8: iload_1
		// @0C9: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @0CC: bipush 44 (0x2C)
		// @0CE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0D1: iload_2
		// @0D2: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0D5: bipush 44 (0x2C)
		// @0D7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0DA: aload_3
		// @0DB: ifnull @0E7
		// @0DE: getstatic java.lang.String[] game.C_100228_nn.field_106196_z
		// @0E1: iconst_1
		// @0E2: aaload
		// @0E3: goto @0EC
		// @0E6: athrow
		// @0E7: getstatic java.lang.String[] game.C_100228_nn.field_106196_z
		// @0EA: iconst_0
		// @0EB: aaload
		// @0EC: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0EF: bipush 44 (0x2C)
		// @0F1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0F4: iload #4
		// @0F6: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0F9: bipush 41 (0x29)
		// @0FB: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0FE: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @101: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @104: athrow
	}
	
	public static void func_106178_a(int arg0)
	{
		// @00: iload_0
		// @01: bipush -2 (0xFE)
		// @03: if_icmpeq @0F
		// @06: bipush 44 (0x2C)
		// @08: invokestatic game.C_100228_nn.func_106178_a(int)void
		// @0B: goto @0F
		// @0E: athrow
		// @0F: aconst_null
		// @10: putstatic game.C_100260_mc game.C_100228_nn.field_106189_c
		// @13: aconst_null
		// @14: putstatic game.C_100037_wb game.C_100228_nn.field_106186_d
		// @17: aconst_null
		// @18: putstatic int[] game.C_100228_nn.field_106190_a
		// @1B: aconst_null
		// @1C: putstatic int[] game.C_100228_nn.field_106191_l
		// @1F: aconst_null
		// @20: putstatic game.C_100302_ka game.C_100228_nn.field_106185_g
		// @23: aconst_null
		// @24: putstatic java.lang.String game.C_100228_nn.field_106195_i
		// @27: aconst_null
		// @28: putstatic java.lang.String[] game.C_100228_nn.field_106188_b
		// @2B: aconst_null
		// @2C: putstatic java.lang.String game.C_100228_nn.field_106194_h
		// @2F: goto @53
		// @32: astore_1
		// @33: aload_1
		// @34: new java.lang.StringBuilder
		// @37: dup
		// @38: invokespecial java.lang.StringBuilder.<init>()void
		// @3B: getstatic java.lang.String[] game.C_100228_nn.field_106196_z
		// @3E: iconst_3
		// @3F: aaload
		// @40: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @43: iload_0
		// @44: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @47: bipush 41 (0x29)
		// @49: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @52: athrow
		// @53: return
	}
	
	final C_100214_al func_106181_a(int[] arg0, byte arg1, int arg2)
	{
		// @00: aload_0
		// @01: getfield game.C_100098_h game.C_100228_nn.field_106193_k
		// @04: bipush -118 (0x8A)
		// @06: invokevirtual game.C_100098_h.func_104596_a(byte)int
		// @09: iconst_m1
		// @0A: ixor
		// @0B: bipush -2 (0xFE)
		// @0D: if_icmpeq @14
		// @10: goto @1D
		// @13: athrow
		// @14: aload_0
		// @15: iconst_1
		// @16: iload_3
		// @17: aload_1
		// @18: iconst_0
		// @19: invokespecial game.C_100228_nn.func_106182_a(boolean, int, int[], int)game.C_100214_al
		// @1C: areturn
		// @1D: iconst_1
		// @1E: aload_0
		// @1F: getfield game.C_100098_h game.C_100228_nn.field_106193_k
		// @22: bipush 49 (0x31)
		// @24: iload_3
		// @25: invokevirtual game.C_100098_h.func_104591_c(int, int)int
		// @28: if_icmpeq @2F
		// @2B: goto @38
		// @2E: athrow
		// @2F: aload_0
		// @30: iconst_1
		// @31: iconst_0
		// @32: aload_1
		// @33: iload_3
		// @34: invokespecial game.C_100228_nn.func_106182_a(boolean, int, int[], int)game.C_100214_al
		// @37: areturn
		// @38: iload_2
		// @39: bipush 23 (0x17)
		// @3B: if_icmpgt @43
		// @3E: aconst_null
		// @3F: checkcast game.C_100214_al
		// @42: areturn
		// @43: new java.lang.RuntimeException
		// @46: dup
		// @47: invokespecial java.lang.RuntimeException.<init>()void
		// @4A: athrow
		// @4B: astore #4
		// @4D: aload #4
		// @4F: new java.lang.StringBuilder
		// @52: dup
		// @53: invokespecial java.lang.StringBuilder.<init>()void
		// @56: getstatic java.lang.String[] game.C_100228_nn.field_106196_z
		// @59: bipush 6 (0x06)
		// @5B: aaload
		// @5C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @5F: aload_1
		// @60: ifnull @6C
		// @63: getstatic java.lang.String[] game.C_100228_nn.field_106196_z
		// @66: iconst_1
		// @67: aaload
		// @68: goto @71
		// @6B: athrow
		// @6C: getstatic java.lang.String[] game.C_100228_nn.field_106196_z
		// @6F: iconst_0
		// @70: aaload
		// @71: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @74: bipush 44 (0x2C)
		// @76: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @79: iload_2
		// @7A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7D: bipush 44 (0x2C)
		// @7F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @82: iload_3
		// @83: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @86: bipush 41 (0x29)
		// @88: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @8E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @91: athrow
	}
	
	C_100228_nn(C_100098_h arg0, C_100098_h arg1)
	{
		// @00: aload_0
		// @01: invokespecial java.lang.Object.<init>()void
		// @04: aload_0
		// @05: new game.C_100119_ua
		// @08: dup
		// @09: sipush 256 (0x0100)
		// @0C: invokespecial game.C_100119_ua.<init>(int)void
		// @0F: putfield game.C_100119_ua game.C_100228_nn.field_106187_e
		// @12: aload_0
		// @13: new game.C_100119_ua
		// @16: dup
		// @17: sipush 256 (0x0100)
		// @1A: invokespecial game.C_100119_ua.<init>(int)void
		// @1D: putfield game.C_100119_ua game.C_100228_nn.field_106184_f
		// @20: aload_0
		// @21: aload_1
		// @22: putfield game.C_100098_h game.C_100228_nn.field_106192_j
		// @25: aload_0
		// @26: aload_2
		// @27: putfield game.C_100098_h game.C_100228_nn.field_106193_k
		// @2A: goto @79
		// @2D: astore_3
		// @2E: aload_3
		// @2F: new java.lang.StringBuilder
		// @32: dup
		// @33: invokespecial java.lang.StringBuilder.<init>()void
		// @36: getstatic java.lang.String[] game.C_100228_nn.field_106196_z
		// @39: iconst_4
		// @3A: aaload
		// @3B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3E: aload_1
		// @3F: ifnull @4B
		// @42: getstatic java.lang.String[] game.C_100228_nn.field_106196_z
		// @45: iconst_1
		// @46: aaload
		// @47: goto @50
		// @4A: athrow
		// @4B: getstatic java.lang.String[] game.C_100228_nn.field_106196_z
		// @4E: iconst_0
		// @4F: aaload
		// @50: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @53: bipush 44 (0x2C)
		// @55: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @58: aload_2
		// @59: ifnull @65
		// @5C: getstatic java.lang.String[] game.C_100228_nn.field_106196_z
		// @5F: iconst_1
		// @60: aaload
		// @61: goto @6A
		// @64: athrow
		// @65: getstatic java.lang.String[] game.C_100228_nn.field_106196_z
		// @68: iconst_0
		// @69: aaload
		// @6A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @6D: bipush 41 (0x29)
		// @6F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @72: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @75: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @78: athrow
		// @79: return
	}
	
	static
	{
		// @000: bipush 10 (0x0A)
		// @002: anewarray java.lang.String
		// @005: dup
		// @006: iconst_0
		// @007: ldc "\u0019\"I "
		// @009: invokestatic game.C_100228_nn.func_106180_z(java.lang.String)char[]
		// @00C: invokestatic game.C_100228_nn.func_106179_z(char[])java.lang.String
		// @00F: aastore
		// @010: dup
		// @011: iconst_1
		// @012: ldc "\u000cy\u000bb5"
		// @014: invokestatic game.C_100228_nn.func_106180_z(java.lang.String)char[]
		// @017: invokestatic game.C_100228_nn.func_106179_z(char[])java.lang.String
		// @01A: aastore
		// @01B: dup
		// @01C: iconst_2
		// @01D: ldc "\u00199\u000b\u000f`"
		// @01F: invokestatic game.C_100228_nn.func_106180_z(java.lang.String)char[]
		// @022: invokestatic game.C_100228_nn.func_106179_z(char[])java.lang.String
		// @025: aastore
		// @026: dup
		// @027: iconst_3
		// @028: ldc "\u00199\u000b\n`"
		// @02A: invokestatic game.C_100228_nn.func_106180_z(java.lang.String)char[]
		// @02D: invokestatic game.C_100228_nn.func_106179_z(char[])java.lang.String
		// @030: aastore
		// @031: dup
		// @032: iconst_4
		// @033: ldc "\u00199\u000bp!\u0019>Qr`"
		// @035: invokestatic game.C_100228_nn.func_106180_z(java.lang.String)char[]
		// @038: invokestatic game.C_100228_nn.func_106179_z(char[])java.lang.String
		// @03B: aastore
		// @03C: dup
		// @03D: iconst_5
		// @03E: ldc "\u00199\u000b\u000b`"
		// @040: invokestatic game.C_100228_nn.func_106180_z(java.lang.String)char[]
		// @043: invokestatic game.C_100228_nn.func_106179_z(char[])java.lang.String
		// @046: aastore
		// @047: dup
		// @048: bipush 6 (0x06)
		// @04A: ldc "\u00199\u000b\u0008`"
		// @04C: invokestatic game.C_100228_nn.func_106180_z(java.lang.String)char[]
		// @04F: invokestatic game.C_100228_nn.func_106179_z(char[])java.lang.String
		// @052: aastore
		// @053: dup
		// @054: bipush 7 (0x07)
		// @056: ldc "\u00199\u000b\t`"
		// @058: invokestatic game.C_100228_nn.func_106180_z(java.lang.String)char[]
		// @05B: invokestatic game.C_100228_nn.func_106179_z(char[])java.lang.String
		// @05E: aastore
		// @05F: dup
		// @060: bipush 8 (0x08)
		// @062: ldc "\u00199\u000b\r`"
		// @064: invokestatic game.C_100228_nn.func_106180_z(java.lang.String)char[]
		// @067: invokestatic game.C_100228_nn.func_106179_z(char[])java.lang.String
		// @06A: aastore
		// @06B: dup
		// @06C: bipush 9 (0x09)
		// @06E: ldc "\u00199\u000b\u000e`"
		// @070: invokestatic game.C_100228_nn.func_106180_z(java.lang.String)char[]
		// @073: invokestatic game.C_100228_nn.func_106179_z(char[])java.lang.String
		// @076: aastore
		// @077: putstatic java.lang.String[] game.C_100228_nn.field_106196_z
		// @07A: bipush 7 (0x07)
		// @07C: anewarray java.lang.String
		// @07F: dup
		// @080: iconst_0
		// @081: ldc "$\"K"
		// @083: invokestatic game.C_100228_nn.func_106180_z(java.lang.String)char[]
		// @086: invokestatic game.C_100228_nn.func_106179_z(char[])java.lang.String
		// @089: aastore
		// @08A: dup
		// @08B: iconst_1
		// @08C: ldc ":8K"
		// @08E: invokestatic game.C_100228_nn.func_106180_z(java.lang.String)char[]
		// @091: invokestatic game.C_100228_nn.func_106179_z(char[])java.lang.String
		// @094: aastore
		// @095: dup
		// @096: iconst_2
		// @097: ldc "#\"@"
		// @099: invokestatic game.C_100228_nn.func_106180_z(java.lang.String)char[]
		// @09C: invokestatic game.C_100228_nn.func_106179_z(char[])java.lang.String
		// @09F: aastore
		// @0A0: dup
		// @0A1: iconst_3
		// @0A2: ldc " 2A"
		// @0A4: invokestatic game.C_100228_nn.func_106180_z(java.lang.String)char[]
		// @0A7: invokestatic game.C_100228_nn.func_106179_z(char[])java.lang.String
		// @0AA: aastore
		// @0AB: dup
		// @0AC: iconst_4
		// @0AD: ldc "#?P"
		// @0AF: invokestatic game.C_100228_nn.func_106180_z(java.lang.String)char[]
		// @0B2: invokestatic game.C_100228_nn.func_106179_z(char[])java.lang.String
		// @0B5: aastore
		// @0B6: dup
		// @0B7: iconst_5
		// @0B8: ldc "1%L"
		// @0BA: invokestatic game.C_100228_nn.func_106180_z(java.lang.String)char[]
		// @0BD: invokestatic game.C_100228_nn.func_106179_z(char[])java.lang.String
		// @0C0: aastore
		// @0C1: dup
		// @0C2: bipush 6 (0x06)
		// @0C4: ldc "$6Q"
		// @0C6: invokestatic game.C_100228_nn.func_106180_z(java.lang.String)char[]
		// @0C9: invokestatic game.C_100228_nn.func_106179_z(char[])java.lang.String
		// @0CC: aastore
		// @0CD: putstatic java.lang.String[] game.C_100228_nn.field_106188_b
		// @0D0: ldc "#?L?h\u0018'Q%'\u0019wL?h\u00052V8:\u001e4Q),Yw|#=\u0005wW-<\u001e9Bl!\u0004wF9:\u00052K8$\u000ew\u0019ixIy\u0019.:I\u0014D\"h\u000e8Pl)\u0014?L)>\u0012wQ$-W&P-$\u001e1\\%&\u0010wW-<\u001e9Bl'\u0011w\u0019iyIh"
		// @0D2: invokestatic game.C_100228_nn.func_106180_z(java.lang.String)char[]
		// @0D5: invokestatic game.C_100228_nn.func_106179_z(char[])java.lang.String
		// @0D8: putstatic java.lang.String game.C_100228_nn.field_106195_i
		// @0DB: bipush 10 (0x0A)
		// @0DD: newarray int[]
		// @0DF: dup
		// @0E0: iconst_0
		// @0E1: bipush 107 (0x6B)
		// @0E3: iastore
		// @0E4: dup
		// @0E5: iconst_1
		// @0E6: bipush 35 (0x23)
		// @0E8: iastore
		// @0E9: dup
		// @0EA: iconst_2
		// @0EB: iconst_4
		// @0EC: iastore
		// @0ED: dup
		// @0EE: iconst_3
		// @0EF: bipush 9 (0x09)
		// @0F1: iastore
		// @0F2: dup
		// @0F3: iconst_4
		// @0F4: bipush 14 (0x0E)
		// @0F6: iastore
		// @0F7: dup
		// @0F8: iconst_5
		// @0F9: bipush 14 (0x0E)
		// @0FB: iastore
		// @0FC: dup
		// @0FD: bipush 6 (0x06)
		// @0FF: iconst_m1
		// @100: iastore
		// @101: dup
		// @102: bipush 7 (0x07)
		// @104: iconst_m1
		// @105: iastore
		// @106: dup
		// @107: bipush 8 (0x08)
		// @109: iconst_m1
		// @10A: iastore
		// @10B: dup
		// @10C: bipush 9 (0x09)
		// @10E: iconst_m1
		// @10F: iastore
		// @110: putstatic int[] game.C_100228_nn.field_106191_l
		// @113: sipush 8192 (0x2000)
		// @116: newarray int[]
		// @118: putstatic int[] game.C_100228_nn.field_106190_a
		// @11B: ldc "48K\"-\u0014#L\"/W#Jp*\u0005iC>!\u00129Al;\u0012%S):Yy\u000b"
		// @11D: invokestatic game.C_100228_nn.func_106180_z(java.lang.String)char[]
		// @120: invokestatic game.C_100228_nn.func_106179_z(char[])java.lang.String
		// @123: putstatic java.lang.String game.C_100228_nn.field_106194_h
		// @126: return
	}
	
	private static char[] func_106180_z(String arg0)
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
		// @0E: bipush 72 (0x48)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_106179_z(char[] arg0)
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
		// @30: bipush 119 (0x77)
		// @32: goto @46
		// @35: bipush 87 (0x57)
		// @37: goto @46
		// @3A: bipush 37 (0x25)
		// @3C: goto @46
		// @3F: bipush 76 (0x4C)
		// @41: goto @46
		// @44: bipush 72 (0x48)
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
