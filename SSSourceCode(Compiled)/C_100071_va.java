package game;

abstract class C_100071_va extends C_100325_id
{
	static C_100037_wb[] field_101660_B;
	boolean field_101657_D;
	static String field_101668_y;
	static String field_101662_w;
	static C_100127_tl field_101666_s;
	static String field_101664_u;
	static int field_101669_x;
	boolean field_101659_A;
	static C_100037_wb[] field_101667_z;
	volatile boolean field_101661_C;
	static C_100037_wb field_101665_t;
	static float field_101663_v;
	private static final String[] field_101658_E;
	
	static final boolean func_101648_b(int arg0, int arg1, int arg2, int arg3)
	{
		// @00: iload_0
		// @01: bipush 111 (0x6F)
		// @03: if_icmpgt @16
		// @06: bipush -17 (0xEF)
		// @08: bipush 83 (0x53)
		// @0A: bipush -53 (0xCB)
		// @0C: bipush -118 (0x8A)
		// @0E: invokestatic game.C_100071_va.func_101648_b(int, int, int, int)boolean
		// @11: pop
		// @12: goto @16
		// @15: athrow
		// @16: iload_3
		// @17: iflt @24
		// @1A: iload_3
		// @1B: bipush 11 (0x0B)
		// @1D: if_icmple @26
		// @20: goto @24
		// @23: athrow
		// @24: iconst_0
		// @25: ireturn
		// @26: iconst_1
		// @27: iload_2
		// @28: if_icmpgt @3A
		// @2B: iload_2
		// @2C: iload_1
		// @2D: iload_3
		// @2E: bipush -117 (0x8B)
		// @30: invokestatic game.C_100187_rk.func_100820_a(int, int, byte)int
		// @33: if_icmple @3C
		// @36: goto @3A
		// @39: athrow
		// @3A: iconst_0
		// @3B: ireturn
		// @3C: iconst_1
		// @3D: ireturn
		// @3E: astore #4
		// @40: aload #4
		// @42: new java.lang.StringBuilder
		// @45: dup
		// @46: invokespecial java.lang.StringBuilder.<init>()void
		// @49: getstatic java.lang.String[] game.C_100071_va.field_101658_E
		// @4C: iconst_2
		// @4D: aaload
		// @4E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @51: iload_0
		// @52: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @55: bipush 44 (0x2C)
		// @57: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5A: iload_1
		// @5B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5E: bipush 44 (0x2C)
		// @60: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @63: iload_2
		// @64: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @67: bipush 44 (0x2C)
		// @69: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6C: iload_3
		// @6D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @70: bipush 41 (0x29)
		// @72: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @75: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @78: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @7B: athrow
	}
	
	public static void func_101654_k(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic game.C_100037_wb[] game.C_100071_va.field_101660_B
		// @04: aconst_null
		// @05: putstatic game.C_100037_wb game.C_100071_va.field_101665_t
		// @08: aconst_null
		// @09: putstatic java.lang.String game.C_100071_va.field_101662_w
		// @0C: iload_0
		// @0D: iconst_m1
		// @0E: if_icmple @1A
		// @11: bipush 101 (0x65)
		// @13: invokestatic game.C_100071_va.func_101654_k(int)void
		// @16: goto @1A
		// @19: athrow
		// @1A: aconst_null
		// @1B: putstatic java.lang.String game.C_100071_va.field_101664_u
		// @1E: aconst_null
		// @1F: putstatic game.C_100037_wb[] game.C_100071_va.field_101667_z
		// @22: aconst_null
		// @23: putstatic game.C_100127_tl game.C_100071_va.field_101666_s
		// @26: aconst_null
		// @27: putstatic java.lang.String game.C_100071_va.field_101668_y
		// @2A: goto @4E
		// @2D: astore_1
		// @2E: aload_1
		// @2F: new java.lang.StringBuilder
		// @32: dup
		// @33: invokespecial java.lang.StringBuilder.<init>()void
		// @36: getstatic java.lang.String[] game.C_100071_va.field_101658_E
		// @39: iconst_3
		// @3A: aaload
		// @3B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3E: iload_0
		// @3F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @42: bipush 41 (0x29)
		// @44: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @47: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4D: athrow
		// @4E: return
	}
	
	abstract byte[] func_101649_j(int arg0);
	
	static final C_100089_fa func_101655_i(int arg0)
	{
		// @00: iload_0
		// @01: sipush 1259 (0x04EB)
		// @04: if_icmpeq @0C
		// @07: aconst_null
		// @08: checkcast game.C_100089_fa
		// @0B: areturn
		// @0C: getstatic java.lang.String[] game.C_100071_va.field_101658_E
		// @0F: iconst_4
		// @10: aaload
		// @11: invokestatic java.lang.Class.forName(java.lang.String)java.lang.Class
		// @14: invokevirtual java.lang.Class.newInstance()java.lang.Object
		// @17: checkcast game.C_100089_fa
		// @1A: areturn
		// @1B: astore_1
		// @1C: aconst_null
		// @1D: areturn
		// @1E: astore_1
		// @1F: aload_1
		// @20: new java.lang.StringBuilder
		// @23: dup
		// @24: invokespecial java.lang.StringBuilder.<init>()void
		// @27: getstatic java.lang.String[] game.C_100071_va.field_101658_E
		// @2A: iconst_5
		// @2B: aaload
		// @2C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2F: iload_0
		// @30: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @33: bipush 41 (0x29)
		// @35: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @38: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3E: athrow
	}
	
	abstract int func_101651_b(boolean arg0);
	
	static final void func_101647_a(int arg0, int arg1, int arg2, int arg3)
	{
		// @00: bipush -123 (0x85)
		// @02: bipush -25 (0xE7)
		// @04: iload_1
		// @05: isub
		// @06: bipush 52 (0x34)
		// @08: idiv
		// @09: irem
		// @0A: istore #4
		// @0C: iload_2
		// @0D: putstatic int game.C_100101_fc.field_103399_Q
		// @10: iload_3
		// @11: putstatic int game.C_100057_dd.field_104257_b
		// @14: iload_0
		// @15: putstatic int game.C_100185_rm.field_105490_h
		// @18: goto @59
		// @1B: astore #4
		// @1D: aload #4
		// @1F: new java.lang.StringBuilder
		// @22: dup
		// @23: invokespecial java.lang.StringBuilder.<init>()void
		// @26: getstatic java.lang.String[] game.C_100071_va.field_101658_E
		// @29: iconst_0
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
		// @44: bipush 44 (0x2C)
		// @46: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @49: iload_3
		// @4A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4D: bipush 41 (0x29)
		// @4F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @52: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @55: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @58: athrow
		// @59: return
	}
	
	static final void func_101656_a(boolean arg0, int arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore_3
		// @04: iconst_m1
		// @05: getstatic int game.C_100212_qc.field_105976_b
		// @08: iconst_m1
		// @09: ixor
		// @0A: if_icmple @68
		// @0D: getstatic game.C_100003_ga game.C_100100_i.field_102024_cc
		// @10: ifnull @33
		// @13: goto @17
		// @16: athrow
		// @17: getstatic game.C_100003_ga game.C_100100_i.field_102024_cc
		// @1A: bipush 125 (0x7D)
		// @1C: invokevirtual game.C_100003_ga.func_103510_a(int)game.C_100009_fg
		// @1F: putstatic game.C_100009_fg game.C_100146_bf.field_105128_n
		// @22: iconst_2
		// @23: iload_1
		// @24: sipush 10389 (0x2895)
		// @27: iadd
		// @28: invokestatic game.C_100061_dh.func_101978_a(int, int)void
		// @2B: iload_3
		// @2C: ifeq @4A
		// @2F: goto @33
		// @32: athrow
		// @33: sipush 640 (0x0280)
		// @36: iconst_0
		// @37: sipush 480 (0x01E0)
		// @3A: bipush -28 (0xE4)
		// @3C: getstatic game.C_100201_qj game.C_100178_cg.field_105692_a
		// @3F: iconst_0
		// @40: invokestatic game.C_100095_fe.func_103374_a(int, int, int, byte, game.C_100201_qj, int)game.C_100009_fg
		// @43: putstatic game.C_100009_fg game.C_100146_bf.field_105128_n
		// @46: goto @4A
		// @49: athrow
		// @4A: aconst_null
		// @4B: getstatic game.C_100009_fg game.C_100146_bf.field_105128_n
		// @4E: if_acmpne @57
		// @51: iconst_3
		// @52: istore_2
		// @53: iload_3
		// @54: ifeq @7C
		// @57: iconst_2
		// @58: istore_2
		// @59: iload_1
		// @5A: sipush 10454 (0x28D6)
		// @5D: iadd
		// @5E: getstatic game.C_100009_fg game.C_100146_bf.field_105128_n
		// @61: invokestatic game.C_100346_ja.func_103477_a(int, java.awt.Canvas)void
		// @64: iload_3
		// @65: ifeq @7C
		// @68: bipush -25 (0xE7)
		// @6A: invokestatic game.C_100234_ob.func_106268_c(byte)boolean
		// @6D: ifeq @7A
		// @70: goto @74
		// @73: athrow
		// @74: iconst_0
		// @75: istore_2
		// @76: iload_3
		// @77: ifeq @7C
		// @7A: iconst_1
		// @7B: istore_2
		// @7C: iload_1
		// @7D: sipush -10365 (0xD783)
		// @80: if_icmpeq @8E
		// @83: aconst_null
		// @84: checkcast java.lang.String
		// @87: putstatic java.lang.String game.C_100071_va.field_101668_y
		// @8A: goto @8E
		// @8D: athrow
		// @8E: getstatic game.C_100003_ga game.C_100100_i.field_102024_cc
		// @91: ifnonnull @A8
		// @94: getstatic boolean game.C_100302_ka.field_101882_Cb
		// @97: ifeq @A8
		// @9A: goto @9E
		// @9D: athrow
		// @9E: iload_2
		// @9F: iconst_1
		// @A0: iload_0
		// @A1: invokestatic game.C_100053_vn.func_102818_a(int, int, boolean)void
		// @A4: goto @A8
		// @A7: athrow
		// @A8: goto @D5
		// @AB: astore_2
		// @AC: aload_2
		// @AD: new java.lang.StringBuilder
		// @B0: dup
		// @B1: invokespecial java.lang.StringBuilder.<init>()void
		// @B4: getstatic java.lang.String[] game.C_100071_va.field_101658_E
		// @B7: iconst_1
		// @B8: aaload
		// @B9: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @BC: iload_0
		// @BD: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @C0: bipush 44 (0x2C)
		// @C2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C5: iload_1
		// @C6: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @C9: bipush 41 (0x29)
		// @CB: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @CE: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @D1: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @D4: athrow
		// @D5: return
	}
	
	static final void func_101653_c(boolean arg0)
	{
		// @00: iload_0
		// @01: ifeq @0D
		// @04: bipush -50 (0xCE)
		// @06: invokestatic game.C_100071_va.func_101654_k(int)void
		// @09: goto @0D
		// @0C: athrow
		// @0D: iconst_1
		// @0E: bipush 17 (0x11)
		// @10: invokestatic game.C_100152_bd.func_105184_a(boolean, int)void
		// @13: goto @38
		// @16: astore_1
		// @17: aload_1
		// @18: new java.lang.StringBuilder
		// @1B: dup
		// @1C: invokespecial java.lang.StringBuilder.<init>()void
		// @1F: getstatic java.lang.String[] game.C_100071_va.field_101658_E
		// @22: bipush 6 (0x06)
		// @24: aaload
		// @25: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @28: iload_0
		// @29: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @2C: bipush 41 (0x29)
		// @2E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @31: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @34: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @37: athrow
		// @38: return
	}
	
	C_100071_va()
	{
		// @0: aload_0
		// @1: invokespecial game.C_100325_id.<init>()void
		// @4: aload_0
		// @5: iconst_1
		// @6: putfield boolean game.C_100071_va.field_101661_C
		// @9: return
	}
	
	static
	{
		// @00: bipush 7 (0x07)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "2\u0017c(\\"
		// @09: invokestatic game.C_100071_va.func_101652_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100071_va.func_101650_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "2\u0017c-\\"
		// @14: invokestatic game.C_100071_va.func_101652_z(java.lang.String)char[]
		// @17: invokestatic game.C_100071_va.func_101650_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "2\u0017c$\\"
		// @1F: invokestatic game.C_100071_va.func_101652_z(java.lang.String)char[]
		// @22: invokestatic game.C_100071_va.func_101650_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "2\u0017c+\\"
		// @2A: invokestatic game.C_100071_va.func_101652_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100071_va.func_101650_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "\"\u001f"
		// @35: invokestatic game.C_100071_va.func_101652_z(java.lang.String)char[]
		// @38: invokestatic game.C_100071_va.func_101650_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "2\u0017c)\\"
		// @40: invokestatic game.C_100071_va.func_101652_z(java.lang.String)char[]
		// @43: invokestatic game.C_100071_va.func_101650_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "2\u0017c.\\"
		// @4C: invokestatic game.C_100071_va.func_101652_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100071_va.func_101650_z(char[])java.lang.String
		// @52: aastore
		// @53: putstatic java.lang.String[] game.C_100071_va.field_101658_E
		// @56: ldc "\u0013\u0013m\u0004\u00152\u0013m\u001f\u0017%\u0018#\t\u0010d\u0002%\tTxS}RT=\u00198L\u0019%\u0018,\u000b\u0011 V9\u0003T \u0013>\u0018\u0006+\u000fm\r\u001a V>\u0019\u0017'\u0013(\u0008\u0011 V$\u0002T6\u0013;\t\u00067\u0013m\t\u001a#\u001f#\t\u00116\u001f#\u000bT-\u0002cL-+\u0003m\u0001\u0015=V#\u0003\u0003d\u0005(\u0000\u0011'\u0002m\u0018\u001c-\u0005m\u000f\u001c%\u0005>\u0005\u0007d\u001f#L\u0000,\u0013mK7+\u0018+\u0005\u00131\u0004,\u0018\u001d+\u0018jL\u0007'\u0004(\t\u001aj"
		// @58: invokestatic game.C_100071_va.func_101652_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100071_va.func_101650_z(char[])java.lang.String
		// @5E: putstatic java.lang.String game.C_100071_va.field_101664_u
		// @61: ldc "\u0010\u000f=\tT=\u00198\u001eT%\u0011(L\u001d*V4\t\u00156\u0005"
		// @63: invokestatic game.C_100071_va.func_101652_z(java.lang.String)char[]
		// @66: invokestatic game.C_100071_va.func_101650_z(char[])java.lang.String
		// @69: putstatic java.lang.String game.C_100071_va.field_101668_y
		// @6C: ldc "\u0014\u0004(\u001f\u0007d\"\u000c.T0\u0019m\u000f\u001c%\u0002m\u0003\u0006d0|\\T0\u0019m\u0003\u0004!\u0018m=\u0001-\u0015&L7,\u00179B"
		// @6E: invokestatic game.C_100071_va.func_101652_z(java.lang.String)char[]
		// @71: invokestatic game.C_100071_va.func_101650_z(char[])java.lang.String
		// @74: putstatic java.lang.String game.C_100071_va.field_101662_w
		// @77: return
	}
	
	private static char[] func_101652_z(String arg0)
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
		// @0E: bipush 116 (0x74)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_101650_z(char[] arg0)
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
		// @30: bipush 68 (0x44)
		// @32: goto @46
		// @35: bipush 118 (0x76)
		// @37: goto @46
		// @3A: bipush 77 (0x4D)
		// @3C: goto @46
		// @3F: bipush 108 (0x6C)
		// @41: goto @46
		// @44: bipush 116 (0x74)
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
