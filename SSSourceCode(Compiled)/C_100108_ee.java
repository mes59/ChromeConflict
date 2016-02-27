package game;

final class C_100108_ee implements C_100326_ic
{
	static String field_100387_b;
	static String field_100385_d;
	static String field_100386_e;
	static String field_100384_g;
	static String field_100391_h;
	static String field_100383_f;
	static String field_100392_i;
	static int[] field_100388_c;
	static String field_100389_a;
	private static final String[] field_100390_z;
	
	public final void func_100362_a(boolean arg0, int arg1, int arg2, int arg3, C_100336_im arg4)
	{
		// @000: iload_3
		// @001: aload #5
		// @003: getfield int game.C_100336_im.field_102538_m
		// @006: ineg
		// @007: isub
		// @008: istore #6
		// @00A: iload #4
		// @00C: aload #5
		// @00E: getfield int game.C_100336_im.field_102541_w
		// @011: iadd
		// @012: istore #7
		// @014: iload_2
		// @015: sipush -26568 (0x9838)
		// @018: if_icmpeq @026
		// @01B: aconst_null
		// @01C: checkcast java.lang.String
		// @01F: putstatic java.lang.String game.C_100108_ee.field_100387_b
		// @022: goto @026
		// @025: athrow
		// @026: aload #5
		// @028: getfield int game.C_100336_im.field_102537_l
		// @02B: iload #7
		// @02D: aload #5
		// @02F: getfield int game.C_100336_im.field_102544_t
		// @032: iload #6
		// @034: bipush -116 (0x8C)
		// @036: invokestatic game.C_100022_hf.func_103886_a(int, int, int, int, byte)void
		// @039: getstatic game.C_100037_wb[] game.C_100163_sf.field_105435_g
		// @03C: iconst_1
		// @03D: aaload
		// @03E: astore #8
		// @040: aload #5
		// @042: instanceof game.C_100218_am
		// @045: ifeq @08C
		// @048: aload #5
		// @04A: checkcast game.C_100218_am
		// @04D: getfield boolean game.C_100218_am.field_103120_K
		// @050: ifeq @08C
		// @053: goto @057
		// @056: athrow
		// @057: aload #8
		// @059: iload #6
		// @05B: iconst_1
		// @05C: iadd
		// @05D: aload #8
		// @05F: getfield int game.C_100037_wb.field_102341_y
		// @062: ineg
		// @063: aload #5
		// @065: getfield int game.C_100336_im.field_102537_l
		// @068: iadd
		// @069: ldc 894471521 (0x35508d61)
		// @06B: ishr
		// @06C: ineg
		// @06D: isub
		// @06E: iconst_1
		// @06F: iload #7
		// @071: aload #8
		// @073: getfield int game.C_100037_wb.field_102340_z
		// @076: ineg
		// @077: aload #5
		// @079: getfield int game.C_100336_im.field_102544_t
		// @07C: iadd
		// @07D: ldc 1155681313 (0x44e24c21)
		// @07F: ishr
		// @080: iadd
		// @081: iadd
		// @082: sipush 256 (0x0100)
		// @085: invokevirtual game.C_100037_wb.func_102367_c(int, int, int)void
		// @088: goto @08C
		// @08B: athrow
		// @08C: aload #5
		// @08E: bipush 54 (0x36)
		// @090: invokevirtual game.C_100336_im.func_102515_d(byte)boolean
		// @093: ifne @09A
		// @096: goto @0B8
		// @099: athrow
		// @09A: aload #5
		// @09C: getfield int game.C_100336_im.field_102544_t
		// @09F: iconst_4
		// @0A0: isub
		// @0A1: iload #6
		// @0A3: bipush -2 (0xFE)
		// @0A5: isub
		// @0A6: sipush 11534 (0x2D0E)
		// @0A9: bipush -4 (0xFC)
		// @0AB: aload #5
		// @0AD: getfield int game.C_100336_im.field_102537_l
		// @0B0: iadd
		// @0B1: iconst_2
		// @0B2: iload #7
		// @0B4: iadd
		// @0B5: invokestatic game.C_100010_ff.func_103692_a(int, int, int, int, int)void
		// @0B8: goto @115
		// @0BB: astore #6
		// @0BD: aload #6
		// @0BF: new java.lang.StringBuilder
		// @0C2: dup
		// @0C3: invokespecial java.lang.StringBuilder.<init>()void
		// @0C6: getstatic java.lang.String[] game.C_100108_ee.field_100390_z
		// @0C9: iconst_2
		// @0CA: aaload
		// @0CB: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0CE: iload_1
		// @0CF: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @0D2: bipush 44 (0x2C)
		// @0D4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0D7: iload_2
		// @0D8: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0DB: bipush 44 (0x2C)
		// @0DD: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0E0: iload_3
		// @0E1: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0E4: bipush 44 (0x2C)
		// @0E6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0E9: iload #4
		// @0EB: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0EE: bipush 44 (0x2C)
		// @0F0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0F3: aload #5
		// @0F5: ifnull @101
		// @0F8: getstatic java.lang.String[] game.C_100108_ee.field_100390_z
		// @0FB: iconst_3
		// @0FC: aaload
		// @0FD: goto @106
		// @100: athrow
		// @101: getstatic java.lang.String[] game.C_100108_ee.field_100390_z
		// @104: iconst_4
		// @105: aaload
		// @106: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @109: bipush 41 (0x29)
		// @10B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @10E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @111: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @114: athrow
		// @115: return
	}
	
	public static void func_100381_a(byte arg0)
	{
		// @00: aconst_null
		// @01: putstatic int[] game.C_100108_ee.field_100388_c
		// @04: aconst_null
		// @05: putstatic java.lang.String game.C_100108_ee.field_100392_i
		// @08: aconst_null
		// @09: putstatic java.lang.String game.C_100108_ee.field_100384_g
		// @0C: aconst_null
		// @0D: putstatic java.lang.String game.C_100108_ee.field_100389_a
		// @10: aconst_null
		// @11: putstatic java.lang.String game.C_100108_ee.field_100383_f
		// @14: aconst_null
		// @15: putstatic java.lang.String game.C_100108_ee.field_100386_e
		// @18: aconst_null
		// @19: putstatic java.lang.String game.C_100108_ee.field_100387_b
		// @1C: bipush -92 (0xA4)
		// @1E: iload_0
		// @1F: bipush 13 (0x0D)
		// @21: isub
		// @22: bipush 42 (0x2A)
		// @24: idiv
		// @25: irem
		// @26: istore_1
		// @27: aconst_null
		// @28: putstatic java.lang.String game.C_100108_ee.field_100385_d
		// @2B: aconst_null
		// @2C: putstatic java.lang.String game.C_100108_ee.field_100391_h
		// @2F: goto @53
		// @32: astore_1
		// @33: aload_1
		// @34: new java.lang.StringBuilder
		// @37: dup
		// @38: invokespecial java.lang.StringBuilder.<init>()void
		// @3B: getstatic java.lang.String[] game.C_100108_ee.field_100390_z
		// @3E: iconst_1
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
	
	static final void func_100378_b(int arg0)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore_2
		// @04: aconst_null
		// @05: putstatic game.C_100211_qd game.SteelSentinels.field_105274_N
		// @08: aconst_null
		// @09: putstatic game.C_100211_qd game.C_100068_vc.field_104342_d
		// @0C: iconst_0
		// @0D: putstatic boolean game.C_100226_ae.field_106149_e
		// @10: aconst_null
		// @11: getstatic game.C_100202_qi game.C_100083_c.field_103168_Q
		// @14: if_acmpeq @27
		// @17: getstatic game.C_100202_qi game.C_100083_c.field_103168_Q
		// @1A: bipush -110 (0x92)
		// @1C: invokevirtual game.C_100202_qi.func_105905_b(byte)void
		// @1F: aconst_null
		// @20: putstatic game.C_100202_qi game.C_100083_c.field_103168_Q
		// @23: goto @27
		// @26: athrow
		// @27: aconst_null
		// @28: putstatic game.C_100105_eg game.C_100053_vn.field_102832_U
		// @2B: getstatic game.C_100202_qi game.C_100335_il.field_107368_e
		// @2E: ifnonnull @35
		// @31: goto @41
		// @34: athrow
		// @35: getstatic game.C_100202_qi game.C_100335_il.field_107368_e
		// @38: bipush 73 (0x49)
		// @3A: invokevirtual game.C_100202_qi.func_105905_b(byte)void
		// @3D: aconst_null
		// @3E: putstatic game.C_100202_qi game.C_100335_il.field_107368_e
		// @41: iload_0
		// @42: bipush 121 (0x79)
		// @44: if_icmpgt @48
		// @47: return
		// @48: aconst_null
		// @49: putstatic game.C_100105_eg game.C_100329_ih.field_107271_c
		// @4C: aconst_null
		// @4D: getstatic game.C_100202_qi game.C_100339_jb.field_107387_l
		// @50: if_acmpne @57
		// @53: goto @63
		// @56: athrow
		// @57: getstatic game.C_100202_qi game.C_100339_jb.field_107387_l
		// @5A: bipush 35 (0x23)
		// @5C: invokevirtual game.C_100202_qi.func_105905_b(byte)void
		// @5F: aconst_null
		// @60: putstatic game.C_100202_qi game.C_100339_jb.field_107387_l
		// @63: aconst_null
		// @64: putstatic game.C_100105_eg game.C_100272_mn.field_102425_G
		// @67: aconst_null
		// @68: getstatic game.C_100105_eg game.C_100053_vn.field_102832_U
		// @6B: if_acmpne @72
		// @6E: goto @A3
		// @71: athrow
		// @72: getstatic game.C_100105_eg game.C_100053_vn.field_102832_U
		// @75: iconst_0
		// @76: invokevirtual game.C_100105_eg.func_104730_b(int)game.C_100325_id
		// @79: checkcast game.C_100054_ec
		// @7C: astore_1
		// @7D: aload_1
		// @7E: ifnull @9F
		// @81: aload_1
		// @82: bipush 8 (0x08)
		// @84: invokevirtual game.C_100054_ec.func_101479_c(byte)void
		// @87: getstatic game.C_100105_eg game.C_100053_vn.field_102832_U
		// @8A: bipush 8 (0x08)
		// @8C: invokevirtual game.C_100105_eg.func_104729_a(byte)game.C_100325_id
		// @8F: checkcast game.C_100054_ec
		// @92: astore_1
		// @93: iload_2
		// @94: ifne @A3
		// @97: iload_2
		// @98: ifeq @7D
		// @9B: goto @9F
		// @9E: athrow
		// @9F: aconst_null
		// @A0: putstatic game.C_100105_eg game.C_100053_vn.field_102832_U
		// @A3: goto @C7
		// @A6: astore_1
		// @A7: aload_1
		// @A8: new java.lang.StringBuilder
		// @AB: dup
		// @AC: invokespecial java.lang.StringBuilder.<init>()void
		// @AF: getstatic java.lang.String[] game.C_100108_ee.field_100390_z
		// @B2: iconst_5
		// @B3: aaload
		// @B4: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @B7: iload_0
		// @B8: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @BB: bipush 41 (0x29)
		// @BD: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C0: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @C3: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @C6: athrow
		// @C7: return
	}
	
	static final void func_100379_a(int arg0)
	{
		// @00: iload_0
		// @01: bipush -70 (0xBA)
		// @03: if_icmplt @07
		// @06: return
		// @07: iconst_1
		// @08: putstatic boolean game.C_100230_of.field_106216_k
		// @0B: iconst_0
		// @0C: putstatic int game.C_100113_ek.field_104880_b
		// @0F: goto @33
		// @12: astore_1
		// @13: aload_1
		// @14: new java.lang.StringBuilder
		// @17: dup
		// @18: invokespecial java.lang.StringBuilder.<init>()void
		// @1B: getstatic java.lang.String[] game.C_100108_ee.field_100390_z
		// @1E: iconst_0
		// @1F: aaload
		// @20: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @23: iload_0
		// @24: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @27: bipush 41 (0x29)
		// @29: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @2F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @32: athrow
		// @33: return
	}
	
	static
	{
		// @00: bipush 6 (0x06)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "[\u0017\u001ba_"
		// @09: invokestatic game.C_100108_ee.func_100382_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100108_ee.func_100380_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "[\u0017\u001bb_"
		// @14: invokestatic game.C_100108_ee.func_100382_z(java.lang.String)char[]
		// @17: invokestatic game.C_100108_ee.func_100380_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "[\u0017\u001bg_"
		// @1F: invokestatic game.C_100108_ee.func_100382_z(java.lang.String)char[]
		// @22: invokestatic game.C_100108_ee.func_100380_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "E\\\u001b\r\n"
		// @2A: invokestatic game.C_100108_ee.func_100382_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100108_ee.func_100380_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "P\u0007YO"
		// @35: invokestatic game.C_100108_ee.func_100382_z(java.lang.String)char[]
		// @38: invokestatic game.C_100108_ee.func_100380_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "[\u0017\u001b`_"
		// @40: invokestatic game.C_100108_ee.func_100382_z(java.lang.String)char[]
		// @43: invokestatic game.C_100108_ee.func_100380_z(char[])java.lang.String
		// @46: aastore
		// @47: putstatic java.lang.String[] game.C_100108_ee.field_100390_z
		// @4A: ldc "j\u001aP\u0003K\u001bB\u000b\u0003\u001aQ\u0016@O\u0012\u001e\u001aTPW_\u001eGF\u0016Z\u000b\u0015A\u0012[\u001c\u0015F\u0019Y\u001b[F\u0012L\u0017Q\r"
		// @4C: invokestatic game.C_100108_ee.func_100382_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100108_ee.func_100380_z(char[])java.lang.String
		// @52: putstatic java.lang.String game.C_100108_ee.field_100387_b
		// @55: ldc "w\u001cCJ\u0003[R\t\u0006G\u0000RALWJ\u001a\\PWY\u0013XF"
		// @57: invokestatic game.C_100108_ee.func_100382_z(java.lang.String)char[]
		// @5A: invokestatic game.C_100108_ee.func_100380_z(char[])java.lang.String
		// @5D: putstatic java.lang.String game.C_100108_ee.field_100385_d
		// @60: ldc "}\u001aTWWW\u0001\u0015@\u0002L\u0000PM\u0003R\u000b\u0015G\u001eM\u0013WO\u0012Z\\"
		// @62: invokestatic game.C_100108_ee.func_100382_z(java.lang.String)char[]
		// @65: invokestatic game.C_100108_ee.func_100380_z(char[])java.lang.String
		// @68: putstatic java.lang.String game.C_100108_ee.field_100391_h
		// @6B: ldc "}\u0013[M\u0018JRZQ\u0013W\u001cTQ\u001eR\u000b\u0015A\u0012\u001e\u0014\\Q\u0012ZRBK\u001eR\u0017\u0015Z\u0018K\u0000\u0015P\u0012P\u0006\\M\u0012RR\\PWW\u001c\u0015W\u001f[RTJ\u0005\u0010"
		// @6D: invokestatic game.C_100108_ee.func_100382_z(java.lang.String)char[]
		// @70: invokestatic game.C_100108_ee.func_100380_z(char[])java.lang.String
		// @73: putstatic java.lang.String game.C_100108_ee.field_100386_e
		// @76: ldc "}\u001d[M\u0012]\u0006\\L\u0019\u001e\u001eZP\u0003\u0010R\t\u0006G\u0000"
		// @78: invokestatic game.C_100108_ee.func_100382_z(java.lang.String)char[]
		// @7B: invokestatic game.C_100108_ee.func_100380_z(char[])java.lang.String
		// @7E: putstatic java.lang.String game.C_100108_ee.field_100384_g
		// @81: sipush 8192 (0x2000)
		// @84: newarray int[]
		// @86: putstatic int[] game.C_100108_ee.field_100388_c
		// @89: ldc "g\u001d@\u0003\u0014_\u001c\u0015B\u0004URALWT\u001d\\MWJ\u001a\\PWY\u0013XF"
		// @8B: invokestatic game.C_100108_ee.func_100382_z(java.lang.String)char[]
		// @8E: invokestatic game.C_100108_ee.func_100380_z(char[])java.lang.String
		// @91: putstatic java.lang.String game.C_100108_ee.field_100389_a
		// @94: ldc "j\u0000TJ\u0019W\u001cR\u0003\u0013L\u001d[F"
		// @96: invokestatic game.C_100108_ee.func_100382_z(java.lang.String)char[]
		// @99: invokestatic game.C_100108_ee.func_100380_z(char[])java.lang.String
		// @9C: putstatic java.lang.String game.C_100108_ee.field_100383_f
		// @9F: ldc "l\u0017FS\u0016I\u001cF\u0019W\u0002\u0011ZOJX\u0014SE\u0011XL\t\u0006G\u0000N\u001a@\u0018RL"
		// @A1: invokestatic game.C_100108_ee.func_100382_z(java.lang.String)char[]
		// @A4: invokestatic game.C_100108_ee.func_100380_z(char[])java.lang.String
		// @A7: putstatic java.lang.String game.C_100108_ee.field_100392_i
		// @AA: return
	}
	
	private static char[] func_100382_z(String arg0)
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
		// @0E: bipush 119 (0x77)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_100380_z(char[] arg0)
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
		// @30: bipush 62 (0x3E)
		// @32: goto @46
		// @35: bipush 114 (0x72)
		// @37: goto @46
		// @3A: bipush 53 (0x35)
		// @3C: goto @46
		// @3F: bipush 35 (0x23)
		// @41: goto @46
		// @44: bipush 119 (0x77)
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
