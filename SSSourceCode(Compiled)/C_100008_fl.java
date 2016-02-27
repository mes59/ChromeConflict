package game;

final class C_100008_fl
{
	static int field_103639_a;
	static int field_103638_b;
	private static final String[] field_103640_z;
	
	static final void func_103637_a(int arg0, boolean arg1, int arg2, int arg3, byte arg4, byte[] arg5)
	{
		// @00: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @03: astore #6
		// @05: aload #6
		// @07: iload_3
		// @08: bipush 105 (0x69)
		// @0A: invokevirtual game.C_100278_nd.func_101189_h(int, int)void
		// @0D: aload #6
		// @0F: dup
		// @10: getfield int game.C_100278_nd.field_101177_n
		// @13: iconst_1
		// @14: iadd
		// @15: putfield int game.C_100278_nd.field_101177_n
		// @18: iload #4
		// @1A: bipush -125 (0x83)
		// @1C: if_icmpeq @28
		// @1F: bipush 106 (0x6A)
		// @21: putstatic int game.C_100008_fl.field_103638_b
		// @24: goto @28
		// @27: athrow
		// @28: aload #6
		// @2A: getfield int game.C_100278_nd.field_101177_n
		// @2D: istore #7
		// @2F: aload #6
		// @31: sipush 7838 (0x1E9E)
		// @34: iconst_4
		// @35: invokevirtual game.C_100278_nd.func_101169_f(int, int)void
		// @38: aload #6
		// @3A: sipush 7838 (0x1E9E)
		// @3D: iload_2
		// @3E: invokevirtual game.C_100278_nd.func_101169_f(int, int)void
		// @41: iload_0
		// @42: istore #8
		// @44: iload_1
		// @45: ifne @4C
		// @48: goto @52
		// @4B: athrow
		// @4C: wide (iinc) #8 +128
		// @52: aload #6
		// @54: sipush 7838 (0x1E9E)
		// @57: iload #8
		// @59: invokevirtual game.C_100278_nd.func_101169_f(int, int)void
		// @5C: aload #6
		// @5E: aload #5
		// @60: iconst_0
		// @61: aload #5
		// @63: arraylength
		// @64: bipush -87 (0xA9)
		// @66: invokevirtual game.C_100278_nd.func_101165_b(byte[], int, int, int)void
		// @69: aload #6
		// @6B: aload #6
		// @6D: getfield int game.C_100278_nd.field_101177_n
		// @70: iload #7
		// @72: isub
		// @73: bipush -97 (0x9F)
		// @75: invokevirtual game.C_100278_nd.func_101139_c(int, byte)void
		// @78: goto @DE
		// @7B: astore #6
		// @7D: aload #6
		// @7F: new java.lang.StringBuilder
		// @82: dup
		// @83: invokespecial java.lang.StringBuilder.<init>()void
		// @86: getstatic java.lang.String[] game.C_100008_fl.field_103640_z
		// @89: iconst_1
		// @8A: aaload
		// @8B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @8E: iload_0
		// @8F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @92: bipush 44 (0x2C)
		// @94: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @97: iload_1
		// @98: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @9B: bipush 44 (0x2C)
		// @9D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A0: iload_2
		// @A1: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A4: bipush 44 (0x2C)
		// @A6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A9: iload_3
		// @AA: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @AD: bipush 44 (0x2C)
		// @AF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B2: iload #4
		// @B4: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @B7: bipush 44 (0x2C)
		// @B9: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @BC: aload #5
		// @BE: ifnull @CA
		// @C1: getstatic java.lang.String[] game.C_100008_fl.field_103640_z
		// @C4: iconst_2
		// @C5: aaload
		// @C6: goto @CF
		// @C9: athrow
		// @CA: getstatic java.lang.String[] game.C_100008_fl.field_103640_z
		// @CD: iconst_0
		// @CE: aaload
		// @CF: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @D2: bipush 41 (0x29)
		// @D4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D7: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @DA: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @DD: athrow
		// @DE: return
	}
	
	static final int func_103636_a(byte arg0, CharSequence arg1, int arg2, boolean arg3)
	{
		// @000: iload_2
		// @001: iconst_m1
		// @002: ixor
		// @003: bipush -3 (0xFD)
		// @005: if_icmpgt @016
		// @008: bipush 36 (0x24)
		// @00A: iload_2
		// @00B: if_icmplt @016
		// @00E: goto @012
		// @011: athrow
		// @012: goto @031
		// @015: athrow
		// @016: new java.lang.IllegalArgumentException
		// @019: dup
		// @01A: new java.lang.StringBuilder
		// @01D: dup
		// @01E: invokespecial java.lang.StringBuilder.<init>()void
		// @021: ldc ""
		// @023: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @026: iload_2
		// @027: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @02A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @02D: invokespecial java.lang.IllegalArgumentException.<init>(java.lang.String)void
		// @030: athrow
		// @031: iconst_0
		// @032: istore #4
		// @034: iconst_0
		// @035: istore #5
		// @037: iconst_0
		// @038: istore #6
		// @03A: aload_1
		// @03B: invokeinterface java.lang.CharSequence.length()int
		// @040: istore #7
		// @042: iconst_0
		// @043: istore #8
		// @045: iload #8
		// @047: iload #7
		// @049: if_icmpge @129
		// @04C: aload_1
		// @04D: iload #8
		// @04F: invokeinterface java.lang.CharSequence.charAt(int)char
		// @054: istore #9
		// @056: iconst_0
		// @057: iload #8
		// @059: if_icmpeq @060
		// @05C: goto @082
		// @05F: athrow
		// @060: bipush -46 (0xD2)
		// @062: iload #9
		// @064: iconst_m1
		// @065: ixor
		// @066: if_icmpeq @06D
		// @069: goto @073
		// @06C: athrow
		// @06D: iconst_1
		// @06E: istore #4
		// @070: goto @123
		// @073: iload #9
		// @075: bipush 43 (0x2B)
		// @077: if_icmpne @082
		// @07A: iload_3
		// @07B: ifne @123
		// @07E: goto @082
		// @081: athrow
		// @082: iload #9
		// @084: iconst_m1
		// @085: ixor
		// @086: bipush -49 (0xCF)
		// @088: if_icmpgt @0A1
		// @08B: goto @08F
		// @08E: athrow
		// @08F: iload #9
		// @091: bipush 57 (0x39)
		// @093: if_icmpgt @0A1
		// @096: goto @09A
		// @099: athrow
		// @09A: iinc #9 +208
		// @09D: goto @0DA
		// @0A0: athrow
		// @0A1: bipush -66 (0xBE)
		// @0A3: iload #9
		// @0A5: iconst_m1
		// @0A6: ixor
		// @0A7: if_icmplt @0BC
		// @0AA: iload #9
		// @0AC: bipush 90 (0x5A)
		// @0AE: if_icmpgt @0BC
		// @0B1: goto @0B5
		// @0B4: athrow
		// @0B5: iinc #9 +201
		// @0B8: goto @0DA
		// @0BB: athrow
		// @0BC: iload #9
		// @0BE: bipush 97 (0x61)
		// @0C0: if_icmplt @0CE
		// @0C3: iload #9
		// @0C5: bipush 122 (0x7A)
		// @0C7: if_icmple @0D7
		// @0CA: goto @0CE
		// @0CD: athrow
		// @0CE: new java.lang.NumberFormatException
		// @0D1: dup
		// @0D2: invokespecial java.lang.NumberFormatException.<init>()void
		// @0D5: athrow
		// @0D6: athrow
		// @0D7: iinc #9 +169
		// @0DA: iload_2
		// @0DB: iconst_m1
		// @0DC: ixor
		// @0DD: iload #9
		// @0DF: iconst_m1
		// @0E0: ixor
		// @0E1: if_icmpge @0E8
		// @0E4: goto @0F0
		// @0E7: athrow
		// @0E8: new java.lang.NumberFormatException
		// @0EB: dup
		// @0EC: invokespecial java.lang.NumberFormatException.<init>()void
		// @0EF: athrow
		// @0F0: iload #4
		// @0F2: ifeq @0FA
		// @0F5: iload #9
		// @0F7: ineg
		// @0F8: istore #9
		// @0FA: iload #9
		// @0FC: iload #6
		// @0FE: iload_2
		// @0FF: imul
		// @100: iadd
		// @101: istore #10
		// @103: iload #10
		// @105: iload_2
		// @106: idiv
		// @107: iconst_m1
		// @108: ixor
		// @109: iload #6
		// @10B: iconst_m1
		// @10C: ixor
		// @10D: if_icmpne @114
		// @110: goto @11C
		// @113: athrow
		// @114: new java.lang.NumberFormatException
		// @117: dup
		// @118: invokespecial java.lang.NumberFormatException.<init>()void
		// @11B: athrow
		// @11C: iload #10
		// @11E: istore #6
		// @120: iconst_1
		// @121: istore #5
		// @123: iinc #8 +1
		// @126: goto @045
		// @129: iload_0
		// @12A: bipush -93 (0xA3)
		// @12C: if_icmpeq @140
		// @12F: bipush 47 (0x2F)
		// @131: aconst_null
		// @132: checkcast java.lang.CharSequence
		// @135: bipush -99 (0x9D)
		// @137: iconst_0
		// @138: invokestatic game.C_100008_fl.func_103636_a(byte, java.lang.CharSequence, int, boolean)int
		// @13B: pop
		// @13C: goto @140
		// @13F: athrow
		// @140: iload #5
		// @142: ifne @14E
		// @145: new java.lang.NumberFormatException
		// @148: dup
		// @149: invokespecial java.lang.NumberFormatException.<init>()void
		// @14C: athrow
		// @14D: athrow
		// @14E: iload #6
		// @150: ireturn
		// @151: astore #4
		// @153: aload #4
		// @155: new java.lang.StringBuilder
		// @158: dup
		// @159: invokespecial java.lang.StringBuilder.<init>()void
		// @15C: getstatic java.lang.String[] game.C_100008_fl.field_103640_z
		// @15F: iconst_3
		// @160: aaload
		// @161: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @164: iload_0
		// @165: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @168: bipush 44 (0x2C)
		// @16A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @16D: aload_1
		// @16E: ifnull @17A
		// @171: getstatic java.lang.String[] game.C_100008_fl.field_103640_z
		// @174: iconst_2
		// @175: aaload
		// @176: goto @17F
		// @179: athrow
		// @17A: getstatic java.lang.String[] game.C_100008_fl.field_103640_z
		// @17D: iconst_0
		// @17E: aaload
		// @17F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @182: bipush 44 (0x2C)
		// @184: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @187: iload_2
		// @188: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @18B: bipush 44 (0x2C)
		// @18D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @190: iload_3
		// @191: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @194: bipush 41 (0x29)
		// @196: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @199: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @19C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @19F: athrow
	}
	
	static
	{
		// @00: iconst_4
		// @01: anewarray java.lang.String
		// @04: dup
		// @05: iconst_0
		// @06: ldc "/\u0018&h"
		// @08: invokestatic game.C_100008_fl.func_103635_z(java.lang.String)char[]
		// @0B: invokestatic game.C_100008_fl.func_103634_z(char[])java.lang.String
		// @0E: aastore
		// @0F: dup
		// @10: iconst_1
		// @11: ldc "'\u0001dFQ"
		// @13: invokestatic game.C_100008_fl.func_103635_z(java.lang.String)char[]
		// @16: invokestatic game.C_100008_fl.func_103634_z(char[])java.lang.String
		// @19: aastore
		// @1A: dup
		// @1B: iconst_2
		// @1C: ldc ":Cd*\u0004"
		// @1E: invokestatic game.C_100008_fl.func_103635_z(java.lang.String)char[]
		// @21: invokestatic game.C_100008_fl.func_103634_z(char[])java.lang.String
		// @24: aastore
		// @25: dup
		// @26: iconst_3
		// @27: ldc "'\u0001dEQ"
		// @29: invokestatic game.C_100008_fl.func_103635_z(java.lang.String)char[]
		// @2C: invokestatic game.C_100008_fl.func_103634_z(char[])java.lang.String
		// @2F: aastore
		// @30: putstatic java.lang.String[] game.C_100008_fl.field_103640_z
		// @33: iconst_0
		// @34: putstatic int game.C_100008_fl.field_103639_a
		// @37: iconst_5
		// @38: putstatic int game.C_100008_fl.field_103638_b
		// @3B: return
	}
	
	private static char[] func_103635_z(String arg0)
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
		// @0E: bipush 121 (0x79)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_103634_z(char[] arg0)
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
		// @30: bipush 65 (0x41)
		// @32: goto @45
		// @35: bipush 109 (0x6D)
		// @37: goto @45
		// @3A: bipush 74 (0x4A)
		// @3C: goto @45
		// @3F: iconst_4
		// @40: goto @45
		// @43: bipush 121 (0x79)
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
