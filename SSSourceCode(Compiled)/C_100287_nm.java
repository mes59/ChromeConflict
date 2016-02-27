package game;

import java.math.BigInteger;

final class C_100287_nm
{
	static BigInteger field_106831_k;
	static String field_106823_g;
	static C_100037_wb[] field_106830_j;
	static C_100037_wb[] field_106829_l;
	static String field_106824_d;
	static String[] field_106828_a;
	static String[] field_106822_f;
	static boolean field_106832_h;
	static String field_106833_i;
	static int[] field_106825_e;
	static int field_106826_b;
	static int field_106827_c;
	private static final String field_106834_z;
	
	public static void func_106819_a(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic game.C_100037_wb[] game.C_100287_nm.field_106830_j
		// @04: aconst_null
		// @05: putstatic java.math.BigInteger game.C_100287_nm.field_106831_k
		// @08: aconst_null
		// @09: putstatic java.lang.String game.C_100287_nm.field_106833_i
		// @0C: aconst_null
		// @0D: putstatic java.lang.String game.C_100287_nm.field_106824_d
		// @10: aconst_null
		// @11: putstatic int[] game.C_100287_nm.field_106825_e
		// @14: aconst_null
		// @15: putstatic java.lang.String game.C_100287_nm.field_106823_g
		// @18: aconst_null
		// @19: putstatic java.lang.String[] game.C_100287_nm.field_106828_a
		// @1C: aconst_null
		// @1D: putstatic game.C_100037_wb[] game.C_100287_nm.field_106829_l
		// @20: iload_0
		// @21: bipush -76 (0xB4)
		// @23: if_icmplt @31
		// @26: aconst_null
		// @27: checkcast game.C_100037_wb[]
		// @2A: putstatic game.C_100037_wb[] game.C_100287_nm.field_106830_j
		// @2D: goto @31
		// @30: athrow
		// @31: aconst_null
		// @32: putstatic java.lang.String[] game.C_100287_nm.field_106822_f
		// @35: goto @57
		// @38: astore_1
		// @39: aload_1
		// @3A: new java.lang.StringBuilder
		// @3D: dup
		// @3E: invokespecial java.lang.StringBuilder.<init>()void
		// @41: getstatic java.lang.String game.C_100287_nm.field_106834_z
		// @44: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @47: iload_0
		// @48: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4B: bipush 41 (0x29)
		// @4D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @50: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @53: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @56: athrow
		// @57: return
	}
	
	static
	{
		// @000: ldc "yp^s+"
		// @002: invokestatic game.C_100287_nm.func_106821_z(java.lang.String)char[]
		// @005: invokestatic game.C_100287_nm.func_106820_z(char[])java.lang.String
		// @008: putstatic java.lang.String game.C_100287_nm.field_106834_z
		// @00B: new java.math.BigInteger
		// @00E: dup
		// @00F: ldc "\"*A\n0\"+C\u00016!(G\u0001:\"(A\n0$,H\u00002 -@\u00072.-I\u00077#.H\n6!/B\u00026.+E\u00034')B\u0007: -H\n3%)@\u0004;&,F\u00042'$A\u00023!%F\u00032$(B\u000b7/$B\u00014#.G\u00033.(E\u00000&.H\n4'*B\u00023%)B\u00045')@\u0001;\"-E\u00047!-C\u00041 $F\u00041$.A\u0005:&(A\u00074#%C\u00001!.G\u0003"
		// @011: invokestatic game.C_100287_nm.func_106821_z(java.lang.String)char[]
		// @014: invokestatic game.C_100287_nm.func_106820_z(char[])java.lang.String
		// @017: invokespecial java.math.BigInteger.<init>(java.lang.String)void
		// @01A: putstatic java.math.BigInteger game.C_100287_nm.field_106831_k
		// @01D: ldc "+8@\u000c$d=\u0017Snr"
		// @01F: invokestatic game.C_100287_nm.func_106821_z(java.lang.String)char[]
		// @022: invokestatic game.C_100287_nm.func_106820_z(char[])java.lang.String
		// @025: putstatic java.lang.String game.C_100287_nm.field_106823_g
		// @028: bipush 12 (0x0C)
		// @02A: anewarray java.lang.String
		// @02D: dup
		// @02E: iconst_0
		// @02F: ldc "]|\u001e"
		// @031: invokestatic game.C_100287_nm.func_106821_z(java.lang.String)char[]
		// @034: invokestatic game.C_100287_nm.func_106820_z(char[])java.lang.String
		// @037: aastore
		// @038: dup
		// @039: iconst_1
		// @03A: ldc "Qx\u0012"
		// @03C: invokestatic game.C_100287_nm.func_106821_z(java.lang.String)char[]
		// @03F: invokestatic game.C_100287_nm.func_106820_z(char[])java.lang.String
		// @042: aastore
		// @043: dup
		// @044: iconst_2
		// @045: ldc "Z|\u0002"
		// @047: invokestatic game.C_100287_nm.func_106821_z(java.lang.String)char[]
		// @04A: invokestatic game.C_100287_nm.func_106820_z(char[])java.lang.String
		// @04D: aastore
		// @04E: dup
		// @04F: iconst_3
		// @050: ldc "Vm\u0002"
		// @052: invokestatic game.C_100287_nm.func_106821_z(java.lang.String)char[]
		// @055: invokestatic game.C_100287_nm.func_106820_z(char[])java.lang.String
		// @058: aastore
		// @059: dup
		// @05A: iconst_4
		// @05B: ldc "Z|\t"
		// @05D: invokestatic game.C_100287_nm.func_106821_z(java.lang.String)char[]
		// @060: invokestatic game.C_100287_nm.func_106820_z(char[])java.lang.String
		// @063: aastore
		// @064: dup
		// @065: iconst_5
		// @066: ldc "]h\u001e"
		// @068: invokestatic game.C_100287_nm.func_106821_z(java.lang.String)char[]
		// @06B: invokestatic game.C_100287_nm.func_106820_z(char[])java.lang.String
		// @06E: aastore
		// @06F: dup
		// @070: bipush 6 (0x06)
		// @072: ldc "]h\u001c"
		// @074: invokestatic game.C_100287_nm.func_106821_z(java.lang.String)char[]
		// @077: invokestatic game.C_100287_nm.func_106820_z(char[])java.lang.String
		// @07A: aastore
		// @07B: dup
		// @07C: bipush 7 (0x07)
		// @07E: ldc "Vh\u0017"
		// @080: invokestatic game.C_100287_nm.func_106821_z(java.lang.String)char[]
		// @083: invokestatic game.C_100287_nm.func_106820_z(char[])java.lang.String
		// @086: aastore
		// @087: dup
		// @088: bipush 8 (0x08)
		// @08A: ldc "Dx\u0000"
		// @08C: invokestatic game.C_100287_nm.func_106821_z(java.lang.String)char[]
		// @08F: invokestatic game.C_100287_nm.func_106820_z(char[])java.lang.String
		// @092: aastore
		// @093: dup
		// @094: bipush 9 (0x09)
		// @096: ldc "X~\u0004"
		// @098: invokestatic game.C_100287_nm.func_106821_z(java.lang.String)char[]
		// @09B: invokestatic game.C_100287_nm.func_106820_z(char[])java.lang.String
		// @09E: aastore
		// @09F: dup
		// @0A0: bipush 10 (0x0A)
		// @0A2: ldc "Yr\u0006"
		// @0A4: invokestatic game.C_100287_nm.func_106821_z(java.lang.String)char[]
		// @0A7: invokestatic game.C_100287_nm.func_106820_z(char[])java.lang.String
		// @0AA: aastore
		// @0AB: dup
		// @0AC: bipush 11 (0x0B)
		// @0AE: ldc "Sx\u0013"
		// @0B0: invokestatic game.C_100287_nm.func_106821_z(java.lang.String)char[]
		// @0B3: invokestatic game.C_100287_nm.func_106820_z(char[])java.lang.String
		// @0B6: aastore
		// @0B7: putstatic java.lang.String[] game.C_100287_nm.field_106822_f
		// @0BA: ldc "]h\u0003F#gq\u0011K"
		// @0BC: invokestatic game.C_100287_nm.func_106821_z(java.lang.String)char[]
		// @0BF: invokestatic game.C_100287_nm.func_106820_z(char[])java.lang.String
		// @0C2: putstatic java.lang.String game.C_100287_nm.field_106833_i
		// @0C5: iconst_3
		// @0C6: anewarray java.lang.String
		// @0C9: dup
		// @0CA: iconst_0
		// @0CB: ldc "dm\u0015WgHt\u0013]md"
		// @0CD: invokestatic game.C_100287_nm.func_106821_z(java.lang.String)char[]
		// @0D0: invokestatic game.C_100287_nm.func_106820_z(char[])java.lang.String
		// @0D3: aastore
		// @0D4: dup
		// @0D5: iconst_1
		// @0D6: ldc "st\u0016T\\~~\u001f\\p"
		// @0D8: invokestatic game.C_100287_nm.func_106821_z(java.lang.String)char[]
		// @0DB: invokestatic game.C_100287_nm.func_106820_z(char[])java.lang.String
		// @0DE: aastore
		// @0DF: dup
		// @0E0: iconst_2
		// @0E1: ldc "z|\u0000mjtr\u001eA"
		// @0E3: invokestatic game.C_100287_nm.func_106821_z(java.lang.String)char[]
		// @0E6: invokestatic game.C_100287_nm.func_106820_z(char[])java.lang.String
		// @0E9: aastore
		// @0EA: putstatic java.lang.String[] game.C_100287_nm.field_106828_a
		// @0ED: iconst_0
		// @0EE: putstatic int game.C_100287_nm.field_106826_b
		// @0F1: iconst_3
		// @0F2: putstatic int game.C_100287_nm.field_106827_c
		// @0F5: bipush 12 (0x0C)
		// @0F7: newarray int[]
		// @0F9: dup
		// @0FA: iconst_0
		// @0FB: bipush 107 (0x6B)
		// @0FD: iastore
		// @0FE: dup
		// @0FF: iconst_1
		// @100: bipush 83 (0x53)
		// @102: iastore
		// @103: dup
		// @104: iconst_2
		// @105: bipush 24 (0x18)
		// @107: iastore
		// @108: dup
		// @109: iconst_3
		// @10A: bipush 24 (0x18)
		// @10C: iastore
		// @10D: dup
		// @10E: iconst_4
		// @10F: bipush 35 (0x23)
		// @111: iastore
		// @112: dup
		// @113: iconst_5
		// @114: iconst_m1
		// @115: iastore
		// @116: dup
		// @117: bipush 6 (0x06)
		// @119: iconst_m1
		// @11A: iastore
		// @11B: dup
		// @11C: bipush 7 (0x07)
		// @11E: iconst_m1
		// @11F: iastore
		// @120: dup
		// @121: bipush 8 (0x08)
		// @123: iconst_m1
		// @124: iastore
		// @125: dup
		// @126: bipush 9 (0x09)
		// @128: iconst_m1
		// @129: iastore
		// @12A: dup
		// @12B: bipush 10 (0x0A)
		// @12D: iconst_m1
		// @12E: iastore
		// @12F: dup
		// @130: bipush 11 (0x0B)
		// @132: iconst_m1
		// @133: iastore
		// @134: putstatic int[] game.C_100287_nm.field_106825_e
		// @137: ldc "Go\u0015Ap7[A\u0002#crP]srsPcv~~\u001b\u0012@\u007f|\u0004\u001c"
		// @139: invokestatic game.C_100287_nm.func_106821_z(java.lang.String)char[]
		// @13C: invokestatic game.C_100287_nm.func_106820_z(char[])java.lang.String
		// @13F: putstatic java.lang.String game.C_100287_nm.field_106824_d
		// @142: return
	}
	
	private static char[] func_106821_z(String arg0)
	{
		// @00: aload_0
		// @01: invokevirtual java.lang.String.toCharArray()char[]
		// @04: dup
		// @05: arraylength
		// @06: iconst_2
		// @07: if_icmpge @12
		// @0A: dup
		// @0B: iconst_0
		// @0C: dup2
		// @0D: caload
		// @0E: iconst_3
		// @0F: ixor
		// @10: i2c
		// @11: castore
		// @12: areturn
	}
	
	private static String func_106820_z(char[] arg0)
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
		// @10: tableswitch def: @44, for 0: @30, for 1: @35, for 2: @3A, for 3: @3F
		// @30: bipush 23 (0x17)
		// @32: goto @45
		// @35: bipush 29 (0x1D)
		// @37: goto @45
		// @3A: bipush 112 (0x70)
		// @3C: goto @45
		// @3F: bipush 50 (0x32)
		// @41: goto @45
		// @44: iconst_3
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
