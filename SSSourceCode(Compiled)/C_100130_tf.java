package game;

final class C_100130_tf
{
	static C_100037_wb field_104961_b;
	static int[] field_104960_e;
	static int field_104962_c;
	static volatile int field_104958_f;
	static String field_104963_a;
	static String[] field_104959_d;
	private static final String[] field_104964_z;
	
	static final C_100179_ch func_104952_a(C_100117_p arg0, byte arg1)
	{
		// @00: bipush 101 (0x65)
		// @02: bipush -4 (0xFC)
		// @04: iload_1
		// @05: isub
		// @06: bipush 33 (0x21)
		// @08: idiv
		// @09: idiv
		// @0A: istore_2
		// @0B: new game.C_100179_ch
		// @0E: dup
		// @0F: aload_0
		// @10: aload_0
		// @11: invokespecial game.C_100179_ch.<init>(game.C_100117_p, game.C_100158_da)void
		// @14: astore_3
		// @15: getstatic game.C_100202_qi game.C_100226_ae.field_106148_d
		// @18: bipush 123 (0x7B)
		// @1A: aload_3
		// @1B: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @1E: getstatic game.C_100026_hb game.C_100059_df.field_101599_L
		// @21: aload_0
		// @22: invokevirtual game.C_100026_hb.func_100924_b(game.C_100261_md)void
		// @25: aload_3
		// @26: areturn
		// @27: astore_2
		// @28: aload_2
		// @29: new java.lang.StringBuilder
		// @2C: dup
		// @2D: invokespecial java.lang.StringBuilder.<init>()void
		// @30: getstatic java.lang.String[] game.C_100130_tf.field_104964_z
		// @33: iconst_3
		// @34: aaload
		// @35: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @38: aload_0
		// @39: ifnull @45
		// @3C: getstatic java.lang.String[] game.C_100130_tf.field_104964_z
		// @3F: iconst_2
		// @40: aaload
		// @41: goto @4A
		// @44: athrow
		// @45: getstatic java.lang.String[] game.C_100130_tf.field_104964_z
		// @48: iconst_1
		// @49: aaload
		// @4A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4D: bipush 44 (0x2C)
		// @4F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @52: iload_1
		// @53: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @56: bipush 41 (0x29)
		// @58: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @5E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @61: athrow
	}
	
	public final String toString()
	{
		// @00: new java.lang.IllegalStateException
		// @03: dup
		// @04: invokespecial java.lang.IllegalStateException.<init>()void
		// @07: athrow
		// @08: astore_1
		// @09: aload_1
		// @0A: getstatic java.lang.String[] game.C_100130_tf.field_104964_z
		// @0D: iconst_4
		// @0E: aaload
		// @0F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @12: athrow
	}
	
	static final void func_104953_a(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String[] game.C_100341_jd.field_102648_ob
		// @04: iconst_0
		// @05: putstatic boolean game.C_100225_ah.field_106133_i
		// @08: aconst_null
		// @09: putstatic java.lang.String[] game.C_100080_b.field_104433_e
		// @0C: aconst_null
		// @0D: putstatic java.lang.String[] game.C_100342_jg.field_102723_Tb
		// @10: iload_0
		// @11: bipush -118 (0x8A)
		// @13: if_icmplt @17
		// @16: return
		// @17: aconst_null
		// @18: putstatic java.lang.String[] game.C_100264_mg.field_106519_g
		// @1B: goto @3F
		// @1E: astore_1
		// @1F: aload_1
		// @20: new java.lang.StringBuilder
		// @23: dup
		// @24: invokespecial java.lang.StringBuilder.<init>()void
		// @27: getstatic java.lang.String[] game.C_100130_tf.field_104964_z
		// @2A: iconst_0
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
	
	public static void func_104955_a(byte arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100130_tf.field_104963_a
		// @04: aconst_null
		// @05: putstatic java.lang.String[] game.C_100130_tf.field_104959_d
		// @08: aconst_null
		// @09: putstatic int[] game.C_100130_tf.field_104960_e
		// @0C: aconst_null
		// @0D: putstatic game.C_100037_wb game.C_100130_tf.field_104961_b
		// @10: bipush 86 (0x56)
		// @12: bipush -50 (0xCE)
		// @14: iload_0
		// @15: isub
		// @16: bipush 53 (0x35)
		// @18: idiv
		// @19: idiv
		// @1A: istore_1
		// @1B: goto @40
		// @1E: astore_1
		// @1F: aload_1
		// @20: new java.lang.StringBuilder
		// @23: dup
		// @24: invokespecial java.lang.StringBuilder.<init>()void
		// @27: getstatic java.lang.String[] game.C_100130_tf.field_104964_z
		// @2A: bipush 6 (0x06)
		// @2C: aaload
		// @2D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @30: iload_0
		// @31: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @34: bipush 41 (0x29)
		// @36: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @39: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3F: athrow
		// @40: return
	}
	
	static final String[] func_104957_a(C_100112_r arg0, String arg1, byte arg2, int[] arg3)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #7
		// @05: aconst_null
		// @06: getstatic java.lang.String[] game.C_100264_mg.field_106527_h
		// @09: if_acmpeq @10
		// @0C: goto @18
		// @0F: athrow
		// @10: bipush 16 (0x10)
		// @12: anewarray java.lang.String
		// @15: putstatic java.lang.String[] game.C_100264_mg.field_106527_h
		// @18: aload_0
		// @19: aload_1
		// @1A: aload_3
		// @1B: getstatic java.lang.String[] game.C_100264_mg.field_106527_h
		// @1E: invokevirtual game.C_100112_r.func_101730_a(java.lang.String, int[], java.lang.String[])int
		// @21: istore #4
		// @23: goto @44
		// @26: astore #5
		// @28: getstatic java.lang.String[] game.C_100264_mg.field_106527_h
		// @2B: arraylength
		// @2C: sipush 1024 (0x0400)
		// @2F: if_icmplt @34
		// @32: aconst_null
		// @33: areturn
		// @34: getstatic java.lang.String[] game.C_100264_mg.field_106527_h
		// @37: arraylength
		// @38: ldc -365810751 (0xea322bc1)
		// @3A: ishl
		// @3B: anewarray java.lang.String
		// @3E: putstatic java.lang.String[] game.C_100264_mg.field_106527_h
		// @41: goto @18
		// @44: iload_2
		// @45: bipush 61 (0x3D)
		// @47: if_icmpge @58
		// @4A: aconst_null
		// @4B: checkcast game.C_100117_p
		// @4E: bipush 80 (0x50)
		// @50: invokestatic game.C_100130_tf.func_104952_a(game.C_100117_p, byte)game.C_100179_ch
		// @53: pop
		// @54: goto @58
		// @57: athrow
		// @58: iload #4
		// @5A: anewarray java.lang.String
		// @5D: astore #5
		// @5F: iconst_0
		// @60: istore #6
		// @62: iload #6
		// @64: iload #4
		// @66: if_icmpge @85
		// @69: aload #5
		// @6B: iload #7
		// @6D: ifne @87
		// @70: iload #6
		// @72: getstatic java.lang.String[] game.C_100264_mg.field_106527_h
		// @75: iload #6
		// @77: aaload
		// @78: aastore
		// @79: iinc #6 +1
		// @7C: iload #7
		// @7E: ifeq @62
		// @81: goto @85
		// @84: athrow
		// @85: aload #5
		// @87: areturn
		// @88: astore #4
		// @8A: aload #4
		// @8C: new java.lang.StringBuilder
		// @8F: dup
		// @90: invokespecial java.lang.StringBuilder.<init>()void
		// @93: getstatic java.lang.String[] game.C_100130_tf.field_104964_z
		// @96: iconst_5
		// @97: aaload
		// @98: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @9B: aload_0
		// @9C: ifnull @A8
		// @9F: getstatic java.lang.String[] game.C_100130_tf.field_104964_z
		// @A2: iconst_2
		// @A3: aaload
		// @A4: goto @AD
		// @A7: athrow
		// @A8: getstatic java.lang.String[] game.C_100130_tf.field_104964_z
		// @AB: iconst_1
		// @AC: aaload
		// @AD: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @B0: bipush 44 (0x2C)
		// @B2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B5: aload_1
		// @B6: ifnull @C2
		// @B9: getstatic java.lang.String[] game.C_100130_tf.field_104964_z
		// @BC: iconst_2
		// @BD: aaload
		// @BE: goto @C7
		// @C1: athrow
		// @C2: getstatic java.lang.String[] game.C_100130_tf.field_104964_z
		// @C5: iconst_1
		// @C6: aaload
		// @C7: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @CA: bipush 44 (0x2C)
		// @CC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @CF: iload_2
		// @D0: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @D3: bipush 44 (0x2C)
		// @D5: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D8: aload_3
		// @D9: ifnull @E5
		// @DC: getstatic java.lang.String[] game.C_100130_tf.field_104964_z
		// @DF: iconst_2
		// @E0: aaload
		// @E1: goto @EA
		// @E4: athrow
		// @E5: getstatic java.lang.String[] game.C_100130_tf.field_104964_z
		// @E8: iconst_1
		// @E9: aaload
		// @EA: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @ED: bipush 41 (0x29)
		// @EF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @F2: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @F5: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @F8: athrow
	}
	
	static
	{
		// @00: bipush 7 (0x07)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "MBM8,"
		// @09: invokestatic game.C_100130_tf.func_104956_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100130_tf.func_104954_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "WQ\u000f\u0015"
		// @14: invokestatic game.C_100130_tf.func_104956_z(java.lang.String)char[]
		// @17: invokestatic game.C_100130_tf.func_104954_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "B\nMWy"
		// @1F: invokestatic game.C_100130_tf.func_104956_z(java.lang.String)char[]
		// @22: invokestatic game.C_100130_tf.func_104954_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "MBM=,"
		// @2A: invokestatic game.C_100130_tf.func_104956_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100130_tf.func_104954_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "MBM\rkjP\u0011\u0010j^\u000cJ"
		// @35: invokestatic game.C_100130_tf.func_104956_z(java.lang.String)char[]
		// @38: invokestatic game.C_100130_tf.func_104954_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "MBM;,"
		// @40: invokestatic game.C_100130_tf.func_104956_z(java.lang.String)char[]
		// @43: invokestatic game.C_100130_tf.func_104954_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "MBM:,"
		// @4C: invokestatic game.C_100130_tf.func_104956_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100130_tf.func_104954_z(char[])java.lang.String
		// @52: aastore
		// @53: putstatic java.lang.String[] game.C_100130_tf.field_104964_z
		// @56: iconst_0
		// @57: putstatic int game.C_100130_tf.field_104958_f
		// @5A: new game.C_100037_wb
		// @5D: dup
		// @5E: bipush 80 (0x50)
		// @60: bipush 90 (0x5A)
		// @62: invokespecial game.C_100037_wb.<init>(int, int)void
		// @65: putstatic game.C_100037_wb game.C_100130_tf.field_104961_b
		// @68: ldc "jG\u0002\u0014iPJ\u0004"
		// @6A: invokestatic game.C_100130_tf.func_104956_z(java.lang.String)char[]
		// @6D: invokestatic game.C_100130_tf.func_104954_z(char[])java.lang.String
		// @70: putstatic java.lang.String game.C_100130_tf.field_104963_a
		// @73: bipush 7 (0x07)
		// @75: anewarray java.lang.String
		// @78: dup
		// @79: iconst_0
		// @7A: ldc "}a0-Mw}B"
		// @7C: invokestatic game.C_100130_tf.func_104956_z(java.lang.String)char[]
		// @7F: invokestatic game.C_100130_tf.func_104954_z(char[])java.lang.String
		// @82: aastore
		// @83: dup
		// @84: iconst_1
		// @85: ldc "kk0<Fl`B"
		// @87: invokestatic game.C_100130_tf.func_104956_z(java.lang.String)char[]
		// @8A: invokestatic game.C_100130_tf.func_104954_z(char[])java.lang.String
		// @8D: aastore
		// @8E: dup
		// @8F: iconst_2
		// @90: ldc "wk7Y]|pB"
		// @92: invokestatic game.C_100130_tf.func_104956_z(java.lang.String)char[]
		// @95: invokestatic game.C_100130_tf.func_104954_z(char[])java.lang.String
		// @98: aastore
		// @99: dup
		// @9A: iconst_3
		// @9B: ldc "pwC-LpwC8Hu\u000471AkaC0W\u0006"
		// @9D: invokestatic game.C_100130_tf.func_104956_z(java.lang.String)char[]
		// @A0: invokestatic game.C_100130_tf.func_104954_z(char[])java.lang.String
		// @A3: aastore
		// @A4: dup
		// @A5: iconst_4
		// @A6: ldc "p\u000471Mkw7X"
		// @A8: invokestatic game.C_100130_tf.func_104956_z(java.lang.String)char[]
		// @AB: invokestatic game.C_100130_tf.func_104954_z(char[])java.lang.String
		// @AE: aastore
		// @AF: dup
		// @B0: iconst_5
		// @B1: ldc "nl:F"
		// @B3: invokestatic game.C_100130_tf.func_104956_z(java.lang.String)char[]
		// @B6: invokestatic game.C_100130_tf.func_104954_z(char[])java.lang.String
		// @B9: aastore
		// @BA: dup
		// @BB: bipush 6 (0x06)
		// @BD: ldc "ppC0W\u0019e/5$mv6<%"
		// @BF: invokestatic game.C_100130_tf.func_104956_z(java.lang.String)char[]
		// @C2: invokestatic game.C_100130_tf.func_104954_z(char[])java.lang.String
		// @C5: aastore
		// @C6: putstatic java.lang.String[] game.C_100130_tf.field_104959_d
		// @C9: return
	}
	
	private static char[] func_104956_z(String arg0)
	{
		// @00: aload_0
		// @01: invokevirtual java.lang.String.toCharArray()char[]
		// @04: dup
		// @05: arraylength
		// @06: iconst_2
		// @07: if_icmpge @12
		// @0A: dup
		// @0B: iconst_0
		// @0C: dup2
		// @0D: caload
		// @0E: iconst_4
		// @0F: ixor
		// @10: i2c
		// @11: castore
		// @12: areturn
	}
	
	private static String func_104954_z(char[] arg0)
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
		// @10: tableswitch def: @44, for 0: @30, for 1: @35, for 2: @3A, for 3: @3F
		// @30: bipush 57 (0x39)
		// @32: goto @45
		// @35: bipush 36 (0x24)
		// @37: goto @45
		// @3A: bipush 99 (0x63)
		// @3C: goto @45
		// @3F: bipush 121 (0x79)
		// @41: goto @45
		// @44: iconst_4
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
