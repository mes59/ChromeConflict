package game;

import java.awt.Component;

final class C_100126_cb extends C_100340_je
{
	static C_100346_ja field_103062_t;
	static boolean field_103061_u;
	static String field_103064_r;
	static int field_103063_s;
	static int[] field_103060_v;
	private static final String[] field_103065_z;
	
	static final void func_103058_g(int arg0)
	{
		// @00: getstatic game.C_100187_rk game.C_100111_el.field_104864_a
		// @03: ifnonnull @18
		// @06: iconst_1
		// @07: bipush 10 (0x0A)
		// @09: iconst_1
		// @0A: iconst_3
		// @0B: sipush 29717 (0x7415)
		// @0E: invokestatic game.C_100294_ki.func_106898_a(int, int, int, int, int)game.C_100187_rk
		// @11: putstatic game.C_100187_rk game.C_100111_el.field_104864_a
		// @14: goto @18
		// @17: athrow
		// @18: bipush 19 (0x13)
		// @1A: iload_0
		// @1B: bipush -35 (0xDD)
		// @1D: isub
		// @1E: bipush 54 (0x36)
		// @20: idiv
		// @21: irem
		// @22: istore_1
		// @23: goto @48
		// @26: astore_1
		// @27: aload_1
		// @28: new java.lang.StringBuilder
		// @2B: dup
		// @2C: invokespecial java.lang.StringBuilder.<init>()void
		// @2F: getstatic java.lang.String[] game.C_100126_cb.field_103065_z
		// @32: bipush 8 (0x08)
		// @34: aaload
		// @35: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @38: iload_0
		// @39: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3C: bipush 41 (0x29)
		// @3E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @41: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @44: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @47: athrow
		// @48: return
	}
	
	final C_100133_tk func_102974_b(String arg0, int arg1)
	{
		// @00: aconst_null
		// @01: aload_1
		// @02: iload_2
		// @03: sipush -30335 (0x8981)
		// @06: ixor
		// @07: invokestatic game.C_100125_tm.func_100741_a(java.lang.String, int)game.C_100130_tf
		// @0A: if_acmpne @12
		// @0D: iconst_1
		// @0E: goto @13
		// @11: athrow
		// @12: iconst_0
		// @13: istore_3
		// @14: iload_2
		// @15: ifeq @23
		// @18: aconst_null
		// @19: checkcast game.C_100346_ja
		// @1C: putstatic game.C_100346_ja game.C_100126_cb.field_103062_t
		// @1F: goto @23
		// @22: athrow
		// @23: iload_3
		// @24: ifne @2B
		// @27: getstatic game.C_100133_tk game.C_100256_pk.field_100466_a
		// @2A: areturn
		// @2B: getstatic game.C_100133_tk game.C_100079_e.field_102670_tb
		// @2E: areturn
		// @2F: astore_3
		// @30: aload_3
		// @31: new java.lang.StringBuilder
		// @34: dup
		// @35: invokespecial java.lang.StringBuilder.<init>()void
		// @38: getstatic java.lang.String[] game.C_100126_cb.field_103065_z
		// @3B: bipush 6 (0x06)
		// @3D: aaload
		// @3E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @41: aload_1
		// @42: ifnull @4E
		// @45: getstatic java.lang.String[] game.C_100126_cb.field_103065_z
		// @48: iconst_2
		// @49: aaload
		// @4A: goto @53
		// @4D: athrow
		// @4E: getstatic java.lang.String[] game.C_100126_cb.field_103065_z
		// @51: iconst_3
		// @52: aaload
		// @53: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
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
	
	static final int func_103059_a(int arg0, int arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore_3
		// @04: iconst_m1
		// @05: iload_0
		// @06: iconst_m1
		// @07: ixor
		// @08: if_icmpge @0D
		// @0B: iconst_0
		// @0C: ireturn
		// @0D: iload_0
		// @0E: getstatic int[] game.C_100021_wn.field_103870_e
		// @11: arraylength
		// @12: if_icmplt @19
		// @15: goto @21
		// @18: athrow
		// @19: getstatic int[] game.C_100021_wn.field_103870_e
		// @1C: iload_0
		// @1D: iaload
		// @1E: iconst_4
		// @1F: idiv
		// @20: ireturn
		// @21: iload_1
		// @22: bipush 32 (0x20)
		// @24: if_icmpge @2A
		// @27: bipush 27 (0x1B)
		// @29: ireturn
		// @2A: iload_0
		// @2B: istore_2
		// @2C: iload_2
		// @2D: bipush 42 (0x2A)
		// @2F: if_icmpne @3A
		// @32: iload_3
		// @33: ifeq @80
		// @36: goto @3A
		// @39: athrow
		// @3A: bipush -40 (0xD8)
		// @3C: iload_2
		// @3D: iconst_m1
		// @3E: ixor
		// @3F: if_icmpne @4E
		// @42: goto @46
		// @45: athrow
		// @46: iload_3
		// @47: ifeq @84
		// @4A: goto @4E
		// @4D: athrow
		// @4E: iload_2
		// @4F: iconst_m1
		// @50: ixor
		// @51: bipush -41 (0xD7)
		// @53: if_icmpeq @88
		// @56: goto @5A
		// @59: athrow
		// @5A: iload_2
		// @5B: bipush 35 (0x23)
		// @5D: if_icmpeq @8C
		// @60: goto @64
		// @63: athrow
		// @64: bipush 37 (0x25)
		// @66: iload_2
		// @67: if_icmpeq @90
		// @6A: goto @6E
		// @6D: athrow
		// @6E: iload_2
		// @6F: bipush 41 (0x29)
		// @71: if_icmpne @98
		// @74: goto @78
		// @77: athrow
		// @78: iload_3
		// @79: ifeq @94
		// @7C: goto @80
		// @7F: athrow
		// @80: sipush 500 (0x01F4)
		// @83: ireturn
		// @84: sipush 500 (0x01F4)
		// @87: ireturn
		// @88: sipush 500 (0x01F4)
		// @8B: ireturn
		// @8C: sipush 1000 (0x03E8)
		// @8F: ireturn
		// @90: sipush 1000 (0x03E8)
		// @93: ireturn
		// @94: sipush 2000 (0x07D0)
		// @97: ireturn
		// @98: iconst_0
		// @99: ireturn
		// @9A: astore_2
		// @9B: aload_2
		// @9C: new java.lang.StringBuilder
		// @9F: dup
		// @A0: invokespecial java.lang.StringBuilder.<init>()void
		// @A3: getstatic java.lang.String[] game.C_100126_cb.field_103065_z
		// @A6: iconst_4
		// @A7: aaload
		// @A8: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @AB: iload_0
		// @AC: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @AF: bipush 44 (0x2C)
		// @B1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B4: iload_1
		// @B5: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @B8: bipush 41 (0x29)
		// @BA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @BD: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @C0: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @C3: athrow
	}
	
	C_100126_cb(C_100309_lk arg0)
	{
		// @0: aload_0
		// @1: aload_1
		// @2: invokespecial game.C_100340_je.<init>(game.C_100309_lk)void
		// @5: return
	}
	
	final String func_102975_a(byte arg0, String arg1)
	{
		// @00: aload_0
		// @01: aload_2
		// @02: iconst_0
		// @03: invokevirtual game.C_100126_cb.func_102974_b(java.lang.String, int)game.C_100133_tk
		// @06: getstatic game.C_100133_tk game.C_100256_pk.field_100466_a
		// @09: if_acmpne @10
		// @0C: getstatic java.lang.String game.C_100263_mb.field_106506_g
		// @0F: areturn
		// @10: iload_1
		// @11: bipush 16 (0x10)
		// @13: if_icmpeq @1B
		// @16: aconst_null
		// @17: checkcast java.lang.String
		// @1A: areturn
		// @1B: getstatic java.lang.String game.C_100036_gg.field_103154_S
		// @1E: areturn
		// @1F: astore_3
		// @20: aload_3
		// @21: new java.lang.StringBuilder
		// @24: dup
		// @25: invokespecial java.lang.StringBuilder.<init>()void
		// @28: getstatic java.lang.String[] game.C_100126_cb.field_103065_z
		// @2B: iconst_5
		// @2C: aaload
		// @2D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @30: iload_1
		// @31: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @34: bipush 44 (0x2C)
		// @36: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @39: aload_2
		// @3A: ifnull @46
		// @3D: getstatic java.lang.String[] game.C_100126_cb.field_103065_z
		// @40: iconst_2
		// @41: aaload
		// @42: goto @4B
		// @45: athrow
		// @46: getstatic java.lang.String[] game.C_100126_cb.field_103065_z
		// @49: iconst_3
		// @4A: aaload
		// @4B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4E: bipush 41 (0x29)
		// @50: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @53: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @56: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @59: athrow
	}
	
	public static void func_103057_h(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100126_cb.field_103064_r
		// @04: aconst_null
		// @05: putstatic game.C_100346_ja game.C_100126_cb.field_103062_t
		// @08: bipush 26 (0x1A)
		// @0A: bipush 28 (0x1C)
		// @0C: iload_0
		// @0D: isub
		// @0E: bipush 57 (0x39)
		// @10: idiv
		// @11: irem
		// @12: istore_1
		// @13: aconst_null
		// @14: putstatic int[] game.C_100126_cb.field_103060_v
		// @17: goto @3B
		// @1A: astore_1
		// @1B: aload_1
		// @1C: new java.lang.StringBuilder
		// @1F: dup
		// @20: invokespecial java.lang.StringBuilder.<init>()void
		// @23: getstatic java.lang.String[] game.C_100126_cb.field_103065_z
		// @26: iconst_0
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
	
	static final void func_103053_a(int arg0, C_100302_ka arg1, C_100302_ka arg2)
	{
		// @00: aconst_null
		// @01: aload_2
		// @02: getfield game.C_100202_qi game.C_100302_ka.field_101891_Ob
		// @05: if_acmpeq @0C
		// @08: goto @17
		// @0B: athrow
		// @0C: aload_2
		// @0D: new game.C_100202_qi
		// @10: dup
		// @11: invokespecial game.C_100202_qi.<init>()void
		// @14: putfield game.C_100202_qi game.C_100302_ka.field_101891_Ob
		// @17: iload_0
		// @18: sipush -28402 (0x910E)
		// @1B: if_icmpeq @1F
		// @1E: return
		// @1F: aconst_null
		// @20: aload_1
		// @21: getfield game.C_100202_qi game.C_100302_ka.field_101891_Ob
		// @24: if_acmpeq @2B
		// @27: goto @36
		// @2A: athrow
		// @2B: aload_1
		// @2C: new game.C_100202_qi
		// @2F: dup
		// @30: invokespecial game.C_100202_qi.<init>()void
		// @33: putfield game.C_100202_qi game.C_100302_ka.field_101891_Ob
		// @36: aconst_null
		// @37: getstatic game.C_100105_eg game.C_100170_cm.field_105536_f
		// @3A: if_acmpeq @41
		// @3D: goto @4D
		// @40: athrow
		// @41: new game.C_100105_eg
		// @44: dup
		// @45: bipush 64 (0x40)
		// @47: invokespecial game.C_100105_eg.<init>(int)void
		// @4A: putstatic game.C_100105_eg game.C_100170_cm.field_105536_f
		// @4D: getstatic game.C_100105_eg game.C_100003_ga.field_103533_h
		// @50: ifnonnull @63
		// @53: new game.C_100105_eg
		// @56: dup
		// @57: bipush 64 (0x40)
		// @59: invokespecial game.C_100105_eg.<init>(int)void
		// @5C: putstatic game.C_100105_eg game.C_100003_ga.field_103533_h
		// @5F: goto @63
		// @62: athrow
		// @63: aload_1
		// @64: getfield game.C_100202_qi game.C_100302_ka.field_101891_Ob
		// @67: putstatic game.C_100202_qi game.C_100312_ld.field_107155_b
		// @6A: aload_2
		// @6B: getfield game.C_100202_qi game.C_100302_ka.field_101891_Ob
		// @6E: putstatic game.C_100202_qi game.C_100085_a.field_102569_L
		// @71: sipush -31849 (0x8397)
		// @74: invokestatic game.C_100205_qf.func_103672_d(int)void
		// @77: goto @D0
		// @7A: astore_3
		// @7B: aload_3
		// @7C: new java.lang.StringBuilder
		// @7F: dup
		// @80: invokespecial java.lang.StringBuilder.<init>()void
		// @83: getstatic java.lang.String[] game.C_100126_cb.field_103065_z
		// @86: bipush 7 (0x07)
		// @88: aaload
		// @89: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @8C: iload_0
		// @8D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @90: bipush 44 (0x2C)
		// @92: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @95: aload_1
		// @96: ifnull @A2
		// @99: getstatic java.lang.String[] game.C_100126_cb.field_103065_z
		// @9C: iconst_2
		// @9D: aaload
		// @9E: goto @A7
		// @A1: athrow
		// @A2: getstatic java.lang.String[] game.C_100126_cb.field_103065_z
		// @A5: iconst_3
		// @A6: aaload
		// @A7: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @AA: bipush 44 (0x2C)
		// @AC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @AF: aload_2
		// @B0: ifnull @BC
		// @B3: getstatic java.lang.String[] game.C_100126_cb.field_103065_z
		// @B6: iconst_2
		// @B7: aaload
		// @B8: goto @C1
		// @BB: athrow
		// @BC: getstatic java.lang.String[] game.C_100126_cb.field_103065_z
		// @BF: iconst_3
		// @C0: aaload
		// @C1: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @C4: bipush 41 (0x29)
		// @C6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C9: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @CC: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @CF: athrow
		// @D0: return
	}
	
	static final void func_103056_a(byte arg0, Component arg1)
	{
		// @00: iload_0
		// @01: bipush -37 (0xDB)
		// @03: if_icmpeq @12
		// @06: bipush -29 (0xE3)
		// @08: bipush 51 (0x33)
		// @0A: invokestatic game.C_100126_cb.func_103059_a(int, int)int
		// @0D: pop
		// @0E: goto @12
		// @11: athrow
		// @12: aload_1
		// @13: getstatic game.C_100047_vh game.C_100111_el.field_104859_g
		// @16: invokevirtual java.awt.Component.removeMouseListener(java.awt.event.MouseListener)void
		// @19: aload_1
		// @1A: getstatic game.C_100047_vh game.C_100111_el.field_104859_g
		// @1D: invokevirtual java.awt.Component.removeMouseMotionListener(java.awt.event.MouseMotionListener)void
		// @20: aload_1
		// @21: getstatic game.C_100047_vh game.C_100111_el.field_104859_g
		// @24: invokevirtual java.awt.Component.removeFocusListener(java.awt.event.FocusListener)void
		// @27: iconst_0
		// @28: putstatic int game.C_100083_c.field_103172_O
		// @2B: goto @69
		// @2E: astore_2
		// @2F: aload_2
		// @30: new java.lang.StringBuilder
		// @33: dup
		// @34: invokespecial java.lang.StringBuilder.<init>()void
		// @37: getstatic java.lang.String[] game.C_100126_cb.field_103065_z
		// @3A: iconst_1
		// @3B: aaload
		// @3C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3F: iload_0
		// @40: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @43: bipush 44 (0x2C)
		// @45: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @48: aload_1
		// @49: ifnull @55
		// @4C: getstatic java.lang.String[] game.C_100126_cb.field_103065_z
		// @4F: iconst_2
		// @50: aaload
		// @51: goto @5A
		// @54: athrow
		// @55: getstatic java.lang.String[] game.C_100126_cb.field_103065_z
		// @58: iconst_3
		// @59: aaload
		// @5A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @5D: bipush 41 (0x29)
		// @5F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @62: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @65: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @68: athrow
		// @69: return
	}
	
	static
	{
		// @00: bipush 9 (0x09)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "l_7\u001c8"
		// @09: invokestatic game.C_100126_cb.func_103055_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100126_cb.func_103054_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "l_7\u00188"
		// @14: invokestatic game.C_100126_cb.func_103055_z(java.lang.String)char[]
		// @17: invokestatic game.C_100126_cb.func_103054_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "t\u00137wm"
		// @1F: invokestatic game.C_100126_cb.func_103055_z(java.lang.String)char[]
		// @22: invokestatic game.C_100126_cb.func_103054_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "aHu5"
		// @2A: invokestatic game.C_100126_cb.func_103055_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100126_cb.func_103054_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "l_7\u001e8"
		// @35: invokestatic game.C_100126_cb.func_103055_z(java.lang.String)char[]
		// @38: invokestatic game.C_100126_cb.func_103054_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "l_7\u001b8"
		// @40: invokestatic game.C_100126_cb.func_103055_z(java.lang.String)char[]
		// @43: invokestatic game.C_100126_cb.func_103054_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "l_7\u001f8"
		// @4C: invokestatic game.C_100126_cb.func_103055_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100126_cb.func_103054_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "l_7\u001d8"
		// @58: invokestatic game.C_100126_cb.func_103055_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100126_cb.func_103054_z(char[])java.lang.String
		// @5E: aastore
		// @5F: dup
		// @60: bipush 8 (0x08)
		// @62: ldc "l_7\u001a8"
		// @64: invokestatic game.C_100126_cb.func_103055_z(java.lang.String)char[]
		// @67: invokestatic game.C_100126_cb.func_103054_z(char[])java.lang.String
		// @6A: aastore
		// @6B: putstatic java.lang.String[] game.C_100126_cb.field_103065_z
		// @6E: aconst_null
		// @6F: putstatic game.C_100346_ja game.C_100126_cb.field_103062_t
		// @72: ldc "IoV\u00140@sU\u0000"
		// @74: invokestatic game.C_100126_cb.func_103055_z(java.lang.String)char[]
		// @77: invokestatic game.C_100126_cb.func_103054_z(char[])java.lang.String
		// @7A: putstatic java.lang.String game.C_100126_cb.field_103064_r
		// @7D: bipush 34 (0x22)
		// @7F: putstatic int game.C_100126_cb.field_103063_s
		// @82: return
	}
	
	private static char[] func_103055_z(String arg0)
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
		// @0E: bipush 16 (0x10)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_103054_z(char[] arg0)
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
		// @30: bipush 15 (0x0F)
		// @32: goto @46
		// @35: bipush 61 (0x3D)
		// @37: goto @46
		// @3A: bipush 25 (0x19)
		// @3C: goto @46
		// @3F: bipush 89 (0x59)
		// @41: goto @46
		// @44: bipush 16 (0x10)
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
