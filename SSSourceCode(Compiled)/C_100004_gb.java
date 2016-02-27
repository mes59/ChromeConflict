package game;

import java.net.Socket;
import java.net.ProxySelector;
import java.net.Proxy;
import java.io.IOException;

final class C_100004_gb extends C_100157_db
{
	static boolean field_103578_i;
	static C_100037_wb[] field_103577_h;
	static int[] field_103574_j;
	private ProxySelector field_103572_g;
	static C_100210_qa field_103576_k;
	static int field_103573_l;
	private static final String[] field_103575_z;
	
	static final C_100153_be func_103569_a(String arg0, byte arg1, String arg2, C_100098_h arg3)
	{
		// @00: aload_3
		// @01: sipush -10719 (0xD621)
		// @04: aload_0
		// @05: invokevirtual game.C_100098_h.func_104601_b(int, java.lang.String)int
		// @08: istore #4
		// @0A: iload_1
		// @0B: bipush -62 (0xC2)
		// @0D: if_icmpeq @15
		// @10: aconst_null
		// @11: checkcast game.C_100153_be
		// @14: areturn
		// @15: aload_3
		// @16: aload_2
		// @17: iload #4
		// @19: iconst_0
		// @1A: invokevirtual game.C_100098_h.func_104600_a(java.lang.String, int, int)int
		// @1D: istore #5
		// @1F: iload #4
		// @21: bipush -128 (0x80)
		// @23: aload_3
		// @24: iload #5
		// @26: invokestatic game.C_100146_bf.func_105118_a(int, int, game.C_100098_h, int)game.C_100153_be
		// @29: areturn
		// @2A: astore #4
		// @2C: aload #4
		// @2E: new java.lang.StringBuilder
		// @31: dup
		// @32: invokespecial java.lang.StringBuilder.<init>()void
		// @35: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @38: bipush 32 (0x20)
		// @3A: aaload
		// @3B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3E: aload_0
		// @3F: ifnull @4C
		// @42: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @45: bipush 8 (0x08)
		// @47: aaload
		// @48: goto @52
		// @4B: athrow
		// @4C: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @4F: bipush 9 (0x09)
		// @51: aaload
		// @52: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @55: bipush 44 (0x2C)
		// @57: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5A: iload_1
		// @5B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5E: bipush 44 (0x2C)
		// @60: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @63: aload_2
		// @64: ifnull @71
		// @67: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @6A: bipush 8 (0x08)
		// @6C: aaload
		// @6D: goto @77
		// @70: athrow
		// @71: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @74: bipush 9 (0x09)
		// @76: aaload
		// @77: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @7A: bipush 44 (0x2C)
		// @7C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7F: aload_3
		// @80: ifnull @8D
		// @83: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @86: bipush 8 (0x08)
		// @88: aaload
		// @89: goto @93
		// @8C: athrow
		// @8D: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @90: bipush 9 (0x09)
		// @92: aaload
		// @93: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @96: bipush 41 (0x29)
		// @98: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @9E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @A1: athrow
	}
	
	static final void func_103565_a(boolean arg0, boolean arg1, boolean arg2)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #6
		// @005: bipush 10 (0x0A)
		// @007: putstatic int game.C_100218_am.field_103115_N
		// @00A: iconst_0
		// @00B: putstatic int game.C_100181_cf.field_105704_e
		// @00E: getstatic int game.C_100194_rd.field_103072_v
		// @011: iconst_m1
		// @012: ixor
		// @013: iconst_m1
		// @014: if_icmpne @0C3
		// @017: getstatic int game.C_100197_ra.field_100867_r
		// @01A: istore_3
		// @01B: iconst_m1
		// @01C: iload_3
		// @01D: iconst_m1
		// @01E: ixor
		// @01F: if_icmpne @02B
		// @022: iload #6
		// @024: ifeq @077
		// @027: goto @02B
		// @02A: athrow
		// @02B: iload_3
		// @02C: iconst_m1
		// @02D: ixor
		// @02E: bipush -2 (0xFE)
		// @030: if_icmpne @040
		// @033: goto @037
		// @036: athrow
		// @037: iload #6
		// @039: ifeq @080
		// @03C: goto @040
		// @03F: athrow
		// @040: iconst_3
		// @041: iload_3
		// @042: if_icmpne @052
		// @045: goto @049
		// @048: athrow
		// @049: iload #6
		// @04B: ifeq @08D
		// @04E: goto @052
		// @051: athrow
		// @052: iconst_5
		// @053: iload_3
		// @054: if_icmpeq @09A
		// @057: goto @05B
		// @05A: athrow
		// @05B: bipush -8 (0xF8)
		// @05D: iload_3
		// @05E: iconst_m1
		// @05F: ixor
		// @060: if_icmpeq @0A7
		// @063: goto @067
		// @066: athrow
		// @067: bipush -10 (0xF6)
		// @069: iload_3
		// @06A: iconst_m1
		// @06B: ixor
		// @06C: if_icmpeq @0B5
		// @06F: goto @073
		// @072: athrow
		// @073: goto @10B
		// @076: athrow
		// @077: iconst_0
		// @078: putstatic int game.C_100218_am.field_103115_N
		// @07B: iload #6
		// @07D: ifeq @10B
		// @080: iconst_1
		// @081: putstatic int game.C_100218_am.field_103115_N
		// @084: iload #6
		// @086: ifeq @10B
		// @089: goto @08D
		// @08C: athrow
		// @08D: iconst_3
		// @08E: putstatic int game.C_100218_am.field_103115_N
		// @091: iload #6
		// @093: ifeq @10B
		// @096: goto @09A
		// @099: athrow
		// @09A: iconst_5
		// @09B: putstatic int game.C_100218_am.field_103115_N
		// @09E: iload #6
		// @0A0: ifeq @10B
		// @0A3: goto @0A7
		// @0A6: athrow
		// @0A7: bipush 7 (0x07)
		// @0A9: putstatic int game.C_100218_am.field_103115_N
		// @0AC: iload #6
		// @0AE: ifeq @10B
		// @0B1: goto @0B5
		// @0B4: athrow
		// @0B5: bipush 9 (0x09)
		// @0B7: putstatic int game.C_100218_am.field_103115_N
		// @0BA: iload #6
		// @0BC: ifeq @10B
		// @0BF: goto @0C3
		// @0C2: athrow
		// @0C3: iconst_0
		// @0C4: istore_3
		// @0C5: bipush 10 (0x0A)
		// @0C7: getstatic int game.C_100194_rd.field_103072_v
		// @0CA: iconst_m1
		// @0CB: iadd
		// @0CC: imul
		// @0CD: istore #4
		// @0CF: iconst_0
		// @0D0: istore #5
		// @0D2: iload #5
		// @0D4: getstatic int[] game.C_100275_na.field_103087_l
		// @0D7: getstatic int game.C_100194_rd.field_103072_v
		// @0DA: iaload
		// @0DB: if_icmpge @107
		// @0DE: iload #5
		// @0E0: iconst_m1
		// @0E1: ixor
		// @0E2: getstatic int game.C_100197_ra.field_100867_r
		// @0E5: iconst_m1
		// @0E6: ixor
		// @0E7: iload #6
		// @0E9: ifne @13B
		// @0EC: if_icmpeq @0FF
		// @0EF: goto @0F3
		// @0F2: athrow
		// @0F3: iload_3
		// @0F4: getstatic int[] game.C_100164_se.field_105454_a
		// @0F7: iload #4
		// @0F9: iload #5
		// @0FB: iadd
		// @0FC: iaload
		// @0FD: iadd
		// @0FE: istore_3
		// @0FF: iinc #5 +1
		// @102: iload #6
		// @104: ifeq @0D2
		// @107: iload_3
		// @108: putstatic int game.C_100223_ab.field_106100_b
		// @10B: iload_0
		// @10C: ifeq @117
		// @10F: iconst_0
		// @110: putstatic boolean game.C_100004_gb.field_103578_i
		// @113: goto @117
		// @116: athrow
		// @117: iload_2
		// @118: ifne @11F
		// @11B: goto @141
		// @11E: athrow
		// @11F: bipush 84 (0x54)
		// @121: invokestatic game.C_100288_jn.func_106838_b(int)boolean
		// @124: ifne @136
		// @127: getstatic java.lang.String game.C_100125_tm.field_100749_m
		// @12A: putstatic java.lang.String game.C_100129_tg.field_102743_Db
		// @12D: iload #6
		// @12F: ifeq @141
		// @132: goto @136
		// @135: athrow
		// @136: iload_1
		// @137: istore_3
		// @138: iload_3
		// @139: bipush -3 (0xFD)
		// @13B: bipush -120 (0x88)
		// @13D: iconst_0
		// @13E: invokestatic game.C_100213_ak.func_105991_a(boolean, int, int, int)void
		// @141: goto @177
		// @144: astore_3
		// @145: aload_3
		// @146: new java.lang.StringBuilder
		// @149: dup
		// @14A: invokespecial java.lang.StringBuilder.<init>()void
		// @14D: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @150: iconst_0
		// @151: aaload
		// @152: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @155: iload_0
		// @156: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @159: bipush 44 (0x2C)
		// @15B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @15E: iload_1
		// @15F: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @162: bipush 44 (0x2C)
		// @164: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @167: iload_2
		// @168: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @16B: bipush 41 (0x29)
		// @16D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @170: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @173: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @176: athrow
		// @177: return
	}
	
	private final Socket func_103563_a(int arg0, int arg1, String arg2, String arg3) throws IOException
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #12
		// @005: new java.net.Socket
		// @008: dup
		// @009: aload_3
		// @00A: iload_1
		// @00B: invokespecial java.net.Socket.<init>(java.lang.String, int)void
		// @00E: astore #5
		// @010: aload #5
		// @012: sipush 10000 (0x2710)
		// @015: invokevirtual java.net.Socket.setSoTimeout(int)void
		// @018: aload #5
		// @01A: invokevirtual java.net.Socket.getOutputStream()java.io.OutputStream
		// @01D: astore #6
		// @01F: aconst_null
		// @020: aload #4
		// @022: if_acmpeq @07C
		// @025: aload #6
		// @027: new java.lang.StringBuilder
		// @02A: dup
		// @02B: invokespecial java.lang.StringBuilder.<init>()void
		// @02E: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @031: bipush 19 (0x13)
		// @033: aaload
		// @034: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @037: aload_0
		// @038: getfield java.lang.String game.C_100004_gb.field_103561_a
		// @03B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @03E: ldc ":"
		// @040: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @043: aload_0
		// @044: getfield int game.C_100004_gb.field_103557_d
		// @047: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @04A: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @04D: bipush 14 (0x0E)
		// @04F: aaload
		// @050: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @053: aload #4
		// @055: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @058: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @05B: bipush 15 (0x0F)
		// @05D: aaload
		// @05E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @061: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @064: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @067: bipush 17 (0x11)
		// @069: aaload
		// @06A: invokestatic java.nio.charset.Charset.forName(java.lang.String)java.nio.charset.Charset
		// @06D: invokevirtual java.lang.String.getBytes(java.nio.charset.Charset)byte[]
		// @070: invokevirtual java.io.OutputStream.write(byte[])void
		// @073: iload #12
		// @075: ifeq @0C0
		// @078: goto @07C
		// @07B: athrow
		// @07C: aload #6
		// @07E: new java.lang.StringBuilder
		// @081: dup
		// @082: invokespecial java.lang.StringBuilder.<init>()void
		// @085: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @088: bipush 19 (0x13)
		// @08A: aaload
		// @08B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @08E: aload_0
		// @08F: getfield java.lang.String game.C_100004_gb.field_103561_a
		// @092: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @095: ldc ":"
		// @097: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @09A: aload_0
		// @09B: getfield int game.C_100004_gb.field_103557_d
		// @09E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0A1: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @0A4: bipush 13 (0x0D)
		// @0A6: aaload
		// @0A7: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0AA: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @0AD: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @0B0: bipush 17 (0x11)
		// @0B2: aaload
		// @0B3: invokestatic java.nio.charset.Charset.forName(java.lang.String)java.nio.charset.Charset
		// @0B6: invokevirtual java.lang.String.getBytes(java.nio.charset.Charset)byte[]
		// @0B9: invokevirtual java.io.OutputStream.write(byte[])void
		// @0BC: goto @0C0
		// @0BF: athrow
		// @0C0: aload #6
		// @0C2: invokevirtual java.io.OutputStream.flush()void
		// @0C5: new java.io.BufferedReader
		// @0C8: dup
		// @0C9: new java.io.InputStreamReader
		// @0CC: dup
		// @0CD: aload #5
		// @0CF: invokevirtual java.net.Socket.getInputStream()java.io.InputStream
		// @0D2: invokespecial java.io.InputStreamReader.<init>(java.io.InputStream)void
		// @0D5: invokespecial java.io.BufferedReader.<init>(java.io.Reader)void
		// @0D8: astore #7
		// @0DA: aload #7
		// @0DC: invokevirtual java.io.BufferedReader.readLine()java.lang.String
		// @0DF: astore #8
		// @0E1: aload #8
		// @0E3: ifnonnull @0EA
		// @0E6: goto @1AF
		// @0E9: athrow
		// @0EA: aload #8
		// @0EC: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @0EF: bipush 21 (0x15)
		// @0F1: aaload
		// @0F2: invokevirtual java.lang.String.startsWith(java.lang.String)boolean
		// @0F5: ifne @10A
		// @0F8: aload #8
		// @0FA: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @0FD: bipush 20 (0x14)
		// @0FF: aaload
		// @100: invokevirtual java.lang.String.startsWith(java.lang.String)boolean
		// @103: ifeq @10D
		// @106: goto @10A
		// @109: athrow
		// @10A: aload #5
		// @10C: areturn
		// @10D: aload #8
		// @10F: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @112: bipush 18 (0x12)
		// @114: aaload
		// @115: invokevirtual java.lang.String.startsWith(java.lang.String)boolean
		// @118: ifne @12D
		// @11B: aload #8
		// @11D: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @120: bipush 11 (0x0B)
		// @122: aaload
		// @123: invokevirtual java.lang.String.startsWith(java.lang.String)boolean
		// @126: ifeq @1AF
		// @129: goto @12D
		// @12C: athrow
		// @12D: iconst_0
		// @12E: istore #9
		// @130: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @133: bipush 16 (0x10)
		// @135: aaload
		// @136: astore #10
		// @138: aload #7
		// @13A: invokevirtual java.io.BufferedReader.readLine()java.lang.String
		// @13D: astore #8
		// @13F: aload #8
		// @141: ifnull @1A5
		// @144: iload #9
		// @146: iconst_m1
		// @147: ixor
		// @148: bipush -51 (0xCD)
		// @14A: if_icmple @1A5
		// @14D: aload #8
		// @14F: invokevirtual java.lang.String.toLowerCase()java.lang.String
		// @152: aload #10
		// @154: invokevirtual java.lang.String.startsWith(java.lang.String)boolean
		// @157: ifne @162
		// @15A: goto @15E
		// @15D: athrow
		// @15E: goto @196
		// @161: athrow
		// @162: aload #8
		// @164: aload #10
		// @166: invokevirtual java.lang.String.length()int
		// @169: invokevirtual java.lang.String.substring(int)java.lang.String
		// @16C: invokevirtual java.lang.String.trim()java.lang.String
		// @16F: astore #8
		// @171: aload #8
		// @173: bipush 32 (0x20)
		// @175: invokevirtual java.lang.String.indexOf(int)int
		// @178: istore #11
		// @17A: iconst_0
		// @17B: iload #11
		// @17D: iconst_m1
		// @17E: ixor
		// @17F: if_icmpeq @18C
		// @182: aload #8
		// @184: iconst_0
		// @185: iload #11
		// @187: invokevirtual java.lang.String.substring(int, int)java.lang.String
		// @18A: astore #8
		// @18C: new game.C_100257_ln
		// @18F: dup
		// @190: aload #8
		// @192: invokespecial game.C_100257_ln.<init>(java.lang.String)void
		// @195: athrow
		// @196: iinc #9 +1
		// @199: aload #7
		// @19B: invokevirtual java.io.BufferedReader.readLine()java.lang.String
		// @19E: astore #8
		// @1A0: iload #12
		// @1A2: ifeq @13F
		// @1A5: new game.C_100257_ln
		// @1A8: dup
		// @1A9: ldc ""
		// @1AB: invokespecial game.C_100257_ln.<init>(java.lang.String)void
		// @1AE: athrow
		// @1AF: aload #6
		// @1B1: invokevirtual java.io.OutputStream.close()void
		// @1B4: aload #7
		// @1B6: invokevirtual java.io.BufferedReader.close()void
		// @1B9: aload #5
		// @1BB: invokevirtual java.net.Socket.close()void
		// @1BE: iload_2
		// @1BF: sipush 23518 (0x5BDE)
		// @1C2: if_icmpeq @1CF
		// @1C5: iconst_1
		// @1C6: iconst_0
		// @1C7: iconst_0
		// @1C8: invokestatic game.C_100004_gb.func_103565_a(boolean, boolean, boolean)void
		// @1CB: goto @1CF
		// @1CE: athrow
		// @1CF: aconst_null
		// @1D0: areturn
		// @1D1: astore #5
		// @1D3: aload #5
		// @1D5: new java.lang.StringBuilder
		// @1D8: dup
		// @1D9: invokespecial java.lang.StringBuilder.<init>()void
		// @1DC: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @1DF: bipush 12 (0x0C)
		// @1E1: aaload
		// @1E2: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1E5: iload_1
		// @1E6: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1E9: bipush 44 (0x2C)
		// @1EB: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1EE: iload_2
		// @1EF: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1F2: bipush 44 (0x2C)
		// @1F4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1F7: aload_3
		// @1F8: ifnull @205
		// @1FB: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @1FE: bipush 8 (0x08)
		// @200: aaload
		// @201: goto @20B
		// @204: athrow
		// @205: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @208: bipush 9 (0x09)
		// @20A: aaload
		// @20B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @20E: bipush 44 (0x2C)
		// @210: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @213: aload #4
		// @215: ifnull @222
		// @218: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @21B: bipush 8 (0x08)
		// @21D: aaload
		// @21E: goto @228
		// @221: athrow
		// @222: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @225: bipush 9 (0x09)
		// @227: aaload
		// @228: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @22B: bipush 41 (0x29)
		// @22D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @230: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @233: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @236: athrow
	}
	
	public static void func_103566_c(int arg0)
	{
		// @00: iload_0
		// @01: bipush 62 (0x3E)
		// @03: if_icmpge @07
		// @06: return
		// @07: aconst_null
		// @08: putstatic game.C_100210_qa game.C_100004_gb.field_103576_k
		// @0B: aconst_null
		// @0C: putstatic int[] game.C_100004_gb.field_103574_j
		// @0F: aconst_null
		// @10: putstatic game.C_100037_wb[] game.C_100004_gb.field_103577_h
		// @13: goto @38
		// @16: astore_1
		// @17: aload_1
		// @18: new java.lang.StringBuilder
		// @1B: dup
		// @1C: invokespecial java.lang.StringBuilder.<init>()void
		// @1F: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @22: bipush 23 (0x17)
		// @24: aaload
		// @25: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @28: iload_0
		// @29: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2C: bipush 41 (0x29)
		// @2E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @31: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @34: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @37: athrow
		// @38: return
	}
	
	private final Socket func_103568_a(boolean arg0, Proxy arg1) throws IOException
	{
		// @000: aload_2
		// @001: invokevirtual java.net.Proxy.type()java.net.Proxy$Type
		// @004: getstatic java.net.Proxy$Type java.net.Proxy$Type.DIRECT
		// @007: if_acmpne @013
		// @00A: aload_0
		// @00B: sipush 9640 (0x25A8)
		// @00E: invokevirtual game.C_100004_gb.func_103551_a(int)java.net.Socket
		// @011: areturn
		// @012: athrow
		// @013: aload_2
		// @014: invokevirtual java.net.Proxy.address()java.net.SocketAddress
		// @017: astore_3
		// @018: aload_3
		// @019: instanceof java.net.InetSocketAddress
		// @01C: ifne @021
		// @01F: aconst_null
		// @020: areturn
		// @021: iload_1
		// @022: ifeq @03F
		// @025: bipush 99 (0x63)
		// @027: aconst_null
		// @028: checkcast game.C_100098_h
		// @02B: aconst_null
		// @02C: checkcast game.C_100098_h
		// @02F: aconst_null
		// @030: checkcast java.lang.String
		// @033: aconst_null
		// @034: checkcast java.lang.String
		// @037: invokestatic game.C_100004_gb.func_103564_a(int, game.C_100098_h, game.C_100098_h, java.lang.String, java.lang.String)game.C_100317_lb
		// @03A: pop
		// @03B: goto @03F
		// @03E: athrow
		// @03F: aload_3
		// @040: checkcast java.net.InetSocketAddress
		// @043: astore #4
		// @045: aload_2
		// @046: invokevirtual java.net.Proxy.type()java.net.Proxy$Type
		// @049: getstatic java.net.Proxy$Type java.net.Proxy$Type.HTTP
		// @04C: if_acmpne @197
		// @04F: aconst_null
		// @050: astore #5
		// @052: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @055: bipush 30 (0x1E)
		// @057: aaload
		// @058: invokestatic java.lang.Class.forName(java.lang.String)java.lang.Class
		// @05B: astore #6
		// @05D: aload #6
		// @05F: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @062: bipush 25 (0x19)
		// @064: aaload
		// @065: iconst_2
		// @066: anewarray java.lang.Class
		// @069: dup
		// @06A: iconst_0
		// @06B: ldc Class<java.lang.String>
		// @06D: aastore
		// @06E: dup
		// @06F: iconst_1
		// @070: getstatic java.lang.Class java.lang.Integer.TYPE
		// @073: aastore
		// @074: invokevirtual java.lang.Class.getDeclaredMethod(java.lang.String, java.lang.Class[])java.lang.reflect.Method
		// @077: astore #7
		// @079: aload #7
		// @07B: iconst_1
		// @07C: invokevirtual java.lang.reflect.Method.setAccessible(boolean)void
		// @07F: aload #7
		// @081: aconst_null
		// @082: iconst_2
		// @083: anewarray java.lang.Object
		// @086: dup
		// @087: iconst_0
		// @088: aload #4
		// @08A: invokevirtual java.net.InetSocketAddress.getHostName()java.lang.String
		// @08D: aastore
		// @08E: dup
		// @08F: iconst_1
		// @090: new java.lang.Integer
		// @093: dup
		// @094: aload #4
		// @096: invokevirtual java.net.InetSocketAddress.getPort()int
		// @099: invokespecial java.lang.Integer.<init>(int)void
		// @09C: aastore
		// @09D: invokevirtual java.lang.reflect.Method.invoke(java.lang.Object, java.lang.Object[])java.lang.Object
		// @0A0: astore #8
		// @0A2: aload #8
		// @0A4: ifnonnull @0AB
		// @0A7: goto @17E
		// @0AA: athrow
		// @0AB: aload #6
		// @0AD: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @0B0: bipush 26 (0x1A)
		// @0B2: aaload
		// @0B3: iconst_0
		// @0B4: anewarray java.lang.Class
		// @0B7: invokevirtual java.lang.Class.getDeclaredMethod(java.lang.String, java.lang.Class[])java.lang.reflect.Method
		// @0BA: astore #9
		// @0BC: aload #9
		// @0BE: iconst_1
		// @0BF: invokevirtual java.lang.reflect.Method.setAccessible(boolean)void
		// @0C2: aload #9
		// @0C4: aload #8
		// @0C6: iconst_0
		// @0C7: anewarray java.lang.Object
		// @0CA: invokevirtual java.lang.reflect.Method.invoke(java.lang.Object, java.lang.Object[])java.lang.Object
		// @0CD: checkcast java.lang.Boolean
		// @0D0: invokevirtual java.lang.Boolean.booleanValue()boolean
		// @0D3: ifeq @17E
		// @0D6: aload #6
		// @0D8: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @0DB: bipush 29 (0x1D)
		// @0DD: aaload
		// @0DE: iconst_0
		// @0DF: anewarray java.lang.Class
		// @0E2: invokevirtual java.lang.Class.getDeclaredMethod(java.lang.String, java.lang.Class[])java.lang.reflect.Method
		// @0E5: astore #10
		// @0E7: aload #10
		// @0E9: iconst_1
		// @0EA: invokevirtual java.lang.reflect.Method.setAccessible(boolean)void
		// @0ED: aload #6
		// @0EF: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @0F2: bipush 27 (0x1B)
		// @0F4: aaload
		// @0F5: iconst_2
		// @0F6: anewarray java.lang.Class
		// @0F9: dup
		// @0FA: iconst_0
		// @0FB: ldc Class<java.net.URL>
		// @0FD: aastore
		// @0FE: dup
		// @0FF: iconst_1
		// @100: ldc Class<java.lang.String>
		// @102: aastore
		// @103: invokevirtual java.lang.Class.getDeclaredMethod(java.lang.String, java.lang.Class[])java.lang.reflect.Method
		// @106: astore #11
		// @108: aload #11
		// @10A: iconst_1
		// @10B: invokevirtual java.lang.reflect.Method.setAccessible(boolean)void
		// @10E: aload #10
		// @110: aload #8
		// @112: iconst_0
		// @113: anewarray java.lang.Object
		// @116: invokevirtual java.lang.reflect.Method.invoke(java.lang.Object, java.lang.Object[])java.lang.Object
		// @119: checkcast java.lang.String
		// @11C: astore #12
		// @11E: aload #11
		// @120: aload #8
		// @122: iconst_2
		// @123: anewarray java.lang.Object
		// @126: dup
		// @127: iconst_0
		// @128: new java.net.URL
		// @12B: dup
		// @12C: new java.lang.StringBuilder
		// @12F: dup
		// @130: invokespecial java.lang.StringBuilder.<init>()void
		// @133: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @136: bipush 31 (0x1F)
		// @138: aaload
		// @139: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @13C: aload_0
		// @13D: getfield java.lang.String game.C_100004_gb.field_103561_a
		// @140: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @143: ldc "/"
		// @145: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @148: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @14B: invokespecial java.net.URL.<init>(java.lang.String)void
		// @14E: aastore
		// @14F: dup
		// @150: iconst_1
		// @151: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @154: iconst_3
		// @155: aaload
		// @156: aastore
		// @157: invokevirtual java.lang.reflect.Method.invoke(java.lang.Object, java.lang.Object[])java.lang.Object
		// @15A: checkcast java.lang.String
		// @15D: astore #13
		// @15F: new java.lang.StringBuilder
		// @162: dup
		// @163: invokespecial java.lang.StringBuilder.<init>()void
		// @166: aload #12
		// @168: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @16B: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @16E: bipush 28 (0x1C)
		// @170: aaload
		// @171: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @174: aload #13
		// @176: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @179: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @17C: astore #5
		// @17E: goto @183
		// @181: astore #6
		// @183: aload_0
		// @184: aload #4
		// @186: invokevirtual java.net.InetSocketAddress.getPort()int
		// @189: sipush 23518 (0x5BDE)
		// @18C: aload #4
		// @18E: invokevirtual java.net.InetSocketAddress.getHostName()java.lang.String
		// @191: aload #5
		// @193: invokespecial game.C_100004_gb.func_103563_a(int, int, java.lang.String, java.lang.String)java.net.Socket
		// @196: areturn
		// @197: aload_2
		// @198: invokevirtual java.net.Proxy.type()java.net.Proxy$Type
		// @19B: getstatic java.net.Proxy$Type java.net.Proxy$Type.SOCKS
		// @19E: if_acmpne @1C2
		// @1A1: new java.net.Socket
		// @1A4: dup
		// @1A5: aload_2
		// @1A6: invokespecial java.net.Socket.<init>(java.net.Proxy)void
		// @1A9: astore #5
		// @1AB: aload #5
		// @1AD: new java.net.InetSocketAddress
		// @1B0: dup
		// @1B1: aload_0
		// @1B2: getfield java.lang.String game.C_100004_gb.field_103561_a
		// @1B5: aload_0
		// @1B6: getfield int game.C_100004_gb.field_103557_d
		// @1B9: invokespecial java.net.InetSocketAddress.<init>(java.lang.String, int)void
		// @1BC: invokevirtual java.net.Socket.connect(java.net.SocketAddress)void
		// @1BF: aload #5
		// @1C1: areturn
		// @1C2: aconst_null
		// @1C3: areturn
		// @1C4: astore_3
		// @1C5: aload_3
		// @1C6: new java.lang.StringBuilder
		// @1C9: dup
		// @1CA: invokespecial java.lang.StringBuilder.<init>()void
		// @1CD: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @1D0: bipush 24 (0x18)
		// @1D2: aaload
		// @1D3: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1D6: iload_1
		// @1D7: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @1DA: bipush 44 (0x2C)
		// @1DC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1DF: aload_2
		// @1E0: ifnull @1ED
		// @1E3: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @1E6: bipush 8 (0x08)
		// @1E8: aaload
		// @1E9: goto @1F3
		// @1EC: athrow
		// @1ED: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @1F0: bipush 9 (0x09)
		// @1F2: aaload
		// @1F3: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1F6: bipush 41 (0x29)
		// @1F8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1FB: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @1FE: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @201: athrow
	}
	
	final Socket func_103555_b(int arg0) throws IOException
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #13
		// @005: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @008: bipush 7 (0x07)
		// @00A: aaload
		// @00B: invokestatic java.lang.System.getProperty(java.lang.String)java.lang.String
		// @00E: invokestatic java.lang.Boolean.parseBoolean(java.lang.String)boolean
		// @011: istore_2
		// @012: iload_2
		// @013: ifne @029
		// @016: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @019: bipush 7 (0x07)
		// @01B: aaload
		// @01C: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @01F: iconst_4
		// @020: aaload
		// @021: invokestatic java.lang.System.setProperty(java.lang.String, java.lang.String)java.lang.String
		// @024: pop
		// @025: goto @029
		// @028: athrow
		// @029: sipush 443 (0x01BB)
		// @02C: aload_0
		// @02D: getfield int game.C_100004_gb.field_103557_d
		// @030: if_icmpne @038
		// @033: iconst_1
		// @034: goto @039
		// @037: athrow
		// @038: iconst_0
		// @039: istore #5
		// @03B: aload_0
		// @03C: getfield java.net.ProxySelector game.C_100004_gb.field_103572_g
		// @03F: new java.net.URI
		// @042: dup
		// @043: new java.lang.StringBuilder
		// @046: dup
		// @047: invokespecial java.lang.StringBuilder.<init>()void
		// @04A: iload #5
		// @04C: ifeq @058
		// @04F: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @052: iconst_3
		// @053: aaload
		// @054: goto @05D
		// @057: athrow
		// @058: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @05B: iconst_5
		// @05C: aaload
		// @05D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @060: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @063: iconst_2
		// @064: aaload
		// @065: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @068: aload_0
		// @069: getfield java.lang.String game.C_100004_gb.field_103561_a
		// @06C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @06F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @072: invokespecial java.net.URI.<init>(java.lang.String)void
		// @075: invokevirtual java.net.ProxySelector.select(java.net.URI)java.util.List
		// @078: astore_3
		// @079: aload_0
		// @07A: getfield java.net.ProxySelector game.C_100004_gb.field_103572_g
		// @07D: new java.net.URI
		// @080: dup
		// @081: new java.lang.StringBuilder
		// @084: dup
		// @085: invokespecial java.lang.StringBuilder.<init>()void
		// @088: iload #5
		// @08A: ifeq @096
		// @08D: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @090: iconst_5
		// @091: aaload
		// @092: goto @09B
		// @095: athrow
		// @096: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @099: iconst_3
		// @09A: aaload
		// @09B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @09E: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @0A1: iconst_2
		// @0A2: aaload
		// @0A3: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0A6: aload_0
		// @0A7: getfield java.lang.String game.C_100004_gb.field_103561_a
		// @0AA: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0AD: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @0B0: invokespecial java.net.URI.<init>(java.lang.String)void
		// @0B3: invokevirtual java.net.ProxySelector.select(java.net.URI)java.util.List
		// @0B6: astore #4
		// @0B8: goto @0C5
		// @0BB: astore #6
		// @0BD: aload_0
		// @0BE: sipush 9640 (0x25A8)
		// @0C1: invokevirtual game.C_100004_gb.func_103551_a(int)java.net.Socket
		// @0C4: areturn
		// @0C5: aload_3
		// @0C6: aload #4
		// @0C8: invokeinterface java.util.List.addAll(java.util.Collection)boolean
		// @0CD: pop
		// @0CE: aload_3
		// @0CF: invokeinterface java.util.List.toArray()java.lang.Object[]
		// @0D4: astore #6
		// @0D6: aconst_null
		// @0D7: astore #7
		// @0D9: aload #6
		// @0DB: astore #8
		// @0DD: iload_1
		// @0DE: istore #9
		// @0E0: aload #8
		// @0E2: arraylength
		// @0E3: iconst_m1
		// @0E4: ixor
		// @0E5: iload #9
		// @0E7: iconst_m1
		// @0E8: ixor
		// @0E9: if_icmpge @12A
		// @0EC: aload #8
		// @0EE: iload #9
		// @0F0: aaload
		// @0F1: astore #10
		// @0F3: aload #10
		// @0F5: checkcast java.net.Proxy
		// @0F8: astore #11
		// @0FA: aload_0
		// @0FB: iconst_0
		// @0FC: aload #11
		// @0FE: invokespecial game.C_100004_gb.func_103568_a(boolean, java.net.Proxy)java.net.Socket
		// @101: astore #12
		// @103: aload #12
		// @105: iload #13
		// @107: ifne @13C
		// @10A: ifnull @114
		// @10D: goto @111
		// @110: athrow
		// @111: aload #12
		// @113: areturn
		// @114: goto @122
		// @117: astore #12
		// @119: aload #12
		// @11B: astore #7
		// @11D: goto @122
		// @120: astore #12
		// @122: iinc #9 +1
		// @125: iload #13
		// @127: ifeq @0E0
		// @12A: aload #7
		// @12C: ifnull @133
		// @12F: aload #7
		// @131: athrow
		// @132: athrow
		// @133: aload_0
		// @134: iload_1
		// @135: sipush 9640 (0x25A8)
		// @138: iadd
		// @139: invokevirtual game.C_100004_gb.func_103551_a(int)java.net.Socket
		// @13C: areturn
		// @13D: astore_2
		// @13E: aload_2
		// @13F: new java.lang.StringBuilder
		// @142: dup
		// @143: invokespecial java.lang.StringBuilder.<init>()void
		// @146: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @149: bipush 6 (0x06)
		// @14B: aaload
		// @14C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @14F: iload_1
		// @150: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @153: bipush 41 (0x29)
		// @155: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @158: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @15B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @15E: athrow
	}
	
	static final C_100317_lb func_103564_a(int arg0, C_100098_h arg1, C_100098_h arg2, String arg3, String arg4)
	{
		// @00: iload_0
		// @01: bipush 73 (0x49)
		// @03: if_icmpgt @11
		// @06: aconst_null
		// @07: checkcast game.C_100210_qa
		// @0A: putstatic game.C_100210_qa game.C_100004_gb.field_103576_k
		// @0D: goto @11
		// @10: athrow
		// @11: aload_2
		// @12: sipush -10719 (0xD621)
		// @15: aload_3
		// @16: invokevirtual game.C_100098_h.func_104601_b(int, java.lang.String)int
		// @19: istore #5
		// @1B: aload_2
		// @1C: aload #4
		// @1E: iload #5
		// @20: iconst_0
		// @21: invokevirtual game.C_100098_h.func_104600_a(java.lang.String, int, int)int
		// @24: istore #6
		// @26: iload #6
		// @28: ldc 1073741823 (0x3fffffff)
		// @2A: aload_1
		// @2B: aload_2
		// @2C: iload #5
		// @2E: invokestatic game.C_100273_mm.func_106675_a(int, int, game.C_100098_h, game.C_100098_h, int)game.C_100317_lb
		// @31: areturn
		// @32: astore #5
		// @34: aload #5
		// @36: new java.lang.StringBuilder
		// @39: dup
		// @3A: invokespecial java.lang.StringBuilder.<init>()void
		// @3D: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @40: bipush 10 (0x0A)
		// @42: aaload
		// @43: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @46: iload_0
		// @47: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4A: bipush 44 (0x2C)
		// @4C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4F: aload_1
		// @50: ifnull @5D
		// @53: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @56: bipush 8 (0x08)
		// @58: aaload
		// @59: goto @63
		// @5C: athrow
		// @5D: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @60: bipush 9 (0x09)
		// @62: aaload
		// @63: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @66: bipush 44 (0x2C)
		// @68: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6B: aload_2
		// @6C: ifnull @79
		// @6F: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @72: bipush 8 (0x08)
		// @74: aaload
		// @75: goto @7F
		// @78: athrow
		// @79: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @7C: bipush 9 (0x09)
		// @7E: aaload
		// @7F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @82: bipush 44 (0x2C)
		// @84: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @87: aload_3
		// @88: ifnull @95
		// @8B: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @8E: bipush 8 (0x08)
		// @90: aaload
		// @91: goto @9B
		// @94: athrow
		// @95: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @98: bipush 9 (0x09)
		// @9A: aaload
		// @9B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @9E: bipush 44 (0x2C)
		// @A0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A3: aload #4
		// @A5: ifnull @B2
		// @A8: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @AB: bipush 8 (0x08)
		// @AD: aaload
		// @AE: goto @B8
		// @B1: athrow
		// @B2: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @B5: bipush 9 (0x09)
		// @B7: aaload
		// @B8: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @BB: bipush 41 (0x29)
		// @BD: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C0: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @C3: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @C6: athrow
	}
	
	C_100004_gb()
	{
		// @00: aload_0
		// @01: invokespecial game.C_100157_db.<init>()void
		// @04: aload_0
		// @05: invokestatic java.net.ProxySelector.getDefault()java.net.ProxySelector
		// @08: putfield java.net.ProxySelector game.C_100004_gb.field_103572_g
		// @0B: goto @19
		// @0E: astore_1
		// @0F: aload_1
		// @10: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @13: iconst_1
		// @14: aaload
		// @15: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @18: athrow
		// @19: return
	}
	
	static final boolean func_103571_a(byte arg0, String arg1)
	{
		// @00: iload_0
		// @01: bipush -66 (0xBE)
		// @03: if_icmpeq @11
		// @06: aconst_null
		// @07: checkcast game.C_100037_wb[]
		// @0A: putstatic game.C_100037_wb[] game.C_100004_gb.field_103577_h
		// @0D: goto @11
		// @10: athrow
		// @11: aconst_null
		// @12: getstatic java.lang.String game.C_100137_bn.field_105033_d
		// @15: if_acmpne @1A
		// @18: iconst_0
		// @19: ireturn
		// @1A: iconst_0
		// @1B: aload_1
		// @1C: invokevirtual java.lang.String.toLowerCase()java.lang.String
		// @1F: getstatic java.lang.String game.C_100137_bn.field_105033_d
		// @22: invokevirtual java.lang.String.toLowerCase()java.lang.String
		// @25: invokevirtual java.lang.String.indexOf(java.lang.String)int
		// @28: if_icmpgt @30
		// @2B: iconst_1
		// @2C: goto @31
		// @2F: athrow
		// @30: iconst_0
		// @31: ireturn
		// @32: astore_2
		// @33: aload_2
		// @34: new java.lang.StringBuilder
		// @37: dup
		// @38: invokespecial java.lang.StringBuilder.<init>()void
		// @3B: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @3E: bipush 22 (0x16)
		// @40: aaload
		// @41: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @44: iload_0
		// @45: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @48: bipush 44 (0x2C)
		// @4A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4D: aload_1
		// @4E: ifnull @5B
		// @51: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @54: bipush 8 (0x08)
		// @56: aaload
		// @57: goto @61
		// @5A: athrow
		// @5B: getstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @5E: bipush 9 (0x09)
		// @60: aaload
		// @61: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @64: bipush 41 (0x29)
		// @66: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @69: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @6C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @6F: athrow
	}
	
	static
	{
		// @000: bipush 33 (0x21)
		// @002: anewarray java.lang.String
		// @005: dup
		// @006: iconst_0
		// @007: ldc "O:OUz"
		// @009: invokestatic game.C_100004_gb.func_103570_z(java.lang.String)char[]
		// @00C: invokestatic game.C_100004_gb.func_103567_z(char[])java.lang.String
		// @00F: aastore
		// @010: dup
		// @011: iconst_1
		// @012: ldc "O:O+;F1\u0015)z\u0001"
		// @014: invokestatic game.C_100004_gb.func_103570_z(java.lang.String)char[]
		// @017: invokestatic game.C_100004_gb.func_103567_z(char[])java.lang.String
		// @01A: aastore
		// @01B: dup
		// @01C: iconst_2
		// @01D: ldc "\u0012wN"
		// @01F: invokestatic game.C_100004_gb.func_103570_z(java.lang.String)char[]
		// @022: invokestatic game.C_100004_gb.func_103567_z(char[])java.lang.String
		// @025: aastore
		// @026: dup
		// @027: iconst_3
		// @028: ldc "@,\u0015g!"
		// @02A: invokestatic game.C_100004_gb.func_103570_z(java.lang.String)char[]
		// @02D: invokestatic game.C_100004_gb.func_103567_z(char[])java.lang.String
		// @030: aastore
		// @031: dup
		// @032: iconst_4
		// @033: ldc "\\*\u0014r"
		// @035: invokestatic game.C_100004_gb.func_103570_z(java.lang.String)char[]
		// @038: invokestatic game.C_100004_gb.func_103567_z(char[])java.lang.String
		// @03B: aastore
		// @03C: dup
		// @03D: iconst_5
		// @03E: ldc "@,\u0015g"
		// @040: invokestatic game.C_100004_gb.func_103570_z(java.lang.String)char[]
		// @043: invokestatic game.C_100004_gb.func_103567_z(char[])java.lang.String
		// @046: aastore
		// @047: dup
		// @048: bipush 6 (0x06)
		// @04A: ldc "O:ORz"
		// @04C: invokestatic game.C_100004_gb.func_103570_z(java.lang.String)char[]
		// @04F: invokestatic game.C_100004_gb.func_103567_z(char[])java.lang.String
		// @052: aastore
		// @053: dup
		// @054: bipush 7 (0x07)
		// @056: ldc "B9\u0017v|F=\u00159'[=2n!\\=\u000cG G \u0008r!"
		// @058: invokestatic game.C_100004_gb.func_103570_z(java.lang.String)char[]
		// @05B: invokestatic game.C_100004_gb.func_103567_z(char[])java.lang.String
		// @05E: aastore
		// @05F: dup
		// @060: bipush 8 (0x08)
		// @062: ldc "SvO9/"
		// @064: invokestatic game.C_100004_gb.func_103570_z(java.lang.String)char[]
		// @067: invokestatic game.C_100004_gb.func_103567_z(char[])java.lang.String
		// @06A: aastore
		// @06B: dup
		// @06C: bipush 9 (0x09)
		// @06E: ldc "F-\r{"
		// @070: invokestatic game.C_100004_gb.func_103570_z(java.lang.String)char[]
		// @073: invokestatic game.C_100004_gb.func_103567_z(char[])java.lang.String
		// @076: aastore
		// @077: dup
		// @078: bipush 10 (0x0A)
		// @07A: ldc "O:OTz"
		// @07C: invokestatic game.C_100004_gb.func_103570_z(java.lang.String)char[]
		// @07F: invokestatic game.C_100004_gb.func_103567_z(char[])java.lang.String
		// @082: aastore
		// @083: dup
		// @084: bipush 11 (0x0B)
		// @086: ldc "`\u000c5G}\u0019vP7f\u0018o"
		// @088: invokestatic game.C_100004_gb.func_103570_z(java.lang.String)char[]
		// @08B: invokestatic game.C_100004_gb.func_103567_z(char[])java.lang.String
		// @08E: aastore
		// @08F: dup
		// @090: bipush 12 (0x0C)
		// @092: ldc "O:OSz"
		// @094: invokestatic game.C_100004_gb.func_103570_z(java.lang.String)char[]
		// @097: invokestatic game.C_100004_gb.func_103567_z(char[])java.lang.String
		// @09A: aastore
		// @09B: dup
		// @09C: bipush 13 (0x0D)
		// @09E: ldc "\u0008\u00105C\u0002\u0007iO'X\""
		// @0A0: invokestatic game.C_100004_gb.func_103570_z(java.lang.String)char[]
		// @0A3: invokestatic game.C_100004_gb.func_103567_z(char[])java.lang.String
		// @0A6: aastore
		// @0A7: dup
		// @0A8: bipush 14 (0x0E)
		// @0AA: ldc "\u0008\u00105C\u0002\u0007iO'X"
		// @0AC: invokestatic game.C_100004_gb.func_103570_z(java.lang.String)char[]
		// @0AF: invokestatic game.C_100004_gb.func_103567_z(char[])java.lang.String
		// @0B2: aastore
		// @0B3: dup
		// @0B4: bipush 15 (0x0F)
		// @0B6: ldc "\"R"
		// @0B8: invokestatic game.C_100004_gb.func_103570_z(java.lang.String)char[]
		// @0BB: invokestatic game.C_100004_gb.func_103567_z(char[])java.lang.String
		// @0BE: aastore
		// @0BF: dup
		// @0C0: bipush 16 (0x10)
		// @0C2: ldc "X*\u000eo+\u00059\u0014c:M6\u0015~1I,\u0004-r"
		// @0C4: invokestatic game.C_100004_gb.func_103570_z(java.lang.String)char[]
		// @0C7: invokestatic game.C_100004_gb.func_103567_z(char[])java.lang.String
		// @0CA: aastore
		// @0CB: dup
		// @0CC: bipush 17 (0x11)
		// @0CE: ldc "a\u000b.:j\u0010mX:c"
		// @0D0: invokestatic game.C_100004_gb.func_103570_z(java.lang.String)char[]
		// @0D3: invokestatic game.C_100004_gb.func_103567_z(char[])java.lang.String
		// @0D6: aastore
		// @0D7: dup
		// @0D8: bipush 18 (0x12)
		// @0DA: ldc "`\u000c5G}\u0019vQ7f\u0018o"
		// @0DC: invokestatic game.C_100004_gb.func_103570_z(java.lang.String)char[]
		// @0DF: invokestatic game.C_100004_gb.func_103567_z(char[])java.lang.String
		// @0E2: aastore
		// @0E3: dup
		// @0E4: bipush 19 (0x13)
		// @0E6: ldc "k\u0017/Y\u0017k\u000cA"
		// @0E8: invokestatic game.C_100004_gb.func_103570_z(java.lang.String)char[]
		// @0EB: invokestatic game.C_100004_gb.func_103567_z(char[])java.lang.String
		// @0EE: aastore
		// @0EF: dup
		// @0F0: bipush 20 (0x14)
		// @0F2: ldc "`\u000c5G}\u0019vP7`\u0018h"
		// @0F4: invokestatic game.C_100004_gb.func_103570_z(java.lang.String)char[]
		// @0F7: invokestatic game.C_100004_gb.func_103567_z(char[])java.lang.String
		// @0FA: aastore
		// @0FB: dup
		// @0FC: bipush 21 (0x15)
		// @0FE: ldc "`\u000c5G}\u0019vQ7`\u0018h"
		// @100: invokestatic game.C_100004_gb.func_103570_z(java.lang.String)char[]
		// @103: invokestatic game.C_100004_gb.func_103567_z(char[])java.lang.String
		// @106: aastore
		// @107: dup
		// @108: bipush 22 (0x16)
		// @10A: ldc "O:OQz"
		// @10C: invokestatic game.C_100004_gb.func_103570_z(java.lang.String)char[]
		// @10F: invokestatic game.C_100004_gb.func_103567_z(char[])java.lang.String
		// @112: aastore
		// @113: dup
		// @114: bipush 23 (0x17)
		// @116: ldc "O:OPz"
		// @118: invokestatic game.C_100004_gb.func_103570_z(java.lang.String)char[]
		// @11B: invokestatic game.C_100004_gb.func_103567_z(char[])java.lang.String
		// @11E: aastore
		// @11F: dup
		// @120: bipush 24 (0x18)
		// @122: ldc "O:OVz"
		// @124: invokestatic game.C_100004_gb.func_103570_z(java.lang.String)char[]
		// @127: invokestatic game.C_100004_gb.func_103567_z(char[])java.lang.String
		// @12A: aastore
		// @12B: dup
		// @12C: bipush 25 (0x19)
		// @12E: ldc "O=\u0015G G \u0018V'\\0"
		// @130: invokestatic game.C_100004_gb.func_103570_z(java.lang.String)char[]
		// @133: invokestatic game.C_100004_gb.func_103567_z(char[])java.lang.String
		// @136: aastore
		// @137: dup
		// @138: bipush 26 (0x1A)
		// @13A: ldc "[-\u0011g=Z,\u0012G M=\u000cg&A.\u0004V'\\0\u000ee;R9\u0015~=F"
		// @13C: invokestatic game.C_100004_gb.func_103570_z(java.lang.String)char[]
		// @13F: invokestatic game.C_100004_gb.func_103567_z(char[])java.lang.String
		// @142: aastore
		// @143: dup
		// @144: bipush 27 (0x1B)
		// @146: ldc "O=\u0015_7I<\u0004e\u0004I4\u0014r"
		// @148: invokestatic game.C_100004_gb.func_103570_z(java.lang.String)char[]
		// @14B: invokestatic game.C_100004_gb.func_103567_z(char[])java.lang.String
		// @14E: aastore
		// @14F: dup
		// @150: bipush 28 (0x1C)
		// @152: ldc "\u0012x"
		// @154: invokestatic game.C_100004_gb.func_103570_z(java.lang.String)char[]
		// @157: invokestatic game.C_100004_gb.func_103567_z(char[])java.lang.String
		// @15A: aastore
		// @15B: dup
		// @15C: bipush 29 (0x1D)
		// @15E: ldc "O=\u0015_7I<\u0004e\u001cI5\u0004"
		// @160: invokestatic game.C_100004_gb.func_103570_z(java.lang.String)char[]
		// @163: invokestatic game.C_100004_gb.func_103567_z(char[])java.lang.String
		// @166: aastore
		// @167: dup
		// @168: bipush 30 (0x1E)
		// @16A: ldc "[-\u000f9<M,O`%_v\u0011e=\\7\u0002x>\u00060\u0015c\"\u0006\u0019\u0014c:M6\u0015~1I,\u0008x<a6\u0007x"
		// @16C: invokestatic game.C_100004_gb.func_103570_z(java.lang.String)char[]
		// @16F: invokestatic game.C_100004_gb.func_103567_z(char[])java.lang.String
		// @172: aastore
		// @173: dup
		// @174: bipush 31 (0x1F)
		// @176: ldc "@,\u0015g!\u0012wN"
		// @178: invokestatic game.C_100004_gb.func_103570_z(java.lang.String)char[]
		// @17B: invokestatic game.C_100004_gb.func_103567_z(char[])java.lang.String
		// @17E: aastore
		// @17F: dup
		// @180: bipush 32 (0x20)
		// @182: ldc "O:O_z"
		// @184: invokestatic game.C_100004_gb.func_103570_z(java.lang.String)char[]
		// @187: invokestatic game.C_100004_gb.func_103567_z(char[])java.lang.String
		// @18A: aastore
		// @18B: putstatic java.lang.String[] game.C_100004_gb.field_103575_z
		// @18E: iconst_0
		// @18F: putstatic int game.C_100004_gb.field_103573_l
		// @192: return
	}
	
	private static char[] func_103570_z(String arg0)
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
		// @0E: bipush 82 (0x52)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_103567_z(char[] arg0)
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
		// @30: bipush 40 (0x28)
		// @32: goto @46
		// @35: bipush 88 (0x58)
		// @37: goto @46
		// @3A: bipush 97 (0x61)
		// @3C: goto @46
		// @3F: bipush 23 (0x17)
		// @41: goto @46
		// @44: bipush 82 (0x52)
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
