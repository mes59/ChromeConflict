package game;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.FocusListener;
import java.awt.event.FocusEvent;

final class C_100323_hl implements KeyListener, FocusListener
{
	static int[] field_107248_a;
	static String field_107247_b;
	private static final String[] field_107249_z;
	
	public final synchronized void keyPressed(KeyEvent arg0)
	{
		// @000: aconst_null
		// @001: getstatic game.C_100323_hl game.C_100264_mg.field_106528_i
		// @004: if_acmpeq @0DC
		// @007: iconst_0
		// @008: putstatic int game.C_100057_dd.field_104256_e
		// @00B: aload_1
		// @00C: invokevirtual java.awt.event.KeyEvent.getKeyCode()int
		// @00F: istore_2
		// @010: iconst_0
		// @011: iload_2
		// @012: if_icmpgt @021
		// @015: getstatic int[] game.C_100310_lj.field_100550_x
		// @018: arraylength
		// @019: iload_2
		// @01A: if_icmpgt @029
		// @01D: goto @021
		// @020: athrow
		// @021: iconst_m1
		// @022: istore_2
		// @023: getstatic int game.SteelSentinels.field_105275_O
		// @026: ifeq @03C
		// @029: getstatic int[] game.C_100310_lj.field_100550_x
		// @02C: iload_2
		// @02D: iaload
		// @02E: istore_2
		// @02F: iconst_m1
		// @030: iload_2
		// @031: sipush 128 (0x0080)
		// @034: iand
		// @035: iconst_m1
		// @036: ixor
		// @037: if_icmpeq @03C
		// @03A: iconst_m1
		// @03B: istore_2
		// @03C: iconst_m1
		// @03D: getstatic int game.C_100186_rl.field_105724_b
		// @040: iconst_m1
		// @041: ixor
		// @042: if_icmplt @07C
		// @045: iconst_m1
		// @046: iload_2
		// @047: iconst_m1
		// @048: ixor
		// @049: if_icmplt @07C
		// @04C: goto @050
		// @04F: athrow
		// @050: getstatic int[] game.C_100290_jm.field_106863_j
		// @053: getstatic int game.C_100186_rl.field_105724_b
		// @056: iload_2
		// @057: iastore
		// @058: bipush 127 (0x7F)
		// @05A: iconst_1
		// @05B: getstatic int game.C_100186_rl.field_105724_b
		// @05E: iadd
		// @05F: iand
		// @060: putstatic int game.C_100186_rl.field_105724_b
		// @063: getstatic int game.C_100003_ga.field_103545_x
		// @066: iconst_m1
		// @067: ixor
		// @068: getstatic int game.C_100186_rl.field_105724_b
		// @06B: iconst_m1
		// @06C: ixor
		// @06D: if_icmpeq @078
		// @070: goto @074
		// @073: athrow
		// @074: goto @07C
		// @077: athrow
		// @078: iconst_m1
		// @079: putstatic int game.C_100186_rl.field_105724_b
		// @07C: iconst_0
		// @07D: iload_2
		// @07E: if_icmple @085
		// @081: goto @0B1
		// @084: athrow
		// @085: iconst_1
		// @086: getstatic int game.C_100061_dh.field_101986_fc
		// @089: iadd
		// @08A: bipush 127 (0x7F)
		// @08C: iand
		// @08D: istore_3
		// @08E: iload_3
		// @08F: iconst_m1
		// @090: ixor
		// @091: getstatic int game.C_100077_d.field_103317_U
		// @094: iconst_m1
		// @095: ixor
		// @096: if_icmpne @09D
		// @099: goto @0B1
		// @09C: athrow
		// @09D: getstatic int[] game.C_100238_ol.field_101693_G
		// @0A0: getstatic int game.C_100061_dh.field_101986_fc
		// @0A3: iload_2
		// @0A4: iastore
		// @0A5: getstatic char[] game.C_100143_bl.field_105105_a
		// @0A8: getstatic int game.C_100061_dh.field_101986_fc
		// @0AB: iconst_0
		// @0AC: castore
		// @0AD: iload_3
		// @0AE: putstatic int game.C_100061_dh.field_101986_fc
		// @0B1: aload_1
		// @0B2: invokevirtual java.awt.event.KeyEvent.getModifiers()int
		// @0B5: istore_3
		// @0B6: bipush 10 (0x0A)
		// @0B8: iload_3
		// @0B9: iand
		// @0BA: iconst_m1
		// @0BB: ixor
		// @0BC: iconst_m1
		// @0BD: if_icmpne @0D8
		// @0C0: bipush 85 (0x55)
		// @0C2: iload_2
		// @0C3: if_icmpeq @0D8
		// @0C6: goto @0CA
		// @0C9: athrow
		// @0CA: iload_2
		// @0CB: bipush 10 (0x0A)
		// @0CD: if_icmpeq @0D8
		// @0D0: goto @0D4
		// @0D3: athrow
		// @0D4: goto @0DC
		// @0D7: athrow
		// @0D8: aload_1
		// @0D9: invokevirtual java.awt.event.KeyEvent.consume()void
		// @0DC: goto @111
		// @0DF: astore_2
		// @0E0: aload_2
		// @0E1: new java.lang.StringBuilder
		// @0E4: dup
		// @0E5: invokespecial java.lang.StringBuilder.<init>()void
		// @0E8: getstatic java.lang.String[] game.C_100323_hl.field_107249_z
		// @0EB: iconst_3
		// @0EC: aaload
		// @0ED: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0F0: aload_1
		// @0F1: ifnull @0FD
		// @0F4: getstatic java.lang.String[] game.C_100323_hl.field_107249_z
		// @0F7: iconst_2
		// @0F8: aaload
		// @0F9: goto @102
		// @0FC: athrow
		// @0FD: getstatic java.lang.String[] game.C_100323_hl.field_107249_z
		// @100: iconst_1
		// @101: aaload
		// @102: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @105: bipush 41 (0x29)
		// @107: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @10A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @10D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @110: athrow
		// @111: return
	}
	
	public final synchronized void keyReleased(KeyEvent arg0)
	{
		// @00: aconst_null
		// @01: getstatic game.C_100323_hl game.C_100264_mg.field_106528_i
		// @04: if_acmpne @0B
		// @07: goto @72
		// @0A: athrow
		// @0B: iconst_0
		// @0C: putstatic int game.C_100057_dd.field_104256_e
		// @0F: aload_1
		// @10: invokevirtual java.awt.event.KeyEvent.getKeyCode()int
		// @13: istore_2
		// @14: iload_2
		// @15: iflt @24
		// @18: iload_2
		// @19: getstatic int[] game.C_100310_lj.field_100550_x
		// @1C: arraylength
		// @1D: if_icmplt @2C
		// @20: goto @24
		// @23: athrow
		// @24: iconst_m1
		// @25: istore_2
		// @26: getstatic int game.SteelSentinels.field_105275_O
		// @29: ifeq @36
		// @2C: getstatic int[] game.C_100310_lj.field_100550_x
		// @2F: iload_2
		// @30: iaload
		// @31: sipush -129 (0xFF7F)
		// @34: iand
		// @35: istore_2
		// @36: iconst_0
		// @37: getstatic int game.C_100186_rl.field_105724_b
		// @3A: if_icmpgt @72
		// @3D: iload_2
		// @3E: iconst_m1
		// @3F: ixor
		// @40: iconst_m1
		// @41: if_icmpgt @72
		// @44: goto @48
		// @47: athrow
		// @48: getstatic int[] game.C_100290_jm.field_106863_j
		// @4B: getstatic int game.C_100186_rl.field_105724_b
		// @4E: iload_2
		// @4F: iconst_m1
		// @50: ixor
		// @51: iastore
		// @52: iconst_1
		// @53: getstatic int game.C_100186_rl.field_105724_b
		// @56: iadd
		// @57: bipush 127 (0x7F)
		// @59: iand
		// @5A: putstatic int game.C_100186_rl.field_105724_b
		// @5D: getstatic int game.C_100003_ga.field_103545_x
		// @60: getstatic int game.C_100186_rl.field_105724_b
		// @63: if_icmpeq @6E
		// @66: goto @6A
		// @69: athrow
		// @6A: goto @72
		// @6D: athrow
		// @6E: iconst_m1
		// @6F: putstatic int game.C_100186_rl.field_105724_b
		// @72: aload_1
		// @73: invokevirtual java.awt.event.KeyEvent.consume()void
		// @76: goto @AB
		// @79: astore_2
		// @7A: aload_2
		// @7B: new java.lang.StringBuilder
		// @7E: dup
		// @7F: invokespecial java.lang.StringBuilder.<init>()void
		// @82: getstatic java.lang.String[] game.C_100323_hl.field_107249_z
		// @85: iconst_5
		// @86: aaload
		// @87: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @8A: aload_1
		// @8B: ifnull @97
		// @8E: getstatic java.lang.String[] game.C_100323_hl.field_107249_z
		// @91: iconst_2
		// @92: aaload
		// @93: goto @9C
		// @96: athrow
		// @97: getstatic java.lang.String[] game.C_100323_hl.field_107249_z
		// @9A: iconst_1
		// @9B: aaload
		// @9C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @9F: bipush 41 (0x29)
		// @A1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A4: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @A7: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @AA: athrow
		// @AB: return
	}
	
	public final void focusGained(FocusEvent arg0)
	{
		// @0: return
	}
	
	public final synchronized void focusLost(FocusEvent arg0)
	{
		// @00: getstatic game.C_100323_hl game.C_100264_mg.field_106528_i
		// @03: ifnull @0A
		// @06: iconst_m1
		// @07: putstatic int game.C_100186_rl.field_105724_b
		// @0A: goto @40
		// @0D: astore_2
		// @0E: aload_2
		// @0F: new java.lang.StringBuilder
		// @12: dup
		// @13: invokespecial java.lang.StringBuilder.<init>()void
		// @16: getstatic java.lang.String[] game.C_100323_hl.field_107249_z
		// @19: bipush 7 (0x07)
		// @1B: aaload
		// @1C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1F: aload_1
		// @20: ifnull @2C
		// @23: getstatic java.lang.String[] game.C_100323_hl.field_107249_z
		// @26: iconst_2
		// @27: aaload
		// @28: goto @31
		// @2B: athrow
		// @2C: getstatic java.lang.String[] game.C_100323_hl.field_107249_z
		// @2F: iconst_1
		// @30: aaload
		// @31: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @34: bipush 41 (0x29)
		// @36: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @39: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3F: athrow
		// @40: return
	}
	
	public final void keyTyped(KeyEvent arg0)
	{
		// @00: getstatic game.C_100323_hl game.C_100264_mg.field_106528_i
		// @03: ifnonnull @0A
		// @06: goto @5B
		// @09: athrow
		// @0A: aload_1
		// @0B: invokevirtual java.awt.event.KeyEvent.getKeyChar()char
		// @0E: istore_2
		// @0F: iload_2
		// @10: iconst_m1
		// @11: ixor
		// @12: iconst_m1
		// @13: if_icmpeq @5B
		// @16: iload_2
		// @17: iconst_m1
		// @18: ixor
		// @19: ldc -65536 (0xffff0000)
		// @1B: if_icmpeq @5B
		// @1E: goto @22
		// @21: athrow
		// @22: iload_2
		// @23: bipush -10 (0xF6)
		// @25: invokestatic game.C_100095_fe.func_103379_a(char, byte)boolean
		// @28: ifne @33
		// @2B: goto @2F
		// @2E: athrow
		// @2F: goto @5B
		// @32: athrow
		// @33: getstatic int game.C_100061_dh.field_101986_fc
		// @36: iconst_1
		// @37: iadd
		// @38: bipush 127 (0x7F)
		// @3A: iand
		// @3B: istore_3
		// @3C: iload_3
		// @3D: getstatic int game.C_100077_d.field_103317_U
		// @40: if_icmpeq @5B
		// @43: getstatic int[] game.C_100238_ol.field_101693_G
		// @46: getstatic int game.C_100061_dh.field_101986_fc
		// @49: iconst_m1
		// @4A: iastore
		// @4B: getstatic char[] game.C_100143_bl.field_105105_a
		// @4E: getstatic int game.C_100061_dh.field_101986_fc
		// @51: iload_2
		// @52: castore
		// @53: iload_3
		// @54: putstatic int game.C_100061_dh.field_101986_fc
		// @57: goto @5B
		// @5A: athrow
		// @5B: aload_1
		// @5C: invokevirtual java.awt.event.KeyEvent.consume()void
		// @5F: goto @95
		// @62: astore_2
		// @63: aload_2
		// @64: new java.lang.StringBuilder
		// @67: dup
		// @68: invokespecial java.lang.StringBuilder.<init>()void
		// @6B: getstatic java.lang.String[] game.C_100323_hl.field_107249_z
		// @6E: bipush 8 (0x08)
		// @70: aaload
		// @71: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @74: aload_1
		// @75: ifnull @81
		// @78: getstatic java.lang.String[] game.C_100323_hl.field_107249_z
		// @7B: iconst_2
		// @7C: aaload
		// @7D: goto @86
		// @80: athrow
		// @81: getstatic java.lang.String[] game.C_100323_hl.field_107249_z
		// @84: iconst_1
		// @85: aaload
		// @86: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @89: bipush 41 (0x29)
		// @8B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @91: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @94: athrow
		// @95: return
	}
	
	static final void func_107245_a(long arg0, int arg1)
	{
		// @00: iconst_1
		// @01: iload_2
		// @02: bipush 6 (0x06)
		// @04: isub
		// @05: bipush 60 (0x3C)
		// @07: idiv
		// @08: irem
		// @09: istore_3
		// @0A: lload_0
		// @0B: invokestatic java.lang.Thread.sleep(long)void
		// @0E: goto @13
		// @11: astore #4
		// @13: goto @40
		// @16: astore_3
		// @17: aload_3
		// @18: new java.lang.StringBuilder
		// @1B: dup
		// @1C: invokespecial java.lang.StringBuilder.<init>()void
		// @1F: getstatic java.lang.String[] game.C_100323_hl.field_107249_z
		// @22: iconst_0
		// @23: aaload
		// @24: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @27: lload_0
		// @28: invokevirtual java.lang.StringBuilder.append(long)java.lang.StringBuilder
		// @2B: bipush 44 (0x2C)
		// @2D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @30: iload_2
		// @31: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @34: bipush 41 (0x29)
		// @36: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @39: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3F: athrow
		// @40: return
	}
	
	public static void func_107242_a(int arg0)
	{
		// @00: iload_0
		// @01: sipush -129 (0xFF7F)
		// @04: if_icmpeq @08
		// @07: return
		// @08: aconst_null
		// @09: putstatic int[] game.C_100323_hl.field_107248_a
		// @0C: aconst_null
		// @0D: putstatic java.lang.String game.C_100323_hl.field_107247_b
		// @10: goto @34
		// @13: astore_1
		// @14: aload_1
		// @15: new java.lang.StringBuilder
		// @18: dup
		// @19: invokespecial java.lang.StringBuilder.<init>()void
		// @1C: getstatic java.lang.String[] game.C_100323_hl.field_107249_z
		// @1F: iconst_4
		// @20: aaload
		// @21: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @24: iload_0
		// @25: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @28: bipush 41 (0x29)
		// @2A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @30: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @33: athrow
		// @34: return
	}
	
	static final void func_107246_a(int arg0, int arg1, int arg2)
	{
		// @00: iload_1
		// @01: putstatic int game.C_100208_qg.field_105964_h
		// @04: iload_0
		// @05: putstatic int game.C_100225_ah.field_106122_e
		// @08: iload_2
		// @09: bipush 26 (0x1A)
		// @0B: if_icmpge @15
		// @0E: aconst_null
		// @0F: checkcast int[]
		// @12: putstatic int[] game.C_100323_hl.field_107248_a
		// @15: goto @4C
		// @18: astore_3
		// @19: aload_3
		// @1A: new java.lang.StringBuilder
		// @1D: dup
		// @1E: invokespecial java.lang.StringBuilder.<init>()void
		// @21: getstatic java.lang.String[] game.C_100323_hl.field_107249_z
		// @24: bipush 6 (0x06)
		// @26: aaload
		// @27: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2A: iload_0
		// @2B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2E: bipush 44 (0x2C)
		// @30: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @33: iload_1
		// @34: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @37: bipush 44 (0x2C)
		// @39: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3C: iload_2
		// @3D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @40: bipush 41 (0x29)
		// @42: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @45: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @48: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4B: athrow
		// @4C: return
	}
	
	static
	{
		// @00: bipush 9 (0x09)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "P%MG\u0006"
		// @09: invokestatic game.C_100323_hl.func_107244_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100323_hl.func_107243_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "V<\u000fh"
		// @14: invokestatic game.C_100323_hl.func_107244_z(java.lang.String)char[]
		// @17: invokestatic game.C_100323_hl.func_107243_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "CgM*S"
		// @1F: invokestatic game.C_100323_hl.func_107244_z(java.lang.String)char[]
		// @22: invokestatic game.C_100323_hl.func_107243_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "P%MoKA\u0019\u0011a]K,\u0007,"
		// @2A: invokestatic game.C_100323_hl.func_107244_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100323_hl.func_107243_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "P%MF\u0006"
		// @35: invokestatic game.C_100323_hl.func_107244_z(java.lang.String)char[]
		// @38: invokestatic game.C_100323_hl.func_107243_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "P%MoKA\u001b\u0006hKY:\u0006`\u0006"
		// @40: invokestatic game.C_100323_hl.func_107244_z(java.lang.String)char[]
		// @43: invokestatic game.C_100323_hl.func_107243_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "P%ME\u0006"
		// @4C: invokestatic game.C_100323_hl.func_107244_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100323_hl.func_107243_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "P%MbA[<\u0010HAK=K"
		// @58: invokestatic game.C_100323_hl.func_107244_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100323_hl.func_107243_z(char[])java.lang.String
		// @5E: aastore
		// @5F: dup
		// @60: bipush 8 (0x08)
		// @62: ldc "P%MoKA\u001d\u001atK\\a"
		// @64: invokestatic game.C_100323_hl.func_107244_z(java.lang.String)char[]
		// @67: invokestatic game.C_100323_hl.func_107243_z(char[])java.lang.String
		// @6A: aastore
		// @6B: putstatic java.lang.String[] game.C_100323_hl.field_107249_z
		// @6E: ldc "l0\u0013a\u000eA&\u0016v\u000eH(\u0010wYW;\u0007$O_(\nj\u000eL&CiOS,Cw[J,CmZ\u001f:CgAJ;\u0006gZ"
		// @70: invokestatic game.C_100323_hl.func_107244_z(java.lang.String)char[]
		// @73: invokestatic game.C_100323_hl.func_107243_z(char[])java.lang.String
		// @76: putstatic java.lang.String game.C_100323_hl.field_107247_b
		// @79: return
	}
	
	private static char[] func_107244_z(String arg0)
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
		// @0E: bipush 46 (0x2E)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_107243_z(char[] arg0)
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
		// @10: tableswitch def: @43, for 0: @30, for 1: @35, for 2: @3A, for 3: @3F
		// @30: bipush 56 (0x38)
		// @32: goto @45
		// @35: bipush 73 (0x49)
		// @37: goto @45
		// @3A: bipush 99 (0x63)
		// @3C: goto @45
		// @3F: iconst_4
		// @40: goto @45
		// @43: bipush 46 (0x2E)
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
