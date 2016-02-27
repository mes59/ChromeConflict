package game;

final class C_100002_gf extends C_100158_da
{
	byte[] field_103503_j;
	C_100119_ua field_103504_k;
	
	static final C_100002_gf func_103500_a(C_100098_h arg0, String arg1, String arg2)
	{
		// @00: aload_0
		// @01: aload_2
		// @02: aload_1
		// @03: bipush -71 (0xB9)
		// @05: invokevirtual game.C_100098_h.func_104608_a(java.lang.String, java.lang.String, int)byte[]
		// @08: astore_3
		// @09: aload_3
		// @0A: ifnonnull @10
		// @0D: aconst_null
		// @0E: areturn
		// @0F: athrow
		// @10: new game.C_100002_gf
		// @13: dup
		// @14: new game.C_100280_nf
		// @17: dup
		// @18: aload_3
		// @19: invokespecial game.C_100280_nf.<init>(byte[])void
		// @1C: invokespecial game.C_100002_gf.<init>(game.C_100280_nf)void
		// @1F: areturn
	}
	
	final void func_103502_b()
	{
		// @0: aload_0
		// @1: aconst_null
		// @2: putfield game.C_100119_ua game.C_100002_gf.field_103504_k
		// @5: return
	}
	
	final void func_103501_a()
	{
		// @000: aload_0
		// @001: getfield game.C_100119_ua game.C_100002_gf.field_103504_k
		// @004: ifnull @009
		// @007: return
		// @008: athrow
		// @009: aload_0
		// @00A: new game.C_100119_ua
		// @00D: dup
		// @00E: bipush 16 (0x10)
		// @010: invokespecial game.C_100119_ua.<init>(int)void
		// @013: putfield game.C_100119_ua game.C_100002_gf.field_103504_k
		// @016: bipush 16 (0x10)
		// @018: newarray int[]
		// @01A: astore_1
		// @01B: bipush 16 (0x10)
		// @01D: newarray int[]
		// @01F: astore_2
		// @020: aload_1
		// @021: astore_3
		// @022: aload_2
		// @023: bipush 9 (0x09)
		// @025: sipush 128 (0x0080)
		// @028: iastore
		// @029: aload_3
		// @02A: bipush 9 (0x09)
		// @02C: sipush 128 (0x0080)
		// @02F: iastore
		// @030: new game.C_100014_wg
		// @033: dup
		// @034: aload_0
		// @035: getfield byte[] game.C_100002_gf.field_103503_j
		// @038: invokespecial game.C_100014_wg.<init>(byte[])void
		// @03B: astore #4
		// @03D: aload #4
		// @03F: invokevirtual game.C_100014_wg.func_103749_e()int
		// @042: istore #5
		// @044: iconst_0
		// @045: istore #6
		// @047: iload #6
		// @049: iload #5
		// @04B: if_icmpge @06A
		// @04E: aload #4
		// @050: iload #6
		// @052: invokevirtual game.C_100014_wg.func_103756_c(int)void
		// @055: aload #4
		// @057: iload #6
		// @059: invokevirtual game.C_100014_wg.func_103751_a(int)void
		// @05C: aload #4
		// @05E: iload #6
		// @060: invokevirtual game.C_100014_wg.func_103748_b(int)void
		// @063: iinc #6 +1
		// @066: goto @047
		// @069: athrow
		// @06A: aload #4
		// @06C: invokevirtual game.C_100014_wg.func_103758_a()int
		// @06F: istore #6
		// @071: aload #4
		// @073: getfield int[] game.C_100014_wg.field_103768_b
		// @076: iload #6
		// @078: iaload
		// @079: istore #7
		// @07B: aload #4
		// @07D: getfield int[] game.C_100014_wg.field_103768_b
		// @080: iload #6
		// @082: iaload
		// @083: iload #7
		// @085: if_icmpne @1B9
		// @088: aload #4
		// @08A: iload #6
		// @08C: invokevirtual game.C_100014_wg.func_103756_c(int)void
		// @08F: aload #4
		// @091: iload #6
		// @093: invokevirtual game.C_100014_wg.func_103760_d(int)int
		// @096: istore #8
		// @098: iload #8
		// @09A: iconst_1
		// @09B: if_icmpne @0BA
		// @09E: aload #4
		// @0A0: invokevirtual game.C_100014_wg.func_103759_b()void
		// @0A3: aload #4
		// @0A5: iload #6
		// @0A7: invokevirtual game.C_100014_wg.func_103748_b(int)void
		// @0AA: aload #4
		// @0AC: invokevirtual game.C_100014_wg.func_103753_g()boolean
		// @0AF: ifne @1BC
		// @0B2: goto @0B6
		// @0B5: athrow
		// @0B6: goto @06A
		// @0B9: athrow
		// @0BA: iload #8
		// @0BC: sipush 240 (0x00F0)
		// @0BF: iand
		// @0C0: istore #9
		// @0C2: iload #9
		// @0C4: sipush 176 (0x00B0)
		// @0C7: if_icmpne @11C
		// @0CA: iload #8
		// @0CC: bipush 15 (0x0F)
		// @0CE: iand
		// @0CF: istore #10
		// @0D1: iload #8
		// @0D3: bipush 8 (0x08)
		// @0D5: ishr
		// @0D6: bipush 127 (0x7F)
		// @0D8: iand
		// @0D9: istore #11
		// @0DB: iload #8
		// @0DD: bipush 16 (0x10)
		// @0DF: ishr
		// @0E0: bipush 127 (0x7F)
		// @0E2: iand
		// @0E3: istore #12
		// @0E5: iload #11
		// @0E7: ifne @0FF
		// @0EA: aload_1
		// @0EB: iload #10
		// @0ED: aload_1
		// @0EE: iload #10
		// @0F0: iaload
		// @0F1: ldc -2080769 (0xffe03fff)
		// @0F3: iand
		// @0F4: iload #12
		// @0F6: bipush 14 (0x0E)
		// @0F8: ishl
		// @0F9: iadd
		// @0FA: iastore
		// @0FB: goto @0FF
		// @0FE: athrow
		// @0FF: iload #11
		// @101: bipush 32 (0x20)
		// @103: if_icmpne @11C
		// @106: aload_1
		// @107: iload #10
		// @109: aload_1
		// @10A: iload #10
		// @10C: iaload
		// @10D: sipush -16257 (0xC07F)
		// @110: iand
		// @111: iload #12
		// @113: bipush 7 (0x07)
		// @115: ishl
		// @116: iadd
		// @117: iastore
		// @118: goto @11C
		// @11B: athrow
		// @11C: iload #9
		// @11E: sipush 192 (0x00C0)
		// @121: if_icmpne @140
		// @124: iload #8
		// @126: bipush 15 (0x0F)
		// @128: iand
		// @129: istore #10
		// @12B: iload #8
		// @12D: bipush 8 (0x08)
		// @12F: ishr
		// @130: bipush 127 (0x7F)
		// @132: iand
		// @133: istore #11
		// @135: aload_2
		// @136: iload #10
		// @138: aload_1
		// @139: iload #10
		// @13B: iaload
		// @13C: iload #11
		// @13E: iadd
		// @13F: iastore
		// @140: iload #9
		// @142: sipush 144 (0x0090)
		// @145: if_icmpne @1A8
		// @148: iload #8
		// @14A: bipush 15 (0x0F)
		// @14C: iand
		// @14D: istore #10
		// @14F: iload #8
		// @151: bipush 8 (0x08)
		// @153: ishr
		// @154: bipush 127 (0x7F)
		// @156: iand
		// @157: istore #11
		// @159: iload #8
		// @15B: bipush 16 (0x10)
		// @15D: ishr
		// @15E: bipush 127 (0x7F)
		// @160: iand
		// @161: istore #12
		// @163: iload #12
		// @165: ifle @1A8
		// @168: aload_2
		// @169: iload #10
		// @16B: iaload
		// @16C: istore #13
		// @16E: aload_0
		// @16F: getfield game.C_100119_ua game.C_100002_gf.field_103504_k
		// @172: iload #13
		// @174: i2l
		// @175: bipush 63 (0x3F)
		// @177: invokevirtual game.C_100119_ua.func_104891_a(long, int)game.C_100158_da
		// @17A: checkcast game.C_100191_rg
		// @17D: astore #14
		// @17F: aload #14
		// @181: ifnonnull @19F
		// @184: new game.C_100191_rg
		// @187: dup
		// @188: sipush 128 (0x0080)
		// @18B: newarray byte[]
		// @18D: invokespecial game.C_100191_rg.<init>(byte[])void
		// @190: astore #14
		// @192: aload_0
		// @193: getfield game.C_100119_ua game.C_100002_gf.field_103504_k
		// @196: aload #14
		// @198: iload #13
		// @19A: i2l
		// @19B: iconst_1
		// @19C: invokevirtual game.C_100119_ua.func_104893_a(game.C_100158_da, long, boolean)void
		// @19F: aload #14
		// @1A1: getfield byte[] game.C_100191_rg.field_100846_l
		// @1A4: iload #11
		// @1A6: iconst_1
		// @1A7: bastore
		// @1A8: aload #4
		// @1AA: iload #6
		// @1AC: invokevirtual game.C_100014_wg.func_103751_a(int)void
		// @1AF: aload #4
		// @1B1: iload #6
		// @1B3: invokevirtual game.C_100014_wg.func_103748_b(int)void
		// @1B6: goto @07B
		// @1B9: goto @06A
		// @1BC: return
	}
	
	private C_100002_gf(C_100280_nf arg0)
	{
		// @000: aload_0
		// @001: invokespecial game.C_100158_da.<init>()void
		// @004: aload_1
		// @005: aload_1
		// @006: getfield byte[] game.C_100280_nf.field_101179_l
		// @009: arraylength
		// @00A: iconst_3
		// @00B: isub
		// @00C: putfield int game.C_100280_nf.field_101177_n
		// @00F: aload_1
		// @010: iconst_0
		// @011: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @014: istore_2
		// @015: aload_1
		// @016: bipush -2 (0xFE)
		// @018: invokevirtual game.C_100280_nf.func_101143_l(int)int
		// @01B: istore_3
		// @01C: bipush 14 (0x0E)
		// @01E: iload_2
		// @01F: bipush 10 (0x0A)
		// @021: imul
		// @022: iadd
		// @023: istore #4
		// @025: aload_1
		// @026: iconst_0
		// @027: putfield int game.C_100280_nf.field_101177_n
		// @02A: iconst_0
		// @02B: istore #5
		// @02D: iconst_0
		// @02E: istore #6
		// @030: iconst_0
		// @031: istore #7
		// @033: iconst_0
		// @034: istore #8
		// @036: iconst_0
		// @037: istore #9
		// @039: iconst_0
		// @03A: istore #10
		// @03C: iconst_0
		// @03D: istore #11
		// @03F: iconst_0
		// @040: istore #12
		// @042: iconst_0
		// @043: istore #13
		// @045: iload #13
		// @047: iload_2
		// @048: if_icmpge @0EC
		// @04B: iconst_m1
		// @04C: istore #14
		// @04E: aload_1
		// @04F: iconst_0
		// @050: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @053: istore #15
		// @055: iload #15
		// @057: iload #14
		// @059: if_icmpeq @063
		// @05C: iinc #4 +1
		// @05F: goto @063
		// @062: athrow
		// @063: iload #15
		// @065: bipush 15 (0x0F)
		// @067: iand
		// @068: istore #14
		// @06A: iload #15
		// @06C: bipush 7 (0x07)
		// @06E: if_icmpne @075
		// @071: goto @0E6
		// @074: athrow
		// @075: iload #15
		// @077: bipush 23 (0x17)
		// @079: if_icmpne @083
		// @07C: iinc #5 +1
		// @07F: goto @04E
		// @082: athrow
		// @083: iload #14
		// @085: ifne @08F
		// @088: iinc #7 +1
		// @08B: goto @04E
		// @08E: athrow
		// @08F: iload #14
		// @091: iconst_1
		// @092: if_icmpne @09C
		// @095: iinc #8 +1
		// @098: goto @04E
		// @09B: athrow
		// @09C: iload #14
		// @09E: iconst_2
		// @09F: if_icmpne @0A9
		// @0A2: iinc #6 +1
		// @0A5: goto @04E
		// @0A8: athrow
		// @0A9: iload #14
		// @0AB: iconst_3
		// @0AC: if_icmpne @0B6
		// @0AF: iinc #9 +1
		// @0B2: goto @04E
		// @0B5: athrow
		// @0B6: iload #14
		// @0B8: iconst_4
		// @0B9: if_icmpne @0C3
		// @0BC: iinc #10 +1
		// @0BF: goto @04E
		// @0C2: athrow
		// @0C3: iload #14
		// @0C5: iconst_5
		// @0C6: if_icmpne @0D0
		// @0C9: iinc #11 +1
		// @0CC: goto @04E
		// @0CF: athrow
		// @0D0: iload #14
		// @0D2: bipush 6 (0x06)
		// @0D4: if_icmpne @0DE
		// @0D7: iinc #12 +1
		// @0DA: goto @04E
		// @0DD: athrow
		// @0DE: new java.lang.RuntimeException
		// @0E1: dup
		// @0E2: invokespecial java.lang.RuntimeException.<init>()void
		// @0E5: athrow
		// @0E6: iinc #13 +1
		// @0E9: goto @045
		// @0EC: iload #4
		// @0EE: iconst_5
		// @0EF: iload #5
		// @0F1: imul
		// @0F2: iadd
		// @0F3: istore #4
		// @0F5: iload #4
		// @0F7: iconst_2
		// @0F8: iload #7
		// @0FA: iload #8
		// @0FC: iadd
		// @0FD: iload #6
		// @0FF: iadd
		// @100: iload #9
		// @102: iadd
		// @103: iload #11
		// @105: iadd
		// @106: imul
		// @107: iadd
		// @108: istore #4
		// @10A: iload #4
		// @10C: iload #10
		// @10E: iload #12
		// @110: iadd
		// @111: iadd
		// @112: istore #4
		// @114: aload_1
		// @115: getfield int game.C_100280_nf.field_101177_n
		// @118: istore #13
		// @11A: iload_2
		// @11B: iload #5
		// @11D: iadd
		// @11E: iload #6
		// @120: iadd
		// @121: iload #7
		// @123: iadd
		// @124: iload #8
		// @126: iadd
		// @127: iload #9
		// @129: iadd
		// @12A: iload #10
		// @12C: iadd
		// @12D: iload #11
		// @12F: iadd
		// @130: iload #12
		// @132: iadd
		// @133: istore #14
		// @135: iconst_0
		// @136: istore #15
		// @138: iload #15
		// @13A: iload #14
		// @13C: if_icmpge @14D
		// @13F: aload_1
		// @140: bipush 104 (0x68)
		// @142: invokevirtual game.C_100280_nf.func_101158_h(int)int
		// @145: pop
		// @146: iinc #15 +1
		// @149: goto @138
		// @14C: athrow
		// @14D: iload #4
		// @14F: aload_1
		// @150: getfield int game.C_100280_nf.field_101177_n
		// @153: iload #13
		// @155: isub
		// @156: iadd
		// @157: istore #4
		// @159: aload_1
		// @15A: getfield int game.C_100280_nf.field_101177_n
		// @15D: istore #15
		// @15F: iconst_0
		// @160: istore #16
		// @162: iconst_0
		// @163: istore #17
		// @165: iconst_0
		// @166: istore #18
		// @168: iconst_0
		// @169: istore #19
		// @16B: iconst_0
		// @16C: istore #20
		// @16E: iconst_0
		// @16F: istore #21
		// @171: iconst_0
		// @172: istore #22
		// @174: iconst_0
		// @175: istore #23
		// @177: iconst_0
		// @178: istore #24
		// @17A: iconst_0
		// @17B: istore #25
		// @17D: iconst_0
		// @17E: istore #26
		// @180: iconst_0
		// @181: istore #27
		// @183: iconst_0
		// @184: istore #28
		// @186: iconst_0
		// @187: istore #29
		// @189: iload #29
		// @18B: iload #6
		// @18D: if_icmpge @282
		// @190: iload #28
		// @192: aload_1
		// @193: iconst_0
		// @194: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @197: iadd
		// @198: bipush 127 (0x7F)
		// @19A: iand
		// @19B: istore #28
		// @19D: iload #28
		// @19F: ifeq @1AD
		// @1A2: iload #28
		// @1A4: bipush 32 (0x20)
		// @1A6: if_icmpne @1B4
		// @1A9: goto @1AD
		// @1AC: athrow
		// @1AD: iinc #12 +1
		// @1B0: goto @27C
		// @1B3: athrow
		// @1B4: iload #28
		// @1B6: iconst_1
		// @1B7: if_icmpne @1C1
		// @1BA: iinc #16 +1
		// @1BD: goto @27C
		// @1C0: athrow
		// @1C1: iload #28
		// @1C3: bipush 33 (0x21)
		// @1C5: if_icmpne @1CF
		// @1C8: iinc #17 +1
		// @1CB: goto @27C
		// @1CE: athrow
		// @1CF: iload #28
		// @1D1: bipush 7 (0x07)
		// @1D3: if_icmpne @1DD
		// @1D6: iinc #18 +1
		// @1D9: goto @27C
		// @1DC: athrow
		// @1DD: iload #28
		// @1DF: bipush 39 (0x27)
		// @1E1: if_icmpne @1EB
		// @1E4: iinc #19 +1
		// @1E7: goto @27C
		// @1EA: athrow
		// @1EB: iload #28
		// @1ED: bipush 10 (0x0A)
		// @1EF: if_icmpne @1F9
		// @1F2: iinc #20 +1
		// @1F5: goto @27C
		// @1F8: athrow
		// @1F9: iload #28
		// @1FB: bipush 42 (0x2A)
		// @1FD: if_icmpne @207
		// @200: iinc #21 +1
		// @203: goto @27C
		// @206: athrow
		// @207: iload #28
		// @209: bipush 99 (0x63)
		// @20B: if_icmpne @215
		// @20E: iinc #22 +1
		// @211: goto @27C
		// @214: athrow
		// @215: iload #28
		// @217: bipush 98 (0x62)
		// @219: if_icmpne @223
		// @21C: iinc #23 +1
		// @21F: goto @27C
		// @222: athrow
		// @223: iload #28
		// @225: bipush 101 (0x65)
		// @227: if_icmpne @231
		// @22A: iinc #24 +1
		// @22D: goto @27C
		// @230: athrow
		// @231: iload #28
		// @233: bipush 100 (0x64)
		// @235: if_icmpne @23F
		// @238: iinc #25 +1
		// @23B: goto @27C
		// @23E: athrow
		// @23F: iload #28
		// @241: bipush 64 (0x40)
		// @243: if_icmpeq @272
		// @246: iload #28
		// @248: bipush 65 (0x41)
		// @24A: if_icmpeq @272
		// @24D: goto @251
		// @250: athrow
		// @251: iload #28
		// @253: bipush 120 (0x78)
		// @255: if_icmpeq @272
		// @258: goto @25C
		// @25B: athrow
		// @25C: iload #28
		// @25E: bipush 121 (0x79)
		// @260: if_icmpeq @272
		// @263: goto @267
		// @266: athrow
		// @267: iload #28
		// @269: bipush 123 (0x7B)
		// @26B: if_icmpne @279
		// @26E: goto @272
		// @271: athrow
		// @272: iinc #26 +1
		// @275: goto @27C
		// @278: athrow
		// @279: iinc #27 +1
		// @27C: iinc #29 +1
		// @27F: goto @189
		// @282: iconst_0
		// @283: istore #29
		// @285: aload_1
		// @286: getfield int game.C_100280_nf.field_101177_n
		// @289: istore #30
		// @28B: aload_1
		// @28C: dup
		// @28D: getfield int game.C_100280_nf.field_101177_n
		// @290: iload #26
		// @292: iadd
		// @293: putfield int game.C_100280_nf.field_101177_n
		// @296: aload_1
		// @297: getfield int game.C_100280_nf.field_101177_n
		// @29A: istore #31
		// @29C: aload_1
		// @29D: dup
		// @29E: getfield int game.C_100280_nf.field_101177_n
		// @2A1: iload #11
		// @2A3: iadd
		// @2A4: putfield int game.C_100280_nf.field_101177_n
		// @2A7: aload_1
		// @2A8: getfield int game.C_100280_nf.field_101177_n
		// @2AB: istore #32
		// @2AD: aload_1
		// @2AE: dup
		// @2AF: getfield int game.C_100280_nf.field_101177_n
		// @2B2: iload #10
		// @2B4: iadd
		// @2B5: putfield int game.C_100280_nf.field_101177_n
		// @2B8: aload_1
		// @2B9: getfield int game.C_100280_nf.field_101177_n
		// @2BC: istore #33
		// @2BE: aload_1
		// @2BF: dup
		// @2C0: getfield int game.C_100280_nf.field_101177_n
		// @2C3: iload #9
		// @2C5: iadd
		// @2C6: putfield int game.C_100280_nf.field_101177_n
		// @2C9: aload_1
		// @2CA: getfield int game.C_100280_nf.field_101177_n
		// @2CD: istore #34
		// @2CF: aload_1
		// @2D0: dup
		// @2D1: getfield int game.C_100280_nf.field_101177_n
		// @2D4: iload #16
		// @2D6: iadd
		// @2D7: putfield int game.C_100280_nf.field_101177_n
		// @2DA: aload_1
		// @2DB: getfield int game.C_100280_nf.field_101177_n
		// @2DE: istore #35
		// @2E0: aload_1
		// @2E1: dup
		// @2E2: getfield int game.C_100280_nf.field_101177_n
		// @2E5: iload #18
		// @2E7: iadd
		// @2E8: putfield int game.C_100280_nf.field_101177_n
		// @2EB: aload_1
		// @2EC: getfield int game.C_100280_nf.field_101177_n
		// @2EF: istore #36
		// @2F1: aload_1
		// @2F2: dup
		// @2F3: getfield int game.C_100280_nf.field_101177_n
		// @2F6: iload #20
		// @2F8: iadd
		// @2F9: putfield int game.C_100280_nf.field_101177_n
		// @2FC: aload_1
		// @2FD: getfield int game.C_100280_nf.field_101177_n
		// @300: istore #37
		// @302: aload_1
		// @303: dup
		// @304: getfield int game.C_100280_nf.field_101177_n
		// @307: iload #7
		// @309: iload #8
		// @30B: iadd
		// @30C: iload #11
		// @30E: iadd
		// @30F: iadd
		// @310: putfield int game.C_100280_nf.field_101177_n
		// @313: aload_1
		// @314: getfield int game.C_100280_nf.field_101177_n
		// @317: istore #38
		// @319: aload_1
		// @31A: dup
		// @31B: getfield int game.C_100280_nf.field_101177_n
		// @31E: iload #7
		// @320: iadd
		// @321: putfield int game.C_100280_nf.field_101177_n
		// @324: aload_1
		// @325: getfield int game.C_100280_nf.field_101177_n
		// @328: istore #39
		// @32A: aload_1
		// @32B: dup
		// @32C: getfield int game.C_100280_nf.field_101177_n
		// @32F: iload #27
		// @331: iadd
		// @332: putfield int game.C_100280_nf.field_101177_n
		// @335: aload_1
		// @336: getfield int game.C_100280_nf.field_101177_n
		// @339: istore #40
		// @33B: aload_1
		// @33C: dup
		// @33D: getfield int game.C_100280_nf.field_101177_n
		// @340: iload #8
		// @342: iadd
		// @343: putfield int game.C_100280_nf.field_101177_n
		// @346: aload_1
		// @347: getfield int game.C_100280_nf.field_101177_n
		// @34A: istore #41
		// @34C: aload_1
		// @34D: dup
		// @34E: getfield int game.C_100280_nf.field_101177_n
		// @351: iload #17
		// @353: iadd
		// @354: putfield int game.C_100280_nf.field_101177_n
		// @357: aload_1
		// @358: getfield int game.C_100280_nf.field_101177_n
		// @35B: istore #42
		// @35D: aload_1
		// @35E: dup
		// @35F: getfield int game.C_100280_nf.field_101177_n
		// @362: iload #19
		// @364: iadd
		// @365: putfield int game.C_100280_nf.field_101177_n
		// @368: aload_1
		// @369: getfield int game.C_100280_nf.field_101177_n
		// @36C: istore #43
		// @36E: aload_1
		// @36F: dup
		// @370: getfield int game.C_100280_nf.field_101177_n
		// @373: iload #21
		// @375: iadd
		// @376: putfield int game.C_100280_nf.field_101177_n
		// @379: aload_1
		// @37A: getfield int game.C_100280_nf.field_101177_n
		// @37D: istore #44
		// @37F: aload_1
		// @380: dup
		// @381: getfield int game.C_100280_nf.field_101177_n
		// @384: iload #12
		// @386: iadd
		// @387: putfield int game.C_100280_nf.field_101177_n
		// @38A: aload_1
		// @38B: getfield int game.C_100280_nf.field_101177_n
		// @38E: istore #45
		// @390: aload_1
		// @391: dup
		// @392: getfield int game.C_100280_nf.field_101177_n
		// @395: iload #9
		// @397: iadd
		// @398: putfield int game.C_100280_nf.field_101177_n
		// @39B: aload_1
		// @39C: getfield int game.C_100280_nf.field_101177_n
		// @39F: istore #46
		// @3A1: aload_1
		// @3A2: dup
		// @3A3: getfield int game.C_100280_nf.field_101177_n
		// @3A6: iload #22
		// @3A8: iadd
		// @3A9: putfield int game.C_100280_nf.field_101177_n
		// @3AC: aload_1
		// @3AD: getfield int game.C_100280_nf.field_101177_n
		// @3B0: istore #47
		// @3B2: aload_1
		// @3B3: dup
		// @3B4: getfield int game.C_100280_nf.field_101177_n
		// @3B7: iload #23
		// @3B9: iadd
		// @3BA: putfield int game.C_100280_nf.field_101177_n
		// @3BD: aload_1
		// @3BE: getfield int game.C_100280_nf.field_101177_n
		// @3C1: istore #48
		// @3C3: aload_1
		// @3C4: dup
		// @3C5: getfield int game.C_100280_nf.field_101177_n
		// @3C8: iload #24
		// @3CA: iadd
		// @3CB: putfield int game.C_100280_nf.field_101177_n
		// @3CE: aload_1
		// @3CF: getfield int game.C_100280_nf.field_101177_n
		// @3D2: istore #49
		// @3D4: aload_1
		// @3D5: dup
		// @3D6: getfield int game.C_100280_nf.field_101177_n
		// @3D9: iload #25
		// @3DB: iadd
		// @3DC: putfield int game.C_100280_nf.field_101177_n
		// @3DF: aload_1
		// @3E0: getfield int game.C_100280_nf.field_101177_n
		// @3E3: istore #50
		// @3E5: aload_1
		// @3E6: dup
		// @3E7: getfield int game.C_100280_nf.field_101177_n
		// @3EA: iload #5
		// @3EC: iconst_3
		// @3ED: imul
		// @3EE: iadd
		// @3EF: putfield int game.C_100280_nf.field_101177_n
		// @3F2: aload_0
		// @3F3: iload #4
		// @3F5: newarray byte[]
		// @3F7: putfield byte[] game.C_100002_gf.field_103503_j
		// @3FA: new game.C_100280_nf
		// @3FD: dup
		// @3FE: aload_0
		// @3FF: getfield byte[] game.C_100002_gf.field_103503_j
		// @402: invokespecial game.C_100280_nf.<init>(byte[])void
		// @405: astore #51
		// @407: aload #51
		// @409: ldc 1297377380 (0x4d546864)
		// @40B: bipush 47 (0x2F)
		// @40D: invokevirtual game.C_100280_nf.func_101154_d(int, int)void
		// @410: aload #51
		// @412: bipush 6 (0x06)
		// @414: bipush -114 (0x8E)
		// @416: invokevirtual game.C_100280_nf.func_101154_d(int, int)void
		// @419: aload #51
		// @41B: iload_2
		// @41C: iconst_1
		// @41D: if_icmple @425
		// @420: iconst_1
		// @421: goto @426
		// @424: athrow
		// @425: iconst_0
		// @426: bipush -123 (0x85)
		// @428: invokevirtual game.C_100280_nf.func_101141_d(int, byte)void
		// @42B: aload #51
		// @42D: iload_2
		// @42E: bipush -72 (0xB8)
		// @430: invokevirtual game.C_100280_nf.func_101141_d(int, byte)void
		// @433: aload #51
		// @435: iload_3
		// @436: bipush -114 (0x8E)
		// @438: invokevirtual game.C_100280_nf.func_101141_d(int, byte)void
		// @43B: aload_1
		// @43C: iload #13
		// @43E: putfield int game.C_100280_nf.field_101177_n
		// @441: iconst_0
		// @442: istore #52
		// @444: iconst_0
		// @445: istore #53
		// @447: iconst_0
		// @448: istore #54
		// @44A: iconst_0
		// @44B: istore #55
		// @44D: iconst_0
		// @44E: istore #56
		// @450: iconst_0
		// @451: istore #57
		// @453: iconst_0
		// @454: istore #58
		// @456: sipush 128 (0x0080)
		// @459: newarray int[]
		// @45B: astore #59
		// @45D: iconst_0
		// @45E: istore #28
		// @460: iconst_0
		// @461: istore #60
		// @463: iload #60
		// @465: iload_2
		// @466: if_icmpge @918
		// @469: aload #51
		// @46B: ldc 1297379947 (0x4d54726b)
		// @46D: bipush -114 (0x8E)
		// @46F: invokevirtual game.C_100280_nf.func_101154_d(int, int)void
		// @472: aload #51
		// @474: dup
		// @475: getfield int game.C_100280_nf.field_101177_n
		// @478: iconst_4
		// @479: iadd
		// @47A: putfield int game.C_100280_nf.field_101177_n
		// @47D: aload #51
		// @47F: getfield int game.C_100280_nf.field_101177_n
		// @482: istore #61
		// @484: iconst_m1
		// @485: istore #62
		// @487: aload_1
		// @488: bipush 23 (0x17)
		// @48A: invokevirtual game.C_100280_nf.func_101158_h(int)int
		// @48D: istore #63
		// @48F: aload #51
		// @491: sipush 128 (0x0080)
		// @494: iload #63
		// @496: invokevirtual game.C_100280_nf.func_101137_e(int, int)void
		// @499: aload_1
		// @49A: getfield byte[] game.C_100280_nf.field_101179_l
		// @49D: iload #29
		// @49F: iinc #29 +1
		// @4A2: baload
		// @4A3: sipush 255 (0x00FF)
		// @4A6: iand
		// @4A7: istore #64
		// @4A9: iload #64
		// @4AB: iload #62
		// @4AD: if_icmpeq @4B5
		// @4B0: iconst_1
		// @4B1: goto @4B6
		// @4B4: athrow
		// @4B5: iconst_0
		// @4B6: istore #65
		// @4B8: iload #64
		// @4BA: bipush 15 (0x0F)
		// @4BC: iand
		// @4BD: istore #62
		// @4BF: iload #64
		// @4C1: bipush 7 (0x07)
		// @4C3: if_icmpne @4F4
		// @4C6: iload #65
		// @4C8: ifeq @4DE
		// @4CB: goto @4CF
		// @4CE: athrow
		// @4CF: aload #51
		// @4D1: sipush 7838 (0x1E9E)
		// @4D4: sipush 255 (0x00FF)
		// @4D7: invokevirtual game.C_100280_nf.func_101169_f(int, int)void
		// @4DA: goto @4DE
		// @4DD: athrow
		// @4DE: aload #51
		// @4E0: sipush 7838 (0x1E9E)
		// @4E3: bipush 47 (0x2F)
		// @4E5: invokevirtual game.C_100280_nf.func_101169_f(int, int)void
		// @4E8: aload #51
		// @4EA: sipush 7838 (0x1E9E)
		// @4ED: iconst_0
		// @4EE: invokevirtual game.C_100280_nf.func_101169_f(int, int)void
		// @4F1: goto @902
		// @4F4: iload #64
		// @4F6: bipush 23 (0x17)
		// @4F8: if_icmpne @55F
		// @4FB: iload #65
		// @4FD: ifeq @513
		// @500: goto @504
		// @503: athrow
		// @504: aload #51
		// @506: sipush 7838 (0x1E9E)
		// @509: sipush 255 (0x00FF)
		// @50C: invokevirtual game.C_100280_nf.func_101169_f(int, int)void
		// @50F: goto @513
		// @512: athrow
		// @513: aload #51
		// @515: sipush 7838 (0x1E9E)
		// @518: bipush 81 (0x51)
		// @51A: invokevirtual game.C_100280_nf.func_101169_f(int, int)void
		// @51D: aload #51
		// @51F: sipush 7838 (0x1E9E)
		// @522: iconst_3
		// @523: invokevirtual game.C_100280_nf.func_101169_f(int, int)void
		// @526: aload #51
		// @528: sipush 7838 (0x1E9E)
		// @52B: aload_1
		// @52C: getfield byte[] game.C_100280_nf.field_101179_l
		// @52F: iload #50
		// @531: iinc #50 +1
		// @534: baload
		// @535: invokevirtual game.C_100280_nf.func_101169_f(int, int)void
		// @538: aload #51
		// @53A: sipush 7838 (0x1E9E)
		// @53D: aload_1
		// @53E: getfield byte[] game.C_100280_nf.field_101179_l
		// @541: iload #50
		// @543: iinc #50 +1
		// @546: baload
		// @547: invokevirtual game.C_100280_nf.func_101169_f(int, int)void
		// @54A: aload #51
		// @54C: sipush 7838 (0x1E9E)
		// @54F: aload_1
		// @550: getfield byte[] game.C_100280_nf.field_101179_l
		// @553: iload #50
		// @555: iinc #50 +1
		// @558: baload
		// @559: invokevirtual game.C_100280_nf.func_101169_f(int, int)void
		// @55C: goto @487
		// @55F: iload #52
		// @561: iload #64
		// @563: iconst_4
		// @564: ishr
		// @565: ixor
		// @566: istore #52
		// @568: iload #62
		// @56A: ifne @5C3
		// @56D: iload #65
		// @56F: ifeq @588
		// @572: goto @576
		// @575: athrow
		// @576: aload #51
		// @578: sipush 7838 (0x1E9E)
		// @57B: sipush 144 (0x0090)
		// @57E: iload #52
		// @580: iadd
		// @581: invokevirtual game.C_100280_nf.func_101169_f(int, int)void
		// @584: goto @588
		// @587: athrow
		// @588: iload #53
		// @58A: aload_1
		// @58B: getfield byte[] game.C_100280_nf.field_101179_l
		// @58E: iload #37
		// @590: iinc #37 +1
		// @593: baload
		// @594: iadd
		// @595: istore #53
		// @597: iload #54
		// @599: aload_1
		// @59A: getfield byte[] game.C_100280_nf.field_101179_l
		// @59D: iload #38
		// @59F: iinc #38 +1
		// @5A2: baload
		// @5A3: iadd
		// @5A4: istore #54
		// @5A6: aload #51
		// @5A8: sipush 7838 (0x1E9E)
		// @5AB: iload #53
		// @5AD: bipush 127 (0x7F)
		// @5AF: iand
		// @5B0: invokevirtual game.C_100280_nf.func_101169_f(int, int)void
		// @5B3: aload #51
		// @5B5: sipush 7838 (0x1E9E)
		// @5B8: iload #54
		// @5BA: bipush 127 (0x7F)
		// @5BC: iand
		// @5BD: invokevirtual game.C_100280_nf.func_101169_f(int, int)void
		// @5C0: goto @487
		// @5C3: iload #62
		// @5C5: iconst_1
		// @5C6: if_icmpne @61F
		// @5C9: iload #65
		// @5CB: ifeq @5E4
		// @5CE: goto @5D2
		// @5D1: athrow
		// @5D2: aload #51
		// @5D4: sipush 7838 (0x1E9E)
		// @5D7: sipush 128 (0x0080)
		// @5DA: iload #52
		// @5DC: iadd
		// @5DD: invokevirtual game.C_100280_nf.func_101169_f(int, int)void
		// @5E0: goto @5E4
		// @5E3: athrow
		// @5E4: iload #53
		// @5E6: aload_1
		// @5E7: getfield byte[] game.C_100280_nf.field_101179_l
		// @5EA: iload #37
		// @5EC: iinc #37 +1
		// @5EF: baload
		// @5F0: iadd
		// @5F1: istore #53
		// @5F3: iload #55
		// @5F5: aload_1
		// @5F6: getfield byte[] game.C_100280_nf.field_101179_l
		// @5F9: iload #40
		// @5FB: iinc #40 +1
		// @5FE: baload
		// @5FF: iadd
		// @600: istore #55
		// @602: aload #51
		// @604: sipush 7838 (0x1E9E)
		// @607: iload #53
		// @609: bipush 127 (0x7F)
		// @60B: iand
		// @60C: invokevirtual game.C_100280_nf.func_101169_f(int, int)void
		// @60F: aload #51
		// @611: sipush 7838 (0x1E9E)
		// @614: iload #55
		// @616: bipush 127 (0x7F)
		// @618: iand
		// @619: invokevirtual game.C_100280_nf.func_101169_f(int, int)void
		// @61C: goto @487
		// @61F: iload #62
		// @621: iconst_2
		// @622: if_icmpne @7C5
		// @625: iload #65
		// @627: ifeq @640
		// @62A: goto @62E
		// @62D: athrow
		// @62E: aload #51
		// @630: sipush 7838 (0x1E9E)
		// @633: sipush 176 (0x00B0)
		// @636: iload #52
		// @638: iadd
		// @639: invokevirtual game.C_100280_nf.func_101169_f(int, int)void
		// @63C: goto @640
		// @63F: athrow
		// @640: iload #28
		// @642: aload_1
		// @643: getfield byte[] game.C_100280_nf.field_101179_l
		// @646: iload #15
		// @648: iinc #15 +1
		// @64B: baload
		// @64C: iadd
		// @64D: bipush 127 (0x7F)
		// @64F: iand
		// @650: istore #28
		// @652: aload #51
		// @654: sipush 7838 (0x1E9E)
		// @657: iload #28
		// @659: invokevirtual game.C_100280_nf.func_101169_f(int, int)void
		// @65C: iload #28
		// @65E: ifeq @66C
		// @661: iload #28
		// @663: bipush 32 (0x20)
		// @665: if_icmpne @67B
		// @668: goto @66C
		// @66B: athrow
		// @66C: aload_1
		// @66D: getfield byte[] game.C_100280_nf.field_101179_l
		// @670: iload #44
		// @672: iinc #44 +1
		// @675: baload
		// @676: istore #66
		// @678: goto @7A4
		// @67B: iload #28
		// @67D: iconst_1
		// @67E: if_icmpne @690
		// @681: aload_1
		// @682: getfield byte[] game.C_100280_nf.field_101179_l
		// @685: iload #34
		// @687: iinc #34 +1
		// @68A: baload
		// @68B: istore #66
		// @68D: goto @7A4
		// @690: iload #28
		// @692: bipush 33 (0x21)
		// @694: if_icmpne @6A6
		// @697: aload_1
		// @698: getfield byte[] game.C_100280_nf.field_101179_l
		// @69B: iload #41
		// @69D: iinc #41 +1
		// @6A0: baload
		// @6A1: istore #66
		// @6A3: goto @7A4
		// @6A6: iload #28
		// @6A8: bipush 7 (0x07)
		// @6AA: if_icmpne @6BC
		// @6AD: aload_1
		// @6AE: getfield byte[] game.C_100280_nf.field_101179_l
		// @6B1: iload #35
		// @6B3: iinc #35 +1
		// @6B6: baload
		// @6B7: istore #66
		// @6B9: goto @7A4
		// @6BC: iload #28
		// @6BE: bipush 39 (0x27)
		// @6C0: if_icmpne @6D2
		// @6C3: aload_1
		// @6C4: getfield byte[] game.C_100280_nf.field_101179_l
		// @6C7: iload #42
		// @6C9: iinc #42 +1
		// @6CC: baload
		// @6CD: istore #66
		// @6CF: goto @7A4
		// @6D2: iload #28
		// @6D4: bipush 10 (0x0A)
		// @6D6: if_icmpne @6E8
		// @6D9: aload_1
		// @6DA: getfield byte[] game.C_100280_nf.field_101179_l
		// @6DD: iload #36
		// @6DF: iinc #36 +1
		// @6E2: baload
		// @6E3: istore #66
		// @6E5: goto @7A4
		// @6E8: iload #28
		// @6EA: bipush 42 (0x2A)
		// @6EC: if_icmpne @6FE
		// @6EF: aload_1
		// @6F0: getfield byte[] game.C_100280_nf.field_101179_l
		// @6F3: iload #43
		// @6F5: iinc #43 +1
		// @6F8: baload
		// @6F9: istore #66
		// @6FB: goto @7A4
		// @6FE: iload #28
		// @700: bipush 99 (0x63)
		// @702: if_icmpne @714
		// @705: aload_1
		// @706: getfield byte[] game.C_100280_nf.field_101179_l
		// @709: iload #46
		// @70B: iinc #46 +1
		// @70E: baload
		// @70F: istore #66
		// @711: goto @7A4
		// @714: iload #28
		// @716: bipush 98 (0x62)
		// @718: if_icmpne @72A
		// @71B: aload_1
		// @71C: getfield byte[] game.C_100280_nf.field_101179_l
		// @71F: iload #47
		// @721: iinc #47 +1
		// @724: baload
		// @725: istore #66
		// @727: goto @7A4
		// @72A: iload #28
		// @72C: bipush 101 (0x65)
		// @72E: if_icmpne @740
		// @731: aload_1
		// @732: getfield byte[] game.C_100280_nf.field_101179_l
		// @735: iload #48
		// @737: iinc #48 +1
		// @73A: baload
		// @73B: istore #66
		// @73D: goto @7A4
		// @740: iload #28
		// @742: bipush 100 (0x64)
		// @744: if_icmpne @756
		// @747: aload_1
		// @748: getfield byte[] game.C_100280_nf.field_101179_l
		// @74B: iload #49
		// @74D: iinc #49 +1
		// @750: baload
		// @751: istore #66
		// @753: goto @7A4
		// @756: iload #28
		// @758: bipush 64 (0x40)
		// @75A: if_icmpeq @789
		// @75D: iload #28
		// @75F: bipush 65 (0x41)
		// @761: if_icmpeq @789
		// @764: goto @768
		// @767: athrow
		// @768: iload #28
		// @76A: bipush 120 (0x78)
		// @76C: if_icmpeq @789
		// @76F: goto @773
		// @772: athrow
		// @773: iload #28
		// @775: bipush 121 (0x79)
		// @777: if_icmpeq @789
		// @77A: goto @77E
		// @77D: athrow
		// @77E: iload #28
		// @780: bipush 123 (0x7B)
		// @782: if_icmpne @798
		// @785: goto @789
		// @788: athrow
		// @789: aload_1
		// @78A: getfield byte[] game.C_100280_nf.field_101179_l
		// @78D: iload #30
		// @78F: iinc #30 +1
		// @792: baload
		// @793: istore #66
		// @795: goto @7A4
		// @798: aload_1
		// @799: getfield byte[] game.C_100280_nf.field_101179_l
		// @79C: iload #39
		// @79E: iinc #39 +1
		// @7A1: baload
		// @7A2: istore #66
		// @7A4: iload #66
		// @7A6: aload #59
		// @7A8: iload #28
		// @7AA: iaload
		// @7AB: iadd
		// @7AC: istore #66
		// @7AE: aload #59
		// @7B0: iload #28
		// @7B2: iload #66
		// @7B4: iastore
		// @7B5: aload #51
		// @7B7: sipush 7838 (0x1E9E)
		// @7BA: iload #66
		// @7BC: bipush 127 (0x7F)
		// @7BE: iand
		// @7BF: invokevirtual game.C_100280_nf.func_101169_f(int, int)void
		// @7C2: goto @487
		// @7C5: iload #62
		// @7C7: iconst_3
		// @7C8: if_icmpne @827
		// @7CB: iload #65
		// @7CD: ifeq @7E6
		// @7D0: goto @7D4
		// @7D3: athrow
		// @7D4: aload #51
		// @7D6: sipush 7838 (0x1E9E)
		// @7D9: sipush 224 (0x00E0)
		// @7DC: iload #52
		// @7DE: iadd
		// @7DF: invokevirtual game.C_100280_nf.func_101169_f(int, int)void
		// @7E2: goto @7E6
		// @7E5: athrow
		// @7E6: iload #56
		// @7E8: aload_1
		// @7E9: getfield byte[] game.C_100280_nf.field_101179_l
		// @7EC: iload #45
		// @7EE: iinc #45 +1
		// @7F1: baload
		// @7F2: iadd
		// @7F3: istore #56
		// @7F5: iload #56
		// @7F7: aload_1
		// @7F8: getfield byte[] game.C_100280_nf.field_101179_l
		// @7FB: iload #33
		// @7FD: iinc #33 +1
		// @800: baload
		// @801: bipush 7 (0x07)
		// @803: ishl
		// @804: iadd
		// @805: istore #56
		// @807: aload #51
		// @809: sipush 7838 (0x1E9E)
		// @80C: iload #56
		// @80E: bipush 127 (0x7F)
		// @810: iand
		// @811: invokevirtual game.C_100280_nf.func_101169_f(int, int)void
		// @814: aload #51
		// @816: sipush 7838 (0x1E9E)
		// @819: iload #56
		// @81B: bipush 7 (0x07)
		// @81D: ishr
		// @81E: bipush 127 (0x7F)
		// @820: iand
		// @821: invokevirtual game.C_100280_nf.func_101169_f(int, int)void
		// @824: goto @487
		// @827: iload #62
		// @829: iconst_4
		// @82A: if_icmpne @867
		// @82D: iload #65
		// @82F: ifeq @848
		// @832: goto @836
		// @835: athrow
		// @836: aload #51
		// @838: sipush 7838 (0x1E9E)
		// @83B: sipush 208 (0x00D0)
		// @83E: iload #52
		// @840: iadd
		// @841: invokevirtual game.C_100280_nf.func_101169_f(int, int)void
		// @844: goto @848
		// @847: athrow
		// @848: iload #57
		// @84A: aload_1
		// @84B: getfield byte[] game.C_100280_nf.field_101179_l
		// @84E: iload #32
		// @850: iinc #32 +1
		// @853: baload
		// @854: iadd
		// @855: istore #57
		// @857: aload #51
		// @859: sipush 7838 (0x1E9E)
		// @85C: iload #57
		// @85E: bipush 127 (0x7F)
		// @860: iand
		// @861: invokevirtual game.C_100280_nf.func_101169_f(int, int)void
		// @864: goto @487
		// @867: iload #62
		// @869: iconst_5
		// @86A: if_icmpne @8C3
		// @86D: iload #65
		// @86F: ifeq @888
		// @872: goto @876
		// @875: athrow
		// @876: aload #51
		// @878: sipush 7838 (0x1E9E)
		// @87B: sipush 160 (0x00A0)
		// @87E: iload #52
		// @880: iadd
		// @881: invokevirtual game.C_100280_nf.func_101169_f(int, int)void
		// @884: goto @888
		// @887: athrow
		// @888: iload #53
		// @88A: aload_1
		// @88B: getfield byte[] game.C_100280_nf.field_101179_l
		// @88E: iload #37
		// @890: iinc #37 +1
		// @893: baload
		// @894: iadd
		// @895: istore #53
		// @897: iload #58
		// @899: aload_1
		// @89A: getfield byte[] game.C_100280_nf.field_101179_l
		// @89D: iload #31
		// @89F: iinc #31 +1
		// @8A2: baload
		// @8A3: iadd
		// @8A4: istore #58
		// @8A6: aload #51
		// @8A8: sipush 7838 (0x1E9E)
		// @8AB: iload #53
		// @8AD: bipush 127 (0x7F)
		// @8AF: iand
		// @8B0: invokevirtual game.C_100280_nf.func_101169_f(int, int)void
		// @8B3: aload #51
		// @8B5: sipush 7838 (0x1E9E)
		// @8B8: iload #58
		// @8BA: bipush 127 (0x7F)
		// @8BC: iand
		// @8BD: invokevirtual game.C_100280_nf.func_101169_f(int, int)void
		// @8C0: goto @487
		// @8C3: iload #62
		// @8C5: bipush 6 (0x06)
		// @8C7: if_icmpne @8FA
		// @8CA: iload #65
		// @8CC: ifeq @8E5
		// @8CF: goto @8D3
		// @8D2: athrow
		// @8D3: aload #51
		// @8D5: sipush 7838 (0x1E9E)
		// @8D8: sipush 192 (0x00C0)
		// @8DB: iload #52
		// @8DD: iadd
		// @8DE: invokevirtual game.C_100280_nf.func_101169_f(int, int)void
		// @8E1: goto @8E5
		// @8E4: athrow
		// @8E5: aload #51
		// @8E7: sipush 7838 (0x1E9E)
		// @8EA: aload_1
		// @8EB: getfield byte[] game.C_100280_nf.field_101179_l
		// @8EE: iload #44
		// @8F0: iinc #44 +1
		// @8F3: baload
		// @8F4: invokevirtual game.C_100280_nf.func_101169_f(int, int)void
		// @8F7: goto @487
		// @8FA: new java.lang.RuntimeException
		// @8FD: dup
		// @8FE: invokespecial java.lang.RuntimeException.<init>()void
		// @901: athrow
		// @902: aload #51
		// @904: sipush 19304 (0x4B68)
		// @907: aload #51
		// @909: getfield int game.C_100280_nf.field_101177_n
		// @90C: iload #61
		// @90E: isub
		// @90F: invokevirtual game.C_100280_nf.func_101152_a(int, int)void
		// @912: iinc #60 +1
		// @915: goto @463
		// @918: return
	}
}
