package game;

final class C_100297_kf extends C_100158_da
{
	static C_100037_wb field_101244_k;
	int field_101239_o;
	int field_101236_q;
	static C_100133_tk field_101234_s;
	int field_101241_m;
	int field_101235_r;
	static String field_101237_p;
	int field_101242_j;
	C_100297_kf field_101238_n;
	static C_100302_ka field_101240_l;
	private static final String[] field_101243_z;
	
	public static void func_101230_c(boolean arg0)
	{
		// @00: iload_0
		// @01: ifeq @0F
		// @04: aconst_null
		// @05: checkcast game.C_100302_ka
		// @08: putstatic game.C_100302_ka game.C_100297_kf.field_101240_l
		// @0B: goto @0F
		// @0E: athrow
		// @0F: aconst_null
		// @10: putstatic game.C_100037_wb game.C_100297_kf.field_101244_k
		// @13: aconst_null
		// @14: putstatic game.C_100302_ka game.C_100297_kf.field_101240_l
		// @17: aconst_null
		// @18: putstatic game.C_100133_tk game.C_100297_kf.field_101234_s
		// @1B: aconst_null
		// @1C: putstatic java.lang.String game.C_100297_kf.field_101237_p
		// @1F: goto @43
		// @22: astore_1
		// @23: aload_1
		// @24: new java.lang.StringBuilder
		// @27: dup
		// @28: invokespecial java.lang.StringBuilder.<init>()void
		// @2B: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @2E: iconst_3
		// @2F: aaload
		// @30: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @33: iload_0
		// @34: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @37: bipush 41 (0x29)
		// @39: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @42: athrow
		// @43: return
	}
	
	static final boolean func_101227_a(byte arg0, int[] arg1, long arg2, String arg3, int arg4)
	{
		// @00: iload #5
		// @02: iconst_2
		// @03: aload #4
		// @05: aload_1
		// @06: lload_2
		// @07: invokestatic game.C_100297_kf.func_101232_a(int, int, java.lang.String, int[], long)boolean
		// @0A: ifeq @11
		// @0D: goto @13
		// @10: athrow
		// @11: iconst_0
		// @12: ireturn
		// @13: iconst_1
		// @14: iload #5
		// @16: if_icmpeq @1D
		// @19: goto @20
		// @1C: athrow
		// @1D: iconst_0
		// @1E: istore #5
		// @20: aload #4
		// @22: putstatic java.lang.String game.C_100050_vg.field_100630_m
		// @25: iload #5
		// @27: putstatic int game.C_100113_ek.field_104880_b
		// @2A: bipush 104 (0x68)
		// @2C: aload #4
		// @2E: invokestatic game.C_100106_ef.func_104742_a(byte, java.lang.CharSequence)java.lang.String
		// @31: putstatic java.lang.String game.C_100243_pd.field_106355_f
		// @34: lload_2
		// @35: putstatic long game.C_100290_jm.field_106867_i
		// @38: bipush 94 (0x5E)
		// @3A: iload_0
		// @3B: bipush -61 (0xC3)
		// @3D: isub
		// @3E: bipush 50 (0x32)
		// @40: idiv
		// @41: irem
		// @42: istore #7
		// @44: getstatic game.C_100302_ka game.C_100195_rc.field_105774_a
		// @47: getstatic game.C_100302_ka game.C_100123_uc.field_104923_b
		// @4A: bipush -123 (0x85)
		// @4C: getstatic game.C_100302_ka game.C_100111_el.field_104868_i
		// @4F: aload_1
		// @50: invokestatic game.C_100273_mm.func_106674_a(game.C_100302_ka, game.C_100302_ka, int, game.C_100302_ka, int[])game.C_100033_gj
		// @53: astore #6
		// @55: sipush 23494 (0x5BC6)
		// @58: aload #6
		// @5A: invokestatic game.C_100107_u.func_104767_a(int, game.C_100033_gj)void
		// @5D: iconst_1
		// @5E: ireturn
		// @5F: astore #6
		// @61: aload #6
		// @63: new java.lang.StringBuilder
		// @66: dup
		// @67: invokespecial java.lang.StringBuilder.<init>()void
		// @6A: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @6D: sipush 132 (0x0084)
		// @70: aaload
		// @71: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @74: iload_0
		// @75: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @78: bipush 44 (0x2C)
		// @7A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7D: aload_1
		// @7E: ifnull @8A
		// @81: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @84: iconst_1
		// @85: aaload
		// @86: goto @8F
		// @89: athrow
		// @8A: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @8D: iconst_2
		// @8E: aaload
		// @8F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @92: bipush 44 (0x2C)
		// @94: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @97: lload_2
		// @98: invokevirtual java.lang.StringBuilder.append(long)java.lang.StringBuilder
		// @9B: bipush 44 (0x2C)
		// @9D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A0: aload #4
		// @A2: ifnull @AE
		// @A5: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @A8: iconst_1
		// @A9: aaload
		// @AA: goto @B3
		// @AD: athrow
		// @AE: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @B1: iconst_2
		// @B2: aaload
		// @B3: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @B6: bipush 44 (0x2C)
		// @B8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @BB: iload #5
		// @BD: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @C0: bipush 41 (0x29)
		// @C2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C5: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @C8: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @CB: athrow
	}
	
	static final void func_101233_a(boolean arg0, int arg1, int arg2, int arg3)
	{
		// @00: getstatic game.C_100037_wb game.C_100061_dh.field_101981_Zb
		// @03: iload_3
		// @04: iload_2
		// @05: invokevirtual game.C_100037_wb.func_102353_h(int, int)void
		// @08: iload_1
		// @09: sipush 16412 (0x401C)
		// @0C: if_icmpeq @10
		// @0F: return
		// @10: iload_0
		// @11: ifne @18
		// @14: goto @8F
		// @17: athrow
		// @18: iconst_2
		// @19: getstatic int game.C_100287_nm.field_106826_b
		// @1C: getstatic game.C_100037_wb game.C_100061_dh.field_101981_Zb
		// @1F: getfield int game.C_100037_wb.field_102339_s
		// @22: irem
		// @23: imul
		// @24: istore #4
		// @26: getstatic game.C_100037_wb game.C_100061_dh.field_101981_Zb
		// @29: getfield int game.C_100037_wb.field_102339_s
		// @2C: iconst_m1
		// @2D: ixor
		// @2E: iload #4
		// @30: iconst_m1
		// @31: ixor
		// @32: if_icmplt @48
		// @35: getstatic game.C_100037_wb game.C_100061_dh.field_101981_Zb
		// @38: getfield int game.C_100037_wb.field_102339_s
		// @3B: iload #4
		// @3D: ineg
		// @3E: iadd
		// @3F: getstatic game.C_100037_wb game.C_100061_dh.field_101981_Zb
		// @42: getfield int game.C_100037_wb.field_102339_s
		// @45: iadd
		// @46: istore #4
		// @48: bipush 10 (0x0A)
		// @4A: iload #4
		// @4C: if_icmpgt @7A
		// @4F: iload #4
		// @51: iconst_m1
		// @52: ixor
		// @53: getstatic game.C_100037_wb game.C_100061_dh.field_101981_Zb
		// @56: getfield int game.C_100037_wb.field_102339_s
		// @59: bipush -40 (0xD8)
		// @5B: iadd
		// @5C: iconst_m1
		// @5D: ixor
		// @5E: if_icmplt @69
		// @61: goto @65
		// @64: athrow
		// @65: goto @7E
		// @68: athrow
		// @69: bipush -40 (0xD8)
		// @6B: getstatic game.C_100037_wb game.C_100061_dh.field_101981_Zb
		// @6E: getfield int game.C_100037_wb.field_102339_s
		// @71: iadd
		// @72: istore #4
		// @74: getstatic int game.SteelSentinels.field_105275_O
		// @77: ifeq @7E
		// @7A: bipush 10 (0x0A)
		// @7C: istore #4
		// @7E: iload_3
		// @7F: iconst_1
		// @80: iload #4
		// @82: iconst_0
		// @83: getstatic game.C_100037_wb game.C_100061_dh.field_101981_Zb
		// @86: iconst_0
		// @87: iload_2
		// @88: bipush 30 (0x1E)
		// @8A: bipush 80 (0x50)
		// @8C: invokestatic game.C_100186_rl.func_105718_a(int, int, int, int, game.C_100037_wb, int, int, int, int)void
		// @8F: goto @D2
		// @92: astore #4
		// @94: aload #4
		// @96: new java.lang.StringBuilder
		// @99: dup
		// @9A: invokespecial java.lang.StringBuilder.<init>()void
		// @9D: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @A0: sipush 131 (0x0083)
		// @A3: aaload
		// @A4: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @A7: iload_0
		// @A8: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @AB: bipush 44 (0x2C)
		// @AD: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B0: iload_1
		// @B1: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @B4: bipush 44 (0x2C)
		// @B6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B9: iload_2
		// @BA: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @BD: bipush 44 (0x2C)
		// @BF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C2: iload_3
		// @C3: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @C6: bipush 41 (0x29)
		// @C8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @CB: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @CE: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @D1: athrow
		// @D2: return
	}
	
	static final boolean func_101232_a(int arg0, int arg1, String arg2, int[] arg3, long arg4)
	{
		// @00: iload_1
		// @01: iconst_2
		// @02: if_icmpeq @07
		// @05: iconst_1
		// @06: ireturn
		// @07: aconst_null
		// @08: aload_3
		// @09: if_acmpeq @29
		// @0C: iconst_2
		// @0D: iload_0
		// @0E: if_icmpne @24
		// @11: goto @15
		// @14: athrow
		// @15: lload #4
		// @17: aload_2
		// @18: bipush -93 (0xA3)
		// @1A: invokestatic game.C_100256_pk.func_100444_a(long, java.lang.String, byte)boolean
		// @1D: ifeq @29
		// @20: goto @24
		// @23: athrow
		// @24: iconst_1
		// @25: goto @2A
		// @28: athrow
		// @29: iconst_0
		// @2A: ireturn
		// @2B: astore #6
		// @2D: aload #6
		// @2F: new java.lang.StringBuilder
		// @32: dup
		// @33: invokespecial java.lang.StringBuilder.<init>()void
		// @36: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @39: sipush 133 (0x0085)
		// @3C: aaload
		// @3D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @40: iload_0
		// @41: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @44: bipush 44 (0x2C)
		// @46: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @49: iload_1
		// @4A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4D: bipush 44 (0x2C)
		// @4F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @52: aload_2
		// @53: ifnull @5F
		// @56: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @59: iconst_1
		// @5A: aaload
		// @5B: goto @64
		// @5E: athrow
		// @5F: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @62: iconst_2
		// @63: aaload
		// @64: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @67: bipush 44 (0x2C)
		// @69: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6C: aload_3
		// @6D: ifnull @79
		// @70: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @73: iconst_1
		// @74: aaload
		// @75: goto @7E
		// @78: athrow
		// @79: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @7C: iconst_2
		// @7D: aaload
		// @7E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @81: bipush 44 (0x2C)
		// @83: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @86: lload #4
		// @88: invokevirtual java.lang.StringBuilder.append(long)java.lang.StringBuilder
		// @8B: bipush 41 (0x29)
		// @8D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @90: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @93: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @96: athrow
	}
	
	static final C_100059_df func_101226_b(boolean arg0)
	{
		// @00: iconst_m1
		// @01: getstatic int game.C_100322_hn.field_107238_b
		// @04: iconst_1
		// @05: isub
		// @06: dup
		// @07: putstatic int game.C_100322_hn.field_107238_b
		// @0A: iconst_m1
		// @0B: ixor
		// @0C: if_icmpge @1D
		// @0F: getstatic int game.C_100322_hn.field_107238_b
		// @12: sipush 10000 (0x2710)
		// @15: iadd
		// @16: putstatic int game.C_100322_hn.field_107238_b
		// @19: goto @1D
		// @1C: athrow
		// @1D: iload_0
		// @1E: ifeq @29
		// @21: iconst_0
		// @22: invokestatic game.C_100297_kf.func_101229_a(boolean)void
		// @25: goto @29
		// @28: athrow
		// @29: getstatic game.C_100059_df[] game.C_100277_nc.field_106737_u
		// @2C: getstatic int game.C_100322_hn.field_107238_b
		// @2F: aaload
		// @30: areturn
		// @31: astore_1
		// @32: aload_1
		// @33: new java.lang.StringBuilder
		// @36: dup
		// @37: invokespecial java.lang.StringBuilder.<init>()void
		// @3A: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @3D: sipush 130 (0x0082)
		// @40: aaload
		// @41: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @44: iload_0
		// @45: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @48: bipush 41 (0x29)
		// @4A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @50: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @53: athrow
	}
	
	static final void func_101229_a(boolean arg0)
	{
		// @0000: getstatic int game.SteelSentinels.field_105275_O
		// @0003: istore #4
		// @0005: new game.C_100202_qi
		// @0008: dup
		// @0009: invokespecial game.C_100202_qi.<init>()void
		// @000C: putstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @000F: aconst_null
		// @0010: getstatic game.C_100153_be[] game.C_100042_we.field_104138_j
		// @0013: if_acmpne @0022
		// @0016: bipush 21 (0x15)
		// @0018: anewarray game.C_100153_be
		// @001B: putstatic game.C_100153_be[] game.C_100042_we.field_104138_j
		// @001E: goto @0022
		// @0021: athrow
		// @0022: aconst_null
		// @0023: getstatic game.C_100153_be[] game.C_100166_sg.field_105465_e
		// @0026: if_acmpeq @002D
		// @0029: goto @0035
		// @002C: athrow
		// @002D: bipush 12 (0x0C)
		// @002F: anewarray game.C_100153_be
		// @0032: putstatic game.C_100153_be[] game.C_100166_sg.field_105465_e
		// @0035: getstatic game.C_100153_be[] game.C_100166_sg.field_105466_b
		// @0038: ifnonnull @0047
		// @003B: bipush 21 (0x15)
		// @003D: anewarray game.C_100153_be
		// @0040: putstatic game.C_100153_be[] game.C_100166_sg.field_105466_b
		// @0043: goto @0047
		// @0046: athrow
		// @0047: getstatic game.C_100153_be[] game.C_100217_ao.field_106045_i
		// @004A: ifnull @0051
		// @004D: goto @0059
		// @0050: athrow
		// @0051: bipush 20 (0x14)
		// @0053: anewarray game.C_100153_be
		// @0056: putstatic game.C_100153_be[] game.C_100217_ao.field_106045_i
		// @0059: getstatic game.C_100153_be[] game.C_100094_j.field_104554_h
		// @005C: ifnonnull @006C
		// @005F: sipush 256 (0x0100)
		// @0062: anewarray game.C_100153_be
		// @0065: putstatic game.C_100153_be[] game.C_100094_j.field_104554_h
		// @0068: goto @006C
		// @006B: athrow
		// @006C: getstatic game.C_100153_be[] game.C_100092_um.field_104534_a
		// @006F: ifnonnull @007E
		// @0072: bipush 12 (0x0C)
		// @0074: anewarray game.C_100153_be
		// @0077: putstatic game.C_100153_be[] game.C_100092_um.field_104534_a
		// @007A: goto @007E
		// @007D: athrow
		// @007E: aconst_null
		// @007F: getstatic game.C_100153_be[] game.C_100314_lf.field_101371_Ob
		// @0082: if_acmpne @0091
		// @0085: bipush 15 (0x0F)
		// @0087: anewarray game.C_100153_be
		// @008A: putstatic game.C_100153_be[] game.C_100314_lf.field_101371_Ob
		// @008D: goto @0091
		// @0090: athrow
		// @0091: aconst_null
		// @0092: getstatic game.C_100153_be[] game.C_100213_ak.field_105997_c
		// @0095: if_acmpne @00A4
		// @0098: bipush 10 (0x0A)
		// @009A: anewarray game.C_100153_be
		// @009D: putstatic game.C_100153_be[] game.C_100213_ak.field_105997_c
		// @00A0: goto @00A4
		// @00A3: athrow
		// @00A4: aconst_null
		// @00A5: getstatic game.C_100153_be[] game.C_100327_ib.field_102482_B
		// @00A8: if_acmpeq @00AF
		// @00AB: goto @00B7
		// @00AE: athrow
		// @00AF: bipush 12 (0x0C)
		// @00B1: anewarray game.C_100153_be
		// @00B4: putstatic game.C_100153_be[] game.C_100327_ib.field_102482_B
		// @00B7: aconst_null
		// @00B8: getstatic game.C_100153_be[] game.C_100154_sl.field_105331_d
		// @00BB: if_acmpeq @00C2
		// @00BE: goto @00CA
		// @00C1: athrow
		// @00C2: bipush 20 (0x14)
		// @00C4: anewarray game.C_100153_be
		// @00C7: putstatic game.C_100153_be[] game.C_100154_sl.field_105331_d
		// @00CA: getstatic game.C_100153_be[] game.C_100015_wh.field_103790_m
		// @00CD: ifnull @00D4
		// @00D0: goto @00DB
		// @00D3: athrow
		// @00D4: iconst_4
		// @00D5: anewarray game.C_100153_be
		// @00D8: putstatic game.C_100153_be[] game.C_100015_wh.field_103790_m
		// @00DB: aconst_null
		// @00DC: getstatic game.C_100153_be[] game.C_100006_fj.field_103620_b
		// @00DF: if_acmpeq @00E6
		// @00E2: goto @00EE
		// @00E5: athrow
		// @00E6: bipush 15 (0x0F)
		// @00E8: anewarray game.C_100153_be
		// @00EB: putstatic game.C_100153_be[] game.C_100006_fj.field_103620_b
		// @00EE: aconst_null
		// @00EF: getstatic game.C_100153_be[] game.C_100281_ng.field_103462_H
		// @00F2: if_acmpne @012F
		// @00F5: bipush 18 (0x12)
		// @00F7: anewarray game.C_100153_be
		// @00FA: putstatic game.C_100153_be[] game.C_100281_ng.field_103462_H
		// @00FD: iconst_0
		// @00FE: istore_2
		// @00FF: bipush -19 (0xED)
		// @0101: iload_2
		// @0102: iconst_m1
		// @0103: ixor
		// @0104: if_icmpge @012F
		// @0107: getstatic game.C_100153_be[] game.C_100281_ng.field_103462_H
		// @010A: iload_2
		// @010B: getstatic game.C_100153_be game.C_100115_ej.field_102041_Xb
		// @010E: aastore
		// @010F: iinc #2 +1
		// @0112: iload #4
		// @0114: ifne @0139
		// @0117: iload #4
		// @0119: ifeq @00FF
		// @011C: goto @0120
		// @011F: athrow
		// @0120: getstatic boolean game.C_100152_bd.field_105198_g
		// @0123: ifeq @012B
		// @0126: iconst_0
		// @0127: goto @012C
		// @012A: athrow
		// @012B: iconst_1
		// @012C: putstatic boolean game.C_100152_bd.field_105198_g
		// @012F: getstatic game.C_100153_be[] game.C_100186_rl.field_105725_c
		// @0132: ifnull @0139
		// @0135: goto @0141
		// @0138: athrow
		// @0139: bipush 10 (0x0A)
		// @013B: anewarray game.C_100153_be
		// @013E: putstatic game.C_100153_be[] game.C_100186_rl.field_105725_c
		// @0141: aconst_null
		// @0142: getstatic game.C_100153_be[] game.C_100313_lg.field_107166_b
		// @0145: if_acmpeq @014C
		// @0148: goto @0154
		// @014B: athrow
		// @014C: bipush 15 (0x0F)
		// @014E: anewarray game.C_100153_be
		// @0151: putstatic game.C_100153_be[] game.C_100313_lg.field_107166_b
		// @0154: new game.C_100327_ib
		// @0157: dup
		// @0158: getstatic game.C_100153_be[] game.C_100327_ib.field_102482_B
		// @015B: iconst_0
		// @015C: aaload
		// @015D: iconst_1
		// @015E: bipush 32 (0x20)
		// @0160: bipush 53 (0x35)
		// @0162: iconst_0
		// @0163: iconst_0
		// @0164: iconst_5
		// @0165: anewarray game.C_100049_vf
		// @0168: dup
		// @0169: iconst_0
		// @016A: new game.C_100049_vf
		// @016D: dup
		// @016E: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @0171: bipush 66 (0x42)
		// @0173: aaload
		// @0174: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @0177: aastore
		// @0178: dup
		// @0179: iconst_1
		// @017A: new game.C_100049_vf
		// @017D: dup
		// @017E: iconst_1
		// @017F: iconst_1
		// @0180: bipush 100 (0x64)
		// @0182: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @0185: aastore
		// @0186: dup
		// @0187: iconst_2
		// @0188: new game.C_100049_vf
		// @018B: dup
		// @018C: bipush 64 (0x40)
		// @018E: invokespecial game.C_100049_vf.<init>(int)void
		// @0191: aastore
		// @0192: dup
		// @0193: iconst_3
		// @0194: new game.C_100049_vf
		// @0197: dup
		// @0198: bipush 58 (0x3A)
		// @019A: bipush -20 (0xEC)
		// @019C: sipush 16384 (0x4000)
		// @019F: sipush 16384 (0x4000)
		// @01A2: sipush 144 (0x0090)
		// @01A5: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @01A8: aastore
		// @01A9: dup
		// @01AA: iconst_4
		// @01AB: new game.C_100049_vf
		// @01AE: dup
		// @01AF: bipush 58 (0x3A)
		// @01B1: bipush -20 (0xEC)
		// @01B3: sipush 16384 (0x4000)
		// @01B6: sipush 16384 (0x4000)
		// @01B9: sipush 144 (0x0090)
		// @01BC: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @01BF: aastore
		// @01C0: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @01C3: astore_1
		// @01C4: aload_1
		// @01C5: bipush 109 (0x6D)
		// @01C7: putfield int game.C_100327_ib.field_102494_P
		// @01CA: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @01CD: bipush 123 (0x7B)
		// @01CF: aload_1
		// @01D0: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @01D3: new game.C_100327_ib
		// @01D6: dup
		// @01D7: getstatic game.C_100153_be[] game.C_100015_wh.field_103790_m
		// @01DA: iconst_0
		// @01DB: aaload
		// @01DC: iconst_1
		// @01DD: bipush 64 (0x40)
		// @01DF: bipush 98 (0x62)
		// @01E1: iconst_0
		// @01E2: iconst_0
		// @01E3: iconst_5
		// @01E4: anewarray game.C_100049_vf
		// @01E7: dup
		// @01E8: iconst_0
		// @01E9: new game.C_100049_vf
		// @01EC: dup
		// @01ED: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @01F0: bipush 66 (0x42)
		// @01F2: aaload
		// @01F3: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @01F6: aastore
		// @01F7: dup
		// @01F8: iconst_1
		// @01F9: new game.C_100049_vf
		// @01FC: dup
		// @01FD: bipush 100 (0x64)
		// @01FF: iconst_4
		// @0200: sipush 200 (0x00C8)
		// @0203: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @0206: aastore
		// @0207: dup
		// @0208: iconst_2
		// @0209: new game.C_100049_vf
		// @020C: dup
		// @020D: bipush 64 (0x40)
		// @020F: invokespecial game.C_100049_vf.<init>(int)void
		// @0212: aastore
		// @0213: dup
		// @0214: iconst_3
		// @0215: new game.C_100049_vf
		// @0218: dup
		// @0219: bipush 64 (0x40)
		// @021B: bipush 35 (0x23)
		// @021D: sipush -8192 (0xE000)
		// @0220: sipush 16384 (0x4000)
		// @0223: new game.C_100327_ib
		// @0226: dup
		// @0227: getstatic game.C_100153_be[] game.C_100166_sg.field_105465_e
		// @022A: bipush 6 (0x06)
		// @022C: aaload
		// @022D: bipush 50 (0x32)
		// @022F: bipush 63 (0x3F)
		// @0231: iconst_1
		// @0232: anewarray game.C_100049_vf
		// @0235: dup
		// @0236: iconst_0
		// @0237: new game.C_100049_vf
		// @023A: dup
		// @023B: bipush 74 (0x4A)
		// @023D: bipush 62 (0x3E)
		// @023F: sipush 16384 (0x4000)
		// @0242: iconst_0
		// @0243: sipush 288 (0x0120)
		// @0246: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @0249: aastore
		// @024A: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @024D: iconst_1
		// @024E: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @0251: aastore
		// @0252: dup
		// @0253: iconst_4
		// @0254: new game.C_100049_vf
		// @0257: dup
		// @0258: bipush 64 (0x40)
		// @025A: bipush 70 (0x46)
		// @025C: iconst_0
		// @025D: iconst_0
		// @025E: new game.C_100327_ib
		// @0261: dup
		// @0262: getstatic game.C_100153_be[] game.C_100015_wh.field_103790_m
		// @0265: iconst_1
		// @0266: aaload
		// @0267: bipush 64 (0x40)
		// @0269: bipush 70 (0x46)
		// @026B: iconst_0
		// @026C: anewarray game.C_100049_vf
		// @026F: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @0272: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @0275: aastore
		// @0276: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @0279: astore_1
		// @027A: aload_1
		// @027B: bipush 107 (0x6B)
		// @027D: putfield int game.C_100327_ib.field_102494_P
		// @0280: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @0283: bipush 124 (0x7C)
		// @0285: aload_1
		// @0286: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0289: new game.C_100327_ib
		// @028C: dup
		// @028D: getstatic game.C_100153_be[] game.C_100015_wh.field_103790_m
		// @0290: iconst_2
		// @0291: aaload
		// @0292: iconst_1
		// @0293: bipush 64 (0x40)
		// @0295: sipush 140 (0x008C)
		// @0298: iconst_0
		// @0299: iconst_0
		// @029A: bipush 6 (0x06)
		// @029C: anewarray game.C_100049_vf
		// @029F: dup
		// @02A0: iconst_0
		// @02A1: new game.C_100049_vf
		// @02A4: dup
		// @02A5: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @02A8: bipush 7 (0x07)
		// @02AA: aaload
		// @02AB: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @02AE: aastore
		// @02AF: dup
		// @02B0: iconst_1
		// @02B1: new game.C_100049_vf
		// @02B4: dup
		// @02B5: bipush 100 (0x64)
		// @02B7: iconst_4
		// @02B8: sipush 300 (0x012C)
		// @02BB: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @02BE: aastore
		// @02BF: dup
		// @02C0: iconst_2
		// @02C1: new game.C_100049_vf
		// @02C4: dup
		// @02C5: sipush 200 (0x00C8)
		// @02C8: sipush 200 (0x00C8)
		// @02CB: invokespecial game.C_100049_vf.<init>(int, int)void
		// @02CE: aastore
		// @02CF: dup
		// @02D0: iconst_3
		// @02D1: new game.C_100049_vf
		// @02D4: dup
		// @02D5: bipush 64 (0x40)
		// @02D7: invokespecial game.C_100049_vf.<init>(int)void
		// @02DA: aastore
		// @02DB: dup
		// @02DC: iconst_4
		// @02DD: new game.C_100049_vf
		// @02E0: dup
		// @02E1: bipush 64 (0x40)
		// @02E3: bipush 34 (0x22)
		// @02E5: sipush 16384 (0x4000)
		// @02E8: iconst_0
		// @02E9: bipush 10 (0x0A)
		// @02EB: iconst_1
		// @02EC: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @02EF: aastore
		// @02F0: dup
		// @02F1: iconst_5
		// @02F2: new game.C_100049_vf
		// @02F5: dup
		// @02F6: bipush 64 (0x40)
		// @02F8: bipush 94 (0x5E)
		// @02FA: sipush 8192 (0x2000)
		// @02FD: sipush 16384 (0x4000)
		// @0300: new game.C_100327_ib
		// @0303: dup
		// @0304: getstatic game.C_100153_be[] game.C_100166_sg.field_105465_e
		// @0307: bipush 6 (0x06)
		// @0309: aaload
		// @030A: bipush 50 (0x32)
		// @030C: bipush 63 (0x3F)
		// @030E: iconst_1
		// @030F: anewarray game.C_100049_vf
		// @0312: dup
		// @0313: iconst_0
		// @0314: new game.C_100049_vf
		// @0317: dup
		// @0318: bipush 74 (0x4A)
		// @031A: bipush 62 (0x3E)
		// @031C: sipush 16384 (0x4000)
		// @031F: iconst_0
		// @0320: sipush 288 (0x0120)
		// @0323: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @0326: aastore
		// @0327: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @032A: iconst_1
		// @032B: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @032E: aastore
		// @032F: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @0332: astore_1
		// @0333: aload_1
		// @0334: bipush 108 (0x6C)
		// @0336: putfield int game.C_100327_ib.field_102494_P
		// @0339: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @033C: bipush 124 (0x7C)
		// @033E: aload_1
		// @033F: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0342: new game.C_100327_ib
		// @0345: dup
		// @0346: getstatic game.C_100153_be[] game.C_100166_sg.field_105465_e
		// @0349: iconst_2
		// @034A: aaload
		// @034B: iconst_2
		// @034C: bipush 58 (0x3A)
		// @034E: bipush 63 (0x3F)
		// @0350: sipush -16384 (0xC000)
		// @0353: sipush 4096 (0x1000)
		// @0356: iconst_3
		// @0357: anewarray game.C_100049_vf
		// @035A: dup
		// @035B: iconst_0
		// @035C: new game.C_100049_vf
		// @035F: dup
		// @0360: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @0363: bipush 107 (0x6B)
		// @0365: aaload
		// @0366: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @0369: aastore
		// @036A: dup
		// @036B: iconst_1
		// @036C: new game.C_100049_vf
		// @036F: dup
		// @0370: bipush 100 (0x64)
		// @0372: iconst_1
		// @0373: sipush 325 (0x0145)
		// @0376: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @0379: aastore
		// @037A: dup
		// @037B: iconst_2
		// @037C: new game.C_100049_vf
		// @037F: dup
		// @0380: bipush 80 (0x50)
		// @0382: bipush 68 (0x44)
		// @0384: sipush 16384 (0x4000)
		// @0387: sipush 4096 (0x1000)
		// @038A: bipush 16 (0x10)
		// @038C: iconst_1
		// @038D: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @0390: aastore
		// @0391: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @0394: astore_1
		// @0395: aload_1
		// @0396: iconst_1
		// @0397: putfield int game.C_100327_ib.field_102494_P
		// @039A: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @039D: bipush 125 (0x7D)
		// @039F: aload_1
		// @03A0: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @03A3: new game.C_100327_ib
		// @03A6: dup
		// @03A7: getstatic game.C_100153_be[] game.C_100166_sg.field_105465_e
		// @03AA: iconst_4
		// @03AB: aaload
		// @03AC: iconst_4
		// @03AD: bipush 64 (0x40)
		// @03AF: bipush 55 (0x37)
		// @03B1: sipush -12288 (0xD000)
		// @03B4: sipush 4096 (0x1000)
		// @03B7: iconst_3
		// @03B8: anewarray game.C_100049_vf
		// @03BB: dup
		// @03BC: iconst_0
		// @03BD: new game.C_100049_vf
		// @03C0: dup
		// @03C1: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @03C4: bipush 38 (0x26)
		// @03C6: aaload
		// @03C7: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @03CA: aastore
		// @03CB: dup
		// @03CC: iconst_1
		// @03CD: new game.C_100049_vf
		// @03D0: dup
		// @03D1: bipush 50 (0x32)
		// @03D3: iconst_0
		// @03D4: sipush 325 (0x0145)
		// @03D7: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @03DA: aastore
		// @03DB: dup
		// @03DC: iconst_2
		// @03DD: new game.C_100049_vf
		// @03E0: dup
		// @03E1: bipush 64 (0x40)
		// @03E3: bipush 77 (0x4D)
		// @03E5: iconst_0
		// @03E6: sipush 4096 (0x1000)
		// @03E9: new game.C_100327_ib
		// @03EC: dup
		// @03ED: getstatic game.C_100153_be[] game.C_100166_sg.field_105465_e
		// @03F0: bipush 6 (0x06)
		// @03F2: aaload
		// @03F3: bipush 50 (0x32)
		// @03F5: bipush 63 (0x3F)
		// @03F7: iconst_1
		// @03F8: anewarray game.C_100049_vf
		// @03FB: dup
		// @03FC: iconst_0
		// @03FD: new game.C_100049_vf
		// @0400: dup
		// @0401: bipush 74 (0x4A)
		// @0403: bipush 62 (0x3E)
		// @0405: sipush 16384 (0x4000)
		// @0408: iconst_0
		// @0409: sipush 288 (0x0120)
		// @040C: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @040F: aastore
		// @0410: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @0413: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @0416: aastore
		// @0417: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @041A: astore_1
		// @041B: aload_1
		// @041C: iconst_2
		// @041D: putfield int game.C_100327_ib.field_102494_P
		// @0420: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @0423: bipush 124 (0x7C)
		// @0425: aload_1
		// @0426: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0429: new game.C_100327_ib
		// @042C: dup
		// @042D: getstatic game.C_100153_be[] game.C_100166_sg.field_105465_e
		// @0430: iconst_3
		// @0431: aaload
		// @0432: bipush 8 (0x08)
		// @0434: bipush 67 (0x43)
		// @0436: bipush 78 (0x4E)
		// @0438: sipush -21845 (0xAAAB)
		// @043B: sipush 8192 (0x2000)
		// @043E: iconst_5
		// @043F: anewarray game.C_100049_vf
		// @0442: dup
		// @0443: iconst_0
		// @0444: new game.C_100049_vf
		// @0447: dup
		// @0448: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @044B: bipush 74 (0x4A)
		// @044D: aaload
		// @044E: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @0451: aastore
		// @0452: dup
		// @0453: iconst_1
		// @0454: new game.C_100049_vf
		// @0457: dup
		// @0458: bipush 50 (0x32)
		// @045A: iconst_0
		// @045B: bipush 100 (0x64)
		// @045D: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @0460: aastore
		// @0461: dup
		// @0462: iconst_2
		// @0463: new game.C_100049_vf
		// @0466: dup
		// @0467: bipush 81 (0x51)
		// @0469: bipush 40 (0x28)
		// @046B: sipush 16384 (0x4000)
		// @046E: sipush 1024 (0x0400)
		// @0471: sipush 128 (0x0080)
		// @0474: iconst_1
		// @0475: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @0478: aastore
		// @0479: dup
		// @047A: iconst_3
		// @047B: new game.C_100049_vf
		// @047E: dup
		// @047F: bipush 82 (0x52)
		// @0481: bipush 47 (0x2F)
		// @0483: sipush 16384 (0x4000)
		// @0486: sipush 1024 (0x0400)
		// @0489: sipush 128 (0x0080)
		// @048C: iconst_1
		// @048D: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @0490: aastore
		// @0491: dup
		// @0492: iconst_4
		// @0493: new game.C_100049_vf
		// @0496: dup
		// @0497: bipush 83 (0x53)
		// @0499: bipush 54 (0x36)
		// @049B: sipush 16384 (0x4000)
		// @049E: sipush 1024 (0x0400)
		// @04A1: sipush 128 (0x0080)
		// @04A4: iconst_1
		// @04A5: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @04A8: aastore
		// @04A9: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @04AC: astore_1
		// @04AD: aload_1
		// @04AE: iconst_3
		// @04AF: putfield int game.C_100327_ib.field_102494_P
		// @04B2: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @04B5: bipush 123 (0x7B)
		// @04B7: aload_1
		// @04B8: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @04BB: new game.C_100327_ib
		// @04BE: dup
		// @04BF: getstatic game.C_100153_be[] game.C_100166_sg.field_105465_e
		// @04C2: iconst_1
		// @04C3: aaload
		// @04C4: iconst_1
		// @04C5: bipush 64 (0x40)
		// @04C7: sipush 138 (0x008A)
		// @04CA: iconst_0
		// @04CB: iconst_0
		// @04CC: bipush 6 (0x06)
		// @04CE: anewarray game.C_100049_vf
		// @04D1: dup
		// @04D2: iconst_0
		// @04D3: new game.C_100049_vf
		// @04D6: dup
		// @04D7: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @04DA: bipush 54 (0x36)
		// @04DC: aaload
		// @04DD: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @04E0: aastore
		// @04E1: dup
		// @04E2: iconst_1
		// @04E3: new game.C_100049_vf
		// @04E6: dup
		// @04E7: sipush 300 (0x012C)
		// @04EA: iconst_3
		// @04EB: sipush 1150 (0x047E)
		// @04EE: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @04F1: aastore
		// @04F2: dup
		// @04F3: iconst_2
		// @04F4: new game.C_100049_vf
		// @04F7: dup
		// @04F8: bipush 64 (0x40)
		// @04FA: invokespecial game.C_100049_vf.<init>(int)void
		// @04FD: aastore
		// @04FE: dup
		// @04FF: iconst_3
		// @0500: new game.C_100049_vf
		// @0503: dup
		// @0504: sipush 150 (0x0096)
		// @0507: sipush 175 (0x00AF)
		// @050A: invokespecial game.C_100049_vf.<init>(int, int)void
		// @050D: aastore
		// @050E: dup
		// @050F: iconst_4
		// @0510: new game.C_100049_vf
		// @0513: dup
		// @0514: bipush 66 (0x42)
		// @0516: bipush 94 (0x5E)
		// @0518: iconst_0
		// @0519: iconst_0
		// @051A: new game.C_100327_ib
		// @051D: dup
		// @051E: getstatic game.C_100153_be[] game.C_100166_sg.field_105465_e
		// @0521: bipush 8 (0x08)
		// @0523: aaload
		// @0524: bipush 64 (0x40)
		// @0526: bipush 45 (0x2D)
		// @0528: iconst_1
		// @0529: anewarray game.C_100049_vf
		// @052C: dup
		// @052D: iconst_0
		// @052E: new game.C_100049_vf
		// @0531: dup
		// @0532: ldc "A"
		// @0534: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @0537: aastore
		// @0538: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @053B: iconst_0
		// @053C: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @053F: aastore
		// @0540: dup
		// @0541: iconst_5
		// @0542: new game.C_100049_vf
		// @0545: dup
		// @0546: bipush 68 (0x44)
		// @0548: bipush 60 (0x3C)
		// @054A: iconst_0
		// @054B: iconst_0
		// @054C: new game.C_100327_ib
		// @054F: dup
		// @0550: getstatic game.C_100153_be[] game.C_100166_sg.field_105465_e
		// @0553: bipush 7 (0x07)
		// @0555: aaload
		// @0556: bipush 66 (0x42)
		// @0558: bipush 70 (0x46)
		// @055A: bipush 6 (0x06)
		// @055C: anewarray game.C_100049_vf
		// @055F: dup
		// @0560: iconst_0
		// @0561: new game.C_100049_vf
		// @0564: dup
		// @0565: ldc "B"
		// @0567: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @056A: aastore
		// @056B: dup
		// @056C: iconst_1
		// @056D: new game.C_100049_vf
		// @0570: dup
		// @0571: bipush 46 (0x2E)
		// @0573: bipush 26 (0x1A)
		// @0575: sipush 4681 (0x1249)
		// @0578: sipush 4096 (0x1000)
		// @057B: sipush 768 (0x0300)
		// @057E: iconst_1
		// @057F: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @0582: aastore
		// @0583: dup
		// @0584: iconst_2
		// @0585: new game.C_100049_vf
		// @0588: dup
		// @0589: bipush 64 (0x40)
		// @058B: bipush 41 (0x29)
		// @058D: sipush 16384 (0x4000)
		// @0590: iconst_0
		// @0591: sipush 1024 (0x0400)
		// @0594: iconst_1
		// @0595: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @0598: aastore
		// @0599: dup
		// @059A: iconst_3
		// @059B: new game.C_100049_vf
		// @059E: dup
		// @059F: bipush 66 (0x42)
		// @05A1: bipush 19 (0x13)
		// @05A3: sipush 16384 (0x4000)
		// @05A6: iconst_0
		// @05A7: iconst_2
		// @05A8: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @05AB: aastore
		// @05AC: dup
		// @05AD: iconst_4
		// @05AE: new game.C_100049_vf
		// @05B1: dup
		// @05B2: bipush 54 (0x36)
		// @05B4: bipush 31 (0x1F)
		// @05B6: sipush 16384 (0x4000)
		// @05B9: iconst_0
		// @05BA: bipush 8 (0x08)
		// @05BC: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @05BF: aastore
		// @05C0: dup
		// @05C1: iconst_5
		// @05C2: new game.C_100049_vf
		// @05C5: dup
		// @05C6: bipush 54 (0x36)
		// @05C8: bipush 41 (0x29)
		// @05CA: sipush 16384 (0x4000)
		// @05CD: iconst_0
		// @05CE: iconst_4
		// @05CF: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @05D2: aastore
		// @05D3: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @05D6: iconst_0
		// @05D7: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @05DA: aastore
		// @05DB: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @05DE: astore_1
		// @05DF: aload_1
		// @05E0: iconst_0
		// @05E1: putfield int game.C_100327_ib.field_102494_P
		// @05E4: iload_0
		// @05E5: aload_1
		// @05E6: invokestatic game.C_100226_ae.func_106142_a(boolean, game.C_100327_ib)game.C_100327_ib
		// @05E9: astore_1
		// @05EA: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @05ED: bipush 127 (0x7F)
		// @05EF: aload_1
		// @05F0: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @05F3: new game.C_100327_ib
		// @05F6: dup
		// @05F7: getstatic game.C_100153_be[] game.C_100166_sg.field_105465_e
		// @05FA: iconst_4
		// @05FB: aaload
		// @05FC: sipush 1024 (0x0400)
		// @05FF: bipush 64 (0x40)
		// @0601: bipush 55 (0x37)
		// @0603: sipush -16384 (0xC000)
		// @0606: sipush 4096 (0x1000)
		// @0609: iconst_2
		// @060A: anewarray game.C_100049_vf
		// @060D: dup
		// @060E: iconst_0
		// @060F: new game.C_100049_vf
		// @0612: dup
		// @0613: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @0616: bipush 72 (0x48)
		// @0618: aaload
		// @0619: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @061C: aastore
		// @061D: dup
		// @061E: iconst_1
		// @061F: new game.C_100049_vf
		// @0622: dup
		// @0623: bipush 64 (0x40)
		// @0625: bipush 77 (0x4D)
		// @0627: iconst_0
		// @0628: sipush 4096 (0x1000)
		// @062B: new game.C_100327_ib
		// @062E: dup
		// @062F: getstatic game.C_100153_be[] game.C_100166_sg.field_105465_e
		// @0632: bipush 6 (0x06)
		// @0634: aaload
		// @0635: bipush 50 (0x32)
		// @0637: bipush 63 (0x3F)
		// @0639: iconst_1
		// @063A: anewarray game.C_100049_vf
		// @063D: dup
		// @063E: iconst_0
		// @063F: new game.C_100049_vf
		// @0642: dup
		// @0643: bipush 74 (0x4A)
		// @0645: bipush 63 (0x3F)
		// @0647: sipush 16384 (0x4000)
		// @064A: iconst_0
		// @064B: sipush 288 (0x0120)
		// @064E: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @0651: aastore
		// @0652: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @0655: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @0658: aastore
		// @0659: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @065C: astore_1
		// @065D: aload_1
		// @065E: bipush 96 (0x60)
		// @0660: putfield int game.C_100327_ib.field_102494_P
		// @0663: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @0666: bipush 126 (0x7E)
		// @0668: aload_1
		// @0669: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @066C: new game.C_100327_ib
		// @066F: dup
		// @0670: getstatic game.C_100153_be[] game.C_100213_ak.field_105997_c
		// @0673: iconst_0
		// @0674: aaload
		// @0675: iconst_2
		// @0676: bipush 52 (0x34)
		// @0678: bipush 68 (0x44)
		// @067A: sipush -16384 (0xC000)
		// @067D: sipush 1024 (0x0400)
		// @0680: iconst_3
		// @0681: anewarray game.C_100049_vf
		// @0684: dup
		// @0685: iconst_0
		// @0686: new game.C_100049_vf
		// @0689: dup
		// @068A: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @068D: bipush 19 (0x13)
		// @068F: aaload
		// @0690: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @0693: aastore
		// @0694: dup
		// @0695: iconst_1
		// @0696: new game.C_100049_vf
		// @0699: dup
		// @069A: sipush 250 (0x00FA)
		// @069D: iconst_0
		// @069E: sipush 275 (0x0113)
		// @06A1: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @06A4: aastore
		// @06A5: dup
		// @06A6: iconst_2
		// @06A7: new game.C_100049_vf
		// @06AA: dup
		// @06AB: bipush 56 (0x38)
		// @06AD: bipush 62 (0x3E)
		// @06AF: sipush 16384 (0x4000)
		// @06B2: sipush 5461 (0x1555)
		// @06B5: sipush 400 (0x0190)
		// @06B8: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @06BB: aastore
		// @06BC: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @06BF: astore_1
		// @06C0: aload_1
		// @06C1: bipush 53 (0x35)
		// @06C3: putfield int game.C_100327_ib.field_102494_P
		// @06C6: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @06C9: bipush 126 (0x7E)
		// @06CB: aload_1
		// @06CC: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @06CF: new game.C_100327_ib
		// @06D2: dup
		// @06D3: getstatic game.C_100153_be[] game.C_100213_ak.field_105997_c
		// @06D6: bipush 8 (0x08)
		// @06D8: aaload
		// @06D9: bipush 8 (0x08)
		// @06DB: bipush 65 (0x41)
		// @06DD: bipush 68 (0x44)
		// @06DF: sipush -16384 (0xC000)
		// @06E2: sipush 4096 (0x1000)
		// @06E5: iconst_3
		// @06E6: anewarray game.C_100049_vf
		// @06E9: dup
		// @06EA: iconst_0
		// @06EB: new game.C_100049_vf
		// @06EE: dup
		// @06EF: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @06F2: bipush 123 (0x7B)
		// @06F4: aaload
		// @06F5: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @06F8: aastore
		// @06F9: dup
		// @06FA: iconst_1
		// @06FB: new game.C_100049_vf
		// @06FE: dup
		// @06FF: bipush 100 (0x64)
		// @0701: iconst_0
		// @0702: sipush 550 (0x0226)
		// @0705: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @0708: aastore
		// @0709: dup
		// @070A: iconst_2
		// @070B: new game.C_100049_vf
		// @070E: dup
		// @070F: bipush 80 (0x50)
		// @0711: bipush 63 (0x3F)
		// @0713: sipush 16384 (0x4000)
		// @0716: sipush 1024 (0x0400)
		// @0719: sipush 288 (0x0120)
		// @071C: iconst_1
		// @071D: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @0720: aastore
		// @0721: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @0724: astore_1
		// @0725: aload_1
		// @0726: bipush 54 (0x36)
		// @0728: putfield int game.C_100327_ib.field_102494_P
		// @072B: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @072E: bipush 123 (0x7B)
		// @0730: aload_1
		// @0731: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0734: new game.C_100327_ib
		// @0737: dup
		// @0738: getstatic game.C_100153_be[] game.C_100213_ak.field_105997_c
		// @073B: bipush 6 (0x06)
		// @073D: aaload
		// @073E: iconst_4
		// @073F: bipush 76 (0x4C)
		// @0741: bipush 42 (0x2A)
		// @0743: sipush -16384 (0xC000)
		// @0746: sipush 2048 (0x0800)
		// @0749: iconst_3
		// @074A: anewarray game.C_100049_vf
		// @074D: dup
		// @074E: iconst_0
		// @074F: new game.C_100049_vf
		// @0752: dup
		// @0753: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @0756: bipush 68 (0x44)
		// @0758: aaload
		// @0759: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @075C: aastore
		// @075D: dup
		// @075E: iconst_1
		// @075F: new game.C_100049_vf
		// @0762: dup
		// @0763: sipush 250 (0x00FA)
		// @0766: iconst_0
		// @0767: sipush 425 (0x01A9)
		// @076A: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @076D: aastore
		// @076E: dup
		// @076F: iconst_2
		// @0770: new game.C_100049_vf
		// @0773: dup
		// @0774: bipush 55 (0x37)
		// @0776: bipush 88 (0x58)
		// @0778: iconst_0
		// @0779: sipush 2048 (0x0800)
		// @077C: new game.C_100327_ib
		// @077F: dup
		// @0780: getstatic game.C_100153_be[] game.C_100213_ak.field_105997_c
		// @0783: bipush 7 (0x07)
		// @0785: aaload
		// @0786: bipush 39 (0x27)
		// @0788: bipush 56 (0x38)
		// @078A: iconst_2
		// @078B: anewarray game.C_100049_vf
		// @078E: dup
		// @078F: iconst_0
		// @0790: new game.C_100049_vf
		// @0793: dup
		// @0794: bipush 80 (0x50)
		// @0796: bipush 58 (0x3A)
		// @0798: sipush 16384 (0x4000)
		// @079B: iconst_0
		// @079C: sipush 288 (0x0120)
		// @079F: iconst_1
		// @07A0: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @07A3: aastore
		// @07A4: dup
		// @07A5: iconst_1
		// @07A6: new game.C_100049_vf
		// @07A9: dup
		// @07AA: bipush 80 (0x50)
		// @07AC: bipush 79 (0x4F)
		// @07AE: sipush 16384 (0x4000)
		// @07B1: iconst_0
		// @07B2: sipush 288 (0x0120)
		// @07B5: iconst_1
		// @07B6: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @07B9: aastore
		// @07BA: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @07BD: iconst_0
		// @07BE: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @07C1: aastore
		// @07C2: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @07C5: astore_1
		// @07C6: aload_1
		// @07C7: bipush 56 (0x38)
		// @07C9: putfield int game.C_100327_ib.field_102494_P
		// @07CC: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @07CF: bipush 126 (0x7E)
		// @07D1: aload_1
		// @07D2: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @07D5: new game.C_100327_ib
		// @07D8: dup
		// @07D9: getstatic game.C_100153_be[] game.C_100213_ak.field_105997_c
		// @07DC: bipush 6 (0x06)
		// @07DE: aaload
		// @07DF: sipush 1024 (0x0400)
		// @07E2: bipush 76 (0x4C)
		// @07E4: bipush 42 (0x2A)
		// @07E6: sipush -16384 (0xC000)
		// @07E9: sipush 2048 (0x0800)
		// @07EC: iconst_1
		// @07ED: anewarray game.C_100049_vf
		// @07F0: dup
		// @07F1: iconst_0
		// @07F2: new game.C_100049_vf
		// @07F5: dup
		// @07F6: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @07F9: bipush 56 (0x38)
		// @07FB: aaload
		// @07FC: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @07FF: aastore
		// @0800: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @0803: astore_1
		// @0804: aload_1
		// @0805: bipush 97 (0x61)
		// @0807: putfield int game.C_100327_ib.field_102494_P
		// @080A: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @080D: bipush 125 (0x7D)
		// @080F: aload_1
		// @0810: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0813: new game.C_100327_ib
		// @0816: dup
		// @0817: getstatic game.C_100153_be[] game.C_100213_ak.field_105997_c
		// @081A: iconst_2
		// @081B: aaload
		// @081C: iconst_1
		// @081D: bipush 64 (0x40)
		// @081F: sipush 188 (0x00BC)
		// @0822: iconst_0
		// @0823: iconst_0
		// @0824: bipush 13 (0x0D)
		// @0826: anewarray game.C_100049_vf
		// @0829: dup
		// @082A: iconst_0
		// @082B: new game.C_100049_vf
		// @082E: dup
		// @082F: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @0832: iconst_5
		// @0833: aaload
		// @0834: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @0837: aastore
		// @0838: dup
		// @0839: iconst_1
		// @083A: new game.C_100049_vf
		// @083D: dup
		// @083E: sipush 400 (0x0190)
		// @0841: iconst_1
		// @0842: sipush 925 (0x039D)
		// @0845: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @0848: aastore
		// @0849: dup
		// @084A: iconst_2
		// @084B: new game.C_100049_vf
		// @084E: dup
		// @084F: bipush 16 (0x10)
		// @0851: invokespecial game.C_100049_vf.<init>(int)void
		// @0854: aastore
		// @0855: dup
		// @0856: iconst_3
		// @0857: new game.C_100049_vf
		// @085A: dup
		// @085B: iconst_0
		// @085C: sipush 400 (0x0190)
		// @085F: invokespecial game.C_100049_vf.<init>(int, int)void
		// @0862: aastore
		// @0863: dup
		// @0864: iconst_4
		// @0865: new game.C_100049_vf
		// @0868: dup
		// @0869: bipush 80 (0x50)
		// @086B: bipush 68 (0x44)
		// @086D: iconst_0
		// @086E: sipush 2048 (0x0800)
		// @0871: new game.C_100327_ib
		// @0874: dup
		// @0875: getstatic game.C_100153_be[] game.C_100213_ak.field_105997_c
		// @0878: iconst_5
		// @0879: aaload
		// @087A: bipush 87 (0x57)
		// @087C: bipush 33 (0x21)
		// @087E: iconst_2
		// @087F: anewarray game.C_100049_vf
		// @0882: dup
		// @0883: iconst_0
		// @0884: new game.C_100049_vf
		// @0887: dup
		// @0888: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @088B: bipush 103 (0x67)
		// @088D: aaload
		// @088E: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @0891: aastore
		// @0892: dup
		// @0893: iconst_1
		// @0894: new game.C_100049_vf
		// @0897: dup
		// @0898: bipush 39 (0x27)
		// @089A: bipush 80 (0x50)
		// @089C: iconst_0
		// @089D: sipush 2048 (0x0800)
		// @08A0: new game.C_100327_ib
		// @08A3: dup
		// @08A4: getstatic game.C_100153_be[] game.C_100213_ak.field_105997_c
		// @08A7: iconst_3
		// @08A8: aaload
		// @08A9: bipush 45 (0x2D)
		// @08AB: bipush 44 (0x2C)
		// @08AD: iconst_2
		// @08AE: anewarray game.C_100049_vf
		// @08B1: dup
		// @08B2: iconst_0
		// @08B3: new game.C_100049_vf
		// @08B6: dup
		// @08B7: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @08BA: bipush 16 (0x10)
		// @08BC: aaload
		// @08BD: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @08C0: aastore
		// @08C1: dup
		// @08C2: iconst_1
		// @08C3: new game.C_100049_vf
		// @08C6: dup
		// @08C7: bipush 86 (0x56)
		// @08C9: bipush 87 (0x57)
		// @08CB: iconst_0
		// @08CC: sipush 2048 (0x0800)
		// @08CF: new game.C_100327_ib
		// @08D2: dup
		// @08D3: getstatic game.C_100153_be[] game.C_100213_ak.field_105997_c
		// @08D6: iconst_1
		// @08D7: aaload
		// @08D8: bipush 65 (0x41)
		// @08DA: bipush 96 (0x60)
		// @08DC: iconst_3
		// @08DD: anewarray game.C_100049_vf
		// @08E0: dup
		// @08E1: iconst_0
		// @08E2: new game.C_100049_vf
		// @08E5: dup
		// @08E6: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @08E9: bipush 64 (0x40)
		// @08EB: aaload
		// @08EC: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @08EF: aastore
		// @08F0: dup
		// @08F1: iconst_1
		// @08F2: new game.C_100049_vf
		// @08F5: dup
		// @08F6: bipush 58 (0x3A)
		// @08F8: bipush 118 (0x76)
		// @08FA: iconst_0
		// @08FB: sipush 2048 (0x0800)
		// @08FE: new game.C_100327_ib
		// @0901: dup
		// @0902: getstatic game.C_100153_be[] game.C_100213_ak.field_105997_c
		// @0905: iconst_4
		// @0906: aaload
		// @0907: bipush 58 (0x3A)
		// @0909: bipush 118 (0x76)
		// @090B: iconst_1
		// @090C: anewarray game.C_100049_vf
		// @090F: dup
		// @0910: iconst_0
		// @0911: new game.C_100049_vf
		// @0914: dup
		// @0915: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @0918: bipush 101 (0x65)
		// @091A: aaload
		// @091B: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @091E: aastore
		// @091F: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @0922: iconst_1
		// @0923: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @0926: aastore
		// @0927: dup
		// @0928: iconst_2
		// @0929: new game.C_100049_vf
		// @092C: dup
		// @092D: bipush 73 (0x49)
		// @092F: bipush 118 (0x76)
		// @0931: iconst_0
		// @0932: sipush 2048 (0x0800)
		// @0935: new game.C_100327_ib
		// @0938: dup
		// @0939: getstatic game.C_100153_be[] game.C_100213_ak.field_105997_c
		// @093C: bipush 9 (0x09)
		// @093E: aaload
		// @093F: bipush 73 (0x49)
		// @0941: bipush 118 (0x76)
		// @0943: iconst_1
		// @0944: anewarray game.C_100049_vf
		// @0947: dup
		// @0948: iconst_0
		// @0949: new game.C_100049_vf
		// @094C: dup
		// @094D: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @0950: bipush 79 (0x4F)
		// @0952: aaload
		// @0953: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @0956: aastore
		// @0957: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @095A: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @095D: aastore
		// @095E: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @0961: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @0964: aastore
		// @0965: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @0968: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @096B: aastore
		// @096C: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @096F: iconst_1
		// @0970: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @0973: aastore
		// @0974: dup
		// @0975: iconst_5
		// @0976: new game.C_100049_vf
		// @0979: dup
		// @097A: bipush 80 (0x50)
		// @097C: bipush 68 (0x44)
		// @097E: iconst_0
		// @097F: sipush 2048 (0x0800)
		// @0982: new game.C_100327_ib
		// @0985: dup
		// @0986: getstatic game.C_100153_be[] game.C_100213_ak.field_105997_c
		// @0989: iconst_5
		// @098A: aaload
		// @098B: bipush 87 (0x57)
		// @098D: bipush 33 (0x21)
		// @098F: iconst_2
		// @0990: anewarray game.C_100049_vf
		// @0993: dup
		// @0994: iconst_0
		// @0995: new game.C_100049_vf
		// @0998: dup
		// @0999: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @099C: bipush 91 (0x5B)
		// @099E: aaload
		// @099F: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @09A2: aastore
		// @09A3: dup
		// @09A4: iconst_1
		// @09A5: new game.C_100049_vf
		// @09A8: dup
		// @09A9: bipush 39 (0x27)
		// @09AB: bipush 80 (0x50)
		// @09AD: iconst_0
		// @09AE: sipush 2048 (0x0800)
		// @09B1: new game.C_100327_ib
		// @09B4: dup
		// @09B5: getstatic game.C_100153_be[] game.C_100213_ak.field_105997_c
		// @09B8: iconst_3
		// @09B9: aaload
		// @09BA: bipush 45 (0x2D)
		// @09BC: bipush 44 (0x2C)
		// @09BE: iconst_2
		// @09BF: anewarray game.C_100049_vf
		// @09C2: dup
		// @09C3: iconst_0
		// @09C4: new game.C_100049_vf
		// @09C7: dup
		// @09C8: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @09CB: bipush 28 (0x1C)
		// @09CD: aaload
		// @09CE: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @09D1: aastore
		// @09D2: dup
		// @09D3: iconst_1
		// @09D4: new game.C_100049_vf
		// @09D7: dup
		// @09D8: bipush 86 (0x56)
		// @09DA: bipush 87 (0x57)
		// @09DC: iconst_0
		// @09DD: sipush 2048 (0x0800)
		// @09E0: new game.C_100327_ib
		// @09E3: dup
		// @09E4: getstatic game.C_100153_be[] game.C_100213_ak.field_105997_c
		// @09E7: iconst_1
		// @09E8: aaload
		// @09E9: bipush 65 (0x41)
		// @09EB: bipush 96 (0x60)
		// @09ED: iconst_3
		// @09EE: anewarray game.C_100049_vf
		// @09F1: dup
		// @09F2: iconst_0
		// @09F3: new game.C_100049_vf
		// @09F6: dup
		// @09F7: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @09FA: bipush 42 (0x2A)
		// @09FC: aaload
		// @09FD: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @0A00: aastore
		// @0A01: dup
		// @0A02: iconst_1
		// @0A03: new game.C_100049_vf
		// @0A06: dup
		// @0A07: bipush 58 (0x3A)
		// @0A09: bipush 118 (0x76)
		// @0A0B: iconst_0
		// @0A0C: sipush 2048 (0x0800)
		// @0A0F: new game.C_100327_ib
		// @0A12: dup
		// @0A13: getstatic game.C_100153_be[] game.C_100213_ak.field_105997_c
		// @0A16: iconst_4
		// @0A17: aaload
		// @0A18: bipush 58 (0x3A)
		// @0A1A: bipush 118 (0x76)
		// @0A1C: iconst_1
		// @0A1D: anewarray game.C_100049_vf
		// @0A20: dup
		// @0A21: iconst_0
		// @0A22: new game.C_100049_vf
		// @0A25: dup
		// @0A26: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @0A29: bipush 88 (0x58)
		// @0A2B: aaload
		// @0A2C: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @0A2F: aastore
		// @0A30: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @0A33: iconst_1
		// @0A34: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @0A37: aastore
		// @0A38: dup
		// @0A39: iconst_2
		// @0A3A: new game.C_100049_vf
		// @0A3D: dup
		// @0A3E: bipush 73 (0x49)
		// @0A40: bipush 118 (0x76)
		// @0A42: iconst_0
		// @0A43: sipush 2048 (0x0800)
		// @0A46: new game.C_100327_ib
		// @0A49: dup
		// @0A4A: getstatic game.C_100153_be[] game.C_100213_ak.field_105997_c
		// @0A4D: bipush 9 (0x09)
		// @0A4F: aaload
		// @0A50: bipush 73 (0x49)
		// @0A52: bipush 118 (0x76)
		// @0A54: iconst_1
		// @0A55: anewarray game.C_100049_vf
		// @0A58: dup
		// @0A59: iconst_0
		// @0A5A: new game.C_100049_vf
		// @0A5D: dup
		// @0A5E: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @0A61: bipush 104 (0x68)
		// @0A63: aaload
		// @0A64: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @0A67: aastore
		// @0A68: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @0A6B: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @0A6E: aastore
		// @0A6F: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @0A72: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @0A75: aastore
		// @0A76: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @0A79: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @0A7C: aastore
		// @0A7D: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @0A80: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @0A83: aastore
		// @0A84: dup
		// @0A85: bipush 6 (0x06)
		// @0A87: new game.C_100049_vf
		// @0A8A: dup
		// @0A8B: bipush 110 (0x6E)
		// @0A8D: bipush 98 (0x62)
		// @0A8F: sipush 16384 (0x4000)
		// @0A92: iconst_0
		// @0A93: iconst_2
		// @0A94: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @0A97: aastore
		// @0A98: dup
		// @0A99: bipush 7 (0x07)
		// @0A9B: new game.C_100049_vf
		// @0A9E: dup
		// @0A9F: bipush 46 (0x2E)
		// @0AA1: bipush 25 (0x19)
		// @0AA3: sipush 15384 (0x3C18)
		// @0AA6: sipush 2730 (0x0AAA)
		// @0AA9: sipush 144 (0x0090)
		// @0AAC: iconst_1
		// @0AAD: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @0AB0: aastore
		// @0AB1: dup
		// @0AB2: bipush 8 (0x08)
		// @0AB4: new game.C_100049_vf
		// @0AB7: dup
		// @0AB8: bipush 83 (0x53)
		// @0ABA: bipush 33 (0x21)
		// @0ABC: sipush 15384 (0x3C18)
		// @0ABF: sipush 2730 (0x0AAA)
		// @0AC2: sipush 144 (0x0090)
		// @0AC5: iconst_1
		// @0AC6: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @0AC9: aastore
		// @0ACA: dup
		// @0ACB: bipush 9 (0x09)
		// @0ACD: new game.C_100049_vf
		// @0AD0: dup
		// @0AD1: bipush 83 (0x53)
		// @0AD3: bipush 40 (0x28)
		// @0AD5: sipush 15384 (0x3C18)
		// @0AD8: sipush 2730 (0x0AAA)
		// @0ADB: sipush 144 (0x0090)
		// @0ADE: iconst_1
		// @0ADF: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @0AE2: aastore
		// @0AE3: dup
		// @0AE4: bipush 10 (0x0A)
		// @0AE6: new game.C_100049_vf
		// @0AE9: dup
		// @0AEA: bipush 34 (0x22)
		// @0AEC: bipush 28 (0x1C)
		// @0AEE: sipush 16384 (0x4000)
		// @0AF1: iconst_0
		// @0AF2: bipush 8 (0x08)
		// @0AF4: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @0AF7: aastore
		// @0AF8: dup
		// @0AF9: bipush 11 (0x0B)
		// @0AFB: new game.C_100049_vf
		// @0AFE: dup
		// @0AFF: bipush 34 (0x22)
		// @0B01: bipush 38 (0x26)
		// @0B03: sipush 16384 (0x4000)
		// @0B06: iconst_0
		// @0B07: sipush 2052 (0x0804)
		// @0B0A: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @0B0D: aastore
		// @0B0E: dup
		// @0B0F: bipush 12 (0x0C)
		// @0B11: new game.C_100049_vf
		// @0B14: dup
		// @0B15: bipush 34 (0x22)
		// @0B17: bipush 38 (0x26)
		// @0B19: sipush 16384 (0x4000)
		// @0B1C: iconst_0
		// @0B1D: sipush 1024 (0x0400)
		// @0B20: iconst_1
		// @0B21: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @0B24: aastore
		// @0B25: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @0B28: astore_1
		// @0B29: aload_1
		// @0B2A: bipush 55 (0x37)
		// @0B2C: putfield int game.C_100327_ib.field_102494_P
		// @0B2F: iload_0
		// @0B30: aload_1
		// @0B31: invokestatic game.C_100226_ae.func_106142_a(boolean, game.C_100327_ib)game.C_100327_ib
		// @0B34: astore_1
		// @0B35: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @0B38: bipush 126 (0x7E)
		// @0B3A: aload_1
		// @0B3B: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0B3E: new game.C_100327_ib
		// @0B41: dup
		// @0B42: getstatic game.C_100153_be[] game.C_100314_lf.field_101371_Ob
		// @0B45: iconst_4
		// @0B46: aaload
		// @0B47: iconst_2
		// @0B48: bipush 60 (0x3C)
		// @0B4A: bipush 62 (0x3E)
		// @0B4C: sipush -16384 (0xC000)
		// @0B4F: sipush 4096 (0x1000)
		// @0B52: iconst_3
		// @0B53: anewarray game.C_100049_vf
		// @0B56: dup
		// @0B57: iconst_0
		// @0B58: new game.C_100049_vf
		// @0B5B: dup
		// @0B5C: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @0B5F: bipush 119 (0x77)
		// @0B61: aaload
		// @0B62: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @0B65: aastore
		// @0B66: dup
		// @0B67: iconst_1
		// @0B68: new game.C_100049_vf
		// @0B6B: dup
		// @0B6C: bipush 50 (0x32)
		// @0B6E: iconst_2
		// @0B6F: sipush 575 (0x023F)
		// @0B72: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @0B75: aastore
		// @0B76: dup
		// @0B77: iconst_2
		// @0B78: new game.C_100049_vf
		// @0B7B: dup
		// @0B7C: bipush 50 (0x32)
		// @0B7E: iconst_0
		// @0B7F: invokespecial game.C_100049_vf.<init>(int, int)void
		// @0B82: aastore
		// @0B83: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @0B86: astore_1
		// @0B87: aload_1
		// @0B88: bipush 60 (0x3C)
		// @0B8A: putfield int game.C_100327_ib.field_102494_P
		// @0B8D: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @0B90: bipush 126 (0x7E)
		// @0B92: aload_1
		// @0B93: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0B96: new game.C_100327_ib
		// @0B99: dup
		// @0B9A: getstatic game.C_100153_be[] game.C_100314_lf.field_101371_Ob
		// @0B9D: iconst_5
		// @0B9E: aaload
		// @0B9F: bipush 8 (0x08)
		// @0BA1: bipush 63 (0x3F)
		// @0BA3: bipush 50 (0x32)
		// @0BA5: sipush -16384 (0xC000)
		// @0BA8: sipush 4096 (0x1000)
		// @0BAB: iconst_3
		// @0BAC: anewarray game.C_100049_vf
		// @0BAF: dup
		// @0BB0: iconst_0
		// @0BB1: new game.C_100049_vf
		// @0BB4: dup
		// @0BB5: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @0BB8: bipush 24 (0x18)
		// @0BBA: aaload
		// @0BBB: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @0BBE: aastore
		// @0BBF: dup
		// @0BC0: iconst_1
		// @0BC1: new game.C_100049_vf
		// @0BC4: dup
		// @0BC5: bipush 50 (0x32)
		// @0BC7: iconst_0
		// @0BC8: sipush 235 (0x00EB)
		// @0BCB: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @0BCE: aastore
		// @0BCF: dup
		// @0BD0: iconst_2
		// @0BD1: new game.C_100049_vf
		// @0BD4: dup
		// @0BD5: bipush 100 (0x64)
		// @0BD7: bipush 60 (0x3C)
		// @0BD9: invokespecial game.C_100049_vf.<init>(int, int)void
		// @0BDC: aastore
		// @0BDD: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @0BE0: astore_1
		// @0BE1: aload_1
		// @0BE2: bipush 59 (0x3B)
		// @0BE4: putfield int game.C_100327_ib.field_102494_P
		// @0BE7: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @0BEA: bipush 123 (0x7B)
		// @0BEC: aload_1
		// @0BED: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0BF0: new game.C_100327_ib
		// @0BF3: dup
		// @0BF4: getstatic game.C_100153_be[] game.C_100314_lf.field_101371_Ob
		// @0BF7: bipush 7 (0x07)
		// @0BF9: aaload
		// @0BFA: iconst_4
		// @0BFB: bipush 64 (0x40)
		// @0BFD: bipush 45 (0x2D)
		// @0BFF: sipush -13107 (0xCCCD)
		// @0C02: sipush 8192 (0x2000)
		// @0C05: iconst_4
		// @0C06: anewarray game.C_100049_vf
		// @0C09: dup
		// @0C0A: iconst_0
		// @0C0B: new game.C_100049_vf
		// @0C0E: dup
		// @0C0F: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @0C12: bipush 36 (0x24)
		// @0C14: aaload
		// @0C15: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @0C18: aastore
		// @0C19: dup
		// @0C1A: iconst_1
		// @0C1B: new game.C_100049_vf
		// @0C1E: dup
		// @0C1F: bipush 50 (0x32)
		// @0C21: iconst_0
		// @0C22: sipush 175 (0x00AF)
		// @0C25: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @0C28: aastore
		// @0C29: dup
		// @0C2A: iconst_2
		// @0C2B: new game.C_100049_vf
		// @0C2E: dup
		// @0C2F: bipush 50 (0x32)
		// @0C31: iconst_0
		// @0C32: invokespecial game.C_100049_vf.<init>(int, int)void
		// @0C35: aastore
		// @0C36: dup
		// @0C37: iconst_3
		// @0C38: new game.C_100049_vf
		// @0C3B: dup
		// @0C3C: bipush 64 (0x40)
		// @0C3E: bipush 74 (0x4A)
		// @0C40: sipush 8192 (0x2000)
		// @0C43: sipush 8192 (0x2000)
		// @0C46: new game.C_100327_ib
		// @0C49: dup
		// @0C4A: getstatic game.C_100153_be[] game.C_100314_lf.field_101371_Ob
		// @0C4D: bipush 8 (0x08)
		// @0C4F: aaload
		// @0C50: bipush 49 (0x31)
		// @0C52: bipush 57 (0x39)
		// @0C54: iconst_3
		// @0C55: anewarray game.C_100049_vf
		// @0C58: dup
		// @0C59: iconst_0
		// @0C5A: new game.C_100049_vf
		// @0C5D: dup
		// @0C5E: bipush 83 (0x53)
		// @0C60: bipush 59 (0x3B)
		// @0C62: sipush 16384 (0x4000)
		// @0C65: iconst_0
		// @0C66: bipush 16 (0x10)
		// @0C68: iconst_1
		// @0C69: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @0C6C: aastore
		// @0C6D: dup
		// @0C6E: iconst_1
		// @0C6F: new game.C_100049_vf
		// @0C72: dup
		// @0C73: bipush 79 (0x4F)
		// @0C75: bipush 63 (0x3F)
		// @0C77: sipush 16384 (0x4000)
		// @0C7A: iconst_0
		// @0C7B: sipush 128 (0x0080)
		// @0C7E: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @0C81: aastore
		// @0C82: dup
		// @0C83: iconst_2
		// @0C84: new game.C_100049_vf
		// @0C87: dup
		// @0C88: bipush 79 (0x4F)
		// @0C8A: bipush 71 (0x47)
		// @0C8C: sipush 16384 (0x4000)
		// @0C8F: iconst_0
		// @0C90: sipush 128 (0x0080)
		// @0C93: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @0C96: aastore
		// @0C97: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @0C9A: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @0C9D: aastore
		// @0C9E: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @0CA1: astore_1
		// @0CA2: aload_1
		// @0CA3: bipush 58 (0x3A)
		// @0CA5: putfield int game.C_100327_ib.field_102494_P
		// @0CA8: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @0CAB: bipush 123 (0x7B)
		// @0CAD: aload_1
		// @0CAE: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0CB1: new game.C_100327_ib
		// @0CB4: dup
		// @0CB5: getstatic game.C_100153_be[] game.C_100314_lf.field_101371_Ob
		// @0CB8: bipush 7 (0x07)
		// @0CBA: aaload
		// @0CBB: sipush 1024 (0x0400)
		// @0CBE: bipush 64 (0x40)
		// @0CC0: bipush 45 (0x2D)
		// @0CC2: sipush -21845 (0xAAAB)
		// @0CC5: sipush 8192 (0x2000)
		// @0CC8: iconst_2
		// @0CC9: anewarray game.C_100049_vf
		// @0CCC: dup
		// @0CCD: iconst_0
		// @0CCE: new game.C_100049_vf
		// @0CD1: dup
		// @0CD2: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @0CD5: bipush 29 (0x1D)
		// @0CD7: aaload
		// @0CD8: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @0CDB: aastore
		// @0CDC: dup
		// @0CDD: iconst_1
		// @0CDE: new game.C_100049_vf
		// @0CE1: dup
		// @0CE2: bipush 64 (0x40)
		// @0CE4: bipush 74 (0x4A)
		// @0CE6: sipush 8192 (0x2000)
		// @0CE9: sipush 8192 (0x2000)
		// @0CEC: new game.C_100327_ib
		// @0CEF: dup
		// @0CF0: getstatic game.C_100153_be[] game.C_100314_lf.field_101371_Ob
		// @0CF3: bipush 8 (0x08)
		// @0CF5: aaload
		// @0CF6: bipush 49 (0x31)
		// @0CF8: bipush 57 (0x39)
		// @0CFA: iconst_3
		// @0CFB: anewarray game.C_100049_vf
		// @0CFE: dup
		// @0CFF: iconst_0
		// @0D00: new game.C_100049_vf
		// @0D03: dup
		// @0D04: bipush 83 (0x53)
		// @0D06: bipush 59 (0x3B)
		// @0D08: sipush 16384 (0x4000)
		// @0D0B: iconst_0
		// @0D0C: bipush 16 (0x10)
		// @0D0E: iconst_1
		// @0D0F: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @0D12: aastore
		// @0D13: dup
		// @0D14: iconst_1
		// @0D15: new game.C_100049_vf
		// @0D18: dup
		// @0D19: bipush 79 (0x4F)
		// @0D1B: bipush 63 (0x3F)
		// @0D1D: sipush 16384 (0x4000)
		// @0D20: iconst_0
		// @0D21: sipush 128 (0x0080)
		// @0D24: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @0D27: aastore
		// @0D28: dup
		// @0D29: iconst_2
		// @0D2A: new game.C_100049_vf
		// @0D2D: dup
		// @0D2E: bipush 79 (0x4F)
		// @0D30: bipush 71 (0x47)
		// @0D32: sipush 16384 (0x4000)
		// @0D35: iconst_0
		// @0D36: sipush 128 (0x0080)
		// @0D39: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @0D3C: aastore
		// @0D3D: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @0D40: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @0D43: aastore
		// @0D44: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @0D47: astore_1
		// @0D48: aload_1
		// @0D49: bipush 98 (0x62)
		// @0D4B: putfield int game.C_100327_ib.field_102494_P
		// @0D4E: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @0D51: bipush 127 (0x7F)
		// @0D53: aload_1
		// @0D54: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0D57: new game.C_100327_ib
		// @0D5A: dup
		// @0D5B: getstatic game.C_100153_be[] game.C_100314_lf.field_101371_Ob
		// @0D5E: iconst_0
		// @0D5F: aaload
		// @0D60: iconst_1
		// @0D61: bipush 58 (0x3A)
		// @0D63: sipush 176 (0x00B0)
		// @0D66: iconst_0
		// @0D67: iconst_0
		// @0D68: bipush 9 (0x09)
		// @0D6A: anewarray game.C_100049_vf
		// @0D6D: dup
		// @0D6E: iconst_0
		// @0D6F: new game.C_100049_vf
		// @0D72: dup
		// @0D73: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @0D76: bipush 112 (0x70)
		// @0D78: aaload
		// @0D79: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @0D7C: aastore
		// @0D7D: dup
		// @0D7E: iconst_1
		// @0D7F: new game.C_100049_vf
		// @0D82: dup
		// @0D83: sipush 250 (0x00FA)
		// @0D86: iconst_2
		// @0D87: sipush 725 (0x02D5)
		// @0D8A: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @0D8D: aastore
		// @0D8E: dup
		// @0D8F: iconst_2
		// @0D90: new game.C_100049_vf
		// @0D93: dup
		// @0D94: bipush 68 (0x44)
		// @0D96: invokespecial game.C_100049_vf.<init>(int)void
		// @0D99: aastore
		// @0D9A: dup
		// @0D9B: iconst_3
		// @0D9C: new game.C_100049_vf
		// @0D9F: dup
		// @0DA0: sipush 440 (0x01B8)
		// @0DA3: sipush 225 (0x00E1)
		// @0DA6: invokespecial game.C_100049_vf.<init>(int, int)void
		// @0DA9: aastore
		// @0DAA: dup
		// @0DAB: iconst_4
		// @0DAC: new game.C_100049_vf
		// @0DAF: dup
		// @0DB0: bipush 62 (0x3E)
		// @0DB2: bipush 62 (0x3E)
		// @0DB4: iconst_0
		// @0DB5: iconst_0
		// @0DB6: new game.C_100327_ib
		// @0DB9: dup
		// @0DBA: getstatic game.C_100153_be[] game.C_100314_lf.field_101371_Ob
		// @0DBD: iconst_3
		// @0DBE: aaload
		// @0DBF: bipush 62 (0x3E)
		// @0DC1: bipush 62 (0x3E)
		// @0DC3: iconst_3
		// @0DC4: anewarray game.C_100049_vf
		// @0DC7: dup
		// @0DC8: iconst_0
		// @0DC9: new game.C_100049_vf
		// @0DCC: dup
		// @0DCD: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @0DD0: bipush 45 (0x2D)
		// @0DD2: aaload
		// @0DD3: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @0DD6: aastore
		// @0DD7: dup
		// @0DD8: iconst_1
		// @0DD9: new game.C_100049_vf
		// @0DDC: dup
		// @0DDD: bipush 60 (0x3C)
		// @0DDF: bipush 95 (0x5F)
		// @0DE1: sipush 2000 (0x07D0)
		// @0DE4: sipush 2048 (0x0800)
		// @0DE7: new game.C_100327_ib
		// @0DEA: dup
		// @0DEB: getstatic game.C_100153_be[] game.C_100314_lf.field_101371_Ob
		// @0DEE: iconst_1
		// @0DEF: aaload
		// @0DF0: bipush 61 (0x3D)
		// @0DF2: bipush 48 (0x30)
		// @0DF4: iconst_2
		// @0DF5: anewarray game.C_100049_vf
		// @0DF8: dup
		// @0DF9: iconst_0
		// @0DFA: new game.C_100049_vf
		// @0DFD: dup
		// @0DFE: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @0E01: bipush 103 (0x67)
		// @0E03: aaload
		// @0E04: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @0E07: aastore
		// @0E08: dup
		// @0E09: iconst_1
		// @0E0A: new game.C_100049_vf
		// @0E0D: dup
		// @0E0E: bipush 63 (0x3F)
		// @0E10: bipush 83 (0x53)
		// @0E12: sipush 1000 (0x03E8)
		// @0E15: sipush 2048 (0x0800)
		// @0E18: new game.C_100327_ib
		// @0E1B: dup
		// @0E1C: getstatic game.C_100153_be[] game.C_100314_lf.field_101371_Ob
		// @0E1F: iconst_2
		// @0E20: aaload
		// @0E21: bipush 62 (0x3E)
		// @0E23: bipush 45 (0x2D)
		// @0E25: iconst_1
		// @0E26: anewarray game.C_100049_vf
		// @0E29: dup
		// @0E2A: iconst_0
		// @0E2B: new game.C_100049_vf
		// @0E2E: dup
		// @0E2F: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @0E32: bipush 16 (0x10)
		// @0E34: aaload
		// @0E35: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @0E38: aastore
		// @0E39: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @0E3C: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @0E3F: aastore
		// @0E40: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @0E43: iconst_1
		// @0E44: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @0E47: aastore
		// @0E48: dup
		// @0E49: iconst_2
		// @0E4A: new game.C_100049_vf
		// @0E4D: dup
		// @0E4E: bipush 60 (0x3C)
		// @0E50: bipush 95 (0x5F)
		// @0E52: sipush -5000 (0xEC78)
		// @0E55: sipush 2048 (0x0800)
		// @0E58: new game.C_100327_ib
		// @0E5B: dup
		// @0E5C: getstatic game.C_100153_be[] game.C_100314_lf.field_101371_Ob
		// @0E5F: iconst_1
		// @0E60: aaload
		// @0E61: bipush 61 (0x3D)
		// @0E63: bipush 48 (0x30)
		// @0E65: iconst_2
		// @0E66: anewarray game.C_100049_vf
		// @0E69: dup
		// @0E6A: iconst_0
		// @0E6B: new game.C_100049_vf
		// @0E6E: dup
		// @0E6F: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @0E72: bipush 91 (0x5B)
		// @0E74: aaload
		// @0E75: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @0E78: aastore
		// @0E79: dup
		// @0E7A: iconst_1
		// @0E7B: new game.C_100049_vf
		// @0E7E: dup
		// @0E7F: bipush 63 (0x3F)
		// @0E81: bipush 83 (0x53)
		// @0E83: sipush 5000 (0x1388)
		// @0E86: sipush 2048 (0x0800)
		// @0E89: new game.C_100327_ib
		// @0E8C: dup
		// @0E8D: getstatic game.C_100153_be[] game.C_100314_lf.field_101371_Ob
		// @0E90: iconst_2
		// @0E91: aaload
		// @0E92: bipush 62 (0x3E)
		// @0E94: bipush 44 (0x2C)
		// @0E96: iconst_1
		// @0E97: anewarray game.C_100049_vf
		// @0E9A: dup
		// @0E9B: iconst_0
		// @0E9C: new game.C_100049_vf
		// @0E9F: dup
		// @0EA0: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @0EA3: bipush 28 (0x1C)
		// @0EA5: aaload
		// @0EA6: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @0EA9: aastore
		// @0EAA: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @0EAD: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @0EB0: aastore
		// @0EB1: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @0EB4: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @0EB7: aastore
		// @0EB8: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @0EBB: iconst_1
		// @0EBC: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @0EBF: aastore
		// @0EC0: dup
		// @0EC1: iconst_5
		// @0EC2: new game.C_100049_vf
		// @0EC5: dup
		// @0EC6: bipush 65 (0x41)
		// @0EC8: bipush 43 (0x2B)
		// @0ECA: sipush 16384 (0x4000)
		// @0ECD: iconst_0
		// @0ECE: sipush 1024 (0x0400)
		// @0ED1: iconst_1
		// @0ED2: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @0ED5: aastore
		// @0ED6: dup
		// @0ED7: bipush 6 (0x06)
		// @0ED9: new game.C_100049_vf
		// @0EDC: dup
		// @0EDD: bipush 65 (0x41)
		// @0EDF: bipush 28 (0x1C)
		// @0EE1: sipush 16384 (0x4000)
		// @0EE4: iconst_0
		// @0EE5: iconst_2
		// @0EE6: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @0EE9: aastore
		// @0EEA: dup
		// @0EEB: bipush 7 (0x07)
		// @0EED: new game.C_100049_vf
		// @0EF0: dup
		// @0EF1: bipush 57 (0x39)
		// @0EF3: bipush 43 (0x2B)
		// @0EF5: sipush 16384 (0x4000)
		// @0EF8: iconst_0
		// @0EF9: iconst_4
		// @0EFA: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @0EFD: aastore
		// @0EFE: dup
		// @0EFF: bipush 8 (0x08)
		// @0F01: new game.C_100049_vf
		// @0F04: dup
		// @0F05: bipush 57 (0x39)
		// @0F07: bipush 33 (0x21)
		// @0F09: sipush 16384 (0x4000)
		// @0F0C: iconst_0
		// @0F0D: bipush 8 (0x08)
		// @0F0F: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @0F12: aastore
		// @0F13: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @0F16: astore_1
		// @0F17: aload_1
		// @0F18: bipush 57 (0x39)
		// @0F1A: putfield int game.C_100327_ib.field_102494_P
		// @0F1D: iconst_0
		// @0F1E: aload_1
		// @0F1F: invokestatic game.C_100226_ae.func_106142_a(boolean, game.C_100327_ib)game.C_100327_ib
		// @0F22: astore_1
		// @0F23: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @0F26: bipush 127 (0x7F)
		// @0F28: aload_1
		// @0F29: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0F2C: new game.C_100327_ib
		// @0F2F: dup
		// @0F30: getstatic game.C_100153_be[] game.C_100186_rl.field_105725_c
		// @0F33: bipush 7 (0x07)
		// @0F35: aaload
		// @0F36: iconst_2
		// @0F37: bipush 99 (0x63)
		// @0F39: bipush 80 (0x50)
		// @0F3B: sipush -16384 (0xC000)
		// @0F3E: sipush 4096 (0x1000)
		// @0F41: iconst_3
		// @0F42: anewarray game.C_100049_vf
		// @0F45: dup
		// @0F46: iconst_0
		// @0F47: new game.C_100049_vf
		// @0F4A: dup
		// @0F4B: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @0F4E: bipush 127 (0x7F)
		// @0F50: aaload
		// @0F51: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @0F54: aastore
		// @0F55: dup
		// @0F56: iconst_1
		// @0F57: new game.C_100049_vf
		// @0F5A: dup
		// @0F5B: sipush 150 (0x0096)
		// @0F5E: iconst_1
		// @0F5F: sipush 350 (0x015E)
		// @0F62: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @0F65: aastore
		// @0F66: dup
		// @0F67: iconst_2
		// @0F68: new game.C_100049_vf
		// @0F6B: dup
		// @0F6C: bipush 108 (0x6C)
		// @0F6E: bipush 76 (0x4C)
		// @0F70: sipush 16384 (0x4000)
		// @0F73: iconst_0
		// @0F74: bipush 16 (0x10)
		// @0F76: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @0F79: aastore
		// @0F7A: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @0F7D: astore_1
		// @0F7E: aload_1
		// @0F7F: bipush 61 (0x3D)
		// @0F81: putfield int game.C_100327_ib.field_102494_P
		// @0F84: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @0F87: bipush 123 (0x7B)
		// @0F89: aload_1
		// @0F8A: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0F8D: new game.C_100327_ib
		// @0F90: dup
		// @0F91: getstatic game.C_100153_be[] game.C_100186_rl.field_105725_c
		// @0F94: iconst_1
		// @0F95: aaload
		// @0F96: iconst_1
		// @0F97: bipush 63 (0x3F)
		// @0F99: bipush 120 (0x78)
		// @0F9B: iconst_0
		// @0F9C: iconst_0
		// @0F9D: bipush 8 (0x08)
		// @0F9F: anewarray game.C_100049_vf
		// @0FA2: dup
		// @0FA3: iconst_0
		// @0FA4: new game.C_100049_vf
		// @0FA7: dup
		// @0FA8: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @0FAB: bipush 39 (0x27)
		// @0FAD: aaload
		// @0FAE: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @0FB1: aastore
		// @0FB2: dup
		// @0FB3: iconst_1
		// @0FB4: new game.C_100049_vf
		// @0FB7: dup
		// @0FB8: sipush 600 (0x0258)
		// @0FBB: iconst_4
		// @0FBC: sipush 1250 (0x04E2)
		// @0FBF: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @0FC2: aastore
		// @0FC3: dup
		// @0FC4: iconst_2
		// @0FC5: new game.C_100049_vf
		// @0FC8: dup
		// @0FC9: sipush 128 (0x0080)
		// @0FCC: invokespecial game.C_100049_vf.<init>(int)void
		// @0FCF: aastore
		// @0FD0: dup
		// @0FD1: iconst_3
		// @0FD2: new game.C_100049_vf
		// @0FD5: dup
		// @0FD6: iconst_0
		// @0FD7: sipush 225 (0x00E1)
		// @0FDA: invokespecial game.C_100049_vf.<init>(int, int)void
		// @0FDD: aastore
		// @0FDE: dup
		// @0FDF: iconst_4
		// @0FE0: new game.C_100049_vf
		// @0FE3: dup
		// @0FE4: bipush 43 (0x2B)
		// @0FE6: bipush 58 (0x3A)
		// @0FE8: iconst_0
		// @0FE9: iconst_0
		// @0FEA: new game.C_100327_ib
		// @0FED: dup
		// @0FEE: getstatic game.C_100153_be[] game.C_100186_rl.field_105725_c
		// @0FF1: iconst_0
		// @0FF2: aaload
		// @0FF3: bipush 43 (0x2B)
		// @0FF5: bipush 58 (0x3A)
		// @0FF7: iconst_3
		// @0FF8: anewarray game.C_100049_vf
		// @0FFB: dup
		// @0FFC: iconst_0
		// @0FFD: new game.C_100049_vf
		// @1000: dup
		// @1001: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @1004: bipush 80 (0x50)
		// @1006: aaload
		// @1007: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @100A: aastore
		// @100B: dup
		// @100C: iconst_1
		// @100D: new game.C_100049_vf
		// @1010: dup
		// @1011: bipush 21 (0x15)
		// @1013: bipush 70 (0x46)
		// @1015: iconst_0
		// @1016: iconst_0
		// @1017: new game.C_100327_ib
		// @101A: dup
		// @101B: getstatic game.C_100153_be[] game.C_100186_rl.field_105725_c
		// @101E: iconst_3
		// @101F: aaload
		// @1020: bipush 78 (0x4E)
		// @1022: bipush 67 (0x43)
		// @1024: iconst_2
		// @1025: anewarray game.C_100049_vf
		// @1028: dup
		// @1029: iconst_0
		// @102A: new game.C_100049_vf
		// @102D: dup
		// @102E: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @1031: bipush 71 (0x47)
		// @1033: aaload
		// @1034: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @1037: aastore
		// @1038: dup
		// @1039: iconst_1
		// @103A: new game.C_100049_vf
		// @103D: dup
		// @103E: bipush 55 (0x37)
		// @1040: bipush 92 (0x5C)
		// @1042: iconst_0
		// @1043: iconst_0
		// @1044: new game.C_100327_ib
		// @1047: dup
		// @1048: getstatic game.C_100153_be[] game.C_100186_rl.field_105725_c
		// @104B: iconst_4
		// @104C: aaload
		// @104D: bipush 55 (0x37)
		// @104F: bipush 92 (0x5C)
		// @1051: iconst_3
		// @1052: anewarray game.C_100049_vf
		// @1055: dup
		// @1056: iconst_0
		// @1057: new game.C_100049_vf
		// @105A: dup
		// @105B: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @105E: bipush 21 (0x15)
		// @1060: aaload
		// @1061: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @1064: aastore
		// @1065: dup
		// @1066: iconst_1
		// @1067: new game.C_100049_vf
		// @106A: dup
		// @106B: bipush 76 (0x4C)
		// @106D: bipush 113 (0x71)
		// @106F: iconst_0
		// @1070: iconst_0
		// @1071: new game.C_100327_ib
		// @1074: dup
		// @1075: getstatic game.C_100153_be[] game.C_100186_rl.field_105725_c
		// @1078: iconst_5
		// @1079: aaload
		// @107A: bipush 76 (0x4C)
		// @107C: bipush 113 (0x71)
		// @107E: iconst_1
		// @107F: anewarray game.C_100049_vf
		// @1082: dup
		// @1083: iconst_0
		// @1084: new game.C_100049_vf
		// @1087: dup
		// @1088: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @108B: bipush 116 (0x74)
		// @108D: aaload
		// @108E: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @1091: aastore
		// @1092: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @1095: iconst_1
		// @1096: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @1099: aastore
		// @109A: dup
		// @109B: iconst_2
		// @109C: new game.C_100049_vf
		// @109F: dup
		// @10A0: bipush 76 (0x4C)
		// @10A2: bipush 113 (0x71)
		// @10A4: iconst_0
		// @10A5: iconst_0
		// @10A6: new game.C_100327_ib
		// @10A9: dup
		// @10AA: getstatic game.C_100153_be[] game.C_100186_rl.field_105725_c
		// @10AD: bipush 6 (0x06)
		// @10AF: aaload
		// @10B0: bipush 76 (0x4C)
		// @10B2: bipush 113 (0x71)
		// @10B4: iconst_1
		// @10B5: anewarray game.C_100049_vf
		// @10B8: dup
		// @10B9: iconst_0
		// @10BA: new game.C_100049_vf
		// @10BD: dup
		// @10BE: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @10C1: bipush 120 (0x78)
		// @10C3: aaload
		// @10C4: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @10C7: aastore
		// @10C8: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @10CB: iconst_1
		// @10CC: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @10CF: aastore
		// @10D0: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @10D3: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @10D6: aastore
		// @10D7: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @10DA: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @10DD: aastore
		// @10DE: dup
		// @10DF: iconst_2
		// @10E0: new game.C_100049_vf
		// @10E3: dup
		// @10E4: bipush 21 (0x15)
		// @10E6: bipush 70 (0x46)
		// @10E8: iconst_0
		// @10E9: iconst_0
		// @10EA: new game.C_100327_ib
		// @10ED: dup
		// @10EE: getstatic game.C_100153_be[] game.C_100186_rl.field_105725_c
		// @10F1: iconst_3
		// @10F2: aaload
		// @10F3: bipush 78 (0x4E)
		// @10F5: bipush 67 (0x43)
		// @10F7: iconst_2
		// @10F8: anewarray game.C_100049_vf
		// @10FB: dup
		// @10FC: iconst_0
		// @10FD: new game.C_100049_vf
		// @1100: dup
		// @1101: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @1104: bipush 50 (0x32)
		// @1106: aaload
		// @1107: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @110A: aastore
		// @110B: dup
		// @110C: iconst_1
		// @110D: new game.C_100049_vf
		// @1110: dup
		// @1111: bipush 55 (0x37)
		// @1113: bipush 92 (0x5C)
		// @1115: iconst_0
		// @1116: iconst_0
		// @1117: new game.C_100327_ib
		// @111A: dup
		// @111B: getstatic game.C_100153_be[] game.C_100186_rl.field_105725_c
		// @111E: iconst_4
		// @111F: aaload
		// @1120: bipush 55 (0x37)
		// @1122: bipush 92 (0x5C)
		// @1124: iconst_3
		// @1125: anewarray game.C_100049_vf
		// @1128: dup
		// @1129: iconst_0
		// @112A: new game.C_100049_vf
		// @112D: dup
		// @112E: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @1131: bipush 121 (0x79)
		// @1133: aaload
		// @1134: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @1137: aastore
		// @1138: dup
		// @1139: iconst_1
		// @113A: new game.C_100049_vf
		// @113D: dup
		// @113E: bipush 76 (0x4C)
		// @1140: bipush 113 (0x71)
		// @1142: iconst_0
		// @1143: iconst_0
		// @1144: new game.C_100327_ib
		// @1147: dup
		// @1148: getstatic game.C_100153_be[] game.C_100186_rl.field_105725_c
		// @114B: iconst_5
		// @114C: aaload
		// @114D: bipush 76 (0x4C)
		// @114F: bipush 113 (0x71)
		// @1151: iconst_1
		// @1152: anewarray game.C_100049_vf
		// @1155: dup
		// @1156: iconst_0
		// @1157: new game.C_100049_vf
		// @115A: dup
		// @115B: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @115E: bipush 33 (0x21)
		// @1160: aaload
		// @1161: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @1164: aastore
		// @1165: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @1168: iconst_1
		// @1169: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @116C: aastore
		// @116D: dup
		// @116E: iconst_2
		// @116F: new game.C_100049_vf
		// @1172: dup
		// @1173: bipush 76 (0x4C)
		// @1175: bipush 113 (0x71)
		// @1177: iconst_0
		// @1178: iconst_0
		// @1179: new game.C_100327_ib
		// @117C: dup
		// @117D: getstatic game.C_100153_be[] game.C_100186_rl.field_105725_c
		// @1180: bipush 6 (0x06)
		// @1182: aaload
		// @1183: bipush 76 (0x4C)
		// @1185: bipush 113 (0x71)
		// @1187: iconst_1
		// @1188: anewarray game.C_100049_vf
		// @118B: dup
		// @118C: iconst_0
		// @118D: new game.C_100049_vf
		// @1190: dup
		// @1191: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @1194: bipush 110 (0x6E)
		// @1196: aaload
		// @1197: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @119A: aastore
		// @119B: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @119E: iconst_1
		// @119F: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @11A2: aastore
		// @11A3: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @11A6: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @11A9: aastore
		// @11AA: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @11AD: iconst_1
		// @11AE: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @11B1: aastore
		// @11B2: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @11B5: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @11B8: aastore
		// @11B9: dup
		// @11BA: iconst_5
		// @11BB: new game.C_100049_vf
		// @11BE: dup
		// @11BF: bipush 80 (0x50)
		// @11C1: bipush 61 (0x3D)
		// @11C3: iconst_0
		// @11C4: iconst_0
		// @11C5: new game.C_100327_ib
		// @11C8: dup
		// @11C9: getstatic game.C_100153_be[] game.C_100186_rl.field_105725_c
		// @11CC: iconst_2
		// @11CD: aaload
		// @11CE: bipush 80 (0x50)
		// @11D0: bipush 61 (0x3D)
		// @11D2: bipush 6 (0x06)
		// @11D4: anewarray game.C_100049_vf
		// @11D7: dup
		// @11D8: iconst_0
		// @11D9: new game.C_100049_vf
		// @11DC: dup
		// @11DD: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @11E0: bipush 124 (0x7C)
		// @11E2: aaload
		// @11E3: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @11E6: aastore
		// @11E7: dup
		// @11E8: iconst_1
		// @11E9: new game.C_100049_vf
		// @11EC: dup
		// @11ED: bipush 105 (0x69)
		// @11EF: bipush 78 (0x4E)
		// @11F1: sipush 16384 (0x4000)
		// @11F4: iconst_0
		// @11F5: iconst_2
		// @11F6: iconst_1
		// @11F7: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @11FA: aastore
		// @11FB: dup
		// @11FC: iconst_2
		// @11FD: new game.C_100049_vf
		// @1200: dup
		// @1201: bipush 78 (0x4E)
		// @1203: bipush 67 (0x43)
		// @1205: sipush 16384 (0x4000)
		// @1208: iconst_0
		// @1209: bipush 8 (0x08)
		// @120B: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @120E: aastore
		// @120F: dup
		// @1210: iconst_3
		// @1211: new game.C_100049_vf
		// @1214: dup
		// @1215: bipush 78 (0x4E)
		// @1217: bipush 67 (0x43)
		// @1219: iconst_0
		// @121A: iconst_0
		// @121B: new game.C_100327_ib
		// @121E: dup
		// @121F: getstatic game.C_100153_be[] game.C_100186_rl.field_105725_c
		// @1222: iconst_3
		// @1223: aaload
		// @1224: bipush 78 (0x4E)
		// @1226: bipush 67 (0x43)
		// @1228: iconst_2
		// @1229: anewarray game.C_100049_vf
		// @122C: dup
		// @122D: iconst_0
		// @122E: new game.C_100049_vf
		// @1231: dup
		// @1232: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @1235: bipush 37 (0x25)
		// @1237: aaload
		// @1238: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @123B: aastore
		// @123C: dup
		// @123D: iconst_1
		// @123E: new game.C_100049_vf
		// @1241: dup
		// @1242: bipush 55 (0x37)
		// @1244: bipush 92 (0x5C)
		// @1246: iconst_0
		// @1247: iconst_0
		// @1248: new game.C_100327_ib
		// @124B: dup
		// @124C: getstatic game.C_100153_be[] game.C_100186_rl.field_105725_c
		// @124F: iconst_4
		// @1250: aaload
		// @1251: bipush 55 (0x37)
		// @1253: bipush 92 (0x5C)
		// @1255: iconst_3
		// @1256: anewarray game.C_100049_vf
		// @1259: dup
		// @125A: iconst_0
		// @125B: new game.C_100049_vf
		// @125E: dup
		// @125F: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @1262: bipush 99 (0x63)
		// @1264: aaload
		// @1265: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @1268: aastore
		// @1269: dup
		// @126A: iconst_1
		// @126B: new game.C_100049_vf
		// @126E: dup
		// @126F: bipush 76 (0x4C)
		// @1271: bipush 113 (0x71)
		// @1273: iconst_0
		// @1274: iconst_0
		// @1275: new game.C_100327_ib
		// @1278: dup
		// @1279: getstatic game.C_100153_be[] game.C_100186_rl.field_105725_c
		// @127C: iconst_5
		// @127D: aaload
		// @127E: bipush 76 (0x4C)
		// @1280: bipush 113 (0x71)
		// @1282: iconst_1
		// @1283: anewarray game.C_100049_vf
		// @1286: dup
		// @1287: iconst_0
		// @1288: new game.C_100049_vf
		// @128B: dup
		// @128C: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @128F: bipush 15 (0x0F)
		// @1291: aaload
		// @1292: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @1295: aastore
		// @1296: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @1299: iconst_1
		// @129A: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @129D: aastore
		// @129E: dup
		// @129F: iconst_2
		// @12A0: new game.C_100049_vf
		// @12A3: dup
		// @12A4: bipush 76 (0x4C)
		// @12A6: bipush 113 (0x71)
		// @12A8: iconst_0
		// @12A9: iconst_0
		// @12AA: new game.C_100327_ib
		// @12AD: dup
		// @12AE: getstatic game.C_100153_be[] game.C_100186_rl.field_105725_c
		// @12B1: bipush 6 (0x06)
		// @12B3: aaload
		// @12B4: bipush 76 (0x4C)
		// @12B6: bipush 113 (0x71)
		// @12B8: iconst_1
		// @12B9: anewarray game.C_100049_vf
		// @12BC: dup
		// @12BD: iconst_0
		// @12BE: new game.C_100049_vf
		// @12C1: dup
		// @12C2: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @12C5: bipush 83 (0x53)
		// @12C7: aaload
		// @12C8: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @12CB: aastore
		// @12CC: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @12CF: iconst_1
		// @12D0: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @12D3: aastore
		// @12D4: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @12D7: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @12DA: aastore
		// @12DB: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @12DE: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @12E1: aastore
		// @12E2: dup
		// @12E3: iconst_4
		// @12E4: new game.C_100049_vf
		// @12E7: dup
		// @12E8: bipush 78 (0x4E)
		// @12EA: bipush 67 (0x43)
		// @12EC: iconst_0
		// @12ED: iconst_0
		// @12EE: new game.C_100327_ib
		// @12F1: dup
		// @12F2: getstatic game.C_100153_be[] game.C_100186_rl.field_105725_c
		// @12F5: iconst_3
		// @12F6: aaload
		// @12F7: bipush 78 (0x4E)
		// @12F9: bipush 67 (0x43)
		// @12FB: iconst_2
		// @12FC: anewarray game.C_100049_vf
		// @12FF: dup
		// @1300: iconst_0
		// @1301: new game.C_100049_vf
		// @1304: dup
		// @1305: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @1308: bipush 122 (0x7A)
		// @130A: aaload
		// @130B: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @130E: aastore
		// @130F: dup
		// @1310: iconst_1
		// @1311: new game.C_100049_vf
		// @1314: dup
		// @1315: bipush 55 (0x37)
		// @1317: bipush 92 (0x5C)
		// @1319: iconst_0
		// @131A: iconst_0
		// @131B: new game.C_100327_ib
		// @131E: dup
		// @131F: getstatic game.C_100153_be[] game.C_100186_rl.field_105725_c
		// @1322: iconst_4
		// @1323: aaload
		// @1324: bipush 55 (0x37)
		// @1326: bipush 92 (0x5C)
		// @1328: iconst_3
		// @1329: anewarray game.C_100049_vf
		// @132C: dup
		// @132D: iconst_0
		// @132E: new game.C_100049_vf
		// @1331: dup
		// @1332: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @1335: bipush 47 (0x2F)
		// @1337: aaload
		// @1338: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @133B: aastore
		// @133C: dup
		// @133D: iconst_1
		// @133E: new game.C_100049_vf
		// @1341: dup
		// @1342: bipush 76 (0x4C)
		// @1344: bipush 113 (0x71)
		// @1346: iconst_0
		// @1347: iconst_0
		// @1348: new game.C_100327_ib
		// @134B: dup
		// @134C: getstatic game.C_100153_be[] game.C_100186_rl.field_105725_c
		// @134F: iconst_5
		// @1350: aaload
		// @1351: bipush 76 (0x4C)
		// @1353: bipush 113 (0x71)
		// @1355: iconst_1
		// @1356: anewarray game.C_100049_vf
		// @1359: dup
		// @135A: iconst_0
		// @135B: new game.C_100049_vf
		// @135E: dup
		// @135F: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @1362: bipush 59 (0x3B)
		// @1364: aaload
		// @1365: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @1368: aastore
		// @1369: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @136C: iconst_1
		// @136D: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @1370: aastore
		// @1371: dup
		// @1372: iconst_2
		// @1373: new game.C_100049_vf
		// @1376: dup
		// @1377: bipush 76 (0x4C)
		// @1379: bipush 113 (0x71)
		// @137B: iconst_0
		// @137C: iconst_0
		// @137D: new game.C_100327_ib
		// @1380: dup
		// @1381: getstatic game.C_100153_be[] game.C_100186_rl.field_105725_c
		// @1384: bipush 6 (0x06)
		// @1386: aaload
		// @1387: bipush 76 (0x4C)
		// @1389: bipush 113 (0x71)
		// @138B: iconst_1
		// @138C: anewarray game.C_100049_vf
		// @138F: dup
		// @1390: iconst_0
		// @1391: new game.C_100049_vf
		// @1394: dup
		// @1395: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @1398: bipush 35 (0x23)
		// @139A: aaload
		// @139B: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @139E: aastore
		// @139F: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @13A2: iconst_1
		// @13A3: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @13A6: aastore
		// @13A7: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @13AA: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @13AD: aastore
		// @13AE: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @13B1: iconst_1
		// @13B2: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @13B5: aastore
		// @13B6: dup
		// @13B7: iconst_5
		// @13B8: new game.C_100049_vf
		// @13BB: dup
		// @13BC: bipush 98 (0x62)
		// @13BE: bipush 31 (0x1F)
		// @13C0: sipush 16384 (0x4000)
		// @13C3: sipush 4096 (0x1000)
		// @13C6: sipush 144 (0x0090)
		// @13C9: iconst_1
		// @13CA: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @13CD: aastore
		// @13CE: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @13D1: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @13D4: aastore
		// @13D5: dup
		// @13D6: bipush 6 (0x06)
		// @13D8: new game.C_100049_vf
		// @13DB: dup
		// @13DC: bipush 41 (0x29)
		// @13DE: bipush 50 (0x32)
		// @13E0: iconst_0
		// @13E1: sipush 8192 (0x2000)
		// @13E4: new game.C_100327_ib
		// @13E7: dup
		// @13E8: getstatic game.C_100153_be[] game.C_100186_rl.field_105725_c
		// @13EB: bipush 9 (0x09)
		// @13ED: aaload
		// @13EE: bipush 63 (0x3F)
		// @13F0: bipush 60 (0x3C)
		// @13F2: iconst_2
		// @13F3: anewarray game.C_100049_vf
		// @13F6: dup
		// @13F7: iconst_0
		// @13F8: new game.C_100049_vf
		// @13FB: dup
		// @13FC: bipush 60 (0x3C)
		// @13FE: bipush 43 (0x2B)
		// @1400: sipush 16384 (0x4000)
		// @1403: iconst_0
		// @1404: sipush 384 (0x0180)
		// @1407: iconst_1
		// @1408: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @140B: aastore
		// @140C: dup
		// @140D: iconst_1
		// @140E: new game.C_100049_vf
		// @1411: dup
		// @1412: bipush 60 (0x3C)
		// @1414: bipush 57 (0x39)
		// @1416: sipush 16384 (0x4000)
		// @1419: iconst_0
		// @141A: sipush 384 (0x0180)
		// @141D: iconst_1
		// @141E: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @1421: aastore
		// @1422: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @1425: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @1428: aastore
		// @1429: dup
		// @142A: bipush 7 (0x07)
		// @142C: new game.C_100049_vf
		// @142F: dup
		// @1430: bipush 58 (0x3A)
		// @1432: bipush 28 (0x1C)
		// @1434: sipush 8192 (0x2000)
		// @1437: sipush 8192 (0x2000)
		// @143A: bipush 96 (0x60)
		// @143C: iconst_1
		// @143D: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @1440: aastore
		// @1441: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @1444: astore_1
		// @1445: aload_1
		// @1446: bipush 62 (0x3E)
		// @1448: putfield int game.C_100327_ib.field_102494_P
		// @144B: iconst_0
		// @144C: aload_1
		// @144D: invokestatic game.C_100226_ae.func_106142_a(boolean, game.C_100327_ib)game.C_100327_ib
		// @1450: astore_1
		// @1451: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @1454: bipush 124 (0x7C)
		// @1456: aload_1
		// @1457: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @145A: new game.C_100327_ib
		// @145D: dup
		// @145E: getstatic game.C_100153_be[] game.C_100313_lg.field_107166_b
		// @1461: bipush 9 (0x09)
		// @1463: aaload
		// @1464: iconst_2
		// @1465: bipush 66 (0x42)
		// @1467: bipush 23 (0x17)
		// @1469: sipush -16384 (0xC000)
		// @146C: sipush 4096 (0x1000)
		// @146F: iconst_2
		// @1470: anewarray game.C_100049_vf
		// @1473: dup
		// @1474: iconst_0
		// @1475: new game.C_100049_vf
		// @1478: dup
		// @1479: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @147C: bipush 10 (0x0A)
		// @147E: aaload
		// @147F: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @1482: aastore
		// @1483: dup
		// @1484: iconst_1
		// @1485: new game.C_100049_vf
		// @1488: dup
		// @1489: bipush 50 (0x32)
		// @148B: iconst_3
		// @148C: sipush 775 (0x0307)
		// @148F: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @1492: aastore
		// @1493: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @1496: astore_1
		// @1497: aload_1
		// @1498: bipush 64 (0x40)
		// @149A: putfield int game.C_100327_ib.field_102494_P
		// @149D: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @14A0: bipush 126 (0x7E)
		// @14A2: aload_1
		// @14A3: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @14A6: new game.C_100327_ib
		// @14A9: dup
		// @14AA: getstatic game.C_100153_be[] game.C_100313_lg.field_107166_b
		// @14AD: bipush 10 (0x0A)
		// @14AF: aaload
		// @14B0: bipush 8 (0x08)
		// @14B2: bipush 65 (0x41)
		// @14B4: bipush 35 (0x23)
		// @14B6: sipush -24576 (0xA000)
		// @14B9: sipush 13107 (0x3333)
		// @14BC: iconst_4
		// @14BD: anewarray game.C_100049_vf
		// @14C0: dup
		// @14C1: iconst_0
		// @14C2: new game.C_100049_vf
		// @14C5: dup
		// @14C6: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @14C9: bipush 100 (0x64)
		// @14CB: aaload
		// @14CC: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @14CF: aastore
		// @14D0: dup
		// @14D1: iconst_1
		// @14D2: new game.C_100049_vf
		// @14D5: dup
		// @14D6: bipush 50 (0x32)
		// @14D8: iconst_0
		// @14D9: bipush 75 (0x4B)
		// @14DB: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @14DE: aastore
		// @14DF: dup
		// @14E0: iconst_2
		// @14E1: new game.C_100049_vf
		// @14E4: dup
		// @14E5: bipush 82 (0x52)
		// @14E7: bipush 12 (0x0C)
		// @14E9: sipush 16384 (0x4000)
		// @14EC: iconst_0
		// @14ED: sipush 144 (0x0090)
		// @14F0: iconst_1
		// @14F1: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @14F4: aastore
		// @14F5: dup
		// @14F6: iconst_3
		// @14F7: new game.C_100049_vf
		// @14FA: dup
		// @14FB: bipush 82 (0x52)
		// @14FD: bipush 16 (0x10)
		// @14FF: sipush 16384 (0x4000)
		// @1502: iconst_0
		// @1503: sipush 144 (0x0090)
		// @1506: iconst_1
		// @1507: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @150A: aastore
		// @150B: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @150E: astore_1
		// @150F: aload_1
		// @1510: bipush 67 (0x43)
		// @1512: putfield int game.C_100327_ib.field_102494_P
		// @1515: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @1518: bipush 127 (0x7F)
		// @151A: aload_1
		// @151B: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @151E: new game.C_100327_ib
		// @1521: dup
		// @1522: getstatic game.C_100153_be[] game.C_100313_lg.field_107166_b
		// @1525: bipush 7 (0x07)
		// @1527: aaload
		// @1528: iconst_4
		// @1529: bipush 65 (0x41)
		// @152B: bipush 32 (0x20)
		// @152D: sipush -29672 (0x8C18)
		// @1530: sipush 8192 (0x2000)
		// @1533: iconst_3
		// @1534: anewarray game.C_100049_vf
		// @1537: dup
		// @1538: iconst_0
		// @1539: new game.C_100049_vf
		// @153C: dup
		// @153D: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @1540: bipush 69 (0x45)
		// @1542: aaload
		// @1543: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @1546: aastore
		// @1547: dup
		// @1548: iconst_1
		// @1549: new game.C_100049_vf
		// @154C: dup
		// @154D: bipush 100 (0x64)
		// @154F: iconst_0
		// @1550: sipush 200 (0x00C8)
		// @1553: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @1556: aastore
		// @1557: dup
		// @1558: iconst_2
		// @1559: new game.C_100049_vf
		// @155C: dup
		// @155D: bipush 65 (0x41)
		// @155F: bipush 75 (0x4B)
		// @1561: sipush 12288 (0x3000)
		// @1564: sipush 4096 (0x1000)
		// @1567: new game.C_100327_ib
		// @156A: dup
		// @156B: getstatic game.C_100153_be[] game.C_100166_sg.field_105465_e
		// @156E: bipush 6 (0x06)
		// @1570: aaload
		// @1571: bipush 50 (0x32)
		// @1573: bipush 63 (0x3F)
		// @1575: iconst_1
		// @1576: anewarray game.C_100049_vf
		// @1579: dup
		// @157A: iconst_0
		// @157B: new game.C_100049_vf
		// @157E: dup
		// @157F: bipush 74 (0x4A)
		// @1581: bipush 62 (0x3E)
		// @1583: sipush 16384 (0x4000)
		// @1586: iconst_0
		// @1587: bipush 32 (0x20)
		// @1589: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @158C: aastore
		// @158D: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @1590: iconst_1
		// @1591: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @1594: aastore
		// @1595: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @1598: astore_1
		// @1599: aload_1
		// @159A: bipush 66 (0x42)
		// @159C: putfield int game.C_100327_ib.field_102494_P
		// @159F: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @15A2: bipush 124 (0x7C)
		// @15A4: aload_1
		// @15A5: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @15A8: new game.C_100327_ib
		// @15AB: dup
		// @15AC: getstatic game.C_100153_be[] game.C_100313_lg.field_107166_b
		// @15AF: iconst_5
		// @15B0: aaload
		// @15B1: sipush 1024 (0x0400)
		// @15B4: bipush 64 (0x40)
		// @15B6: bipush 38 (0x26)
		// @15B8: sipush -18384 (0xB830)
		// @15BB: sipush 10922 (0x2AAA)
		// @15BE: iconst_2
		// @15BF: anewarray game.C_100049_vf
		// @15C2: dup
		// @15C3: iconst_0
		// @15C4: new game.C_100049_vf
		// @15C7: dup
		// @15C8: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @15CB: bipush 111 (0x6F)
		// @15CD: aaload
		// @15CE: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @15D1: aastore
		// @15D2: dup
		// @15D3: iconst_1
		// @15D4: new game.C_100049_vf
		// @15D7: dup
		// @15D8: bipush 65 (0x41)
		// @15DA: bipush 75 (0x4B)
		// @15DC: sipush 1000 (0x03E8)
		// @15DF: sipush 4096 (0x1000)
		// @15E2: new game.C_100327_ib
		// @15E5: dup
		// @15E6: getstatic game.C_100153_be[] game.C_100313_lg.field_107166_b
		// @15E9: bipush 6 (0x06)
		// @15EB: aaload
		// @15EC: bipush 38 (0x26)
		// @15EE: bipush 75 (0x4B)
		// @15F0: iconst_2
		// @15F1: anewarray game.C_100049_vf
		// @15F4: dup
		// @15F5: iconst_0
		// @15F6: new game.C_100049_vf
		// @15F9: dup
		// @15FA: bipush 70 (0x46)
		// @15FC: bipush 70 (0x46)
		// @15FE: sipush 16384 (0x4000)
		// @1601: iconst_0
		// @1602: bipush 16 (0x10)
		// @1604: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @1607: aastore
		// @1608: dup
		// @1609: iconst_1
		// @160A: new game.C_100049_vf
		// @160D: dup
		// @160E: bipush 70 (0x46)
		// @1610: bipush 84 (0x54)
		// @1612: sipush 16384 (0x4000)
		// @1615: iconst_0
		// @1616: bipush 16 (0x10)
		// @1618: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @161B: aastore
		// @161C: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @161F: iconst_1
		// @1620: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @1623: aastore
		// @1624: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @1627: astore_1
		// @1628: aload_1
		// @1629: bipush 99 (0x63)
		// @162B: putfield int game.C_100327_ib.field_102494_P
		// @162E: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @1631: bipush 124 (0x7C)
		// @1633: aload_1
		// @1634: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @1637: new game.C_100327_ib
		// @163A: dup
		// @163B: getstatic game.C_100153_be[] game.C_100313_lg.field_107166_b
		// @163E: iconst_0
		// @163F: aaload
		// @1640: iconst_1
		// @1641: bipush 58 (0x3A)
		// @1643: sipush 195 (0x00C3)
		// @1646: iconst_0
		// @1647: iconst_0
		// @1648: bipush 9 (0x09)
		// @164A: anewarray game.C_100049_vf
		// @164D: dup
		// @164E: iconst_0
		// @164F: new game.C_100049_vf
		// @1652: dup
		// @1653: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @1656: bipush 113 (0x71)
		// @1658: aaload
		// @1659: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @165C: aastore
		// @165D: dup
		// @165E: iconst_1
		// @165F: new game.C_100049_vf
		// @1662: dup
		// @1663: sipush 400 (0x0190)
		// @1666: iconst_2
		// @1667: sipush 1050 (0x041A)
		// @166A: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @166D: aastore
		// @166E: dup
		// @166F: iconst_2
		// @1670: new game.C_100049_vf
		// @1673: dup
		// @1674: sipush 256 (0x0100)
		// @1677: invokespecial game.C_100049_vf.<init>(int)void
		// @167A: aastore
		// @167B: dup
		// @167C: iconst_3
		// @167D: new game.C_100049_vf
		// @1680: dup
		// @1681: sipush 350 (0x015E)
		// @1684: sipush 250 (0x00FA)
		// @1687: invokespecial game.C_100049_vf.<init>(int, int)void
		// @168A: aastore
		// @168B: dup
		// @168C: iconst_4
		// @168D: new game.C_100049_vf
		// @1690: dup
		// @1691: bipush 75 (0x4B)
		// @1693: bipush 38 (0x26)
		// @1695: sipush 16384 (0x4000)
		// @1698: iconst_0
		// @1699: sipush 1024 (0x0400)
		// @169C: iconst_1
		// @169D: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @16A0: aastore
		// @16A1: dup
		// @16A2: iconst_5
		// @16A3: new game.C_100049_vf
		// @16A6: dup
		// @16A7: bipush 49 (0x31)
		// @16A9: bipush 32 (0x20)
		// @16AB: iconst_0
		// @16AC: iconst_0
		// @16AD: new game.C_100327_ib
		// @16B0: dup
		// @16B1: getstatic game.C_100153_be[] game.C_100313_lg.field_107166_b
		// @16B4: bipush 11 (0x0B)
		// @16B6: aaload
		// @16B7: bipush 46 (0x2E)
		// @16B9: bipush 37 (0x25)
		// @16BB: iconst_2
		// @16BC: anewarray game.C_100049_vf
		// @16BF: dup
		// @16C0: iconst_0
		// @16C1: new game.C_100049_vf
		// @16C4: dup
		// @16C5: bipush 57 (0x39)
		// @16C7: bipush 97 (0x61)
		// @16C9: iconst_0
		// @16CA: iconst_0
		// @16CB: new game.C_100327_ib
		// @16CE: dup
		// @16CF: getstatic game.C_100153_be[] game.C_100313_lg.field_107166_b
		// @16D2: iconst_1
		// @16D3: aaload
		// @16D4: bipush 47 (0x2F)
		// @16D6: bipush 42 (0x2A)
		// @16D8: iconst_2
		// @16D9: anewarray game.C_100049_vf
		// @16DC: dup
		// @16DD: iconst_0
		// @16DE: new game.C_100049_vf
		// @16E1: dup
		// @16E2: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @16E5: bipush 103 (0x67)
		// @16E7: aaload
		// @16E8: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @16EB: aastore
		// @16EC: dup
		// @16ED: iconst_1
		// @16EE: new game.C_100049_vf
		// @16F1: dup
		// @16F2: bipush 56 (0x38)
		// @16F4: bipush 88 (0x58)
		// @16F6: sipush 9000 (0x2328)
		// @16F9: iconst_0
		// @16FA: new game.C_100327_ib
		// @16FD: dup
		// @16FE: getstatic game.C_100153_be[] game.C_100313_lg.field_107166_b
		// @1701: iconst_2
		// @1702: aaload
		// @1703: bipush 64 (0x40)
		// @1705: bipush 17 (0x11)
		// @1707: iconst_2
		// @1708: anewarray game.C_100049_vf
		// @170B: dup
		// @170C: iconst_0
		// @170D: new game.C_100049_vf
		// @1710: dup
		// @1711: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @1714: bipush 16 (0x10)
		// @1716: aaload
		// @1717: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @171A: aastore
		// @171B: dup
		// @171C: iconst_1
		// @171D: new game.C_100049_vf
		// @1720: dup
		// @1721: bipush 61 (0x3D)
		// @1723: bipush 54 (0x36)
		// @1725: iconst_0
		// @1726: iconst_0
		// @1727: new game.C_100327_ib
		// @172A: dup
		// @172B: getstatic game.C_100153_be[] game.C_100313_lg.field_107166_b
		// @172E: bipush 13 (0x0D)
		// @1730: aaload
		// @1731: bipush 61 (0x3D)
		// @1733: bipush 75 (0x4B)
		// @1735: iconst_1
		// @1736: anewarray game.C_100049_vf
		// @1739: dup
		// @173A: iconst_0
		// @173B: new game.C_100049_vf
		// @173E: dup
		// @173F: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @1742: bipush 85 (0x55)
		// @1744: aaload
		// @1745: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @1748: aastore
		// @1749: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @174C: iconst_1
		// @174D: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @1750: aastore
		// @1751: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @1754: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @1757: aastore
		// @1758: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @175B: iconst_1
		// @175C: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @175F: aastore
		// @1760: dup
		// @1761: iconst_1
		// @1762: new game.C_100049_vf
		// @1765: dup
		// @1766: bipush 57 (0x39)
		// @1768: bipush 97 (0x61)
		// @176A: sipush -5000 (0xEC78)
		// @176D: iconst_0
		// @176E: new game.C_100327_ib
		// @1771: dup
		// @1772: getstatic game.C_100153_be[] game.C_100313_lg.field_107166_b
		// @1775: iconst_3
		// @1776: aaload
		// @1777: bipush 47 (0x2F)
		// @1779: bipush 38 (0x26)
		// @177B: iconst_2
		// @177C: anewarray game.C_100049_vf
		// @177F: dup
		// @1780: iconst_0
		// @1781: new game.C_100049_vf
		// @1784: dup
		// @1785: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @1788: bipush 91 (0x5B)
		// @178A: aaload
		// @178B: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @178E: aastore
		// @178F: dup
		// @1790: iconst_1
		// @1791: new game.C_100049_vf
		// @1794: dup
		// @1795: bipush 56 (0x38)
		// @1797: bipush 88 (0x58)
		// @1799: sipush 5000 (0x1388)
		// @179C: iconst_0
		// @179D: new game.C_100327_ib
		// @17A0: dup
		// @17A1: getstatic game.C_100153_be[] game.C_100313_lg.field_107166_b
		// @17A4: iconst_4
		// @17A5: aaload
		// @17A6: bipush 64 (0x40)
		// @17A8: bipush 17 (0x11)
		// @17AA: iconst_2
		// @17AB: anewarray game.C_100049_vf
		// @17AE: dup
		// @17AF: iconst_0
		// @17B0: new game.C_100049_vf
		// @17B3: dup
		// @17B4: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @17B7: bipush 28 (0x1C)
		// @17B9: aaload
		// @17BA: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @17BD: aastore
		// @17BE: dup
		// @17BF: iconst_1
		// @17C0: new game.C_100049_vf
		// @17C3: dup
		// @17C4: bipush 61 (0x3D)
		// @17C6: bipush 54 (0x36)
		// @17C8: iconst_0
		// @17C9: iconst_0
		// @17CA: new game.C_100327_ib
		// @17CD: dup
		// @17CE: getstatic game.C_100153_be[] game.C_100313_lg.field_107166_b
		// @17D1: bipush 12 (0x0C)
		// @17D3: aaload
		// @17D4: bipush 61 (0x3D)
		// @17D6: bipush 75 (0x4B)
		// @17D8: iconst_1
		// @17D9: anewarray game.C_100049_vf
		// @17DC: dup
		// @17DD: iconst_0
		// @17DE: new game.C_100049_vf
		// @17E1: dup
		// @17E2: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @17E5: bipush 48 (0x30)
		// @17E7: aaload
		// @17E8: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @17EB: aastore
		// @17EC: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @17EF: iconst_1
		// @17F0: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @17F3: aastore
		// @17F4: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @17F7: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @17FA: aastore
		// @17FB: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @17FE: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @1801: aastore
		// @1802: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @1805: iconst_1
		// @1806: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @1809: aastore
		// @180A: dup
		// @180B: bipush 6 (0x06)
		// @180D: new game.C_100049_vf
		// @1810: dup
		// @1811: bipush 68 (0x44)
		// @1813: bipush 19 (0x13)
		// @1815: sipush 16384 (0x4000)
		// @1818: iconst_0
		// @1819: iconst_2
		// @181A: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @181D: aastore
		// @181E: dup
		// @181F: bipush 7 (0x07)
		// @1821: new game.C_100049_vf
		// @1824: dup
		// @1825: bipush 62 (0x3E)
		// @1827: bipush 28 (0x1C)
		// @1829: sipush 16384 (0x4000)
		// @182C: iconst_0
		// @182D: bipush 8 (0x08)
		// @182F: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @1832: aastore
		// @1833: dup
		// @1834: bipush 8 (0x08)
		// @1836: new game.C_100049_vf
		// @1839: dup
		// @183A: bipush 62 (0x3E)
		// @183C: bipush 38 (0x26)
		// @183E: sipush 16384 (0x4000)
		// @1841: iconst_0
		// @1842: iconst_4
		// @1843: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @1846: aastore
		// @1847: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @184A: astore_1
		// @184B: aload_1
		// @184C: bipush 65 (0x41)
		// @184E: putfield int game.C_100327_ib.field_102494_P
		// @1851: iconst_0
		// @1852: aload_1
		// @1853: invokestatic game.C_100226_ae.func_106142_a(boolean, game.C_100327_ib)game.C_100327_ib
		// @1856: astore_1
		// @1857: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @185A: bipush 126 (0x7E)
		// @185C: aload_1
		// @185D: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @1860: new game.C_100327_ib
		// @1863: dup
		// @1864: getstatic game.C_100153_be[] game.C_100281_ng.field_103462_H
		// @1867: iconst_1
		// @1868: aaload
		// @1869: iconst_2
		// @186A: bipush 60 (0x3C)
		// @186C: bipush 61 (0x3D)
		// @186E: sipush -16384 (0xC000)
		// @1871: iconst_0
		// @1872: iconst_3
		// @1873: anewarray game.C_100049_vf
		// @1876: dup
		// @1877: iconst_0
		// @1878: new game.C_100049_vf
		// @187B: dup
		// @187C: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @187F: bipush 53 (0x35)
		// @1881: aaload
		// @1882: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @1885: aastore
		// @1886: dup
		// @1887: iconst_1
		// @1888: new game.C_100049_vf
		// @188B: dup
		// @188C: bipush 50 (0x32)
		// @188E: iconst_2
		// @188F: sipush 550 (0x0226)
		// @1892: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @1895: aastore
		// @1896: dup
		// @1897: iconst_2
		// @1898: new game.C_100049_vf
		// @189B: dup
		// @189C: bipush 71 (0x47)
		// @189E: bipush 70 (0x46)
		// @18A0: sipush -5461 (0xEAAB)
		// @18A3: sipush 9362 (0x2492)
		// @18A6: new game.C_100327_ib
		// @18A9: dup
		// @18AA: getstatic game.C_100153_be[] game.C_100281_ng.field_103462_H
		// @18AD: bipush 8 (0x08)
		// @18AF: aaload
		// @18B0: bipush 71 (0x47)
		// @18B2: bipush 70 (0x46)
		// @18B4: iconst_1
		// @18B5: anewarray game.C_100049_vf
		// @18B8: dup
		// @18B9: iconst_0
		// @18BA: new game.C_100049_vf
		// @18BD: dup
		// @18BE: bipush 78 (0x4E)
		// @18C0: bipush 77 (0x4D)
		// @18C2: sipush 16384 (0x4000)
		// @18C5: iconst_0
		// @18C6: bipush 16 (0x10)
		// @18C8: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @18CB: aastore
		// @18CC: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @18CF: iconst_1
		// @18D0: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @18D3: aastore
		// @18D4: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @18D7: astore_1
		// @18D8: aload_1
		// @18D9: bipush 68 (0x44)
		// @18DB: putfield int game.C_100327_ib.field_102494_P
		// @18DE: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @18E1: bipush 124 (0x7C)
		// @18E3: aload_1
		// @18E4: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @18E7: new game.C_100327_ib
		// @18EA: dup
		// @18EB: getstatic game.C_100153_be[] game.C_100281_ng.field_103462_H
		// @18EE: iconst_0
		// @18EF: aaload
		// @18F0: bipush 8 (0x08)
		// @18F2: bipush 42 (0x2A)
		// @18F4: bipush 50 (0x32)
		// @18F6: sipush -21845 (0xAAAB)
		// @18F9: sipush 10922 (0x2AAA)
		// @18FC: iconst_3
		// @18FD: anewarray game.C_100049_vf
		// @1900: dup
		// @1901: iconst_0
		// @1902: new game.C_100049_vf
		// @1905: dup
		// @1906: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @1909: bipush 75 (0x4B)
		// @190B: aaload
		// @190C: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @190F: aastore
		// @1910: dup
		// @1911: iconst_1
		// @1912: new game.C_100049_vf
		// @1915: dup
		// @1916: bipush 50 (0x32)
		// @1918: iconst_0
		// @1919: sipush 175 (0x00AF)
		// @191C: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @191F: aastore
		// @1920: dup
		// @1921: iconst_2
		// @1922: new game.C_100049_vf
		// @1925: dup
		// @1926: bipush 65 (0x41)
		// @1928: bipush 60 (0x3C)
		// @192A: sipush 16384 (0x4000)
		// @192D: iconst_0
		// @192E: sipush 288 (0x0120)
		// @1931: iconst_1
		// @1932: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @1935: aastore
		// @1936: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @1939: astore_1
		// @193A: aload_1
		// @193B: bipush 71 (0x47)
		// @193D: putfield int game.C_100327_ib.field_102494_P
		// @1940: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @1943: bipush 123 (0x7B)
		// @1945: aload_1
		// @1946: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @1949: new game.C_100327_ib
		// @194C: dup
		// @194D: getstatic game.C_100153_be[] game.C_100281_ng.field_103462_H
		// @1950: bipush 9 (0x09)
		// @1952: aaload
		// @1953: iconst_4
		// @1954: bipush 62 (0x3E)
		// @1956: bipush 55 (0x37)
		// @1958: sipush -8192 (0xE000)
		// @195B: sipush 8192 (0x2000)
		// @195E: iconst_3
		// @195F: anewarray game.C_100049_vf
		// @1962: dup
		// @1963: iconst_0
		// @1964: new game.C_100049_vf
		// @1967: dup
		// @1968: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @196B: bipush 105 (0x69)
		// @196D: aaload
		// @196E: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @1971: aastore
		// @1972: dup
		// @1973: iconst_1
		// @1974: new game.C_100049_vf
		// @1977: dup
		// @1978: bipush 50 (0x32)
		// @197A: iconst_0
		// @197B: sipush 225 (0x00E1)
		// @197E: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @1981: aastore
		// @1982: dup
		// @1983: iconst_2
		// @1984: new game.C_100049_vf
		// @1987: dup
		// @1988: bipush 80 (0x50)
		// @198A: bipush 74 (0x4A)
		// @198C: iconst_0
		// @198D: sipush 4096 (0x1000)
		// @1990: new game.C_100327_ib
		// @1993: dup
		// @1994: getstatic game.C_100153_be[] game.C_100281_ng.field_103462_H
		// @1997: bipush 10 (0x0A)
		// @1999: aaload
		// @199A: bipush 52 (0x34)
		// @199C: bipush 60 (0x3C)
		// @199E: iconst_4
		// @199F: anewarray game.C_100049_vf
		// @19A2: dup
		// @19A3: iconst_0
		// @19A4: new game.C_100049_vf
		// @19A7: dup
		// @19A8: bipush 85 (0x55)
		// @19AA: bipush 53 (0x35)
		// @19AC: sipush 16384 (0x4000)
		// @19AF: iconst_0
		// @19B0: sipush 128 (0x0080)
		// @19B3: iconst_1
		// @19B4: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @19B7: aastore
		// @19B8: dup
		// @19B9: iconst_1
		// @19BA: new game.C_100049_vf
		// @19BD: dup
		// @19BE: bipush 85 (0x55)
		// @19C0: bipush 60 (0x3C)
		// @19C2: sipush 16384 (0x4000)
		// @19C5: iconst_0
		// @19C6: sipush 128 (0x0080)
		// @19C9: iconst_1
		// @19CA: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @19CD: aastore
		// @19CE: dup
		// @19CF: iconst_2
		// @19D0: new game.C_100049_vf
		// @19D3: dup
		// @19D4: bipush 85 (0x55)
		// @19D6: bipush 67 (0x43)
		// @19D8: sipush 16384 (0x4000)
		// @19DB: iconst_0
		// @19DC: sipush 128 (0x0080)
		// @19DF: iconst_1
		// @19E0: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @19E3: aastore
		// @19E4: dup
		// @19E5: iconst_3
		// @19E6: new game.C_100049_vf
		// @19E9: dup
		// @19EA: bipush 74 (0x4A)
		// @19EC: bipush 68 (0x44)
		// @19EE: sipush 16384 (0x4000)
		// @19F1: iconst_0
		// @19F2: sipush 144 (0x0090)
		// @19F5: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @19F8: aastore
		// @19F9: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @19FC: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @19FF: aastore
		// @1A00: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @1A03: astore_1
		// @1A04: aload_1
		// @1A05: bipush 70 (0x46)
		// @1A07: putfield int game.C_100327_ib.field_102494_P
		// @1A0A: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @1A0D: bipush 124 (0x7C)
		// @1A0F: aload_1
		// @1A10: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @1A13: new game.C_100327_ib
		// @1A16: dup
		// @1A17: getstatic game.C_100153_be[] game.C_100281_ng.field_103462_H
		// @1A1A: bipush 9 (0x09)
		// @1A1C: aaload
		// @1A1D: sipush 1024 (0x0400)
		// @1A20: bipush 62 (0x3E)
		// @1A22: bipush 55 (0x37)
		// @1A24: sipush -16384 (0xC000)
		// @1A27: sipush 8192 (0x2000)
		// @1A2A: iconst_2
		// @1A2B: anewarray game.C_100049_vf
		// @1A2E: dup
		// @1A2F: iconst_0
		// @1A30: new game.C_100049_vf
		// @1A33: dup
		// @1A34: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @1A37: bipush 82 (0x52)
		// @1A39: aaload
		// @1A3A: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @1A3D: aastore
		// @1A3E: dup
		// @1A3F: iconst_1
		// @1A40: new game.C_100049_vf
		// @1A43: dup
		// @1A44: bipush 80 (0x50)
		// @1A46: bipush 74 (0x4A)
		// @1A48: iconst_0
		// @1A49: sipush 4096 (0x1000)
		// @1A4C: new game.C_100327_ib
		// @1A4F: dup
		// @1A50: getstatic game.C_100153_be[] game.C_100281_ng.field_103462_H
		// @1A53: bipush 10 (0x0A)
		// @1A55: aaload
		// @1A56: bipush 52 (0x34)
		// @1A58: bipush 60 (0x3C)
		// @1A5A: iconst_4
		// @1A5B: anewarray game.C_100049_vf
		// @1A5E: dup
		// @1A5F: iconst_0
		// @1A60: new game.C_100049_vf
		// @1A63: dup
		// @1A64: bipush 85 (0x55)
		// @1A66: bipush 53 (0x35)
		// @1A68: sipush 16384 (0x4000)
		// @1A6B: iconst_0
		// @1A6C: sipush 128 (0x0080)
		// @1A6F: iconst_1
		// @1A70: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @1A73: aastore
		// @1A74: dup
		// @1A75: iconst_1
		// @1A76: new game.C_100049_vf
		// @1A79: dup
		// @1A7A: bipush 85 (0x55)
		// @1A7C: bipush 60 (0x3C)
		// @1A7E: sipush 16384 (0x4000)
		// @1A81: iconst_0
		// @1A82: sipush 128 (0x0080)
		// @1A85: iconst_1
		// @1A86: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @1A89: aastore
		// @1A8A: dup
		// @1A8B: iconst_2
		// @1A8C: new game.C_100049_vf
		// @1A8F: dup
		// @1A90: bipush 85 (0x55)
		// @1A92: bipush 67 (0x43)
		// @1A94: sipush 16384 (0x4000)
		// @1A97: iconst_0
		// @1A98: sipush 128 (0x0080)
		// @1A9B: iconst_1
		// @1A9C: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @1A9F: aastore
		// @1AA0: dup
		// @1AA1: iconst_3
		// @1AA2: new game.C_100049_vf
		// @1AA5: dup
		// @1AA6: bipush 74 (0x4A)
		// @1AA8: bipush 68 (0x44)
		// @1AAA: sipush 16384 (0x4000)
		// @1AAD: iconst_0
		// @1AAE: sipush 144 (0x0090)
		// @1AB1: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @1AB4: aastore
		// @1AB5: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @1AB8: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @1ABB: aastore
		// @1ABC: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @1ABF: astore_1
		// @1AC0: aload_1
		// @1AC1: bipush 100 (0x64)
		// @1AC3: putfield int game.C_100327_ib.field_102494_P
		// @1AC6: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @1AC9: bipush 126 (0x7E)
		// @1ACB: aload_1
		// @1ACC: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @1ACF: new game.C_100327_ib
		// @1AD2: dup
		// @1AD3: getstatic game.C_100153_be[] game.C_100281_ng.field_103462_H
		// @1AD6: iconst_5
		// @1AD7: aaload
		// @1AD8: iconst_1
		// @1AD9: bipush 58 (0x3A)
		// @1ADB: sipush 169 (0x00A9)
		// @1ADE: iconst_0
		// @1ADF: iconst_0
		// @1AE0: bipush 9 (0x09)
		// @1AE2: anewarray game.C_100049_vf
		// @1AE5: dup
		// @1AE6: iconst_0
		// @1AE7: new game.C_100049_vf
		// @1AEA: dup
		// @1AEB: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @1AEE: bipush 106 (0x6A)
		// @1AF0: aaload
		// @1AF1: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @1AF4: aastore
		// @1AF5: dup
		// @1AF6: iconst_1
		// @1AF7: new game.C_100049_vf
		// @1AFA: dup
		// @1AFB: sipush 300 (0x012C)
		// @1AFE: iconst_3
		// @1AFF: sipush 1325 (0x052D)
		// @1B02: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @1B05: aastore
		// @1B06: dup
		// @1B07: iconst_2
		// @1B08: new game.C_100049_vf
		// @1B0B: dup
		// @1B0C: sipush 256 (0x0100)
		// @1B0F: invokespecial game.C_100049_vf.<init>(int)void
		// @1B12: aastore
		// @1B13: dup
		// @1B14: iconst_3
		// @1B15: new game.C_100049_vf
		// @1B18: dup
		// @1B19: sipush 275 (0x0113)
		// @1B1C: sipush 150 (0x0096)
		// @1B1F: invokespecial game.C_100049_vf.<init>(int, int)void
		// @1B22: aastore
		// @1B23: dup
		// @1B24: iconst_4
		// @1B25: new game.C_100049_vf
		// @1B28: dup
		// @1B29: bipush 64 (0x40)
		// @1B2B: bipush 57 (0x39)
		// @1B2D: iconst_0
		// @1B2E: iconst_0
		// @1B2F: new game.C_100327_ib
		// @1B32: dup
		// @1B33: getstatic game.C_100153_be[] game.C_100281_ng.field_103462_H
		// @1B36: bipush 7 (0x07)
		// @1B38: aaload
		// @1B39: bipush 63 (0x3F)
		// @1B3B: bipush 79 (0x4F)
		// @1B3D: iconst_5
		// @1B3E: anewarray game.C_100049_vf
		// @1B41: dup
		// @1B42: iconst_0
		// @1B43: new game.C_100049_vf
		// @1B46: dup
		// @1B47: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @1B4A: sipush 129 (0x0081)
		// @1B4D: aaload
		// @1B4E: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @1B51: aastore
		// @1B52: dup
		// @1B53: iconst_1
		// @1B54: new game.C_100049_vf
		// @1B57: dup
		// @1B58: bipush 110 (0x6E)
		// @1B5A: bipush 67 (0x43)
		// @1B5C: sipush 16384 (0x4000)
		// @1B5F: iconst_0
		// @1B60: iconst_2
		// @1B61: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @1B64: aastore
		// @1B65: dup
		// @1B66: iconst_2
		// @1B67: new game.C_100049_vf
		// @1B6A: dup
		// @1B6B: bipush 94 (0x5E)
		// @1B6D: bipush 73 (0x49)
		// @1B6F: sipush 16384 (0x4000)
		// @1B72: iconst_0
		// @1B73: iconst_4
		// @1B74: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @1B77: aastore
		// @1B78: dup
		// @1B79: iconst_3
		// @1B7A: new game.C_100049_vf
		// @1B7D: dup
		// @1B7E: bipush 39 (0x27)
		// @1B80: bipush 40 (0x28)
		// @1B82: sipush 16384 (0x4000)
		// @1B85: iconst_0
		// @1B86: bipush 8 (0x08)
		// @1B88: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @1B8B: aastore
		// @1B8C: dup
		// @1B8D: iconst_4
		// @1B8E: new game.C_100049_vf
		// @1B91: dup
		// @1B92: bipush 94 (0x5E)
		// @1B94: bipush 73 (0x49)
		// @1B96: sipush 16384 (0x4000)
		// @1B99: iconst_0
		// @1B9A: sipush 1024 (0x0400)
		// @1B9D: iconst_1
		// @1B9E: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @1BA1: aastore
		// @1BA2: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @1BA5: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @1BA8: aastore
		// @1BA9: dup
		// @1BAA: iconst_5
		// @1BAB: new game.C_100049_vf
		// @1BAE: dup
		// @1BAF: bipush 43 (0x2B)
		// @1BB1: bipush 80 (0x50)
		// @1BB3: iconst_0
		// @1BB4: iconst_0
		// @1BB5: new game.C_100327_ib
		// @1BB8: dup
		// @1BB9: getstatic game.C_100153_be[] game.C_100281_ng.field_103462_H
		// @1BBC: iconst_2
		// @1BBD: aaload
		// @1BBE: invokevirtual game.C_100153_be.func_105310_a()game.C_100153_be
		// @1BC1: bipush 77 (0x4D)
		// @1BC3: bipush 51 (0x33)
		// @1BC5: iconst_2
		// @1BC6: anewarray game.C_100049_vf
		// @1BC9: dup
		// @1BCA: iconst_0
		// @1BCB: new game.C_100049_vf
		// @1BCE: dup
		// @1BCF: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @1BD2: bipush 80 (0x50)
		// @1BD4: aaload
		// @1BD5: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @1BD8: aastore
		// @1BD9: dup
		// @1BDA: iconst_1
		// @1BDB: new game.C_100049_vf
		// @1BDE: dup
		// @1BDF: bipush 50 (0x32)
		// @1BE1: bipush 77 (0x4D)
		// @1BE3: iconst_0
		// @1BE4: iconst_0
		// @1BE5: new game.C_100327_ib
		// @1BE8: dup
		// @1BE9: getstatic game.C_100153_be[] game.C_100281_ng.field_103462_H
		// @1BEC: iconst_3
		// @1BED: aaload
		// @1BEE: invokevirtual game.C_100153_be.func_105310_a()game.C_100153_be
		// @1BF1: bipush 76 (0x4C)
		// @1BF3: bipush 77 (0x4D)
		// @1BF5: iconst_2
		// @1BF6: anewarray game.C_100049_vf
		// @1BF9: dup
		// @1BFA: iconst_0
		// @1BFB: new game.C_100049_vf
		// @1BFE: dup
		// @1BFF: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @1C02: bipush 71 (0x47)
		// @1C04: aaload
		// @1C05: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @1C08: aastore
		// @1C09: dup
		// @1C0A: iconst_1
		// @1C0B: new game.C_100049_vf
		// @1C0E: dup
		// @1C0F: bipush 54 (0x36)
		// @1C11: bipush 58 (0x3A)
		// @1C13: iconst_0
		// @1C14: iconst_0
		// @1C15: new game.C_100327_ib
		// @1C18: dup
		// @1C19: getstatic game.C_100153_be[] game.C_100281_ng.field_103462_H
		// @1C1C: iconst_4
		// @1C1D: aaload
		// @1C1E: invokevirtual game.C_100153_be.func_105310_a()game.C_100153_be
		// @1C21: bipush 76 (0x4C)
		// @1C23: bipush 31 (0x1F)
		// @1C25: iconst_1
		// @1C26: anewarray game.C_100049_vf
		// @1C29: dup
		// @1C2A: iconst_0
		// @1C2B: new game.C_100049_vf
		// @1C2E: dup
		// @1C2F: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @1C32: bipush 21 (0x15)
		// @1C34: aaload
		// @1C35: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @1C38: aastore
		// @1C39: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @1C3C: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @1C3F: aastore
		// @1C40: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @1C43: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @1C46: aastore
		// @1C47: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @1C4A: iconst_1
		// @1C4B: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @1C4E: aastore
		// @1C4F: dup
		// @1C50: bipush 6 (0x06)
		// @1C52: new game.C_100049_vf
		// @1C55: dup
		// @1C56: bipush 62 (0x3E)
		// @1C58: bipush 83 (0x53)
		// @1C5A: iconst_0
		// @1C5B: iconst_0
		// @1C5C: new game.C_100327_ib
		// @1C5F: dup
		// @1C60: getstatic game.C_100153_be[] game.C_100281_ng.field_103462_H
		// @1C63: bipush 14 (0x0E)
		// @1C65: aaload
		// @1C66: bipush 69 (0x45)
		// @1C68: bipush 64 (0x40)
		// @1C6A: iconst_2
		// @1C6B: anewarray game.C_100049_vf
		// @1C6E: dup
		// @1C6F: iconst_0
		// @1C70: new game.C_100049_vf
		// @1C73: dup
		// @1C74: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @1C77: bipush 41 (0x29)
		// @1C79: aaload
		// @1C7A: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @1C7D: aastore
		// @1C7E: dup
		// @1C7F: iconst_1
		// @1C80: new game.C_100049_vf
		// @1C83: dup
		// @1C84: bipush 68 (0x44)
		// @1C86: bipush 40 (0x28)
		// @1C88: iconst_0
		// @1C89: iconst_0
		// @1C8A: new game.C_100327_ib
		// @1C8D: dup
		// @1C8E: getstatic game.C_100153_be[] game.C_100281_ng.field_103462_H
		// @1C91: bipush 13 (0x0D)
		// @1C93: aaload
		// @1C94: invokevirtual game.C_100153_be.func_105310_a()game.C_100153_be
		// @1C97: bipush 64 (0x40)
		// @1C99: bipush 38 (0x26)
		// @1C9B: iconst_2
		// @1C9C: anewarray game.C_100049_vf
		// @1C9F: dup
		// @1CA0: iconst_0
		// @1CA1: new game.C_100049_vf
		// @1CA4: dup
		// @1CA5: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @1CA8: bipush 22 (0x16)
		// @1CAA: aaload
		// @1CAB: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @1CAE: aastore
		// @1CAF: dup
		// @1CB0: iconst_1
		// @1CB1: new game.C_100049_vf
		// @1CB4: dup
		// @1CB5: bipush 64 (0x40)
		// @1CB7: bipush 67 (0x43)
		// @1CB9: iconst_0
		// @1CBA: iconst_0
		// @1CBB: new game.C_100327_ib
		// @1CBE: dup
		// @1CBF: getstatic game.C_100153_be[] game.C_100281_ng.field_103462_H
		// @1CC2: bipush 12 (0x0C)
		// @1CC4: aaload
		// @1CC5: invokevirtual game.C_100153_be.func_105310_a()game.C_100153_be
		// @1CC8: bipush 64 (0x40)
		// @1CCA: bipush 17 (0x11)
		// @1CCC: iconst_1
		// @1CCD: anewarray game.C_100049_vf
		// @1CD0: dup
		// @1CD1: iconst_0
		// @1CD2: new game.C_100049_vf
		// @1CD5: dup
		// @1CD6: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @1CD9: bipush 31 (0x1F)
		// @1CDB: aaload
		// @1CDC: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @1CDF: aastore
		// @1CE0: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @1CE3: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @1CE6: aastore
		// @1CE7: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @1CEA: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @1CED: aastore
		// @1CEE: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @1CF1: iconst_1
		// @1CF2: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @1CF5: aastore
		// @1CF6: dup
		// @1CF7: bipush 7 (0x07)
		// @1CF9: new game.C_100049_vf
		// @1CFC: dup
		// @1CFD: bipush 58 (0x3A)
		// @1CFF: bipush 83 (0x53)
		// @1D01: iconst_0
		// @1D02: iconst_0
		// @1D03: new game.C_100327_ib
		// @1D06: dup
		// @1D07: getstatic game.C_100153_be[] game.C_100281_ng.field_103462_H
		// @1D0A: bipush 16 (0x10)
		// @1D0C: aaload
		// @1D0D: bipush 62 (0x3E)
		// @1D0F: bipush 40 (0x28)
		// @1D11: iconst_2
		// @1D12: anewarray game.C_100049_vf
		// @1D15: dup
		// @1D16: iconst_0
		// @1D17: new game.C_100049_vf
		// @1D1A: dup
		// @1D1B: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @1D1E: bipush 102 (0x66)
		// @1D20: aaload
		// @1D21: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @1D24: aastore
		// @1D25: dup
		// @1D26: iconst_1
		// @1D27: new game.C_100049_vf
		// @1D2A: dup
		// @1D2B: bipush 62 (0x3E)
		// @1D2D: bipush 68 (0x44)
		// @1D2F: iconst_0
		// @1D30: iconst_0
		// @1D31: new game.C_100327_ib
		// @1D34: dup
		// @1D35: getstatic game.C_100153_be[] game.C_100281_ng.field_103462_H
		// @1D38: bipush 15 (0x0F)
		// @1D3A: aaload
		// @1D3B: invokevirtual game.C_100153_be.func_105310_a()game.C_100153_be
		// @1D3E: bipush 68 (0x44)
		// @1D40: bipush 64 (0x40)
		// @1D42: iconst_2
		// @1D43: anewarray game.C_100049_vf
		// @1D46: dup
		// @1D47: iconst_0
		// @1D48: new game.C_100049_vf
		// @1D4B: dup
		// @1D4C: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @1D4F: bipush 26 (0x1A)
		// @1D51: aaload
		// @1D52: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @1D55: aastore
		// @1D56: dup
		// @1D57: iconst_1
		// @1D58: new game.C_100049_vf
		// @1D5B: dup
		// @1D5C: bipush 68 (0x44)
		// @1D5E: bipush 42 (0x2A)
		// @1D60: iconst_0
		// @1D61: iconst_0
		// @1D62: new game.C_100327_ib
		// @1D65: dup
		// @1D66: getstatic game.C_100153_be[] game.C_100281_ng.field_103462_H
		// @1D69: bipush 17 (0x11)
		// @1D6B: aaload
		// @1D6C: invokevirtual game.C_100153_be.func_105310_a()game.C_100153_be
		// @1D6F: bipush 63 (0x3F)
		// @1D71: bipush 25 (0x19)
		// @1D73: iconst_1
		// @1D74: anewarray game.C_100049_vf
		// @1D77: dup
		// @1D78: iconst_0
		// @1D79: new game.C_100049_vf
		// @1D7C: dup
		// @1D7D: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @1D80: bipush 108 (0x6C)
		// @1D82: aaload
		// @1D83: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @1D86: aastore
		// @1D87: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @1D8A: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @1D8D: aastore
		// @1D8E: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @1D91: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @1D94: aastore
		// @1D95: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @1D98: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @1D9B: aastore
		// @1D9C: dup
		// @1D9D: bipush 8 (0x08)
		// @1D9F: new game.C_100049_vf
		// @1DA2: dup
		// @1DA3: bipush 80 (0x50)
		// @1DA5: bipush 80 (0x50)
		// @1DA7: iconst_0
		// @1DA8: iconst_0
		// @1DA9: new game.C_100327_ib
		// @1DAC: dup
		// @1DAD: getstatic game.C_100153_be[] game.C_100281_ng.field_103462_H
		// @1DB0: iconst_2
		// @1DB1: aaload
		// @1DB2: bipush 51 (0x33)
		// @1DB4: bipush 51 (0x33)
		// @1DB6: iconst_2
		// @1DB7: anewarray game.C_100049_vf
		// @1DBA: dup
		// @1DBB: iconst_0
		// @1DBC: new game.C_100049_vf
		// @1DBF: dup
		// @1DC0: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @1DC3: bipush 124 (0x7C)
		// @1DC5: aaload
		// @1DC6: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @1DC9: aastore
		// @1DCA: dup
		// @1DCB: iconst_1
		// @1DCC: new game.C_100049_vf
		// @1DCF: dup
		// @1DD0: bipush 78 (0x4E)
		// @1DD2: bipush 77 (0x4D)
		// @1DD4: iconst_0
		// @1DD5: iconst_0
		// @1DD6: new game.C_100327_ib
		// @1DD9: dup
		// @1DDA: getstatic game.C_100153_be[] game.C_100281_ng.field_103462_H
		// @1DDD: iconst_3
		// @1DDE: aaload
		// @1DDF: bipush 52 (0x34)
		// @1DE1: bipush 77 (0x4D)
		// @1DE3: iconst_2
		// @1DE4: anewarray game.C_100049_vf
		// @1DE7: dup
		// @1DE8: iconst_0
		// @1DE9: new game.C_100049_vf
		// @1DEC: dup
		// @1DED: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @1DF0: bipush 37 (0x25)
		// @1DF2: aaload
		// @1DF3: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @1DF6: aastore
		// @1DF7: dup
		// @1DF8: iconst_1
		// @1DF9: new game.C_100049_vf
		// @1DFC: dup
		// @1DFD: bipush 74 (0x4A)
		// @1DFF: bipush 58 (0x3A)
		// @1E01: iconst_0
		// @1E02: iconst_0
		// @1E03: new game.C_100327_ib
		// @1E06: dup
		// @1E07: getstatic game.C_100153_be[] game.C_100281_ng.field_103462_H
		// @1E0A: iconst_4
		// @1E0B: aaload
		// @1E0C: bipush 52 (0x34)
		// @1E0E: bipush 31 (0x1F)
		// @1E10: iconst_1
		// @1E11: anewarray game.C_100049_vf
		// @1E14: dup
		// @1E15: iconst_0
		// @1E16: new game.C_100049_vf
		// @1E19: dup
		// @1E1A: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @1E1D: bipush 99 (0x63)
		// @1E1F: aaload
		// @1E20: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @1E23: aastore
		// @1E24: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @1E27: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @1E2A: aastore
		// @1E2B: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @1E2E: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @1E31: aastore
		// @1E32: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @1E35: iconst_1
		// @1E36: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @1E39: aastore
		// @1E3A: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @1E3D: astore_1
		// @1E3E: aload_1
		// @1E3F: bipush 69 (0x45)
		// @1E41: putfield int game.C_100327_ib.field_102494_P
		// @1E44: iconst_0
		// @1E45: aload_1
		// @1E46: invokestatic game.C_100226_ae.func_106142_a(boolean, game.C_100327_ib)game.C_100327_ib
		// @1E49: astore_1
		// @1E4A: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @1E4D: bipush 126 (0x7E)
		// @1E4F: aload_1
		// @1E50: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @1E53: new game.C_100327_ib
		// @1E56: dup
		// @1E57: getstatic game.C_100153_be[] game.C_100217_ao.field_106045_i
		// @1E5A: bipush 15 (0x0F)
		// @1E5C: aaload
		// @1E5D: iconst_2
		// @1E5E: bipush 84 (0x54)
		// @1E60: bipush 115 (0x73)
		// @1E62: sipush -16384 (0xC000)
		// @1E65: sipush 4096 (0x1000)
		// @1E68: iconst_2
		// @1E69: anewarray game.C_100049_vf
		// @1E6C: dup
		// @1E6D: iconst_0
		// @1E6E: new game.C_100049_vf
		// @1E71: dup
		// @1E72: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @1E75: bipush 118 (0x76)
		// @1E77: aaload
		// @1E78: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @1E7B: aastore
		// @1E7C: dup
		// @1E7D: iconst_1
		// @1E7E: new game.C_100049_vf
		// @1E81: dup
		// @1E82: sipush 150 (0x0096)
		// @1E85: iconst_2
		// @1E86: sipush 575 (0x023F)
		// @1E89: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @1E8C: aastore
		// @1E8D: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @1E90: astore_1
		// @1E91: aload_1
		// @1E92: bipush 74 (0x4A)
		// @1E94: putfield int game.C_100327_ib.field_102494_P
		// @1E97: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @1E9A: bipush 124 (0x7C)
		// @1E9C: aload_1
		// @1E9D: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @1EA0: new game.C_100327_ib
		// @1EA3: dup
		// @1EA4: getstatic game.C_100153_be[] game.C_100092_um.field_104534_a
		// @1EA7: bipush 10 (0x0A)
		// @1EA9: aaload
		// @1EAA: bipush 8 (0x08)
		// @1EAC: bipush 113 (0x71)
		// @1EAE: bipush 118 (0x76)
		// @1EB0: sipush -16384 (0xC000)
		// @1EB3: sipush 2048 (0x0800)
		// @1EB6: bipush 8 (0x08)
		// @1EB8: anewarray game.C_100049_vf
		// @1EBB: dup
		// @1EBC: iconst_0
		// @1EBD: new game.C_100049_vf
		// @1EC0: dup
		// @1EC1: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @1EC4: bipush 115 (0x73)
		// @1EC6: aaload
		// @1EC7: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @1ECA: aastore
		// @1ECB: dup
		// @1ECC: iconst_1
		// @1ECD: new game.C_100049_vf
		// @1ED0: dup
		// @1ED1: bipush 100 (0x64)
		// @1ED3: iconst_0
		// @1ED4: sipush 200 (0x00C8)
		// @1ED7: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @1EDA: aastore
		// @1EDB: dup
		// @1EDC: iconst_2
		// @1EDD: new game.C_100049_vf
		// @1EE0: dup
		// @1EE1: sipush 142 (0x008E)
		// @1EE4: bipush 54 (0x36)
		// @1EE6: sipush 16384 (0x4000)
		// @1EE9: iconst_0
		// @1EEA: sipush 128 (0x0080)
		// @1EED: iconst_1
		// @1EEE: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @1EF1: aastore
		// @1EF2: dup
		// @1EF3: iconst_3
		// @1EF4: new game.C_100049_vf
		// @1EF7: dup
		// @1EF8: sipush 142 (0x008E)
		// @1EFB: bipush 61 (0x3D)
		// @1EFD: sipush 16384 (0x4000)
		// @1F00: iconst_0
		// @1F01: sipush 128 (0x0080)
		// @1F04: iconst_1
		// @1F05: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @1F08: aastore
		// @1F09: dup
		// @1F0A: iconst_4
		// @1F0B: new game.C_100049_vf
		// @1F0E: dup
		// @1F0F: sipush 142 (0x008E)
		// @1F12: bipush 68 (0x44)
		// @1F14: sipush 16384 (0x4000)
		// @1F17: iconst_0
		// @1F18: sipush 128 (0x0080)
		// @1F1B: iconst_1
		// @1F1C: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @1F1F: aastore
		// @1F20: dup
		// @1F21: iconst_5
		// @1F22: new game.C_100049_vf
		// @1F25: dup
		// @1F26: sipush 142 (0x008E)
		// @1F29: bipush 75 (0x4B)
		// @1F2B: sipush 16384 (0x4000)
		// @1F2E: iconst_0
		// @1F2F: sipush 128 (0x0080)
		// @1F32: iconst_1
		// @1F33: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @1F36: aastore
		// @1F37: dup
		// @1F38: bipush 6 (0x06)
		// @1F3A: new game.C_100049_vf
		// @1F3D: dup
		// @1F3E: sipush 142 (0x008E)
		// @1F41: bipush 82 (0x52)
		// @1F43: sipush 16384 (0x4000)
		// @1F46: iconst_0
		// @1F47: sipush 128 (0x0080)
		// @1F4A: iconst_1
		// @1F4B: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @1F4E: aastore
		// @1F4F: dup
		// @1F50: bipush 7 (0x07)
		// @1F52: new game.C_100049_vf
		// @1F55: dup
		// @1F56: sipush 142 (0x008E)
		// @1F59: bipush 88 (0x58)
		// @1F5B: sipush 16384 (0x4000)
		// @1F5E: iconst_0
		// @1F5F: sipush 128 (0x0080)
		// @1F62: iconst_1
		// @1F63: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @1F66: aastore
		// @1F67: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @1F6A: astore_1
		// @1F6B: aload_1
		// @1F6C: bipush 73 (0x49)
		// @1F6E: putfield int game.C_100327_ib.field_102494_P
		// @1F71: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @1F74: bipush 124 (0x7C)
		// @1F76: aload_1
		// @1F77: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @1F7A: new game.C_100327_ib
		// @1F7D: dup
		// @1F7E: getstatic game.C_100153_be[] game.C_100217_ao.field_106045_i
		// @1F81: bipush 17 (0x11)
		// @1F83: aaload
		// @1F84: iconst_1
		// @1F85: bipush 120 (0x78)
		// @1F87: sipush 170 (0x00AA)
		// @1F8A: iconst_0
		// @1F8B: iconst_0
		// @1F8C: bipush 7 (0x07)
		// @1F8E: anewarray game.C_100049_vf
		// @1F91: dup
		// @1F92: iconst_0
		// @1F93: new game.C_100049_vf
		// @1F96: dup
		// @1F97: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @1F9A: bipush 40 (0x28)
		// @1F9C: aaload
		// @1F9D: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @1FA0: aastore
		// @1FA1: dup
		// @1FA2: iconst_1
		// @1FA3: new game.C_100049_vf
		// @1FA6: dup
		// @1FA7: sipush 300 (0x012C)
		// @1FAA: iconst_5
		// @1FAB: sipush 2150 (0x0866)
		// @1FAE: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @1FB1: aastore
		// @1FB2: dup
		// @1FB3: iconst_2
		// @1FB4: new game.C_100049_vf
		// @1FB7: dup
		// @1FB8: sipush 250 (0x00FA)
		// @1FBB: iconst_0
		// @1FBC: invokespecial game.C_100049_vf.<init>(int, int)void
		// @1FBF: aastore
		// @1FC0: dup
		// @1FC1: iconst_3
		// @1FC2: new game.C_100049_vf
		// @1FC5: dup
		// @1FC6: sipush 256 (0x0100)
		// @1FC9: invokespecial game.C_100049_vf.<init>(int)void
		// @1FCC: aastore
		// @1FCD: dup
		// @1FCE: iconst_4
		// @1FCF: new game.C_100049_vf
		// @1FD2: dup
		// @1FD3: bipush 91 (0x5B)
		// @1FD5: bipush 108 (0x6C)
		// @1FD7: iconst_0
		// @1FD8: iconst_0
		// @1FD9: new game.C_100327_ib
		// @1FDC: dup
		// @1FDD: getstatic game.C_100153_be[] game.C_100217_ao.field_106045_i
		// @1FE0: bipush 16 (0x10)
		// @1FE2: aaload
		// @1FE3: bipush 91 (0x5B)
		// @1FE5: bipush 108 (0x6C)
		// @1FE7: iconst_3
		// @1FE8: anewarray game.C_100049_vf
		// @1FEB: dup
		// @1FEC: iconst_0
		// @1FED: new game.C_100049_vf
		// @1FF0: dup
		// @1FF1: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @1FF4: bipush 70 (0x46)
		// @1FF6: aaload
		// @1FF7: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @1FFA: aastore
		// @1FFB: dup
		// @1FFC: iconst_1
		// @1FFD: new game.C_100049_vf
		// @2000: dup
		// @2001: bipush 27 (0x1B)
		// @2003: bipush 61 (0x3D)
		// @2005: sipush -3276 (0xF334)
		// @2008: sipush 6553 (0x1999)
		// @200B: new game.C_100327_ib
		// @200E: dup
		// @200F: getstatic game.C_100153_be[] game.C_100217_ao.field_106045_i
		// @2012: bipush 11 (0x0B)
		// @2014: aaload
		// @2015: bipush 27 (0x1B)
		// @2017: bipush 61 (0x3D)
		// @2019: iconst_1
		// @201A: anewarray game.C_100049_vf
		// @201D: dup
		// @201E: iconst_0
		// @201F: new game.C_100049_vf
		// @2022: dup
		// @2023: bipush 76 (0x4C)
		// @2025: bipush 40 (0x28)
		// @2027: sipush 11384 (0x2C78)
		// @202A: iconst_0
		// @202B: bipush 32 (0x20)
		// @202D: iconst_0
		// @202E: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @2031: aastore
		// @2032: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @2035: iconst_0
		// @2036: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @2039: aastore
		// @203A: dup
		// @203B: iconst_2
		// @203C: new game.C_100049_vf
		// @203F: dup
		// @2040: bipush 80 (0x50)
		// @2042: bipush 113 (0x71)
		// @2044: iconst_0
		// @2045: iconst_0
		// @2046: new game.C_100327_ib
		// @2049: dup
		// @204A: getstatic game.C_100153_be[] game.C_100217_ao.field_106045_i
		// @204D: iconst_1
		// @204E: aaload
		// @204F: bipush 99 (0x63)
		// @2051: bipush 29 (0x1D)
		// @2053: iconst_2
		// @2054: anewarray game.C_100049_vf
		// @2057: dup
		// @2058: iconst_0
		// @2059: new game.C_100049_vf
		// @205C: dup
		// @205D: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @2060: sipush 128 (0x0080)
		// @2063: aaload
		// @2064: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @2067: aastore
		// @2068: dup
		// @2069: iconst_1
		// @206A: new game.C_100049_vf
		// @206D: dup
		// @206E: bipush 53 (0x35)
		// @2070: bipush 68 (0x44)
		// @2072: iconst_0
		// @2073: iconst_0
		// @2074: new game.C_100327_ib
		// @2077: dup
		// @2078: getstatic game.C_100153_be[] game.C_100217_ao.field_106045_i
		// @207B: iconst_0
		// @207C: aaload
		// @207D: bipush 53 (0x35)
		// @207F: bipush 68 (0x44)
		// @2081: iconst_1
		// @2082: anewarray game.C_100049_vf
		// @2085: dup
		// @2086: iconst_0
		// @2087: new game.C_100049_vf
		// @208A: dup
		// @208B: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @208E: bipush 52 (0x34)
		// @2090: aaload
		// @2091: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @2094: aastore
		// @2095: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @2098: iconst_0
		// @2099: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @209C: aastore
		// @209D: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @20A0: iconst_0
		// @20A1: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @20A4: aastore
		// @20A5: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @20A8: iconst_0
		// @20A9: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @20AC: aastore
		// @20AD: dup
		// @20AE: iconst_5
		// @20AF: new game.C_100049_vf
		// @20B2: dup
		// @20B3: sipush 143 (0x008F)
		// @20B6: bipush 71 (0x47)
		// @20B8: sipush 14336 (0x3800)
		// @20BB: sipush 4096 (0x1000)
		// @20BE: bipush 64 (0x40)
		// @20C0: iconst_1
		// @20C1: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @20C4: aastore
		// @20C5: dup
		// @20C6: bipush 6 (0x06)
		// @20C8: new game.C_100049_vf
		// @20CB: dup
		// @20CC: bipush 126 (0x7E)
		// @20CE: bipush 103 (0x67)
		// @20D0: iconst_0
		// @20D1: iconst_0
		// @20D2: new game.C_100327_ib
		// @20D5: dup
		// @20D6: getstatic game.C_100153_be[] game.C_100217_ao.field_106045_i
		// @20D9: bipush 18 (0x12)
		// @20DB: aaload
		// @20DC: bipush 11 (0x0B)
		// @20DE: bipush 103 (0x67)
		// @20E0: iconst_4
		// @20E1: anewarray game.C_100049_vf
		// @20E4: dup
		// @20E5: iconst_0
		// @20E6: new game.C_100049_vf
		// @20E9: dup
		// @20EA: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @20ED: bipush 12 (0x0C)
		// @20EF: aaload
		// @20F0: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @20F3: aastore
		// @20F4: dup
		// @20F5: iconst_1
		// @20F6: new game.C_100049_vf
		// @20F9: dup
		// @20FA: bipush 35 (0x23)
		// @20FC: bipush 105 (0x69)
		// @20FE: iconst_0
		// @20FF: iconst_0
		// @2100: new game.C_100327_ib
		// @2103: dup
		// @2104: getstatic game.C_100153_be[] game.C_100217_ao.field_106045_i
		// @2107: bipush 10 (0x0A)
		// @2109: aaload
		// @210A: bipush 55 (0x37)
		// @210C: bipush 67 (0x43)
		// @210E: iconst_2
		// @210F: anewarray game.C_100049_vf
		// @2112: dup
		// @2113: iconst_0
		// @2114: new game.C_100049_vf
		// @2117: dup
		// @2118: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @211B: bipush 17 (0x11)
		// @211D: aaload
		// @211E: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @2121: aastore
		// @2122: dup
		// @2123: iconst_1
		// @2124: new game.C_100049_vf
		// @2127: dup
		// @2128: bipush 55 (0x37)
		// @212A: bipush 42 (0x2A)
		// @212C: iconst_0
		// @212D: iconst_0
		// @212E: new game.C_100327_ib
		// @2131: dup
		// @2132: getstatic game.C_100153_be[] game.C_100217_ao.field_106045_i
		// @2135: bipush 9 (0x09)
		// @2137: aaload
		// @2138: bipush 55 (0x37)
		// @213A: bipush 43 (0x2B)
		// @213C: iconst_2
		// @213D: anewarray game.C_100049_vf
		// @2140: dup
		// @2141: iconst_0
		// @2142: new game.C_100049_vf
		// @2145: dup
		// @2146: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @2149: bipush 67 (0x43)
		// @214B: aaload
		// @214C: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @214F: aastore
		// @2150: dup
		// @2151: iconst_1
		// @2152: new game.C_100049_vf
		// @2155: dup
		// @2156: bipush 62 (0x3E)
		// @2158: bipush 96 (0x60)
		// @215A: iconst_0
		// @215B: iconst_0
		// @215C: new game.C_100327_ib
		// @215F: dup
		// @2160: getstatic game.C_100153_be[] game.C_100217_ao.field_106045_i
		// @2163: bipush 8 (0x08)
		// @2165: aaload
		// @2166: bipush 62 (0x3E)
		// @2168: bipush 96 (0x60)
		// @216A: iconst_1
		// @216B: anewarray game.C_100049_vf
		// @216E: dup
		// @216F: iconst_0
		// @2170: new game.C_100049_vf
		// @2173: dup
		// @2174: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @2177: bipush 94 (0x5E)
		// @2179: aaload
		// @217A: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @217D: aastore
		// @217E: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @2181: iconst_0
		// @2182: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @2185: aastore
		// @2186: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @2189: iconst_0
		// @218A: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @218D: aastore
		// @218E: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @2191: iconst_0
		// @2192: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @2195: aastore
		// @2196: dup
		// @2197: iconst_2
		// @2198: new game.C_100049_vf
		// @219B: dup
		// @219C: bipush 8 (0x08)
		// @219E: bipush 76 (0x4C)
		// @21A0: sipush 16384 (0x4000)
		// @21A3: iconst_0
		// @21A4: bipush 8 (0x08)
		// @21A6: iconst_1
		// @21A7: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @21AA: aastore
		// @21AB: dup
		// @21AC: iconst_3
		// @21AD: new game.C_100049_vf
		// @21B0: dup
		// @21B1: bipush 56 (0x38)
		// @21B3: bipush 105 (0x69)
		// @21B5: iconst_0
		// @21B6: iconst_0
		// @21B7: new game.C_100327_ib
		// @21BA: dup
		// @21BB: getstatic game.C_100153_be[] game.C_100217_ao.field_106045_i
		// @21BE: bipush 19 (0x13)
		// @21C0: aaload
		// @21C1: bipush 56 (0x38)
		// @21C3: bipush 105 (0x69)
		// @21C5: iconst_4
		// @21C6: anewarray game.C_100049_vf
		// @21C9: dup
		// @21CA: iconst_0
		// @21CB: new game.C_100049_vf
		// @21CE: dup
		// @21CF: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @21D2: bipush 81 (0x51)
		// @21D4: aaload
		// @21D5: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @21D8: aastore
		// @21D9: dup
		// @21DA: iconst_1
		// @21DB: new game.C_100049_vf
		// @21DE: dup
		// @21DF: bipush 98 (0x62)
		// @21E1: bipush 114 (0x72)
		// @21E3: sipush 16384 (0x4000)
		// @21E6: sipush 1024 (0x0400)
		// @21E9: iconst_2
		// @21EA: iconst_1
		// @21EB: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @21EE: aastore
		// @21EF: dup
		// @21F0: iconst_2
		// @21F1: new game.C_100049_vf
		// @21F4: dup
		// @21F5: bipush 70 (0x46)
		// @21F7: bipush 110 (0x6E)
		// @21F9: iconst_0
		// @21FA: sipush 8192 (0x2000)
		// @21FD: new game.C_100327_ib
		// @2200: dup
		// @2201: getstatic game.C_100153_be[] game.C_100217_ao.field_106045_i
		// @2204: bipush 12 (0x0C)
		// @2206: aaload
		// @2207: bipush 70 (0x46)
		// @2209: bipush 110 (0x6E)
		// @220B: iconst_1
		// @220C: anewarray game.C_100049_vf
		// @220F: dup
		// @2210: iconst_0
		// @2211: new game.C_100049_vf
		// @2214: dup
		// @2215: bipush 86 (0x56)
		// @2217: bipush 93 (0x5D)
		// @2219: sipush 16384 (0x4000)
		// @221C: iconst_0
		// @221D: sipush 144 (0x0090)
		// @2220: iconst_1
		// @2221: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @2224: aastore
		// @2225: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @2228: iconst_0
		// @2229: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @222C: aastore
		// @222D: dup
		// @222E: iconst_3
		// @222F: new game.C_100049_vf
		// @2232: dup
		// @2233: bipush 70 (0x46)
		// @2235: bipush 110 (0x6E)
		// @2237: iconst_0
		// @2238: iconst_0
		// @2239: new game.C_100327_ib
		// @223C: dup
		// @223D: getstatic game.C_100153_be[] game.C_100217_ao.field_106045_i
		// @2240: iconst_5
		// @2241: aaload
		// @2242: bipush 20 (0x14)
		// @2244: bipush 29 (0x1D)
		// @2246: iconst_2
		// @2247: anewarray game.C_100049_vf
		// @224A: dup
		// @224B: iconst_0
		// @224C: new game.C_100049_vf
		// @224F: dup
		// @2250: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @2253: bipush 126 (0x7E)
		// @2255: aaload
		// @2256: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @2259: aastore
		// @225A: dup
		// @225B: iconst_1
		// @225C: new game.C_100049_vf
		// @225F: dup
		// @2260: bipush 82 (0x52)
		// @2262: bipush 82 (0x52)
		// @2264: iconst_0
		// @2265: iconst_0
		// @2266: new game.C_100327_ib
		// @2269: dup
		// @226A: getstatic game.C_100153_be[] game.C_100217_ao.field_106045_i
		// @226D: iconst_4
		// @226E: aaload
		// @226F: bipush 82 (0x52)
		// @2271: bipush 82 (0x52)
		// @2273: iconst_1
		// @2274: anewarray game.C_100049_vf
		// @2277: dup
		// @2278: iconst_0
		// @2279: new game.C_100049_vf
		// @227C: dup
		// @227D: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @2280: bipush 109 (0x6D)
		// @2282: aaload
		// @2283: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @2286: aastore
		// @2287: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @228A: iconst_0
		// @228B: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @228E: aastore
		// @228F: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @2292: iconst_0
		// @2293: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @2296: aastore
		// @2297: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @229A: iconst_0
		// @229B: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @229E: aastore
		// @229F: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @22A2: iconst_0
		// @22A3: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @22A6: aastore
		// @22A7: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @22AA: astore_1
		// @22AB: aload_1
		// @22AC: bipush 72 (0x48)
		// @22AE: putfield int game.C_100327_ib.field_102494_P
		// @22B1: iconst_0
		// @22B2: aload_1
		// @22B3: invokestatic game.C_100226_ae.func_106142_a(boolean, game.C_100327_ib)game.C_100327_ib
		// @22B6: astore_1
		// @22B7: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @22BA: bipush 127 (0x7F)
		// @22BC: aload_1
		// @22BD: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @22C0: new game.C_100327_ib
		// @22C3: dup
		// @22C4: getstatic game.C_100153_be[] game.C_100154_sl.field_105331_d
		// @22C7: bipush 7 (0x07)
		// @22C9: aaload
		// @22CA: iconst_2
		// @22CB: bipush 83 (0x53)
		// @22CD: bipush 85 (0x55)
		// @22CF: sipush -16384 (0xC000)
		// @22D2: sipush 4096 (0x1000)
		// @22D5: iconst_3
		// @22D6: anewarray game.C_100049_vf
		// @22D9: dup
		// @22DA: iconst_0
		// @22DB: new game.C_100049_vf
		// @22DE: dup
		// @22DF: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @22E2: bipush 60 (0x3C)
		// @22E4: aaload
		// @22E5: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @22E8: aastore
		// @22E9: dup
		// @22EA: iconst_1
		// @22EB: new game.C_100049_vf
		// @22EE: dup
		// @22EF: sipush 400 (0x0190)
		// @22F2: iconst_0
		// @22F3: sipush 225 (0x00E1)
		// @22F6: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @22F9: aastore
		// @22FA: dup
		// @22FB: iconst_2
		// @22FC: new game.C_100049_vf
		// @22FF: dup
		// @2300: bipush 110 (0x6E)
		// @2302: bipush 58 (0x3A)
		// @2304: sipush 16384 (0x4000)
		// @2307: iconst_0
		// @2308: sipush 144 (0x0090)
		// @230B: iconst_1
		// @230C: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @230F: aastore
		// @2310: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @2313: astore_1
		// @2314: aload_1
		// @2315: bipush 78 (0x4E)
		// @2317: putfield int game.C_100327_ib.field_102494_P
		// @231A: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @231D: bipush 123 (0x7B)
		// @231F: aload_1
		// @2320: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @2323: new game.C_100327_ib
		// @2326: dup
		// @2327: getstatic game.C_100153_be[] game.C_100154_sl.field_105331_d
		// @232A: iconst_0
		// @232B: aaload
		// @232C: bipush 32 (0x20)
		// @232E: bipush 76 (0x4C)
		// @2330: sipush 171 (0x00AB)
		// @2333: sipush -16384 (0xC000)
		// @2336: iconst_0
		// @2337: iconst_4
		// @2338: anewarray game.C_100049_vf
		// @233B: dup
		// @233C: iconst_0
		// @233D: new game.C_100049_vf
		// @2340: dup
		// @2341: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @2344: bipush 20 (0x14)
		// @2346: aaload
		// @2347: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @234A: aastore
		// @234B: dup
		// @234C: iconst_1
		// @234D: new game.C_100049_vf
		// @2350: dup
		// @2351: iconst_0
		// @2352: iconst_0
		// @2353: bipush 50 (0x32)
		// @2355: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @2358: aastore
		// @2359: dup
		// @235A: iconst_2
		// @235B: new game.C_100049_vf
		// @235E: dup
		// @235F: bipush 91 (0x5B)
		// @2361: sipush 166 (0x00A6)
		// @2364: sipush 16384 (0x4000)
		// @2367: iconst_0
		// @2368: sipush 144 (0x0090)
		// @236B: iconst_1
		// @236C: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @236F: aastore
		// @2370: dup
		// @2371: iconst_3
		// @2372: new game.C_100049_vf
		// @2375: dup
		// @2376: bipush 91 (0x5B)
		// @2378: sipush 177 (0x00B1)
		// @237B: sipush 16384 (0x4000)
		// @237E: iconst_0
		// @237F: sipush 144 (0x0090)
		// @2382: iconst_1
		// @2383: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @2386: aastore
		// @2387: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @238A: astore_1
		// @238B: aload_1
		// @238C: bipush 83 (0x53)
		// @238E: putfield int game.C_100327_ib.field_102494_P
		// @2391: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @2394: bipush 123 (0x7B)
		// @2396: aload_1
		// @2397: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @239A: new game.C_100327_ib
		// @239D: dup
		// @239E: getstatic game.C_100153_be[] game.C_100154_sl.field_105331_d
		// @23A1: iconst_2
		// @23A2: aaload
		// @23A3: iconst_4
		// @23A4: bipush 64 (0x40)
		// @23A6: bipush 103 (0x67)
		// @23A8: sipush -16384 (0xC000)
		// @23AB: sipush 4096 (0x1000)
		// @23AE: iconst_3
		// @23AF: anewarray game.C_100049_vf
		// @23B2: dup
		// @23B3: iconst_0
		// @23B4: new game.C_100049_vf
		// @23B7: dup
		// @23B8: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @23BB: bipush 114 (0x72)
		// @23BD: aaload
		// @23BE: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @23C1: aastore
		// @23C2: dup
		// @23C3: iconst_1
		// @23C4: new game.C_100049_vf
		// @23C7: dup
		// @23C8: sipush 200 (0x00C8)
		// @23CB: iconst_0
		// @23CC: sipush 400 (0x0190)
		// @23CF: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @23D2: aastore
		// @23D3: dup
		// @23D4: iconst_2
		// @23D5: new game.C_100049_vf
		// @23D8: dup
		// @23D9: bipush 64 (0x40)
		// @23DB: sipush 147 (0x0093)
		// @23DE: iconst_0
		// @23DF: iconst_0
		// @23E0: new game.C_100327_ib
		// @23E3: dup
		// @23E4: getstatic game.C_100153_be[] game.C_100154_sl.field_105331_d
		// @23E7: iconst_1
		// @23E8: aaload
		// @23E9: bipush 64 (0x40)
		// @23EB: sipush 147 (0x0093)
		// @23EE: iconst_2
		// @23EF: anewarray game.C_100049_vf
		// @23F2: dup
		// @23F3: iconst_0
		// @23F4: new game.C_100049_vf
		// @23F7: dup
		// @23F8: bipush 87 (0x57)
		// @23FA: sipush 147 (0x0093)
		// @23FD: sipush 16384 (0x4000)
		// @2400: iconst_0
		// @2401: bipush 32 (0x20)
		// @2403: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @2406: aastore
		// @2407: dup
		// @2408: iconst_1
		// @2409: new game.C_100049_vf
		// @240C: dup
		// @240D: bipush 76 (0x4C)
		// @240F: sipush 171 (0x00AB)
		// @2412: sipush 16384 (0x4000)
		// @2415: iconst_0
		// @2416: bipush 32 (0x20)
		// @2418: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @241B: aastore
		// @241C: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @241F: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @2422: aastore
		// @2423: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @2426: astore_1
		// @2427: aload_1
		// @2428: bipush 76 (0x4C)
		// @242A: putfield int game.C_100327_ib.field_102494_P
		// @242D: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @2430: bipush 127 (0x7F)
		// @2432: aload_1
		// @2433: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @2436: new game.C_100327_ib
		// @2439: dup
		// @243A: getstatic game.C_100153_be[] game.C_100154_sl.field_105331_d
		// @243D: iconst_2
		// @243E: aaload
		// @243F: sipush 1024 (0x0400)
		// @2442: bipush 64 (0x40)
		// @2444: bipush 103 (0x67)
		// @2446: sipush -16384 (0xC000)
		// @2449: sipush 4096 (0x1000)
		// @244C: iconst_2
		// @244D: anewarray game.C_100049_vf
		// @2450: dup
		// @2451: iconst_0
		// @2452: new game.C_100049_vf
		// @2455: dup
		// @2456: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @2459: bipush 46 (0x2E)
		// @245B: aaload
		// @245C: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @245F: aastore
		// @2460: dup
		// @2461: iconst_1
		// @2462: new game.C_100049_vf
		// @2465: dup
		// @2466: bipush 64 (0x40)
		// @2468: sipush 147 (0x0093)
		// @246B: iconst_0
		// @246C: iconst_0
		// @246D: new game.C_100327_ib
		// @2470: dup
		// @2471: getstatic game.C_100153_be[] game.C_100154_sl.field_105331_d
		// @2474: bipush 14 (0x0E)
		// @2476: aaload
		// @2477: bipush 86 (0x56)
		// @2479: sipush 147 (0x0093)
		// @247C: iconst_0
		// @247D: anewarray game.C_100049_vf
		// @2480: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @2483: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @2486: aastore
		// @2487: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @248A: astore_1
		// @248B: aload_1
		// @248C: bipush 102 (0x66)
		// @248E: putfield int game.C_100327_ib.field_102494_P
		// @2491: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @2494: bipush 126 (0x7E)
		// @2496: aload_1
		// @2497: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @249A: new game.C_100327_ib
		// @249D: dup
		// @249E: getstatic game.C_100153_be[] game.C_100154_sl.field_105331_d
		// @24A1: iconst_3
		// @24A2: aaload
		// @24A3: bipush 8 (0x08)
		// @24A5: bipush 64 (0x40)
		// @24A7: bipush 93 (0x5D)
		// @24A9: sipush -16384 (0xC000)
		// @24AC: sipush 2048 (0x0800)
		// @24AF: iconst_4
		// @24B0: anewarray game.C_100049_vf
		// @24B3: dup
		// @24B4: iconst_0
		// @24B5: new game.C_100049_vf
		// @24B8: dup
		// @24B9: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @24BC: bipush 11 (0x0B)
		// @24BE: aaload
		// @24BF: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @24C2: aastore
		// @24C3: dup
		// @24C4: iconst_1
		// @24C5: new game.C_100049_vf
		// @24C8: dup
		// @24C9: sipush 400 (0x0190)
		// @24CC: bipush 100 (0x64)
		// @24CE: invokespecial game.C_100049_vf.<init>(int, int)void
		// @24D1: aastore
		// @24D2: dup
		// @24D3: iconst_2
		// @24D4: new game.C_100049_vf
		// @24D7: dup
		// @24D8: bipush 100 (0x64)
		// @24DA: iconst_0
		// @24DB: sipush 475 (0x01DB)
		// @24DE: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @24E1: aastore
		// @24E2: dup
		// @24E3: iconst_3
		// @24E4: new game.C_100049_vf
		// @24E7: dup
		// @24E8: bipush 73 (0x49)
		// @24EA: bipush 91 (0x5B)
		// @24EC: sipush 16384 (0x4000)
		// @24EF: iconst_0
		// @24F0: sipush 144 (0x0090)
		// @24F3: iconst_1
		// @24F4: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @24F7: aastore
		// @24F8: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @24FB: astore_1
		// @24FC: aload_1
		// @24FD: bipush 77 (0x4D)
		// @24FF: putfield int game.C_100327_ib.field_102494_P
		// @2502: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @2505: bipush 124 (0x7C)
		// @2507: aload_1
		// @2508: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @250B: new game.C_100327_ib
		// @250E: dup
		// @250F: getstatic game.C_100153_be[] game.C_100154_sl.field_105331_d
		// @2512: bipush 10 (0x0A)
		// @2514: aaload
		// @2515: iconst_1
		// @2516: bipush 66 (0x42)
		// @2518: sipush 263 (0x0107)
		// @251B: iconst_0
		// @251C: iconst_0
		// @251D: bipush 7 (0x07)
		// @251F: anewarray game.C_100049_vf
		// @2522: dup
		// @2523: iconst_0
		// @2524: new game.C_100049_vf
		// @2527: dup
		// @2528: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @252B: bipush 9 (0x09)
		// @252D: aaload
		// @252E: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @2531: aastore
		// @2532: dup
		// @2533: iconst_1
		// @2534: new game.C_100049_vf
		// @2537: dup
		// @2538: sipush 500 (0x01F4)
		// @253B: iconst_5
		// @253C: sipush 2500 (0x09C4)
		// @253F: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @2542: aastore
		// @2543: dup
		// @2544: iconst_2
		// @2545: new game.C_100049_vf
		// @2548: dup
		// @2549: iconst_0
		// @254A: sipush 200 (0x00C8)
		// @254D: invokespecial game.C_100049_vf.<init>(int, int)void
		// @2550: aastore
		// @2551: dup
		// @2552: iconst_3
		// @2553: new game.C_100049_vf
		// @2556: dup
		// @2557: bipush 64 (0x40)
		// @2559: invokespecial game.C_100049_vf.<init>(int)void
		// @255C: aastore
		// @255D: dup
		// @255E: iconst_4
		// @255F: new game.C_100049_vf
		// @2562: dup
		// @2563: bipush 66 (0x42)
		// @2565: sipush 152 (0x0098)
		// @2568: iconst_0
		// @2569: iconst_0
		// @256A: new game.C_100327_ib
		// @256D: dup
		// @256E: getstatic game.C_100153_be[] game.C_100154_sl.field_105331_d
		// @2571: bipush 9 (0x09)
		// @2573: aaload
		// @2574: bipush 66 (0x42)
		// @2576: sipush 152 (0x0098)
		// @2579: iconst_3
		// @257A: anewarray game.C_100049_vf
		// @257D: dup
		// @257E: iconst_0
		// @257F: new game.C_100049_vf
		// @2582: dup
		// @2583: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @2586: bipush 13 (0x0D)
		// @2588: aaload
		// @2589: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @258C: aastore
		// @258D: dup
		// @258E: iconst_1
		// @258F: new game.C_100049_vf
		// @2592: dup
		// @2593: bipush 65 (0x41)
		// @2595: sipush 172 (0x00AC)
		// @2598: iconst_0
		// @2599: iconst_0
		// @259A: new game.C_100327_ib
		// @259D: dup
		// @259E: getstatic game.C_100153_be[] game.C_100154_sl.field_105331_d
		// @25A1: bipush 6 (0x06)
		// @25A3: aaload
		// @25A4: bipush 65 (0x41)
		// @25A6: sipush 172 (0x00AC)
		// @25A9: iconst_2
		// @25AA: anewarray game.C_100049_vf
		// @25AD: dup
		// @25AE: iconst_0
		// @25AF: new game.C_100049_vf
		// @25B2: dup
		// @25B3: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @25B6: bipush 65 (0x41)
		// @25B8: aaload
		// @25B9: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @25BC: aastore
		// @25BD: dup
		// @25BE: iconst_1
		// @25BF: new game.C_100049_vf
		// @25C2: dup
		// @25C3: bipush 85 (0x55)
		// @25C5: sipush 200 (0x00C8)
		// @25C8: iconst_0
		// @25C9: iconst_0
		// @25CA: new game.C_100327_ib
		// @25CD: dup
		// @25CE: getstatic game.C_100153_be[] game.C_100154_sl.field_105331_d
		// @25D1: iconst_5
		// @25D2: aaload
		// @25D3: bipush 85 (0x55)
		// @25D5: sipush 200 (0x00C8)
		// @25D8: iconst_2
		// @25D9: anewarray game.C_100049_vf
		// @25DC: dup
		// @25DD: iconst_0
		// @25DE: new game.C_100049_vf
		// @25E1: dup
		// @25E2: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @25E5: bipush 117 (0x75)
		// @25E7: aaload
		// @25E8: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @25EB: aastore
		// @25EC: dup
		// @25ED: iconst_1
		// @25EE: new game.C_100049_vf
		// @25F1: dup
		// @25F2: bipush 44 (0x2C)
		// @25F4: sipush 234 (0x00EA)
		// @25F7: iconst_0
		// @25F8: iconst_0
		// @25F9: new game.C_100327_ib
		// @25FC: dup
		// @25FD: getstatic game.C_100153_be[] game.C_100154_sl.field_105331_d
		// @2600: iconst_4
		// @2601: aaload
		// @2602: bipush 42 (0x2A)
		// @2604: sipush 219 (0x00DB)
		// @2607: iconst_2
		// @2608: anewarray game.C_100049_vf
		// @260B: dup
		// @260C: iconst_0
		// @260D: new game.C_100049_vf
		// @2610: dup
		// @2611: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @2614: bipush 125 (0x7D)
		// @2616: aaload
		// @2617: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @261A: aastore
		// @261B: dup
		// @261C: iconst_1
		// @261D: new game.C_100049_vf
		// @2620: dup
		// @2621: bipush 57 (0x39)
		// @2623: sipush 241 (0x00F1)
		// @2626: iconst_0
		// @2627: iconst_0
		// @2628: new game.C_100327_ib
		// @262B: dup
		// @262C: getstatic game.C_100153_be[] game.C_100154_sl.field_105331_d
		// @262F: bipush 16 (0x10)
		// @2631: aaload
		// @2632: bipush 57 (0x39)
		// @2634: sipush 241 (0x00F1)
		// @2637: iconst_1
		// @2638: anewarray game.C_100049_vf
		// @263B: dup
		// @263C: iconst_0
		// @263D: new game.C_100049_vf
		// @2640: dup
		// @2641: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @2644: bipush 32 (0x20)
		// @2646: aaload
		// @2647: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @264A: aastore
		// @264B: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @264E: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @2651: aastore
		// @2652: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @2655: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @2658: aastore
		// @2659: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @265C: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @265F: aastore
		// @2660: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @2663: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @2666: aastore
		// @2667: dup
		// @2668: iconst_2
		// @2669: new game.C_100049_vf
		// @266C: dup
		// @266D: bipush 70 (0x46)
		// @266F: sipush 172 (0x00AC)
		// @2672: iconst_0
		// @2673: iconst_0
		// @2674: new game.C_100327_ib
		// @2677: dup
		// @2678: getstatic game.C_100153_be[] game.C_100154_sl.field_105331_d
		// @267B: bipush 11 (0x0B)
		// @267D: aaload
		// @267E: bipush 70 (0x46)
		// @2680: sipush 172 (0x00AC)
		// @2683: iconst_2
		// @2684: anewarray game.C_100049_vf
		// @2687: dup
		// @2688: iconst_0
		// @2689: new game.C_100049_vf
		// @268C: dup
		// @268D: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @2690: bipush 98 (0x62)
		// @2692: aaload
		// @2693: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @2696: aastore
		// @2697: dup
		// @2698: iconst_1
		// @2699: new game.C_100049_vf
		// @269C: dup
		// @269D: bipush 95 (0x5F)
		// @269F: sipush 200 (0x00C8)
		// @26A2: iconst_0
		// @26A3: iconst_0
		// @26A4: new game.C_100327_ib
		// @26A7: dup
		// @26A8: getstatic game.C_100153_be[] game.C_100154_sl.field_105331_d
		// @26AB: bipush 12 (0x0C)
		// @26AD: aaload
		// @26AE: bipush 95 (0x5F)
		// @26B0: sipush 200 (0x00C8)
		// @26B3: iconst_2
		// @26B4: anewarray game.C_100049_vf
		// @26B7: dup
		// @26B8: iconst_0
		// @26B9: new game.C_100049_vf
		// @26BC: dup
		// @26BD: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @26C0: bipush 25 (0x19)
		// @26C2: aaload
		// @26C3: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @26C6: aastore
		// @26C7: dup
		// @26C8: iconst_1
		// @26C9: new game.C_100049_vf
		// @26CC: dup
		// @26CD: bipush 53 (0x35)
		// @26CF: sipush 231 (0x00E7)
		// @26D2: iconst_0
		// @26D3: iconst_0
		// @26D4: new game.C_100327_ib
		// @26D7: dup
		// @26D8: getstatic game.C_100153_be[] game.C_100154_sl.field_105331_d
		// @26DB: bipush 13 (0x0D)
		// @26DD: aaload
		// @26DE: bipush 51 (0x33)
		// @26E0: sipush 219 (0x00DB)
		// @26E3: iconst_2
		// @26E4: anewarray game.C_100049_vf
		// @26E7: dup
		// @26E8: iconst_0
		// @26E9: new game.C_100049_vf
		// @26EC: dup
		// @26ED: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @26F0: bipush 97 (0x61)
		// @26F2: aaload
		// @26F3: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @26F6: aastore
		// @26F7: dup
		// @26F8: iconst_1
		// @26F9: new game.C_100049_vf
		// @26FC: dup
		// @26FD: bipush 67 (0x43)
		// @26FF: sipush 243 (0x00F3)
		// @2702: iconst_0
		// @2703: iconst_0
		// @2704: new game.C_100327_ib
		// @2707: dup
		// @2708: getstatic game.C_100153_be[] game.C_100154_sl.field_105331_d
		// @270B: bipush 17 (0x11)
		// @270D: aaload
		// @270E: bipush 71 (0x47)
		// @2710: sipush 245 (0x00F5)
		// @2713: iconst_1
		// @2714: anewarray game.C_100049_vf
		// @2717: dup
		// @2718: iconst_0
		// @2719: new game.C_100049_vf
		// @271C: dup
		// @271D: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @2720: bipush 55 (0x37)
		// @2722: aaload
		// @2723: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @2726: aastore
		// @2727: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @272A: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @272D: aastore
		// @272E: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @2731: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @2734: aastore
		// @2735: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @2738: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @273B: aastore
		// @273C: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @273F: iconst_1
		// @2740: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @2743: aastore
		// @2744: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @2747: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @274A: aastore
		// @274B: dup
		// @274C: iconst_5
		// @274D: new game.C_100049_vf
		// @2750: dup
		// @2751: bipush 69 (0x45)
		// @2753: sipush 138 (0x008A)
		// @2756: iconst_0
		// @2757: iconst_0
		// @2758: new game.C_100327_ib
		// @275B: dup
		// @275C: getstatic game.C_100153_be[] game.C_100154_sl.field_105331_d
		// @275F: bipush 8 (0x08)
		// @2761: aaload
		// @2762: bipush 69 (0x45)
		// @2764: sipush 138 (0x008A)
		// @2767: iconst_5
		// @2768: anewarray game.C_100049_vf
		// @276B: dup
		// @276C: iconst_0
		// @276D: new game.C_100049_vf
		// @2770: dup
		// @2771: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @2774: bipush 96 (0x60)
		// @2776: aaload
		// @2777: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @277A: aastore
		// @277B: dup
		// @277C: iconst_1
		// @277D: new game.C_100049_vf
		// @2780: dup
		// @2781: bipush 83 (0x53)
		// @2783: bipush 85 (0x55)
		// @2785: sipush 16384 (0x4000)
		// @2788: iconst_0
		// @2789: iconst_2
		// @278A: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @278D: aastore
		// @278E: dup
		// @278F: iconst_2
		// @2790: new game.C_100049_vf
		// @2793: dup
		// @2794: bipush 64 (0x40)
		// @2796: bipush 93 (0x5D)
		// @2798: sipush 16384 (0x4000)
		// @279B: iconst_0
		// @279C: bipush 8 (0x08)
		// @279E: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @27A1: aastore
		// @27A2: dup
		// @27A3: iconst_3
		// @27A4: new game.C_100049_vf
		// @27A7: dup
		// @27A8: bipush 64 (0x40)
		// @27AA: bipush 103 (0x67)
		// @27AC: sipush 16384 (0x4000)
		// @27AF: iconst_0
		// @27B0: sipush 2052 (0x0804)
		// @27B3: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @27B6: aastore
		// @27B7: dup
		// @27B8: iconst_4
		// @27B9: new game.C_100049_vf
		// @27BC: dup
		// @27BD: bipush 47 (0x2F)
		// @27BF: bipush 101 (0x65)
		// @27C1: sipush 6553 (0x1999)
		// @27C4: sipush 4096 (0x1000)
		// @27C7: bipush 64 (0x40)
		// @27C9: iconst_1
		// @27CA: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @27CD: aastore
		// @27CE: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @27D1: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @27D4: aastore
		// @27D5: dup
		// @27D6: bipush 6 (0x06)
		// @27D8: new game.C_100049_vf
		// @27DB: dup
		// @27DC: bipush 86 (0x56)
		// @27DE: bipush 103 (0x67)
		// @27E0: sipush 16384 (0x4000)
		// @27E3: iconst_0
		// @27E4: sipush 1024 (0x0400)
		// @27E7: iconst_1
		// @27E8: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @27EB: aastore
		// @27EC: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @27EF: astore_1
		// @27F0: aload_1
		// @27F1: bipush 75 (0x4B)
		// @27F3: putfield int game.C_100327_ib.field_102494_P
		// @27F6: iconst_0
		// @27F7: aload_1
		// @27F8: invokestatic game.C_100226_ae.func_106142_a(boolean, game.C_100327_ib)game.C_100327_ib
		// @27FB: astore_1
		// @27FC: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @27FF: bipush 125 (0x7D)
		// @2801: aload_1
		// @2802: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @2805: new game.C_100327_ib
		// @2808: dup
		// @2809: getstatic game.C_100153_be[] game.C_100092_um.field_104534_a
		// @280C: bipush 7 (0x07)
		// @280E: aaload
		// @280F: iconst_2
		// @2810: sipush 150 (0x0096)
		// @2813: bipush 112 (0x70)
		// @2815: sipush -16384 (0xC000)
		// @2818: sipush 4096 (0x1000)
		// @281B: iconst_3
		// @281C: anewarray game.C_100049_vf
		// @281F: dup
		// @2820: iconst_0
		// @2821: new game.C_100049_vf
		// @2824: dup
		// @2825: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @2828: bipush 86 (0x56)
		// @282A: aaload
		// @282B: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @282E: aastore
		// @282F: dup
		// @2830: iconst_1
		// @2831: new game.C_100049_vf
		// @2834: dup
		// @2835: sipush 300 (0x012C)
		// @2838: iconst_1
		// @2839: sipush 400 (0x0190)
		// @283C: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @283F: aastore
		// @2840: dup
		// @2841: iconst_2
		// @2842: new game.C_100049_vf
		// @2845: dup
		// @2846: sipush -300 (0xFED4)
		// @2849: sipush -300 (0xFED4)
		// @284C: invokespecial game.C_100049_vf.<init>(int, int)void
		// @284F: aastore
		// @2850: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @2853: astore_1
		// @2854: aload_1
		// @2855: bipush 82 (0x52)
		// @2857: putfield int game.C_100327_ib.field_102494_P
		// @285A: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @285D: bipush 126 (0x7E)
		// @285F: aload_1
		// @2860: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @2863: new game.C_100327_ib
		// @2866: dup
		// @2867: getstatic game.C_100153_be[] game.C_100092_um.field_104534_a
		// @286A: bipush 6 (0x06)
		// @286C: aaload
		// @286D: sipush 2048 (0x0800)
		// @2870: bipush 100 (0x64)
		// @2872: bipush 122 (0x7A)
		// @2874: sipush -16384 (0xC000)
		// @2877: sipush 4096 (0x1000)
		// @287A: bipush 9 (0x09)
		// @287C: anewarray game.C_100049_vf
		// @287F: dup
		// @2880: iconst_0
		// @2881: new game.C_100049_vf
		// @2884: dup
		// @2885: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @2888: bipush 51 (0x33)
		// @288A: aaload
		// @288B: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @288E: aastore
		// @288F: dup
		// @2890: iconst_1
		// @2891: new game.C_100049_vf
		// @2894: dup
		// @2895: sipush 300 (0x012C)
		// @2898: iconst_0
		// @2899: sipush 350 (0x015E)
		// @289C: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @289F: aastore
		// @28A0: dup
		// @28A1: iconst_2
		// @28A2: new game.C_100049_vf
		// @28A5: dup
		// @28A6: sipush 143 (0x008F)
		// @28A9: bipush 111 (0x6F)
		// @28AB: sipush 16384 (0x4000)
		// @28AE: iconst_0
		// @28AF: sipush 128 (0x0080)
		// @28B2: iconst_1
		// @28B3: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @28B6: aastore
		// @28B7: dup
		// @28B8: iconst_3
		// @28B9: new game.C_100049_vf
		// @28BC: dup
		// @28BD: sipush 151 (0x0097)
		// @28C0: bipush 121 (0x79)
		// @28C2: sipush 16384 (0x4000)
		// @28C5: iconst_0
		// @28C6: sipush 128 (0x0080)
		// @28C9: iconst_1
		// @28CA: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @28CD: aastore
		// @28CE: dup
		// @28CF: iconst_4
		// @28D0: new game.C_100049_vf
		// @28D3: dup
		// @28D4: sipush 156 (0x009C)
		// @28D7: sipush 131 (0x0083)
		// @28DA: sipush 16384 (0x4000)
		// @28DD: iconst_0
		// @28DE: sipush 128 (0x0080)
		// @28E1: iconst_1
		// @28E2: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @28E5: aastore
		// @28E6: dup
		// @28E7: iconst_5
		// @28E8: new game.C_100049_vf
		// @28EB: dup
		// @28EC: sipush 156 (0x009C)
		// @28EF: sipush 141 (0x008D)
		// @28F2: sipush 16384 (0x4000)
		// @28F5: iconst_0
		// @28F6: sipush 128 (0x0080)
		// @28F9: iconst_1
		// @28FA: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @28FD: aastore
		// @28FE: dup
		// @28FF: bipush 6 (0x06)
		// @2901: new game.C_100049_vf
		// @2904: dup
		// @2905: sipush 156 (0x009C)
		// @2908: sipush 151 (0x0097)
		// @290B: sipush 16384 (0x4000)
		// @290E: iconst_0
		// @290F: sipush 128 (0x0080)
		// @2912: iconst_1
		// @2913: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @2916: aastore
		// @2917: dup
		// @2918: bipush 7 (0x07)
		// @291A: new game.C_100049_vf
		// @291D: dup
		// @291E: sipush 156 (0x009C)
		// @2921: sipush 161 (0x00A1)
		// @2924: sipush 16384 (0x4000)
		// @2927: iconst_0
		// @2928: sipush 128 (0x0080)
		// @292B: iconst_1
		// @292C: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @292F: aastore
		// @2930: dup
		// @2931: bipush 8 (0x08)
		// @2933: new game.C_100049_vf
		// @2936: dup
		// @2937: sipush 156 (0x009C)
		// @293A: sipush 171 (0x00AB)
		// @293D: sipush 16384 (0x4000)
		// @2940: iconst_0
		// @2941: sipush 128 (0x0080)
		// @2944: iconst_1
		// @2945: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @2948: aastore
		// @2949: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @294C: astore_1
		// @294D: aload_1
		// @294E: bipush 80 (0x50)
		// @2950: putfield int game.C_100327_ib.field_102494_P
		// @2953: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @2956: bipush 125 (0x7D)
		// @2958: aload_1
		// @2959: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @295C: new game.C_100327_ib
		// @295F: dup
		// @2960: getstatic game.C_100153_be[] game.C_100092_um.field_104534_a
		// @2963: bipush 11 (0x0B)
		// @2965: aaload
		// @2966: sipush 1024 (0x0400)
		// @2969: bipush 108 (0x6C)
		// @296B: sipush 153 (0x0099)
		// @296E: sipush -16384 (0xC000)
		// @2971: sipush 4096 (0x1000)
		// @2974: iconst_3
		// @2975: anewarray game.C_100049_vf
		// @2978: dup
		// @2979: iconst_0
		// @297A: new game.C_100049_vf
		// @297D: dup
		// @297E: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @2981: bipush 89 (0x59)
		// @2983: aaload
		// @2984: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @2987: aastore
		// @2988: dup
		// @2989: iconst_1
		// @298A: new game.C_100049_vf
		// @298D: dup
		// @298E: bipush 108 (0x6C)
		// @2990: sipush 153 (0x0099)
		// @2993: iconst_0
		// @2994: sipush 4096 (0x1000)
		// @2997: new game.C_100327_ib
		// @299A: dup
		// @299B: getstatic game.C_100153_be[] game.C_100092_um.field_104534_a
		// @299E: bipush 8 (0x08)
		// @29A0: aaload
		// @29A1: bipush 113 (0x71)
		// @29A3: sipush 162 (0x00A2)
		// @29A6: iconst_1
		// @29A7: anewarray game.C_100049_vf
		// @29AA: dup
		// @29AB: iconst_0
		// @29AC: new game.C_100049_vf
		// @29AF: dup
		// @29B0: sipush 144 (0x0090)
		// @29B3: sipush 180 (0x00B4)
		// @29B6: sipush 16384 (0x4000)
		// @29B9: iconst_0
		// @29BA: bipush 32 (0x20)
		// @29BC: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @29BF: aastore
		// @29C0: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @29C3: iconst_1
		// @29C4: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @29C7: aastore
		// @29C8: dup
		// @29C9: iconst_2
		// @29CA: new game.C_100049_vf
		// @29CD: dup
		// @29CE: sipush 145 (0x0091)
		// @29D1: bipush 115 (0x73)
		// @29D3: sipush 13384 (0x3448)
		// @29D6: iconst_0
		// @29D7: sipush 256 (0x0100)
		// @29DA: iconst_1
		// @29DB: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @29DE: aastore
		// @29DF: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @29E2: astore_1
		// @29E3: aload_1
		// @29E4: bipush 103 (0x67)
		// @29E6: putfield int game.C_100327_ib.field_102494_P
		// @29E9: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @29EC: bipush 127 (0x7F)
		// @29EE: aload_1
		// @29EF: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @29F2: new game.C_100327_ib
		// @29F5: dup
		// @29F6: getstatic game.C_100153_be[] game.C_100092_um.field_104534_a
		// @29F9: bipush 10 (0x0A)
		// @29FB: aaload
		// @29FC: bipush 8 (0x08)
		// @29FE: bipush 113 (0x71)
		// @2A00: bipush 113 (0x71)
		// @2A02: sipush -16384 (0xC000)
		// @2A05: sipush 8192 (0x2000)
		// @2A08: iconst_5
		// @2A09: anewarray game.C_100049_vf
		// @2A0C: dup
		// @2A0D: iconst_0
		// @2A0E: new game.C_100049_vf
		// @2A11: dup
		// @2A12: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @2A15: bipush 73 (0x49)
		// @2A17: aaload
		// @2A18: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @2A1B: aastore
		// @2A1C: dup
		// @2A1D: iconst_1
		// @2A1E: new game.C_100049_vf
		// @2A21: dup
		// @2A22: sipush 200 (0x00C8)
		// @2A25: iconst_0
		// @2A26: sipush 550 (0x0226)
		// @2A29: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @2A2C: aastore
		// @2A2D: dup
		// @2A2E: iconst_2
		// @2A2F: new game.C_100049_vf
		// @2A32: dup
		// @2A33: sipush 142 (0x008E)
		// @2A36: bipush 58 (0x3A)
		// @2A38: sipush 16384 (0x4000)
		// @2A3B: iconst_0
		// @2A3C: sipush 256 (0x0100)
		// @2A3F: iconst_1
		// @2A40: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @2A43: aastore
		// @2A44: dup
		// @2A45: iconst_3
		// @2A46: new game.C_100049_vf
		// @2A49: dup
		// @2A4A: sipush 142 (0x008E)
		// @2A4D: bipush 71 (0x47)
		// @2A4F: sipush 16384 (0x4000)
		// @2A52: iconst_0
		// @2A53: sipush 256 (0x0100)
		// @2A56: iconst_1
		// @2A57: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @2A5A: aastore
		// @2A5B: dup
		// @2A5C: iconst_4
		// @2A5D: new game.C_100049_vf
		// @2A60: dup
		// @2A61: sipush 142 (0x008E)
		// @2A64: bipush 84 (0x54)
		// @2A66: sipush 16384 (0x4000)
		// @2A69: iconst_0
		// @2A6A: sipush 256 (0x0100)
		// @2A6D: iconst_1
		// @2A6E: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @2A71: aastore
		// @2A72: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @2A75: astore_1
		// @2A76: aload_1
		// @2A77: bipush 81 (0x51)
		// @2A79: putfield int game.C_100327_ib.field_102494_P
		// @2A7C: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @2A7F: bipush 123 (0x7B)
		// @2A81: aload_1
		// @2A82: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @2A85: new game.C_100327_ib
		// @2A88: dup
		// @2A89: getstatic game.C_100153_be[] game.C_100092_um.field_104534_a
		// @2A8C: iconst_5
		// @2A8D: aaload
		// @2A8E: iconst_1
		// @2A8F: sipush 128 (0x0080)
		// @2A92: sipush 258 (0x0102)
		// @2A95: iconst_0
		// @2A96: iconst_0
		// @2A97: bipush 10 (0x0A)
		// @2A99: anewarray game.C_100049_vf
		// @2A9C: dup
		// @2A9D: iconst_0
		// @2A9E: new game.C_100049_vf
		// @2AA1: dup
		// @2AA2: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @2AA5: bipush 95 (0x5F)
		// @2AA7: aaload
		// @2AA8: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @2AAB: aastore
		// @2AAC: dup
		// @2AAD: iconst_1
		// @2AAE: new game.C_100049_vf
		// @2AB1: dup
		// @2AB2: sipush 800 (0x0320)
		// @2AB5: iconst_3
		// @2AB6: sipush 1650 (0x0672)
		// @2AB9: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @2ABC: aastore
		// @2ABD: dup
		// @2ABE: iconst_2
		// @2ABF: new game.C_100049_vf
		// @2AC2: dup
		// @2AC3: bipush 64 (0x40)
		// @2AC5: invokespecial game.C_100049_vf.<init>(int)void
		// @2AC8: aastore
		// @2AC9: dup
		// @2ACA: iconst_3
		// @2ACB: new game.C_100049_vf
		// @2ACE: dup
		// @2ACF: sipush -500 (0xFE0C)
		// @2AD2: bipush 50 (0x32)
		// @2AD4: invokespecial game.C_100049_vf.<init>(int, int)void
		// @2AD7: aastore
		// @2AD8: dup
		// @2AD9: iconst_4
		// @2ADA: new game.C_100049_vf
		// @2ADD: dup
		// @2ADE: sipush 128 (0x0080)
		// @2AE1: sipush 221 (0x00DD)
		// @2AE4: iconst_0
		// @2AE5: iconst_0
		// @2AE6: new game.C_100327_ib
		// @2AE9: dup
		// @2AEA: getstatic game.C_100153_be[] game.C_100092_um.field_104534_a
		// @2AED: iconst_0
		// @2AEE: aaload
		// @2AEF: sipush 128 (0x0080)
		// @2AF2: sipush 221 (0x00DD)
		// @2AF5: iconst_1
		// @2AF6: anewarray game.C_100049_vf
		// @2AF9: dup
		// @2AFA: iconst_0
		// @2AFB: new game.C_100049_vf
		// @2AFE: dup
		// @2AFF: ldc "A"
		// @2B01: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @2B04: aastore
		// @2B05: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @2B08: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @2B0B: aastore
		// @2B0C: dup
		// @2B0D: iconst_5
		// @2B0E: new game.C_100049_vf
		// @2B11: dup
		// @2B12: bipush 113 (0x71)
		// @2B14: bipush 113 (0x71)
		// @2B16: sipush 16384 (0x4000)
		// @2B19: iconst_0
		// @2B1A: bipush 8 (0x08)
		// @2B1C: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @2B1F: aastore
		// @2B20: dup
		// @2B21: bipush 6 (0x06)
		// @2B23: new game.C_100049_vf
		// @2B26: dup
		// @2B27: bipush 100 (0x64)
		// @2B29: bipush 122 (0x7A)
		// @2B2B: sipush 16384 (0x4000)
		// @2B2E: iconst_0
		// @2B2F: sipush 2052 (0x0804)
		// @2B32: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @2B35: aastore
		// @2B36: dup
		// @2B37: bipush 7 (0x07)
		// @2B39: new game.C_100049_vf
		// @2B3C: dup
		// @2B3D: bipush 100 (0x64)
		// @2B3F: bipush 90 (0x5A)
		// @2B41: sipush 16384 (0x4000)
		// @2B44: iconst_0
		// @2B45: sipush 1024 (0x0400)
		// @2B48: iconst_1
		// @2B49: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @2B4C: aastore
		// @2B4D: dup
		// @2B4E: bipush 8 (0x08)
		// @2B50: new game.C_100049_vf
		// @2B53: dup
		// @2B54: sipush 150 (0x0096)
		// @2B57: bipush 112 (0x70)
		// @2B59: sipush 16384 (0x4000)
		// @2B5C: iconst_0
		// @2B5D: iconst_2
		// @2B5E: iconst_1
		// @2B5F: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @2B62: aastore
		// @2B63: dup
		// @2B64: bipush 9 (0x09)
		// @2B66: new game.C_100049_vf
		// @2B69: dup
		// @2B6A: sipush 167 (0x00A7)
		// @2B6D: sipush 191 (0x00BF)
		// @2B70: sipush 13384 (0x3448)
		// @2B73: sipush 4096 (0x1000)
		// @2B76: bipush 64 (0x40)
		// @2B78: iconst_1
		// @2B79: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @2B7C: aastore
		// @2B7D: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @2B80: astore_1
		// @2B81: aload_1
		// @2B82: bipush 79 (0x4F)
		// @2B84: putfield int game.C_100327_ib.field_102494_P
		// @2B87: iload_0
		// @2B88: aload_1
		// @2B89: invokestatic game.C_100226_ae.func_106142_a(boolean, game.C_100327_ib)game.C_100327_ib
		// @2B8C: astore_1
		// @2B8D: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @2B90: bipush 125 (0x7D)
		// @2B92: aload_1
		// @2B93: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @2B96: new game.C_100327_ib
		// @2B99: dup
		// @2B9A: getstatic game.C_100153_be[] game.C_100006_fj.field_103620_b
		// @2B9D: bipush 8 (0x08)
		// @2B9F: aaload
		// @2BA0: iconst_2
		// @2BA1: sipush 154 (0x009A)
		// @2BA4: bipush 97 (0x61)
		// @2BA6: sipush -16384 (0xC000)
		// @2BA9: sipush 8192 (0x2000)
		// @2BAC: iconst_2
		// @2BAD: anewarray game.C_100049_vf
		// @2BB0: dup
		// @2BB1: iconst_0
		// @2BB2: new game.C_100049_vf
		// @2BB5: dup
		// @2BB6: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @2BB9: bipush 90 (0x5A)
		// @2BBB: aaload
		// @2BBC: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @2BBF: aastore
		// @2BC0: dup
		// @2BC1: iconst_1
		// @2BC2: new game.C_100049_vf
		// @2BC5: dup
		// @2BC6: sipush 150 (0x0096)
		// @2BC9: iconst_3
		// @2BCA: sipush 825 (0x0339)
		// @2BCD: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @2BD0: aastore
		// @2BD1: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @2BD4: astore_1
		// @2BD5: aload_1
		// @2BD6: bipush 87 (0x57)
		// @2BD8: putfield int game.C_100327_ib.field_102494_P
		// @2BDB: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @2BDE: bipush 127 (0x7F)
		// @2BE0: aload_1
		// @2BE1: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @2BE4: new game.C_100327_ib
		// @2BE7: dup
		// @2BE8: getstatic game.C_100153_be[] game.C_100006_fj.field_103620_b
		// @2BEB: bipush 11 (0x0B)
		// @2BED: aaload
		// @2BEE: iconst_4
		// @2BEF: bipush 125 (0x7D)
		// @2BF1: bipush 100 (0x64)
		// @2BF3: sipush -16384 (0xC000)
		// @2BF6: sipush 4096 (0x1000)
		// @2BF9: iconst_3
		// @2BFA: anewarray game.C_100049_vf
		// @2BFD: dup
		// @2BFE: iconst_0
		// @2BFF: new game.C_100049_vf
		// @2C02: dup
		// @2C03: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @2C06: bipush 49 (0x31)
		// @2C08: aaload
		// @2C09: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @2C0C: aastore
		// @2C0D: dup
		// @2C0E: iconst_1
		// @2C0F: new game.C_100049_vf
		// @2C12: dup
		// @2C13: sipush 150 (0x0096)
		// @2C16: iconst_0
		// @2C17: sipush 575 (0x023F)
		// @2C1A: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @2C1D: aastore
		// @2C1E: dup
		// @2C1F: iconst_2
		// @2C20: new game.C_100049_vf
		// @2C23: dup
		// @2C24: bipush 116 (0x74)
		// @2C26: sipush 140 (0x008C)
		// @2C29: sipush 24576 (0x6000)
		// @2C2C: sipush 4096 (0x1000)
		// @2C2F: bipush 64 (0x40)
		// @2C31: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @2C34: aastore
		// @2C35: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @2C38: astore_1
		// @2C39: aload_1
		// @2C3A: bipush 85 (0x55)
		// @2C3C: putfield int game.C_100327_ib.field_102494_P
		// @2C3F: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @2C42: bipush 126 (0x7E)
		// @2C44: aload_1
		// @2C45: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @2C48: new game.C_100327_ib
		// @2C4B: dup
		// @2C4C: getstatic game.C_100153_be[] game.C_100006_fj.field_103620_b
		// @2C4F: iconst_1
		// @2C50: aaload
		// @2C51: sipush 1024 (0x0400)
		// @2C54: sipush 150 (0x0096)
		// @2C57: bipush 100 (0x64)
		// @2C59: sipush -16384 (0xC000)
		// @2C5C: sipush 4096 (0x1000)
		// @2C5F: iconst_2
		// @2C60: anewarray game.C_100049_vf
		// @2C63: dup
		// @2C64: iconst_0
		// @2C65: new game.C_100049_vf
		// @2C68: dup
		// @2C69: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @2C6C: bipush 78 (0x4E)
		// @2C6E: aaload
		// @2C6F: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @2C72: aastore
		// @2C73: dup
		// @2C74: iconst_1
		// @2C75: new game.C_100049_vf
		// @2C78: dup
		// @2C79: bipush 116 (0x74)
		// @2C7B: sipush 140 (0x008C)
		// @2C7E: sipush -4096 (0xF000)
		// @2C81: sipush 2048 (0x0800)
		// @2C84: new game.C_100327_ib
		// @2C87: dup
		// @2C88: getstatic game.C_100153_be[] game.C_100006_fj.field_103620_b
		// @2C8B: iconst_0
		// @2C8C: aaload
		// @2C8D: bipush 116 (0x74)
		// @2C8F: sipush 140 (0x008C)
		// @2C92: iconst_1
		// @2C93: anewarray game.C_100049_vf
		// @2C96: dup
		// @2C97: iconst_0
		// @2C98: new game.C_100049_vf
		// @2C9B: dup
		// @2C9C: sipush 171 (0x00AB)
		// @2C9F: sipush 160 (0x00A0)
		// @2CA2: sipush 20480 (0x5000)
		// @2CA5: iconst_0
		// @2CA6: bipush 32 (0x20)
		// @2CA8: iconst_1
		// @2CA9: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @2CAC: aastore
		// @2CAD: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @2CB0: iconst_1
		// @2CB1: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @2CB4: aastore
		// @2CB5: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @2CB8: astore_1
		// @2CB9: aload_1
		// @2CBA: bipush 104 (0x68)
		// @2CBC: putfield int game.C_100327_ib.field_102494_P
		// @2CBF: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @2CC2: bipush 123 (0x7B)
		// @2CC4: aload_1
		// @2CC5: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @2CC8: new game.C_100327_ib
		// @2CCB: dup
		// @2CCC: getstatic game.C_100153_be[] game.C_100006_fj.field_103620_b
		// @2CCF: bipush 10 (0x0A)
		// @2CD1: aaload
		// @2CD2: bipush 8 (0x08)
		// @2CD4: bipush 125 (0x7D)
		// @2CD6: bipush 91 (0x5B)
		// @2CD8: sipush -16384 (0xC000)
		// @2CDB: sipush 8192 (0x2000)
		// @2CDE: iconst_3
		// @2CDF: anewarray game.C_100049_vf
		// @2CE2: dup
		// @2CE3: iconst_0
		// @2CE4: new game.C_100049_vf
		// @2CE7: dup
		// @2CE8: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @2CEB: bipush 30 (0x1E)
		// @2CED: aaload
		// @2CEE: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @2CF1: aastore
		// @2CF2: dup
		// @2CF3: iconst_1
		// @2CF4: new game.C_100049_vf
		// @2CF7: dup
		// @2CF8: bipush 50 (0x32)
		// @2CFA: iconst_0
		// @2CFB: sipush 625 (0x0271)
		// @2CFE: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @2D01: aastore
		// @2D02: dup
		// @2D03: iconst_2
		// @2D04: new game.C_100049_vf
		// @2D07: dup
		// @2D08: sipush 600 (0x0258)
		// @2D0B: iconst_0
		// @2D0C: invokespecial game.C_100049_vf.<init>(int, int)void
		// @2D0F: aastore
		// @2D10: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @2D13: astore_1
		// @2D14: aload_1
		// @2D15: bipush 86 (0x56)
		// @2D17: putfield int game.C_100327_ib.field_102494_P
		// @2D1A: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @2D1D: bipush 127 (0x7F)
		// @2D1F: aload_1
		// @2D20: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @2D23: new game.C_100327_ib
		// @2D26: dup
		// @2D27: getstatic game.C_100153_be[] game.C_100006_fj.field_103620_b
		// @2D2A: bipush 9 (0x09)
		// @2D2C: aaload
		// @2D2D: iconst_1
		// @2D2E: sipush 146 (0x0092)
		// @2D31: sipush 257 (0x0101)
		// @2D34: iconst_0
		// @2D35: sipush 4096 (0x1000)
		// @2D38: bipush 16 (0x10)
		// @2D3A: anewarray game.C_100049_vf
		// @2D3D: dup
		// @2D3E: iconst_0
		// @2D3F: new game.C_100049_vf
		// @2D42: dup
		// @2D43: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @2D46: bipush 62 (0x3E)
		// @2D48: aaload
		// @2D49: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @2D4C: aastore
		// @2D4D: dup
		// @2D4E: iconst_1
		// @2D4F: new game.C_100049_vf
		// @2D52: dup
		// @2D53: sipush 300 (0x012C)
		// @2D56: iconst_4
		// @2D57: sipush 2150 (0x0866)
		// @2D5A: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @2D5D: aastore
		// @2D5E: dup
		// @2D5F: iconst_2
		// @2D60: new game.C_100049_vf
		// @2D63: dup
		// @2D64: bipush 16 (0x10)
		// @2D66: invokespecial game.C_100049_vf.<init>(int)void
		// @2D69: aastore
		// @2D6A: dup
		// @2D6B: iconst_3
		// @2D6C: new game.C_100049_vf
		// @2D6F: dup
		// @2D70: sipush 250 (0x00FA)
		// @2D73: iconst_0
		// @2D74: invokespecial game.C_100049_vf.<init>(int, int)void
		// @2D77: aastore
		// @2D78: dup
		// @2D79: iconst_4
		// @2D7A: new game.C_100049_vf
		// @2D7D: dup
		// @2D7E: sipush 150 (0x0096)
		// @2D81: bipush 100 (0x64)
		// @2D83: sipush 16384 (0x4000)
		// @2D86: iconst_0
		// @2D87: sipush 1024 (0x0400)
		// @2D8A: iconst_1
		// @2D8B: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @2D8E: aastore
		// @2D8F: dup
		// @2D90: iconst_5
		// @2D91: new game.C_100049_vf
		// @2D94: dup
		// @2D95: sipush 156 (0x009C)
		// @2D98: bipush 94 (0x5E)
		// @2D9A: iconst_0
		// @2D9B: iconst_0
		// @2D9C: new game.C_100327_ib
		// @2D9F: dup
		// @2DA0: getstatic game.C_100153_be[] game.C_100006_fj.field_103620_b
		// @2DA3: bipush 7 (0x07)
		// @2DA5: aaload
		// @2DA6: sipush 156 (0x009C)
		// @2DA9: bipush 94 (0x5E)
		// @2DAB: iconst_1
		// @2DAC: anewarray game.C_100049_vf
		// @2DAF: dup
		// @2DB0: iconst_0
		// @2DB1: new game.C_100049_vf
		// @2DB4: dup
		// @2DB5: sipush 154 (0x009A)
		// @2DB8: bipush 97 (0x61)
		// @2DBA: sipush 16384 (0x4000)
		// @2DBD: iconst_0
		// @2DBE: iconst_2
		// @2DBF: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @2DC2: aastore
		// @2DC3: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @2DC6: iconst_1
		// @2DC7: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @2DCA: aastore
		// @2DCB: dup
		// @2DCC: bipush 6 (0x06)
		// @2DCE: new game.C_100049_vf
		// @2DD1: dup
		// @2DD2: sipush 186 (0x00BA)
		// @2DD5: bipush 121 (0x79)
		// @2DD7: sipush 16384 (0x4000)
		// @2DDA: sipush 4096 (0x1000)
		// @2DDD: bipush 32 (0x20)
		// @2DDF: iconst_1
		// @2DE0: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @2DE3: aastore
		// @2DE4: dup
		// @2DE5: bipush 7 (0x07)
		// @2DE7: new game.C_100049_vf
		// @2DEA: dup
		// @2DEB: sipush 170 (0x00AA)
		// @2DEE: bipush 105 (0x69)
		// @2DF0: sipush 16384 (0x4000)
		// @2DF3: iconst_0
		// @2DF4: sipush 128 (0x0080)
		// @2DF7: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @2DFA: aastore
		// @2DFB: dup
		// @2DFC: bipush 8 (0x08)
		// @2DFE: new game.C_100049_vf
		// @2E01: dup
		// @2E02: sipush 168 (0x00A8)
		// @2E05: bipush 112 (0x70)
		// @2E07: sipush 16384 (0x4000)
		// @2E0A: iconst_0
		// @2E0B: sipush 128 (0x0080)
		// @2E0E: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @2E11: aastore
		// @2E12: dup
		// @2E13: bipush 9 (0x09)
		// @2E15: new game.C_100049_vf
		// @2E18: dup
		// @2E19: sipush 166 (0x00A6)
		// @2E1C: bipush 119 (0x77)
		// @2E1E: sipush 16384 (0x4000)
		// @2E21: iconst_0
		// @2E22: sipush 128 (0x0080)
		// @2E25: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @2E28: aastore
		// @2E29: dup
		// @2E2A: bipush 10 (0x0A)
		// @2E2C: new game.C_100049_vf
		// @2E2F: dup
		// @2E30: sipush 128 (0x0080)
		// @2E33: sipush 128 (0x0080)
		// @2E36: iconst_0
		// @2E37: iconst_0
		// @2E38: new game.C_100327_ib
		// @2E3B: dup
		// @2E3C: getstatic game.C_100153_be[] game.C_100006_fj.field_103620_b
		// @2E3F: bipush 13 (0x0D)
		// @2E41: aaload
		// @2E42: sipush 128 (0x0080)
		// @2E45: sipush 128 (0x0080)
		// @2E48: iconst_0
		// @2E49: anewarray game.C_100049_vf
		// @2E4C: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @2E4F: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @2E52: aastore
		// @2E53: dup
		// @2E54: bipush 11 (0x0B)
		// @2E56: new game.C_100049_vf
		// @2E59: dup
		// @2E5A: bipush 125 (0x7D)
		// @2E5C: bipush 90 (0x5A)
		// @2E5E: sipush 16384 (0x4000)
		// @2E61: iconst_0
		// @2E62: bipush 8 (0x08)
		// @2E64: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @2E67: aastore
		// @2E68: dup
		// @2E69: bipush 12 (0x0C)
		// @2E6B: new game.C_100049_vf
		// @2E6E: dup
		// @2E6F: bipush 125 (0x7D)
		// @2E71: bipush 100 (0x64)
		// @2E73: sipush 16384 (0x4000)
		// @2E76: iconst_0
		// @2E77: iconst_4
		// @2E78: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @2E7B: aastore
		// @2E7C: dup
		// @2E7D: bipush 13 (0x0D)
		// @2E7F: new game.C_100049_vf
		// @2E82: dup
		// @2E83: bipush 105 (0x69)
		// @2E85: bipush 106 (0x6A)
		// @2E87: sipush 6553 (0x1999)
		// @2E8A: iconst_0
		// @2E8B: new game.C_100327_ib
		// @2E8E: dup
		// @2E8F: getstatic game.C_100153_be[] game.C_100006_fj.field_103620_b
		// @2E92: iconst_3
		// @2E93: aaload
		// @2E94: bipush 115 (0x73)
		// @2E96: bipush 116 (0x74)
		// @2E98: iconst_2
		// @2E99: anewarray game.C_100049_vf
		// @2E9C: dup
		// @2E9D: iconst_0
		// @2E9E: new game.C_100049_vf
		// @2EA1: dup
		// @2EA2: ldc "A"
		// @2EA4: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @2EA7: aastore
		// @2EA8: dup
		// @2EA9: iconst_1
		// @2EAA: new game.C_100049_vf
		// @2EAD: dup
		// @2EAE: bipush 113 (0x71)
		// @2EB0: sipush 155 (0x009B)
		// @2EB3: sipush -4096 (0xF000)
		// @2EB6: iconst_0
		// @2EB7: new game.C_100327_ib
		// @2EBA: dup
		// @2EBB: getstatic game.C_100153_be[] game.C_100006_fj.field_103620_b
		// @2EBE: iconst_4
		// @2EBF: aaload
		// @2EC0: bipush 113 (0x71)
		// @2EC2: sipush 155 (0x009B)
		// @2EC5: iconst_2
		// @2EC6: anewarray game.C_100049_vf
		// @2EC9: dup
		// @2ECA: iconst_0
		// @2ECB: new game.C_100049_vf
		// @2ECE: dup
		// @2ECF: ldc "B"
		// @2ED1: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @2ED4: aastore
		// @2ED5: dup
		// @2ED6: iconst_1
		// @2ED7: new game.C_100049_vf
		// @2EDA: dup
		// @2EDB: sipush 131 (0x0083)
		// @2EDE: sipush 200 (0x00C8)
		// @2EE1: sipush -4096 (0xF000)
		// @2EE4: iconst_0
		// @2EE5: new game.C_100327_ib
		// @2EE8: dup
		// @2EE9: getstatic game.C_100153_be[] game.C_100006_fj.field_103620_b
		// @2EEC: iconst_5
		// @2EED: aaload
		// @2EEE: sipush 131 (0x0083)
		// @2EF1: sipush 203 (0x00CB)
		// @2EF4: iconst_1
		// @2EF5: anewarray game.C_100049_vf
		// @2EF8: dup
		// @2EF9: iconst_0
		// @2EFA: new game.C_100049_vf
		// @2EFD: dup
		// @2EFE: ldc "C"
		// @2F00: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @2F03: aastore
		// @2F04: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @2F07: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @2F0A: aastore
		// @2F0B: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @2F0E: iconst_1
		// @2F0F: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @2F12: aastore
		// @2F13: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @2F16: iconst_1
		// @2F17: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @2F1A: aastore
		// @2F1B: dup
		// @2F1C: bipush 14 (0x0E)
		// @2F1E: new game.C_100049_vf
		// @2F21: dup
		// @2F22: bipush 120 (0x78)
		// @2F24: bipush 116 (0x74)
		// @2F26: sipush 4096 (0x1000)
		// @2F29: iconst_0
		// @2F2A: new game.C_100327_ib
		// @2F2D: dup
		// @2F2E: getstatic game.C_100153_be[] game.C_100006_fj.field_103620_b
		// @2F31: iconst_3
		// @2F32: aaload
		// @2F33: bipush 115 (0x73)
		// @2F35: bipush 116 (0x74)
		// @2F37: iconst_2
		// @2F38: anewarray game.C_100049_vf
		// @2F3B: dup
		// @2F3C: iconst_0
		// @2F3D: new game.C_100049_vf
		// @2F40: dup
		// @2F41: ldc "D"
		// @2F43: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @2F46: aastore
		// @2F47: dup
		// @2F48: iconst_1
		// @2F49: new game.C_100049_vf
		// @2F4C: dup
		// @2F4D: bipush 113 (0x71)
		// @2F4F: sipush 155 (0x009B)
		// @2F52: sipush -4096 (0xF000)
		// @2F55: iconst_0
		// @2F56: new game.C_100327_ib
		// @2F59: dup
		// @2F5A: getstatic game.C_100153_be[] game.C_100006_fj.field_103620_b
		// @2F5D: iconst_4
		// @2F5E: aaload
		// @2F5F: bipush 113 (0x71)
		// @2F61: sipush 155 (0x009B)
		// @2F64: iconst_2
		// @2F65: anewarray game.C_100049_vf
		// @2F68: dup
		// @2F69: iconst_0
		// @2F6A: new game.C_100049_vf
		// @2F6D: dup
		// @2F6E: ldc "E"
		// @2F70: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @2F73: aastore
		// @2F74: dup
		// @2F75: iconst_1
		// @2F76: new game.C_100049_vf
		// @2F79: dup
		// @2F7A: sipush 131 (0x0083)
		// @2F7D: sipush 200 (0x00C8)
		// @2F80: sipush -4096 (0xF000)
		// @2F83: iconst_0
		// @2F84: new game.C_100327_ib
		// @2F87: dup
		// @2F88: getstatic game.C_100153_be[] game.C_100006_fj.field_103620_b
		// @2F8B: iconst_5
		// @2F8C: aaload
		// @2F8D: sipush 131 (0x0083)
		// @2F90: sipush 203 (0x00CB)
		// @2F93: iconst_1
		// @2F94: anewarray game.C_100049_vf
		// @2F97: dup
		// @2F98: iconst_0
		// @2F99: new game.C_100049_vf
		// @2F9C: dup
		// @2F9D: ldc "F"
		// @2F9F: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @2FA2: aastore
		// @2FA3: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @2FA6: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @2FA9: aastore
		// @2FAA: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @2FAD: iconst_1
		// @2FAE: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @2FB1: aastore
		// @2FB2: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @2FB5: iconst_1
		// @2FB6: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @2FB9: aastore
		// @2FBA: dup
		// @2FBB: bipush 15 (0x0F)
		// @2FBD: new game.C_100049_vf
		// @2FC0: dup
		// @2FC1: sipush 135 (0x0087)
		// @2FC4: bipush 126 (0x7E)
		// @2FC6: sipush 3276 (0x0CCC)
		// @2FC9: sipush 2048 (0x0800)
		// @2FCC: new game.C_100327_ib
		// @2FCF: dup
		// @2FD0: getstatic game.C_100153_be[] game.C_100006_fj.field_103620_b
		// @2FD3: iconst_3
		// @2FD4: aaload
		// @2FD5: bipush 115 (0x73)
		// @2FD7: bipush 116 (0x74)
		// @2FD9: iconst_1
		// @2FDA: anewarray game.C_100049_vf
		// @2FDD: dup
		// @2FDE: iconst_0
		// @2FDF: new game.C_100049_vf
		// @2FE2: dup
		// @2FE3: bipush 113 (0x71)
		// @2FE5: sipush 155 (0x009B)
		// @2FE8: sipush -5461 (0xEAAB)
		// @2FEB: sipush 2048 (0x0800)
		// @2FEE: new game.C_100327_ib
		// @2FF1: dup
		// @2FF2: getstatic game.C_100153_be[] game.C_100006_fj.field_103620_b
		// @2FF5: iconst_4
		// @2FF6: aaload
		// @2FF7: bipush 113 (0x71)
		// @2FF9: sipush 155 (0x009B)
		// @2FFC: iconst_1
		// @2FFD: anewarray game.C_100049_vf
		// @3000: dup
		// @3001: iconst_0
		// @3002: new game.C_100049_vf
		// @3005: dup
		// @3006: sipush 131 (0x0083)
		// @3009: sipush 200 (0x00C8)
		// @300C: sipush 10923 (0x2AAB)
		// @300F: sipush 2048 (0x0800)
		// @3012: new game.C_100327_ib
		// @3015: dup
		// @3016: getstatic game.C_100153_be[] game.C_100006_fj.field_103620_b
		// @3019: bipush 6 (0x06)
		// @301B: aaload
		// @301C: sipush 131 (0x0083)
		// @301F: sipush 203 (0x00CB)
		// @3022: iconst_1
		// @3023: anewarray game.C_100049_vf
		// @3026: dup
		// @3027: iconst_0
		// @3028: new game.C_100049_vf
		// @302B: dup
		// @302C: sipush 138 (0x008A)
		// @302F: sipush 202 (0x00CA)
		// @3032: sipush 16384 (0x4000)
		// @3035: iconst_0
		// @3036: bipush 16 (0x10)
		// @3038: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @303B: aastore
		// @303C: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @303F: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @3042: aastore
		// @3043: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @3046: iconst_1
		// @3047: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @304A: aastore
		// @304B: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @304E: iconst_1
		// @304F: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @3052: aastore
		// @3053: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @3056: astore_1
		// @3057: aload_1
		// @3058: bipush 84 (0x54)
		// @305A: putfield int game.C_100327_ib.field_102494_P
		// @305D: iconst_0
		// @305E: aload_1
		// @305F: invokestatic game.C_100226_ae.func_106142_a(boolean, game.C_100327_ib)game.C_100327_ib
		// @3062: astore_1
		// @3063: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @3066: bipush 124 (0x7C)
		// @3068: aload_1
		// @3069: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @306C: new game.C_100327_ib
		// @306F: dup
		// @3070: getstatic game.C_100153_be[] game.C_100042_we.field_104138_j
		// @3073: bipush 20 (0x14)
		// @3075: aaload
		// @3076: iconst_2
		// @3077: sipush 153 (0x0099)
		// @307A: bipush 58 (0x3A)
		// @307C: sipush -16384 (0xC000)
		// @307F: sipush 8192 (0x2000)
		// @3082: iconst_2
		// @3083: anewarray game.C_100049_vf
		// @3086: dup
		// @3087: iconst_0
		// @3088: new game.C_100049_vf
		// @308B: dup
		// @308C: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @308F: bipush 63 (0x3F)
		// @3091: aaload
		// @3092: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @3095: aastore
		// @3096: dup
		// @3097: iconst_1
		// @3098: new game.C_100049_vf
		// @309B: dup
		// @309C: sipush 250 (0x00FA)
		// @309F: iconst_2
		// @30A0: sipush 625 (0x0271)
		// @30A3: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @30A6: aastore
		// @30A7: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @30AA: astore_1
		// @30AB: aload_1
		// @30AC: bipush 91 (0x5B)
		// @30AE: putfield int game.C_100327_ib.field_102494_P
		// @30B1: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @30B4: bipush 124 (0x7C)
		// @30B6: aload_1
		// @30B7: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @30BA: new game.C_100327_ib
		// @30BD: dup
		// @30BE: getstatic game.C_100153_be[] game.C_100042_we.field_104138_j
		// @30C1: iconst_3
		// @30C2: aaload
		// @30C3: sipush 2048 (0x0800)
		// @30C6: bipush 120 (0x78)
		// @30C8: bipush 73 (0x49)
		// @30CA: sipush -16384 (0xC000)
		// @30CD: sipush 4096 (0x1000)
		// @30D0: iconst_5
		// @30D1: anewarray game.C_100049_vf
		// @30D4: dup
		// @30D5: iconst_0
		// @30D6: new game.C_100049_vf
		// @30D9: dup
		// @30DA: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @30DD: bipush 93 (0x5D)
		// @30DF: aaload
		// @30E0: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @30E3: aastore
		// @30E4: dup
		// @30E5: iconst_1
		// @30E6: new game.C_100049_vf
		// @30E9: dup
		// @30EA: sipush 300 (0x012C)
		// @30ED: iconst_0
		// @30EE: sipush 650 (0x028A)
		// @30F1: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @30F4: aastore
		// @30F5: dup
		// @30F6: iconst_2
		// @30F7: new game.C_100049_vf
		// @30FA: dup
		// @30FB: bipush 121 (0x79)
		// @30FD: bipush 31 (0x1F)
		// @30FF: sipush 13884 (0x363C)
		// @3102: iconst_0
		// @3103: sipush 256 (0x0100)
		// @3106: iconst_1
		// @3107: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @310A: aastore
		// @310B: dup
		// @310C: iconst_3
		// @310D: new game.C_100049_vf
		// @3110: dup
		// @3111: bipush 123 (0x7B)
		// @3113: bipush 39 (0x27)
		// @3115: sipush 13884 (0x363C)
		// @3118: iconst_0
		// @3119: sipush 256 (0x0100)
		// @311C: iconst_1
		// @311D: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @3120: aastore
		// @3121: dup
		// @3122: iconst_4
		// @3123: new game.C_100049_vf
		// @3126: dup
		// @3127: bipush 87 (0x57)
		// @3129: bipush 98 (0x62)
		// @312B: iconst_0
		// @312C: sipush 10922 (0x2AAA)
		// @312F: new game.C_100327_ib
		// @3132: dup
		// @3133: getstatic game.C_100153_be[] game.C_100042_we.field_104138_j
		// @3136: iconst_4
		// @3137: aaload
		// @3138: bipush 87 (0x57)
		// @313A: bipush 98 (0x62)
		// @313C: iconst_4
		// @313D: anewarray game.C_100049_vf
		// @3140: dup
		// @3141: iconst_0
		// @3142: new game.C_100049_vf
		// @3145: dup
		// @3146: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @3149: bipush 57 (0x39)
		// @314B: aaload
		// @314C: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @314F: aastore
		// @3150: dup
		// @3151: iconst_1
		// @3152: new game.C_100049_vf
		// @3155: dup
		// @3156: bipush 65 (0x41)
		// @3158: bipush 126 (0x7E)
		// @315A: sipush 29384 (0x72C8)
		// @315D: iconst_0
		// @315E: sipush 128 (0x0080)
		// @3161: iconst_1
		// @3162: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @3165: aastore
		// @3166: dup
		// @3167: iconst_2
		// @3168: new game.C_100049_vf
		// @316B: dup
		// @316C: bipush 75 (0x4B)
		// @316E: bipush 120 (0x78)
		// @3170: sipush 29384 (0x72C8)
		// @3173: iconst_0
		// @3174: sipush 128 (0x0080)
		// @3177: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @317A: aastore
		// @317B: dup
		// @317C: iconst_3
		// @317D: new game.C_100049_vf
		// @3180: dup
		// @3181: bipush 70 (0x46)
		// @3183: bipush 123 (0x7B)
		// @3185: sipush 29384 (0x72C8)
		// @3188: iconst_0
		// @3189: sipush 128 (0x0080)
		// @318C: iconst_1
		// @318D: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @3190: aastore
		// @3191: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @3194: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @3197: aastore
		// @3198: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @319B: astore_1
		// @319C: aload_1
		// @319D: bipush 89 (0x59)
		// @319F: putfield int game.C_100327_ib.field_102494_P
		// @31A2: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @31A5: bipush 126 (0x7E)
		// @31A7: aload_1
		// @31A8: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @31AB: new game.C_100327_ib
		// @31AE: dup
		// @31AF: getstatic game.C_100153_be[] game.C_100042_we.field_104138_j
		// @31B2: iconst_0
		// @31B3: aaload
		// @31B4: sipush 1024 (0x0400)
		// @31B7: bipush 120 (0x78)
		// @31B9: bipush 73 (0x49)
		// @31BB: sipush -26384 (0x98F0)
		// @31BE: sipush 4096 (0x1000)
		// @31C1: iconst_2
		// @31C2: anewarray game.C_100049_vf
		// @31C5: dup
		// @31C6: iconst_0
		// @31C7: new game.C_100049_vf
		// @31CA: dup
		// @31CB: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @31CE: bipush 61 (0x3D)
		// @31D0: aaload
		// @31D1: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @31D4: aastore
		// @31D5: dup
		// @31D6: iconst_1
		// @31D7: new game.C_100049_vf
		// @31DA: dup
		// @31DB: bipush 81 (0x51)
		// @31DD: bipush 97 (0x61)
		// @31DF: iconst_0
		// @31E0: sipush 4096 (0x1000)
		// @31E3: new game.C_100327_ib
		// @31E6: dup
		// @31E7: getstatic game.C_100153_be[] game.C_100042_we.field_104138_j
		// @31EA: iconst_1
		// @31EB: aaload
		// @31EC: bipush 81 (0x51)
		// @31EE: bipush 97 (0x61)
		// @31F0: iconst_1
		// @31F1: anewarray game.C_100049_vf
		// @31F4: dup
		// @31F5: iconst_0
		// @31F6: new game.C_100049_vf
		// @31F9: dup
		// @31FA: bipush 98 (0x62)
		// @31FC: bipush 117 (0x75)
		// @31FE: sipush 26384 (0x6710)
		// @3201: iconst_0
		// @3202: bipush 32 (0x20)
		// @3204: iconst_1
		// @3205: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @3208: aastore
		// @3209: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @320C: iconst_1
		// @320D: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @3210: aastore
		// @3211: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @3214: astore_1
		// @3215: aload_1
		// @3216: bipush 105 (0x69)
		// @3218: putfield int game.C_100327_ib.field_102494_P
		// @321B: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @321E: bipush 123 (0x7B)
		// @3220: aload_1
		// @3221: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @3224: new game.C_100327_ib
		// @3227: dup
		// @3228: getstatic game.C_100153_be[] game.C_100042_we.field_104138_j
		// @322B: bipush 13 (0x0D)
		// @322D: aaload
		// @322E: bipush 8 (0x08)
		// @3230: sipush 128 (0x0080)
		// @3233: bipush 52 (0x34)
		// @3235: sipush -16384 (0xC000)
		// @3238: sipush 4096 (0x1000)
		// @323B: iconst_3
		// @323C: anewarray game.C_100049_vf
		// @323F: dup
		// @3240: iconst_0
		// @3241: new game.C_100049_vf
		// @3244: dup
		// @3245: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @3248: bipush 6 (0x06)
		// @324A: aaload
		// @324B: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @324E: aastore
		// @324F: dup
		// @3250: iconst_1
		// @3251: new game.C_100049_vf
		// @3254: dup
		// @3255: sipush 200 (0x00C8)
		// @3258: iconst_0
		// @3259: sipush 500 (0x01F4)
		// @325C: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @325F: aastore
		// @3260: dup
		// @3261: iconst_2
		// @3262: new game.C_100049_vf
		// @3265: dup
		// @3266: sipush 130 (0x0082)
		// @3269: bipush 51 (0x33)
		// @326B: sipush 16384 (0x4000)
		// @326E: iconst_0
		// @326F: bipush 64 (0x40)
		// @3271: iconst_1
		// @3272: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @3275: aastore
		// @3276: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @3279: astore_1
		// @327A: aload_1
		// @327B: bipush 90 (0x5A)
		// @327D: putfield int game.C_100327_ib.field_102494_P
		// @3280: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @3283: bipush 124 (0x7C)
		// @3285: aload_1
		// @3286: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @3289: new game.C_100327_ib
		// @328C: dup
		// @328D: getstatic game.C_100153_be[] game.C_100042_we.field_104138_j
		// @3290: bipush 12 (0x0C)
		// @3292: aaload
		// @3293: iconst_1
		// @3294: sipush 146 (0x0092)
		// @3297: sipush 293 (0x0125)
		// @329A: iconst_0
		// @329B: iconst_0
		// @329C: bipush 8 (0x08)
		// @329E: anewarray game.C_100049_vf
		// @32A1: dup
		// @32A2: iconst_0
		// @32A3: new game.C_100049_vf
		// @32A6: dup
		// @32A7: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @32AA: bipush 44 (0x2C)
		// @32AC: aaload
		// @32AD: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @32B0: aastore
		// @32B1: dup
		// @32B2: iconst_1
		// @32B3: new game.C_100049_vf
		// @32B6: dup
		// @32B7: sipush 700 (0x02BC)
		// @32BA: iconst_4
		// @32BB: sipush 2350 (0x092E)
		// @32BE: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @32C1: aastore
		// @32C2: dup
		// @32C3: iconst_2
		// @32C4: new game.C_100049_vf
		// @32C7: dup
		// @32C8: bipush 16 (0x10)
		// @32CA: invokespecial game.C_100049_vf.<init>(int)void
		// @32CD: aastore
		// @32CE: dup
		// @32CF: iconst_3
		// @32D0: new game.C_100049_vf
		// @32D3: dup
		// @32D4: iconst_0
		// @32D5: sipush 400 (0x0190)
		// @32D8: invokespecial game.C_100049_vf.<init>(int, int)void
		// @32DB: aastore
		// @32DC: dup
		// @32DD: iconst_4
		// @32DE: new game.C_100049_vf
		// @32E1: dup
		// @32E2: bipush 103 (0x67)
		// @32E4: sipush 142 (0x008E)
		// @32E7: iconst_0
		// @32E8: iconst_0
		// @32E9: new game.C_100327_ib
		// @32EC: dup
		// @32ED: getstatic game.C_100153_be[] game.C_100042_we.field_104138_j
		// @32F0: bipush 14 (0x0E)
		// @32F2: aaload
		// @32F3: bipush 103 (0x67)
		// @32F5: sipush 142 (0x008E)
		// @32F8: iconst_2
		// @32F9: anewarray game.C_100049_vf
		// @32FC: dup
		// @32FD: iconst_0
		// @32FE: new game.C_100049_vf
		// @3301: dup
		// @3302: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @3305: bipush 91 (0x5B)
		// @3307: aaload
		// @3308: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @330B: aastore
		// @330C: dup
		// @330D: iconst_1
		// @330E: new game.C_100049_vf
		// @3311: dup
		// @3312: sipush 135 (0x0087)
		// @3315: sipush 203 (0x00CB)
		// @3318: iconst_0
		// @3319: iconst_0
		// @331A: new game.C_100327_ib
		// @331D: dup
		// @331E: getstatic game.C_100153_be[] game.C_100042_we.field_104138_j
		// @3321: bipush 15 (0x0F)
		// @3323: aaload
		// @3324: sipush 135 (0x0087)
		// @3327: sipush 140 (0x008C)
		// @332A: iconst_3
		// @332B: anewarray game.C_100049_vf
		// @332E: dup
		// @332F: iconst_0
		// @3330: new game.C_100049_vf
		// @3333: dup
		// @3334: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @3337: bipush 28 (0x1C)
		// @3339: aaload
		// @333A: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @333D: aastore
		// @333E: dup
		// @333F: iconst_1
		// @3340: new game.C_100049_vf
		// @3343: dup
		// @3344: sipush 130 (0x0082)
		// @3347: sipush 153 (0x0099)
		// @334A: iconst_0
		// @334B: iconst_0
		// @334C: new game.C_100327_ib
		// @334F: dup
		// @3350: getstatic game.C_100153_be[] game.C_100042_we.field_104138_j
		// @3353: bipush 16 (0x10)
		// @3355: aaload
		// @3356: sipush 128 (0x0080)
		// @3359: sipush 221 (0x00DD)
		// @335C: iconst_1
		// @335D: anewarray game.C_100049_vf
		// @3360: dup
		// @3361: iconst_0
		// @3362: new game.C_100049_vf
		// @3365: dup
		// @3366: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @3369: bipush 42 (0x2A)
		// @336B: aaload
		// @336C: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @336F: aastore
		// @3370: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @3373: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @3376: aastore
		// @3377: dup
		// @3378: iconst_2
		// @3379: new game.C_100049_vf
		// @337C: dup
		// @337D: bipush 108 (0x6C)
		// @337F: sipush 206 (0x00CE)
		// @3382: iconst_0
		// @3383: iconst_0
		// @3384: new game.C_100327_ib
		// @3387: dup
		// @3388: getstatic game.C_100153_be[] game.C_100042_we.field_104138_j
		// @338B: bipush 17 (0x11)
		// @338D: aaload
		// @338E: bipush 108 (0x6C)
		// @3390: sipush 206 (0x00CE)
		// @3393: iconst_2
		// @3394: anewarray game.C_100049_vf
		// @3397: dup
		// @3398: iconst_0
		// @3399: new game.C_100049_vf
		// @339C: dup
		// @339D: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @33A0: bipush 88 (0x58)
		// @33A2: aaload
		// @33A3: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @33A6: aastore
		// @33A7: dup
		// @33A8: iconst_1
		// @33A9: new game.C_100049_vf
		// @33AC: dup
		// @33AD: sipush 138 (0x008A)
		// @33B0: sipush 231 (0x00E7)
		// @33B3: iconst_0
		// @33B4: iconst_0
		// @33B5: new game.C_100327_ib
		// @33B8: dup
		// @33B9: getstatic game.C_100153_be[] game.C_100042_we.field_104138_j
		// @33BC: bipush 18 (0x12)
		// @33BE: aaload
		// @33BF: sipush 132 (0x0084)
		// @33C2: sipush 213 (0x00D5)
		// @33C5: iconst_1
		// @33C6: anewarray game.C_100049_vf
		// @33C9: dup
		// @33CA: iconst_0
		// @33CB: new game.C_100049_vf
		// @33CE: dup
		// @33CF: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @33D2: bipush 104 (0x68)
		// @33D4: aaload
		// @33D5: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @33D8: aastore
		// @33D9: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @33DC: iconst_1
		// @33DD: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @33E0: aastore
		// @33E1: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @33E4: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @33E7: aastore
		// @33E8: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @33EB: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @33EE: aastore
		// @33EF: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @33F2: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @33F5: aastore
		// @33F6: dup
		// @33F7: iconst_5
		// @33F8: new game.C_100049_vf
		// @33FB: dup
		// @33FC: bipush 107 (0x6B)
		// @33FE: sipush 142 (0x008E)
		// @3401: iconst_0
		// @3402: iconst_0
		// @3403: new game.C_100327_ib
		// @3406: dup
		// @3407: getstatic game.C_100153_be[] game.C_100042_we.field_104138_j
		// @340A: bipush 7 (0x07)
		// @340C: aaload
		// @340D: bipush 103 (0x67)
		// @340F: sipush 142 (0x008E)
		// @3412: iconst_2
		// @3413: anewarray game.C_100049_vf
		// @3416: dup
		// @3417: iconst_0
		// @3418: new game.C_100049_vf
		// @341B: dup
		// @341C: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @341F: bipush 103 (0x67)
		// @3421: aaload
		// @3422: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @3425: aastore
		// @3426: dup
		// @3427: iconst_1
		// @3428: new game.C_100049_vf
		// @342B: dup
		// @342C: sipush 135 (0x0087)
		// @342F: sipush 203 (0x00CB)
		// @3432: iconst_0
		// @3433: iconst_0
		// @3434: new game.C_100327_ib
		// @3437: dup
		// @3438: getstatic game.C_100153_be[] game.C_100042_we.field_104138_j
		// @343B: bipush 8 (0x08)
		// @343D: aaload
		// @343E: sipush 135 (0x0087)
		// @3441: sipush 140 (0x008C)
		// @3444: iconst_3
		// @3445: anewarray game.C_100049_vf
		// @3448: dup
		// @3449: iconst_0
		// @344A: new game.C_100049_vf
		// @344D: dup
		// @344E: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @3451: bipush 16 (0x10)
		// @3453: aaload
		// @3454: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @3457: aastore
		// @3458: dup
		// @3459: iconst_1
		// @345A: new game.C_100049_vf
		// @345D: dup
		// @345E: sipush 130 (0x0082)
		// @3461: sipush 153 (0x0099)
		// @3464: iconst_0
		// @3465: iconst_0
		// @3466: new game.C_100327_ib
		// @3469: dup
		// @346A: getstatic game.C_100153_be[] game.C_100042_we.field_104138_j
		// @346D: bipush 9 (0x09)
		// @346F: aaload
		// @3470: sipush 128 (0x0080)
		// @3473: sipush 221 (0x00DD)
		// @3476: iconst_1
		// @3477: anewarray game.C_100049_vf
		// @347A: dup
		// @347B: iconst_0
		// @347C: new game.C_100049_vf
		// @347F: dup
		// @3480: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @3483: bipush 64 (0x40)
		// @3485: aaload
		// @3486: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @3489: aastore
		// @348A: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @348D: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @3490: aastore
		// @3491: dup
		// @3492: iconst_2
		// @3493: new game.C_100049_vf
		// @3496: dup
		// @3497: bipush 108 (0x6C)
		// @3499: sipush 206 (0x00CE)
		// @349C: iconst_0
		// @349D: iconst_0
		// @349E: new game.C_100327_ib
		// @34A1: dup
		// @34A2: getstatic game.C_100153_be[] game.C_100042_we.field_104138_j
		// @34A5: bipush 10 (0x0A)
		// @34A7: aaload
		// @34A8: bipush 108 (0x6C)
		// @34AA: sipush 206 (0x00CE)
		// @34AD: iconst_2
		// @34AE: anewarray game.C_100049_vf
		// @34B1: dup
		// @34B2: iconst_0
		// @34B3: new game.C_100049_vf
		// @34B6: dup
		// @34B7: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @34BA: bipush 101 (0x65)
		// @34BC: aaload
		// @34BD: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @34C0: aastore
		// @34C1: dup
		// @34C2: iconst_1
		// @34C3: new game.C_100049_vf
		// @34C6: dup
		// @34C7: sipush 138 (0x008A)
		// @34CA: sipush 231 (0x00E7)
		// @34CD: iconst_0
		// @34CE: iconst_0
		// @34CF: new game.C_100327_ib
		// @34D2: dup
		// @34D3: getstatic game.C_100153_be[] game.C_100042_we.field_104138_j
		// @34D6: bipush 11 (0x0B)
		// @34D8: aaload
		// @34D9: sipush 132 (0x0084)
		// @34DC: sipush 213 (0x00D5)
		// @34DF: iconst_1
		// @34E0: anewarray game.C_100049_vf
		// @34E3: dup
		// @34E4: iconst_0
		// @34E5: new game.C_100049_vf
		// @34E8: dup
		// @34E9: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @34EC: bipush 79 (0x4F)
		// @34EE: aaload
		// @34EF: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @34F2: aastore
		// @34F3: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @34F6: iconst_1
		// @34F7: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @34FA: aastore
		// @34FB: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @34FE: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @3501: aastore
		// @3502: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @3505: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @3508: aastore
		// @3509: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @350C: iconst_1
		// @350D: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @3510: aastore
		// @3511: dup
		// @3512: bipush 6 (0x06)
		// @3514: new game.C_100049_vf
		// @3517: dup
		// @3518: sipush 133 (0x0085)
		// @351B: bipush 63 (0x3F)
		// @351D: sipush 16384 (0x4000)
		// @3520: iconst_0
		// @3521: sipush 1024 (0x0400)
		// @3524: iconst_1
		// @3525: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @3528: aastore
		// @3529: dup
		// @352A: bipush 7 (0x07)
		// @352C: new game.C_100049_vf
		// @352F: dup
		// @3530: bipush 107 (0x6B)
		// @3532: bipush 104 (0x68)
		// @3534: iconst_0
		// @3535: iconst_0
		// @3536: new game.C_100327_ib
		// @3539: dup
		// @353A: getstatic game.C_100153_be[] game.C_100042_we.field_104138_j
		// @353D: bipush 19 (0x13)
		// @353F: aaload
		// @3540: bipush 107 (0x6B)
		// @3542: bipush 104 (0x68)
		// @3544: iconst_4
		// @3545: anewarray game.C_100049_vf
		// @3548: dup
		// @3549: iconst_0
		// @354A: new game.C_100049_vf
		// @354D: dup
		// @354E: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @3551: sipush 129 (0x0081)
		// @3554: aaload
		// @3555: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @3558: aastore
		// @3559: dup
		// @355A: iconst_1
		// @355B: new game.C_100049_vf
		// @355E: dup
		// @355F: sipush 153 (0x0099)
		// @3562: bipush 58 (0x3A)
		// @3564: sipush 16384 (0x4000)
		// @3567: iconst_0
		// @3568: iconst_2
		// @3569: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @356C: aastore
		// @356D: dup
		// @356E: iconst_2
		// @356F: new game.C_100049_vf
		// @3572: dup
		// @3573: bipush 120 (0x78)
		// @3575: bipush 62 (0x3E)
		// @3577: sipush 16384 (0x4000)
		// @357A: iconst_0
		// @357B: bipush 8 (0x08)
		// @357D: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @3580: aastore
		// @3581: dup
		// @3582: iconst_3
		// @3583: new game.C_100049_vf
		// @3586: dup
		// @3587: bipush 120 (0x78)
		// @3589: bipush 73 (0x49)
		// @358B: sipush 16384 (0x4000)
		// @358E: iconst_0
		// @358F: sipush 2052 (0x0804)
		// @3592: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @3595: aastore
		// @3596: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @3599: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @359C: aastore
		// @359D: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @35A0: astore_1
		// @35A1: aload_1
		// @35A2: bipush 88 (0x58)
		// @35A4: putfield int game.C_100327_ib.field_102494_P
		// @35A7: iload_0
		// @35A8: aload_1
		// @35A9: invokestatic game.C_100226_ae.func_106142_a(boolean, game.C_100327_ib)game.C_100327_ib
		// @35AC: astore_1
		// @35AD: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @35B0: bipush 126 (0x7E)
		// @35B2: aload_1
		// @35B3: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @35B6: new game.C_100327_ib
		// @35B9: dup
		// @35BA: getstatic game.C_100153_be[] game.C_100166_sg.field_105466_b
		// @35BD: bipush 9 (0x09)
		// @35BF: aaload
		// @35C0: iconst_2
		// @35C1: bipush 100 (0x64)
		// @35C3: sipush 148 (0x0094)
		// @35C6: sipush -16384 (0xC000)
		// @35C9: sipush 4096 (0x1000)
		// @35CC: iconst_2
		// @35CD: anewarray game.C_100049_vf
		// @35D0: dup
		// @35D1: iconst_0
		// @35D2: new game.C_100049_vf
		// @35D5: dup
		// @35D6: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @35D9: bipush 18 (0x12)
		// @35DB: aaload
		// @35DC: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @35DF: aastore
		// @35E0: dup
		// @35E1: iconst_1
		// @35E2: new game.C_100049_vf
		// @35E5: dup
		// @35E6: sipush 500 (0x01F4)
		// @35E9: iconst_1
		// @35EA: sipush 500 (0x01F4)
		// @35ED: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @35F0: aastore
		// @35F1: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @35F4: astore_1
		// @35F5: aload_1
		// @35F6: bipush 95 (0x5F)
		// @35F8: putfield int game.C_100327_ib.field_102494_P
		// @35FB: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @35FE: bipush 127 (0x7F)
		// @3600: aload_1
		// @3601: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @3604: new game.C_100327_ib
		// @3607: dup
		// @3608: getstatic game.C_100153_be[] game.C_100166_sg.field_105466_b
		// @360B: iconst_2
		// @360C: aaload
		// @360D: sipush 2048 (0x0800)
		// @3610: bipush 125 (0x7D)
		// @3612: bipush 91 (0x5B)
		// @3614: sipush -16384 (0xC000)
		// @3617: sipush 8192 (0x2000)
		// @361A: iconst_3
		// @361B: anewarray game.C_100049_vf
		// @361E: dup
		// @361F: iconst_0
		// @3620: new game.C_100049_vf
		// @3623: dup
		// @3624: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @3627: bipush 92 (0x5C)
		// @3629: aaload
		// @362A: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @362D: aastore
		// @362E: dup
		// @362F: iconst_1
		// @3630: new game.C_100049_vf
		// @3633: dup
		// @3634: sipush 700 (0x02BC)
		// @3637: iconst_0
		// @3638: sipush 850 (0x0352)
		// @363B: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @363E: aastore
		// @363F: dup
		// @3640: iconst_2
		// @3641: new game.C_100049_vf
		// @3644: dup
		// @3645: bipush 125 (0x7D)
		// @3647: sipush 159 (0x009F)
		// @364A: iconst_0
		// @364B: sipush 4096 (0x1000)
		// @364E: new game.C_100327_ib
		// @3651: dup
		// @3652: getstatic game.C_100153_be[] game.C_100166_sg.field_105466_b
		// @3655: iconst_1
		// @3656: aaload
		// @3657: bipush 97 (0x61)
		// @3659: bipush 93 (0x5D)
		// @365B: iconst_3
		// @365C: anewarray game.C_100049_vf
		// @365F: dup
		// @3660: iconst_0
		// @3661: new game.C_100049_vf
		// @3664: dup
		// @3665: sipush 146 (0x0092)
		// @3668: sipush 168 (0x00A8)
		// @366B: sipush 27384 (0x6AF8)
		// @366E: iconst_0
		// @366F: sipush 256 (0x0100)
		// @3672: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @3675: aastore
		// @3676: dup
		// @3677: iconst_1
		// @3678: new game.C_100049_vf
		// @367B: dup
		// @367C: bipush 111 (0x6F)
		// @367E: sipush 181 (0x00B5)
		// @3681: sipush 27384 (0x6AF8)
		// @3684: iconst_0
		// @3685: sipush 256 (0x0100)
		// @3688: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @368B: aastore
		// @368C: dup
		// @368D: iconst_2
		// @368E: new game.C_100049_vf
		// @3691: dup
		// @3692: sipush 172 (0x00AC)
		// @3695: sipush 151 (0x0097)
		// @3698: sipush 27384 (0x6AF8)
		// @369B: iconst_0
		// @369C: sipush 256 (0x0100)
		// @369F: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @36A2: aastore
		// @36A3: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @36A6: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @36A9: aastore
		// @36AA: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @36AD: astore_1
		// @36AE: aload_1
		// @36AF: bipush 93 (0x5D)
		// @36B1: putfield int game.C_100327_ib.field_102494_P
		// @36B4: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @36B7: bipush 127 (0x7F)
		// @36B9: aload_1
		// @36BA: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @36BD: new game.C_100327_ib
		// @36C0: dup
		// @36C1: getstatic game.C_100153_be[] game.C_100166_sg.field_105466_b
		// @36C4: bipush 12 (0x0C)
		// @36C6: aaload
		// @36C7: sipush 1024 (0x0400)
		// @36CA: sipush 128 (0x0080)
		// @36CD: bipush 99 (0x63)
		// @36CF: sipush -16384 (0xC000)
		// @36D2: sipush 4096 (0x1000)
		// @36D5: iconst_2
		// @36D6: anewarray game.C_100049_vf
		// @36D9: dup
		// @36DA: iconst_0
		// @36DB: new game.C_100049_vf
		// @36DE: dup
		// @36DF: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @36E2: bipush 8 (0x08)
		// @36E4: aaload
		// @36E5: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @36E8: aastore
		// @36E9: dup
		// @36EA: iconst_1
		// @36EB: new game.C_100049_vf
		// @36EE: dup
		// @36EF: bipush 126 (0x7E)
		// @36F1: sipush 179 (0x00B3)
		// @36F4: iconst_0
		// @36F5: sipush 4096 (0x1000)
		// @36F8: new game.C_100327_ib
		// @36FB: dup
		// @36FC: getstatic game.C_100153_be[] game.C_100166_sg.field_105466_b
		// @36FF: bipush 14 (0x0E)
		// @3701: aaload
		// @3702: bipush 101 (0x65)
		// @3704: sipush 143 (0x008F)
		// @3707: iconst_1
		// @3708: anewarray game.C_100049_vf
		// @370B: dup
		// @370C: iconst_0
		// @370D: new game.C_100049_vf
		// @3710: dup
		// @3711: bipush 121 (0x79)
		// @3713: sipush 162 (0x00A2)
		// @3716: sipush 16384 (0x4000)
		// @3719: iconst_0
		// @371A: bipush 64 (0x40)
		// @371C: iconst_1
		// @371D: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @3720: aastore
		// @3721: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @3724: iconst_1
		// @3725: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @3728: aastore
		// @3729: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @372C: astore_1
		// @372D: aload_1
		// @372E: bipush 106 (0x6A)
		// @3730: putfield int game.C_100327_ib.field_102494_P
		// @3733: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @3736: bipush 124 (0x7C)
		// @3738: aload_1
		// @3739: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @373C: new game.C_100327_ib
		// @373F: dup
		// @3740: getstatic game.C_100153_be[] game.C_100166_sg.field_105466_b
		// @3743: bipush 10 (0x0A)
		// @3745: aaload
		// @3746: iconst_1
		// @3747: sipush 146 (0x0092)
		// @374A: sipush 405 (0x0195)
		// @374D: iconst_0
		// @374E: iconst_0
		// @374F: bipush 16 (0x10)
		// @3751: anewarray game.C_100049_vf
		// @3754: dup
		// @3755: iconst_0
		// @3756: new game.C_100049_vf
		// @3759: dup
		// @375A: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @375D: bipush 84 (0x54)
		// @375F: aaload
		// @3760: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @3763: aastore
		// @3764: dup
		// @3765: iconst_1
		// @3766: new game.C_100049_vf
		// @3769: dup
		// @376A: sipush 1800 (0x0708)
		// @376D: iconst_5
		// @376E: sipush 2750 (0x0ABE)
		// @3771: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @3774: aastore
		// @3775: dup
		// @3776: iconst_2
		// @3777: new game.C_100049_vf
		// @377A: dup
		// @377B: bipush 16 (0x10)
		// @377D: invokespecial game.C_100049_vf.<init>(int)void
		// @3780: aastore
		// @3781: dup
		// @3782: iconst_3
		// @3783: new game.C_100049_vf
		// @3786: dup
		// @3787: sipush -600 (0xFDA8)
		// @378A: sipush 600 (0x0258)
		// @378D: invokespecial game.C_100049_vf.<init>(int, int)void
		// @3790: aastore
		// @3791: dup
		// @3792: iconst_4
		// @3793: new game.C_100049_vf
		// @3796: dup
		// @3797: sipush 136 (0x0088)
		// @379A: sipush 145 (0x0091)
		// @379D: sipush 16384 (0x4000)
		// @37A0: iconst_0
		// @37A1: sipush 1024 (0x0400)
		// @37A4: iconst_1
		// @37A5: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @37A8: aastore
		// @37A9: dup
		// @37AA: iconst_5
		// @37AB: new game.C_100049_vf
		// @37AE: dup
		// @37AF: sipush 216 (0x00D8)
		// @37B2: bipush 101 (0x65)
		// @37B4: sipush 16384 (0x4000)
		// @37B7: sipush 4096 (0x1000)
		// @37BA: sipush 128 (0x0080)
		// @37BD: iconst_1
		// @37BE: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @37C1: aastore
		// @37C2: dup
		// @37C3: bipush 6 (0x06)
		// @37C5: new game.C_100049_vf
		// @37C8: dup
		// @37C9: sipush 216 (0x00D8)
		// @37CC: bipush 111 (0x6F)
		// @37CE: sipush 16384 (0x4000)
		// @37D1: sipush 4096 (0x1000)
		// @37D4: sipush 128 (0x0080)
		// @37D7: iconst_1
		// @37D8: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @37DB: aastore
		// @37DC: dup
		// @37DD: bipush 7 (0x07)
		// @37DF: new game.C_100049_vf
		// @37E2: dup
		// @37E3: sipush 216 (0x00D8)
		// @37E6: bipush 121 (0x79)
		// @37E8: sipush 16384 (0x4000)
		// @37EB: sipush 4096 (0x1000)
		// @37EE: sipush 128 (0x0080)
		// @37F1: iconst_1
		// @37F2: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @37F5: aastore
		// @37F6: dup
		// @37F7: bipush 8 (0x08)
		// @37F9: new game.C_100049_vf
		// @37FC: dup
		// @37FD: sipush 210 (0x00D2)
		// @3800: sipush 182 (0x00B6)
		// @3803: sipush 16384 (0x4000)
		// @3806: sipush 4096 (0x1000)
		// @3809: iconst_2
		// @380A: iconst_1
		// @380B: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @380E: aastore
		// @380F: dup
		// @3810: bipush 9 (0x09)
		// @3812: new game.C_100049_vf
		// @3815: dup
		// @3816: sipush 208 (0x00D0)
		// @3819: bipush 82 (0x52)
		// @381B: sipush 16384 (0x4000)
		// @381E: sipush 4096 (0x1000)
		// @3821: sipush 128 (0x0080)
		// @3824: iconst_1
		// @3825: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @3828: aastore
		// @3829: dup
		// @382A: bipush 10 (0x0A)
		// @382C: new game.C_100049_vf
		// @382F: dup
		// @3830: sipush 187 (0x00BB)
		// @3833: sipush 201 (0x00C9)
		// @3836: sipush 16384 (0x4000)
		// @3839: sipush 4096 (0x1000)
		// @383C: sipush 128 (0x0080)
		// @383F: iconst_1
		// @3840: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @3843: aastore
		// @3844: dup
		// @3845: bipush 11 (0x0B)
		// @3847: new game.C_100049_vf
		// @384A: dup
		// @384B: sipush 187 (0x00BB)
		// @384E: sipush 211 (0x00D3)
		// @3851: sipush 16384 (0x4000)
		// @3854: sipush 4096 (0x1000)
		// @3857: sipush 128 (0x0080)
		// @385A: iconst_1
		// @385B: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @385E: aastore
		// @385F: dup
		// @3860: bipush 12 (0x0C)
		// @3862: new game.C_100049_vf
		// @3865: dup
		// @3866: sipush 187 (0x00BB)
		// @3869: sipush 221 (0x00DD)
		// @386C: sipush 16384 (0x4000)
		// @386F: sipush 4096 (0x1000)
		// @3872: sipush 128 (0x0080)
		// @3875: iconst_1
		// @3876: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @3879: aastore
		// @387A: dup
		// @387B: bipush 13 (0x0D)
		// @387D: new game.C_100049_vf
		// @3880: dup
		// @3881: sipush 136 (0x0088)
		// @3884: sipush 145 (0x0091)
		// @3887: sipush 16384 (0x4000)
		// @388A: iconst_0
		// @388B: sipush 2052 (0x0804)
		// @388E: invokespecial game.C_100049_vf.<init>(int, int, int, int, int)void
		// @3891: aastore
		// @3892: dup
		// @3893: bipush 14 (0x0E)
		// @3895: new game.C_100049_vf
		// @3898: dup
		// @3899: sipush 129 (0x0081)
		// @389C: sipush 220 (0x00DC)
		// @389F: iconst_0
		// @38A0: iconst_0
		// @38A1: new game.C_100327_ib
		// @38A4: dup
		// @38A5: getstatic game.C_100153_be[] game.C_100166_sg.field_105466_b
		// @38A8: bipush 11 (0x0B)
		// @38AA: aaload
		// @38AB: sipush 136 (0x0088)
		// @38AE: sipush 134 (0x0086)
		// @38B1: iconst_2
		// @38B2: anewarray game.C_100049_vf
		// @38B5: dup
		// @38B6: iconst_0
		// @38B7: new game.C_100049_vf
		// @38BA: dup
		// @38BB: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @38BE: bipush 71 (0x47)
		// @38C0: aaload
		// @38C1: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @38C4: aastore
		// @38C5: dup
		// @38C6: iconst_1
		// @38C7: new game.C_100049_vf
		// @38CA: dup
		// @38CB: sipush 131 (0x0083)
		// @38CE: sipush 154 (0x009A)
		// @38D1: iconst_0
		// @38D2: iconst_0
		// @38D3: new game.C_100327_ib
		// @38D6: dup
		// @38D7: getstatic game.C_100153_be[] game.C_100166_sg.field_105466_b
		// @38DA: bipush 8 (0x08)
		// @38DC: aaload
		// @38DD: sipush 131 (0x0083)
		// @38E0: bipush 96 (0x60)
		// @38E2: iconst_3
		// @38E3: anewarray game.C_100049_vf
		// @38E6: dup
		// @38E7: iconst_0
		// @38E8: new game.C_100049_vf
		// @38EB: dup
		// @38EC: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @38EF: bipush 21 (0x15)
		// @38F1: aaload
		// @38F2: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @38F5: aastore
		// @38F6: dup
		// @38F7: iconst_1
		// @38F8: new game.C_100049_vf
		// @38FB: dup
		// @38FC: sipush 129 (0x0081)
		// @38FF: sipush 140 (0x008C)
		// @3902: iconst_0
		// @3903: iconst_0
		// @3904: new game.C_100327_ib
		// @3907: dup
		// @3908: getstatic game.C_100153_be[] game.C_100166_sg.field_105466_b
		// @390B: iconst_5
		// @390C: aaload
		// @390D: sipush 129 (0x0081)
		// @3910: bipush 103 (0x67)
		// @3912: iconst_2
		// @3913: anewarray game.C_100049_vf
		// @3916: dup
		// @3917: iconst_0
		// @3918: new game.C_100049_vf
		// @391B: dup
		// @391C: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @391F: bipush 116 (0x74)
		// @3921: aaload
		// @3922: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @3925: aastore
		// @3926: dup
		// @3927: iconst_1
		// @3928: new game.C_100049_vf
		// @392B: dup
		// @392C: sipush 155 (0x009B)
		// @392F: sipush 157 (0x009D)
		// @3932: iconst_0
		// @3933: iconst_0
		// @3934: new game.C_100327_ib
		// @3937: dup
		// @3938: getstatic game.C_100153_be[] game.C_100166_sg.field_105466_b
		// @393B: iconst_4
		// @393C: aaload
		// @393D: sipush 153 (0x0099)
		// @3940: bipush 100 (0x64)
		// @3942: iconst_3
		// @3943: anewarray game.C_100049_vf
		// @3946: dup
		// @3947: iconst_0
		// @3948: new game.C_100049_vf
		// @394B: dup
		// @394C: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @394F: bipush 120 (0x78)
		// @3951: aaload
		// @3952: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @3955: aastore
		// @3956: dup
		// @3957: iconst_1
		// @3958: new game.C_100049_vf
		// @395B: dup
		// @395C: sipush 163 (0x00A3)
		// @395F: bipush 105 (0x69)
		// @3961: iconst_0
		// @3962: iconst_0
		// @3963: new game.C_100327_ib
		// @3966: dup
		// @3967: getstatic game.C_100153_be[] game.C_100166_sg.field_105466_b
		// @396A: iconst_3
		// @396B: aaload
		// @396C: bipush 124 (0x7C)
		// @396E: bipush 120 (0x78)
		// @3970: iconst_1
		// @3971: anewarray game.C_100049_vf
		// @3974: dup
		// @3975: iconst_0
		// @3976: new game.C_100049_vf
		// @3979: dup
		// @397A: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @397D: bipush 43 (0x2B)
		// @397F: aaload
		// @3980: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @3983: aastore
		// @3984: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @3987: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @398A: aastore
		// @398B: dup
		// @398C: iconst_2
		// @398D: new game.C_100049_vf
		// @3990: dup
		// @3991: sipush 128 (0x0080)
		// @3994: sipush 128 (0x0080)
		// @3997: iconst_0
		// @3998: iconst_0
		// @3999: new game.C_100327_ib
		// @399C: dup
		// @399D: getstatic game.C_100153_be[] game.C_100166_sg.field_105466_b
		// @39A0: bipush 6 (0x06)
		// @39A2: aaload
		// @39A3: sipush 128 (0x0080)
		// @39A6: sipush 128 (0x0080)
		// @39A9: iconst_2
		// @39AA: anewarray game.C_100049_vf
		// @39AD: dup
		// @39AE: iconst_0
		// @39AF: new game.C_100049_vf
		// @39B2: dup
		// @39B3: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @39B6: bipush 23 (0x17)
		// @39B8: aaload
		// @39B9: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @39BC: aastore
		// @39BD: dup
		// @39BE: iconst_1
		// @39BF: new game.C_100049_vf
		// @39C2: dup
		// @39C3: sipush 168 (0x00A8)
		// @39C6: sipush 161 (0x00A1)
		// @39C9: iconst_0
		// @39CA: iconst_0
		// @39CB: new game.C_100327_ib
		// @39CE: dup
		// @39CF: getstatic game.C_100153_be[] game.C_100166_sg.field_105466_b
		// @39D2: bipush 7 (0x07)
		// @39D4: aaload
		// @39D5: sipush 138 (0x008A)
		// @39D8: sipush 222 (0x00DE)
		// @39DB: iconst_1
		// @39DC: anewarray game.C_100049_vf
		// @39DF: dup
		// @39E0: iconst_0
		// @39E1: new game.C_100049_vf
		// @39E4: dup
		// @39E5: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @39E8: bipush 14 (0x0E)
		// @39EA: aaload
		// @39EB: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @39EE: aastore
		// @39EF: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @39F2: iconst_1
		// @39F3: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @39F6: aastore
		// @39F7: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @39FA: iconst_1
		// @39FB: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @39FE: aastore
		// @39FF: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @3A02: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @3A05: aastore
		// @3A06: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @3A09: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @3A0C: aastore
		// @3A0D: dup
		// @3A0E: iconst_2
		// @3A0F: new game.C_100049_vf
		// @3A12: dup
		// @3A13: sipush 129 (0x0081)
		// @3A16: sipush 140 (0x008C)
		// @3A19: iconst_0
		// @3A1A: iconst_0
		// @3A1B: new game.C_100327_ib
		// @3A1E: dup
		// @3A1F: getstatic game.C_100153_be[] game.C_100166_sg.field_105466_b
		// @3A22: bipush 19 (0x13)
		// @3A24: aaload
		// @3A25: sipush 129 (0x0081)
		// @3A28: bipush 103 (0x67)
		// @3A2A: iconst_2
		// @3A2B: anewarray game.C_100049_vf
		// @3A2E: dup
		// @3A2F: iconst_0
		// @3A30: new game.C_100049_vf
		// @3A33: dup
		// @3A34: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @3A37: bipush 34 (0x22)
		// @3A39: aaload
		// @3A3A: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @3A3D: aastore
		// @3A3E: dup
		// @3A3F: iconst_1
		// @3A40: new game.C_100049_vf
		// @3A43: dup
		// @3A44: sipush 155 (0x009B)
		// @3A47: sipush 157 (0x009D)
		// @3A4A: iconst_0
		// @3A4B: iconst_0
		// @3A4C: new game.C_100327_ib
		// @3A4F: dup
		// @3A50: getstatic game.C_100153_be[] game.C_100166_sg.field_105466_b
		// @3A53: bipush 17 (0x11)
		// @3A55: aaload
		// @3A56: sipush 153 (0x0099)
		// @3A59: bipush 100 (0x64)
		// @3A5B: iconst_3
		// @3A5C: anewarray game.C_100049_vf
		// @3A5F: dup
		// @3A60: iconst_0
		// @3A61: new game.C_100049_vf
		// @3A64: dup
		// @3A65: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @3A68: bipush 77 (0x4D)
		// @3A6A: aaload
		// @3A6B: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @3A6E: aastore
		// @3A6F: dup
		// @3A70: iconst_1
		// @3A71: new game.C_100049_vf
		// @3A74: dup
		// @3A75: sipush 163 (0x00A3)
		// @3A78: bipush 105 (0x69)
		// @3A7A: iconst_0
		// @3A7B: iconst_0
		// @3A7C: new game.C_100327_ib
		// @3A7F: dup
		// @3A80: getstatic game.C_100153_be[] game.C_100166_sg.field_105466_b
		// @3A83: iconst_3
		// @3A84: aaload
		// @3A85: bipush 124 (0x7C)
		// @3A87: bipush 120 (0x78)
		// @3A89: iconst_1
		// @3A8A: anewarray game.C_100049_vf
		// @3A8D: dup
		// @3A8E: iconst_0
		// @3A8F: new game.C_100049_vf
		// @3A92: dup
		// @3A93: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @3A96: bipush 58 (0x3A)
		// @3A98: aaload
		// @3A99: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @3A9C: aastore
		// @3A9D: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @3AA0: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @3AA3: aastore
		// @3AA4: dup
		// @3AA5: iconst_2
		// @3AA6: new game.C_100049_vf
		// @3AA9: dup
		// @3AAA: sipush 128 (0x0080)
		// @3AAD: sipush 128 (0x0080)
		// @3AB0: iconst_0
		// @3AB1: iconst_0
		// @3AB2: new game.C_100327_ib
		// @3AB5: dup
		// @3AB6: getstatic game.C_100153_be[] game.C_100166_sg.field_105466_b
		// @3AB9: bipush 13 (0x0D)
		// @3ABB: aaload
		// @3ABC: sipush 128 (0x0080)
		// @3ABF: sipush 128 (0x0080)
		// @3AC2: iconst_2
		// @3AC3: anewarray game.C_100049_vf
		// @3AC6: dup
		// @3AC7: iconst_0
		// @3AC8: new game.C_100049_vf
		// @3ACB: dup
		// @3ACC: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @3ACF: bipush 27 (0x1B)
		// @3AD1: aaload
		// @3AD2: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @3AD5: aastore
		// @3AD6: dup
		// @3AD7: iconst_1
		// @3AD8: new game.C_100049_vf
		// @3ADB: dup
		// @3ADC: sipush 168 (0x00A8)
		// @3ADF: sipush 161 (0x00A1)
		// @3AE2: iconst_0
		// @3AE3: iconst_0
		// @3AE4: new game.C_100327_ib
		// @3AE7: dup
		// @3AE8: getstatic game.C_100153_be[] game.C_100166_sg.field_105466_b
		// @3AEB: bipush 7 (0x07)
		// @3AED: aaload
		// @3AEE: sipush 138 (0x008A)
		// @3AF1: sipush 222 (0x00DE)
		// @3AF4: iconst_1
		// @3AF5: anewarray game.C_100049_vf
		// @3AF8: dup
		// @3AF9: iconst_0
		// @3AFA: new game.C_100049_vf
		// @3AFD: dup
		// @3AFE: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @3B01: bipush 76 (0x4C)
		// @3B03: aaload
		// @3B04: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @3B07: aastore
		// @3B08: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @3B0B: iconst_1
		// @3B0C: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @3B0F: aastore
		// @3B10: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @3B13: iconst_1
		// @3B14: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @3B17: aastore
		// @3B18: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @3B1B: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @3B1E: aastore
		// @3B1F: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @3B22: iconst_1
		// @3B23: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @3B26: aastore
		// @3B27: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @3B2A: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib)void
		// @3B2D: aastore
		// @3B2E: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, game.C_100049_vf[])void
		// @3B31: iconst_1
		// @3B32: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @3B35: aastore
		// @3B36: dup
		// @3B37: bipush 15 (0x0F)
		// @3B39: new game.C_100049_vf
		// @3B3C: dup
		// @3B3D: sipush 156 (0x009C)
		// @3B40: bipush 70 (0x46)
		// @3B42: sipush 17384 (0x43E8)
		// @3B45: sipush 6553 (0x1999)
		// @3B48: bipush 64 (0x40)
		// @3B4A: iconst_1
		// @3B4B: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @3B4E: aastore
		// @3B4F: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @3B52: astore_1
		// @3B53: aload_1
		// @3B54: bipush 92 (0x5C)
		// @3B56: putfield int game.C_100327_ib.field_102494_P
		// @3B59: iload_0
		// @3B5A: aload_1
		// @3B5B: invokestatic game.C_100226_ae.func_106142_a(boolean, game.C_100327_ib)game.C_100327_ib
		// @3B5E: astore_1
		// @3B5F: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @3B62: bipush 125 (0x7D)
		// @3B64: aload_1
		// @3B65: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @3B68: bipush 7 (0x07)
		// @3B6A: newarray int[]
		// @3B6C: dup
		// @3B6D: iconst_0
		// @3B6E: bipush 17 (0x11)
		// @3B70: iastore
		// @3B71: dup
		// @3B72: iconst_1
		// @3B73: bipush 18 (0x12)
		// @3B75: iastore
		// @3B76: dup
		// @3B77: iconst_2
		// @3B78: bipush 19 (0x13)
		// @3B7A: iastore
		// @3B7B: dup
		// @3B7C: iconst_3
		// @3B7D: bipush 20 (0x14)
		// @3B7F: iastore
		// @3B80: dup
		// @3B81: iconst_4
		// @3B82: bipush 21 (0x15)
		// @3B84: iastore
		// @3B85: dup
		// @3B86: iconst_5
		// @3B87: bipush 22 (0x16)
		// @3B89: iastore
		// @3B8A: dup
		// @3B8B: bipush 6 (0x06)
		// @3B8D: bipush 27 (0x1B)
		// @3B8F: iastore
		// @3B90: astore_2
		// @3B91: iconst_0
		// @3B92: istore_3
		// @3B93: aload_2
		// @3B94: arraylength
		// @3B95: iconst_m1
		// @3B96: ixor
		// @3B97: iload_3
		// @3B98: iconst_m1
		// @3B99: ixor
		// @3B9A: if_icmpge @3C03
		// @3B9D: new game.C_100327_ib
		// @3BA0: dup
		// @3BA1: getstatic game.C_100153_be[] game.C_100094_j.field_104554_h
		// @3BA4: aload_2
		// @3BA5: iload_3
		// @3BA6: iaload
		// @3BA7: bipush 28 (0x1C)
		// @3BA9: iadd
		// @3BAA: bipush -17 (0xEF)
		// @3BAC: iadd
		// @3BAD: aaload
		// @3BAE: bipush 16 (0x10)
		// @3BB0: bipush 32 (0x20)
		// @3BB2: bipush 39 (0x27)
		// @3BB4: iconst_0
		// @3BB5: sipush 1024 (0x0400)
		// @3BB8: iconst_2
		// @3BB9: anewarray game.C_100049_vf
		// @3BBC: dup
		// @3BBD: iconst_0
		// @3BBE: new game.C_100049_vf
		// @3BC1: dup
		// @3BC2: getstatic java.lang.String[] game.C_100230_of.field_106218_i
		// @3BC5: aload_2
		// @3BC6: iload_3
		// @3BC7: iaload
		// @3BC8: bipush 17 (0x11)
		// @3BCA: isub
		// @3BCB: aaload
		// @3BCC: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @3BCF: aastore
		// @3BD0: dup
		// @3BD1: iconst_1
		// @3BD2: new game.C_100049_vf
		// @3BD5: dup
		// @3BD6: iconst_0
		// @3BD7: iconst_0
		// @3BD8: bipush 10 (0x0A)
		// @3BDA: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @3BDD: aastore
		// @3BDE: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @3BE1: astore_1
		// @3BE2: aload_1
		// @3BE3: aload_2
		// @3BE4: iload_3
		// @3BE5: iaload
		// @3BE6: putfield int game.C_100327_ib.field_102494_P
		// @3BE9: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @3BEC: bipush 126 (0x7E)
		// @3BEE: aload_1
		// @3BEF: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @3BF2: iinc #3 +1
		// @3BF5: iload #4
		// @3BF7: ifne @3C16
		// @3BFA: iload #4
		// @3BFC: ifeq @3B93
		// @3BFF: goto @3C03
		// @3C02: athrow
		// @3C03: iconst_3
		// @3C04: newarray int[]
		// @3C06: dup
		// @3C07: iconst_0
		// @3C08: bipush 28 (0x1C)
		// @3C0A: iastore
		// @3C0B: dup
		// @3C0C: iconst_1
		// @3C0D: bipush 29 (0x1D)
		// @3C0F: iastore
		// @3C10: dup
		// @3C11: iconst_2
		// @3C12: bipush 30 (0x1E)
		// @3C14: iastore
		// @3C15: astore_2
		// @3C16: iconst_0
		// @3C17: istore_3
		// @3C18: aload_2
		// @3C19: arraylength
		// @3C1A: iconst_m1
		// @3C1B: ixor
		// @3C1C: iload_3
		// @3C1D: iconst_m1
		// @3C1E: ixor
		// @3C1F: if_icmpge @3C89
		// @3C22: new game.C_100327_ib
		// @3C25: dup
		// @3C26: getstatic game.C_100153_be[] game.C_100094_j.field_104554_h
		// @3C29: bipush 28 (0x1C)
		// @3C2B: aload_2
		// @3C2C: iload_3
		// @3C2D: iaload
		// @3C2E: ineg
		// @3C2F: bipush 17 (0x11)
		// @3C31: iadd
		// @3C32: isub
		// @3C33: aaload
		// @3C34: bipush 32 (0x20)
		// @3C36: bipush 32 (0x20)
		// @3C38: bipush 32 (0x20)
		// @3C3A: iconst_0
		// @3C3B: sipush 1024 (0x0400)
		// @3C3E: iconst_2
		// @3C3F: anewarray game.C_100049_vf
		// @3C42: dup
		// @3C43: iconst_0
		// @3C44: new game.C_100049_vf
		// @3C47: dup
		// @3C48: getstatic java.lang.String[] game.C_100230_of.field_106218_i
		// @3C4B: aload_2
		// @3C4C: iload_3
		// @3C4D: iaload
		// @3C4E: bipush -17 (0xEF)
		// @3C50: iadd
		// @3C51: aaload
		// @3C52: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @3C55: aastore
		// @3C56: dup
		// @3C57: iconst_1
		// @3C58: new game.C_100049_vf
		// @3C5B: dup
		// @3C5C: iconst_0
		// @3C5D: iconst_0
		// @3C5E: bipush 35 (0x23)
		// @3C60: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @3C63: aastore
		// @3C64: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @3C67: astore_1
		// @3C68: aload_1
		// @3C69: aload_2
		// @3C6A: iload_3
		// @3C6B: iaload
		// @3C6C: putfield int game.C_100327_ib.field_102494_P
		// @3C6F: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @3C72: bipush 126 (0x7E)
		// @3C74: aload_1
		// @3C75: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @3C78: iinc #3 +1
		// @3C7B: iload #4
		// @3C7D: ifne @3CA1
		// @3C80: iload #4
		// @3C82: ifeq @3C18
		// @3C85: goto @3C89
		// @3C88: athrow
		// @3C89: iconst_4
		// @3C8A: newarray int[]
		// @3C8C: dup
		// @3C8D: iconst_0
		// @3C8E: bipush 23 (0x17)
		// @3C90: iastore
		// @3C91: dup
		// @3C92: iconst_1
		// @3C93: bipush 24 (0x18)
		// @3C95: iastore
		// @3C96: dup
		// @3C97: iconst_2
		// @3C98: bipush 25 (0x19)
		// @3C9A: iastore
		// @3C9B: dup
		// @3C9C: iconst_3
		// @3C9D: bipush 26 (0x1A)
		// @3C9F: iastore
		// @3CA0: astore_2
		// @3CA1: iconst_0
		// @3CA2: istore_3
		// @3CA3: iload_3
		// @3CA4: iconst_m1
		// @3CA5: ixor
		// @3CA6: aload_2
		// @3CA7: arraylength
		// @3CA8: iconst_m1
		// @3CA9: ixor
		// @3CAA: if_icmple @3D14
		// @3CAD: new game.C_100327_ib
		// @3CB0: dup
		// @3CB1: getstatic game.C_100153_be[] game.C_100094_j.field_104554_h
		// @3CB4: bipush -17 (0xEF)
		// @3CB6: bipush 28 (0x1C)
		// @3CB8: aload_2
		// @3CB9: iload_3
		// @3CBA: iaload
		// @3CBB: iadd
		// @3CBC: iadd
		// @3CBD: aaload
		// @3CBE: sipush 128 (0x0080)
		// @3CC1: bipush 32 (0x20)
		// @3CC3: bipush 27 (0x1B)
		// @3CC5: iconst_0
		// @3CC6: sipush 1024 (0x0400)
		// @3CC9: iconst_2
		// @3CCA: anewarray game.C_100049_vf
		// @3CCD: dup
		// @3CCE: iconst_0
		// @3CCF: new game.C_100049_vf
		// @3CD2: dup
		// @3CD3: getstatic java.lang.String[] game.C_100230_of.field_106218_i
		// @3CD6: aload_2
		// @3CD7: iload_3
		// @3CD8: iaload
		// @3CD9: bipush -17 (0xEF)
		// @3CDB: iadd
		// @3CDC: aaload
		// @3CDD: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @3CE0: aastore
		// @3CE1: dup
		// @3CE2: iconst_1
		// @3CE3: new game.C_100049_vf
		// @3CE6: dup
		// @3CE7: iconst_0
		// @3CE8: iconst_0
		// @3CE9: bipush 10 (0x0A)
		// @3CEB: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @3CEE: aastore
		// @3CEF: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @3CF2: astore_1
		// @3CF3: aload_1
		// @3CF4: aload_2
		// @3CF5: iload_3
		// @3CF6: iaload
		// @3CF7: putfield int game.C_100327_ib.field_102494_P
		// @3CFA: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @3CFD: bipush 127 (0x7F)
		// @3CFF: aload_1
		// @3D00: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @3D03: iinc #3 +1
		// @3D06: iload #4
		// @3D08: ifne @3D2C
		// @3D0B: iload #4
		// @3D0D: ifeq @3CA3
		// @3D10: goto @3D14
		// @3D13: athrow
		// @3D14: iconst_4
		// @3D15: newarray int[]
		// @3D17: dup
		// @3D18: iconst_0
		// @3D19: bipush 36 (0x24)
		// @3D1B: iastore
		// @3D1C: dup
		// @3D1D: iconst_1
		// @3D1E: bipush 37 (0x25)
		// @3D20: iastore
		// @3D21: dup
		// @3D22: iconst_2
		// @3D23: bipush 51 (0x33)
		// @3D25: iastore
		// @3D26: dup
		// @3D27: iconst_3
		// @3D28: bipush 50 (0x32)
		// @3D2A: iastore
		// @3D2B: astore_2
		// @3D2C: iconst_0
		// @3D2D: istore_3
		// @3D2E: aload_2
		// @3D2F: arraylength
		// @3D30: iconst_m1
		// @3D31: ixor
		// @3D32: iload_3
		// @3D33: iconst_m1
		// @3D34: ixor
		// @3D35: if_icmpge @3DB9
		// @3D38: iload #4
		// @3D3A: ifne @41CD
		// @3D3D: new game.C_100327_ib
		// @3D40: dup
		// @3D41: getstatic game.C_100153_be[] game.C_100094_j.field_104554_h
		// @3D44: aload_2
		// @3D45: iload_3
		// @3D46: iaload
		// @3D47: bipush 11 (0x0B)
		// @3D49: iadd
		// @3D4A: aaload
		// @3D4B: sipush 256 (0x0100)
		// @3D4E: bipush 32 (0x20)
		// @3D50: bipush 22 (0x16)
		// @3D52: iconst_0
		// @3D53: sipush 1024 (0x0400)
		// @3D56: iconst_2
		// @3D57: anewarray game.C_100049_vf
		// @3D5A: dup
		// @3D5B: iconst_0
		// @3D5C: new game.C_100049_vf
		// @3D5F: dup
		// @3D60: getstatic java.lang.String[] game.C_100230_of.field_106218_i
		// @3D63: bipush -17 (0xEF)
		// @3D65: aload_2
		// @3D66: iload_3
		// @3D67: iaload
		// @3D68: iadd
		// @3D69: aaload
		// @3D6A: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @3D6D: aastore
		// @3D6E: dup
		// @3D6F: iconst_1
		// @3D70: new game.C_100049_vf
		// @3D73: dup
		// @3D74: iconst_0
		// @3D75: iconst_0
		// @3D76: aload_2
		// @3D77: iload_3
		// @3D78: iaload
		// @3D79: bipush 50 (0x32)
		// @3D7B: if_icmpne @3D88
		// @3D7E: goto @3D82
		// @3D81: athrow
		// @3D82: sipush 500 (0x01F4)
		// @3D85: goto @3D99
		// @3D88: aload_2
		// @3D89: iload_3
		// @3D8A: iaload
		// @3D8B: iconst_m1
		// @3D8C: ixor
		// @3D8D: bipush -38 (0xDA)
		// @3D8F: if_icmpeq @3D97
		// @3D92: bipush 100 (0x64)
		// @3D94: goto @3D99
		// @3D97: bipush 50 (0x32)
		// @3D99: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @3D9C: aastore
		// @3D9D: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @3DA0: astore_1
		// @3DA1: aload_1
		// @3DA2: aload_2
		// @3DA3: iload_3
		// @3DA4: iaload
		// @3DA5: putfield int game.C_100327_ib.field_102494_P
		// @3DA8: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @3DAB: bipush 124 (0x7C)
		// @3DAD: aload_1
		// @3DAE: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @3DB1: iinc #3 +1
		// @3DB4: iload #4
		// @3DB6: ifeq @3D2E
		// @3DB9: new game.C_100327_ib
		// @3DBC: dup
		// @3DBD: getstatic game.C_100153_be[] game.C_100166_sg.field_105465_e
		// @3DC0: iconst_5
		// @3DC1: aaload
		// @3DC2: sipush 512 (0x0200)
		// @3DC5: bipush 64 (0x40)
		// @3DC7: bipush 64 (0x40)
		// @3DC9: iconst_0
		// @3DCA: sipush 1024 (0x0400)
		// @3DCD: iconst_2
		// @3DCE: anewarray game.C_100049_vf
		// @3DD1: dup
		// @3DD2: iconst_0
		// @3DD3: new game.C_100049_vf
		// @3DD6: dup
		// @3DD7: getstatic java.lang.String[] game.C_100230_of.field_106218_i
		// @3DDA: bipush 32 (0x20)
		// @3DDC: aaload
		// @3DDD: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @3DE0: aastore
		// @3DE1: dup
		// @3DE2: iconst_1
		// @3DE3: new game.C_100049_vf
		// @3DE6: dup
		// @3DE7: iconst_0
		// @3DE8: iconst_0
		// @3DE9: sipush 1000 (0x03E8)
		// @3DEC: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @3DEF: aastore
		// @3DF0: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @3DF3: astore_1
		// @3DF4: aload_1
		// @3DF5: bipush 49 (0x31)
		// @3DF7: putfield int game.C_100327_ib.field_102494_P
		// @3DFA: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @3DFD: bipush 127 (0x7F)
		// @3DFF: aload_1
		// @3E00: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @3E03: new game.C_100327_ib
		// @3E06: dup
		// @3E07: getstatic game.C_100153_be[] game.C_100186_rl.field_105725_c
		// @3E0A: bipush 8 (0x08)
		// @3E0C: aaload
		// @3E0D: bipush 32 (0x20)
		// @3E0F: bipush 64 (0x40)
		// @3E11: bipush 96 (0x60)
		// @3E13: iconst_0
		// @3E14: sipush 1024 (0x0400)
		// @3E17: iconst_2
		// @3E18: anewarray game.C_100049_vf
		// @3E1B: dup
		// @3E1C: iconst_0
		// @3E1D: new game.C_100049_vf
		// @3E20: dup
		// @3E21: getstatic java.lang.String[] game.C_100230_of.field_106218_i
		// @3E24: bipush 14 (0x0E)
		// @3E26: aaload
		// @3E27: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @3E2A: aastore
		// @3E2B: dup
		// @3E2C: iconst_1
		// @3E2D: new game.C_100049_vf
		// @3E30: dup
		// @3E31: iconst_0
		// @3E32: iconst_0
		// @3E33: bipush 100 (0x64)
		// @3E35: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @3E38: aastore
		// @3E39: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @3E3C: astore_1
		// @3E3D: aload_1
		// @3E3E: bipush 31 (0x1F)
		// @3E40: putfield int game.C_100327_ib.field_102494_P
		// @3E43: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @3E46: bipush 125 (0x7D)
		// @3E48: aload_1
		// @3E49: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @3E4C: new game.C_100327_ib
		// @3E4F: dup
		// @3E50: getstatic game.C_100153_be[] game.C_100042_we.field_104138_j
		// @3E53: iconst_2
		// @3E54: aaload
		// @3E55: bipush 32 (0x20)
		// @3E57: bipush 98 (0x62)
		// @3E59: sipush 144 (0x0090)
		// @3E5C: iconst_0
		// @3E5D: sipush 1024 (0x0400)
		// @3E60: iconst_2
		// @3E61: anewarray game.C_100049_vf
		// @3E64: dup
		// @3E65: iconst_0
		// @3E66: new game.C_100049_vf
		// @3E69: dup
		// @3E6A: getstatic java.lang.String[] game.C_100230_of.field_106218_i
		// @3E6D: bipush 18 (0x12)
		// @3E6F: aaload
		// @3E70: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @3E73: aastore
		// @3E74: dup
		// @3E75: iconst_1
		// @3E76: new game.C_100049_vf
		// @3E79: dup
		// @3E7A: iconst_0
		// @3E7B: iconst_0
		// @3E7C: bipush 100 (0x64)
		// @3E7E: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @3E81: aastore
		// @3E82: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @3E85: astore_1
		// @3E86: aload_1
		// @3E87: bipush 35 (0x23)
		// @3E89: putfield int game.C_100327_ib.field_102494_P
		// @3E8C: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @3E8F: bipush 127 (0x7F)
		// @3E91: aload_1
		// @3E92: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @3E95: new game.C_100327_ib
		// @3E98: dup
		// @3E99: getstatic game.C_100153_be[] game.C_100313_lg.field_107166_b
		// @3E9C: bipush 8 (0x08)
		// @3E9E: aaload
		// @3E9F: bipush 32 (0x20)
		// @3EA1: bipush 80 (0x50)
		// @3EA3: bipush 69 (0x45)
		// @3EA5: iconst_0
		// @3EA6: sipush 1024 (0x0400)
		// @3EA9: iconst_2
		// @3EAA: anewarray game.C_100049_vf
		// @3EAD: dup
		// @3EAE: iconst_0
		// @3EAF: new game.C_100049_vf
		// @3EB2: dup
		// @3EB3: getstatic java.lang.String[] game.C_100230_of.field_106218_i
		// @3EB6: bipush 15 (0x0F)
		// @3EB8: aaload
		// @3EB9: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @3EBC: aastore
		// @3EBD: dup
		// @3EBE: iconst_1
		// @3EBF: new game.C_100049_vf
		// @3EC2: dup
		// @3EC3: iconst_0
		// @3EC4: iconst_0
		// @3EC5: bipush 100 (0x64)
		// @3EC7: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @3ECA: aastore
		// @3ECB: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @3ECE: astore_1
		// @3ECF: aload_1
		// @3ED0: bipush 32 (0x20)
		// @3ED2: putfield int game.C_100327_ib.field_102494_P
		// @3ED5: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @3ED8: bipush 127 (0x7F)
		// @3EDA: aload_1
		// @3EDB: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @3EDE: new game.C_100327_ib
		// @3EE1: dup
		// @3EE2: getstatic game.C_100153_be[] game.C_100281_ng.field_103462_H
		// @3EE5: bipush 11 (0x0B)
		// @3EE7: aaload
		// @3EE8: bipush 32 (0x20)
		// @3EEA: bipush 59 (0x3B)
		// @3EEC: bipush 65 (0x41)
		// @3EEE: iconst_0
		// @3EEF: sipush 1024 (0x0400)
		// @3EF2: iconst_2
		// @3EF3: anewarray game.C_100049_vf
		// @3EF6: dup
		// @3EF7: iconst_0
		// @3EF8: new game.C_100049_vf
		// @3EFB: dup
		// @3EFC: getstatic java.lang.String[] game.C_100230_of.field_106218_i
		// @3EFF: bipush 16 (0x10)
		// @3F01: aaload
		// @3F02: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @3F05: aastore
		// @3F06: dup
		// @3F07: iconst_1
		// @3F08: new game.C_100049_vf
		// @3F0B: dup
		// @3F0C: iconst_0
		// @3F0D: iconst_0
		// @3F0E: bipush 100 (0x64)
		// @3F10: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @3F13: aastore
		// @3F14: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @3F17: astore_1
		// @3F18: aload_1
		// @3F19: bipush 33 (0x21)
		// @3F1B: putfield int game.C_100327_ib.field_102494_P
		// @3F1E: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @3F21: bipush 127 (0x7F)
		// @3F23: aload_1
		// @3F24: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @3F27: new game.C_100327_ib
		// @3F2A: dup
		// @3F2B: getstatic game.C_100153_be[] game.C_100217_ao.field_106045_i
		// @3F2E: bipush 14 (0x0E)
		// @3F30: aaload
		// @3F31: bipush 32 (0x20)
		// @3F33: bipush 49 (0x31)
		// @3F35: bipush 52 (0x34)
		// @3F37: iconst_0
		// @3F38: sipush 1024 (0x0400)
		// @3F3B: iconst_2
		// @3F3C: anewarray game.C_100049_vf
		// @3F3F: dup
		// @3F40: iconst_0
		// @3F41: new game.C_100049_vf
		// @3F44: dup
		// @3F45: getstatic java.lang.String[] game.C_100230_of.field_106218_i
		// @3F48: bipush 17 (0x11)
		// @3F4A: aaload
		// @3F4B: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @3F4E: aastore
		// @3F4F: dup
		// @3F50: iconst_1
		// @3F51: new game.C_100049_vf
		// @3F54: dup
		// @3F55: iconst_0
		// @3F56: iconst_0
		// @3F57: bipush 100 (0x64)
		// @3F59: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @3F5C: aastore
		// @3F5D: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @3F60: astore_1
		// @3F61: aload_1
		// @3F62: bipush 34 (0x22)
		// @3F64: putfield int game.C_100327_ib.field_102494_P
		// @3F67: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @3F6A: bipush 123 (0x7B)
		// @3F6C: aload_1
		// @3F6D: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @3F70: new game.C_100327_ib
		// @3F73: dup
		// @3F74: getstatic game.C_100153_be[] game.C_100092_um.field_104534_a
		// @3F77: bipush 9 (0x09)
		// @3F79: aaload
		// @3F7A: bipush 32 (0x20)
		// @3F7C: sipush 132 (0x0084)
		// @3F7F: bipush 124 (0x7C)
		// @3F81: iconst_0
		// @3F82: sipush 1024 (0x0400)
		// @3F85: iconst_2
		// @3F86: anewarray game.C_100049_vf
		// @3F89: dup
		// @3F8A: iconst_0
		// @3F8B: new game.C_100049_vf
		// @3F8E: dup
		// @3F8F: getstatic java.lang.String[] game.C_100230_of.field_106218_i
		// @3F92: bipush 21 (0x15)
		// @3F94: aaload
		// @3F95: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @3F98: aastore
		// @3F99: dup
		// @3F9A: iconst_1
		// @3F9B: new game.C_100049_vf
		// @3F9E: dup
		// @3F9F: iconst_0
		// @3FA0: iconst_0
		// @3FA1: bipush 100 (0x64)
		// @3FA3: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @3FA6: aastore
		// @3FA7: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @3FAA: astore_1
		// @3FAB: aload_1
		// @3FAC: bipush 38 (0x26)
		// @3FAE: putfield int game.C_100327_ib.field_102494_P
		// @3FB1: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @3FB4: bipush 125 (0x7D)
		// @3FB6: aload_1
		// @3FB7: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @3FBA: new game.C_100327_ib
		// @3FBD: dup
		// @3FBE: getstatic game.C_100153_be[] game.C_100217_ao.field_106045_i
		// @3FC1: bipush 13 (0x0D)
		// @3FC3: aaload
		// @3FC4: bipush 64 (0x40)
		// @3FC6: bipush 65 (0x41)
		// @3FC8: bipush 96 (0x60)
		// @3FCA: iconst_0
		// @3FCB: sipush 1024 (0x0400)
		// @3FCE: iconst_2
		// @3FCF: anewarray game.C_100049_vf
		// @3FD2: dup
		// @3FD3: iconst_0
		// @3FD4: new game.C_100049_vf
		// @3FD7: dup
		// @3FD8: getstatic java.lang.String[] game.C_100230_of.field_106218_i
		// @3FDB: bipush 26 (0x1A)
		// @3FDD: aaload
		// @3FDE: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @3FE1: aastore
		// @3FE2: dup
		// @3FE3: iconst_1
		// @3FE4: new game.C_100049_vf
		// @3FE7: dup
		// @3FE8: iconst_0
		// @3FE9: iconst_0
		// @3FEA: sipush 500 (0x01F4)
		// @3FED: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @3FF0: aastore
		// @3FF1: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @3FF4: astore_1
		// @3FF5: aload_1
		// @3FF6: bipush 43 (0x2B)
		// @3FF8: putfield int game.C_100327_ib.field_102494_P
		// @3FFB: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @3FFE: bipush 124 (0x7C)
		// @4000: aload_1
		// @4001: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @4004: new game.C_100327_ib
		// @4007: dup
		// @4008: getstatic game.C_100153_be[] game.C_100166_sg.field_105466_b
		// @400B: bipush 15 (0x0F)
		// @400D: aaload
		// @400E: bipush 64 (0x40)
		// @4010: bipush 115 (0x73)
		// @4012: sipush 157 (0x009D)
		// @4015: iconst_0
		// @4016: sipush 1024 (0x0400)
		// @4019: iconst_2
		// @401A: anewarray game.C_100049_vf
		// @401D: dup
		// @401E: iconst_0
		// @401F: new game.C_100049_vf
		// @4022: dup
		// @4023: getstatic java.lang.String[] game.C_100230_of.field_106218_i
		// @4026: bipush 31 (0x1F)
		// @4028: aaload
		// @4029: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @402C: aastore
		// @402D: dup
		// @402E: iconst_1
		// @402F: new game.C_100049_vf
		// @4032: dup
		// @4033: iconst_0
		// @4034: iconst_0
		// @4035: sipush 500 (0x01F4)
		// @4038: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @403B: aastore
		// @403C: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @403F: astore_1
		// @4040: aload_1
		// @4041: bipush 48 (0x30)
		// @4043: putfield int game.C_100327_ib.field_102494_P
		// @4046: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @4049: bipush 126 (0x7E)
		// @404B: aload_1
		// @404C: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @404F: new game.C_100327_ib
		// @4052: dup
		// @4053: getstatic game.C_100153_be[] game.C_100166_sg.field_105466_b
		// @4056: iconst_0
		// @4057: aaload
		// @4058: bipush 64 (0x40)
		// @405A: sipush 143 (0x008F)
		// @405D: sipush 152 (0x0098)
		// @4060: iconst_0
		// @4061: sipush 1024 (0x0400)
		// @4064: iconst_2
		// @4065: anewarray game.C_100049_vf
		// @4068: dup
		// @4069: iconst_0
		// @406A: new game.C_100049_vf
		// @406D: dup
		// @406E: getstatic java.lang.String[] game.C_100230_of.field_106218_i
		// @4071: bipush 35 (0x23)
		// @4073: aaload
		// @4074: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @4077: aastore
		// @4078: dup
		// @4079: iconst_1
		// @407A: new game.C_100049_vf
		// @407D: dup
		// @407E: iconst_0
		// @407F: iconst_0
		// @4080: sipush 500 (0x01F4)
		// @4083: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @4086: aastore
		// @4087: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @408A: astore_1
		// @408B: aload_1
		// @408C: bipush 52 (0x34)
		// @408E: putfield int game.C_100327_ib.field_102494_P
		// @4091: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @4094: bipush 125 (0x7D)
		// @4096: aload_1
		// @4097: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @409A: new game.C_100327_ib
		// @409D: dup
		// @409E: getstatic game.C_100153_be[] game.C_100042_we.field_104138_j
		// @40A1: bipush 6 (0x06)
		// @40A3: aaload
		// @40A4: bipush 64 (0x40)
		// @40A6: bipush 39 (0x27)
		// @40A8: bipush 127 (0x7F)
		// @40AA: iconst_0
		// @40AB: sipush 1024 (0x0400)
		// @40AE: iconst_2
		// @40AF: anewarray game.C_100049_vf
		// @40B2: dup
		// @40B3: iconst_0
		// @40B4: new game.C_100049_vf
		// @40B7: dup
		// @40B8: getstatic java.lang.String[] game.C_100230_of.field_106218_i
		// @40BB: bipush 29 (0x1D)
		// @40BD: aaload
		// @40BE: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @40C1: aastore
		// @40C2: dup
		// @40C3: iconst_1
		// @40C4: new game.C_100049_vf
		// @40C7: dup
		// @40C8: iconst_0
		// @40C9: iconst_0
		// @40CA: sipush 500 (0x01F4)
		// @40CD: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @40D0: aastore
		// @40D1: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @40D4: astore_1
		// @40D5: aload_1
		// @40D6: bipush 46 (0x2E)
		// @40D8: putfield int game.C_100327_ib.field_102494_P
		// @40DB: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @40DE: bipush 125 (0x7D)
		// @40E0: aload_1
		// @40E1: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @40E4: new game.C_100327_ib
		// @40E7: dup
		// @40E8: getstatic game.C_100153_be[] game.C_100154_sl.field_105331_d
		// @40EB: bipush 15 (0x0F)
		// @40ED: aaload
		// @40EE: bipush 64 (0x40)
		// @40F0: sipush 147 (0x0093)
		// @40F3: sipush 168 (0x00A8)
		// @40F6: iconst_0
		// @40F7: sipush 1024 (0x0400)
		// @40FA: iconst_2
		// @40FB: anewarray game.C_100049_vf
		// @40FE: dup
		// @40FF: iconst_0
		// @4100: new game.C_100049_vf
		// @4103: dup
		// @4104: getstatic java.lang.String[] game.C_100230_of.field_106218_i
		// @4107: bipush 28 (0x1C)
		// @4109: aaload
		// @410A: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @410D: aastore
		// @410E: dup
		// @410F: iconst_1
		// @4110: new game.C_100049_vf
		// @4113: dup
		// @4114: iconst_0
		// @4115: iconst_0
		// @4116: sipush 500 (0x01F4)
		// @4119: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @411C: aastore
		// @411D: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @4120: astore_1
		// @4121: aload_1
		// @4122: bipush 45 (0x2D)
		// @4124: putfield int game.C_100327_ib.field_102494_P
		// @4127: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @412A: bipush 123 (0x7B)
		// @412C: aload_1
		// @412D: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @4130: new game.C_100327_ib
		// @4133: dup
		// @4134: getstatic game.C_100153_be[] game.C_100092_um.field_104534_a
		// @4137: iconst_4
		// @4138: aaload
		// @4139: bipush 64 (0x40)
		// @413B: bipush 114 (0x72)
		// @413D: sipush 145 (0x0091)
		// @4140: iconst_0
		// @4141: sipush 1024 (0x0400)
		// @4144: iconst_2
		// @4145: anewarray game.C_100049_vf
		// @4148: dup
		// @4149: iconst_0
		// @414A: new game.C_100049_vf
		// @414D: dup
		// @414E: getstatic java.lang.String[] game.C_100230_of.field_106218_i
		// @4151: bipush 27 (0x1B)
		// @4153: aaload
		// @4154: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @4157: aastore
		// @4158: dup
		// @4159: iconst_1
		// @415A: new game.C_100049_vf
		// @415D: dup
		// @415E: iconst_0
		// @415F: iconst_0
		// @4160: sipush 500 (0x01F4)
		// @4163: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @4166: aastore
		// @4167: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @416A: astore_1
		// @416B: aload_1
		// @416C: bipush 44 (0x2C)
		// @416E: putfield int game.C_100327_ib.field_102494_P
		// @4171: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @4174: bipush 123 (0x7B)
		// @4176: aload_1
		// @4177: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @417A: new game.C_100327_ib
		// @417D: dup
		// @417E: getstatic game.C_100153_be[] game.C_100006_fj.field_103620_b
		// @4181: bipush 12 (0x0C)
		// @4183: aaload
		// @4184: bipush 64 (0x40)
		// @4186: bipush 117 (0x75)
		// @4188: sipush 140 (0x008C)
		// @418B: iconst_0
		// @418C: sipush 1024 (0x0400)
		// @418F: iconst_2
		// @4190: anewarray game.C_100049_vf
		// @4193: dup
		// @4194: iconst_0
		// @4195: new game.C_100049_vf
		// @4198: dup
		// @4199: getstatic java.lang.String[] game.C_100230_of.field_106218_i
		// @419C: bipush 30 (0x1E)
		// @419E: aaload
		// @419F: invokespecial game.C_100049_vf.<init>(java.lang.String)void
		// @41A2: aastore
		// @41A3: dup
		// @41A4: iconst_1
		// @41A5: new game.C_100049_vf
		// @41A8: dup
		// @41A9: iconst_0
		// @41AA: iconst_0
		// @41AB: sipush 500 (0x01F4)
		// @41AE: invokespecial game.C_100049_vf.<init>(int, int, int)void
		// @41B1: aastore
		// @41B2: invokespecial game.C_100327_ib.<init>(game.C_100153_be, int, int, int, int, int, game.C_100049_vf[])void
		// @41B5: astore_1
		// @41B6: aload_1
		// @41B7: bipush 47 (0x2F)
		// @41B9: putfield int game.C_100327_ib.field_102494_P
		// @41BC: getstatic game.C_100202_qi game.C_100094_j.field_104551_a
		// @41BF: bipush 125 (0x7D)
		// @41C1: aload_1
		// @41C2: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @41C5: bipush 110 (0x6E)
		// @41C7: anewarray game.C_100327_ib
		// @41CA: putstatic game.C_100327_ib[] game.C_100057_dd.field_104262_i
		// @41CD: iconst_0
		// @41CE: istore_3
		// @41CF: iload_3
		// @41D0: bipush 110 (0x6E)
		// @41D2: if_icmpge @41F1
		// @41D5: getstatic game.C_100327_ib[] game.C_100057_dd.field_104262_i
		// @41D8: iload_3
		// @41D9: iload_3
		// @41DA: bipush 124 (0x7C)
		// @41DC: invokestatic game.C_100209_qb.func_102686_b(int, byte)game.C_100327_ib
		// @41DF: aastore
		// @41E0: iinc #3 +1
		// @41E3: iload #4
		// @41E5: ifne @4216
		// @41E8: iload #4
		// @41EA: ifeq @41CF
		// @41ED: goto @41F1
		// @41F0: athrow
		// @41F1: goto @4216
		// @41F4: astore_1
		// @41F5: aload_1
		// @41F6: new java.lang.StringBuilder
		// @41F9: dup
		// @41FA: invokespecial java.lang.StringBuilder.<init>()void
		// @41FD: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @4200: bipush 87 (0x57)
		// @4202: aaload
		// @4203: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4206: iload_0
		// @4207: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @420A: bipush 41 (0x29)
		// @420C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @420F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4212: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4215: athrow
		// @4216: return
	}
	
	static final void func_101231_a(String arg0, byte arg1, C_100037_wb arg2)
	{
		// @00: aload_0
		// @01: putstatic java.lang.String game.C_100245_pf.field_106387_e
		// @04: iload_1
		// @05: bipush -40 (0xD8)
		// @07: if_icmpeq @15
		// @0A: aconst_null
		// @0B: checkcast game.C_100133_tk
		// @0E: putstatic game.C_100133_tk game.C_100297_kf.field_101234_s
		// @11: goto @15
		// @14: athrow
		// @15: aload_2
		// @16: putstatic game.C_100037_wb game.C_100131_te.field_100759_n
		// @19: goto @71
		// @1C: astore_3
		// @1D: aload_3
		// @1E: new java.lang.StringBuilder
		// @21: dup
		// @22: invokespecial java.lang.StringBuilder.<init>()void
		// @25: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @28: iconst_0
		// @29: aaload
		// @2A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2D: aload_0
		// @2E: ifnull @3A
		// @31: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @34: iconst_1
		// @35: aaload
		// @36: goto @3F
		// @39: athrow
		// @3A: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @3D: iconst_2
		// @3E: aaload
		// @3F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @42: bipush 44 (0x2C)
		// @44: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @47: iload_1
		// @48: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4B: bipush 44 (0x2C)
		// @4D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @50: aload_2
		// @51: ifnull @5D
		// @54: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @57: iconst_1
		// @58: aaload
		// @59: goto @62
		// @5C: athrow
		// @5D: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @60: iconst_2
		// @61: aaload
		// @62: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @65: bipush 41 (0x29)
		// @67: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @6D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @70: athrow
		// @71: return
	}
	
	C_100297_kf(int arg0, int arg1, int arg2, int arg3, int arg4)
	{
		// @00: aload_0
		// @01: invokespecial game.C_100158_da.<init>()void
		// @04: aload_0
		// @05: iload_1
		// @06: putfield int game.C_100297_kf.field_101236_q
		// @09: aload_0
		// @0A: iload_2
		// @0B: putfield int game.C_100297_kf.field_101241_m
		// @0E: aload_0
		// @0F: iload #4
		// @11: putfield int game.C_100297_kf.field_101239_o
		// @14: aload_0
		// @15: iload_3
		// @16: putfield int game.C_100297_kf.field_101242_j
		// @19: aload_0
		// @1A: iload #5
		// @1C: putfield int game.C_100297_kf.field_101235_r
		// @1F: goto @6B
		// @22: astore #6
		// @24: aload #6
		// @26: new java.lang.StringBuilder
		// @29: dup
		// @2A: invokespecial java.lang.StringBuilder.<init>()void
		// @2D: getstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @30: iconst_4
		// @31: aaload
		// @32: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @35: iload_1
		// @36: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @39: bipush 44 (0x2C)
		// @3B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3E: iload_2
		// @3F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @42: bipush 44 (0x2C)
		// @44: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @47: iload_3
		// @48: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4B: bipush 44 (0x2C)
		// @4D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @50: iload #4
		// @52: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @55: bipush 44 (0x2C)
		// @57: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5A: iload #5
		// @5C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5F: bipush 41 (0x29)
		// @61: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @64: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @67: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @6A: athrow
		// @6B: return
	}
	
	static
	{
		// @000: sipush 134 (0x0086)
		// @003: anewarray java.lang.String
		// @006: dup
		// @007: iconst_0
		// @008: ldc "iV\u0014H\u000b"
		// @00A: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @00D: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @010: aastore
		// @011: dup
		// @012: iconst_1
		// @013: ldc "y\u001e\u0014 ^"
		// @015: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @018: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @01B: aastore
		// @01C: dup
		// @01D: iconst_2
		// @01E: ldc "lEVb"
		// @020: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @023: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @026: aastore
		// @027: dup
		// @028: iconst_3
		// @029: ldc "iV\u0014L\u000b"
		// @02B: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @02E: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @031: aastore
		// @032: dup
		// @033: iconst_4
		// @034: ldc "iV\u00142JlYN0\u000b"
		// @036: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @039: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @03C: aastore
		// @03D: dup
		// @03E: iconst_5
		// @03F: ldc "Q\\[xF\"sRoPqYI"
		// @041: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @044: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @047: aastore
		// @048: dup
		// @049: bipush 6 (0x06)
		// @04B: ldc "TQVfBn\\[.tk^]"
		// @04D: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @050: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @053: aastore
		// @054: dup
		// @055: bipush 7 (0x07)
		// @057: ldc "J_LkQ\"tHaMg\u0010xaG{\u0010\u0017.wJyi.pJ\u007foBg\"~\u007fXfP\u0010\u007fXfP\u0010\u007fXfP\u0010xK\u0003Qu\u007f@"
		// @059: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @05C: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @05F: aastore
		// @060: dup
		// @061: bipush 8 (0x08)
		// @063: ldc "@QXkO\"r[mH\"QHc"
		// @065: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @068: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @06B: aastore
		// @06C: dup
		// @06D: bipush 9 (0x09)
		// @06F: ldc "ABO}KgB\u001aMKcCIgP"
		// @071: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @074: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @077: aastore
		// @078: dup
		// @079: bipush 10 (0x0A)
		// @07B: ldc "A_WcBlTU.kgQ^"
		// @07D: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @080: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @083: aastore
		// @084: dup
		// @085: bipush 11 (0x0B)
		// @087: ldc "ABO}KgB\u001aYJlW"
		// @089: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @08C: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @08F: aastore
		// @090: dup
		// @091: bipush 12 (0x0C)
		// @093: ldc "Qs"
		// @095: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @098: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @09B: aastore
		// @09C: dup
		// @09D: bipush 13 (0x0D)
		// @09F: ldc "A\u0001"
		// @0A1: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @0A4: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @0A7: aastore
		// @0A8: dup
		// @0A9: bipush 14 (0x0E)
		// @0AB: ldc "@\u0007"
		// @0AD: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @0B0: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @0B3: aastore
		// @0B4: dup
		// @0B5: bipush 15 (0x0F)
		// @0B7: ldc "D\u0003"
		// @0B9: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @0BC: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @0BF: aastore
		// @0C0: dup
		// @0C1: bipush 16 (0x10)
		// @0C3: ldc "@QYe\u0012NU]"
		// @0C5: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @0C8: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @0CB: aastore
		// @0CC: dup
		// @0CD: bipush 17 (0x11)
		// @0CF: ldc "Rs"
		// @0D1: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @0D4: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @0D7: aastore
		// @0D8: dup
		// @0D9: bipush 18 (0x12)
		// @0DB: ldc "@QXkO\"x_oG"
		// @0DD: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @0E0: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @0E3: aastore
		// @0E4: dup
		// @0E5: bipush 19 (0x13)
		// @0E7: ldc "Q\\[xF\"x_oG"
		// @0E9: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @0EC: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @0EF: aastore
		// @0F0: dup
		// @0F1: bipush 20 (0x14)
		// @0F3: ldc "ABO}KgB\u001aCLw^NgMe"
		// @0F5: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @0F8: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @0FB: aastore
		// @0FC: dup
		// @0FD: bipush 21 (0x15)
		// @0FF: ldc "@\u0002"
		// @101: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @104: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @107: aastore
		// @108: dup
		// @109: bipush 22 (0x16)
		// @10B: ldc "Or\u000b"
		// @10D: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @110: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @113: aastore
		// @114: dup
		// @115: bipush 23 (0x17)
		// @117: ldc "@\u0006"
		// @119: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @11C: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @11F: aastore
		// @120: dup
		// @121: bipush 24 (0x18)
		// @123: ldc "CWRgOnQ\u001a]KmEVjFp"
		// @125: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @128: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @12B: aastore
		// @12C: dup
		// @12D: bipush 25 (0x19)
		// @12F: ldc "A\u0007"
		// @131: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @134: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @137: aastore
		// @138: dup
		// @139: bipush 26 (0x1A)
		// @13B: ldc "Ov\u000b"
		// @13D: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @140: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @143: aastore
		// @144: dup
		// @145: bipush 27 (0x1B)
		// @147: ldc "@\u0001\u000b"
		// @149: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @14C: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @14F: aastore
		// @150: dup
		// @151: bipush 28 (0x1C)
		// @153: ldc "DBU`W3|_i"
		// @155: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @158: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @15B: aastore
		// @15C: dup
		// @15D: bipush 29 (0x1D)
		// @15F: ldc "CWRgOnQ\u001a\\FcB\u001aOQo"
		// @161: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @164: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @167: aastore
		// @168: dup
		// @169: bipush 30 (0x1E)
		// @16B: ldc "MBXgWc\\\u001aYJlW"
		// @16D: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @170: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @173: aastore
		// @174: dup
		// @175: bipush 31 (0x1F)
		// @177: ldc "Or\u0008"
		// @179: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @17C: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @17F: aastore
		// @180: dup
		// @181: bipush 32 (0x20)
		// @183: ldc "A\u0005"
		// @185: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @188: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @18B: aastore
		// @18C: dup
		// @18D: bipush 33 (0x21)
		// @18F: ldc "0r\t"
		// @191: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @194: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @197: aastore
		// @198: dup
		// @199: bipush 34 (0x22)
		// @19B: ldc "@\u0008"
		// @19D: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @1A0: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @1A3: aastore
		// @1A4: dup
		// @1A5: bipush 35 (0x23)
		// @1A7: ldc "0v\u000e"
		// @1A9: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @1AC: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @1AF: aastore
		// @1B0: dup
		// @1B1: bipush 36 (0x24)
		// @1B3: ldc "CWRgOnQ\u001aOQo"
		// @1B5: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @1B8: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @1BB: aastore
		// @1BC: dup
		// @1BD: bipush 37 (0x25)
		// @1BF: ldc "D\u0001"
		// @1C1: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @1C4: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @1C7: aastore
		// @1C8: dup
		// @1C9: bipush 38 (0x26)
		// @1CB: ldc "E_VkN\"qHc"
		// @1CD: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @1D0: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @1D3: aastore
		// @1D4: dup
		// @1D5: bipush 39 (0x27)
		// @1D7: ldc "VEHzOg\u0010yfBqCS}"
		// @1D9: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @1DC: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @1DF: aastore
		// @1E0: dup
		// @1E1: bipush 40 (0x28)
		// @1E3: ldc "QSU|Sk_T.`jQI}Jq"
		// @1E5: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @1E8: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @1EB: aastore
		// @1EC: dup
		// @1ED: bipush 41 (0x29)
		// @1EF: ldc "Or\n"
		// @1F1: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @1F4: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @1F7: aastore
		// @1F8: dup
		// @1F9: bipush 42 (0x2A)
		// @1FB: ldc "DBU`W0|_i"
		// @1FD: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @200: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @203: aastore
		// @204: dup
		// @205: bipush 43 (0x2B)
		// @207: ldc "@\u0005"
		// @209: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @20C: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @20F: aastore
		// @210: dup
		// @211: bipush 44 (0x2C)
		// @213: ldc "TQVfBn\\[.`jQI}Jq"
		// @215: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @218: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @21B: aastore
		// @21C: dup
		// @21D: bipush 45 (0x2D)
		// @21F: ldc "V_H}L"
		// @221: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @224: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @227: aastore
		// @228: dup
		// @229: bipush 46 (0x2E)
		// @22B: ldc "ABO}KgB\u001a\\FcB\u001aOQo"
		// @22D: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @230: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @233: aastore
		// @234: dup
		// @235: bipush 47 (0x2F)
		// @237: ldc "0v\u0008"
		// @239: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @23C: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @23F: aastore
		// @240: dup
		// @241: bipush 48 (0x30)
		// @243: ldc "DBU`WD_Uz"
		// @245: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @248: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @24B: aastore
		// @24C: dup
		// @24D: bipush 49 (0x31)
		// @24F: ldc "MBXgWc\\\u001aOQo"
		// @251: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @254: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @257: aastore
		// @258: dup
		// @259: bipush 50 (0x32)
		// @25B: ldc "0r\u000b"
		// @25D: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @260: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @263: aastore
		// @264: dup
		// @265: bipush 51 (0x33)
		// @267: ldc "@UHzKc\u0010{|N"
		// @269: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @26C: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @26F: aastore
		// @270: dup
		// @271: bipush 52 (0x34)
		// @273: ldc "@q"
		// @275: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @278: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @27B: aastore
		// @27C: dup
		// @27D: bipush 53 (0x35)
		// @27F: ldc "JEH|JaQTk\u0003JU[j"
		// @281: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @284: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @287: aastore
		// @288: dup
		// @289: bipush 54 (0x36)
		// @28B: ldc "E_VkN\"sRoPqYI"
		// @28D: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @290: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @293: aastore
		// @294: dup
		// @295: bipush 55 (0x37)
		// @297: ldc "A\t"
		// @299: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @29C: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @29F: aastore
		// @2A0: dup
		// @2A1: bipush 56 (0x38)
		// @2A3: ldc "Q\\[xF\"b_oQ\"qHc"
		// @2A5: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @2A8: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @2AB: aastore
		// @2AC: dup
		// @2AD: bipush 57 (0x39)
		// @2AF: ldc "G^_|D{\u0010xbBfU"
		// @2B1: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @2B4: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @2B7: aastore
		// @2B8: dup
		// @2B9: bipush 58 (0x3A)
		// @2BB: ldc "@\u0001\n"
		// @2BD: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @2C0: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @2C3: aastore
		// @2C4: dup
		// @2C5: bipush 59 (0x3B)
		// @2C7: ldc "0v\t"
		// @2C9: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @2CC: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @2CF: aastore
		// @2D0: dup
		// @2D1: bipush 60 (0x3C)
		// @2D3: ldc "ABO}KgB\u001aFFcT"
		// @2D5: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @2D8: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @2DB: aastore
		// @2DC: dup
		// @2DD: bipush 61 (0x3D)
		// @2DF: ldc "TQVfBn\\[.acSQ.Bp]"
		// @2E1: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @2E4: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @2E7: aastore
		// @2E8: dup
		// @2E9: bipush 62 (0x3E)
		// @2EB: ldc "MBXgWc\\\u001aMKcCIgP"
		// @2ED: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @2F0: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @2F3: aastore
		// @2F4: dup
		// @2F5: bipush 63 (0x3F)
		// @2F7: ldc "TQVfBn\\[.kgQ^"
		// @2F9: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @2FC: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @2FF: aastore
		// @300: dup
		// @301: bipush 64 (0x40)
		// @303: ldc "@QYe\u0011NU]"
		// @305: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @308: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @30B: aastore
		// @30C: dup
		// @30D: bipush 65 (0x41)
		// @30F: ldc "A\u0002"
		// @311: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @314: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @317: aastore
		// @318: dup
		// @319: bipush 66 (0x42)
		// @31B: ldc "NQTj\u0003FBU`F\"rUjZ\"\u001d\u001aZkKc\u001a]kMevJ\u0003LulKq\"ulKq\"ulKq\"r\u007f.pGut"
		// @31D: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @320: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @323: aastore
		// @324: dup
		// @325: bipush 67 (0x43)
		// @327: ldc "Ns"
		// @329: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @32C: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @32F: aastore
		// @330: dup
		// @331: bipush 68 (0x44)
		// @333: ldc "Q\\[xF\"qHc"
		// @335: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @338: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @33B: aastore
		// @33C: dup
		// @33D: bipush 69 (0x45)
		// @33F: ldc "A_WcBlTU.bp]"
		// @341: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @344: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @347: aastore
		// @348: dup
		// @349: bipush 70 (0x46)
		// @34B: ldc "Qq"
		// @34D: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @350: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @353: aastore
		// @354: dup
		// @355: bipush 71 (0x47)
		// @357: ldc "@\u0001"
		// @359: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @35C: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @35F: aastore
		// @360: dup
		// @361: bipush 72 (0x48)
		// @363: ldc "E_VkN\"b_oQ\"qHc"
		// @365: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @368: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @36B: aastore
		// @36C: dup
		// @36D: bipush 73 (0x49)
		// @36F: ldc "@UHzKc\u0010mgMe"
		// @371: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @374: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @377: aastore
		// @378: dup
		// @379: bipush 74 (0x4A)
		// @37B: ldc "E_VkN\"gS`D"
		// @37D: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @380: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @383: aastore
		// @384: dup
		// @385: bipush 75 (0x4B)
		// @387: ldc "JEH|JaQTk\u0003QXU{OfUH"
		// @389: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @38C: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @38F: aastore
		// @390: dup
		// @391: bipush 76 (0x4C)
		// @393: ldc "@\u0001\u0008"
		// @395: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @398: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @39B: aastore
		// @39C: dup
		// @39D: bipush 77 (0x4D)
		// @39F: ldc "@\t"
		// @3A1: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @3A4: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @3A7: aastore
		// @3A8: dup
		// @3A9: bipush 78 (0x4E)
		// @3AB: ldc "MBXgWc\\\u001aLBa[\u001aoQo"
		// @3AD: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @3B0: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @3B3: aastore
		// @3B4: dup
		// @3B5: bipush 79 (0x4F)
		// @3B7: ldc "@QYe\u0017NU]"
		// @3B9: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @3BC: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @3BF: aastore
		// @3C0: dup
		// @3C1: bipush 80 (0x50)
		// @3C3: ldc "@\u0000"
		// @3C5: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @3C8: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @3CB: aastore
		// @3CC: dup
		// @3CD: bipush 81 (0x51)
		// @3CF: ldc "Qt"
		// @3D1: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @3D4: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @3D7: aastore
		// @3D8: dup
		// @3D9: bipush 82 (0x52)
		// @3DB: ldc "JEH|JaQTk\u0003PU[|\u0003CBW"
		// @3DD: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @3E0: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @3E3: aastore
		// @3E4: dup
		// @3E5: bipush 83 (0x53)
		// @3E7: ldc "D\u0004"
		// @3E9: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @3EC: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @3EF: aastore
		// @3F0: dup
		// @3F1: bipush 84 (0x54)
		// @3F3: ldc "@QXkO\"sRoPqYI"
		// @3F5: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @3F8: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @3FB: aastore
		// @3FC: dup
		// @3FD: bipush 85 (0x55)
		// @3FF: ldc "@QYeem_N"
		// @401: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @404: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @407: aastore
		// @408: dup
		// @409: bipush 86 (0x56)
		// @40B: ldc "@UHzKc\u0010rkBf"
		// @40D: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @410: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @413: aastore
		// @414: dup
		// @415: bipush 87 (0x57)
		// @417: ldc "iV\u0014I\u000b"
		// @419: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @41C: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @41F: aastore
		// @420: dup
		// @421: bipush 88 (0x58)
		// @423: ldc "DBU`W1|_i"
		// @425: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @428: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @42B: aastore
		// @42C: dup
		// @42D: bipush 89 (0x59)
		// @42F: ldc "@UHzKc\u0010hkBp\u0010{|N"
		// @431: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @434: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @437: aastore
		// @438: dup
		// @439: bipush 90 (0x5A)
		// @43B: ldc "MBXgWc\\\u001aFFcT"
		// @43D: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @440: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @443: aastore
		// @444: dup
		// @445: bipush 91 (0x5B)
		// @447: ldc "DBU`W2|_i"
		// @449: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @44C: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @44F: aastore
		// @450: dup
		// @451: bipush 92 (0x5C)
		// @453: ldc "@QXkO\"qHc"
		// @455: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @458: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @45B: aastore
		// @45C: dup
		// @45D: bipush 93 (0x5D)
		// @45F: ldc "TQVfBn\\[.bp]"
		// @461: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @464: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @467: aastore
		// @468: dup
		// @469: bipush 94 (0x5E)
		// @46B: ldc "@s"
		// @46D: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @470: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @473: aastore
		// @474: dup
		// @475: bipush 95 (0x5F)
		// @477: ldc "@UHzKc\u0010yfBqCS}"
		// @479: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @47C: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @47F: aastore
		// @480: dup
		// @481: bipush 96 (0x60)
		// @483: ldc "A\u0001\n"
		// @485: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @488: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @48B: aastore
		// @48C: dup
		// @48D: bipush 97 (0x61)
		// @48F: ldc "A\u0008"
		// @491: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @494: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @497: aastore
		// @498: dup
		// @499: bipush 98 (0x62)
		// @49B: ldc "A\u0006"
		// @49D: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @4A0: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @4A3: aastore
		// @4A4: dup
		// @4A5: bipush 99 (0x63)
		// @4A7: ldc "D\u0002"
		// @4A9: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @4AC: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @4AF: aastore
		// @4B0: dup
		// @4B1: bipush 100 (0x64)
		// @4B3: ldc "A_WcBlTU.pj_ObGgB"
		// @4B5: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @4B8: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @4BB: aastore
		// @4BC: dup
		// @4BD: bipush 101 (0x65)
		// @4BF: ldc "@QYe\u0010NU]"
		// @4C1: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @4C4: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @4C7: aastore
		// @4C8: dup
		// @4C9: bipush 102 (0x66)
		// @4CB: ldc "Ov\n"
		// @4CD: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @4D0: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @4D3: aastore
		// @4D4: dup
		// @4D5: bipush 103 (0x67)
		// @4D7: ldc "@QYe\u0013NU]"
		// @4D9: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @4DC: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @4DF: aastore
		// @4E0: dup
		// @4E1: bipush 104 (0x68)
		// @4E3: ldc "DBU`W6|_i"
		// @4E5: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @4E8: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @4EB: aastore
		// @4EC: dup
		// @4ED: bipush 105 (0x69)
		// @4EF: ldc "JEH|JaQTk\u0003CBW"
		// @4F1: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @4F4: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @4F7: aastore
		// @4F8: dup
		// @4F9: bipush 106 (0x6A)
		// @4FB: ldc "JEH|JaQTk\u0003AX[}PkC"
		// @4FD: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @500: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @503: aastore
		// @504: dup
		// @505: bipush 107 (0x6B)
		// @507: ldc "E_VkN\"x_oG"
		// @509: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @50C: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @50F: aastore
		// @510: dup
		// @511: bipush 108 (0x6C)
		// @513: ldc "Ov\u0008"
		// @515: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @518: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @51B: aastore
		// @51C: dup
		// @51D: bipush 109 (0x6D)
		// @51F: ldc "@t"
		// @521: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @524: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @527: aastore
		// @528: dup
		// @529: bipush 110 (0x6E)
		// @52B: ldc "0r\u000e"
		// @52D: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @530: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @533: aastore
		// @534: dup
		// @535: bipush 111 (0x6F)
		// @537: ldc "A_WcBlTU.qgQH.bp]"
		// @539: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @53C: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @53F: aastore
		// @540: dup
		// @541: bipush 112 (0x70)
		// @543: ldc "CWRgOnQ\u001aMKcCIgP"
		// @545: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @548: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @54B: aastore
		// @54C: dup
		// @54D: bipush 113 (0x71)
		// @54F: ldc "A_WcBlTU.`jQI}Jq"
		// @551: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @554: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @557: aastore
		// @558: dup
		// @559: bipush 114 (0x72)
		// @55B: ldc "ABO}KgB\u001aOQo"
		// @55D: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @560: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @563: aastore
		// @564: dup
		// @565: bipush 115 (0x73)
		// @567: ldc "QSU|Sk_T.wcYV"
		// @569: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @56C: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @56F: aastore
		// @570: dup
		// @571: bipush 116 (0x74)
		// @573: ldc "@\u0003"
		// @575: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @578: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @57B: aastore
		// @57C: dup
		// @57D: bipush 117 (0x75)
		// @57F: ldc "A\u0003"
		// @581: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @584: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @587: aastore
		// @588: dup
		// @589: bipush 118 (0x76)
		// @58B: ldc "QSU|Sk_T.kgQ^"
		// @58D: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @590: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @593: aastore
		// @594: dup
		// @595: bipush 119 (0x77)
		// @597: ldc "CWRgOnQ\u001aFFcT"
		// @599: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @59C: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @59F: aastore
		// @5A0: dup
		// @5A1: bipush 120 (0x78)
		// @5A3: ldc "@\u0004"
		// @5A5: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @5A8: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @5AB: aastore
		// @5AC: dup
		// @5AD: bipush 121 (0x79)
		// @5AF: ldc "0r\u0008"
		// @5B1: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @5B4: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @5B7: aastore
		// @5B8: dup
		// @5B9: bipush 122 (0x7A)
		// @5BB: ldc "0v\u000b"
		// @5BD: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @5C0: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @5C3: aastore
		// @5C4: dup
		// @5C5: bipush 123 (0x7B)
		// @5C7: ldc "Q\\[xF\"cRaVnT_|"
		// @5C9: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @5CC: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @5CF: aastore
		// @5D0: dup
		// @5D1: bipush 124 (0x7C)
		// @5D3: ldc "D\u0000"
		// @5D5: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @5D8: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @5DB: aastore
		// @5DC: dup
		// @5DD: bipush 125 (0x7D)
		// @5DF: ldc "A\u0004"
		// @5E1: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @5E4: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @5E7: aastore
		// @5E8: dup
		// @5E9: bipush 126 (0x7E)
		// @5EB: ldc "Nt"
		// @5ED: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @5F0: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @5F3: aastore
		// @5F4: dup
		// @5F5: bipush 127 (0x7F)
		// @5F7: ldc "VEHzOg\u0010rkBf"
		// @5F9: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @5FC: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @5FF: aastore
		// @600: dup
		// @601: sipush 128 (0x0080)
		// @604: ldc "Nq"
		// @606: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @609: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @60C: aastore
		// @60D: dup
		// @60E: sipush 129 (0x0081)
		// @611: ldc "V_JMKcCIgP"
		// @613: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @616: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @619: aastore
		// @61A: dup
		// @61B: sipush 130 (0x0082)
		// @61E: ldc "iV\u0014K\u000b"
		// @620: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @623: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @626: aastore
		// @627: dup
		// @628: sipush 131 (0x0083)
		// @62B: ldc "iV\u0014O\u000b"
		// @62D: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @630: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @633: aastore
		// @634: dup
		// @635: sipush 132 (0x0084)
		// @638: ldc "iV\u0014M\u000b"
		// @63A: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @63D: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @640: aastore
		// @641: dup
		// @642: sipush 133 (0x0085)
		// @645: ldc "iV\u0014J\u000b"
		// @647: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @64A: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @64D: aastore
		// @64E: putstatic java.lang.String[] game.C_100297_kf.field_101243_z
		// @651: ldc "A_ThJp]\u001aKNcYV4"
		// @653: invokestatic game.C_100297_kf.func_101228_z(java.lang.String)char[]
		// @656: invokestatic game.C_100297_kf.func_101225_z(char[])java.lang.String
		// @659: putstatic java.lang.String game.C_100297_kf.field_101237_p
		// @65C: new game.C_100133_tk
		// @65F: dup
		// @660: invokespecial game.C_100133_tk.<init>()void
		// @663: putstatic game.C_100133_tk game.C_100297_kf.field_101234_s
		// @666: return
	}
	
	private static char[] func_101228_z(String arg0)
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
		// @0E: bipush 35 (0x23)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_101225_z(char[] arg0)
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
		// @30: iconst_2
		// @31: goto @45
		// @34: bipush 48 (0x30)
		// @36: goto @45
		// @39: bipush 58 (0x3A)
		// @3B: goto @45
		// @3E: bipush 14 (0x0E)
		// @40: goto @45
		// @43: bipush 35 (0x23)
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
