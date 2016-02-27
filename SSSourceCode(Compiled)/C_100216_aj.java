package game;

final class C_100216_aj extends C_100080_b
{
	static String field_104449_B;
	private C_100091_m field_104451_n;
	static String field_104455_j;
	private byte[] field_104463_s;
	private int field_104461_u;
	private C_100071_va field_104456_k;
	private C_100119_ua field_104448_A;
	private C_100254_pi field_104458_i;
	private C_100104_v field_104453_l;
	private int field_104466_p;
	private int field_104465_q;
	static boolean field_104462_t;
	private byte[] field_104469_x;
	private C_100178_cg field_104464_r;
	private C_100091_m field_104450_C;
	static int field_104467_z;
	private boolean field_104468_y;
	private C_100202_qi field_104459_w;
	private boolean field_104447_g;
	private int field_104457_h;
	private C_100202_qi field_104460_v;
	private boolean field_104454_m;
	private long field_104452_o;
	private static final String[] field_104446_D;
	
	static final void func_104445_d(int arg0)
	{
		// @0000: getstatic int game.SteelSentinels.field_105275_O
		// @0003: istore #31
		// @0005: iconst_m1
		// @0006: putstatic int game.C_100017_wj.field_103815_g
		// @0009: getstatic int game.C_100068_vc.field_104343_e
		// @000C: iconst_m1
		// @000D: ixor
		// @000E: bipush -2 (0xFE)
		// @0010: if_icmpeq @0020
		// @0013: getstatic int game.C_100068_vc.field_104343_e
		// @0016: iconst_m1
		// @0017: ixor
		// @0018: iconst_m1
		// @0019: if_icmpne @0025
		// @001C: goto @0020
		// @001F: athrow
		// @0020: iconst_1
		// @0021: goto @0026
		// @0024: athrow
		// @0025: iconst_0
		// @0026: istore_1
		// @0027: aconst_null
		// @0028: putstatic game.C_100049_vf game.C_100013_fn.field_103742_c
		// @002B: getstatic game.C_100302_ka game.C_100046_vk.field_102764_yb
		// @002E: ifnull @0094
		// @0031: getstatic game.C_100302_ka game.C_100046_vk.field_102764_yb
		// @0034: getfield int game.C_100302_ka.field_101840_Eb
		// @0037: iconst_m1
		// @0038: ixor
		// @0039: getstatic int game.C_100015_wh.field_103781_g
		// @003C: iconst_m1
		// @003D: ixor
		// @003E: if_icmplt @0094
		// @0041: goto @0045
		// @0044: athrow
		// @0045: getstatic int game.C_100015_wh.field_103781_g
		// @0048: iconst_m1
		// @0049: ixor
		// @004A: getstatic game.C_100302_ka game.C_100046_vk.field_102764_yb
		// @004D: getfield int game.C_100302_ka.field_101886_Kb
		// @0050: getstatic game.C_100302_ka game.C_100046_vk.field_102764_yb
		// @0053: getfield int game.C_100302_ka.field_101840_Eb
		// @0056: iadd
		// @0057: iconst_m1
		// @0058: ixor
		// @0059: if_icmple @0094
		// @005C: goto @0060
		// @005F: athrow
		// @0060: getstatic int game.C_100338_jc.field_105370_l
		// @0063: iconst_m1
		// @0064: ixor
		// @0065: getstatic game.C_100302_ka game.C_100046_vk.field_102764_yb
		// @0068: getfield int game.C_100302_ka.field_101835_xb
		// @006B: iconst_m1
		// @006C: ixor
		// @006D: if_icmpgt @0094
		// @0070: goto @0074
		// @0073: athrow
		// @0074: getstatic int game.C_100338_jc.field_105370_l
		// @0077: iconst_m1
		// @0078: ixor
		// @0079: getstatic game.C_100302_ka game.C_100046_vk.field_102764_yb
		// @007C: getfield int game.C_100302_ka.field_101848_lb
		// @007F: getstatic game.C_100302_ka game.C_100046_vk.field_102764_yb
		// @0082: getfield int game.C_100302_ka.field_101835_xb
		// @0085: iadd
		// @0086: iconst_m1
		// @0087: ixor
		// @0088: if_icmple @0094
		// @008B: goto @008F
		// @008E: athrow
		// @008F: iconst_1
		// @0090: goto @0095
		// @0093: athrow
		// @0094: iconst_0
		// @0095: istore_2
		// @0096: getstatic game.C_100302_ka game.C_100189_ri.field_105752_d
		// @0099: ifnull @0296
		// @009C: aconst_null
		// @009D: getstatic java.lang.String game.C_100129_tg.field_102743_Db
		// @00A0: if_acmpne @00B2
		// @00A3: goto @00A7
		// @00A6: athrow
		// @00A7: iconst_0
		// @00A8: getstatic int game.C_100244_pe.field_106374_f
		// @00AB: if_icmpeq @00BE
		// @00AE: goto @00B2
		// @00B1: athrow
		// @00B2: iconst_1
		// @00B3: putstatic boolean game.C_100034_gi.field_104029_d
		// @00B6: iconst_1
		// @00B7: putstatic boolean game.C_100309_lk.field_103271_ab
		// @00BA: goto @00BE
		// @00BD: athrow
		// @00BE: iload_2
		// @00BF: ifne @00DE
		// @00C2: iconst_m1
		// @00C3: getstatic int game.C_100032_gk.field_103132_V
		// @00C6: iconst_m1
		// @00C7: ixor
		// @00C8: if_icmpge @00DE
		// @00CB: goto @00CF
		// @00CE: athrow
		// @00CF: iconst_0
		// @00D0: getstatic int game.C_100091_m.field_104514_e
		// @00D3: if_icmple @00DE
		// @00D6: goto @00DA
		// @00D9: athrow
		// @00DA: goto @00E6
		// @00DD: athrow
		// @00DE: iconst_1
		// @00DF: putstatic boolean game.C_100034_gi.field_104029_d
		// @00E2: iconst_1
		// @00E3: putstatic boolean game.C_100082_uf.field_100369_g
		// @00E6: getstatic boolean game.C_100309_lk.field_103271_ab
		// @00E9: ifne @0142
		// @00EC: getstatic int game.C_100015_wh.field_103781_g
		// @00EF: getstatic game.C_100302_ka game.C_100036_gg.field_103156_O
		// @00F2: getfield int game.C_100302_ka.field_101840_Eb
		// @00F5: if_icmplt @0142
		// @00F8: goto @00FC
		// @00FB: athrow
		// @00FC: getstatic int game.C_100015_wh.field_103781_g
		// @00FF: getstatic game.C_100302_ka game.C_100036_gg.field_103156_O
		// @0102: getfield int game.C_100302_ka.field_101886_Kb
		// @0105: getstatic game.C_100302_ka game.C_100036_gg.field_103156_O
		// @0108: getfield int game.C_100302_ka.field_101840_Eb
		// @010B: iadd
		// @010C: if_icmpge @0142
		// @010F: goto @0113
		// @0112: athrow
		// @0113: getstatic game.C_100302_ka game.C_100036_gg.field_103156_O
		// @0116: getfield int game.C_100302_ka.field_101835_xb
		// @0119: getstatic int game.C_100338_jc.field_105370_l
		// @011C: if_icmpgt @0142
		// @011F: goto @0123
		// @0122: athrow
		// @0123: getstatic int game.C_100338_jc.field_105370_l
		// @0126: getstatic game.C_100302_ka game.C_100036_gg.field_103156_O
		// @0129: getfield int game.C_100302_ka.field_101835_xb
		// @012C: getstatic game.C_100302_ka game.C_100036_gg.field_103156_O
		// @012F: getfield int game.C_100302_ka.field_101848_lb
		// @0132: iadd
		// @0133: if_icmpge @0142
		// @0136: goto @013A
		// @0139: athrow
		// @013A: iconst_1
		// @013B: putstatic boolean game.C_100309_lk.field_103271_ab
		// @013E: goto @0142
		// @0141: athrow
		// @0142: getstatic boolean game.C_100247_pa.field_106415_b
		// @0145: ifeq @01CC
		// @0148: iconst_1
		// @0149: putstatic boolean game.C_100236_on.field_100899_j
		// @014C: iconst_1
		// @014D: putstatic boolean game.C_100082_uf.field_100369_g
		// @0150: iconst_1
		// @0151: putstatic boolean game.C_100309_lk.field_103271_ab
		// @0154: getstatic game.C_100327_ib game.C_100197_ra.field_100861_k
		// @0157: ifnonnull @01C8
		// @015A: goto @015E
		// @015D: athrow
		// @015E: iconst_m1
		// @015F: getstatic int game.C_100174_sb.field_105609_b
		// @0162: iconst_m1
		// @0163: ixor
		// @0164: if_icmpge @01C8
		// @0167: goto @016B
		// @016A: athrow
		// @016B: aconst_null
		// @016C: getstatic game.C_100302_ka game.C_100226_ae.field_106147_g
		// @016F: if_acmpne @017A
		// @0172: goto @0176
		// @0175: athrow
		// @0176: goto @01C8
		// @0179: athrow
		// @017A: iconst_0
		// @017B: getstatic int game.C_100200_ba.field_105852_c
		// @017E: if_icmpne @0192
		// @0181: ldc 1021128 (0xf94c8)
		// @0183: getstatic game.C_100302_ka game.C_100226_ae.field_106147_g
		// @0186: invokestatic game.C_100284_nj.func_106763_a(int, game.C_100302_ka)void
		// @0189: iload #31
		// @018B: ifeq @01C8
		// @018E: goto @0192
		// @0191: athrow
		// @0192: bipush 16 (0x10)
		// @0194: getstatic int game.C_100200_ba.field_105852_c
		// @0197: iand
		// @0198: ifeq @01B0
		// @019B: goto @019F
		// @019E: athrow
		// @019F: getstatic game.C_100302_ka game.C_100226_ae.field_106147_g
		// @01A2: iconst_0
		// @01A3: invokestatic game.C_100290_jm.func_106848_a(game.C_100302_ka, boolean)int
		// @01A6: pop
		// @01A7: iload #31
		// @01A9: ifeq @01C8
		// @01AC: goto @01B0
		// @01AF: athrow
		// @01B0: iconst_2
		// @01B1: getstatic int game.C_100200_ba.field_105852_c
		// @01B4: iand
		// @01B5: ifeq @01C8
		// @01B8: goto @01BC
		// @01BB: athrow
		// @01BC: iconst_4
		// @01BD: getstatic game.C_100302_ka game.C_100226_ae.field_106147_g
		// @01C0: invokestatic game.C_100028_ha.func_103938_a(int, game.C_100302_ka)int
		// @01C3: pop
		// @01C4: goto @01C8
		// @01C7: athrow
		// @01C8: iconst_0
		// @01C9: putstatic boolean game.C_100247_pa.field_106415_b
		// @01CC: getstatic boolean game.C_100309_lk.field_103271_ab
		// @01CF: ifeq @01DC
		// @01D2: getstatic boolean game.C_100034_gi.field_104029_d
		// @01D5: ifne @01E9
		// @01D8: goto @01DC
		// @01DB: athrow
		// @01DC: iconst_m1
		// @01DD: getstatic int game.C_100052_eb.field_104231_b
		// @01E0: iconst_m1
		// @01E1: ixor
		// @01E2: if_icmpeq @0203
		// @01E5: goto @01E9
		// @01E8: athrow
		// @01E9: getstatic game.C_100302_ka game.C_100189_ri.field_105752_d
		// @01EC: bipush -126 (0x82)
		// @01EE: iconst_1
		// @01EF: invokevirtual game.C_100302_ka.func_101809_a(byte, boolean)void
		// @01F2: iconst_0
		// @01F3: putstatic boolean game.C_100034_gi.field_104029_d
		// @01F6: iconst_0
		// @01F7: putstatic boolean game.C_100309_lk.field_103271_ab
		// @01FA: iload #31
		// @01FC: ifeq @0296
		// @01FF: goto @0203
		// @0202: athrow
		// @0203: getstatic game.C_100302_ka[] game.C_100103_eh.field_104669_j
		// @0206: astore_3
		// @0207: iconst_0
		// @0208: istore #4
		// @020A: aload_3
		// @020B: arraylength
		// @020C: iload #4
		// @020E: if_icmple @0230
		// @0211: aload_3
		// @0212: iload #4
		// @0214: aaload
		// @0215: astore #5
		// @0217: aload #5
		// @0219: bipush -126 (0x82)
		// @021B: iconst_1
		// @021C: invokevirtual game.C_100302_ka.func_101809_a(byte, boolean)void
		// @021F: iinc #4 +1
		// @0222: iload #31
		// @0224: ifne @025F
		// @0227: iload #31
		// @0229: ifeq @020A
		// @022C: goto @0230
		// @022F: athrow
		// @0230: getstatic boolean game.C_100309_lk.field_103271_ab
		// @0233: ifne @023A
		// @0236: goto @0263
		// @0239: athrow
		// @023A: getstatic game.C_100302_ka game.C_100036_gg.field_103156_O
		// @023D: getfield int game.C_100302_ka.field_101840_Eb
		// @0240: getstatic game.C_100302_ka game.C_100036_gg.field_103156_O
		// @0243: getfield int game.C_100302_ka.field_101835_xb
		// @0246: getstatic game.C_100302_ka game.C_100036_gg.field_103156_O
		// @0249: getfield int game.C_100302_ka.field_101886_Kb
		// @024C: getstatic game.C_100302_ka game.C_100036_gg.field_103156_O
		// @024F: getfield int game.C_100302_ka.field_101848_lb
		// @0252: iconst_0
		// @0253: invokestatic game.C_100196_rb.func_105782_i(int, int, int, int, int)void
		// @0256: getstatic game.C_100302_ka game.C_100036_gg.field_103156_O
		// @0259: bipush -128 (0x80)
		// @025B: iconst_1
		// @025C: invokevirtual game.C_100302_ka.func_101809_a(byte, boolean)void
		// @025F: iconst_0
		// @0260: putstatic boolean game.C_100309_lk.field_103271_ab
		// @0263: getstatic boolean game.C_100034_gi.field_104029_d
		// @0266: ifne @026D
		// @0269: goto @0296
		// @026C: athrow
		// @026D: getstatic game.C_100302_ka game.C_100046_vk.field_102764_yb
		// @0270: getfield int game.C_100302_ka.field_101840_Eb
		// @0273: getstatic game.C_100302_ka game.C_100046_vk.field_102764_yb
		// @0276: getfield int game.C_100302_ka.field_101835_xb
		// @0279: getstatic game.C_100302_ka game.C_100046_vk.field_102764_yb
		// @027C: getfield int game.C_100302_ka.field_101886_Kb
		// @027F: getstatic game.C_100302_ka game.C_100046_vk.field_102764_yb
		// @0282: getfield int game.C_100302_ka.field_101848_lb
		// @0285: iconst_0
		// @0286: invokestatic game.C_100196_rb.func_105782_i(int, int, int, int, int)void
		// @0289: getstatic game.C_100302_ka game.C_100046_vk.field_102764_yb
		// @028C: bipush -128 (0x80)
		// @028E: iconst_1
		// @028F: invokevirtual game.C_100302_ka.func_101809_a(byte, boolean)void
		// @0292: iconst_0
		// @0293: putstatic boolean game.C_100034_gi.field_104029_d
		// @0296: getstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @0299: ifnull @02A0
		// @029C: goto @02C8
		// @029F: athrow
		// @02A0: getstatic int[] game.C_100280_nf.field_101178_o
		// @02A3: ifnonnull @02B0
		// @02A6: getstatic int[] game.C_100005_fk.field_103605_u
		// @02A9: putstatic int[] game.C_100280_nf.field_101178_o
		// @02AC: goto @02B0
		// @02AF: athrow
		// @02B0: getstatic int[] game.C_100280_nf.field_101178_o
		// @02B3: bipush 126 (0x7E)
		// @02B5: getstatic int[] game.C_100301_kb.field_107089_g
		// @02B8: invokestatic game.C_100157_db.func_103546_a(int[], byte, int[])game.C_100327_ib
		// @02BB: putstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @02BE: getstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @02C1: bipush 46 (0x2E)
		// @02C3: ldc 6993661 (0x6ab6fd)
		// @02C5: invokevirtual game.C_100327_ib.func_102465_a(byte, int)void
		// @02C8: sipush 364 (0x016C)
		// @02CB: istore_3
		// @02CC: bipush 59 (0x3B)
		// @02CE: istore #4
		// @02D0: sipush 4096 (0x1000)
		// @02D3: istore #5
		// @02D5: getstatic int[] game.C_100280_nf.field_101178_o
		// @02D8: iconst_0
		// @02D9: iaload
		// @02DA: istore #6
		// @02DC: iconst_0
		// @02DD: iload #6
		// @02DF: if_icmpeq @03AD
		// @02E2: iload #6
		// @02E4: iconst_m1
		// @02E5: ixor
		// @02E6: bipush -56 (0xC8)
		// @02E8: if_icmpne @02F8
		// @02EB: goto @02EF
		// @02EE: athrow
		// @02EF: iload #31
		// @02F1: ifeq @03B8
		// @02F4: goto @02F8
		// @02F7: athrow
		// @02F8: bipush 57 (0x39)
		// @02FA: iload #6
		// @02FC: if_icmpne @030C
		// @02FF: goto @0303
		// @0302: athrow
		// @0303: iload #31
		// @0305: ifeq @03C7
		// @0308: goto @030C
		// @030B: athrow
		// @030C: bipush 62 (0x3E)
		// @030E: iload #6
		// @0310: if_icmpne @0320
		// @0313: goto @0317
		// @0316: athrow
		// @0317: iload #31
		// @0319: ifeq @03D6
		// @031C: goto @0320
		// @031F: athrow
		// @0320: bipush 65 (0x41)
		// @0322: iload #6
		// @0324: if_icmpne @0334
		// @0327: goto @032B
		// @032A: athrow
		// @032B: iload #31
		// @032D: ifeq @03E8
		// @0330: goto @0334
		// @0333: athrow
		// @0334: iload #6
		// @0336: bipush 69 (0x45)
		// @0338: if_icmpeq @03F7
		// @033B: goto @033F
		// @033E: athrow
		// @033F: bipush 72 (0x48)
		// @0341: iload #6
		// @0343: if_icmpeq @0406
		// @0346: goto @034A
		// @0349: athrow
		// @034A: iload #6
		// @034C: iconst_m1
		// @034D: ixor
		// @034E: bipush -76 (0xB4)
		// @0350: if_icmpne @0360
		// @0353: goto @0357
		// @0356: athrow
		// @0357: iload #31
		// @0359: ifeq @041B
		// @035C: goto @0360
		// @035F: athrow
		// @0360: bipush 79 (0x4F)
		// @0362: iload #6
		// @0364: if_icmpne @0374
		// @0367: goto @036B
		// @036A: athrow
		// @036B: iload #31
		// @036D: ifeq @0433
		// @0370: goto @0374
		// @0373: athrow
		// @0374: bipush 84 (0x54)
		// @0376: iload #6
		// @0378: if_icmpne @0388
		// @037B: goto @037F
		// @037E: athrow
		// @037F: iload #31
		// @0381: ifeq @0442
		// @0384: goto @0388
		// @0387: athrow
		// @0388: iload #6
		// @038A: bipush 88 (0x58)
		// @038C: if_icmpne @039C
		// @038F: goto @0393
		// @0392: athrow
		// @0393: iload #31
		// @0395: ifeq @0454
		// @0398: goto @039C
		// @039B: athrow
		// @039C: bipush -93 (0xA3)
		// @039E: iload #6
		// @03A0: iconst_m1
		// @03A1: ixor
		// @03A2: if_icmpeq @046C
		// @03A5: goto @03A9
		// @03A8: athrow
		// @03A9: goto @047C
		// @03AC: athrow
		// @03AD: wide (iinc) #4 +280
		// @03B3: iload #31
		// @03B5: ifeq @047C
		// @03B8: wide (iinc) #4 +280
		// @03BE: iload #31
		// @03C0: ifeq @047C
		// @03C3: goto @03C7
		// @03C6: athrow
		// @03C7: wide (iinc) #4 +280
		// @03CD: iload #31
		// @03CF: ifeq @047C
		// @03D2: goto @03D6
		// @03D5: athrow
		// @03D6: wide (iinc) #4 +270
		// @03DC: iinc #3 +10
		// @03DF: iload #31
		// @03E1: ifeq @047C
		// @03E4: goto @03E8
		// @03E7: athrow
		// @03E8: wide (iinc) #4 +290
		// @03EE: iload #31
		// @03F0: ifeq @047C
		// @03F3: goto @03F7
		// @03F6: athrow
		// @03F7: wide (iinc) #4 +280
		// @03FD: iload #31
		// @03FF: ifeq @047C
		// @0402: goto @0406
		// @0405: athrow
		// @0406: wide (iinc) #4 +260
		// @040C: wide (iinc) #5 +64736
		// @0412: iload #31
		// @0414: ifeq @047C
		// @0417: goto @041B
		// @041A: athrow
		// @041B: wide (iinc) #5 +65336
		// @0421: iinc #3 +248
		// @0424: wide (iinc) #4 +290
		// @042A: iload #31
		// @042C: ifeq @047C
		// @042F: goto @0433
		// @0432: athrow
		// @0433: wide (iinc) #4 +290
		// @0439: iload #31
		// @043B: ifeq @047C
		// @043E: goto @0442
		// @0441: athrow
		// @0442: wide (iinc) #4 +290
		// @0448: iinc #3 +12
		// @044B: iload #31
		// @044D: ifeq @047C
		// @0450: goto @0454
		// @0453: athrow
		// @0454: wide (iinc) #4 +290
		// @045A: wide (iinc) #5 +65136
		// @0460: iinc #3 +25
		// @0463: iload #31
		// @0465: ifeq @047C
		// @0468: goto @046C
		// @046B: athrow
		// @046C: wide (iinc) #5 +64236
		// @0472: wide (iinc) #4 +290
		// @0478: goto @047C
		// @047B: athrow
		// @047C: iload #5
		// @047E: putstatic int game.C_100270_mi.field_102270_jc
		// @0481: iconst_0
		// @0482: istore #6
		// @0484: getstatic int game.C_100338_jc.field_105363_f
		// @0487: bipush 26 (0x1A)
		// @0489: imul
		// @048A: bipush 57 (0x39)
		// @048C: idiv
		// @048D: bipush 66 (0x42)
		// @048F: iadd
		// @0490: istore #7
		// @0492: sipush 510 (0x01FE)
		// @0495: getstatic int game.C_100338_jc.field_105363_f
		// @0498: bipush 114 (0x72)
		// @049A: imul
		// @049B: bipush 57 (0x39)
		// @049D: idiv
		// @049E: iadd
		// @049F: istore #8
		// @04A1: sipush 226 (0x00E2)
		// @04A4: iload #7
		// @04A6: bipush 26 (0x1A)
		// @04A8: ldc 3355443 (0x333333)
		// @04AA: invokestatic game.C_100196_rb.func_105807_g(int, int, int, int)void
		// @04AD: sipush 226 (0x00E2)
		// @04B0: iload #7
		// @04B2: bipush 26 (0x1A)
		// @04B4: ldc 3355443 (0x333333)
		// @04B6: invokestatic game.C_100196_rb.func_105778_a(int, int, int, int)void
		// @04B9: bipush -26 (0xE6)
		// @04BB: iload #8
		// @04BD: iadd
		// @04BE: iload #7
		// @04C0: bipush 26 (0x1A)
		// @04C2: ldc 3355443 (0x333333)
		// @04C4: invokestatic game.C_100196_rb.func_105807_g(int, int, int, int)void
		// @04C7: iload #8
		// @04C9: iload #7
		// @04CB: bipush 26 (0x1A)
		// @04CD: ldc 3355443 (0x333333)
		// @04CF: invokestatic game.C_100196_rb.func_105778_a(int, int, int, int)void
		// @04D2: sipush 226 (0x00E2)
		// @04D5: sipush 360 (0x0168)
		// @04D8: bipush 26 (0x1A)
		// @04DA: ldc 3355443 (0x333333)
		// @04DC: invokestatic game.C_100196_rb.func_105807_g(int, int, int, int)void
		// @04DF: sipush 226 (0x00E2)
		// @04E2: sipush 334 (0x014E)
		// @04E5: bipush 26 (0x1A)
		// @04E7: ldc 3355443 (0x333333)
		// @04E9: invokestatic game.C_100196_rb.func_105778_a(int, int, int, int)void
		// @04EC: bipush -26 (0xE6)
		// @04EE: iload #8
		// @04F0: iadd
		// @04F1: sipush 360 (0x0168)
		// @04F4: bipush 26 (0x1A)
		// @04F6: ldc 3355443 (0x333333)
		// @04F8: invokestatic game.C_100196_rb.func_105807_g(int, int, int, int)void
		// @04FB: iload #8
		// @04FD: sipush 334 (0x014E)
		// @0500: bipush 26 (0x1A)
		// @0502: ldc 3355443 (0x333333)
		// @0504: invokestatic game.C_100196_rb.func_105778_a(int, int, int, int)void
		// @0507: getstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @050A: ifnull @1117
		// @050D: aconst_null
		// @050E: getstatic game.C_100302_ka game.C_100189_ri.field_105752_d
		// @0511: if_acmpne @051C
		// @0514: goto @0518
		// @0517: athrow
		// @0518: goto @1117
		// @051B: athrow
		// @051C: iload #4
		// @051E: putstatic int game.C_100222_aa.field_106083_e
		// @0521: iload_3
		// @0522: getstatic int game.C_100338_jc.field_105363_f
		// @0525: iadd
		// @0526: putstatic int game.C_100330_ig.field_107291_h
		// @0529: getstatic int game.C_100330_ig.field_107291_h
		// @052C: putstatic int game.C_100032_gk.field_103141_Z
		// @052F: getstatic int game.C_100222_aa.field_106083_e
		// @0532: putstatic int game.C_100158_da.field_100592_d
		// @0535: getstatic int game.C_100222_aa.field_106083_e
		// @0538: putstatic int game.C_100137_bn.field_105036_c
		// @053B: getstatic int game.C_100330_ig.field_107291_h
		// @053E: putstatic int game.C_100321_hi.field_107219_b
		// @0541: sipush 221 (0x00DD)
		// @0544: bipush 60 (0x3C)
		// @0546: sipush 629 (0x0275)
		// @0549: sipush 432 (0x01B0)
		// @054C: invokestatic game.C_100196_rb.func_105815_h(int, int, int, int)void
		// @054F: iload_1
		// @0550: ifeq @0557
		// @0553: goto @06B2
		// @0556: athrow
		// @0557: aconst_null
		// @0558: astore #7
		// @055A: getstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @055D: getfield int game.C_100327_ib.field_102494_P
		// @0560: iconst_m1
		// @0561: ixor
		// @0562: bipush -70 (0xBA)
		// @0564: if_icmpne @059E
		// @0567: getstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @056A: iconst_2
		// @056B: sipush -12523 (0xCF15)
		// @056E: invokevirtual game.C_100327_ib.func_102452_b(int, int)game.C_100049_vf
		// @0571: astore #7
		// @0573: aconst_null
		// @0574: aload #7
		// @0576: if_acmpeq @059E
		// @0579: aload #7
		// @057B: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @057E: ifnull @059E
		// @0581: goto @0585
		// @0584: athrow
		// @0585: getstatic game.C_100037_wb game.C_100136_th.field_102626_Y
		// @0588: iload_3
		// @0589: getstatic int game.C_100338_jc.field_105363_f
		// @058C: ineg
		// @058D: isub
		// @058E: bipush -40 (0xD8)
		// @0590: isub
		// @0591: sipush -135 (0xFF79)
		// @0594: iload #4
		// @0596: iadd
		// @0597: invokevirtual game.C_100037_wb.func_102353_h(int, int)void
		// @059A: goto @059E
		// @059D: athrow
		// @059E: bipush -76 (0xB4)
		// @05A0: getstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @05A3: getfield int game.C_100327_ib.field_102494_P
		// @05A6: iconst_m1
		// @05A7: ixor
		// @05A8: if_icmpeq @05AF
		// @05AB: goto @060D
		// @05AE: athrow
		// @05AF: getstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @05B2: iconst_2
		// @05B3: iload_0
		// @05B4: sipush -12524 (0xCF14)
		// @05B7: ixor
		// @05B8: invokevirtual game.C_100327_ib.func_102452_b(int, int)game.C_100049_vf
		// @05BB: astore #7
		// @05BD: aconst_null
		// @05BE: aload #7
		// @05C0: if_acmpeq @060D
		// @05C3: aload #7
		// @05C5: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @05C8: ifnonnull @05D3
		// @05CB: goto @05CF
		// @05CE: athrow
		// @05CF: goto @060D
		// @05D2: athrow
		// @05D3: getstatic game.C_100037_wb game.C_100136_th.field_102626_Y
		// @05D6: iload_3
		// @05D7: getstatic int game.C_100338_jc.field_105363_f
		// @05DA: ineg
		// @05DB: bipush -4 (0xFC)
		// @05DD: iadd
		// @05DE: isub
		// @05DF: sipush -178 (0xFF4E)
		// @05E2: iload #4
		// @05E4: iadd
		// @05E5: invokevirtual game.C_100037_wb.func_102353_h(int, int)void
		// @05E8: bipush 95 (0x5F)
		// @05EA: aload #7
		// @05EC: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @05EF: getfield int game.C_100327_ib.field_102494_P
		// @05F2: if_icmpne @060D
		// @05F5: getstatic game.C_100037_wb game.C_100136_th.field_102626_Y
		// @05F8: bipush 10 (0x0A)
		// @05FA: getstatic int game.C_100338_jc.field_105363_f
		// @05FD: iload_3
		// @05FE: iadd
		// @05FF: iadd
		// @0600: sipush -175 (0xFF51)
		// @0603: iload #4
		// @0605: iadd
		// @0606: invokevirtual game.C_100037_wb.func_102353_h(int, int)void
		// @0609: goto @060D
		// @060C: athrow
		// @060D: getstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @0610: getfield int game.C_100327_ib.field_102494_P
		// @0613: bipush 57 (0x39)
		// @0615: if_icmpeq @061C
		// @0618: goto @0650
		// @061B: athrow
		// @061C: getstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @061F: iconst_2
		// @0620: sipush -12523 (0xCF15)
		// @0623: invokevirtual game.C_100327_ib.func_102452_b(int, int)game.C_100049_vf
		// @0626: astore #7
		// @0628: aload #7
		// @062A: ifnull @0650
		// @062D: aload #7
		// @062F: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @0632: ifnull @0650
		// @0635: goto @0639
		// @0638: athrow
		// @0639: getstatic game.C_100037_wb game.C_100136_th.field_102626_Y
		// @063C: getstatic int game.C_100338_jc.field_105363_f
		// @063F: iload_3
		// @0640: iconst_3
		// @0641: isub
		// @0642: iadd
		// @0643: sipush -156 (0xFF64)
		// @0646: iload #4
		// @0648: iadd
		// @0649: invokevirtual game.C_100037_wb.func_102353_h(int, int)void
		// @064C: goto @0650
		// @064F: athrow
		// @0650: getstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @0653: getfield int game.C_100327_ib.field_102494_P
		// @0656: bipush 55 (0x37)
		// @0658: if_icmpne @06A1
		// @065B: getstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @065E: iconst_2
		// @065F: sipush -12523 (0xCF15)
		// @0662: invokevirtual game.C_100327_ib.func_102452_b(int, int)game.C_100049_vf
		// @0665: astore #7
		// @0667: aload #7
		// @0669: ifnull @06A1
		// @066C: aload #7
		// @066E: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @0671: ifnull @06A1
		// @0674: goto @0678
		// @0677: athrow
		// @0678: bipush 95 (0x5F)
		// @067A: aload #7
		// @067C: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @067F: getfield int game.C_100327_ib.field_102494_P
		// @0682: if_icmpne @06A1
		// @0685: goto @0689
		// @0688: athrow
		// @0689: getstatic game.C_100037_wb game.C_100136_th.field_102626_Y
		// @068C: bipush 35 (0x23)
		// @068E: iload_3
		// @068F: getstatic int game.C_100338_jc.field_105363_f
		// @0692: iadd
		// @0693: iadd
		// @0694: sipush -130 (0xFF7E)
		// @0697: iload #4
		// @0699: iadd
		// @069A: invokevirtual game.C_100037_wb.func_102365_c(int, int)void
		// @069D: goto @06A1
		// @06A0: athrow
		// @06A1: getstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @06A4: getstatic int game.C_100330_ig.field_107291_h
		// @06A7: iconst_0
		// @06A8: iconst_1
		// @06A9: iconst_0
		// @06AA: getstatic int game.C_100222_aa.field_106083_e
		// @06AD: ldc 759988816 (0x2d4c8250)
		// @06AF: invokevirtual game.C_100327_ib.func_102437_a(int, int, boolean, int, int, int)void
		// @06B2: invokestatic game.C_100196_rb.func_105781_a()void
		// @06B5: bipush -58 (0xC6)
		// @06B7: getstatic int game.C_100338_jc.field_105363_f
		// @06BA: iconst_m1
		// @06BB: ixor
		// @06BC: if_icmpne @0754
		// @06BF: iload_1
		// @06C0: ifne @0754
		// @06C3: goto @06C7
		// @06C6: athrow
		// @06C7: getstatic int game.C_100158_da.field_100592_d
		// @06CA: istore #7
		// @06CC: bipush -85 (0xAB)
		// @06CE: getstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @06D1: getfield int game.C_100327_ib.field_102494_P
		// @06D4: iconst_m1
		// @06D5: ixor
		// @06D6: if_icmpne @06E0
		// @06D9: iinc #7 +206
		// @06DC: goto @06E0
		// @06DF: athrow
		// @06E0: sipush 308 (0x0134)
		// @06E3: getstatic int game.C_100137_bn.field_105036_c
		// @06E6: getstatic int game.C_100137_bn.field_105036_c
		// @06E9: ineg
		// @06EA: iload #7
		// @06EC: iadd
		// @06ED: ldc 3355443 (0x333333)
		// @06EF: invokestatic game.C_100196_rb.func_105778_a(int, int, int, int)void
		// @06F2: sipush 308 (0x0134)
		// @06F5: getstatic int game.C_100137_bn.field_105036_c
		// @06F8: bipush 8 (0x08)
		// @06FA: ldc 3355443 (0x333333)
		// @06FC: invokestatic game.C_100196_rb.func_105807_g(int, int, int, int)void
		// @06FF: sipush 308 (0x0134)
		// @0702: iload #7
		// @0704: bipush 8 (0x08)
		// @0706: ldc 3355443 (0x333333)
		// @0708: invokestatic game.C_100196_rb.func_105807_g(int, int, int, int)void
		// @070B: sipush 2000 (0x07D0)
		// @070E: getstatic int game.C_100137_bn.field_105036_c
		// @0711: ineg
		// @0712: iload #7
		// @0714: iadd
		// @0715: imul
		// @0716: getstatic int game.C_100270_mi.field_102270_jc
		// @0719: idiv
		// @071A: istore #8
		// @071C: getstatic game.C_100317_lb game.C_100311_le.field_104719_A
		// @071F: sipush -30945 (0x871F)
		// @0722: iconst_2
		// @0723: anewarray java.lang.String
		// @0726: dup
		// @0727: iconst_0
		// @0728: iload #8
		// @072A: bipush 10 (0x0A)
		// @072C: idiv
		// @072D: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @0730: aastore
		// @0731: dup
		// @0732: iconst_1
		// @0733: iload #8
		// @0735: bipush 10 (0x0A)
		// @0737: irem
		// @0738: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @073B: aastore
		// @073C: getstatic java.lang.String game.C_100094_j.field_104547_d
		// @073F: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @0742: sipush 307 (0x0133)
		// @0745: getstatic int game.C_100137_bn.field_105036_c
		// @0748: iload #7
		// @074A: ineg
		// @074B: isub
		// @074C: iconst_2
		// @074D: idiv
		// @074E: ldc 4473924 (0x444444)
		// @0750: iconst_m1
		// @0751: invokevirtual game.C_100317_lb.func_101746_a(java.lang.String, int, int, int, int)void
		// @0754: sipush 657 (0x0291)
		// @0757: getstatic int game.C_100338_jc.field_105363_f
		// @075A: ineg
		// @075B: iadd
		// @075C: istore #7
		// @075E: sipush -641 (0xFD7F)
		// @0761: iload #7
		// @0763: iconst_m1
		// @0764: ixor
		// @0765: if_icmpge @0829
		// @0768: iload_1
		// @0769: ifeq @0774
		// @076C: goto @0770
		// @076F: athrow
		// @0770: goto @0829
		// @0773: athrow
		// @0774: sipush 365 (0x016D)
		// @0777: getstatic int game.C_100158_da.field_100592_d
		// @077A: invokestatic java.lang.Math.min(int, int)int
		// @077D: istore #8
		// @077F: bipush 18 (0x12)
		// @0781: getstatic int game.C_100270_mi.field_102270_jc
		// @0784: imul
		// @0785: sipush 2000 (0x07D0)
		// @0788: idiv
		// @0789: istore #9
		// @078B: getstatic game.C_100037_wb game.C_100107_u.field_104775_a
		// @078E: iload #7
		// @0790: iload #8
		// @0792: iload #9
		// @0794: ineg
		// @0795: iadd
		// @0796: bipush -8 (0xF8)
		// @0798: iadd
		// @0799: getstatic int game.C_100270_mi.field_102270_jc
		// @079C: bipush 7 (0x07)
		// @079E: imul
		// @079F: sipush 2000 (0x07D0)
		// @07A2: idiv
		// @07A3: iload #9
		// @07A5: invokevirtual game.C_100037_wb.func_102364_d(int, int, int, int)void
		// @07A8: getstatic int game.C_100338_jc.field_105363_f
		// @07AB: iconst_m1
		// @07AC: ixor
		// @07AD: bipush -58 (0xC6)
		// @07AF: if_icmpne @0829
		// @07B2: iload #7
		// @07B4: bipush 10 (0x0A)
		// @07B6: isub
		// @07B7: iload #9
		// @07B9: ineg
		// @07BA: iload #8
		// @07BC: bipush 8 (0x08)
		// @07BE: isub
		// @07BF: iadd
		// @07C0: iload #9
		// @07C2: ldc 3355443 (0x333333)
		// @07C4: invokestatic game.C_100196_rb.func_105778_a(int, int, int, int)void
		// @07C7: bipush -10 (0xF6)
		// @07C9: iload #7
		// @07CB: iadd
		// @07CC: bipush -8 (0xF8)
		// @07CE: iload #9
		// @07D0: ineg
		// @07D1: iadd
		// @07D2: iload #8
		// @07D4: iadd
		// @07D5: bipush 8 (0x08)
		// @07D7: ldc 3355443 (0x333333)
		// @07D9: invokestatic game.C_100196_rb.func_105807_g(int, int, int, int)void
		// @07DC: iload #7
		// @07DE: bipush 10 (0x0A)
		// @07E0: isub
		// @07E1: bipush -8 (0xF8)
		// @07E3: iload #8
		// @07E5: iadd
		// @07E6: bipush 8 (0x08)
		// @07E8: ldc 3355443 (0x333333)
		// @07EA: invokestatic game.C_100196_rb.func_105807_g(int, int, int, int)void
		// @07ED: iload_0
		// @07EE: sipush -30946 (0x871E)
		// @07F1: iadd
		// @07F2: iconst_2
		// @07F3: anewarray java.lang.String
		// @07F6: dup
		// @07F7: iconst_0
		// @07F8: iconst_1
		// @07F9: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @07FC: aastore
		// @07FD: dup
		// @07FE: iconst_1
		// @07FF: bipush 8 (0x08)
		// @0801: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @0804: aastore
		// @0805: getstatic java.lang.String game.C_100094_j.field_104547_d
		// @0808: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @080B: astore #10
		// @080D: getstatic game.C_100317_lb game.C_100311_le.field_104719_A
		// @0810: aload #10
		// @0812: iload #7
		// @0814: bipush 12 (0x0C)
		// @0816: isub
		// @0817: iload #8
		// @0819: bipush -8 (0xF8)
		// @081B: iload #9
		// @081D: iconst_2
		// @081E: idiv
		// @081F: isub
		// @0820: iadd
		// @0821: iconst_3
		// @0822: iadd
		// @0823: ldc 4473924 (0x444444)
		// @0825: iconst_m1
		// @0826: invokevirtual game.C_100317_lb.func_101746_a(java.lang.String, int, int, int, int)void
		// @0829: iload #5
		// @082B: putstatic int game.C_100270_mi.field_102270_jc
		// @082E: getstatic int game.C_100096_un.field_104563_d
		// @0831: iconst_m1
		// @0832: ixor
		// @0833: iconst_m1
		// @0834: if_icmpge @08E7
		// @0837: sipush 154 (0x009A)
		// @083A: istore #8
		// @083C: bipush 16 (0x10)
		// @083E: istore #9
		// @0840: bipush -16 (0xF0)
		// @0842: sipush 640 (0x0280)
		// @0845: iload #8
		// @0847: isub
		// @0848: iadd
		// @0849: istore #10
		// @084B: sipush 378 (0x017A)
		// @084E: istore #11
		// @0850: sipush 1000 (0x03E8)
		// @0853: istore #12
		// @0855: getstatic int game.C_100096_un.field_104563_d
		// @0858: istore #13
		// @085A: iload #13
		// @085C: iload #8
		// @085E: imul
		// @085F: iload #12
		// @0861: idiv
		// @0862: istore #14
		// @0864: iload #10
		// @0866: iload #11
		// @0868: iload #14
		// @086A: iconst_m1
		// @086B: iload #9
		// @086D: iadd
		// @086E: ldc 2061990 (0x1f76a6)
		// @0870: invokestatic game.C_100196_rb.func_105782_i(int, int, int, int, int)void
		// @0873: bipush 100 (0x64)
		// @0875: istore #15
		// @0877: iload #15
		// @0879: iload #12
		// @087B: if_icmpge @08A7
		// @087E: iload #10
		// @0880: iload #8
		// @0882: iload #15
		// @0884: imul
		// @0885: iload #12
		// @0887: idiv
		// @0888: ineg
		// @0889: isub
		// @088A: istore #16
		// @088C: iload #16
		// @088E: iload #11
		// @0890: iload #9
		// @0892: iconst_0
		// @0893: invokestatic game.C_100196_rb.func_105778_a(int, int, int, int)void
		// @0896: iinc #15 +100
		// @0899: iload #31
		// @089B: ifne @08BF
		// @089E: iload #31
		// @08A0: ifeq @0877
		// @08A3: goto @08A7
		// @08A6: athrow
		// @08A7: bipush -2 (0xFE)
		// @08A9: iload #10
		// @08AB: iadd
		// @08AC: bipush -2 (0xFE)
		// @08AE: iload #11
		// @08B0: iadd
		// @08B1: iload #8
		// @08B3: bipush -4 (0xFC)
		// @08B5: isub
		// @08B6: iconst_4
		// @08B7: iload #9
		// @08B9: iadd
		// @08BA: ldc 4408131 (0x434343)
		// @08BC: invokestatic game.C_100196_rb.func_105784_h(int, int, int, int, int)void
		// @08BF: getstatic game.C_100317_lb game.C_100311_le.field_104719_A
		// @08C2: new java.lang.StringBuilder
		// @08C5: dup
		// @08C6: invokespecial java.lang.StringBuilder.<init>()void
		// @08C9: getstatic java.lang.String game.C_100294_ki.field_106973_R
		// @08CC: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @08CF: iload #13
		// @08D1: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @08D4: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @08D7: iload #10
		// @08D9: iload #8
		// @08DB: iadd
		// @08DC: bipush -4 (0xFC)
		// @08DE: iload #11
		// @08E0: iadd
		// @08E1: ldc 16777215 (0xffffff)
		// @08E3: iconst_m1
		// @08E4: invokevirtual game.C_100317_lb.func_101746_a(java.lang.String, int, int, int, int)void
		// @08E7: iconst_0
		// @08E8: istore #8
		// @08EA: iconst_0
		// @08EB: istore #9
		// @08ED: iconst_0
		// @08EE: istore #10
		// @08F0: getstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @08F3: bipush 22 (0x16)
		// @08F5: invokevirtual game.C_100327_ib.func_102471_o(int)int
		// @08F8: istore #6
		// @08FA: getstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @08FD: bipush -69 (0xBB)
		// @08FF: invokevirtual game.C_100327_ib.func_102466_i(int)int
		// @0902: i2d
		// @0903: getstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @0906: iconst_0
		// @0907: invokevirtual game.C_100327_ib.func_102447_l(int)int
		// @090A: i2d
		// @090B: invokestatic java.lang.Math.sqrt(double)double
		// @090E: ddiv
		// @090F: d2i
		// @0910: istore #11
		// @0912: iload #11
		// @0914: iconst_m1
		// @0915: ixor
		// @0916: iconst_m1
		// @0917: if_icmple @091D
		// @091A: iconst_0
		// @091B: istore #11
		// @091D: getstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @0920: bipush 30 (0x1E)
		// @0922: invokevirtual game.C_100327_ib.func_102445_j(int)int
		// @0925: i2d
		// @0926: getstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @0929: iconst_0
		// @092A: invokevirtual game.C_100327_ib.func_102447_l(int)int
		// @092D: i2d
		// @092E: invokestatic java.lang.Math.sqrt(double)double
		// @0931: ddiv
		// @0932: d2i
		// @0933: istore #12
		// @0935: iconst_m1
		// @0936: iload #12
		// @0938: iconst_m1
		// @0939: ixor
		// @093A: if_icmpge @0940
		// @093D: iconst_0
		// @093E: istore #12
		// @0940: iconst_0
		// @0941: istore #13
		// @0943: iconst_0
		// @0944: istore #14
		// @0946: iconst_0
		// @0947: istore #15
		// @0949: iconst_0
		// @094A: istore #16
		// @094C: iload #16
		// @094E: iconst_m1
		// @094F: ixor
		// @0950: getstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @0953: sipush -3099 (0xF3E5)
		// @0956: invokevirtual game.C_100327_ib.func_102460_q(int)int
		// @0959: iconst_m1
		// @095A: ixor
		// @095B: if_icmple @0B95
		// @095E: getstatic int[] game.C_100301_kb.field_107089_g
		// @0961: iload #16
		// @0963: iaload
		// @0964: istore #17
		// @0966: iconst_m1
		// @0967: iload #17
		// @0969: iconst_m1
		// @096A: ixor
		// @096B: iload #31
		// @096D: ifne @0BA5
		// @0970: if_icmpne @0980
		// @0973: goto @0977
		// @0976: athrow
		// @0977: iload #31
		// @0979: ifeq @0A8B
		// @097C: goto @0980
		// @097F: athrow
		// @0980: iload #17
		// @0982: iconst_1
		// @0983: if_icmpeq @0A97
		// @0986: goto @098A
		// @0989: athrow
		// @098A: iload #17
		// @098C: iconst_m1
		// @098D: ixor
		// @098E: bipush -3 (0xFD)
		// @0990: if_icmpeq @0AA3
		// @0993: goto @0997
		// @0996: athrow
		// @0997: iload #17
		// @0999: iconst_m1
		// @099A: ixor
		// @099B: bipush -4 (0xFC)
		// @099D: if_icmpeq @0AAF
		// @09A0: goto @09A4
		// @09A3: athrow
		// @09A4: iload #17
		// @09A6: iconst_4
		// @09A7: if_icmpne @09B7
		// @09AA: goto @09AE
		// @09AD: athrow
		// @09AE: iload #31
		// @09B0: ifeq @0ABB
		// @09B3: goto @09B7
		// @09B6: athrow
		// @09B7: iload #17
		// @09B9: iconst_m1
		// @09BA: ixor
		// @09BB: bipush -21 (0xEB)
		// @09BD: if_icmpeq @0AC7
		// @09C0: goto @09C4
		// @09C3: athrow
		// @09C4: iconst_5
		// @09C5: iload #17
		// @09C7: if_icmpeq @0AD3
		// @09CA: goto @09CE
		// @09CD: athrow
		// @09CE: bipush 6 (0x06)
		// @09D0: iload #17
		// @09D2: if_icmpne @09E2
		// @09D5: goto @09D9
		// @09D8: athrow
		// @09D9: iload #31
		// @09DB: ifeq @0ADF
		// @09DE: goto @09E2
		// @09E1: athrow
		// @09E2: iload #17
		// @09E4: iconst_m1
		// @09E5: ixor
		// @09E6: bipush -8 (0xF8)
		// @09E8: if_icmpeq @0AEB
		// @09EB: goto @09EF
		// @09EE: athrow
		// @09EF: iload #17
		// @09F1: iconst_m1
		// @09F2: ixor
		// @09F3: bipush -9 (0xF7)
		// @09F5: if_icmpne @0A05
		// @09F8: goto @09FC
		// @09FB: athrow
		// @09FC: iload #31
		// @09FE: ifeq @0AF7
		// @0A01: goto @0A05
		// @0A04: athrow
		// @0A05: bipush 9 (0x09)
		// @0A07: iload #17
		// @0A09: if_icmpeq @0B03
		// @0A0C: goto @0A10
		// @0A0F: athrow
		// @0A10: iload #17
		// @0A12: iconst_m1
		// @0A13: ixor
		// @0A14: bipush -11 (0xF5)
		// @0A16: if_icmpne @0A26
		// @0A19: goto @0A1D
		// @0A1C: athrow
		// @0A1D: iload #31
		// @0A1F: ifeq @0B0F
		// @0A22: goto @0A26
		// @0A25: athrow
		// @0A26: iload #17
		// @0A28: bipush 11 (0x0B)
		// @0A2A: if_icmpeq @0B1B
		// @0A2D: goto @0A31
		// @0A30: athrow
		// @0A31: bipush -13 (0xF3)
		// @0A33: iload #17
		// @0A35: iconst_m1
		// @0A36: ixor
		// @0A37: if_icmpeq @0B2A
		// @0A3A: goto @0A3E
		// @0A3D: athrow
		// @0A3E: iload #17
		// @0A40: iconst_m1
		// @0A41: ixor
		// @0A42: bipush -14 (0xF2)
		// @0A44: if_icmpne @0A54
		// @0A47: goto @0A4B
		// @0A4A: athrow
		// @0A4B: iload #31
		// @0A4D: ifeq @0B39
		// @0A50: goto @0A54
		// @0A53: athrow
		// @0A54: iload #17
		// @0A56: iconst_m1
		// @0A57: ixor
		// @0A58: bipush -15 (0xF1)
		// @0A5A: if_icmpeq @0B48
		// @0A5D: goto @0A61
		// @0A60: athrow
		// @0A61: bipush 28 (0x1C)
		// @0A63: iload #17
		// @0A65: if_icmpeq @0B57
		// @0A68: goto @0A6C
		// @0A6B: athrow
		// @0A6C: iload #17
		// @0A6E: bipush 29 (0x1D)
		// @0A70: if_icmpeq @0B5F
		// @0A73: goto @0A77
		// @0A76: athrow
		// @0A77: iload #17
		// @0A79: bipush 34 (0x22)
		// @0A7B: if_icmpne @0B70
		// @0A7E: goto @0A82
		// @0A81: athrow
		// @0A82: iload #31
		// @0A84: ifeq @0B67
		// @0A87: goto @0A8B
		// @0A8A: athrow
		// @0A8B: iinc #10 +1
		// @0A8E: iload #31
		// @0A90: ifeq @0B70
		// @0A93: goto @0A97
		// @0A96: athrow
		// @0A97: iinc #10 +2
		// @0A9A: iload #31
		// @0A9C: ifeq @0B70
		// @0A9F: goto @0AA3
		// @0AA2: athrow
		// @0AA3: iinc #10 +3
		// @0AA6: iload #31
		// @0AA8: ifeq @0B70
		// @0AAB: goto @0AAF
		// @0AAE: athrow
		// @0AAF: iinc #10 +4
		// @0AB2: iload #31
		// @0AB4: ifeq @0B70
		// @0AB7: goto @0ABB
		// @0ABA: athrow
		// @0ABB: iinc #10 +5
		// @0ABE: iload #31
		// @0AC0: ifeq @0B70
		// @0AC3: goto @0AC7
		// @0AC6: athrow
		// @0AC7: iinc #10 +10
		// @0ACA: iload #31
		// @0ACC: ifeq @0B70
		// @0ACF: goto @0AD3
		// @0AD2: athrow
		// @0AD3: iinc #9 +1
		// @0AD6: iload #31
		// @0AD8: ifeq @0B70
		// @0ADB: goto @0ADF
		// @0ADE: athrow
		// @0ADF: iinc #9 +2
		// @0AE2: iload #31
		// @0AE4: ifeq @0B70
		// @0AE7: goto @0AEB
		// @0AEA: athrow
		// @0AEB: iinc #9 +3
		// @0AEE: iload #31
		// @0AF0: ifeq @0B70
		// @0AF3: goto @0AF7
		// @0AF6: athrow
		// @0AF7: iinc #9 +4
		// @0AFA: iload #31
		// @0AFC: ifeq @0B70
		// @0AFF: goto @0B03
		// @0B02: athrow
		// @0B03: iinc #9 +5
		// @0B06: iload #31
		// @0B08: ifeq @0B70
		// @0B0B: goto @0B0F
		// @0B0E: athrow
		// @0B0F: iinc #8 +100
		// @0B12: iload #31
		// @0B14: ifeq @0B70
		// @0B17: goto @0B1B
		// @0B1A: athrow
		// @0B1B: wide (iinc) #8 +200
		// @0B21: iload #31
		// @0B23: ifeq @0B70
		// @0B26: goto @0B2A
		// @0B29: athrow
		// @0B2A: wide (iinc) #8 +500
		// @0B30: iload #31
		// @0B32: ifeq @0B70
		// @0B35: goto @0B39
		// @0B38: athrow
		// @0B39: wide (iinc) #8 +1000
		// @0B3F: iload #31
		// @0B41: ifeq @0B70
		// @0B44: goto @0B48
		// @0B47: athrow
		// @0B48: wide (iinc) #8 +2000
		// @0B4E: iload #31
		// @0B50: ifeq @0B70
		// @0B53: goto @0B57
		// @0B56: athrow
		// @0B57: iconst_1
		// @0B58: istore #13
		// @0B5A: iload #31
		// @0B5C: ifeq @0B70
		// @0B5F: iconst_1
		// @0B60: istore #14
		// @0B62: iload #31
		// @0B64: ifeq @0B70
		// @0B67: iconst_1
		// @0B68: istore #14
		// @0B6A: iconst_1
		// @0B6B: istore #13
		// @0B6D: iconst_1
		// @0B6E: istore #15
		// @0B70: iconst_m1
		// @0B71: getstatic int[] game.C_100301_kb.field_107089_g
		// @0B74: iload #16
		// @0B76: iaload
		// @0B77: if_icmpne @0B7E
		// @0B7A: goto @0B8D
		// @0B7D: athrow
		// @0B7E: iload #6
		// @0B80: getstatic int[] game.C_100021_wn.field_103870_e
		// @0B83: getstatic int[] game.C_100301_kb.field_107089_g
		// @0B86: iload #16
		// @0B88: iaload
		// @0B89: iaload
		// @0B8A: iadd
		// @0B8B: istore #6
		// @0B8D: iinc #16 +1
		// @0B90: iload #31
		// @0B92: ifeq @094C
		// @0B95: iload #14
		// @0B97: ifne @0B9E
		// @0B9A: goto @0BA8
		// @0B9D: athrow
		// @0B9E: bipush 17 (0x11)
		// @0BA0: iload #12
		// @0BA2: imul
		// @0BA3: bipush 10 (0x0A)
		// @0BA5: idiv
		// @0BA6: istore #12
		// @0BA8: iload #15
		// @0BAA: ifeq @0BBE
		// @0BAD: sipush 6100 (0x17D4)
		// @0BB0: istore #6
		// @0BB2: iinc #10 +25
		// @0BB5: wide (iinc) #8 +3800
		// @0BBB: iinc #9 +15
		// @0BBE: iload #13
		// @0BC0: ifeq @0BCD
		// @0BC3: bipush 17 (0x11)
		// @0BC5: iload #11
		// @0BC7: imul
		// @0BC8: bipush 10 (0x0A)
		// @0BCA: idiv
		// @0BCB: istore #11
		// @0BCD: iinc #11 +251
		// @0BD0: aconst_null
		// @0BD1: getstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @0BD4: bipush 59 (0x3B)
		// @0BD6: bipush 124 (0x7C)
		// @0BD8: invokevirtual game.C_100327_ib.func_102467_c(int, int)game.C_100327_ib
		// @0BDB: if_acmpeq @0BE5
		// @0BDE: iinc #11 +5
		// @0BE1: goto @0BE5
		// @0BE4: athrow
		// @0BE5: iload #11
		// @0BE7: iflt @0BEE
		// @0BEA: goto @0BF1
		// @0BED: athrow
		// @0BEE: iconst_0
		// @0BEF: istore #11
		// @0BF1: iinc #10 +1
		// @0BF4: iload #11
		// @0BF6: iconst_m1
		// @0BF7: ixor
		// @0BF8: bipush -21 (0xEB)
		// @0BFA: if_icmplt @0C01
		// @0BFD: goto @0C05
		// @0C00: athrow
		// @0C01: bipush 20 (0x14)
		// @0C03: istore #11
		// @0C05: iinc #9 +2
		// @0C08: iload #9
		// @0C0A: putstatic int game.C_100015_wh.field_103793_h
		// @0C0D: iload_1
		// @0C0E: ifne @103B
		// @0C11: bipush 6 (0x06)
		// @0C13: anewarray java.lang.String
		// @0C16: dup
		// @0C17: iconst_0
		// @0C18: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @0C1B: bipush 14 (0x0E)
		// @0C1D: aaload
		// @0C1E: aastore
		// @0C1F: dup
		// @0C20: iconst_1
		// @0C21: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @0C24: bipush 32 (0x20)
		// @0C26: aaload
		// @0C27: aastore
		// @0C28: dup
		// @0C29: iconst_2
		// @0C2A: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @0C2D: bipush 31 (0x1F)
		// @0C2F: aaload
		// @0C30: aastore
		// @0C31: dup
		// @0C32: iconst_3
		// @0C33: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @0C36: bipush 15 (0x0F)
		// @0C38: aaload
		// @0C39: aastore
		// @0C3A: dup
		// @0C3B: iconst_4
		// @0C3C: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @0C3F: bipush 34 (0x22)
		// @0C41: aaload
		// @0C42: aastore
		// @0C43: dup
		// @0C44: iconst_5
		// @0C45: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @0C48: bipush 11 (0x0B)
		// @0C4A: aaload
		// @0C4B: aastore
		// @0C4C: astore #16
		// @0C4E: bipush 6 (0x06)
		// @0C50: newarray int[]
		// @0C52: dup
		// @0C53: iconst_0
		// @0C54: iconst_0
		// @0C55: iastore
		// @0C56: dup
		// @0C57: iconst_1
		// @0C58: iconst_0
		// @0C59: iastore
		// @0C5A: dup
		// @0C5B: iconst_2
		// @0C5C: iconst_0
		// @0C5D: iastore
		// @0C5E: dup
		// @0C5F: iconst_3
		// @0C60: iconst_0
		// @0C61: iastore
		// @0C62: dup
		// @0C63: iconst_4
		// @0C64: iconst_0
		// @0C65: iastore
		// @0C66: dup
		// @0C67: iconst_5
		// @0C68: iconst_0
		// @0C69: iastore
		// @0C6A: astore #17
		// @0C6C: aload #17
		// @0C6E: iconst_0
		// @0C6F: getstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @0C72: iconst_0
		// @0C73: invokevirtual game.C_100327_ib.func_102447_l(int)int
		// @0C76: iastore
		// @0C77: bipush 6 (0x06)
		// @0C79: newarray int[]
		// @0C7B: dup
		// @0C7C: iconst_0
		// @0C7D: sipush 1000 (0x03E8)
		// @0C80: iastore
		// @0C81: dup
		// @0C82: iconst_1
		// @0C83: sipush 1000 (0x03E8)
		// @0C86: iastore
		// @0C87: dup
		// @0C88: iconst_2
		// @0C89: bipush 10 (0x0A)
		// @0C8B: iastore
		// @0C8C: dup
		// @0C8D: iconst_3
		// @0C8E: bipush 11 (0x0B)
		// @0C90: iastore
		// @0C91: dup
		// @0C92: iconst_4
		// @0C93: bipush 10 (0x0A)
		// @0C95: iastore
		// @0C96: dup
		// @0C97: iconst_5
		// @0C98: bipush 20 (0x14)
		// @0C9A: iastore
		// @0C9B: astore #18
		// @0C9D: aload #17
		// @0C9F: iconst_5
		// @0CA0: iload #12
		// @0CA2: iastore
		// @0CA3: iload #15
		// @0CA5: ifeq @0CB4
		// @0CA8: aload #17
		// @0CAA: iconst_0
		// @0CAB: dup2
		// @0CAC: iaload
		// @0CAD: iconst_2
		// @0CAE: imul
		// @0CAF: iastore
		// @0CB0: goto @0CB4
		// @0CB3: athrow
		// @0CB4: aload #17
		// @0CB6: iconst_3
		// @0CB7: iload #10
		// @0CB9: iastore
		// @0CBA: aload #17
		// @0CBC: iconst_4
		// @0CBD: iload #11
		// @0CBF: iastore
		// @0CC0: aload #17
		// @0CC2: iconst_1
		// @0CC3: iload #8
		// @0CC5: iastore
		// @0CC6: aload #17
		// @0CC8: iconst_2
		// @0CC9: iload #9
		// @0CCB: iastore
		// @0CCC: sipush 220 (0x00DC)
		// @0CCF: istore #19
		// @0CD1: sipush 394 (0x018A)
		// @0CD4: istore #20
		// @0CD6: bipush 100 (0x64)
		// @0CD8: istore #21
		// @0CDA: iconst_0
		// @0CDB: istore #22
		// @0CDD: iload #22
		// @0CDF: iconst_m1
		// @0CE0: ixor
		// @0CE1: bipush -7 (0xF9)
		// @0CE3: if_icmple @103B
		// @0CE6: getstatic game.C_100317_lb game.C_100311_le.field_104719_A
		// @0CE9: aload #16
		// @0CEB: iload #22
		// @0CED: aaload
		// @0CEE: iload #19
		// @0CF0: iload #20
		// @0CF2: iconst_0
		// @0CF3: iconst_m1
		// @0CF4: invokevirtual game.C_100317_lb.func_101749_c(java.lang.String, int, int, int, int)void
		// @0CF7: getstatic int game.C_100015_wh.field_103781_g
		// @0CFA: iload #19
		// @0CFC: iload #31
		// @0CFE: ifne @103F
		// @0D01: if_icmplt @0D44
		// @0D04: goto @0D08
		// @0D07: athrow
		// @0D08: getstatic int game.C_100015_wh.field_103781_g
		// @0D0B: iload #21
		// @0D0D: bipush 18 (0x12)
		// @0D0F: iload #19
		// @0D11: iadd
		// @0D12: iadd
		// @0D13: if_icmpge @0D44
		// @0D16: goto @0D1A
		// @0D19: athrow
		// @0D1A: bipush -10 (0xF6)
		// @0D1C: iload #20
		// @0D1E: iadd
		// @0D1F: iconst_m1
		// @0D20: ixor
		// @0D21: getstatic int game.C_100338_jc.field_105370_l
		// @0D24: iconst_m1
		// @0D25: ixor
		// @0D26: if_icmplt @0D44
		// @0D29: goto @0D2D
		// @0D2C: athrow
		// @0D2D: iload #20
		// @0D2F: iconst_m1
		// @0D30: isub
		// @0D31: iconst_m1
		// @0D32: ixor
		// @0D33: getstatic int game.C_100338_jc.field_105370_l
		// @0D36: iconst_m1
		// @0D37: ixor
		// @0D38: if_icmpge @0D44
		// @0D3B: goto @0D3F
		// @0D3E: athrow
		// @0D3F: iconst_1
		// @0D40: goto @0D45
		// @0D43: athrow
		// @0D44: iconst_0
		// @0D45: istore #23
		// @0D47: bipush 18 (0x12)
		// @0D49: iload #19
		// @0D4B: iadd
		// @0D4C: bipush -10 (0xF6)
		// @0D4E: iload #20
		// @0D50: iadd
		// @0D51: iload #21
		// @0D53: bipush 11 (0x0B)
		// @0D55: ldc 1400960 (0x156080)
		// @0D57: invokestatic game.C_100196_rb.func_105784_h(int, int, int, int, int)void
		// @0D5A: aload #17
		// @0D5C: iload #22
		// @0D5E: iaload
		// @0D5F: iconst_m1
		// @0D60: ixor
		// @0D61: aload #18
		// @0D63: iload #22
		// @0D65: iaload
		// @0D66: iconst_2
		// @0D67: imul
		// @0D68: iconst_m1
		// @0D69: ixor
		// @0D6A: if_icmpge @0D90
		// @0D6D: iconst_2
		// @0D6E: bipush 18 (0x12)
		// @0D70: iload #19
		// @0D72: iadd
		// @0D73: iadd
		// @0D74: iconst_2
		// @0D75: bipush -10 (0xF6)
		// @0D77: iload #20
		// @0D79: iadd
		// @0D7A: iadd
		// @0D7B: bipush -4 (0xFC)
		// @0D7D: iload #21
		// @0D7F: iadd
		// @0D80: bipush 7 (0x07)
		// @0D82: ldc 16777215 (0xffffff)
		// @0D84: invokestatic game.C_100196_rb.func_105782_i(int, int, int, int, int)void
		// @0D87: iload #31
		// @0D89: ifeq @0E47
		// @0D8C: goto @0D90
		// @0D8F: athrow
		// @0D90: aload #18
		// @0D92: iload #22
		// @0D94: iaload
		// @0D95: iconst_m1
		// @0D96: ixor
		// @0D97: aload #17
		// @0D99: iload #22
		// @0D9B: iaload
		// @0D9C: iconst_m1
		// @0D9D: ixor
		// @0D9E: if_icmple @0DF5
		// @0DA1: goto @0DA5
		// @0DA4: athrow
		// @0DA5: iconst_2
		// @0DA6: iload #19
		// @0DA8: bipush 18 (0x12)
		// @0DAA: iadd
		// @0DAB: iadd
		// @0DAC: iconst_2
		// @0DAD: iload #20
		// @0DAF: bipush 10 (0x0A)
		// @0DB1: isub
		// @0DB2: iadd
		// @0DB3: bipush -4 (0xFC)
		// @0DB5: iload #21
		// @0DB7: iadd
		// @0DB8: bipush 7 (0x07)
		// @0DBA: ldc 8421504 (0x808080)
		// @0DBC: invokestatic game.C_100196_rb.func_105782_i(int, int, int, int, int)void
		// @0DBF: iconst_2
		// @0DC0: iload #19
		// @0DC2: bipush 18 (0x12)
		// @0DC4: iadd
		// @0DC5: iadd
		// @0DC6: iconst_2
		// @0DC7: iload #20
		// @0DC9: iadd
		// @0DCA: bipush -10 (0xF6)
		// @0DCC: iadd
		// @0DCD: aload #18
		// @0DCF: iload #22
		// @0DD1: iaload
		// @0DD2: ineg
		// @0DD3: aload #17
		// @0DD5: iload #22
		// @0DD7: iaload
		// @0DD8: iadd
		// @0DD9: bipush -4 (0xFC)
		// @0DDB: iload #21
		// @0DDD: iadd
		// @0DDE: imul
		// @0DDF: aload #18
		// @0DE1: iload #22
		// @0DE3: iaload
		// @0DE4: idiv
		// @0DE5: bipush 7 (0x07)
		// @0DE7: ldc 16777215 (0xffffff)
		// @0DE9: invokestatic game.C_100196_rb.func_105782_i(int, int, int, int, int)void
		// @0DEC: iload #31
		// @0DEE: ifeq @0E47
		// @0DF1: goto @0DF5
		// @0DF4: athrow
		// @0DF5: aload #17
		// @0DF7: iload #22
		// @0DF9: iaload
		// @0DFA: ifle @0E30
		// @0DFD: goto @0E01
		// @0E00: athrow
		// @0E01: bipush 18 (0x12)
		// @0E03: iload #19
		// @0E05: iconst_2
		// @0E06: iadd
		// @0E07: iadd
		// @0E08: iconst_2
		// @0E09: bipush -10 (0xF6)
		// @0E0B: iload #20
		// @0E0D: iadd
		// @0E0E: iadd
		// @0E0F: iload #21
		// @0E11: bipush -4 (0xFC)
		// @0E13: iadd
		// @0E14: aload #17
		// @0E16: iload #22
		// @0E18: iaload
		// @0E19: imul
		// @0E1A: aload #18
		// @0E1C: iload #22
		// @0E1E: iaload
		// @0E1F: idiv
		// @0E20: bipush 7 (0x07)
		// @0E22: ldc 8421504 (0x808080)
		// @0E24: invokestatic game.C_100196_rb.func_105782_i(int, int, int, int, int)void
		// @0E27: iload #31
		// @0E29: ifeq @0E47
		// @0E2C: goto @0E30
		// @0E2F: athrow
		// @0E30: iload #19
		// @0E32: bipush 18 (0x12)
		// @0E34: iadd
		// @0E35: bipush -10 (0xF6)
		// @0E37: iload #20
		// @0E39: iadd
		// @0E3A: iload #21
		// @0E3C: bipush 11 (0x0B)
		// @0E3E: ldc 8400933 (0x803025)
		// @0E40: invokestatic game.C_100196_rb.func_105784_h(int, int, int, int, int)void
		// @0E43: goto @0E47
		// @0E46: athrow
		// @0E47: bipush -2 (0xFE)
		// @0E49: iload #22
		// @0E4B: iconst_m1
		// @0E4C: ixor
		// @0E4D: if_icmple @0EA8
		// @0E50: iload #22
		// @0E52: iconst_m1
		// @0E53: ixor
		// @0E54: bipush -3 (0xFD)
		// @0E56: if_icmpne @0EF0
		// @0E59: goto @0E5D
		// @0E5C: athrow
		// @0E5D: iconst_1
		// @0E5E: istore #24
		// @0E60: iload #24
		// @0E62: aload #18
		// @0E64: iload #22
		// @0E66: iaload
		// @0E67: if_icmpge @0EA3
		// @0E6A: iconst_2
		// @0E6B: bipush 18 (0x12)
		// @0E6D: iload #19
		// @0E6F: iload #21
		// @0E71: bipush -4 (0xFC)
		// @0E73: iadd
		// @0E74: iload #24
		// @0E76: imul
		// @0E77: aload #18
		// @0E79: iload #22
		// @0E7B: iaload
		// @0E7C: idiv
		// @0E7D: ineg
		// @0E7E: isub
		// @0E7F: iadd
		// @0E80: iadd
		// @0E81: iconst_2
		// @0E82: iload #20
		// @0E84: iadd
		// @0E85: bipush -10 (0xF6)
		// @0E87: iadd
		// @0E88: bipush 7 (0x07)
		// @0E8A: ldc 4473924 (0x444444)
		// @0E8C: sipush 192 (0x00C0)
		// @0E8F: invokestatic game.C_100196_rb.func_105805_b(int, int, int, int, int)void
		// @0E92: iinc #24 +1
		// @0E95: iload #31
		// @0E97: ifne @0EF0
		// @0E9A: iload #31
		// @0E9C: ifeq @0E60
		// @0E9F: goto @0EA3
		// @0EA2: athrow
		// @0EA3: iload #31
		// @0EA5: ifeq @0EF0
		// @0EA8: bipush 100 (0x64)
		// @0EAA: istore #24
		// @0EAC: iload #24
		// @0EAE: iconst_m1
		// @0EAF: ixor
		// @0EB0: aload #18
		// @0EB2: iload #22
		// @0EB4: iaload
		// @0EB5: iconst_m1
		// @0EB6: ixor
		// @0EB7: if_icmple @0EF0
		// @0EBA: bipush 20 (0x14)
		// @0EBC: iload #19
		// @0EBE: iadd
		// @0EBF: iload #24
		// @0EC1: iload #21
		// @0EC3: iconst_4
		// @0EC4: isub
		// @0EC5: imul
		// @0EC6: aload #18
		// @0EC8: iload #22
		// @0ECA: iaload
		// @0ECB: idiv
		// @0ECC: iadd
		// @0ECD: bipush -10 (0xF6)
		// @0ECF: iload #20
		// @0ED1: iadd
		// @0ED2: bipush -2 (0xFE)
		// @0ED4: isub
		// @0ED5: bipush 7 (0x07)
		// @0ED7: ldc 4473924 (0x444444)
		// @0ED9: sipush 192 (0x00C0)
		// @0EDC: invokestatic game.C_100196_rb.func_105805_b(int, int, int, int, int)void
		// @0EDF: iinc #24 +100
		// @0EE2: iload #31
		// @0EE4: ifne @1013
		// @0EE7: iload #31
		// @0EE9: ifeq @0EAC
		// @0EEC: goto @0EF0
		// @0EEF: athrow
		// @0EF0: iload #23
		// @0EF2: ifeq @1013
		// @0EF5: iload #19
		// @0EF7: bipush -18 (0xEE)
		// @0EF9: iload #21
		// @0EFB: iconst_2
		// @0EFC: idiv
		// @0EFD: isub
		// @0EFE: isub
		// @0EFF: istore #24
		// @0F01: bipush 12 (0x0C)
		// @0F03: istore #25
		// @0F05: sipush 382 (0x017E)
		// @0F08: iload #25
		// @0F0A: isub
		// @0F0B: istore #26
		// @0F0D: aconst_null
		// @0F0E: astore #27
		// @0F10: aconst_null
		// @0F11: astore #28
		// @0F13: aload #17
		// @0F15: iload #22
		// @0F17: iaload
		// @0F18: istore #29
		// @0F1A: iload #22
		// @0F1C: istore #30
		// @0F1E: iconst_3
		// @0F1F: iload #30
		// @0F21: if_icmpne @0F2D
		// @0F24: iload #31
		// @0F26: ifeq @0F45
		// @0F29: goto @0F2D
		// @0F2C: athrow
		// @0F2D: iconst_4
		// @0F2E: iload #30
		// @0F30: if_icmpeq @0F53
		// @0F33: goto @0F37
		// @0F36: athrow
		// @0F37: iconst_5
		// @0F38: iload #30
		// @0F3A: if_icmpeq @0F62
		// @0F3D: goto @0F41
		// @0F40: athrow
		// @0F41: goto @0F6C
		// @0F44: athrow
		// @0F45: bipush 50 (0x32)
		// @0F47: iload #29
		// @0F49: imul
		// @0F4A: iconst_3
		// @0F4B: idiv
		// @0F4C: istore #29
		// @0F4E: iload #31
		// @0F50: ifeq @0F6C
		// @0F53: bipush 100 (0x64)
		// @0F55: iload #29
		// @0F57: imul
		// @0F58: bipush 10 (0x0A)
		// @0F5A: idiv
		// @0F5B: istore #29
		// @0F5D: iload #31
		// @0F5F: ifeq @0F6C
		// @0F62: bipush 100 (0x64)
		// @0F64: iload #29
		// @0F66: imul
		// @0F67: bipush 20 (0x14)
		// @0F69: idiv
		// @0F6A: istore #29
		// @0F6C: getstatic java.lang.String[] game.C_100103_eh.field_104665_e
		// @0F6F: iload #22
		// @0F71: iconst_2
		// @0F72: imul
		// @0F73: aaload
		// @0F74: astore #27
		// @0F76: iload_0
		// @0F77: sipush -30946 (0x871E)
		// @0F7A: ixor
		// @0F7B: iconst_1
		// @0F7C: anewarray java.lang.String
		// @0F7F: dup
		// @0F80: iconst_0
		// @0F81: iload #29
		// @0F83: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @0F86: aastore
		// @0F87: getstatic java.lang.String[] game.C_100103_eh.field_104665_e
		// @0F8A: iconst_1
		// @0F8B: iconst_2
		// @0F8C: iload #22
		// @0F8E: imul
		// @0F8F: iadd
		// @0F90: aaload
		// @0F91: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @0F94: astore #28
		// @0F96: aload #17
		// @0F98: iload #22
		// @0F9A: iaload
		// @0F9B: iconst_m1
		// @0F9C: ixor
		// @0F9D: iconst_m1
		// @0F9E: if_icmpeq @0FA5
		// @0FA1: goto @0FAA
		// @0FA4: athrow
		// @0FA5: getstatic java.lang.String game.C_100211_qd.field_102169_Bc
		// @0FA8: astore #28
		// @0FAA: new java.lang.StringBuilder
		// @0FAD: dup
		// @0FAE: invokespecial java.lang.StringBuilder.<init>()void
		// @0FB1: aload #27
		// @0FB3: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0FB6: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @0FB9: bipush 22 (0x16)
		// @0FBB: aaload
		// @0FBC: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0FBF: aload #28
		// @0FC1: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0FC4: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @0FC7: astore #27
		// @0FC9: getstatic game.C_100317_lb game.C_100311_le.field_104719_A
		// @0FCC: aload #27
		// @0FCE: invokevirtual game.C_100317_lb.func_101739_b(java.lang.String)int
		// @0FD1: bipush -8 (0xF8)
		// @0FD3: isub
		// @0FD4: istore #30
		// @0FD6: iload #24
		// @0FD8: iload #30
		// @0FDA: iconst_2
		// @0FDB: idiv
		// @0FDC: isub
		// @0FDD: istore #24
		// @0FDF: iload #24
		// @0FE1: iload #26
		// @0FE3: iload #30
		// @0FE5: iload #25
		// @0FE7: iconst_0
		// @0FE8: sipush 192 (0x00C0)
		// @0FEB: invokestatic game.C_100196_rb.func_105804_g(int, int, int, int, int, int)void
		// @0FEE: iload #24
		// @0FF0: iload #26
		// @0FF2: iload #30
		// @0FF4: iload #25
		// @0FF6: ldc 1400960 (0x156080)
		// @0FF8: sipush 192 (0x00C0)
		// @0FFB: invokestatic game.C_100196_rb.func_105810_f(int, int, int, int, int, int)void
		// @0FFE: getstatic game.C_100317_lb game.C_100311_le.field_104719_A
		// @1001: aload #27
		// @1003: iload #24
		// @1005: bipush -4 (0xFC)
		// @1007: isub
		// @1008: iload #26
		// @100A: bipush -10 (0xF6)
		// @100C: isub
		// @100D: ldc 41727 (0xa2ff)
		// @100F: iconst_m1
		// @1010: invokevirtual game.C_100317_lb.func_101749_c(java.lang.String, int, int, int, int)void
		// @1013: iload #22
		// @1015: iconst_2
		// @1016: irem
		// @1017: iconst_m1
		// @1018: ixor
		// @1019: iconst_m1
		// @101A: if_icmpeq @102C
		// @101D: iinc #20 +15
		// @1020: iinc #19 +136
		// @1023: iload #31
		// @1025: ifeq @1033
		// @1028: goto @102C
		// @102B: athrow
		// @102C: iinc #19 +120
		// @102F: goto @1033
		// @1032: athrow
		// @1033: iinc #22 +1
		// @1036: iload #31
		// @1038: ifeq @0CDD
		// @103B: iconst_1
		// @103C: getstatic int game.C_100200_ba.field_105852_c
		// @103F: if_icmpeq @1117
		// @1042: getstatic int game.C_100200_ba.field_105852_c
		// @1045: iconst_2
		// @1046: iand
		// @1047: iconst_m1
		// @1048: ixor
		// @1049: iconst_m1
		// @104A: if_icmpge @108C
		// @104D: goto @1051
		// @1050: athrow
		// @1051: getstatic game.C_100302_ka game.C_100226_ae.field_106147_g
		// @1054: astore #16
		// @1056: aconst_null
		// @1057: aload #16
		// @1059: if_acmpeq @1087
		// @105C: getstatic boolean game.C_100034_gi.field_104029_d
		// @105F: ifne @1078
		// @1062: goto @1066
		// @1065: athrow
		// @1066: iload_2
		// @1067: ifne @1078
		// @106A: goto @106E
		// @106D: athrow
		// @106E: getstatic boolean game.C_100082_uf.field_100369_g
		// @1071: ifeq @1087
		// @1074: goto @1078
		// @1077: athrow
		// @1078: iconst_4
		// @1079: aload #16
		// @107B: invokestatic game.C_100028_ha.func_103938_a(int, game.C_100302_ka)int
		// @107E: pop
		// @107F: iconst_1
		// @1080: putstatic boolean game.C_100034_gi.field_104029_d
		// @1083: goto @1087
		// @1086: athrow
		// @1087: iload #31
		// @1089: ifeq @1117
		// @108C: iconst_0
		// @108D: bipush 16 (0x10)
		// @108F: getstatic int game.C_100200_ba.field_105852_c
		// @1092: iand
		// @1093: if_icmpge @10D4
		// @1096: goto @109A
		// @1099: athrow
		// @109A: getstatic game.C_100302_ka game.C_100226_ae.field_106147_g
		// @109D: astore #16
		// @109F: aload #16
		// @10A1: ifnull @10CF
		// @10A4: getstatic boolean game.C_100034_gi.field_104029_d
		// @10A7: ifne @10C0
		// @10AA: goto @10AE
		// @10AD: athrow
		// @10AE: iload_2
		// @10AF: ifne @10C0
		// @10B2: goto @10B6
		// @10B5: athrow
		// @10B6: getstatic boolean game.C_100082_uf.field_100369_g
		// @10B9: ifeq @10CF
		// @10BC: goto @10C0
		// @10BF: athrow
		// @10C0: aload #16
		// @10C2: iconst_0
		// @10C3: invokestatic game.C_100290_jm.func_106848_a(game.C_100302_ka, boolean)int
		// @10C6: pop
		// @10C7: iconst_1
		// @10C8: putstatic boolean game.C_100034_gi.field_104029_d
		// @10CB: goto @10CF
		// @10CE: athrow
		// @10CF: iload #31
		// @10D1: ifeq @1117
		// @10D4: iconst_m1
		// @10D5: getstatic int game.C_100200_ba.field_105852_c
		// @10D8: iconst_m1
		// @10D9: ixor
		// @10DA: if_icmpne @1117
		// @10DD: goto @10E1
		// @10E0: athrow
		// @10E1: getstatic game.C_100302_ka game.C_100046_vk.field_102764_yb
		// @10E4: astore #16
		// @10E6: aconst_null
		// @10E7: aload #16
		// @10E9: if_acmpeq @1117
		// @10EC: getstatic boolean game.C_100034_gi.field_104029_d
		// @10EF: ifne @1108
		// @10F2: goto @10F6
		// @10F5: athrow
		// @10F6: iload_2
		// @10F7: ifne @1108
		// @10FA: goto @10FE
		// @10FD: athrow
		// @10FE: getstatic boolean game.C_100082_uf.field_100369_g
		// @1101: ifeq @1117
		// @1104: goto @1108
		// @1107: athrow
		// @1108: ldc 1021128 (0xf94c8)
		// @110A: aload #16
		// @110C: invokestatic game.C_100284_nj.func_106763_a(int, game.C_100302_ka)void
		// @110F: iconst_1
		// @1110: putstatic boolean game.C_100034_gi.field_104029_d
		// @1113: goto @1117
		// @1116: athrow
		// @1117: bipush -2 (0xFE)
		// @1119: getstatic int game.C_100068_vc.field_104343_e
		// @111C: iconst_m1
		// @111D: ixor
		// @111E: if_icmpeq @1145
		// @1121: getstatic int game.C_100068_vc.field_104343_e
		// @1124: iconst_m1
		// @1125: ixor
		// @1126: iconst_m1
		// @1127: if_icmpne @1132
		// @112A: goto @112E
		// @112D: athrow
		// @112E: goto @1145
		// @1131: athrow
		// @1132: sipush 484 (0x01E4)
		// @1135: sipush 412 (0x019C)
		// @1138: sipush -1472 (0xFA40)
		// @113B: iload #6
		// @113D: sipush 140 (0x008C)
		// @1140: bipush 12 (0x0C)
		// @1142: invokestatic game.C_100200_ba.func_105844_a(int, int, int, int, int, int)void
		// @1145: aconst_null
		// @1146: getstatic game.C_100327_ib game.C_100197_ra.field_100861_k
		// @1149: if_acmpeq @118D
		// @114C: getstatic int game.C_100015_wh.field_103781_g
		// @114F: ifge @115A
		// @1152: goto @1156
		// @1155: athrow
		// @1156: goto @118D
		// @1159: athrow
		// @115A: aconst_null
		// @115B: getstatic game.C_100327_ib game.C_100277_nc.field_106726_a
		// @115E: if_acmpne @1165
		// @1161: goto @1178
		// @1164: athrow
		// @1165: getstatic game.C_100327_ib game.C_100277_nc.field_106726_a
		// @1168: getstatic int game.C_100015_wh.field_103781_g
		// @116B: iconst_0
		// @116C: iconst_0
		// @116D: sipush 8192 (0x2000)
		// @1170: getstatic int game.C_100338_jc.field_105370_l
		// @1173: ldc 759988816 (0x2d4c8250)
		// @1175: invokevirtual game.C_100327_ib.func_102437_a(int, int, boolean, int, int, int)void
		// @1178: getstatic game.C_100327_ib game.C_100197_ra.field_100861_k
		// @117B: getstatic int game.C_100015_wh.field_103781_g
		// @117E: iconst_0
		// @117F: iconst_0
		// @1180: sipush 16384 (0x4000)
		// @1183: getstatic int game.C_100338_jc.field_105370_l
		// @1186: iload_0
		// @1187: ldc 759988817 (0x2d4c8251)
		// @1189: ixor
		// @118A: invokevirtual game.C_100327_ib.func_102437_a(int, int, boolean, int, int, int)void
		// @118D: getstatic int game.C_100174_sb.field_105609_b
		// @1190: iconst_m1
		// @1191: if_icmpeq @11BB
		// @1194: iconst_m1
		// @1195: getstatic int game.C_100015_wh.field_103781_g
		// @1198: iconst_m1
		// @1199: ixor
		// @119A: if_icmplt @11BB
		// @119D: goto @11A1
		// @11A0: athrow
		// @11A1: getstatic game.C_100153_be[] game.C_100242_oh.field_106347_a
		// @11A4: getstatic int game.C_100174_sb.field_105609_b
		// @11A7: aaload
		// @11A8: getstatic int game.C_100015_wh.field_103781_g
		// @11AB: bipush 20 (0x14)
		// @11AD: isub
		// @11AE: getstatic int game.C_100338_jc.field_105370_l
		// @11B1: bipush 20 (0x14)
		// @11B3: isub
		// @11B4: invokevirtual game.C_100153_be.func_105286_a(int, int)void
		// @11B7: goto @11BB
		// @11BA: athrow
		// @11BB: iconst_1
		// @11BC: getstatic int game.C_100200_ba.field_105852_c
		// @11BF: iand
		// @11C0: iconst_m1
		// @11C1: ixor
		// @11C2: iconst_m1
		// @11C3: if_icmpeq @133F
		// @11C6: sipush 224 (0x00E0)
		// @11C9: istore #7
		// @11CB: bipush 62 (0x3E)
		// @11CD: istore #8
		// @11CF: sipush 401 (0x0191)
		// @11D2: istore #9
		// @11D4: bipush 20 (0x14)
		// @11D6: istore #10
		// @11D8: bipush 60 (0x3C)
		// @11DA: istore #11
		// @11DC: getstatic int[] game.C_100280_nf.field_101178_o
		// @11DF: iconst_0
		// @11E0: iaload
		// @11E1: iconst_m1
		// @11E2: invokestatic game.C_100152_bd.func_105179_a(int, int)int
		// @11E5: istore #12
		// @11E7: getstatic int game.C_100013_fn.field_103743_a
		// @11EA: iconst_m1
		// @11EB: ixor
		// @11EC: iload #12
		// @11EE: iconst_m1
		// @11EF: ixor
		// @11F0: if_icmpeq @1257
		// @11F3: iload #12
		// @11F5: putstatic int game.C_100013_fn.field_103743_a
		// @11F8: getstatic int game.C_100066_dl.field_101636_H
		// @11FB: putstatic int game.C_100027_hc.field_102596_Q
		// @11FE: getstatic game.C_100037_wb game.C_100254_pi.field_106457_j
		// @1201: invokevirtual game.C_100037_wb.func_102379_d()void
		// @1204: bipush 20 (0x14)
		// @1206: istore #13
		// @1208: iconst_0
		// @1209: iconst_0
		// @120A: getstatic game.C_100037_wb game.C_100254_pi.field_106457_j
		// @120D: getfield int game.C_100037_wb.field_102341_y
		// @1210: getstatic game.C_100037_wb game.C_100254_pi.field_106457_j
		// @1213: getfield int game.C_100037_wb.field_102340_z
		// @1216: iconst_0
		// @1217: invokestatic game.C_100196_rb.func_105782_i(int, int, int, int, int)void
		// @121A: iconst_0
		// @121B: iconst_0
		// @121C: iload #13
		// @121E: iload #13
		// @1220: invokestatic game.C_100196_rb.func_105815_h(int, int, int, int)void
		// @1223: iconst_0
		// @1224: iload #12
		// @1226: if_icmpgt @1236
		// @1229: iload #12
		// @122B: getstatic game.C_100037_wb[] game.C_100124_tn.field_104936_c
		// @122E: arraylength
		// @122F: if_icmplt @1239
		// @1232: goto @1236
		// @1235: athrow
		// @1236: iconst_0
		// @1237: istore #12
		// @1239: getstatic game.C_100037_wb[] game.C_100124_tn.field_104936_c
		// @123C: iload #12
		// @123E: aaload
		// @123F: iconst_0
		// @1240: iconst_0
		// @1241: iconst_4
		// @1242: iload #13
		// @1244: imul
		// @1245: iload #13
		// @1247: iconst_4
		// @1248: imul
		// @1249: invokevirtual game.C_100037_wb.func_102364_d(int, int, int, int)void
		// @124C: invokestatic game.C_100196_rb.func_105781_a()void
		// @124F: getstatic game.C_100185_rm game.C_100049_vf.field_104206_l
		// @1252: bipush 110 (0x6E)
		// @1254: invokevirtual game.C_100185_rm.func_105476_a(byte)void
		// @1257: iload #12
		// @1259: iflt @133A
		// @125C: getstatic java.lang.String[] game.C_100015_wh.field_103791_j
		// @125F: arraylength
		// @1260: iload #12
		// @1262: if_icmple @133A
		// @1265: goto @1269
		// @1268: athrow
		// @1269: iload_1
		// @126A: ifne @133A
		// @126D: goto @1271
		// @1270: athrow
		// @1271: iload #7
		// @1273: iload #8
		// @1275: iload #9
		// @1277: iload #10
		// @1279: iconst_0
		// @127A: sipush 150 (0x0096)
		// @127D: invokestatic game.C_100196_rb.func_105804_g(int, int, int, int, int, int)void
		// @1280: iload #7
		// @1282: iload #8
		// @1284: iload #9
		// @1286: iload #10
		// @1288: ldc 1397105 (0x155171)
		// @128A: invokestatic game.C_100196_rb.func_105784_h(int, int, int, int, int)void
		// @128D: getstatic java.lang.String[] game.C_100015_wh.field_103791_j
		// @1290: iload #12
		// @1292: aaload
		// @1293: astore #13
		// @1295: iconst_1
		// @1296: iload #7
		// @1298: iadd
		// @1299: iconst_1
		// @129A: iload #8
		// @129C: iadd
		// @129D: iload #7
		// @129F: iload #9
		// @12A1: ineg
		// @12A2: isub
		// @12A3: iconst_m1
		// @12A4: iadd
		// @12A5: iload #10
		// @12A7: iload #8
		// @12A9: iconst_m1
		// @12AA: iadd
		// @12AB: iadd
		// @12AC: invokestatic game.C_100196_rb.func_105815_h(int, int, int, int)void
		// @12AF: getstatic game.C_100317_lb game.C_100311_le.field_104719_A
		// @12B2: aload #13
		// @12B4: invokevirtual game.C_100317_lb.func_101739_b(java.lang.String)int
		// @12B7: istore #14
		// @12B9: getstatic int game.C_100066_dl.field_101636_H
		// @12BC: getstatic int game.C_100027_hc.field_102596_Q
		// @12BF: ineg
		// @12C0: iadd
		// @12C1: istore #15
		// @12C3: iload #9
		// @12C5: iload #14
		// @12C7: iload #11
		// @12C9: iadd
		// @12CA: iadd
		// @12CB: iconst_m1
		// @12CC: ixor
		// @12CD: iload #15
		// @12CF: iconst_m1
		// @12D0: ixor
		// @12D1: if_icmple @12E6
		// @12D4: iload #9
		// @12D6: iload #15
		// @12D8: iload #9
		// @12DA: ineg
		// @12DB: iadd
		// @12DC: iload #14
		// @12DE: iload #11
		// @12E0: ineg
		// @12E1: isub
		// @12E2: irem
		// @12E3: iadd
		// @12E4: istore #15
		// @12E6: bipush 14 (0x0E)
		// @12E8: iload #11
		// @12EA: iadd
		// @12EB: iconst_2
		// @12EC: idiv
		// @12ED: iload #15
		// @12EF: ineg
		// @12F0: iadd
		// @12F1: iload #9
		// @12F3: iload #7
		// @12F5: iadd
		// @12F6: iadd
		// @12F7: istore #16
		// @12F9: iload #7
		// @12FB: iload #9
		// @12FD: iadd
		// @12FE: iload #11
		// @1300: ineg
		// @1301: bipush 14 (0x0E)
		// @1303: isub
		// @1304: iload #16
		// @1306: iadd
		// @1307: if_icmple @1337
		// @130A: getstatic game.C_100317_lb game.C_100311_le.field_104719_A
		// @130D: aload #13
		// @130F: iload #16
		// @1311: bipush -6 (0xFA)
		// @1313: iload #8
		// @1315: iload #10
		// @1317: iadd
		// @1318: iadd
		// @1319: ldc 11119017 (0xa9a9a9)
		// @131B: iconst_m1
		// @131C: invokevirtual game.C_100317_lb.func_101749_c(java.lang.String, int, int, int, int)void
		// @131F: iload #16
		// @1321: iload #11
		// @1323: iload #14
		// @1325: iadd
		// @1326: iadd
		// @1327: istore #16
		// @1329: iload #31
		// @132B: ifne @133A
		// @132E: iload #31
		// @1330: ifeq @12F9
		// @1333: goto @1337
		// @1336: athrow
		// @1337: invokestatic game.C_100196_rb.func_105781_a()void
		// @133A: iload #31
		// @133C: ifeq @1347
		// @133F: iconst_m1
		// @1340: putstatic int game.C_100013_fn.field_103743_a
		// @1343: goto @1347
		// @1346: athrow
		// @1347: getstatic game.C_100317_lb game.C_100311_le.field_104719_A
		// @134A: astore #7
		// @134C: getstatic int game.C_100068_vc.field_104343_e
		// @134F: bipush 15 (0x0F)
		// @1351: if_icmpeq @1358
		// @1354: goto @1364
		// @1357: athrow
		// @1358: getstatic game.C_100067_vd[] game.C_100066_dl.field_101641_u
		// @135B: getstatic int game.C_100068_vc.field_104343_e
		// @135E: aaload
		// @135F: bipush -106 (0x96)
		// @1361: invokevirtual game.C_100067_vd.func_104301_b(int)void
		// @1364: bipush -2 (0xFE)
		// @1366: getstatic int game.C_100200_ba.field_105852_c
		// @1369: iconst_m1
		// @136A: ixor
		// @136B: if_icmpne @1781
		// @136E: iconst_m1
		// @136F: getstatic int game.C_100242_oh.field_106343_d
		// @1372: iconst_m1
		// @1373: ixor
		// @1374: if_icmplt @1781
		// @1377: goto @137B
		// @137A: athrow
		// @137B: getstatic boolean game.C_100064_ve.field_103011_A
		// @137E: ifeq @1781
		// @1381: goto @1385
		// @1384: athrow
		// @1385: getstatic int game.C_100068_vc.field_104343_e
		// @1388: iflt @13AB
		// @138B: goto @138F
		// @138E: athrow
		// @138F: getstatic game.C_100067_vd[] game.C_100066_dl.field_101641_u
		// @1392: getstatic int game.C_100068_vc.field_104343_e
		// @1395: aaload
		// @1396: getstatic int game.C_100242_oh.field_106343_d
		// @1399: iload_0
		// @139A: bipush -3 (0xFD)
		// @139C: iadd
		// @139D: invokevirtual game.C_100067_vd.func_104298_a(int, int)boolean
		// @13A0: ifne @13AB
		// @13A3: goto @13A7
		// @13A6: athrow
		// @13A7: goto @1781
		// @13AA: athrow
		// @13AB: iconst_1
		// @13AC: getstatic int game.C_100242_oh.field_106343_d
		// @13AF: invokestatic game.C_100233_oa.func_106233_a(boolean, int)int[]
		// @13B2: astore #8
		// @13B4: getstatic int game.C_100242_oh.field_106343_d
		// @13B7: bipush -84 (0xAC)
		// @13B9: invokestatic game.C_100192_rf.func_101670_b(int, byte)int[]
		// @13BC: astore #9
		// @13BE: iconst_0
		// @13BF: istore #10
		// @13C1: iconst_0
		// @13C2: istore #11
		// @13C4: aload #8
		// @13C6: astore #12
		// @13C8: iconst_0
		// @13C9: istore #13
		// @13CB: iload #13
		// @13CD: iconst_m1
		// @13CE: ixor
		// @13CF: aload #12
		// @13D1: arraylength
		// @13D2: iconst_m1
		// @13D3: ixor
		// @13D4: if_icmple @1415
		// @13D7: aload #12
		// @13D9: iload #13
		// @13DB: iaload
		// @13DC: istore #14
		// @13DE: getstatic int[] game.C_100242_oh.field_106342_g
		// @13E1: iload #14
		// @13E3: iaload
		// @13E4: istore #15
		// @13E6: iload #14
		// @13E8: getstatic int[] game.C_100257_ln.field_106481_d
		// @13EB: bipush -128 (0x80)
		// @13ED: invokestatic game.C_100097_k.func_104572_a(int, int[], int)boolean
		// @13F0: iload #31
		// @13F2: ifne @141A
		// @13F5: ifne @13FF
		// @13F8: goto @13FC
		// @13FB: athrow
		// @13FC: goto @1406
		// @13FF: iload #11
		// @1401: iload #15
		// @1403: iadd
		// @1404: istore #11
		// @1406: iload #10
		// @1408: iload #15
		// @140A: iadd
		// @140B: istore #10
		// @140D: iinc #13 +1
		// @1410: iload #31
		// @1412: ifeq @13CB
		// @1415: aload #9
		// @1417: astore #12
		// @1419: iconst_0
		// @141A: istore #13
		// @141C: iload #13
		// @141E: aload #12
		// @1420: arraylength
		// @1421: if_icmpge @1461
		// @1424: aload #12
		// @1426: iload #13
		// @1428: iaload
		// @1429: istore #14
		// @142B: getstatic int[] game.C_100328_ia.field_107259_b
		// @142E: iload #14
		// @1430: iaload
		// @1431: istore #15
		// @1433: iload #14
		// @1435: getstatic int[] game.C_100075_uj.field_100655_u
		// @1438: iload_0
		// @1439: bipush -115 (0x8D)
		// @143B: ixor
		// @143C: invokestatic game.C_100097_k.func_104572_a(int, int[], int)boolean
		// @143F: iload #31
		// @1441: ifne @1782
		// @1444: ifeq @1452
		// @1447: goto @144B
		// @144A: athrow
		// @144B: iload #11
		// @144D: iload #15
		// @144F: iadd
		// @1450: istore #11
		// @1452: iload #10
		// @1454: iload #15
		// @1456: iadd
		// @1457: istore #10
		// @1459: iinc #13 +1
		// @145C: iload #31
		// @145E: ifeq @141C
		// @1461: new java.lang.StringBuilder
		// @1464: dup
		// @1465: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @1468: bipush 20 (0x14)
		// @146A: aaload
		// @146B: invokespecial java.lang.StringBuilder.<init>(java.lang.String)void
		// @146E: astore #12
		// @1470: aload #12
		// @1472: getstatic java.lang.String[] game.C_100176_ci.field_105623_e
		// @1475: getstatic int game.C_100242_oh.field_106343_d
		// @1478: aaload
		// @1479: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @147C: pop
		// @147D: aload #12
		// @147F: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @1482: bipush 21 (0x15)
		// @1484: aaload
		// @1485: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1488: pop
		// @1489: iload #10
		// @148B: iload #11
		// @148D: isub
		// @148E: istore #13
		// @1490: iload #11
		// @1492: bipush 100 (0x64)
		// @1494: imul
		// @1495: iload #10
		// @1497: idiv
		// @1498: istore #11
		// @149A: aload #12
		// @149C: iload #11
		// @149E: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @14A1: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @14A4: pop
		// @14A5: aload #12
		// @14A7: getstatic java.lang.String game.C_100280_nf.field_101180_m
		// @14AA: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @14AD: pop
		// @14AE: aload #12
		// @14B0: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @14B3: bipush 33 (0x21)
		// @14B5: aaload
		// @14B6: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @14B9: pop
		// @14BA: aload #12
		// @14BC: getstatic java.lang.String game.C_100253_ph.field_101106_u
		// @14BF: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @14C2: pop
		// @14C3: iconst_m1
		// @14C4: aload #8
		// @14C6: arraylength
		// @14C7: iconst_m1
		// @14C8: ixor
		// @14C9: if_icmpgt @14D0
		// @14CC: goto @159B
		// @14CF: athrow
		// @14D0: aload #12
		// @14D2: getstatic java.lang.String game.C_100043_vl.field_101942_Xb
		// @14D5: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @14D8: pop
		// @14D9: aload #8
		// @14DB: astore #14
		// @14DD: iconst_0
		// @14DE: istore #15
		// @14E0: aload #14
		// @14E2: arraylength
		// @14E3: iload #15
		// @14E5: if_icmple @1585
		// @14E8: aload #14
		// @14EA: iload #15
		// @14EC: iaload
		// @14ED: istore #16
		// @14EF: aload #12
		// @14F1: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @14F4: bipush 25 (0x19)
		// @14F6: aaload
		// @14F7: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @14FA: pop
		// @14FB: iload #16
		// @14FD: getstatic int[] game.C_100257_ln.field_106481_d
		// @1500: iload_0
		// @1501: bipush -99 (0x9D)
		// @1503: ixor
		// @1504: invokestatic game.C_100097_k.func_104572_a(int, int[], int)boolean
		// @1507: istore #17
		// @1509: iload #17
		// @150B: iload #31
		// @150D: ifne @158A
		// @1510: ifeq @152C
		// @1513: goto @1517
		// @1516: athrow
		// @1517: aload #12
		// @1519: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @151C: bipush 29 (0x1D)
		// @151E: aaload
		// @151F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1522: pop
		// @1523: iload #31
		// @1525: ifeq @153C
		// @1528: goto @152C
		// @152B: athrow
		// @152C: aload #12
		// @152E: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @1531: bipush 12 (0x0C)
		// @1533: aaload
		// @1534: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1537: pop
		// @1538: goto @153C
		// @153B: athrow
		// @153C: aload #12
		// @153E: getstatic java.lang.String[] game.C_100176_ci.field_105623_e
		// @1541: iload #16
		// @1543: aaload
		// @1544: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1547: pop
		// @1548: aload #12
		// @154A: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @154D: bipush 33 (0x21)
		// @154F: aaload
		// @1550: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1553: pop
		// @1554: iload #17
		// @1556: ifne @157D
		// @1559: aload #12
		// @155B: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @155E: bipush 13 (0x0D)
		// @1560: aaload
		// @1561: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1564: pop
		// @1565: aload #12
		// @1567: getstatic int[] game.C_100242_oh.field_106342_g
		// @156A: iload #16
		// @156C: iaload
		// @156D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1570: pop
		// @1571: aload #12
		// @1573: ldc ")"
		// @1575: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1578: pop
		// @1579: goto @157D
		// @157C: athrow
		// @157D: iinc #15 +1
		// @1580: iload #31
		// @1582: ifeq @14E0
		// @1585: aload #9
		// @1587: arraylength
		// @1588: iconst_m1
		// @1589: ixor
		// @158A: iconst_m1
		// @158B: if_icmplt @1592
		// @158E: goto @159B
		// @1591: athrow
		// @1592: aload #12
		// @1594: getstatic java.lang.String game.C_100044_vm.field_100952_y
		// @1597: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @159A: pop
		// @159B: aload #9
		// @159D: arraylength
		// @159E: ifgt @15A5
		// @15A1: goto @1698
		// @15A4: athrow
		// @15A5: bipush -2 (0xFE)
		// @15A7: aload #9
		// @15A9: arraylength
		// @15AA: iconst_m1
		// @15AB: ixor
		// @15AC: if_icmpne @15C1
		// @15AF: aload #12
		// @15B1: getstatic java.lang.String game.C_100306_kn.field_107136_n
		// @15B4: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @15B7: pop
		// @15B8: iload #31
		// @15BA: ifeq @15CE
		// @15BD: goto @15C1
		// @15C0: athrow
		// @15C1: aload #12
		// @15C3: getstatic java.lang.String game.C_100200_ba.field_105853_a
		// @15C6: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @15C9: pop
		// @15CA: goto @15CE
		// @15CD: athrow
		// @15CE: aload #9
		// @15D0: astore #14
		// @15D2: iconst_0
		// @15D3: istore #15
		// @15D5: iload #15
		// @15D7: aload #14
		// @15D9: arraylength
		// @15DA: if_icmpge @1698
		// @15DD: aload #14
		// @15DF: iload #15
		// @15E1: iaload
		// @15E2: istore #16
		// @15E4: aload #12
		// @15E6: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @15E9: bipush 25 (0x19)
		// @15EB: aaload
		// @15EC: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @15EF: pop
		// @15F0: iload #16
		// @15F2: getstatic int[] game.C_100075_uj.field_100655_u
		// @15F5: bipush -110 (0x92)
		// @15F7: invokestatic game.C_100097_k.func_104572_a(int, int[], int)boolean
		// @15FA: istore #17
		// @15FC: iload #17
		// @15FE: iload #31
		// @1600: ifne @169D
		// @1603: ifeq @161F
		// @1606: goto @160A
		// @1609: athrow
		// @160A: aload #12
		// @160C: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @160F: bipush 29 (0x1D)
		// @1611: aaload
		// @1612: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1615: pop
		// @1616: iload #31
		// @1618: ifeq @162F
		// @161B: goto @161F
		// @161E: athrow
		// @161F: aload #12
		// @1621: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @1624: bipush 12 (0x0C)
		// @1626: aaload
		// @1627: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @162A: pop
		// @162B: goto @162F
		// @162E: athrow
		// @162F: bipush 34 (0x22)
		// @1631: iload #16
		// @1633: if_icmpeq @164B
		// @1636: aload #12
		// @1638: getstatic java.lang.String[] game.C_100167_sj.field_100794_t
		// @163B: iload #16
		// @163D: aaload
		// @163E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1641: pop
		// @1642: iload #31
		// @1644: ifeq @165B
		// @1647: goto @164B
		// @164A: athrow
		// @164B: aload #12
		// @164D: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @1650: bipush 17 (0x11)
		// @1652: aaload
		// @1653: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1656: pop
		// @1657: goto @165B
		// @165A: athrow
		// @165B: aload #12
		// @165D: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @1660: bipush 33 (0x21)
		// @1662: aaload
		// @1663: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1666: pop
		// @1667: iload #17
		// @1669: ifne @1690
		// @166C: aload #12
		// @166E: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @1671: bipush 13 (0x0D)
		// @1673: aaload
		// @1674: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1677: pop
		// @1678: aload #12
		// @167A: getstatic int[] game.C_100328_ia.field_107259_b
		// @167D: iload #16
		// @167F: iaload
		// @1680: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1683: pop
		// @1684: aload #12
		// @1686: ldc ")"
		// @1688: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @168B: pop
		// @168C: goto @1690
		// @168F: athrow
		// @1690: iinc #15 +1
		// @1693: iload #31
		// @1695: ifeq @15D5
		// @1698: getstatic int game.C_100096_un.field_104563_d
		// @169B: iconst_m1
		// @169C: ixor
		// @169D: iload #13
		// @169F: iconst_m1
		// @16A0: ixor
		// @16A1: if_icmpgt @16CE
		// @16A4: aload #12
		// @16A6: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @16A9: bipush 19 (0x13)
		// @16AB: aaload
		// @16AC: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @16AF: pop
		// @16B0: aload #12
		// @16B2: getstatic java.lang.String game.C_100235_om.field_106295_m
		// @16B5: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @16B8: pop
		// @16B9: aload #12
		// @16BB: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @16BE: bipush 26 (0x1A)
		// @16C0: aaload
		// @16C1: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @16C4: pop
		// @16C5: iload #31
		// @16C7: ifeq @16F3
		// @16CA: goto @16CE
		// @16CD: athrow
		// @16CE: aload #12
		// @16D0: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @16D3: bipush 24 (0x18)
		// @16D5: aaload
		// @16D6: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @16D9: pop
		// @16DA: aload #12
		// @16DC: getstatic java.lang.String game.C_100235_om.field_106295_m
		// @16DF: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @16E2: pop
		// @16E3: aload #12
		// @16E5: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @16E8: bipush 18 (0x12)
		// @16EA: aaload
		// @16EB: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @16EE: pop
		// @16EF: goto @16F3
		// @16F2: athrow
		// @16F3: aload #12
		// @16F5: iload #13
		// @16F7: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @16FA: pop
		// @16FB: aload #12
		// @16FD: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @1700: bipush 33 (0x21)
		// @1702: aaload
		// @1703: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1706: pop
		// @1707: aload #12
		// @1709: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @170C: astore #14
		// @170E: sipush 250 (0x00FA)
		// @1711: istore #15
		// @1713: aload #7
		// @1715: getfield int game.C_100112_r.field_101772_Q
		// @1718: aload #7
		// @171A: getfield int game.C_100112_r.field_101763_H
		// @171D: iadd
		// @171E: istore #16
		// @1720: aload #7
		// @1722: aload #14
		// @1724: iload #15
		// @1726: bipush 20 (0x14)
		// @1728: isub
		// @1729: iload #16
		// @172B: invokevirtual game.C_100112_r.func_101734_a(java.lang.String, int, int)int
		// @172E: bipush 10 (0x0A)
		// @1730: iadd
		// @1731: istore #17
		// @1733: sipush 228 (0x00E4)
		// @1736: istore #18
		// @1738: ldc 16777215 (0xffffff)
		// @173A: istore #19
		// @173C: iload #17
		// @173E: ineg
		// @173F: sipush 378 (0x017A)
		// @1742: iadd
		// @1743: istore #20
		// @1745: iload #18
		// @1747: iload #20
		// @1749: iload #15
		// @174B: iload #17
		// @174D: iconst_0
		// @174E: sipush 200 (0x00C8)
		// @1751: invokestatic game.C_100196_rb.func_105804_g(int, int, int, int, int, int)void
		// @1754: iload #18
		// @1756: iload #20
		// @1758: iload #15
		// @175A: iload #17
		// @175C: iload #19
		// @175E: invokestatic game.C_100196_rb.func_105784_h(int, int, int, int, int)void
		// @1761: aload #7
		// @1763: aload #14
		// @1765: bipush 10 (0x0A)
		// @1767: iload #18
		// @1769: iadd
		// @176A: iload #20
		// @176C: bipush -5 (0xFB)
		// @176E: isub
		// @176F: bipush -20 (0xEC)
		// @1771: iload #15
		// @1773: iadd
		// @1774: iload #17
		// @1776: ldc 8421504 (0x808080)
		// @1778: iconst_0
		// @1779: iconst_0
		// @177A: iconst_0
		// @177B: iload #16
		// @177D: invokevirtual game.C_100112_r.func_101729_a(java.lang.String, int, int, int, int, int, int, int, int, int)int
		// @1780: pop
		// @1781: iconst_m1
		// @1782: istore #8
		// @1784: iconst_m1
		// @1785: istore #9
		// @1787: iconst_m1
		// @1788: istore #10
		// @178A: iconst_m1
		// @178B: istore #11
		// @178D: getstatic int game.C_100200_ba.field_105852_c
		// @1790: ifeq @17A7
		// @1793: iconst_m1
		// @1794: getstatic int game.C_100200_ba.field_105852_c
		// @1797: bipush 18 (0x12)
		// @1799: iand
		// @179A: iconst_m1
		// @179B: ixor
		// @179C: if_icmpne @17A7
		// @179F: goto @17A3
		// @17A2: athrow
		// @17A3: goto @17EA
		// @17A6: athrow
		// @17A7: iconst_m1
		// @17A8: getstatic int game.C_100017_wj.field_103815_g
		// @17AB: iconst_m1
		// @17AC: ixor
		// @17AD: if_icmpge @17B4
		// @17B0: goto @17BD
		// @17B3: athrow
		// @17B4: getstatic int[] game.C_100301_kb.field_107089_g
		// @17B7: getstatic int game.C_100017_wj.field_103815_g
		// @17BA: iaload
		// @17BB: istore #8
		// @17BD: iconst_m1
		// @17BE: getstatic int game.C_100242_oh.field_106343_d
		// @17C1: iconst_m1
		// @17C2: ixor
		// @17C3: if_icmpge @17CA
		// @17C6: goto @17CF
		// @17C9: athrow
		// @17CA: getstatic int game.C_100242_oh.field_106343_d
		// @17CD: istore #8
		// @17CF: iconst_m1
		// @17D0: getstatic int game.C_100017_wj.field_103815_g
		// @17D3: iconst_m1
		// @17D4: ixor
		// @17D5: if_icmplt @17EA
		// @17D8: iload #8
		// @17DA: iflt @17E5
		// @17DD: goto @17E1
		// @17E0: athrow
		// @17E1: goto @17EA
		// @17E4: athrow
		// @17E5: getstatic int game.C_100017_wj.field_103815_g
		// @17E8: istore #9
		// @17EA: getstatic int game.C_100200_ba.field_105852_c
		// @17ED: bipush 18 (0x12)
		// @17EF: iand
		// @17F0: iconst_m1
		// @17F1: ixor
		// @17F2: iconst_m1
		// @17F3: if_icmpeq @18BF
		// @17F6: iconst_0
		// @17F7: iload #8
		// @17F9: if_icmple @18BF
		// @17FC: goto @1800
		// @17FF: athrow
		// @1800: getstatic game.C_100049_vf game.C_100013_fn.field_103742_c
		// @1803: ifnull @18BF
		// @1806: goto @180A
		// @1809: athrow
		// @180A: aconst_null
		// @180B: getstatic game.C_100049_vf game.C_100013_fn.field_103742_c
		// @180E: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @1811: if_acmpeq @183E
		// @1814: goto @1818
		// @1817: athrow
		// @1818: getstatic game.C_100049_vf game.C_100013_fn.field_103742_c
		// @181B: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @181E: getfield int game.C_100327_ib.field_102494_P
		// @1821: istore #8
		// @1823: getstatic game.C_100049_vf game.C_100013_fn.field_103742_c
		// @1826: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @1829: astore #12
		// @182B: aload #12
		// @182D: getfield int game.C_100327_ib.field_102480_G
		// @1830: istore #10
		// @1832: aload #12
		// @1834: getfield int game.C_100327_ib.field_102504_x
		// @1837: istore #11
		// @1839: iload #31
		// @183B: ifeq @1859
		// @183E: getstatic game.C_100049_vf game.C_100013_fn.field_103742_c
		// @1841: getfield int game.C_100049_vf.field_104203_a
		// @1844: istore #9
		// @1846: getstatic game.C_100049_vf game.C_100013_fn.field_103742_c
		// @1849: astore #12
		// @184B: aload #12
		// @184D: getfield int game.C_100049_vf.field_104197_f
		// @1850: istore #11
		// @1852: aload #12
		// @1854: getfield int game.C_100049_vf.field_104199_d
		// @1857: istore #10
		// @1859: bipush 16 (0x10)
		// @185B: getstatic int game.C_100200_ba.field_105852_c
		// @185E: iand
		// @185F: ifeq @18B9
		// @1862: iload #8
		// @1864: bipush 83 (0x53)
		// @1866: if_icmpeq @18B9
		// @1869: goto @186D
		// @186C: athrow
		// @186D: iload #9
		// @186F: iflt @1886
		// @1872: goto @1876
		// @1875: athrow
		// @1876: wide (iinc) #10 +64512
		// @187C: wide (iinc) #11 +1024
		// @1882: goto @1886
		// @1885: athrow
		// @1886: wide (iinc) #10 +1365
		// @188C: iload #10
		// @188E: iload #10
		// @1890: sipush 2730 (0x0AAA)
		// @1893: irem
		// @1894: isub
		// @1895: istore #10
		// @1897: wide (iinc) #11 +1365
		// @189D: iload #11
		// @189F: iload #11
		// @18A1: sipush 2731 (0x0AAB)
		// @18A4: irem
		// @18A5: isub
		// @18A6: istore #11
		// @18A8: wide (iinc) #11 +49152
		// @18AE: wide (iinc) #10 +49152
		// @18B4: iload #31
		// @18B6: ifeq @18BF
		// @18B9: iconst_m1
		// @18BA: istore #10
		// @18BC: iconst_m1
		// @18BD: istore #11
		// @18BF: iload_0
		// @18C0: getstatic int game.C_100200_ba.field_105852_c
		// @18C3: iand
		// @18C4: iconst_m1
		// @18C5: ixor
		// @18C6: iconst_m1
		// @18C7: if_icmpeq @1A26
		// @18CA: getstatic int game.C_100122_em.field_102078_Ub
		// @18CD: istore #12
		// @18CF: iconst_m1
		// @18D0: putstatic int game.C_100122_em.field_102078_Ub
		// @18D3: iconst_0
		// @18D4: istore #13
		// @18D6: iload #13
		// @18D8: bipush 12 (0x0C)
		// @18DA: if_icmpge @1A19
		// @18DD: getstatic game.C_100302_ka[] game.C_100123_uc.field_104925_a
		// @18E0: iload #13
		// @18E2: aaload
		// @18E3: astore #14
		// @18E5: aconst_null
		// @18E6: iload #31
		// @18E8: ifne @1B30
		// @18EB: aload #14
		// @18ED: if_acmpeq @1A11
		// @18F0: goto @18F4
		// @18F3: athrow
		// @18F4: bipush -25 (0xE7)
		// @18F6: invokestatic game.C_100234_ob.func_106268_c(byte)boolean
		// @18F9: ifne @190A
		// @18FC: goto @1900
		// @18FF: athrow
		// @1900: getstatic int game.C_100212_qc.field_105976_b
		// @1903: ifgt @1925
		// @1906: goto @190A
		// @1909: athrow
		// @190A: iconst_0
		// @190B: iload_0
		// @190C: sipush -11146 (0xD476)
		// @190F: iadd
		// @1910: getstatic int[] game.C_100017_wj.field_103821_j
		// @1913: iload #13
		// @1915: iaload
		// @1916: invokestatic game.C_100080_b.func_104421_a(boolean, int, int)boolean
		// @1919: ifeq @1925
		// @191C: goto @1920
		// @191F: athrow
		// @1920: iconst_1
		// @1921: goto @1926
		// @1924: athrow
		// @1925: iconst_0
		// @1926: istore #15
		// @1928: iload #15
		// @192A: ifne @1A11
		// @192D: getstatic int[] game.C_100017_wj.field_103821_j
		// @1930: iload #13
		// @1932: iaload
		// @1933: getstatic int[] game.C_100257_ln.field_106481_d
		// @1936: bipush -125 (0x83)
		// @1938: invokestatic game.C_100097_k.func_104572_a(int, int[], int)boolean
		// @193B: ifeq @1A11
		// @193E: goto @1942
		// @1941: athrow
		// @1942: aload #14
		// @1944: getfield int game.C_100302_ka.field_101840_Eb
		// @1947: iconst_m1
		// @1948: ixor
		// @1949: getstatic int game.C_100015_wh.field_103781_g
		// @194C: iconst_m1
		// @194D: ixor
		// @194E: if_icmplt @198F
		// @1951: goto @1955
		// @1954: athrow
		// @1955: sipush 190 (0x00BE)
		// @1958: getstatic int game.C_100015_wh.field_103781_g
		// @195B: if_icmple @198F
		// @195E: goto @1962
		// @1961: athrow
		// @1962: getstatic int game.C_100338_jc.field_105370_l
		// @1965: iconst_m1
		// @1966: ixor
		// @1967: aload #14
		// @1969: getfield int game.C_100302_ka.field_101835_xb
		// @196C: iconst_m1
		// @196D: ixor
		// @196E: if_icmpgt @198F
		// @1971: goto @1975
		// @1974: athrow
		// @1975: aload #14
		// @1977: getfield int game.C_100302_ka.field_101835_xb
		// @197A: aload #14
		// @197C: getfield int game.C_100302_ka.field_101848_lb
		// @197F: iadd
		// @1980: getstatic int game.C_100338_jc.field_105370_l
		// @1983: if_icmple @198F
		// @1986: goto @198A
		// @1989: athrow
		// @198A: iconst_1
		// @198B: goto @1990
		// @198E: athrow
		// @198F: iconst_0
		// @1990: istore #16
		// @1992: iconst_0
		// @1993: istore #17
		// @1995: iload #16
		// @1997: ifne @199E
		// @199A: goto @19CC
		// @199D: athrow
		// @199E: iload #13
		// @19A0: putstatic int game.C_100122_em.field_102078_Ub
		// @19A3: iload #12
		// @19A5: getstatic int game.C_100122_em.field_102078_Ub
		// @19A8: if_icmpne @19AF
		// @19AB: goto @19BC
		// @19AE: athrow
		// @19AF: getstatic int game.C_100066_dl.field_101636_H
		// @19B2: putstatic int game.C_100024_hd.field_102996_v
		// @19B5: bipush 97 (0x61)
		// @19B7: bipush 8 (0x08)
		// @19B9: invokestatic game.C_100278_nd.func_101196_k(int, int)void
		// @19BC: getstatic int game.C_100066_dl.field_101636_H
		// @19BF: getstatic int game.C_100024_hd.field_102996_v
		// @19C2: ineg
		// @19C3: iadd
		// @19C4: bipush 6 (0x06)
		// @19C6: idiv
		// @19C7: bipush 15 (0x0F)
		// @19C9: irem
		// @19CA: istore #17
		// @19CC: bipush 64 (0x40)
		// @19CE: istore #18
		// @19D0: aload #14
		// @19D2: getfield game.C_100037_wb game.C_100302_ka.field_101887_nb
		// @19D5: invokevirtual game.C_100037_wb.func_102379_d()void
		// @19D8: iconst_0
		// @19D9: iconst_0
		// @19DA: iload #18
		// @19DC: iload #18
		// @19DE: iconst_0
		// @19DF: invokestatic game.C_100196_rb.func_105782_i(int, int, int, int, int)void
		// @19E2: iconst_0
		// @19E3: iconst_0
		// @19E4: iload #18
		// @19E6: iload #18
		// @19E8: invokestatic game.C_100196_rb.func_105815_h(int, int, int, int)void
		// @19EB: getstatic game.C_100037_wb[] game.C_100124_tn.field_104936_c
		// @19EE: iload #13
		// @19F0: aaload
		// @19F1: astore #19
		// @19F3: iload #18
		// @19F5: iconst_3
		// @19F6: iload #17
		// @19F8: iand
		// @19F9: imul
		// @19FA: istore #20
		// @19FC: iload #17
		// @19FE: ldc 762530882 (0x2d734c42)
		// @1A00: ishr
		// @1A01: iload #18
		// @1A03: imul
		// @1A04: istore #21
		// @1A06: aload #19
		// @1A08: iload #20
		// @1A0A: ineg
		// @1A0B: iload #21
		// @1A0D: ineg
		// @1A0E: invokevirtual game.C_100037_wb.func_102353_h(int, int)void
		// @1A11: iinc #13 +1
		// @1A14: iload #31
		// @1A16: ifeq @18D6
		// @1A19: getstatic game.C_100185_rm game.C_100049_vf.field_104206_l
		// @1A1C: bipush 124 (0x7C)
		// @1A1E: invokevirtual game.C_100185_rm.func_105476_a(byte)void
		// @1A21: iload #31
		// @1A23: ifeq @1A2E
		// @1A26: iconst_m1
		// @1A27: putstatic int game.C_100122_em.field_102078_Ub
		// @1A2A: goto @1A2E
		// @1A2D: athrow
		// @1A2E: iconst_m1
		// @1A2F: getstatic int game.C_100068_vc.field_104343_e
		// @1A32: iconst_m1
		// @1A33: ixor
		// @1A34: if_icmpge @1A3B
		// @1A37: goto @1A80
		// @1A3A: athrow
		// @1A3B: iconst_m1
		// @1A3C: istore #12
		// @1A3E: iconst_0
		// @1A3F: iload #8
		// @1A41: if_icmple @1A57
		// @1A44: iconst_0
		// @1A45: iload #9
		// @1A47: if_icmpgt @1A5B
		// @1A4A: goto @1A4E
		// @1A4D: athrow
		// @1A4E: iload #9
		// @1A50: istore #12
		// @1A52: iload #31
		// @1A54: ifeq @1A5B
		// @1A57: iload #8
		// @1A59: istore #12
		// @1A5B: iconst_m1
		// @1A5C: iload #12
		// @1A5E: iconst_m1
		// @1A5F: ixor
		// @1A60: if_icmplt @1A80
		// @1A63: getstatic game.C_100067_vd[] game.C_100066_dl.field_101641_u
		// @1A66: getstatic int game.C_100068_vc.field_104343_e
		// @1A69: aaload
		// @1A6A: iload #12
		// @1A6C: iload_0
		// @1A6D: bipush -3 (0xFD)
		// @1A6F: iadd
		// @1A70: invokevirtual game.C_100067_vd.func_104298_a(int, int)boolean
		// @1A73: ifne @1A80
		// @1A76: goto @1A7A
		// @1A79: athrow
		// @1A7A: iconst_m1
		// @1A7B: istore #8
		// @1A7D: iconst_m1
		// @1A7E: istore #9
		// @1A80: iload #9
		// @1A82: iconst_m1
		// @1A83: ixor
		// @1A84: iconst_m1
		// @1A85: if_icmpgt @1ABE
		// @1A88: getstatic int game.C_100200_ba.field_105852_c
		// @1A8B: ifne @1ABE
		// @1A8E: goto @1A92
		// @1A91: athrow
		// @1A92: iload #9
		// @1A94: iconst_m1
		// @1A95: ixor
		// @1A96: getstatic int game.C_100091_m.field_104514_e
		// @1A99: iconst_m1
		// @1A9A: ixor
		// @1A9B: if_icmpeq @1AB6
		// @1A9E: goto @1AA2
		// @1AA1: athrow
		// @1AA2: bipush 97 (0x61)
		// @1AA4: bipush 8 (0x08)
		// @1AA6: invokestatic game.C_100278_nd.func_101196_k(int, int)void
		// @1AA9: iload #9
		// @1AAB: putstatic int game.C_100091_m.field_104514_e
		// @1AAE: iconst_1
		// @1AAF: putstatic boolean game.C_100034_gi.field_104029_d
		// @1AB2: goto @1AB6
		// @1AB5: athrow
		// @1AB6: iconst_m1
		// @1AB7: istore #9
		// @1AB9: iload #31
		// @1ABB: ifeq @23C1
		// @1ABE: getstatic int game.C_100017_wj.field_103815_g
		// @1AC1: bipush -2 (0xFE)
		// @1AC3: if_icmpne @1AFD
		// @1AC6: goto @1ACA
		// @1AC9: athrow
		// @1ACA: getstatic int game.C_100200_ba.field_105852_c
		// @1ACD: iconst_m1
		// @1ACE: ixor
		// @1ACF: iconst_m1
		// @1AD0: if_icmpne @1AFD
		// @1AD3: goto @1AD7
		// @1AD6: athrow
		// @1AD7: iconst_1
		// @1AD8: getstatic int game.C_100091_m.field_104514_e
		// @1ADB: iconst_m1
		// @1ADC: ixor
		// @1ADD: if_icmpne @1AE8
		// @1AE0: goto @1AE4
		// @1AE3: athrow
		// @1AE4: goto @23C1
		// @1AE7: athrow
		// @1AE8: iconst_1
		// @1AE9: putstatic boolean game.C_100034_gi.field_104029_d
		// @1AEC: bipush -2 (0xFE)
		// @1AEE: putstatic int game.C_100091_m.field_104514_e
		// @1AF1: bipush 97 (0x61)
		// @1AF3: bipush 8 (0x08)
		// @1AF5: invokestatic game.C_100278_nd.func_101196_k(int, int)void
		// @1AF8: iload #31
		// @1AFA: ifeq @23C1
		// @1AFD: iload #8
		// @1AFF: ifge @1B2B
		// @1B02: goto @1B06
		// @1B05: athrow
		// @1B06: iload #9
		// @1B08: ifge @1B2B
		// @1B0B: goto @1B0F
		// @1B0E: athrow
		// @1B0F: iconst_m1
		// @1B10: getstatic int game.C_100091_m.field_104514_e
		// @1B13: if_icmpeq @23C1
		// @1B16: goto @1B1A
		// @1B19: athrow
		// @1B1A: iconst_1
		// @1B1B: putstatic boolean game.C_100034_gi.field_104029_d
		// @1B1E: iconst_m1
		// @1B1F: putstatic int game.C_100091_m.field_104514_e
		// @1B22: iload #31
		// @1B24: ifeq @23C1
		// @1B27: goto @1B2B
		// @1B2A: athrow
		// @1B2B: aconst_null
		// @1B2C: goto @1B30
		// @1B2F: athrow
		// @1B30: astore #12
		// @1B32: aconst_null
		// @1B33: astore #13
		// @1B35: aconst_null
		// @1B36: astore #14
		// @1B38: aconst_null
		// @1B39: astore #15
		// @1B3B: iload #9
		// @1B3D: iconst_m1
		// @1B3E: ixor
		// @1B3F: iconst_m1
		// @1B40: if_icmpgt @1C35
		// @1B43: getstatic int game.C_100091_m.field_104514_e
		// @1B46: iconst_m1
		// @1B47: ixor
		// @1B48: iload #9
		// @1B4A: iconst_m1
		// @1B4B: ixor
		// @1B4C: if_icmpne @1B57
		// @1B4F: goto @1B53
		// @1B52: athrow
		// @1B53: goto @1B67
		// @1B56: athrow
		// @1B57: bipush 97 (0x61)
		// @1B59: bipush 8 (0x08)
		// @1B5B: invokestatic game.C_100278_nd.func_101196_k(int, int)void
		// @1B5E: iload #9
		// @1B60: putstatic int game.C_100091_m.field_104514_e
		// @1B63: iconst_1
		// @1B64: putstatic boolean game.C_100034_gi.field_104029_d
		// @1B67: sipush -2049 (0xF7FF)
		// @1B6A: iload #9
		// @1B6C: iand
		// @1B6D: istore #16
		// @1B6F: iload #16
		// @1B71: iconst_m1
		// @1B72: ixor
		// @1B73: bipush -3 (0xFD)
		// @1B75: if_icmpne @1B81
		// @1B78: iload #31
		// @1B7A: ifeq @1B9D
		// @1B7D: goto @1B81
		// @1B80: athrow
		// @1B81: iload #16
		// @1B83: iconst_m1
		// @1B84: ixor
		// @1B85: bipush -5 (0xFB)
		// @1B87: if_icmpeq @1BA5
		// @1B8A: goto @1B8E
		// @1B8D: athrow
		// @1B8E: iload #16
		// @1B90: bipush 8 (0x08)
		// @1B92: if_icmpeq @1BAD
		// @1B95: goto @1B99
		// @1B98: athrow
		// @1B99: goto @1BB5
		// @1B9C: athrow
		// @1B9D: getstatic java.lang.String game.C_100121_ud.field_100714_E
		// @1BA0: astore #12
		// @1BA2: goto @1BF1
		// @1BA5: getstatic java.lang.String game.C_100316_lc.field_102408_B
		// @1BA8: astore #12
		// @1BAA: goto @1BF1
		// @1BAD: getstatic java.lang.String game.C_100029_gn.field_103364_T
		// @1BB0: astore #12
		// @1BB2: goto @1BF1
		// @1BB5: getstatic java.lang.String game.C_100218_am.field_103111_F
		// @1BB8: astore #12
		// @1BBA: iload #9
		// @1BBC: iload_0
		// @1BBD: iconst_m1
		// @1BBE: iadd
		// @1BBF: invokestatic game.C_100055_ed.func_104238_a(int, int)java.lang.String
		// @1BC2: astore #16
		// @1BC4: iconst_m1
		// @1BC5: aload #16
		// @1BC7: invokevirtual java.lang.String.length()int
		// @1BCA: iconst_m1
		// @1BCB: ixor
		// @1BCC: if_icmpgt @1BD7
		// @1BCF: aconst_null
		// @1BD0: astore #13
		// @1BD2: iload #31
		// @1BD4: ifeq @1BF1
		// @1BD7: iload_0
		// @1BD8: sipush -30946 (0x871E)
		// @1BDB: iadd
		// @1BDC: iconst_1
		// @1BDD: anewarray java.lang.String
		// @1BE0: dup
		// @1BE1: iconst_0
		// @1BE2: iload #9
		// @1BE4: iconst_0
		// @1BE5: invokestatic game.C_100055_ed.func_104238_a(int, int)java.lang.String
		// @1BE8: aastore
		// @1BE9: getstatic java.lang.String game.C_100220_ac.field_106055_d
		// @1BEC: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @1BEF: astore #13
		// @1BF1: iconst_m1
		// @1BF2: getstatic game.C_100327_ib game.C_100254_pi.field_106459_h
		// @1BF5: iconst_0
		// @1BF6: getstatic game.C_100049_vf game.C_100013_fn.field_103742_c
		// @1BF9: invokevirtual game.C_100327_ib.func_102450_a(boolean, game.C_100049_vf)int
		// @1BFC: if_icmpne @1C03
		// @1BFF: goto @1E5C
		// @1C02: athrow
		// @1C03: aload #13
		// @1C05: ifnull @1C2D
		// @1C08: new java.lang.StringBuilder
		// @1C0B: dup
		// @1C0C: invokespecial java.lang.StringBuilder.<init>()void
		// @1C0F: aload #13
		// @1C11: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1C14: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @1C17: bipush 23 (0x17)
		// @1C19: aaload
		// @1C1A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1C1D: getstatic java.lang.String game.C_100256_pk.field_100471_j
		// @1C20: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1C23: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @1C26: astore #13
		// @1C28: iload #31
		// @1C2A: ifeq @1E5C
		// @1C2D: getstatic java.lang.String game.C_100256_pk.field_100471_j
		// @1C30: astore #13
		// @1C32: goto @1E5C
		// @1C35: getstatic int game.C_100200_ba.field_105852_c
		// @1C38: ifeq @1DC9
		// @1C3B: getstatic int game.C_100200_ba.field_105852_c
		// @1C3E: bipush 18 (0x12)
		// @1C40: iand
		// @1C41: iconst_m1
		// @1C42: ixor
		// @1C43: iconst_m1
		// @1C44: if_icmpne @1C4F
		// @1C47: goto @1C4B
		// @1C4A: athrow
		// @1C4B: goto @1E5C
		// @1C4E: athrow
		// @1C4F: getstatic int game.C_100091_m.field_104514_e
		// @1C52: iconst_m1
		// @1C53: ixor
		// @1C54: iload #8
		// @1C56: iconst_m1
		// @1C57: ixor
		// @1C58: if_icmpne @1C5F
		// @1C5B: goto @1C71
		// @1C5E: athrow
		// @1C5F: bipush 97 (0x61)
		// @1C61: iload_0
		// @1C62: bipush 7 (0x07)
		// @1C64: iadd
		// @1C65: invokestatic game.C_100278_nd.func_101196_k(int, int)void
		// @1C68: iload #8
		// @1C6A: putstatic int game.C_100091_m.field_104514_e
		// @1C6D: iconst_1
		// @1C6E: putstatic boolean game.C_100034_gi.field_104029_d
		// @1C71: getstatic java.lang.String[] game.C_100176_ci.field_105623_e
		// @1C74: iload #8
		// @1C76: aaload
		// @1C77: astore #12
		// @1C79: iload #8
		// @1C7B: bipush 17 (0x11)
		// @1C7D: if_icmplt @1C94
		// @1C80: getstatic java.lang.String[] game.C_100230_of.field_106218_i
		// @1C83: arraylength
		// @1C84: bipush -17 (0xEF)
		// @1C86: isub
		// @1C87: iconst_m1
		// @1C88: ixor
		// @1C89: iload #8
		// @1C8B: iconst_m1
		// @1C8C: ixor
		// @1C8D: if_icmplt @1CE6
		// @1C90: goto @1C94
		// @1C93: athrow
		// @1C94: bipush -94 (0xA2)
		// @1C96: iload #8
		// @1C98: invokestatic game.C_100067_vd.func_104299_a(byte, int)java.lang.String
		// @1C9B: astore #13
		// @1C9D: iload #8
		// @1C9F: bipush -65 (0xBF)
		// @1CA1: invokestatic game.C_100209_qb.func_102686_b(int, byte)game.C_100327_ib
		// @1CA4: bipush 50 (0x32)
		// @1CA6: invokestatic game.C_100225_ah.func_106114_a(game.C_100327_ib, int)java.lang.String
		// @1CA9: astore #16
		// @1CAB: aconst_null
		// @1CAC: aload #13
		// @1CAE: if_acmpeq @1CDF
		// @1CB1: aconst_null
		// @1CB2: aload #16
		// @1CB4: if_acmpeq @1CE3
		// @1CB7: goto @1CBB
		// @1CBA: athrow
		// @1CBB: new java.lang.StringBuilder
		// @1CBE: dup
		// @1CBF: invokespecial java.lang.StringBuilder.<init>()void
		// @1CC2: aload #13
		// @1CC4: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1CC7: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @1CCA: bipush 23 (0x17)
		// @1CCC: aaload
		// @1CCD: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1CD0: aload #16
		// @1CD2: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1CD5: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @1CD8: astore #13
		// @1CDA: iload #31
		// @1CDC: ifeq @1CE3
		// @1CDF: aload #16
		// @1CE1: astore #13
		// @1CE3: goto @1D8C
		// @1CE6: getstatic java.lang.String[] game.C_100027_hc.field_102599_R
		// @1CE9: iload #8
		// @1CEB: bipush 17 (0x11)
		// @1CED: isub
		// @1CEE: aaload
		// @1CEF: astore #13
		// @1CF1: iload #8
		// @1CF3: sipush -8444 (0xDF04)
		// @1CF6: invokestatic game.C_100021_wn.func_103867_a(int, int)int
		// @1CF9: istore #16
		// @1CFB: iload #16
		// @1CFD: iflt @1D33
		// @1D00: iload #16
		// @1D02: iconst_m1
		// @1D03: ixor
		// @1D04: getstatic java.lang.String[] game.C_100245_pf.field_106384_f
		// @1D07: arraylength
		// @1D08: iconst_m1
		// @1D09: ixor
		// @1D0A: if_icmple @1D33
		// @1D0D: goto @1D11
		// @1D10: athrow
		// @1D11: iload_0
		// @1D12: sipush -30946 (0x871E)
		// @1D15: ixor
		// @1D16: iconst_1
		// @1D17: anewarray java.lang.String
		// @1D1A: dup
		// @1D1B: iconst_0
		// @1D1C: getstatic java.lang.String[] game.C_100245_pf.field_106384_f
		// @1D1F: iload #16
		// @1D21: aaload
		// @1D22: aastore
		// @1D23: getstatic java.lang.String game.C_100280_nf.field_101175_q
		// @1D26: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @1D29: astore #14
		// @1D2B: getstatic game.C_100037_wb[] game.C_100066_dl.field_101640_v
		// @1D2E: iload #16
		// @1D30: aaload
		// @1D31: astore #15
		// @1D33: iload #8
		// @1D35: bipush -3 (0xFD)
		// @1D37: invokestatic game.C_100158_da.func_100581_a(int, byte)boolean
		// @1D3A: ifne @1D41
		// @1D3D: goto @1D8C
		// @1D40: athrow
		// @1D41: aload #13
		// @1D43: ifnull @1D71
		// @1D46: aload #13
		// @1D48: invokevirtual java.lang.String.length()int
		// @1D4B: ifle @1D71
		// @1D4E: goto @1D52
		// @1D51: athrow
		// @1D52: new java.lang.StringBuilder
		// @1D55: dup
		// @1D56: invokespecial java.lang.StringBuilder.<init>()void
		// @1D59: aload #13
		// @1D5B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1D5E: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @1D61: bipush 30 (0x1E)
		// @1D63: aaload
		// @1D64: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1D67: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @1D6A: astore #13
		// @1D6C: iload #31
		// @1D6E: ifeq @1D75
		// @1D71: ldc ""
		// @1D73: astore #13
		// @1D75: new java.lang.StringBuilder
		// @1D78: dup
		// @1D79: invokespecial java.lang.StringBuilder.<init>()void
		// @1D7C: aload #13
		// @1D7E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1D81: getstatic java.lang.String game.C_100108_ee.field_100386_e
		// @1D84: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1D87: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @1D8A: astore #13
		// @1D8C: iload_0
		// @1D8D: bipush 97 (0x61)
		// @1D8F: ixor
		// @1D90: iload #8
		// @1D92: invokestatic game.C_100129_tg.func_102736_b(int, int)java.lang.String
		// @1D95: astore #16
		// @1D97: aload #16
		// @1D99: ifnonnull @1DA0
		// @1D9C: goto @1DC6
		// @1D9F: athrow
		// @1DA0: new java.lang.StringBuilder
		// @1DA3: dup
		// @1DA4: invokespecial java.lang.StringBuilder.<init>()void
		// @1DA7: aload #13
		// @1DA9: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1DAC: sipush -30945 (0x871F)
		// @1DAF: iconst_1
		// @1DB0: anewarray java.lang.String
		// @1DB3: dup
		// @1DB4: iconst_0
		// @1DB5: aload #16
		// @1DB7: aastore
		// @1DB8: getstatic java.lang.String game.C_100075_uj.field_100651_j
		// @1DBB: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @1DBE: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1DC1: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @1DC4: astore #13
		// @1DC6: goto @1E5C
		// @1DC9: iload #8
		// @1DCB: iconst_m1
		// @1DCC: ixor
		// @1DCD: getstatic int game.C_100091_m.field_104514_e
		// @1DD0: iconst_m1
		// @1DD1: ixor
		// @1DD2: if_icmpne @1DD9
		// @1DD5: goto @1DEB
		// @1DD8: athrow
		// @1DD9: bipush 97 (0x61)
		// @1DDB: iload_0
		// @1DDC: bipush 7 (0x07)
		// @1DDE: iadd
		// @1DDF: invokestatic game.C_100278_nd.func_101196_k(int, int)void
		// @1DE2: iload #8
		// @1DE4: putstatic int game.C_100091_m.field_104514_e
		// @1DE7: iconst_1
		// @1DE8: putstatic boolean game.C_100034_gi.field_104029_d
		// @1DEB: bipush 34 (0x22)
		// @1DED: iload #8
		// @1DEF: if_icmpne @1DFD
		// @1DF2: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @1DF5: bipush 27 (0x1B)
		// @1DF7: aaload
		// @1DF8: astore #13
		// @1DFA: goto @1E05
		// @1DFD: getstatic java.lang.String[] game.C_100302_ka.field_101863_ib
		// @1E00: iload #8
		// @1E02: aaload
		// @1E03: astore #13
		// @1E05: bipush 34 (0x22)
		// @1E07: iload #8
		// @1E09: if_icmpeq @1E17
		// @1E0C: getstatic java.lang.String[] game.C_100167_sj.field_100794_t
		// @1E0F: iload #8
		// @1E11: aaload
		// @1E12: astore #12
		// @1E14: goto @1E1F
		// @1E17: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @1E1A: bipush 17 (0x11)
		// @1E1C: aaload
		// @1E1D: astore #12
		// @1E1F: bipush -25 (0xE7)
		// @1E21: invokestatic game.C_100234_ob.func_106268_c(byte)boolean
		// @1E24: ifne @1E34
		// @1E27: getstatic int game.C_100212_qc.field_105976_b
		// @1E2A: iconst_m1
		// @1E2B: ixor
		// @1E2C: iconst_m1
		// @1E2D: if_icmplt @1E4B
		// @1E30: goto @1E34
		// @1E33: athrow
		// @1E34: iconst_1
		// @1E35: iload_0
		// @1E36: sipush -11146 (0xD476)
		// @1E39: iadd
		// @1E3A: iload #8
		// @1E3C: invokestatic game.C_100080_b.func_104421_a(boolean, int, int)boolean
		// @1E3F: ifeq @1E4B
		// @1E42: goto @1E46
		// @1E45: athrow
		// @1E46: iconst_1
		// @1E47: goto @1E4C
		// @1E4A: athrow
		// @1E4B: iconst_0
		// @1E4C: istore #16
		// @1E4E: iload #16
		// @1E50: ifne @1E57
		// @1E53: goto @1E5C
		// @1E56: athrow
		// @1E57: getstatic java.lang.String game.C_100328_ia.field_107257_d
		// @1E5A: astore #13
		// @1E5C: iload #9
		// @1E5E: iconst_m1
		// @1E5F: ixor
		// @1E60: iconst_m1
		// @1E61: if_icmple @1E9E
		// @1E64: bipush -25 (0xE7)
		// @1E66: invokestatic game.C_100234_ob.func_106268_c(byte)boolean
		// @1E69: ifne @1E7B
		// @1E6C: goto @1E70
		// @1E6F: athrow
		// @1E70: iconst_0
		// @1E71: getstatic int game.C_100212_qc.field_105976_b
		// @1E74: if_icmplt @1E9E
		// @1E77: goto @1E7B
		// @1E7A: athrow
		// @1E7B: iconst_m1
		// @1E7C: getstatic int game.C_100200_ba.field_105852_c
		// @1E7F: iconst_m1
		// @1E80: ixor
		// @1E81: if_icmpne @1E8D
		// @1E84: goto @1E88
		// @1E87: athrow
		// @1E88: iconst_1
		// @1E89: goto @1E8E
		// @1E8C: athrow
		// @1E8D: iconst_0
		// @1E8E: sipush -11145 (0xD477)
		// @1E91: iload #8
		// @1E93: invokestatic game.C_100080_b.func_104421_a(boolean, int, int)boolean
		// @1E96: ifeq @1E9E
		// @1E99: iconst_1
		// @1E9A: goto @1E9F
		// @1E9D: athrow
		// @1E9E: iconst_0
		// @1E9F: istore #16
		// @1EA1: iload #16
		// @1EA3: ifeq @1EB0
		// @1EA6: getstatic java.lang.String game.C_100328_ia.field_107257_d
		// @1EA9: astore #13
		// @1EAB: iload #31
		// @1EAD: ifeq @2059
		// @1EB0: bipush 82 (0x52)
		// @1EB2: invokestatic game.C_100044_vm.func_100933_a(byte)boolean
		// @1EB5: ifeq @2059
		// @1EB8: goto @1EBC
		// @1EBB: athrow
		// @1EBC: iconst_m1
		// @1EBD: iload #8
		// @1EBF: iconst_m1
		// @1EC0: ixor
		// @1EC1: if_icmplt @2059
		// @1EC4: goto @1EC8
		// @1EC7: athrow
		// @1EC8: iconst_0
		// @1EC9: getstatic int game.C_100200_ba.field_105852_c
		// @1ECC: iconst_1
		// @1ECD: iand
		// @1ECE: if_icmpeq @1ED9
		// @1ED1: goto @1ED5
		// @1ED4: athrow
		// @1ED5: goto @2059
		// @1ED8: athrow
		// @1ED9: iconst_1
		// @1EDA: istore #17
		// @1EDC: iconst_0
		// @1EDD: istore #18
		// @1EDF: iconst_0
		// @1EE0: istore #19
		// @1EE2: iconst_m1
		// @1EE3: getstatic int game.C_100200_ba.field_105852_c
		// @1EE6: iconst_m1
		// @1EE7: ixor
		// @1EE8: if_icmpeq @1F42
		// @1EEB: getstatic int[] game.C_100242_oh.field_106342_g
		// @1EEE: iload #8
		// @1EF0: iaload
		// @1EF1: istore #19
		// @1EF3: iload #8
		// @1EF5: getstatic int[] game.C_100257_ln.field_106481_d
		// @1EF8: iload_0
		// @1EF9: bipush -101 (0x9B)
		// @1EFB: iadd
		// @1EFC: invokestatic game.C_100097_k.func_104572_a(int, int[], int)boolean
		// @1EFF: ifne @1F3A
		// @1F02: getstatic int[] game.C_100257_ln.field_106481_d
		// @1F05: bipush -38 (0xDA)
		// @1F07: getstatic int[] game.C_100066_dl.field_101632_G
		// @1F0A: iload #8
		// @1F0C: bipush -44 (0xD4)
		// @1F0E: invokestatic game.C_100100_i.func_102004_l(int)boolean
		// @1F11: invokestatic game.C_100292_jk.func_101212_a(int[], byte, int[], int, boolean)boolean
		// @1F14: ifne @1F26
		// @1F17: goto @1F1B
		// @1F1A: athrow
		// @1F1B: iconst_2
		// @1F1C: istore #17
		// @1F1E: iconst_1
		// @1F1F: istore #18
		// @1F21: iload #31
		// @1F23: ifeq @1F99
		// @1F26: iload #19
		// @1F28: getstatic int game.C_100096_un.field_104563_d
		// @1F2B: if_icmple @1F99
		// @1F2E: goto @1F32
		// @1F31: athrow
		// @1F32: iconst_2
		// @1F33: istore #17
		// @1F35: iload #31
		// @1F37: ifeq @1F99
		// @1F3A: iconst_0
		// @1F3B: istore #17
		// @1F3D: iload #31
		// @1F3F: ifeq @1F99
		// @1F42: getstatic int[] game.C_100328_ia.field_107259_b
		// @1F45: iload #8
		// @1F47: iaload
		// @1F48: istore #19
		// @1F4A: iload #8
		// @1F4C: getstatic int[] game.C_100075_uj.field_100655_u
		// @1F4F: bipush -124 (0x84)
		// @1F51: invokestatic game.C_100097_k.func_104572_a(int, int[], int)boolean
		// @1F54: ifne @1F96
		// @1F57: getstatic int[] game.C_100257_ln.field_106481_d
		// @1F5A: getstatic int[] game.C_100075_uj.field_100655_u
		// @1F5D: iload #8
		// @1F5F: getstatic int[] game.C_100066_dl.field_101632_G
		// @1F62: bipush 108 (0x6C)
		// @1F64: bipush -77 (0xB3)
		// @1F66: invokestatic game.C_100100_i.func_102004_l(int)boolean
		// @1F69: invokestatic game.C_100235_om.func_106281_a(int[], int[], int, int[], byte, boolean)boolean
		// @1F6C: ifeq @1F8B
		// @1F6F: goto @1F73
		// @1F72: athrow
		// @1F73: getstatic int game.C_100096_un.field_104563_d
		// @1F76: iconst_m1
		// @1F77: ixor
		// @1F78: iload #19
		// @1F7A: iconst_m1
		// @1F7B: ixor
		// @1F7C: if_icmple @1F99
		// @1F7F: goto @1F83
		// @1F82: athrow
		// @1F83: iconst_2
		// @1F84: istore #17
		// @1F86: iload #31
		// @1F88: ifeq @1F99
		// @1F8B: iconst_1
		// @1F8C: istore #18
		// @1F8E: iconst_2
		// @1F8F: istore #17
		// @1F91: iload #31
		// @1F93: ifeq @1F99
		// @1F96: iconst_0
		// @1F97: istore #17
		// @1F99: aconst_null
		// @1F9A: astore #20
		// @1F9C: iload #17
		// @1F9E: istore #21
		// @1FA0: iconst_0
		// @1FA1: iload #21
		// @1FA3: if_icmpeq @1FC7
		// @1FA6: iconst_1
		// @1FA7: iload #21
		// @1FA9: if_icmpne @1FB9
		// @1FAC: goto @1FB0
		// @1FAF: athrow
		// @1FB0: iload #31
		// @1FB2: ifeq @1FD1
		// @1FB5: goto @1FB9
		// @1FB8: athrow
		// @1FB9: iload #21
		// @1FBB: iconst_2
		// @1FBC: if_icmpeq @1FDB
		// @1FBF: goto @1FC3
		// @1FC2: athrow
		// @1FC3: goto @1FF1
		// @1FC6: athrow
		// @1FC7: getstatic java.lang.String[] game.C_100333_ij.field_107354_k
		// @1FCA: iconst_0
		// @1FCB: aaload
		// @1FCC: astore #20
		// @1FCE: goto @1FF1
		// @1FD1: getstatic java.lang.String[] game.C_100333_ij.field_107354_k
		// @1FD4: iconst_1
		// @1FD5: aaload
		// @1FD6: astore #20
		// @1FD8: goto @1FF1
		// @1FDB: iload #18
		// @1FDD: ifne @1FEA
		// @1FE0: getstatic java.lang.String[] game.C_100333_ij.field_107354_k
		// @1FE3: iconst_2
		// @1FE4: aaload
		// @1FE5: astore #20
		// @1FE7: goto @1FF1
		// @1FEA: getstatic java.lang.String[] game.C_100333_ij.field_107354_k
		// @1FED: iconst_3
		// @1FEE: aaload
		// @1FEF: astore #20
		// @1FF1: aconst_null
		// @1FF2: aload #20
		// @1FF4: if_acmpne @1FFB
		// @1FF7: goto @2011
		// @1FFA: athrow
		// @1FFB: sipush -30945 (0x871F)
		// @1FFE: iconst_1
		// @1FFF: anewarray java.lang.String
		// @2002: dup
		// @2003: iconst_0
		// @2004: iload #19
		// @2006: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @2009: aastore
		// @200A: aload #20
		// @200C: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @200F: astore #20
		// @2011: aconst_null
		// @2012: aload #13
		// @2014: if_acmpeq @2055
		// @2017: iconst_0
		// @2018: aload #13
		// @201A: invokevirtual java.lang.String.length()int
		// @201D: if_icmpeq @2055
		// @2020: goto @2024
		// @2023: athrow
		// @2024: aload #20
		// @2026: ifnonnull @2031
		// @2029: goto @202D
		// @202C: athrow
		// @202D: goto @2059
		// @2030: athrow
		// @2031: new java.lang.StringBuilder
		// @2034: dup
		// @2035: invokespecial java.lang.StringBuilder.<init>()void
		// @2038: aload #13
		// @203A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @203D: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @2040: bipush 23 (0x17)
		// @2042: aaload
		// @2043: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2046: aload #20
		// @2048: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @204B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @204E: astore #13
		// @2050: iload #31
		// @2052: ifeq @2059
		// @2055: aload #20
		// @2057: astore #13
		// @2059: bipush 110 (0x6E)
		// @205B: istore #17
		// @205D: sipush 270 (0x010E)
		// @2060: istore #18
		// @2062: aload #7
		// @2064: getfield int game.C_100112_r.field_101763_H
		// @2067: aload #7
		// @2069: getfield int game.C_100112_r.field_101772_Q
		// @206C: iadd
		// @206D: istore #19
		// @206F: iconst_5
		// @2070: iload #19
		// @2072: ineg
		// @2073: isub
		// @2074: bipush -5 (0xFB)
		// @2076: isub
		// @2077: istore #20
		// @2079: sipush 228 (0x00E4)
		// @207C: istore #21
		// @207E: ldc 16777215 (0xffffff)
		// @2080: istore #22
		// @2082: iload #8
		// @2084: iconst_m1
		// @2085: ixor
		// @2086: iconst_m1
		// @2087: if_icmpgt @208E
		// @208A: goto @2092
		// @208D: athrow
		// @208E: ldc 4210752 (0x404040)
		// @2090: istore #22
		// @2092: iconst_4
		// @2093: anewarray java.lang.String
		// @2096: astore #23
		// @2098: iconst_0
		// @2099: istore #24
		// @209B: iconst_0
		// @209C: istore #25
		// @209E: aload #12
		// @20A0: ifnull @20C5
		// @20A3: aload #7
		// @20A5: aload #12
		// @20A7: iconst_1
		// @20A8: newarray int[]
		// @20AA: dup
		// @20AB: iconst_0
		// @20AC: bipush -20 (0xEC)
		// @20AE: iload #18
		// @20B0: iadd
		// @20B1: iastore
		// @20B2: aload #23
		// @20B4: invokevirtual game.C_100112_r.func_101730_a(java.lang.String, int[], java.lang.String[])int
		// @20B7: istore #24
		// @20B9: iload #20
		// @20BB: iload #24
		// @20BD: iload #19
		// @20BF: imul
		// @20C0: iconst_5
		// @20C1: iadd
		// @20C2: iadd
		// @20C3: istore #20
		// @20C5: iconst_m1
		// @20C6: getstatic int game.C_100200_ba.field_105852_c
		// @20C9: bipush 16 (0x10)
		// @20CB: iand
		// @20CC: iconst_m1
		// @20CD: ixor
		// @20CE: if_icmpne @20D5
		// @20D1: goto @2120
		// @20D4: athrow
		// @20D5: iconst_1
		// @20D6: iconst_0
		// @20D7: iload_0
		// @20D8: iconst_1
		// @20D9: ixor
		// @20DA: iload #8
		// @20DC: iconst_0
		// @20DD: invokestatic game.C_100032_gk.func_103126_a(boolean, int, int, int, int)int
		// @20E0: istore #25
		// @20E2: iconst_0
		// @20E3: iload #9
		// @20E5: if_icmpgt @20F4
		// @20E8: iinc #20 +25
		// @20EB: iload #31
		// @20ED: ifeq @2120
		// @20F0: goto @20F4
		// @20F3: athrow
		// @20F4: aload #15
		// @20F6: ifnonnull @2101
		// @20F9: goto @20FD
		// @20FC: athrow
		// @20FD: goto @2120
		// @2100: athrow
		// @2101: bipush 7 (0x07)
		// @2103: iload #19
		// @2105: iadd
		// @2106: aload #15
		// @2108: getfield int game.C_100037_wb.field_102337_u
		// @210B: iadd
		// @210C: bipush 20 (0x14)
		// @210E: isub
		// @210F: istore #26
		// @2111: iload #26
		// @2113: iconst_m1
		// @2114: ixor
		// @2115: iload #25
		// @2117: iconst_m1
		// @2118: ixor
		// @2119: if_icmpge @2120
		// @211C: iload #26
		// @211E: istore #25
		// @2120: iload #20
		// @2122: iload #25
		// @2124: iadd
		// @2125: istore #20
		// @2127: aload #13
		// @2129: ifnonnull @2130
		// @212C: goto @2146
		// @212F: athrow
		// @2130: iload #20
		// @2132: aload #7
		// @2134: aload #13
		// @2136: iload #18
		// @2138: bipush 20 (0x14)
		// @213A: isub
		// @213B: iload #19
		// @213D: invokevirtual game.C_100112_r.func_101734_a(java.lang.String, int, int)int
		// @2140: bipush -5 (0xFB)
		// @2142: isub
		// @2143: iadd
		// @2144: istore #20
		// @2146: iload #20
		// @2148: ineg
		// @2149: sipush 378 (0x017A)
		// @214C: iadd
		// @214D: istore #17
		// @214F: iload #21
		// @2151: iload #17
		// @2153: iload #18
		// @2155: iload #20
		// @2157: iconst_0
		// @2158: sipush 200 (0x00C8)
		// @215B: invokestatic game.C_100196_rb.func_105804_g(int, int, int, int, int, int)void
		// @215E: iload #21
		// @2160: iload #17
		// @2162: iload #18
		// @2164: iload #20
		// @2166: iload #22
		// @2168: invokestatic game.C_100196_rb.func_105784_h(int, int, int, int, int)void
		// @216B: iload #19
		// @216D: iload #17
		// @216F: iconst_5
		// @2170: iadd
		// @2171: iadd
		// @2172: istore #20
		// @2174: iload #24
		// @2176: iconst_m1
		// @2177: ixor
		// @2178: iconst_m1
		// @2179: if_icmpge @21BE
		// @217C: iconst_0
		// @217D: istore #26
		// @217F: iload #26
		// @2181: iload #24
		// @2183: if_icmpge @21B2
		// @2186: aload #7
		// @2188: aload #23
		// @218A: iload #26
		// @218C: aaload
		// @218D: bipush 10 (0x0A)
		// @218F: iload #21
		// @2191: iadd
		// @2192: iload #20
		// @2194: iload #19
		// @2196: iload #26
		// @2198: imul
		// @2199: ineg
		// @219A: isub
		// @219B: ldc 1021128 (0xf94c8)
		// @219D: iconst_0
		// @219E: invokevirtual game.C_100112_r.func_101749_c(java.lang.String, int, int, int, int)void
		// @21A1: iinc #26 +1
		// @21A4: iload #31
		// @21A6: ifne @21BE
		// @21A9: iload #31
		// @21AB: ifeq @217F
		// @21AE: goto @21B2
		// @21B1: athrow
		// @21B2: iload #20
		// @21B4: iconst_5
		// @21B5: iload #19
		// @21B7: iload #24
		// @21B9: imul
		// @21BA: iadd
		// @21BB: iadd
		// @21BC: istore #20
		// @21BE: aload #15
		// @21C0: ifnull @2204
		// @21C3: aload #15
		// @21C5: iload #21
		// @21C7: sipush 138 (0x008A)
		// @21CA: iadd
		// @21CB: bipush -18 (0xEE)
		// @21CD: iload #20
		// @21CF: iadd
		// @21D0: invokevirtual game.C_100037_wb.func_102386_f(int, int)void
		// @21D3: aload #7
		// @21D5: aload #14
		// @21D7: iload #21
		// @21D9: sipush -138 (0xFF76)
		// @21DC: isub
		// @21DD: bipush -20 (0xEC)
		// @21DF: iload #20
		// @21E1: aload #15
		// @21E3: getfield int game.C_100037_wb.field_102337_u
		// @21E6: iadd
		// @21E7: iadd
		// @21E8: sipush -138 (0xFF76)
		// @21EB: iload #18
		// @21ED: iadd
		// @21EE: iconst_2
		// @21EF: isub
		// @21F0: bipush -2 (0xFE)
		// @21F2: iadd
		// @21F3: bipush 100 (0x64)
		// @21F5: ldc 1021128 (0xf94c8)
		// @21F7: iconst_0
		// @21F8: iconst_0
		// @21F9: iconst_0
		// @21FA: bipush 10 (0x0A)
		// @21FC: invokevirtual game.C_100112_r.func_101729_a(java.lang.String, int, int, int, int, int, int, int, int, int)int
		// @21FF: pop
		// @2200: goto @2204
		// @2203: athrow
		// @2204: iload #10
		// @2206: iconst_m1
		// @2207: ixor
		// @2208: ifne @2219
		// @220B: iconst_m1
		// @220C: iload #11
		// @220E: if_icmpne @2219
		// @2211: goto @2215
		// @2214: athrow
		// @2215: goto @2364
		// @2218: athrow
		// @2219: iload #21
		// @221B: iload #18
		// @221D: ineg
		// @221E: isub
		// @221F: bipush -40 (0xD8)
		// @2221: iadd
		// @2222: istore #26
		// @2224: bipush -10 (0xF6)
		// @2226: iload #20
		// @2228: iadd
		// @2229: istore #27
		// @222B: bipush 10 (0x0A)
		// @222D: istore #28
		// @222F: iload #9
		// @2231: iconst_m1
		// @2232: ixor
		// @2233: iconst_m1
		// @2234: if_icmpgt @2240
		// @2237: iload #18
		// @2239: iconst_2
		// @223A: idiv
		// @223B: iload #21
		// @223D: iadd
		// @223E: istore #26
		// @2240: iload #26
		// @2242: iconst_1
		// @2243: iload #27
		// @2245: iadd
		// @2246: iload #28
		// @2248: ldc 477796 (0x74a64)
		// @224A: invokestatic game.C_100196_rb.func_105776_b(int, int, int, int)void
		// @224D: iload #26
		// @224F: iload #27
		// @2251: iload #28
		// @2253: ldc 1021128 (0xf94c8)
		// @2255: invokestatic game.C_100196_rb.func_105776_b(int, int, int, int)void
		// @2258: sipush 8192 (0x2000)
		// @225B: iload #11
		// @225D: imul
		// @225E: ldc 65536 (0x10000)
		// @2260: idiv
		// @2261: istore #11
		// @2263: aload #7
		// @2265: getstatic java.lang.String game.C_100320_hh.field_102916_S
		// @2268: iload #26
		// @226A: iload #27
		// @226C: iload #28
		// @226E: ineg
		// @226F: bipush 14 (0x0E)
		// @2271: isub
		// @2272: isub
		// @2273: ldc 1044724 (0xff0f4)
		// @2275: iconst_0
		// @2276: invokevirtual game.C_100112_r.func_101744_b(java.lang.String, int, int, int, int)void
		// @2279: sipush 8192 (0x2000)
		// @227C: iload #10
		// @227E: imul
		// @227F: ldc 65536 (0x10000)
		// @2281: idiv
		// @2282: istore #10
		// @2284: iload #10
		// @2286: istore #29
		// @2288: iload #11
		// @228A: iconst_m1
		// @228B: ixor
		// @228C: iload #29
		// @228E: iconst_m1
		// @228F: ixor
		// @2290: if_icmpge @22FB
		// @2293: iload #26
		// @2295: iload #27
		// @2297: iload #26
		// @2299: iload #28
		// @229B: iload #29
		// @229D: iconst_0
		// @229E: invokestatic game.C_100273_mm.func_106673_a(int, boolean)int
		// @22A1: imul
		// @22A2: ldc 65536 (0x10000)
		// @22A4: idiv
		// @22A5: iadd
		// @22A6: iload #27
		// @22A8: iconst_3
		// @22A9: iload #29
		// @22AB: invokestatic game.C_100284_nj.func_106768_a(int, int)int
		// @22AE: iload #28
		// @22B0: imul
		// @22B1: ldc 65536 (0x10000)
		// @22B3: idiv
		// @22B4: ineg
		// @22B5: isub
		// @22B6: ldc 1044724 (0xff0f4)
		// @22B8: invokestatic game.C_100196_rb.func_105802_e(int, int, int, int, int)void
		// @22BB: iload #26
		// @22BD: iconst_1
		// @22BE: iload #27
		// @22C0: iadd
		// @22C1: iload #26
		// @22C3: iload #28
		// @22C5: iload #29
		// @22C7: iconst_0
		// @22C8: invokestatic game.C_100273_mm.func_106673_a(int, boolean)int
		// @22CB: imul
		// @22CC: ldc 65536 (0x10000)
		// @22CE: idiv
		// @22CF: ineg
		// @22D0: isub
		// @22D1: iconst_1
		// @22D2: iload #27
		// @22D4: iadd
		// @22D5: iload #28
		// @22D7: iload_0
		// @22D8: iconst_2
		// @22D9: ixor
		// @22DA: iload #29
		// @22DC: invokestatic game.C_100284_nj.func_106768_a(int, int)int
		// @22DF: imul
		// @22E0: ldc 65536 (0x10000)
		// @22E2: idiv
		// @22E3: ineg
		// @22E4: isub
		// @22E5: ldc 1044724 (0xff0f4)
		// @22E7: invokestatic game.C_100196_rb.func_105802_e(int, int, int, int, int)void
		// @22EA: iinc #29 +100
		// @22ED: iload #31
		// @22EF: ifne @2322
		// @22F2: iload #31
		// @22F4: ifeq @2288
		// @22F7: goto @22FB
		// @22FA: athrow
		// @22FB: iload #26
		// @22FD: iload #27
		// @22FF: iload #11
		// @2301: iconst_0
		// @2302: invokestatic game.C_100273_mm.func_106673_a(int, boolean)int
		// @2305: iload #28
		// @2307: imul
		// @2308: ldc 65536 (0x10000)
		// @230A: idiv
		// @230B: iload #26
		// @230D: iadd
		// @230E: iconst_3
		// @230F: iload #11
		// @2311: invokestatic game.C_100284_nj.func_106768_a(int, int)int
		// @2314: iload #28
		// @2316: imul
		// @2317: ldc 65536 (0x10000)
		// @2319: idiv
		// @231A: iload #27
		// @231C: iadd
		// @231D: ldc 1044724 (0xff0f4)
		// @231F: invokestatic game.C_100196_rb.func_105802_e(int, int, int, int, int)void
		// @2322: iconst_m1
		// @2323: iload #9
		// @2325: iconst_m1
		// @2326: ixor
		// @2327: if_icmpge @232E
		// @232A: goto @2338
		// @232D: athrow
		// @232E: iload #20
		// @2330: iload #28
		// @2332: bipush -18 (0xEE)
		// @2334: isub
		// @2335: iadd
		// @2336: istore #20
		// @2338: iload #26
		// @233A: iconst_1
		// @233B: iload #27
		// @233D: iadd
		// @233E: iload #26
		// @2340: iload #28
		// @2342: iload #11
		// @2344: iconst_0
		// @2345: invokestatic game.C_100273_mm.func_106673_a(int, boolean)int
		// @2348: imul
		// @2349: ldc 65536 (0x10000)
		// @234B: idiv
		// @234C: ineg
		// @234D: isub
		// @234E: iload #28
		// @2350: iconst_3
		// @2351: iload #11
		// @2353: invokestatic game.C_100284_nj.func_106768_a(int, int)int
		// @2356: imul
		// @2357: ldc 65536 (0x10000)
		// @2359: idiv
		// @235A: iconst_1
		// @235B: iload #27
		// @235D: iadd
		// @235E: iadd
		// @235F: ldc 1044724 (0xff0f4)
		// @2361: invokestatic game.C_100196_rb.func_105802_e(int, int, int, int, int)void
		// @2364: bipush 16 (0x10)
		// @2366: getstatic int game.C_100200_ba.field_105852_c
		// @2369: iand
		// @236A: ifne @2371
		// @236D: goto @2383
		// @2370: athrow
		// @2371: iconst_0
		// @2372: bipush 10 (0x0A)
		// @2374: iload #21
		// @2376: iadd
		// @2377: iconst_0
		// @2378: iload #8
		// @237A: bipush -10 (0xF6)
		// @237C: iload #20
		// @237E: iadd
		// @237F: invokestatic game.C_100032_gk.func_103126_a(boolean, int, int, int, int)int
		// @2382: pop
		// @2383: iload #20
		// @2385: iload #25
		// @2387: iadd
		// @2388: istore #20
		// @238A: aconst_null
		// @238B: aload #13
		// @238D: if_acmpeq @23C1
		// @2390: aload #7
		// @2392: aload #13
		// @2394: bipush 10 (0x0A)
		// @2396: iload #21
		// @2398: iadd
		// @2399: iload #20
		// @239B: bipush -20 (0xEC)
		// @239D: iload #18
		// @239F: iadd
		// @23A0: sipush 300 (0x012C)
		// @23A3: ldc 1021128 (0xf94c8)
		// @23A5: iconst_0
		// @23A6: iconst_0
		// @23A7: iconst_0
		// @23A8: iload #19
		// @23AA: invokevirtual game.C_100112_r.func_101729_a(java.lang.String, int, int, int, int, int, int, int, int, int)int
		// @23AD: pop
		// @23AE: iload #20
		// @23B0: aload #7
		// @23B2: aload #13
		// @23B4: bipush -20 (0xEC)
		// @23B6: iload #18
		// @23B8: iadd
		// @23B9: iload #19
		// @23BB: invokevirtual game.C_100112_r.func_101734_a(java.lang.String, int, int)int
		// @23BE: iadd
		// @23BF: istore #20
		// @23C1: aconst_null
		// @23C2: astore #12
		// @23C4: getstatic boolean game.C_100089_fa.field_103726_e
		// @23C7: ifne @23D4
		// @23CA: getstatic java.lang.String[] game.C_100180_ce.field_104812_q
		// @23CD: iconst_0
		// @23CE: aaload
		// @23CF: astore #12
		// @23D1: goto @261D
		// @23D4: bipush 35 (0x23)
		// @23D6: newarray int[]
		// @23D8: astore #13
		// @23DA: getstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @23DD: iload_0
		// @23DE: sipush -3100 (0xF3E4)
		// @23E1: ixor
		// @23E2: invokevirtual game.C_100327_ib.func_102460_q(int)int
		// @23E5: istore #14
		// @23E7: iconst_0
		// @23E8: istore #15
		// @23EA: iload #15
		// @23EC: iconst_m1
		// @23ED: ixor
		// @23EE: iload #14
		// @23F0: iconst_m1
		// @23F1: ixor
		// @23F2: if_icmple @2421
		// @23F5: iconst_0
		// @23F6: iload #31
		// @23F8: ifne @2425
		// @23FB: getstatic int[] game.C_100301_kb.field_107089_g
		// @23FE: iload #15
		// @2400: iaload
		// @2401: if_icmple @240C
		// @2404: goto @2408
		// @2407: athrow
		// @2408: goto @2419
		// @240B: athrow
		// @240C: aload #13
		// @240E: getstatic int[] game.C_100301_kb.field_107089_g
		// @2411: iload #15
		// @2413: iaload
		// @2414: dup2
		// @2415: iaload
		// @2416: iconst_1
		// @2417: iadd
		// @2418: iastore
		// @2419: iinc #15 +1
		// @241C: iload #31
		// @241E: ifeq @23EA
		// @2421: iconst_m1
		// @2422: istore #15
		// @2424: iconst_0
		// @2425: istore #16
		// @2427: iconst_0
		// @2428: istore #17
		// @242A: iload #17
		// @242C: aload #13
		// @242E: arraylength
		// @242F: if_icmpge @2493
		// @2432: getstatic int[] game.C_100212_qc.field_105980_j
		// @2435: iload #17
		// @2437: iaload
		// @2438: istore #18
		// @243A: iconst_2
		// @243B: iload #18
		// @243D: iload #31
		// @243F: ifne @2499
		// @2442: if_icmpne @245B
		// @2445: goto @2449
		// @2448: athrow
		// @2449: iconst_m1
		// @244A: aload #13
		// @244C: iload #17
		// @244E: iaload
		// @244F: iconst_m1
		// @2450: ixor
		// @2451: if_icmple @245B
		// @2454: goto @2458
		// @2457: athrow
		// @2458: iconst_1
		// @2459: istore #16
		// @245B: iload #18
		// @245D: iconst_m1
		// @245E: ixor
		// @245F: iconst_m1
		// @2460: if_icmpeq @248B
		// @2463: bipush -2 (0xFE)
		// @2465: iload #18
		// @2467: iconst_m1
		// @2468: ixor
		// @2469: if_icmpeq @248B
		// @246C: goto @2470
		// @246F: athrow
		// @2470: iload #18
		// @2472: iconst_2
		// @2473: if_icmpeq @248B
		// @2476: goto @247A
		// @2479: athrow
		// @247A: aload #13
		// @247C: iload #17
		// @247E: iaload
		// @247F: iconst_1
		// @2480: if_icmple @248B
		// @2483: goto @2487
		// @2486: athrow
		// @2487: iload #17
		// @2489: istore #15
		// @248B: iinc #17 +1
		// @248E: iload #31
		// @2490: ifeq @242A
		// @2493: iload #15
		// @2495: iconst_m1
		// @2496: ixor
		// @2497: bipush -35 (0xDD)
		// @2499: if_icmpne @24A7
		// @249C: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @249F: bipush 16 (0x10)
		// @24A1: aaload
		// @24A2: astore #12
		// @24A4: goto @261D
		// @24A7: iconst_m1
		// @24A8: iload #15
		// @24AA: if_icmpeq @24CA
		// @24AD: sipush -30945 (0x871F)
		// @24B0: iconst_1
		// @24B1: anewarray java.lang.String
		// @24B4: dup
		// @24B5: iconst_0
		// @24B6: getstatic java.lang.String[] game.C_100167_sj.field_100794_t
		// @24B9: iload #15
		// @24BB: aaload
		// @24BC: aastore
		// @24BD: getstatic java.lang.String[] game.C_100180_ce.field_104812_q
		// @24C0: iconst_1
		// @24C1: aaload
		// @24C2: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @24C5: astore #12
		// @24C7: goto @261D
		// @24CA: aload #13
		// @24CC: bipush 26 (0x1A)
		// @24CE: iaload
		// @24CF: ifle @24DB
		// @24D2: iload #16
		// @24D4: ifeq @2616
		// @24D7: goto @24DB
		// @24DA: athrow
		// @24DB: aload #13
		// @24DD: bipush 28 (0x1C)
		// @24DF: iaload
		// @24E0: ifle @24FB
		// @24E3: goto @24E7
		// @24E6: athrow
		// @24E7: iconst_m1
		// @24E8: getstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @24EB: iload_0
		// @24EC: bipush -90 (0xA6)
		// @24EE: ixor
		// @24EF: invokevirtual game.C_100327_ib.func_102466_i(int)int
		// @24F2: iconst_m1
		// @24F3: ixor
		// @24F4: if_icmple @260C
		// @24F7: goto @24FB
		// @24FA: athrow
		// @24FB: iconst_m1
		// @24FC: aload #13
		// @24FE: bipush 29 (0x1D)
		// @2500: iaload
		// @2501: iconst_m1
		// @2502: ixor
		// @2503: if_icmple @2519
		// @2506: goto @250A
		// @2509: athrow
		// @250A: getstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @250D: bipush 25 (0x19)
		// @250F: invokevirtual game.C_100327_ib.func_102445_j(int)int
		// @2512: ifle @2602
		// @2515: goto @2519
		// @2518: athrow
		// @2519: iconst_0
		// @251A: aload #13
		// @251C: bipush 17 (0x11)
		// @251E: iaload
		// @251F: if_icmpge @253A
		// @2522: goto @2526
		// @2525: athrow
		// @2526: getstatic boolean game.C_100007_fm.field_103631_c
		// @2529: ifne @253A
		// @252C: goto @2530
		// @252F: athrow
		// @2530: getstatic java.lang.String[] game.C_100180_ce.field_104812_q
		// @2533: iconst_5
		// @2534: aaload
		// @2535: astore #12
		// @2537: goto @261D
		// @253A: iconst_m1
		// @253B: aload #13
		// @253D: bipush 16 (0x10)
		// @253F: iaload
		// @2540: iconst_m1
		// @2541: ixor
		// @2542: if_icmple @255A
		// @2545: getstatic boolean game.C_100068_vc.field_104348_h
		// @2548: ifne @255A
		// @254B: goto @254F
		// @254E: athrow
		// @254F: getstatic java.lang.String[] game.C_100180_ce.field_104812_q
		// @2552: bipush 6 (0x06)
		// @2554: aaload
		// @2555: astore #12
		// @2557: goto @261D
		// @255A: aload #13
		// @255C: bipush 22 (0x16)
		// @255E: iaload
		// @255F: iconst_m1
		// @2560: ixor
		// @2561: iconst_m1
		// @2562: if_icmpge @2584
		// @2565: getstatic boolean game.C_100264_mg.field_106524_a
		// @2568: ifne @2584
		// @256B: goto @256F
		// @256E: athrow
		// @256F: getstatic boolean game.C_100238_ol.field_101697_L
		// @2572: ifne @2584
		// @2575: goto @2579
		// @2578: athrow
		// @2579: getstatic java.lang.String[] game.C_100180_ce.field_104812_q
		// @257C: bipush 7 (0x07)
		// @257E: aaload
		// @257F: astore #12
		// @2581: goto @261D
		// @2584: aload #13
		// @2586: bipush 23 (0x17)
		// @2588: iaload
		// @2589: iconst_m1
		// @258A: ixor
		// @258B: iconst_m1
		// @258C: if_icmpge @25A4
		// @258F: getstatic boolean game.C_100293_kj.field_106888_e
		// @2592: ifne @25A4
		// @2595: goto @2599
		// @2598: athrow
		// @2599: getstatic java.lang.String[] game.C_100180_ce.field_104812_q
		// @259C: bipush 8 (0x08)
		// @259E: aaload
		// @259F: astore #12
		// @25A1: goto @261D
		// @25A4: aload #13
		// @25A6: bipush 25 (0x19)
		// @25A8: iaload
		// @25A9: ifle @25C1
		// @25AC: getstatic boolean game.C_100249_pc.field_102329_A
		// @25AF: ifne @25C1
		// @25B2: goto @25B6
		// @25B5: athrow
		// @25B6: getstatic java.lang.String[] game.C_100180_ce.field_104812_q
		// @25B9: bipush 9 (0x09)
		// @25BB: aaload
		// @25BC: astore #12
		// @25BE: goto @261D
		// @25C1: iconst_0
		// @25C2: aload #13
		// @25C4: bipush 24 (0x18)
		// @25C6: iaload
		// @25C7: if_icmpge @25E3
		// @25CA: getstatic int game.C_100015_wh.field_103793_h
		// @25CD: iconst_m1
		// @25CE: ixor
		// @25CF: bipush -6 (0xFA)
		// @25D1: if_icmple @25E3
		// @25D4: goto @25D8
		// @25D7: athrow
		// @25D8: getstatic java.lang.String[] game.C_100180_ce.field_104812_q
		// @25DB: bipush 10 (0x0A)
		// @25DD: aaload
		// @25DE: astore #12
		// @25E0: goto @261D
		// @25E3: getstatic boolean game.C_100332_ii.field_107321_i
		// @25E6: ifeq @261D
		// @25E9: bipush -11 (0xF5)
		// @25EB: getstatic int game.C_100015_wh.field_103793_h
		// @25EE: iconst_m1
		// @25EF: ixor
		// @25F0: if_icmpge @261D
		// @25F3: goto @25F7
		// @25F6: athrow
		// @25F7: getstatic java.lang.String[] game.C_100180_ce.field_104812_q
		// @25FA: bipush 11 (0x0B)
		// @25FC: aaload
		// @25FD: astore #12
		// @25FF: goto @261D
		// @2602: getstatic java.lang.String[] game.C_100180_ce.field_104812_q
		// @2605: iconst_4
		// @2606: aaload
		// @2607: astore #12
		// @2609: goto @261D
		// @260C: getstatic java.lang.String[] game.C_100180_ce.field_104812_q
		// @260F: iconst_3
		// @2610: aaload
		// @2611: astore #12
		// @2613: goto @261D
		// @2616: getstatic java.lang.String[] game.C_100180_ce.field_104812_q
		// @2619: iconst_2
		// @261A: aaload
		// @261B: astore #12
		// @261D: aload #12
		// @261F: ifnull @26A8
		// @2622: getstatic boolean game.C_100202_qi.field_105917_c
		// @2625: ifne @2630
		// @2628: goto @262C
		// @262B: athrow
		// @262C: goto @26A8
		// @262F: athrow
		// @2630: new java.lang.StringBuilder
		// @2633: dup
		// @2634: invokespecial java.lang.StringBuilder.<init>()void
		// @2637: getstatic java.lang.String game.C_100289_jl.field_102898_E
		// @263A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @263D: aload #12
		// @263F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2642: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @2645: astore #12
		// @2647: sipush 283 (0x011B)
		// @264A: istore #13
		// @264C: sipush 230 (0x00E6)
		// @264F: istore #14
		// @2651: bipush 87 (0x57)
		// @2653: istore #15
		// @2655: getstatic game.C_100193_re game.C_100151_bc.field_102942_S
		// @2658: aload #12
		// @265A: iload #13
		// @265C: invokevirtual game.C_100193_re.func_101738_b(java.lang.String, int)int
		// @265F: bipush -10 (0xF6)
		// @2661: isub
		// @2662: istore #16
		// @2664: bipush 10 (0x0A)
		// @2666: getstatic game.C_100193_re game.C_100151_bc.field_102942_S
		// @2669: aload #12
		// @266B: iload #13
		// @266D: bipush 12 (0x0C)
		// @266F: invokevirtual game.C_100193_re.func_101734_a(java.lang.String, int, int)int
		// @2672: iadd
		// @2673: istore #17
		// @2675: iload #16
		// @2677: ineg
		// @2678: iload #13
		// @267A: iadd
		// @267B: iconst_2
		// @267C: idiv
		// @267D: iload #14
		// @267F: iadd
		// @2680: iload #15
		// @2682: bipush -5 (0xFB)
		// @2684: iadd
		// @2685: iload #16
		// @2687: iload #17
		// @2689: iconst_0
		// @268A: sipush 150 (0x0096)
		// @268D: invokestatic game.C_100196_rb.func_105804_g(int, int, int, int, int, int)void
		// @2690: getstatic game.C_100193_re game.C_100151_bc.field_102942_S
		// @2693: aload #12
		// @2695: iload #14
		// @2697: iload #15
		// @2699: iload #13
		// @269B: bipush 100 (0x64)
		// @269D: ldc 16711680 (0xff0000)
		// @269F: iconst_0
		// @26A0: iconst_1
		// @26A1: iconst_0
		// @26A2: bipush 12 (0x0C)
		// @26A4: invokevirtual game.C_100193_re.func_101729_a(java.lang.String, int, int, int, int, int, int, int, int, int)int
		// @26A7: pop
		// @26A8: getstatic game.C_100302_ka game.SteelSentinels.field_105277_K
		// @26AB: ifnull @2AA8
		// @26AE: iconst_0
		// @26AF: istore #13
		// @26B1: aconst_null
		// @26B2: astore #14
		// @26B4: iconst_0
		// @26B5: getstatic int game.C_100200_ba.field_105852_c
		// @26B8: if_icmpeq @28C8
		// @26BB: getstatic game.C_100302_ka game.SteelSentinels.field_105277_K
		// @26BE: getfield long game.C_100302_ka.field_100595_c
		// @26C1: l2i
		// @26C2: bipush 97 (0x61)
		// @26C4: invokestatic game.C_100209_qb.func_102686_b(int, byte)game.C_100327_ib
		// @26C7: astore #15
		// @26C9: getstatic game.C_100302_ka game.SteelSentinels.field_105277_K
		// @26CC: getfield java.lang.String game.C_100302_ka.field_101890_ab
		// @26CF: iconst_5
		// @26D0: bipush 6 (0x06)
		// @26D2: invokevirtual java.lang.String.substring(int, int)java.lang.String
		// @26D5: invokestatic java.lang.Integer.parseInt(java.lang.String)int
		// @26D8: istore #13
		// @26DA: iconst_1
		// @26DB: getstatic int game.C_100200_ba.field_105852_c
		// @26DE: iand
		// @26DF: iconst_m1
		// @26E0: ixor
		// @26E1: iconst_m1
		// @26E2: if_icmpne @2739
		// @26E5: bipush -3 (0xFD)
		// @26E7: iload #13
		// @26E9: iconst_m1
		// @26EA: ixor
		// @26EB: if_icmpeq @26FF
		// @26EE: goto @26F2
		// @26F1: athrow
		// @26F2: iload #13
		// @26F4: iconst_m1
		// @26F5: ixor
		// @26F6: bipush -4 (0xFC)
		// @26F8: if_icmpne @2739
		// @26FB: goto @26FF
		// @26FE: athrow
		// @26FF: getstatic game.C_100302_ka game.SteelSentinels.field_105277_K
		// @2702: getfield int game.C_100302_ka.field_101840_Eb
		// @2705: getstatic game.C_100302_ka game.SteelSentinels.field_105277_K
		// @2708: getfield int game.C_100302_ka.field_101886_Kb
		// @270B: iadd
		// @270C: bipush -30 (0xE2)
		// @270E: iadd
		// @270F: getstatic int game.C_100015_wh.field_103781_g
		// @2712: if_icmple @2739
		// @2715: goto @2719
		// @2718: athrow
		// @2719: aload #15
		// @271B: iload_0
		// @271C: sipush -3100 (0xF3E4)
		// @271F: ixor
		// @2720: invokevirtual game.C_100327_ib.func_102460_q(int)int
		// @2723: iconst_m1
		// @2724: ixor
		// @2725: iconst_m1
		// @2726: if_icmpge @2736
		// @2729: goto @272D
		// @272C: athrow
		// @272D: bipush 6 (0x06)
		// @272F: istore #13
		// @2731: iload #31
		// @2733: ifeq @2739
		// @2736: iconst_m1
		// @2737: istore #13
		// @2739: iload #13
		// @273B: istore #16
		// @273D: iconst_m1
		// @273E: iload #16
		// @2740: iconst_m1
		// @2741: ixor
		// @2742: if_icmpne @274E
		// @2745: iload #31
		// @2747: ifeq @2783
		// @274A: goto @274E
		// @274D: athrow
		// @274E: iload #16
		// @2750: iconst_1
		// @2751: if_icmpeq @27A4
		// @2754: goto @2758
		// @2757: athrow
		// @2758: iload #16
		// @275A: iconst_2
		// @275B: if_icmpeq @27CA
		// @275E: goto @2762
		// @2761: athrow
		// @2762: iload #16
		// @2764: iconst_m1
		// @2765: ixor
		// @2766: bipush -4 (0xFC)
		// @2768: if_icmpeq @2816
		// @276B: goto @276F
		// @276E: athrow
		// @276F: bipush 6 (0x06)
		// @2771: iload #16
		// @2773: if_icmpne @2881
		// @2776: goto @277A
		// @2779: athrow
		// @277A: iload #31
		// @277C: ifeq @2864
		// @277F: goto @2783
		// @2782: athrow
		// @2783: sipush -30945 (0x871F)
		// @2786: iconst_1
		// @2787: anewarray java.lang.String
		// @278A: dup
		// @278B: iconst_0
		// @278C: aload #15
		// @278E: iconst_0
		// @278F: invokevirtual game.C_100327_ib.func_102447_l(int)int
		// @2792: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @2795: aastore
		// @2796: getstatic java.lang.String[] game.C_100303_kk.field_104794_i
		// @2799: bipush 7 (0x07)
		// @279B: aaload
		// @279C: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @279F: astore #14
		// @27A1: goto @2881
		// @27A4: iload_0
		// @27A5: sipush -30946 (0x871E)
		// @27A8: iadd
		// @27A9: iconst_1
		// @27AA: anewarray java.lang.String
		// @27AD: dup
		// @27AE: iconst_0
		// @27AF: getstatic int[] game.C_100064_ve.field_103015_v
		// @27B2: aload #15
		// @27B4: getfield int game.C_100327_ib.field_102494_P
		// @27B7: iaload
		// @27B8: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @27BB: aastore
		// @27BC: getstatic java.lang.String[] game.C_100303_kk.field_104794_i
		// @27BF: bipush 8 (0x08)
		// @27C1: aaload
		// @27C2: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @27C5: astore #14
		// @27C7: goto @2881
		// @27CA: iconst_0
		// @27CB: iconst_1
		// @27CC: getstatic int game.C_100200_ba.field_105852_c
		// @27CF: iand
		// @27D0: if_icmpeq @280C
		// @27D3: aload #15
		// @27D5: getfield int game.C_100327_ib.field_102494_P
		// @27D8: iconst_m1
		// @27D9: invokestatic game.C_100152_bd.func_105179_a(int, int)int
		// @27DC: istore #16
		// @27DE: sipush -30945 (0x871F)
		// @27E1: iconst_1
		// @27E2: anewarray java.lang.String
		// @27E5: dup
		// @27E6: iconst_0
		// @27E7: iconst_m1
		// @27E8: iload #16
		// @27EA: iconst_m1
		// @27EB: ixor
		// @27EC: if_icmpge @27F4
		// @27EF: iconst_0
		// @27F0: goto @27FA
		// @27F3: athrow
		// @27F4: getstatic int[] game.C_100254_pi.field_106458_k
		// @27F7: iload #16
		// @27F9: iaload
		// @27FA: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @27FD: aastore
		// @27FE: getstatic java.lang.String[] game.C_100303_kk.field_104794_i
		// @2801: bipush 9 (0x09)
		// @2803: aaload
		// @2804: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @2807: astore #14
		// @2809: goto @2881
		// @280C: getstatic java.lang.String[] game.C_100303_kk.field_104794_i
		// @280F: iconst_1
		// @2810: aaload
		// @2811: astore #14
		// @2813: goto @2881
		// @2816: iconst_m1
		// @2817: iconst_1
		// @2818: getstatic int game.C_100200_ba.field_105852_c
		// @281B: iand
		// @281C: iconst_m1
		// @281D: ixor
		// @281E: if_icmpne @282B
		// @2821: getstatic java.lang.String[] game.C_100303_kk.field_104794_i
		// @2824: iconst_2
		// @2825: aaload
		// @2826: astore #14
		// @2828: goto @2881
		// @282B: aload #15
		// @282D: getfield int game.C_100327_ib.field_102494_P
		// @2830: iconst_m1
		// @2831: invokestatic game.C_100152_bd.func_105179_a(int, int)int
		// @2834: istore #16
		// @2836: sipush -30945 (0x871F)
		// @2839: iconst_1
		// @283A: anewarray java.lang.String
		// @283D: dup
		// @283E: iconst_0
		// @283F: iconst_m1
		// @2840: iload #16
		// @2842: iconst_m1
		// @2843: ixor
		// @2844: if_icmpge @284C
		// @2847: iconst_0
		// @2848: goto @2852
		// @284B: athrow
		// @284C: getstatic int[] game.C_100254_pi.field_106458_k
		// @284F: iload #16
		// @2851: iaload
		// @2852: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @2855: aastore
		// @2856: getstatic java.lang.String[] game.C_100303_kk.field_104794_i
		// @2859: bipush 10 (0x0A)
		// @285B: aaload
		// @285C: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @285F: astore #14
		// @2861: goto @2881
		// @2864: sipush -30945 (0x871F)
		// @2867: iconst_1
		// @2868: anewarray java.lang.String
		// @286B: dup
		// @286C: iconst_0
		// @286D: aload #15
		// @286F: sipush -3099 (0xF3E5)
		// @2872: invokevirtual game.C_100327_ib.func_102460_q(int)int
		// @2875: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @2878: aastore
		// @2879: getstatic java.lang.String game.C_100338_jc.field_105368_c
		// @287C: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @287F: astore #14
		// @2881: iload #13
		// @2883: bipush 6 (0x06)
		// @2885: if_icmpeq @28C5
		// @2888: iconst_0
		// @2889: getstatic game.C_100302_ka game.SteelSentinels.field_105277_K
		// @288C: getfield java.lang.String game.C_100302_ka.field_101890_ab
		// @288F: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @2892: bipush 34 (0x22)
		// @2894: aaload
		// @2895: invokevirtual java.lang.String.indexOf(java.lang.String)int
		// @2898: if_icmpgt @28C5
		// @289B: goto @289F
		// @289E: athrow
		// @289F: iconst_0
		// @28A0: getstatic game.C_100302_ka game.SteelSentinels.field_105277_K
		// @28A3: getfield java.lang.String game.C_100302_ka.field_101890_ab
		// @28A6: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @28A9: bipush 11 (0x0B)
		// @28AB: aaload
		// @28AC: invokevirtual java.lang.String.indexOf(java.lang.String)int
		// @28AF: if_icmple @28BA
		// @28B2: goto @28B6
		// @28B5: athrow
		// @28B6: goto @28C5
		// @28B9: athrow
		// @28BA: iconst_2
		// @28BB: istore #13
		// @28BD: getstatic java.lang.String[] game.C_100303_kk.field_104794_i
		// @28C0: bipush 11 (0x0B)
		// @28C2: aaload
		// @28C3: astore #14
		// @28C5: goto @2A02
		// @28C8: getstatic game.C_100302_ka game.SteelSentinels.field_105277_K
		// @28CB: getfield long game.C_100302_ka.field_100595_c
		// @28CE: l2i
		// @28CF: istore #15
		// @28D1: getstatic game.C_100302_ka game.SteelSentinels.field_105277_K
		// @28D4: getfield java.lang.String game.C_100302_ka.field_101890_ab
		// @28D7: iconst_5
		// @28D8: bipush 6 (0x06)
		// @28DA: invokevirtual java.lang.String.substring(int, int)java.lang.String
		// @28DD: invokestatic java.lang.Integer.parseInt(java.lang.String)int
		// @28E0: istore #13
		// @28E2: iload #13
		// @28E4: istore #16
		// @28E6: iload #16
		// @28E8: iconst_m1
		// @28E9: ixor
		// @28EA: bipush -2 (0xFE)
		// @28EC: if_icmpeq @294C
		// @28EF: iload #16
		// @28F1: iconst_m1
		// @28F2: ixor
		// @28F3: bipush -3 (0xFD)
		// @28F5: if_icmpeq @296C
		// @28F8: goto @28FC
		// @28FB: athrow
		// @28FC: iload #16
		// @28FE: iconst_3
		// @28FF: if_icmpne @290F
		// @2902: goto @2906
		// @2905: athrow
		// @2906: iload #31
		// @2908: ifeq @2976
		// @290B: goto @290F
		// @290E: athrow
		// @290F: bipush -5 (0xFB)
		// @2911: iload #16
		// @2913: iconst_m1
		// @2914: ixor
		// @2915: if_icmpne @2925
		// @2918: goto @291C
		// @291B: athrow
		// @291C: iload #31
		// @291E: ifeq @2980
		// @2921: goto @2925
		// @2924: athrow
		// @2925: iload #16
		// @2927: iconst_5
		// @2928: if_icmpne @2938
		// @292B: goto @292F
		// @292E: athrow
		// @292F: iload #31
		// @2931: ifeq @29A1
		// @2934: goto @2938
		// @2937: athrow
		// @2938: bipush 7 (0x07)
		// @293A: iload #16
		// @293C: if_icmpne @2A02
		// @293F: goto @2943
		// @2942: athrow
		// @2943: iload #31
		// @2945: ifeq @29C7
		// @2948: goto @294C
		// @294B: athrow
		// @294C: sipush -30945 (0x871F)
		// @294F: iconst_1
		// @2950: anewarray java.lang.String
		// @2953: dup
		// @2954: iconst_0
		// @2955: getstatic int[] game.C_100021_wn.field_103870_e
		// @2958: iload #15
		// @295A: iaload
		// @295B: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @295E: aastore
		// @295F: getstatic java.lang.String[] game.C_100303_kk.field_104794_i
		// @2962: iconst_0
		// @2963: aaload
		// @2964: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @2967: astore #14
		// @2969: goto @2A02
		// @296C: getstatic java.lang.String[] game.C_100303_kk.field_104794_i
		// @296F: iconst_1
		// @2970: aaload
		// @2971: astore #14
		// @2973: goto @2A02
		// @2976: getstatic java.lang.String[] game.C_100303_kk.field_104794_i
		// @2979: iconst_2
		// @297A: aaload
		// @297B: astore #14
		// @297D: goto @2A02
		// @2980: sipush -30945 (0x871F)
		// @2983: iconst_1
		// @2984: anewarray java.lang.String
		// @2987: dup
		// @2988: iconst_0
		// @2989: bipush -47 (0xD1)
		// @298B: iload #15
		// @298D: invokestatic game.C_100064_ve.func_103009_a(int, int)int
		// @2990: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @2993: aastore
		// @2994: getstatic java.lang.String[] game.C_100303_kk.field_104794_i
		// @2997: iconst_3
		// @2998: aaload
		// @2999: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @299C: astore #14
		// @299E: goto @2A02
		// @29A1: sipush -30945 (0x871F)
		// @29A4: iconst_1
		// @29A5: anewarray java.lang.String
		// @29A8: dup
		// @29A9: iconst_0
		// @29AA: iload_0
		// @29AB: bipush -122 (0x86)
		// @29AD: ixor
		// @29AE: iload #15
		// @29B0: invokestatic game.C_100064_ve.func_103009_a(int, int)int
		// @29B3: bipush 100 (0x64)
		// @29B5: imul
		// @29B6: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @29B9: aastore
		// @29BA: getstatic java.lang.String[] game.C_100303_kk.field_104794_i
		// @29BD: iconst_4
		// @29BE: aaload
		// @29BF: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @29C2: astore #14
		// @29C4: goto @2A02
		// @29C7: bipush -21 (0xEB)
		// @29C9: iload #15
		// @29CB: iconst_m1
		// @29CC: ixor
		// @29CD: if_icmpeq @29FA
		// @29D0: iload_0
		// @29D1: sipush -30946 (0x871E)
		// @29D4: ixor
		// @29D5: iconst_1
		// @29D6: anewarray java.lang.String
		// @29D9: dup
		// @29DA: iconst_0
		// @29DB: iload_0
		// @29DC: bipush -60 (0xC4)
		// @29DE: ixor
		// @29DF: iload #15
		// @29E1: invokestatic game.C_100064_ve.func_103009_a(int, int)int
		// @29E4: bipush 50 (0x32)
		// @29E6: imul
		// @29E7: iconst_3
		// @29E8: idiv
		// @29E9: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @29EC: aastore
		// @29ED: getstatic java.lang.String[] game.C_100303_kk.field_104794_i
		// @29F0: iconst_5
		// @29F1: aaload
		// @29F2: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @29F5: astore #14
		// @29F7: goto @2A02
		// @29FA: getstatic java.lang.String[] game.C_100303_kk.field_104794_i
		// @29FD: bipush 6 (0x06)
		// @29FF: aaload
		// @2A00: astore #14
		// @2A02: aload #14
		// @2A04: ifnull @2AA8
		// @2A07: bipush 13 (0x0D)
		// @2A09: istore #15
		// @2A0B: bipush 20 (0x14)
		// @2A0D: getstatic game.C_100302_ka game.SteelSentinels.field_105277_K
		// @2A10: getfield int game.C_100302_ka.field_101840_Eb
		// @2A13: iadd
		// @2A14: istore #16
		// @2A16: getstatic game.C_100302_ka game.SteelSentinels.field_105277_K
		// @2A19: getfield int game.C_100302_ka.field_101835_xb
		// @2A1C: iload #15
		// @2A1E: ineg
		// @2A1F: bipush -2 (0xFE)
		// @2A21: isub
		// @2A22: iadd
		// @2A23: istore #17
		// @2A25: iload #13
		// @2A27: iconst_m1
		// @2A28: ixor
		// @2A29: bipush -7 (0xF9)
		// @2A2B: if_icmpne @2A35
		// @2A2E: iinc #16 +236
		// @2A31: goto @2A35
		// @2A34: athrow
		// @2A35: bipush 8 (0x08)
		// @2A37: getstatic game.C_100317_lb game.C_100311_le.field_104719_A
		// @2A3A: aload #14
		// @2A3C: invokevirtual game.C_100317_lb.func_101739_b(java.lang.String)int
		// @2A3F: iadd
		// @2A40: istore #18
		// @2A42: iload #13
		// @2A44: iconst_2
		// @2A45: if_icmpeq @2A52
		// @2A48: iload #13
		// @2A4A: iconst_3
		// @2A4B: if_icmpne @2A74
		// @2A4E: goto @2A52
		// @2A51: athrow
		// @2A52: iconst_0
		// @2A53: iconst_1
		// @2A54: getstatic int game.C_100200_ba.field_105852_c
		// @2A57: iand
		// @2A58: if_icmpne @2A74
		// @2A5B: goto @2A5F
		// @2A5E: athrow
		// @2A5F: iload #18
		// @2A61: ineg
		// @2A62: getstatic game.C_100302_ka game.SteelSentinels.field_105277_K
		// @2A65: getfield int game.C_100302_ka.field_101886_Kb
		// @2A68: getstatic game.C_100302_ka game.SteelSentinels.field_105277_K
		// @2A6B: getfield int game.C_100302_ka.field_101840_Eb
		// @2A6E: iadd
		// @2A6F: iadd
		// @2A70: iconst_4
		// @2A71: isub
		// @2A72: istore #16
		// @2A74: iload #16
		// @2A76: iload #17
		// @2A78: iload #18
		// @2A7A: iload #15
		// @2A7C: iconst_0
		// @2A7D: sipush 192 (0x00C0)
		// @2A80: invokestatic game.C_100196_rb.func_105804_g(int, int, int, int, int, int)void
		// @2A83: iload #16
		// @2A85: iload #17
		// @2A87: iload #18
		// @2A89: iload #15
		// @2A8B: ldc 1400960 (0x156080)
		// @2A8D: sipush 192 (0x00C0)
		// @2A90: invokestatic game.C_100196_rb.func_105810_f(int, int, int, int, int, int)void
		// @2A93: getstatic game.C_100317_lb game.C_100311_le.field_104719_A
		// @2A96: aload #14
		// @2A98: iload #16
		// @2A9A: bipush -4 (0xFC)
		// @2A9C: isub
		// @2A9D: bipush 10 (0x0A)
		// @2A9F: iload #17
		// @2AA1: iadd
		// @2AA2: ldc 16777215 (0xffffff)
		// @2AA4: iconst_m1
		// @2AA5: invokevirtual game.C_100317_lb.func_101749_c(java.lang.String, int, int, int, int)void
		// @2AA8: iconst_m1
		// @2AA9: getstatic int game.C_100068_vc.field_104343_e
		// @2AAC: iconst_m1
		// @2AAD: ixor
		// @2AAE: if_icmplt @2ACD
		// @2AB1: getstatic int game.C_100068_vc.field_104343_e
		// @2AB4: bipush 15 (0x0F)
		// @2AB6: if_icmpeq @2ACD
		// @2AB9: goto @2ABD
		// @2ABC: athrow
		// @2ABD: getstatic game.C_100067_vd[] game.C_100066_dl.field_101641_u
		// @2AC0: getstatic int game.C_100068_vc.field_104343_e
		// @2AC3: aaload
		// @2AC4: bipush -106 (0x96)
		// @2AC6: invokevirtual game.C_100067_vd.func_104301_b(int)void
		// @2AC9: goto @2ACD
		// @2ACC: athrow
		// @2ACD: goto @2AF2
		// @2AD0: astore_1
		// @2AD1: aload_1
		// @2AD2: new java.lang.StringBuilder
		// @2AD5: dup
		// @2AD6: invokespecial java.lang.StringBuilder.<init>()void
		// @2AD9: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @2ADC: bipush 28 (0x1C)
		// @2ADE: aaload
		// @2ADF: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2AE2: iload_0
		// @2AE3: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2AE6: bipush 41 (0x29)
		// @2AE8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2AEB: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @2AEE: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @2AF1: athrow
		// @2AF2: return
	}
	
	final void func_104440_c(int arg0)
	{
		// @00: aconst_null
		// @01: aload_0
		// @02: getfield game.C_100091_m game.C_100216_aj.field_104450_C
		// @05: if_acmpeq @0B
		// @08: goto @0C
		// @0B: return
		// @0C: aload_0
		// @0D: iconst_1
		// @0E: putfield boolean game.C_100216_aj.field_104468_y
		// @11: iload_1
		// @12: sipush 1358 (0x054E)
		// @15: if_icmpeq @19
		// @18: return
		// @19: aconst_null
		// @1A: aload_0
		// @1B: getfield game.C_100202_qi game.C_100216_aj.field_104460_v
		// @1E: if_acmpeq @25
		// @21: goto @30
		// @24: athrow
		// @25: aload_0
		// @26: new game.C_100202_qi
		// @29: dup
		// @2A: invokespecial game.C_100202_qi.<init>()void
		// @2D: putfield game.C_100202_qi game.C_100216_aj.field_104460_v
		// @30: goto @54
		// @33: astore_2
		// @34: aload_2
		// @35: new java.lang.StringBuilder
		// @38: dup
		// @39: invokespecial java.lang.StringBuilder.<init>()void
		// @3C: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @3F: iconst_0
		// @40: aaload
		// @41: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @44: iload_1
		// @45: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @48: bipush 41 (0x29)
		// @4A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @50: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @53: athrow
		// @54: return
	}
	
	final C_100254_pi func_104430_a(int arg0)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #4
		// @005: aconst_null
		// @006: aload_0
		// @007: getfield game.C_100254_pi game.C_100216_aj.field_104458_i
		// @00A: if_acmpne @011
		// @00D: goto @016
		// @010: athrow
		// @011: aload_0
		// @012: getfield game.C_100254_pi game.C_100216_aj.field_104458_i
		// @015: areturn
		// @016: iload_1
		// @017: bipush -15 (0xF1)
		// @019: if_icmpeq @025
		// @01C: aload_0
		// @01D: iconst_1
		// @01E: invokevirtual game.C_100216_aj.func_104438_b(boolean)void
		// @021: goto @025
		// @024: athrow
		// @025: aconst_null
		// @026: aload_0
		// @027: getfield game.C_100071_va game.C_100216_aj.field_104456_k
		// @02A: if_acmpeq @031
		// @02D: goto @054
		// @030: athrow
		// @031: aload_0
		// @032: getfield game.C_100104_v game.C_100216_aj.field_104453_l
		// @035: iconst_0
		// @036: invokevirtual game.C_100104_v.func_104674_c(int)boolean
		// @039: ifeq @03E
		// @03C: aconst_null
		// @03D: areturn
		// @03E: aload_0
		// @03F: aload_0
		// @040: getfield game.C_100104_v game.C_100216_aj.field_104453_l
		// @043: iconst_1
		// @044: aload_0
		// @045: getfield int game.C_100216_aj.field_104461_u
		// @048: sipush 255 (0x00FF)
		// @04B: bipush 127 (0x7F)
		// @04D: iconst_0
		// @04E: invokevirtual game.C_100104_v.func_104683_a(boolean, int, int, int, byte)game.C_100192_rf
		// @051: putfield game.C_100071_va game.C_100216_aj.field_104456_k
		// @054: aload_0
		// @055: getfield game.C_100071_va game.C_100216_aj.field_104456_k
		// @058: getfield boolean game.C_100071_va.field_101661_C
		// @05B: ifeq @060
		// @05E: aconst_null
		// @05F: areturn
		// @060: aload_0
		// @061: getfield game.C_100071_va game.C_100216_aj.field_104456_k
		// @064: sipush -20679 (0xAF39)
		// @067: invokevirtual game.C_100071_va.func_101649_j(int)byte[]
		// @06A: astore_2
		// @06B: aload_0
		// @06C: getfield game.C_100071_va game.C_100216_aj.field_104456_k
		// @06F: instanceof game.C_100238_ol
		// @072: ifne @106
		// @075: aconst_null
		// @076: aload_2
		// @077: if_acmpne @083
		// @07A: new java.lang.RuntimeException
		// @07D: dup
		// @07E: invokespecial java.lang.RuntimeException.<init>()void
		// @081: athrow
		// @082: athrow
		// @083: aload_0
		// @084: new game.C_100254_pi
		// @087: dup
		// @088: aload_2
		// @089: aload_0
		// @08A: getfield int game.C_100216_aj.field_104466_p
		// @08D: aload_0
		// @08E: getfield byte[] game.C_100216_aj.field_104463_s
		// @091: invokespecial game.C_100254_pi.<init>(byte[], int, byte[])void
		// @094: putfield game.C_100254_pi game.C_100216_aj.field_104458_i
		// @097: goto @0E3
		// @09A: astore_3
		// @09B: aload_0
		// @09C: getfield game.C_100104_v game.C_100216_aj.field_104453_l
		// @09F: iconst_0
		// @0A0: invokevirtual game.C_100104_v.func_104681_a(boolean)void
		// @0A3: aload_0
		// @0A4: aconst_null
		// @0A5: putfield game.C_100254_pi game.C_100216_aj.field_104458_i
		// @0A8: aload_0
		// @0A9: getfield game.C_100104_v game.C_100216_aj.field_104453_l
		// @0AC: iload_1
		// @0AD: bipush -15 (0xF1)
		// @0AF: ixor
		// @0B0: invokevirtual game.C_100104_v.func_104674_c(int)boolean
		// @0B3: ifne @0D8
		// @0B6: aload_0
		// @0B7: aload_0
		// @0B8: getfield game.C_100104_v game.C_100216_aj.field_104453_l
		// @0BB: iconst_1
		// @0BC: aload_0
		// @0BD: getfield int game.C_100216_aj.field_104461_u
		// @0C0: sipush 255 (0x00FF)
		// @0C3: iload_1
		// @0C4: sipush 142 (0x008E)
		// @0C7: iadd
		// @0C8: iconst_0
		// @0C9: invokevirtual game.C_100104_v.func_104683_a(boolean, int, int, int, byte)game.C_100192_rf
		// @0CC: putfield game.C_100071_va game.C_100216_aj.field_104456_k
		// @0CF: iload #4
		// @0D1: ifeq @0E1
		// @0D4: goto @0D8
		// @0D7: athrow
		// @0D8: aload_0
		// @0D9: aconst_null
		// @0DA: putfield game.C_100071_va game.C_100216_aj.field_104456_k
		// @0DD: goto @0E1
		// @0E0: athrow
		// @0E1: aconst_null
		// @0E2: areturn
		// @0E3: aconst_null
		// @0E4: aload_0
		// @0E5: getfield game.C_100091_m game.C_100216_aj.field_104451_n
		// @0E8: if_acmpne @0EF
		// @0EB: goto @18A
		// @0EE: athrow
		// @0EF: aload_0
		// @0F0: getfield game.C_100178_cg game.C_100216_aj.field_104464_r
		// @0F3: aload_2
		// @0F4: aload_0
		// @0F5: getfield game.C_100091_m game.C_100216_aj.field_104451_n
		// @0F8: aload_0
		// @0F9: getfield int game.C_100216_aj.field_104461_u
		// @0FC: iconst_2
		// @0FD: invokevirtual game.C_100178_cg.func_105683_a(byte[], game.C_100091_m, int, int)game.C_100238_ol
		// @100: pop
		// @101: iload #4
		// @103: ifeq @18A
		// @106: aconst_null
		// @107: aload_2
		// @108: if_acmpeq @10F
		// @10B: goto @117
		// @10E: athrow
		// @10F: new java.lang.RuntimeException
		// @112: dup
		// @113: invokespecial java.lang.RuntimeException.<init>()void
		// @116: athrow
		// @117: aload_0
		// @118: new game.C_100254_pi
		// @11B: dup
		// @11C: aload_2
		// @11D: aload_0
		// @11E: getfield int game.C_100216_aj.field_104466_p
		// @121: aload_0
		// @122: getfield byte[] game.C_100216_aj.field_104463_s
		// @125: invokespecial game.C_100254_pi.<init>(byte[], int, byte[])void
		// @128: putfield game.C_100254_pi game.C_100216_aj.field_104458_i
		// @12B: aload_0
		// @12C: getfield int game.C_100216_aj.field_104465_q
		// @12F: iconst_m1
		// @130: ixor
		// @131: aload_0
		// @132: getfield game.C_100254_pi game.C_100216_aj.field_104458_i
		// @135: getfield int game.C_100254_pi.field_106461_w
		// @138: iconst_m1
		// @139: ixor
		// @13A: if_icmpeq @146
		// @13D: new java.lang.RuntimeException
		// @140: dup
		// @141: invokespecial java.lang.RuntimeException.<init>()void
		// @144: athrow
		// @145: athrow
		// @146: goto @18A
		// @149: astore_3
		// @14A: aload_0
		// @14B: aconst_null
		// @14C: putfield game.C_100254_pi game.C_100216_aj.field_104458_i
		// @14F: aload_0
		// @150: getfield game.C_100104_v game.C_100216_aj.field_104453_l
		// @153: iload_1
		// @154: bipush -15 (0xF1)
		// @156: ixor
		// @157: invokevirtual game.C_100104_v.func_104674_c(int)boolean
		// @15A: ifne @17F
		// @15D: aload_0
		// @15E: aload_0
		// @15F: getfield game.C_100104_v game.C_100216_aj.field_104453_l
		// @162: iconst_1
		// @163: aload_0
		// @164: getfield int game.C_100216_aj.field_104461_u
		// @167: sipush 255 (0x00FF)
		// @16A: iload_1
		// @16B: sipush 142 (0x008E)
		// @16E: iadd
		// @16F: iconst_0
		// @170: invokevirtual game.C_100104_v.func_104683_a(boolean, int, int, int, byte)game.C_100192_rf
		// @173: putfield game.C_100071_va game.C_100216_aj.field_104456_k
		// @176: iload #4
		// @178: ifeq @188
		// @17B: goto @17F
		// @17E: athrow
		// @17F: aload_0
		// @180: aconst_null
		// @181: putfield game.C_100071_va game.C_100216_aj.field_104456_k
		// @184: goto @188
		// @187: athrow
		// @188: aconst_null
		// @189: areturn
		// @18A: aconst_null
		// @18B: aload_0
		// @18C: getfield game.C_100091_m game.C_100216_aj.field_104450_C
		// @18F: if_acmpeq @1A3
		// @192: aload_0
		// @193: aload_0
		// @194: getfield game.C_100254_pi game.C_100216_aj.field_104458_i
		// @197: getfield int game.C_100254_pi.field_106462_v
		// @19A: newarray byte[]
		// @19C: putfield byte[] game.C_100216_aj.field_104469_x
		// @19F: goto @1A3
		// @1A2: athrow
		// @1A3: aload_0
		// @1A4: aconst_null
		// @1A5: putfield game.C_100071_va game.C_100216_aj.field_104456_k
		// @1A8: aload_0
		// @1A9: getfield game.C_100254_pi game.C_100216_aj.field_104458_i
		// @1AC: areturn
		// @1AD: astore_2
		// @1AE: aload_2
		// @1AF: new java.lang.StringBuilder
		// @1B2: dup
		// @1B3: invokespecial java.lang.StringBuilder.<init>()void
		// @1B6: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @1B9: bipush 8 (0x08)
		// @1BB: aaload
		// @1BC: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1BF: iload_1
		// @1C0: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1C3: bipush 41 (0x29)
		// @1C5: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1C8: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @1CB: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @1CE: athrow
	}
	
	private final C_100071_va func_104444_a(int arg0, byte arg1, int arg2)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #10
		// @005: aload_0
		// @006: getfield game.C_100119_ua game.C_100216_aj.field_104448_A
		// @009: iload_3
		// @00A: i2l
		// @00B: iload_2
		// @00C: bipush -36 (0xDC)
		// @00E: ixor
		// @00F: invokevirtual game.C_100119_ua.func_104891_a(long, int)game.C_100158_da
		// @012: checkcast game.C_100071_va
		// @015: astore #4
		// @017: aconst_null
		// @018: aload #4
		// @01A: if_acmpeq @04C
		// @01D: iconst_0
		// @01E: iload_1
		// @01F: if_icmpne @04C
		// @022: goto @026
		// @025: athrow
		// @026: aload #4
		// @028: getfield boolean game.C_100071_va.field_101657_D
		// @02B: ifne @04C
		// @02E: goto @032
		// @031: athrow
		// @032: aload #4
		// @034: getfield boolean game.C_100071_va.field_101661_C
		// @037: ifne @042
		// @03A: goto @03E
		// @03D: athrow
		// @03E: goto @04C
		// @041: athrow
		// @042: aload #4
		// @044: bipush 45 (0x2D)
		// @046: invokevirtual game.C_100071_va.func_100583_c(int)void
		// @049: aconst_null
		// @04A: astore #4
		// @04C: iload_2
		// @04D: bipush -15 (0xF1)
		// @04F: if_icmpeq @05F
		// @052: aload_0
		// @053: bipush 64 (0x40)
		// @055: bipush -26 (0xE6)
		// @057: invokevirtual game.C_100216_aj.func_104425_a(int, int)byte[]
		// @05A: pop
		// @05B: goto @05F
		// @05E: athrow
		// @05F: aconst_null
		// @060: aload #4
		// @062: if_acmpeq @069
		// @065: goto @15F
		// @068: athrow
		// @069: iconst_0
		// @06A: iload_1
		// @06B: if_icmpne @0C7
		// @06E: aconst_null
		// @06F: aload_0
		// @070: getfield game.C_100091_m game.C_100216_aj.field_104450_C
		// @073: if_acmpeq @09F
		// @076: goto @07A
		// @079: athrow
		// @07A: iconst_0
		// @07B: aload_0
		// @07C: getfield byte[] game.C_100216_aj.field_104469_x
		// @07F: iload_3
		// @080: baload
		// @081: iconst_m1
		// @082: ixor
		// @083: if_icmpeq @09F
		// @086: goto @08A
		// @089: athrow
		// @08A: aload_0
		// @08B: getfield game.C_100178_cg game.C_100216_aj.field_104464_r
		// @08E: aload_0
		// @08F: getfield game.C_100091_m game.C_100216_aj.field_104450_C
		// @092: bipush -112 (0x90)
		// @094: iload_3
		// @095: invokevirtual game.C_100178_cg.func_105684_a(game.C_100091_m, byte, int)game.C_100238_ol
		// @098: astore #4
		// @09A: iload #10
		// @09C: ifeq @153
		// @09F: aload_0
		// @0A0: getfield game.C_100104_v game.C_100216_aj.field_104453_l
		// @0A3: iconst_0
		// @0A4: invokevirtual game.C_100104_v.func_104674_c(int)boolean
		// @0A7: ifne @0C5
		// @0AA: goto @0AE
		// @0AD: athrow
		// @0AE: aload_0
		// @0AF: getfield game.C_100104_v game.C_100216_aj.field_104453_l
		// @0B2: iconst_1
		// @0B3: iload_3
		// @0B4: aload_0
		// @0B5: getfield int game.C_100216_aj.field_104461_u
		// @0B8: bipush 126 (0x7E)
		// @0BA: iconst_2
		// @0BB: invokevirtual game.C_100104_v.func_104683_a(boolean, int, int, int, byte)game.C_100192_rf
		// @0BE: astore #4
		// @0C0: iload #10
		// @0C2: ifeq @153
		// @0C5: aconst_null
		// @0C6: areturn
		// @0C7: iload_1
		// @0C8: iconst_1
		// @0C9: if_icmpeq @133
		// @0CC: iload_1
		// @0CD: iconst_2
		// @0CE: if_icmpne @12B
		// @0D1: goto @0D5
		// @0D4: athrow
		// @0D5: aload_0
		// @0D6: getfield game.C_100091_m game.C_100216_aj.field_104450_C
		// @0D9: ifnull @0E4
		// @0DC: goto @0E0
		// @0DF: athrow
		// @0E0: goto @0EC
		// @0E3: athrow
		// @0E4: new java.lang.RuntimeException
		// @0E7: dup
		// @0E8: invokespecial java.lang.RuntimeException.<init>()void
		// @0EB: athrow
		// @0EC: aload_0
		// @0ED: getfield byte[] game.C_100216_aj.field_104469_x
		// @0F0: iload_3
		// @0F1: baload
		// @0F2: iconst_m1
		// @0F3: ixor
		// @0F4: ifne @0FB
		// @0F7: goto @103
		// @0FA: athrow
		// @0FB: new java.lang.RuntimeException
		// @0FE: dup
		// @0FF: invokespecial java.lang.RuntimeException.<init>()void
		// @102: athrow
		// @103: aload_0
		// @104: getfield game.C_100104_v game.C_100216_aj.field_104453_l
		// @107: bipush -102 (0x9A)
		// @109: invokevirtual game.C_100104_v.func_104684_a(int)boolean
		// @10C: ifne @129
		// @10F: aload_0
		// @110: getfield game.C_100104_v game.C_100216_aj.field_104453_l
		// @113: iconst_0
		// @114: iload_3
		// @115: aload_0
		// @116: getfield int game.C_100216_aj.field_104461_u
		// @119: iload_2
		// @11A: sipush 141 (0x008D)
		// @11D: iadd
		// @11E: iconst_2
		// @11F: invokevirtual game.C_100104_v.func_104683_a(boolean, int, int, int, byte)game.C_100192_rf
		// @122: astore #4
		// @124: iload #10
		// @126: ifeq @153
		// @129: aconst_null
		// @12A: areturn
		// @12B: new java.lang.RuntimeException
		// @12E: dup
		// @12F: invokespecial java.lang.RuntimeException.<init>()void
		// @132: athrow
		// @133: aload_0
		// @134: getfield game.C_100091_m game.C_100216_aj.field_104450_C
		// @137: ifnonnull @143
		// @13A: new java.lang.RuntimeException
		// @13D: dup
		// @13E: invokespecial java.lang.RuntimeException.<init>()void
		// @141: athrow
		// @142: athrow
		// @143: aload_0
		// @144: getfield game.C_100178_cg game.C_100216_aj.field_104464_r
		// @147: aload_0
		// @148: getfield game.C_100091_m game.C_100216_aj.field_104450_C
		// @14B: iload_3
		// @14C: bipush -11 (0xF5)
		// @14E: invokevirtual game.C_100178_cg.func_105678_a(game.C_100091_m, int, byte)game.C_100238_ol
		// @151: astore #4
		// @153: aload_0
		// @154: getfield game.C_100119_ua game.C_100216_aj.field_104448_A
		// @157: aload #4
		// @159: iload_3
		// @15A: i2l
		// @15B: iconst_1
		// @15C: invokevirtual game.C_100119_ua.func_104893_a(game.C_100158_da, long, boolean)void
		// @15F: aload #4
		// @161: getfield boolean game.C_100071_va.field_101661_C
		// @164: ifne @16B
		// @167: goto @16D
		// @16A: athrow
		// @16B: aconst_null
		// @16C: areturn
		// @16D: aload #4
		// @16F: sipush -20679 (0xAF39)
		// @172: invokevirtual game.C_100071_va.func_101649_j(int)byte[]
		// @175: astore #5
		// @177: aload #4
		// @179: instanceof game.C_100238_ol
		// @17C: ifeq @2FC
		// @17F: aconst_null
		// @180: aload #5
		// @182: if_acmpeq @194
		// @185: aload #5
		// @187: arraylength
		// @188: iconst_2
		// @189: if_icmple @194
		// @18C: goto @190
		// @18F: athrow
		// @190: goto @19C
		// @193: athrow
		// @194: new java.lang.RuntimeException
		// @197: dup
		// @198: invokespecial java.lang.RuntimeException.<init>()void
		// @19B: athrow
		// @19C: getstatic java.util.zip.CRC32 game.C_100230_of.field_106213_l
		// @19F: invokevirtual java.util.zip.CRC32.reset()void
		// @1A2: getstatic java.util.zip.CRC32 game.C_100230_of.field_106213_l
		// @1A5: aload #5
		// @1A7: iconst_0
		// @1A8: bipush -2 (0xFE)
		// @1AA: aload #5
		// @1AC: arraylength
		// @1AD: iadd
		// @1AE: invokevirtual java.util.zip.CRC32.update(byte[], int, int)void
		// @1B1: getstatic java.util.zip.CRC32 game.C_100230_of.field_106213_l
		// @1B4: invokevirtual java.util.zip.CRC32.getValue()long
		// @1B7: l2i
		// @1B8: istore #6
		// @1BA: iload #6
		// @1BC: iconst_m1
		// @1BD: ixor
		// @1BE: aload_0
		// @1BF: getfield game.C_100254_pi game.C_100216_aj.field_104458_i
		// @1C2: getfield int[] game.C_100254_pi.field_106448_d
		// @1C5: iload_3
		// @1C6: iaload
		// @1C7: iconst_m1
		// @1C8: ixor
		// @1C9: if_icmpeq @1D5
		// @1CC: new java.lang.RuntimeException
		// @1CF: dup
		// @1D0: invokespecial java.lang.RuntimeException.<init>()void
		// @1D3: athrow
		// @1D4: athrow
		// @1D5: aconst_null
		// @1D6: aload_0
		// @1D7: getfield game.C_100254_pi game.C_100216_aj.field_104458_i
		// @1DA: getfield byte[][] game.C_100254_pi.field_106451_c
		// @1DD: if_acmpeq @23F
		// @1E0: aconst_null
		// @1E1: aload_0
		// @1E2: getfield game.C_100254_pi game.C_100216_aj.field_104458_i
		// @1E5: getfield byte[][] game.C_100254_pi.field_106451_c
		// @1E8: iload_3
		// @1E9: aaload
		// @1EA: if_acmpeq @23F
		// @1ED: goto @1F1
		// @1F0: athrow
		// @1F1: aload_0
		// @1F2: getfield game.C_100254_pi game.C_100216_aj.field_104458_i
		// @1F5: getfield byte[][] game.C_100254_pi.field_106451_c
		// @1F8: iload_3
		// @1F9: aaload
		// @1FA: astore #7
		// @1FC: bipush -2 (0xFE)
		// @1FE: aload #5
		// @200: arraylength
		// @201: iadd
		// @202: bipush 119 (0x77)
		// @204: iconst_0
		// @205: aload #5
		// @207: invokestatic game.C_100087_n.func_100681_a(int, byte, int, byte[])byte[]
		// @20A: astore #8
		// @20C: iconst_0
		// @20D: istore #9
		// @20F: bipush 64 (0x40)
		// @211: iload #9
		// @213: if_icmple @23F
		// @216: aload #8
		// @218: iload #9
		// @21A: baload
		// @21B: aload #7
		// @21D: iload #9
		// @21F: baload
		// @220: iload #10
		// @222: ifne @25C
		// @225: if_icmpne @22F
		// @228: goto @22C
		// @22B: athrow
		// @22C: goto @237
		// @22F: new java.lang.RuntimeException
		// @232: dup
		// @233: invokespecial java.lang.RuntimeException.<init>()void
		// @236: athrow
		// @237: iinc #9 +1
		// @23A: iload #10
		// @23C: ifeq @20F
		// @23F: aload #5
		// @241: iconst_m1
		// @242: aload #5
		// @244: arraylength
		// @245: iadd
		// @246: baload
		// @247: sipush 255 (0x00FF)
		// @24A: iand
		// @24B: ldc_w 65280 (0xff00)
		// @24E: aload #5
		// @250: aload #5
		// @252: arraylength
		// @253: bipush -2 (0xFE)
		// @255: iadd
		// @256: baload
		// @257: ldc_w 937601128 (0x37e2a868)
		// @25A: ishl
		// @25B: iand
		// @25C: iadd
		// @25D: istore #7
		// @25F: iload #7
		// @261: iconst_m1
		// @262: ixor
		// @263: aload_0
		// @264: getfield game.C_100254_pi game.C_100216_aj.field_104458_i
		// @267: getfield int[] game.C_100254_pi.field_106452_a
		// @26A: iload_3
		// @26B: iaload
		// @26C: ldc_w 65535 (0xffff)
		// @26F: iand
		// @270: iconst_m1
		// @271: ixor
		// @272: if_icmpne @279
		// @275: goto @281
		// @278: athrow
		// @279: new java.lang.RuntimeException
		// @27C: dup
		// @27D: invokespecial java.lang.RuntimeException.<init>()void
		// @280: athrow
		// @281: iconst_1
		// @282: aload_0
		// @283: getfield byte[] game.C_100216_aj.field_104469_x
		// @286: iload_3
		// @287: baload
		// @288: if_icmpeq @29F
		// @28B: aload_0
		// @28C: getfield byte[] game.C_100216_aj.field_104469_x
		// @28F: iload_3
		// @290: baload
		// @291: ifeq @298
		// @294: goto @298
		// @297: athrow
		// @298: aload_0
		// @299: getfield byte[] game.C_100216_aj.field_104469_x
		// @29C: iload_3
		// @29D: iconst_1
		// @29E: bastore
		// @29F: aload #4
		// @2A1: getfield boolean game.C_100071_va.field_101657_D
		// @2A4: ifne @2B2
		// @2A7: aload #4
		// @2A9: bipush 45 (0x2D)
		// @2AB: invokevirtual game.C_100071_va.func_100583_c(int)void
		// @2AE: goto @2B2
		// @2B1: athrow
		// @2B2: aload #4
		// @2B4: areturn
		// @2B5: astore #6
		// @2B7: aload_0
		// @2B8: getfield byte[] game.C_100216_aj.field_104469_x
		// @2BB: iload_3
		// @2BC: iconst_m1
		// @2BD: bastore
		// @2BE: aload #4
		// @2C0: bipush 45 (0x2D)
		// @2C2: invokevirtual game.C_100071_va.func_100583_c(int)void
		// @2C5: aload #4
		// @2C7: getfield boolean game.C_100071_va.field_101657_D
		// @2CA: ifeq @2FA
		// @2CD: aload_0
		// @2CE: getfield game.C_100104_v game.C_100216_aj.field_104453_l
		// @2D1: iconst_0
		// @2D2: invokevirtual game.C_100104_v.func_104674_c(int)boolean
		// @2D5: ifne @2FA
		// @2D8: goto @2DC
		// @2DB: athrow
		// @2DC: aload_0
		// @2DD: getfield game.C_100104_v game.C_100216_aj.field_104453_l
		// @2E0: iconst_1
		// @2E1: iload_3
		// @2E2: aload_0
		// @2E3: getfield int game.C_100216_aj.field_104461_u
		// @2E6: bipush 126 (0x7E)
		// @2E8: iconst_2
		// @2E9: invokevirtual game.C_100104_v.func_104683_a(boolean, int, int, int, byte)game.C_100192_rf
		// @2EC: astore #4
		// @2EE: aload_0
		// @2EF: getfield game.C_100119_ua game.C_100216_aj.field_104448_A
		// @2F2: aload #4
		// @2F4: iload_3
		// @2F5: i2l
		// @2F6: iconst_1
		// @2F7: invokevirtual game.C_100119_ua.func_104893_a(game.C_100158_da, long, boolean)void
		// @2FA: aconst_null
		// @2FB: areturn
		// @2FC: aconst_null
		// @2FD: aload #5
		// @2FF: if_acmpeq @314
		// @302: aload #5
		// @304: arraylength
		// @305: iconst_m1
		// @306: ixor
		// @307: bipush -3 (0xFD)
		// @309: if_icmpge @314
		// @30C: goto @310
		// @30F: athrow
		// @310: goto @31C
		// @313: athrow
		// @314: new java.lang.RuntimeException
		// @317: dup
		// @318: invokespecial java.lang.RuntimeException.<init>()void
		// @31B: athrow
		// @31C: getstatic java.util.zip.CRC32 game.C_100230_of.field_106213_l
		// @31F: invokevirtual java.util.zip.CRC32.reset()void
		// @322: getstatic java.util.zip.CRC32 game.C_100230_of.field_106213_l
		// @325: aload #5
		// @327: iconst_0
		// @328: aload #5
		// @32A: arraylength
		// @32B: bipush -2 (0xFE)
		// @32D: iadd
		// @32E: invokevirtual java.util.zip.CRC32.update(byte[], int, int)void
		// @331: getstatic java.util.zip.CRC32 game.C_100230_of.field_106213_l
		// @334: invokevirtual java.util.zip.CRC32.getValue()long
		// @337: l2i
		// @338: istore #6
		// @33A: aload_0
		// @33B: getfield game.C_100254_pi game.C_100216_aj.field_104458_i
		// @33E: getfield int[] game.C_100254_pi.field_106448_d
		// @341: iload_3
		// @342: iaload
		// @343: iconst_m1
		// @344: ixor
		// @345: iload #6
		// @347: iconst_m1
		// @348: ixor
		// @349: if_icmpeq @355
		// @34C: new java.lang.RuntimeException
		// @34F: dup
		// @350: invokespecial java.lang.RuntimeException.<init>()void
		// @353: athrow
		// @354: athrow
		// @355: aconst_null
		// @356: aload_0
		// @357: getfield game.C_100254_pi game.C_100216_aj.field_104458_i
		// @35A: getfield byte[][] game.C_100254_pi.field_106451_c
		// @35D: if_acmpeq @3BE
		// @360: aload_0
		// @361: getfield game.C_100254_pi game.C_100216_aj.field_104458_i
		// @364: getfield byte[][] game.C_100254_pi.field_106451_c
		// @367: iload_3
		// @368: aaload
		// @369: ifnull @3BE
		// @36C: goto @370
		// @36F: athrow
		// @370: aload_0
		// @371: getfield game.C_100254_pi game.C_100216_aj.field_104458_i
		// @374: getfield byte[][] game.C_100254_pi.field_106451_c
		// @377: iload_3
		// @378: aaload
		// @379: astore #7
		// @37B: bipush -2 (0xFE)
		// @37D: aload #5
		// @37F: arraylength
		// @380: iadd
		// @381: bipush 123 (0x7B)
		// @383: iconst_0
		// @384: aload #5
		// @386: invokestatic game.C_100087_n.func_100681_a(int, byte, int, byte[])byte[]
		// @389: astore #8
		// @38B: iconst_0
		// @38C: istore #9
		// @38E: bipush -65 (0xBF)
		// @390: iload #9
		// @392: iconst_m1
		// @393: ixor
		// @394: if_icmpge @3BE
		// @397: aload #7
		// @399: iload #9
		// @39B: baload
		// @39C: aload #8
		// @39E: iload #9
		// @3A0: baload
		// @3A1: iload #10
		// @3A3: ifne @46C
		// @3A6: if_icmpeq @3B6
		// @3A9: goto @3AD
		// @3AC: athrow
		// @3AD: new java.lang.RuntimeException
		// @3B0: dup
		// @3B1: invokespecial java.lang.RuntimeException.<init>()void
		// @3B4: athrow
		// @3B5: athrow
		// @3B6: iinc #9 +1
		// @3B9: iload #10
		// @3BB: ifeq @38E
		// @3BE: aload_0
		// @3BF: getfield game.C_100104_v game.C_100216_aj.field_104453_l
		// @3C2: iconst_0
		// @3C3: putfield int game.C_100104_v.field_104697_m
		// @3C6: aload_0
		// @3C7: getfield game.C_100104_v game.C_100216_aj.field_104453_l
		// @3CA: iconst_0
		// @3CB: putfield int game.C_100104_v.field_104694_n
		// @3CE: goto @420
		// @3D1: astore #6
		// @3D3: aload_0
		// @3D4: getfield game.C_100104_v game.C_100216_aj.field_104453_l
		// @3D7: iconst_0
		// @3D8: invokevirtual game.C_100104_v.func_104681_a(boolean)void
		// @3DB: aload #4
		// @3DD: bipush 45 (0x2D)
		// @3DF: invokevirtual game.C_100071_va.func_100583_c(int)void
		// @3E2: aload #4
		// @3E4: getfield boolean game.C_100071_va.field_101657_D
		// @3E7: ifeq @41E
		// @3EA: aload_0
		// @3EB: getfield game.C_100104_v game.C_100216_aj.field_104453_l
		// @3EE: iconst_0
		// @3EF: invokevirtual game.C_100104_v.func_104674_c(int)boolean
		// @3F2: ifeq @3FD
		// @3F5: goto @3F9
		// @3F8: athrow
		// @3F9: goto @41E
		// @3FC: athrow
		// @3FD: aload_0
		// @3FE: getfield game.C_100104_v game.C_100216_aj.field_104453_l
		// @401: iconst_1
		// @402: iload_3
		// @403: aload_0
		// @404: getfield int game.C_100216_aj.field_104461_u
		// @407: iload_2
		// @408: sipush 141 (0x008D)
		// @40B: iadd
		// @40C: iconst_2
		// @40D: invokevirtual game.C_100104_v.func_104683_a(boolean, int, int, int, byte)game.C_100192_rf
		// @410: astore #4
		// @412: aload_0
		// @413: getfield game.C_100119_ua game.C_100216_aj.field_104448_A
		// @416: aload #4
		// @418: iload_3
		// @419: i2l
		// @41A: iconst_1
		// @41B: invokevirtual game.C_100119_ua.func_104893_a(game.C_100158_da, long, boolean)void
		// @41E: aconst_null
		// @41F: areturn
		// @420: aload #5
		// @422: bipush -2 (0xFE)
		// @424: aload #5
		// @426: arraylength
		// @427: iadd
		// @428: aload_0
		// @429: getfield game.C_100254_pi game.C_100216_aj.field_104458_i
		// @42C: getfield int[] game.C_100254_pi.field_106452_a
		// @42F: iload_3
		// @430: iaload
		// @431: ldc_w 1468759912 (0x578b7f68)
		// @434: iushr
		// @435: i2b
		// @436: bastore
		// @437: aload #5
		// @439: aload #5
		// @43B: arraylength
		// @43C: iconst_1
		// @43D: isub
		// @43E: aload_0
		// @43F: getfield game.C_100254_pi game.C_100216_aj.field_104458_i
		// @442: getfield int[] game.C_100254_pi.field_106452_a
		// @445: iload_3
		// @446: iaload
		// @447: i2b
		// @448: bastore
		// @449: aconst_null
		// @44A: aload_0
		// @44B: getfield game.C_100091_m game.C_100216_aj.field_104450_C
		// @44E: if_acmpne @455
		// @451: goto @47A
		// @454: athrow
		// @455: aload_0
		// @456: getfield game.C_100178_cg game.C_100216_aj.field_104464_r
		// @459: aload #5
		// @45B: aload_0
		// @45C: getfield game.C_100091_m game.C_100216_aj.field_104450_C
		// @45F: iload_3
		// @460: iconst_2
		// @461: invokevirtual game.C_100178_cg.func_105683_a(byte[], game.C_100091_m, int, int)game.C_100238_ol
		// @464: pop
		// @465: iconst_1
		// @466: aload_0
		// @467: getfield byte[] game.C_100216_aj.field_104469_x
		// @46A: iload_3
		// @46B: baload
		// @46C: if_icmpeq @47A
		// @46F: aload_0
		// @470: getfield byte[] game.C_100216_aj.field_104469_x
		// @473: iload_3
		// @474: iconst_1
		// @475: bastore
		// @476: goto @47A
		// @479: athrow
		// @47A: aload #4
		// @47C: getfield boolean game.C_100071_va.field_101657_D
		// @47F: ifne @48F
		// @482: aload #4
		// @484: iload_2
		// @485: bipush 60 (0x3C)
		// @487: iadd
		// @488: invokevirtual game.C_100071_va.func_100583_c(int)void
		// @48B: goto @48F
		// @48E: athrow
		// @48F: aload #4
		// @491: areturn
		// @492: astore #4
		// @494: aload #4
		// @496: new java.lang.StringBuilder
		// @499: dup
		// @49A: invokespecial java.lang.StringBuilder.<init>()void
		// @49D: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @4A0: bipush 10 (0x0A)
		// @4A2: aaload
		// @4A3: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4A6: iload_1
		// @4A7: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4AA: bipush 44 (0x2C)
		// @4AC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4AF: iload_2
		// @4B0: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4B3: bipush 44 (0x2C)
		// @4B5: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4B8: iload_3
		// @4B9: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4BC: bipush 41 (0x29)
		// @4BE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4C1: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4C4: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4C7: athrow
	}
	
	final int func_104423_b(int arg0, int arg1)
	{
		// @00: iload_1
		// @01: sipush -20930 (0xAE3E)
		// @04: if_icmpeq @0A
		// @07: bipush -91 (0xA5)
		// @09: ireturn
		// @0A: aload_0
		// @0B: getfield game.C_100119_ua game.C_100216_aj.field_104448_A
		// @0E: iload_2
		// @0F: i2l
		// @10: bipush 127 (0x7F)
		// @12: invokevirtual game.C_100119_ua.func_104891_a(long, int)game.C_100158_da
		// @15: checkcast game.C_100071_va
		// @18: astore_3
		// @19: aload_3
		// @1A: ifnonnull @21
		// @1D: goto @27
		// @20: athrow
		// @21: aload_3
		// @22: iconst_0
		// @23: invokevirtual game.C_100071_va.func_101651_b(boolean)int
		// @26: ireturn
		// @27: iconst_0
		// @28: ireturn
		// @29: astore_3
		// @2A: aload_3
		// @2B: new java.lang.StringBuilder
		// @2E: dup
		// @2F: invokespecial java.lang.StringBuilder.<init>()void
		// @32: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @35: iconst_1
		// @36: aaload
		// @37: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3A: iload_1
		// @3B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3E: bipush 44 (0x2C)
		// @40: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @43: iload_2
		// @44: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @47: bipush 41 (0x29)
		// @49: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @52: athrow
	}
	
	public static void func_104439_b(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100216_aj.field_104449_B
		// @04: aconst_null
		// @05: putstatic java.lang.String game.C_100216_aj.field_104455_j
		// @08: iload_0
		// @09: bipush -80 (0xB0)
		// @0B: if_icmple @13
		// @0E: bipush 107 (0x6B)
		// @10: putstatic int game.C_100216_aj.field_104467_z
		// @13: goto @38
		// @16: astore_1
		// @17: aload_1
		// @18: new java.lang.StringBuilder
		// @1B: dup
		// @1C: invokespecial java.lang.StringBuilder.<init>()void
		// @1F: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @22: bipush 9 (0x09)
		// @24: aaload
		// @25: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @28: iload_0
		// @29: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2C: bipush 41 (0x29)
		// @2E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @31: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @34: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @37: athrow
		// @38: return
	}
	
	final void func_104442_a(byte arg0)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #5
		// @005: aconst_null
		// @006: aload_0
		// @007: getfield game.C_100202_qi game.C_100216_aj.field_104460_v
		// @00A: if_acmpeq @29A
		// @00D: aload_0
		// @00E: bipush -15 (0xF1)
		// @010: invokevirtual game.C_100216_aj.func_104430_a(int)game.C_100254_pi
		// @013: ifnonnull @017
		// @016: return
		// @017: aload_0
		// @018: getfield boolean game.C_100216_aj.field_104447_g
		// @01B: ifeq @14F
		// @01E: iconst_1
		// @01F: istore_2
		// @020: aload_0
		// @021: getfield game.C_100202_qi game.C_100216_aj.field_104460_v
		// @024: bipush 45 (0x2D)
		// @026: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @029: astore_3
		// @02A: aload_3
		// @02B: ifnull @085
		// @02E: aload_3
		// @02F: getfield long game.C_100158_da.field_100595_c
		// @032: l2i
		// @033: istore #4
		// @035: iconst_m1
		// @036: aload_0
		// @037: getfield byte[] game.C_100216_aj.field_104469_x
		// @03A: iload #4
		// @03C: baload
		// @03D: iconst_m1
		// @03E: ixor
		// @03F: iload #5
		// @041: ifne @091
		// @044: if_icmpeq @04E
		// @047: goto @04B
		// @04A: athrow
		// @04B: goto @058
		// @04E: aload_0
		// @04F: iconst_1
		// @050: bipush -15 (0xF1)
		// @052: iload #4
		// @054: invokespecial game.C_100216_aj.func_104444_a(int, byte, int)game.C_100071_va
		// @057: pop
		// @058: aload_0
		// @059: getfield byte[] game.C_100216_aj.field_104469_x
		// @05C: iload #4
		// @05E: baload
		// @05F: iconst_m1
		// @060: ixor
		// @061: iconst_m1
		// @062: if_icmpeq @074
		// @065: aload_3
		// @066: bipush 45 (0x2D)
		// @068: invokevirtual game.C_100158_da.func_100583_c(int)void
		// @06B: iload #5
		// @06D: ifeq @076
		// @070: goto @074
		// @073: athrow
		// @074: iconst_0
		// @075: istore_2
		// @076: aload_0
		// @077: getfield game.C_100202_qi game.C_100216_aj.field_104460_v
		// @07A: bipush 92 (0x5C)
		// @07C: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @07F: astore_3
		// @080: iload #5
		// @082: ifeq @02A
		// @085: aload_0
		// @086: getfield game.C_100254_pi game.C_100216_aj.field_104458_i
		// @089: getfield int[] game.C_100254_pi.field_106453_n
		// @08C: arraylength
		// @08D: aload_0
		// @08E: getfield int game.C_100216_aj.field_104457_h
		// @091: if_icmple @138
		// @094: iconst_m1
		// @095: aload_0
		// @096: getfield game.C_100254_pi game.C_100216_aj.field_104458_i
		// @099: getfield int[] game.C_100254_pi.field_106453_n
		// @09C: aload_0
		// @09D: getfield int game.C_100216_aj.field_104457_h
		// @0A0: iaload
		// @0A1: iconst_m1
		// @0A2: ixor
		// @0A3: iload #5
		// @0A5: ifne @29C
		// @0A8: goto @0AC
		// @0AB: athrow
		// @0AC: if_icmpeq @0B6
		// @0AF: goto @0B3
		// @0B2: athrow
		// @0B3: goto @0C5
		// @0B6: aload_0
		// @0B7: dup
		// @0B8: getfield int game.C_100216_aj.field_104457_h
		// @0BB: iconst_1
		// @0BC: iadd
		// @0BD: putfield int game.C_100216_aj.field_104457_h
		// @0C0: iload #5
		// @0C2: ifeq @085
		// @0C5: sipush 250 (0x00FA)
		// @0C8: aload_0
		// @0C9: getfield game.C_100178_cg game.C_100216_aj.field_104464_r
		// @0CC: getfield int game.C_100178_cg.field_105690_b
		// @0CF: if_icmple @0D6
		// @0D2: goto @0DD
		// @0D5: athrow
		// @0D6: iconst_0
		// @0D7: istore_2
		// @0D8: iload #5
		// @0DA: ifeq @138
		// @0DD: aload_0
		// @0DE: getfield byte[] game.C_100216_aj.field_104469_x
		// @0E1: aload_0
		// @0E2: getfield int game.C_100216_aj.field_104457_h
		// @0E5: baload
		// @0E6: ifeq @0F1
		// @0E9: goto @0ED
		// @0EC: athrow
		// @0ED: goto @0FD
		// @0F0: athrow
		// @0F1: aload_0
		// @0F2: iconst_1
		// @0F3: bipush -15 (0xF1)
		// @0F5: aload_0
		// @0F6: getfield int game.C_100216_aj.field_104457_h
		// @0F9: invokespecial game.C_100216_aj.func_104444_a(int, byte, int)game.C_100071_va
		// @0FC: pop
		// @0FD: iconst_m1
		// @0FE: aload_0
		// @0FF: getfield byte[] game.C_100216_aj.field_104469_x
		// @102: aload_0
		// @103: getfield int game.C_100216_aj.field_104457_h
		// @106: baload
		// @107: iconst_m1
		// @108: ixor
		// @109: if_icmpne @129
		// @10C: new game.C_100158_da
		// @10F: dup
		// @110: invokespecial game.C_100158_da.<init>()void
		// @113: astore_3
		// @114: aload_3
		// @115: aload_0
		// @116: getfield int game.C_100216_aj.field_104457_h
		// @119: i2l
		// @11A: putfield long game.C_100158_da.field_100595_c
		// @11D: iconst_0
		// @11E: istore_2
		// @11F: aload_0
		// @120: getfield game.C_100202_qi game.C_100216_aj.field_104460_v
		// @123: bipush 123 (0x7B)
		// @125: aload_3
		// @126: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @129: aload_0
		// @12A: dup
		// @12B: getfield int game.C_100216_aj.field_104457_h
		// @12E: iconst_1
		// @12F: iadd
		// @130: putfield int game.C_100216_aj.field_104457_h
		// @133: iload #5
		// @135: ifeq @085
		// @138: iload_2
		// @139: ifne @140
		// @13C: goto @14A
		// @13F: athrow
		// @140: aload_0
		// @141: iconst_0
		// @142: putfield boolean game.C_100216_aj.field_104447_g
		// @145: aload_0
		// @146: iconst_0
		// @147: putfield int game.C_100216_aj.field_104457_h
		// @14A: iload #5
		// @14C: ifeq @29A
		// @14F: aload_0
		// @150: getfield boolean game.C_100216_aj.field_104468_y
		// @153: ifeq @291
		// @156: goto @15A
		// @159: athrow
		// @15A: iconst_1
		// @15B: istore_2
		// @15C: aload_0
		// @15D: getfield game.C_100202_qi game.C_100216_aj.field_104460_v
		// @160: bipush 46 (0x2E)
		// @162: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @165: astore_3
		// @166: aconst_null
		// @167: aload_3
		// @168: if_acmpeq @1C1
		// @16B: aload_3
		// @16C: getfield long game.C_100158_da.field_100595_c
		// @16F: l2i
		// @170: istore #4
		// @172: aload_0
		// @173: getfield byte[] game.C_100216_aj.field_104469_x
		// @176: iload #4
		// @178: baload
		// @179: iconst_1
		// @17A: iload #5
		// @17C: ifne @1D1
		// @17F: if_icmpeq @194
		// @182: goto @186
		// @185: athrow
		// @186: aload_0
		// @187: iconst_2
		// @188: bipush -15 (0xF1)
		// @18A: iload #4
		// @18C: invokespecial game.C_100216_aj.func_104444_a(int, byte, int)game.C_100071_va
		// @18F: pop
		// @190: goto @194
		// @193: athrow
		// @194: aload_0
		// @195: getfield byte[] game.C_100216_aj.field_104469_x
		// @198: iload #4
		// @19A: baload
		// @19B: iconst_1
		// @19C: if_icmpne @1B0
		// @19F: aload_3
		// @1A0: iload_1
		// @1A1: bipush 44 (0x2C)
		// @1A3: iadd
		// @1A4: invokevirtual game.C_100158_da.func_100583_c(int)void
		// @1A7: iload #5
		// @1A9: ifeq @1B2
		// @1AC: goto @1B0
		// @1AF: athrow
		// @1B0: iconst_0
		// @1B1: istore_2
		// @1B2: aload_0
		// @1B3: getfield game.C_100202_qi game.C_100216_aj.field_104460_v
		// @1B6: bipush 117 (0x75)
		// @1B8: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @1BB: astore_3
		// @1BC: iload #5
		// @1BE: ifeq @166
		// @1C1: aload_0
		// @1C2: getfield int game.C_100216_aj.field_104457_h
		// @1C5: iconst_m1
		// @1C6: ixor
		// @1C7: aload_0
		// @1C8: getfield game.C_100254_pi game.C_100216_aj.field_104458_i
		// @1CB: getfield int[] game.C_100254_pi.field_106453_n
		// @1CE: arraylength
		// @1CF: iconst_m1
		// @1D0: ixor
		// @1D1: if_icmple @27A
		// @1D4: iconst_0
		// @1D5: aload_0
		// @1D6: getfield game.C_100254_pi game.C_100216_aj.field_104458_i
		// @1D9: getfield int[] game.C_100254_pi.field_106453_n
		// @1DC: aload_0
		// @1DD: getfield int game.C_100216_aj.field_104457_h
		// @1E0: iaload
		// @1E1: iload #5
		// @1E3: ifne @29C
		// @1E6: goto @1EA
		// @1E9: athrow
		// @1EA: if_icmpeq @1F4
		// @1ED: goto @1F1
		// @1F0: athrow
		// @1F1: goto @203
		// @1F4: aload_0
		// @1F5: dup
		// @1F6: getfield int game.C_100216_aj.field_104457_h
		// @1F9: iconst_1
		// @1FA: iadd
		// @1FB: putfield int game.C_100216_aj.field_104457_h
		// @1FE: iload #5
		// @200: ifeq @1C1
		// @203: aload_0
		// @204: getfield game.C_100104_v game.C_100216_aj.field_104453_l
		// @207: bipush -102 (0x9A)
		// @209: invokevirtual game.C_100104_v.func_104684_a(int)boolean
		// @20C: ifeq @216
		// @20F: iconst_0
		// @210: istore_2
		// @211: iload #5
		// @213: ifeq @27A
		// @216: bipush -2 (0xFE)
		// @218: aload_0
		// @219: getfield byte[] game.C_100216_aj.field_104469_x
		// @21C: aload_0
		// @21D: getfield int game.C_100216_aj.field_104457_h
		// @220: baload
		// @221: iconst_m1
		// @222: ixor
		// @223: if_icmpne @22E
		// @226: goto @22A
		// @229: athrow
		// @22A: goto @23A
		// @22D: athrow
		// @22E: aload_0
		// @22F: iconst_2
		// @230: bipush -15 (0xF1)
		// @232: aload_0
		// @233: getfield int game.C_100216_aj.field_104457_h
		// @236: invokespecial game.C_100216_aj.func_104444_a(int, byte, int)game.C_100071_va
		// @239: pop
		// @23A: bipush -2 (0xFE)
		// @23C: aload_0
		// @23D: getfield byte[] game.C_100216_aj.field_104469_x
		// @240: aload_0
		// @241: getfield int game.C_100216_aj.field_104457_h
		// @244: baload
		// @245: iconst_m1
		// @246: ixor
		// @247: if_icmpne @24E
		// @24A: goto @26B
		// @24D: athrow
		// @24E: new game.C_100158_da
		// @251: dup
		// @252: invokespecial game.C_100158_da.<init>()void
		// @255: astore_3
		// @256: aload_3
		// @257: aload_0
		// @258: getfield int game.C_100216_aj.field_104457_h
		// @25B: i2l
		// @25C: putfield long game.C_100158_da.field_100595_c
		// @25F: iconst_0
		// @260: istore_2
		// @261: aload_0
		// @262: getfield game.C_100202_qi game.C_100216_aj.field_104460_v
		// @265: bipush 127 (0x7F)
		// @267: aload_3
		// @268: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @26B: aload_0
		// @26C: dup
		// @26D: getfield int game.C_100216_aj.field_104457_h
		// @270: iconst_1
		// @271: iadd
		// @272: putfield int game.C_100216_aj.field_104457_h
		// @275: iload #5
		// @277: ifeq @1C1
		// @27A: iload_2
		// @27B: ifne @282
		// @27E: goto @28C
		// @281: athrow
		// @282: aload_0
		// @283: iconst_0
		// @284: putfield int game.C_100216_aj.field_104457_h
		// @287: aload_0
		// @288: iconst_0
		// @289: putfield boolean game.C_100216_aj.field_104468_y
		// @28C: iload #5
		// @28E: ifeq @29A
		// @291: aload_0
		// @292: aconst_null
		// @293: putfield game.C_100202_qi game.C_100216_aj.field_104460_v
		// @296: goto @29A
		// @299: athrow
		// @29A: iload_1
		// @29B: iconst_1
		// @29C: if_icmpeq @2AC
		// @29F: aload_0
		// @2A0: bipush -59 (0xC5)
		// @2A2: bipush -33 (0xDF)
		// @2A4: invokevirtual game.C_100216_aj.func_104423_b(int, int)int
		// @2A7: pop
		// @2A8: goto @2AC
		// @2AB: athrow
		// @2AC: aload_0
		// @2AD: getfield boolean game.C_100216_aj.field_104454_m
		// @2B0: ifeq @348
		// @2B3: aload_0
		// @2B4: getfield long game.C_100216_aj.field_104452_o
		// @2B7: ldc2_w -1
		// @2BA: lxor
		// @2BB: bipush -76 (0xB4)
		// @2BD: invokestatic game.C_100198_qn.func_105828_a(byte)long
		// @2C0: ldc2_w -1
		// @2C3: lxor
		// @2C4: lcmp
		// @2C5: iflt @348
		// @2C8: goto @2CC
		// @2CB: athrow
		// @2CC: aload_0
		// @2CD: getfield game.C_100119_ua game.C_100216_aj.field_104448_A
		// @2D0: bipush 114 (0x72)
		// @2D2: invokevirtual game.C_100119_ua.func_104885_d(byte)game.C_100158_da
		// @2D5: checkcast game.C_100071_va
		// @2D8: astore_2
		// @2D9: aload_2
		// @2DA: ifnull @33B
		// @2DD: iload #5
		// @2DF: ifne @348
		// @2E2: aload_2
		// @2E3: getfield boolean game.C_100071_va.field_101661_C
		// @2E6: ifeq @2F6
		// @2E9: goto @2ED
		// @2EC: athrow
		// @2ED: iload #5
		// @2EF: ifeq @329
		// @2F2: goto @2F6
		// @2F5: athrow
		// @2F6: aload_2
		// @2F7: getfield boolean game.C_100071_va.field_101659_A
		// @2FA: ifne @30F
		// @2FD: goto @301
		// @300: athrow
		// @301: aload_2
		// @302: iconst_1
		// @303: putfield boolean game.C_100071_va.field_101659_A
		// @306: iload #5
		// @308: ifeq @329
		// @30B: goto @30F
		// @30E: athrow
		// @30F: aload_2
		// @310: getfield boolean game.C_100071_va.field_101657_D
		// @313: ifne @323
		// @316: goto @31A
		// @319: athrow
		// @31A: new java.lang.RuntimeException
		// @31D: dup
		// @31E: invokespecial java.lang.RuntimeException.<init>()void
		// @321: athrow
		// @322: athrow
		// @323: aload_2
		// @324: bipush 45 (0x2D)
		// @326: invokevirtual game.C_100071_va.func_100583_c(int)void
		// @329: aload_0
		// @32A: getfield game.C_100119_ua game.C_100216_aj.field_104448_A
		// @32D: bipush -127 (0x81)
		// @32F: invokevirtual game.C_100119_ua.func_104894_a(int)game.C_100158_da
		// @332: checkcast game.C_100071_va
		// @335: astore_2
		// @336: iload #5
		// @338: ifeq @2D9
		// @33B: aload_0
		// @33C: ldc2_w 1000
		// @33F: bipush -63 (0xC1)
		// @341: invokestatic game.C_100198_qn.func_105828_a(byte)long
		// @344: ladd
		// @345: putfield long game.C_100216_aj.field_104452_o
		// @348: goto @36C
		// @34B: astore_2
		// @34C: aload_2
		// @34D: new java.lang.StringBuilder
		// @350: dup
		// @351: invokespecial java.lang.StringBuilder.<init>()void
		// @354: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @357: iconst_2
		// @358: aaload
		// @359: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @35C: iload_1
		// @35D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @360: bipush 41 (0x29)
		// @362: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @365: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @368: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @36B: athrow
		// @36C: return
	}
	
	final byte[] func_104425_a(int arg0, int arg1)
	{
		// @00: aload_0
		// @01: iconst_0
		// @02: bipush -15 (0xF1)
		// @04: iload_2
		// @05: invokespecial game.C_100216_aj.func_104444_a(int, byte, int)game.C_100071_va
		// @08: astore_3
		// @09: iload_1
		// @0A: bipush 14 (0x0E)
		// @0C: if_icmpeq @14
		// @0F: aconst_null
		// @10: checkcast byte[]
		// @13: areturn
		// @14: aconst_null
		// @15: aload_3
		// @16: if_acmpne @1B
		// @19: aconst_null
		// @1A: areturn
		// @1B: aload_3
		// @1C: sipush -20679 (0xAF39)
		// @1F: invokevirtual game.C_100071_va.func_101649_j(int)byte[]
		// @22: astore #4
		// @24: aload_3
		// @25: iload_1
		// @26: bipush 35 (0x23)
		// @28: ixor
		// @29: invokevirtual game.C_100071_va.func_100583_c(int)void
		// @2C: aload #4
		// @2E: areturn
		// @2F: astore_3
		// @30: aload_3
		// @31: new java.lang.StringBuilder
		// @34: dup
		// @35: invokespecial java.lang.StringBuilder.<init>()void
		// @38: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @3B: bipush 6 (0x06)
		// @3D: aaload
		// @3E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @41: iload_1
		// @42: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @45: bipush 44 (0x2C)
		// @47: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4A: iload_2
		// @4B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4E: bipush 41 (0x29)
		// @50: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @53: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @56: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @59: athrow
	}
	
	final void func_104438_b(boolean arg0)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #4
		// @05: aload_0
		// @06: getfield game.C_100202_qi game.C_100216_aj.field_104460_v
		// @09: ifnull @0F
		// @0C: goto @10
		// @0F: return
		// @10: iload_1
		// @11: ifeq @15
		// @14: return
		// @15: aload_0
		// @16: bipush -15 (0xF1)
		// @18: invokevirtual game.C_100216_aj.func_104430_a(int)game.C_100254_pi
		// @1B: ifnull @21
		// @1E: goto @22
		// @21: return
		// @22: aload_0
		// @23: getfield game.C_100202_qi game.C_100216_aj.field_104459_w
		// @26: bipush 69 (0x45)
		// @28: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @2B: astore_2
		// @2C: aconst_null
		// @2D: aload_2
		// @2E: if_acmpeq @D2
		// @31: aload_2
		// @32: getfield long game.C_100158_da.field_100595_c
		// @35: l2i
		// @36: istore_3
		// @37: iload #4
		// @39: ifne @F7
		// @3C: iload_3
		// @3D: iconst_m1
		// @3E: ixor
		// @3F: iconst_m1
		// @40: if_icmpgt @6D
		// @43: goto @47
		// @46: athrow
		// @47: iload_3
		// @48: aload_0
		// @49: getfield game.C_100254_pi game.C_100216_aj.field_104458_i
		// @4C: getfield int game.C_100254_pi.field_106462_v
		// @4F: if_icmpge @6D
		// @52: goto @56
		// @55: athrow
		// @56: aload_0
		// @57: getfield game.C_100254_pi game.C_100216_aj.field_104458_i
		// @5A: getfield int[] game.C_100254_pi.field_106453_n
		// @5D: iload_3
		// @5E: iaload
		// @5F: iconst_m1
		// @60: ixor
		// @61: iconst_m1
		// @62: if_icmpeq @6D
		// @65: goto @69
		// @68: athrow
		// @69: goto @78
		// @6C: athrow
		// @6D: aload_2
		// @6E: bipush 45 (0x2D)
		// @70: invokevirtual game.C_100158_da.func_100583_c(int)void
		// @73: iload #4
		// @75: ifeq @C3
		// @78: iconst_m1
		// @79: aload_0
		// @7A: getfield byte[] game.C_100216_aj.field_104469_x
		// @7D: iload_3
		// @7E: baload
		// @7F: iconst_m1
		// @80: ixor
		// @81: if_icmpeq @8C
		// @84: goto @88
		// @87: athrow
		// @88: goto @95
		// @8B: athrow
		// @8C: aload_0
		// @8D: iconst_1
		// @8E: bipush -15 (0xF1)
		// @90: iload_3
		// @91: invokespecial game.C_100216_aj.func_104444_a(int, byte, int)game.C_100071_va
		// @94: pop
		// @95: aload_0
		// @96: getfield byte[] game.C_100216_aj.field_104469_x
		// @99: iload_3
		// @9A: baload
		// @9B: iconst_m1
		// @9C: if_icmpeq @A3
		// @9F: goto @AC
		// @A2: athrow
		// @A3: aload_0
		// @A4: iconst_2
		// @A5: bipush -15 (0xF1)
		// @A7: iload_3
		// @A8: invokespecial game.C_100216_aj.func_104444_a(int, byte, int)game.C_100071_va
		// @AB: pop
		// @AC: aload_0
		// @AD: getfield byte[] game.C_100216_aj.field_104469_x
		// @B0: iload_3
		// @B1: baload
		// @B2: iconst_m1
		// @B3: ixor
		// @B4: bipush -2 (0xFE)
		// @B6: if_icmpne @C3
		// @B9: aload_2
		// @BA: bipush 45 (0x2D)
		// @BC: invokevirtual game.C_100158_da.func_100583_c(int)void
		// @BF: goto @C3
		// @C2: athrow
		// @C3: aload_0
		// @C4: getfield game.C_100202_qi game.C_100216_aj.field_104459_w
		// @C7: bipush 30 (0x1E)
		// @C9: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @CC: astore_2
		// @CD: iload #4
		// @CF: ifeq @2C
		// @D2: goto @F7
		// @D5: astore_2
		// @D6: aload_2
		// @D7: new java.lang.StringBuilder
		// @DA: dup
		// @DB: invokespecial java.lang.StringBuilder.<init>()void
		// @DE: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @E1: bipush 7 (0x07)
		// @E3: aaload
		// @E4: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @E7: iload_1
		// @E8: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @EB: bipush 41 (0x29)
		// @ED: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @F0: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @F3: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @F6: athrow
		// @F7: return
	}
	
	C_100216_aj(int arg0, C_100091_m arg1, C_100091_m arg2, C_100104_v arg3, C_100178_cg arg4, int arg5, byte[] arg6, int arg7, boolean arg8)
	{
		// @000: aload_0
		// @001: invokespecial game.C_100080_b.<init>()void
		// @004: aload_0
		// @005: new game.C_100119_ua
		// @008: dup
		// @009: bipush 16 (0x10)
		// @00B: invokespecial game.C_100119_ua.<init>(int)void
		// @00E: putfield game.C_100119_ua game.C_100216_aj.field_104448_A
		// @011: aload_0
		// @012: iconst_0
		// @013: putfield int game.C_100216_aj.field_104457_h
		// @016: aload_0
		// @017: new game.C_100202_qi
		// @01A: dup
		// @01B: invokespecial game.C_100202_qi.<init>()void
		// @01E: putfield game.C_100202_qi game.C_100216_aj.field_104459_w
		// @021: aload_0
		// @022: lconst_0
		// @023: putfield long game.C_100216_aj.field_104452_o
		// @026: aload_0
		// @027: aload_2
		// @028: putfield game.C_100091_m game.C_100216_aj.field_104450_C
		// @02B: aload_0
		// @02C: iload_1
		// @02D: putfield int game.C_100216_aj.field_104461_u
		// @030: aconst_null
		// @031: aload_0
		// @032: getfield game.C_100091_m game.C_100216_aj.field_104450_C
		// @035: if_acmpeq @04E
		// @038: aload_0
		// @039: iconst_1
		// @03A: putfield boolean game.C_100216_aj.field_104447_g
		// @03D: aload_0
		// @03E: new game.C_100202_qi
		// @041: dup
		// @042: invokespecial game.C_100202_qi.<init>()void
		// @045: putfield game.C_100202_qi game.C_100216_aj.field_104460_v
		// @048: getstatic int game.SteelSentinels.field_105275_O
		// @04B: ifeq @057
		// @04E: aload_0
		// @04F: iconst_0
		// @050: putfield boolean game.C_100216_aj.field_104447_g
		// @053: goto @057
		// @056: athrow
		// @057: aload_0
		// @058: aload_3
		// @059: putfield game.C_100091_m game.C_100216_aj.field_104451_n
		// @05C: aload_0
		// @05D: aload #5
		// @05F: putfield game.C_100178_cg game.C_100216_aj.field_104464_r
		// @062: aload_0
		// @063: iload #6
		// @065: putfield int game.C_100216_aj.field_104466_p
		// @068: aload_0
		// @069: iload #9
		// @06B: putfield boolean game.C_100216_aj.field_104454_m
		// @06E: aload_0
		// @06F: iload #8
		// @071: putfield int game.C_100216_aj.field_104465_q
		// @074: aload_0
		// @075: aload #7
		// @077: putfield byte[] game.C_100216_aj.field_104463_s
		// @07A: aload_0
		// @07B: aload #4
		// @07D: putfield game.C_100104_v game.C_100216_aj.field_104453_l
		// @080: aload_0
		// @081: getfield game.C_100091_m game.C_100216_aj.field_104451_n
		// @084: ifnonnull @08B
		// @087: goto @0A0
		// @08A: athrow
		// @08B: aload_0
		// @08C: aload_0
		// @08D: getfield game.C_100178_cg game.C_100216_aj.field_104464_r
		// @090: aload_0
		// @091: getfield game.C_100091_m game.C_100216_aj.field_104451_n
		// @094: bipush -5 (0xFB)
		// @096: aload_0
		// @097: getfield int game.C_100216_aj.field_104461_u
		// @09A: invokevirtual game.C_100178_cg.func_105684_a(game.C_100091_m, byte, int)game.C_100238_ol
		// @09D: putfield game.C_100071_va game.C_100216_aj.field_104456_k
		// @0A0: goto @169
		// @0A3: astore #10
		// @0A5: aload #10
		// @0A7: new java.lang.StringBuilder
		// @0AA: dup
		// @0AB: invokespecial java.lang.StringBuilder.<init>()void
		// @0AE: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @0B1: iconst_5
		// @0B2: aaload
		// @0B3: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0B6: iload_1
		// @0B7: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0BA: bipush 44 (0x2C)
		// @0BC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0BF: aload_2
		// @0C0: ifnull @0CC
		// @0C3: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @0C6: iconst_4
		// @0C7: aaload
		// @0C8: goto @0D1
		// @0CB: athrow
		// @0CC: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @0CF: iconst_3
		// @0D0: aaload
		// @0D1: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0D4: bipush 44 (0x2C)
		// @0D6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0D9: aload_3
		// @0DA: ifnull @0E6
		// @0DD: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @0E0: iconst_4
		// @0E1: aaload
		// @0E2: goto @0EB
		// @0E5: athrow
		// @0E6: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @0E9: iconst_3
		// @0EA: aaload
		// @0EB: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0EE: bipush 44 (0x2C)
		// @0F0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0F3: aload #4
		// @0F5: ifnull @101
		// @0F8: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @0FB: iconst_4
		// @0FC: aaload
		// @0FD: goto @106
		// @100: athrow
		// @101: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @104: iconst_3
		// @105: aaload
		// @106: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @109: bipush 44 (0x2C)
		// @10B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @10E: aload #5
		// @110: ifnull @11C
		// @113: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @116: iconst_4
		// @117: aaload
		// @118: goto @121
		// @11B: athrow
		// @11C: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @11F: iconst_3
		// @120: aaload
		// @121: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @124: bipush 44 (0x2C)
		// @126: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @129: iload #6
		// @12B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @12E: bipush 44 (0x2C)
		// @130: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @133: aload #7
		// @135: ifnull @141
		// @138: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @13B: iconst_4
		// @13C: aaload
		// @13D: goto @146
		// @140: athrow
		// @141: getstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @144: iconst_3
		// @145: aaload
		// @146: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @149: bipush 44 (0x2C)
		// @14B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @14E: iload #8
		// @150: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @153: bipush 44 (0x2C)
		// @155: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @158: iload #9
		// @15A: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @15D: bipush 41 (0x29)
		// @15F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @162: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @165: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @168: athrow
		// @169: return
	}
	
	static
	{
		// @000: bipush 35 (0x23)
		// @002: anewarray java.lang.String
		// @005: dup
		// @006: iconst_0
		// @007: ldc_w "\rvC3,"
		// @00A: invokestatic game.C_100216_aj.func_104443_z(java.lang.String)char[]
		// @00D: invokestatic game.C_100216_aj.func_104441_z(char[])java.lang.String
		// @010: aastore
		// @011: dup
		// @012: iconst_1
		// @013: ldc_w "\rvC;,"
		// @016: invokestatic game.C_100216_aj.func_104443_z(java.lang.String)char[]
		// @019: invokestatic game.C_100216_aj.func_104441_z(char[])java.lang.String
		// @01C: aastore
		// @01D: dup
		// @01E: iconst_2
		// @01F: ldc_w "\rvC2,"
		// @022: invokestatic game.C_100216_aj.func_104443_z(java.lang.String)char[]
		// @025: invokestatic game.C_100216_aj.func_104441_z(char[])java.lang.String
		// @028: aastore
		// @029: dup
		// @02A: iconst_3
		// @02B: ldc_w "\u0002i\u0001\u0015"
		// @02E: invokestatic game.C_100216_aj.func_104443_z(java.lang.String)char[]
		// @031: invokestatic game.C_100216_aj.func_104441_z(char[])java.lang.String
		// @034: aastore
		// @035: dup
		// @036: iconst_4
		// @037: ldc_w "\u00172CWy"
		// @03A: invokestatic game.C_100216_aj.func_104443_z(java.lang.String)char[]
		// @03D: invokestatic game.C_100216_aj.func_104441_z(char[])java.lang.String
		// @040: aastore
		// @041: dup
		// @042: iconst_5
		// @043: ldc_w "\rvCEm\u0002u\u0019G,"
		// @046: invokestatic game.C_100216_aj.func_104443_z(java.lang.String)char[]
		// @049: invokestatic game.C_100216_aj.func_104441_z(char[])java.lang.String
		// @04C: aastore
		// @04D: dup
		// @04E: bipush 6 (0x06)
		// @050: ldc_w "\rvC<,"
		// @053: invokestatic game.C_100216_aj.func_104443_z(java.lang.String)char[]
		// @056: invokestatic game.C_100216_aj.func_104441_z(char[])java.lang.String
		// @059: aastore
		// @05A: dup
		// @05B: bipush 7 (0x07)
		// @05D: ldc_w "\rvC7,"
		// @060: invokestatic game.C_100216_aj.func_104443_z(java.lang.String)char[]
		// @063: invokestatic game.C_100216_aj.func_104441_z(char[])java.lang.String
		// @066: aastore
		// @067: dup
		// @068: bipush 8 (0x08)
		// @06A: ldc_w "\rvC1,"
		// @06D: invokestatic game.C_100216_aj.func_104443_z(java.lang.String)char[]
		// @070: invokestatic game.C_100216_aj.func_104441_z(char[])java.lang.String
		// @073: aastore
		// @074: dup
		// @075: bipush 9 (0x09)
		// @077: ldc_w "\rvC4,"
		// @07A: invokestatic game.C_100216_aj.func_104443_z(java.lang.String)char[]
		// @07D: invokestatic game.C_100216_aj.func_104441_z(char[])java.lang.String
		// @080: aastore
		// @081: dup
		// @082: bipush 10 (0x0A)
		// @084: ldc_w "\rvC0,"
		// @087: invokestatic game.C_100216_aj.func_104443_z(java.lang.String)char[]
		// @08A: invokestatic game.C_100216_aj.func_104441_z(char[])java.lang.String
		// @08D: aastore
		// @08E: dup
		// @08F: bipush 11 (0x0B)
		// @091: ldc "Pu\u0000\u001e9_\""
		// @093: invokestatic game.C_100216_aj.func_104443_z(java.lang.String)char[]
		// @096: invokestatic game.C_100216_aj.func_104441_z(char[])java.lang.String
		// @099: aastore
		// @09A: dup
		// @09B: bipush 12 (0x0C)
		// @09D: ldc "P\u007f\u0002\u00159T,UI<\\\""
		// @09F: invokestatic game.C_100216_aj.func_104443_z(java.lang.String)char[]
		// @0A2: invokestatic game.C_100216_aj.func_104441_z(char[])java.lang.String
		// @0A5: aastore
		// @0A6: dup
		// @0A7: bipush 13 (0x0D)
		// @0A9: ldc "L4Q\u0010i\u000b!_M:"
		// @0AB: invokestatic game.C_100216_aj.func_104443_z(java.lang.String)char[]
		// @0AE: invokestatic game.C_100216_aj.func_104441_z(char[])java.lang.String
		// @0B1: aastore
		// @0B2: dup
		// @0B3: bipush 14 (0x0E)
		// @0B5: ldc "Pu\u0000\u001e9\\\""
		// @0B7: invokestatic game.C_100216_aj.func_104443_z(java.lang.String)char[]
		// @0BA: invokestatic game.C_100216_aj.func_104441_z(char[])java.lang.String
		// @0BD: aastore
		// @0BE: dup
		// @0BF: bipush 15 (0x0F)
		// @0C1: ldc "Pu\u0000\u001e9[\""
		// @0C3: invokestatic game.C_100216_aj.func_104443_z(java.lang.String)char[]
		// @0C6: invokestatic game.C_100216_aj.func_104441_z(char[])java.lang.String
		// @0C9: aastore
		// @0CA: dup
		// @0CB: bipush 16 (0x10)
		// @0CD: ldc "(s\u0003^pLy\u001c\u000cm\u001c<\u0000\u000ch\u0018u\u001d\u0015aL[\"=Q Y\u001eW$8t\u0008\u0000$\rn\u0008Yp\u0003sM\u0018s\to\u0002\u0014aB"
		// @0CF: invokestatic game.C_100216_aj.func_104443_z(java.lang.String)char[]
		// @0D2: invokestatic game.C_100216_aj.func_104441_z(char[])java.lang.String
		// @0D5: aastore
		// @0D6: dup
		// @0D7: bipush 17 (0x11)
		// @0D9: ldc "+S),H)"
		// @0DB: invokestatic game.C_100216_aj.func_104443_z(java.lang.String)char[]
		// @0DE: invokestatic game.C_100216_aj.func_104441_z(char[])java.lang.String
		// @0E1: aastore
		// @0E2: dup
		// @0E3: bipush 18 (0x12)
		// @0E5: ldc "Pu\u0000\u001e9^.S"
		// @0E7: invokestatic game.C_100216_aj.func_104443_z(java.lang.String)char[]
		// @0EA: invokestatic game.C_100216_aj.func_104441_z(char[])java.lang.String
		// @0ED: aastore
		// @0EE: dup
		// @0EF: bipush 19 (0x13)
		// @0F1: ldc "P~\u001fG8\u000enSEg\u0003pPI4\nz]I:"
		// @0F3: invokestatic game.C_100216_aj.func_104443_z(java.lang.String)char[]
		// @0F6: invokestatic game.C_100216_aj.func_104441_z(char[])java.lang.String
		// @0F9: aastore
		// @0FA: dup
		// @0FB: bipush 20 (0x14)
		// @0FD: ldc "P\u007f\u0002\u00159\nz\u000b\u001fb\n\""
		// @0FF: invokestatic game.C_100216_aj.func_104443_z(java.lang.String)char[]
		// @102: invokestatic game.C_100216_aj.func_104441_z(char[])java.lang.String
		// @105: aastore
		// @106: dup
		// @107: bipush 21 (0x15)
		// @109: ldc "P3\u000e\u0016hR<Q\u001ak\u0000!]I<\\z\u000bG"
		// @10B: invokestatic game.C_100216_aj.func_104443_z(java.lang.String)char[]
		// @10E: invokestatic game.C_100216_aj.func_104441_z(char[])java.lang.String
		// @111: aastore
		// @112: dup
		// @113: bipush 22 (0x16)
		// @115: ldc "V<"
		// @117: invokestatic game.C_100216_aj.func_104443_z(java.lang.String)char[]
		// @11A: invokestatic game.C_100216_aj.func_104441_z(char[])java.lang.String
		// @11D: aastore
		// @11E: dup
		// @11F: bipush 23 (0x17)
		// @121: ldc "P~\u001fG8\u000enS"
		// @123: invokestatic game.C_100216_aj.func_104443_z(java.lang.String)char[]
		// @126: invokestatic game.C_100216_aj.func_104441_z(char[])java.lang.String
		// @129: aastore
		// @12A: dup
		// @12B: bipush 24 (0x18)
		// @12D: ldc "P~\u001fG8\u000enSEg\u0003pP\u001fb^,_I:"
		// @12F: invokestatic game.C_100216_aj.func_104443_z(java.lang.String)char[]
		// @132: invokestatic game.C_100216_aj.func_104441_z(char[])java.lang.String
		// @135: aastore
		// @136: dup
		// @137: bipush 25 (0x19)
		// @139: ldc "P~\u001fG$L"
		// @13B: invokestatic game.C_100216_aj.func_104443_z(java.lang.String)char[]
		// @13E: invokestatic game.C_100216_aj.func_104441_z(char[])java.lang.String
		// @141: aastore
		// @142: dup
		// @143: bipush 26 (0x1A)
		// @145: ldc "Pu\u0000\u001e9^-S"
		// @147: invokestatic game.C_100216_aj.func_104443_z(java.lang.String)char[]
		// @14A: invokestatic game.C_100216_aj.func_104441_z(char[])java.lang.String
		// @14D: aastore
		// @14E: dup
		// @14F: bipush 27 (0x1B)
		// @151: ldc "!S)YK\"P4YI#X85AV<\n\u0010r\toM\u0000k\u0019<\u0001\u000c`\u0005\u007f\u001f\u0016q\u001f<\u000c\u0014k\u0019r\u0019\n$\u0003zM\u001cr\tn\u0014\rl\u0005r\n"
		// @153: invokestatic game.C_100216_aj.func_104443_z(java.lang.String)char[]
		// @156: invokestatic game.C_100216_aj.func_104441_z(char[])java.lang.String
		// @159: aastore
		// @15A: dup
		// @15B: bipush 28 (0x1C)
		// @15D: ldc_w "\rvC5,"
		// @160: invokestatic game.C_100216_aj.func_104443_z(java.lang.String)char[]
		// @163: invokestatic game.C_100216_aj.func_104441_z(char[])java.lang.String
		// @166: aastore
		// @167: dup
		// @168: bipush 29 (0x1D)
		// @16A: ldc "P\u007f\u0002\u00159\\,UIb\n\""
		// @16C: invokestatic game.C_100216_aj.func_104443_z(java.lang.String)char[]
		// @16F: invokestatic game.C_100216_aj.func_104441_z(char[])java.lang.String
		// @172: aastore
		// @173: dup
		// @174: bipush 30 (0x1E)
		// @176: ldc "P~\u001fG"
		// @178: invokestatic game.C_100216_aj.func_104443_z(java.lang.String)char[]
		// @17B: invokestatic game.C_100216_aj.func_104441_z(char[])java.lang.String
		// @17E: aastore
		// @17F: dup
		// @180: bipush 31 (0x1F)
		// @182: ldc "Pu\u0000\u001e9X\""
		// @184: invokestatic game.C_100216_aj.func_104443_z(java.lang.String)char[]
		// @187: invokestatic game.C_100216_aj.func_104441_z(char[])java.lang.String
		// @18A: aastore
		// @18B: dup
		// @18C: bipush 32 (0x20)
		// @18E: ldc "Pu\u0000\u001e9Y\""
		// @190: invokestatic game.C_100216_aj.func_104443_z(java.lang.String)char[]
		// @193: invokestatic game.C_100216_aj.func_104441_z(char[])java.lang.String
		// @196: aastore
		// @197: dup
		// @198: bipush 33 (0x21)
		// @19A: ldc "P3\u000e\u0016hR"
		// @19C: invokestatic game.C_100216_aj.func_104443_z(java.lang.String)char[]
		// @19F: invokestatic game.C_100216_aj.func_104441_z(char[])java.lang.String
		// @1A2: aastore
		// @1A3: dup
		// @1A4: bipush 34 (0x22)
		// @1A6: ldc "Pu\u0000\u001e9^\""
		// @1A8: invokestatic game.C_100216_aj.func_104443_z(java.lang.String)char[]
		// @1AB: invokestatic game.C_100216_aj.func_104441_z(char[])java.lang.String
		// @1AE: aastore
		// @1AF: putstatic java.lang.String[] game.C_100216_aj.field_104446_D
		// @1B2: ldc_w "5s\u0018Ye\u001eyM\u0017k\u0018<\u000e\u000cv\u001ey\u0003\rh\u0015<\u0001\u0016c\u000by\tYm\u0002<\u0019\u0016$\u0018t\u0008Yc\rq\u0008W"
		// @1B5: invokestatic game.C_100216_aj.func_104443_z(java.lang.String)char[]
		// @1B8: invokestatic game.C_100216_aj.func_104441_z(char[])java.lang.String
		// @1BB: putstatic java.lang.String game.C_100216_aj.field_104455_j
		// @1BE: aconst_null
		// @1BF: putstatic java.lang.String game.C_100216_aj.field_104449_B
		// @1C2: sipush 256 (0x0100)
		// @1C5: putstatic int game.C_100216_aj.field_104467_z
		// @1C8: iconst_1
		// @1C9: putstatic boolean game.C_100216_aj.field_104462_t
		// @1CC: return
	}
	
	private static char[] func_104443_z(String arg0)
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
		// @0E: iconst_4
		// @0F: ixor
		// @10: i2c
		// @11: castore
		// @12: areturn
	}
	
	private static String func_104441_z(char[] arg0)
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
		// @30: bipush 108 (0x6C)
		// @32: goto @45
		// @35: bipush 28 (0x1C)
		// @37: goto @45
		// @3A: bipush 109 (0x6D)
		// @3C: goto @45
		// @3F: bipush 121 (0x79)
		// @41: goto @45
		// @44: iconst_4
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
