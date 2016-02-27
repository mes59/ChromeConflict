package game;

import java.applet.Applet;

final class C_100290_jm
{
	private int[] field_106859_e;
	private int[] field_106858_d;
	static C_100268_mk field_106856_f;
	static C_100153_be[] field_106865_k;
	static long field_106867_i;
	static String field_106861_c;
	static int[] field_106863_j;
	static String field_106857_g;
	static String field_106866_h;
	static int field_106860_b;
	private byte[] field_106862_a;
	private static final String[] field_106864_z;
	
	static final void func_106853_a(byte arg0)
	{
		// @00: getstatic game.C_100022_hf game.C_100136_th.field_102623_R
		// @03: ifnull @21
		// @06: getstatic game.C_100022_hf game.C_100136_th.field_102623_R
		// @09: getfield game.C_100302_ka game.C_100022_hf.field_103897_b
		// @0C: ifnonnull @17
		// @0F: goto @13
		// @12: athrow
		// @13: goto @21
		// @16: athrow
		// @17: getstatic game.C_100022_hf game.C_100136_th.field_102623_R
		// @1A: getfield game.C_100302_ka game.C_100022_hf.field_103897_b
		// @1D: iconst_0
		// @1E: putfield boolean game.C_100302_ka.field_101861_U
		// @21: aconst_null
		// @22: putstatic game.C_100022_hf game.C_100136_th.field_102623_R
		// @25: iload_0
		// @26: bipush 46 (0x2E)
		// @28: if_icmpeq @34
		// @2B: bipush 22 (0x16)
		// @2D: invokestatic game.C_100290_jm.func_106851_a(int)void
		// @30: goto @34
		// @33: athrow
		// @34: aconst_null
		// @35: putstatic game.C_100115_ej game.C_100346_ja.field_103486_m
		// @38: goto @5C
		// @3B: astore_1
		// @3C: aload_1
		// @3D: new java.lang.StringBuilder
		// @40: dup
		// @41: invokespecial java.lang.StringBuilder.<init>()void
		// @44: getstatic java.lang.String[] game.C_100290_jm.field_106864_z
		// @47: iconst_3
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
	
	static final int func_106848_a(C_100302_ka arg0, boolean arg1)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #19
		// @005: aload_0
		// @006: getfield game.C_100202_qi game.C_100302_ka.field_101891_Ob
		// @009: ifnull @019
		// @00C: aload_0
		// @00D: getfield game.C_100202_qi game.C_100302_ka.field_101891_Ob
		// @010: bipush -93 (0xA3)
		// @012: invokevirtual game.C_100202_qi.func_105905_b(byte)void
		// @015: goto @019
		// @018: athrow
		// @019: iconst_4
		// @01A: istore_2
		// @01B: getstatic boolean game.C_100006_fj.field_103621_c
		// @01E: ifne @02D
		// @021: bipush 110 (0x6E)
		// @023: getstatic int game.C_100055_ed.field_104242_e
		// @026: iconst_4
		// @027: iadd
		// @028: isub
		// @029: goto @039
		// @02C: athrow
		// @02D: getstatic int game.C_100055_ed.field_104242_e
		// @030: ineg
		// @031: getstatic int game.C_100104_v.field_104692_c
		// @034: ineg
		// @035: iadd
		// @036: bipush 102 (0x66)
		// @038: iadd
		// @039: istore_3
		// @03A: iconst_0
		// @03B: anewarray game.C_100049_vf
		// @03E: astore #4
		// @040: getstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @043: getstatic int game.C_100200_ba.field_105852_c
		// @046: bipush -111 (0x91)
		// @048: aload #4
		// @04A: invokevirtual game.C_100327_ib.func_102462_a(int, int, game.C_100049_vf[])game.C_100049_vf[]
		// @04D: astore #4
		// @04F: iconst_0
		// @050: istore #6
		// @052: aload #4
		// @054: arraylength
		// @055: iconst_m1
		// @056: ixor
		// @057: iload #6
		// @059: iconst_m1
		// @05A: ixor
		// @05B: if_icmpge @52C
		// @05E: aload #4
		// @060: iload #6
		// @062: aaload
		// @063: astore #5
		// @065: new game.C_100302_ka
		// @068: dup
		// @069: ldc ""
		// @06B: getstatic game.C_100302_ka game.C_100132_td.field_104976_a
		// @06E: invokespecial game.C_100302_ka.<init>(java.lang.String, game.C_100302_ka)void
		// @071: astore #7
		// @073: iload #19
		// @075: ifne @53D
		// @078: getstatic game.C_100327_ib game.C_100197_ra.field_100861_k
		// @07B: ifnull @0A4
		// @07E: goto @082
		// @081: athrow
		// @082: getstatic game.C_100327_ib game.C_100197_ra.field_100861_k
		// @085: getfield int game.C_100327_ib.field_102497_w
		// @088: aload #5
		// @08A: getfield int game.C_100049_vf.field_104203_a
		// @08D: iand
		// @08E: ifgt @099
		// @091: goto @095
		// @094: athrow
		// @095: goto @0A4
		// @098: athrow
		// @099: aload #7
		// @09B: sipush 32280 (0x7E18)
		// @09E: getstatic game.C_100302_ka game.C_100042_we.field_104131_r
		// @0A1: invokevirtual game.C_100302_ka.func_101810_a(int, game.C_100302_ka)void
		// @0A4: getstatic game.C_100327_ib game.C_100197_ra.field_100861_k
		// @0A7: ifnonnull @0E9
		// @0AA: iconst_m1
		// @0AB: getstatic int game.C_100242_oh.field_106343_d
		// @0AE: iconst_m1
		// @0AF: ixor
		// @0B0: if_icmplt @0E9
		// @0B3: goto @0B7
		// @0B6: athrow
		// @0B7: getstatic int game.C_100242_oh.field_106343_d
		// @0BA: bipush 98 (0x62)
		// @0BC: invokestatic game.C_100209_qb.func_102686_b(int, byte)game.C_100327_ib
		// @0BF: astore #8
		// @0C1: aconst_null
		// @0C2: aload #8
		// @0C4: if_acmpeq @0E9
		// @0C7: iconst_0
		// @0C8: aload #8
		// @0CA: getfield int game.C_100327_ib.field_102497_w
		// @0CD: aload #5
		// @0CF: getfield int game.C_100049_vf.field_104203_a
		// @0D2: iand
		// @0D3: if_icmpeq @0E9
		// @0D6: goto @0DA
		// @0D9: athrow
		// @0DA: aload #7
		// @0DC: sipush 32280 (0x7E18)
		// @0DF: getstatic game.C_100302_ka game.C_100042_we.field_104131_r
		// @0E2: invokevirtual game.C_100302_ka.func_101810_a(int, game.C_100302_ka)void
		// @0E5: goto @0E9
		// @0E8: athrow
		// @0E9: aload #7
		// @0EB: iconst_4
		// @0EC: bipush 32 (0x20)
		// @0EE: iconst_m1
		// @0EF: iload_2
		// @0F0: iload_3
		// @0F1: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @0F4: aload #7
		// @0F6: ldc ""
		// @0F8: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @0FB: aload #7
		// @0FD: iconst_0
		// @0FE: putfield int game.C_100302_ka.field_101858_J
		// @101: aload #7
		// @103: iconst_2
		// @104: putfield int game.C_100302_ka.field_101875_X
		// @107: new game.C_100302_ka
		// @10A: dup
		// @10B: ldc2_w -1
		// @10E: aconst_null
		// @10F: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @112: astore #8
		// @114: aload #8
		// @116: iconst_1
		// @117: putfield int game.C_100302_ka.field_101850_Fb
		// @11A: aload #8
		// @11C: ldc 9211020 (0x8c8c8c)
		// @11E: putfield int game.C_100302_ka.field_101830_gb
		// @121: aload #8
		// @123: getstatic game.C_100317_lb game.C_100311_le.field_104719_A
		// @126: putfield game.C_100112_r game.C_100302_ka.field_101845_sb
		// @129: aload #8
		// @12B: iconst_2
		// @12C: putfield int game.C_100302_ka.field_101858_J
		// @12F: aload #8
		// @131: getstatic game.C_100037_wb[] game.C_100321_hi.field_107228_h
		// @134: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @137: aload #8
		// @139: iconst_2
		// @13A: bipush 12 (0x0C)
		// @13C: iconst_m1
		// @13D: bipush 18 (0x12)
		// @13F: bipush -4 (0xFC)
		// @141: iload_3
		// @142: iadd
		// @143: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @146: aload #7
		// @148: bipush -91 (0xA5)
		// @14A: aload #8
		// @14C: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @14F: aload #5
		// @151: getfield int game.C_100049_vf.field_104203_a
		// @154: istore #9
		// @156: iconst_0
		// @157: istore #10
		// @159: iconst_1
		// @15A: istore #11
		// @15C: getstatic game.C_100327_ib game.C_100254_pi.field_106459_h
		// @15F: iconst_0
		// @160: aload #5
		// @162: invokevirtual game.C_100327_ib.func_102450_a(boolean, game.C_100049_vf)int
		// @165: istore #12
		// @167: aload #5
		// @169: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @16C: ifnonnull @182
		// @16F: aload #5
		// @171: getfield int game.C_100049_vf.field_104203_a
		// @174: sipush 256 (0x0100)
		// @177: iand
		// @178: iconst_m1
		// @179: ixor
		// @17A: iconst_m1
		// @17B: if_icmpeq @182
		// @17E: goto @182
		// @181: athrow
		// @182: aconst_null
		// @183: aload #5
		// @185: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @188: if_acmpne @18F
		// @18B: goto @229
		// @18E: athrow
		// @18F: aload #5
		// @191: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @194: getfield int game.C_100327_ib.field_102494_P
		// @197: iconst_m1
		// @198: ixor
		// @199: iload #12
		// @19B: iconst_m1
		// @19C: ixor
		// @19D: if_icmpeq @1A4
		// @1A0: goto @1A7
		// @1A3: athrow
		// @1A4: iconst_m1
		// @1A5: istore #12
		// @1A7: aload #5
		// @1A9: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @1AC: getfield int game.C_100327_ib.field_102497_w
		// @1AF: istore #10
		// @1B1: aload #8
		// @1B3: aload #5
		// @1B5: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @1B8: iconst_m1
		// @1B9: invokevirtual game.C_100327_ib.func_102474_m(int)java.lang.String
		// @1BC: aload #8
		// @1BE: getfield int game.C_100302_ka.field_101886_Kb
		// @1C1: iconst_2
		// @1C2: aload #8
		// @1C4: getfield int game.C_100302_ka.field_101829_Db
		// @1C7: imul
		// @1C8: isub
		// @1C9: sipush -3598 (0xF1F2)
		// @1CC: aload #8
		// @1CE: getfield game.C_100112_r game.C_100302_ka.field_101845_sb
		// @1D1: invokestatic game.C_100192_rf.func_101672_a(java.lang.String, int, int, game.C_100112_r)java.lang.String
		// @1D4: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @1D7: aload #5
		// @1D9: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @1DC: getfield int game.C_100327_ib.field_102494_P
		// @1DF: istore #13
		// @1E1: bipush -84 (0xAC)
		// @1E3: iload #13
		// @1E5: iconst_m1
		// @1E6: ixor
		// @1E7: if_icmpeq @202
		// @1EA: iconst_m1
		// @1EB: iload #10
		// @1ED: sipush 1008 (0x03F0)
		// @1F0: iand
		// @1F1: iconst_m1
		// @1F2: ixor
		// @1F3: if_icmpne @1FE
		// @1F6: goto @1FA
		// @1F9: athrow
		// @1FA: goto @202
		// @1FD: athrow
		// @1FE: iconst_1
		// @1FF: putstatic boolean game.C_100089_fa.field_103726_e
		// @202: bipush 76 (0x4C)
		// @204: iload #13
		// @206: if_icmpeq @221
		// @209: iload #13
		// @20B: iconst_m1
		// @20C: ixor
		// @20D: bipush -90 (0xA6)
		// @20F: if_icmpeq @221
		// @212: goto @216
		// @215: athrow
		// @216: iload #13
		// @218: bipush 66 (0x42)
		// @21A: if_icmpne @229
		// @21D: goto @221
		// @220: athrow
		// @221: iconst_1
		// @222: putstatic boolean game.C_100089_fa.field_103726_e
		// @225: goto @229
		// @228: athrow
		// @229: iload #11
		// @22B: ifeq @3E2
		// @22E: iload #9
		// @230: bipush 16 (0x10)
		// @232: iand
		// @233: ifgt @23E
		// @236: goto @23A
		// @239: athrow
		// @23A: goto @272
		// @23D: athrow
		// @23E: new java.lang.StringBuilder
		// @241: dup
		// @242: invokespecial java.lang.StringBuilder.<init>()void
		// @245: aload #7
		// @247: dup_x1
		// @248: getfield java.lang.String game.C_100302_ka.field_101890_ab
		// @24B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @24E: iconst_m1
		// @24F: iload #10
		// @251: bipush 16 (0x10)
		// @253: iand
		// @254: iconst_m1
		// @255: ixor
		// @256: if_icmpne @263
		// @259: getstatic java.lang.String[] game.C_100290_jm.field_106864_z
		// @25C: bipush 20 (0x14)
		// @25E: aaload
		// @25F: goto @269
		// @262: athrow
		// @263: getstatic java.lang.String[] game.C_100290_jm.field_106864_z
		// @266: bipush 14 (0x0E)
		// @268: aaload
		// @269: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @26C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @26F: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @272: iconst_m1
		// @273: iload #9
		// @275: bipush 32 (0x20)
		// @277: iand
		// @278: iconst_m1
		// @279: ixor
		// @27A: if_icmple @2B5
		// @27D: new java.lang.StringBuilder
		// @280: dup
		// @281: invokespecial java.lang.StringBuilder.<init>()void
		// @284: aload #7
		// @286: dup_x1
		// @287: getfield java.lang.String game.C_100302_ka.field_101890_ab
		// @28A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @28D: iconst_m1
		// @28E: iload #10
		// @290: bipush 32 (0x20)
		// @292: iand
		// @293: iconst_m1
		// @294: ixor
		// @295: if_icmpne @2A6
		// @298: goto @29C
		// @29B: athrow
		// @29C: getstatic java.lang.String[] game.C_100290_jm.field_106864_z
		// @29F: bipush 18 (0x12)
		// @2A1: aaload
		// @2A2: goto @2AC
		// @2A5: athrow
		// @2A6: getstatic java.lang.String[] game.C_100290_jm.field_106864_z
		// @2A9: bipush 17 (0x11)
		// @2AB: aaload
		// @2AC: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2AF: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @2B2: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @2B5: iload #9
		// @2B7: bipush 64 (0x40)
		// @2B9: iand
		// @2BA: ifle @2F5
		// @2BD: new java.lang.StringBuilder
		// @2C0: dup
		// @2C1: invokespecial java.lang.StringBuilder.<init>()void
		// @2C4: aload #7
		// @2C6: dup_x1
		// @2C7: getfield java.lang.String game.C_100302_ka.field_101890_ab
		// @2CA: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2CD: iconst_m1
		// @2CE: iload #10
		// @2D0: bipush 64 (0x40)
		// @2D2: iand
		// @2D3: iconst_m1
		// @2D4: ixor
		// @2D5: if_icmpne @2E6
		// @2D8: goto @2DC
		// @2DB: athrow
		// @2DC: getstatic java.lang.String[] game.C_100290_jm.field_106864_z
		// @2DF: bipush 12 (0x0C)
		// @2E1: aaload
		// @2E2: goto @2EC
		// @2E5: athrow
		// @2E6: getstatic java.lang.String[] game.C_100290_jm.field_106864_z
		// @2E9: bipush 10 (0x0A)
		// @2EB: aaload
		// @2EC: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2EF: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @2F2: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @2F5: sipush 128 (0x0080)
		// @2F8: iload #9
		// @2FA: iand
		// @2FB: ifle @334
		// @2FE: new java.lang.StringBuilder
		// @301: dup
		// @302: invokespecial java.lang.StringBuilder.<init>()void
		// @305: aload #7
		// @307: dup_x1
		// @308: getfield java.lang.String game.C_100302_ka.field_101890_ab
		// @30B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @30E: sipush 128 (0x0080)
		// @311: iload #10
		// @313: iand
		// @314: ifne @325
		// @317: goto @31B
		// @31A: athrow
		// @31B: getstatic java.lang.String[] game.C_100290_jm.field_106864_z
		// @31E: bipush 8 (0x08)
		// @320: aaload
		// @321: goto @32B
		// @324: athrow
		// @325: getstatic java.lang.String[] game.C_100290_jm.field_106864_z
		// @328: bipush 13 (0x0D)
		// @32A: aaload
		// @32B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @32E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @331: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @334: iconst_m1
		// @335: iload #9
		// @337: sipush 256 (0x0100)
		// @33A: iand
		// @33B: iconst_m1
		// @33C: ixor
		// @33D: if_icmple @377
		// @340: new java.lang.StringBuilder
		// @343: dup
		// @344: invokespecial java.lang.StringBuilder.<init>()void
		// @347: aload #7
		// @349: dup_x1
		// @34A: getfield java.lang.String game.C_100302_ka.field_101890_ab
		// @34D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @350: iconst_0
		// @351: sipush 256 (0x0100)
		// @354: iload #10
		// @356: iand
		// @357: if_icmpne @368
		// @35A: goto @35E
		// @35D: athrow
		// @35E: getstatic java.lang.String[] game.C_100290_jm.field_106864_z
		// @361: bipush 15 (0x0F)
		// @363: aaload
		// @364: goto @36E
		// @367: athrow
		// @368: getstatic java.lang.String[] game.C_100290_jm.field_106864_z
		// @36B: bipush 9 (0x09)
		// @36D: aaload
		// @36E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @371: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @374: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @377: iconst_0
		// @378: sipush 512 (0x0200)
		// @37B: iload #9
		// @37D: iand
		// @37E: if_icmpge @3E2
		// @381: bipush 49 (0x31)
		// @383: getstatic int[] game.C_100257_ln.field_106481_d
		// @386: bipush -106 (0x96)
		// @388: invokestatic game.C_100097_k.func_104572_a(int, int[], int)boolean
		// @38B: ifne @3AF
		// @38E: goto @392
		// @391: athrow
		// @392: getstatic int[] game.C_100257_ln.field_106481_d
		// @395: bipush -85 (0xAB)
		// @397: getstatic int[] game.C_100066_dl.field_101632_G
		// @39A: bipush 49 (0x31)
		// @39C: bipush -126 (0x82)
		// @39E: invokestatic game.C_100100_i.func_102004_l(int)boolean
		// @3A1: invokestatic game.C_100292_jk.func_101212_a(int[], byte, int[], int, boolean)boolean
		// @3A4: ifne @3AF
		// @3A7: goto @3AB
		// @3AA: athrow
		// @3AB: goto @3E2
		// @3AE: athrow
		// @3AF: new java.lang.StringBuilder
		// @3B2: dup
		// @3B3: invokespecial java.lang.StringBuilder.<init>()void
		// @3B6: aload #7
		// @3B8: dup_x1
		// @3B9: getfield java.lang.String game.C_100302_ka.field_101890_ab
		// @3BC: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3BF: iconst_0
		// @3C0: iload #10
		// @3C2: sipush 512 (0x0200)
		// @3C5: iand
		// @3C6: if_icmpne @3D3
		// @3C9: getstatic java.lang.String[] game.C_100290_jm.field_106864_z
		// @3CC: bipush 11 (0x0B)
		// @3CE: aaload
		// @3CF: goto @3D9
		// @3D2: athrow
		// @3D3: getstatic java.lang.String[] game.C_100290_jm.field_106864_z
		// @3D6: bipush 16 (0x10)
		// @3D8: aaload
		// @3D9: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3DC: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3DF: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @3E2: aload_0
		// @3E3: bipush -107 (0x95)
		// @3E5: aload #7
		// @3E7: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @3EA: aload_0
		// @3EB: getfield boolean game.C_100302_ka.field_101839_db
		// @3EE: ifeq @45C
		// @3F1: aload_0
		// @3F2: getfield int game.C_100302_ka.field_101840_Eb
		// @3F5: iconst_m1
		// @3F6: ixor
		// @3F7: getstatic int game.C_100015_wh.field_103781_g
		// @3FA: iconst_m1
		// @3FB: ixor
		// @3FC: if_icmplt @45C
		// @3FF: goto @403
		// @402: athrow
		// @403: aload_0
		// @404: getfield int game.C_100302_ka.field_101840_Eb
		// @407: aload_0
		// @408: getfield int game.C_100302_ka.field_101886_Kb
		// @40B: iadd
		// @40C: iconst_m1
		// @40D: ixor
		// @40E: getstatic int game.C_100015_wh.field_103781_g
		// @411: iconst_m1
		// @412: ixor
		// @413: if_icmpge @45C
		// @416: goto @41A
		// @419: athrow
		// @41A: iload_2
		// @41B: aload_0
		// @41C: getfield int game.C_100302_ka.field_101835_xb
		// @41F: iadd
		// @420: getstatic int game.C_100338_jc.field_105370_l
		// @423: if_icmpgt @45C
		// @426: goto @42A
		// @429: athrow
		// @42A: iload_2
		// @42B: aload_0
		// @42C: getfield int game.C_100302_ka.field_101835_xb
		// @42F: iadd
		// @430: bipush -32 (0xE0)
		// @432: isub
		// @433: iconst_m1
		// @434: ixor
		// @435: getstatic int game.C_100338_jc.field_105370_l
		// @438: iconst_m1
		// @439: ixor
		// @43A: if_icmpge @45C
		// @43D: goto @441
		// @440: athrow
		// @441: getstatic game.C_100327_ib game.C_100197_ra.field_100861_k
		// @444: ifnull @44F
		// @447: goto @44B
		// @44A: athrow
		// @44B: goto @457
		// @44E: athrow
		// @44F: aload #7
		// @451: getstatic game.C_100037_wb[] game.C_100316_lc.field_102411_v
		// @454: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @457: aload #5
		// @459: putstatic game.C_100049_vf game.C_100013_fn.field_103742_c
		// @45C: iconst_m1
		// @45D: iload #12
		// @45F: iconst_m1
		// @460: ixor
		// @461: if_icmpge @468
		// @464: goto @4A8
		// @467: athrow
		// @468: new game.C_100302_ka
		// @46B: dup
		// @46C: ldc ""
		// @46E: getstatic game.C_100302_ka game.C_100132_td.field_104976_a
		// @471: invokespecial game.C_100302_ka.<init>(java.lang.String, game.C_100302_ka)void
		// @474: astore #13
		// @476: aload #13
		// @478: getstatic java.lang.String game.C_100064_ve.field_103016_u
		// @47B: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @47E: aload #13
		// @480: iconst_2
		// @481: bipush 10 (0x0A)
		// @483: iconst_m1
		// @484: iconst_2
		// @485: bipush 10 (0x0A)
		// @487: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @48A: aload #13
		// @48C: ldc 65535 (0xffff)
		// @48E: putfield int game.C_100302_ka.field_101830_gb
		// @491: aload #13
		// @493: aconst_null
		// @494: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @497: aload #13
		// @499: getstatic game.C_100317_lb game.C_100311_le.field_104719_A
		// @49C: putfield game.C_100112_r game.C_100302_ka.field_101845_sb
		// @49F: aload #7
		// @4A1: bipush -121 (0x87)
		// @4A3: aload #13
		// @4A5: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @4A8: aload_0
		// @4A9: getfield int game.C_100302_ka.field_101840_Eb
		// @4AC: istore #13
		// @4AE: iload_2
		// @4AF: aload_0
		// @4B0: getfield int game.C_100302_ka.field_101835_xb
		// @4B3: bipush 16 (0x10)
		// @4B5: iadd
		// @4B6: iadd
		// @4B7: istore #14
		// @4B9: aload #5
		// @4BB: getfield int game.C_100049_vf.field_104202_c
		// @4BE: iload #13
		// @4C0: ineg
		// @4C1: isub
		// @4C2: iconst_2
		// @4C3: idiv
		// @4C4: istore #15
		// @4C6: ldc 4473924 (0x444444)
		// @4C8: istore #16
		// @4CA: sipush 376 (0x0178)
		// @4CD: istore #17
		// @4CF: bipush 84 (0x54)
		// @4D1: istore #18
		// @4D3: iinc #2 +36
		// @4D6: iload #17
		// @4D8: iconst_m1
		// @4D9: ixor
		// @4DA: iload #14
		// @4DC: iconst_m1
		// @4DD: ixor
		// @4DE: if_icmpgt @524
		// @4E1: iload #18
		// @4E3: iload #14
		// @4E5: if_icmple @4F0
		// @4E8: goto @4EC
		// @4EB: athrow
		// @4EC: goto @524
		// @4EF: athrow
		// @4F0: iload #15
		// @4F2: iload #14
		// @4F4: iload #13
		// @4F6: iload #14
		// @4F8: iload #16
		// @4FA: sipush 128 (0x0080)
		// @4FD: invokestatic game.C_100196_rb.func_105785_e(int, int, int, int, int, int)void
		// @500: iconst_3
		// @501: aload #5
		// @503: getfield int game.C_100049_vf.field_104202_c
		// @506: imul
		// @507: iload #15
		// @509: iadd
		// @50A: iconst_4
		// @50B: idiv
		// @50C: iconst_3
		// @50D: aload #5
		// @50F: getfield int game.C_100049_vf.field_104216_s
		// @512: imul
		// @513: iload #14
		// @515: iadd
		// @516: iconst_4
		// @517: idiv
		// @518: iload #15
		// @51A: iload #14
		// @51C: iload #16
		// @51E: sipush 128 (0x0080)
		// @521: invokestatic game.C_100196_rb.func_105785_e(int, int, int, int, int, int)void
		// @524: iinc #6 +1
		// @527: iload #19
		// @529: ifeq @052
		// @52C: iload_1
		// @52D: ifeq @53D
		// @530: aconst_null
		// @531: checkcast game.C_100302_ka
		// @534: iconst_0
		// @535: invokestatic game.C_100290_jm.func_106848_a(game.C_100302_ka, boolean)int
		// @538: pop
		// @539: goto @53D
		// @53C: athrow
		// @53D: iload_2
		// @53E: ireturn
		// @53F: astore_2
		// @540: aload_2
		// @541: new java.lang.StringBuilder
		// @544: dup
		// @545: invokespecial java.lang.StringBuilder.<init>()void
		// @548: getstatic java.lang.String[] game.C_100290_jm.field_106864_z
		// @54B: bipush 19 (0x13)
		// @54D: aaload
		// @54E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @551: aload_0
		// @552: ifnull @55E
		// @555: getstatic java.lang.String[] game.C_100290_jm.field_106864_z
		// @558: iconst_0
		// @559: aaload
		// @55A: goto @563
		// @55D: athrow
		// @55E: getstatic java.lang.String[] game.C_100290_jm.field_106864_z
		// @561: iconst_1
		// @562: aaload
		// @563: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @566: bipush 44 (0x2C)
		// @568: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @56B: iload_1
		// @56C: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @56F: bipush 41 (0x29)
		// @571: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @574: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @577: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @57A: athrow
	}
	
	static final void func_106850_a(int arg0, int arg1, int arg2, int arg3)
	{
		// @00: iconst_0
		// @01: iload_0
		// @02: if_icmpne @21
		// @05: getstatic int game.C_100053_vn.field_102830_fb
		// @08: iload_2
		// @09: if_icmpne @14
		// @0C: goto @10
		// @0F: athrow
		// @10: goto @21
		// @13: athrow
		// @14: iload_2
		// @15: putstatic int game.C_100053_vn.field_102830_fb
		// @18: iconst_1
		// @19: putstatic boolean game.C_100101_fc.field_103396_T
		// @1C: iload_3
		// @1D: iconst_m1
		// @1E: invokestatic game.C_100094_j.func_104544_a(int, int)void
		// @21: bipush -85 (0xAB)
		// @23: iload_1
		// @24: bipush -82 (0xAE)
		// @26: isub
		// @27: bipush 43 (0x2B)
		// @29: idiv
		// @2A: idiv
		// @2B: istore #4
		// @2D: iload_0
		// @2E: iconst_m1
		// @2F: ixor
		// @30: bipush -2 (0xFE)
		// @32: if_icmpne @55
		// @35: getstatic int game.C_100220_ac.field_106065_i
		// @38: iconst_m1
		// @39: ixor
		// @3A: iload_2
		// @3B: iconst_m1
		// @3C: ixor
		// @3D: if_icmpne @48
		// @40: goto @44
		// @43: athrow
		// @44: goto @55
		// @47: athrow
		// @48: iload_2
		// @49: putstatic int game.C_100220_ac.field_106065_i
		// @4C: iconst_1
		// @4D: putstatic boolean game.C_100101_fc.field_103396_T
		// @50: iload_3
		// @51: iconst_m1
		// @52: invokestatic game.C_100094_j.func_104544_a(int, int)void
		// @55: bipush -3 (0xFD)
		// @57: iload_0
		// @58: iconst_m1
		// @59: ixor
		// @5A: if_icmpne @79
		// @5D: iload_2
		// @5E: getstatic int game.C_100162_sc.field_102860_Q
		// @61: if_icmpne @6C
		// @64: goto @68
		// @67: athrow
		// @68: goto @79
		// @6B: athrow
		// @6C: iconst_1
		// @6D: putstatic boolean game.C_100101_fc.field_103396_T
		// @70: iload_2
		// @71: putstatic int game.C_100162_sc.field_102860_Q
		// @74: iload_3
		// @75: iconst_m1
		// @76: invokestatic game.C_100094_j.func_104544_a(int, int)void
		// @79: goto @BB
		// @7C: astore #4
		// @7E: aload #4
		// @80: new java.lang.StringBuilder
		// @83: dup
		// @84: invokespecial java.lang.StringBuilder.<init>()void
		// @87: getstatic java.lang.String[] game.C_100290_jm.field_106864_z
		// @8A: bipush 6 (0x06)
		// @8C: aaload
		// @8D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @90: iload_0
		// @91: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @94: bipush 44 (0x2C)
		// @96: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @99: iload_1
		// @9A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @9D: bipush 44 (0x2C)
		// @9F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A2: iload_2
		// @A3: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A6: bipush 44 (0x2C)
		// @A8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @AB: iload_3
		// @AC: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @AF: bipush 41 (0x29)
		// @B1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B4: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @B7: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @BA: athrow
		// @BB: return
	}
	
	final int func_106847_a(byte[] arg0, int arg1, byte arg2, int arg3, byte[] arg4, int arg5)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #11
		// @005: iload_3
		// @006: bipush -40 (0xD8)
		// @008: if_icmpeq @01C
		// @00B: bipush -21 (0xEB)
		// @00D: aconst_null
		// @00E: checkcast java.applet.Applet
		// @011: aconst_null
		// @012: checkcast java.lang.String
		// @015: invokestatic game.C_100290_jm.func_106849_a(byte, java.applet.Applet, java.lang.String)void
		// @018: goto @01C
		// @01B: athrow
		// @01C: iconst_0
		// @01D: iload #4
		// @01F: if_icmpne @024
		// @022: iconst_0
		// @023: ireturn
		// @024: iload #4
		// @026: iload_2
		// @027: iadd
		// @028: istore #4
		// @02A: iconst_0
		// @02B: istore #7
		// @02D: iload #6
		// @02F: istore #8
		// @031: aload #5
		// @033: iload #8
		// @035: baload
		// @036: istore #9
		// @038: iconst_m1
		// @039: iload #9
		// @03B: iconst_m1
		// @03C: ixor
		// @03D: if_icmpge @057
		// @040: aload_0
		// @041: getfield int[] game.C_100290_jm.field_106858_d
		// @044: iload #7
		// @046: iaload
		// @047: istore #7
		// @049: iload #11
		// @04B: ifne @05E
		// @04E: iload #11
		// @050: ifeq @05E
		// @053: goto @057
		// @056: athrow
		// @057: iinc #7 +1
		// @05A: goto @05E
		// @05D: athrow
		// @05E: aload_0
		// @05F: getfield int[] game.C_100290_jm.field_106858_d
		// @062: iload #7
		// @064: iaload
		// @065: dup
		// @066: istore #10
		// @068: iconst_m1
		// @069: ixor
		// @06A: iconst_m1
		// @06B: if_icmple @08A
		// @06E: aload_1
		// @06F: iload_2
		// @070: iinc #2 +1
		// @073: iload #10
		// @075: iconst_m1
		// @076: ixor
		// @077: i2b
		// @078: bastore
		// @079: iload #4
		// @07B: iconst_m1
		// @07C: ixor
		// @07D: iload_2
		// @07E: iconst_m1
		// @07F: ixor
		// @080: if_icmpge @2A7
		// @083: goto @087
		// @086: athrow
		// @087: iconst_0
		// @088: istore #7
		// @08A: bipush 64 (0x40)
		// @08C: iload #9
		// @08E: iand
		// @08F: ifne @09E
		// @092: iinc #7 +1
		// @095: iload #11
		// @097: ifeq @0A7
		// @09A: goto @09E
		// @09D: athrow
		// @09E: aload_0
		// @09F: getfield int[] game.C_100290_jm.field_106858_d
		// @0A2: iload #7
		// @0A4: iaload
		// @0A5: istore #7
		// @0A7: aload_0
		// @0A8: getfield int[] game.C_100290_jm.field_106858_d
		// @0AB: iload #7
		// @0AD: iaload
		// @0AE: dup
		// @0AF: istore #10
		// @0B1: ifge @0D5
		// @0B4: aload_1
		// @0B5: iload_2
		// @0B6: iinc #2 +1
		// @0B9: iload #10
		// @0BB: iconst_m1
		// @0BC: ixor
		// @0BD: i2b
		// @0BE: bastore
		// @0BF: iload #4
		// @0C1: iload_2
		// @0C2: if_icmpgt @0D2
		// @0C5: goto @0C9
		// @0C8: athrow
		// @0C9: iload #11
		// @0CB: ifeq @2A7
		// @0CE: goto @0D2
		// @0D1: athrow
		// @0D2: iconst_0
		// @0D3: istore #7
		// @0D5: iconst_0
		// @0D6: bipush 32 (0x20)
		// @0D8: iload #9
		// @0DA: iand
		// @0DB: if_icmpeq @0EC
		// @0DE: aload_0
		// @0DF: getfield int[] game.C_100290_jm.field_106858_d
		// @0E2: iload #7
		// @0E4: iaload
		// @0E5: istore #7
		// @0E7: iload #11
		// @0E9: ifeq @0F3
		// @0EC: iinc #7 +1
		// @0EF: goto @0F3
		// @0F2: athrow
		// @0F3: aload_0
		// @0F4: getfield int[] game.C_100290_jm.field_106858_d
		// @0F7: iload #7
		// @0F9: iaload
		// @0FA: dup
		// @0FB: istore #10
		// @0FD: ifge @11C
		// @100: aload_1
		// @101: iload_2
		// @102: iinc #2 +1
		// @105: iload #10
		// @107: iconst_m1
		// @108: ixor
		// @109: i2b
		// @10A: bastore
		// @10B: iload_2
		// @10C: iconst_m1
		// @10D: ixor
		// @10E: iload #4
		// @110: iconst_m1
		// @111: ixor
		// @112: if_icmple @2A7
		// @115: goto @119
		// @118: athrow
		// @119: iconst_0
		// @11A: istore #7
		// @11C: bipush 16 (0x10)
		// @11E: iload #9
		// @120: iand
		// @121: iconst_m1
		// @122: ixor
		// @123: iconst_m1
		// @124: if_icmpeq @135
		// @127: aload_0
		// @128: getfield int[] game.C_100290_jm.field_106858_d
		// @12B: iload #7
		// @12D: iaload
		// @12E: istore #7
		// @130: iload #11
		// @132: ifeq @13C
		// @135: iinc #7 +1
		// @138: goto @13C
		// @13B: athrow
		// @13C: aload_0
		// @13D: getfield int[] game.C_100290_jm.field_106858_d
		// @140: iload #7
		// @142: iaload
		// @143: dup
		// @144: istore #10
		// @146: iconst_m1
		// @147: ixor
		// @148: iconst_m1
		// @149: if_icmpgt @150
		// @14C: goto @168
		// @14F: athrow
		// @150: aload_1
		// @151: iload_2
		// @152: iinc #2 +1
		// @155: iload #10
		// @157: iconst_m1
		// @158: ixor
		// @159: i2b
		// @15A: bastore
		// @15B: iload_2
		// @15C: iconst_m1
		// @15D: ixor
		// @15E: iload #4
		// @160: iconst_m1
		// @161: ixor
		// @162: if_icmple @2A7
		// @165: iconst_0
		// @166: istore #7
		// @168: iconst_m1
		// @169: bipush 8 (0x08)
		// @16B: iload #9
		// @16D: iand
		// @16E: iconst_m1
		// @16F: ixor
		// @170: if_icmpeq @181
		// @173: aload_0
		// @174: getfield int[] game.C_100290_jm.field_106858_d
		// @177: iload #7
		// @179: iaload
		// @17A: istore #7
		// @17C: iload #11
		// @17E: ifeq @188
		// @181: iinc #7 +1
		// @184: goto @188
		// @187: athrow
		// @188: iconst_0
		// @189: aload_0
		// @18A: getfield int[] game.C_100290_jm.field_106858_d
		// @18D: iload #7
		// @18F: iaload
		// @190: dup
		// @191: istore #10
		// @193: if_icmpgt @199
		// @196: goto @1B1
		// @199: aload_1
		// @19A: iload_2
		// @19B: iinc #2 +1
		// @19E: iload #10
		// @1A0: iconst_m1
		// @1A1: ixor
		// @1A2: i2b
		// @1A3: bastore
		// @1A4: iload_2
		// @1A5: iconst_m1
		// @1A6: ixor
		// @1A7: iload #4
		// @1A9: iconst_m1
		// @1AA: ixor
		// @1AB: if_icmple @2A7
		// @1AE: iconst_0
		// @1AF: istore #7
		// @1B1: iconst_m1
		// @1B2: iconst_4
		// @1B3: iload #9
		// @1B5: iand
		// @1B6: iconst_m1
		// @1B7: ixor
		// @1B8: if_icmpne @1C7
		// @1BB: iinc #7 +1
		// @1BE: iload #11
		// @1C0: ifeq @1D0
		// @1C3: goto @1C7
		// @1C6: athrow
		// @1C7: aload_0
		// @1C8: getfield int[] game.C_100290_jm.field_106858_d
		// @1CB: iload #7
		// @1CD: iaload
		// @1CE: istore #7
		// @1D0: aload_0
		// @1D1: getfield int[] game.C_100290_jm.field_106858_d
		// @1D4: iload #7
		// @1D6: iaload
		// @1D7: dup
		// @1D8: istore #10
		// @1DA: iflt @1E0
		// @1DD: goto @1FD
		// @1E0: aload_1
		// @1E1: iload_2
		// @1E2: iinc #2 +1
		// @1E5: iload #10
		// @1E7: iconst_m1
		// @1E8: ixor
		// @1E9: i2b
		// @1EA: bastore
		// @1EB: iload #4
		// @1ED: iload_2
		// @1EE: if_icmpgt @1FA
		// @1F1: iload #11
		// @1F3: ifeq @2A7
		// @1F6: goto @1FA
		// @1F9: athrow
		// @1FA: iconst_0
		// @1FB: istore #7
		// @1FD: iconst_2
		// @1FE: iload #9
		// @200: iand
		// @201: ifne @210
		// @204: iinc #7 +1
		// @207: iload #11
		// @209: ifeq @219
		// @20C: goto @210
		// @20F: athrow
		// @210: aload_0
		// @211: getfield int[] game.C_100290_jm.field_106858_d
		// @214: iload #7
		// @216: iaload
		// @217: istore #7
		// @219: aload_0
		// @21A: getfield int[] game.C_100290_jm.field_106858_d
		// @21D: iload #7
		// @21F: iaload
		// @220: dup
		// @221: istore #10
		// @223: ifge @24B
		// @226: aload_1
		// @227: iload_2
		// @228: iinc #2 +1
		// @22B: iload #10
		// @22D: iconst_m1
		// @22E: ixor
		// @22F: i2b
		// @230: bastore
		// @231: iload #4
		// @233: iconst_m1
		// @234: ixor
		// @235: iload_2
		// @236: iconst_m1
		// @237: ixor
		// @238: if_icmplt @248
		// @23B: goto @23F
		// @23E: athrow
		// @23F: iload #11
		// @241: ifeq @2A7
		// @244: goto @248
		// @247: athrow
		// @248: iconst_0
		// @249: istore #7
		// @24B: iconst_1
		// @24C: iload #9
		// @24E: iand
		// @24F: iconst_m1
		// @250: ixor
		// @251: iconst_m1
		// @252: if_icmpeq @263
		// @255: aload_0
		// @256: getfield int[] game.C_100290_jm.field_106858_d
		// @259: iload #7
		// @25B: iaload
		// @25C: istore #7
		// @25E: iload #11
		// @260: ifeq @26A
		// @263: iinc #7 +1
		// @266: goto @26A
		// @269: athrow
		// @26A: iconst_m1
		// @26B: aload_0
		// @26C: getfield int[] game.C_100290_jm.field_106858_d
		// @26F: iload #7
		// @271: iaload
		// @272: dup
		// @273: istore #10
		// @275: iconst_m1
		// @276: ixor
		// @277: if_icmplt @27E
		// @27A: goto @29F
		// @27D: athrow
		// @27E: aload_1
		// @27F: iload_2
		// @280: iinc #2 +1
		// @283: iload #10
		// @285: iconst_m1
		// @286: ixor
		// @287: i2b
		// @288: bastore
		// @289: iload #4
		// @28B: iconst_m1
		// @28C: ixor
		// @28D: iload_2
		// @28E: iconst_m1
		// @28F: ixor
		// @290: if_icmplt @29C
		// @293: iload #11
		// @295: ifeq @2A7
		// @298: goto @29C
		// @29B: athrow
		// @29C: iconst_0
		// @29D: istore #7
		// @29F: iinc #8 +1
		// @2A2: iload #11
		// @2A4: ifeq @031
		// @2A7: iload #8
		// @2A9: iconst_1
		// @2AA: iload #6
		// @2AC: ineg
		// @2AD: iadd
		// @2AE: iadd
		// @2AF: ireturn
		// @2B0: astore #7
		// @2B2: aload #7
		// @2B4: new java.lang.StringBuilder
		// @2B7: dup
		// @2B8: invokespecial java.lang.StringBuilder.<init>()void
		// @2BB: getstatic java.lang.String[] game.C_100290_jm.field_106864_z
		// @2BE: iconst_5
		// @2BF: aaload
		// @2C0: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2C3: aload_1
		// @2C4: ifnull @2D0
		// @2C7: getstatic java.lang.String[] game.C_100290_jm.field_106864_z
		// @2CA: iconst_0
		// @2CB: aaload
		// @2CC: goto @2D5
		// @2CF: athrow
		// @2D0: getstatic java.lang.String[] game.C_100290_jm.field_106864_z
		// @2D3: iconst_1
		// @2D4: aaload
		// @2D5: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2D8: bipush 44 (0x2C)
		// @2DA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2DD: iload_2
		// @2DE: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2E1: bipush 44 (0x2C)
		// @2E3: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2E6: iload_3
		// @2E7: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2EA: bipush 44 (0x2C)
		// @2EC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2EF: iload #4
		// @2F1: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2F4: bipush 44 (0x2C)
		// @2F6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2F9: aload #5
		// @2FB: ifnull @307
		// @2FE: getstatic java.lang.String[] game.C_100290_jm.field_106864_z
		// @301: iconst_0
		// @302: aaload
		// @303: goto @30C
		// @306: athrow
		// @307: getstatic java.lang.String[] game.C_100290_jm.field_106864_z
		// @30A: iconst_1
		// @30B: aaload
		// @30C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @30F: bipush 44 (0x2C)
		// @311: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @314: iload #6
		// @316: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @319: bipush 41 (0x29)
		// @31B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @31E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @321: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @324: athrow
	}
	
	final int func_106855_a(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #15
		// @005: iconst_0
		// @006: istore #7
		// @008: iload #5
		// @00A: bipush 7 (0x07)
		// @00C: if_icmpeq @019
		// @00F: ldc2_w 36
		// @012: putstatic long game.C_100290_jm.field_106867_i
		// @015: goto @019
		// @018: athrow
		// @019: iload_2
		// @01A: ldc -1119735389 (0xbd4231a3)
		// @01C: ishl
		// @01D: istore #8
		// @01F: iload #4
		// @021: iload #6
		// @023: iadd
		// @024: istore #4
		// @026: iload #6
		// @028: iconst_m1
		// @029: ixor
		// @02A: iload #4
		// @02C: iconst_m1
		// @02D: ixor
		// @02E: if_icmple @153
		// @031: aload_1
		// @032: iload #6
		// @034: baload
		// @035: sipush 255 (0x00FF)
		// @038: iand
		// @039: istore #9
		// @03B: aload_0
		// @03C: getfield int[] game.C_100290_jm.field_106859_e
		// @03F: iload #9
		// @041: iaload
		// @042: istore #10
		// @044: aload_0
		// @045: getfield byte[] game.C_100290_jm.field_106862_a
		// @048: iload #9
		// @04A: baload
		// @04B: istore #11
		// @04D: iconst_m1
		// @04E: iload #11
		// @050: iconst_m1
		// @051: ixor
		// @052: iload #15
		// @054: ifne @15D
		// @057: if_icmpne @07B
		// @05A: goto @05E
		// @05D: athrow
		// @05E: new java.lang.RuntimeException
		// @061: dup
		// @062: new java.lang.StringBuilder
		// @065: dup
		// @066: invokespecial java.lang.StringBuilder.<init>()void
		// @069: ldc ""
		// @06B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @06E: iload #9
		// @070: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @073: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @076: invokespecial java.lang.RuntimeException.<init>(java.lang.String)void
		// @079: athrow
		// @07A: athrow
		// @07B: iload #8
		// @07D: ldc -1030908253 (0xc28d96a3)
		// @07F: ishr
		// @080: istore #12
		// @082: iload #8
		// @084: bipush 7 (0x07)
		// @086: iand
		// @087: istore #13
		// @089: iload #7
		// @08B: iload #13
		// @08D: ineg
		// @08E: ldc 84636863 (0x50b74bf)
		// @090: ishr
		// @091: iand
		// @092: istore #7
		// @094: iconst_m1
		// @095: iload #11
		// @097: iload #13
		// @099: iadd
		// @09A: iadd
		// @09B: ldc -295549885 (0xee624443)
		// @09D: ishr
		// @09E: iload #12
		// @0A0: iadd
		// @0A1: istore #14
		// @0A3: iinc #13 +24
		// @0A6: aload_3
		// @0A7: iload #12
		// @0A9: iload #7
		// @0AB: iload #10
		// @0AD: iload #13
		// @0AF: iushr
		// @0B0: invokestatic game.C_100116_ei.func_104117_a(int, int)int
		// @0B3: dup
		// @0B4: istore #7
		// @0B6: i2b
		// @0B7: bastore
		// @0B8: iload #12
		// @0BA: iload #14
		// @0BC: if_icmpge @144
		// @0BF: iinc #12 +1
		// @0C2: iinc #13 +248
		// @0C5: aload_3
		// @0C6: iload #12
		// @0C8: iload #10
		// @0CA: iload #13
		// @0CC: iushr
		// @0CD: dup
		// @0CE: istore #7
		// @0D0: i2b
		// @0D1: bastore
		// @0D2: iload #12
		// @0D4: iconst_m1
		// @0D5: ixor
		// @0D6: iload #14
		// @0D8: iconst_m1
		// @0D9: ixor
		// @0DA: if_icmpgt @0E6
		// @0DD: iload #15
		// @0DF: ifeq @144
		// @0E2: goto @0E6
		// @0E5: athrow
		// @0E6: iinc #12 +1
		// @0E9: iinc #13 +248
		// @0EC: aload_3
		// @0ED: iload #12
		// @0EF: iload #10
		// @0F1: iload #13
		// @0F3: iushr
		// @0F4: dup
		// @0F5: istore #7
		// @0F7: i2b
		// @0F8: bastore
		// @0F9: iload #14
		// @0FB: iconst_m1
		// @0FC: ixor
		// @0FD: iload #12
		// @0FF: iconst_m1
		// @100: ixor
		// @101: if_icmplt @10D
		// @104: iload #15
		// @106: ifeq @144
		// @109: goto @10D
		// @10C: athrow
		// @10D: iinc #13 +248
		// @110: iinc #12 +1
		// @113: aload_3
		// @114: iload #12
		// @116: iload #10
		// @118: iload #13
		// @11A: iushr
		// @11B: dup
		// @11C: istore #7
		// @11E: i2b
		// @11F: bastore
		// @120: iload #14
		// @122: iload #12
		// @124: if_icmpgt @130
		// @127: iload #15
		// @129: ifeq @144
		// @12C: goto @130
		// @12F: athrow
		// @130: iinc #12 +1
		// @133: iinc #13 +248
		// @136: aload_3
		// @137: iload #12
		// @139: iload #10
		// @13B: iload #13
		// @13D: ineg
		// @13E: ishl
		// @13F: dup
		// @140: istore #7
		// @142: i2b
		// @143: bastore
		// @144: iload #8
		// @146: iload #11
		// @148: iadd
		// @149: istore #8
		// @14B: iinc #6 +1
		// @14E: iload #15
		// @150: ifeq @026
		// @153: iload_2
		// @154: ineg
		// @155: bipush 7 (0x07)
		// @157: iload #8
		// @159: iadd
		// @15A: ldc 1869714499 (0x6f719443)
		// @15C: ishr
		// @15D: iadd
		// @15E: ireturn
		// @15F: astore #7
		// @161: aload #7
		// @163: new java.lang.StringBuilder
		// @166: dup
		// @167: invokespecial java.lang.StringBuilder.<init>()void
		// @16A: getstatic java.lang.String[] game.C_100290_jm.field_106864_z
		// @16D: bipush 7 (0x07)
		// @16F: aaload
		// @170: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @173: aload_1
		// @174: ifnull @180
		// @177: getstatic java.lang.String[] game.C_100290_jm.field_106864_z
		// @17A: iconst_0
		// @17B: aaload
		// @17C: goto @185
		// @17F: athrow
		// @180: getstatic java.lang.String[] game.C_100290_jm.field_106864_z
		// @183: iconst_1
		// @184: aaload
		// @185: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @188: bipush 44 (0x2C)
		// @18A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @18D: iload_2
		// @18E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @191: bipush 44 (0x2C)
		// @193: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @196: aload_3
		// @197: ifnull @1A3
		// @19A: getstatic java.lang.String[] game.C_100290_jm.field_106864_z
		// @19D: iconst_0
		// @19E: aaload
		// @19F: goto @1A8
		// @1A2: athrow
		// @1A3: getstatic java.lang.String[] game.C_100290_jm.field_106864_z
		// @1A6: iconst_1
		// @1A7: aaload
		// @1A8: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1AB: bipush 44 (0x2C)
		// @1AD: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1B0: iload #4
		// @1B2: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1B5: bipush 44 (0x2C)
		// @1B7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1BA: iload #5
		// @1BC: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1BF: bipush 44 (0x2C)
		// @1C1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1C4: iload #6
		// @1C6: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1C9: bipush 41 (0x29)
		// @1CB: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1CE: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @1D1: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @1D4: athrow
	}
	
	static final void func_106849_a(byte arg0, Applet arg1, String arg2)
	{
		// @00: new java.net.URL
		// @03: dup
		// @04: aload_1
		// @05: invokevirtual java.applet.Applet.getCodeBase()java.net.URL
		// @08: aload_2
		// @09: invokespecial java.net.URL.<init>(java.net.URL, java.lang.String)void
		// @0C: astore_3
		// @0D: iconst_m1
		// @0E: aload_3
		// @0F: aload_1
		// @10: invokestatic game.C_100244_pe.func_106368_a(int, java.net.URL, java.applet.Applet)java.net.URL
		// @13: astore_3
		// @14: iload_0
		// @15: bipush -3 (0xFD)
		// @17: if_icmplt @23
		// @1A: bipush 37 (0x25)
		// @1C: invokestatic game.C_100290_jm.func_106851_a(int)void
		// @1F: goto @23
		// @22: athrow
		// @23: sipush -17250 (0xBC9E)
		// @26: aload_1
		// @27: aload_3
		// @28: invokevirtual java.net.URL.toString()java.lang.String
		// @2B: iconst_1
		// @2C: invokestatic game.C_100222_aa.func_106079_a(int, java.applet.Applet, java.lang.String, boolean)void
		// @2F: goto @37
		// @32: astore_3
		// @33: aload_3
		// @34: invokevirtual java.lang.Exception.printStackTrace()void
		// @37: goto @8F
		// @3A: astore_3
		// @3B: aload_3
		// @3C: new java.lang.StringBuilder
		// @3F: dup
		// @40: invokespecial java.lang.StringBuilder.<init>()void
		// @43: getstatic java.lang.String[] game.C_100290_jm.field_106864_z
		// @46: iconst_4
		// @47: aaload
		// @48: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4B: iload_0
		// @4C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4F: bipush 44 (0x2C)
		// @51: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @54: aload_1
		// @55: ifnull @61
		// @58: getstatic java.lang.String[] game.C_100290_jm.field_106864_z
		// @5B: iconst_0
		// @5C: aaload
		// @5D: goto @66
		// @60: athrow
		// @61: getstatic java.lang.String[] game.C_100290_jm.field_106864_z
		// @64: iconst_1
		// @65: aaload
		// @66: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @69: bipush 44 (0x2C)
		// @6B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6E: aload_2
		// @6F: ifnull @7B
		// @72: getstatic java.lang.String[] game.C_100290_jm.field_106864_z
		// @75: iconst_0
		// @76: aaload
		// @77: goto @80
		// @7A: athrow
		// @7B: getstatic java.lang.String[] game.C_100290_jm.field_106864_z
		// @7E: iconst_1
		// @7F: aaload
		// @80: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @83: bipush 41 (0x29)
		// @85: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @88: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @8B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @8E: athrow
		// @8F: return
	}
	
	public static void func_106851_a(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic int[] game.C_100290_jm.field_106863_j
		// @04: aconst_null
		// @05: putstatic java.lang.String game.C_100290_jm.field_106861_c
		// @08: aconst_null
		// @09: putstatic game.C_100268_mk game.C_100290_jm.field_106856_f
		// @0C: iload_0
		// @0D: bipush 16 (0x10)
		// @0F: if_icmpeq @23
		// @12: bipush 10 (0x0A)
		// @14: aconst_null
		// @15: checkcast java.applet.Applet
		// @18: aconst_null
		// @19: checkcast java.lang.String
		// @1C: invokestatic game.C_100290_jm.func_106849_a(byte, java.applet.Applet, java.lang.String)void
		// @1F: goto @23
		// @22: athrow
		// @23: aconst_null
		// @24: putstatic java.lang.String game.C_100290_jm.field_106857_g
		// @27: aconst_null
		// @28: putstatic game.C_100153_be[] game.C_100290_jm.field_106865_k
		// @2B: aconst_null
		// @2C: putstatic java.lang.String game.C_100290_jm.field_106866_h
		// @2F: goto @54
		// @32: astore_1
		// @33: aload_1
		// @34: new java.lang.StringBuilder
		// @37: dup
		// @38: invokespecial java.lang.StringBuilder.<init>()void
		// @3B: getstatic java.lang.String[] game.C_100290_jm.field_106864_z
		// @3E: bipush 21 (0x15)
		// @40: aaload
		// @41: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @44: iload_0
		// @45: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @48: bipush 41 (0x29)
		// @4A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @50: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @53: athrow
		// @54: return
	}
	
	C_100290_jm(byte[] arg0)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #15
		// @005: aload_0
		// @006: invokespecial java.lang.Object.<init>()void
		// @009: aload_1
		// @00A: arraylength
		// @00B: istore_2
		// @00C: aload_0
		// @00D: iload_2
		// @00E: newarray int[]
		// @010: putfield int[] game.C_100290_jm.field_106859_e
		// @013: aload_0
		// @014: aload_1
		// @015: putfield byte[] game.C_100290_jm.field_106862_a
		// @018: aload_0
		// @019: bipush 8 (0x08)
		// @01B: newarray int[]
		// @01D: putfield int[] game.C_100290_jm.field_106858_d
		// @020: bipush 33 (0x21)
		// @022: newarray int[]
		// @024: astore_3
		// @025: iconst_0
		// @026: istore #4
		// @028: iconst_0
		// @029: istore #5
		// @02B: iload #5
		// @02D: iload_2
		// @02E: if_icmpge @1FD
		// @031: aload_1
		// @032: iload #5
		// @034: baload
		// @035: istore #6
		// @037: iload #15
		// @039: ifne @232
		// @03C: iload #6
		// @03E: iconst_m1
		// @03F: ixor
		// @040: iconst_m1
		// @041: if_icmpeq @1F5
		// @044: goto @048
		// @047: athrow
		// @048: iconst_1
		// @049: bipush 32 (0x20)
		// @04B: iload #6
		// @04D: ineg
		// @04E: iadd
		// @04F: ishl
		// @050: istore #7
		// @052: aload_3
		// @053: iload #6
		// @055: iaload
		// @056: istore #8
		// @058: aload_0
		// @059: getfield int[] game.C_100290_jm.field_106859_e
		// @05C: iload #5
		// @05E: iload #8
		// @060: iastore
		// @061: iload #7
		// @063: iload #8
		// @065: iand
		// @066: iconst_m1
		// @067: ixor
		// @068: iconst_m1
		// @069: if_icmpne @0E0
		// @06C: iconst_m1
		// @06D: iload #6
		// @06F: iadd
		// @070: istore #10
		// @072: bipush -2 (0xFE)
		// @074: iload #10
		// @076: iconst_m1
		// @077: ixor
		// @078: if_icmplt @0D4
		// @07B: aload_3
		// @07C: iload #10
		// @07E: iaload
		// @07F: istore #11
		// @081: iload #8
		// @083: iconst_m1
		// @084: ixor
		// @085: iload #11
		// @087: iconst_m1
		// @088: ixor
		// @089: iload #15
		// @08B: ifne @0D8
		// @08E: if_icmpne @0D4
		// @091: goto @095
		// @094: athrow
		// @095: iconst_1
		// @096: iload #10
		// @098: ineg
		// @099: bipush 32 (0x20)
		// @09B: iadd
		// @09C: ishl
		// @09D: istore #12
		// @09F: iload #12
		// @0A1: iload #11
		// @0A3: iand
		// @0A4: iconst_m1
		// @0A5: ixor
		// @0A6: iconst_m1
		// @0A7: if_icmpeq @0BD
		// @0AA: aload_3
		// @0AB: iload #10
		// @0AD: aload_3
		// @0AE: iload #10
		// @0B0: iconst_1
		// @0B1: isub
		// @0B2: iaload
		// @0B3: iastore
		// @0B4: iload #15
		// @0B6: ifeq @0D4
		// @0B9: goto @0BD
		// @0BC: athrow
		// @0BD: aload_3
		// @0BE: iload #10
		// @0C0: iload #11
		// @0C2: iload #12
		// @0C4: invokestatic game.C_100116_ei.func_104117_a(int, int)int
		// @0C7: iastore
		// @0C8: iinc #10 +255
		// @0CB: iload #15
		// @0CD: ifeq @072
		// @0D0: goto @0D4
		// @0D3: athrow
		// @0D4: iload #7
		// @0D6: iload #8
		// @0D8: ior
		// @0D9: istore #9
		// @0DB: iload #15
		// @0DD: ifeq @0E8
		// @0E0: aload_3
		// @0E1: iconst_m1
		// @0E2: iload #6
		// @0E4: iadd
		// @0E5: iaload
		// @0E6: istore #9
		// @0E8: aload_3
		// @0E9: iload #6
		// @0EB: iload #9
		// @0ED: iastore
		// @0EE: iload #6
		// @0F0: iconst_1
		// @0F1: iadd
		// @0F2: istore #10
		// @0F4: bipush -33 (0xDF)
		// @0F6: iload #10
		// @0F8: iconst_m1
		// @0F9: ixor
		// @0FA: if_icmpgt @121
		// @0FD: aload_3
		// @0FE: iload #10
		// @100: iaload
		// @101: iconst_m1
		// @102: ixor
		// @103: iload #8
		// @105: iconst_m1
		// @106: ixor
		// @107: iload #15
		// @109: ifne @02E
		// @10C: if_icmpne @119
		// @10F: aload_3
		// @110: iload #10
		// @112: iload #9
		// @114: iastore
		// @115: goto @119
		// @118: athrow
		// @119: iinc #10 +1
		// @11C: iload #15
		// @11E: ifeq @0F4
		// @121: iconst_0
		// @122: istore #10
		// @124: iconst_0
		// @125: istore #11
		// @127: iload #11
		// @129: iload #6
		// @12B: if_icmpge @1D5
		// @12E: ldc -2147483648 (0x80000000)
		// @130: iload #11
		// @132: iushr
		// @133: istore #12
		// @135: iload #12
		// @137: iload #8
		// @139: iand
		// @13A: iload #15
		// @13C: ifne @1E4
		// @13F: ifeq @16F
		// @142: goto @146
		// @145: athrow
		// @146: aload_0
		// @147: getfield int[] game.C_100290_jm.field_106858_d
		// @14A: iload #10
		// @14C: iaload
		// @14D: ifne @161
		// @150: goto @154
		// @153: athrow
		// @154: aload_0
		// @155: getfield int[] game.C_100290_jm.field_106858_d
		// @158: iload #10
		// @15A: iload #4
		// @15C: iastore
		// @15D: goto @161
		// @160: athrow
		// @161: aload_0
		// @162: getfield int[] game.C_100290_jm.field_106858_d
		// @165: iload #10
		// @167: iaload
		// @168: istore #10
		// @16A: iload #15
		// @16C: ifeq @176
		// @16F: iinc #10 +1
		// @172: goto @176
		// @175: athrow
		// @176: iload #10
		// @178: iconst_m1
		// @179: ixor
		// @17A: aload_0
		// @17B: getfield int[] game.C_100290_jm.field_106858_d
		// @17E: arraylength
		// @17F: iconst_m1
		// @180: ixor
		// @181: if_icmple @188
		// @184: goto @1C7
		// @187: athrow
		// @188: iconst_2
		// @189: aload_0
		// @18A: getfield int[] game.C_100290_jm.field_106858_d
		// @18D: arraylength
		// @18E: imul
		// @18F: newarray int[]
		// @191: astore #13
		// @193: iconst_0
		// @194: istore #14
		// @196: iload #14
		// @198: iconst_m1
		// @199: ixor
		// @19A: aload_0
		// @19B: getfield int[] game.C_100290_jm.field_106858_d
		// @19E: arraylength
		// @19F: iconst_m1
		// @1A0: ixor
		// @1A1: if_icmple @1C1
		// @1A4: aload #13
		// @1A6: iload #14
		// @1A8: aload_0
		// @1A9: getfield int[] game.C_100290_jm.field_106858_d
		// @1AC: iload #14
		// @1AE: iaload
		// @1AF: iastore
		// @1B0: iinc #14 +1
		// @1B3: iload #15
		// @1B5: ifne @1D0
		// @1B8: iload #15
		// @1BA: ifeq @196
		// @1BD: goto @1C1
		// @1C0: athrow
		// @1C1: aload_0
		// @1C2: aload #13
		// @1C4: putfield int[] game.C_100290_jm.field_106858_d
		// @1C7: iload #12
		// @1C9: iconst_1
		// @1CA: iushr
		// @1CB: istore #12
		// @1CD: iinc #11 +1
		// @1D0: iload #15
		// @1D2: ifeq @127
		// @1D5: aload_0
		// @1D6: getfield int[] game.C_100290_jm.field_106858_d
		// @1D9: iload #10
		// @1DB: iload #5
		// @1DD: iconst_m1
		// @1DE: ixor
		// @1DF: iastore
		// @1E0: iload #10
		// @1E2: iconst_m1
		// @1E3: ixor
		// @1E4: iload #4
		// @1E6: iconst_m1
		// @1E7: ixor
		// @1E8: if_icmple @1EF
		// @1EB: goto @1F5
		// @1EE: athrow
		// @1EF: iconst_1
		// @1F0: iload #10
		// @1F2: iadd
		// @1F3: istore #4
		// @1F5: iinc #5 +1
		// @1F8: iload #15
		// @1FA: ifeq @02B
		// @1FD: goto @232
		// @200: astore_2
		// @201: aload_2
		// @202: new java.lang.StringBuilder
		// @205: dup
		// @206: invokespecial java.lang.StringBuilder.<init>()void
		// @209: getstatic java.lang.String[] game.C_100290_jm.field_106864_z
		// @20C: iconst_2
		// @20D: aaload
		// @20E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @211: aload_1
		// @212: ifnull @21E
		// @215: getstatic java.lang.String[] game.C_100290_jm.field_106864_z
		// @218: iconst_0
		// @219: aaload
		// @21A: goto @223
		// @21D: athrow
		// @21E: getstatic java.lang.String[] game.C_100290_jm.field_106864_z
		// @221: iconst_1
		// @222: aaload
		// @223: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @226: bipush 41 (0x29)
		// @228: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @22B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @22E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @231: athrow
		// @232: return
	}
	
	static
	{
		// @000: bipush 22 (0x16)
		// @002: anewarray java.lang.String
		// @005: dup
		// @006: iconst_0
		// @007: ldc "\u0010(\u000be|"
		// @009: invokestatic game.C_100290_jm.func_106854_z(java.lang.String)char[]
		// @00C: invokestatic game.C_100290_jm.func_106852_z(char[])java.lang.String
		// @00F: aastore
		// @010: dup
		// @011: iconst_1
		// @012: ldc "\u0005sI'"
		// @014: invokestatic game.C_100290_jm.func_106854_z(java.lang.String)char[]
		// @017: invokestatic game.C_100290_jm.func_106852_z(char[])java.lang.String
		// @01A: aastore
		// @01B: dup
		// @01C: iconst_2
		// @01D: ldc "\u0001k\u000bwh\u0005oQu)"
		// @01F: invokestatic game.C_100290_jm.func_106854_z(java.lang.String)char[]
		// @022: invokestatic game.C_100290_jm.func_106852_z(char[])java.lang.String
		// @025: aastore
		// @026: dup
		// @027: iconst_3
		// @028: ldc "\u0001k\u000b\r)"
		// @02A: invokestatic game.C_100290_jm.func_106854_z(java.lang.String)char[]
		// @02D: invokestatic game.C_100290_jm.func_106852_z(char[])java.lang.String
		// @030: aastore
		// @031: dup
		// @032: iconst_4
		// @033: ldc "\u0001k\u000b\n)"
		// @035: invokestatic game.C_100290_jm.func_106854_z(java.lang.String)char[]
		// @038: invokestatic game.C_100290_jm.func_106852_z(char[])java.lang.String
		// @03B: aastore
		// @03C: dup
		// @03D: iconst_5
		// @03E: ldc "\u0001k\u000b\t)"
		// @040: invokestatic game.C_100290_jm.func_106854_z(java.lang.String)char[]
		// @043: invokestatic game.C_100290_jm.func_106852_z(char[])java.lang.String
		// @046: aastore
		// @047: dup
		// @048: bipush 6 (0x06)
		// @04A: ldc "\u0001k\u000b\u000f)"
		// @04C: invokestatic game.C_100290_jm.func_106854_z(java.lang.String)char[]
		// @04F: invokestatic game.C_100290_jm.func_106852_z(char[])java.lang.String
		// @052: aastore
		// @053: dup
		// @054: bipush 7 (0x07)
		// @056: ldc "\u0001k\u000b\u0008)"
		// @058: invokestatic game.C_100290_jm.func_106854_z(java.lang.String)char[]
		// @05B: invokestatic game.C_100290_jm.func_106852_z(char[])java.lang.String
		// @05E: aastore
		// @05F: dup
		// @060: bipush 8 (0x08)
		// @062: ldc "WoH,<Z0\u001b"
		// @064: invokestatic game.C_100290_jm.func_106854_z(java.lang.String)char[]
		// @067: invokestatic game.C_100290_jm.func_106852_z(char[])java.lang.String
		// @06A: aastore
		// @06B: dup
		// @06C: bipush 9 (0x09)
		// @06E: ldc "WoH,<Z4\u001b"
		// @070: invokestatic game.C_100290_jm.func_106854_z(java.lang.String)char[]
		// @073: invokestatic game.C_100290_jm.func_106852_z(char[])java.lang.String
		// @076: aastore
		// @077: dup
		// @078: bipush 10 (0x0A)
		// @07A: ldc "WoH,<Z6\u001b"
		// @07C: invokestatic game.C_100290_jm.func_106854_z(java.lang.String)char[]
		// @07F: invokestatic game.C_100290_jm.func_106852_z(char[])java.lang.String
		// @082: aastore
		// @083: dup
		// @084: bipush 11 (0x0B)
		// @086: ldc "WoH,<Z?\u001b"
		// @088: invokestatic game.C_100290_jm.func_106854_z(java.lang.String)char[]
		// @08B: invokestatic game.C_100290_jm.func_106852_z(char[])java.lang.String
		// @08E: aastore
		// @08F: dup
		// @090: bipush 12 (0x0C)
		// @092: ldc "WoH,<Z3\u001b"
		// @094: invokestatic game.C_100290_jm.func_106854_z(java.lang.String)char[]
		// @097: invokestatic game.C_100290_jm.func_106852_z(char[])java.lang.String
		// @09A: aastore
		// @09B: dup
		// @09C: bipush 13 (0x0D)
		// @09E: ldc "WoH,<Z7\u001b"
		// @0A0: invokestatic game.C_100290_jm.func_106854_z(java.lang.String)char[]
		// @0A3: invokestatic game.C_100290_jm.func_106852_z(char[])java.lang.String
		// @0A6: aastore
		// @0A7: dup
		// @0A8: bipush 14 (0x0E)
		// @0AA: ldc "WoH,<S8"
		// @0AC: invokestatic game.C_100290_jm.func_106854_z(java.lang.String)char[]
		// @0AF: invokestatic game.C_100290_jm.func_106852_z(char[])java.lang.String
		// @0B2: aastore
		// @0B3: dup
		// @0B4: bipush 15 (0x0F)
		// @0B6: ldc "WoH,<Z1\u001b"
		// @0B8: invokestatic game.C_100290_jm.func_106854_z(java.lang.String)char[]
		// @0BB: invokestatic game.C_100290_jm.func_106852_z(char[])java.lang.String
		// @0BE: aastore
		// @0BF: dup
		// @0C0: bipush 16 (0x10)
		// @0C2: ldc "WoH,<Z>\u001b"
		// @0C4: invokestatic game.C_100290_jm.func_106854_z(java.lang.String)char[]
		// @0C7: invokestatic game.C_100290_jm.func_106852_z(char[])java.lang.String
		// @0CA: aastore
		// @0CB: dup
		// @0CC: bipush 17 (0x11)
		// @0CE: ldc "WoH,<R8"
		// @0D0: invokestatic game.C_100290_jm.func_106854_z(java.lang.String)char[]
		// @0D3: invokestatic game.C_100290_jm.func_106852_z(char[])java.lang.String
		// @0D6: aastore
		// @0D7: dup
		// @0D8: bipush 18 (0x12)
		// @0DA: ldc "WoH,<Z2\u001b"
		// @0DC: invokestatic game.C_100290_jm.func_106854_z(java.lang.String)char[]
		// @0DF: invokestatic game.C_100290_jm.func_106852_z(char[])java.lang.String
		// @0E2: aastore
		// @0E3: dup
		// @0E4: bipush 19 (0x13)
		// @0E6: ldc "\u0001k\u000b\u000c)"
		// @0E8: invokestatic game.C_100290_jm.func_106854_z(java.lang.String)char[]
		// @0EB: invokestatic game.C_100290_jm.func_106852_z(char[])java.lang.String
		// @0EE: aastore
		// @0EF: dup
		// @0F0: bipush 20 (0x14)
		// @0F2: ldc "WoH,<Z5\u001b"
		// @0F4: invokestatic game.C_100290_jm.func_106854_z(java.lang.String)char[]
		// @0F7: invokestatic game.C_100290_jm.func_106852_z(char[])java.lang.String
		// @0FA: aastore
		// @0FB: dup
		// @0FC: bipush 21 (0x15)
		// @0FE: ldc "\u0001k\u000b\u000e)"
		// @100: invokestatic game.C_100290_jm.func_106854_z(java.lang.String)char[]
		// @103: invokestatic game.C_100290_jm.func_106852_z(char[])java.lang.String
		// @106: aastore
		// @107: putstatic java.lang.String[] game.C_100290_jm.field_106864_z
		// @10A: new game.C_100268_mk
		// @10D: dup
		// @10E: invokespecial game.C_100268_mk.<init>()void
		// @111: putstatic game.C_100268_mk game.C_100290_jm.field_106856_f
		// @114: ldc "#oA.!\u000cgH.!\u0008nD?"
		// @116: invokestatic game.C_100290_jm.func_106854_z(java.lang.String)char[]
		// @119: invokestatic game.C_100290_jm.func_106852_z(char[])java.lang.String
		// @11C: putstatic java.lang.String game.C_100290_jm.field_106861_c
		// @11F: ldc "&G}"
		// @121: invokestatic game.C_100290_jm.func_106854_z(java.lang.String)char[]
		// @124: invokestatic game.C_100290_jm.func_106852_z(char[])java.lang.String
		// @127: putstatic java.lang.String game.C_100290_jm.field_106857_g
		// @12A: sipush 128 (0x0080)
		// @12D: newarray int[]
		// @12F: putstatic int[] game.C_100290_jm.field_106863_j
		// @132: ldc "%gH.rKuM$t\u0007b\u0005(n\u0005rD\"oKg\u0005&`\u0013oH>lKiCk0Y&F#`\u0019gF?d\u0019u"
		// @134: invokestatic game.C_100290_jm.func_106854_z(java.lang.String)char[]
		// @137: invokestatic game.C_100290_jm.func_106852_z(char[])java.lang.String
		// @13A: putstatic java.lang.String game.C_100290_jm.field_106866_h
		// @13D: iconst_0
		// @13E: putstatic int game.C_100290_jm.field_106860_b
		// @141: return
	}
	
	private static char[] func_106854_z(String arg0)
	{
		// @00: aload_0
		// @01: invokevirtual java.lang.String.toCharArray()char[]
		// @04: dup
		// @05: arraylength
		// @06: iconst_2
		// @07: if_icmpge @12
		// @0A: dup
		// @0B: iconst_0
		// @0C: dup2
		// @0D: caload
		// @0E: iconst_1
		// @0F: ixor
		// @10: i2c
		// @11: castore
		// @12: areturn
	}
	
	private static String func_106852_z(char[] arg0)
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
		// @10: tableswitch def: @44, for 0: @30, for 1: @35, for 2: @3A, for 3: @3F
		// @30: bipush 107 (0x6B)
		// @32: goto @45
		// @35: bipush 6 (0x06)
		// @37: goto @45
		// @3A: bipush 37 (0x25)
		// @3C: goto @45
		// @3F: bipush 75 (0x4B)
		// @41: goto @45
		// @44: iconst_1
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
