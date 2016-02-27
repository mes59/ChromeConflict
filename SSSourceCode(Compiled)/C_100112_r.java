package game;

abstract class C_100112_r extends C_100325_id
{
	int field_101763_H;
	private int[] field_101761_N;
	private C_100295_kh[] field_101771_s;
	int field_101775_y;
	private int[] field_101764_I;
	private byte[] field_101756_A;
	private int[] field_101758_C;
	int field_101769_u;
	private static StringBuilder field_101766_K;
	private int[] field_101752_D;
	int field_101772_Q;
	private int[] field_101768_v;
	private int[] field_101755_G;
	private static String[] field_101762_O;
	private static int field_101760_M;
	private static int field_101773_P;
	private static int field_101774_z;
	private static int field_101753_E;
	private static int field_101759_L;
	private static int field_101776_x;
	private static int field_101754_F;
	private static int field_101767_w;
	private static int field_101770_t;
	private static int field_101757_B;
	private static final String[] field_101765_J;
	
	final int func_101724_c(String arg0, int arg1)
	{
		// @00: aload_0
		// @01: aload_1
		// @02: iconst_1
		// @03: newarray int[]
		// @05: dup
		// @06: iconst_0
		// @07: iload_2
		// @08: iastore
		// @09: getstatic java.lang.String[] game.C_100112_r.field_101762_O
		// @0C: invokevirtual game.C_100112_r.func_101730_a(java.lang.String, int[], java.lang.String[])int
		// @0F: ireturn
	}
	
	final void func_101744_b(String arg0, int arg1, int arg2, int arg3, int arg4)
	{
		// @00: aload_1
		// @01: ifnonnull @06
		// @04: return
		// @05: athrow
		// @06: aload_0
		// @07: iload #4
		// @09: iload #5
		// @0B: invokespecial game.C_100112_r.func_101736_a(int, int)void
		// @0E: aload_0
		// @0F: aload_1
		// @10: iload_2
		// @11: aload_0
		// @12: aload_1
		// @13: invokevirtual game.C_100112_r.func_101739_b(java.lang.String)int
		// @16: iconst_2
		// @17: idiv
		// @18: isub
		// @19: iload_3
		// @1A: invokespecial game.C_100112_r.func_101737_b(java.lang.String, int, int)void
		// @1D: return
	}
	
	abstract void func_101723_a(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);
	
	final int func_101739_b(String arg0)
	{
		// @000: aload_1
		// @001: ifnonnull @007
		// @004: iconst_0
		// @005: ireturn
		// @006: athrow
		// @007: iconst_m1
		// @008: istore_2
		// @009: iconst_0
		// @00A: istore_3
		// @00B: iconst_0
		// @00C: istore #4
		// @00E: aload_1
		// @00F: invokevirtual java.lang.String.length()int
		// @012: istore #5
		// @014: iconst_0
		// @015: istore #6
		// @017: iload #6
		// @019: iload #5
		// @01B: if_icmpge @17C
		// @01E: aload_1
		// @01F: iload #6
		// @021: invokevirtual java.lang.String.charAt(int)char
		// @024: istore #7
		// @026: iload #7
		// @028: bipush 60 (0x3C)
		// @02A: if_icmpne @033
		// @02D: iload #6
		// @02F: istore_2
		// @030: goto @176
		// @033: iload #7
		// @035: bipush 62 (0x3E)
		// @037: if_icmpne @135
		// @03A: iload_2
		// @03B: iconst_m1
		// @03C: if_icmpeq @135
		// @03F: goto @043
		// @042: athrow
		// @043: aload_1
		// @044: iload_2
		// @045: iconst_1
		// @046: iadd
		// @047: iload #6
		// @049: invokevirtual java.lang.String.substring(int, int)java.lang.String
		// @04C: invokevirtual java.lang.String.toLowerCase()java.lang.String
		// @04F: astore #8
		// @051: iconst_m1
		// @052: istore_2
		// @053: aload #8
		// @055: getstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @058: bipush 20 (0x14)
		// @05A: aaload
		// @05B: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @05E: ifeq @068
		// @061: bipush 60 (0x3C)
		// @063: istore #7
		// @065: goto @135
		// @068: aload #8
		// @06A: getstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @06D: bipush 14 (0x0E)
		// @06F: aaload
		// @070: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @073: ifeq @07D
		// @076: bipush 62 (0x3E)
		// @078: istore #7
		// @07A: goto @135
		// @07D: aload #8
		// @07F: getstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @082: bipush 16 (0x10)
		// @084: aaload
		// @085: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @088: ifeq @093
		// @08B: sipush 160 (0x00A0)
		// @08E: istore #7
		// @090: goto @135
		// @093: aload #8
		// @095: getstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @098: bipush 18 (0x12)
		// @09A: aaload
		// @09B: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @09E: ifeq @0A9
		// @0A1: sipush 173 (0x00AD)
		// @0A4: istore #7
		// @0A6: goto @135
		// @0A9: aload #8
		// @0AB: getstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @0AE: bipush 17 (0x11)
		// @0B0: aaload
		// @0B1: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @0B4: ifeq @0BF
		// @0B7: sipush 215 (0x00D7)
		// @0BA: istore #7
		// @0BC: goto @135
		// @0BF: aload #8
		// @0C1: getstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @0C4: bipush 19 (0x13)
		// @0C6: aaload
		// @0C7: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @0CA: ifeq @0D5
		// @0CD: sipush 8364 (0x20AC)
		// @0D0: istore #7
		// @0D2: goto @135
		// @0D5: aload #8
		// @0D7: getstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @0DA: bipush 21 (0x15)
		// @0DC: aaload
		// @0DD: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @0E0: ifeq @0EB
		// @0E3: sipush 169 (0x00A9)
		// @0E6: istore #7
		// @0E8: goto @135
		// @0EB: aload #8
		// @0ED: getstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @0F0: bipush 22 (0x16)
		// @0F2: aaload
		// @0F3: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @0F6: ifeq @101
		// @0F9: sipush 174 (0x00AE)
		// @0FC: istore #7
		// @0FE: goto @135
		// @101: aload #8
		// @103: getstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @106: bipush 15 (0x0F)
		// @108: aaload
		// @109: invokevirtual java.lang.String.startsWith(java.lang.String)boolean
		// @10C: ifeq @176
		// @10F: aload #8
		// @111: iconst_4
		// @112: invokevirtual java.lang.String.substring(int)java.lang.String
		// @115: bipush -116 (0x8C)
		// @117: invokestatic game.C_100001_ge.func_100552_a(java.lang.CharSequence, int)int
		// @11A: istore #9
		// @11C: iload #4
		// @11E: aload_0
		// @11F: getfield game.C_100295_kh[] game.C_100112_r.field_101771_s
		// @122: iload #9
		// @124: aaload
		// @125: getfield int game.C_100295_kh.field_105301_h
		// @128: iadd
		// @129: istore #4
		// @12B: iconst_0
		// @12C: istore_3
		// @12D: goto @176
		// @130: astore #9
		// @132: goto @176
		// @135: iload_2
		// @136: iconst_m1
		// @137: if_icmpne @176
		// @13A: iconst_0
		// @13B: iload #7
		// @13D: invokestatic game.C_100198_qn.func_105832_a(boolean, char)byte
		// @140: sipush 255 (0x00FF)
		// @143: iand
		// @144: i2c
		// @145: istore #7
		// @147: iload #4
		// @149: aload_0
		// @14A: getfield int[] game.C_100112_r.field_101758_C
		// @14D: iload #7
		// @14F: iaload
		// @150: iadd
		// @151: istore #4
		// @153: aload_0
		// @154: getfield byte[] game.C_100112_r.field_101756_A
		// @157: ifnull @173
		// @15A: iload_3
		// @15B: ifeq @173
		// @15E: goto @162
		// @161: athrow
		// @162: iload #4
		// @164: aload_0
		// @165: getfield byte[] game.C_100112_r.field_101756_A
		// @168: iload_3
		// @169: bipush 8 (0x08)
		// @16B: ishl
		// @16C: iload #7
		// @16E: iadd
		// @16F: baload
		// @170: iadd
		// @171: istore #4
		// @173: iload #7
		// @175: istore_3
		// @176: iinc #6 +1
		// @179: goto @017
		// @17C: iload #4
		// @17E: ireturn
	}
	
	private final void func_101732_d(String arg0, int arg1)
	{
		// @00: iconst_0
		// @01: istore_3
		// @02: iconst_0
		// @03: istore #4
		// @05: aload_1
		// @06: invokevirtual java.lang.String.length()int
		// @09: istore #5
		// @0B: iconst_0
		// @0C: istore #6
		// @0E: iload #6
		// @10: iload #5
		// @12: if_icmpge @54
		// @15: aload_1
		// @16: iload #6
		// @18: invokevirtual java.lang.String.charAt(int)char
		// @1B: istore #7
		// @1D: iload #7
		// @1F: bipush 60 (0x3C)
		// @21: if_icmpne @2A
		// @24: iconst_1
		// @25: istore #4
		// @27: goto @4E
		// @2A: iload #7
		// @2C: bipush 62 (0x3E)
		// @2E: if_icmpne @37
		// @31: iconst_0
		// @32: istore #4
		// @34: goto @4E
		// @37: iload #4
		// @39: ifne @4E
		// @3C: iload #7
		// @3E: bipush 32 (0x20)
		// @40: if_icmpne @4E
		// @43: goto @47
		// @46: athrow
		// @47: iinc #3 +1
		// @4A: goto @4E
		// @4D: athrow
		// @4E: iinc #6 +1
		// @51: goto @0E
		// @54: iload_3
		// @55: ifle @6B
		// @58: iload_2
		// @59: aload_0
		// @5A: aload_1
		// @5B: invokevirtual game.C_100112_r.func_101739_b(java.lang.String)int
		// @5E: isub
		// @5F: bipush 8 (0x08)
		// @61: ishl
		// @62: iload_3
		// @63: idiv
		// @64: putstatic int game.C_100112_r.field_101759_L
		// @67: goto @6B
		// @6A: athrow
		// @6B: return
	}
	
	final void func_101740_c(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
	{
		// @00: aload_1
		// @01: ifnonnull @06
		// @04: return
		// @05: athrow
		// @06: aload_0
		// @07: iload #4
		// @09: iload #5
		// @0B: iload #6
		// @0D: invokespecial game.C_100112_r.func_101743_a(int, int, int)void
		// @10: aload_0
		// @11: aload_1
		// @12: iload_2
		// @13: aload_0
		// @14: aload_1
		// @15: invokevirtual game.C_100112_r.func_101739_b(java.lang.String)int
		// @18: isub
		// @19: iload_3
		// @1A: invokespecial game.C_100112_r.func_101737_b(java.lang.String, int, int)void
		// @1D: return
	}
	
	private final void func_101737_b(String arg0, int arg1, int arg2)
	{
		// @000: iload_3
		// @001: aload_0
		// @002: getfield int game.C_100112_r.field_101775_y
		// @005: isub
		// @006: istore_3
		// @007: iconst_m1
		// @008: istore #4
		// @00A: iconst_0
		// @00B: istore #5
		// @00D: aload_1
		// @00E: invokevirtual java.lang.String.length()int
		// @011: istore #6
		// @013: iconst_0
		// @014: istore #7
		// @016: iload #7
		// @018: iload #6
		// @01A: if_icmpge @30E
		// @01D: aload_1
		// @01E: iload #7
		// @020: invokevirtual java.lang.String.charAt(int)char
		// @023: istore #8
		// @025: iload #8
		// @027: bipush 60 (0x3C)
		// @029: if_icmpne @033
		// @02C: iload #7
		// @02E: istore #4
		// @030: goto @308
		// @033: iload #8
		// @035: bipush 62 (0x3E)
		// @037: if_icmpne @18B
		// @03A: iload #4
		// @03C: iconst_m1
		// @03D: if_icmpeq @18B
		// @040: goto @044
		// @043: athrow
		// @044: aload_1
		// @045: iload #4
		// @047: iconst_1
		// @048: iadd
		// @049: iload #7
		// @04B: invokevirtual java.lang.String.substring(int, int)java.lang.String
		// @04E: invokevirtual java.lang.String.toLowerCase()java.lang.String
		// @051: astore #9
		// @053: iconst_m1
		// @054: istore #4
		// @056: aload #9
		// @058: getstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @05B: bipush 20 (0x14)
		// @05D: aaload
		// @05E: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @061: ifeq @06B
		// @064: bipush 60 (0x3C)
		// @066: istore #8
		// @068: goto @18B
		// @06B: aload #9
		// @06D: getstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @070: bipush 14 (0x0E)
		// @072: aaload
		// @073: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @076: ifeq @080
		// @079: bipush 62 (0x3E)
		// @07B: istore #8
		// @07D: goto @18B
		// @080: aload #9
		// @082: getstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @085: bipush 16 (0x10)
		// @087: aaload
		// @088: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @08B: ifeq @096
		// @08E: sipush 160 (0x00A0)
		// @091: istore #8
		// @093: goto @18B
		// @096: aload #9
		// @098: getstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @09B: bipush 18 (0x12)
		// @09D: aaload
		// @09E: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @0A1: ifeq @0AC
		// @0A4: sipush 173 (0x00AD)
		// @0A7: istore #8
		// @0A9: goto @18B
		// @0AC: aload #9
		// @0AE: getstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @0B1: bipush 17 (0x11)
		// @0B3: aaload
		// @0B4: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @0B7: ifeq @0C2
		// @0BA: sipush 215 (0x00D7)
		// @0BD: istore #8
		// @0BF: goto @18B
		// @0C2: aload #9
		// @0C4: getstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @0C7: bipush 19 (0x13)
		// @0C9: aaload
		// @0CA: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @0CD: ifeq @0D8
		// @0D0: sipush 8364 (0x20AC)
		// @0D3: istore #8
		// @0D5: goto @18B
		// @0D8: aload #9
		// @0DA: getstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @0DD: bipush 21 (0x15)
		// @0DF: aaload
		// @0E0: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @0E3: ifeq @0EE
		// @0E6: sipush 169 (0x00A9)
		// @0E9: istore #8
		// @0EB: goto @18B
		// @0EE: aload #9
		// @0F0: getstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @0F3: bipush 22 (0x16)
		// @0F5: aaload
		// @0F6: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @0F9: ifeq @104
		// @0FC: sipush 174 (0x00AE)
		// @0FF: istore #8
		// @101: goto @18B
		// @104: aload #9
		// @106: getstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @109: bipush 15 (0x0F)
		// @10B: aaload
		// @10C: invokevirtual java.lang.String.startsWith(java.lang.String)boolean
		// @10F: ifeq @182
		// @112: aload #9
		// @114: iconst_4
		// @115: invokevirtual java.lang.String.substring(int)java.lang.String
		// @118: bipush -115 (0x8D)
		// @11A: invokestatic game.C_100001_ge.func_100552_a(java.lang.CharSequence, int)int
		// @11D: istore #10
		// @11F: aload_0
		// @120: getfield game.C_100295_kh[] game.C_100112_r.field_101771_s
		// @123: iload #10
		// @125: aaload
		// @126: astore #11
		// @128: aload_0
		// @129: getfield int[] game.C_100112_r.field_101768_v
		// @12C: ifnull @13A
		// @12F: aload_0
		// @130: getfield int[] game.C_100112_r.field_101768_v
		// @133: iload #10
		// @135: iaload
		// @136: goto @13F
		// @139: athrow
		// @13A: aload #11
		// @13C: getfield int game.C_100295_kh.field_105303_s
		// @13F: istore #12
		// @141: getstatic int game.C_100112_r.field_101770_t
		// @144: sipush 256 (0x0100)
		// @147: if_icmpne @15D
		// @14A: aload #11
		// @14C: iload_2
		// @14D: iload_3
		// @14E: aload_0
		// @14F: getfield int game.C_100112_r.field_101775_y
		// @152: iadd
		// @153: iload #12
		// @155: isub
		// @156: invokevirtual game.C_100295_kh.func_105286_a(int, int)void
		// @159: goto @16F
		// @15C: athrow
		// @15D: aload #11
		// @15F: iload_2
		// @160: iload_3
		// @161: aload_0
		// @162: getfield int game.C_100112_r.field_101775_y
		// @165: iadd
		// @166: iload #12
		// @168: isub
		// @169: getstatic int game.C_100112_r.field_101770_t
		// @16C: invokevirtual game.C_100295_kh.func_105287_a(int, int, int)void
		// @16F: iload_2
		// @170: aload #11
		// @172: getfield int game.C_100295_kh.field_105301_h
		// @175: iadd
		// @176: istore_2
		// @177: iconst_0
		// @178: istore #5
		// @17A: goto @308
		// @17D: astore #10
		// @17F: goto @308
		// @182: aload_0
		// @183: aload #9
		// @185: invokespecial game.C_100112_r.func_101727_a(java.lang.String)void
		// @188: goto @308
		// @18B: iload #4
		// @18D: iconst_m1
		// @18E: if_icmpne @308
		// @191: iconst_0
		// @192: iload #8
		// @194: invokestatic game.C_100198_qn.func_105832_a(boolean, char)byte
		// @197: sipush 255 (0x00FF)
		// @19A: iand
		// @19B: i2c
		// @19C: istore #8
		// @19E: aload_0
		// @19F: getfield byte[] game.C_100112_r.field_101756_A
		// @1A2: ifnull @1BE
		// @1A5: iload #5
		// @1A7: ifeq @1BE
		// @1AA: goto @1AE
		// @1AD: athrow
		// @1AE: iload_2
		// @1AF: aload_0
		// @1B0: getfield byte[] game.C_100112_r.field_101756_A
		// @1B3: iload #5
		// @1B5: bipush 8 (0x08)
		// @1B7: ishl
		// @1B8: iload #8
		// @1BA: iadd
		// @1BB: baload
		// @1BC: iadd
		// @1BD: istore_2
		// @1BE: aload_0
		// @1BF: getfield int[] game.C_100112_r.field_101761_N
		// @1C2: iload #8
		// @1C4: iaload
		// @1C5: istore #9
		// @1C7: aload_0
		// @1C8: getfield int[] game.C_100112_r.field_101764_I
		// @1CB: iload #8
		// @1CD: iaload
		// @1CE: istore #10
		// @1D0: iload_2
		// @1D1: istore #11
		// @1D3: iload #8
		// @1D5: bipush 32 (0x20)
		// @1D7: if_icmpeq @295
		// @1DA: getstatic int game.C_100112_r.field_101770_t
		// @1DD: sipush 256 (0x0100)
		// @1E0: if_icmpne @23D
		// @1E3: goto @1E7
		// @1E6: athrow
		// @1E7: getstatic int game.C_100112_r.field_101754_F
		// @1EA: iconst_m1
		// @1EB: if_icmpeq @21A
		// @1EE: goto @1F2
		// @1F1: athrow
		// @1F2: aload_0
		// @1F3: iload #8
		// @1F5: iload_2
		// @1F6: aload_0
		// @1F7: getfield int[] game.C_100112_r.field_101752_D
		// @1FA: iload #8
		// @1FC: iaload
		// @1FD: iadd
		// @1FE: iconst_1
		// @1FF: iadd
		// @200: iload_3
		// @201: aload_0
		// @202: getfield int[] game.C_100112_r.field_101755_G
		// @205: iload #8
		// @207: iaload
		// @208: iadd
		// @209: iconst_1
		// @20A: iadd
		// @20B: iload #9
		// @20D: iload #10
		// @20F: getstatic int game.C_100112_r.field_101754_F
		// @212: iconst_1
		// @213: invokevirtual game.C_100112_r.func_101733_a(int, int, int, int, int, int, boolean)void
		// @216: goto @21A
		// @219: athrow
		// @21A: aload_0
		// @21B: iload #8
		// @21D: iload_2
		// @21E: aload_0
		// @21F: getfield int[] game.C_100112_r.field_101752_D
		// @222: iload #8
		// @224: iaload
		// @225: iadd
		// @226: iload_3
		// @227: aload_0
		// @228: getfield int[] game.C_100112_r.field_101755_G
		// @22B: iload #8
		// @22D: iaload
		// @22E: iadd
		// @22F: iload #9
		// @231: iload #10
		// @233: getstatic int game.C_100112_r.field_101774_z
		// @236: iconst_0
		// @237: invokevirtual game.C_100112_r.func_101733_a(int, int, int, int, int, int, boolean)void
		// @23A: goto @2B8
		// @23D: getstatic int game.C_100112_r.field_101754_F
		// @240: iconst_m1
		// @241: if_icmpeq @26F
		// @244: aload_0
		// @245: iload #8
		// @247: iload_2
		// @248: aload_0
		// @249: getfield int[] game.C_100112_r.field_101752_D
		// @24C: iload #8
		// @24E: iaload
		// @24F: iadd
		// @250: iconst_1
		// @251: iadd
		// @252: iload_3
		// @253: aload_0
		// @254: getfield int[] game.C_100112_r.field_101755_G
		// @257: iload #8
		// @259: iaload
		// @25A: iadd
		// @25B: iconst_1
		// @25C: iadd
		// @25D: iload #9
		// @25F: iload #10
		// @261: getstatic int game.C_100112_r.field_101754_F
		// @264: getstatic int game.C_100112_r.field_101770_t
		// @267: iconst_1
		// @268: invokevirtual game.C_100112_r.func_101723_a(int, int, int, int, int, int, int, boolean)void
		// @26B: goto @26F
		// @26E: athrow
		// @26F: aload_0
		// @270: iload #8
		// @272: iload_2
		// @273: aload_0
		// @274: getfield int[] game.C_100112_r.field_101752_D
		// @277: iload #8
		// @279: iaload
		// @27A: iadd
		// @27B: iload_3
		// @27C: aload_0
		// @27D: getfield int[] game.C_100112_r.field_101755_G
		// @280: iload #8
		// @282: iaload
		// @283: iadd
		// @284: iload #9
		// @286: iload #10
		// @288: getstatic int game.C_100112_r.field_101774_z
		// @28B: getstatic int game.C_100112_r.field_101770_t
		// @28E: iconst_0
		// @28F: invokevirtual game.C_100112_r.func_101723_a(int, int, int, int, int, int, int, boolean)void
		// @292: goto @2B8
		// @295: getstatic int game.C_100112_r.field_101759_L
		// @298: ifle @2B8
		// @29B: getstatic int game.C_100112_r.field_101753_E
		// @29E: getstatic int game.C_100112_r.field_101759_L
		// @2A1: iadd
		// @2A2: putstatic int game.C_100112_r.field_101753_E
		// @2A5: iload_2
		// @2A6: getstatic int game.C_100112_r.field_101753_E
		// @2A9: bipush 8 (0x08)
		// @2AB: ishr
		// @2AC: iadd
		// @2AD: istore_2
		// @2AE: getstatic int game.C_100112_r.field_101753_E
		// @2B1: sipush 255 (0x00FF)
		// @2B4: iand
		// @2B5: putstatic int game.C_100112_r.field_101753_E
		// @2B8: iload_2
		// @2B9: aload_0
		// @2BA: getfield int[] game.C_100112_r.field_101758_C
		// @2BD: iload #8
		// @2BF: iaload
		// @2C0: iadd
		// @2C1: istore_2
		// @2C2: getstatic int game.C_100112_r.field_101767_w
		// @2C5: iconst_m1
		// @2C6: if_icmpeq @2E5
		// @2C9: iload #11
		// @2CB: iload_3
		// @2CC: aload_0
		// @2CD: getfield int game.C_100112_r.field_101775_y
		// @2D0: i2d
		// @2D1: ldc2_w 0.7
		// @2D4: dmul
		// @2D5: d2i
		// @2D6: iadd
		// @2D7: iload_2
		// @2D8: iload #11
		// @2DA: isub
		// @2DB: getstatic int game.C_100112_r.field_101767_w
		// @2DE: invokestatic game.C_100196_rb.func_105807_g(int, int, int, int)void
		// @2E1: goto @2E5
		// @2E4: athrow
		// @2E5: getstatic int game.C_100112_r.field_101760_M
		// @2E8: iconst_m1
		// @2E9: if_icmpeq @304
		// @2EC: iload #11
		// @2EE: iload_3
		// @2EF: aload_0
		// @2F0: getfield int game.C_100112_r.field_101775_y
		// @2F3: iadd
		// @2F4: iconst_1
		// @2F5: iadd
		// @2F6: iload_2
		// @2F7: iload #11
		// @2F9: isub
		// @2FA: getstatic int game.C_100112_r.field_101760_M
		// @2FD: invokestatic game.C_100196_rb.func_105807_g(int, int, int, int)void
		// @300: goto @304
		// @303: athrow
		// @304: iload #8
		// @306: istore #5
		// @308: iinc #7 +1
		// @30B: goto @016
		// @30E: return
	}
	
	final void func_101749_c(String arg0, int arg1, int arg2, int arg3, int arg4)
	{
		// @00: aload_1
		// @01: ifnonnull @06
		// @04: return
		// @05: athrow
		// @06: aload_0
		// @07: iload #4
		// @09: iload #5
		// @0B: invokespecial game.C_100112_r.func_101736_a(int, int)void
		// @0E: aload_0
		// @0F: aload_1
		// @10: iload_2
		// @11: iload_3
		// @12: invokespecial game.C_100112_r.func_101737_b(java.lang.String, int, int)void
		// @15: return
	}
	
	private final void func_101736_a(int arg0, int arg1)
	{
		// @00: iconst_m1
		// @01: putstatic int game.C_100112_r.field_101767_w
		// @04: iconst_m1
		// @05: putstatic int game.C_100112_r.field_101760_M
		// @08: iload_2
		// @09: dup
		// @0A: putstatic int game.C_100112_r.field_101757_B
		// @0D: putstatic int game.C_100112_r.field_101754_F
		// @10: iload_1
		// @11: dup
		// @12: putstatic int game.C_100112_r.field_101776_x
		// @15: putstatic int game.C_100112_r.field_101774_z
		// @18: sipush 256 (0x0100)
		// @1B: putstatic int game.C_100112_r.field_101773_P
		// @1E: sipush 256 (0x0100)
		// @21: putstatic int game.C_100112_r.field_101770_t
		// @24: iconst_0
		// @25: putstatic int game.C_100112_r.field_101759_L
		// @28: iconst_0
		// @29: putstatic int game.C_100112_r.field_101753_E
		// @2C: return
	}
	
	private final void func_101742_a(byte[] arg0)
	{
		// @000: aload_0
		// @001: sipush 256 (0x0100)
		// @004: newarray int[]
		// @006: putfield int[] game.C_100112_r.field_101758_C
		// @009: aload_1
		// @00A: arraylength
		// @00B: sipush 257 (0x0101)
		// @00E: if_icmpne @040
		// @011: iconst_0
		// @012: istore_2
		// @013: iload_2
		// @014: aload_0
		// @015: getfield int[] game.C_100112_r.field_101758_C
		// @018: arraylength
		// @019: if_icmpge @030
		// @01C: aload_0
		// @01D: getfield int[] game.C_100112_r.field_101758_C
		// @020: iload_2
		// @021: aload_1
		// @022: iload_2
		// @023: baload
		// @024: sipush 255 (0x00FF)
		// @027: iand
		// @028: iastore
		// @029: iinc #2 +1
		// @02C: goto @013
		// @02F: athrow
		// @030: aload_0
		// @031: aload_1
		// @032: sipush 256 (0x0100)
		// @035: baload
		// @036: sipush 255 (0x00FF)
		// @039: iand
		// @03A: putfield int game.C_100112_r.field_101775_y
		// @03D: goto @1E0
		// @040: iconst_0
		// @041: istore_2
		// @042: iconst_0
		// @043: istore_3
		// @044: iload_3
		// @045: sipush 256 (0x0100)
		// @048: if_icmpge @062
		// @04B: aload_0
		// @04C: getfield int[] game.C_100112_r.field_101758_C
		// @04F: iload_3
		// @050: aload_1
		// @051: iload_2
		// @052: iinc #2 +1
		// @055: baload
		// @056: sipush 255 (0x00FF)
		// @059: iand
		// @05A: iastore
		// @05B: iinc #3 +1
		// @05E: goto @044
		// @061: athrow
		// @062: sipush 256 (0x0100)
		// @065: newarray int[]
		// @067: astore_3
		// @068: sipush 256 (0x0100)
		// @06B: newarray int[]
		// @06D: astore #4
		// @06F: iconst_0
		// @070: istore #5
		// @072: iload #5
		// @074: sipush 256 (0x0100)
		// @077: if_icmpge @08F
		// @07A: aload_3
		// @07B: iload #5
		// @07D: aload_1
		// @07E: iload_2
		// @07F: iinc #2 +1
		// @082: baload
		// @083: sipush 255 (0x00FF)
		// @086: iand
		// @087: iastore
		// @088: iinc #5 +1
		// @08B: goto @072
		// @08E: athrow
		// @08F: iconst_0
		// @090: istore #5
		// @092: iload #5
		// @094: sipush 256 (0x0100)
		// @097: if_icmpge @0B0
		// @09A: aload #4
		// @09C: iload #5
		// @09E: aload_1
		// @09F: iload_2
		// @0A0: iinc #2 +1
		// @0A3: baload
		// @0A4: sipush 255 (0x00FF)
		// @0A7: iand
		// @0A8: iastore
		// @0A9: iinc #5 +1
		// @0AC: goto @092
		// @0AF: athrow
		// @0B0: sipush 256 (0x0100)
		// @0B3: anewarray byte[]
		// @0B6: astore #5
		// @0B8: iconst_0
		// @0B9: istore #6
		// @0BB: iload #6
		// @0BD: sipush 256 (0x0100)
		// @0C0: if_icmpge @101
		// @0C3: aload #5
		// @0C5: iload #6
		// @0C7: aload_3
		// @0C8: iload #6
		// @0CA: iaload
		// @0CB: newarray byte[]
		// @0CD: aastore
		// @0CE: iconst_0
		// @0CF: istore #7
		// @0D1: iconst_0
		// @0D2: istore #8
		// @0D4: iload #8
		// @0D6: aload #5
		// @0D8: iload #6
		// @0DA: aaload
		// @0DB: arraylength
		// @0DC: if_icmpge @0FB
		// @0DF: iload #7
		// @0E1: aload_1
		// @0E2: iload_2
		// @0E3: iinc #2 +1
		// @0E6: baload
		// @0E7: iadd
		// @0E8: i2b
		// @0E9: istore #7
		// @0EB: aload #5
		// @0ED: iload #6
		// @0EF: aaload
		// @0F0: iload #8
		// @0F2: iload #7
		// @0F4: bastore
		// @0F5: iinc #8 +1
		// @0F8: goto @0D4
		// @0FB: iinc #6 +1
		// @0FE: goto @0BB
		// @101: sipush 256 (0x0100)
		// @104: anewarray byte[]
		// @107: astore #6
		// @109: iconst_0
		// @10A: istore #7
		// @10C: iload #7
		// @10E: sipush 256 (0x0100)
		// @111: if_icmpge @152
		// @114: aload #6
		// @116: iload #7
		// @118: aload_3
		// @119: iload #7
		// @11B: iaload
		// @11C: newarray byte[]
		// @11E: aastore
		// @11F: iconst_0
		// @120: istore #8
		// @122: iconst_0
		// @123: istore #9
		// @125: iload #9
		// @127: aload #6
		// @129: iload #7
		// @12B: aaload
		// @12C: arraylength
		// @12D: if_icmpge @14C
		// @130: iload #8
		// @132: aload_1
		// @133: iload_2
		// @134: iinc #2 +1
		// @137: baload
		// @138: iadd
		// @139: i2b
		// @13A: istore #8
		// @13C: aload #6
		// @13E: iload #7
		// @140: aaload
		// @141: iload #9
		// @143: iload #8
		// @145: bastore
		// @146: iinc #9 +1
		// @149: goto @125
		// @14C: iinc #7 +1
		// @14F: goto @10C
		// @152: aload_0
		// @153: ldc 65536 (0x10000)
		// @155: newarray byte[]
		// @157: putfield byte[] game.C_100112_r.field_101756_A
		// @15A: iconst_0
		// @15B: istore #7
		// @15D: iload #7
		// @15F: sipush 256 (0x0100)
		// @162: if_icmpge @1D2
		// @165: iload #7
		// @167: bipush 32 (0x20)
		// @169: if_icmpeq @1CC
		// @16C: goto @170
		// @16F: athrow
		// @170: iload #7
		// @172: sipush 160 (0x00A0)
		// @175: if_icmpne @180
		// @178: goto @17C
		// @17B: athrow
		// @17C: goto @1CC
		// @17F: athrow
		// @180: iconst_0
		// @181: istore #8
		// @183: iload #8
		// @185: sipush 256 (0x0100)
		// @188: if_icmpge @1CC
		// @18B: iload #8
		// @18D: bipush 32 (0x20)
		// @18F: if_icmpeq @1C6
		// @192: goto @196
		// @195: athrow
		// @196: iload #8
		// @198: sipush 160 (0x00A0)
		// @19B: if_icmpne @1A6
		// @19E: goto @1A2
		// @1A1: athrow
		// @1A2: goto @1C6
		// @1A5: athrow
		// @1A6: aload_0
		// @1A7: getfield byte[] game.C_100112_r.field_101756_A
		// @1AA: iload #7
		// @1AC: bipush 8 (0x08)
		// @1AE: ishl
		// @1AF: iload #8
		// @1B1: iadd
		// @1B2: aload #5
		// @1B4: aload #6
		// @1B6: aload #4
		// @1B8: aload_0
		// @1B9: getfield int[] game.C_100112_r.field_101758_C
		// @1BC: aload_3
		// @1BD: iload #7
		// @1BF: iload #8
		// @1C1: invokestatic game.C_100112_r.func_101735_a(byte[][], byte[][], int[], int[], int[], int, int)int
		// @1C4: i2b
		// @1C5: bastore
		// @1C6: iinc #8 +1
		// @1C9: goto @183
		// @1CC: iinc #7 +1
		// @1CF: goto @15D
		// @1D2: aload_0
		// @1D3: aload #4
		// @1D5: bipush 32 (0x20)
		// @1D7: iaload
		// @1D8: aload_3
		// @1D9: bipush 32 (0x20)
		// @1DB: iaload
		// @1DC: iadd
		// @1DD: putfield int game.C_100112_r.field_101775_y
		// @1E0: return
	}
	
	static final String func_101748_a(C_100112_r arg0, String arg1, int arg2)
	{
		// @00: aload_0
		// @01: aload_1
		// @02: invokevirtual game.C_100112_r.func_101739_b(java.lang.String)int
		// @05: iload_2
		// @06: if_icmpgt @0C
		// @09: aload_1
		// @0A: areturn
		// @0B: athrow
		// @0C: aload_0
		// @0D: getstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @10: iconst_0
		// @11: aaload
		// @12: invokevirtual game.C_100112_r.func_101739_b(java.lang.String)int
		// @15: istore_3
		// @16: iload_2
		// @17: iload_3
		// @18: isub
		// @19: istore #4
		// @1B: iconst_0
		// @1C: istore #5
		// @1E: iconst_0
		// @1F: istore #6
		// @21: iload #6
		// @23: aload_1
		// @24: invokevirtual java.lang.String.length()int
		// @27: if_icmpge @6D
		// @2A: aload_0
		// @2B: aload_1
		// @2C: iload #6
		// @2E: invokevirtual java.lang.String.charAt(int)char
		// @31: invokevirtual game.C_100112_r.func_101731_a(char)int
		// @34: istore #7
		// @36: iload #5
		// @38: iload #7
		// @3A: iadd
		// @3B: iload #4
		// @3D: if_icmple @60
		// @40: new java.lang.StringBuilder
		// @43: dup
		// @44: invokespecial java.lang.StringBuilder.<init>()void
		// @47: aload_1
		// @48: iconst_0
		// @49: iload #6
		// @4B: iconst_1
		// @4C: isub
		// @4D: invokevirtual java.lang.String.substring(int, int)java.lang.String
		// @50: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @53: getstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @56: iconst_0
		// @57: aaload
		// @58: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @5B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @5E: areturn
		// @5F: athrow
		// @60: iload #5
		// @62: iload #7
		// @64: iadd
		// @65: istore #5
		// @67: iinc #6 +1
		// @6A: goto @21
		// @6D: aconst_null
		// @6E: areturn
	}
	
	final void func_101751_a(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
	{
		// @00: aload_1
		// @01: ifnonnull @06
		// @04: return
		// @05: athrow
		// @06: aload_0
		// @07: iload #4
		// @09: iload #5
		// @0B: iload #6
		// @0D: invokespecial game.C_100112_r.func_101743_a(int, int, int)void
		// @10: aload_0
		// @11: aload_1
		// @12: iload_2
		// @13: iload_3
		// @14: invokespecial game.C_100112_r.func_101737_b(java.lang.String, int, int)void
		// @17: return
	}
	
	final int func_101738_b(String arg0, int arg1)
	{
		// @00: aload_0
		// @01: aload_1
		// @02: iconst_1
		// @03: newarray int[]
		// @05: dup
		// @06: iconst_0
		// @07: iload_2
		// @08: iastore
		// @09: getstatic java.lang.String[] game.C_100112_r.field_101762_O
		// @0C: invokevirtual game.C_100112_r.func_101730_a(java.lang.String, int[], java.lang.String[])int
		// @0F: istore_3
		// @10: iconst_0
		// @11: istore #4
		// @13: iconst_0
		// @14: istore #5
		// @16: iload #5
		// @18: iload_3
		// @19: if_icmpge @39
		// @1C: aload_0
		// @1D: getstatic java.lang.String[] game.C_100112_r.field_101762_O
		// @20: iload #5
		// @22: aaload
		// @23: invokevirtual game.C_100112_r.func_101739_b(java.lang.String)int
		// @26: istore #6
		// @28: iload #6
		// @2A: iload #4
		// @2C: if_icmple @33
		// @2F: iload #6
		// @31: istore #4
		// @33: iinc #5 +1
		// @36: goto @16
		// @39: iload #4
		// @3B: ireturn
	}
	
	abstract void func_101733_a(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);
	
	private final void func_101743_a(int arg0, int arg1, int arg2)
	{
		// @00: iconst_m1
		// @01: putstatic int game.C_100112_r.field_101767_w
		// @04: iconst_m1
		// @05: putstatic int game.C_100112_r.field_101760_M
		// @08: iload_2
		// @09: dup
		// @0A: putstatic int game.C_100112_r.field_101757_B
		// @0D: putstatic int game.C_100112_r.field_101754_F
		// @10: iload_1
		// @11: dup
		// @12: putstatic int game.C_100112_r.field_101776_x
		// @15: putstatic int game.C_100112_r.field_101774_z
		// @18: iload_3
		// @19: dup
		// @1A: putstatic int game.C_100112_r.field_101773_P
		// @1D: putstatic int game.C_100112_r.field_101770_t
		// @20: iconst_0
		// @21: putstatic int game.C_100112_r.field_101759_L
		// @24: iconst_0
		// @25: putstatic int game.C_100112_r.field_101753_E
		// @28: return
	}
	
	private final void func_101727_a(String arg0)
	{
		// @000: aload_1
		// @001: getstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @004: iconst_3
		// @005: aaload
		// @006: invokevirtual java.lang.String.startsWith(java.lang.String)boolean
		// @009: ifeq @01F
		// @00C: bipush 16 (0x10)
		// @00E: bipush -10 (0xF6)
		// @010: aload_1
		// @011: iconst_4
		// @012: invokevirtual java.lang.String.substring(int)java.lang.String
		// @015: invokestatic game.C_100343_jf.func_104820_a(int, byte, java.lang.CharSequence)int
		// @018: putstatic int game.C_100112_r.field_101774_z
		// @01B: goto @163
		// @01E: athrow
		// @01F: aload_1
		// @020: getstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @023: bipush 13 (0x0D)
		// @025: aaload
		// @026: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @029: ifeq @036
		// @02C: getstatic int game.C_100112_r.field_101776_x
		// @02F: putstatic int game.C_100112_r.field_101774_z
		// @032: goto @163
		// @035: athrow
		// @036: aload_1
		// @037: getstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @03A: bipush 9 (0x09)
		// @03C: aaload
		// @03D: invokevirtual java.lang.String.startsWith(java.lang.String)boolean
		// @040: ifeq @055
		// @043: aload_1
		// @044: bipush 6 (0x06)
		// @046: invokevirtual java.lang.String.substring(int)java.lang.String
		// @049: bipush -123 (0x85)
		// @04B: invokestatic game.C_100001_ge.func_100552_a(java.lang.CharSequence, int)int
		// @04E: putstatic int game.C_100112_r.field_101770_t
		// @051: goto @163
		// @054: athrow
		// @055: aload_1
		// @056: getstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @059: bipush 8 (0x08)
		// @05B: aaload
		// @05C: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @05F: ifeq @06C
		// @062: getstatic int game.C_100112_r.field_101773_P
		// @065: putstatic int game.C_100112_r.field_101770_t
		// @068: goto @163
		// @06B: athrow
		// @06C: aload_1
		// @06D: getstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @070: iconst_5
		// @071: aaload
		// @072: invokevirtual java.lang.String.startsWith(java.lang.String)boolean
		// @075: ifeq @08B
		// @078: bipush 16 (0x10)
		// @07A: bipush -10 (0xF6)
		// @07C: aload_1
		// @07D: iconst_4
		// @07E: invokevirtual java.lang.String.substring(int)java.lang.String
		// @081: invokestatic game.C_100343_jf.func_104820_a(int, byte, java.lang.CharSequence)int
		// @084: putstatic int game.C_100112_r.field_101767_w
		// @087: goto @163
		// @08A: athrow
		// @08B: aload_1
		// @08C: getstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @08F: bipush 7 (0x07)
		// @091: aaload
		// @092: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @095: ifeq @0A1
		// @098: ldc 8388608 (0x800000)
		// @09A: putstatic int game.C_100112_r.field_101767_w
		// @09D: goto @163
		// @0A0: athrow
		// @0A1: aload_1
		// @0A2: getstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @0A5: bipush 10 (0x0A)
		// @0A7: aaload
		// @0A8: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @0AB: ifeq @0B6
		// @0AE: iconst_m1
		// @0AF: putstatic int game.C_100112_r.field_101767_w
		// @0B2: goto @163
		// @0B5: athrow
		// @0B6: aload_1
		// @0B7: getstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @0BA: bipush 6 (0x06)
		// @0BC: aaload
		// @0BD: invokevirtual java.lang.String.startsWith(java.lang.String)boolean
		// @0C0: ifeq @0D6
		// @0C3: bipush 16 (0x10)
		// @0C5: bipush -10 (0xF6)
		// @0C7: aload_1
		// @0C8: iconst_2
		// @0C9: invokevirtual java.lang.String.substring(int)java.lang.String
		// @0CC: invokestatic game.C_100343_jf.func_104820_a(int, byte, java.lang.CharSequence)int
		// @0CF: putstatic int game.C_100112_r.field_101760_M
		// @0D2: goto @163
		// @0D5: athrow
		// @0D6: aload_1
		// @0D7: ldc "u"
		// @0D9: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @0DC: ifeq @0E7
		// @0DF: iconst_0
		// @0E0: putstatic int game.C_100112_r.field_101760_M
		// @0E3: goto @163
		// @0E6: athrow
		// @0E7: aload_1
		// @0E8: getstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @0EB: bipush 11 (0x0B)
		// @0ED: aaload
		// @0EE: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @0F1: ifeq @0FC
		// @0F4: iconst_m1
		// @0F5: putstatic int game.C_100112_r.field_101760_M
		// @0F8: goto @163
		// @0FB: athrow
		// @0FC: aload_1
		// @0FD: getstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @100: iconst_1
		// @101: aaload
		// @102: invokevirtual java.lang.String.startsWith(java.lang.String)boolean
		// @105: ifeq @11B
		// @108: bipush 16 (0x10)
		// @10A: bipush -10 (0xF6)
		// @10C: aload_1
		// @10D: iconst_5
		// @10E: invokevirtual java.lang.String.substring(int)java.lang.String
		// @111: invokestatic game.C_100343_jf.func_104820_a(int, byte, java.lang.CharSequence)int
		// @114: putstatic int game.C_100112_r.field_101754_F
		// @117: goto @163
		// @11A: athrow
		// @11B: aload_1
		// @11C: getstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @11F: bipush 12 (0x0C)
		// @121: aaload
		// @122: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @125: ifeq @130
		// @128: iconst_0
		// @129: putstatic int game.C_100112_r.field_101754_F
		// @12C: goto @163
		// @12F: athrow
		// @130: aload_1
		// @131: getstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @134: iconst_4
		// @135: aaload
		// @136: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @139: ifeq @146
		// @13C: getstatic int game.C_100112_r.field_101757_B
		// @13F: putstatic int game.C_100112_r.field_101754_F
		// @142: goto @163
		// @145: athrow
		// @146: aload_1
		// @147: getstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @14A: iconst_2
		// @14B: aaload
		// @14C: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @14F: ifeq @163
		// @152: aload_0
		// @153: getstatic int game.C_100112_r.field_101776_x
		// @156: getstatic int game.C_100112_r.field_101757_B
		// @159: getstatic int game.C_100112_r.field_101773_P
		// @15C: invokespecial game.C_100112_r.func_101743_a(int, int, int)void
		// @15F: goto @163
		// @162: athrow
		// @163: goto @167
		// @166: astore_2
		// @167: return
	}
	
	final int func_101731_a(char arg0)
	{
		// @0: aload_0
		// @1: getfield int[] game.C_100112_r.field_101758_C
		// @4: iconst_0
		// @5: iload_1
		// @6: invokestatic game.C_100198_qn.func_105832_a(boolean, char)byte
		// @9: sipush 255 (0x00FF)
		// @C: iand
		// @D: iaload
		// @E: ireturn
	}
	
	final int func_101729_a(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9)
	{
		// @00: aload_0
		// @01: aload_1
		// @02: iload_2
		// @03: iload_3
		// @04: iload #4
		// @06: iload #5
		// @08: iload #6
		// @0A: iload #7
		// @0C: sipush 256 (0x0100)
		// @0F: iload #8
		// @11: iload #9
		// @13: iload #10
		// @15: invokevirtual game.C_100112_r.func_101745_a(java.lang.String, int, int, int, int, int, int, int, int, int, int)int
		// @18: ireturn
	}
	
	public static void func_101725_a()
	{
		// @0: aconst_null
		// @1: putstatic java.lang.StringBuilder game.C_100112_r.field_101766_K
		// @4: aconst_null
		// @5: putstatic java.lang.String[] game.C_100112_r.field_101762_O
		// @8: return
	}
	
	final int func_101730_a(String arg0, int[] arg1, String[] arg2)
	{
		// @000: aload_1
		// @001: ifnonnull @007
		// @004: iconst_0
		// @005: ireturn
		// @006: athrow
		// @007: bipush 32 (0x20)
		// @009: bipush 71 (0x47)
		// @00B: getstatic java.lang.StringBuilder game.C_100112_r.field_101766_K
		// @00E: iconst_0
		// @00F: invokestatic game.C_100062_dk.func_104278_a(char, byte, java.lang.StringBuilder, int)java.lang.StringBuilder
		// @012: pop
		// @013: iconst_0
		// @014: istore #4
		// @016: iconst_0
		// @017: istore #5
		// @019: iconst_m1
		// @01A: istore #6
		// @01C: iconst_0
		// @01D: istore #7
		// @01F: iconst_0
		// @020: istore #8
		// @022: iconst_m1
		// @023: istore #9
		// @025: iconst_0
		// @026: istore #10
		// @028: iconst_0
		// @029: istore #11
		// @02B: aload_1
		// @02C: invokevirtual java.lang.String.length()int
		// @02F: istore #12
		// @031: iconst_0
		// @032: istore #13
		// @034: iload #13
		// @036: iload #12
		// @038: if_icmpge @3F9
		// @03B: aload_1
		// @03C: iload #13
		// @03E: invokevirtual java.lang.String.charAt(int)char
		// @041: istore #14
		// @043: iload #14
		// @045: bipush 60 (0x3C)
		// @047: if_icmpne @051
		// @04A: iload #13
		// @04C: istore #9
		// @04E: goto @3F3
		// @051: iload #14
		// @053: bipush 62 (0x3E)
		// @055: if_icmpne @31F
		// @058: iload #9
		// @05A: iconst_m1
		// @05B: if_icmpeq @31F
		// @05E: goto @062
		// @061: athrow
		// @062: aload_1
		// @063: iload #9
		// @065: iconst_1
		// @066: iadd
		// @067: iload #13
		// @069: invokevirtual java.lang.String.substring(int, int)java.lang.String
		// @06C: invokevirtual java.lang.String.toLowerCase()java.lang.String
		// @06F: astore #15
		// @071: iconst_m1
		// @072: istore #9
		// @074: getstatic java.lang.StringBuilder game.C_100112_r.field_101766_K
		// @077: bipush 60 (0x3C)
		// @079: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @07C: pop
		// @07D: getstatic java.lang.StringBuilder game.C_100112_r.field_101766_K
		// @080: aload #15
		// @082: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @085: pop
		// @086: getstatic java.lang.StringBuilder game.C_100112_r.field_101766_K
		// @089: bipush 62 (0x3E)
		// @08B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @08E: pop
		// @08F: aload #15
		// @091: getstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @094: iconst_2
		// @095: aaload
		// @096: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @099: ifeq @0C8
		// @09C: aload_3
		// @09D: iload #11
		// @09F: getstatic java.lang.StringBuilder game.C_100112_r.field_101766_K
		// @0A2: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @0A5: iload #5
		// @0A7: getstatic java.lang.StringBuilder game.C_100112_r.field_101766_K
		// @0AA: invokevirtual java.lang.StringBuilder.length()int
		// @0AD: invokevirtual java.lang.String.substring(int, int)java.lang.String
		// @0B0: aastore
		// @0B1: iinc #11 +1
		// @0B4: getstatic java.lang.StringBuilder game.C_100112_r.field_101766_K
		// @0B7: invokevirtual java.lang.StringBuilder.length()int
		// @0BA: istore #5
		// @0BC: iconst_0
		// @0BD: istore #4
		// @0BF: iconst_m1
		// @0C0: istore #6
		// @0C2: iconst_0
		// @0C3: istore #10
		// @0C5: goto @31C
		// @0C8: aload #15
		// @0CA: getstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @0CD: bipush 20 (0x14)
		// @0CF: aaload
		// @0D0: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @0D3: ifeq @10A
		// @0D6: iload #4
		// @0D8: aload_0
		// @0D9: bipush 60 (0x3C)
		// @0DB: invokevirtual game.C_100112_r.func_101731_a(char)int
		// @0DE: iadd
		// @0DF: istore #4
		// @0E1: aload_0
		// @0E2: getfield byte[] game.C_100112_r.field_101756_A
		// @0E5: ifnull @103
		// @0E8: iload #10
		// @0EA: ifeq @103
		// @0ED: goto @0F1
		// @0F0: athrow
		// @0F1: iload #4
		// @0F3: aload_0
		// @0F4: getfield byte[] game.C_100112_r.field_101756_A
		// @0F7: iload #10
		// @0F9: bipush 8 (0x08)
		// @0FB: ishl
		// @0FC: bipush 60 (0x3C)
		// @0FE: iadd
		// @0FF: baload
		// @100: iadd
		// @101: istore #4
		// @103: bipush 60 (0x3C)
		// @105: istore #10
		// @107: goto @31C
		// @10A: aload #15
		// @10C: getstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @10F: bipush 14 (0x0E)
		// @111: aaload
		// @112: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @115: ifeq @14C
		// @118: iload #4
		// @11A: aload_0
		// @11B: bipush 62 (0x3E)
		// @11D: invokevirtual game.C_100112_r.func_101731_a(char)int
		// @120: iadd
		// @121: istore #4
		// @123: aload_0
		// @124: getfield byte[] game.C_100112_r.field_101756_A
		// @127: ifnull @145
		// @12A: iload #10
		// @12C: ifeq @145
		// @12F: goto @133
		// @132: athrow
		// @133: iload #4
		// @135: aload_0
		// @136: getfield byte[] game.C_100112_r.field_101756_A
		// @139: iload #10
		// @13B: bipush 8 (0x08)
		// @13D: ishl
		// @13E: bipush 62 (0x3E)
		// @140: iadd
		// @141: baload
		// @142: iadd
		// @143: istore #4
		// @145: bipush 62 (0x3E)
		// @147: istore #10
		// @149: goto @31C
		// @14C: aload #15
		// @14E: getstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @151: bipush 16 (0x10)
		// @153: aaload
		// @154: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @157: ifeq @191
		// @15A: iload #4
		// @15C: aload_0
		// @15D: sipush 160 (0x00A0)
		// @160: invokevirtual game.C_100112_r.func_101731_a(char)int
		// @163: iadd
		// @164: istore #4
		// @166: aload_0
		// @167: getfield byte[] game.C_100112_r.field_101756_A
		// @16A: ifnull @189
		// @16D: iload #10
		// @16F: ifeq @189
		// @172: goto @176
		// @175: athrow
		// @176: iload #4
		// @178: aload_0
		// @179: getfield byte[] game.C_100112_r.field_101756_A
		// @17C: iload #10
		// @17E: bipush 8 (0x08)
		// @180: ishl
		// @181: sipush 160 (0x00A0)
		// @184: iadd
		// @185: baload
		// @186: iadd
		// @187: istore #4
		// @189: sipush 160 (0x00A0)
		// @18C: istore #10
		// @18E: goto @31C
		// @191: aload #15
		// @193: getstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @196: bipush 18 (0x12)
		// @198: aaload
		// @199: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @19C: ifeq @1D6
		// @19F: iload #4
		// @1A1: aload_0
		// @1A2: sipush 173 (0x00AD)
		// @1A5: invokevirtual game.C_100112_r.func_101731_a(char)int
		// @1A8: iadd
		// @1A9: istore #4
		// @1AB: aload_0
		// @1AC: getfield byte[] game.C_100112_r.field_101756_A
		// @1AF: ifnull @1CE
		// @1B2: iload #10
		// @1B4: ifeq @1CE
		// @1B7: goto @1BB
		// @1BA: athrow
		// @1BB: iload #4
		// @1BD: aload_0
		// @1BE: getfield byte[] game.C_100112_r.field_101756_A
		// @1C1: iload #10
		// @1C3: bipush 8 (0x08)
		// @1C5: ishl
		// @1C6: sipush 173 (0x00AD)
		// @1C9: iadd
		// @1CA: baload
		// @1CB: iadd
		// @1CC: istore #4
		// @1CE: sipush 173 (0x00AD)
		// @1D1: istore #10
		// @1D3: goto @31C
		// @1D6: aload #15
		// @1D8: getstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @1DB: bipush 17 (0x11)
		// @1DD: aaload
		// @1DE: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @1E1: ifeq @21B
		// @1E4: iload #4
		// @1E6: aload_0
		// @1E7: sipush 215 (0x00D7)
		// @1EA: invokevirtual game.C_100112_r.func_101731_a(char)int
		// @1ED: iadd
		// @1EE: istore #4
		// @1F0: aload_0
		// @1F1: getfield byte[] game.C_100112_r.field_101756_A
		// @1F4: ifnull @213
		// @1F7: iload #10
		// @1F9: ifeq @213
		// @1FC: goto @200
		// @1FF: athrow
		// @200: iload #4
		// @202: aload_0
		// @203: getfield byte[] game.C_100112_r.field_101756_A
		// @206: iload #10
		// @208: bipush 8 (0x08)
		// @20A: ishl
		// @20B: sipush 215 (0x00D7)
		// @20E: iadd
		// @20F: baload
		// @210: iadd
		// @211: istore #4
		// @213: sipush 215 (0x00D7)
		// @216: istore #10
		// @218: goto @31C
		// @21B: aload #15
		// @21D: getstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @220: bipush 19 (0x13)
		// @222: aaload
		// @223: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @226: ifeq @260
		// @229: iload #4
		// @22B: aload_0
		// @22C: sipush 8364 (0x20AC)
		// @22F: invokevirtual game.C_100112_r.func_101731_a(char)int
		// @232: iadd
		// @233: istore #4
		// @235: aload_0
		// @236: getfield byte[] game.C_100112_r.field_101756_A
		// @239: ifnull @258
		// @23C: iload #10
		// @23E: ifeq @258
		// @241: goto @245
		// @244: athrow
		// @245: iload #4
		// @247: aload_0
		// @248: getfield byte[] game.C_100112_r.field_101756_A
		// @24B: iload #10
		// @24D: bipush 8 (0x08)
		// @24F: ishl
		// @250: sipush 128 (0x0080)
		// @253: iadd
		// @254: baload
		// @255: iadd
		// @256: istore #4
		// @258: sipush 8364 (0x20AC)
		// @25B: istore #10
		// @25D: goto @31C
		// @260: aload #15
		// @262: getstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @265: bipush 21 (0x15)
		// @267: aaload
		// @268: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @26B: ifeq @2A5
		// @26E: iload #4
		// @270: aload_0
		// @271: sipush 169 (0x00A9)
		// @274: invokevirtual game.C_100112_r.func_101731_a(char)int
		// @277: iadd
		// @278: istore #4
		// @27A: aload_0
		// @27B: getfield byte[] game.C_100112_r.field_101756_A
		// @27E: ifnull @29D
		// @281: iload #10
		// @283: ifeq @29D
		// @286: goto @28A
		// @289: athrow
		// @28A: iload #4
		// @28C: aload_0
		// @28D: getfield byte[] game.C_100112_r.field_101756_A
		// @290: iload #10
		// @292: bipush 8 (0x08)
		// @294: ishl
		// @295: sipush 169 (0x00A9)
		// @298: iadd
		// @299: baload
		// @29A: iadd
		// @29B: istore #4
		// @29D: sipush 169 (0x00A9)
		// @2A0: istore #10
		// @2A2: goto @31C
		// @2A5: aload #15
		// @2A7: getstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @2AA: bipush 22 (0x16)
		// @2AC: aaload
		// @2AD: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @2B0: ifeq @2EA
		// @2B3: iload #4
		// @2B5: aload_0
		// @2B6: sipush 174 (0x00AE)
		// @2B9: invokevirtual game.C_100112_r.func_101731_a(char)int
		// @2BC: iadd
		// @2BD: istore #4
		// @2BF: aload_0
		// @2C0: getfield byte[] game.C_100112_r.field_101756_A
		// @2C3: ifnull @2E2
		// @2C6: iload #10
		// @2C8: ifeq @2E2
		// @2CB: goto @2CF
		// @2CE: athrow
		// @2CF: iload #4
		// @2D1: aload_0
		// @2D2: getfield byte[] game.C_100112_r.field_101756_A
		// @2D5: iload #10
		// @2D7: bipush 8 (0x08)
		// @2D9: ishl
		// @2DA: sipush 174 (0x00AE)
		// @2DD: iadd
		// @2DE: baload
		// @2DF: iadd
		// @2E0: istore #4
		// @2E2: sipush 174 (0x00AE)
		// @2E5: istore #10
		// @2E7: goto @31C
		// @2EA: aload #15
		// @2EC: getstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @2EF: bipush 15 (0x0F)
		// @2F1: aaload
		// @2F2: invokevirtual java.lang.String.startsWith(java.lang.String)boolean
		// @2F5: ifeq @31C
		// @2F8: aload #15
		// @2FA: iconst_4
		// @2FB: invokevirtual java.lang.String.substring(int)java.lang.String
		// @2FE: bipush -119 (0x89)
		// @300: invokestatic game.C_100001_ge.func_100552_a(java.lang.CharSequence, int)int
		// @303: istore #16
		// @305: iload #4
		// @307: aload_0
		// @308: getfield game.C_100295_kh[] game.C_100112_r.field_101771_s
		// @30B: iload #16
		// @30D: aaload
		// @30E: getfield int game.C_100295_kh.field_105301_h
		// @311: iadd
		// @312: istore #4
		// @314: iconst_0
		// @315: istore #10
		// @317: goto @31C
		// @31A: astore #16
		// @31C: iconst_0
		// @31D: istore #14
		// @31F: iload #9
		// @321: iconst_m1
		// @322: if_icmpne @3F3
		// @325: iload #14
		// @327: ifeq @376
		// @32A: goto @32E
		// @32D: athrow
		// @32E: getstatic java.lang.StringBuilder game.C_100112_r.field_101766_K
		// @331: iload #14
		// @333: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @336: pop
		// @337: iconst_0
		// @338: iload #14
		// @33A: invokestatic game.C_100198_qn.func_105832_a(boolean, char)byte
		// @33D: sipush 255 (0x00FF)
		// @340: iand
		// @341: i2c
		// @342: istore #14
		// @344: iload #4
		// @346: aload_0
		// @347: getfield int[] game.C_100112_r.field_101758_C
		// @34A: iload #14
		// @34C: iaload
		// @34D: iadd
		// @34E: istore #4
		// @350: aload_0
		// @351: getfield byte[] game.C_100112_r.field_101756_A
		// @354: ifnull @372
		// @357: iload #10
		// @359: ifeq @372
		// @35C: goto @360
		// @35F: athrow
		// @360: iload #4
		// @362: aload_0
		// @363: getfield byte[] game.C_100112_r.field_101756_A
		// @366: iload #10
		// @368: bipush 8 (0x08)
		// @36A: ishl
		// @36B: iload #14
		// @36D: iadd
		// @36E: baload
		// @36F: iadd
		// @370: istore #4
		// @372: iload #14
		// @374: istore #10
		// @376: iload #14
		// @378: bipush 32 (0x20)
		// @37A: if_icmpne @38C
		// @37D: getstatic java.lang.StringBuilder game.C_100112_r.field_101766_K
		// @380: invokevirtual java.lang.StringBuilder.length()int
		// @383: istore #6
		// @385: iload #4
		// @387: istore #7
		// @389: iconst_1
		// @38A: istore #8
		// @38C: aload_2
		// @38D: ifnull @3DD
		// @390: iload #4
		// @392: aload_2
		// @393: iload #11
		// @395: aload_2
		// @396: arraylength
		// @397: if_icmpge @3A4
		// @39A: goto @39E
		// @39D: athrow
		// @39E: iload #11
		// @3A0: goto @3A8
		// @3A3: athrow
		// @3A4: aload_2
		// @3A5: arraylength
		// @3A6: iconst_1
		// @3A7: isub
		// @3A8: iaload
		// @3A9: if_icmple @3DD
		// @3AC: iload #6
		// @3AE: iflt @3DD
		// @3B1: goto @3B5
		// @3B4: athrow
		// @3B5: aload_3
		// @3B6: iload #11
		// @3B8: getstatic java.lang.StringBuilder game.C_100112_r.field_101766_K
		// @3BB: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3BE: iload #5
		// @3C0: iload #6
		// @3C2: iload #8
		// @3C4: isub
		// @3C5: invokevirtual java.lang.String.substring(int, int)java.lang.String
		// @3C8: aastore
		// @3C9: iinc #11 +1
		// @3CC: iload #6
		// @3CE: istore #5
		// @3D0: iconst_m1
		// @3D1: istore #6
		// @3D3: iload #4
		// @3D5: iload #7
		// @3D7: isub
		// @3D8: istore #4
		// @3DA: iconst_0
		// @3DB: istore #10
		// @3DD: iload #14
		// @3DF: bipush 45 (0x2D)
		// @3E1: if_icmpne @3F3
		// @3E4: getstatic java.lang.StringBuilder game.C_100112_r.field_101766_K
		// @3E7: invokevirtual java.lang.StringBuilder.length()int
		// @3EA: istore #6
		// @3EC: iload #4
		// @3EE: istore #7
		// @3F0: iconst_0
		// @3F1: istore #8
		// @3F3: iinc #13 +1
		// @3F6: goto @034
		// @3F9: getstatic java.lang.StringBuilder game.C_100112_r.field_101766_K
		// @3FC: invokevirtual java.lang.StringBuilder.length()int
		// @3FF: iload #5
		// @401: if_icmple @420
		// @404: aload_3
		// @405: iload #11
		// @407: getstatic java.lang.StringBuilder game.C_100112_r.field_101766_K
		// @40A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @40D: iload #5
		// @40F: getstatic java.lang.StringBuilder game.C_100112_r.field_101766_K
		// @412: invokevirtual java.lang.StringBuilder.length()int
		// @415: invokevirtual java.lang.String.substring(int, int)java.lang.String
		// @418: aastore
		// @419: iinc #11 +1
		// @41C: goto @420
		// @41F: athrow
		// @420: iload #11
		// @422: ireturn
	}
	
	final void func_101728_a(C_100295_kh[] arg0, int[] arg1)
	{
		// @00: aload_2
		// @01: ifnull @18
		// @04: aload_2
		// @05: arraylength
		// @06: aload_1
		// @07: arraylength
		// @08: if_icmpeq @18
		// @0B: goto @0F
		// @0E: athrow
		// @0F: new java.lang.IllegalArgumentException
		// @12: dup
		// @13: invokespecial java.lang.IllegalArgumentException.<init>()void
		// @16: athrow
		// @17: athrow
		// @18: aload_0
		// @19: aload_1
		// @1A: putfield game.C_100295_kh[] game.C_100112_r.field_101771_s
		// @1D: aload_0
		// @1E: aload_2
		// @1F: putfield int[] game.C_100112_r.field_101768_v
		// @22: return
	}
	
	final int func_101745_a(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10)
	{
		// @000: aload_1
		// @001: ifnonnull @007
		// @004: iconst_0
		// @005: ireturn
		// @006: athrow
		// @007: aload_0
		// @008: iload #6
		// @00A: iload #7
		// @00C: iload #8
		// @00E: invokespecial game.C_100112_r.func_101743_a(int, int, int)void
		// @011: iload #11
		// @013: ifne @01C
		// @016: aload_0
		// @017: getfield int game.C_100112_r.field_101775_y
		// @01A: istore #11
		// @01C: iconst_1
		// @01D: newarray int[]
		// @01F: dup
		// @020: iconst_0
		// @021: iload #4
		// @023: iastore
		// @024: astore #12
		// @026: iload #5
		// @028: aload_0
		// @029: getfield int game.C_100112_r.field_101772_Q
		// @02C: aload_0
		// @02D: getfield int game.C_100112_r.field_101763_H
		// @030: iadd
		// @031: iload #11
		// @033: iadd
		// @034: if_icmpge @048
		// @037: iload #5
		// @039: iload #11
		// @03B: iload #11
		// @03D: iadd
		// @03E: if_icmpge @048
		// @041: goto @045
		// @044: athrow
		// @045: aconst_null
		// @046: astore #12
		// @048: aload_0
		// @049: aload_1
		// @04A: aload #12
		// @04C: getstatic java.lang.String[] game.C_100112_r.field_101762_O
		// @04F: invokevirtual game.C_100112_r.func_101730_a(java.lang.String, int[], java.lang.String[])int
		// @052: istore #13
		// @054: iload #10
		// @056: iconst_3
		// @057: if_icmpne @067
		// @05A: iload #13
		// @05C: iconst_1
		// @05D: if_icmpne @067
		// @060: goto @064
		// @063: athrow
		// @064: iconst_1
		// @065: istore #10
		// @067: iload #10
		// @069: ifne @077
		// @06C: iload_3
		// @06D: aload_0
		// @06E: getfield int game.C_100112_r.field_101772_Q
		// @071: iadd
		// @072: istore #14
		// @074: goto @0F0
		// @077: iload #10
		// @079: iconst_1
		// @07A: if_icmpne @09F
		// @07D: iload_3
		// @07E: aload_0
		// @07F: getfield int game.C_100112_r.field_101772_Q
		// @082: iadd
		// @083: iload #5
		// @085: aload_0
		// @086: getfield int game.C_100112_r.field_101772_Q
		// @089: isub
		// @08A: aload_0
		// @08B: getfield int game.C_100112_r.field_101763_H
		// @08E: isub
		// @08F: iload #13
		// @091: iconst_1
		// @092: isub
		// @093: iload #11
		// @095: imul
		// @096: isub
		// @097: iconst_2
		// @098: idiv
		// @099: iadd
		// @09A: istore #14
		// @09C: goto @0F0
		// @09F: iload #10
		// @0A1: iconst_2
		// @0A2: if_icmpne @0BB
		// @0A5: iload_3
		// @0A6: iload #5
		// @0A8: iadd
		// @0A9: aload_0
		// @0AA: getfield int game.C_100112_r.field_101763_H
		// @0AD: isub
		// @0AE: iload #13
		// @0B0: iconst_1
		// @0B1: isub
		// @0B2: iload #11
		// @0B4: imul
		// @0B5: isub
		// @0B6: istore #14
		// @0B8: goto @0F0
		// @0BB: iload #5
		// @0BD: aload_0
		// @0BE: getfield int game.C_100112_r.field_101772_Q
		// @0C1: isub
		// @0C2: aload_0
		// @0C3: getfield int game.C_100112_r.field_101763_H
		// @0C6: isub
		// @0C7: iload #13
		// @0C9: iconst_1
		// @0CA: isub
		// @0CB: iload #11
		// @0CD: imul
		// @0CE: isub
		// @0CF: iload #13
		// @0D1: iconst_1
		// @0D2: iadd
		// @0D3: idiv
		// @0D4: istore #15
		// @0D6: iload #15
		// @0D8: ifge @0DE
		// @0DB: iconst_0
		// @0DC: istore #15
		// @0DE: iload_3
		// @0DF: aload_0
		// @0E0: getfield int game.C_100112_r.field_101772_Q
		// @0E3: iadd
		// @0E4: iload #15
		// @0E6: iadd
		// @0E7: istore #14
		// @0E9: iload #11
		// @0EB: iload #15
		// @0ED: iadd
		// @0EE: istore #11
		// @0F0: iconst_0
		// @0F1: istore #15
		// @0F3: iload #15
		// @0F5: iload #13
		// @0F7: if_icmpge @1A4
		// @0FA: iload #9
		// @0FC: ifne @114
		// @0FF: goto @103
		// @102: athrow
		// @103: aload_0
		// @104: getstatic java.lang.String[] game.C_100112_r.field_101762_O
		// @107: iload #15
		// @109: aaload
		// @10A: iload_2
		// @10B: iload #14
		// @10D: invokespecial game.C_100112_r.func_101737_b(java.lang.String, int, int)void
		// @110: goto @197
		// @113: athrow
		// @114: iload #9
		// @116: iconst_1
		// @117: if_icmpne @13B
		// @11A: aload_0
		// @11B: getstatic java.lang.String[] game.C_100112_r.field_101762_O
		// @11E: iload #15
		// @120: aaload
		// @121: iload_2
		// @122: iload #4
		// @124: aload_0
		// @125: getstatic java.lang.String[] game.C_100112_r.field_101762_O
		// @128: iload #15
		// @12A: aaload
		// @12B: invokevirtual game.C_100112_r.func_101739_b(java.lang.String)int
		// @12E: isub
		// @12F: iconst_2
		// @130: idiv
		// @131: iadd
		// @132: iload #14
		// @134: invokespecial game.C_100112_r.func_101737_b(java.lang.String, int, int)void
		// @137: goto @197
		// @13A: athrow
		// @13B: iload #9
		// @13D: iconst_2
		// @13E: if_icmpne @160
		// @141: aload_0
		// @142: getstatic java.lang.String[] game.C_100112_r.field_101762_O
		// @145: iload #15
		// @147: aaload
		// @148: iload_2
		// @149: iload #4
		// @14B: iadd
		// @14C: aload_0
		// @14D: getstatic java.lang.String[] game.C_100112_r.field_101762_O
		// @150: iload #15
		// @152: aaload
		// @153: invokevirtual game.C_100112_r.func_101739_b(java.lang.String)int
		// @156: isub
		// @157: iload #14
		// @159: invokespecial game.C_100112_r.func_101737_b(java.lang.String, int, int)void
		// @15C: goto @197
		// @15F: athrow
		// @160: iload #15
		// @162: iload #13
		// @164: iconst_1
		// @165: isub
		// @166: if_icmpne @17A
		// @169: aload_0
		// @16A: getstatic java.lang.String[] game.C_100112_r.field_101762_O
		// @16D: iload #15
		// @16F: aaload
		// @170: iload_2
		// @171: iload #14
		// @173: invokespecial game.C_100112_r.func_101737_b(java.lang.String, int, int)void
		// @176: goto @197
		// @179: athrow
		// @17A: aload_0
		// @17B: getstatic java.lang.String[] game.C_100112_r.field_101762_O
		// @17E: iload #15
		// @180: aaload
		// @181: iload #4
		// @183: invokespecial game.C_100112_r.func_101732_d(java.lang.String, int)void
		// @186: aload_0
		// @187: getstatic java.lang.String[] game.C_100112_r.field_101762_O
		// @18A: iload #15
		// @18C: aaload
		// @18D: iload_2
		// @18E: iload #14
		// @190: invokespecial game.C_100112_r.func_101737_b(java.lang.String, int, int)void
		// @193: iconst_0
		// @194: putstatic int game.C_100112_r.field_101759_L
		// @197: iload #14
		// @199: iload #11
		// @19B: iadd
		// @19C: istore #14
		// @19E: iinc #15 +1
		// @1A1: goto @0F3
		// @1A4: iload #13
		// @1A6: ireturn
	}
	
	static final String func_101750_c(String arg0)
	{
		// @00: aload_0
		// @01: invokevirtual java.lang.String.length()int
		// @04: istore_1
		// @05: iconst_0
		// @06: istore_2
		// @07: iconst_0
		// @08: istore_3
		// @09: iload_3
		// @0A: iload_1
		// @0B: if_icmpge @34
		// @0E: aload_0
		// @0F: iload_3
		// @10: invokevirtual java.lang.String.charAt(int)char
		// @13: istore #4
		// @15: iload #4
		// @17: bipush 60 (0x3C)
		// @19: if_icmpeq @27
		// @1C: iload #4
		// @1E: bipush 62 (0x3E)
		// @20: if_icmpne @2E
		// @23: goto @27
		// @26: athrow
		// @27: iinc #2 +3
		// @2A: goto @2E
		// @2D: athrow
		// @2E: iinc #3 +1
		// @31: goto @09
		// @34: new java.lang.StringBuilder
		// @37: dup
		// @38: iload_1
		// @39: iload_2
		// @3A: iadd
		// @3B: invokespecial java.lang.StringBuilder.<init>(int)void
		// @3E: astore_3
		// @3F: iconst_0
		// @40: istore #4
		// @42: iload #4
		// @44: iload_1
		// @45: if_icmpge @89
		// @48: aload_0
		// @49: iload #4
		// @4B: invokevirtual java.lang.String.charAt(int)char
		// @4E: istore #5
		// @50: iload #5
		// @52: bipush 60 (0x3C)
		// @54: if_icmpne @66
		// @57: aload_3
		// @58: getstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @5B: bipush 23 (0x17)
		// @5D: aaload
		// @5E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @61: pop
		// @62: goto @83
		// @65: athrow
		// @66: iload #5
		// @68: bipush 62 (0x3E)
		// @6A: if_icmpne @7C
		// @6D: aload_3
		// @6E: getstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @71: bipush 24 (0x18)
		// @73: aaload
		// @74: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @77: pop
		// @78: goto @83
		// @7B: athrow
		// @7C: aload_3
		// @7D: iload #5
		// @7F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @82: pop
		// @83: iinc #4 +1
		// @86: goto @42
		// @89: aload_3
		// @8A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @8D: areturn
	}
	
	final void func_101746_a(String arg0, int arg1, int arg2, int arg3, int arg4)
	{
		// @00: aload_1
		// @01: ifnonnull @06
		// @04: return
		// @05: athrow
		// @06: aload_0
		// @07: iload #4
		// @09: iload #5
		// @0B: invokespecial game.C_100112_r.func_101736_a(int, int)void
		// @0E: aload_0
		// @0F: aload_1
		// @10: iload_2
		// @11: aload_0
		// @12: aload_1
		// @13: invokevirtual game.C_100112_r.func_101739_b(java.lang.String)int
		// @16: isub
		// @17: iload_3
		// @18: invokespecial game.C_100112_r.func_101737_b(java.lang.String, int, int)void
		// @1B: return
	}
	
	final int func_101734_a(String arg0, int arg1, int arg2)
	{
		// @00: iload_3
		// @01: ifne @09
		// @04: aload_0
		// @05: getfield int game.C_100112_r.field_101775_y
		// @08: istore_3
		// @09: aload_0
		// @0A: aload_1
		// @0B: iconst_1
		// @0C: newarray int[]
		// @0E: dup
		// @0F: iconst_0
		// @10: iload_2
		// @11: iastore
		// @12: getstatic java.lang.String[] game.C_100112_r.field_101762_O
		// @15: invokevirtual game.C_100112_r.func_101730_a(java.lang.String, int[], java.lang.String[])int
		// @18: istore #4
		// @1A: iload #4
		// @1C: iconst_1
		// @1D: isub
		// @1E: iload_3
		// @1F: imul
		// @20: istore #5
		// @22: aload_0
		// @23: getfield int game.C_100112_r.field_101772_Q
		// @26: iload #5
		// @28: iadd
		// @29: aload_0
		// @2A: getfield int game.C_100112_r.field_101763_H
		// @2D: iadd
		// @2E: ireturn
	}
	
	private static final int func_101735_a(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6)
	{
		// @00: aload_2
		// @01: iload #5
		// @03: iaload
		// @04: istore #7
		// @06: iload #7
		// @08: aload #4
		// @0A: iload #5
		// @0C: iaload
		// @0D: iadd
		// @0E: istore #8
		// @10: aload_2
		// @11: iload #6
		// @13: iaload
		// @14: istore #9
		// @16: iload #9
		// @18: aload #4
		// @1A: iload #6
		// @1C: iaload
		// @1D: iadd
		// @1E: istore #10
		// @20: iload #7
		// @22: istore #11
		// @24: iload #9
		// @26: iload #7
		// @28: if_icmple @2F
		// @2B: iload #9
		// @2D: istore #11
		// @2F: iload #8
		// @31: istore #12
		// @33: iload #10
		// @35: iload #8
		// @37: if_icmpge @3E
		// @3A: iload #10
		// @3C: istore #12
		// @3E: aload_3
		// @3F: iload #5
		// @41: iaload
		// @42: istore #13
		// @44: aload_3
		// @45: iload #6
		// @47: iaload
		// @48: iload #13
		// @4A: if_icmpge @53
		// @4D: aload_3
		// @4E: iload #6
		// @50: iaload
		// @51: istore #13
		// @53: aload_1
		// @54: iload #5
		// @56: aaload
		// @57: astore #14
		// @59: aload_0
		// @5A: iload #6
		// @5C: aaload
		// @5D: astore #15
		// @5F: iload #11
		// @61: iload #7
		// @63: isub
		// @64: istore #16
		// @66: iload #11
		// @68: iload #9
		// @6A: isub
		// @6B: istore #17
		// @6D: iload #11
		// @6F: istore #18
		// @71: iload #18
		// @73: iload #12
		// @75: if_icmpge @9C
		// @78: aload #14
		// @7A: iload #16
		// @7C: iinc #16 +1
		// @7F: baload
		// @80: aload #15
		// @82: iload #17
		// @84: iinc #17 +1
		// @87: baload
		// @88: iadd
		// @89: istore #19
		// @8B: iload #19
		// @8D: iload #13
		// @8F: if_icmpge @96
		// @92: iload #19
		// @94: istore #13
		// @96: iinc #18 +1
		// @99: goto @71
		// @9C: iload #13
		// @9E: ineg
		// @9F: ireturn
	}
	
	final void func_101747_b(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
	{
		// @00: aload_1
		// @01: ifnonnull @06
		// @04: return
		// @05: athrow
		// @06: aload_0
		// @07: iload #4
		// @09: iload #5
		// @0B: iload #6
		// @0D: invokespecial game.C_100112_r.func_101743_a(int, int, int)void
		// @10: aload_0
		// @11: aload_1
		// @12: iload_2
		// @13: aload_0
		// @14: aload_1
		// @15: invokevirtual game.C_100112_r.func_101739_b(java.lang.String)int
		// @18: iconst_2
		// @19: idiv
		// @1A: isub
		// @1B: iload_3
		// @1C: invokespecial game.C_100112_r.func_101737_b(java.lang.String, int, int)void
		// @1F: return
	}
	
	C_100112_r(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4)
	{
		// @00: aload_0
		// @01: invokespecial game.C_100325_id.<init>()void
		// @04: aload_0
		// @05: iconst_0
		// @06: putfield int game.C_100112_r.field_101775_y
		// @09: aload_0
		// @0A: aload_2
		// @0B: putfield int[] game.C_100112_r.field_101752_D
		// @0E: aload_0
		// @0F: aload_3
		// @10: putfield int[] game.C_100112_r.field_101755_G
		// @13: aload_0
		// @14: aload #4
		// @16: putfield int[] game.C_100112_r.field_101761_N
		// @19: aload_0
		// @1A: aload #5
		// @1C: putfield int[] game.C_100112_r.field_101764_I
		// @1F: aload_0
		// @20: aload_1
		// @21: invokespecial game.C_100112_r.func_101742_a(byte[])void
		// @24: ldc 2147483647 (0x7fffffff)
		// @26: istore #6
		// @28: ldc -2147483648 (0x80000000)
		// @2A: istore #7
		// @2C: iconst_0
		// @2D: istore #8
		// @2F: iload #8
		// @31: sipush 256 (0x0100)
		// @34: if_icmpge @89
		// @37: aload_0
		// @38: getfield int[] game.C_100112_r.field_101755_G
		// @3B: iload #8
		// @3D: iaload
		// @3E: iload #6
		// @40: if_icmpge @5E
		// @43: goto @47
		// @46: athrow
		// @47: aload_0
		// @48: getfield int[] game.C_100112_r.field_101764_I
		// @4B: iload #8
		// @4D: iaload
		// @4E: ifeq @5E
		// @51: goto @55
		// @54: athrow
		// @55: aload_0
		// @56: getfield int[] game.C_100112_r.field_101755_G
		// @59: iload #8
		// @5B: iaload
		// @5C: istore #6
		// @5E: aload_0
		// @5F: getfield int[] game.C_100112_r.field_101755_G
		// @62: iload #8
		// @64: iaload
		// @65: aload_0
		// @66: getfield int[] game.C_100112_r.field_101764_I
		// @69: iload #8
		// @6B: iaload
		// @6C: iadd
		// @6D: iload #7
		// @6F: if_icmple @83
		// @72: aload_0
		// @73: getfield int[] game.C_100112_r.field_101755_G
		// @76: iload #8
		// @78: iaload
		// @79: aload_0
		// @7A: getfield int[] game.C_100112_r.field_101764_I
		// @7D: iload #8
		// @7F: iaload
		// @80: iadd
		// @81: istore #7
		// @83: iinc #8 +1
		// @86: goto @2F
		// @89: aload_0
		// @8A: aload_0
		// @8B: getfield int game.C_100112_r.field_101775_y
		// @8E: iload #6
		// @90: isub
		// @91: putfield int game.C_100112_r.field_101772_Q
		// @94: aload_0
		// @95: iload #7
		// @97: aload_0
		// @98: getfield int game.C_100112_r.field_101775_y
		// @9B: isub
		// @9C: putfield int game.C_100112_r.field_101763_H
		// @9F: aload_0
		// @A0: aload_0
		// @A1: getfield int game.C_100112_r.field_101775_y
		// @A4: aload_0
		// @A5: getfield int[] game.C_100112_r.field_101755_G
		// @A8: bipush 88 (0x58)
		// @AA: iaload
		// @AB: isub
		// @AC: putfield int game.C_100112_r.field_101769_u
		// @AF: return
	}
	
	static
	{
		// @000: bipush 25 (0x19)
		// @002: anewarray java.lang.String
		// @005: dup
		// @006: iconst_0
		// @007: ldc "AC%"
		// @009: invokestatic game.C_100112_r.func_101741_z(java.lang.String)char[]
		// @00C: invokestatic game.C_100112_r.func_101726_z(char[])java.lang.String
		// @00F: aastore
		// @010: dup
		// @011: iconst_1
		// @012: ldc "\u001c\u0005jB8"
		// @014: invokestatic game.C_100112_r.func_101741_z(java.lang.String)char[]
		// @017: invokestatic game.C_100112_r.func_101726_z(char[])java.lang.String
		// @01A: aastore
		// @01B: dup
		// @01C: iconst_2
		// @01D: ldc "\r\u001f"
		// @01F: invokestatic game.C_100112_r.func_101741_z(java.lang.String)char[]
		// @022: invokestatic game.C_100112_r.func_101726_z(char[])java.lang.String
		// @025: aastore
		// @026: dup
		// @027: iconst_3
		// @028: ldc "\u000c\u0002g\u001b"
		// @02A: invokestatic game.C_100112_r.func_101741_z(java.lang.String)char[]
		// @02D: invokestatic game.C_100112_r.func_101726_z(char[])java.lang.String
		// @030: aastore
		// @031: dup
		// @032: iconst_4
		// @033: ldc "@\u001ecGa"
		// @035: invokestatic game.C_100112_r.func_101741_z(java.lang.String)char[]
		// @038: invokestatic game.C_100112_r.func_101726_z(char[])java.lang.String
		// @03B: aastore
		// @03C: dup
		// @03D: iconst_5
		// @03E: ldc "\u001c\u0019y\u001b"
		// @040: invokestatic game.C_100112_r.func_101741_z(java.lang.String)char[]
		// @043: invokestatic game.C_100112_r.func_101726_z(char[])java.lang.String
		// @046: aastore
		// @047: dup
		// @048: bipush 6 (0x06)
		// @04A: ldc "\u001aP"
		// @04C: invokestatic game.C_100112_r.func_101741_z(java.lang.String)char[]
		// @04F: invokestatic game.C_100112_r.func_101726_z(char[])java.lang.String
		// @052: aastore
		// @053: dup
		// @054: bipush 7 (0x07)
		// @056: ldc "\u001c\u0019y"
		// @058: invokestatic game.C_100112_r.func_101741_z(java.lang.String)char[]
		// @05B: invokestatic game.C_100112_r.func_101726_z(char[])java.lang.String
		// @05E: aastore
		// @05F: dup
		// @060: bipush 8 (0x08)
		// @062: ldc "@\u0019yGk\u001c"
		// @064: invokestatic game.C_100112_r.func_101741_z(java.lang.String)char[]
		// @067: invokestatic game.C_100112_r.func_101726_z(char[])java.lang.String
		// @06A: aastore
		// @06B: dup
		// @06C: bipush 9 (0x09)
		// @06E: ldc "\u001b\u001fjHvR"
		// @070: invokestatic game.C_100112_r.func_101741_z(java.lang.String)char[]
		// @073: invokestatic game.C_100112_r.func_101726_z(char[])java.lang.String
		// @076: aastore
		// @077: dup
		// @078: bipush 10 (0x0A)
		// @07A: ldc "@\u001e\u007fT"
		// @07C: invokestatic game.C_100112_r.func_101741_z(java.lang.String)char[]
		// @07F: invokestatic game.C_100112_r.func_101726_z(char[])java.lang.String
		// @082: aastore
		// @083: dup
		// @084: bipush 11 (0x0B)
		// @086: ldc "@\u0018"
		// @088: invokestatic game.C_100112_r.func_101741_z(java.lang.String)char[]
		// @08B: invokestatic game.C_100112_r.func_101726_z(char[])java.lang.String
		// @08E: aastore
		// @08F: dup
		// @090: bipush 12 (0x0C)
		// @092: ldc "\u001c\u0005jB"
		// @094: invokestatic game.C_100112_r.func_101741_z(java.lang.String)char[]
		// @097: invokestatic game.C_100112_r.func_101726_z(char[])java.lang.String
		// @09A: aastore
		// @09B: dup
		// @09C: bipush 13 (0x0D)
		// @09E: ldc "@\u000edJ"
		// @0A0: invokestatic game.C_100112_r.func_101741_z(java.lang.String)char[]
		// @0A3: invokestatic game.C_100112_r.func_101726_z(char[])java.lang.String
		// @0A6: aastore
		// @0A7: dup
		// @0A8: bipush 14 (0x0E)
		// @0AA: ldc "\u0008\u0019"
		// @0AC: invokestatic game.C_100112_r.func_101741_z(java.lang.String)char[]
		// @0AF: invokestatic game.C_100112_r.func_101726_z(char[])java.lang.String
		// @0B2: aastore
		// @0B3: dup
		// @0B4: bipush 15 (0x0F)
		// @0B6: ldc "\u0006\u0000l\u001b"
		// @0B8: invokestatic game.C_100112_r.func_101741_z(java.lang.String)char[]
		// @0BB: invokestatic game.C_100112_r.func_101726_z(char[])java.lang.String
		// @0BE: aastore
		// @0BF: dup
		// @0C0: bipush 16 (0x10)
		// @0C2: ldc "\u0001\u000fxV"
		// @0C4: invokestatic game.C_100112_r.func_101741_z(java.lang.String)char[]
		// @0C7: invokestatic game.C_100112_r.func_101726_z(char[])java.lang.String
		// @0CA: aastore
		// @0CB: dup
		// @0CC: bipush 17 (0x11)
		// @0CE: ldc "\u001b\u0004fCv"
		// @0D0: invokestatic game.C_100112_r.func_101741_z(java.lang.String)char[]
		// @0D3: invokestatic game.C_100112_r.func_101726_z(char[])java.lang.String
		// @0D6: aastore
		// @0D7: dup
		// @0D8: bipush 18 (0x12)
		// @0DA: ldc "\u001c\u0005r"
		// @0DC: invokestatic game.C_100112_r.func_101741_z(java.lang.String)char[]
		// @0DF: invokestatic game.C_100112_r.func_101726_z(char[])java.lang.String
		// @0E2: aastore
		// @0E3: dup
		// @0E4: bipush 19 (0x13)
		// @0E6: ldc "\n\u0018yI"
		// @0E8: invokestatic game.C_100112_r.func_101741_z(java.lang.String)char[]
		// @0EB: invokestatic game.C_100112_r.func_101726_z(char[])java.lang.String
		// @0EE: aastore
		// @0EF: dup
		// @0F0: bipush 20 (0x14)
		// @0F2: ldc "\u0003\u0019"
		// @0F4: invokestatic game.C_100112_r.func_101741_z(java.lang.String)char[]
		// @0F7: invokestatic game.C_100112_r.func_101726_z(char[])java.lang.String
		// @0FA: aastore
		// @0FB: dup
		// @0FC: bipush 21 (0x15)
		// @0FE: ldc "\u000c\u0002{_"
		// @100: invokestatic game.C_100112_r.func_101741_z(java.lang.String)char[]
		// @103: invokestatic game.C_100112_r.func_101726_z(char[])java.lang.String
		// @106: aastore
		// @107: dup
		// @108: bipush 22 (0x16)
		// @10A: ldc "\u001d\u0008l"
		// @10C: invokestatic game.C_100112_r.func_101741_z(java.lang.String)char[]
		// @10F: invokestatic game.C_100112_r.func_101726_z(char[])java.lang.String
		// @112: aastore
		// @113: dup
		// @114: bipush 23 (0x17)
		// @116: ldc "S\u0001\u007f\u0018"
		// @118: invokestatic game.C_100112_r.func_101741_z(java.lang.String)char[]
		// @11B: invokestatic game.C_100112_r.func_101726_z(char[])java.lang.String
		// @11E: aastore
		// @11F: dup
		// @120: bipush 24 (0x18)
		// @122: ldc "S\n\u007f\u0018"
		// @124: invokestatic game.C_100112_r.func_101741_z(java.lang.String)char[]
		// @127: invokestatic game.C_100112_r.func_101726_z(char[])java.lang.String
		// @12A: aastore
		// @12B: putstatic java.lang.String[] game.C_100112_r.field_101765_J
		// @12E: new java.lang.StringBuilder
		// @131: dup
		// @132: bipush 100 (0x64)
		// @134: invokespecial java.lang.StringBuilder.<init>(int)void
		// @137: putstatic java.lang.StringBuilder game.C_100112_r.field_101766_K
		// @13A: iconst_0
		// @13B: putstatic int game.C_100112_r.field_101753_E
		// @13E: iconst_0
		// @13F: putstatic int game.C_100112_r.field_101774_z
		// @142: iconst_m1
		// @143: putstatic int game.C_100112_r.field_101754_F
		// @146: bipush 100 (0x64)
		// @148: anewarray java.lang.String
		// @14B: putstatic java.lang.String[] game.C_100112_r.field_101762_O
		// @14E: iconst_m1
		// @14F: putstatic int game.C_100112_r.field_101767_w
		// @152: sipush 256 (0x0100)
		// @155: putstatic int game.C_100112_r.field_101773_P
		// @158: sipush 256 (0x0100)
		// @15B: putstatic int game.C_100112_r.field_101770_t
		// @15E: iconst_0
		// @15F: putstatic int game.C_100112_r.field_101776_x
		// @162: iconst_m1
		// @163: putstatic int game.C_100112_r.field_101760_M
		// @166: iconst_m1
		// @167: putstatic int game.C_100112_r.field_101757_B
		// @16A: iconst_0
		// @16B: putstatic int game.C_100112_r.field_101759_L
		// @16E: return
	}
	
	private static char[] func_101741_z(String arg0)
	{
		// @00: aload_0
		// @01: invokevirtual java.lang.String.toCharArray()char[]
		// @04: dup
		// @05: arraylength
		// @06: iconst_2
		// @07: if_icmpge @12
		// @0A: dup
		// @0B: iconst_0
		// @0C: dup2
		// @0D: caload
		// @0E: iconst_5
		// @0F: ixor
		// @10: i2c
		// @11: castore
		// @12: areturn
	}
	
	private static String func_101726_z(char[] arg0)
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
		// @10: tableswitch def: @44, for 0: @30, for 1: @35, for 2: @3A, for 3: @3F
		// @30: bipush 111 (0x6F)
		// @32: goto @45
		// @35: bipush 109 (0x6D)
		// @37: goto @45
		// @3A: bipush 11 (0x0B)
		// @3C: goto @45
		// @3F: bipush 38 (0x26)
		// @41: goto @45
		// @44: iconst_5
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
