package game;

final class C_100284_nj
{
	static int field_106770_b;
	static C_100037_wb field_106769_d;
	static boolean field_106772_a;
	static int field_106771_c;
	private static final String[] field_106773_z;
	
	static final void func_106763_a(int arg0, C_100302_ka arg1)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #12
		// @005: new game.C_100302_ka
		// @008: dup
		// @009: invokespecial game.C_100302_ka.<init>()void
		// @00C: astore_2
		// @00D: aload_2
		// @00E: getstatic game.C_100037_wb[] game.C_100167_sj.field_100796_r
		// @011: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @014: aload_2
		// @015: iconst_4
		// @016: putfield int game.C_100302_ka.field_101829_Db
		// @019: aload_2
		// @01A: iconst_0
		// @01B: putfield int game.C_100302_ka.field_101830_gb
		// @01E: aload_2
		// @01F: iconst_1
		// @020: putfield int game.C_100302_ka.field_101850_Fb
		// @023: aload_2
		// @024: bipush 15 (0x0F)
		// @026: putfield int game.C_100302_ka.field_101833_ob
		// @029: iload_0
		// @02A: ldc 1021128 (0xf94c8)
		// @02C: if_icmpeq @030
		// @02F: return
		// @030: aload_2
		// @031: getstatic game.C_100317_lb game.C_100311_le.field_104719_A
		// @034: putfield game.C_100112_r game.C_100302_ka.field_101845_sb
		// @037: aload_2
		// @038: iconst_0
		// @039: putfield int game.C_100302_ka.field_101858_J
		// @03C: iconst_0
		// @03D: istore_3
		// @03E: bipush 20 (0x14)
		// @040: istore #4
		// @042: aload_1
		// @043: getfield game.C_100202_qi game.C_100302_ka.field_101891_Ob
		// @046: ifnull @056
		// @049: aload_1
		// @04A: getfield game.C_100202_qi game.C_100302_ka.field_101891_Ob
		// @04D: bipush -100 (0x9C)
		// @04F: invokevirtual game.C_100202_qi.func_105905_b(byte)void
		// @052: goto @056
		// @055: athrow
		// @056: new game.C_100302_ka
		// @059: dup
		// @05A: ldc ""
		// @05C: aload_2
		// @05D: invokespecial game.C_100302_ka.<init>(java.lang.String, game.C_100302_ka)void
		// @060: astore #5
		// @062: aload #5
		// @064: getstatic java.lang.String game.C_100225_ah.field_106123_b
		// @067: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @06A: aload #5
		// @06C: iconst_0
		// @06D: bipush 18 (0x12)
		// @06F: iconst_m1
		// @070: iconst_0
		// @071: bipush 110 (0x6E)
		// @073: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @076: aload_1
		// @077: bipush -83 (0xAD)
		// @079: aload #5
		// @07B: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @07E: getstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @081: sipush -3099 (0xF3E5)
		// @084: invokevirtual game.C_100327_ib.func_102460_q(int)int
		// @087: istore #6
		// @089: new game.C_100302_ka
		// @08C: dup
		// @08D: ldc2_w -1
		// @090: aconst_null
		// @091: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @094: astore #7
		// @096: aload #7
		// @098: getstatic game.C_100037_wb[] game.C_100200_ba.field_105851_b
		// @09B: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @09E: bipush 51 (0x33)
		// @0A0: iload #6
		// @0A2: iconst_m1
		// @0A3: isub
		// @0A4: iconst_2
		// @0A5: idiv
		// @0A6: imul
		// @0A7: bipush 32 (0x20)
		// @0A9: iadd
		// @0AA: istore #8
		// @0AC: aload #7
		// @0AE: iconst_0
		// @0AF: iload #8
		// @0B1: iload_0
		// @0B2: ldc -1021129 (0xfff06b37)
		// @0B4: iadd
		// @0B5: iload #4
		// @0B7: bipush 110 (0x6E)
		// @0B9: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @0BC: aload_1
		// @0BD: bipush -117 (0x8B)
		// @0BF: aload #7
		// @0C1: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @0C4: iinc #4 +3
		// @0C7: new game.C_100302_ka
		// @0CA: dup
		// @0CB: ldc ""
		// @0CD: getstatic game.C_100302_ka game.C_100132_td.field_104976_a
		// @0D0: invokespecial game.C_100302_ka.<init>(java.lang.String, game.C_100302_ka)void
		// @0D3: astore #9
		// @0D5: iconst_0
		// @0D6: istore #10
		// @0D8: iconst_0
		// @0D9: istore #11
		// @0DB: iload #11
		// @0DD: iload #6
		// @0DF: if_icmpge @10E
		// @0E2: getstatic int[] game.C_100132_td.field_104986_p
		// @0E5: iload #11
		// @0E7: iaload
		// @0E8: getstatic int[] game.C_100301_kb.field_107089_g
		// @0EB: iload #11
		// @0ED: iaload
		// @0EE: iload #12
		// @0F0: ifne @177
		// @0F3: if_icmpeq @102
		// @0F6: goto @0FA
		// @0F9: athrow
		// @0FA: iconst_1
		// @0FB: istore #10
		// @0FD: iload #12
		// @0FF: ifeq @10E
		// @102: iinc #11 +1
		// @105: iload #12
		// @107: ifeq @0DB
		// @10A: goto @10E
		// @10D: athrow
		// @10E: aload #9
		// @110: iload #10
		// @112: ifne @11C
		// @115: getstatic java.lang.String game.C_100260_mc.field_102231_rc
		// @118: goto @11F
		// @11B: athrow
		// @11C: getstatic java.lang.String game.C_100092_um.field_104537_k
		// @11F: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @122: iload #10
		// @124: ifne @133
		// @127: aload #9
		// @129: getstatic game.C_100037_wb[] game.C_100321_hi.field_107228_h
		// @12C: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @12F: goto @133
		// @132: athrow
		// @133: aload #9
		// @135: iload #10
		// @137: ifne @140
		// @13A: ldc 9211020 (0x8c8c8c)
		// @13C: goto @142
		// @13F: athrow
		// @140: ldc 1021128 (0xf94c8)
		// @142: putfield int game.C_100302_ka.field_101830_gb
		// @145: aload #9
		// @147: iconst_3
		// @148: bipush 18 (0x12)
		// @14A: iload_0
		// @14B: ldc -1021129 (0xfff06b37)
		// @14D: iadd
		// @14E: iload #4
		// @150: bipush 104 (0x68)
		// @152: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @155: aload #9
		// @157: iconst_1
		// @158: putfield int game.C_100302_ka.field_101850_Fb
		// @15B: aload_1
		// @15C: bipush -113 (0x8F)
		// @15E: aload #9
		// @160: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @163: iload #10
		// @165: ifeq @1C9
		// @168: getstatic int game.C_100015_wh.field_103781_g
		// @16B: iconst_m1
		// @16C: ixor
		// @16D: aload_1
		// @16E: getfield int game.C_100302_ka.field_101840_Eb
		// @171: iconst_m1
		// @172: ixor
		// @173: goto @177
		// @176: athrow
		// @177: if_icmpgt @1C9
		// @17A: getstatic int game.C_100015_wh.field_103781_g
		// @17D: iconst_m1
		// @17E: ixor
		// @17F: bipush 110 (0x6E)
		// @181: aload_1
		// @182: getfield int game.C_100302_ka.field_101840_Eb
		// @185: iadd
		// @186: iconst_m1
		// @187: ixor
		// @188: if_icmple @1C9
		// @18B: goto @18F
		// @18E: athrow
		// @18F: aload_1
		// @190: getfield int game.C_100302_ka.field_101835_xb
		// @193: iload #4
		// @195: iadd
		// @196: iconst_m1
		// @197: ixor
		// @198: getstatic int game.C_100338_jc.field_105370_l
		// @19B: iconst_m1
		// @19C: ixor
		// @19D: if_icmplt @1C9
		// @1A0: goto @1A4
		// @1A3: athrow
		// @1A4: aload_1
		// @1A5: getfield int game.C_100302_ka.field_101835_xb
		// @1A8: iload #4
		// @1AA: iadd
		// @1AB: bipush -18 (0xEE)
		// @1AD: isub
		// @1AE: getstatic int game.C_100338_jc.field_105370_l
		// @1B1: if_icmple @1C9
		// @1B4: goto @1B8
		// @1B7: athrow
		// @1B8: aload #9
		// @1BA: getstatic game.C_100037_wb[] game.C_100200_ba.field_105851_b
		// @1BD: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @1C0: bipush -2 (0xFE)
		// @1C2: putstatic int game.C_100017_wj.field_103815_g
		// @1C5: goto @1C9
		// @1C8: athrow
		// @1C9: iinc #4 +22
		// @1CC: iinc #4 +4
		// @1CF: bipush 6 (0x06)
		// @1D1: istore_3
		// @1D2: iconst_0
		// @1D3: istore #9
		// @1D5: iload #9
		// @1D7: iload #6
		// @1D9: if_icmpge @313
		// @1DC: iload #12
		// @1DE: ifne @351
		// @1E1: bipush -2 (0xFE)
		// @1E3: iload #9
		// @1E5: iconst_m1
		// @1E6: ixor
		// @1E7: if_icmpeq @1EE
		// @1EA: goto @1EE
		// @1ED: athrow
		// @1EE: new game.C_100302_ka
		// @1F1: dup
		// @1F2: ldc ""
		// @1F4: getstatic game.C_100302_ka game.C_100132_td.field_104976_a
		// @1F7: invokespecial game.C_100302_ka.<init>(java.lang.String, game.C_100302_ka)void
		// @1FA: astore #10
		// @1FC: aload #10
		// @1FE: iload_3
		// @1FF: bipush 47 (0x2F)
		// @201: iconst_m1
		// @202: iload #4
		// @204: bipush 47 (0x2F)
		// @206: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @209: aload_1
		// @20A: iload_0
		// @20B: ldc -1021223 (0xfff06ad9)
		// @20D: iadd
		// @20E: aload #10
		// @210: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @213: getstatic int game.C_100015_wh.field_103781_g
		// @216: iconst_m1
		// @217: ixor
		// @218: aload_1
		// @219: getfield int game.C_100302_ka.field_101840_Eb
		// @21C: iload_3
		// @21D: iadd
		// @21E: iconst_m1
		// @21F: ixor
		// @220: if_icmpgt @275
		// @223: getstatic int game.C_100015_wh.field_103781_g
		// @226: bipush 47 (0x2F)
		// @228: iload_3
		// @229: iadd
		// @22A: aload_1
		// @22B: getfield int game.C_100302_ka.field_101840_Eb
		// @22E: iadd
		// @22F: if_icmpge @275
		// @232: goto @236
		// @235: athrow
		// @236: iload #4
		// @238: aload_1
		// @239: getfield int game.C_100302_ka.field_101835_xb
		// @23C: iadd
		// @23D: iconst_m1
		// @23E: ixor
		// @23F: getstatic int game.C_100338_jc.field_105370_l
		// @242: iconst_m1
		// @243: ixor
		// @244: if_icmplt @275
		// @247: goto @24B
		// @24A: athrow
		// @24B: getstatic int game.C_100338_jc.field_105370_l
		// @24E: iload #4
		// @250: aload_1
		// @251: getfield int game.C_100302_ka.field_101835_xb
		// @254: iadd
		// @255: bipush -47 (0xD1)
		// @257: isub
		// @258: if_icmpge @275
		// @25B: goto @25F
		// @25E: athrow
		// @25F: iload #9
		// @261: putstatic int game.C_100017_wj.field_103815_g
		// @264: aload #10
		// @266: getstatic game.C_100037_wb[] game.C_100316_lc.field_102411_v
		// @269: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @26C: iload #12
		// @26E: ifeq @297
		// @271: goto @275
		// @274: athrow
		// @275: iconst_0
		// @276: getstatic int game.C_100174_sb.field_105609_b
		// @279: if_icmple @28F
		// @27C: goto @280
		// @27F: athrow
		// @280: iconst_0
		// @281: getstatic int game.C_100242_oh.field_106343_d
		// @284: if_icmple @28F
		// @287: goto @28B
		// @28A: athrow
		// @28B: goto @297
		// @28E: athrow
		// @28F: aload #10
		// @291: getstatic game.C_100037_wb[] game.C_100316_lc.field_102411_v
		// @294: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @297: getstatic int[] game.C_100301_kb.field_107089_g
		// @29A: iload #9
		// @29C: iaload
		// @29D: iconst_m1
		// @29E: if_icmpne @2A5
		// @2A1: goto @2F9
		// @2A4: athrow
		// @2A5: new game.C_100302_ka
		// @2A8: dup
		// @2A9: invokespecial game.C_100302_ka.<init>()void
		// @2AC: astore #10
		// @2AE: aload #10
		// @2B0: getstatic game.C_100153_be[] game.C_100242_oh.field_106347_a
		// @2B3: getstatic int[] game.C_100301_kb.field_107089_g
		// @2B6: iload #9
		// @2B8: iaload
		// @2B9: getstatic int[] game.C_100075_uj.field_100655_u
		// @2BC: iload_0
		// @2BD: ldc -1021103 (0xfff06b51)
		// @2BF: ixor
		// @2C0: invokestatic game.C_100097_k.func_104572_a(int, int[], int)boolean
		// @2C3: ifne @2D3
		// @2C6: getstatic int[] game.C_100301_kb.field_107089_g
		// @2C9: iload #9
		// @2CB: iaload
		// @2CC: bipush 64 (0x40)
		// @2CE: iadd
		// @2CF: goto @2D9
		// @2D2: athrow
		// @2D3: getstatic int[] game.C_100301_kb.field_107089_g
		// @2D6: iload #9
		// @2D8: iaload
		// @2D9: aaload
		// @2DA: invokevirtual game.C_100153_be.func_105309_b()game.C_100037_wb
		// @2DD: putfield game.C_100037_wb game.C_100302_ka.field_101887_nb
		// @2E0: aload #10
		// @2E2: iconst_3
		// @2E3: iload_3
		// @2E4: iadd
		// @2E5: bipush 40 (0x28)
		// @2E7: iconst_m1
		// @2E8: iconst_3
		// @2E9: iload #4
		// @2EB: iadd
		// @2EC: bipush 40 (0x28)
		// @2EE: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @2F1: aload_1
		// @2F2: bipush -110 (0x92)
		// @2F4: aload #10
		// @2F6: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @2F9: bipush 63 (0x3F)
		// @2FB: iload_3
		// @2FC: isub
		// @2FD: istore_3
		// @2FE: iload_3
		// @2FF: bipush 6 (0x06)
		// @301: if_icmpeq @308
		// @304: goto @30B
		// @307: athrow
		// @308: iinc #4 +51
		// @30B: iinc #9 +1
		// @30E: iload #12
		// @310: ifeq @1D5
		// @313: goto @351
		// @316: astore_2
		// @317: aload_2
		// @318: new java.lang.StringBuilder
		// @31B: dup
		// @31C: invokespecial java.lang.StringBuilder.<init>()void
		// @31F: getstatic java.lang.String[] game.C_100284_nj.field_106773_z
		// @322: iconst_3
		// @323: aaload
		// @324: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @327: iload_0
		// @328: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @32B: bipush 44 (0x2C)
		// @32D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @330: aload_1
		// @331: ifnull @33D
		// @334: getstatic java.lang.String[] game.C_100284_nj.field_106773_z
		// @337: iconst_1
		// @338: aaload
		// @339: goto @342
		// @33C: athrow
		// @33D: getstatic java.lang.String[] game.C_100284_nj.field_106773_z
		// @340: iconst_2
		// @341: aaload
		// @342: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @345: bipush 41 (0x29)
		// @347: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @34A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @34D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @350: athrow
		// @351: return
	}
	
	static final void func_106764_b(int arg0)
	{
		// @00: bipush 107 (0x6B)
		// @02: bipush 24 (0x18)
		// @04: iload_0
		// @05: isub
		// @06: bipush 50 (0x32)
		// @08: idiv
		// @09: irem
		// @0A: istore_1
		// @0B: getstatic game.C_100278_nd game.C_100288_jn.field_106839_f
		// @0E: sipush 9692 (0x25DC)
		// @11: invokevirtual game.C_100278_nd.func_101164_f(int)java.lang.String
		// @14: putstatic java.lang.String game.C_100339_jb.field_107391_h
		// @17: bipush -112 (0x90)
		// @19: getstatic java.lang.String game.C_100339_jb.field_107391_h
		// @1C: invokestatic game.C_100106_ef.func_104742_a(byte, java.lang.CharSequence)java.lang.String
		// @1F: putstatic java.lang.String game.C_100285_nk.field_106782_e
		// @22: goto @46
		// @25: astore_1
		// @26: aload_1
		// @27: new java.lang.StringBuilder
		// @2A: dup
		// @2B: invokespecial java.lang.StringBuilder.<init>()void
		// @2E: getstatic java.lang.String[] game.C_100284_nj.field_106773_z
		// @31: iconst_5
		// @32: aaload
		// @33: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @36: iload_0
		// @37: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3A: bipush 41 (0x29)
		// @3C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @42: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @45: athrow
		// @46: return
	}
	
	public static void func_106765_a(int arg0)
	{
		// @00: iload_0
		// @01: bipush 15 (0x0F)
		// @03: if_icmpeq @0F
		// @06: bipush 74 (0x4A)
		// @08: putstatic int game.C_100284_nj.field_106770_b
		// @0B: goto @0F
		// @0E: athrow
		// @0F: aconst_null
		// @10: putstatic game.C_100037_wb game.C_100284_nj.field_106769_d
		// @13: goto @37
		// @16: astore_1
		// @17: aload_1
		// @18: new java.lang.StringBuilder
		// @1B: dup
		// @1C: invokespecial java.lang.StringBuilder.<init>()void
		// @1F: getstatic java.lang.String[] game.C_100284_nj.field_106773_z
		// @22: iconst_4
		// @23: aaload
		// @24: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @27: iload_0
		// @28: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2B: bipush 41 (0x29)
		// @2D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @30: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @33: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @36: athrow
		// @37: return
	}
	
	static final int func_106768_a(int arg0, int arg1)
	{
		// @00: iload_1
		// @01: sipush 8191 (0x1FFF)
		// @04: iand
		// @05: istore_1
		// @06: iload_0
		// @07: iconst_3
		// @08: if_icmpeq @17
		// @0B: bipush 39 (0x27)
		// @0D: bipush 110 (0x6E)
		// @0F: invokestatic game.C_100284_nj.func_106768_a(int, int)int
		// @12: pop
		// @13: goto @17
		// @16: athrow
		// @17: sipush 4096 (0x1000)
		// @1A: iload_1
		// @1B: if_icmple @3F
		// @1E: iload_1
		// @1F: iconst_m1
		// @20: ixor
		// @21: sipush -2049 (0xF7FF)
		// @24: if_icmple @34
		// @27: goto @2B
		// @2A: athrow
		// @2B: getstatic int[] game.C_100266_me.field_106653_c
		// @2E: iload_1
		// @2F: iaload
		// @30: goto @3E
		// @33: athrow
		// @34: getstatic int[] game.C_100266_me.field_106653_c
		// @37: iload_1
		// @38: ineg
		// @39: sipush 4096 (0x1000)
		// @3C: iadd
		// @3D: iaload
		// @3E: ireturn
		// @3F: sipush 6144 (0x1800)
		// @42: iload_1
		// @43: if_icmple @54
		// @46: getstatic int[] game.C_100266_me.field_106653_c
		// @49: sipush -4096 (0xF000)
		// @4C: iload_1
		// @4D: iadd
		// @4E: iaload
		// @4F: ineg
		// @50: goto @5F
		// @53: athrow
		// @54: getstatic int[] game.C_100266_me.field_106653_c
		// @57: iload_1
		// @58: ineg
		// @59: sipush 8192 (0x2000)
		// @5C: iadd
		// @5D: iaload
		// @5E: ineg
		// @5F: ireturn
		// @60: astore_2
		// @61: aload_2
		// @62: new java.lang.StringBuilder
		// @65: dup
		// @66: invokespecial java.lang.StringBuilder.<init>()void
		// @69: getstatic java.lang.String[] game.C_100284_nj.field_106773_z
		// @6C: iconst_0
		// @6D: aaload
		// @6E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @71: iload_0
		// @72: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @75: bipush 44 (0x2C)
		// @77: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7A: iload_1
		// @7B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7E: bipush 41 (0x29)
		// @80: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @83: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @86: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @89: athrow
	}
	
	static
	{
		// @00: bipush 6 (0x06)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "wy'h{"
		// @09: invokestatic game.C_100284_nj.func_106767_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100284_nj.func_106766_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "b='\u0007."
		// @14: invokestatic game.C_100284_nj.func_106767_z(java.lang.String)char[]
		// @17: invokestatic game.C_100284_nj.func_106766_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "wfeE"
		// @1F: invokestatic game.C_100284_nj.func_106767_z(java.lang.String)char[]
		// @22: invokestatic game.C_100284_nj.func_106766_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "wy'j{"
		// @2A: invokestatic game.C_100284_nj.func_106767_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100284_nj.func_106766_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "wy'k{"
		// @35: invokestatic game.C_100284_nj.func_106767_z(java.lang.String)char[]
		// @38: invokestatic game.C_100284_nj.func_106766_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "wy'm{"
		// @40: invokestatic game.C_100284_nj.func_106767_z(java.lang.String)char[]
		// @43: invokestatic game.C_100284_nj.func_106766_z(char[])java.lang.String
		// @46: aastore
		// @47: putstatic java.lang.String[] game.C_100284_nj.field_106773_z
		// @4A: return
	}
	
	private static char[] func_106767_z(String arg0)
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
		// @0E: bipush 83 (0x53)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_106766_z(char[] arg0)
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
		// @30: bipush 25 (0x19)
		// @32: goto @46
		// @35: bipush 19 (0x13)
		// @37: goto @46
		// @3A: bipush 9 (0x09)
		// @3C: goto @46
		// @3F: bipush 41 (0x29)
		// @41: goto @46
		// @44: bipush 83 (0x53)
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
