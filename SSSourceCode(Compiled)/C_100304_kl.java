package game;

import java.security.SecureRandom;

final class C_100304_kl
{
	String field_107120_h;
	boolean field_107121_i;
	static long[][] field_107119_k;
	String field_107113_e;
	static long[] field_107114_b;
	static String field_107110_f;
	static String field_107115_c;
	static SecureRandom field_107117_j;
	static String field_107111_g;
	static int[] field_107112_d;
	static String field_107116_a;
	private static final String[] field_107118_z;
	
	static final int func_107105_a(int arg0, int arg1, boolean arg2)
	{
		// @00: iload_2
		// @01: iconst_1
		// @02: if_icmpeq @0E
		// @05: bipush -65 (0xBF)
		// @07: invokestatic game.C_100304_kl.func_107106_a(int)void
		// @0A: goto @0E
		// @0D: athrow
		// @0E: iload_0
		// @0F: ldc 16746756 (0xff8904)
		// @11: iload_1
		// @12: iand
		// @13: ldc -1413912880 (0xabb966d0)
		// @15: ishr
		// @16: invokestatic java.lang.Math.max(int, int)int
		// @19: istore_3
		// @1A: iload_0
		// @1B: ldc 65394 (0xff72)
		// @1D: iload_1
		// @1E: iand
		// @1F: ldc 765331208 (0x2d9e0708)
		// @21: ishr
		// @22: invokestatic java.lang.Math.max(int, int)int
		// @25: istore #4
		// @27: iload_0
		// @28: iload_1
		// @29: sipush 255 (0x00FF)
		// @2C: iand
		// @2D: invokestatic java.lang.Math.max(int, int)int
		// @30: istore #5
		// @32: iload #4
		// @34: ldc -2147211448 (0x80042748)
		// @36: ishl
		// @37: iload_3
		// @38: ldc 1742384688 (0x67daae30)
		// @3A: ishl
		// @3B: ldc -16777216 (0xff000000)
		// @3D: iload_1
		// @3E: iand
		// @3F: ior
		// @40: ior
		// @41: iload #5
		// @43: ior
		// @44: istore_1
		// @45: iload_1
		// @46: ireturn
		// @47: astore_3
		// @48: aload_3
		// @49: new java.lang.StringBuilder
		// @4C: dup
		// @4D: invokespecial java.lang.StringBuilder.<init>()void
		// @50: getstatic java.lang.String[] game.C_100304_kl.field_107118_z
		// @53: iconst_0
		// @54: aaload
		// @55: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @58: iload_0
		// @59: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5C: bipush 44 (0x2C)
		// @5E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @61: iload_1
		// @62: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @65: bipush 44 (0x2C)
		// @67: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6A: iload_2
		// @6B: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @6E: bipush 41 (0x29)
		// @70: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @73: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @76: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @79: athrow
	}
	
	static final void func_107109_a(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, boolean arg8)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #19
		// @005: iconst_m1
		// @006: iload_0
		// @007: iconst_m1
		// @008: ixor
		// @009: if_icmplt @014
		// @00C: iload #6
		// @00E: getstatic int game.C_100070_dn.field_104367_g
		// @011: if_icmplt @015
		// @014: return
		// @015: iconst_0
		// @016: iload #7
		// @018: if_icmple @035
		// @01B: iconst_m1
		// @01C: iload_1
		// @01D: iconst_m1
		// @01E: ixor
		// @01F: if_icmpge @035
		// @022: goto @026
		// @025: athrow
		// @026: iconst_0
		// @027: iload #5
		// @029: if_icmpgt @034
		// @02C: goto @030
		// @02F: athrow
		// @030: goto @035
		// @033: athrow
		// @034: return
		// @035: getstatic int game.C_100070_dn.field_104372_a
		// @038: iconst_m1
		// @039: ixor
		// @03A: iload #7
		// @03C: iconst_m1
		// @03D: ixor
		// @03E: if_icmplt @059
		// @041: getstatic int game.C_100070_dn.field_104372_a
		// @044: iload_1
		// @045: if_icmpgt @059
		// @048: goto @04C
		// @04B: athrow
		// @04C: iload #5
		// @04E: getstatic int game.C_100070_dn.field_104372_a
		// @051: if_icmplt @059
		// @054: goto @058
		// @057: athrow
		// @058: return
		// @059: iload_0
		// @05A: iload #6
		// @05C: ineg
		// @05D: iadd
		// @05E: istore #14
		// @060: iload #6
		// @062: iconst_m1
		// @063: ixor
		// @064: iload_2
		// @065: iconst_m1
		// @066: ixor
		// @067: if_icmpeq @24F
		// @06A: iload #7
		// @06C: ldc -1123462128 (0xbd095410)
		// @06E: ishl
		// @06F: dup
		// @070: istore #10
		// @072: istore #9
		// @074: iload_2
		// @075: iload #6
		// @077: isub
		// @078: istore #15
		// @07A: iload #7
		// @07C: ineg
		// @07D: iload #5
		// @07F: iadd
		// @080: ldc 1953899920 (0x74762590)
		// @082: ishl
		// @083: iload #14
		// @085: idiv
		// @086: istore #12
		// @088: iload #7
		// @08A: ineg
		// @08B: iload_1
		// @08C: iadd
		// @08D: ldc -1069331344 (0xc0434c70)
		// @08F: ishl
		// @090: iload #15
		// @092: idiv
		// @093: istore #11
		// @095: iload #12
		// @097: iconst_m1
		// @098: ixor
		// @099: iload #11
		// @09B: iconst_m1
		// @09C: ixor
		// @09D: if_icmpge @0A8
		// @0A0: iconst_0
		// @0A1: istore #13
		// @0A3: iload #19
		// @0A5: ifeq @0B7
		// @0A8: iload #11
		// @0AA: istore #16
		// @0AC: iload #12
		// @0AE: istore #11
		// @0B0: iload #16
		// @0B2: istore #12
		// @0B4: iconst_1
		// @0B5: istore #13
		// @0B7: iconst_0
		// @0B8: iload #6
		// @0BA: if_icmpgt @0C1
		// @0BD: goto @10B
		// @0C0: athrow
		// @0C1: iconst_m1
		// @0C2: iload_2
		// @0C3: iconst_m1
		// @0C4: ixor
		// @0C5: if_icmplt @0E9
		// @0C8: iload #6
		// @0CA: ineg
		// @0CB: istore #6
		// @0CD: iload #9
		// @0CF: iload #11
		// @0D1: iload #6
		// @0D3: imul
		// @0D4: iadd
		// @0D5: istore #9
		// @0D7: iload #10
		// @0D9: iload #12
		// @0DB: iload #6
		// @0DD: imul
		// @0DE: iadd
		// @0DF: istore #10
		// @0E1: iconst_0
		// @0E2: istore #6
		// @0E4: iload #19
		// @0E6: ifeq @10B
		// @0E9: iload_2
		// @0EA: iload #6
		// @0EC: isub
		// @0ED: istore #6
		// @0EF: iload #9
		// @0F1: iload #6
		// @0F3: iload #11
		// @0F5: imul
		// @0F6: iadd
		// @0F7: istore #9
		// @0F9: iload #10
		// @0FB: iload #12
		// @0FD: iload #6
		// @0FF: imul
		// @100: iadd
		// @101: istore #10
		// @103: iload_2
		// @104: istore #6
		// @106: iload #19
		// @108: ifeq @201
		// @10B: getstatic int[] game.C_100070_dn.field_104374_i
		// @10E: iload #6
		// @110: iaload
		// @111: istore #16
		// @113: iload #6
		// @115: iconst_m1
		// @116: ixor
		// @117: iload_2
		// @118: iconst_m1
		// @119: ixor
		// @11A: if_icmple @201
		// @11D: iload #9
		// @11F: ldc 1485100144 (0x5884d470)
		// @121: ishr
		// @122: istore #17
		// @124: getstatic int game.C_100070_dn.field_104372_a
		// @127: iconst_m1
		// @128: ixor
		// @129: iload #17
		// @12B: iconst_m1
		// @12C: ixor
		// @12D: iload #19
		// @12F: ifne @204
		// @132: if_icmplt @13C
		// @135: goto @139
		// @138: athrow
		// @139: goto @1DA
		// @13C: iload #9
		// @13E: ldc 1278159024 (0x4c2f28b0)
		// @140: ishr
		// @141: ineg
		// @142: iload #10
		// @144: ldc 1508340400 (0x59e772b0)
		// @146: ishr
		// @147: iadd
		// @148: istore #18
		// @14A: iload #18
		// @14C: iconst_m1
		// @14D: ixor
		// @14E: iconst_m1
		// @14F: if_icmpeq @1AD
		// @152: getstatic int game.C_100070_dn.field_104372_a
		// @155: iconst_m1
		// @156: ixor
		// @157: iload #18
		// @159: iload #17
		// @15B: iadd
		// @15C: iconst_m1
		// @15D: ixor
		// @15E: if_icmpge @169
		// @161: goto @165
		// @164: athrow
		// @165: goto @174
		// @168: athrow
		// @169: iconst_m1
		// @16A: iload #17
		// @16C: ineg
		// @16D: getstatic int game.C_100070_dn.field_104372_a
		// @170: iadd
		// @171: iadd
		// @172: istore #18
		// @174: iload #17
		// @176: iconst_m1
		// @177: ixor
		// @178: iconst_m1
		// @179: if_icmpgt @195
		// @17C: aload #4
		// @17E: bipush 126 (0x7E)
		// @180: iload #17
		// @182: iload #16
		// @184: ineg
		// @185: isub
		// @186: iload #18
		// @188: iload_3
		// @189: invokestatic game.C_100271_mj.func_103423_a(int[], byte, int, int, int)void
		// @18C: iload #19
		// @18E: ifeq @1DA
		// @191: goto @195
		// @194: athrow
		// @195: aload #4
		// @197: bipush 15 (0x0F)
		// @199: iload #16
		// @19B: iload #17
		// @19D: iload #18
		// @19F: iadd
		// @1A0: iload_3
		// @1A1: invokestatic game.C_100271_mj.func_103423_a(int[], byte, int, int, int)void
		// @1A4: iload #19
		// @1A6: ifeq @1DA
		// @1A9: goto @1AD
		// @1AC: athrow
		// @1AD: iload #17
		// @1AF: iflt @1DA
		// @1B2: goto @1B6
		// @1B5: athrow
		// @1B6: getstatic int game.C_100070_dn.field_104372_a
		// @1B9: iconst_m1
		// @1BA: ixor
		// @1BB: iload #17
		// @1BD: iconst_m1
		// @1BE: ixor
		// @1BF: if_icmplt @1CA
		// @1C2: goto @1C6
		// @1C5: athrow
		// @1C6: goto @1DA
		// @1C9: athrow
		// @1CA: aload #4
		// @1CC: bipush -119 (0x89)
		// @1CE: iload #17
		// @1D0: iload #16
		// @1D2: ineg
		// @1D3: isub
		// @1D4: iload #18
		// @1D6: iload_3
		// @1D7: invokestatic game.C_100271_mj.func_103423_a(int[], byte, int, int, int)void
		// @1DA: iinc #6 +1
		// @1DD: iload #6
		// @1DF: getstatic int game.C_100070_dn.field_104367_g
		// @1E2: if_icmplt @1E6
		// @1E5: return
		// @1E6: iload #10
		// @1E8: iload #12
		// @1EA: iadd
		// @1EB: istore #10
		// @1ED: iload #9
		// @1EF: iload #11
		// @1F1: iadd
		// @1F2: istore #9
		// @1F4: iload #16
		// @1F6: getstatic int game.C_100196_rb.field_105819_e
		// @1F9: iadd
		// @1FA: istore #16
		// @1FC: iload #19
		// @1FE: ifeq @113
		// @201: iload_2
		// @202: ineg
		// @203: iload_0
		// @204: iadd
		// @205: istore #16
		// @207: iload #16
		// @209: ifeq @244
		// @20C: iload #5
		// @20E: ldc -1104921392 (0xbe243cd0)
		// @210: ishl
		// @211: istore #17
		// @213: iload #13
		// @215: ifeq @223
		// @218: iload_1
		// @219: ldc 1581396016 (0x5e423030)
		// @21B: ishl
		// @21C: istore #10
		// @21E: iload #19
		// @220: ifeq @229
		// @223: iload_1
		// @224: ldc 1520705072 (0x5aa41e30)
		// @226: ishl
		// @227: istore #9
		// @229: iload #9
		// @22B: ineg
		// @22C: iload #17
		// @22E: iadd
		// @22F: iload #16
		// @231: idiv
		// @232: istore #11
		// @234: iload #17
		// @236: iload #10
		// @238: ineg
		// @239: iadd
		// @23A: iload #16
		// @23C: idiv
		// @23D: istore #12
		// @23F: iload #19
		// @241: ifeq @24A
		// @244: iconst_0
		// @245: istore #11
		// @247: iconst_0
		// @248: istore #12
		// @24A: iload #19
		// @24C: ifeq @2FF
		// @24F: iload_0
		// @250: iload #6
		// @252: if_icmpne @271
		// @255: goto @259
		// @258: athrow
		// @259: iload_1
		// @25A: ldc -2103759216 (0x829b2e90)
		// @25C: ishl
		// @25D: istore #10
		// @25F: iload #7
		// @261: ldc 1448179344 (0x56517690)
		// @263: ishl
		// @264: istore #9
		// @266: iconst_0
		// @267: istore #12
		// @269: iconst_0
		// @26A: istore #11
		// @26C: iload #19
		// @26E: ifeq @2D2
		// @271: iload_2
		// @272: ineg
		// @273: iload_0
		// @274: iadd
		// @275: istore #15
		// @277: iload_1
		// @278: iload #7
		// @27A: if_icmple @2AA
		// @27D: iload #5
		// @27F: iload #7
		// @281: ineg
		// @282: iadd
		// @283: ldc 613829200 (0x24964a50)
		// @285: ishl
		// @286: iload #14
		// @288: idiv
		// @289: istore #11
		// @28B: iload #7
		// @28D: ldc 1740323664 (0x67bb3b50)
		// @28F: ishl
		// @290: istore #9
		// @292: iload_1
		// @293: ldc 1264007216 (0x4b573830)
		// @295: ishl
		// @296: istore #10
		// @298: iload_1
		// @299: ineg
		// @29A: iload #5
		// @29C: iadd
		// @29D: ldc 1351215216 (0x5089e870)
		// @29F: ishl
		// @2A0: iload #15
		// @2A2: idiv
		// @2A3: istore #12
		// @2A5: iload #19
		// @2A7: ifeq @2D2
		// @2AA: iload #5
		// @2AC: iload_1
		// @2AD: ineg
		// @2AE: iadd
		// @2AF: ldc -1901048592 (0x8eb04cf0)
		// @2B1: ishl
		// @2B2: iload #15
		// @2B4: idiv
		// @2B5: istore #11
		// @2B7: iload #7
		// @2B9: ldc -1909755664 (0x8e2b70f0)
		// @2BB: ishl
		// @2BC: istore #10
		// @2BE: iload_1
		// @2BF: ldc 1243287440 (0x4a1b0f90)
		// @2C1: ishl
		// @2C2: istore #9
		// @2C4: iload #7
		// @2C6: ineg
		// @2C7: iload #5
		// @2C9: iadd
		// @2CA: ldc 1618408208 (0x6076f310)
		// @2CC: ishl
		// @2CD: iload #14
		// @2CF: idiv
		// @2D0: istore #12
		// @2D2: iconst_0
		// @2D3: iload #6
		// @2D5: if_icmple @2FC
		// @2D8: iload #6
		// @2DA: ineg
		// @2DB: iload #6
		// @2DD: ineg
		// @2DE: iload_2
		// @2DF: iadd
		// @2E0: invokestatic java.lang.Math.min(int, int)int
		// @2E3: istore #6
		// @2E5: iload #10
		// @2E7: iload #12
		// @2E9: iload #6
		// @2EB: imul
		// @2EC: iadd
		// @2ED: istore #10
		// @2EF: iload #9
		// @2F1: iload #11
		// @2F3: iload #6
		// @2F5: imul
		// @2F6: iadd
		// @2F7: istore #9
		// @2F9: iconst_0
		// @2FA: istore #6
		// @2FC: iconst_0
		// @2FD: istore #13
		// @2FF: iconst_m1
		// @300: iload #6
		// @302: iconst_m1
		// @303: ixor
		// @304: if_icmplt @30B
		// @307: goto @327
		// @30A: athrow
		// @30B: iload #6
		// @30D: ineg
		// @30E: istore #6
		// @310: iload #10
		// @312: iload #12
		// @314: iload #6
		// @316: imul
		// @317: iadd
		// @318: istore #10
		// @31A: iload #9
		// @31C: iload #11
		// @31E: iload #6
		// @320: imul
		// @321: iadd
		// @322: istore #9
		// @324: iconst_0
		// @325: istore #6
		// @327: getstatic int[] game.C_100070_dn.field_104374_i
		// @32A: iload #6
		// @32C: iaload
		// @32D: istore #15
		// @32F: iload #8
		// @331: iconst_1
		// @332: if_icmpeq @340
		// @335: aconst_null
		// @336: checkcast java.lang.String
		// @339: putstatic java.lang.String game.C_100304_kl.field_107111_g
		// @33C: goto @340
		// @33F: athrow
		// @340: iload #6
		// @342: iload_0
		// @343: if_icmpge @41F
		// @346: iload #9
		// @348: ldc -2052811408 (0x85a49570)
		// @34A: ishr
		// @34B: istore #16
		// @34D: iload #19
		// @34F: ifne @4A3
		// @352: getstatic int game.C_100070_dn.field_104372_a
		// @355: iload #16
		// @357: if_icmple @3F4
		// @35A: goto @35E
		// @35D: athrow
		// @35E: iload #9
		// @360: ldc 512182512 (0x1e8748f0)
		// @362: ishr
		// @363: ineg
		// @364: iload #10
		// @366: ldc -1090509488 (0xbf002550)
		// @368: ishr
		// @369: iadd
		// @36A: istore #17
		// @36C: iload #17
		// @36E: ifne @3A1
		// @371: iconst_m1
		// @372: iload #16
		// @374: iconst_m1
		// @375: ixor
		// @376: if_icmplt @3F4
		// @379: goto @37D
		// @37C: athrow
		// @37D: iload #16
		// @37F: getstatic int game.C_100070_dn.field_104372_a
		// @382: if_icmplt @38D
		// @385: goto @389
		// @388: athrow
		// @389: goto @3F4
		// @38C: athrow
		// @38D: aload #4
		// @38F: bipush -4 (0xFC)
		// @391: iload #15
		// @393: iload #16
		// @395: iadd
		// @396: iload #17
		// @398: iload_3
		// @399: invokestatic game.C_100271_mj.func_103423_a(int[], byte, int, int, int)void
		// @39C: iload #19
		// @39E: ifeq @3F4
		// @3A1: iload #16
		// @3A3: iload #17
		// @3A5: ineg
		// @3A6: isub
		// @3A7: iconst_m1
		// @3A8: ixor
		// @3A9: getstatic int game.C_100070_dn.field_104372_a
		// @3AC: iconst_m1
		// @3AD: ixor
		// @3AE: if_icmple @3B9
		// @3B1: goto @3B5
		// @3B4: athrow
		// @3B5: goto @3C4
		// @3B8: athrow
		// @3B9: iconst_m1
		// @3BA: iload #16
		// @3BC: ineg
		// @3BD: iadd
		// @3BE: getstatic int game.C_100070_dn.field_104372_a
		// @3C1: iadd
		// @3C2: istore #17
		// @3C4: iload #16
		// @3C6: ifge @3E1
		// @3C9: aload #4
		// @3CB: bipush 32 (0x20)
		// @3CD: iload #15
		// @3CF: iload #16
		// @3D1: iload #17
		// @3D3: iadd
		// @3D4: iload_3
		// @3D5: invokestatic game.C_100271_mj.func_103423_a(int[], byte, int, int, int)void
		// @3D8: iload #19
		// @3DA: ifeq @3F4
		// @3DD: goto @3E1
		// @3E0: athrow
		// @3E1: aload #4
		// @3E3: bipush 126 (0x7E)
		// @3E5: iload #15
		// @3E7: iload #16
		// @3E9: iadd
		// @3EA: iload #17
		// @3EC: iload_3
		// @3ED: invokestatic game.C_100271_mj.func_103423_a(int[], byte, int, int, int)void
		// @3F0: goto @3F4
		// @3F3: athrow
		// @3F4: getstatic int game.C_100070_dn.field_104367_g
		// @3F7: iinc #6 +1
		// @3FA: iload #6
		// @3FC: if_icmple @403
		// @3FF: goto @404
		// @402: athrow
		// @403: return
		// @404: iload #9
		// @406: iload #11
		// @408: iadd
		// @409: istore #9
		// @40B: iload #10
		// @40D: iload #12
		// @40F: iadd
		// @410: istore #10
		// @412: iload #15
		// @414: getstatic int game.C_100196_rb.field_105819_e
		// @417: iadd
		// @418: istore #15
		// @41A: iload #19
		// @41C: ifeq @340
		// @41F: goto @4A3
		// @422: astore #9
		// @424: aload #9
		// @426: new java.lang.StringBuilder
		// @429: dup
		// @42A: invokespecial java.lang.StringBuilder.<init>()void
		// @42D: getstatic java.lang.String[] game.C_100304_kl.field_107118_z
		// @430: iconst_2
		// @431: aaload
		// @432: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @435: iload_0
		// @436: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @439: bipush 44 (0x2C)
		// @43B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @43E: iload_1
		// @43F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @442: bipush 44 (0x2C)
		// @444: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @447: iload_2
		// @448: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @44B: bipush 44 (0x2C)
		// @44D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @450: iload_3
		// @451: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @454: bipush 44 (0x2C)
		// @456: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @459: aload #4
		// @45B: ifnull @467
		// @45E: getstatic java.lang.String[] game.C_100304_kl.field_107118_z
		// @461: iconst_4
		// @462: aaload
		// @463: goto @46C
		// @466: athrow
		// @467: getstatic java.lang.String[] game.C_100304_kl.field_107118_z
		// @46A: iconst_3
		// @46B: aaload
		// @46C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @46F: bipush 44 (0x2C)
		// @471: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @474: iload #5
		// @476: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @479: bipush 44 (0x2C)
		// @47B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @47E: iload #6
		// @480: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @483: bipush 44 (0x2C)
		// @485: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @488: iload #7
		// @48A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @48D: bipush 44 (0x2C)
		// @48F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @492: iload #8
		// @494: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @497: bipush 41 (0x29)
		// @499: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @49C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @49F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4A2: athrow
		// @4A3: return
	}
	
	public static void func_107106_a(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100304_kl.field_107115_c
		// @04: aconst_null
		// @05: putstatic java.lang.String game.C_100304_kl.field_107110_f
		// @08: iload_0
		// @09: bipush 21 (0x15)
		// @0B: if_icmpgt @19
		// @0E: aconst_null
		// @0F: checkcast long[]
		// @12: putstatic long[] game.C_100304_kl.field_107114_b
		// @15: goto @19
		// @18: athrow
		// @19: aconst_null
		// @1A: checkcast long[][]
		// @1D: putstatic long[][] game.C_100304_kl.field_107119_k
		// @20: aconst_null
		// @21: putstatic long[] game.C_100304_kl.field_107114_b
		// @24: aconst_null
		// @25: putstatic java.security.SecureRandom game.C_100304_kl.field_107117_j
		// @28: aconst_null
		// @29: putstatic java.lang.String game.C_100304_kl.field_107116_a
		// @2C: aconst_null
		// @2D: putstatic java.lang.String game.C_100304_kl.field_107111_g
		// @30: aconst_null
		// @31: putstatic int[] game.C_100304_kl.field_107112_d
		// @34: goto @58
		// @37: astore_1
		// @38: aload_1
		// @39: new java.lang.StringBuilder
		// @3C: dup
		// @3D: invokespecial java.lang.StringBuilder.<init>()void
		// @40: getstatic java.lang.String[] game.C_100304_kl.field_107118_z
		// @43: iconst_1
		// @44: aaload
		// @45: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @48: iload_0
		// @49: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4C: bipush 41 (0x29)
		// @4E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @51: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @54: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @57: athrow
		// @58: return
	}
	
	static
	{
		// @000: iconst_5
		// @001: anewarray java.lang.String
		// @004: dup
		// @005: iconst_0
		// @006: ldc ",ha(_"
		// @008: invokestatic game.C_100304_kl.func_107108_z(java.lang.String)char[]
		// @00B: invokestatic game.C_100304_kl.func_107107_z(char[])java.lang.String
		// @00E: aastore
		// @00F: dup
		// @010: iconst_1
		// @011: ldc ",ha*_"
		// @013: invokestatic game.C_100304_kl.func_107108_z(java.lang.String)char[]
		// @016: invokestatic game.C_100304_kl.func_107107_z(char[])java.lang.String
		// @019: aastore
		// @01A: dup
		// @01B: iconst_2
		// @01C: ldc ",ha)_"
		// @01E: invokestatic game.C_100304_kl.func_107108_z(java.lang.String)char[]
		// @021: invokestatic game.C_100304_kl.func_107107_z(char[])java.lang.String
		// @024: aastore
		// @025: dup
		// @026: iconst_3
		// @027: ldc ")q#\u0007"
		// @029: invokestatic game.C_100304_kl.func_107108_z(java.lang.String)char[]
		// @02C: invokestatic game.C_100304_kl.func_107107_z(char[])java.lang.String
		// @02F: aastore
		// @030: dup
		// @031: iconst_4
		// @032: ldc "<*aE\n"
		// @034: invokestatic game.C_100304_kl.func_107108_z(java.lang.String)char[]
		// @037: invokestatic game.C_100304_kl.func_107107_z(char[])java.lang.String
		// @03A: aastore
		// @03B: putstatic java.lang.String[] game.C_100304_kl.field_107118_z
		// @03E: bipush 11 (0x0B)
		// @040: newarray long[]
		// @042: putstatic long[] game.C_100304_kl.field_107114_b
		// @045: bipush 8 (0x08)
		// @047: sipush 256 (0x0100)
		// @04A: multianewarray long[][] (init: 2)
		// @04E: putstatic long[][] game.C_100304_kl.field_107119_k
		// @051: iconst_0
		// @052: istore_0
		// @053: sipush 256 (0x0100)
		// @056: iload_0
		// @057: if_icmple @159
		// @05A: ldc "\u1864\uc6ec\u87f7\u0124\u36d1\ud2b2\u796b\u911d\u60d7\u9bf9\ua34b\u7b31\u1daf\ud7a9\u2e3c\ufe10\u1573\u37aa\u9f9b\u4aad\u588e\u290e\ub1ef\u6bee\ubd2a\u10b3\ucb3a\u0528\ue44c\u41fc\ua73a\u95dc\ufba1\u7c0d\udd60\u47d9\uca29\ubf48\uad31\u8344\u6345\uaa75\uc856\u49b2\uf294\u5bcf\u9a22\u32ff\ue964\ud5f7\ube8a\u344c\uff35\u9034\u201f\u1ae9\ub450\u936d\u649a\u7365\u404f\uc3e8\udbee\u8d56\u9777\ucf6c\u7686\ud654\ub5c4\u6a27\u45b4\u30eb\u3f1a\ua281\u65cd\u2f87\ude18\ufd02\u921e\u06fd\ub2a1\u0e1b\u629b\ua8fd\uf9b2\u251e\u8476\u3903\u5e13\u38fb\ud1e2\ue265\ub36e\u9c75\u43b0\ufc43\u519d\u6d42\ufab4\u7e53\u3bec\uce15\u8f01\ub780\u3cf6\u94b0\ub917\u2c9c\ue705\uc474\u5603\u7fad\u2af4\uc138\udc7c\u9d2b\u3170\uf609\uace2\u1496\u167d\u690d\u70f9\ud086\ucc35\u98e3\u2858\uf8c9"
		// @05C: invokestatic game.C_100304_kl.func_107108_z(java.lang.String)char[]
		// @05F: invokestatic game.C_100304_kl.func_107107_z(char[])java.lang.String
		// @062: iload_0
		// @063: iconst_2
		// @064: idiv
		// @065: invokevirtual java.lang.String.charAt(int)char
		// @068: istore_1
		// @069: iconst_0
		// @06A: iconst_1
		// @06B: iload_0
		// @06C: iand
		// @06D: if_icmpeq @07A
		// @070: iload_1
		// @071: sipush 255 (0x00FF)
		// @074: iand
		// @075: i2l
		// @076: goto @07F
		// @079: athrow
		// @07A: iload_1
		// @07B: ldc -1006264216 (0xc405a068)
		// @07D: iushr
		// @07E: i2l
		// @07F: lstore_2
		// @080: lload_2
		// @081: ldc 517360641 (0x1ed64c01)
		// @083: lshl
		// @084: lstore #4
		// @086: ldc2_w -257
		// @089: lload #4
		// @08B: ldc2_w -1
		// @08E: lxor
		// @08F: lcmp
		// @090: iflt @09B
		// @093: lload #4
		// @095: ldc2_w 285
		// @098: lxor
		// @099: lstore #4
		// @09B: lload #4
		// @09D: ldc 1474613249 (0x57e4d001)
		// @09F: lshl
		// @0A0: lstore #6
		// @0A2: lload #6
		// @0A4: ldc2_w 256
		// @0A7: lcmp
		// @0A8: ifge @0AF
		// @0AB: goto @0B7
		// @0AE: athrow
		// @0AF: lload #6
		// @0B1: ldc2_w 285
		// @0B4: lxor
		// @0B5: lstore #6
		// @0B7: lload #6
		// @0B9: lload_2
		// @0BA: lxor
		// @0BB: lstore #8
		// @0BD: lload #6
		// @0BF: ldc -17051583 (0xfefbd041)
		// @0C1: lshl
		// @0C2: lstore #10
		// @0C4: ldc2_w 256
		// @0C7: lload #10
		// @0C9: lcmp
		// @0CA: ifle @0D1
		// @0CD: goto @0D9
		// @0D0: athrow
		// @0D1: lload #10
		// @0D3: ldc2_w 285
		// @0D6: lxor
		// @0D7: lstore #10
		// @0D9: lload_2
		// @0DA: lload #10
		// @0DC: lxor
		// @0DD: lstore #12
		// @0DF: getstatic long[][] game.C_100304_kl.field_107119_k
		// @0E2: iconst_0
		// @0E3: aaload
		// @0E4: iload_0
		// @0E5: lload #12
		// @0E7: lload #4
		// @0E9: ldc -1973901880 (0x8a58a5c8)
		// @0EB: lshl
		// @0EC: lload_2
		// @0ED: ldc -1368505568 (0xae6e4320)
		// @0EF: lshl
		// @0F0: lload_2
		// @0F1: ldc -795859464 (0xd09025f8)
		// @0F3: lshl
		// @0F4: lload_2
		// @0F5: ldc 1817270000 (0x6c5156f0)
		// @0F7: lshl
		// @0F8: invokestatic game.C_100009_fg.func_103650_a(long, long)long
		// @0FB: lload #6
		// @0FD: ldc 8722856 (0x8519a8)
		// @0FF: lshl
		// @100: invokestatic game.C_100009_fg.func_103650_a(long, long)long
		// @103: invokestatic game.C_100009_fg.func_103650_a(long, long)long
		// @106: lload #10
		// @108: ldc 223514904 (0xd529118)
		// @10A: lshl
		// @10B: invokestatic game.C_100009_fg.func_103650_a(long, long)long
		// @10E: lload #8
		// @110: ldc -214772144 (0xf332d650)
		// @112: lshl
		// @113: invokestatic game.C_100009_fg.func_103650_a(long, long)long
		// @116: invokestatic game.C_100009_fg.func_103650_a(long, long)long
		// @119: invokestatic game.C_100009_fg.func_103650_a(long, long)long
		// @11C: lastore
		// @11D: iconst_1
		// @11E: istore #14
		// @120: iload #14
		// @122: bipush 8 (0x08)
		// @124: if_icmpge @153
		// @127: getstatic long[][] game.C_100304_kl.field_107119_k
		// @12A: iload #14
		// @12C: aaload
		// @12D: iload_0
		// @12E: getstatic long[][] game.C_100304_kl.field_107119_k
		// @131: iload #14
		// @133: iconst_m1
		// @134: iadd
		// @135: aaload
		// @136: iload_0
		// @137: laload
		// @138: ldc 2067264376 (0x7b37f378)
		// @13A: lshl
		// @13B: getstatic long[][] game.C_100304_kl.field_107119_k
		// @13E: iconst_m1
		// @13F: iload #14
		// @141: iadd
		// @142: aaload
		// @143: iload_0
		// @144: laload
		// @145: ldc -22620792 (0xfea6d588)
		// @147: lushr
		// @148: invokestatic game.C_100009_fg.func_103650_a(long, long)long
		// @14B: lastore
		// @14C: iinc #14 +1
		// @14F: goto @120
		// @152: athrow
		// @153: iinc #0 +1
		// @156: goto @053
		// @159: getstatic long[] game.C_100304_kl.field_107114_b
		// @15C: iconst_0
		// @15D: lconst_0
		// @15E: lastore
		// @15F: iconst_1
		// @160: istore_0
		// @161: bipush 10 (0x0A)
		// @163: iload_0
		// @164: if_icmplt @208
		// @167: bipush 8 (0x08)
		// @169: iload_0
		// @16A: iconst_1
		// @16B: isub
		// @16C: imul
		// @16D: istore_1
		// @16E: getstatic long[] game.C_100304_kl.field_107114_b
		// @171: iload_0
		// @172: ldc2_w 255
		// @175: getstatic long[][] game.C_100304_kl.field_107119_k
		// @178: bipush 7 (0x07)
		// @17A: aaload
		// @17B: iload_1
		// @17C: bipush 7 (0x07)
		// @17E: iadd
		// @17F: laload
		// @180: invokestatic game.C_100336_im.func_102514_a(long, long)long
		// @183: ldc2_w 16711680
		// @186: getstatic long[][] game.C_100304_kl.field_107119_k
		// @189: iconst_5
		// @18A: aaload
		// @18B: iload_1
		// @18C: iconst_5
		// @18D: iadd
		// @18E: laload
		// @18F: invokestatic game.C_100336_im.func_102514_a(long, long)long
		// @192: ldc2_w 4278190080
		// @195: getstatic long[][] game.C_100304_kl.field_107119_k
		// @198: iconst_4
		// @199: aaload
		// @19A: iload_1
		// @19B: iconst_4
		// @19C: iadd
		// @19D: laload
		// @19E: invokestatic game.C_100336_im.func_102514_a(long, long)long
		// @1A1: ldc2_w 1095216660480
		// @1A4: getstatic long[][] game.C_100304_kl.field_107119_k
		// @1A7: iconst_3
		// @1A8: aaload
		// @1A9: iconst_3
		// @1AA: iload_1
		// @1AB: iadd
		// @1AC: laload
		// @1AD: invokestatic game.C_100336_im.func_102514_a(long, long)long
		// @1B0: ldc2_w -72057594037927936
		// @1B3: getstatic long[][] game.C_100304_kl.field_107119_k
		// @1B6: iconst_0
		// @1B7: aaload
		// @1B8: iload_1
		// @1B9: laload
		// @1BA: invokestatic game.C_100336_im.func_102514_a(long, long)long
		// @1BD: getstatic long[][] game.C_100304_kl.field_107119_k
		// @1C0: iconst_1
		// @1C1: aaload
		// @1C2: iload_1
		// @1C3: iconst_1
		// @1C4: iadd
		// @1C5: laload
		// @1C6: ldc2_w 71776119061217280
		// @1C9: invokestatic game.C_100336_im.func_102514_a(long, long)long
		// @1CC: invokestatic game.C_100312_ld.func_107144_a(long, long)long
		// @1CF: ldc2_w 280375465082880
		// @1D2: getstatic long[][] game.C_100304_kl.field_107119_k
		// @1D5: iconst_2
		// @1D6: aaload
		// @1D7: iconst_2
		// @1D8: iload_1
		// @1D9: iadd
		// @1DA: laload
		// @1DB: invokestatic game.C_100336_im.func_102514_a(long, long)long
		// @1DE: invokestatic game.C_100312_ld.func_107144_a(long, long)long
		// @1E1: invokestatic game.C_100312_ld.func_107144_a(long, long)long
		// @1E4: invokestatic game.C_100312_ld.func_107144_a(long, long)long
		// @1E7: invokestatic game.C_100312_ld.func_107144_a(long, long)long
		// @1EA: getstatic long[][] game.C_100304_kl.field_107119_k
		// @1ED: bipush 6 (0x06)
		// @1EF: aaload
		// @1F0: iload_1
		// @1F1: bipush -6 (0xFA)
		// @1F3: isub
		// @1F4: laload
		// @1F5: ldc2_w 65280
		// @1F8: invokestatic game.C_100336_im.func_102514_a(long, long)long
		// @1FB: invokestatic game.C_100312_ld.func_107144_a(long, long)long
		// @1FE: invokestatic game.C_100312_ld.func_107144_a(long, long)long
		// @201: lastore
		// @202: iinc #0 +1
		// @205: goto @161
		// @208: ldc "\u0002J\u0008\"9\u0002A\u001d.3"
		// @20A: invokestatic game.C_100304_kl.func_107108_z(java.lang.String)char[]
		// @20D: invokestatic game.C_100304_kl.func_107107_z(char[])java.lang.String
		// @210: putstatic java.lang.String game.C_100304_kl.field_107115_c
		// @213: ldc "\u0014a.\u0019\u0014/m!\u000cW!k=K\u0016)$ \u001b\u0007(j*\u0005\u0003"
		// @215: invokestatic game.C_100304_kl.func_107108_z(java.lang.String)char[]
		// @218: invokestatic game.C_100304_kl.func_107107_z(char[])java.lang.String
		// @21B: putstatic java.lang.String game.C_100304_kl.field_107110_f
		// @21E: ldc "\u0002j*\u0006\u000egs.\u001d\u0012g)o"
		// @220: invokestatic game.C_100304_kl.func_107108_z(java.lang.String)char[]
		// @223: invokestatic game.C_100304_kl.func_107107_z(char[])java.lang.String
		// @226: putstatic java.lang.String game.C_100304_kl.field_107111_g
		// @229: ldc "\u0002I\u001f"
		// @22B: invokestatic game.C_100304_kl.func_107108_z(java.lang.String)char[]
		// @22E: invokestatic game.C_100304_kl.func_107107_z(char[])java.lang.String
		// @231: putstatic java.lang.String game.C_100304_kl.field_107116_a
		// @234: return
	}
	
	private static char[] func_107108_z(String arg0)
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
		// @0E: bipush 119 (0x77)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_107107_z(char[] arg0)
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
		// @30: bipush 71 (0x47)
		// @32: goto @45
		// @35: iconst_4
		// @36: goto @45
		// @39: bipush 79 (0x4F)
		// @3B: goto @45
		// @3E: bipush 107 (0x6B)
		// @40: goto @45
		// @43: bipush 119 (0x77)
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
