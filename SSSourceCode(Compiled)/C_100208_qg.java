package game;

import java.math.BigInteger;

final class C_100208_qg
{
	private C_100104_v field_105963_k;
	static String field_105962_j;
	static C_100037_wb[] field_105965_i;
	static String field_105955_g;
	static int field_105964_h;
	private BigInteger field_105960_a;
	private C_100178_cg field_105954_f;
	private C_100216_aj[] field_105956_d;
	private BigInteger field_105958_b;
	private C_100280_nf field_105959_c;
	private C_100192_rf field_105961_l;
	static boolean field_105957_e;
	private static final String[] field_105966_z;
	
	public static void func_105947_b(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100208_qg.field_105962_j
		// @04: aconst_null
		// @05: putstatic game.C_100037_wb[] game.C_100208_qg.field_105965_i
		// @08: iload_0
		// @09: bipush -73 (0xB7)
		// @0B: if_icmple @17
		// @0E: bipush 126 (0x7E)
		// @10: putstatic int game.C_100208_qg.field_105964_h
		// @13: goto @17
		// @16: athrow
		// @17: aconst_null
		// @18: putstatic java.lang.String game.C_100208_qg.field_105955_g
		// @1B: goto @3F
		// @1E: astore_1
		// @1F: aload_1
		// @20: new java.lang.StringBuilder
		// @23: dup
		// @24: invokespecial java.lang.StringBuilder.<init>()void
		// @27: getstatic java.lang.String[] game.C_100208_qg.field_105966_z
		// @2A: iconst_5
		// @2B: aaload
		// @2C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2F: iload_0
		// @30: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @33: bipush 41 (0x29)
		// @35: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @38: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3E: athrow
		// @3F: return
	}
	
	C_100208_qg(C_100104_v arg0, C_100178_cg arg1)
	{
		// @0: aload_0
		// @1: aload_1
		// @2: aload_2
		// @3: aconst_null
		// @4: aconst_null
		// @5: invokespecial game.C_100208_qg.<init>(game.C_100104_v, game.C_100178_cg, java.math.BigInteger, java.math.BigInteger)void
		// @8: return
	}
	
	static final C_100037_wb func_105951_c(int arg0)
	{
		// @00: getstatic int[] game.C_100312_ld.field_107156_c
		// @03: iload_0
		// @04: iaload
		// @05: getstatic int[] game.C_100213_ak.field_105994_d
		// @08: iconst_0
		// @09: iaload
		// @0A: imul
		// @0B: istore_1
		// @0C: getstatic byte[][] game.C_100107_u.field_104774_c
		// @0F: iconst_0
		// @10: aaload
		// @11: astore_2
		// @12: getstatic boolean[] game.C_100160_sm.field_105416_c
		// @15: iconst_0
		// @16: baload
		// @17: ifne @69
		// @1A: iload_1
		// @1B: newarray int[]
		// @1D: astore #4
		// @1F: iconst_0
		// @20: istore #5
		// @22: iload_1
		// @23: iload #5
		// @25: if_icmple @42
		// @28: aload #4
		// @2A: iload #5
		// @2C: getstatic int[] game.C_100085_a.field_102573_H
		// @2F: sipush 255 (0x00FF)
		// @32: aload_2
		// @33: iload #5
		// @35: baload
		// @36: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @39: iaload
		// @3A: iastore
		// @3B: iinc #5 +1
		// @3E: goto @22
		// @41: athrow
		// @42: new game.C_100037_wb
		// @45: dup
		// @46: getstatic int game.C_100338_jc.field_105371_m
		// @49: getstatic int game.C_100277_nc.field_106702_C
		// @4C: getstatic int[] game.C_100068_vc.field_104340_f
		// @4F: iconst_0
		// @50: iaload
		// @51: getstatic int[] game.C_100012_fh.field_100509_M
		// @54: iconst_0
		// @55: iaload
		// @56: getstatic int[] game.C_100213_ak.field_105994_d
		// @59: iconst_0
		// @5A: iaload
		// @5B: getstatic int[] game.C_100312_ld.field_107156_c
		// @5E: iconst_0
		// @5F: iaload
		// @60: aload #4
		// @62: invokespecial game.C_100037_wb.<init>(int, int, int, int, int, int, int[])void
		// @65: astore_3
		// @66: goto @CD
		// @69: getstatic byte[][] game.C_100034_gi.field_104039_i
		// @6C: iconst_0
		// @6D: aaload
		// @6E: astore #4
		// @70: iload_1
		// @71: newarray int[]
		// @73: astore #5
		// @75: iconst_0
		// @76: istore #6
		// @78: iload #6
		// @7A: iload_1
		// @7B: if_icmpge @A9
		// @7E: aload #5
		// @80: iload #6
		// @82: getstatic int[] game.C_100085_a.field_102573_H
		// @85: aload_2
		// @86: iload #6
		// @88: baload
		// @89: sipush 255 (0x00FF)
		// @8C: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @8F: iaload
		// @90: aload #4
		// @92: iload #6
		// @94: baload
		// @95: sipush 255 (0x00FF)
		// @98: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @9B: ldc -1747858088 (0x97d1cd58)
		// @9D: ishl
		// @9E: invokestatic game.C_100116_ei.func_104117_a(int, int)int
		// @A1: iastore
		// @A2: iinc #6 +1
		// @A5: goto @78
		// @A8: athrow
		// @A9: new game.C_100251_pm
		// @AC: dup
		// @AD: getstatic int game.C_100338_jc.field_105371_m
		// @B0: getstatic int game.C_100277_nc.field_106702_C
		// @B3: getstatic int[] game.C_100068_vc.field_104340_f
		// @B6: iconst_0
		// @B7: iaload
		// @B8: getstatic int[] game.C_100012_fh.field_100509_M
		// @BB: iconst_0
		// @BC: iaload
		// @BD: getstatic int[] game.C_100213_ak.field_105994_d
		// @C0: iconst_0
		// @C1: iaload
		// @C2: getstatic int[] game.C_100312_ld.field_107156_c
		// @C5: iconst_0
		// @C6: iaload
		// @C7: aload #5
		// @C9: invokespecial game.C_100251_pm.<init>(int, int, int, int, int, int, int[])void
		// @CC: astore_3
		// @CD: bipush -77 (0xB3)
		// @CF: invokestatic game.C_100030_gm.func_103336_a(byte)void
		// @D2: aload_3
		// @D3: areturn
		// @D4: astore_1
		// @D5: aload_1
		// @D6: new java.lang.StringBuilder
		// @D9: dup
		// @DA: invokespecial java.lang.StringBuilder.<init>()void
		// @DD: getstatic java.lang.String[] game.C_100208_qg.field_105966_z
		// @E0: iconst_4
		// @E1: aaload
		// @E2: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @E5: iload_0
		// @E6: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @E9: bipush 41 (0x29)
		// @EB: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @EE: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @F1: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @F4: athrow
	}
	
	static final void func_105944_a(int arg0, boolean arg1, int arg2, C_100302_ka arg3, C_100327_ib arg4, int arg5)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #12
		// @005: iload_2
		// @006: bipush 99 (0x63)
		// @008: if_icmpeq @00C
		// @00B: return
		// @00C: aconst_null
		// @00D: astore #6
		// @00F: iload_1
		// @010: ifeq @047
		// @013: aload #4
		// @015: getfield int game.C_100327_ib.field_102494_P
		// @018: iflt @047
		// @01B: goto @01F
		// @01E: athrow
		// @01F: iconst_1
		// @020: aload #4
		// @022: getfield int game.C_100327_ib.field_102497_w
		// @025: if_icmpne @030
		// @028: goto @02C
		// @02B: athrow
		// @02C: goto @047
		// @02F: athrow
		// @030: getstatic game.C_100037_wb[] game.C_100084_ug.field_104487_k
		// @033: astore #6
		// @035: aload #6
		// @037: arraylength
		// @038: iconst_m1
		// @039: ixor
		// @03A: aload #4
		// @03C: getfield int game.C_100327_ib.field_102494_P
		// @03F: iconst_m1
		// @040: ixor
		// @041: if_icmplt @047
		// @044: aconst_null
		// @045: astore #6
		// @047: aload #6
		// @049: ifnull @069
		// @04C: aconst_null
		// @04D: aload #6
		// @04F: aload #4
		// @051: getfield int game.C_100327_ib.field_102494_P
		// @054: aaload
		// @055: if_acmpeq @069
		// @058: goto @05C
		// @05B: athrow
		// @05C: aload_3
		// @05D: aload #6
		// @05F: aload #4
		// @061: getfield int game.C_100327_ib.field_102494_P
		// @064: aaload
		// @065: putfield game.C_100037_wb game.C_100302_ka.field_101887_nb
		// @068: return
		// @069: new game.C_100037_wb
		// @06C: dup
		// @06D: iload #5
		// @06F: iload_0
		// @070: invokespecial game.C_100037_wb.<init>(int, int)void
		// @073: astore #7
		// @075: aload_3
		// @076: aload #7
		// @078: putfield game.C_100037_wb game.C_100302_ka.field_101887_nb
		// @07B: aload #6
		// @07D: ifnonnull @084
		// @080: goto @08E
		// @083: athrow
		// @084: aload #6
		// @086: aload #4
		// @088: getfield int game.C_100327_ib.field_102494_P
		// @08B: aload #7
		// @08D: aastore
		// @08E: aload_3
		// @08F: getfield game.C_100037_wb game.C_100302_ka.field_101887_nb
		// @092: invokevirtual game.C_100037_wb.func_102379_d()void
		// @095: aload #4
		// @097: getfield int game.C_100327_ib.field_102497_w
		// @09A: iconst_1
		// @09B: if_icmpne @1B2
		// @09E: getstatic int game.C_100270_mi.field_102270_jc
		// @0A1: istore #8
		// @0A3: aload #4
		// @0A5: getfield int game.C_100327_ib.field_102494_P
		// @0A8: ifne @0B5
		// @0AB: sipush 1200 (0x04B0)
		// @0AE: putstatic int game.C_100270_mi.field_102270_jc
		// @0B1: goto @0B5
		// @0B4: athrow
		// @0B5: aload #4
		// @0B7: getfield int game.C_100327_ib.field_102494_P
		// @0BA: bipush 55 (0x37)
		// @0BC: if_icmpne @0C9
		// @0BF: sipush 1200 (0x04B0)
		// @0C2: putstatic int game.C_100270_mi.field_102270_jc
		// @0C5: goto @0C9
		// @0C8: athrow
		// @0C9: bipush 57 (0x39)
		// @0CB: aload #4
		// @0CD: getfield int game.C_100327_ib.field_102494_P
		// @0D0: if_icmpne @0DD
		// @0D3: sipush 1300 (0x0514)
		// @0D6: putstatic int game.C_100270_mi.field_102270_jc
		// @0D9: goto @0DD
		// @0DC: athrow
		// @0DD: aload #4
		// @0DF: getfield int game.C_100327_ib.field_102494_P
		// @0E2: bipush 62 (0x3E)
		// @0E4: if_icmpeq @0EB
		// @0E7: goto @0F1
		// @0EA: athrow
		// @0EB: sipush 1400 (0x0578)
		// @0EE: putstatic int game.C_100270_mi.field_102270_jc
		// @0F1: bipush 65 (0x41)
		// @0F3: aload #4
		// @0F5: getfield int game.C_100327_ib.field_102494_P
		// @0F8: if_icmpne @105
		// @0FB: sipush 1000 (0x03E8)
		// @0FE: putstatic int game.C_100270_mi.field_102270_jc
		// @101: goto @105
		// @104: athrow
		// @105: bipush 69 (0x45)
		// @107: aload #4
		// @109: getfield int game.C_100327_ib.field_102494_P
		// @10C: if_icmpne @119
		// @10F: sipush 1400 (0x0578)
		// @112: putstatic int game.C_100270_mi.field_102270_jc
		// @115: goto @119
		// @118: athrow
		// @119: bipush 72 (0x48)
		// @11B: aload #4
		// @11D: getfield int game.C_100327_ib.field_102494_P
		// @120: if_icmpne @12D
		// @123: sipush 1000 (0x03E8)
		// @126: putstatic int game.C_100270_mi.field_102270_jc
		// @129: goto @12D
		// @12C: athrow
		// @12D: aload #4
		// @12F: getfield int game.C_100327_ib.field_102494_P
		// @132: iconst_m1
		// @133: ixor
		// @134: bipush -76 (0xB4)
		// @136: if_icmpeq @13D
		// @139: goto @143
		// @13C: athrow
		// @13D: sipush 1000 (0x03E8)
		// @140: putstatic int game.C_100270_mi.field_102270_jc
		// @143: bipush 79 (0x4F)
		// @145: aload #4
		// @147: getfield int game.C_100327_ib.field_102494_P
		// @14A: if_icmpne @157
		// @14D: sipush 1000 (0x03E8)
		// @150: putstatic int game.C_100270_mi.field_102270_jc
		// @153: goto @157
		// @156: athrow
		// @157: bipush -85 (0xAB)
		// @159: aload #4
		// @15B: getfield int game.C_100327_ib.field_102494_P
		// @15E: iconst_m1
		// @15F: ixor
		// @160: if_icmpne @16D
		// @163: sipush 1000 (0x03E8)
		// @166: putstatic int game.C_100270_mi.field_102270_jc
		// @169: goto @16D
		// @16C: athrow
		// @16D: bipush -89 (0xA7)
		// @16F: aload #4
		// @171: getfield int game.C_100327_ib.field_102494_P
		// @174: iconst_m1
		// @175: ixor
		// @176: if_icmpne @183
		// @179: sipush 1000 (0x03E8)
		// @17C: putstatic int game.C_100270_mi.field_102270_jc
		// @17F: goto @183
		// @182: athrow
		// @183: bipush 92 (0x5C)
		// @185: aload #4
		// @187: getfield int game.C_100327_ib.field_102494_P
		// @18A: if_icmpne @197
		// @18D: sipush 700 (0x02BC)
		// @190: putstatic int game.C_100270_mi.field_102270_jc
		// @193: goto @197
		// @196: athrow
		// @197: aload #4
		// @199: iload #5
		// @19B: iconst_2
		// @19C: idiv
		// @19D: iconst_0
		// @19E: iconst_0
		// @19F: iconst_0
		// @1A0: iload_0
		// @1A1: iload_2
		// @1A2: ldc 759988717 (0x2d4c81ed)
		// @1A4: iadd
		// @1A5: invokevirtual game.C_100327_ib.func_102437_a(int, int, boolean, int, int, int)void
		// @1A8: iload #8
		// @1AA: putstatic int game.C_100270_mi.field_102270_jc
		// @1AD: iload #12
		// @1AF: ifeq @9C3
		// @1B2: iload #5
		// @1B4: iconst_2
		// @1B5: idiv
		// @1B6: istore #8
		// @1B8: iload_0
		// @1B9: iconst_2
		// @1BA: idiv
		// @1BB: istore #9
		// @1BD: bipush 16 (0x10)
		// @1BF: aload #4
		// @1C1: getfield int game.C_100327_ib.field_102497_w
		// @1C4: if_icmpeq @1CB
		// @1C7: goto @1CE
		// @1CA: athrow
		// @1CB: iinc #8 +246
		// @1CE: getstatic int game.C_100270_mi.field_102270_jc
		// @1D1: istore #10
		// @1D3: aload #4
		// @1D5: getfield int game.C_100327_ib.field_102494_P
		// @1D8: iconst_m1
		// @1D9: ixor
		// @1DA: bipush -32 (0xE0)
		// @1DC: if_icmpne @1E6
		// @1DF: iinc #8 +236
		// @1E2: goto @1E6
		// @1E5: athrow
		// @1E6: aload #4
		// @1E8: getfield int game.C_100327_ib.field_102497_w
		// @1EB: bipush 64 (0x40)
		// @1ED: if_icmpeq @1F4
		// @1F0: goto @200
		// @1F3: athrow
		// @1F4: sipush 2048 (0x0800)
		// @1F7: putstatic int game.C_100270_mi.field_102270_jc
		// @1FA: iinc #9 +7
		// @1FD: iinc #8 +236
		// @200: aload #4
		// @202: getfield int game.C_100327_ib.field_102497_w
		// @205: iconst_m1
		// @206: ixor
		// @207: sipush -129 (0xFF7F)
		// @20A: if_icmpeq @211
		// @20D: goto @214
		// @210: athrow
		// @211: iinc #8 +5
		// @214: aload #4
		// @216: getfield int game.C_100327_ib.field_102497_w
		// @219: sipush 256 (0x0100)
		// @21C: if_icmpne @226
		// @21F: iinc #8 +10
		// @222: goto @226
		// @225: athrow
		// @226: aload #4
		// @228: getfield int game.C_100327_ib.field_102497_w
		// @22B: iconst_2
		// @22C: if_icmpne @239
		// @22F: iinc #8 +246
		// @232: iinc #9 +10
		// @235: goto @239
		// @238: athrow
		// @239: aload #4
		// @23B: getfield int game.C_100327_ib.field_102497_w
		// @23E: iconst_m1
		// @23F: ixor
		// @240: bipush -5 (0xFB)
		// @242: if_icmpeq @249
		// @245: goto @252
		// @248: athrow
		// @249: iinc #9 +236
		// @24C: sipush 3072 (0x0C00)
		// @24F: putstatic int game.C_100270_mi.field_102270_jc
		// @252: bipush 95 (0x5F)
		// @254: aload #4
		// @256: getfield int game.C_100327_ib.field_102494_P
		// @259: if_icmpeq @260
		// @25C: goto @263
		// @25F: athrow
		// @260: iinc #8 +236
		// @263: bipush -77 (0xB3)
		// @265: aload #4
		// @267: getfield int game.C_100327_ib.field_102494_P
		// @26A: iconst_m1
		// @26B: ixor
		// @26C: if_icmpne @27B
		// @26F: bipush 102 (0x66)
		// @271: bipush 119 (0x77)
		// @273: invokestatic game.C_100209_qb.func_102686_b(int, byte)game.C_100327_ib
		// @276: astore #4
		// @278: iinc #8 +236
		// @27B: aload #4
		// @27D: getfield int game.C_100327_ib.field_102494_P
		// @280: iconst_m1
		// @281: ixor
		// @282: bipush -67 (0xBD)
		// @284: if_icmpeq @28B
		// @287: goto @297
		// @28A: athrow
		// @28B: iinc #8 +236
		// @28E: bipush 99 (0x63)
		// @290: bipush 94 (0x5E)
		// @292: invokestatic game.C_100209_qb.func_102686_b(int, byte)game.C_100327_ib
		// @295: astore #4
		// @297: sipush 2048 (0x0800)
		// @29A: aload #4
		// @29C: getfield int game.C_100327_ib.field_102497_w
		// @29F: if_icmpne @2AF
		// @2A2: sipush 2048 (0x0800)
		// @2A5: putstatic int game.C_100270_mi.field_102270_jc
		// @2A8: iinc #9 +236
		// @2AB: goto @2AF
		// @2AE: athrow
		// @2AF: aload #4
		// @2B1: getfield int game.C_100327_ib.field_102494_P
		// @2B4: iconst_m1
		// @2B5: ixor
		// @2B6: bipush -81 (0xAF)
		// @2B8: if_icmpne @2C5
		// @2BB: iinc #8 +246
		// @2BE: iinc #9 +10
		// @2C1: goto @2C5
		// @2C4: athrow
		// @2C5: aload #4
		// @2C7: getfield int game.C_100327_ib.field_102497_w
		// @2CA: bipush 8 (0x08)
		// @2CC: if_icmpne @2D6
		// @2CF: iinc #9 +20
		// @2D2: goto @2D6
		// @2D5: athrow
		// @2D6: bipush 59 (0x3B)
		// @2D8: aload #4
		// @2DA: getfield int game.C_100327_ib.field_102494_P
		// @2DD: if_icmpeq @2E4
		// @2E0: goto @2E7
		// @2E3: athrow
		// @2E4: iinc #9 +231
		// @2E7: aload #4
		// @2E9: getfield int game.C_100327_ib.field_102494_P
		// @2EC: bipush 71 (0x47)
		// @2EE: if_icmpeq @2F5
		// @2F1: goto @2F8
		// @2F4: athrow
		// @2F5: iinc #9 +241
		// @2F8: bipush -78 (0xB2)
		// @2FA: aload #4
		// @2FC: getfield int game.C_100327_ib.field_102494_P
		// @2FF: iconst_m1
		// @300: ixor
		// @301: if_icmpne @30B
		// @304: iinc #9 +246
		// @307: goto @30B
		// @30A: athrow
		// @30B: aload #4
		// @30D: getfield int game.C_100327_ib.field_102494_P
		// @310: istore #11
		// @312: iload #11
		// @314: iconst_m1
		// @315: ixor
		// @316: bipush -2 (0xFE)
		// @318: if_icmpeq @66E
		// @31B: iload #11
		// @31D: bipush 53 (0x35)
		// @31F: if_icmpne @32F
		// @322: goto @326
		// @325: athrow
		// @326: iload #12
		// @328: ifeq @679
		// @32B: goto @32F
		// @32E: athrow
		// @32F: iload #11
		// @331: bipush 60 (0x3C)
		// @333: if_icmpne @343
		// @336: goto @33A
		// @339: athrow
		// @33A: iload #12
		// @33C: ifeq @688
		// @33F: goto @343
		// @342: athrow
		// @343: iload #11
		// @345: iconst_m1
		// @346: ixor
		// @347: bipush -62 (0xC2)
		// @349: if_icmpeq @697
		// @34C: goto @350
		// @34F: athrow
		// @350: iload #11
		// @352: bipush 64 (0x40)
		// @354: if_icmpne @364
		// @357: goto @35B
		// @35A: athrow
		// @35B: iload #12
		// @35D: ifeq @6A6
		// @360: goto @364
		// @363: athrow
		// @364: iload #11
		// @366: bipush 68 (0x44)
		// @368: if_icmpeq @6B2
		// @36B: goto @36F
		// @36E: athrow
		// @36F: iload #11
		// @371: bipush 74 (0x4A)
		// @373: if_icmpne @383
		// @376: goto @37A
		// @379: athrow
		// @37A: iload #12
		// @37C: ifeq @6C1
		// @37F: goto @383
		// @382: athrow
		// @383: iload #11
		// @385: bipush 78 (0x4E)
		// @387: if_icmpeq @6D0
		// @38A: goto @38E
		// @38D: athrow
		// @38E: iload #11
		// @390: bipush 82 (0x52)
		// @392: if_icmpeq @6DC
		// @395: goto @399
		// @398: athrow
		// @399: bipush 87 (0x57)
		// @39B: iload #11
		// @39D: if_icmpeq @6EB
		// @3A0: goto @3A4
		// @3A3: athrow
		// @3A4: bipush 91 (0x5B)
		// @3A6: iload #11
		// @3A8: if_icmpne @3B8
		// @3AB: goto @3AF
		// @3AE: athrow
		// @3AF: iload #12
		// @3B1: ifeq @6F7
		// @3B4: goto @3B8
		// @3B7: athrow
		// @3B8: bipush 95 (0x5F)
		// @3BA: iload #11
		// @3BC: if_icmpne @3CC
		// @3BF: goto @3C3
		// @3C2: athrow
		// @3C3: iload #12
		// @3C5: ifeq @709
		// @3C8: goto @3CC
		// @3CB: athrow
		// @3CC: iload #11
		// @3CE: iconst_m1
		// @3CF: ixor
		// @3D0: bipush -3 (0xFD)
		// @3D2: if_icmpeq @71E
		// @3D5: goto @3D9
		// @3D8: athrow
		// @3D9: bipush 56 (0x38)
		// @3DB: iload #11
		// @3DD: if_icmpne @3ED
		// @3E0: goto @3E4
		// @3E3: athrow
		// @3E4: iload #12
		// @3E6: ifeq @72D
		// @3E9: goto @3ED
		// @3EC: athrow
		// @3ED: bipush -67 (0xBD)
		// @3EF: iload #11
		// @3F1: iconst_m1
		// @3F2: ixor
		// @3F3: if_icmpeq @73F
		// @3F6: goto @3FA
		// @3F9: athrow
		// @3FA: bipush 99 (0x63)
		// @3FC: iload #11
		// @3FE: if_icmpeq @73F
		// @401: goto @405
		// @404: athrow
		// @405: bipush -71 (0xB9)
		// @407: iload #11
		// @409: iconst_m1
		// @40A: ixor
		// @40B: if_icmpeq @751
		// @40E: goto @412
		// @411: athrow
		// @412: iload #11
		// @414: bipush 76 (0x4C)
		// @416: if_icmpeq @760
		// @419: goto @41D
		// @41C: athrow
		// @41D: bipush 102 (0x66)
		// @41F: iload #11
		// @421: if_icmpeq @760
		// @424: goto @428
		// @427: athrow
		// @428: bipush -86 (0xAA)
		// @42A: iload #11
		// @42C: iconst_m1
		// @42D: ixor
		// @42E: if_icmpne @43E
		// @431: goto @435
		// @434: athrow
		// @435: iload #12
		// @437: ifeq @76F
		// @43A: goto @43E
		// @43D: athrow
		// @43E: bipush 80 (0x50)
		// @440: iload #11
		// @442: if_icmpeq @77B
		// @445: goto @449
		// @448: athrow
		// @449: bipush -90 (0xA6)
		// @44B: iload #11
		// @44D: iconst_m1
		// @44E: ixor
		// @44F: if_icmpne @45F
		// @452: goto @456
		// @455: athrow
		// @456: iload #12
		// @458: ifeq @78A
		// @45B: goto @45F
		// @45E: athrow
		// @45F: iload #11
		// @461: bipush 93 (0x5D)
		// @463: if_icmpne @473
		// @466: goto @46A
		// @469: athrow
		// @46A: iload #12
		// @46C: ifeq @79F
		// @46F: goto @473
		// @472: athrow
		// @473: iload #11
		// @475: iconst_3
		// @476: if_icmpeq @7B4
		// @479: goto @47D
		// @47C: athrow
		// @47D: bipush -55 (0xC9)
		// @47F: iload #11
		// @481: iconst_m1
		// @482: ixor
		// @483: if_icmpne @493
		// @486: goto @48A
		// @489: athrow
		// @48A: iload #12
		// @48C: ifeq @7C3
		// @48F: goto @493
		// @492: athrow
		// @493: iload #11
		// @495: iconst_m1
		// @496: ixor
		// @497: bipush -68 (0xBC)
		// @499: if_icmpne @4A9
		// @49C: goto @4A0
		// @49F: athrow
		// @4A0: iload #12
		// @4A2: ifeq @7CF
		// @4A5: goto @4A9
		// @4A8: athrow
		// @4A9: iload #11
		// @4AB: iconst_m1
		// @4AC: ixor
		// @4AD: bipush -72 (0xB8)
		// @4AF: if_icmpeq @7DE
		// @4B2: goto @4B6
		// @4B5: athrow
		// @4B6: iload #11
		// @4B8: bipush 73 (0x49)
		// @4BA: if_icmpne @4CA
		// @4BD: goto @4C1
		// @4C0: athrow
		// @4C1: iload #12
		// @4C3: ifeq @7ED
		// @4C6: goto @4CA
		// @4C9: athrow
		// @4CA: bipush -78 (0xB2)
		// @4CC: iload #11
		// @4CE: iconst_m1
		// @4CF: ixor
		// @4D0: if_icmpeq @7FC
		// @4D3: goto @4D7
		// @4D6: athrow
		// @4D7: iload #11
		// @4D9: bipush 81 (0x51)
		// @4DB: if_icmpeq @80B
		// @4DE: goto @4E2
		// @4E1: athrow
		// @4E2: iload #11
		// @4E4: bipush 86 (0x56)
		// @4E6: if_icmpne @4F6
		// @4E9: goto @4ED
		// @4EC: athrow
		// @4ED: iload #12
		// @4EF: ifeq @81D
		// @4F2: goto @4F6
		// @4F5: athrow
		// @4F6: iload #11
		// @4F8: bipush 90 (0x5A)
		// @4FA: if_icmpeq @82F
		// @4FD: goto @501
		// @500: athrow
		// @501: bipush -84 (0xAC)
		// @503: iload #11
		// @505: iconst_m1
		// @506: ixor
		// @507: if_icmpne @517
		// @50A: goto @50E
		// @50D: athrow
		// @50E: iload #12
		// @510: ifeq @83B
		// @513: goto @517
		// @516: athrow
		// @517: bipush -29 (0xE3)
		// @519: iload #11
		// @51B: iconst_m1
		// @51C: ixor
		// @51D: if_icmpeq @847
		// @520: goto @524
		// @523: athrow
		// @524: iload #11
		// @526: bipush 29 (0x1D)
		// @528: if_icmpeq @853
		// @52B: goto @52F
		// @52E: athrow
		// @52F: iload #11
		// @531: bipush 30 (0x1E)
		// @533: if_icmpne @543
		// @536: goto @53A
		// @539: athrow
		// @53A: iload #12
		// @53C: ifeq @85F
		// @53F: goto @543
		// @542: athrow
		// @543: iload #11
		// @545: bipush 31 (0x1F)
		// @547: if_icmpeq @86E
		// @54A: goto @54E
		// @54D: athrow
		// @54E: bipush -36 (0xDC)
		// @550: iload #11
		// @552: iconst_m1
		// @553: ixor
		// @554: if_icmpeq @880
		// @557: goto @55B
		// @55A: athrow
		// @55B: iload #11
		// @55D: bipush 32 (0x20)
		// @55F: if_icmpne @56F
		// @562: goto @566
		// @565: athrow
		// @566: iload #12
		// @568: ifeq @892
		// @56B: goto @56F
		// @56E: athrow
		// @56F: iload #11
		// @571: bipush 33 (0x21)
		// @573: if_icmpeq @8A4
		// @576: goto @57A
		// @579: athrow
		// @57A: bipush 34 (0x22)
		// @57C: iload #11
		// @57E: if_icmpeq @8B6
		// @581: goto @585
		// @584: athrow
		// @585: iload #11
		// @587: iconst_m1
		// @588: ixor
		// @589: bipush -39 (0xD9)
		// @58B: if_icmpeq @8C8
		// @58E: goto @592
		// @591: athrow
		// @592: bipush -44 (0xD4)
		// @594: iload #11
		// @596: iconst_m1
		// @597: ixor
		// @598: if_icmpne @5A8
		// @59B: goto @59F
		// @59E: athrow
		// @59F: iload #12
		// @5A1: ifeq @8DA
		// @5A4: goto @5A8
		// @5A7: athrow
		// @5A8: iload #11
		// @5AA: bipush 48 (0x30)
		// @5AC: if_icmpne @5BC
		// @5AF: goto @5B3
		// @5B2: athrow
		// @5B3: iload #12
		// @5B5: ifeq @8E6
		// @5B8: goto @5BC
		// @5BB: athrow
		// @5BC: iload #11
		// @5BE: bipush 52 (0x34)
		// @5C0: if_icmpeq @8F5
		// @5C3: goto @5C7
		// @5C6: athrow
		// @5C7: iload #11
		// @5C9: iconst_m1
		// @5CA: ixor
		// @5CB: bipush -47 (0xD1)
		// @5CD: if_icmpne @5DD
		// @5D0: goto @5D4
		// @5D3: athrow
		// @5D4: iload #12
		// @5D6: ifeq @907
		// @5D9: goto @5DD
		// @5DC: athrow
		// @5DD: iload #11
		// @5DF: iconst_m1
		// @5E0: ixor
		// @5E1: bipush -46 (0xD2)
		// @5E3: if_icmpeq @919
		// @5E6: goto @5EA
		// @5E9: athrow
		// @5EA: bipush -45 (0xD3)
		// @5EC: iload #11
		// @5EE: iconst_m1
		// @5EF: ixor
		// @5F0: if_icmpne @600
		// @5F3: goto @5F7
		// @5F6: athrow
		// @5F7: iload #12
		// @5F9: ifeq @92B
		// @5FC: goto @600
		// @5FF: athrow
		// @600: iload #11
		// @602: iconst_m1
		// @603: ixor
		// @604: bipush -48 (0xD0)
		// @606: if_icmpne @616
		// @609: goto @60D
		// @60C: athrow
		// @60D: iload #12
		// @60F: ifeq @93A
		// @612: goto @616
		// @615: athrow
		// @616: bipush 36 (0x24)
		// @618: iload #11
		// @61A: if_icmpne @62A
		// @61D: goto @621
		// @620: athrow
		// @621: iload #12
		// @623: ifeq @946
		// @626: goto @62A
		// @629: athrow
		// @62A: bipush -38 (0xDA)
		// @62C: iload #11
		// @62E: iconst_m1
		// @62F: ixor
		// @630: if_icmpeq @955
		// @633: goto @637
		// @636: athrow
		// @637: iload #11
		// @639: bipush 51 (0x33)
		// @63B: if_icmpne @64B
		// @63E: goto @642
		// @641: athrow
		// @642: iload #12
		// @644: ifeq @964
		// @647: goto @64B
		// @64A: athrow
		// @64B: iload #11
		// @64D: bipush 50 (0x32)
		// @64F: if_icmpne @65F
		// @652: goto @656
		// @655: athrow
		// @656: iload #12
		// @658: ifeq @973
		// @65B: goto @65F
		// @65E: athrow
		// @65F: iload #11
		// @661: bipush 49 (0x31)
		// @663: if_icmpeq @982
		// @666: goto @66A
		// @669: athrow
		// @66A: goto @98F
		// @66D: athrow
		// @66E: iinc #9 +248
		// @671: iinc #8 +5
		// @674: iload #12
		// @676: ifeq @98F
		// @679: iinc #9 +2
		// @67C: iinc #8 +249
		// @67F: iload #12
		// @681: ifeq @98F
		// @684: goto @688
		// @687: athrow
		// @688: iinc #8 +10
		// @68B: iinc #9 +252
		// @68E: iload #12
		// @690: ifeq @98F
		// @693: goto @697
		// @696: athrow
		// @697: iinc #9 +251
		// @69A: iinc #8 +252
		// @69D: iload #12
		// @69F: ifeq @98F
		// @6A2: goto @6A6
		// @6A5: athrow
		// @6A6: iinc #9 +250
		// @6A9: iload #12
		// @6AB: ifeq @98F
		// @6AE: goto @6B2
		// @6B1: athrow
		// @6B2: iinc #8 +4
		// @6B5: iinc #9 +246
		// @6B8: iload #12
		// @6BA: ifeq @98F
		// @6BD: goto @6C1
		// @6C0: athrow
		// @6C1: iinc #9 +246
		// @6C4: iinc #8 +248
		// @6C7: iload #12
		// @6C9: ifeq @98F
		// @6CC: goto @6D0
		// @6CF: athrow
		// @6D0: iinc #9 +254
		// @6D3: iload #12
		// @6D5: ifeq @98F
		// @6D8: goto @6DC
		// @6DB: athrow
		// @6DC: iinc #9 +9
		// @6DF: iinc #8 +252
		// @6E2: iload #12
		// @6E4: ifeq @98F
		// @6E7: goto @6EB
		// @6EA: athrow
		// @6EB: iinc #9 +253
		// @6EE: iload #12
		// @6F0: ifeq @98F
		// @6F3: goto @6F7
		// @6F6: athrow
		// @6F7: iinc #8 +8
		// @6FA: sipush 3000 (0x0BB8)
		// @6FD: putstatic int game.C_100270_mi.field_102270_jc
		// @700: iload #12
		// @702: ifeq @98F
		// @705: goto @709
		// @708: athrow
		// @709: iinc #9 +10
		// @70C: iinc #8 +4
		// @70F: sipush 3300 (0x0CE4)
		// @712: putstatic int game.C_100270_mi.field_102270_jc
		// @715: iload #12
		// @717: ifeq @98F
		// @71A: goto @71E
		// @71D: athrow
		// @71E: iinc #8 +249
		// @721: iinc #9 +8
		// @724: iload #12
		// @726: ifeq @98F
		// @729: goto @72D
		// @72C: athrow
		// @72D: iinc #9 +255
		// @730: sipush 2500 (0x09C4)
		// @733: putstatic int game.C_100270_mi.field_102270_jc
		// @736: iload #12
		// @738: ifeq @98F
		// @73B: goto @73F
		// @73E: athrow
		// @73F: iinc #9 +4
		// @742: sipush 2500 (0x09C4)
		// @745: putstatic int game.C_100270_mi.field_102270_jc
		// @748: iload #12
		// @74A: ifeq @98F
		// @74D: goto @751
		// @750: athrow
		// @751: iinc #8 +252
		// @754: iinc #9 +4
		// @757: iload #12
		// @759: ifeq @98F
		// @75C: goto @760
		// @75F: athrow
		// @760: sipush 2700 (0x0A8C)
		// @763: putstatic int game.C_100270_mi.field_102270_jc
		// @766: iload #12
		// @768: ifeq @98F
		// @76B: goto @76F
		// @76E: athrow
		// @76F: iinc #9 +10
		// @772: iload #12
		// @774: ifeq @98F
		// @777: goto @77B
		// @77A: athrow
		// @77B: iinc #9 +2
		// @77E: iinc #8 +4
		// @781: iload #12
		// @783: ifeq @98F
		// @786: goto @78A
		// @789: athrow
		// @78A: sipush 1600 (0x0640)
		// @78D: putstatic int game.C_100270_mi.field_102270_jc
		// @790: iinc #9 +8
		// @793: iinc #8 +6
		// @796: iload #12
		// @798: ifeq @98F
		// @79B: goto @79F
		// @79E: athrow
		// @79F: sipush 1024 (0x0400)
		// @7A2: putstatic int game.C_100270_mi.field_102270_jc
		// @7A5: iinc #9 +2
		// @7A8: iinc #8 +254
		// @7AB: iload #12
		// @7AD: ifeq @98F
		// @7B0: goto @7B4
		// @7B3: athrow
		// @7B4: iinc #9 +252
		// @7B7: iinc #8 +12
		// @7BA: iload #12
		// @7BC: ifeq @98F
		// @7BF: goto @7C3
		// @7C2: athrow
		// @7C3: iinc #9 +242
		// @7C6: iload #12
		// @7C8: ifeq @98F
		// @7CB: goto @7CF
		// @7CE: athrow
		// @7CF: iinc #9 +246
		// @7D2: iinc #8 +12
		// @7D5: iload #12
		// @7D7: ifeq @98F
		// @7DA: goto @7DE
		// @7DD: athrow
		// @7DE: iinc #8 +241
		// @7E1: iinc #9 +248
		// @7E4: iload #12
		// @7E6: ifeq @98F
		// @7E9: goto @7ED
		// @7EC: athrow
		// @7ED: sipush 2900 (0x0B54)
		// @7F0: putstatic int game.C_100270_mi.field_102270_jc
		// @7F3: iload #12
		// @7F5: ifeq @98F
		// @7F8: goto @7FC
		// @7FB: athrow
		// @7FC: iinc #8 +13
		// @7FF: iinc #9 +252
		// @802: iload #12
		// @804: ifeq @98F
		// @807: goto @80B
		// @80A: athrow
		// @80B: iinc #9 +254
		// @80E: sipush 3000 (0x0BB8)
		// @811: putstatic int game.C_100270_mi.field_102270_jc
		// @814: iload #12
		// @816: ifeq @98F
		// @819: goto @81D
		// @81C: athrow
		// @81D: iinc #8 +25
		// @820: sipush 2300 (0x08FC)
		// @823: putstatic int game.C_100270_mi.field_102270_jc
		// @826: iload #12
		// @828: ifeq @98F
		// @82B: goto @82F
		// @82E: athrow
		// @82F: iinc #9 +250
		// @832: iload #12
		// @834: ifeq @98F
		// @837: goto @83B
		// @83A: athrow
		// @83B: iinc #8 +8
		// @83E: iload #12
		// @840: ifeq @98F
		// @843: goto @847
		// @846: athrow
		// @847: iinc #8 +4
		// @84A: iload #12
		// @84C: ifeq @98F
		// @84F: goto @853
		// @852: athrow
		// @853: iinc #8 +3
		// @856: iload #12
		// @858: ifeq @98F
		// @85B: goto @85F
		// @85E: athrow
		// @85F: iinc #9 +252
		// @862: iinc #8 +3
		// @865: iload #12
		// @867: ifeq @98F
		// @86A: goto @86E
		// @86D: athrow
		// @86E: sipush 2800 (0x0AF0)
		// @871: putstatic int game.C_100270_mi.field_102270_jc
		// @874: iinc #8 +253
		// @877: iload #12
		// @879: ifeq @98F
		// @87C: goto @880
		// @87F: athrow
		// @880: iinc #8 +254
		// @883: sipush 3500 (0x0DAC)
		// @886: putstatic int game.C_100270_mi.field_102270_jc
		// @889: iload #12
		// @88B: ifeq @98F
		// @88E: goto @892
		// @891: athrow
		// @892: sipush 2800 (0x0AF0)
		// @895: putstatic int game.C_100270_mi.field_102270_jc
		// @898: iinc #8 +246
		// @89B: iload #12
		// @89D: ifeq @98F
		// @8A0: goto @8A4
		// @8A3: athrow
		// @8A4: sipush 3800 (0x0ED8)
		// @8A7: putstatic int game.C_100270_mi.field_102270_jc
		// @8AA: iinc #8 +253
		// @8AD: iload #12
		// @8AF: ifeq @98F
		// @8B2: goto @8B6
		// @8B5: athrow
		// @8B6: sipush 3800 (0x0ED8)
		// @8B9: putstatic int game.C_100270_mi.field_102270_jc
		// @8BC: iinc #8 +252
		// @8BF: iload #12
		// @8C1: ifeq @98F
		// @8C4: goto @8C8
		// @8C7: athrow
		// @8C8: sipush 3900 (0x0F3C)
		// @8CB: putstatic int game.C_100270_mi.field_102270_jc
		// @8CE: iinc #8 +254
		// @8D1: iload #12
		// @8D3: ifeq @98F
		// @8D6: goto @8DA
		// @8D9: athrow
		// @8DA: iinc #8 +8
		// @8DD: iload #12
		// @8DF: ifeq @98F
		// @8E2: goto @8E6
		// @8E5: athrow
		// @8E6: iinc #8 +4
		// @8E9: iinc #9 +255
		// @8EC: iload #12
		// @8EE: ifeq @98F
		// @8F1: goto @8F5
		// @8F4: athrow
		// @8F5: iinc #8 +3
		// @8F8: sipush 1800 (0x0708)
		// @8FB: putstatic int game.C_100270_mi.field_102270_jc
		// @8FE: iload #12
		// @900: ifeq @98F
		// @903: goto @907
		// @906: athrow
		// @907: iinc #8 +4
		// @90A: sipush 1800 (0x0708)
		// @90D: putstatic int game.C_100270_mi.field_102270_jc
		// @910: iload #12
		// @912: ifeq @98F
		// @915: goto @919
		// @918: athrow
		// @919: sipush 1550 (0x060E)
		// @91C: putstatic int game.C_100270_mi.field_102270_jc
		// @91F: iinc #8 +2
		// @922: iload #12
		// @924: ifeq @98F
		// @927: goto @92B
		// @92A: athrow
		// @92B: iinc #9 +254
		// @92E: iinc #8 +7
		// @931: iload #12
		// @933: ifeq @98F
		// @936: goto @93A
		// @939: athrow
		// @93A: iinc #8 +4
		// @93D: iload #12
		// @93F: ifeq @98F
		// @942: goto @946
		// @945: athrow
		// @946: sipush 3600 (0x0E10)
		// @949: putstatic int game.C_100270_mi.field_102270_jc
		// @94C: iload #12
		// @94E: ifeq @98F
		// @951: goto @955
		// @954: athrow
		// @955: sipush 3600 (0x0E10)
		// @958: putstatic int game.C_100270_mi.field_102270_jc
		// @95B: iload #12
		// @95D: ifeq @98F
		// @960: goto @964
		// @963: athrow
		// @964: sipush 3600 (0x0E10)
		// @967: putstatic int game.C_100270_mi.field_102270_jc
		// @96A: iload #12
		// @96C: ifeq @98F
		// @96F: goto @973
		// @972: athrow
		// @973: sipush 3600 (0x0E10)
		// @976: putstatic int game.C_100270_mi.field_102270_jc
		// @979: iload #12
		// @97B: ifeq @98F
		// @97E: goto @982
		// @981: athrow
		// @982: sipush 2200 (0x0898)
		// @985: putstatic int game.C_100270_mi.field_102270_jc
		// @988: iinc #8 +3
		// @98B: goto @98F
		// @98E: athrow
		// @98F: iconst_0
		// @990: aload #4
		// @992: getfield int game.C_100327_ib.field_102497_w
		// @995: sipush 3086 (0x0C0E)
		// @998: iand
		// @999: if_icmpeq @9AE
		// @99C: bipush 100 (0x64)
		// @99E: iload #5
		// @9A0: if_icmplt @9AB
		// @9A3: goto @9A7
		// @9A6: athrow
		// @9A7: goto @9AE
		// @9AA: athrow
		// @9AB: iinc #8 +251
		// @9AE: aload #4
		// @9B0: iload #8
		// @9B2: iconst_0
		// @9B3: iconst_0
		// @9B4: sipush 16384 (0x4000)
		// @9B7: iload #9
		// @9B9: ldc 759988816 (0x2d4c8250)
		// @9BB: invokevirtual game.C_100327_ib.func_102437_a(int, int, boolean, int, int, int)void
		// @9BE: iload #10
		// @9C0: putstatic int game.C_100270_mi.field_102270_jc
		// @9C3: getstatic game.C_100185_rm game.C_100049_vf.field_104206_l
		// @9C6: bipush 120 (0x78)
		// @9C8: invokevirtual game.C_100185_rm.func_105476_a(byte)void
		// @9CB: goto @A42
		// @9CE: astore #6
		// @9D0: aload #6
		// @9D2: new java.lang.StringBuilder
		// @9D5: dup
		// @9D6: invokespecial java.lang.StringBuilder.<init>()void
		// @9D9: getstatic java.lang.String[] game.C_100208_qg.field_105966_z
		// @9DC: iconst_3
		// @9DD: aaload
		// @9DE: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @9E1: iload_0
		// @9E2: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @9E5: bipush 44 (0x2C)
		// @9E7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9EA: iload_1
		// @9EB: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @9EE: bipush 44 (0x2C)
		// @9F0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9F3: iload_2
		// @9F4: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @9F7: bipush 44 (0x2C)
		// @9F9: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9FC: aload_3
		// @9FD: ifnull @A09
		// @A00: getstatic java.lang.String[] game.C_100208_qg.field_105966_z
		// @A03: iconst_0
		// @A04: aaload
		// @A05: goto @A0E
		// @A08: athrow
		// @A09: getstatic java.lang.String[] game.C_100208_qg.field_105966_z
		// @A0C: iconst_1
		// @A0D: aaload
		// @A0E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @A11: bipush 44 (0x2C)
		// @A13: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A16: aload #4
		// @A18: ifnull @A24
		// @A1B: getstatic java.lang.String[] game.C_100208_qg.field_105966_z
		// @A1E: iconst_0
		// @A1F: aaload
		// @A20: goto @A29
		// @A23: athrow
		// @A24: getstatic java.lang.String[] game.C_100208_qg.field_105966_z
		// @A27: iconst_1
		// @A28: aaload
		// @A29: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @A2C: bipush 44 (0x2C)
		// @A2E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A31: iload #5
		// @A33: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A36: bipush 41 (0x29)
		// @A38: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A3B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @A3E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @A41: athrow
		// @A42: return
	}
	
	static final void func_105952_a(C_100054_ec arg0, byte arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore_3
		// @04: iload_1
		// @05: bipush -35 (0xDD)
		// @07: if_icmplt @0B
		// @0A: return
		// @0B: aload_0
		// @0C: bipush 45 (0x2D)
		// @0E: invokevirtual game.C_100054_ec.func_100583_c(int)void
		// @11: getstatic game.C_100202_qi game.C_100083_c.field_103168_Q
		// @14: bipush 120 (0x78)
		// @16: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @19: checkcast game.C_100054_ec
		// @1C: astore_2
		// @1D: aload_2
		// @1E: ifnull @42
		// @21: aload_2
		// @22: iconst_0
		// @23: aload_0
		// @24: invokevirtual game.C_100054_ec.func_101949_a(int, game.C_100054_ec)boolean
		// @27: iload_3
		// @28: ifne @5E
		// @2B: ifeq @42
		// @2E: goto @32
		// @31: athrow
		// @32: getstatic game.C_100202_qi game.C_100083_c.field_103168_Q
		// @35: bipush 23 (0x17)
		// @37: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @3A: checkcast game.C_100054_ec
		// @3D: astore_2
		// @3E: iload_3
		// @3F: ifeq @1D
		// @42: aconst_null
		// @43: aload_2
		// @44: if_acmpne @58
		// @47: getstatic game.C_100202_qi game.C_100083_c.field_103168_Q
		// @4A: bipush 123 (0x7B)
		// @4C: aload_0
		// @4D: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @50: iload_3
		// @51: ifeq @63
		// @54: goto @58
		// @57: athrow
		// @58: bipush 72 (0x48)
		// @5A: goto @5E
		// @5D: athrow
		// @5E: aload_0
		// @5F: aload_2
		// @60: invokestatic game.C_100042_we.func_104130_a(int, game.C_100158_da, game.C_100158_da)void
		// @63: goto @A1
		// @66: astore_2
		// @67: aload_2
		// @68: new java.lang.StringBuilder
		// @6B: dup
		// @6C: invokespecial java.lang.StringBuilder.<init>()void
		// @6F: getstatic java.lang.String[] game.C_100208_qg.field_105966_z
		// @72: iconst_2
		// @73: aaload
		// @74: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @77: aload_0
		// @78: ifnull @84
		// @7B: getstatic java.lang.String[] game.C_100208_qg.field_105966_z
		// @7E: iconst_0
		// @7F: aaload
		// @80: goto @89
		// @83: athrow
		// @84: getstatic java.lang.String[] game.C_100208_qg.field_105966_z
		// @87: iconst_1
		// @88: aaload
		// @89: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @8C: bipush 44 (0x2C)
		// @8E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @91: iload_1
		// @92: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @95: bipush 41 (0x29)
		// @97: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @9D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @A0: athrow
		// @A1: return
	}
	
	static final C_100240_oj func_105945_a(boolean arg0, boolean arg1)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #7
		// @005: getstatic game.C_100278_nd game.C_100288_jn.field_106839_f
		// @008: astore_2
		// @009: aload_2
		// @00A: iconst_0
		// @00B: invokevirtual game.C_100278_nd.func_101156_c(boolean)int
		// @00E: istore_3
		// @00F: bipush 127 (0x7F)
		// @011: iload_3
		// @012: iand
		// @013: putstatic int game.C_100183_cd.field_103415_U
		// @016: iconst_0
		// @017: iload_3
		// @018: sipush 128 (0x0080)
		// @01B: iand
		// @01C: if_icmpeq @024
		// @01F: iconst_1
		// @020: goto @025
		// @023: athrow
		// @024: iconst_0
		// @025: putstatic boolean game.C_100277_nc.field_106705_N
		// @028: aload_2
		// @029: iconst_0
		// @02A: invokevirtual game.C_100278_nd.func_101156_c(boolean)int
		// @02D: putstatic int game.C_100071_va.field_101669_x
		// @030: aload_2
		// @031: sipush -16142 (0xC0F2)
		// @034: invokevirtual game.C_100278_nd.func_101161_i(int)long
		// @037: putstatic long game.C_100250_pl.field_106434_d
		// @03A: getstatic int game.C_100183_cd.field_103415_U
		// @03D: iconst_m1
		// @03E: ixor
		// @03F: bipush -3 (0xFD)
		// @041: if_icmpeq @055
		// @044: iconst_0
		// @045: putstatic int game.C_100003_ga.field_103544_y
		// @048: iconst_0
		// @049: putstatic int game.C_100269_ml.field_101124_o
		// @04C: iload #7
		// @04E: ifeq @06B
		// @051: goto @055
		// @054: athrow
		// @055: aload_2
		// @056: bipush -2 (0xFE)
		// @058: invokevirtual game.C_100278_nd.func_101143_l(int)int
		// @05B: putstatic int game.C_100003_ga.field_103544_y
		// @05E: aload_2
		// @05F: bipush 119 (0x77)
		// @061: invokevirtual game.C_100278_nd.func_101145_d(byte)int
		// @064: putstatic int game.C_100269_ml.field_101124_o
		// @067: goto @06B
		// @06A: athrow
		// @06B: iconst_1
		// @06C: aload_2
		// @06D: iload_0
		// @06E: invokevirtual game.C_100278_nd.func_101156_c(boolean)int
		// @071: if_icmpne @079
		// @074: iconst_1
		// @075: goto @07A
		// @078: athrow
		// @079: iconst_0
		// @07A: istore #4
		// @07C: aload_2
		// @07D: sipush 9692 (0x25DC)
		// @080: invokevirtual game.C_100278_nd.func_101164_f(int)java.lang.String
		// @083: putstatic java.lang.String game.C_100085_a.field_102566_F
		// @086: iload #4
		// @088: ifne @09A
		// @08B: getstatic java.lang.String game.C_100085_a.field_102566_F
		// @08E: putstatic java.lang.String game.C_100231_oc.field_102205_kc
		// @091: iload #7
		// @093: ifeq @0A8
		// @096: goto @09A
		// @099: athrow
		// @09A: aload_2
		// @09B: sipush 9692 (0x25DC)
		// @09E: invokevirtual game.C_100278_nd.func_101164_f(int)java.lang.String
		// @0A1: putstatic java.lang.String game.C_100231_oc.field_102205_kc
		// @0A4: goto @0A8
		// @0A7: athrow
		// @0A8: getstatic int game.C_100183_cd.field_103415_U
		// @0AB: iconst_1
		// @0AC: if_icmpeq @0BD
		// @0AF: getstatic int game.C_100183_cd.field_103415_U
		// @0B2: iconst_m1
		// @0B3: ixor
		// @0B4: bipush -5 (0xFB)
		// @0B6: if_icmpne @0D9
		// @0B9: goto @0BD
		// @0BC: athrow
		// @0BD: aload_2
		// @0BE: bipush -2 (0xFE)
		// @0C0: invokevirtual game.C_100278_nd.func_101143_l(int)int
		// @0C3: putstatic int game.C_100016_wi.field_103802_d
		// @0C6: aload_2
		// @0C7: sipush 9692 (0x25DC)
		// @0CA: invokevirtual game.C_100278_nd.func_101164_f(int)java.lang.String
		// @0CD: putstatic java.lang.String game.C_100089_fa.field_103724_g
		// @0D0: iload #7
		// @0D2: ifeq @0E5
		// @0D5: goto @0D9
		// @0D8: athrow
		// @0D9: iconst_0
		// @0DA: putstatic int game.C_100016_wi.field_103802_d
		// @0DD: aconst_null
		// @0DE: putstatic java.lang.String game.C_100089_fa.field_103724_g
		// @0E1: goto @0E5
		// @0E4: athrow
		// @0E5: iload_1
		// @0E6: ifeq @13E
		// @0E9: aload_2
		// @0EA: bipush -2 (0xFE)
		// @0EC: invokevirtual game.C_100278_nd.func_101143_l(int)int
		// @0EF: istore #5
		// @0F1: getstatic game.C_100137_bn game.C_100302_ka.field_101847_wb
		// @0F4: iload #5
		// @0F6: bipush 28 (0x1C)
		// @0F8: invokevirtual game.C_100137_bn.func_105026_a(int, byte)game.C_100066_dl
		// @0FB: astore #6
		// @0FD: aload #6
		// @0FF: bipush 114 (0x72)
		// @101: invokevirtual game.C_100066_dl.func_101620_k(int)java.lang.String
		// @104: putstatic java.lang.String game.C_100022_hf.field_103907_i
		// @107: getstatic java.lang.String game.C_100231_oc.field_102205_kc
		// @10A: getstatic java.lang.String game.C_100339_jb.field_107391_h
		// @10D: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @110: ifeq @118
		// @113: aconst_null
		// @114: goto @11D
		// @117: athrow
		// @118: aload #6
		// @11A: getfield int[] game.C_100066_dl.field_101643_s
		// @11D: putstatic int[] game.C_100269_ml.field_101125_l
		// @120: goto @139
		// @123: astore #6
		// @125: iconst_1
		// @126: getstatic java.lang.String[] game.C_100208_qg.field_105966_z
		// @129: bipush 9 (0x09)
		// @12B: aaload
		// @12C: aload #6
		// @12E: invokestatic game.C_100036_gg.func_103142_a(int, java.lang.String, java.lang.Throwable)void
		// @131: aconst_null
		// @132: putstatic java.lang.String game.C_100022_hf.field_103907_i
		// @135: aconst_null
		// @136: putstatic int[] game.C_100269_ml.field_101125_l
		// @139: iload #7
		// @13B: ifeq @152
		// @13E: bipush 80 (0x50)
		// @140: aload_2
		// @141: sipush -25438 (0x9CA2)
		// @144: invokestatic game.C_100089_fa.func_103719_a(int, game.C_100280_nf, int)java.lang.String
		// @147: putstatic java.lang.String game.C_100022_hf.field_103907_i
		// @14A: aconst_null
		// @14B: putstatic int[] game.C_100269_ml.field_101125_l
		// @14E: goto @152
		// @151: athrow
		// @152: new game.C_100240_oj
		// @155: dup
		// @156: iload_1
		// @157: invokespecial game.C_100240_oj.<init>(boolean)void
		// @15A: areturn
		// @15B: astore_2
		// @15C: aload_2
		// @15D: new java.lang.StringBuilder
		// @160: dup
		// @161: invokespecial java.lang.StringBuilder.<init>()void
		// @164: getstatic java.lang.String[] game.C_100208_qg.field_105966_z
		// @167: bipush 8 (0x08)
		// @169: aaload
		// @16A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @16D: iload_0
		// @16E: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @171: bipush 44 (0x2C)
		// @173: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @176: iload_1
		// @177: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @17A: bipush 41 (0x29)
		// @17C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @17F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @182: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @185: athrow
	}
	
	final C_100216_aj func_105953_a(int arg0, boolean arg1, int arg2, C_100091_m arg3, C_100091_m arg4)
	{
		// @000: aload_0
		// @001: getfield game.C_100280_nf game.C_100208_qg.field_105959_c
		// @004: ifnonnull @010
		// @007: new java.lang.RuntimeException
		// @00A: dup
		// @00B: invokespecial java.lang.RuntimeException.<init>()void
		// @00E: athrow
		// @00F: athrow
		// @010: iconst_0
		// @011: iload_3
		// @012: if_icmpgt @02A
		// @015: aload_0
		// @016: getfield game.C_100216_aj[] game.C_100208_qg.field_105956_d
		// @019: arraylength
		// @01A: iconst_m1
		// @01B: ixor
		// @01C: iload_3
		// @01D: iconst_m1
		// @01E: ixor
		// @01F: if_icmpge @02A
		// @022: goto @026
		// @025: athrow
		// @026: goto @032
		// @029: athrow
		// @02A: new java.lang.RuntimeException
		// @02D: dup
		// @02E: invokespecial java.lang.RuntimeException.<init>()void
		// @031: athrow
		// @032: iload_1
		// @033: sipush 19286 (0x4B56)
		// @036: if_icmpeq @03E
		// @039: aconst_null
		// @03A: checkcast game.C_100216_aj
		// @03D: areturn
		// @03E: aconst_null
		// @03F: aload_0
		// @040: getfield game.C_100216_aj[] game.C_100208_qg.field_105956_d
		// @043: iload_3
		// @044: aaload
		// @045: if_acmpeq @04F
		// @048: aload_0
		// @049: getfield game.C_100216_aj[] game.C_100208_qg.field_105956_d
		// @04C: iload_3
		// @04D: aaload
		// @04E: areturn
		// @04F: aload_0
		// @050: getfield game.C_100280_nf game.C_100208_qg.field_105959_c
		// @053: iload_3
		// @054: bipush 72 (0x48)
		// @056: imul
		// @057: bipush 6 (0x06)
		// @059: iadd
		// @05A: putfield int game.C_100280_nf.field_101177_n
		// @05D: aload_0
		// @05E: getfield game.C_100280_nf game.C_100208_qg.field_105959_c
		// @061: sipush -1543 (0xF9F9)
		// @064: invokevirtual game.C_100280_nf.func_101171_e(int)int
		// @067: istore #6
		// @069: aload_0
		// @06A: getfield game.C_100280_nf game.C_100208_qg.field_105959_c
		// @06D: sipush -1543 (0xF9F9)
		// @070: invokevirtual game.C_100280_nf.func_101171_e(int)int
		// @073: istore #7
		// @075: bipush 64 (0x40)
		// @077: newarray byte[]
		// @079: astore #8
		// @07B: aload_0
		// @07C: getfield game.C_100280_nf game.C_100208_qg.field_105959_c
		// @07F: aload #8
		// @081: bipush 64 (0x40)
		// @083: iconst_0
		// @084: sipush -7623 (0xE239)
		// @087: invokevirtual game.C_100280_nf.func_101149_a(byte[], int, int, int)void
		// @08A: new game.C_100216_aj
		// @08D: dup
		// @08E: iload_3
		// @08F: aload #4
		// @091: aload #5
		// @093: aload_0
		// @094: getfield game.C_100104_v game.C_100208_qg.field_105963_k
		// @097: aload_0
		// @098: getfield game.C_100178_cg game.C_100208_qg.field_105954_f
		// @09B: iload #6
		// @09D: aload #8
		// @09F: iload #7
		// @0A1: iload_2
		// @0A2: invokespecial game.C_100216_aj.<init>(int, game.C_100091_m, game.C_100091_m, game.C_100104_v, game.C_100178_cg, int, byte[], int, boolean)void
		// @0A5: astore #9
		// @0A7: aload_0
		// @0A8: getfield game.C_100216_aj[] game.C_100208_qg.field_105956_d
		// @0AB: iload_3
		// @0AC: aload #9
		// @0AE: aastore
		// @0AF: aload #9
		// @0B1: areturn
		// @0B2: astore #6
		// @0B4: aload #6
		// @0B6: new java.lang.StringBuilder
		// @0B9: dup
		// @0BA: invokespecial java.lang.StringBuilder.<init>()void
		// @0BD: getstatic java.lang.String[] game.C_100208_qg.field_105966_z
		// @0C0: bipush 6 (0x06)
		// @0C2: aaload
		// @0C3: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0C6: iload_1
		// @0C7: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0CA: bipush 44 (0x2C)
		// @0CC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0CF: iload_2
		// @0D0: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @0D3: bipush 44 (0x2C)
		// @0D5: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0D8: iload_3
		// @0D9: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0DC: bipush 44 (0x2C)
		// @0DE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0E1: aload #4
		// @0E3: ifnull @0EF
		// @0E6: getstatic java.lang.String[] game.C_100208_qg.field_105966_z
		// @0E9: iconst_0
		// @0EA: aaload
		// @0EB: goto @0F4
		// @0EE: athrow
		// @0EF: getstatic java.lang.String[] game.C_100208_qg.field_105966_z
		// @0F2: iconst_1
		// @0F3: aaload
		// @0F4: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0F7: bipush 44 (0x2C)
		// @0F9: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0FC: aload #5
		// @0FE: ifnull @10A
		// @101: getstatic java.lang.String[] game.C_100208_qg.field_105966_z
		// @104: iconst_0
		// @105: aaload
		// @106: goto @10F
		// @109: athrow
		// @10A: getstatic java.lang.String[] game.C_100208_qg.field_105966_z
		// @10D: iconst_1
		// @10E: aaload
		// @10F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @112: bipush 41 (0x29)
		// @114: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @117: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @11A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @11D: athrow
	}
	
	final boolean func_105946_a(boolean arg0)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #8
		// @005: aload_0
		// @006: getfield game.C_100280_nf game.C_100208_qg.field_105959_c
		// @009: ifnull @00E
		// @00C: iconst_1
		// @00D: ireturn
		// @00E: aload_0
		// @00F: getfield game.C_100192_rf game.C_100208_qg.field_105961_l
		// @012: ifnonnull @03F
		// @015: aload_0
		// @016: getfield game.C_100104_v game.C_100208_qg.field_105963_k
		// @019: iconst_0
		// @01A: invokevirtual game.C_100104_v.func_104674_c(int)boolean
		// @01D: ifne @028
		// @020: goto @024
		// @023: athrow
		// @024: goto @02A
		// @027: athrow
		// @028: iconst_0
		// @029: ireturn
		// @02A: aload_0
		// @02B: aload_0
		// @02C: getfield game.C_100104_v game.C_100208_qg.field_105963_k
		// @02F: iconst_1
		// @030: sipush 255 (0x00FF)
		// @033: sipush 255 (0x00FF)
		// @036: bipush 127 (0x7F)
		// @038: iconst_0
		// @039: invokevirtual game.C_100104_v.func_104683_a(boolean, int, int, int, byte)game.C_100192_rf
		// @03C: putfield game.C_100192_rf game.C_100208_qg.field_105961_l
		// @03F: aload_0
		// @040: getfield game.C_100192_rf game.C_100208_qg.field_105961_l
		// @043: getfield boolean game.C_100192_rf.field_101661_C
		// @046: ifeq @04B
		// @049: iconst_0
		// @04A: ireturn
		// @04B: new game.C_100280_nf
		// @04E: dup
		// @04F: aload_0
		// @050: getfield game.C_100192_rf game.C_100208_qg.field_105961_l
		// @053: sipush -20679 (0xAF39)
		// @056: invokevirtual game.C_100192_rf.func_101649_j(int)byte[]
		// @059: invokespecial game.C_100280_nf.<init>(byte[])void
		// @05C: astore_2
		// @05D: aload_2
		// @05E: iconst_5
		// @05F: putfield int game.C_100280_nf.field_101177_n
		// @062: aload_2
		// @063: iconst_0
		// @064: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @067: istore_3
		// @068: aload_2
		// @069: dup
		// @06A: getfield int game.C_100280_nf.field_101177_n
		// @06D: iload_3
		// @06E: bipush 72 (0x48)
		// @070: imul
		// @071: iadd
		// @072: putfield int game.C_100280_nf.field_101177_n
		// @075: aload_2
		// @076: getfield byte[] game.C_100280_nf.field_101179_l
		// @079: arraylength
		// @07A: aload_2
		// @07B: getfield int game.C_100280_nf.field_101177_n
		// @07E: ineg
		// @07F: iadd
		// @080: newarray byte[]
		// @082: astore #4
		// @084: aload_2
		// @085: aload #4
		// @087: aload #4
		// @089: arraylength
		// @08A: iconst_0
		// @08B: sipush -7623 (0xE239)
		// @08E: invokevirtual game.C_100280_nf.func_101149_a(byte[], int, int, int)void
		// @091: aconst_null
		// @092: aload_0
		// @093: getfield java.math.BigInteger game.C_100208_qg.field_105958_b
		// @096: if_acmpeq @0A5
		// @099: aconst_null
		// @09A: aload_0
		// @09B: getfield java.math.BigInteger game.C_100208_qg.field_105960_a
		// @09E: if_acmpne @0AE
		// @0A1: goto @0A5
		// @0A4: athrow
		// @0A5: aload #4
		// @0A7: astore #5
		// @0A9: iload #8
		// @0AB: ifeq @0CF
		// @0AE: new java.math.BigInteger
		// @0B1: dup
		// @0B2: aload #4
		// @0B4: invokespecial java.math.BigInteger.<init>(byte[])void
		// @0B7: astore #6
		// @0B9: aload #6
		// @0BB: aload_0
		// @0BC: getfield java.math.BigInteger game.C_100208_qg.field_105958_b
		// @0BF: aload_0
		// @0C0: getfield java.math.BigInteger game.C_100208_qg.field_105960_a
		// @0C3: invokevirtual java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)java.math.BigInteger
		// @0C6: astore #7
		// @0C8: aload #7
		// @0CA: invokevirtual java.math.BigInteger.toByteArray()byte[]
		// @0CD: astore #5
		// @0CF: bipush -66 (0xBE)
		// @0D1: aload #5
		// @0D3: arraylength
		// @0D4: iconst_m1
		// @0D5: ixor
		// @0D6: if_icmpne @0DD
		// @0D9: goto @0E5
		// @0DC: athrow
		// @0DD: new java.lang.RuntimeException
		// @0E0: dup
		// @0E1: invokespecial java.lang.RuntimeException.<init>()void
		// @0E4: athrow
		// @0E5: bipush -5 (0xFB)
		// @0E7: aload #4
		// @0E9: arraylength
		// @0EA: ineg
		// @0EB: aload_2
		// @0EC: getfield int game.C_100280_nf.field_101177_n
		// @0EF: iadd
		// @0F0: iadd
		// @0F1: iconst_2
		// @0F2: iconst_5
		// @0F3: aload_2
		// @0F4: getfield byte[] game.C_100280_nf.field_101179_l
		// @0F7: invokestatic game.C_100087_n.func_100681_a(int, byte, int, byte[])byte[]
		// @0FA: astore #6
		// @0FC: iload_1
		// @0FD: iconst_1
		// @0FE: if_icmpeq @109
		// @101: iconst_0
		// @102: putstatic boolean game.C_100208_qg.field_105957_e
		// @105: goto @109
		// @108: athrow
		// @109: iconst_0
		// @10A: istore #7
		// @10C: iload #7
		// @10E: iconst_m1
		// @10F: ixor
		// @110: bipush -65 (0xBF)
		// @112: if_icmple @145
		// @115: aload #6
		// @117: iload #7
		// @119: baload
		// @11A: iconst_m1
		// @11B: ixor
		// @11C: iload #8
		// @11E: ifne @153
		// @121: aload #5
		// @123: iload #7
		// @125: iconst_m1
		// @126: isub
		// @127: baload
		// @128: iconst_m1
		// @129: ixor
		// @12A: if_icmpne @135
		// @12D: goto @131
		// @130: athrow
		// @131: goto @13D
		// @134: athrow
		// @135: new java.lang.RuntimeException
		// @138: dup
		// @139: invokespecial java.lang.RuntimeException.<init>()void
		// @13C: athrow
		// @13D: iinc #7 +1
		// @140: iload #8
		// @142: ifeq @10C
		// @145: aload_0
		// @146: aload_2
		// @147: putfield game.C_100280_nf game.C_100208_qg.field_105959_c
		// @14A: aload_0
		// @14B: iload_3
		// @14C: anewarray game.C_100216_aj
		// @14F: putfield game.C_100216_aj[] game.C_100208_qg.field_105956_d
		// @152: iconst_1
		// @153: ireturn
		// @154: astore_2
		// @155: aload_2
		// @156: new java.lang.StringBuilder
		// @159: dup
		// @15A: invokespecial java.lang.StringBuilder.<init>()void
		// @15D: getstatic java.lang.String[] game.C_100208_qg.field_105966_z
		// @160: bipush 7 (0x07)
		// @162: aaload
		// @163: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @166: iload_1
		// @167: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @16A: bipush 41 (0x29)
		// @16C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @16F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @172: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @175: athrow
	}
	
	final void func_105948_a(int arg0)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore_3
		// @04: aload_0
		// @05: getfield game.C_100216_aj[] game.C_100208_qg.field_105956_d
		// @08: ifnonnull @0C
		// @0B: return
		// @0C: iconst_0
		// @0D: istore_2
		// @0E: aload_0
		// @0F: getfield game.C_100216_aj[] game.C_100208_qg.field_105956_d
		// @12: arraylength
		// @13: iload_2
		// @14: if_icmple @3E
		// @17: iload_3
		// @18: ifne @45
		// @1B: aconst_null
		// @1C: aload_0
		// @1D: getfield game.C_100216_aj[] game.C_100208_qg.field_105956_d
		// @20: iload_2
		// @21: aaload
		// @22: if_acmpne @2D
		// @25: goto @29
		// @28: athrow
		// @29: goto @37
		// @2C: athrow
		// @2D: aload_0
		// @2E: getfield game.C_100216_aj[] game.C_100208_qg.field_105956_d
		// @31: iload_2
		// @32: aaload
		// @33: iconst_0
		// @34: invokevirtual game.C_100216_aj.func_104438_b(boolean)void
		// @37: iinc #2 +1
		// @3A: iload_3
		// @3B: ifeq @0E
		// @3E: iload_1
		// @3F: bipush 8 (0x08)
		// @41: if_icmpeq @45
		// @44: return
		// @45: iconst_0
		// @46: istore_2
		// @47: iload_2
		// @48: aload_0
		// @49: getfield game.C_100216_aj[] game.C_100208_qg.field_105956_d
		// @4C: arraylength
		// @4D: if_icmpge @76
		// @50: iload_3
		// @51: ifne @9B
		// @54: aload_0
		// @55: getfield game.C_100216_aj[] game.C_100208_qg.field_105956_d
		// @58: iload_2
		// @59: aaload
		// @5A: ifnull @6F
		// @5D: goto @61
		// @60: athrow
		// @61: aload_0
		// @62: getfield game.C_100216_aj[] game.C_100208_qg.field_105956_d
		// @65: iload_2
		// @66: aaload
		// @67: iconst_1
		// @68: invokevirtual game.C_100216_aj.func_104442_a(byte)void
		// @6B: goto @6F
		// @6E: athrow
		// @6F: iinc #2 +1
		// @72: iload_3
		// @73: ifeq @47
		// @76: goto @9B
		// @79: astore_2
		// @7A: aload_2
		// @7B: new java.lang.StringBuilder
		// @7E: dup
		// @7F: invokespecial java.lang.StringBuilder.<init>()void
		// @82: getstatic java.lang.String[] game.C_100208_qg.field_105966_z
		// @85: bipush 10 (0x0A)
		// @87: aaload
		// @88: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @8B: iload_1
		// @8C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8F: bipush 41 (0x29)
		// @91: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @94: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @97: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @9A: athrow
		// @9B: return
	}
	
	private C_100208_qg(C_100104_v arg0, C_100178_cg arg1, BigInteger arg2, BigInteger arg3)
	{
		// @00: aload_0
		// @01: invokespecial java.lang.Object.<init>()void
		// @04: aload_0
		// @05: aload_1
		// @06: putfield game.C_100104_v game.C_100208_qg.field_105963_k
		// @09: aload_0
		// @0A: aload_2
		// @0B: putfield game.C_100178_cg game.C_100208_qg.field_105954_f
		// @0E: aload_0
		// @0F: aload_3
		// @10: putfield java.math.BigInteger game.C_100208_qg.field_105958_b
		// @13: aload_0
		// @14: aload #4
		// @16: putfield java.math.BigInteger game.C_100208_qg.field_105960_a
		// @19: aload_0
		// @1A: getfield game.C_100104_v game.C_100208_qg.field_105963_k
		// @1D: iconst_0
		// @1E: invokevirtual game.C_100104_v.func_104674_c(int)boolean
		// @21: ifeq @27
		// @24: goto @3C
		// @27: aload_0
		// @28: aload_0
		// @29: getfield game.C_100104_v game.C_100208_qg.field_105963_k
		// @2C: iconst_1
		// @2D: sipush 255 (0x00FF)
		// @30: sipush 255 (0x00FF)
		// @33: bipush 127 (0x7F)
		// @35: iconst_0
		// @36: invokevirtual game.C_100104_v.func_104683_a(boolean, int, int, int, byte)game.C_100192_rf
		// @39: putfield game.C_100192_rf game.C_100208_qg.field_105961_l
		// @3C: goto @C3
		// @3F: astore #5
		// @41: aload #5
		// @43: new java.lang.StringBuilder
		// @46: dup
		// @47: invokespecial java.lang.StringBuilder.<init>()void
		// @4A: getstatic java.lang.String[] game.C_100208_qg.field_105966_z
		// @4D: bipush 11 (0x0B)
		// @4F: aaload
		// @50: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @53: aload_1
		// @54: ifnull @60
		// @57: getstatic java.lang.String[] game.C_100208_qg.field_105966_z
		// @5A: iconst_0
		// @5B: aaload
		// @5C: goto @65
		// @5F: athrow
		// @60: getstatic java.lang.String[] game.C_100208_qg.field_105966_z
		// @63: iconst_1
		// @64: aaload
		// @65: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @68: bipush 44 (0x2C)
		// @6A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6D: aload_2
		// @6E: ifnull @7A
		// @71: getstatic java.lang.String[] game.C_100208_qg.field_105966_z
		// @74: iconst_0
		// @75: aaload
		// @76: goto @7F
		// @79: athrow
		// @7A: getstatic java.lang.String[] game.C_100208_qg.field_105966_z
		// @7D: iconst_1
		// @7E: aaload
		// @7F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @82: bipush 44 (0x2C)
		// @84: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @87: aload_3
		// @88: ifnull @94
		// @8B: getstatic java.lang.String[] game.C_100208_qg.field_105966_z
		// @8E: iconst_0
		// @8F: aaload
		// @90: goto @99
		// @93: athrow
		// @94: getstatic java.lang.String[] game.C_100208_qg.field_105966_z
		// @97: iconst_1
		// @98: aaload
		// @99: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @9C: bipush 44 (0x2C)
		// @9E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A1: aload #4
		// @A3: ifnull @AF
		// @A6: getstatic java.lang.String[] game.C_100208_qg.field_105966_z
		// @A9: iconst_0
		// @AA: aaload
		// @AB: goto @B4
		// @AE: athrow
		// @AF: getstatic java.lang.String[] game.C_100208_qg.field_105966_z
		// @B2: iconst_1
		// @B3: aaload
		// @B4: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @B7: bipush 41 (0x29)
		// @B9: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @BC: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @BF: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @C2: athrow
		// @C3: return
	}
	
	static
	{
		// @00: bipush 12 (0x0C)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "\u0011/\u001a\u0014\u0002"
		// @09: invokestatic game.C_100208_qg.func_105950_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100208_qg.func_105949_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "\u0004tXV"
		// @14: invokestatic game.C_100208_qg.func_105950_z(java.lang.String)char[]
		// @17: invokestatic game.C_100208_qg.func_105949_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "\u001bf\u001a}W"
		// @1F: invokestatic game.C_100208_qg.func_105950_z(java.lang.String)char[]
		// @22: invokestatic game.C_100208_qg.func_105949_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "\u001bf\u001a|W"
		// @2A: invokestatic game.C_100208_qg.func_105950_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100208_qg.func_105949_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "\u001bf\u001ayW"
		// @35: invokestatic game.C_100208_qg.func_105950_z(java.lang.String)char[]
		// @38: invokestatic game.C_100208_qg.func_105949_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "\u001bf\u001axW"
		// @40: invokestatic game.C_100208_qg.func_105950_z(java.lang.String)char[]
		// @43: invokestatic game.C_100208_qg.func_105949_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "\u001bf\u001a~W"
		// @4C: invokestatic game.C_100208_qg.func_105950_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100208_qg.func_105949_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "\u001bf\u001arW"
		// @58: invokestatic game.C_100208_qg.func_105950_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100208_qg.func_105949_z(char[])java.lang.String
		// @5E: aastore
		// @5F: dup
		// @60: bipush 8 (0x08)
		// @62: ldc "\u001bf\u001a\u007fW"
		// @64: invokestatic game.C_100208_qg.func_105950_z(java.lang.String)char[]
		// @67: invokestatic game.C_100208_qg.func_105949_z(char[])java.lang.String
		// @6A: aastore
		// @6B: dup
		// @6C: bipush 9 (0x09)
		// @6E: ldc ")B\u0005"
		// @70: invokestatic game.C_100208_qg.func_105950_z(java.lang.String)char[]
		// @73: invokestatic game.C_100208_qg.func_105949_z(char[])java.lang.String
		// @76: aastore
		// @77: dup
		// @78: bipush 10 (0x0A)
		// @7A: ldc "\u001bf\u001a{W"
		// @7C: invokestatic game.C_100208_qg.func_105950_z(java.lang.String)char[]
		// @7F: invokestatic game.C_100208_qg.func_105949_z(char[])java.lang.String
		// @82: aastore
		// @83: dup
		// @84: bipush 11 (0x0B)
		// @86: ldc "\u001bf\u001a\u0006\u0016\u0004h@\u0004W"
		// @88: invokestatic game.C_100208_qg.func_105950_z(java.lang.String)char[]
		// @8B: invokestatic game.C_100208_qg.func_105949_z(char[])java.lang.String
		// @8E: aastore
		// @8F: putstatic java.lang.String[] game.C_100208_qg.field_105966_z
		// @92: ldc "\"dXJ"
		// @94: invokestatic game.C_100208_qg.func_105950_z(java.lang.String)char[]
		// @97: invokestatic game.C_100208_qg.func_105949_z(char[])java.lang.String
		// @9A: putstatic java.lang.String game.C_100208_qg.field_105955_g
		// @9D: iconst_m1
		// @9E: putstatic int game.C_100208_qg.field_105964_h
		// @A1: ldc "8`@S\u0011\r"
		// @A3: invokestatic game.C_100208_qg.func_105950_z(java.lang.String)char[]
		// @A6: invokestatic game.C_100208_qg.func_105949_z(char[])java.lang.String
		// @A9: putstatic java.lang.String game.C_100208_qg.field_105962_j
		// @AC: return
	}
	
	private static char[] func_105950_z(String arg0)
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
		// @0E: bipush 127 (0x7F)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_105949_z(char[] arg0)
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
		// @10: tableswitch def: @43, for 0: @30, for 1: @35, for 2: @39, for 3: @3E
		// @30: bipush 106 (0x6A)
		// @32: goto @45
		// @35: iconst_1
		// @36: goto @45
		// @39: bipush 52 (0x34)
		// @3B: goto @45
		// @3E: bipush 58 (0x3A)
		// @40: goto @45
		// @43: bipush 127 (0x7F)
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
