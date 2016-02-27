package game;

final class C_100143_bl
{
	static C_100333_ij field_105101_d;
	static int[] field_105103_b;
	static String field_105099_f;
	static int[] field_105102_e;
	static C_100202_qi field_105100_g;
	static C_100089_fa field_105104_c;
	static char[] field_105105_a;
	private static final String[] field_105106_z;
	
	static final C_100037_wb func_105092_a(C_100098_h arg0, String arg1, String arg2, int arg3)
	{
		// @00: iload_3
		// @01: sipush 1237 (0x04D5)
		// @04: if_icmpeq @10
		// @07: bipush 6 (0x06)
		// @09: invokestatic game.C_100143_bl.func_105095_a(int)void
		// @0C: goto @10
		// @0F: athrow
		// @10: aload_0
		// @11: iload_3
		// @12: sipush -11956 (0xD14C)
		// @15: iadd
		// @16: aload_2
		// @17: invokevirtual game.C_100098_h.func_104601_b(int, java.lang.String)int
		// @1A: istore #4
		// @1C: aload_0
		// @1D: aload_1
		// @1E: iload #4
		// @20: iconst_0
		// @21: invokevirtual game.C_100098_h.func_104600_a(java.lang.String, int, int)int
		// @24: istore #5
		// @26: iload #5
		// @28: iload #4
		// @2A: aload_0
		// @2B: iconst_m1
		// @2C: invokestatic game.C_100336_im.func_102505_a(int, int, game.C_100098_h, int)game.C_100037_wb
		// @2F: areturn
		// @30: astore #4
		// @32: aload #4
		// @34: new java.lang.StringBuilder
		// @37: dup
		// @38: invokespecial java.lang.StringBuilder.<init>()void
		// @3B: getstatic java.lang.String[] game.C_100143_bl.field_105106_z
		// @3E: iconst_2
		// @3F: aaload
		// @40: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @43: aload_0
		// @44: ifnull @50
		// @47: getstatic java.lang.String[] game.C_100143_bl.field_105106_z
		// @4A: iconst_4
		// @4B: aaload
		// @4C: goto @55
		// @4F: athrow
		// @50: getstatic java.lang.String[] game.C_100143_bl.field_105106_z
		// @53: iconst_3
		// @54: aaload
		// @55: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @58: bipush 44 (0x2C)
		// @5A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5D: aload_1
		// @5E: ifnull @6A
		// @61: getstatic java.lang.String[] game.C_100143_bl.field_105106_z
		// @64: iconst_4
		// @65: aaload
		// @66: goto @6F
		// @69: athrow
		// @6A: getstatic java.lang.String[] game.C_100143_bl.field_105106_z
		// @6D: iconst_3
		// @6E: aaload
		// @6F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @72: bipush 44 (0x2C)
		// @74: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @77: aload_2
		// @78: ifnull @84
		// @7B: getstatic java.lang.String[] game.C_100143_bl.field_105106_z
		// @7E: iconst_4
		// @7F: aaload
		// @80: goto @89
		// @83: athrow
		// @84: getstatic java.lang.String[] game.C_100143_bl.field_105106_z
		// @87: iconst_3
		// @88: aaload
		// @89: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @8C: bipush 44 (0x2C)
		// @8E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @91: iload_3
		// @92: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @95: bipush 41 (0x29)
		// @97: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @9D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @A0: athrow
	}
	
	static final int func_105094_a(C_100154_sl arg0, C_100154_sl arg1, int arg2)
	{
		// @00: iload_2
		// @01: ifeq @07
		// @04: bipush -114 (0x8E)
		// @06: ireturn
		// @07: aload_1
		// @08: aconst_null
		// @09: iconst_0
		// @0A: aload_0
		// @0B: iconst_0
		// @0C: iconst_0
		// @0D: bipush 118 (0x76)
		// @0F: invokestatic game.C_100295_kh.func_105279_a(game.C_100154_sl, java.lang.String, boolean, game.C_100154_sl, int, int, int)int
		// @12: ireturn
		// @13: astore_3
		// @14: aload_3
		// @15: new java.lang.StringBuilder
		// @18: dup
		// @19: invokespecial java.lang.StringBuilder.<init>()void
		// @1C: getstatic java.lang.String[] game.C_100143_bl.field_105106_z
		// @1F: iconst_5
		// @20: aaload
		// @21: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @24: aload_0
		// @25: ifnull @31
		// @28: getstatic java.lang.String[] game.C_100143_bl.field_105106_z
		// @2B: iconst_4
		// @2C: aaload
		// @2D: goto @36
		// @30: athrow
		// @31: getstatic java.lang.String[] game.C_100143_bl.field_105106_z
		// @34: iconst_3
		// @35: aaload
		// @36: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @39: bipush 44 (0x2C)
		// @3B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3E: aload_1
		// @3F: ifnull @4B
		// @42: getstatic java.lang.String[] game.C_100143_bl.field_105106_z
		// @45: iconst_4
		// @46: aaload
		// @47: goto @50
		// @4A: athrow
		// @4B: getstatic java.lang.String[] game.C_100143_bl.field_105106_z
		// @4E: iconst_3
		// @4F: aaload
		// @50: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @53: bipush 44 (0x2C)
		// @55: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @58: iload_2
		// @59: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5C: bipush 41 (0x29)
		// @5E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @61: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @64: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @67: athrow
	}
	
	public static void func_105095_a(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic char[] game.C_100143_bl.field_105105_a
		// @04: aconst_null
		// @05: putstatic java.lang.String game.C_100143_bl.field_105099_f
		// @08: aconst_null
		// @09: putstatic game.C_100333_ij game.C_100143_bl.field_105101_d
		// @0C: aconst_null
		// @0D: putstatic game.C_100202_qi game.C_100143_bl.field_105100_g
		// @10: aconst_null
		// @11: putstatic int[] game.C_100143_bl.field_105102_e
		// @14: aconst_null
		// @15: putstatic game.C_100089_fa game.C_100143_bl.field_105104_c
		// @18: iload_0
		// @19: sipush 255 (0x00FF)
		// @1C: if_icmpeq @2A
		// @1F: aconst_null
		// @20: checkcast char[]
		// @23: putstatic char[] game.C_100143_bl.field_105105_a
		// @26: goto @2A
		// @29: athrow
		// @2A: aconst_null
		// @2B: putstatic int[] game.C_100143_bl.field_105103_b
		// @2E: goto @53
		// @31: astore_1
		// @32: aload_1
		// @33: new java.lang.StringBuilder
		// @36: dup
		// @37: invokespecial java.lang.StringBuilder.<init>()void
		// @3A: getstatic java.lang.String[] game.C_100143_bl.field_105106_z
		// @3D: bipush 6 (0x06)
		// @3F: aaload
		// @40: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @43: iload_0
		// @44: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @47: bipush 41 (0x29)
		// @49: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @52: athrow
		// @53: return
	}
	
	static final C_100179_ch func_105098_a(int arg0, int arg1, boolean arg2)
	{
		// @00: getstatic game.C_100214_al[] game.C_100330_ig.field_107287_b
		// @03: ifnull @AE
		// @06: aconst_null
		// @07: getstatic game.C_100214_al[] game.C_100330_ig.field_107287_b
		// @0A: iload_1
		// @0B: aaload
		// @0C: if_acmpne @17
		// @0F: goto @13
		// @12: athrow
		// @13: goto @AE
		// @16: athrow
		// @17: iconst_0
		// @18: iload_0
		// @19: iconst_m1
		// @1A: ixor
		// @1B: if_icmpne @2D
		// @1E: getstatic int[] game.C_100169_co.field_105526_b
		// @21: iload_1
		// @22: iaload
		// @23: getstatic game.C_100214_al[] game.C_100330_ig.field_107287_b
		// @26: iload_1
		// @27: aaload
		// @28: iconst_0
		// @29: invokestatic game.C_100180_ce.func_104800_a(int, game.C_100214_al, int)game.C_100179_ch
		// @2C: areturn
		// @2D: iconst_0
		// @2E: istore_3
		// @2F: getstatic game.C_100265_mh game.C_100127_tl.field_104948_b
		// @32: ifnonnull @58
		// @35: aconst_null
		// @36: getstatic game.C_100265_mh game.C_100021_wn.field_103868_f
		// @39: if_acmpne @44
		// @3C: goto @40
		// @3F: athrow
		// @40: goto @66
		// @43: athrow
		// @44: getstatic game.C_100265_mh game.C_100021_wn.field_103868_f
		// @47: iload_0
		// @48: bipush -69 (0xBB)
		// @4A: invokevirtual game.C_100265_mh.func_106557_a(int, byte)int
		// @4D: sipush -320 (0xFEC0)
		// @50: iadd
		// @51: istore_3
		// @52: getstatic int game.SteelSentinels.field_105275_O
		// @55: ifeq @66
		// @58: getstatic game.C_100265_mh game.C_100127_tl.field_104948_b
		// @5B: iload_0
		// @5C: bipush -69 (0xBB)
		// @5E: invokevirtual game.C_100265_mh.func_106557_a(int, byte)int
		// @61: sipush -320 (0xFEC0)
		// @64: iadd
		// @65: istore_3
		// @66: bipush 64 (0x40)
		// @68: iload_3
		// @69: invokestatic java.lang.Math.abs(int)int
		// @6C: sipush 192 (0x00C0)
		// @6F: imul
		// @70: sipush 1280 (0x0500)
		// @73: idiv
		// @74: ineg
		// @75: sipush 256 (0x0100)
		// @78: iadd
		// @79: invokestatic java.lang.Math.max(int, int)int
		// @7C: istore #4
		// @7E: iload #4
		// @80: getstatic int[] game.C_100169_co.field_105526_b
		// @83: iload_1
		// @84: iaload
		// @85: imul
		// @86: sipush 256 (0x0100)
		// @89: idiv
		// @8A: istore #4
		// @8C: iconst_0
		// @8D: sipush 256 (0x0100)
		// @90: iload_3
		// @91: bipush 10 (0x0A)
		// @93: idiv
		// @94: sipush 128 (0x0080)
		// @97: iadd
		// @98: invokestatic java.lang.Math.min(int, int)int
		// @9B: invokestatic java.lang.Math.max(int, int)int
		// @9E: istore #5
		// @A0: iload #4
		// @A2: iconst_1
		// @A3: getstatic game.C_100214_al[] game.C_100330_ig.field_107287_b
		// @A6: iload_1
		// @A7: aaload
		// @A8: iload #5
		// @AA: invokestatic game.C_100142_bk.func_105081_a(int, boolean, game.C_100214_al, int)game.C_100179_ch
		// @AD: areturn
		// @AE: iload_2
		// @AF: iconst_1
		// @B0: if_icmpeq @BE
		// @B3: aconst_null
		// @B4: checkcast int[]
		// @B7: putstatic int[] game.C_100143_bl.field_105103_b
		// @BA: goto @BE
		// @BD: athrow
		// @BE: aconst_null
		// @BF: areturn
		// @C0: astore_3
		// @C1: aload_3
		// @C2: new java.lang.StringBuilder
		// @C5: dup
		// @C6: invokespecial java.lang.StringBuilder.<init>()void
		// @C9: getstatic java.lang.String[] game.C_100143_bl.field_105106_z
		// @CC: iconst_0
		// @CD: aaload
		// @CE: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @D1: iload_0
		// @D2: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @D5: bipush 44 (0x2C)
		// @D7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @DA: iload_1
		// @DB: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @DE: bipush 44 (0x2C)
		// @E0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @E3: iload_2
		// @E4: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @E7: bipush 41 (0x29)
		// @E9: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @EC: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @EF: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @F2: athrow
	}
	
	static final void func_105093_a(boolean arg0, byte arg1)
	{
		// @00: iload_1
		// @01: iconst_4
		// @02: if_icmpge @10
		// @05: aconst_null
		// @06: checkcast char[]
		// @09: putstatic char[] game.C_100143_bl.field_105105_a
		// @0C: goto @10
		// @0F: athrow
		// @10: iconst_0
		// @11: iload_0
		// @12: bipush -100 (0x9C)
		// @14: invokestatic game.C_100236_on.func_100894_a(boolean, boolean, byte)void
		// @17: goto @44
		// @1A: astore_2
		// @1B: aload_2
		// @1C: new java.lang.StringBuilder
		// @1F: dup
		// @20: invokespecial java.lang.StringBuilder.<init>()void
		// @23: getstatic java.lang.String[] game.C_100143_bl.field_105106_z
		// @26: iconst_1
		// @27: aaload
		// @28: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2B: iload_0
		// @2C: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @2F: bipush 44 (0x2C)
		// @31: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @34: iload_1
		// @35: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @38: bipush 41 (0x29)
		// @3A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @40: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @43: athrow
		// @44: return
	}
	
	static
	{
		// @00: bipush 7 (0x07)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "u19i]"
		// @09: invokestatic game.C_100143_bl.func_105097_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100143_bl.func_105096_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "u19h]"
		// @14: invokestatic game.C_100143_bl.func_105097_z(java.lang.String)char[]
		// @17: invokestatic game.C_100143_bl.func_105096_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "u19k]"
		// @1F: invokestatic game.C_100143_bl.func_105097_z(java.lang.String)char[]
		// @22: invokestatic game.C_100143_bl.func_105096_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "y({F"
		// @2A: invokestatic game.C_100143_bl.func_105097_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100143_bl.func_105096_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "ls9\u0004\u0008"
		// @35: invokestatic game.C_100143_bl.func_105097_z(java.lang.String)char[]
		// @38: invokestatic game.C_100143_bl.func_105096_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "u19o]"
		// @40: invokestatic game.C_100143_bl.func_105097_z(java.lang.String)char[]
		// @43: invokestatic game.C_100143_bl.func_105096_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "u19n]"
		// @4C: invokestatic game.C_100143_bl.func_105097_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100143_bl.func_105096_z(char[])java.lang.String
		// @52: aastore
		// @53: putstatic java.lang.String[] game.C_100143_bl.field_105106_z
		// @56: new game.C_100333_ij
		// @59: dup
		// @5A: iconst_1
		// @5B: invokespecial game.C_100333_ij.<init>(int)void
		// @5E: putstatic game.C_100333_ij game.C_100143_bl.field_105101_d
		// @61: sipush 129 (0x0081)
		// @64: newarray int[]
		// @66: putstatic int[] game.C_100143_bl.field_105103_b
		// @69: getstatic int[] game.C_100143_bl.field_105103_b
		// @6C: iconst_0
		// @6D: iconst_0
		// @6E: iastore
		// @6F: iconst_0
		// @70: istore_0
		// @71: iload_0
		// @72: bipush 64 (0x40)
		// @74: if_icmpge @A4
		// @77: getstatic int[] game.C_100143_bl.field_105103_b
		// @7A: iload_0
		// @7B: iconst_1
		// @7C: iadd
		// @7D: sipush 255 (0x00FF)
		// @80: iload_0
		// @81: imul
		// @82: bipush 64 (0x40)
		// @84: idiv
		// @85: sipush 257 (0x0101)
		// @88: imul
		// @89: iastore
		// @8A: getstatic int[] game.C_100143_bl.field_105103_b
		// @8D: bipush 65 (0x41)
		// @8F: iload_0
		// @90: iadd
		// @91: iload_0
		// @92: sipush 255 (0x00FF)
		// @95: imul
		// @96: bipush 64 (0x40)
		// @98: idiv
		// @99: ldc 65793 (0x10101)
		// @9B: imul
		// @9C: iastore
		// @9D: iinc #0 +1
		// @A0: goto @71
		// @A3: athrow
		// @A4: ldc "G1rK\u0006r}eO\u0018x+r\nI2m)\n\u0013e2z\n\u000cx(e\n\u0013e4rD\u001171~Y\u00017;~X\u0006cs"
		// @A6: invokestatic game.C_100143_bl.func_105097_z(java.lang.String)char[]
		// @A9: invokestatic game.C_100143_bl.func_105096_z(char[])java.lang.String
		// @AC: putstatic java.lang.String game.C_100143_bl.field_105099_f
		// @AF: new game.C_100202_qi
		// @B2: dup
		// @B3: invokespecial game.C_100202_qi.<init>()void
		// @B6: putstatic game.C_100202_qi game.C_100143_bl.field_105100_g
		// @B9: sipush 128 (0x0080)
		// @BC: newarray char[]
		// @BE: putstatic char[] game.C_100143_bl.field_105105_a
		// @C1: return
	}
	
	private static char[] func_105097_z(String arg0)
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
		// @0E: bipush 117 (0x75)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_105096_z(char[] arg0)
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
		// @30: bipush 23 (0x17)
		// @32: goto @46
		// @35: bipush 93 (0x5D)
		// @37: goto @46
		// @3A: bipush 23 (0x17)
		// @3C: goto @46
		// @3F: bipush 42 (0x2A)
		// @41: goto @46
		// @44: bipush 117 (0x75)
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
