package game;

final class C_100192_rf extends C_100071_va
{
	byte field_101683_K;
	static String field_101677_F;
	static int field_101681_I;
	static C_100153_be[] field_101682_J;
	static boolean field_101680_H;
	int field_101678_G;
	C_100280_nf field_101676_E;
	private static final String[] field_101679_L;
	
	final byte[] func_101649_j(int arg0)
	{
		// @00: aload_0
		// @01: getfield boolean game.C_100192_rf.field_101661_C
		// @04: ifne @26
		// @07: aload_0
		// @08: getfield game.C_100280_nf game.C_100192_rf.field_101676_E
		// @0B: getfield int game.C_100280_nf.field_101177_n
		// @0E: iconst_m1
		// @0F: ixor
		// @10: aload_0
		// @11: getfield game.C_100280_nf game.C_100192_rf.field_101676_E
		// @14: getfield byte[] game.C_100280_nf.field_101179_l
		// @17: arraylength
		// @18: aload_0
		// @19: getfield byte game.C_100192_rf.field_101683_K
		// @1C: isub
		// @1D: iconst_m1
		// @1E: ixor
		// @1F: if_icmple @2F
		// @22: goto @26
		// @25: athrow
		// @26: new java.lang.RuntimeException
		// @29: dup
		// @2A: invokespecial java.lang.RuntimeException.<init>()void
		// @2D: athrow
		// @2E: athrow
		// @2F: iload_1
		// @30: sipush -20679 (0xAF39)
		// @33: if_icmpeq @40
		// @36: aload_0
		// @37: iconst_1
		// @38: invokevirtual game.C_100192_rf.func_101651_b(boolean)int
		// @3B: pop
		// @3C: goto @40
		// @3F: athrow
		// @40: aload_0
		// @41: getfield game.C_100280_nf game.C_100192_rf.field_101676_E
		// @44: getfield byte[] game.C_100280_nf.field_101179_l
		// @47: areturn
		// @48: astore_2
		// @49: aload_2
		// @4A: new java.lang.StringBuilder
		// @4D: dup
		// @4E: invokespecial java.lang.StringBuilder.<init>()void
		// @51: getstatic java.lang.String[] game.C_100192_rf.field_101679_L
		// @54: iconst_2
		// @55: aaload
		// @56: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @59: iload_1
		// @5A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5D: bipush 41 (0x29)
		// @5F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @62: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @65: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @68: athrow
	}
	
	public static void func_101671_l(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100192_rf.field_101677_F
		// @04: iload_0
		// @05: sipush 16269 (0x3F8D)
		// @08: if_icmpeq @0C
		// @0B: return
		// @0C: aconst_null
		// @0D: putstatic game.C_100153_be[] game.C_100192_rf.field_101682_J
		// @10: goto @35
		// @13: astore_1
		// @14: aload_1
		// @15: new java.lang.StringBuilder
		// @18: dup
		// @19: invokespecial java.lang.StringBuilder.<init>()void
		// @1C: getstatic java.lang.String[] game.C_100192_rf.field_101679_L
		// @1F: bipush 8 (0x08)
		// @21: aaload
		// @22: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @25: iload_0
		// @26: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @29: bipush 41 (0x29)
		// @2B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @31: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @34: athrow
		// @35: return
	}
	
	static final String func_101672_a(String arg0, int arg1, int arg2, C_100112_r arg3)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #5
		// @05: aconst_null
		// @06: aload_0
		// @07: if_acmpeq @1B
		// @0A: aload_3
		// @0B: aload_0
		// @0C: invokevirtual game.C_100112_r.func_101739_b(java.lang.String)int
		// @0F: iload_1
		// @10: if_icmple @1B
		// @13: goto @17
		// @16: athrow
		// @17: goto @1D
		// @1A: athrow
		// @1B: aload_0
		// @1C: areturn
		// @1D: iload_2
		// @1E: sipush -3598 (0xF1F2)
		// @21: if_icmpeq @29
		// @24: aconst_null
		// @25: checkcast java.lang.String
		// @28: areturn
		// @29: aload_0
		// @2A: invokevirtual java.lang.String.length()int
		// @2D: ifle @6F
		// @30: aload_0
		// @31: iconst_0
		// @32: aload_0
		// @33: invokevirtual java.lang.String.length()int
		// @36: iconst_m1
		// @37: iadd
		// @38: invokevirtual java.lang.String.substring(int, int)java.lang.String
		// @3B: astore_0
		// @3C: new java.lang.StringBuilder
		// @3F: dup
		// @40: invokespecial java.lang.StringBuilder.<init>()void
		// @43: aload_0
		// @44: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @47: getstatic java.lang.String[] game.C_100192_rf.field_101679_L
		// @4A: iconst_5
		// @4B: aaload
		// @4C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @52: iload #5
		// @54: ifne @70
		// @57: astore #4
		// @59: aload_3
		// @5A: aload #4
		// @5C: invokevirtual game.C_100112_r.func_101739_b(java.lang.String)int
		// @5F: iload_1
		// @60: if_icmple @67
		// @63: goto @6A
		// @66: athrow
		// @67: aload #4
		// @69: areturn
		// @6A: iload #5
		// @6C: ifeq @29
		// @6F: aload_0
		// @70: areturn
		// @71: astore #4
		// @73: aload #4
		// @75: new java.lang.StringBuilder
		// @78: dup
		// @79: invokespecial java.lang.StringBuilder.<init>()void
		// @7C: getstatic java.lang.String[] game.C_100192_rf.field_101679_L
		// @7F: bipush 6 (0x06)
		// @81: aaload
		// @82: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @85: aload_0
		// @86: ifnull @92
		// @89: getstatic java.lang.String[] game.C_100192_rf.field_101679_L
		// @8C: iconst_3
		// @8D: aaload
		// @8E: goto @97
		// @91: athrow
		// @92: getstatic java.lang.String[] game.C_100192_rf.field_101679_L
		// @95: iconst_4
		// @96: aaload
		// @97: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @9A: bipush 44 (0x2C)
		// @9C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9F: iload_1
		// @A0: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A3: bipush 44 (0x2C)
		// @A5: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A8: iload_2
		// @A9: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @AC: bipush 44 (0x2C)
		// @AE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B1: aload_3
		// @B2: ifnull @BE
		// @B5: getstatic java.lang.String[] game.C_100192_rf.field_101679_L
		// @B8: iconst_3
		// @B9: aaload
		// @BA: goto @C3
		// @BD: athrow
		// @BE: getstatic java.lang.String[] game.C_100192_rf.field_101679_L
		// @C1: iconst_4
		// @C2: aaload
		// @C3: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @C6: bipush 41 (0x29)
		// @C8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @CB: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @CE: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @D1: athrow
	}
	
	static final void func_101673_d(byte arg0)
	{
		// @00: sipush -640 (0xFD80)
		// @03: getstatic int game.C_100260_mc.field_102234_jc
		// @06: iadd
		// @07: iconst_2
		// @08: idiv
		// @09: istore_1
		// @0A: getstatic int game.C_100239_oi.field_102312_P
		// @0D: getstatic int game.C_100239_oi.field_102312_P
		// @10: imul
		// @11: istore_2
		// @12: getstatic int game.C_100015_wh.field_103782_d
		// @15: getstatic int game.C_100015_wh.field_103782_d
		// @18: imul
		// @19: ineg
		// @1A: iload_2
		// @1B: iadd
		// @1C: istore_3
		// @1D: getstatic game.C_100302_ka game.C_100231_oc.field_102208_bc
		// @20: iload_1
		// @21: iload_3
		// @22: sipush 199 (0x00C7)
		// @25: imul
		// @26: iload_2
		// @27: idiv
		// @28: isub
		// @29: bipush -90 (0xA6)
		// @2B: bipush -4 (0xFC)
		// @2D: bipush -120 (0x88)
		// @2F: getstatic int game.C_100196_rb.field_105821_c
		// @32: iadd
		// @33: iadd
		// @34: iadd
		// @35: iconst_m1
		// @36: bipush 90 (0x5A)
		// @38: sipush 199 (0x00C7)
		// @3B: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @3E: iload_0
		// @3F: bipush 74 (0x4A)
		// @41: if_icmpge @4D
		// @44: bipush -112 (0x90)
		// @46: invokestatic game.C_100192_rf.func_101671_l(int)void
		// @49: goto @4D
		// @4C: athrow
		// @4D: getstatic game.C_100302_ka game.C_100081_ue.field_100676_j
		// @50: iload_3
		// @51: sipush 438 (0x01B6)
		// @54: imul
		// @55: iload_2
		// @56: idiv
		// @57: iload_1
		// @58: iadd
		// @59: sipush -202 (0xFF36)
		// @5C: isub
		// @5D: bipush -4 (0xFC)
		// @5F: getstatic int game.C_100196_rb.field_105821_c
		// @62: bipush 120 (0x78)
		// @64: isub
		// @65: iadd
		// @66: iconst_m1
		// @67: iconst_0
		// @68: sipush 438 (0x01B6)
		// @6B: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @6E: goto @92
		// @71: astore_1
		// @72: aload_1
		// @73: new java.lang.StringBuilder
		// @76: dup
		// @77: invokespecial java.lang.StringBuilder.<init>()void
		// @7A: getstatic java.lang.String[] game.C_100192_rf.field_101679_L
		// @7D: iconst_1
		// @7E: aaload
		// @7F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @82: iload_0
		// @83: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @86: bipush 41 (0x29)
		// @88: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @8E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @91: athrow
		// @92: return
	}
	
	final int func_101651_b(boolean arg0)
	{
		// @00: iload_1
		// @01: ifeq @07
		// @04: bipush 32 (0x20)
		// @06: ireturn
		// @07: aconst_null
		// @08: aload_0
		// @09: getfield game.C_100280_nf game.C_100192_rf.field_101676_E
		// @0C: if_acmpeq @13
		// @0F: goto @15
		// @12: athrow
		// @13: iconst_0
		// @14: ireturn
		// @15: bipush 100 (0x64)
		// @17: aload_0
		// @18: getfield game.C_100280_nf game.C_100192_rf.field_101676_E
		// @1B: getfield int game.C_100280_nf.field_101177_n
		// @1E: imul
		// @1F: aload_0
		// @20: getfield game.C_100280_nf game.C_100192_rf.field_101676_E
		// @23: getfield byte[] game.C_100280_nf.field_101179_l
		// @26: arraylength
		// @27: aload_0
		// @28: getfield byte game.C_100192_rf.field_101683_K
		// @2B: ineg
		// @2C: iadd
		// @2D: idiv
		// @2E: ireturn
		// @2F: astore_2
		// @30: aload_2
		// @31: new java.lang.StringBuilder
		// @34: dup
		// @35: invokespecial java.lang.StringBuilder.<init>()void
		// @38: getstatic java.lang.String[] game.C_100192_rf.field_101679_L
		// @3B: iconst_0
		// @3C: aaload
		// @3D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @40: iload_1
		// @41: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @44: bipush 41 (0x29)
		// @46: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @49: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4F: athrow
	}
	
	static final int[] func_101670_b(int arg0, byte arg1)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #7
		// @005: bipush 93 (0x5D)
		// @007: iload_0
		// @008: invokestatic game.C_100042_we.func_104129_b(int, int)int[]
		// @00B: astore_2
		// @00C: aconst_null
		// @00D: aload_2
		// @00E: if_acmpeq @01F
		// @011: iconst_0
		// @012: aload_2
		// @013: arraylength
		// @014: if_icmpeq @01F
		// @017: goto @01B
		// @01A: athrow
		// @01B: goto @021
		// @01E: athrow
		// @01F: aconst_null
		// @020: areturn
		// @021: bipush 8 (0x08)
		// @023: newarray int[]
		// @025: astore_3
		// @026: aload_2
		// @027: bipush -8 (0xF8)
		// @029: aload_2
		// @02A: arraylength
		// @02B: iadd
		// @02C: aload_3
		// @02D: iconst_0
		// @02E: aload_3
		// @02F: arraylength
		// @030: invokestatic game.C_100120_en.func_104913_a(int[], int, int[], int, int)void
		// @033: iconst_0
		// @034: istore #4
		// @036: iconst_0
		// @037: istore #5
		// @039: aload_3
		// @03A: arraylength
		// @03B: iconst_m1
		// @03C: ixor
		// @03D: iload #5
		// @03F: iconst_m1
		// @040: ixor
		// @041: if_icmpge @095
		// @044: iconst_0
		// @045: iload #7
		// @047: ifne @097
		// @04A: aload_3
		// @04B: iload #5
		// @04D: iaload
		// @04E: if_icmple @059
		// @051: goto @055
		// @054: athrow
		// @055: goto @08D
		// @058: athrow
		// @059: iload #5
		// @05B: iconst_1
		// @05C: iadd
		// @05D: istore #6
		// @05F: aload_3
		// @060: arraylength
		// @061: iconst_m1
		// @062: ixor
		// @063: iload #6
		// @065: iconst_m1
		// @066: ixor
		// @067: if_icmpge @08A
		// @06A: aload_3
		// @06B: iload #5
		// @06D: iaload
		// @06E: aload_3
		// @06F: iload #6
		// @071: iaload
		// @072: iload #7
		// @074: ifne @041
		// @077: if_icmpeq @07D
		// @07A: goto @082
		// @07D: aload_3
		// @07E: iload #6
		// @080: iconst_m1
		// @081: iastore
		// @082: iinc #6 +1
		// @085: iload #7
		// @087: ifeq @05F
		// @08A: iinc #4 +1
		// @08D: iinc #5 +1
		// @090: iload #7
		// @092: ifeq @039
		// @095: iload #4
		// @097: newarray int[]
		// @099: astore #5
		// @09B: iconst_0
		// @09C: istore #4
		// @09E: iconst_0
		// @09F: istore #6
		// @0A1: iload_1
		// @0A2: bipush -81 (0xAF)
		// @0A4: if_icmple @0B0
		// @0A7: bipush 8 (0x08)
		// @0A9: putstatic int game.C_100192_rf.field_101681_I
		// @0AC: goto @0B0
		// @0AF: athrow
		// @0B0: iload #6
		// @0B2: iconst_m1
		// @0B3: ixor
		// @0B4: aload_3
		// @0B5: arraylength
		// @0B6: iconst_m1
		// @0B7: ixor
		// @0B8: if_icmple @0DB
		// @0BB: iconst_m1
		// @0BC: aload_3
		// @0BD: iload #6
		// @0BF: iaload
		// @0C0: if_icmpne @0C7
		// @0C3: goto @0D3
		// @0C6: athrow
		// @0C7: aload #5
		// @0C9: iload #4
		// @0CB: iinc #4 +1
		// @0CE: aload_3
		// @0CF: iload #6
		// @0D1: iaload
		// @0D2: iastore
		// @0D3: iinc #6 +1
		// @0D6: iload #7
		// @0D8: ifeq @0B0
		// @0DB: aload #5
		// @0DD: areturn
		// @0DE: astore_2
		// @0DF: aload_2
		// @0E0: new java.lang.StringBuilder
		// @0E3: dup
		// @0E4: invokespecial java.lang.StringBuilder.<init>()void
		// @0E7: getstatic java.lang.String[] game.C_100192_rf.field_101679_L
		// @0EA: bipush 7 (0x07)
		// @0EC: aaload
		// @0ED: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0F0: iload_0
		// @0F1: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0F4: bipush 44 (0x2C)
		// @0F6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0F9: iload_1
		// @0FA: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0FD: bipush 41 (0x29)
		// @0FF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @102: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @105: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @108: athrow
	}
	
	static
	{
		// @00: bipush 9 (0x09)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "56A0y"
		// @09: invokestatic game.C_100192_rf.func_101675_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100192_rf.func_101674_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "56A?y"
		// @14: invokestatic game.C_100192_rf.func_101675_z(java.lang.String)char[]
		// @17: invokestatic game.C_100192_rf.func_101674_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "56A5y"
		// @1F: invokestatic game.C_100192_rf.func_101675_z(java.lang.String)char[]
		// @22: invokestatic game.C_100192_rf.func_101674_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "<~AX,"
		// @2A: invokestatic game.C_100192_rf.func_101675_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100192_rf.func_101674_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc ")%\u0003\u001a"
		// @35: invokestatic game.C_100192_rf.func_101675_z(java.lang.String)char[]
		// @38: invokestatic game.C_100192_rf.func_101674_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "i~A"
		// @40: invokestatic game.C_100192_rf.func_101675_z(java.lang.String)char[]
		// @43: invokestatic game.C_100192_rf.func_101674_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "56A$y"
		// @4C: invokestatic game.C_100192_rf.func_101675_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100192_rf.func_101674_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "56A%y"
		// @58: invokestatic game.C_100192_rf.func_101675_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100192_rf.func_101674_z(char[])java.lang.String
		// @5E: aastore
		// @5F: dup
		// @60: bipush 8 (0x08)
		// @62: ldc "56A'y"
		// @64: invokestatic game.C_100192_rf.func_101675_z(java.lang.String)char[]
		// @67: invokestatic game.C_100192_rf.func_101674_z(char[])java.lang.String
		// @6A: aastore
		// @6B: putstatic java.lang.String[] game.C_100192_rf.field_101679_L
		// @6E: ldc "\u0001%\u0003\u001a\"$\"\n\u0013?g=\u0000\u00124g'\u000e\u0005q$1\u0001\u00154+<\n\u0012q&6\u001b\u0013#g1O\u00124+1\u0016V>!p^Fq45\u000c\u0019?##AV\u0018!p\u0016\u0019$g'\n\u00044g%\u0001\u00173+5O\u0002>g1\u000c\u001547$O\u0010$+<\u001c\u0015#\"5\u0001V<(4\nV52\"\u0006\u00186g$\u0007\u001f\"g$\u0006\u001b4kp\u001b\u001e455O\u001b0>p\r\u0013q&p\u001f\u0004>%<\n\u001bq09\u001b\u001eq>?\u001a\u0004q$?\u0001\u00108 %\u001d\u0017%.?\u0001Xq\u001e?\u001aV2(%\u0003\u0012q3\"\u0016V#\"#\u001b\u0017#39\u0001\u0011q>?\u001a\u0004q%\"\u0000\u0001\"\"\"O\u0017?#p\u001b\u0004(.>\u0008V0 1\u0006\u0018\u007f"
		// @70: invokestatic game.C_100192_rf.func_101675_z(java.lang.String)char[]
		// @73: invokestatic game.C_100192_rf.func_101674_z(char[])java.lang.String
		// @76: putstatic java.lang.String game.C_100192_rf.field_101677_F
		// @79: sipush 2048 (0x0800)
		// @7C: putstatic int game.C_100192_rf.field_101681_I
		// @7F: return
	}
	
	private static char[] func_101675_z(String arg0)
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
		// @0E: bipush 81 (0x51)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_101674_z(char[] arg0)
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
		// @30: bipush 71 (0x47)
		// @32: goto @46
		// @35: bipush 80 (0x50)
		// @37: goto @46
		// @3A: bipush 111 (0x6F)
		// @3C: goto @46
		// @3F: bipush 118 (0x76)
		// @41: goto @46
		// @44: bipush 81 (0x51)
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
