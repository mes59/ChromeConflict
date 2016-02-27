package game;

final class C_100056_de extends C_100083_c
{
	static int field_103194_Y;
	private String field_103196_Z;
	static String field_103181_cb;
	static C_100302_ka field_103195_bb;
	static String[] field_103180_db;
	static int[][] field_103192_lb;
	static int field_103193_ab;
	static String field_103183_eb;
	private C_100308_lh field_103191_kb;
	private C_100037_wb field_103184_fb;
	static int[] field_103187_ib;
	static C_100037_wb[] field_103185_gb;
	private int field_103182_hb;
	static int field_103190_mb;
	static C_100037_wb[] field_103188_nb;
	static int field_103186_jb;
	private static final String[] field_103189_ob;
	
	final void func_102513_a(C_100336_im arg0, int arg1, int arg2, int arg3)
	{
		// @00: aload_0
		// @01: dup
		// @02: getfield int game.C_100056_de.field_103182_hb
		// @05: iconst_1
		// @06: iadd
		// @07: putfield int game.C_100056_de.field_103182_hb
		// @0A: aload_0
		// @0B: aload_1
		// @0C: iload_2
		// @0D: iload_3
		// @0E: iload #4
		// @10: invokespecial game.C_100083_c.func_102513_a(game.C_100336_im, int, int, int)void
		// @13: goto @66
		// @16: astore #5
		// @18: aload #5
		// @1A: new java.lang.StringBuilder
		// @1D: dup
		// @1E: invokespecial java.lang.StringBuilder.<init>()void
		// @21: getstatic java.lang.String[] game.C_100056_de.field_103189_ob
		// @24: iconst_3
		// @25: aaload
		// @26: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @29: aload_1
		// @2A: ifnull @36
		// @2D: getstatic java.lang.String[] game.C_100056_de.field_103189_ob
		// @30: iconst_0
		// @31: aaload
		// @32: goto @3B
		// @35: athrow
		// @36: getstatic java.lang.String[] game.C_100056_de.field_103189_ob
		// @39: iconst_1
		// @3A: aaload
		// @3B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3E: bipush 44 (0x2C)
		// @40: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @43: iload_2
		// @44: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @47: bipush 44 (0x2C)
		// @49: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4C: iload_3
		// @4D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @50: bipush 44 (0x2C)
		// @52: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @55: iload #4
		// @57: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5A: bipush 41 (0x29)
		// @5C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @62: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @65: athrow
		// @66: return
	}
	
	final boolean func_102522_a(int arg0, C_100336_im arg1)
	{
		// @00: iload_1
		// @01: iconst_1
		// @02: if_icmpeq @11
		// @05: aload_0
		// @06: aconst_null
		// @07: checkcast java.lang.String
		// @0A: putfield java.lang.String game.C_100056_de.field_103196_Z
		// @0D: goto @11
		// @10: athrow
		// @11: iconst_0
		// @12: ireturn
		// @13: astore_3
		// @14: aload_3
		// @15: new java.lang.StringBuilder
		// @18: dup
		// @19: invokespecial java.lang.StringBuilder.<init>()void
		// @1C: getstatic java.lang.String[] game.C_100056_de.field_103189_ob
		// @1F: iconst_5
		// @20: aaload
		// @21: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @24: iload_1
		// @25: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @28: bipush 44 (0x2C)
		// @2A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2D: aload_2
		// @2E: ifnull @3A
		// @31: getstatic java.lang.String[] game.C_100056_de.field_103189_ob
		// @34: iconst_0
		// @35: aaload
		// @36: goto @3F
		// @39: athrow
		// @3A: getstatic java.lang.String[] game.C_100056_de.field_103189_ob
		// @3D: iconst_1
		// @3E: aaload
		// @3F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @42: bipush 41 (0x29)
		// @44: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @47: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4D: athrow
	}
	
	static final int func_103179_a(byte[] arg0, byte arg1, int arg2, int arg3)
	{
		// @00: iconst_m1
		// @01: istore #4
		// @03: iload_2
		// @04: istore #5
		// @06: iload #5
		// @08: iconst_m1
		// @09: ixor
		// @0A: iload_3
		// @0B: iconst_m1
		// @0C: ixor
		// @0D: if_icmple @2D
		// @10: getstatic int[] game.C_100340_je.field_102976_q
		// @13: aload_0
		// @14: iload #5
		// @16: baload
		// @17: iload #4
		// @19: ixor
		// @1A: sipush 255 (0x00FF)
		// @1D: iand
		// @1E: iaload
		// @1F: iload #4
		// @21: ldc -1210259160 (0xb7dce928)
		// @23: iushr
		// @24: ixor
		// @25: istore #4
		// @27: iinc #5 +1
		// @2A: goto @06
		// @2D: iload_1
		// @2E: iconst_1
		// @2F: if_icmpgt @41
		// @32: bipush -91 (0xA5)
		// @34: iconst_1
		// @35: aconst_null
		// @36: checkcast byte[]
		// @39: invokestatic game.C_100056_de.func_103176_a(int, boolean, byte[])java.lang.Object
		// @3C: pop
		// @3D: goto @41
		// @40: athrow
		// @41: iload #4
		// @43: iconst_m1
		// @44: ixor
		// @45: istore #4
		// @47: iload #4
		// @49: ireturn
		// @4A: astore #4
		// @4C: aload #4
		// @4E: new java.lang.StringBuilder
		// @51: dup
		// @52: invokespecial java.lang.StringBuilder.<init>()void
		// @55: getstatic java.lang.String[] game.C_100056_de.field_103189_ob
		// @58: bipush 7 (0x07)
		// @5A: aaload
		// @5B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @5E: aload_0
		// @5F: ifnull @6B
		// @62: getstatic java.lang.String[] game.C_100056_de.field_103189_ob
		// @65: iconst_0
		// @66: aaload
		// @67: goto @70
		// @6A: athrow
		// @6B: getstatic java.lang.String[] game.C_100056_de.field_103189_ob
		// @6E: iconst_1
		// @6F: aaload
		// @70: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @73: bipush 44 (0x2C)
		// @75: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @78: iload_1
		// @79: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7C: bipush 44 (0x2C)
		// @7E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @81: iload_2
		// @82: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @85: bipush 44 (0x2C)
		// @87: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8A: iload_3
		// @8B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8E: bipush 41 (0x29)
		// @90: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @93: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @96: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @99: athrow
	}
	
	final void func_102528_a(int arg0, int arg1, int arg2, byte arg3)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #13
		// @005: aload_0
		// @006: getfield game.C_100308_lh game.C_100056_de.field_103191_kb
		// @009: bipush 77 (0x4D)
		// @00B: invokeinterface game.C_100308_lh.func_102950_a(byte)game.C_100133_tk
		// @010: astore #6
		// @012: getstatic game.C_100133_tk game.C_100297_kf.field_101234_s
		// @015: aload #6
		// @017: if_acmpeq @026
		// @01A: aload #6
		// @01C: getstatic game.C_100133_tk game.C_100238_ol.field_101696_R
		// @01F: if_acmpne @030
		// @022: goto @026
		// @025: athrow
		// @026: getstatic java.lang.String game.C_100260_mc.field_102247_cc
		// @029: astore #5
		// @02B: iload #13
		// @02D: ifeq @048
		// @030: aload_0
		// @031: getfield game.C_100308_lh game.C_100056_de.field_103191_kb
		// @034: bipush -127 (0x81)
		// @036: invokeinterface game.C_100308_lh.func_102949_c(int)java.lang.String
		// @03B: astore #5
		// @03D: aload #5
		// @03F: ifnonnull @048
		// @042: aload_0
		// @043: getfield java.lang.String game.C_100056_de.field_103196_Z
		// @046: astore #5
		// @048: aload #5
		// @04A: aload_0
		// @04B: getfield java.lang.String game.C_100056_de.field_102534_C
		// @04E: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @051: ifne @063
		// @054: aload_0
		// @055: aload #5
		// @057: putfield java.lang.String game.C_100056_de.field_102534_C
		// @05A: aload_0
		// @05B: iconst_0
		// @05C: invokevirtual game.C_100056_de.func_103163_j(int)void
		// @05F: goto @063
		// @062: athrow
		// @063: aload_0
		// @064: iload_1
		// @065: iload_2
		// @066: iload_3
		// @067: bipush -128 (0x80)
		// @069: invokespecial game.C_100083_c.func_102528_a(int, int, int, byte)void
		// @06C: iload #4
		// @06E: bipush -126 (0x82)
		// @070: if_icmple @085
		// @073: aconst_null
		// @074: checkcast byte[]
		// @077: bipush 124 (0x7C)
		// @079: bipush -119 (0x89)
		// @07B: bipush 83 (0x53)
		// @07D: invokestatic game.C_100056_de.func_103179_a(byte[], byte, int, int)int
		// @080: pop
		// @081: goto @085
		// @084: athrow
		// @085: aload_0
		// @086: getfield game.C_100308_lh game.C_100056_de.field_103191_kb
		// @089: bipush 77 (0x4D)
		// @08B: invokeinterface game.C_100308_lh.func_102950_a(byte)game.C_100133_tk
		// @090: astore #6
		// @092: aload_0
		// @093: getfield game.C_100326_ic game.C_100056_de.field_102533_B
		// @096: checkcast game.C_100184_rn
		// @099: astore #8
		// @09B: iload_3
		// @09C: aload_0
		// @09D: getfield int game.C_100056_de.field_102538_m
		// @0A0: ineg
		// @0A1: isub
		// @0A2: istore #9
		// @0A4: aload #8
		// @0A6: iconst_0
		// @0A7: iload_2
		// @0A8: aload_0
		// @0A9: invokeinterface game.C_100184_rn.func_100436_a(boolean, int, game.C_100336_im)int
		// @0AE: aload #8
		// @0B0: bipush 115 (0x73)
		// @0B2: aload_0
		// @0B3: invokeinterface game.C_100184_rn.func_100434_b(int, game.C_100336_im)game.C_100205_qf
		// @0B8: iconst_0
		// @0B9: invokevirtual game.C_100205_qf.func_103674_b(int)int
		// @0BC: ldc 1572633761 (0x5dbc7ca1)
		// @0BE: ishr
		// @0BF: iadd
		// @0C0: istore #10
		// @0C2: getstatic game.C_100133_tk game.C_100297_kf.field_101234_s
		// @0C5: aload #6
		// @0C7: if_acmpeq @131
		// @0CA: aload #6
		// @0CC: getstatic game.C_100133_tk game.C_100238_ol.field_101696_R
		// @0CF: if_acmpeq @131
		// @0D2: goto @0D6
		// @0D5: athrow
		// @0D6: aload #6
		// @0D8: getstatic game.C_100133_tk game.C_100256_pk.field_100466_a
		// @0DB: if_acmpeq @110
		// @0DE: goto @0E2
		// @0E1: athrow
		// @0E2: getstatic game.C_100133_tk game.C_100079_e.field_102670_tb
		// @0E5: aload #6
		// @0E7: if_acmpne @1F4
		// @0EA: goto @0EE
		// @0ED: athrow
		// @0EE: getstatic game.C_100037_wb[] game.C_100163_sf.field_105435_g
		// @0F1: iconst_1
		// @0F2: aaload
		// @0F3: astore #7
		// @0F5: aload #7
		// @0F7: iload #9
		// @0F9: aload #7
		// @0FB: getfield int game.C_100037_wb.field_102337_u
		// @0FE: ldc 1832441505 (0x6d38d6a1)
		// @100: ishr
		// @101: ineg
		// @102: iload #10
		// @104: iadd
		// @105: sipush 256 (0x0100)
		// @108: invokevirtual game.C_100037_wb.func_102367_c(int, int, int)void
		// @10B: iload #13
		// @10D: ifeq @1F4
		// @110: getstatic game.C_100037_wb[] game.C_100163_sf.field_105435_g
		// @113: iconst_2
		// @114: aaload
		// @115: astore #7
		// @117: aload #7
		// @119: iload #9
		// @11B: iload #10
		// @11D: aload #7
		// @11F: getfield int game.C_100037_wb.field_102337_u
		// @122: ldc 381858753 (0x16c2b3c1)
		// @124: ishr
		// @125: isub
		// @126: sipush 256 (0x0100)
		// @129: invokevirtual game.C_100037_wb.func_102367_c(int, int, int)void
		// @12C: iload #13
		// @12E: ifeq @1F4
		// @131: getstatic game.C_100037_wb[] game.C_100163_sf.field_105435_g
		// @134: iconst_0
		// @135: aaload
		// @136: astore #7
		// @138: aload #7
		// @13A: getfield int game.C_100037_wb.field_102341_y
		// @13D: ldc -1179047711 (0xb9b928e1)
		// @13F: ishl
		// @140: istore #11
		// @142: aload #7
		// @144: getfield int game.C_100037_wb.field_102340_z
		// @147: ldc -230189535 (0xf2479621)
		// @149: ishl
		// @14A: istore #12
		// @14C: aconst_null
		// @14D: aload_0
		// @14E: getfield game.C_100037_wb game.C_100056_de.field_103184_fb
		// @151: if_acmpeq @17C
		// @154: iload #11
		// @156: iconst_m1
		// @157: ixor
		// @158: aload_0
		// @159: getfield game.C_100037_wb game.C_100056_de.field_103184_fb
		// @15C: getfield int game.C_100037_wb.field_102339_s
		// @15F: iconst_m1
		// @160: ixor
		// @161: if_icmplt @17C
		// @164: goto @168
		// @167: athrow
		// @168: aload_0
		// @169: getfield game.C_100037_wb game.C_100056_de.field_103184_fb
		// @16C: getfield int game.C_100037_wb.field_102337_u
		// @16F: iconst_m1
		// @170: ixor
		// @171: iload #12
		// @173: iconst_m1
		// @174: ixor
		// @175: if_icmple @19D
		// @178: goto @17C
		// @17B: athrow
		// @17C: aload_0
		// @17D: new game.C_100037_wb
		// @180: dup
		// @181: iload #11
		// @183: iload #12
		// @185: invokespecial game.C_100037_wb.<init>(int, int)void
		// @188: putfield game.C_100037_wb game.C_100056_de.field_103184_fb
		// @18B: aload_0
		// @18C: getfield game.C_100037_wb game.C_100056_de.field_103184_fb
		// @18F: bipush -4 (0xFC)
		// @191: invokestatic game.C_100138_bo.func_100398_a(game.C_100037_wb, int)void
		// @194: iload #13
		// @196: ifeq @1AD
		// @199: goto @19D
		// @19C: athrow
		// @19D: aload_0
		// @19E: getfield game.C_100037_wb game.C_100056_de.field_103184_fb
		// @1A1: bipush -4 (0xFC)
		// @1A3: invokestatic game.C_100138_bo.func_100398_a(game.C_100037_wb, int)void
		// @1A6: invokestatic game.C_100196_rb.func_105792_b()void
		// @1A9: goto @1AD
		// @1AC: athrow
		// @1AD: aload #7
		// @1AF: bipush 112 (0x70)
		// @1B1: sipush 144 (0x0090)
		// @1B4: aload #7
		// @1B6: getfield int game.C_100037_wb.field_102341_y
		// @1B9: ldc 501817060 (0x1de91ee4)
		// @1BB: ishl
		// @1BC: aload #7
		// @1BE: getfield int game.C_100037_wb.field_102340_z
		// @1C1: ldc 1285101796 (0x4c9918e4)
		// @1C3: ishl
		// @1C4: aload_0
		// @1C5: getfield int game.C_100056_de.field_103182_hb
		// @1C8: ineg
		// @1C9: ldc -1113107542 (0xbda753aa)
		// @1CB: ishl
		// @1CC: sipush 4096 (0x1000)
		// @1CF: invokevirtual game.C_100037_wb.func_102357_a(int, int, int, int, int, int)void
		// @1D2: bipush -77 (0xB3)
		// @1D4: invokestatic game.C_100200_ba.func_105842_a(byte)void
		// @1D7: aload_0
		// @1D8: getfield game.C_100037_wb game.C_100056_de.field_103184_fb
		// @1DB: iload #9
		// @1DD: aload #7
		// @1DF: getfield int game.C_100037_wb.field_102341_y
		// @1E2: ldc 1004000481 (0x3bd7d4e1)
		// @1E4: ishr
		// @1E5: isub
		// @1E6: iload #10
		// @1E8: aload #7
		// @1EA: getfield int game.C_100037_wb.field_102340_z
		// @1ED: isub
		// @1EE: sipush 256 (0x0100)
		// @1F1: invokevirtual game.C_100037_wb.func_102367_c(int, int, int)void
		// @1F4: goto @237
		// @1F7: astore #5
		// @1F9: aload #5
		// @1FB: new java.lang.StringBuilder
		// @1FE: dup
		// @1FF: invokespecial java.lang.StringBuilder.<init>()void
		// @202: getstatic java.lang.String[] game.C_100056_de.field_103189_ob
		// @205: bipush 6 (0x06)
		// @207: aaload
		// @208: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @20B: iload_1
		// @20C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @20F: bipush 44 (0x2C)
		// @211: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @214: iload_2
		// @215: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @218: bipush 44 (0x2C)
		// @21A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @21D: iload_3
		// @21E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @221: bipush 44 (0x2C)
		// @223: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @226: iload #4
		// @228: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @22B: bipush 41 (0x29)
		// @22D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @230: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @233: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @236: athrow
		// @237: return
	}
	
	public static void func_103175_l(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic game.C_100302_ka game.C_100056_de.field_103195_bb
		// @04: aconst_null
		// @05: putstatic game.C_100037_wb[] game.C_100056_de.field_103188_nb
		// @08: aconst_null
		// @09: putstatic java.lang.String game.C_100056_de.field_103183_eb
		// @0C: aconst_null
		// @0D: putstatic java.lang.String[] game.C_100056_de.field_103180_db
		// @10: aconst_null
		// @11: putstatic int[] game.C_100056_de.field_103187_ib
		// @14: aconst_null
		// @15: putstatic java.lang.String game.C_100056_de.field_103181_cb
		// @18: aconst_null
		// @19: putstatic game.C_100037_wb[] game.C_100056_de.field_103185_gb
		// @1C: aconst_null
		// @1D: checkcast int[][]
		// @20: putstatic int[][] game.C_100056_de.field_103192_lb
		// @23: iload_0
		// @24: sipush 256 (0x0100)
		// @27: if_icmpeq @35
		// @2A: bipush -34 (0xDE)
		// @2C: iconst_0
		// @2D: aconst_null
		// @2E: checkcast byte[]
		// @31: invokestatic game.C_100056_de.func_103176_a(int, boolean, byte[])java.lang.Object
		// @34: pop
		// @35: goto @5A
		// @38: astore_1
		// @39: aload_1
		// @3A: new java.lang.StringBuilder
		// @3D: dup
		// @3E: invokespecial java.lang.StringBuilder.<init>()void
		// @41: getstatic java.lang.String[] game.C_100056_de.field_103189_ob
		// @44: bipush 9 (0x09)
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
	
	static final Object func_103176_a(int arg0, boolean arg1, byte[] arg2)
	{
		// @00: aconst_null
		// @01: aload_2
		// @02: if_acmpeq @09
		// @05: goto @0B
		// @08: athrow
		// @09: aconst_null
		// @0A: areturn
		// @0B: iload_0
		// @0C: aload_2
		// @0D: arraylength
		// @0E: iconst_m1
		// @0F: ixor
		// @10: if_icmple @24
		// @13: new game.C_100042_we
		// @16: dup
		// @17: invokespecial game.C_100042_we.<init>()void
		// @1A: astore_3
		// @1B: aload_3
		// @1C: aload_2
		// @1D: bipush -75 (0xB5)
		// @1F: invokevirtual game.C_100116_ei.func_104114_a(byte[], byte)void
		// @22: aload_3
		// @23: areturn
		// @24: iload_1
		// @25: ifne @2A
		// @28: aload_2
		// @29: areturn
		// @2A: iload_0
		// @2B: sipush -137 (0xFF77)
		// @2E: ixor
		// @2F: aload_2
		// @30: invokestatic game.C_100157_db.func_103547_a(int, byte[])byte[]
		// @33: areturn
		// @34: astore_3
		// @35: aload_3
		// @36: new java.lang.StringBuilder
		// @39: dup
		// @3A: invokespecial java.lang.StringBuilder.<init>()void
		// @3D: getstatic java.lang.String[] game.C_100056_de.field_103189_ob
		// @40: iconst_2
		// @41: aaload
		// @42: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @45: iload_0
		// @46: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @49: bipush 44 (0x2C)
		// @4B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4E: iload_1
		// @4F: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @52: bipush 44 (0x2C)
		// @54: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @57: aload_2
		// @58: ifnull @64
		// @5B: getstatic java.lang.String[] game.C_100056_de.field_103189_ob
		// @5E: iconst_0
		// @5F: aaload
		// @60: goto @69
		// @63: athrow
		// @64: getstatic java.lang.String[] game.C_100056_de.field_103189_ob
		// @67: iconst_1
		// @68: aaload
		// @69: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @6C: bipush 41 (0x29)
		// @6E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @71: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @74: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @77: athrow
	}
	
	final String func_102525_c(byte arg0)
	{
		// @00: iload_1
		// @01: bipush 34 (0x22)
		// @03: if_icmpgt @0B
		// @06: aconst_null
		// @07: checkcast java.lang.String
		// @0A: areturn
		// @0B: aconst_null
		// @0C: areturn
		// @0D: astore_2
		// @0E: aload_2
		// @0F: new java.lang.StringBuilder
		// @12: dup
		// @13: invokespecial java.lang.StringBuilder.<init>()void
		// @16: getstatic java.lang.String[] game.C_100056_de.field_103189_ob
		// @19: bipush 8 (0x08)
		// @1B: aaload
		// @1C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1F: iload_1
		// @20: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @23: bipush 41 (0x29)
		// @25: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @28: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @2B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @2E: athrow
	}
	
	C_100056_de(C_100308_lh arg0, String arg1, int arg2, int arg3, int arg4, int arg5)
	{
		// @00: aload_0
		// @01: aload_2
		// @02: iconst_0
		// @03: invokestatic game.C_100151_bc.func_102928_a(boolean)game.C_100256_pk
		// @06: invokespecial game.C_100083_c.<init>(java.lang.String, game.C_100326_ic)void
		// @09: aload_0
		// @0A: aload_2
		// @0B: putfield java.lang.String game.C_100056_de.field_103196_Z
		// @0E: aload_0
		// @0F: aload_1
		// @10: putfield game.C_100308_lh game.C_100056_de.field_103191_kb
		// @13: aload_0
		// @14: iload #6
		// @16: iload #4
		// @18: iload_3
		// @19: iload #5
		// @1B: bipush -92 (0xA4)
		// @1D: invokevirtual game.C_100056_de.func_102524_a(int, int, int, int, byte)void
		// @20: goto @98
		// @23: astore #7
		// @25: aload #7
		// @27: new java.lang.StringBuilder
		// @2A: dup
		// @2B: invokespecial java.lang.StringBuilder.<init>()void
		// @2E: getstatic java.lang.String[] game.C_100056_de.field_103189_ob
		// @31: iconst_4
		// @32: aaload
		// @33: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @36: aload_1
		// @37: ifnull @43
		// @3A: getstatic java.lang.String[] game.C_100056_de.field_103189_ob
		// @3D: iconst_0
		// @3E: aaload
		// @3F: goto @48
		// @42: athrow
		// @43: getstatic java.lang.String[] game.C_100056_de.field_103189_ob
		// @46: iconst_1
		// @47: aaload
		// @48: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4B: bipush 44 (0x2C)
		// @4D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @50: aload_2
		// @51: ifnull @5D
		// @54: getstatic java.lang.String[] game.C_100056_de.field_103189_ob
		// @57: iconst_0
		// @58: aaload
		// @59: goto @62
		// @5C: athrow
		// @5D: getstatic java.lang.String[] game.C_100056_de.field_103189_ob
		// @60: iconst_1
		// @61: aaload
		// @62: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @65: bipush 44 (0x2C)
		// @67: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6A: iload_3
		// @6B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6E: bipush 44 (0x2C)
		// @70: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @73: iload #4
		// @75: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @78: bipush 44 (0x2C)
		// @7A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7D: iload #5
		// @7F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @82: bipush 44 (0x2C)
		// @84: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @87: iload #6
		// @89: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8C: bipush 41 (0x29)
		// @8E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @91: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @94: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @97: athrow
		// @98: return
	}
	
	static
	{
		// @00: bipush 10 (0x0A)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "J\u0007ji6"
		// @09: invokestatic game.C_100056_de.func_103178_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100056_de.func_103177_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "_\\(+"
		// @14: invokestatic game.C_100056_de.func_103178_z(java.lang.String)char[]
		// @17: invokestatic game.C_100056_de.func_103177_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "ULj\u0003c"
		// @1F: invokestatic game.C_100056_de.func_103178_z(java.lang.String)char[]
		// @22: invokestatic game.C_100056_de.func_103177_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "ULj\u0016c"
		// @2A: invokestatic game.C_100056_de.func_103178_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100056_de.func_103177_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "ULj{\"_@0yc"
		// @35: invokestatic game.C_100056_de.func_103178_z(java.lang.String)char[]
		// @38: invokestatic game.C_100056_de.func_103177_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "ULj\u0014c"
		// @40: invokestatic game.C_100056_de.func_103178_z(java.lang.String)char[]
		// @43: invokestatic game.C_100056_de.func_103177_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "ULj\u0004c"
		// @4C: invokestatic game.C_100056_de.func_103178_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100056_de.func_103177_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "ULj\u0005c"
		// @58: invokestatic game.C_100056_de.func_103178_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100056_de.func_103177_z(char[])java.lang.String
		// @5E: aastore
		// @5F: dup
		// @60: bipush 8 (0x08)
		// @62: ldc "ULj\u0001c"
		// @64: invokestatic game.C_100056_de.func_103178_z(java.lang.String)char[]
		// @67: invokestatic game.C_100056_de.func_103177_z(char[])java.lang.String
		// @6A: aastore
		// @6B: dup
		// @6C: bipush 9 (0x09)
		// @6E: ldc "ULj\u0006c"
		// @70: invokestatic game.C_100056_de.func_103178_z(java.lang.String)char[]
		// @73: invokestatic game.C_100056_de.func_103177_z(char[])java.lang.String
		// @76: aastore
		// @77: putstatic java.lang.String[] game.C_100056_de.field_103189_ob
		// @7A: bipush 8 (0x08)
		// @7C: anewarray java.lang.String
		// @7F: dup
		// @80: iconst_0
		// @81: aconst_null
		// @82: aastore
		// @83: dup
		// @84: iconst_1
		// @85: ldc "eFd4?^[!g2^\\6g;CF#5.BZhg2^\\x))BYz*>B]"
		// @87: invokestatic game.C_100056_de.func_103178_z(java.lang.String)char[]
		// @8A: invokestatic game.C_100056_de.func_103177_z(char[])java.lang.String
		// @8D: aastore
		// @8E: dup
		// @8F: iconst_2
		// @90: ldc "eFd4?^[!g2^\\6g8RF6\"g\u0011P+2w_K77u\\\\73"
		// @92: invokestatic game.C_100056_de.func_103178_z(java.lang.String)char[]
		// @95: invokestatic game.C_100056_de.func_103177_z(char[])java.lang.String
		// @98: aastore
		// @99: dup
		// @9A: iconst_3
		// @9B: ldc "eFd4?^[!g2^\\6g8RF6\"kPG g;CF#5.BZhg2^\\x))BYz*>B]"
		// @9D: invokestatic game.C_100056_de.func_103178_z(java.lang.String)char[]
		// @A0: invokestatic game.C_100056_de.func_103177_z(char[])java.lang.String
		// @A3: aastore
		// @A4: dup
		// @A5: iconst_4
		// @A6: ldc "eFd4?^[!g2^\\6g*RA-\"=TD!)?B\u0005d>$D\u0015*%8A\u0017)28E"
		// @A8: invokestatic game.C_100056_de.func_103178_z(java.lang.String)char[]
		// @AB: invokestatic game.C_100056_de.func_103177_z(char[])java.lang.String
		// @AE: aastore
		// @AF: dup
		// @B0: iconst_5
		// @B1: ldc "eFd4?^[!g2^\\6g*RA-\"=TD!)?B\t%)/\u0011Y6(,CL74g\u0011P+2w_K77u\\\\73"
		// @B3: invokestatic game.C_100056_de.func_103178_z(java.lang.String)char[]
		// @B6: invokestatic game.C_100056_de.func_103177_z(char[])java.lang.String
		// @B9: aastore
		// @BA: dup
		// @BB: bipush 6 (0x06)
		// @BD: ldc "eFd4?^[!g2^\\6g*RA-\"=TD!)?B\t%)/\u0011Z'(9T\u0005d>$D\u0015*%8A\u0017)28E"
		// @BF: invokestatic game.C_100056_de.func_103178_z(java.lang.String)char[]
		// @C2: invokestatic game.C_100056_de.func_103177_z(char[])java.lang.String
		// @C5: aastore
		// @C6: dup
		// @C7: bipush 7 (0x07)
		// @C9: ldc "eFd4?^[!g2^\\6g*RA-\"=TD!)?B\u0005d4(^[!g*_Md79^N6\"8B\u0005d>$D\u0015*%8A\u0017)28E"
		// @CB: invokestatic game.C_100056_de.func_103178_z(java.lang.String)char[]
		// @CE: invokestatic game.C_100056_de.func_103177_z(char[])java.lang.String
		// @D1: aastore
		// @D2: putstatic java.lang.String[] game.C_100056_de.field_103180_db
		// @D5: iconst_m1
		// @D6: putstatic int game.C_100056_de.field_103193_ab
		// @D9: ldc "aE!&8T\t!)?T[d>$D[d&,T\t-)kHL%58"
		// @DB: invokestatic game.C_100056_de.func_103178_z(java.lang.String)char[]
		// @DE: invokestatic game.C_100056_de.func_103177_z(char[])java.lang.String
		// @E1: putstatic java.lang.String game.C_100056_de.field_103181_cb
		// @E4: ldc "\u0019`*$'DM-),\u0011\u0015awu\u0018"
		// @E6: invokestatic game.C_100056_de.func_103178_z(java.lang.String)char[]
		// @E9: invokestatic game.C_100056_de.func_103177_z(char[])java.lang.String
		// @EC: putstatic java.lang.String game.C_100056_de.field_103183_eb
		// @EF: iconst_m1
		// @F0: putstatic int game.C_100056_de.field_103190_mb
		// @F3: return
	}
	
	private static char[] func_103178_z(String arg0)
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
		// @0E: bipush 75 (0x4B)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_103177_z(char[] arg0)
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
		// @30: bipush 49 (0x31)
		// @32: goto @46
		// @35: bipush 41 (0x29)
		// @37: goto @46
		// @3A: bipush 68 (0x44)
		// @3C: goto @46
		// @3F: bipush 71 (0x47)
		// @41: goto @46
		// @44: bipush 75 (0x4B)
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
