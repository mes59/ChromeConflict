package game;

final class C_100132_td
{
	int field_104974_b;
	byte[] field_104981_j;
	int field_104980_m;
	int field_104973_e;
	int field_104971_g;
	byte[] field_104985_q;
	static C_100202_qi field_104979_l;
	int field_104978_o;
	static C_100130_tf field_104975_c;
	int field_104982_k;
	static int field_104984_i;
	int field_104983_h;
	static String field_104972_d;
	static C_100302_ka field_104976_a;
	static String field_104977_n;
	static byte[] field_104970_f;
	static int[] field_104986_p;
	private static final String[] field_104987_z;
	
	public static void func_104966_a(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic byte[] game.C_100132_td.field_104970_f
		// @04: aconst_null
		// @05: putstatic int[] game.C_100132_td.field_104986_p
		// @08: aconst_null
		// @09: putstatic game.C_100302_ka game.C_100132_td.field_104976_a
		// @0C: aconst_null
		// @0D: putstatic java.lang.String game.C_100132_td.field_104972_d
		// @10: aconst_null
		// @11: putstatic java.lang.String game.C_100132_td.field_104977_n
		// @14: aconst_null
		// @15: putstatic game.C_100202_qi game.C_100132_td.field_104979_l
		// @18: iload_0
		// @19: sipush 29479 (0x7327)
		// @1C: if_icmpeq @30
		// @1F: iconst_2
		// @20: aconst_null
		// @21: checkcast java.lang.String[]
		// @24: aconst_null
		// @25: checkcast java.lang.String
		// @28: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @2B: pop
		// @2C: goto @30
		// @2F: athrow
		// @30: aconst_null
		// @31: putstatic game.C_100130_tf game.C_100132_td.field_104975_c
		// @34: goto @58
		// @37: astore_1
		// @38: aload_1
		// @39: new java.lang.StringBuilder
		// @3C: dup
		// @3D: invokespecial java.lang.StringBuilder.<init>()void
		// @40: getstatic java.lang.String[] game.C_100132_td.field_104987_z
		// @43: iconst_5
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
	
	static final void func_104969_a(byte arg0, String arg1)
	{
		// @00: aload_1
		// @01: putstatic java.lang.String game.C_100253_ph.field_101097_G
		// @04: iload_0
		// @05: bipush -85 (0xAB)
		// @07: if_icmpeq @11
		// @0A: aconst_null
		// @0B: checkcast int[]
		// @0E: putstatic int[] game.C_100132_td.field_104986_p
		// @11: goto @4F
		// @14: astore_2
		// @15: aload_2
		// @16: new java.lang.StringBuilder
		// @19: dup
		// @1A: invokespecial java.lang.StringBuilder.<init>()void
		// @1D: getstatic java.lang.String[] game.C_100132_td.field_104987_z
		// @20: iconst_2
		// @21: aaload
		// @22: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @25: iload_0
		// @26: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @29: bipush 44 (0x2C)
		// @2B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2E: aload_1
		// @2F: ifnull @3B
		// @32: getstatic java.lang.String[] game.C_100132_td.field_104987_z
		// @35: iconst_1
		// @36: aaload
		// @37: goto @40
		// @3A: athrow
		// @3B: getstatic java.lang.String[] game.C_100132_td.field_104987_z
		// @3E: iconst_0
		// @3F: aaload
		// @40: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @43: bipush 41 (0x29)
		// @45: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @48: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4E: athrow
		// @4F: return
	}
	
	static final String func_104965_a(int arg0, String[] arg1, String arg2)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #11
		// @005: aload_2
		// @006: invokevirtual java.lang.String.length()int
		// @009: istore_3
		// @00A: iload_3
		// @00B: istore #4
		// @00D: iconst_0
		// @00E: istore #5
		// @010: aload_2
		// @011: getstatic java.lang.String[] game.C_100132_td.field_104987_z
		// @014: iconst_4
		// @015: aaload
		// @016: iload #5
		// @018: invokevirtual java.lang.String.indexOf(java.lang.String, int)int
		// @01B: istore #6
		// @01D: iconst_0
		// @01E: iload #6
		// @020: if_icmpgt @0A7
		// @023: iload #6
		// @025: bipush -2 (0xFE)
		// @027: isub
		// @028: istore #5
		// @02A: iload #5
		// @02C: iconst_m1
		// @02D: ixor
		// @02E: iload_3
		// @02F: iconst_m1
		// @030: ixor
		// @031: if_icmple @053
		// @034: aload_2
		// @035: iload #5
		// @037: invokevirtual java.lang.String.charAt(int)char
		// @03A: bipush -100 (0x9C)
		// @03C: invokestatic game.C_100064_ve.func_103007_a(char, byte)boolean
		// @03F: iload #11
		// @041: ifne @01E
		// @044: ifeq @053
		// @047: iinc #5 +1
		// @04A: iload #11
		// @04C: ifeq @02A
		// @04F: goto @053
		// @052: athrow
		// @053: aload_2
		// @054: iconst_2
		// @055: iload #6
		// @057: iadd
		// @058: iload #5
		// @05A: invokevirtual java.lang.String.substring(int, int)java.lang.String
		// @05D: astore #7
		// @05F: iconst_1
		// @060: aload #7
		// @062: invokestatic game.C_100298_ke.func_103205_a(boolean, java.lang.CharSequence)boolean
		// @065: ifeq @010
		// @068: iload_3
		// @069: iload #5
		// @06B: if_icmple @0A2
		// @06E: aload_2
		// @06F: iload #5
		// @071: invokevirtual java.lang.String.charAt(int)char
		// @074: iconst_m1
		// @075: ixor
		// @076: bipush -63 (0xC1)
		// @078: if_icmpeq @083
		// @07B: goto @07F
		// @07E: athrow
		// @07F: goto @0A2
		// @082: athrow
		// @083: iinc #5 +1
		// @086: aload #7
		// @088: bipush -120 (0x88)
		// @08A: invokestatic game.C_100001_ge.func_100552_a(java.lang.CharSequence, int)int
		// @08D: istore #8
		// @08F: iload #4
		// @091: iload #5
		// @093: ineg
		// @094: iload #6
		// @096: iadd
		// @097: aload_1
		// @098: iload #8
		// @09A: aaload
		// @09B: invokevirtual java.lang.String.length()int
		// @09E: iadd
		// @09F: iadd
		// @0A0: istore #4
		// @0A2: iload #11
		// @0A4: ifeq @010
		// @0A7: new java.lang.StringBuilder
		// @0AA: dup
		// @0AB: iload #4
		// @0AD: invokespecial java.lang.StringBuilder.<init>(int)void
		// @0B0: astore #6
		// @0B2: iload_0
		// @0B3: sipush -30945 (0x871F)
		// @0B6: if_icmpeq @0BE
		// @0B9: aconst_null
		// @0BA: checkcast java.lang.String
		// @0BD: areturn
		// @0BE: iconst_0
		// @0BF: istore #7
		// @0C1: iconst_0
		// @0C2: istore #5
		// @0C4: aload_2
		// @0C5: getstatic java.lang.String[] game.C_100132_td.field_104987_z
		// @0C8: iconst_4
		// @0C9: aaload
		// @0CA: iload #5
		// @0CC: invokevirtual java.lang.String.indexOf(java.lang.String, int)int
		// @0CF: istore #8
		// @0D1: iload #8
		// @0D3: iconst_m1
		// @0D4: ixor
		// @0D5: iconst_m1
		// @0D6: if_icmple @0E7
		// @0D9: iload #11
		// @0DB: ifne @0ED
		// @0DE: iload #11
		// @0E0: ifeq @176
		// @0E3: goto @0E7
		// @0E6: athrow
		// @0E7: iconst_2
		// @0E8: iload #8
		// @0EA: iadd
		// @0EB: istore #5
		// @0ED: iload #5
		// @0EF: iload_3
		// @0F0: if_icmpge @116
		// @0F3: aload_2
		// @0F4: iload #5
		// @0F6: invokevirtual java.lang.String.charAt(int)char
		// @0F9: bipush -100 (0x9C)
		// @0FB: invokestatic game.C_100064_ve.func_103007_a(char, byte)boolean
		// @0FE: iload #11
		// @100: ifne @0D5
		// @103: goto @107
		// @106: athrow
		// @107: ifeq @116
		// @10A: iinc #5 +1
		// @10D: iload #11
		// @10F: ifeq @0ED
		// @112: goto @116
		// @115: athrow
		// @116: aload_2
		// @117: iconst_2
		// @118: iload #8
		// @11A: iadd
		// @11B: iload #5
		// @11D: invokevirtual java.lang.String.substring(int, int)java.lang.String
		// @120: astore #9
		// @122: iconst_1
		// @123: aload #9
		// @125: invokestatic game.C_100298_ke.func_103205_a(boolean, java.lang.CharSequence)boolean
		// @128: ifne @134
		// @12B: iload #11
		// @12D: ifeq @0C4
		// @130: goto @134
		// @133: athrow
		// @134: iload #5
		// @136: iload_3
		// @137: if_icmpge @171
		// @13A: aload_2
		// @13B: iload #5
		// @13D: invokevirtual java.lang.String.charAt(int)char
		// @140: bipush 62 (0x3E)
		// @142: if_icmpne @171
		// @145: goto @149
		// @148: athrow
		// @149: iinc #5 +1
		// @14C: aload #9
		// @14E: bipush -115 (0x8D)
		// @150: invokestatic game.C_100001_ge.func_100552_a(java.lang.CharSequence, int)int
		// @153: istore #10
		// @155: aload #6
		// @157: aload_2
		// @158: iload #7
		// @15A: iload #8
		// @15C: invokevirtual java.lang.String.substring(int, int)java.lang.String
		// @15F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @162: pop
		// @163: aload #6
		// @165: aload_1
		// @166: iload #10
		// @168: aaload
		// @169: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @16C: pop
		// @16D: iload #5
		// @16F: istore #7
		// @171: iload #11
		// @173: ifeq @0C4
		// @176: aload #6
		// @178: aload_2
		// @179: iload #7
		// @17B: invokevirtual java.lang.String.substring(int)java.lang.String
		// @17E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @181: pop
		// @182: aload #6
		// @184: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @187: areturn
		// @188: astore_3
		// @189: aload_3
		// @18A: new java.lang.StringBuilder
		// @18D: dup
		// @18E: invokespecial java.lang.StringBuilder.<init>()void
		// @191: getstatic java.lang.String[] game.C_100132_td.field_104987_z
		// @194: iconst_3
		// @195: aaload
		// @196: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @199: iload_0
		// @19A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @19D: bipush 44 (0x2C)
		// @19F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1A2: aload_1
		// @1A3: ifnull @1AF
		// @1A6: getstatic java.lang.String[] game.C_100132_td.field_104987_z
		// @1A9: iconst_1
		// @1AA: aaload
		// @1AB: goto @1B4
		// @1AE: athrow
		// @1AF: getstatic java.lang.String[] game.C_100132_td.field_104987_z
		// @1B2: iconst_0
		// @1B3: aaload
		// @1B4: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1B7: bipush 44 (0x2C)
		// @1B9: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1BC: aload_2
		// @1BD: ifnull @1C9
		// @1C0: getstatic java.lang.String[] game.C_100132_td.field_104987_z
		// @1C3: iconst_1
		// @1C4: aaload
		// @1C5: goto @1CE
		// @1C8: athrow
		// @1C9: getstatic java.lang.String[] game.C_100132_td.field_104987_z
		// @1CC: iconst_0
		// @1CD: aaload
		// @1CE: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1D1: bipush 41 (0x29)
		// @1D3: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1D6: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @1D9: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @1DC: athrow
	}
	
	static
	{
		// @00: bipush 6 (0x06)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "r5*~"
		// @09: invokestatic game.C_100132_td.func_104968_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100132_td.func_104967_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "gnh<O"
		// @14: invokestatic game.C_100132_td.func_104968_z(java.lang.String)char[]
		// @17: invokestatic game.C_100132_td.func_104967_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "h$hP\u001a"
		// @1F: invokestatic game.C_100132_td.func_104968_z(java.lang.String)char[]
		// @22: invokestatic game.C_100132_td.func_104967_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "h$hS\u001a"
		// @2A: invokestatic game.C_100132_td.func_104968_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100132_td.func_104967_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc " e"
		// @35: invokestatic game.C_100132_td.func_104968_z(java.lang.String)char[]
		// @38: invokestatic game.C_100132_td.func_104967_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "h$hQ\u001a"
		// @40: invokestatic game.C_100132_td.func_104968_z(java.lang.String)char[]
		// @43: invokestatic game.C_100132_td.func_104967_z(char[])java.lang.String
		// @46: aastore
		// @47: putstatic java.lang.String[] game.C_100132_td.field_104987_z
		// @4A: new game.C_100202_qi
		// @4D: dup
		// @4E: invokespecial game.C_100202_qi.<init>()void
		// @51: putstatic game.C_100202_qi game.C_100132_td.field_104979_l
		// @54: ldc "Y.2w@<.'\u007fW</ 2Bp!?w@<4)2Vy,#fW<&4}_<,/aF"
		// @56: invokestatic game.C_100132_td.func_104968_z(java.lang.String)char[]
		// @59: invokestatic game.C_100132_td.func_104967_z(char[])java.lang.String
		// @5C: putstatic java.lang.String game.C_100132_td.field_104972_d
		// @5F: new game.C_100130_tf
		// @62: dup
		// @63: invokespecial game.C_100130_tf.<init>()void
		// @66: putstatic game.C_100130_tf game.C_100132_td.field_104975_c
		// @69: ldc "N%'~\u001fp) w\u0012h(4wSh3"
		// @6B: invokestatic game.C_100132_td.func_104968_z(java.lang.String)char[]
		// @6E: invokestatic game.C_100132_td.func_104967_z(char[])java.lang.String
		// @71: putstatic java.lang.String game.C_100132_td.field_104977_n
		// @74: bipush 8 (0x08)
		// @76: newarray int[]
		// @78: putstatic int[] game.C_100132_td.field_104986_p
		// @7B: return
	}
	
	private static char[] func_104968_z(String arg0)
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
		// @0E: bipush 50 (0x32)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_104967_z(char[] arg0)
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
		// @30: bipush 28 (0x1C)
		// @32: goto @46
		// @35: bipush 64 (0x40)
		// @37: goto @46
		// @3A: bipush 70 (0x46)
		// @3C: goto @46
		// @3F: bipush 18 (0x12)
		// @41: goto @46
		// @44: bipush 50 (0x32)
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
