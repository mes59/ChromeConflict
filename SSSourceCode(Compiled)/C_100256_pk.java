package game;

class C_100256_pk implements C_100326_ic, C_100184_rn
{
	int field_100476_t;
	static C_100233_oa field_100478_r;
	int field_100463_e;
	int field_100464_b;
	int field_100469_l;
	static C_100302_ka field_100475_u;
	int field_100473_h;
	int field_100480_p;
	int field_100468_o;
	int field_100465_c;
	C_100112_r field_100460_f;
	int field_100472_k;
	int field_100474_i;
	private boolean field_100470_m;
	static C_100133_tk field_100466_a;
	static String field_100477_s;
	static String field_100471_j;
	private int field_100462_d;
	static String field_100461_g;
	static String field_100479_q;
	static String field_100467_n;
	private static final String[] field_100481_z;
	
	public final int func_100442_a(int arg0, C_100336_im arg1)
	{
		// @00: iload_1
		// @01: iconst_3
		// @02: if_icmpeq @11
		// @05: aload_0
		// @06: aconst_null
		// @07: checkcast game.C_100112_r
		// @0A: putfield game.C_100112_r game.C_100256_pk.field_100460_f
		// @0D: goto @11
		// @10: athrow
		// @11: aload_0
		// @12: iload_1
		// @13: bipush 119 (0x77)
		// @15: ixor
		// @16: aload_2
		// @17: invokevirtual game.C_100256_pk.func_100434_b(int, game.C_100336_im)game.C_100205_qf
		// @1A: pop
		// @1B: aload_2
		// @1C: getfield game.C_100205_qf game.C_100336_im.field_102535_n
		// @1F: iconst_0
		// @20: invokevirtual game.C_100205_qf.func_103674_b(int)int
		// @23: aload_0
		// @24: getfield int game.C_100256_pk.field_100464_b
		// @27: ineg
		// @28: aload_0
		// @29: getfield int game.C_100256_pk.field_100474_i
		// @2C: ineg
		// @2D: iadd
		// @2E: isub
		// @2F: ireturn
		// @30: astore_3
		// @31: aload_3
		// @32: new java.lang.StringBuilder
		// @35: dup
		// @36: invokespecial java.lang.StringBuilder.<init>()void
		// @39: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @3C: bipush 24 (0x18)
		// @3E: aaload
		// @3F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @42: iload_1
		// @43: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @46: bipush 44 (0x2C)
		// @48: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4B: aload_2
		// @4C: ifnull @58
		// @4F: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @52: iconst_2
		// @53: aaload
		// @54: goto @5D
		// @57: athrow
		// @58: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @5B: iconst_1
		// @5C: aaload
		// @5D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @60: bipush 41 (0x29)
		// @62: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @65: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @68: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @6B: athrow
	}
	
	public final C_100205_qf func_100434_b(int arg0, C_100336_im arg1)
	{
		// @00: iload_1
		// @01: bipush 76 (0x4C)
		// @03: if_icmpgt @0B
		// @06: aconst_null
		// @07: checkcast game.C_100205_qf
		// @0A: areturn
		// @0B: aload_2
		// @0C: getfield game.C_100205_qf game.C_100336_im.field_102535_n
		// @0F: ifnull @16
		// @12: goto @21
		// @15: athrow
		// @16: aload_2
		// @17: new game.C_100010_ff
		// @1A: dup
		// @1B: invokespecial game.C_100010_ff.<init>()void
		// @1E: putfield game.C_100205_qf game.C_100336_im.field_102535_n
		// @21: aload_0
		// @22: getfield boolean game.C_100256_pk.field_100470_m
		// @25: ifne @39
		// @28: aload_0
		// @29: aload_2
		// @2A: ldc 965636417 (0x398e7141)
		// @2C: invokespecial game.C_100256_pk.func_100452_b(game.C_100336_im, int)void
		// @2F: getstatic int game.SteelSentinels.field_105275_O
		// @32: ifeq @6D
		// @35: goto @39
		// @38: athrow
		// @39: aload_2
		// @3A: getfield game.C_100205_qf game.C_100336_im.field_102535_n
		// @3D: checkcast game.C_100010_ff
		// @40: aload_0
		// @41: getfield int game.C_100256_pk.field_100480_p
		// @44: aload_0
		// @45: getfield int game.C_100256_pk.field_100463_e
		// @48: aload_0
		// @49: aload_2
		// @4A: bipush 79 (0x4F)
		// @4C: invokevirtual game.C_100256_pk.func_100435_a(game.C_100336_im, byte)int
		// @4F: aload_0
		// @50: aload_2
		// @51: iconst_0
		// @52: invokevirtual game.C_100256_pk.func_100450_a(game.C_100336_im, boolean)java.lang.String
		// @55: aload_0
		// @56: getfield int game.C_100256_pk.field_100468_o
		// @59: bipush -4 (0xFC)
		// @5B: aload_0
		// @5C: getfield game.C_100112_r game.C_100256_pk.field_100460_f
		// @5F: aload_0
		// @60: aload_2
		// @61: bipush 121 (0x79)
		// @63: invokespecial game.C_100256_pk.func_100459_b(game.C_100336_im, byte)int
		// @66: invokevirtual game.C_100010_ff.func_103691_a(int, int, int, java.lang.String, int, byte, game.C_100112_r, int)void
		// @69: goto @6D
		// @6C: athrow
		// @6D: aload_2
		// @6E: getfield game.C_100205_qf game.C_100336_im.field_102535_n
		// @71: areturn
		// @72: astore_3
		// @73: aload_3
		// @74: new java.lang.StringBuilder
		// @77: dup
		// @78: invokespecial java.lang.StringBuilder.<init>()void
		// @7B: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @7E: bipush 20 (0x14)
		// @80: aaload
		// @81: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @84: iload_1
		// @85: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @88: bipush 44 (0x2C)
		// @8A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8D: aload_2
		// @8E: ifnull @9A
		// @91: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @94: iconst_2
		// @95: aaload
		// @96: goto @9F
		// @99: athrow
		// @9A: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @9D: iconst_1
		// @9E: aaload
		// @9F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @A2: bipush 41 (0x29)
		// @A4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A7: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @AA: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @AD: athrow
	}
	
	private final int func_100459_b(C_100336_im arg0, byte arg1)
	{
		// @00: bipush -73 (0xB7)
		// @02: iload_2
		// @03: bipush 34 (0x22)
		// @05: isub
		// @06: bipush 61 (0x3D)
		// @08: idiv
		// @09: irem
		// @0A: istore_3
		// @0B: aload_0
		// @0C: getfield int game.C_100256_pk.field_100464_b
		// @0F: ineg
		// @10: aload_1
		// @11: getfield int game.C_100336_im.field_102544_t
		// @14: iadd
		// @15: aload_0
		// @16: getfield int game.C_100256_pk.field_100474_i
		// @19: isub
		// @1A: ireturn
		// @1B: astore_3
		// @1C: aload_3
		// @1D: new java.lang.StringBuilder
		// @20: dup
		// @21: invokespecial java.lang.StringBuilder.<init>()void
		// @24: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @27: iconst_4
		// @28: aaload
		// @29: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2C: aload_1
		// @2D: ifnull @39
		// @30: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @33: iconst_2
		// @34: aaload
		// @35: goto @3E
		// @38: athrow
		// @39: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @3C: iconst_1
		// @3D: aaload
		// @3E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @41: bipush 44 (0x2C)
		// @43: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @46: iload_2
		// @47: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4A: bipush 41 (0x29)
		// @4C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @52: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @55: athrow
	}
	
	public void func_100362_a(boolean arg0, int arg1, int arg2, int arg3, C_100336_im arg4)
	{
		// @00: aconst_null
		// @01: aload_0
		// @02: getfield game.C_100112_r game.C_100256_pk.field_100460_f
		// @05: if_acmpne @09
		// @08: return
		// @09: iload_2
		// @0A: sipush -26568 (0x9838)
		// @0D: if_icmpeq @19
		// @10: iconst_2
		// @11: invokestatic game.C_100256_pk.func_100451_a(int)boolean
		// @14: pop
		// @15: goto @19
		// @18: athrow
		// @19: aload_0
		// @1A: iload #4
		// @1C: iload_3
		// @1D: bipush -3 (0xFD)
		// @1F: aload #5
		// @21: invokespecial game.C_100256_pk.func_100446_a(int, int, int, game.C_100336_im)void
		// @24: goto @82
		// @27: astore #6
		// @29: aload #6
		// @2B: new java.lang.StringBuilder
		// @2E: dup
		// @2F: invokespecial java.lang.StringBuilder.<init>()void
		// @32: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @35: bipush 6 (0x06)
		// @37: aaload
		// @38: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3B: iload_1
		// @3C: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @3F: bipush 44 (0x2C)
		// @41: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @44: iload_2
		// @45: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @48: bipush 44 (0x2C)
		// @4A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4D: iload_3
		// @4E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @51: bipush 44 (0x2C)
		// @53: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @56: iload #4
		// @58: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5B: bipush 44 (0x2C)
		// @5D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @60: aload #5
		// @62: ifnull @6E
		// @65: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @68: iconst_2
		// @69: aaload
		// @6A: goto @73
		// @6D: athrow
		// @6E: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @71: iconst_1
		// @72: aaload
		// @73: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @76: bipush 41 (0x29)
		// @78: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @7E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @81: athrow
		// @82: return
	}
	
	public static void func_100445_b(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic game.C_100233_oa game.C_100256_pk.field_100478_r
		// @04: aconst_null
		// @05: putstatic java.lang.String game.C_100256_pk.field_100467_n
		// @08: aconst_null
		// @09: putstatic java.lang.String game.C_100256_pk.field_100479_q
		// @0C: aconst_null
		// @0D: putstatic java.lang.String game.C_100256_pk.field_100471_j
		// @10: iload_0
		// @11: bipush 9 (0x09)
		// @13: if_icmpgt @27
		// @16: ldc2_w 106
		// @19: aconst_null
		// @1A: checkcast java.lang.String
		// @1D: bipush -69 (0xBB)
		// @1F: invokestatic game.C_100256_pk.func_100444_a(long, java.lang.String, byte)boolean
		// @22: pop
		// @23: goto @27
		// @26: athrow
		// @27: aconst_null
		// @28: putstatic java.lang.String game.C_100256_pk.field_100461_g
		// @2B: aconst_null
		// @2C: putstatic java.lang.String game.C_100256_pk.field_100477_s
		// @2F: aconst_null
		// @30: putstatic game.C_100133_tk game.C_100256_pk.field_100466_a
		// @33: aconst_null
		// @34: putstatic game.C_100302_ka game.C_100256_pk.field_100475_u
		// @37: goto @5C
		// @3A: astore_1
		// @3B: aload_1
		// @3C: new java.lang.StringBuilder
		// @3F: dup
		// @40: invokespecial java.lang.StringBuilder.<init>()void
		// @43: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @46: bipush 23 (0x17)
		// @48: aaload
		// @49: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4C: iload_0
		// @4D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @50: bipush 41 (0x29)
		// @52: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @55: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @58: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @5B: athrow
		// @5C: return
	}
	
	final void func_100454_a(C_100256_pk arg0, int arg1)
	{
		// @00: aload_1
		// @01: aload_0
		// @02: getfield int game.C_100256_pk.field_100472_k
		// @05: putfield int game.C_100256_pk.field_100472_k
		// @08: aload_1
		// @09: aload_0
		// @0A: getfield int game.C_100256_pk.field_100476_t
		// @0D: putfield int game.C_100256_pk.field_100476_t
		// @10: iload_2
		// @11: bipush -62 (0xC2)
		// @13: if_icmpeq @2F
		// @16: aload_0
		// @17: bipush -31 (0xE1)
		// @19: bipush 92 (0x5C)
		// @1B: bipush 19 (0x13)
		// @1D: bipush -24 (0xE8)
		// @1F: iconst_1
		// @20: bipush -28 (0xE4)
		// @22: bipush 108 (0x6C)
		// @24: aconst_null
		// @25: checkcast game.C_100336_im
		// @28: invokespecial game.C_100256_pk.func_100455_a(int, int, int, int, boolean, int, int, game.C_100336_im)void
		// @2B: goto @2F
		// @2E: athrow
		// @2F: aload_1
		// @30: aload_0
		// @31: getfield game.C_100112_r game.C_100256_pk.field_100460_f
		// @34: putfield game.C_100112_r game.C_100256_pk.field_100460_f
		// @37: aload_1
		// @38: aload_0
		// @39: getfield int game.C_100256_pk.field_100465_c
		// @3C: putfield int game.C_100256_pk.field_100465_c
		// @3F: aload_1
		// @40: aload_0
		// @41: getfield int game.C_100256_pk.field_100468_o
		// @44: putfield int game.C_100256_pk.field_100468_o
		// @47: aload_1
		// @48: aload_0
		// @49: getfield int game.C_100256_pk.field_100463_e
		// @4C: putfield int game.C_100256_pk.field_100463_e
		// @4F: aload_1
		// @50: aload_0
		// @51: getfield int game.C_100256_pk.field_100464_b
		// @54: putfield int game.C_100256_pk.field_100464_b
		// @57: aload_1
		// @58: aload_0
		// @59: getfield boolean game.C_100256_pk.field_100470_m
		// @5C: putfield boolean game.C_100256_pk.field_100470_m
		// @5F: aload_1
		// @60: aload_0
		// @61: getfield int game.C_100256_pk.field_100469_l
		// @64: putfield int game.C_100256_pk.field_100469_l
		// @67: aload_1
		// @68: aload_0
		// @69: getfield int game.C_100256_pk.field_100473_h
		// @6C: putfield int game.C_100256_pk.field_100473_h
		// @6F: aload_1
		// @70: aload_0
		// @71: getfield int game.C_100256_pk.field_100474_i
		// @74: putfield int game.C_100256_pk.field_100474_i
		// @77: aload_1
		// @78: aload_0
		// @79: getfield int game.C_100256_pk.field_100462_d
		// @7C: putfield int game.C_100256_pk.field_100462_d
		// @7F: aload_1
		// @80: aload_0
		// @81: getfield int game.C_100256_pk.field_100480_p
		// @84: putfield int game.C_100256_pk.field_100480_p
		// @87: goto @C6
		// @8A: astore_3
		// @8B: aload_3
		// @8C: new java.lang.StringBuilder
		// @8F: dup
		// @90: invokespecial java.lang.StringBuilder.<init>()void
		// @93: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @96: bipush 7 (0x07)
		// @98: aaload
		// @99: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @9C: aload_1
		// @9D: ifnull @A9
		// @A0: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @A3: iconst_2
		// @A4: aaload
		// @A5: goto @AE
		// @A8: athrow
		// @A9: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @AC: iconst_1
		// @AD: aaload
		// @AE: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @B1: bipush 44 (0x2C)
		// @B3: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B6: iload_2
		// @B7: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @BA: bipush 41 (0x29)
		// @BC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @BF: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @C2: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @C5: athrow
		// @C6: return
	}
	
	public final int func_100440_a(C_100336_im arg0, int arg1, boolean arg2)
	{
		// @00: iload_3
		// @01: ifeq @07
		// @04: bipush -41 (0xD7)
		// @06: ireturn
		// @07: aload_0
		// @08: iconst_0
		// @09: aload_1
		// @0A: ldc 965636417 (0x398e7141)
		// @0C: iload_2
		// @0D: invokespecial game.C_100256_pk.func_100457_a(int, game.C_100336_im, int, int)int
		// @10: ireturn
		// @11: astore #4
		// @13: aload #4
		// @15: new java.lang.StringBuilder
		// @18: dup
		// @19: invokespecial java.lang.StringBuilder.<init>()void
		// @1C: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @1F: bipush 10 (0x0A)
		// @21: aaload
		// @22: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @25: aload_1
		// @26: ifnull @32
		// @29: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @2C: iconst_2
		// @2D: aaload
		// @2E: goto @37
		// @31: athrow
		// @32: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @35: iconst_1
		// @36: aaload
		// @37: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3A: bipush 44 (0x2C)
		// @3C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3F: iload_2
		// @40: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @43: bipush 44 (0x2C)
		// @45: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @48: iload_3
		// @49: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @4C: bipush 41 (0x29)
		// @4E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @51: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @54: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @57: athrow
	}
	
	private final int func_100458_a(int arg0, C_100336_im arg1, boolean arg2, int arg3)
	{
		// @00: iload_3
		// @01: ifeq @1B
		// @04: aload_0
		// @05: bipush 60 (0x3C)
		// @07: bipush 90 (0x5A)
		// @09: bipush -121 (0x87)
		// @0B: aconst_null
		// @0C: checkcast game.C_100336_im
		// @0F: bipush 115 (0x73)
		// @11: bipush -52 (0xCC)
		// @13: invokevirtual game.C_100256_pk.func_100443_a(int, int, int, game.C_100336_im, int, int)int
		// @16: pop
		// @17: goto @1B
		// @1A: athrow
		// @1B: iload_1
		// @1C: aload_2
		// @1D: getfield int game.C_100336_im.field_102550_y
		// @20: aload_0
		// @21: getfield int game.C_100256_pk.field_100464_b
		// @24: iadd
		// @25: aload_2
		// @26: getfield int game.C_100336_im.field_102541_w
		// @29: iadd
		// @2A: iload #4
		// @2C: iadd
		// @2D: iadd
		// @2E: ireturn
		// @2F: astore #5
		// @31: aload #5
		// @33: new java.lang.StringBuilder
		// @36: dup
		// @37: invokespecial java.lang.StringBuilder.<init>()void
		// @3A: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @3D: bipush 12 (0x0C)
		// @3F: aaload
		// @40: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @43: iload_1
		// @44: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @47: bipush 44 (0x2C)
		// @49: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4C: aload_2
		// @4D: ifnull @59
		// @50: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @53: iconst_2
		// @54: aaload
		// @55: goto @5E
		// @58: athrow
		// @59: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @5C: iconst_1
		// @5D: aaload
		// @5E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @61: bipush 44 (0x2C)
		// @63: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @66: iload_3
		// @67: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @6A: bipush 44 (0x2C)
		// @6C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6F: iload #4
		// @71: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @74: bipush 41 (0x29)
		// @76: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @79: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @7C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @7F: athrow
	}
	
	public final int func_100437_a(boolean arg0)
	{
		// @00: iload_1
		// @01: iconst_1
		// @02: if_icmpeq @0F
		// @05: aload_0
		// @06: bipush -76 (0xB4)
		// @08: putfield int game.C_100256_pk.field_100465_c
		// @0B: goto @0F
		// @0E: athrow
		// @0F: aload_0
		// @10: getfield game.C_100112_r game.C_100256_pk.field_100460_f
		// @13: getfield int game.C_100112_r.field_101772_Q
		// @16: aload_0
		// @17: getfield game.C_100112_r game.C_100256_pk.field_100460_f
		// @1A: getfield int game.C_100112_r.field_101763_H
		// @1D: iadd
		// @1E: ireturn
		// @1F: astore_2
		// @20: aload_2
		// @21: new java.lang.StringBuilder
		// @24: dup
		// @25: invokespecial java.lang.StringBuilder.<init>()void
		// @28: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @2B: bipush 17 (0x11)
		// @2D: aaload
		// @2E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @31: iload_1
		// @32: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @35: bipush 41 (0x29)
		// @37: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @40: athrow
	}
	
	static final byte[] func_100453_a(String arg0, int arg1)
	{
		// @00: iload_1
		// @01: bipush -45 (0xD3)
		// @03: if_icmple @11
		// @06: aconst_null
		// @07: checkcast java.lang.String
		// @0A: putstatic java.lang.String game.C_100256_pk.field_100479_q
		// @0D: goto @11
		// @10: athrow
		// @11: getstatic game.C_100098_h game.C_100343_jf.field_104823_n
		// @14: aload_0
		// @15: ldc ""
		// @17: bipush 115 (0x73)
		// @19: invokevirtual game.C_100098_h.func_104608_a(java.lang.String, java.lang.String, int)byte[]
		// @1C: areturn
		// @1D: astore_2
		// @1E: aload_2
		// @1F: new java.lang.StringBuilder
		// @22: dup
		// @23: invokespecial java.lang.StringBuilder.<init>()void
		// @26: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @29: bipush 25 (0x19)
		// @2B: aaload
		// @2C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2F: aload_0
		// @30: ifnull @3C
		// @33: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @36: iconst_2
		// @37: aaload
		// @38: goto @41
		// @3B: athrow
		// @3C: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @3F: iconst_1
		// @40: aaload
		// @41: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @44: bipush 44 (0x2C)
		// @46: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @49: iload_1
		// @4A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4D: bipush 41 (0x29)
		// @4F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @52: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @55: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @58: athrow
	}
	
	static final boolean func_100444_a(long arg0, String arg1, byte arg2)
	{
		// @00: bipush 54 (0x36)
		// @02: iload_3
		// @03: bipush 25 (0x19)
		// @05: isub
		// @06: bipush 43 (0x2B)
		// @08: idiv
		// @09: irem
		// @0A: istore #5
		// @0C: aload_2
		// @0D: bipush -115 (0x8D)
		// @0F: invokestatic game.C_100278_nd.func_101197_b(java.lang.String, int)game.C_100061_dh
		// @12: astore #4
		// @14: aload #4
		// @16: ifnull @28
		// @19: aconst_null
		// @1A: aload #4
		// @1C: getfield java.lang.String game.C_100061_dh.field_101996_kc
		// @1F: if_acmpeq @28
		// @22: goto @26
		// @25: athrow
		// @26: iconst_1
		// @27: ireturn
		// @28: aconst_null
		// @29: getstatic game.C_100211_qd game.C_100068_vc.field_104342_d
		// @2C: if_acmpeq @41
		// @2F: bipush 16 (0x10)
		// @31: lload_0
		// @32: invokestatic game.C_100194_rd.func_103068_a(int, long)game.C_100054_ec
		// @35: ifnull @41
		// @38: goto @3C
		// @3B: athrow
		// @3C: iconst_1
		// @3D: goto @42
		// @40: athrow
		// @41: iconst_0
		// @42: ireturn
		// @43: astore #4
		// @45: aload #4
		// @47: new java.lang.StringBuilder
		// @4A: dup
		// @4B: invokespecial java.lang.StringBuilder.<init>()void
		// @4E: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @51: bipush 11 (0x0B)
		// @53: aaload
		// @54: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @57: lload_0
		// @58: invokevirtual java.lang.StringBuilder.append(long)java.lang.StringBuilder
		// @5B: bipush 44 (0x2C)
		// @5D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @60: aload_2
		// @61: ifnull @6D
		// @64: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @67: iconst_2
		// @68: aaload
		// @69: goto @72
		// @6C: athrow
		// @6D: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @70: iconst_1
		// @71: aaload
		// @72: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @75: bipush 44 (0x2C)
		// @77: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7A: iload_3
		// @7B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7E: bipush 41 (0x29)
		// @80: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @83: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @86: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @89: athrow
	}
	
	String func_100450_a(C_100336_im arg0, boolean arg1)
	{
		// @00: iload_2
		// @01: ifeq @1B
		// @04: aload_0
		// @05: bipush -112 (0x90)
		// @07: bipush 127 (0x7F)
		// @09: bipush 44 (0x2C)
		// @0B: aconst_null
		// @0C: checkcast game.C_100336_im
		// @0F: bipush -14 (0xF2)
		// @11: bipush -82 (0xAE)
		// @13: invokevirtual game.C_100256_pk.func_100443_a(int, int, int, game.C_100336_im, int, int)int
		// @16: pop
		// @17: goto @1B
		// @1A: athrow
		// @1B: aload_1
		// @1C: getfield java.lang.String game.C_100336_im.field_102534_C
		// @1F: areturn
		// @20: astore_3
		// @21: aload_3
		// @22: new java.lang.StringBuilder
		// @25: dup
		// @26: invokespecial java.lang.StringBuilder.<init>()void
		// @29: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @2C: bipush 19 (0x13)
		// @2E: aaload
		// @2F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @32: aload_1
		// @33: ifnull @3F
		// @36: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @39: iconst_2
		// @3A: aaload
		// @3B: goto @44
		// @3E: athrow
		// @3F: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @42: iconst_1
		// @43: aaload
		// @44: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @47: bipush 44 (0x2C)
		// @49: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4C: iload_2
		// @4D: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @50: bipush 41 (0x29)
		// @52: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @55: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @58: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @5B: athrow
	}
	
	C_100256_pk(C_100112_r arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7)
	{
		// @00: aload_0
		// @01: aload_1
		// @02: iload_2
		// @03: iload_2
		// @04: iload_3
		// @05: iload_3
		// @06: iload #4
		// @08: iload #5
		// @0A: iload #6
		// @0C: iload #7
		// @0E: iload #8
		// @10: iconst_m1
		// @11: ldc 2147483647 (0x7fffffff)
		// @13: iconst_0
		// @14: invokespecial game.C_100256_pk.<init>(game.C_100112_r, int, int, int, int, int, int, int, int, int, int, int, boolean)void
		// @17: return
	}
	
	private final void func_100446_a(int arg0, int arg1, int arg2, C_100336_im arg3)
	{
		// @00: iload_3
		// @01: bipush -3 (0xFD)
		// @03: if_icmpeq @07
		// @06: return
		// @07: aload_0
		// @08: iload_1
		// @09: iconst_0
		// @0A: aload_0
		// @0B: getfield int game.C_100256_pk.field_100462_d
		// @0E: iconst_0
		// @0F: iconst_1
		// @10: aload_0
		// @11: getfield int game.C_100256_pk.field_100473_h
		// @14: iload_2
		// @15: aload #4
		// @17: invokespecial game.C_100256_pk.func_100455_a(int, int, int, int, boolean, int, int, game.C_100336_im)void
		// @1A: goto @6D
		// @1D: astore #5
		// @1F: aload #5
		// @21: new java.lang.StringBuilder
		// @24: dup
		// @25: invokespecial java.lang.StringBuilder.<init>()void
		// @28: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @2B: iconst_5
		// @2C: aaload
		// @2D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @30: iload_1
		// @31: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @34: bipush 44 (0x2C)
		// @36: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @39: iload_2
		// @3A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3D: bipush 44 (0x2C)
		// @3F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @42: iload_3
		// @43: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @46: bipush 44 (0x2C)
		// @48: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4B: aload #4
		// @4D: ifnull @59
		// @50: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @53: iconst_2
		// @54: aaload
		// @55: goto @5E
		// @58: athrow
		// @59: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @5C: iconst_1
		// @5D: aaload
		// @5E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @61: bipush 41 (0x29)
		// @63: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @66: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @69: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @6C: athrow
		// @6D: return
	}
	
	private final void func_100452_b(C_100336_im arg0, int arg1)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #7
		// @005: aconst_null
		// @006: aload_1
		// @007: getfield game.C_100205_qf game.C_100336_im.field_102535_n
		// @00A: if_acmpne @01C
		// @00D: aload_1
		// @00E: new game.C_100010_ff
		// @011: dup
		// @012: invokespecial game.C_100010_ff.<init>()void
		// @015: putfield game.C_100205_qf game.C_100336_im.field_102535_n
		// @018: goto @01C
		// @01B: athrow
		// @01C: iload_2
		// @01D: ldc 965636417 (0x398e7141)
		// @01F: if_icmpeq @023
		// @022: return
		// @023: aload_0
		// @024: aload_1
		// @025: bipush 79 (0x4F)
		// @027: invokevirtual game.C_100256_pk.func_100435_a(game.C_100336_im, byte)int
		// @02A: istore_3
		// @02B: aload_0
		// @02C: aload_1
		// @02D: bipush 120 (0x78)
		// @02F: invokespecial game.C_100256_pk.func_100459_b(game.C_100336_im, byte)int
		// @032: istore #4
		// @034: aload_0
		// @035: getfield int game.C_100256_pk.field_100480_p
		// @038: istore #6
		// @03A: iconst_m1
		// @03B: iload #6
		// @03D: iconst_m1
		// @03E: ixor
		// @03F: if_icmpne @04B
		// @042: iload #7
		// @044: ifeq @079
		// @047: goto @04B
		// @04A: athrow
		// @04B: iconst_2
		// @04C: iload #6
		// @04E: if_icmpne @05E
		// @051: goto @055
		// @054: athrow
		// @055: iload #7
		// @057: ifeq @087
		// @05A: goto @05E
		// @05D: athrow
		// @05E: iconst_3
		// @05F: iload #6
		// @061: if_icmpeq @099
		// @064: goto @068
		// @067: athrow
		// @068: iload #6
		// @06A: iconst_m1
		// @06B: ixor
		// @06C: bipush -2 (0xFE)
		// @06E: if_icmpeq @099
		// @071: goto @075
		// @074: athrow
		// @075: goto @099
		// @078: athrow
		// @079: aload_0
		// @07A: getfield game.C_100112_r game.C_100256_pk.field_100460_f
		// @07D: getfield int game.C_100112_r.field_101772_Q
		// @080: istore #5
		// @082: iload #7
		// @084: ifeq @0BA
		// @087: iload #4
		// @089: aload_0
		// @08A: getfield game.C_100112_r game.C_100256_pk.field_100460_f
		// @08D: getfield int game.C_100112_r.field_101763_H
		// @090: ineg
		// @091: iadd
		// @092: istore #5
		// @094: iload #7
		// @096: ifeq @0BA
		// @099: aload_0
		// @09A: getfield game.C_100112_r game.C_100256_pk.field_100460_f
		// @09D: getfield int game.C_100112_r.field_101763_H
		// @0A0: ineg
		// @0A1: iload #4
		// @0A3: iadd
		// @0A4: aload_0
		// @0A5: getfield game.C_100112_r game.C_100256_pk.field_100460_f
		// @0A8: getfield int game.C_100112_r.field_101772_Q
		// @0AB: ineg
		// @0AC: iadd
		// @0AD: ldc 452876801 (0x1afe5a01)
		// @0AF: ishr
		// @0B0: aload_0
		// @0B1: getfield game.C_100112_r game.C_100256_pk.field_100460_f
		// @0B4: getfield int game.C_100112_r.field_101772_Q
		// @0B7: iadd
		// @0B8: istore #5
		// @0BA: aload_0
		// @0BB: getfield int game.C_100256_pk.field_100468_o
		// @0BE: istore #6
		// @0C0: iconst_m1
		// @0C1: iload #6
		// @0C3: iconst_m1
		// @0C4: ixor
		// @0C5: if_icmpeq @107
		// @0C8: bipush -4 (0xFC)
		// @0CA: iload #6
		// @0CC: iconst_m1
		// @0CD: ixor
		// @0CE: if_icmpne @0DE
		// @0D1: goto @0D5
		// @0D4: athrow
		// @0D5: iload #7
		// @0D7: ifeq @107
		// @0DA: goto @0DE
		// @0DD: athrow
		// @0DE: iconst_1
		// @0DF: iload #6
		// @0E1: if_icmpne @0F1
		// @0E4: goto @0E8
		// @0E7: athrow
		// @0E8: iload #7
		// @0EA: ifeq @137
		// @0ED: goto @0F1
		// @0F0: athrow
		// @0F1: iload #6
		// @0F3: iconst_m1
		// @0F4: ixor
		// @0F5: bipush -3 (0xFD)
		// @0F7: if_icmpne @195
		// @0FA: goto @0FE
		// @0FD: athrow
		// @0FE: iload #7
		// @100: ifeq @16A
		// @103: goto @107
		// @106: athrow
		// @107: aload_1
		// @108: getfield game.C_100205_qf game.C_100336_im.field_102535_n
		// @10B: instanceof game.C_100010_ff
		// @10E: ifeq @195
		// @111: goto @115
		// @114: athrow
		// @115: aload_1
		// @116: getfield game.C_100205_qf game.C_100336_im.field_102535_n
		// @119: checkcast game.C_100010_ff
		// @11C: iload #5
		// @11E: iconst_0
		// @11F: bipush 23 (0x17)
		// @121: aload_0
		// @122: aload_1
		// @123: iconst_0
		// @124: invokevirtual game.C_100256_pk.func_100450_a(game.C_100336_im, boolean)java.lang.String
		// @127: aload_0
		// @128: getfield game.C_100112_r game.C_100256_pk.field_100460_f
		// @12B: invokevirtual game.C_100010_ff.func_103688_a(int, int, byte, java.lang.String, game.C_100112_r)void
		// @12E: iload #7
		// @130: ifeq @195
		// @133: goto @137
		// @136: athrow
		// @137: aload_1
		// @138: getfield game.C_100205_qf game.C_100336_im.field_102535_n
		// @13B: instanceof game.C_100010_ff
		// @13E: ifeq @195
		// @141: goto @145
		// @144: athrow
		// @145: aload_1
		// @146: getfield game.C_100205_qf game.C_100336_im.field_102535_n
		// @149: checkcast game.C_100010_ff
		// @14C: bipush 118 (0x76)
		// @14E: iload #5
		// @150: aload_0
		// @151: aload_1
		// @152: iconst_0
		// @153: invokevirtual game.C_100256_pk.func_100450_a(game.C_100336_im, boolean)java.lang.String
		// @156: iload_3
		// @157: ldc 965636417 (0x398e7141)
		// @159: ishr
		// @15A: aload_0
		// @15B: getfield game.C_100112_r game.C_100256_pk.field_100460_f
		// @15E: invokevirtual game.C_100010_ff.func_103685_a(byte, int, java.lang.String, int, game.C_100112_r)void
		// @161: iload #7
		// @163: ifeq @195
		// @166: goto @16A
		// @169: athrow
		// @16A: aload_1
		// @16B: getfield game.C_100205_qf game.C_100336_im.field_102535_n
		// @16E: instanceof game.C_100010_ff
		// @171: ifeq @195
		// @174: goto @178
		// @177: athrow
		// @178: aload_1
		// @179: getfield game.C_100205_qf game.C_100336_im.field_102535_n
		// @17C: checkcast game.C_100010_ff
		// @17F: iload_3
		// @180: bipush -109 (0x93)
		// @182: aload_0
		// @183: aload_1
		// @184: iconst_0
		// @185: invokevirtual game.C_100256_pk.func_100450_a(game.C_100336_im, boolean)java.lang.String
		// @188: iload #5
		// @18A: aload_0
		// @18B: getfield game.C_100112_r game.C_100256_pk.field_100460_f
		// @18E: invokevirtual game.C_100010_ff.func_103684_a(int, byte, java.lang.String, int, game.C_100112_r)void
		// @191: goto @195
		// @194: athrow
		// @195: goto @1D4
		// @198: astore_3
		// @199: aload_3
		// @19A: new java.lang.StringBuilder
		// @19D: dup
		// @19E: invokespecial java.lang.StringBuilder.<init>()void
		// @1A1: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @1A4: bipush 14 (0x0E)
		// @1A6: aaload
		// @1A7: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1AA: aload_1
		// @1AB: ifnull @1B7
		// @1AE: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @1B1: iconst_2
		// @1B2: aaload
		// @1B3: goto @1BC
		// @1B6: athrow
		// @1B7: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @1BA: iconst_1
		// @1BB: aaload
		// @1BC: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1BF: bipush 44 (0x2C)
		// @1C1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1C4: iload_2
		// @1C5: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1C8: bipush 41 (0x29)
		// @1CA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1CD: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @1D0: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @1D3: athrow
		// @1D4: return
	}
	
	static final int func_100448_a(byte arg0, int[] arg1, C_100327_ib arg2, int arg3)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #6
		// @05: iconst_0
		// @06: anewarray game.C_100049_vf
		// @09: astore #4
		// @0B: aload_2
		// @0C: iconst_m1
		// @0D: bipush -117 (0x8B)
		// @0F: aload #4
		// @11: invokevirtual game.C_100327_ib.func_102462_a(int, int, game.C_100049_vf[])game.C_100049_vf[]
		// @14: astore #4
		// @16: iload_0
		// @17: bipush 28 (0x1C)
		// @19: if_icmpge @27
		// @1C: aconst_null
		// @1D: checkcast java.lang.String
		// @20: putstatic java.lang.String game.C_100256_pk.field_100467_n
		// @23: goto @27
		// @26: athrow
		// @27: iconst_0
		// @28: istore #5
		// @2A: aload #4
		// @2C: arraylength
		// @2D: iconst_m1
		// @2E: ixor
		// @2F: iload #5
		// @31: iconst_m1
		// @32: ixor
		// @33: if_icmpge @6E
		// @36: aload #4
		// @38: iload #5
		// @3A: aaload
		// @3B: ifnull @66
		// @3E: iconst_m1
		// @3F: aload #4
		// @41: iload #5
		// @43: aaload
		// @44: getfield int game.C_100049_vf.field_104203_a
		// @47: if_icmpne @52
		// @4A: goto @4E
		// @4D: athrow
		// @4E: goto @66
		// @51: athrow
		// @52: aload_1
		// @53: iload_3
		// @54: iinc #3 +1
		// @57: aload #4
		// @59: iload #5
		// @5B: aaload
		// @5C: getfield int game.C_100049_vf.field_104203_a
		// @5F: sipush 1008 (0x03F0)
		// @62: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @65: iastore
		// @66: iinc #5 +1
		// @69: iload #6
		// @6B: ifeq @2A
		// @6E: iload_3
		// @6F: ireturn
		// @70: astore #4
		// @72: aload #4
		// @74: new java.lang.StringBuilder
		// @77: dup
		// @78: invokespecial java.lang.StringBuilder.<init>()void
		// @7B: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @7E: bipush 26 (0x1A)
		// @80: aaload
		// @81: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @84: iload_0
		// @85: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @88: bipush 44 (0x2C)
		// @8A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8D: aload_1
		// @8E: ifnull @9A
		// @91: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @94: iconst_2
		// @95: aaload
		// @96: goto @9F
		// @99: athrow
		// @9A: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @9D: iconst_1
		// @9E: aaload
		// @9F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @A2: bipush 44 (0x2C)
		// @A4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A7: aload_2
		// @A8: ifnull @B4
		// @AB: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @AE: iconst_2
		// @AF: aaload
		// @B0: goto @B9
		// @B3: athrow
		// @B4: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @B7: iconst_1
		// @B8: aaload
		// @B9: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @BC: bipush 44 (0x2C)
		// @BE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C1: iload_3
		// @C2: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @C5: bipush 41 (0x29)
		// @C7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @CA: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @CD: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @D0: athrow
	}
	
	private final int func_100457_a(int arg0, C_100336_im arg1, int arg2, int arg3)
	{
		// @00: iload_3
		// @01: ldc 965636417 (0x398e7141)
		// @03: if_icmpeq @15
		// @06: aload_0
		// @07: bipush -118 (0x8A)
		// @09: aconst_null
		// @0A: checkcast game.C_100336_im
		// @0D: invokevirtual game.C_100256_pk.func_100442_a(int, game.C_100336_im)int
		// @10: pop
		// @11: goto @15
		// @14: athrow
		// @15: aload_2
		// @16: getfield int game.C_100336_im.field_102551_x
		// @19: aload_0
		// @1A: getfield int game.C_100256_pk.field_100465_c
		// @1D: iadd
		// @1E: iload #4
		// @20: aload_2
		// @21: getfield int game.C_100336_im.field_102538_m
		// @24: iadd
		// @25: iload_1
		// @26: iadd
		// @27: iadd
		// @28: ireturn
		// @29: astore #5
		// @2B: aload #5
		// @2D: new java.lang.StringBuilder
		// @30: dup
		// @31: invokespecial java.lang.StringBuilder.<init>()void
		// @34: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @37: bipush 22 (0x16)
		// @39: aaload
		// @3A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3D: iload_1
		// @3E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @41: bipush 44 (0x2C)
		// @43: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @46: aload_2
		// @47: ifnull @53
		// @4A: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @4D: iconst_2
		// @4E: aaload
		// @4F: goto @58
		// @52: athrow
		// @53: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @56: iconst_1
		// @57: aaload
		// @58: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @5B: bipush 44 (0x2C)
		// @5D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @60: iload_3
		// @61: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @64: bipush 44 (0x2C)
		// @66: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @69: iload #4
		// @6B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6E: bipush 41 (0x29)
		// @70: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @73: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @76: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @79: athrow
	}
	
	public final int func_100436_a(boolean arg0, int arg1, C_100336_im arg2)
	{
		// @00: iload_1
		// @01: ifeq @07
		// @04: bipush -62 (0xC2)
		// @06: ireturn
		// @07: aload_0
		// @08: iconst_0
		// @09: aload_3
		// @0A: iconst_0
		// @0B: iload_2
		// @0C: invokespecial game.C_100256_pk.func_100458_a(int, game.C_100336_im, boolean, int)int
		// @0F: ireturn
		// @10: astore #4
		// @12: aload #4
		// @14: new java.lang.StringBuilder
		// @17: dup
		// @18: invokespecial java.lang.StringBuilder.<init>()void
		// @1B: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @1E: bipush 9 (0x09)
		// @20: aaload
		// @21: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @24: iload_1
		// @25: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @28: bipush 44 (0x2C)
		// @2A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2D: iload_2
		// @2E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @31: bipush 44 (0x2C)
		// @33: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @36: aload_3
		// @37: ifnull @43
		// @3A: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @3D: iconst_2
		// @3E: aaload
		// @3F: goto @48
		// @42: athrow
		// @43: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @46: iconst_1
		// @47: aaload
		// @48: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4B: bipush 41 (0x29)
		// @4D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @50: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @53: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @56: athrow
	}
	
	static int func_100449_a(int arg0, int arg1)
	{
		// @00: iload_0
		// @01: iload_1
		// @02: iand
		// @03: ireturn
		// @04: astore_2
		// @05: aload_2
		// @06: new java.lang.StringBuilder
		// @09: dup
		// @0A: invokespecial java.lang.StringBuilder.<init>()void
		// @0D: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @10: bipush 8 (0x08)
		// @12: aaload
		// @13: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @16: iload_0
		// @17: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1A: bipush 44 (0x2C)
		// @1C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1F: iload_1
		// @20: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @23: bipush 41 (0x29)
		// @25: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @28: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @2B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @2E: athrow
	}
	
	public final void func_100439_a(int arg0, boolean arg1, C_100336_im arg2, int arg3, int arg4)
	{
		// @000: aload_3
		// @001: bipush 81 (0x51)
		// @003: invokevirtual game.C_100336_im.func_102515_d(byte)boolean
		// @006: ifeq @0E0
		// @009: aload_0
		// @00A: bipush 86 (0x56)
		// @00C: aload_3
		// @00D: invokevirtual game.C_100256_pk.func_100434_b(int, game.C_100336_im)game.C_100205_qf
		// @010: astore #6
		// @012: aload #6
		// @014: iconst_1
		// @015: iload #4
		// @017: invokevirtual game.C_100205_qf.func_103673_a(int, int)int
		// @01A: istore #7
		// @01C: aload #6
		// @01E: getfield game.C_100306_kn[] game.C_100205_qf.field_103677_g
		// @021: iload #7
		// @023: aaload
		// @024: astore #8
		// @026: aload #6
		// @028: iload #4
		// @02A: ldc 6316128 (0x606060)
		// @02C: invokevirtual game.C_100205_qf.func_103665_b(int, int)int
		// @02F: istore #9
		// @031: aload_0
		// @032: iload #9
		// @034: aload_3
		// @035: ldc 965636417 (0x398e7141)
		// @037: iload #5
		// @039: invokespecial game.C_100256_pk.func_100457_a(int, game.C_100336_im, int, int)int
		// @03C: istore #10
		// @03E: aload_0
		// @03F: iconst_0
		// @040: iload_1
		// @041: aload_3
		// @042: invokevirtual game.C_100256_pk.func_100436_a(boolean, int, game.C_100336_im)int
		// @045: iconst_0
		// @046: aload #8
		// @048: getfield int game.C_100306_kn.field_107129_f
		// @04B: invokestatic java.lang.Math.max(int, int)int
		// @04E: iadd
		// @04F: istore #11
		// @051: aload_0
		// @052: iload_2
		// @053: ifne @05B
		// @056: iconst_1
		// @057: goto @05C
		// @05A: athrow
		// @05B: iconst_0
		// @05C: iload_1
		// @05D: aload_3
		// @05E: invokevirtual game.C_100256_pk.func_100436_a(boolean, int, game.C_100336_im)int
		// @061: aload_0
		// @062: aload_3
		// @063: bipush -74 (0xB6)
		// @065: invokespecial game.C_100256_pk.func_100459_b(game.C_100336_im, byte)int
		// @068: aload #8
		// @06A: getfield int game.C_100306_kn.field_107135_a
		// @06D: iconst_1
		// @06E: iload #7
		// @070: iadd
		// @071: iconst_m1
		// @072: ixor
		// @073: aload #6
		// @075: getfield game.C_100306_kn[] game.C_100205_qf.field_103677_g
		// @078: arraylength
		// @079: iconst_m1
		// @07A: ixor
		// @07B: if_icmple @08F
		// @07E: aload #6
		// @080: getfield game.C_100306_kn[] game.C_100205_qf.field_103677_g
		// @083: iconst_1
		// @084: iload #7
		// @086: iadd
		// @087: aaload
		// @088: getfield int game.C_100306_kn.field_107129_f
		// @08B: goto @094
		// @08E: athrow
		// @08F: aload #8
		// @091: getfield int game.C_100306_kn.field_107135_a
		// @094: invokestatic java.lang.Math.min(int, int)int
		// @097: invokestatic java.lang.Math.min(int, int)int
		// @09A: iadd
		// @09B: istore #12
		// @09D: bipush -124 (0x84)
		// @09F: aload_3
		// @0A0: getfield int game.C_100336_im.field_102544_t
		// @0A3: iload_1
		// @0A4: iadd
		// @0A5: aload_3
		// @0A6: getfield int game.C_100336_im.field_102541_w
		// @0A9: ineg
		// @0AA: isub
		// @0AB: iload_1
		// @0AC: aload_3
		// @0AD: getfield int game.C_100336_im.field_102541_w
		// @0B0: iadd
		// @0B1: aload_3
		// @0B2: getfield int game.C_100336_im.field_102537_l
		// @0B5: aload_3
		// @0B6: getfield int game.C_100336_im.field_102538_m
		// @0B9: iadd
		// @0BA: iload #5
		// @0BC: iadd
		// @0BD: aload_3
		// @0BE: getfield int game.C_100336_im.field_102538_m
		// @0C1: iload #5
		// @0C3: iadd
		// @0C4: invokestatic game.C_100209_qb.func_102687_b(int, int, int, int, int)void
		// @0C7: getstatic game.C_100233_oa game.C_100043_vl.field_101945_cc
		// @0CA: bipush 112 (0x70)
		// @0CC: iload #10
		// @0CE: aload_0
		// @0CF: getfield int game.C_100256_pk.field_100469_l
		// @0D2: iload #10
		// @0D4: iload #11
		// @0D6: iload #12
		// @0D8: invokevirtual game.C_100233_oa.func_106231_a(int, int, int, int, int, int)void
		// @0DB: bipush -77 (0xB3)
		// @0DD: invokestatic game.C_100200_ba.func_105842_a(byte)void
		// @0E0: iload_2
		// @0E1: iconst_1
		// @0E2: if_icmpeq @0F8
		// @0E5: aload_0
		// @0E6: iconst_1
		// @0E7: bipush 82 (0x52)
		// @0E9: bipush -123 (0x85)
		// @0EB: bipush 112 (0x70)
		// @0ED: aconst_null
		// @0EE: checkcast game.C_100336_im
		// @0F1: invokevirtual game.C_100256_pk.func_100362_a(boolean, int, int, int, game.C_100336_im)void
		// @0F4: goto @0F8
		// @0F7: athrow
		// @0F8: goto @156
		// @0FB: astore #6
		// @0FD: aload #6
		// @0FF: new java.lang.StringBuilder
		// @102: dup
		// @103: invokespecial java.lang.StringBuilder.<init>()void
		// @106: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @109: bipush 13 (0x0D)
		// @10B: aaload
		// @10C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @10F: iload_1
		// @110: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @113: bipush 44 (0x2C)
		// @115: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @118: iload_2
		// @119: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @11C: bipush 44 (0x2C)
		// @11E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @121: aload_3
		// @122: ifnull @12E
		// @125: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @128: iconst_2
		// @129: aaload
		// @12A: goto @133
		// @12D: athrow
		// @12E: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @131: iconst_1
		// @132: aaload
		// @133: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @136: bipush 44 (0x2C)
		// @138: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @13B: iload #4
		// @13D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @140: bipush 44 (0x2C)
		// @142: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @145: iload #5
		// @147: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @14A: bipush 41 (0x29)
		// @14C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @14F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @152: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @155: athrow
		// @156: return
	}
	
	public final int func_100435_a(C_100336_im arg0, byte arg1)
	{
		// @00: iload_2
		// @01: bipush 79 (0x4F)
		// @03: if_icmpeq @12
		// @06: aload_0
		// @07: aconst_null
		// @08: checkcast game.C_100112_r
		// @0B: putfield game.C_100112_r game.C_100256_pk.field_100460_f
		// @0E: goto @12
		// @11: athrow
		// @12: aload_0
		// @13: getfield int game.C_100256_pk.field_100472_k
		// @16: ineg
		// @17: aload_0
		// @18: getfield int game.C_100256_pk.field_100465_c
		// @1B: ineg
		// @1C: aload_1
		// @1D: getfield int game.C_100336_im.field_102537_l
		// @20: iadd
		// @21: iadd
		// @22: ireturn
		// @23: astore_3
		// @24: aload_3
		// @25: new java.lang.StringBuilder
		// @28: dup
		// @29: invokespecial java.lang.StringBuilder.<init>()void
		// @2C: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @2F: bipush 27 (0x1B)
		// @31: aaload
		// @32: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @35: aload_1
		// @36: ifnull @42
		// @39: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @3C: iconst_2
		// @3D: aaload
		// @3E: goto @47
		// @41: athrow
		// @42: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @45: iconst_1
		// @46: aaload
		// @47: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4A: bipush 44 (0x2C)
		// @4C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4F: iload_2
		// @50: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @53: bipush 41 (0x29)
		// @55: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @58: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @5B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @5E: athrow
	}
	
	static final boolean func_100451_a(int arg0)
	{
		// @00: iload_0
		// @01: sipush -10684 (0xD644)
		// @04: if_icmpeq @1B
		// @07: bipush -105 (0x97)
		// @09: aconst_null
		// @0A: checkcast int[]
		// @0D: aconst_null
		// @0E: checkcast game.C_100327_ib
		// @11: bipush 27 (0x1B)
		// @13: invokestatic game.C_100256_pk.func_100448_a(byte, int[], game.C_100327_ib, int)int
		// @16: pop
		// @17: goto @1B
		// @1A: athrow
		// @1B: getstatic boolean game.C_100164_se.field_105449_g
		// @1E: ifne @26
		// @21: iconst_1
		// @22: goto @27
		// @25: athrow
		// @26: iconst_0
		// @27: ireturn
		// @28: astore_1
		// @29: aload_1
		// @2A: new java.lang.StringBuilder
		// @2D: dup
		// @2E: invokespecial java.lang.StringBuilder.<init>()void
		// @31: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @34: bipush 15 (0x0F)
		// @36: aaload
		// @37: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3A: iload_0
		// @3B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3E: bipush 41 (0x29)
		// @40: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @43: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @46: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @49: athrow
	}
	
	public final void func_100441_a(int arg0, int arg1, int arg2, int arg3, int arg4, C_100336_im arg5)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #16
		// @005: iload #4
		// @007: iload_2
		// @008: if_icmpeq @00E
		// @00B: goto @00F
		// @00E: return
		// @00F: aload #6
		// @011: bipush 22 (0x16)
		// @013: invokevirtual game.C_100336_im.func_102515_d(byte)boolean
		// @016: ifne @01D
		// @019: goto @14A
		// @01C: athrow
		// @01D: aload_0
		// @01E: bipush 102 (0x66)
		// @020: aload #6
		// @022: invokevirtual game.C_100256_pk.func_100434_b(int, game.C_100336_im)game.C_100205_qf
		// @025: astore #7
		// @027: iload_2
		// @028: iconst_m1
		// @029: ixor
		// @02A: iload #4
		// @02C: iconst_m1
		// @02D: ixor
		// @02E: if_icmple @03D
		// @031: iload_2
		// @032: istore #8
		// @034: iload #4
		// @036: istore #9
		// @038: iload #16
		// @03A: ifeq @044
		// @03D: iload_2
		// @03E: istore #9
		// @040: iload #4
		// @042: istore #8
		// @044: aload #7
		// @046: iconst_1
		// @047: iload #8
		// @049: invokevirtual game.C_100205_qf.func_103673_a(int, int)int
		// @04C: istore #10
		// @04E: aload #7
		// @050: iconst_1
		// @051: iload #9
		// @053: invokevirtual game.C_100205_qf.func_103673_a(int, int)int
		// @056: istore #11
		// @058: bipush 47 (0x2F)
		// @05A: aload #6
		// @05C: getfield int game.C_100336_im.field_102544_t
		// @05F: aload #6
		// @061: getfield int game.C_100336_im.field_102541_w
		// @064: iload #5
		// @066: iadd
		// @067: iadd
		// @068: iload #5
		// @06A: aload #6
		// @06C: getfield int game.C_100336_im.field_102541_w
		// @06F: iadd
		// @070: aload #6
		// @072: getfield int game.C_100336_im.field_102537_l
		// @075: iload_3
		// @076: iadd
		// @077: aload #6
		// @079: getfield int game.C_100336_im.field_102538_m
		// @07C: iadd
		// @07D: aload #6
		// @07F: getfield int game.C_100336_im.field_102538_m
		// @082: iload_3
		// @083: iadd
		// @084: invokestatic game.C_100209_qb.func_102687_b(int, int, int, int, int)void
		// @087: iload #10
		// @089: istore #12
		// @08B: iload #11
		// @08D: iconst_m1
		// @08E: ixor
		// @08F: iload #12
		// @091: iconst_m1
		// @092: ixor
		// @093: if_icmpgt @145
		// @096: aload #7
		// @098: getfield game.C_100306_kn[] game.C_100205_qf.field_103677_g
		// @09B: iload #12
		// @09D: aaload
		// @09E: astore #13
		// @0A0: iload #12
		// @0A2: iload #10
		// @0A4: iload #16
		// @0A6: ifne @14D
		// @0A9: if_icmpeq @0BB
		// @0AC: goto @0B0
		// @0AF: athrow
		// @0B0: aload #13
		// @0B2: getfield int[] game.C_100306_kn.field_107130_g
		// @0B5: iconst_0
		// @0B6: iaload
		// @0B7: goto @0C4
		// @0BA: athrow
		// @0BB: aload #7
		// @0BD: iload #8
		// @0BF: ldc 6316128 (0x606060)
		// @0C1: invokevirtual game.C_100205_qf.func_103665_b(int, int)int
		// @0C4: istore #14
		// @0C6: iload #12
		// @0C8: iconst_m1
		// @0C9: ixor
		// @0CA: iload #11
		// @0CC: iconst_m1
		// @0CD: ixor
		// @0CE: if_icmpeq @0F1
		// @0D1: aconst_null
		// @0D2: aload #13
		// @0D4: if_acmpeq @0ED
		// @0D7: goto @0DB
		// @0DA: athrow
		// @0DB: aload #13
		// @0DD: getfield int[] game.C_100306_kn.field_107130_g
		// @0E0: aload #13
		// @0E2: getfield int[] game.C_100306_kn.field_107130_g
		// @0E5: arraylength
		// @0E6: iconst_1
		// @0E7: isub
		// @0E8: iaload
		// @0E9: goto @0FA
		// @0EC: athrow
		// @0ED: iconst_0
		// @0EE: goto @0FA
		// @0F1: aload #7
		// @0F3: iload #9
		// @0F5: ldc 6316128 (0x606060)
		// @0F7: invokevirtual game.C_100205_qf.func_103665_b(int, int)int
		// @0FA: istore #15
		// @0FC: getstatic game.C_100233_oa game.C_100043_vl.field_101945_cc
		// @0FF: iload #15
		// @101: iload #14
		// @103: isub
		// @104: aload #6
		// @106: getfield int game.C_100336_im.field_102550_y
		// @109: aload_0
		// @10A: getfield int game.C_100256_pk.field_100464_b
		// @10D: iadd
		// @10E: iload #5
		// @110: aload #6
		// @112: getfield int game.C_100336_im.field_102541_w
		// @115: iadd
		// @116: aload #13
		// @118: getfield int game.C_100306_kn.field_107129_f
		// @11B: iadd
		// @11C: iadd
		// @11D: aload_0
		// @11E: iload #14
		// @120: aload #6
		// @122: ldc 965636417 (0x398e7141)
		// @124: iload_3
		// @125: invokespecial game.C_100256_pk.func_100457_a(int, game.C_100336_im, int, int)int
		// @128: aload #13
		// @12A: getfield int game.C_100306_kn.field_107135_a
		// @12D: aload_0
		// @12E: getfield int game.C_100256_pk.field_100476_t
		// @131: ldc 2127665848 (0x7ed19ab8)
		// @133: iushr
		// @134: bipush -119 (0x89)
		// @136: aload_0
		// @137: getfield int game.C_100256_pk.field_100476_t
		// @13A: invokevirtual game.C_100233_oa.func_106230_a(int, int, int, int, int, byte, int)void
		// @13D: iinc #12 +1
		// @140: iload #16
		// @142: ifeq @08B
		// @145: bipush -77 (0xB3)
		// @147: invokestatic game.C_100200_ba.func_105842_a(byte)void
		// @14A: iload_1
		// @14B: bipush -122 (0x86)
		// @14D: if_icmplt @15E
		// @150: aload_0
		// @151: aconst_null
		// @152: checkcast game.C_100336_im
		// @155: iconst_0
		// @156: invokevirtual game.C_100256_pk.func_100450_a(game.C_100336_im, boolean)java.lang.String
		// @159: pop
		// @15A: goto @15E
		// @15D: athrow
		// @15E: goto @1C5
		// @161: astore #7
		// @163: aload #7
		// @165: new java.lang.StringBuilder
		// @168: dup
		// @169: invokespecial java.lang.StringBuilder.<init>()void
		// @16C: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @16F: iconst_3
		// @170: aaload
		// @171: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @174: iload_1
		// @175: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @178: bipush 44 (0x2C)
		// @17A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @17D: iload_2
		// @17E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @181: bipush 44 (0x2C)
		// @183: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @186: iload_3
		// @187: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @18A: bipush 44 (0x2C)
		// @18C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @18F: iload #4
		// @191: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @194: bipush 44 (0x2C)
		// @196: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @199: iload #5
		// @19B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @19E: bipush 44 (0x2C)
		// @1A0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1A3: aload #6
		// @1A5: ifnull @1B1
		// @1A8: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @1AB: iconst_2
		// @1AC: aaload
		// @1AD: goto @1B6
		// @1B0: athrow
		// @1B1: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @1B4: iconst_1
		// @1B5: aaload
		// @1B6: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1B9: bipush 41 (0x29)
		// @1BB: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1BE: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @1C1: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @1C4: athrow
		// @1C5: return
	}
	
	public final int func_100443_a(int arg0, int arg1, int arg2, C_100336_im arg3, int arg4, int arg5)
	{
		// @00: iload #6
		// @02: bipush 82 (0x52)
		// @04: if_icmpge @16
		// @07: aload_0
		// @08: aconst_null
		// @09: checkcast game.C_100336_im
		// @0C: bipush -11 (0xF5)
		// @0E: invokevirtual game.C_100256_pk.func_100438_a(game.C_100336_im, int)int
		// @11: pop
		// @12: goto @16
		// @15: athrow
		// @16: aload_0
		// @17: bipush 113 (0x71)
		// @19: aload #4
		// @1B: invokevirtual game.C_100256_pk.func_100434_b(int, game.C_100336_im)game.C_100205_qf
		// @1E: pop
		// @1F: aload #4
		// @21: getfield game.C_100205_qf game.C_100336_im.field_102535_n
		// @24: iload_3
		// @25: aload_0
		// @26: iconst_0
		// @27: iload #5
		// @29: aload #4
		// @2B: invokevirtual game.C_100256_pk.func_100436_a(boolean, int, game.C_100336_im)int
		// @2E: ineg
		// @2F: iadd
		// @30: iload_1
		// @31: aload_0
		// @32: aload #4
		// @34: iload_2
		// @35: iconst_0
		// @36: invokevirtual game.C_100256_pk.func_100440_a(game.C_100336_im, int, boolean)int
		// @39: ineg
		// @3A: iadd
		// @3B: bipush -33 (0xDF)
		// @3D: invokevirtual game.C_100205_qf.func_103664_a(int, int, int)int
		// @40: ireturn
		// @41: astore #7
		// @43: aload #7
		// @45: new java.lang.StringBuilder
		// @48: dup
		// @49: invokespecial java.lang.StringBuilder.<init>()void
		// @4C: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @4F: bipush 21 (0x15)
		// @51: aaload
		// @52: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @55: iload_1
		// @56: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @59: bipush 44 (0x2C)
		// @5B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5E: iload_2
		// @5F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @62: bipush 44 (0x2C)
		// @64: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @67: iload_3
		// @68: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6B: bipush 44 (0x2C)
		// @6D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @70: aload #4
		// @72: ifnull @7E
		// @75: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @78: iconst_2
		// @79: aaload
		// @7A: goto @83
		// @7D: athrow
		// @7E: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @81: iconst_1
		// @82: aaload
		// @83: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @86: bipush 44 (0x2C)
		// @88: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8B: iload #5
		// @8D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @90: bipush 44 (0x2C)
		// @92: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @95: iload #6
		// @97: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @9A: bipush 41 (0x29)
		// @9C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @A2: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @A5: athrow
	}
	
	public final int func_100438_a(C_100336_im arg0, int arg1)
	{
		// @00: aload_0
		// @01: iload_2
		// @02: bipush 100 (0x64)
		// @04: ixor
		// @05: aload_1
		// @06: invokevirtual game.C_100256_pk.func_100434_b(int, game.C_100336_im)game.C_100205_qf
		// @09: pop
		// @0A: iload_2
		// @0B: ifeq @11
		// @0E: bipush -10 (0xF6)
		// @10: ireturn
		// @11: aload_1
		// @12: getfield game.C_100205_qf game.C_100336_im.field_102535_n
		// @15: iload_2
		// @16: bipush -82 (0xAE)
		// @18: ixor
		// @19: invokevirtual game.C_100205_qf.func_103663_c(int)int
		// @1C: aload_0
		// @1D: getfield int game.C_100256_pk.field_100465_c
		// @20: aload_0
		// @21: getfield int game.C_100256_pk.field_100472_k
		// @24: iadd
		// @25: iadd
		// @26: ireturn
		// @27: astore_3
		// @28: aload_3
		// @29: new java.lang.StringBuilder
		// @2C: dup
		// @2D: invokespecial java.lang.StringBuilder.<init>()void
		// @30: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @33: bipush 18 (0x12)
		// @35: aaload
		// @36: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @39: aload_1
		// @3A: ifnull @46
		// @3D: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @40: iconst_2
		// @41: aaload
		// @42: goto @4B
		// @45: athrow
		// @46: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @49: iconst_1
		// @4A: aaload
		// @4B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4E: bipush 44 (0x2C)
		// @50: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @53: iload_2
		// @54: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @57: bipush 41 (0x29)
		// @59: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @5F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @62: athrow
	}
	
	C_100256_pk(C_100112_r arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12)
	{
		// @00: aload_0
		// @01: invokespecial java.lang.Object.<init>()void
		// @04: aload_0
		// @05: iload #4
		// @07: putfield int game.C_100256_pk.field_100464_b
		// @0A: aload_0
		// @0B: iload #11
		// @0D: putfield int game.C_100256_pk.field_100469_l
		// @10: aload_0
		// @11: iload #8
		// @13: putfield int game.C_100256_pk.field_100468_o
		// @16: aload_0
		// @17: iload_2
		// @18: putfield int game.C_100256_pk.field_100465_c
		// @1B: aload_0
		// @1C: iload #10
		// @1E: putfield int game.C_100256_pk.field_100463_e
		// @21: aload_0
		// @22: iload #13
		// @24: putfield boolean game.C_100256_pk.field_100470_m
		// @27: aload_0
		// @28: iload #12
		// @2A: putfield int game.C_100256_pk.field_100476_t
		// @2D: aload_0
		// @2E: iload #7
		// @30: putfield int game.C_100256_pk.field_100462_d
		// @33: aload_0
		// @34: aload_1
		// @35: putfield game.C_100112_r game.C_100256_pk.field_100460_f
		// @38: aload_0
		// @39: iload #5
		// @3B: putfield int game.C_100256_pk.field_100474_i
		// @3E: aload_0
		// @3F: iload #9
		// @41: putfield int game.C_100256_pk.field_100480_p
		// @44: aload_0
		// @45: iload #6
		// @47: putfield int game.C_100256_pk.field_100473_h
		// @4A: aload_0
		// @4B: iload_3
		// @4C: putfield int game.C_100256_pk.field_100472_k
		// @4F: goto @FC
		// @52: astore #14
		// @54: aload #14
		// @56: new java.lang.StringBuilder
		// @59: dup
		// @5A: invokespecial java.lang.StringBuilder.<init>()void
		// @5D: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @60: iconst_0
		// @61: aaload
		// @62: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @65: aload_1
		// @66: ifnull @72
		// @69: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @6C: iconst_2
		// @6D: aaload
		// @6E: goto @77
		// @71: athrow
		// @72: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @75: iconst_1
		// @76: aaload
		// @77: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @7A: bipush 44 (0x2C)
		// @7C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7F: iload_2
		// @80: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @83: bipush 44 (0x2C)
		// @85: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @88: iload_3
		// @89: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8C: bipush 44 (0x2C)
		// @8E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @91: iload #4
		// @93: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @96: bipush 44 (0x2C)
		// @98: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9B: iload #5
		// @9D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A0: bipush 44 (0x2C)
		// @A2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A5: iload #6
		// @A7: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @AA: bipush 44 (0x2C)
		// @AC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @AF: iload #7
		// @B1: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @B4: bipush 44 (0x2C)
		// @B6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B9: iload #8
		// @BB: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @BE: bipush 44 (0x2C)
		// @C0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C3: iload #9
		// @C5: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @C8: bipush 44 (0x2C)
		// @CA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @CD: iload #10
		// @CF: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @D2: bipush 44 (0x2C)
		// @D4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D7: iload #11
		// @D9: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @DC: bipush 44 (0x2C)
		// @DE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @E1: iload #12
		// @E3: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @E6: bipush 44 (0x2C)
		// @E8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @EB: iload #13
		// @ED: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @F0: bipush 41 (0x29)
		// @F2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @F5: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @F8: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @FB: athrow
		// @FC: return
	}
	
	private final void func_100455_a(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, C_100336_im arg7)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #13
		// @005: bipush -125 (0x83)
		// @007: aload #8
		// @009: getfield int game.C_100336_im.field_102541_w
		// @00C: iload_1
		// @00D: aload #8
		// @00F: getfield int game.C_100336_im.field_102544_t
		// @012: ineg
		// @013: isub
		// @014: iadd
		// @015: aload #8
		// @017: getfield int game.C_100336_im.field_102541_w
		// @01A: iload_1
		// @01B: iadd
		// @01C: aload #8
		// @01E: getfield int game.C_100336_im.field_102537_l
		// @021: aload #8
		// @023: getfield int game.C_100336_im.field_102538_m
		// @026: iadd
		// @027: iload #7
		// @029: iadd
		// @02A: iload #7
		// @02C: aload #8
		// @02E: getfield int game.C_100336_im.field_102538_m
		// @031: iadd
		// @032: invokestatic game.C_100209_qb.func_102687_b(int, int, int, int, int)void
		// @035: aload_0
		// @036: aload #8
		// @038: bipush 79 (0x4F)
		// @03A: invokevirtual game.C_100256_pk.func_100435_a(game.C_100336_im, byte)int
		// @03D: istore #9
		// @03F: iload #5
		// @041: iconst_1
		// @042: if_icmpeq @055
		// @045: aload_0
		// @046: iconst_0
		// @047: bipush -18 (0xEE)
		// @049: aconst_null
		// @04A: checkcast game.C_100336_im
		// @04D: invokevirtual game.C_100256_pk.func_100436_a(boolean, int, game.C_100336_im)int
		// @050: pop
		// @051: goto @055
		// @054: athrow
		// @055: aload_0
		// @056: aload #8
		// @058: bipush -47 (0xD1)
		// @05A: invokespecial game.C_100256_pk.func_100459_b(game.C_100336_im, byte)int
		// @05D: istore #10
		// @05F: aload_0
		// @060: getfield boolean game.C_100256_pk.field_100470_m
		// @063: ifeq @0A6
		// @066: aload_0
		// @067: getfield game.C_100112_r game.C_100256_pk.field_100460_f
		// @06A: aload_0
		// @06B: aload #8
		// @06D: iconst_0
		// @06E: invokevirtual game.C_100256_pk.func_100450_a(game.C_100336_im, boolean)java.lang.String
		// @071: aload_0
		// @072: iload_2
		// @073: aload #8
		// @075: ldc 965636417 (0x398e7141)
		// @077: iload #7
		// @079: invokespecial game.C_100256_pk.func_100457_a(int, game.C_100336_im, int, int)int
		// @07C: aload_0
		// @07D: iload #4
		// @07F: aload #8
		// @081: iconst_0
		// @082: iload_1
		// @083: invokespecial game.C_100256_pk.func_100458_a(int, game.C_100336_im, boolean, int)int
		// @086: iload #9
		// @088: iload #10
		// @08A: iload #6
		// @08C: iload_3
		// @08D: aload_0
		// @08E: getfield int game.C_100256_pk.field_100468_o
		// @091: aload_0
		// @092: getfield int game.C_100256_pk.field_100480_p
		// @095: aload_0
		// @096: getfield int game.C_100256_pk.field_100463_e
		// @099: invokevirtual game.C_100112_r.func_101729_a(java.lang.String, int, int, int, int, int, int, int, int, int)int
		// @09C: pop
		// @09D: iload #13
		// @09F: ifeq @21F
		// @0A2: goto @0A6
		// @0A5: athrow
		// @0A6: aload_0
		// @0A7: getfield int game.C_100256_pk.field_100480_p
		// @0AA: istore #12
		// @0AC: iload #12
		// @0AE: iconst_m1
		// @0AF: ixor
		// @0B0: iconst_m1
		// @0B1: if_icmpne @0BD
		// @0B4: iload #13
		// @0B6: ifeq @0E7
		// @0B9: goto @0BD
		// @0BC: athrow
		// @0BD: iconst_2
		// @0BE: iload #12
		// @0C0: if_icmpeq @0F5
		// @0C3: goto @0C7
		// @0C6: athrow
		// @0C7: iconst_3
		// @0C8: iload #12
		// @0CA: if_icmpeq @106
		// @0CD: goto @0D1
		// @0D0: athrow
		// @0D1: bipush -2 (0xFE)
		// @0D3: iload #12
		// @0D5: iconst_m1
		// @0D6: ixor
		// @0D7: if_icmpne @106
		// @0DA: goto @0DE
		// @0DD: athrow
		// @0DE: iload #13
		// @0E0: ifeq @106
		// @0E3: goto @0E7
		// @0E6: athrow
		// @0E7: aload_0
		// @0E8: getfield game.C_100112_r game.C_100256_pk.field_100460_f
		// @0EB: getfield int game.C_100112_r.field_101772_Q
		// @0EE: istore #11
		// @0F0: iload #13
		// @0F2: ifeq @126
		// @0F5: iload #10
		// @0F7: aload_0
		// @0F8: getfield game.C_100112_r game.C_100256_pk.field_100460_f
		// @0FB: getfield int game.C_100112_r.field_101763_H
		// @0FE: isub
		// @0FF: istore #11
		// @101: iload #13
		// @103: ifeq @126
		// @106: iload #10
		// @108: aload_0
		// @109: getfield game.C_100112_r game.C_100256_pk.field_100460_f
		// @10C: getfield int game.C_100112_r.field_101772_Q
		// @10F: isub
		// @110: aload_0
		// @111: getfield game.C_100112_r game.C_100256_pk.field_100460_f
		// @114: getfield int game.C_100112_r.field_101763_H
		// @117: ineg
		// @118: iadd
		// @119: ldc 1514748481 (0x5a493a41)
		// @11B: ishr
		// @11C: aload_0
		// @11D: getfield game.C_100112_r game.C_100256_pk.field_100460_f
		// @120: getfield int game.C_100112_r.field_101772_Q
		// @123: iadd
		// @124: istore #11
		// @126: aload_0
		// @127: getfield int game.C_100256_pk.field_100468_o
		// @12A: istore #12
		// @12C: iload #12
		// @12E: iconst_m1
		// @12F: ixor
		// @130: iconst_m1
		// @131: if_icmpne @13D
		// @134: iload #13
		// @136: ifeq @179
		// @139: goto @13D
		// @13C: athrow
		// @13D: iload #12
		// @13F: iconst_3
		// @140: if_icmpne @150
		// @143: goto @147
		// @146: athrow
		// @147: iload #13
		// @149: ifeq @179
		// @14C: goto @150
		// @14F: athrow
		// @150: bipush -2 (0xFE)
		// @152: iload #12
		// @154: iconst_m1
		// @155: ixor
		// @156: if_icmpne @166
		// @159: goto @15D
		// @15C: athrow
		// @15D: iload #13
		// @15F: ifeq @1AC
		// @162: goto @166
		// @165: athrow
		// @166: iconst_2
		// @167: iload #12
		// @169: if_icmpne @21F
		// @16C: goto @170
		// @16F: athrow
		// @170: iload #13
		// @172: ifeq @1E4
		// @175: goto @179
		// @178: athrow
		// @179: aload_0
		// @17A: getfield game.C_100112_r game.C_100256_pk.field_100460_f
		// @17D: aload_0
		// @17E: aload #8
		// @180: iconst_0
		// @181: invokevirtual game.C_100256_pk.func_100450_a(game.C_100336_im, boolean)java.lang.String
		// @184: aload_0
		// @185: iload_2
		// @186: aload #8
		// @188: ldc 965636417 (0x398e7141)
		// @18A: iload #7
		// @18C: invokespecial game.C_100256_pk.func_100457_a(int, game.C_100336_im, int, int)int
		// @18F: aload_0
		// @190: iload #4
		// @192: aload #8
		// @194: iconst_0
		// @195: iload_1
		// @196: invokespecial game.C_100256_pk.func_100458_a(int, game.C_100336_im, boolean, int)int
		// @199: iload #11
		// @19B: ineg
		// @19C: isub
		// @19D: iload #6
		// @19F: iload_3
		// @1A0: invokevirtual game.C_100112_r.func_101749_c(java.lang.String, int, int, int, int)void
		// @1A3: iload #13
		// @1A5: ifeq @21F
		// @1A8: goto @1AC
		// @1AB: athrow
		// @1AC: aload_0
		// @1AD: getfield game.C_100112_r game.C_100256_pk.field_100460_f
		// @1B0: aload_0
		// @1B1: aload #8
		// @1B3: iconst_0
		// @1B4: invokevirtual game.C_100256_pk.func_100450_a(game.C_100336_im, boolean)java.lang.String
		// @1B7: iload #9
		// @1B9: ldc 1948269985 (0x74203da1)
		// @1BB: ishr
		// @1BC: aload_0
		// @1BD: iload_2
		// @1BE: aload #8
		// @1C0: ldc 965636417 (0x398e7141)
		// @1C2: iload #7
		// @1C4: invokespecial game.C_100256_pk.func_100457_a(int, game.C_100336_im, int, int)int
		// @1C7: iadd
		// @1C8: iload #11
		// @1CA: aload_0
		// @1CB: iload #4
		// @1CD: aload #8
		// @1CF: iconst_0
		// @1D0: iload_1
		// @1D1: invokespecial game.C_100256_pk.func_100458_a(int, game.C_100336_im, boolean, int)int
		// @1D4: iadd
		// @1D5: iload #6
		// @1D7: iload_3
		// @1D8: invokevirtual game.C_100112_r.func_101744_b(java.lang.String, int, int, int, int)void
		// @1DB: iload #13
		// @1DD: ifeq @21F
		// @1E0: goto @1E4
		// @1E3: athrow
		// @1E4: aload_0
		// @1E5: getfield game.C_100112_r game.C_100256_pk.field_100460_f
		// @1E8: aload_0
		// @1E9: aload #8
		// @1EB: iload #5
		// @1ED: ifne @1F9
		// @1F0: goto @1F4
		// @1F3: athrow
		// @1F4: iconst_1
		// @1F5: goto @1FA
		// @1F8: athrow
		// @1F9: iconst_0
		// @1FA: invokevirtual game.C_100256_pk.func_100450_a(game.C_100336_im, boolean)java.lang.String
		// @1FD: aload_0
		// @1FE: iload_2
		// @1FF: aload #8
		// @201: ldc 965636417 (0x398e7141)
		// @203: iload #7
		// @205: invokespecial game.C_100256_pk.func_100457_a(int, game.C_100336_im, int, int)int
		// @208: iload #9
		// @20A: ineg
		// @20B: isub
		// @20C: iload #11
		// @20E: aload_0
		// @20F: iload #4
		// @211: aload #8
		// @213: iconst_0
		// @214: iload_1
		// @215: invokespecial game.C_100256_pk.func_100458_a(int, game.C_100336_im, boolean, int)int
		// @218: iadd
		// @219: iload #6
		// @21B: iload_3
		// @21C: invokevirtual game.C_100112_r.func_101746_a(java.lang.String, int, int, int, int)void
		// @21F: bipush -77 (0xB3)
		// @221: invokestatic game.C_100200_ba.func_105842_a(byte)void
		// @224: goto @2A0
		// @227: astore #9
		// @229: aload #9
		// @22B: new java.lang.StringBuilder
		// @22E: dup
		// @22F: invokespecial java.lang.StringBuilder.<init>()void
		// @232: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @235: bipush 16 (0x10)
		// @237: aaload
		// @238: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @23B: iload_1
		// @23C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @23F: bipush 44 (0x2C)
		// @241: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @244: iload_2
		// @245: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @248: bipush 44 (0x2C)
		// @24A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @24D: iload_3
		// @24E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @251: bipush 44 (0x2C)
		// @253: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @256: iload #4
		// @258: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @25B: bipush 44 (0x2C)
		// @25D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @260: iload #5
		// @262: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @265: bipush 44 (0x2C)
		// @267: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @26A: iload #6
		// @26C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @26F: bipush 44 (0x2C)
		// @271: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @274: iload #7
		// @276: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @279: bipush 44 (0x2C)
		// @27B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @27E: aload #8
		// @280: ifnull @28C
		// @283: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @286: iconst_2
		// @287: aaload
		// @288: goto @291
		// @28B: athrow
		// @28C: getstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @28F: iconst_1
		// @290: aaload
		// @291: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @294: bipush 41 (0x29)
		// @296: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @299: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @29C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @29F: athrow
		// @2A0: return
	}
	
	static
	{
		// @000: bipush 28 (0x1C)
		// @002: anewarray java.lang.String
		// @005: dup
		// @006: iconst_0
		// @007: ldc "{-\u0003c\u001ae/Ya["
		// @009: invokestatic game.C_100256_pk.func_100456_z(java.lang.String)char[]
		// @00C: invokestatic game.C_100256_pk.func_100447_z(char[])java.lang.String
		// @00F: aastore
		// @010: dup
		// @011: iconst_1
		// @012: ldc "e3A3"
		// @014: invokestatic game.C_100256_pk.func_100456_z(java.lang.String)char[]
		// @017: invokestatic game.C_100256_pk.func_100447_z(char[])java.lang.String
		// @01A: aastore
		// @01B: dup
		// @01C: iconst_2
		// @01D: ldc "ph\u0003q\u000e"
		// @01F: invokestatic game.C_100256_pk.func_100456_z(java.lang.String)char[]
		// @022: invokestatic game.C_100256_pk.func_100447_z(char[])java.lang.String
		// @025: aastore
		// @026: dup
		// @027: iconst_3
		// @028: ldc "{-\u0003\u0017["
		// @02A: invokestatic game.C_100256_pk.func_100456_z(java.lang.String)char[]
		// @02D: invokestatic game.C_100256_pk.func_100447_z(char[])java.lang.String
		// @030: aastore
		// @031: dup
		// @032: iconst_4
		// @033: ldc "{-\u0003\u000b["
		// @035: invokestatic game.C_100256_pk.func_100456_z(java.lang.String)char[]
		// @038: invokestatic game.C_100256_pk.func_100447_z(char[])java.lang.String
		// @03B: aastore
		// @03C: dup
		// @03D: iconst_5
		// @03E: ldc "{-\u0003\u000c["
		// @040: invokestatic game.C_100256_pk.func_100456_z(java.lang.String)char[]
		// @043: invokestatic game.C_100256_pk.func_100447_z(char[])java.lang.String
		// @046: aastore
		// @047: dup
		// @048: bipush 6 (0x06)
		// @04A: ldc "{-\u0003\u001b["
		// @04C: invokestatic game.C_100256_pk.func_100456_z(java.lang.String)char[]
		// @04F: invokestatic game.C_100256_pk.func_100447_z(char[])java.lang.String
		// @052: aastore
		// @053: dup
		// @054: bipush 7 (0x07)
		// @056: ldc "{-\u0003\u00182#"
		// @058: invokestatic game.C_100256_pk.func_100456_z(java.lang.String)char[]
		// @05B: invokestatic game.C_100256_pk.func_100447_z(char[])java.lang.String
		// @05E: aastore
		// @05F: dup
		// @060: bipush 8 (0x08)
		// @062: ldc "{-\u0003\u001c2#"
		// @064: invokestatic game.C_100256_pk.func_100456_z(java.lang.String)char[]
		// @067: invokestatic game.C_100256_pk.func_100447_z(char[])java.lang.String
		// @06A: aastore
		// @06B: dup
		// @06C: bipush 9 (0x09)
		// @06E: ldc "{-\u0003\u0011["
		// @070: invokestatic game.C_100256_pk.func_100456_z(java.lang.String)char[]
		// @073: invokestatic game.C_100256_pk.func_100447_z(char[])java.lang.String
		// @076: aastore
		// @077: dup
		// @078: bipush 10 (0x0A)
		// @07A: ldc "{-\u0003\u0016["
		// @07C: invokestatic game.C_100256_pk.func_100456_z(java.lang.String)char[]
		// @07F: invokestatic game.C_100256_pk.func_100447_z(char[])java.lang.String
		// @082: aastore
		// @083: dup
		// @084: bipush 11 (0x0B)
		// @086: ldc "{-\u0003\t["
		// @088: invokestatic game.C_100256_pk.func_100456_z(java.lang.String)char[]
		// @08B: invokestatic game.C_100256_pk.func_100447_z(char[])java.lang.String
		// @08E: aastore
		// @08F: dup
		// @090: bipush 12 (0x0C)
		// @092: ldc "{-\u0003\u001a2#"
		// @094: invokestatic game.C_100256_pk.func_100456_z(java.lang.String)char[]
		// @097: invokestatic game.C_100256_pk.func_100447_z(char[])java.lang.String
		// @09A: aastore
		// @09B: dup
		// @09C: bipush 13 (0x0D)
		// @09E: ldc "{-\u0003\u0015["
		// @0A0: invokestatic game.C_100256_pk.func_100456_z(java.lang.String)char[]
		// @0A3: invokestatic game.C_100256_pk.func_100447_z(char[])java.lang.String
		// @0A6: aastore
		// @0A7: dup
		// @0A8: bipush 14 (0x0E)
		// @0AA: ldc "{-\u0003\n["
		// @0AC: invokestatic game.C_100256_pk.func_100456_z(java.lang.String)char[]
		// @0AF: invokestatic game.C_100256_pk.func_100447_z(char[])java.lang.String
		// @0B2: aastore
		// @0B3: dup
		// @0B4: bipush 15 (0x0F)
		// @0B6: ldc "{-\u0003\u0008["
		// @0B8: invokestatic game.C_100256_pk.func_100456_z(java.lang.String)char[]
		// @0BB: invokestatic game.C_100256_pk.func_100447_z(char[])java.lang.String
		// @0BE: aastore
		// @0BF: dup
		// @0C0: bipush 16 (0x10)
		// @0C2: ldc "{-\u0003\u001e2#"
		// @0C4: invokestatic game.C_100256_pk.func_100456_z(java.lang.String)char[]
		// @0C7: invokestatic game.C_100256_pk.func_100447_z(char[])java.lang.String
		// @0CA: aastore
		// @0CB: dup
		// @0CC: bipush 17 (0x11)
		// @0CE: ldc "{-\u0003\u000f["
		// @0D0: invokestatic game.C_100256_pk.func_100456_z(java.lang.String)char[]
		// @0D3: invokestatic game.C_100256_pk.func_100447_z(char[])java.lang.String
		// @0D6: aastore
		// @0D7: dup
		// @0D8: bipush 18 (0x12)
		// @0DA: ldc "{-\u0003\u0013["
		// @0DC: invokestatic game.C_100256_pk.func_100456_z(java.lang.String)char[]
		// @0DF: invokestatic game.C_100256_pk.func_100447_z(char[])java.lang.String
		// @0E2: aastore
		// @0E3: dup
		// @0E4: bipush 19 (0x13)
		// @0E6: ldc "{-\u0003\u00192#"
		// @0E8: invokestatic game.C_100256_pk.func_100456_z(java.lang.String)char[]
		// @0EB: invokestatic game.C_100256_pk.func_100447_z(char[])java.lang.String
		// @0EE: aastore
		// @0EF: dup
		// @0F0: bipush 20 (0x14)
		// @0F2: ldc "{-\u0003\u000e["
		// @0F4: invokestatic game.C_100256_pk.func_100456_z(java.lang.String)char[]
		// @0F7: invokestatic game.C_100256_pk.func_100447_z(char[])java.lang.String
		// @0FA: aastore
		// @0FB: dup
		// @0FC: bipush 21 (0x15)
		// @0FE: ldc "{-\u0003\u0010["
		// @100: invokestatic game.C_100256_pk.func_100456_z(java.lang.String)char[]
		// @103: invokestatic game.C_100256_pk.func_100447_z(char[])java.lang.String
		// @106: aastore
		// @107: dup
		// @108: bipush 22 (0x16)
		// @10A: ldc "{-\u0003\u001d2#"
		// @10C: invokestatic game.C_100256_pk.func_100456_z(java.lang.String)char[]
		// @10F: invokestatic game.C_100256_pk.func_100447_z(char[])java.lang.String
		// @112: aastore
		// @113: dup
		// @114: bipush 23 (0x17)
		// @116: ldc "{-\u0003\u00172#"
		// @118: invokestatic game.C_100256_pk.func_100456_z(java.lang.String)char[]
		// @11B: invokestatic game.C_100256_pk.func_100447_z(char[])java.lang.String
		// @11E: aastore
		// @11F: dup
		// @120: bipush 24 (0x18)
		// @122: ldc "{-\u0003\u0012["
		// @124: invokestatic game.C_100256_pk.func_100456_z(java.lang.String)char[]
		// @127: invokestatic game.C_100256_pk.func_100447_z(char[])java.lang.String
		// @12A: aastore
		// @12B: dup
		// @12C: bipush 25 (0x19)
		// @12E: ldc "{-\u0003\r["
		// @130: invokestatic game.C_100256_pk.func_100456_z(java.lang.String)char[]
		// @133: invokestatic game.C_100256_pk.func_100447_z(char[])java.lang.String
		// @136: aastore
		// @137: dup
		// @138: bipush 26 (0x1A)
		// @13A: ldc "{-\u0003\u001b2#"
		// @13C: invokestatic game.C_100256_pk.func_100456_z(java.lang.String)char[]
		// @13F: invokestatic game.C_100256_pk.func_100447_z(char[])java.lang.String
		// @142: aastore
		// @143: dup
		// @144: bipush 27 (0x1B)
		// @146: ldc "{-\u0003\u0014["
		// @148: invokestatic game.C_100256_pk.func_100456_z(java.lang.String)char[]
		// @14B: invokestatic game.C_100256_pk.func_100447_z(char[])java.lang.String
		// @14E: aastore
		// @14F: putstatic java.lang.String[] game.C_100256_pk.field_100481_z
		// @152: new game.C_100133_tk
		// @155: dup
		// @156: invokespecial game.C_100133_tk.<init>()void
		// @159: putstatic game.C_100133_tk game.C_100256_pk.field_100466_a
		// @15C: ldc "X.B(S{*L&\u0016y5\r6\u001d+z\u0008oM,5\r8\u0012f#"
		// @15E: invokestatic game.C_100256_pk.func_100456_z(java.lang.String)char[]
		// @161: invokestatic game.C_100256_pk.func_100447_z(char[])java.lang.String
		// @164: putstatic java.lang.String game.C_100256_pk.field_100477_s
		// @167: ldc "7%B3N;vK9\u0015mx\n\u000c;B\u0000yxXh*D<\u0018+2B\u007f\u0001n5Y0\u0001nfY7\u0016+\"H9\u0012~*Y\u007f\u0010d+]0\u001dn(Y\u007f\u0007dfY7\u001axf^3\u001c\u007fh\u0011p\u0010d*\u0013"
		// @169: invokestatic game.C_100256_pk.func_100456_z(java.lang.String)char[]
		// @16C: invokestatic game.C_100256_pk.func_100447_z(char[])java.lang.String
		// @16F: putstatic java.lang.String game.C_100256_pk.field_100471_j
		// @172: ldc "N+L6\u001f1f"
		// @174: invokestatic game.C_100256_pk.func_100456_z(java.lang.String)char[]
		// @177: invokestatic game.C_100256_pk.func_100447_z(char[])java.lang.String
		// @17A: putstatic java.lang.String game.C_100256_pk.field_100461_g
		// @17D: ldc "f#@=\u0016y5\u00000\u001dg?\r<\u001ce2H1\u0007"
		// @17F: invokestatic game.C_100256_pk.func_100456_z(java.lang.String)char[]
		// @182: invokestatic game.C_100256_pk.func_100447_z(char[])java.lang.String
		// @185: putstatic java.lang.String game.C_100256_pk.field_100479_q
		// @188: ldc "N(Y:\u0001++X3\u0007b6A>\nn4\r3\u001ci$T"
		// @18A: invokestatic game.C_100256_pk.func_100456_z(java.lang.String)char[]
		// @18D: invokestatic game.C_100256_pk.func_100447_z(char[])java.lang.String
		// @190: putstatic java.lang.String game.C_100256_pk.field_100467_n
		// @193: return
	}
	
	private static char[] func_100456_z(String arg0)
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
		// @0E: bipush 115 (0x73)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_100447_z(char[] arg0)
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
		// @30: bipush 11 (0x0B)
		// @32: goto @46
		// @35: bipush 70 (0x46)
		// @37: goto @46
		// @3A: bipush 45 (0x2D)
		// @3C: goto @46
		// @3F: bipush 95 (0x5F)
		// @41: goto @46
		// @44: bipush 115 (0x73)
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
