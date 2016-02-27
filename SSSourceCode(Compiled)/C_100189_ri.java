package game;

final class C_100189_ri
{
	static boolean field_105753_e;
	static C_100202_qi field_105754_b;
	static C_100217_ao field_105751_f;
	static C_100037_wb[] field_105755_c;
	static String field_105756_a;
	static C_100302_ka field_105752_d;
	private static final String[] field_105757_z;
	
	static final boolean func_105748_a(int arg0)
	{
		// @00: getstatic game.C_100323_hl game.C_100264_mg.field_106528_i
		// @03: dup
		// @04: astore_1
		// @05: monitorenter
		// @06: getstatic int game.C_100077_d.field_103317_U
		// @09: getstatic int game.C_100007_fm.field_103630_b
		// @0C: if_icmpne @13
		// @0F: iconst_0
		// @10: aload_1
		// @11: monitorexit
		// @12: ireturn
		// @13: getstatic int[] game.C_100238_ol.field_101693_G
		// @16: getstatic int game.C_100077_d.field_103317_U
		// @19: iaload
		// @1A: putstatic int game.C_100293_kj.field_106890_c
		// @1D: getstatic char[] game.C_100143_bl.field_105105_a
		// @20: getstatic int game.C_100077_d.field_103317_U
		// @23: caload
		// @24: putstatic char game.C_100012_fh.field_100517_Q
		// @27: iconst_1
		// @28: getstatic int game.C_100077_d.field_103317_U
		// @2B: iadd
		// @2C: bipush 127 (0x7F)
		// @2E: iand
		// @2F: putstatic int game.C_100077_d.field_103317_U
		// @32: iload_0
		// @33: bipush 64 (0x40)
		// @35: if_icmpeq @41
		// @38: bipush 113 (0x71)
		// @3A: invokestatic game.C_100189_ri.func_105743_b(int)void
		// @3D: goto @41
		// @40: athrow
		// @41: iconst_1
		// @42: aload_1
		// @43: monitorexit
		// @44: ireturn
		// @45: astore_2
		// @46: aload_1
		// @47: monitorexit
		// @48: aload_2
		// @49: athrow
		// @4A: astore_1
		// @4B: aload_1
		// @4C: new java.lang.StringBuilder
		// @4F: dup
		// @50: invokespecial java.lang.StringBuilder.<init>()void
		// @53: getstatic java.lang.String[] game.C_100189_ri.field_105757_z
		// @56: iconst_1
		// @57: aaload
		// @58: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @5B: iload_0
		// @5C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5F: bipush 41 (0x29)
		// @61: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @64: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @67: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @6A: athrow
	}
	
	static final C_100037_wb[] func_105745_a(int arg0, int arg1)
	{
		// @00: bipush 9 (0x09)
		// @02: anewarray game.C_100037_wb
		// @05: astore_2
		// @06: iload_1
		// @07: bipush -2 (0xFE)
		// @09: if_icmpeq @1C
		// @0C: bipush 71 (0x47)
		// @0E: bipush -126 (0x82)
		// @10: aconst_null
		// @11: checkcast int[]
		// @14: invokestatic game.C_100189_ri.func_105742_a(int, int, int[])boolean
		// @17: pop
		// @18: goto @1C
		// @1B: athrow
		// @1C: aload_2
		// @1D: iconst_4
		// @1E: bipush 73 (0x49)
		// @20: bipush 64 (0x40)
		// @22: iload_0
		// @23: invokestatic game.C_100169_co.func_105518_a(byte, int, int)game.C_100037_wb
		// @26: aastore
		// @27: aload_2
		// @28: areturn
		// @29: astore_2
		// @2A: aload_2
		// @2B: new java.lang.StringBuilder
		// @2E: dup
		// @2F: invokespecial java.lang.StringBuilder.<init>()void
		// @32: getstatic java.lang.String[] game.C_100189_ri.field_105757_z
		// @35: bipush 7 (0x07)
		// @37: aaload
		// @38: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3B: iload_0
		// @3C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3F: bipush 44 (0x2C)
		// @41: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @44: iload_1
		// @45: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @48: bipush 41 (0x29)
		// @4A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @50: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @53: athrow
	}
	
	public static void func_105743_b(int arg0)
	{
		// @00: iload_0
		// @01: sipush 24241 (0x5EB1)
		// @04: if_icmpeq @10
		// @07: bipush -55 (0xC9)
		// @09: invokestatic game.C_100189_ri.func_105743_b(int)void
		// @0C: goto @10
		// @0F: athrow
		// @10: aconst_null
		// @11: putstatic game.C_100202_qi game.C_100189_ri.field_105754_b
		// @14: aconst_null
		// @15: putstatic java.lang.String game.C_100189_ri.field_105756_a
		// @18: aconst_null
		// @19: putstatic game.C_100037_wb[] game.C_100189_ri.field_105755_c
		// @1C: aconst_null
		// @1D: putstatic game.C_100302_ka game.C_100189_ri.field_105752_d
		// @20: aconst_null
		// @21: putstatic game.C_100217_ao game.C_100189_ri.field_105751_f
		// @24: goto @48
		// @27: astore_1
		// @28: aload_1
		// @29: new java.lang.StringBuilder
		// @2C: dup
		// @2D: invokespecial java.lang.StringBuilder.<init>()void
		// @30: getstatic java.lang.String[] game.C_100189_ri.field_105757_z
		// @33: iconst_0
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
	
	static final boolean func_105742_a(int arg0, int arg1, int[] arg2)
	{
		// @00: iload_1
		// @01: bipush 31 (0x1F)
		// @03: if_icmpeq @08
		// @06: iconst_1
		// @07: ireturn
		// @08: aload_2
		// @09: iload_0
		// @0A: ldc -1875654939 (0x9033c6e5)
		// @0C: ishr
		// @0D: iaload
		// @0E: iconst_1
		// @0F: bipush 31 (0x1F)
		// @11: iload_0
		// @12: iand
		// @13: ishl
		// @14: iand
		// @15: ifeq @1D
		// @18: iconst_1
		// @19: goto @1E
		// @1C: athrow
		// @1D: iconst_0
		// @1E: ireturn
		// @1F: astore_3
		// @20: aload_3
		// @21: new java.lang.StringBuilder
		// @24: dup
		// @25: invokespecial java.lang.StringBuilder.<init>()void
		// @28: getstatic java.lang.String[] game.C_100189_ri.field_105757_z
		// @2B: iconst_5
		// @2C: aaload
		// @2D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @30: iload_0
		// @31: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @34: bipush 44 (0x2C)
		// @36: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @39: iload_1
		// @3A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3D: bipush 44 (0x2C)
		// @3F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @42: aload_2
		// @43: ifnull @4F
		// @46: getstatic java.lang.String[] game.C_100189_ri.field_105757_z
		// @49: iconst_2
		// @4A: aaload
		// @4B: goto @54
		// @4E: athrow
		// @4F: getstatic java.lang.String[] game.C_100189_ri.field_105757_z
		// @52: iconst_3
		// @53: aaload
		// @54: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @57: bipush 41 (0x29)
		// @59: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @5F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @62: athrow
	}
	
	static final void func_105749_a(int arg0, int arg1, boolean arg2, boolean arg3)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #12
		// @005: iconst_0
		// @006: getstatic int game.C_100102_w.field_104635_b
		// @009: invokestatic game.C_100080_b.func_104428_a(boolean, int)void
		// @00C: iload_0
		// @00D: sipush -20168 (0xB138)
		// @010: if_icmpeq @01E
		// @013: aconst_null
		// @014: checkcast game.C_100202_qi
		// @017: putstatic game.C_100202_qi game.C_100189_ri.field_105754_b
		// @01A: goto @01E
		// @01D: athrow
		// @01E: getstatic game.C_100211_qd game.SteelSentinels.field_105274_N
		// @021: ifnull @40F
		// @024: getstatic game.C_100302_ka game.C_100289_jl.field_102897_D
		// @027: astore #4
		// @029: getstatic game.C_100302_ka game.C_100289_jl.field_102897_D
		// @02C: iconst_0
		// @02D: putfield int game.C_100302_ka.field_101848_lb
		// @030: aload #4
		// @032: iconst_0
		// @033: putfield int game.C_100302_ka.field_101886_Kb
		// @036: getstatic game.C_100302_ka game.C_100083_c.field_103164_U
		// @039: iconst_0
		// @03A: putfield int game.C_100302_ka.field_101848_lb
		// @03D: getstatic game.C_100302_ka game.C_100083_c.field_103164_U
		// @040: astore #5
		// @042: aload #5
		// @044: iconst_0
		// @045: putfield int game.C_100302_ka.field_101886_Kb
		// @048: getstatic game.C_100302_ka game.C_100084_ug.field_104481_e
		// @04B: iconst_0
		// @04C: putfield int game.C_100302_ka.field_101848_lb
		// @04F: getstatic game.C_100302_ka game.C_100084_ug.field_104481_e
		// @052: astore #6
		// @054: aload #6
		// @056: iconst_0
		// @057: putfield int game.C_100302_ka.field_101886_Kb
		// @05A: getstatic game.C_100302_ka game.C_100250_pl.field_106436_b
		// @05D: getstatic java.lang.String game.C_100061_dh.field_101994_Vb
		// @060: invokevirtual java.lang.String.toUpperCase()java.lang.String
		// @063: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @066: getstatic game.C_100302_ka game.C_100318_hj.field_107196_d
		// @069: getfield int game.C_100302_ka.field_101886_Kb
		// @06C: bipush -2 (0xFE)
		// @06E: isub
		// @06F: iconst_2
		// @070: idiv
		// @071: istore #7
		// @073: getstatic game.C_100302_ka game.C_100084_ug.field_104481_e
		// @076: iconst_0
		// @077: bipush 40 (0x28)
		// @079: iconst_m1
		// @07A: bipush -40 (0xD8)
		// @07C: getstatic game.C_100302_ka game.C_100318_hj.field_107196_d
		// @07F: getfield int game.C_100302_ka.field_101848_lb
		// @082: iadd
		// @083: iload #7
		// @085: iconst_2
		// @086: isub
		// @087: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @08A: getstatic game.C_100302_ka game.C_100083_c.field_103164_U
		// @08D: iload #7
		// @08F: bipush 40 (0x28)
		// @091: iload_0
		// @092: sipush 20167 (0x4EC7)
		// @095: ixor
		// @096: getstatic game.C_100302_ka game.C_100318_hj.field_107196_d
		// @099: getfield int game.C_100302_ka.field_101848_lb
		// @09C: bipush -40 (0xD8)
		// @09E: iadd
		// @09F: getstatic game.C_100302_ka game.C_100318_hj.field_107196_d
		// @0A2: getfield int game.C_100302_ka.field_101886_Kb
		// @0A5: iload #7
		// @0A7: isub
		// @0A8: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @0AB: bipush -2 (0xFE)
		// @0AD: getstatic int[] game.C_100126_cb.field_103060_v
		// @0B0: arraylength
		// @0B1: iconst_m1
		// @0B2: ixor
		// @0B3: if_icmpne @0C3
		// @0B6: getstatic int[] game.C_100126_cb.field_103060_v
		// @0B9: iconst_0
		// @0BA: iaload
		// @0BB: iconst_2
		// @0BC: if_icmpeq @147
		// @0BF: goto @0C3
		// @0C2: athrow
		// @0C3: iconst_0
		// @0C4: istore #8
		// @0C6: iconst_0
		// @0C7: istore #9
		// @0C9: iconst_0
		// @0CA: istore #10
		// @0CC: iload #10
		// @0CE: iconst_m1
		// @0CF: ixor
		// @0D0: getstatic int[] game.C_100126_cb.field_103060_v
		// @0D3: arraylength
		// @0D4: iconst_m1
		// @0D5: ixor
		// @0D6: if_icmple @139
		// @0D9: iconst_0
		// @0DA: getstatic byte[] game.C_100217_ao.field_106037_b
		// @0DD: iload #10
		// @0DF: bipush 8 (0x08)
		// @0E1: idiv
		// @0E2: baload
		// @0E3: iconst_1
		// @0E4: iload #10
		// @0E6: bipush 7 (0x07)
		// @0E8: iand
		// @0E9: ishl
		// @0EA: iand
		// @0EB: iload #12
		// @0ED: ifne @13C
		// @0F0: if_icmpeq @0FC
		// @0F3: goto @0F7
		// @0F6: athrow
		// @0F7: iconst_1
		// @0F8: goto @0FD
		// @0FB: athrow
		// @0FC: iconst_0
		// @0FD: istore #11
		// @0FF: iload #11
		// @101: ifeq @10B
		// @104: iinc #9 +1
		// @107: goto @10B
		// @10A: athrow
		// @10B: iload #11
		// @10D: ifeq @12D
		// @110: bipush -3 (0xFD)
		// @112: getstatic int[] game.C_100126_cb.field_103060_v
		// @115: iload #10
		// @117: iaload
		// @118: iconst_m1
		// @119: ixor
		// @11A: if_icmpne @125
		// @11D: goto @121
		// @120: athrow
		// @121: goto @12D
		// @124: athrow
		// @125: iconst_1
		// @126: istore #8
		// @128: iload #12
		// @12A: ifeq @139
		// @12D: iinc #10 +1
		// @130: iload #12
		// @132: ifeq @0CC
		// @135: goto @139
		// @138: athrow
		// @139: iconst_0
		// @13A: iload #9
		// @13C: if_icmpne @142
		// @13F: iconst_1
		// @140: istore #8
		// @142: iload #12
		// @144: ifeq @14A
		// @147: iconst_0
		// @148: istore #8
		// @14A: getstatic game.C_100302_ka game.C_100083_c.field_103164_U
		// @14D: iconst_1
		// @14E: putfield boolean game.C_100302_ka.field_101864_W
		// @151: getstatic boolean game.C_100226_ae.field_106149_e
		// @154: ifeq @240
		// @157: getstatic game.C_100302_ka game.C_100200_ba.field_105847_f
		// @15A: iconst_0
		// @15B: putfield boolean game.C_100302_ka.field_101864_W
		// @15E: getstatic game.C_100302_ka game.C_100149_bi.field_105157_c
		// @161: getstatic java.lang.String game.C_100212_qc.field_105978_a
		// @164: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @167: iload #8
		// @169: ifeq @177
		// @16C: goto @170
		// @16F: athrow
		// @170: getstatic java.lang.String game.C_100136_th.field_102624_ab
		// @173: goto @17A
		// @176: athrow
		// @177: getstatic java.lang.String game.C_100304_kl.field_107110_f
		// @17A: astore #9
		// @17C: getstatic game.C_100302_ka game.C_100084_ug.field_104481_e
		// @17F: getfield game.C_100112_r game.C_100302_ka.field_101845_sb
		// @182: aload #9
		// @184: invokevirtual game.C_100112_r.func_101739_b(java.lang.String)int
		// @187: getstatic game.C_100302_ka game.C_100084_ug.field_104481_e
		// @18A: getfield game.C_100112_r game.C_100302_ka.field_101845_sb
		// @18D: bipush 46 (0x2E)
		// @18F: invokevirtual game.C_100112_r.func_101731_a(char)int
		// @192: iconst_3
		// @193: imul
		// @194: iadd
		// @195: istore #10
		// @197: getstatic game.C_100302_ka game.C_100084_ug.field_104481_e
		// @19A: iconst_0
		// @19B: putfield int game.C_100302_ka.field_101850_Fb
		// @19E: getstatic game.C_100302_ka game.C_100084_ug.field_104481_e
		// @1A1: iload #10
		// @1A3: ineg
		// @1A4: getstatic game.C_100302_ka game.C_100084_ug.field_104481_e
		// @1A7: getfield int game.C_100302_ka.field_101886_Kb
		// @1AA: iadd
		// @1AB: iconst_2
		// @1AC: idiv
		// @1AD: putfield int game.C_100302_ka.field_101829_Db
		// @1B0: bipush 48 (0x30)
		// @1B2: getstatic int game.C_100132_td.field_104984_i
		// @1B5: iand
		// @1B6: bipush 16 (0x10)
		// @1B8: if_icmpne @1D1
		// @1BB: new java.lang.StringBuilder
		// @1BE: dup
		// @1BF: invokespecial java.lang.StringBuilder.<init>()void
		// @1C2: aload #9
		// @1C4: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1C7: ldc "."
		// @1C9: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1CC: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @1CF: astore #9
		// @1D1: getstatic int game.C_100132_td.field_104984_i
		// @1D4: bipush 48 (0x30)
		// @1D6: iand
		// @1D7: iconst_m1
		// @1D8: ixor
		// @1D9: bipush -33 (0xDF)
		// @1DB: if_icmpeq @1E2
		// @1DE: goto @1FC
		// @1E1: athrow
		// @1E2: new java.lang.StringBuilder
		// @1E5: dup
		// @1E6: invokespecial java.lang.StringBuilder.<init>()void
		// @1E9: aload #9
		// @1EB: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1EE: getstatic java.lang.String[] game.C_100189_ri.field_105757_z
		// @1F1: bipush 14 (0x0E)
		// @1F3: aaload
		// @1F4: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1F7: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @1FA: astore #9
		// @1FC: getstatic int game.C_100132_td.field_104984_i
		// @1FF: bipush 48 (0x30)
		// @201: iand
		// @202: iconst_m1
		// @203: ixor
		// @204: bipush -49 (0xCF)
		// @206: if_icmpeq @20D
		// @209: goto @227
		// @20C: athrow
		// @20D: new java.lang.StringBuilder
		// @210: dup
		// @211: invokespecial java.lang.StringBuilder.<init>()void
		// @214: aload #9
		// @216: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @219: getstatic java.lang.String[] game.C_100189_ri.field_105757_z
		// @21C: bipush 13 (0x0D)
		// @21E: aaload
		// @21F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @222: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @225: astore #9
		// @227: getstatic game.C_100302_ka game.C_100084_ug.field_104481_e
		// @22A: aload #9
		// @22C: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @22F: getstatic game.C_100302_ka game.C_100083_c.field_103164_U
		// @232: getstatic java.lang.String game.C_100246_pg.field_106400_f
		// @235: invokevirtual java.lang.String.toUpperCase()java.lang.String
		// @238: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @23B: iload #12
		// @23D: ifeq @40F
		// @240: getstatic game.C_100302_ka game.C_100083_c.field_103164_U
		// @243: iload #8
		// @245: ifeq @253
		// @248: goto @24C
		// @24B: athrow
		// @24C: getstatic java.lang.String game.C_100243_pd.field_106360_c
		// @24F: goto @256
		// @252: athrow
		// @253: getstatic java.lang.String game.C_100022_hf.field_103900_n
		// @256: invokevirtual java.lang.String.toUpperCase()java.lang.String
		// @259: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @25C: getstatic game.C_100302_ka game.C_100149_bi.field_105157_c
		// @25F: sipush -30945 (0x871F)
		// @262: iconst_1
		// @263: anewarray java.lang.String
		// @266: dup
		// @267: iconst_0
		// @268: getstatic game.C_100302_ka game.C_100083_c.field_103164_U
		// @26B: getfield java.lang.String game.C_100302_ka.field_101890_ab
		// @26E: aastore
		// @26F: iload #8
		// @271: ifne @27B
		// @274: getstatic java.lang.String game.C_100013_fn.field_103746_h
		// @277: goto @27E
		// @27A: athrow
		// @27B: getstatic java.lang.String game.C_100107_u.field_104777_h
		// @27E: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @281: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @284: getstatic game.C_100302_ka game.C_100084_ug.field_104481_e
		// @287: getstatic java.lang.String game.C_100116_ei.field_104118_f
		// @28A: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @28D: iconst_1
		// @28E: putstatic boolean game.C_100049_vf.field_104210_h
		// @291: getstatic game.C_100302_ka game.C_100200_ba.field_105847_f
		// @294: iconst_1
		// @295: putfield boolean game.C_100302_ka.field_101864_W
		// @298: aconst_null
		// @299: getstatic int[][] game.C_100092_um.field_104539_i
		// @29C: if_acmpne @2A3
		// @29F: goto @31B
		// @2A2: athrow
		// @2A3: aconst_null
		// @2A4: getstatic byte[] game.C_100341_jd.field_102646_ib
		// @2A7: if_acmpeq @2AE
		// @2AA: goto @2BE
		// @2AD: athrow
		// @2AE: getstatic int game.C_100137_bn.field_105038_l
		// @2B1: newarray boolean[]
		// @2B3: putstatic boolean[] game.C_100207_qh.field_102873_U
		// @2B6: getstatic int game.C_100137_bn.field_105038_l
		// @2B9: newarray byte[]
		// @2BB: putstatic byte[] game.C_100341_jd.field_102646_ib
		// @2BE: iconst_0
		// @2BF: putstatic boolean game.C_100049_vf.field_104210_h
		// @2C2: iconst_0
		// @2C3: putstatic boolean game.C_100327_ib.field_102503_y
		// @2C6: iconst_0
		// @2C7: istore #9
		// @2C9: iload #9
		// @2CB: iconst_m1
		// @2CC: ixor
		// @2CD: getstatic int game.C_100137_bn.field_105038_l
		// @2D0: iconst_m1
		// @2D1: ixor
		// @2D2: if_icmple @2ED
		// @2D5: getstatic boolean[] game.C_100207_qh.field_102873_U
		// @2D8: iload #9
		// @2DA: iconst_0
		// @2DB: bastore
		// @2DC: iinc #9 +1
		// @2DF: iload #12
		// @2E1: ifne @2FC
		// @2E4: iload #12
		// @2E6: ifeq @2C9
		// @2E9: goto @2ED
		// @2EC: athrow
		// @2ED: iconst_m1
		// @2EE: iconst_0
		// @2EF: iconst_1
		// @2F0: iconst_1
		// @2F1: iconst_m1
		// @2F2: getstatic game.C_100211_qd game.SteelSentinels.field_105274_N
		// @2F5: getstatic int game.C_100137_bn.field_105038_l
		// @2F8: iconst_m1
		// @2F9: invokestatic game.C_100209_qb.func_102684_a(int, int, boolean, int, int, game.C_100211_qd, int, int)void
		// @2FC: getstatic int game.C_100107_u.field_104770_g
		// @2FF: iconst_m1
		// @300: ixor
		// @301: bipush -3 (0xFD)
		// @303: if_icmpgt @31B
		// @306: getstatic boolean[] game.C_100309_lk.field_103258_hb
		// @309: bipush 12 (0x0C)
		// @30B: baload
		// @30C: ifne @317
		// @30F: goto @313
		// @312: athrow
		// @313: goto @31B
		// @316: athrow
		// @317: iconst_1
		// @318: putstatic boolean game.C_100049_vf.field_104210_h
		// @31B: getstatic boolean game.C_100049_vf.field_104210_h
		// @31E: ifeq @325
		// @321: goto @40F
		// @324: athrow
		// @325: getstatic game.C_100302_ka game.C_100083_c.field_103164_U
		// @328: iconst_0
		// @329: putfield boolean game.C_100302_ka.field_101864_W
		// @32C: getstatic game.C_100302_ka game.C_100083_c.field_103164_U
		// @32F: getfield boolean game.C_100302_ka.field_101836_Hb
		// @332: ifeq @40F
		// @335: aconst_null
		// @336: astore #9
		// @338: getstatic boolean game.C_100327_ib.field_102503_y
		// @33B: ifeq @362
		// @33E: new java.lang.StringBuilder
		// @341: dup
		// @342: invokespecial java.lang.StringBuilder.<init>()void
		// @345: getstatic java.lang.String[] game.C_100189_ri.field_105757_z
		// @348: bipush 8 (0x08)
		// @34A: aaload
		// @34B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @34E: getstatic java.lang.String game.C_100332_ii.field_107312_c
		// @351: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @354: getstatic java.lang.String[] game.C_100189_ri.field_105757_z
		// @357: bipush 10 (0x0A)
		// @359: aaload
		// @35A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @35D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @360: astore #9
		// @362: iconst_0
		// @363: istore #10
		// @365: getstatic int game.C_100137_bn.field_105038_l
		// @368: iload #10
		// @36A: if_icmple @3DF
		// @36D: getstatic boolean[] game.C_100207_qh.field_102873_U
		// @370: iload #10
		// @372: baload
		// @373: iload #12
		// @375: ifne @495
		// @378: ifne @382
		// @37B: goto @37F
		// @37E: athrow
		// @37F: goto @3D7
		// @382: new java.lang.StringBuilder
		// @385: dup
		// @386: invokespecial java.lang.StringBuilder.<init>()void
		// @389: getstatic java.lang.String[] game.C_100189_ri.field_105757_z
		// @38C: bipush 8 (0x08)
		// @38E: aaload
		// @38F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @392: getstatic java.lang.String[] game.C_100036_gg.field_103155_R
		// @395: iload #10
		// @397: aaload
		// @398: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @39B: getstatic java.lang.String[] game.C_100189_ri.field_105757_z
		// @39E: bipush 10 (0x0A)
		// @3A0: aaload
		// @3A1: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3A4: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3A7: astore #11
		// @3A9: aconst_null
		// @3AA: aload #9
		// @3AC: if_acmpne @3B8
		// @3AF: aload #11
		// @3B1: astore #9
		// @3B3: iload #12
		// @3B5: ifeq @3D7
		// @3B8: new java.lang.StringBuilder
		// @3BB: dup
		// @3BC: invokespecial java.lang.StringBuilder.<init>()void
		// @3BF: aload #9
		// @3C1: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3C4: getstatic java.lang.String[] game.C_100189_ri.field_105757_z
		// @3C7: bipush 11 (0x0B)
		// @3C9: aaload
		// @3CA: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3CD: aload #11
		// @3CF: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3D2: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3D5: astore #9
		// @3D7: iinc #10 +1
		// @3DA: iload #12
		// @3DC: ifeq @365
		// @3DF: new java.lang.StringBuilder
		// @3E2: dup
		// @3E3: invokespecial java.lang.StringBuilder.<init>()void
		// @3E6: getstatic java.lang.String[] game.C_100189_ri.field_105757_z
		// @3E9: bipush 8 (0x08)
		// @3EB: aaload
		// @3EC: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3EF: getstatic java.lang.String game.C_100080_b.field_104432_d
		// @3F2: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3F5: getstatic java.lang.String[] game.C_100189_ri.field_105757_z
		// @3F8: bipush 12 (0x0C)
		// @3FA: aaload
		// @3FB: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3FE: getstatic java.lang.String game.C_100137_bn.field_105043_i
		// @401: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @404: aload #9
		// @406: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @409: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @40C: putstatic java.lang.String game.C_100321_hi.field_107220_c
		// @40F: getstatic game.C_100302_ka game.C_100314_lf.field_101335_mc
		// @412: iload_3
		// @413: ifeq @42D
		// @416: iload_2
		// @417: ifne @42D
		// @41A: goto @41E
		// @41D: athrow
		// @41E: getstatic boolean game.C_100003_ga.field_103535_w
		// @421: ifne @42D
		// @424: goto @428
		// @427: athrow
		// @428: iconst_1
		// @429: goto @42E
		// @42C: athrow
		// @42D: iconst_0
		// @42E: bipush -105 (0x97)
		// @430: invokevirtual game.C_100302_ka.func_101819_a(boolean, byte)void
		// @433: getstatic game.C_100302_ka game.C_100318_hj.field_107196_d
		// @436: iload_3
		// @437: ifeq @451
		// @43A: iload_2
		// @43B: ifne @451
		// @43E: goto @442
		// @441: athrow
		// @442: getstatic boolean game.C_100003_ga.field_103535_w
		// @445: ifne @451
		// @448: goto @44C
		// @44B: athrow
		// @44C: iconst_1
		// @44D: goto @452
		// @450: athrow
		// @451: iconst_0
		// @452: bipush 124 (0x7C)
		// @454: invokevirtual game.C_100302_ka.func_101819_a(boolean, byte)void
		// @457: getstatic game.C_100302_ka game.C_100159_sn.field_105402_b
		// @45A: iload_3
		// @45B: ifeq @475
		// @45E: iload_2
		// @45F: ifne @475
		// @462: goto @466
		// @465: athrow
		// @466: getstatic boolean game.C_100003_ga.field_103535_w
		// @469: ifeq @475
		// @46C: goto @470
		// @46F: athrow
		// @470: iconst_1
		// @471: goto @476
		// @474: athrow
		// @475: iconst_0
		// @476: bipush -107 (0x95)
		// @478: invokevirtual game.C_100302_ka.func_101819_a(boolean, byte)void
		// @47B: getstatic game.C_100220_ac game.C_100091_m.field_104516_c
		// @47E: getfield game.C_100172_ck game.C_100220_ac.field_106059_a
		// @481: iconst_0
		// @482: invokevirtual game.C_100172_ck.func_102099_b(boolean)void
		// @485: getstatic game.C_100211_qd game.SteelSentinels.field_105274_N
		// @488: ifnonnull @48F
		// @48B: goto @4D9
		// @48E: athrow
		// @48F: getstatic game.C_100302_ka game.C_100200_ba.field_105847_f
		// @492: getfield int game.C_100302_ka.field_101854_N
		// @495: ifeq @4A2
		// @498: iload_1
		// @499: bipush 82 (0x52)
		// @49B: invokestatic game.C_100089_fa.func_103721_a(int, byte)void
		// @49E: goto @4A2
		// @4A1: athrow
		// @4A2: getstatic game.C_100302_ka game.C_100083_c.field_103164_U
		// @4A5: getfield int game.C_100302_ka.field_101854_N
		// @4A8: ifeq @4CC
		// @4AB: getstatic boolean game.C_100226_ae.field_106149_e
		// @4AE: ifeq @4C3
		// @4B1: goto @4B5
		// @4B4: athrow
		// @4B5: iconst_1
		// @4B6: iload_1
		// @4B7: invokestatic game.C_100009_fg.func_103651_a(boolean, int)void
		// @4BA: iload #12
		// @4BC: ifeq @4CC
		// @4BF: goto @4C3
		// @4C2: athrow
		// @4C3: iconst_2
		// @4C4: iload_1
		// @4C5: invokestatic game.C_100270_mi.func_102259_a(int, int)void
		// @4C8: goto @4CC
		// @4CB: athrow
		// @4CC: iload_1
		// @4CD: iconst_1
		// @4CE: iload_0
		// @4CF: sipush 4331 (0x10EB)
		// @4D2: iadd
		// @4D3: getstatic game.C_100211_qd game.SteelSentinels.field_105274_N
		// @4D6: invokestatic game.C_100244_pe.func_106363_a(int, boolean, int, game.C_100211_qd)void
		// @4D9: goto @51B
		// @4DC: astore #4
		// @4DE: aload #4
		// @4E0: new java.lang.StringBuilder
		// @4E3: dup
		// @4E4: invokespecial java.lang.StringBuilder.<init>()void
		// @4E7: getstatic java.lang.String[] game.C_100189_ri.field_105757_z
		// @4EA: bipush 9 (0x09)
		// @4EC: aaload
		// @4ED: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4F0: iload_0
		// @4F1: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4F4: bipush 44 (0x2C)
		// @4F6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4F9: iload_1
		// @4FA: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4FD: bipush 44 (0x2C)
		// @4FF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @502: iload_2
		// @503: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @506: bipush 44 (0x2C)
		// @508: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @50B: iload_3
		// @50C: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @50F: bipush 41 (0x29)
		// @511: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @514: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @517: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @51A: athrow
		// @51B: return
	}
	
	static final C_100236_on func_105750_a(int arg0, int arg1, C_100098_h arg2)
	{
		// @00: bipush 37 (0x25)
		// @02: bipush -25 (0xE7)
		// @04: iload_0
		// @05: isub
		// @06: bipush 62 (0x3E)
		// @08: idiv
		// @09: irem
		// @0A: istore #4
		// @0C: aload_2
		// @0D: iconst_0
		// @0E: iload_1
		// @0F: invokevirtual game.C_100098_h.func_104595_b(int, int)byte[]
		// @12: astore_3
		// @13: aconst_null
		// @14: aload_3
		// @15: if_acmpeq @1C
		// @18: goto @1E
		// @1B: athrow
		// @1C: aconst_null
		// @1D: areturn
		// @1E: new game.C_100236_on
		// @21: dup
		// @22: aload_3
		// @23: invokespecial game.C_100236_on.<init>(byte[])void
		// @26: areturn
		// @27: astore_3
		// @28: aload_3
		// @29: new java.lang.StringBuilder
		// @2C: dup
		// @2D: invokespecial java.lang.StringBuilder.<init>()void
		// @30: getstatic java.lang.String[] game.C_100189_ri.field_105757_z
		// @33: bipush 6 (0x06)
		// @35: aaload
		// @36: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @39: iload_0
		// @3A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3D: bipush 44 (0x2C)
		// @3F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @42: iload_1
		// @43: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @46: bipush 44 (0x2C)
		// @48: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4B: aload_2
		// @4C: ifnull @58
		// @4F: getstatic java.lang.String[] game.C_100189_ri.field_105757_z
		// @52: iconst_2
		// @53: aaload
		// @54: goto @5D
		// @57: athrow
		// @58: getstatic java.lang.String[] game.C_100189_ri.field_105757_z
		// @5B: iconst_3
		// @5C: aaload
		// @5D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @60: bipush 41 (0x29)
		// @62: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @65: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @68: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @6B: athrow
	}
	
	static final C_100193_re func_105744_a(boolean arg0, byte[] arg1)
	{
		// @00: aconst_null
		// @01: aload_1
		// @02: if_acmpeq @09
		// @05: goto @0B
		// @08: athrow
		// @09: aconst_null
		// @0A: areturn
		// @0B: iload_0
		// @0C: iconst_1
		// @0D: if_icmpeq @15
		// @10: aconst_null
		// @11: checkcast game.C_100193_re
		// @14: areturn
		// @15: new game.C_100193_re
		// @18: dup
		// @19: aload_1
		// @1A: getstatic int[] game.C_100068_vc.field_104340_f
		// @1D: getstatic int[] game.C_100012_fh.field_100509_M
		// @20: getstatic int[] game.C_100213_ak.field_105994_d
		// @23: getstatic int[] game.C_100312_ld.field_107156_c
		// @26: getstatic int[] game.C_100085_a.field_102573_H
		// @29: getstatic byte[][] game.C_100107_u.field_104774_c
		// @2C: invokespecial game.C_100193_re.<init>(byte[], int[], int[], int[], int[], int[], byte[][])void
		// @2F: astore_2
		// @30: bipush 93 (0x5D)
		// @32: invokestatic game.C_100030_gm.func_103336_a(byte)void
		// @35: aload_2
		// @36: areturn
		// @37: astore_2
		// @38: aload_2
		// @39: new java.lang.StringBuilder
		// @3C: dup
		// @3D: invokespecial java.lang.StringBuilder.<init>()void
		// @40: getstatic java.lang.String[] game.C_100189_ri.field_105757_z
		// @43: iconst_4
		// @44: aaload
		// @45: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @48: iload_0
		// @49: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @4C: bipush 44 (0x2C)
		// @4E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @51: aload_1
		// @52: ifnull @5E
		// @55: getstatic java.lang.String[] game.C_100189_ri.field_105757_z
		// @58: iconst_2
		// @59: aaload
		// @5A: goto @63
		// @5D: athrow
		// @5E: getstatic java.lang.String[] game.C_100189_ri.field_105757_z
		// @61: iconst_3
		// @62: aaload
		// @63: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @66: bipush 41 (0x29)
		// @68: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @6E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @71: athrow
	}
	
	static
	{
		// @00: bipush 15 (0x0F)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "gDF\n\u0010"
		// @09: invokestatic game.C_100189_ri.func_105747_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100189_ri.func_105746_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "gDF\u0008\u0010"
		// @14: invokestatic game.C_100189_ri.func_105747_z(java.lang.String)char[]
		// @17: invokestatic game.C_100189_ri.func_105746_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "n\u0003FcE"
		// @1F: invokestatic game.C_100189_ri.func_105747_z(java.lang.String)char[]
		// @22: invokestatic game.C_100189_ri.func_105746_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "{X\u0004!"
		// @2A: invokestatic game.C_100189_ri.func_105747_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100189_ri.func_105746_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "gDF\t\u0010"
		// @35: invokestatic game.C_100189_ri.func_105747_z(java.lang.String)char[]
		// @38: invokestatic game.C_100189_ri.func_105746_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "gDF\u000b\u0010"
		// @40: invokestatic game.C_100189_ri.func_105747_z(java.lang.String)char[]
		// @43: invokestatic game.C_100189_ri.func_105746_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "gDF\u000e\u0010"
		// @4C: invokestatic game.C_100189_ri.func_105747_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100189_ri.func_105746_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "gDF\u000f\u0010"
		// @58: invokestatic game.C_100189_ri.func_105747_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100189_ri.func_105746_z(char[])java.lang.String
		// @5E: aastore
		// @5F: dup
		// @60: bipush 8 (0x08)
		// @62: ldc ")N\u0007!\u0005T\u001dX}\u0008%\u0013"
		// @64: invokestatic game.C_100189_ri.func_105747_z(java.lang.String)char[]
		// @67: invokestatic game.C_100189_ri.func_105746_z(char[])java.lang.String
		// @6A: aastore
		// @6B: dup
		// @6C: bipush 9 (0x09)
		// @6E: ldc "gDF\u000c\u0010"
		// @70: invokestatic game.C_100189_ri.func_105747_z(java.lang.String)char[]
		// @73: invokestatic game.C_100189_ri.func_105746_z(char[])java.lang.String
		// @76: aastore
		// @77: dup
		// @78: bipush 10 (0x0A)
		// @7A: ldc ")\u0002\u000b\"T+"
		// @7C: invokestatic game.C_100189_ri.func_105747_z(java.lang.String)char[]
		// @7F: invokestatic game.C_100189_ri.func_105746_z(char[])java.lang.String
		// @82: aastore
		// @83: dup
		// @84: bipush 11 (0x0B)
		// @86: ldc "9\r"
		// @88: invokestatic game.C_100189_ri.func_105747_z(java.lang.String)char[]
		// @8B: invokestatic game.C_100189_ri.func_105746_z(char[])java.lang.String
		// @8E: aastore
		// @8F: dup
		// @90: bipush 12 (0x0C)
		// @92: ldc ")O\u001as"
		// @94: invokestatic game.C_100189_ri.func_105747_z(java.lang.String)char[]
		// @97: invokestatic game.C_100189_ri.func_105746_z(char[])java.lang.String
		// @9A: aastore
		// @9B: dup
		// @9C: bipush 13 (0x0D)
		// @9E: ldc ";\u0003F"
		// @A0: invokestatic game.C_100189_ri.func_105747_z(java.lang.String)char[]
		// @A3: invokestatic game.C_100189_ri.func_105746_z(char[])java.lang.String
		// @A6: aastore
		// @A7: dup
		// @A8: bipush 14 (0x0E)
		// @AA: ldc ";\u0003"
		// @AC: invokestatic game.C_100189_ri.func_105747_z(java.lang.String)char[]
		// @AF: invokestatic game.C_100189_ri.func_105746_z(char[])java.lang.String
		// @B2: aastore
		// @B3: putstatic java.lang.String[] game.C_100189_ri.field_105757_z
		// @B6: iconst_0
		// @B7: putstatic boolean game.C_100189_ri.field_105753_e
		// @BA: new game.C_100202_qi
		// @BD: dup
		// @BE: invokespecial game.C_100202_qi.<init>()void
		// @C1: putstatic game.C_100202_qi game.C_100189_ri.field_105754_b
		// @C4: new game.C_100217_ao
		// @C7: dup
		// @C8: bipush 8 (0x08)
		// @CA: iconst_0
		// @CB: iconst_4
		// @CC: iconst_1
		// @CD: invokespecial game.C_100217_ao.<init>(int, int, int, int)void
		// @D0: putstatic game.C_100217_ao game.C_100189_ri.field_105751_f
		// @D3: ldc "GH\u0004\"Yq\r\u000f,Up"
		// @D5: invokestatic game.C_100189_ri.func_105747_z(java.lang.String)char[]
		// @D8: invokestatic game.C_100189_ri.func_105746_z(char[])java.lang.String
		// @DB: putstatic java.lang.String game.C_100189_ri.field_105756_a
		// @DE: return
	}
	
	private static char[] func_105747_z(String arg0)
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
		// @0E: bipush 56 (0x38)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_105746_z(char[] arg0)
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
		// @30: bipush 21 (0x15)
		// @32: goto @46
		// @35: bipush 45 (0x2D)
		// @37: goto @46
		// @3A: bipush 104 (0x68)
		// @3C: goto @46
		// @3F: bipush 77 (0x4D)
		// @41: goto @46
		// @44: bipush 56 (0x38)
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
