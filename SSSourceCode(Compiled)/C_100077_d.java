package game;

final class C_100077_d extends C_100051_ea
{
	static boolean field_103326_eb;
	static C_100096_un field_103320_W;
	static String field_103318_db;
	static String field_103324_bb;
	private boolean field_103322_ab;
	private C_100309_lk field_103325_X;
	static String field_103321_V;
	private C_100309_lk field_103328_Z;
	private C_100309_lk field_103319_cb;
	static C_100302_ka field_103323_Y;
	static int field_103317_U;
	private static final String[] field_103327_fb;
	
	final boolean func_103293_l(int arg0)
	{
		// @00: aconst_null
		// @01: aload_0
		// @02: getfield game.C_100309_lk game.C_100077_d.field_103319_cb
		// @05: getfield java.lang.String game.C_100309_lk.field_102534_C
		// @08: if_acmpeq @20
		// @0B: aload_0
		// @0C: getfield game.C_100309_lk game.C_100077_d.field_103319_cb
		// @0F: getfield java.lang.String game.C_100309_lk.field_102534_C
		// @12: invokevirtual java.lang.String.length()int
		// @15: ifeq @20
		// @18: goto @1C
		// @1B: athrow
		// @1C: goto @22
		// @1F: athrow
		// @20: iconst_1
		// @21: ireturn
		// @22: iload_1
		// @23: bipush 59 (0x3B)
		// @25: if_icmpge @33
		// @28: aconst_null
		// @29: checkcast java.lang.String
		// @2C: putstatic java.lang.String game.C_100077_d.field_103324_bb
		// @2F: goto @33
		// @32: athrow
		// @33: aload_0
		// @34: getfield game.C_100309_lk game.C_100077_d.field_103325_X
		// @37: getfield java.lang.String game.C_100309_lk.field_102534_C
		// @3A: ifnull @4F
		// @3D: iconst_0
		// @3E: aload_0
		// @3F: getfield game.C_100309_lk game.C_100077_d.field_103325_X
		// @42: getfield java.lang.String game.C_100309_lk.field_102534_C
		// @45: invokevirtual java.lang.String.length()int
		// @48: if_icmpne @51
		// @4B: goto @4F
		// @4E: athrow
		// @4F: iconst_1
		// @50: ireturn
		// @51: aload_0
		// @52: getfield game.C_100309_lk game.C_100077_d.field_103328_Z
		// @55: getfield java.lang.String game.C_100309_lk.field_102534_C
		// @58: ifnull @6D
		// @5B: iconst_0
		// @5C: aload_0
		// @5D: getfield game.C_100309_lk game.C_100077_d.field_103328_Z
		// @60: getfield java.lang.String game.C_100309_lk.field_102534_C
		// @63: invokevirtual java.lang.String.length()int
		// @66: if_icmpne @6F
		// @69: goto @6D
		// @6C: athrow
		// @6D: iconst_1
		// @6E: ireturn
		// @6F: iconst_0
		// @70: ireturn
		// @71: astore_2
		// @72: aload_2
		// @73: new java.lang.StringBuilder
		// @76: dup
		// @77: invokespecial java.lang.StringBuilder.<init>()void
		// @7A: getstatic java.lang.String[] game.C_100077_d.field_103327_fb
		// @7D: iconst_0
		// @7E: aaload
		// @7F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @82: iload_1
		// @83: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @86: bipush 41 (0x29)
		// @88: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @8E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @91: athrow
	}
	
	final int func_103299_k(int arg0)
	{
		// @00: bipush -98 (0x9E)
		// @02: iload_1
		// @03: bipush -55 (0xC9)
		// @05: isub
		// @06: bipush 32 (0x20)
		// @08: idiv
		// @09: irem
		// @0A: istore_2
		// @0B: aload_0
		// @0C: getfield game.C_100309_lk game.C_100077_d.field_103325_X
		// @0F: getfield java.lang.String game.C_100309_lk.field_102534_C
		// @12: invokestatic java.lang.Integer.parseInt(java.lang.String)int
		// @15: iconst_1
		// @16: isub
		// @17: ireturn
		// @18: astore_3
		// @19: iconst_m1
		// @1A: ireturn
		// @1B: astore_2
		// @1C: aload_2
		// @1D: new java.lang.StringBuilder
		// @20: dup
		// @21: invokespecial java.lang.StringBuilder.<init>()void
		// @24: getstatic java.lang.String[] game.C_100077_d.field_103327_fb
		// @27: bipush 11 (0x0B)
		// @29: aaload
		// @2A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2D: iload_1
		// @2E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @31: bipush 41 (0x29)
		// @33: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @36: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @39: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3C: athrow
	}
	
	static final C_100321_hi func_103311_a(byte arg0, String arg1)
	{
		// @00: getstatic game.C_100321_hi game.C_100106_ef.field_104753_e
		// @03: bipush -2 (0xFE)
		// @05: invokevirtual game.C_100321_hi.func_107211_b(int)boolean
		// @08: ifeq @2C
		// @0B: aload_1
		// @0C: getstatic game.C_100321_hi game.C_100106_ef.field_104753_e
		// @0F: sipush -23813 (0xA2FB)
		// @12: invokevirtual game.C_100321_hi.func_107206_c(int)java.lang.String
		// @15: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @18: ifne @2C
		// @1B: goto @1F
		// @1E: athrow
		// @1F: bipush 44 (0x2C)
		// @21: aload_1
		// @22: invokestatic game.C_100156_sk.func_105377_a(byte, java.lang.String)game.C_100321_hi
		// @25: putstatic game.C_100321_hi game.C_100106_ef.field_104753_e
		// @28: goto @2C
		// @2B: athrow
		// @2C: iload_0
		// @2D: bipush 89 (0x59)
		// @2F: if_icmpeq @3D
		// @32: aconst_null
		// @33: checkcast game.C_100302_ka
		// @36: putstatic game.C_100302_ka game.C_100077_d.field_103323_Y
		// @39: goto @3D
		// @3C: athrow
		// @3D: getstatic game.C_100321_hi game.C_100106_ef.field_104753_e
		// @40: areturn
		// @41: astore_2
		// @42: aload_2
		// @43: new java.lang.StringBuilder
		// @46: dup
		// @47: invokespecial java.lang.StringBuilder.<init>()void
		// @4A: getstatic java.lang.String[] game.C_100077_d.field_103327_fb
		// @4D: bipush 14 (0x0E)
		// @4F: aaload
		// @50: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @53: iload_0
		// @54: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @57: bipush 44 (0x2C)
		// @59: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5C: aload_1
		// @5D: ifnull @69
		// @60: getstatic java.lang.String[] game.C_100077_d.field_103327_fb
		// @63: iconst_3
		// @64: aaload
		// @65: goto @6E
		// @68: athrow
		// @69: getstatic java.lang.String[] game.C_100077_d.field_103327_fb
		// @6C: iconst_1
		// @6D: aaload
		// @6E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @71: bipush 41 (0x29)
		// @73: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @76: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @79: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @7C: athrow
	}
	
	static final int func_103315_b(int arg0, int arg1, int arg2)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #8
		// @05: iload_0
		// @06: sipush 3939 (0x0F63)
		// @09: if_icmpeq @17
		// @0C: aconst_null
		// @0D: checkcast java.lang.String
		// @10: putstatic java.lang.String game.C_100077_d.field_103321_V
		// @13: goto @17
		// @16: athrow
		// @17: iconst_0
		// @18: istore_3
		// @19: getstatic int game.C_100336_im.field_102540_k
		// @1C: istore #4
		// @1E: iload_3
		// @1F: iconst_m1
		// @20: ixor
		// @21: getstatic java.lang.String[] game.C_100217_ao.field_106041_m
		// @24: arraylength
		// @25: iconst_m1
		// @26: ixor
		// @27: if_icmple @B7
		// @2A: getstatic int[] game.C_100197_ra.field_100860_j
		// @2D: iload_3
		// @2E: iaload
		// @2F: istore #5
		// @31: iconst_0
		// @32: iload #8
		// @34: ifne @B8
		// @37: iload #5
		// @39: if_icmpgt @A7
		// @3C: goto @40
		// @3F: athrow
		// @40: getstatic java.lang.String[] game.C_100217_ao.field_106041_m
		// @43: iload_3
		// @44: aaload
		// @45: iconst_1
		// @46: iconst_1
		// @47: invokestatic game.C_100294_ki.func_106909_a(java.lang.String, boolean, boolean)int
		// @4A: istore #6
		// @4C: iload #6
		// @4E: ldc 1080562305 (0x40681281)
		// @50: ishr
		// @51: ineg
		// @52: getstatic int game.C_100022_hf.field_103894_g
		// @55: iadd
		// @56: istore #7
		// @58: iload #4
		// @5A: getstatic int game.C_100085_a.field_102575_J
		// @5D: iadd
		// @5E: istore #4
		// @60: iload_2
		// @61: iload #4
		// @63: iload_1
		// @64: getstatic int game.C_100314_lf.field_101381_bb
		// @67: ineg
		// @68: iload #7
		// @6A: iadd
		// @6B: getstatic int game.C_100200_ba.field_105850_e
		// @6E: getstatic int game.C_100057_dd.field_104253_f
		// @71: ldc -1375569343 (0xae027a41)
		// @73: ishl
		// @74: ineg
		// @75: isub
		// @76: bipush -58 (0xC6)
		// @78: getstatic int game.C_100314_lf.field_101381_bb
		// @7B: ldc 515325569 (0x1eb73e81)
		// @7D: ishl
		// @7E: iload #6
		// @80: iadd
		// @81: invokestatic game.C_100081_ue.func_100666_a(int, int, int, int, int, int, int)boolean
		// @84: ifne @8B
		// @87: goto @8E
		// @8A: athrow
		// @8B: iload #5
		// @8D: ireturn
		// @8E: iload #4
		// @90: getstatic int game.C_100200_ba.field_105850_e
		// @93: getstatic int game.C_100057_dd.field_104253_f
		// @96: ldc -1025018687 (0xc2e774c1)
		// @98: ishl
		// @99: getstatic int game.C_100085_a.field_102575_J
		// @9C: ineg
		// @9D: isub
		// @9E: iadd
		// @9F: iadd
		// @A0: istore #4
		// @A2: iload #8
		// @A4: ifeq @AF
		// @A7: iload #4
		// @A9: getstatic int game.C_100098_h.field_104612_f
		// @AC: iadd
		// @AD: istore #4
		// @AF: iinc #3 +1
		// @B2: iload #8
		// @B4: ifeq @1E
		// @B7: iconst_m1
		// @B8: ireturn
		// @B9: astore_3
		// @BA: aload_3
		// @BB: new java.lang.StringBuilder
		// @BE: dup
		// @BF: invokespecial java.lang.StringBuilder.<init>()void
		// @C2: getstatic java.lang.String[] game.C_100077_d.field_103327_fb
		// @C5: bipush 7 (0x07)
		// @C7: aaload
		// @C8: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @CB: iload_0
		// @CC: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @CF: bipush 44 (0x2C)
		// @D1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D4: iload_1
		// @D5: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @D8: bipush 44 (0x2C)
		// @DA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @DD: iload_2
		// @DE: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @E1: bipush 41 (0x29)
		// @E3: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @E6: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @E9: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @EC: athrow
	}
	
	private final void func_103314_a(String arg0, int arg1, int arg2, boolean arg3, C_100336_im arg4)
	{
		// @00: getstatic game.C_100112_r game.C_100318_hj.field_107198_b
		// @03: aload_1
		// @04: aload #5
		// @06: getfield int game.C_100336_im.field_102537_l
		// @09: ldc 115448993 (0x6e19ca1)
		// @0B: ishr
		// @0C: iload_3
		// @0D: iadd
		// @0E: aload #5
		// @10: getfield int game.C_100336_im.field_102538_m
		// @13: ineg
		// @14: isub
		// @15: bipush -5 (0xFB)
		// @17: aload #5
		// @19: getfield int game.C_100336_im.field_102541_w
		// @1C: iload_2
		// @1D: iadd
		// @1E: iadd
		// @1F: ldc 16777215 (0xffffff)
		// @21: iconst_m1
		// @22: invokevirtual game.C_100112_r.func_101744_b(java.lang.String, int, int, int, int)void
		// @25: iload #4
		// @27: ifeq @31
		// @2A: aconst_null
		// @2B: checkcast java.lang.String
		// @2E: putstatic java.lang.String game.C_100077_d.field_103324_bb
		// @31: goto @A0
		// @34: astore #6
		// @36: aload #6
		// @38: new java.lang.StringBuilder
		// @3B: dup
		// @3C: invokespecial java.lang.StringBuilder.<init>()void
		// @3F: getstatic java.lang.String[] game.C_100077_d.field_103327_fb
		// @42: bipush 10 (0x0A)
		// @44: aaload
		// @45: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @48: aload_1
		// @49: ifnull @55
		// @4C: getstatic java.lang.String[] game.C_100077_d.field_103327_fb
		// @4F: iconst_3
		// @50: aaload
		// @51: goto @5A
		// @54: athrow
		// @55: getstatic java.lang.String[] game.C_100077_d.field_103327_fb
		// @58: iconst_1
		// @59: aaload
		// @5A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @5D: bipush 44 (0x2C)
		// @5F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @62: iload_2
		// @63: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @66: bipush 44 (0x2C)
		// @68: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6B: iload_3
		// @6C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6F: bipush 44 (0x2C)
		// @71: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @74: iload #4
		// @76: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @79: bipush 44 (0x2C)
		// @7B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7E: aload #5
		// @80: ifnull @8C
		// @83: getstatic java.lang.String[] game.C_100077_d.field_103327_fb
		// @86: iconst_3
		// @87: aaload
		// @88: goto @91
		// @8B: athrow
		// @8C: getstatic java.lang.String[] game.C_100077_d.field_103327_fb
		// @8F: iconst_1
		// @90: aaload
		// @91: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @94: bipush 41 (0x29)
		// @96: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @99: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @9C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @9F: athrow
		// @A0: return
	}
	
	final String func_102525_c(byte arg0)
	{
		// @00: aload_0
		// @01: getfield game.C_100309_lk game.C_100077_d.field_103325_X
		// @04: bipush 52 (0x34)
		// @06: invokevirtual game.C_100309_lk.func_102525_c(byte)java.lang.String
		// @09: astore_2
		// @0A: aconst_null
		// @0B: aload_2
		// @0C: if_acmpeq @11
		// @0F: aload_2
		// @10: areturn
		// @11: aload_0
		// @12: getfield boolean game.C_100077_d.field_102539_j
		// @15: ifne @1C
		// @18: goto @30
		// @1B: athrow
		// @1C: aload_0
		// @1D: getfield java.lang.String game.C_100077_d.field_102536_o
		// @20: ifnull @2B
		// @23: aload_0
		// @24: getfield java.lang.String game.C_100077_d.field_102536_o
		// @27: goto @2F
		// @2A: athrow
		// @2B: aload_0
		// @2C: getfield java.lang.String game.C_100077_d.field_102534_C
		// @2F: areturn
		// @30: iload_1
		// @31: bipush 34 (0x22)
		// @33: if_icmpge @41
		// @36: aconst_null
		// @37: checkcast game.C_100096_un
		// @3A: putstatic game.C_100096_un game.C_100077_d.field_103320_W
		// @3D: goto @41
		// @40: athrow
		// @41: aconst_null
		// @42: areturn
		// @43: astore_2
		// @44: aload_2
		// @45: new java.lang.StringBuilder
		// @48: dup
		// @49: invokespecial java.lang.StringBuilder.<init>()void
		// @4C: getstatic java.lang.String[] game.C_100077_d.field_103327_fb
		// @4F: bipush 13 (0x0D)
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
	
	public static void func_103316_p(int arg0)
	{
		// @00: iload_0
		// @01: ifeq @05
		// @04: return
		// @05: aconst_null
		// @06: putstatic game.C_100302_ka game.C_100077_d.field_103323_Y
		// @09: aconst_null
		// @0A: putstatic java.lang.String game.C_100077_d.field_103318_db
		// @0D: aconst_null
		// @0E: putstatic java.lang.String game.C_100077_d.field_103324_bb
		// @11: aconst_null
		// @12: putstatic java.lang.String game.C_100077_d.field_103321_V
		// @15: aconst_null
		// @16: putstatic game.C_100096_un game.C_100077_d.field_103320_W
		// @19: goto @3E
		// @1C: astore_1
		// @1D: aload_1
		// @1E: new java.lang.StringBuilder
		// @21: dup
		// @22: invokespecial java.lang.StringBuilder.<init>()void
		// @25: getstatic java.lang.String[] game.C_100077_d.field_103327_fb
		// @28: bipush 9 (0x09)
		// @2A: aaload
		// @2B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2E: iload_0
		// @2F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @32: bipush 41 (0x29)
		// @34: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @37: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3D: athrow
		// @3E: return
	}
	
	final void func_103296_a(C_100275_na arg0, int arg1)
	{
		// @00: aload_0
		// @01: aload_1
		// @02: bipush -110 (0x92)
		// @04: invokespecial game.C_100051_ea.func_103296_a(game.C_100275_na, int)void
		// @07: aload_0
		// @08: getfield game.C_100309_lk game.C_100077_d.field_103319_cb
		// @0B: aload_1
		// @0C: putfield game.C_100337_in game.C_100309_lk.field_102543_u
		// @0F: iload_2
		// @10: bipush -104 (0x98)
		// @12: if_icmplt @20
		// @15: aconst_null
		// @16: checkcast java.lang.String
		// @19: putstatic java.lang.String game.C_100077_d.field_103321_V
		// @1C: goto @20
		// @1F: athrow
		// @20: aload_0
		// @21: getfield game.C_100309_lk game.C_100077_d.field_103325_X
		// @24: aload_1
		// @25: putfield game.C_100337_in game.C_100309_lk.field_102543_u
		// @28: aload_0
		// @29: getfield game.C_100309_lk game.C_100077_d.field_103328_Z
		// @2C: aload_1
		// @2D: putfield game.C_100337_in game.C_100309_lk.field_102543_u
		// @30: goto @6E
		// @33: astore_3
		// @34: aload_3
		// @35: new java.lang.StringBuilder
		// @38: dup
		// @39: invokespecial java.lang.StringBuilder.<init>()void
		// @3C: getstatic java.lang.String[] game.C_100077_d.field_103327_fb
		// @3F: iconst_2
		// @40: aaload
		// @41: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @44: aload_1
		// @45: ifnull @51
		// @48: getstatic java.lang.String[] game.C_100077_d.field_103327_fb
		// @4B: iconst_3
		// @4C: aaload
		// @4D: goto @56
		// @50: athrow
		// @51: getstatic java.lang.String[] game.C_100077_d.field_103327_fb
		// @54: iconst_1
		// @55: aaload
		// @56: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @59: bipush 44 (0x2C)
		// @5B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5E: iload_2
		// @5F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @62: bipush 41 (0x29)
		// @64: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @67: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @6A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @6D: athrow
		// @6E: return
	}
	
	final int func_103300_a(byte arg0)
	{
		// @00: bipush -95 (0xA1)
		// @02: bipush -48 (0xD0)
		// @04: iload_1
		// @05: isub
		// @06: bipush 41 (0x29)
		// @08: idiv
		// @09: idiv
		// @0A: istore_2
		// @0B: aload_0
		// @0C: getfield game.C_100309_lk game.C_100077_d.field_103319_cb
		// @0F: getfield java.lang.String game.C_100309_lk.field_102534_C
		// @12: invokestatic java.lang.Integer.parseInt(java.lang.String)int
		// @15: ireturn
		// @16: astore_3
		// @17: iconst_m1
		// @18: ireturn
		// @19: astore_2
		// @1A: aload_2
		// @1B: new java.lang.StringBuilder
		// @1E: dup
		// @1F: invokespecial java.lang.StringBuilder.<init>()void
		// @22: getstatic java.lang.String[] game.C_100077_d.field_103327_fb
		// @25: iconst_5
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
	
	final void func_102528_a(int arg0, int arg1, int arg2, byte arg3)
	{
		// @00: aload_0
		// @01: iload_1
		// @02: iload_2
		// @03: iload_3
		// @04: bipush -128 (0x80)
		// @06: invokespecial game.C_100051_ea.func_102528_a(int, int, int, byte)void
		// @09: iload #4
		// @0B: bipush -126 (0x82)
		// @0D: if_icmple @1B
		// @10: aconst_null
		// @11: checkcast java.lang.String
		// @14: putstatic java.lang.String game.C_100077_d.field_103324_bb
		// @17: goto @1B
		// @1A: athrow
		// @1B: iconst_m1
		// @1C: iload_1
		// @1D: iconst_m1
		// @1E: ixor
		// @1F: if_icmpne @26
		// @22: goto @27
		// @25: athrow
		// @26: return
		// @27: iload_2
		// @28: aload_0
		// @29: getfield int game.C_100077_d.field_102541_w
		// @2C: iadd
		// @2D: istore_2
		// @2E: iload_3
		// @2F: aload_0
		// @30: getfield int game.C_100077_d.field_102538_m
		// @33: iadd
		// @34: istore_3
		// @35: aload_0
		// @36: getstatic java.lang.String game.C_100089_fa.field_103727_b
		// @39: iload_2
		// @3A: iload_3
		// @3B: iconst_0
		// @3C: aload_0
		// @3D: getfield game.C_100309_lk game.C_100077_d.field_103319_cb
		// @40: invokespecial game.C_100077_d.func_103314_a(java.lang.String, int, int, boolean, game.C_100336_im)void
		// @43: aload_0
		// @44: getstatic java.lang.String game.C_100079_e.field_102677_wb
		// @47: iload_2
		// @48: iload_3
		// @49: iconst_0
		// @4A: aload_0
		// @4B: getfield game.C_100309_lk game.C_100077_d.field_103325_X
		// @4E: invokespecial game.C_100077_d.func_103314_a(java.lang.String, int, int, boolean, game.C_100336_im)void
		// @51: aload_0
		// @52: getstatic java.lang.String game.C_100136_th.field_102621_P
		// @55: iload_2
		// @56: iload_3
		// @57: iconst_0
		// @58: aload_0
		// @59: getfield game.C_100309_lk game.C_100077_d.field_103328_Z
		// @5C: invokespecial game.C_100077_d.func_103314_a(java.lang.String, int, int, boolean, game.C_100336_im)void
		// @5F: goto @A2
		// @62: astore #5
		// @64: aload #5
		// @66: new java.lang.StringBuilder
		// @69: dup
		// @6A: invokespecial java.lang.StringBuilder.<init>()void
		// @6D: getstatic java.lang.String[] game.C_100077_d.field_103327_fb
		// @70: bipush 8 (0x08)
		// @72: aaload
		// @73: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @76: iload_1
		// @77: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
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
		// @96: bipush 41 (0x29)
		// @98: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @9E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @A1: athrow
		// @A2: return
	}
	
	final int func_103303_n(int arg0)
	{
		// @00: iload_1
		// @01: iconst_m1
		// @02: if_icmpeq @11
		// @05: iconst_4
		// @06: iconst_2
		// @07: bipush 35 (0x23)
		// @09: invokestatic game.C_100077_d.func_103315_b(int, int, int)int
		// @0C: pop
		// @0D: goto @11
		// @10: athrow
		// @11: aload_0
		// @12: getfield game.C_100309_lk game.C_100077_d.field_103328_Z
		// @15: getfield java.lang.String game.C_100309_lk.field_102534_C
		// @18: invokestatic java.lang.Integer.parseInt(java.lang.String)int
		// @1B: ireturn
		// @1C: astore_2
		// @1D: iconst_m1
		// @1E: ireturn
		// @1F: astore_2
		// @20: aload_2
		// @21: new java.lang.StringBuilder
		// @24: dup
		// @25: invokespecial java.lang.StringBuilder.<init>()void
		// @28: getstatic java.lang.String[] game.C_100077_d.field_103327_fb
		// @2B: bipush 6 (0x06)
		// @2D: aaload
		// @2E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @31: iload_1
		// @32: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @35: bipush 41 (0x29)
		// @37: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @40: athrow
	}
	
	C_100077_d(C_100326_ic arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5)
	{
		// @00: aload_0
		// @01: aload_1
		// @02: iload_2
		// @03: invokespecial game.C_100077_d.<init>(game.C_100326_ic, boolean)void
		// @06: aload_0
		// @07: iload #6
		// @09: iload #4
		// @0B: iload_3
		// @0C: iload #5
		// @0E: bipush 54 (0x36)
		// @10: invokevirtual game.C_100077_d.func_102524_a(int, int, int, int, byte)void
		// @13: goto @7B
		// @16: astore #7
		// @18: aload #7
		// @1A: new java.lang.StringBuilder
		// @1D: dup
		// @1E: invokespecial java.lang.StringBuilder.<init>()void
		// @21: getstatic java.lang.String[] game.C_100077_d.field_103327_fb
		// @24: bipush 12 (0x0C)
		// @26: aaload
		// @27: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2A: aload_1
		// @2B: ifnull @37
		// @2E: getstatic java.lang.String[] game.C_100077_d.field_103327_fb
		// @31: iconst_3
		// @32: aaload
		// @33: goto @3C
		// @36: athrow
		// @37: getstatic java.lang.String[] game.C_100077_d.field_103327_fb
		// @3A: iconst_1
		// @3B: aaload
		// @3C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3F: bipush 44 (0x2C)
		// @41: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @44: iload_2
		// @45: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
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
		// @60: iload #5
		// @62: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @65: bipush 44 (0x2C)
		// @67: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6A: iload #6
		// @6C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6F: bipush 41 (0x29)
		// @71: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @74: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @77: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @7A: athrow
		// @7B: return
	}
	
	private C_100077_d(C_100326_ic arg0, boolean arg1)
	{
		// @00: aload_0
		// @01: iconst_0
		// @02: iconst_0
		// @03: iconst_0
		// @04: iconst_0
		// @05: aconst_null
		// @06: invokespecial game.C_100051_ea.<init>(int, int, int, int, game.C_100326_ic)void
		// @09: aload_0
		// @0A: new game.C_100078_ul
		// @0D: dup
		// @0E: ldc ""
		// @10: aconst_null
		// @11: iconst_2
		// @12: invokespecial game.C_100078_ul.<init>(java.lang.String, game.C_100337_in, int)void
		// @15: putfield game.C_100309_lk game.C_100077_d.field_103319_cb
		// @18: aload_0
		// @19: new game.C_100078_ul
		// @1C: dup
		// @1D: ldc ""
		// @1F: aconst_null
		// @20: iconst_2
		// @21: invokespecial game.C_100078_ul.<init>(java.lang.String, game.C_100337_in, int)void
		// @24: putfield game.C_100309_lk game.C_100077_d.field_103325_X
		// @27: aload_0
		// @28: new game.C_100078_ul
		// @2B: dup
		// @2C: ldc ""
		// @2E: aconst_null
		// @2F: iconst_4
		// @30: invokespecial game.C_100078_ul.<init>(java.lang.String, game.C_100337_in, int)void
		// @33: putfield game.C_100309_lk game.C_100077_d.field_103328_Z
		// @36: aload_0
		// @37: getfield game.C_100309_lk game.C_100077_d.field_103319_cb
		// @3A: aload_0
		// @3B: getfield game.C_100309_lk game.C_100077_d.field_103325_X
		// @3E: aload_0
		// @3F: getfield game.C_100309_lk game.C_100077_d.field_103328_Z
		// @42: aload_1
		// @43: dup_x1
		// @44: putfield game.C_100326_ic game.C_100309_lk.field_102533_B
		// @47: dup_x1
		// @48: putfield game.C_100326_ic game.C_100309_lk.field_102533_B
		// @4B: putfield game.C_100326_ic game.C_100309_lk.field_102533_B
		// @4E: aload_0
		// @4F: iload_2
		// @50: putfield boolean game.C_100077_d.field_103322_ab
		// @53: aload_0
		// @54: getfield boolean game.C_100077_d.field_103322_ab
		// @57: ifne @72
		// @5A: aload_0
		// @5B: aload_0
		// @5C: getfield game.C_100309_lk game.C_100077_d.field_103319_cb
		// @5F: iconst_1
		// @60: invokevirtual game.C_100077_d.func_102561_b(game.C_100336_im, int)void
		// @63: aload_0
		// @64: aload_0
		// @65: getfield game.C_100309_lk game.C_100077_d.field_103325_X
		// @68: iconst_1
		// @69: invokevirtual game.C_100077_d.func_102561_b(game.C_100336_im, int)void
		// @6C: getstatic int game.SteelSentinels.field_105275_O
		// @6F: ifeq @88
		// @72: aload_0
		// @73: aload_0
		// @74: getfield game.C_100309_lk game.C_100077_d.field_103325_X
		// @77: iconst_1
		// @78: invokevirtual game.C_100077_d.func_102561_b(game.C_100336_im, int)void
		// @7B: aload_0
		// @7C: aload_0
		// @7D: getfield game.C_100309_lk game.C_100077_d.field_103319_cb
		// @80: iconst_1
		// @81: invokevirtual game.C_100077_d.func_102561_b(game.C_100336_im, int)void
		// @84: goto @88
		// @87: athrow
		// @88: aload_0
		// @89: aload_0
		// @8A: getfield game.C_100309_lk game.C_100077_d.field_103328_Z
		// @8D: iconst_1
		// @8E: invokevirtual game.C_100077_d.func_102561_b(game.C_100336_im, int)void
		// @91: goto @D0
		// @94: astore_3
		// @95: aload_3
		// @96: new java.lang.StringBuilder
		// @99: dup
		// @9A: invokespecial java.lang.StringBuilder.<init>()void
		// @9D: getstatic java.lang.String[] game.C_100077_d.field_103327_fb
		// @A0: bipush 12 (0x0C)
		// @A2: aaload
		// @A3: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @A6: aload_1
		// @A7: ifnull @B3
		// @AA: getstatic java.lang.String[] game.C_100077_d.field_103327_fb
		// @AD: iconst_3
		// @AE: aaload
		// @AF: goto @B8
		// @B2: athrow
		// @B3: getstatic java.lang.String[] game.C_100077_d.field_103327_fb
		// @B6: iconst_1
		// @B7: aaload
		// @B8: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @BB: bipush 44 (0x2C)
		// @BD: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C0: iload_2
		// @C1: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @C4: bipush 41 (0x29)
		// @C6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C9: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @CC: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @CF: athrow
		// @D0: return
	}
	
	final void func_102524_a(int arg0, int arg1, int arg2, int arg3, byte arg4)
	{
		// @00: aload_0
		// @01: iload_1
		// @02: iload_2
		// @03: iload_3
		// @04: iload #4
		// @06: bipush -75 (0xB5)
		// @08: invokespecial game.C_100051_ea.func_102524_a(int, int, int, int, byte)void
		// @0B: sipush -130 (0xFF7E)
		// @0E: iload #4
		// @10: iadd
		// @11: ldc -932832415 (0xc8661b61)
		// @13: ishr
		// @14: istore #6
		// @16: bipush -91 (0xA5)
		// @18: bipush -11 (0xF5)
		// @1A: iload #5
		// @1C: isub
		// @1D: bipush 48 (0x30)
		// @1F: idiv
		// @20: idiv
		// @21: istore #7
		// @23: aload_0
		// @24: getfield boolean game.C_100077_d.field_103322_ab
		// @27: ifeq @55
		// @2A: aload_0
		// @2B: getfield game.C_100309_lk game.C_100077_d.field_103325_X
		// @2E: iload_1
		// @2F: iconst_0
		// @30: iload #6
		// @32: bipush 25 (0x19)
		// @34: bipush -60 (0xC4)
		// @36: invokevirtual game.C_100309_lk.func_102524_a(int, int, int, int, byte)void
		// @39: aload_0
		// @3A: getfield game.C_100309_lk game.C_100077_d.field_103319_cb
		// @3D: iload_1
		// @3E: iconst_0
		// @3F: bipush 45 (0x2D)
		// @41: iload #6
		// @43: iadd
		// @44: bipush 25 (0x19)
		// @46: bipush 67 (0x43)
		// @48: invokevirtual game.C_100309_lk.func_102524_a(int, int, int, int, byte)void
		// @4B: getstatic int game.SteelSentinels.field_105275_O
		// @4E: ifeq @7A
		// @51: goto @55
		// @54: athrow
		// @55: aload_0
		// @56: getfield game.C_100309_lk game.C_100077_d.field_103319_cb
		// @59: iload_1
		// @5A: iconst_0
		// @5B: iload #6
		// @5D: bipush 25 (0x19)
		// @5F: bipush 110 (0x6E)
		// @61: invokevirtual game.C_100309_lk.func_102524_a(int, int, int, int, byte)void
		// @64: aload_0
		// @65: getfield game.C_100309_lk game.C_100077_d.field_103325_X
		// @68: iload_1
		// @69: iconst_0
		// @6A: bipush 45 (0x2D)
		// @6C: iload #6
		// @6E: iadd
		// @6F: bipush 25 (0x19)
		// @71: bipush -119 (0x89)
		// @73: invokevirtual game.C_100309_lk.func_102524_a(int, int, int, int, byte)void
		// @76: goto @7A
		// @79: athrow
		// @7A: aload_0
		// @7B: getfield game.C_100309_lk game.C_100077_d.field_103328_Z
		// @7E: iload_1
		// @7F: iconst_0
		// @80: bipush 90 (0x5A)
		// @82: iload #6
		// @84: iadd
		// @85: bipush 40 (0x28)
		// @87: bipush -91 (0xA5)
		// @89: invokevirtual game.C_100309_lk.func_102524_a(int, int, int, int, byte)void
		// @8C: goto @D8
		// @8F: astore #6
		// @91: aload #6
		// @93: new java.lang.StringBuilder
		// @96: dup
		// @97: invokespecial java.lang.StringBuilder.<init>()void
		// @9A: getstatic java.lang.String[] game.C_100077_d.field_103327_fb
		// @9D: iconst_4
		// @9E: aaload
		// @9F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @A2: iload_1
		// @A3: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A6: bipush 44 (0x2C)
		// @A8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @AB: iload_2
		// @AC: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @AF: bipush 44 (0x2C)
		// @B1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B4: iload_3
		// @B5: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @B8: bipush 44 (0x2C)
		// @BA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @BD: iload #4
		// @BF: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @C2: bipush 44 (0x2C)
		// @C4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C7: iload #5
		// @C9: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @CC: bipush 41 (0x29)
		// @CE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D1: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @D4: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @D7: athrow
		// @D8: return
	}
	
	static
	{
		// @00: bipush 15 (0x0F)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "\u000carZY"
		// @09: invokestatic game.C_100077_d.func_103313_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100077_d.func_103312_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "\u0006:Nw"
		// @14: invokestatic game.C_100077_d.func_103313_z(java.lang.String)char[]
		// @17: invokestatic game.C_100077_d.func_103312_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "\u000caeZY"
		// @1F: invokestatic game.C_100077_d.func_103313_z(java.lang.String)char[]
		// @22: invokestatic game.C_100077_d.func_103312_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "\u0013a\u000c5\u000c"
		// @2A: invokestatic game.C_100077_d.func_103313_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100077_d.func_103312_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "\u000canZY"
		// @35: invokestatic game.C_100077_d.func_103313_z(java.lang.String)char[]
		// @38: invokestatic game.C_100077_d.func_103312_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "\u000calZY"
		// @40: invokestatic game.C_100077_d.func_103313_z(java.lang.String)char[]
		// @43: invokestatic game.C_100077_d.func_103312_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "\u000cahZY"
		// @4C: invokestatic game.C_100077_d.func_103313_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100077_d.func_103312_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "\u000caiZY"
		// @58: invokestatic game.C_100077_d.func_103313_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100077_d.func_103312_z(char[])java.lang.String
		// @5E: aastore
		// @5F: dup
		// @60: bipush 8 (0x08)
		// @62: ldc "\u000caa3"
		// @64: invokestatic game.C_100077_d.func_103313_z(java.lang.String)char[]
		// @67: invokestatic game.C_100077_d.func_103312_z(char[])java.lang.String
		// @6A: aastore
		// @6B: dup
		// @6C: bipush 9 (0x09)
		// @6E: ldc "\u000caoZY"
		// @70: invokestatic game.C_100077_d.func_103313_z(java.lang.String)char[]
		// @73: invokestatic game.C_100077_d.func_103312_z(char[])java.lang.String
		// @76: aastore
		// @77: dup
		// @78: bipush 10 (0x0A)
		// @7A: ldc "\u000cajZY"
		// @7C: invokestatic game.C_100077_d.func_103313_z(java.lang.String)char[]
		// @7F: invokestatic game.C_100077_d.func_103312_z(char[])java.lang.String
		// @82: aastore
		// @83: dup
		// @84: bipush 11 (0x0B)
		// @86: ldc "\u000cakZY"
		// @88: invokestatic game.C_100077_d.func_103313_z(java.lang.String)char[]
		// @8B: invokestatic game.C_100077_d.func_103312_z(char[])java.lang.String
		// @8E: aastore
		// @8F: dup
		// @90: bipush 12 (0x0C)
		// @92: ldc "\u000ca\u001er\u001f\u0001;\u001c3"
		// @94: invokestatic game.C_100077_d.func_103313_z(java.lang.String)char[]
		// @97: invokestatic game.C_100077_d.func_103312_z(char[])java.lang.String
		// @9A: aastore
		// @9B: dup
		// @9C: bipush 13 (0x0D)
		// @9E: ldc "\u000cad3"
		// @A0: invokestatic game.C_100077_d.func_103313_z(java.lang.String)char[]
		// @A3: invokestatic game.C_100077_d.func_103312_z(char[])java.lang.String
		// @A6: aastore
		// @A7: dup
		// @A8: bipush 14 (0x0E)
		// @AA: ldc "\u000camZY"
		// @AC: invokestatic game.C_100077_d.func_103313_z(java.lang.String)char[]
		// @AF: invokestatic game.C_100077_d.func_103312_z(char[])java.lang.String
		// @B2: aastore
		// @B3: putstatic java.lang.String[] game.C_100077_d.field_103327_fb
		// @B6: ldc ";'MlQ\u000b'CoQ@~\u0002n\u001f\u001a*C\u007fQ\u0005*Qh\u0010\u000f*\u000b"
		// @B8: invokestatic game.C_100077_d.func_103313_z(java.lang.String)char[]
		// @BB: invokestatic game.C_100077_d.func_103312_z(char[])java.lang.String
		// @BE: putstatic java.lang.String game.C_100077_d.field_103324_bb
		// @C1: ldc "Wp\u001d"
		// @C3: invokestatic game.C_100077_d.func_103313_z(java.lang.String)char[]
		// @C6: invokestatic game.C_100077_d.func_103312_z(char[])java.lang.String
		// @C9: putstatic java.lang.String game.C_100077_d.field_103318_db
		// @CC: iconst_0
		// @CD: putstatic int game.C_100077_d.field_103317_U
		// @D0: return
	}
	
	private static char[] func_103313_z(String arg0)
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
		// @0E: bipush 113 (0x71)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_103312_z(char[] arg0)
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
		// @30: bipush 104 (0x68)
		// @32: goto @46
		// @35: bipush 79 (0x4F)
		// @37: goto @46
		// @3A: bipush 34 (0x22)
		// @3C: goto @46
		// @3F: bipush 27 (0x1B)
		// @41: goto @46
		// @44: bipush 113 (0x71)
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
