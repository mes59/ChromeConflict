package game;

final class C_100306_kn
{
	static int[][] field_107131_d;
	static String[] field_107133_b;
	int[] field_107130_g;
	int field_107135_a;
	static String field_107141_h;
	static int field_107140_k;
	static C_100186_rl field_107142_i;
	static String field_107134_c;
	static String field_107137_l;
	static String field_107136_n;
	int field_107129_f;
	static String field_107138_m;
	static C_100037_wb field_107132_e;
	static String field_107139_j;
	private static final String[] field_107143_z;
	
	static final void func_107128_a(int arg0, byte arg1)
	{
		// @00: iload_1
		// @01: bipush -74 (0xB6)
		// @03: if_icmplt @11
		// @06: bipush 121 (0x79)
		// @08: bipush 44 (0x2C)
		// @0A: invokestatic game.C_100306_kn.func_107128_a(int, byte)void
		// @0D: goto @11
		// @10: athrow
		// @11: aconst_null
		// @12: getstatic game.C_100286_nl game.C_100318_hj.field_107194_f
		// @15: if_acmpeq @2E
		// @18: iconst_0
		// @19: iload_0
		// @1A: if_icmpgt @36
		// @1D: goto @21
		// @20: athrow
		// @21: getstatic game.C_100268_mk game.C_100046_vk.field_102763_sb
		// @24: getstatic game.C_100268_mk game.C_100066_dl.field_101642_t
		// @27: if_acmpeq @36
		// @2A: goto @2E
		// @2D: athrow
		// @2E: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @31: iconst_0
		// @32: putfield int game.C_100278_nd.field_101177_n
		// @35: return
		// @36: iconst_m1
		// @37: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @3A: getfield int game.C_100278_nd.field_101177_n
		// @3D: iconst_m1
		// @3E: ixor
		// @3F: if_icmpne @63
		// @42: bipush -68 (0xBC)
		// @44: invokestatic game.C_100198_qn.func_105828_a(byte)long
		// @47: getstatic long game.C_100174_sb.field_105606_f
		// @4A: ldc2_w -10000
		// @4D: lsub
		// @4E: lcmp
		// @4F: ifgt @5A
		// @52: goto @56
		// @55: athrow
		// @56: goto @63
		// @59: athrow
		// @5A: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @5D: iload_0
		// @5E: bipush 110 (0x6E)
		// @60: invokevirtual game.C_100278_nd.func_101189_h(int, int)void
		// @63: iconst_0
		// @64: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @67: getfield int game.C_100278_nd.field_101177_n
		// @6A: if_icmplt @71
		// @6D: goto @9F
		// @70: athrow
		// @71: getstatic game.C_100286_nl game.C_100318_hj.field_107194_f
		// @74: bipush 110 (0x6E)
		// @76: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @79: getfield byte[] game.C_100278_nd.field_101179_l
		// @7C: iconst_0
		// @7D: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @80: getfield int game.C_100278_nd.field_101177_n
		// @83: invokevirtual game.C_100286_nl.func_106798_a(int, byte[], int, int)void
		// @86: bipush -51 (0xCD)
		// @88: invokestatic game.C_100198_qn.func_105828_a(byte)long
		// @8B: putstatic long game.C_100174_sb.field_105606_f
		// @8E: goto @98
		// @91: astore_2
		// @92: sipush 13313 (0x3401)
		// @95: invokestatic game.C_100095_fe.func_103371_l(int)void
		// @98: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @9B: iconst_0
		// @9C: putfield int game.C_100278_nd.field_101177_n
		// @9F: goto @CD
		// @A2: astore_2
		// @A3: aload_2
		// @A4: new java.lang.StringBuilder
		// @A7: dup
		// @A8: invokespecial java.lang.StringBuilder.<init>()void
		// @AB: getstatic java.lang.String[] game.C_100306_kn.field_107143_z
		// @AE: bipush 6 (0x06)
		// @B0: aaload
		// @B1: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @B4: iload_0
		// @B5: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @B8: bipush 44 (0x2C)
		// @BA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @BD: iload_1
		// @BE: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @C1: bipush 41 (0x29)
		// @C3: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C6: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @C9: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @CC: athrow
		// @CD: return
	}
	
	public static void func_107123_b(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100306_kn.field_107136_n
		// @04: aconst_null
		// @05: putstatic java.lang.String game.C_100306_kn.field_107137_l
		// @08: aconst_null
		// @09: putstatic java.lang.String game.C_100306_kn.field_107139_j
		// @0C: aconst_null
		// @0D: putstatic game.C_100186_rl game.C_100306_kn.field_107142_i
		// @10: aconst_null
		// @11: putstatic java.lang.String game.C_100306_kn.field_107134_c
		// @14: aconst_null
		// @15: putstatic java.lang.String[] game.C_100306_kn.field_107133_b
		// @18: aconst_null
		// @19: putstatic java.lang.String game.C_100306_kn.field_107141_h
		// @1C: aconst_null
		// @1D: putstatic game.C_100037_wb game.C_100306_kn.field_107132_e
		// @20: aconst_null
		// @21: putstatic java.lang.String game.C_100306_kn.field_107138_m
		// @24: aconst_null
		// @25: checkcast int[][]
		// @28: putstatic int[][] game.C_100306_kn.field_107131_d
		// @2B: iconst_3
		// @2C: iload_0
		// @2D: bipush -46 (0xD2)
		// @2F: isub
		// @30: bipush 52 (0x34)
		// @32: idiv
		// @33: irem
		// @34: istore_1
		// @35: goto @5A
		// @38: astore_1
		// @39: aload_1
		// @3A: new java.lang.StringBuilder
		// @3D: dup
		// @3E: invokespecial java.lang.StringBuilder.<init>()void
		// @41: getstatic java.lang.String[] game.C_100306_kn.field_107143_z
		// @44: bipush 7 (0x07)
		// @46: aaload
		// @47: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4A: iload_0
		// @4B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4E: bipush 41 (0x29)
		// @50: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @53: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @56: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @59: athrow
		// @5A: return
	}
	
	final int func_107126_a(int arg0)
	{
		// @00: iload_1
		// @01: bipush -5 (0xFB)
		// @03: if_icmple @11
		// @06: aconst_null
		// @07: checkcast java.lang.String
		// @0A: putstatic java.lang.String game.C_100306_kn.field_107138_m
		// @0D: goto @11
		// @10: athrow
		// @11: aload_0
		// @12: getfield int[] game.C_100306_kn.field_107130_g
		// @15: ifnull @27
		// @18: iconst_m1
		// @19: aload_0
		// @1A: getfield int[] game.C_100306_kn.field_107130_g
		// @1D: arraylength
		// @1E: iconst_m1
		// @1F: ixor
		// @20: if_icmpne @2C
		// @23: goto @27
		// @26: athrow
		// @27: iconst_0
		// @28: goto @38
		// @2B: athrow
		// @2C: aload_0
		// @2D: getfield int[] game.C_100306_kn.field_107130_g
		// @30: aload_0
		// @31: getfield int[] game.C_100306_kn.field_107130_g
		// @34: arraylength
		// @35: iconst_m1
		// @36: iadd
		// @37: iaload
		// @38: ireturn
		// @39: astore_2
		// @3A: aload_2
		// @3B: new java.lang.StringBuilder
		// @3E: dup
		// @3F: invokespecial java.lang.StringBuilder.<init>()void
		// @42: getstatic java.lang.String[] game.C_100306_kn.field_107143_z
		// @45: iconst_5
		// @46: aaload
		// @47: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4A: iload_1
		// @4B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4E: bipush 41 (0x29)
		// @50: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @53: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @56: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @59: athrow
	}
	
	static final int func_107122_a(int[] arg0, C_100327_ib arg1, int arg2)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #6
		// @005: iload_2
		// @006: bipush -114 (0x8E)
		// @008: if_icmplt @014
		// @00B: bipush 75 (0x4B)
		// @00D: invokestatic game.C_100306_kn.func_107123_b(int)void
		// @010: goto @014
		// @013: athrow
		// @014: iconst_0
		// @015: istore_3
		// @016: aload_1
		// @017: sipush -3099 (0xF3E5)
		// @01A: invokevirtual game.C_100327_ib.func_102460_q(int)int
		// @01D: istore #4
		// @01F: iconst_0
		// @020: istore #5
		// @022: iload #4
		// @024: iload #5
		// @026: if_icmple @0A6
		// @029: aload_0
		// @02A: iload #5
		// @02C: iaload
		// @02D: iload #6
		// @02F: ifne @0AA
		// @032: ifeq @03C
		// @035: goto @039
		// @038: athrow
		// @039: goto @03F
		// @03C: iinc #3 +1
		// @03F: aload_0
		// @040: iload #5
		// @042: iaload
		// @043: iconst_1
		// @044: if_icmpne @04E
		// @047: iinc #3 +2
		// @04A: goto @04E
		// @04D: athrow
		// @04E: aload_0
		// @04F: iload #5
		// @051: iaload
		// @052: iconst_2
		// @053: if_icmpeq @05A
		// @056: goto @05D
		// @059: athrow
		// @05A: iinc #3 +3
		// @05D: iconst_3
		// @05E: aload_0
		// @05F: iload #5
		// @061: iaload
		// @062: if_icmpeq @069
		// @065: goto @06C
		// @068: athrow
		// @069: iinc #3 +4
		// @06C: aload_0
		// @06D: iload #5
		// @06F: iaload
		// @070: iconst_m1
		// @071: ixor
		// @072: bipush -5 (0xFB)
		// @074: if_icmpne @07E
		// @077: iinc #3 +5
		// @07A: goto @07E
		// @07D: athrow
		// @07E: bipush 20 (0x14)
		// @080: aload_0
		// @081: iload #5
		// @083: iaload
		// @084: if_icmpne @08E
		// @087: iinc #3 +10
		// @08A: goto @08E
		// @08D: athrow
		// @08E: aload_0
		// @08F: iload #5
		// @091: iaload
		// @092: bipush 34 (0x22)
		// @094: if_icmpne @09E
		// @097: iinc #3 +25
		// @09A: goto @09E
		// @09D: athrow
		// @09E: iinc #5 +1
		// @0A1: iload #6
		// @0A3: ifeq @022
		// @0A6: iinc #3 +1
		// @0A9: iload_3
		// @0AA: ireturn
		// @0AB: astore_3
		// @0AC: aload_3
		// @0AD: new java.lang.StringBuilder
		// @0B0: dup
		// @0B1: invokespecial java.lang.StringBuilder.<init>()void
		// @0B4: getstatic java.lang.String[] game.C_100306_kn.field_107143_z
		// @0B7: iconst_1
		// @0B8: aaload
		// @0B9: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0BC: aload_0
		// @0BD: ifnull @0C9
		// @0C0: getstatic java.lang.String[] game.C_100306_kn.field_107143_z
		// @0C3: iconst_0
		// @0C4: aaload
		// @0C5: goto @0CE
		// @0C8: athrow
		// @0C9: getstatic java.lang.String[] game.C_100306_kn.field_107143_z
		// @0CC: iconst_2
		// @0CD: aaload
		// @0CE: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0D1: bipush 44 (0x2C)
		// @0D3: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0D6: aload_1
		// @0D7: ifnull @0E3
		// @0DA: getstatic java.lang.String[] game.C_100306_kn.field_107143_z
		// @0DD: iconst_0
		// @0DE: aaload
		// @0DF: goto @0E8
		// @0E2: athrow
		// @0E3: getstatic java.lang.String[] game.C_100306_kn.field_107143_z
		// @0E6: iconst_2
		// @0E7: aaload
		// @0E8: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0EB: bipush 44 (0x2C)
		// @0ED: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0F0: iload_2
		// @0F1: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0F4: bipush 41 (0x29)
		// @0F6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0F9: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @0FC: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @0FF: athrow
	}
	
	final int func_107127_a(boolean arg0, int arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #4
		// @05: aconst_null
		// @06: aload_0
		// @07: getfield int[] game.C_100306_kn.field_107130_g
		// @0A: if_acmpeq @1A
		// @0D: iconst_0
		// @0E: aload_0
		// @0F: getfield int[] game.C_100306_kn.field_107130_g
		// @12: arraylength
		// @13: if_icmpne @1C
		// @16: goto @1A
		// @19: athrow
		// @1A: iconst_0
		// @1B: ireturn
		// @1C: iload_1
		// @1D: ifeq @23
		// @20: bipush 122 (0x7A)
		// @22: ireturn
		// @23: iconst_1
		// @24: istore_3
		// @25: iload_3
		// @26: aload_0
		// @27: getfield int[] game.C_100306_kn.field_107130_g
		// @2A: arraylength
		// @2B: if_icmpge @59
		// @2E: aload_0
		// @2F: getfield int[] game.C_100306_kn.field_107130_g
		// @32: iload_3
		// @33: iaload
		// @34: aload_0
		// @35: getfield int[] game.C_100306_kn.field_107130_g
		// @38: iload_3
		// @39: iconst_1
		// @3A: isub
		// @3B: iaload
		// @3C: iadd
		// @3D: ldc 634988705 (0x25d928a1)
		// @3F: ishr
		// @40: iload_2
		// @41: iload #4
		// @43: ifne @5F
		// @46: if_icmple @51
		// @49: goto @4D
		// @4C: athrow
		// @4D: iconst_m1
		// @4E: iload_3
		// @4F: iadd
		// @50: ireturn
		// @51: iinc #3 +1
		// @54: iload #4
		// @56: ifeq @25
		// @59: aload_0
		// @5A: getfield int[] game.C_100306_kn.field_107130_g
		// @5D: arraylength
		// @5E: iconst_1
		// @5F: isub
		// @60: ireturn
		// @61: astore_3
		// @62: aload_3
		// @63: new java.lang.StringBuilder
		// @66: dup
		// @67: invokespecial java.lang.StringBuilder.<init>()void
		// @6A: getstatic java.lang.String[] game.C_100306_kn.field_107143_z
		// @6D: iconst_3
		// @6E: aaload
		// @6F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @72: iload_1
		// @73: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @76: bipush 44 (0x2C)
		// @78: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7B: iload_2
		// @7C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7F: bipush 41 (0x29)
		// @81: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @84: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @87: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @8A: athrow
	}
	
	C_100306_kn(int arg0, int arg1, int arg2)
	{
		// @00: aload_0
		// @01: invokespecial java.lang.Object.<init>()void
		// @04: aload_0
		// @05: iload_1
		// @06: putfield int game.C_100306_kn.field_107129_f
		// @09: aload_0
		// @0A: iload_3
		// @0B: iconst_1
		// @0C: iadd
		// @0D: newarray int[]
		// @0F: putfield int[] game.C_100306_kn.field_107130_g
		// @12: aload_0
		// @13: iload_2
		// @14: putfield int game.C_100306_kn.field_107135_a
		// @17: goto @4F
		// @1A: astore #4
		// @1C: aload #4
		// @1E: new java.lang.StringBuilder
		// @21: dup
		// @22: invokespecial java.lang.StringBuilder.<init>()void
		// @25: getstatic java.lang.String[] game.C_100306_kn.field_107143_z
		// @28: iconst_4
		// @29: aaload
		// @2A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2D: iload_1
		// @2E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @31: bipush 44 (0x2C)
		// @33: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @36: iload_2
		// @37: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3A: bipush 44 (0x2C)
		// @3C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3F: iload_3
		// @40: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @43: bipush 41 (0x29)
		// @45: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @48: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4E: athrow
		// @4F: return
	}
	
	static
	{
		// @000: bipush 8 (0x08)
		// @002: anewarray java.lang.String
		// @005: dup
		// @006: iconst_0
		// @007: ldc "YB\u000fBW"
		// @009: invokestatic game.C_100306_kn.func_107125_z(java.lang.String)char[]
		// @00C: invokestatic game.C_100306_kn.func_107124_z(char[])java.lang.String
		// @00F: aastore
		// @010: dup
		// @011: iconst_1
		// @012: ldc "I\u0002\u000f)\u0002"
		// @014: invokestatic game.C_100306_kn.func_107125_z(java.lang.String)char[]
		// @017: invokestatic game.C_100306_kn.func_107124_z(char[])java.lang.String
		// @01A: aastore
		// @01B: dup
		// @01C: iconst_2
		// @01D: ldc "L\u0019M\u0000"
		// @01F: invokestatic game.C_100306_kn.func_107125_z(java.lang.String)char[]
		// @022: invokestatic game.C_100306_kn.func_107124_z(char[])java.lang.String
		// @025: aastore
		// @026: dup
		// @027: iconst_3
		// @028: ldc "I\u0002\u000f.\u0002"
		// @02A: invokestatic game.C_100306_kn.func_107125_z(java.lang.String)char[]
		// @02D: invokestatic game.C_100306_kn.func_107124_z(char[])java.lang.String
		// @030: aastore
		// @031: dup
		// @032: iconst_4
		// @033: ldc "I\u0002\u000fPCL\u0005UR\u0002"
		// @035: invokestatic game.C_100306_kn.func_107125_z(java.lang.String)char[]
		// @038: invokestatic game.C_100306_kn.func_107124_z(char[])java.lang.String
		// @03B: aastore
		// @03C: dup
		// @03D: iconst_5
		// @03E: ldc "I\u0002\u000f-\u0002"
		// @040: invokestatic game.C_100306_kn.func_107125_z(java.lang.String)char[]
		// @043: invokestatic game.C_100306_kn.func_107124_z(char[])java.lang.String
		// @046: aastore
		// @047: dup
		// @048: bipush 6 (0x06)
		// @04A: ldc "I\u0002\u000f(\u0002"
		// @04C: invokestatic game.C_100306_kn.func_107125_z(java.lang.String)char[]
		// @04F: invokestatic game.C_100306_kn.func_107124_z(char[])java.lang.String
		// @052: aastore
		// @053: dup
		// @054: bipush 7 (0x07)
		// @056: ldc "I\u0002\u000f/\u0002"
		// @058: invokestatic game.C_100306_kn.func_107125_z(java.lang.String)char[]
		// @05B: invokestatic game.C_100306_kn.func_107124_z(char[])java.lang.String
		// @05E: aastore
		// @05F: putstatic java.lang.String[] game.C_100306_kn.field_107143_z
		// @062: ldc "e\tULKA\u000fD\u001fY\u0002\u0018NLDG\u001b\u0001\u001bOC\u001cN\u0002Y\u0002\u000eXLOZ\u001cD\u0002NK\u0002FLYM\u0000@\u001eCV\t\u0001\u000f_@\tRLELLD\u0002MK\u0002D\tXK\u0002FB\nw\u0002U\u0005F\u0002\u0015N\u0019\nG\u0002F\u0005DG\tSLK\u0002\u001bD\rZM\u0002\rLCVLB\rDL\u0003ULHGLD\u001d_K\u001cQ\tN\u0002\u0003OLK\u0002\u001fD\u0002^K\u0002D\u0000\u0004"
		// @064: invokestatic game.C_100306_kn.func_107125_z(java.lang.String)char[]
		// @067: invokestatic game.C_100306_kn.func_107124_z(char[])java.lang.String
		// @06A: putstatic java.lang.String game.C_100306_kn.field_107134_c
		// @06D: ldc "o\u0003S\t\nQ\u0019F\u000bOQ\u0018H\u0003DQ"
		// @06F: invokestatic game.C_100306_kn.func_107125_z(java.lang.String)char[]
		// @072: invokestatic game.C_100306_kn.func_107124_z(char[])java.lang.String
		// @075: putstatic java.lang.String game.C_100306_kn.field_107137_l
		// @078: iconst_3
		// @079: anewarray int[]
		// @07C: dup
		// @07D: iconst_0
		// @07E: aconst_null
		// @07F: aastore
		// @080: dup
		// @081: iconst_1
		// @082: bipush 10 (0x0A)
		// @084: newarray int[]
		// @086: dup
		// @087: iconst_0
		// @088: sipush 140 (0x008C)
		// @08B: iastore
		// @08C: dup
		// @08D: iconst_1
		// @08E: sipush 200 (0x00C8)
		// @091: iastore
		// @092: dup
		// @093: iconst_2
		// @094: bipush 120 (0x78)
		// @096: iastore
		// @097: dup
		// @098: iconst_3
		// @099: sipush 210 (0x00D2)
		// @09C: iastore
		// @09D: dup
		// @09E: iconst_4
		// @09F: sipush 150 (0x0096)
		// @0A2: iastore
		// @0A3: dup
		// @0A4: iconst_5
		// @0A5: sipush 185 (0x00B9)
		// @0A8: iastore
		// @0A9: dup
		// @0AA: bipush 6 (0x06)
		// @0AC: sipush 270 (0x010E)
		// @0AF: iastore
		// @0B0: dup
		// @0B1: bipush 7 (0x07)
		// @0B3: sipush 180 (0x00B4)
		// @0B6: iastore
		// @0B7: dup
		// @0B8: bipush 8 (0x08)
		// @0BA: sipush 255 (0x00FF)
		// @0BD: iastore
		// @0BE: dup
		// @0BF: bipush 9 (0x09)
		// @0C1: sipush 220 (0x00DC)
		// @0C4: iastore
		// @0C5: aastore
		// @0C6: dup
		// @0C7: iconst_2
		// @0C8: bipush 10 (0x0A)
		// @0CA: newarray int[]
		// @0CC: dup
		// @0CD: iconst_0
		// @0CE: sipush 225 (0x00E1)
		// @0D1: iastore
		// @0D2: dup
		// @0D3: iconst_1
		// @0D4: sipush 325 (0x0145)
		// @0D7: iastore
		// @0D8: dup
		// @0D9: iconst_2
		// @0DA: sipush 200 (0x00C8)
		// @0DD: iastore
		// @0DE: dup
		// @0DF: iconst_3
		// @0E0: sipush 270 (0x010E)
		// @0E3: iastore
		// @0E4: dup
		// @0E5: iconst_4
		// @0E6: sipush 190 (0x00BE)
		// @0E9: iastore
		// @0EA: dup
		// @0EB: iconst_5
		// @0EC: sipush 300 (0x012C)
		// @0EF: iastore
		// @0F0: dup
		// @0F1: bipush 6 (0x06)
		// @0F3: sipush 270 (0x010E)
		// @0F6: iastore
		// @0F7: dup
		// @0F8: bipush 7 (0x07)
		// @0FA: sipush 200 (0x00C8)
		// @0FD: iastore
		// @0FE: dup
		// @0FF: bipush 8 (0x08)
		// @101: sipush 195 (0x00C3)
		// @104: iastore
		// @105: dup
		// @106: bipush 9 (0x09)
		// @108: sipush 320 (0x0140)
		// @10B: iastore
		// @10C: aastore
		// @10D: putstatic int[][] game.C_100306_kn.field_107131_d
		// @110: ldc "O\u0003E\u0019FGV\u001dCIM\u0000\u001f"
		// @112: invokestatic game.C_100306_kn.func_107125_z(java.lang.String)char[]
		// @115: invokestatic game.C_100306_kn.func_107124_z(char[])java.lang.String
		// @118: putstatic java.lang.String game.C_100306_kn.field_107136_n
		// @11B: ldc "v\u0003\u0001\u001eOR\u0003S\u0018\nCLQ\u0000K[\tS@\nP\u0005F\u0004^\u000f\u000fM\u0005IILN\u0002\nV\u0004D\u0005X\u0002\u0002@\u0001O\u0002\rO\u0008\nQ\tM\tIVLU\u0004O\u0002\u0003Q\u0018CM\u0002\u0001\u0018E\u0002\u001eD\u001cEP\u0018\u0001\rHW\u001fDB"
		// @11D: invokestatic game.C_100306_kn.func_107125_z(java.lang.String)char[]
		// @120: invokestatic game.C_100306_kn.func_107124_z(char[])java.lang.String
		// @123: putstatic java.lang.String game.C_100306_kn.field_107138_m
		// @126: new game.C_100186_rl
		// @129: dup
		// @12A: invokespecial game.C_100186_rl.<init>()void
		// @12D: putstatic game.C_100186_rl game.C_100306_kn.field_107142_i
		// @130: ldc "r\u0000D\rYGLV\rCVB\u000fB"
		// @132: invokestatic game.C_100306_kn.func_107125_z(java.lang.String)char[]
		// @135: invokestatic game.C_100306_kn.func_107124_z(char[])java.lang.String
		// @138: putstatic java.lang.String game.C_100306_kn.field_107139_j
		// @13B: return
	}
	
	private static char[] func_107125_z(String arg0)
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
		// @0E: bipush 42 (0x2A)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_107124_z(char[] arg0)
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
		// @30: bipush 34 (0x22)
		// @32: goto @46
		// @35: bipush 108 (0x6C)
		// @37: goto @46
		// @3A: bipush 33 (0x21)
		// @3C: goto @46
		// @3F: bipush 108 (0x6C)
		// @41: goto @46
		// @44: bipush 42 (0x2A)
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
