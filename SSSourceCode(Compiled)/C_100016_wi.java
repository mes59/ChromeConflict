package game;

final class C_100016_wi
{
	static int field_103806_a;
	static String field_103803_e;
	static int field_103802_d;
	static String field_103805_c;
	static int[] field_103804_b;
	private static final String[] field_103807_z;
	
	static final void func_103798_a(int arg0)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #11
		// @005: getstatic game.C_100278_nd game.C_100288_jn.field_106839_f
		// @008: astore_1
		// @009: iload_0
		// @00A: sipush -28701 (0x8FE3)
		// @00D: if_icmpeq @019
		// @010: bipush 10 (0x0A)
		// @012: putstatic int game.C_100016_wi.field_103802_d
		// @015: goto @019
		// @018: athrow
		// @019: aload_1
		// @01A: iconst_0
		// @01B: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @01E: istore_2
		// @01F: iconst_m1
		// @020: iload_2
		// @021: iconst_m1
		// @022: ixor
		// @023: if_icmpeq @050
		// @026: bipush -2 (0xFE)
		// @028: iload_2
		// @029: iconst_m1
		// @02A: ixor
		// @02B: if_icmpeq @050
		// @02E: goto @032
		// @031: athrow
		// @032: iconst_2
		// @033: iload_2
		// @034: if_icmpeq @050
		// @037: goto @03B
		// @03A: athrow
		// @03B: bipush -4 (0xFC)
		// @03D: iload_2
		// @03E: iconst_m1
		// @03F: ixor
		// @040: if_icmpeq @050
		// @043: goto @047
		// @046: athrow
		// @047: iconst_4
		// @048: iload_2
		// @049: if_icmpne @20A
		// @04C: goto @050
		// @04F: athrow
		// @050: getstatic game.C_100202_qi game.C_100339_jb.field_107387_l
		// @053: iload_0
		// @054: sipush 28748 (0x704C)
		// @057: iadd
		// @058: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @05B: checkcast game.C_100054_ec
		// @05E: astore_3
		// @05F: aload_3
		// @060: ifnull @089
		// @063: aload_3
		// @064: bipush 45 (0x2D)
		// @066: invokevirtual game.C_100054_ec.func_100583_c(int)void
		// @069: aload_3
		// @06A: bipush 8 (0x08)
		// @06C: invokevirtual game.C_100054_ec.func_101479_c(byte)void
		// @06F: getstatic game.C_100202_qi game.C_100339_jb.field_107387_l
		// @072: bipush 64 (0x40)
		// @074: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @077: checkcast game.C_100054_ec
		// @07A: astore_3
		// @07B: iload #11
		// @07D: ifne @094
		// @080: iload #11
		// @082: ifeq @05F
		// @085: goto @089
		// @088: athrow
		// @089: getstatic game.C_100105_eg game.C_100053_vn.field_102832_U
		// @08C: iconst_0
		// @08D: invokevirtual game.C_100105_eg.func_104730_b(int)game.C_100325_id
		// @090: checkcast game.C_100054_ec
		// @093: astore_3
		// @094: aconst_null
		// @095: aload_3
		// @096: if_acmpeq @0F0
		// @099: aload_3
		// @09A: getfield boolean game.C_100054_ec.field_101971_bc
		// @09D: iload #11
		// @09F: ifne @0F3
		// @0A2: goto @0A6
		// @0A5: athrow
		// @0A6: ifne @0BC
		// @0A9: goto @0AD
		// @0AC: athrow
		// @0AD: aload_3
		// @0AE: getfield boolean game.C_100054_ec.field_101961_jc
		// @0B1: ifne @0BC
		// @0B4: goto @0B8
		// @0B7: athrow
		// @0B8: goto @0DF
		// @0BB: athrow
		// @0BC: aload_3
		// @0BD: getfield boolean game.C_100054_ec.field_101961_jc
		// @0C0: ifeq @0D4
		// @0C3: getstatic int game.C_100044_vm.field_100946_r
		// @0C6: iconst_1
		// @0C7: isub
		// @0C8: putstatic int game.C_100044_vm.field_100946_r
		// @0CB: aload_3
		// @0CC: iconst_0
		// @0CD: putfield boolean game.C_100054_ec.field_101961_jc
		// @0D0: goto @0D4
		// @0D3: athrow
		// @0D4: aload_3
		// @0D5: iconst_0
		// @0D6: putfield boolean game.C_100054_ec.field_101971_bc
		// @0D9: aload_3
		// @0DA: bipush -68 (0xBC)
		// @0DC: invokestatic game.C_100208_qg.func_105952_a(game.C_100054_ec, byte)void
		// @0DF: getstatic game.C_100105_eg game.C_100053_vn.field_102832_U
		// @0E2: bipush 8 (0x08)
		// @0E4: invokevirtual game.C_100105_eg.func_104729_a(byte)game.C_100325_id
		// @0E7: checkcast game.C_100054_ec
		// @0EA: astore_3
		// @0EB: iload #11
		// @0ED: ifeq @094
		// @0F0: iload_2
		// @0F1: iconst_m1
		// @0F2: ixor
		// @0F3: bipush -2 (0xFE)
		// @0F5: if_icmpne @110
		// @0F8: aconst_null
		// @0F9: getstatic game.C_100211_qd game.C_100068_vc.field_104342_d
		// @0FC: if_acmpeq @110
		// @0FF: goto @103
		// @102: athrow
		// @103: getstatic game.C_100211_qd game.C_100068_vc.field_104342_d
		// @106: getfield java.lang.String game.C_100211_qd.field_102155_dc
		// @109: putstatic java.lang.String game.C_100093_fd.field_102779_U
		// @10C: goto @110
		// @10F: athrow
		// @110: iconst_4
		// @111: iload_2
		// @112: if_icmpeq @122
		// @115: aconst_null
		// @116: putstatic game.C_100211_qd game.C_100068_vc.field_104342_d
		// @119: iload #11
		// @11B: ifeq @157
		// @11E: goto @122
		// @121: athrow
		// @122: aload_1
		// @123: iload_0
		// @124: sipush 28699 (0x701B)
		// @127: iadd
		// @128: invokevirtual game.C_100280_nf.func_101143_l(int)int
		// @12B: istore_3
		// @12C: new game.C_100211_qd
		// @12F: dup
		// @130: getstatic int game.C_100137_bn.field_105038_l
		// @133: invokespecial game.C_100211_qd.<init>(int)void
		// @136: putstatic game.C_100211_qd game.C_100068_vc.field_104342_d
		// @139: getstatic game.C_100211_qd game.C_100068_vc.field_104342_d
		// @13C: iload_0
		// @13D: sipush 28700 (0x701C)
		// @140: iadd
		// @141: iload_3
		// @142: i2l
		// @143: invokevirtual game.C_100211_qd.func_101467_a(int, long)void
		// @146: getstatic game.C_100211_qd game.C_100068_vc.field_104342_d
		// @149: aload_1
		// @14A: iconst_0
		// @14B: iload_0
		// @14C: sipush 19399 (0x4BC7)
		// @14F: iadd
		// @150: invokestatic game.C_100255_pj.func_105234_a(game.C_100211_qd, game.C_100280_nf, boolean, int)void
		// @153: lconst_0
		// @154: putstatic long game.C_100315_la.field_107177_e
		// @157: bipush -3 (0xFD)
		// @159: iload_2
		// @15A: iconst_m1
		// @15B: ixor
		// @15C: if_icmpeq @175
		// @15F: iload_2
		// @160: iconst_3
		// @161: if_icmpeq @175
		// @164: goto @168
		// @167: athrow
		// @168: aconst_null
		// @169: putstatic game.C_100211_qd game.SteelSentinels.field_105274_N
		// @16C: iload #11
		// @16E: ifeq @190
		// @171: goto @175
		// @174: athrow
		// @175: getstatic game.C_100211_qd game.SteelSentinels.field_105274_N
		// @178: ifnull @183
		// @17B: goto @17F
		// @17E: athrow
		// @17F: goto @190
		// @182: athrow
		// @183: new game.C_100211_qd
		// @186: dup
		// @187: getstatic int game.C_100137_bn.field_105038_l
		// @18A: invokespecial game.C_100211_qd.<init>(int)void
		// @18D: putstatic game.C_100211_qd game.SteelSentinels.field_105274_N
		// @190: bipush -4 (0xFC)
		// @192: iload_2
		// @193: iconst_m1
		// @194: ixor
		// @195: if_icmpne @1FD
		// @198: iconst_1
		// @199: putstatic boolean game.C_100226_ae.field_106149_e
		// @19C: iconst_0
		// @19D: istore_3
		// @19E: getstatic byte[] game.C_100217_ao.field_106037_b
		// @1A1: arraylength
		// @1A2: iload_3
		// @1A3: if_icmple @1C2
		// @1A6: getstatic byte[] game.C_100217_ao.field_106037_b
		// @1A9: iload_3
		// @1AA: aload_1
		// @1AB: bipush -114 (0x8E)
		// @1AD: invokevirtual game.C_100280_nf.func_101146_c(byte)byte
		// @1B0: bastore
		// @1B1: iinc #3 +1
		// @1B4: iload #11
		// @1B6: ifne @1D2
		// @1B9: iload #11
		// @1BB: ifeq @19E
		// @1BE: goto @1C2
		// @1C1: athrow
		// @1C2: aload_1
		// @1C3: iconst_0
		// @1C4: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @1C7: putstatic int game.C_100271_mj.field_103437_P
		// @1CA: aload_1
		// @1CB: iconst_0
		// @1CC: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @1CF: putstatic int game.C_100029_gn.field_103366_Q
		// @1D2: iconst_0
		// @1D3: istore_3
		// @1D4: getstatic byte[] game.C_100132_td.field_104970_f
		// @1D7: arraylength
		// @1D8: iload_3
		// @1D9: if_icmple @1F8
		// @1DC: getstatic byte[] game.C_100132_td.field_104970_f
		// @1DF: iload_3
		// @1E0: aload_1
		// @1E1: bipush -121 (0x87)
		// @1E3: invokevirtual game.C_100280_nf.func_101146_c(byte)byte
		// @1E6: bastore
		// @1E7: iinc #3 +1
		// @1EA: iload #11
		// @1EC: ifne @884
		// @1EF: iload #11
		// @1F1: ifeq @1D4
		// @1F4: goto @1F8
		// @1F7: athrow
		// @1F8: iload #11
		// @1FA: ifeq @884
		// @1FD: iconst_0
		// @1FE: putstatic boolean game.C_100226_ae.field_106149_e
		// @201: iload #11
		// @203: ifeq @884
		// @206: goto @20A
		// @209: athrow
		// @20A: iload_2
		// @20B: iconst_m1
		// @20C: ixor
		// @20D: bipush -6 (0xFA)
		// @20F: if_icmpne @2FF
		// @212: goto @216
		// @215: athrow
		// @216: aload_1
		// @217: iload_0
		// @218: sipush 12559 (0x310F)
		// @21B: iadd
		// @21C: invokevirtual game.C_100280_nf.func_101161_i(int)long
		// @21F: lstore_3
		// @220: aload_1
		// @221: sipush 9692 (0x25DC)
		// @224: invokevirtual game.C_100280_nf.func_101164_f(int)java.lang.String
		// @227: astore #5
		// @229: aload_1
		// @22A: sipush 9692 (0x25DC)
		// @22D: invokevirtual game.C_100280_nf.func_101164_f(int)java.lang.String
		// @230: astore #6
		// @232: aload_1
		// @233: sipush 9692 (0x25DC)
		// @236: invokevirtual game.C_100280_nf.func_101164_f(int)java.lang.String
		// @239: astore #7
		// @23B: iconst_0
		// @23C: lload_3
		// @23D: invokestatic game.C_100107_u.func_104768_a(int, long)game.C_100054_ec
		// @240: astore #8
		// @242: aload #6
		// @244: ldc ""
		// @246: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @249: ifne @251
		// @24C: iconst_1
		// @24D: goto @252
		// @250: athrow
		// @251: iconst_0
		// @252: istore #9
		// @254: aconst_null
		// @255: aload #8
		// @257: if_acmpeq @278
		// @25A: iload #9
		// @25C: ifne @267
		// @25F: goto @263
		// @262: athrow
		// @263: goto @294
		// @266: athrow
		// @267: aload #8
		// @269: aload #5
		// @26B: sipush -8082 (0xE06E)
		// @26E: aload #7
		// @270: invokevirtual game.C_100054_ec.func_101950_a(java.lang.String, int, java.lang.String)void
		// @273: iload #11
		// @275: ifeq @294
		// @278: new game.C_100054_ec
		// @27B: dup
		// @27C: aload #5
		// @27E: aload #7
		// @280: lload_3
		// @281: invokespecial game.C_100054_ec.<init>(java.lang.String, java.lang.String, long)void
		// @284: astore #8
		// @286: getstatic game.C_100105_eg game.C_100053_vn.field_102832_U
		// @289: aload #8
		// @28B: iload_0
		// @28C: sipush 28700 (0x701C)
		// @28F: iadd
		// @290: lload_3
		// @291: invokevirtual game.C_100105_eg.func_104725_a(game.C_100325_id, int, long)void
		// @294: aload #8
		// @296: bipush 119 (0x77)
		// @298: invokestatic game.C_100198_qn.func_105828_a(byte)long
		// @29B: aload_1
		// @29C: iload_0
		// @29D: sipush 27158 (0x6A16)
		// @2A0: iadd
		// @2A1: invokevirtual game.C_100280_nf.func_101171_e(int)int
		// @2A4: i2l
		// @2A5: lneg
		// @2A6: ladd
		// @2A7: putfield long game.C_100054_ec.field_101960_Wb
		// @2AA: aload #8
		// @2AC: aload_1
		// @2AD: iload_0
		// @2AE: sipush 28699 (0x701B)
		// @2B1: iadd
		// @2B2: invokevirtual game.C_100280_nf.func_101143_l(int)int
		// @2B5: putfield int game.C_100054_ec.field_101966_Vb
		// @2B8: aload_1
		// @2B9: bipush -102 (0x9A)
		// @2BB: invokevirtual game.C_100280_nf.func_101158_h(int)int
		// @2BE: istore #10
		// @2C0: aload #8
		// @2C2: iconst_1
		// @2C3: iload #10
		// @2C5: iand
		// @2C6: iconst_m1
		// @2C7: ixor
		// @2C8: iconst_m1
		// @2C9: if_icmpeq @2D1
		// @2CC: iconst_1
		// @2CD: goto @2D2
		// @2D0: athrow
		// @2D1: iconst_0
		// @2D2: putfield boolean game.C_100054_ec.field_101958_ec
		// @2D5: aload #8
		// @2D7: iload #10
		// @2D9: ldc -191957279 (0xf48ef6e1)
		// @2DB: ishr
		// @2DC: putfield int game.C_100054_ec.field_101972_cc
		// @2DF: aload #8
		// @2E1: aload_1
		// @2E2: iconst_0
		// @2E3: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @2E6: putfield int game.C_100054_ec.field_101953_gc
		// @2E9: aload #8
		// @2EB: aload_1
		// @2EC: iconst_0
		// @2ED: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @2F0: putfield int game.C_100054_ec.field_101969_ac
		// @2F3: aload #8
		// @2F5: bipush -103 (0x99)
		// @2F7: invokestatic game.C_100208_qg.func_105952_a(game.C_100054_ec, byte)void
		// @2FA: iload #11
		// @2FC: ifeq @884
		// @2FF: bipush -7 (0xF9)
		// @301: iload_2
		// @302: iconst_m1
		// @303: ixor
		// @304: if_icmpeq @81A
		// @307: goto @30B
		// @30A: athrow
		// @30B: iload_2
		// @30C: bipush 7 (0x07)
		// @30E: if_icmpeq @7DA
		// @311: goto @315
		// @314: athrow
		// @315: bipush -9 (0xF7)
		// @317: iload_2
		// @318: iconst_m1
		// @319: ixor
		// @31A: if_icmpne @373
		// @31D: goto @321
		// @320: athrow
		// @321: aload_1
		// @322: iload_0
		// @323: sipush 28701 (0x701D)
		// @326: ixor
		// @327: invokevirtual game.C_100280_nf.func_101143_l(int)int
		// @32A: istore_3
		// @32B: getstatic game.C_100105_eg game.C_100329_ih.field_107271_c
		// @32E: iload_0
		// @32F: sipush 12304 (0x3010)
		// @332: iadd
		// @333: iload_3
		// @334: i2l
		// @335: invokevirtual game.C_100105_eg.func_104724_a(int, long)game.C_100325_id
		// @338: checkcast game.C_100211_qd
		// @33B: astore #4
		// @33D: aload #4
		// @33F: ifnull @346
		// @342: goto @35D
		// @345: athrow
		// @346: new game.C_100211_qd
		// @349: dup
		// @34A: getstatic int game.C_100137_bn.field_105038_l
		// @34D: invokespecial game.C_100211_qd.<init>(int)void
		// @350: astore #4
		// @352: getstatic game.C_100105_eg game.C_100329_ih.field_107271_c
		// @355: aload #4
		// @357: iconst_m1
		// @358: iload_3
		// @359: i2l
		// @35A: invokevirtual game.C_100105_eg.func_104725_a(game.C_100325_id, int, long)void
		// @35D: aload #4
		// @35F: aload_1
		// @360: iconst_1
		// @361: sipush -9302 (0xDBAA)
		// @364: invokestatic game.C_100255_pj.func_105234_a(game.C_100211_qd, game.C_100280_nf, boolean, int)void
		// @367: aload #4
		// @369: bipush 109 (0x6D)
		// @36B: invokestatic game.C_100249_pc.func_102322_a(game.C_100211_qd, int)void
		// @36E: iload #11
		// @370: ifeq @884
		// @373: iload_2
		// @374: bipush 9 (0x09)
		// @376: if_icmpeq @77B
		// @379: goto @37D
		// @37C: athrow
		// @37D: iload_2
		// @37E: bipush 10 (0x0A)
		// @380: if_icmpne @3C5
		// @383: goto @387
		// @386: athrow
		// @387: getstatic game.C_100202_qi game.C_100335_il.field_107368_e
		// @38A: iload_0
		// @38B: sipush 28801 (0x7081)
		// @38E: iadd
		// @38F: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @392: checkcast game.C_100211_qd
		// @395: astore_3
		// @396: aload_3
		// @397: ifnull @3C0
		// @39A: aload_3
		// @39B: bipush 45 (0x2D)
		// @39D: invokevirtual game.C_100211_qd.func_100583_c(int)void
		// @3A0: aload_3
		// @3A1: bipush 8 (0x08)
		// @3A3: invokevirtual game.C_100211_qd.func_101479_c(byte)void
		// @3A6: getstatic game.C_100202_qi game.C_100335_il.field_107368_e
		// @3A9: bipush 24 (0x18)
		// @3AB: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @3AE: checkcast game.C_100211_qd
		// @3B1: astore_3
		// @3B2: iload #11
		// @3B4: ifne @884
		// @3B7: iload #11
		// @3B9: ifeq @396
		// @3BC: goto @3C0
		// @3BF: athrow
		// @3C0: iload #11
		// @3C2: ifeq @884
		// @3C5: iload_2
		// @3C6: bipush 11 (0x0B)
		// @3C8: if_icmpeq @72D
		// @3CB: goto @3CF
		// @3CE: athrow
		// @3CF: iload_2
		// @3D0: iconst_m1
		// @3D1: ixor
		// @3D2: bipush -13 (0xF3)
		// @3D4: if_icmpeq @72D
		// @3D7: goto @3DB
		// @3DA: athrow
		// @3DB: iload_2
		// @3DC: bipush 13 (0x0D)
		// @3DE: if_icmpne @443
		// @3E1: goto @3E5
		// @3E4: athrow
		// @3E5: aload_1
		// @3E6: bipush -2 (0xFE)
		// @3E8: invokevirtual game.C_100280_nf.func_101143_l(int)int
		// @3EB: istore_3
		// @3EC: aload_1
		// @3ED: iconst_0
		// @3EE: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @3F1: istore #4
		// @3F3: getstatic game.C_100105_eg game.C_100329_ih.field_107271_c
		// @3F6: sipush -16397 (0xBFF3)
		// @3F9: iload_3
		// @3FA: i2l
		// @3FB: invokevirtual game.C_100105_eg.func_104724_a(int, long)game.C_100325_id
		// @3FE: checkcast game.C_100211_qd
		// @401: astore #5
		// @403: aload #5
		// @405: ifnonnull @40C
		// @408: goto @43E
		// @40B: athrow
		// @40C: aload #5
		// @40E: astore #6
		// @410: aload #5
		// @412: iconst_0
		// @413: putfield boolean game.C_100211_qd.field_102150_Cc
		// @416: iload #4
		// @418: ifeq @42E
		// @41B: aload #5
		// @41D: iload #4
		// @41F: putfield int game.C_100211_qd.field_102170_ac
		// @422: aload #5
		// @424: getstatic int game.C_100055_ed.field_104241_d
		// @427: putfield int game.C_100211_qd.field_102142_Ub
		// @42A: goto @42E
		// @42D: athrow
		// @42E: aload #6
		// @430: iconst_0
		// @431: putfield boolean game.C_100211_qd.field_102153_Lc
		// @434: aload #5
		// @436: iload_0
		// @437: sipush 28814 (0x708E)
		// @43A: iadd
		// @43B: invokestatic game.C_100249_pc.func_102322_a(game.C_100211_qd, int)void
		// @43E: iload #11
		// @440: ifeq @884
		// @443: bipush -15 (0xF1)
		// @445: iload_2
		// @446: iconst_m1
		// @447: ixor
		// @448: if_icmpeq @6D2
		// @44B: goto @44F
		// @44E: athrow
		// @44F: iload_2
		// @450: bipush 16 (0x10)
		// @452: if_icmpeq @6D2
		// @455: goto @459
		// @458: athrow
		// @459: bipush 15 (0x0F)
		// @45B: iload_2
		// @45C: if_icmpeq @659
		// @45F: goto @463
		// @462: athrow
		// @463: iload_2
		// @464: bipush 17 (0x11)
		// @466: if_icmpeq @659
		// @469: goto @46D
		// @46C: athrow
		// @46D: iload_2
		// @46E: bipush 18 (0x12)
		// @470: if_icmpeq @5B4
		// @473: goto @477
		// @476: athrow
		// @477: iload_2
		// @478: iconst_m1
		// @479: ixor
		// @47A: bipush -20 (0xEC)
		// @47C: if_icmpeq @550
		// @47F: goto @483
		// @482: athrow
		// @483: iload_2
		// @484: bipush 20 (0x14)
		// @486: if_icmpne @4A1
		// @489: goto @48D
		// @48C: athrow
		// @48D: getstatic game.C_100211_qd game.C_100068_vc.field_104342_d
		// @490: aload_1
		// @491: iconst_0
		// @492: sipush -9302 (0xDBAA)
		// @495: invokestatic game.C_100255_pj.func_105234_a(game.C_100211_qd, game.C_100280_nf, boolean, int)void
		// @498: iload #11
		// @49A: ifeq @884
		// @49D: goto @4A1
		// @4A0: athrow
		// @4A1: iload_2
		// @4A2: bipush 21 (0x15)
		// @4A4: if_icmpeq @521
		// @4A7: goto @4AB
		// @4AA: athrow
		// @4AB: iload_2
		// @4AC: bipush 22 (0x16)
		// @4AE: if_icmpeq @506
		// @4B1: goto @4B5
		// @4B4: athrow
		// @4B5: iload_2
		// @4B6: iconst_m1
		// @4B7: ixor
		// @4B8: bipush -24 (0xE8)
		// @4BA: if_icmpne @4D4
		// @4BD: goto @4C1
		// @4C0: athrow
		// @4C1: aload_1
		// @4C2: sipush -16142 (0xC0F2)
		// @4C5: invokevirtual game.C_100280_nf.func_101161_i(int)long
		// @4C8: putstatic long game.C_100321_hi.field_107215_f
		// @4CB: iload #11
		// @4CD: ifeq @884
		// @4D0: goto @4D4
		// @4D3: athrow
		// @4D4: iload_0
		// @4D5: sipush 28702 (0x701E)
		// @4D8: iadd
		// @4D9: new java.lang.StringBuilder
		// @4DC: dup
		// @4DD: invokespecial java.lang.StringBuilder.<init>()void
		// @4E0: getstatic java.lang.String[] game.C_100016_wi.field_103807_z
		// @4E3: iconst_2
		// @4E4: aaload
		// @4E5: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4E8: bipush 122 (0x7A)
		// @4EA: invokestatic game.C_100316_lc.func_102399_d(byte)java.lang.String
		// @4ED: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4F0: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4F3: aconst_null
		// @4F4: invokestatic game.C_100036_gg.func_103142_a(int, java.lang.String, java.lang.Throwable)void
		// @4F7: sipush 13313 (0x3401)
		// @4FA: invokestatic game.C_100095_fe.func_103371_l(int)void
		// @4FD: iload #11
		// @4FF: ifeq @884
		// @502: goto @506
		// @505: athrow
		// @506: aload_1
		// @507: bipush -2 (0xFE)
		// @509: invokevirtual game.C_100280_nf.func_101143_l(int)int
		// @50C: putstatic int game.C_100255_pj.field_105255_s
		// @50F: aload_1
		// @510: bipush 107 (0x6B)
		// @512: invokevirtual game.C_100280_nf.func_101158_h(int)int
		// @515: putstatic int game.C_100022_hf.field_103893_f
		// @518: iload #11
		// @51A: ifeq @884
		// @51D: goto @521
		// @520: athrow
		// @521: aload_1
		// @522: bipush -2 (0xFE)
		// @524: invokevirtual game.C_100280_nf.func_101143_l(int)int
		// @527: istore_3
		// @528: iload_3
		// @529: iconst_m1
		// @52A: ixor
		// @52B: iconst_m1
		// @52C: if_icmpeq @543
		// @52F: bipush 103 (0x67)
		// @531: invokestatic game.C_100198_qn.func_105828_a(byte)long
		// @534: iload_3
		// @535: i2l
		// @536: ladd
		// @537: putstatic long game.C_100315_la.field_107177_e
		// @53A: iload #11
		// @53C: ifeq @54B
		// @53F: goto @543
		// @542: athrow
		// @543: lconst_0
		// @544: putstatic long game.C_100315_la.field_107177_e
		// @547: goto @54B
		// @54A: athrow
		// @54B: iload #11
		// @54D: ifeq @884
		// @550: aload_1
		// @551: sipush -16142 (0xC0F2)
		// @554: invokevirtual game.C_100280_nf.func_101161_i(int)long
		// @557: lstore_3
		// @558: aload_1
		// @559: iconst_0
		// @55A: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @55D: istore #5
		// @55F: bipush 16 (0x10)
		// @561: lload_3
		// @562: invokestatic game.C_100194_rd.func_103068_a(int, long)game.C_100054_ec
		// @565: astore #6
		// @567: aconst_null
		// @568: aload #6
		// @56A: if_acmpeq @5AF
		// @56D: iload #5
		// @56F: iconst_m1
		// @570: ixor
		// @571: iconst_m1
		// @572: if_icmpne @589
		// @575: goto @579
		// @578: athrow
		// @579: aload #6
		// @57B: bipush 45 (0x2D)
		// @57D: invokevirtual game.C_100054_ec.func_100583_c(int)void
		// @580: iload #11
		// @582: ifeq @59C
		// @585: goto @589
		// @588: athrow
		// @589: aload #6
		// @58B: getstatic int game.C_100055_ed.field_104241_d
		// @58E: putfield int game.C_100054_ec.field_101962_ic
		// @591: aload #6
		// @593: iload #5
		// @595: putfield int game.C_100054_ec.field_101954_Zb
		// @598: goto @59C
		// @59B: athrow
		// @59C: aload #6
		// @59E: bipush 8 (0x08)
		// @5A0: invokevirtual game.C_100054_ec.func_101479_c(byte)void
		// @5A3: getstatic game.C_100211_qd game.C_100068_vc.field_104342_d
		// @5A6: dup
		// @5A7: getfield int game.C_100211_qd.field_102138_ec
		// @5AA: iconst_1
		// @5AB: isub
		// @5AC: putfield int game.C_100211_qd.field_102138_ec
		// @5AF: iload #11
		// @5B1: ifeq @884
		// @5B4: aload_1
		// @5B5: iload_0
		// @5B6: sipush 12559 (0x310F)
		// @5B9: iadd
		// @5BA: invokevirtual game.C_100280_nf.func_101161_i(int)long
		// @5BD: lstore_3
		// @5BE: aload_1
		// @5BF: iload_0
		// @5C0: ldc 38393 (0x95f9)
		// @5C2: iadd
		// @5C3: invokevirtual game.C_100280_nf.func_101164_f(int)java.lang.String
		// @5C6: astore #5
		// @5C8: aload_1
		// @5C9: iload_0
		// @5CA: ldc 38393 (0x95f9)
		// @5CC: iadd
		// @5CD: invokevirtual game.C_100280_nf.func_101164_f(int)java.lang.String
		// @5D0: astore #6
		// @5D2: bipush 16 (0x10)
		// @5D4: lload_3
		// @5D5: invokestatic game.C_100194_rd.func_103068_a(int, long)game.C_100054_ec
		// @5D8: astore #7
		// @5DA: aload #7
		// @5DC: ifnonnull @603
		// @5DF: new game.C_100054_ec
		// @5E2: dup
		// @5E3: aload #5
		// @5E5: aload #6
		// @5E7: lload_3
		// @5E8: invokespecial game.C_100054_ec.<init>(java.lang.String, java.lang.String, long)void
		// @5EB: astore #7
		// @5ED: getstatic game.C_100105_eg game.C_100272_mn.field_102425_G
		// @5F0: aload #7
		// @5F2: iconst_m1
		// @5F3: lload_3
		// @5F4: invokevirtual game.C_100105_eg.func_104725_a(game.C_100325_id, int, long)void
		// @5F7: getstatic game.C_100211_qd game.C_100068_vc.field_104342_d
		// @5FA: dup
		// @5FB: getfield int game.C_100211_qd.field_102138_ec
		// @5FE: iconst_1
		// @5FF: iadd
		// @600: putfield int game.C_100211_qd.field_102138_ec
		// @603: aload #7
		// @605: aload_1
		// @606: bipush -2 (0xFE)
		// @608: invokevirtual game.C_100280_nf.func_101143_l(int)int
		// @60B: putfield int game.C_100054_ec.field_101966_Vb
		// @60E: aload_1
		// @60F: iload_0
		// @610: sipush 28789 (0x7075)
		// @613: ixor
		// @614: invokevirtual game.C_100280_nf.func_101158_h(int)int
		// @617: istore #8
		// @619: aload #7
		// @61B: iload #8
		// @61D: ldc 646705057 (0x268befa1)
		// @61F: ishr
		// @620: putfield int game.C_100054_ec.field_101972_cc
		// @623: aload #7
		// @625: iconst_0
		// @626: iconst_1
		// @627: iload #8
		// @629: iand
		// @62A: if_icmpeq @632
		// @62D: iconst_1
		// @62E: goto @633
		// @631: athrow
		// @632: iconst_0
		// @633: putfield boolean game.C_100054_ec.field_101958_ec
		// @636: aload #7
		// @638: aload_1
		// @639: iconst_0
		// @63A: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @63D: putfield int game.C_100054_ec.field_101953_gc
		// @640: aload #7
		// @642: aload_1
		// @643: iconst_0
		// @644: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @647: putfield int game.C_100054_ec.field_101969_ac
		// @64A: getstatic game.C_100202_qi game.C_100339_jb.field_107387_l
		// @64D: bipush 127 (0x7F)
		// @64F: aload #7
		// @651: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @654: iload #11
		// @656: ifeq @884
		// @659: aload_1
		// @65A: sipush -16142 (0xC0F2)
		// @65D: invokevirtual game.C_100280_nf.func_101161_i(int)long
		// @660: lstore_3
		// @661: aload_1
		// @662: iconst_0
		// @663: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @666: istore #5
		// @668: iconst_0
		// @669: lload_3
		// @66A: invokestatic game.C_100107_u.func_104768_a(int, long)game.C_100054_ec
		// @66D: astore #6
		// @66F: aload #6
		// @671: ifnull @6CD
		// @674: iload #5
		// @676: iconst_m1
		// @677: ixor
		// @678: iconst_m1
		// @679: if_icmpeq @693
		// @67C: goto @680
		// @67F: athrow
		// @680: aload #6
		// @682: iload #5
		// @684: putfield int game.C_100054_ec.field_101954_Zb
		// @687: aload #6
		// @689: getstatic int game.C_100055_ed.field_104241_d
		// @68C: putfield int game.C_100054_ec.field_101962_ic
		// @68F: goto @693
		// @692: athrow
		// @693: iload_2
		// @694: bipush 15 (0x0F)
		// @696: if_icmpeq @6BC
		// @699: aload #6
		// @69B: getfield boolean game.C_100054_ec.field_101961_jc
		// @69E: ifne @6A9
		// @6A1: goto @6A5
		// @6A4: athrow
		// @6A5: goto @6C6
		// @6A8: athrow
		// @6A9: getstatic int game.C_100044_vm.field_100946_r
		// @6AC: iconst_1
		// @6AD: isub
		// @6AE: putstatic int game.C_100044_vm.field_100946_r
		// @6B1: aload #6
		// @6B3: iconst_0
		// @6B4: putfield boolean game.C_100054_ec.field_101961_jc
		// @6B7: iload #11
		// @6B9: ifeq @6C6
		// @6BC: aload #6
		// @6BE: iconst_0
		// @6BF: putfield boolean game.C_100054_ec.field_101971_bc
		// @6C2: goto @6C6
		// @6C5: athrow
		// @6C6: aload #6
		// @6C8: bipush -50 (0xCE)
		// @6CA: invokestatic game.C_100208_qg.func_105952_a(game.C_100054_ec, byte)void
		// @6CD: iload #11
		// @6CF: ifeq @884
		// @6D2: aload_1
		// @6D3: iload_0
		// @6D4: sipush 12559 (0x310F)
		// @6D7: iadd
		// @6D8: invokevirtual game.C_100280_nf.func_101161_i(int)long
		// @6DB: lstore_3
		// @6DC: iconst_0
		// @6DD: lload_3
		// @6DE: invokestatic game.C_100107_u.func_104768_a(int, long)game.C_100054_ec
		// @6E1: astore #5
		// @6E3: aload #5
		// @6E5: ifnonnull @6EC
		// @6E8: goto @728
		// @6EB: athrow
		// @6EC: iload_2
		// @6ED: iconst_m1
		// @6EE: ixor
		// @6EF: bipush -15 (0xF1)
		// @6F1: if_icmpeq @717
		// @6F4: aload #5
		// @6F6: getfield boolean game.C_100054_ec.field_101961_jc
		// @6F9: ifne @721
		// @6FC: goto @700
		// @6FF: athrow
		// @700: getstatic int game.C_100044_vm.field_100946_r
		// @703: iconst_1
		// @704: iadd
		// @705: putstatic int game.C_100044_vm.field_100946_r
		// @708: aload #5
		// @70A: iconst_1
		// @70B: putfield boolean game.C_100054_ec.field_101961_jc
		// @70E: iload #11
		// @710: ifeq @721
		// @713: goto @717
		// @716: athrow
		// @717: aload #5
		// @719: iconst_1
		// @71A: putfield boolean game.C_100054_ec.field_101971_bc
		// @71D: goto @721
		// @720: athrow
		// @721: aload #5
		// @723: bipush -121 (0x87)
		// @725: invokestatic game.C_100208_qg.func_105952_a(game.C_100054_ec, byte)void
		// @728: iload #11
		// @72A: ifeq @884
		// @72D: aload_1
		// @72E: bipush -2 (0xFE)
		// @730: invokevirtual game.C_100280_nf.func_101143_l(int)int
		// @733: istore_3
		// @734: getstatic game.C_100105_eg game.C_100329_ih.field_107271_c
		// @737: sipush -16397 (0xBFF3)
		// @73A: iload_3
		// @73B: i2l
		// @73C: invokevirtual game.C_100105_eg.func_104724_a(int, long)game.C_100325_id
		// @73F: checkcast game.C_100211_qd
		// @742: astore #4
		// @744: aconst_null
		// @745: aload #4
		// @747: if_acmpeq @776
		// @74A: iload_2
		// @74B: iconst_m1
		// @74C: ixor
		// @74D: bipush -12 (0xF4)
		// @74F: if_icmpeq @765
		// @752: goto @756
		// @755: athrow
		// @756: aload #4
		// @758: iconst_1
		// @759: putfield boolean game.C_100211_qd.field_102150_Cc
		// @75C: iload #11
		// @75E: ifeq @76F
		// @761: goto @765
		// @764: athrow
		// @765: aload #4
		// @767: iconst_1
		// @768: putfield boolean game.C_100211_qd.field_102153_Lc
		// @76B: goto @76F
		// @76E: athrow
		// @76F: aload #4
		// @771: bipush 117 (0x75)
		// @773: invokestatic game.C_100249_pc.func_102322_a(game.C_100211_qd, int)void
		// @776: iload #11
		// @778: ifeq @884
		// @77B: aload_1
		// @77C: bipush -2 (0xFE)
		// @77E: invokevirtual game.C_100280_nf.func_101143_l(int)int
		// @781: istore_3
		// @782: aload_1
		// @783: iconst_0
		// @784: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @787: istore #4
		// @789: getstatic game.C_100105_eg game.C_100329_ih.field_107271_c
		// @78C: sipush -16397 (0xBFF3)
		// @78F: iload_3
		// @790: i2l
		// @791: invokevirtual game.C_100105_eg.func_104724_a(int, long)game.C_100325_id
		// @794: checkcast game.C_100211_qd
		// @797: astore #5
		// @799: aconst_null
		// @79A: aload #5
		// @79C: if_acmpne @7A3
		// @79F: goto @7D5
		// @7A2: athrow
		// @7A3: iload #4
		// @7A5: ifeq @7C0
		// @7A8: aload #5
		// @7AA: iload #4
		// @7AC: putfield int game.C_100211_qd.field_102170_ac
		// @7AF: aload #5
		// @7B1: getstatic int game.C_100055_ed.field_104241_d
		// @7B4: putfield int game.C_100211_qd.field_102142_Ub
		// @7B7: iload #11
		// @7B9: ifeq @7CE
		// @7BC: goto @7C0
		// @7BF: athrow
		// @7C0: aload #5
		// @7C2: iload_0
		// @7C3: sipush 28746 (0x704A)
		// @7C6: iadd
		// @7C7: invokevirtual game.C_100211_qd.func_100583_c(int)void
		// @7CA: goto @7CE
		// @7CD: athrow
		// @7CE: aload #5
		// @7D0: bipush 8 (0x08)
		// @7D2: invokevirtual game.C_100211_qd.func_101479_c(byte)void
		// @7D5: iload #11
		// @7D7: ifeq @884
		// @7DA: getstatic game.C_100202_qi game.C_100083_c.field_103168_Q
		// @7DD: bipush 36 (0x24)
		// @7DF: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @7E2: checkcast game.C_100054_ec
		// @7E5: astore_3
		// @7E6: aconst_null
		// @7E7: aload_3
		// @7E8: if_acmpeq @811
		// @7EB: aload_3
		// @7EC: bipush 45 (0x2D)
		// @7EE: invokevirtual game.C_100054_ec.func_100583_c(int)void
		// @7F1: aload_3
		// @7F2: bipush 8 (0x08)
		// @7F4: invokevirtual game.C_100054_ec.func_101479_c(byte)void
		// @7F7: getstatic game.C_100202_qi game.C_100083_c.field_103168_Q
		// @7FA: bipush 103 (0x67)
		// @7FC: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @7FF: checkcast game.C_100054_ec
		// @802: astore_3
		// @803: iload #11
		// @805: ifne @815
		// @808: iload #11
		// @80A: ifeq @7E6
		// @80D: goto @811
		// @810: athrow
		// @811: iconst_0
		// @812: putstatic int game.C_100044_vm.field_100946_r
		// @815: iload #11
		// @817: ifeq @884
		// @81A: aload_1
		// @81B: sipush -16142 (0xC0F2)
		// @81E: invokevirtual game.C_100280_nf.func_101161_i(int)long
		// @821: lstore_3
		// @822: aload_1
		// @823: iconst_0
		// @824: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @827: istore #5
		// @829: iconst_0
		// @82A: lload_3
		// @82B: invokestatic game.C_100107_u.func_104768_a(int, long)game.C_100054_ec
		// @82E: astore #6
		// @830: aconst_null
		// @831: aload #6
		// @833: if_acmpne @83A
		// @836: goto @884
		// @839: athrow
		// @83A: aload #6
		// @83C: getfield boolean game.C_100054_ec.field_101961_jc
		// @83F: ifeq @854
		// @842: getstatic int game.C_100044_vm.field_100946_r
		// @845: iconst_1
		// @846: isub
		// @847: putstatic int game.C_100044_vm.field_100946_r
		// @84A: aload #6
		// @84C: iconst_0
		// @84D: putfield boolean game.C_100054_ec.field_101961_jc
		// @850: goto @854
		// @853: athrow
		// @854: iconst_0
		// @855: iload #5
		// @857: if_icmpeq @872
		// @85A: aload #6
		// @85C: iload #5
		// @85E: putfield int game.C_100054_ec.field_101954_Zb
		// @861: aload #6
		// @863: getstatic int game.C_100055_ed.field_104241_d
		// @866: putfield int game.C_100054_ec.field_101962_ic
		// @869: iload #11
		// @86B: ifeq @87D
		// @86E: goto @872
		// @871: athrow
		// @872: aload #6
		// @874: bipush 45 (0x2D)
		// @876: invokevirtual game.C_100054_ec.func_100583_c(int)void
		// @879: goto @87D
		// @87C: athrow
		// @87D: aload #6
		// @87F: bipush 8 (0x08)
		// @881: invokevirtual game.C_100054_ec.func_101479_c(byte)void
		// @884: goto @8A8
		// @887: astore_1
		// @888: aload_1
		// @889: new java.lang.StringBuilder
		// @88C: dup
		// @88D: invokespecial java.lang.StringBuilder.<init>()void
		// @890: getstatic java.lang.String[] game.C_100016_wi.field_103807_z
		// @893: iconst_1
		// @894: aaload
		// @895: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @898: iload_0
		// @899: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @89C: bipush 41 (0x29)
		// @89E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8A1: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @8A4: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @8A7: athrow
		// @8A8: return
	}
	
	public static void func_103797_b(int arg0)
	{
		// @00: iload_0
		// @01: sipush -12338 (0xCFCE)
		// @04: if_icmpeq @10
		// @07: bipush 37 (0x25)
		// @09: invokestatic game.C_100016_wi.func_103797_b(int)void
		// @0C: goto @10
		// @0F: athrow
		// @10: aconst_null
		// @11: putstatic int[] game.C_100016_wi.field_103804_b
		// @14: aconst_null
		// @15: putstatic java.lang.String game.C_100016_wi.field_103803_e
		// @18: aconst_null
		// @19: putstatic java.lang.String game.C_100016_wi.field_103805_c
		// @1C: goto @40
		// @1F: astore_1
		// @20: aload_1
		// @21: new java.lang.StringBuilder
		// @24: dup
		// @25: invokespecial java.lang.StringBuilder.<init>()void
		// @28: getstatic java.lang.String[] game.C_100016_wi.field_103807_z
		// @2B: iconst_3
		// @2C: aaload
		// @2D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @30: iload_0
		// @31: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @34: bipush 41 (0x29)
		// @36: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @39: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3F: athrow
		// @40: return
	}
	
	static final boolean func_103796_a(int arg0, byte arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #5
		// @05: bipush -78 (0xB2)
		// @07: invokestatic game.C_100100_i.func_102004_l(int)boolean
		// @0A: ifne @1E
		// @0D: iconst_1
		// @0E: sipush -11145 (0xD477)
		// @11: iload_0
		// @12: invokestatic game.C_100080_b.func_104421_a(boolean, int, int)boolean
		// @15: ifeq @1E
		// @18: goto @1C
		// @1B: athrow
		// @1C: iconst_0
		// @1D: ireturn
		// @1E: iload_0
		// @1F: getstatic int[] game.C_100075_uj.field_100655_u
		// @22: bipush -111 (0x91)
		// @24: invokestatic game.C_100097_k.func_104572_a(int, int[], int)boolean
		// @27: ifne @2E
		// @2A: goto @30
		// @2D: athrow
		// @2E: iconst_1
		// @2F: ireturn
		// @30: iload_1
		// @31: bipush -127 (0x81)
		// @33: if_icmplt @3F
		// @36: bipush -69 (0xBB)
		// @38: invokestatic game.C_100016_wi.func_103797_b(int)void
		// @3B: goto @3F
		// @3E: athrow
		// @3F: getstatic int[] game.C_100132_td.field_104986_p
		// @42: astore_2
		// @43: iconst_0
		// @44: istore_3
		// @45: iload_3
		// @46: iconst_m1
		// @47: ixor
		// @48: aload_2
		// @49: arraylength
		// @4A: iconst_m1
		// @4B: ixor
		// @4C: if_icmple @6D
		// @4F: aload_2
		// @50: iload_3
		// @51: iaload
		// @52: istore #4
		// @54: iload_0
		// @55: iload #5
		// @57: ifne @6E
		// @5A: iload #4
		// @5C: if_icmpne @65
		// @5F: goto @63
		// @62: athrow
		// @63: iconst_1
		// @64: ireturn
		// @65: iinc #3 +1
		// @68: iload #5
		// @6A: ifeq @45
		// @6D: iconst_0
		// @6E: ireturn
		// @6F: astore_2
		// @70: aload_2
		// @71: new java.lang.StringBuilder
		// @74: dup
		// @75: invokespecial java.lang.StringBuilder.<init>()void
		// @78: getstatic java.lang.String[] game.C_100016_wi.field_103807_z
		// @7B: iconst_0
		// @7C: aaload
		// @7D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @80: iload_0
		// @81: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @84: bipush 44 (0x2C)
		// @86: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @89: iload_1
		// @8A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8D: bipush 41 (0x29)
		// @8F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @92: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @95: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @98: athrow
	}
	
	static final void func_103801_a(int arg0, C_100292_jk arg1, int arg2)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #6
		// @005: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @008: astore_3
		// @009: aload_3
		// @00A: iload_2
		// @00B: bipush 106 (0x6A)
		// @00D: invokevirtual game.C_100278_nd.func_101189_h(int, int)void
		// @010: aload_3
		// @011: dup
		// @012: getfield int game.C_100278_nd.field_101177_n
		// @015: iconst_1
		// @016: iadd
		// @017: putfield int game.C_100278_nd.field_101177_n
		// @01A: aload_3
		// @01B: getfield int game.C_100278_nd.field_101177_n
		// @01E: istore #4
		// @020: aload_3
		// @021: sipush 7838 (0x1E9E)
		// @024: iconst_1
		// @025: invokevirtual game.C_100278_nd.func_101169_f(int, int)void
		// @028: aload_3
		// @029: aload_1
		// @02A: getfield int game.C_100292_jk.field_101217_p
		// @02D: bipush 109 (0x6D)
		// @02F: invokevirtual game.C_100278_nd.func_101141_d(int, byte)void
		// @032: aload_3
		// @033: aload_1
		// @034: getfield int game.C_100292_jk.field_101222_j
		// @037: bipush -104 (0x98)
		// @039: invokevirtual game.C_100278_nd.func_101141_d(int, byte)void
		// @03C: aload_3
		// @03D: aload_1
		// @03E: getfield int game.C_100292_jk.field_101213_t
		// @041: bipush -127 (0x81)
		// @043: invokevirtual game.C_100278_nd.func_101141_d(int, byte)void
		// @046: iload_0
		// @047: bipush 16 (0x10)
		// @049: if_icmpge @055
		// @04C: bipush -117 (0x8B)
		// @04E: invokestatic game.C_100016_wi.func_103797_b(int)void
		// @051: goto @055
		// @054: athrow
		// @055: aload_3
		// @056: aload_1
		// @057: getfield int game.C_100292_jk.field_101220_l
		// @05A: bipush 80 (0x50)
		// @05C: invokevirtual game.C_100278_nd.func_101154_d(int, int)void
		// @05F: aload_3
		// @060: aload_1
		// @061: getfield int game.C_100292_jk.field_101219_o
		// @064: bipush 83 (0x53)
		// @066: invokevirtual game.C_100278_nd.func_101154_d(int, int)void
		// @069: aload_3
		// @06A: aload_1
		// @06B: getfield int game.C_100292_jk.field_101214_s
		// @06E: bipush 81 (0x51)
		// @070: invokevirtual game.C_100278_nd.func_101154_d(int, int)void
		// @073: aload_3
		// @074: aload_1
		// @075: getfield int game.C_100292_jk.field_101221_m
		// @078: bipush -120 (0x88)
		// @07A: invokevirtual game.C_100278_nd.func_101154_d(int, int)void
		// @07D: aload_3
		// @07E: sipush 7838 (0x1E9E)
		// @081: aload_1
		// @082: getfield int[] game.C_100292_jk.field_101224_k
		// @085: arraylength
		// @086: invokevirtual game.C_100278_nd.func_101169_f(int, int)void
		// @089: iconst_0
		// @08A: istore #5
		// @08C: aload_1
		// @08D: getfield int[] game.C_100292_jk.field_101224_k
		// @090: arraylength
		// @091: iconst_m1
		// @092: ixor
		// @093: iload #5
		// @095: iconst_m1
		// @096: ixor
		// @097: if_icmpge @0B8
		// @09A: aload_3
		// @09B: aload_1
		// @09C: getfield int[] game.C_100292_jk.field_101224_k
		// @09F: iload #5
		// @0A1: iaload
		// @0A2: bipush 108 (0x6C)
		// @0A4: invokevirtual game.C_100278_nd.func_101154_d(int, int)void
		// @0A7: iinc #5 +1
		// @0AA: iload #6
		// @0AC: ifne @0D0
		// @0AF: iload #6
		// @0B1: ifeq @08C
		// @0B4: goto @0B8
		// @0B7: athrow
		// @0B8: aload_3
		// @0B9: iload #4
		// @0BB: sipush -16384 (0xC000)
		// @0BE: invokevirtual game.C_100278_nd.func_101157_b(int, int)int
		// @0C1: pop
		// @0C2: aload_3
		// @0C3: aload_3
		// @0C4: getfield int game.C_100278_nd.field_101177_n
		// @0C7: iload #4
		// @0C9: ineg
		// @0CA: iadd
		// @0CB: bipush -86 (0xAA)
		// @0CD: invokevirtual game.C_100278_nd.func_101139_c(int, byte)void
		// @0D0: goto @118
		// @0D3: astore_3
		// @0D4: aload_3
		// @0D5: new java.lang.StringBuilder
		// @0D8: dup
		// @0D9: invokespecial java.lang.StringBuilder.<init>()void
		// @0DC: getstatic java.lang.String[] game.C_100016_wi.field_103807_z
		// @0DF: iconst_5
		// @0E0: aaload
		// @0E1: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0E4: iload_0
		// @0E5: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0E8: bipush 44 (0x2C)
		// @0EA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0ED: aload_1
		// @0EE: ifnull @0FA
		// @0F1: getstatic java.lang.String[] game.C_100016_wi.field_103807_z
		// @0F4: iconst_4
		// @0F5: aaload
		// @0F6: goto @100
		// @0F9: athrow
		// @0FA: getstatic java.lang.String[] game.C_100016_wi.field_103807_z
		// @0FD: bipush 6 (0x06)
		// @0FF: aaload
		// @100: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @103: bipush 44 (0x2C)
		// @105: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @108: iload_2
		// @109: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @10C: bipush 41 (0x29)
		// @10E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @111: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @114: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @117: athrow
		// @118: return
	}
	
	static
	{
		// @000: bipush 7 (0x07)
		// @002: anewarray java.lang.String
		// @005: dup
		// @006: iconst_0
		// @007: ldc "qf\u0005q#"
		// @009: invokestatic game.C_100016_wi.func_103800_z(java.lang.String)char[]
		// @00C: invokestatic game.C_100016_wi.func_103799_z(char[])java.lang.String
		// @00F: aastore
		// @010: dup
		// @011: iconst_1
		// @012: ldc "qf\u0005s#"
		// @014: invokestatic game.C_100016_wi.func_103800_z(java.lang.String)char[]
		// @017: invokestatic game.C_100016_wi.func_103799_z(char[])java.lang.String
		// @01A: aastore
		// @01B: dup
		// @01C: iconst_2
		// @01D: ldc "J>\u0011\u0012"
		// @01F: invokestatic game.C_100016_wi.func_103800_z(java.lang.String)char[]
		// @022: invokestatic game.C_100016_wi.func_103799_z(char[])java.lang.String
		// @025: aastore
		// @026: dup
		// @027: iconst_3
		// @028: ldc "qf\u0005p#"
		// @02A: invokestatic game.C_100016_wi.func_103800_z(java.lang.String)char[]
		// @02D: invokestatic game.C_100016_wi.func_103799_z(char[])java.lang.String
		// @030: aastore
		// @031: dup
		// @032: iconst_4
		// @033: ldc "}!\u0005\u001cv"
		// @035: invokestatic game.C_100016_wi.func_103800_z(java.lang.String)char[]
		// @038: invokestatic game.C_100016_wi.func_103799_z(char[])java.lang.String
		// @03B: aastore
		// @03C: dup
		// @03D: iconst_5
		// @03E: ldc "qf\u0005v#"
		// @040: invokestatic game.C_100016_wi.func_103800_z(java.lang.String)char[]
		// @043: invokestatic game.C_100016_wi.func_103799_z(char[])java.lang.String
		// @046: aastore
		// @047: dup
		// @048: bipush 6 (0x06)
		// @04A: ldc "hzG^"
		// @04C: invokestatic game.C_100016_wi.func_103800_z(java.lang.String)char[]
		// @04F: invokestatic game.C_100016_wi.func_103799_z(char[])java.lang.String
		// @052: aastore
		// @053: putstatic java.lang.String[] game.C_100016_wi.field_103807_z
		// @056: ldc "E`EFyic\u000b]{rfD\\x"
		// @058: invokestatic game.C_100016_wi.func_103800_z(java.lang.String)char[]
		// @05B: invokestatic game.C_100016_wi.func_103799_z(char[])java.lang.String
		// @05E: putstatic java.lang.String game.C_100016_wi.field_103803_e
		// @061: bipush 26 (0x1A)
		// @063: newarray int[]
		// @065: dup
		// @066: iconst_0
		// @067: bipush 55 (0x37)
		// @069: iastore
		// @06A: dup
		// @06B: iconst_1
		// @06C: bipush 53 (0x35)
		// @06E: iastore
		// @06F: dup
		// @070: iconst_2
		// @071: bipush 24 (0x18)
		// @073: iastore
		// @074: dup
		// @075: iconst_3
		// @076: bipush 24 (0x18)
		// @078: iastore
		// @079: dup
		// @07A: iconst_4
		// @07B: bipush 24 (0x18)
		// @07D: iastore
		// @07E: dup
		// @07F: iconst_5
		// @080: bipush 24 (0x18)
		// @082: iastore
		// @083: dup
		// @084: bipush 6 (0x06)
		// @086: bipush 54 (0x36)
		// @088: iastore
		// @089: dup
		// @08A: bipush 7 (0x07)
		// @08C: bipush 83 (0x53)
		// @08E: iastore
		// @08F: dup
		// @090: bipush 8 (0x08)
		// @092: bipush 24 (0x18)
		// @094: iastore
		// @095: dup
		// @096: bipush 9 (0x09)
		// @098: bipush 24 (0x18)
		// @09A: iastore
		// @09B: dup
		// @09C: bipush 10 (0x0A)
		// @09E: bipush 56 (0x38)
		// @0A0: iastore
		// @0A1: dup
		// @0A2: bipush 11 (0x0B)
		// @0A4: bipush 83 (0x53)
		// @0A6: iastore
		// @0A7: dup
		// @0A8: bipush 12 (0x0C)
		// @0AA: bipush 24 (0x18)
		// @0AC: iastore
		// @0AD: dup
		// @0AE: bipush 13 (0x0D)
		// @0B0: bipush 24 (0x18)
		// @0B2: iastore
		// @0B3: dup
		// @0B4: bipush 14 (0x0E)
		// @0B6: bipush 83 (0x53)
		// @0B8: iastore
		// @0B9: dup
		// @0BA: bipush 15 (0x0F)
		// @0BC: bipush 24 (0x18)
		// @0BE: iastore
		// @0BF: dup
		// @0C0: bipush 16 (0x10)
		// @0C2: bipush 24 (0x18)
		// @0C4: iastore
		// @0C5: dup
		// @0C6: bipush 17 (0x11)
		// @0C8: bipush 97 (0x61)
		// @0CA: iastore
		// @0CB: dup
		// @0CC: bipush 18 (0x12)
		// @0CE: bipush 35 (0x23)
		// @0D0: iastore
		// @0D1: dup
		// @0D2: bipush 19 (0x13)
		// @0D4: iconst_m1
		// @0D5: iastore
		// @0D6: dup
		// @0D7: bipush 20 (0x14)
		// @0D9: iconst_m1
		// @0DA: iastore
		// @0DB: dup
		// @0DC: bipush 21 (0x15)
		// @0DE: iconst_m1
		// @0DF: iastore
		// @0E0: dup
		// @0E1: bipush 22 (0x16)
		// @0E3: iconst_m1
		// @0E4: iastore
		// @0E5: dup
		// @0E6: bipush 23 (0x17)
		// @0E8: iconst_m1
		// @0E9: iastore
		// @0EA: dup
		// @0EB: bipush 24 (0x18)
		// @0ED: iconst_m1
		// @0EE: iastore
		// @0EF: dup
		// @0F0: bipush 25 (0x19)
		// @0F2: iconst_m1
		// @0F3: iastore
		// @0F4: putstatic int[] game.C_100016_wi.field_103804_b
		// @0F7: ldc "_`^\u0012cgyN\\,r/N\\dshC\u0012xicJ@brj\u000bQ~djX\u0012\u007fi/N\\loaNWy&{CW+:*\u001b\u000c+g{\u000bFco|\u000bFbkj\u0005\u000eit1nSyh/F]yc/X]gg}BFn&l^Pnu/IK+vcJKbhh\u000b`jrjO\u0012lgbNA%"
		// @0F9: invokestatic game.C_100016_wi.func_103800_z(java.lang.String)char[]
		// @0FC: invokestatic game.C_100016_wi.func_103799_z(char[])java.lang.String
		// @0FF: putstatic java.lang.String game.C_100016_wi.field_103805_c
		// @102: return
	}
	
	private static char[] func_103800_z(String arg0)
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
	
	private static String func_103799_z(char[] arg0)
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
		// @30: bipush 6 (0x06)
		// @32: goto @46
		// @35: bipush 15 (0x0F)
		// @37: goto @46
		// @3A: bipush 43 (0x2B)
		// @3C: goto @46
		// @3F: bipush 50 (0x32)
		// @41: goto @46
		// @44: bipush 11 (0x0B)
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
