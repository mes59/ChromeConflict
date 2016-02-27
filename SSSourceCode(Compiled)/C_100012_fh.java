package game;

final class C_100012_fh extends C_100114_q
{
	static int[] field_100519_S;
	static int[] field_100513_I;
	static int[] field_100508_L;
	static String field_100511_O;
	static int[] field_100504_D;
	static int[][] field_100515_K;
	static volatile int field_100514_J;
	static volatile int field_100520_R;
	static int field_100518_P;
	static String field_100512_H;
	static char field_100517_Q;
	static int field_100506_F;
	static C_100100_i field_100507_G;
	static String field_100505_E;
	static int[] field_100509_M;
	static String field_100510_N;
	private static final String[] field_100516_T;
	
	private C_100012_fh(C_100112_r arg0, int arg1)
	{
		// @0: aload_0
		// @1: aload_1
		// @2: iload_2
		// @3: invokespecial game.C_100114_q.<init>(game.C_100112_r, int)void
		// @6: return
	}
	
	static final boolean func_100501_d(int arg0)
	{
		// @00: iload_0
		// @01: sipush -25065 (0x9E17)
		// @04: if_icmpeq @09
		// @07: iconst_0
		// @08: ireturn
		// @09: bipush -25 (0xE7)
		// @0B: invokestatic game.C_100234_ob.func_106268_c(byte)boolean
		// @0E: ifne @1B
		// @11: getstatic int game.C_100212_qc.field_105976_b
		// @14: ifgt @20
		// @17: goto @1B
		// @1A: athrow
		// @1B: iconst_1
		// @1C: goto @21
		// @1F: athrow
		// @20: iconst_0
		// @21: ireturn
		// @22: astore_1
		// @23: aload_1
		// @24: new java.lang.StringBuilder
		// @27: dup
		// @28: invokespecial java.lang.StringBuilder.<init>()void
		// @2B: getstatic java.lang.String[] game.C_100012_fh.field_100516_T
		// @2E: bipush 7 (0x07)
		// @30: aaload
		// @31: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @34: iload_0
		// @35: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @38: bipush 41 (0x29)
		// @3A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @40: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @43: athrow
	}
	
	C_100012_fh(int arg0)
	{
		// @0: aload_0
		// @1: getstatic game.C_100112_r game.C_100230_of.field_106205_g
		// @4: iload_1
		// @5: invokespecial game.C_100012_fh.<init>(game.C_100112_r, int)void
		// @8: return
	}
	
	static final String func_100497_f(int arg0)
	{
		// @00: aconst_null
		// @01: getstatic java.lang.String game.C_100339_jb.field_107391_h
		// @04: if_acmpne @0A
		// @07: ldc ""
		// @09: areturn
		// @0A: iload_0
		// @0B: sipush 400 (0x0190)
		// @0E: if_icmpeq @1A
		// @11: bipush -88 (0xA8)
		// @13: putstatic int game.C_100012_fh.field_100518_P
		// @16: goto @1A
		// @19: athrow
		// @1A: getstatic java.lang.String game.C_100339_jb.field_107391_h
		// @1D: areturn
		// @1E: astore_1
		// @1F: aload_1
		// @20: new java.lang.StringBuilder
		// @23: dup
		// @24: invokespecial java.lang.StringBuilder.<init>()void
		// @27: getstatic java.lang.String[] game.C_100012_fh.field_100516_T
		// @2A: iconst_0
		// @2B: aaload
		// @2C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2F: iload_0
		// @30: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @33: bipush 41 (0x29)
		// @35: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @38: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3E: athrow
	}
	
	static final void func_100503_a(C_100131_te arg0, byte arg1, int arg2)
	{
		// @00: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @03: astore_3
		// @04: aload_3
		// @05: iload_2
		// @06: bipush 119 (0x77)
		// @08: invokevirtual game.C_100278_nd.func_101189_h(int, int)void
		// @0B: aload_3
		// @0C: dup
		// @0D: getfield int game.C_100278_nd.field_101177_n
		// @10: iconst_1
		// @11: iadd
		// @12: putfield int game.C_100278_nd.field_101177_n
		// @15: aload_3
		// @16: getfield int game.C_100278_nd.field_101177_n
		// @19: istore #4
		// @1B: aload_3
		// @1C: iload_1
		// @1D: sipush -7892 (0xE12C)
		// @20: ixor
		// @21: iconst_1
		// @22: invokevirtual game.C_100278_nd.func_101169_f(int, int)void
		// @25: aconst_null
		// @26: aload_0
		// @27: getfield byte[] game.C_100131_te.field_100765_k
		// @2A: if_acmpne @3F
		// @2D: aload_3
		// @2E: sipush 7838 (0x1E9E)
		// @31: iconst_0
		// @32: invokevirtual game.C_100278_nd.func_101169_f(int, int)void
		// @35: getstatic int game.SteelSentinels.field_105275_O
		// @38: ifeq @5F
		// @3B: goto @3F
		// @3E: athrow
		// @3F: aload_3
		// @40: sipush 7838 (0x1E9E)
		// @43: aload_0
		// @44: getfield byte[] game.C_100131_te.field_100765_k
		// @47: arraylength
		// @48: invokevirtual game.C_100278_nd.func_101169_f(int, int)void
		// @4B: aload_3
		// @4C: aload_0
		// @4D: getfield byte[] game.C_100131_te.field_100765_k
		// @50: iconst_0
		// @51: aload_0
		// @52: getfield byte[] game.C_100131_te.field_100765_k
		// @55: arraylength
		// @56: bipush -40 (0xD8)
		// @58: invokevirtual game.C_100278_nd.func_101165_b(byte[], int, int, int)void
		// @5B: goto @5F
		// @5E: athrow
		// @5F: aload_3
		// @60: iload #4
		// @62: sipush -16384 (0xC000)
		// @65: invokevirtual game.C_100278_nd.func_101157_b(int, int)int
		// @68: pop
		// @69: aload_3
		// @6A: dup
		// @6B: getfield int game.C_100278_nd.field_101177_n
		// @6E: iconst_4
		// @6F: isub
		// @70: putfield int game.C_100278_nd.field_101177_n
		// @73: aload_0
		// @74: aload_3
		// @75: sipush -1543 (0xF9F9)
		// @78: invokevirtual game.C_100278_nd.func_101171_e(int)int
		// @7B: putfield int game.C_100131_te.field_100761_l
		// @7E: iload_1
		// @7F: bipush -78 (0xB2)
		// @81: if_icmpeq @92
		// @84: aconst_null
		// @85: checkcast int[][]
		// @88: checkcast int[][]
		// @8B: putstatic int[][] game.C_100012_fh.field_100515_K
		// @8E: goto @92
		// @91: athrow
		// @92: aload_3
		// @93: aload_3
		// @94: getfield int game.C_100278_nd.field_101177_n
		// @97: iload #4
		// @99: isub
		// @9A: bipush -108 (0x94)
		// @9C: invokevirtual game.C_100278_nd.func_101139_c(int, byte)void
		// @9F: goto @E6
		// @A2: astore_3
		// @A3: aload_3
		// @A4: new java.lang.StringBuilder
		// @A7: dup
		// @A8: invokespecial java.lang.StringBuilder.<init>()void
		// @AB: getstatic java.lang.String[] game.C_100012_fh.field_100516_T
		// @AE: iconst_5
		// @AF: aaload
		// @B0: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @B3: aload_0
		// @B4: ifnull @C0
		// @B7: getstatic java.lang.String[] game.C_100012_fh.field_100516_T
		// @BA: iconst_3
		// @BB: aaload
		// @BC: goto @C5
		// @BF: athrow
		// @C0: getstatic java.lang.String[] game.C_100012_fh.field_100516_T
		// @C3: iconst_1
		// @C4: aaload
		// @C5: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @C8: bipush 44 (0x2C)
		// @CA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @CD: iload_1
		// @CE: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @D1: bipush 44 (0x2C)
		// @D3: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D6: iload_2
		// @D7: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @DA: bipush 41 (0x29)
		// @DC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @DF: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @E2: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @E5: athrow
		// @E6: return
	}
	
	public static void func_100502_g(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic int[] game.C_100012_fh.field_100508_L
		// @04: aconst_null
		// @05: putstatic java.lang.String game.C_100012_fh.field_100510_N
		// @08: aconst_null
		// @09: putstatic java.lang.String game.C_100012_fh.field_100505_E
		// @0C: aconst_null
		// @0D: putstatic int[] game.C_100012_fh.field_100513_I
		// @10: aconst_null
		// @11: checkcast int[][]
		// @14: putstatic int[][] game.C_100012_fh.field_100515_K
		// @17: aconst_null
		// @18: putstatic java.lang.String game.C_100012_fh.field_100511_O
		// @1B: aconst_null
		// @1C: putstatic java.lang.String game.C_100012_fh.field_100512_H
		// @1F: aconst_null
		// @20: putstatic int[] game.C_100012_fh.field_100519_S
		// @23: aconst_null
		// @24: putstatic game.C_100100_i game.C_100012_fh.field_100507_G
		// @27: iload_0
		// @28: sipush 14503 (0x38A7)
		// @2B: if_icmpeq @2F
		// @2E: return
		// @2F: aconst_null
		// @30: putstatic int[] game.C_100012_fh.field_100509_M
		// @33: aconst_null
		// @34: putstatic int[] game.C_100012_fh.field_100504_D
		// @37: goto @5C
		// @3A: astore_1
		// @3B: aload_1
		// @3C: new java.lang.StringBuilder
		// @3F: dup
		// @40: invokespecial java.lang.StringBuilder.<init>()void
		// @43: getstatic java.lang.String[] game.C_100012_fh.field_100516_T
		// @46: bipush 6 (0x06)
		// @48: aaload
		// @49: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4C: iload_0
		// @4D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @50: bipush 41 (0x29)
		// @52: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @55: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @58: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @5B: athrow
		// @5C: return
	}
	
	static final C_100302_ka func_100496_a(int arg0, int arg1, int[] arg2)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #22
		// @005: getstatic int game.C_100233_oa.field_106250_h
		// @008: istore_3
		// @009: bipush 100 (0x64)
		// @00B: iload_1
		// @00C: iadd
		// @00D: istore #4
		// @00F: bipush 78 (0x4E)
		// @011: istore #5
		// @013: bipush 66 (0x42)
		// @015: istore #6
		// @017: new game.C_100302_ka
		// @01A: dup
		// @01B: iload #4
		// @01D: i2l
		// @01E: getstatic game.C_100302_ka game.C_100042_we.field_104131_r
		// @021: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @024: astore #7
		// @026: getstatic game.C_100302_ka[] game.C_100063_dj.field_104290_f
		// @029: iload #4
		// @02B: aload #7
		// @02D: aastore
		// @02E: aload #7
		// @030: getstatic game.C_100037_wb[] game.C_100200_ba.field_105851_b
		// @033: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @036: aload #7
		// @038: getstatic game.C_100037_wb[] game.C_100316_lc.field_102411_v
		// @03B: putfield game.C_100037_wb[] game.C_100302_ka.field_101883_qb
		// @03E: new game.C_100302_ka
		// @041: dup
		// @042: iload #4
		// @044: i2l
		// @045: aconst_null
		// @046: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @049: astore #8
		// @04B: aload #8
		// @04D: iconst_2
		// @04E: iload #5
		// @050: iconst_4
		// @051: isub
		// @052: iconst_m1
		// @053: iconst_2
		// @054: iload #6
		// @056: bipush -4 (0xFC)
		// @058: iadd
		// @059: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @05C: aload #8
		// @05E: getstatic game.C_100037_wb[] game.C_100287_nm.field_106829_l
		// @061: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @064: getstatic game.C_100037_wb[] game.C_100122_em.field_102075_ec
		// @067: iload_1
		// @068: iconst_m1
		// @069: iadd
		// @06A: aaload
		// @06B: ifnull @072
		// @06E: goto @07C
		// @071: athrow
		// @072: sipush 1000 (0x03E8)
		// @075: aconst_null
		// @076: iconst_m1
		// @077: iload_1
		// @078: iadd
		// @079: invokestatic game.C_100013_fn.func_103736_a(int, game.C_100327_ib, int)void
		// @07C: aload #8
		// @07E: getstatic game.C_100037_wb[] game.C_100122_em.field_102075_ec
		// @081: iload_1
		// @082: iconst_1
		// @083: isub
		// @084: aaload
		// @085: putfield game.C_100037_wb game.C_100302_ka.field_101887_nb
		// @088: aload #7
		// @08A: bipush -103 (0x99)
		// @08C: aload #8
		// @08E: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @091: new game.C_100302_ka
		// @094: dup
		// @095: iload #4
		// @097: i2l
		// @098: getstatic game.C_100302_ka game.C_100286_nl.field_106813_m
		// @09B: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @09E: astore #9
		// @0A0: aload_2
		// @0A1: arraylength
		// @0A2: bipush -8 (0xF8)
		// @0A4: iadd
		// @0A5: newarray int[]
		// @0A7: astore #10
		// @0A9: aload_2
		// @0AA: iconst_0
		// @0AB: aload #10
		// @0AD: iconst_0
		// @0AE: bipush -8 (0xF8)
		// @0B0: aload_2
		// @0B1: arraylength
		// @0B2: iadd
		// @0B3: invokestatic game.C_100120_en.func_104913_a(int[], int, int[], int, int)void
		// @0B6: bipush 8 (0x08)
		// @0B8: newarray int[]
		// @0BA: astore #11
		// @0BC: aload_2
		// @0BD: aload_2
		// @0BE: arraylength
		// @0BF: bipush -8 (0xF8)
		// @0C1: iadd
		// @0C2: aload #11
		// @0C4: iconst_0
		// @0C5: bipush 8 (0x08)
		// @0C7: invokestatic game.C_100120_en.func_104913_a(int[], int, int[], int, int)void
		// @0CA: aload #9
		// @0CC: aload #10
		// @0CE: aload #11
		// @0D0: bipush 55 (0x37)
		// @0D2: invokestatic game.C_100220_ac.func_106050_a(int[], int[], int)java.lang.String
		// @0D5: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @0D8: aload #9
		// @0DA: ldc 1021128 (0xf94c8)
		// @0DC: putfield int game.C_100302_ka.field_101830_gb
		// @0DF: aload #9
		// @0E1: iload #6
		// @0E3: bipush -2 (0xFE)
		// @0E5: iadd
		// @0E6: bipush -4 (0xFC)
		// @0E8: iload #5
		// @0EA: bipush -15 (0xF1)
		// @0EC: iadd
		// @0ED: iadd
		// @0EE: iconst_m1
		// @0EF: iconst_2
		// @0F0: iload_3
		// @0F1: iload #6
		// @0F3: isub
		// @0F4: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @0F7: aload #9
		// @0F9: bipush 10 (0x0A)
		// @0FB: putfield int game.C_100302_ka.field_101833_ob
		// @0FE: aload #7
		// @100: bipush -101 (0x9B)
		// @102: aload #9
		// @104: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @107: new game.C_100302_ka
		// @10A: dup
		// @10B: getstatic java.lang.String[] game.C_100012_fh.field_100516_T
		// @10E: bipush 11 (0x0B)
		// @110: aaload
		// @111: aconst_null
		// @112: invokespecial game.C_100302_ka.<init>(java.lang.String, game.C_100302_ka)void
		// @115: astore #12
		// @117: iconst_3
		// @118: getstatic game.C_100037_wb[] game.C_100219_an.field_100878_m
		// @11B: iconst_0
		// @11C: aaload
		// @11D: getfield int game.C_100037_wb.field_102341_y
		// @120: iadd
		// @121: istore #13
		// @123: getstatic game.C_100037_wb[] game.C_100219_an.field_100878_m
		// @126: iconst_0
		// @127: aaload
		// @128: getfield int game.C_100037_wb.field_102340_z
		// @12B: bipush -3 (0xFD)
		// @12D: isub
		// @12E: istore #14
		// @130: aload #12
		// @132: sipush 174 (0x00AE)
		// @135: iload #13
		// @137: ineg
		// @138: iadd
		// @139: iload #14
		// @13B: iconst_m1
		// @13C: iload #14
		// @13E: ineg
		// @13F: iload #5
		// @141: iconst_3
		// @142: isub
		// @143: iadd
		// @144: iload #13
		// @146: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @149: aload #12
		// @14B: iconst_2
		// @14C: putfield int game.C_100302_ka.field_101875_X
		// @14F: aload #12
		// @151: aconst_null
		// @152: putfield game.C_100037_wb[] game.C_100302_ka.field_101883_qb
		// @155: aload #12
		// @157: getstatic game.C_100037_wb[] game.C_100219_an.field_100878_m
		// @15A: iconst_0
		// @15B: aaload
		// @15C: putfield game.C_100037_wb game.C_100302_ka.field_101887_nb
		// @15F: aload #12
		// @161: iconst_2
		// @162: putfield int game.C_100302_ka.field_101846_Ib
		// @165: iload_0
		// @166: bipush -27 (0xE5)
		// @168: if_icmplt @17A
		// @16B: aconst_null
		// @16C: checkcast game.C_100131_te
		// @16F: bipush 61 (0x3D)
		// @171: bipush -105 (0x97)
		// @173: invokestatic game.C_100012_fh.func_100503_a(game.C_100131_te, byte, int)void
		// @176: goto @17A
		// @179: athrow
		// @17A: aload #12
		// @17C: getstatic game.C_100037_wb[] game.C_100219_an.field_100878_m
		// @17F: iconst_1
		// @180: aaload
		// @181: putfield game.C_100037_wb game.C_100302_ka.field_101844_pb
		// @184: aload #12
		// @186: aconst_null
		// @187: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @18A: aload #7
		// @18C: bipush -86 (0xAA)
		// @18E: aload #12
		// @190: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @193: iconst_0
		// @194: istore #15
		// @196: aload #11
		// @198: astore #16
		// @19A: iconst_0
		// @19B: istore #17
		// @19D: iload #17
		// @19F: iconst_m1
		// @1A0: ixor
		// @1A1: aload #16
		// @1A3: arraylength
		// @1A4: iconst_m1
		// @1A5: ixor
		// @1A6: if_icmple @1CC
		// @1A9: aload #16
		// @1AB: iload #17
		// @1AD: iaload
		// @1AE: istore #18
		// @1B0: iload #18
		// @1B2: iload #22
		// @1B4: ifne @1CD
		// @1B7: ifge @1C1
		// @1BA: goto @1BE
		// @1BD: athrow
		// @1BE: goto @1C4
		// @1C1: iinc #15 +1
		// @1C4: iinc #17 +1
		// @1C7: iload #22
		// @1C9: ifeq @19D
		// @1CC: iconst_0
		// @1CD: iload #15
		// @1CF: if_icmpge @297
		// @1D2: new game.C_100037_wb
		// @1D5: dup
		// @1D6: bipush 20 (0x14)
		// @1D8: iload #15
		// @1DA: iconst_4
		// @1DB: invokestatic java.lang.Math.min(int, int)int
		// @1DE: imul
		// @1DF: bipush 20 (0x14)
		// @1E1: iload #15
		// @1E3: iconst_4
		// @1E4: idiv
		// @1E5: bipush 20 (0x14)
		// @1E7: imul
		// @1E8: iadd
		// @1E9: invokespecial game.C_100037_wb.<init>(int, int)void
		// @1EC: astore #16
		// @1EE: iconst_0
		// @1EF: istore #15
		// @1F1: aload #16
		// @1F3: invokevirtual game.C_100037_wb.func_102379_d()void
		// @1F6: iconst_0
		// @1F7: istore #17
		// @1F9: iconst_0
		// @1FA: istore #18
		// @1FC: aload #11
		// @1FE: astore #19
		// @200: iconst_0
		// @201: istore #20
		// @203: iload #20
		// @205: iconst_m1
		// @206: ixor
		// @207: aload #19
		// @209: arraylength
		// @20A: iconst_m1
		// @20B: ixor
		// @20C: if_icmple @25E
		// @20F: aload #19
		// @211: iload #20
		// @213: iaload
		// @214: istore #21
		// @216: iload #21
		// @218: iconst_m1
		// @219: ixor
		// @21A: iload #22
		// @21C: ifne @298
		// @21F: iconst_m1
		// @220: if_icmple @22B
		// @223: goto @227
		// @226: athrow
		// @227: goto @256
		// @22A: athrow
		// @22B: getstatic game.C_100153_be[] game.C_100242_oh.field_106347_a
		// @22E: iload #21
		// @230: aaload
		// @231: iload #17
		// @233: iload #18
		// @235: invokevirtual game.C_100153_be.func_105318_c(int, int)void
		// @238: iinc #15 +1
		// @23B: iload #15
		// @23D: iconst_m1
		// @23E: ixor
		// @23F: bipush -5 (0xFB)
		// @241: if_icmpne @24F
		// @244: iconst_0
		// @245: istore #17
		// @247: iinc #18 +20
		// @24A: iload #22
		// @24C: ifeq @256
		// @24F: iinc #17 +20
		// @252: goto @256
		// @255: athrow
		// @256: iinc #20 +1
		// @259: iload #22
		// @25B: ifeq @203
		// @25E: getstatic game.C_100185_rm game.C_100049_vf.field_104206_l
		// @261: bipush 113 (0x71)
		// @263: invokevirtual game.C_100185_rm.func_105476_a(byte)void
		// @266: new game.C_100302_ka
		// @269: dup
		// @26A: iload #4
		// @26C: i2l
		// @26D: aconst_null
		// @26E: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @271: astore #19
		// @273: aload #19
		// @275: aload #16
		// @277: putfield game.C_100037_wb game.C_100302_ka.field_101887_nb
		// @27A: aload #19
		// @27C: iload #6
		// @27E: aload #16
		// @280: getfield int game.C_100037_wb.field_102340_z
		// @283: iconst_m1
		// @284: bipush 20 (0x14)
		// @286: aload #16
		// @288: getfield int game.C_100037_wb.field_102341_y
		// @28B: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @28E: aload #7
		// @290: bipush -112 (0x90)
		// @292: aload #19
		// @294: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @297: iconst_0
		// @298: istore #16
		// @29A: aload #10
		// @29C: astore #17
		// @29E: iconst_0
		// @29F: istore #18
		// @2A1: aload #17
		// @2A3: arraylength
		// @2A4: iload #18
		// @2A6: if_icmple @2D6
		// @2A9: aload #17
		// @2AB: iload #18
		// @2AD: iaload
		// @2AE: istore #19
		// @2B0: iconst_0
		// @2B1: iload #22
		// @2B3: ifne @2D7
		// @2B6: iload #19
		// @2B8: if_icmple @2C3
		// @2BB: goto @2BF
		// @2BE: athrow
		// @2BF: goto @2CE
		// @2C2: athrow
		// @2C3: iload #16
		// @2C5: getstatic int[] game.C_100064_ve.field_103015_v
		// @2C8: iload #19
		// @2CA: iaload
		// @2CB: iadd
		// @2CC: istore #16
		// @2CE: iinc #18 +1
		// @2D1: iload #22
		// @2D3: ifeq @2A1
		// @2D6: iconst_0
		// @2D7: istore #17
		// @2D9: aload #11
		// @2DB: astore #18
		// @2DD: iconst_0
		// @2DE: istore #19
		// @2E0: aload #18
		// @2E2: arraylength
		// @2E3: iconst_m1
		// @2E4: ixor
		// @2E5: iload #19
		// @2E7: iconst_m1
		// @2E8: ixor
		// @2E9: if_icmpge @32C
		// @2EC: aload #18
		// @2EE: iload #19
		// @2F0: iaload
		// @2F1: istore #20
		// @2F3: bipush -35 (0xDD)
		// @2F5: iload #20
		// @2F7: iconst_m1
		// @2F8: ixor
		// @2F9: if_icmpeq @300
		// @2FC: goto @30D
		// @2FF: athrow
		// @300: sipush 6100 (0x17D4)
		// @303: istore #16
		// @305: iconst_1
		// @306: istore #17
		// @308: iload #22
		// @30A: ifeq @32C
		// @30D: iconst_m1
		// @30E: iload #20
		// @310: iconst_m1
		// @311: ixor
		// @312: if_icmplt @324
		// @315: goto @319
		// @318: athrow
		// @319: iload #16
		// @31B: getstatic int[] game.C_100021_wn.field_103870_e
		// @31E: iload #20
		// @320: iaload
		// @321: iadd
		// @322: istore #16
		// @324: iinc #19 +1
		// @327: iload #22
		// @329: ifeq @2E0
		// @32C: new game.C_100302_ka
		// @32F: dup
		// @330: iload #4
		// @332: i2l
		// @333: getstatic game.C_100302_ka game.C_100286_nl.field_106813_m
		// @336: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @339: astore #18
		// @33B: aload #18
		// @33D: bipush -6 (0xFA)
		// @33F: iload #6
		// @341: iadd
		// @342: bipush -4 (0xFC)
		// @344: iload #5
		// @346: bipush -15 (0xF1)
		// @348: iadd
		// @349: iadd
		// @34A: iconst_m1
		// @34B: bipush 60 (0x3C)
		// @34D: bipush 6 (0x06)
		// @34F: iload #6
		// @351: ineg
		// @352: iadd
		// @353: aload #12
		// @355: getfield int game.C_100302_ka.field_101841_Pb
		// @358: iadd
		// @359: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @35C: aload #18
		// @35E: ldc 749462 (0xb6f96)
		// @360: putfield int game.C_100302_ka.field_101830_gb
		// @363: aload #18
		// @365: bipush 10 (0x0A)
		// @367: putfield int game.C_100302_ka.field_101833_ob
		// @36A: aload #18
		// @36C: new java.lang.StringBuilder
		// @36F: dup
		// @370: invokespecial java.lang.StringBuilder.<init>()void
		// @373: getstatic java.lang.String[] game.C_100012_fh.field_100516_T
		// @376: bipush 9 (0x09)
		// @378: aaload
		// @379: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @37C: iload #17
		// @37E: ifne @39A
		// @381: sipush 6100 (0x17D4)
		// @384: iload #16
		// @386: if_icmpge @394
		// @389: goto @38D
		// @38C: athrow
		// @38D: getstatic java.lang.String game.C_100342_jg.field_102720_Wb
		// @390: goto @3A0
		// @393: athrow
		// @394: getstatic java.lang.String game.C_100017_wj.field_103820_a
		// @397: goto @3A0
		// @39A: getstatic java.lang.String[] game.C_100012_fh.field_100516_T
		// @39D: bipush 10 (0x0A)
		// @39F: aaload
		// @3A0: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3A3: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3A6: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @3A9: aload #7
		// @3AB: bipush -106 (0x96)
		// @3AD: aload #18
		// @3AF: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @3B2: aload #7
		// @3B4: areturn
		// @3B5: astore_3
		// @3B6: aload_3
		// @3B7: new java.lang.StringBuilder
		// @3BA: dup
		// @3BB: invokespecial java.lang.StringBuilder.<init>()void
		// @3BE: getstatic java.lang.String[] game.C_100012_fh.field_100516_T
		// @3C1: bipush 8 (0x08)
		// @3C3: aaload
		// @3C4: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3C7: iload_0
		// @3C8: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3CB: bipush 44 (0x2C)
		// @3CD: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3D0: iload_1
		// @3D1: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3D4: bipush 44 (0x2C)
		// @3D6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3D9: aload_2
		// @3DA: ifnull @3E6
		// @3DD: getstatic java.lang.String[] game.C_100012_fh.field_100516_T
		// @3E0: iconst_3
		// @3E1: aaload
		// @3E2: goto @3EB
		// @3E5: athrow
		// @3E6: getstatic java.lang.String[] game.C_100012_fh.field_100516_T
		// @3E9: iconst_1
		// @3EA: aaload
		// @3EB: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3EE: bipush 41 (0x29)
		// @3F0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3F3: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3F6: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3F9: athrow
	}
	
	final String func_100450_a(C_100336_im arg0, boolean arg1)
	{
		// @00: iload_2
		// @01: ifeq @14
		// @04: bipush 109 (0x6D)
		// @06: bipush 61 (0x3D)
		// @08: aconst_null
		// @09: checkcast int[]
		// @0C: invokestatic game.C_100012_fh.func_100496_a(int, int, int[])game.C_100302_ka
		// @0F: pop
		// @10: goto @14
		// @13: athrow
		// @14: aload_1
		// @15: getfield java.lang.String game.C_100336_im.field_102534_C
		// @18: invokevirtual java.lang.String.length()int
		// @1B: bipush 42 (0x2A)
		// @1D: sipush -3521 (0xF23F)
		// @20: invokestatic game.C_100106_ef.func_104745_a(int, char, int)java.lang.String
		// @23: areturn
		// @24: astore_3
		// @25: aload_3
		// @26: new java.lang.StringBuilder
		// @29: dup
		// @2A: invokespecial java.lang.StringBuilder.<init>()void
		// @2D: getstatic java.lang.String[] game.C_100012_fh.field_100516_T
		// @30: iconst_2
		// @31: aaload
		// @32: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @35: aload_1
		// @36: ifnull @42
		// @39: getstatic java.lang.String[] game.C_100012_fh.field_100516_T
		// @3C: iconst_3
		// @3D: aaload
		// @3E: goto @47
		// @41: athrow
		// @42: getstatic java.lang.String[] game.C_100012_fh.field_100516_T
		// @45: iconst_1
		// @46: aaload
		// @47: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4A: bipush 44 (0x2C)
		// @4C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4F: iload_2
		// @50: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @53: bipush 41 (0x29)
		// @55: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @58: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @5B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @5E: athrow
	}
	
	static final void func_100500_e(int arg0)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #5
		// @05: invokestatic game.C_100070_dn.func_104363_a()void
		// @08: bipush 11 (0x0B)
		// @0A: putstatic int game.C_100170_cm.field_105547_j
		// @0D: bipush 86 (0x56)
		// @0F: bipush 64 (0x40)
		// @11: iload_0
		// @12: isub
		// @13: bipush 34 (0x22)
		// @15: idiv
		// @16: idiv
		// @17: istore_1
		// @18: sipush 260 (0x0104)
		// @1B: newarray int[]
		// @1D: putstatic int[] game.C_100158_da.field_100591_g
		// @20: iconst_0
		// @21: istore_2
		// @22: sipush 256 (0x0100)
		// @25: iload_2
		// @26: if_icmple @52
		// @29: ldc2_w 15.0
		// @2C: dstore_3
		// @2D: getstatic int[] game.C_100158_da.field_100591_g
		// @30: iload_2
		// @31: ldc2_w 255.0
		// @34: iload_2
		// @35: i2f
		// @36: ldc 256.0
		// @38: fdiv
		// @39: f2d
		// @3A: dload_3
		// @3B: invokestatic java.lang.Math.pow(double, double)double
		// @3E: dmul
		// @3F: d2i
		// @40: iastore
		// @41: iinc #2 +1
		// @44: iload #5
		// @46: ifne @56
		// @49: iload #5
		// @4B: ifeq @22
		// @4E: goto @52
		// @51: athrow
		// @52: sipush 256 (0x0100)
		// @55: istore_2
		// @56: getstatic int[] game.C_100158_da.field_100591_g
		// @59: arraylength
		// @5A: iload_2
		// @5B: if_icmple @7B
		// @5E: getstatic int[] game.C_100158_da.field_100591_g
		// @61: iload_2
		// @62: sipush 255 (0x00FF)
		// @65: iastore
		// @66: iinc #2 +1
		// @69: iload #5
		// @6B: ifne @9F
		// @6E: goto @72
		// @71: athrow
		// @72: iload #5
		// @74: ifeq @56
		// @77: goto @7B
		// @7A: athrow
		// @7B: goto @9F
		// @7E: astore_1
		// @7F: aload_1
		// @80: new java.lang.StringBuilder
		// @83: dup
		// @84: invokespecial java.lang.StringBuilder.<init>()void
		// @87: getstatic java.lang.String[] game.C_100012_fh.field_100516_T
		// @8A: iconst_4
		// @8B: aaload
		// @8C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @8F: iload_0
		// @90: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @93: bipush 41 (0x29)
		// @95: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @98: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @9B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @9E: athrow
		// @9F: return
	}
	
	static
	{
		// @000: bipush 12 (0x0C)
		// @002: anewarray java.lang.String
		// @005: dup
		// @006: iconst_0
		// @007: ldc "(\u00089\u0013:"
		// @009: invokestatic game.C_100012_fh.func_100499_z(java.lang.String)char[]
		// @00C: invokestatic game.C_100012_fh.func_100498_z(char[])java.lang.String
		// @00F: aastore
		// @010: dup
		// @011: iconst_1
		// @012: ldc " \u0015{9"
		// @014: invokestatic game.C_100012_fh.func_100499_z(java.lang.String)char[]
		// @017: invokestatic game.C_100012_fh.func_100498_z(char[])java.lang.String
		// @01A: aastore
		// @01B: dup
		// @01C: iconst_2
		// @01D: ldc "(\u00089\u0013Sf"
		// @01F: invokestatic game.C_100012_fh.func_100499_z(java.lang.String)char[]
		// @022: invokestatic game.C_100012_fh.func_100498_z(char[])java.lang.String
		// @025: aastore
		// @026: dup
		// @027: iconst_3
		// @028: ldc "5N9{o"
		// @02A: invokestatic game.C_100012_fh.func_100499_z(java.lang.String)char[]
		// @02D: invokestatic game.C_100012_fh.func_100498_z(char[])java.lang.String
		// @030: aastore
		// @031: dup
		// @032: iconst_4
		// @033: ldc "(\u00089\u0017:"
		// @035: invokestatic game.C_100012_fh.func_100499_z(java.lang.String)char[]
		// @038: invokestatic game.C_100012_fh.func_100498_z(char[])java.lang.String
		// @03B: aastore
		// @03C: dup
		// @03D: iconst_5
		// @03E: ldc "(\u00089\u0016:"
		// @040: invokestatic game.C_100012_fh.func_100499_z(java.lang.String)char[]
		// @043: invokestatic game.C_100012_fh.func_100498_z(char[])java.lang.String
		// @046: aastore
		// @047: dup
		// @048: bipush 6 (0x06)
		// @04A: ldc "(\u00089\u0010:"
		// @04C: invokestatic game.C_100012_fh.func_100499_z(java.lang.String)char[]
		// @04F: invokestatic game.C_100012_fh.func_100498_z(char[])java.lang.String
		// @052: aastore
		// @053: dup
		// @054: bipush 7 (0x07)
		// @056: ldc "(\u00089\u0012:"
		// @058: invokestatic game.C_100012_fh.func_100499_z(java.lang.String)char[]
		// @05B: invokestatic game.C_100012_fh.func_100498_z(char[])java.lang.String
		// @05E: aastore
		// @05F: dup
		// @060: bipush 8 (0x08)
		// @062: ldc "(\u00089\u0014:"
		// @064: invokestatic game.C_100012_fh.func_100499_z(java.lang.String)char[]
		// @067: invokestatic game.C_100012_fh.func_100498_z(char[])java.lang.String
		// @06A: aastore
		// @06B: dup
		// @06C: bipush 9 (0x09)
		// @06E: ldc "r\tz2/\u007f^"
		// @070: invokestatic game.C_100012_fh.func_100499_z(java.lang.String)char[]
		// @073: invokestatic game.C_100012_fh.func_100498_z(char[])java.lang.String
		// @076: aastore
		// @077: dup
		// @078: bipush 10 (0x0A)
		// @07A: ldc "\u0003)P\u001dF\u0017"
		// @07C: invokestatic game.C_100012_fh.func_100499_z(java.lang.String)char[]
		// @07F: invokestatic game.C_100012_fh.func_100498_z(char[])java.lang.String
		// @082: aastore
		// @083: dup
		// @084: bipush 11 (0x0B)
		// @086: ldc ",\ty"
		// @088: invokestatic game.C_100012_fh.func_100499_z(java.lang.String)char[]
		// @08B: invokestatic game.C_100012_fh.func_100498_z(char[])java.lang.String
		// @08E: aastore
		// @08F: putstatic java.lang.String[] game.C_100012_fh.field_100516_T
		// @092: bipush 23 (0x17)
		// @094: newarray int[]
		// @096: putstatic int[] game.C_100012_fh.field_100508_L
		// @099: bipush 23 (0x17)
		// @09B: newarray int[]
		// @09D: putstatic int[] game.C_100012_fh.field_100513_I
		// @0A0: bipush 23 (0x17)
		// @0A2: newarray int[]
		// @0A4: putstatic int[] game.C_100012_fh.field_100504_D
		// @0A7: bipush 23 (0x17)
		// @0A9: newarray int[]
		// @0AB: putstatic int[] game.C_100012_fh.field_100519_S
		// @0AE: ldc "\u001d\u0008x\"2/\u000c{ub<\ta4f+@t=s:"
		// @0B0: invokestatic game.C_100012_fh.func_100499_z(java.lang.String)char[]
		// @0B3: invokestatic game.C_100012_fh.func_100498_z(char[])java.lang.String
		// @0B6: putstatic java.lang.String game.C_100012_fh.field_100511_O
		// @0B9: bipush 23 (0x17)
		// @0BB: anewarray int[]
		// @0BE: putstatic int[][] game.C_100012_fh.field_100515_K
		// @0C1: iconst_0
		// @0C2: putstatic int game.C_100012_fh.field_100520_R
		// @0C5: iconst_0
		// @0C6: putstatic int game.C_100012_fh.field_100514_J
		// @0C9: bipush -125 (0x83)
		// @0CB: sipush 460 (0x01CC)
		// @0CE: iconst_0
		// @0CF: sipush 180 (0x00B4)
		// @0D2: bipush 9 (0x09)
		// @0D4: newarray int[]
		// @0D6: dup
		// @0D7: iconst_0
		// @0D8: iconst_0
		// @0D9: iastore
		// @0DA: dup
		// @0DB: iconst_1
		// @0DC: iconst_1
		// @0DD: iastore
		// @0DE: dup
		// @0DF: iconst_2
		// @0E0: bipush 28 (0x1C)
		// @0E2: iastore
		// @0E3: dup
		// @0E4: iconst_3
		// @0E5: iconst_5
		// @0E6: iastore
		// @0E7: dup
		// @0E8: iconst_4
		// @0E9: bipush 35 (0x23)
		// @0EB: iastore
		// @0EC: dup
		// @0ED: iconst_5
		// @0EE: iconst_4
		// @0EF: iastore
		// @0F0: dup
		// @0F1: bipush 6 (0x06)
		// @0F3: bipush 22 (0x16)
		// @0F5: iastore
		// @0F6: dup
		// @0F7: bipush 7 (0x07)
		// @0F9: bipush 19 (0x13)
		// @0FB: iastore
		// @0FC: dup
		// @0FD: bipush 8 (0x08)
		// @0FF: bipush 34 (0x22)
		// @101: iastore
		// @102: bipush 30 (0x1E)
		// @104: sipush 160 (0x00A0)
		// @107: invokestatic game.C_100195_rc.func_105770_a(int, int, int, int, int[], int, int)void
		// @10A: bipush -83 (0xAD)
		// @10C: sipush 460 (0x01CC)
		// @10F: iconst_1
		// @110: sipush 180 (0x00B4)
		// @113: bipush 7 (0x07)
		// @115: newarray int[]
		// @117: dup
		// @118: iconst_0
		// @119: iconst_2
		// @11A: iastore
		// @11B: dup
		// @11C: iconst_1
		// @11D: bipush 20 (0x14)
		// @11F: iastore
		// @120: dup
		// @121: iconst_2
		// @122: bipush 21 (0x15)
		// @124: iastore
		// @125: dup
		// @126: iconst_3
		// @127: bipush 37 (0x25)
		// @129: iastore
		// @12A: dup
		// @12B: iconst_4
		// @12C: bipush 45 (0x2D)
		// @12E: iastore
		// @12F: dup
		// @130: iconst_5
		// @131: iconst_5
		// @132: iastore
		// @133: dup
		// @134: bipush 6 (0x06)
		// @136: bipush 9 (0x09)
		// @138: iastore
		// @139: bipush 30 (0x1E)
		// @13B: sipush 200 (0x00C8)
		// @13E: invokestatic game.C_100195_rc.func_105770_a(int, int, int, int, int[], int, int)void
		// @141: bipush -89 (0xA7)
		// @143: sipush 460 (0x01CC)
		// @146: iconst_2
		// @147: sipush 180 (0x00B4)
		// @14A: bipush 8 (0x08)
		// @14C: newarray int[]
		// @14E: dup
		// @14F: iconst_0
		// @150: iconst_2
		// @151: iastore
		// @152: dup
		// @153: iconst_1
		// @154: bipush 20 (0x14)
		// @156: iastore
		// @157: dup
		// @158: iconst_2
		// @159: bipush 21 (0x15)
		// @15B: iastore
		// @15C: dup
		// @15D: iconst_3
		// @15E: bipush 37 (0x25)
		// @160: iastore
		// @161: dup
		// @162: iconst_4
		// @163: bipush 45 (0x2D)
		// @165: iastore
		// @166: dup
		// @167: iconst_5
		// @168: iconst_5
		// @169: iastore
		// @16A: dup
		// @16B: bipush 6 (0x06)
		// @16D: bipush 11 (0x0B)
		// @16F: iastore
		// @170: dup
		// @171: bipush 7 (0x07)
		// @173: bipush 13 (0x0D)
		// @175: iastore
		// @176: bipush 30 (0x1E)
		// @178: sipush 200 (0x00C8)
		// @17B: invokestatic game.C_100195_rc.func_105770_a(int, int, int, int, int[], int, int)void
		// @17E: bipush -124 (0x84)
		// @180: sipush 460 (0x01CC)
		// @183: iconst_3
		// @184: sipush 180 (0x00B4)
		// @187: bipush 8 (0x08)
		// @189: newarray int[]
		// @18B: dup
		// @18C: iconst_0
		// @18D: iconst_2
		// @18E: iastore
		// @18F: dup
		// @190: iconst_1
		// @191: bipush 20 (0x14)
		// @193: iastore
		// @194: dup
		// @195: iconst_2
		// @196: bipush 21 (0x15)
		// @198: iastore
		// @199: dup
		// @19A: iconst_3
		// @19B: bipush 37 (0x25)
		// @19D: iastore
		// @19E: dup
		// @19F: iconst_4
		// @1A0: bipush 45 (0x2D)
		// @1A2: iastore
		// @1A3: dup
		// @1A4: iconst_5
		// @1A5: iconst_5
		// @1A6: iastore
		// @1A7: dup
		// @1A8: bipush 6 (0x06)
		// @1AA: bipush 12 (0x0C)
		// @1AC: iastore
		// @1AD: dup
		// @1AE: bipush 7 (0x07)
		// @1B0: bipush 13 (0x0D)
		// @1B2: iastore
		// @1B3: bipush 30 (0x1E)
		// @1B5: sipush 200 (0x00C8)
		// @1B8: invokestatic game.C_100195_rc.func_105770_a(int, int, int, int, int[], int, int)void
		// @1BB: bipush -123 (0x85)
		// @1BD: sipush 460 (0x01CC)
		// @1C0: iconst_4
		// @1C1: sipush 180 (0x00B4)
		// @1C4: bipush 7 (0x07)
		// @1C6: newarray int[]
		// @1C8: dup
		// @1C9: iconst_0
		// @1CA: iconst_2
		// @1CB: iastore
		// @1CC: dup
		// @1CD: iconst_1
		// @1CE: bipush 20 (0x14)
		// @1D0: iastore
		// @1D1: dup
		// @1D2: iconst_2
		// @1D3: bipush 21 (0x15)
		// @1D5: iastore
		// @1D6: dup
		// @1D7: iconst_3
		// @1D8: bipush 37 (0x25)
		// @1DA: iastore
		// @1DB: dup
		// @1DC: iconst_4
		// @1DD: bipush 45 (0x2D)
		// @1DF: iastore
		// @1E0: dup
		// @1E1: iconst_5
		// @1E2: iconst_5
		// @1E3: iastore
		// @1E4: dup
		// @1E5: bipush 6 (0x06)
		// @1E7: bipush 13 (0x0D)
		// @1E9: iastore
		// @1EA: bipush 30 (0x1E)
		// @1EC: sipush 200 (0x00C8)
		// @1EF: invokestatic game.C_100195_rc.func_105770_a(int, int, int, int, int[], int, int)void
		// @1F2: bipush -94 (0xA2)
		// @1F4: sipush 460 (0x01CC)
		// @1F7: iconst_5
		// @1F8: sipush 180 (0x00B4)
		// @1FB: iconst_4
		// @1FC: newarray int[]
		// @1FE: dup
		// @1FF: iconst_0
		// @200: bipush 22 (0x16)
		// @202: iastore
		// @203: dup
		// @204: iconst_1
		// @205: iconst_4
		// @206: iastore
		// @207: dup
		// @208: iconst_2
		// @209: bipush 23 (0x17)
		// @20B: iastore
		// @20C: dup
		// @20D: iconst_3
		// @20E: bipush 8 (0x08)
		// @210: iastore
		// @211: bipush 30 (0x1E)
		// @213: sipush 406 (0x0196)
		// @216: invokestatic game.C_100195_rc.func_105770_a(int, int, int, int, int[], int, int)void
		// @219: bipush -91 (0xA5)
		// @21B: sipush 460 (0x01CC)
		// @21E: bipush 6 (0x06)
		// @220: sipush 180 (0x00B4)
		// @223: iconst_4
		// @224: newarray int[]
		// @226: dup
		// @227: iconst_0
		// @228: bipush 22 (0x16)
		// @22A: iastore
		// @22B: dup
		// @22C: iconst_1
		// @22D: iconst_m1
		// @22E: iastore
		// @22F: dup
		// @230: iconst_2
		// @231: bipush 23 (0x17)
		// @233: iastore
		// @234: dup
		// @235: iconst_3
		// @236: bipush 8 (0x08)
		// @238: iastore
		// @239: bipush 30 (0x1E)
		// @23B: sipush 406 (0x0196)
		// @23E: invokestatic game.C_100195_rc.func_105770_a(int, int, int, int, int[], int, int)void
		// @241: bipush -117 (0x8B)
		// @243: iconst_0
		// @244: bipush 7 (0x07)
		// @246: iconst_0
		// @247: iconst_4
		// @248: newarray int[]
		// @24A: dup
		// @24B: iconst_0
		// @24C: iconst_m1
		// @24D: iastore
		// @24E: dup
		// @24F: iconst_1
		// @250: iconst_m1
		// @251: iastore
		// @252: dup
		// @253: iconst_2
		// @254: iconst_m1
		// @255: iastore
		// @256: dup
		// @257: iconst_3
		// @258: bipush 8 (0x08)
		// @25A: iastore
		// @25B: iconst_0
		// @25C: iconst_0
		// @25D: invokestatic game.C_100195_rc.func_105770_a(int, int, int, int, int[], int, int)void
		// @260: bipush -127 (0x81)
		// @262: sipush 460 (0x01CC)
		// @265: bipush 8 (0x08)
		// @267: sipush 180 (0x00B4)
		// @26A: iconst_4
		// @26B: newarray int[]
		// @26D: dup
		// @26E: iconst_0
		// @26F: iconst_4
		// @270: iastore
		// @271: dup
		// @272: iconst_1
		// @273: iconst_m1
		// @274: iastore
		// @275: dup
		// @276: iconst_2
		// @277: bipush 23 (0x17)
		// @279: iastore
		// @27A: dup
		// @27B: iconst_3
		// @27C: bipush 8 (0x08)
		// @27E: iastore
		// @27F: bipush 30 (0x1E)
		// @281: sipush 406 (0x0196)
		// @284: invokestatic game.C_100195_rc.func_105770_a(int, int, int, int, int[], int, int)void
		// @287: bipush -60 (0xC4)
		// @289: sipush 460 (0x01CC)
		// @28C: bipush 9 (0x09)
		// @28E: sipush 180 (0x00B4)
		// @291: iconst_4
		// @292: newarray int[]
		// @294: dup
		// @295: iconst_0
		// @296: iconst_4
		// @297: iastore
		// @298: dup
		// @299: iconst_1
		// @29A: iconst_m1
		// @29B: iastore
		// @29C: dup
		// @29D: iconst_2
		// @29E: bipush 23 (0x17)
		// @2A0: iastore
		// @2A1: dup
		// @2A2: iconst_3
		// @2A3: bipush 8 (0x08)
		// @2A5: iastore
		// @2A6: bipush 30 (0x1E)
		// @2A8: sipush 406 (0x0196)
		// @2AB: invokestatic game.C_100195_rc.func_105770_a(int, int, int, int, int[], int, int)void
		// @2AE: bipush -94 (0xA2)
		// @2B0: sipush 460 (0x01CC)
		// @2B3: bipush 10 (0x0A)
		// @2B5: sipush 180 (0x00B4)
		// @2B8: iconst_2
		// @2B9: newarray int[]
		// @2BB: dup
		// @2BC: iconst_0
		// @2BD: bipush 23 (0x17)
		// @2BF: iastore
		// @2C0: dup
		// @2C1: iconst_1
		// @2C2: bipush 24 (0x18)
		// @2C4: iastore
		// @2C5: bipush 30 (0x1E)
		// @2C7: sipush 400 (0x0190)
		// @2CA: invokestatic game.C_100195_rc.func_105770_a(int, int, int, int, int[], int, int)void
		// @2CD: bipush -97 (0x9F)
		// @2CF: sipush 460 (0x01CC)
		// @2D2: bipush 11 (0x0B)
		// @2D4: sipush 290 (0x0122)
		// @2D7: iconst_1
		// @2D8: newarray int[]
		// @2DA: dup
		// @2DB: iconst_0
		// @2DC: bipush 7 (0x07)
		// @2DE: iastore
		// @2DF: bipush 30 (0x1E)
		// @2E1: sipush 400 (0x0190)
		// @2E4: invokestatic game.C_100195_rc.func_105770_a(int, int, int, int, int[], int, int)void
		// @2E7: bipush -79 (0xB1)
		// @2E9: sipush 460 (0x01CC)
		// @2EC: bipush 12 (0x0C)
		// @2EE: sipush 180 (0x00B4)
		// @2F1: iconst_0
		// @2F2: newarray int[]
		// @2F4: bipush 30 (0x1E)
		// @2F6: sipush 200 (0x00C8)
		// @2F9: invokestatic game.C_100195_rc.func_105770_a(int, int, int, int, int[], int, int)void
		// @2FC: bipush -73 (0xB7)
		// @2FE: iconst_0
		// @2FF: bipush 13 (0x0D)
		// @301: iconst_0
		// @302: iconst_4
		// @303: newarray int[]
		// @305: dup
		// @306: iconst_0
		// @307: bipush 23 (0x17)
		// @309: iastore
		// @30A: dup
		// @30B: iconst_1
		// @30C: bipush 28 (0x1C)
		// @30E: iastore
		// @30F: dup
		// @310: iconst_2
		// @311: iconst_m1
		// @312: iastore
		// @313: dup
		// @314: iconst_3
		// @315: bipush 7 (0x07)
		// @317: iastore
		// @318: iconst_0
		// @319: iconst_0
		// @31A: invokestatic game.C_100195_rc.func_105770_a(int, int, int, int, int[], int, int)void
		// @31D: bipush -64 (0xC0)
		// @31F: iconst_0
		// @320: bipush 14 (0x0E)
		// @322: iconst_0
		// @323: iconst_4
		// @324: newarray int[]
		// @326: dup
		// @327: iconst_0
		// @328: bipush 23 (0x17)
		// @32A: iastore
		// @32B: dup
		// @32C: iconst_1
		// @32D: bipush 33 (0x21)
		// @32F: iastore
		// @330: dup
		// @331: iconst_2
		// @332: bipush 46 (0x2E)
		// @334: iastore
		// @335: dup
		// @336: iconst_3
		// @337: bipush 7 (0x07)
		// @339: iastore
		// @33A: iconst_0
		// @33B: iconst_0
		// @33C: invokestatic game.C_100195_rc.func_105770_a(int, int, int, int, int[], int, int)void
		// @33F: bipush -123 (0x85)
		// @341: sipush 460 (0x01CC)
		// @344: bipush 15 (0x0F)
		// @346: sipush 180 (0x00B4)
		// @349: bipush 6 (0x06)
		// @34B: newarray int[]
		// @34D: dup
		// @34E: iconst_0
		// @34F: bipush 29 (0x1D)
		// @351: iastore
		// @352: dup
		// @353: iconst_1
		// @354: bipush 30 (0x1E)
		// @356: iastore
		// @357: dup
		// @358: iconst_2
		// @359: bipush 31 (0x1F)
		// @35B: iastore
		// @35C: dup
		// @35D: iconst_3
		// @35E: bipush 32 (0x20)
		// @360: iastore
		// @361: dup
		// @362: iconst_4
		// @363: bipush 33 (0x21)
		// @365: iastore
		// @366: dup
		// @367: iconst_5
		// @368: bipush 7 (0x07)
		// @36A: iastore
		// @36B: bipush 30 (0x1E)
		// @36D: sipush 400 (0x0190)
		// @370: invokestatic game.C_100195_rc.func_105770_a(int, int, int, int, int[], int, int)void
		// @373: bipush -107 (0x95)
		// @375: sipush 460 (0x01CC)
		// @378: bipush 16 (0x10)
		// @37A: sipush 180 (0x00B4)
		// @37D: iconst_1
		// @37E: newarray int[]
		// @380: dup
		// @381: iconst_0
		// @382: bipush 7 (0x07)
		// @384: iastore
		// @385: bipush 30 (0x1E)
		// @387: sipush 400 (0x0190)
		// @38A: invokestatic game.C_100195_rc.func_105770_a(int, int, int, int, int[], int, int)void
		// @38D: bipush -66 (0xBE)
		// @38F: sipush 460 (0x01CC)
		// @392: bipush 17 (0x11)
		// @394: sipush 180 (0x00B4)
		// @397: bipush 13 (0x0D)
		// @399: newarray int[]
		// @39B: dup
		// @39C: iconst_0
		// @39D: bipush 20 (0x14)
		// @39F: iastore
		// @3A0: dup
		// @3A1: iconst_1
		// @3A2: bipush 21 (0x15)
		// @3A4: iastore
		// @3A5: dup
		// @3A6: iconst_2
		// @3A7: bipush 6 (0x06)
		// @3A9: iastore
		// @3AA: dup
		// @3AB: iconst_3
		// @3AC: bipush 37 (0x25)
		// @3AE: iastore
		// @3AF: dup
		// @3B0: iconst_4
		// @3B1: bipush 41 (0x29)
		// @3B3: iastore
		// @3B4: dup
		// @3B5: iconst_5
		// @3B6: bipush 42 (0x2A)
		// @3B8: iastore
		// @3B9: dup
		// @3BA: bipush 6 (0x06)
		// @3BC: bipush 43 (0x2B)
		// @3BE: iastore
		// @3BF: dup
		// @3C0: bipush 7 (0x07)
		// @3C2: bipush 44 (0x2C)
		// @3C4: iastore
		// @3C5: dup
		// @3C6: bipush 8 (0x08)
		// @3C8: bipush 47 (0x2F)
		// @3CA: iastore
		// @3CB: dup
		// @3CC: bipush 9 (0x09)
		// @3CE: iconst_m1
		// @3CF: iastore
		// @3D0: dup
		// @3D1: bipush 10 (0x0A)
		// @3D3: iconst_m1
		// @3D4: iastore
		// @3D5: dup
		// @3D6: bipush 11 (0x0B)
		// @3D8: iconst_m1
		// @3D9: iastore
		// @3DA: dup
		// @3DB: bipush 12 (0x0C)
		// @3DD: bipush 8 (0x08)
		// @3DF: iastore
		// @3E0: bipush 30 (0x1E)
		// @3E2: sipush 140 (0x008C)
		// @3E5: invokestatic game.C_100195_rc.func_105770_a(int, int, int, int, int[], int, int)void
		// @3E8: bipush -97 (0x9F)
		// @3EA: iconst_0
		// @3EB: bipush 18 (0x12)
		// @3ED: iconst_0
		// @3EE: iconst_0
		// @3EF: newarray int[]
		// @3F1: iconst_0
		// @3F2: iconst_0
		// @3F3: invokestatic game.C_100195_rc.func_105770_a(int, int, int, int, int[], int, int)void
		// @3F6: bipush -120 (0x88)
		// @3F8: iconst_0
		// @3F9: bipush 19 (0x13)
		// @3FB: iconst_0
		// @3FC: bipush 24 (0x18)
		// @3FE: newarray int[]
		// @400: dup
		// @401: iconst_0
		// @402: bipush 38 (0x26)
		// @404: iastore
		// @405: dup
		// @406: iconst_1
		// @407: bipush 38 (0x26)
		// @409: iastore
		// @40A: dup
		// @40B: iconst_2
		// @40C: bipush 38 (0x26)
		// @40E: iastore
		// @40F: dup
		// @410: iconst_3
		// @411: bipush 38 (0x26)
		// @413: iastore
		// @414: dup
		// @415: iconst_4
		// @416: bipush 38 (0x26)
		// @418: iastore
		// @419: dup
		// @41A: iconst_5
		// @41B: bipush 38 (0x26)
		// @41D: iastore
		// @41E: dup
		// @41F: bipush 6 (0x06)
		// @421: bipush 38 (0x26)
		// @423: iastore
		// @424: dup
		// @425: bipush 7 (0x07)
		// @427: bipush 38 (0x26)
		// @429: iastore
		// @42A: dup
		// @42B: bipush 8 (0x08)
		// @42D: bipush 38 (0x26)
		// @42F: iastore
		// @430: dup
		// @431: bipush 9 (0x09)
		// @433: bipush 38 (0x26)
		// @435: iastore
		// @436: dup
		// @437: bipush 10 (0x0A)
		// @439: bipush 38 (0x26)
		// @43B: iastore
		// @43C: dup
		// @43D: bipush 11 (0x0B)
		// @43F: bipush 38 (0x26)
		// @441: iastore
		// @442: dup
		// @443: bipush 12 (0x0C)
		// @445: bipush 38 (0x26)
		// @447: iastore
		// @448: dup
		// @449: bipush 13 (0x0D)
		// @44B: bipush 38 (0x26)
		// @44D: iastore
		// @44E: dup
		// @44F: bipush 14 (0x0E)
		// @451: bipush 38 (0x26)
		// @453: iastore
		// @454: dup
		// @455: bipush 15 (0x0F)
		// @457: bipush 38 (0x26)
		// @459: iastore
		// @45A: dup
		// @45B: bipush 16 (0x10)
		// @45D: bipush 38 (0x26)
		// @45F: iastore
		// @460: dup
		// @461: bipush 17 (0x11)
		// @463: bipush 38 (0x26)
		// @465: iastore
		// @466: dup
		// @467: bipush 18 (0x12)
		// @469: bipush 38 (0x26)
		// @46B: iastore
		// @46C: dup
		// @46D: bipush 19 (0x13)
		// @46F: bipush 38 (0x26)
		// @471: iastore
		// @472: dup
		// @473: bipush 20 (0x14)
		// @475: iconst_m1
		// @476: iastore
		// @477: dup
		// @478: bipush 21 (0x15)
		// @47A: iconst_m1
		// @47B: iastore
		// @47C: dup
		// @47D: bipush 22 (0x16)
		// @47F: bipush 23 (0x17)
		// @481: iastore
		// @482: dup
		// @483: bipush 23 (0x17)
		// @485: bipush 7 (0x07)
		// @487: iastore
		// @488: bipush 30 (0x1E)
		// @48A: iconst_0
		// @48B: invokestatic game.C_100195_rc.func_105770_a(int, int, int, int, int[], int, int)void
		// @48E: bipush -127 (0x81)
		// @490: iconst_0
		// @491: bipush 20 (0x14)
		// @493: iconst_0
		// @494: bipush 7 (0x07)
		// @496: newarray int[]
		// @498: dup
		// @499: iconst_0
		// @49A: bipush 25 (0x19)
		// @49C: iastore
		// @49D: dup
		// @49E: iconst_1
		// @49F: bipush 26 (0x1A)
		// @4A1: iastore
		// @4A2: dup
		// @4A3: iconst_2
		// @4A4: bipush 39 (0x27)
		// @4A6: iastore
		// @4A7: dup
		// @4A8: iconst_3
		// @4A9: iconst_m1
		// @4AA: iastore
		// @4AB: dup
		// @4AC: iconst_4
		// @4AD: iconst_m1
		// @4AE: iastore
		// @4AF: dup
		// @4B0: iconst_5
		// @4B1: bipush 23 (0x17)
		// @4B3: iastore
		// @4B4: dup
		// @4B5: bipush 6 (0x06)
		// @4B7: bipush 7 (0x07)
		// @4B9: iastore
		// @4BA: bipush 30 (0x1E)
		// @4BC: iconst_0
		// @4BD: invokestatic game.C_100195_rc.func_105770_a(int, int, int, int, int[], int, int)void
		// @4C0: bipush -74 (0xB6)
		// @4C2: sipush 460 (0x01CC)
		// @4C5: bipush 21 (0x15)
		// @4C7: sipush 180 (0x00B4)
		// @4CA: iconst_1
		// @4CB: newarray int[]
		// @4CD: dup
		// @4CE: iconst_0
		// @4CF: bipush 7 (0x07)
		// @4D1: iastore
		// @4D2: bipush 30 (0x1E)
		// @4D4: sipush 200 (0x00C8)
		// @4D7: invokestatic game.C_100195_rc.func_105770_a(int, int, int, int, int[], int, int)void
		// @4DA: bipush -78 (0xB2)
		// @4DC: sipush 460 (0x01CC)
		// @4DF: bipush 22 (0x16)
		// @4E1: sipush 180 (0x00B4)
		// @4E4: bipush 6 (0x06)
		// @4E6: newarray int[]
		// @4E8: dup
		// @4E9: iconst_0
		// @4EA: bipush 41 (0x29)
		// @4EC: iastore
		// @4ED: dup
		// @4EE: iconst_1
		// @4EF: bipush 42 (0x2A)
		// @4F1: iastore
		// @4F2: dup
		// @4F3: iconst_2
		// @4F4: bipush 43 (0x2B)
		// @4F6: iastore
		// @4F7: dup
		// @4F8: iconst_3
		// @4F9: bipush 44 (0x2C)
		// @4FB: iastore
		// @4FC: dup
		// @4FD: iconst_4
		// @4FE: bipush 47 (0x2F)
		// @500: iastore
		// @501: dup
		// @502: iconst_5
		// @503: bipush 8 (0x08)
		// @505: iastore
		// @506: bipush 30 (0x1E)
		// @508: sipush 200 (0x00C8)
		// @50B: invokestatic game.C_100195_rc.func_105770_a(int, int, int, int, int[], int, int)void
		// @50E: sipush 250 (0x00FA)
		// @511: putstatic int game.C_100012_fh.field_100506_F
		// @514: ldc "\u0007\u000ea<f+"
		// @516: invokestatic game.C_100012_fh.func_100499_z(java.lang.String)char[]
		// @519: invokestatic game.C_100012_fh.func_100498_z(char[])java.lang.String
		// @51C: putstatic java.lang.String game.C_100012_fh.field_100510_N
		// @51F: ldc "\u0000\u0001z02'\u001374d/\t{4p\"\u0005"
		// @521: invokestatic game.C_100012_fh.func_100499_z(java.lang.String)char[]
		// @524: invokestatic game.C_100012_fh.func_100498_z(char[])java.lang.String
		// @527: putstatic java.lang.String game.C_100012_fh.field_100505_E
		// @52A: ldc "\u0003\u0001c6zn\u0002n{<`"
		// @52C: invokestatic game.C_100012_fh.func_100499_z(java.lang.String)char[]
		// @52F: invokestatic game.C_100012_fh.func_100498_z(char[])java.lang.String
		// @532: putstatic java.lang.String game.C_100012_fh.field_100512_H
		// @535: return
	}
	
	private static char[] func_100499_z(String arg0)
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
		// @0E: bipush 18 (0x12)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_100498_z(char[] arg0)
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
		// @30: bipush 78 (0x4E)
		// @32: goto @46
		// @35: bipush 96 (0x60)
		// @37: goto @46
		// @3A: bipush 23 (0x17)
		// @3C: goto @46
		// @3F: bipush 85 (0x55)
		// @41: goto @46
		// @44: bipush 18 (0x12)
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
