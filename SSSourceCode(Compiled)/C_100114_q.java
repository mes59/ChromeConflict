package game;

class C_100114_q extends C_100256_pk
{
	static C_100153_be[] field_100489_v;
	static C_100217_ao field_100490_A;
	static String field_100491_B;
	static C_100302_ka field_100494_y;
	static C_100251_pm field_100495_x;
	static String field_100492_C;
	static String field_100493_z;
	static int field_100488_w;
	private static final String[] field_100487_D;
	
	C_100114_q(int arg0)
	{
		// @0: aload_0
		// @1: getstatic game.C_100112_r game.C_100230_of.field_106205_g
		// @4: iload_1
		// @5: invokespecial game.C_100114_q.<init>(game.C_100112_r, int)void
		// @8: return
	}
	
	public static void func_100485_a(byte arg0)
	{
		// @00: iload_0
		// @01: bipush -22 (0xEA)
		// @03: if_icmple @07
		// @06: return
		// @07: aconst_null
		// @08: putstatic java.lang.String game.C_100114_q.field_100491_B
		// @0B: aconst_null
		// @0C: putstatic game.C_100153_be[] game.C_100114_q.field_100489_v
		// @0F: aconst_null
		// @10: putstatic game.C_100251_pm game.C_100114_q.field_100495_x
		// @13: aconst_null
		// @14: putstatic game.C_100302_ka game.C_100114_q.field_100494_y
		// @17: aconst_null
		// @18: putstatic java.lang.String game.C_100114_q.field_100492_C
		// @1B: aconst_null
		// @1C: putstatic game.C_100217_ao game.C_100114_q.field_100490_A
		// @1F: aconst_null
		// @20: putstatic java.lang.String game.C_100114_q.field_100493_z
		// @23: goto @47
		// @26: astore_1
		// @27: aload_1
		// @28: new java.lang.StringBuilder
		// @2B: dup
		// @2C: invokespecial java.lang.StringBuilder.<init>()void
		// @2F: getstatic java.lang.String[] game.C_100114_q.field_100487_D
		// @32: iconst_0
		// @33: aaload
		// @34: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @37: iload_0
		// @38: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3B: bipush 41 (0x29)
		// @3D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @40: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @43: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @46: athrow
		// @47: return
	}
	
	static final C_100302_ka func_100482_c(int arg0)
	{
		// @00: iload_0
		// @01: sipush 23300 (0x5B04)
		// @04: if_icmpeq @10
		// @07: bipush -20 (0xEC)
		// @09: invokestatic game.C_100114_q.func_100485_a(byte)void
		// @0C: goto @10
		// @0F: athrow
		// @10: iconst_0
		// @11: invokestatic game.C_100050_vg.func_100625_a(boolean)game.C_100302_ka
		// @14: areturn
		// @15: astore_1
		// @16: aload_1
		// @17: new java.lang.StringBuilder
		// @1A: dup
		// @1B: invokespecial java.lang.StringBuilder.<init>()void
		// @1E: getstatic java.lang.String[] game.C_100114_q.field_100487_D
		// @21: iconst_1
		// @22: aaload
		// @23: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @26: iload_0
		// @27: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2A: bipush 41 (0x29)
		// @2C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @32: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @35: athrow
	}
	
	C_100114_q(C_100112_r arg0, int arg1)
	{
		// @00: aload_0
		// @01: aload_1
		// @02: iconst_4
		// @03: iconst_2
		// @04: iconst_2
		// @05: iconst_2
		// @06: iload_2
		// @07: iconst_m1
		// @08: iconst_0
		// @09: iconst_1
		// @0A: aload_1
		// @0B: getfield int game.C_100112_r.field_101772_Q
		// @0E: iconst_m1
		// @0F: ldc 2147483647 (0x7fffffff)
		// @11: iconst_0
		// @12: invokespecial game.C_100256_pk.<init>(game.C_100112_r, int, int, int, int, int, int, int, int, int, int, int, boolean)void
		// @15: return
	}
	
	static final boolean func_100483_a(int arg0, byte arg1)
	{
		// @00: getstatic game.C_100278_nd game.C_100288_jn.field_106839_f
		// @03: getfield int game.C_100278_nd.field_101177_n
		// @06: iconst_m1
		// @07: ixor
		// @08: iload_0
		// @09: iconst_m1
		// @0A: ixor
		// @0B: if_icmpgt @10
		// @0E: iconst_1
		// @0F: ireturn
		// @10: getstatic game.C_100286_nl game.C_100318_hj.field_107194_f
		// @13: ifnull @1A
		// @16: goto @1C
		// @19: athrow
		// @1A: iconst_0
		// @1B: ireturn
		// @1C: iload_1
		// @1D: bipush 51 (0x33)
		// @1F: if_icmpeq @24
		// @22: iconst_1
		// @23: ireturn
		// @24: getstatic game.C_100286_nl game.C_100318_hj.field_107194_f
		// @27: iconst_1
		// @28: invokevirtual game.C_100286_nl.func_106796_f(int)int
		// @2B: istore_2
		// @2C: iconst_m1
		// @2D: iload_2
		// @2E: iconst_m1
		// @2F: ixor
		// @30: if_icmple @93
		// @33: iload_0
		// @34: getstatic game.C_100278_nd game.C_100288_jn.field_106839_f
		// @37: getfield int game.C_100278_nd.field_101177_n
		// @3A: isub
		// @3B: iconst_m1
		// @3C: ixor
		// @3D: iload_2
		// @3E: iconst_m1
		// @3F: ixor
		// @40: if_icmpgt @4B
		// @43: goto @47
		// @46: athrow
		// @47: goto @55
		// @4A: athrow
		// @4B: getstatic game.C_100278_nd game.C_100288_jn.field_106839_f
		// @4E: getfield int game.C_100278_nd.field_101177_n
		// @51: ineg
		// @52: iload_0
		// @53: iadd
		// @54: istore_2
		// @55: getstatic game.C_100286_nl game.C_100318_hj.field_107194_f
		// @58: bipush -112 (0x90)
		// @5A: getstatic game.C_100278_nd game.C_100288_jn.field_106839_f
		// @5D: getfield int game.C_100278_nd.field_101177_n
		// @60: getstatic game.C_100278_nd game.C_100288_jn.field_106839_f
		// @63: getfield byte[] game.C_100278_nd.field_101179_l
		// @66: iload_2
		// @67: invokevirtual game.C_100286_nl.func_106794_a(int, int, byte[], int)void
		// @6A: bipush 55 (0x37)
		// @6C: invokestatic game.C_100198_qn.func_105828_a(byte)long
		// @6F: putstatic long game.C_100236_on.field_100908_p
		// @72: getstatic game.C_100278_nd game.C_100288_jn.field_106839_f
		// @75: dup
		// @76: getfield int game.C_100278_nd.field_101177_n
		// @79: iload_2
		// @7A: iadd
		// @7B: putfield int game.C_100278_nd.field_101177_n
		// @7E: getstatic game.C_100278_nd game.C_100288_jn.field_106839_f
		// @81: getfield int game.C_100278_nd.field_101177_n
		// @84: iload_0
		// @85: if_icmpge @8A
		// @88: iconst_0
		// @89: ireturn
		// @8A: getstatic game.C_100278_nd game.C_100288_jn.field_106839_f
		// @8D: iconst_0
		// @8E: putfield int game.C_100278_nd.field_101177_n
		// @91: iconst_1
		// @92: ireturn
		// @93: iconst_m1
		// @94: iload_2
		// @95: iconst_m1
		// @96: ixor
		// @97: if_icmplt @AA
		// @9A: bipush 88 (0x58)
		// @9C: invokestatic game.C_100133_tk.func_104988_c(int)long
		// @9F: ldc2_w 30000
		// @A2: lcmp
		// @A3: ifle @B4
		// @A6: goto @AA
		// @A9: athrow
		// @AA: sipush 13313 (0x3401)
		// @AD: invokestatic game.C_100095_fe.func_103371_l(int)void
		// @B0: goto @B4
		// @B3: athrow
		// @B4: goto @BE
		// @B7: astore_2
		// @B8: sipush 13313 (0x3401)
		// @BB: invokestatic game.C_100095_fe.func_103371_l(int)void
		// @BE: iconst_0
		// @BF: ireturn
		// @C0: astore_2
		// @C1: aload_2
		// @C2: new java.lang.StringBuilder
		// @C5: dup
		// @C6: invokespecial java.lang.StringBuilder.<init>()void
		// @C9: getstatic java.lang.String[] game.C_100114_q.field_100487_D
		// @CC: iconst_5
		// @CD: aaload
		// @CE: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @D1: iload_0
		// @D2: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @D5: bipush 44 (0x2C)
		// @D7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @DA: iload_1
		// @DB: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @DE: bipush 41 (0x29)
		// @E0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @E3: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @E6: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @E9: athrow
	}
	
	public final void func_100362_a(boolean arg0, int arg1, int arg2, int arg3, C_100336_im arg4)
	{
		// @00: iload_1
		// @01: ifeq @27
		// @04: aload #5
		// @06: getfield int game.C_100336_im.field_102537_l
		// @09: aload #5
		// @0B: getfield int game.C_100336_im.field_102541_w
		// @0E: iload #4
		// @10: iadd
		// @11: aload #5
		// @13: getfield int game.C_100336_im.field_102544_t
		// @16: iload_3
		// @17: aload #5
		// @19: getfield int game.C_100336_im.field_102538_m
		// @1C: ineg
		// @1D: isub
		// @1E: bipush -110 (0x92)
		// @20: invokestatic game.C_100022_hf.func_103886_a(int, int, int, int, byte)void
		// @23: goto @27
		// @26: athrow
		// @27: aload_0
		// @28: iload_1
		// @29: iload_2
		// @2A: iload_3
		// @2B: iload #4
		// @2D: aload #5
		// @2F: invokespecial game.C_100256_pk.func_100362_a(boolean, int, int, int, game.C_100336_im)void
		// @32: goto @8F
		// @35: astore #6
		// @37: aload #6
		// @39: new java.lang.StringBuilder
		// @3C: dup
		// @3D: invokespecial java.lang.StringBuilder.<init>()void
		// @40: getstatic java.lang.String[] game.C_100114_q.field_100487_D
		// @43: iconst_3
		// @44: aaload
		// @45: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @48: iload_1
		// @49: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @4C: bipush 44 (0x2C)
		// @4E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @51: iload_2
		// @52: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @55: bipush 44 (0x2C)
		// @57: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5A: iload_3
		// @5B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5E: bipush 44 (0x2C)
		// @60: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @63: iload #4
		// @65: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @68: bipush 44 (0x2C)
		// @6A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6D: aload #5
		// @6F: ifnull @7B
		// @72: getstatic java.lang.String[] game.C_100114_q.field_100487_D
		// @75: iconst_4
		// @76: aaload
		// @77: goto @80
		// @7A: athrow
		// @7B: getstatic java.lang.String[] game.C_100114_q.field_100487_D
		// @7E: iconst_2
		// @7F: aaload
		// @80: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @83: bipush 41 (0x29)
		// @85: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @88: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @8B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @8E: athrow
		// @8F: return
	}
	
	static
	{
		// @00: bipush 6 (0x06)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "\tR\u001e#\u0004"
		// @09: invokestatic game.C_100114_q.func_100486_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100114_q.func_100484_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "\tR\u001c#\u0004"
		// @14: invokestatic game.C_100114_q.func_100486_z(java.lang.String)char[]
		// @17: invokestatic game.C_100114_q.func_100484_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "\u0016\t9\u000e"
		// @1F: invokestatic game.C_100114_q.func_100486_z(java.lang.String)char[]
		// @22: invokestatic game.C_100114_q.func_100484_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "\tR\u0011J"
		// @2A: invokestatic game.C_100114_q.func_100486_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100114_q.func_100484_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "\u0003R{LQ"
		// @35: invokestatic game.C_100114_q.func_100486_z(java.lang.String)char[]
		// @38: invokestatic game.C_100114_q.func_100484_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "\tR\u001f#\u0004"
		// @40: invokestatic game.C_100114_q.func_100486_z(java.lang.String)char[]
		// @43: invokestatic game.C_100114_q.func_100484_z(char[])java.lang.String
		// @46: aastore
		// @47: putstatic java.lang.String[] game.C_100114_q.field_100487_D
		// @4A: ldc ";\u00144\u000cK\u001d\\1\u000b_\u0008\u00104\u001b\u000c\u0016\u001d8\u0007"
		// @4C: invokestatic game.C_100114_q.func_100486_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100114_q.func_100484_z(char[])java.lang.String
		// @52: putstatic java.lang.String game.C_100114_q.field_100491_B
		// @55: ldc "!\u0013 BM\n\u0019u\u0003H\u000e\u0015&\u0007HX\u0008:BO\u0017\u0011%\u000eI\u000c\u0019u\u0003@\u0014\\!\u0010M\u0011\u0012<\u000cKX\u0011<\u0011_\u0011\u0013;\u0011\u000c\u001a\u00193\r^\u001d\\4\u0016X\u001d\u0011%\u0016E\u0016\u001bu\u0016D\u0011\u000fu\u000fE\u000b\u000f<\rBV"
		// @57: invokestatic game.C_100114_q.func_100486_z(java.lang.String)char[]
		// @5A: invokestatic game.C_100114_q.func_100484_z(char[])java.lang.String
		// @5D: putstatic java.lang.String game.C_100114_q.field_100492_C
		// @60: new game.C_100217_ao
		// @63: dup
		// @64: bipush 10 (0x0A)
		// @66: iconst_2
		// @67: iconst_2
		// @68: iconst_0
		// @69: invokespecial game.C_100217_ao.<init>(int, int, int, int)void
		// @6C: putstatic game.C_100217_ao game.C_100114_q.field_100490_A
		// @6F: ldc "1\u0012#\u0003@\u0011\u0018u\u0012M\u000b\u000f\"\r^\u001cR"
		// @71: invokestatic game.C_100114_q.func_100486_z(java.lang.String)char[]
		// @74: invokestatic game.C_100114_q.func_100484_z(char[])java.lang.String
		// @77: putstatic java.lang.String game.C_100114_q.field_100493_z
		// @7A: return
	}
	
	private static char[] func_100486_z(String arg0)
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
		// @0E: bipush 44 (0x2C)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_100484_z(char[] arg0)
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
		// @30: bipush 120 (0x78)
		// @32: goto @46
		// @35: bipush 124 (0x7C)
		// @37: goto @46
		// @3A: bipush 85 (0x55)
		// @3C: goto @46
		// @3F: bipush 98 (0x62)
		// @41: goto @46
		// @44: bipush 44 (0x2C)
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
