package game;

final class C_100239_oi extends C_100325_id
{
	static boolean field_102299_L;
	int field_102311_s;
	private int field_102303_H;
	static int[] field_102305_J;
	private boolean field_102309_u;
	int field_102313_z;
	private boolean field_102314_y;
	private int field_102306_K;
	int field_102302_O;
	boolean field_102310_t;
	static int field_102312_P;
	int field_102300_M;
	C_100314_lf field_102294_F;
	int field_102301_N;
	private boolean field_102304_I;
	private C_100037_wb field_102292_D;
	private C_100314_lf[] field_102308_v;
	private C_100294_ki field_102315_x;
	private int field_102297_B;
	static int field_102307_w;
	static String field_102298_C;
	int field_102296_A;
	static int field_102293_E;
	private static final String[] field_102295_G;
	
	final void func_102284_a(int arg0, int arg1, int arg2, int arg3)
	{
		// @000: iload_1
		// @001: aload_0
		// @002: getfield int game.C_100239_oi.field_102296_A
		// @005: imul
		// @006: ldc -183947760 (0xf5092e10)
		// @008: ishr
		// @009: iload #4
		// @00B: iadd
		// @00C: istore #5
		// @00E: iload_1
		// @00F: aload_0
		// @010: getfield int game.C_100239_oi.field_102301_N
		// @013: imul
		// @014: ldc 743684400 (0x2c53b930)
		// @016: ishr
		// @017: iload_2
		// @018: iadd
		// @019: istore #6
		// @01B: iconst_2
		// @01C: aload_0
		// @01D: getfield game.C_100037_wb game.C_100239_oi.field_102292_D
		// @020: getfield int game.C_100037_wb.field_102341_y
		// @023: iconst_2
		// @024: idiv
		// @025: iadd
		// @026: istore #7
		// @028: iconst_2
		// @029: aload_0
		// @02A: getfield game.C_100037_wb game.C_100239_oi.field_102292_D
		// @02D: getfield int game.C_100037_wb.field_102340_z
		// @030: iconst_2
		// @031: idiv
		// @032: iadd
		// @033: istore #8
		// @035: iload_1
		// @036: aload_0
		// @037: getfield int game.C_100239_oi.field_102297_B
		// @03A: imul
		// @03B: ldc -1295100912 (0xb2ce5410)
		// @03D: ishr
		// @03E: iconst_3
		// @03F: imul
		// @040: iconst_2
		// @041: idiv
		// @042: istore #9
		// @044: aload_0
		// @045: getfield int game.C_100239_oi.field_102303_H
		// @048: iload_1
		// @049: imul
		// @04A: ldc 1299907120 (0x4d7b0230)
		// @04C: ishr
		// @04D: iload_3
		// @04E: imul
		// @04F: iconst_2
		// @050: idiv
		// @051: istore #10
		// @053: sipush 256 (0x0100)
		// @056: aload_0
		// @057: getfield int game.C_100239_oi.field_102300_M
		// @05A: iconst_2
		// @05B: idiv
		// @05C: invokestatic java.lang.Math.min(int, int)int
		// @05F: istore #11
		// @061: aconst_null
		// @062: getstatic game.C_100037_wb game.C_100218_am.field_103112_G
		// @065: if_acmpeq @06C
		// @068: goto @07F
		// @06B: athrow
		// @06C: new game.C_100037_wb
		// @06F: dup
		// @070: iload #9
		// @072: iconst_5
		// @073: iload #8
		// @075: iadd
		// @076: iload #10
		// @078: iadd
		// @079: invokespecial game.C_100037_wb.<init>(int, int)void
		// @07C: putstatic game.C_100037_wb game.C_100218_am.field_103112_G
		// @07F: getstatic game.C_100037_wb game.C_100218_am.field_103112_G
		// @082: invokevirtual game.C_100037_wb.func_102379_d()void
		// @085: iconst_0
		// @086: iconst_0
		// @087: getstatic game.C_100037_wb game.C_100218_am.field_103112_G
		// @08A: getfield int game.C_100037_wb.field_102341_y
		// @08D: getstatic game.C_100037_wb game.C_100218_am.field_103112_G
		// @090: getfield int game.C_100037_wb.field_102340_z
		// @093: iconst_0
		// @094: invokestatic game.C_100196_rb.func_105782_i(int, int, int, int, int)void
		// @097: iload #6
		// @099: iload #10
		// @09B: bipush -5 (0xFB)
		// @09D: iadd
		// @09E: isub
		// @09F: istore #6
		// @0A1: aload_0
		// @0A2: getfield int game.C_100239_oi.field_102300_M
		// @0A5: iconst_5
		// @0A6: idiv
		// @0A7: iconst_3
		// @0A8: irem
		// @0A9: istore #12
		// @0AB: iload #5
		// @0AD: iload #9
		// @0AF: iconst_2
		// @0B0: idiv
		// @0B1: isub
		// @0B2: istore #5
		// @0B4: ldc 6719624 (0x668888)
		// @0B6: istore #13
		// @0B8: aload_0
		// @0B9: getfield boolean game.C_100239_oi.field_102304_I
		// @0BC: ifne @0C3
		// @0BF: goto @0C7
		// @0C2: athrow
		// @0C3: ldc 8921736 (0x882288)
		// @0C5: istore #13
		// @0C7: getstatic game.C_100037_wb game.C_100218_am.field_103112_G
		// @0CA: getfield int game.C_100037_wb.field_102340_z
		// @0CD: iload #10
		// @0CF: ineg
		// @0D0: iadd
		// @0D1: istore #14
		// @0D3: aload_0
		// @0D4: getfield boolean game.C_100239_oi.field_102314_y
		// @0D7: ifeq @0EC
		// @0DA: invokestatic java.lang.Math.random()double
		// @0DD: ldc2_w 0.1
		// @0E0: dcmpg
		// @0E1: ifge @0EC
		// @0E4: goto @0E8
		// @0E7: athrow
		// @0E8: goto @1F7
		// @0EB: athrow
		// @0EC: aload_0
		// @0ED: getfield game.C_100037_wb game.C_100239_oi.field_102292_D
		// @0F0: getfield int game.C_100037_wb.field_102335_w
		// @0F3: iconst_2
		// @0F4: idiv
		// @0F5: aload_0
		// @0F6: getfield int game.C_100239_oi.field_102306_K
		// @0F9: aload_0
		// @0FA: getfield game.C_100037_wb game.C_100239_oi.field_102292_D
		// @0FD: getfield int game.C_100037_wb.field_102339_s
		// @100: irem
		// @101: iconst_2
		// @102: idiv
		// @103: iadd
		// @104: iload #7
		// @106: ineg
		// @107: iload #9
		// @109: iadd
		// @10A: iconst_2
		// @10B: idiv
		// @10C: ldc2_w 2.0
		// @10F: aload_0
		// @110: getfield int game.C_100239_oi.field_102300_M
		// @113: i2d
		// @114: ldc2_w 0.2
		// @117: dmul
		// @118: invokestatic java.lang.Math.sin(double)double
		// @11B: dmul
		// @11C: d2i
		// @11D: iadd
		// @11E: iadd
		// @11F: istore #15
		// @121: iconst_2
		// @122: aload_0
		// @123: getfield game.C_100037_wb game.C_100239_oi.field_102292_D
		// @126: getfield int game.C_100037_wb.field_102332_H
		// @129: iconst_2
		// @12A: idiv
		// @12B: iadd
		// @12C: aload_0
		// @12D: getfield int game.C_100239_oi.field_102306_K
		// @130: aload_0
		// @131: getfield game.C_100037_wb game.C_100239_oi.field_102292_D
		// @134: getfield int game.C_100037_wb.field_102337_u
		// @137: iconst_2
		// @138: imul
		// @139: idiv
		// @13A: iadd
		// @13B: aload_0
		// @13C: getfield int game.C_100239_oi.field_102300_M
		// @13F: i2d
		// @140: ldc2_w 0.3
		// @143: dmul
		// @144: invokestatic java.lang.Math.cos(double)double
		// @147: ldc2_w 2.0
		// @14A: dmul
		// @14B: d2i
		// @14C: iadd
		// @14D: istore #16
		// @14F: aload_0
		// @150: getfield game.C_100037_wb game.C_100239_oi.field_102292_D
		// @153: iload #7
		// @155: ineg
		// @156: iload #9
		// @158: iadd
		// @159: iconst_2
		// @15A: idiv
		// @15B: aload_0
		// @15C: getfield int game.C_100239_oi.field_102300_M
		// @15F: i2d
		// @160: ldc2_w 0.2
		// @163: dmul
		// @164: invokestatic java.lang.Math.sin(double)double
		// @167: ldc2_w 2.0
		// @16A: dmul
		// @16B: d2i
		// @16C: iadd
		// @16D: ldc2_w 0.3
		// @170: aload_0
		// @171: getfield int game.C_100239_oi.field_102300_M
		// @174: i2d
		// @175: dmul
		// @176: invokestatic java.lang.Math.cos(double)double
		// @179: ldc2_w 2.0
		// @17C: dmul
		// @17D: d2i
		// @17E: iconst_2
		// @17F: iadd
		// @180: invokevirtual game.C_100037_wb.func_102360_g(int, int)void
		// @183: iload #9
		// @185: iconst_2
		// @186: idiv
		// @187: ldc2_w 5.0
		// @18A: aload_0
		// @18B: getfield int game.C_100239_oi.field_102300_M
		// @18E: i2d
		// @18F: ldc2_w 0.1
		// @192: dmul
		// @193: invokestatic java.lang.Math.sin(double)double
		// @196: dmul
		// @197: d2i
		// @198: ineg
		// @199: isub
		// @19A: iload #14
		// @19C: iload #15
		// @19E: iload #16
		// @1A0: aload_0
		// @1A1: getfield boolean game.C_100239_oi.field_102304_I
		// @1A4: ifeq @1AD
		// @1A7: ldc 12264123 (0xbb22bb)
		// @1A9: goto @1AF
		// @1AC: athrow
		// @1AD: ldc 12303138 (0xbbbb22)
		// @1AF: sipush 192 (0x00C0)
		// @1B2: invokestatic game.C_100196_rb.func_105813_h(int, int, int, int, int, int)void
		// @1B5: iconst_m1
		// @1B6: iload #15
		// @1B8: iadd
		// @1B9: iload #16
		// @1BB: iload #13
		// @1BD: invokestatic game.C_100196_rb.func_105803_a(int, int, int)void
		// @1C0: iload #15
		// @1C2: iconst_m1
		// @1C3: iload #16
		// @1C5: iadd
		// @1C6: iload #13
		// @1C8: invokestatic game.C_100196_rb.func_105803_a(int, int, int)void
		// @1CB: iconst_1
		// @1CC: iload #15
		// @1CE: iadd
		// @1CF: iload #16
		// @1D1: iload #13
		// @1D3: invokestatic game.C_100196_rb.func_105803_a(int, int, int)void
		// @1D6: iload #15
		// @1D8: iload #16
		// @1DA: iconst_1
		// @1DB: iadd
		// @1DC: iload #13
		// @1DE: invokestatic game.C_100196_rb.func_105803_a(int, int, int)void
		// @1E1: iload #15
		// @1E3: iload #16
		// @1E5: aload_0
		// @1E6: getfield boolean game.C_100239_oi.field_102304_I
		// @1E9: ifeq @1F2
		// @1EC: ldc 16755455 (0xffaaff)
		// @1EE: goto @1F4
		// @1F1: athrow
		// @1F2: ldc 11206655 (0xaaffff)
		// @1F4: invokestatic game.C_100196_rb.func_105803_a(int, int, int)void
		// @1F7: getstatic game.C_100153_be[] game.C_100078_ul.field_103284_ob
		// @1FA: iload #12
		// @1FC: aaload
		// @1FD: iconst_0
		// @1FE: iload #14
		// @200: iload #9
		// @202: iload #10
		// @204: invokevirtual game.C_100153_be.func_105308_a(int, int, int, int)void
		// @207: aload_0
		// @208: getfield boolean game.C_100239_oi.field_102314_y
		// @20B: ifne @20E
		// @20E: iload #6
		// @210: iload #10
		// @212: isub
		// @213: istore #6
		// @215: getstatic game.C_100185_rm game.C_100049_vf.field_104206_l
		// @218: bipush 112 (0x70)
		// @21A: invokevirtual game.C_100185_rm.func_105476_a(byte)void
		// @21D: sipush -257 (0xFEFF)
		// @220: iload #11
		// @222: iconst_m1
		// @223: ixor
		// @224: if_icmplt @23B
		// @227: getstatic game.C_100037_wb game.C_100218_am.field_103112_G
		// @22A: iload #5
		// @22C: iload #6
		// @22E: invokevirtual game.C_100037_wb.func_102353_h(int, int)void
		// @231: getstatic int game.SteelSentinels.field_105275_O
		// @234: ifeq @24B
		// @237: goto @23B
		// @23A: athrow
		// @23B: getstatic game.C_100037_wb game.C_100218_am.field_103112_G
		// @23E: iload #5
		// @240: iload #6
		// @242: iload #11
		// @244: invokevirtual game.C_100037_wb.func_102376_d(int, int, int)void
		// @247: goto @24B
		// @24A: athrow
		// @24B: goto @28D
		// @24E: astore #5
		// @250: aload #5
		// @252: new java.lang.StringBuilder
		// @255: dup
		// @256: invokespecial java.lang.StringBuilder.<init>()void
		// @259: getstatic java.lang.String[] game.C_100239_oi.field_102295_G
		// @25C: iconst_0
		// @25D: aaload
		// @25E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @261: iload_1
		// @262: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @265: bipush 44 (0x2C)
		// @267: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @26A: iload_2
		// @26B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @26E: bipush 44 (0x2C)
		// @270: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @273: iload_3
		// @274: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @277: bipush 44 (0x2C)
		// @279: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @27C: iload #4
		// @27E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @281: bipush 41 (0x29)
		// @283: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @286: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @289: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @28C: athrow
		// @28D: return
	}
	
	static final void func_102291_a(int arg0, boolean arg1)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #13
		// @005: getstatic int game.C_100196_rb.field_105819_e
		// @008: putstatic int game.C_100260_mc.field_102234_jc
		// @00B: getstatic int game.C_100196_rb.field_105821_c
		// @00E: putstatic int game.C_100103_eh.field_104666_b
		// @011: iconst_0
		// @012: iload_1
		// @013: ifeq @01D
		// @016: getstatic int game.C_100102_w.field_104635_b
		// @019: goto @020
		// @01C: athrow
		// @01D: getstatic int game.C_100100_i.field_102014_hc
		// @020: invokestatic game.C_100080_b.func_104428_a(boolean, int)void
		// @023: getstatic game.C_100220_ac game.C_100091_m.field_104516_c
		// @026: iconst_0
		// @027: bipush -8 (0xF8)
		// @029: getstatic game.C_100302_ka game.C_100314_lf.field_101335_mc
		// @02C: getfield int game.C_100302_ka.field_101886_Kb
		// @02F: iconst_0
		// @030: getstatic game.C_100302_ka game.C_100314_lf.field_101335_mc
		// @033: getfield int game.C_100302_ka.field_101848_lb
		// @036: bipush -40 (0xD8)
		// @038: iadd
		// @039: bipush -2 (0xFE)
		// @03B: iadd
		// @03C: invokevirtual game.C_100220_ac.func_106052_a(int, byte, int, int, int)void
		// @03F: getstatic game.C_100302_ka game.C_100095_fe.field_103385_S
		// @042: iconst_0
		// @043: getstatic int game.C_100033_gj.field_101917_jc
		// @046: iconst_m1
		// @047: iconst_0
		// @048: getstatic game.C_100302_ka game.C_100030_gm.field_103341_D
		// @04B: getfield int game.C_100302_ka.field_101886_Kb
		// @04E: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @051: getstatic game.C_100302_ka game.C_100148_bh.field_101808_x
		// @054: iconst_0
		// @055: bipush 18 (0x12)
		// @057: iconst_m1
		// @058: iconst_2
		// @059: getstatic int game.C_100033_gj.field_101917_jc
		// @05C: iadd
		// @05D: getstatic boolean game.C_100273_mm.field_106682_e
		// @060: ifeq @06F
		// @063: bipush 42 (0x2A)
		// @065: getstatic int game.C_100099_fb.field_103046_u
		// @068: iadd
		// @069: iconst_2
		// @06A: iadd
		// @06B: goto @070
		// @06E: athrow
		// @06F: iconst_0
		// @070: ineg
		// @071: getstatic game.C_100302_ka game.C_100030_gm.field_103341_D
		// @074: getfield int game.C_100302_ka.field_101886_Kb
		// @077: iadd
		// @078: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @07B: getstatic game.C_100302_ka game.C_100169_co.field_105527_c
		// @07E: bipush -40 (0xD8)
		// @080: getstatic int game.C_100099_fb.field_103046_u
		// @083: ineg
		// @084: iadd
		// @085: getstatic game.C_100302_ka game.C_100030_gm.field_103341_D
		// @088: getfield int game.C_100302_ka.field_101886_Kb
		// @08B: iconst_2
		// @08C: isub
		// @08D: iadd
		// @08E: bipush 18 (0x12)
		// @090: iload_0
		// @091: iconst_m1
		// @092: iadd
		// @093: getstatic int game.C_100033_gj.field_101917_jc
		// @096: bipush -2 (0xFE)
		// @098: isub
		// @099: getstatic int game.C_100099_fb.field_103046_u
		// @09C: bipush 42 (0x2A)
		// @09E: iadd
		// @09F: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @0A2: getstatic game.C_100115_ej game.C_100009_fg.field_103654_g
		// @0A5: iconst_2
		// @0A6: bipush -2 (0xFE)
		// @0A8: getstatic int game.C_100033_gj.field_101917_jc
		// @0AB: ineg
		// @0AC: iadd
		// @0AD: getstatic game.C_100302_ka game.C_100030_gm.field_103341_D
		// @0B0: getfield int game.C_100302_ka.field_101848_lb
		// @0B3: iadd
		// @0B4: bipush 20 (0x14)
		// @0B6: isub
		// @0B7: iconst_0
		// @0B8: iconst_0
		// @0B9: getstatic game.C_100302_ka game.C_100030_gm.field_103341_D
		// @0BC: getfield int game.C_100302_ka.field_101886_Kb
		// @0BF: bipush 20 (0x14)
		// @0C1: getstatic int game.C_100033_gj.field_101917_jc
		// @0C4: bipush -2 (0xFE)
		// @0C6: isub
		// @0C7: iadd
		// @0C8: getstatic int game.C_100099_fb.field_103046_u
		// @0CB: invokevirtual game.C_100115_ej.func_102030_a(int, int, int, int, int, int, int)void
		// @0CE: getstatic game.C_100302_ka game.C_100200_ba.field_105847_f
		// @0D1: iconst_0
		// @0D2: bipush 40 (0x28)
		// @0D4: iload_0
		// @0D5: iconst_m1
		// @0D6: iadd
		// @0D7: bipush -40 (0xD8)
		// @0D9: getstatic game.C_100302_ka game.C_100314_lf.field_101335_mc
		// @0DC: getfield int game.C_100302_ka.field_101848_lb
		// @0DF: iadd
		// @0E0: getstatic game.C_100302_ka game.C_100314_lf.field_101335_mc
		// @0E3: getfield int game.C_100302_ka.field_101886_Kb
		// @0E6: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @0E9: getstatic game.C_100302_ka game.C_100250_pl.field_106436_b
		// @0EC: iconst_0
		// @0ED: bipush 30 (0x1E)
		// @0EF: iload_0
		// @0F0: iconst_m1
		// @0F1: iadd
		// @0F2: iconst_0
		// @0F3: getstatic game.C_100302_ka game.C_100318_hj.field_107196_d
		// @0F6: getfield int game.C_100302_ka.field_101886_Kb
		// @0F9: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @0FC: getstatic game.C_100302_ka game.C_100033_gj.field_101926_pc
		// @0FF: iconst_0
		// @100: bipush -40 (0xD8)
		// @102: getstatic game.C_100302_ka game.C_100318_hj.field_107196_d
		// @105: getfield int game.C_100302_ka.field_101848_lb
		// @108: bipush -32 (0xE0)
		// @10A: iadd
		// @10B: iadd
		// @10C: iconst_m1
		// @10D: bipush 30 (0x1E)
		// @10F: getstatic game.C_100302_ka game.C_100318_hj.field_107196_d
		// @112: getfield int game.C_100302_ka.field_101886_Kb
		// @115: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @118: getstatic int game.C_100137_bn.field_105038_l
		// @11B: iconst_3
		// @11C: iadd
		// @11D: istore_2
		// @11E: iconst_2
		// @11F: getstatic int[] game.C_100126_cb.field_103060_v
		// @122: arraylength
		// @123: if_icmpgt @12A
		// @126: goto @12D
		// @129: athrow
		// @12A: iinc #2 +255
		// @12D: iload_1
		// @12E: ifne @135
		// @131: goto @138
		// @134: athrow
		// @135: iinc #2 +255
		// @138: bipush -2 (0xFE)
		// @13A: iconst_1
		// @13B: iload_2
		// @13C: iadd
		// @13D: iconst_2
		// @13E: idiv
		// @13F: iconst_2
		// @140: iadd
		// @141: bipush -20 (0xEC)
		// @143: iadd
		// @144: getstatic game.C_100302_ka game.C_100033_gj.field_101926_pc
		// @147: getfield int game.C_100302_ka.field_101848_lb
		// @14A: iadd
		// @14B: iload_2
		// @14C: iconst_1
		// @14D: iadd
		// @14E: idiv
		// @14F: iadd
		// @150: istore_3
		// @151: iload_3
		// @152: iconst_m1
		// @153: ixor
		// @154: bipush -31 (0xE1)
		// @156: if_icmpge @15C
		// @159: bipush 30 (0x1E)
		// @15B: istore_3
		// @15C: bipush -5 (0xFB)
		// @15E: getstatic game.C_100302_ka game.C_100033_gj.field_101926_pc
		// @161: getfield int game.C_100302_ka.field_101848_lb
		// @164: iadd
		// @165: iconst_5
		// @166: iload_2
		// @167: iconst_2
		// @168: iload_3
		// @169: iadd
		// @16A: imul
		// @16B: iadd
		// @16C: isub
		// @16D: istore #4
		// @16F: iload #4
		// @171: bipush 40 (0x28)
		// @173: if_icmple @17A
		// @176: bipush 40 (0x28)
		// @178: istore #4
		// @17A: getstatic game.C_100302_ka game.C_100163_sf.field_105437_e
		// @17D: iconst_5
		// @17E: iload #4
		// @180: iload_0
		// @181: iconst_m1
		// @182: iadd
		// @183: iconst_5
		// @184: getstatic game.C_100302_ka game.C_100033_gj.field_101926_pc
		// @187: getfield int game.C_100302_ka.field_101886_Kb
		// @18A: bipush 10 (0x0A)
		// @18C: isub
		// @18D: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @190: iconst_2
		// @191: iload #4
		// @193: iadd
		// @194: iconst_5
		// @195: iadd
		// @196: istore #5
		// @198: iload_0
		// @199: istore #6
		// @19B: getstatic int game.C_100137_bn.field_105038_l
		// @19E: iconst_4
		// @19F: iadd
		// @1A0: iload #6
		// @1A2: if_icmple @478
		// @1A5: iload #6
		// @1A7: iconst_m1
		// @1A8: ixor
		// @1A9: bipush -2 (0xFE)
		// @1AB: iload #13
		// @1AD: ifne @51C
		// @1B0: if_icmpne @1CC
		// @1B3: goto @1B7
		// @1B6: athrow
		// @1B7: iconst_2
		// @1B8: getstatic int[] game.C_100126_cb.field_103060_v
		// @1BB: arraylength
		// @1BC: if_icmple @1CC
		// @1BF: goto @1C3
		// @1C2: athrow
		// @1C3: iload #13
		// @1C5: ifeq @470
		// @1C8: goto @1CC
		// @1CB: athrow
		// @1CC: bipush -4 (0xFC)
		// @1CE: iload #6
		// @1D0: iconst_m1
		// @1D1: ixor
		// @1D2: if_icmpne @1F0
		// @1D5: goto @1D9
		// @1D8: athrow
		// @1D9: getstatic int game.C_100140_bj.field_102966_e
		// @1DC: iconst_m1
		// @1DD: ixor
		// @1DE: bipush -2 (0xFE)
		// @1E0: if_icmplt @1F0
		// @1E3: goto @1E7
		// @1E6: athrow
		// @1E7: iload #13
		// @1E9: ifeq @470
		// @1EC: goto @1F0
		// @1EF: athrow
		// @1F0: iload_1
		// @1F1: ifne @202
		// @1F4: goto @1F8
		// @1F7: athrow
		// @1F8: iload #6
		// @1FA: iconst_3
		// @1FB: if_icmpeq @407
		// @1FE: goto @202
		// @201: athrow
		// @202: iload_1
		// @203: ifeq @214
		// @206: goto @20A
		// @209: athrow
		// @20A: iconst_0
		// @20B: iload #6
		// @20D: if_icmpeq @3A0
		// @210: goto @214
		// @213: athrow
		// @214: iload_1
		// @215: ifeq @244
		// @218: goto @21C
		// @21B: athrow
		// @21C: iload #6
		// @21E: iconst_4
		// @21F: if_icmplt @244
		// @222: goto @226
		// @225: athrow
		// @226: getstatic boolean[] game.C_100233_oa.field_106257_r
		// @229: ifnull @244
		// @22C: goto @230
		// @22F: athrow
		// @230: getstatic boolean[] game.C_100233_oa.field_106257_r
		// @233: iload #6
		// @235: iconst_4
		// @236: isub
		// @237: baload
		// @238: ifeq @244
		// @23B: goto @23F
		// @23E: athrow
		// @23F: iconst_1
		// @240: goto @245
		// @243: athrow
		// @244: iconst_0
		// @245: istore #7
		// @247: iload #7
		// @249: ifne @334
		// @24C: getstatic game.C_100302_ka[] game.C_100210_qa.field_101063_U
		// @24F: iload #6
		// @251: aaload
		// @252: iconst_5
		// @253: iload_3
		// @254: iconst_m1
		// @255: iload #5
		// @257: bipush 103 (0x67)
		// @259: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @25C: bipush 110 (0x6E)
		// @25E: istore #8
		// @260: iload_1
		// @261: ifeq @289
		// @264: getstatic game.C_100144_bm[][] game.C_100272_mn.field_102434_J
		// @267: iload #6
		// @269: aaload
		// @26A: iconst_0
		// @26B: aaload
		// @26C: iload #8
		// @26E: iconst_2
		// @26F: iload_3
		// @270: getstatic int game.C_100284_nj.field_106771_c
		// @273: sipush 2532 (0x09E4)
		// @276: bipush 38 (0x26)
		// @278: iload #5
		// @27A: invokevirtual game.C_100144_bm.func_102086_a(int, int, int, int, int, int, int)void
		// @27D: iinc #8 +40
		// @280: iload #13
		// @282: ifeq @2B4
		// @285: goto @289
		// @288: athrow
		// @289: getstatic game.C_100144_bm[][] game.C_100272_mn.field_102434_J
		// @28C: iload #6
		// @28E: aaload
		// @28F: iconst_0
		// @290: aaload
		// @291: ifnull @2B4
		// @294: goto @298
		// @297: athrow
		// @298: getstatic game.C_100144_bm[][] game.C_100272_mn.field_102434_J
		// @29B: iload #6
		// @29D: aaload
		// @29E: iconst_0
		// @29F: aaload
		// @2A0: astore #9
		// @2A2: getstatic game.C_100144_bm[][] game.C_100272_mn.field_102434_J
		// @2A5: iload #6
		// @2A7: aaload
		// @2A8: iconst_0
		// @2A9: aaload
		// @2AA: iconst_0
		// @2AB: putfield int game.C_100144_bm.field_101848_lb
		// @2AE: aload #9
		// @2B0: iconst_0
		// @2B1: putfield int game.C_100144_bm.field_101886_Kb
		// @2B4: iload #8
		// @2B6: ineg
		// @2B7: bipush -5 (0xFB)
		// @2B9: getstatic game.C_100302_ka game.C_100318_hj.field_107196_d
		// @2BC: getfield int game.C_100302_ka.field_101886_Kb
		// @2BF: iadd
		// @2C0: iconst_2
		// @2C1: iadd
		// @2C2: iadd
		// @2C3: istore #9
		// @2C5: iconst_m1
		// @2C6: getstatic game.C_100144_bm[][] game.C_100272_mn.field_102434_J
		// @2C9: iload #6
		// @2CB: aaload
		// @2CC: arraylength
		// @2CD: iadd
		// @2CE: istore #10
		// @2D0: iconst_0
		// @2D1: istore #11
		// @2D3: iload #11
		// @2D5: iconst_m1
		// @2D6: ixor
		// @2D7: iload #10
		// @2D9: iconst_m1
		// @2DA: ixor
		// @2DB: if_icmple @327
		// @2DE: iload #9
		// @2E0: iload #11
		// @2E2: imul
		// @2E3: iload #10
		// @2E5: idiv
		// @2E6: istore #12
		// @2E8: getstatic game.C_100144_bm[][] game.C_100272_mn.field_102434_J
		// @2EB: iload #6
		// @2ED: aaload
		// @2EE: iload #11
		// @2F0: iconst_1
		// @2F1: iadd
		// @2F2: aaload
		// @2F3: iload #12
		// @2F5: iload #8
		// @2F7: iadd
		// @2F8: iconst_2
		// @2F9: iload_3
		// @2FA: getstatic int game.C_100284_nj.field_106771_c
		// @2FD: sipush 2532 (0x09E4)
		// @300: iload #12
		// @302: ineg
		// @303: bipush -2 (0xFE)
		// @305: iconst_1
		// @306: iload #11
		// @308: iadd
		// @309: iload #9
		// @30B: imul
		// @30C: iload #10
		// @30E: idiv
		// @30F: iadd
		// @310: iadd
		// @311: iload #5
		// @313: invokevirtual game.C_100144_bm.func_102086_a(int, int, int, int, int, int, int)void
		// @316: iinc #11 +1
		// @319: iload #13
		// @31B: ifne @32F
		// @31E: iload #13
		// @320: ifeq @2D3
		// @323: goto @327
		// @326: athrow
		// @327: iload #5
		// @329: iconst_2
		// @32A: iload_3
		// @32B: iadd
		// @32C: iadd
		// @32D: istore #5
		// @32F: iload #13
		// @331: ifeq @39B
		// @334: getstatic game.C_100302_ka[] game.C_100210_qa.field_101063_U
		// @337: iload #6
		// @339: aaload
		// @33A: astore #8
		// @33C: getstatic game.C_100302_ka[] game.C_100210_qa.field_101063_U
		// @33F: iload #6
		// @341: aaload
		// @342: iconst_0
		// @343: putfield int game.C_100302_ka.field_101848_lb
		// @346: aload #8
		// @348: iconst_0
		// @349: putfield int game.C_100302_ka.field_101886_Kb
		// @34C: iconst_0
		// @34D: istore #9
		// @34F: getstatic game.C_100144_bm[][] game.C_100272_mn.field_102434_J
		// @352: iload #6
		// @354: aaload
		// @355: arraylength
		// @356: iconst_m1
		// @357: ixor
		// @358: iload #9
		// @35A: iconst_m1
		// @35B: ixor
		// @35C: if_icmpge @39B
		// @35F: iload #13
		// @361: ifne @473
		// @364: aconst_null
		// @365: getstatic game.C_100144_bm[][] game.C_100272_mn.field_102434_J
		// @368: iload #6
		// @36A: aaload
		// @36B: iload #9
		// @36D: aaload
		// @36E: if_acmpeq @393
		// @371: goto @375
		// @374: athrow
		// @375: getstatic game.C_100144_bm[][] game.C_100272_mn.field_102434_J
		// @378: iload #6
		// @37A: aaload
		// @37B: iload #9
		// @37D: aaload
		// @37E: astore #10
		// @380: getstatic game.C_100144_bm[][] game.C_100272_mn.field_102434_J
		// @383: iload #6
		// @385: aaload
		// @386: iload #9
		// @388: aaload
		// @389: iconst_0
		// @38A: putfield int game.C_100144_bm.field_101848_lb
		// @38D: aload #10
		// @38F: iconst_0
		// @390: putfield int game.C_100144_bm.field_101886_Kb
		// @393: iinc #9 +1
		// @396: iload #13
		// @398: ifeq @34F
		// @39B: iload #13
		// @39D: ifeq @470
		// @3A0: getstatic game.C_100302_ka[] game.C_100210_qa.field_101063_U
		// @3A3: iload #6
		// @3A5: aaload
		// @3A6: astore #7
		// @3A8: getstatic game.C_100302_ka[] game.C_100210_qa.field_101063_U
		// @3AB: iload #6
		// @3AD: aaload
		// @3AE: iconst_0
		// @3AF: putfield int game.C_100302_ka.field_101848_lb
		// @3B2: aload #7
		// @3B4: iconst_0
		// @3B5: putfield int game.C_100302_ka.field_101886_Kb
		// @3B8: iconst_0
		// @3B9: istore #8
		// @3BB: getstatic game.C_100144_bm[][] game.C_100272_mn.field_102434_J
		// @3BE: iload #6
		// @3C0: aaload
		// @3C1: arraylength
		// @3C2: iload #8
		// @3C4: if_icmple @402
		// @3C7: getstatic game.C_100144_bm[][] game.C_100272_mn.field_102434_J
		// @3CA: iload #6
		// @3CC: aaload
		// @3CD: iload #8
		// @3CF: aaload
		// @3D0: iload #13
		// @3D2: ifne @4FB
		// @3D5: ifnull @3FA
		// @3D8: goto @3DC
		// @3DB: athrow
		// @3DC: getstatic game.C_100144_bm[][] game.C_100272_mn.field_102434_J
		// @3DF: iload #6
		// @3E1: aaload
		// @3E2: iload #8
		// @3E4: aaload
		// @3E5: astore #9
		// @3E7: getstatic game.C_100144_bm[][] game.C_100272_mn.field_102434_J
		// @3EA: iload #6
		// @3EC: aaload
		// @3ED: iload #8
		// @3EF: aaload
		// @3F0: iconst_0
		// @3F1: putfield int game.C_100144_bm.field_101848_lb
		// @3F4: aload #9
		// @3F6: iconst_0
		// @3F7: putfield int game.C_100144_bm.field_101886_Kb
		// @3FA: iinc #8 +1
		// @3FD: iload #13
		// @3FF: ifeq @3BB
		// @402: iload #13
		// @404: ifeq @470
		// @407: getstatic game.C_100302_ka[] game.C_100210_qa.field_101063_U
		// @40A: iload #6
		// @40C: aaload
		// @40D: astore #7
		// @40F: getstatic game.C_100302_ka[] game.C_100210_qa.field_101063_U
		// @412: iload #6
		// @414: aaload
		// @415: iconst_0
		// @416: putfield int game.C_100302_ka.field_101848_lb
		// @419: aload #7
		// @41B: iconst_0
		// @41C: putfield int game.C_100302_ka.field_101886_Kb
		// @41F: iconst_0
		// @420: istore #8
		// @422: iload #8
		// @424: iconst_m1
		// @425: ixor
		// @426: getstatic game.C_100144_bm[][] game.C_100272_mn.field_102434_J
		// @429: iload #6
		// @42B: aaload
		// @42C: arraylength
		// @42D: iconst_m1
		// @42E: ixor
		// @42F: if_icmple @470
		// @432: getstatic game.C_100144_bm[][] game.C_100272_mn.field_102434_J
		// @435: iload #6
		// @437: aaload
		// @438: iload #8
		// @43A: aaload
		// @43B: iload #13
		// @43D: ifne @4FB
		// @440: ifnonnull @44A
		// @443: goto @447
		// @446: athrow
		// @447: goto @468
		// @44A: getstatic game.C_100144_bm[][] game.C_100272_mn.field_102434_J
		// @44D: iload #6
		// @44F: aaload
		// @450: iload #8
		// @452: aaload
		// @453: astore #9
		// @455: getstatic game.C_100144_bm[][] game.C_100272_mn.field_102434_J
		// @458: iload #6
		// @45A: aaload
		// @45B: iload #8
		// @45D: aaload
		// @45E: iconst_0
		// @45F: putfield int game.C_100144_bm.field_101848_lb
		// @462: aload #9
		// @464: iconst_0
		// @465: putfield int game.C_100144_bm.field_101886_Kb
		// @468: iinc #8 +1
		// @46B: iload #13
		// @46D: ifeq @422
		// @470: iinc #6 +1
		// @473: iload #13
		// @475: ifeq @19B
		// @478: getstatic game.C_100302_ka game.C_100159_sn.field_105402_b
		// @47B: sipush -360 (0xFE98)
		// @47E: getstatic int game.C_100196_rb.field_105819_e
		// @481: iadd
		// @482: ldc -313405183 (0xed51d101)
		// @484: ishr
		// @485: bipush -20 (0xEC)
		// @487: getstatic int game.C_100196_rb.field_105821_c
		// @48A: iadd
		// @48B: bipush 124 (0x7C)
		// @48D: isub
		// @48E: iconst_m1
		// @48F: bipush 10 (0x0A)
		// @491: sipush 360 (0x0168)
		// @494: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @497: getstatic game.C_100302_ka game.C_100115_ej.field_102045_cc
		// @49A: iconst_0
		// @49B: bipush 24 (0x18)
		// @49D: iconst_m1
		// @49E: iconst_0
		// @49F: getstatic game.C_100302_ka game.C_100159_sn.field_105402_b
		// @4A2: getfield int game.C_100302_ka.field_101886_Kb
		// @4A5: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @4A8: getstatic game.C_100302_ka game.C_100266_me.field_106649_g
		// @4AB: iconst_0
		// @4AC: bipush -24 (0xE8)
		// @4AE: getstatic game.C_100302_ka game.C_100159_sn.field_105402_b
		// @4B1: getfield int game.C_100302_ka.field_101848_lb
		// @4B4: iadd
		// @4B5: iconst_m1
		// @4B6: bipush 24 (0x18)
		// @4B8: getstatic game.C_100302_ka game.C_100159_sn.field_105402_b
		// @4BB: getfield int game.C_100302_ka.field_101886_Kb
		// @4BE: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @4C1: getstatic game.C_100302_ka game.C_100266_me.field_106649_g
		// @4C4: ldc 11579568 (0xb0b0b0)
		// @4C6: iconst_1
		// @4C7: ldc 8421504 (0x808080)
		// @4C9: iconst_3
		// @4CA: iconst_1
		// @4CB: getstatic game.C_100302_ka game.C_100266_me.field_106649_g
		// @4CE: getfield int game.C_100302_ka.field_101848_lb
		// @4D1: invokestatic game.C_100265_mh.func_106563_a(int, boolean, int, int, int, int)game.C_100037_wb[]
		// @4D4: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @4D7: getstatic game.C_100302_ka game.C_100099_fb.field_103050_z
		// @4DA: iconst_5
		// @4DB: bipush -2 (0xFE)
		// @4DD: bipush -24 (0xE8)
		// @4DF: getstatic game.C_100302_ka game.C_100266_me.field_106649_g
		// @4E2: getfield int game.C_100302_ka.field_101848_lb
		// @4E5: iadd
		// @4E6: bipush -10 (0xF6)
		// @4E8: iadd
		// @4E9: iadd
		// @4EA: iconst_m1
		// @4EB: iconst_5
		// @4EC: getstatic game.C_100302_ka game.C_100266_me.field_106649_g
		// @4EF: getfield int game.C_100302_ka.field_101886_Kb
		// @4F2: bipush 10 (0x0A)
		// @4F4: isub
		// @4F5: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @4F8: getstatic game.C_100302_ka game.C_100273_mm.field_106685_a
		// @4FB: getstatic game.C_100302_ka game.C_100266_me.field_106649_g
		// @4FE: getfield int game.C_100302_ka.field_101886_Kb
		// @501: bipush -80 (0xB0)
		// @503: iadd
		// @504: iconst_2
		// @505: idiv
		// @506: bipush 24 (0x18)
		// @508: iconst_m1
		// @509: bipush -24 (0xE8)
		// @50B: getstatic game.C_100302_ka game.C_100266_me.field_106649_g
		// @50E: getfield int game.C_100302_ka.field_101848_lb
		// @511: iadd
		// @512: iconst_5
		// @513: isub
		// @514: bipush 80 (0x50)
		// @516: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @519: iload_0
		// @51A: bipush -2 (0xFE)
		// @51C: iadd
		// @51D: invokestatic game.C_100172_ck.func_102105_m(int)void
		// @520: goto @54E
		// @523: astore_2
		// @524: aload_2
		// @525: new java.lang.StringBuilder
		// @528: dup
		// @529: invokespecial java.lang.StringBuilder.<init>()void
		// @52C: getstatic java.lang.String[] game.C_100239_oi.field_102295_G
		// @52F: bipush 9 (0x09)
		// @531: aaload
		// @532: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @535: iload_0
		// @536: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @539: bipush 44 (0x2C)
		// @53B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @53E: iload_1
		// @53F: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @542: bipush 41 (0x29)
		// @544: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @547: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @54A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @54D: athrow
		// @54E: return
	}
	
	static final void func_102288_a(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #11
		// @005: getstatic game.C_100037_wb[] game.C_100071_va.field_101667_z
		// @008: astore #6
		// @00A: getstatic int game.C_100265_mh.field_106624_k
		// @00D: iconst_m1
		// @00E: ixor
		// @00F: iconst_m1
		// @010: if_icmplt @017
		// @013: goto @01C
		// @016: athrow
		// @017: getstatic game.C_100037_wb[] game.C_100053_vn.field_102833_T
		// @01A: astore #6
		// @01C: getstatic int game.C_100066_dl.field_101636_H
		// @01F: bipush 8 (0x08)
		// @021: imul
		// @022: bipush 50 (0x32)
		// @024: idiv
		// @025: aload #6
		// @027: arraylength
		// @028: irem
		// @029: istore #7
		// @02B: iload #5
		// @02D: iconst_2
		// @02E: iload_0
		// @02F: imul
		// @030: iadd
		// @031: iload_2
		// @032: iload_0
		// @033: isub
		// @034: iload_3
		// @035: iconst_2
		// @036: iload_0
		// @037: imul
		// @038: iadd
		// @039: getstatic game.C_100037_wb[] game.C_100050_vg.field_100638_p
		// @03C: sipush 160 (0x00A0)
		// @03F: iload #4
		// @041: iload_0
		// @042: isub
		// @043: bipush -63 (0xC1)
		// @045: invokestatic game.SteelSentinels.func_105267_a(int, int, int, game.C_100037_wb[], int, int, int)void
		// @048: aload #6
		// @04A: iload #7
		// @04C: aaload
		// @04D: iload_2
		// @04E: iload #4
		// @050: ldc 2254472 (0x226688)
		// @052: invokevirtual game.C_100037_wb.func_102366_b(int, int, int)void
		// @055: bipush 16 (0x10)
		// @057: iconst_4
		// @058: bipush -4 (0xFC)
		// @05A: iload_2
		// @05B: iadd
		// @05C: iload #4
		// @05E: iload_1
		// @05F: isub
		// @060: iload #5
		// @062: bipush 8 (0x08)
		// @064: iadd
		// @065: iload_3
		// @066: bipush 8 (0x08)
		// @068: iadd
		// @069: invokestatic game.C_100196_rb.func_105790_d(int, int, int, int, int, int)void
		// @06C: aload #6
		// @06E: iload #7
		// @070: aaload
		// @071: iload_2
		// @072: iload #4
		// @074: sipush 17561 (0x4499)
		// @077: invokevirtual game.C_100037_wb.func_102366_b(int, int, int)void
		// @07A: bipush 8 (0x08)
		// @07C: iconst_2
		// @07D: bipush -4 (0xFC)
		// @07F: iload_2
		// @080: iadd
		// @081: iload #4
		// @083: iconst_4
		// @084: isub
		// @085: bipush 8 (0x08)
		// @087: iload #5
		// @089: iadd
		// @08A: bipush 8 (0x08)
		// @08C: iload_3
		// @08D: iadd
		// @08E: invokestatic game.C_100196_rb.func_105790_d(int, int, int, int, int, int)void
		// @091: aload #6
		// @093: iload #7
		// @095: aaload
		// @096: iload_2
		// @097: iload #4
		// @099: sipush 255 (0x00FF)
		// @09C: invokevirtual game.C_100037_wb.func_102367_c(int, int, int)void
		// @09F: iload #5
		// @0A1: iload_0
		// @0A2: iconst_2
		// @0A3: imul
		// @0A4: iadd
		// @0A5: istore #8
		// @0A7: iload_3
		// @0A8: iload_0
		// @0A9: iconst_2
		// @0AA: imul
		// @0AB: iadd
		// @0AC: istore #9
		// @0AE: getstatic int game.C_100066_dl.field_101636_H
		// @0B1: bipush 10 (0x0A)
		// @0B3: idiv
		// @0B4: iconst_2
		// @0B5: irem
		// @0B6: istore #10
		// @0B8: iload #10
		// @0BA: iload #8
		// @0BC: if_icmpge @0E3
		// @0BF: iload #10
		// @0C1: iload_0
		// @0C2: ineg
		// @0C3: iadd
		// @0C4: iload_2
		// @0C5: iadd
		// @0C6: iload #4
		// @0C8: iload_0
		// @0C9: isub
		// @0CA: iload #9
		// @0CC: iconst_0
		// @0CD: bipush 100 (0x64)
		// @0CF: invokestatic game.C_100196_rb.func_105805_b(int, int, int, int, int)void
		// @0D2: iinc #10 +2
		// @0D5: iload #11
		// @0D7: ifne @138
		// @0DA: iload #11
		// @0DC: ifeq @0B8
		// @0DF: goto @0E3
		// @0E2: athrow
		// @0E3: goto @138
		// @0E6: astore #6
		// @0E8: aload #6
		// @0EA: new java.lang.StringBuilder
		// @0ED: dup
		// @0EE: invokespecial java.lang.StringBuilder.<init>()void
		// @0F1: getstatic java.lang.String[] game.C_100239_oi.field_102295_G
		// @0F4: iconst_1
		// @0F5: aaload
		// @0F6: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0F9: iload_0
		// @0FA: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0FD: bipush 44 (0x2C)
		// @0FF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @102: iload_1
		// @103: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @106: bipush 44 (0x2C)
		// @108: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @10B: iload_2
		// @10C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @10F: bipush 44 (0x2C)
		// @111: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @114: iload_3
		// @115: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @118: bipush 44 (0x2C)
		// @11A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @11D: iload #4
		// @11F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @122: bipush 44 (0x2C)
		// @124: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @127: iload #5
		// @129: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @12C: bipush 41 (0x29)
		// @12E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @131: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @134: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @137: athrow
		// @138: return
	}
	
	private final void func_102290_a(C_100314_lf arg0, byte arg1)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #4
		// @005: aload_0
		// @006: aload_1
		// @007: putfield game.C_100314_lf game.C_100239_oi.field_102294_F
		// @00A: aload_0
		// @00B: getfield boolean game.C_100239_oi.field_102304_I
		// @00E: ifne @02D
		// @011: aload_0
		// @012: getfield game.C_100314_lf game.C_100239_oi.field_102294_F
		// @015: getfield int game.C_100314_lf.field_101343_vb
		// @018: iconst_m1
		// @019: if_icmpne @024
		// @01C: goto @020
		// @01F: athrow
		// @020: goto @02D
		// @023: athrow
		// @024: aload_0
		// @025: getfield game.C_100314_lf game.C_100239_oi.field_102294_F
		// @028: bipush -106 (0x96)
		// @02A: invokestatic game.C_100053_vn.func_102825_a(game.C_100314_lf, byte)void
		// @02D: aload_0
		// @02E: getfield boolean game.C_100239_oi.field_102304_I
		// @031: ifne @050
		// @034: aload_1
		// @035: aload_0
		// @036: getfield int game.C_100239_oi.field_102313_z
		// @039: putfield int game.C_100314_lf.field_101404_yc
		// @03C: aload_1
		// @03D: aload_0
		// @03E: getfield boolean game.C_100239_oi.field_102310_t
		// @041: putfield boolean game.C_100314_lf.field_101320_L
		// @044: aload_1
		// @045: aload_0
		// @046: getfield int game.C_100239_oi.field_102302_O
		// @049: putfield int game.C_100314_lf.field_101343_vb
		// @04C: goto @050
		// @04F: athrow
		// @050: bipush -44 (0xD4)
		// @052: aload_0
		// @053: getfield int game.C_100239_oi.field_102302_O
		// @056: iconst_m1
		// @057: ixor
		// @058: if_icmpne @05F
		// @05B: goto @06C
		// @05E: athrow
		// @05F: aload_0
		// @060: getfield game.C_100314_lf game.C_100239_oi.field_102294_F
		// @063: dup
		// @064: getfield int game.C_100314_lf.field_101379_kb
		// @067: iconst_1
		// @068: iadd
		// @069: putfield int game.C_100314_lf.field_101379_kb
		// @06C: iload_2
		// @06D: bipush 19 (0x13)
		// @06F: if_icmpeq @07B
		// @072: bipush -47 (0xD1)
		// @074: invokestatic game.C_100239_oi.func_102285_d(byte)void
		// @077: goto @07B
		// @07A: athrow
		// @07B: aload_1
		// @07C: aload_1
		// @07D: getfield int game.C_100314_lf.field_101367_ub
		// @080: invokestatic java.lang.Math.abs(int)int
		// @083: ineg
		// @084: putfield int game.C_100314_lf.field_101367_ub
		// @087: aload_0
		// @088: getfield int game.C_100239_oi.field_102302_O
		// @08B: istore_3
		// @08C: bipush 10 (0x0A)
		// @08E: iload_3
		// @08F: if_icmpeq @1CA
		// @092: bipush -12 (0xF4)
		// @094: iload_3
		// @095: iconst_m1
		// @096: ixor
		// @097: if_icmpeq @1E2
		// @09A: goto @09E
		// @09D: athrow
		// @09E: iload_3
		// @09F: iconst_m1
		// @0A0: ixor
		// @0A1: bipush -13 (0xF3)
		// @0A3: if_icmpeq @1FF
		// @0A6: goto @0AA
		// @0A9: athrow
		// @0AA: iload_3
		// @0AB: bipush 13 (0x0D)
		// @0AD: if_icmpne @0BD
		// @0B0: goto @0B4
		// @0B3: athrow
		// @0B4: iload #4
		// @0B6: ifeq @21C
		// @0B9: goto @0BD
		// @0BC: athrow
		// @0BD: iload_3
		// @0BE: iconst_m1
		// @0BF: ixor
		// @0C0: bipush -15 (0xF1)
		// @0C2: if_icmpne @0D2
		// @0C5: goto @0C9
		// @0C8: athrow
		// @0C9: iload #4
		// @0CB: ifeq @239
		// @0CE: goto @0D2
		// @0D1: athrow
		// @0D2: iconst_m1
		// @0D3: iload_3
		// @0D4: iconst_m1
		// @0D5: ixor
		// @0D6: if_icmpeq @256
		// @0D9: goto @0DD
		// @0DC: athrow
		// @0DD: iconst_1
		// @0DE: iload_3
		// @0DF: if_icmpeq @269
		// @0E2: goto @0E6
		// @0E5: athrow
		// @0E6: iload_3
		// @0E7: iconst_2
		// @0E8: if_icmpeq @27C
		// @0EB: goto @0EF
		// @0EE: athrow
		// @0EF: iconst_3
		// @0F0: iload_3
		// @0F1: if_icmpne @101
		// @0F4: goto @0F8
		// @0F7: athrow
		// @0F8: iload #4
		// @0FA: ifeq @28F
		// @0FD: goto @101
		// @100: athrow
		// @101: iconst_4
		// @102: iload_3
		// @103: if_icmpeq @2A2
		// @106: goto @10A
		// @109: athrow
		// @10A: iload_3
		// @10B: iconst_m1
		// @10C: ixor
		// @10D: bipush -21 (0xEB)
		// @10F: if_icmpeq @2B5
		// @112: goto @116
		// @115: athrow
		// @116: iconst_5
		// @117: iload_3
		// @118: if_icmpeq @2C9
		// @11B: goto @11F
		// @11E: athrow
		// @11F: iload_3
		// @120: bipush 6 (0x06)
		// @122: if_icmpeq @2C9
		// @125: goto @129
		// @128: athrow
		// @129: iload_3
		// @12A: bipush 7 (0x07)
		// @12C: if_icmpeq @2C9
		// @12F: goto @133
		// @132: athrow
		// @133: bipush 8 (0x08)
		// @135: iload_3
		// @136: if_icmpeq @2C9
		// @139: goto @13D
		// @13C: athrow
		// @13D: iload_3
		// @13E: iconst_m1
		// @13F: ixor
		// @140: bipush -10 (0xF6)
		// @142: if_icmpne @152
		// @145: goto @149
		// @148: athrow
		// @149: iload #4
		// @14B: ifeq @2C9
		// @14E: goto @152
		// @151: athrow
		// @152: iload_3
		// @153: iconst_m1
		// @154: ixor
		// @155: bipush -30 (0xE2)
		// @157: if_icmpne @167
		// @15A: goto @15E
		// @15D: athrow
		// @15E: iload #4
		// @160: ifeq @2EB
		// @163: goto @167
		// @166: athrow
		// @167: bipush -29 (0xE3)
		// @169: iload_3
		// @16A: iconst_m1
		// @16B: ixor
		// @16C: if_icmpne @17C
		// @16F: goto @173
		// @172: athrow
		// @173: iload #4
		// @175: ifeq @2FE
		// @178: goto @17C
		// @17B: athrow
		// @17C: bipush -16 (0xF0)
		// @17E: iload_3
		// @17F: iconst_m1
		// @180: ixor
		// @181: if_icmpeq @311
		// @184: goto @188
		// @187: athrow
		// @188: bipush 36 (0x24)
		// @18A: iload_3
		// @18B: if_icmpne @19B
		// @18E: goto @192
		// @191: athrow
		// @192: iload #4
		// @194: ifeq @32C
		// @197: goto @19B
		// @19A: athrow
		// @19B: bipush -44 (0xD4)
		// @19D: iload_3
		// @19E: iconst_m1
		// @19F: ixor
		// @1A0: if_icmpne @1B0
		// @1A3: goto @1A7
		// @1A6: athrow
		// @1A7: iload #4
		// @1A9: ifeq @354
		// @1AC: goto @1B0
		// @1AF: athrow
		// @1B0: iload_3
		// @1B1: iconst_m1
		// @1B2: ixor
		// @1B3: bipush -45 (0xD3)
		// @1B5: if_icmpeq @362
		// @1B8: goto @1BC
		// @1BB: athrow
		// @1BC: bipush 45 (0x2D)
		// @1BE: iload_3
		// @1BF: if_icmpeq @373
		// @1C2: goto @1C6
		// @1C5: athrow
		// @1C6: goto @3A0
		// @1C9: athrow
		// @1CA: aload_1
		// @1CB: dup
		// @1CC: getfield int game.C_100314_lf.field_101358_u
		// @1CF: bipush 100 (0x64)
		// @1D1: iadd
		// @1D2: putfield int game.C_100314_lf.field_101358_u
		// @1D5: aload_1
		// @1D6: aload_1
		// @1D7: getfield int game.C_100314_lf.field_101358_u
		// @1DA: putfield int game.C_100314_lf.field_101413_Bb
		// @1DD: iload #4
		// @1DF: ifeq @3A0
		// @1E2: aload_1
		// @1E3: dup
		// @1E4: getfield int game.C_100314_lf.field_101358_u
		// @1E7: sipush 200 (0x00C8)
		// @1EA: iadd
		// @1EB: putfield int game.C_100314_lf.field_101358_u
		// @1EE: aload_1
		// @1EF: aload_1
		// @1F0: getfield int game.C_100314_lf.field_101358_u
		// @1F3: putfield int game.C_100314_lf.field_101413_Bb
		// @1F6: iload #4
		// @1F8: ifeq @3A0
		// @1FB: goto @1FF
		// @1FE: athrow
		// @1FF: aload_1
		// @200: dup
		// @201: getfield int game.C_100314_lf.field_101358_u
		// @204: sipush 300 (0x012C)
		// @207: iadd
		// @208: putfield int game.C_100314_lf.field_101358_u
		// @20B: aload_1
		// @20C: aload_1
		// @20D: getfield int game.C_100314_lf.field_101358_u
		// @210: putfield int game.C_100314_lf.field_101413_Bb
		// @213: iload #4
		// @215: ifeq @3A0
		// @218: goto @21C
		// @21B: athrow
		// @21C: aload_1
		// @21D: dup
		// @21E: getfield int game.C_100314_lf.field_101358_u
		// @221: sipush 400 (0x0190)
		// @224: iadd
		// @225: putfield int game.C_100314_lf.field_101358_u
		// @228: aload_1
		// @229: aload_1
		// @22A: getfield int game.C_100314_lf.field_101358_u
		// @22D: putfield int game.C_100314_lf.field_101413_Bb
		// @230: iload #4
		// @232: ifeq @3A0
		// @235: goto @239
		// @238: athrow
		// @239: aload_1
		// @23A: dup
		// @23B: getfield int game.C_100314_lf.field_101358_u
		// @23E: sipush 500 (0x01F4)
		// @241: iadd
		// @242: putfield int game.C_100314_lf.field_101358_u
		// @245: aload_1
		// @246: aload_1
		// @247: getfield int game.C_100314_lf.field_101358_u
		// @24A: putfield int game.C_100314_lf.field_101413_Bb
		// @24D: iload #4
		// @24F: ifeq @3A0
		// @252: goto @256
		// @255: athrow
		// @256: aload_1
		// @257: dup
		// @258: getfield int game.C_100314_lf.field_101383_dc
		// @25B: iconst_1
		// @25C: iadd
		// @25D: putfield int game.C_100314_lf.field_101383_dc
		// @260: iload #4
		// @262: ifeq @3A0
		// @265: goto @269
		// @268: athrow
		// @269: aload_1
		// @26A: dup
		// @26B: getfield int game.C_100314_lf.field_101383_dc
		// @26E: iconst_2
		// @26F: iadd
		// @270: putfield int game.C_100314_lf.field_101383_dc
		// @273: iload #4
		// @275: ifeq @3A0
		// @278: goto @27C
		// @27B: athrow
		// @27C: aload_1
		// @27D: dup
		// @27E: getfield int game.C_100314_lf.field_101383_dc
		// @281: iconst_3
		// @282: iadd
		// @283: putfield int game.C_100314_lf.field_101383_dc
		// @286: iload #4
		// @288: ifeq @3A0
		// @28B: goto @28F
		// @28E: athrow
		// @28F: aload_1
		// @290: dup
		// @291: getfield int game.C_100314_lf.field_101383_dc
		// @294: iconst_4
		// @295: iadd
		// @296: putfield int game.C_100314_lf.field_101383_dc
		// @299: iload #4
		// @29B: ifeq @3A0
		// @29E: goto @2A2
		// @2A1: athrow
		// @2A2: aload_1
		// @2A3: dup
		// @2A4: getfield int game.C_100314_lf.field_101383_dc
		// @2A7: iconst_5
		// @2A8: iadd
		// @2A9: putfield int game.C_100314_lf.field_101383_dc
		// @2AC: iload #4
		// @2AE: ifeq @3A0
		// @2B1: goto @2B5
		// @2B4: athrow
		// @2B5: aload_1
		// @2B6: dup
		// @2B7: getfield int game.C_100314_lf.field_101383_dc
		// @2BA: bipush 10 (0x0A)
		// @2BC: iadd
		// @2BD: putfield int game.C_100314_lf.field_101383_dc
		// @2C0: iload #4
		// @2C2: ifeq @3A0
		// @2C5: goto @2C9
		// @2C8: athrow
		// @2C9: aload_1
		// @2CA: dup
		// @2CB: getfield int game.C_100314_lf.field_101373_cb
		// @2CE: aload_0
		// @2CF: getfield int game.C_100239_oi.field_102302_O
		// @2D2: bipush -76 (0xB4)
		// @2D4: invokestatic game.C_100327_ib.func_102457_d(int, byte)int
		// @2D7: iadd
		// @2D8: putfield int game.C_100314_lf.field_101373_cb
		// @2DB: aload_1
		// @2DC: sipush 128 (0x0080)
		// @2DF: invokevirtual game.C_100314_lf.func_101278_g(int)void
		// @2E2: iload #4
		// @2E4: ifeq @3A0
		// @2E7: goto @2EB
		// @2EA: athrow
		// @2EB: aload_1
		// @2EC: dup
		// @2ED: getfield int game.C_100314_lf.field_101412_Kb
		// @2F0: iconst_2
		// @2F1: imul
		// @2F2: putfield int game.C_100314_lf.field_101412_Kb
		// @2F5: iload #4
		// @2F7: ifeq @3A0
		// @2FA: goto @2FE
		// @2FD: athrow
		// @2FE: aload_1
		// @2FF: dup
		// @300: getfield int game.C_100314_lf.field_101334_V
		// @303: iconst_2
		// @304: imul
		// @305: putfield int game.C_100314_lf.field_101334_V
		// @308: iload #4
		// @30A: ifeq @3A0
		// @30D: goto @311
		// @310: athrow
		// @311: aload_1
		// @312: getfield int game.C_100314_lf.field_101310_Mb
		// @315: istore_3
		// @316: aload_1
		// @317: bipush 10 (0x0A)
		// @319: putfield int game.C_100314_lf.field_101310_Mb
		// @31C: aload_1
		// @31D: aconst_null
		// @31E: iconst_0
		// @31F: invokevirtual game.C_100314_lf.func_101275_a(game.C_100087_n, boolean)void
		// @322: aload_1
		// @323: iload_3
		// @324: putfield int game.C_100314_lf.field_101310_Mb
		// @327: iload #4
		// @329: ifeq @3A0
		// @32C: aload_0
		// @32D: getfield game.C_100294_ki game.C_100239_oi.field_102315_x
		// @330: dup
		// @331: getfield int game.C_100294_ki.field_107002_z
		// @334: ldc 6000000 (0x5b8d80)
		// @336: iadd
		// @337: putfield int game.C_100294_ki.field_107002_z
		// @33A: aload_1
		// @33B: dup
		// @33C: getfield int game.C_100314_lf.field_101332_T
		// @33F: bipush 100 (0x64)
		// @341: iadd
		// @342: putfield int game.C_100314_lf.field_101332_T
		// @345: aload_1
		// @346: bipush -30 (0xE2)
		// @348: invokevirtual game.C_100314_lf.func_101271_a(byte)void
		// @34B: iload #4
		// @34D: ifeq @3A0
		// @350: goto @354
		// @353: athrow
		// @354: aload_1
		// @355: iconst_1
		// @356: putfield boolean game.C_100314_lf.field_101331_Wb
		// @359: iload #4
		// @35B: ifeq @3A0
		// @35E: goto @362
		// @361: athrow
		// @362: aload_1
		// @363: iload_2
		// @364: bipush -14 (0xF2)
		// @366: iadd
		// @367: invokevirtual game.C_100314_lf.func_101289_f(int)void
		// @36A: iload #4
		// @36C: ifeq @3A0
		// @36F: goto @373
		// @372: athrow
		// @373: aload_0
		// @374: getfield game.C_100294_ki game.C_100239_oi.field_102315_x
		// @377: dup
		// @378: getfield int game.C_100294_ki.field_106982_c
		// @37B: bipush 10 (0x0A)
		// @37D: iadd
		// @37E: putfield int game.C_100294_ki.field_106982_c
		// @381: aload_0
		// @382: getfield game.C_100294_ki game.C_100239_oi.field_102315_x
		// @385: dup
		// @386: getfield int game.C_100294_ki.field_106996_t
		// @389: iconst_1
		// @38A: iadd
		// @38B: putfield int game.C_100294_ki.field_106996_t
		// @38E: aload_0
		// @38F: getfield game.C_100294_ki game.C_100239_oi.field_102315_x
		// @392: dup
		// @393: getfield int game.C_100294_ki.field_106966_U
		// @396: bipush 22 (0x16)
		// @398: isub
		// @399: putfield int game.C_100294_ki.field_106966_U
		// @39C: goto @3A0
		// @39F: athrow
		// @3A0: getstatic int game.C_100055_ed.field_104245_a
		// @3A3: aload_1
		// @3A4: getfield int game.C_100314_lf.field_101347_Gb
		// @3A7: if_icmpeq @3AE
		// @3AA: goto @3B9
		// @3AD: athrow
		// @3AE: aload_0
		// @3AF: getfield int game.C_100239_oi.field_102302_O
		// @3B2: putstatic int game.C_100056_de.field_103190_mb
		// @3B5: iconst_0
		// @3B6: putstatic int game.C_100085_a.field_102565_E
		// @3B9: goto @3F8
		// @3BC: astore_3
		// @3BD: aload_3
		// @3BE: new java.lang.StringBuilder
		// @3C1: dup
		// @3C2: invokespecial java.lang.StringBuilder.<init>()void
		// @3C5: getstatic java.lang.String[] game.C_100239_oi.field_102295_G
		// @3C8: bipush 6 (0x06)
		// @3CA: aaload
		// @3CB: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3CE: aload_1
		// @3CF: ifnull @3DB
		// @3D2: getstatic java.lang.String[] game.C_100239_oi.field_102295_G
		// @3D5: iconst_5
		// @3D6: aaload
		// @3D7: goto @3E0
		// @3DA: athrow
		// @3DB: getstatic java.lang.String[] game.C_100239_oi.field_102295_G
		// @3DE: iconst_4
		// @3DF: aaload
		// @3E0: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3E3: bipush 44 (0x2C)
		// @3E5: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3E8: iload_2
		// @3E9: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3EC: bipush 41 (0x29)
		// @3EE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3F1: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3F4: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3F7: athrow
		// @3F8: return
	}
	
	public static void func_102285_d(byte arg0)
	{
		// @00: iload_0
		// @01: bipush -109 (0x93)
		// @03: if_icmple @07
		// @06: return
		// @07: aconst_null
		// @08: putstatic java.lang.String game.C_100239_oi.field_102298_C
		// @0B: aconst_null
		// @0C: putstatic int[] game.C_100239_oi.field_102305_J
		// @0F: goto @33
		// @12: astore_1
		// @13: aload_1
		// @14: new java.lang.StringBuilder
		// @17: dup
		// @18: invokespecial java.lang.StringBuilder.<init>()void
		// @1B: getstatic java.lang.String[] game.C_100239_oi.field_102295_G
		// @1E: iconst_2
		// @1F: aaload
		// @20: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @23: iload_0
		// @24: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @27: bipush 41 (0x29)
		// @29: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @2F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @32: athrow
		// @33: return
	}
	
	final void func_102289_e(byte arg0)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #13
		// @005: aload_0
		// @006: dup
		// @007: getfield int game.C_100239_oi.field_102300_M
		// @00A: iconst_1
		// @00B: isub
		// @00C: putfield int game.C_100239_oi.field_102300_M
		// @00F: iconst_0
		// @010: aload_0
		// @011: getfield int game.C_100239_oi.field_102300_M
		// @014: if_icmplt @018
		// @017: return
		// @018: aconst_null
		// @019: aload_0
		// @01A: getfield game.C_100314_lf game.C_100239_oi.field_102294_F
		// @01D: if_acmpne @023
		// @020: goto @024
		// @023: return
		// @024: aload_0
		// @025: getfield game.C_100037_wb game.C_100239_oi.field_102292_D
		// @028: ifnonnull @02F
		// @02B: goto @1EB
		// @02E: athrow
		// @02F: aload_0
		// @030: getfield game.C_100037_wb game.C_100239_oi.field_102292_D
		// @033: getfield int[] game.C_100037_wb.field_102388_J
		// @036: arraylength
		// @037: istore_2
		// @038: iconst_0
		// @039: istore #6
		// @03B: iload #6
		// @03D: iconst_m1
		// @03E: ixor
		// @03F: iload_2
		// @040: iconst_m1
		// @041: ixor
		// @042: if_icmple @171
		// @045: aload_0
		// @046: getfield game.C_100037_wb game.C_100239_oi.field_102292_D
		// @049: getfield int[] game.C_100037_wb.field_102388_J
		// @04C: iload #6
		// @04E: iaload
		// @04F: ldc 16711680 (0xff0000)
		// @051: iand
		// @052: ldc -531856272 (0xe04c8470)
		// @054: ishr
		// @055: istore_3
		// @056: aload_0
		// @057: getfield game.C_100037_wb game.C_100239_oi.field_102292_D
		// @05A: getfield int[] game.C_100037_wb.field_102388_J
		// @05D: iload #6
		// @05F: iaload
		// @060: sipush 255 (0x00FF)
		// @063: iand
		// @064: istore #5
		// @066: aload_0
		// @067: getfield game.C_100037_wb game.C_100239_oi.field_102292_D
		// @06A: getfield int[] game.C_100037_wb.field_102388_J
		// @06D: iload #6
		// @06F: iaload
		// @070: ldc 65280 (0xff00)
		// @072: iand
		// @073: ldc -1792657656 (0x95263708)
		// @075: ishr
		// @076: istore #4
		// @078: aload_0
		// @079: getfield boolean game.C_100239_oi.field_102304_I
		// @07C: iload #13
		// @07E: ifne @172
		// @081: ifne @0CD
		// @084: goto @088
		// @087: athrow
		// @088: iconst_m1
		// @089: iload #4
		// @08B: iconst_m1
		// @08C: ixor
		// @08D: if_icmple @09B
		// @090: goto @094
		// @093: athrow
		// @094: iinc #4 +255
		// @097: goto @09B
		// @09A: athrow
		// @09B: iload #5
		// @09D: iconst_m1
		// @09E: ixor
		// @09F: iconst_m1
		// @0A0: if_icmpge @0BA
		// @0A3: aload_0
		// @0A4: getfield int game.C_100239_oi.field_102300_M
		// @0A7: iconst_1
		// @0A8: iand
		// @0A9: iconst_m1
		// @0AA: ixor
		// @0AB: iconst_m1
		// @0AC: if_icmpeq @0B7
		// @0AF: goto @0B3
		// @0B2: athrow
		// @0B3: goto @0BA
		// @0B6: athrow
		// @0B7: iinc #5 +255
		// @0BA: iload_3
		// @0BB: iconst_m1
		// @0BC: ixor
		// @0BD: iconst_m1
		// @0BE: if_icmpge @117
		// @0C1: iinc #3 +255
		// @0C4: iload #13
		// @0C6: ifeq @117
		// @0C9: goto @0CD
		// @0CC: athrow
		// @0CD: iload #4
		// @0CF: iconst_m1
		// @0D0: ixor
		// @0D1: iconst_m1
		// @0D2: if_icmplt @0DD
		// @0D5: goto @0D9
		// @0D8: athrow
		// @0D9: goto @0E0
		// @0DC: athrow
		// @0DD: iinc #4 +255
		// @0E0: iload_3
		// @0E1: ifle @0FB
		// @0E4: iconst_m1
		// @0E5: aload_0
		// @0E6: getfield int game.C_100239_oi.field_102300_M
		// @0E9: iconst_3
		// @0EA: iand
		// @0EB: iconst_m1
		// @0EC: ixor
		// @0ED: if_icmpne @0F8
		// @0F0: goto @0F4
		// @0F3: athrow
		// @0F4: goto @0FB
		// @0F7: athrow
		// @0F8: iinc #3 +255
		// @0FB: iload #5
		// @0FD: iconst_m1
		// @0FE: ixor
		// @0FF: iconst_m1
		// @100: if_icmpge @117
		// @103: aload_0
		// @104: getfield int game.C_100239_oi.field_102300_M
		// @107: iconst_3
		// @108: iand
		// @109: ifne @114
		// @10C: goto @110
		// @10F: athrow
		// @110: goto @117
		// @113: athrow
		// @114: iinc #5 +255
		// @117: aload_0
		// @118: getfield game.C_100037_wb game.C_100239_oi.field_102292_D
		// @11B: getfield int[] game.C_100037_wb.field_102388_J
		// @11E: iload #6
		// @120: iload_3
		// @121: ldc 659027408 (0x2747f5d0)
		// @123: ishl
		// @124: iload #4
		// @126: ldc -1770249176 (0x967c2428)
		// @128: ishl
		// @129: ineg
		// @12A: isub
		// @12B: iload #5
		// @12D: iadd
		// @12E: iastore
		// @12F: aload_0
		// @130: getfield boolean game.C_100239_oi.field_102314_y
		// @133: ifeq @169
		// @136: aload_0
		// @137: getfield game.C_100037_wb game.C_100239_oi.field_102292_D
		// @13A: getfield int[] game.C_100037_wb.field_102388_J
		// @13D: iload #6
		// @13F: iaload
		// @140: iconst_m1
		// @141: ixor
		// @142: iconst_m1
		// @143: if_icmpne @14E
		// @146: goto @14A
		// @149: athrow
		// @14A: goto @169
		// @14D: athrow
		// @14E: aload_0
		// @14F: getfield game.C_100037_wb game.C_100239_oi.field_102292_D
		// @152: getfield int[] game.C_100037_wb.field_102388_J
		// @155: iload #6
		// @157: ldc 16777215 (0xffffff)
		// @159: aload_0
		// @15A: getfield game.C_100037_wb game.C_100239_oi.field_102292_D
		// @15D: getfield int[] game.C_100037_wb.field_102388_J
		// @160: iload #6
		// @162: iaload
		// @163: iconst_m1
		// @164: ixor
		// @165: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @168: iastore
		// @169: iinc #6 +1
		// @16C: iload #13
		// @16E: ifeq @03B
		// @171: iconst_0
		// @172: istore #6
		// @174: iload #6
		// @176: iconst_m1
		// @177: ixor
		// @178: bipush -3 (0xFD)
		// @17A: if_icmple @1EB
		// @17D: aload_0
		// @17E: dup
		// @17F: getfield int game.C_100239_oi.field_102306_K
		// @182: iconst_1
		// @183: iadd
		// @184: putfield int game.C_100239_oi.field_102306_K
		// @187: aload_0
		// @188: getfield int game.C_100239_oi.field_102306_K
		// @18B: iload_2
		// @18C: iload #13
		// @18E: ifne @1EE
		// @191: if_icmpge @19B
		// @194: goto @198
		// @197: athrow
		// @198: goto @1A0
		// @19B: aload_0
		// @19C: iconst_0
		// @19D: putfield int game.C_100239_oi.field_102306_K
		// @1A0: aload_0
		// @1A1: getfield game.C_100037_wb game.C_100239_oi.field_102292_D
		// @1A4: getfield int[] game.C_100037_wb.field_102388_J
		// @1A7: aload_0
		// @1A8: getfield int game.C_100239_oi.field_102306_K
		// @1AB: bipush -95 (0xA1)
		// @1AD: aload_0
		// @1AE: getfield int game.C_100239_oi.field_102302_O
		// @1B1: invokestatic game.C_100242_oh.func_106339_a(byte, int)game.C_100153_be
		// @1B4: getfield int[] game.C_100153_be.field_105320_t
		// @1B7: bipush -96 (0xA0)
		// @1B9: aload_0
		// @1BA: getfield int game.C_100239_oi.field_102302_O
		// @1BD: invokestatic game.C_100242_oh.func_106339_a(byte, int)game.C_100153_be
		// @1C0: getfield byte[] game.C_100153_be.field_105319_u
		// @1C3: aload_0
		// @1C4: getfield int game.C_100239_oi.field_102306_K
		// @1C7: baload
		// @1C8: iaload
		// @1C9: iastore
		// @1CA: iconst_m1
		// @1CB: aload_0
		// @1CC: getfield game.C_100037_wb game.C_100239_oi.field_102292_D
		// @1CF: getfield int[] game.C_100037_wb.field_102388_J
		// @1D2: aload_0
		// @1D3: getfield int game.C_100239_oi.field_102306_K
		// @1D6: iaload
		// @1D7: iconst_m1
		// @1D8: ixor
		// @1D9: if_icmpeq @1E0
		// @1DC: goto @1E3
		// @1DF: athrow
		// @1E0: iinc #6 +255
		// @1E3: iinc #6 +1
		// @1E6: iload #13
		// @1E8: ifeq @174
		// @1EB: iload_1
		// @1EC: bipush -13 (0xF3)
		// @1EE: if_icmpeq @1FB
		// @1F1: aload_0
		// @1F2: bipush -9 (0xF7)
		// @1F4: putfield int game.C_100239_oi.field_102302_O
		// @1F7: goto @1FB
		// @1FA: athrow
		// @1FB: aload_0
		// @1FC: getfield game.C_100294_ki game.C_100239_oi.field_102315_x
		// @1FF: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @202: bipush -75 (0xB5)
		// @204: aload_0
		// @205: getfield int game.C_100239_oi.field_102296_A
		// @208: ldc 2077929060 (0x7bdaae64)
		// @20A: ishr
		// @20B: invokevirtual game.C_100171_cn.func_105560_c(int, int)int
		// @20E: ineg
		// @20F: ldc 1457666852 (0x56e23b24)
		// @211: ishl
		// @212: istore_2
		// @213: aload_0
		// @214: getfield game.C_100294_ki game.C_100239_oi.field_102315_x
		// @217: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @21A: sipush -25357 (0x9CF3)
		// @21D: aload_0
		// @21E: getfield int game.C_100239_oi.field_102296_A
		// @221: ldc -271319100 (0xefd3ffc4)
		// @223: ishr
		// @224: invokevirtual game.C_100171_cn.func_105555_b(int, int)int
		// @227: ineg
		// @228: ldc -1865644412 (0x90cc8684)
		// @22A: ishl
		// @22B: istore_3
		// @22C: aload_0
		// @22D: getfield game.C_100294_ki game.C_100239_oi.field_102315_x
		// @230: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @233: ldc 830205956 (0x317bf004)
		// @235: aload_0
		// @236: getfield int game.C_100239_oi.field_102296_A
		// @239: ldc 1654927268 (0x62a42fa4)
		// @23B: ishr
		// @23C: invokevirtual game.C_100171_cn.func_105563_a(int, int)int
		// @23F: ineg
		// @240: ldc -149621404 (0xf714f564)
		// @242: ishl
		// @243: istore #4
		// @245: iload_2
		// @246: istore #5
		// @248: iload_3
		// @249: iconst_m1
		// @24A: ixor
		// @24B: iload #4
		// @24D: iconst_m1
		// @24E: ixor
		// @24F: if_icmpeq @26A
		// @252: iload #4
		// @254: iconst_m1
		// @255: ixor
		// @256: aload_0
		// @257: getfield int game.C_100239_oi.field_102301_N
		// @25A: iconst_m1
		// @25B: ixor
		// @25C: if_icmplt @267
		// @25F: goto @263
		// @262: athrow
		// @263: goto @26A
		// @266: athrow
		// @267: iload_3
		// @268: istore #5
		// @26A: iload #5
		// @26C: aload_0
		// @26D: getfield int game.C_100239_oi.field_102301_N
		// @270: if_icmpgt @278
		// @273: iconst_1
		// @274: goto @279
		// @277: athrow
		// @278: iconst_0
		// @279: istore #6
		// @27B: bipush -5 (0xFB)
		// @27D: aload_0
		// @27E: getfield game.C_100294_ki game.C_100239_oi.field_102315_x
		// @281: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @284: iload_1
		// @285: sipush -26299 (0x9945)
		// @288: ixor
		// @289: invokevirtual game.C_100171_cn.func_105559_a(int)int
		// @28C: iconst_m1
		// @28D: ixor
		// @28E: if_icmpne @2B1
		// @291: iconst_m1
		// @292: aload_0
		// @293: getfield int game.C_100239_oi.field_102301_N
		// @296: iconst_m1
		// @297: ixor
		// @298: if_icmpge @2A3
		// @29B: goto @29F
		// @29E: athrow
		// @29F: goto @2B1
		// @2A2: athrow
		// @2A3: aload_0
		// @2A4: getfield game.C_100294_ki game.C_100239_oi.field_102315_x
		// @2A7: getfield game.C_100300_kc game.C_100294_ki.field_106950_D
		// @2AA: bipush 127 (0x7F)
		// @2AC: aload_0
		// @2AD: invokevirtual game.C_100300_kc.func_107058_a(int, game.C_100325_id)void
		// @2B0: return
		// @2B1: iload #6
		// @2B3: ifne @306
		// @2B6: aload_0
		// @2B7: dup
		// @2B8: getfield int game.C_100239_oi.field_102311_s
		// @2BB: aload_0
		// @2BC: getfield game.C_100294_ki game.C_100239_oi.field_102315_x
		// @2BF: getfield int game.C_100294_ki.field_106964_J
		// @2C2: iadd
		// @2C3: putfield int game.C_100239_oi.field_102311_s
		// @2C6: aload_0
		// @2C7: getfield boolean game.C_100239_oi.field_102309_u
		// @2CA: ifne @2D5
		// @2CD: goto @2D1
		// @2D0: athrow
		// @2D1: goto @2E9
		// @2D4: athrow
		// @2D5: aload_0
		// @2D6: dup
		// @2D7: getfield int game.C_100239_oi.field_102311_s
		// @2DA: iconst_3
		// @2DB: aload_0
		// @2DC: getfield game.C_100294_ki game.C_100239_oi.field_102315_x
		// @2DF: getfield int game.C_100294_ki.field_106964_J
		// @2E2: imul
		// @2E3: iconst_4
		// @2E4: idiv
		// @2E5: isub
		// @2E6: putfield int game.C_100239_oi.field_102311_s
		// @2E9: aload_0
		// @2EA: dup
		// @2EB: getfield int game.C_100239_oi.field_102301_N
		// @2EE: aload_0
		// @2EF: getfield int game.C_100239_oi.field_102311_s
		// @2F2: iadd
		// @2F3: putfield int game.C_100239_oi.field_102301_N
		// @2F6: iload #5
		// @2F8: aload_0
		// @2F9: getfield int game.C_100239_oi.field_102301_N
		// @2FC: if_icmple @303
		// @2FF: goto @306
		// @302: athrow
		// @303: iconst_1
		// @304: istore #6
		// @306: iload #6
		// @308: ifeq @31F
		// @30B: aload_0
		// @30C: iconst_0
		// @30D: putfield boolean game.C_100239_oi.field_102309_u
		// @310: aload_0
		// @311: iconst_0
		// @312: putfield int game.C_100239_oi.field_102311_s
		// @315: aload_0
		// @316: iload #5
		// @318: putfield int game.C_100239_oi.field_102301_N
		// @31B: goto @31F
		// @31E: athrow
		// @31F: aload_0
		// @320: getfield game.C_100294_ki game.C_100239_oi.field_102315_x
		// @323: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @326: sipush 26294 (0x66B6)
		// @329: invokevirtual game.C_100171_cn.func_105559_a(int)int
		// @32C: iconst_3
		// @32D: if_icmpne @392
		// @330: aload_0
		// @331: getfield boolean game.C_100239_oi.field_102314_y
		// @334: ifne @392
		// @337: goto @33B
		// @33A: athrow
		// @33B: aload_0
		// @33C: getfield game.C_100294_ki game.C_100239_oi.field_102315_x
		// @33F: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @342: sipush 23156 (0x5A74)
		// @345: invokevirtual game.C_100171_cn.func_105552_b(int)int
		// @348: ldc 570075073 (0x21faa7c1)
		// @34A: ishr
		// @34B: istore #7
		// @34D: sipush 600 (0x0258)
		// @350: istore #8
		// @352: sipush 5120 (0x1400)
		// @355: istore #9
		// @357: iload #7
		// @359: ineg
		// @35A: aload_0
		// @35B: getfield int game.C_100239_oi.field_102296_A
		// @35E: ldc -605772092 (0xdbe4a6c4)
		// @360: ishr
		// @361: iadd
		// @362: istore #10
		// @364: aload_0
		// @365: getfield int game.C_100239_oi.field_102301_N
		// @368: ldc 1742810884 (0x67e12f04)
		// @36A: ishr
		// @36B: iload #8
		// @36D: ineg
		// @36E: iadd
		// @36F: istore #11
		// @371: iload #9
		// @373: iload #9
		// @375: imul
		// @376: iconst_m1
		// @377: ixor
		// @378: iload #10
		// @37A: iload #10
		// @37C: imul
		// @37D: iload #11
		// @37F: iload #11
		// @381: imul
		// @382: ineg
		// @383: isub
		// @384: iconst_m1
		// @385: ixor
		// @386: if_icmplt @38D
		// @389: goto @392
		// @38C: athrow
		// @38D: aload_0
		// @38E: iconst_1
		// @38F: putfield boolean game.C_100239_oi.field_102314_y
		// @392: aload_0
		// @393: getfield boolean game.C_100239_oi.field_102314_y
		// @396: ifne @39D
		// @399: goto @43F
		// @39C: athrow
		// @39D: aload_0
		// @39E: sipush 500 (0x01F4)
		// @3A1: iconst_m1
		// @3A2: aload_0
		// @3A3: getfield int game.C_100239_oi.field_102300_M
		// @3A6: iadd
		// @3A7: invokestatic java.lang.Math.min(int, int)int
		// @3AA: putfield int game.C_100239_oi.field_102300_M
		// @3AD: aload_0
		// @3AE: aload_0
		// @3AF: getfield int game.C_100239_oi.field_102311_s
		// @3B2: bipush 50 (0x32)
		// @3B4: invokestatic java.lang.Math.min(int, int)int
		// @3B7: putfield int game.C_100239_oi.field_102311_s
		// @3BA: aload_0
		// @3BB: getfield game.C_100294_ki game.C_100239_oi.field_102315_x
		// @3BE: getfield boolean game.C_100294_ki.field_106969_V
		// @3C1: ifeq @3C8
		// @3C4: goto @43F
		// @3C7: athrow
		// @3C8: iconst_0
		// @3C9: istore #7
		// @3CB: iconst_2
		// @3CC: iload #7
		// @3CE: if_icmple @43F
		// @3D1: invokestatic java.lang.Math.random()double
		// @3D4: ldc2_w 6.283185307179586
		// @3D7: dmul
		// @3D8: dstore #8
		// @3DA: invokestatic java.lang.Math.random()double
		// @3DD: ldc2_w 512.0
		// @3E0: dmul
		// @3E1: dstore #10
		// @3E3: aload_0
		// @3E4: getfield int game.C_100239_oi.field_102296_A
		// @3E7: dload #10
		// @3E9: dload #8
		// @3EB: invokestatic java.lang.Math.sin(double)double
		// @3EE: dmul
		// @3EF: d2i
		// @3F0: iconst_0
		// @3F1: aload_0
		// @3F2: getfield int game.C_100239_oi.field_102301_N
		// @3F5: bipush 10 (0x0A)
		// @3F7: aload_0
		// @3F8: getfield int game.C_100239_oi.field_102311_s
		// @3FB: iadd
		// @3FC: i2d
		// @3FD: dload #10
		// @3FF: dload #8
		// @401: invokestatic java.lang.Math.cos(double)double
		// @404: invokestatic java.lang.Math.abs(double)double
		// @407: dmul
		// @408: dsub
		// @409: d2i
		// @40A: aload_0
		// @40B: getfield game.C_100294_ki game.C_100239_oi.field_102315_x
		// @40E: bipush -124 (0x84)
		// @410: aload_0
		// @411: getfield int game.C_100239_oi.field_102296_A
		// @414: bipush 8 (0x08)
		// @416: sipush 250 (0x00FA)
		// @419: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @41C: astore #12
		// @41E: aload_0
		// @41F: getfield game.C_100294_ki game.C_100239_oi.field_102315_x
		// @422: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @425: iload_1
		// @426: bipush -114 (0x8E)
		// @428: ixor
		// @429: aload #12
		// @42B: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @42E: iinc #7 +1
		// @431: iload #13
		// @433: ifne @461
		// @436: iload #13
		// @438: ifeq @3CB
		// @43B: goto @43F
		// @43E: athrow
		// @43F: aload_0
		// @440: iconst_0
		// @441: bipush -128 (0x80)
		// @443: aload_0
		// @444: getfield game.C_100294_ki game.C_100239_oi.field_102315_x
		// @447: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @44A: sipush 23156 (0x5A74)
		// @44D: invokevirtual game.C_100171_cn.func_105552_b(int)int
		// @450: ldc 280420356 (0x10b6e004)
		// @452: ishl
		// @453: iadd
		// @454: aload_0
		// @455: getfield int game.C_100239_oi.field_102296_A
		// @458: invokestatic java.lang.Math.min(int, int)int
		// @45B: invokestatic java.lang.Math.max(int, int)int
		// @45E: putfield int game.C_100239_oi.field_102296_A
		// @461: aload_0
		// @462: getfield game.C_100314_lf[] game.C_100239_oi.field_102308_v
		// @465: astore #7
		// @467: iconst_0
		// @468: istore #8
		// @46A: aload #7
		// @46C: arraylength
		// @46D: iload #8
		// @46F: if_icmple @548
		// @472: aload #7
		// @474: iload #8
		// @476: aaload
		// @477: astore #9
		// @479: iload #13
		// @47B: ifne @56D
		// @47E: aconst_null
		// @47F: aload #9
		// @481: if_acmpne @491
		// @484: goto @488
		// @487: athrow
		// @488: iload #13
		// @48A: ifeq @548
		// @48D: goto @491
		// @490: athrow
		// @491: aload #9
		// @493: getfield boolean game.C_100314_lf.field_101390_lc
		// @496: ifne @53C
		// @499: goto @49D
		// @49C: athrow
		// @49D: aload #9
		// @49F: getfield boolean game.C_100314_lf.field_101326_I
		// @4A2: ifeq @4AD
		// @4A5: goto @4A9
		// @4A8: athrow
		// @4A9: goto @53C
		// @4AC: athrow
		// @4AD: aload #9
		// @4AF: getfield int game.C_100314_lf.field_101380_Hb
		// @4B2: ldc -1053325085 (0xc13788e3)
		// @4B4: ishl
		// @4B5: istore #10
		// @4B7: aload #9
		// @4B9: getfield int game.C_100314_lf.field_101299_xc
		// @4BC: ldc 1975448228 (0x75bef2a4)
		// @4BE: ishl
		// @4BF: istore #11
		// @4C1: aload_0
		// @4C2: getfield int game.C_100239_oi.field_102297_B
		// @4C5: iconst_2
		// @4C6: idiv
		// @4C7: ineg
		// @4C8: aload_0
		// @4C9: getfield int game.C_100239_oi.field_102296_A
		// @4CC: iadd
		// @4CD: iload #10
		// @4CF: aload #9
		// @4D1: getfield int game.C_100314_lf.field_101377_tc
		// @4D4: iadd
		// @4D5: if_icmpgt @53C
		// @4D8: iload #10
		// @4DA: ineg
		// @4DB: aload #9
		// @4DD: getfield int game.C_100314_lf.field_101377_tc
		// @4E0: iadd
		// @4E1: aload_0
		// @4E2: getfield int game.C_100239_oi.field_102296_A
		// @4E5: aload_0
		// @4E6: getfield int game.C_100239_oi.field_102297_B
		// @4E9: iconst_2
		// @4EA: idiv
		// @4EB: iadd
		// @4EC: if_icmpge @53C
		// @4EF: goto @4F3
		// @4F2: athrow
		// @4F3: aload #9
		// @4F5: getfield int game.C_100314_lf.field_101395_rc
		// @4F8: aload_0
		// @4F9: getfield int game.C_100239_oi.field_102303_H
		// @4FC: ineg
		// @4FD: aload_0
		// @4FE: getfield int game.C_100239_oi.field_102301_N
		// @501: iadd
		// @502: if_icmplt @53C
		// @505: goto @509
		// @508: athrow
		// @509: aload #9
		// @50B: getfield int game.C_100314_lf.field_101395_rc
		// @50E: iload #11
		// @510: isub
		// @511: iconst_m1
		// @512: ixor
		// @513: aload_0
		// @514: getfield int game.C_100239_oi.field_102301_N
		// @517: iconst_m1
		// @518: ixor
		// @519: if_icmple @53C
		// @51C: goto @520
		// @51F: athrow
		// @520: aload_0
		// @521: aload #9
		// @523: bipush 19 (0x13)
		// @525: invokespecial game.C_100239_oi.func_102290_a(game.C_100314_lf, byte)void
		// @528: aload_0
		// @529: getfield int game.C_100239_oi.field_102296_A
		// @52C: bipush 102 (0x66)
		// @52E: iconst_1
		// @52F: invokestatic game.C_100143_bl.func_105098_a(int, int, boolean)game.C_100179_ch
		// @532: pop
		// @533: iload #13
		// @535: ifeq @548
		// @538: goto @53C
		// @53B: athrow
		// @53C: iinc #8 +1
		// @53F: iload #13
		// @541: ifeq @46A
		// @544: goto @548
		// @547: athrow
		// @548: goto @56D
		// @54B: astore_2
		// @54C: aload_2
		// @54D: new java.lang.StringBuilder
		// @550: dup
		// @551: invokespecial java.lang.StringBuilder.<init>()void
		// @554: getstatic java.lang.String[] game.C_100239_oi.field_102295_G
		// @557: bipush 7 (0x07)
		// @559: aaload
		// @55A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @55D: iload_1
		// @55E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @561: bipush 41 (0x29)
		// @563: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @566: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @569: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @56C: athrow
		// @56D: return
	}
	
	static final C_100037_wb[] func_102283_a(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #15
		// @005: iload_3
		// @006: iload #4
		// @008: iload #5
		// @00A: ineg
		// @00B: isub
		// @00C: iadd
		// @00D: istore #9
		// @00F: bipush 9 (0x09)
		// @011: anewarray game.C_100037_wb
		// @014: dup
		// @015: iconst_0
		// @016: new game.C_100037_wb
		// @019: dup
		// @01A: iload #9
		// @01C: iload #9
		// @01E: invokespecial game.C_100037_wb.<init>(int, int)void
		// @021: aastore
		// @022: dup
		// @023: iconst_1
		// @024: new game.C_100037_wb
		// @027: dup
		// @028: iload_1
		// @029: iload #9
		// @02B: invokespecial game.C_100037_wb.<init>(int, int)void
		// @02E: aastore
		// @02F: dup
		// @030: iconst_2
		// @031: new game.C_100037_wb
		// @034: dup
		// @035: iload #9
		// @037: iload #9
		// @039: invokespecial game.C_100037_wb.<init>(int, int)void
		// @03C: aastore
		// @03D: dup
		// @03E: iconst_3
		// @03F: new game.C_100037_wb
		// @042: dup
		// @043: iload #9
		// @045: iload_1
		// @046: invokespecial game.C_100037_wb.<init>(int, int)void
		// @049: aastore
		// @04A: dup
		// @04B: iconst_4
		// @04C: new game.C_100037_wb
		// @04F: dup
		// @050: bipush 64 (0x40)
		// @052: bipush 64 (0x40)
		// @054: invokespecial game.C_100037_wb.<init>(int, int)void
		// @057: aastore
		// @058: dup
		// @059: iconst_5
		// @05A: new game.C_100037_wb
		// @05D: dup
		// @05E: iload #9
		// @060: iload_1
		// @061: invokespecial game.C_100037_wb.<init>(int, int)void
		// @064: aastore
		// @065: dup
		// @066: bipush 6 (0x06)
		// @068: new game.C_100037_wb
		// @06B: dup
		// @06C: iload #9
		// @06E: iload #9
		// @070: invokespecial game.C_100037_wb.<init>(int, int)void
		// @073: aastore
		// @074: dup
		// @075: bipush 7 (0x07)
		// @077: new game.C_100037_wb
		// @07A: dup
		// @07B: iload_1
		// @07C: iload #9
		// @07E: invokespecial game.C_100037_wb.<init>(int, int)void
		// @081: aastore
		// @082: dup
		// @083: bipush 8 (0x08)
		// @085: new game.C_100037_wb
		// @088: dup
		// @089: iload #9
		// @08B: iload #9
		// @08D: invokespecial game.C_100037_wb.<init>(int, int)void
		// @090: aastore
		// @091: astore #10
		// @093: aload #10
		// @095: astore #11
		// @097: iconst_0
		// @098: istore #12
		// @09A: aload #11
		// @09C: arraylength
		// @09D: iload #12
		// @09F: if_icmple @0DF
		// @0A2: aload #11
		// @0A4: iload #12
		// @0A6: aaload
		// @0A7: astore #13
		// @0A9: iconst_0
		// @0AA: iload #15
		// @0AC: ifne @0E1
		// @0AF: istore #14
		// @0B1: iload #14
		// @0B3: aload #13
		// @0B5: getfield int[] game.C_100037_wb.field_102388_J
		// @0B8: arraylength
		// @0B9: if_icmpge @0D7
		// @0BC: aload #13
		// @0BE: getfield int[] game.C_100037_wb.field_102388_J
		// @0C1: iload #14
		// @0C3: iload #8
		// @0C5: iastore
		// @0C6: iinc #14 +1
		// @0C9: iload #15
		// @0CB: ifne @0DA
		// @0CE: iload #15
		// @0D0: ifeq @0B1
		// @0D3: goto @0D7
		// @0D6: athrow
		// @0D7: iinc #12 +1
		// @0DA: iload #15
		// @0DC: ifeq @09A
		// @0DF: iload #6
		// @0E1: bipush -112 (0x90)
		// @0E3: if_icmpeq @0F8
		// @0E6: bipush -75 (0xB5)
		// @0E8: bipush -6 (0xFA)
		// @0EA: bipush 81 (0x51)
		// @0EC: iconst_1
		// @0ED: bipush 7 (0x07)
		// @0EF: bipush -125 (0x83)
		// @0F1: invokestatic game.C_100239_oi.func_102288_a(int, int, int, int, int, int)void
		// @0F4: goto @0F8
		// @0F7: athrow
		// @0F8: iconst_0
		// @0F9: istore #11
		// @0FB: iload #4
		// @0FD: iload #11
		// @0FF: if_icmple @18D
		// @102: iconst_0
		// @103: iload #15
		// @105: ifne @18E
		// @108: istore #12
		// @10A: iload #12
		// @10C: iload #9
		// @10E: if_icmpge @185
		// @111: aload #10
		// @113: bipush 6 (0x06)
		// @115: aaload
		// @116: getfield int[] game.C_100037_wb.field_102388_J
		// @119: iload #12
		// @11B: iconst_m1
		// @11C: iload #9
		// @11E: iadd
		// @11F: iload #11
		// @121: isub
		// @122: iload #9
		// @124: imul
		// @125: iadd
		// @126: iload #7
		// @128: iastore
		// @129: aload #10
		// @12B: bipush 8 (0x08)
		// @12D: aaload
		// @12E: getfield int[] game.C_100037_wb.field_102388_J
		// @131: iload #12
		// @133: iload #11
		// @135: ineg
		// @136: iload #9
		// @138: iadd
		// @139: iconst_1
		// @13A: isub
		// @13B: iload #9
		// @13D: imul
		// @13E: iadd
		// @13F: iload #7
		// @141: iastore
		// @142: aload #10
		// @144: iconst_2
		// @145: aaload
		// @146: getfield int[] game.C_100037_wb.field_102388_J
		// @149: iload #11
		// @14B: ineg
		// @14C: iconst_1
		// @14D: isub
		// @14E: iload #9
		// @150: ineg
		// @151: iload #12
		// @153: iload #9
		// @155: imul
		// @156: isub
		// @157: isub
		// @158: iload #7
		// @15A: iastore
		// @15B: aload #10
		// @15D: bipush 8 (0x08)
		// @15F: aaload
		// @160: getfield int[] game.C_100037_wb.field_102388_J
		// @163: iload #12
		// @165: iload #9
		// @167: imul
		// @168: iload #11
		// @16A: ineg
		// @16B: iadd
		// @16C: iconst_m1
		// @16D: iadd
		// @16E: iload #9
		// @170: iadd
		// @171: iload #7
		// @173: iastore
		// @174: iinc #12 +1
		// @177: iload #15
		// @179: ifne @188
		// @17C: iload #15
		// @17E: ifeq @10A
		// @181: goto @185
		// @184: athrow
		// @185: iinc #11 +1
		// @188: iload #15
		// @18A: ifeq @0FB
		// @18D: iconst_0
		// @18E: istore #11
		// @190: iload #4
		// @192: iload #11
		// @194: if_icmple @212
		// @197: iconst_0
		// @198: iload #15
		// @19A: ifne @213
		// @19D: istore #12
		// @19F: iload #9
		// @1A1: iconst_m1
		// @1A2: ixor
		// @1A3: iload #12
		// @1A5: iconst_m1
		// @1A6: ixor
		// @1A7: if_icmpge @20A
		// @1AA: aload #10
		// @1AC: iconst_0
		// @1AD: aaload
		// @1AE: getfield int[] game.C_100037_wb.field_102388_J
		// @1B1: iload #12
		// @1B3: iload #9
		// @1B5: iload #11
		// @1B7: imul
		// @1B8: iadd
		// @1B9: iload_2
		// @1BA: iastore
		// @1BB: aload #10
		// @1BD: iconst_0
		// @1BE: aaload
		// @1BF: getfield int[] game.C_100037_wb.field_102388_J
		// @1C2: iload #9
		// @1C4: iload #12
		// @1C6: imul
		// @1C7: iload #11
		// @1C9: iadd
		// @1CA: iload_2
		// @1CB: iastore
		// @1CC: iload #12
		// @1CE: iload #11
		// @1D0: ineg
		// @1D1: iload #9
		// @1D3: iadd
		// @1D4: iload #15
		// @1D6: ifne @194
		// @1D9: if_icmplt @1DF
		// @1DC: goto @202
		// @1DF: aload #10
		// @1E1: iconst_2
		// @1E2: aaload
		// @1E3: getfield int[] game.C_100037_wb.field_102388_J
		// @1E6: iload #12
		// @1E8: iload #9
		// @1EA: iload #11
		// @1EC: imul
		// @1ED: iadd
		// @1EE: iload_2
		// @1EF: iastore
		// @1F0: aload #10
		// @1F2: bipush 6 (0x06)
		// @1F4: aaload
		// @1F5: getfield int[] game.C_100037_wb.field_102388_J
		// @1F8: iload #12
		// @1FA: iload #9
		// @1FC: imul
		// @1FD: iload #11
		// @1FF: iadd
		// @200: iload_2
		// @201: iastore
		// @202: iinc #12 +1
		// @205: iload #15
		// @207: ifeq @19F
		// @20A: iinc #11 +1
		// @20D: iload #15
		// @20F: ifeq @190
		// @212: iconst_0
		// @213: istore #11
		// @215: iload #11
		// @217: iconst_m1
		// @218: ixor
		// @219: iload_1
		// @21A: iconst_m1
		// @21B: ixor
		// @21C: if_icmple @29D
		// @21F: iconst_0
		// @220: iload #15
		// @222: ifne @29E
		// @225: istore #12
		// @227: iload #12
		// @229: iconst_m1
		// @22A: ixor
		// @22B: iload #4
		// @22D: iconst_m1
		// @22E: ixor
		// @22F: if_icmple @295
		// @232: aload #10
		// @234: bipush 7 (0x07)
		// @236: aaload
		// @237: getfield int[] game.C_100037_wb.field_102388_J
		// @23A: iload_1
		// @23B: iconst_m1
		// @23C: iload #12
		// @23E: ineg
		// @23F: iload #9
		// @241: iadd
		// @242: iadd
		// @243: imul
		// @244: iload #11
		// @246: iadd
		// @247: iload #7
		// @249: iastore
		// @24A: aload #10
		// @24C: iconst_5
		// @24D: aaload
		// @24E: getfield int[] game.C_100037_wb.field_102388_J
		// @251: iload #12
		// @253: ineg
		// @254: iconst_m1
		// @255: iadd
		// @256: iload #9
		// @258: iload #9
		// @25A: iload #11
		// @25C: imul
		// @25D: iadd
		// @25E: iadd
		// @25F: iload #7
		// @261: iastore
		// @262: aload #10
		// @264: iconst_1
		// @265: aaload
		// @266: getfield int[] game.C_100037_wb.field_102388_J
		// @269: iload #12
		// @26B: iload_1
		// @26C: imul
		// @26D: iload #11
		// @26F: ineg
		// @270: isub
		// @271: iload_2
		// @272: iastore
		// @273: aload #10
		// @275: iconst_3
		// @276: aaload
		// @277: getfield int[] game.C_100037_wb.field_102388_J
		// @27A: iload #11
		// @27C: iload #9
		// @27E: imul
		// @27F: iload #12
		// @281: iadd
		// @282: iload_2
		// @283: iastore
		// @284: iinc #12 +1
		// @287: iload #15
		// @289: ifne @298
		// @28C: iload #15
		// @28E: ifeq @227
		// @291: goto @295
		// @294: athrow
		// @295: iinc #11 +1
		// @298: iload #15
		// @29A: ifeq @215
		// @29D: iconst_0
		// @29E: istore #11
		// @2A0: iload #11
		// @2A2: iconst_m1
		// @2A3: ixor
		// @2A4: iload_1
		// @2A5: ldc -929806623 (0xc89446e1)
		// @2A7: ishr
		// @2A8: iconst_m1
		// @2A9: ixor
		// @2AA: if_icmple @31E
		// @2AD: iconst_0
		// @2AE: istore #12
		// @2B0: iload #12
		// @2B2: iload_3
		// @2B3: if_icmpge @316
		// @2B6: aload #10
		// @2B8: iconst_1
		// @2B9: aaload
		// @2BA: getfield int[] game.C_100037_wb.field_102388_J
		// @2BD: iload #9
		// @2BF: iload #12
		// @2C1: ineg
		// @2C2: iconst_1
		// @2C3: isub
		// @2C4: iadd
		// @2C5: iload_1
		// @2C6: imul
		// @2C7: iload #11
		// @2C9: iadd
		// @2CA: iload_0
		// @2CB: iastore
		// @2CC: aload #10
		// @2CE: iconst_3
		// @2CF: aaload
		// @2D0: getfield int[] game.C_100037_wb.field_102388_J
		// @2D3: iload #9
		// @2D5: iload #11
		// @2D7: imul
		// @2D8: iload #9
		// @2DA: iconst_m1
		// @2DB: iload #12
		// @2DD: ineg
		// @2DE: iadd
		// @2DF: iadd
		// @2E0: iadd
		// @2E1: iload_0
		// @2E2: iastore
		// @2E3: aload #10
		// @2E5: bipush 7 (0x07)
		// @2E7: aaload
		// @2E8: getfield int[] game.C_100037_wb.field_102388_J
		// @2EB: iload #12
		// @2ED: iload_1
		// @2EE: imul
		// @2EF: iload #11
		// @2F1: iadd
		// @2F2: iload_0
		// @2F3: iastore
		// @2F4: aload #10
		// @2F6: iconst_5
		// @2F7: aaload
		// @2F8: getfield int[] game.C_100037_wb.field_102388_J
		// @2FB: iload #12
		// @2FD: iload #9
		// @2FF: iload #11
		// @301: imul
		// @302: iadd
		// @303: iload_0
		// @304: iastore
		// @305: iinc #12 +1
		// @308: iload #15
		// @30A: ifne @319
		// @30D: iload #15
		// @30F: ifeq @2B0
		// @312: goto @316
		// @315: athrow
		// @316: iinc #11 +1
		// @319: iload #15
		// @31B: ifeq @2A0
		// @31E: aload #10
		// @320: areturn
		// @321: astore #9
		// @323: aload #9
		// @325: new java.lang.StringBuilder
		// @328: dup
		// @329: invokespecial java.lang.StringBuilder.<init>()void
		// @32C: getstatic java.lang.String[] game.C_100239_oi.field_102295_G
		// @32F: iconst_3
		// @330: aaload
		// @331: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @334: iload_0
		// @335: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @338: bipush 44 (0x2C)
		// @33A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @33D: iload_1
		// @33E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @341: bipush 44 (0x2C)
		// @343: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @346: iload_2
		// @347: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @34A: bipush 44 (0x2C)
		// @34C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @34F: iload_3
		// @350: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @353: bipush 44 (0x2C)
		// @355: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @358: iload #4
		// @35A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @35D: bipush 44 (0x2C)
		// @35F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @362: iload #5
		// @364: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @367: bipush 44 (0x2C)
		// @369: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @36C: iload #6
		// @36E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @371: bipush 44 (0x2C)
		// @373: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @376: iload #7
		// @378: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @37B: bipush 44 (0x2C)
		// @37D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @380: iload #8
		// @382: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @385: bipush 41 (0x29)
		// @387: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @38A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @38D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @390: athrow
	}
	
	C_100239_oi(C_100294_ki arg0, int arg1)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #7
		// @005: aload_0
		// @006: invokespecial game.C_100325_id.<init>()void
		// @009: aload_0
		// @00A: sipush 1500 (0x05DC)
		// @00D: putfield int game.C_100239_oi.field_102313_z
		// @010: aload_0
		// @011: sipush 4096 (0x1000)
		// @014: putfield int game.C_100239_oi.field_102303_H
		// @017: aload_0
		// @018: iconst_0
		// @019: putfield int game.C_100239_oi.field_102311_s
		// @01C: aload_0
		// @01D: sipush 3000 (0x0BB8)
		// @020: putfield int game.C_100239_oi.field_102300_M
		// @023: aload_0
		// @024: sipush 4096 (0x1000)
		// @027: putfield int game.C_100239_oi.field_102297_B
		// @02A: aload_0
		// @02B: iconst_0
		// @02C: putfield boolean game.C_100239_oi.field_102304_I
		// @02F: aload_0
		// @030: iconst_1
		// @031: putfield boolean game.C_100239_oi.field_102310_t
		// @034: aload_0
		// @035: iconst_0
		// @036: putfield boolean game.C_100239_oi.field_102314_y
		// @039: aload_0
		// @03A: iload_2
		// @03B: putfield int game.C_100239_oi.field_102302_O
		// @03E: aload_0
		// @03F: aload_1
		// @040: putfield game.C_100294_ki game.C_100239_oi.field_102315_x
		// @043: aload_0
		// @044: getfield game.C_100294_ki game.C_100239_oi.field_102315_x
		// @047: getfield int game.C_100294_ki.field_106999_q
		// @04A: aload_0
		// @04B: getfield game.C_100294_ki game.C_100239_oi.field_102315_x
		// @04E: getfield int game.C_100294_ki.field_106990_h
		// @051: iadd
		// @052: istore_3
		// @053: aload_0
		// @054: iload_3
		// @055: anewarray game.C_100314_lf
		// @058: putfield game.C_100314_lf[] game.C_100239_oi.field_102308_v
		// @05B: iconst_0
		// @05C: istore #4
		// @05E: new game.C_100019_wl
		// @061: dup
		// @062: aload_0
		// @063: getfield game.C_100294_ki game.C_100239_oi.field_102315_x
		// @066: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @069: invokespecial game.C_100019_wl.<init>(game.C_100202_qi)void
		// @06C: astore #5
		// @06E: aload #5
		// @070: bipush -128 (0x80)
		// @072: invokevirtual game.C_100019_wl.func_103827_a(byte)game.C_100158_da
		// @075: checkcast game.C_100314_lf
		// @078: astore #6
		// @07A: aconst_null
		// @07B: aload #6
		// @07D: if_acmpeq @0C3
		// @080: iconst_m1
		// @081: aload #6
		// @083: getfield int game.C_100314_lf.field_101347_Gb
		// @086: iconst_m1
		// @087: ixor
		// @088: iload #7
		// @08A: ifne @0CF
		// @08D: if_icmplt @0B1
		// @090: goto @094
		// @093: athrow
		// @094: iload_3
		// @095: aload #6
		// @097: getfield int game.C_100314_lf.field_101347_Gb
		// @09A: if_icmpgt @0A5
		// @09D: goto @0A1
		// @0A0: athrow
		// @0A1: goto @0B1
		// @0A4: athrow
		// @0A5: aload_0
		// @0A6: getfield game.C_100314_lf[] game.C_100239_oi.field_102308_v
		// @0A9: iload #4
		// @0AB: iinc #4 +1
		// @0AE: aload #6
		// @0B0: aastore
		// @0B1: aload #5
		// @0B3: sipush -30820 (0x879C)
		// @0B6: invokevirtual game.C_100019_wl.func_103836_b(int)game.C_100158_da
		// @0B9: checkcast game.C_100314_lf
		// @0BC: astore #6
		// @0BE: iload #7
		// @0C0: ifeq @07A
		// @0C3: aload_0
		// @0C4: getfield int game.C_100239_oi.field_102302_O
		// @0C7: istore #4
		// @0C9: iload #4
		// @0CB: iconst_m1
		// @0CC: ixor
		// @0CD: bipush -25 (0xE7)
		// @0CF: if_icmpeq @118
		// @0D2: iload #4
		// @0D4: bipush 36 (0x24)
		// @0D6: if_icmpeq @128
		// @0D9: goto @0DD
		// @0DC: athrow
		// @0DD: bipush -16 (0xF0)
		// @0DF: iload #4
		// @0E1: iconst_m1
		// @0E2: ixor
		// @0E3: if_icmpne @0F3
		// @0E6: goto @0EA
		// @0E9: athrow
		// @0EA: iload #7
		// @0EC: ifeq @128
		// @0EF: goto @0F3
		// @0F2: athrow
		// @0F3: bipush 44 (0x2C)
		// @0F5: iload #4
		// @0F7: if_icmpeq @128
		// @0FA: goto @0FE
		// @0FD: athrow
		// @0FE: iload #4
		// @100: bipush 45 (0x2D)
		// @102: if_icmpeq @128
		// @105: goto @109
		// @108: athrow
		// @109: iload #4
		// @10B: bipush 43 (0x2B)
		// @10D: if_icmpeq @136
		// @110: goto @114
		// @113: athrow
		// @114: goto @145
		// @117: athrow
		// @118: aload_0
		// @119: iconst_0
		// @11A: putfield boolean game.C_100239_oi.field_102310_t
		// @11D: aload_0
		// @11E: ldc 2147483647 (0x7fffffff)
		// @120: putfield int game.C_100239_oi.field_102313_z
		// @123: iload #7
		// @125: ifeq @145
		// @128: aload_0
		// @129: iconst_1
		// @12A: putfield boolean game.C_100239_oi.field_102304_I
		// @12D: iload #7
		// @12F: ifeq @145
		// @132: goto @136
		// @135: athrow
		// @136: aload_0
		// @137: iconst_1
		// @138: putfield boolean game.C_100239_oi.field_102304_I
		// @13B: aload_0
		// @13C: ldc 2147483647 (0x7fffffff)
		// @13E: putfield int game.C_100239_oi.field_102300_M
		// @141: goto @145
		// @144: athrow
		// @145: aload_0
		// @146: getfield boolean game.C_100239_oi.field_102304_I
		// @149: ifne @150
		// @14C: goto @15B
		// @14F: athrow
		// @150: aload_0
		// @151: iconst_0
		// @152: putfield boolean game.C_100239_oi.field_102310_t
		// @155: aload_0
		// @156: bipush 100 (0x64)
		// @158: putfield int game.C_100239_oi.field_102313_z
		// @15B: aload_0
		// @15C: getfield game.C_100294_ki game.C_100239_oi.field_102315_x
		// @15F: getfield boolean game.C_100294_ki.field_106969_V
		// @162: ifne @1A1
		// @165: bipush -88 (0xA8)
		// @167: aload_0
		// @168: getfield int game.C_100239_oi.field_102302_O
		// @16B: invokestatic game.C_100242_oh.func_106339_a(byte, int)game.C_100153_be
		// @16E: astore #4
		// @170: aload_0
		// @171: new game.C_100037_wb
		// @174: dup
		// @175: aload #4
		// @177: getfield int game.C_100153_be.field_105298_m
		// @17A: aload #4
		// @17C: getfield int game.C_100153_be.field_105304_r
		// @17F: invokespecial game.C_100037_wb.<init>(int, int)void
		// @182: putfield game.C_100037_wb game.C_100239_oi.field_102292_D
		// @185: aload_0
		// @186: getfield game.C_100037_wb game.C_100239_oi.field_102292_D
		// @189: aload #4
		// @18B: getfield int game.C_100153_be.field_105300_k
		// @18E: iconst_2
		// @18F: idiv
		// @190: putfield int game.C_100037_wb.field_102332_H
		// @193: aload_0
		// @194: getfield game.C_100037_wb game.C_100239_oi.field_102292_D
		// @197: aload #4
		// @199: getfield int game.C_100153_be.field_105297_l
		// @19C: iconst_2
		// @19D: idiv
		// @19E: putfield int game.C_100037_wb.field_102335_w
		// @1A1: goto @1E0
		// @1A4: astore_3
		// @1A5: aload_3
		// @1A6: new java.lang.StringBuilder
		// @1A9: dup
		// @1AA: invokespecial java.lang.StringBuilder.<init>()void
		// @1AD: getstatic java.lang.String[] game.C_100239_oi.field_102295_G
		// @1B0: bipush 8 (0x08)
		// @1B2: aaload
		// @1B3: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1B6: aload_1
		// @1B7: ifnull @1C3
		// @1BA: getstatic java.lang.String[] game.C_100239_oi.field_102295_G
		// @1BD: iconst_5
		// @1BE: aaload
		// @1BF: goto @1C8
		// @1C2: athrow
		// @1C3: getstatic java.lang.String[] game.C_100239_oi.field_102295_G
		// @1C6: iconst_4
		// @1C7: aaload
		// @1C8: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1CB: bipush 44 (0x2C)
		// @1CD: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1D0: iload_2
		// @1D1: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1D4: bipush 41 (0x29)
		// @1D6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1D9: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @1DC: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @1DF: athrow
		// @1E0: return
	}
	
	static
	{
		// @00: bipush 10 (0x0A)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "`\u0004]Xm"
		// @09: invokestatic game.C_100239_oi.func_102287_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100239_oi.func_102286_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "`\u0004]Ym"
		// @14: invokestatic game.C_100239_oi.func_102287_z(java.lang.String)char[]
		// @17: invokestatic game.C_100239_oi.func_102286_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "`\u0004]]m"
		// @1F: invokestatic game.C_100239_oi.func_102287_z(java.lang.String)char[]
		// @22: invokestatic game.C_100239_oi.func_102286_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "`\u0004]Zm"
		// @2A: invokestatic game.C_100239_oi.func_102287_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100239_oi.func_102286_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "a\u0018\u001fp"
		// @35: invokestatic game.C_100239_oi.func_102287_z(java.lang.String)char[]
		// @38: invokestatic game.C_100239_oi.func_102286_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "tC]28"
		// @40: invokestatic game.C_100239_oi.func_102287_z(java.lang.String)char[]
		// @43: invokestatic game.C_100239_oi.func_102286_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "`\u0004]_m"
		// @4C: invokestatic game.C_100239_oi.func_102287_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100239_oi.func_102286_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "`\u0004]^m"
		// @58: invokestatic game.C_100239_oi.func_102287_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100239_oi.func_102286_z(char[])java.lang.String
		// @5E: aastore
		// @5F: dup
		// @60: bipush 8 (0x08)
		// @62: ldc "`\u0004] ,a\u0004\u0007\"m"
		// @64: invokestatic game.C_100239_oi.func_102287_z(java.lang.String)char[]
		// @67: invokestatic game.C_100239_oi.func_102286_z(char[])java.lang.String
		// @6A: aastore
		// @6B: dup
		// @6C: bipush 9 (0x09)
		// @6E: ldc "`\u0004][m"
		// @70: invokestatic game.C_100239_oi.func_102287_z(java.lang.String)char[]
		// @73: invokestatic game.C_100239_oi.func_102286_z(char[])java.lang.String
		// @76: aastore
		// @77: putstatic java.lang.String[] game.C_100239_oi.field_102295_G
		// @7A: iconst_4
		// @7B: newarray int[]
		// @7D: dup
		// @7E: iconst_0
		// @7F: bipush 40 (0x28)
		// @81: iastore
		// @82: dup
		// @83: iconst_1
		// @84: bipush 33 (0x21)
		// @86: iastore
		// @87: dup
		// @88: iconst_2
		// @89: bipush 46 (0x2E)
		// @8B: iastore
		// @8C: dup
		// @8D: iconst_3
		// @8E: bipush 7 (0x07)
		// @90: iastore
		// @91: putstatic int[] game.C_100239_oi.field_102305_J
		// @94: bipush 20 (0x14)
		// @96: putstatic int game.C_100239_oi.field_102312_P
		// @99: ldc "^\u0018\u001ahe{\u0002Sk m\u001e\u001ah "
		// @9B: invokestatic game.C_100239_oi.func_102287_z(java.lang.String)char[]
		// @9E: invokestatic game.C_100239_oi.func_102286_z(char[])java.lang.String
		// @A1: putstatic java.lang.String game.C_100239_oi.field_102298_C
		// @A4: bipush 10 (0x0A)
		// @A6: putstatic int game.C_100239_oi.field_102293_E
		// @A9: return
	}
	
	private static char[] func_102287_z(String arg0)
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
		// @0E: bipush 69 (0x45)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_102286_z(char[] arg0)
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
		// @30: bipush 15 (0x0F)
		// @32: goto @46
		// @35: bipush 109 (0x6D)
		// @37: goto @46
		// @3A: bipush 115 (0x73)
		// @3C: goto @46
		// @3F: bipush 28 (0x1C)
		// @41: goto @46
		// @44: bipush 69 (0x45)
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
