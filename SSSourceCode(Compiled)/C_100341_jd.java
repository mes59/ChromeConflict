package game;

abstract class C_100341_jd extends C_100136_th
{
	static byte[] field_102646_ib;
	static C_100302_ka field_102652_kb;
	static String field_102644_rb;
	private int field_102637_db;
	static boolean field_102647_nb;
	private int field_102653_lb;
	static String field_102645_jb;
	static String[] field_102648_ob;
	private int field_102649_pb;
	private int field_102638_cb;
	static int[] field_102651_mb;
	static int field_102654_bb;
	static boolean field_102641_eb;
	private int field_102640_hb;
	static C_100177_cj field_102643_gb;
	static String field_102639_qb;
	private int field_102642_fb;
	private static final String[] field_102650_sb;
	
	boolean func_102606_a(byte arg0)
	{
		// @00: bipush 127 (0x7F)
		// @02: bipush -51 (0xCD)
		// @04: iload_1
		// @05: isub
		// @06: bipush 43 (0x2B)
		// @08: idiv
		// @09: irem
		// @0A: istore_2
		// @0B: aload_0
		// @0C: bipush 106 (0x6A)
		// @0E: invokevirtual game.C_100341_jd.func_102635_m(int)void
		// @11: aload_0
		// @12: bipush -110 (0x92)
		// @14: invokespecial game.C_100136_th.func_102606_a(byte)boolean
		// @17: ireturn
		// @18: astore_2
		// @19: aload_2
		// @1A: new java.lang.StringBuilder
		// @1D: dup
		// @1E: invokespecial java.lang.StringBuilder.<init>()void
		// @21: getstatic java.lang.String[] game.C_100341_jd.field_102650_sb
		// @24: bipush 10 (0x0A)
		// @26: aaload
		// @27: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2A: iload_1
		// @2B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2E: bipush 41 (0x29)
		// @30: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @33: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @36: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @39: athrow
	}
	
	void func_102635_m(int arg0)
	{
		// @00: iconst_m1
		// @01: aload_0
		// @02: getfield int game.C_100341_jd.field_102637_db
		// @05: iconst_m1
		// @06: ixor
		// @07: if_icmpgt @0B
		// @0A: return
		// @0B: aload_0
		// @0C: bipush -94 (0xA2)
		// @0E: aload_0
		// @0F: getfield int game.C_100341_jd.field_102640_hb
		// @12: aload_0
		// @13: getfield int game.C_100341_jd.field_102653_lb
		// @16: invokevirtual game.C_100341_jd.func_102615_b(byte, int, int)void
		// @19: aload_0
		// @1A: iconst_0
		// @1B: putfield int game.C_100341_jd.field_102637_db
		// @1E: iload_1
		// @1F: bipush 71 (0x47)
		// @21: if_icmpge @25
		// @24: return
		// @25: aload_0
		// @26: sipush 18323 (0x4793)
		// @29: invokevirtual game.C_100341_jd.func_102636_o(int)void
		// @2C: goto @50
		// @2F: astore_2
		// @30: aload_2
		// @31: new java.lang.StringBuilder
		// @34: dup
		// @35: invokespecial java.lang.StringBuilder.<init>()void
		// @38: getstatic java.lang.String[] game.C_100341_jd.field_102650_sb
		// @3B: iconst_1
		// @3C: aaload
		// @3D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @40: iload_1
		// @41: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @44: bipush 41 (0x29)
		// @46: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @49: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4F: athrow
		// @50: return
	}
	
	C_100341_jd(C_100029_gn arg0, int arg1, int arg2)
	{
		// @00: aload_0
		// @01: aload_1
		// @02: iload_2
		// @03: iload_3
		// @04: invokespecial game.C_100136_th.<init>(game.C_100029_gn, int, int)void
		// @07: aload_0
		// @08: iconst_0
		// @09: putfield int game.C_100341_jd.field_102637_db
		// @0C: aload_0
		// @0D: iconst_0
		// @0E: putfield int game.C_100341_jd.field_102649_pb
		// @11: return
	}
	
	static final String func_102634_n(int arg0)
	{
		// @00: bipush -41 (0xD7)
		// @02: iconst_5
		// @03: iload_0
		// @04: isub
		// @05: bipush 61 (0x3D)
		// @07: idiv
		// @08: irem
		// @09: istore_1
		// @0A: getstatic boolean game.C_100009_fg.field_103662_i
		// @0D: ifne @3A
		// @10: getstatic int game.C_100010_ff.field_103699_j
		// @13: getstatic int game.C_100041_wf.field_104104_d
		// @16: if_icmplt @3A
		// @19: goto @1D
		// @1C: athrow
		// @1D: getstatic int game.C_100010_ff.field_103699_j
		// @20: iconst_m1
		// @21: ixor
		// @22: getstatic int game.C_100041_wf.field_104104_d
		// @25: getstatic int game.C_100012_fh.field_100506_F
		// @28: iadd
		// @29: iconst_m1
		// @2A: ixor
		// @2B: if_icmpgt @36
		// @2E: goto @32
		// @31: athrow
		// @32: goto @3A
		// @35: athrow
		// @36: getstatic java.lang.String game.C_100123_uc.field_104922_e
		// @39: areturn
		// @3A: aconst_null
		// @3B: areturn
		// @3C: astore_1
		// @3D: aload_1
		// @3E: new java.lang.StringBuilder
		// @41: dup
		// @42: invokespecial java.lang.StringBuilder.<init>()void
		// @45: getstatic java.lang.String[] game.C_100341_jd.field_102650_sb
		// @48: iconst_5
		// @49: aaload
		// @4A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4D: iload_0
		// @4E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @51: bipush 41 (0x29)
		// @53: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @56: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @59: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @5C: athrow
	}
	
	static final C_100153_be[] func_102631_a(String arg0, C_100098_h arg1, String arg2, int arg3)
	{
		// @00: aload_1
		// @01: sipush -10719 (0xD621)
		// @04: aload_2
		// @05: invokevirtual game.C_100098_h.func_104601_b(int, java.lang.String)int
		// @08: istore #4
		// @0A: iload_3
		// @0B: bipush 77 (0x4D)
		// @0D: if_icmpgt @1B
		// @10: aconst_null
		// @11: checkcast game.C_100302_ka
		// @14: putstatic game.C_100302_ka game.C_100341_jd.field_102652_kb
		// @17: goto @1B
		// @1A: athrow
		// @1B: aload_1
		// @1C: aload_0
		// @1D: iload #4
		// @1F: iconst_0
		// @20: invokevirtual game.C_100098_h.func_104600_a(java.lang.String, int, int)int
		// @23: istore #5
		// @25: iload #4
		// @27: iload #5
		// @29: aload_1
		// @2A: bipush 43 (0x2B)
		// @2C: invokestatic game.C_100048_vi.func_104164_a(int, int, game.C_100098_h, int)game.C_100153_be[]
		// @2F: areturn
		// @30: astore #4
		// @32: aload #4
		// @34: new java.lang.StringBuilder
		// @37: dup
		// @38: invokespecial java.lang.StringBuilder.<init>()void
		// @3B: getstatic java.lang.String[] game.C_100341_jd.field_102650_sb
		// @3E: bipush 9 (0x09)
		// @40: aaload
		// @41: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @44: aload_0
		// @45: ifnull @52
		// @48: getstatic java.lang.String[] game.C_100341_jd.field_102650_sb
		// @4B: bipush 7 (0x07)
		// @4D: aaload
		// @4E: goto @58
		// @51: athrow
		// @52: getstatic java.lang.String[] game.C_100341_jd.field_102650_sb
		// @55: bipush 8 (0x08)
		// @57: aaload
		// @58: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @5B: bipush 44 (0x2C)
		// @5D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @60: aload_1
		// @61: ifnull @6E
		// @64: getstatic java.lang.String[] game.C_100341_jd.field_102650_sb
		// @67: bipush 7 (0x07)
		// @69: aaload
		// @6A: goto @74
		// @6D: athrow
		// @6E: getstatic java.lang.String[] game.C_100341_jd.field_102650_sb
		// @71: bipush 8 (0x08)
		// @73: aaload
		// @74: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @77: bipush 44 (0x2C)
		// @79: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7C: aload_2
		// @7D: ifnull @8A
		// @80: getstatic java.lang.String[] game.C_100341_jd.field_102650_sb
		// @83: bipush 7 (0x07)
		// @85: aaload
		// @86: goto @90
		// @89: athrow
		// @8A: getstatic java.lang.String[] game.C_100341_jd.field_102650_sb
		// @8D: bipush 8 (0x08)
		// @8F: aaload
		// @90: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @93: bipush 44 (0x2C)
		// @95: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @98: iload_3
		// @99: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @9C: bipush 41 (0x29)
		// @9E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A1: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @A4: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @A7: athrow
	}
	
	void func_102636_o(int arg0)
	{
		// @00: iload_1
		// @01: sipush 18323 (0x4793)
		// @04: if_icmpeq @11
		// @07: aload_0
		// @08: bipush 80 (0x50)
		// @0A: bipush 95 (0x5F)
		// @0C: bipush 118 (0x76)
		// @0E: invokevirtual game.C_100341_jd.func_102607_a(byte, int, int)void
		// @11: goto @35
		// @14: astore_2
		// @15: aload_2
		// @16: new java.lang.StringBuilder
		// @19: dup
		// @1A: invokespecial java.lang.StringBuilder.<init>()void
		// @1D: getstatic java.lang.String[] game.C_100341_jd.field_102650_sb
		// @20: iconst_0
		// @21: aaload
		// @22: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @25: iload_1
		// @26: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @29: bipush 41 (0x29)
		// @2B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @31: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @34: athrow
		// @35: return
	}
	
	public static void func_102630_l(int arg0)
	{
		// @00: bipush -41 (0xD7)
		// @02: iload_0
		// @03: bipush -25 (0xE7)
		// @05: isub
		// @06: bipush 62 (0x3E)
		// @08: idiv
		// @09: irem
		// @0A: istore_1
		// @0B: aconst_null
		// @0C: putstatic int[] game.C_100341_jd.field_102651_mb
		// @0F: aconst_null
		// @10: putstatic java.lang.String game.C_100341_jd.field_102639_qb
		// @13: aconst_null
		// @14: putstatic java.lang.String[] game.C_100341_jd.field_102648_ob
		// @17: aconst_null
		// @18: putstatic java.lang.String game.C_100341_jd.field_102644_rb
		// @1B: aconst_null
		// @1C: putstatic game.C_100177_cj game.C_100341_jd.field_102643_gb
		// @1F: aconst_null
		// @20: putstatic java.lang.String game.C_100341_jd.field_102645_jb
		// @23: aconst_null
		// @24: putstatic game.C_100302_ka game.C_100341_jd.field_102652_kb
		// @27: aconst_null
		// @28: putstatic byte[] game.C_100341_jd.field_102646_ib
		// @2B: goto @4F
		// @2E: astore_1
		// @2F: aload_1
		// @30: new java.lang.StringBuilder
		// @33: dup
		// @34: invokespecial java.lang.StringBuilder.<init>()void
		// @37: getstatic java.lang.String[] game.C_100341_jd.field_102650_sb
		// @3A: iconst_3
		// @3B: aaload
		// @3C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3F: iload_0
		// @40: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @43: bipush 41 (0x29)
		// @45: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @48: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4E: athrow
		// @4F: return
	}
	
	final void func_102629_a(int arg0, int arg1, int arg2, int arg3)
	{
		// @00: iload #4
		// @02: ifle @09
		// @05: goto @12
		// @08: athrow
		// @09: aload_0
		// @0A: bipush -101 (0x9B)
		// @0C: iload_3
		// @0D: iload_2
		// @0E: invokevirtual game.C_100341_jd.func_102615_b(byte, int, int)void
		// @11: return
		// @12: aload_0
		// @13: aload_0
		// @14: getfield int game.C_100341_jd.field_102537_l
		// @17: putfield int game.C_100341_jd.field_102638_cb
		// @1A: aload_0
		// @1B: aload_0
		// @1C: getfield int game.C_100341_jd.field_102544_t
		// @1F: putfield int game.C_100341_jd.field_102642_fb
		// @22: aload_0
		// @23: iload_3
		// @24: putfield int game.C_100341_jd.field_102640_hb
		// @27: aload_0
		// @28: iload_2
		// @29: putfield int game.C_100341_jd.field_102653_lb
		// @2C: iload_1
		// @2D: sipush 8013 (0x1F4D)
		// @30: if_icmpeq @3E
		// @33: aconst_null
		// @34: checkcast java.lang.String
		// @37: putstatic java.lang.String game.C_100341_jd.field_102644_rb
		// @3A: goto @3E
		// @3D: athrow
		// @3E: aload_0
		// @3F: iload #4
		// @41: putfield int game.C_100341_jd.field_102637_db
		// @44: aload_0
		// @45: iconst_0
		// @46: putfield int game.C_100341_jd.field_102649_pb
		// @49: goto @8B
		// @4C: astore #5
		// @4E: aload #5
		// @50: new java.lang.StringBuilder
		// @53: dup
		// @54: invokespecial java.lang.StringBuilder.<init>()void
		// @57: getstatic java.lang.String[] game.C_100341_jd.field_102650_sb
		// @5A: iconst_4
		// @5B: aaload
		// @5C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @5F: iload_1
		// @60: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @63: bipush 44 (0x2C)
		// @65: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @68: iload_2
		// @69: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6C: bipush 44 (0x2C)
		// @6E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @71: iload_3
		// @72: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @75: bipush 44 (0x2C)
		// @77: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7A: iload #4
		// @7C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7F: bipush 41 (0x29)
		// @81: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @84: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @87: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @8A: athrow
		// @8B: return
	}
	
	void func_102607_a(byte arg0, int arg1, int arg2)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #16
		// @005: bipush 6 (0x06)
		// @007: iload_2
		// @008: iadd
		// @009: iload_3
		// @00A: bipush 35 (0x23)
		// @00C: iadd
		// @00D: aload_0
		// @00E: getfield int game.C_100341_jd.field_102537_l
		// @011: bipush 12 (0x0C)
		// @013: isub
		// @014: aload_0
		// @015: getfield int game.C_100341_jd.field_102544_t
		// @018: bipush 40 (0x28)
		// @01A: isub
		// @01B: ldc 2105376 (0x202020)
		// @01D: iconst_0
		// @01E: invokestatic game.C_100196_rb.func_105798_b(int, int, int, int, int, int)void
		// @021: sipush 211 (0x00D3)
		// @024: istore #5
		// @026: bipush 35 (0x23)
		// @028: istore #4
		// @02A: sipush 194 (0x00C2)
		// @02D: istore #6
		// @02F: iconst_0
		// @030: istore #7
		// @032: iload_3
		// @033: istore #8
		// @035: iload #7
		// @037: iconst_m1
		// @038: ixor
		// @039: iload #4
		// @03B: iconst_m1
		// @03C: ixor
		// @03D: if_icmple @1DD
		// @040: getstatic int game.C_100196_rb.field_105816_f
		// @043: iconst_m1
		// @044: ixor
		// @045: iload #8
		// @047: iconst_m1
		// @048: ixor
		// @049: iload #16
		// @04B: ifne @1E5
		// @04E: if_icmplt @1D2
		// @051: goto @055
		// @054: athrow
		// @055: iload #8
		// @057: getstatic int game.C_100196_rb.field_105823_l
		// @05A: if_icmplt @06A
		// @05D: goto @061
		// @060: athrow
		// @061: iload #16
		// @063: ifeq @1D2
		// @066: goto @06A
		// @069: athrow
		// @06A: iload #7
		// @06C: iload #6
		// @06E: iload #5
		// @070: isub
		// @071: imul
		// @072: iload #4
		// @074: idiv
		// @075: iload #5
		// @077: iadd
		// @078: istore #9
		// @07A: iconst_0
		// @07B: istore #10
		// @07D: aload_0
		// @07E: getfield int game.C_100341_jd.field_102537_l
		// @081: istore #11
		// @083: iload #7
		// @085: bipush 20 (0x14)
		// @087: if_icmpgt @112
		// @08A: iload #10
		// @08C: iconst_m1
		// @08D: ixor
		// @08E: bipush -21 (0xEB)
		// @090: if_icmplt @112
		// @093: goto @097
		// @096: athrow
		// @097: bipush 20 (0x14)
		// @099: iload #7
		// @09B: isub
		// @09C: bipush 20 (0x14)
		// @09E: iload #7
		// @0A0: isub
		// @0A1: imul
		// @0A2: bipush 20 (0x14)
		// @0A4: iload #10
		// @0A6: isub
		// @0A7: bipush 20 (0x14)
		// @0A9: iload #10
		// @0AB: ineg
		// @0AC: iadd
		// @0AD: imul
		// @0AE: ineg
		// @0AF: isub
		// @0B0: istore #12
		// @0B2: sipush -463 (0xFE31)
		// @0B5: iload #12
		// @0B7: iconst_m1
		// @0B8: ixor
		// @0B9: iload #16
		// @0BB: ifne @118
		// @0BE: if_icmple @0CE
		// @0C1: goto @0C5
		// @0C4: athrow
		// @0C5: iload #16
		// @0C7: ifeq @10A
		// @0CA: goto @0CE
		// @0CD: athrow
		// @0CE: sipush 420 (0x01A4)
		// @0D1: iload #12
		// @0D3: if_icmpgt @112
		// @0D6: goto @0DA
		// @0D9: athrow
		// @0DA: iload #12
		// @0DC: ineg
		// @0DD: sipush 462 (0x01CE)
		// @0E0: iadd
		// @0E1: iload #9
		// @0E3: imul
		// @0E4: bipush 42 (0x2A)
		// @0E6: idiv
		// @0E7: istore #13
		// @0E9: iload #13
		// @0EB: iload #13
		// @0ED: ldc 1681937640 (0x644054e8)
		// @0EF: ishl
		// @0F0: iload #13
		// @0F2: ldc 324712496 (0x135ab830)
		// @0F4: ishl
		// @0F5: ior
		// @0F6: ior
		// @0F7: istore #13
		// @0F9: getstatic int[] game.C_100196_rb.field_105818_d
		// @0FC: iload #10
		// @0FE: iload_2
		// @0FF: iadd
		// @100: getstatic int game.C_100196_rb.field_105819_e
		// @103: iload #8
		// @105: imul
		// @106: iadd
		// @107: iload #13
		// @109: iastore
		// @10A: iinc #10 +1
		// @10D: iload #16
		// @10F: ifeq @08A
		// @112: bipush -21 (0xEB)
		// @114: iload #7
		// @116: iconst_m1
		// @117: ixor
		// @118: if_icmpgt @1B1
		// @11B: iload #11
		// @11D: istore #12
		// @11F: iinc #11 +235
		// @122: iconst_0
		// @123: istore #13
		// @125: iload #13
		// @127: iconst_m1
		// @128: ixor
		// @129: bipush -21 (0xEB)
		// @12B: if_icmplt @1AD
		// @12E: iload #13
		// @130: iload #13
		// @132: imul
		// @133: bipush 20 (0x14)
		// @135: iload #7
		// @137: isub
		// @138: bipush 20 (0x14)
		// @13A: iload #7
		// @13C: isub
		// @13D: imul
		// @13E: iadd
		// @13F: istore #14
		// @141: sipush 462 (0x01CE)
		// @144: iload #14
		// @146: iload #16
		// @148: ifne @1C7
		// @14B: if_icmpge @15B
		// @14E: goto @152
		// @151: athrow
		// @152: iload #16
		// @154: ifeq @1AD
		// @157: goto @15B
		// @15A: athrow
		// @15B: iload #14
		// @15D: sipush 420 (0x01A4)
		// @160: if_icmpge @172
		// @163: goto @167
		// @166: athrow
		// @167: iconst_1
		// @168: iload #11
		// @16A: iadd
		// @16B: istore #12
		// @16D: iload #16
		// @16F: ifeq @1A2
		// @172: iload #9
		// @174: sipush 462 (0x01CE)
		// @177: iload #14
		// @179: ineg
		// @17A: iadd
		// @17B: imul
		// @17C: bipush 42 (0x2A)
		// @17E: idiv
		// @17F: istore #15
		// @181: iload #15
		// @183: iload #15
		// @185: ldc 875115184 (0x342932b0)
		// @187: ishl
		// @188: iload #15
		// @18A: ldc 1989693256 (0x76984f48)
		// @18C: ishl
		// @18D: ior
		// @18E: ior
		// @18F: istore #15
		// @191: getstatic int[] game.C_100196_rb.field_105818_d
		// @194: iload #11
		// @196: getstatic int game.C_100196_rb.field_105819_e
		// @199: iload #8
		// @19B: imul
		// @19C: iload_2
		// @19D: iadd
		// @19E: iadd
		// @19F: iload #15
		// @1A1: iastore
		// @1A2: iinc #11 +1
		// @1A5: iinc #13 +1
		// @1A8: iload #16
		// @1AA: ifeq @125
		// @1AD: iload #12
		// @1AF: istore #11
		// @1B1: iload #9
		// @1B3: iload #9
		// @1B5: ldc -1251850168 (0xb5624848)
		// @1B7: ishl
		// @1B8: iload #9
		// @1BA: ldc -909321360 (0xc9ccdb70)
		// @1BC: ishl
		// @1BD: ior
		// @1BE: ior
		// @1BF: istore #9
		// @1C1: iload #10
		// @1C3: iload_2
		// @1C4: iadd
		// @1C5: iload #8
		// @1C7: iload #11
		// @1C9: iload #10
		// @1CB: ineg
		// @1CC: iadd
		// @1CD: iload #9
		// @1CF: invokestatic game.C_100196_rb.func_105807_g(int, int, int, int)void
		// @1D2: iinc #7 +1
		// @1D5: iinc #8 +1
		// @1D8: iload #16
		// @1DA: ifeq @035
		// @1DD: sipush 194 (0x00C2)
		// @1E0: istore #5
		// @1E2: iload_1
		// @1E3: bipush -7 (0xF9)
		// @1E5: if_icmple @1E9
		// @1E8: return
		// @1E9: bipush 22 (0x16)
		// @1EB: istore #4
		// @1ED: sipush 169 (0x00A9)
		// @1F0: istore #6
		// @1F2: iconst_0
		// @1F3: istore #7
		// @1F5: iload_3
		// @1F6: bipush -35 (0xDD)
		// @1F8: isub
		// @1F9: istore #8
		// @1FB: iload #4
		// @1FD: iconst_m1
		// @1FE: ixor
		// @1FF: iload #7
		// @201: iconst_m1
		// @202: ixor
		// @203: if_icmpge @256
		// @206: iload #7
		// @208: iload #6
		// @20A: iload #5
		// @20C: isub
		// @20D: imul
		// @20E: iload #4
		// @210: idiv
		// @211: iload #5
		// @213: iadd
		// @214: istore #9
		// @216: iload #9
		// @218: iload #9
		// @21A: ldc -1089017840 (0xbf16e810)
		// @21C: ishl
		// @21D: iload #9
		// @21F: ldc -112326936 (0xf94e06e8)
		// @221: ishl
		// @222: ior
		// @223: ior
		// @224: istore #9
		// @226: iload_2
		// @227: iload #8
		// @229: bipush 6 (0x06)
		// @22B: iload #9
		// @22D: invokestatic game.C_100196_rb.func_105807_g(int, int, int, int)void
		// @230: iload_2
		// @231: aload_0
		// @232: getfield int game.C_100341_jd.field_102537_l
		// @235: iadd
		// @236: bipush -6 (0xFA)
		// @238: iadd
		// @239: iload #8
		// @23B: bipush 6 (0x06)
		// @23D: iload #9
		// @23F: invokestatic game.C_100196_rb.func_105807_g(int, int, int, int)void
		// @242: iinc #7 +1
		// @245: iinc #8 +1
		// @248: iload #16
		// @24A: ifne @2AA
		// @24D: iload #16
		// @24F: ifeq @1FB
		// @252: goto @256
		// @255: athrow
		// @256: getstatic game.C_100037_wb game.C_100148_bh.field_101794_F
		// @259: bipush -90 (0xA6)
		// @25B: iload_2
		// @25C: iadd
		// @25D: aload_0
		// @25E: getfield int game.C_100341_jd.field_102537_l
		// @261: iadd
		// @262: bipush 10 (0x0A)
		// @264: iload_3
		// @265: iadd
		// @266: invokevirtual game.C_100037_wb.func_102353_h(int, int)void
		// @269: getstatic game.C_100037_wb[] game.C_100218_am.field_103110_E
		// @26C: aload_0
		// @26D: getfield int game.C_100341_jd.field_102537_l
		// @270: bipush 10 (0x0A)
		// @272: isub
		// @273: bipush -112 (0x90)
		// @275: iload_3
		// @276: bipush -35 (0xDD)
		// @278: isub
		// @279: iconst_5
		// @27A: iload_2
		// @27B: iadd
		// @27C: invokestatic game.C_100031_gl.func_103957_a(game.C_100037_wb[], int, int, int, int)void
		// @27F: getstatic game.C_100037_wb[] game.C_100157_db.field_103558_e
		// @282: aload_0
		// @283: getfield int game.C_100341_jd.field_102537_l
		// @286: bipush -105 (0x97)
		// @288: aload_0
		// @289: getfield int game.C_100341_jd.field_102544_t
		// @28C: iload_3
		// @28D: iadd
		// @28E: bipush 22 (0x16)
		// @290: isub
		// @291: iload_2
		// @292: invokestatic game.C_100031_gl.func_103957_a(game.C_100037_wb[], int, int, int, int)void
		// @295: bipush 127 (0x7F)
		// @297: istore #6
		// @299: bipush -79 (0xB1)
		// @29B: aload_0
		// @29C: getfield int game.C_100341_jd.field_102544_t
		// @29F: iadd
		// @2A0: istore #4
		// @2A2: sipush 169 (0x00A9)
		// @2A5: istore #5
		// @2A7: iconst_0
		// @2A8: istore #7
		// @2AA: iload_3
		// @2AB: bipush -57 (0xC7)
		// @2AD: isub
		// @2AE: istore #8
		// @2B0: iload #4
		// @2B2: iload #7
		// @2B4: if_icmple @308
		// @2B7: iload #5
		// @2B9: iload #5
		// @2BB: ineg
		// @2BC: iload #6
		// @2BE: iadd
		// @2BF: iload #7
		// @2C1: imul
		// @2C2: iload #4
		// @2C4: idiv
		// @2C5: iadd
		// @2C6: istore #9
		// @2C8: iload #9
		// @2CA: iload #9
		// @2CC: ldc 2032377136 (0x79239d30)
		// @2CE: ishl
		// @2CF: iload #9
		// @2D1: ldc 1396996744 (0x53447a88)
		// @2D3: ishl
		// @2D4: ior
		// @2D5: ior
		// @2D6: istore #9
		// @2D8: iload_2
		// @2D9: iload #8
		// @2DB: bipush 6 (0x06)
		// @2DD: iload #9
		// @2DF: invokestatic game.C_100196_rb.func_105807_g(int, int, int, int)void
		// @2E2: iload_2
		// @2E3: aload_0
		// @2E4: getfield int game.C_100341_jd.field_102537_l
		// @2E7: bipush 6 (0x06)
		// @2E9: isub
		// @2EA: iadd
		// @2EB: iload #8
		// @2ED: bipush 6 (0x06)
		// @2EF: iload #9
		// @2F1: invokestatic game.C_100196_rb.func_105807_g(int, int, int, int)void
		// @2F4: iinc #8 +1
		// @2F7: iinc #7 +1
		// @2FA: iload #16
		// @2FC: ifne @340
		// @2FF: iload #16
		// @301: ifeq @2B0
		// @304: goto @308
		// @307: athrow
		// @308: goto @340
		// @30B: astore #4
		// @30D: aload #4
		// @30F: new java.lang.StringBuilder
		// @312: dup
		// @313: invokespecial java.lang.StringBuilder.<init>()void
		// @316: getstatic java.lang.String[] game.C_100341_jd.field_102650_sb
		// @319: iconst_2
		// @31A: aaload
		// @31B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @31E: iload_1
		// @31F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @322: bipush 44 (0x2C)
		// @324: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @327: iload_2
		// @328: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @32B: bipush 44 (0x2C)
		// @32D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @330: iload_3
		// @331: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @334: bipush 41 (0x29)
		// @336: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @339: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @33C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @33F: athrow
		// @340: return
	}
	
	boolean func_102613_k(int arg0)
	{
		// @00: aload_0
		// @01: getfield int game.C_100341_jd.field_102637_db
		// @04: iconst_m1
		// @05: ixor
		// @06: iconst_m1
		// @07: if_icmpge @92
		// @0A: aload_0
		// @0B: getfield int game.C_100341_jd.field_102653_lb
		// @0E: istore_2
		// @0F: aload_0
		// @10: getfield int game.C_100341_jd.field_102640_hb
		// @13: istore_3
		// @14: aload_0
		// @15: getfield int game.C_100341_jd.field_102637_db
		// @18: iconst_m1
		// @19: ixor
		// @1A: aload_0
		// @1B: dup
		// @1C: getfield int game.C_100341_jd.field_102649_pb
		// @1F: iconst_1
		// @20: iadd
		// @21: dup_x1
		// @22: putfield int game.C_100341_jd.field_102649_pb
		// @25: iconst_m1
		// @26: ixor
		// @27: if_icmpge @7A
		// @2A: aload_0
		// @2B: getfield int game.C_100341_jd.field_102649_pb
		// @2E: aload_0
		// @2F: getfield int game.C_100341_jd.field_102649_pb
		// @32: ineg
		// @33: aload_0
		// @34: getfield int game.C_100341_jd.field_102637_db
		// @37: iconst_2
		// @38: imul
		// @39: iadd
		// @3A: imul
		// @3B: istore #4
		// @3D: aload_0
		// @3E: getfield int game.C_100341_jd.field_102637_db
		// @41: aload_0
		// @42: getfield int game.C_100341_jd.field_102637_db
		// @45: imul
		// @46: istore #5
		// @48: iload #4
		// @4A: aload_0
		// @4B: getfield int game.C_100341_jd.field_102642_fb
		// @4E: ineg
		// @4F: aload_0
		// @50: getfield int game.C_100341_jd.field_102640_hb
		// @53: iadd
		// @54: imul
		// @55: iload #5
		// @57: idiv
		// @58: aload_0
		// @59: getfield int game.C_100341_jd.field_102642_fb
		// @5C: iadd
		// @5D: istore_3
		// @5E: iload #4
		// @60: aload_0
		// @61: getfield int game.C_100341_jd.field_102638_cb
		// @64: ineg
		// @65: aload_0
		// @66: getfield int game.C_100341_jd.field_102653_lb
		// @69: iadd
		// @6A: imul
		// @6B: iload #5
		// @6D: idiv
		// @6E: aload_0
		// @6F: getfield int game.C_100341_jd.field_102638_cb
		// @72: iadd
		// @73: istore_2
		// @74: getstatic int game.SteelSentinels.field_105275_O
		// @77: ifeq @8A
		// @7A: aload_0
		// @7B: iconst_0
		// @7C: putfield int game.C_100341_jd.field_102637_db
		// @7F: aload_0
		// @80: sipush 18323 (0x4793)
		// @83: invokevirtual game.C_100341_jd.func_102636_o(int)void
		// @86: goto @8A
		// @89: athrow
		// @8A: aload_0
		// @8B: bipush -72 (0xB8)
		// @8D: iload_3
		// @8E: iload_2
		// @8F: invokevirtual game.C_100341_jd.func_102615_b(byte, int, int)void
		// @92: iload_1
		// @93: sipush 248 (0x00F8)
		// @96: if_icmpeq @A3
		// @99: aload_0
		// @9A: bipush -17 (0xEF)
		// @9C: putfield int game.C_100341_jd.field_102653_lb
		// @9F: goto @A3
		// @A2: athrow
		// @A3: aload_0
		// @A4: sipush 248 (0x00F8)
		// @A7: invokespecial game.C_100136_th.func_102613_k(int)boolean
		// @AA: ireturn
		// @AB: astore_2
		// @AC: aload_2
		// @AD: new java.lang.StringBuilder
		// @B0: dup
		// @B1: invokespecial java.lang.StringBuilder.<init>()void
		// @B4: getstatic java.lang.String[] game.C_100341_jd.field_102650_sb
		// @B7: bipush 6 (0x06)
		// @B9: aaload
		// @BA: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @BD: iload_1
		// @BE: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @C1: bipush 41 (0x29)
		// @C3: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C6: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @C9: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @CC: athrow
	}
	
	static
	{
		// @00: bipush 11 (0x0B)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "KWGr}\t"
		// @09: invokestatic game.C_100341_jd.func_102633_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100341_jd.func_102632_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "KWGs}\t"
		// @14: invokestatic game.C_100341_jd.func_102633_z(java.lang.String)char[]
		// @17: invokestatic game.C_100341_jd.func_102632_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "KWGa~\t"
		// @1F: invokestatic game.C_100341_jd.func_102633_z(java.lang.String)char[]
		// @22: invokestatic game.C_100341_jd.func_102632_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "KWGf~\t"
		// @2A: invokestatic game.C_100341_jd.func_102633_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100341_jd.func_102632_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "KWGd~\t"
		// @35: invokestatic game.C_100341_jd.func_102633_z(java.lang.String)char[]
		// @38: invokestatic game.C_100341_jd.func_102632_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "KWGg~\t"
		// @40: invokestatic game.C_100341_jd.func_102633_z(java.lang.String)char[]
		// @43: invokestatic game.C_100341_jd.func_102632_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "KWGv}\t"
		// @4C: invokestatic game.C_100341_jd.func_102633_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100341_jd.func_102632_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "Z\u001dG\u000cA"
		// @58: invokestatic game.C_100341_jd.func_102633_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100341_jd.func_102632_z(char[])java.lang.String
		// @5E: aastore
		// @5F: dup
		// @60: bipush 8 (0x08)
		// @62: ldc "OF\u0005N"
		// @64: invokestatic game.C_100341_jd.func_102633_z(java.lang.String)char[]
		// @67: invokestatic game.C_100341_jd.func_102632_z(char[])java.lang.String
		// @6A: aastore
		// @6B: dup
		// @6C: bipush 9 (0x09)
		// @6E: ldc "KWG`~\t"
		// @70: invokestatic game.C_100341_jd.func_102633_z(java.lang.String)char[]
		// @73: invokestatic game.C_100341_jd.func_102632_z(char[])java.lang.String
		// @76: aastore
		// @77: dup
		// @78: bipush 10 (0x0A)
		// @7A: ldc "KWGc~\t"
		// @7C: invokestatic game.C_100341_jd.func_102633_z(java.lang.String)char[]
		// @7F: invokestatic game.C_100341_jd.func_102632_z(char[])java.lang.String
		// @82: aastore
		// @83: putstatic java.lang.String[] game.C_100341_jd.field_102650_sb
		// @86: iconst_0
		// @87: putstatic boolean game.C_100341_jd.field_102647_nb
		// @8A: ldc "m\\\u000eEUOTIKR\u000f\u001dG"
		// @8C: invokestatic game.C_100341_jd.func_102633_z(java.lang.String)char[]
		// @8F: invokestatic game.C_100341_jd.func_102632_z(char[])java.lang.String
		// @92: putstatic java.lang.String game.C_100341_jd.field_102644_rb
		// @95: iconst_4
		// @96: newarray int[]
		// @98: dup
		// @99: iconst_0
		// @9A: iconst_m1
		// @9B: iastore
		// @9C: dup
		// @9D: iconst_1
		// @9E: bipush 28 (0x1C)
		// @A0: iastore
		// @A1: dup
		// @A2: iconst_2
		// @A3: iconst_m1
		// @A4: iastore
		// @A5: dup
		// @A6: iconst_3
		// @A7: bipush 7 (0x07)
		// @A9: iastore
		// @AA: putstatic int[] game.C_100341_jd.field_102651_mb
		// @AD: ldc "\u001d\u0016Y\u001c\u001cV\\\u001cNX\u0001]\u000cGX\u0001RIP]UZ\u0007E\u001cNUI\u001e\u0019\u0010\rIVS\u0001C\u0005CE\u0001D\u0000VT\u0001G\u0001G\u001cBF\u001bPYOGIMLUZ\u0006LO\u000f"
		// @AF: invokestatic game.C_100341_jd.func_102633_z(java.lang.String)char[]
		// @B2: invokestatic game.C_100341_jd.func_102632_z(char[])java.lang.String
		// @B5: putstatic java.lang.String game.C_100341_jd.field_102645_jb
		// @B8: ldc "m\\\u000eKR\u001b\u0013"
		// @BA: invokestatic game.C_100341_jd.func_102633_z(java.lang.String)char[]
		// @BD: invokestatic game.C_100341_jd.func_102632_z(char[])java.lang.String
		// @C0: putstatic java.lang.String game.C_100341_jd.field_102639_qb
		// @C3: return
	}
	
	private static char[] func_102633_z(String arg0)
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
		// @0E: bipush 60 (0x3C)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_102632_z(char[] arg0)
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
		// @30: bipush 33 (0x21)
		// @32: goto @46
		// @35: bipush 51 (0x33)
		// @37: goto @46
		// @3A: bipush 105 (0x69)
		// @3C: goto @46
		// @3F: bipush 34 (0x22)
		// @41: goto @46
		// @44: bipush 60 (0x3C)
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
