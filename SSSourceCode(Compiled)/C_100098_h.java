package game;

import java.awt.Component;

final class C_100098_h
{
	private Object[][] field_104615_e;
	private Object[] field_104620_h;
	static int field_104612_f;
	boolean field_104621_i;
	private C_100254_pi field_104618_a;
	static String field_104616_b;
	private C_100080_b field_104617_c;
	int field_104614_d;
	static C_100302_ka field_104613_g;
	private static final String[] field_104619_z;
	
	final synchronized int func_104590_b(boolean arg0)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #5
		// @05: aload_0
		// @06: iload_1
		// @07: invokevirtual game.C_100098_h.func_104597_a(boolean)boolean
		// @0A: ifne @0F
		// @0D: iconst_0
		// @0E: ireturn
		// @0F: iconst_0
		// @10: istore_2
		// @11: iconst_0
		// @12: istore_3
		// @13: iconst_0
		// @14: istore #4
		// @16: iload #4
		// @18: iconst_m1
		// @19: ixor
		// @1A: aload_0
		// @1B: getfield java.lang.Object[] game.C_100098_h.field_104620_h
		// @1E: arraylength
		// @1F: iconst_m1
		// @20: ixor
		// @21: if_icmple @54
		// @24: aload_0
		// @25: getfield game.C_100254_pi game.C_100098_h.field_104618_a
		// @28: getfield int[] game.C_100254_pi.field_106453_n
		// @2B: iload #4
		// @2D: iaload
		// @2E: iload #5
		// @30: ifne @55
		// @33: ifgt @3D
		// @36: goto @3A
		// @39: athrow
		// @3A: goto @4C
		// @3D: iinc #2 +100
		// @40: iload_3
		// @41: aload_0
		// @42: iload #4
		// @44: sipush -12578 (0xCEDE)
		// @47: invokevirtual game.C_100098_h.func_104594_a(int, int)int
		// @4A: iadd
		// @4B: istore_3
		// @4C: iinc #4 +1
		// @4F: iload #5
		// @51: ifeq @16
		// @54: iload_2
		// @55: ifeq @5B
		// @58: goto @5E
		// @5B: bipush 100 (0x64)
		// @5D: ireturn
		// @5E: bipush 100 (0x64)
		// @60: iload_3
		// @61: imul
		// @62: iload_2
		// @63: idiv
		// @64: istore #4
		// @66: iload #4
		// @68: ireturn
		// @69: astore_2
		// @6A: aload_2
		// @6B: new java.lang.StringBuilder
		// @6E: dup
		// @6F: invokespecial java.lang.StringBuilder.<init>()void
		// @72: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @75: bipush 23 (0x17)
		// @77: aaload
		// @78: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @7B: iload_1
		// @7C: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @7F: bipush 41 (0x29)
		// @81: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @84: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @87: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @8A: athrow
	}
	
	final int func_104591_c(int arg0, int arg1)
	{
		// @00: aload_0
		// @01: iload_2
		// @02: iconst_0
		// @03: invokespecial game.C_100098_h.func_104603_a(int, boolean)boolean
		// @06: ifne @0B
		// @09: iconst_0
		// @0A: ireturn
		// @0B: iload_1
		// @0C: bipush 21 (0x15)
		// @0E: if_icmpgt @21
		// @11: aload_0
		// @12: getfield java.lang.Object[] game.C_100098_h.field_104620_h
		// @15: iconst_3
		// @16: aaload
		// @17: checkcast int[]
		// @1A: checkcast int[]
		// @1D: bipush 8 (0x08)
		// @1F: iaload
		// @20: ireturn
		// @21: aload_0
		// @22: getfield game.C_100254_pi game.C_100098_h.field_104618_a
		// @25: getfield int[] game.C_100254_pi.field_106454_o
		// @28: iload_2
		// @29: iaload
		// @2A: ireturn
		// @2B: astore_3
		// @2C: aload_3
		// @2D: new java.lang.StringBuilder
		// @30: dup
		// @31: invokespecial java.lang.StringBuilder.<init>()void
		// @34: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @37: bipush 21 (0x15)
		// @39: aaload
		// @3A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3D: iload_1
		// @3E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
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
	
	final synchronized int func_104594_a(int arg0, int arg1)
	{
		// @00: aload_0
		// @01: iload_1
		// @02: iconst_0
		// @03: invokespecial game.C_100098_h.func_104603_a(int, boolean)boolean
		// @06: ifne @0B
		// @09: iconst_0
		// @0A: ireturn
		// @0B: iload_2
		// @0C: sipush -12578 (0xCEDE)
		// @0F: if_icmpeq @32
		// @12: aload_0
		// @13: aload_0
		// @14: getfield java.lang.Object[] game.C_100098_h.field_104620_h
		// @17: bipush 18 (0x12)
		// @19: aaload
		// @1A: checkcast byte[]
		// @1D: checkcast byte[]
		// @20: iconst_5
		// @21: baload
		// @22: bipush 91 (0x5B)
		// @24: aconst_null
		// @25: checkcast int[]
		// @28: bipush 14 (0x0E)
		// @2A: invokespecial game.C_100098_h.func_104606_a(byte, int, int[], int)boolean
		// @2D: pop
		// @2E: goto @32
		// @31: athrow
		// @32: aload_0
		// @33: getfield java.lang.Object[] game.C_100098_h.field_104620_h
		// @36: iload_1
		// @37: aaload
		// @38: ifnonnull @3F
		// @3B: goto @42
		// @3E: athrow
		// @3F: bipush 100 (0x64)
		// @41: ireturn
		// @42: aload_0
		// @43: getfield game.C_100080_b game.C_100098_h.field_104617_c
		// @46: sipush -20930 (0xAE3E)
		// @49: iload_1
		// @4A: invokevirtual game.C_100080_b.func_104423_b(int, int)int
		// @4D: ireturn
		// @4E: astore_3
		// @4F: aload_3
		// @50: new java.lang.StringBuilder
		// @53: dup
		// @54: invokespecial java.lang.StringBuilder.<init>()void
		// @57: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @5A: bipush 8 (0x08)
		// @5C: aaload
		// @5D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @60: iload_1
		// @61: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @64: bipush 44 (0x2C)
		// @66: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @69: iload_2
		// @6A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6D: bipush 41 (0x29)
		// @6F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @72: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @75: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @78: athrow
	}
	
	final boolean func_104593_a(String arg0, boolean arg1)
	{
		// @00: aload_0
		// @01: iload_2
		// @02: invokevirtual game.C_100098_h.func_104597_a(boolean)boolean
		// @05: ifne @0A
		// @08: iconst_0
		// @09: ireturn
		// @0A: aload_1
		// @0B: invokevirtual java.lang.String.toLowerCase()java.lang.String
		// @0E: astore_1
		// @0F: aload_0
		// @10: getfield game.C_100254_pi game.C_100098_h.field_104618_a
		// @13: getfield game.C_100263_mb game.C_100254_pi.field_106446_f
		// @16: bipush 84 (0x54)
		// @18: bipush -59 (0xC5)
		// @1A: aload_1
		// @1B: invokestatic game.C_100091_m.func_104506_a(int, java.lang.CharSequence)int
		// @1E: invokevirtual game.C_100263_mb.func_106504_a(int, int)int
		// @21: istore_3
		// @22: aload_0
		// @23: iload_3
		// @24: bipush 9 (0x09)
		// @26: invokevirtual game.C_100098_h.func_104605_d(int, int)boolean
		// @29: ireturn
		// @2A: astore_3
		// @2B: aload_3
		// @2C: new java.lang.StringBuilder
		// @2F: dup
		// @30: invokespecial java.lang.StringBuilder.<init>()void
		// @33: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @36: bipush 11 (0x0B)
		// @38: aaload
		// @39: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3C: aload_1
		// @3D: ifnull @49
		// @40: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @43: iconst_2
		// @44: aaload
		// @45: goto @4E
		// @48: athrow
		// @49: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @4C: iconst_1
		// @4D: aaload
		// @4E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @51: bipush 44 (0x2C)
		// @53: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @56: iload_2
		// @57: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @5A: bipush 41 (0x29)
		// @5C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @62: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @65: athrow
	}
	
	static final void func_104586_a(C_100201_qj arg0, int arg1, boolean arg2, int arg3, Component arg4, boolean arg5, C_100210_qa arg6, int arg7)
	{
		// @000: iload_3
		// @001: iload #5
		// @003: bipush 10 (0x0A)
		// @005: invokestatic game.C_100177_cj.func_105643_a(int, boolean, int)void
		// @008: aload_0
		// @009: aload #4
		// @00B: iconst_0
		// @00C: iload_1
		// @00D: invokestatic game.C_100177_cj.func_105635_a(game.C_100201_qj, java.awt.Component, int, int)game.C_100177_cj
		// @010: putstatic game.C_100177_cj game.C_100313_lg.field_107164_d
		// @013: aload_0
		// @014: aload #4
		// @016: iconst_1
		// @017: iload #7
		// @019: invokestatic game.C_100177_cj.func_105635_a(game.C_100201_qj, java.awt.Component, int, int)game.C_100177_cj
		// @01C: putstatic game.C_100177_cj game.C_100341_jd.field_102643_gb
		// @01F: new game.C_100026_hb
		// @022: dup
		// @023: invokespecial game.C_100026_hb.<init>()void
		// @026: putstatic game.C_100026_hb game.C_100059_df.field_101599_L
		// @029: iload #7
		// @02B: sipush 1000 (0x03E8)
		// @02E: imul
		// @02F: iload_3
		// @030: idiv
		// @031: putstatic int game.C_100176_ci.field_105626_a
		// @034: getstatic game.C_100177_cj game.C_100341_jd.field_102643_gb
		// @037: getstatic game.C_100026_hb game.C_100059_df.field_101599_L
		// @03A: invokevirtual game.C_100177_cj.func_105644_a(game.C_100261_md)void
		// @03D: iload_2
		// @03E: iconst_1
		// @03F: if_icmpeq @04D
		// @042: aconst_null
		// @043: checkcast game.C_100302_ka
		// @046: putstatic game.C_100302_ka game.C_100098_h.field_104613_g
		// @049: goto @04D
		// @04C: athrow
		// @04D: aload #6
		// @04F: putstatic game.C_100210_qa game.C_100004_gb.field_103576_k
		// @052: getstatic game.C_100210_qa game.C_100004_gb.field_103576_k
		// @055: bipush -126 (0x82)
		// @057: getstatic int game.C_100346_ja.field_103498_y
		// @05A: invokevirtual game.C_100210_qa.func_101039_b(int, int)void
		// @05D: getstatic game.C_100177_cj game.C_100313_lg.field_107164_d
		// @060: getstatic game.C_100210_qa game.C_100004_gb.field_103576_k
		// @063: invokevirtual game.C_100177_cj.func_105644_a(game.C_100261_md)void
		// @066: goto @103
		// @069: astore #8
		// @06B: aload #8
		// @06D: new java.lang.StringBuilder
		// @070: dup
		// @071: invokespecial java.lang.StringBuilder.<init>()void
		// @074: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @077: bipush 14 (0x0E)
		// @079: aaload
		// @07A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @07D: aload_0
		// @07E: ifnull @08A
		// @081: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @084: iconst_2
		// @085: aaload
		// @086: goto @08F
		// @089: athrow
		// @08A: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @08D: iconst_1
		// @08E: aaload
		// @08F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @092: bipush 44 (0x2C)
		// @094: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @097: iload_1
		// @098: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @09B: bipush 44 (0x2C)
		// @09D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0A0: iload_2
		// @0A1: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @0A4: bipush 44 (0x2C)
		// @0A6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0A9: iload_3
		// @0AA: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0AD: bipush 44 (0x2C)
		// @0AF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0B2: aload #4
		// @0B4: ifnull @0C0
		// @0B7: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @0BA: iconst_2
		// @0BB: aaload
		// @0BC: goto @0C5
		// @0BF: athrow
		// @0C0: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @0C3: iconst_1
		// @0C4: aaload
		// @0C5: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0C8: bipush 44 (0x2C)
		// @0CA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0CD: iload #5
		// @0CF: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @0D2: bipush 44 (0x2C)
		// @0D4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0D7: aload #6
		// @0D9: ifnull @0E5
		// @0DC: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @0DF: iconst_2
		// @0E0: aaload
		// @0E1: goto @0EA
		// @0E4: athrow
		// @0E5: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @0E8: iconst_1
		// @0E9: aaload
		// @0EA: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0ED: bipush 44 (0x2C)
		// @0EF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0F2: iload #7
		// @0F4: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0F7: bipush 41 (0x29)
		// @0F9: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0FC: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @0FF: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @102: athrow
		// @103: return
	}
	
	final synchronized byte[] func_104595_b(int arg0, int arg1)
	{
		// @00: aload_0
		// @01: iconst_0
		// @02: invokevirtual game.C_100098_h.func_104597_a(boolean)boolean
		// @05: ifeq @0C
		// @08: goto @0E
		// @0B: athrow
		// @0C: aconst_null
		// @0D: areturn
		// @0E: iconst_1
		// @0F: aload_0
		// @10: getfield game.C_100254_pi game.C_100098_h.field_104618_a
		// @13: getfield int[] game.C_100254_pi.field_106454_o
		// @16: arraylength
		// @17: if_icmpeq @1E
		// @1A: goto @26
		// @1D: athrow
		// @1E: aload_0
		// @1F: iconst_0
		// @20: iconst_0
		// @21: iload_2
		// @22: invokevirtual game.C_100098_h.func_104610_b(int, int, int)byte[]
		// @25: areturn
		// @26: aload_0
		// @27: iload_2
		// @28: iconst_0
		// @29: invokespecial game.C_100098_h.func_104603_a(int, boolean)boolean
		// @2C: ifne @31
		// @2F: aconst_null
		// @30: areturn
		// @31: aload_0
		// @32: getfield game.C_100254_pi game.C_100098_h.field_104618_a
		// @35: getfield int[] game.C_100254_pi.field_106454_o
		// @38: iload_2
		// @39: iaload
		// @3A: iconst_1
		// @3B: if_icmpne @46
		// @3E: aload_0
		// @3F: iload_2
		// @40: iconst_0
		// @41: iconst_0
		// @42: invokevirtual game.C_100098_h.func_104610_b(int, int, int)byte[]
		// @45: areturn
		// @46: iload_1
		// @47: ifeq @4F
		// @4A: aconst_null
		// @4B: checkcast byte[]
		// @4E: areturn
		// @4F: new java.lang.RuntimeException
		// @52: dup
		// @53: invokespecial java.lang.RuntimeException.<init>()void
		// @56: athrow
		// @57: astore_3
		// @58: aload_3
		// @59: new java.lang.StringBuilder
		// @5C: dup
		// @5D: invokespecial java.lang.StringBuilder.<init>()void
		// @60: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @63: bipush 26 (0x1A)
		// @65: aaload
		// @66: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @69: iload_1
		// @6A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6D: bipush 44 (0x2C)
		// @6F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @72: iload_2
		// @73: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @76: bipush 41 (0x29)
		// @78: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @7E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @81: athrow
	}
	
	final synchronized boolean func_104605_d(int arg0, int arg1)
	{
		// @00: aload_0
		// @01: iload_1
		// @02: iconst_0
		// @03: invokespecial game.C_100098_h.func_104603_a(int, boolean)boolean
		// @06: ifeq @0D
		// @09: goto @0F
		// @0C: athrow
		// @0D: iconst_0
		// @0E: ireturn
		// @0F: aload_0
		// @10: getfield java.lang.Object[] game.C_100098_h.field_104620_h
		// @13: iload_1
		// @14: aaload
		// @15: ifnonnull @1C
		// @18: goto @1E
		// @1B: athrow
		// @1C: iconst_1
		// @1D: ireturn
		// @1E: aload_0
		// @1F: iload_1
		// @20: bipush -13 (0xF3)
		// @22: invokespecial game.C_100098_h.func_104592_a(int, byte)void
		// @25: bipush 15 (0x0F)
		// @27: bipush -60 (0xC4)
		// @29: iload_2
		// @2A: isub
		// @2B: bipush 50 (0x32)
		// @2D: idiv
		// @2E: irem
		// @2F: istore_3
		// @30: aload_0
		// @31: getfield java.lang.Object[] game.C_100098_h.field_104620_h
		// @34: iload_1
		// @35: aaload
		// @36: ifnonnull @3D
		// @39: goto @3F
		// @3C: athrow
		// @3D: iconst_1
		// @3E: ireturn
		// @3F: iconst_0
		// @40: ireturn
		// @41: astore_3
		// @42: aload_3
		// @43: new java.lang.StringBuilder
		// @46: dup
		// @47: invokespecial java.lang.StringBuilder.<init>()void
		// @4A: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @4D: iconst_0
		// @4E: aaload
		// @4F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @52: iload_1
		// @53: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @56: bipush 44 (0x2C)
		// @58: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5B: iload_2
		// @5C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5F: bipush 41 (0x29)
		// @61: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @64: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @67: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @6A: athrow
	}
	
	private final synchronized void func_104592_a(int arg0, byte arg1)
	{
		// @00: aload_0
		// @01: getfield boolean game.C_100098_h.field_104621_i
		// @04: ifne @22
		// @07: aload_0
		// @08: getfield java.lang.Object[] game.C_100098_h.field_104620_h
		// @0B: iload_1
		// @0C: sipush -137 (0xFF77)
		// @0F: iconst_0
		// @10: aload_0
		// @11: getfield game.C_100080_b game.C_100098_h.field_104617_c
		// @14: bipush 14 (0x0E)
		// @16: iload_1
		// @17: invokevirtual game.C_100080_b.func_104425_a(int, int)byte[]
		// @1A: invokestatic game.C_100056_de.func_103176_a(int, boolean, byte[])java.lang.Object
		// @1D: aastore
		// @1E: goto @34
		// @21: athrow
		// @22: aload_0
		// @23: getfield java.lang.Object[] game.C_100098_h.field_104620_h
		// @26: iload_1
		// @27: aload_0
		// @28: getfield game.C_100080_b game.C_100098_h.field_104617_c
		// @2B: iload_2
		// @2C: bipush 27 (0x1B)
		// @2E: iadd
		// @2F: iload_1
		// @30: invokevirtual game.C_100080_b.func_104425_a(int, int)byte[]
		// @33: aastore
		// @34: iload_2
		// @35: bipush -13 (0xF3)
		// @37: if_icmpeq @4E
		// @3A: aload_0
		// @3B: getfield java.lang.Object[] game.C_100098_h.field_104620_h
		// @3E: iconst_3
		// @3F: aaload
		// @40: checkcast int[]
		// @43: checkcast int[]
		// @46: iconst_0
		// @47: bipush 48 (0x30)
		// @49: iastore
		// @4A: goto @4E
		// @4D: athrow
		// @4E: goto @7C
		// @51: astore_3
		// @52: aload_3
		// @53: new java.lang.StringBuilder
		// @56: dup
		// @57: invokespecial java.lang.StringBuilder.<init>()void
		// @5A: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @5D: bipush 25 (0x19)
		// @5F: aaload
		// @60: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @63: iload_1
		// @64: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @67: bipush 44 (0x2C)
		// @69: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6C: iload_2
		// @6D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @70: bipush 41 (0x29)
		// @72: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @75: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @78: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @7B: athrow
		// @7C: return
	}
	
	private final synchronized boolean func_104603_a(int arg0, boolean arg1)
	{
		// @00: iload_2
		// @01: ifeq @06
		// @04: iconst_1
		// @05: ireturn
		// @06: aload_0
		// @07: iload_2
		// @08: invokevirtual game.C_100098_h.func_104597_a(boolean)boolean
		// @0B: ifeq @12
		// @0E: goto @14
		// @11: athrow
		// @12: iconst_0
		// @13: ireturn
		// @14: iload_1
		// @15: iconst_m1
		// @16: ixor
		// @17: iconst_m1
		// @18: if_icmpgt @46
		// @1B: aload_0
		// @1C: getfield game.C_100254_pi game.C_100098_h.field_104618_a
		// @1F: getfield int[] game.C_100254_pi.field_106454_o
		// @22: arraylength
		// @23: iconst_m1
		// @24: ixor
		// @25: iload_1
		// @26: iconst_m1
		// @27: ixor
		// @28: if_icmpge @46
		// @2B: goto @2F
		// @2E: athrow
		// @2F: aload_0
		// @30: getfield game.C_100254_pi game.C_100098_h.field_104618_a
		// @33: getfield int[] game.C_100254_pi.field_106454_o
		// @36: iload_1
		// @37: iaload
		// @38: iconst_m1
		// @39: ixor
		// @3A: iconst_m1
		// @3B: if_icmpeq @46
		// @3E: goto @42
		// @41: athrow
		// @42: goto @5A
		// @45: athrow
		// @46: getstatic boolean game.C_100142_bk.field_105090_a
		// @49: ifne @4E
		// @4C: iconst_0
		// @4D: ireturn
		// @4E: new java.lang.IllegalArgumentException
		// @51: dup
		// @52: iload_1
		// @53: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @56: invokespecial java.lang.IllegalArgumentException.<init>(java.lang.String)void
		// @59: athrow
		// @5A: iconst_1
		// @5B: ireturn
		// @5C: astore_3
		// @5D: aload_3
		// @5E: new java.lang.StringBuilder
		// @61: dup
		// @62: invokespecial java.lang.StringBuilder.<init>()void
		// @65: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @68: bipush 19 (0x13)
		// @6A: aaload
		// @6B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @6E: iload_1
		// @6F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @72: bipush 44 (0x2C)
		// @74: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @77: iload_2
		// @78: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @7B: bipush 41 (0x29)
		// @7D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @80: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @83: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @86: athrow
	}
	
	private final synchronized boolean func_104609_a(int arg0, int arg1, int arg2)
	{
		// @00: iload_3
		// @01: sipush -2148 (0xF79C)
		// @04: if_icmpeq @13
		// @07: aload_0
		// @08: aconst_null
		// @09: checkcast game.C_100254_pi
		// @0C: putfield game.C_100254_pi game.C_100098_h.field_104618_a
		// @0F: goto @13
		// @12: athrow
		// @13: aload_0
		// @14: iconst_0
		// @15: invokevirtual game.C_100098_h.func_104597_a(boolean)boolean
		// @18: ifne @1D
		// @1B: iconst_0
		// @1C: ireturn
		// @1D: iconst_0
		// @1E: iload_2
		// @1F: if_icmpgt @4F
		// @22: iload_1
		// @23: iflt @4F
		// @26: goto @2A
		// @29: athrow
		// @2A: aload_0
		// @2B: getfield game.C_100254_pi game.C_100098_h.field_104618_a
		// @2E: getfield int[] game.C_100254_pi.field_106454_o
		// @31: arraylength
		// @32: iload_2
		// @33: if_icmple @4F
		// @36: goto @3A
		// @39: athrow
		// @3A: aload_0
		// @3B: getfield game.C_100254_pi game.C_100098_h.field_104618_a
		// @3E: getfield int[] game.C_100254_pi.field_106454_o
		// @41: iload_2
		// @42: iaload
		// @43: iload_1
		// @44: if_icmple @4F
		// @47: goto @4B
		// @4A: athrow
		// @4B: goto @77
		// @4E: athrow
		// @4F: getstatic boolean game.C_100142_bk.field_105090_a
		// @52: ifeq @75
		// @55: new java.lang.IllegalArgumentException
		// @58: dup
		// @59: new java.lang.StringBuilder
		// @5C: dup
		// @5D: invokespecial java.lang.StringBuilder.<init>()void
		// @60: iload_2
		// @61: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @64: ldc " "
		// @66: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @69: iload_1
		// @6A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @70: invokespecial java.lang.IllegalArgumentException.<init>(java.lang.String)void
		// @73: athrow
		// @74: athrow
		// @75: iconst_0
		// @76: ireturn
		// @77: iconst_1
		// @78: ireturn
		// @79: astore #4
		// @7B: aload #4
		// @7D: new java.lang.StringBuilder
		// @80: dup
		// @81: invokespecial java.lang.StringBuilder.<init>()void
		// @84: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @87: bipush 16 (0x10)
		// @89: aaload
		// @8A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @8D: iload_1
		// @8E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @91: bipush 44 (0x2C)
		// @93: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @96: iload_2
		// @97: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @9A: bipush 44 (0x2C)
		// @9C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9F: iload_3
		// @A0: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A3: bipush 41 (0x29)
		// @A5: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A8: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @AB: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @AE: athrow
	}
	
	final synchronized boolean func_104604_c(int arg0, int arg1, int arg2)
	{
		// @00: aload_0
		// @01: iload_2
		// @02: iload_3
		// @03: sipush -2148 (0xF79C)
		// @06: invokespecial game.C_100098_h.func_104609_a(int, int, int)boolean
		// @09: ifeq @10
		// @0C: goto @12
		// @0F: athrow
		// @10: iconst_0
		// @11: ireturn
		// @12: aconst_null
		// @13: aload_0
		// @14: getfield java.lang.Object[][] game.C_100098_h.field_104615_e
		// @17: iload_3
		// @18: aaload
		// @19: if_acmpeq @2D
		// @1C: aload_0
		// @1D: getfield java.lang.Object[][] game.C_100098_h.field_104615_e
		// @20: iload_3
		// @21: aaload
		// @22: iload_2
		// @23: aaload
		// @24: ifnull @2D
		// @27: goto @2B
		// @2A: athrow
		// @2B: iconst_1
		// @2C: ireturn
		// @2D: iload_1
		// @2E: sipush 10894 (0x2A8E)
		// @31: if_icmpeq @40
		// @34: aload_0
		// @35: aconst_null
		// @36: checkcast java.lang.Object[]
		// @39: putfield java.lang.Object[] game.C_100098_h.field_104620_h
		// @3C: goto @40
		// @3F: athrow
		// @40: aconst_null
		// @41: aload_0
		// @42: getfield java.lang.Object[] game.C_100098_h.field_104620_h
		// @45: iload_3
		// @46: aaload
		// @47: if_acmpne @4E
		// @4A: goto @50
		// @4D: athrow
		// @4E: iconst_1
		// @4F: ireturn
		// @50: aload_0
		// @51: iload_3
		// @52: bipush -13 (0xF3)
		// @54: invokespecial game.C_100098_h.func_104592_a(int, byte)void
		// @57: aconst_null
		// @58: aload_0
		// @59: getfield java.lang.Object[] game.C_100098_h.field_104620_h
		// @5C: iload_3
		// @5D: aaload
		// @5E: if_acmpne @65
		// @61: goto @67
		// @64: athrow
		// @65: iconst_1
		// @66: ireturn
		// @67: iconst_0
		// @68: ireturn
		// @69: astore #4
		// @6B: aload #4
		// @6D: new java.lang.StringBuilder
		// @70: dup
		// @71: invokespecial java.lang.StringBuilder.<init>()void
		// @74: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @77: bipush 7 (0x07)
		// @79: aaload
		// @7A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @7D: iload_1
		// @7E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @81: bipush 44 (0x2C)
		// @83: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @86: iload_2
		// @87: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8A: bipush 44 (0x2C)
		// @8C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8F: iload_3
		// @90: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @93: bipush 41 (0x29)
		// @95: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @98: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @9B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @9E: athrow
	}
	
	final int func_104602_a(byte arg0, String arg1)
	{
		// @00: aload_0
		// @01: iconst_0
		// @02: invokevirtual game.C_100098_h.func_104597_a(boolean)boolean
		// @05: ifne @0A
		// @08: iconst_0
		// @09: ireturn
		// @0A: aload_2
		// @0B: invokevirtual java.lang.String.toLowerCase()java.lang.String
		// @0E: astore_2
		// @0F: aload_0
		// @10: getfield game.C_100254_pi game.C_100098_h.field_104618_a
		// @13: getfield game.C_100263_mb game.C_100254_pi.field_106446_f
		// @16: bipush 103 (0x67)
		// @18: bipush -85 (0xAB)
		// @1A: aload_2
		// @1B: invokestatic game.C_100091_m.func_104506_a(int, java.lang.CharSequence)int
		// @1E: invokevirtual game.C_100263_mb.func_106504_a(int, int)int
		// @21: istore_3
		// @22: bipush 11 (0x0B)
		// @24: bipush 52 (0x34)
		// @26: iload_1
		// @27: isub
		// @28: bipush 45 (0x2D)
		// @2A: idiv
		// @2B: idiv
		// @2C: istore #4
		// @2E: aload_0
		// @2F: iload_3
		// @30: sipush -12578 (0xCEDE)
		// @33: invokevirtual game.C_100098_h.func_104594_a(int, int)int
		// @36: ireturn
		// @37: astore_3
		// @38: aload_3
		// @39: new java.lang.StringBuilder
		// @3C: dup
		// @3D: invokespecial java.lang.StringBuilder.<init>()void
		// @40: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @43: iconst_3
		// @44: aaload
		// @45: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @48: iload_1
		// @49: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4C: bipush 44 (0x2C)
		// @4E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @51: aload_2
		// @52: ifnull @5E
		// @55: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @58: iconst_2
		// @59: aaload
		// @5A: goto @63
		// @5D: athrow
		// @5E: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @61: iconst_1
		// @62: aaload
		// @63: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @66: bipush 41 (0x29)
		// @68: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @6E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @71: athrow
	}
	
	final synchronized boolean func_104598_a(int arg0)
	{
		// @00: aload_0
		// @01: iconst_0
		// @02: invokevirtual game.C_100098_h.func_104597_a(boolean)boolean
		// @05: ifne @0A
		// @08: iconst_0
		// @09: ireturn
		// @0A: iconst_1
		// @0B: istore_2
		// @0C: iload_1
		// @0D: istore_3
		// @0E: aload_0
		// @0F: getfield game.C_100254_pi game.C_100098_h.field_104618_a
		// @12: getfield int[] game.C_100254_pi.field_106455_l
		// @15: arraylength
		// @16: iconst_m1
		// @17: ixor
		// @18: iload_3
		// @19: iconst_m1
		// @1A: ixor
		// @1B: if_icmpge @52
		// @1E: aload_0
		// @1F: getfield game.C_100254_pi game.C_100098_h.field_104618_a
		// @22: getfield int[] game.C_100254_pi.field_106455_l
		// @25: iload_3
		// @26: iaload
		// @27: istore #4
		// @29: aconst_null
		// @2A: aload_0
		// @2B: getfield java.lang.Object[] game.C_100098_h.field_104620_h
		// @2E: iload #4
		// @30: aaload
		// @31: if_acmpne @4C
		// @34: aload_0
		// @35: iload #4
		// @37: bipush -13 (0xF3)
		// @39: invokespecial game.C_100098_h.func_104592_a(int, byte)void
		// @3C: aload_0
		// @3D: getfield java.lang.Object[] game.C_100098_h.field_104620_h
		// @40: iload #4
		// @42: aaload
		// @43: ifnonnull @4C
		// @46: goto @4A
		// @49: athrow
		// @4A: iconst_0
		// @4B: istore_2
		// @4C: iinc #3 +1
		// @4F: goto @0E
		// @52: iload_2
		// @53: ireturn
		// @54: astore_2
		// @55: aload_2
		// @56: new java.lang.StringBuilder
		// @59: dup
		// @5A: invokespecial java.lang.StringBuilder.<init>()void
		// @5D: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @60: bipush 10 (0x0A)
		// @62: aaload
		// @63: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @66: iload_1
		// @67: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6A: bipush 41 (0x29)
		// @6C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @72: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @75: athrow
	}
	
	private final synchronized byte[] func_104599_a(int[] arg0, int arg1, int arg2, int arg3)
	{
		// @000: iload_2
		// @001: ifeq @023
		// @004: aload_0
		// @005: aconst_null
		// @006: checkcast int[]
		// @009: bipush 32 (0x20)
		// @00B: bipush 82 (0x52)
		// @00D: aload_0
		// @00E: getfield java.lang.Object[] game.C_100098_h.field_104620_h
		// @011: iconst_3
		// @012: aaload
		// @013: checkcast int[]
		// @016: checkcast int[]
		// @019: iconst_1
		// @01A: iaload
		// @01B: invokespecial game.C_100098_h.func_104599_a(int[], int, int, int)byte[]
		// @01E: pop
		// @01F: goto @023
		// @022: athrow
		// @023: aload_0
		// @024: iload_3
		// @025: iload #4
		// @027: sipush -2148 (0xF79C)
		// @02A: invokespecial game.C_100098_h.func_104609_a(int, int, int)boolean
		// @02D: ifne @032
		// @030: aconst_null
		// @031: areturn
		// @032: aconst_null
		// @033: astore #5
		// @035: aload_0
		// @036: getfield java.lang.Object[][] game.C_100098_h.field_104615_e
		// @039: iload #4
		// @03B: aaload
		// @03C: ifnull @050
		// @03F: aconst_null
		// @040: aload_0
		// @041: getfield java.lang.Object[][] game.C_100098_h.field_104615_e
		// @044: iload #4
		// @046: aaload
		// @047: iload_3
		// @048: aaload
		// @049: if_acmpne @080
		// @04C: goto @050
		// @04F: athrow
		// @050: aload_0
		// @051: bipush -2 (0xFE)
		// @053: iload_3
		// @054: aload_1
		// @055: iload #4
		// @057: invokespecial game.C_100098_h.func_104606_a(byte, int, int[], int)boolean
		// @05A: istore #6
		// @05C: iload #6
		// @05E: ifne @080
		// @061: aload_0
		// @062: iload #4
		// @064: bipush -13 (0xF3)
		// @066: invokespecial game.C_100098_h.func_104592_a(int, byte)void
		// @069: aload_0
		// @06A: bipush -2 (0xFE)
		// @06C: iload_3
		// @06D: aload_1
		// @06E: iload #4
		// @070: invokespecial game.C_100098_h.func_104606_a(byte, int, int[], int)boolean
		// @073: istore #6
		// @075: iload #6
		// @077: ifeq @07E
		// @07A: goto @080
		// @07D: athrow
		// @07E: aconst_null
		// @07F: areturn
		// @080: aconst_null
		// @081: aload_0
		// @082: getfield java.lang.Object[][] game.C_100098_h.field_104615_e
		// @085: iload #4
		// @087: aaload
		// @088: if_acmpeq @08F
		// @08B: goto @099
		// @08E: athrow
		// @08F: new java.lang.RuntimeException
		// @092: dup
		// @093: ldc ""
		// @095: invokespecial java.lang.RuntimeException.<init>(java.lang.String)void
		// @098: athrow
		// @099: aconst_null
		// @09A: aload_0
		// @09B: getfield java.lang.Object[][] game.C_100098_h.field_104615_e
		// @09E: iload #4
		// @0A0: aaload
		// @0A1: iload_3
		// @0A2: aaload
		// @0A3: if_acmpne @0AA
		// @0A6: goto @0CF
		// @0A9: athrow
		// @0AA: bipush 52 (0x34)
		// @0AC: iconst_0
		// @0AD: aload_0
		// @0AE: getfield java.lang.Object[][] game.C_100098_h.field_104615_e
		// @0B1: iload #4
		// @0B3: aaload
		// @0B4: iload_3
		// @0B5: aaload
		// @0B6: invokestatic game.C_100141_tc.func_105054_a(int, boolean, java.lang.Object)byte[]
		// @0B9: astore #5
		// @0BB: aconst_null
		// @0BC: aload #5
		// @0BE: if_acmpeq @0C5
		// @0C1: goto @0CF
		// @0C4: athrow
		// @0C5: new java.lang.RuntimeException
		// @0C8: dup
		// @0C9: ldc ""
		// @0CB: invokespecial java.lang.RuntimeException.<init>(java.lang.String)void
		// @0CE: athrow
		// @0CF: aconst_null
		// @0D0: aload #5
		// @0D2: if_acmpeq @126
		// @0D5: iconst_1
		// @0D6: aload_0
		// @0D7: getfield int game.C_100098_h.field_104614_d
		// @0DA: if_icmpne @10F
		// @0DD: goto @0E1
		// @0E0: athrow
		// @0E1: aload_0
		// @0E2: getfield java.lang.Object[][] game.C_100098_h.field_104615_e
		// @0E5: iload #4
		// @0E7: aaload
		// @0E8: iload_3
		// @0E9: aconst_null
		// @0EA: aastore
		// @0EB: aload_0
		// @0EC: getfield game.C_100254_pi game.C_100098_h.field_104618_a
		// @0EF: getfield int[] game.C_100254_pi.field_106454_o
		// @0F2: iload #4
		// @0F4: iaload
		// @0F5: iconst_m1
		// @0F6: ixor
		// @0F7: bipush -2 (0xFE)
		// @0F9: if_icmpeq @104
		// @0FC: goto @100
		// @0FF: athrow
		// @100: goto @126
		// @103: athrow
		// @104: aload_0
		// @105: getfield java.lang.Object[][] game.C_100098_h.field_104615_e
		// @108: iload #4
		// @10A: aconst_null
		// @10B: aastore
		// @10C: goto @126
		// @10F: bipush -3 (0xFD)
		// @111: aload_0
		// @112: getfield int game.C_100098_h.field_104614_d
		// @115: iconst_m1
		// @116: ixor
		// @117: if_icmpne @126
		// @11A: aload_0
		// @11B: getfield java.lang.Object[][] game.C_100098_h.field_104615_e
		// @11E: iload #4
		// @120: aconst_null
		// @121: aastore
		// @122: goto @126
		// @125: athrow
		// @126: aload #5
		// @128: areturn
		// @129: astore #5
		// @12B: aload #5
		// @12D: new java.lang.StringBuilder
		// @130: dup
		// @131: invokespecial java.lang.StringBuilder.<init>()void
		// @134: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @137: iconst_4
		// @138: aaload
		// @139: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @13C: aload_1
		// @13D: ifnull @149
		// @140: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @143: iconst_2
		// @144: aaload
		// @145: goto @14E
		// @148: athrow
		// @149: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @14C: iconst_1
		// @14D: aaload
		// @14E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @151: bipush 44 (0x2C)
		// @153: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @156: iload_2
		// @157: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @15A: bipush 44 (0x2C)
		// @15C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @15F: iload_3
		// @160: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @163: bipush 44 (0x2C)
		// @165: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @168: iload #4
		// @16A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @16D: bipush 41 (0x29)
		// @16F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @172: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @175: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @178: athrow
	}
	
	final boolean func_104611_a(int arg0, String arg1)
	{
		// @00: aload_0
		// @01: iconst_0
		// @02: invokevirtual game.C_100098_h.func_104597_a(boolean)boolean
		// @05: ifne @0A
		// @08: iconst_0
		// @09: ireturn
		// @0A: aload_2
		// @0B: invokevirtual java.lang.String.toLowerCase()java.lang.String
		// @0E: astore_2
		// @0F: aload_0
		// @10: getfield game.C_100254_pi game.C_100098_h.field_104618_a
		// @13: getfield game.C_100263_mb game.C_100254_pi.field_106446_f
		// @16: bipush 102 (0x66)
		// @18: bipush -88 (0xA8)
		// @1A: aload_2
		// @1B: invokestatic game.C_100091_m.func_104506_a(int, java.lang.CharSequence)int
		// @1E: invokevirtual game.C_100263_mb.func_106504_a(int, int)int
		// @21: istore_3
		// @22: iload_3
		// @23: iconst_m1
		// @24: ixor
		// @25: iload_1
		// @26: if_icmpgt @2D
		// @29: goto @2F
		// @2C: athrow
		// @2D: iconst_0
		// @2E: ireturn
		// @2F: iconst_1
		// @30: ireturn
		// @31: astore_3
		// @32: aload_3
		// @33: new java.lang.StringBuilder
		// @36: dup
		// @37: invokespecial java.lang.StringBuilder.<init>()void
		// @3A: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @3D: bipush 15 (0x0F)
		// @3F: aaload
		// @40: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @43: iload_1
		// @44: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @47: bipush 44 (0x2C)
		// @49: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4C: aload_2
		// @4D: ifnull @59
		// @50: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @53: iconst_2
		// @54: aaload
		// @55: goto @5E
		// @58: athrow
		// @59: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @5C: iconst_1
		// @5D: aaload
		// @5E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @61: bipush 41 (0x29)
		// @63: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @66: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @69: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @6C: athrow
	}
	
	final synchronized byte[] func_104608_a(String arg0, String arg1, int arg2)
	{
		// @00: bipush -96 (0xA0)
		// @02: bipush 67 (0x43)
		// @04: iload_3
		// @05: isub
		// @06: bipush 46 (0x2E)
		// @08: idiv
		// @09: irem
		// @0A: istore #4
		// @0C: aload_0
		// @0D: iconst_0
		// @0E: invokevirtual game.C_100098_h.func_104597_a(boolean)boolean
		// @11: ifeq @18
		// @14: goto @1A
		// @17: athrow
		// @18: aconst_null
		// @19: areturn
		// @1A: aload_2
		// @1B: invokevirtual java.lang.String.toLowerCase()java.lang.String
		// @1E: astore_2
		// @1F: aload_1
		// @20: invokevirtual java.lang.String.toLowerCase()java.lang.String
		// @23: astore_1
		// @24: aload_0
		// @25: getfield game.C_100254_pi game.C_100098_h.field_104618_a
		// @28: getfield game.C_100263_mb game.C_100254_pi.field_106446_f
		// @2B: bipush 118 (0x76)
		// @2D: bipush -108 (0x94)
		// @2F: aload_2
		// @30: invokestatic game.C_100091_m.func_104506_a(int, java.lang.CharSequence)int
		// @33: invokevirtual game.C_100263_mb.func_106504_a(int, int)int
		// @36: istore #5
		// @38: aload_0
		// @39: iload #5
		// @3B: iconst_0
		// @3C: invokespecial game.C_100098_h.func_104603_a(int, boolean)boolean
		// @3F: ifeq @46
		// @42: goto @48
		// @45: athrow
		// @46: aconst_null
		// @47: areturn
		// @48: aload_0
		// @49: getfield game.C_100254_pi game.C_100098_h.field_104618_a
		// @4C: getfield game.C_100263_mb[] game.C_100254_pi.field_106465_s
		// @4F: iload #5
		// @51: aaload
		// @52: bipush 88 (0x58)
		// @54: bipush -107 (0x95)
		// @56: aload_1
		// @57: invokestatic game.C_100091_m.func_104506_a(int, java.lang.CharSequence)int
		// @5A: invokevirtual game.C_100263_mb.func_106504_a(int, int)int
		// @5D: istore #6
		// @5F: aload_0
		// @60: iload #5
		// @62: iconst_0
		// @63: iload #6
		// @65: invokevirtual game.C_100098_h.func_104610_b(int, int, int)byte[]
		// @68: areturn
		// @69: astore #4
		// @6B: aload #4
		// @6D: new java.lang.StringBuilder
		// @70: dup
		// @71: invokespecial java.lang.StringBuilder.<init>()void
		// @74: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @77: bipush 17 (0x11)
		// @79: aaload
		// @7A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @7D: aload_1
		// @7E: ifnull @8A
		// @81: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @84: iconst_2
		// @85: aaload
		// @86: goto @8F
		// @89: athrow
		// @8A: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @8D: iconst_1
		// @8E: aaload
		// @8F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @92: bipush 44 (0x2C)
		// @94: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @97: aload_2
		// @98: ifnull @A4
		// @9B: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @9E: iconst_2
		// @9F: aaload
		// @A0: goto @A9
		// @A3: athrow
		// @A4: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @A7: iconst_1
		// @A8: aaload
		// @A9: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @AC: bipush 44 (0x2C)
		// @AE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B1: iload_3
		// @B2: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @B5: bipush 41 (0x29)
		// @B7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @BA: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @BD: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @C0: athrow
	}
	
	final boolean func_104588_a(String arg0, int arg1, String arg2)
	{
		// @00: iload_2
		// @01: bipush -47 (0xD1)
		// @03: if_icmple @1C
		// @06: aload_0
		// @07: aload_0
		// @08: getfield java.lang.Object[] game.C_100098_h.field_104620_h
		// @0B: iconst_5
		// @0C: aaload
		// @0D: checkcast int[]
		// @10: checkcast int[]
		// @13: iconst_0
		// @14: iaload
		// @15: putfield int game.C_100098_h.field_104614_d
		// @18: goto @1C
		// @1B: athrow
		// @1C: aload_0
		// @1D: iconst_0
		// @1E: invokevirtual game.C_100098_h.func_104597_a(boolean)boolean
		// @21: ifne @26
		// @24: iconst_0
		// @25: ireturn
		// @26: aload_3
		// @27: invokevirtual java.lang.String.toLowerCase()java.lang.String
		// @2A: astore_3
		// @2B: aload_1
		// @2C: invokevirtual java.lang.String.toLowerCase()java.lang.String
		// @2F: astore_1
		// @30: aload_0
		// @31: getfield game.C_100254_pi game.C_100098_h.field_104618_a
		// @34: getfield game.C_100263_mb game.C_100254_pi.field_106446_f
		// @37: bipush 113 (0x71)
		// @39: bipush -71 (0xB9)
		// @3B: aload_3
		// @3C: invokestatic game.C_100091_m.func_104506_a(int, java.lang.CharSequence)int
		// @3F: invokevirtual game.C_100263_mb.func_106504_a(int, int)int
		// @42: istore #4
		// @44: aload_0
		// @45: iload #4
		// @47: iconst_0
		// @48: invokespecial game.C_100098_h.func_104603_a(int, boolean)boolean
		// @4B: ifne @50
		// @4E: iconst_0
		// @4F: ireturn
		// @50: aload_0
		// @51: getfield game.C_100254_pi game.C_100098_h.field_104618_a
		// @54: getfield game.C_100263_mb[] game.C_100254_pi.field_106465_s
		// @57: iload #4
		// @59: aaload
		// @5A: bipush 102 (0x66)
		// @5C: bipush -55 (0xC9)
		// @5E: aload_1
		// @5F: invokestatic game.C_100091_m.func_104506_a(int, java.lang.CharSequence)int
		// @62: invokevirtual game.C_100263_mb.func_106504_a(int, int)int
		// @65: istore #5
		// @67: aload_0
		// @68: sipush 10894 (0x2A8E)
		// @6B: iload #5
		// @6D: iload #4
		// @6F: invokevirtual game.C_100098_h.func_104604_c(int, int, int)boolean
		// @72: ireturn
		// @73: astore #4
		// @75: aload #4
		// @77: new java.lang.StringBuilder
		// @7A: dup
		// @7B: invokespecial java.lang.StringBuilder.<init>()void
		// @7E: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @81: bipush 6 (0x06)
		// @83: aaload
		// @84: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @87: aload_1
		// @88: ifnull @94
		// @8B: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @8E: iconst_2
		// @8F: aaload
		// @90: goto @99
		// @93: athrow
		// @94: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @97: iconst_1
		// @98: aaload
		// @99: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @9C: bipush 44 (0x2C)
		// @9E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A1: iload_2
		// @A2: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A5: bipush 44 (0x2C)
		// @A7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @AA: aload_3
		// @AB: ifnull @B7
		// @AE: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @B1: iconst_2
		// @B2: aaload
		// @B3: goto @BC
		// @B6: athrow
		// @B7: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @BA: iconst_1
		// @BB: aaload
		// @BC: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @BF: bipush 41 (0x29)
		// @C1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C4: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @C7: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @CA: athrow
	}
	
	final synchronized boolean func_104597_a(boolean arg0)
	{
		// @00: aconst_null
		// @01: aload_0
		// @02: getfield game.C_100254_pi game.C_100098_h.field_104618_a
		// @05: if_acmpeq @0C
		// @08: goto @3F
		// @0B: athrow
		// @0C: aload_0
		// @0D: aload_0
		// @0E: getfield game.C_100080_b game.C_100098_h.field_104617_c
		// @11: bipush -15 (0xF1)
		// @13: invokevirtual game.C_100080_b.func_104430_a(int)game.C_100254_pi
		// @16: putfield game.C_100254_pi game.C_100098_h.field_104618_a
		// @19: aconst_null
		// @1A: aload_0
		// @1B: getfield game.C_100254_pi game.C_100098_h.field_104618_a
		// @1E: if_acmpne @23
		// @21: iconst_0
		// @22: ireturn
		// @23: aload_0
		// @24: aload_0
		// @25: getfield game.C_100254_pi game.C_100098_h.field_104618_a
		// @28: getfield int game.C_100254_pi.field_106462_v
		// @2B: anewarray java.lang.Object[]
		// @2E: putfield java.lang.Object[][] game.C_100098_h.field_104615_e
		// @31: aload_0
		// @32: aload_0
		// @33: getfield game.C_100254_pi game.C_100098_h.field_104618_a
		// @36: getfield int game.C_100254_pi.field_106462_v
		// @39: anewarray java.lang.Object
		// @3C: putfield java.lang.Object[] game.C_100098_h.field_104620_h
		// @3F: iload_1
		// @40: ifeq @52
		// @43: aload_0
		// @44: getfield java.lang.Object[] game.C_100098_h.field_104620_h
		// @47: iconst_4
		// @48: aaload
		// @49: checkcast boolean[]
		// @4C: checkcast boolean[]
		// @4F: iconst_0
		// @50: baload
		// @51: ireturn
		// @52: iconst_1
		// @53: ireturn
		// @54: astore_2
		// @55: aload_2
		// @56: new java.lang.StringBuilder
		// @59: dup
		// @5A: invokespecial java.lang.StringBuilder.<init>()void
		// @5D: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @60: bipush 9 (0x09)
		// @62: aaload
		// @63: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @66: iload_1
		// @67: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @6A: bipush 41 (0x29)
		// @6C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @72: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @75: athrow
	}
	
	final int func_104600_a(String arg0, int arg1, int arg2)
	{
		// @00: aload_0
		// @01: iload_2
		// @02: iconst_0
		// @03: invokespecial game.C_100098_h.func_104603_a(int, boolean)boolean
		// @06: ifne @0B
		// @09: iconst_m1
		// @0A: ireturn
		// @0B: aload_1
		// @0C: invokevirtual java.lang.String.toLowerCase()java.lang.String
		// @0F: astore_1
		// @10: iload_3
		// @11: ifeq @1F
		// @14: aconst_null
		// @15: checkcast game.C_100302_ka
		// @18: putstatic game.C_100302_ka game.C_100098_h.field_104613_g
		// @1B: goto @1F
		// @1E: athrow
		// @1F: aload_0
		// @20: getfield game.C_100254_pi game.C_100098_h.field_104618_a
		// @23: getfield game.C_100263_mb[] game.C_100254_pi.field_106465_s
		// @26: iload_2
		// @27: aaload
		// @28: iload_3
		// @29: bipush 75 (0x4B)
		// @2B: iadd
		// @2C: bipush -73 (0xB7)
		// @2E: aload_1
		// @2F: invokestatic game.C_100091_m.func_104506_a(int, java.lang.CharSequence)int
		// @32: invokevirtual game.C_100263_mb.func_106504_a(int, int)int
		// @35: istore #4
		// @37: aload_0
		// @38: iload #4
		// @3A: iload_2
		// @3B: sipush -2148 (0xF79C)
		// @3E: invokespecial game.C_100098_h.func_104609_a(int, int, int)boolean
		// @41: ifne @46
		// @44: iconst_m1
		// @45: ireturn
		// @46: iload #4
		// @48: ireturn
		// @49: astore #4
		// @4B: aload #4
		// @4D: new java.lang.StringBuilder
		// @50: dup
		// @51: invokespecial java.lang.StringBuilder.<init>()void
		// @54: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @57: bipush 24 (0x18)
		// @59: aaload
		// @5A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @5D: aload_1
		// @5E: ifnull @6A
		// @61: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @64: iconst_2
		// @65: aaload
		// @66: goto @6F
		// @69: athrow
		// @6A: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @6D: iconst_1
		// @6E: aaload
		// @6F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @72: bipush 44 (0x2C)
		// @74: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @77: iload_2
		// @78: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7B: bipush 44 (0x2C)
		// @7D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @80: iload_3
		// @81: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @84: bipush 41 (0x29)
		// @86: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @89: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @8C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @8F: athrow
	}
	
	final int func_104601_b(int arg0, String arg1)
	{
		// @00: aload_0
		// @01: iconst_0
		// @02: invokevirtual game.C_100098_h.func_104597_a(boolean)boolean
		// @05: ifne @0A
		// @08: iconst_m1
		// @09: ireturn
		// @0A: iload_1
		// @0B: sipush -10719 (0xD621)
		// @0E: if_icmpeq @20
		// @11: aload_0
		// @12: getfield java.lang.Object[] game.C_100098_h.field_104620_h
		// @15: iconst_3
		// @16: aaload
		// @17: checkcast int[]
		// @1A: checkcast int[]
		// @1D: iconst_2
		// @1E: iaload
		// @1F: ireturn
		// @20: aload_2
		// @21: invokevirtual java.lang.String.toLowerCase()java.lang.String
		// @24: astore_2
		// @25: aload_0
		// @26: getfield game.C_100254_pi game.C_100098_h.field_104618_a
		// @29: getfield game.C_100263_mb game.C_100254_pi.field_106446_f
		// @2C: bipush 103 (0x67)
		// @2E: iload_1
		// @2F: sipush 10673 (0x29B1)
		// @32: ixor
		// @33: aload_2
		// @34: invokestatic game.C_100091_m.func_104506_a(int, java.lang.CharSequence)int
		// @37: invokevirtual game.C_100263_mb.func_106504_a(int, int)int
		// @3A: istore_3
		// @3B: aload_0
		// @3C: iload_3
		// @3D: iconst_0
		// @3E: invokespecial game.C_100098_h.func_104603_a(int, boolean)boolean
		// @41: ifne @46
		// @44: iconst_m1
		// @45: ireturn
		// @46: iload_3
		// @47: ireturn
		// @48: astore_3
		// @49: aload_3
		// @4A: new java.lang.StringBuilder
		// @4D: dup
		// @4E: invokespecial java.lang.StringBuilder.<init>()void
		// @51: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @54: iconst_5
		// @55: aaload
		// @56: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @59: iload_1
		// @5A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5D: bipush 44 (0x2C)
		// @5F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @62: aload_2
		// @63: ifnull @6F
		// @66: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @69: iconst_2
		// @6A: aaload
		// @6B: goto @74
		// @6E: athrow
		// @6F: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @72: iconst_1
		// @73: aaload
		// @74: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @77: bipush 41 (0x29)
		// @79: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @7F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @82: athrow
	}
	
	final int func_104596_a(byte arg0)
	{
		// @00: aload_0
		// @01: iconst_0
		// @02: invokevirtual game.C_100098_h.func_104597_a(boolean)boolean
		// @05: ifne @0A
		// @08: iconst_m1
		// @09: ireturn
		// @0A: bipush 121 (0x79)
		// @0C: iload_1
		// @0D: bipush -76 (0xB4)
		// @0F: isub
		// @10: bipush 36 (0x24)
		// @12: idiv
		// @13: irem
		// @14: istore_2
		// @15: aload_0
		// @16: getfield game.C_100254_pi game.C_100098_h.field_104618_a
		// @19: getfield int[] game.C_100254_pi.field_106454_o
		// @1C: arraylength
		// @1D: ireturn
		// @1E: astore_2
		// @1F: aload_2
		// @20: new java.lang.StringBuilder
		// @23: dup
		// @24: invokespecial java.lang.StringBuilder.<init>()void
		// @27: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @2A: bipush 18 (0x12)
		// @2C: aaload
		// @2D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @30: iload_1
		// @31: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @34: bipush 41 (0x29)
		// @36: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @39: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3F: athrow
	}
	
	private final synchronized boolean func_104606_a(byte arg0, int arg1, int[] arg2, int arg3)
	{
		// @000: aload_0
		// @001: iload #4
		// @003: iconst_0
		// @004: invokespecial game.C_100098_h.func_104603_a(int, boolean)boolean
		// @007: ifne @00C
		// @00A: iconst_0
		// @00B: ireturn
		// @00C: aconst_null
		// @00D: aload_0
		// @00E: getfield java.lang.Object[] game.C_100098_h.field_104620_h
		// @011: iload #4
		// @013: aaload
		// @014: if_acmpne @019
		// @017: iconst_0
		// @018: ireturn
		// @019: aload_0
		// @01A: getfield game.C_100254_pi game.C_100098_h.field_104618_a
		// @01D: getfield int[] game.C_100254_pi.field_106453_n
		// @020: iload #4
		// @022: iaload
		// @023: istore #5
		// @025: aload_0
		// @026: getfield game.C_100254_pi game.C_100098_h.field_104618_a
		// @029: getfield int[][] game.C_100254_pi.field_106466_r
		// @02C: iload #4
		// @02E: aaload
		// @02F: astore #6
		// @031: aload_0
		// @032: getfield java.lang.Object[][] game.C_100098_h.field_104615_e
		// @035: iload #4
		// @037: aaload
		// @038: ifnull @03F
		// @03B: goto @053
		// @03E: athrow
		// @03F: aload_0
		// @040: getfield java.lang.Object[][] game.C_100098_h.field_104615_e
		// @043: iload #4
		// @045: aload_0
		// @046: getfield game.C_100254_pi game.C_100098_h.field_104618_a
		// @049: getfield int[] game.C_100254_pi.field_106454_o
		// @04C: iload #4
		// @04E: iaload
		// @04F: anewarray java.lang.Object
		// @052: aastore
		// @053: aload_0
		// @054: getfield java.lang.Object[][] game.C_100098_h.field_104615_e
		// @057: iload #4
		// @059: aaload
		// @05A: astore #7
		// @05C: iconst_1
		// @05D: istore #8
		// @05F: iconst_0
		// @060: istore #9
		// @062: iload_1
		// @063: bipush -2 (0xFE)
		// @065: if_icmpeq @073
		// @068: aload_0
		// @069: bipush -97 (0x9F)
		// @06B: invokevirtual game.C_100098_h.func_104598_a(int)boolean
		// @06E: pop
		// @06F: goto @073
		// @072: athrow
		// @073: iload #9
		// @075: iload #5
		// @077: if_icmpge @0A9
		// @07A: aload #6
		// @07C: ifnull @08D
		// @07F: goto @083
		// @082: athrow
		// @083: aload #6
		// @085: iload #9
		// @087: iaload
		// @088: istore #10
		// @08A: goto @091
		// @08D: iload #9
		// @08F: istore #10
		// @091: aload #7
		// @093: iload #10
		// @095: aaload
		// @096: ifnull @09D
		// @099: goto @0A3
		// @09C: athrow
		// @09D: iconst_0
		// @09E: istore #8
		// @0A0: goto @0A9
		// @0A3: iinc #9 +1
		// @0A6: goto @073
		// @0A9: iload #8
		// @0AB: ifne @0B2
		// @0AE: goto @0B4
		// @0B1: athrow
		// @0B2: iconst_1
		// @0B3: ireturn
		// @0B4: aconst_null
		// @0B5: aload_3
		// @0B6: if_acmpeq @0EB
		// @0B9: aload_3
		// @0BA: iconst_0
		// @0BB: iaload
		// @0BC: iconst_m1
		// @0BD: ixor
		// @0BE: iconst_m1
		// @0BF: if_icmpne @0FD
		// @0C2: goto @0C6
		// @0C5: athrow
		// @0C6: iconst_m1
		// @0C7: aload_3
		// @0C8: iconst_1
		// @0C9: iaload
		// @0CA: iconst_m1
		// @0CB: ixor
		// @0CC: if_icmpne @0FD
		// @0CF: goto @0D3
		// @0D2: athrow
		// @0D3: iconst_0
		// @0D4: aload_3
		// @0D5: iconst_2
		// @0D6: iaload
		// @0D7: if_icmpne @0FD
		// @0DA: goto @0DE
		// @0DD: athrow
		// @0DE: aload_3
		// @0DF: iconst_3
		// @0E0: iaload
		// @0E1: iconst_m1
		// @0E2: ixor
		// @0E3: iconst_m1
		// @0E4: if_icmpne @0FD
		// @0E7: goto @0EB
		// @0EA: athrow
		// @0EB: bipush 106 (0x6A)
		// @0ED: iconst_0
		// @0EE: aload_0
		// @0EF: getfield java.lang.Object[] game.C_100098_h.field_104620_h
		// @0F2: iload #4
		// @0F4: aaload
		// @0F5: invokestatic game.C_100141_tc.func_105054_a(int, boolean, java.lang.Object)byte[]
		// @0F8: astore #9
		// @0FA: goto @125
		// @0FD: bipush 36 (0x24)
		// @0FF: iconst_1
		// @100: aload_0
		// @101: getfield java.lang.Object[] game.C_100098_h.field_104620_h
		// @104: iload #4
		// @106: aaload
		// @107: invokestatic game.C_100141_tc.func_105054_a(int, boolean, java.lang.Object)byte[]
		// @10A: astore #9
		// @10C: new game.C_100280_nf
		// @10F: dup
		// @110: aload #9
		// @112: invokespecial game.C_100280_nf.<init>(byte[])void
		// @115: astore #10
		// @117: aload #10
		// @119: iconst_0
		// @11A: aload_3
		// @11B: iconst_5
		// @11C: aload #10
		// @11E: getfield byte[] game.C_100280_nf.field_101179_l
		// @121: arraylength
		// @122: invokevirtual game.C_100280_nf.func_101166_a(byte, int[], int, int)void
		// @125: aload #9
		// @127: iload_1
		// @128: sipush 129 (0x0081)
		// @12B: iadd
		// @12C: invokestatic game.C_100266_me.func_106647_a(byte[], int)byte[]
		// @12F: astore #10
		// @131: goto @1B2
		// @134: astore #11
		// @136: aload #11
		// @138: new java.lang.StringBuilder
		// @13B: dup
		// @13C: invokespecial java.lang.StringBuilder.<init>()void
		// @13F: aconst_null
		// @140: aload_3
		// @141: if_acmpeq @149
		// @144: iconst_1
		// @145: goto @14A
		// @148: athrow
		// @149: iconst_0
		// @14A: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @14D: ldc " "
		// @14F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @152: iload #4
		// @154: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @157: ldc " "
		// @159: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @15C: aload #9
		// @15E: arraylength
		// @15F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @162: ldc " "
		// @164: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @167: aload #9
		// @169: iload_1
		// @16A: bipush -2 (0xFE)
		// @16C: ixor
		// @16D: aload #9
		// @16F: arraylength
		// @170: invokestatic game.C_100289_jl.func_102885_a(byte[], int, int)int
		// @173: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @176: ldc " "
		// @178: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @17B: aload #9
		// @17D: iconst_0
		// @17E: bipush -2 (0xFE)
		// @180: aload #9
		// @182: arraylength
		// @183: iadd
		// @184: invokestatic game.C_100289_jl.func_102885_a(byte[], int, int)int
		// @187: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @18A: ldc " "
		// @18C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @18F: aload_0
		// @190: getfield game.C_100254_pi game.C_100098_h.field_104618_a
		// @193: getfield int[] game.C_100254_pi.field_106448_d
		// @196: iload #4
		// @198: iaload
		// @199: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @19C: ldc " "
		// @19E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1A1: aload_0
		// @1A2: getfield game.C_100254_pi game.C_100098_h.field_104618_a
		// @1A5: getfield int game.C_100254_pi.field_106450_b
		// @1A8: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1AB: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @1AE: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @1B1: athrow
		// @1B2: aload_0
		// @1B3: getfield boolean game.C_100098_h.field_104621_i
		// @1B6: ifeq @1C5
		// @1B9: aload_0
		// @1BA: getfield java.lang.Object[] game.C_100098_h.field_104620_h
		// @1BD: iload #4
		// @1BF: aconst_null
		// @1C0: aastore
		// @1C1: goto @1C5
		// @1C4: athrow
		// @1C5: bipush -2 (0xFE)
		// @1C7: iload #5
		// @1C9: iconst_m1
		// @1CA: ixor
		// @1CB: if_icmpgt @209
		// @1CE: aload #6
		// @1D0: ifnonnull @1DD
		// @1D3: goto @1D7
		// @1D6: athrow
		// @1D7: iconst_0
		// @1D8: istore #11
		// @1DA: goto @1E3
		// @1DD: aload #6
		// @1DF: iconst_0
		// @1E0: iaload
		// @1E1: istore #11
		// @1E3: aload_0
		// @1E4: getfield int game.C_100098_h.field_104614_d
		// @1E7: iconst_m1
		// @1E8: ixor
		// @1E9: iconst_m1
		// @1EA: if_icmpne @1FF
		// @1ED: aload #7
		// @1EF: iload #11
		// @1F1: sipush -137 (0xFF77)
		// @1F4: iconst_0
		// @1F5: aload #10
		// @1F7: invokestatic game.C_100056_de.func_103176_a(int, boolean, byte[])java.lang.Object
		// @1FA: aastore
		// @1FB: goto @206
		// @1FE: athrow
		// @1FF: aload #7
		// @201: iload #11
		// @203: aload #10
		// @205: aastore
		// @206: goto @488
		// @209: aload_0
		// @20A: getfield int game.C_100098_h.field_104614_d
		// @20D: iconst_2
		// @20E: if_icmpne @334
		// @211: aload #10
		// @213: arraylength
		// @214: istore #11
		// @216: sipush 255 (0x00FF)
		// @219: aload #10
		// @21B: iinc #11 +255
		// @21E: iload #11
		// @220: baload
		// @221: iand
		// @222: istore #12
		// @224: iload #11
		// @226: iload #5
		// @228: iload #12
		// @22A: iconst_4
		// @22B: imul
		// @22C: imul
		// @22D: isub
		// @22E: istore #11
		// @230: new game.C_100280_nf
		// @233: dup
		// @234: aload #10
		// @236: invokespecial game.C_100280_nf.<init>(byte[])void
		// @239: astore #13
		// @23B: iconst_0
		// @23C: istore #14
		// @23E: aload #13
		// @240: iload #11
		// @242: putfield int game.C_100280_nf.field_101177_n
		// @245: iconst_0
		// @246: istore #15
		// @248: iconst_0
		// @249: istore #16
		// @24B: iload #16
		// @24D: iload #12
		// @24F: if_icmpge @2A3
		// @252: iconst_0
		// @253: istore #17
		// @255: iconst_0
		// @256: istore #18
		// @258: iload #18
		// @25A: iload #5
		// @25C: if_icmpge @29D
		// @25F: iload #17
		// @261: aload #13
		// @263: iload_1
		// @264: sipush 1543 (0x0607)
		// @267: ixor
		// @268: invokevirtual game.C_100280_nf.func_101171_e(int)int
		// @26B: iadd
		// @26C: istore #17
		// @26E: aconst_null
		// @26F: aload #6
		// @271: if_acmpne @27B
		// @274: iload #18
		// @276: istore #19
		// @278: goto @282
		// @27B: aload #6
		// @27D: iload #18
		// @27F: iaload
		// @280: istore #19
		// @282: iload #19
		// @284: iconst_m1
		// @285: ixor
		// @286: iload_2
		// @287: iconst_m1
		// @288: ixor
		// @289: if_icmpne @297
		// @28C: iload #19
		// @28E: istore #15
		// @290: iload #14
		// @292: iload #17
		// @294: iadd
		// @295: istore #14
		// @297: iinc #18 +1
		// @29A: goto @258
		// @29D: iinc #16 +1
		// @2A0: goto @24B
		// @2A3: iconst_0
		// @2A4: iload #14
		// @2A6: if_icmpeq @2AD
		// @2A9: goto @2AF
		// @2AC: athrow
		// @2AD: iconst_1
		// @2AE: ireturn
		// @2AF: iload #14
		// @2B1: newarray byte[]
		// @2B3: astore #16
		// @2B5: iconst_0
		// @2B6: istore #14
		// @2B8: aload #13
		// @2BA: iload #11
		// @2BC: putfield int game.C_100280_nf.field_101177_n
		// @2BF: iconst_0
		// @2C0: istore #17
		// @2C2: iconst_0
		// @2C3: istore #18
		// @2C5: iload #18
		// @2C7: iload #12
		// @2C9: if_icmpge @32A
		// @2CC: iconst_0
		// @2CD: istore #19
		// @2CF: iconst_0
		// @2D0: istore #20
		// @2D2: iload #5
		// @2D4: iconst_m1
		// @2D5: ixor
		// @2D6: iload #20
		// @2D8: iconst_m1
		// @2D9: ixor
		// @2DA: if_icmpge @324
		// @2DD: iload #19
		// @2DF: aload #13
		// @2E1: sipush -1543 (0xF9F9)
		// @2E4: invokevirtual game.C_100280_nf.func_101171_e(int)int
		// @2E7: iadd
		// @2E8: istore #19
		// @2EA: aload #6
		// @2EC: ifnull @2F9
		// @2EF: aload #6
		// @2F1: iload #20
		// @2F3: iaload
		// @2F4: istore #21
		// @2F6: goto @2FD
		// @2F9: iload #20
		// @2FB: istore #21
		// @2FD: iload #21
		// @2FF: iload_2
		// @300: if_icmpne @317
		// @303: aload #10
		// @305: iload #17
		// @307: aload #16
		// @309: iload #14
		// @30B: iload #19
		// @30D: invokestatic game.C_100120_en.func_104911_a(byte[], int, byte[], int, int)void
		// @310: iload #14
		// @312: iload #19
		// @314: iadd
		// @315: istore #14
		// @317: iload #17
		// @319: iload #19
		// @31B: iadd
		// @31C: istore #17
		// @31E: iinc #20 +1
		// @321: goto @2D2
		// @324: iinc #18 +1
		// @327: goto @2C5
		// @32A: aload #7
		// @32C: iload #15
		// @32E: aload #16
		// @330: aastore
		// @331: goto @488
		// @334: aload #10
		// @336: arraylength
		// @337: istore #11
		// @339: aload #10
		// @33B: iinc #11 +255
		// @33E: iload #11
		// @340: baload
		// @341: sipush 255 (0x00FF)
		// @344: iand
		// @345: istore #12
		// @347: iload #11
		// @349: iconst_4
		// @34A: iload #12
		// @34C: iload #5
		// @34E: imul
		// @34F: imul
		// @350: isub
		// @351: istore #11
		// @353: new game.C_100280_nf
		// @356: dup
		// @357: aload #10
		// @359: invokespecial game.C_100280_nf.<init>(byte[])void
		// @35C: astore #13
		// @35E: aload #13
		// @360: iload #11
		// @362: putfield int game.C_100280_nf.field_101177_n
		// @365: iload #5
		// @367: newarray int[]
		// @369: astore #14
		// @36B: iconst_0
		// @36C: istore #15
		// @36E: iload #12
		// @370: iload #15
		// @372: if_icmple @3A9
		// @375: iconst_0
		// @376: istore #16
		// @378: iconst_0
		// @379: istore #17
		// @37B: iload #17
		// @37D: iconst_m1
		// @37E: ixor
		// @37F: iload #5
		// @381: iconst_m1
		// @382: ixor
		// @383: if_icmple @3A3
		// @386: iload #16
		// @388: aload #13
		// @38A: sipush -1543 (0xF9F9)
		// @38D: invokevirtual game.C_100280_nf.func_101171_e(int)int
		// @390: iadd
		// @391: istore #16
		// @393: aload #14
		// @395: iload #17
		// @397: dup2
		// @398: iaload
		// @399: iload #16
		// @39B: iadd
		// @39C: iastore
		// @39D: iinc #17 +1
		// @3A0: goto @37B
		// @3A3: iinc #15 +1
		// @3A6: goto @36E
		// @3A9: iload #5
		// @3AB: anewarray byte[]
		// @3AE: astore #15
		// @3B0: iconst_0
		// @3B1: istore #16
		// @3B3: iload #16
		// @3B5: iload #5
		// @3B7: if_icmpge @3D3
		// @3BA: aload #15
		// @3BC: iload #16
		// @3BE: aload #14
		// @3C0: iload #16
		// @3C2: iaload
		// @3C3: newarray byte[]
		// @3C5: aastore
		// @3C6: aload #14
		// @3C8: iload #16
		// @3CA: iconst_0
		// @3CB: iastore
		// @3CC: iinc #16 +1
		// @3CF: goto @3B3
		// @3D2: athrow
		// @3D3: aload #13
		// @3D5: iload #11
		// @3D7: putfield int game.C_100280_nf.field_101177_n
		// @3DA: iconst_0
		// @3DB: istore #16
		// @3DD: iconst_0
		// @3DE: istore #17
		// @3E0: iload #12
		// @3E2: iconst_m1
		// @3E3: ixor
		// @3E4: iload #17
		// @3E6: iconst_m1
		// @3E7: ixor
		// @3E8: if_icmpge @437
		// @3EB: iconst_0
		// @3EC: istore #18
		// @3EE: iconst_0
		// @3EF: istore #19
		// @3F1: iload #19
		// @3F3: iload #5
		// @3F5: if_icmpge @431
		// @3F8: iload #18
		// @3FA: aload #13
		// @3FC: iload_1
		// @3FD: sipush 1543 (0x0607)
		// @400: ixor
		// @401: invokevirtual game.C_100280_nf.func_101171_e(int)int
		// @404: iadd
		// @405: istore #18
		// @407: aload #10
		// @409: iload #16
		// @40B: aload #15
		// @40D: iload #19
		// @40F: aaload
		// @410: aload #14
		// @412: iload #19
		// @414: iaload
		// @415: iload #18
		// @417: invokestatic game.C_100120_en.func_104911_a(byte[], int, byte[], int, int)void
		// @41A: iload #16
		// @41C: iload #18
		// @41E: iadd
		// @41F: istore #16
		// @421: aload #14
		// @423: iload #19
		// @425: dup2
		// @426: iaload
		// @427: iload #18
		// @429: iadd
		// @42A: iastore
		// @42B: iinc #19 +1
		// @42E: goto @3F1
		// @431: iinc #17 +1
		// @434: goto @3E0
		// @437: iconst_0
		// @438: istore #17
		// @43A: iload #5
		// @43C: iload #17
		// @43E: if_icmple @488
		// @441: aconst_null
		// @442: aload #6
		// @444: if_acmpeq @455
		// @447: goto @44B
		// @44A: athrow
		// @44B: aload #6
		// @44D: iload #17
		// @44F: iaload
		// @450: istore #18
		// @452: goto @459
		// @455: iload #17
		// @457: istore #18
		// @459: aload_0
		// @45A: getfield int game.C_100098_h.field_104614_d
		// @45D: iconst_m1
		// @45E: ixor
		// @45F: iconst_m1
		// @460: if_icmpeq @471
		// @463: aload #7
		// @465: iload #18
		// @467: aload #15
		// @469: iload #17
		// @46B: aaload
		// @46C: aastore
		// @46D: goto @482
		// @470: athrow
		// @471: aload #7
		// @473: iload #18
		// @475: sipush -137 (0xFF77)
		// @478: iconst_0
		// @479: aload #15
		// @47B: iload #17
		// @47D: aaload
		// @47E: invokestatic game.C_100056_de.func_103176_a(int, boolean, byte[])java.lang.Object
		// @481: aastore
		// @482: iinc #17 +1
		// @485: goto @43A
		// @488: iconst_1
		// @489: ireturn
		// @48A: astore #5
		// @48C: aload #5
		// @48E: new java.lang.StringBuilder
		// @491: dup
		// @492: invokespecial java.lang.StringBuilder.<init>()void
		// @495: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @498: bipush 12 (0x0C)
		// @49A: aaload
		// @49B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @49E: iload_1
		// @49F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4A2: bipush 44 (0x2C)
		// @4A4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4A7: iload_2
		// @4A8: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4AB: bipush 44 (0x2C)
		// @4AD: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4B0: aload_3
		// @4B1: ifnull @4BD
		// @4B4: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @4B7: iconst_2
		// @4B8: aaload
		// @4B9: goto @4C2
		// @4BC: athrow
		// @4BD: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @4C0: iconst_1
		// @4C1: aaload
		// @4C2: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4C5: bipush 44 (0x2C)
		// @4C7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4CA: iload #4
		// @4CC: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4CF: bipush 41 (0x29)
		// @4D1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4D4: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4D7: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4DA: athrow
	}
	
	final byte[] func_104610_b(int arg0, int arg1, int arg2)
	{
		// @00: iload_2
		// @01: ifeq @31
		// @04: aconst_null
		// @05: checkcast game.C_100201_qj
		// @08: bipush 46 (0x2E)
		// @0A: iconst_1
		// @0B: bipush 29 (0x1D)
		// @0D: aload_0
		// @0E: getfield java.lang.Object[] game.C_100098_h.field_104620_h
		// @11: iconst_1
		// @12: aaload
		// @13: checkcast java.awt.Component
		// @16: iconst_1
		// @17: aconst_null
		// @18: checkcast game.C_100210_qa
		// @1B: aload_0
		// @1C: getfield java.lang.Object[] game.C_100098_h.field_104620_h
		// @1F: bipush 11 (0x0B)
		// @21: aaload
		// @22: checkcast int[]
		// @25: checkcast int[]
		// @28: iconst_1
		// @29: iaload
		// @2A: invokestatic game.C_100098_h.func_104586_a(game.C_100201_qj, int, boolean, int, java.awt.Component, boolean, game.C_100210_qa, int)void
		// @2D: goto @31
		// @30: athrow
		// @31: aload_0
		// @32: aconst_null
		// @33: iconst_0
		// @34: iload_3
		// @35: iload_1
		// @36: invokespecial game.C_100098_h.func_104599_a(int[], int, int, int)byte[]
		// @39: areturn
		// @3A: astore #4
		// @3C: aload #4
		// @3E: new java.lang.StringBuilder
		// @41: dup
		// @42: invokespecial java.lang.StringBuilder.<init>()void
		// @45: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @48: bipush 13 (0x0D)
		// @4A: aaload
		// @4B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4E: iload_1
		// @4F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @52: bipush 44 (0x2C)
		// @54: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @57: iload_2
		// @58: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5B: bipush 44 (0x2C)
		// @5D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @60: iload_3
		// @61: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @64: bipush 41 (0x29)
		// @66: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @69: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @6C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @6F: athrow
	}
	
	public static void func_104587_b(int arg0)
	{
		// @00: iload_0
		// @01: sipush 27289 (0x6A99)
		// @04: if_icmpeq @10
		// @07: bipush 24 (0x18)
		// @09: invokestatic game.C_100098_h.func_104587_b(int)void
		// @0C: goto @10
		// @0F: athrow
		// @10: aconst_null
		// @11: putstatic java.lang.String game.C_100098_h.field_104616_b
		// @14: aconst_null
		// @15: putstatic game.C_100302_ka game.C_100098_h.field_104613_g
		// @18: goto @3D
		// @1B: astore_1
		// @1C: aload_1
		// @1D: new java.lang.StringBuilder
		// @20: dup
		// @21: invokespecial java.lang.StringBuilder.<init>()void
		// @24: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @27: bipush 20 (0x14)
		// @29: aaload
		// @2A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2D: iload_0
		// @2E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @31: bipush 41 (0x29)
		// @33: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @36: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @39: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3C: athrow
		// @3D: return
	}
	
	C_100098_h(C_100080_b arg0, boolean arg1, int arg2)
	{
		// @00: aload_0
		// @01: invokespecial java.lang.Object.<init>()void
		// @04: aload_0
		// @05: aconst_null
		// @06: putfield game.C_100254_pi game.C_100098_h.field_104618_a
		// @09: iconst_m1
		// @0A: iload_3
		// @0B: iconst_m1
		// @0C: ixor
		// @0D: if_icmplt @15
		// @10: iload_3
		// @11: iconst_2
		// @12: if_icmple @20
		// @15: new java.lang.IllegalArgumentException
		// @18: dup
		// @19: ldc ""
		// @1B: invokespecial java.lang.IllegalArgumentException.<init>(java.lang.String)void
		// @1E: athrow
		// @1F: athrow
		// @20: aload_0
		// @21: iload_2
		// @22: putfield boolean game.C_100098_h.field_104621_i
		// @25: aload_0
		// @26: aload_1
		// @27: putfield game.C_100080_b game.C_100098_h.field_104617_c
		// @2A: aload_0
		// @2B: iload_3
		// @2C: putfield int game.C_100098_h.field_104614_d
		// @2F: goto @79
		// @32: astore #4
		// @34: aload #4
		// @36: new java.lang.StringBuilder
		// @39: dup
		// @3A: invokespecial java.lang.StringBuilder.<init>()void
		// @3D: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @40: bipush 22 (0x16)
		// @42: aaload
		// @43: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @46: aload_1
		// @47: ifnull @53
		// @4A: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @4D: iconst_2
		// @4E: aaload
		// @4F: goto @58
		// @52: athrow
		// @53: getstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @56: iconst_1
		// @57: aaload
		// @58: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @5B: bipush 44 (0x2C)
		// @5D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @60: iload_2
		// @61: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @64: bipush 44 (0x2C)
		// @66: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @69: iload_3
		// @6A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6D: bipush 41 (0x29)
		// @6F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @72: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @75: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @78: athrow
		// @79: return
	}
	
	static
	{
		// @000: bipush 27 (0x1B)
		// @002: anewarray java.lang.String
		// @005: dup
		// @006: iconst_0
		// @007: ldc "|1\u000b?"
		// @009: invokestatic game.C_100098_h.func_104607_z(java.lang.String)char[]
		// @00C: invokestatic game.C_100098_h.func_104589_z(char[])java.lang.String
		// @00F: aastore
		// @010: dup
		// @011: iconst_1
		// @012: ldc "zj%{"
		// @014: invokestatic game.C_100098_h.func_104607_z(java.lang.String)char[]
		// @017: invokestatic game.C_100098_h.func_104589_z(char[])java.lang.String
		// @01A: aastore
		// @01B: dup
		// @01C: iconst_2
		// @01D: ldc "o1g91"
		// @01F: invokestatic game.C_100098_h.func_104607_z(java.lang.String)char[]
		// @022: invokestatic game.C_100098_h.func_104589_z(char[])java.lang.String
		// @025: aastore
		// @026: dup
		// @027: iconst_3
		// @028: ldc "|1\n?"
		// @02A: invokestatic game.C_100098_h.func_104607_z(java.lang.String)char[]
		// @02D: invokestatic game.C_100098_h.func_104589_z(char[])java.lang.String
		// @030: aastore
		// @031: dup
		// @032: iconst_4
		// @033: ldc "|1\u0008Vd"
		// @035: invokestatic game.C_100098_h.func_104607_z(java.lang.String)char[]
		// @038: invokestatic game.C_100098_h.func_104589_z(char[])java.lang.String
		// @03B: aastore
		// @03C: dup
		// @03D: iconst_5
		// @03E: ldc "|1\u0001?"
		// @040: invokestatic game.C_100098_h.func_104607_z(java.lang.String)char[]
		// @043: invokestatic game.C_100098_h.func_104589_z(char[])java.lang.String
		// @046: aastore
		// @047: dup
		// @048: bipush 6 (0x06)
		// @04A: ldc "|1\u0004?"
		// @04C: invokestatic game.C_100098_h.func_104607_z(java.lang.String)char[]
		// @04F: invokestatic game.C_100098_h.func_104589_z(char[])java.lang.String
		// @052: aastore
		// @053: dup
		// @054: bipush 7 (0x07)
		// @056: ldc "|1\u000f?"
		// @058: invokestatic game.C_100098_h.func_104607_z(java.lang.String)char[]
		// @05B: invokestatic game.C_100098_h.func_104589_z(char[])java.lang.String
		// @05E: aastore
		// @05F: dup
		// @060: bipush 8 (0x08)
		// @062: ldc "|1\u0003?"
		// @064: invokestatic game.C_100098_h.func_104607_z(java.lang.String)char[]
		// @067: invokestatic game.C_100098_h.func_104589_z(char[])java.lang.String
		// @06A: aastore
		// @06B: dup
		// @06C: bipush 9 (0x09)
		// @06E: ldc "|1\u0002?"
		// @070: invokestatic game.C_100098_h.func_104607_z(java.lang.String)char[]
		// @073: invokestatic game.C_100098_h.func_104589_z(char[])java.lang.String
		// @076: aastore
		// @077: dup
		// @078: bipush 10 (0x0A)
		// @07A: ldc "|1\u001c?"
		// @07C: invokestatic game.C_100098_h.func_104607_z(java.lang.String)char[]
		// @07F: invokestatic game.C_100098_h.func_104589_z(char[])java.lang.String
		// @082: aastore
		// @083: dup
		// @084: bipush 11 (0x0B)
		// @086: ldc "|1\u001f?"
		// @088: invokestatic game.C_100098_h.func_104607_z(java.lang.String)char[]
		// @08B: invokestatic game.C_100098_h.func_104589_z(char[])java.lang.String
		// @08E: aastore
		// @08F: dup
		// @090: bipush 12 (0x0C)
		// @092: ldc "|1\u0018?"
		// @094: invokestatic game.C_100098_h.func_104607_z(java.lang.String)char[]
		// @097: invokestatic game.C_100098_h.func_104589_z(char[])java.lang.String
		// @09A: aastore
		// @09B: dup
		// @09C: bipush 13 (0x0D)
		// @09E: ldc "|1\u001a?"
		// @0A0: invokestatic game.C_100098_h.func_104607_z(java.lang.String)char[]
		// @0A3: invokestatic game.C_100098_h.func_104589_z(char[])java.lang.String
		// @0A6: aastore
		// @0A7: dup
		// @0A8: bipush 14 (0x0E)
		// @0AA: ldc "|1\r?"
		// @0AC: invokestatic game.C_100098_h.func_104607_z(java.lang.String)char[]
		// @0AF: invokestatic game.C_100098_h.func_104589_z(char[])java.lang.String
		// @0B2: aastore
		// @0B3: dup
		// @0B4: bipush 15 (0x0F)
		// @0B6: ldc "|1\u0007?"
		// @0B8: invokestatic game.C_100098_h.func_104607_z(java.lang.String)char[]
		// @0BB: invokestatic game.C_100098_h.func_104589_z(char[])java.lang.String
		// @0BE: aastore
		// @0BF: dup
		// @0C0: bipush 16 (0x10)
		// @0C2: ldc "|1\u000c?"
		// @0C4: invokestatic game.C_100098_h.func_104607_z(java.lang.String)char[]
		// @0C7: invokestatic game.C_100098_h.func_104589_z(char[])java.lang.String
		// @0CA: aastore
		// @0CB: dup
		// @0CC: bipush 17 (0x11)
		// @0CE: ldc "|1\u0019?"
		// @0D0: invokestatic game.C_100098_h.func_104607_z(java.lang.String)char[]
		// @0D3: invokestatic game.C_100098_h.func_104589_z(char[])java.lang.String
		// @0D6: aastore
		// @0D7: dup
		// @0D8: bipush 18 (0x12)
		// @0DA: ldc "|1\u001d?"
		// @0DC: invokestatic game.C_100098_h.func_104607_z(java.lang.String)char[]
		// @0DF: invokestatic game.C_100098_h.func_104589_z(char[])java.lang.String
		// @0E2: aastore
		// @0E3: dup
		// @0E4: bipush 19 (0x13)
		// @0E6: ldc "|1\u0000?"
		// @0E8: invokestatic game.C_100098_h.func_104607_z(java.lang.String)char[]
		// @0EB: invokestatic game.C_100098_h.func_104589_z(char[])java.lang.String
		// @0EE: aastore
		// @0EF: dup
		// @0F0: bipush 20 (0x14)
		// @0F2: ldc "|1\u001b?"
		// @0F4: invokestatic game.C_100098_h.func_104607_z(java.lang.String)char[]
		// @0F7: invokestatic game.C_100098_h.func_104589_z(char[])java.lang.String
		// @0FA: aastore
		// @0FB: dup
		// @0FC: bipush 21 (0x15)
		// @0FE: ldc "|1\u0008?"
		// @100: invokestatic game.C_100098_h.func_104607_z(java.lang.String)char[]
		// @103: invokestatic game.C_100098_h.func_104589_z(char[])java.lang.String
		// @106: aastore
		// @107: dup
		// @108: bipush 22 (0x16)
		// @10A: ldc "|1u~\"}kw?"
		// @10C: invokestatic game.C_100098_h.func_104607_z(java.lang.String)char[]
		// @10F: invokestatic game.C_100098_h.func_104589_z(char[])java.lang.String
		// @112: aastore
		// @113: dup
		// @114: bipush 23 (0x17)
		// @116: ldc "|1\u0006?"
		// @118: invokestatic game.C_100098_h.func_104607_z(java.lang.String)char[]
		// @11B: invokestatic game.C_100098_h.func_104589_z(char[])java.lang.String
		// @11E: aastore
		// @11F: dup
		// @120: bipush 24 (0x18)
		// @122: ldc "|1\u001e?"
		// @124: invokestatic game.C_100098_h.func_104607_z(java.lang.String)char[]
		// @127: invokestatic game.C_100098_h.func_104589_z(char[])java.lang.String
		// @12A: aastore
		// @12B: dup
		// @12C: bipush 25 (0x19)
		// @12E: ldc "|1\u000e?"
		// @130: invokestatic game.C_100098_h.func_104607_z(java.lang.String)char[]
		// @133: invokestatic game.C_100098_h.func_104589_z(char[])java.lang.String
		// @136: aastore
		// @137: dup
		// @138: bipush 26 (0x1A)
		// @13A: ldc "|1\u0005?"
		// @13C: invokestatic game.C_100098_h.func_104607_z(java.lang.String)char[]
		// @13F: invokestatic game.C_100098_h.func_104589_z(char[])java.lang.String
		// @142: aastore
		// @143: putstatic java.lang.String[] game.C_100098_h.field_104619_z
		// @146: ldc "XP\n\\"
		// @148: invokestatic game.C_100098_h.func_104607_z(java.lang.String)char[]
		// @14B: invokestatic game.C_100098_h.func_104589_z(char[])java.lang.String
		// @14E: putstatic java.lang.String game.C_100098_h.field_104616_b
		// @151: return
	}
	
	private static char[] func_104607_z(String arg0)
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
		// @0E: bipush 76 (0x4C)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_104589_z(char[] arg0)
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
		// @30: bipush 20 (0x14)
		// @32: goto @46
		// @35: bipush 31 (0x1F)
		// @37: goto @46
		// @3A: bipush 73 (0x49)
		// @3C: goto @46
		// @3F: bipush 23 (0x17)
		// @41: goto @46
		// @44: bipush 76 (0x4C)
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
