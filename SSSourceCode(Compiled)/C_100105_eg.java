package game;

final class C_100105_eg
{
	private long field_104734_g;
	private int field_104739_a;
	private C_100325_id field_104735_d;
	private C_100325_id[] field_104736_e;
	static String field_104741_h;
	static String field_104738_c;
	private C_100325_id field_104733_f;
	private int field_104737_b;
	private static final String[] field_104740_z;
	
	final C_100325_id func_104732_a(int arg0)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #4
		// @05: aload_0
		// @06: getfield game.C_100325_id game.C_100105_eg.field_104733_f
		// @09: ifnull @10
		// @0C: goto @12
		// @0F: athrow
		// @10: aconst_null
		// @11: areturn
		// @12: aload_0
		// @13: getfield game.C_100325_id[] game.C_100105_eg.field_104736_e
		// @16: aload_0
		// @17: getfield long game.C_100105_eg.field_104734_g
		// @1A: iload_1
		// @1B: aload_0
		// @1C: getfield int game.C_100105_eg.field_104739_a
		// @1F: iadd
		// @20: i2l
		// @21: land
		// @22: l2i
		// @23: aaload
		// @24: astore_2
		// @25: aload_2
		// @26: aload_0
		// @27: getfield game.C_100325_id game.C_100105_eg.field_104733_f
		// @2A: if_acmpeq @6B
		// @2D: aload_0
		// @2E: iload #4
		// @30: ifne @6C
		// @33: getfield game.C_100325_id game.C_100105_eg.field_104733_f
		// @36: getfield long game.C_100325_id.field_101484_o
		// @39: aload_0
		// @3A: getfield long game.C_100105_eg.field_104734_g
		// @3D: lcmp
		// @3E: ifeq @49
		// @41: goto @45
		// @44: athrow
		// @45: goto @5B
		// @48: athrow
		// @49: aload_0
		// @4A: getfield game.C_100325_id game.C_100105_eg.field_104733_f
		// @4D: astore_3
		// @4E: aload_0
		// @4F: aload_0
		// @50: getfield game.C_100325_id game.C_100105_eg.field_104733_f
		// @53: getfield game.C_100325_id game.C_100325_id.field_101483_n
		// @56: putfield game.C_100325_id game.C_100105_eg.field_104733_f
		// @59: aload_3
		// @5A: areturn
		// @5B: aload_0
		// @5C: aload_0
		// @5D: getfield game.C_100325_id game.C_100105_eg.field_104733_f
		// @60: getfield game.C_100325_id game.C_100325_id.field_101483_n
		// @63: putfield game.C_100325_id game.C_100105_eg.field_104733_f
		// @66: iload #4
		// @68: ifeq @25
		// @6B: aload_0
		// @6C: aconst_null
		// @6D: putfield game.C_100325_id game.C_100105_eg.field_104733_f
		// @70: aconst_null
		// @71: areturn
		// @72: astore_2
		// @73: aload_2
		// @74: new java.lang.StringBuilder
		// @77: dup
		// @78: invokespecial java.lang.StringBuilder.<init>()void
		// @7B: getstatic java.lang.String[] game.C_100105_eg.field_104740_z
		// @7E: iconst_4
		// @7F: aaload
		// @80: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @83: iload_1
		// @84: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @87: bipush 41 (0x29)
		// @89: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @8F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @92: athrow
	}
	
	final void func_104725_a(C_100325_id arg0, int arg1, long arg2)
	{
		// @00: aconst_null
		// @01: aload_1
		// @02: getfield game.C_100325_id game.C_100325_id.field_101486_m
		// @05: if_acmpne @0C
		// @08: goto @12
		// @0B: athrow
		// @0C: aload_1
		// @0D: bipush 8 (0x08)
		// @0F: invokevirtual game.C_100325_id.func_101479_c(byte)void
		// @12: aload_0
		// @13: getfield game.C_100325_id[] game.C_100105_eg.field_104736_e
		// @16: iload_2
		// @17: aload_0
		// @18: getfield int game.C_100105_eg.field_104739_a
		// @1B: iadd
		// @1C: i2l
		// @1D: lload_3
		// @1E: land
		// @1F: l2i
		// @20: aaload
		// @21: astore #5
		// @23: aload_1
		// @24: aload #5
		// @26: putfield game.C_100325_id game.C_100325_id.field_101483_n
		// @29: aload_1
		// @2A: aload #5
		// @2C: getfield game.C_100325_id game.C_100325_id.field_101486_m
		// @2F: putfield game.C_100325_id game.C_100325_id.field_101486_m
		// @32: aload_1
		// @33: getfield game.C_100325_id game.C_100325_id.field_101486_m
		// @36: aload_1
		// @37: putfield game.C_100325_id game.C_100325_id.field_101483_n
		// @3A: aload_1
		// @3B: getfield game.C_100325_id game.C_100325_id.field_101483_n
		// @3E: aload_1
		// @3F: putfield game.C_100325_id game.C_100325_id.field_101486_m
		// @42: aload_1
		// @43: lload_3
		// @44: putfield long game.C_100325_id.field_101484_o
		// @47: goto @90
		// @4A: astore #5
		// @4C: aload #5
		// @4E: new java.lang.StringBuilder
		// @51: dup
		// @52: invokespecial java.lang.StringBuilder.<init>()void
		// @55: getstatic java.lang.String[] game.C_100105_eg.field_104740_z
		// @58: iconst_1
		// @59: aaload
		// @5A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @5D: aload_1
		// @5E: ifnull @6A
		// @61: getstatic java.lang.String[] game.C_100105_eg.field_104740_z
		// @64: iconst_0
		// @65: aaload
		// @66: goto @6F
		// @69: athrow
		// @6A: getstatic java.lang.String[] game.C_100105_eg.field_104740_z
		// @6D: iconst_2
		// @6E: aaload
		// @6F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @72: bipush 44 (0x2C)
		// @74: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @77: iload_2
		// @78: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7B: bipush 44 (0x2C)
		// @7D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @80: lload_3
		// @81: invokevirtual java.lang.StringBuilder.append(long)java.lang.StringBuilder
		// @84: bipush 41 (0x29)
		// @86: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @89: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @8C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @8F: athrow
		// @90: return
	}
	
	final C_100325_id func_104730_b(int arg0)
	{
		// @00: aload_0
		// @01: iload_1
		// @02: putfield int game.C_100105_eg.field_104737_b
		// @05: aload_0
		// @06: bipush 8 (0x08)
		// @08: invokevirtual game.C_100105_eg.func_104729_a(byte)game.C_100325_id
		// @0B: areturn
		// @0C: astore_2
		// @0D: aload_2
		// @0E: new java.lang.StringBuilder
		// @11: dup
		// @12: invokespecial java.lang.StringBuilder.<init>()void
		// @15: getstatic java.lang.String[] game.C_100105_eg.field_104740_z
		// @18: bipush 9 (0x09)
		// @1A: aaload
		// @1B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1E: iload_1
		// @1F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @22: bipush 41 (0x29)
		// @24: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @27: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @2A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @2D: athrow
	}
	
	public static void func_104731_b(byte arg0)
	{
		// @00: iload_0
		// @01: bipush -45 (0xD3)
		// @03: if_icmplt @0F
		// @06: bipush 71 (0x47)
		// @08: invokestatic game.C_100105_eg.func_104731_b(byte)void
		// @0B: goto @0F
		// @0E: athrow
		// @0F: aconst_null
		// @10: putstatic java.lang.String game.C_100105_eg.field_104741_h
		// @13: aconst_null
		// @14: putstatic java.lang.String game.C_100105_eg.field_104738_c
		// @17: goto @3C
		// @1A: astore_1
		// @1B: aload_1
		// @1C: new java.lang.StringBuilder
		// @1F: dup
		// @20: invokespecial java.lang.StringBuilder.<init>()void
		// @23: getstatic java.lang.String[] game.C_100105_eg.field_104740_z
		// @26: bipush 7 (0x07)
		// @28: aaload
		// @29: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2C: iload_0
		// @2D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @30: bipush 41 (0x29)
		// @32: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @35: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @38: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3B: athrow
		// @3C: return
	}
	
	static final void func_104726_a(boolean arg0, byte arg1)
	{
		// @00: iload_1
		// @01: bipush 41 (0x29)
		// @03: if_icmpge @11
		// @06: aconst_null
		// @07: checkcast java.lang.String
		// @0A: putstatic java.lang.String game.C_100105_eg.field_104738_c
		// @0D: goto @11
		// @10: athrow
		// @11: getstatic int game.C_100015_wh.field_103782_d
		// @14: iconst_m1
		// @15: ixor
		// @16: iconst_m1
		// @17: if_icmpge @3F
		// @1A: getstatic boolean game.C_100188_rj.field_105735_f
		// @1D: ifne @28
		// @20: goto @24
		// @23: athrow
		// @24: goto @3F
		// @27: athrow
		// @28: iconst_0
		// @29: iconst_0
		// @2A: getstatic int game.C_100196_rb.field_105819_e
		// @2D: getstatic game.C_100302_ka game.C_100265_mh.field_106621_l
		// @30: getfield int game.C_100302_ka.field_101835_xb
		// @33: invokestatic game.C_100196_rb.func_105809_f(int, int, int, int)void
		// @36: getstatic game.C_100302_ka game.C_100053_vn.field_102842_Y
		// @39: bipush -127 (0x81)
		// @3B: iload_0
		// @3C: invokevirtual game.C_100302_ka.func_101809_a(byte, boolean)void
		// @3F: getstatic int game.C_100102_w.field_104635_b
		// @42: iconst_m1
		// @43: ixor
		// @44: iconst_m1
		// @45: if_icmplt @57
		// @48: iconst_0
		// @49: getstatic int game.C_100100_i.field_102014_hc
		// @4C: if_icmplt @57
		// @4F: goto @53
		// @52: athrow
		// @53: goto @78
		// @56: athrow
		// @57: getstatic boolean game.C_100003_ga.field_103535_w
		// @5A: ifeq @78
		// @5D: iconst_0
		// @5E: iconst_0
		// @5F: getstatic int game.C_100196_rb.field_105819_e
		// @62: getstatic game.C_100302_ka game.C_100265_mh.field_106621_l
		// @65: getfield int game.C_100302_ka.field_101835_xb
		// @68: invokestatic game.C_100196_rb.func_105809_f(int, int, int, int)void
		// @6B: getstatic game.C_100302_ka game.C_100159_sn.field_105402_b
		// @6E: bipush -128 (0x80)
		// @70: iload_0
		// @71: invokevirtual game.C_100302_ka.func_101809_a(byte, boolean)void
		// @74: goto @78
		// @77: athrow
		// @78: goto @A5
		// @7B: astore_2
		// @7C: aload_2
		// @7D: new java.lang.StringBuilder
		// @80: dup
		// @81: invokespecial java.lang.StringBuilder.<init>()void
		// @84: getstatic java.lang.String[] game.C_100105_eg.field_104740_z
		// @87: iconst_5
		// @88: aaload
		// @89: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @8C: iload_0
		// @8D: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @90: bipush 44 (0x2C)
		// @92: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @95: iload_1
		// @96: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @99: bipush 41 (0x29)
		// @9B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @A1: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @A4: athrow
		// @A5: return
	}
	
	final C_100325_id func_104729_a(byte arg0)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore_3
		// @04: aload_0
		// @05: getfield int game.C_100105_eg.field_104737_b
		// @08: iconst_m1
		// @09: ixor
		// @0A: iconst_m1
		// @0B: if_icmpge @33
		// @0E: aload_0
		// @0F: getfield game.C_100325_id game.C_100105_eg.field_104735_d
		// @12: aload_0
		// @13: getfield game.C_100325_id[] game.C_100105_eg.field_104736_e
		// @16: aload_0
		// @17: getfield int game.C_100105_eg.field_104737_b
		// @1A: iconst_m1
		// @1B: iadd
		// @1C: aaload
		// @1D: if_acmpeq @33
		// @20: goto @24
		// @23: athrow
		// @24: aload_0
		// @25: getfield game.C_100325_id game.C_100105_eg.field_104735_d
		// @28: astore_2
		// @29: aload_0
		// @2A: aload_2
		// @2B: getfield game.C_100325_id game.C_100325_id.field_101483_n
		// @2E: putfield game.C_100325_id game.C_100105_eg.field_104735_d
		// @31: aload_2
		// @32: areturn
		// @33: aload_0
		// @34: getfield int game.C_100105_eg.field_104737_b
		// @37: iconst_m1
		// @38: ixor
		// @39: aload_0
		// @3A: getfield int game.C_100105_eg.field_104739_a
		// @3D: iconst_m1
		// @3E: ixor
		// @3F: if_icmple @7B
		// @42: aload_0
		// @43: getfield game.C_100325_id[] game.C_100105_eg.field_104736_e
		// @46: aload_0
		// @47: dup
		// @48: getfield int game.C_100105_eg.field_104737_b
		// @4B: dup_x1
		// @4C: iconst_1
		// @4D: iadd
		// @4E: putfield int game.C_100105_eg.field_104737_b
		// @51: aaload
		// @52: getfield game.C_100325_id game.C_100325_id.field_101483_n
		// @55: astore_2
		// @56: iload_3
		// @57: ifne @8B
		// @5A: aload_0
		// @5B: getfield game.C_100325_id[] game.C_100105_eg.field_104736_e
		// @5E: iconst_m1
		// @5F: aload_0
		// @60: getfield int game.C_100105_eg.field_104737_b
		// @63: iadd
		// @64: aaload
		// @65: aload_2
		// @66: if_acmpeq @77
		// @69: goto @6D
		// @6C: athrow
		// @6D: aload_0
		// @6E: aload_2
		// @6F: getfield game.C_100325_id game.C_100325_id.field_101483_n
		// @72: putfield game.C_100325_id game.C_100105_eg.field_104735_d
		// @75: aload_2
		// @76: areturn
		// @77: iload_3
		// @78: ifeq @33
		// @7B: iload_1
		// @7C: bipush 8 (0x08)
		// @7E: if_icmpeq @8B
		// @81: iconst_0
		// @82: bipush 113 (0x71)
		// @84: invokestatic game.C_100105_eg.func_104726_a(boolean, byte)void
		// @87: goto @8B
		// @8A: athrow
		// @8B: aconst_null
		// @8C: areturn
		// @8D: astore_2
		// @8E: aload_2
		// @8F: new java.lang.StringBuilder
		// @92: dup
		// @93: invokespecial java.lang.StringBuilder.<init>()void
		// @96: getstatic java.lang.String[] game.C_100105_eg.field_104740_z
		// @99: iconst_3
		// @9A: aaload
		// @9B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @9E: iload_1
		// @9F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A2: bipush 41 (0x29)
		// @A4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A7: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @AA: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @AD: athrow
	}
	
	final C_100325_id func_104724_a(int arg0, long arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #6
		// @05: aload_0
		// @06: lload_2
		// @07: putfield long game.C_100105_eg.field_104734_g
		// @0A: aload_0
		// @0B: getfield game.C_100325_id[] game.C_100105_eg.field_104736_e
		// @0E: iconst_m1
		// @0F: aload_0
		// @10: getfield int game.C_100105_eg.field_104739_a
		// @13: iadd
		// @14: i2l
		// @15: lload_2
		// @16: land
		// @17: l2i
		// @18: aaload
		// @19: astore #4
		// @1B: aload_0
		// @1C: aload #4
		// @1E: getfield game.C_100325_id game.C_100325_id.field_101483_n
		// @21: putfield game.C_100325_id game.C_100105_eg.field_104733_f
		// @24: aload #4
		// @26: aload_0
		// @27: getfield game.C_100325_id game.C_100105_eg.field_104733_f
		// @2A: if_acmpeq @66
		// @2D: lload_2
		// @2E: aload_0
		// @2F: getfield game.C_100325_id game.C_100105_eg.field_104733_f
		// @32: getfield long game.C_100325_id.field_101484_o
		// @35: lcmp
		// @36: iload #6
		// @38: ifne @67
		// @3B: ifne @56
		// @3E: goto @42
		// @41: athrow
		// @42: aload_0
		// @43: getfield game.C_100325_id game.C_100105_eg.field_104733_f
		// @46: astore #5
		// @48: aload_0
		// @49: aload_0
		// @4A: getfield game.C_100325_id game.C_100105_eg.field_104733_f
		// @4D: getfield game.C_100325_id game.C_100325_id.field_101483_n
		// @50: putfield game.C_100325_id game.C_100105_eg.field_104733_f
		// @53: aload #5
		// @55: areturn
		// @56: aload_0
		// @57: aload_0
		// @58: getfield game.C_100325_id game.C_100105_eg.field_104733_f
		// @5B: getfield game.C_100325_id game.C_100325_id.field_101483_n
		// @5E: putfield game.C_100325_id game.C_100105_eg.field_104733_f
		// @61: iload #6
		// @63: ifeq @24
		// @66: iload_1
		// @67: sipush -16397 (0xBFF3)
		// @6A: if_icmpeq @72
		// @6D: aconst_null
		// @6E: checkcast game.C_100325_id
		// @71: areturn
		// @72: aload_0
		// @73: aconst_null
		// @74: putfield game.C_100325_id game.C_100105_eg.field_104733_f
		// @77: aconst_null
		// @78: areturn
		// @79: astore #4
		// @7B: aload #4
		// @7D: new java.lang.StringBuilder
		// @80: dup
		// @81: invokespecial java.lang.StringBuilder.<init>()void
		// @84: getstatic java.lang.String[] game.C_100105_eg.field_104740_z
		// @87: bipush 8 (0x08)
		// @89: aaload
		// @8A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @8D: iload_1
		// @8E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @91: bipush 44 (0x2C)
		// @93: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @96: lload_2
		// @97: invokevirtual java.lang.StringBuilder.append(long)java.lang.StringBuilder
		// @9A: bipush 41 (0x29)
		// @9C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @A2: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @A5: athrow
	}
	
	C_100105_eg(int arg0)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #4
		// @05: aload_0
		// @06: invokespecial java.lang.Object.<init>()void
		// @09: aload_0
		// @0A: iconst_0
		// @0B: putfield int game.C_100105_eg.field_104737_b
		// @0E: aload_0
		// @0F: iload_1
		// @10: anewarray game.C_100325_id
		// @13: putfield game.C_100325_id[] game.C_100105_eg.field_104736_e
		// @16: aload_0
		// @17: iload_1
		// @18: putfield int game.C_100105_eg.field_104739_a
		// @1B: iconst_0
		// @1C: istore_2
		// @1D: iload_1
		// @1E: iconst_m1
		// @1F: ixor
		// @20: iload_2
		// @21: iconst_m1
		// @22: ixor
		// @23: if_icmpge @50
		// @26: aload_0
		// @27: getfield game.C_100325_id[] game.C_100105_eg.field_104736_e
		// @2A: iload_2
		// @2B: new game.C_100325_id
		// @2E: dup
		// @2F: invokespecial game.C_100325_id.<init>()void
		// @32: dup_x2
		// @33: aastore
		// @34: astore_3
		// @35: aload_3
		// @36: aload_3
		// @37: putfield game.C_100325_id game.C_100325_id.field_101486_m
		// @3A: aload_3
		// @3B: aload_3
		// @3C: putfield game.C_100325_id game.C_100325_id.field_101483_n
		// @3F: iinc #2 +1
		// @42: iload #4
		// @44: ifne @75
		// @47: iload #4
		// @49: ifeq @1D
		// @4C: goto @50
		// @4F: athrow
		// @50: goto @75
		// @53: astore_2
		// @54: aload_2
		// @55: new java.lang.StringBuilder
		// @58: dup
		// @59: invokespecial java.lang.StringBuilder.<init>()void
		// @5C: getstatic java.lang.String[] game.C_100105_eg.field_104740_z
		// @5F: bipush 6 (0x06)
		// @61: aaload
		// @62: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @65: iload_1
		// @66: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @69: bipush 41 (0x29)
		// @6B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @71: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @74: athrow
		// @75: return
	}
	
	static
	{
		// @00: bipush 10 (0x0A)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "jI/n\u0014"
		// @09: invokestatic game.C_100105_eg.func_104728_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100105_eg.func_104727_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "t\u0000/\u0005A"
		// @14: invokestatic game.C_100105_eg.func_104728_z(java.lang.String)char[]
		// @17: invokestatic game.C_100105_eg.func_104727_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "\u007f\u0012m,"
		// @1F: invokestatic game.C_100105_eg.func_104728_z(java.lang.String)char[]
		// @22: invokestatic game.C_100105_eg.func_104727_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "t\u0000/\u0001A"
		// @2A: invokestatic game.C_100105_eg.func_104728_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100105_eg.func_104727_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "t\u0000/\u0006A"
		// @35: invokestatic game.C_100105_eg.func_104728_z(java.lang.String)char[]
		// @38: invokestatic game.C_100105_eg.func_104727_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "t\u0000/\u0002A"
		// @40: invokestatic game.C_100105_eg.func_104728_z(java.lang.String)char[]
		// @43: invokestatic game.C_100105_eg.func_104727_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "t\u0000/|\u0000\u007f\u000eu~A"
		// @4C: invokestatic game.C_100105_eg.func_104728_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100105_eg.func_104727_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "t\u0000/\u0007A"
		// @58: invokestatic game.C_100105_eg.func_104728_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100105_eg.func_104727_z(char[])java.lang.String
		// @5E: aastore
		// @5F: dup
		// @60: bipush 8 (0x08)
		// @62: ldc "t\u0000/\u0003A"
		// @64: invokestatic game.C_100105_eg.func_104728_z(java.lang.String)char[]
		// @67: invokestatic game.C_100105_eg.func_104727_z(char[])java.lang.String
		// @6A: aastore
		// @6B: dup
		// @6C: bipush 9 (0x09)
		// @6E: ldc "t\u0000/\u0004A"
		// @70: invokestatic game.C_100105_eg.func_104728_z(java.lang.String)char[]
		// @73: invokestatic game.C_100105_eg.func_104727_z(char[])java.lang.String
		// @76: aastore
		// @77: putstatic java.lang.String[] game.C_100105_eg.field_104740_z
		// @7A: ldc "R\u0006o#\u000c}Gs%\u0004p\u0013b("
		// @7C: invokestatic game.C_100105_eg.func_104728_z(java.lang.String)char[]
		// @7F: invokestatic game.C_100105_eg.func_104727_z(char[])java.lang.String
		// @82: putstatic java.lang.String game.C_100105_eg.field_104741_h
		// @85: ldc "]\u0008f`\u0000\u007fGn2Ir\u0015d!\u001dtG``\u000fc\u0002d`\u0008r\u0004n5\u0007eGu/Ib\u0006w%Ih\u0008t2Ia\u0015n'\u001bt\u0014rn"
		// @87: invokestatic game.C_100105_eg.func_104728_z(java.lang.String)char[]
		// @8A: invokestatic game.C_100105_eg.func_104727_z(char[])java.lang.String
		// @8D: putstatic java.lang.String game.C_100105_eg.field_104738_c
		// @90: return
	}
	
	private static char[] func_104728_z(String arg0)
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
		// @0E: bipush 105 (0x69)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_104727_z(char[] arg0)
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
		// @10: tableswitch def: @43, for 0: @30, for 1: @35, for 2: @3A, for 3: @3E
		// @30: bipush 17 (0x11)
		// @32: goto @45
		// @35: bipush 103 (0x67)
		// @37: goto @45
		// @3A: iconst_1
		// @3B: goto @45
		// @3E: bipush 64 (0x40)
		// @40: goto @45
		// @43: bipush 105 (0x69)
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
