package game;

final class C_100001_ge implements C_100326_ic
{
	private int field_100561_g;
	private int field_100560_f;
	private int field_100565_c;
	static int field_100570_m;
	private C_100112_r field_100569_l;
	static volatile int field_100563_e;
	private int field_100578_q;
	private int field_100566_a;
	private int field_100575_t;
	static volatile long field_100571_j;
	private int field_100579_p;
	private int field_100576_s;
	static int[] field_100573_h;
	private int field_100567_n;
	private int field_100572_k;
	private int field_100568_o;
	static String field_100564_b;
	static int field_100574_i;
	static int[] field_100562_d;
	static int field_100577_r;
	private static final String[] field_100580_z;
	
	static final int func_100557_a(int arg0, int arg1, byte arg2)
	{
		// @00: iload_2
		// @01: bipush -96 (0xA0)
		// @03: if_icmple @09
		// @06: bipush 114 (0x72)
		// @08: ireturn
		// @09: bipush -3 (0xFD)
		// @0B: iload_1
		// @0C: iconst_m1
		// @0D: ixor
		// @0E: if_icmplt @13
		// @11: iconst_2
		// @12: ireturn
		// @13: iload_0
		// @14: iconst_5
		// @15: if_icmpge @1A
		// @18: iconst_0
		// @19: ireturn
		// @1A: iconst_1
		// @1B: ireturn
		// @1C: astore_3
		// @1D: aload_3
		// @1E: new java.lang.StringBuilder
		// @21: dup
		// @22: invokespecial java.lang.StringBuilder.<init>()void
		// @25: getstatic java.lang.String[] game.C_100001_ge.field_100580_z
		// @28: bipush 9 (0x09)
		// @2A: aaload
		// @2B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2E: iload_0
		// @2F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @32: bipush 44 (0x2C)
		// @34: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
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
	
	static final void func_100556_a(byte arg0)
	{
		// @00: aconst_null
		// @01: getstatic game.C_100029_gn game.C_100085_a.field_102576_K
		// @04: if_acmpeq @13
		// @07: getstatic game.C_100029_gn game.C_100085_a.field_102576_K
		// @0A: bipush 12 (0x0C)
		// @0C: invokevirtual game.C_100029_gn.func_103361_f(byte)void
		// @0F: goto @13
		// @12: athrow
		// @13: iload_0
		// @14: bipush 61 (0x3D)
		// @16: if_icmpge @1A
		// @19: return
		// @1A: getstatic game.C_100129_tg game.C_100061_dh.field_101992_mc
		// @1D: ifnull @2D
		// @20: getstatic game.C_100129_tg game.C_100061_dh.field_101992_mc
		// @23: sipush 31865 (0x7C79)
		// @26: invokevirtual game.C_100129_tg.func_102739_p(int)void
		// @29: goto @2D
		// @2C: athrow
		// @2D: bipush -98 (0x9E)
		// @2F: invokestatic game.C_100330_ig.func_107280_a(byte)void
		// @32: goto @57
		// @35: astore_1
		// @36: aload_1
		// @37: new java.lang.StringBuilder
		// @3A: dup
		// @3B: invokespecial java.lang.StringBuilder.<init>()void
		// @3E: getstatic java.lang.String[] game.C_100001_ge.field_100580_z
		// @41: bipush 7 (0x07)
		// @43: aaload
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
	
	public final void func_100362_a(boolean arg0, int arg1, int arg2, int arg3, C_100336_im arg4)
	{
		// @000: aload #5
		// @002: instanceof game.C_100036_gg
		// @005: ifne @00D
		// @008: aconst_null
		// @009: goto @00F
		// @00C: athrow
		// @00D: aload #5
		// @00F: checkcast game.C_100036_gg
		// @012: checkcast game.C_100036_gg
		// @015: astore #6
		// @017: aconst_null
		// @018: aload #6
		// @01A: if_acmpeq @025
		// @01D: iload_1
		// @01E: aload #6
		// @020: getfield boolean game.C_100036_gg.field_103113_L
		// @023: iand
		// @024: istore_1
		// @025: ldc 5592405 (0x555555)
		// @027: istore #7
		// @029: aload #5
		// @02B: getfield int game.C_100336_im.field_102538_m
		// @02E: iload_3
		// @02F: iadd
		// @030: iload #4
		// @032: aload #5
		// @034: getfield int game.C_100336_im.field_102541_w
		// @037: ineg
		// @038: isub
		// @039: aload #5
		// @03B: getfield int game.C_100336_im.field_102537_l
		// @03E: aload #5
		// @040: getfield int game.C_100336_im.field_102544_t
		// @043: aload_0
		// @044: getfield int game.C_100001_ge.field_100566_a
		// @047: invokestatic game.C_100196_rb.func_105782_i(int, int, int, int, int)void
		// @04A: iload_1
		// @04B: ifeq @052
		// @04E: ldc 16777215 (0xffffff)
		// @050: istore #7
		// @052: iload_2
		// @053: sipush -26568 (0x9838)
		// @056: if_icmpeq @063
		// @059: ldc2_w -110
		// @05C: putstatic long game.C_100001_ge.field_100571_j
		// @05F: goto @063
		// @062: athrow
		// @063: aload_0
		// @064: getfield int game.C_100001_ge.field_100572_k
		// @067: aload #5
		// @069: getfield int game.C_100336_im.field_102538_m
		// @06C: iadd
		// @06D: iload_3
		// @06E: iadd
		// @06F: istore #8
		// @071: aload #5
		// @073: getfield int game.C_100336_im.field_102541_w
		// @076: iload #4
		// @078: aload_0
		// @079: getfield int game.C_100001_ge.field_100560_f
		// @07C: iadd
		// @07D: iadd
		// @07E: istore #9
		// @080: iload #8
		// @082: iload #9
		// @084: aload_0
		// @085: getfield int game.C_100001_ge.field_100568_o
		// @088: aload_0
		// @089: getfield int game.C_100001_ge.field_100565_c
		// @08C: ldc 5592405 (0x555555)
		// @08E: invokestatic game.C_100196_rb.func_105783_g(int, int, int, int, int)void
		// @091: iload #8
		// @093: iload #9
		// @095: aload_0
		// @096: getfield int game.C_100001_ge.field_100568_o
		// @099: aload_0
		// @09A: getfield int game.C_100001_ge.field_100565_c
		// @09D: iload #7
		// @09F: invokestatic game.C_100196_rb.func_105782_i(int, int, int, int, int)void
		// @0A2: aload #6
		// @0A4: getfield boolean game.C_100036_gg.field_103120_K
		// @0A7: ifeq @0DA
		// @0AA: iload #8
		// @0AC: iload #9
		// @0AE: iload #8
		// @0B0: aload_0
		// @0B1: getfield int game.C_100001_ge.field_100568_o
		// @0B4: iadd
		// @0B5: iload #9
		// @0B7: aload_0
		// @0B8: getfield int game.C_100001_ge.field_100565_c
		// @0BB: iadd
		// @0BC: iconst_1
		// @0BD: invokestatic game.C_100196_rb.func_105802_e(int, int, int, int, int)void
		// @0C0: aload_0
		// @0C1: getfield int game.C_100001_ge.field_100568_o
		// @0C4: iload #8
		// @0C6: iadd
		// @0C7: iload #9
		// @0C9: iload #8
		// @0CB: iload #9
		// @0CD: aload_0
		// @0CE: getfield int game.C_100001_ge.field_100565_c
		// @0D1: iadd
		// @0D2: iconst_1
		// @0D3: invokestatic game.C_100196_rb.func_105802_e(int, int, int, int, int)void
		// @0D6: goto @0DA
		// @0D9: athrow
		// @0DA: aconst_null
		// @0DB: aload_0
		// @0DC: getfield game.C_100112_r game.C_100001_ge.field_100569_l
		// @0DF: if_acmpeq @144
		// @0E2: aload_0
		// @0E3: getfield int game.C_100001_ge.field_100572_k
		// @0E6: aload_0
		// @0E7: getfield int game.C_100001_ge.field_100568_o
		// @0EA: iadd
		// @0EB: aload_0
		// @0EC: getfield int game.C_100001_ge.field_100575_t
		// @0EF: iadd
		// @0F0: istore #10
		// @0F2: aload_0
		// @0F3: getfield game.C_100112_r game.C_100001_ge.field_100569_l
		// @0F6: aload #5
		// @0F8: getfield java.lang.String game.C_100336_im.field_102534_C
		// @0FB: iload #10
		// @0FD: iload_3
		// @0FE: aload #5
		// @100: getfield int game.C_100336_im.field_102538_m
		// @103: iadd
		// @104: iadd
		// @105: aload #5
		// @107: getfield int game.C_100336_im.field_102541_w
		// @10A: iload #4
		// @10C: aload_0
		// @10D: getfield int game.C_100001_ge.field_100579_p
		// @110: iadd
		// @111: iadd
		// @112: aload #5
		// @114: getfield int game.C_100336_im.field_102537_l
		// @117: aload_0
		// @118: getfield int game.C_100001_ge.field_100575_t
		// @11B: ineg
		// @11C: iload #10
		// @11E: ineg
		// @11F: iadd
		// @120: iadd
		// @121: aload #5
		// @123: getfield int game.C_100336_im.field_102544_t
		// @126: aload_0
		// @127: getfield int game.C_100001_ge.field_100575_t
		// @12A: ldc 1394585825 (0x531fb0e1)
		// @12C: ishl
		// @12D: ineg
		// @12E: iadd
		// @12F: aload_0
		// @130: getfield int game.C_100001_ge.field_100578_q
		// @133: aload_0
		// @134: getfield int game.C_100001_ge.field_100561_g
		// @137: aload_0
		// @138: getfield int game.C_100001_ge.field_100576_s
		// @13B: aload_0
		// @13C: getfield int game.C_100001_ge.field_100567_n
		// @13F: iconst_0
		// @140: invokevirtual game.C_100112_r.func_101729_a(java.lang.String, int, int, int, int, int, int, int, int, int)int
		// @143: pop
		// @144: goto @1A1
		// @147: astore #6
		// @149: aload #6
		// @14B: new java.lang.StringBuilder
		// @14E: dup
		// @14F: invokespecial java.lang.StringBuilder.<init>()void
		// @152: getstatic java.lang.String[] game.C_100001_ge.field_100580_z
		// @155: iconst_4
		// @156: aaload
		// @157: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @15A: iload_1
		// @15B: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @15E: bipush 44 (0x2C)
		// @160: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @163: iload_2
		// @164: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @167: bipush 44 (0x2C)
		// @169: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @16C: iload_3
		// @16D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @170: bipush 44 (0x2C)
		// @172: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @175: iload #4
		// @177: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @17A: bipush 44 (0x2C)
		// @17C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @17F: aload #5
		// @181: ifnull @18D
		// @184: getstatic java.lang.String[] game.C_100001_ge.field_100580_z
		// @187: iconst_2
		// @188: aaload
		// @189: goto @192
		// @18C: athrow
		// @18D: getstatic java.lang.String[] game.C_100001_ge.field_100580_z
		// @190: iconst_0
		// @191: aaload
		// @192: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @195: bipush 41 (0x29)
		// @197: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @19A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @19D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @1A0: athrow
		// @1A1: return
	}
	
	static final int func_100552_a(CharSequence arg0, int arg1)
	{
		// @00: iload_1
		// @01: bipush -113 (0x8F)
		// @03: if_icmplt @3F
		// @06: bipush -40 (0xD8)
		// @08: bipush -58 (0xC6)
		// @0A: bipush 41 (0x29)
		// @0C: iconst_4
		// @0D: bipush -33 (0xDF)
		// @0F: bipush 43 (0x2B)
		// @11: bipush -81 (0xAF)
		// @13: aconst_null
		// @14: checkcast game.C_100127_tl
		// @17: bipush 89 (0x59)
		// @19: bipush 8 (0x08)
		// @1B: bipush 40 (0x28)
		// @1D: bipush -119 (0x89)
		// @1F: aconst_null
		// @20: checkcast game.C_100127_tl
		// @23: bipush -106 (0x96)
		// @25: bipush 115 (0x73)
		// @27: aconst_null
		// @28: checkcast game.C_100127_tl
		// @2B: iconst_5
		// @2C: bipush 122 (0x7A)
		// @2E: aconst_null
		// @2F: checkcast game.C_100112_r
		// @32: aconst_null
		// @33: checkcast game.C_100112_r
		// @36: bipush -110 (0x92)
		// @38: invokestatic game.C_100001_ge.func_100559_a(int, int, int, int, int, int, int, game.C_100127_tl, int, int, int, int, game.C_100127_tl, int, int, game.C_100127_tl, int, int, game.C_100112_r, game.C_100112_r, int)void
		// @3B: goto @3F
		// @3E: athrow
		// @3F: bipush -93 (0xA3)
		// @41: aload_0
		// @42: bipush 10 (0x0A)
		// @44: iconst_1
		// @45: invokestatic game.C_100008_fl.func_103636_a(byte, java.lang.CharSequence, int, boolean)int
		// @48: ireturn
		// @49: astore_2
		// @4A: aload_2
		// @4B: new java.lang.StringBuilder
		// @4E: dup
		// @4F: invokespecial java.lang.StringBuilder.<init>()void
		// @52: getstatic java.lang.String[] game.C_100001_ge.field_100580_z
		// @55: bipush 6 (0x06)
		// @57: aaload
		// @58: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @5B: aload_0
		// @5C: ifnull @68
		// @5F: getstatic java.lang.String[] game.C_100001_ge.field_100580_z
		// @62: iconst_2
		// @63: aaload
		// @64: goto @6D
		// @67: athrow
		// @68: getstatic java.lang.String[] game.C_100001_ge.field_100580_z
		// @6B: iconst_0
		// @6C: aaload
		// @6D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @70: bipush 44 (0x2C)
		// @72: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @75: iload_1
		// @76: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @79: bipush 41 (0x29)
		// @7B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @81: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @84: athrow
	}
	
	static final void func_100553_c(int arg0)
	{
		// @00: getstatic boolean game.C_100010_ff.field_103697_l
		// @03: ifeq @0A
		// @06: goto @12
		// @09: athrow
		// @0A: new java.lang.IllegalStateException
		// @0D: dup
		// @0E: invokespecial java.lang.IllegalStateException.<init>()void
		// @11: athrow
		// @12: iconst_1
		// @13: putstatic boolean game.C_100244_pe.field_106377_b
		// @16: iload_0
		// @17: sipush 3176 (0x0C68)
		// @1A: if_icmpeq @1E
		// @1D: return
		// @1E: iconst_0
		// @1F: bipush 104 (0x68)
		// @21: invokestatic game.C_100143_bl.func_105093_a(boolean, byte)void
		// @24: iconst_0
		// @25: putstatic int game.C_100087_n.field_100697_v
		// @28: goto @4C
		// @2B: astore_1
		// @2C: aload_1
		// @2D: new java.lang.StringBuilder
		// @30: dup
		// @31: invokespecial java.lang.StringBuilder.<init>()void
		// @34: getstatic java.lang.String[] game.C_100001_ge.field_100580_z
		// @37: iconst_5
		// @38: aaload
		// @39: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3C: iload_0
		// @3D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @40: bipush 41 (0x29)
		// @42: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @45: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @48: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4B: athrow
		// @4C: return
	}
	
	static final void func_100554_a(int arg0)
	{
		// @00: iload_0
		// @01: ldc 1394585825 (0x531fb0e1)
		// @03: if_icmpeq @0F
		// @06: bipush -90 (0xA6)
		// @08: putstatic int game.C_100001_ge.field_100563_e
		// @0B: goto @0F
		// @0E: athrow
		// @0F: aconst_null
		// @10: getstatic game.C_100301_kb game.C_100280_nf.field_101183_k
		// @13: if_acmpne @1A
		// @16: goto @3D
		// @19: athrow
		// @1A: getstatic game.C_100301_kb game.C_100280_nf.field_101183_k
		// @1D: lconst_0
		// @1E: bipush 34 (0x22)
		// @20: invokevirtual game.C_100301_kb.func_107086_a(long, int)void
		// @23: getstatic game.C_100301_kb game.C_100280_nf.field_101183_k
		// @26: getstatic game.C_100278_nd game.C_100288_jn.field_106839_f
		// @29: getfield byte[] game.C_100278_nd.field_101179_l
		// @2C: bipush 24 (0x18)
		// @2E: getstatic game.C_100278_nd game.C_100288_jn.field_106839_f
		// @31: getfield int game.C_100278_nd.field_101177_n
		// @34: bipush -113 (0x8F)
		// @36: invokevirtual game.C_100301_kb.func_107079_a(byte[], int, int, byte)void
		// @39: goto @3D
		// @3C: astore_1
		// @3D: getstatic game.C_100278_nd game.C_100288_jn.field_106839_f
		// @40: dup
		// @41: getfield int game.C_100278_nd.field_101177_n
		// @44: bipush 24 (0x18)
		// @46: iadd
		// @47: putfield int game.C_100278_nd.field_101177_n
		// @4A: goto @6E
		// @4D: astore_1
		// @4E: aload_1
		// @4F: new java.lang.StringBuilder
		// @52: dup
		// @53: invokespecial java.lang.StringBuilder.<init>()void
		// @56: getstatic java.lang.String[] game.C_100001_ge.field_100580_z
		// @59: iconst_3
		// @5A: aaload
		// @5B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @5E: iload_0
		// @5F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @62: bipush 41 (0x29)
		// @64: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @67: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @6A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @6D: athrow
		// @6E: return
	}
	
	public static void func_100551_b(int arg0)
	{
		// @00: iload_0
		// @01: iconst_2
		// @02: if_icmpeq @0E
		// @05: bipush -123 (0x85)
		// @07: putstatic int game.C_100001_ge.field_100577_r
		// @0A: goto @0E
		// @0D: athrow
		// @0E: aconst_null
		// @0F: putstatic java.lang.String game.C_100001_ge.field_100564_b
		// @12: aconst_null
		// @13: putstatic int[] game.C_100001_ge.field_100562_d
		// @16: aconst_null
		// @17: putstatic int[] game.C_100001_ge.field_100573_h
		// @1A: goto @3F
		// @1D: astore_1
		// @1E: aload_1
		// @1F: new java.lang.StringBuilder
		// @22: dup
		// @23: invokespecial java.lang.StringBuilder.<init>()void
		// @26: getstatic java.lang.String[] game.C_100001_ge.field_100580_z
		// @29: bipush 8 (0x08)
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
	
	static final void func_100559_a(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, C_100127_tl arg7, int arg8, int arg9, int arg10, int arg11, C_100127_tl arg12, int arg13, int arg14, C_100127_tl arg15, int arg16, int arg17, C_100112_r arg18, C_100112_r arg19, int arg20)
	{
		// @000: aload #18
		// @002: sipush -31539 (0x84CD)
		// @005: aload #19
		// @007: iload #16
		// @009: invokestatic game.SteelSentinels.func_105265_a(game.C_100112_r, int, game.C_100112_r, int)void
		// @00C: iload_1
		// @00D: sipush 3241 (0x0CA9)
		// @010: if_icmpeq @014
		// @013: return
		// @014: sipush 1235 (0x04D3)
		// @017: iload #9
		// @019: iload_0
		// @01A: iload #4
		// @01C: iload #11
		// @01E: invokestatic game.C_100300_kc.func_107060_a(int, int, int, int, int)void
		// @021: iload #20
		// @023: iload #8
		// @025: bipush 106 (0x6A)
		// @027: invokestatic game.C_100144_bm.func_102087_a(int, int, byte)void
		// @02A: iload_2
		// @02B: iload #6
		// @02D: bipush 123 (0x7B)
		// @02F: iload #14
		// @031: aload #12
		// @033: aload #7
		// @035: invokestatic game.C_100203_ql.func_105924_a(int, int, byte, int, game.C_100127_tl, game.C_100127_tl)void
		// @038: iload #5
		// @03A: iconst_0
		// @03B: iload_3
		// @03C: aload #15
		// @03E: invokestatic game.C_100191_rg.func_100841_a(int, int, int, game.C_100127_tl)void
		// @041: iload #10
		// @043: bipush -2 (0xFE)
		// @045: iload #13
		// @047: iload #17
		// @049: invokestatic game.C_100332_ii.func_107300_a(int, int, int, int)void
		// @04C: goto @18D
		// @04F: astore #21
		// @051: aload #21
		// @053: new java.lang.StringBuilder
		// @056: dup
		// @057: invokespecial java.lang.StringBuilder.<init>()void
		// @05A: getstatic java.lang.String[] game.C_100001_ge.field_100580_z
		// @05D: bipush 10 (0x0A)
		// @05F: aaload
		// @060: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @063: iload_0
		// @064: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @067: bipush 44 (0x2C)
		// @069: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @06C: iload_1
		// @06D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @070: bipush 44 (0x2C)
		// @072: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @075: iload_2
		// @076: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @079: bipush 44 (0x2C)
		// @07B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @07E: iload_3
		// @07F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @082: bipush 44 (0x2C)
		// @084: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @087: iload #4
		// @089: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @08C: bipush 44 (0x2C)
		// @08E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @091: iload #5
		// @093: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @096: bipush 44 (0x2C)
		// @098: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @09B: iload #6
		// @09D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0A0: bipush 44 (0x2C)
		// @0A2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0A5: aload #7
		// @0A7: ifnull @0B3
		// @0AA: getstatic java.lang.String[] game.C_100001_ge.field_100580_z
		// @0AD: iconst_2
		// @0AE: aaload
		// @0AF: goto @0B8
		// @0B2: athrow
		// @0B3: getstatic java.lang.String[] game.C_100001_ge.field_100580_z
		// @0B6: iconst_0
		// @0B7: aaload
		// @0B8: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0BB: bipush 44 (0x2C)
		// @0BD: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0C0: iload #8
		// @0C2: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0C5: bipush 44 (0x2C)
		// @0C7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0CA: iload #9
		// @0CC: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0CF: bipush 44 (0x2C)
		// @0D1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0D4: iload #10
		// @0D6: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0D9: bipush 44 (0x2C)
		// @0DB: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0DE: iload #11
		// @0E0: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0E3: bipush 44 (0x2C)
		// @0E5: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0E8: aload #12
		// @0EA: ifnull @0F6
		// @0ED: getstatic java.lang.String[] game.C_100001_ge.field_100580_z
		// @0F0: iconst_2
		// @0F1: aaload
		// @0F2: goto @0FB
		// @0F5: athrow
		// @0F6: getstatic java.lang.String[] game.C_100001_ge.field_100580_z
		// @0F9: iconst_0
		// @0FA: aaload
		// @0FB: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0FE: bipush 44 (0x2C)
		// @100: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @103: iload #13
		// @105: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @108: bipush 44 (0x2C)
		// @10A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @10D: iload #14
		// @10F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @112: bipush 44 (0x2C)
		// @114: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @117: aload #15
		// @119: ifnull @125
		// @11C: getstatic java.lang.String[] game.C_100001_ge.field_100580_z
		// @11F: iconst_2
		// @120: aaload
		// @121: goto @12A
		// @124: athrow
		// @125: getstatic java.lang.String[] game.C_100001_ge.field_100580_z
		// @128: iconst_0
		// @129: aaload
		// @12A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @12D: bipush 44 (0x2C)
		// @12F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @132: iload #16
		// @134: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @137: bipush 44 (0x2C)
		// @139: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @13C: iload #17
		// @13E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @141: bipush 44 (0x2C)
		// @143: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @146: aload #18
		// @148: ifnull @154
		// @14B: getstatic java.lang.String[] game.C_100001_ge.field_100580_z
		// @14E: iconst_2
		// @14F: aaload
		// @150: goto @159
		// @153: athrow
		// @154: getstatic java.lang.String[] game.C_100001_ge.field_100580_z
		// @157: iconst_0
		// @158: aaload
		// @159: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @15C: bipush 44 (0x2C)
		// @15E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @161: aload #19
		// @163: ifnull @16F
		// @166: getstatic java.lang.String[] game.C_100001_ge.field_100580_z
		// @169: iconst_2
		// @16A: aaload
		// @16B: goto @174
		// @16E: athrow
		// @16F: getstatic java.lang.String[] game.C_100001_ge.field_100580_z
		// @172: iconst_0
		// @173: aaload
		// @174: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @177: bipush 44 (0x2C)
		// @179: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @17C: iload #20
		// @17E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @181: bipush 41 (0x29)
		// @183: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @186: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @189: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @18C: athrow
		// @18D: return
	}
	
	C_100001_ge(C_100112_r arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9)
	{
		// @00: aload_0
		// @01: invokespecial java.lang.Object.<init>()void
		// @04: aload_0
		// @05: iconst_1
		// @06: putfield int game.C_100001_ge.field_100567_n
		// @09: aload_0
		// @0A: iconst_1
		// @0B: putfield int game.C_100001_ge.field_100576_s
		// @0E: aload_0
		// @0F: iload #5
		// @11: putfield int game.C_100001_ge.field_100561_g
		// @14: aload_0
		// @15: iload #8
		// @17: putfield int game.C_100001_ge.field_100565_c
		// @1A: aload_0
		// @1B: iload #7
		// @1D: putfield int game.C_100001_ge.field_100560_f
		// @20: aload_0
		// @21: iload #6
		// @23: putfield int game.C_100001_ge.field_100572_k
		// @26: aload_0
		// @27: aload_1
		// @28: putfield game.C_100112_r game.C_100001_ge.field_100569_l
		// @2B: aload_0
		// @2C: iload #9
		// @2E: putfield int game.C_100001_ge.field_100568_o
		// @31: aload_0
		// @32: iload_3
		// @33: putfield int game.C_100001_ge.field_100579_p
		// @36: aload_0
		// @37: iload #4
		// @39: putfield int game.C_100001_ge.field_100578_q
		// @3C: aload_0
		// @3D: iload_2
		// @3E: putfield int game.C_100001_ge.field_100575_t
		// @41: aload_0
		// @42: iload #10
		// @44: putfield int game.C_100001_ge.field_100566_a
		// @47: goto @D6
		// @4A: astore #11
		// @4C: aload #11
		// @4E: new java.lang.StringBuilder
		// @51: dup
		// @52: invokespecial java.lang.StringBuilder.<init>()void
		// @55: getstatic java.lang.String[] game.C_100001_ge.field_100580_z
		// @58: iconst_1
		// @59: aaload
		// @5A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @5D: aload_1
		// @5E: ifnull @6A
		// @61: getstatic java.lang.String[] game.C_100001_ge.field_100580_z
		// @64: iconst_2
		// @65: aaload
		// @66: goto @6F
		// @69: athrow
		// @6A: getstatic java.lang.String[] game.C_100001_ge.field_100580_z
		// @6D: iconst_0
		// @6E: aaload
		// @6F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @72: bipush 44 (0x2C)
		// @74: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @77: iload_2
		// @78: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7B: bipush 44 (0x2C)
		// @7D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @80: iload_3
		// @81: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @84: bipush 44 (0x2C)
		// @86: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @89: iload #4
		// @8B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8E: bipush 44 (0x2C)
		// @90: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @93: iload #5
		// @95: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @98: bipush 44 (0x2C)
		// @9A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9D: iload #6
		// @9F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A2: bipush 44 (0x2C)
		// @A4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A7: iload #7
		// @A9: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @AC: bipush 44 (0x2C)
		// @AE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B1: iload #8
		// @B3: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @B6: bipush 44 (0x2C)
		// @B8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @BB: iload #9
		// @BD: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @C0: bipush 44 (0x2C)
		// @C2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C5: iload #10
		// @C7: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @CA: bipush 41 (0x29)
		// @CC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @CF: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @D2: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @D5: athrow
		// @D6: return
	}
	
	static
	{
		// @000: bipush 11 (0x0B)
		// @002: anewarray java.lang.String
		// @005: dup
		// @006: iconst_0
		// @007: ldc "\u00084C)"
		// @009: invokestatic game.C_100001_ge.func_100558_z(java.lang.String)char[]
		// @00C: invokestatic game.C_100001_ge.func_100555_z(char[])java.lang.String
		// @00F: aastore
		// @010: dup
		// @011: iconst_1
		// @012: ldc "\u0001$\u0001y$\u0008([{e"
		// @014: invokestatic game.C_100001_ge.func_100558_z(java.lang.String)char[]
		// @017: invokestatic game.C_100001_ge.func_100555_z(char[])java.lang.String
		// @01A: aastore
		// @01B: dup
		// @01C: iconst_2
		// @01D: ldc "\u001do\u0001k0"
		// @01F: invokestatic game.C_100001_ge.func_100558_z(java.lang.String)char[]
		// @022: invokestatic game.C_100001_ge.func_100555_z(char[])java.lang.String
		// @025: aastore
		// @026: dup
		// @027: iconst_3
		// @028: ldc "\u0001$\u0001\re"
		// @02A: invokestatic game.C_100001_ge.func_100558_z(java.lang.String)char[]
		// @02D: invokestatic game.C_100001_ge.func_100555_z(char[])java.lang.String
		// @030: aastore
		// @031: dup
		// @032: iconst_4
		// @033: ldc "\u0001$\u0001\u0001e"
		// @035: invokestatic game.C_100001_ge.func_100558_z(java.lang.String)char[]
		// @038: invokestatic game.C_100001_ge.func_100555_z(char[])java.lang.String
		// @03B: aastore
		// @03C: dup
		// @03D: iconst_5
		// @03E: ldc "\u0001$\u0001\u0002e"
		// @040: invokestatic game.C_100001_ge.func_100558_z(java.lang.String)char[]
		// @043: invokestatic game.C_100001_ge.func_100555_z(char[])java.lang.String
		// @046: aastore
		// @047: dup
		// @048: bipush 6 (0x06)
		// @04A: ldc "\u0001$\u0001\u0007e"
		// @04C: invokestatic game.C_100001_ge.func_100558_z(java.lang.String)char[]
		// @04F: invokestatic game.C_100001_ge.func_100555_z(char[])java.lang.String
		// @052: aastore
		// @053: dup
		// @054: bipush 7 (0x07)
		// @056: ldc "\u0001$\u0001\u0003e"
		// @058: invokestatic game.C_100001_ge.func_100558_z(java.lang.String)char[]
		// @05B: invokestatic game.C_100001_ge.func_100555_z(char[])java.lang.String
		// @05E: aastore
		// @05F: dup
		// @060: bipush 8 (0x08)
		// @062: ldc "\u0001$\u0001\u0006e"
		// @064: invokestatic game.C_100001_ge.func_100558_z(java.lang.String)char[]
		// @067: invokestatic game.C_100001_ge.func_100555_z(char[])java.lang.String
		// @06A: aastore
		// @06B: dup
		// @06C: bipush 9 (0x09)
		// @06E: ldc "\u0001$\u0001\u0004e"
		// @070: invokestatic game.C_100001_ge.func_100558_z(java.lang.String)char[]
		// @073: invokestatic game.C_100001_ge.func_100555_z(char[])java.lang.String
		// @076: aastore
		// @077: dup
		// @078: bipush 10 (0x0A)
		// @07A: ldc "\u0001$\u0001\u0000e"
		// @07C: invokestatic game.C_100001_ge.func_100558_z(java.lang.String)char[]
		// @07F: invokestatic game.C_100001_ge.func_100555_z(char[])java.lang.String
		// @082: aastore
		// @083: putstatic java.lang.String[] game.C_100001_ge.field_100580_z
		// @086: iconst_0
		// @087: putstatic int game.C_100001_ge.field_100563_e
		// @08A: bipush 11 (0x0B)
		// @08C: newarray int[]
		// @08E: dup
		// @08F: iconst_0
		// @090: iconst_2
		// @091: iastore
		// @092: dup
		// @093: iconst_1
		// @094: iconst_3
		// @095: iastore
		// @096: dup
		// @097: iconst_2
		// @098: iconst_4
		// @099: iastore
		// @09A: dup
		// @09B: iconst_3
		// @09C: iconst_5
		// @09D: iastore
		// @09E: dup
		// @09F: iconst_4
		// @0A0: bipush 6 (0x06)
		// @0A2: iastore
		// @0A3: dup
		// @0A4: iconst_5
		// @0A5: bipush 7 (0x07)
		// @0A7: iastore
		// @0A8: dup
		// @0A9: bipush 6 (0x06)
		// @0AB: bipush 8 (0x08)
		// @0AD: iastore
		// @0AE: dup
		// @0AF: bipush 7 (0x07)
		// @0B1: bipush 9 (0x09)
		// @0B3: iastore
		// @0B4: dup
		// @0B5: bipush 8 (0x08)
		// @0B7: bipush 10 (0x0A)
		// @0B9: iastore
		// @0BA: dup
		// @0BB: bipush 9 (0x09)
		// @0BD: bipush 11 (0x0B)
		// @0BF: iastore
		// @0C0: dup
		// @0C1: bipush 10 (0x0A)
		// @0C3: bipush 12 (0x0C)
		// @0C5: iastore
		// @0C6: putstatic int[] game.C_100001_ge.field_100573_h
		// @0C9: ldc ",4B5w"
		// @0CB: invokestatic game.C_100001_ge.func_100558_z(java.lang.String)char[]
		// @0CE: invokestatic game.C_100001_ge.func_100555_z(char[])java.lang.String
		// @0D1: putstatic java.lang.String game.C_100001_ge.field_100564_b
		// @0D4: lconst_0
		// @0D5: putstatic long game.C_100001_ge.field_100571_j
		// @0D8: bipush 51 (0x33)
		// @0DA: putstatic int game.C_100001_ge.field_100570_m
		// @0DD: bipush 36 (0x24)
		// @0DF: newarray int[]
		// @0E1: dup
		// @0E2: iconst_0
		// @0E3: iconst_1
		// @0E4: iastore
		// @0E5: dup
		// @0E6: iconst_1
		// @0E7: iconst_0
		// @0E8: iastore
		// @0E9: dup
		// @0EA: iconst_2
		// @0EB: iconst_5
		// @0EC: iastore
		// @0ED: dup
		// @0EE: iconst_3
		// @0EF: bipush 6 (0x06)
		// @0F1: iastore
		// @0F2: dup
		// @0F3: iconst_4
		// @0F4: bipush 7 (0x07)
		// @0F6: iastore
		// @0F7: dup
		// @0F8: iconst_5
		// @0F9: bipush 9 (0x09)
		// @0FB: iastore
		// @0FC: dup
		// @0FD: bipush 6 (0x06)
		// @0FF: bipush 11 (0x0B)
		// @101: iastore
		// @102: dup
		// @103: bipush 7 (0x07)
		// @105: bipush 13 (0x0D)
		// @107: iastore
		// @108: dup
		// @109: bipush 8 (0x08)
		// @10B: bipush 14 (0x0E)
		// @10D: iastore
		// @10E: dup
		// @10F: bipush 9 (0x09)
		// @111: bipush 15 (0x0F)
		// @113: iastore
		// @114: dup
		// @115: bipush 10 (0x0A)
		// @117: bipush 10 (0x0A)
		// @119: iastore
		// @11A: dup
		// @11B: bipush 11 (0x0B)
		// @11D: iconst_1
		// @11E: iastore
		// @11F: dup
		// @120: bipush 12 (0x0C)
		// @122: iconst_0
		// @123: iastore
		// @124: dup
		// @125: bipush 13 (0x0D)
		// @127: iconst_2
		// @128: iastore
		// @129: dup
		// @12A: bipush 14 (0x0E)
		// @12C: iconst_4
		// @12D: iastore
		// @12E: dup
		// @12F: bipush 15 (0x0F)
		// @131: iconst_3
		// @132: iastore
		// @133: dup
		// @134: bipush 16 (0x10)
		// @136: bipush 6 (0x06)
		// @138: iastore
		// @139: dup
		// @13A: bipush 17 (0x11)
		// @13C: bipush 7 (0x07)
		// @13E: iastore
		// @13F: dup
		// @140: bipush 18 (0x12)
		// @142: bipush 9 (0x09)
		// @144: iastore
		// @145: dup
		// @146: bipush 19 (0x13)
		// @148: bipush 16 (0x10)
		// @14A: iastore
		// @14B: dup
		// @14C: bipush 20 (0x14)
		// @14E: bipush 17 (0x11)
		// @150: iastore
		// @151: dup
		// @152: bipush 21 (0x15)
		// @154: bipush 10 (0x0A)
		// @156: iastore
		// @157: dup
		// @158: bipush 22 (0x16)
		// @15A: bipush 20 (0x14)
		// @15C: iastore
		// @15D: dup
		// @15E: bipush 23 (0x17)
		// @160: bipush 20 (0x14)
		// @162: iastore
		// @163: dup
		// @164: bipush 24 (0x18)
		// @166: bipush 20 (0x14)
		// @168: iastore
		// @169: dup
		// @16A: bipush 25 (0x19)
		// @16C: bipush 20 (0x14)
		// @16E: iastore
		// @16F: dup
		// @170: bipush 26 (0x1A)
		// @172: iconst_0
		// @173: iastore
		// @174: dup
		// @175: bipush 27 (0x1B)
		// @177: iconst_2
		// @178: iastore
		// @179: dup
		// @17A: bipush 28 (0x1C)
		// @17C: iconst_4
		// @17D: iastore
		// @17E: dup
		// @17F: bipush 29 (0x1D)
		// @181: bipush 6 (0x06)
		// @183: iastore
		// @184: dup
		// @185: bipush 30 (0x1E)
		// @187: bipush 8 (0x08)
		// @189: iastore
		// @18A: dup
		// @18B: bipush 31 (0x1F)
		// @18D: bipush 9 (0x09)
		// @18F: iastore
		// @190: dup
		// @191: bipush 32 (0x20)
		// @193: bipush 19 (0x13)
		// @195: iastore
		// @196: dup
		// @197: bipush 33 (0x21)
		// @199: bipush 18 (0x12)
		// @19B: iastore
		// @19C: dup
		// @19D: bipush 34 (0x22)
		// @19F: bipush 12 (0x0C)
		// @1A1: iastore
		// @1A2: dup
		// @1A3: bipush 35 (0x23)
		// @1A5: bipush 8 (0x08)
		// @1A7: iastore
		// @1A8: putstatic int[] game.C_100001_ge.field_100562_d
		// @1AB: iconst_2
		// @1AC: putstatic int game.C_100001_ge.field_100574_i
		// @1AF: return
	}
	
	private static char[] func_100558_z(String arg0)
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
		// @0E: bipush 77 (0x4D)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_100555_z(char[] arg0)
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
		// @30: bipush 102 (0x66)
		// @32: goto @46
		// @35: bipush 65 (0x41)
		// @37: goto @46
		// @3A: bipush 47 (0x2F)
		// @3C: goto @46
		// @3F: bipush 69 (0x45)
		// @41: goto @46
		// @44: bipush 77 (0x4D)
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
