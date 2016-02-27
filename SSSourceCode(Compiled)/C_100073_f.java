package game;

final class C_100073_f extends C_100325_id
{
	char[] field_101712_w;
	static C_100302_ka field_101720_z;
	int[] field_101721_y;
	boolean field_101715_t;
	static C_100037_wb[] field_101717_A;
	String field_101714_u;
	static int[] field_101716_s;
	static String[] field_101718_B;
	int[] field_101713_v;
	char[] field_101722_x;
	private static final String[] field_101719_C;
	
	static final void func_101707_i(int arg0)
	{
		// @00: iload_0
		// @01: sipush 8192 (0x2000)
		// @04: if_icmpeq @0E
		// @07: aconst_null
		// @08: checkcast int[]
		// @0B: putstatic int[] game.C_100073_f.field_101716_s
		// @0E: goto @33
		// @11: astore_1
		// @12: aload_1
		// @13: new java.lang.StringBuilder
		// @16: dup
		// @17: invokespecial java.lang.StringBuilder.<init>()void
		// @1A: getstatic java.lang.String[] game.C_100073_f.field_101719_C
		// @1D: bipush 6 (0x06)
		// @1F: aaload
		// @20: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @23: iload_0
		// @24: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @27: bipush 41 (0x29)
		// @29: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @2F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @32: athrow
		// @33: return
	}
	
	public static void func_101711_j(int arg0)
	{
		// @00: iload_0
		// @01: sipush 18761 (0x4949)
		// @04: if_icmpeq @08
		// @07: return
		// @08: aconst_null
		// @09: putstatic java.lang.String[] game.C_100073_f.field_101718_B
		// @0C: aconst_null
		// @0D: putstatic game.C_100037_wb[] game.C_100073_f.field_101717_A
		// @10: aconst_null
		// @11: putstatic game.C_100302_ka game.C_100073_f.field_101720_z
		// @14: aconst_null
		// @15: putstatic int[] game.C_100073_f.field_101716_s
		// @18: goto @3C
		// @1B: astore_1
		// @1C: aload_1
		// @1D: new java.lang.StringBuilder
		// @20: dup
		// @21: invokespecial java.lang.StringBuilder.<init>()void
		// @24: getstatic java.lang.String[] game.C_100073_f.field_101719_C
		// @27: iconst_0
		// @28: aaload
		// @29: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2C: iload_0
		// @2D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @30: bipush 41 (0x29)
		// @32: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @35: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @38: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3B: athrow
		// @3C: return
	}
	
	private final void func_101704_a(int arg0, C_100280_nf arg1, int arg2)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #7
		// @005: iload_1
		// @006: sipush -16945 (0xBDCF)
		// @009: if_icmpeq @01A
		// @00C: aload_0
		// @00D: bipush 13 (0x0D)
		// @00F: aconst_null
		// @010: checkcast game.C_100280_nf
		// @013: invokevirtual game.C_100073_f.func_101706_a(int, game.C_100280_nf)void
		// @016: goto @01A
		// @019: athrow
		// @01A: iload_3
		// @01B: iconst_m1
		// @01C: ixor
		// @01D: bipush -2 (0xFE)
		// @01F: if_icmpeq @11C
		// @022: iload_3
		// @023: iconst_m1
		// @024: ixor
		// @025: bipush -3 (0xFD)
		// @027: if_icmpne @093
		// @02A: goto @02E
		// @02D: athrow
		// @02E: aload_2
		// @02F: iconst_0
		// @030: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @033: istore #4
		// @035: aload_0
		// @036: iload #4
		// @038: newarray char[]
		// @03A: putfield char[] game.C_100073_f.field_101722_x
		// @03D: aload_0
		// @03E: iload #4
		// @040: newarray int[]
		// @042: putfield int[] game.C_100073_f.field_101713_v
		// @045: iconst_0
		// @046: istore #5
		// @048: iload #4
		// @04A: iload #5
		// @04C: if_icmple @08E
		// @04F: aload_0
		// @050: getfield int[] game.C_100073_f.field_101713_v
		// @053: iload #5
		// @055: aload_2
		// @056: bipush -2 (0xFE)
		// @058: invokevirtual game.C_100280_nf.func_101143_l(int)int
		// @05B: iastore
		// @05C: aload_2
		// @05D: bipush -111 (0x91)
		// @05F: invokevirtual game.C_100280_nf.func_101146_c(byte)byte
		// @062: istore #6
		// @064: iload #7
		// @066: ifne @12B
		// @069: aload_0
		// @06A: getfield char[] game.C_100073_f.field_101722_x
		// @06D: iload #5
		// @06F: iconst_0
		// @070: iload #6
		// @072: if_icmpne @07E
		// @075: goto @079
		// @078: athrow
		// @079: iconst_0
		// @07A: goto @085
		// @07D: athrow
		// @07E: bipush -108 (0x94)
		// @080: iload #6
		// @082: invokestatic game.C_100329_ih.func_107266_a(int, byte)char
		// @085: castore
		// @086: iinc #5 +1
		// @089: iload #7
		// @08B: ifeq @048
		// @08E: iload #7
		// @090: ifeq @12B
		// @093: iload_3
		// @094: iconst_3
		// @095: if_icmpne @105
		// @098: goto @09C
		// @09B: athrow
		// @09C: aload_2
		// @09D: iconst_0
		// @09E: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @0A1: istore #4
		// @0A3: aload_0
		// @0A4: iload #4
		// @0A6: newarray int[]
		// @0A8: putfield int[] game.C_100073_f.field_101721_y
		// @0AB: aload_0
		// @0AC: iload #4
		// @0AE: newarray char[]
		// @0B0: putfield char[] game.C_100073_f.field_101712_w
		// @0B3: iconst_0
		// @0B4: istore #5
		// @0B6: iload #4
		// @0B8: iconst_m1
		// @0B9: ixor
		// @0BA: iload #5
		// @0BC: iconst_m1
		// @0BD: ixor
		// @0BE: if_icmpge @100
		// @0C1: aload_0
		// @0C2: getfield int[] game.C_100073_f.field_101721_y
		// @0C5: iload #5
		// @0C7: aload_2
		// @0C8: bipush -2 (0xFE)
		// @0CA: invokevirtual game.C_100280_nf.func_101143_l(int)int
		// @0CD: iastore
		// @0CE: aload_2
		// @0CF: bipush -119 (0x89)
		// @0D1: invokevirtual game.C_100280_nf.func_101146_c(byte)byte
		// @0D4: istore #6
		// @0D6: iload #7
		// @0D8: ifne @12B
		// @0DB: aload_0
		// @0DC: getfield char[] game.C_100073_f.field_101712_w
		// @0DF: iload #5
		// @0E1: iconst_0
		// @0E2: iload #6
		// @0E4: if_icmpne @0F0
		// @0E7: goto @0EB
		// @0EA: athrow
		// @0EB: iconst_0
		// @0EC: goto @0F7
		// @0EF: athrow
		// @0F0: bipush -116 (0x8C)
		// @0F2: iload #6
		// @0F4: invokestatic game.C_100329_ih.func_107266_a(int, byte)char
		// @0F7: castore
		// @0F8: iinc #5 +1
		// @0FB: iload #7
		// @0FD: ifeq @0B6
		// @100: iload #7
		// @102: ifeq @12B
		// @105: iload_3
		// @106: iconst_4
		// @107: if_icmpeq @112
		// @10A: goto @10E
		// @10D: athrow
		// @10E: goto @12B
		// @111: athrow
		// @112: aload_0
		// @113: iconst_1
		// @114: putfield boolean game.C_100073_f.field_101715_t
		// @117: iload #7
		// @119: ifeq @12B
		// @11C: aload_0
		// @11D: aload_2
		// @11E: sipush 9692 (0x25DC)
		// @121: invokevirtual game.C_100280_nf.func_101164_f(int)java.lang.String
		// @124: putfield java.lang.String game.C_100073_f.field_101714_u
		// @127: goto @12B
		// @12A: athrow
		// @12B: goto @175
		// @12E: astore #4
		// @130: aload #4
		// @132: new java.lang.StringBuilder
		// @135: dup
		// @136: invokespecial java.lang.StringBuilder.<init>()void
		// @139: getstatic java.lang.String[] game.C_100073_f.field_101719_C
		// @13C: bipush 7 (0x07)
		// @13E: aaload
		// @13F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @142: iload_1
		// @143: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @146: bipush 44 (0x2C)
		// @148: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @14B: aload_2
		// @14C: ifnull @158
		// @14F: getstatic java.lang.String[] game.C_100073_f.field_101719_C
		// @152: iconst_3
		// @153: aaload
		// @154: goto @15D
		// @157: athrow
		// @158: getstatic java.lang.String[] game.C_100073_f.field_101719_C
		// @15B: iconst_5
		// @15C: aaload
		// @15D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @160: bipush 44 (0x2C)
		// @162: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @165: iload_3
		// @166: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @169: bipush 41 (0x29)
		// @16B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @16E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @171: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @174: athrow
		// @175: return
	}
	
	final void func_101706_a(int arg0, C_100280_nf arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #5
		// @05: bipush -97 (0x9F)
		// @07: bipush 57 (0x39)
		// @09: iload_1
		// @0A: isub
		// @0B: bipush 53 (0x35)
		// @0D: idiv
		// @0E: irem
		// @0F: istore_3
		// @10: aload_2
		// @11: iconst_0
		// @12: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @15: istore #4
		// @17: iload #4
		// @19: ifeq @34
		// @1C: aload_0
		// @1D: sipush -16945 (0xBDCF)
		// @20: aload_2
		// @21: iload #4
		// @23: invokespecial game.C_100073_f.func_101704_a(int, game.C_100280_nf, int)void
		// @26: iload #5
		// @28: ifne @72
		// @2B: iload #5
		// @2D: ifeq @10
		// @30: goto @34
		// @33: athrow
		// @34: goto @72
		// @37: astore_3
		// @38: aload_3
		// @39: new java.lang.StringBuilder
		// @3C: dup
		// @3D: invokespecial java.lang.StringBuilder.<init>()void
		// @40: getstatic java.lang.String[] game.C_100073_f.field_101719_C
		// @43: iconst_4
		// @44: aaload
		// @45: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @48: iload_1
		// @49: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4C: bipush 44 (0x2C)
		// @4E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @51: aload_2
		// @52: ifnull @5E
		// @55: getstatic java.lang.String[] game.C_100073_f.field_101719_C
		// @58: iconst_3
		// @59: aaload
		// @5A: goto @63
		// @5D: athrow
		// @5E: getstatic java.lang.String[] game.C_100073_f.field_101719_C
		// @61: iconst_5
		// @62: aaload
		// @63: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @66: bipush 41 (0x29)
		// @68: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @6E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @71: athrow
		// @72: return
	}
	
	final void func_101705_d(byte arg0)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore_3
		// @04: aload_0
		// @05: getfield int[] game.C_100073_f.field_101721_y
		// @08: ifnull @36
		// @0B: iconst_0
		// @0C: istore_2
		// @0D: iload_2
		// @0E: aload_0
		// @0F: getfield int[] game.C_100073_f.field_101721_y
		// @12: arraylength
		// @13: if_icmpge @36
		// @16: aload_0
		// @17: getfield int[] game.C_100073_f.field_101721_y
		// @1A: iload_2
		// @1B: aload_0
		// @1C: getfield int[] game.C_100073_f.field_101721_y
		// @1F: iload_2
		// @20: iaload
		// @21: ldc 32768 (0x8000)
		// @23: invokestatic game.C_100116_ei.func_104117_a(int, int)int
		// @26: iastore
		// @27: iinc #2 +1
		// @2A: iload_3
		// @2B: ifne @74
		// @2E: iload_3
		// @2F: ifeq @0D
		// @32: goto @36
		// @35: athrow
		// @36: aconst_null
		// @37: aload_0
		// @38: getfield int[] game.C_100073_f.field_101713_v
		// @3B: if_acmpeq @69
		// @3E: iconst_0
		// @3F: istore_2
		// @40: iload_2
		// @41: aload_0
		// @42: getfield int[] game.C_100073_f.field_101713_v
		// @45: arraylength
		// @46: if_icmpge @69
		// @49: aload_0
		// @4A: getfield int[] game.C_100073_f.field_101713_v
		// @4D: iload_2
		// @4E: aload_0
		// @4F: getfield int[] game.C_100073_f.field_101713_v
		// @52: iload_2
		// @53: iaload
		// @54: ldc 32768 (0x8000)
		// @56: invokestatic game.C_100116_ei.func_104117_a(int, int)int
		// @59: iastore
		// @5A: iinc #2 +1
		// @5D: iload_3
		// @5E: ifne @74
		// @61: iload_3
		// @62: ifeq @40
		// @65: goto @69
		// @68: athrow
		// @69: bipush -81 (0xAF)
		// @6B: iload_1
		// @6C: bipush 46 (0x2E)
		// @6E: isub
		// @6F: bipush 56 (0x38)
		// @71: idiv
		// @72: irem
		// @73: istore_2
		// @74: goto @98
		// @77: astore_2
		// @78: aload_2
		// @79: new java.lang.StringBuilder
		// @7C: dup
		// @7D: invokespecial java.lang.StringBuilder.<init>()void
		// @80: getstatic java.lang.String[] game.C_100073_f.field_101719_C
		// @83: iconst_1
		// @84: aaload
		// @85: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @88: iload_1
		// @89: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8C: bipush 41 (0x29)
		// @8E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @91: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @94: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @97: athrow
		// @98: return
	}
	
	static final int func_101710_a(byte arg0, int arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore_3
		// @04: iload_0
		// @05: bipush -51 (0xCD)
		// @07: if_icmpeq @13
		// @0A: bipush 103 (0x67)
		// @0C: invokestatic game.C_100073_f.func_101707_i(int)void
		// @0F: goto @13
		// @12: athrow
		// @13: iload_1
		// @14: istore_2
		// @15: iload_2
		// @16: iconst_2
		// @17: if_icmpeq @B0
		// @1A: iload_2
		// @1B: iconst_m1
		// @1C: ixor
		// @1D: bipush -57 (0xC7)
		// @1F: if_icmpeq @B3
		// @22: goto @26
		// @25: athrow
		// @26: bipush -59 (0xC5)
		// @28: iload_2
		// @29: iconst_m1
		// @2A: ixor
		// @2B: if_icmpne @3A
		// @2E: goto @32
		// @31: athrow
		// @32: iload_3
		// @33: ifeq @B6
		// @36: goto @3A
		// @39: athrow
		// @3A: bipush 66 (0x42)
		// @3C: iload_2
		// @3D: if_icmpne @4C
		// @40: goto @44
		// @43: athrow
		// @44: iload_3
		// @45: ifeq @B9
		// @48: goto @4C
		// @4B: athrow
		// @4C: iload_2
		// @4D: iconst_m1
		// @4E: ixor
		// @4F: bipush -71 (0xB9)
		// @51: if_icmpeq @BC
		// @54: goto @58
		// @57: athrow
		// @58: iload_2
		// @59: iconst_m1
		// @5A: ixor
		// @5B: bipush -77 (0xB3)
		// @5D: if_icmpne @6C
		// @60: goto @64
		// @63: athrow
		// @64: iload_3
		// @65: ifeq @BF
		// @68: goto @6C
		// @6B: athrow
		// @6C: bipush 80 (0x50)
		// @6E: iload_2
		// @6F: if_icmpne @7E
		// @72: goto @76
		// @75: athrow
		// @76: iload_3
		// @77: ifeq @C2
		// @7A: goto @7E
		// @7D: athrow
		// @7E: bipush 85 (0x55)
		// @80: iload_2
		// @81: if_icmpeq @C5
		// @84: goto @88
		// @87: athrow
		// @88: iload_2
		// @89: iconst_m1
		// @8A: ixor
		// @8B: bipush -90 (0xA6)
		// @8D: if_icmpne @9C
		// @90: goto @94
		// @93: athrow
		// @94: iload_3
		// @95: ifeq @C8
		// @98: goto @9C
		// @9B: athrow
		// @9C: iload_2
		// @9D: iconst_m1
		// @9E: ixor
		// @9F: bipush -94 (0xA2)
		// @A1: if_icmpne @CE
		// @A4: goto @A8
		// @A7: athrow
		// @A8: iload_3
		// @A9: ifeq @CB
		// @AC: goto @B0
		// @AF: athrow
		// @B0: bipush 96 (0x60)
		// @B2: ireturn
		// @B3: bipush 97 (0x61)
		// @B5: ireturn
		// @B6: bipush 98 (0x62)
		// @B8: ireturn
		// @B9: bipush 99 (0x63)
		// @BB: ireturn
		// @BC: bipush 100 (0x64)
		// @BE: ireturn
		// @BF: bipush 102 (0x66)
		// @C1: ireturn
		// @C2: bipush 103 (0x67)
		// @C4: ireturn
		// @C5: bipush 104 (0x68)
		// @C7: ireturn
		// @C8: bipush 105 (0x69)
		// @CA: ireturn
		// @CB: bipush 106 (0x6A)
		// @CD: ireturn
		// @CE: iconst_m1
		// @CF: ireturn
		// @D0: astore_2
		// @D1: aload_2
		// @D2: new java.lang.StringBuilder
		// @D5: dup
		// @D6: invokespecial java.lang.StringBuilder.<init>()void
		// @D9: getstatic java.lang.String[] game.C_100073_f.field_101719_C
		// @DC: iconst_2
		// @DD: aaload
		// @DE: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @E1: iload_0
		// @E2: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @E5: bipush 44 (0x2C)
		// @E7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @EA: iload_1
		// @EB: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @EE: bipush 41 (0x29)
		// @F0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @F3: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @F6: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @F9: athrow
	}
	
	C_100073_f()
	{
		// @0: aload_0
		// @1: invokespecial game.C_100325_id.<init>()void
		// @4: aload_0
		// @5: iconst_0
		// @6: putfield boolean game.C_100073_f.field_101715_t
		// @9: return
	}
	
	static
	{
		// @00: bipush 8 (0x08)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "\u0013-f\u0016"
		// @09: invokestatic game.C_100073_f.func_101709_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100073_f.func_101708_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "\u0013-d\u0016"
		// @14: invokestatic game.C_100073_f.func_101709_z(java.lang.String)char[]
		// @17: invokestatic game.C_100073_f.func_101708_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "\u0013-c\u0016"
		// @1F: invokestatic game.C_100073_f.func_101709_z(java.lang.String)char[]
		// @22: invokestatic game.C_100073_f.func_101708_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "\u000e-\u000b\u0010y"
		// @2A: invokestatic game.C_100073_f.func_101709_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100073_f.func_101708_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "\u0013-`\u0016"
		// @35: invokestatic game.C_100073_f.func_101709_z(java.lang.String)char[]
		// @38: invokestatic game.C_100073_f.func_101708_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "\u001bvIR"
		// @40: invokestatic game.C_100073_f.func_101709_z(java.lang.String)char[]
		// @43: invokestatic game.C_100073_f.func_101708_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "\u0013-g\u0016"
		// @4C: invokestatic game.C_100073_f.func_101709_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100073_f.func_101708_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "\u0013-a\u0016"
		// @58: invokestatic game.C_100073_f.func_101709_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100073_f.func_101708_z(char[])java.lang.String
		// @5E: aastore
		// @5F: putstatic java.lang.String[] game.C_100073_f.field_101719_C
		// @62: sipush 8192 (0x2000)
		// @65: newarray int[]
		// @67: putstatic int[] game.C_100073_f.field_101716_s
		// @6A: return
	}
	
	private static char[] func_101709_z(String arg0)
	{
		// @00: aload_0
		// @01: invokevirtual java.lang.String.toCharArray()char[]
		// @04: dup
		// @05: arraylength
		// @06: iconst_2
		// @07: if_icmpge @12
		// @0A: dup
		// @0B: iconst_0
		// @0C: dup2
		// @0D: caload
		// @0E: iconst_4
		// @0F: ixor
		// @10: i2c
		// @11: castore
		// @12: areturn
	}
	
	private static String func_101708_z(char[] arg0)
	{
		// @00: aload_0
		// @01: dup
		// @02: arraylength
		// @03: swap
		// @04: iconst_0
		// @05: istore_1
		// @06: goto @4A
		// @09: dup
		// @0A: iload_1
		// @0B: dup2
		// @0C: caload
		// @0D: iload_1
		// @0E: iconst_5
		// @0F: irem
		// @10: tableswitch def: @43, for 0: @30, for 1: @35, for 2: @39, for 3: @3E
		// @30: bipush 117 (0x75)
		// @32: goto @44
		// @35: iconst_3
		// @36: goto @44
		// @39: bipush 37 (0x25)
		// @3B: goto @44
		// @3E: bipush 62 (0x3E)
		// @40: goto @44
		// @43: iconst_4
		// @44: ixor
		// @45: i2c
		// @46: castore
		// @47: iinc #1 +1
		// @4A: swap
		// @4B: dup_x1
		// @4C: iload_1
		// @4D: if_icmpgt @09
		// @50: new java.lang.String
		// @53: dup_x1
		// @54: swap
		// @55: invokespecial java.lang.String.<init>(char[])void
		// @58: invokevirtual java.lang.String.intern()java.lang.String
		// @5B: areturn
	}
}
