package game;

import java.util.zip.Inflater;

final class C_100028_ha
{
	static int[] field_103950_a;
	static String field_103945_g;
	static String field_103949_c;
	private Inflater field_103953_i;
	static String[] field_103948_b;
	static String field_103946_d;
	static boolean field_103947_e;
	static String field_103952_h;
	static C_100302_ka field_103944_f;
	private static final String[] field_103951_z;
	
	public C_100028_ha()
	{
		// @0: aload_0
		// @1: iconst_m1
		// @2: ldc 1000000 (0xf4240)
		// @4: ldc 1000000 (0xf4240)
		// @6: invokespecial game.C_100028_ha.<init>(int, int, int)void
		// @9: return
	}
	
	final void func_103939_a(byte[] arg0, C_100280_nf arg1, byte arg2)
	{
		// @00: aload_2
		// @01: getfield byte[] game.C_100280_nf.field_101179_l
		// @04: aload_2
		// @05: getfield int game.C_100280_nf.field_101177_n
		// @08: baload
		// @09: iconst_m1
		// @0A: ixor
		// @0B: bipush -32 (0xE0)
		// @0D: if_icmpne @2A
		// @10: bipush 116 (0x74)
		// @12: aload_2
		// @13: getfield byte[] game.C_100280_nf.field_101179_l
		// @16: aload_2
		// @17: getfield int game.C_100280_nf.field_101177_n
		// @1A: iconst_m1
		// @1B: isub
		// @1C: baload
		// @1D: iconst_m1
		// @1E: ixor
		// @1F: if_icmpne @2A
		// @22: goto @26
		// @25: athrow
		// @26: goto @34
		// @29: athrow
		// @2A: new java.lang.RuntimeException
		// @2D: dup
		// @2E: ldc ""
		// @30: invokespecial java.lang.RuntimeException.<init>(java.lang.String)void
		// @33: athrow
		// @34: aload_0
		// @35: getfield java.util.zip.Inflater game.C_100028_ha.field_103953_i
		// @38: ifnonnull @4B
		// @3B: aload_0
		// @3C: new java.util.zip.Inflater
		// @3F: dup
		// @40: iconst_1
		// @41: invokespecial java.util.zip.Inflater.<init>(boolean)void
		// @44: putfield java.util.zip.Inflater game.C_100028_ha.field_103953_i
		// @47: goto @4B
		// @4A: athrow
		// @4B: aload_0
		// @4C: getfield java.util.zip.Inflater game.C_100028_ha.field_103953_i
		// @4F: aload_2
		// @50: getfield byte[] game.C_100280_nf.field_101179_l
		// @53: bipush 10 (0x0A)
		// @55: aload_2
		// @56: getfield int game.C_100280_nf.field_101177_n
		// @59: iadd
		// @5A: aload_2
		// @5B: getfield byte[] game.C_100280_nf.field_101179_l
		// @5E: arraylength
		// @5F: aload_2
		// @60: getfield int game.C_100280_nf.field_101177_n
		// @63: bipush -10 (0xF6)
		// @65: isub
		// @66: bipush 8 (0x08)
		// @68: iadd
		// @69: isub
		// @6A: invokevirtual java.util.zip.Inflater.setInput(byte[], int, int)void
		// @6D: aload_0
		// @6E: getfield java.util.zip.Inflater game.C_100028_ha.field_103953_i
		// @71: aload_1
		// @72: invokevirtual java.util.zip.Inflater.inflate(byte[])int
		// @75: pop
		// @76: goto @8C
		// @79: astore #4
		// @7B: aload_0
		// @7C: getfield java.util.zip.Inflater game.C_100028_ha.field_103953_i
		// @7F: invokevirtual java.util.zip.Inflater.reset()void
		// @82: new java.lang.RuntimeException
		// @85: dup
		// @86: ldc ""
		// @88: invokespecial java.lang.RuntimeException.<init>(java.lang.String)void
		// @8B: athrow
		// @8C: aload_0
		// @8D: getfield java.util.zip.Inflater game.C_100028_ha.field_103953_i
		// @90: invokevirtual java.util.zip.Inflater.reset()void
		// @93: iload_3
		// @94: bipush 39 (0x27)
		// @96: if_icmpeq @A2
		// @99: bipush 127 (0x7F)
		// @9B: invokestatic game.C_100028_ha.func_103941_a(int)void
		// @9E: goto @A2
		// @A1: athrow
		// @A2: goto @FC
		// @A5: astore #4
		// @A7: aload #4
		// @A9: new java.lang.StringBuilder
		// @AC: dup
		// @AD: invokespecial java.lang.StringBuilder.<init>()void
		// @B0: getstatic java.lang.String[] game.C_100028_ha.field_103951_z
		// @B3: iconst_5
		// @B4: aaload
		// @B5: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @B8: aload_1
		// @B9: ifnull @C5
		// @BC: getstatic java.lang.String[] game.C_100028_ha.field_103951_z
		// @BF: iconst_1
		// @C0: aaload
		// @C1: goto @CA
		// @C4: athrow
		// @C5: getstatic java.lang.String[] game.C_100028_ha.field_103951_z
		// @C8: iconst_0
		// @C9: aaload
		// @CA: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @CD: bipush 44 (0x2C)
		// @CF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D2: aload_2
		// @D3: ifnull @DF
		// @D6: getstatic java.lang.String[] game.C_100028_ha.field_103951_z
		// @D9: iconst_1
		// @DA: aaload
		// @DB: goto @E4
		// @DE: athrow
		// @DF: getstatic java.lang.String[] game.C_100028_ha.field_103951_z
		// @E2: iconst_0
		// @E3: aaload
		// @E4: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @E7: bipush 44 (0x2C)
		// @E9: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @EC: iload_3
		// @ED: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @F0: bipush 41 (0x29)
		// @F2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @F5: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @F8: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @FB: athrow
		// @FC: return
	}
	
	static final int func_103938_a(int arg0, C_100302_ka arg1)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #19
		// @005: aconst_null
		// @006: aload_1
		// @007: getfield game.C_100202_qi game.C_100302_ka.field_101891_Ob
		// @00A: if_acmpeq @01A
		// @00D: aload_1
		// @00E: getfield game.C_100202_qi game.C_100302_ka.field_101891_Ob
		// @011: bipush 65 (0x41)
		// @013: invokevirtual game.C_100202_qi.func_105905_b(byte)void
		// @016: goto @01A
		// @019: athrow
		// @01A: iconst_0
		// @01B: istore_2
		// @01C: iload_0
		// @01D: iconst_4
		// @01E: if_icmpeq @02A
		// @021: bipush 43 (0x2B)
		// @023: invokestatic game.C_100028_ha.func_103941_a(int)void
		// @026: goto @02A
		// @029: athrow
		// @02A: bipush -4 (0xFC)
		// @02C: bipush 110 (0x6E)
		// @02E: getstatic int game.C_100055_ed.field_104242_e
		// @031: ineg
		// @032: iadd
		// @033: iadd
		// @034: istore_3
		// @035: iconst_0
		// @036: anewarray game.C_100049_vf
		// @039: astore #4
		// @03B: getstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @03E: getstatic int game.C_100200_ba.field_105852_c
		// @041: bipush -107 (0x95)
		// @043: aload #4
		// @045: invokevirtual game.C_100327_ib.func_102462_a(int, int, game.C_100049_vf[])game.C_100049_vf[]
		// @048: astore #4
		// @04A: iconst_1
		// @04B: istore #5
		// @04D: aload #4
		// @04F: arraylength
		// @050: iload #5
		// @052: if_icmple @08F
		// @055: iconst_m1
		// @056: aload #4
		// @058: iload #5
		// @05A: aaload
		// @05B: getfield int game.C_100049_vf.field_104203_a
		// @05E: iconst_2
		// @05F: iand
		// @060: iconst_m1
		// @061: ixor
		// @062: iload #19
		// @064: ifne @093
		// @067: if_icmpne @071
		// @06A: goto @06E
		// @06D: athrow
		// @06E: goto @087
		// @071: aload #4
		// @073: iconst_0
		// @074: aaload
		// @075: astore #6
		// @077: aload #4
		// @079: iconst_0
		// @07A: aload #4
		// @07C: iload #5
		// @07E: aaload
		// @07F: aastore
		// @080: aload #4
		// @082: iload #5
		// @084: aload #6
		// @086: aastore
		// @087: iinc #5 +1
		// @08A: iload #19
		// @08C: ifeq @04D
		// @08F: aload #4
		// @091: arraylength
		// @092: iconst_3
		// @093: if_icmpne @0C0
		// @096: iconst_0
		// @097: bipush 8 (0x08)
		// @099: aload #4
		// @09B: iconst_1
		// @09C: aaload
		// @09D: getfield int game.C_100049_vf.field_104203_a
		// @0A0: iand
		// @0A1: if_icmpne @0AC
		// @0A4: goto @0A8
		// @0A7: athrow
		// @0A8: goto @0C0
		// @0AB: athrow
		// @0AC: aload #4
		// @0AE: iconst_1
		// @0AF: aaload
		// @0B0: astore #5
		// @0B2: aload #4
		// @0B4: iconst_1
		// @0B5: aload #4
		// @0B7: iconst_2
		// @0B8: aaload
		// @0B9: aastore
		// @0BA: aload #4
		// @0BC: iconst_2
		// @0BD: aload #5
		// @0BF: aastore
		// @0C0: aload #4
		// @0C2: astore #5
		// @0C4: iconst_0
		// @0C5: istore #6
		// @0C7: aload #5
		// @0C9: arraylength
		// @0CA: iconst_m1
		// @0CB: ixor
		// @0CC: iload #6
		// @0CE: iconst_m1
		// @0CF: ixor
		// @0D0: if_icmpge @3BA
		// @0D3: aload #5
		// @0D5: iload #6
		// @0D7: aaload
		// @0D8: astore #7
		// @0DA: iinc #2 +4
		// @0DD: iconst_0
		// @0DE: iload #19
		// @0E0: ifne @3BB
		// @0E3: istore #8
		// @0E5: aconst_null
		// @0E6: getstatic game.C_100327_ib game.C_100197_ra.field_100861_k
		// @0E9: if_acmpeq @108
		// @0EC: iconst_0
		// @0ED: getstatic game.C_100327_ib game.C_100197_ra.field_100861_k
		// @0F0: getfield int game.C_100327_ib.field_102497_w
		// @0F3: aload #7
		// @0F5: getfield int game.C_100049_vf.field_104203_a
		// @0F8: iand
		// @0F9: if_icmpeq @13D
		// @0FC: goto @100
		// @0FF: athrow
		// @100: iconst_1
		// @101: istore #8
		// @103: iload #19
		// @105: ifeq @13D
		// @108: iconst_0
		// @109: getstatic int game.C_100242_oh.field_106343_d
		// @10C: if_icmple @117
		// @10F: goto @113
		// @112: athrow
		// @113: goto @13D
		// @116: athrow
		// @117: getstatic int game.C_100242_oh.field_106343_d
		// @11A: bipush 112 (0x70)
		// @11C: invokestatic game.C_100209_qb.func_102686_b(int, byte)game.C_100327_ib
		// @11F: astore #9
		// @121: aconst_null
		// @122: aload #9
		// @124: if_acmpeq @13D
		// @127: iconst_0
		// @128: aload #9
		// @12A: getfield int game.C_100327_ib.field_102497_w
		// @12D: aload #7
		// @12F: getfield int game.C_100049_vf.field_104203_a
		// @132: iand
		// @133: if_icmpeq @13D
		// @136: goto @13A
		// @139: athrow
		// @13A: iconst_1
		// @13B: istore #8
		// @13D: new game.C_100302_ka
		// @140: dup
		// @141: ldc2_w -1
		// @144: iload #8
		// @146: ifne @150
		// @149: getstatic game.C_100302_ka game.C_100132_td.field_104976_a
		// @14C: goto @153
		// @14F: athrow
		// @150: getstatic game.C_100302_ka game.C_100042_we.field_104131_r
		// @153: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @156: astore #9
		// @158: aload #9
		// @15A: iconst_4
		// @15B: bipush 78 (0x4E)
		// @15D: iconst_m1
		// @15E: iload_2
		// @15F: iload_3
		// @160: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @163: new game.C_100302_ka
		// @166: dup
		// @167: ldc2_w -1
		// @16A: aconst_null
		// @16B: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @16E: astore #10
		// @170: aload #10
		// @172: iconst_2
		// @173: putfield int game.C_100302_ka.field_101858_J
		// @176: aload #10
		// @178: iconst_1
		// @179: putfield int game.C_100302_ka.field_101850_Fb
		// @17C: aload #10
		// @17E: ldc 9211020 (0x8c8c8c)
		// @180: putfield int game.C_100302_ka.field_101830_gb
		// @183: aload #10
		// @185: getstatic game.C_100037_wb[] game.C_100321_hi.field_107228_h
		// @188: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @18B: aload #10
		// @18D: iconst_2
		// @18E: bipush 12 (0x0C)
		// @190: iconst_m1
		// @191: bipush 64 (0x40)
		// @193: bipush -4 (0xFC)
		// @195: iload_3
		// @196: iadd
		// @197: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @19A: aload #7
		// @19C: getfield int game.C_100049_vf.field_104203_a
		// @19F: istore #11
		// @1A1: getstatic game.C_100327_ib game.C_100254_pi.field_106459_h
		// @1A4: iconst_0
		// @1A5: aload #7
		// @1A7: invokevirtual game.C_100327_ib.func_102450_a(boolean, game.C_100049_vf)int
		// @1AA: istore #12
		// @1AC: aload #10
		// @1AE: getstatic game.C_100317_lb game.C_100311_le.field_104719_A
		// @1B1: putfield game.C_100112_r game.C_100302_ka.field_101845_sb
		// @1B4: aload #7
		// @1B6: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @1B9: astore #13
		// @1BB: aload #13
		// @1BD: ifnull @1E5
		// @1C0: aload #13
		// @1C2: getfield int game.C_100327_ib.field_102494_P
		// @1C5: iconst_m1
		// @1C6: ixor
		// @1C7: iload #12
		// @1C9: iconst_m1
		// @1CA: ixor
		// @1CB: if_icmpne @1D5
		// @1CE: goto @1D2
		// @1D1: athrow
		// @1D2: iconst_m1
		// @1D3: istore #12
		// @1D5: aload #10
		// @1D7: aload #13
		// @1D9: iconst_m1
		// @1DA: invokevirtual game.C_100327_ib.func_102474_m(int)java.lang.String
		// @1DD: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @1E0: iload #19
		// @1E2: ifeq @227
		// @1E5: iload #11
		// @1E7: iconst_2
		// @1E8: iand
		// @1E9: iconst_m1
		// @1EA: ixor
		// @1EB: iconst_m1
		// @1EC: if_icmplt @1F7
		// @1EF: goto @1F3
		// @1F2: athrow
		// @1F3: goto @1FF
		// @1F6: athrow
		// @1F7: aload #10
		// @1F9: getstatic java.lang.String game.C_100121_ud.field_100714_E
		// @1FC: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @1FF: iload #11
		// @201: iconst_4
		// @202: iand
		// @203: ifle @212
		// @206: aload #10
		// @208: getstatic java.lang.String game.C_100316_lc.field_102408_B
		// @20B: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @20E: goto @212
		// @211: athrow
		// @212: iconst_0
		// @213: iload #11
		// @215: bipush 8 (0x08)
		// @217: iand
		// @218: if_icmplt @21F
		// @21B: goto @227
		// @21E: athrow
		// @21F: aload #10
		// @221: getstatic java.lang.String game.C_100029_gn.field_103364_T
		// @224: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @227: aload #10
		// @229: aload #10
		// @22B: getfield java.lang.String game.C_100302_ka.field_101890_ab
		// @22E: iconst_2
		// @22F: aload #10
		// @231: getfield int game.C_100302_ka.field_101829_Db
		// @234: imul
		// @235: ineg
		// @236: aload #10
		// @238: getfield int game.C_100302_ka.field_101886_Kb
		// @23B: iadd
		// @23C: sipush -3598 (0xF1F2)
		// @23F: aload #10
		// @241: getfield game.C_100112_r game.C_100302_ka.field_101845_sb
		// @244: invokestatic game.C_100192_rf.func_101672_a(java.lang.String, int, int, game.C_100112_r)java.lang.String
		// @247: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @24A: aload #9
		// @24C: bipush -71 (0xB9)
		// @24E: aload #10
		// @250: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @253: aload_1
		// @254: bipush -86 (0xAA)
		// @256: aload #9
		// @258: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @25B: new game.C_100302_ka
		// @25E: dup
		// @25F: ldc2_w -1
		// @262: aconst_null
		// @263: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @266: astore #14
		// @268: aload #14
		// @26A: iconst_2
		// @26B: bipush -5 (0xFB)
		// @26D: bipush 78 (0x4E)
		// @26F: aload #10
		// @271: getfield int game.C_100302_ka.field_101848_lb
		// @274: ineg
		// @275: iadd
		// @276: iadd
		// @277: iconst_m1
		// @278: iconst_2
		// @279: bipush -4 (0xFC)
		// @27B: iload_3
		// @27C: iadd
		// @27D: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @280: aconst_null
		// @281: aload #13
		// @283: if_acmpeq @2AB
		// @286: aload #13
		// @288: getfield int game.C_100327_ib.field_102494_P
		// @28B: bipush -42 (0xD6)
		// @28D: invokestatic game.C_100209_qb.func_102686_b(int, byte)game.C_100327_ib
		// @290: astore #13
		// @292: aload #10
		// @294: getfield int game.C_100302_ka.field_101848_lb
		// @297: ineg
		// @298: bipush 78 (0x4E)
		// @29A: iadd
		// @29B: bipush -5 (0xFB)
		// @29D: iadd
		// @29E: iconst_1
		// @29F: iload_0
		// @2A0: bipush 95 (0x5F)
		// @2A2: iadd
		// @2A3: aload #14
		// @2A5: aload #13
		// @2A7: iload_3
		// @2A8: invokestatic game.C_100208_qg.func_105944_a(int, boolean, int, game.C_100302_ka, game.C_100327_ib, int)void
		// @2AB: aload #9
		// @2AD: bipush -78 (0xB2)
		// @2AF: aload #14
		// @2B1: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @2B4: aload_1
		// @2B5: getfield int game.C_100302_ka.field_101840_Eb
		// @2B8: getstatic int game.C_100015_wh.field_103781_g
		// @2BB: if_icmpgt @314
		// @2BE: aload_1
		// @2BF: getfield int game.C_100302_ka.field_101840_Eb
		// @2C2: aload_1
		// @2C3: getfield int game.C_100302_ka.field_101886_Kb
		// @2C6: ineg
		// @2C7: isub
		// @2C8: getstatic int game.C_100015_wh.field_103781_g
		// @2CB: if_icmple @314
		// @2CE: goto @2D2
		// @2D1: athrow
		// @2D2: getstatic int game.C_100338_jc.field_105370_l
		// @2D5: iconst_m1
		// @2D6: ixor
		// @2D7: aload_1
		// @2D8: getfield int game.C_100302_ka.field_101835_xb
		// @2DB: iload_2
		// @2DC: iadd
		// @2DD: iconst_m1
		// @2DE: ixor
		// @2DF: if_icmpgt @314
		// @2E2: goto @2E6
		// @2E5: athrow
		// @2E6: getstatic int game.C_100338_jc.field_105370_l
		// @2E9: bipush 78 (0x4E)
		// @2EB: iload_2
		// @2EC: aload_1
		// @2ED: getfield int game.C_100302_ka.field_101835_xb
		// @2F0: iadd
		// @2F1: iadd
		// @2F2: if_icmplt @2FD
		// @2F5: goto @2F9
		// @2F8: athrow
		// @2F9: goto @314
		// @2FC: athrow
		// @2FD: aload #7
		// @2FF: putstatic game.C_100049_vf game.C_100013_fn.field_103742_c
		// @302: getstatic game.C_100327_ib game.C_100197_ra.field_100861_k
		// @305: ifnonnull @314
		// @308: aload #9
		// @30A: getstatic game.C_100037_wb[] game.C_100316_lc.field_102411_v
		// @30D: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @310: goto @314
		// @313: athrow
		// @314: iload #12
		// @316: iflt @359
		// @319: new game.C_100302_ka
		// @31C: dup
		// @31D: ldc ""
		// @31F: getstatic game.C_100302_ka game.C_100132_td.field_104976_a
		// @322: invokespecial game.C_100302_ka.<init>(java.lang.String, game.C_100302_ka)void
		// @325: astore #15
		// @327: aload #15
		// @329: getstatic java.lang.String game.C_100064_ve.field_103016_u
		// @32C: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @32F: aload #15
		// @331: iconst_2
		// @332: bipush 10 (0x0A)
		// @334: iconst_m1
		// @335: iconst_2
		// @336: bipush 10 (0x0A)
		// @338: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @33B: aload #15
		// @33D: ldc 65535 (0xffff)
		// @33F: putfield int game.C_100302_ka.field_101830_gb
		// @342: aload #15
		// @344: aconst_null
		// @345: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @348: aload #15
		// @34A: getstatic game.C_100317_lb game.C_100311_le.field_104719_A
		// @34D: putfield game.C_100112_r game.C_100302_ka.field_101845_sb
		// @350: aload #9
		// @352: bipush -70 (0xBA)
		// @354: aload #15
		// @356: invokevirtual game.C_100302_ka.func_101824_b(int, game.C_100302_ka)void
		// @359: aload_1
		// @35A: getfield int game.C_100302_ka.field_101840_Eb
		// @35D: istore #15
		// @35F: bipush 39 (0x27)
		// @361: iload_2
		// @362: aload_1
		// @363: getfield int game.C_100302_ka.field_101835_xb
		// @366: iadd
		// @367: iadd
		// @368: istore #16
		// @36A: aload #7
		// @36C: getfield int game.C_100049_vf.field_104202_c
		// @36F: iload #15
		// @371: ineg
		// @372: isub
		// @373: iconst_2
		// @374: idiv
		// @375: istore #17
		// @377: ldc 4473924 (0x444444)
		// @379: istore #18
		// @37B: iload #17
		// @37D: iload #16
		// @37F: iload #15
		// @381: iload #16
		// @383: iload #18
		// @385: sipush 128 (0x0080)
		// @388: invokestatic game.C_100196_rb.func_105785_e(int, int, int, int, int, int)void
		// @38B: iconst_3
		// @38C: aload #7
		// @38E: getfield int game.C_100049_vf.field_104202_c
		// @391: imul
		// @392: iload #17
		// @394: iadd
		// @395: iconst_4
		// @396: idiv
		// @397: iload #16
		// @399: aload #7
		// @39B: getfield int game.C_100049_vf.field_104216_s
		// @39E: iconst_3
		// @39F: imul
		// @3A0: iadd
		// @3A1: iconst_4
		// @3A2: idiv
		// @3A3: iload #17
		// @3A5: iload #16
		// @3A7: iload #18
		// @3A9: sipush 128 (0x0080)
		// @3AC: invokestatic game.C_100196_rb.func_105785_e(int, int, int, int, int, int)void
		// @3AF: iinc #2 +78
		// @3B2: iinc #6 +1
		// @3B5: iload #19
		// @3B7: ifeq @0C7
		// @3BA: iload_2
		// @3BB: ireturn
		// @3BC: astore_2
		// @3BD: aload_2
		// @3BE: new java.lang.StringBuilder
		// @3C1: dup
		// @3C2: invokespecial java.lang.StringBuilder.<init>()void
		// @3C5: getstatic java.lang.String[] game.C_100028_ha.field_103951_z
		// @3C8: iconst_2
		// @3C9: aaload
		// @3CA: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3CD: iload_0
		// @3CE: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3D1: bipush 44 (0x2C)
		// @3D3: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3D6: aload_1
		// @3D7: ifnull @3E3
		// @3DA: getstatic java.lang.String[] game.C_100028_ha.field_103951_z
		// @3DD: iconst_1
		// @3DE: aaload
		// @3DF: goto @3E8
		// @3E2: athrow
		// @3E3: getstatic java.lang.String[] game.C_100028_ha.field_103951_z
		// @3E6: iconst_0
		// @3E7: aaload
		// @3E8: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3EB: bipush 41 (0x29)
		// @3ED: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3F0: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3F3: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3F6: athrow
	}
	
	public static void func_103941_a(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic game.C_100302_ka game.C_100028_ha.field_103944_f
		// @04: aconst_null
		// @05: putstatic java.lang.String game.C_100028_ha.field_103952_h
		// @08: aconst_null
		// @09: putstatic java.lang.String game.C_100028_ha.field_103949_c
		// @0C: aconst_null
		// @0D: putstatic int[] game.C_100028_ha.field_103950_a
		// @10: aconst_null
		// @11: putstatic java.lang.String[] game.C_100028_ha.field_103948_b
		// @14: aconst_null
		// @15: putstatic java.lang.String game.C_100028_ha.field_103945_g
		// @18: iload_0
		// @19: bipush 67 (0x43)
		// @1B: if_icmpge @27
		// @1E: bipush -48 (0xD0)
		// @20: invokestatic game.C_100028_ha.func_103941_a(int)void
		// @23: goto @27
		// @26: athrow
		// @27: aconst_null
		// @28: putstatic java.lang.String game.C_100028_ha.field_103946_d
		// @2B: goto @4F
		// @2E: astore_1
		// @2F: aload_1
		// @30: new java.lang.StringBuilder
		// @33: dup
		// @34: invokespecial java.lang.StringBuilder.<init>()void
		// @37: getstatic java.lang.String[] game.C_100028_ha.field_103951_z
		// @3A: iconst_3
		// @3B: aaload
		// @3C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3F: iload_0
		// @40: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @43: bipush 41 (0x29)
		// @45: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @48: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4E: athrow
		// @4F: return
	}
	
	static final byte[] func_103940_a(boolean arg0, CharSequence arg1)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #6
		// @005: iload_0
		// @006: ifeq @011
		// @009: iconst_5
		// @00A: invokestatic game.C_100028_ha.func_103941_a(int)void
		// @00D: goto @011
		// @010: athrow
		// @011: aload_1
		// @012: invokeinterface java.lang.CharSequence.length()int
		// @017: istore_2
		// @018: iload_2
		// @019: newarray byte[]
		// @01B: astore_3
		// @01C: iconst_0
		// @01D: istore #4
		// @01F: iload_2
		// @020: iconst_m1
		// @021: ixor
		// @022: iload #4
		// @024: iconst_m1
		// @025: ixor
		// @026: if_icmpge @377
		// @029: aload_1
		// @02A: iload #4
		// @02C: invokeinterface java.lang.CharSequence.charAt(int)char
		// @031: istore #5
		// @033: iload #5
		// @035: ifle @046
		// @038: sipush -129 (0xFF7F)
		// @03B: iload #5
		// @03D: iconst_m1
		// @03E: ixor
		// @03F: if_icmplt @05E
		// @042: goto @046
		// @045: athrow
		// @046: sipush 160 (0x00A0)
		// @049: iload #5
		// @04B: if_icmpgt @06E
		// @04E: goto @052
		// @051: athrow
		// @052: iload #5
		// @054: sipush 255 (0x00FF)
		// @057: if_icmpgt @06E
		// @05A: goto @05E
		// @05D: athrow
		// @05E: aload_3
		// @05F: iload #4
		// @061: iload #5
		// @063: i2b
		// @064: bastore
		// @065: iload #6
		// @067: ifeq @36F
		// @06A: goto @06E
		// @06D: athrow
		// @06E: iload #5
		// @070: iconst_m1
		// @071: ixor
		// @072: sipush -8365 (0xDF53)
		// @075: if_icmpne @08B
		// @078: goto @07C
		// @07B: athrow
		// @07C: aload_3
		// @07D: iload #4
		// @07F: bipush -128 (0x80)
		// @081: bastore
		// @082: iload #6
		// @084: ifeq @36F
		// @087: goto @08B
		// @08A: athrow
		// @08B: sipush -8219 (0xDFE5)
		// @08E: iload #5
		// @090: iconst_m1
		// @091: ixor
		// @092: if_icmpne @0A8
		// @095: goto @099
		// @098: athrow
		// @099: aload_3
		// @09A: iload #4
		// @09C: bipush -126 (0x82)
		// @09E: bastore
		// @09F: iload #6
		// @0A1: ifeq @36F
		// @0A4: goto @0A8
		// @0A7: athrow
		// @0A8: sipush -403 (0xFE6D)
		// @0AB: iload #5
		// @0AD: iconst_m1
		// @0AE: ixor
		// @0AF: if_icmpne @0C5
		// @0B2: goto @0B6
		// @0B5: athrow
		// @0B6: aload_3
		// @0B7: iload #4
		// @0B9: bipush -125 (0x83)
		// @0BB: bastore
		// @0BC: iload #6
		// @0BE: ifeq @36F
		// @0C1: goto @0C5
		// @0C4: athrow
		// @0C5: sipush -8223 (0xDFE1)
		// @0C8: iload #5
		// @0CA: iconst_m1
		// @0CB: ixor
		// @0CC: if_icmpeq @365
		// @0CF: goto @0D3
		// @0D2: athrow
		// @0D3: sipush 8230 (0x2026)
		// @0D6: iload #5
		// @0D8: if_icmpne @0EE
		// @0DB: goto @0DF
		// @0DE: athrow
		// @0DF: aload_3
		// @0E0: iload #4
		// @0E2: bipush -123 (0x85)
		// @0E4: bastore
		// @0E5: iload #6
		// @0E7: ifeq @36F
		// @0EA: goto @0EE
		// @0ED: athrow
		// @0EE: sipush 8224 (0x2020)
		// @0F1: iload #5
		// @0F3: if_icmpne @109
		// @0F6: goto @0FA
		// @0F9: athrow
		// @0FA: aload_3
		// @0FB: iload #4
		// @0FD: bipush -122 (0x86)
		// @0FF: bastore
		// @100: iload #6
		// @102: ifeq @36F
		// @105: goto @109
		// @108: athrow
		// @109: iload #5
		// @10B: iconst_m1
		// @10C: ixor
		// @10D: sipush -8226 (0xDFDE)
		// @110: if_icmpeq @356
		// @113: goto @117
		// @116: athrow
		// @117: iload #5
		// @119: sipush 710 (0x02C6)
		// @11C: if_icmpne @132
		// @11F: goto @123
		// @122: athrow
		// @123: aload_3
		// @124: iload #4
		// @126: bipush -120 (0x88)
		// @128: bastore
		// @129: iload #6
		// @12B: ifeq @36F
		// @12E: goto @132
		// @131: athrow
		// @132: sipush 8240 (0x2030)
		// @135: iload #5
		// @137: if_icmpeq @347
		// @13A: goto @13E
		// @13D: athrow
		// @13E: iload #5
		// @140: sipush 352 (0x0160)
		// @143: if_icmpne @159
		// @146: goto @14A
		// @149: athrow
		// @14A: aload_3
		// @14B: iload #4
		// @14D: bipush -118 (0x8A)
		// @14F: bastore
		// @150: iload #6
		// @152: ifeq @36F
		// @155: goto @159
		// @158: athrow
		// @159: sipush -8250 (0xDFC6)
		// @15C: iload #5
		// @15E: iconst_m1
		// @15F: ixor
		// @160: if_icmpne @176
		// @163: goto @167
		// @166: athrow
		// @167: aload_3
		// @168: iload #4
		// @16A: bipush -117 (0x8B)
		// @16C: bastore
		// @16D: iload #6
		// @16F: ifeq @36F
		// @172: goto @176
		// @175: athrow
		// @176: sipush -339 (0xFEAD)
		// @179: iload #5
		// @17B: iconst_m1
		// @17C: ixor
		// @17D: if_icmpne @193
		// @180: goto @184
		// @183: athrow
		// @184: aload_3
		// @185: iload #4
		// @187: bipush -116 (0x8C)
		// @189: bastore
		// @18A: iload #6
		// @18C: ifeq @36F
		// @18F: goto @193
		// @192: athrow
		// @193: sipush -382 (0xFE82)
		// @196: iload #5
		// @198: iconst_m1
		// @199: ixor
		// @19A: if_icmpeq @338
		// @19D: goto @1A1
		// @1A0: athrow
		// @1A1: iload #5
		// @1A3: iconst_m1
		// @1A4: ixor
		// @1A5: sipush -8217 (0xDFE7)
		// @1A8: if_icmpne @1BE
		// @1AB: goto @1AF
		// @1AE: athrow
		// @1AF: aload_3
		// @1B0: iload #4
		// @1B2: bipush -111 (0x91)
		// @1B4: bastore
		// @1B5: iload #6
		// @1B7: ifeq @36F
		// @1BA: goto @1BE
		// @1BD: athrow
		// @1BE: sipush 8217 (0x2019)
		// @1C1: iload #5
		// @1C3: if_icmpeq @329
		// @1C6: goto @1CA
		// @1C9: athrow
		// @1CA: sipush 8220 (0x201C)
		// @1CD: iload #5
		// @1CF: if_icmpne @1E5
		// @1D2: goto @1D6
		// @1D5: athrow
		// @1D6: aload_3
		// @1D7: iload #4
		// @1D9: bipush -109 (0x93)
		// @1DB: bastore
		// @1DC: iload #6
		// @1DE: ifeq @36F
		// @1E1: goto @1E5
		// @1E4: athrow
		// @1E5: iload #5
		// @1E7: sipush 8221 (0x201D)
		// @1EA: if_icmpne @200
		// @1ED: goto @1F1
		// @1F0: athrow
		// @1F1: aload_3
		// @1F2: iload #4
		// @1F4: bipush -108 (0x94)
		// @1F6: bastore
		// @1F7: iload #6
		// @1F9: ifeq @36F
		// @1FC: goto @200
		// @1FF: athrow
		// @200: iload #5
		// @202: iconst_m1
		// @203: ixor
		// @204: sipush -8227 (0xDFDD)
		// @207: if_icmpne @21D
		// @20A: goto @20E
		// @20D: athrow
		// @20E: aload_3
		// @20F: iload #4
		// @211: bipush -107 (0x95)
		// @213: bastore
		// @214: iload #6
		// @216: ifeq @36F
		// @219: goto @21D
		// @21C: athrow
		// @21D: iload #5
		// @21F: iconst_m1
		// @220: ixor
		// @221: sipush -8212 (0xDFEC)
		// @224: if_icmpne @23A
		// @227: goto @22B
		// @22A: athrow
		// @22B: aload_3
		// @22C: iload #4
		// @22E: bipush -106 (0x96)
		// @230: bastore
		// @231: iload #6
		// @233: ifeq @36F
		// @236: goto @23A
		// @239: athrow
		// @23A: sipush 8212 (0x2014)
		// @23D: iload #5
		// @23F: if_icmpne @255
		// @242: goto @246
		// @245: athrow
		// @246: aload_3
		// @247: iload #4
		// @249: bipush -105 (0x97)
		// @24B: bastore
		// @24C: iload #6
		// @24E: ifeq @36F
		// @251: goto @255
		// @254: athrow
		// @255: sipush -733 (0xFD23)
		// @258: iload #5
		// @25A: iconst_m1
		// @25B: ixor
		// @25C: if_icmpne @272
		// @25F: goto @263
		// @262: athrow
		// @263: aload_3
		// @264: iload #4
		// @266: bipush -104 (0x98)
		// @268: bastore
		// @269: iload #6
		// @26B: ifeq @36F
		// @26E: goto @272
		// @271: athrow
		// @272: iload #5
		// @274: iconst_m1
		// @275: ixor
		// @276: sipush -8483 (0xDEDD)
		// @279: if_icmpne @28F
		// @27C: goto @280
		// @27F: athrow
		// @280: aload_3
		// @281: iload #4
		// @283: bipush -103 (0x99)
		// @285: bastore
		// @286: iload #6
		// @288: ifeq @36F
		// @28B: goto @28F
		// @28E: athrow
		// @28F: iload #5
		// @291: sipush 353 (0x0161)
		// @294: if_icmpeq @31A
		// @297: goto @29B
		// @29A: athrow
		// @29B: sipush 8250 (0x203A)
		// @29E: iload #5
		// @2A0: if_icmpne @2B6
		// @2A3: goto @2A7
		// @2A6: athrow
		// @2A7: aload_3
		// @2A8: iload #4
		// @2AA: bipush -101 (0x9B)
		// @2AC: bastore
		// @2AD: iload #6
		// @2AF: ifeq @36F
		// @2B2: goto @2B6
		// @2B5: athrow
		// @2B6: sipush -340 (0xFEAC)
		// @2B9: iload #5
		// @2BB: iconst_m1
		// @2BC: ixor
		// @2BD: if_icmpne @2D3
		// @2C0: goto @2C4
		// @2C3: athrow
		// @2C4: aload_3
		// @2C5: iload #4
		// @2C7: bipush -100 (0x9C)
		// @2C9: bastore
		// @2CA: iload #6
		// @2CC: ifeq @36F
		// @2CF: goto @2D3
		// @2D2: athrow
		// @2D3: iload #5
		// @2D5: iconst_m1
		// @2D6: ixor
		// @2D7: sipush -383 (0xFE81)
		// @2DA: if_icmpeq @30B
		// @2DD: goto @2E1
		// @2E0: athrow
		// @2E1: iload #5
		// @2E3: sipush 376 (0x0178)
		// @2E6: if_icmpne @2FC
		// @2E9: goto @2ED
		// @2EC: athrow
		// @2ED: aload_3
		// @2EE: iload #4
		// @2F0: bipush -97 (0x9F)
		// @2F2: bastore
		// @2F3: iload #6
		// @2F5: ifeq @36F
		// @2F8: goto @2FC
		// @2FB: athrow
		// @2FC: aload_3
		// @2FD: iload #4
		// @2FF: bipush 63 (0x3F)
		// @301: bastore
		// @302: iload #6
		// @304: ifeq @36F
		// @307: goto @30B
		// @30A: athrow
		// @30B: aload_3
		// @30C: iload #4
		// @30E: bipush -98 (0x9E)
		// @310: bastore
		// @311: iload #6
		// @313: ifeq @36F
		// @316: goto @31A
		// @319: athrow
		// @31A: aload_3
		// @31B: iload #4
		// @31D: bipush -102 (0x9A)
		// @31F: bastore
		// @320: iload #6
		// @322: ifeq @36F
		// @325: goto @329
		// @328: athrow
		// @329: aload_3
		// @32A: iload #4
		// @32C: bipush -110 (0x92)
		// @32E: bastore
		// @32F: iload #6
		// @331: ifeq @36F
		// @334: goto @338
		// @337: athrow
		// @338: aload_3
		// @339: iload #4
		// @33B: bipush -114 (0x8E)
		// @33D: bastore
		// @33E: iload #6
		// @340: ifeq @36F
		// @343: goto @347
		// @346: athrow
		// @347: aload_3
		// @348: iload #4
		// @34A: bipush -119 (0x89)
		// @34C: bastore
		// @34D: iload #6
		// @34F: ifeq @36F
		// @352: goto @356
		// @355: athrow
		// @356: aload_3
		// @357: iload #4
		// @359: bipush -121 (0x87)
		// @35B: bastore
		// @35C: iload #6
		// @35E: ifeq @36F
		// @361: goto @365
		// @364: athrow
		// @365: aload_3
		// @366: iload #4
		// @368: bipush -124 (0x84)
		// @36A: bastore
		// @36B: goto @36F
		// @36E: athrow
		// @36F: iinc #4 +1
		// @372: iload #6
		// @374: ifeq @01F
		// @377: aload_3
		// @378: areturn
		// @379: astore_2
		// @37A: aload_2
		// @37B: new java.lang.StringBuilder
		// @37E: dup
		// @37F: invokespecial java.lang.StringBuilder.<init>()void
		// @382: getstatic java.lang.String[] game.C_100028_ha.field_103951_z
		// @385: iconst_4
		// @386: aaload
		// @387: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @38A: iload_0
		// @38B: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @38E: bipush 44 (0x2C)
		// @390: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @393: aload_1
		// @394: ifnull @3A0
		// @397: getstatic java.lang.String[] game.C_100028_ha.field_103951_z
		// @39A: iconst_1
		// @39B: aaload
		// @39C: goto @3A5
		// @39F: athrow
		// @3A0: getstatic java.lang.String[] game.C_100028_ha.field_103951_z
		// @3A3: iconst_0
		// @3A4: aaload
		// @3A5: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3A8: bipush 41 (0x29)
		// @3AA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3AD: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3B0: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3B3: athrow
	}
	
	static
	{
		// @000: bipush 6 (0x06)
		// @002: anewarray java.lang.String
		// @005: dup
		// @006: iconst_0
		// @007: ldc "2T\u0000R"
		// @009: invokestatic game.C_100028_ha.func_103943_z(java.lang.String)char[]
		// @00C: invokestatic game.C_100028_ha.func_103942_z(char[])java.lang.String
		// @00F: aastore
		// @010: dup
		// @011: iconst_1
		// @012: ldc "'\u000fB\u0010\u0003"
		// @014: invokestatic game.C_100028_ha.func_103943_z(java.lang.String)char[]
		// @017: invokestatic game.C_100028_ha.func_103942_z(char[])java.lang.String
		// @01A: aastore
		// @01B: dup
		// @01C: iconst_2
		// @01D: ldc "4@B\u007fV"
		// @01F: invokestatic game.C_100028_ha.func_103943_z(java.lang.String)char[]
		// @022: invokestatic game.C_100028_ha.func_103942_z(char[])java.lang.String
		// @025: aastore
		// @026: dup
		// @027: iconst_3
		// @028: ldc "4@B}V"
		// @02A: invokestatic game.C_100028_ha.func_103943_z(java.lang.String)char[]
		// @02D: invokestatic game.C_100028_ha.func_103942_z(char[])java.lang.String
		// @030: aastore
		// @031: dup
		// @032: iconst_4
		// @033: ldc "4@B|V"
		// @035: invokestatic game.C_100028_ha.func_103943_z(java.lang.String)char[]
		// @038: invokestatic game.C_100028_ha.func_103942_z(char[])java.lang.String
		// @03B: aastore
		// @03C: dup
		// @03D: iconst_5
		// @03E: ldc "4@BzV"
		// @040: invokestatic game.C_100028_ha.func_103943_z(java.lang.String)char[]
		// @043: invokestatic game.C_100028_ha.func_103942_z(char[])java.lang.String
		// @046: aastore
		// @047: putstatic java.lang.String[] game.C_100028_ha.field_103951_z
		// @04A: ldc "\u000fI\u0003I^0N\u000e\\\u0007|B\u0004_\n|G\u001eQ\u0013|L\u0015\u001e\u0018.H\tP\u001a/"
		// @04C: invokestatic game.C_100028_ha.func_103943_z(java.lang.String)char[]
		// @04F: invokestatic game.C_100028_ha.func_103942_z(char[])java.lang.String
		// @052: putstatic java.lang.String game.C_100028_ha.field_103945_g
		// @055: iconst_0
		// @056: putstatic boolean game.C_100028_ha.field_103947_e
		// @059: ldc "\u000eD\u001f[\u001f.B\u0004\u001e\u00172U\u0003\u001eB?N\u0000\u0003NlG\nX\u0018bM\rM\u001b.\u0001\u001b[\u001f,N\u0002MBsB\u0003R@|H\u001f\u001e\u00109D\u0008[\u001a|C\tX\u0011.DLJ\u00169\u0001P\u001bNb\u0001\u000f_\u0010|C\t\u001e\u001b2F\u0005P\u001b9S\tZP"
		// @05B: invokestatic game.C_100028_ha.func_103943_z(java.lang.String)char[]
		// @05E: invokestatic game.C_100028_ha.func_103942_z(char[])java.lang.String
		// @061: putstatic java.lang.String game.C_100028_ha.field_103949_c
		// @064: iconst_3
		// @065: anewarray java.lang.String
		// @068: dup
		// @069: iconst_0
		// @06A: ldc "\u000cD\u001eV\u001f,RLG\u0011)\u0001\u000fQ\u000b0EL]\u00112R\u0005Z\u001b.\u000fB\u0010"
		// @06C: invokestatic game.C_100028_ha.func_103943_z(java.lang.String)char[]
		// @06F: invokestatic game.C_100028_ha.func_103942_z(char[])java.lang.String
		// @072: aastore
		// @073: dup
		// @074: iconst_1
		// @075: ldc "r\u000fB_\u001a8H\u0002Y^;@\u0001[S/Q\t]\u0017:H\u000f\u001e\u001c9O\tX\u0017(RB\u0010P"
		// @077: invokestatic game.C_100028_ha.func_103943_z(java.lang.String)char[]
		// @07A: invokestatic game.C_100028_ha.func_103942_z(char[])java.lang.String
		// @07D: aastore
		// @07E: dup
		// @07F: iconst_2
		// @080: ldc "r\u000fBJ\u0011|r\u0018[\u001b0r\tP\n5O\tR\r\u0008D\u0014JP(D\u0014J!>D\u0002[\u00185U\u001f\u0010"
		// @082: invokestatic game.C_100028_ha.func_103943_z(java.lang.String)char[]
		// @085: invokestatic game.C_100028_ha.func_103942_z(char[])java.lang.String
		// @088: aastore
		// @089: putstatic java.lang.String[] game.C_100028_ha.field_103948_b
		// @08C: ldc "\u000cM\t_\r9\u0001\u001f[\u00129B\u0018\u001e\u001f2\u0001\u0003N\n5N\u0002\u001e\u00172\u0001\u0018V\u001b|\u0006P\u001bNb\u0006LL\u0011+\u000f"
		// @08E: invokestatic game.C_100028_ha.func_103943_z(java.lang.String)char[]
		// @091: invokestatic game.C_100028_ha.func_103942_z(char[])java.lang.String
		// @094: putstatic java.lang.String game.C_100028_ha.field_103952_h
		// @097: bipush 39 (0x27)
		// @099: newarray int[]
		// @09B: dup
		// @09C: iconst_0
		// @09D: iconst_2
		// @09E: iastore
		// @09F: dup
		// @0A0: iconst_1
		// @0A1: iconst_2
		// @0A2: iastore
		// @0A3: dup
		// @0A4: iconst_2
		// @0A5: iconst_2
		// @0A6: iastore
		// @0A7: dup
		// @0A8: iconst_3
		// @0A9: iconst_1
		// @0AA: iastore
		// @0AB: dup
		// @0AC: iconst_4
		// @0AD: iconst_2
		// @0AE: iastore
		// @0AF: dup
		// @0B0: iconst_5
		// @0B1: iconst_1
		// @0B2: iastore
		// @0B3: dup
		// @0B4: bipush 6 (0x06)
		// @0B6: iconst_5
		// @0B7: iastore
		// @0B8: dup
		// @0B9: bipush 7 (0x07)
		// @0BB: bipush 10 (0x0A)
		// @0BD: iastore
		// @0BE: dup
		// @0BF: bipush 8 (0x08)
		// @0C1: iconst_2
		// @0C2: iastore
		// @0C3: dup
		// @0C4: bipush 9 (0x09)
		// @0C6: iconst_5
		// @0C7: iastore
		// @0C8: dup
		// @0C9: bipush 10 (0x0A)
		// @0CB: iconst_2
		// @0CC: iastore
		// @0CD: dup
		// @0CE: bipush 11 (0x0B)
		// @0D0: iconst_2
		// @0D1: iastore
		// @0D2: dup
		// @0D3: bipush 12 (0x0C)
		// @0D5: iconst_2
		// @0D6: iastore
		// @0D7: dup
		// @0D8: bipush 13 (0x0D)
		// @0DA: iconst_5
		// @0DB: iastore
		// @0DC: dup
		// @0DD: bipush 14 (0x0E)
		// @0DF: iconst_5
		// @0E0: iastore
		// @0E1: dup
		// @0E2: bipush 15 (0x0F)
		// @0E4: iconst_5
		// @0E5: iastore
		// @0E6: dup
		// @0E7: bipush 16 (0x10)
		// @0E9: iconst_3
		// @0EA: iastore
		// @0EB: dup
		// @0EC: bipush 17 (0x11)
		// @0EE: iconst_1
		// @0EF: iastore
		// @0F0: dup
		// @0F1: bipush 18 (0x12)
		// @0F3: iconst_1
		// @0F4: iastore
		// @0F5: dup
		// @0F6: bipush 19 (0x13)
		// @0F8: iconst_2
		// @0F9: iastore
		// @0FA: dup
		// @0FB: bipush 20 (0x14)
		// @0FD: iconst_3
		// @0FE: iastore
		// @0FF: dup
		// @100: bipush 21 (0x15)
		// @102: iconst_5
		// @103: iastore
		// @104: dup
		// @105: bipush 22 (0x16)
		// @107: iconst_5
		// @108: iastore
		// @109: dup
		// @10A: bipush 23 (0x17)
		// @10C: bipush 10 (0x0A)
		// @10E: iastore
		// @10F: dup
		// @110: bipush 24 (0x18)
		// @112: iconst_3
		// @113: iastore
		// @114: dup
		// @115: bipush 25 (0x19)
		// @117: bipush 10 (0x0A)
		// @119: iastore
		// @11A: dup
		// @11B: bipush 26 (0x1A)
		// @11D: iconst_1
		// @11E: iastore
		// @11F: dup
		// @120: bipush 27 (0x1B)
		// @122: iconst_1
		// @123: iastore
		// @124: dup
		// @125: bipush 28 (0x1C)
		// @127: iconst_3
		// @128: iastore
		// @129: dup
		// @12A: bipush 29 (0x1D)
		// @12C: iconst_3
		// @12D: iastore
		// @12E: dup
		// @12F: bipush 30 (0x1E)
		// @131: iconst_3
		// @132: iastore
		// @133: dup
		// @134: bipush 31 (0x1F)
		// @136: iconst_3
		// @137: iastore
		// @138: dup
		// @139: bipush 32 (0x20)
		// @13B: iconst_2
		// @13C: iastore
		// @13D: dup
		// @13E: bipush 33 (0x21)
		// @140: iconst_3
		// @141: iastore
		// @142: dup
		// @143: bipush 34 (0x22)
		// @145: iconst_5
		// @146: iastore
		// @147: dup
		// @148: bipush 35 (0x23)
		// @14A: iconst_5
		// @14B: iastore
		// @14C: dup
		// @14D: bipush 36 (0x24)
		// @14F: bipush 10 (0x0A)
		// @151: iastore
		// @152: dup
		// @153: bipush 37 (0x25)
		// @155: bipush 10 (0x0A)
		// @157: iastore
		// @158: dup
		// @159: bipush 38 (0x26)
		// @15B: iconst_2
		// @15C: iastore
		// @15D: putstatic int[] game.C_100028_ha.field_103950_a
		// @160: ldc "\u000fN\u0001[^,M\rG\u001b.RLV\u001f*D\u0002\u0019\n|T\u0002R\u0011?J\tZ^(I\t\u001e\u001d)S\u001e[\u0010(M\u0015\u001e\r9M\t]\n9ELY\u001f1DLQ\u000e(H\u0003P\rr\u001d\u000eL@\u000cM\t_\r9\u0001\u001f[\u001b|U\u0004[^,M\rG\u001b.\u0001\u0000W\r(\u0001\u0003P^(I\t\u001e\u00129G\u0018\u001e\u00183SLZ\u001b(@\u0005R\rr"
		// @162: invokestatic game.C_100028_ha.func_103943_z(java.lang.String)char[]
		// @165: invokestatic game.C_100028_ha.func_103942_z(char[])java.lang.String
		// @168: putstatic java.lang.String game.C_100028_ha.field_103946_d
		// @16B: return
	}
	
	private static char[] func_103943_z(String arg0)
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
		// @0E: bipush 126 (0x7E)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_103942_z(char[] arg0)
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
		// @30: bipush 92 (0x5C)
		// @32: goto @46
		// @35: bipush 33 (0x21)
		// @37: goto @46
		// @3A: bipush 108 (0x6C)
		// @3C: goto @46
		// @3F: bipush 62 (0x3E)
		// @41: goto @46
		// @44: bipush 126 (0x7E)
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
