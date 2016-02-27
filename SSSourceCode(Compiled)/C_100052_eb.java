package game;

import java.util.Iterator;

final class C_100052_eb implements Iterable
{
	C_100325_id field_104232_c;
	static C_100006_fj field_104233_a;
	static C_100037_wb field_104228_f;
	static int[] field_104230_e;
	static String field_104229_d;
	static int field_104231_b;
	private static final String[] field_104234_z;
	
	final void func_104221_a(C_100325_id arg0, int arg1)
	{
		// @00: aload_1
		// @01: getfield game.C_100325_id game.C_100325_id.field_101486_m
		// @04: ifnull @11
		// @07: aload_1
		// @08: bipush 8 (0x08)
		// @0A: invokevirtual game.C_100325_id.func_101479_c(byte)void
		// @0D: goto @11
		// @10: athrow
		// @11: aload_1
		// @12: aload_0
		// @13: getfield game.C_100325_id game.C_100052_eb.field_104232_c
		// @16: getfield game.C_100325_id game.C_100325_id.field_101486_m
		// @19: putfield game.C_100325_id game.C_100325_id.field_101486_m
		// @1C: iload_2
		// @1D: sipush -22953 (0xA657)
		// @20: if_icmpeq @24
		// @23: return
		// @24: aload_1
		// @25: aload_0
		// @26: getfield game.C_100325_id game.C_100052_eb.field_104232_c
		// @29: putfield game.C_100325_id game.C_100325_id.field_101483_n
		// @2C: aload_1
		// @2D: getfield game.C_100325_id game.C_100325_id.field_101486_m
		// @30: aload_1
		// @31: putfield game.C_100325_id game.C_100325_id.field_101483_n
		// @34: aload_1
		// @35: getfield game.C_100325_id game.C_100325_id.field_101483_n
		// @38: aload_1
		// @39: putfield game.C_100325_id game.C_100325_id.field_101486_m
		// @3C: goto @7A
		// @3F: astore_3
		// @40: aload_3
		// @41: new java.lang.StringBuilder
		// @44: dup
		// @45: invokespecial java.lang.StringBuilder.<init>()void
		// @48: getstatic java.lang.String[] game.C_100052_eb.field_104234_z
		// @4B: iconst_4
		// @4C: aaload
		// @4D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @50: aload_1
		// @51: ifnull @5D
		// @54: getstatic java.lang.String[] game.C_100052_eb.field_104234_z
		// @57: iconst_3
		// @58: aaload
		// @59: goto @62
		// @5C: athrow
		// @5D: getstatic java.lang.String[] game.C_100052_eb.field_104234_z
		// @60: iconst_5
		// @61: aaload
		// @62: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @65: bipush 44 (0x2C)
		// @67: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6A: iload_2
		// @6B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6E: bipush 41 (0x29)
		// @70: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @73: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @76: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @79: athrow
		// @7A: return
	}
	
	static final String func_104227_a(byte arg0, int arg1, String arg2)
	{
		// @000: iload_1
		// @001: iconst_1
		// @002: if_icmpeq @009
		// @005: goto @01B
		// @008: athrow
		// @009: sipush -30945 (0x871F)
		// @00C: iconst_1
		// @00D: anewarray java.lang.String
		// @010: dup
		// @011: iconst_0
		// @012: aload_2
		// @013: aastore
		// @014: getstatic java.lang.String game.C_100322_hn.field_107235_f
		// @017: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @01A: areturn
		// @01B: iload_1
		// @01C: iconst_2
		// @01D: if_icmpeq @024
		// @020: goto @036
		// @023: athrow
		// @024: sipush -30945 (0x871F)
		// @027: iconst_1
		// @028: anewarray java.lang.String
		// @02B: dup
		// @02C: iconst_0
		// @02D: aload_2
		// @02E: aastore
		// @02F: getstatic java.lang.String game.C_100141_tc.field_105062_c
		// @032: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @035: areturn
		// @036: iconst_3
		// @037: iload_1
		// @038: if_icmpeq @03F
		// @03B: goto @051
		// @03E: athrow
		// @03F: sipush -30945 (0x871F)
		// @042: iconst_1
		// @043: anewarray java.lang.String
		// @046: dup
		// @047: iconst_0
		// @048: aload_2
		// @049: aastore
		// @04A: getstatic java.lang.String game.C_100013_fn.field_103747_i
		// @04D: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @050: areturn
		// @051: iload_1
		// @052: iconst_m1
		// @053: ixor
		// @054: bipush -5 (0xFB)
		// @056: if_icmpeq @05D
		// @059: goto @06F
		// @05C: athrow
		// @05D: sipush -30945 (0x871F)
		// @060: iconst_1
		// @061: anewarray java.lang.String
		// @064: dup
		// @065: iconst_0
		// @066: aload_2
		// @067: aastore
		// @068: getstatic java.lang.String game.C_100248_pb.field_106426_c
		// @06B: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @06E: areturn
		// @06F: bipush -6 (0xFA)
		// @071: iload_1
		// @072: iconst_m1
		// @073: ixor
		// @074: if_icmpeq @07B
		// @077: goto @08D
		// @07A: athrow
		// @07B: sipush -30945 (0x871F)
		// @07E: iconst_1
		// @07F: anewarray java.lang.String
		// @082: dup
		// @083: iconst_0
		// @084: aload_2
		// @085: aastore
		// @086: getstatic java.lang.String game.C_100215_ai.field_106013_g
		// @089: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @08C: areturn
		// @08D: iload_0
		// @08E: bipush 27 (0x1B)
		// @090: if_icmpgt @098
		// @093: aconst_null
		// @094: checkcast java.lang.String
		// @097: areturn
		// @098: bipush -7 (0xF9)
		// @09A: iload_1
		// @09B: iconst_m1
		// @09C: ixor
		// @09D: if_icmpne @0B2
		// @0A0: sipush -30945 (0x871F)
		// @0A3: iconst_1
		// @0A4: anewarray java.lang.String
		// @0A7: dup
		// @0A8: iconst_0
		// @0A9: aload_2
		// @0AA: aastore
		// @0AB: getstatic java.lang.String game.C_100038_wa.field_104067_g
		// @0AE: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @0B1: areturn
		// @0B2: iload_1
		// @0B3: iconst_m1
		// @0B4: ixor
		// @0B5: bipush -8 (0xF8)
		// @0B7: if_icmpeq @0BE
		// @0BA: goto @0D0
		// @0BD: athrow
		// @0BE: sipush -30945 (0x871F)
		// @0C1: iconst_1
		// @0C2: anewarray java.lang.String
		// @0C5: dup
		// @0C6: iconst_0
		// @0C7: aload_2
		// @0C8: aastore
		// @0C9: getstatic java.lang.String game.C_100157_db.field_103556_f
		// @0CC: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @0CF: areturn
		// @0D0: bipush 8 (0x08)
		// @0D2: iload_1
		// @0D3: if_icmpeq @0DA
		// @0D6: goto @0EC
		// @0D9: athrow
		// @0DA: sipush -30945 (0x871F)
		// @0DD: iconst_1
		// @0DE: anewarray java.lang.String
		// @0E1: dup
		// @0E2: iconst_0
		// @0E3: aload_2
		// @0E4: aastore
		// @0E5: getstatic java.lang.String game.C_100172_ck.field_102118_Ub
		// @0E8: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @0EB: areturn
		// @0EC: iload_1
		// @0ED: iconst_m1
		// @0EE: ixor
		// @0EF: bipush -12 (0xF4)
		// @0F1: if_icmpne @106
		// @0F4: sipush -30945 (0x871F)
		// @0F7: iconst_1
		// @0F8: anewarray java.lang.String
		// @0FB: dup
		// @0FC: iconst_0
		// @0FD: aload_2
		// @0FE: aastore
		// @0FF: getstatic java.lang.String game.C_100003_ga.field_103540_r
		// @102: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @105: areturn
		// @106: iload_1
		// @107: bipush 12 (0x0C)
		// @109: if_icmpeq @110
		// @10C: goto @122
		// @10F: athrow
		// @110: sipush -30945 (0x871F)
		// @113: iconst_1
		// @114: anewarray java.lang.String
		// @117: dup
		// @118: iconst_0
		// @119: aload_2
		// @11A: aastore
		// @11B: getstatic java.lang.String game.C_100064_ve.field_103012_B
		// @11E: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @121: areturn
		// @122: bipush -14 (0xF2)
		// @124: iload_1
		// @125: iconst_m1
		// @126: ixor
		// @127: if_icmpne @13C
		// @12A: sipush -30945 (0x871F)
		// @12D: iconst_1
		// @12E: anewarray java.lang.String
		// @131: dup
		// @132: iconst_0
		// @133: aload_2
		// @134: aastore
		// @135: getstatic java.lang.String game.C_100197_ra.field_100869_p
		// @138: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @13B: areturn
		// @13C: aconst_null
		// @13D: areturn
		// @13E: astore_3
		// @13F: aload_3
		// @140: new java.lang.StringBuilder
		// @143: dup
		// @144: invokespecial java.lang.StringBuilder.<init>()void
		// @147: getstatic java.lang.String[] game.C_100052_eb.field_104234_z
		// @14A: bipush 7 (0x07)
		// @14C: aaload
		// @14D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @150: iload_0
		// @151: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @154: bipush 44 (0x2C)
		// @156: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @159: iload_1
		// @15A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @15D: bipush 44 (0x2C)
		// @15F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @162: aload_2
		// @163: ifnull @16F
		// @166: getstatic java.lang.String[] game.C_100052_eb.field_104234_z
		// @169: iconst_3
		// @16A: aaload
		// @16B: goto @174
		// @16E: athrow
		// @16F: getstatic java.lang.String[] game.C_100052_eb.field_104234_z
		// @172: iconst_5
		// @173: aaload
		// @174: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @177: bipush 41 (0x29)
		// @179: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @17C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @17F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @182: athrow
	}
	
	public final Iterator iterator()
	{
		// @00: new game.C_100084_ug
		// @03: dup
		// @04: aload_0
		// @05: invokespecial game.C_100084_ug.<init>(game.C_100052_eb)void
		// @08: areturn
		// @09: astore_1
		// @0A: aload_1
		// @0B: getstatic java.lang.String[] game.C_100052_eb.field_104234_z
		// @0E: iconst_0
		// @0F: aaload
		// @10: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @13: athrow
	}
	
	final C_100325_id func_104226_a(byte arg0)
	{
		// @00: bipush 65 (0x41)
		// @02: bipush -66 (0xBE)
		// @04: iload_1
		// @05: isub
		// @06: bipush 37 (0x25)
		// @08: idiv
		// @09: idiv
		// @0A: istore_3
		// @0B: aload_0
		// @0C: getfield game.C_100325_id game.C_100052_eb.field_104232_c
		// @0F: getfield game.C_100325_id game.C_100325_id.field_101483_n
		// @12: astore_2
		// @13: aload_0
		// @14: getfield game.C_100325_id game.C_100052_eb.field_104232_c
		// @17: aload_2
		// @18: if_acmpne @1D
		// @1B: aconst_null
		// @1C: areturn
		// @1D: aload_2
		// @1E: bipush 8 (0x08)
		// @20: invokevirtual game.C_100325_id.func_101479_c(byte)void
		// @23: aload_2
		// @24: areturn
		// @25: astore_2
		// @26: aload_2
		// @27: new java.lang.StringBuilder
		// @2A: dup
		// @2B: invokespecial java.lang.StringBuilder.<init>()void
		// @2E: getstatic java.lang.String[] game.C_100052_eb.field_104234_z
		// @31: iconst_1
		// @32: aaload
		// @33: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @36: iload_1
		// @37: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3A: bipush 41 (0x29)
		// @3C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @42: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @45: athrow
	}
	
	static final boolean func_104223_a(String arg0, int arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #4
		// @05: iload_1
		// @06: sipush -17560 (0xBB68)
		// @09: if_icmpeq @17
		// @0C: aconst_null
		// @0D: checkcast game.C_100006_fj
		// @10: putstatic game.C_100006_fj game.C_100052_eb.field_104233_a
		// @13: goto @17
		// @16: athrow
		// @17: iconst_0
		// @18: istore_2
		// @19: iload_2
		// @1A: aload_0
		// @1B: invokevirtual java.lang.String.length()int
		// @1E: if_icmpge @54
		// @21: aload_0
		// @22: iload_2
		// @23: invokevirtual java.lang.String.charAt(int)char
		// @26: istore_3
		// @27: bipush 124 (0x7C)
		// @29: iload_3
		// @2A: invokestatic game.C_100137_bn.func_105027_a(int, char)boolean
		// @2D: iload #4
		// @2F: ifne @55
		// @32: ifne @4C
		// @35: goto @39
		// @38: athrow
		// @39: iload_3
		// @3A: bipush -100 (0x9C)
		// @3C: invokestatic game.C_100064_ve.func_103007_a(char, byte)boolean
		// @3F: ifeq @4A
		// @42: goto @46
		// @45: athrow
		// @46: goto @4C
		// @49: athrow
		// @4A: iconst_1
		// @4B: ireturn
		// @4C: iinc #2 +1
		// @4F: iload #4
		// @51: ifeq @19
		// @54: iconst_0
		// @55: ireturn
		// @56: astore_2
		// @57: aload_2
		// @58: new java.lang.StringBuilder
		// @5B: dup
		// @5C: invokespecial java.lang.StringBuilder.<init>()void
		// @5F: getstatic java.lang.String[] game.C_100052_eb.field_104234_z
		// @62: bipush 6 (0x06)
		// @64: aaload
		// @65: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @68: aload_0
		// @69: ifnull @75
		// @6C: getstatic java.lang.String[] game.C_100052_eb.field_104234_z
		// @6F: iconst_3
		// @70: aaload
		// @71: goto @7A
		// @74: athrow
		// @75: getstatic java.lang.String[] game.C_100052_eb.field_104234_z
		// @78: iconst_5
		// @79: aaload
		// @7A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @7D: bipush 44 (0x2C)
		// @7F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @82: iload_1
		// @83: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @86: bipush 41 (0x29)
		// @88: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @8E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @91: athrow
	}
	
	public static void func_104222_a(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic int[] game.C_100052_eb.field_104230_e
		// @04: iload_0
		// @05: bipush 12 (0x0C)
		// @07: if_icmpeq @18
		// @0A: aconst_null
		// @0B: checkcast java.lang.String
		// @0E: bipush -78 (0xB2)
		// @10: invokestatic game.C_100052_eb.func_104223_a(java.lang.String, int)boolean
		// @13: pop
		// @14: goto @18
		// @17: athrow
		// @18: aconst_null
		// @19: putstatic java.lang.String game.C_100052_eb.field_104229_d
		// @1C: aconst_null
		// @1D: putstatic game.C_100006_fj game.C_100052_eb.field_104233_a
		// @20: aconst_null
		// @21: putstatic game.C_100037_wb game.C_100052_eb.field_104228_f
		// @24: goto @48
		// @27: astore_1
		// @28: aload_1
		// @29: new java.lang.StringBuilder
		// @2C: dup
		// @2D: invokespecial java.lang.StringBuilder.<init>()void
		// @30: getstatic java.lang.String[] game.C_100052_eb.field_104234_z
		// @33: iconst_2
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
	
	C_100052_eb()
	{
		// @00: aload_0
		// @01: invokespecial java.lang.Object.<init>()void
		// @04: aload_0
		// @05: new game.C_100325_id
		// @08: dup
		// @09: invokespecial game.C_100325_id.<init>()void
		// @0C: putfield game.C_100325_id game.C_100052_eb.field_104232_c
		// @0F: aload_0
		// @10: getfield game.C_100325_id game.C_100052_eb.field_104232_c
		// @13: aload_0
		// @14: getfield game.C_100325_id game.C_100052_eb.field_104232_c
		// @17: putfield game.C_100325_id game.C_100325_id.field_101483_n
		// @1A: aload_0
		// @1B: getfield game.C_100325_id game.C_100052_eb.field_104232_c
		// @1E: aload_0
		// @1F: getfield game.C_100325_id game.C_100052_eb.field_104232_c
		// @22: putfield game.C_100325_id game.C_100325_id.field_101486_m
		// @25: goto @34
		// @28: astore_1
		// @29: aload_1
		// @2A: getstatic java.lang.String[] game.C_100052_eb.field_104234_z
		// @2D: bipush 8 (0x08)
		// @2F: aaload
		// @30: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @33: athrow
		// @34: return
	}
	
	static
	{
		// @00: bipush 9 (0x09)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "8t~\u0001F8d1\u001c]/>y"
		// @09: invokestatic game.C_100052_eb.func_104225_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100052_eb.func_104224_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "8t~)\u001a"
		// @14: invokestatic game.C_100052_eb.func_104225_z(java.lang.String)char[]
		// @17: invokestatic game.C_100052_eb.func_104224_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "8t~+\u001a"
		// @1F: invokestatic game.C_100052_eb.func_104225_z(java.lang.String)char[]
		// @22: invokestatic game.C_100052_eb.func_104224_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "&8~FO"
		// @2A: invokestatic game.C_100052_eb.func_104225_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100052_eb.func_104224_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "8t~-\u001a"
		// @35: invokestatic game.C_100052_eb.func_104225_z(java.lang.String)char[]
		// @38: invokestatic game.C_100052_eb.func_104224_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "3c<\u0004"
		// @40: invokestatic game.C_100052_eb.func_104225_z(java.lang.String)char[]
		// @43: invokestatic game.C_100052_eb.func_104224_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "8t~*\u001a"
		// @4C: invokestatic game.C_100052_eb.func_104225_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100052_eb.func_104224_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "8t~,\u001a"
		// @58: invokestatic game.C_100052_eb.func_104225_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100052_eb.func_104224_z(char[])java.lang.String
		// @5E: aastore
		// @5F: dup
		// @60: bipush 8 (0x08)
		// @62: ldc "8t~T[3\u007f$V\u001at"
		// @64: invokestatic game.C_100052_eb.func_104225_z(java.lang.String)char[]
		// @67: invokestatic game.C_100052_eb.func_104224_z(char[])java.lang.String
		// @6A: aastore
		// @6B: putstatic java.lang.String[] game.C_100052_eb.field_104234_z
		// @6E: ldc "\u001ey>\u0006W>b9\u0007\\}d5\u001bF2d5\u000c\u001c"
		// @70: invokestatic game.C_100052_eb.func_104225_z(java.lang.String)char[]
		// @73: invokestatic game.C_100052_eb.func_104224_z(char[])java.lang.String
		// @76: putstatic java.lang.String game.C_100052_eb.field_104229_d
		// @79: new game.C_100006_fj
		// @7C: dup
		// @7D: invokespecial game.C_100006_fj.<init>()void
		// @80: putstatic game.C_100006_fj game.C_100052_eb.field_104233_a
		// @83: return
	}
	
	private static char[] func_104225_z(String arg0)
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
		// @0E: bipush 50 (0x32)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_104224_z(char[] arg0)
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
		// @30: bipush 93 (0x5D)
		// @32: goto @46
		// @35: bipush 22 (0x16)
		// @37: goto @46
		// @3A: bipush 80 (0x50)
		// @3C: goto @46
		// @3F: bipush 104 (0x68)
		// @41: goto @46
		// @44: bipush 50 (0x32)
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
