package game;

final class C_100236_on extends C_100158_da
{
	static boolean field_100899_j;
	byte[] field_100904_t;
	byte[] field_100902_v;
	private int[] field_100896_o;
	static C_100096_un field_100900_k;
	int field_100895_n;
	static String field_100897_l;
	byte[] field_100903_u;
	C_100132_td[] field_100905_s;
	static String field_100898_m;
	C_100214_al[] field_100901_w;
	static long field_100908_p;
	short[] field_100907_q;
	static C_100302_ka field_100906_r;
	private static final String[] field_100909_z;
	
	final boolean func_100893_a(byte[] arg0, byte arg1, int[] arg2, C_100228_nn arg3)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #10
		// @005: iconst_1
		// @006: istore #5
		// @008: iload_2
		// @009: bipush 113 (0x71)
		// @00B: if_icmpeq @010
		// @00E: iconst_1
		// @00F: ireturn
		// @010: iconst_0
		// @011: istore #6
		// @013: aconst_null
		// @014: astore #7
		// @016: iconst_0
		// @017: istore #8
		// @019: sipush -129 (0xFF7F)
		// @01C: iload #8
		// @01E: iconst_m1
		// @01F: ixor
		// @020: if_icmpge @0B3
		// @023: aconst_null
		// @024: aload_1
		// @025: if_acmpeq @036
		// @028: iconst_m1
		// @029: aload_1
		// @02A: iload #8
		// @02C: baload
		// @02D: iconst_m1
		// @02E: ixor
		// @02F: if_icmpeq @0AB
		// @032: goto @036
		// @035: athrow
		// @036: aload_0
		// @037: getfield int[] game.C_100236_on.field_100896_o
		// @03A: iload #8
		// @03C: iaload
		// @03D: istore #9
		// @03F: iconst_m1
		// @040: iload #9
		// @042: iconst_m1
		// @043: ixor
		// @044: if_icmpeq @0AB
		// @047: iload #9
		// @049: iload #6
		// @04B: if_icmpne @056
		// @04E: goto @052
		// @051: athrow
		// @052: goto @091
		// @055: athrow
		// @056: iload #9
		// @058: istore #6
		// @05A: iinc #9 +255
		// @05D: iconst_1
		// @05E: iload #9
		// @060: iand
		// @061: ifeq @078
		// @064: aload #4
		// @066: aload_3
		// @067: bipush 31 (0x1F)
		// @069: iload #9
		// @06B: ldc -605235358 (0xdbecd762)
		// @06D: ishr
		// @06E: invokevirtual game.C_100228_nn.func_106181_a(int[], byte, int)game.C_100214_al
		// @071: astore #7
		// @073: iload #10
		// @075: ifeq @089
		// @078: aload #4
		// @07A: iload_2
		// @07B: bipush -112 (0x90)
		// @07D: iadd
		// @07E: iload #9
		// @080: ldc 20248418 (0x134f762)
		// @082: ishr
		// @083: aload_3
		// @084: invokevirtual game.C_100228_nn.func_106176_a(int, int, int[])game.C_100214_al
		// @087: astore #7
		// @089: aload #7
		// @08B: ifnonnull @091
		// @08E: iconst_0
		// @08F: istore #5
		// @091: aload #7
		// @093: ifnull @0AB
		// @096: aload_0
		// @097: getfield game.C_100214_al[] game.C_100236_on.field_100901_w
		// @09A: iload #8
		// @09C: aload #7
		// @09E: aastore
		// @09F: aload_0
		// @0A0: getfield int[] game.C_100236_on.field_100896_o
		// @0A3: iload #8
		// @0A5: iconst_0
		// @0A6: iastore
		// @0A7: goto @0AB
		// @0AA: athrow
		// @0AB: iinc #8 +1
		// @0AE: iload #10
		// @0B0: ifeq @019
		// @0B3: iload #5
		// @0B5: ireturn
		// @0B6: astore #5
		// @0B8: aload #5
		// @0BA: new java.lang.StringBuilder
		// @0BD: dup
		// @0BE: invokespecial java.lang.StringBuilder.<init>()void
		// @0C1: getstatic java.lang.String[] game.C_100236_on.field_100909_z
		// @0C4: iconst_2
		// @0C5: aaload
		// @0C6: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0C9: aload_1
		// @0CA: ifnull @0D6
		// @0CD: getstatic java.lang.String[] game.C_100236_on.field_100909_z
		// @0D0: iconst_3
		// @0D1: aaload
		// @0D2: goto @0DB
		// @0D5: athrow
		// @0D6: getstatic java.lang.String[] game.C_100236_on.field_100909_z
		// @0D9: iconst_1
		// @0DA: aaload
		// @0DB: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0DE: bipush 44 (0x2C)
		// @0E0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0E3: iload_2
		// @0E4: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0E7: bipush 44 (0x2C)
		// @0E9: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0EC: aload_3
		// @0ED: ifnull @0F9
		// @0F0: getstatic java.lang.String[] game.C_100236_on.field_100909_z
		// @0F3: iconst_3
		// @0F4: aaload
		// @0F5: goto @0FE
		// @0F8: athrow
		// @0F9: getstatic java.lang.String[] game.C_100236_on.field_100909_z
		// @0FC: iconst_1
		// @0FD: aaload
		// @0FE: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @101: bipush 44 (0x2C)
		// @103: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @106: aload #4
		// @108: ifnull @114
		// @10B: getstatic java.lang.String[] game.C_100236_on.field_100909_z
		// @10E: iconst_3
		// @10F: aaload
		// @110: goto @119
		// @113: athrow
		// @114: getstatic java.lang.String[] game.C_100236_on.field_100909_z
		// @117: iconst_1
		// @118: aaload
		// @119: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @11C: bipush 41 (0x29)
		// @11E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @121: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @124: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @127: athrow
	}
	
	final void func_100892_e(int arg0)
	{
		// @00: aload_0
		// @01: aconst_null
		// @02: putfield int[] game.C_100236_on.field_100896_o
		// @05: iload_1
		// @06: sipush -129 (0xFF7F)
		// @09: if_icmpeq @10
		// @0C: iconst_1
		// @0D: invokestatic game.C_100236_on.func_100891_a(boolean)void
		// @10: goto @34
		// @13: astore_2
		// @14: aload_2
		// @15: new java.lang.StringBuilder
		// @18: dup
		// @19: invokespecial java.lang.StringBuilder.<init>()void
		// @1C: getstatic java.lang.String[] game.C_100236_on.field_100909_z
		// @1F: iconst_4
		// @20: aaload
		// @21: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @24: iload_1
		// @25: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @28: bipush 41 (0x29)
		// @2A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @30: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @33: athrow
		// @34: return
	}
	
	static final boolean func_100888_a(int arg0, int arg1)
	{
		// @00: iload_1
		// @01: ifeq @06
		// @04: iconst_1
		// @05: ireturn
		// @06: bipush -11 (0xF5)
		// @08: iload_0
		// @09: iconst_m1
		// @0A: ixor
		// @0B: if_icmpeq @3E
		// @0E: iload_0
		// @0F: iconst_m1
		// @10: ixor
		// @11: bipush -7 (0xF9)
		// @13: if_icmpeq @3E
		// @16: goto @1A
		// @19: athrow
		// @1A: bipush -8 (0xF8)
		// @1C: iload_0
		// @1D: iconst_m1
		// @1E: ixor
		// @1F: if_icmpeq @3E
		// @22: goto @26
		// @25: athrow
		// @26: bipush -10 (0xF6)
		// @28: iload_0
		// @29: iconst_m1
		// @2A: ixor
		// @2B: if_icmpeq @3E
		// @2E: goto @32
		// @31: athrow
		// @32: bipush -9 (0xF7)
		// @34: iload_0
		// @35: iconst_m1
		// @36: ixor
		// @37: if_icmpne @43
		// @3A: goto @3E
		// @3D: athrow
		// @3E: iconst_1
		// @3F: goto @44
		// @42: athrow
		// @43: iconst_0
		// @44: ireturn
		// @45: astore_2
		// @46: aload_2
		// @47: new java.lang.StringBuilder
		// @4A: dup
		// @4B: invokespecial java.lang.StringBuilder.<init>()void
		// @4E: getstatic java.lang.String[] game.C_100236_on.field_100909_z
		// @51: bipush 7 (0x07)
		// @53: aaload
		// @54: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @57: iload_0
		// @58: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5B: bipush 44 (0x2C)
		// @5D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @60: iload_1
		// @61: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @64: bipush 41 (0x29)
		// @66: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @69: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @6C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @6F: athrow
	}
	
	static final void func_100894_a(boolean arg0, boolean arg1, byte arg2)
	{
		// @00: iload_2
		// @01: bipush -90 (0xA6)
		// @03: if_icmplt @12
		// @06: bipush 45 (0x2D)
		// @08: bipush -51 (0xCD)
		// @0A: invokestatic game.C_100236_on.func_100888_a(int, int)boolean
		// @0D: pop
		// @0E: goto @12
		// @11: athrow
		// @12: ldc -55331992 (0xfcb3b368)
		// @14: aconst_null
		// @15: iload_1
		// @16: iload_0
		// @17: invokestatic game.C_100091_m.func_104510_a(int, java.lang.String, boolean, boolean)void
		// @1A: goto @50
		// @1D: astore_3
		// @1E: aload_3
		// @1F: new java.lang.StringBuilder
		// @22: dup
		// @23: invokespecial java.lang.StringBuilder.<init>()void
		// @26: getstatic java.lang.String[] game.C_100236_on.field_100909_z
		// @29: iconst_0
		// @2A: aaload
		// @2B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2E: iload_0
		// @2F: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @32: bipush 44 (0x2C)
		// @34: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @37: iload_1
		// @38: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @3B: bipush 44 (0x2C)
		// @3D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @40: iload_2
		// @41: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @44: bipush 41 (0x29)
		// @46: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @49: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4F: athrow
		// @50: return
	}
	
	public static void func_100891_a(boolean arg0)
	{
		// @00: aconst_null
		// @01: putstatic game.C_100096_un game.C_100236_on.field_100900_k
		// @04: aconst_null
		// @05: putstatic game.C_100302_ka game.C_100236_on.field_100906_r
		// @08: aconst_null
		// @09: putstatic java.lang.String game.C_100236_on.field_100897_l
		// @0C: iload_0
		// @0D: ifeq @11
		// @10: return
		// @11: aconst_null
		// @12: putstatic java.lang.String game.C_100236_on.field_100898_m
		// @15: goto @3A
		// @18: astore_1
		// @19: aload_1
		// @1A: new java.lang.StringBuilder
		// @1D: dup
		// @1E: invokespecial java.lang.StringBuilder.<init>()void
		// @21: getstatic java.lang.String[] game.C_100236_on.field_100909_z
		// @24: bipush 6 (0x06)
		// @26: aaload
		// @27: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2A: iload_0
		// @2B: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @2E: bipush 41 (0x29)
		// @30: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @33: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @36: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @39: athrow
		// @3A: return
	}
	
	C_100236_on(byte[] arg0)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #36
		// @005: aload_0
		// @006: invokespecial game.C_100158_da.<init>()void
		// @009: aload_0
		// @00A: sipush 128 (0x0080)
		// @00D: newarray byte[]
		// @00F: putfield byte[] game.C_100236_on.field_100903_u
		// @012: aload_0
		// @013: sipush 128 (0x0080)
		// @016: newarray byte[]
		// @018: putfield byte[] game.C_100236_on.field_100904_t
		// @01B: aload_0
		// @01C: sipush 128 (0x0080)
		// @01F: newarray byte[]
		// @021: putfield byte[] game.C_100236_on.field_100902_v
		// @024: aload_0
		// @025: sipush 128 (0x0080)
		// @028: newarray short[]
		// @02A: putfield short[] game.C_100236_on.field_100907_q
		// @02D: aload_0
		// @02E: sipush 128 (0x0080)
		// @031: anewarray game.C_100132_td
		// @034: putfield game.C_100132_td[] game.C_100236_on.field_100905_s
		// @037: aload_0
		// @038: sipush 128 (0x0080)
		// @03B: anewarray game.C_100214_al
		// @03E: putfield game.C_100214_al[] game.C_100236_on.field_100901_w
		// @041: aload_0
		// @042: sipush 128 (0x0080)
		// @045: newarray int[]
		// @047: putfield int[] game.C_100236_on.field_100896_o
		// @04A: new game.C_100280_nf
		// @04D: dup
		// @04E: aload_1
		// @04F: invokespecial game.C_100280_nf.<init>(byte[])void
		// @052: astore_2
		// @053: iconst_0
		// @054: istore_3
		// @055: iconst_0
		// @056: aload_2
		// @057: getfield byte[] game.C_100280_nf.field_101179_l
		// @05A: aload_2
		// @05B: getfield int game.C_100280_nf.field_101177_n
		// @05E: iload_3
		// @05F: iadd
		// @060: baload
		// @061: if_icmpeq @06C
		// @064: iinc #3 +1
		// @067: iload #36
		// @069: ifeq @055
		// @06C: iload_3
		// @06D: newarray byte[]
		// @06F: astore #4
		// @071: iconst_0
		// @072: istore #5
		// @074: iload_3
		// @075: iconst_m1
		// @076: ixor
		// @077: iload #5
		// @079: iconst_m1
		// @07A: ixor
		// @07B: if_icmpge @09A
		// @07E: aload #4
		// @080: iload #5
		// @082: aload_2
		// @083: bipush -119 (0x89)
		// @085: invokevirtual game.C_100280_nf.func_101146_c(byte)byte
		// @088: bastore
		// @089: iinc #5 +1
		// @08C: iload #36
		// @08E: ifne @0B7
		// @091: iload #36
		// @093: ifeq @074
		// @096: goto @09A
		// @099: athrow
		// @09A: iinc #3 +1
		// @09D: aload_2
		// @09E: dup
		// @09F: getfield int game.C_100280_nf.field_101177_n
		// @0A2: iconst_1
		// @0A3: iadd
		// @0A4: putfield int game.C_100280_nf.field_101177_n
		// @0A7: aload_2
		// @0A8: getfield int game.C_100280_nf.field_101177_n
		// @0AB: istore #5
		// @0AD: aload_2
		// @0AE: dup
		// @0AF: getfield int game.C_100280_nf.field_101177_n
		// @0B2: iload_3
		// @0B3: iadd
		// @0B4: putfield int game.C_100280_nf.field_101177_n
		// @0B7: iconst_0
		// @0B8: istore #6
		// @0BA: iconst_m1
		// @0BB: aload_2
		// @0BC: getfield byte[] game.C_100280_nf.field_101179_l
		// @0BF: iload #6
		// @0C1: aload_2
		// @0C2: getfield int game.C_100280_nf.field_101177_n
		// @0C5: iadd
		// @0C6: baload
		// @0C7: iconst_m1
		// @0C8: ixor
		// @0C9: if_icmpeq @0D4
		// @0CC: iinc #6 +1
		// @0CF: iload #36
		// @0D1: ifeq @0BA
		// @0D4: iload #6
		// @0D6: newarray byte[]
		// @0D8: astore #7
		// @0DA: iconst_0
		// @0DB: istore #8
		// @0DD: iload #6
		// @0DF: iload #8
		// @0E1: if_icmple @100
		// @0E4: aload #7
		// @0E6: iload #8
		// @0E8: aload_2
		// @0E9: bipush -127 (0x81)
		// @0EB: invokevirtual game.C_100280_nf.func_101146_c(byte)byte
		// @0EE: bastore
		// @0EF: iinc #8 +1
		// @0F2: iload #36
		// @0F4: ifne @11E
		// @0F7: iload #36
		// @0F9: ifeq @0DD
		// @0FC: goto @100
		// @0FF: athrow
		// @100: iinc #6 +1
		// @103: aload_2
		// @104: dup
		// @105: getfield int game.C_100280_nf.field_101177_n
		// @108: iconst_1
		// @109: iadd
		// @10A: putfield int game.C_100280_nf.field_101177_n
		// @10D: aload_2
		// @10E: getfield int game.C_100280_nf.field_101177_n
		// @111: istore #8
		// @113: aload_2
		// @114: dup
		// @115: getfield int game.C_100280_nf.field_101177_n
		// @118: iload #6
		// @11A: iadd
		// @11B: putfield int game.C_100280_nf.field_101177_n
		// @11E: iconst_0
		// @11F: istore #9
		// @121: aload_2
		// @122: getfield byte[] game.C_100280_nf.field_101179_l
		// @125: iload #9
		// @127: aload_2
		// @128: getfield int game.C_100280_nf.field_101177_n
		// @12B: iadd
		// @12C: baload
		// @12D: ifeq @138
		// @130: iinc #9 +1
		// @133: iload #36
		// @135: ifeq @121
		// @138: iload #9
		// @13A: newarray byte[]
		// @13C: astore #10
		// @13E: iconst_0
		// @13F: istore #11
		// @141: iload #9
		// @143: iconst_m1
		// @144: ixor
		// @145: iload #11
		// @147: iconst_m1
		// @148: ixor
		// @149: if_icmpge @168
		// @14C: aload #10
		// @14E: iload #11
		// @150: aload_2
		// @151: bipush -124 (0x84)
		// @153: invokevirtual game.C_100280_nf.func_101146_c(byte)byte
		// @156: bastore
		// @157: iinc #11 +1
		// @15A: iload #36
		// @15C: ifne @175
		// @15F: iload #36
		// @161: ifeq @141
		// @164: goto @168
		// @167: athrow
		// @168: iinc #9 +1
		// @16B: aload_2
		// @16C: dup
		// @16D: getfield int game.C_100280_nf.field_101177_n
		// @170: iconst_1
		// @171: iadd
		// @172: putfield int game.C_100280_nf.field_101177_n
		// @175: iload #9
		// @177: newarray byte[]
		// @179: astore #11
		// @17B: bipush -2 (0xFE)
		// @17D: iload #9
		// @17F: iconst_m1
		// @180: ixor
		// @181: if_icmple @1F0
		// @184: aload #11
		// @186: iconst_1
		// @187: iconst_1
		// @188: bastore
		// @189: iconst_2
		// @18A: istore #12
		// @18C: iconst_1
		// @18D: istore #13
		// @18F: iconst_2
		// @190: istore #14
		// @192: iload #9
		// @194: iconst_m1
		// @195: ixor
		// @196: iload #14
		// @198: iconst_m1
		// @199: ixor
		// @19A: if_icmpge @1EB
		// @19D: aload_2
		// @19E: iconst_0
		// @19F: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @1A2: istore #15
		// @1A4: iconst_m1
		// @1A5: iload #36
		// @1A7: ifne @1F6
		// @1AA: iload #15
		// @1AC: iconst_m1
		// @1AD: ixor
		// @1AE: if_icmpne @1C1
		// @1B1: goto @1B5
		// @1B4: athrow
		// @1B5: iload #12
		// @1B7: iinc #12 +1
		// @1BA: istore #13
		// @1BC: iload #36
		// @1BE: ifeq @1DB
		// @1C1: iload #15
		// @1C3: iconst_m1
		// @1C4: ixor
		// @1C5: iload #13
		// @1C7: iconst_m1
		// @1C8: ixor
		// @1C9: if_icmpge @1D4
		// @1CC: goto @1D0
		// @1CF: athrow
		// @1D0: goto @1D7
		// @1D3: athrow
		// @1D4: iinc #15 +255
		// @1D7: iload #15
		// @1D9: istore #13
		// @1DB: aload #11
		// @1DD: iload #14
		// @1DF: iload #13
		// @1E1: i2b
		// @1E2: bastore
		// @1E3: iinc #14 +1
		// @1E6: iload #36
		// @1E8: ifeq @192
		// @1EB: iload #36
		// @1ED: ifeq @1F4
		// @1F0: iload #9
		// @1F2: istore #12
		// @1F4: iload #12
		// @1F6: anewarray game.C_100132_td
		// @1F9: astore #13
		// @1FB: iconst_0
		// @1FC: istore #14
		// @1FE: iload #14
		// @200: aload #13
		// @202: arraylength
		// @203: if_icmpge @269
		// @206: aload #13
		// @208: iload #14
		// @20A: new game.C_100132_td
		// @20D: dup
		// @20E: invokespecial game.C_100132_td.<init>()void
		// @211: dup_x2
		// @212: aastore
		// @213: astore #15
		// @215: aload_2
		// @216: iconst_0
		// @217: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @21A: istore #16
		// @21C: iconst_m1
		// @21D: iload #16
		// @21F: iconst_m1
		// @220: ixor
		// @221: iload #36
		// @223: ifne @275
		// @226: if_icmpgt @230
		// @229: goto @22D
		// @22C: athrow
		// @22D: goto @23B
		// @230: aload #15
		// @232: iload #16
		// @234: iconst_2
		// @235: imul
		// @236: newarray byte[]
		// @238: putfield byte[] game.C_100132_td.field_104981_j
		// @23B: aload_2
		// @23C: iconst_0
		// @23D: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @240: istore #16
		// @242: iload #16
		// @244: ifle @261
		// @247: aload #15
		// @249: iconst_2
		// @24A: iload #16
		// @24C: imul
		// @24D: iconst_2
		// @24E: iadd
		// @24F: newarray byte[]
		// @251: putfield byte[] game.C_100132_td.field_104985_q
		// @254: aload #15
		// @256: getfield byte[] game.C_100132_td.field_104985_q
		// @259: iconst_1
		// @25A: bipush 64 (0x40)
		// @25C: bastore
		// @25D: goto @261
		// @260: athrow
		// @261: iinc #14 +1
		// @264: iload #36
		// @266: ifeq @1FE
		// @269: aload_2
		// @26A: iconst_0
		// @26B: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @26E: istore #14
		// @270: iconst_m1
		// @271: iload #14
		// @273: iconst_m1
		// @274: ixor
		// @275: if_icmpgt @27D
		// @278: aconst_null
		// @279: goto @283
		// @27C: athrow
		// @27D: iconst_2
		// @27E: iload #14
		// @280: imul
		// @281: newarray byte[]
		// @283: astore #15
		// @285: aload_2
		// @286: iconst_0
		// @287: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @28A: istore #14
		// @28C: iload #14
		// @28E: ifle @29B
		// @291: iconst_2
		// @292: iload #14
		// @294: imul
		// @295: newarray byte[]
		// @297: goto @29C
		// @29A: athrow
		// @29B: aconst_null
		// @29C: astore #16
		// @29E: iconst_0
		// @29F: istore #17
		// @2A1: aload_2
		// @2A2: getfield byte[] game.C_100280_nf.field_101179_l
		// @2A5: aload_2
		// @2A6: getfield int game.C_100280_nf.field_101177_n
		// @2A9: iload #17
		// @2AB: iadd
		// @2AC: baload
		// @2AD: iconst_m1
		// @2AE: ixor
		// @2AF: iconst_m1
		// @2B0: if_icmpeq @2BB
		// @2B3: iinc #17 +1
		// @2B6: iload #36
		// @2B8: ifeq @2A1
		// @2BB: iload #17
		// @2BD: newarray byte[]
		// @2BF: astore #18
		// @2C1: iconst_0
		// @2C2: istore #19
		// @2C4: iload #17
		// @2C6: iconst_m1
		// @2C7: ixor
		// @2C8: iload #19
		// @2CA: iconst_m1
		// @2CB: ixor
		// @2CC: if_icmpge @2EB
		// @2CF: aload #18
		// @2D1: iload #19
		// @2D3: aload_2
		// @2D4: bipush -111 (0x91)
		// @2D6: invokevirtual game.C_100280_nf.func_101146_c(byte)byte
		// @2D9: bastore
		// @2DA: iinc #19 +1
		// @2DD: iload #36
		// @2DF: ifne @2FB
		// @2E2: iload #36
		// @2E4: ifeq @2C4
		// @2E7: goto @2EB
		// @2EA: athrow
		// @2EB: iinc #17 +1
		// @2EE: aload_2
		// @2EF: dup
		// @2F0: getfield int game.C_100280_nf.field_101177_n
		// @2F3: iconst_1
		// @2F4: iadd
		// @2F5: putfield int game.C_100280_nf.field_101177_n
		// @2F8: iconst_0
		// @2F9: istore #19
		// @2FB: iconst_0
		// @2FC: istore #20
		// @2FE: sipush -129 (0xFF7F)
		// @301: iload #20
		// @303: iconst_m1
		// @304: ixor
		// @305: if_icmpge @32D
		// @308: iload #19
		// @30A: aload_2
		// @30B: iconst_0
		// @30C: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @30F: iadd
		// @310: istore #19
		// @312: aload_0
		// @313: getfield short[] game.C_100236_on.field_100907_q
		// @316: iload #20
		// @318: iload #19
		// @31A: i2s
		// @31B: sastore
		// @31C: iinc #20 +1
		// @31F: iload #36
		// @321: ifne @330
		// @324: iload #36
		// @326: ifeq @2FE
		// @329: goto @32D
		// @32C: athrow
		// @32D: iconst_0
		// @32E: istore #19
		// @330: iconst_0
		// @331: istore #20
		// @333: sipush -129 (0xFF7F)
		// @336: iload #20
		// @338: iconst_m1
		// @339: ixor
		// @33A: if_icmpge @368
		// @33D: iload #19
		// @33F: aload_2
		// @340: iconst_0
		// @341: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @344: iadd
		// @345: istore #19
		// @347: aload_0
		// @348: getfield short[] game.C_100236_on.field_100907_q
		// @34B: iload #20
		// @34D: dup2
		// @34E: saload
		// @34F: iload #19
		// @351: ldc 864224616 (0x33830568)
		// @353: ishl
		// @354: iadd
		// @355: i2s
		// @356: sastore
		// @357: iinc #20 +1
		// @35A: iload #36
		// @35C: ifne @36B
		// @35F: iload #36
		// @361: ifeq @333
		// @364: goto @368
		// @367: athrow
		// @368: iconst_0
		// @369: istore #20
		// @36B: iconst_0
		// @36C: istore #21
		// @36E: iconst_0
		// @36F: istore #22
		// @371: iconst_0
		// @372: istore #23
		// @374: iload #23
		// @376: iconst_m1
		// @377: ixor
		// @378: sipush -129 (0xFF7F)
		// @37B: if_icmple @3E1
		// @37E: iconst_0
		// @37F: iload #36
		// @381: ifne @3EB
		// @384: iload #20
		// @386: if_icmpne @3B7
		// @389: goto @38D
		// @38C: athrow
		// @38D: iload #21
		// @38F: iconst_m1
		// @390: ixor
		// @391: aload #18
		// @393: arraylength
		// @394: iconst_m1
		// @395: ixor
		// @396: if_icmple @3AC
		// @399: goto @39D
		// @39C: athrow
		// @39D: aload #18
		// @39F: iload #21
		// @3A1: iinc #21 +1
		// @3A4: baload
		// @3A5: istore #20
		// @3A7: iload #36
		// @3A9: ifeq @3AF
		// @3AC: iconst_m1
		// @3AD: istore #20
		// @3AF: aload_2
		// @3B0: bipush 42 (0x2A)
		// @3B2: invokevirtual game.C_100280_nf.func_101158_h(int)int
		// @3B5: istore #22
		// @3B7: aload_0
		// @3B8: getfield short[] game.C_100236_on.field_100907_q
		// @3BB: iload #23
		// @3BD: dup2
		// @3BE: saload
		// @3BF: iconst_2
		// @3C0: iload #22
		// @3C2: iconst_1
		// @3C3: isub
		// @3C4: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @3C7: ldc -455036498 (0xe4e0b1ae)
		// @3C9: ishl
		// @3CA: iadd
		// @3CB: i2s
		// @3CC: sastore
		// @3CD: aload_0
		// @3CE: getfield int[] game.C_100236_on.field_100896_o
		// @3D1: iload #23
		// @3D3: iload #22
		// @3D5: iastore
		// @3D6: iinc #20 +255
		// @3D9: iinc #23 +1
		// @3DC: iload #36
		// @3DE: ifeq @374
		// @3E1: iconst_0
		// @3E2: istore #21
		// @3E4: iconst_0
		// @3E5: istore #20
		// @3E7: iconst_0
		// @3E8: istore #23
		// @3EA: iconst_0
		// @3EB: istore #24
		// @3ED: iload #24
		// @3EF: iconst_m1
		// @3F0: ixor
		// @3F1: sipush -129 (0xFF7F)
		// @3F4: if_icmple @463
		// @3F7: aload_0
		// @3F8: getfield int[] game.C_100236_on.field_100896_o
		// @3FB: iload #24
		// @3FD: iaload
		// @3FE: iconst_m1
		// @3FF: ixor
		// @400: iload #36
		// @402: ifne @46D
		// @405: iconst_m1
		// @406: if_icmpne @416
		// @409: goto @40D
		// @40C: athrow
		// @40D: iload #36
		// @40F: ifeq @45B
		// @412: goto @416
		// @415: athrow
		// @416: iconst_m1
		// @417: iload #20
		// @419: iconst_m1
		// @41A: ixor
		// @41B: if_icmpeq @426
		// @41E: goto @422
		// @421: athrow
		// @422: goto @44E
		// @425: athrow
		// @426: aload_2
		// @427: getfield byte[] game.C_100280_nf.field_101179_l
		// @42A: iload #5
		// @42C: iinc #5 +1
		// @42F: baload
		// @430: iconst_m1
		// @431: iadd
		// @432: istore #23
		// @434: aload #4
		// @436: arraylength
		// @437: iload #21
		// @439: if_icmple @44B
		// @43C: aload #4
		// @43E: iload #21
		// @440: iinc #21 +1
		// @443: baload
		// @444: istore #20
		// @446: iload #36
		// @448: ifeq @44E
		// @44B: iconst_m1
		// @44C: istore #20
		// @44E: iinc #20 +255
		// @451: aload_0
		// @452: getfield byte[] game.C_100236_on.field_100903_u
		// @455: iload #24
		// @457: iload #23
		// @459: i2b
		// @45A: bastore
		// @45B: iinc #24 +1
		// @45E: iload #36
		// @460: ifeq @3ED
		// @463: iconst_0
		// @464: istore #20
		// @466: iconst_0
		// @467: istore #21
		// @469: iconst_0
		// @46A: istore #24
		// @46C: iconst_0
		// @46D: istore #25
		// @46F: sipush -129 (0xFF7F)
		// @472: iload #25
		// @474: iconst_m1
		// @475: ixor
		// @476: if_icmpge @4E1
		// @479: aload_0
		// @47A: getfield int[] game.C_100236_on.field_100896_o
		// @47D: iload #25
		// @47F: iaload
		// @480: iload #36
		// @482: ifne @4E5
		// @485: ifeq @4D9
		// @488: goto @48C
		// @48B: athrow
		// @48C: iconst_m1
		// @48D: iload #20
		// @48F: iconst_m1
		// @490: ixor
		// @491: if_icmpeq @49C
		// @494: goto @498
		// @497: athrow
		// @498: goto @4CC
		// @49B: athrow
		// @49C: aload #7
		// @49E: arraylength
		// @49F: iconst_m1
		// @4A0: ixor
		// @4A1: iload #21
		// @4A3: iconst_m1
		// @4A4: ixor
		// @4A5: if_icmpge @4B7
		// @4A8: aload #7
		// @4AA: iload #21
		// @4AC: iinc #21 +1
		// @4AF: baload
		// @4B0: istore #20
		// @4B2: iload #36
		// @4B4: ifeq @4BA
		// @4B7: iconst_m1
		// @4B8: istore #20
		// @4BA: aload_2
		// @4BB: getfield byte[] game.C_100280_nf.field_101179_l
		// @4BE: iload #8
		// @4C0: iinc #8 +1
		// @4C3: baload
		// @4C4: bipush -16 (0xF0)
		// @4C6: isub
		// @4C7: ldc -449535582 (0xe534a1a2)
		// @4C9: ishl
		// @4CA: istore #24
		// @4CC: iinc #20 +255
		// @4CF: aload_0
		// @4D0: getfield byte[] game.C_100236_on.field_100904_t
		// @4D3: iload #25
		// @4D5: iload #24
		// @4D7: i2b
		// @4D8: bastore
		// @4D9: iinc #25 +1
		// @4DC: iload #36
		// @4DE: ifeq @46F
		// @4E1: iconst_0
		// @4E2: istore #21
		// @4E4: iconst_0
		// @4E5: istore #20
		// @4E7: aconst_null
		// @4E8: astore #25
		// @4EA: iconst_0
		// @4EB: istore #26
		// @4ED: iload #26
		// @4EF: iconst_m1
		// @4F0: ixor
		// @4F1: sipush -129 (0xFF7F)
		// @4F4: if_icmple @552
		// @4F7: aload_0
		// @4F8: getfield int[] game.C_100236_on.field_100896_o
		// @4FB: iload #26
		// @4FD: iaload
		// @4FE: iconst_m1
		// @4FF: ixor
		// @500: iload #36
		// @502: ifne @55C
		// @505: iconst_m1
		// @506: if_icmpeq @54A
		// @509: goto @50D
		// @50C: athrow
		// @50D: iload #20
		// @50F: ifeq @51A
		// @512: goto @516
		// @515: athrow
		// @516: goto @53E
		// @519: athrow
		// @51A: aload #13
		// @51C: aload #11
		// @51E: iload #21
		// @520: baload
		// @521: aaload
		// @522: astore #25
		// @524: aload #10
		// @526: arraylength
		// @527: iload #21
		// @529: if_icmple @53B
		// @52C: aload #10
		// @52E: iload #21
		// @530: iinc #21 +1
		// @533: baload
		// @534: istore #20
		// @536: iload #36
		// @538: ifeq @53E
		// @53B: iconst_m1
		// @53C: istore #20
		// @53E: iinc #20 +255
		// @541: aload_0
		// @542: getfield game.C_100132_td[] game.C_100236_on.field_100905_s
		// @545: iload #26
		// @547: aload #25
		// @549: aastore
		// @54A: iinc #26 +1
		// @54D: iload #36
		// @54F: ifeq @4ED
		// @552: iconst_0
		// @553: istore #20
		// @555: iconst_0
		// @556: istore #21
		// @558: iconst_0
		// @559: istore #26
		// @55B: iconst_0
		// @55C: istore #27
		// @55E: sipush -129 (0xFF7F)
		// @561: iload #27
		// @563: iconst_m1
		// @564: ixor
		// @565: if_icmpge @5C4
		// @568: iconst_0
		// @569: iload #20
		// @56B: iload #36
		// @56D: ifne @5D6
		// @570: if_icmpeq @57A
		// @573: goto @577
		// @576: athrow
		// @577: goto @5AF
		// @57A: iload #21
		// @57C: iconst_m1
		// @57D: ixor
		// @57E: aload #18
		// @580: arraylength
		// @581: iconst_m1
		// @582: ixor
		// @583: if_icmpgt @58E
		// @586: iconst_m1
		// @587: istore #20
		// @589: iload #36
		// @58B: ifeq @598
		// @58E: aload #18
		// @590: iload #21
		// @592: iinc #21 +1
		// @595: baload
		// @596: istore #20
		// @598: aload_0
		// @599: getfield int[] game.C_100236_on.field_100896_o
		// @59C: iload #27
		// @59E: iaload
		// @59F: ifgt @5A6
		// @5A2: goto @5AF
		// @5A5: athrow
		// @5A6: iconst_1
		// @5A7: aload_2
		// @5A8: iconst_0
		// @5A9: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @5AC: iadd
		// @5AD: istore #26
		// @5AF: iinc #20 +255
		// @5B2: aload_0
		// @5B3: getfield byte[] game.C_100236_on.field_100902_v
		// @5B6: iload #27
		// @5B8: iload #26
		// @5BA: i2b
		// @5BB: bastore
		// @5BC: iinc #27 +1
		// @5BF: iload #36
		// @5C1: ifeq @55E
		// @5C4: aload_0
		// @5C5: aload_2
		// @5C6: iconst_0
		// @5C7: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @5CA: iconst_1
		// @5CB: iadd
		// @5CC: putfield int game.C_100236_on.field_100895_n
		// @5CF: iconst_0
		// @5D0: istore #27
		// @5D2: iload #12
		// @5D4: iload #27
		// @5D6: if_icmple @667
		// @5D9: aload #13
		// @5DB: iload #27
		// @5DD: aaload
		// @5DE: astore #28
		// @5E0: aconst_null
		// @5E1: aload #28
		// @5E3: getfield byte[] game.C_100132_td.field_104981_j
		// @5E6: iload #36
		// @5E8: ifne @79A
		// @5EB: if_acmpeq @623
		// @5EE: goto @5F2
		// @5F1: athrow
		// @5F2: iconst_1
		// @5F3: istore #29
		// @5F5: iload #29
		// @5F7: iconst_m1
		// @5F8: ixor
		// @5F9: aload #28
		// @5FB: getfield byte[] game.C_100132_td.field_104981_j
		// @5FE: arraylength
		// @5FF: iconst_m1
		// @600: ixor
		// @601: if_icmple @623
		// @604: aload #28
		// @606: getfield byte[] game.C_100132_td.field_104981_j
		// @609: iload #29
		// @60B: aload_2
		// @60C: bipush -113 (0x8F)
		// @60E: invokevirtual game.C_100280_nf.func_101146_c(byte)byte
		// @611: bastore
		// @612: iinc #29 +2
		// @615: iload #36
		// @617: ifne @662
		// @61A: iload #36
		// @61C: ifeq @5F5
		// @61F: goto @623
		// @622: athrow
		// @623: aload #28
		// @625: getfield byte[] game.C_100132_td.field_104985_q
		// @628: ifnull @65F
		// @62B: iconst_3
		// @62C: istore #29
		// @62E: aload #28
		// @630: getfield byte[] game.C_100132_td.field_104985_q
		// @633: arraylength
		// @634: bipush -2 (0xFE)
		// @636: iadd
		// @637: iconst_m1
		// @638: ixor
		// @639: iload #29
		// @63B: iconst_m1
		// @63C: ixor
		// @63D: if_icmpge @65F
		// @640: aload #28
		// @642: getfield byte[] game.C_100132_td.field_104985_q
		// @645: iload #29
		// @647: aload_2
		// @648: bipush -126 (0x82)
		// @64A: invokevirtual game.C_100280_nf.func_101146_c(byte)byte
		// @64D: bastore
		// @64E: iinc #29 +2
		// @651: iload #36
		// @653: ifne @662
		// @656: iload #36
		// @658: ifeq @62E
		// @65B: goto @65F
		// @65E: athrow
		// @65F: iinc #27 +1
		// @662: iload #36
		// @664: ifeq @5D2
		// @667: aload #15
		// @669: ifnull @697
		// @66C: iconst_1
		// @66D: istore #27
		// @66F: iload #27
		// @671: iconst_m1
		// @672: ixor
		// @673: aload #15
		// @675: arraylength
		// @676: iconst_m1
		// @677: ixor
		// @678: if_icmple @697
		// @67B: aload #15
		// @67D: iload #27
		// @67F: aload_2
		// @680: bipush -127 (0x81)
		// @682: invokevirtual game.C_100280_nf.func_101146_c(byte)byte
		// @685: bastore
		// @686: iinc #27 +2
		// @689: iload #36
		// @68B: ifne @6C7
		// @68E: iload #36
		// @690: ifeq @66F
		// @693: goto @697
		// @696: athrow
		// @697: aload #16
		// @699: ifnull @6C7
		// @69C: iconst_1
		// @69D: istore #27
		// @69F: aload #16
		// @6A1: arraylength
		// @6A2: iconst_m1
		// @6A3: ixor
		// @6A4: iload #27
		// @6A6: iconst_m1
		// @6A7: ixor
		// @6A8: if_icmpge @6C7
		// @6AB: aload #16
		// @6AD: iload #27
		// @6AF: aload_2
		// @6B0: bipush -120 (0x88)
		// @6B2: invokevirtual game.C_100280_nf.func_101146_c(byte)byte
		// @6B5: bastore
		// @6B6: iinc #27 +2
		// @6B9: iload #36
		// @6BB: ifne @6CA
		// @6BE: iload #36
		// @6C0: ifeq @69F
		// @6C3: goto @6C7
		// @6C6: athrow
		// @6C7: iconst_0
		// @6C8: istore #27
		// @6CA: iload #27
		// @6CC: iload #12
		// @6CE: if_icmpge @730
		// @6D1: aload #13
		// @6D3: iload #27
		// @6D5: aaload
		// @6D6: astore #28
		// @6D8: aconst_null
		// @6D9: aload #28
		// @6DB: getfield byte[] game.C_100132_td.field_104985_q
		// @6DE: iload #36
		// @6E0: ifne @79A
		// @6E3: if_acmpeq @728
		// @6E6: goto @6EA
		// @6E9: athrow
		// @6EA: iconst_0
		// @6EB: istore #19
		// @6ED: iconst_2
		// @6EE: istore #29
		// @6F0: aload #28
		// @6F2: getfield byte[] game.C_100132_td.field_104985_q
		// @6F5: arraylength
		// @6F6: iconst_m1
		// @6F7: ixor
		// @6F8: iload #29
		// @6FA: iconst_m1
		// @6FB: ixor
		// @6FC: if_icmpge @728
		// @6FF: iload #19
		// @701: iconst_m1
		// @702: isub
		// @703: aload_2
		// @704: iconst_0
		// @705: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @708: ineg
		// @709: isub
		// @70A: istore #19
		// @70C: aload #28
		// @70E: getfield byte[] game.C_100132_td.field_104985_q
		// @711: iload #29
		// @713: iload #19
		// @715: i2b
		// @716: bastore
		// @717: iinc #29 +2
		// @71A: iload #36
		// @71C: ifne @72B
		// @71F: iload #36
		// @721: ifeq @6F0
		// @724: goto @728
		// @727: athrow
		// @728: iinc #27 +1
		// @72B: iload #36
		// @72D: ifeq @6CA
		// @730: iconst_0
		// @731: istore #27
		// @733: iload #12
		// @735: iconst_m1
		// @736: ixor
		// @737: iload #27
		// @739: iconst_m1
		// @73A: ixor
		// @73B: if_icmpge @797
		// @73E: aload #13
		// @740: iload #27
		// @742: aaload
		// @743: astore #28
		// @745: aload #28
		// @747: getfield byte[] game.C_100132_td.field_104981_j
		// @74A: iload #36
		// @74C: ifne @905
		// @74F: ifnull @78F
		// @752: goto @756
		// @755: athrow
		// @756: iconst_0
		// @757: istore #19
		// @759: iconst_2
		// @75A: istore #29
		// @75C: iload #29
		// @75E: aload #28
		// @760: getfield byte[] game.C_100132_td.field_104981_j
		// @763: arraylength
		// @764: if_icmpge @78F
		// @767: iload #19
		// @769: iconst_1
		// @76A: aload_2
		// @76B: iconst_0
		// @76C: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @76F: iadd
		// @770: iadd
		// @771: istore #19
		// @773: aload #28
		// @775: getfield byte[] game.C_100132_td.field_104981_j
		// @778: iload #29
		// @77A: iload #19
		// @77C: i2b
		// @77D: bastore
		// @77E: iinc #29 +2
		// @781: iload #36
		// @783: ifne @792
		// @786: iload #36
		// @788: ifeq @75C
		// @78B: goto @78F
		// @78E: athrow
		// @78F: iinc #27 +1
		// @792: iload #36
		// @794: ifeq @733
		// @797: aconst_null
		// @798: aload #15
		// @79A: if_acmpeq @8F2
		// @79D: aload_2
		// @79E: iconst_0
		// @79F: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @7A2: istore #19
		// @7A4: aload #15
		// @7A6: iconst_0
		// @7A7: iload #19
		// @7A9: i2b
		// @7AA: bastore
		// @7AB: iconst_2
		// @7AC: istore #27
		// @7AE: iload #27
		// @7B0: iconst_m1
		// @7B1: ixor
		// @7B2: aload #15
		// @7B4: arraylength
		// @7B5: iconst_m1
		// @7B6: ixor
		// @7B7: if_icmple @7DF
		// @7BA: aload_2
		// @7BB: iconst_0
		// @7BC: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @7BF: iload #19
		// @7C1: iadd
		// @7C2: iconst_m1
		// @7C3: isub
		// @7C4: istore #19
		// @7C6: aload #15
		// @7C8: iload #27
		// @7CA: iload #19
		// @7CC: i2b
		// @7CD: bastore
		// @7CE: iinc #27 +2
		// @7D1: iload #36
		// @7D3: ifne @7E5
		// @7D6: iload #36
		// @7D8: ifeq @7AE
		// @7DB: goto @7DF
		// @7DE: athrow
		// @7DF: aload #15
		// @7E1: iconst_0
		// @7E2: baload
		// @7E3: istore #27
		// @7E5: aload #15
		// @7E7: iconst_1
		// @7E8: baload
		// @7E9: istore #28
		// @7EB: iconst_0
		// @7EC: istore #29
		// @7EE: iload #29
		// @7F0: iconst_m1
		// @7F1: ixor
		// @7F2: iload #27
		// @7F4: iconst_m1
		// @7F5: ixor
		// @7F6: if_icmple @822
		// @7F9: aload_0
		// @7FA: getfield byte[] game.C_100236_on.field_100902_v
		// @7FD: iload #29
		// @7FF: bipush 32 (0x20)
		// @801: iload #28
		// @803: aload_0
		// @804: getfield byte[] game.C_100236_on.field_100902_v
		// @807: iload #29
		// @809: baload
		// @80A: imul
		// @80B: iadd
		// @80C: ldc 786083846 (0x2edab006)
		// @80E: ishr
		// @80F: i2b
		// @810: bastore
		// @811: iinc #29 +1
		// @814: iload #36
		// @816: ifne @825
		// @819: iload #36
		// @81B: ifeq @7EE
		// @81E: goto @822
		// @821: athrow
		// @822: iconst_2
		// @823: istore #29
		// @825: aload #15
		// @827: arraylength
		// @828: iload #29
		// @82A: if_icmple @8B8
		// @82D: aload #15
		// @82F: iload #29
		// @831: baload
		// @832: istore #30
		// @834: aload #15
		// @836: iconst_1
		// @837: iload #29
		// @839: iadd
		// @83A: baload
		// @83B: istore #31
		// @83D: iload #27
		// @83F: ineg
		// @840: iload #30
		// @842: iadd
		// @843: iload #28
		// @845: imul
		// @846: iload #30
		// @848: iload #27
		// @84A: isub
		// @84B: iconst_2
		// @84C: idiv
		// @84D: ineg
		// @84E: isub
		// @84F: istore #32
		// @851: iload #27
		// @853: iload #36
		// @855: ifne @8BA
		// @858: istore #33
		// @85A: iload #33
		// @85C: iconst_m1
		// @85D: ixor
		// @85E: iload #30
		// @860: iconst_m1
		// @861: ixor
		// @862: if_icmple @8A8
		// @865: iload #27
		// @867: ineg
		// @868: iload #30
		// @86A: iadd
		// @86B: bipush -78 (0xB2)
		// @86D: iload #32
		// @86F: invokestatic game.C_100339_jb.func_107378_a(int, byte, int)int
		// @872: istore #34
		// @874: iload #32
		// @876: iload #28
		// @878: ineg
		// @879: iload #31
		// @87B: iadd
		// @87C: iadd
		// @87D: istore #32
		// @87F: aload_0
		// @880: getfield byte[] game.C_100236_on.field_100902_v
		// @883: iload #33
		// @885: bipush 32 (0x20)
		// @887: iload #34
		// @889: aload_0
		// @88A: getfield byte[] game.C_100236_on.field_100902_v
		// @88D: iload #33
		// @88F: baload
		// @890: imul
		// @891: iadd
		// @892: ldc 1287267046 (0x4cba22e6)
		// @894: ishr
		// @895: i2b
		// @896: bastore
		// @897: iinc #33 +1
		// @89A: iload #36
		// @89C: ifne @8B3
		// @89F: iload #36
		// @8A1: ifeq @85A
		// @8A4: goto @8A8
		// @8A7: athrow
		// @8A8: iload #30
		// @8AA: istore #27
		// @8AC: iload #31
		// @8AE: istore #28
		// @8B0: iinc #29 +2
		// @8B3: iload #36
		// @8B5: ifeq @825
		// @8B8: iload #27
		// @8BA: istore #30
		// @8BC: sipush -129 (0xFF7F)
		// @8BF: iload #30
		// @8C1: iconst_m1
		// @8C2: ixor
		// @8C3: if_icmpge @8EF
		// @8C6: aload_0
		// @8C7: getfield byte[] game.C_100236_on.field_100902_v
		// @8CA: iload #30
		// @8CC: bipush 32 (0x20)
		// @8CE: aload_0
		// @8CF: getfield byte[] game.C_100236_on.field_100902_v
		// @8D2: iload #30
		// @8D4: baload
		// @8D5: iload #28
		// @8D7: imul
		// @8D8: iadd
		// @8D9: ldc 1376987110 (0x521327e6)
		// @8DB: ishr
		// @8DC: i2b
		// @8DD: bastore
		// @8DE: iinc #30 +1
		// @8E1: iload #36
		// @8E3: ifne @8F2
		// @8E6: iload #36
		// @8E8: ifeq @8BC
		// @8EB: goto @8EF
		// @8EE: athrow
		// @8EF: aconst_null
		// @8F0: astore #15
		// @8F2: aconst_null
		// @8F3: aload #16
		// @8F5: if_acmpne @8FC
		// @8F8: goto @A99
		// @8FB: athrow
		// @8FC: aload_2
		// @8FD: iconst_0
		// @8FE: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @901: istore #19
		// @903: aload #16
		// @905: iconst_0
		// @906: iload #19
		// @908: i2b
		// @909: bastore
		// @90A: iconst_2
		// @90B: istore #27
		// @90D: iload #27
		// @90F: iconst_m1
		// @910: ixor
		// @911: aload #16
		// @913: arraylength
		// @914: iconst_m1
		// @915: ixor
		// @916: if_icmple @93E
		// @919: aload_2
		// @91A: iconst_0
		// @91B: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @91E: iconst_1
		// @91F: iload #19
		// @921: iadd
		// @922: iadd
		// @923: istore #19
		// @925: aload #16
		// @927: iload #27
		// @929: iload #19
		// @92B: i2b
		// @92C: bastore
		// @92D: iinc #27 +2
		// @930: iload #36
		// @932: ifne @944
		// @935: iload #36
		// @937: ifeq @90D
		// @93A: goto @93E
		// @93D: athrow
		// @93E: aload #16
		// @940: iconst_0
		// @941: baload
		// @942: istore #27
		// @944: aload #16
		// @946: iconst_1
		// @947: baload
		// @948: ldc -1718891007 (0x998bce01)
		// @94A: ishl
		// @94B: istore #28
		// @94D: iconst_0
		// @94E: istore #29
		// @950: iload #27
		// @952: iconst_m1
		// @953: ixor
		// @954: iload #29
		// @956: iconst_m1
		// @957: ixor
		// @958: if_icmpge @9A1
		// @95B: iload #28
		// @95D: aload_0
		// @95E: getfield byte[] game.C_100236_on.field_100904_t
		// @961: iload #29
		// @963: baload
		// @964: sipush 255 (0x00FF)
		// @967: iand
		// @968: iadd
		// @969: istore #30
		// @96B: iconst_0
		// @96C: iload #30
		// @96E: iload #36
		// @970: ifne @9AD
		// @973: if_icmpgt @97D
		// @976: goto @97A
		// @979: athrow
		// @97A: goto @980
		// @97D: iconst_0
		// @97E: istore #30
		// @980: iload #30
		// @982: iconst_m1
		// @983: ixor
		// @984: sipush -129 (0xFF7F)
		// @987: if_icmpge @98F
		// @98A: sipush 128 (0x0080)
		// @98D: istore #30
		// @98F: aload_0
		// @990: getfield byte[] game.C_100236_on.field_100904_t
		// @993: iload #29
		// @995: iload #30
		// @997: i2b
		// @998: bastore
		// @999: iinc #29 +1
		// @99C: iload #36
		// @99E: ifeq @950
		// @9A1: iconst_2
		// @9A2: istore #29
		// @9A4: iload #29
		// @9A6: iconst_m1
		// @9A7: ixor
		// @9A8: aload #16
		// @9AA: arraylength
		// @9AB: iconst_m1
		// @9AC: ixor
		// @9AD: if_icmple @A51
		// @9B0: aload #16
		// @9B2: iload #29
		// @9B4: baload
		// @9B5: istore #30
		// @9B7: aload #16
		// @9B9: iconst_1
		// @9BA: iload #29
		// @9BC: iadd
		// @9BD: baload
		// @9BE: ldc 1676815073 (0x63f22ae1)
		// @9C0: ishl
		// @9C1: istore #31
		// @9C3: iload #27
		// @9C5: ineg
		// @9C6: iload #30
		// @9C8: iadd
		// @9C9: iconst_2
		// @9CA: idiv
		// @9CB: iload #28
		// @9CD: iload #27
		// @9CF: ineg
		// @9D0: iload #30
		// @9D2: iadd
		// @9D3: imul
		// @9D4: iadd
		// @9D5: istore #32
		// @9D7: iload #27
		// @9D9: iload #36
		// @9DB: ifne @A9A
		// @9DE: istore #33
		// @9E0: iload #33
		// @9E2: iload #30
		// @9E4: if_icmpge @A41
		// @9E7: iload #30
		// @9E9: iload #27
		// @9EB: isub
		// @9EC: bipush -87 (0xA9)
		// @9EE: iload #32
		// @9F0: invokestatic game.C_100339_jb.func_107378_a(int, byte, int)int
		// @9F3: istore #34
		// @9F5: iload #34
		// @9F7: sipush 255 (0x00FF)
		// @9FA: aload_0
		// @9FB: getfield byte[] game.C_100236_on.field_100904_t
		// @9FE: iload #33
		// @A00: baload
		// @A01: iand
		// @A02: iadd
		// @A03: istore #35
		// @A05: iconst_0
		// @A06: iload #35
		// @A08: iload #36
		// @A0A: ifne @9AD
		// @A0D: if_icmple @A13
		// @A10: iconst_0
		// @A11: istore #35
		// @A13: sipush 128 (0x0080)
		// @A16: iload #35
		// @A18: if_icmplt @A1F
		// @A1B: goto @A24
		// @A1E: athrow
		// @A1F: sipush 128 (0x0080)
		// @A22: istore #35
		// @A24: aload_0
		// @A25: getfield byte[] game.C_100236_on.field_100904_t
		// @A28: iload #33
		// @A2A: iload #35
		// @A2C: i2b
		// @A2D: bastore
		// @A2E: iload #32
		// @A30: iload #28
		// @A32: ineg
		// @A33: iload #31
		// @A35: iadd
		// @A36: iadd
		// @A37: istore #32
		// @A39: iinc #33 +1
		// @A3C: iload #36
		// @A3E: ifeq @9E0
		// @A41: iload #31
		// @A43: istore #28
		// @A45: iload #30
		// @A47: istore #27
		// @A49: iinc #29 +2
		// @A4C: iload #36
		// @A4E: ifeq @9A4
		// @A51: aconst_null
		// @A52: astore #16
		// @A54: iload #27
		// @A56: istore #30
		// @A58: iload #30
		// @A5A: sipush 128 (0x0080)
		// @A5D: if_icmpge @A99
		// @A60: iload #28
		// @A62: aload_0
		// @A63: getfield byte[] game.C_100236_on.field_100904_t
		// @A66: iload #30
		// @A68: baload
		// @A69: sipush 255 (0x00FF)
		// @A6C: iand
		// @A6D: iadd
		// @A6E: istore #31
		// @A70: iload #31
		// @A72: ifge @A78
		// @A75: iconst_0
		// @A76: istore #31
		// @A78: sipush 128 (0x0080)
		// @A7B: iload #31
		// @A7D: if_icmplt @A84
		// @A80: goto @A89
		// @A83: athrow
		// @A84: sipush 128 (0x0080)
		// @A87: istore #31
		// @A89: aload_0
		// @A8A: getfield byte[] game.C_100236_on.field_100904_t
		// @A8D: iload #30
		// @A8F: iload #31
		// @A91: i2b
		// @A92: bastore
		// @A93: iinc #30 +1
		// @A96: goto @A58
		// @A99: iconst_0
		// @A9A: istore #27
		// @A9C: iload #27
		// @A9E: iload #12
		// @AA0: if_icmpge @AC1
		// @AA3: aload #13
		// @AA5: iload #27
		// @AA7: aaload
		// @AA8: aload_2
		// @AA9: iconst_0
		// @AAA: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @AAD: putfield int game.C_100132_td.field_104971_g
		// @AB0: iinc #27 +1
		// @AB3: iload #36
		// @AB5: ifne @AC4
		// @AB8: iload #36
		// @ABA: ifeq @A9C
		// @ABD: goto @AC1
		// @AC0: athrow
		// @AC1: iconst_0
		// @AC2: istore #27
		// @AC4: iload #12
		// @AC6: iload #27
		// @AC8: if_icmple @B27
		// @ACB: aload #13
		// @ACD: iload #27
		// @ACF: aaload
		// @AD0: astore #28
		// @AD2: iload #36
		// @AD4: ifne @B2A
		// @AD7: aconst_null
		// @AD8: aload #28
		// @ADA: getfield byte[] game.C_100132_td.field_104981_j
		// @ADD: if_acmpeq @AF2
		// @AE0: goto @AE4
		// @AE3: athrow
		// @AE4: aload #28
		// @AE6: aload_2
		// @AE7: iconst_0
		// @AE8: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @AEB: putfield int game.C_100132_td.field_104983_h
		// @AEE: goto @AF2
		// @AF1: athrow
		// @AF2: aconst_null
		// @AF3: aload #28
		// @AF5: getfield byte[] game.C_100132_td.field_104985_q
		// @AF8: if_acmpeq @B09
		// @AFB: aload #28
		// @AFD: aload_2
		// @AFE: iconst_0
		// @AFF: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @B02: putfield int game.C_100132_td.field_104973_e
		// @B05: goto @B09
		// @B08: athrow
		// @B09: aload #28
		// @B0B: getfield int game.C_100132_td.field_104971_g
		// @B0E: ifle @B1F
		// @B11: aload #28
		// @B13: aload_2
		// @B14: iconst_0
		// @B15: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @B18: putfield int game.C_100132_td.field_104974_b
		// @B1B: goto @B1F
		// @B1E: athrow
		// @B1F: iinc #27 +1
		// @B22: iload #36
		// @B24: ifeq @AC4
		// @B27: iconst_0
		// @B28: istore #27
		// @B2A: iload #27
		// @B2C: iconst_m1
		// @B2D: ixor
		// @B2E: iload #12
		// @B30: iconst_m1
		// @B31: ixor
		// @B32: if_icmple @B57
		// @B35: aload #13
		// @B37: iload #27
		// @B39: aaload
		// @B3A: aload_2
		// @B3B: iconst_0
		// @B3C: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @B3F: putfield int game.C_100132_td.field_104982_k
		// @B42: iinc #27 +1
		// @B45: iload #36
		// @B47: ifne @B5A
		// @B4A: goto @B4E
		// @B4D: athrow
		// @B4E: iload #36
		// @B50: ifeq @B2A
		// @B53: goto @B57
		// @B56: athrow
		// @B57: iconst_0
		// @B58: istore #27
		// @B5A: iload #27
		// @B5C: iconst_m1
		// @B5D: ixor
		// @B5E: iload #12
		// @B60: iconst_m1
		// @B61: ixor
		// @B62: if_icmple @B95
		// @B65: aload #13
		// @B67: iload #27
		// @B69: aaload
		// @B6A: astore #28
		// @B6C: iconst_m1
		// @B6D: aload #28
		// @B6F: getfield int game.C_100132_td.field_104982_k
		// @B72: iconst_m1
		// @B73: ixor
		// @B74: iload #36
		// @B76: ifne @BA0
		// @B79: if_icmpgt @B83
		// @B7C: goto @B80
		// @B7F: athrow
		// @B80: goto @B8D
		// @B83: aload #28
		// @B85: aload_2
		// @B86: iconst_0
		// @B87: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @B8A: putfield int game.C_100132_td.field_104978_o
		// @B8D: iinc #27 +1
		// @B90: iload #36
		// @B92: ifeq @B5A
		// @B95: iconst_0
		// @B96: istore #27
		// @B98: iload #12
		// @B9A: iconst_m1
		// @B9B: ixor
		// @B9C: iload #27
		// @B9E: iconst_m1
		// @B9F: ixor
		// @BA0: if_icmpge @BD4
		// @BA3: aload #13
		// @BA5: iload #27
		// @BA7: aaload
		// @BA8: astore #28
		// @BAA: iload #36
		// @BAC: ifne @C09
		// @BAF: iconst_m1
		// @BB0: aload #28
		// @BB2: getfield int game.C_100132_td.field_104978_o
		// @BB5: iconst_m1
		// @BB6: ixor
		// @BB7: if_icmple @BCC
		// @BBA: goto @BBE
		// @BBD: athrow
		// @BBE: aload #28
		// @BC0: aload_2
		// @BC1: iconst_0
		// @BC2: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @BC5: putfield int game.C_100132_td.field_104980_m
		// @BC8: goto @BCC
		// @BCB: athrow
		// @BCC: iinc #27 +1
		// @BCF: iload #36
		// @BD1: ifeq @B98
		// @BD4: goto @C09
		// @BD7: astore_2
		// @BD8: aload_2
		// @BD9: new java.lang.StringBuilder
		// @BDC: dup
		// @BDD: invokespecial java.lang.StringBuilder.<init>()void
		// @BE0: getstatic java.lang.String[] game.C_100236_on.field_100909_z
		// @BE3: iconst_5
		// @BE4: aaload
		// @BE5: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @BE8: aload_1
		// @BE9: ifnull @BF5
		// @BEC: getstatic java.lang.String[] game.C_100236_on.field_100909_z
		// @BEF: iconst_3
		// @BF0: aaload
		// @BF1: goto @BFA
		// @BF4: athrow
		// @BF5: getstatic java.lang.String[] game.C_100236_on.field_100909_z
		// @BF8: iconst_1
		// @BF9: aaload
		// @BFA: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @BFD: bipush 41 (0x29)
		// @BFF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C02: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @C05: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @C08: athrow
		// @C09: return
	}
	
	static
	{
		// @00: bipush 8 (0x08)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "'\t,cJ"
		// @09: invokestatic game.C_100236_on.func_100890_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100236_on.func_100889_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "&\u0012nJ"
		// @14: invokestatic game.C_100236_on.func_100890_z(java.lang.String)char[]
		// @17: invokestatic game.C_100236_on.func_100889_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "'\t,eJ"
		// @1F: invokestatic game.C_100236_on.func_100890_z(java.lang.String)char[]
		// @22: invokestatic game.C_100236_on.func_100889_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "3I,\u0008\u001f"
		// @2A: invokestatic game.C_100236_on.func_100890_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100236_on.func_100889_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "'\t,dJ"
		// @35: invokestatic game.C_100236_on.func_100890_z(java.lang.String)char[]
		// @38: invokestatic game.C_100236_on.func_100889_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "'\t,\u001a\u000b&\u000ev\u0018J"
		// @40: invokestatic game.C_100236_on.func_100890_z(java.lang.String)char[]
		// @43: invokestatic game.C_100236_on.func_100889_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "'\t,bJ"
		// @4C: invokestatic game.C_100236_on.func_100890_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100236_on.func_100889_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "'\t,gJ"
		// @58: invokestatic game.C_100236_on.func_100890_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100236_on.func_100889_z(char[])java.lang.String
		// @5E: aastore
		// @5F: putstatic java.lang.String[] game.C_100236_on.field_100909_z
		// @62: ldc "\u0011\u0008w\u0006\n)\u0011g\u0006\u0006!\u0014aI\u0014-\u0015gBB<\u000fg\u0006\u0004'\u000bnI\u0015!\te\u0006\u000b<\u0002oUX"
		// @64: invokestatic game.C_100236_on.func_100890_z(java.lang.String)char[]
		// @67: invokestatic game.C_100236_on.func_100889_z(char[])java.lang.String
		// @6A: putstatic java.lang.String game.C_100236_on.field_100897_l
		// @6D: ldc "\u000b\u0006oV\u0003!\u0000lU"
		// @6F: invokestatic game.C_100236_on.func_100890_z(java.lang.String)char[]
		// @72: invokestatic game.C_100236_on.func_100889_z(char[])java.lang.String
		// @75: putstatic java.lang.String game.C_100236_on.field_100898_m
		// @78: return
	}
	
	private static char[] func_100890_z(String arg0)
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
		// @0E: bipush 98 (0x62)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_100889_z(char[] arg0)
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
		// @10: tableswitch def: @43, for 0: @30, for 1: @35, for 2: @3A, for 3: @3E
		// @30: bipush 72 (0x48)
		// @32: goto @45
		// @35: bipush 103 (0x67)
		// @37: goto @45
		// @3A: iconst_2
		// @3B: goto @45
		// @3E: bipush 38 (0x26)
		// @40: goto @45
		// @43: bipush 98 (0x62)
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
