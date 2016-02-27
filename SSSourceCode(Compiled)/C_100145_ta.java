package game;

final class C_100145_ta implements C_100326_ic
{
	static boolean field_100427_l;
	static C_100302_ka field_100429_j;
	static int[] field_100432_i;
	private int field_100431_h;
	private int field_100423_b;
	private int field_100420_g;
	private int field_100425_a;
	private int field_100428_m;
	static C_100018_wk field_100426_n;
	static C_100006_fj field_100424_c;
	private C_100112_r field_100430_k;
	static C_100302_ka field_100422_e;
	private int field_100419_f;
	private int field_100421_d;
	private static final String[] field_100433_z;
	
	public static void func_100417_a(byte arg0)
	{
		// @00: aconst_null
		// @01: putstatic game.C_100018_wk game.C_100145_ta.field_100426_n
		// @04: aconst_null
		// @05: putstatic game.C_100006_fj game.C_100145_ta.field_100424_c
		// @08: iload_0
		// @09: bipush -35 (0xDD)
		// @0B: if_icmple @17
		// @0E: bipush 16 (0x10)
		// @10: invokestatic game.C_100145_ta.func_100417_a(byte)void
		// @13: goto @17
		// @16: athrow
		// @17: aconst_null
		// @18: putstatic int[] game.C_100145_ta.field_100432_i
		// @1B: aconst_null
		// @1C: putstatic game.C_100302_ka game.C_100145_ta.field_100429_j
		// @1F: aconst_null
		// @20: putstatic game.C_100302_ka game.C_100145_ta.field_100422_e
		// @23: goto @47
		// @26: astore_1
		// @27: aload_1
		// @28: new java.lang.StringBuilder
		// @2B: dup
		// @2C: invokespecial java.lang.StringBuilder.<init>()void
		// @2F: getstatic java.lang.String[] game.C_100145_ta.field_100433_z
		// @32: iconst_4
		// @33: aaload
		// @34: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @37: iload_0
		// @38: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3B: bipush 41 (0x29)
		// @3D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @40: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @43: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @46: athrow
		// @47: return
	}
	
	public final void func_100362_a(boolean arg0, int arg1, int arg2, int arg3, C_100336_im arg4)
	{
		// @000: aload #5
		// @002: instanceof game.C_100032_gk
		// @005: ifne @00D
		// @008: aconst_null
		// @009: goto @00F
		// @00C: athrow
		// @00D: aload #5
		// @00F: checkcast game.C_100032_gk
		// @012: checkcast game.C_100032_gk
		// @015: astore #6
		// @017: aload #6
		// @019: ifnonnull @01C
		// @01C: aload #5
		// @01E: getfield int game.C_100336_im.field_102538_m
		// @021: iload_3
		// @022: iadd
		// @023: aload #5
		// @025: getfield int game.C_100336_im.field_102541_w
		// @028: iload #4
		// @02A: iadd
		// @02B: aload #5
		// @02D: getfield int game.C_100336_im.field_102537_l
		// @030: aload #5
		// @032: getfield int game.C_100336_im.field_102544_t
		// @035: aload_0
		// @036: getfield int game.C_100145_ta.field_100419_f
		// @039: invokestatic game.C_100196_rb.func_105782_i(int, int, int, int, int)void
		// @03C: aload #6
		// @03E: getfield int game.C_100032_gk.field_103130_T
		// @041: iload_3
		// @042: iadd
		// @043: aload #5
		// @045: getfield int game.C_100336_im.field_102538_m
		// @048: ineg
		// @049: isub
		// @04A: istore #7
		// @04C: aload #6
		// @04E: getfield int game.C_100032_gk.field_103134_P
		// @051: aload #5
		// @053: getfield int game.C_100336_im.field_102541_w
		// @056: iload #4
		// @058: iadd
		// @059: iadd
		// @05A: istore #8
		// @05C: iload_2
		// @05D: sipush -26568 (0x9838)
		// @060: if_icmpeq @064
		// @063: return
		// @064: iload #7
		// @066: iload #8
		// @068: aload #6
		// @06A: getfield int game.C_100032_gk.field_103138_Y
		// @06D: aload_0
		// @06E: getfield int game.C_100145_ta.field_100423_b
		// @071: invokestatic game.C_100196_rb.func_105795_d(int, int, int, int)void
		// @074: iconst_0
		// @075: aload #6
		// @077: getfield int game.C_100032_gk.field_103131_W
		// @07A: iconst_m1
		// @07B: ixor
		// @07C: if_icmpeq @0C8
		// @07F: ldc2_w 3.141592653589793
		// @082: aload #6
		// @084: getfield int game.C_100032_gk.field_103131_W
		// @087: i2d
		// @088: dmul
		// @089: ldc2_w 2.0
		// @08C: dmul
		// @08D: aload #6
		// @08F: getfield int game.C_100032_gk.field_103136_R
		// @092: i2d
		// @093: ddiv
		// @094: dstore #9
		// @096: dload #9
		// @098: invokestatic java.lang.Math.sin(double)double
		// @09B: dneg
		// @09C: aload #6
		// @09E: getfield int game.C_100032_gk.field_103138_Y
		// @0A1: i2d
		// @0A2: dmul
		// @0A3: d2i
		// @0A4: istore #11
		// @0A6: dload #9
		// @0A8: invokestatic java.lang.Math.cos(double)double
		// @0AB: aload #6
		// @0AD: getfield int game.C_100032_gk.field_103138_Y
		// @0B0: i2d
		// @0B1: dmul
		// @0B2: d2i
		// @0B3: istore #12
		// @0B5: iload #11
		// @0B7: iload #7
		// @0B9: iadd
		// @0BA: iload #8
		// @0BC: iload #12
		// @0BE: ineg
		// @0BF: isub
		// @0C0: iconst_1
		// @0C1: aload_0
		// @0C2: getfield int game.C_100145_ta.field_100425_a
		// @0C5: invokestatic game.C_100196_rb.func_105795_d(int, int, int, int)void
		// @0C8: iload #7
		// @0CA: iload #8
		// @0CC: iconst_2
		// @0CD: iconst_1
		// @0CE: invokestatic game.C_100196_rb.func_105795_d(int, int, int, int)void
		// @0D1: ldc2_w 3.141592653589793
		// @0D4: aload #6
		// @0D6: getfield int game.C_100032_gk.field_103128_O
		// @0D9: i2d
		// @0DA: dmul
		// @0DB: ldc2_w 2.0
		// @0DE: dmul
		// @0DF: aload #6
		// @0E1: getfield int game.C_100032_gk.field_103136_R
		// @0E4: i2d
		// @0E5: ddiv
		// @0E6: dstore #9
		// @0E8: dload #9
		// @0EA: invokestatic java.lang.Math.sin(double)double
		// @0ED: dneg
		// @0EE: aload #6
		// @0F0: getfield int game.C_100032_gk.field_103138_Y
		// @0F3: i2d
		// @0F4: dmul
		// @0F5: d2i
		// @0F6: istore #11
		// @0F8: dload #9
		// @0FA: invokestatic java.lang.Math.cos(double)double
		// @0FD: aload #6
		// @0FF: getfield int game.C_100032_gk.field_103138_Y
		// @102: i2d
		// @103: dmul
		// @104: d2i
		// @105: istore #12
		// @107: iload #7
		// @109: iload #8
		// @10B: iload #11
		// @10D: iload #7
		// @10F: iadd
		// @110: iload #12
		// @112: iload #8
		// @114: iadd
		// @115: iconst_1
		// @116: invokestatic game.C_100196_rb.func_105802_e(int, int, int, int, int)void
		// @119: aconst_null
		// @11A: aload_0
		// @11B: getfield game.C_100112_r game.C_100145_ta.field_100430_k
		// @11E: if_acmpne @125
		// @121: goto @183
		// @124: athrow
		// @125: aload_0
		// @126: getfield int game.C_100145_ta.field_100421_d
		// @129: aload #6
		// @12B: getfield int game.C_100032_gk.field_103130_T
		// @12E: aload #6
		// @130: getfield int game.C_100032_gk.field_103138_Y
		// @133: iadd
		// @134: iadd
		// @135: istore #13
		// @137: aload_0
		// @138: getfield game.C_100112_r game.C_100145_ta.field_100430_k
		// @13B: aload #5
		// @13D: getfield java.lang.String game.C_100336_im.field_102534_C
		// @140: iload #13
		// @142: aload #5
		// @144: getfield int game.C_100336_im.field_102538_m
		// @147: iadd
		// @148: iload_3
		// @149: iadd
		// @14A: iload #4
		// @14C: aload #5
		// @14E: getfield int game.C_100336_im.field_102541_w
		// @151: ineg
		// @152: aload_0
		// @153: getfield int game.C_100145_ta.field_100420_g
		// @156: ineg
		// @157: iadd
		// @158: isub
		// @159: aload #5
		// @15B: getfield int game.C_100336_im.field_102537_l
		// @15E: iload #13
		// @160: isub
		// @161: aload_0
		// @162: getfield int game.C_100145_ta.field_100421_d
		// @165: isub
		// @166: aload_0
		// @167: getfield int game.C_100145_ta.field_100421_d
		// @16A: ldc 1648080993 (0x623bb861)
		// @16C: ishl
		// @16D: ineg
		// @16E: aload #5
		// @170: getfield int game.C_100336_im.field_102544_t
		// @173: iadd
		// @174: aload_0
		// @175: getfield int game.C_100145_ta.field_100431_h
		// @178: aload_0
		// @179: getfield int game.C_100145_ta.field_100428_m
		// @17C: iconst_1
		// @17D: iconst_1
		// @17E: iconst_0
		// @17F: invokevirtual game.C_100112_r.func_101729_a(java.lang.String, int, int, int, int, int, int, int, int, int)int
		// @182: pop
		// @183: goto @1E0
		// @186: astore #6
		// @188: aload #6
		// @18A: new java.lang.StringBuilder
		// @18D: dup
		// @18E: invokespecial java.lang.StringBuilder.<init>()void
		// @191: getstatic java.lang.String[] game.C_100145_ta.field_100433_z
		// @194: iconst_3
		// @195: aaload
		// @196: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @199: iload_1
		// @19A: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @19D: bipush 44 (0x2C)
		// @19F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1A2: iload_2
		// @1A3: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1A6: bipush 44 (0x2C)
		// @1A8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1AB: iload_3
		// @1AC: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1AF: bipush 44 (0x2C)
		// @1B1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1B4: iload #4
		// @1B6: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1B9: bipush 44 (0x2C)
		// @1BB: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1BE: aload #5
		// @1C0: ifnull @1CC
		// @1C3: getstatic java.lang.String[] game.C_100145_ta.field_100433_z
		// @1C6: iconst_1
		// @1C7: aaload
		// @1C8: goto @1D1
		// @1CB: athrow
		// @1CC: getstatic java.lang.String[] game.C_100145_ta.field_100433_z
		// @1CF: iconst_2
		// @1D0: aaload
		// @1D1: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1D4: bipush 41 (0x29)
		// @1D6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1D9: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @1DC: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @1DF: athrow
		// @1E0: return
	}
	
	C_100145_ta(C_100112_r arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7)
	{
		// @00: aload_0
		// @01: invokespecial java.lang.Object.<init>()void
		// @04: aload_0
		// @05: iload #6
		// @07: putfield int game.C_100145_ta.field_100423_b
		// @0A: aload_0
		// @0B: iload_2
		// @0C: putfield int game.C_100145_ta.field_100421_d
		// @0F: aload_0
		// @10: iload_3
		// @11: putfield int game.C_100145_ta.field_100420_g
		// @14: aload_0
		// @15: iload #7
		// @17: putfield int game.C_100145_ta.field_100425_a
		// @1A: aload_0
		// @1B: aload_1
		// @1C: putfield game.C_100112_r game.C_100145_ta.field_100430_k
		// @1F: aload_0
		// @20: iload #8
		// @22: putfield int game.C_100145_ta.field_100419_f
		// @25: aload_0
		// @26: iload #4
		// @28: putfield int game.C_100145_ta.field_100431_h
		// @2B: aload_0
		// @2C: iload #5
		// @2E: putfield int game.C_100145_ta.field_100428_m
		// @31: goto @AC
		// @34: astore #9
		// @36: aload #9
		// @38: new java.lang.StringBuilder
		// @3B: dup
		// @3C: invokespecial java.lang.StringBuilder.<init>()void
		// @3F: getstatic java.lang.String[] game.C_100145_ta.field_100433_z
		// @42: iconst_0
		// @43: aaload
		// @44: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @47: aload_1
		// @48: ifnull @54
		// @4B: getstatic java.lang.String[] game.C_100145_ta.field_100433_z
		// @4E: iconst_1
		// @4F: aaload
		// @50: goto @59
		// @53: athrow
		// @54: getstatic java.lang.String[] game.C_100145_ta.field_100433_z
		// @57: iconst_2
		// @58: aaload
		// @59: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
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
		// @73: iload #4
		// @75: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @78: bipush 44 (0x2C)
		// @7A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7D: iload #5
		// @7F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @82: bipush 44 (0x2C)
		// @84: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @87: iload #6
		// @89: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8C: bipush 44 (0x2C)
		// @8E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @91: iload #7
		// @93: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @96: bipush 44 (0x2C)
		// @98: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9B: iload #8
		// @9D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A0: bipush 41 (0x29)
		// @A2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A5: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @A8: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @AB: athrow
		// @AC: return
	}
	
	static
	{
		// @00: iconst_5
		// @01: anewarray java.lang.String
		// @04: dup
		// @05: iconst_0
		// @06: ldc "\u00028M\u000f_\u00180\u0017\r\u001e"
		// @08: invokestatic game.C_100145_ta.func_100418_z(java.lang.String)char[]
		// @0B: invokestatic game.C_100145_ta.func_100416_z(char[])java.lang.String
		// @0E: aastore
		// @0F: dup
		// @10: iconst_1
		// @11: ldc "\rwM\u001dK"
		// @13: invokestatic game.C_100145_ta.func_100418_z(java.lang.String)char[]
		// @16: invokestatic game.C_100145_ta.func_100416_z(char[])java.lang.String
		// @19: aastore
		// @1A: dup
		// @1B: iconst_2
		// @1C: ldc "\u0018,\u000f_"
		// @1E: invokestatic game.C_100145_ta.func_100418_z(java.lang.String)char[]
		// @21: invokestatic game.C_100145_ta.func_100416_z(char[])java.lang.String
		// @24: aastore
		// @25: dup
		// @26: iconst_3
		// @27: ldc "\u00028Mw\u001e"
		// @29: invokestatic game.C_100145_ta.func_100418_z(java.lang.String)char[]
		// @2C: invokestatic game.C_100145_ta.func_100416_z(char[])java.lang.String
		// @2F: aastore
		// @30: dup
		// @31: iconst_4
		// @32: ldc "\u00028Mr\u001e"
		// @34: invokestatic game.C_100145_ta.func_100418_z(java.lang.String)char[]
		// @37: invokestatic game.C_100145_ta.func_100416_z(char[])java.lang.String
		// @3A: aastore
		// @3B: putstatic java.lang.String[] game.C_100145_ta.field_100433_z
		// @3E: iconst_4
		// @3F: newarray int[]
		// @41: putstatic int[] game.C_100145_ta.field_100432_i
		// @44: iconst_1
		// @45: putstatic boolean game.C_100145_ta.field_100427_l
		// @48: aconst_null
		// @49: putstatic game.C_100302_ka game.C_100145_ta.field_100422_e
		// @4C: new game.C_100006_fj
		// @4F: dup
		// @50: invokespecial game.C_100006_fj.<init>()void
		// @53: putstatic game.C_100006_fj game.C_100145_ta.field_100424_c
		// @56: return
	}
	
	private static char[] func_100418_z(String arg0)
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
		// @0E: bipush 54 (0x36)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_100416_z(char[] arg0)
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
		// @30: bipush 118 (0x76)
		// @32: goto @46
		// @35: bipush 89 (0x59)
		// @37: goto @46
		// @3A: bipush 99 (0x63)
		// @3C: goto @46
		// @3F: bipush 51 (0x33)
		// @41: goto @46
		// @44: bipush 54 (0x36)
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
