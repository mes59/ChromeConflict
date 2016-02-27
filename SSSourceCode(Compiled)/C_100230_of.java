package game;

import java.util.zip.CRC32;
import java.net.URL;
import java.io.DataInputStream;

final class C_100230_of implements Runnable
{
	private URL field_106209_c;
	private int field_106219_p;
	private C_100331_ie field_106211_n;
	private C_100331_ie field_106206_d;
	private C_100331_ie field_106208_b;
	static CRC32 field_106213_l;
	private DataInputStream field_106204_f;
	private C_100201_qj field_106214_m;
	private C_100280_nf field_106210_a;
	static int field_106215_j;
	static int field_106207_e;
	static C_100112_r field_106205_g;
	static C_100234_ob field_106217_h;
	static String[] field_106218_i;
	static boolean field_106216_k;
	static C_100098_h field_106212_o;
	private static final String[] field_106220_z;
	
	final C_100280_nf func_106203_b(byte arg0)
	{
		// @00: aload_0
		// @01: getfield int game.C_100230_of.field_106219_p
		// @04: iconst_3
		// @05: if_icmpne @0D
		// @08: aload_0
		// @09: getfield game.C_100280_nf game.C_100230_of.field_106210_a
		// @0C: areturn
		// @0D: iload_1
		// @0E: bipush 37 (0x25)
		// @10: if_icmpgt @1F
		// @13: aload_0
		// @14: aconst_null
		// @15: checkcast game.C_100280_nf
		// @18: putfield game.C_100280_nf game.C_100230_of.field_106210_a
		// @1B: goto @1F
		// @1E: athrow
		// @1F: aconst_null
		// @20: areturn
		// @21: astore_2
		// @22: aload_2
		// @23: new java.lang.StringBuilder
		// @26: dup
		// @27: invokespecial java.lang.StringBuilder.<init>()void
		// @2A: getstatic java.lang.String[] game.C_100230_of.field_106220_z
		// @2D: iconst_1
		// @2E: aaload
		// @2F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @32: iload_1
		// @33: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @36: bipush 41 (0x29)
		// @38: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @41: athrow
	}
	
	static final boolean func_106202_b(int arg0)
	{
		// @00: iload_0
		// @01: iconst_m1
		// @02: if_icmpeq @0D
		// @05: iconst_0
		// @06: putstatic boolean game.C_100230_of.field_106216_k
		// @09: goto @0D
		// @0C: athrow
		// @0D: iconst_1
		// @0E: invokestatic game.C_100103_eh.func_104657_c(int)boolean
		// @11: ireturn
		// @12: astore_1
		// @13: aload_1
		// @14: new java.lang.StringBuilder
		// @17: dup
		// @18: invokespecial java.lang.StringBuilder.<init>()void
		// @1B: getstatic java.lang.String[] game.C_100230_of.field_106220_z
		// @1E: iconst_0
		// @1F: aaload
		// @20: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @23: iload_0
		// @24: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @27: bipush 41 (0x29)
		// @29: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @2F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @32: athrow
	}
	
	static final C_100037_wb[] func_106201_a(boolean arg0)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #7
		// @05: getstatic int game.C_100277_nc.field_106744_y
		// @08: anewarray game.C_100037_wb
		// @0B: astore_1
		// @0C: iconst_0
		// @0D: istore_2
		// @0E: iload_0
		// @0F: iconst_1
		// @10: if_icmpeq @18
		// @13: aconst_null
		// @14: checkcast game.C_100037_wb[]
		// @17: areturn
		// @18: iload_2
		// @19: iconst_m1
		// @1A: ixor
		// @1B: getstatic int game.C_100277_nc.field_106744_y
		// @1E: iconst_m1
		// @1F: ixor
		// @20: if_icmple @A0
		// @23: getstatic int[] game.C_100213_ak.field_105994_d
		// @26: iload_2
		// @27: iaload
		// @28: getstatic int[] game.C_100312_ld.field_107156_c
		// @2B: iload_2
		// @2C: iaload
		// @2D: imul
		// @2E: istore_3
		// @2F: getstatic byte[][] game.C_100107_u.field_104774_c
		// @32: iload_2
		// @33: aaload
		// @34: astore #4
		// @36: iload_3
		// @37: newarray int[]
		// @39: astore #5
		// @3B: iconst_0
		// @3C: iload #7
		// @3E: ifne @A2
		// @41: istore #6
		// @43: iload #6
		// @45: iconst_m1
		// @46: ixor
		// @47: iload_3
		// @48: iconst_m1
		// @49: ixor
		// @4A: if_icmple @72
		// @4D: aload #5
		// @4F: iload #6
		// @51: getstatic int[] game.C_100085_a.field_102573_H
		// @54: sipush 255 (0x00FF)
		// @57: aload #4
		// @59: iload #6
		// @5B: baload
		// @5C: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @5F: iaload
		// @60: iastore
		// @61: iinc #6 +1
		// @64: iload #7
		// @66: ifne @9B
		// @69: iload #7
		// @6B: ifeq @43
		// @6E: goto @72
		// @71: athrow
		// @72: aload_1
		// @73: iload_2
		// @74: new game.C_100037_wb
		// @77: dup
		// @78: getstatic int game.C_100338_jc.field_105371_m
		// @7B: getstatic int game.C_100277_nc.field_106702_C
		// @7E: getstatic int[] game.C_100068_vc.field_104340_f
		// @81: iload_2
		// @82: iaload
		// @83: getstatic int[] game.C_100012_fh.field_100509_M
		// @86: iload_2
		// @87: iaload
		// @88: getstatic int[] game.C_100213_ak.field_105994_d
		// @8B: iload_2
		// @8C: iaload
		// @8D: getstatic int[] game.C_100312_ld.field_107156_c
		// @90: iload_2
		// @91: iaload
		// @92: aload #5
		// @94: invokespecial game.C_100037_wb.<init>(int, int, int, int, int, int, int[])void
		// @97: aastore
		// @98: iinc #2 +1
		// @9B: iload #7
		// @9D: ifeq @18
		// @A0: bipush -76 (0xB4)
		// @A2: invokestatic game.C_100030_gm.func_103336_a(byte)void
		// @A5: aload_1
		// @A6: areturn
		// @A7: astore_1
		// @A8: aload_1
		// @A9: new java.lang.StringBuilder
		// @AC: dup
		// @AD: invokespecial java.lang.StringBuilder.<init>()void
		// @B0: getstatic java.lang.String[] game.C_100230_of.field_106220_z
		// @B3: bipush 9 (0x09)
		// @B5: aaload
		// @B6: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @B9: iload_0
		// @BA: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @BD: bipush 41 (0x29)
		// @BF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C2: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @C5: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @C8: athrow
	}
	
	final synchronized boolean func_106197_a(byte arg0)
	{
		// @000: bipush -3 (0xFD)
		// @002: aload_0
		// @003: getfield int game.C_100230_of.field_106219_p
		// @006: iconst_m1
		// @007: ixor
		// @008: if_icmpge @00F
		// @00B: goto @011
		// @00E: athrow
		// @00F: iconst_1
		// @010: ireturn
		// @011: iload_1
		// @012: bipush 13 (0x0D)
		// @014: if_icmpge @01F
		// @017: aload_0
		// @018: invokevirtual game.C_100230_of.finalize()void
		// @01B: goto @01F
		// @01E: athrow
		// @01F: iconst_0
		// @020: aload_0
		// @021: getfield int game.C_100230_of.field_106219_p
		// @024: if_icmpne @077
		// @027: aload_0
		// @028: getfield game.C_100331_ie game.C_100230_of.field_106208_b
		// @02B: ifnonnull @048
		// @02E: goto @032
		// @031: athrow
		// @032: aload_0
		// @033: aload_0
		// @034: getfield game.C_100201_qj game.C_100230_of.field_106214_m
		// @037: aload_0
		// @038: getfield java.net.URL game.C_100230_of.field_106209_c
		// @03B: sipush 2159 (0x086F)
		// @03E: invokevirtual game.C_100201_qj.func_105863_a(java.net.URL, int)game.C_100331_ie
		// @041: putfield game.C_100331_ie game.C_100230_of.field_106208_b
		// @044: goto @048
		// @047: athrow
		// @048: aload_0
		// @049: getfield game.C_100331_ie game.C_100230_of.field_106208_b
		// @04C: getfield int game.C_100331_ie.field_107293_f
		// @04F: iconst_m1
		// @050: ixor
		// @051: iconst_m1
		// @052: if_icmpeq @059
		// @055: goto @05B
		// @058: athrow
		// @059: iconst_0
		// @05A: ireturn
		// @05B: aload_0
		// @05C: getfield game.C_100331_ie game.C_100230_of.field_106208_b
		// @05F: getfield int game.C_100331_ie.field_107293_f
		// @062: iconst_1
		// @063: if_icmpeq @077
		// @066: aload_0
		// @067: dup
		// @068: getfield int game.C_100230_of.field_106219_p
		// @06B: iconst_1
		// @06C: iadd
		// @06D: putfield int game.C_100230_of.field_106219_p
		// @070: aload_0
		// @071: aconst_null
		// @072: putfield game.C_100331_ie game.C_100230_of.field_106208_b
		// @075: iconst_0
		// @076: ireturn
		// @077: aload_0
		// @078: getfield int game.C_100230_of.field_106219_p
		// @07B: iconst_1
		// @07C: if_icmpeq @083
		// @07F: goto @0D6
		// @082: athrow
		// @083: aconst_null
		// @084: aload_0
		// @085: getfield game.C_100331_ie game.C_100230_of.field_106206_d
		// @088: if_acmpne @0A6
		// @08B: aload_0
		// @08C: aload_0
		// @08D: getfield game.C_100201_qj game.C_100230_of.field_106214_m
		// @090: bipush 104 (0x68)
		// @092: sipush 443 (0x01BB)
		// @095: aload_0
		// @096: getfield java.net.URL game.C_100230_of.field_106209_c
		// @099: invokevirtual java.net.URL.getHost()java.lang.String
		// @09C: invokevirtual game.C_100201_qj.func_105857_a(byte, int, java.lang.String)game.C_100331_ie
		// @09F: putfield game.C_100331_ie game.C_100230_of.field_106206_d
		// @0A2: goto @0A6
		// @0A5: athrow
		// @0A6: iconst_0
		// @0A7: aload_0
		// @0A8: getfield game.C_100331_ie game.C_100230_of.field_106206_d
		// @0AB: getfield int game.C_100331_ie.field_107293_f
		// @0AE: if_icmpeq @0B5
		// @0B1: goto @0B7
		// @0B4: athrow
		// @0B5: iconst_0
		// @0B6: ireturn
		// @0B7: aload_0
		// @0B8: getfield game.C_100331_ie game.C_100230_of.field_106206_d
		// @0BB: getfield int game.C_100331_ie.field_107293_f
		// @0BE: iconst_m1
		// @0BF: ixor
		// @0C0: bipush -2 (0xFE)
		// @0C2: if_icmpeq @0D6
		// @0C5: aload_0
		// @0C6: aconst_null
		// @0C7: putfield game.C_100331_ie game.C_100230_of.field_106206_d
		// @0CA: aload_0
		// @0CB: dup
		// @0CC: getfield int game.C_100230_of.field_106219_p
		// @0CF: iconst_1
		// @0D0: iadd
		// @0D1: putfield int game.C_100230_of.field_106219_p
		// @0D4: iconst_0
		// @0D5: ireturn
		// @0D6: aload_0
		// @0D7: getfield java.io.DataInputStream game.C_100230_of.field_106204_f
		// @0DA: ifnonnull @17C
		// @0DD: iconst_m1
		// @0DE: aload_0
		// @0DF: getfield int game.C_100230_of.field_106219_p
		// @0E2: iconst_m1
		// @0E3: ixor
		// @0E4: if_icmpeq @0EB
		// @0E7: goto @0F9
		// @0EA: athrow
		// @0EB: aload_0
		// @0EC: aload_0
		// @0ED: getfield game.C_100331_ie game.C_100230_of.field_106208_b
		// @0F0: getfield java.lang.Object game.C_100331_ie.field_107294_g
		// @0F3: checkcast java.io.DataInputStream
		// @0F6: putfield java.io.DataInputStream game.C_100230_of.field_106204_f
		// @0F9: bipush -2 (0xFE)
		// @0FB: aload_0
		// @0FC: getfield int game.C_100230_of.field_106219_p
		// @0FF: iconst_m1
		// @100: ixor
		// @101: if_icmpeq @108
		// @104: goto @162
		// @107: athrow
		// @108: aload_0
		// @109: getfield game.C_100331_ie game.C_100230_of.field_106206_d
		// @10C: getfield java.lang.Object game.C_100331_ie.field_107294_g
		// @10F: checkcast java.net.Socket
		// @112: astore_2
		// @113: aload_2
		// @114: sipush 10000 (0x2710)
		// @117: invokevirtual java.net.Socket.setSoTimeout(int)void
		// @11A: aload_2
		// @11B: invokevirtual java.net.Socket.getOutputStream()java.io.OutputStream
		// @11E: astore_3
		// @11F: aload_3
		// @120: bipush 17 (0x11)
		// @122: invokevirtual java.io.OutputStream.write(int)void
		// @125: aload_3
		// @126: iconst_0
		// @127: new java.lang.StringBuilder
		// @12A: dup
		// @12B: invokespecial java.lang.StringBuilder.<init>()void
		// @12E: getstatic java.lang.String[] game.C_100230_of.field_106220_z
		// @131: bipush 12 (0x0C)
		// @133: aaload
		// @134: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @137: aload_0
		// @138: getfield java.net.URL game.C_100230_of.field_106209_c
		// @13B: invokevirtual java.net.URL.getFile()java.lang.String
		// @13E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @141: getstatic java.lang.String[] game.C_100230_of.field_106220_z
		// @144: bipush 10 (0x0A)
		// @146: aaload
		// @147: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @14A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @14D: invokestatic game.C_100028_ha.func_103940_a(boolean, java.lang.CharSequence)byte[]
		// @150: invokevirtual java.io.OutputStream.write(byte[])void
		// @153: aload_0
		// @154: new java.io.DataInputStream
		// @157: dup
		// @158: aload_2
		// @159: invokevirtual java.net.Socket.getInputStream()java.io.InputStream
		// @15C: invokespecial java.io.DataInputStream.<init>(java.io.InputStream)void
		// @15F: putfield java.io.DataInputStream game.C_100230_of.field_106204_f
		// @162: aload_0
		// @163: getfield game.C_100280_nf game.C_100230_of.field_106210_a
		// @166: iconst_0
		// @167: putfield int game.C_100280_nf.field_101177_n
		// @16A: goto @17C
		// @16D: astore_2
		// @16E: aload_0
		// @16F: invokevirtual game.C_100230_of.finalize()void
		// @172: aload_0
		// @173: dup
		// @174: getfield int game.C_100230_of.field_106219_p
		// @177: iconst_1
		// @178: iadd
		// @179: putfield int game.C_100230_of.field_106219_p
		// @17C: aconst_null
		// @17D: aload_0
		// @17E: getfield game.C_100331_ie game.C_100230_of.field_106211_n
		// @181: if_acmpeq @188
		// @184: goto @197
		// @187: athrow
		// @188: aload_0
		// @189: aload_0
		// @18A: getfield game.C_100201_qj game.C_100230_of.field_106214_m
		// @18D: iconst_5
		// @18E: bipush 40 (0x28)
		// @190: aload_0
		// @191: invokevirtual game.C_100201_qj.func_105856_a(int, int, java.lang.Runnable)game.C_100331_ie
		// @194: putfield game.C_100331_ie game.C_100230_of.field_106211_n
		// @197: iconst_m1
		// @198: aload_0
		// @199: getfield game.C_100331_ie game.C_100230_of.field_106211_n
		// @19C: getfield int game.C_100331_ie.field_107293_f
		// @19F: iconst_m1
		// @1A0: ixor
		// @1A1: if_icmpne @1A6
		// @1A4: iconst_0
		// @1A5: ireturn
		// @1A6: aload_0
		// @1A7: getfield game.C_100331_ie game.C_100230_of.field_106211_n
		// @1AA: getfield int game.C_100331_ie.field_107293_f
		// @1AD: iconst_1
		// @1AE: if_icmpeq @1C3
		// @1B1: aload_0
		// @1B2: invokevirtual game.C_100230_of.finalize()void
		// @1B5: aload_0
		// @1B6: dup
		// @1B7: getfield int game.C_100230_of.field_106219_p
		// @1BA: iconst_1
		// @1BB: iadd
		// @1BC: putfield int game.C_100230_of.field_106219_p
		// @1BF: goto @1C3
		// @1C2: athrow
		// @1C3: iconst_0
		// @1C4: ireturn
		// @1C5: astore_2
		// @1C6: aload_2
		// @1C7: new java.lang.StringBuilder
		// @1CA: dup
		// @1CB: invokespecial java.lang.StringBuilder.<init>()void
		// @1CE: getstatic java.lang.String[] game.C_100230_of.field_106220_z
		// @1D1: bipush 11 (0x0B)
		// @1D3: aaload
		// @1D4: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1D7: iload_1
		// @1D8: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1DB: bipush 41 (0x29)
		// @1DD: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1E0: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @1E3: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @1E6: athrow
	}
	
	public final void run()
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #4
		// @05: aload_0
		// @06: getfield game.C_100280_nf game.C_100230_of.field_106210_a
		// @09: getfield int game.C_100280_nf.field_101177_n
		// @0C: aload_0
		// @0D: getfield game.C_100280_nf game.C_100230_of.field_106210_a
		// @10: getfield byte[] game.C_100280_nf.field_101179_l
		// @13: arraylength
		// @14: if_icmpge @64
		// @17: aload_0
		// @18: getfield java.io.DataInputStream game.C_100230_of.field_106204_f
		// @1B: aload_0
		// @1C: getfield game.C_100280_nf game.C_100230_of.field_106210_a
		// @1F: getfield byte[] game.C_100280_nf.field_101179_l
		// @22: aload_0
		// @23: getfield game.C_100280_nf game.C_100230_of.field_106210_a
		// @26: getfield int game.C_100280_nf.field_101177_n
		// @29: aload_0
		// @2A: getfield game.C_100280_nf game.C_100230_of.field_106210_a
		// @2D: getfield int game.C_100280_nf.field_101177_n
		// @30: ineg
		// @31: aload_0
		// @32: getfield game.C_100280_nf game.C_100230_of.field_106210_a
		// @35: getfield byte[] game.C_100280_nf.field_101179_l
		// @38: arraylength
		// @39: iadd
		// @3A: invokevirtual java.io.DataInputStream.read(byte[], int, int)int
		// @3D: istore_1
		// @3E: iload_1
		// @3F: iconst_m1
		// @40: ixor
		// @41: iconst_m1
		// @42: iload #4
		// @44: ifne @77
		// @47: if_icmpgt @64
		// @4A: goto @4E
		// @4D: athrow
		// @4E: aload_0
		// @4F: getfield game.C_100280_nf game.C_100230_of.field_106210_a
		// @52: dup
		// @53: getfield int game.C_100280_nf.field_101177_n
		// @56: iload_1
		// @57: iadd
		// @58: putfield int game.C_100280_nf.field_101177_n
		// @5B: iload #4
		// @5D: ifeq @05
		// @60: goto @64
		// @63: athrow
		// @64: aload_0
		// @65: getfield game.C_100280_nf game.C_100230_of.field_106210_a
		// @68: getfield byte[] game.C_100280_nf.field_101179_l
		// @6B: arraylength
		// @6C: iconst_m1
		// @6D: ixor
		// @6E: aload_0
		// @6F: getfield game.C_100280_nf game.C_100230_of.field_106210_a
		// @72: getfield int game.C_100280_nf.field_101177_n
		// @75: iconst_m1
		// @76: ixor
		// @77: if_icmpeq @7D
		// @7A: goto @AE
		// @7D: new java.lang.Exception
		// @80: dup
		// @81: new java.lang.StringBuilder
		// @84: dup
		// @85: invokespecial java.lang.StringBuilder.<init>()void
		// @88: getstatic java.lang.String[] game.C_100230_of.field_106220_z
		// @8B: iconst_4
		// @8C: aaload
		// @8D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @90: aload_0
		// @91: getfield game.C_100280_nf game.C_100230_of.field_106210_a
		// @94: getfield byte[] game.C_100280_nf.field_101179_l
		// @97: arraylength
		// @98: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @9B: ldc " "
		// @9D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @A0: aload_0
		// @A1: getfield java.net.URL game.C_100230_of.field_106209_c
		// @A4: invokevirtual java.lang.StringBuilder.append(java.lang.Object)java.lang.StringBuilder
		// @A7: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @AA: invokespecial java.lang.Exception.<init>(java.lang.String)void
		// @AD: athrow
		// @AE: aload_0
		// @AF: dup
		// @B0: astore_1
		// @B1: monitorenter
		// @B2: aload_0
		// @B3: invokevirtual game.C_100230_of.finalize()void
		// @B6: aload_0
		// @B7: iconst_3
		// @B8: putfield int game.C_100230_of.field_106219_p
		// @BB: aload_1
		// @BC: monitorexit
		// @BD: goto @C5
		// @C0: astore_2
		// @C1: aload_1
		// @C2: monitorexit
		// @C3: aload_2
		// @C4: athrow
		// @C5: goto @E5
		// @C8: astore_1
		// @C9: aload_0
		// @CA: dup
		// @CB: astore_2
		// @CC: monitorenter
		// @CD: aload_0
		// @CE: invokevirtual game.C_100230_of.finalize()void
		// @D1: aload_0
		// @D2: dup
		// @D3: getfield int game.C_100230_of.field_106219_p
		// @D6: iconst_1
		// @D7: iadd
		// @D8: putfield int game.C_100230_of.field_106219_p
		// @DB: aload_2
		// @DC: monitorexit
		// @DD: goto @E5
		// @E0: astore_3
		// @E1: aload_2
		// @E2: monitorexit
		// @E3: aload_3
		// @E4: athrow
		// @E5: goto @F3
		// @E8: astore_1
		// @E9: aload_1
		// @EA: getstatic java.lang.String[] game.C_100230_of.field_106220_z
		// @ED: iconst_5
		// @EE: aaload
		// @EF: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @F2: athrow
		// @F3: return
	}
	
	public static void func_106198_a(int arg0)
	{
		// @00: iload_0
		// @01: iconst_1
		// @02: if_icmpeq @06
		// @05: return
		// @06: aconst_null
		// @07: putstatic game.C_100112_r game.C_100230_of.field_106205_g
		// @0A: aconst_null
		// @0B: putstatic java.lang.String[] game.C_100230_of.field_106218_i
		// @0E: aconst_null
		// @0F: putstatic java.util.zip.CRC32 game.C_100230_of.field_106213_l
		// @12: aconst_null
		// @13: putstatic game.C_100234_ob game.C_100230_of.field_106217_h
		// @16: aconst_null
		// @17: putstatic game.C_100098_h game.C_100230_of.field_106212_o
		// @1A: goto @3E
		// @1D: astore_1
		// @1E: aload_1
		// @1F: new java.lang.StringBuilder
		// @22: dup
		// @23: invokespecial java.lang.StringBuilder.<init>()void
		// @26: getstatic java.lang.String[] game.C_100230_of.field_106220_z
		// @29: iconst_2
		// @2A: aaload
		// @2B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2E: iload_0
		// @2F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @32: bipush 41 (0x29)
		// @34: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @37: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3D: athrow
		// @3E: return
	}
	
	C_100230_of(C_100201_qj arg0, URL arg1, int arg2)
	{
		// @00: aload_0
		// @01: invokespecial java.lang.Object.<init>()void
		// @04: aload_0
		// @05: aload_2
		// @06: putfield java.net.URL game.C_100230_of.field_106209_c
		// @09: aload_0
		// @0A: aload_1
		// @0B: putfield game.C_100201_qj game.C_100230_of.field_106214_m
		// @0E: aload_0
		// @0F: new game.C_100280_nf
		// @12: dup
		// @13: iload_3
		// @14: invokespecial game.C_100280_nf.<init>(int)void
		// @17: putfield game.C_100280_nf game.C_100230_of.field_106210_a
		// @1A: goto @79
		// @1D: astore #4
		// @1F: aload #4
		// @21: new java.lang.StringBuilder
		// @24: dup
		// @25: invokespecial java.lang.StringBuilder.<init>()void
		// @28: getstatic java.lang.String[] game.C_100230_of.field_106220_z
		// @2B: bipush 6 (0x06)
		// @2D: aaload
		// @2E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @31: aload_1
		// @32: ifnull @3F
		// @35: getstatic java.lang.String[] game.C_100230_of.field_106220_z
		// @38: bipush 7 (0x07)
		// @3A: aaload
		// @3B: goto @45
		// @3E: athrow
		// @3F: getstatic java.lang.String[] game.C_100230_of.field_106220_z
		// @42: bipush 8 (0x08)
		// @44: aaload
		// @45: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @48: bipush 44 (0x2C)
		// @4A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4D: aload_2
		// @4E: ifnull @5B
		// @51: getstatic java.lang.String[] game.C_100230_of.field_106220_z
		// @54: bipush 7 (0x07)
		// @56: aaload
		// @57: goto @61
		// @5A: athrow
		// @5B: getstatic java.lang.String[] game.C_100230_of.field_106220_z
		// @5E: bipush 8 (0x08)
		// @60: aaload
		// @61: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @64: bipush 44 (0x2C)
		// @66: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @69: iload_3
		// @6A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6D: bipush 41 (0x29)
		// @6F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @72: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @75: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @78: athrow
		// @79: return
	}
	
	protected final void finalize()
	{
		// @00: aconst_null
		// @01: aload_0
		// @02: getfield game.C_100331_ie game.C_100230_of.field_106208_b
		// @05: if_acmpne @0C
		// @08: goto @30
		// @0B: athrow
		// @0C: aload_0
		// @0D: getfield game.C_100331_ie game.C_100230_of.field_106208_b
		// @10: getfield java.lang.Object game.C_100331_ie.field_107294_g
		// @13: ifnonnull @1A
		// @16: goto @2B
		// @19: athrow
		// @1A: aload_0
		// @1B: getfield game.C_100331_ie game.C_100230_of.field_106208_b
		// @1E: getfield java.lang.Object game.C_100331_ie.field_107294_g
		// @21: checkcast java.io.DataInputStream
		// @24: invokevirtual java.io.DataInputStream.close()void
		// @27: goto @2B
		// @2A: astore_1
		// @2B: aload_0
		// @2C: aconst_null
		// @2D: putfield game.C_100331_ie game.C_100230_of.field_106208_b
		// @30: aconst_null
		// @31: aload_0
		// @32: getfield game.C_100331_ie game.C_100230_of.field_106206_d
		// @35: if_acmpne @3C
		// @38: goto @61
		// @3B: athrow
		// @3C: aconst_null
		// @3D: aload_0
		// @3E: getfield game.C_100331_ie game.C_100230_of.field_106206_d
		// @41: getfield java.lang.Object game.C_100331_ie.field_107294_g
		// @44: if_acmpne @4B
		// @47: goto @5C
		// @4A: athrow
		// @4B: aload_0
		// @4C: getfield game.C_100331_ie game.C_100230_of.field_106206_d
		// @4F: getfield java.lang.Object game.C_100331_ie.field_107294_g
		// @52: checkcast java.net.Socket
		// @55: invokevirtual java.net.Socket.close()void
		// @58: goto @5C
		// @5B: astore_1
		// @5C: aload_0
		// @5D: aconst_null
		// @5E: putfield game.C_100331_ie game.C_100230_of.field_106206_d
		// @61: aconst_null
		// @62: aload_0
		// @63: getfield java.io.DataInputStream game.C_100230_of.field_106204_f
		// @66: if_acmpeq @79
		// @69: aload_0
		// @6A: getfield java.io.DataInputStream game.C_100230_of.field_106204_f
		// @6D: invokevirtual java.io.DataInputStream.close()void
		// @70: goto @74
		// @73: astore_1
		// @74: aload_0
		// @75: aconst_null
		// @76: putfield java.io.DataInputStream game.C_100230_of.field_106204_f
		// @79: aload_0
		// @7A: aconst_null
		// @7B: putfield game.C_100331_ie game.C_100230_of.field_106211_n
		// @7E: goto @8C
		// @81: astore_1
		// @82: aload_1
		// @83: getstatic java.lang.String[] game.C_100230_of.field_106220_z
		// @86: iconst_3
		// @87: aaload
		// @88: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @8B: athrow
		// @8C: return
	}
	
	static
	{
		// @000: bipush 13 (0x0D)
		// @002: anewarray java.lang.String
		// @005: dup
		// @006: iconst_0
		// @007: ldc "\u00056\u0014Ki"
		// @009: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @00C: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @00F: aastore
		// @010: dup
		// @011: iconst_1
		// @012: ldc "\u00056\u0014Ji"
		// @014: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @017: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @01A: aastore
		// @01B: dup
		// @01C: iconst_2
		// @01D: ldc "\u00056\u0014Mi"
		// @01F: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @022: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @025: aastore
		// @026: dup
		// @027: iconst_3
		// @028: ldc "\u00056\u0014n(\u00041Va;\u000fx\u0013"
		// @02A: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @02D: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @030: aastore
		// @031: dup
		// @032: iconst_4
		// @033: ldc "\"\u0017\u000b2a"
		// @035: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @038: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @03B: aastore
		// @03C: dup
		// @03D: iconst_5
		// @03E: ldc "\u00056\u0014z4\u0004x\u0013"
		// @040: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @043: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @046: aastore
		// @047: dup
		// @048: bipush 6 (0x06)
		// @04A: ldc "\u00056\u00144(\u00049N6i"
		// @04C: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @04F: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @052: aastore
		// @053: dup
		// @054: bipush 7 (0x07)
		// @056: ldc "\u0011~\u0014&<"
		// @058: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @05B: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @05E: aastore
		// @05F: dup
		// @060: bipush 8 (0x08)
		// @062: ldc "\u0004%Vd"
		// @064: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @067: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @06A: aastore
		// @06B: dup
		// @06C: bipush 9 (0x09)
		// @06E: ldc "\u00056\u0014Li"
		// @070: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @073: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @076: aastore
		// @077: dup
		// @078: bipush 10 (0x0A)
		// @07A: ldc "`Z"
		// @07C: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @07F: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @082: aastore
		// @083: dup
		// @084: bipush 11 (0x0B)
		// @086: ldc "\u00056\u0014Ii"
		// @088: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @08B: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @08E: aastore
		// @08F: dup
		// @090: bipush 12 (0x0C)
		// @092: ldc " \u0011}O\u0013+\u0012\u001a"
		// @094: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @097: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @09A: aastore
		// @09B: putstatic java.lang.String[] game.C_100230_of.field_106220_z
		// @09E: new java.util.zip.CRC32
		// @0A1: dup
		// @0A2: invokespecial java.util.zip.CRC32.<init>()void
		// @0A5: putstatic java.util.zip.CRC32 game.C_100230_of.field_106213_l
		// @0A8: bipush 36 (0x24)
		// @0AA: anewarray java.lang.String
		// @0AD: dup
		// @0AE: iconst_0
		// @0AF: ldc ",<[ca\u00185Jm \u001e5H"
		// @0B1: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @0B4: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @0B7: aastore
		// @0B8: dup
		// @0B9: iconst_1
		// @0BA: ldc "'9Ta&\u001f>"
		// @0BC: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @0BF: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @0C2: aastore
		// @0C3: dup
		// @0C4: iconst_2
		// @0C5: ldc ",9Hma\u0008?Wja\u00061Of\"\u00025H"
		// @0C7: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @0CA: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @0CD: aastore
		// @0CE: dup
		// @0CF: iconst_3
		// @0D0: ldc "-1O{2J7Of"
		// @0D2: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @0D5: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @0D8: aastore
		// @0D9: dup
		// @0DA: iconst_4
		// @0DB: ldc ":%V{$J<[{$\u0018"
		// @0DD: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @0E0: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @0E3: aastore
		// @0E4: dup
		// @0E5: iconst_5
		// @0E6: ldc ":<[{,\u000bpIx3\u000b)"
		// @0E8: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @0EB: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @0EE: aastore
		// @0EF: dup
		// @0F0: bipush 6 (0x06)
		// @0F2: ldc "81Ja$\u0018pWa2\u00199Vm"
		// @0F4: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @0F7: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @0FA: aastore
		// @0FB: dup
		// @0FC: bipush 7 (0x07)
		// @0FE: ldc ":9_z\"\u000f\"\u001az.\t;_|"
		// @100: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @103: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @106: aastore
		// @107: dup
		// @108: bipush 8 (0x08)
		// @10A: ldc "/\u001dj(3\u00053Qm5"
		// @10C: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @10F: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @112: aastore
		// @113: dup
		// @114: bipush 9 (0x09)
		// @116: ldc "+9Hj4\u0018#N(3\u00053Qm5"
		// @118: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @11B: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @11E: aastore
		// @11F: dup
		// @120: bipush 10 (0x0A)
		// @122: ldc "/<_k5\u0018?T(\"\u000b>Tg/"
		// @124: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @127: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @12A: aastore
		// @12B: dup
		// @12C: bipush 11 (0x0B)
		// @12E: ldc ",<[ca\t1Tf.\u0004"
		// @130: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @133: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @136: aastore
		// @137: dup
		// @138: bipush 12 (0x0C)
		// @13A: ldc "\"5[~8J7Of"
		// @13C: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @13F: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @142: aastore
		// @143: dup
		// @144: bipush 13 (0x0D)
		// @146: ldc "\"5[~8J3[f/\u0005>"
		// @148: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @14B: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @14E: aastore
		// @14F: dup
		// @150: bipush 14 (0x0E)
		// @152: ldc "'?H| \u0018"
		// @154: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @157: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @15A: aastore
		// @15B: dup
		// @15C: bipush 15 (0x0F)
		// @15E: ldc "89\\d$\u000epIf(\u001a5H(\"\u000b>Tg/"
		// @160: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @163: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @166: aastore
		// @167: dup
		// @168: bipush 16 (0x10)
		// @16A: ldc "81Sda\u00185Jm \u001e5H"
		// @16C: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @16F: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @172: aastore
		// @173: dup
		// @174: bipush 17 (0x11)
		// @176: ldc "&1Im3J2_i,"
		// @178: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @17B: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @17E: aastore
		// @17F: dup
		// @180: bipush 18 (0x12)
		// @182: ldc ":<[{,\u000bpYi/\u0004?T"
		// @184: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @187: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @18A: aastore
		// @18B: dup
		// @18C: bipush 19 (0x13)
		// @18E: ldc "'%V|(\u0018?Yc$\u001e"
		// @190: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @193: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @196: aastore
		// @197: dup
		// @198: bipush 20 (0x14)
		// @19A: ldc "\"5[~8J\"Uk*\u000f$"
		// @19C: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @19F: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @1A2: aastore
		// @1A3: dup
		// @1A4: bipush 21 (0x15)
		// @1A6: ldc "&9]`5\u00049Toa\t1Tf.\u0004"
		// @1A8: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @1AB: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @1AE: aastore
		// @1AF: dup
		// @1B0: bipush 22 (0x16)
		// @1B2: ldc "'1]f.J3Vi6"
		// @1B4: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @1B7: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @1BA: aastore
		// @1BB: dup
		// @1BC: bipush 23 (0x17)
		// @1BE: ldc ",<[e$J3[f/\u0005>"
		// @1C0: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @1C3: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @1C6: aastore
		// @1C7: dup
		// @1C8: bipush 24 (0x18)
		// @1CA: ldc "(9U(3\u00053Qm5"
		// @1CC: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @1CF: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @1D2: aastore
		// @1D3: dup
		// @1D4: bipush 25 (0x19)
		// @1D6: ldc "+9H(,\u0003>_"
		// @1D8: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @1DB: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @1DE: aastore
		// @1DF: dup
		// @1E0: bipush 26 (0x1A)
		// @1E2: ldc "?<Nz J7Of"
		// @1E4: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @1E7: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @1EA: aastore
		// @1EB: dup
		// @1EC: bipush 27 (0x1B)
		// @1EE: ldc ".?Ue2\u000e1C(\"\u000b>Tg/"
		// @1F0: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @1F3: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @1F6: aastore
		// @1F7: dup
		// @1F8: bipush 28 (0x1C)
		// @1FA: ldc "\"?Ma5\u00105H"
		// @1FC: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @1FF: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @202: aastore
		// @203: dup
		// @204: bipush 29 (0x1D)
		// @206: ldc "81Sda\t1Tf.\u0004"
		// @208: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @20B: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @20E: aastore
		// @20F: dup
		// @210: bipush 30 (0x1E)
		// @212: ldc "9?Vi3\u0003#\u001ad \u00195H"
		// @214: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @217: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @21A: aastore
		// @21B: dup
		// @21C: bipush 31 (0x1F)
		// @21E: ldc ",%Ia.\u0004pYi/\u0004?T"
		// @220: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @223: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @226: aastore
		// @227: dup
		// @228: bipush 32 (0x20)
		// @22A: ldc ".\u0015{\\\tJ>Oc$"
		// @22C: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @22F: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @232: aastore
		// @233: dup
		// @234: bipush 33 (0x21)
		// @236: ldc ".5I|3\u001f3Ng3J\"Uk*\u000f$"
		// @238: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @23B: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @23E: aastore
		// @23F: dup
		// @240: bipush 34 (0x22)
		// @242: ldc "+9H(%\u000f1N`a\u00079I{(\u00065"
		// @244: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @247: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @24A: aastore
		// @24B: dup
		// @24C: bipush 35 (0x23)
		// @24E: ldc "/\u001dj(\"\u000b>Tg/"
		// @250: invokestatic game.C_100230_of.func_106200_z(java.lang.String)char[]
		// @253: invokestatic game.C_100230_of.func_106199_z(char[])java.lang.String
		// @256: aastore
		// @257: putstatic java.lang.String[] game.C_100230_of.field_106218_i
		// @25A: iconst_0
		// @25B: putstatic int game.C_100230_of.field_106215_j
		// @25E: iconst_1
		// @25F: putstatic boolean game.C_100230_of.field_106216_k
		// @262: return
	}
	
	private static char[] func_106200_z(String arg0)
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
		// @0E: bipush 65 (0x41)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_106199_z(char[] arg0)
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
		// @30: bipush 106 (0x6A)
		// @32: goto @46
		// @35: bipush 80 (0x50)
		// @37: goto @46
		// @3A: bipush 58 (0x3A)
		// @3C: goto @46
		// @3F: bipush 8 (0x08)
		// @41: goto @46
		// @44: bipush 65 (0x41)
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
