package game;

final class C_100156_sk extends C_100338_jc
{
	static C_100268_mk field_105392_n;
	private int field_105391_p;
	private long field_105385_v;
	private long field_105393_o;
	private int field_105386_u;
	static C_100115_ej field_105389_r;
	static boolean field_105384_w;
	private long field_105390_q;
	static String field_105388_s;
	private long[] field_105387_t;
	private static final String[] field_105394_z;
	
	final int func_105361_a(int arg0, long arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #6
		// @05: iconst_1
		// @06: bipush -18 (0xEE)
		// @08: iload_1
		// @09: isub
		// @0A: bipush 53 (0x35)
		// @0C: idiv
		// @0D: irem
		// @0E: istore #4
		// @10: aload_0
		// @11: getfield long game.C_100156_sk.field_105390_q
		// @14: aload_0
		// @15: getfield long game.C_100156_sk.field_105385_v
		// @18: lcmp
		// @19: ifle @4E
		// @1C: aload_0
		// @1D: dup
		// @1E: getfield long game.C_100156_sk.field_105393_o
		// @21: aload_0
		// @22: getfield long game.C_100156_sk.field_105385_v
		// @25: lneg
		// @26: aload_0
		// @27: getfield long game.C_100156_sk.field_105390_q
		// @2A: ladd
		// @2B: ladd
		// @2C: putfield long game.C_100156_sk.field_105393_o
		// @2F: aload_0
		// @30: dup
		// @31: getfield long game.C_100156_sk.field_105385_v
		// @34: aload_0
		// @35: getfield long game.C_100156_sk.field_105385_v
		// @38: lneg
		// @39: aload_0
		// @3A: getfield long game.C_100156_sk.field_105390_q
		// @3D: ladd
		// @3E: ladd
		// @3F: putfield long game.C_100156_sk.field_105385_v
		// @42: aload_0
		// @43: dup
		// @44: getfield long game.C_100156_sk.field_105390_q
		// @47: lload_2
		// @48: ladd
		// @49: putfield long game.C_100156_sk.field_105390_q
		// @4C: iconst_1
		// @4D: ireturn
		// @4E: iconst_0
		// @4F: istore #5
		// @51: iinc #5 +1
		// @54: aload_0
		// @55: dup
		// @56: getfield long game.C_100156_sk.field_105390_q
		// @59: lload_2
		// @5A: ladd
		// @5B: putfield long game.C_100156_sk.field_105390_q
		// @5E: iload #5
		// @60: iconst_m1
		// @61: ixor
		// @62: bipush -11 (0xF5)
		// @64: if_icmple @7B
		// @67: aload_0
		// @68: getfield long game.C_100156_sk.field_105390_q
		// @6B: ldc2_w -1
		// @6E: lxor
		// @6F: aload_0
		// @70: getfield long game.C_100156_sk.field_105385_v
		// @73: ldc2_w -1
		// @76: lxor
		// @77: lcmp
		// @78: ifgt @51
		// @7B: aload_0
		// @7C: getfield long game.C_100156_sk.field_105390_q
		// @7F: ldc2_w -1
		// @82: lxor
		// @83: aload_0
		// @84: getfield long game.C_100156_sk.field_105385_v
		// @87: ldc2_w -1
		// @8A: lxor
		// @8B: lcmp
		// @8C: iload #6
		// @8E: ifne @62
		// @91: ifgt @97
		// @94: goto @9F
		// @97: aload_0
		// @98: aload_0
		// @99: getfield long game.C_100156_sk.field_105385_v
		// @9C: putfield long game.C_100156_sk.field_105390_q
		// @9F: iload #5
		// @A1: ireturn
		// @A2: astore #4
		// @A4: aload #4
		// @A6: new java.lang.StringBuilder
		// @A9: dup
		// @AA: invokespecial java.lang.StringBuilder.<init>()void
		// @AD: getstatic java.lang.String[] game.C_100156_sk.field_105394_z
		// @B0: iconst_1
		// @B1: aaload
		// @B2: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @B5: iload_1
		// @B6: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @B9: bipush 44 (0x2C)
		// @BB: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @BE: lload_2
		// @BF: invokevirtual java.lang.StringBuilder.append(long)java.lang.StringBuilder
		// @C2: bipush 41 (0x29)
		// @C4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C7: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @CA: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @CD: athrow
	}
	
	private final long func_105382_b(boolean arg0)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #9
		// @05: iload_1
		// @06: ifeq @13
		// @09: aload_0
		// @0A: bipush -101 (0x9B)
		// @0C: putfield int game.C_100156_sk.field_105386_u
		// @0F: goto @13
		// @12: athrow
		// @13: invokestatic java.lang.System.nanoTime()long
		// @16: lstore_2
		// @17: aload_0
		// @18: getfield long game.C_100156_sk.field_105393_o
		// @1B: lneg
		// @1C: lload_2
		// @1D: ladd
		// @1E: lstore #4
		// @20: aload_0
		// @21: lload_2
		// @22: putfield long game.C_100156_sk.field_105393_o
		// @25: lload #4
		// @27: ldc2_w -5000000000
		// @2A: lcmp
		// @2B: ifle @6D
		// @2E: lload #4
		// @30: ldc2_w 5000000000
		// @33: lcmp
		// @34: iflt @3F
		// @37: goto @3B
		// @3A: athrow
		// @3B: goto @6D
		// @3E: athrow
		// @3F: aload_0
		// @40: getfield long[] game.C_100156_sk.field_105387_t
		// @43: aload_0
		// @44: getfield int game.C_100156_sk.field_105386_u
		// @47: lload #4
		// @49: lastore
		// @4A: aload_0
		// @4B: iconst_1
		// @4C: aload_0
		// @4D: getfield int game.C_100156_sk.field_105386_u
		// @50: iadd
		// @51: bipush 10 (0x0A)
		// @53: irem
		// @54: putfield int game.C_100156_sk.field_105386_u
		// @57: iconst_1
		// @58: aload_0
		// @59: getfield int game.C_100156_sk.field_105391_p
		// @5C: if_icmpgt @63
		// @5F: goto @6D
		// @62: athrow
		// @63: aload_0
		// @64: dup
		// @65: getfield int game.C_100156_sk.field_105391_p
		// @68: iconst_1
		// @69: iadd
		// @6A: putfield int game.C_100156_sk.field_105391_p
		// @6D: lconst_0
		// @6E: lstore #6
		// @70: iconst_1
		// @71: istore #8
		// @73: iload #8
		// @75: iconst_m1
		// @76: ixor
		// @77: aload_0
		// @78: getfield int game.C_100156_sk.field_105391_p
		// @7B: iconst_m1
		// @7C: ixor
		// @7D: if_icmplt @A5
		// @80: lload #6
		// @82: aload_0
		// @83: getfield long[] game.C_100156_sk.field_105387_t
		// @86: aload_0
		// @87: getfield int game.C_100156_sk.field_105386_u
		// @8A: iload #8
		// @8C: ineg
		// @8D: bipush 10 (0x0A)
		// @8F: iadd
		// @90: iadd
		// @91: bipush 10 (0x0A)
		// @93: irem
		// @94: laload
		// @95: ladd
		// @96: iload #9
		// @98: ifne @AD
		// @9B: lstore #6
		// @9D: iinc #8 +1
		// @A0: iload #9
		// @A2: ifeq @73
		// @A5: lload #6
		// @A7: aload_0
		// @A8: getfield int game.C_100156_sk.field_105391_p
		// @AB: i2l
		// @AC: ldiv
		// @AD: lreturn
		// @AE: astore_2
		// @AF: aload_2
		// @B0: new java.lang.StringBuilder
		// @B3: dup
		// @B4: invokespecial java.lang.StringBuilder.<init>()void
		// @B7: getstatic java.lang.String[] game.C_100156_sk.field_105394_z
		// @BA: bipush 8 (0x08)
		// @BC: aaload
		// @BD: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @C0: iload_1
		// @C1: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @C4: bipush 41 (0x29)
		// @C6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C9: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @CC: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @CF: athrow
	}
	
	static final void func_105381_a(boolean arg0)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore_2
		// @04: iconst_1
		// @05: invokestatic game.C_100346_ja.func_103474_a(boolean)boolean
		// @08: ifeq @0F
		// @0B: goto @43
		// @0E: athrow
		// @0F: aconst_null
		// @10: getstatic game.C_100009_fg game.C_100146_bf.field_105128_n
		// @13: if_acmpeq @42
		// @16: getstatic game.C_100009_fg game.C_100146_bf.field_105128_n
		// @19: getfield boolean game.C_100009_fg.field_103657_b
		// @1C: ifeq @42
		// @1F: goto @23
		// @22: athrow
		// @23: bipush 12 (0x0C)
		// @25: invokestatic game.C_100123_uc.func_104914_b(int)void
		// @28: getstatic game.C_100029_gn game.C_100013_fn.field_103738_g
		// @2B: new game.C_100046_vk
		// @2E: dup
		// @2F: getstatic game.C_100029_gn game.C_100013_fn.field_103738_g
		// @32: getstatic game.C_100186_rl game.C_100306_kn.field_107142_i
		// @35: invokespecial game.C_100046_vk.<init>(game.C_100029_gn, game.C_100186_rl)void
		// @38: sipush 2839 (0x0B17)
		// @3B: invokevirtual game.C_100029_gn.func_103359_a(game.C_100336_im, int)void
		// @3E: goto @42
		// @41: athrow
		// @42: return
		// @43: getstatic game.C_100029_gn game.C_100013_fn.field_103738_g
		// @46: getstatic int game.C_100264_mg.field_106525_j
		// @49: iload_0
		// @4A: getstatic int game.C_100023_hg.field_103922_d
		// @4D: sipush -2408 (0xF698)
		// @50: invokevirtual game.C_100029_gn.func_102529_a(int, boolean, int, int)boolean
		// @53: pop
		// @54: getstatic game.C_100029_gn game.C_100013_fn.field_103738_g
		// @57: sipush -708 (0xFD3C)
		// @5A: invokevirtual game.C_100029_gn.func_103358_m(int)void
		// @5D: bipush 64 (0x40)
		// @5F: invokestatic game.C_100189_ri.func_105748_a(int)boolean
		// @62: ifeq @7F
		// @65: getstatic game.C_100029_gn game.C_100013_fn.field_103738_g
		// @68: getstatic int game.C_100293_kj.field_106890_c
		// @6B: getstatic char game.C_100012_fh.field_100517_Q
		// @6E: iconst_1
		// @6F: invokevirtual game.C_100029_gn.func_102511_a(int, char, boolean)boolean
		// @72: pop
		// @73: iload_2
		// @74: ifne @A3
		// @77: iload_2
		// @78: ifeq @5D
		// @7B: goto @7F
		// @7E: athrow
		// @7F: goto @A3
		// @82: astore_1
		// @83: aload_1
		// @84: new java.lang.StringBuilder
		// @87: dup
		// @88: invokespecial java.lang.StringBuilder.<init>()void
		// @8B: getstatic java.lang.String[] game.C_100156_sk.field_105394_z
		// @8E: iconst_0
		// @8F: aaload
		// @90: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @93: iload_0
		// @94: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @97: bipush 41 (0x29)
		// @99: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @9F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @A2: athrow
		// @A3: return
	}
	
	static final C_100321_hi func_105377_a(byte arg0, String arg1)
	{
		// @00: iload_0
		// @01: bipush 44 (0x2C)
		// @03: if_icmpeq @1C
		// @06: aconst_null
		// @07: checkcast game.C_100098_h
		// @0A: bipush 59 (0x3B)
		// @0C: aconst_null
		// @0D: checkcast java.lang.String
		// @10: aconst_null
		// @11: checkcast java.lang.String
		// @14: invokestatic game.C_100156_sk.func_105378_a(game.C_100098_h, byte, java.lang.String, java.lang.String)game.C_100037_wb[]
		// @17: pop
		// @18: goto @1C
		// @1B: athrow
		// @1C: new game.C_100321_hi
		// @1F: dup
		// @20: aload_1
		// @21: invokespecial game.C_100321_hi.<init>(java.lang.String)void
		// @24: areturn
		// @25: astore_2
		// @26: aload_2
		// @27: new java.lang.StringBuilder
		// @2A: dup
		// @2B: invokespecial java.lang.StringBuilder.<init>()void
		// @2E: getstatic java.lang.String[] game.C_100156_sk.field_105394_z
		// @31: bipush 10 (0x0A)
		// @33: aaload
		// @34: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @37: iload_0
		// @38: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3B: bipush 44 (0x2C)
		// @3D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @40: aload_1
		// @41: ifnull @4E
		// @44: getstatic java.lang.String[] game.C_100156_sk.field_105394_z
		// @47: bipush 6 (0x06)
		// @49: aaload
		// @4A: goto @54
		// @4D: athrow
		// @4E: getstatic java.lang.String[] game.C_100156_sk.field_105394_z
		// @51: bipush 7 (0x07)
		// @53: aaload
		// @54: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @57: bipush 41 (0x29)
		// @59: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @5F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @62: athrow
	}
	
	public static void func_105383_d(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic game.C_100268_mk game.C_100156_sk.field_105392_n
		// @04: aconst_null
		// @05: putstatic java.lang.String game.C_100156_sk.field_105388_s
		// @08: aconst_null
		// @09: putstatic game.C_100115_ej game.C_100156_sk.field_105389_r
		// @0C: iload_0
		// @0D: ifeq @17
		// @10: aconst_null
		// @11: checkcast game.C_100268_mk
		// @14: putstatic game.C_100268_mk game.C_100156_sk.field_105392_n
		// @17: goto @3B
		// @1A: astore_1
		// @1B: aload_1
		// @1C: new java.lang.StringBuilder
		// @1F: dup
		// @20: invokespecial java.lang.StringBuilder.<init>()void
		// @23: getstatic java.lang.String[] game.C_100156_sk.field_105394_z
		// @26: iconst_3
		// @27: aaload
		// @28: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2B: iload_0
		// @2C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2F: bipush 41 (0x29)
		// @31: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @34: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @37: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3A: athrow
		// @3B: return
	}
	
	final void func_105356_c(int arg0)
	{
		// @00: aload_0
		// @01: lconst_0
		// @02: putfield long game.C_100156_sk.field_105393_o
		// @05: iload_1
		// @06: sipush 9873 (0x2691)
		// @09: if_icmpeq @17
		// @0C: aconst_null
		// @0D: checkcast java.lang.String
		// @10: putstatic java.lang.String game.C_100156_sk.field_105388_s
		// @13: goto @17
		// @16: athrow
		// @17: aload_0
		// @18: getfield long game.C_100156_sk.field_105390_q
		// @1B: ldc2_w -1
		// @1E: lxor
		// @1F: aload_0
		// @20: getfield long game.C_100156_sk.field_105385_v
		// @23: ldc2_w -1
		// @26: lxor
		// @27: lcmp
		// @28: iflt @2F
		// @2B: goto @42
		// @2E: athrow
		// @2F: aload_0
		// @30: dup
		// @31: getfield long game.C_100156_sk.field_105385_v
		// @34: aload_0
		// @35: getfield long game.C_100156_sk.field_105385_v
		// @38: lneg
		// @39: aload_0
		// @3A: getfield long game.C_100156_sk.field_105390_q
		// @3D: ladd
		// @3E: ladd
		// @3F: putfield long game.C_100156_sk.field_105385_v
		// @42: goto @66
		// @45: astore_2
		// @46: aload_2
		// @47: new java.lang.StringBuilder
		// @4A: dup
		// @4B: invokespecial java.lang.StringBuilder.<init>()void
		// @4E: getstatic java.lang.String[] game.C_100156_sk.field_105394_z
		// @51: iconst_2
		// @52: aaload
		// @53: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @56: iload_1
		// @57: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5A: bipush 41 (0x29)
		// @5C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @62: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @65: athrow
		// @66: return
	}
	
	static final C_100037_wb[] func_105378_a(C_100098_h arg0, byte arg1, String arg2, String arg3)
	{
		// @00: bipush -61 (0xC3)
		// @02: bipush -33 (0xDF)
		// @04: iload_1
		// @05: isub
		// @06: bipush 42 (0x2A)
		// @08: idiv
		// @09: irem
		// @0A: istore #5
		// @0C: aload_0
		// @0D: aload_3
		// @0E: aload_2
		// @0F: bipush -89 (0xA7)
		// @11: invokestatic game.C_100163_sf.func_105433_a(game.C_100098_h, java.lang.String, java.lang.String, byte)game.C_100037_wb[]
		// @14: astore #4
		// @16: aload #4
		// @18: iconst_3
		// @19: aaload
		// @1A: aload #4
		// @1C: iconst_3
		// @1D: aaload
		// @1E: getfield int game.C_100037_wb.field_102337_u
		// @21: putfield int game.C_100037_wb.field_102340_z
		// @24: aload #4
		// @26: iconst_1
		// @27: aaload
		// @28: aload #4
		// @2A: iconst_1
		// @2B: aaload
		// @2C: getfield int game.C_100037_wb.field_102339_s
		// @2F: putfield int game.C_100037_wb.field_102341_y
		// @32: aload #4
		// @34: iconst_5
		// @35: aaload
		// @36: aload #4
		// @38: iconst_5
		// @39: aaload
		// @3A: getfield int game.C_100037_wb.field_102337_u
		// @3D: putfield int game.C_100037_wb.field_102340_z
		// @40: aload #4
		// @42: bipush 7 (0x07)
		// @44: aaload
		// @45: aload #4
		// @47: bipush 7 (0x07)
		// @49: aaload
		// @4A: getfield int game.C_100037_wb.field_102339_s
		// @4D: putfield int game.C_100037_wb.field_102341_y
		// @50: aload #4
		// @52: areturn
		// @53: astore #4
		// @55: aload #4
		// @57: new java.lang.StringBuilder
		// @5A: dup
		// @5B: invokespecial java.lang.StringBuilder.<init>()void
		// @5E: getstatic java.lang.String[] game.C_100156_sk.field_105394_z
		// @61: iconst_5
		// @62: aaload
		// @63: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @66: aload_0
		// @67: ifnull @74
		// @6A: getstatic java.lang.String[] game.C_100156_sk.field_105394_z
		// @6D: bipush 6 (0x06)
		// @6F: aaload
		// @70: goto @7A
		// @73: athrow
		// @74: getstatic java.lang.String[] game.C_100156_sk.field_105394_z
		// @77: bipush 7 (0x07)
		// @79: aaload
		// @7A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @7D: bipush 44 (0x2C)
		// @7F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @82: iload_1
		// @83: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @86: bipush 44 (0x2C)
		// @88: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8B: aload_2
		// @8C: ifnull @99
		// @8F: getstatic java.lang.String[] game.C_100156_sk.field_105394_z
		// @92: bipush 6 (0x06)
		// @94: aaload
		// @95: goto @9F
		// @98: athrow
		// @99: getstatic java.lang.String[] game.C_100156_sk.field_105394_z
		// @9C: bipush 7 (0x07)
		// @9E: aaload
		// @9F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @A2: bipush 44 (0x2C)
		// @A4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A7: aload_3
		// @A8: ifnull @B5
		// @AB: getstatic java.lang.String[] game.C_100156_sk.field_105394_z
		// @AE: bipush 6 (0x06)
		// @B0: aaload
		// @B1: goto @BB
		// @B4: athrow
		// @B5: getstatic java.lang.String[] game.C_100156_sk.field_105394_z
		// @B8: bipush 7 (0x07)
		// @BA: aaload
		// @BB: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @BE: bipush 41 (0x29)
		// @C0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C3: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @C6: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @C9: athrow
	}
	
	final long func_105357_a(byte arg0)
	{
		// @00: aload_0
		// @01: dup
		// @02: getfield long game.C_100156_sk.field_105385_v
		// @05: aload_0
		// @06: iconst_0
		// @07: invokespecial game.C_100156_sk.func_105382_b(boolean)long
		// @0A: ladd
		// @0B: putfield long game.C_100156_sk.field_105385_v
		// @0E: aload_0
		// @0F: getfield long game.C_100156_sk.field_105385_v
		// @12: ldc2_w -1
		// @15: lxor
		// @16: aload_0
		// @17: getfield long game.C_100156_sk.field_105390_q
		// @1A: ldc2_w -1
		// @1D: lxor
		// @1E: lcmp
		// @1F: ifle @31
		// @22: aload_0
		// @23: getfield long game.C_100156_sk.field_105385_v
		// @26: lneg
		// @27: aload_0
		// @28: getfield long game.C_100156_sk.field_105390_q
		// @2B: ladd
		// @2C: ldc2_w 1000000
		// @2F: ldiv
		// @30: lreturn
		// @31: iload_1
		// @32: bipush -23 (0xE9)
		// @34: if_icmpeq @45
		// @37: aload_0
		// @38: bipush 95 (0x5F)
		// @3A: ldc2_w 50
		// @3D: invokevirtual game.C_100156_sk.func_105361_a(int, long)int
		// @40: pop
		// @41: goto @45
		// @44: athrow
		// @45: lconst_0
		// @46: lreturn
		// @47: astore_2
		// @48: aload_2
		// @49: new java.lang.StringBuilder
		// @4C: dup
		// @4D: invokespecial java.lang.StringBuilder.<init>()void
		// @50: getstatic java.lang.String[] game.C_100156_sk.field_105394_z
		// @53: iconst_4
		// @54: aaload
		// @55: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @58: iload_1
		// @59: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5C: bipush 41 (0x29)
		// @5E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @61: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @64: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @67: athrow
	}
	
	C_100156_sk()
	{
		// @00: aload_0
		// @01: invokespecial game.C_100338_jc.<init>()void
		// @04: aload_0
		// @05: lconst_0
		// @06: putfield long game.C_100156_sk.field_105393_o
		// @09: aload_0
		// @0A: lconst_0
		// @0B: putfield long game.C_100156_sk.field_105385_v
		// @0E: aload_0
		// @0F: iconst_0
		// @10: putfield int game.C_100156_sk.field_105386_u
		// @13: aload_0
		// @14: iconst_1
		// @15: putfield int game.C_100156_sk.field_105391_p
		// @18: aload_0
		// @19: lconst_0
		// @1A: putfield long game.C_100156_sk.field_105390_q
		// @1D: aload_0
		// @1E: bipush 10 (0x0A)
		// @20: newarray long[]
		// @22: putfield long[] game.C_100156_sk.field_105387_t
		// @25: aload_0
		// @26: invokestatic java.lang.System.nanoTime()long
		// @29: putfield long game.C_100156_sk.field_105385_v
		// @2C: aload_0
		// @2D: invokestatic java.lang.System.nanoTime()long
		// @30: putfield long game.C_100156_sk.field_105390_q
		// @33: goto @42
		// @36: astore_1
		// @37: aload_1
		// @38: getstatic java.lang.String[] game.C_100156_sk.field_105394_z
		// @3B: bipush 9 (0x09)
		// @3D: aaload
		// @3E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @41: athrow
		// @42: return
	}
	
	static
	{
		// @00: bipush 11 (0x0B)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "$U(^F"
		// @09: invokestatic game.C_100156_sk.func_105380_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100156_sk.func_105379_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "$U(UF"
		// @14: invokestatic game.C_100156_sk.func_105380_z(java.lang.String)char[]
		// @17: invokestatic game.C_100156_sk.func_105379_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "$U(VF"
		// @1F: invokestatic game.C_100156_sk.func_105380_z(java.lang.String)char[]
		// @22: invokestatic game.C_100156_sk.func_105379_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "$U(PF"
		// @2A: invokestatic game.C_100156_sk.func_105380_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100156_sk.func_105379_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "$U(TF"
		// @35: invokestatic game.C_100156_sk.func_105380_z(java.lang.String)char[]
		// @38: invokestatic game.C_100156_sk.func_105379_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "$U(\\F"
		// @40: invokestatic game.C_100156_sk.func_105380_z(java.lang.String)char[]
		// @43: invokestatic game.C_100156_sk.func_105379_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc ",\u0010(9\u0013"
		// @4C: invokestatic game.C_100156_sk.func_105380_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100156_sk.func_105379_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "9Kj{"
		// @58: invokestatic game.C_100156_sk.func_105380_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100156_sk.func_105379_z(char[])java.lang.String
		// @5E: aastore
		// @5F: dup
		// @60: bipush 8 (0x08)
		// @62: ldc "$U(]F"
		// @64: invokestatic game.C_100156_sk.func_105380_z(java.lang.String)char[]
		// @67: invokestatic game.C_100156_sk.func_105379_z(char[])java.lang.String
		// @6A: aastore
		// @6B: dup
		// @6C: bipush 9 (0x09)
		// @6E: ldc "$U(+\u00079Wr)F~"
		// @70: invokestatic game.C_100156_sk.func_105380_z(java.lang.String)char[]
		// @73: invokestatic game.C_100156_sk.func_105379_z(char[])java.lang.String
		// @76: aastore
		// @77: dup
		// @78: bipush 10 (0x0A)
		// @7A: ldc "$U(_F"
		// @7C: invokestatic game.C_100156_sk.func_105380_z(java.lang.String)char[]
		// @7F: invokestatic game.C_100156_sk.func_105379_z(char[])java.lang.String
		// @82: aastore
		// @83: putstatic java.lang.String[] game.C_100156_sk.field_105394_z
		// @86: new game.C_100268_mk
		// @89: dup
		// @8A: invokespecial game.C_100268_mk.<init>()void
		// @8D: putstatic game.C_100268_mk game.C_100156_sk.field_105392_n
		// @90: ldc "\u0000_ty\u00079Y<7\u00071\u001e\u007fx\u001bwOs~\u001a{\u001e\u007fx\u001bwIo{\u0002wRid\u000bw_hnN0_krN.Qs7\u000f%[&~\u0000wJnrN:Wbs\u00022\u001eiqO"
		// @92: invokestatic game.C_100156_sk.func_105380_z(java.lang.String)char[]
		// @95: invokestatic game.C_100156_sk.func_105379_z(char[])java.lang.String
		// @98: putstatic java.lang.String game.C_100156_sk.field_105388_s
		// @9B: return
	}
	
	private static char[] func_105380_z(String arg0)
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
		// @0E: bipush 110 (0x6E)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_105379_z(char[] arg0)
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
		// @30: bipush 87 (0x57)
		// @32: goto @46
		// @35: bipush 62 (0x3E)
		// @37: goto @46
		// @3A: bipush 6 (0x06)
		// @3C: goto @46
		// @3F: bipush 23 (0x17)
		// @41: goto @46
		// @44: bipush 110 (0x6E)
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
