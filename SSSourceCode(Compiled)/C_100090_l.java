package game;

final class C_100090_l
{
	static String field_104498_a;
	static C_100037_wb[] field_104497_c;
	static String field_104496_b;
	static String field_104495_d;
	private static final String[] field_104499_z;
	
	static final void func_104494_a(int arg0, C_100292_jk arg1, int arg2)
	{
		// @00: iload_2
		// @01: ifeq @13
		// @04: bipush -32 (0xE0)
		// @06: aconst_null
		// @07: checkcast game.C_100292_jk
		// @0A: bipush -23 (0xE9)
		// @0C: invokestatic game.C_100090_l.func_104494_a(int, game.C_100292_jk, int)void
		// @0F: goto @13
		// @12: athrow
		// @13: getstatic game.C_100202_qi game.C_100178_cg.field_105689_e
		// @16: bipush 124 (0x7C)
		// @18: aload_1
		// @19: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @1C: iload_2
		// @1D: bipush 108 (0x6C)
		// @1F: ixor
		// @20: aload_1
		// @21: iload_0
		// @22: invokestatic game.C_100016_wi.func_103801_a(int, game.C_100292_jk, int)void
		// @25: goto @6D
		// @28: astore_3
		// @29: aload_3
		// @2A: new java.lang.StringBuilder
		// @2D: dup
		// @2E: invokespecial java.lang.StringBuilder.<init>()void
		// @31: getstatic java.lang.String[] game.C_100090_l.field_104499_z
		// @34: bipush 9 (0x09)
		// @36: aaload
		// @37: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3A: iload_0
		// @3B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3E: bipush 44 (0x2C)
		// @40: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @43: aload_1
		// @44: ifnull @50
		// @47: getstatic java.lang.String[] game.C_100090_l.field_104499_z
		// @4A: iconst_0
		// @4B: aaload
		// @4C: goto @55
		// @4F: athrow
		// @50: getstatic java.lang.String[] game.C_100090_l.field_104499_z
		// @53: iconst_4
		// @54: aaload
		// @55: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @58: bipush 44 (0x2C)
		// @5A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5D: iload_2
		// @5E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @61: bipush 41 (0x29)
		// @63: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @66: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @69: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @6C: athrow
		// @6D: return
	}
	
	static final void func_104492_a(C_100098_h arg0, int arg1, String[][] arg2, int[] arg3, int arg4, C_100037_wb[][] arg5, byte[] arg6, byte[] arg7, C_100037_wb[][] arg8, String[] arg9, byte arg10, String[] arg11, String[] arg12, int arg13, String[][] arg14)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #21
		// @005: iload_1
		// @006: putstatic int game.C_100338_jc.field_105365_d
		// @009: aload #12
		// @00B: putstatic java.lang.String[] game.C_100302_ka.field_101873_vb
		// @00E: aload #6
		// @010: putstatic byte[] game.C_100252_pn.field_105509_v
		// @013: aload #5
		// @015: putstatic game.C_100037_wb[][] game.C_100074_g.field_104413_a
		// @018: aload_3
		// @019: putstatic int[] game.C_100126_cb.field_103060_v
		// @01C: iload #13
		// @01E: putstatic int game.C_100140_bj.field_102966_e
		// @021: aload #9
		// @023: putstatic java.lang.String[] game.C_100036_gg.field_103155_R
		// @026: aload #14
		// @028: putstatic java.lang.String[][] game.C_100086_uh.field_103031_r
		// @02B: aload_2
		// @02C: putstatic java.lang.String[][] game.C_100047_vh.field_104153_c
		// @02F: aload #8
		// @031: putstatic game.C_100037_wb[][] game.C_100086_uh.field_103029_t
		// @034: aload #7
		// @036: putstatic byte[] game.C_100207_qh.field_102879_S
		// @039: aload #11
		// @03B: putstatic java.lang.String[] game.C_100059_df.field_101593_E
		// @03E: aload_0
		// @03F: getstatic java.lang.String[] game.C_100090_l.field_104499_z
		// @042: iconst_5
		// @043: aaload
		// @044: getstatic java.lang.String[] game.C_100090_l.field_104499_z
		// @047: bipush 7 (0x07)
		// @049: aaload
		// @04A: bipush -123 (0x85)
		// @04C: invokestatic game.C_100163_sf.func_105433_a(game.C_100098_h, java.lang.String, java.lang.String, byte)game.C_100037_wb[]
		// @04F: putstatic game.C_100037_wb[] game.C_100046_vk.field_102762_tb
		// @052: aload_0
		// @053: getstatic java.lang.String[] game.C_100090_l.field_104499_z
		// @056: iconst_1
		// @057: aaload
		// @058: getstatic java.lang.String[] game.C_100090_l.field_104499_z
		// @05B: bipush 7 (0x07)
		// @05D: aaload
		// @05E: bipush -119 (0x89)
		// @060: invokestatic game.C_100163_sf.func_105433_a(game.C_100098_h, java.lang.String, java.lang.String, byte)game.C_100037_wb[]
		// @063: putstatic game.C_100037_wb[] game.C_100208_qg.field_105965_i
		// @066: aload_0
		// @067: getstatic java.lang.String[] game.C_100090_l.field_104499_z
		// @06A: bipush 6 (0x06)
		// @06C: aaload
		// @06D: getstatic java.lang.String[] game.C_100090_l.field_104499_z
		// @070: bipush 7 (0x07)
		// @072: aaload
		// @073: bipush -90 (0xA6)
		// @075: invokestatic game.C_100163_sf.func_105433_a(game.C_100098_h, java.lang.String, java.lang.String, byte)game.C_100037_wb[]
		// @078: putstatic game.C_100037_wb[] game.C_100074_g.field_104411_b
		// @07B: aload_0
		// @07C: getstatic java.lang.String[] game.C_100090_l.field_104499_z
		// @07F: iconst_2
		// @080: aaload
		// @081: getstatic java.lang.String[] game.C_100090_l.field_104499_z
		// @084: bipush 7 (0x07)
		// @086: aaload
		// @087: bipush -87 (0xA9)
		// @089: invokestatic game.C_100163_sf.func_105433_a(game.C_100098_h, java.lang.String, java.lang.String, byte)game.C_100037_wb[]
		// @08C: putstatic game.C_100037_wb[] game.C_100332_ii.field_107311_b
		// @08F: iconst_5
		// @090: anewarray java.lang.String
		// @093: putstatic java.lang.String[] game.C_100277_nc.field_106745_x
		// @096: getstatic java.lang.String[] game.C_100277_nc.field_106745_x
		// @099: iconst_2
		// @09A: getstatic java.lang.String game.C_100061_dh.field_101983_Yb
		// @09D: aastore
		// @09E: getstatic java.lang.String[] game.C_100277_nc.field_106745_x
		// @0A1: iconst_1
		// @0A2: getstatic java.lang.String game.C_100027_hc.field_102602_Y
		// @0A5: aastore
		// @0A6: getstatic java.lang.String[] game.C_100277_nc.field_106745_x
		// @0A9: iconst_4
		// @0AA: getstatic java.lang.String game.C_100085_a.field_102564_D
		// @0AD: aastore
		// @0AE: getstatic java.lang.String[] game.C_100277_nc.field_106745_x
		// @0B1: iconst_3
		// @0B2: getstatic java.lang.String game.C_100226_ae.field_106155_i
		// @0B5: aastore
		// @0B6: getstatic java.lang.String[] game.C_100277_nc.field_106745_x
		// @0B9: iconst_0
		// @0BA: getstatic java.lang.String game.C_100106_ef.field_104755_c
		// @0BD: aastore
		// @0BE: new game.C_100302_ka
		// @0C1: dup
		// @0C2: lconst_0
		// @0C3: aconst_null
		// @0C4: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @0C7: putstatic game.C_100302_ka game.C_100099_fb.field_103050_z
		// @0CA: new game.C_100302_ka
		// @0CD: dup
		// @0CE: lconst_0
		// @0CF: getstatic game.C_100302_ka game.C_100252_pn.field_105515_p
		// @0D2: getstatic java.lang.String game.C_100332_ii.field_107309_d
		// @0D5: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka, java.lang.String)void
		// @0D8: putstatic game.C_100302_ka game.C_100032_gk.field_103137_ab
		// @0DB: new game.C_100302_ka
		// @0DE: dup
		// @0DF: lconst_0
		// @0E0: getstatic game.C_100302_ka game.C_100038_wa.field_104074_o
		// @0E3: getstatic java.lang.String game.C_100208_qg.field_105962_j
		// @0E6: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka, java.lang.String)void
		// @0E9: putstatic game.C_100302_ka game.C_100249_pc.field_102336_v
		// @0EC: new game.C_100115_ej
		// @0EF: dup
		// @0F0: lconst_0
		// @0F1: new game.C_100302_ka
		// @0F4: dup
		// @0F5: lconst_0
		// @0F6: aconst_null
		// @0F7: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @0FA: getstatic game.C_100302_ka game.C_100085_a.field_102572_O
		// @0FD: getstatic game.C_100231_oc game.C_100013_fn.field_103737_f
		// @100: invokespecial game.C_100115_ej.<init>(long, game.C_100302_ka, game.C_100302_ka, game.C_100231_oc)void
		// @103: putstatic game.C_100115_ej game.C_100179_ch.field_100811_n
		// @106: getstatic game.C_100302_ka game.C_100099_fb.field_103050_z
		// @109: bipush -97 (0x9F)
		// @10B: getstatic game.C_100302_ka game.C_100032_gk.field_103137_ab
		// @10E: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @111: getstatic boolean game.C_100273_mm.field_106682_e
		// @114: ifeq @126
		// @117: getstatic game.C_100302_ka game.C_100099_fb.field_103050_z
		// @11A: bipush -70 (0xBA)
		// @11C: getstatic game.C_100302_ka game.C_100249_pc.field_102336_v
		// @11F: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @122: goto @126
		// @125: athrow
		// @126: getstatic game.C_100302_ka game.C_100099_fb.field_103050_z
		// @129: bipush -127 (0x81)
		// @12B: getstatic game.C_100115_ej game.C_100179_ch.field_100811_n
		// @12E: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @131: getstatic game.C_100115_ej game.C_100179_ch.field_100811_n
		// @134: getfield game.C_100302_ka game.C_100115_ej.field_102040_Zb
		// @137: iload #10
		// @139: sipush 32360 (0x7E68)
		// @13C: iadd
		// @13D: getstatic game.C_100302_ka game.C_100129_tg.field_102750_sb
		// @140: invokevirtual game.C_100302_ka.func_101810_a(int, game.C_100302_ka)void
		// @143: getstatic game.C_100115_ej game.C_100179_ch.field_100811_n
		// @146: getfield game.C_100302_ka game.C_100115_ej.field_102040_Zb
		// @149: astore #15
		// @14B: getstatic game.C_100115_ej game.C_100179_ch.field_100811_n
		// @14E: getfield game.C_100302_ka game.C_100115_ej.field_102040_Zb
		// @151: iconst_1
		// @152: putfield int game.C_100302_ka.field_101858_J
		// @155: aload #15
		// @157: iconst_1
		// @158: putfield int game.C_100302_ka.field_101850_Fb
		// @15B: new game.C_100302_ka
		// @15E: dup
		// @15F: lconst_0
		// @160: getstatic game.C_100302_ka game.C_100129_tg.field_102750_sb
		// @163: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @166: putstatic game.C_100302_ka game.C_100297_kf.field_101240_l
		// @169: getstatic game.C_100302_ka game.C_100297_kf.field_101240_l
		// @16C: iconst_1
		// @16D: putfield int game.C_100302_ka.field_101850_Fb
		// @170: new game.C_100302_ka
		// @173: dup
		// @174: lconst_0
		// @175: getstatic game.C_100302_ka game.C_100031_gl.field_103967_c
		// @178: getstatic java.lang.String game.C_100009_fg.field_103661_h
		// @17B: invokevirtual java.lang.String.toUpperCase()java.lang.String
		// @17E: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka, java.lang.String)void
		// @181: putstatic game.C_100302_ka game.C_100080_b.field_104431_f
		// @184: new game.C_100302_ka
		// @187: dup
		// @188: lconst_0
		// @189: getstatic game.C_100302_ka game.C_100170_cm.field_105545_l
		// @18C: getstatic java.lang.String game.C_100315_la.field_107174_f
		// @18F: invokevirtual java.lang.String.toUpperCase()java.lang.String
		// @192: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka, java.lang.String)void
		// @195: putstatic game.C_100302_ka game.C_100015_wh.field_103792_k
		// @198: new game.C_100302_ka
		// @19B: dup
		// @19C: lconst_0
		// @19D: getstatic game.C_100302_ka game.C_100277_nc.field_106699_G
		// @1A0: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @1A3: putstatic game.C_100302_ka game.C_100148_bh.field_101802_v
		// @1A6: new game.C_100302_ka
		// @1A9: dup
		// @1AA: lconst_0
		// @1AB: getstatic game.C_100302_ka game.C_100252_pn.field_105515_p
		// @1AE: getstatic java.lang.String game.C_100042_we.field_104133_p
		// @1B1: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka, java.lang.String)void
		// @1B4: putstatic game.C_100302_ka game.C_100257_ln.field_106484_c
		// @1B7: new game.C_100302_ka
		// @1BA: dup
		// @1BB: lconst_0
		// @1BC: getstatic game.C_100302_ka game.C_100250_pl.field_106438_a
		// @1BF: getstatic java.lang.String game.C_100087_n.field_100692_l
		// @1C2: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka, java.lang.String)void
		// @1C5: putstatic game.C_100302_ka game.C_100295_kh.field_105291_e
		// @1C8: new game.C_100302_ka
		// @1CB: dup
		// @1CC: lconst_0
		// @1CD: getstatic game.C_100302_ka game.C_100250_pl.field_106438_a
		// @1D0: getstatic java.lang.String game.C_100097_k.field_104583_c
		// @1D3: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka, java.lang.String)void
		// @1D6: putstatic game.C_100302_ka game.C_100138_bo.field_100414_i
		// @1D9: new game.C_100302_ka
		// @1DC: dup
		// @1DD: lconst_0
		// @1DE: getstatic game.C_100302_ka game.C_100250_pl.field_106438_a
		// @1E1: getstatic java.lang.String game.C_100142_bk.field_105084_f
		// @1E4: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka, java.lang.String)void
		// @1E7: putstatic game.C_100302_ka game.C_100087_n.field_100694_j
		// @1EA: new game.C_100302_ka
		// @1ED: dup
		// @1EE: lconst_0
		// @1EF: getstatic game.C_100302_ka game.C_100250_pl.field_106438_a
		// @1F2: getstatic java.lang.String game.C_100000_gd.field_100359_c
		// @1F5: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka, java.lang.String)void
		// @1F8: putstatic game.C_100302_ka game.C_100073_f.field_101720_z
		// @1FB: new game.C_100302_ka
		// @1FE: dup
		// @1FF: lconst_0
		// @200: getstatic game.C_100302_ka game.C_100038_wa.field_104074_o
		// @203: getstatic java.lang.String game.C_100010_ff.field_103705_u
		// @206: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka, java.lang.String)void
		// @209: putstatic game.C_100302_ka game.C_100098_h.field_104613_g
		// @20C: new game.C_100115_ej
		// @20F: dup
		// @210: lconst_0
		// @211: new game.C_100302_ka
		// @214: dup
		// @215: lconst_0
		// @216: aconst_null
		// @217: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @21A: getstatic game.C_100302_ka game.C_100085_a.field_102572_O
		// @21D: getstatic game.C_100231_oc game.C_100013_fn.field_103737_f
		// @220: invokespecial game.C_100115_ej.<init>(long, game.C_100302_ka, game.C_100302_ka, game.C_100231_oc)void
		// @223: putstatic game.C_100115_ej game.C_100156_sk.field_105389_r
		// @226: new game.C_100302_ka
		// @229: dup
		// @22A: lconst_0
		// @22B: getstatic game.C_100302_ka game.C_100075_uj.field_100659_q
		// @22E: getstatic java.lang.String game.C_100302_ka.field_101870_R
		// @231: invokevirtual java.lang.String.toUpperCase()java.lang.String
		// @234: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka, java.lang.String)void
		// @237: putstatic game.C_100302_ka game.C_100020_wm.field_103858_a
		// @23A: getstatic game.C_100302_ka game.C_100020_wm.field_103858_a
		// @23D: getstatic boolean game.C_100273_mm.field_106682_e
		// @240: putfield boolean game.C_100302_ka.field_101864_W
		// @243: new game.C_100302_ka
		// @246: dup
		// @247: lconst_0
		// @248: getstatic game.C_100302_ka game.C_100075_uj.field_100659_q
		// @24B: getstatic boolean game.C_100273_mm.field_106682_e
		// @24E: ifeq @258
		// @251: getstatic java.lang.String game.C_100302_ka.field_101865_V
		// @254: goto @25B
		// @257: athrow
		// @258: getstatic java.lang.String game.C_100322_hn.field_107240_a
		// @25B: invokevirtual java.lang.String.toUpperCase()java.lang.String
		// @25E: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka, java.lang.String)void
		// @261: putstatic game.C_100302_ka game.C_100217_ao.field_106040_l
		// @264: new game.C_100302_ka
		// @267: dup
		// @268: lconst_0
		// @269: aconst_null
		// @26A: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @26D: putstatic game.C_100302_ka game.C_100081_ue.field_100676_j
		// @270: getstatic game.C_100302_ka game.C_100081_ue.field_100676_j
		// @273: bipush -93 (0xA3)
		// @275: getstatic game.C_100302_ka game.C_100015_wh.field_103792_k
		// @278: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @27B: getstatic game.C_100302_ka game.C_100081_ue.field_100676_j
		// @27E: bipush -113 (0x8F)
		// @280: getstatic game.C_100302_ka game.C_100148_bh.field_101802_v
		// @283: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @286: getstatic game.C_100302_ka game.C_100148_bh.field_101802_v
		// @289: bipush -117 (0x8B)
		// @28B: getstatic game.C_100302_ka game.C_100257_ln.field_106484_c
		// @28E: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @291: iload #10
		// @293: bipush -80 (0xB0)
		// @295: if_icmpeq @29F
		// @298: aconst_null
		// @299: checkcast java.lang.String
		// @29C: putstatic java.lang.String game.C_100090_l.field_104495_d
		// @29F: getstatic game.C_100302_ka game.C_100148_bh.field_101802_v
		// @2A2: bipush -108 (0x94)
		// @2A4: getstatic game.C_100302_ka game.C_100295_kh.field_105291_e
		// @2A7: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @2AA: getstatic game.C_100302_ka game.C_100148_bh.field_101802_v
		// @2AD: iload #10
		// @2AF: bipush 28 (0x1C)
		// @2B1: ixor
		// @2B2: getstatic game.C_100302_ka game.C_100138_bo.field_100414_i
		// @2B5: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @2B8: getstatic boolean game.C_100273_mm.field_106682_e
		// @2BB: ifne @2C2
		// @2BE: goto @2CD
		// @2C1: athrow
		// @2C2: getstatic game.C_100302_ka game.C_100148_bh.field_101802_v
		// @2C5: bipush -128 (0x80)
		// @2C7: getstatic game.C_100302_ka game.C_100087_n.field_100694_j
		// @2CA: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @2CD: getstatic game.C_100302_ka game.C_100148_bh.field_101802_v
		// @2D0: bipush -72 (0xB8)
		// @2D2: getstatic game.C_100302_ka game.C_100073_f.field_101720_z
		// @2D5: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @2D8: getstatic game.C_100302_ka game.C_100148_bh.field_101802_v
		// @2DB: iload #10
		// @2DD: bipush 38 (0x26)
		// @2DF: ixor
		// @2E0: getstatic game.C_100302_ka game.C_100098_h.field_104613_g
		// @2E3: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @2E6: getstatic game.C_100302_ka game.C_100148_bh.field_101802_v
		// @2E9: iload #10
		// @2EB: iconst_m1
		// @2EC: iadd
		// @2ED: getstatic game.C_100115_ej game.C_100156_sk.field_105389_r
		// @2F0: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @2F3: getstatic boolean game.C_100273_mm.field_106682_e
		// @2F6: ifne @2FD
		// @2F9: goto @308
		// @2FC: athrow
		// @2FD: getstatic game.C_100302_ka game.C_100081_ue.field_100676_j
		// @300: bipush -124 (0x84)
		// @302: getstatic game.C_100302_ka game.C_100020_wm.field_103858_a
		// @305: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @308: getstatic game.C_100302_ka game.C_100081_ue.field_100676_j
		// @30B: bipush -86 (0xAA)
		// @30D: getstatic game.C_100302_ka game.C_100217_ao.field_106040_l
		// @310: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @313: new game.C_100302_ka
		// @316: dup
		// @317: lconst_0
		// @318: getstatic game.C_100302_ka game.C_100129_tg.field_102750_sb
		// @31B: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @31E: putstatic game.C_100302_ka game.C_100293_kj.field_106889_b
		// @321: getstatic game.C_100302_ka game.C_100293_kj.field_106889_b
		// @324: iconst_0
		// @325: putfield int game.C_100302_ka.field_101858_J
		// @328: getstatic game.C_100302_ka game.C_100293_kj.field_106889_b
		// @32B: iconst_1
		// @32C: putfield int game.C_100302_ka.field_101850_Fb
		// @32F: new game.C_100302_ka
		// @332: dup
		// @333: lconst_0
		// @334: getstatic game.C_100302_ka game.C_100101_fc.field_103395_U
		// @337: getstatic java.lang.String game.C_100187_rk.field_100836_p
		// @33A: invokevirtual java.lang.String.toUpperCase()java.lang.String
		// @33D: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka, java.lang.String)void
		// @340: putstatic game.C_100302_ka game.C_100066_dl.field_101639_w
		// @343: new game.C_100302_ka
		// @346: dup
		// @347: lconst_0
		// @348: getstatic game.C_100302_ka game.C_100097_k.field_104578_f
		// @34B: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @34E: putstatic game.C_100302_ka game.C_100053_vn.field_102842_Y
		// @351: getstatic game.C_100302_ka game.C_100053_vn.field_102842_Y
		// @354: bipush -77 (0xB3)
		// @356: getstatic game.C_100302_ka game.C_100293_kj.field_106889_b
		// @359: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @35C: getstatic game.C_100302_ka game.C_100053_vn.field_102842_Y
		// @35F: bipush -88 (0xA8)
		// @361: getstatic game.C_100302_ka game.C_100066_dl.field_101639_w
		// @364: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @367: new game.C_100302_ka
		// @36A: dup
		// @36B: lconst_0
		// @36C: getstatic game.C_100302_ka game.C_100085_a.field_102572_O
		// @36F: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @372: putstatic game.C_100302_ka game.C_100149_bi.field_105157_c
		// @375: getstatic game.C_100302_ka game.C_100149_bi.field_105157_c
		// @378: sipush 32280 (0x7E18)
		// @37B: getstatic game.C_100302_ka game.C_100129_tg.field_102750_sb
		// @37E: invokevirtual game.C_100302_ka.func_101810_a(int, game.C_100302_ka)void
		// @381: getstatic game.C_100302_ka game.C_100149_bi.field_105157_c
		// @384: iconst_1
		// @385: putfield int game.C_100302_ka.field_101858_J
		// @388: getstatic game.C_100302_ka game.C_100149_bi.field_105157_c
		// @38B: astore #16
		// @38D: aload #16
		// @38F: iconst_1
		// @390: putfield int game.C_100302_ka.field_101850_Fb
		// @393: new game.C_100302_ka
		// @396: dup
		// @397: lconst_0
		// @398: aconst_null
		// @399: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @39C: putstatic game.C_100302_ka game.C_100030_gm.field_103341_D
		// @39F: new game.C_100302_ka
		// @3A2: dup
		// @3A3: lconst_0
		// @3A4: getstatic game.C_100302_ka game.C_100129_tg.field_102750_sb
		// @3A7: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @3AA: putstatic game.C_100302_ka game.C_100095_fe.field_103385_S
		// @3AD: getstatic game.C_100302_ka game.C_100095_fe.field_103385_S
		// @3B0: iconst_1
		// @3B1: putfield int game.C_100302_ka.field_101850_Fb
		// @3B4: new game.C_100302_ka
		// @3B7: dup
		// @3B8: lconst_0
		// @3B9: getstatic game.C_100302_ka game.C_100252_pn.field_105515_p
		// @3BC: getstatic java.lang.String game.C_100332_ii.field_107309_d
		// @3BF: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka, java.lang.String)void
		// @3C2: putstatic game.C_100302_ka game.C_100148_bh.field_101808_x
		// @3C5: new game.C_100302_ka
		// @3C8: dup
		// @3C9: lconst_0
		// @3CA: getstatic game.C_100302_ka game.C_100038_wa.field_104074_o
		// @3CD: getstatic java.lang.String game.C_100208_qg.field_105962_j
		// @3D0: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka, java.lang.String)void
		// @3D3: putstatic game.C_100302_ka game.C_100169_co.field_105527_c
		// @3D6: new game.C_100115_ej
		// @3D9: dup
		// @3DA: lconst_0
		// @3DB: new game.C_100302_ka
		// @3DE: dup
		// @3DF: lconst_0
		// @3E0: aconst_null
		// @3E1: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @3E4: getstatic game.C_100302_ka game.C_100085_a.field_102572_O
		// @3E7: getstatic game.C_100231_oc game.C_100013_fn.field_103737_f
		// @3EA: invokespecial game.C_100115_ej.<init>(long, game.C_100302_ka, game.C_100302_ka, game.C_100231_oc)void
		// @3ED: putstatic game.C_100115_ej game.C_100009_fg.field_103654_g
		// @3F0: getstatic game.C_100302_ka game.C_100030_gm.field_103341_D
		// @3F3: bipush -96 (0xA0)
		// @3F5: getstatic game.C_100302_ka game.C_100095_fe.field_103385_S
		// @3F8: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @3FB: getstatic game.C_100302_ka game.C_100030_gm.field_103341_D
		// @3FE: bipush -114 (0x8E)
		// @400: getstatic game.C_100302_ka game.C_100148_bh.field_101808_x
		// @403: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @406: getstatic boolean game.C_100273_mm.field_106682_e
		// @409: ifne @410
		// @40C: goto @41E
		// @40F: athrow
		// @410: getstatic game.C_100302_ka game.C_100030_gm.field_103341_D
		// @413: iload #10
		// @415: bipush -24 (0xE8)
		// @417: iadd
		// @418: getstatic game.C_100302_ka game.C_100169_co.field_105527_c
		// @41B: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @41E: getstatic game.C_100302_ka game.C_100030_gm.field_103341_D
		// @421: iload #10
		// @423: bipush -34 (0xDE)
		// @425: iadd
		// @426: getstatic game.C_100115_ej game.C_100009_fg.field_103654_g
		// @429: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @42C: new game.C_100302_ka
		// @42F: dup
		// @430: lconst_0
		// @431: getstatic game.C_100302_ka game.C_100031_gl.field_103967_c
		// @434: getstatic java.lang.String game.C_100099_fb.field_103041_A
		// @437: invokevirtual java.lang.String.toUpperCase()java.lang.String
		// @43A: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka, java.lang.String)void
		// @43D: putstatic game.C_100302_ka game.C_100200_ba.field_105847_f
		// @440: new game.C_100302_ka
		// @443: dup
		// @444: lconst_0
		// @445: getstatic game.C_100302_ka game.C_100170_cm.field_105545_l
		// @448: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @44B: putstatic game.C_100302_ka game.C_100250_pl.field_106436_b
		// @44E: new game.C_100302_ka
		// @451: dup
		// @452: lconst_0
		// @453: getstatic game.C_100302_ka game.C_100277_nc.field_106699_G
		// @456: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @459: putstatic game.C_100302_ka game.C_100033_gj.field_101926_pc
		// @45C: new game.C_100302_ka
		// @45F: dup
		// @460: lconst_0
		// @461: getstatic game.C_100302_ka game.C_100077_d.field_103323_Y
		// @464: getstatic java.lang.String game.C_100340_je.field_102985_h
		// @467: invokevirtual java.lang.String.toUpperCase()java.lang.String
		// @46A: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka, java.lang.String)void
		// @46D: putstatic game.C_100302_ka game.C_100163_sf.field_105437_e
		// @470: iload #4
		// @472: iconst_4
		// @473: iadd
		// @474: anewarray game.C_100144_bm[]
		// @477: putstatic game.C_100144_bm[][] game.C_100272_mn.field_102434_J
		// @47A: iconst_4
		// @47B: iload #4
		// @47D: iadd
		// @47E: anewarray game.C_100302_ka
		// @481: putstatic game.C_100302_ka[] game.C_100210_qa.field_101063_U
		// @484: getstatic game.C_100302_ka[] game.C_100210_qa.field_101063_U
		// @487: iconst_0
		// @488: new game.C_100302_ka
		// @48B: dup
		// @48C: lconst_0
		// @48D: getstatic game.C_100302_ka game.C_100167_sj.field_100797_q
		// @490: getstatic java.lang.String game.C_100128_ca.field_102807_P
		// @493: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka, java.lang.String)void
		// @496: aastore
		// @497: getstatic game.C_100144_bm[][] game.C_100272_mn.field_102434_J
		// @49A: iconst_0
		// @49B: bipush 6 (0x06)
		// @49D: anewarray game.C_100144_bm
		// @4A0: aastore
		// @4A1: iconst_0
		// @4A2: istore #17
		// @4A4: bipush -6 (0xFA)
		// @4A6: iload #17
		// @4A8: iconst_m1
		// @4A9: ixor
		// @4AA: if_icmpge @4E3
		// @4AD: getstatic game.C_100144_bm[][] game.C_100272_mn.field_102434_J
		// @4B0: iconst_0
		// @4B1: aaload
		// @4B2: iconst_1
		// @4B3: iload #17
		// @4B5: iadd
		// @4B6: new game.C_100144_bm
		// @4B9: dup
		// @4BA: lconst_0
		// @4BB: getstatic game.C_100302_ka game.C_100061_dh.field_101985_ec
		// @4BE: aconst_null
		// @4BF: getstatic game.C_100302_ka game.C_100236_on.field_100906_r
		// @4C2: getstatic game.C_100037_wb[] game.C_100046_vk.field_102762_tb
		// @4C5: iload #17
		// @4C7: aaload
		// @4C8: getstatic java.lang.String[] game.C_100277_nc.field_106745_x
		// @4CB: iload #17
		// @4CD: aaload
		// @4CE: invokespecial game.C_100144_bm.<init>(long, game.C_100302_ka, game.C_100302_ka, game.C_100302_ka, game.C_100037_wb, java.lang.String)void
		// @4D1: aastore
		// @4D2: iinc #17 +1
		// @4D5: iload #21
		// @4D7: ifne @5CC
		// @4DA: iload #21
		// @4DC: ifeq @4A4
		// @4DF: goto @4E3
		// @4E2: athrow
		// @4E3: getstatic int[] game.C_100126_cb.field_103060_v
		// @4E6: arraylength
		// @4E7: iconst_2
		// @4E8: if_icmplt @566
		// @4EB: getstatic game.C_100302_ka[] game.C_100210_qa.field_101063_U
		// @4EE: iconst_1
		// @4EF: new game.C_100302_ka
		// @4F2: dup
		// @4F3: lconst_0
		// @4F4: getstatic game.C_100302_ka game.C_100167_sj.field_100797_q
		// @4F7: getstatic java.lang.String game.C_100332_ii.field_107312_c
		// @4FA: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka, java.lang.String)void
		// @4FD: aastore
		// @4FE: getstatic game.C_100144_bm[][] game.C_100272_mn.field_102434_J
		// @501: iconst_1
		// @502: iconst_1
		// @503: getstatic int[] game.C_100126_cb.field_103060_v
		// @506: arraylength
		// @507: iadd
		// @508: anewarray game.C_100144_bm
		// @50B: aastore
		// @50C: getstatic game.C_100144_bm[][] game.C_100272_mn.field_102434_J
		// @50F: iconst_1
		// @510: aaload
		// @511: iconst_0
		// @512: new game.C_100144_bm
		// @515: dup
		// @516: lconst_0
		// @517: getstatic game.C_100302_ka game.C_100061_dh.field_101985_ec
		// @51A: aconst_null
		// @51B: getstatic game.C_100302_ka game.C_100236_on.field_100906_r
		// @51E: aconst_null
		// @51F: getstatic java.lang.String game.C_100339_jb.field_107381_d
		// @522: invokespecial game.C_100144_bm.<init>(long, game.C_100302_ka, game.C_100302_ka, game.C_100302_ka, game.C_100037_wb, java.lang.String)void
		// @525: aastore
		// @526: iconst_0
		// @527: istore #17
		// @529: getstatic int[] game.C_100126_cb.field_103060_v
		// @52C: arraylength
		// @52D: iload #17
		// @52F: if_icmple @566
		// @532: getstatic game.C_100144_bm[][] game.C_100272_mn.field_102434_J
		// @535: iconst_1
		// @536: aaload
		// @537: iload #17
		// @539: iconst_1
		// @53A: iadd
		// @53B: new game.C_100144_bm
		// @53E: dup
		// @53F: lconst_0
		// @540: getstatic game.C_100302_ka game.C_100061_dh.field_101985_ec
		// @543: aconst_null
		// @544: getstatic game.C_100302_ka game.C_100236_on.field_100906_r
		// @547: aconst_null
		// @548: getstatic int[] game.C_100126_cb.field_103060_v
		// @54B: iload #17
		// @54D: iaload
		// @54E: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @551: invokespecial game.C_100144_bm.<init>(long, game.C_100302_ka, game.C_100302_ka, game.C_100302_ka, game.C_100037_wb, java.lang.String)void
		// @554: aastore
		// @555: iinc #17 +1
		// @558: iload #21
		// @55A: ifne @5CC
		// @55D: iload #21
		// @55F: ifeq @529
		// @562: goto @566
		// @565: athrow
		// @566: getstatic game.C_100302_ka[] game.C_100210_qa.field_101063_U
		// @569: iconst_2
		// @56A: new game.C_100302_ka
		// @56D: dup
		// @56E: lconst_0
		// @56F: getstatic game.C_100302_ka game.C_100167_sj.field_100797_q
		// @572: getstatic java.lang.String game.C_100141_tc.field_105060_e
		// @575: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka, java.lang.String)void
		// @578: aastore
		// @579: getstatic game.C_100144_bm[][] game.C_100272_mn.field_102434_J
		// @57C: iconst_2
		// @57D: iconst_3
		// @57E: anewarray game.C_100144_bm
		// @581: dup
		// @582: iconst_0
		// @583: new game.C_100144_bm
		// @586: dup
		// @587: lconst_0
		// @588: getstatic game.C_100302_ka game.C_100061_dh.field_101985_ec
		// @58B: aconst_null
		// @58C: getstatic game.C_100302_ka game.C_100236_on.field_100906_r
		// @58F: aconst_null
		// @590: getstatic java.lang.String game.C_100339_jb.field_107381_d
		// @593: invokespecial game.C_100144_bm.<init>(long, game.C_100302_ka, game.C_100302_ka, game.C_100302_ka, game.C_100037_wb, java.lang.String)void
		// @596: aastore
		// @597: dup
		// @598: iconst_1
		// @599: new game.C_100144_bm
		// @59C: dup
		// @59D: lconst_0
		// @59E: getstatic game.C_100302_ka game.C_100061_dh.field_101985_ec
		// @5A1: aconst_null
		// @5A2: getstatic game.C_100302_ka game.C_100236_on.field_100906_r
		// @5A5: getstatic game.C_100037_wb[] game.C_100332_ii.field_107311_b
		// @5A8: iconst_0
		// @5A9: aaload
		// @5AA: getstatic java.lang.String game.C_100277_nc.field_106736_v
		// @5AD: invokespecial game.C_100144_bm.<init>(long, game.C_100302_ka, game.C_100302_ka, game.C_100302_ka, game.C_100037_wb, java.lang.String)void
		// @5B0: aastore
		// @5B1: dup
		// @5B2: iconst_2
		// @5B3: new game.C_100144_bm
		// @5B6: dup
		// @5B7: lconst_0
		// @5B8: getstatic game.C_100302_ka game.C_100061_dh.field_101985_ec
		// @5BB: aconst_null
		// @5BC: getstatic game.C_100302_ka game.C_100236_on.field_100906_r
		// @5BF: getstatic game.C_100037_wb[] game.C_100332_ii.field_107311_b
		// @5C2: iconst_1
		// @5C3: aaload
		// @5C4: getstatic java.lang.String game.C_100270_mi.field_102268_ec
		// @5C7: invokespecial game.C_100144_bm.<init>(long, game.C_100302_ka, game.C_100302_ka, game.C_100302_ka, game.C_100037_wb, java.lang.String)void
		// @5CA: aastore
		// @5CB: aastore
		// @5CC: bipush -2 (0xFE)
		// @5CE: getstatic int game.C_100140_bj.field_102966_e
		// @5D1: iconst_m1
		// @5D2: ixor
		// @5D3: if_icmpgt @5DA
		// @5D6: goto @650
		// @5D9: athrow
		// @5DA: getstatic game.C_100302_ka[] game.C_100210_qa.field_101063_U
		// @5DD: iconst_3
		// @5DE: new game.C_100302_ka
		// @5E1: dup
		// @5E2: lconst_0
		// @5E3: getstatic game.C_100302_ka game.C_100167_sj.field_100797_q
		// @5E6: getstatic java.lang.String game.C_100012_fh.field_100512_H
		// @5E9: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka, java.lang.String)void
		// @5EC: aastore
		// @5ED: getstatic game.C_100144_bm[][] game.C_100272_mn.field_102434_J
		// @5F0: iconst_3
		// @5F1: getstatic int game.C_100140_bj.field_102966_e
		// @5F4: iconst_m1
		// @5F5: isub
		// @5F6: anewarray game.C_100144_bm
		// @5F9: aastore
		// @5FA: getstatic game.C_100144_bm[][] game.C_100272_mn.field_102434_J
		// @5FD: iconst_3
		// @5FE: aaload
		// @5FF: iconst_0
		// @600: new game.C_100144_bm
		// @603: dup
		// @604: lconst_0
		// @605: getstatic game.C_100302_ka game.C_100061_dh.field_101985_ec
		// @608: aconst_null
		// @609: getstatic game.C_100302_ka game.C_100236_on.field_100906_r
		// @60C: aconst_null
		// @60D: getstatic java.lang.String game.C_100339_jb.field_107381_d
		// @610: invokespecial game.C_100144_bm.<init>(long, game.C_100302_ka, game.C_100302_ka, game.C_100302_ka, game.C_100037_wb, java.lang.String)void
		// @613: aastore
		// @614: iconst_0
		// @615: istore #17
		// @617: getstatic int game.C_100140_bj.field_102966_e
		// @61A: iload #17
		// @61C: if_icmple @650
		// @61F: getstatic game.C_100144_bm[][] game.C_100272_mn.field_102434_J
		// @622: iconst_3
		// @623: aaload
		// @624: iconst_1
		// @625: iload #17
		// @627: iadd
		// @628: new game.C_100144_bm
		// @62B: dup
		// @62C: lconst_0
		// @62D: getstatic game.C_100302_ka game.C_100061_dh.field_101985_ec
		// @630: aconst_null
		// @631: getstatic game.C_100302_ka game.C_100236_on.field_100906_r
		// @634: aconst_null
		// @635: getstatic java.lang.String[] game.C_100059_df.field_101593_E
		// @638: iload #17
		// @63A: aaload
		// @63B: invokespecial game.C_100144_bm.<init>(long, game.C_100302_ka, game.C_100302_ka, game.C_100302_ka, game.C_100037_wb, java.lang.String)void
		// @63E: aastore
		// @63F: iinc #17 +1
		// @642: iload #21
		// @644: ifne @653
		// @647: iload #21
		// @649: ifeq @617
		// @64C: goto @650
		// @64F: athrow
		// @650: iconst_0
		// @651: istore #17
		// @653: iload #17
		// @655: iload #4
		// @657: if_icmpge @74F
		// @65A: getstatic game.C_100302_ka[] game.C_100210_qa.field_101063_U
		// @65D: iconst_4
		// @65E: iload #17
		// @660: iadd
		// @661: new game.C_100302_ka
		// @664: dup
		// @665: lconst_0
		// @666: getstatic game.C_100302_ka game.C_100167_sj.field_100797_q
		// @669: getstatic java.lang.String[] game.C_100036_gg.field_103155_R
		// @66C: iload #17
		// @66E: aaload
		// @66F: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka, java.lang.String)void
		// @672: aastore
		// @673: getstatic game.C_100144_bm[][] game.C_100272_mn.field_102434_J
		// @676: iconst_4
		// @677: iload #17
		// @679: iadd
		// @67A: iconst_1
		// @67B: sipush 255 (0x00FF)
		// @67E: getstatic byte[] game.C_100252_pn.field_105509_v
		// @681: iload #17
		// @683: baload
		// @684: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @687: iadd
		// @688: anewarray game.C_100144_bm
		// @68B: aastore
		// @68C: getstatic game.C_100144_bm[][] game.C_100272_mn.field_102434_J
		// @68F: iconst_4
		// @690: iload #17
		// @692: ineg
		// @693: isub
		// @694: aaload
		// @695: iconst_0
		// @696: new game.C_100144_bm
		// @699: dup
		// @69A: lconst_0
		// @69B: getstatic game.C_100302_ka game.C_100061_dh.field_101985_ec
		// @69E: aconst_null
		// @69F: getstatic game.C_100302_ka game.C_100236_on.field_100906_r
		// @6A2: aconst_null
		// @6A3: getstatic java.lang.String game.C_100339_jb.field_107381_d
		// @6A6: invokespecial game.C_100144_bm.<init>(long, game.C_100302_ka, game.C_100302_ka, game.C_100302_ka, game.C_100037_wb, java.lang.String)void
		// @6A9: aastore
		// @6AA: iconst_0
		// @6AB: iload #21
		// @6AD: ifne @750
		// @6B0: goto @6B4
		// @6B3: athrow
		// @6B4: istore #18
		// @6B6: getstatic byte[] game.C_100252_pn.field_105509_v
		// @6B9: iload #17
		// @6BB: baload
		// @6BC: sipush 255 (0x00FF)
		// @6BF: iand
		// @6C0: iconst_m1
		// @6C1: ixor
		// @6C2: iload #18
		// @6C4: iconst_m1
		// @6C5: ixor
		// @6C6: if_icmpge @747
		// @6C9: iload #21
		// @6CB: ifne @74A
		// @6CE: getstatic game.C_100037_wb[][] game.C_100074_g.field_104413_a
		// @6D1: ifnonnull @6DD
		// @6D4: goto @6D8
		// @6D7: athrow
		// @6D8: aconst_null
		// @6D9: goto @6F4
		// @6DC: athrow
		// @6DD: getstatic game.C_100037_wb[][] game.C_100074_g.field_104413_a
		// @6E0: iload #17
		// @6E2: aaload
		// @6E3: ifnull @6F3
		// @6E6: getstatic game.C_100037_wb[][] game.C_100074_g.field_104413_a
		// @6E9: iload #17
		// @6EB: aaload
		// @6EC: iload #18
		// @6EE: aaload
		// @6EF: goto @6F4
		// @6F2: athrow
		// @6F3: aconst_null
		// @6F4: astore #19
		// @6F6: aconst_null
		// @6F7: getstatic java.lang.String[][] game.C_100086_uh.field_103031_r
		// @6FA: if_acmpeq @71C
		// @6FD: aconst_null
		// @6FE: getstatic java.lang.String[][] game.C_100086_uh.field_103031_r
		// @701: iload #17
		// @703: aaload
		// @704: if_acmpne @710
		// @707: goto @70B
		// @70A: athrow
		// @70B: aconst_null
		// @70C: goto @71D
		// @70F: athrow
		// @710: getstatic java.lang.String[][] game.C_100086_uh.field_103031_r
		// @713: iload #17
		// @715: aaload
		// @716: iload #18
		// @718: aaload
		// @719: goto @71D
		// @71C: aconst_null
		// @71D: astore #20
		// @71F: getstatic game.C_100144_bm[][] game.C_100272_mn.field_102434_J
		// @722: iconst_4
		// @723: iload #17
		// @725: iadd
		// @726: aaload
		// @727: iload #18
		// @729: iconst_1
		// @72A: iadd
		// @72B: new game.C_100144_bm
		// @72E: dup
		// @72F: lconst_0
		// @730: getstatic game.C_100302_ka game.C_100061_dh.field_101985_ec
		// @733: aconst_null
		// @734: getstatic game.C_100302_ka game.C_100236_on.field_100906_r
		// @737: aload #19
		// @739: aload #20
		// @73B: invokespecial game.C_100144_bm.<init>(long, game.C_100302_ka, game.C_100302_ka, game.C_100302_ka, game.C_100037_wb, java.lang.String)void
		// @73E: aastore
		// @73F: iinc #18 +1
		// @742: iload #21
		// @744: ifeq @6B6
		// @747: iinc #17 +1
		// @74A: iload #21
		// @74C: ifeq @653
		// @74F: iconst_0
		// @750: istore #17
		// @752: iload #17
		// @754: iconst_m1
		// @755: ixor
		// @756: iconst_4
		// @757: iload #4
		// @759: iadd
		// @75A: iconst_m1
		// @75B: ixor
		// @75C: if_icmple @7E7
		// @75F: iload #21
		// @761: ifne @81D
		// @764: aconst_null
		// @765: getstatic game.C_100302_ka[] game.C_100210_qa.field_101063_U
		// @768: iload #17
		// @76A: aaload
		// @76B: goto @76F
		// @76E: athrow
		// @76F: if_acmpne @775
		// @772: goto @780
		// @775: getstatic game.C_100302_ka[] game.C_100210_qa.field_101063_U
		// @778: iload #17
		// @77A: aaload
		// @77B: bipush 11 (0x0B)
		// @77D: putfield int game.C_100302_ka.field_101833_ob
		// @780: getstatic game.C_100144_bm[][] game.C_100272_mn.field_102434_J
		// @783: iload #17
		// @785: aaload
		// @786: ifnonnull @78D
		// @789: goto @7DF
		// @78C: athrow
		// @78D: iconst_0
		// @78E: istore #18
		// @790: iload #18
		// @792: getstatic game.C_100144_bm[][] game.C_100272_mn.field_102434_J
		// @795: iload #17
		// @797: aaload
		// @798: arraylength
		// @799: if_icmpge @7DF
		// @79C: aconst_null
		// @79D: getstatic game.C_100144_bm[][] game.C_100272_mn.field_102434_J
		// @7A0: iload #17
		// @7A2: aaload
		// @7A3: iload #18
		// @7A5: aaload
		// @7A6: iload #21
		// @7A8: ifne @76F
		// @7AB: if_acmpeq @7D7
		// @7AE: aconst_null
		// @7AF: getstatic game.C_100144_bm[][] game.C_100272_mn.field_102434_J
		// @7B2: iload #17
		// @7B4: aaload
		// @7B5: iload #18
		// @7B7: aaload
		// @7B8: getfield game.C_100302_ka game.C_100144_bm.field_102093_Vb
		// @7BB: if_acmpne @7C6
		// @7BE: goto @7C2
		// @7C1: athrow
		// @7C2: goto @7D7
		// @7C5: athrow
		// @7C6: getstatic game.C_100144_bm[][] game.C_100272_mn.field_102434_J
		// @7C9: iload #17
		// @7CB: aaload
		// @7CC: iload #18
		// @7CE: aaload
		// @7CF: getfield game.C_100302_ka game.C_100144_bm.field_102093_Vb
		// @7D2: bipush 11 (0x0B)
		// @7D4: putfield int game.C_100302_ka.field_101833_ob
		// @7D7: iinc #18 +1
		// @7DA: iload #21
		// @7DC: ifeq @790
		// @7DF: iinc #17 +1
		// @7E2: iload #21
		// @7E4: ifeq @752
		// @7E7: new game.C_100302_ka
		// @7EA: dup
		// @7EB: lconst_0
		// @7EC: getstatic game.C_100302_ka game.C_100075_uj.field_100659_q
		// @7EF: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @7F2: putstatic game.C_100302_ka game.C_100289_jl.field_102897_D
		// @7F5: new game.C_100302_ka
		// @7F8: dup
		// @7F9: lconst_0
		// @7FA: getstatic game.C_100302_ka game.C_100075_uj.field_100659_q
		// @7FD: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @800: putstatic game.C_100302_ka game.C_100083_c.field_103164_U
		// @803: new game.C_100302_ka
		// @806: dup
		// @807: lconst_0
		// @808: getstatic game.C_100302_ka game.C_100316_lc.field_102409_C
		// @80B: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @80E: putstatic game.C_100302_ka game.C_100084_ug.field_104481_e
		// @811: getstatic game.C_100302_ka game.C_100084_ug.field_104481_e
		// @814: sipush 32280 (0x7E18)
		// @817: getstatic game.C_100302_ka game.C_100129_tg.field_102750_sb
		// @81A: invokevirtual game.C_100302_ka.func_101810_a(int, game.C_100302_ka)void
		// @81D: getstatic game.C_100302_ka game.C_100084_ug.field_104481_e
		// @820: astore #17
		// @822: getstatic game.C_100302_ka game.C_100084_ug.field_104481_e
		// @825: iconst_1
		// @826: putfield int game.C_100302_ka.field_101858_J
		// @829: aload #17
		// @82B: iconst_1
		// @82C: putfield int game.C_100302_ka.field_101850_Fb
		// @82F: new game.C_100302_ka
		// @832: dup
		// @833: lconst_0
		// @834: aconst_null
		// @835: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @838: putstatic game.C_100302_ka game.C_100318_hj.field_107196_d
		// @83B: getstatic game.C_100302_ka game.C_100318_hj.field_107196_d
		// @83E: bipush -118 (0x8A)
		// @840: getstatic game.C_100302_ka game.C_100250_pl.field_106436_b
		// @843: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @846: getstatic game.C_100302_ka game.C_100318_hj.field_107196_d
		// @849: iload #10
		// @84B: iconst_3
		// @84C: ixor
		// @84D: getstatic game.C_100302_ka game.C_100033_gj.field_101926_pc
		// @850: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @853: getstatic game.C_100302_ka game.C_100033_gj.field_101926_pc
		// @856: iload #10
		// @858: bipush -31 (0xE1)
		// @85A: iadd
		// @85B: getstatic game.C_100302_ka game.C_100163_sf.field_105437_e
		// @85E: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @861: iconst_0
		// @862: istore #18
		// @864: iload #18
		// @866: iconst_4
		// @867: iload #4
		// @869: iadd
		// @86A: if_icmpge @907
		// @86D: iload #21
		// @86F: ifne @956
		// @872: iload #18
		// @874: iconst_1
		// @875: if_icmpne @891
		// @878: goto @87C
		// @87B: athrow
		// @87C: iconst_2
		// @87D: getstatic int[] game.C_100126_cb.field_103060_v
		// @880: arraylength
		// @881: if_icmple @891
		// @884: goto @888
		// @887: athrow
		// @888: iload #21
		// @88A: ifeq @8FF
		// @88D: goto @891
		// @890: athrow
		// @891: iconst_3
		// @892: iload #18
		// @894: if_icmpne @8A9
		// @897: goto @89B
		// @89A: athrow
		// @89B: getstatic int game.C_100140_bj.field_102966_e
		// @89E: iconst_m1
		// @89F: ixor
		// @8A0: bipush -2 (0xFE)
		// @8A2: if_icmpge @8FF
		// @8A5: goto @8A9
		// @8A8: athrow
		// @8A9: getstatic game.C_100302_ka game.C_100033_gj.field_101926_pc
		// @8AC: bipush -73 (0xB7)
		// @8AE: getstatic game.C_100302_ka[] game.C_100210_qa.field_101063_U
		// @8B1: iload #18
		// @8B3: aaload
		// @8B4: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @8B7: iconst_0
		// @8B8: istore #19
		// @8BA: getstatic game.C_100144_bm[][] game.C_100272_mn.field_102434_J
		// @8BD: iload #18
		// @8BF: aaload
		// @8C0: arraylength
		// @8C1: iconst_m1
		// @8C2: ixor
		// @8C3: iload #19
		// @8C5: iconst_m1
		// @8C6: ixor
		// @8C7: if_icmpge @8FF
		// @8CA: getstatic game.C_100144_bm[][] game.C_100272_mn.field_102434_J
		// @8CD: iload #18
		// @8CF: aaload
		// @8D0: iload #19
		// @8D2: aaload
		// @8D3: iload #21
		// @8D5: ifne @953
		// @8D8: ifnull @8F7
		// @8DB: goto @8DF
		// @8DE: athrow
		// @8DF: getstatic game.C_100302_ka game.C_100033_gj.field_101926_pc
		// @8E2: iload #10
		// @8E4: bipush 28 (0x1C)
		// @8E6: ixor
		// @8E7: getstatic game.C_100144_bm[][] game.C_100272_mn.field_102434_J
		// @8EA: iload #18
		// @8EC: aaload
		// @8ED: iload #19
		// @8EF: aaload
		// @8F0: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @8F3: goto @8F7
		// @8F6: athrow
		// @8F7: iinc #19 +1
		// @8FA: iload #21
		// @8FC: ifeq @8BA
		// @8FF: iinc #18 +1
		// @902: iload #21
		// @904: ifeq @864
		// @907: getstatic game.C_100302_ka game.C_100318_hj.field_107196_d
		// @90A: iload #10
		// @90C: bipush 36 (0x24)
		// @90E: ixor
		// @90F: getstatic game.C_100302_ka game.C_100289_jl.field_102897_D
		// @912: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @915: getstatic game.C_100302_ka game.C_100318_hj.field_107196_d
		// @918: iload #10
		// @91A: bipush -44 (0xD4)
		// @91C: iadd
		// @91D: getstatic game.C_100302_ka game.C_100083_c.field_103164_U
		// @920: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @923: getstatic game.C_100302_ka game.C_100318_hj.field_107196_d
		// @926: bipush -81 (0xAF)
		// @928: getstatic game.C_100302_ka game.C_100084_ug.field_104481_e
		// @92B: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @92E: new game.C_100302_ka
		// @931: dup
		// @932: lconst_0
		// @933: getstatic game.C_100302_ka game.C_100151_bc.field_102932_cb
		// @936: getstatic java.lang.String game.C_100134_tj.field_105010_c
		// @939: invokevirtual java.lang.String.toUpperCase()java.lang.String
		// @93C: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka, java.lang.String)void
		// @93F: putstatic game.C_100302_ka game.C_100115_ej.field_102045_cc
		// @942: new game.C_100302_ka
		// @945: dup
		// @946: lconst_0
		// @947: getstatic game.C_100302_ka game.C_100101_fc.field_103395_U
		// @94A: getstatic java.lang.String game.C_100303_kk.field_104793_k
		// @94D: invokevirtual java.lang.String.toUpperCase()java.lang.String
		// @950: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka, java.lang.String)void
		// @953: putstatic game.C_100302_ka game.C_100273_mm.field_106685_a
		// @956: goto @AC0
		// @959: astore #15
		// @95B: aload #15
		// @95D: new java.lang.StringBuilder
		// @960: dup
		// @961: invokespecial java.lang.StringBuilder.<init>()void
		// @964: getstatic java.lang.String[] game.C_100090_l.field_104499_z
		// @967: iconst_3
		// @968: aaload
		// @969: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @96C: aload_0
		// @96D: ifnull @979
		// @970: getstatic java.lang.String[] game.C_100090_l.field_104499_z
		// @973: iconst_0
		// @974: aaload
		// @975: goto @97E
		// @978: athrow
		// @979: getstatic java.lang.String[] game.C_100090_l.field_104499_z
		// @97C: iconst_4
		// @97D: aaload
		// @97E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @981: bipush 44 (0x2C)
		// @983: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @986: iload_1
		// @987: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @98A: bipush 44 (0x2C)
		// @98C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @98F: aload_2
		// @990: ifnull @99C
		// @993: getstatic java.lang.String[] game.C_100090_l.field_104499_z
		// @996: iconst_0
		// @997: aaload
		// @998: goto @9A1
		// @99B: athrow
		// @99C: getstatic java.lang.String[] game.C_100090_l.field_104499_z
		// @99F: iconst_4
		// @9A0: aaload
		// @9A1: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @9A4: bipush 44 (0x2C)
		// @9A6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9A9: aload_3
		// @9AA: ifnull @9B6
		// @9AD: getstatic java.lang.String[] game.C_100090_l.field_104499_z
		// @9B0: iconst_0
		// @9B1: aaload
		// @9B2: goto @9BB
		// @9B5: athrow
		// @9B6: getstatic java.lang.String[] game.C_100090_l.field_104499_z
		// @9B9: iconst_4
		// @9BA: aaload
		// @9BB: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @9BE: bipush 44 (0x2C)
		// @9C0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9C3: iload #4
		// @9C5: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @9C8: bipush 44 (0x2C)
		// @9CA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9CD: aload #5
		// @9CF: ifnull @9DB
		// @9D2: getstatic java.lang.String[] game.C_100090_l.field_104499_z
		// @9D5: iconst_0
		// @9D6: aaload
		// @9D7: goto @9E0
		// @9DA: athrow
		// @9DB: getstatic java.lang.String[] game.C_100090_l.field_104499_z
		// @9DE: iconst_4
		// @9DF: aaload
		// @9E0: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @9E3: bipush 44 (0x2C)
		// @9E5: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9E8: aload #6
		// @9EA: ifnull @9F6
		// @9ED: getstatic java.lang.String[] game.C_100090_l.field_104499_z
		// @9F0: iconst_0
		// @9F1: aaload
		// @9F2: goto @9FB
		// @9F5: athrow
		// @9F6: getstatic java.lang.String[] game.C_100090_l.field_104499_z
		// @9F9: iconst_4
		// @9FA: aaload
		// @9FB: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @9FE: bipush 44 (0x2C)
		// @A00: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A03: aload #7
		// @A05: ifnull @A11
		// @A08: getstatic java.lang.String[] game.C_100090_l.field_104499_z
		// @A0B: iconst_0
		// @A0C: aaload
		// @A0D: goto @A16
		// @A10: athrow
		// @A11: getstatic java.lang.String[] game.C_100090_l.field_104499_z
		// @A14: iconst_4
		// @A15: aaload
		// @A16: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @A19: bipush 44 (0x2C)
		// @A1B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A1E: aload #8
		// @A20: ifnull @A2C
		// @A23: getstatic java.lang.String[] game.C_100090_l.field_104499_z
		// @A26: iconst_0
		// @A27: aaload
		// @A28: goto @A31
		// @A2B: athrow
		// @A2C: getstatic java.lang.String[] game.C_100090_l.field_104499_z
		// @A2F: iconst_4
		// @A30: aaload
		// @A31: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @A34: bipush 44 (0x2C)
		// @A36: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A39: aload #9
		// @A3B: ifnull @A47
		// @A3E: getstatic java.lang.String[] game.C_100090_l.field_104499_z
		// @A41: iconst_0
		// @A42: aaload
		// @A43: goto @A4C
		// @A46: athrow
		// @A47: getstatic java.lang.String[] game.C_100090_l.field_104499_z
		// @A4A: iconst_4
		// @A4B: aaload
		// @A4C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @A4F: bipush 44 (0x2C)
		// @A51: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A54: iload #10
		// @A56: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A59: bipush 44 (0x2C)
		// @A5B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A5E: aload #11
		// @A60: ifnull @A6C
		// @A63: getstatic java.lang.String[] game.C_100090_l.field_104499_z
		// @A66: iconst_0
		// @A67: aaload
		// @A68: goto @A71
		// @A6B: athrow
		// @A6C: getstatic java.lang.String[] game.C_100090_l.field_104499_z
		// @A6F: iconst_4
		// @A70: aaload
		// @A71: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @A74: bipush 44 (0x2C)
		// @A76: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A79: aload #12
		// @A7B: ifnull @A87
		// @A7E: getstatic java.lang.String[] game.C_100090_l.field_104499_z
		// @A81: iconst_0
		// @A82: aaload
		// @A83: goto @A8C
		// @A86: athrow
		// @A87: getstatic java.lang.String[] game.C_100090_l.field_104499_z
		// @A8A: iconst_4
		// @A8B: aaload
		// @A8C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @A8F: bipush 44 (0x2C)
		// @A91: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A94: iload #13
		// @A96: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A99: bipush 44 (0x2C)
		// @A9B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A9E: aload #14
		// @AA0: ifnull @AAC
		// @AA3: getstatic java.lang.String[] game.C_100090_l.field_104499_z
		// @AA6: iconst_0
		// @AA7: aaload
		// @AA8: goto @AB1
		// @AAB: athrow
		// @AAC: getstatic java.lang.String[] game.C_100090_l.field_104499_z
		// @AAF: iconst_4
		// @AB0: aaload
		// @AB1: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @AB4: bipush 41 (0x29)
		// @AB6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @AB9: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @ABC: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @ABF: athrow
		// @AC0: return
	}
	
	public static void func_104490_a(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100090_l.field_104495_d
		// @04: iload_0
		// @05: iconst_1
		// @06: if_icmpeq @0A
		// @09: return
		// @0A: aconst_null
		// @0B: putstatic java.lang.String game.C_100090_l.field_104498_a
		// @0E: aconst_null
		// @0F: putstatic game.C_100037_wb[] game.C_100090_l.field_104497_c
		// @12: aconst_null
		// @13: putstatic java.lang.String game.C_100090_l.field_104496_b
		// @16: goto @3B
		// @19: astore_1
		// @1A: aload_1
		// @1B: new java.lang.StringBuilder
		// @1E: dup
		// @1F: invokespecial java.lang.StringBuilder.<init>()void
		// @22: getstatic java.lang.String[] game.C_100090_l.field_104499_z
		// @25: bipush 8 (0x08)
		// @27: aaload
		// @28: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2B: iload_0
		// @2C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2F: bipush 41 (0x29)
		// @31: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @34: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @37: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3A: athrow
		// @3B: return
	}
	
	static
	{
		// @00: bipush 10 (0x0A)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "\u001df #\u001e"
		// @09: invokestatic game.C_100090_l.func_104493_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100090_l.func_104491_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "\u0014)zh\u0007\u0001)ch"
		// @14: invokestatic game.C_100090_l.func_104493_z(java.lang.String)char[]
		// @17: invokestatic game.C_100090_l.func_104491_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "\u0007$bb\u0014\u00158kn\u0017\u0007<a\u007f\u0010"
		// @1F: invokestatic game.C_100090_l.func_104493_z(java.lang.String)char[]
		// @22: invokestatic game.C_100090_l.func_104491_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "\nfM%"
		// @2A: invokestatic game.C_100090_l.func_104493_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100090_l.func_104491_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "\u0008=ba"
		// @35: invokestatic game.C_100090_l.func_104493_z(java.lang.String)char[]
		// @38: invokestatic game.C_100090_l.func_104491_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "\u0001)ch\u0013\u0014!xl\u0000\u001f"
		// @40: invokestatic game.C_100090_l.func_104493_z(java.lang.String)char[]
		// @43: invokestatic game.C_100090_l.func_104491_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "\t8kc\u0017\t%k"
		// @4C: invokestatic game.C_100090_l.func_104493_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100090_l.func_104491_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "\n'lo\u001a"
		// @58: invokestatic game.C_100090_l.func_104493_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100090_l.func_104491_z(char[])java.lang.String
		// @5E: aastore
		// @5F: dup
		// @60: bipush 8 (0x08)
		// @62: ldc "\nfO%"
		// @64: invokestatic game.C_100090_l.func_104493_z(java.lang.String)char[]
		// @67: invokestatic game.C_100090_l.func_104491_z(char[])java.lang.String
		// @6A: aastore
		// @6B: dup
		// @6C: bipush 9 (0x09)
		// @6E: ldc "\nfL%"
		// @70: invokestatic game.C_100090_l.func_104493_z(java.lang.String)char[]
		// @73: invokestatic game.C_100090_l.func_104491_z(char[])java.lang.String
		// @76: aastore
		// @77: putstatic java.lang.String[] game.C_100090_l.field_104499_z
		// @7A: ldc "+-}~\u0002\u0001-.j\u0002\u000b-"
		// @7C: invokestatic game.C_100090_l.func_104493_z(java.lang.String)char[]
		// @7F: invokestatic game.C_100090_l.func_104491_z(char[])java.lang.String
		// @82: putstatic java.lang.String game.C_100090_l.field_104498_a
		// @85: ldc "%)`n\u0006\nh{c\u0011\u0007<kiC\u0014-cl\u0017\u0005 "
		// @87: invokestatic game.C_100090_l.func_104493_z(java.lang.String)char[]
		// @8A: invokestatic game.C_100090_l.func_104491_z(char[])java.lang.String
		// @8D: putstatic java.lang.String game.C_100090_l.field_104496_b
		// @90: ldc "+'xh\u000e\u0003&z-\u0002\u0008,.C\u0002\u0010!il\u0017\u000f'`"
		// @92: invokestatic game.C_100090_l.func_104493_z(java.lang.String)char[]
		// @95: invokestatic game.C_100090_l.func_104491_z(char[])java.lang.String
		// @98: putstatic java.lang.String game.C_100090_l.field_104495_d
		// @9B: return
	}
	
	private static char[] func_104493_z(String arg0)
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
		// @0E: bipush 99 (0x63)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_104491_z(char[] arg0)
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
		// @30: bipush 102 (0x66)
		// @32: goto @46
		// @35: bipush 72 (0x48)
		// @37: goto @46
		// @3A: bipush 14 (0x0E)
		// @3C: goto @46
		// @3F: bipush 13 (0x0D)
		// @41: goto @46
		// @44: bipush 99 (0x63)
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
