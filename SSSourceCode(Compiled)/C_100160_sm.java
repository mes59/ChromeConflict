package game;

import java.awt.Color;

final class C_100160_sm
{
	static C_100127_tl field_105415_b;
	static boolean[] field_105416_c;
	static boolean field_105413_d;
	static C_100302_ka field_105414_e;
	static String field_105417_a;
	private static final String[] field_105418_z;
	
	public static void func_105406_a(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic boolean[] game.C_100160_sm.field_105416_c
		// @04: aconst_null
		// @05: putstatic java.lang.String game.C_100160_sm.field_105417_a
		// @08: aconst_null
		// @09: putstatic game.C_100127_tl game.C_100160_sm.field_105415_b
		// @0C: iload_0
		// @0D: sipush 300 (0x012C)
		// @10: if_icmpeq @14
		// @13: return
		// @14: aconst_null
		// @15: putstatic game.C_100302_ka game.C_100160_sm.field_105414_e
		// @18: goto @3C
		// @1B: astore_1
		// @1C: aload_1
		// @1D: new java.lang.StringBuilder
		// @20: dup
		// @21: invokespecial java.lang.StringBuilder.<init>()void
		// @24: getstatic java.lang.String[] game.C_100160_sm.field_105418_z
		// @27: iconst_4
		// @28: aaload
		// @29: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2C: iload_0
		// @2D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @30: bipush 41 (0x29)
		// @32: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @35: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @38: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3B: athrow
		// @3C: return
	}
	
	static final void func_105411_a(String arg0, boolean arg1, int arg2, int arg3, Color arg4)
	{
		// @000: getstatic java.awt.Canvas game.C_100034_gi.field_104033_a
		// @003: invokevirtual java.awt.Canvas.getGraphics()java.awt.Graphics
		// @006: astore #5
		// @008: getstatic java.awt.Font game.C_100081_ue.field_100673_o
		// @00B: ifnonnull @024
		// @00E: new java.awt.Font
		// @011: dup
		// @012: getstatic java.lang.String[] game.C_100160_sm.field_105418_z
		// @015: iconst_2
		// @016: aaload
		// @017: iconst_1
		// @018: bipush 13 (0x0D)
		// @01A: invokespecial java.awt.Font.<init>(java.lang.String, int, int)void
		// @01D: putstatic java.awt.Font game.C_100081_ue.field_100673_o
		// @020: goto @024
		// @023: athrow
		// @024: iload_1
		// @025: ifne @02C
		// @028: goto @041
		// @02B: athrow
		// @02C: aload #5
		// @02E: getstatic java.awt.Color java.awt.Color.black
		// @031: invokevirtual java.awt.Graphics.setColor(java.awt.Color)void
		// @034: aload #5
		// @036: iconst_0
		// @037: iconst_0
		// @038: getstatic int game.C_100270_mi.field_102282_cc
		// @03B: getstatic int game.C_100165_sh.field_100769_s
		// @03E: invokevirtual java.awt.Graphics.fillRect(int, int, int, int)void
		// @041: aload #4
		// @043: ifnonnull @056
		// @046: new java.awt.Color
		// @049: dup
		// @04A: sipush 140 (0x008C)
		// @04D: bipush 17 (0x11)
		// @04F: bipush 17 (0x11)
		// @051: invokespecial java.awt.Color.<init>(int, int, int)void
		// @054: astore #4
		// @056: getstatic java.awt.Image game.C_100080_b.field_104434_b
		// @059: ifnull @060
		// @05C: goto @06E
		// @05F: athrow
		// @060: getstatic java.awt.Canvas game.C_100034_gi.field_104033_a
		// @063: sipush 304 (0x0130)
		// @066: bipush 34 (0x22)
		// @068: invokevirtual java.awt.Canvas.createImage(int, int)java.awt.Image
		// @06B: putstatic java.awt.Image game.C_100080_b.field_104434_b
		// @06E: getstatic java.awt.Image game.C_100080_b.field_104434_b
		// @071: invokevirtual java.awt.Image.getGraphics()java.awt.Graphics
		// @074: astore #6
		// @076: aload #6
		// @078: aload #4
		// @07A: invokevirtual java.awt.Graphics.setColor(java.awt.Color)void
		// @07D: aload #6
		// @07F: iconst_0
		// @080: iconst_0
		// @081: sipush 303 (0x012F)
		// @084: bipush 33 (0x21)
		// @086: invokevirtual java.awt.Graphics.drawRect(int, int, int, int)void
		// @089: aload #6
		// @08B: iconst_2
		// @08C: iconst_2
		// @08D: iload_3
		// @08E: iload_2
		// @08F: imul
		// @090: bipush 30 (0x1E)
		// @092: invokevirtual java.awt.Graphics.fillRect(int, int, int, int)void
		// @095: aload #6
		// @097: getstatic java.awt.Color java.awt.Color.black
		// @09A: invokevirtual java.awt.Graphics.setColor(java.awt.Color)void
		// @09D: aload #6
		// @09F: iconst_1
		// @0A0: iconst_1
		// @0A1: sipush 301 (0x012D)
		// @0A4: bipush 31 (0x1F)
		// @0A6: invokevirtual java.awt.Graphics.drawRect(int, int, int, int)void
		// @0A9: aload #6
		// @0AB: iconst_2
		// @0AC: iload_2
		// @0AD: iconst_3
		// @0AE: imul
		// @0AF: ineg
		// @0B0: isub
		// @0B1: iconst_2
		// @0B2: sipush 300 (0x012C)
		// @0B5: iconst_3
		// @0B6: iload_2
		// @0B7: imul
		// @0B8: ineg
		// @0B9: iadd
		// @0BA: bipush 30 (0x1E)
		// @0BC: invokevirtual java.awt.Graphics.fillRect(int, int, int, int)void
		// @0BF: aload #6
		// @0C1: getstatic java.awt.Font game.C_100081_ue.field_100673_o
		// @0C4: invokevirtual java.awt.Graphics.setFont(java.awt.Font)void
		// @0C7: aload #6
		// @0C9: getstatic java.awt.Color java.awt.Color.white
		// @0CC: invokevirtual java.awt.Graphics.setColor(java.awt.Color)void
		// @0CF: aload #6
		// @0D1: aload_0
		// @0D2: sipush 304 (0x0130)
		// @0D5: bipush 6 (0x06)
		// @0D7: aload_0
		// @0D8: invokevirtual java.lang.String.length()int
		// @0DB: imul
		// @0DC: ineg
		// @0DD: iadd
		// @0DE: iconst_2
		// @0DF: idiv
		// @0E0: bipush 22 (0x16)
		// @0E2: invokevirtual java.awt.Graphics.drawString(java.lang.String, int, int)void
		// @0E5: aload #5
		// @0E7: getstatic java.awt.Image game.C_100080_b.field_104434_b
		// @0EA: getstatic int game.C_100270_mi.field_102282_cc
		// @0ED: iconst_2
		// @0EE: idiv
		// @0EF: sipush 152 (0x0098)
		// @0F2: isub
		// @0F3: bipush -18 (0xEE)
		// @0F5: getstatic int game.C_100165_sh.field_100769_s
		// @0F8: iconst_2
		// @0F9: idiv
		// @0FA: iadd
		// @0FB: aconst_null
		// @0FC: invokevirtual java.awt.Graphics.drawImage(java.awt.Image, int, int, java.awt.image.ImageObserver)boolean
		// @0FF: pop
		// @100: goto @1A4
		// @103: astore #6
		// @105: sipush -152 (0xFF68)
		// @108: getstatic int game.C_100270_mi.field_102282_cc
		// @10B: iconst_2
		// @10C: idiv
		// @10D: iadd
		// @10E: istore #7
		// @110: bipush -18 (0xEE)
		// @112: getstatic int game.C_100165_sh.field_100769_s
		// @115: iconst_2
		// @116: idiv
		// @117: iadd
		// @118: istore #8
		// @11A: aload #5
		// @11C: aload #4
		// @11E: invokevirtual java.awt.Graphics.setColor(java.awt.Color)void
		// @121: aload #5
		// @123: iload #7
		// @125: iload #8
		// @127: sipush 303 (0x012F)
		// @12A: bipush 33 (0x21)
		// @12C: invokevirtual java.awt.Graphics.drawRect(int, int, int, int)void
		// @12F: aload #5
		// @131: iload #7
		// @133: bipush -2 (0xFE)
		// @135: isub
		// @136: iload #8
		// @138: iconst_2
		// @139: iadd
		// @13A: iload_2
		// @13B: iconst_3
		// @13C: imul
		// @13D: bipush 30 (0x1E)
		// @13F: invokevirtual java.awt.Graphics.fillRect(int, int, int, int)void
		// @142: aload #5
		// @144: getstatic java.awt.Color java.awt.Color.black
		// @147: invokevirtual java.awt.Graphics.setColor(java.awt.Color)void
		// @14A: aload #5
		// @14C: iconst_1
		// @14D: iload #7
		// @14F: iadd
		// @150: iload #8
		// @152: iconst_1
		// @153: iadd
		// @154: sipush 301 (0x012D)
		// @157: bipush 31 (0x1F)
		// @159: invokevirtual java.awt.Graphics.drawRect(int, int, int, int)void
		// @15C: aload #5
		// @15E: iload_2
		// @15F: iconst_3
		// @160: imul
		// @161: iconst_2
		// @162: iadd
		// @163: iload #7
		// @165: iadd
		// @166: iload #8
		// @168: bipush -2 (0xFE)
		// @16A: isub
		// @16B: iconst_3
		// @16C: iload_2
		// @16D: imul
		// @16E: ineg
		// @16F: sipush 300 (0x012C)
		// @172: iadd
		// @173: bipush 30 (0x1E)
		// @175: invokevirtual java.awt.Graphics.fillRect(int, int, int, int)void
		// @178: aload #5
		// @17A: getstatic java.awt.Font game.C_100081_ue.field_100673_o
		// @17D: invokevirtual java.awt.Graphics.setFont(java.awt.Font)void
		// @180: aload #5
		// @182: getstatic java.awt.Color java.awt.Color.white
		// @185: invokevirtual java.awt.Graphics.setColor(java.awt.Color)void
		// @188: aload #5
		// @18A: aload_0
		// @18B: iload #7
		// @18D: sipush 304 (0x0130)
		// @190: aload_0
		// @191: invokevirtual java.lang.String.length()int
		// @194: bipush 6 (0x06)
		// @196: imul
		// @197: ineg
		// @198: iadd
		// @199: iconst_2
		// @19A: idiv
		// @19B: iadd
		// @19C: bipush 22 (0x16)
		// @19E: iload #8
		// @1A0: iadd
		// @1A1: invokevirtual java.awt.Graphics.drawString(java.lang.String, int, int)void
		// @1A4: aconst_null
		// @1A5: getstatic java.lang.String game.C_100309_lk.field_103266_V
		// @1A8: if_acmpeq @1E1
		// @1AB: aload #5
		// @1AD: getstatic java.awt.Font game.C_100081_ue.field_100673_o
		// @1B0: invokevirtual java.awt.Graphics.setFont(java.awt.Font)void
		// @1B3: aload #5
		// @1B5: getstatic java.awt.Color java.awt.Color.white
		// @1B8: invokevirtual java.awt.Graphics.setColor(java.awt.Color)void
		// @1BB: aload #5
		// @1BD: getstatic java.lang.String game.C_100309_lk.field_103266_V
		// @1C0: getstatic int game.C_100270_mi.field_102282_cc
		// @1C3: iconst_2
		// @1C4: idiv
		// @1C5: getstatic java.lang.String game.C_100309_lk.field_103266_V
		// @1C8: invokevirtual java.lang.String.length()int
		// @1CB: bipush 6 (0x06)
		// @1CD: imul
		// @1CE: iconst_2
		// @1CF: idiv
		// @1D0: ineg
		// @1D1: iadd
		// @1D2: getstatic int game.C_100165_sh.field_100769_s
		// @1D5: iconst_2
		// @1D6: idiv
		// @1D7: bipush -26 (0xE6)
		// @1D9: iadd
		// @1DA: invokevirtual java.awt.Graphics.drawString(java.lang.String, int, int)void
		// @1DD: goto @1E1
		// @1E0: athrow
		// @1E1: goto @1EC
		// @1E4: astore #5
		// @1E6: getstatic java.awt.Canvas game.C_100034_gi.field_104033_a
		// @1E9: invokevirtual java.awt.Canvas.repaint()void
		// @1EC: goto @259
		// @1EF: astore #5
		// @1F1: aload #5
		// @1F3: new java.lang.StringBuilder
		// @1F6: dup
		// @1F7: invokespecial java.lang.StringBuilder.<init>()void
		// @1FA: getstatic java.lang.String[] game.C_100160_sm.field_105418_z
		// @1FD: iconst_1
		// @1FE: aaload
		// @1FF: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @202: aload_0
		// @203: ifnull @20F
		// @206: getstatic java.lang.String[] game.C_100160_sm.field_105418_z
		// @209: iconst_0
		// @20A: aaload
		// @20B: goto @214
		// @20E: athrow
		// @20F: getstatic java.lang.String[] game.C_100160_sm.field_105418_z
		// @212: iconst_3
		// @213: aaload
		// @214: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @217: bipush 44 (0x2C)
		// @219: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @21C: iload_1
		// @21D: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @220: bipush 44 (0x2C)
		// @222: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @225: iload_2
		// @226: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @229: bipush 44 (0x2C)
		// @22B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @22E: iload_3
		// @22F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @232: bipush 44 (0x2C)
		// @234: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @237: aload #4
		// @239: ifnull @245
		// @23C: getstatic java.lang.String[] game.C_100160_sm.field_105418_z
		// @23F: iconst_0
		// @240: aaload
		// @241: goto @24A
		// @244: athrow
		// @245: getstatic java.lang.String[] game.C_100160_sm.field_105418_z
		// @248: iconst_3
		// @249: aaload
		// @24A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @24D: bipush 41 (0x29)
		// @24F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @252: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @255: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @258: athrow
		// @259: return
	}
	
	static final void func_105409_a(boolean arg0, byte arg1, int arg2, int arg3, String arg4, long arg5)
	{
		// @00: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @03: iload_2
		// @04: bipush 116 (0x74)
		// @06: invokevirtual game.C_100278_nd.func_101189_h(int, int)void
		// @09: iload_1
		// @0A: bipush -33 (0xDF)
		// @0C: if_icmpeq @10
		// @0F: return
		// @10: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @13: dup
		// @14: getfield int game.C_100278_nd.field_101177_n
		// @17: iconst_1
		// @18: iadd
		// @19: putfield int game.C_100278_nd.field_101177_n
		// @1C: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @1F: getfield int game.C_100278_nd.field_101177_n
		// @22: istore #7
		// @24: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @27: iload_1
		// @28: bipush -33 (0xDF)
		// @2A: ixor
		// @2B: lload #5
		// @2D: invokevirtual game.C_100278_nd.func_101131_a(int, long)void
		// @30: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @33: sipush -28365 (0x9133)
		// @36: aload #4
		// @38: invokevirtual game.C_100278_nd.func_101167_a(int, java.lang.String)void
		// @3B: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @3E: sipush 7838 (0x1E9E)
		// @41: iload_3
		// @42: invokevirtual game.C_100278_nd.func_101169_f(int, int)void
		// @45: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @48: iload_1
		// @49: sipush 7871 (0x1EBF)
		// @4C: iadd
		// @4D: iload_0
		// @4E: ifne @56
		// @51: iconst_0
		// @52: goto @57
		// @55: athrow
		// @56: iconst_1
		// @57: invokevirtual game.C_100278_nd.func_101169_f(int, int)void
		// @5A: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @5D: iload #7
		// @5F: ineg
		// @60: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @63: getfield int game.C_100278_nd.field_101177_n
		// @66: iadd
		// @67: bipush -91 (0xA5)
		// @69: invokevirtual game.C_100278_nd.func_101139_c(int, byte)void
		// @6C: goto @D2
		// @6F: astore #7
		// @71: aload #7
		// @73: new java.lang.StringBuilder
		// @76: dup
		// @77: invokespecial java.lang.StringBuilder.<init>()void
		// @7A: getstatic java.lang.String[] game.C_100160_sm.field_105418_z
		// @7D: iconst_5
		// @7E: aaload
		// @7F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @82: iload_0
		// @83: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @86: bipush 44 (0x2C)
		// @88: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8B: iload_1
		// @8C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8F: bipush 44 (0x2C)
		// @91: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @94: iload_2
		// @95: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @98: bipush 44 (0x2C)
		// @9A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9D: iload_3
		// @9E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A1: bipush 44 (0x2C)
		// @A3: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A6: aload #4
		// @A8: ifnull @B4
		// @AB: getstatic java.lang.String[] game.C_100160_sm.field_105418_z
		// @AE: iconst_0
		// @AF: aaload
		// @B0: goto @B9
		// @B3: athrow
		// @B4: getstatic java.lang.String[] game.C_100160_sm.field_105418_z
		// @B7: iconst_3
		// @B8: aaload
		// @B9: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @BC: bipush 44 (0x2C)
		// @BE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C1: lload #5
		// @C3: invokevirtual java.lang.StringBuilder.append(long)java.lang.StringBuilder
		// @C6: bipush 41 (0x29)
		// @C8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @CB: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @CE: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @D1: athrow
		// @D2: return
	}
	
	static final Class func_105410_a(byte arg0, String arg1) throws ClassNotFoundException
	{
		// @00: aload_1
		// @01: ldc "B"
		// @03: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @06: ifeq @0E
		// @09: getstatic java.lang.Class java.lang.Byte.TYPE
		// @0C: areturn
		// @0D: athrow
		// @0E: aload_1
		// @0F: ldc "I"
		// @11: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @14: ifne @1B
		// @17: goto @1F
		// @1A: athrow
		// @1B: getstatic java.lang.Class java.lang.Integer.TYPE
		// @1E: areturn
		// @1F: aload_1
		// @20: ldc "S"
		// @22: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @25: ifeq @2D
		// @28: getstatic java.lang.Class java.lang.Short.TYPE
		// @2B: areturn
		// @2C: athrow
		// @2D: aload_1
		// @2E: ldc "J"
		// @30: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @33: ifeq @3B
		// @36: getstatic java.lang.Class java.lang.Long.TYPE
		// @39: areturn
		// @3A: athrow
		// @3B: aload_1
		// @3C: ldc "Z"
		// @3E: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @41: ifeq @49
		// @44: getstatic java.lang.Class java.lang.Boolean.TYPE
		// @47: areturn
		// @48: athrow
		// @49: aload_1
		// @4A: ldc "F"
		// @4C: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @4F: ifeq @57
		// @52: getstatic java.lang.Class java.lang.Float.TYPE
		// @55: areturn
		// @56: athrow
		// @57: aload_1
		// @58: ldc "D"
		// @5A: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @5D: ifne @64
		// @60: goto @68
		// @63: athrow
		// @64: getstatic java.lang.Class java.lang.Double.TYPE
		// @67: areturn
		// @68: aload_1
		// @69: ldc "C"
		// @6B: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @6E: ifeq @76
		// @71: getstatic java.lang.Class java.lang.Character.TYPE
		// @74: areturn
		// @75: athrow
		// @76: iload_0
		// @77: bipush -38 (0xDA)
		// @79: if_icmplt @82
		// @7C: aconst_null
		// @7D: checkcast java.lang.Class
		// @80: areturn
		// @81: athrow
		// @82: aload_1
		// @83: invokestatic java.lang.Class.forName(java.lang.String)java.lang.Class
		// @86: areturn
		// @87: astore_2
		// @88: aload_2
		// @89: new java.lang.StringBuilder
		// @8C: dup
		// @8D: invokespecial java.lang.StringBuilder.<init>()void
		// @90: getstatic java.lang.String[] game.C_100160_sm.field_105418_z
		// @93: bipush 7 (0x07)
		// @95: aaload
		// @96: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @99: iload_0
		// @9A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @9D: bipush 44 (0x2C)
		// @9F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A2: aload_1
		// @A3: ifnull @AF
		// @A6: getstatic java.lang.String[] game.C_100160_sm.field_105418_z
		// @A9: iconst_0
		// @AA: aaload
		// @AB: goto @B4
		// @AE: athrow
		// @AF: getstatic java.lang.String[] game.C_100160_sm.field_105418_z
		// @B2: iconst_3
		// @B3: aaload
		// @B4: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @B7: bipush 41 (0x29)
		// @B9: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @BC: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @BF: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @C2: athrow
	}
	
	static final C_100193_re func_105412_a(byte arg0, String arg1, String arg2, C_100098_h arg3, C_100098_h arg4)
	{
		// @00: iload_0
		// @01: bipush -70 (0xBA)
		// @03: if_icmpeq @0B
		// @06: aconst_null
		// @07: checkcast game.C_100193_re
		// @0A: areturn
		// @0B: aload_3
		// @0C: iload_0
		// @0D: sipush -10649 (0xD667)
		// @10: iadd
		// @11: aload_1
		// @12: invokevirtual game.C_100098_h.func_104601_b(int, java.lang.String)int
		// @15: istore #5
		// @17: aload_3
		// @18: aload_2
		// @19: iload #5
		// @1B: iload_0
		// @1C: bipush 70 (0x46)
		// @1E: iadd
		// @1F: invokevirtual game.C_100098_h.func_104600_a(java.lang.String, int, int)int
		// @22: istore #6
		// @24: aload_3
		// @25: iload #6
		// @27: bipush -33 (0xDF)
		// @29: aload #4
		// @2B: iload #5
		// @2D: invokestatic game.C_100263_mb.func_106502_a(game.C_100098_h, int, int, game.C_100098_h, int)game.C_100193_re
		// @30: areturn
		// @31: astore #5
		// @33: aload #5
		// @35: new java.lang.StringBuilder
		// @38: dup
		// @39: invokespecial java.lang.StringBuilder.<init>()void
		// @3C: getstatic java.lang.String[] game.C_100160_sm.field_105418_z
		// @3F: bipush 6 (0x06)
		// @41: aaload
		// @42: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @45: iload_0
		// @46: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @49: bipush 44 (0x2C)
		// @4B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4E: aload_1
		// @4F: ifnull @5B
		// @52: getstatic java.lang.String[] game.C_100160_sm.field_105418_z
		// @55: iconst_0
		// @56: aaload
		// @57: goto @60
		// @5A: athrow
		// @5B: getstatic java.lang.String[] game.C_100160_sm.field_105418_z
		// @5E: iconst_3
		// @5F: aaload
		// @60: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @63: bipush 44 (0x2C)
		// @65: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @68: aload_2
		// @69: ifnull @75
		// @6C: getstatic java.lang.String[] game.C_100160_sm.field_105418_z
		// @6F: iconst_0
		// @70: aaload
		// @71: goto @7A
		// @74: athrow
		// @75: getstatic java.lang.String[] game.C_100160_sm.field_105418_z
		// @78: iconst_3
		// @79: aaload
		// @7A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @7D: bipush 44 (0x2C)
		// @7F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @82: aload_3
		// @83: ifnull @8F
		// @86: getstatic java.lang.String[] game.C_100160_sm.field_105418_z
		// @89: iconst_0
		// @8A: aaload
		// @8B: goto @94
		// @8E: athrow
		// @8F: getstatic java.lang.String[] game.C_100160_sm.field_105418_z
		// @92: iconst_3
		// @93: aaload
		// @94: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @97: bipush 44 (0x2C)
		// @99: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9C: aload #4
		// @9E: ifnull @AA
		// @A1: getstatic java.lang.String[] game.C_100160_sm.field_105418_z
		// @A4: iconst_0
		// @A5: aaload
		// @A6: goto @AF
		// @A9: athrow
		// @AA: getstatic java.lang.String[] game.C_100160_sm.field_105418_z
		// @AD: iconst_3
		// @AE: aaload
		// @AF: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @B2: bipush 41 (0x29)
		// @B4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B7: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @BA: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @BD: athrow
	}
	
	static
	{
		// @00: bipush 8 (0x08)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "K\u000cf;5"
		// @09: invokestatic game.C_100160_sm.func_105408_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100160_sm.func_105407_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "COfP`"
		// @14: invokestatic game.C_100160_sm.func_105408_z(java.lang.String)char[]
		// @17: invokestatic game.C_100160_sm.func_105407_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "xG$c-DK+t"
		// @1F: invokestatic game.C_100160_sm.func_105408_z(java.lang.String)char[]
		// @22: invokestatic game.C_100160_sm.func_105407_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "^W$y"
		// @2A: invokestatic game.C_100160_sm.func_105408_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100160_sm.func_105407_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "COfT`"
		// @35: invokestatic game.C_100160_sm.func_105408_z(java.lang.String)char[]
		// @38: invokestatic game.C_100160_sm.func_105407_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "COfW`"
		// @40: invokestatic game.C_100160_sm.func_105408_z(java.lang.String)char[]
		// @43: invokestatic game.C_100160_sm.func_105407_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "COfQ`"
		// @4C: invokestatic game.C_100160_sm.func_105408_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100160_sm.func_105407_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "COfV`"
		// @58: invokestatic game.C_100160_sm.func_105408_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100160_sm.func_105407_z(char[])java.lang.String
		// @5E: aastore
		// @5F: putstatic java.lang.String[] game.C_100160_sm.field_105418_z
		// @62: ldc "S"
		// @64: putstatic java.lang.String game.C_100160_sm.field_105417_a
		// @67: return
	}
	
	private static char[] func_105408_z(String arg0)
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
		// @0E: bipush 72 (0x48)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_105407_z(char[] arg0)
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
		// @30: bipush 48 (0x30)
		// @32: goto @46
		// @35: bipush 34 (0x22)
		// @37: goto @46
		// @3A: bipush 72 (0x48)
		// @3C: goto @46
		// @3F: bipush 21 (0x15)
		// @41: goto @46
		// @44: bipush 72 (0x48)
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
