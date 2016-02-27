package game;

final class C_100161_sd
{
	static String field_105425_d;
	static int field_105427_c;
	static C_100087_n field_105428_a;
	static int field_105426_b;
	private static final String[] field_105429_z;
	
	static final void func_105420_a(C_100115_ej arg0, int arg1, int arg2, int arg3, C_100054_ec arg4, int arg5, byte arg6)
	{
		// @00: iload #6
		// @02: bipush 40 (0x28)
		// @04: if_icmpeq @15
		// @07: aconst_null
		// @08: checkcast java.lang.String
		// @0B: bipush 33 (0x21)
		// @0D: invokestatic game.C_100161_sd.func_105419_a(java.lang.String, int)java.lang.String
		// @10: pop
		// @11: goto @15
		// @14: athrow
		// @15: aload #4
		// @17: getfield java.lang.String game.C_100054_ec.field_101957_hc
		// @1A: iconst_m1
		// @1B: aload #4
		// @1D: getfield long game.C_100054_ec.field_101952_dc
		// @20: bipush -103 (0x99)
		// @22: iconst_m1
		// @23: aconst_null
		// @24: aload #4
		// @26: getfield java.lang.String game.C_100054_ec.field_101964_Ub
		// @29: aload #4
		// @2B: aload_0
		// @2C: invokestatic game.C_100096_un.func_104559_a(java.lang.String, int, long, int, int, int[], java.lang.String, game.C_100302_ka, game.C_100115_ej)void
		// @2F: getstatic game.C_100022_hf game.C_100136_th.field_102623_R
		// @32: iconst_1
		// @33: iconst_0
		// @34: invokevirtual game.C_100022_hf.func_103884_a(boolean, boolean)void
		// @37: getstatic game.C_100022_hf game.C_100136_th.field_102623_R
		// @3A: iconst_0
		// @3B: aconst_null
		// @3C: iconst_1
		// @3D: invokevirtual game.C_100022_hf.func_103883_a(int, int[], boolean)void
		// @40: getstatic game.C_100022_hf game.C_100136_th.field_102623_R
		// @43: bipush 8 (0x08)
		// @45: invokevirtual game.C_100022_hf.func_103875_b(int)void
		// @48: getstatic game.C_100022_hf game.C_100136_th.field_102623_R
		// @4B: astore #7
		// @4D: iload_1
		// @4E: istore #8
		// @50: iload_3
		// @51: istore #9
		// @53: iload_2
		// @54: istore #10
		// @56: iload #5
		// @58: istore #11
		// @5A: aload #7
		// @5C: getfield game.C_100270_mi game.C_100022_hf.field_103903_m
		// @5F: iload #8
		// @61: iload #9
		// @63: iload #11
		// @65: iload #6
		// @67: bipush 109 (0x6D)
		// @69: ixor
		// @6A: iload #10
		// @6C: invokevirtual game.C_100270_mi.func_102261_b(int, int, int, int, int)void
		// @6F: goto @F1
		// @72: astore #7
		// @74: aload #7
		// @76: new java.lang.StringBuilder
		// @79: dup
		// @7A: invokespecial java.lang.StringBuilder.<init>()void
		// @7D: getstatic java.lang.String[] game.C_100161_sd.field_105429_z
		// @80: bipush 7 (0x07)
		// @82: aaload
		// @83: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @86: aload_0
		// @87: ifnull @93
		// @8A: getstatic java.lang.String[] game.C_100161_sd.field_105429_z
		// @8D: iconst_2
		// @8E: aaload
		// @8F: goto @98
		// @92: athrow
		// @93: getstatic java.lang.String[] game.C_100161_sd.field_105429_z
		// @96: iconst_0
		// @97: aaload
		// @98: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @9B: bipush 44 (0x2C)
		// @9D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A0: iload_1
		// @A1: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A4: bipush 44 (0x2C)
		// @A6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A9: iload_2
		// @AA: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @AD: bipush 44 (0x2C)
		// @AF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B2: iload_3
		// @B3: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @B6: bipush 44 (0x2C)
		// @B8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @BB: aload #4
		// @BD: ifnull @C9
		// @C0: getstatic java.lang.String[] game.C_100161_sd.field_105429_z
		// @C3: iconst_2
		// @C4: aaload
		// @C5: goto @CE
		// @C8: athrow
		// @C9: getstatic java.lang.String[] game.C_100161_sd.field_105429_z
		// @CC: iconst_0
		// @CD: aaload
		// @CE: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @D1: bipush 44 (0x2C)
		// @D3: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D6: iload #5
		// @D8: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @DB: bipush 44 (0x2C)
		// @DD: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @E0: iload #6
		// @E2: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @E5: bipush 41 (0x29)
		// @E7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @EA: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @ED: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @F0: athrow
		// @F1: return
	}
	
	static final void func_105422_a(byte arg0)
	{
		// @00: getstatic int game.C_100049_vf.field_104204_n
		// @03: anewarray java.lang.String
		// @06: putstatic java.lang.String[] game.C_100166_sg.field_105467_c
		// @09: getstatic java.lang.String[] game.C_100166_sg.field_105467_c
		// @0C: bipush 7 (0x07)
		// @0E: getstatic java.lang.String game.C_100206_qe.field_105942_a
		// @11: aastore
		// @12: getstatic java.lang.String[] game.C_100166_sg.field_105467_c
		// @15: bipush 13 (0x0D)
		// @17: getstatic java.lang.String game.C_100329_ih.field_107272_a
		// @1A: aastore
		// @1B: getstatic java.lang.String[] game.C_100166_sg.field_105467_c
		// @1E: bipush 9 (0x09)
		// @20: getstatic java.lang.String game.C_100207_qh.field_102884_Z
		// @23: aastore
		// @24: getstatic java.lang.String[] game.C_100166_sg.field_105467_c
		// @27: iconst_5
		// @28: getstatic java.lang.String game.C_100152_bd.field_105204_n
		// @2B: aastore
		// @2C: getstatic java.lang.String[] game.C_100166_sg.field_105467_c
		// @2F: iload_0
		// @30: getstatic java.lang.String game.C_100222_aa.field_106091_i
		// @33: aastore
		// @34: getstatic java.lang.String[] game.C_100166_sg.field_105467_c
		// @37: bipush 6 (0x06)
		// @39: getstatic java.lang.String game.C_100170_cm.field_105538_d
		// @3C: aastore
		// @3D: getstatic java.lang.String[] game.C_100166_sg.field_105467_c
		// @40: bipush 21 (0x15)
		// @42: getstatic java.lang.String game.C_100340_je.field_102982_j
		// @45: aastore
		// @46: getstatic java.lang.String[] game.C_100166_sg.field_105467_c
		// @49: iconst_4
		// @4A: getstatic java.lang.String game.C_100330_ig.field_107289_a
		// @4D: aastore
		// @4E: getstatic java.lang.String[] game.C_100166_sg.field_105467_c
		// @51: bipush 18 (0x12)
		// @53: getstatic java.lang.String game.C_100327_ib.field_102493_Q
		// @56: aastore
		// @57: getstatic java.lang.String[] game.C_100166_sg.field_105467_c
		// @5A: bipush 16 (0x10)
		// @5C: getstatic java.lang.String game.C_100107_u.field_104773_b
		// @5F: aastore
		// @60: getstatic java.lang.String[] game.C_100166_sg.field_105467_c
		// @63: bipush 19 (0x13)
		// @65: getstatic java.lang.String game.C_100265_mh.field_106613_g
		// @68: aastore
		// @69: getstatic java.lang.String[] game.C_100166_sg.field_105467_c
		// @6C: bipush 20 (0x14)
		// @6E: getstatic java.lang.String game.C_100132_td.field_104977_n
		// @71: aastore
		// @72: getstatic java.lang.String[] game.C_100166_sg.field_105467_c
		// @75: bipush 11 (0x0B)
		// @77: getstatic java.lang.String game.C_100264_mg.field_106521_e
		// @7A: aastore
		// @7B: getstatic java.lang.String[] game.C_100166_sg.field_105467_c
		// @7E: bipush 15 (0x0F)
		// @80: getstatic java.lang.String game.C_100130_tf.field_104963_a
		// @83: aastore
		// @84: goto @A8
		// @87: astore_1
		// @88: aload_1
		// @89: new java.lang.StringBuilder
		// @8C: dup
		// @8D: invokespecial java.lang.StringBuilder.<init>()void
		// @90: getstatic java.lang.String[] game.C_100161_sd.field_105429_z
		// @93: iconst_5
		// @94: aaload
		// @95: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @98: iload_0
		// @99: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @9C: bipush 41 (0x29)
		// @9E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A1: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @A4: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @A7: athrow
		// @A8: return
	}
	
	public static void func_105424_b(byte arg0)
	{
		// @00: iload_0
		// @01: bipush -19 (0xED)
		// @03: if_icmpeq @07
		// @06: return
		// @07: aconst_null
		// @08: putstatic game.C_100087_n game.C_100161_sd.field_105428_a
		// @0B: aconst_null
		// @0C: putstatic java.lang.String game.C_100161_sd.field_105425_d
		// @0F: goto @34
		// @12: astore_1
		// @13: aload_1
		// @14: new java.lang.StringBuilder
		// @17: dup
		// @18: invokespecial java.lang.StringBuilder.<init>()void
		// @1B: getstatic java.lang.String[] game.C_100161_sd.field_105429_z
		// @1E: bipush 6 (0x06)
		// @20: aaload
		// @21: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @24: iload_0
		// @25: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @28: bipush 41 (0x29)
		// @2A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @30: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @33: athrow
		// @34: return
	}
	
	static final String func_105419_a(String arg0, int arg1)
	{
		// @00: getstatic int game.C_100244_pe.field_106379_a
		// @03: getstatic int game.C_100107_u.field_104770_g
		// @06: bipush -124 (0x84)
		// @08: invokestatic game.C_100001_ge.func_100557_a(int, int, byte)int
		// @0B: istore_2
		// @0C: iload_2
		// @0D: iconst_m1
		// @0E: ixor
		// @0F: bipush -2 (0xFE)
		// @11: if_icmpeq @18
		// @14: goto @2F
		// @17: athrow
		// @18: new java.lang.StringBuilder
		// @1B: dup
		// @1C: invokespecial java.lang.StringBuilder.<init>()void
		// @1F: getstatic java.lang.String[] game.C_100161_sd.field_105429_z
		// @22: iconst_3
		// @23: aaload
		// @24: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @27: aload_0
		// @28: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @2E: astore_0
		// @2F: bipush -3 (0xFD)
		// @31: iload_2
		// @32: iconst_m1
		// @33: ixor
		// @34: if_icmpeq @3B
		// @37: goto @52
		// @3A: athrow
		// @3B: new java.lang.StringBuilder
		// @3E: dup
		// @3F: invokespecial java.lang.StringBuilder.<init>()void
		// @42: getstatic java.lang.String[] game.C_100161_sd.field_105429_z
		// @45: iconst_4
		// @46: aaload
		// @47: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4A: aload_0
		// @4B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @51: astore_0
		// @52: iload_1
		// @53: bipush -20 (0xEC)
		// @55: if_icmple @61
		// @58: bipush 69 (0x45)
		// @5A: invokestatic game.C_100161_sd.func_105422_a(byte)void
		// @5D: goto @61
		// @60: athrow
		// @61: aload_0
		// @62: areturn
		// @63: astore_2
		// @64: aload_2
		// @65: new java.lang.StringBuilder
		// @68: dup
		// @69: invokespecial java.lang.StringBuilder.<init>()void
		// @6C: getstatic java.lang.String[] game.C_100161_sd.field_105429_z
		// @6F: iconst_1
		// @70: aaload
		// @71: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @74: aload_0
		// @75: ifnull @81
		// @78: getstatic java.lang.String[] game.C_100161_sd.field_105429_z
		// @7B: iconst_2
		// @7C: aaload
		// @7D: goto @86
		// @80: athrow
		// @81: getstatic java.lang.String[] game.C_100161_sd.field_105429_z
		// @84: iconst_0
		// @85: aaload
		// @86: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @89: bipush 44 (0x2C)
		// @8B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8E: iload_1
		// @8F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @92: bipush 41 (0x29)
		// @94: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @97: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @9A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @9D: athrow
	}
	
	static
	{
		// @00: bipush 8 (0x08)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "uB \u007f"
		// @09: invokestatic game.C_100161_sd.func_105423_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100161_sd.func_105421_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "hSbW8"
		// @14: invokestatic game.C_100161_sd.func_105423_z(java.lang.String)char[]
		// @17: invokestatic game.C_100161_sd.func_105421_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "`\u0019b=m"
		// @1F: invokestatic game.C_100161_sd.func_105423_z(java.lang.String)char[]
		// @22: invokestatic game.C_100161_sd.func_105421_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "'^!t-+\t"
		// @2A: invokestatic game.C_100161_sd.func_105423_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100161_sd.func_105421_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "'^!t-*\t"
		// @35: invokestatic game.C_100161_sd.func_105423_z(java.lang.String)char[]
		// @38: invokestatic game.C_100161_sd.func_105421_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "hSbR8"
		// @40: invokestatic game.C_100161_sd.func_105423_z(java.lang.String)char[]
		// @43: invokestatic game.C_100161_sd.func_105421_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "hSbQ8"
		// @4C: invokestatic game.C_100161_sd.func_105423_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100161_sd.func_105421_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "hSbP8"
		// @58: invokestatic game.C_100161_sd.func_105423_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100161_sd.func_105421_z(char[])java.lang.String
		// @5E: aastore
		// @5F: putstatic java.lang.String[] game.C_100161_sd.field_105429_z
		// @62: ldc "TY j0h_#d0|V!v0x_-g0}E#~0vNlubrR\"wc"
		// @64: invokestatic game.C_100161_sd.func_105423_z(java.lang.String)char[]
		// @67: invokestatic game.C_100161_sd.func_105421_z(char[])java.lang.String
		// @6A: putstatic java.lang.String game.C_100161_sd.field_105425_d
		// @6D: iconst_0
		// @6E: putstatic int game.C_100161_sd.field_105427_c
		// @71: return
	}
	
	private static char[] func_105423_z(String arg0)
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
		// @0E: bipush 16 (0x10)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_105421_z(char[] arg0)
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
		// @30: bipush 27 (0x1B)
		// @32: goto @46
		// @35: bipush 55 (0x37)
		// @37: goto @46
		// @3A: bipush 76 (0x4C)
		// @3C: goto @46
		// @3F: bipush 19 (0x13)
		// @41: goto @46
		// @44: bipush 16 (0x10)
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
