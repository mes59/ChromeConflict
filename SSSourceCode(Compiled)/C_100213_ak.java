package game;

final class C_100213_ak
{
	static String[] field_105992_f;
	static C_100037_wb[] field_105998_a;
	static C_100068_vc field_105993_g;
	static int field_106000_h;
	static int[] field_105994_d;
	static C_100153_be[] field_105997_c;
	static String[][] field_105995_e;
	static int[] field_106001_i;
	static String field_105996_b;
	private static final String[] field_105999_z;
	
	static final void func_105991_a(boolean arg0, int arg1, int arg2, int arg3)
	{
		// @00: iload_3
		// @01: putstatic int game.C_100069_vb.field_104357_e
		// @04: iconst_0
		// @05: getstatic int game.C_100050_vg.field_100632_k
		// @08: if_icmpne @29
		// @0B: aconst_null
		// @0C: getstatic game.C_100214_al[] game.C_100330_ig.field_107287_b
		// @0F: bipush 98 (0x62)
		// @11: aaload
		// @12: if_acmpeq @29
		// @15: goto @19
		// @18: athrow
		// @19: bipush 122 (0x7A)
		// @1B: getstatic game.C_100214_al[] game.C_100330_ig.field_107287_b
		// @1E: bipush 98 (0x62)
		// @20: aaload
		// @21: invokestatic game.C_100185_rm.func_105479_a(byte, game.C_100214_al)game.C_100179_ch
		// @24: pop
		// @25: goto @29
		// @28: athrow
		// @29: iload_1
		// @2A: putstatic int game.C_100050_vg.field_100632_k
		// @2D: iconst_0
		// @2E: putstatic int game.C_100052_eb.field_104231_b
		// @31: iconst_0
		// @32: getstatic int game.C_100050_vg.field_100632_k
		// @35: invokestatic game.C_100176_ci.func_105620_a(boolean, int)boolean
		// @38: ifeq @71
		// @3B: iconst_0
		// @3C: istore #4
		// @3E: getstatic int game.C_100050_vg.field_100632_k
		// @41: iconst_m1
		// @42: ixor
		// @43: bipush -13 (0xF3)
		// @45: if_icmpeq @4C
		// @48: goto @4F
		// @4B: athrow
		// @4C: iconst_m1
		// @4D: istore #4
		// @4F: getstatic game.C_100034_gi[] game.C_100295_kh.field_105293_c
		// @52: getstatic int game.C_100050_vg.field_100632_k
		// @55: aaload
		// @56: iconst_0
		// @57: iload_0
		// @58: iload #4
		// @5A: invokevirtual game.C_100034_gi.func_104022_a(boolean, boolean, int)void
		// @5D: getstatic int game.C_100050_vg.field_100632_k
		// @60: iconst_m1
		// @61: ixor
		// @62: bipush -13 (0xF3)
		// @64: if_icmpne @71
		// @67: iload_0
		// @68: bipush -100 (0x9C)
		// @6A: invokestatic game.C_100092_um.func_104521_a(boolean, byte)void
		// @6D: goto @71
		// @70: athrow
		// @71: getstatic int game.C_100050_vg.field_100632_k
		// @74: iconst_m1
		// @75: ixor
		// @76: iconst_m1
		// @77: if_icmpne @97
		// @7A: getstatic game.C_100214_al[] game.C_100330_ig.field_107287_b
		// @7D: bipush 96 (0x60)
		// @7F: aaload
		// @80: ifnonnull @8B
		// @83: goto @87
		// @86: athrow
		// @87: goto @97
		// @8A: athrow
		// @8B: bipush 125 (0x7D)
		// @8D: getstatic game.C_100214_al[] game.C_100330_ig.field_107287_b
		// @90: bipush 96 (0x60)
		// @92: aaload
		// @93: invokestatic game.C_100185_rm.func_105479_a(byte, game.C_100214_al)game.C_100179_ch
		// @96: pop
		// @97: iload_2
		// @98: bipush -89 (0xA7)
		// @9A: if_icmple @A6
		// @9D: bipush -25 (0xE7)
		// @9F: invokestatic game.C_100213_ak.func_105987_a(byte)void
		// @A2: goto @A6
		// @A5: athrow
		// @A6: goto @E7
		// @A9: astore #4
		// @AB: aload #4
		// @AD: new java.lang.StringBuilder
		// @B0: dup
		// @B1: invokespecial java.lang.StringBuilder.<init>()void
		// @B4: getstatic java.lang.String[] game.C_100213_ak.field_105999_z
		// @B7: iconst_3
		// @B8: aaload
		// @B9: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @BC: iload_0
		// @BD: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @C0: bipush 44 (0x2C)
		// @C2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C5: iload_1
		// @C6: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @C9: bipush 44 (0x2C)
		// @CB: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @CE: iload_2
		// @CF: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @D2: bipush 44 (0x2C)
		// @D4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D7: iload_3
		// @D8: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @DB: bipush 41 (0x29)
		// @DD: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @E0: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @E3: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @E6: athrow
		// @E7: return
	}
	
	public static void func_105987_a(byte arg0)
	{
		// @00: aconst_null
		// @01: putstatic game.C_100068_vc game.C_100213_ak.field_105993_g
		// @04: aconst_null
		// @05: putstatic game.C_100037_wb[] game.C_100213_ak.field_105998_a
		// @08: aconst_null
		// @09: checkcast java.lang.String[][]
		// @0C: putstatic java.lang.String[][] game.C_100213_ak.field_105995_e
		// @0F: aconst_null
		// @10: putstatic int[] game.C_100213_ak.field_106001_i
		// @13: aconst_null
		// @14: putstatic game.C_100153_be[] game.C_100213_ak.field_105997_c
		// @17: bipush -73 (0xB7)
		// @19: iload_0
		// @1A: bipush -79 (0xB1)
		// @1C: isub
		// @1D: bipush 42 (0x2A)
		// @1F: idiv
		// @20: irem
		// @21: istore_1
		// @22: aconst_null
		// @23: putstatic java.lang.String game.C_100213_ak.field_105996_b
		// @26: aconst_null
		// @27: putstatic java.lang.String[] game.C_100213_ak.field_105992_f
		// @2A: aconst_null
		// @2B: putstatic int[] game.C_100213_ak.field_105994_d
		// @2E: goto @52
		// @31: astore_1
		// @32: aload_1
		// @33: new java.lang.StringBuilder
		// @36: dup
		// @37: invokespecial java.lang.StringBuilder.<init>()void
		// @3A: getstatic java.lang.String[] game.C_100213_ak.field_105999_z
		// @3D: iconst_5
		// @3E: aaload
		// @3F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @42: iload_0
		// @43: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @46: bipush 41 (0x29)
		// @48: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @51: athrow
		// @52: return
	}
	
	static final void func_105990_a(int arg0, String arg1)
	{
		// @00: getstatic int game.C_100015_wh.field_103781_g
		// @03: istore_2
		// @04: getstatic int game.C_100338_jc.field_105370_l
		// @07: istore_3
		// @08: getstatic game.C_100302_ka game.C_100129_tg.field_102750_sb
		// @0B: getfield game.C_100112_r game.C_100302_ka.field_101845_sb
		// @0E: aload_1
		// @0F: sipush 500 (0x01F4)
		// @12: invokevirtual game.C_100112_r.func_101724_c(java.lang.String, int)int
		// @15: istore #4
		// @17: bipush 6 (0x06)
		// @19: getstatic game.C_100302_ka game.C_100129_tg.field_102750_sb
		// @1C: getfield game.C_100112_r game.C_100302_ka.field_101845_sb
		// @1F: aload_1
		// @20: iload_0
		// @21: invokevirtual game.C_100112_r.func_101738_b(java.lang.String, int)int
		// @24: iadd
		// @25: istore #5
		// @27: iload #4
		// @29: getstatic int game.C_100033_gj.field_101917_jc
		// @2C: imul
		// @2D: iconst_2
		// @2E: iadd
		// @2F: istore #6
		// @31: bipush 12 (0x0C)
		// @33: iload_2
		// @34: iload #5
		// @36: iconst_m1
		// @37: invokestatic game.C_100211_qd.func_102123_a(int, int, int, int)int
		// @3A: istore #7
		// @3C: bipush 20 (0x14)
		// @3E: iload #6
		// @40: sipush -19295 (0xB4A1)
		// @43: iload_3
		// @44: invokestatic game.C_100257_ln.func_106471_a(int, int, int, int)int
		// @47: istore #8
		// @49: iload #7
		// @4B: iload #8
		// @4D: iload #5
		// @4F: iload #6
		// @51: iconst_0
		// @52: invokestatic game.C_100196_rb.func_105784_h(int, int, int, int, int)void
		// @55: iconst_1
		// @56: iload #7
		// @58: iadd
		// @59: iload #8
		// @5B: iconst_1
		// @5C: iadd
		// @5D: bipush -2 (0xFE)
		// @5F: iload #5
		// @61: iadd
		// @62: iload #6
		// @64: iconst_2
		// @65: isub
		// @66: ldc 16777088 (0xffff80)
		// @68: invokestatic game.C_100196_rb.func_105782_i(int, int, int, int, int)void
		// @6B: getstatic game.C_100302_ka game.C_100129_tg.field_102750_sb
		// @6E: getfield game.C_100112_r game.C_100302_ka.field_101845_sb
		// @71: aload_1
		// @72: iconst_3
		// @73: iload #7
		// @75: iadd
		// @76: getstatic game.C_100302_ka game.C_100129_tg.field_102750_sb
		// @79: getfield game.C_100112_r game.C_100302_ka.field_101845_sb
		// @7C: getfield int game.C_100112_r.field_101772_Q
		// @7F: ineg
		// @80: iload #8
		// @82: iadd
		// @83: iconst_m1
		// @84: getstatic int game.C_100140_bj.field_102963_f
		// @87: isub
		// @88: isub
		// @89: sipush 500 (0x01F4)
		// @8C: sipush 1000 (0x03E8)
		// @8F: iconst_0
		// @90: iconst_m1
		// @91: iconst_0
		// @92: iconst_0
		// @93: getstatic int game.C_100033_gj.field_101917_jc
		// @96: invokevirtual game.C_100112_r.func_101729_a(java.lang.String, int, int, int, int, int, int, int, int, int)int
		// @99: pop
		// @9A: goto @D8
		// @9D: astore_2
		// @9E: aload_2
		// @9F: new java.lang.StringBuilder
		// @A2: dup
		// @A3: invokespecial java.lang.StringBuilder.<init>()void
		// @A6: getstatic java.lang.String[] game.C_100213_ak.field_105999_z
		// @A9: iconst_1
		// @AA: aaload
		// @AB: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @AE: iload_0
		// @AF: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @B2: bipush 44 (0x2C)
		// @B4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B7: aload_1
		// @B8: ifnull @C4
		// @BB: getstatic java.lang.String[] game.C_100213_ak.field_105999_z
		// @BE: iconst_2
		// @BF: aaload
		// @C0: goto @C9
		// @C3: athrow
		// @C4: getstatic java.lang.String[] game.C_100213_ak.field_105999_z
		// @C7: iconst_0
		// @C8: aaload
		// @C9: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @CC: bipush 41 (0x29)
		// @CE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D1: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @D4: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @D7: athrow
		// @D8: return
	}
	
	static final void func_105989_a(C_100280_nf arg0, byte arg1)
	{
		// @00: aload_0
		// @01: bipush -2 (0xFE)
		// @03: invokevirtual game.C_100280_nf.func_101143_l(int)int
		// @06: ldc -353332251 (0xeaf093e5)
		// @08: ishl
		// @09: putstatic int game.C_100082_uf.field_100370_d
		// @0C: aload_0
		// @0D: iconst_0
		// @0E: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @11: istore_2
		// @12: ldc 1835008 (0x1c0000)
		// @14: iload_2
		// @15: ldc -2008059438 (0x884f71d2)
		// @17: ishl
		// @18: iand
		// @19: putstatic int game.C_100289_jl.field_102902_H
		// @1C: getstatic int game.C_100082_uf.field_100370_d
		// @1F: iload_2
		// @20: ldc 1546963651 (0x5c34cac3)
		// @22: ishr
		// @23: iadd
		// @24: putstatic int game.C_100082_uf.field_100370_d
		// @27: getstatic int game.C_100289_jl.field_102902_H
		// @2A: aload_0
		// @2B: bipush -2 (0xFE)
		// @2D: invokevirtual game.C_100280_nf.func_101143_l(int)int
		// @30: ldc 1040094786 (0x3dfe9642)
		// @32: ishl
		// @33: iadd
		// @34: putstatic int game.C_100289_jl.field_102902_H
		// @37: aload_0
		// @38: iconst_0
		// @39: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @3C: istore_2
		// @3D: bipush 110 (0x6E)
		// @3F: iload_1
		// @40: bipush 8 (0x08)
		// @42: isub
		// @43: bipush 56 (0x38)
		// @45: idiv
		// @46: idiv
		// @47: istore_3
		// @48: getstatic int game.C_100289_jl.field_102902_H
		// @4B: iload_2
		// @4C: ldc -1937625082 (0x8c823006)
		// @4E: ishr
		// @4F: iadd
		// @50: putstatic int game.C_100289_jl.field_102902_H
		// @53: bipush 63 (0x3F)
		// @55: iload_2
		// @56: iand
		// @57: ldc 1135260879 (0x43aab4cf)
		// @59: ishl
		// @5A: putstatic int game.C_100101_fc.field_103401_S
		// @5D: getstatic int game.C_100101_fc.field_103401_S
		// @60: aload_0
		// @61: iconst_0
		// @62: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @65: ldc -1119937945 (0xbd3f1a67)
		// @67: ishl
		// @68: iadd
		// @69: putstatic int game.C_100101_fc.field_103401_S
		// @6C: aload_0
		// @6D: iconst_0
		// @6E: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @71: istore_2
		// @72: getstatic int game.C_100101_fc.field_103401_S
		// @75: iload_2
		// @76: ldc -1396533567 (0xacc296c1)
		// @78: ishr
		// @79: iadd
		// @7A: putstatic int game.C_100101_fc.field_103401_S
		// @7D: iconst_1
		// @7E: iload_2
		// @7F: iand
		// @80: ldc 895788720 (0x3564a6b0)
		// @82: ishl
		// @83: putstatic int game.C_100096_un.field_104566_c
		// @86: getstatic int game.C_100096_un.field_104566_c
		// @89: aload_0
		// @8A: bipush -2 (0xFE)
		// @8C: invokevirtual game.C_100280_nf.func_101143_l(int)int
		// @8F: iadd
		// @90: putstatic int game.C_100096_un.field_104566_c
		// @93: goto @D1
		// @96: astore_2
		// @97: aload_2
		// @98: new java.lang.StringBuilder
		// @9B: dup
		// @9C: invokespecial java.lang.StringBuilder.<init>()void
		// @9F: getstatic java.lang.String[] game.C_100213_ak.field_105999_z
		// @A2: iconst_4
		// @A3: aaload
		// @A4: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @A7: aload_0
		// @A8: ifnull @B4
		// @AB: getstatic java.lang.String[] game.C_100213_ak.field_105999_z
		// @AE: iconst_2
		// @AF: aaload
		// @B0: goto @B9
		// @B3: athrow
		// @B4: getstatic java.lang.String[] game.C_100213_ak.field_105999_z
		// @B7: iconst_0
		// @B8: aaload
		// @B9: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @BC: bipush 44 (0x2C)
		// @BE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C1: iload_1
		// @C2: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @C5: bipush 41 (0x29)
		// @C7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @CA: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @CD: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @D0: athrow
		// @D1: return
	}
	
	static final void func_105985_a(C_100346_ja arg0, byte arg1, int arg2)
	{
		// @00: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @03: astore_3
		// @04: aload_3
		// @05: iload_2
		// @06: bipush 126 (0x7E)
		// @08: invokevirtual game.C_100278_nd.func_101189_h(int, int)void
		// @0B: iload_1
		// @0C: bipush -9 (0xF7)
		// @0E: if_icmpeq @20
		// @11: aconst_null
		// @12: checkcast game.C_100346_ja
		// @15: bipush -67 (0xBD)
		// @17: bipush -95 (0xA1)
		// @19: invokestatic game.C_100213_ak.func_105985_a(game.C_100346_ja, byte, int)void
		// @1C: goto @20
		// @1F: athrow
		// @20: aload_3
		// @21: sipush 7838 (0x1E9E)
		// @24: aload_0
		// @25: getfield int game.C_100346_ja.field_103493_s
		// @28: invokevirtual game.C_100278_nd.func_101169_f(int, int)void
		// @2B: aload_3
		// @2C: sipush 7838 (0x1E9E)
		// @2F: aload_0
		// @30: getfield int game.C_100346_ja.field_103485_l
		// @33: invokevirtual game.C_100278_nd.func_101169_f(int, int)void
		// @36: goto @7E
		// @39: astore_3
		// @3A: aload_3
		// @3B: new java.lang.StringBuilder
		// @3E: dup
		// @3F: invokespecial java.lang.StringBuilder.<init>()void
		// @42: getstatic java.lang.String[] game.C_100213_ak.field_105999_z
		// @45: bipush 6 (0x06)
		// @47: aaload
		// @48: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4B: aload_0
		// @4C: ifnull @58
		// @4F: getstatic java.lang.String[] game.C_100213_ak.field_105999_z
		// @52: iconst_2
		// @53: aaload
		// @54: goto @5D
		// @57: athrow
		// @58: getstatic java.lang.String[] game.C_100213_ak.field_105999_z
		// @5B: iconst_0
		// @5C: aaload
		// @5D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @60: bipush 44 (0x2C)
		// @62: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @65: iload_1
		// @66: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @69: bipush 44 (0x2C)
		// @6B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6E: iload_2
		// @6F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @72: bipush 41 (0x29)
		// @74: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @77: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @7A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @7D: athrow
		// @7E: return
	}
	
	static
	{
		// @000: bipush 7 (0x07)
		// @002: anewarray java.lang.String
		// @005: dup
		// @006: iconst_0
		// @007: ldc "}\u001e#:"
		// @009: invokestatic game.C_100213_ak.func_105988_z(java.lang.String)char[]
		// @00C: invokestatic game.C_100213_ak.func_105986_z(char[])java.lang.String
		// @00F: aastore
		// @010: dup
		// @011: iconst_1
		// @012: ldc "r\u0000a\u0014."
		// @014: invokestatic game.C_100213_ak.func_105988_z(java.lang.String)char[]
		// @017: invokestatic game.C_100213_ak.func_105986_z(char[])java.lang.String
		// @01A: aastore
		// @01B: dup
		// @01C: iconst_2
		// @01D: ldc "hEax{"
		// @01F: invokestatic game.C_100213_ak.func_105988_z(java.lang.String)char[]
		// @022: invokestatic game.C_100213_ak.func_105986_z(char[])java.lang.String
		// @025: aastore
		// @026: dup
		// @027: iconst_3
		// @028: ldc "r\u0000a\u0015."
		// @02A: invokestatic game.C_100213_ak.func_105988_z(java.lang.String)char[]
		// @02D: invokestatic game.C_100213_ak.func_105986_z(char[])java.lang.String
		// @030: aastore
		// @031: dup
		// @032: iconst_4
		// @033: ldc "r\u0000a\u0012."
		// @035: invokestatic game.C_100213_ak.func_105988_z(java.lang.String)char[]
		// @038: invokestatic game.C_100213_ak.func_105986_z(char[])java.lang.String
		// @03B: aastore
		// @03C: dup
		// @03D: iconst_5
		// @03E: ldc "r\u0000a\u0013."
		// @040: invokestatic game.C_100213_ak.func_105988_z(java.lang.String)char[]
		// @043: invokestatic game.C_100213_ak.func_105986_z(char[])java.lang.String
		// @046: aastore
		// @047: dup
		// @048: bipush 6 (0x06)
		// @04A: ldc "r\u0000a\u0017."
		// @04C: invokestatic game.C_100213_ak.func_105988_z(java.lang.String)char[]
		// @04F: invokestatic game.C_100213_ak.func_105986_z(char[])java.lang.String
		// @052: aastore
		// @053: putstatic java.lang.String[] game.C_100213_ak.field_105999_z
		// @056: bipush 6 (0x06)
		// @058: anewarray java.lang.String
		// @05B: dup
		// @05C: iconst_0
		// @05D: ldc "_\u0002(>r"
		// @05F: invokestatic game.C_100213_ak.func_105988_z(java.lang.String)char[]
		// @062: invokestatic game.C_100213_ak.func_105986_z(char[])java.lang.String
		// @065: aastore
		// @066: dup
		// @067: iconst_1
		// @068: ldc "[\u000e. \u007f"
		// @06A: invokestatic game.C_100213_ak.func_105988_z(java.lang.String)char[]
		// @06D: invokestatic game.C_100213_ak.func_105986_z(char[])java.lang.String
		// @070: aastore
		// @071: dup
		// @072: iconst_2
		// @073: ldc "\\\u0019+8g}\u0008*"
		// @075: invokestatic game.C_100213_ak.func_105988_z(java.lang.String)char[]
		// @078: invokestatic game.C_100213_ak.func_105986_z(char[])java.lang.String
		// @07B: aastore
		// @07C: dup
		// @07D: iconst_3
		// @07E: ldc "A\u0004,=cg"
		// @080: invokestatic game.C_100213_ak.func_105988_z(java.lang.String)char[]
		// @083: invokestatic game.C_100213_ak.func_105986_z(char[])java.lang.String
		// @086: aastore
		// @087: dup
		// @088: iconst_4
		// @089: ldc "_\n=1c3\u0019 5mv\u001f"
		// @08B: invokestatic game.C_100213_ak.func_105988_z(java.lang.String)char[]
		// @08E: invokestatic game.C_100213_ak.func_105986_z(char[])java.lang.String
		// @091: aastore
		// @092: dup
		// @093: iconst_5
		// @094: ldc "]\u001e$3"
		// @096: invokestatic game.C_100213_ak.func_105988_z(java.lang.String)char[]
		// @099: invokestatic game.C_100213_ak.func_105986_z(char[])java.lang.String
		// @09C: aastore
		// @09D: putstatic java.lang.String[] game.C_100213_ak.field_105992_f
		// @0A0: new game.C_100068_vc
		// @0A3: dup
		// @0A4: invokespecial game.C_100068_vc.<init>()void
		// @0A7: putstatic game.C_100068_vc game.C_100213_ak.field_105993_g
		// @0AA: iconst_3
		// @0AB: anewarray java.lang.String[]
		// @0AE: dup
		// @0AF: iconst_0
		// @0B0: iconst_2
		// @0B1: anewarray java.lang.String
		// @0B4: dup
		// @0B5: iconst_0
		// @0B6: ldc "G\n,\"op\n#"
		// @0B8: invokestatic game.C_100213_ak.func_105988_z(java.lang.String)char[]
		// @0BB: invokestatic game.C_100213_ak.func_105986_z(char[])java.lang.String
		// @0BE: aastore
		// @0BF: dup
		// @0C0: iconst_1
		// @0C1: ldc "R\u0008;?i}"
		// @0C3: invokestatic game.C_100213_ak.func_105988_z(java.lang.String)char[]
		// @0C6: invokestatic game.C_100213_ak.func_105986_z(char[])java.lang.String
		// @0C9: aastore
		// @0CA: aastore
		// @0CB: dup
		// @0CC: iconst_1
		// @0CD: iconst_5
		// @0CE: anewarray java.lang.String
		// @0D1: dup
		// @0D2: iconst_0
		// @0D3: ldc "Q\n<?e"
		// @0D5: invokestatic game.C_100213_ak.func_105988_z(java.lang.String)char[]
		// @0D8: invokestatic game.C_100213_ak.func_105986_z(char[])java.lang.String
		// @0DB: aastore
		// @0DC: dup
		// @0DD: iconst_1
		// @0DE: ldc "@\u001f.8br\u0019+"
		// @0E0: invokestatic game.C_100213_ak.func_105988_z(java.lang.String)char[]
		// @0E3: invokestatic game.C_100213_ak.func_105986_z(char[])java.lang.String
		// @0E6: aastore
		// @0E7: dup
		// @0E8: iconst_2
		// @0E9: ldc "R\u000f97hp\u000e+"
		// @0EB: invokestatic game.C_100213_ak.func_105988_z(java.lang.String)char[]
		// @0EE: invokestatic game.C_100213_ak.func_105986_z(char[])java.lang.String
		// @0F1: aastore
		// @0F2: dup
		// @0F3: iconst_3
		// @0F4: ldc "[\u0002(>"
		// @0F6: invokestatic game.C_100213_ak.func_105988_z(java.lang.String)char[]
		// @0F9: invokestatic game.C_100213_ak.func_105986_z(char[])java.lang.String
		// @0FC: aastore
		// @0FD: dup
		// @0FE: iconst_4
		// @0FF: ldc "V\u0013?3tg"
		// @101: invokestatic game.C_100213_ak.func_105988_z(java.lang.String)char[]
		// @104: invokestatic game.C_100213_ak.func_105986_z(char[])java.lang.String
		// @107: aastore
		// @108: aastore
		// @109: dup
		// @10A: iconst_2
		// @10B: bipush 6 (0x06)
		// @10D: anewarray java.lang.String
		// @110: dup
		// @111: iconst_0
		// @112: ldc "I\u0004!3"
		// @114: invokestatic game.C_100213_ak.func_105988_z(java.lang.String)char[]
		// @117: invokestatic game.C_100213_ak.func_105986_z(char[])java.lang.String
		// @11A: aastore
		// @11B: dup
		// @11C: iconst_1
		// @11D: ldc "_\u0004<\""
		// @11F: invokestatic game.C_100213_ak.func_105988_z(java.lang.String)char[]
		// @122: invokestatic game.C_100213_ak.func_105986_z(char[])java.lang.String
		// @125: aastore
		// @126: dup
		// @127: iconst_2
		// @128: ldc "P\u0002;/"
		// @12A: invokestatic game.C_100213_ak.func_105988_z(java.lang.String)char[]
		// @12D: invokestatic game.C_100213_ak.func_105986_z(char[])java.lang.String
		// @130: aastore
		// @131: dup
		// @132: iconst_3
		// @133: ldc "^\u0004 8"
		// @135: invokestatic game.C_100213_ak.func_105988_z(java.lang.String)char[]
		// @138: invokestatic game.C_100213_ak.func_105986_z(char[])java.lang.String
		// @13B: aastore
		// @13C: dup
		// @13D: iconst_4
		// @13E: ldc "U\u0007*3r"
		// @140: invokestatic game.C_100213_ak.func_105988_z(java.lang.String)char[]
		// @143: invokestatic game.C_100213_ak.func_105986_z(char[])java.lang.String
		// @146: aastore
		// @147: dup
		// @148: iconst_5
		// @149: ldc "P\u0004b9v"
		// @14B: invokestatic game.C_100213_ak.func_105988_z(java.lang.String)char[]
		// @14E: invokestatic game.C_100213_ak.func_105986_z(char[])java.lang.String
		// @151: aastore
		// @152: aastore
		// @153: putstatic java.lang.String[][] game.C_100213_ak.field_105995_e
		// @156: ldc "R\u0008,3vg"
		// @158: invokestatic game.C_100213_ak.func_105988_z(java.lang.String)char[]
		// @15B: invokestatic game.C_100213_ak.func_105986_z(char[])java.lang.String
		// @15E: putstatic java.lang.String game.C_100213_ak.field_105996_b
		// @161: bipush 11 (0x0B)
		// @163: newarray int[]
		// @165: dup
		// @166: iconst_0
		// @167: bipush 108 (0x6C)
		// @169: iastore
		// @16A: dup
		// @16B: iconst_1
		// @16C: iconst_m1
		// @16D: iastore
		// @16E: dup
		// @16F: iconst_2
		// @170: bipush 30 (0x1E)
		// @172: iastore
		// @173: dup
		// @174: iconst_3
		// @175: bipush 28 (0x1C)
		// @177: iastore
		// @178: dup
		// @179: iconst_4
		// @17A: iconst_m1
		// @17B: iastore
		// @17C: dup
		// @17D: iconst_5
		// @17E: iconst_m1
		// @17F: iastore
		// @180: dup
		// @181: bipush 6 (0x06)
		// @183: iconst_m1
		// @184: iastore
		// @185: dup
		// @186: bipush 7 (0x07)
		// @188: iconst_m1
		// @189: iastore
		// @18A: dup
		// @18B: bipush 8 (0x08)
		// @18D: iconst_m1
		// @18E: iastore
		// @18F: dup
		// @190: bipush 9 (0x09)
		// @192: iconst_m1
		// @193: iastore
		// @194: dup
		// @195: bipush 10 (0x0A)
		// @197: iconst_m1
		// @198: iastore
		// @199: putstatic int[] game.C_100213_ak.field_106001_i
		// @19C: return
	}
	
	private static char[] func_105988_z(String arg0)
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
		// @0E: bipush 6 (0x06)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_105986_z(char[] arg0)
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
		// @30: bipush 19 (0x13)
		// @32: goto @46
		// @35: bipush 107 (0x6B)
		// @37: goto @46
		// @3A: bipush 79 (0x4F)
		// @3C: goto @46
		// @3F: bipush 86 (0x56)
		// @41: goto @46
		// @44: bipush 6 (0x06)
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
