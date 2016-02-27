package game;

import java.applet.Applet;

final class C_100277_nc
{
	short[] field_106697_E;
	short[] field_106743_z;
	int field_106700_A;
	short[] field_106717_S;
	int field_106720_f;
	short[] field_106734_i;
	short[] field_106703_L;
	int[] field_106725_c;
	short[] field_106714_V;
	private boolean field_106713_W;
	short field_106698_F;
	short[] field_106731_j;
	short[] field_106723_e;
	static C_100302_ka field_106699_G;
	short[] field_106722_d;
	short[] field_106738_t;
	int[] field_106701_B;
	short[] field_106711_U;
	int[] field_106739_s;
	short[] field_106706_O;
	short[] field_106733_h;
	short field_106735_w;
	int field_106709_J;
	int[] field_106741_q;
	static String field_106736_v;
	short field_106721_g;
	short[] field_106710_K;
	byte field_106729_l;
	byte[] field_106718_R;
	short[] field_106707_H;
	static String[] field_106745_x;
	short[] field_106708_I;
	short[] field_106730_m;
	int[] field_106704_M;
	static boolean field_106705_N;
	int[] field_106727_n;
	static C_100327_ib field_106726_a;
	int[] field_106715_Q;
	int field_106716_P;
	short[] field_106724_b;
	static int field_106742_p;
	int[] field_106732_k;
	int field_106696_D;
	static C_100059_df[] field_106737_u;
	int[] field_106712_T;
	static int field_106728_o;
	static int field_106744_y;
	int field_106740_r;
	static int field_106702_C;
	private static final String[] field_106719_X;
	
	final void func_106692_a(byte arg0)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #12
		// @005: aload_0
		// @006: getfield boolean game.C_100277_nc.field_106713_W
		// @009: ifeq @00D
		// @00C: return
		// @00D: aload_0
		// @00E: iconst_1
		// @00F: putfield boolean game.C_100277_nc.field_106713_W
		// @012: sipush 32767 (0x7FFF)
		// @015: istore_2
		// @016: sipush 32767 (0x7FFF)
		// @019: istore_3
		// @01A: sipush 32767 (0x7FFF)
		// @01D: istore #4
		// @01F: sipush -32768 (0x8000)
		// @022: istore #5
		// @024: sipush -32768 (0x8000)
		// @027: istore #6
		// @029: sipush -32768 (0x8000)
		// @02C: istore #7
		// @02E: iconst_0
		// @02F: istore #8
		// @031: iload #8
		// @033: aload_0
		// @034: getfield short game.C_100277_nc.field_106698_F
		// @037: if_icmpge @0BF
		// @03A: aload_0
		// @03B: getfield short[] game.C_100277_nc.field_106711_U
		// @03E: iload #8
		// @040: saload
		// @041: istore #9
		// @043: aload_0
		// @044: getfield short[] game.C_100277_nc.field_106724_b
		// @047: iload #8
		// @049: saload
		// @04A: istore #10
		// @04C: iload #10
		// @04E: iconst_m1
		// @04F: ixor
		// @050: iload_3
		// @051: iconst_m1
		// @052: ixor
		// @053: iload #12
		// @055: ifne @0C2
		// @058: if_icmpgt @062
		// @05B: goto @05F
		// @05E: athrow
		// @05F: goto @065
		// @062: iload #10
		// @064: istore_3
		// @065: aload_0
		// @066: getfield short[] game.C_100277_nc.field_106714_V
		// @069: iload #8
		// @06B: saload
		// @06C: istore #11
		// @06E: iload #10
		// @070: iconst_m1
		// @071: ixor
		// @072: iload #6
		// @074: iconst_m1
		// @075: ixor
		// @076: if_icmplt @07D
		// @079: goto @081
		// @07C: athrow
		// @07D: iload #10
		// @07F: istore #6
		// @081: iload_2
		// @082: iload #9
		// @084: if_icmple @08A
		// @087: iload #9
		// @089: istore_2
		// @08A: iload #9
		// @08C: iload #5
		// @08E: if_icmpgt @095
		// @091: goto @099
		// @094: athrow
		// @095: iload #9
		// @097: istore #5
		// @099: iload #7
		// @09B: iconst_m1
		// @09C: ixor
		// @09D: iload #11
		// @09F: iconst_m1
		// @0A0: ixor
		// @0A1: if_icmpgt @0A8
		// @0A4: goto @0AC
		// @0A7: athrow
		// @0A8: iload #11
		// @0AA: istore #7
		// @0AC: iload #11
		// @0AE: iload #4
		// @0B0: if_icmpge @0B7
		// @0B3: iload #11
		// @0B5: istore #4
		// @0B7: iinc #8 +1
		// @0BA: iload #12
		// @0BC: ifeq @031
		// @0BF: iload_1
		// @0C0: bipush -107 (0x95)
		// @0C2: if_icmplt @0CF
		// @0C5: aload_0
		// @0C6: bipush 73 (0x49)
		// @0C8: putfield int game.C_100277_nc.field_106709_J
		// @0CB: goto @0CF
		// @0CE: athrow
		// @0CF: aload_0
		// @0D0: iload #7
		// @0D2: putfield int game.C_100277_nc.field_106700_A
		// @0D5: aload_0
		// @0D6: iload_3
		// @0D7: putfield int game.C_100277_nc.field_106696_D
		// @0DA: aload_0
		// @0DB: iload #4
		// @0DD: putfield int game.C_100277_nc.field_106709_J
		// @0E0: aload_0
		// @0E1: iload_2
		// @0E2: putfield int game.C_100277_nc.field_106740_r
		// @0E5: aload_0
		// @0E6: iload #6
		// @0E8: putfield int game.C_100277_nc.field_106720_f
		// @0EB: aload_0
		// @0EC: iload #5
		// @0EE: putfield int game.C_100277_nc.field_106716_P
		// @0F1: goto @115
		// @0F4: astore_2
		// @0F5: aload_2
		// @0F6: new java.lang.StringBuilder
		// @0F9: dup
		// @0FA: invokespecial java.lang.StringBuilder.<init>()void
		// @0FD: getstatic java.lang.String[] game.C_100277_nc.field_106719_X
		// @100: iconst_3
		// @101: aaload
		// @102: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @105: iload_1
		// @106: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @109: bipush 41 (0x29)
		// @10B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @10E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @111: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @114: athrow
		// @115: return
	}
	
	public static void func_106694_b(byte arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100277_nc.field_106736_v
		// @04: aconst_null
		// @05: putstatic game.C_100327_ib game.C_100277_nc.field_106726_a
		// @08: bipush -44 (0xD4)
		// @0A: iload_0
		// @0B: bipush -50 (0xCE)
		// @0D: isub
		// @0E: bipush 62 (0x3E)
		// @10: idiv
		// @11: idiv
		// @12: istore_1
		// @13: aconst_null
		// @14: putstatic game.C_100302_ka game.C_100277_nc.field_106699_G
		// @17: aconst_null
		// @18: putstatic game.C_100059_df[] game.C_100277_nc.field_106737_u
		// @1B: aconst_null
		// @1C: putstatic java.lang.String[] game.C_100277_nc.field_106745_x
		// @1F: goto @44
		// @22: astore_1
		// @23: aload_1
		// @24: new java.lang.StringBuilder
		// @27: dup
		// @28: invokespecial java.lang.StringBuilder.<init>()void
		// @2B: getstatic java.lang.String[] game.C_100277_nc.field_106719_X
		// @2E: bipush 21 (0x15)
		// @30: aaload
		// @31: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @34: iload_0
		// @35: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @38: bipush 41 (0x29)
		// @3A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @40: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @43: athrow
		// @44: return
	}
	
	static final void func_106689_a(boolean arg0, Applet arg1)
	{
		// @000: aload_1
		// @001: invokevirtual java.applet.Applet.getCodeBase()java.net.URL
		// @004: astore_2
		// @005: iconst_m1
		// @006: aload_2
		// @007: aload_1
		// @008: invokestatic game.C_100244_pe.func_106368_a(int, java.net.URL, java.applet.Applet)java.net.URL
		// @00B: invokevirtual java.net.URL.getFile()java.lang.String
		// @00E: astore_3
		// @00F: getstatic java.lang.String[] game.C_100277_nc.field_106719_X
		// @012: bipush 8 (0x08)
		// @014: aaload
		// @015: aload_1
		// @016: bipush -114 (0x8E)
		// @018: iconst_2
		// @019: anewarray java.lang.Object
		// @01C: dup
		// @01D: iconst_0
		// @01E: getstatic java.lang.String[] game.C_100277_nc.field_106719_X
		// @021: bipush 17 (0x11)
		// @023: aaload
		// @024: aastore
		// @025: dup
		// @026: iconst_1
		// @027: new java.lang.StringBuilder
		// @02A: dup
		// @02B: invokespecial java.lang.StringBuilder.<init>()void
		// @02E: aload_3
		// @02F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @032: getstatic java.lang.String[] game.C_100277_nc.field_106719_X
		// @035: bipush 13 (0x0D)
		// @037: aaload
		// @038: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @03B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @03E: aastore
		// @03F: invokestatic game.C_100175_cl.func_105613_a(java.lang.String, java.applet.Applet, byte, java.lang.Object[])java.lang.Object
		// @042: pop
		// @043: getstatic java.lang.String[] game.C_100277_nc.field_106719_X
		// @046: bipush 8 (0x08)
		// @048: aaload
		// @049: aload_1
		// @04A: bipush -112 (0x90)
		// @04C: iconst_2
		// @04D: anewarray java.lang.Object
		// @050: dup
		// @051: iconst_0
		// @052: getstatic java.lang.String[] game.C_100277_nc.field_106719_X
		// @055: bipush 7 (0x07)
		// @057: aaload
		// @058: aastore
		// @059: dup
		// @05A: iconst_1
		// @05B: new java.lang.StringBuilder
		// @05E: dup
		// @05F: invokespecial java.lang.StringBuilder.<init>()void
		// @062: aload_3
		// @063: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @066: getstatic java.lang.String[] game.C_100277_nc.field_106719_X
		// @069: iconst_5
		// @06A: aaload
		// @06B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @06E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @071: aastore
		// @072: invokestatic game.C_100175_cl.func_105613_a(java.lang.String, java.applet.Applet, byte, java.lang.Object[])java.lang.Object
		// @075: pop
		// @076: getstatic java.lang.String[] game.C_100277_nc.field_106719_X
		// @079: bipush 8 (0x08)
		// @07B: aaload
		// @07C: aload_1
		// @07D: bipush -94 (0xA2)
		// @07F: iconst_2
		// @080: anewarray java.lang.Object
		// @083: dup
		// @084: iconst_0
		// @085: getstatic java.lang.String[] game.C_100277_nc.field_106719_X
		// @088: bipush 11 (0x0B)
		// @08A: aaload
		// @08B: aastore
		// @08C: dup
		// @08D: iconst_1
		// @08E: new java.lang.StringBuilder
		// @091: dup
		// @092: invokespecial java.lang.StringBuilder.<init>()void
		// @095: aload_3
		// @096: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @099: getstatic java.lang.String[] game.C_100277_nc.field_106719_X
		// @09C: bipush 15 (0x0F)
		// @09E: aaload
		// @09F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0A2: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @0A5: aastore
		// @0A6: invokestatic game.C_100175_cl.func_105613_a(java.lang.String, java.applet.Applet, byte, java.lang.Object[])java.lang.Object
		// @0A9: pop
		// @0AA: getstatic java.lang.String[] game.C_100277_nc.field_106719_X
		// @0AD: bipush 8 (0x08)
		// @0AF: aaload
		// @0B0: aload_1
		// @0B1: bipush -94 (0xA2)
		// @0B3: iconst_2
		// @0B4: anewarray java.lang.Object
		// @0B7: dup
		// @0B8: iconst_0
		// @0B9: getstatic java.lang.String[] game.C_100277_nc.field_106719_X
		// @0BC: bipush 10 (0x0A)
		// @0BE: aaload
		// @0BF: aastore
		// @0C0: dup
		// @0C1: iconst_1
		// @0C2: new java.lang.StringBuilder
		// @0C5: dup
		// @0C6: invokespecial java.lang.StringBuilder.<init>()void
		// @0C9: aload_3
		// @0CA: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0CD: getstatic java.lang.String[] game.C_100277_nc.field_106719_X
		// @0D0: bipush 18 (0x12)
		// @0D2: aaload
		// @0D3: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0D6: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @0D9: aastore
		// @0DA: invokestatic game.C_100175_cl.func_105613_a(java.lang.String, java.applet.Applet, byte, java.lang.Object[])java.lang.Object
		// @0DD: pop
		// @0DE: getstatic java.lang.String[] game.C_100277_nc.field_106719_X
		// @0E1: bipush 8 (0x08)
		// @0E3: aaload
		// @0E4: aload_1
		// @0E5: bipush -100 (0x9C)
		// @0E7: iconst_2
		// @0E8: anewarray java.lang.Object
		// @0EB: dup
		// @0EC: iconst_0
		// @0ED: getstatic java.lang.String[] game.C_100277_nc.field_106719_X
		// @0F0: bipush 19 (0x13)
		// @0F2: aaload
		// @0F3: aastore
		// @0F4: dup
		// @0F5: iconst_1
		// @0F6: new java.lang.StringBuilder
		// @0F9: dup
		// @0FA: invokespecial java.lang.StringBuilder.<init>()void
		// @0FD: aload_3
		// @0FE: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @101: getstatic java.lang.String[] game.C_100277_nc.field_106719_X
		// @104: bipush 9 (0x09)
		// @106: aaload
		// @107: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @10A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @10D: aastore
		// @10E: invokestatic game.C_100175_cl.func_105613_a(java.lang.String, java.applet.Applet, byte, java.lang.Object[])java.lang.Object
		// @111: pop
		// @112: getstatic java.lang.String[] game.C_100277_nc.field_106719_X
		// @115: bipush 8 (0x08)
		// @117: aaload
		// @118: aload_1
		// @119: bipush -115 (0x8D)
		// @11B: iconst_2
		// @11C: anewarray java.lang.Object
		// @11F: dup
		// @120: iconst_0
		// @121: getstatic java.lang.String[] game.C_100277_nc.field_106719_X
		// @124: bipush 12 (0x0C)
		// @126: aaload
		// @127: aastore
		// @128: dup
		// @129: iconst_1
		// @12A: new java.lang.StringBuilder
		// @12D: dup
		// @12E: invokespecial java.lang.StringBuilder.<init>()void
		// @131: aload_3
		// @132: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @135: getstatic java.lang.String[] game.C_100277_nc.field_106719_X
		// @138: iconst_4
		// @139: aaload
		// @13A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @13D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @140: aastore
		// @141: invokestatic game.C_100175_cl.func_105613_a(java.lang.String, java.applet.Applet, byte, java.lang.Object[])java.lang.Object
		// @144: pop
		// @145: iload_0
		// @146: ifeq @156
		// @149: bipush -80 (0xB0)
		// @14B: bipush -31 (0xE1)
		// @14D: bipush 113 (0x71)
		// @14F: invokestatic game.C_100277_nc.func_106695_a(int, int, int)void
		// @152: goto @156
		// @155: athrow
		// @156: goto @15A
		// @159: astore_2
		// @15A: goto @19B
		// @15D: astore_2
		// @15E: aload_2
		// @15F: new java.lang.StringBuilder
		// @162: dup
		// @163: invokespecial java.lang.StringBuilder.<init>()void
		// @166: getstatic java.lang.String[] game.C_100277_nc.field_106719_X
		// @169: bipush 14 (0x0E)
		// @16B: aaload
		// @16C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @16F: iload_0
		// @170: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @173: bipush 44 (0x2C)
		// @175: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @178: aload_1
		// @179: ifnull @186
		// @17C: getstatic java.lang.String[] game.C_100277_nc.field_106719_X
		// @17F: bipush 6 (0x06)
		// @181: aaload
		// @182: goto @18C
		// @185: athrow
		// @186: getstatic java.lang.String[] game.C_100277_nc.field_106719_X
		// @189: bipush 16 (0x10)
		// @18B: aaload
		// @18C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @18F: bipush 41 (0x29)
		// @191: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @194: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @197: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @19A: athrow
		// @19B: return
	}
	
	private final void func_106690_a(int arg0)
	{
		// @00: aload_0
		// @01: iconst_0
		// @02: putfield boolean game.C_100277_nc.field_106713_W
		// @05: iload_1
		// @06: sipush -32768 (0x8000)
		// @09: if_icmpeq @12
		// @0C: aload_0
		// @0D: bipush -22 (0xEA)
		// @0F: invokespecial game.C_100277_nc.func_106690_a(int)void
		// @12: goto @37
		// @15: astore_2
		// @16: aload_2
		// @17: new java.lang.StringBuilder
		// @1A: dup
		// @1B: invokespecial java.lang.StringBuilder.<init>()void
		// @1E: getstatic java.lang.String[] game.C_100277_nc.field_106719_X
		// @21: bipush 20 (0x14)
		// @23: aaload
		// @24: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @27: iload_1
		// @28: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2B: bipush 41 (0x29)
		// @2D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @30: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @33: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @36: athrow
		// @37: return
	}
	
	static final void func_106695_a(int arg0, int arg1, int arg2)
	{
		// @00: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @03: astore_3
		// @04: aload_3
		// @05: iload_2
		// @06: iload_1
		// @07: bipush 123 (0x7B)
		// @09: ixor
		// @0A: invokevirtual game.C_100278_nd.func_101189_h(int, int)void
		// @0D: aload_3
		// @0E: iload_1
		// @0F: sipush 7837 (0x1E9D)
		// @12: ixor
		// @13: iload_1
		// @14: invokevirtual game.C_100278_nd.func_101169_f(int, int)void
		// @17: aload_3
		// @18: sipush 7838 (0x1E9E)
		// @1B: bipush 8 (0x08)
		// @1D: invokevirtual game.C_100278_nd.func_101169_f(int, int)void
		// @20: aload_3
		// @21: iload_0
		// @22: bipush -126 (0x82)
		// @24: invokevirtual game.C_100278_nd.func_101141_d(int, byte)void
		// @27: goto @5D
		// @2A: astore_3
		// @2B: aload_3
		// @2C: new java.lang.StringBuilder
		// @2F: dup
		// @30: invokespecial java.lang.StringBuilder.<init>()void
		// @33: getstatic java.lang.String[] game.C_100277_nc.field_106719_X
		// @36: iconst_0
		// @37: aaload
		// @38: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3B: iload_0
		// @3C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3F: bipush 44 (0x2C)
		// @41: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @44: iload_1
		// @45: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @48: bipush 44 (0x2C)
		// @4A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4D: iload_2
		// @4E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @51: bipush 41 (0x29)
		// @53: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @56: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @59: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @5C: athrow
		// @5D: return
	}
	
	final void func_106688_a(int arg0, int arg1, int arg2, int arg3)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #6
		// @05: iload #4
		// @07: ifeq @0B
		// @0A: return
		// @0B: iconst_0
		// @0C: istore #5
		// @0E: iload #5
		// @10: iconst_m1
		// @11: ixor
		// @12: aload_0
		// @13: getfield short game.C_100277_nc.field_106698_F
		// @16: iconst_m1
		// @17: ixor
		// @18: if_icmple @50
		// @1B: aload_0
		// @1C: getfield short[] game.C_100277_nc.field_106711_U
		// @1F: iload #5
		// @21: dup2
		// @22: saload
		// @23: iload_2
		// @24: iadd
		// @25: i2s
		// @26: sastore
		// @27: aload_0
		// @28: getfield short[] game.C_100277_nc.field_106724_b
		// @2B: iload #5
		// @2D: dup2
		// @2E: saload
		// @2F: iload_3
		// @30: iadd
		// @31: i2s
		// @32: sastore
		// @33: aload_0
		// @34: getfield short[] game.C_100277_nc.field_106714_V
		// @37: iload #5
		// @39: dup2
		// @3A: saload
		// @3B: iload_1
		// @3C: iadd
		// @3D: i2s
		// @3E: sastore
		// @3F: iinc #5 +1
		// @42: iload #6
		// @44: ifne @5A
		// @47: iload #6
		// @49: ifeq @0E
		// @4C: goto @50
		// @4F: athrow
		// @50: aload_0
		// @51: iload #4
		// @53: sipush -32768 (0x8000)
		// @56: ixor
		// @57: invokespecial game.C_100277_nc.func_106690_a(int)void
		// @5A: goto @9C
		// @5D: astore #5
		// @5F: aload #5
		// @61: new java.lang.StringBuilder
		// @64: dup
		// @65: invokespecial java.lang.StringBuilder.<init>()void
		// @68: getstatic java.lang.String[] game.C_100277_nc.field_106719_X
		// @6B: iconst_1
		// @6C: aaload
		// @6D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @70: iload_1
		// @71: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @74: bipush 44 (0x2C)
		// @76: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @79: iload_2
		// @7A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7D: bipush 44 (0x2C)
		// @7F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @82: iload_3
		// @83: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @86: bipush 44 (0x2C)
		// @88: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8B: iload #4
		// @8D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @90: bipush 41 (0x29)
		// @92: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @95: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @98: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @9B: athrow
		// @9C: return
	}
	
	final void func_106687_a(int arg0, int arg1, boolean arg2, int arg3, int arg4)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #7
		// @05: iconst_0
		// @06: istore #6
		// @08: aload_0
		// @09: getfield short game.C_100277_nc.field_106698_F
		// @0C: iconst_m1
		// @0D: ixor
		// @0E: iload #6
		// @10: iconst_m1
		// @11: ixor
		// @12: if_icmpge @63
		// @15: aload_0
		// @16: getfield short[] game.C_100277_nc.field_106711_U
		// @19: iload #6
		// @1B: iload_1
		// @1C: aload_0
		// @1D: getfield short[] game.C_100277_nc.field_106711_U
		// @20: iload #6
		// @22: saload
		// @23: imul
		// @24: iload #5
		// @26: idiv
		// @27: i2s
		// @28: sastore
		// @29: aload_0
		// @2A: getfield short[] game.C_100277_nc.field_106724_b
		// @2D: iload #6
		// @2F: iload_2
		// @30: aload_0
		// @31: getfield short[] game.C_100277_nc.field_106724_b
		// @34: iload #6
		// @36: saload
		// @37: imul
		// @38: iload #5
		// @3A: idiv
		// @3B: i2s
		// @3C: sastore
		// @3D: aload_0
		// @3E: getfield short[] game.C_100277_nc.field_106714_V
		// @41: iload #6
		// @43: aload_0
		// @44: getfield short[] game.C_100277_nc.field_106714_V
		// @47: iload #6
		// @49: saload
		// @4A: iload #4
		// @4C: imul
		// @4D: iload #5
		// @4F: idiv
		// @50: i2s
		// @51: sastore
		// @52: iinc #6 +1
		// @55: iload #7
		// @57: ifne @7A
		// @5A: iload #7
		// @5C: ifeq @08
		// @5F: goto @63
		// @62: athrow
		// @63: iload_3
		// @64: ifeq @73
		// @67: aload_0
		// @68: aconst_null
		// @69: checkcast int[]
		// @6C: putfield int[] game.C_100277_nc.field_106701_B
		// @6F: goto @73
		// @72: athrow
		// @73: aload_0
		// @74: sipush -32768 (0x8000)
		// @77: invokespecial game.C_100277_nc.func_106690_a(int)void
		// @7A: goto @C6
		// @7D: astore #6
		// @7F: aload #6
		// @81: new java.lang.StringBuilder
		// @84: dup
		// @85: invokespecial java.lang.StringBuilder.<init>()void
		// @88: getstatic java.lang.String[] game.C_100277_nc.field_106719_X
		// @8B: iconst_2
		// @8C: aaload
		// @8D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @90: iload_1
		// @91: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @94: bipush 44 (0x2C)
		// @96: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @99: iload_2
		// @9A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @9D: bipush 44 (0x2C)
		// @9F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A2: iload_3
		// @A3: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @A6: bipush 44 (0x2C)
		// @A8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @AB: iload #4
		// @AD: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @B0: bipush 44 (0x2C)
		// @B2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B5: iload #5
		// @B7: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @BA: bipush 41 (0x29)
		// @BC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @BF: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @C2: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @C5: athrow
		// @C6: return
	}
	
	C_100277_nc()
	{
		// @0: aload_0
		// @1: invokespecial java.lang.Object.<init>()void
		// @4: aload_0
		// @5: iconst_0
		// @6: putfield byte game.C_100277_nc.field_106729_l
		// @9: aload_0
		// @A: iconst_0
		// @B: putfield boolean game.C_100277_nc.field_106713_W
		// @E: return
	}
	
	static
	{
		// @000: bipush 22 (0x16)
		// @002: anewarray java.lang.String
		// @005: dup
		// @006: iconst_0
		// @007: ldc "\u001f$<.J"
		// @009: invokestatic game.C_100277_nc.func_106693_z(java.lang.String)char[]
		// @00C: invokestatic game.C_100277_nc.func_106691_z(char[])java.lang.String
		// @00F: aastore
		// @010: dup
		// @011: iconst_1
		// @012: ldc "\u001f$<+J"
		// @014: invokestatic game.C_100277_nc.func_106693_z(java.lang.String)char[]
		// @017: invokestatic game.C_100277_nc.func_106691_z(char[])java.lang.String
		// @01A: aastore
		// @01B: dup
		// @01C: iconst_2
		// @01D: ldc "\u001f$<-J"
		// @01F: invokestatic game.C_100277_nc.func_106693_z(java.lang.String)char[]
		// @022: invokestatic game.C_100277_nc.func_106691_z(char[])java.lang.String
		// @025: aastore
		// @026: dup
		// @027: iconst_3
		// @028: ldc "\u001f$<(J"
		// @02A: invokestatic game.C_100277_nc.func_106693_z(java.lang.String)char[]
		// @02D: invokestatic game.C_100277_nc.func_106691_z(char[])java.lang.String
		// @030: aastore
		// @031: dup
		// @032: iconst_4
		// @033: ldc "\u00015{\u001c\u0003\u0012><\u001d\u0011"
		// @035: invokestatic game.C_100277_nc.func_106693_z(java.lang.String)char[]
		// @038: invokestatic game.C_100277_nc.func_106691_z(char[])java.lang.String
		// @03B: aastore
		// @03C: dup
		// @03D: iconst_5
		// @03E: ldc "\u0005(u\u000b\u000f\u0014+{\u0019\u0016_0a"
		// @040: invokestatic game.C_100277_nc.func_106693_z(java.lang.String)char[]
		// @043: invokestatic game.C_100277_nc.func_106691_z(char[])java.lang.String
		// @046: aastore
		// @047: dup
		// @048: bipush 6 (0x06)
		// @04A: ldc "\ni<D\u001f"
		// @04C: invokestatic game.C_100277_nc.func_106693_z(java.lang.String)char[]
		// @04F: invokestatic game.C_100277_nc.func_106691_z(char[])java.lang.String
		// @052: aastore
		// @053: dup
		// @054: bipush 7 (0x07)
		// @056: ldc "\u0016&\u007f\u000f\u000e\u00184f"
		// @058: invokestatic game.C_100277_nc.func_106693_z(java.lang.String)char[]
		// @05B: invokestatic game.C_100277_nc.func_106691_z(char[])java.lang.String
		// @05E: aastore
		// @05F: dup
		// @060: bipush 8 (0x08)
		// @062: ldc "\u00047v\u000b\u0016\u0014+{\u0004\t\u0002"
		// @064: invokestatic game.C_100277_nc.func_106693_z(java.lang.String)char[]
		// @067: invokestatic game.C_100277_nc.func_106691_z(char[])java.lang.String
		// @06A: aastore
		// @06B: dup
		// @06C: bipush 9 (0x09)
		// @06E: ldc "\u0005\"`\u0007\u0011_0a"
		// @070: invokestatic game.C_100277_nc.func_106693_z(java.lang.String)char[]
		// @073: invokestatic game.C_100277_nc.func_106691_z(char[])java.lang.String
		// @076: aastore
		// @077: dup
		// @078: bipush 10 (0x0A)
		// @07A: ldc "\u001e7f\u0003\r\u001f4"
		// @07C: invokestatic game.C_100277_nc.func_106693_z(java.lang.String)char[]
		// @07F: invokestatic game.C_100277_nc.func_106691_z(char[])java.lang.String
		// @082: aastore
		// @083: dup
		// @084: bipush 11 (0x0B)
		// @086: ldc "\u0002\"`\u001c\u0007\u0003+{\u0019\u0016"
		// @088: invokestatic game.C_100277_nc.func_106693_z(java.lang.String)char[]
		// @08B: invokestatic game.C_100277_nc.func_106691_z(char[])java.lang.String
		// @08E: aastore
		// @08F: dup
		// @090: bipush 12 (0x0C)
		// @092: ldc "\u00015{\u001c\u0003\u0012>"
		// @094: invokestatic game.C_100277_nc.func_106693_z(java.lang.String)char[]
		// @097: invokestatic game.C_100277_nc.func_106691_z(char[])java.lang.String
		// @09A: aastore
		// @09B: dup
		// @09C: bipush 13 (0x0D)
		// @09E: ldc "\u0019(\u007f\u000fL\u00064"
		// @0A0: invokestatic game.C_100277_nc.func_106693_z(java.lang.String)char[]
		// @0A3: invokestatic game.C_100277_nc.func_106691_z(char[])java.lang.String
		// @0A6: aastore
		// @0A7: dup
		// @0A8: bipush 14 (0x0E)
		// @0AA: ldc "\u001f$<,J"
		// @0AC: invokestatic game.C_100277_nc.func_106693_z(java.lang.String)char[]
		// @0AF: invokestatic game.C_100277_nc.func_106691_z(char[])java.lang.String
		// @0B2: aastore
		// @0B3: dup
		// @0B4: bipush 15 (0x0F)
		// @0B6: ldc "\u0005(a\u000f\u0010\u0007\"`\u0006\u000b\u00023<\u001d\u0011"
		// @0B8: invokestatic game.C_100277_nc.func_106693_z(java.lang.String)char[]
		// @0BB: invokestatic game.C_100277_nc.func_106691_z(char[])java.lang.String
		// @0BE: aastore
		// @0BF: dup
		// @0C0: bipush 16 (0x10)
		// @0C2: ldc "\u001f2~\u0006"
		// @0C4: invokestatic game.C_100277_nc.func_106693_z(java.lang.String)char[]
		// @0C7: invokestatic game.C_100277_nc.func_106691_z(char[])java.lang.String
		// @0CA: aastore
		// @0CB: dup
		// @0CC: bipush 17 (0x11)
		// @0CE: ldc "\u0019(\u007f\u000f"
		// @0D0: invokestatic game.C_100277_nc.func_106693_z(java.lang.String)char[]
		// @0D3: invokestatic game.C_100277_nc.func_106691_z(char[])java.lang.String
		// @0D6: aastore
		// @0D7: dup
		// @0D8: bipush 18 (0x12)
		// @0DA: ldc "\u001e7f\u0003\r\u001f4<\u001d\u0011"
		// @0DC: invokestatic game.C_100277_nc.func_106693_z(java.lang.String)char[]
		// @0DF: invokestatic game.C_100277_nc.func_106691_z(char[])java.lang.String
		// @0E2: aastore
		// @0E3: dup
		// @0E4: bipush 19 (0x13)
		// @0E6: ldc "\u0005\"`\u0007\u0011"
		// @0E8: invokestatic game.C_100277_nc.func_106693_z(java.lang.String)char[]
		// @0EB: invokestatic game.C_100277_nc.func_106691_z(char[])java.lang.String
		// @0EE: aastore
		// @0EF: dup
		// @0F0: bipush 20 (0x14)
		// @0F2: ldc "\u001f$</J"
		// @0F4: invokestatic game.C_100277_nc.func_106693_z(java.lang.String)char[]
		// @0F7: invokestatic game.C_100277_nc.func_106691_z(char[])java.lang.String
		// @0FA: aastore
		// @0FB: dup
		// @0FC: bipush 21 (0x15)
		// @0FE: ldc "\u001f$<)J"
		// @100: invokestatic game.C_100277_nc.func_106693_z(java.lang.String)char[]
		// @103: invokestatic game.C_100277_nc.func_106691_z(char[])java.lang.String
		// @106: aastore
		// @107: putstatic java.lang.String[] game.C_100277_nc.field_106719_X
		// @10A: ldc "?("
		// @10C: invokestatic game.C_100277_nc.func_106693_z(java.lang.String)char[]
		// @10F: invokestatic game.C_100277_nc.func_106691_z(char[])java.lang.String
		// @112: putstatic java.lang.String game.C_100277_nc.field_106736_v
		// @115: sipush 10000 (0x2710)
		// @118: anewarray game.C_100059_df
		// @11B: putstatic game.C_100059_df[] game.C_100277_nc.field_106737_u
		// @11E: iconst_0
		// @11F: istore_0
		// @120: sipush -10001 (0xD8EF)
		// @123: iload_0
		// @124: iconst_m1
		// @125: ixor
		// @126: if_icmpge @13C
		// @129: getstatic game.C_100059_df[] game.C_100277_nc.field_106737_u
		// @12C: iload_0
		// @12D: new game.C_100059_df
		// @130: dup
		// @131: invokespecial game.C_100059_df.<init>()void
		// @134: aastore
		// @135: iinc #0 +1
		// @138: goto @120
		// @13B: athrow
		// @13C: return
	}
	
	private static char[] func_106693_z(String arg0)
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
		// @0E: bipush 98 (0x62)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_106691_z(char[] arg0)
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
		// @30: bipush 113 (0x71)
		// @32: goto @46
		// @35: bipush 71 (0x47)
		// @37: goto @46
		// @3A: bipush 18 (0x12)
		// @3C: goto @46
		// @3F: bipush 106 (0x6A)
		// @41: goto @46
		// @44: bipush 98 (0x62)
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
