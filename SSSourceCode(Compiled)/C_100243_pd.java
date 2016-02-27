package game;

final class C_100243_pd
{
	int field_106361_a;
	static String field_106355_f;
	static String field_106357_d;
	static String field_106356_g;
	static String field_106358_e;
	static String field_106360_c;
	static String field_106359_b;
	private static final String[] field_106362_z;
	
	static final void func_106354_a(byte arg0, int arg1, int arg2, int arg3)
	{
		// @00: getstatic game.C_100280_nf game.C_100127_tl.field_104945_f
		// @03: iconst_0
		// @04: putfield int game.C_100280_nf.field_101177_n
		// @07: getstatic game.C_100280_nf game.C_100127_tl.field_104945_f
		// @0A: sipush 7838 (0x1E9E)
		// @0D: bipush 12 (0x0C)
		// @0F: invokevirtual game.C_100280_nf.func_101169_f(int, int)void
		// @12: getstatic game.C_100280_nf game.C_100127_tl.field_104945_f
		// @15: getstatic java.util.Random game.C_100067_vd.field_104322_k
		// @18: invokevirtual java.util.Random.nextInt()int
		// @1B: bipush 71 (0x47)
		// @1D: invokevirtual game.C_100280_nf.func_101154_d(int, int)void
		// @20: getstatic game.C_100280_nf game.C_100127_tl.field_104945_f
		// @23: getstatic java.util.Random game.C_100067_vd.field_104322_k
		// @26: invokevirtual java.util.Random.nextInt()int
		// @29: bipush 58 (0x3A)
		// @2B: invokevirtual game.C_100280_nf.func_101154_d(int, int)void
		// @2E: iload_0
		// @2F: bipush 121 (0x79)
		// @31: if_icmpgt @45
		// @34: aconst_null
		// @35: checkcast game.C_100098_h
		// @38: bipush -110 (0x92)
		// @3A: aconst_null
		// @3B: checkcast game.C_100098_h
		// @3E: invokestatic game.C_100243_pd.func_106351_a(game.C_100098_h, int, game.C_100098_h)void
		// @41: goto @45
		// @44: athrow
		// @45: getstatic game.C_100280_nf game.C_100127_tl.field_104945_f
		// @48: sipush 7838 (0x1E9E)
		// @4B: iload_3
		// @4C: invokevirtual game.C_100280_nf.func_101169_f(int, int)void
		// @4F: getstatic game.C_100280_nf game.C_100127_tl.field_104945_f
		// @52: sipush 7838 (0x1E9E)
		// @55: iload_1
		// @56: invokevirtual game.C_100280_nf.func_101169_f(int, int)void
		// @59: getstatic game.C_100280_nf game.C_100127_tl.field_104945_f
		// @5C: iload_2
		// @5D: bipush -92 (0xA4)
		// @5F: invokevirtual game.C_100280_nf.func_101141_d(int, byte)void
		// @62: getstatic game.C_100280_nf game.C_100127_tl.field_104945_f
		// @65: getstatic java.math.BigInteger game.C_100287_nm.field_106831_k
		// @68: getstatic java.math.BigInteger game.C_100084_ug.field_104488_h
		// @6B: bipush 21 (0x15)
		// @6D: invokevirtual game.C_100280_nf.func_101132_a(java.math.BigInteger, java.math.BigInteger, byte)void
		// @70: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @73: bipush 18 (0x12)
		// @75: bipush 109 (0x6D)
		// @77: invokevirtual game.C_100278_nd.func_101189_h(int, int)void
		// @7A: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @7D: dup
		// @7E: getfield int game.C_100278_nd.field_101177_n
		// @81: iconst_1
		// @82: iadd
		// @83: dup_x1
		// @84: putfield int game.C_100278_nd.field_101177_n
		// @87: istore #4
		// @89: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @8C: getstatic game.C_100280_nf game.C_100127_tl.field_104945_f
		// @8F: getfield byte[] game.C_100280_nf.field_101179_l
		// @92: iconst_0
		// @93: getstatic game.C_100280_nf game.C_100127_tl.field_104945_f
		// @96: getfield int game.C_100280_nf.field_101177_n
		// @99: bipush -46 (0xD2)
		// @9B: invokevirtual game.C_100278_nd.func_101165_b(byte[], int, int, int)void
		// @9E: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @A1: iload #4
		// @A3: ineg
		// @A4: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @A7: getfield int game.C_100278_nd.field_101177_n
		// @AA: iadd
		// @AB: bipush -99 (0x9D)
		// @AD: invokevirtual game.C_100278_nd.func_101139_c(int, byte)void
		// @B0: goto @F1
		// @B3: astore #4
		// @B5: aload #4
		// @B7: new java.lang.StringBuilder
		// @BA: dup
		// @BB: invokespecial java.lang.StringBuilder.<init>()void
		// @BE: getstatic java.lang.String[] game.C_100243_pd.field_106362_z
		// @C1: iconst_0
		// @C2: aaload
		// @C3: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @C6: iload_0
		// @C7: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @CA: bipush 44 (0x2C)
		// @CC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @CF: iload_1
		// @D0: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @D3: bipush 44 (0x2C)
		// @D5: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D8: iload_2
		// @D9: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @DC: bipush 44 (0x2C)
		// @DE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @E1: iload_3
		// @E2: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @E5: bipush 41 (0x29)
		// @E7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @EA: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @ED: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @F0: athrow
		// @F1: return
	}
	
	static final void func_106351_a(C_100098_h arg0, int arg1, C_100098_h arg2)
	{
		// @00: iload_1
		// @01: bipush 18 (0x12)
		// @03: if_icmpeq @11
		// @06: aconst_null
		// @07: checkcast java.lang.String
		// @0A: putstatic java.lang.String game.C_100243_pd.field_106357_d
		// @0D: goto @11
		// @10: athrow
		// @11: aload_2
		// @12: putstatic game.C_100098_h game.C_100154_sl.field_105338_k
		// @15: aload_0
		// @16: putstatic game.C_100098_h game.C_100171_cn.field_105566_d
		// @19: goto @71
		// @1C: astore_3
		// @1D: aload_3
		// @1E: new java.lang.StringBuilder
		// @21: dup
		// @22: invokespecial java.lang.StringBuilder.<init>()void
		// @25: getstatic java.lang.String[] game.C_100243_pd.field_106362_z
		// @28: iconst_5
		// @29: aaload
		// @2A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2D: aload_0
		// @2E: ifnull @3A
		// @31: getstatic java.lang.String[] game.C_100243_pd.field_106362_z
		// @34: iconst_1
		// @35: aaload
		// @36: goto @3F
		// @39: athrow
		// @3A: getstatic java.lang.String[] game.C_100243_pd.field_106362_z
		// @3D: iconst_3
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
		// @54: getstatic java.lang.String[] game.C_100243_pd.field_106362_z
		// @57: iconst_1
		// @58: aaload
		// @59: goto @62
		// @5C: athrow
		// @5D: getstatic java.lang.String[] game.C_100243_pd.field_106362_z
		// @60: iconst_3
		// @61: aaload
		// @62: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @65: bipush 41 (0x29)
		// @67: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @6D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @70: athrow
		// @71: return
	}
	
	public static void func_106350_a(int arg0)
	{
		// @00: iload_0
		// @01: bipush -47 (0xD1)
		// @03: if_icmplt @07
		// @06: return
		// @07: aconst_null
		// @08: putstatic java.lang.String game.C_100243_pd.field_106358_e
		// @0B: aconst_null
		// @0C: putstatic java.lang.String game.C_100243_pd.field_106359_b
		// @0F: aconst_null
		// @10: putstatic java.lang.String game.C_100243_pd.field_106355_f
		// @13: aconst_null
		// @14: putstatic java.lang.String game.C_100243_pd.field_106356_g
		// @17: aconst_null
		// @18: putstatic java.lang.String game.C_100243_pd.field_106360_c
		// @1B: aconst_null
		// @1C: putstatic java.lang.String game.C_100243_pd.field_106357_d
		// @1F: goto @43
		// @22: astore_1
		// @23: aload_1
		// @24: new java.lang.StringBuilder
		// @27: dup
		// @28: invokespecial java.lang.StringBuilder.<init>()void
		// @2B: getstatic java.lang.String[] game.C_100243_pd.field_106362_z
		// @2E: iconst_4
		// @2F: aaload
		// @30: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @33: iload_0
		// @34: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @37: bipush 41 (0x29)
		// @39: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @42: athrow
		// @43: return
	}
	
	static final void func_106349_a(int arg0, int arg1, long arg2, byte arg3, String arg4, int arg5, int arg6, int arg7, int arg8, int arg9, C_100201_qj arg10, boolean arg11, int arg12, boolean arg13)
	{
		// @000: iload #4
		// @002: bipush 99 (0x63)
		// @004: if_icmpeq @018
		// @007: aconst_null
		// @008: checkcast game.C_100098_h
		// @00B: bipush -32 (0xE0)
		// @00D: aconst_null
		// @00E: checkcast game.C_100098_h
		// @011: invokestatic game.C_100243_pd.func_106351_a(game.C_100098_h, int, game.C_100098_h)void
		// @014: goto @018
		// @017: athrow
		// @018: new game.C_100278_nd
		// @01B: dup
		// @01C: iload #9
		// @01E: invokespecial game.C_100278_nd.<init>(int)void
		// @021: putstatic game.C_100278_nd game.C_100288_jn.field_106839_f
		// @024: new game.C_100278_nd
		// @027: dup
		// @028: iload #6
		// @02A: invokespecial game.C_100278_nd.<init>(int)void
		// @02D: putstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @030: iload_1
		// @031: putstatic int game.C_100022_hf.field_103899_a
		// @034: aload #5
		// @036: putstatic java.lang.String game.C_100225_ah.field_106134_r
		// @039: lload_2
		// @03A: putstatic long game.C_100034_gi.field_104038_h
		// @03D: iload #8
		// @03F: putstatic int game.C_100341_jd.field_102654_bb
		// @042: iload #7
		// @044: putstatic int game.C_100163_sf.field_105434_f
		// @047: iload #14
		// @049: putstatic boolean game.C_100287_nm.field_106832_h
		// @04C: iload #12
		// @04E: putstatic boolean game.C_100225_ah.field_106131_k
		// @051: iload_0
		// @052: putstatic int game.C_100311_le.field_104721_z
		// @055: iload #10
		// @057: putstatic int game.C_100180_ce.field_104810_s
		// @05A: iload #13
		// @05C: putstatic int game.C_100212_qc.field_105982_h
		// @05F: aload #11
		// @061: putstatic game.C_100201_qj game.C_100316_lc.field_102417_x
		// @064: aconst_null
		// @065: getstatic game.C_100201_qj game.C_100316_lc.field_102417_x
		// @068: getfield game.C_100005_fk game.C_100201_qj.field_105875_c
		// @06B: if_acmpeq @094
		// @06E: new game.C_100301_kb
		// @071: dup
		// @072: getstatic game.C_100201_qj game.C_100316_lc.field_102417_x
		// @075: getfield game.C_100005_fk game.C_100201_qj.field_105875_c
		// @078: bipush 64 (0x40)
		// @07A: iconst_0
		// @07B: invokespecial game.C_100301_kb.<init>(game.C_100005_fk, int, int)void
		// @07E: putstatic game.C_100301_kb game.C_100280_nf.field_101183_k
		// @081: goto @094
		// @084: athrow
		// @085: astore #15
		// @087: new java.lang.RuntimeException
		// @08A: dup
		// @08B: aload #15
		// @08D: invokevirtual java.io.IOException.toString()java.lang.String
		// @090: invokespecial java.lang.RuntimeException.<init>(java.lang.String)void
		// @093: athrow
		// @094: goto @15C
		// @097: astore #15
		// @099: aload #15
		// @09B: new java.lang.StringBuilder
		// @09E: dup
		// @09F: invokespecial java.lang.StringBuilder.<init>()void
		// @0A2: getstatic java.lang.String[] game.C_100243_pd.field_106362_z
		// @0A5: iconst_2
		// @0A6: aaload
		// @0A7: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0AA: iload_0
		// @0AB: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0AE: bipush 44 (0x2C)
		// @0B0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0B3: iload_1
		// @0B4: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0B7: bipush 44 (0x2C)
		// @0B9: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0BC: lload_2
		// @0BD: invokevirtual java.lang.StringBuilder.append(long)java.lang.StringBuilder
		// @0C0: bipush 44 (0x2C)
		// @0C2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0C5: iload #4
		// @0C7: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0CA: bipush 44 (0x2C)
		// @0CC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0CF: aload #5
		// @0D1: ifnull @0DD
		// @0D4: getstatic java.lang.String[] game.C_100243_pd.field_106362_z
		// @0D7: iconst_1
		// @0D8: aaload
		// @0D9: goto @0E2
		// @0DC: athrow
		// @0DD: getstatic java.lang.String[] game.C_100243_pd.field_106362_z
		// @0E0: iconst_3
		// @0E1: aaload
		// @0E2: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0E5: bipush 44 (0x2C)
		// @0E7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0EA: iload #6
		// @0EC: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0EF: bipush 44 (0x2C)
		// @0F1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0F4: iload #7
		// @0F6: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0F9: bipush 44 (0x2C)
		// @0FB: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0FE: iload #8
		// @100: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @103: bipush 44 (0x2C)
		// @105: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @108: iload #9
		// @10A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @10D: bipush 44 (0x2C)
		// @10F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @112: iload #10
		// @114: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @117: bipush 44 (0x2C)
		// @119: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @11C: aload #11
		// @11E: ifnull @12A
		// @121: getstatic java.lang.String[] game.C_100243_pd.field_106362_z
		// @124: iconst_1
		// @125: aaload
		// @126: goto @12F
		// @129: athrow
		// @12A: getstatic java.lang.String[] game.C_100243_pd.field_106362_z
		// @12D: iconst_3
		// @12E: aaload
		// @12F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @132: bipush 44 (0x2C)
		// @134: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @137: iload #12
		// @139: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @13C: bipush 44 (0x2C)
		// @13E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @141: iload #13
		// @143: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @146: bipush 44 (0x2C)
		// @148: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @14B: iload #14
		// @14D: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @150: bipush 41 (0x29)
		// @152: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @155: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @158: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @15B: athrow
		// @15C: return
	}
	
	static
	{
		// @00: bipush 6 (0x06)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "k^FF#"
		// @09: invokestatic game.C_100243_pd.func_106353_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100243_pd.func_106352_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "`\u0014F*v"
		// @14: invokestatic game.C_100243_pd.func_106353_z(java.lang.String)char[]
		// @17: invokestatic game.C_100243_pd.func_106352_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "k^FE#"
		// @1F: invokestatic game.C_100243_pd.func_106353_z(java.lang.String)char[]
		// @22: invokestatic game.C_100243_pd.func_106352_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "uO\u0004h"
		// @2A: invokestatic game.C_100243_pd.func_106353_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100243_pd.func_106352_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "k^FG#"
		// @35: invokestatic game.C_100243_pd.func_106353_z(java.lang.String)char[]
		// @38: invokestatic game.C_100243_pd.func_106352_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "k^F@#"
		// @40: invokestatic game.C_100243_pd.func_106353_z(java.lang.String)char[]
		// @43: invokestatic game.C_100243_pd.func_106352_z(char[])java.lang.String
		// @46: aastore
		// @47: putstatic java.lang.String[] game.C_100243_pd.field_106362_z
		// @4A: ldc ";I\rgdu^\u001b"
		// @4C: invokestatic game.C_100243_pd.func_106353_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100243_pd.func_106352_z(char[])java.lang.String
		// @52: putstatic java.lang.String game.C_100243_pd.field_106358_e
		// @55: ldc "OH\u0011$j|[\u0001j"
		// @57: invokestatic game.C_100243_pd.func_106353_z(java.lang.String)char[]
		// @5A: invokestatic game.C_100243_pd.func_106352_z(char[])java.lang.String
		// @5D: putstatic java.lang.String game.C_100243_pd.field_106357_d
		// @60: ldc "zY\u0000mnm_\u0005aeoIHpd;Y\u0007hg~Y\u001c"
		// @62: invokestatic game.C_100243_pd.func_106353_z(java.lang.String)char[]
		// @65: invokestatic game.C_100243_pd.func_106352_z(char[])java.lang.String
		// @68: putstatic java.lang.String game.C_100243_pd.field_106356_g
		// @6B: ldc "BU\u001d$ji_HmemS\u001cao;N\u0007$7>\nV#x;]\tin5"
		// @6D: invokestatic game.C_100243_pd.func_106353_z(java.lang.String)char[]
		// @70: invokestatic game.C_100243_pd.func_106352_z(char[])java.lang.String
		// @73: putstatic java.lang.String game.C_100243_pd.field_106359_b
		// @76: ldc "]S\u0006`+tJ\u0018ke~T\u001cw"
		// @78: invokestatic game.C_100243_pd.func_106353_z(java.lang.String)char[]
		// @7B: invokestatic game.C_100243_pd.func_106352_z(char[])java.lang.String
		// @7E: putstatic java.lang.String game.C_100243_pd.field_106360_c
		// @81: return
	}
	
	private static char[] func_106353_z(String arg0)
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
		// @0E: bipush 11 (0x0B)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_106352_z(char[] arg0)
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
		// @10: tableswitch def: @43, for 0: @30, for 1: @35, for 2: @3A, for 3: @3F
		// @30: bipush 27 (0x1B)
		// @32: goto @45
		// @35: bipush 58 (0x3A)
		// @37: goto @45
		// @3A: bipush 104 (0x68)
		// @3C: goto @45
		// @3F: iconst_4
		// @40: goto @45
		// @43: bipush 11 (0x0B)
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
