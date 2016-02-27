package game;

import java.applet.Applet;

class C_100303_kk extends C_100107_u
{
	private long field_104790_m;
	static C_100037_wb[] field_104789_l;
	static String field_104793_k;
	static String[] field_104794_i;
	static int field_104788_o;
	static C_100037_wb field_104787_n;
	static String field_104791_j;
	private String field_104786_p;
	private static final String[] field_104792_z;
	
	final void func_104763_a(C_100280_nf arg0, int arg1)
	{
		// @00: aload_1
		// @01: iconst_0
		// @02: aload_0
		// @03: getfield long game.C_100303_kk.field_104790_m
		// @06: invokevirtual game.C_100280_nf.func_101131_a(int, long)void
		// @09: aload_1
		// @0A: aload_0
		// @0B: getfield java.lang.String game.C_100303_kk.field_104786_p
		// @0E: bipush 38 (0x26)
		// @10: invokevirtual game.C_100280_nf.func_101148_a(java.lang.String, int)void
		// @13: bipush 120 (0x78)
		// @15: bipush 65 (0x41)
		// @17: iload_2
		// @18: isub
		// @19: bipush 48 (0x30)
		// @1B: idiv
		// @1C: irem
		// @1D: istore_3
		// @1E: goto @5C
		// @21: astore_3
		// @22: aload_3
		// @23: new java.lang.StringBuilder
		// @26: dup
		// @27: invokespecial java.lang.StringBuilder.<init>()void
		// @2A: getstatic java.lang.String[] game.C_100303_kk.field_104792_z
		// @2D: iconst_0
		// @2E: aaload
		// @2F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @32: aload_1
		// @33: ifnull @3F
		// @36: getstatic java.lang.String[] game.C_100303_kk.field_104792_z
		// @39: iconst_1
		// @3A: aaload
		// @3B: goto @44
		// @3E: athrow
		// @3F: getstatic java.lang.String[] game.C_100303_kk.field_104792_z
		// @42: iconst_2
		// @43: aaload
		// @44: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @47: bipush 44 (0x2C)
		// @49: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4C: iload_2
		// @4D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @50: bipush 41 (0x29)
		// @52: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @55: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @58: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @5B: athrow
		// @5C: return
	}
	
	static final void func_104780_a(int arg0, Applet arg1)
	{
		// @00: new java.net.URL
		// @03: dup
		// @04: aload_1
		// @05: invokevirtual java.applet.Applet.getCodeBase()java.net.URL
		// @08: getstatic java.lang.String[] game.C_100303_kk.field_104792_z
		// @0B: bipush 6 (0x06)
		// @0D: aaload
		// @0E: invokespecial java.net.URL.<init>(java.net.URL, java.lang.String)void
		// @11: astore_2
		// @12: iload_0
		// @13: sipush 360 (0x0168)
		// @16: if_icmpeq @22
		// @19: bipush 107 (0x6B)
		// @1B: putstatic int game.C_100303_kk.field_104788_o
		// @1E: goto @22
		// @21: athrow
		// @22: aload_1
		// @23: invokevirtual java.applet.Applet.getAppletContext()java.applet.AppletContext
		// @26: iload_0
		// @27: sipush -361 (0xFE97)
		// @2A: iadd
		// @2B: aload_2
		// @2C: aload_1
		// @2D: invokestatic game.C_100244_pe.func_106368_a(int, java.net.URL, java.applet.Applet)java.net.URL
		// @30: getstatic java.lang.String[] game.C_100303_kk.field_104792_z
		// @33: bipush 7 (0x07)
		// @35: aaload
		// @36: invokeinterface java.applet.AppletContext.showDocument(java.net.URL, java.lang.String)void
		// @3B: goto @43
		// @3E: astore_2
		// @3F: aload_2
		// @40: invokevirtual java.lang.Exception.printStackTrace()void
		// @43: goto @82
		// @46: astore_2
		// @47: aload_2
		// @48: new java.lang.StringBuilder
		// @4B: dup
		// @4C: invokespecial java.lang.StringBuilder.<init>()void
		// @4F: getstatic java.lang.String[] game.C_100303_kk.field_104792_z
		// @52: bipush 8 (0x08)
		// @54: aaload
		// @55: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @58: iload_0
		// @59: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5C: bipush 44 (0x2C)
		// @5E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @61: aload_1
		// @62: ifnull @6E
		// @65: getstatic java.lang.String[] game.C_100303_kk.field_104792_z
		// @68: iconst_1
		// @69: aaload
		// @6A: goto @73
		// @6D: athrow
		// @6E: getstatic java.lang.String[] game.C_100303_kk.field_104792_z
		// @71: iconst_2
		// @72: aaload
		// @73: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @76: bipush 41 (0x29)
		// @78: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @7E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @81: athrow
		// @82: return
	}
	
	static final String func_104779_a(int arg0, CharSequence arg1)
	{
		// @00: bipush -54 (0xCA)
		// @02: bipush 97 (0x61)
		// @04: aload_1
		// @05: invokestatic game.C_100271_mj.func_103427_a(int, java.lang.CharSequence)long
		// @08: invokestatic game.C_100248_pb.func_106423_a(int, long)java.lang.String
		// @0B: astore_2
		// @0C: aload_2
		// @0D: ifnull @14
		// @10: goto @17
		// @13: athrow
		// @14: ldc ""
		// @16: astore_2
		// @17: bipush 80 (0x50)
		// @19: iload_0
		// @1A: bipush 47 (0x2F)
		// @1C: isub
		// @1D: bipush 44 (0x2C)
		// @1F: idiv
		// @20: idiv
		// @21: istore_3
		// @22: aload_2
		// @23: areturn
		// @24: astore_2
		// @25: aload_2
		// @26: new java.lang.StringBuilder
		// @29: dup
		// @2A: invokespecial java.lang.StringBuilder.<init>()void
		// @2D: getstatic java.lang.String[] game.C_100303_kk.field_104792_z
		// @30: bipush 11 (0x0B)
		// @32: aaload
		// @33: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @36: iload_0
		// @37: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3A: bipush 44 (0x2C)
		// @3C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3F: aload_1
		// @40: ifnull @4C
		// @43: getstatic java.lang.String[] game.C_100303_kk.field_104792_z
		// @46: iconst_1
		// @47: aaload
		// @48: goto @51
		// @4B: athrow
		// @4C: getstatic java.lang.String[] game.C_100303_kk.field_104792_z
		// @4F: iconst_2
		// @50: aaload
		// @51: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @54: bipush 41 (0x29)
		// @56: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @59: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @5C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @5F: athrow
	}
	
	public static void func_104783_a(byte arg0)
	{
		// @00: iload_0
		// @01: bipush 94 (0x5E)
		// @03: if_icmpeq @07
		// @06: return
		// @07: aconst_null
		// @08: putstatic game.C_100037_wb game.C_100303_kk.field_104787_n
		// @0B: aconst_null
		// @0C: putstatic java.lang.String game.C_100303_kk.field_104793_k
		// @0F: aconst_null
		// @10: putstatic game.C_100037_wb[] game.C_100303_kk.field_104789_l
		// @13: aconst_null
		// @14: putstatic java.lang.String[] game.C_100303_kk.field_104794_i
		// @17: aconst_null
		// @18: putstatic java.lang.String game.C_100303_kk.field_104791_j
		// @1B: goto @3F
		// @1E: astore_1
		// @1F: aload_1
		// @20: new java.lang.StringBuilder
		// @23: dup
		// @24: invokespecial java.lang.StringBuilder.<init>()void
		// @27: getstatic java.lang.String[] game.C_100303_kk.field_104792_z
		// @2A: iconst_5
		// @2B: aaload
		// @2C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2F: iload_0
		// @30: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @33: bipush 41 (0x29)
		// @35: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @38: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3E: athrow
		// @3F: return
	}
	
	static final int func_104778_a(int arg0, byte arg1)
	{
		// @00: ldc 1431655765 (0x55555555)
		// @02: iload_0
		// @03: iand
		// @04: ldc -1431655765 (0xaaaaaaab)
		// @06: iload_0
		// @07: iand
		// @08: ldc 2032412225 (0x79242641)
		// @0A: iushr
		// @0B: ineg
		// @0C: isub
		// @0D: istore_0
		// @0E: bipush -73 (0xB7)
		// @10: bipush -11 (0xF5)
		// @12: iload_1
		// @13: isub
		// @14: bipush 59 (0x3B)
		// @16: idiv
		// @17: idiv
		// @18: istore_2
		// @19: iload_0
		// @1A: ldc 858993459 (0x33333333)
		// @1C: iand
		// @1D: ldc -858993459 (0xcccccccd)
		// @1F: iload_0
		// @20: iand
		// @21: ldc 565237762 (0x21b0d802)
		// @23: iushr
		// @24: iadd
		// @25: istore_0
		// @26: ldc 252645135 (0xf0f0f0f)
		// @28: iload_0
		// @29: ldc -571523708 (0xddef3d84)
		// @2B: iushr
		// @2C: iload_0
		// @2D: iadd
		// @2E: iand
		// @2F: istore_0
		// @30: iload_0
		// @31: iload_0
		// @32: ldc -502821816 (0xe2078c48)
		// @34: iushr
		// @35: iadd
		// @36: istore_0
		// @37: iload_0
		// @38: iload_0
		// @39: ldc -1586488048 (0xa1701d10)
		// @3B: iushr
		// @3C: iadd
		// @3D: istore_0
		// @3E: sipush 255 (0x00FF)
		// @41: iload_0
		// @42: iand
		// @43: ireturn
		// @44: astore_2
		// @45: aload_2
		// @46: new java.lang.StringBuilder
		// @49: dup
		// @4A: invokespecial java.lang.StringBuilder.<init>()void
		// @4D: getstatic java.lang.String[] game.C_100303_kk.field_104792_z
		// @50: bipush 10 (0x0A)
		// @52: aaload
		// @53: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @56: iload_0
		// @57: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5A: bipush 44 (0x2C)
		// @5C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5F: iload_1
		// @60: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @63: bipush 41 (0x29)
		// @65: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @68: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @6B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @6E: athrow
	}
	
	C_100013_fn func_104766_b(int arg0)
	{
		// @00: iload_1
		// @01: ifeq @0D
		// @04: bipush -75 (0xB5)
		// @06: invokestatic game.C_100303_kk.func_104783_a(byte)void
		// @09: goto @0D
		// @0C: athrow
		// @0D: getstatic game.C_100013_fn game.C_100250_pl.field_106433_f
		// @10: areturn
		// @11: astore_2
		// @12: aload_2
		// @13: new java.lang.StringBuilder
		// @16: dup
		// @17: invokespecial java.lang.StringBuilder.<init>()void
		// @1A: getstatic java.lang.String[] game.C_100303_kk.field_104792_z
		// @1D: bipush 12 (0x0C)
		// @1F: aaload
		// @20: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @23: iload_1
		// @24: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @27: bipush 41 (0x29)
		// @29: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @2F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @32: athrow
	}
	
	static final void func_104785_b(byte arg0)
	{
		// @000: getstatic int game.C_100196_rb.field_105819_e
		// @003: putstatic int game.C_100260_mc.field_102234_jc
		// @006: getstatic int game.C_100196_rb.field_105821_c
		// @009: putstatic int game.C_100103_eh.field_104666_b
		// @00C: bipush 118 (0x76)
		// @00E: invokestatic game.C_100192_rf.func_101673_d(byte)void
		// @011: getstatic game.C_100220_ac game.C_100176_ci.field_105624_b
		// @014: iconst_0
		// @015: bipush -8 (0xF8)
		// @017: getstatic game.C_100302_ka game.C_100231_oc.field_102208_bc
		// @01A: getfield int game.C_100302_ka.field_101886_Kb
		// @01D: iconst_0
		// @01E: bipush -2 (0xFE)
		// @020: bipush -40 (0xD8)
		// @022: getstatic game.C_100302_ka game.C_100231_oc.field_102208_bc
		// @025: getfield int game.C_100302_ka.field_101848_lb
		// @028: iadd
		// @029: iadd
		// @02A: invokevirtual game.C_100220_ac.func_106052_a(int, byte, int, int, int)void
		// @02D: getstatic game.C_100302_ka game.C_100297_kf.field_101240_l
		// @030: iconst_0
		// @031: getstatic int game.C_100033_gj.field_101917_jc
		// @034: iconst_m1
		// @035: iconst_0
		// @036: getstatic game.C_100302_ka game.C_100033_gj.field_101928_lc
		// @039: getfield int game.C_100302_ka.field_101886_Kb
		// @03C: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @03F: getstatic int game.C_100033_gj.field_101917_jc
		// @042: bipush -2 (0xFE)
		// @044: isub
		// @045: istore_1
		// @046: getstatic game.C_100302_ka game.C_100099_fb.field_103050_z
		// @049: iconst_0
		// @04A: getstatic boolean game.C_100273_mm.field_106682_e
		// @04D: ifeq @055
		// @050: iload_1
		// @051: goto @056
		// @054: athrow
		// @055: iconst_0
		// @056: ineg
		// @057: getstatic game.C_100302_ka game.C_100033_gj.field_101928_lc
		// @05A: getfield int game.C_100302_ka.field_101848_lb
		// @05D: iadd
		// @05E: iconst_m1
		// @05F: getstatic boolean game.C_100273_mm.field_106682_e
		// @062: ifeq @06A
		// @065: iload_1
		// @066: goto @06B
		// @069: athrow
		// @06A: iconst_0
		// @06B: getstatic game.C_100302_ka game.C_100033_gj.field_101928_lc
		// @06E: getfield int game.C_100302_ka.field_101886_Kb
		// @071: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @074: bipush -2 (0xFE)
		// @076: invokestatic game.C_100172_ck.func_102105_m(int)void
		// @079: getstatic game.C_100302_ka game.C_100080_b.field_104431_f
		// @07C: iconst_0
		// @07D: bipush 40 (0x28)
		// @07F: iconst_m1
		// @080: bipush -40 (0xD8)
		// @082: getstatic game.C_100302_ka game.C_100231_oc.field_102208_bc
		// @085: getfield int game.C_100302_ka.field_101848_lb
		// @088: iadd
		// @089: getstatic game.C_100302_ka game.C_100231_oc.field_102208_bc
		// @08C: getfield int game.C_100302_ka.field_101886_Kb
		// @08F: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @092: getstatic game.C_100302_ka game.C_100015_wh.field_103792_k
		// @095: iconst_0
		// @096: bipush 30 (0x1E)
		// @098: iconst_m1
		// @099: iconst_0
		// @09A: getstatic game.C_100302_ka game.C_100081_ue.field_100676_j
		// @09D: getfield int game.C_100302_ka.field_101886_Kb
		// @0A0: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @0A3: getstatic game.C_100302_ka game.C_100148_bh.field_101802_v
		// @0A6: iconst_0
		// @0A7: bipush -32 (0xE0)
		// @0A9: getstatic game.C_100302_ka game.C_100081_ue.field_100676_j
		// @0AC: getfield int game.C_100302_ka.field_101848_lb
		// @0AF: bipush 40 (0x28)
		// @0B1: isub
		// @0B2: iadd
		// @0B3: iconst_m1
		// @0B4: bipush 30 (0x1E)
		// @0B6: getstatic game.C_100302_ka game.C_100081_ue.field_100676_j
		// @0B9: getfield int game.C_100302_ka.field_101886_Kb
		// @0BC: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @0BF: getstatic game.C_100302_ka game.C_100257_ln.field_106484_c
		// @0C2: iconst_5
		// @0C3: bipush 30 (0x1E)
		// @0C5: iconst_m1
		// @0C6: iconst_5
		// @0C7: bipush 68 (0x44)
		// @0C9: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @0CC: getstatic game.C_100302_ka game.C_100295_kh.field_105291_e
		// @0CF: bipush 75 (0x4B)
		// @0D1: bipush 30 (0x1E)
		// @0D3: iconst_m1
		// @0D4: iconst_5
		// @0D5: bipush 78 (0x4E)
		// @0D7: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @0DA: getstatic game.C_100302_ka game.C_100138_bo.field_100414_i
		// @0DD: sipush 155 (0x009B)
		// @0E0: bipush 30 (0x1E)
		// @0E2: iconst_m1
		// @0E3: iconst_5
		// @0E4: bipush 48 (0x30)
		// @0E6: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @0E9: getstatic game.C_100302_ka game.C_100087_n.field_100694_j
		// @0EC: sipush 205 (0x00CD)
		// @0EF: bipush 30 (0x1E)
		// @0F1: iconst_m1
		// @0F2: iconst_5
		// @0F3: bipush 48 (0x30)
		// @0F5: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @0F8: bipush -51 (0xCD)
		// @0FA: iload_0
		// @0FB: bipush 55 (0x37)
		// @0FD: isub
		// @0FE: bipush 48 (0x30)
		// @100: idiv
		// @101: irem
		// @102: istore_3
		// @103: getstatic boolean game.C_100273_mm.field_106682_e
		// @106: ifeq @110
		// @109: sipush 250 (0x00FA)
		// @10C: goto @113
		// @10F: athrow
		// @110: sipush 200 (0x00C8)
		// @113: istore_2
		// @114: getstatic game.C_100302_ka game.C_100073_f.field_101720_z
		// @117: iload_2
		// @118: iconst_5
		// @119: iadd
		// @11A: bipush 30 (0x1E)
		// @11C: iconst_m1
		// @11D: iconst_5
		// @11E: iload_2
		// @11F: ineg
		// @120: sipush 363 (0x016B)
		// @123: iadd
		// @124: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @127: getstatic game.C_100302_ka game.C_100098_h.field_104613_g
		// @12A: sipush 370 (0x0172)
		// @12D: bipush 30 (0x1E)
		// @12F: iconst_m1
		// @130: iconst_5
		// @131: bipush -5 (0xFB)
		// @133: bipush -5 (0xFB)
		// @135: getstatic game.C_100302_ka game.C_100081_ue.field_100676_j
		// @138: getfield int game.C_100302_ka.field_101886_Kb
		// @13B: iadd
		// @13C: sipush 365 (0x016D)
		// @13F: isub
		// @140: iadd
		// @141: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @144: getstatic game.C_100115_ej game.C_100156_sk.field_105389_r
		// @147: iconst_2
		// @148: bipush -5 (0xFB)
		// @14A: getstatic game.C_100302_ka game.C_100148_bh.field_101802_v
		// @14D: getfield int game.C_100302_ka.field_101848_lb
		// @150: bipush -5 (0xFB)
		// @152: iadd
		// @153: bipush 32 (0x20)
		// @155: isub
		// @156: iadd
		// @157: iconst_5
		// @158: iconst_0
		// @159: bipush -10 (0xF6)
		// @15B: getstatic game.C_100302_ka game.C_100148_bh.field_101802_v
		// @15E: getfield int game.C_100302_ka.field_101886_Kb
		// @161: iadd
		// @162: bipush 37 (0x25)
		// @164: getstatic int game.C_100099_fb.field_103046_u
		// @167: invokevirtual game.C_100115_ej.func_102030_a(int, int, int, int, int, int, int)void
		// @16A: getstatic game.C_100302_ka game.C_100081_ue.field_100676_j
		// @16D: getfield int game.C_100302_ka.field_101886_Kb
		// @170: iconst_2
		// @171: iadd
		// @172: iconst_2
		// @173: idiv
		// @174: istore #4
		// @176: getstatic game.C_100302_ka game.C_100020_wm.field_103858_a
		// @179: iconst_0
		// @17A: bipush 40 (0x28)
		// @17C: iconst_m1
		// @17D: bipush -40 (0xD8)
		// @17F: getstatic game.C_100302_ka game.C_100081_ue.field_100676_j
		// @182: getfield int game.C_100302_ka.field_101848_lb
		// @185: iadd
		// @186: iload #4
		// @188: iconst_2
		// @189: isub
		// @18A: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @18D: getstatic boolean game.C_100273_mm.field_106682_e
		// @190: ifeq @197
		// @193: goto @19A
		// @196: athrow
		// @197: iconst_0
		// @198: istore #4
		// @19A: getstatic game.C_100302_ka game.C_100217_ao.field_106040_l
		// @19D: iload #4
		// @19F: bipush 40 (0x28)
		// @1A1: iconst_m1
		// @1A2: bipush -40 (0xD8)
		// @1A4: getstatic game.C_100302_ka game.C_100081_ue.field_100676_j
		// @1A7: getfield int game.C_100302_ka.field_101848_lb
		// @1AA: iadd
		// @1AB: getstatic game.C_100302_ka game.C_100081_ue.field_100676_j
		// @1AE: getfield int game.C_100302_ka.field_101886_Kb
		// @1B1: iload #4
		// @1B3: ineg
		// @1B4: iadd
		// @1B5: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @1B8: goto @1DC
		// @1BB: astore_1
		// @1BC: aload_1
		// @1BD: new java.lang.StringBuilder
		// @1C0: dup
		// @1C1: invokespecial java.lang.StringBuilder.<init>()void
		// @1C4: getstatic java.lang.String[] game.C_100303_kk.field_104792_z
		// @1C7: iconst_3
		// @1C8: aaload
		// @1C9: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1CC: iload_0
		// @1CD: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1D0: bipush 41 (0x29)
		// @1D2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1D5: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @1D8: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @1DB: athrow
		// @1DC: return
	}
	
	static final C_100098_h func_104782_a(int arg0, boolean arg1)
	{
		// @00: iload_1
		// @01: ifeq @0F
		// @04: aconst_null
		// @05: checkcast game.C_100037_wb
		// @08: putstatic game.C_100037_wb game.C_100303_kk.field_104787_n
		// @0B: goto @0F
		// @0E: athrow
		// @0F: iconst_1
		// @10: iconst_0
		// @11: iconst_0
		// @12: iload_0
		// @13: iconst_1
		// @14: iconst_1
		// @15: invokestatic game.C_100122_em.func_102067_a(boolean, boolean, boolean, int, boolean, int)game.C_100098_h
		// @18: areturn
		// @19: astore_2
		// @1A: aload_2
		// @1B: new java.lang.StringBuilder
		// @1E: dup
		// @1F: invokespecial java.lang.StringBuilder.<init>()void
		// @22: getstatic java.lang.String[] game.C_100303_kk.field_104792_z
		// @25: iconst_4
		// @26: aaload
		// @27: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2A: iload_0
		// @2B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2E: bipush 44 (0x2C)
		// @30: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @33: iload_1
		// @34: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @37: bipush 41 (0x29)
		// @39: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @42: athrow
	}
	
	C_100303_kk(long arg0, String arg1)
	{
		// @00: aload_0
		// @01: invokespecial game.C_100107_u.<init>()void
		// @04: aload_0
		// @05: aload_3
		// @06: putfield java.lang.String game.C_100303_kk.field_104786_p
		// @09: aload_0
		// @0A: lload_1
		// @0B: putfield long game.C_100303_kk.field_104790_m
		// @0E: goto @4F
		// @11: astore #4
		// @13: aload #4
		// @15: new java.lang.StringBuilder
		// @18: dup
		// @19: invokespecial java.lang.StringBuilder.<init>()void
		// @1C: getstatic java.lang.String[] game.C_100303_kk.field_104792_z
		// @1F: bipush 9 (0x09)
		// @21: aaload
		// @22: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @25: lload_1
		// @26: invokevirtual java.lang.StringBuilder.append(long)java.lang.StringBuilder
		// @29: bipush 44 (0x2C)
		// @2B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2E: aload_3
		// @2F: ifnull @3B
		// @32: getstatic java.lang.String[] game.C_100303_kk.field_104792_z
		// @35: iconst_1
		// @36: aaload
		// @37: goto @40
		// @3A: athrow
		// @3B: getstatic java.lang.String[] game.C_100303_kk.field_104792_z
		// @3E: iconst_2
		// @3F: aaload
		// @40: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @43: bipush 41 (0x29)
		// @45: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @48: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4E: athrow
		// @4F: return
	}
	
	static
	{
		// @000: bipush 13 (0x0D)
		// @002: anewarray java.lang.String
		// @005: dup
		// @006: iconst_0
		// @007: ldc " <iax"
		// @009: invokestatic game.C_100303_kk.func_104784_z(java.lang.String)char[]
		// @00C: invokestatic game.C_100303_kk.func_104781_z(char[])java.lang.String
		// @00F: aastore
		// @010: dup
		// @011: iconst_1
		// @012: ldc "0yi\n-"
		// @014: invokestatic game.C_100303_kk.func_104784_z(java.lang.String)char[]
		// @017: invokestatic game.C_100303_kk.func_104781_z(char[])java.lang.String
		// @01A: aastore
		// @01B: dup
		// @01C: iconst_2
		// @01D: ldc "%\"+H"
		// @01F: invokestatic game.C_100303_kk.func_104784_z(java.lang.String)char[]
		// @022: invokestatic game.C_100303_kk.func_104781_z(char[])java.lang.String
		// @025: aastore
		// @026: dup
		// @027: iconst_3
		// @028: ldc " <iox"
		// @02A: invokestatic game.C_100303_kk.func_104784_z(java.lang.String)char[]
		// @02D: invokestatic game.C_100303_kk.func_104781_z(char[])java.lang.String
		// @030: aastore
		// @031: dup
		// @032: iconst_4
		// @033: ldc " <inx"
		// @035: invokestatic game.C_100303_kk.func_104784_z(java.lang.String)char[]
		// @038: invokestatic game.C_100303_kk.func_104781_z(char[])java.lang.String
		// @03B: aastore
		// @03C: dup
		// @03D: iconst_5
		// @03E: ldc " <ihx"
		// @040: invokestatic game.C_100303_kk.func_104784_z(java.lang.String)char[]
		// @043: invokestatic game.C_100303_kk.func_104781_z(char[])java.lang.String
		// @046: aastore
		// @047: dup
		// @048: bipush 6 (0x06)
		// @04A: ldc "8\"%W39>%A~<$"
		// @04C: invokestatic game.C_100303_kk.func_104784_z(java.lang.String)char[]
		// @04F: invokestatic game.C_100303_kk.func_104781_z(char[])java.lang.String
		// @052: aastore
		// @053: dup
		// @054: bipush 7 (0x07)
		// @056: ldc "\u0014#(T"
		// @058: invokestatic game.C_100303_kk.func_104784_z(java.lang.String)char[]
		// @05B: invokestatic game.C_100303_kk.func_104781_z(char[])java.lang.String
		// @05E: aastore
		// @05F: dup
		// @060: bipush 8 (0x08)
		// @062: ldc " <iix"
		// @064: invokestatic game.C_100303_kk.func_104784_z(java.lang.String)char[]
		// @067: invokestatic game.C_100303_kk.func_104781_z(char[])java.lang.String
		// @06A: aastore
		// @06B: dup
		// @06C: bipush 9 (0x09)
		// @06E: ldc " <i\u00189%>3\u001ax"
		// @070: invokestatic game.C_100303_kk.func_104784_z(java.lang.String)char[]
		// @073: invokestatic game.C_100303_kk.func_104781_z(char[])java.lang.String
		// @076: aastore
		// @077: dup
		// @078: bipush 10 (0x0A)
		// @07A: ldc " <ilx"
		// @07C: invokestatic game.C_100303_kk.func_104784_z(java.lang.String)char[]
		// @07F: invokestatic game.C_100303_kk.func_104781_z(char[])java.lang.String
		// @082: aastore
		// @083: dup
		// @084: bipush 11 (0x0B)
		// @086: ldc " <imx"
		// @088: invokestatic game.C_100303_kk.func_104784_z(java.lang.String)char[]
		// @08B: invokestatic game.C_100303_kk.func_104781_z(char[])java.lang.String
		// @08E: aastore
		// @08F: dup
		// @090: bipush 12 (0x0C)
		// @092: ldc " <icx"
		// @094: invokestatic game.C_100303_kk.func_104784_z(java.lang.String)char[]
		// @097: invokestatic game.C_100303_kk.func_104781_z(char[])java.lang.String
		// @09A: aastore
		// @09B: putstatic java.lang.String[] game.C_100303_kk.field_104792_z
		// @09E: ldc "\u0008;(W5"
		// @0A0: invokestatic game.C_100303_kk.func_104784_z(java.lang.String)char[]
		// @0A3: invokestatic game.C_100303_kk.func_104781_z(char[])java.lang.String
		// @0A6: putstatic java.lang.String game.C_100303_kk.field_104793_k
		// @0A9: sipush 360 (0x0168)
		// @0AC: putstatic int game.C_100303_kk.field_104788_o
		// @0AF: bipush 12 (0x0C)
		// @0B1: anewarray java.lang.String
		// @0B4: dup
		// @0B5: iconst_0
		// @0B6: ldc "\u001f2$Lp=6+Q5qw{\u0001`u"
		// @0B8: invokestatic game.C_100303_kk.func_104784_z(java.lang.String)char[]
		// @0BB: invokestatic game.C_100303_kk.func_104781_z(char[])java.lang.String
		// @0BE: aastore
		// @0BF: dup
		// @0C0: iconst_1
		// @0C1: ldc "\u0001\"*Tp)8(W$"
		// @0C3: invokestatic game.C_100303_kk.func_104784_z(java.lang.String)char[]
		// @0C6: invokestatic game.C_100303_kk.func_104781_z(char[])java.lang.String
		// @0C9: aastore
		// @0CA: dup
		// @0CB: iconst_2
		// @0CC: ldc "\u001f?5Q#?w%K?8#"
		// @0CE: invokestatic game.C_100303_kk.func_104784_z(java.lang.String)char[]
		// @0D1: invokestatic game.C_100303_kk.func_104781_z(char[])java.lang.String
		// @0D4: aastore
		// @0D5: dup
		// @0D6: iconst_3
		// @0D7: ldc "\u000e9\"V72w$E *4.P)qw{\u0001`uw\u0013n"
		// @0D9: invokestatic game.C_100303_kk.func_104784_z(java.lang.String)char[]
		// @0DC: invokestatic game.C_100303_kk.func_104781_z(char[])java.lang.String
		// @0DF: aastore
		// @0E0: dup
		// @0E1: iconst_4
		// @0E2: ldc "\u0018?.A</$}\u0004lngy\u0004\u0017\u0001"
		// @0E4: invokestatic game.C_100303_kk.func_104784_z(java.lang.String)char[]
		// @0E7: invokestatic game.C_100303_kk.func_104781_z(char[])java.lang.String
		// @0EA: aastore
		// @0EB: dup
		// @0EC: iconst_5
		// @0ED: ldc "\u000e9\"V72w A>.%&P9$9}\u0004lngy\u0004\u0017\u0001x4"
		// @0EF: invokestatic game.C_100303_kk.func_104784_z(java.lang.String)char[]
		// @0F2: invokestatic game.C_100303_kk.func_104781_z(char[])java.lang.String
		// @0F5: aastore
		// @0F6: dup
		// @0F7: bipush 6 (0x06)
		// @0F9: ldc "\u000e9\"V72w A>.%&P9$9}\u0004\u0005\u0005\u001c\tk\u0007\u0005"
		// @0FB: invokestatic game.C_100303_kk.func_104784_z(java.lang.String)char[]
		// @0FE: invokestatic game.C_100303_kk.func_104781_z(char[])java.lang.String
		// @101: aastore
		// @102: dup
		// @103: bipush 7 (0x07)
		// @105: ldc "\u00032&H$#mg\u0018u{igO\u0000&"
		// @107: invokestatic game.C_100303_kk.func_104784_z(java.lang.String)char[]
		// @10A: invokestatic game.C_100303_kk.func_104781_z(char[])java.lang.String
		// @10D: aastore
		// @10E: dup
		// @10F: bipush 8 (0x08)
		// @111: ldc "\u001f2$Lp=6+Q5qw{\u0001`u"
		// @113: invokestatic game.C_100303_kk.func_104784_z(java.lang.String)char[]
		// @116: invokestatic game.C_100303_kk.func_104781_z(char[])java.lang.String
		// @119: aastore
		// @11A: dup
		// @11B: bipush 9 (0x09)
		// @11D: ldc "\u0001\"*Tjkkb\u0014nn"
		// @11F: invokestatic game.C_100303_kk.func_104784_z(java.lang.String)char[]
		// @122: invokestatic game.C_100303_kk.func_104781_z(char[])java.lang.String
		// @125: aastore
		// @126: dup
		// @127: bipush 10 (0x0A)
		// @129: ldc "\u001f?5Q#?mg\u0018u{ib"
		// @12B: invokestatic game.C_100303_kk.func_104784_z(java.lang.String)char[]
		// @12E: invokestatic game.C_100303_kk.func_104781_z(char[])java.lang.String
		// @131: aastore
		// @132: dup
		// @133: bipush 11 (0x0B)
		// @135: ldc "\u0001\"*Tpmw3L\">$3\u00042$84P#"
		// @137: invokestatic game.C_100303_kk.func_104784_z(java.lang.String)char[]
		// @13A: invokestatic game.C_100303_kk.func_104781_z(char[])java.lang.String
		// @13D: aastore
		// @13E: putstatic java.lang.String[] game.C_100303_kk.field_104794_i
		// @141: ldc "k$\"G?%3"
		// @143: invokestatic game.C_100303_kk.func_104784_z(java.lang.String)char[]
		// @146: invokestatic game.C_100303_kk.func_104781_z(char[])java.lang.String
		// @149: putstatic java.lang.String game.C_100303_kk.field_104791_j
		// @14C: return
	}
	
	private static char[] func_104784_z(String arg0)
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
		// @0E: bipush 80 (0x50)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_104781_z(char[] arg0)
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
		// @30: bipush 75 (0x4B)
		// @32: goto @46
		// @35: bipush 87 (0x57)
		// @37: goto @46
		// @3A: bipush 71 (0x47)
		// @3C: goto @46
		// @3F: bipush 36 (0x24)
		// @41: goto @46
		// @44: bipush 80 (0x50)
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
