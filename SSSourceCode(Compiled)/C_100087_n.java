package game;

final class C_100087_n extends C_100158_da
{
	static String[][] field_100691_o;
	static C_100302_ka field_100694_j;
	int field_100699_t;
	boolean field_100702_q;
	boolean field_100696_w;
	int field_100690_n;
	int field_100706_x;
	int field_100704_z;
	int field_100695_k;
	static long field_100700_s;
	static String field_100692_l;
	static int field_100697_v;
	static String field_100701_r;
	static C_100037_wb field_100705_y;
	int field_100693_m;
	int field_100698_u;
	boolean field_100703_p;
	private static final String[] field_100689_A;
	
	static final String[] func_100679_a(int arg0, String arg1, char arg2)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #10
		// @05: iload_2
		// @06: aload_1
		// @07: iconst_0
		// @08: invokestatic game.C_100095_fe.func_103381_a(char, java.lang.CharSequence, int)int
		// @0B: istore_3
		// @0C: iload_3
		// @0D: iconst_1
		// @0E: iadd
		// @0F: anewarray java.lang.String
		// @12: astore #4
		// @14: iconst_0
		// @15: istore #5
		// @17: iconst_0
		// @18: istore #6
		// @1A: iconst_0
		// @1B: istore #7
		// @1D: bipush -126 (0x82)
		// @1F: bipush 69 (0x45)
		// @21: iload_0
		// @22: isub
		// @23: bipush 32 (0x20)
		// @25: idiv
		// @26: irem
		// @27: istore #8
		// @29: iload #7
		// @2B: iload_3
		// @2C: if_icmpge @75
		// @2F: iload #10
		// @31: ifne @7F
		// @34: iload #6
		// @36: istore #9
		// @38: iload_2
		// @39: iconst_m1
		// @3A: ixor
		// @3B: aload_1
		// @3C: iload #9
		// @3E: invokevirtual java.lang.String.charAt(int)char
		// @41: iconst_m1
		// @42: ixor
		// @43: if_icmpeq @57
		// @46: iinc #9 +1
		// @49: iload #10
		// @4B: ifne @70
		// @4E: iload #10
		// @50: ifeq @38
		// @53: goto @57
		// @56: athrow
		// @57: aload #4
		// @59: iload #5
		// @5B: iinc #5 +1
		// @5E: aload_1
		// @5F: iload #6
		// @61: iload #9
		// @63: invokevirtual java.lang.String.substring(int, int)java.lang.String
		// @66: aastore
		// @67: iload #9
		// @69: iconst_1
		// @6A: iadd
		// @6B: istore #6
		// @6D: iinc #7 +1
		// @70: iload #10
		// @72: ifeq @29
		// @75: aload #4
		// @77: iload_3
		// @78: aload_1
		// @79: iload #6
		// @7B: invokevirtual java.lang.String.substring(int)java.lang.String
		// @7E: aastore
		// @7F: aload #4
		// @81: areturn
		// @82: astore_3
		// @83: aload_3
		// @84: new java.lang.StringBuilder
		// @87: dup
		// @88: invokespecial java.lang.StringBuilder.<init>()void
		// @8B: getstatic java.lang.String[] game.C_100087_n.field_100689_A
		// @8E: bipush 11 (0x0B)
		// @90: aaload
		// @91: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @94: iload_0
		// @95: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @98: bipush 44 (0x2C)
		// @9A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9D: aload_1
		// @9E: ifnull @AB
		// @A1: getstatic java.lang.String[] game.C_100087_n.field_100689_A
		// @A4: bipush 8 (0x08)
		// @A6: aaload
		// @A7: goto @B1
		// @AA: athrow
		// @AB: getstatic java.lang.String[] game.C_100087_n.field_100689_A
		// @AE: bipush 6 (0x06)
		// @B0: aaload
		// @B1: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @B4: bipush 44 (0x2C)
		// @B6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B9: iload_2
		// @BA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @BD: bipush 41 (0x29)
		// @BF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C2: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @C5: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @C8: athrow
	}
	
	static final byte[] func_100681_a(int arg0, byte arg1, int arg2, byte[] arg3)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #8
		// @05: iconst_m1
		// @06: iload_2
		// @07: iconst_m1
		// @08: ixor
		// @09: if_icmple @3F
		// @0C: iload_0
		// @0D: newarray byte[]
		// @0F: astore #4
		// @11: iconst_0
		// @12: istore #5
		// @14: iload_0
		// @15: iconst_m1
		// @16: ixor
		// @17: iload #5
		// @19: iconst_m1
		// @1A: ixor
		// @1B: if_icmpge @3A
		// @1E: aload #4
		// @20: iload #5
		// @22: aload_3
		// @23: iload #5
		// @25: iload_2
		// @26: iadd
		// @27: baload
		// @28: bastore
		// @29: iinc #5 +1
		// @2C: iload #8
		// @2E: ifne @42
		// @31: iload #8
		// @33: ifeq @14
		// @36: goto @3A
		// @39: athrow
		// @3A: iload #8
		// @3C: ifeq @42
		// @3F: aload_3
		// @40: astore #4
		// @42: new game.C_100141_tc
		// @45: dup
		// @46: invokespecial game.C_100141_tc.<init>()void
		// @49: astore #5
		// @4B: aload #5
		// @4D: bipush 106 (0x6A)
		// @4F: invokevirtual game.C_100141_tc.func_105047_a(int)void
		// @52: aload #5
		// @54: sipush 256 (0x0100)
		// @57: bipush 8 (0x08)
		// @59: iload_0
		// @5A: imul
		// @5B: i2l
		// @5C: aload #4
		// @5E: invokevirtual game.C_100141_tc.func_105055_a(int, long, byte[])void
		// @61: bipush -123 (0x85)
		// @63: bipush 78 (0x4E)
		// @65: iload_1
		// @66: isub
		// @67: bipush 38 (0x26)
		// @69: idiv
		// @6A: irem
		// @6B: istore #6
		// @6D: bipush 64 (0x40)
		// @6F: newarray byte[]
		// @71: astore #7
		// @73: aload #5
		// @75: aload #7
		// @77: iconst_0
		// @78: sipush 3677 (0x0E5D)
		// @7B: invokevirtual game.C_100141_tc.func_105045_a(byte[], int, int)void
		// @7E: aload #7
		// @80: areturn
		// @81: astore #4
		// @83: aload #4
		// @85: new java.lang.StringBuilder
		// @88: dup
		// @89: invokespecial java.lang.StringBuilder.<init>()void
		// @8C: getstatic java.lang.String[] game.C_100087_n.field_100689_A
		// @8F: bipush 9 (0x09)
		// @91: aaload
		// @92: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @95: iload_0
		// @96: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @99: bipush 44 (0x2C)
		// @9B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9E: iload_1
		// @9F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A2: bipush 44 (0x2C)
		// @A4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A7: iload_2
		// @A8: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @AB: bipush 44 (0x2C)
		// @AD: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B0: aload_3
		// @B1: ifnull @BE
		// @B4: getstatic java.lang.String[] game.C_100087_n.field_100689_A
		// @B7: bipush 8 (0x08)
		// @B9: aaload
		// @BA: goto @C4
		// @BD: athrow
		// @BE: getstatic java.lang.String[] game.C_100087_n.field_100689_A
		// @C1: bipush 6 (0x06)
		// @C3: aaload
		// @C4: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @C7: bipush 41 (0x29)
		// @C9: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @CC: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @CF: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @D2: athrow
	}
	
	static final int func_100687_a(byte arg0, int arg1)
	{
		// @00: ldc 16748149 (0xff8e75)
		// @02: iload_1
		// @03: iand
		// @04: ldc 1256920528 (0x4aeb15d0)
		// @06: ishr
		// @07: istore_2
		// @08: sipush 255 (0x00FF)
		// @0B: iload_1
		// @0C: ldc 1726630184 (0x66ea4928)
		// @0E: ishr
		// @0F: iand
		// @10: istore_3
		// @11: iload_0
		// @12: bipush 34 (0x22)
		// @14: if_icmpge @29
		// @17: aconst_null
		// @18: checkcast java.lang.String
		// @1B: aconst_null
		// @1C: checkcast java.lang.String
		// @1F: bipush 40 (0x28)
		// @21: invokestatic game.C_100087_n.func_100680_a(java.lang.String, java.lang.String, int)boolean
		// @24: pop
		// @25: goto @29
		// @28: athrow
		// @29: sipush 255 (0x00FF)
		// @2C: sipush 255 (0x00FF)
		// @2F: iload_2
		// @30: ineg
		// @31: iadd
		// @32: iconst_2
		// @33: idiv
		// @34: ineg
		// @35: iadd
		// @36: istore_2
		// @37: iload_1
		// @38: sipush 255 (0x00FF)
		// @3B: iand
		// @3C: istore #4
		// @3E: sipush 255 (0x00FF)
		// @41: iload_3
		// @42: ineg
		// @43: sipush 255 (0x00FF)
		// @46: iadd
		// @47: iconst_2
		// @48: idiv
		// @49: isub
		// @4A: istore_3
		// @4B: sipush 255 (0x00FF)
		// @4E: iload #4
		// @50: ineg
		// @51: sipush 255 (0x00FF)
		// @54: iadd
		// @55: iconst_2
		// @56: idiv
		// @57: ineg
		// @58: iadd
		// @59: istore #4
		// @5B: iload #4
		// @5D: iload_2
		// @5E: ldc -616393808 (0xdb4293b0)
		// @60: ishl
		// @61: iload_3
		// @62: ldc 2077123432 (0x7bce6368)
		// @64: ishl
		// @65: iadd
		// @66: iadd
		// @67: ireturn
		// @68: astore_2
		// @69: aload_2
		// @6A: new java.lang.StringBuilder
		// @6D: dup
		// @6E: invokespecial java.lang.StringBuilder.<init>()void
		// @71: getstatic java.lang.String[] game.C_100087_n.field_100689_A
		// @74: iconst_2
		// @75: aaload
		// @76: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @79: iload_0
		// @7A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7D: bipush 44 (0x2C)
		// @7F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @82: iload_1
		// @83: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @86: bipush 41 (0x29)
		// @88: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @8E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @91: athrow
	}
	
	static final boolean func_100688_e(int arg0)
	{
		// @00: iload_0
		// @01: bipush 64 (0x40)
		// @03: if_icmpeq @11
		// @06: aconst_null
		// @07: checkcast java.lang.String
		// @0A: putstatic java.lang.String game.C_100087_n.field_100692_l
		// @0D: goto @11
		// @10: athrow
		// @11: aconst_null
		// @12: getstatic game.C_100022_hf game.C_100136_th.field_102623_R
		// @15: if_acmpne @39
		// @18: iconst_5
		// @19: invokestatic game.C_100249_pc.func_102316_e(byte)boolean
		// @1C: ifne @39
		// @1F: goto @23
		// @22: athrow
		// @23: getstatic game.C_100260_mc game.C_100228_nn.field_106189_c
		// @26: ifnonnull @39
		// @29: goto @2D
		// @2C: athrow
		// @2D: bipush 12 (0x0C)
		// @2F: invokestatic game.C_100079_e.func_102659_q(int)boolean
		// @32: ifeq @3E
		// @35: goto @39
		// @38: athrow
		// @39: iconst_1
		// @3A: goto @3F
		// @3D: athrow
		// @3E: iconst_0
		// @3F: ireturn
		// @40: astore_1
		// @41: aload_1
		// @42: new java.lang.StringBuilder
		// @45: dup
		// @46: invokespecial java.lang.StringBuilder.<init>()void
		// @49: getstatic java.lang.String[] game.C_100087_n.field_100689_A
		// @4C: iconst_4
		// @4D: aaload
		// @4E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @51: iload_0
		// @52: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @55: bipush 41 (0x29)
		// @57: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @5D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @60: athrow
	}
	
	static final int func_100684_a(int arg0, int arg1, byte arg2)
	{
		// @00: bipush -16 (0xF0)
		// @02: iload_2
		// @03: bipush -6 (0xFA)
		// @05: isub
		// @06: bipush 53 (0x35)
		// @08: idiv
		// @09: irem
		// @0A: istore_3
		// @0B: iload_1
		// @0C: ldc -1049311216 (0xc174c810)
		// @0E: ishr
		// @0F: istore #4
		// @11: iload_1
		// @12: ldc 65535 (0xffff)
		// @14: iand
		// @15: istore #5
		// @17: iload_0
		// @18: ldc 1934686096 (0x7350f790)
		// @1A: ishr
		// @1B: istore #6
		// @1D: iload_0
		// @1E: ldc 65535 (0xffff)
		// @20: iand
		// @21: istore #7
		// @23: iload #5
		// @25: iload #6
		// @27: imul
		// @28: iload #4
		// @2A: iload_0
		// @2B: imul
		// @2C: iadd
		// @2D: iload #7
		// @2F: iload #5
		// @31: imul
		// @32: ldc -1655005776 (0x9d5a9db0)
		// @34: ishr
		// @35: iadd
		// @36: ireturn
		// @37: astore_3
		// @38: aload_3
		// @39: new java.lang.StringBuilder
		// @3C: dup
		// @3D: invokespecial java.lang.StringBuilder.<init>()void
		// @40: getstatic java.lang.String[] game.C_100087_n.field_100689_A
		// @43: iconst_0
		// @44: aaload
		// @45: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @48: iload_0
		// @49: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4C: bipush 44 (0x2C)
		// @4E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @51: iload_1
		// @52: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @55: bipush 44 (0x2C)
		// @57: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5A: iload_2
		// @5B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5E: bipush 41 (0x29)
		// @60: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @63: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @66: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @69: athrow
	}
	
	static final boolean func_100680_a(String arg0, String arg1, int arg2)
	{
		// @00: aload_1
		// @01: bipush 95 (0x5F)
		// @03: ldc ""
		// @05: iconst_0
		// @06: invokestatic game.C_100118_ub.func_102051_a(java.lang.String, char, java.lang.String, int)java.lang.String
		// @09: astore_1
		// @0A: iload_2
		// @0B: iload_2
		// @0C: ixor
		// @0D: aload_1
		// @0E: invokestatic game.C_100155_dc.func_105342_a(int, java.lang.String)java.lang.String
		// @11: astore_3
		// @12: iconst_m1
		// @13: aload_0
		// @14: aload_1
		// @15: invokevirtual java.lang.String.indexOf(java.lang.String)int
		// @18: if_icmpne @29
		// @1B: aload_0
		// @1C: aload_3
		// @1D: invokevirtual java.lang.String.indexOf(java.lang.String)int
		// @20: iconst_m1
		// @21: ixor
		// @22: ifeq @2E
		// @25: goto @29
		// @28: athrow
		// @29: iconst_1
		// @2A: goto @2F
		// @2D: athrow
		// @2E: iconst_0
		// @2F: ireturn
		// @30: astore_3
		// @31: aload_3
		// @32: new java.lang.StringBuilder
		// @35: dup
		// @36: invokespecial java.lang.StringBuilder.<init>()void
		// @39: getstatic java.lang.String[] game.C_100087_n.field_100689_A
		// @3C: bipush 10 (0x0A)
		// @3E: aaload
		// @3F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @42: aload_0
		// @43: ifnull @50
		// @46: getstatic java.lang.String[] game.C_100087_n.field_100689_A
		// @49: bipush 8 (0x08)
		// @4B: aaload
		// @4C: goto @56
		// @4F: athrow
		// @50: getstatic java.lang.String[] game.C_100087_n.field_100689_A
		// @53: bipush 6 (0x06)
		// @55: aaload
		// @56: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @59: bipush 44 (0x2C)
		// @5B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5E: aload_1
		// @5F: ifnull @6C
		// @62: getstatic java.lang.String[] game.C_100087_n.field_100689_A
		// @65: bipush 8 (0x08)
		// @67: aaload
		// @68: goto @72
		// @6B: athrow
		// @6C: getstatic java.lang.String[] game.C_100087_n.field_100689_A
		// @6F: bipush 6 (0x06)
		// @71: aaload
		// @72: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @75: bipush 44 (0x2C)
		// @77: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7A: iload_2
		// @7B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7E: bipush 41 (0x29)
		// @80: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @83: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @86: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @89: athrow
	}
	
	public static void func_100683_a(byte arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100087_n.field_100692_l
		// @04: aconst_null
		// @05: putstatic game.C_100037_wb game.C_100087_n.field_100705_y
		// @08: iload_0
		// @09: bipush 98 (0x62)
		// @0B: if_icmpeq @1E
		// @0E: bipush -5 (0xFB)
		// @10: aconst_null
		// @11: checkcast java.lang.String
		// @14: ldc 65524 (0xfff4)
		// @16: invokestatic game.C_100087_n.func_100679_a(int, java.lang.String, char)java.lang.String[]
		// @19: pop
		// @1A: goto @1E
		// @1D: athrow
		// @1E: aconst_null
		// @1F: checkcast java.lang.String[][]
		// @22: putstatic java.lang.String[][] game.C_100087_n.field_100691_o
		// @25: aconst_null
		// @26: putstatic game.C_100302_ka game.C_100087_n.field_100694_j
		// @29: aconst_null
		// @2A: putstatic java.lang.String game.C_100087_n.field_100701_r
		// @2D: goto @51
		// @30: astore_1
		// @31: aload_1
		// @32: new java.lang.StringBuilder
		// @35: dup
		// @36: invokespecial java.lang.StringBuilder.<init>()void
		// @39: getstatic java.lang.String[] game.C_100087_n.field_100689_A
		// @3C: iconst_1
		// @3D: aaload
		// @3E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @41: iload_0
		// @42: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @45: bipush 41 (0x29)
		// @47: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @50: athrow
		// @51: return
	}
	
	C_100087_n(int arg0, int arg1, int arg2)
	{
		// @000: aload_0
		// @001: invokespecial game.C_100158_da.<init>()void
		// @004: aload_0
		// @005: iconst_0
		// @006: putfield boolean game.C_100087_n.field_100702_q
		// @009: aload_0
		// @00A: iload_3
		// @00B: putfield int game.C_100087_n.field_100706_x
		// @00E: aload_0
		// @00F: iload_1
		// @010: putfield int game.C_100087_n.field_100695_k
		// @013: aload_0
		// @014: iload_2
		// @015: putfield int game.C_100087_n.field_100704_z
		// @018: aload_0
		// @019: iconst_0
		// @01A: putfield boolean game.C_100087_n.field_100703_p
		// @01D: bipush 50 (0x32)
		// @01F: istore #4
		// @021: aload_0
		// @022: iconst_0
		// @023: putfield boolean game.C_100087_n.field_100696_w
		// @026: bipush 6 (0x06)
		// @028: aload_0
		// @029: getfield int game.C_100087_n.field_100695_k
		// @02C: if_icmpeq @033
		// @02F: goto @036
		// @032: athrow
		// @033: iconst_5
		// @034: istore #4
		// @036: bipush -6 (0xFA)
		// @038: aload_0
		// @039: getfield int game.C_100087_n.field_100695_k
		// @03C: iconst_m1
		// @03D: ixor
		// @03E: if_icmpeq @045
		// @041: goto @04E
		// @044: athrow
		// @045: bipush 125 (0x7D)
		// @047: istore #4
		// @049: aload_0
		// @04A: iconst_1
		// @04B: putfield boolean game.C_100087_n.field_100696_w
		// @04E: bipush 12 (0x0C)
		// @050: aload_0
		// @051: getfield int game.C_100087_n.field_100695_k
		// @054: if_icmpeq @05B
		// @057: goto @063
		// @05A: athrow
		// @05B: aload_0
		// @05C: iconst_0
		// @05D: putfield boolean game.C_100087_n.field_100696_w
		// @060: iconst_5
		// @061: istore #4
		// @063: aload_0
		// @064: getfield int game.C_100087_n.field_100695_k
		// @067: iconst_3
		// @068: if_icmpeq @06F
		// @06B: goto @078
		// @06E: athrow
		// @06F: aload_0
		// @070: iconst_1
		// @071: putfield boolean game.C_100087_n.field_100696_w
		// @074: bipush 100 (0x64)
		// @076: istore #4
		// @078: iconst_m1
		// @079: aload_0
		// @07A: getfield int game.C_100087_n.field_100695_k
		// @07D: iconst_m1
		// @07E: ixor
		// @07F: if_icmpne @14C
		// @082: bipush 10 (0x0A)
		// @084: istore #4
		// @086: iconst_0
		// @087: aload_0
		// @088: getfield int game.C_100087_n.field_100704_z
		// @08B: if_icmpeq @092
		// @08E: goto @096
		// @091: athrow
		// @092: bipush 25 (0x19)
		// @094: istore #4
		// @096: bipush -2 (0xFE)
		// @098: aload_0
		// @099: getfield int game.C_100087_n.field_100704_z
		// @09C: iconst_m1
		// @09D: ixor
		// @09E: if_icmpeq @0A5
		// @0A1: goto @0A9
		// @0A4: athrow
		// @0A5: bipush 20 (0x14)
		// @0A7: istore #4
		// @0A9: aload_0
		// @0AA: getfield int game.C_100087_n.field_100704_z
		// @0AD: iconst_m1
		// @0AE: ixor
		// @0AF: bipush -3 (0xFD)
		// @0B1: if_icmpeq @0B8
		// @0B4: goto @0BC
		// @0B7: athrow
		// @0B8: bipush 35 (0x23)
		// @0BA: istore #4
		// @0BC: iconst_3
		// @0BD: aload_0
		// @0BE: getfield int game.C_100087_n.field_100704_z
		// @0C1: if_icmpeq @0C8
		// @0C4: goto @0CC
		// @0C7: athrow
		// @0C8: bipush 50 (0x32)
		// @0CA: istore #4
		// @0CC: bipush 6 (0x06)
		// @0CE: aload_0
		// @0CF: getfield int game.C_100087_n.field_100704_z
		// @0D2: if_icmpeq @0D9
		// @0D5: goto @0E2
		// @0D8: athrow
		// @0D9: bipush 40 (0x28)
		// @0DB: istore #4
		// @0DD: aload_0
		// @0DE: iconst_1
		// @0DF: putfield boolean game.C_100087_n.field_100696_w
		// @0E2: bipush 7 (0x07)
		// @0E4: aload_0
		// @0E5: getfield int game.C_100087_n.field_100704_z
		// @0E8: if_icmpeq @0EF
		// @0EB: goto @0F8
		// @0EE: athrow
		// @0EF: bipush 50 (0x32)
		// @0F1: istore #4
		// @0F3: aload_0
		// @0F4: iconst_1
		// @0F5: putfield boolean game.C_100087_n.field_100696_w
		// @0F8: aload_0
		// @0F9: getfield int game.C_100087_n.field_100704_z
		// @0FC: bipush 8 (0x08)
		// @0FE: if_icmpne @10A
		// @101: bipush 100 (0x64)
		// @103: istore #4
		// @105: aload_0
		// @106: iconst_1
		// @107: putfield boolean game.C_100087_n.field_100696_w
		// @10A: aload_0
		// @10B: getfield int game.C_100087_n.field_100704_z
		// @10E: iconst_m1
		// @10F: ixor
		// @110: bipush -10 (0xF6)
		// @112: if_icmpne @11E
		// @115: bipush 30 (0x1E)
		// @117: istore #4
		// @119: aload_0
		// @11A: iconst_1
		// @11B: putfield boolean game.C_100087_n.field_100696_w
		// @11E: aload_0
		// @11F: getfield int game.C_100087_n.field_100704_z
		// @122: bipush 10 (0x0A)
		// @124: if_icmpeq @12B
		// @127: goto @134
		// @12A: athrow
		// @12B: aload_0
		// @12C: iconst_1
		// @12D: putfield boolean game.C_100087_n.field_100696_w
		// @130: bipush 20 (0x14)
		// @132: istore #4
		// @134: iconst_4
		// @135: aload_0
		// @136: getfield int game.C_100087_n.field_100704_z
		// @139: if_icmpne @140
		// @13C: bipush 75 (0x4B)
		// @13E: istore #4
		// @140: iconst_5
		// @141: aload_0
		// @142: getfield int game.C_100087_n.field_100704_z
		// @145: if_icmpne @14C
		// @148: bipush 75 (0x4B)
		// @14A: istore #4
		// @14C: bipush -8 (0xF8)
		// @14E: aload_0
		// @14F: getfield int game.C_100087_n.field_100695_k
		// @152: iconst_m1
		// @153: ixor
		// @154: if_icmpne @170
		// @157: aload_0
		// @158: iconst_1
		// @159: putfield boolean game.C_100087_n.field_100696_w
		// @15C: bipush 25 (0x19)
		// @15E: istore #4
		// @160: aload_0
		// @161: getfield int game.C_100087_n.field_100704_z
		// @164: iconst_3
		// @165: if_icmpeq @16C
		// @168: goto @170
		// @16B: athrow
		// @16C: bipush 100 (0x64)
		// @16E: istore #4
		// @170: bipush -9 (0xF7)
		// @172: aload_0
		// @173: getfield int game.C_100087_n.field_100695_k
		// @176: iconst_m1
		// @177: ixor
		// @178: if_icmpne @184
		// @17B: aload_0
		// @17C: iconst_1
		// @17D: putfield boolean game.C_100087_n.field_100696_w
		// @180: bipush 25 (0x19)
		// @182: istore #4
		// @184: aload_0
		// @185: getfield int game.C_100087_n.field_100695_k
		// @188: bipush 9 (0x09)
		// @18A: if_icmpne @196
		// @18D: aload_0
		// @18E: iconst_1
		// @18F: putfield boolean game.C_100087_n.field_100696_w
		// @192: bipush 25 (0x19)
		// @194: istore #4
		// @196: bipush -12 (0xF4)
		// @198: aload_0
		// @199: getfield int game.C_100087_n.field_100695_k
		// @19C: iconst_m1
		// @19D: ixor
		// @19E: if_icmpne @1AA
		// @1A1: bipush 25 (0x19)
		// @1A3: istore #4
		// @1A5: aload_0
		// @1A6: iconst_0
		// @1A7: putfield boolean game.C_100087_n.field_100696_w
		// @1AA: bipush -11 (0xF5)
		// @1AC: aload_0
		// @1AD: getfield int game.C_100087_n.field_100695_k
		// @1B0: iconst_m1
		// @1B1: ixor
		// @1B2: if_icmpeq @1B9
		// @1B5: goto @1BC
		// @1B8: athrow
		// @1B9: iconst_1
		// @1BA: istore #4
		// @1BC: aload_0
		// @1BD: iload #4
		// @1BF: aload_0
		// @1C0: getfield int game.C_100087_n.field_100706_x
		// @1C3: iadd
		// @1C4: putfield int game.C_100087_n.field_100690_n
		// @1C7: goto @1FF
		// @1CA: astore #4
		// @1CC: aload #4
		// @1CE: new java.lang.StringBuilder
		// @1D1: dup
		// @1D2: invokespecial java.lang.StringBuilder.<init>()void
		// @1D5: getstatic java.lang.String[] game.C_100087_n.field_100689_A
		// @1D8: iconst_3
		// @1D9: aaload
		// @1DA: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1DD: iload_1
		// @1DE: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1E1: bipush 44 (0x2C)
		// @1E3: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1E6: iload_2
		// @1E7: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1EA: bipush 44 (0x2C)
		// @1EC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1EF: iload_3
		// @1F0: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1F3: bipush 41 (0x29)
		// @1F5: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1F8: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @1FB: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @1FE: athrow
		// @1FF: return
	}
	
	static final int func_100686_a(String[] arg0, int arg1, boolean arg2, String arg3, C_100112_r arg4)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #13
		// @005: iload_2
		// @006: ifeq @013
		// @009: ldc2_w -103
		// @00C: putstatic long game.C_100087_n.field_100700_s
		// @00F: goto @013
		// @012: athrow
		// @013: aload #4
		// @015: aload_3
		// @016: invokevirtual game.C_100112_r.func_101739_b(java.lang.String)int
		// @019: istore #5
		// @01B: iload_1
		// @01C: iload #5
		// @01E: if_icmplt @03D
		// @021: iconst_m1
		// @022: aload_3
		// @023: getstatic java.lang.String[] game.C_100087_n.field_100689_A
		// @026: bipush 7 (0x07)
		// @028: aaload
		// @029: invokevirtual java.lang.String.indexOf(java.lang.String)int
		// @02C: if_icmpeq @037
		// @02F: goto @033
		// @032: athrow
		// @033: goto @03D
		// @036: athrow
		// @037: aload_0
		// @038: iconst_0
		// @039: aload_3
		// @03A: aastore
		// @03B: iconst_1
		// @03C: ireturn
		// @03D: iconst_m1
		// @03E: iload_1
		// @03F: iadd
		// @040: iload #5
		// @042: iadd
		// @043: iload_1
		// @044: idiv
		// @045: istore #6
		// @047: iload #5
		// @049: iload #6
		// @04B: idiv
		// @04C: istore_1
		// @04D: iconst_0
		// @04E: istore #6
		// @050: iconst_0
		// @051: istore #7
		// @053: aload_3
		// @054: invokevirtual java.lang.String.length()int
		// @057: istore #8
		// @059: iconst_0
		// @05A: istore #9
		// @05C: iload #9
		// @05E: iload #8
		// @060: if_icmpge @0FA
		// @063: aload_3
		// @064: iload #9
		// @066: invokevirtual java.lang.String.charAt(int)char
		// @069: istore #10
		// @06B: bipush 32 (0x20)
		// @06D: iload #10
		// @06F: iload #13
		// @071: ifne @102
		// @074: if_icmpeq @088
		// @077: goto @07B
		// @07A: athrow
		// @07B: bipush -46 (0xD2)
		// @07D: iload #10
		// @07F: iconst_m1
		// @080: ixor
		// @081: if_icmpne @0B9
		// @084: goto @088
		// @087: athrow
		// @088: aload_3
		// @089: iload #7
		// @08B: iconst_1
		// @08C: iload #9
		// @08E: iadd
		// @08F: invokevirtual java.lang.String.substring(int, int)java.lang.String
		// @092: invokevirtual java.lang.String.trim()java.lang.String
		// @095: astore #11
		// @097: aload #4
		// @099: aload #11
		// @09B: invokevirtual game.C_100112_r.func_101739_b(java.lang.String)int
		// @09E: istore #12
		// @0A0: iload_1
		// @0A1: iload #12
		// @0A3: if_icmple @0AA
		// @0A6: goto @0B9
		// @0A9: athrow
		// @0AA: iconst_1
		// @0AB: iload #9
		// @0AD: iadd
		// @0AE: istore #7
		// @0B0: aload_0
		// @0B1: iload #6
		// @0B3: iinc #6 +1
		// @0B6: aload #11
		// @0B8: aastore
		// @0B9: bipush 62 (0x3E)
		// @0BB: iload #10
		// @0BD: if_icmpne @0F2
		// @0C0: aload_3
		// @0C1: bipush -3 (0xFD)
		// @0C3: iload #9
		// @0C5: iadd
		// @0C6: getstatic java.lang.String[] game.C_100087_n.field_100689_A
		// @0C9: bipush 7 (0x07)
		// @0CB: aaload
		// @0CC: iconst_0
		// @0CD: iconst_4
		// @0CE: invokevirtual java.lang.String.regionMatches(int, java.lang.String, int, int)boolean
		// @0D1: ifeq @0F2
		// @0D4: goto @0D8
		// @0D7: athrow
		// @0D8: aload_0
		// @0D9: iload #6
		// @0DB: iinc #6 +1
		// @0DE: aload_3
		// @0DF: iload #7
		// @0E1: iload #9
		// @0E3: iconst_3
		// @0E4: isub
		// @0E5: invokevirtual java.lang.String.substring(int, int)java.lang.String
		// @0E8: invokevirtual java.lang.String.trim()java.lang.String
		// @0EB: aastore
		// @0EC: iload #9
		// @0EE: iconst_1
		// @0EF: iadd
		// @0F0: istore #7
		// @0F2: iinc #9 +1
		// @0F5: iload #13
		// @0F7: ifeq @05C
		// @0FA: iload #8
		// @0FC: iconst_m1
		// @0FD: ixor
		// @0FE: iload #7
		// @100: iconst_m1
		// @101: ixor
		// @102: if_icmpge @11B
		// @105: aload_0
		// @106: iload #6
		// @108: iinc #6 +1
		// @10B: aload_3
		// @10C: iload #7
		// @10E: iload #8
		// @110: invokevirtual java.lang.String.substring(int, int)java.lang.String
		// @113: invokevirtual java.lang.String.trim()java.lang.String
		// @116: aastore
		// @117: goto @11B
		// @11A: athrow
		// @11B: iload #6
		// @11D: ireturn
		// @11E: astore #5
		// @120: aload #5
		// @122: new java.lang.StringBuilder
		// @125: dup
		// @126: invokespecial java.lang.StringBuilder.<init>()void
		// @129: getstatic java.lang.String[] game.C_100087_n.field_100689_A
		// @12C: iconst_5
		// @12D: aaload
		// @12E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @131: aload_0
		// @132: ifnull @13F
		// @135: getstatic java.lang.String[] game.C_100087_n.field_100689_A
		// @138: bipush 8 (0x08)
		// @13A: aaload
		// @13B: goto @145
		// @13E: athrow
		// @13F: getstatic java.lang.String[] game.C_100087_n.field_100689_A
		// @142: bipush 6 (0x06)
		// @144: aaload
		// @145: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @148: bipush 44 (0x2C)
		// @14A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @14D: iload_1
		// @14E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @151: bipush 44 (0x2C)
		// @153: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @156: iload_2
		// @157: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @15A: bipush 44 (0x2C)
		// @15C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @15F: aload_3
		// @160: ifnull @16D
		// @163: getstatic java.lang.String[] game.C_100087_n.field_100689_A
		// @166: bipush 8 (0x08)
		// @168: aaload
		// @169: goto @173
		// @16C: athrow
		// @16D: getstatic java.lang.String[] game.C_100087_n.field_100689_A
		// @170: bipush 6 (0x06)
		// @172: aaload
		// @173: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @176: bipush 44 (0x2C)
		// @178: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @17B: aload #4
		// @17D: ifnull @18A
		// @180: getstatic java.lang.String[] game.C_100087_n.field_100689_A
		// @183: bipush 8 (0x08)
		// @185: aaload
		// @186: goto @190
		// @189: athrow
		// @18A: getstatic java.lang.String[] game.C_100087_n.field_100689_A
		// @18D: bipush 6 (0x06)
		// @18F: aaload
		// @190: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @193: bipush 41 (0x29)
		// @195: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @198: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @19B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @19E: athrow
	}
	
	static
	{
		// @000: bipush 12 (0x0C)
		// @002: anewarray java.lang.String
		// @005: dup
		// @006: iconst_0
		// @007: ldc "0k{v"
		// @009: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @00C: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @00F: aastore
		// @010: dup
		// @011: iconst_1
		// @012: ldc "0kxv"
		// @014: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @017: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @01A: aastore
		// @01B: dup
		// @01C: iconst_2
		// @01D: ldc "0kyv"
		// @01F: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @022: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @025: aastore
		// @026: dup
		// @027: iconst_3
		// @028: ldc "0k\u00027\u001871\u0000v"
		// @02A: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @02D: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @030: aastore
		// @031: dup
		// @032: iconst_4
		// @033: ldc "0k|v"
		// @035: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @038: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @03B: aastore
		// @03C: dup
		// @03D: iconst_5
		// @03E: ldc "0kzv"
		// @040: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @043: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @046: aastore
		// @047: dup
		// @048: bipush 6 (0x06)
		// @04A: ldc "00R2"
		// @04C: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @04F: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @052: aastore
		// @053: dup
		// @054: bipush 7 (0x07)
		// @056: ldc "b'L`"
		// @058: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @05B: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @05E: aastore
		// @05F: dup
		// @060: bipush 8 (0x08)
		// @062: ldc "%k\u0010p\u000b"
		// @064: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @067: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @06A: aastore
		// @06B: dup
		// @06C: bipush 9 (0x09)
		// @06E: ldc "0kvv"
		// @070: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @073: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @076: aastore
		// @077: dup
		// @078: bipush 10 (0x0A)
		// @07A: ldc "0k\u007fv"
		// @07C: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @07F: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @082: aastore
		// @083: dup
		// @084: bipush 11 (0x0B)
		// @086: ldc "0k}v"
		// @088: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @08B: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @08E: aastore
		// @08F: putstatic java.lang.String[] game.C_100087_n.field_100689_A
		// @092: bipush 11 (0x0B)
		// @094: anewarray java.lang.String[]
		// @097: dup
		// @098: iconst_0
		// @099: bipush 12 (0x0C)
		// @09B: anewarray java.lang.String
		// @09E: dup
		// @09F: iconst_0
		// @0A0: ldc "\u0017+J,\u0019:0]*\u001f1+"
		// @0A2: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @0A5: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @0A8: aastore
		// @0A9: dup
		// @0AA: iconst_1
		// @0AB: ldc "\t$R5\u001f0\""
		// @0AD: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @0B0: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @0B3: aastore
		// @0B4: dup
		// @0B5: iconst_2
		// @0B6: ldc "\t$R5\u001f0\""
		// @0B8: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @0BB: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @0BE: aastore
		// @0BF: dup
		// @0C0: iconst_3
		// @0C1: ldc "\t$R5\u001f0\""
		// @0C3: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @0C6: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @0C9: aastore
		// @0CA: dup
		// @0CB: iconst_4
		// @0CC: ldc "\t$R5\u001f0\""
		// @0CE: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @0D1: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @0D4: aastore
		// @0D5: dup
		// @0D6: iconst_5
		// @0D7: ldc "\u001d$S;\u0004?e]1\u0018*7Q2"
		// @0D9: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @0DC: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @0DF: aastore
		// @0E0: dup
		// @0E1: bipush 6 (0x06)
		// @0E3: ldc "\u00140S.\u001f0\""
		// @0E5: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @0E8: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @0EB: aastore
		// @0EC: dup
		// @0ED: bipush 7 (0x07)
		// @0EF: ldc "\u00140S.\u001f0\""
		// @0F1: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @0F4: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @0F7: aastore
		// @0F8: dup
		// @0F9: bipush 8 (0x08)
		// @0FB: ldc "\r-Q1\u00027+Y"
		// @0FD: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @100: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @103: aastore
		// @104: dup
		// @105: bipush 9 (0x09)
		// @107: ldc "\r-Q1\u00027+Y"
		// @109: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @10C: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @10F: aastore
		// @110: dup
		// @111: bipush 10 (0x0A)
		// @113: ldc "\r-Q1\u00027+Y"
		// @115: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @118: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @11B: aastore
		// @11C: dup
		// @11D: bipush 11 (0x0B)
		// @11F: ldc "\u001d*S.\u001a;1["
		// @121: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @124: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @127: aastore
		// @128: aastore
		// @129: dup
		// @12A: iconst_1
		// @12B: bipush 15 (0x0F)
		// @12D: anewarray java.lang.String
		// @130: dup
		// @131: iconst_0
		// @132: ldc "\u0017+J,\u0019:0]*\u001f1+"
		// @134: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @137: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @13A: aastore
		// @13B: dup
		// @13C: iconst_1
		// @13D: ldc "\t _.\u00190eM;\u001a;&J7\u00190"
		// @13F: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @142: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @145: aastore
		// @146: dup
		// @147: iconst_2
		// @148: ldc "\u000c*]5\u0013*6"
		// @14A: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @14D: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @150: aastore
		// @151: dup
		// @152: iconst_3
		// @153: ldc "\u000e*I;\u0004s0N"
		// @155: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @158: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @15B: aastore
		// @15C: dup
		// @15D: iconst_4
		// @15E: ldc "\u000c*]5\u0013*6"
		// @160: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @163: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @166: aastore
		// @167: dup
		// @168: iconst_5
		// @169: ldc "\u001d$S;\u0004?e]1\u0018*7Q2"
		// @16B: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @16E: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @171: aastore
		// @172: dup
		// @173: bipush 6 (0x06)
		// @175: ldc "\u001d$S;\u0004?e]1\u0018*7Q2"
		// @177: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @17A: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @17D: aastore
		// @17E: dup
		// @17F: bipush 7 (0x07)
		// @181: ldc "\r+W.\u001f0\""
		// @183: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @186: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @189: aastore
		// @18A: dup
		// @18B: bipush 8 (0x08)
		// @18D: ldc "\u001d$S;\u0004?e]1\u0018*7Q2"
		// @18F: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @192: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @195: aastore
		// @196: dup
		// @197: bipush 9 (0x09)
		// @199: ldc "\u0013*H7\u00189eJ?\u00049 J-"
		// @19B: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @19E: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @1A1: aastore
		// @1A2: dup
		// @1A3: bipush 10 (0x0A)
		// @1A5: ldc "\u000c*]5\u0013*ez;\u0010;+];"
		// @1A7: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @1AA: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @1AD: aastore
		// @1AE: dup
		// @1AF: bipush 11 (0x0B)
		// @1B1: ldc "\u001f\u0008\u007f\u000c2\r"
		// @1B3: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @1B6: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @1B9: aastore
		// @1BA: dup
		// @1BB: bipush 12 (0x0C)
		// @1BD: ldc "\u001f\u0008\u007f\u000c2\r"
		// @1BF: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @1C2: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @1C5: aastore
		// @1C6: dup
		// @1C7: bipush 13 (0x0D)
		// @1C9: ldc "\u001d*S<\u0017*"
		// @1CB: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @1CE: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @1D1: aastore
		// @1D2: dup
		// @1D3: bipush 14 (0x0E)
		// @1D5: ldc "\u001d*S.\u001a;1["
		// @1D7: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @1DA: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @1DD: aastore
		// @1DE: aastore
		// @1DF: dup
		// @1E0: iconst_2
		// @1E1: aconst_null
		// @1E2: aastore
		// @1E3: dup
		// @1E4: iconst_3
		// @1E5: bipush 7 (0x07)
		// @1E7: anewarray java.lang.String
		// @1EA: dup
		// @1EB: iconst_0
		// @1EC: ldc "\u0017+J,\u0019:0]*\u001f1+"
		// @1EE: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @1F1: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @1F4: aastore
		// @1F5: dup
		// @1F6: iconst_1
		// @1F7: ldc "\n-L+\u0005*"
		// @1F9: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @1FC: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @1FF: aastore
		// @200: dup
		// @201: iconst_2
		// @202: ldc "\u0018)W9\u001e*"
		// @204: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @207: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @20A: aastore
		// @20B: dup
		// @20C: iconst_3
		// @20D: ldc "\u001b+[,\u0011'eR1\u0005-"
		// @20F: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @212: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @215: aastore
		// @216: dup
		// @217: iconst_4
		// @218: ldc "\u0018)W9\u001e*"
		// @21A: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @21D: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @220: aastore
		// @221: dup
		// @222: iconst_5
		// @223: ldc "\u0012$M;\u0004-"
		// @225: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @228: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @22B: aastore
		// @22C: dup
		// @22D: bipush 6 (0x06)
		// @22F: ldc "\u001d*S.\u001a;1["
		// @231: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @234: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @237: aastore
		// @238: aastore
		// @239: dup
		// @23A: iconst_4
		// @23B: aconst_null
		// @23C: aastore
		// @23D: dup
		// @23E: iconst_5
		// @23F: iconst_5
		// @240: anewarray java.lang.String
		// @243: dup
		// @244: iconst_0
		// @245: ldc "\n$L9\u0013*,P9"
		// @247: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @24A: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @24D: aastore
		// @24E: dup
		// @24F: iconst_1
		// @250: ldc "\u0013,M-\u001f2 M"
		// @252: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @255: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @258: aastore
		// @259: dup
		// @25A: iconst_2
		// @25B: ldc "\u001d*S<\u0017*"
		// @25D: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @260: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @263: aastore
		// @264: dup
		// @265: iconst_3
		// @266: ldc "\u001d*S<\u0017*"
		// @268: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @26B: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @26E: aastore
		// @26F: dup
		// @270: iconst_4
		// @271: ldc "\u001d*S.\u001a;1["
		// @273: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @276: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @279: aastore
		// @27A: aastore
		// @27B: dup
		// @27C: bipush 6 (0x06)
		// @27E: aconst_null
		// @27F: aastore
		// @280: dup
		// @281: bipush 7 (0x07)
		// @283: bipush 7 (0x07)
		// @285: anewarray java.lang.String
		// @288: dup
		// @289: iconst_0
		// @28A: ldc "\u0017+J,\u0019:0]*\u001f1+"
		// @28C: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @28F: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @292: aastore
		// @293: dup
		// @294: iconst_1
		// @295: ldc "\u0016 _(\u000f~7Q=\u001d;1"
		// @297: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @29A: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @29D: aastore
		// @29E: dup
		// @29F: iconst_2
		// @2A0: ldc "\u0013,M-\u0013:"
		// @2A2: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @2A5: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @2A8: aastore
		// @2A9: dup
		// @2AA: iconst_3
		// @2AB: ldc "\u0016,J"
		// @2AD: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @2B0: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @2B3: aastore
		// @2B4: dup
		// @2B5: iconst_4
		// @2B6: ldc "\u001d$P0\u00190"
		// @2B8: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @2BB: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @2BE: aastore
		// @2BF: dup
		// @2C0: iconst_5
		// @2C1: ldc "\u0013*H7\u00189eJ?\u00049 J-"
		// @2C3: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @2C6: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @2C9: aastore
		// @2CA: dup
		// @2CB: bipush 6 (0x06)
		// @2CD: ldc "\u001d*S.\u001a;1["
		// @2CF: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @2D2: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @2D5: aastore
		// @2D6: aastore
		// @2D7: dup
		// @2D8: bipush 8 (0x08)
		// @2DA: aconst_null
		// @2DB: aastore
		// @2DC: dup
		// @2DD: bipush 9 (0x09)
		// @2DF: bipush 6 (0x06)
		// @2E1: anewarray java.lang.String
		// @2E4: dup
		// @2E5: iconst_0
		// @2E6: ldc "\u0017+J,\u0019:0]*\u001f1+"
		// @2E8: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @2EB: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @2EE: aastore
		// @2EF: dup
		// @2F0: iconst_1
		// @2F1: ldc "\u0018)_5"
		// @2F3: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @2F6: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @2F9: aastore
		// @2FA: dup
		// @2FB: iconst_2
		// @2FC: ldc "\u000c*]5\u0013*eZ;\u0010;+];"
		// @2FE: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @301: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @304: aastore
		// @305: dup
		// @306: iconst_3
		// @307: ldc "\u000c*]5\u0013*eZ;\u0010;+];"
		// @309: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @30C: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @30F: aastore
		// @310: dup
		// @311: iconst_4
		// @312: ldc "\u001f,L<\u0003,6J"
		// @314: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @317: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @31A: aastore
		// @31B: dup
		// @31C: iconst_5
		// @31D: ldc "\u001d*S.\u001a;1["
		// @31F: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @322: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @325: aastore
		// @326: aastore
		// @327: dup
		// @328: bipush 10 (0x0A)
		// @32A: aconst_null
		// @32B: aastore
		// @32C: putstatic java.lang.String[][] game.C_100087_n.field_100691_o
		// @32F: ldc "\u00112P;\u0004"
		// @331: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @334: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @337: putstatic java.lang.String game.C_100087_n.field_100692_l
		// @33A: ldc "\u0014*W0"
		// @33C: invokestatic game.C_100087_n.func_100685_z(java.lang.String)char[]
		// @33F: invokestatic game.C_100087_n.func_100682_z(char[])java.lang.String
		// @342: putstatic java.lang.String game.C_100087_n.field_100701_r
		// @345: return
	}
	
	private static char[] func_100685_z(String arg0)
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
		// @0E: bipush 118 (0x76)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_100682_z(char[] arg0)
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
		// @30: bipush 94 (0x5E)
		// @32: goto @46
		// @35: bipush 69 (0x45)
		// @37: goto @46
		// @3A: bipush 62 (0x3E)
		// @3C: goto @46
		// @3F: bipush 94 (0x5E)
		// @41: goto @46
		// @44: bipush 118 (0x76)
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
