package game;

final class C_100099_fb extends C_100340_je
{
	private String field_103044_w;
	static int field_103052_x;
	private boolean field_103043_C;
	static int field_103048_s;
	static int field_103046_u;
	private C_100194_rd field_103047_t;
	static C_100268_mk field_103049_r;
	static C_100151_bc field_103039_E;
	static String field_103045_v;
	static String field_103041_A;
	static C_100302_ka field_103050_z;
	static String field_103042_B;
	static String field_103038_D;
	static int[] field_103051_y;
	private static final String[] field_103040_F;
	
	static final boolean func_103036_a(int arg0, C_100098_h arg1)
	{
		// @00: iload_0
		// @01: bipush 20 (0x14)
		// @03: if_icmpge @14
		// @06: aconst_null
		// @07: checkcast java.lang.String
		// @0A: bipush -37 (0xDB)
		// @0C: invokestatic game.C_100099_fb.func_103035_a(java.lang.String, byte)boolean
		// @0F: pop
		// @10: goto @14
		// @13: athrow
		// @14: aload_1
		// @15: iconst_0
		// @16: invokevirtual game.C_100098_h.func_104598_a(int)boolean
		// @19: ireturn
		// @1A: astore_2
		// @1B: aload_2
		// @1C: new java.lang.StringBuilder
		// @1F: dup
		// @20: invokespecial java.lang.StringBuilder.<init>()void
		// @23: getstatic java.lang.String[] game.C_100099_fb.field_103040_F
		// @26: iconst_5
		// @27: aaload
		// @28: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2B: iload_0
		// @2C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2F: bipush 44 (0x2C)
		// @31: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @34: aload_1
		// @35: ifnull @41
		// @38: getstatic java.lang.String[] game.C_100099_fb.field_103040_F
		// @3B: iconst_1
		// @3C: aaload
		// @3D: goto @46
		// @40: athrow
		// @41: getstatic java.lang.String[] game.C_100099_fb.field_103040_F
		// @44: iconst_0
		// @45: aaload
		// @46: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @49: bipush 41 (0x29)
		// @4B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @51: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @54: athrow
	}
	
	final String func_102975_a(byte arg0, String arg1)
	{
		// @00: aload_0
		// @01: getfield game.C_100194_rd game.C_100099_fb.field_103047_t
		// @04: aload_2
		// @05: iconst_0
		// @06: invokevirtual game.C_100194_rd.func_102974_b(java.lang.String, int)game.C_100133_tk
		// @09: getstatic game.C_100133_tk game.C_100256_pk.field_100466_a
		// @0C: if_acmpeq @13
		// @0F: goto @1E
		// @12: athrow
		// @13: aload_0
		// @14: getfield game.C_100194_rd game.C_100099_fb.field_103047_t
		// @17: bipush 16 (0x10)
		// @19: aload_2
		// @1A: invokevirtual game.C_100194_rd.func_102975_a(byte, java.lang.String)java.lang.String
		// @1D: areturn
		// @1E: aload_0
		// @1F: aload_2
		// @20: iconst_0
		// @21: invokevirtual game.C_100099_fb.func_102974_b(java.lang.String, int)game.C_100133_tk
		// @24: getstatic game.C_100133_tk game.C_100256_pk.field_100466_a
		// @27: if_acmpeq @2E
		// @2A: goto @32
		// @2D: athrow
		// @2E: getstatic java.lang.String game.C_100119_ua.field_104898_f
		// @31: areturn
		// @32: iload_1
		// @33: bipush 16 (0x10)
		// @35: if_icmpeq @3D
		// @38: aconst_null
		// @39: checkcast java.lang.String
		// @3C: areturn
		// @3D: getstatic java.lang.String game.C_100036_gg.field_103154_S
		// @40: areturn
		// @41: astore_3
		// @42: aload_3
		// @43: new java.lang.StringBuilder
		// @46: dup
		// @47: invokespecial java.lang.StringBuilder.<init>()void
		// @4A: getstatic java.lang.String[] game.C_100099_fb.field_103040_F
		// @4D: bipush 6 (0x06)
		// @4F: aaload
		// @50: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @53: iload_1
		// @54: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @57: bipush 44 (0x2C)
		// @59: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5C: aload_2
		// @5D: ifnull @69
		// @60: getstatic java.lang.String[] game.C_100099_fb.field_103040_F
		// @63: iconst_1
		// @64: aaload
		// @65: goto @6E
		// @68: athrow
		// @69: getstatic java.lang.String[] game.C_100099_fb.field_103040_F
		// @6C: iconst_0
		// @6D: aaload
		// @6E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @71: bipush 41 (0x29)
		// @73: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @76: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @79: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @7C: athrow
	}
	
	final C_100133_tk func_102974_b(String arg0, int arg1)
	{
		// @00: aload_0
		// @01: getfield game.C_100194_rd game.C_100099_fb.field_103047_t
		// @04: aload_1
		// @05: iload_2
		// @06: invokevirtual game.C_100194_rd.func_102974_b(java.lang.String, int)game.C_100133_tk
		// @09: getstatic game.C_100133_tk game.C_100256_pk.field_100466_a
		// @0C: if_acmpeq @13
		// @0F: goto @17
		// @12: athrow
		// @13: getstatic game.C_100133_tk game.C_100256_pk.field_100466_a
		// @16: areturn
		// @17: aload_1
		// @18: aload_0
		// @19: getfield java.lang.String game.C_100099_fb.field_103044_w
		// @1C: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @1F: ifne @49
		// @22: bipush 89 (0x59)
		// @24: aload_1
		// @25: invokestatic game.C_100077_d.func_103311_a(byte, java.lang.String)game.C_100321_hi
		// @28: astore_3
		// @29: aload_3
		// @2A: bipush -2 (0xFE)
		// @2C: invokevirtual game.C_100321_hi.func_107211_b(int)boolean
		// @2F: ifeq @36
		// @32: goto @3A
		// @35: athrow
		// @36: getstatic game.C_100133_tk game.C_100238_ol.field_101696_R
		// @39: areturn
		// @3A: aload_0
		// @3B: aload_1
		// @3C: putfield java.lang.String game.C_100099_fb.field_103044_w
		// @3F: aload_0
		// @40: aload_3
		// @41: bipush -27 (0xE5)
		// @43: invokevirtual game.C_100321_hi.func_107212_b(byte)boolean
		// @46: putfield boolean game.C_100099_fb.field_103043_C
		// @49: aload_0
		// @4A: getfield boolean game.C_100099_fb.field_103043_C
		// @4D: ifeq @57
		// @50: getstatic game.C_100133_tk game.C_100079_e.field_102670_tb
		// @53: goto @5A
		// @56: athrow
		// @57: getstatic game.C_100133_tk game.C_100256_pk.field_100466_a
		// @5A: areturn
		// @5B: astore_3
		// @5C: aload_3
		// @5D: new java.lang.StringBuilder
		// @60: dup
		// @61: invokespecial java.lang.StringBuilder.<init>()void
		// @64: getstatic java.lang.String[] game.C_100099_fb.field_103040_F
		// @67: bipush 7 (0x07)
		// @69: aaload
		// @6A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @6D: aload_1
		// @6E: ifnull @7A
		// @71: getstatic java.lang.String[] game.C_100099_fb.field_103040_F
		// @74: iconst_1
		// @75: aaload
		// @76: goto @7F
		// @79: athrow
		// @7A: getstatic java.lang.String[] game.C_100099_fb.field_103040_F
		// @7D: iconst_0
		// @7E: aaload
		// @7F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @82: bipush 44 (0x2C)
		// @84: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @87: iload_2
		// @88: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8B: bipush 41 (0x29)
		// @8D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @90: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @93: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @96: athrow
	}
	
	static final boolean func_103035_a(String arg0, byte arg1)
	{
		// @00: iload_1
		// @01: bipush 120 (0x78)
		// @03: if_icmpeq @0E
		// @06: iconst_2
		// @07: putstatic int game.C_100099_fb.field_103052_x
		// @0A: goto @0E
		// @0D: athrow
		// @0E: aconst_null
		// @0F: aload_0
		// @10: bipush 76 (0x4C)
		// @12: invokestatic game.C_100278_nd.func_101197_b(java.lang.String, int)game.C_100061_dh
		// @15: if_acmpeq @1D
		// @18: iconst_1
		// @19: goto @1E
		// @1C: athrow
		// @1D: iconst_0
		// @1E: ireturn
		// @1F: astore_2
		// @20: aload_2
		// @21: new java.lang.StringBuilder
		// @24: dup
		// @25: invokespecial java.lang.StringBuilder.<init>()void
		// @28: getstatic java.lang.String[] game.C_100099_fb.field_103040_F
		// @2B: iconst_3
		// @2C: aaload
		// @2D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @30: aload_0
		// @31: ifnull @3D
		// @34: getstatic java.lang.String[] game.C_100099_fb.field_103040_F
		// @37: iconst_1
		// @38: aaload
		// @39: goto @42
		// @3C: athrow
		// @3D: getstatic java.lang.String[] game.C_100099_fb.field_103040_F
		// @40: iconst_0
		// @41: aaload
		// @42: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @45: bipush 44 (0x2C)
		// @47: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4A: iload_1
		// @4B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4E: bipush 41 (0x29)
		// @50: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @53: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @56: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @59: athrow
	}
	
	public static void func_103037_g(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100099_fb.field_103045_v
		// @04: aconst_null
		// @05: putstatic java.lang.String game.C_100099_fb.field_103042_B
		// @08: aconst_null
		// @09: putstatic int[] game.C_100099_fb.field_103051_y
		// @0C: aconst_null
		// @0D: putstatic game.C_100151_bc game.C_100099_fb.field_103039_E
		// @10: aconst_null
		// @11: putstatic java.lang.String game.C_100099_fb.field_103041_A
		// @14: aconst_null
		// @15: putstatic game.C_100268_mk game.C_100099_fb.field_103049_r
		// @18: aconst_null
		// @19: putstatic game.C_100302_ka game.C_100099_fb.field_103050_z
		// @1C: iload_0
		// @1D: bipush 81 (0x51)
		// @1F: if_icmpge @23
		// @22: return
		// @23: aconst_null
		// @24: putstatic java.lang.String game.C_100099_fb.field_103038_D
		// @27: goto @4B
		// @2A: astore_1
		// @2B: aload_1
		// @2C: new java.lang.StringBuilder
		// @2F: dup
		// @30: invokespecial java.lang.StringBuilder.<init>()void
		// @33: getstatic java.lang.String[] game.C_100099_fb.field_103040_F
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
	
	C_100099_fb(C_100309_lk arg0, C_100309_lk arg1)
	{
		// @00: aload_0
		// @01: aload_1
		// @02: invokespecial game.C_100340_je.<init>(game.C_100309_lk)void
		// @05: aload_0
		// @06: ldc ""
		// @08: putfield java.lang.String game.C_100099_fb.field_103044_w
		// @0B: aload_0
		// @0C: iconst_0
		// @0D: putfield boolean game.C_100099_fb.field_103043_C
		// @10: aload_0
		// @11: new game.C_100194_rd
		// @14: dup
		// @15: aload_1
		// @16: aload_2
		// @17: invokespecial game.C_100194_rd.<init>(game.C_100309_lk, game.C_100309_lk)void
		// @1A: putfield game.C_100194_rd game.C_100099_fb.field_103047_t
		// @1D: goto @6C
		// @20: astore_3
		// @21: aload_3
		// @22: new java.lang.StringBuilder
		// @25: dup
		// @26: invokespecial java.lang.StringBuilder.<init>()void
		// @29: getstatic java.lang.String[] game.C_100099_fb.field_103040_F
		// @2C: iconst_2
		// @2D: aaload
		// @2E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @31: aload_1
		// @32: ifnull @3E
		// @35: getstatic java.lang.String[] game.C_100099_fb.field_103040_F
		// @38: iconst_1
		// @39: aaload
		// @3A: goto @43
		// @3D: athrow
		// @3E: getstatic java.lang.String[] game.C_100099_fb.field_103040_F
		// @41: iconst_0
		// @42: aaload
		// @43: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @46: bipush 44 (0x2C)
		// @48: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4B: aload_2
		// @4C: ifnull @58
		// @4F: getstatic java.lang.String[] game.C_100099_fb.field_103040_F
		// @52: iconst_1
		// @53: aaload
		// @54: goto @5D
		// @57: athrow
		// @58: getstatic java.lang.String[] game.C_100099_fb.field_103040_F
		// @5B: iconst_0
		// @5C: aaload
		// @5D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @60: bipush 41 (0x29)
		// @62: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @65: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @68: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @6B: athrow
		// @6C: return
	}
	
	static
	{
		// @000: bipush 8 (0x08)
		// @002: anewarray java.lang.String
		// @005: dup
		// @006: iconst_0
		// @007: ldc "1\u0006 <"
		// @009: invokestatic game.C_100099_fb.func_103034_z(java.lang.String)char[]
		// @00C: invokestatic game.C_100099_fb.func_103033_z(char[])java.lang.String
		// @00F: aastore
		// @010: dup
		// @011: iconst_1
		// @012: ldc "$]b~6"
		// @014: invokestatic game.C_100099_fb.func_103034_z(java.lang.String)char[]
		// @017: invokestatic game.C_100099_fb.func_103033_z(char[])java.lang.String
		// @01A: aastore
		// @01B: dup
		// @01C: iconst_2
		// @01D: ldc "9\u0011bl\"1\u001a8nc"
		// @01F: invokestatic game.C_100099_fb.func_103034_z(java.lang.String)char[]
		// @022: invokestatic game.C_100099_fb.func_103033_z(char[])java.lang.String
		// @025: aastore
		// @026: dup
		// @027: iconst_3
		// @028: ldc "9\u0011b\u0014c"
		// @02A: invokestatic game.C_100099_fb.func_103034_z(java.lang.String)char[]
		// @02D: invokestatic game.C_100099_fb.func_103033_z(char[])java.lang.String
		// @030: aastore
		// @031: dup
		// @032: iconst_4
		// @033: ldc "9\u0011b\u0013c"
		// @035: invokestatic game.C_100099_fb.func_103034_z(java.lang.String)char[]
		// @038: invokestatic game.C_100099_fb.func_103033_z(char[])java.lang.String
		// @03B: aastore
		// @03C: dup
		// @03D: iconst_5
		// @03E: ldc "9\u0011b\u0011c"
		// @040: invokestatic game.C_100099_fb.func_103034_z(java.lang.String)char[]
		// @043: invokestatic game.C_100099_fb.func_103033_z(char[])java.lang.String
		// @046: aastore
		// @047: dup
		// @048: bipush 6 (0x06)
		// @04A: ldc "9\u0011b\u0012c"
		// @04C: invokestatic game.C_100099_fb.func_103034_z(java.lang.String)char[]
		// @04F: invokestatic game.C_100099_fb.func_103033_z(char[])java.lang.String
		// @052: aastore
		// @053: dup
		// @054: bipush 7 (0x07)
		// @056: ldc "9\u0011b\u0016c"
		// @058: invokestatic game.C_100099_fb.func_103034_z(java.lang.String)char[]
		// @05B: invokestatic game.C_100099_fb.func_103033_z(char[])java.lang.String
		// @05E: aastore
		// @05F: putstatic java.lang.String[] game.C_100099_fb.field_103040_F
		// @062: bipush 49 (0x31)
		// @064: putstatic int game.C_100099_fb.field_103052_x
		// @067: ldc "\r\u00168%91S8?k3\u001c.22"
		// @069: invokestatic game.C_100099_fb.func_103034_z(java.lang.String)char[]
		// @06C: invokestatic game.C_100099_fb.func_103033_z(char[])java.lang.String
		// @06F: putstatic java.lang.String game.C_100099_fb.field_103041_A
		// @072: ldc "\u0010\u001d )k,\u001b#'k3\u001c.22\u007f\u0010$1?\u007f\u0015>?&\u007f\u001e5p--\u001a)>/,"
		// @074: invokestatic game.C_100099_fb.func_103034_z(java.lang.String)char[]
		// @077: invokestatic game.C_100099_fb.func_103033_z(char[])java.lang.String
		// @07A: putstatic java.lang.String game.C_100099_fb.field_103045_v
		// @07D: bipush 15 (0x0F)
		// @07F: putstatic int game.C_100099_fb.field_103046_u
		// @082: new game.C_100268_mk
		// @085: dup
		// @086: invokespecial game.C_100268_mk.<init>()void
		// @089: putstatic game.C_100268_mk game.C_100099_fb.field_103049_r
		// @08C: ldc "nC|`kw>\r\u0008b"
		// @08E: invokestatic game.C_100099_fb.func_103034_z(java.lang.String)char[]
		// @091: invokestatic game.C_100099_fb.func_103033_z(char[])java.lang.String
		// @094: putstatic java.lang.String game.C_100099_fb.field_103042_B
		// @097: ldc "\u0006\u001c9p%:\u0016(p?0S/8$0\u0000)p*\u007f\u001d-=.\u007f\u0011)6$-\u0016l)$*S/1%\u007f\u001f#7k6\u001dbp\u001f7\u001a?p\",S88.\u007f\u001d-=.\u007f\u0007$1?\u007f\u0004%<'\u007f\u0011)p/6\u0000<<*&\u0016(p?0S#$#:\u0001l '>\n)\"8q"
		// @099: invokestatic game.C_100099_fb.func_103034_z(java.lang.String)char[]
		// @09C: invokestatic game.C_100099_fb.func_103033_z(char[])java.lang.String
		// @09F: putstatic java.lang.String game.C_100099_fb.field_103038_D
		// @0A2: bipush 20 (0x14)
		// @0A4: newarray int[]
		// @0A6: dup
		// @0A7: iconst_0
		// @0A8: bipush 84 (0x54)
		// @0AA: iastore
		// @0AB: dup
		// @0AC: iconst_1
		// @0AD: bipush 104 (0x68)
		// @0AF: iastore
		// @0B0: dup
		// @0B1: iconst_2
		// @0B2: bipush 29 (0x1D)
		// @0B4: iastore
		// @0B5: dup
		// @0B6: iconst_3
		// @0B7: bipush 87 (0x57)
		// @0B9: iastore
		// @0BA: dup
		// @0BB: iconst_4
		// @0BC: bipush 29 (0x1D)
		// @0BE: iastore
		// @0BF: dup
		// @0C0: iconst_5
		// @0C1: bipush 24 (0x18)
		// @0C3: iastore
		// @0C4: dup
		// @0C5: bipush 6 (0x06)
		// @0C7: bipush 24 (0x18)
		// @0C9: iastore
		// @0CA: dup
		// @0CB: bipush 7 (0x07)
		// @0CD: bipush 24 (0x18)
		// @0CF: iastore
		// @0D0: dup
		// @0D1: bipush 8 (0x08)
		// @0D3: bipush 86 (0x56)
		// @0D5: iastore
		// @0D6: dup
		// @0D7: bipush 9 (0x09)
		// @0D9: bipush 85 (0x55)
		// @0DB: iastore
		// @0DC: dup
		// @0DD: bipush 10 (0x0A)
		// @0DF: bipush 47 (0x2F)
		// @0E1: iastore
		// @0E2: dup
		// @0E3: bipush 11 (0x0B)
		// @0E5: bipush 17 (0x11)
		// @0E7: iastore
		// @0E8: dup
		// @0E9: bipush 12 (0x0C)
		// @0EB: iconst_3
		// @0EC: iastore
		// @0ED: dup
		// @0EE: bipush 13 (0x0D)
		// @0F0: bipush 8 (0x08)
		// @0F2: iastore
		// @0F3: dup
		// @0F4: bipush 14 (0x0E)
		// @0F6: bipush 31 (0x1F)
		// @0F8: iastore
		// @0F9: dup
		// @0FA: bipush 15 (0x0F)
		// @0FC: bipush 29 (0x1D)
		// @0FE: iastore
		// @0FF: dup
		// @100: bipush 16 (0x10)
		// @102: bipush 16 (0x10)
		// @104: iastore
		// @105: dup
		// @106: bipush 17 (0x11)
		// @108: bipush 30 (0x1E)
		// @10A: iastore
		// @10B: dup
		// @10C: bipush 18 (0x12)
		// @10E: bipush 17 (0x11)
		// @110: iastore
		// @111: dup
		// @112: bipush 19 (0x13)
		// @114: iconst_m1
		// @115: iastore
		// @116: putstatic int[] game.C_100099_fb.field_103051_y
		// @119: return
	}
	
	private static char[] func_103034_z(String arg0)
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
		// @0E: bipush 75 (0x4B)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_103033_z(char[] arg0)
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
		// @30: bipush 95 (0x5F)
		// @32: goto @46
		// @35: bipush 115 (0x73)
		// @37: goto @46
		// @3A: bipush 76 (0x4C)
		// @3C: goto @46
		// @3F: bipush 80 (0x50)
		// @41: goto @46
		// @44: bipush 75 (0x4B)
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
