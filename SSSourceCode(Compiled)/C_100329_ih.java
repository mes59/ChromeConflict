package game;

final class C_100329_ih
{
	static String field_107272_a;
	static String field_107269_d;
	static C_100105_eg field_107271_c;
	static String field_107270_b;
	private static final String[] field_107273_z;
	
	static final String func_107263_b(int arg0)
	{
		// @00: iload_0
		// @01: iconst_m1
		// @02: if_icmpeq @0A
		// @05: aconst_null
		// @06: checkcast java.lang.String
		// @09: areturn
		// @0A: getstatic game.C_100068_vc game.C_100222_aa.field_106086_a
		// @0D: getstatic game.C_100068_vc game.C_100148_bh.field_101797_B
		// @10: if_acmpeq @17
		// @13: goto @1B
		// @16: athrow
		// @17: getstatic java.lang.String game.C_100062_dk.field_104282_e
		// @1A: areturn
		// @1B: getstatic java.lang.String game.C_100342_jg.field_102721_Rb
		// @1E: areturn
		// @1F: astore_1
		// @20: aload_1
		// @21: new java.lang.StringBuilder
		// @24: dup
		// @25: invokespecial java.lang.StringBuilder.<init>()void
		// @28: getstatic java.lang.String[] game.C_100329_ih.field_107273_z
		// @2B: iconst_2
		// @2C: aaload
		// @2D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @30: iload_0
		// @31: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @34: bipush 41 (0x29)
		// @36: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @39: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3F: athrow
	}
	
	static final char func_107266_a(int arg0, byte arg1)
	{
		// @00: iload_1
		// @01: sipush 255 (0x00FF)
		// @04: iand
		// @05: istore_2
		// @06: iload_2
		// @07: ifne @2B
		// @0A: new java.lang.IllegalArgumentException
		// @0D: dup
		// @0E: new java.lang.StringBuilder
		// @11: dup
		// @12: invokespecial java.lang.StringBuilder.<init>()void
		// @15: ldc ""
		// @17: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1A: iload_2
		// @1B: bipush 16 (0x10)
		// @1D: invokestatic java.lang.Integer.toString(int, int)java.lang.String
		// @20: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @23: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @26: invokespecial java.lang.IllegalArgumentException.<init>(java.lang.String)void
		// @29: athrow
		// @2A: athrow
		// @2B: sipush 128 (0x0080)
		// @2E: iload_2
		// @2F: if_icmpgt @58
		// @32: iload_2
		// @33: iconst_m1
		// @34: ixor
		// @35: sipush -161 (0xFF5F)
		// @38: if_icmple @58
		// @3B: goto @3F
		// @3E: athrow
		// @3F: getstatic char[] game.C_100133_tk.field_104997_d
		// @42: iload_2
		// @43: bipush -128 (0x80)
		// @45: iadd
		// @46: caload
		// @47: istore_3
		// @48: iload_3
		// @49: iconst_m1
		// @4A: ixor
		// @4B: iconst_m1
		// @4C: if_icmpeq @53
		// @4F: goto @56
		// @52: athrow
		// @53: bipush 63 (0x3F)
		// @55: istore_3
		// @56: iload_3
		// @57: istore_2
		// @58: iload_0
		// @59: bipush -99 (0x9D)
		// @5B: if_icmple @6A
		// @5E: bipush -66 (0xBE)
		// @60: bipush 119 (0x77)
		// @62: invokestatic game.C_100329_ih.func_107266_a(int, byte)char
		// @65: pop
		// @66: goto @6A
		// @69: athrow
		// @6A: iload_2
		// @6B: i2c
		// @6C: ireturn
		// @6D: astore_2
		// @6E: aload_2
		// @6F: new java.lang.StringBuilder
		// @72: dup
		// @73: invokespecial java.lang.StringBuilder.<init>()void
		// @76: getstatic java.lang.String[] game.C_100329_ih.field_107273_z
		// @79: iconst_3
		// @7A: aaload
		// @7B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @7E: iload_0
		// @7F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @82: bipush 44 (0x2C)
		// @84: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @87: iload_1
		// @88: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8B: bipush 41 (0x29)
		// @8D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @90: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @93: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @96: athrow
	}
	
	static final void func_107264_c(int arg0)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #4
		// @05: getstatic game.C_100323_hl game.C_100264_mg.field_106528_i
		// @08: dup
		// @09: astore_1
		// @0A: monitorenter
		// @0B: getstatic int game.C_100057_dd.field_104256_e
		// @0E: iconst_1
		// @0F: iadd
		// @10: putstatic int game.C_100057_dd.field_104256_e
		// @13: iload_0
		// @14: bipush -113 (0x8F)
		// @16: if_icmpeq @20
		// @19: aconst_null
		// @1A: checkcast game.C_100105_eg
		// @1D: putstatic game.C_100105_eg game.C_100329_ih.field_107271_c
		// @20: getstatic int game.C_100007_fm.field_103630_b
		// @23: putstatic int game.C_100077_d.field_103317_U
		// @26: getstatic int game.C_100186_rl.field_105724_b
		// @29: iconst_m1
		// @2A: ixor
		// @2B: iconst_m1
		// @2C: if_icmpgt @80
		// @2F: getstatic int game.C_100186_rl.field_105724_b
		// @32: iconst_m1
		// @33: ixor
		// @34: getstatic int game.C_100003_ga.field_103545_x
		// @37: iconst_m1
		// @38: ixor
		// @39: if_icmpeq @A7
		// @3C: goto @40
		// @3F: athrow
		// @40: getstatic int[] game.C_100290_jm.field_106863_j
		// @43: getstatic int game.C_100003_ga.field_103545_x
		// @46: iaload
		// @47: istore_2
		// @48: bipush 127 (0x7F)
		// @4A: getstatic int game.C_100003_ga.field_103545_x
		// @4D: iconst_1
		// @4E: iadd
		// @4F: iand
		// @50: putstatic int game.C_100003_ga.field_103545_x
		// @53: iload_2
		// @54: iload #4
		// @56: ifne @AA
		// @59: iflt @6F
		// @5C: goto @60
		// @5F: athrow
		// @60: getstatic boolean[] game.C_100309_lk.field_103258_hb
		// @63: iload_2
		// @64: iconst_1
		// @65: bastore
		// @66: iload #4
		// @68: ifeq @7B
		// @6B: goto @6F
		// @6E: athrow
		// @6F: getstatic boolean[] game.C_100309_lk.field_103258_hb
		// @72: iload_2
		// @73: iconst_m1
		// @74: ixor
		// @75: iconst_0
		// @76: bastore
		// @77: goto @7B
		// @7A: athrow
		// @7B: iload #4
		// @7D: ifeq @2F
		// @80: iconst_0
		// @81: istore_2
		// @82: iload_2
		// @83: iconst_m1
		// @84: ixor
		// @85: bipush -113 (0x8F)
		// @87: if_icmple @A1
		// @8A: getstatic boolean[] game.C_100309_lk.field_103258_hb
		// @8D: iload_2
		// @8E: iconst_0
		// @8F: bastore
		// @90: iinc #2 +1
		// @93: iload #4
		// @95: ifne @AF
		// @98: iload #4
		// @9A: ifeq @82
		// @9D: goto @A1
		// @A0: athrow
		// @A1: getstatic int game.C_100003_ga.field_103545_x
		// @A4: putstatic int game.C_100186_rl.field_105724_b
		// @A7: getstatic int game.C_100061_dh.field_101986_fc
		// @AA: putstatic int game.C_100007_fm.field_103630_b
		// @AD: aload_1
		// @AE: monitorexit
		// @AF: goto @B7
		// @B2: astore_3
		// @B3: aload_1
		// @B4: monitorexit
		// @B5: aload_3
		// @B6: athrow
		// @B7: goto @DB
		// @BA: astore_1
		// @BB: aload_1
		// @BC: new java.lang.StringBuilder
		// @BF: dup
		// @C0: invokespecial java.lang.StringBuilder.<init>()void
		// @C3: getstatic java.lang.String[] game.C_100329_ih.field_107273_z
		// @C6: iconst_1
		// @C7: aaload
		// @C8: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @CB: iload_0
		// @CC: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @CF: bipush 41 (0x29)
		// @D1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D4: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @D7: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @DA: athrow
		// @DB: return
	}
	
	public static void func_107265_a(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100329_ih.field_107269_d
		// @04: aconst_null
		// @05: putstatic game.C_100105_eg game.C_100329_ih.field_107271_c
		// @08: aconst_null
		// @09: putstatic java.lang.String game.C_100329_ih.field_107272_a
		// @0C: iload_0
		// @0D: bipush -128 (0x80)
		// @0F: if_icmpeq @1E
		// @12: bipush -12 (0xF4)
		// @14: bipush -108 (0x94)
		// @16: invokestatic game.C_100329_ih.func_107266_a(int, byte)char
		// @19: pop
		// @1A: goto @1E
		// @1D: athrow
		// @1E: aconst_null
		// @1F: putstatic java.lang.String game.C_100329_ih.field_107270_b
		// @22: goto @46
		// @25: astore_1
		// @26: aload_1
		// @27: new java.lang.StringBuilder
		// @2A: dup
		// @2B: invokespecial java.lang.StringBuilder.<init>()void
		// @2E: getstatic java.lang.String[] game.C_100329_ih.field_107273_z
		// @31: iconst_0
		// @32: aaload
		// @33: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @36: iload_0
		// @37: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3A: bipush 41 (0x29)
		// @3C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @42: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @45: athrow
		// @46: return
	}
	
	static
	{
		// @00: iconst_4
		// @01: anewarray java.lang.String
		// @04: dup
		// @05: iconst_0
		// @06: ldc "\\/9\u0008\u001f"
		// @08: invokestatic game.C_100329_ih.func_107268_z(java.lang.String)char[]
		// @0B: invokestatic game.C_100329_ih.func_107267_z(char[])java.lang.String
		// @0E: aastore
		// @0F: dup
		// @10: iconst_1
		// @11: ldc "\\/9\n\u001f"
		// @13: invokestatic game.C_100329_ih.func_107268_z(java.lang.String)char[]
		// @16: invokestatic game.C_100329_ih.func_107267_z(char[])java.lang.String
		// @19: aastore
		// @1A: dup
		// @1B: iconst_2
		// @1C: ldc "\\/9\u000f\u001f"
		// @1E: invokestatic game.C_100329_ih.func_107268_z(java.lang.String)char[]
		// @21: invokestatic game.C_100329_ih.func_107267_z(char[])java.lang.String
		// @24: aastore
		// @25: dup
		// @26: iconst_3
		// @27: ldc "\\/9\t\u001f"
		// @29: invokestatic game.C_100329_ih.func_107268_z(java.lang.String)char[]
		// @2C: invokestatic game.C_100329_ih.func_107267_z(char[])java.lang.String
		// @2F: aastore
		// @30: putstatic java.lang.String[] game.C_100329_ih.field_107273_z
		// @33: ldc "l(b9\u0017G&c\"YRg~8\u0017\tb'u"
		// @35: invokestatic game.C_100329_ih.func_107268_z(java.lang.String)char[]
		// @38: invokestatic game.C_100329_ih.func_107267_z(char[])java.lang.String
		// @3B: putstatic java.lang.String game.C_100329_ih.field_107269_d
		// @3E: ldc "t4|\"YRgq$E\u0015(ekGG(a\"S\\)pkTZ)c*TAg~%QZ5z*C\\(y"
		// @40: invokestatic game.C_100329_ih.func_107268_z(java.lang.String)char[]
		// @43: invokestatic game.C_100329_ih.func_107267_z(char[])java.lang.String
		// @46: putstatic java.lang.String game.C_100329_ih.field_107272_a
		// @49: ldc "f\u0017V\u0008r"
		// @4B: invokestatic game.C_100329_ih.func_107268_z(java.lang.String)char[]
		// @4E: invokestatic game.C_100329_ih.func_107267_z(char[])java.lang.String
		// @51: putstatic java.lang.String game.C_100329_ih.field_107270_b
		// @54: return
	}
	
	private static char[] func_107268_z(String arg0)
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
		// @0E: bipush 55 (0x37)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_107267_z(char[] arg0)
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
		// @30: bipush 53 (0x35)
		// @32: goto @46
		// @35: bipush 71 (0x47)
		// @37: goto @46
		// @3A: bipush 23 (0x17)
		// @3C: goto @46
		// @3F: bipush 75 (0x4B)
		// @41: goto @46
		// @44: bipush 55 (0x37)
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
