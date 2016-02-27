package game;

import java.util.Hashtable;
import java.io.File;

public class C_100040_wc
{
	private static String field_104094_c;
	private static Hashtable field_104091_d;
	private static boolean field_104093_b;
	private static int field_104095_a;
	private static String field_104092_e;
	private static final String[] field_104096_z;
	
	public static File func_104089_a(byte arg0, String arg1)
	{
		// @00: iload_0
		// @01: bipush -24 (0xE8)
		// @03: if_icmple @14
		// @06: aconst_null
		// @07: checkcast java.lang.String
		// @0A: iconst_0
		// @0B: bipush -81 (0xAF)
		// @0D: invokestatic game.C_100040_wc.func_104086_a(java.lang.String, boolean, int)void
		// @10: goto @14
		// @13: athrow
		// @14: getstatic int game.C_100040_wc.field_104095_a
		// @17: iconst_0
		// @18: getstatic java.lang.String game.C_100040_wc.field_104094_c
		// @1B: aload_1
		// @1C: invokestatic game.C_100040_wc.func_104090_a(int, int, java.lang.String, java.lang.String)java.io.File
		// @1F: areturn
		// @20: astore_2
		// @21: aload_2
		// @22: athrow
	}
	
	public static void func_104086_a(String arg0, boolean arg1, int arg2)
	{
		// @00: iload_2
		// @01: putstatic int game.C_100040_wc.field_104095_a
		// @04: aload_0
		// @05: putstatic java.lang.String game.C_100040_wc.field_104094_c
		// @08: getstatic java.lang.String[] game.C_100040_wc.field_104096_z
		// @0B: bipush 10 (0x0A)
		// @0D: aaload
		// @0E: invokestatic java.lang.System.getProperty(java.lang.String)java.lang.String
		// @11: putstatic java.lang.String game.C_100040_wc.field_104092_e
		// @14: getstatic java.lang.String game.C_100040_wc.field_104092_e
		// @17: ifnull @32
		// @1A: new java.lang.StringBuilder
		// @1D: dup
		// @1E: invokespecial java.lang.StringBuilder.<init>()void
		// @21: getstatic java.lang.String game.C_100040_wc.field_104092_e
		// @24: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @27: ldc "/"
		// @29: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @2F: putstatic java.lang.String game.C_100040_wc.field_104092_e
		// @32: goto @36
		// @35: astore_3
		// @36: iload_1
		// @37: putstatic boolean game.C_100040_wc.field_104093_b
		// @3A: getstatic java.lang.String game.C_100040_wc.field_104092_e
		// @3D: ifnull @44
		// @40: goto @4D
		// @43: athrow
		// @44: getstatic java.lang.String[] game.C_100040_wc.field_104096_z
		// @47: bipush 9 (0x09)
		// @49: aaload
		// @4A: putstatic java.lang.String game.C_100040_wc.field_104092_e
		// @4D: goto @53
		// @50: astore_3
		// @51: aload_3
		// @52: athrow
		// @53: return
	}
	
	private C_100040_wc() throws Throwable
	{
		// @0: aload_0
		// @1: invokespecial java.lang.Object.<init>()void
		// @4: new java.lang.Error
		// @7: dup
		// @8: invokespecial java.lang.Error.<init>()void
		// @B: athrow
		// @C: astore_1
		// @D: aload_1
		// @E: athrow
	}
	
	public static File func_104090_a(int arg0, int arg1, String arg2, String arg3)
	{
		// @000: getstatic boolean game.C_100040_wc.field_104093_b
		// @003: ifeq @00A
		// @006: goto @014
		// @009: athrow
		// @00A: new java.lang.RuntimeException
		// @00D: dup
		// @00E: ldc ""
		// @010: invokespecial java.lang.RuntimeException.<init>(java.lang.String)void
		// @013: athrow
		// @014: getstatic java.util.Hashtable game.C_100040_wc.field_104091_d
		// @017: aload_3
		// @018: invokevirtual java.util.Hashtable.get(java.lang.Object)java.lang.Object
		// @01B: checkcast java.io.File
		// @01E: astore #4
		// @020: aload #4
		// @022: ifnonnull @029
		// @025: goto @02C
		// @028: athrow
		// @029: aload #4
		// @02B: areturn
		// @02C: bipush 8 (0x08)
		// @02E: anewarray java.lang.String
		// @031: dup
		// @032: iconst_0
		// @033: getstatic java.lang.String[] game.C_100040_wc.field_104096_z
		// @036: iconst_2
		// @037: aaload
		// @038: aastore
		// @039: dup
		// @03A: iconst_1
		// @03B: getstatic java.lang.String[] game.C_100040_wc.field_104096_z
		// @03E: bipush 7 (0x07)
		// @040: aaload
		// @041: aastore
		// @042: dup
		// @043: iconst_2
		// @044: getstatic java.lang.String[] game.C_100040_wc.field_104096_z
		// @047: bipush 6 (0x06)
		// @049: aaload
		// @04A: aastore
		// @04B: dup
		// @04C: iconst_3
		// @04D: getstatic java.lang.String[] game.C_100040_wc.field_104096_z
		// @050: iconst_3
		// @051: aaload
		// @052: aastore
		// @053: dup
		// @054: iconst_4
		// @055: getstatic java.lang.String[] game.C_100040_wc.field_104096_z
		// @058: iconst_5
		// @059: aaload
		// @05A: aastore
		// @05B: dup
		// @05C: iconst_5
		// @05D: getstatic java.lang.String game.C_100040_wc.field_104092_e
		// @060: aastore
		// @061: dup
		// @062: bipush 6 (0x06)
		// @064: getstatic java.lang.String[] game.C_100040_wc.field_104096_z
		// @067: iconst_1
		// @068: aaload
		// @069: aastore
		// @06A: dup
		// @06B: bipush 7 (0x07)
		// @06D: ldc ""
		// @06F: aastore
		// @070: astore #5
		// @072: iconst_2
		// @073: anewarray java.lang.String
		// @076: dup
		// @077: iconst_0
		// @078: new java.lang.StringBuilder
		// @07B: dup
		// @07C: invokespecial java.lang.StringBuilder.<init>()void
		// @07F: getstatic java.lang.String[] game.C_100040_wc.field_104096_z
		// @082: iconst_4
		// @083: aaload
		// @084: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @087: iload_0
		// @088: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @08B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @08E: aastore
		// @08F: dup
		// @090: iconst_1
		// @091: new java.lang.StringBuilder
		// @094: dup
		// @095: invokespecial java.lang.StringBuilder.<init>()void
		// @098: getstatic java.lang.String[] game.C_100040_wc.field_104096_z
		// @09B: bipush 8 (0x08)
		// @09D: aaload
		// @09E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0A1: iload_0
		// @0A2: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0A5: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @0A8: aastore
		// @0A9: astore #6
		// @0AB: iload_1
		// @0AC: istore #7
		// @0AE: bipush -3 (0xFD)
		// @0B0: iload #7
		// @0B2: iconst_m1
		// @0B3: ixor
		// @0B4: if_icmpge @234
		// @0B7: iconst_0
		// @0B8: istore #8
		// @0BA: aload #6
		// @0BC: arraylength
		// @0BD: iconst_m1
		// @0BE: ixor
		// @0BF: iload #8
		// @0C1: iconst_m1
		// @0C2: ixor
		// @0C3: if_icmpge @22E
		// @0C6: iconst_0
		// @0C7: istore #9
		// @0C9: iload #9
		// @0CB: aload #5
		// @0CD: arraylength
		// @0CE: if_icmpge @228
		// @0D1: new java.lang.StringBuilder
		// @0D4: dup
		// @0D5: invokespecial java.lang.StringBuilder.<init>()void
		// @0D8: aload #5
		// @0DA: iload #9
		// @0DC: aaload
		// @0DD: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0E0: aload #6
		// @0E2: iload #8
		// @0E4: aaload
		// @0E5: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0E8: ldc "/"
		// @0EA: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0ED: aconst_null
		// @0EE: aload_2
		// @0EF: if_acmpeq @10D
		// @0F2: goto @0F6
		// @0F5: athrow
		// @0F6: new java.lang.StringBuilder
		// @0F9: dup
		// @0FA: invokespecial java.lang.StringBuilder.<init>()void
		// @0FD: aload_2
		// @0FE: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @101: ldc "/"
		// @103: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @106: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @109: goto @10F
		// @10C: athrow
		// @10D: ldc ""
		// @10F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @112: aload_3
		// @113: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @116: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @119: astore #10
		// @11B: aconst_null
		// @11C: astore #11
		// @11E: new java.io.File
		// @121: dup
		// @122: aload #10
		// @124: invokespecial java.io.File.<init>(java.lang.String)void
		// @127: astore #12
		// @129: iconst_0
		// @12A: iload #7
		// @12C: if_icmpne @13E
		// @12F: aload #12
		// @131: invokevirtual java.io.File.exists()boolean
		// @134: ifne @13E
		// @137: goto @13B
		// @13A: athrow
		// @13B: goto @222
		// @13E: aload #5
		// @140: iload #9
		// @142: aaload
		// @143: astore #13
		// @145: iload #7
		// @147: iconst_1
		// @148: if_icmpne @171
		// @14B: iconst_0
		// @14C: aload #13
		// @14E: invokevirtual java.lang.String.length()int
		// @151: if_icmpge @171
		// @154: goto @158
		// @157: athrow
		// @158: new java.io.File
		// @15B: dup
		// @15C: aload #13
		// @15E: invokespecial java.io.File.<init>(java.lang.String)void
		// @161: invokevirtual java.io.File.exists()boolean
		// @164: ifeq @16E
		// @167: goto @16B
		// @16A: athrow
		// @16B: goto @171
		// @16E: goto @222
		// @171: new java.io.File
		// @174: dup
		// @175: new java.lang.StringBuilder
		// @178: dup
		// @179: invokespecial java.lang.StringBuilder.<init>()void
		// @17C: aload #5
		// @17E: iload #9
		// @180: aaload
		// @181: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @184: aload #6
		// @186: iload #8
		// @188: aaload
		// @189: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @18C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @18F: invokespecial java.io.File.<init>(java.lang.String)void
		// @192: invokevirtual java.io.File.mkdir()boolean
		// @195: pop
		// @196: aconst_null
		// @197: aload_2
		// @198: if_acmpeq @1CD
		// @19B: new java.io.File
		// @19E: dup
		// @19F: new java.lang.StringBuilder
		// @1A2: dup
		// @1A3: invokespecial java.lang.StringBuilder.<init>()void
		// @1A6: aload #5
		// @1A8: iload #9
		// @1AA: aaload
		// @1AB: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1AE: aload #6
		// @1B0: iload #8
		// @1B2: aaload
		// @1B3: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1B6: ldc "/"
		// @1B8: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1BB: aload_2
		// @1BC: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1BF: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @1C2: invokespecial java.io.File.<init>(java.lang.String)void
		// @1C5: invokevirtual java.io.File.mkdir()boolean
		// @1C8: pop
		// @1C9: goto @1CD
		// @1CC: athrow
		// @1CD: new java.io.RandomAccessFile
		// @1D0: dup
		// @1D1: aload #12
		// @1D3: getstatic java.lang.String[] game.C_100040_wc.field_104096_z
		// @1D6: iconst_0
		// @1D7: aaload
		// @1D8: invokespecial java.io.RandomAccessFile.<init>(java.io.File, java.lang.String)void
		// @1DB: astore #11
		// @1DD: aload #11
		// @1DF: invokevirtual java.io.RandomAccessFile.read()int
		// @1E2: istore #14
		// @1E4: aload #11
		// @1E6: lconst_0
		// @1E7: invokevirtual java.io.RandomAccessFile.seek(long)void
		// @1EA: aload #11
		// @1EC: iload #14
		// @1EE: invokevirtual java.io.RandomAccessFile.write(int)void
		// @1F1: aload #11
		// @1F3: lconst_0
		// @1F4: invokevirtual java.io.RandomAccessFile.seek(long)void
		// @1F7: aload #11
		// @1F9: invokevirtual java.io.RandomAccessFile.close()void
		// @1FC: getstatic java.util.Hashtable game.C_100040_wc.field_104091_d
		// @1FF: aload_3
		// @200: aload #12
		// @202: invokevirtual java.util.Hashtable.put(java.lang.Object, java.lang.Object)java.lang.Object
		// @205: pop
		// @206: aload #12
		// @208: areturn
		// @209: astore #12
		// @20B: aconst_null
		// @20C: aload #11
		// @20E: if_acmpne @215
		// @211: goto @21D
		// @214: athrow
		// @215: aload #11
		// @217: invokevirtual java.io.RandomAccessFile.close()void
		// @21A: aconst_null
		// @21B: astore #11
		// @21D: goto @222
		// @220: astore #13
		// @222: iinc #9 +1
		// @225: goto @0C9
		// @228: iinc #8 +1
		// @22B: goto @0BA
		// @22E: iinc #7 +1
		// @231: goto @0AE
		// @234: new java.lang.RuntimeException
		// @237: dup
		// @238: invokespecial java.lang.RuntimeException.<init>()void
		// @23B: athrow
		// @23C: astore #4
		// @23E: aload #4
		// @240: athrow
	}
	
	static
	{
		// @00: bipush 11 (0x0B)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "\"s"
		// @09: invokestatic game.C_100040_wc.func_104088_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100040_wc.func_104087_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "\u007fp\u0018\u001fw"
		// @14: invokestatic game.C_100040_wc.func_104088_z(java.lang.String)char[]
		// @17: invokestatic game.C_100040_wc.func_104087_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "3>Z\u001d+3e\u0016\u0007=\u007f"
		// @1F: invokestatic game.C_100040_wc.func_104088_z(java.lang.String)char[]
		// @22: invokestatic game.C_100040_wc.func_104087_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "3>Z\u00181>j\u0001@"
		// @2A: invokestatic game.C_100040_wc.func_104088_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100040_wc.func_104087_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "~n\u0014\u0008=([\u0016\u000e;8a*"
		// @35: invokestatic game.C_100040_wc.func_104088_z(java.lang.String)char[]
		// @38: invokestatic game.C_100040_wc.func_104087_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "3>Z"
		// @40: invokestatic game.C_100040_wc.func_104088_z(java.lang.String)char[]
		// @43: invokestatic game.C_100040_wc.func_104087_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "3>Z\u00181>`\u001a\u0018+\u007f"
		// @4C: invokestatic game.C_100040_wc.func_104088_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100040_wc.func_104087_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "\u007fv\u0006\u000c93l\u0010@"
		// @58: invokestatic game.C_100040_wc.func_104088_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100040_wc.func_104087_z(char[])java.lang.String
		// @5E: aastore
		// @5F: dup
		// @60: bipush 8 (0x08)
		// @62: ldc "~b\u001c\u0003=\u000fw\u0001\u0000*5["
		// @64: invokestatic game.C_100040_wc.func_104088_z(java.lang.String)char[]
		// @67: invokestatic game.C_100040_wc.func_104087_z(char[])java.lang.String
		// @6A: aastore
		// @6B: dup
		// @6C: bipush 9 (0x09)
		// @6E: ldc ".+"
		// @70: invokestatic game.C_100040_wc.func_104088_z(java.lang.String)char[]
		// @73: invokestatic game.C_100040_wc.func_104087_z(char[])java.lang.String
		// @76: aastore
		// @77: dup
		// @78: bipush 10 (0x0A)
		// @7A: ldc "%w\u0010\u001dv8k\u0018\n"
		// @7C: invokestatic game.C_100040_wc.func_104088_z(java.lang.String)char[]
		// @7F: invokestatic game.C_100040_wc.func_104087_z(char[])java.lang.String
		// @82: aastore
		// @83: putstatic java.lang.String[] game.C_100040_wc.field_104096_z
		// @86: iconst_0
		// @87: putstatic boolean game.C_100040_wc.field_104093_b
		// @8A: new java.util.Hashtable
		// @8D: dup
		// @8E: bipush 16 (0x10)
		// @90: invokespecial java.util.Hashtable.<init>(int)void
		// @93: putstatic java.util.Hashtable game.C_100040_wc.field_104091_d
		// @96: return
	}
	
	private static char[] func_104088_z(String arg0)
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
		// @0E: bipush 88 (0x58)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_104087_z(char[] arg0)
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
		// @30: bipush 80 (0x50)
		// @32: goto @45
		// @35: iconst_4
		// @36: goto @45
		// @39: bipush 117 (0x75)
		// @3B: goto @45
		// @3E: bipush 111 (0x6F)
		// @40: goto @45
		// @43: bipush 88 (0x58)
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
