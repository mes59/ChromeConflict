package game;

final class C_100142_bk
{
	static boolean field_105090_a;
	static int field_105088_b;
	static String field_105084_f;
	static int field_105089_c;
	static int field_105087_e;
	static String field_105085_g;
	static String field_105086_d;
	private static final String[] field_105091_z;
	
	static final void func_105083_b(byte arg0)
	{
		// @00: sipush -16966 (0xBDBA)
		// @03: invokestatic game.C_100155_dc.func_105344_a(int)game.C_100233_oa
		// @06: putstatic game.C_100233_oa game.C_100043_vl.field_101945_cc
		// @09: new game.C_100029_gn
		// @0C: dup
		// @0D: invokespecial game.C_100029_gn.<init>()void
		// @10: putstatic game.C_100029_gn game.C_100085_a.field_102576_K
		// @13: iload_0
		// @14: bipush 97 (0x61)
		// @16: if_icmpeq @1A
		// @19: return
		// @1A: iconst_1
		// @1B: iconst_1
		// @1C: bipush -116 (0x8C)
		// @1E: invokestatic game.C_100236_on.func_100894_a(boolean, boolean, byte)void
		// @21: goto @45
		// @24: astore_1
		// @25: aload_1
		// @26: new java.lang.StringBuilder
		// @29: dup
		// @2A: invokespecial java.lang.StringBuilder.<init>()void
		// @2D: getstatic java.lang.String[] game.C_100142_bk.field_105091_z
		// @30: iconst_5
		// @31: aaload
		// @32: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @35: iload_0
		// @36: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @39: bipush 41 (0x29)
		// @3B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @41: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @44: athrow
		// @45: return
	}
	
	static final void func_105079_a(byte arg0)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore_3
		// @04: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @07: astore_1
		// @08: iload_0
		// @09: bipush -46 (0xD2)
		// @0B: if_icmpeq @18
		// @0E: bipush 57 (0x39)
		// @10: invokestatic game.C_100142_bk.func_105076_a(int)game.C_100026_hb
		// @13: pop
		// @14: goto @18
		// @17: athrow
		// @18: iconst_0
		// @19: invokestatic game.C_100033_gj.func_101899_m(int)boolean
		// @1C: ifeq @57
		// @1F: aload_1
		// @20: bipush 8 (0x08)
		// @22: bipush 116 (0x74)
		// @24: invokevirtual game.C_100278_nd.func_101189_h(int, int)void
		// @27: aload_1
		// @28: dup
		// @29: getfield int game.C_100278_nd.field_101177_n
		// @2C: iconst_1
		// @2D: iadd
		// @2E: dup_x1
		// @2F: putfield int game.C_100278_nd.field_101177_n
		// @32: istore_2
		// @33: iload_0
		// @34: sipush 30827 (0x786B)
		// @37: iadd
		// @38: aload_1
		// @39: invokestatic game.C_100272_mn.func_102422_a(int, game.C_100278_nd)void
		// @3C: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @3F: iload_2
		// @40: ineg
		// @41: aload_1
		// @42: getfield int game.C_100278_nd.field_101177_n
		// @45: iadd
		// @46: bipush -118 (0x8A)
		// @48: invokevirtual game.C_100278_nd.func_101139_c(int, byte)void
		// @4B: iload_3
		// @4C: ifne @7C
		// @4F: iload_3
		// @50: ifeq @18
		// @53: goto @57
		// @56: athrow
		// @57: goto @7C
		// @5A: astore_1
		// @5B: aload_1
		// @5C: new java.lang.StringBuilder
		// @5F: dup
		// @60: invokespecial java.lang.StringBuilder.<init>()void
		// @63: getstatic java.lang.String[] game.C_100142_bk.field_105091_z
		// @66: bipush 7 (0x07)
		// @68: aaload
		// @69: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @6C: iload_0
		// @6D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @70: bipush 41 (0x29)
		// @72: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @75: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @78: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @7B: athrow
		// @7C: return
	}
	
	static final C_100179_ch func_105081_a(int arg0, boolean arg1, C_100214_al arg2, int arg3)
	{
		// @00: iload_1
		// @01: iconst_1
		// @02: if_icmpeq @0F
		// @05: bipush -92 (0xA4)
		// @07: invokestatic game.C_100142_bk.func_105076_a(int)game.C_100026_hb
		// @0A: pop
		// @0B: goto @0F
		// @0E: athrow
		// @0F: aload_2
		// @10: bipush 100 (0x64)
		// @12: iload_0
		// @13: iload_3
		// @14: invokestatic game.C_100117_p.func_100955_b(game.C_100214_al, int, int, int)game.C_100117_p
		// @17: bipush -104 (0x98)
		// @19: invokestatic game.C_100130_tf.func_104952_a(game.C_100117_p, byte)game.C_100179_ch
		// @1C: areturn
		// @1D: astore #4
		// @1F: aload #4
		// @21: new java.lang.StringBuilder
		// @24: dup
		// @25: invokespecial java.lang.StringBuilder.<init>()void
		// @28: getstatic java.lang.String[] game.C_100142_bk.field_105091_z
		// @2B: iconst_4
		// @2C: aaload
		// @2D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @30: iload_0
		// @31: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @34: bipush 44 (0x2C)
		// @36: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @39: iload_1
		// @3A: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @3D: bipush 44 (0x2C)
		// @3F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @42: aload_2
		// @43: ifnull @4F
		// @46: getstatic java.lang.String[] game.C_100142_bk.field_105091_z
		// @49: iconst_2
		// @4A: aaload
		// @4B: goto @54
		// @4E: athrow
		// @4F: getstatic java.lang.String[] game.C_100142_bk.field_105091_z
		// @52: iconst_3
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
	
	public static void func_105077_b(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100142_bk.field_105086_d
		// @04: aconst_null
		// @05: putstatic java.lang.String game.C_100142_bk.field_105084_f
		// @08: aconst_null
		// @09: putstatic java.lang.String game.C_100142_bk.field_105085_g
		// @0C: iload_0
		// @0D: bipush 23 (0x17)
		// @0F: if_icmpge @19
		// @12: aconst_null
		// @13: checkcast java.lang.String
		// @16: putstatic java.lang.String game.C_100142_bk.field_105084_f
		// @19: goto @3D
		// @1C: astore_1
		// @1D: aload_1
		// @1E: new java.lang.StringBuilder
		// @21: dup
		// @22: invokespecial java.lang.StringBuilder.<init>()void
		// @25: getstatic java.lang.String[] game.C_100142_bk.field_105091_z
		// @28: iconst_0
		// @29: aaload
		// @2A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2D: iload_0
		// @2E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @31: bipush 41 (0x29)
		// @33: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @36: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @39: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3C: athrow
		// @3D: return
	}
	
	static final int[] func_105082_a(int arg0, int arg1, int arg2)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #12
		// @05: sipush 256 (0x0100)
		// @08: newarray int[]
		// @0A: astore_3
		// @0B: iload_1
		// @0C: ldc 16773585 (0xfff1d1)
		// @0E: iand
		// @0F: ldc 1089980432 (0x40f7c810)
		// @11: ishr
		// @12: istore #4
		// @14: iload_2
		// @15: ldc 1199019304 (0x47779528)
		// @17: if_icmpeq @24
		// @1A: bipush -72 (0xB8)
		// @1C: invokestatic game.C_100142_bk.func_105076_a(int)game.C_100026_hb
		// @1F: pop
		// @20: goto @24
		// @23: athrow
		// @24: iload_1
		// @25: ldc -1045306200 (0xc1b1e4a8)
		// @27: ishr
		// @28: sipush 255 (0x00FF)
		// @2B: iand
		// @2C: istore #5
		// @2E: iload_1
		// @2F: sipush 255 (0x00FF)
		// @32: iand
		// @33: istore #6
		// @35: sipush 255 (0x00FF)
		// @38: iload_0
		// @39: ldc 274712400 (0x105fc750)
		// @3B: ishr
		// @3C: iand
		// @3D: istore #7
		// @3F: sipush 255 (0x00FF)
		// @42: iload_0
		// @43: ldc 1006494248 (0x3bfde228)
		// @45: ishr
		// @46: iand
		// @47: istore #8
		// @49: sipush 255 (0x00FF)
		// @4C: iload_0
		// @4D: iand
		// @4E: istore #9
		// @50: iconst_0
		// @51: istore #10
		// @53: iload #10
		// @55: iconst_m1
		// @56: ixor
		// @57: sipush -257 (0xFEFF)
		// @5A: if_icmple @B6
		// @5D: sipush 256 (0x0100)
		// @60: iload #10
		// @62: isub
		// @63: istore #11
		// @65: aload_3
		// @66: iload #12
		// @68: ifne @B7
		// @6B: iload #10
		// @6D: iload #10
		// @6F: iload #6
		// @71: imul
		// @72: ldc -1807715512 (0x94407348)
		// @74: ishr
		// @75: iload #11
		// @77: iload #9
		// @79: imul
		// @7A: ldc 1709458888 (0x65e445c8)
		// @7C: ishr
		// @7D: ineg
		// @7E: isub
		// @7F: iload #11
		// @81: iload #7
		// @83: imul
		// @84: ldc 638584456 (0x26100688)
		// @86: ishr
		// @87: iload #4
		// @89: iload #10
		// @8B: imul
		// @8C: ldc -1147224152 (0xbb9ebfa8)
		// @8E: ishr
		// @8F: iadd
		// @90: ldc -797640368 (0xd074f950)
		// @92: ishl
		// @93: iload #8
		// @95: iload #11
		// @97: imul
		// @98: ldc -305297496 (0xedcd87a8)
		// @9A: ishr
		// @9B: iload #10
		// @9D: iload #5
		// @9F: imul
		// @A0: ldc 1199019304 (0x47779528)
		// @A2: ishr
		// @A3: iadd
		// @A4: ldc -1180510648 (0xb9a2d648)
		// @A6: ishl
		// @A7: iadd
		// @A8: iadd
		// @A9: iastore
		// @AA: iinc #10 +1
		// @AD: iload #12
		// @AF: ifeq @53
		// @B2: goto @B6
		// @B5: athrow
		// @B6: aload_3
		// @B7: areturn
		// @B8: astore_3
		// @B9: aload_3
		// @BA: new java.lang.StringBuilder
		// @BD: dup
		// @BE: invokespecial java.lang.StringBuilder.<init>()void
		// @C1: getstatic java.lang.String[] game.C_100142_bk.field_105091_z
		// @C4: iconst_1
		// @C5: aaload
		// @C6: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @C9: iload_0
		// @CA: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @CD: bipush 44 (0x2C)
		// @CF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D2: iload_1
		// @D3: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @D6: bipush 44 (0x2C)
		// @D8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @DB: iload_2
		// @DC: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @DF: bipush 41 (0x29)
		// @E1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @E4: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @E7: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @EA: athrow
	}
	
	static final C_100026_hb func_105076_a(int arg0)
	{
		// @00: iload_0
		// @01: ldc 1199019304 (0x47779528)
		// @03: if_icmpeq @0F
		// @06: bipush 97 (0x61)
		// @08: invokestatic game.C_100142_bk.func_105083_b(byte)void
		// @0B: goto @0F
		// @0E: athrow
		// @0F: getstatic game.C_100026_hb game.C_100059_df.field_101599_L
		// @12: areturn
		// @13: astore_1
		// @14: aload_1
		// @15: new java.lang.StringBuilder
		// @18: dup
		// @19: invokespecial java.lang.StringBuilder.<init>()void
		// @1C: getstatic java.lang.String[] game.C_100142_bk.field_105091_z
		// @1F: bipush 6 (0x06)
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
	
	static
	{
		// @00: bipush 8 (0x08)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "atw\u0001\u0011"
		// @09: invokestatic game.C_100142_bk.func_105080_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100142_bk.func_105078_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "atw\u0002\u0011"
		// @14: invokestatic game.C_100142_bk.func_105080_z(java.lang.String)char[]
		// @17: invokestatic game.C_100142_bk.func_105078_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "x1wjD"
		// @1F: invokestatic game.C_100142_bk.func_105080_z(java.lang.String)char[]
		// @22: invokestatic game.C_100142_bk.func_105078_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "mj5("
		// @2A: invokestatic game.C_100142_bk.func_105080_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100142_bk.func_105078_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "atw\u0006\u0011"
		// @35: invokestatic game.C_100142_bk.func_105080_z(java.lang.String)char[]
		// @38: invokestatic game.C_100142_bk.func_105078_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "atw\u0005\u0011"
		// @40: invokestatic game.C_100142_bk.func_105080_z(java.lang.String)char[]
		// @43: invokestatic game.C_100142_bk.func_105078_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "atw\u0000\u0011"
		// @4C: invokestatic game.C_100142_bk.func_105080_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100142_bk.func_105078_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "atw\u0007\u0011"
		// @58: invokestatic game.C_100142_bk.func_105080_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100142_bk.func_105078_z(char[])java.lang.String
		// @5E: aastore
		// @5F: putstatic java.lang.String[] game.C_100142_bk.field_105091_z
		// @62: iconst_0
		// @63: putstatic boolean game.C_100142_bk.field_105090_a
		// @66: sipush 500 (0x01F4)
		// @69: putstatic int game.C_100142_bk.field_105089_c
		// @6C: ldc "Ly?"
		// @6E: invokestatic game.C_100142_bk.func_105080_z(java.lang.String)char[]
		// @71: invokestatic game.C_100142_bk.func_105078_z(char[])java.lang.String
		// @74: putstatic java.lang.String game.C_100142_bk.field_105086_d
		// @77: bipush 20 (0x14)
		// @79: putstatic int game.C_100142_bk.field_105088_b
		// @7C: ldc "Bi<6Xdzy6Xwv7#"
		// @7E: invokestatic game.C_100142_bk.func_105080_z(java.lang.String)char[]
		// @81: invokestatic game.C_100142_bk.func_105078_z(char[])java.lang.String
		// @84: putstatic java.lang.String game.C_100142_bk.field_105084_f
		// @87: ldc "Bx<~"
		// @89: invokestatic game.C_100142_bk.func_105080_z(java.lang.String)char[]
		// @8C: invokestatic game.C_100142_bk.func_105078_z(char[])java.lang.String
		// @8F: putstatic java.lang.String game.C_100142_bk.field_105085_g
		// @92: return
	}
	
	private static char[] func_105080_z(String arg0)
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
		// @0E: bipush 57 (0x39)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_105078_z(char[] arg0)
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
		// @10: tableswitch def: @43, for 0: @30, for 1: @34, for 2: @39, for 3: @3E
		// @30: iconst_3
		// @31: goto @45
		// @34: bipush 31 (0x1F)
		// @36: goto @45
		// @39: bipush 89 (0x59)
		// @3B: goto @45
		// @3E: bipush 68 (0x44)
		// @40: goto @45
		// @43: bipush 57 (0x39)
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
