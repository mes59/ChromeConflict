package game;

final class C_100091_m
{
	private C_100301_kb field_104515_b;
	private C_100301_kb field_104513_d;
	private int field_104512_g;
	static C_100220_ac field_104516_c;
	static String field_104511_f;
	static String field_104519_h;
	private int field_104517_a;
	static int field_104514_e;
	private static final String[] field_104518_z;
	
	private final boolean func_104502_a(byte arg0, byte[] arg1, int arg2, int arg3, boolean arg4)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #16
		// @005: aload_0
		// @006: getfield game.C_100301_kb game.C_100091_m.field_104515_b
		// @009: dup
		// @00A: astore #6
		// @00C: monitorenter
		// @00D: iload #5
		// @00F: ifne @037
		// @012: ldc2_w 519
		// @015: aload_0
		// @016: getfield game.C_100301_kb game.C_100091_m.field_104515_b
		// @019: iconst_0
		// @01A: invokevirtual game.C_100301_kb.func_107074_c(int)long
		// @01D: ladd
		// @01E: ldc2_w 520
		// @021: ldiv
		// @022: l2i
		// @023: istore #7
		// @025: iconst_0
		// @026: iload #7
		// @028: if_icmpeq @02F
		// @02B: goto @0CC
		// @02E: athrow
		// @02F: iconst_1
		// @030: istore #7
		// @032: iload #16
		// @034: ifeq @0CC
		// @037: aload_0
		// @038: getfield game.C_100301_kb game.C_100091_m.field_104513_d
		// @03B: iload_1
		// @03C: bipush -72 (0xB8)
		// @03E: iadd
		// @03F: invokevirtual game.C_100301_kb.func_107074_c(int)long
		// @042: ldc2_w -1
		// @045: lxor
		// @046: iload #4
		// @048: bipush 6 (0x06)
		// @04A: imul
		// @04B: bipush 6 (0x06)
		// @04D: iadd
		// @04E: i2l
		// @04F: ldc2_w -1
		// @052: lxor
		// @053: lcmp
		// @054: ifle @060
		// @057: goto @05B
		// @05A: athrow
		// @05B: iconst_0
		// @05C: aload #6
		// @05E: monitorexit
		// @05F: ireturn
		// @060: aload_0
		// @061: getfield game.C_100301_kb game.C_100091_m.field_104513_d
		// @064: iload #4
		// @066: bipush 6 (0x06)
		// @068: imul
		// @069: i2l
		// @06A: bipush -127 (0x81)
		// @06C: invokevirtual game.C_100301_kb.func_107086_a(long, int)void
		// @06F: aload_0
		// @070: getfield game.C_100301_kb game.C_100091_m.field_104513_d
		// @073: iconst_0
		// @074: bipush -125 (0x83)
		// @076: bipush 6 (0x06)
		// @078: getstatic byte[] game.C_100197_ra.field_100864_u
		// @07B: invokevirtual game.C_100301_kb.func_107085_a(int, byte, int, byte[])void
		// @07E: sipush 255 (0x00FF)
		// @081: getstatic byte[] game.C_100197_ra.field_100864_u
		// @084: iconst_5
		// @085: baload
		// @086: iand
		// @087: sipush 255 (0x00FF)
		// @08A: getstatic byte[] game.C_100197_ra.field_100864_u
		// @08D: iconst_3
		// @08E: baload
		// @08F: iand
		// @090: ldc -1752786704 (0x978698f0)
		// @092: ishl
		// @093: sipush 255 (0x00FF)
		// @096: getstatic byte[] game.C_100197_ra.field_100864_u
		// @099: iconst_4
		// @09A: baload
		// @09B: iand
		// @09C: ldc 573134824 (0x222957e8)
		// @09E: ishl
		// @09F: iadd
		// @0A0: iadd
		// @0A1: istore #7
		// @0A3: iload #7
		// @0A5: ifle @0C7
		// @0A8: iload #7
		// @0AA: i2l
		// @0AB: ldc2_w -1
		// @0AE: lxor
		// @0AF: aload_0
		// @0B0: getfield game.C_100301_kb game.C_100091_m.field_104515_b
		// @0B3: iconst_0
		// @0B4: invokevirtual game.C_100301_kb.func_107074_c(int)long
		// @0B7: ldc2_w 520
		// @0BA: ldiv
		// @0BB: ldc2_w -1
		// @0BE: lxor
		// @0BF: lcmp
		// @0C0: ifge @0CC
		// @0C3: goto @0C7
		// @0C6: athrow
		// @0C7: iconst_0
		// @0C8: aload #6
		// @0CA: monitorexit
		// @0CB: ireturn
		// @0CC: getstatic byte[] game.C_100197_ra.field_100864_u
		// @0CF: iconst_4
		// @0D0: iload #7
		// @0D2: ldc 735392328 (0x2bd53248)
		// @0D4: ishr
		// @0D5: i2b
		// @0D6: bastore
		// @0D7: getstatic byte[] game.C_100197_ra.field_100864_u
		// @0DA: iconst_2
		// @0DB: iload_3
		// @0DC: i2b
		// @0DD: bastore
		// @0DE: getstatic byte[] game.C_100197_ra.field_100864_u
		// @0E1: iconst_0
		// @0E2: iload_3
		// @0E3: ldc 1248278608 (0x4a673850)
		// @0E5: ishr
		// @0E6: i2b
		// @0E7: bastore
		// @0E8: getstatic byte[] game.C_100197_ra.field_100864_u
		// @0EB: iconst_5
		// @0EC: iload #7
		// @0EE: i2b
		// @0EF: bastore
		// @0F0: getstatic byte[] game.C_100197_ra.field_100864_u
		// @0F3: iconst_1
		// @0F4: iload_3
		// @0F5: ldc -1092480632 (0xbee21188)
		// @0F7: ishr
		// @0F8: i2b
		// @0F9: bastore
		// @0FA: getstatic byte[] game.C_100197_ra.field_100864_u
		// @0FD: iconst_3
		// @0FE: iload #7
		// @100: ldc 1226630992 (0x491ce750)
		// @102: ishr
		// @103: i2b
		// @104: bastore
		// @105: aload_0
		// @106: getfield game.C_100301_kb game.C_100091_m.field_104513_d
		// @109: iload #4
		// @10B: bipush 6 (0x06)
		// @10D: imul
		// @10E: i2l
		// @10F: bipush -105 (0x97)
		// @111: invokevirtual game.C_100301_kb.func_107086_a(long, int)void
		// @114: aload_0
		// @115: getfield game.C_100301_kb game.C_100091_m.field_104513_d
		// @118: getstatic byte[] game.C_100197_ra.field_100864_u
		// @11B: bipush 6 (0x06)
		// @11D: iconst_0
		// @11E: bipush -107 (0x95)
		// @120: invokevirtual game.C_100301_kb.func_107079_a(byte[], int, int, byte)void
		// @123: iconst_0
		// @124: istore #8
		// @126: iload_1
		// @127: bipush 72 (0x48)
		// @129: if_icmpeq @131
		// @12C: iconst_1
		// @12D: aload #6
		// @12F: monitorexit
		// @130: ireturn
		// @131: iconst_0
		// @132: istore #9
		// @134: iload #8
		// @136: iload_3
		// @137: if_icmpge @491
		// @13A: iconst_0
		// @13B: istore #10
		// @13D: iload #5
		// @13F: iload #16
		// @141: ifne @495
		// @144: ifeq @2D8
		// @147: goto @14B
		// @14A: athrow
		// @14B: aload_0
		// @14C: getfield game.C_100301_kb game.C_100091_m.field_104515_b
		// @14F: sipush 520 (0x0208)
		// @152: iload #7
		// @154: imul
		// @155: i2l
		// @156: bipush -124 (0x84)
		// @158: invokevirtual game.C_100301_kb.func_107086_a(long, int)void
		// @15B: ldc -65536 (0xffff0000)
		// @15D: iload #4
		// @15F: iconst_m1
		// @160: ixor
		// @161: if_icmple @202
		// @164: goto @168
		// @167: athrow
		// @168: aload_0
		// @169: getfield game.C_100301_kb game.C_100091_m.field_104515_b
		// @16C: iconst_0
		// @16D: bipush -126 (0x82)
		// @16F: bipush 10 (0x0A)
		// @171: getstatic byte[] game.C_100197_ra.field_100864_u
		// @174: invokevirtual game.C_100301_kb.func_107085_a(int, byte, int, byte[])void
		// @177: goto @182
		// @17A: athrow
		// @17B: astore #14
		// @17D: iload #16
		// @17F: ifeq @491
		// @182: getstatic byte[] game.C_100197_ra.field_100864_u
		// @185: iconst_5
		// @186: baload
		// @187: sipush 255 (0x00FF)
		// @18A: iand
		// @18B: sipush 255 (0x00FF)
		// @18E: getstatic byte[] game.C_100197_ra.field_100864_u
		// @191: iconst_4
		// @192: baload
		// @193: iand
		// @194: ldc 1352832296 (0x50a29528)
		// @196: ishl
		// @197: iadd
		// @198: istore #12
		// @19A: getstatic byte[] game.C_100197_ra.field_100864_u
		// @19D: bipush 9 (0x09)
		// @19F: baload
		// @1A0: sipush 255 (0x00FF)
		// @1A3: iand
		// @1A4: istore #13
		// @1A6: getstatic byte[] game.C_100197_ra.field_100864_u
		// @1A9: iconst_2
		// @1AA: baload
		// @1AB: ldc -2082965144 (0x83d87968)
		// @1AD: ishl
		// @1AE: ldc 65280 (0xff00)
		// @1B0: iand
		// @1B1: ldc -16777216 (0xff000000)
		// @1B3: getstatic byte[] game.C_100197_ra.field_100864_u
		// @1B6: iconst_0
		// @1B7: baload
		// @1B8: ldc 16842040 (0x100fd38)
		// @1BA: ishl
		// @1BB: iand
		// @1BC: ldc 16711680 (0xff0000)
		// @1BE: getstatic byte[] game.C_100197_ra.field_100864_u
		// @1C1: iconst_1
		// @1C2: baload
		// @1C3: ldc -618292400 (0xdb259b50)
		// @1C5: ishl
		// @1C6: iand
		// @1C7: getstatic byte[] game.C_100197_ra.field_100864_u
		// @1CA: iconst_3
		// @1CB: baload
		// @1CC: sipush 255 (0x00FF)
		// @1CF: iand
		// @1D0: iadd
		// @1D1: iadd
		// @1D2: iadd
		// @1D3: istore #11
		// @1D5: getstatic byte[] game.C_100197_ra.field_100864_u
		// @1D8: bipush 6 (0x06)
		// @1DA: baload
		// @1DB: ldc 2122197840 (0x7e7e2b50)
		// @1DD: ishl
		// @1DE: ldc 16711680 (0xff0000)
		// @1E0: iand
		// @1E1: sipush 255 (0x00FF)
		// @1E4: getstatic byte[] game.C_100197_ra.field_100864_u
		// @1E7: bipush 7 (0x07)
		// @1E9: baload
		// @1EA: iand
		// @1EB: ldc 1500294760 (0x596cae68)
		// @1ED: ishl
		// @1EE: ineg
		// @1EF: sipush 255 (0x00FF)
		// @1F2: getstatic byte[] game.C_100197_ra.field_100864_u
		// @1F5: bipush 8 (0x08)
		// @1F7: baload
		// @1F8: iand
		// @1F9: isub
		// @1FA: isub
		// @1FB: istore #10
		// @1FD: iload #16
		// @1FF: ifeq @27D
		// @202: aload_0
		// @203: getfield game.C_100301_kb game.C_100091_m.field_104515_b
		// @206: iconst_0
		// @207: bipush -96 (0xA0)
		// @209: bipush 8 (0x08)
		// @20B: getstatic byte[] game.C_100197_ra.field_100864_u
		// @20E: invokevirtual game.C_100301_kb.func_107085_a(int, byte, int, byte[])void
		// @211: goto @21C
		// @214: athrow
		// @215: astore #14
		// @217: iload #16
		// @219: ifeq @491
		// @21C: getstatic byte[] game.C_100197_ra.field_100864_u
		// @21F: iconst_3
		// @220: baload
		// @221: sipush 255 (0x00FF)
		// @224: iand
		// @225: getstatic byte[] game.C_100197_ra.field_100864_u
		// @228: iconst_2
		// @229: baload
		// @22A: sipush 255 (0x00FF)
		// @22D: iand
		// @22E: ldc 353726920 (0x151571c8)
		// @230: ishl
		// @231: iadd
		// @232: istore #12
		// @234: sipush 255 (0x00FF)
		// @237: getstatic byte[] game.C_100197_ra.field_100864_u
		// @23A: bipush 6 (0x06)
		// @23C: baload
		// @23D: iand
		// @23E: sipush 255 (0x00FF)
		// @241: getstatic byte[] game.C_100197_ra.field_100864_u
		// @244: iconst_5
		// @245: baload
		// @246: iand
		// @247: ldc -1246526424 (0xb5b38428)
		// @249: ishl
		// @24A: iadd
		// @24B: sipush 255 (0x00FF)
		// @24E: getstatic byte[] game.C_100197_ra.field_100864_u
		// @251: iconst_4
		// @252: baload
		// @253: iand
		// @254: ldc -63145264 (0xfc3c7ad0)
		// @256: ishl
		// @257: iadd
		// @258: istore #10
		// @25A: getstatic byte[] game.C_100197_ra.field_100864_u
		// @25D: iconst_0
		// @25E: baload
		// @25F: ldc -55331992 (0xfcb3b368)
		// @261: ishl
		// @262: ldc 65280 (0xff00)
		// @264: iand
		// @265: getstatic byte[] game.C_100197_ra.field_100864_u
		// @268: iconst_1
		// @269: baload
		// @26A: sipush 255 (0x00FF)
		// @26D: iand
		// @26E: iadd
		// @26F: istore #11
		// @271: sipush 255 (0x00FF)
		// @274: getstatic byte[] game.C_100197_ra.field_100864_u
		// @277: bipush 7 (0x07)
		// @279: baload
		// @27A: iand
		// @27B: istore #13
		// @27D: iload #4
		// @27F: iload #11
		// @281: if_icmpne @2A4
		// @284: iload #12
		// @286: iconst_m1
		// @287: ixor
		// @288: iload #9
		// @28A: iconst_m1
		// @28B: ixor
		// @28C: if_icmpne @2A4
		// @28F: goto @293
		// @292: athrow
		// @293: aload_0
		// @294: getfield int game.C_100091_m.field_104517_a
		// @297: iload #13
		// @299: if_icmpne @2A4
		// @29C: goto @2A0
		// @29F: athrow
		// @2A0: goto @2A9
		// @2A3: athrow
		// @2A4: iconst_0
		// @2A5: aload #6
		// @2A7: monitorexit
		// @2A8: ireturn
		// @2A9: iconst_m1
		// @2AA: iload #10
		// @2AC: iconst_m1
		// @2AD: ixor
		// @2AE: if_icmplt @2D3
		// @2B1: iload #10
		// @2B3: i2l
		// @2B4: ldc2_w -1
		// @2B7: lxor
		// @2B8: aload_0
		// @2B9: getfield game.C_100301_kb game.C_100091_m.field_104515_b
		// @2BC: iload_1
		// @2BD: bipush -72 (0xB8)
		// @2BF: iadd
		// @2C0: invokevirtual game.C_100301_kb.func_107074_c(int)long
		// @2C3: ldc2_w 520
		// @2C6: ldiv
		// @2C7: ldc2_w -1
		// @2CA: lxor
		// @2CB: lcmp
		// @2CC: ifge @2D8
		// @2CF: goto @2D3
		// @2D2: athrow
		// @2D3: iconst_0
		// @2D4: aload #6
		// @2D6: monitorexit
		// @2D7: ireturn
		// @2D8: iload #10
		// @2DA: iconst_m1
		// @2DB: ixor
		// @2DC: iconst_m1
		// @2DD: if_icmpeq @2E4
		// @2E0: goto @31B
		// @2E3: athrow
		// @2E4: aload_0
		// @2E5: getfield game.C_100301_kb game.C_100091_m.field_104515_b
		// @2E8: iconst_0
		// @2E9: invokevirtual game.C_100301_kb.func_107074_c(int)long
		// @2EC: ldc2_w -519
		// @2EF: lsub
		// @2F0: ldc2_w 520
		// @2F3: ldiv
		// @2F4: l2i
		// @2F5: istore #10
		// @2F7: iconst_0
		// @2F8: istore #5
		// @2FA: iload #10
		// @2FC: iconst_m1
		// @2FD: ixor
		// @2FE: iconst_m1
		// @2FF: if_icmpne @309
		// @302: iinc #10 +1
		// @305: goto @309
		// @308: athrow
		// @309: iload #10
		// @30B: iconst_m1
		// @30C: ixor
		// @30D: iload #7
		// @30F: iconst_m1
		// @310: ixor
		// @311: if_icmpne @31B
		// @314: iinc #10 +1
		// @317: goto @31B
		// @31A: athrow
		// @31B: iload #8
		// @31D: ineg
		// @31E: iload_3
		// @31F: iadd
		// @320: sipush 512 (0x0200)
		// @323: if_icmpgt @329
		// @326: iconst_0
		// @327: istore #10
		// @329: iload #4
		// @32B: ldc 65535 (0xffff)
		// @32D: if_icmple @3E5
		// @330: getstatic byte[] game.C_100197_ra.field_100864_u
		// @333: bipush 6 (0x06)
		// @335: iload #10
		// @337: ldc 1593346544 (0x5ef889f0)
		// @339: ishr
		// @33A: i2b
		// @33B: bastore
		// @33C: getstatic byte[] game.C_100197_ra.field_100864_u
		// @33F: bipush 8 (0x08)
		// @341: iload #10
		// @343: i2b
		// @344: bastore
		// @345: getstatic byte[] game.C_100197_ra.field_100864_u
		// @348: iconst_5
		// @349: iload #9
		// @34B: i2b
		// @34C: bastore
		// @34D: getstatic byte[] game.C_100197_ra.field_100864_u
		// @350: iconst_3
		// @351: iload #4
		// @353: i2b
		// @354: bastore
		// @355: getstatic byte[] game.C_100197_ra.field_100864_u
		// @358: bipush 7 (0x07)
		// @35A: iload #10
		// @35C: ldc 569321320 (0x21ef2768)
		// @35E: ishr
		// @35F: i2b
		// @360: bastore
		// @361: getstatic byte[] game.C_100197_ra.field_100864_u
		// @364: iconst_0
		// @365: iload #4
		// @367: ldc 1885943800 (0x706937f8)
		// @369: ishr
		// @36A: i2b
		// @36B: bastore
		// @36C: getstatic byte[] game.C_100197_ra.field_100864_u
		// @36F: iconst_1
		// @370: iload #4
		// @372: ldc 1376758896 (0x520fac70)
		// @374: ishr
		// @375: i2b
		// @376: bastore
		// @377: getstatic byte[] game.C_100197_ra.field_100864_u
		// @37A: bipush 9 (0x09)
		// @37C: aload_0
		// @37D: getfield int game.C_100091_m.field_104517_a
		// @380: i2b
		// @381: bastore
		// @382: getstatic byte[] game.C_100197_ra.field_100864_u
		// @385: iconst_4
		// @386: iload #9
		// @388: ldc 982310056 (0x3a8cdca8)
		// @38A: ishr
		// @38B: i2b
		// @38C: bastore
		// @38D: getstatic byte[] game.C_100197_ra.field_100864_u
		// @390: iconst_2
		// @391: iload #4
		// @393: ldc -1929220056 (0x8d027028)
		// @395: ishr
		// @396: i2b
		// @397: bastore
		// @398: aload_0
		// @399: getfield game.C_100301_kb game.C_100091_m.field_104515_b
		// @39C: iload #7
		// @39E: sipush 520 (0x0208)
		// @3A1: imul
		// @3A2: i2l
		// @3A3: bipush 95 (0x5F)
		// @3A5: invokevirtual game.C_100301_kb.func_107086_a(long, int)void
		// @3A8: aload_0
		// @3A9: getfield game.C_100301_kb game.C_100091_m.field_104515_b
		// @3AC: getstatic byte[] game.C_100197_ra.field_100864_u
		// @3AF: bipush 10 (0x0A)
		// @3B1: iconst_0
		// @3B2: bipush -101 (0x9B)
		// @3B4: invokevirtual game.C_100301_kb.func_107079_a(byte[], int, int, byte)void
		// @3B7: iload_3
		// @3B8: iload #8
		// @3BA: ineg
		// @3BB: iadd
		// @3BC: istore #11
		// @3BE: sipush 510 (0x01FE)
		// @3C1: iload #11
		// @3C3: if_icmpge @3CB
		// @3C6: sipush 510 (0x01FE)
		// @3C9: istore #11
		// @3CB: aload_0
		// @3CC: getfield game.C_100301_kb game.C_100091_m.field_104515_b
		// @3CF: aload_2
		// @3D0: iload #11
		// @3D2: iload #8
		// @3D4: bipush -125 (0x83)
		// @3D6: invokevirtual game.C_100301_kb.func_107079_a(byte[], int, int, byte)void
		// @3D9: iload #8
		// @3DB: iload #11
		// @3DD: iadd
		// @3DE: istore #8
		// @3E0: iload #16
		// @3E2: ifeq @485
		// @3E5: getstatic byte[] game.C_100197_ra.field_100864_u
		// @3E8: iconst_3
		// @3E9: iload #9
		// @3EB: i2b
		// @3EC: bastore
		// @3ED: getstatic byte[] game.C_100197_ra.field_100864_u
		// @3F0: iconst_1
		// @3F1: iload #4
		// @3F3: i2b
		// @3F4: bastore
		// @3F5: getstatic byte[] game.C_100197_ra.field_100864_u
		// @3F8: iconst_2
		// @3F9: iload #9
		// @3FB: ldc 1585287464 (0x5e7d9128)
		// @3FD: ishr
		// @3FE: i2b
		// @3FF: bastore
		// @400: getstatic byte[] game.C_100197_ra.field_100864_u
		// @403: bipush 7 (0x07)
		// @405: aload_0
		// @406: getfield int game.C_100091_m.field_104517_a
		// @409: i2b
		// @40A: bastore
		// @40B: getstatic byte[] game.C_100197_ra.field_100864_u
		// @40E: iconst_4
		// @40F: iload #10
		// @411: ldc 457440432 (0x1b43fcb0)
		// @413: ishr
		// @414: i2b
		// @415: bastore
		// @416: getstatic byte[] game.C_100197_ra.field_100864_u
		// @419: iconst_0
		// @41A: iload #4
		// @41C: ldc -1399018680 (0xac9cab48)
		// @41E: ishr
		// @41F: i2b
		// @420: bastore
		// @421: getstatic byte[] game.C_100197_ra.field_100864_u
		// @424: bipush 6 (0x06)
		// @426: iload #10
		// @428: i2b
		// @429: bastore
		// @42A: getstatic byte[] game.C_100197_ra.field_100864_u
		// @42D: iconst_5
		// @42E: iload #10
		// @430: ldc -1077370904 (0xbfc89fe8)
		// @432: ishr
		// @433: i2b
		// @434: bastore
		// @435: aload_0
		// @436: getfield game.C_100301_kb game.C_100091_m.field_104515_b
		// @439: iload #7
		// @43B: sipush 520 (0x0208)
		// @43E: imul
		// @43F: i2l
		// @440: iload_1
		// @441: bipush 96 (0x60)
		// @443: ixor
		// @444: invokevirtual game.C_100301_kb.func_107086_a(long, int)void
		// @447: aload_0
		// @448: getfield game.C_100301_kb game.C_100091_m.field_104515_b
		// @44B: getstatic byte[] game.C_100197_ra.field_100864_u
		// @44E: bipush 8 (0x08)
		// @450: iconst_0
		// @451: bipush -86 (0xAA)
		// @453: invokevirtual game.C_100301_kb.func_107079_a(byte[], int, int, byte)void
		// @456: iload_3
		// @457: iload #8
		// @459: ineg
		// @45A: iadd
		// @45B: istore #11
		// @45D: iload #11
		// @45F: iconst_m1
		// @460: ixor
		// @461: sipush -513 (0xFDFF)
		// @464: if_icmplt @46B
		// @467: goto @470
		// @46A: athrow
		// @46B: sipush 512 (0x0200)
		// @46E: istore #11
		// @470: aload_0
		// @471: getfield game.C_100301_kb game.C_100091_m.field_104515_b
		// @474: aload_2
		// @475: iload #11
		// @477: iload #8
		// @479: bipush -106 (0x96)
		// @47B: invokevirtual game.C_100301_kb.func_107079_a(byte[], int, int, byte)void
		// @47E: iload #8
		// @480: iload #11
		// @482: iadd
		// @483: istore #8
		// @485: iinc #9 +1
		// @488: iload #10
		// @48A: istore #7
		// @48C: iload #16
		// @48E: ifeq @134
		// @491: iconst_1
		// @492: aload #6
		// @494: monitorexit
		// @495: ireturn
		// @496: astore #7
		// @498: iconst_0
		// @499: aload #6
		// @49B: monitorexit
		// @49C: ireturn
		// @49D: astore #15
		// @49F: aload #6
		// @4A1: monitorexit
		// @4A2: aload #15
		// @4A4: athrow
		// @4A5: astore #6
		// @4A7: aload #6
		// @4A9: new java.lang.StringBuilder
		// @4AC: dup
		// @4AD: invokespecial java.lang.StringBuilder.<init>()void
		// @4B0: getstatic java.lang.String[] game.C_100091_m.field_104518_z
		// @4B3: iconst_5
		// @4B4: aaload
		// @4B5: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4B8: iload_1
		// @4B9: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4BC: bipush 44 (0x2C)
		// @4BE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4C1: aload_2
		// @4C2: ifnull @4CE
		// @4C5: getstatic java.lang.String[] game.C_100091_m.field_104518_z
		// @4C8: iconst_1
		// @4C9: aaload
		// @4CA: goto @4D3
		// @4CD: athrow
		// @4CE: getstatic java.lang.String[] game.C_100091_m.field_104518_z
		// @4D1: iconst_0
		// @4D2: aaload
		// @4D3: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4D6: bipush 44 (0x2C)
		// @4D8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4DB: iload_3
		// @4DC: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4DF: bipush 44 (0x2C)
		// @4E1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4E4: iload #4
		// @4E6: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4E9: bipush 44 (0x2C)
		// @4EB: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4EE: iload #5
		// @4F0: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @4F3: bipush 41 (0x29)
		// @4F5: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4F8: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4FB: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4FE: athrow
	}
	
	static final void func_104510_a(int arg0, String arg1, boolean arg2, boolean arg3)
	{
		// @00: iload_0
		// @01: ldc -55331992 (0xfcb3b368)
		// @03: if_icmpeq @14
		// @06: bipush 92 (0x5C)
		// @08: aconst_null
		// @09: checkcast java.lang.CharSequence
		// @0C: invokestatic game.C_100091_m.func_104506_a(int, java.lang.CharSequence)int
		// @0F: pop
		// @10: goto @14
		// @13: athrow
		// @14: bipush 97 (0x61)
		// @16: invokestatic game.C_100253_ph.func_101085_a(byte)void
		// @19: getstatic game.C_100029_gn game.C_100085_a.field_102576_K
		// @1C: iconst_5
		// @1D: invokevirtual game.C_100029_gn.func_103362_n(int)void
		// @20: new game.C_100151_bc
		// @23: dup
		// @24: getstatic java.lang.String game.C_100322_hn.field_107239_c
		// @27: aconst_null
		// @28: getstatic boolean game.C_100186_rl.field_105720_f
		// @2B: iload_2
		// @2C: iload_3
		// @2D: invokespecial game.C_100151_bc.<init>(java.lang.String, java.lang.String, boolean, boolean, boolean)void
		// @30: putstatic game.C_100151_bc game.C_100099_fb.field_103039_E
		// @33: new game.C_100209_qb
		// @36: dup
		// @37: getstatic game.C_100029_gn game.C_100085_a.field_102576_K
		// @3A: getstatic game.C_100151_bc game.C_100099_fb.field_103039_E
		// @3D: invokespecial game.C_100209_qb.<init>(game.C_100029_gn, game.C_100336_im)void
		// @40: putstatic game.C_100209_qb game.C_100318_hj.field_107201_j
		// @43: getstatic game.C_100029_gn game.C_100085_a.field_102576_K
		// @46: getstatic game.C_100209_qb game.C_100318_hj.field_107201_j
		// @49: sipush 2839 (0x0B17)
		// @4C: invokevirtual game.C_100029_gn.func_103359_a(game.C_100336_im, int)void
		// @4F: goto @A2
		// @52: astore #4
		// @54: aload #4
		// @56: new java.lang.StringBuilder
		// @59: dup
		// @5A: invokespecial java.lang.StringBuilder.<init>()void
		// @5D: getstatic java.lang.String[] game.C_100091_m.field_104518_z
		// @60: bipush 12 (0x0C)
		// @62: aaload
		// @63: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @66: iload_0
		// @67: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6A: bipush 44 (0x2C)
		// @6C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6F: aload_1
		// @70: ifnull @7C
		// @73: getstatic java.lang.String[] game.C_100091_m.field_104518_z
		// @76: iconst_1
		// @77: aaload
		// @78: goto @81
		// @7B: athrow
		// @7C: getstatic java.lang.String[] game.C_100091_m.field_104518_z
		// @7F: iconst_0
		// @80: aaload
		// @81: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @84: bipush 44 (0x2C)
		// @86: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @89: iload_2
		// @8A: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @8D: bipush 44 (0x2C)
		// @8F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @92: iload_3
		// @93: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @96: bipush 41 (0x29)
		// @98: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @9E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @A1: athrow
		// @A2: return
	}
	
	static final void func_104509_a(int arg0, int arg1)
	{
		// @00: iload_1
		// @01: putstatic int game.C_100303_kk.field_104788_o
		// @04: getstatic int game.C_100038_wa.field_104077_j
		// @07: iconst_m1
		// @08: ixor
		// @09: getstatic int game.C_100239_oi.field_102312_P
		// @0C: iconst_m1
		// @0D: ixor
		// @0E: if_icmpne @15
		// @11: goto @34
		// @14: athrow
		// @15: getstatic int game.C_100239_oi.field_102312_P
		// @18: getstatic int game.C_100239_oi.field_102312_P
		// @1B: imul
		// @1C: istore_2
		// @1D: iload_2
		// @1E: getstatic int game.C_100038_wa.field_104077_j
		// @21: getstatic int game.C_100038_wa.field_104077_j
		// @24: imul
		// @25: isub
		// @26: istore_3
		// @27: iload_1
		// @28: iload_3
		// @29: iload_1
		// @2A: ineg
		// @2B: getstatic int game.C_100280_nf.field_101173_s
		// @2E: iadd
		// @2F: imul
		// @30: iload_2
		// @31: idiv
		// @32: iadd
		// @33: istore_1
		// @34: getstatic game.C_100302_ka game.C_100265_mh.field_106621_l
		// @37: getstatic int game.C_100268_mk.field_106671_a
		// @3A: bipush 120 (0x78)
		// @3C: iconst_m1
		// @3D: iload_1
		// @3E: sipush 640 (0x0280)
		// @41: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @44: sipush 640 (0x0280)
		// @47: iconst_5
		// @48: bipush -24 (0xE8)
		// @4A: getstatic int game.C_100280_nf.field_101173_s
		// @4D: iadd
		// @4E: getstatic int game.C_100284_nj.field_106771_c
		// @51: iconst_0
		// @52: getstatic int game.C_100244_pe.field_106375_d
		// @55: iconst_0
		// @56: invokestatic game.C_100034_gi.func_103994_a(int, int, int, int, int, int, int)void
		// @59: iload_0
		// @5A: bipush -62 (0xC2)
		// @5C: if_icmplt @6A
		// @5F: aconst_null
		// @60: checkcast java.lang.String
		// @63: putstatic java.lang.String game.C_100091_m.field_104519_h
		// @66: goto @6A
		// @69: athrow
		// @6A: goto @98
		// @6D: astore_2
		// @6E: aload_2
		// @6F: new java.lang.StringBuilder
		// @72: dup
		// @73: invokespecial java.lang.StringBuilder.<init>()void
		// @76: getstatic java.lang.String[] game.C_100091_m.field_104518_z
		// @79: bipush 6 (0x06)
		// @7B: aaload
		// @7C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @7F: iload_0
		// @80: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @83: bipush 44 (0x2C)
		// @85: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @88: iload_1
		// @89: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8C: bipush 41 (0x29)
		// @8E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @91: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @94: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @97: athrow
		// @98: return
	}
	
	final boolean func_104501_a(int arg0, byte[] arg1, int arg2, int arg3)
	{
		// @00: iload #4
		// @02: sipush -3598 (0xF1F2)
		// @05: if_icmpeq @11
		// @08: bipush 127 (0x7F)
		// @0A: putstatic int game.C_100091_m.field_104514_e
		// @0D: goto @11
		// @10: athrow
		// @11: aload_0
		// @12: getfield game.C_100301_kb game.C_100091_m.field_104515_b
		// @15: dup
		// @16: astore #5
		// @18: monitorenter
		// @19: iload_3
		// @1A: iconst_m1
		// @1B: ixor
		// @1C: iconst_m1
		// @1D: if_icmpgt @30
		// @20: aload_0
		// @21: getfield int game.C_100091_m.field_104512_g
		// @24: iconst_m1
		// @25: ixor
		// @26: iload_3
		// @27: iconst_m1
		// @28: ixor
		// @29: if_icmpgt @30
		// @2C: goto @38
		// @2F: athrow
		// @30: new java.lang.IllegalArgumentException
		// @33: dup
		// @34: invokespecial java.lang.IllegalArgumentException.<init>()void
		// @37: athrow
		// @38: aload_0
		// @39: bipush 72 (0x48)
		// @3B: aload_2
		// @3C: iload_3
		// @3D: iload_1
		// @3E: iconst_1
		// @3F: invokespecial game.C_100091_m.func_104502_a(byte, byte[], int, int, boolean)boolean
		// @42: istore #6
		// @44: iload #6
		// @46: ifeq @4D
		// @49: goto @59
		// @4C: athrow
		// @4D: aload_0
		// @4E: bipush 72 (0x48)
		// @50: aload_2
		// @51: iload_3
		// @52: iload_1
		// @53: iconst_0
		// @54: invokespecial game.C_100091_m.func_104502_a(byte, byte[], int, int, boolean)boolean
		// @57: istore #6
		// @59: iload #6
		// @5B: aload #5
		// @5D: monitorexit
		// @5E: ireturn
		// @5F: astore #7
		// @61: aload #5
		// @63: monitorexit
		// @64: aload #7
		// @66: athrow
		// @67: astore #5
		// @69: aload #5
		// @6B: new java.lang.StringBuilder
		// @6E: dup
		// @6F: invokespecial java.lang.StringBuilder.<init>()void
		// @72: getstatic java.lang.String[] game.C_100091_m.field_104518_z
		// @75: iconst_2
		// @76: aaload
		// @77: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @7A: iload_1
		// @7B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7E: bipush 44 (0x2C)
		// @80: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @83: aload_2
		// @84: ifnull @90
		// @87: getstatic java.lang.String[] game.C_100091_m.field_104518_z
		// @8A: iconst_1
		// @8B: aaload
		// @8C: goto @95
		// @8F: athrow
		// @90: getstatic java.lang.String[] game.C_100091_m.field_104518_z
		// @93: iconst_0
		// @94: aaload
		// @95: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @98: bipush 44 (0x2C)
		// @9A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9D: iload_3
		// @9E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A1: bipush 44 (0x2C)
		// @A3: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A6: iload #4
		// @A8: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @AB: bipush 41 (0x29)
		// @AD: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B0: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @B3: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @B6: athrow
	}
	
	public final String toString()
	{
		// @00: new java.lang.StringBuilder
		// @03: dup
		// @04: invokespecial java.lang.StringBuilder.<init>()void
		// @07: ldc ""
		// @09: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0C: aload_0
		// @0D: getfield int game.C_100091_m.field_104517_a
		// @10: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @13: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @16: areturn
		// @17: astore_1
		// @18: aload_1
		// @19: getstatic java.lang.String[] game.C_100091_m.field_104518_z
		// @1C: iconst_3
		// @1D: aaload
		// @1E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @21: athrow
	}
	
	public static void func_104507_a(byte arg0)
	{
		// @00: iload_0
		// @01: bipush -42 (0xD6)
		// @03: if_icmple @11
		// @06: aconst_null
		// @07: checkcast java.lang.String
		// @0A: putstatic java.lang.String game.C_100091_m.field_104519_h
		// @0D: goto @11
		// @10: athrow
		// @11: aconst_null
		// @12: putstatic java.lang.String game.C_100091_m.field_104519_h
		// @15: aconst_null
		// @16: putstatic game.C_100220_ac game.C_100091_m.field_104516_c
		// @19: aconst_null
		// @1A: putstatic java.lang.String game.C_100091_m.field_104511_f
		// @1D: goto @42
		// @20: astore_1
		// @21: aload_1
		// @22: new java.lang.StringBuilder
		// @25: dup
		// @26: invokespecial java.lang.StringBuilder.<init>()void
		// @29: getstatic java.lang.String[] game.C_100091_m.field_104518_z
		// @2C: bipush 9 (0x09)
		// @2E: aaload
		// @2F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @32: iload_0
		// @33: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @36: bipush 41 (0x29)
		// @38: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @41: athrow
		// @42: return
	}
	
	static final int func_104506_a(int arg0, CharSequence arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #5
		// @05: aload_1
		// @06: invokeinterface java.lang.CharSequence.length()int
		// @0B: istore_2
		// @0C: iconst_0
		// @0D: istore_3
		// @0E: iload_0
		// @0F: bipush -46 (0xD2)
		// @11: if_icmple @1F
		// @14: aconst_null
		// @15: checkcast game.C_100220_ac
		// @18: putstatic game.C_100220_ac game.C_100091_m.field_104516_c
		// @1B: goto @1F
		// @1E: athrow
		// @1F: iconst_0
		// @20: istore #4
		// @22: iload #4
		// @24: iconst_m1
		// @25: ixor
		// @26: iload_2
		// @27: iconst_m1
		// @28: ixor
		// @29: if_icmple @4E
		// @2C: iconst_0
		// @2D: aload_1
		// @2E: iload #4
		// @30: invokeinterface java.lang.CharSequence.charAt(int)char
		// @35: invokestatic game.C_100198_qn.func_105832_a(boolean, char)byte
		// @38: iload_3
		// @39: ineg
		// @3A: iadd
		// @3B: iload_3
		// @3C: ldc -1176328123 (0xb9e2a845)
		// @3E: ishl
		// @3F: iadd
		// @40: iload #5
		// @42: ifne @4F
		// @45: istore_3
		// @46: iinc #4 +1
		// @49: iload #5
		// @4B: ifeq @22
		// @4E: iload_3
		// @4F: ireturn
		// @50: astore_2
		// @51: aload_2
		// @52: new java.lang.StringBuilder
		// @55: dup
		// @56: invokespecial java.lang.StringBuilder.<init>()void
		// @59: getstatic java.lang.String[] game.C_100091_m.field_104518_z
		// @5C: bipush 11 (0x0B)
		// @5E: aaload
		// @5F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @62: iload_0
		// @63: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @66: bipush 44 (0x2C)
		// @68: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6B: aload_1
		// @6C: ifnull @78
		// @6F: getstatic java.lang.String[] game.C_100091_m.field_104518_z
		// @72: iconst_1
		// @73: aaload
		// @74: goto @7D
		// @77: athrow
		// @78: getstatic java.lang.String[] game.C_100091_m.field_104518_z
		// @7B: iconst_0
		// @7C: aaload
		// @7D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @80: bipush 41 (0x29)
		// @82: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @85: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @88: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @8B: athrow
	}
	
	static final void func_104503_a(int arg0)
	{
		// @00: iload_0
		// @01: sipush -18973 (0xB5E3)
		// @04: if_icmpeq @12
		// @07: aconst_null
		// @08: checkcast java.lang.String
		// @0B: putstatic java.lang.String game.C_100091_m.field_104511_f
		// @0E: goto @12
		// @11: athrow
		// @12: getstatic game.C_100029_gn game.C_100085_a.field_102576_K
		// @15: iload_0
		// @16: sipush -18970 (0xB5E6)
		// @19: ixor
		// @1A: invokevirtual game.C_100029_gn.func_103362_n(int)void
		// @1D: aconst_null
		// @1E: getstatic game.C_100129_tg game.C_100061_dh.field_101992_mc
		// @21: if_acmpne @38
		// @24: new game.C_100129_tg
		// @27: dup
		// @28: getstatic game.C_100029_gn game.C_100085_a.field_102576_K
		// @2B: getstatic java.lang.String game.C_100069_vb.field_104358_b
		// @2E: invokespecial game.C_100129_tg.<init>(game.C_100029_gn, java.lang.String)void
		// @31: putstatic game.C_100129_tg game.C_100061_dh.field_101992_mc
		// @34: goto @38
		// @37: athrow
		// @38: getstatic game.C_100029_gn game.C_100085_a.field_102576_K
		// @3B: getstatic game.C_100129_tg game.C_100061_dh.field_101992_mc
		// @3E: sipush 2839 (0x0B17)
		// @41: invokevirtual game.C_100029_gn.func_103359_a(game.C_100336_im, int)void
		// @44: goto @68
		// @47: astore_1
		// @48: aload_1
		// @49: new java.lang.StringBuilder
		// @4C: dup
		// @4D: invokespecial java.lang.StringBuilder.<init>()void
		// @50: getstatic java.lang.String[] game.C_100091_m.field_104518_z
		// @53: iconst_4
		// @54: aaload
		// @55: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @58: iload_0
		// @59: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5C: bipush 41 (0x29)
		// @5E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @61: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @64: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @67: athrow
		// @68: return
	}
	
	static final void func_104500_a(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #9
		// @005: iload_2
		// @006: iconst_m1
		// @007: ixor
		// @008: ifne @00F
		// @00B: goto @094
		// @00E: athrow
		// @00F: iconst_0
		// @010: istore #6
		// @012: iload #6
		// @014: iconst_m1
		// @015: ixor
		// @016: bipush -12 (0xF4)
		// @018: if_icmple @094
		// @01B: bipush 10 (0x0A)
		// @01D: istore #7
		// @01F: iconst_5
		// @020: iload #6
		// @022: iload #9
		// @024: ifne @096
		// @027: if_icmple @037
		// @02A: goto @02E
		// @02D: athrow
		// @02E: iconst_2
		// @02F: iconst_2
		// @030: iload #6
		// @032: imul
		// @033: ineg
		// @034: isub
		// @035: istore #7
		// @037: iload #6
		// @039: iconst_m1
		// @03A: ixor
		// @03B: bipush -6 (0xFA)
		// @03D: if_icmplt @044
		// @040: goto @051
		// @043: athrow
		// @044: iconst_2
		// @045: iconst_2
		// @046: bipush 10 (0x0A)
		// @048: iload #6
		// @04A: ineg
		// @04B: iadd
		// @04C: imul
		// @04D: ineg
		// @04E: isub
		// @04F: istore #7
		// @051: iload #5
		// @053: ifeq @075
		// @056: bipush 6 (0x06)
		// @058: iload #4
		// @05A: iload #7
		// @05C: ineg
		// @05D: iadd
		// @05E: iadd
		// @05F: iload #6
		// @061: bipush -5 (0xFB)
		// @063: iadd
		// @064: iload_1
		// @065: iadd
		// @066: iload #7
		// @068: iload_2
		// @069: invokestatic game.C_100196_rb.func_105807_g(int, int, int, int)void
		// @06C: iload #9
		// @06E: ifeq @08C
		// @071: goto @075
		// @074: athrow
		// @075: bipush -5 (0xFB)
		// @077: iload #4
		// @079: iadd
		// @07A: bipush -5 (0xFB)
		// @07C: iload_1
		// @07D: iadd
		// @07E: iload #6
		// @080: ineg
		// @081: isub
		// @082: iload #7
		// @084: iload_2
		// @085: invokestatic game.C_100196_rb.func_105807_g(int, int, int, int)void
		// @088: goto @08C
		// @08B: athrow
		// @08C: iinc #6 +1
		// @08F: iload #9
		// @091: ifeq @012
		// @094: iload_3
		// @095: iconst_m1
		// @096: if_icmpne @09C
		// @099: goto @112
		// @09C: iload #5
		// @09E: ifne @0DD
		// @0A1: iload #4
		// @0A3: bipush -5 (0xFB)
		// @0A5: iadd
		// @0A6: bipush -5 (0xFB)
		// @0A8: iload_1
		// @0A9: iadd
		// @0AA: bipush 11 (0x0B)
		// @0AC: iload_3
		// @0AD: invokestatic game.C_100196_rb.func_105778_a(int, int, int, int)void
		// @0B0: iload #4
		// @0B2: iconst_4
		// @0B3: isub
		// @0B4: bipush -5 (0xFB)
		// @0B6: iload_1
		// @0B7: iadd
		// @0B8: iload #4
		// @0BA: bipush -5 (0xFB)
		// @0BC: isub
		// @0BD: iload_1
		// @0BE: iload_3
		// @0BF: invokestatic game.C_100196_rb.func_105802_e(int, int, int, int, int)void
		// @0C2: bipush -4 (0xFC)
		// @0C4: iload #4
		// @0C6: iadd
		// @0C7: iload_1
		// @0C8: bipush -5 (0xFB)
		// @0CA: isub
		// @0CB: iconst_5
		// @0CC: iload #4
		// @0CE: iadd
		// @0CF: iload_1
		// @0D0: iload_3
		// @0D1: invokestatic game.C_100196_rb.func_105802_e(int, int, int, int, int)void
		// @0D4: iload #9
		// @0D6: ifeq @112
		// @0D9: goto @0DD
		// @0DC: athrow
		// @0DD: iconst_5
		// @0DE: iload #4
		// @0E0: iadd
		// @0E1: bipush -5 (0xFB)
		// @0E3: iload_1
		// @0E4: iadd
		// @0E5: bipush 11 (0x0B)
		// @0E7: iload_3
		// @0E8: invokestatic game.C_100196_rb.func_105778_a(int, int, int, int)void
		// @0EB: iconst_4
		// @0EC: iload #4
		// @0EE: iadd
		// @0EF: bipush -5 (0xFB)
		// @0F1: iload_1
		// @0F2: iadd
		// @0F3: bipush -5 (0xFB)
		// @0F5: iload #4
		// @0F7: iadd
		// @0F8: iload_1
		// @0F9: iload_3
		// @0FA: invokestatic game.C_100196_rb.func_105802_e(int, int, int, int, int)void
		// @0FD: iload #4
		// @0FF: bipush -4 (0xFC)
		// @101: isub
		// @102: iload_1
		// @103: iconst_5
		// @104: iadd
		// @105: iload #4
		// @107: iconst_5
		// @108: isub
		// @109: iload_1
		// @10A: iload_3
		// @10B: invokestatic game.C_100196_rb.func_105802_e(int, int, int, int, int)void
		// @10E: goto @112
		// @111: athrow
		// @112: iload #4
		// @114: iconst_m1
		// @115: if_icmpne @11C
		// @118: goto @11D
		// @11B: athrow
		// @11C: return
		// @11D: iload #4
		// @11F: bipush -10 (0xF6)
		// @121: iadd
		// @122: istore #6
		// @124: iload #4
		// @126: bipush -10 (0xF6)
		// @128: isub
		// @129: istore #7
		// @12B: iload_2
		// @12C: iconst_m1
		// @12D: if_icmpeq @1D7
		// @130: iload #6
		// @132: bipush -2 (0xFE)
		// @134: iload_1
		// @135: iadd
		// @136: bipush 20 (0x14)
		// @138: iconst_5
		// @139: iload_2
		// @13A: invokestatic game.C_100196_rb.func_105782_i(int, int, int, int, int)void
		// @13D: iconst_0
		// @13E: istore #8
		// @140: iload #8
		// @142: iconst_5
		// @143: if_icmpge @1D7
		// @146: iload #5
		// @148: iload #9
		// @14A: ifne @1D8
		// @14D: ifne @193
		// @150: goto @154
		// @153: athrow
		// @154: iload #7
		// @156: iconst_3
		// @157: iload #8
		// @159: isub
		// @15A: iadd
		// @15B: iload_1
		// @15C: bipush -7 (0xF9)
		// @15E: iload #8
		// @160: ineg
		// @161: iadd
		// @162: iconst_3
		// @163: iadd
		// @164: iload #7
		// @166: iadd
		// @167: bipush -7 (0xF9)
		// @169: iload_1
		// @16A: iadd
		// @16B: iload_2
		// @16C: invokestatic game.C_100196_rb.func_105802_e(int, int, int, int, int)void
		// @16F: iconst_3
		// @170: iload #7
		// @172: iload #8
		// @174: isub
		// @175: iadd
		// @176: iload_1
		// @177: bipush -7 (0xF9)
		// @179: iload #8
		// @17B: ineg
		// @17C: iadd
		// @17D: iconst_3
		// @17E: iadd
		// @17F: iload #7
		// @181: iadd
		// @182: iload_1
		// @183: bipush 7 (0x07)
		// @185: iadd
		// @186: iload_2
		// @187: invokestatic game.C_100196_rb.func_105802_e(int, int, int, int, int)void
		// @18A: iload #9
		// @18C: ifeq @1CF
		// @18F: goto @193
		// @192: athrow
		// @193: bipush -3 (0xFD)
		// @195: iload #6
		// @197: iload #8
		// @199: ineg
		// @19A: isub
		// @19B: iadd
		// @19C: iload_1
		// @19D: bipush 7 (0x07)
		// @19F: iload #8
		// @1A1: iadd
		// @1A2: iload #6
		// @1A4: bipush -3 (0xFD)
		// @1A6: iadd
		// @1A7: iadd
		// @1A8: iload_1
		// @1A9: bipush -7 (0xF9)
		// @1AB: iadd
		// @1AC: iload_2
		// @1AD: invokestatic game.C_100196_rb.func_105802_e(int, int, int, int, int)void
		// @1B0: bipush -3 (0xFD)
		// @1B2: iload #6
		// @1B4: iload #8
		// @1B6: iadd
		// @1B7: iadd
		// @1B8: iload_1
		// @1B9: bipush 7 (0x07)
		// @1BB: iload #6
		// @1BD: iadd
		// @1BE: iconst_3
		// @1BF: iload #8
		// @1C1: isub
		// @1C2: isub
		// @1C3: iload_1
		// @1C4: bipush 7 (0x07)
		// @1C6: iadd
		// @1C7: iload_2
		// @1C8: invokestatic game.C_100196_rb.func_105802_e(int, int, int, int, int)void
		// @1CB: goto @1CF
		// @1CE: athrow
		// @1CF: iinc #8 +1
		// @1D2: iload #9
		// @1D4: ifeq @140
		// @1D7: iconst_m1
		// @1D8: iload_3
		// @1D9: if_icmpeq @31E
		// @1DC: iload #5
		// @1DE: ifne @289
		// @1E1: goto @1E5
		// @1E4: athrow
		// @1E5: iconst_3
		// @1E6: iload #7
		// @1E8: iadd
		// @1E9: iload_1
		// @1EA: iload #7
		// @1EC: bipush -4 (0xFC)
		// @1EE: iadd
		// @1EF: bipush -7 (0xF9)
		// @1F1: iload_1
		// @1F2: iadd
		// @1F3: iload_3
		// @1F4: invokestatic game.C_100196_rb.func_105802_e(int, int, int, int, int)void
		// @1F7: iload #7
		// @1F9: iconst_4
		// @1FA: isub
		// @1FB: bipush -4 (0xFC)
		// @1FD: iadd
		// @1FE: bipush -7 (0xF9)
		// @200: iload_1
		// @201: iadd
		// @202: iconst_4
		// @203: iload_3
		// @204: invokestatic game.C_100196_rb.func_105807_g(int, int, int, int)void
		// @207: bipush -8 (0xF8)
		// @209: iload #7
		// @20B: iadd
		// @20C: bipush -7 (0xF9)
		// @20E: iload_1
		// @20F: iadd
		// @210: bipush -4 (0xFC)
		// @212: iload #7
		// @214: iadd
		// @215: bipush -3 (0xFD)
		// @217: iload_1
		// @218: iadd
		// @219: iload_3
		// @21A: invokestatic game.C_100196_rb.func_105802_e(int, int, int, int, int)void
		// @21D: bipush -16 (0xF0)
		// @21F: iload #7
		// @221: iadd
		// @222: bipush -4 (0xFC)
		// @224: iadd
		// @225: iload_1
		// @226: iconst_3
		// @227: isub
		// @228: bipush 16 (0x10)
		// @22A: iload_3
		// @22B: invokestatic game.C_100196_rb.func_105807_g(int, int, int, int)void
		// @22E: iconst_3
		// @22F: iload #7
		// @231: iadd
		// @232: iload_1
		// @233: iload #7
		// @235: iconst_4
		// @236: isub
		// @237: iload_1
		// @238: bipush -7 (0xF9)
		// @23A: isub
		// @23B: iload_3
		// @23C: invokestatic game.C_100196_rb.func_105802_e(int, int, int, int, int)void
		// @23F: bipush -4 (0xFC)
		// @241: bipush -4 (0xFC)
		// @243: iload #7
		// @245: iadd
		// @246: iadd
		// @247: bipush 7 (0x07)
		// @249: iload_1
		// @24A: iadd
		// @24B: iconst_4
		// @24C: iload_3
		// @24D: invokestatic game.C_100196_rb.func_105807_g(int, int, int, int)void
		// @250: iload #7
		// @252: bipush 8 (0x08)
		// @254: isub
		// @255: bipush 7 (0x07)
		// @257: iload_1
		// @258: iadd
		// @259: iload #7
		// @25B: iconst_4
		// @25C: isub
		// @25D: iconst_3
		// @25E: iload_1
		// @25F: iadd
		// @260: iload_3
		// @261: invokestatic game.C_100196_rb.func_105802_e(int, int, int, int, int)void
		// @264: iload #7
		// @266: iconst_4
		// @267: isub
		// @268: bipush -16 (0xF0)
		// @26A: iadd
		// @26B: iconst_3
		// @26C: iload_1
		// @26D: iadd
		// @26E: bipush 16 (0x10)
		// @270: iload_3
		// @271: invokestatic game.C_100196_rb.func_105807_g(int, int, int, int)void
		// @274: iload #6
		// @276: bipush -3 (0xFD)
		// @278: iload_1
		// @279: iadd
		// @27A: bipush 6 (0x06)
		// @27C: iload_3
		// @27D: invokestatic game.C_100196_rb.func_105778_a(int, int, int, int)void
		// @280: iload #9
		// @282: ifeq @31E
		// @285: goto @289
		// @288: athrow
		// @289: iload #6
		// @28B: bipush -3 (0xFD)
		// @28D: iadd
		// @28E: iload_1
		// @28F: iconst_4
		// @290: iload #6
		// @292: iadd
		// @293: iload_1
		// @294: bipush -7 (0xF9)
		// @296: iadd
		// @297: iload_3
		// @298: invokestatic game.C_100196_rb.func_105802_e(int, int, int, int, int)void
		// @29B: iconst_4
		// @29C: iload #6
		// @29E: iadd
		// @29F: bipush -7 (0xF9)
		// @2A1: iload_1
		// @2A2: iadd
		// @2A3: iconst_4
		// @2A4: iload_3
		// @2A5: invokestatic game.C_100196_rb.func_105807_g(int, int, int, int)void
		// @2A8: iload #6
		// @2AA: bipush 8 (0x08)
		// @2AC: iadd
		// @2AD: bipush -7 (0xF9)
		// @2AF: iload_1
		// @2B0: iadd
		// @2B1: iload #6
		// @2B3: bipush -4 (0xFC)
		// @2B5: isub
		// @2B6: bipush -3 (0xFD)
		// @2B8: iload_1
		// @2B9: iadd
		// @2BA: iload_3
		// @2BB: invokestatic game.C_100196_rb.func_105802_e(int, int, int, int, int)void
		// @2BE: iconst_4
		// @2BF: iload #6
		// @2C1: iadd
		// @2C2: iload_1
		// @2C3: iconst_3
		// @2C4: isub
		// @2C5: bipush 16 (0x10)
		// @2C7: iload_3
		// @2C8: invokestatic game.C_100196_rb.func_105807_g(int, int, int, int)void
		// @2CB: bipush -3 (0xFD)
		// @2CD: iload #6
		// @2CF: iadd
		// @2D0: iload_1
		// @2D1: iconst_4
		// @2D2: iload #6
		// @2D4: iadd
		// @2D5: bipush 7 (0x07)
		// @2D7: iload_1
		// @2D8: iadd
		// @2D9: iload_3
		// @2DA: invokestatic game.C_100196_rb.func_105802_e(int, int, int, int, int)void
		// @2DD: iconst_4
		// @2DE: iload #6
		// @2E0: iadd
		// @2E1: iload_1
		// @2E2: bipush -7 (0xF9)
		// @2E4: isub
		// @2E5: iconst_4
		// @2E6: iload_3
		// @2E7: invokestatic game.C_100196_rb.func_105807_g(int, int, int, int)void
		// @2EA: iload #6
		// @2EC: bipush -8 (0xF8)
		// @2EE: isub
		// @2EF: bipush 7 (0x07)
		// @2F1: iload_1
		// @2F2: iadd
		// @2F3: iconst_4
		// @2F4: iload #6
		// @2F6: iadd
		// @2F7: iload_1
		// @2F8: bipush -3 (0xFD)
		// @2FA: isub
		// @2FB: iload_3
		// @2FC: invokestatic game.C_100196_rb.func_105802_e(int, int, int, int, int)void
		// @2FF: iload #6
		// @301: iconst_4
		// @302: iadd
		// @303: iconst_3
		// @304: iload_1
		// @305: iadd
		// @306: bipush 16 (0x10)
		// @308: iload_3
		// @309: invokestatic game.C_100196_rb.func_105807_g(int, int, int, int)void
		// @30C: iconst_m1
		// @30D: iload #7
		// @30F: iadd
		// @310: iload_1
		// @311: bipush -3 (0xFD)
		// @313: iadd
		// @314: bipush 6 (0x06)
		// @316: iload_3
		// @317: invokestatic game.C_100196_rb.func_105778_a(int, int, int, int)void
		// @31A: goto @31E
		// @31D: athrow
		// @31E: iload_0
		// @31F: sipush -2902 (0xF4AA)
		// @322: if_icmpeq @32E
		// @325: bipush 107 (0x6B)
		// @327: invokestatic game.C_100091_m.func_104507_a(byte)void
		// @32A: goto @32E
		// @32D: athrow
		// @32E: goto @384
		// @331: astore #6
		// @333: aload #6
		// @335: new java.lang.StringBuilder
		// @338: dup
		// @339: invokespecial java.lang.StringBuilder.<init>()void
		// @33C: getstatic java.lang.String[] game.C_100091_m.field_104518_z
		// @33F: bipush 8 (0x08)
		// @341: aaload
		// @342: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @345: iload_0
		// @346: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @349: bipush 44 (0x2C)
		// @34B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @34E: iload_1
		// @34F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @352: bipush 44 (0x2C)
		// @354: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @357: iload_2
		// @358: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @35B: bipush 44 (0x2C)
		// @35D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @360: iload_3
		// @361: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @364: bipush 44 (0x2C)
		// @366: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @369: iload #4
		// @36B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @36E: bipush 44 (0x2C)
		// @370: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @373: iload #5
		// @375: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @378: bipush 41 (0x29)
		// @37A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @37D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @380: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @383: athrow
		// @384: return
	}
	
	C_100091_m(int arg0, C_100301_kb arg1, C_100301_kb arg2, int arg3)
	{
		// @00: aload_0
		// @01: invokespecial java.lang.Object.<init>()void
		// @04: aload_0
		// @05: aconst_null
		// @06: putfield game.C_100301_kb game.C_100091_m.field_104515_b
		// @09: aload_0
		// @0A: ldc 65000 (0xfde8)
		// @0C: putfield int game.C_100091_m.field_104512_g
		// @0F: aload_0
		// @10: aconst_null
		// @11: putfield game.C_100301_kb game.C_100091_m.field_104513_d
		// @14: aload_0
		// @15: iload_1
		// @16: putfield int game.C_100091_m.field_104517_a
		// @19: aload_0
		// @1A: aload_3
		// @1B: putfield game.C_100301_kb game.C_100091_m.field_104513_d
		// @1E: aload_0
		// @1F: iload #4
		// @21: putfield int game.C_100091_m.field_104512_g
		// @24: aload_0
		// @25: aload_2
		// @26: putfield game.C_100301_kb game.C_100091_m.field_104515_b
		// @29: goto @8E
		// @2C: astore #5
		// @2E: aload #5
		// @30: new java.lang.StringBuilder
		// @33: dup
		// @34: invokespecial java.lang.StringBuilder.<init>()void
		// @37: getstatic java.lang.String[] game.C_100091_m.field_104518_z
		// @3A: bipush 10 (0x0A)
		// @3C: aaload
		// @3D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @40: iload_1
		// @41: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @44: bipush 44 (0x2C)
		// @46: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @49: aload_2
		// @4A: ifnull @56
		// @4D: getstatic java.lang.String[] game.C_100091_m.field_104518_z
		// @50: iconst_1
		// @51: aaload
		// @52: goto @5B
		// @55: athrow
		// @56: getstatic java.lang.String[] game.C_100091_m.field_104518_z
		// @59: iconst_0
		// @5A: aaload
		// @5B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @5E: bipush 44 (0x2C)
		// @60: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @63: aload_3
		// @64: ifnull @70
		// @67: getstatic java.lang.String[] game.C_100091_m.field_104518_z
		// @6A: iconst_1
		// @6B: aaload
		// @6C: goto @75
		// @6F: athrow
		// @70: getstatic java.lang.String[] game.C_100091_m.field_104518_z
		// @73: iconst_0
		// @74: aaload
		// @75: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @78: bipush 44 (0x2C)
		// @7A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7D: iload #4
		// @7F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @82: bipush 41 (0x29)
		// @84: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @87: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @8A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @8D: athrow
		// @8E: return
	}
	
	final byte[] func_104505_a(byte arg0, int arg1)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #18
		// @005: iload_1
		// @006: bipush 40 (0x28)
		// @008: if_icmpeq @010
		// @00B: aconst_null
		// @00C: checkcast byte[]
		// @00F: areturn
		// @010: aload_0
		// @011: getfield game.C_100301_kb game.C_100091_m.field_104515_b
		// @014: dup
		// @015: astore_3
		// @016: monitorenter
		// @017: bipush 6 (0x06)
		// @019: iload_2
		// @01A: imul
		// @01B: bipush -6 (0xFA)
		// @01D: isub
		// @01E: i2l
		// @01F: aload_0
		// @020: getfield game.C_100301_kb game.C_100091_m.field_104513_d
		// @023: iconst_0
		// @024: invokevirtual game.C_100301_kb.func_107074_c(int)long
		// @027: lcmp
		// @028: ifgt @02E
		// @02B: goto @032
		// @02E: aconst_null
		// @02F: aload_3
		// @030: monitorexit
		// @031: areturn
		// @032: aload_0
		// @033: getfield game.C_100301_kb game.C_100091_m.field_104513_d
		// @036: iload_2
		// @037: bipush 6 (0x06)
		// @039: imul
		// @03A: i2l
		// @03B: bipush 57 (0x39)
		// @03D: invokevirtual game.C_100301_kb.func_107086_a(long, int)void
		// @040: aload_0
		// @041: getfield game.C_100301_kb game.C_100091_m.field_104513_d
		// @044: iconst_0
		// @045: bipush -96 (0xA0)
		// @047: bipush 6 (0x06)
		// @049: getstatic byte[] game.C_100197_ra.field_100864_u
		// @04C: invokevirtual game.C_100301_kb.func_107085_a(int, byte, int, byte[])void
		// @04F: getstatic byte[] game.C_100197_ra.field_100864_u
		// @052: iconst_1
		// @053: baload
		// @054: sipush 255 (0x00FF)
		// @057: iand
		// @058: ldc 972478696 (0x39f6d8e8)
		// @05A: ishl
		// @05B: sipush 255 (0x00FF)
		// @05E: getstatic byte[] game.C_100197_ra.field_100864_u
		// @061: iconst_0
		// @062: baload
		// @063: iand
		// @064: ldc -1569689712 (0xa2706f90)
		// @066: ishl
		// @067: sipush 255 (0x00FF)
		// @06A: getstatic byte[] game.C_100197_ra.field_100864_u
		// @06D: iconst_2
		// @06E: baload
		// @06F: iand
		// @070: ineg
		// @071: isub
		// @072: iadd
		// @073: istore #4
		// @075: sipush 255 (0x00FF)
		// @078: getstatic byte[] game.C_100197_ra.field_100864_u
		// @07B: iconst_4
		// @07C: baload
		// @07D: iand
		// @07E: ldc 390917928 (0x174cef28)
		// @080: ishl
		// @081: getstatic byte[] game.C_100197_ra.field_100864_u
		// @084: iconst_3
		// @085: baload
		// @086: ldc -880779632 (0xcb805e90)
		// @088: ishl
		// @089: ldc 16711680 (0xff0000)
		// @08B: iand
		// @08C: iadd
		// @08D: getstatic byte[] game.C_100197_ra.field_100864_u
		// @090: iconst_5
		// @091: baload
		// @092: sipush 255 (0x00FF)
		// @095: iand
		// @096: iadd
		// @097: istore #5
		// @099: iload #4
		// @09B: iconst_m1
		// @09C: ixor
		// @09D: iconst_m1
		// @09E: if_icmpgt @0B2
		// @0A1: aload_0
		// @0A2: getfield int game.C_100091_m.field_104512_g
		// @0A5: iload #4
		// @0A7: if_icmplt @0B2
		// @0AA: goto @0AE
		// @0AD: athrow
		// @0AE: goto @0B6
		// @0B1: athrow
		// @0B2: aconst_null
		// @0B3: aload_3
		// @0B4: monitorexit
		// @0B5: areturn
		// @0B6: iload #5
		// @0B8: iconst_m1
		// @0B9: ixor
		// @0BA: iconst_m1
		// @0BB: if_icmpge @0E1
		// @0BE: iload #5
		// @0C0: i2l
		// @0C1: ldc2_w -1
		// @0C4: lxor
		// @0C5: aload_0
		// @0C6: getfield game.C_100301_kb game.C_100091_m.field_104515_b
		// @0C9: iconst_0
		// @0CA: invokevirtual game.C_100301_kb.func_107074_c(int)long
		// @0CD: ldc2_w 520
		// @0D0: ldiv
		// @0D1: ldc2_w -1
		// @0D4: lxor
		// @0D5: lcmp
		// @0D6: iflt @0E1
		// @0D9: goto @0DD
		// @0DC: athrow
		// @0DD: goto @0E5
		// @0E0: athrow
		// @0E1: aconst_null
		// @0E2: aload_3
		// @0E3: monitorexit
		// @0E4: areturn
		// @0E5: iload #4
		// @0E7: newarray byte[]
		// @0E9: astore #6
		// @0EB: iconst_0
		// @0EC: istore #7
		// @0EE: iconst_0
		// @0EF: istore #8
		// @0F1: iload #4
		// @0F3: iconst_m1
		// @0F4: ixor
		// @0F5: iload #7
		// @0F7: iconst_m1
		// @0F8: ixor
		// @0F9: if_icmpge @2F0
		// @0FC: iconst_0
		// @0FD: iload #5
		// @0FF: if_icmpeq @106
		// @102: goto @10A
		// @105: athrow
		// @106: aconst_null
		// @107: aload_3
		// @108: monitorexit
		// @109: areturn
		// @10A: aload_0
		// @10B: getfield game.C_100301_kb game.C_100091_m.field_104515_b
		// @10E: sipush 520 (0x0208)
		// @111: iload #5
		// @113: imul
		// @114: i2l
		// @115: bipush -103 (0x99)
		// @117: invokevirtual game.C_100301_kb.func_107086_a(long, int)void
		// @11A: iload #4
		// @11C: iload #7
		// @11E: isub
		// @11F: istore #9
		// @121: iload_2
		// @122: ldc 65535 (0xffff)
		// @124: if_icmpgt @1B8
		// @127: sipush 512 (0x0200)
		// @12A: iload #9
		// @12C: if_icmplt @137
		// @12F: goto @133
		// @132: athrow
		// @133: goto @13C
		// @136: athrow
		// @137: sipush 512 (0x0200)
		// @13A: istore #9
		// @13C: bipush 8 (0x08)
		// @13E: istore #14
		// @140: aload_0
		// @141: getfield game.C_100301_kb game.C_100091_m.field_104515_b
		// @144: iconst_0
		// @145: bipush -98 (0x9E)
		// @147: iload #14
		// @149: iload #9
		// @14B: iadd
		// @14C: getstatic byte[] game.C_100197_ra.field_100864_u
		// @14F: invokevirtual game.C_100301_kb.func_107085_a(int, byte, int, byte[])void
		// @152: sipush 255 (0x00FF)
		// @155: getstatic byte[] game.C_100197_ra.field_100864_u
		// @158: bipush 6 (0x06)
		// @15A: baload
		// @15B: iand
		// @15C: getstatic byte[] game.C_100197_ra.field_100864_u
		// @15F: iconst_4
		// @160: baload
		// @161: ldc 413519760 (0x18a5cf90)
		// @163: ishl
		// @164: ldc 16711680 (0xff0000)
		// @166: iand
		// @167: getstatic byte[] game.C_100197_ra.field_100864_u
		// @16A: iconst_5
		// @16B: baload
		// @16C: sipush 255 (0x00FF)
		// @16F: iand
		// @170: ldc -877735512 (0xcbaed1a8)
		// @172: ishl
		// @173: ineg
		// @174: isub
		// @175: iadd
		// @176: istore #12
		// @178: getstatic byte[] game.C_100197_ra.field_100864_u
		// @17B: iconst_1
		// @17C: baload
		// @17D: sipush 255 (0x00FF)
		// @180: iand
		// @181: sipush 255 (0x00FF)
		// @184: getstatic byte[] game.C_100197_ra.field_100864_u
		// @187: iconst_0
		// @188: baload
		// @189: iand
		// @18A: ldc 1499739016 (0x59643388)
		// @18C: ishl
		// @18D: iadd
		// @18E: istore #10
		// @190: sipush 255 (0x00FF)
		// @193: getstatic byte[] game.C_100197_ra.field_100864_u
		// @196: iconst_3
		// @197: baload
		// @198: iand
		// @199: getstatic byte[] game.C_100197_ra.field_100864_u
		// @19C: iconst_2
		// @19D: baload
		// @19E: ldc -1326971448 (0xb0e805c8)
		// @1A0: ishl
		// @1A1: ldc 65280 (0xff00)
		// @1A3: iand
		// @1A4: iadd
		// @1A5: istore #11
		// @1A7: sipush 255 (0x00FF)
		// @1AA: getstatic byte[] game.C_100197_ra.field_100864_u
		// @1AD: bipush 7 (0x07)
		// @1AF: baload
		// @1B0: iand
		// @1B1: istore #13
		// @1B3: iload #18
		// @1B5: ifeq @25B
		// @1B8: bipush 10 (0x0A)
		// @1BA: istore #14
		// @1BC: sipush -511 (0xFE01)
		// @1BF: iload #9
		// @1C1: iconst_m1
		// @1C2: ixor
		// @1C3: if_icmple @1CB
		// @1C6: sipush 510 (0x01FE)
		// @1C9: istore #9
		// @1CB: aload_0
		// @1CC: getfield game.C_100301_kb game.C_100091_m.field_104515_b
		// @1CF: iconst_0
		// @1D0: bipush -113 (0x8F)
		// @1D2: iload #9
		// @1D4: iload #14
		// @1D6: iadd
		// @1D7: getstatic byte[] game.C_100197_ra.field_100864_u
		// @1DA: invokevirtual game.C_100301_kb.func_107085_a(int, byte, int, byte[])void
		// @1DD: sipush 255 (0x00FF)
		// @1E0: getstatic byte[] game.C_100197_ra.field_100864_u
		// @1E3: bipush 9 (0x09)
		// @1E5: baload
		// @1E6: iand
		// @1E7: istore #13
		// @1E9: sipush 255 (0x00FF)
		// @1EC: getstatic byte[] game.C_100197_ra.field_100864_u
		// @1EF: iconst_3
		// @1F0: baload
		// @1F1: iand
		// @1F2: ldc 65280 (0xff00)
		// @1F4: getstatic byte[] game.C_100197_ra.field_100864_u
		// @1F7: iconst_2
		// @1F8: baload
		// @1F9: ldc 1524648840 (0x5ae04b88)
		// @1FB: ishl
		// @1FC: iand
		// @1FD: sipush 255 (0x00FF)
		// @200: getstatic byte[] game.C_100197_ra.field_100864_u
		// @203: iconst_0
		// @204: baload
		// @205: iand
		// @206: ldc 1185818808 (0x46ae28b8)
		// @208: ishl
		// @209: iadd
		// @20A: getstatic byte[] game.C_100197_ra.field_100864_u
		// @20D: iconst_1
		// @20E: baload
		// @20F: sipush 255 (0x00FF)
		// @212: iand
		// @213: ldc 1800401296 (0x6b4ff190)
		// @215: ishl
		// @216: iadd
		// @217: iadd
		// @218: istore #10
		// @21A: getstatic byte[] game.C_100197_ra.field_100864_u
		// @21D: bipush 6 (0x06)
		// @21F: baload
		// @220: sipush 255 (0x00FF)
		// @223: iand
		// @224: ldc 641185712 (0x2637b7b0)
		// @226: ishl
		// @227: getstatic byte[] game.C_100197_ra.field_100864_u
		// @22A: bipush 7 (0x07)
		// @22C: baload
		// @22D: sipush 255 (0x00FF)
		// @230: iand
		// @231: ldc -1627212312 (0x9f02b5e8)
		// @233: ishl
		// @234: iadd
		// @235: getstatic byte[] game.C_100197_ra.field_100864_u
		// @238: bipush 8 (0x08)
		// @23A: baload
		// @23B: sipush 255 (0x00FF)
		// @23E: iand
		// @23F: ineg
		// @240: isub
		// @241: istore #12
		// @243: getstatic byte[] game.C_100197_ra.field_100864_u
		// @246: iconst_4
		// @247: baload
		// @248: ldc 1987359912 (0x7674b4a8)
		// @24A: ishl
		// @24B: ldc 65280 (0xff00)
		// @24D: iand
		// @24E: sipush 255 (0x00FF)
		// @251: getstatic byte[] game.C_100197_ra.field_100864_u
		// @254: iconst_5
		// @255: baload
		// @256: iand
		// @257: ineg
		// @258: isub
		// @259: istore #11
		// @25B: iload_2
		// @25C: iconst_m1
		// @25D: ixor
		// @25E: iload #10
		// @260: iconst_m1
		// @261: ixor
		// @262: if_icmpne @289
		// @265: iload #8
		// @267: iconst_m1
		// @268: ixor
		// @269: iload #11
		// @26B: iconst_m1
		// @26C: ixor
		// @26D: if_icmpne @289
		// @270: goto @274
		// @273: athrow
		// @274: aload_0
		// @275: getfield int game.C_100091_m.field_104517_a
		// @278: iconst_m1
		// @279: ixor
		// @27A: iload #13
		// @27C: iconst_m1
		// @27D: ixor
		// @27E: if_icmpne @289
		// @281: goto @285
		// @284: athrow
		// @285: goto @28D
		// @288: athrow
		// @289: aconst_null
		// @28A: aload_3
		// @28B: monitorexit
		// @28C: areturn
		// @28D: iload #12
		// @28F: iconst_m1
		// @290: ixor
		// @291: iconst_m1
		// @292: if_icmpgt @2AF
		// @295: aload_0
		// @296: getfield game.C_100301_kb game.C_100091_m.field_104515_b
		// @299: iload_1
		// @29A: bipush 40 (0x28)
		// @29C: ixor
		// @29D: invokevirtual game.C_100301_kb.func_107074_c(int)long
		// @2A0: ldc2_w 520
		// @2A3: ldiv
		// @2A4: iload #12
		// @2A6: i2l
		// @2A7: lcmp
		// @2A8: ifge @2B3
		// @2AB: goto @2AF
		// @2AE: athrow
		// @2AF: aconst_null
		// @2B0: aload_3
		// @2B1: monitorexit
		// @2B2: areturn
		// @2B3: iload #14
		// @2B5: iload #9
		// @2B7: iadd
		// @2B8: istore #15
		// @2BA: iload #14
		// @2BC: istore #16
		// @2BE: iload #15
		// @2C0: iload #16
		// @2C2: if_icmple @2E4
		// @2C5: aload #6
		// @2C7: iload #7
		// @2C9: iinc #7 +1
		// @2CC: getstatic byte[] game.C_100197_ra.field_100864_u
		// @2CF: iload #16
		// @2D1: baload
		// @2D2: bastore
		// @2D3: iinc #16 +1
		// @2D6: iload #18
		// @2D8: ifne @2EB
		// @2DB: iload #18
		// @2DD: ifeq @2BE
		// @2E0: goto @2E4
		// @2E3: athrow
		// @2E4: iinc #8 +1
		// @2E7: iload #12
		// @2E9: istore #5
		// @2EB: iload #18
		// @2ED: ifeq @0F1
		// @2F0: aload #6
		// @2F2: aload_3
		// @2F3: monitorexit
		// @2F4: areturn
		// @2F5: astore #4
		// @2F7: aconst_null
		// @2F8: aload_3
		// @2F9: monitorexit
		// @2FA: areturn
		// @2FB: astore #17
		// @2FD: aload_3
		// @2FE: monitorexit
		// @2FF: aload #17
		// @301: athrow
		// @302: astore_3
		// @303: aload_3
		// @304: new java.lang.StringBuilder
		// @307: dup
		// @308: invokespecial java.lang.StringBuilder.<init>()void
		// @30B: getstatic java.lang.String[] game.C_100091_m.field_104518_z
		// @30E: bipush 7 (0x07)
		// @310: aaload
		// @311: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @314: iload_1
		// @315: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @318: bipush 44 (0x2C)
		// @31A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @31D: iload_2
		// @31E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @321: bipush 41 (0x29)
		// @323: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @326: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @329: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @32C: athrow
	}
	
	static
	{
		// @00: bipush 13 (0x0D)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "@6e7"
		// @09: invokestatic game.C_100091_m.func_104508_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100091_m.func_104504_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "Um'ut"
		// @14: invokestatic game.C_100091_m.func_104508_z(java.lang.String)char[]
		// @17: invokestatic game.C_100091_m.func_104504_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "CmAs"
		// @1F: invokestatic game.C_100091_m.func_104508_z(java.lang.String)char[]
		// @22: invokestatic game.C_100091_m.func_104504_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "Cm}4ZZ1`5n\u0006j"
		// @2A: invokestatic game.C_100091_m.func_104508_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100091_m.func_104504_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "Cm@s"
		// @35: invokestatic game.C_100091_m.func_104508_z(java.lang.String)char[]
		// @38: invokestatic game.C_100091_m.func_104504_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "CmHs"
		// @40: invokestatic game.C_100091_m.func_104508_z(java.lang.String)char[]
		// @43: invokestatic game.C_100091_m.func_104504_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "CmMs"
		// @4C: invokestatic game.C_100091_m.func_104508_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100091_m.func_104504_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "CmLs"
		// @58: invokestatic game.C_100091_m.func_104508_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100091_m.func_104504_z(char[])java.lang.String
		// @5E: aastore
		// @5F: dup
		// @60: bipush 8 (0x08)
		// @62: ldc "CmKs"
		// @64: invokestatic game.C_100091_m.func_104508_z(java.lang.String)char[]
		// @67: invokestatic game.C_100091_m.func_104504_z(char[])java.lang.String
		// @6A: aastore
		// @6B: dup
		// @6C: bipush 9 (0x09)
		// @6E: ldc "CmJs"
		// @70: invokestatic game.C_100091_m.func_104508_z(java.lang.String)char[]
		// @73: invokestatic game.C_100091_m.func_104504_z(char[])java.lang.String
		// @76: aastore
		// @77: dup
		// @78: bipush 10 (0x0A)
		// @7A: ldc "Cm52gG77s"
		// @7C: invokestatic game.C_100091_m.func_104508_z(java.lang.String)char[]
		// @7F: invokestatic game.C_100091_m.func_104504_z(char[])java.lang.String
		// @82: aastore
		// @83: dup
		// @84: bipush 11 (0x0B)
		// @86: ldc "CmOs"
		// @88: invokestatic game.C_100091_m.func_104508_z(java.lang.String)char[]
		// @8B: invokestatic game.C_100091_m.func_104504_z(char[])java.lang.String
		// @8E: aastore
		// @8F: dup
		// @90: bipush 12 (0x0C)
		// @92: ldc "CmNs"
		// @94: invokestatic game.C_100091_m.func_104508_z(java.lang.String)char[]
		// @97: invokestatic game.C_100091_m.func_104504_z(char[])java.lang.String
		// @9A: aastore
		// @9B: putstatic java.lang.String[] game.C_100091_m.field_104518_z
		// @9E: ldc "f,g4|\\"
		// @A0: invokestatic game.C_100091_m.func_104508_z(java.lang.String)char[]
		// @A3: invokestatic game.C_100091_m.func_104504_z(char[])java.lang.String
		// @A6: putstatic java.lang.String game.C_100091_m.field_104511_f
		// @A9: ldc "b,n{`@c&{J\\&h/l\u000e\"j8f[-}"
		// @AB: invokestatic game.C_100091_m.func_104508_z(java.lang.String)char[]
		// @AE: invokestatic game.C_100091_m.func_104504_z(char[])java.lang.String
		// @B1: putstatic java.lang.String game.C_100091_m.field_104519_h
		// @B4: iconst_m1
		// @B5: putstatic int game.C_100091_m.field_104514_e
		// @B8: return
	}
	
	private static char[] func_104508_z(String arg0)
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
		// @0E: bipush 9 (0x09)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_104504_z(char[] arg0)
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
		// @30: bipush 46 (0x2E)
		// @32: goto @46
		// @35: bipush 67 (0x43)
		// @37: goto @46
		// @3A: bipush 9 (0x09)
		// @3C: goto @46
		// @3F: bipush 91 (0x5B)
		// @41: goto @46
		// @44: bipush 9 (0x09)
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
