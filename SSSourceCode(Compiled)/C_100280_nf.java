package game;

import java.math.BigInteger;

class C_100280_nf extends C_100158_da
{
	static String field_101174_r;
	static C_100301_kb field_101183_k;
	static String field_101175_q;
	static String field_101180_m;
	byte[] field_101179_l;
	static C_100113_ek field_101181_j;
	int field_101177_n;
	static C_100128_ca field_101172_t;
	static int[] field_101178_o;
	static C_100302_ka field_101176_p;
	static int field_101173_s;
	private static final String[] field_101182_z;
	
	final boolean func_101150_k(int arg0)
	{
		// @00: aload_0
		// @01: dup
		// @02: getfield int game.C_100280_nf.field_101177_n
		// @05: iconst_4
		// @06: isub
		// @07: putfield int game.C_100280_nf.field_101177_n
		// @0A: aload_0
		// @0B: getfield byte[] game.C_100280_nf.field_101179_l
		// @0E: bipush 30 (0x1E)
		// @10: iconst_0
		// @11: aload_0
		// @12: getfield int game.C_100280_nf.field_101177_n
		// @15: invokestatic game.C_100056_de.func_103179_a(byte[], byte, int, int)int
		// @18: istore_2
		// @19: iload_1
		// @1A: bipush -21 (0xEB)
		// @1C: if_icmple @2A
		// @1F: aconst_null
		// @20: checkcast java.lang.String
		// @23: putstatic java.lang.String game.C_100280_nf.field_101180_m
		// @26: goto @2A
		// @29: athrow
		// @2A: aload_0
		// @2B: sipush -1543 (0xF9F9)
		// @2E: invokevirtual game.C_100280_nf.func_101171_e(int)int
		// @31: istore_3
		// @32: iload_3
		// @33: iconst_m1
		// @34: ixor
		// @35: iload_2
		// @36: iconst_m1
		// @37: ixor
		// @38: if_icmpeq @3F
		// @3B: goto @41
		// @3E: athrow
		// @3F: iconst_1
		// @40: ireturn
		// @41: iconst_0
		// @42: ireturn
		// @43: astore_2
		// @44: aload_2
		// @45: new java.lang.StringBuilder
		// @48: dup
		// @49: invokespecial java.lang.StringBuilder.<init>()void
		// @4C: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @4F: bipush 42 (0x2A)
		// @51: aaload
		// @52: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @55: iload_1
		// @56: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @59: bipush 41 (0x29)
		// @5B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @61: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @64: athrow
	}
	
	final void func_101155_a(String arg0, byte arg1)
	{
		// @00: bipush -15 (0xF1)
		// @02: bipush 22 (0x16)
		// @04: iload_2
		// @05: isub
		// @06: bipush 58 (0x3A)
		// @08: idiv
		// @09: irem
		// @0A: istore_3
		// @0B: aload_1
		// @0C: iconst_0
		// @0D: invokevirtual java.lang.String.indexOf(int)int
		// @10: istore #4
		// @12: iconst_m1
		// @13: iload #4
		// @15: iconst_m1
		// @16: ixor
		// @17: if_icmpge @1E
		// @1A: goto @28
		// @1D: athrow
		// @1E: new java.lang.IllegalArgumentException
		// @21: dup
		// @22: ldc ""
		// @24: invokespecial java.lang.IllegalArgumentException.<init>(java.lang.String)void
		// @27: athrow
		// @28: aload_0
		// @29: getfield byte[] game.C_100280_nf.field_101179_l
		// @2C: aload_0
		// @2D: dup
		// @2E: getfield int game.C_100280_nf.field_101177_n
		// @31: dup_x1
		// @32: iconst_1
		// @33: iadd
		// @34: putfield int game.C_100280_nf.field_101177_n
		// @37: iconst_0
		// @38: bastore
		// @39: aload_0
		// @3A: dup
		// @3B: getfield int game.C_100280_nf.field_101177_n
		// @3E: aload_1
		// @3F: aload_1
		// @40: invokevirtual java.lang.String.length()int
		// @43: aload_0
		// @44: getfield byte[] game.C_100280_nf.field_101179_l
		// @47: iconst_0
		// @48: aload_0
		// @49: getfield int game.C_100280_nf.field_101177_n
		// @4C: bipush 115 (0x73)
		// @4E: invokestatic game.C_100027_hc.func_102587_a(java.lang.CharSequence, int, byte[], int, int, byte)int
		// @51: iadd
		// @52: putfield int game.C_100280_nf.field_101177_n
		// @55: aload_0
		// @56: getfield byte[] game.C_100280_nf.field_101179_l
		// @59: aload_0
		// @5A: dup
		// @5B: getfield int game.C_100280_nf.field_101177_n
		// @5E: dup_x1
		// @5F: iconst_1
		// @60: iadd
		// @61: putfield int game.C_100280_nf.field_101177_n
		// @64: iconst_0
		// @65: bastore
		// @66: goto @A5
		// @69: astore_3
		// @6A: aload_3
		// @6B: new java.lang.StringBuilder
		// @6E: dup
		// @6F: invokespecial java.lang.StringBuilder.<init>()void
		// @72: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @75: bipush 36 (0x24)
		// @77: aaload
		// @78: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @7B: aload_1
		// @7C: ifnull @88
		// @7F: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @82: iconst_1
		// @83: aaload
		// @84: goto @8D
		// @87: athrow
		// @88: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @8B: iconst_2
		// @8C: aaload
		// @8D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @90: bipush 44 (0x2C)
		// @92: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @95: iload_2
		// @96: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @99: bipush 41 (0x29)
		// @9B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @A1: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @A4: athrow
		// @A5: return
	}
	
	final int func_101158_h(int arg0)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #5
		// @05: bipush 118 (0x76)
		// @07: bipush -38 (0xDA)
		// @09: iload_1
		// @0A: isub
		// @0B: bipush 44 (0x2C)
		// @0D: idiv
		// @0E: idiv
		// @0F: istore #4
		// @11: aload_0
		// @12: getfield byte[] game.C_100280_nf.field_101179_l
		// @15: aload_0
		// @16: dup
		// @17: getfield int game.C_100280_nf.field_101177_n
		// @1A: dup_x1
		// @1B: iconst_1
		// @1C: iadd
		// @1D: putfield int game.C_100280_nf.field_101177_n
		// @20: baload
		// @21: istore_2
		// @22: iconst_0
		// @23: istore_3
		// @24: iconst_m1
		// @25: iload_2
		// @26: iconst_m1
		// @27: ixor
		// @28: if_icmpge @50
		// @2B: iload_2
		// @2C: bipush 127 (0x7F)
		// @2E: iand
		// @2F: iload_3
		// @30: ior
		// @31: ldc 280617735 (0x10b9e307)
		// @33: ishl
		// @34: istore_3
		// @35: aload_0
		// @36: getfield byte[] game.C_100280_nf.field_101179_l
		// @39: aload_0
		// @3A: dup
		// @3B: getfield int game.C_100280_nf.field_101177_n
		// @3E: dup_x1
		// @3F: iconst_1
		// @40: iadd
		// @41: putfield int game.C_100280_nf.field_101177_n
		// @44: baload
		// @45: iload #5
		// @47: ifne @53
		// @4A: istore_2
		// @4B: iload #5
		// @4D: ifeq @24
		// @50: iload_2
		// @51: iload_3
		// @52: ior
		// @53: ireturn
		// @54: astore_2
		// @55: aload_2
		// @56: new java.lang.StringBuilder
		// @59: dup
		// @5A: invokespecial java.lang.StringBuilder.<init>()void
		// @5D: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @60: bipush 10 (0x0A)
		// @62: aaload
		// @63: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @66: iload_1
		// @67: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6A: bipush 41 (0x29)
		// @6C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @72: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @75: athrow
	}
	
	final void func_101148_a(String arg0, int arg1)
	{
		// @000: lconst_0
		// @001: lstore_3
		// @002: iload_2
		// @003: bipush 38 (0x26)
		// @005: if_icmpeq @016
		// @008: aload_0
		// @009: bipush -122 (0x86)
		// @00B: aconst_null
		// @00C: checkcast java.lang.String
		// @00F: invokevirtual game.C_100280_nf.func_101167_a(int, java.lang.String)void
		// @012: goto @016
		// @015: athrow
		// @016: lconst_0
		// @017: lstore #5
		// @019: aload_1
		// @01A: invokevirtual java.lang.String.length()int
		// @01D: istore #7
		// @01F: bipush 19 (0x13)
		// @021: istore #8
		// @023: iload #8
		// @025: iflt @0C7
		// @028: lload_3
		// @029: ldc2_w 38
		// @02C: lmul
		// @02D: lstore_3
		// @02E: iload #8
		// @030: iload #7
		// @032: if_icmpge @0AF
		// @035: aload_1
		// @036: iload #8
		// @038: invokevirtual java.lang.String.charAt(int)char
		// @03B: istore #9
		// @03D: bipush 65 (0x41)
		// @03F: iload #9
		// @041: if_icmpgt @04F
		// @044: iload #9
		// @046: bipush 90 (0x5A)
		// @048: if_icmple @0A4
		// @04B: goto @04F
		// @04E: athrow
		// @04F: bipush 97 (0x61)
		// @051: iload #9
		// @053: if_icmpgt @067
		// @056: goto @05A
		// @059: athrow
		// @05A: iload #9
		// @05C: iconst_m1
		// @05D: ixor
		// @05E: bipush -123 (0x85)
		// @060: if_icmpge @096
		// @063: goto @067
		// @066: athrow
		// @067: iload #9
		// @069: iconst_m1
		// @06A: ixor
		// @06B: bipush -49 (0xCF)
		// @06D: if_icmpgt @08F
		// @070: goto @074
		// @073: athrow
		// @074: iload #9
		// @076: bipush 57 (0x39)
		// @078: if_icmpgt @08F
		// @07B: goto @07F
		// @07E: athrow
		// @07F: lload_3
		// @080: bipush 28 (0x1C)
		// @082: iload #9
		// @084: ineg
		// @085: isub
		// @086: bipush 48 (0x30)
		// @088: isub
		// @089: i2l
		// @08A: ladd
		// @08B: lstore_3
		// @08C: goto @0AF
		// @08F: lload_3
		// @090: lconst_1
		// @091: ladd
		// @092: lstore_3
		// @093: goto @0AF
		// @096: lload_3
		// @097: bipush -97 (0x9F)
		// @099: iload #9
		// @09B: iconst_2
		// @09C: iadd
		// @09D: iadd
		// @09E: i2l
		// @09F: ladd
		// @0A0: lstore_3
		// @0A1: goto @0AF
		// @0A4: lload_3
		// @0A5: bipush -65 (0xBF)
		// @0A7: iload #9
		// @0A9: iadd
		// @0AA: iconst_2
		// @0AB: iadd
		// @0AC: i2l
		// @0AD: ladd
		// @0AE: lstore_3
		// @0AF: bipush -11 (0xF5)
		// @0B1: iload #8
		// @0B3: iconst_m1
		// @0B4: ixor
		// @0B5: if_icmpeq @0BC
		// @0B8: goto @0C1
		// @0BB: athrow
		// @0BC: lload_3
		// @0BD: lstore #5
		// @0BF: lconst_0
		// @0C0: lstore_3
		// @0C1: iinc #8 +255
		// @0C4: goto @023
		// @0C7: aload_0
		// @0C8: bipush 125 (0x7D)
		// @0CA: lload_3
		// @0CB: invokespecial game.C_100280_nf.func_101136_b(int, long)void
		// @0CE: aload_0
		// @0CF: bipush -55 (0xC9)
		// @0D1: lload #5
		// @0D3: invokespecial game.C_100280_nf.func_101136_b(int, long)void
		// @0D6: goto @115
		// @0D9: astore_3
		// @0DA: aload_3
		// @0DB: new java.lang.StringBuilder
		// @0DE: dup
		// @0DF: invokespecial java.lang.StringBuilder.<init>()void
		// @0E2: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @0E5: bipush 23 (0x17)
		// @0E7: aaload
		// @0E8: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0EB: aload_1
		// @0EC: ifnull @0F8
		// @0EF: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @0F2: iconst_1
		// @0F3: aaload
		// @0F4: goto @0FD
		// @0F7: athrow
		// @0F8: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @0FB: iconst_2
		// @0FC: aaload
		// @0FD: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @100: bipush 44 (0x2C)
		// @102: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @105: iload_2
		// @106: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @109: bipush 41 (0x29)
		// @10B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @10E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @111: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @114: athrow
		// @115: return
	}
	
	final long func_101161_i(int arg0)
	{
		// @00: aload_0
		// @01: sipush -1543 (0xF9F9)
		// @04: invokevirtual game.C_100280_nf.func_101171_e(int)int
		// @07: i2l
		// @08: ldc2_w 4294967295
		// @0B: land
		// @0C: lstore_2
		// @0D: ldc2_w 4294967295
		// @10: aload_0
		// @11: iload_1
		// @12: sipush 14599 (0x3907)
		// @15: iadd
		// @16: invokevirtual game.C_100280_nf.func_101171_e(int)int
		// @19: i2l
		// @1A: land
		// @1B: lstore #4
		// @1D: iload_1
		// @1E: sipush -16142 (0xC0F2)
		// @21: if_icmpeq @28
		// @24: ldc2_w -26
		// @27: lreturn
		// @28: lload #4
		// @2A: lload_2
		// @2B: ldc -2048836384 (0x85e13ce0)
		// @2D: lshl
		// @2E: ladd
		// @2F: lreturn
		// @30: astore_2
		// @31: aload_2
		// @32: new java.lang.StringBuilder
		// @35: dup
		// @36: invokespecial java.lang.StringBuilder.<init>()void
		// @39: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @3C: bipush 6 (0x06)
		// @3E: aaload
		// @3F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @42: iload_1
		// @43: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @46: bipush 41 (0x29)
		// @48: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @51: athrow
	}
	
	final int func_101156_c(boolean arg0)
	{
		// @00: iload_1
		// @01: ifeq @0F
		// @04: aload_0
		// @05: bipush -69 (0xBB)
		// @07: invokevirtual game.C_100280_nf.func_101171_e(int)int
		// @0A: pop
		// @0B: goto @0F
		// @0E: athrow
		// @0F: aload_0
		// @10: getfield byte[] game.C_100280_nf.field_101179_l
		// @13: aload_0
		// @14: dup
		// @15: getfield int game.C_100280_nf.field_101177_n
		// @18: dup_x1
		// @19: iconst_1
		// @1A: iadd
		// @1B: putfield int game.C_100280_nf.field_101177_n
		// @1E: baload
		// @1F: sipush 255 (0x00FF)
		// @22: iand
		// @23: ireturn
		// @24: astore_2
		// @25: aload_2
		// @26: new java.lang.StringBuilder
		// @29: dup
		// @2A: invokespecial java.lang.StringBuilder.<init>()void
		// @2D: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @30: bipush 38 (0x26)
		// @32: aaload
		// @33: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @36: iload_1
		// @37: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @3A: bipush 41 (0x29)
		// @3C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @42: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @45: athrow
	}
	
	final void func_101162_a(int arg0, boolean arg1)
	{
		// @00: aload_0
		// @01: getfield byte[] game.C_100280_nf.field_101179_l
		// @04: bipush -2 (0xFE)
		// @06: iload_1
		// @07: ineg
		// @08: iadd
		// @09: aload_0
		// @0A: getfield int game.C_100280_nf.field_101177_n
		// @0D: iadd
		// @0E: iload_1
		// @0F: ldc -1798222968 (0x94d14b88)
		// @11: ishr
		// @12: i2b
		// @13: bastore
		// @14: aload_0
		// @15: getfield byte[] game.C_100280_nf.field_101179_l
		// @18: iconst_m1
		// @19: iload_1
		// @1A: ineg
		// @1B: iadd
		// @1C: aload_0
		// @1D: getfield int game.C_100280_nf.field_101177_n
		// @20: iadd
		// @21: iload_1
		// @22: i2b
		// @23: bastore
		// @24: iload_2
		// @25: ifeq @30
		// @28: aload_0
		// @29: bipush 97 (0x61)
		// @2B: bipush -83 (0xAD)
		// @2D: invokevirtual game.C_100280_nf.func_101153_c(int, int)void
		// @30: goto @5E
		// @33: astore_3
		// @34: aload_3
		// @35: new java.lang.StringBuilder
		// @38: dup
		// @39: invokespecial java.lang.StringBuilder.<init>()void
		// @3C: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @3F: bipush 26 (0x1A)
		// @41: aaload
		// @42: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @45: iload_1
		// @46: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @49: bipush 44 (0x2C)
		// @4B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4E: iload_2
		// @4F: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @52: bipush 41 (0x29)
		// @54: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @57: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @5A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @5D: athrow
		// @5E: return
	}
	
	final void func_101169_f(int arg0, int arg1)
	{
		// @00: iload_1
		// @01: sipush 7838 (0x1E9E)
		// @04: if_icmpeq @14
		// @07: aload_0
		// @08: bipush 109 (0x6D)
		// @0A: ldc2_w 71
		// @0D: invokevirtual game.C_100280_nf.func_101131_a(int, long)void
		// @10: goto @14
		// @13: athrow
		// @14: aload_0
		// @15: getfield byte[] game.C_100280_nf.field_101179_l
		// @18: aload_0
		// @19: dup
		// @1A: getfield int game.C_100280_nf.field_101177_n
		// @1D: dup_x1
		// @1E: iconst_1
		// @1F: iadd
		// @20: putfield int game.C_100280_nf.field_101177_n
		// @23: iload_2
		// @24: i2b
		// @25: bastore
		// @26: goto @54
		// @29: astore_3
		// @2A: aload_3
		// @2B: new java.lang.StringBuilder
		// @2E: dup
		// @2F: invokespecial java.lang.StringBuilder.<init>()void
		// @32: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @35: bipush 40 (0x28)
		// @37: aaload
		// @38: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3B: iload_1
		// @3C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3F: bipush 44 (0x2C)
		// @41: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @44: iload_2
		// @45: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @48: bipush 41 (0x29)
		// @4A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @50: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @53: athrow
		// @54: return
	}
	
	private final void func_101136_b(int arg0, long arg1)
	{
		// @00: aload_0
		// @01: getfield byte[] game.C_100280_nf.field_101179_l
		// @04: aload_0
		// @05: dup
		// @06: getfield int game.C_100280_nf.field_101177_n
		// @09: dup_x1
		// @0A: iconst_1
		// @0B: iadd
		// @0C: putfield int game.C_100280_nf.field_101177_n
		// @0F: lload_2
		// @10: ldc 875245424 (0x342b2f70)
		// @12: lshr
		// @13: l2i
		// @14: i2b
		// @15: bastore
		// @16: aload_0
		// @17: getfield byte[] game.C_100280_nf.field_101179_l
		// @1A: aload_0
		// @1B: dup
		// @1C: getfield int game.C_100280_nf.field_101177_n
		// @1F: dup_x1
		// @20: iconst_1
		// @21: iadd
		// @22: putfield int game.C_100280_nf.field_101177_n
		// @25: lload_2
		// @26: ldc 778461608 (0x2e6661a8)
		// @28: lshr
		// @29: l2i
		// @2A: i2b
		// @2B: bastore
		// @2C: aload_0
		// @2D: getfield byte[] game.C_100280_nf.field_101179_l
		// @30: aload_0
		// @31: dup
		// @32: getfield int game.C_100280_nf.field_101177_n
		// @35: dup_x1
		// @36: iconst_1
		// @37: iadd
		// @38: putfield int game.C_100280_nf.field_101177_n
		// @3B: lload_2
		// @3C: ldc 595618208 (0x238069a0)
		// @3E: lshr
		// @3F: l2i
		// @40: i2b
		// @41: bastore
		// @42: aload_0
		// @43: getfield byte[] game.C_100280_nf.field_101179_l
		// @46: aload_0
		// @47: dup
		// @48: getfield int game.C_100280_nf.field_101177_n
		// @4B: dup_x1
		// @4C: iconst_1
		// @4D: iadd
		// @4E: putfield int game.C_100280_nf.field_101177_n
		// @51: lload_2
		// @52: ldc -1063833128 (0xc09731d8)
		// @54: lshr
		// @55: l2i
		// @56: i2b
		// @57: bastore
		// @58: bipush -73 (0xB7)
		// @5A: iload_1
		// @5B: bipush -4 (0xFC)
		// @5D: isub
		// @5E: bipush 42 (0x2A)
		// @60: idiv
		// @61: irem
		// @62: istore #4
		// @64: aload_0
		// @65: getfield byte[] game.C_100280_nf.field_101179_l
		// @68: aload_0
		// @69: dup
		// @6A: getfield int game.C_100280_nf.field_101177_n
		// @6D: dup_x1
		// @6E: iconst_1
		// @6F: iadd
		// @70: putfield int game.C_100280_nf.field_101177_n
		// @73: lload_2
		// @74: ldc 1623087248 (0x60be5890)
		// @76: lshr
		// @77: l2i
		// @78: i2b
		// @79: bastore
		// @7A: aload_0
		// @7B: getfield byte[] game.C_100280_nf.field_101179_l
		// @7E: aload_0
		// @7F: dup
		// @80: getfield int game.C_100280_nf.field_101177_n
		// @83: dup_x1
		// @84: iconst_1
		// @85: iadd
		// @86: putfield int game.C_100280_nf.field_101177_n
		// @89: lload_2
		// @8A: ldc -568815032 (0xde189248)
		// @8C: lshr
		// @8D: l2i
		// @8E: i2b
		// @8F: bastore
		// @90: aload_0
		// @91: getfield byte[] game.C_100280_nf.field_101179_l
		// @94: aload_0
		// @95: dup
		// @96: getfield int game.C_100280_nf.field_101177_n
		// @99: dup_x1
		// @9A: iconst_1
		// @9B: iadd
		// @9C: putfield int game.C_100280_nf.field_101177_n
		// @9F: lload_2
		// @A0: l2i
		// @A1: i2b
		// @A2: bastore
		// @A3: goto @D3
		// @A6: astore #4
		// @A8: aload #4
		// @AA: new java.lang.StringBuilder
		// @AD: dup
		// @AE: invokespecial java.lang.StringBuilder.<init>()void
		// @B1: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @B4: bipush 9 (0x09)
		// @B6: aaload
		// @B7: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @BA: iload_1
		// @BB: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @BE: bipush 44 (0x2C)
		// @C0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C3: lload_2
		// @C4: invokevirtual java.lang.StringBuilder.append(long)java.lang.StringBuilder
		// @C7: bipush 41 (0x29)
		// @C9: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @CC: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @CF: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @D2: athrow
		// @D3: return
	}
	
	public static void func_101168_d(boolean arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100280_nf.field_101180_m
		// @04: aconst_null
		// @05: putstatic game.C_100128_ca game.C_100280_nf.field_101172_t
		// @08: iload_0
		// @09: iconst_1
		// @0A: if_icmpeq @0E
		// @0D: return
		// @0E: aconst_null
		// @0F: putstatic java.lang.String game.C_100280_nf.field_101174_r
		// @12: aconst_null
		// @13: putstatic java.lang.String game.C_100280_nf.field_101175_q
		// @16: aconst_null
		// @17: putstatic game.C_100302_ka game.C_100280_nf.field_101176_p
		// @1A: aconst_null
		// @1B: putstatic int[] game.C_100280_nf.field_101178_o
		// @1E: aconst_null
		// @1F: putstatic game.C_100113_ek game.C_100280_nf.field_101181_j
		// @22: aconst_null
		// @23: putstatic game.C_100301_kb game.C_100280_nf.field_101183_k
		// @26: goto @4B
		// @29: astore_1
		// @2A: aload_1
		// @2B: new java.lang.StringBuilder
		// @2E: dup
		// @2F: invokespecial java.lang.StringBuilder.<init>()void
		// @32: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @35: bipush 16 (0x10)
		// @37: aaload
		// @38: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3B: iload_0
		// @3C: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @3F: bipush 41 (0x29)
		// @41: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @44: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @47: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4A: athrow
		// @4B: return
	}
	
	final String func_101163_j(int arg0)
	{
		// @00: aload_0
		// @01: getfield byte[] game.C_100280_nf.field_101179_l
		// @04: aload_0
		// @05: getfield int game.C_100280_nf.field_101177_n
		// @08: baload
		// @09: ifeq @10
		// @0C: goto @1C
		// @0F: athrow
		// @10: aload_0
		// @11: dup
		// @12: getfield int game.C_100280_nf.field_101177_n
		// @15: iconst_1
		// @16: iadd
		// @17: putfield int game.C_100280_nf.field_101177_n
		// @1A: aconst_null
		// @1B: areturn
		// @1C: bipush 98 (0x62)
		// @1E: bipush -46 (0xD2)
		// @20: iload_1
		// @21: isub
		// @22: bipush 51 (0x33)
		// @24: idiv
		// @25: idiv
		// @26: istore_2
		// @27: aload_0
		// @28: sipush 9692 (0x25DC)
		// @2B: invokevirtual game.C_100280_nf.func_101164_f(int)java.lang.String
		// @2E: areturn
		// @2F: astore_2
		// @30: aload_2
		// @31: new java.lang.StringBuilder
		// @34: dup
		// @35: invokespecial java.lang.StringBuilder.<init>()void
		// @38: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @3B: bipush 31 (0x1F)
		// @3D: aaload
		// @3E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @41: iload_1
		// @42: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @45: bipush 41 (0x29)
		// @47: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @50: athrow
	}
	
	final void func_101153_c(int arg0, int arg1)
	{
		// @00: iload_2
		// @01: bipush -123 (0x85)
		// @03: if_icmple @07
		// @06: return
		// @07: iconst_m1
		// @08: iload_1
		// @09: iconst_m1
		// @0A: ixor
		// @0B: if_icmplt @26
		// @0E: iload_1
		// @0F: sipush 128 (0x0080)
		// @12: if_icmplt @1D
		// @15: goto @19
		// @18: athrow
		// @19: goto @26
		// @1C: athrow
		// @1D: aload_0
		// @1E: sipush 7838 (0x1E9E)
		// @21: iload_1
		// @22: invokevirtual game.C_100280_nf.func_101169_f(int, int)void
		// @25: return
		// @26: iload_1
		// @27: iflt @43
		// @2A: ldc 32768 (0x8000)
		// @2C: iload_1
		// @2D: if_icmpgt @38
		// @30: goto @34
		// @33: athrow
		// @34: goto @43
		// @37: athrow
		// @38: aload_0
		// @39: iload_1
		// @3A: ldc 32768 (0x8000)
		// @3C: iadd
		// @3D: bipush -72 (0xB8)
		// @3F: invokevirtual game.C_100280_nf.func_101141_d(int, byte)void
		// @42: return
		// @43: new java.lang.IllegalArgumentException
		// @46: dup
		// @47: invokespecial java.lang.IllegalArgumentException.<init>()void
		// @4A: athrow
		// @4B: astore_3
		// @4C: aload_3
		// @4D: new java.lang.StringBuilder
		// @50: dup
		// @51: invokespecial java.lang.StringBuilder.<init>()void
		// @54: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @57: iconst_5
		// @58: aaload
		// @59: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @5C: iload_1
		// @5D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @60: bipush 44 (0x2C)
		// @62: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @65: iload_2
		// @66: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @69: bipush 41 (0x29)
		// @6B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @71: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @74: athrow
	}
	
	final int func_101160_a(boolean arg0)
	{
		// @00: iload_1
		// @01: iconst_1
		// @02: if_icmpeq @11
		// @05: aload_0
		// @06: bipush -49 (0xCF)
		// @08: bipush -39 (0xD9)
		// @0A: invokevirtual game.C_100280_nf.func_101137_e(int, int)void
		// @0D: goto @11
		// @10: athrow
		// @11: iconst_m1
		// @12: aload_0
		// @13: getfield byte[] game.C_100280_nf.field_101179_l
		// @16: aload_0
		// @17: getfield int game.C_100280_nf.field_101177_n
		// @1A: baload
		// @1B: iconst_m1
		// @1C: ixor
		// @1D: if_icmpge @2B
		// @20: aload_0
		// @21: sipush -1543 (0xF9F9)
		// @24: invokevirtual game.C_100280_nf.func_101171_e(int)int
		// @27: ldc 2147483647 (0x7fffffff)
		// @29: iand
		// @2A: ireturn
		// @2B: aload_0
		// @2C: bipush -2 (0xFE)
		// @2E: invokevirtual game.C_100280_nf.func_101143_l(int)int
		// @31: ireturn
		// @32: astore_2
		// @33: aload_2
		// @34: new java.lang.StringBuilder
		// @37: dup
		// @38: invokespecial java.lang.StringBuilder.<init>()void
		// @3B: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @3E: bipush 22 (0x16)
		// @40: aaload
		// @41: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @44: iload_1
		// @45: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @48: bipush 41 (0x29)
		// @4A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @50: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @53: athrow
	}
	
	final int func_101143_l(int arg0)
	{
		// @00: aload_0
		// @01: dup
		// @02: getfield int game.C_100280_nf.field_101177_n
		// @05: iconst_2
		// @06: iadd
		// @07: putfield int game.C_100280_nf.field_101177_n
		// @0A: iload_1
		// @0B: bipush -2 (0xFE)
		// @0D: if_icmpeq @1E
		// @10: aload_0
		// @11: aconst_null
		// @12: checkcast java.lang.String
		// @15: bipush -72 (0xB8)
		// @17: invokevirtual game.C_100280_nf.func_101148_a(java.lang.String, int)void
		// @1A: goto @1E
		// @1D: athrow
		// @1E: sipush 255 (0x00FF)
		// @21: aload_0
		// @22: getfield byte[] game.C_100280_nf.field_101179_l
		// @25: aload_0
		// @26: getfield int game.C_100280_nf.field_101177_n
		// @29: iconst_1
		// @2A: isub
		// @2B: baload
		// @2C: iand
		// @2D: ldc 65280 (0xff00)
		// @2F: aload_0
		// @30: getfield byte[] game.C_100280_nf.field_101179_l
		// @33: bipush -2 (0xFE)
		// @35: aload_0
		// @36: getfield int game.C_100280_nf.field_101177_n
		// @39: iadd
		// @3A: baload
		// @3B: ldc 2143415240 (0x7fc1ebc8)
		// @3D: ishl
		// @3E: iand
		// @3F: iadd
		// @40: ireturn
		// @41: astore_2
		// @42: aload_2
		// @43: new java.lang.StringBuilder
		// @46: dup
		// @47: invokespecial java.lang.StringBuilder.<init>()void
		// @4A: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @4D: bipush 20 (0x14)
		// @4F: aaload
		// @50: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @53: iload_1
		// @54: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @57: bipush 41 (0x29)
		// @59: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @5F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @62: athrow
	}
	
	final void func_101167_a(int arg0, String arg1)
	{
		// @00: aload_2
		// @01: iconst_0
		// @02: invokevirtual java.lang.String.indexOf(int)int
		// @05: istore_3
		// @06: iconst_0
		// @07: iload_3
		// @08: if_icmpgt @16
		// @0B: new java.lang.IllegalArgumentException
		// @0E: dup
		// @0F: ldc ""
		// @11: invokespecial java.lang.IllegalArgumentException.<init>(java.lang.String)void
		// @14: athrow
		// @15: athrow
		// @16: aload_0
		// @17: dup
		// @18: getfield int game.C_100280_nf.field_101177_n
		// @1B: aload_2
		// @1C: aload_2
		// @1D: invokevirtual java.lang.String.length()int
		// @20: aload_0
		// @21: getfield byte[] game.C_100280_nf.field_101179_l
		// @24: iconst_0
		// @25: aload_0
		// @26: getfield int game.C_100280_nf.field_101177_n
		// @29: bipush 115 (0x73)
		// @2B: invokestatic game.C_100027_hc.func_102587_a(java.lang.CharSequence, int, byte[], int, int, byte)int
		// @2E: iadd
		// @2F: putfield int game.C_100280_nf.field_101177_n
		// @32: iload_1
		// @33: sipush -28365 (0x9133)
		// @36: if_icmpeq @44
		// @39: aconst_null
		// @3A: checkcast game.C_100302_ka
		// @3D: putstatic game.C_100302_ka game.C_100280_nf.field_101176_p
		// @40: goto @44
		// @43: athrow
		// @44: aload_0
		// @45: getfield byte[] game.C_100280_nf.field_101179_l
		// @48: aload_0
		// @49: dup
		// @4A: getfield int game.C_100280_nf.field_101177_n
		// @4D: dup_x1
		// @4E: iconst_1
		// @4F: iadd
		// @50: putfield int game.C_100280_nf.field_101177_n
		// @53: iconst_0
		// @54: bastore
		// @55: goto @94
		// @58: astore_3
		// @59: aload_3
		// @5A: new java.lang.StringBuilder
		// @5D: dup
		// @5E: invokespecial java.lang.StringBuilder.<init>()void
		// @61: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @64: bipush 39 (0x27)
		// @66: aaload
		// @67: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @6A: iload_1
		// @6B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6E: bipush 44 (0x2C)
		// @70: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @73: aload_2
		// @74: ifnull @80
		// @77: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @7A: iconst_1
		// @7B: aaload
		// @7C: goto @85
		// @7F: athrow
		// @80: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @83: iconst_2
		// @84: aaload
		// @85: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @88: bipush 41 (0x29)
		// @8A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @90: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @93: athrow
		// @94: return
	}
	
	final void func_101170_b(int arg0, byte arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #4
		// @05: iload_1
		// @06: iconst_m1
		// @07: ixor
		// @08: aload_0
		// @09: getfield int game.C_100280_nf.field_101177_n
		// @0C: iconst_m1
		// @0D: ixor
		// @0E: if_icmpge @30
		// @11: aload_0
		// @12: getfield byte[] game.C_100280_nf.field_101179_l
		// @15: aload_0
		// @16: dup
		// @17: getfield int game.C_100280_nf.field_101177_n
		// @1A: dup_x1
		// @1B: iconst_1
		// @1C: iadd
		// @1D: putfield int game.C_100280_nf.field_101177_n
		// @20: iconst_0
		// @21: bastore
		// @22: iload #4
		// @24: ifne @41
		// @27: iload #4
		// @29: ifeq @05
		// @2C: goto @30
		// @2F: athrow
		// @30: iload_2
		// @31: bipush 93 (0x5D)
		// @33: if_icmpge @41
		// @36: aconst_null
		// @37: checkcast java.lang.String
		// @3A: putstatic java.lang.String game.C_100280_nf.field_101180_m
		// @3D: goto @41
		// @40: athrow
		// @41: goto @6F
		// @44: astore_3
		// @45: aload_3
		// @46: new java.lang.StringBuilder
		// @49: dup
		// @4A: invokespecial java.lang.StringBuilder.<init>()void
		// @4D: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @50: bipush 37 (0x25)
		// @52: aaload
		// @53: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @56: iload_1
		// @57: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5A: bipush 44 (0x2C)
		// @5C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5F: iload_2
		// @60: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @63: bipush 41 (0x29)
		// @65: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @68: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @6B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @6E: athrow
		// @6F: return
	}
	
	final void func_101137_e(int arg0, int arg1)
	{
		// @00: bipush -128 (0x80)
		// @02: iload_2
		// @03: iand
		// @04: ifne @0B
		// @07: goto @6D
		// @0A: athrow
		// @0B: iconst_0
		// @0C: iload_2
		// @0D: sipush -16384 (0xC000)
		// @10: iand
		// @11: if_icmpne @18
		// @14: goto @5C
		// @17: athrow
		// @18: iload_2
		// @19: ldc -2097152 (0xffe00000)
		// @1B: iand
		// @1C: ifne @23
		// @1F: goto @4E
		// @22: athrow
		// @23: ldc -268435456 (0xf0000000)
		// @25: iload_2
		// @26: iand
		// @27: ifne @2E
		// @2A: goto @3F
		// @2D: athrow
		// @2E: aload_0
		// @2F: iload_1
		// @30: sipush 7710 (0x1E1E)
		// @33: iadd
		// @34: iload_2
		// @35: ldc -1865382820 (0x90d0845c)
		// @37: iushr
		// @38: sipush 128 (0x0080)
		// @3B: ior
		// @3C: invokevirtual game.C_100280_nf.func_101169_f(int, int)void
		// @3F: aload_0
		// @40: sipush 7838 (0x1E9E)
		// @43: sipush 128 (0x0080)
		// @46: iload_2
		// @47: ldc -1351113419 (0xaf77a535)
		// @49: iushr
		// @4A: ior
		// @4B: invokevirtual game.C_100280_nf.func_101169_f(int, int)void
		// @4E: aload_0
		// @4F: sipush 7838 (0x1E9E)
		// @52: ldc 2103640 (0x201958)
		// @54: iload_2
		// @55: ior
		// @56: ldc 669196430 (0x27e3208e)
		// @58: iushr
		// @59: invokevirtual game.C_100280_nf.func_101169_f(int, int)void
		// @5C: aload_0
		// @5D: iload_1
		// @5E: sipush 7710 (0x1E1E)
		// @61: ixor
		// @62: sipush 128 (0x0080)
		// @65: iload_2
		// @66: ldc 780699015 (0x2e888587)
		// @68: iushr
		// @69: ior
		// @6A: invokevirtual game.C_100280_nf.func_101169_f(int, int)void
		// @6D: iload_1
		// @6E: sipush 128 (0x0080)
		// @71: if_icmpeq @75
		// @74: return
		// @75: aload_0
		// @76: sipush 7838 (0x1E9E)
		// @79: iload_2
		// @7A: bipush 127 (0x7F)
		// @7C: iand
		// @7D: invokevirtual game.C_100280_nf.func_101169_f(int, int)void
		// @80: goto @AE
		// @83: astore_3
		// @84: aload_3
		// @85: new java.lang.StringBuilder
		// @88: dup
		// @89: invokespecial java.lang.StringBuilder.<init>()void
		// @8C: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @8F: bipush 29 (0x1D)
		// @91: aaload
		// @92: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @95: iload_1
		// @96: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @99: bipush 44 (0x2C)
		// @9B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9E: iload_2
		// @9F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A2: bipush 41 (0x29)
		// @A4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A7: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @AA: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @AD: athrow
		// @AE: return
	}
	
	final void func_101132_a(BigInteger arg0, BigInteger arg1, byte arg2)
	{
		// @00: aload_0
		// @01: getfield int game.C_100280_nf.field_101177_n
		// @04: istore #4
		// @06: aload_0
		// @07: iconst_0
		// @08: putfield int game.C_100280_nf.field_101177_n
		// @0B: iload #4
		// @0D: newarray byte[]
		// @0F: astore #5
		// @11: aload_0
		// @12: aload #5
		// @14: iload #4
		// @16: iconst_0
		// @17: sipush -7623 (0xE239)
		// @1A: invokevirtual game.C_100280_nf.func_101149_a(byte[], int, int, int)void
		// @1D: new java.math.BigInteger
		// @20: dup
		// @21: aload #5
		// @23: invokespecial java.math.BigInteger.<init>(byte[])void
		// @26: astore #6
		// @28: iload_3
		// @29: bipush 21 (0x15)
		// @2B: if_icmpeq @39
		// @2E: aload_0
		// @2F: bipush -102 (0x9A)
		// @31: iconst_0
		// @32: invokevirtual game.C_100280_nf.func_101162_a(int, boolean)void
		// @35: goto @39
		// @38: athrow
		// @39: aload #6
		// @3B: aload_2
		// @3C: aload_1
		// @3D: invokevirtual java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)java.math.BigInteger
		// @40: astore #7
		// @42: aload #7
		// @44: invokevirtual java.math.BigInteger.toByteArray()byte[]
		// @47: astore #8
		// @49: aload_0
		// @4A: iconst_0
		// @4B: putfield int game.C_100280_nf.field_101177_n
		// @4E: aload_0
		// @4F: aload #8
		// @51: arraylength
		// @52: bipush 114 (0x72)
		// @54: invokevirtual game.C_100280_nf.func_101141_d(int, byte)void
		// @57: aload_0
		// @58: aload #8
		// @5A: iconst_0
		// @5B: aload #8
		// @5D: arraylength
		// @5E: bipush -27 (0xE5)
		// @60: invokevirtual game.C_100280_nf.func_101165_b(byte[], int, int, int)void
		// @63: goto @BE
		// @66: astore #4
		// @68: aload #4
		// @6A: new java.lang.StringBuilder
		// @6D: dup
		// @6E: invokespecial java.lang.StringBuilder.<init>()void
		// @71: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @74: bipush 25 (0x19)
		// @76: aaload
		// @77: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @7A: aload_1
		// @7B: ifnull @87
		// @7E: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @81: iconst_1
		// @82: aaload
		// @83: goto @8C
		// @86: athrow
		// @87: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @8A: iconst_2
		// @8B: aaload
		// @8C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @8F: bipush 44 (0x2C)
		// @91: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @94: aload_2
		// @95: ifnull @A1
		// @98: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @9B: iconst_1
		// @9C: aaload
		// @9D: goto @A6
		// @A0: athrow
		// @A1: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @A4: iconst_2
		// @A5: aaload
		// @A6: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @A9: bipush 44 (0x2C)
		// @AB: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @AE: iload_3
		// @AF: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @B2: bipush 41 (0x29)
		// @B4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B7: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @BA: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @BD: athrow
		// @BE: return
	}
	
	final void func_101165_b(byte[] arg0, int arg1, int arg2, int arg3)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #6
		// @05: iload #4
		// @07: bipush -23 (0xE9)
		// @09: if_icmplt @17
		// @0C: aload_0
		// @0D: bipush -74 (0xB6)
		// @0F: invokevirtual game.C_100280_nf.func_101143_l(int)int
		// @12: pop
		// @13: goto @17
		// @16: athrow
		// @17: iload_2
		// @18: istore #5
		// @1A: iload_2
		// @1B: iload_3
		// @1C: iadd
		// @1D: iconst_m1
		// @1E: ixor
		// @1F: iload #5
		// @21: iconst_m1
		// @22: ixor
		// @23: if_icmpge @4B
		// @26: aload_0
		// @27: getfield byte[] game.C_100280_nf.field_101179_l
		// @2A: aload_0
		// @2B: dup
		// @2C: getfield int game.C_100280_nf.field_101177_n
		// @2F: dup_x1
		// @30: iconst_1
		// @31: iadd
		// @32: putfield int game.C_100280_nf.field_101177_n
		// @35: aload_1
		// @36: iload #5
		// @38: baload
		// @39: bastore
		// @3A: iinc #5 +1
		// @3D: iload #6
		// @3F: ifne @9F
		// @42: iload #6
		// @44: ifeq @1A
		// @47: goto @4B
		// @4A: athrow
		// @4B: goto @9F
		// @4E: astore #5
		// @50: aload #5
		// @52: new java.lang.StringBuilder
		// @55: dup
		// @56: invokespecial java.lang.StringBuilder.<init>()void
		// @59: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @5C: bipush 28 (0x1C)
		// @5E: aaload
		// @5F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @62: aload_1
		// @63: ifnull @6F
		// @66: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @69: iconst_1
		// @6A: aaload
		// @6B: goto @74
		// @6E: athrow
		// @6F: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @72: iconst_2
		// @73: aaload
		// @74: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @77: bipush 44 (0x2C)
		// @79: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7C: iload_2
		// @7D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @80: bipush 44 (0x2C)
		// @82: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @85: iload_3
		// @86: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @89: bipush 44 (0x2C)
		// @8B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8E: iload #4
		// @90: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @93: bipush 41 (0x29)
		// @95: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @98: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @9B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @9E: athrow
		// @9F: return
	}
	
	static final void func_101133_a(C_100098_h arg0, byte arg1)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #7
		// @005: new game.C_100278_nd
		// @008: dup
		// @009: aload_0
		// @00A: ldc ""
		// @00C: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @00F: bipush 14 (0x0E)
		// @011: aaload
		// @012: bipush -41 (0xD7)
		// @014: invokevirtual game.C_100098_h.func_104608_a(java.lang.String, java.lang.String, int)byte[]
		// @017: invokespecial game.C_100278_nd.<init>(byte[])void
		// @01A: astore_2
		// @01B: aload_2
		// @01C: iconst_0
		// @01D: invokevirtual game.C_100278_nd.func_101156_c(boolean)int
		// @020: istore_3
		// @021: aload_2
		// @022: iconst_1
		// @023: invokevirtual game.C_100278_nd.func_101187_e(boolean)void
		// @026: aload_2
		// @027: iload_1
		// @028: sipush 11402 (0x2C8A)
		// @02B: ixor
		// @02C: invokestatic game.C_100178_cg.func_105681_a(game.C_100278_nd, int)game.C_100243_pd[]
		// @02F: putstatic game.C_100243_pd[] game.C_100152_bd.field_105199_d
		// @032: iload_3
		// @033: anewarray int[]
		// @036: putstatic int[][] game.C_100063_dj.field_104295_c
		// @039: iload_3
		// @03A: anewarray game.C_100277_nc
		// @03D: putstatic game.C_100277_nc[] game.C_100103_eh.field_104668_a
		// @040: iload_1
		// @041: bipush -102 (0x9A)
		// @043: if_icmpeq @047
		// @046: return
		// @047: iconst_0
		// @048: istore #4
		// @04A: iload #4
		// @04C: iconst_m1
		// @04D: ixor
		// @04E: iload_3
		// @04F: iconst_m1
		// @050: ixor
		// @051: if_icmple @071
		// @054: getstatic game.C_100277_nc[] game.C_100103_eh.field_104668_a
		// @057: iload #4
		// @059: aload_2
		// @05A: bipush 16 (0x10)
		// @05C: invokestatic game.C_100203_ql.func_105925_a(game.C_100278_nd, int)game.C_100277_nc
		// @05F: aastore
		// @060: iinc #4 +1
		// @063: iload #7
		// @065: ifne @077
		// @068: iload #7
		// @06A: ifeq @04A
		// @06D: goto @071
		// @070: athrow
		// @071: aload_2
		// @072: bipush 120 (0x78)
		// @074: invokevirtual game.C_100278_nd.func_101191_p(int)void
		// @077: iconst_0
		// @078: istore #4
		// @07A: iload #4
		// @07C: iconst_m1
		// @07D: ixor
		// @07E: iload_3
		// @07F: iconst_m1
		// @080: ixor
		// @081: if_icmple @106
		// @084: getstatic game.C_100277_nc[] game.C_100103_eh.field_104668_a
		// @087: iload #4
		// @089: aaload
		// @08A: astore #5
		// @08C: aload #5
		// @08E: bipush 6 (0x06)
		// @090: bipush 6 (0x06)
		// @092: iconst_0
		// @093: bipush 6 (0x06)
		// @095: iconst_1
		// @096: invokevirtual game.C_100277_nc.func_106687_a(int, int, boolean, int, int)void
		// @099: aload #5
		// @09B: bipush -119 (0x89)
		// @09D: invokevirtual game.C_100277_nc.func_106692_a(byte)void
		// @0A0: iconst_3
		// @0A1: newarray int[]
		// @0A3: dup
		// @0A4: iconst_0
		// @0A5: aload #5
		// @0A7: getfield int game.C_100277_nc.field_106740_r
		// @0AA: aload #5
		// @0AC: getfield int game.C_100277_nc.field_106716_P
		// @0AF: iadd
		// @0B0: ldc 758706305 (0x2d38f081)
		// @0B2: ishr
		// @0B3: iastore
		// @0B4: dup
		// @0B5: iconst_1
		// @0B6: aload #5
		// @0B8: getfield int game.C_100277_nc.field_106696_D
		// @0BB: aload #5
		// @0BD: getfield int game.C_100277_nc.field_106720_f
		// @0C0: iadd
		// @0C1: ldc -442896063 (0xe599f141)
		// @0C3: ishr
		// @0C4: iastore
		// @0C5: dup
		// @0C6: iconst_2
		// @0C7: aload #5
		// @0C9: getfield int game.C_100277_nc.field_106709_J
		// @0CC: aload #5
		// @0CE: getfield int game.C_100277_nc.field_106700_A
		// @0D1: iadd
		// @0D2: ldc 220299361 (0xd218061)
		// @0D4: ishr
		// @0D5: iastore
		// @0D6: astore #6
		// @0D8: getstatic int[][] game.C_100063_dj.field_104295_c
		// @0DB: iload #4
		// @0DD: aload #6
		// @0DF: aastore
		// @0E0: aload #5
		// @0E2: aload #6
		// @0E4: iconst_2
		// @0E5: iaload
		// @0E6: ineg
		// @0E7: aload #6
		// @0E9: iconst_0
		// @0EA: iaload
		// @0EB: ineg
		// @0EC: aload #6
		// @0EE: iconst_1
		// @0EF: iaload
		// @0F0: ineg
		// @0F1: iconst_0
		// @0F2: invokevirtual game.C_100277_nc.func_106688_a(int, int, int, int)void
		// @0F5: iinc #4 +1
		// @0F8: iload #7
		// @0FA: ifne @145
		// @0FD: iload #7
		// @0FF: ifeq @07A
		// @102: goto @106
		// @105: athrow
		// @106: goto @145
		// @109: astore_2
		// @10A: aload_2
		// @10B: new java.lang.StringBuilder
		// @10E: dup
		// @10F: invokespecial java.lang.StringBuilder.<init>()void
		// @112: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @115: bipush 15 (0x0F)
		// @117: aaload
		// @118: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @11B: aload_0
		// @11C: ifnull @128
		// @11F: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @122: iconst_1
		// @123: aaload
		// @124: goto @12D
		// @127: athrow
		// @128: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @12B: iconst_2
		// @12C: aaload
		// @12D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @130: bipush 44 (0x2C)
		// @132: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @135: iload_1
		// @136: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @139: bipush 41 (0x29)
		// @13B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @13E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @141: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @144: athrow
		// @145: return
	}
	
	final int func_101171_e(int arg0)
	{
		// @00: iload_1
		// @01: sipush -1543 (0xF9F9)
		// @04: if_icmpeq @0A
		// @07: bipush -82 (0xAE)
		// @09: ireturn
		// @0A: aload_0
		// @0B: dup
		// @0C: getfield int game.C_100280_nf.field_101177_n
		// @0F: iconst_4
		// @10: iadd
		// @11: putfield int game.C_100280_nf.field_101177_n
		// @14: sipush 255 (0x00FF)
		// @17: aload_0
		// @18: getfield byte[] game.C_100280_nf.field_101179_l
		// @1B: iconst_m1
		// @1C: aload_0
		// @1D: getfield int game.C_100280_nf.field_101177_n
		// @20: iadd
		// @21: baload
		// @22: iand
		// @23: aload_0
		// @24: getfield byte[] game.C_100280_nf.field_101179_l
		// @27: bipush -4 (0xFC)
		// @29: aload_0
		// @2A: getfield int game.C_100280_nf.field_101177_n
		// @2D: iadd
		// @2E: baload
		// @2F: ldc 1443654072 (0x560c69b8)
		// @31: ishl
		// @32: ldc -16777216 (0xff000000)
		// @34: iand
		// @35: iadd
		// @36: ldc 16711680 (0xff0000)
		// @38: aload_0
		// @39: getfield byte[] game.C_100280_nf.field_101179_l
		// @3C: bipush -3 (0xFD)
		// @3E: aload_0
		// @3F: getfield int game.C_100280_nf.field_101177_n
		// @42: iadd
		// @43: baload
		// @44: ldc -137754288 (0xf7ca0950)
		// @46: ishl
		// @47: iand
		// @48: aload_0
		// @49: getfield byte[] game.C_100280_nf.field_101179_l
		// @4C: bipush -2 (0xFE)
		// @4E: aload_0
		// @4F: getfield int game.C_100280_nf.field_101177_n
		// @52: iadd
		// @53: baload
		// @54: sipush 255 (0x00FF)
		// @57: iand
		// @58: ldc 1223001480 (0x48e58588)
		// @5A: ishl
		// @5B: ineg
		// @5C: isub
		// @5D: iadd
		// @5E: ireturn
		// @5F: astore_2
		// @60: aload_2
		// @61: new java.lang.StringBuilder
		// @64: dup
		// @65: invokespecial java.lang.StringBuilder.<init>()void
		// @68: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @6B: bipush 18 (0x12)
		// @6D: aaload
		// @6E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @71: iload_1
		// @72: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @75: bipush 41 (0x29)
		// @77: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @7D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @80: athrow
	}
	
	final void func_101166_a(byte arg0, int[] arg1, int arg2, int arg3)
	{
		// @000: aload_0
		// @001: getfield int game.C_100280_nf.field_101177_n
		// @004: istore #5
		// @006: aload_0
		// @007: iload_3
		// @008: putfield int game.C_100280_nf.field_101177_n
		// @00B: iload_3
		// @00C: ineg
		// @00D: iload #4
		// @00F: iadd
		// @010: bipush 8 (0x08)
		// @012: idiv
		// @013: istore #6
		// @015: iload_1
		// @016: ifeq @01A
		// @019: return
		// @01A: iconst_0
		// @01B: istore #7
		// @01D: iload #7
		// @01F: iload #6
		// @021: if_icmpge @0B9
		// @024: aload_0
		// @025: sipush -1543 (0xF9F9)
		// @028: invokevirtual game.C_100280_nf.func_101171_e(int)int
		// @02B: istore #8
		// @02D: aload_0
		// @02E: sipush -1543 (0xF9F9)
		// @031: invokevirtual game.C_100280_nf.func_101171_e(int)int
		// @034: istore #9
		// @036: ldc -957401312 (0xc6ef3720)
		// @038: istore #10
		// @03A: ldc -1640531527 (0x9e3779b9)
		// @03C: istore #11
		// @03E: bipush 32 (0x20)
		// @040: istore #12
		// @042: iload #12
		// @044: iinc #12 +255
		// @047: ifle @096
		// @04A: iload #9
		// @04C: iload #8
		// @04E: ldc 1220955044 (0x48c64ba4)
		// @050: ishl
		// @051: iload #8
		// @053: ldc 933797477 (0x37a89e65)
		// @055: iushr
		// @056: ixor
		// @057: iload #8
		// @059: ineg
		// @05A: isub
		// @05B: iload #10
		// @05D: aload_2
		// @05E: ldc -943718397 (0xc7c00003)
		// @060: iload #10
		// @062: ldc -52521013 (0xfcde97cb)
		// @064: iushr
		// @065: iand
		// @066: iaload
		// @067: ineg
		// @068: isub
		// @069: ixor
		// @06A: isub
		// @06B: istore #9
		// @06D: iload #10
		// @06F: iload #11
		// @071: isub
		// @072: istore #10
		// @074: iload #8
		// @076: iload #9
		// @078: ldc 2070594373 (0x7b6ac345)
		// @07A: iushr
		// @07B: iload #9
		// @07D: ldc -1227284636 (0xb6d91f64)
		// @07F: ishl
		// @080: ixor
		// @081: iload #9
		// @083: ineg
		// @084: isub
		// @085: iload #10
		// @087: aload_2
		// @088: iconst_3
		// @089: iload #10
		// @08B: iand
		// @08C: iaload
		// @08D: ineg
		// @08E: isub
		// @08F: ixor
		// @090: isub
		// @091: istore #8
		// @093: goto @042
		// @096: aload_0
		// @097: dup
		// @098: getfield int game.C_100280_nf.field_101177_n
		// @09B: bipush 8 (0x08)
		// @09D: isub
		// @09E: putfield int game.C_100280_nf.field_101177_n
		// @0A1: aload_0
		// @0A2: iload #8
		// @0A4: iload_1
		// @0A5: bipush -118 (0x8A)
		// @0A7: iadd
		// @0A8: invokevirtual game.C_100280_nf.func_101154_d(int, int)void
		// @0AB: aload_0
		// @0AC: iload #9
		// @0AE: bipush -127 (0x81)
		// @0B0: invokevirtual game.C_100280_nf.func_101154_d(int, int)void
		// @0B3: iinc #7 +1
		// @0B6: goto @01D
		// @0B9: aload_0
		// @0BA: iload #5
		// @0BC: putfield int game.C_100280_nf.field_101177_n
		// @0BF: goto @112
		// @0C2: astore #5
		// @0C4: aload #5
		// @0C6: new java.lang.StringBuilder
		// @0C9: dup
		// @0CA: invokespecial java.lang.StringBuilder.<init>()void
		// @0CD: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @0D0: iconst_0
		// @0D1: aaload
		// @0D2: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0D5: iload_1
		// @0D6: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0D9: bipush 44 (0x2C)
		// @0DB: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0DE: aload_2
		// @0DF: ifnull @0EB
		// @0E2: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @0E5: iconst_1
		// @0E6: aaload
		// @0E7: goto @0F0
		// @0EA: athrow
		// @0EB: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @0EE: iconst_2
		// @0EF: aaload
		// @0F0: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0F3: bipush 44 (0x2C)
		// @0F5: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0F8: iload_3
		// @0F9: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0FC: bipush 44 (0x2C)
		// @0FE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @101: iload #4
		// @103: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @106: bipush 41 (0x29)
		// @108: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @10B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @10E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @111: athrow
		// @112: return
	}
	
	final String func_101164_f(int arg0)
	{
		// @00: aload_0
		// @01: getfield int game.C_100280_nf.field_101177_n
		// @04: istore_2
		// @05: iconst_0
		// @06: aload_0
		// @07: getfield byte[] game.C_100280_nf.field_101179_l
		// @0A: aload_0
		// @0B: dup
		// @0C: getfield int game.C_100280_nf.field_101177_n
		// @0F: dup_x1
		// @10: iconst_1
		// @11: iadd
		// @12: putfield int game.C_100280_nf.field_101177_n
		// @15: baload
		// @16: if_icmpeq @1D
		// @19: goto @05
		// @1C: athrow
		// @1D: iconst_m1
		// @1E: iload_2
		// @1F: ineg
		// @20: aload_0
		// @21: getfield int game.C_100280_nf.field_101177_n
		// @24: iadd
		// @25: iadd
		// @26: istore_3
		// @27: iload_1
		// @28: sipush 9692 (0x25DC)
		// @2B: if_icmpeq @39
		// @2E: aconst_null
		// @2F: checkcast game.C_100113_ek
		// @32: putstatic game.C_100113_ek game.C_100280_nf.field_101181_j
		// @35: goto @39
		// @38: athrow
		// @39: iconst_m1
		// @3A: iload_3
		// @3B: iconst_m1
		// @3C: ixor
		// @3D: if_icmpeq @44
		// @40: goto @47
		// @43: athrow
		// @44: ldc ""
		// @46: areturn
		// @47: aload_0
		// @48: getfield byte[] game.C_100280_nf.field_101179_l
		// @4B: sipush 5278 (0x149E)
		// @4E: iload_2
		// @4F: iload_3
		// @50: invokestatic game.C_100280_nf.func_101130_c(byte[], int, int, int)java.lang.String
		// @53: areturn
		// @54: astore_2
		// @55: aload_2
		// @56: new java.lang.StringBuilder
		// @59: dup
		// @5A: invokespecial java.lang.StringBuilder.<init>()void
		// @5D: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @60: bipush 41 (0x29)
		// @62: aaload
		// @63: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @66: iload_1
		// @67: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6A: bipush 41 (0x29)
		// @6C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @72: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @75: athrow
	}
	
	final void func_101131_a(int arg0, long arg1)
	{
		// @00: aload_0
		// @01: getfield byte[] game.C_100280_nf.field_101179_l
		// @04: aload_0
		// @05: dup
		// @06: getfield int game.C_100280_nf.field_101177_n
		// @09: dup_x1
		// @0A: iconst_1
		// @0B: iadd
		// @0C: putfield int game.C_100280_nf.field_101177_n
		// @0F: lload_2
		// @10: ldc 1720440568 (0x668bd6f8)
		// @12: lshr
		// @13: l2i
		// @14: i2b
		// @15: bastore
		// @16: aload_0
		// @17: getfield byte[] game.C_100280_nf.field_101179_l
		// @1A: aload_0
		// @1B: dup
		// @1C: getfield int game.C_100280_nf.field_101177_n
		// @1F: dup_x1
		// @20: iconst_1
		// @21: iadd
		// @22: putfield int game.C_100280_nf.field_101177_n
		// @25: lload_2
		// @26: ldc -509424720 (0xe1a2cbb0)
		// @28: lshr
		// @29: l2i
		// @2A: i2b
		// @2B: bastore
		// @2C: aload_0
		// @2D: getfield byte[] game.C_100280_nf.field_101179_l
		// @30: aload_0
		// @31: dup
		// @32: getfield int game.C_100280_nf.field_101177_n
		// @35: dup_x1
		// @36: iconst_1
		// @37: iadd
		// @38: putfield int game.C_100280_nf.field_101177_n
		// @3B: lload_2
		// @3C: ldc -1607497752 (0xa02f87e8)
		// @3E: lshr
		// @3F: l2i
		// @40: i2b
		// @41: bastore
		// @42: aload_0
		// @43: getfield byte[] game.C_100280_nf.field_101179_l
		// @46: aload_0
		// @47: dup
		// @48: getfield int game.C_100280_nf.field_101177_n
		// @4B: dup_x1
		// @4C: iconst_1
		// @4D: iadd
		// @4E: putfield int game.C_100280_nf.field_101177_n
		// @51: lload_2
		// @52: ldc -1945472032 (0x8c0a73e0)
		// @54: lshr
		// @55: l2i
		// @56: i2b
		// @57: bastore
		// @58: aload_0
		// @59: getfield byte[] game.C_100280_nf.field_101179_l
		// @5C: aload_0
		// @5D: dup
		// @5E: getfield int game.C_100280_nf.field_101177_n
		// @61: dup_x1
		// @62: iconst_1
		// @63: iadd
		// @64: putfield int game.C_100280_nf.field_101177_n
		// @67: lload_2
		// @68: ldc 1442315352 (0x55f7fc58)
		// @6A: lshr
		// @6B: l2i
		// @6C: i2b
		// @6D: bastore
		// @6E: aload_0
		// @6F: getfield byte[] game.C_100280_nf.field_101179_l
		// @72: aload_0
		// @73: dup
		// @74: getfield int game.C_100280_nf.field_101177_n
		// @77: dup_x1
		// @78: iconst_1
		// @79: iadd
		// @7A: putfield int game.C_100280_nf.field_101177_n
		// @7D: lload_2
		// @7E: ldc -1368793136 (0xae69dfd0)
		// @80: lshr
		// @81: l2i
		// @82: i2b
		// @83: bastore
		// @84: iload_1
		// @85: ifeq @89
		// @88: return
		// @89: aload_0
		// @8A: getfield byte[] game.C_100280_nf.field_101179_l
		// @8D: aload_0
		// @8E: dup
		// @8F: getfield int game.C_100280_nf.field_101177_n
		// @92: dup_x1
		// @93: iconst_1
		// @94: iadd
		// @95: putfield int game.C_100280_nf.field_101177_n
		// @98: lload_2
		// @99: ldc -1564145080 (0xa2c50a48)
		// @9B: lshr
		// @9C: l2i
		// @9D: i2b
		// @9E: bastore
		// @9F: aload_0
		// @A0: getfield byte[] game.C_100280_nf.field_101179_l
		// @A3: aload_0
		// @A4: dup
		// @A5: getfield int game.C_100280_nf.field_101177_n
		// @A8: dup_x1
		// @A9: iconst_1
		// @AA: iadd
		// @AB: putfield int game.C_100280_nf.field_101177_n
		// @AE: lload_2
		// @AF: l2i
		// @B0: i2b
		// @B1: bastore
		// @B2: goto @E1
		// @B5: astore #4
		// @B7: aload #4
		// @B9: new java.lang.StringBuilder
		// @BC: dup
		// @BD: invokespecial java.lang.StringBuilder.<init>()void
		// @C0: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @C3: iconst_3
		// @C4: aaload
		// @C5: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @C8: iload_1
		// @C9: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @CC: bipush 44 (0x2C)
		// @CE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D1: lload_2
		// @D2: invokevirtual java.lang.StringBuilder.append(long)java.lang.StringBuilder
		// @D5: bipush 41 (0x29)
		// @D7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @DA: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @DD: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @E0: athrow
		// @E1: return
	}
	
	final int func_101135_b(boolean arg0)
	{
		// @00: aload_0
		// @01: getfield byte[] game.C_100280_nf.field_101179_l
		// @04: aload_0
		// @05: getfield int game.C_100280_nf.field_101177_n
		// @08: baload
		// @09: sipush 255 (0x00FF)
		// @0C: iand
		// @0D: istore_2
		// @0E: iload_1
		// @0F: ifeq @15
		// @12: bipush -11 (0xF5)
		// @14: ireturn
		// @15: iload_2
		// @16: sipush 128 (0x0080)
		// @19: if_icmplt @27
		// @1C: sipush -32768 (0x8000)
		// @1F: aload_0
		// @20: bipush -2 (0xFE)
		// @22: invokevirtual game.C_100280_nf.func_101143_l(int)int
		// @25: iadd
		// @26: ireturn
		// @27: aload_0
		// @28: iconst_0
		// @29: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @2C: ireturn
		// @2D: astore_2
		// @2E: aload_2
		// @2F: new java.lang.StringBuilder
		// @32: dup
		// @33: invokespecial java.lang.StringBuilder.<init>()void
		// @36: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @39: bipush 17 (0x11)
		// @3B: aaload
		// @3C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3F: iload_1
		// @40: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @43: bipush 41 (0x29)
		// @45: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @48: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4E: athrow
	}
	
	final void func_101152_a(int arg0, int arg1)
	{
		// @00: aload_0
		// @01: getfield byte[] game.C_100280_nf.field_101179_l
		// @04: iload_2
		// @05: ineg
		// @06: aload_0
		// @07: getfield int game.C_100280_nf.field_101177_n
		// @0A: bipush -4 (0xFC)
		// @0C: iadd
		// @0D: iadd
		// @0E: iload_2
		// @0F: ldc 233390872 (0xde94318)
		// @11: ishr
		// @12: i2b
		// @13: bastore
		// @14: aload_0
		// @15: getfield byte[] game.C_100280_nf.field_101179_l
		// @18: bipush -3 (0xFD)
		// @1A: iload_2
		// @1B: ineg
		// @1C: iadd
		// @1D: aload_0
		// @1E: getfield int game.C_100280_nf.field_101177_n
		// @21: iadd
		// @22: iload_2
		// @23: ldc -677129712 (0xd7a3d210)
		// @25: ishr
		// @26: i2b
		// @27: bastore
		// @28: iload_1
		// @29: sipush 19304 (0x4B68)
		// @2C: if_icmpeq @3A
		// @2F: aload_0
		// @30: bipush -75 (0xB5)
		// @32: invokevirtual game.C_100280_nf.func_101163_j(int)java.lang.String
		// @35: pop
		// @36: goto @3A
		// @39: athrow
		// @3A: aload_0
		// @3B: getfield byte[] game.C_100280_nf.field_101179_l
		// @3E: bipush -2 (0xFE)
		// @40: iload_2
		// @41: ineg
		// @42: aload_0
		// @43: getfield int game.C_100280_nf.field_101177_n
		// @46: iadd
		// @47: iadd
		// @48: iload_2
		// @49: ldc 2119006888 (0x7e4d7aa8)
		// @4B: ishr
		// @4C: i2b
		// @4D: bastore
		// @4E: aload_0
		// @4F: getfield byte[] game.C_100280_nf.field_101179_l
		// @52: aload_0
		// @53: getfield int game.C_100280_nf.field_101177_n
		// @56: iload_2
		// @57: ineg
		// @58: iadd
		// @59: iconst_m1
		// @5A: iadd
		// @5B: iload_2
		// @5C: i2b
		// @5D: bastore
		// @5E: goto @8C
		// @61: astore_3
		// @62: aload_3
		// @63: new java.lang.StringBuilder
		// @66: dup
		// @67: invokespecial java.lang.StringBuilder.<init>()void
		// @6A: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @6D: bipush 34 (0x22)
		// @6F: aaload
		// @70: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @73: iload_1
		// @74: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @77: bipush 44 (0x2C)
		// @79: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7C: iload_2
		// @7D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @80: bipush 41 (0x29)
		// @82: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @85: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @88: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @8B: athrow
		// @8C: return
	}
	
	final void func_101154_d(int arg0, int arg1)
	{
		// @00: aload_0
		// @01: getfield byte[] game.C_100280_nf.field_101179_l
		// @04: aload_0
		// @05: dup
		// @06: getfield int game.C_100280_nf.field_101177_n
		// @09: dup_x1
		// @0A: iconst_1
		// @0B: iadd
		// @0C: putfield int game.C_100280_nf.field_101177_n
		// @0F: iload_1
		// @10: ldc -988069960 (0xc51b3fb8)
		// @12: ishr
		// @13: i2b
		// @14: bastore
		// @15: aload_0
		// @16: getfield byte[] game.C_100280_nf.field_101179_l
		// @19: aload_0
		// @1A: dup
		// @1B: getfield int game.C_100280_nf.field_101177_n
		// @1E: dup_x1
		// @1F: iconst_1
		// @20: iadd
		// @21: putfield int game.C_100280_nf.field_101177_n
		// @24: iload_1
		// @25: ldc 844756784 (0x3259f730)
		// @27: ishr
		// @28: i2b
		// @29: bastore
		// @2A: aload_0
		// @2B: getfield byte[] game.C_100280_nf.field_101179_l
		// @2E: aload_0
		// @2F: dup
		// @30: getfield int game.C_100280_nf.field_101177_n
		// @33: dup_x1
		// @34: iconst_1
		// @35: iadd
		// @36: putfield int game.C_100280_nf.field_101177_n
		// @39: iload_1
		// @3A: ldc -432396568 (0xe63a26e8)
		// @3C: ishr
		// @3D: i2b
		// @3E: bastore
		// @3F: aload_0
		// @40: getfield byte[] game.C_100280_nf.field_101179_l
		// @43: aload_0
		// @44: dup
		// @45: getfield int game.C_100280_nf.field_101177_n
		// @48: dup_x1
		// @49: iconst_1
		// @4A: iadd
		// @4B: putfield int game.C_100280_nf.field_101177_n
		// @4E: iload_1
		// @4F: i2b
		// @50: bastore
		// @51: bipush -81 (0xAF)
		// @53: bipush -53 (0xCB)
		// @55: iload_2
		// @56: isub
		// @57: bipush 61 (0x3D)
		// @59: idiv
		// @5A: idiv
		// @5B: istore_3
		// @5C: goto @8A
		// @5F: astore_3
		// @60: aload_3
		// @61: new java.lang.StringBuilder
		// @64: dup
		// @65: invokespecial java.lang.StringBuilder.<init>()void
		// @68: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @6B: bipush 21 (0x15)
		// @6D: aaload
		// @6E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @71: iload_1
		// @72: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @75: bipush 44 (0x2C)
		// @77: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7A: iload_2
		// @7B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7E: bipush 41 (0x29)
		// @80: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @83: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @86: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @89: athrow
		// @8A: return
	}
	
	final int func_101145_d(byte arg0)
	{
		// @00: aload_0
		// @01: dup
		// @02: getfield int game.C_100280_nf.field_101177_n
		// @05: iconst_3
		// @06: iadd
		// @07: putfield int game.C_100280_nf.field_101177_n
		// @0A: iload_1
		// @0B: bipush 113 (0x71)
		// @0D: if_icmpge @1C
		// @10: aload_0
		// @11: bipush 78 (0x4E)
		// @13: bipush 55 (0x37)
		// @15: invokevirtual game.C_100280_nf.func_101139_c(int, byte)void
		// @18: goto @1C
		// @1B: athrow
		// @1C: sipush 255 (0x00FF)
		// @1F: aload_0
		// @20: getfield byte[] game.C_100280_nf.field_101179_l
		// @23: aload_0
		// @24: getfield int game.C_100280_nf.field_101177_n
		// @27: iconst_2
		// @28: isub
		// @29: baload
		// @2A: iand
		// @2B: ldc 1804179720 (0x6b899908)
		// @2D: ishl
		// @2E: aload_0
		// @2F: getfield byte[] game.C_100280_nf.field_101179_l
		// @32: bipush -3 (0xFD)
		// @34: aload_0
		// @35: getfield int game.C_100280_nf.field_101177_n
		// @38: iadd
		// @39: baload
		// @3A: sipush 255 (0x00FF)
		// @3D: iand
		// @3E: ldc 169474608 (0xa19fa30)
		// @40: ishl
		// @41: iadd
		// @42: aload_0
		// @43: getfield byte[] game.C_100280_nf.field_101179_l
		// @46: aload_0
		// @47: getfield int game.C_100280_nf.field_101177_n
		// @4A: iconst_m1
		// @4B: iadd
		// @4C: baload
		// @4D: sipush 255 (0x00FF)
		// @50: iand
		// @51: ineg
		// @52: isub
		// @53: ireturn
		// @54: astore_2
		// @55: aload_2
		// @56: new java.lang.StringBuilder
		// @59: dup
		// @5A: invokespecial java.lang.StringBuilder.<init>()void
		// @5D: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @60: iconst_4
		// @61: aaload
		// @62: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @65: iload_1
		// @66: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @69: bipush 41 (0x29)
		// @6B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @71: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @74: athrow
	}
	
	final byte func_101146_c(byte arg0)
	{
		// @00: iload_1
		// @01: bipush -109 (0x93)
		// @03: if_icmplt @08
		// @06: iconst_4
		// @07: ireturn
		// @08: aload_0
		// @09: getfield byte[] game.C_100280_nf.field_101179_l
		// @0C: aload_0
		// @0D: dup
		// @0E: getfield int game.C_100280_nf.field_101177_n
		// @11: dup_x1
		// @12: iconst_1
		// @13: iadd
		// @14: putfield int game.C_100280_nf.field_101177_n
		// @17: baload
		// @18: ireturn
		// @19: astore_2
		// @1A: aload_2
		// @1B: new java.lang.StringBuilder
		// @1E: dup
		// @1F: invokespecial java.lang.StringBuilder.<init>()void
		// @22: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @25: bipush 19 (0x13)
		// @27: aaload
		// @28: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2B: iload_1
		// @2C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2F: bipush 41 (0x29)
		// @31: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @34: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @37: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3A: athrow
	}
	
	final void func_101142_a(byte arg0, long arg1)
	{
		// @00: aload_0
		// @01: getfield byte[] game.C_100280_nf.field_101179_l
		// @04: aload_0
		// @05: dup
		// @06: getfield int game.C_100280_nf.field_101177_n
		// @09: dup_x1
		// @0A: iconst_1
		// @0B: iadd
		// @0C: putfield int game.C_100280_nf.field_101177_n
		// @0F: lload_2
		// @10: ldc 569569824 (0x21f2f220)
		// @12: lshr
		// @13: l2i
		// @14: i2b
		// @15: bastore
		// @16: aload_0
		// @17: getfield byte[] game.C_100280_nf.field_101179_l
		// @1A: aload_0
		// @1B: dup
		// @1C: getfield int game.C_100280_nf.field_101177_n
		// @1F: dup_x1
		// @20: iconst_1
		// @21: iadd
		// @22: putfield int game.C_100280_nf.field_101177_n
		// @25: lload_2
		// @26: ldc -1909882088 (0x8e298318)
		// @28: lshr
		// @29: l2i
		// @2A: i2b
		// @2B: bastore
		// @2C: aload_0
		// @2D: getfield byte[] game.C_100280_nf.field_101179_l
		// @30: aload_0
		// @31: dup
		// @32: getfield int game.C_100280_nf.field_101177_n
		// @35: dup_x1
		// @36: iconst_1
		// @37: iadd
		// @38: putfield int game.C_100280_nf.field_101177_n
		// @3B: lload_2
		// @3C: ldc -155222896 (0xf6bf7c90)
		// @3E: lshr
		// @3F: l2i
		// @40: i2b
		// @41: bastore
		// @42: aload_0
		// @43: getfield byte[] game.C_100280_nf.field_101179_l
		// @46: aload_0
		// @47: dup
		// @48: getfield int game.C_100280_nf.field_101177_n
		// @4B: dup_x1
		// @4C: iconst_1
		// @4D: iadd
		// @4E: putfield int game.C_100280_nf.field_101177_n
		// @51: lload_2
		// @52: ldc 678573896 (0x28723748)
		// @54: lshr
		// @55: l2i
		// @56: i2b
		// @57: bastore
		// @58: iload_1
		// @59: bipush -2 (0xFE)
		// @5B: if_icmplt @6B
		// @5E: aload_0
		// @5F: bipush -8 (0xF8)
		// @61: ldc2_w 124
		// @64: invokevirtual game.C_100280_nf.func_101131_a(int, long)void
		// @67: goto @6B
		// @6A: athrow
		// @6B: aload_0
		// @6C: getfield byte[] game.C_100280_nf.field_101179_l
		// @6F: aload_0
		// @70: dup
		// @71: getfield int game.C_100280_nf.field_101177_n
		// @74: dup_x1
		// @75: iconst_1
		// @76: iadd
		// @77: putfield int game.C_100280_nf.field_101177_n
		// @7A: lload_2
		// @7B: l2i
		// @7C: i2b
		// @7D: bastore
		// @7E: goto @AE
		// @81: astore #4
		// @83: aload #4
		// @85: new java.lang.StringBuilder
		// @88: dup
		// @89: invokespecial java.lang.StringBuilder.<init>()void
		// @8C: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @8F: bipush 35 (0x23)
		// @91: aaload
		// @92: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @95: iload_1
		// @96: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @99: bipush 44 (0x2C)
		// @9B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9E: lload_2
		// @9F: invokevirtual java.lang.StringBuilder.append(long)java.lang.StringBuilder
		// @A2: bipush 41 (0x29)
		// @A4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A7: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @AA: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @AD: athrow
		// @AE: return
	}
	
	static final C_100037_wb func_101140_b(int arg0, boolean arg1)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore_3
		// @004: iload_0
		// @005: istore_2
		// @006: bipush -105 (0x97)
		// @008: iload_2
		// @009: iconst_m1
		// @00A: ixor
		// @00B: if_icmpne @016
		// @00E: iload_3
		// @00F: ifeq @128
		// @012: goto @016
		// @015: athrow
		// @016: bipush 105 (0x69)
		// @018: iload_2
		// @019: if_icmpeq @12E
		// @01C: goto @020
		// @01F: athrow
		// @020: iload_2
		// @021: iconst_m1
		// @022: ixor
		// @023: bipush -107 (0x95)
		// @025: if_icmpeq @134
		// @028: goto @02C
		// @02B: athrow
		// @02C: bipush 107 (0x6B)
		// @02E: iload_2
		// @02F: if_icmpeq @13A
		// @032: goto @036
		// @035: athrow
		// @036: iload_2
		// @037: iconst_m1
		// @038: ixor
		// @039: bipush -109 (0x93)
		// @03B: if_icmpeq @140
		// @03E: goto @042
		// @041: athrow
		// @042: bipush -110 (0x92)
		// @044: iload_2
		// @045: iconst_m1
		// @046: ixor
		// @047: if_icmpne @056
		// @04A: goto @04E
		// @04D: athrow
		// @04E: iload_3
		// @04F: ifeq @146
		// @052: goto @056
		// @055: athrow
		// @056: bipush -111 (0x91)
		// @058: iload_2
		// @059: iconst_m1
		// @05A: ixor
		// @05B: if_icmpeq @14D
		// @05E: goto @062
		// @061: athrow
		// @062: iload_2
		// @063: iconst_m1
		// @064: ixor
		// @065: bipush -112 (0x90)
		// @067: if_icmpne @076
		// @06A: goto @06E
		// @06D: athrow
		// @06E: iload_3
		// @06F: ifeq @154
		// @072: goto @076
		// @075: athrow
		// @076: iload_2
		// @077: bipush 112 (0x70)
		// @079: if_icmpeq @15B
		// @07C: goto @080
		// @07F: athrow
		// @080: iload_2
		// @081: iconst_m1
		// @082: ixor
		// @083: bipush -114 (0x8E)
		// @085: if_icmpeq @162
		// @088: goto @08C
		// @08B: athrow
		// @08C: bipush 114 (0x72)
		// @08E: iload_2
		// @08F: if_icmpne @09E
		// @092: goto @096
		// @095: athrow
		// @096: iload_3
		// @097: ifeq @169
		// @09A: goto @09E
		// @09D: athrow
		// @09E: bipush -116 (0x8C)
		// @0A0: iload_2
		// @0A1: iconst_m1
		// @0A2: ixor
		// @0A3: if_icmpeq @170
		// @0A6: goto @0AA
		// @0A9: athrow
		// @0AA: bipush 116 (0x74)
		// @0AC: iload_2
		// @0AD: if_icmpeq @177
		// @0B0: goto @0B4
		// @0B3: athrow
		// @0B4: iload_2
		// @0B5: iconst_m1
		// @0B6: ixor
		// @0B7: bipush -118 (0x8A)
		// @0B9: if_icmpne @0C8
		// @0BC: goto @0C0
		// @0BF: athrow
		// @0C0: iload_3
		// @0C1: ifeq @17E
		// @0C4: goto @0C8
		// @0C7: athrow
		// @0C8: iload_2
		// @0C9: iconst_m1
		// @0CA: ixor
		// @0CB: bipush -119 (0x89)
		// @0CD: if_icmpne @0DC
		// @0D0: goto @0D4
		// @0D3: athrow
		// @0D4: iload_3
		// @0D5: ifeq @185
		// @0D8: goto @0DC
		// @0DB: athrow
		// @0DC: iload_2
		// @0DD: iconst_m1
		// @0DE: ixor
		// @0DF: bipush -120 (0x88)
		// @0E1: if_icmpne @0F0
		// @0E4: goto @0E8
		// @0E7: athrow
		// @0E8: iload_3
		// @0E9: ifeq @18C
		// @0EC: goto @0F0
		// @0EF: athrow
		// @0F0: iload_2
		// @0F1: bipush 120 (0x78)
		// @0F3: if_icmpeq @193
		// @0F6: goto @0FA
		// @0F9: athrow
		// @0FA: bipush -122 (0x86)
		// @0FC: iload_2
		// @0FD: iconst_m1
		// @0FE: ixor
		// @0FF: if_icmpeq @19A
		// @102: goto @106
		// @105: athrow
		// @106: bipush -123 (0x85)
		// @108: iload_2
		// @109: iconst_m1
		// @10A: ixor
		// @10B: if_icmpne @11A
		// @10E: goto @112
		// @111: athrow
		// @112: iload_3
		// @113: ifeq @1A1
		// @116: goto @11A
		// @119: athrow
		// @11A: iload_2
		// @11B: bipush 123 (0x7B)
		// @11D: if_icmpeq @1A8
		// @120: goto @124
		// @123: athrow
		// @124: goto @1AE
		// @127: athrow
		// @128: getstatic game.C_100037_wb[] game.C_100066_dl.field_101640_v
		// @12B: iconst_0
		// @12C: aaload
		// @12D: areturn
		// @12E: getstatic game.C_100037_wb[] game.C_100066_dl.field_101640_v
		// @131: iconst_1
		// @132: aaload
		// @133: areturn
		// @134: getstatic game.C_100037_wb[] game.C_100066_dl.field_101640_v
		// @137: iconst_2
		// @138: aaload
		// @139: areturn
		// @13A: getstatic game.C_100037_wb[] game.C_100066_dl.field_101640_v
		// @13D: iconst_3
		// @13E: aaload
		// @13F: areturn
		// @140: getstatic game.C_100037_wb[] game.C_100066_dl.field_101640_v
		// @143: iconst_4
		// @144: aaload
		// @145: areturn
		// @146: getstatic game.C_100037_wb[] game.C_100066_dl.field_101640_v
		// @149: bipush 6 (0x06)
		// @14B: aaload
		// @14C: areturn
		// @14D: getstatic game.C_100037_wb[] game.C_100066_dl.field_101640_v
		// @150: bipush 7 (0x07)
		// @152: aaload
		// @153: areturn
		// @154: getstatic game.C_100037_wb[] game.C_100066_dl.field_101640_v
		// @157: bipush 8 (0x08)
		// @159: aaload
		// @15A: areturn
		// @15B: getstatic game.C_100037_wb[] game.C_100066_dl.field_101640_v
		// @15E: bipush 9 (0x09)
		// @160: aaload
		// @161: areturn
		// @162: getstatic game.C_100037_wb[] game.C_100066_dl.field_101640_v
		// @165: bipush 10 (0x0A)
		// @167: aaload
		// @168: areturn
		// @169: getstatic game.C_100037_wb[] game.C_100066_dl.field_101640_v
		// @16C: bipush 11 (0x0B)
		// @16E: aaload
		// @16F: areturn
		// @170: getstatic game.C_100037_wb[] game.C_100066_dl.field_101640_v
		// @173: bipush 12 (0x0C)
		// @175: aaload
		// @176: areturn
		// @177: getstatic game.C_100037_wb[] game.C_100066_dl.field_101640_v
		// @17A: bipush 13 (0x0D)
		// @17C: aaload
		// @17D: areturn
		// @17E: getstatic game.C_100037_wb[] game.C_100066_dl.field_101640_v
		// @181: bipush 14 (0x0E)
		// @183: aaload
		// @184: areturn
		// @185: getstatic game.C_100037_wb[] game.C_100066_dl.field_101640_v
		// @188: bipush 15 (0x0F)
		// @18A: aaload
		// @18B: areturn
		// @18C: getstatic game.C_100037_wb[] game.C_100066_dl.field_101640_v
		// @18F: bipush 16 (0x10)
		// @191: aaload
		// @192: areturn
		// @193: getstatic game.C_100037_wb[] game.C_100066_dl.field_101640_v
		// @196: bipush 17 (0x11)
		// @198: aaload
		// @199: areturn
		// @19A: getstatic game.C_100037_wb[] game.C_100066_dl.field_101640_v
		// @19D: bipush 18 (0x12)
		// @19F: aaload
		// @1A0: areturn
		// @1A1: getstatic game.C_100037_wb[] game.C_100066_dl.field_101640_v
		// @1A4: bipush 19 (0x13)
		// @1A6: aaload
		// @1A7: areturn
		// @1A8: getstatic game.C_100037_wb[] game.C_100066_dl.field_101640_v
		// @1AB: iconst_5
		// @1AC: aaload
		// @1AD: areturn
		// @1AE: iload_1
		// @1AF: iconst_1
		// @1B0: if_icmpeq @1BB
		// @1B3: iconst_1
		// @1B4: invokestatic game.C_100280_nf.func_101168_d(boolean)void
		// @1B7: goto @1BB
		// @1BA: athrow
		// @1BB: sipush -201 (0xFF37)
		// @1BE: iload_0
		// @1BF: iconst_m1
		// @1C0: ixor
		// @1C1: if_icmplt @1D2
		// @1C4: bipush -122 (0x86)
		// @1C6: iload_0
		// @1C7: sipush -199 (0xFF39)
		// @1CA: iadd
		// @1CB: invokestatic game.C_100242_oh.func_106339_a(byte, int)game.C_100153_be
		// @1CE: invokevirtual game.C_100153_be.func_105309_b()game.C_100037_wb
		// @1D1: areturn
		// @1D2: iload_0
		// @1D3: getstatic game.C_100037_wb[] game.C_100013_fn.field_103739_d
		// @1D6: arraylength
		// @1D7: if_icmplt @1DC
		// @1DA: aconst_null
		// @1DB: areturn
		// @1DC: getstatic game.C_100037_wb[] game.C_100013_fn.field_103739_d
		// @1DF: iload_0
		// @1E0: aaload
		// @1E1: areturn
		// @1E2: astore_2
		// @1E3: aload_2
		// @1E4: new java.lang.StringBuilder
		// @1E7: dup
		// @1E8: invokespecial java.lang.StringBuilder.<init>()void
		// @1EB: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @1EE: bipush 33 (0x21)
		// @1F0: aaload
		// @1F1: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1F4: iload_0
		// @1F5: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1F8: bipush 44 (0x2C)
		// @1FA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1FD: iload_1
		// @1FE: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @201: bipush 41 (0x29)
		// @203: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @206: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @209: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @20C: athrow
	}
	
	final void func_101139_c(int arg0, byte arg1)
	{
		// @00: aload_0
		// @01: getfield byte[] game.C_100280_nf.field_101179_l
		// @04: iconst_m1
		// @05: iload_1
		// @06: ineg
		// @07: iadd
		// @08: aload_0
		// @09: getfield int game.C_100280_nf.field_101177_n
		// @0C: iadd
		// @0D: iload_1
		// @0E: i2b
		// @0F: bastore
		// @10: iload_2
		// @11: bipush -75 (0xB5)
		// @13: if_icmple @1D
		// @16: aload_0
		// @17: bipush -98 (0x9E)
		// @19: iconst_1
		// @1A: invokevirtual game.C_100280_nf.func_101162_a(int, boolean)void
		// @1D: goto @4B
		// @20: astore_3
		// @21: aload_3
		// @22: new java.lang.StringBuilder
		// @25: dup
		// @26: invokespecial java.lang.StringBuilder.<init>()void
		// @29: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @2C: bipush 43 (0x2B)
		// @2E: aaload
		// @2F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @32: iload_1
		// @33: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @36: bipush 44 (0x2C)
		// @38: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3B: iload_2
		// @3C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3F: bipush 41 (0x29)
		// @41: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @44: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @47: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4A: athrow
		// @4B: return
	}
	
	final String func_101144_g(int arg0)
	{
		// @00: aload_0
		// @01: getfield byte[] game.C_100280_nf.field_101179_l
		// @04: aload_0
		// @05: dup
		// @06: getfield int game.C_100280_nf.field_101177_n
		// @09: dup_x1
		// @0A: iconst_1
		// @0B: iadd
		// @0C: putfield int game.C_100280_nf.field_101177_n
		// @0F: baload
		// @10: istore_2
		// @11: iload_1
		// @12: iload_2
		// @13: iconst_m1
		// @14: ixor
		// @15: if_icmpne @1C
		// @18: goto @26
		// @1B: athrow
		// @1C: new java.lang.IllegalStateException
		// @1F: dup
		// @20: ldc ""
		// @22: invokespecial java.lang.IllegalStateException.<init>(java.lang.String)void
		// @25: athrow
		// @26: aload_0
		// @27: getfield int game.C_100280_nf.field_101177_n
		// @2A: istore_3
		// @2B: iconst_0
		// @2C: aload_0
		// @2D: getfield byte[] game.C_100280_nf.field_101179_l
		// @30: aload_0
		// @31: dup
		// @32: getfield int game.C_100280_nf.field_101177_n
		// @35: dup_x1
		// @36: iconst_1
		// @37: iadd
		// @38: putfield int game.C_100280_nf.field_101177_n
		// @3B: baload
		// @3C: if_icmpeq @43
		// @3F: goto @2B
		// @42: athrow
		// @43: iload_3
		// @44: ineg
		// @45: aload_0
		// @46: getfield int game.C_100280_nf.field_101177_n
		// @49: iconst_1
		// @4A: isub
		// @4B: iadd
		// @4C: istore #4
		// @4E: iconst_0
		// @4F: iload #4
		// @51: if_icmpne @57
		// @54: ldc ""
		// @56: areturn
		// @57: aload_0
		// @58: getfield byte[] game.C_100280_nf.field_101179_l
		// @5B: iload_1
		// @5C: sipush 5279 (0x149F)
		// @5F: iadd
		// @60: iload_3
		// @61: iload #4
		// @63: invokestatic game.C_100280_nf.func_101130_c(byte[], int, int, int)java.lang.String
		// @66: areturn
		// @67: astore_2
		// @68: aload_2
		// @69: new java.lang.StringBuilder
		// @6C: dup
		// @6D: invokespecial java.lang.StringBuilder.<init>()void
		// @70: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @73: bipush 13 (0x0D)
		// @75: aaload
		// @76: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @79: iload_1
		// @7A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7D: bipush 41 (0x29)
		// @7F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @82: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @85: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @88: athrow
	}
	
	final int func_101138_a(byte arg0)
	{
		// @00: sipush 255 (0x00FF)
		// @03: aload_0
		// @04: getfield byte[] game.C_100280_nf.field_101179_l
		// @07: aload_0
		// @08: getfield int game.C_100280_nf.field_101177_n
		// @0B: baload
		// @0C: iand
		// @0D: istore_2
		// @0E: bipush 114 (0x72)
		// @10: iload_1
		// @11: bipush -63 (0xC1)
		// @13: isub
		// @14: bipush 47 (0x2F)
		// @16: idiv
		// @17: irem
		// @18: istore_3
		// @19: iload_2
		// @1A: sipush 128 (0x0080)
		// @1D: if_icmplt @2A
		// @20: ldc -49152 (0xffff4000)
		// @22: aload_0
		// @23: bipush -2 (0xFE)
		// @25: invokevirtual game.C_100280_nf.func_101143_l(int)int
		// @28: iadd
		// @29: ireturn
		// @2A: aload_0
		// @2B: iconst_0
		// @2C: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @2F: bipush 64 (0x40)
		// @31: isub
		// @32: ireturn
		// @33: astore_2
		// @34: aload_2
		// @35: new java.lang.StringBuilder
		// @38: dup
		// @39: invokespecial java.lang.StringBuilder.<init>()void
		// @3C: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @3F: bipush 7 (0x07)
		// @41: aaload
		// @42: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @45: iload_1
		// @46: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @49: bipush 41 (0x29)
		// @4B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @51: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @54: athrow
	}
	
	final int func_101157_b(int arg0, int arg1)
	{
		// @00: aload_0
		// @01: getfield byte[] game.C_100280_nf.field_101179_l
		// @04: bipush 55 (0x37)
		// @06: iload_1
		// @07: aload_0
		// @08: getfield int game.C_100280_nf.field_101177_n
		// @0B: invokestatic game.C_100056_de.func_103179_a(byte[], byte, int, int)int
		// @0E: istore_3
		// @0F: aload_0
		// @10: iload_3
		// @11: iload_2
		// @12: sipush -16330 (0xC036)
		// @15: ixor
		// @16: invokevirtual game.C_100280_nf.func_101154_d(int, int)void
		// @19: iload_2
		// @1A: sipush -16384 (0xC000)
		// @1D: if_icmpeq @23
		// @20: bipush -118 (0x8A)
		// @22: ireturn
		// @23: iload_3
		// @24: ireturn
		// @25: astore_3
		// @26: aload_3
		// @27: new java.lang.StringBuilder
		// @2A: dup
		// @2B: invokespecial java.lang.StringBuilder.<init>()void
		// @2E: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @31: bipush 12 (0x0C)
		// @33: aaload
		// @34: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @37: iload_1
		// @38: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3B: bipush 44 (0x2C)
		// @3D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @40: iload_2
		// @41: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @44: bipush 41 (0x29)
		// @46: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @49: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4F: athrow
	}
	
	final void func_101151_g(int arg0, int arg1)
	{
		// @00: aload_0
		// @01: getfield byte[] game.C_100280_nf.field_101179_l
		// @04: aload_0
		// @05: dup
		// @06: getfield int game.C_100280_nf.field_101177_n
		// @09: dup_x1
		// @0A: iconst_1
		// @0B: iadd
		// @0C: putfield int game.C_100280_nf.field_101177_n
		// @0F: iload_2
		// @10: ldc 846581840 (0x3275d050)
		// @12: ishr
		// @13: i2b
		// @14: bastore
		// @15: iload_1
		// @16: sipush -26801 (0x974F)
		// @19: if_icmpeq @27
		// @1C: aconst_null
		// @1D: checkcast game.C_100128_ca
		// @20: putstatic game.C_100128_ca game.C_100280_nf.field_101172_t
		// @23: goto @27
		// @26: athrow
		// @27: aload_0
		// @28: getfield byte[] game.C_100280_nf.field_101179_l
		// @2B: aload_0
		// @2C: dup
		// @2D: getfield int game.C_100280_nf.field_101177_n
		// @30: dup_x1
		// @31: iconst_1
		// @32: iadd
		// @33: putfield int game.C_100280_nf.field_101177_n
		// @36: iload_2
		// @37: ldc -1327969880 (0xb0d8c9a8)
		// @39: ishr
		// @3A: i2b
		// @3B: bastore
		// @3C: aload_0
		// @3D: getfield byte[] game.C_100280_nf.field_101179_l
		// @40: aload_0
		// @41: dup
		// @42: getfield int game.C_100280_nf.field_101177_n
		// @45: dup_x1
		// @46: iconst_1
		// @47: iadd
		// @48: putfield int game.C_100280_nf.field_101177_n
		// @4B: iload_2
		// @4C: i2b
		// @4D: bastore
		// @4E: goto @7C
		// @51: astore_3
		// @52: aload_3
		// @53: new java.lang.StringBuilder
		// @56: dup
		// @57: invokespecial java.lang.StringBuilder.<init>()void
		// @5A: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @5D: bipush 30 (0x1E)
		// @5F: aaload
		// @60: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @63: iload_1
		// @64: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @67: bipush 44 (0x2C)
		// @69: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6C: iload_2
		// @6D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @70: bipush 41 (0x29)
		// @72: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @75: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @78: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @7B: athrow
		// @7C: return
	}
	
	final void func_101147_a(byte arg0, int[] arg1)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #10
		// @005: iload_1
		// @006: bipush 29 (0x1D)
		// @008: if_icmpeq @00C
		// @00B: return
		// @00C: aload_0
		// @00D: getfield int game.C_100280_nf.field_101177_n
		// @010: bipush 8 (0x08)
		// @012: idiv
		// @013: istore_3
		// @014: aload_0
		// @015: iconst_0
		// @016: putfield int game.C_100280_nf.field_101177_n
		// @019: iconst_0
		// @01A: istore #4
		// @01C: iload #4
		// @01E: iconst_m1
		// @01F: ixor
		// @020: iload_3
		// @021: iconst_m1
		// @022: ixor
		// @023: if_icmple @0CA
		// @026: aload_0
		// @027: sipush -1543 (0xF9F9)
		// @02A: invokevirtual game.C_100280_nf.func_101171_e(int)int
		// @02D: istore #5
		// @02F: aload_0
		// @030: sipush -1543 (0xF9F9)
		// @033: invokevirtual game.C_100280_nf.func_101171_e(int)int
		// @036: istore #6
		// @038: iconst_0
		// @039: istore #7
		// @03B: ldc -1640531527 (0x9e3779b9)
		// @03D: istore #8
		// @03F: iload #10
		// @041: ifne @109
		// @044: bipush 32 (0x20)
		// @046: istore #9
		// @048: iload #9
		// @04A: iinc #9 +255
		// @04D: iconst_m1
		// @04E: ixor
		// @04F: iconst_m1
		// @050: if_icmpge @0A7
		// @053: iload #5
		// @055: iload #6
		// @057: iload #6
		// @059: ldc -1477749404 (0xa7eb5564)
		// @05B: ishl
		// @05C: iload #6
		// @05E: ldc -626744411 (0xdaa4a3a5)
		// @060: iushr
		// @061: ixor
		// @062: iadd
		// @063: iload #7
		// @065: aload_2
		// @066: iload #7
		// @068: iconst_3
		// @069: iand
		// @06A: iaload
		// @06B: ineg
		// @06C: isub
		// @06D: ixor
		// @06E: iadd
		// @06F: istore #5
		// @071: iload #7
		// @073: iload #8
		// @075: iadd
		// @076: istore #7
		// @078: iload #6
		// @07A: iload #5
		// @07C: ldc 1725791652 (0x66dd7da4)
		// @07E: ishl
		// @07F: iload #5
		// @081: ldc 661527621 (0x276e1c45)
		// @083: iushr
		// @084: ixor
		// @085: iload #5
		// @087: iadd
		// @088: aload_2
		// @089: iload #7
		// @08B: ldc 475728715 (0x1c5b0b4b)
		// @08D: iushr
		// @08E: ldc 2023751683 (0x78a00003)
		// @090: iand
		// @091: iaload
		// @092: iload #7
		// @094: iadd
		// @095: ixor
		// @096: iadd
		// @097: istore #6
		// @099: iload #10
		// @09B: ifne @0C5
		// @09E: iload #10
		// @0A0: ifeq @048
		// @0A3: goto @0A7
		// @0A6: athrow
		// @0A7: aload_0
		// @0A8: dup
		// @0A9: getfield int game.C_100280_nf.field_101177_n
		// @0AC: bipush 8 (0x08)
		// @0AE: isub
		// @0AF: putfield int game.C_100280_nf.field_101177_n
		// @0B2: aload_0
		// @0B3: iload #5
		// @0B5: bipush 34 (0x22)
		// @0B7: invokevirtual game.C_100280_nf.func_101154_d(int, int)void
		// @0BA: aload_0
		// @0BB: iload #6
		// @0BD: bipush -118 (0x8A)
		// @0BF: invokevirtual game.C_100280_nf.func_101154_d(int, int)void
		// @0C2: iinc #4 +1
		// @0C5: iload #10
		// @0C7: ifeq @01C
		// @0CA: goto @109
		// @0CD: astore_3
		// @0CE: aload_3
		// @0CF: new java.lang.StringBuilder
		// @0D2: dup
		// @0D3: invokespecial java.lang.StringBuilder.<init>()void
		// @0D6: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @0D9: bipush 24 (0x18)
		// @0DB: aaload
		// @0DC: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0DF: iload_1
		// @0E0: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0E3: bipush 44 (0x2C)
		// @0E5: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0E8: aload_2
		// @0E9: ifnull @0F5
		// @0EC: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @0EF: iconst_1
		// @0F0: aaload
		// @0F1: goto @0FA
		// @0F4: athrow
		// @0F5: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @0F8: iconst_2
		// @0F9: aaload
		// @0FA: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0FD: bipush 41 (0x29)
		// @0FF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @102: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @105: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @108: athrow
		// @109: return
	}
	
	static final String func_101130_c(byte[] arg0, int arg1, int arg2, int arg3)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #9
		// @05: iload_3
		// @06: newarray char[]
		// @08: astore #4
		// @0A: iconst_0
		// @0B: istore #5
		// @0D: iload_1
		// @0E: sipush 5278 (0x149E)
		// @11: if_icmpeq @1F
		// @14: aconst_null
		// @15: checkcast java.lang.String
		// @18: putstatic java.lang.String game.C_100280_nf.field_101180_m
		// @1B: goto @1F
		// @1E: athrow
		// @1F: iconst_0
		// @20: istore #6
		// @22: iload #6
		// @24: iload_3
		// @25: if_icmpge @8C
		// @28: sipush 255 (0x00FF)
		// @2B: aload_0
		// @2C: iload_2
		// @2D: iload #6
		// @2F: iadd
		// @30: baload
		// @31: iand
		// @32: istore #7
		// @34: iconst_0
		// @35: iload #7
		// @37: if_icmpne @43
		// @3A: iload #9
		// @3C: ifeq @84
		// @3F: goto @43
		// @42: athrow
		// @43: sipush 128 (0x0080)
		// @46: iload #7
		// @48: if_icmpgt @79
		// @4B: goto @4F
		// @4E: athrow
		// @4F: sipush 160 (0x00A0)
		// @52: iload #7
		// @54: if_icmple @79
		// @57: goto @5B
		// @5A: athrow
		// @5B: getstatic char[] game.C_100133_tk.field_104997_d
		// @5E: iload #7
		// @60: sipush 128 (0x0080)
		// @63: isub
		// @64: caload
		// @65: istore #8
		// @67: iconst_0
		// @68: iload #8
		// @6A: if_icmpeq @71
		// @6D: goto @75
		// @70: athrow
		// @71: bipush 63 (0x3F)
		// @73: istore #8
		// @75: iload #8
		// @77: istore #7
		// @79: aload #4
		// @7B: iload #5
		// @7D: iinc #5 +1
		// @80: iload #7
		// @82: i2c
		// @83: castore
		// @84: iinc #6 +1
		// @87: iload #9
		// @89: ifeq @22
		// @8C: new java.lang.String
		// @8F: dup
		// @90: aload #4
		// @92: iconst_0
		// @93: iload #5
		// @95: invokespecial java.lang.String.<init>(char[], int, int)void
		// @98: areturn
		// @99: astore #4
		// @9B: aload #4
		// @9D: new java.lang.StringBuilder
		// @A0: dup
		// @A1: invokespecial java.lang.StringBuilder.<init>()void
		// @A4: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @A7: bipush 32 (0x20)
		// @A9: aaload
		// @AA: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @AD: aload_0
		// @AE: ifnull @BA
		// @B1: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @B4: iconst_1
		// @B5: aaload
		// @B6: goto @BF
		// @B9: athrow
		// @BA: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @BD: iconst_2
		// @BE: aaload
		// @BF: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @C2: bipush 44 (0x2C)
		// @C4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C7: iload_1
		// @C8: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @CB: bipush 44 (0x2C)
		// @CD: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D0: iload_2
		// @D1: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @D4: bipush 44 (0x2C)
		// @D6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D9: iload_3
		// @DA: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @DD: bipush 41 (0x29)
		// @DF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @E2: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @E5: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @E8: athrow
	}
	
	C_100280_nf(int arg0)
	{
		// @00: aload_0
		// @01: invokespecial game.C_100158_da.<init>()void
		// @04: aload_0
		// @05: bipush 117 (0x75)
		// @07: iload_1
		// @08: invokestatic game.C_100074_g.func_104406_a(int, int)byte[]
		// @0B: putfield byte[] game.C_100280_nf.field_101179_l
		// @0E: aload_0
		// @0F: iconst_0
		// @10: putfield int game.C_100280_nf.field_101177_n
		// @13: goto @38
		// @16: astore_2
		// @17: aload_2
		// @18: new java.lang.StringBuilder
		// @1B: dup
		// @1C: invokespecial java.lang.StringBuilder.<init>()void
		// @1F: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @22: bipush 8 (0x08)
		// @24: aaload
		// @25: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @28: iload_1
		// @29: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2C: bipush 41 (0x29)
		// @2E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @31: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @34: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @37: athrow
		// @38: return
	}
	
	final void func_101141_d(int arg0, byte arg1)
	{
		// @00: aload_0
		// @01: getfield byte[] game.C_100280_nf.field_101179_l
		// @04: aload_0
		// @05: dup
		// @06: getfield int game.C_100280_nf.field_101177_n
		// @09: dup_x1
		// @0A: iconst_1
		// @0B: iadd
		// @0C: putfield int game.C_100280_nf.field_101177_n
		// @0F: iload_1
		// @10: ldc -365903576 (0xea30c128)
		// @12: ishr
		// @13: i2b
		// @14: bastore
		// @15: bipush 25 (0x19)
		// @17: iload_2
		// @18: iconst_m1
		// @19: isub
		// @1A: bipush 49 (0x31)
		// @1C: idiv
		// @1D: idiv
		// @1E: istore_3
		// @1F: aload_0
		// @20: getfield byte[] game.C_100280_nf.field_101179_l
		// @23: aload_0
		// @24: dup
		// @25: getfield int game.C_100280_nf.field_101177_n
		// @28: dup_x1
		// @29: iconst_1
		// @2A: iadd
		// @2B: putfield int game.C_100280_nf.field_101177_n
		// @2E: iload_1
		// @2F: i2b
		// @30: bastore
		// @31: goto @5F
		// @34: astore_3
		// @35: aload_3
		// @36: new java.lang.StringBuilder
		// @39: dup
		// @3A: invokespecial java.lang.StringBuilder.<init>()void
		// @3D: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @40: bipush 27 (0x1B)
		// @42: aaload
		// @43: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @46: iload_1
		// @47: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4A: bipush 44 (0x2C)
		// @4C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4F: iload_2
		// @50: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @53: bipush 41 (0x29)
		// @55: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @58: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @5B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @5E: athrow
		// @5F: return
	}
	
	C_100280_nf(byte[] arg0)
	{
		// @00: aload_0
		// @01: invokespecial game.C_100158_da.<init>()void
		// @04: aload_0
		// @05: iconst_0
		// @06: putfield int game.C_100280_nf.field_101177_n
		// @09: aload_0
		// @0A: aload_1
		// @0B: putfield byte[] game.C_100280_nf.field_101179_l
		// @0E: goto @44
		// @11: astore_2
		// @12: aload_2
		// @13: new java.lang.StringBuilder
		// @16: dup
		// @17: invokespecial java.lang.StringBuilder.<init>()void
		// @1A: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @1D: bipush 8 (0x08)
		// @1F: aaload
		// @20: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @23: aload_1
		// @24: ifnull @30
		// @27: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @2A: iconst_1
		// @2B: aaload
		// @2C: goto @35
		// @2F: athrow
		// @30: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @33: iconst_2
		// @34: aaload
		// @35: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @38: bipush 41 (0x29)
		// @3A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @40: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @43: athrow
		// @44: return
	}
	
	final void func_101149_a(byte[] arg0, int arg1, int arg2, int arg3)
	{
		// @00: iload #4
		// @02: sipush -7623 (0xE239)
		// @05: if_icmpeq @09
		// @08: return
		// @09: iload_3
		// @0A: istore #5
		// @0C: iload #5
		// @0E: iload_2
		// @0F: iload_3
		// @10: iadd
		// @11: if_icmpge @2F
		// @14: aload_1
		// @15: iload #5
		// @17: aload_0
		// @18: getfield byte[] game.C_100280_nf.field_101179_l
		// @1B: aload_0
		// @1C: dup
		// @1D: getfield int game.C_100280_nf.field_101177_n
		// @20: dup_x1
		// @21: iconst_1
		// @22: iadd
		// @23: putfield int game.C_100280_nf.field_101177_n
		// @26: baload
		// @27: bastore
		// @28: iinc #5 +1
		// @2B: goto @0C
		// @2E: athrow
		// @2F: goto @83
		// @32: astore #5
		// @34: aload #5
		// @36: new java.lang.StringBuilder
		// @39: dup
		// @3A: invokespecial java.lang.StringBuilder.<init>()void
		// @3D: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @40: bipush 11 (0x0B)
		// @42: aaload
		// @43: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @46: aload_1
		// @47: ifnull @53
		// @4A: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @4D: iconst_1
		// @4E: aaload
		// @4F: goto @58
		// @52: athrow
		// @53: getstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @56: iconst_2
		// @57: aaload
		// @58: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @5B: bipush 44 (0x2C)
		// @5D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @60: iload_2
		// @61: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @64: bipush 44 (0x2C)
		// @66: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @69: iload_3
		// @6A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6D: bipush 44 (0x2C)
		// @6F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @72: iload #4
		// @74: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @77: bipush 41 (0x29)
		// @79: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @7F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @82: athrow
		// @83: return
	}
	
	static
	{
		// @000: bipush 44 (0x2C)
		// @002: anewarray java.lang.String
		// @005: dup
		// @006: iconst_0
		// @007: ldc "\u0003\u000c\u0002=1E"
		// @009: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @00C: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @00F: aastore
		// @010: dup
		// @011: iconst_1
		// @012: ldc "\u0016D\u0002[\r"
		// @014: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @017: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @01A: aastore
		// @01B: dup
		// @01C: iconst_2
		// @01D: ldc "\u0003\u001f@\u0019"
		// @01F: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @022: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @025: aastore
		// @026: dup
		// @027: iconst_3
		// @028: ldc "\u0003\u000c\u0002&1E"
		// @02A: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @02D: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @030: aastore
		// @031: dup
		// @032: iconst_4
		// @033: ldc "\u0003\u000c\u0002$X"
		// @035: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @038: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @03B: aastore
		// @03C: dup
		// @03D: iconst_5
		// @03E: ldc "\u0003\u000c\u0002#X"
		// @040: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @043: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @046: aastore
		// @047: dup
		// @048: bipush 6 (0x06)
		// @04A: ldc "\u0003\u000c\u0002?1E"
		// @04C: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @04F: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @052: aastore
		// @053: dup
		// @054: bipush 7 (0x07)
		// @056: ldc "\u0003\u000c\u0002:1E"
		// @058: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @05B: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @05E: aastore
		// @05F: dup
		// @060: bipush 8 (0x08)
		// @062: ldc "\u0003\u000c\u0002I\u0019\u0003\u0003XKX"
		// @064: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @067: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @06A: aastore
		// @06B: dup
		// @06C: bipush 9 (0x09)
		// @06E: ldc "\u0003\u000c\u00026X"
		// @070: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @073: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @076: aastore
		// @077: dup
		// @078: bipush 10 (0x0A)
		// @07A: ldc "\u0003\u000c\u0002#1E"
		// @07C: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @07F: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @082: aastore
		// @083: dup
		// @084: bipush 11 (0x0B)
		// @086: ldc "\u0003\u000c\u0002'X"
		// @088: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @08B: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @08E: aastore
		// @08F: dup
		// @090: bipush 12 (0x0C)
		// @092: ldc "\u0003\u000c\u000211E"
		// @094: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @097: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @09A: aastore
		// @09B: dup
		// @09C: bipush 13 (0x0D)
		// @09E: ldc "\u0003\u000c\u000242E"
		// @0A0: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @0A3: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @0A6: aastore
		// @0A7: dup
		// @0A8: bipush 14 (0x0E)
		// @0AA: ldc "\u0001\u0005K\u001a^\u000b\u0005\u001f\u0011"
		// @0AC: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @0AF: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @0B2: aastore
		// @0B3: dup
		// @0B4: bipush 15 (0x0F)
		// @0B6: ldc "\u0003\u000c\u00020X"
		// @0B8: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @0BB: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @0BE: aastore
		// @0BF: dup
		// @0C0: bipush 16 (0x10)
		// @0C2: ldc "\u0003\u000c\u000261E"
		// @0C4: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @0C7: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @0CA: aastore
		// @0CB: dup
		// @0CC: bipush 17 (0x11)
		// @0CE: ldc "\u0003\u000c\u0002 1E"
		// @0D0: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @0D3: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @0D6: aastore
		// @0D7: dup
		// @0D8: bipush 18 (0x12)
		// @0DA: ldc "\u0003\u000c\u00021X"
		// @0DC: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @0DF: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @0E2: aastore
		// @0E3: dup
		// @0E4: bipush 19 (0x13)
		// @0E6: ldc "\u0003\u000c\u0002$1E"
		// @0E8: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @0EB: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @0EE: aastore
		// @0EF: dup
		// @0F0: bipush 20 (0x14)
		// @0F2: ldc "\u0003\u000c\u000291E"
		// @0F4: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @0F7: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @0FA: aastore
		// @0FB: dup
		// @0FC: bipush 21 (0x15)
		// @0FE: ldc "\u0003\u000c\u0002;1E"
		// @100: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @103: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @106: aastore
		// @107: dup
		// @108: bipush 22 (0x16)
		// @10A: ldc "\u0003\u000c\u0002!1E"
		// @10C: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @10F: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @112: aastore
		// @113: dup
		// @114: bipush 23 (0x17)
		// @116: ldc "\u0003\u000c\u0002>1E"
		// @118: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @11B: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @11E: aastore
		// @11F: dup
		// @120: bipush 24 (0x18)
		// @122: ldc "\u0003\u000c\u000271E"
		// @124: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @127: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @12A: aastore
		// @12B: dup
		// @12C: bipush 25 (0x19)
		// @12E: ldc "\u0003\u000c\u00024X"
		// @130: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @133: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @136: aastore
		// @137: dup
		// @138: bipush 26 (0x1A)
		// @13A: ldc "\u0003\u000c\u0002\"1E"
		// @13C: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @13F: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @142: aastore
		// @143: dup
		// @144: bipush 27 (0x1B)
		// @146: ldc "\u0003\u000c\u00023X"
		// @148: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @14B: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @14E: aastore
		// @14F: dup
		// @150: bipush 28 (0x1C)
		// @152: ldc "\u0003\u000c\u0002 X"
		// @154: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @157: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @15A: aastore
		// @15B: dup
		// @15C: bipush 29 (0x1D)
		// @15E: ldc "\u0003\u000c\u0002\"X"
		// @160: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @163: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @166: aastore
		// @167: dup
		// @168: bipush 30 (0x1E)
		// @16A: ldc "\u0003\u000c\u000241E"
		// @16C: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @16F: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @172: aastore
		// @173: dup
		// @174: bipush 31 (0x1F)
		// @176: ldc "\u0003\u000c\u0002=X"
		// @178: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @17B: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @17E: aastore
		// @17F: dup
		// @180: bipush 32 (0x20)
		// @182: ldc "\u0003\u000c\u000201E"
		// @184: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @187: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @18A: aastore
		// @18B: dup
		// @18C: bipush 33 (0x21)
		// @18E: ldc "\u0003\u000c\u00027X"
		// @190: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @193: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @196: aastore
		// @197: dup
		// @198: bipush 34 (0x22)
		// @19A: ldc "\u0003\u000c\u0002%1E"
		// @19C: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @19F: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @1A2: aastore
		// @1A3: dup
		// @1A4: bipush 35 (0x23)
		// @1A6: ldc "\u0003\u000c\u0002'1E"
		// @1A8: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @1AB: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @1AE: aastore
		// @1AF: dup
		// @1B0: bipush 36 (0x24)
		// @1B2: ldc "\u0003\u000c\u0002!X"
		// @1B4: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @1B7: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @1BA: aastore
		// @1BB: dup
		// @1BC: bipush 37 (0x25)
		// @1BE: ldc "\u0003\u000c\u000281E"
		// @1C0: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @1C3: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @1C6: aastore
		// @1C7: dup
		// @1C8: bipush 38 (0x26)
		// @1CA: ldc "\u0003\u000c\u0002<X"
		// @1CC: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @1CF: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @1D2: aastore
		// @1D3: dup
		// @1D4: bipush 39 (0x27)
		// @1D6: ldc "\u0003\u000c\u00022X"
		// @1D8: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @1DB: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @1DE: aastore
		// @1DF: dup
		// @1E0: bipush 40 (0x28)
		// @1E2: ldc "\u0003\u000c\u0002<1E"
		// @1E4: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @1E7: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @1EA: aastore
		// @1EB: dup
		// @1EC: bipush 41 (0x29)
		// @1EE: ldc "\u0003\u000c\u000221E"
		// @1F0: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @1F3: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @1F6: aastore
		// @1F7: dup
		// @1F8: bipush 42 (0x2A)
		// @1FA: ldc "\u0003\u000c\u000231E"
		// @1FC: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @1FF: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @202: aastore
		// @203: dup
		// @204: bipush 43 (0x2B)
		// @206: ldc "\u0003\u000c\u0002&X"
		// @208: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @20B: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @20E: aastore
		// @20F: putstatic java.lang.String[] game.C_100280_nf.field_101182_z
		// @212: ldc "+\u001f@\u0019\u0003\u000e\u0018I\u0010\u001eM\u001a@\u0014\tM\u0003_U\u0011\u0003JC\u0005\u0004\u0004\u0005BU\u0011\u001b\u000bE\u0019\u0011\u000f\u0006IU\u0004\u0002J_\u0000\u0012\u001e\t^\u001c\u0012\u0004\u0004KU\u001d\u0008\u0007N\u0010\u0002\u001eJC\u001b\u001c\u0014D\u000c3\u001f\u001fJA\u001a\u0002\u0008JH\u0010\u0004\u000c\u0003@\u0006P\u001e\u000fIU\u0004\u0005\u000f\u000c\u0002\u0015\u000f\u0019E\u0001\u0015C"
		// @214: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @217: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @21A: putstatic java.lang.String game.C_100280_nf.field_101174_r
		// @21D: ldc ".\u0006M\u0006\u0003WJ\u0010\u0016\u001f\u0001WJ\u0013\u0016\u000b\u000cJKLHZ\u0012I_\u000e\u0005@K"
		// @21F: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @222: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @225: putstatic java.lang.String game.C_100280_nf.field_101175_q
		// @228: ldc "HJI\u001b\u0017\u0004\u0004I\u0010\u0002\u0008\u000e"
		// @22A: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @22D: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @230: putstatic java.lang.String game.C_100280_nf.field_101180_m
		// @233: new game.C_100113_ek
		// @236: dup
		// @237: ldc "\u0018\u0019I\u001b\u0011\u0000\u000f"
		// @239: invokestatic game.C_100280_nf.func_101159_z(java.lang.String)char[]
		// @23C: invokestatic game.C_100280_nf.func_101134_z(char[])java.lang.String
		// @23F: invokespecial game.C_100113_ek.<init>(java.lang.String)void
		// @242: putstatic game.C_100113_ek game.C_100280_nf.field_101181_j
		// @245: sipush 480 (0x01E0)
		// @248: putstatic int game.C_100280_nf.field_101173_s
		// @24B: return
	}
	
	private static char[] func_101159_z(String arg0)
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
		// @0E: bipush 112 (0x70)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_101134_z(char[] arg0)
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
		// @30: bipush 109 (0x6D)
		// @32: goto @46
		// @35: bipush 106 (0x6A)
		// @37: goto @46
		// @3A: bipush 44 (0x2C)
		// @3C: goto @46
		// @3F: bipush 117 (0x75)
		// @41: goto @46
		// @44: bipush 112 (0x70)
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
