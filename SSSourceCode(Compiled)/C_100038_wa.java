package game;

final class C_100038_wa
{
	static C_100251_pm field_104068_d;
	static int field_104077_j;
	static int field_104075_l;
	static String field_104076_m;
	static String field_104067_g;
	static C_100153_be[] field_104072_a;
	static C_100302_ka field_104074_o;
	private int[] field_104079_h;
	private int field_104070_b;
	private int field_104066_f;
	private int field_104078_k;
	static C_100290_jm field_104069_e;
	private int field_104071_c;
	private int[] field_104080_i;
	static C_100118_ub field_104073_n;
	private static final String[] field_104081_z;
	
	static final String func_104056_b(int arg0)
	{
		// @00: iload_0
		// @01: bipush -7 (0xF9)
		// @03: if_icmpeq @0F
		// @06: iconst_4
		// @07: invokestatic game.C_100038_wa.func_104065_b(byte)game.C_100096_un
		// @0A: pop
		// @0B: goto @0F
		// @0E: athrow
		// @0F: getstatic java.lang.String game.C_100216_aj.field_104449_B
		// @12: areturn
		// @13: astore_1
		// @14: aload_1
		// @15: new java.lang.StringBuilder
		// @18: dup
		// @19: invokespecial java.lang.StringBuilder.<init>()void
		// @1C: getstatic java.lang.String[] game.C_100038_wa.field_104081_z
		// @1F: bipush 9 (0x09)
		// @21: aaload
		// @22: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @25: iload_0
		// @26: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @29: bipush 41 (0x29)
		// @2B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @31: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @34: athrow
	}
	
	public static void func_104058_a(byte arg0)
	{
		// @00: aconst_null
		// @01: putstatic game.C_100302_ka game.C_100038_wa.field_104074_o
		// @04: aconst_null
		// @05: putstatic java.lang.String game.C_100038_wa.field_104067_g
		// @08: iload_0
		// @09: bipush 117 (0x75)
		// @0B: if_icmpeq @19
		// @0E: aconst_null
		// @0F: checkcast java.lang.String
		// @12: putstatic java.lang.String game.C_100038_wa.field_104076_m
		// @15: goto @19
		// @18: athrow
		// @19: aconst_null
		// @1A: putstatic game.C_100251_pm game.C_100038_wa.field_104068_d
		// @1D: aconst_null
		// @1E: putstatic game.C_100118_ub game.C_100038_wa.field_104073_n
		// @21: aconst_null
		// @22: putstatic game.C_100153_be[] game.C_100038_wa.field_104072_a
		// @25: aconst_null
		// @26: putstatic java.lang.String game.C_100038_wa.field_104076_m
		// @29: aconst_null
		// @2A: putstatic game.C_100290_jm game.C_100038_wa.field_104069_e
		// @2D: goto @51
		// @30: astore_1
		// @31: aload_1
		// @32: new java.lang.StringBuilder
		// @35: dup
		// @36: invokespecial java.lang.StringBuilder.<init>()void
		// @39: getstatic java.lang.String[] game.C_100038_wa.field_104081_z
		// @3C: iconst_0
		// @3D: aaload
		// @3E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @41: iload_0
		// @42: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @45: bipush 41 (0x29)
		// @47: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @50: athrow
		// @51: return
	}
	
	private final void func_104060_a(boolean arg0)
	{
		// @000: iload_1
		// @001: iconst_1
		// @002: if_icmpeq @010
		// @005: bipush 82 (0x52)
		// @007: bipush -6 (0xFA)
		// @009: invokestatic game.C_100038_wa.func_104064_a(int, int)void
		// @00C: goto @010
		// @00F: athrow
		// @010: aload_0
		// @011: dup
		// @012: getfield int game.C_100038_wa.field_104078_k
		// @015: aload_0
		// @016: dup
		// @017: getfield int game.C_100038_wa.field_104070_b
		// @01A: iconst_1
		// @01B: iadd
		// @01C: dup_x1
		// @01D: putfield int game.C_100038_wa.field_104070_b
		// @020: iadd
		// @021: putfield int game.C_100038_wa.field_104078_k
		// @024: iconst_0
		// @025: istore_2
		// @026: iload_2
		// @027: sipush 256 (0x0100)
		// @02A: if_icmpge @0FC
		// @02D: aload_0
		// @02E: getfield int[] game.C_100038_wa.field_104080_i
		// @031: iload_2
		// @032: iaload
		// @033: istore_3
		// @034: iconst_0
		// @035: iconst_2
		// @036: iload_2
		// @037: iand
		// @038: if_icmpeq @06F
		// @03B: iload_2
		// @03C: iconst_1
		// @03D: iand
		// @03E: iconst_m1
		// @03F: ixor
		// @040: iconst_m1
		// @041: if_icmpeq @05C
		// @044: goto @048
		// @047: athrow
		// @048: aload_0
		// @049: dup
		// @04A: getfield int game.C_100038_wa.field_104066_f
		// @04D: aload_0
		// @04E: getfield int game.C_100038_wa.field_104066_f
		// @051: ldc 1063880400 (0x3f6986d0)
		// @053: iushr
		// @054: ixor
		// @055: putfield int game.C_100038_wa.field_104066_f
		// @058: goto @09C
		// @05B: athrow
		// @05C: aload_0
		// @05D: dup
		// @05E: getfield int game.C_100038_wa.field_104066_f
		// @061: aload_0
		// @062: getfield int game.C_100038_wa.field_104066_f
		// @065: ldc -68784862 (0xfbe66d22)
		// @067: ishl
		// @068: ixor
		// @069: putfield int game.C_100038_wa.field_104066_f
		// @06C: goto @09C
		// @06F: iconst_1
		// @070: iload_2
		// @071: iand
		// @072: iconst_m1
		// @073: ixor
		// @074: iconst_m1
		// @075: if_icmpne @08C
		// @078: aload_0
		// @079: dup
		// @07A: getfield int game.C_100038_wa.field_104066_f
		// @07D: aload_0
		// @07E: getfield int game.C_100038_wa.field_104066_f
		// @081: ldc -340096307 (0xebba8acd)
		// @083: ishl
		// @084: ixor
		// @085: putfield int game.C_100038_wa.field_104066_f
		// @088: goto @09C
		// @08B: athrow
		// @08C: aload_0
		// @08D: dup
		// @08E: getfield int game.C_100038_wa.field_104066_f
		// @091: aload_0
		// @092: getfield int game.C_100038_wa.field_104066_f
		// @095: ldc 925215558 (0x3725ab46)
		// @097: iushr
		// @098: ixor
		// @099: putfield int game.C_100038_wa.field_104066_f
		// @09C: aload_0
		// @09D: dup
		// @09E: getfield int game.C_100038_wa.field_104066_f
		// @0A1: aload_0
		// @0A2: getfield int[] game.C_100038_wa.field_104080_i
		// @0A5: sipush 255 (0x00FF)
		// @0A8: sipush 128 (0x0080)
		// @0AB: iload_2
		// @0AC: iadd
		// @0AD: iand
		// @0AE: iaload
		// @0AF: iadd
		// @0B0: putfield int game.C_100038_wa.field_104066_f
		// @0B3: aload_0
		// @0B4: getfield int[] game.C_100038_wa.field_104080_i
		// @0B7: iload_2
		// @0B8: aload_0
		// @0B9: getfield int game.C_100038_wa.field_104078_k
		// @0BC: aload_0
		// @0BD: getfield int game.C_100038_wa.field_104066_f
		// @0C0: aload_0
		// @0C1: getfield int[] game.C_100038_wa.field_104080_i
		// @0C4: sipush 1020 (0x03FC)
		// @0C7: iload_3
		// @0C8: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @0CB: ldc 1825561058 (0x6ccfd9e2)
		// @0CD: ishr
		// @0CE: iaload
		// @0CF: iadd
		// @0D0: iadd
		// @0D1: dup
		// @0D2: istore #4
		// @0D4: iastore
		// @0D5: aload_0
		// @0D6: getfield int[] game.C_100038_wa.field_104079_h
		// @0D9: iload_2
		// @0DA: aload_0
		// @0DB: aload_0
		// @0DC: getfield int[] game.C_100038_wa.field_104080_i
		// @0DF: sipush 255 (0x00FF)
		// @0E2: iload #4
		// @0E4: ldc -834619288 (0xce40b868)
		// @0E6: ishr
		// @0E7: ldc -2094760702 (0x83247d02)
		// @0E9: ishr
		// @0EA: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @0ED: iaload
		// @0EE: iload_3
		// @0EF: ineg
		// @0F0: isub
		// @0F1: dup_x1
		// @0F2: putfield int game.C_100038_wa.field_104078_k
		// @0F5: iastore
		// @0F6: iinc #2 +1
		// @0F9: goto @026
		// @0FC: goto @120
		// @0FF: astore_2
		// @100: aload_2
		// @101: new java.lang.StringBuilder
		// @104: dup
		// @105: invokespecial java.lang.StringBuilder.<init>()void
		// @108: getstatic java.lang.String[] game.C_100038_wa.field_104081_z
		// @10B: iconst_5
		// @10C: aaload
		// @10D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @110: iload_1
		// @111: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @114: bipush 41 (0x29)
		// @116: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @119: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @11C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @11F: athrow
		// @120: return
	}
	
	final int func_104061_a(int arg0)
	{
		// @00: iload_1
		// @01: sipush 256 (0x0100)
		// @04: if_icmpeq @13
		// @07: aload_0
		// @08: aconst_null
		// @09: checkcast int[]
		// @0C: putfield int[] game.C_100038_wa.field_104079_h
		// @0F: goto @13
		// @12: athrow
		// @13: iconst_0
		// @14: aload_0
		// @15: getfield int game.C_100038_wa.field_104071_c
		// @18: if_icmpeq @1F
		// @1B: goto @2B
		// @1E: athrow
		// @1F: aload_0
		// @20: iconst_1
		// @21: invokespecial game.C_100038_wa.func_104060_a(boolean)void
		// @24: aload_0
		// @25: sipush 256 (0x0100)
		// @28: putfield int game.C_100038_wa.field_104071_c
		// @2B: aload_0
		// @2C: getfield int[] game.C_100038_wa.field_104079_h
		// @2F: aload_0
		// @30: dup
		// @31: getfield int game.C_100038_wa.field_104071_c
		// @34: iconst_1
		// @35: isub
		// @36: dup_x1
		// @37: putfield int game.C_100038_wa.field_104071_c
		// @3A: iaload
		// @3B: ireturn
		// @3C: astore_2
		// @3D: aload_2
		// @3E: new java.lang.StringBuilder
		// @41: dup
		// @42: invokespecial java.lang.StringBuilder.<init>()void
		// @45: getstatic java.lang.String[] game.C_100038_wa.field_104081_z
		// @48: iconst_3
		// @49: aaload
		// @4A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4D: iload_1
		// @4E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @51: bipush 41 (0x29)
		// @53: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @56: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @59: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @5C: athrow
	}
	
	static final void func_104055_a(byte arg0, boolean arg1)
	{
		// @00: getstatic game.C_100043_vl game.C_100343_jf.field_104825_l
		// @03: ifnull @2C
		// @06: getstatic int game.C_100196_rb.field_105827_i
		// @09: getstatic int game.C_100196_rb.field_105816_f
		// @0C: getstatic int game.C_100196_rb.field_105827_i
		// @0F: ineg
		// @10: getstatic int game.C_100196_rb.field_105820_b
		// @13: iadd
		// @14: getstatic int game.C_100196_rb.field_105816_f
		// @17: ineg
		// @18: getstatic int game.C_100196_rb.field_105823_l
		// @1B: iadd
		// @1C: invokestatic game.C_100196_rb.func_105809_f(int, int, int, int)void
		// @1F: getstatic game.C_100043_vl game.C_100343_jf.field_104825_l
		// @22: bipush -128 (0x80)
		// @24: iload_1
		// @25: invokevirtual game.C_100043_vl.func_101809_a(byte, boolean)void
		// @28: goto @2C
		// @2B: athrow
		// @2C: iload_0
		// @2D: bipush -75 (0xB5)
		// @2F: if_icmplt @3D
		// @32: aconst_null
		// @33: checkcast java.lang.String
		// @36: putstatic java.lang.String game.C_100038_wa.field_104067_g
		// @39: goto @3D
		// @3C: athrow
		// @3D: goto @6A
		// @40: astore_2
		// @41: aload_2
		// @42: new java.lang.StringBuilder
		// @45: dup
		// @46: invokespecial java.lang.StringBuilder.<init>()void
		// @49: getstatic java.lang.String[] game.C_100038_wa.field_104081_z
		// @4C: iconst_2
		// @4D: aaload
		// @4E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @51: iload_0
		// @52: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @55: bipush 44 (0x2C)
		// @57: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5A: iload_1
		// @5B: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @5E: bipush 41 (0x29)
		// @60: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @63: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @66: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @69: athrow
		// @6A: return
	}
	
	final int func_104063_a(byte arg0, int arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #5
		// @05: iload_2
		// @06: ifgt @12
		// @09: new java.lang.IllegalArgumentException
		// @0C: dup
		// @0D: invokespecial java.lang.IllegalArgumentException.<init>()void
		// @10: athrow
		// @11: athrow
		// @12: iload_1
		// @13: bipush -4 (0xFC)
		// @15: if_icmpeq @24
		// @18: aload_0
		// @19: aconst_null
		// @1A: checkcast int[]
		// @1D: putfield int[] game.C_100038_wa.field_104080_i
		// @20: goto @24
		// @23: athrow
		// @24: ldc 2147483647 (0x7fffffff)
		// @26: ldc2_w 4294967296
		// @29: iload_2
		// @2A: i2l
		// @2B: lrem
		// @2C: l2i
		// @2D: ineg
		// @2E: iadd
		// @2F: istore_3
		// @30: aload_0
		// @31: sipush 256 (0x0100)
		// @34: invokevirtual game.C_100038_wa.func_104061_a(int)int
		// @37: istore #4
		// @39: iload_3
		// @3A: iconst_m1
		// @3B: ixor
		// @3C: iload #4
		// @3E: iconst_m1
		// @3F: ixor
		// @40: if_icmpgt @30
		// @43: iload #5
		// @45: ifne @39
		// @48: goto @4B
		// @4B: iload #4
		// @4D: iload_1
		// @4E: bipush 125 (0x7D)
		// @50: iadd
		// @51: iload_2
		// @52: invokestatic game.C_100019_wl.func_103826_a(int, int, int)int
		// @55: ireturn
		// @56: astore_3
		// @57: aload_3
		// @58: new java.lang.StringBuilder
		// @5B: dup
		// @5C: invokespecial java.lang.StringBuilder.<init>()void
		// @5F: getstatic java.lang.String[] game.C_100038_wa.field_104081_z
		// @62: iconst_1
		// @63: aaload
		// @64: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @67: iload_1
		// @68: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6B: bipush 44 (0x2C)
		// @6D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @70: iload_2
		// @71: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @74: bipush 41 (0x29)
		// @76: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @79: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @7C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @7F: athrow
	}
	
	private final void func_104062_c(byte arg0)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #11
		// @005: ldc -1640531527 (0x9e3779b9)
		// @007: istore #9
		// @009: ldc -1640531527 (0x9e3779b9)
		// @00B: istore #5
		// @00D: iload_1
		// @00E: bipush 101 (0x65)
		// @010: if_icmpeq @01C
		// @013: bipush -15 (0xF1)
		// @015: putstatic int game.C_100038_wa.field_104075_l
		// @018: goto @01C
		// @01B: athrow
		// @01C: ldc -1640531527 (0x9e3779b9)
		// @01E: istore #8
		// @020: ldc -1640531527 (0x9e3779b9)
		// @022: istore_3
		// @023: ldc -1640531527 (0x9e3779b9)
		// @025: istore #6
		// @027: ldc -1640531527 (0x9e3779b9)
		// @029: istore #10
		// @02B: ldc -1640531527 (0x9e3779b9)
		// @02D: istore #4
		// @02F: ldc -1640531527 (0x9e3779b9)
		// @031: istore #7
		// @033: iconst_0
		// @034: istore_2
		// @035: iconst_4
		// @036: iload_2
		// @037: if_icmple @102
		// @03A: iload_3
		// @03B: iload #4
		// @03D: ldc -586894581 (0xdd04b30b)
		// @03F: ishl
		// @040: ixor
		// @041: istore_3
		// @042: iload #6
		// @044: iload_3
		// @045: iadd
		// @046: istore #6
		// @048: iload #4
		// @04A: iload #5
		// @04C: iadd
		// @04D: istore #4
		// @04F: iload #4
		// @051: iload #5
		// @053: ldc -762873470 (0xd2877982)
		// @055: iushr
		// @056: ixor
		// @057: istore #4
		// @059: iload #5
		// @05B: iload #6
		// @05D: iadd
		// @05E: istore #5
		// @060: iload #7
		// @062: iload #4
		// @064: iadd
		// @065: istore #7
		// @067: iload #5
		// @069: iload #6
		// @06B: ldc 559829512 (0x215e5208)
		// @06D: ishl
		// @06E: ixor
		// @06F: istore #5
		// @071: iload #6
		// @073: iload #7
		// @075: iadd
		// @076: istore #6
		// @078: iload #8
		// @07A: iload #5
		// @07C: iadd
		// @07D: istore #8
		// @07F: iload #6
		// @081: iload #7
		// @083: ldc -335418672 (0xec01ead0)
		// @085: iushr
		// @086: ixor
		// @087: istore #6
		// @089: iload #7
		// @08B: iload #8
		// @08D: iadd
		// @08E: istore #7
		// @090: iload #9
		// @092: iload #6
		// @094: iadd
		// @095: istore #9
		// @097: iload #7
		// @099: iload #8
		// @09B: ldc -29426134 (0xfe3efe2a)
		// @09D: ishl
		// @09E: ixor
		// @09F: istore #7
		// @0A1: iload #10
		// @0A3: iload #7
		// @0A5: iadd
		// @0A6: istore #10
		// @0A8: iload #8
		// @0AA: iload #9
		// @0AC: iadd
		// @0AD: istore #8
		// @0AF: iload #8
		// @0B1: iload #9
		// @0B3: ldc -1645758204 (0x9de7b904)
		// @0B5: iushr
		// @0B6: ixor
		// @0B7: istore #8
		// @0B9: iload_3
		// @0BA: iload #8
		// @0BC: iadd
		// @0BD: istore_3
		// @0BE: iload #9
		// @0C0: iload #10
		// @0C2: iadd
		// @0C3: istore #9
		// @0C5: iload #9
		// @0C7: iload #10
		// @0C9: ldc -1614002744 (0x9fcc45c8)
		// @0CB: ishl
		// @0CC: ixor
		// @0CD: istore #9
		// @0CF: iload #4
		// @0D1: iload #9
		// @0D3: iadd
		// @0D4: istore #4
		// @0D6: iload #10
		// @0D8: iload_3
		// @0D9: iadd
		// @0DA: istore #10
		// @0DC: iload #10
		// @0DE: iload_3
		// @0DF: ldc -879967223 (0xcb8cc409)
		// @0E1: iushr
		// @0E2: ixor
		// @0E3: istore #10
		// @0E5: iload #5
		// @0E7: iload #10
		// @0E9: iadd
		// @0EA: istore #5
		// @0EC: iload_3
		// @0ED: iload #4
		// @0EF: iadd
		// @0F0: istore_3
		// @0F1: iinc #2 +1
		// @0F4: iload #11
		// @0F6: ifne @104
		// @0F9: iload #11
		// @0FB: ifeq @035
		// @0FE: goto @102
		// @101: athrow
		// @102: iconst_0
		// @103: istore_2
		// @104: sipush -257 (0xFEFF)
		// @107: iload_2
		// @108: iconst_m1
		// @109: ixor
		// @10A: if_icmpge @28C
		// @10D: iload #6
		// @10F: aload_0
		// @110: getfield int[] game.C_100038_wa.field_104079_h
		// @113: iload_2
		// @114: iconst_3
		// @115: iadd
		// @116: iaload
		// @117: iadd
		// @118: istore #6
		// @11A: iload #8
		// @11C: aload_0
		// @11D: getfield int[] game.C_100038_wa.field_104079_h
		// @120: iload_2
		// @121: iconst_5
		// @122: iadd
		// @123: iaload
		// @124: iadd
		// @125: istore #8
		// @127: iload #9
		// @129: aload_0
		// @12A: getfield int[] game.C_100038_wa.field_104079_h
		// @12D: iload_2
		// @12E: bipush -6 (0xFA)
		// @130: isub
		// @131: iaload
		// @132: iadd
		// @133: istore #9
		// @135: iload #4
		// @137: aload_0
		// @138: getfield int[] game.C_100038_wa.field_104079_h
		// @13B: iload_2
		// @13C: iconst_1
		// @13D: iadd
		// @13E: iaload
		// @13F: iadd
		// @140: istore #4
		// @142: iload #7
		// @144: aload_0
		// @145: getfield int[] game.C_100038_wa.field_104079_h
		// @148: iload_2
		// @149: iconst_4
		// @14A: iadd
		// @14B: iaload
		// @14C: iadd
		// @14D: istore #7
		// @14F: iload_3
		// @150: aload_0
		// @151: getfield int[] game.C_100038_wa.field_104079_h
		// @154: iload_2
		// @155: iaload
		// @156: iadd
		// @157: istore_3
		// @158: iload #5
		// @15A: aload_0
		// @15B: getfield int[] game.C_100038_wa.field_104079_h
		// @15E: iload_2
		// @15F: bipush -2 (0xFE)
		// @161: isub
		// @162: iaload
		// @163: iadd
		// @164: istore #5
		// @166: iload #10
		// @168: aload_0
		// @169: getfield int[] game.C_100038_wa.field_104079_h
		// @16C: iload_2
		// @16D: bipush 7 (0x07)
		// @16F: iadd
		// @170: iaload
		// @171: iadd
		// @172: istore #10
		// @174: iload_3
		// @175: iload #4
		// @177: ldc 736112011 (0x2be02d8b)
		// @179: ishl
		// @17A: ixor
		// @17B: istore_3
		// @17C: iload #6
		// @17E: iload_3
		// @17F: iadd
		// @180: istore #6
		// @182: iload #4
		// @184: iload #5
		// @186: iadd
		// @187: istore #4
		// @189: iload #4
		// @18B: iload #5
		// @18D: ldc 1550384290 (0x5c68fca2)
		// @18F: iushr
		// @190: ixor
		// @191: istore #4
		// @193: iload #5
		// @195: iload #6
		// @197: iadd
		// @198: istore #5
		// @19A: iload #7
		// @19C: iload #4
		// @19E: iadd
		// @19F: istore #7
		// @1A1: iload #5
		// @1A3: iload #6
		// @1A5: ldc 567553928 (0x21d42f88)
		// @1A7: ishl
		// @1A8: ixor
		// @1A9: istore #5
		// @1AB: iload #8
		// @1AD: iload #5
		// @1AF: iadd
		// @1B0: istore #8
		// @1B2: iload #6
		// @1B4: iload #7
		// @1B6: iadd
		// @1B7: istore #6
		// @1B9: iload #6
		// @1BB: iload #7
		// @1BD: ldc -494454064 (0xe2873ad0)
		// @1BF: iushr
		// @1C0: ixor
		// @1C1: istore #6
		// @1C3: iload #9
		// @1C5: iload #6
		// @1C7: iadd
		// @1C8: istore #9
		// @1CA: iload #7
		// @1CC: iload #8
		// @1CE: iadd
		// @1CF: istore #7
		// @1D1: iload #7
		// @1D3: iload #8
		// @1D5: ldc 1879175498 (0x7001f14a)
		// @1D7: ishl
		// @1D8: ixor
		// @1D9: istore #7
		// @1DB: iload #10
		// @1DD: iload #7
		// @1DF: iadd
		// @1E0: istore #10
		// @1E2: iload #8
		// @1E4: iload #9
		// @1E6: iadd
		// @1E7: istore #8
		// @1E9: iload #8
		// @1EB: iload #9
		// @1ED: ldc 1492398660 (0x58f43244)
		// @1EF: iushr
		// @1F0: ixor
		// @1F1: istore #8
		// @1F3: iload_3
		// @1F4: iload #8
		// @1F6: iadd
		// @1F7: istore_3
		// @1F8: iload #9
		// @1FA: iload #10
		// @1FC: iadd
		// @1FD: istore #9
		// @1FF: iload #9
		// @201: iload #10
		// @203: ldc 816335208 (0x30a84968)
		// @205: ishl
		// @206: ixor
		// @207: istore #9
		// @209: iload #4
		// @20B: iload #9
		// @20D: iadd
		// @20E: istore #4
		// @210: iload #10
		// @212: iload_3
		// @213: iadd
		// @214: istore #10
		// @216: iload #10
		// @218: iload_3
		// @219: ldc -642944791 (0xd9ad70e9)
		// @21B: iushr
		// @21C: ixor
		// @21D: istore #10
		// @21F: iload #5
		// @221: iload #10
		// @223: iadd
		// @224: istore #5
		// @226: iload_3
		// @227: iload #4
		// @229: iadd
		// @22A: istore_3
		// @22B: aload_0
		// @22C: getfield int[] game.C_100038_wa.field_104080_i
		// @22F: iload_2
		// @230: iload_3
		// @231: iastore
		// @232: aload_0
		// @233: getfield int[] game.C_100038_wa.field_104080_i
		// @236: iload_2
		// @237: iconst_1
		// @238: iadd
		// @239: iload #4
		// @23B: iastore
		// @23C: aload_0
		// @23D: getfield int[] game.C_100038_wa.field_104080_i
		// @240: iload_2
		// @241: bipush -2 (0xFE)
		// @243: isub
		// @244: iload #5
		// @246: iastore
		// @247: aload_0
		// @248: getfield int[] game.C_100038_wa.field_104080_i
		// @24B: iconst_3
		// @24C: iload_2
		// @24D: iadd
		// @24E: iload #6
		// @250: iastore
		// @251: aload_0
		// @252: getfield int[] game.C_100038_wa.field_104080_i
		// @255: iconst_4
		// @256: iload_2
		// @257: iadd
		// @258: iload #7
		// @25A: iastore
		// @25B: aload_0
		// @25C: getfield int[] game.C_100038_wa.field_104080_i
		// @25F: iload_2
		// @260: iconst_5
		// @261: iadd
		// @262: iload #8
		// @264: iastore
		// @265: aload_0
		// @266: getfield int[] game.C_100038_wa.field_104080_i
		// @269: iload_2
		// @26A: bipush -6 (0xFA)
		// @26C: isub
		// @26D: iload #9
		// @26F: iastore
		// @270: aload_0
		// @271: getfield int[] game.C_100038_wa.field_104080_i
		// @274: iload_2
		// @275: bipush -7 (0xF9)
		// @277: isub
		// @278: iload #10
		// @27A: iastore
		// @27B: iinc #2 +8
		// @27E: iload #11
		// @280: ifne @28E
		// @283: iload #11
		// @285: ifeq @104
		// @288: goto @28C
		// @28B: athrow
		// @28C: iconst_0
		// @28D: istore_2
		// @28E: sipush 256 (0x0100)
		// @291: iload_2
		// @292: if_icmple @416
		// @295: iload #7
		// @297: aload_0
		// @298: getfield int[] game.C_100038_wa.field_104080_i
		// @29B: iload_2
		// @29C: iconst_4
		// @29D: iadd
		// @29E: iaload
		// @29F: iadd
		// @2A0: istore #7
		// @2A2: iload #10
		// @2A4: aload_0
		// @2A5: getfield int[] game.C_100038_wa.field_104080_i
		// @2A8: iload_2
		// @2A9: bipush -7 (0xF9)
		// @2AB: isub
		// @2AC: iaload
		// @2AD: iadd
		// @2AE: istore #10
		// @2B0: iload #5
		// @2B2: aload_0
		// @2B3: getfield int[] game.C_100038_wa.field_104080_i
		// @2B6: iload_2
		// @2B7: bipush -2 (0xFE)
		// @2B9: isub
		// @2BA: iaload
		// @2BB: iadd
		// @2BC: istore #5
		// @2BE: iload #9
		// @2C0: aload_0
		// @2C1: getfield int[] game.C_100038_wa.field_104080_i
		// @2C4: iload_2
		// @2C5: bipush -6 (0xFA)
		// @2C7: isub
		// @2C8: iaload
		// @2C9: iadd
		// @2CA: istore #9
		// @2CC: iload #6
		// @2CE: aload_0
		// @2CF: getfield int[] game.C_100038_wa.field_104080_i
		// @2D2: iconst_3
		// @2D3: iload_2
		// @2D4: iadd
		// @2D5: iaload
		// @2D6: iadd
		// @2D7: istore #6
		// @2D9: iload_3
		// @2DA: aload_0
		// @2DB: getfield int[] game.C_100038_wa.field_104080_i
		// @2DE: iload_2
		// @2DF: iaload
		// @2E0: iadd
		// @2E1: istore_3
		// @2E2: iload #4
		// @2E4: aload_0
		// @2E5: getfield int[] game.C_100038_wa.field_104080_i
		// @2E8: iconst_1
		// @2E9: iload_2
		// @2EA: iadd
		// @2EB: iaload
		// @2EC: iadd
		// @2ED: istore #4
		// @2EF: iload #8
		// @2F1: aload_0
		// @2F2: getfield int[] game.C_100038_wa.field_104080_i
		// @2F5: iconst_5
		// @2F6: iload_2
		// @2F7: iadd
		// @2F8: iaload
		// @2F9: iadd
		// @2FA: istore #8
		// @2FC: iload_3
		// @2FD: iload #4
		// @2FF: ldc -1839861493 (0x9255f10b)
		// @301: ishl
		// @302: ixor
		// @303: istore_3
		// @304: iload #4
		// @306: iload #5
		// @308: iadd
		// @309: istore #4
		// @30B: iload #6
		// @30D: iload_3
		// @30E: iadd
		// @30F: istore #6
		// @311: iload #4
		// @313: iload #5
		// @315: ldc 1888889122 (0x70962922)
		// @317: iushr
		// @318: ixor
		// @319: istore #4
		// @31B: iload #7
		// @31D: iload #4
		// @31F: iadd
		// @320: istore #7
		// @322: iload #5
		// @324: iload #6
		// @326: iadd
		// @327: istore #5
		// @329: iload #5
		// @32B: iload #6
		// @32D: ldc -1002772088 (0xc43ae988)
		// @32F: ishl
		// @330: ixor
		// @331: istore #5
		// @333: iload #6
		// @335: iload #7
		// @337: iadd
		// @338: istore #6
		// @33A: iload #8
		// @33C: iload #5
		// @33E: iadd
		// @33F: istore #8
		// @341: iload #6
		// @343: iload #7
		// @345: ldc -992376624 (0xc4d988d0)
		// @347: iushr
		// @348: ixor
		// @349: istore #6
		// @34B: iload #9
		// @34D: iload #6
		// @34F: iadd
		// @350: istore #9
		// @352: iload #7
		// @354: iload #8
		// @356: iadd
		// @357: istore #7
		// @359: iload #7
		// @35B: iload #8
		// @35D: ldc 1808624042 (0x6bcd69aa)
		// @35F: ishl
		// @360: ixor
		// @361: istore #7
		// @363: iload #10
		// @365: iload #7
		// @367: iadd
		// @368: istore #10
		// @36A: iload #8
		// @36C: iload #9
		// @36E: iadd
		// @36F: istore #8
		// @371: iload #8
		// @373: iload #9
		// @375: ldc 819835780 (0x30ddb384)
		// @377: iushr
		// @378: ixor
		// @379: istore #8
		// @37B: iload_3
		// @37C: iload #8
		// @37E: iadd
		// @37F: istore_3
		// @380: iload #9
		// @382: iload #10
		// @384: iadd
		// @385: istore #9
		// @387: iload #9
		// @389: iload #10
		// @38B: ldc 460685992 (0x1b7582a8)
		// @38D: ishl
		// @38E: ixor
		// @38F: istore #9
		// @391: iload #4
		// @393: iload #9
		// @395: iadd
		// @396: istore #4
		// @398: iload #10
		// @39A: iload_3
		// @39B: iadd
		// @39C: istore #10
		// @39E: iload #10
		// @3A0: iload_3
		// @3A1: ldc -48168823 (0xfd210089)
		// @3A3: iushr
		// @3A4: ixor
		// @3A5: istore #10
		// @3A7: iload #5
		// @3A9: iload #10
		// @3AB: iadd
		// @3AC: istore #5
		// @3AE: iload_3
		// @3AF: iload #4
		// @3B1: iadd
		// @3B2: istore_3
		// @3B3: aload_0
		// @3B4: getfield int[] game.C_100038_wa.field_104080_i
		// @3B7: iload_2
		// @3B8: iload_3
		// @3B9: iastore
		// @3BA: aload_0
		// @3BB: getfield int[] game.C_100038_wa.field_104080_i
		// @3BE: iconst_1
		// @3BF: iload_2
		// @3C0: iadd
		// @3C1: iload #4
		// @3C3: iastore
		// @3C4: aload_0
		// @3C5: getfield int[] game.C_100038_wa.field_104080_i
		// @3C8: iload_2
		// @3C9: bipush -2 (0xFE)
		// @3CB: isub
		// @3CC: iload #5
		// @3CE: iastore
		// @3CF: aload_0
		// @3D0: getfield int[] game.C_100038_wa.field_104080_i
		// @3D3: iload_2
		// @3D4: bipush -3 (0xFD)
		// @3D6: isub
		// @3D7: iload #6
		// @3D9: iastore
		// @3DA: aload_0
		// @3DB: getfield int[] game.C_100038_wa.field_104080_i
		// @3DE: iload_2
		// @3DF: iconst_4
		// @3E0: iadd
		// @3E1: iload #7
		// @3E3: iastore
		// @3E4: aload_0
		// @3E5: getfield int[] game.C_100038_wa.field_104080_i
		// @3E8: iload_2
		// @3E9: bipush -5 (0xFB)
		// @3EB: isub
		// @3EC: iload #8
		// @3EE: iastore
		// @3EF: aload_0
		// @3F0: getfield int[] game.C_100038_wa.field_104080_i
		// @3F3: iload_2
		// @3F4: bipush -6 (0xFA)
		// @3F6: isub
		// @3F7: iload #9
		// @3F9: iastore
		// @3FA: aload_0
		// @3FB: getfield int[] game.C_100038_wa.field_104080_i
		// @3FE: iload_2
		// @3FF: bipush -7 (0xF9)
		// @401: isub
		// @402: iload #10
		// @404: iastore
		// @405: iinc #2 +8
		// @408: iload #11
		// @40A: ifne @422
		// @40D: iload #11
		// @40F: ifeq @28E
		// @412: goto @416
		// @415: athrow
		// @416: aload_0
		// @417: iconst_1
		// @418: invokespecial game.C_100038_wa.func_104060_a(boolean)void
		// @41B: aload_0
		// @41C: sipush 256 (0x0100)
		// @41F: putfield int game.C_100038_wa.field_104071_c
		// @422: goto @447
		// @425: astore_2
		// @426: aload_2
		// @427: new java.lang.StringBuilder
		// @42A: dup
		// @42B: invokespecial java.lang.StringBuilder.<init>()void
		// @42E: getstatic java.lang.String[] game.C_100038_wa.field_104081_z
		// @431: bipush 10 (0x0A)
		// @433: aaload
		// @434: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @437: iload_1
		// @438: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @43B: bipush 41 (0x29)
		// @43D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @440: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @443: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @446: athrow
		// @447: return
	}
	
	static final C_100096_un func_104065_b(byte arg0)
	{
		// @00: bipush -11 (0xF5)
		// @02: iload_0
		// @03: bipush 39 (0x27)
		// @05: isub
		// @06: bipush 54 (0x36)
		// @08: idiv
		// @09: idiv
		// @0A: istore_1
		// @0B: getstatic game.C_100068_vc game.C_100222_aa.field_106086_a
		// @0E: getstatic game.C_100068_vc game.C_100220_ac.field_106056_e
		// @11: if_acmpeq @18
		// @14: goto @20
		// @17: athrow
		// @18: new java.lang.IllegalStateException
		// @1B: dup
		// @1C: invokespecial java.lang.IllegalStateException.<init>()void
		// @1F: athrow
		// @20: getstatic game.C_100068_vc game.C_100213_ak.field_105993_g
		// @23: getstatic game.C_100068_vc game.C_100222_aa.field_106086_a
		// @26: if_acmpeq @2D
		// @29: goto @37
		// @2C: athrow
		// @2D: getstatic game.C_100068_vc game.C_100220_ac.field_106056_e
		// @30: putstatic game.C_100068_vc game.C_100222_aa.field_106086_a
		// @33: getstatic game.C_100096_un game.C_100236_on.field_100900_k
		// @36: areturn
		// @37: aconst_null
		// @38: areturn
		// @39: astore_1
		// @3A: aload_1
		// @3B: new java.lang.StringBuilder
		// @3E: dup
		// @3F: invokespecial java.lang.StringBuilder.<init>()void
		// @42: getstatic java.lang.String[] game.C_100038_wa.field_104081_z
		// @45: bipush 11 (0x0B)
		// @47: aaload
		// @48: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4B: iload_0
		// @4C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4F: bipush 41 (0x29)
		// @51: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @54: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @57: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @5A: athrow
	}
	
	static final void func_104064_a(int arg0, int arg1)
	{
		// @00: iload_0
		// @01: ifeq @0E
		// @04: bipush 71 (0x47)
		// @06: invokestatic game.C_100038_wa.func_104065_b(byte)game.C_100096_un
		// @09: pop
		// @0A: goto @0E
		// @0D: athrow
		// @0E: sipush -18874 (0xB646)
		// @11: invokestatic game.C_100283_ni.func_106752_a(int)int
		// @14: pop
		// @15: goto @42
		// @18: astore_2
		// @19: aload_2
		// @1A: new java.lang.StringBuilder
		// @1D: dup
		// @1E: invokespecial java.lang.StringBuilder.<init>()void
		// @21: getstatic java.lang.String[] game.C_100038_wa.field_104081_z
		// @24: iconst_4
		// @25: aaload
		// @26: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @29: iload_0
		// @2A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2D: bipush 44 (0x2C)
		// @2F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @32: iload_1
		// @33: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @36: bipush 41 (0x29)
		// @38: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @41: athrow
		// @42: return
	}
	
	C_100038_wa(int[] arg0)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore_3
		// @04: aload_0
		// @05: invokespecial java.lang.Object.<init>()void
		// @08: aload_0
		// @09: sipush 256 (0x0100)
		// @0C: newarray int[]
		// @0E: putfield int[] game.C_100038_wa.field_104080_i
		// @11: aload_0
		// @12: sipush 256 (0x0100)
		// @15: newarray int[]
		// @17: putfield int[] game.C_100038_wa.field_104079_h
		// @1A: iconst_0
		// @1B: istore_2
		// @1C: iload_2
		// @1D: iconst_m1
		// @1E: ixor
		// @1F: aload_1
		// @20: arraylength
		// @21: iconst_m1
		// @22: ixor
		// @23: if_icmple @3E
		// @26: aload_0
		// @27: getfield int[] game.C_100038_wa.field_104079_h
		// @2A: iload_2
		// @2B: aload_1
		// @2C: iload_2
		// @2D: iaload
		// @2E: iastore
		// @2F: iinc #2 +1
		// @32: iload_3
		// @33: ifne @44
		// @36: iload_3
		// @37: ifeq @1C
		// @3A: goto @3E
		// @3D: athrow
		// @3E: aload_0
		// @3F: bipush 101 (0x65)
		// @41: invokespecial game.C_100038_wa.func_104062_c(byte)void
		// @44: goto @7C
		// @47: astore_2
		// @48: aload_2
		// @49: new java.lang.StringBuilder
		// @4C: dup
		// @4D: invokespecial java.lang.StringBuilder.<init>()void
		// @50: getstatic java.lang.String[] game.C_100038_wa.field_104081_z
		// @53: bipush 7 (0x07)
		// @55: aaload
		// @56: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @59: aload_1
		// @5A: ifnull @67
		// @5D: getstatic java.lang.String[] game.C_100038_wa.field_104081_z
		// @60: bipush 6 (0x06)
		// @62: aaload
		// @63: goto @6D
		// @66: athrow
		// @67: getstatic java.lang.String[] game.C_100038_wa.field_104081_z
		// @6A: bipush 8 (0x08)
		// @6C: aaload
		// @6D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @70: bipush 41 (0x29)
		// @72: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @75: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @78: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @7B: athrow
		// @7C: return
	}
	
	static
	{
		// @00: bipush 12 (0x0C)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "3X|\u0018G"
		// @09: invokestatic game.C_100038_wa.func_104059_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100038_wa.func_104057_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "3X|\u001cG"
		// @14: invokestatic game.C_100038_wa.func_104059_z(java.lang.String)char[]
		// @17: invokestatic game.C_100038_wa.func_104057_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "3X|\u001dG"
		// @1F: invokestatic game.C_100038_wa.func_104059_z(java.lang.String)char[]
		// @22: invokestatic game.C_100038_wa.func_104057_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "3X|\u001eG"
		// @2A: invokestatic game.C_100038_wa.func_104059_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100038_wa.func_104057_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "3X|\u001aG"
		// @35: invokestatic game.C_100038_wa.func_104059_z(java.lang.String)char[]
		// @38: invokestatic game.C_100038_wa.func_104057_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "3X|\u001fG"
		// @40: invokestatic game.C_100038_wa.func_104059_z(java.lang.String)char[]
		// @43: invokestatic game.C_100038_wa.func_104057_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "?\u0017|u\u0012"
		// @4C: invokestatic game.C_100038_wa.func_104059_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100038_wa.func_104057_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "3X|g\u0006*P&eG"
		// @58: invokestatic game.C_100038_wa.func_104059_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100038_wa.func_104057_z(char[])java.lang.String
		// @5E: aastore
		// @5F: dup
		// @60: bipush 8 (0x08)
		// @62: ldc "*L>7"
		// @64: invokestatic game.C_100038_wa.func_104059_z(java.lang.String)char[]
		// @67: invokestatic game.C_100038_wa.func_104057_z(char[])java.lang.String
		// @6A: aastore
		// @6B: dup
		// @6C: bipush 9 (0x09)
		// @6E: ldc "3X|\u0013G"
		// @70: invokestatic game.C_100038_wa.func_104059_z(java.lang.String)char[]
		// @73: invokestatic game.C_100038_wa.func_104057_z(char[])java.lang.String
		// @76: aastore
		// @77: dup
		// @78: bipush 10 (0x0A)
		// @7A: ldc "3X|\u0012G"
		// @7C: invokestatic game.C_100038_wa.func_104059_z(java.lang.String)char[]
		// @7F: invokestatic game.C_100038_wa.func_104057_z(char[])java.lang.String
		// @82: aastore
		// @83: dup
		// @84: bipush 11 (0x0B)
		// @86: ldc "3X|\u0019G"
		// @88: invokestatic game.C_100038_wa.func_104059_z(java.lang.String)char[]
		// @8B: invokestatic game.C_100038_wa.func_104057_z(char[])java.lang.String
		// @8E: aastore
		// @8F: putstatic java.lang.String[] game.C_100038_wa.field_104081_z
		// @92: ldc "\u0001t\u0002"
		// @94: invokestatic game.C_100038_wa.func_104059_z(java.lang.String)char[]
		// @97: invokestatic game.C_100038_wa.func_104057_z(char[])java.lang.String
		// @9A: putstatic java.lang.String game.C_100038_wa.field_104076_m
		// @9D: bipush 67 (0x43)
		// @9F: putstatic int game.C_100038_wa.field_104075_l
		// @A2: ldc "x\u001cbeO'X<5\u00000\u001984\u0006*\u0002r/\u0007!\u00195:\u0002!\u0019;(O\"L>7A"
		// @A4: invokestatic game.C_100038_wa.func_104059_z(java.lang.String)char[]
		// @A7: invokestatic game.C_100038_wa.func_104057_z(char[])java.lang.String
		// @AA: putstatic java.lang.String game.C_100038_wa.field_104067_g
		// @AD: return
	}
	
	private static char[] func_104059_z(String arg0)
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
		// @0E: bipush 111 (0x6F)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_104057_z(char[] arg0)
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
		// @30: bipush 68 (0x44)
		// @32: goto @46
		// @35: bipush 57 (0x39)
		// @37: goto @46
		// @3A: bipush 82 (0x52)
		// @3C: goto @46
		// @3F: bipush 91 (0x5B)
		// @41: goto @46
		// @44: bipush 111 (0x6F)
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
