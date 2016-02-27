package game;

final class C_100328_ia
{
	static String field_107261_a;
	static String field_107257_d;
	static String field_107255_f;
	static String field_107260_c;
	static int[] field_107259_b;
	static String field_107256_g;
	static int field_107258_e;
	private static final String[] field_107262_z;
	
	static final void func_107250_a(byte[] arg0, int arg1)
	{
		// @000: new game.C_100280_nf
		// @003: dup
		// @004: aload_0
		// @005: invokespecial game.C_100280_nf.<init>(byte[])void
		// @008: astore_2
		// @009: aload_2
		// @00A: aload_0
		// @00B: arraylength
		// @00C: bipush -2 (0xFE)
		// @00E: iadd
		// @00F: putfield int game.C_100280_nf.field_101177_n
		// @012: iload_1
		// @013: sipush 200 (0x00C8)
		// @016: if_icmpeq @022
		// @019: bipush -10 (0xF6)
		// @01B: invokestatic game.C_100328_ia.func_107254_b(byte)void
		// @01E: goto @022
		// @021: athrow
		// @022: aload_2
		// @023: bipush -2 (0xFE)
		// @025: invokevirtual game.C_100280_nf.func_101143_l(int)int
		// @028: putstatic int game.C_100277_nc.field_106744_y
		// @02B: getstatic int game.C_100277_nc.field_106744_y
		// @02E: newarray int[]
		// @030: putstatic int[] game.C_100012_fh.field_100509_M
		// @033: getstatic int game.C_100277_nc.field_106744_y
		// @036: anewarray byte[]
		// @039: putstatic byte[][] game.C_100107_u.field_104774_c
		// @03C: getstatic int game.C_100277_nc.field_106744_y
		// @03F: newarray boolean[]
		// @041: putstatic boolean[] game.C_100160_sm.field_105416_c
		// @044: getstatic int game.C_100277_nc.field_106744_y
		// @047: newarray int[]
		// @049: putstatic int[] game.C_100312_ld.field_107156_c
		// @04C: getstatic int game.C_100277_nc.field_106744_y
		// @04F: newarray int[]
		// @051: putstatic int[] game.C_100213_ak.field_105994_d
		// @054: getstatic int game.C_100277_nc.field_106744_y
		// @057: newarray int[]
		// @059: putstatic int[] game.C_100068_vc.field_104340_f
		// @05C: getstatic int game.C_100277_nc.field_106744_y
		// @05F: anewarray byte[]
		// @062: putstatic byte[][] game.C_100034_gi.field_104039_i
		// @065: aload_2
		// @066: getstatic int game.C_100277_nc.field_106744_y
		// @069: bipush 8 (0x08)
		// @06B: imul
		// @06C: ineg
		// @06D: bipush -7 (0xF9)
		// @06F: aload_0
		// @070: arraylength
		// @071: iadd
		// @072: iadd
		// @073: putfield int game.C_100280_nf.field_101177_n
		// @076: aload_2
		// @077: bipush -2 (0xFE)
		// @079: invokevirtual game.C_100280_nf.func_101143_l(int)int
		// @07C: putstatic int game.C_100338_jc.field_105371_m
		// @07F: aload_2
		// @080: iload_1
		// @081: sipush -202 (0xFF36)
		// @084: ixor
		// @085: invokevirtual game.C_100280_nf.func_101143_l(int)int
		// @088: putstatic int game.C_100277_nc.field_106702_C
		// @08B: iconst_1
		// @08C: sipush 255 (0x00FF)
		// @08F: aload_2
		// @090: iconst_0
		// @091: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @094: iand
		// @095: iadd
		// @096: istore_3
		// @097: iconst_0
		// @098: istore #4
		// @09A: iload #4
		// @09C: iconst_m1
		// @09D: ixor
		// @09E: getstatic int game.C_100277_nc.field_106744_y
		// @0A1: iconst_m1
		// @0A2: ixor
		// @0A3: if_icmple @0B9
		// @0A6: getstatic int[] game.C_100068_vc.field_104340_f
		// @0A9: iload #4
		// @0AB: aload_2
		// @0AC: bipush -2 (0xFE)
		// @0AE: invokevirtual game.C_100280_nf.func_101143_l(int)int
		// @0B1: iastore
		// @0B2: iinc #4 +1
		// @0B5: goto @09A
		// @0B8: athrow
		// @0B9: iconst_0
		// @0BA: istore #4
		// @0BC: getstatic int game.C_100277_nc.field_106744_y
		// @0BF: iconst_m1
		// @0C0: ixor
		// @0C1: iload #4
		// @0C3: iconst_m1
		// @0C4: ixor
		// @0C5: if_icmpge @0DB
		// @0C8: getstatic int[] game.C_100012_fh.field_100509_M
		// @0CB: iload #4
		// @0CD: aload_2
		// @0CE: bipush -2 (0xFE)
		// @0D0: invokevirtual game.C_100280_nf.func_101143_l(int)int
		// @0D3: iastore
		// @0D4: iinc #4 +1
		// @0D7: goto @0BC
		// @0DA: athrow
		// @0DB: iconst_0
		// @0DC: istore #4
		// @0DE: iload #4
		// @0E0: getstatic int game.C_100277_nc.field_106744_y
		// @0E3: if_icmpge @0FE
		// @0E6: getstatic int[] game.C_100213_ak.field_105994_d
		// @0E9: iload #4
		// @0EB: aload_2
		// @0EC: iload_1
		// @0ED: sipush -202 (0xFF36)
		// @0F0: invokestatic game.C_100089_fa.func_103722_a(int, int)int
		// @0F3: invokevirtual game.C_100280_nf.func_101143_l(int)int
		// @0F6: iastore
		// @0F7: iinc #4 +1
		// @0FA: goto @0DE
		// @0FD: athrow
		// @0FE: iconst_0
		// @0FF: istore #4
		// @101: getstatic int game.C_100277_nc.field_106744_y
		// @104: iconst_m1
		// @105: ixor
		// @106: iload #4
		// @108: iconst_m1
		// @109: ixor
		// @10A: if_icmpge @120
		// @10D: getstatic int[] game.C_100312_ld.field_107156_c
		// @110: iload #4
		// @112: aload_2
		// @113: bipush -2 (0xFE)
		// @115: invokevirtual game.C_100280_nf.func_101143_l(int)int
		// @118: iastore
		// @119: iinc #4 +1
		// @11C: goto @101
		// @11F: athrow
		// @120: aload_2
		// @121: iconst_3
		// @122: iconst_3
		// @123: iload_3
		// @124: imul
		// @125: isub
		// @126: bipush -7 (0xF9)
		// @128: aload_0
		// @129: arraylength
		// @12A: iadd
		// @12B: iadd
		// @12C: bipush 8 (0x08)
		// @12E: getstatic int game.C_100277_nc.field_106744_y
		// @131: imul
		// @132: isub
		// @133: putfield int game.C_100280_nf.field_101177_n
		// @136: iload_3
		// @137: newarray int[]
		// @139: putstatic int[] game.C_100085_a.field_102573_H
		// @13C: iconst_1
		// @13D: istore #4
		// @13F: iload_3
		// @140: iload #4
		// @142: if_icmple @172
		// @145: getstatic int[] game.C_100085_a.field_102573_H
		// @148: iload #4
		// @14A: aload_2
		// @14B: bipush 115 (0x73)
		// @14D: invokevirtual game.C_100280_nf.func_101145_d(byte)int
		// @150: iastore
		// @151: getstatic int[] game.C_100085_a.field_102573_H
		// @154: iload #4
		// @156: iaload
		// @157: iconst_m1
		// @158: ixor
		// @159: iconst_m1
		// @15A: if_icmpne @16C
		// @15D: goto @161
		// @160: athrow
		// @161: getstatic int[] game.C_100085_a.field_102573_H
		// @164: iload #4
		// @166: iconst_1
		// @167: iastore
		// @168: goto @16C
		// @16B: athrow
		// @16C: iinc #4 +1
		// @16F: goto @13F
		// @172: aload_2
		// @173: iconst_0
		// @174: putfield int game.C_100280_nf.field_101177_n
		// @177: iconst_0
		// @178: istore #4
		// @17A: getstatic int game.C_100277_nc.field_106744_y
		// @17D: iconst_m1
		// @17E: ixor
		// @17F: iload #4
		// @181: iconst_m1
		// @182: ixor
		// @183: if_icmpge @2C0
		// @186: getstatic int[] game.C_100213_ak.field_105994_d
		// @189: iload #4
		// @18B: iaload
		// @18C: istore #5
		// @18E: getstatic int[] game.C_100312_ld.field_107156_c
		// @191: iload #4
		// @193: iaload
		// @194: istore #6
		// @196: iload #5
		// @198: iload #6
		// @19A: imul
		// @19B: istore #7
		// @19D: iload #7
		// @19F: newarray byte[]
		// @1A1: astore #8
		// @1A3: getstatic byte[][] game.C_100107_u.field_104774_c
		// @1A6: iload #4
		// @1A8: aload #8
		// @1AA: aastore
		// @1AB: iload #7
		// @1AD: newarray byte[]
		// @1AF: astore #9
		// @1B1: getstatic byte[][] game.C_100034_gi.field_104039_i
		// @1B4: iload #4
		// @1B6: aload #9
		// @1B8: aastore
		// @1B9: iconst_0
		// @1BA: istore #10
		// @1BC: aload_2
		// @1BD: iconst_0
		// @1BE: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @1C1: istore #11
		// @1C3: iconst_m1
		// @1C4: iconst_1
		// @1C5: iload #11
		// @1C7: iand
		// @1C8: iconst_m1
		// @1C9: ixor
		// @1CA: if_icmpeq @258
		// @1CD: iconst_0
		// @1CE: istore #12
		// @1D0: iload #12
		// @1D2: iload #5
		// @1D4: if_icmpge @1FF
		// @1D7: iconst_0
		// @1D8: istore #13
		// @1DA: iload #6
		// @1DC: iload #13
		// @1DE: if_icmple @1F9
		// @1E1: aload #8
		// @1E3: iload #13
		// @1E5: iload #5
		// @1E7: imul
		// @1E8: iload #12
		// @1EA: iadd
		// @1EB: aload_2
		// @1EC: bipush -128 (0x80)
		// @1EE: invokevirtual game.C_100280_nf.func_101146_c(byte)byte
		// @1F1: bastore
		// @1F2: iinc #13 +1
		// @1F5: goto @1DA
		// @1F8: athrow
		// @1F9: iinc #12 +1
		// @1FC: goto @1D0
		// @1FF: iconst_0
		// @200: iconst_2
		// @201: iload #11
		// @203: iand
		// @204: if_icmpne @20B
		// @207: goto @2B2
		// @20A: athrow
		// @20B: iconst_0
		// @20C: istore #12
		// @20E: iload #5
		// @210: iconst_m1
		// @211: ixor
		// @212: iload #12
		// @214: iconst_m1
		// @215: ixor
		// @216: if_icmpge @255
		// @219: iconst_0
		// @21A: istore #13
		// @21C: iload #13
		// @21E: iload #6
		// @220: if_icmpge @24F
		// @223: aload #9
		// @225: iload #13
		// @227: iload #5
		// @229: imul
		// @22A: iload #12
		// @22C: iadd
		// @22D: aload_2
		// @22E: bipush -117 (0x8B)
		// @230: invokevirtual game.C_100280_nf.func_101146_c(byte)byte
		// @233: dup_x2
		// @234: bastore
		// @235: istore #14
		// @237: iload #10
		// @239: iload #14
		// @23B: iconst_m1
		// @23C: ixor
		// @23D: ifeq @245
		// @240: iconst_1
		// @241: goto @246
		// @244: athrow
		// @245: iconst_0
		// @246: ior
		// @247: istore #10
		// @249: iinc #13 +1
		// @24C: goto @21C
		// @24F: iinc #12 +1
		// @252: goto @20E
		// @255: goto @2B2
		// @258: iconst_0
		// @259: istore #12
		// @25B: iload #7
		// @25D: iconst_m1
		// @25E: ixor
		// @25F: iload #12
		// @261: iconst_m1
		// @262: ixor
		// @263: if_icmpge @278
		// @266: aload #8
		// @268: iload #12
		// @26A: aload_2
		// @26B: bipush -125 (0x83)
		// @26D: invokevirtual game.C_100280_nf.func_101146_c(byte)byte
		// @270: bastore
		// @271: iinc #12 +1
		// @274: goto @25B
		// @277: athrow
		// @278: iload #11
		// @27A: iconst_2
		// @27B: iand
		// @27C: ifne @283
		// @27F: goto @2B2
		// @282: athrow
		// @283: iconst_0
		// @284: istore #12
		// @286: iload #12
		// @288: iload #7
		// @28A: if_icmpge @2B2
		// @28D: aload #9
		// @28F: iload #12
		// @291: aload_2
		// @292: bipush -110 (0x92)
		// @294: invokevirtual game.C_100280_nf.func_101146_c(byte)byte
		// @297: dup_x2
		// @298: bastore
		// @299: istore #13
		// @29B: iload #10
		// @29D: iconst_m1
		// @29E: iload #13
		// @2A0: if_icmpeq @2A8
		// @2A3: iconst_1
		// @2A4: goto @2A9
		// @2A7: athrow
		// @2A8: iconst_0
		// @2A9: ior
		// @2AA: istore #10
		// @2AC: iinc #12 +1
		// @2AF: goto @286
		// @2B2: getstatic boolean[] game.C_100160_sm.field_105416_c
		// @2B5: iload #4
		// @2B7: iload #10
		// @2B9: bastore
		// @2BA: iinc #4 +1
		// @2BD: goto @17A
		// @2C0: goto @2FE
		// @2C3: astore_2
		// @2C4: aload_2
		// @2C5: new java.lang.StringBuilder
		// @2C8: dup
		// @2C9: invokespecial java.lang.StringBuilder.<init>()void
		// @2CC: getstatic java.lang.String[] game.C_100328_ia.field_107262_z
		// @2CF: iconst_1
		// @2D0: aaload
		// @2D1: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2D4: aload_0
		// @2D5: ifnull @2E1
		// @2D8: getstatic java.lang.String[] game.C_100328_ia.field_107262_z
		// @2DB: iconst_2
		// @2DC: aaload
		// @2DD: goto @2E6
		// @2E0: athrow
		// @2E1: getstatic java.lang.String[] game.C_100328_ia.field_107262_z
		// @2E4: iconst_0
		// @2E5: aaload
		// @2E6: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2E9: bipush 44 (0x2C)
		// @2EB: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2EE: iload_1
		// @2EF: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2F2: bipush 41 (0x29)
		// @2F4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2F7: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @2FA: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @2FD: athrow
		// @2FE: return
	}
	
	public static void func_107252_a(byte arg0)
	{
		// @00: iload_0
		// @01: bipush -58 (0xC6)
		// @03: if_icmple @0F
		// @06: bipush -39 (0xD9)
		// @08: putstatic int game.C_100328_ia.field_107258_e
		// @0B: goto @0F
		// @0E: athrow
		// @0F: aconst_null
		// @10: putstatic int[] game.C_100328_ia.field_107259_b
		// @13: aconst_null
		// @14: putstatic java.lang.String game.C_100328_ia.field_107257_d
		// @17: aconst_null
		// @18: putstatic java.lang.String game.C_100328_ia.field_107260_c
		// @1B: aconst_null
		// @1C: putstatic java.lang.String game.C_100328_ia.field_107261_a
		// @1F: aconst_null
		// @20: putstatic java.lang.String game.C_100328_ia.field_107256_g
		// @23: aconst_null
		// @24: putstatic java.lang.String game.C_100328_ia.field_107255_f
		// @27: goto @4B
		// @2A: astore_1
		// @2B: aload_1
		// @2C: new java.lang.StringBuilder
		// @2F: dup
		// @30: invokespecial java.lang.StringBuilder.<init>()void
		// @33: getstatic java.lang.String[] game.C_100328_ia.field_107262_z
		// @36: iconst_4
		// @37: aaload
		// @38: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3B: iload_0
		// @3C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3F: bipush 41 (0x29)
		// @41: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @44: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @47: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4A: athrow
		// @4B: return
	}
	
	static final void func_107254_b(byte arg0)
	{
		// @00: getstatic game.C_100202_qi game.C_100302_ka.field_101828_Qb
		// @03: ldc 37091 (0x90e3)
		// @05: invokevirtual game.C_100202_qi.func_105908_a(int)game.C_100158_da
		// @08: checkcast game.C_100045_vj
		// @0B: astore_1
		// @0C: aload_1
		// @0D: ifnull @14
		// @10: goto @1C
		// @13: athrow
		// @14: new game.C_100045_vj
		// @17: dup
		// @18: invokespecial game.C_100045_vj.<init>()void
		// @1B: astore_1
		// @1C: aload_1
		// @1D: getstatic int game.C_100196_rb.field_105821_c
		// @20: getstatic int game.C_100196_rb.field_105819_e
		// @23: getstatic int game.C_100196_rb.field_105823_l
		// @26: iconst_1
		// @27: getstatic int[] game.C_100196_rb.field_105818_d
		// @2A: getstatic int game.C_100196_rb.field_105816_f
		// @2D: getstatic int game.C_100196_rb.field_105827_i
		// @30: getstatic int game.C_100196_rb.field_105820_b
		// @33: invokevirtual game.C_100045_vj.func_100602_a(int, int, int, boolean, int[], int, int, int)void
		// @36: iload_0
		// @37: bipush -46 (0xD2)
		// @39: if_icmpeq @47
		// @3C: aconst_null
		// @3D: checkcast java.lang.String
		// @40: putstatic java.lang.String game.C_100328_ia.field_107256_g
		// @43: goto @47
		// @46: athrow
		// @47: getstatic game.C_100202_qi game.C_100189_ri.field_105754_b
		// @4A: bipush 127 (0x7F)
		// @4C: aload_1
		// @4D: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @50: goto @74
		// @53: astore_1
		// @54: aload_1
		// @55: new java.lang.StringBuilder
		// @58: dup
		// @59: invokespecial java.lang.StringBuilder.<init>()void
		// @5C: getstatic java.lang.String[] game.C_100328_ia.field_107262_z
		// @5F: iconst_3
		// @60: aaload
		// @61: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @64: iload_0
		// @65: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @68: bipush 41 (0x29)
		// @6A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @70: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @73: athrow
		// @74: return
	}
	
	static
	{
		// @000: iconst_5
		// @001: anewarray java.lang.String
		// @004: dup
		// @005: iconst_0
		// @006: ldc "\u0002\u0000]\u001e"
		// @008: invokestatic game.C_100328_ia.func_107253_z(java.lang.String)char[]
		// @00B: invokestatic game.C_100328_ia.func_107251_z(char[])java.lang.String
		// @00E: aastore
		// @00F: dup
		// @010: iconst_1
		// @011: ldc "\u0005\u0014\u001f0E"
		// @013: invokestatic game.C_100328_ia.func_107253_z(java.lang.String)char[]
		// @016: invokestatic game.C_100328_ia.func_107251_z(char[])java.lang.String
		// @019: aastore
		// @01A: dup
		// @01B: iconst_2
		// @01C: ldc "\u0017[\u001f\\\u0010"
		// @01E: invokestatic game.C_100328_ia.func_107253_z(java.lang.String)char[]
		// @021: invokestatic game.C_100328_ia.func_107251_z(char[])java.lang.String
		// @024: aastore
		// @025: dup
		// @026: iconst_3
		// @027: ldc "\u0005\u0014\u001f1E"
		// @029: invokestatic game.C_100328_ia.func_107253_z(java.lang.String)char[]
		// @02C: invokestatic game.C_100328_ia.func_107251_z(char[])java.lang.String
		// @02F: aastore
		// @030: dup
		// @031: iconst_4
		// @032: ldc "\u0005\u0014\u001f3E"
		// @034: invokestatic game.C_100328_ia.func_107253_z(java.lang.String)char[]
		// @037: invokestatic game.C_100328_ia.func_107251_z(char[])java.lang.String
		// @03A: aastore
		// @03B: putstatic java.lang.String[] game.C_100328_ia.field_107262_z
		// @03E: ldc ")-a3#?<~<M#;}+M%!t?"
		// @040: invokestatic game.C_100328_ia.func_107253_z(java.lang.String)char[]
		// @043: invokestatic game.C_100328_ia.func_107251_z(char[])java.lang.String
		// @046: putstatic java.lang.String game.C_100328_ia.field_107257_d
		// @049: ldc "5\u001aDR\u0003\t\u0010UR\u0019\u0003UA\u001e\u000c\u0015U\rW]RU\\\u001d\u001f\tUC\u0013\u0019\t\u0011\u0011\u0015\u000c\u0001\u0010BR\u0019\u0003UD\u001c\u0001\u0003\u0016ZR\u0019\u0004\u001cBR\u0002\u001c\u0001X\u001d\u0003B"
		// @04B: invokestatic game.C_100328_ia.func_107253_z(java.lang.String)char[]
		// @04E: invokestatic game.C_100328_ia.func_107251_z(char[])java.lang.String
		// @051: putstatic java.lang.String game.C_100328_ia.field_107261_a
		// @054: bipush 35 (0x23)
		// @056: newarray int[]
		// @058: dup
		// @059: iconst_0
		// @05A: bipush 100 (0x64)
		// @05C: iastore
		// @05D: dup
		// @05E: iconst_1
		// @05F: sipush 250 (0x00FA)
		// @062: iastore
		// @063: dup
		// @064: iconst_2
		// @065: sipush 500 (0x01F4)
		// @068: iastore
		// @069: dup
		// @06A: iconst_3
		// @06B: sipush 750 (0x02EE)
		// @06E: iastore
		// @06F: dup
		// @070: iconst_4
		// @071: sipush 1000 (0x03E8)
		// @074: iastore
		// @075: dup
		// @076: iconst_5
		// @077: bipush 100 (0x64)
		// @079: iastore
		// @07A: dup
		// @07B: bipush 6 (0x06)
		// @07D: sipush 250 (0x00FA)
		// @080: iastore
		// @081: dup
		// @082: bipush 7 (0x07)
		// @084: sipush 500 (0x01F4)
		// @087: iastore
		// @088: dup
		// @089: bipush 8 (0x08)
		// @08B: sipush 750 (0x02EE)
		// @08E: iastore
		// @08F: dup
		// @090: bipush 9 (0x09)
		// @092: sipush 1000 (0x03E8)
		// @095: iastore
		// @096: dup
		// @097: bipush 10 (0x0A)
		// @099: bipush 100 (0x64)
		// @09B: iastore
		// @09C: dup
		// @09D: bipush 11 (0x0B)
		// @09F: sipush 250 (0x00FA)
		// @0A2: iastore
		// @0A3: dup
		// @0A4: bipush 12 (0x0C)
		// @0A6: sipush 500 (0x01F4)
		// @0A9: iastore
		// @0AA: dup
		// @0AB: bipush 13 (0x0D)
		// @0AD: sipush 750 (0x02EE)
		// @0B0: iastore
		// @0B1: dup
		// @0B2: bipush 14 (0x0E)
		// @0B4: sipush 1000 (0x03E8)
		// @0B7: iastore
		// @0B8: dup
		// @0B9: bipush 15 (0x0F)
		// @0BB: sipush 900 (0x0384)
		// @0BE: iastore
		// @0BF: dup
		// @0C0: bipush 16 (0x10)
		// @0C2: bipush 100 (0x64)
		// @0C4: iastore
		// @0C5: dup
		// @0C6: bipush 17 (0x11)
		// @0C8: bipush 100 (0x64)
		// @0CA: iastore
		// @0CB: dup
		// @0CC: bipush 18 (0x12)
		// @0CE: sipush 300 (0x012C)
		// @0D1: iastore
		// @0D2: dup
		// @0D3: bipush 19 (0x13)
		// @0D5: sipush 700 (0x02BC)
		// @0D8: iastore
		// @0D9: dup
		// @0DA: bipush 20 (0x14)
		// @0DC: sipush 1000 (0x03E8)
		// @0DF: iastore
		// @0E0: dup
		// @0E1: bipush 21 (0x15)
		// @0E3: bipush 100 (0x64)
		// @0E5: iastore
		// @0E6: dup
		// @0E7: bipush 22 (0x16)
		// @0E9: sipush 200 (0x00C8)
		// @0EC: iastore
		// @0ED: dup
		// @0EE: bipush 23 (0x17)
		// @0F0: sipush 900 (0x0384)
		// @0F3: iastore
		// @0F4: dup
		// @0F5: bipush 24 (0x18)
		// @0F7: sipush 800 (0x0320)
		// @0FA: iastore
		// @0FB: dup
		// @0FC: bipush 25 (0x19)
		// @0FE: sipush 500 (0x01F4)
		// @101: iastore
		// @102: dup
		// @103: bipush 26 (0x1A)
		// @105: sipush 300 (0x012C)
		// @108: iastore
		// @109: dup
		// @10A: bipush 27 (0x1B)
		// @10C: sipush 500 (0x01F4)
		// @10F: iastore
		// @110: dup
		// @111: bipush 28 (0x1C)
		// @113: sipush 400 (0x0190)
		// @116: iastore
		// @117: dup
		// @118: bipush 29 (0x1D)
		// @11A: sipush 400 (0x0190)
		// @11D: iastore
		// @11E: dup
		// @11F: bipush 30 (0x1E)
		// @121: sipush 900 (0x0384)
		// @124: iastore
		// @125: dup
		// @126: bipush 31 (0x1F)
		// @128: sipush 600 (0x0258)
		// @12B: iastore
		// @12C: dup
		// @12D: bipush 32 (0x20)
		// @12F: sipush 200 (0x00C8)
		// @132: iastore
		// @133: dup
		// @134: bipush 33 (0x21)
		// @136: sipush 200 (0x00C8)
		// @139: iastore
		// @13A: dup
		// @13B: bipush 34 (0x22)
		// @13D: sipush 2000 (0x07D0)
		// @140: iastore
		// @141: putstatic int[] game.C_100328_ia.field_107259_b
		// @144: ldc "84sR@L\u001dX\u0016\u0008L\u0016Y\u0013\u0019L\u0001T\u001f\u001d\u0003\u0007P\u0000\u0004\u0000\u000c"
		// @146: invokestatic game.C_100328_ia.func_107253_z(java.lang.String)char[]
		// @149: invokestatic game.C_100328_ia.func_107251_z(char[])java.lang.String
		// @14C: putstatic java.lang.String game.C_100328_ia.field_107255_f
		// @14F: ldc "%:\u0011\u0017\u001f\u001e\u001aCR@L\u0000_\u0013\u000f\u0000\u0010\u0011\u0006\u0002L\u0016^\u001f\u0000\u0019\u001bX\u0011\u000c\u0018\u0010\u0011\u0000\u0008\u0000\u001cP\u0010\u0001\u0015UF\u001b\u0019\u0004UE\u001a\u0008L\u0011P\u0006\u000cL\u0006T\u0000\u001b\t\u0007\u001fR=\u0000\u0010P\u0001\u0008L\u0016Y\u0017\u000e\u0007UP\u001c\u0014L\u0013X\u0000\u0008\u001b\u0014]\u001eB\r\u001bE\u001b\u001b\u0005\u0007D\u0001B\n\u001c]\u0006\u0008\u001e\u001c_\u0015M\u001f\u001aW\u0006\u001a\r\u0007T\\"
		// @151: invokestatic game.C_100328_ia.func_107253_z(java.lang.String)char[]
		// @154: invokestatic game.C_100328_ia.func_107251_z(char[])java.lang.String
		// @157: putstatic java.lang.String game.C_100328_ia.field_107260_c
		// @15A: ldc "(\u0010R\u001e\u0004\u0002\u0010\u0011\u001b\u0003\u001a\u001cE\u0013\u0019\u0005\u001a_R\u0019\u0003U\rW]RRBR\n\r\u0018T"
		// @15C: invokestatic game.C_100328_ia.func_107253_z(java.lang.String)char[]
		// @15F: invokestatic game.C_100328_ia.func_107251_z(char[])java.lang.String
		// @162: putstatic java.lang.String game.C_100328_ia.field_107256_g
		// @165: iconst_0
		// @166: putstatic int game.C_100328_ia.field_107258_e
		// @169: return
	}
	
	private static char[] func_107253_z(String arg0)
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
		// @0E: bipush 109 (0x6D)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_107251_z(char[] arg0)
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
		// @30: bipush 108 (0x6C)
		// @32: goto @46
		// @35: bipush 117 (0x75)
		// @37: goto @46
		// @3A: bipush 49 (0x31)
		// @3C: goto @46
		// @3F: bipush 114 (0x72)
		// @41: goto @46
		// @44: bipush 109 (0x6D)
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
