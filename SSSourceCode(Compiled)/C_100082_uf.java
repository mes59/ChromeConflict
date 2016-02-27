package game;

final class C_100082_uf implements C_100326_ic
{
	private int field_100371_e;
	private C_100112_r field_100368_f;
	private int field_100377_i;
	static boolean field_100369_g;
	static C_100130_tf field_100374_a;
	static int field_100370_d;
	static String field_100372_b;
	static boolean field_100376_h;
	static int[] field_100373_c;
	private static final String[] field_100375_z;
	
	static final void func_100367_a(int arg0, int arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore_3
		// @04: iload_1
		// @05: ldc 2188450 (0x2164a2)
		// @07: if_icmpeq @19
		// @0A: bipush -4 (0xFC)
		// @0C: aconst_null
		// @0D: checkcast game.C_100075_uj
		// @10: bipush -47 (0xD1)
		// @12: invokestatic game.C_100082_uf.func_100363_a(int, game.C_100075_uj, int)void
		// @15: goto @19
		// @18: athrow
		// @19: getstatic game.C_100202_qi game.C_100291_jj.field_106877_c
		// @1C: iload_1
		// @1D: ldc 2188541 (0x2164fd)
		// @1F: ixor
		// @20: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @23: checkcast game.C_100131_te
		// @26: astore_2
		// @27: aload_2
		// @28: ifnull @4A
		// @2B: aload_2
		// @2C: bipush -78 (0xB2)
		// @2E: iload_0
		// @2F: invokestatic game.C_100012_fh.func_100503_a(game.C_100131_te, byte, int)void
		// @32: getstatic game.C_100202_qi game.C_100291_jj.field_106877_c
		// @35: bipush 89 (0x59)
		// @37: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @3A: checkcast game.C_100131_te
		// @3D: astore_2
		// @3E: iload_3
		// @3F: ifne @55
		// @42: iload_3
		// @43: ifeq @27
		// @46: goto @4A
		// @49: athrow
		// @4A: getstatic game.C_100202_qi game.C_100191_rg.field_100848_j
		// @4D: iload_1
		// @4E: ldc -2188402 (0xffde9b8e)
		// @50: iadd
		// @51: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @54: astore_2
		// @55: aconst_null
		// @56: aload_2
		// @57: if_acmpeq @75
		// @5A: iload_0
		// @5B: bipush -91 (0xA5)
		// @5D: invokestatic game.C_100129_tg.func_102740_b(int, byte)void
		// @60: getstatic game.C_100202_qi game.C_100191_rg.field_100848_j
		// @63: bipush 97 (0x61)
		// @65: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @68: astore_2
		// @69: iload_3
		// @6A: ifne @A2
		// @6D: iload_3
		// @6E: ifeq @55
		// @71: goto @75
		// @74: athrow
		// @75: goto @A2
		// @78: astore_2
		// @79: aload_2
		// @7A: new java.lang.StringBuilder
		// @7D: dup
		// @7E: invokespecial java.lang.StringBuilder.<init>()void
		// @81: getstatic java.lang.String[] game.C_100082_uf.field_100375_z
		// @84: iconst_2
		// @85: aaload
		// @86: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @89: iload_0
		// @8A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8D: bipush 44 (0x2C)
		// @8F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @92: iload_1
		// @93: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @96: bipush 41 (0x29)
		// @98: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @9E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @A1: athrow
		// @A2: return
	}
	
	public final void func_100362_a(boolean arg0, int arg1, int arg2, int arg3, C_100336_im arg4)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #11
		// @005: aload #5
		// @007: getfield boolean game.C_100336_im.field_102539_j
		// @00A: ifne @021
		// @00D: aload #5
		// @00F: bipush 21 (0x15)
		// @011: invokevirtual game.C_100336_im.func_102515_d(byte)boolean
		// @014: ifne @021
		// @017: goto @01B
		// @01A: athrow
		// @01B: ldc 2188450 (0x2164a2)
		// @01D: goto @023
		// @020: athrow
		// @021: ldc 3249872 (0x3196d0)
		// @023: istore #6
		// @025: iload_2
		// @026: sipush -26568 (0x9838)
		// @029: if_icmpeq @036
		// @02C: aload_0
		// @02D: bipush -34 (0xDE)
		// @02F: putfield int game.C_100082_uf.field_100377_i
		// @032: goto @036
		// @035: athrow
		// @036: aload_0
		// @037: getfield game.C_100112_r game.C_100082_uf.field_100368_f
		// @03A: new java.lang.StringBuilder
		// @03D: dup
		// @03E: invokespecial java.lang.StringBuilder.<init>()void
		// @041: getstatic java.lang.String[] game.C_100082_uf.field_100375_z
		// @044: bipush 7 (0x07)
		// @046: aaload
		// @047: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @04A: iload #6
		// @04C: bipush 16 (0x10)
		// @04E: invokestatic java.lang.Integer.toString(int, int)java.lang.String
		// @051: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @054: ldc ">"
		// @056: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @059: aload #5
		// @05B: getfield java.lang.String game.C_100336_im.field_102534_C
		// @05E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @061: getstatic java.lang.String[] game.C_100082_uf.field_100375_z
		// @064: bipush 8 (0x08)
		// @066: aaload
		// @067: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @06A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @06D: iload_3
		// @06E: aload #5
		// @070: getfield int game.C_100336_im.field_102538_m
		// @073: ineg
		// @074: isub
		// @075: iload #4
		// @077: aload #5
		// @079: getfield int game.C_100336_im.field_102541_w
		// @07C: ineg
		// @07D: isub
		// @07E: aload #5
		// @080: getfield int game.C_100336_im.field_102537_l
		// @083: aload #5
		// @085: getfield int game.C_100336_im.field_102544_t
		// @088: iload #6
		// @08A: iconst_m1
		// @08B: aload_0
		// @08C: getfield int game.C_100082_uf.field_100371_e
		// @08F: aload_0
		// @090: getfield int game.C_100082_uf.field_100377_i
		// @093: aload_0
		// @094: getfield game.C_100112_r game.C_100082_uf.field_100368_f
		// @097: getfield int game.C_100112_r.field_101763_H
		// @09A: aload_0
		// @09B: getfield game.C_100112_r game.C_100082_uf.field_100368_f
		// @09E: getfield int game.C_100112_r.field_101772_Q
		// @0A1: iadd
		// @0A2: invokevirtual game.C_100112_r.func_101729_a(java.lang.String, int, int, int, int, int, int, int, int, int)int
		// @0A5: pop
		// @0A6: aload #5
		// @0A8: bipush 106 (0x6A)
		// @0AA: invokevirtual game.C_100336_im.func_102515_d(byte)boolean
		// @0AD: ifeq @172
		// @0B0: aload_0
		// @0B1: getfield game.C_100112_r game.C_100082_uf.field_100368_f
		// @0B4: aload #5
		// @0B6: getfield java.lang.String game.C_100336_im.field_102534_C
		// @0B9: invokevirtual game.C_100112_r.func_101739_b(java.lang.String)int
		// @0BC: istore #7
		// @0BE: aload_0
		// @0BF: getfield game.C_100112_r game.C_100082_uf.field_100368_f
		// @0C2: getfield int game.C_100112_r.field_101763_H
		// @0C5: aload_0
		// @0C6: getfield game.C_100112_r game.C_100082_uf.field_100368_f
		// @0C9: getfield int game.C_100112_r.field_101772_Q
		// @0CC: iadd
		// @0CD: istore #8
		// @0CF: aload #5
		// @0D1: getfield int game.C_100336_im.field_102538_m
		// @0D4: iload_3
		// @0D5: iadd
		// @0D6: istore #9
		// @0D8: iload #4
		// @0DA: aload #5
		// @0DC: getfield int game.C_100336_im.field_102541_w
		// @0DF: ineg
		// @0E0: isub
		// @0E1: istore #10
		// @0E3: aload_0
		// @0E4: getfield int game.C_100082_uf.field_100371_e
		// @0E7: iconst_2
		// @0E8: if_icmpne @0FD
		// @0EB: iload #9
		// @0ED: aload #5
		// @0EF: getfield int game.C_100336_im.field_102537_l
		// @0F2: iload #7
		// @0F4: isub
		// @0F5: iadd
		// @0F6: istore #9
		// @0F8: iload #11
		// @0FA: ifeq @120
		// @0FD: bipush -2 (0xFE)
		// @0FF: aload_0
		// @100: getfield int game.C_100082_uf.field_100371_e
		// @103: iconst_m1
		// @104: ixor
		// @105: if_icmpeq @110
		// @108: goto @10C
		// @10B: athrow
		// @10C: goto @120
		// @10F: athrow
		// @110: iload #9
		// @112: aload #5
		// @114: getfield int game.C_100336_im.field_102537_l
		// @117: iload #7
		// @119: isub
		// @11A: ldc 1541697537 (0x5be47001)
		// @11C: ishr
		// @11D: iadd
		// @11E: istore #9
		// @120: aload_0
		// @121: getfield int game.C_100082_uf.field_100377_i
		// @124: iconst_2
		// @125: if_icmpne @13B
		// @128: iload #10
		// @12A: iload #8
		// @12C: ineg
		// @12D: aload #5
		// @12F: getfield int game.C_100336_im.field_102544_t
		// @132: iadd
		// @133: iadd
		// @134: istore #10
		// @136: iload #11
		// @138: ifeq @15C
		// @13B: iconst_1
		// @13C: aload_0
		// @13D: getfield int game.C_100082_uf.field_100377_i
		// @140: if_icmpeq @14B
		// @143: goto @147
		// @146: athrow
		// @147: goto @15C
		// @14A: athrow
		// @14B: iload #10
		// @14D: aload #5
		// @14F: getfield int game.C_100336_im.field_102544_t
		// @152: iload #8
		// @154: ineg
		// @155: iadd
		// @156: ldc -1405994527 (0xac3239e1)
		// @158: ishr
		// @159: iadd
		// @15A: istore #10
		// @15C: iload #8
		// @15E: bipush -2 (0xFE)
		// @160: iload #9
		// @162: iadd
		// @163: iload_2
		// @164: ldc 38102 (0x94d6)
		// @166: iadd
		// @167: iconst_4
		// @168: iload #7
		// @16A: iadd
		// @16B: iload #10
		// @16D: iconst_2
		// @16E: iadd
		// @16F: invokestatic game.C_100010_ff.func_103692_a(int, int, int, int, int)void
		// @172: goto @1D0
		// @175: astore #6
		// @177: aload #6
		// @179: new java.lang.StringBuilder
		// @17C: dup
		// @17D: invokespecial java.lang.StringBuilder.<init>()void
		// @180: getstatic java.lang.String[] game.C_100082_uf.field_100375_z
		// @183: bipush 6 (0x06)
		// @185: aaload
		// @186: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @189: iload_1
		// @18A: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @18D: bipush 44 (0x2C)
		// @18F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @192: iload_2
		// @193: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @196: bipush 44 (0x2C)
		// @198: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @19B: iload_3
		// @19C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @19F: bipush 44 (0x2C)
		// @1A1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1A4: iload #4
		// @1A6: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1A9: bipush 44 (0x2C)
		// @1AB: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1AE: aload #5
		// @1B0: ifnull @1BC
		// @1B3: getstatic java.lang.String[] game.C_100082_uf.field_100375_z
		// @1B6: iconst_5
		// @1B7: aaload
		// @1B8: goto @1C1
		// @1BB: athrow
		// @1BC: getstatic java.lang.String[] game.C_100082_uf.field_100375_z
		// @1BF: iconst_3
		// @1C0: aaload
		// @1C1: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1C4: bipush 41 (0x29)
		// @1C6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1C9: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @1CC: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @1CF: athrow
		// @1D0: return
	}
	
	public C_100082_uf()
	{
		// @00: aload_0
		// @01: invokespecial java.lang.Object.<init>()void
		// @04: aload_0
		// @05: iconst_1
		// @06: putfield int game.C_100082_uf.field_100377_i
		// @09: aload_0
		// @0A: iconst_1
		// @0B: putfield int game.C_100082_uf.field_100371_e
		// @0E: aload_0
		// @0F: getstatic game.C_100112_r game.C_100230_of.field_106205_g
		// @12: putfield game.C_100112_r game.C_100082_uf.field_100368_f
		// @15: goto @23
		// @18: astore_1
		// @19: aload_1
		// @1A: getstatic java.lang.String[] game.C_100082_uf.field_100375_z
		// @1D: iconst_0
		// @1E: aaload
		// @1F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @22: athrow
		// @23: return
	}
	
	public static void func_100365_a(byte arg0)
	{
		// @00: iload_0
		// @01: bipush -87 (0xA9)
		// @03: if_icmpeq @0F
		// @06: bipush -92 (0xA4)
		// @08: invokestatic game.C_100082_uf.func_100365_a(byte)void
		// @0B: goto @0F
		// @0E: athrow
		// @0F: aconst_null
		// @10: putstatic java.lang.String game.C_100082_uf.field_100372_b
		// @13: aconst_null
		// @14: putstatic int[] game.C_100082_uf.field_100373_c
		// @17: aconst_null
		// @18: putstatic game.C_100130_tf game.C_100082_uf.field_100374_a
		// @1B: goto @3F
		// @1E: astore_1
		// @1F: aload_1
		// @20: new java.lang.StringBuilder
		// @23: dup
		// @24: invokespecial java.lang.StringBuilder.<init>()void
		// @27: getstatic java.lang.String[] game.C_100082_uf.field_100375_z
		// @2A: iconst_1
		// @2B: aaload
		// @2C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2F: iload_0
		// @30: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @33: bipush 41 (0x29)
		// @35: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @38: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3E: athrow
		// @3F: return
	}
	
	static final void func_100363_a(int arg0, C_100075_uj arg1, int arg2)
	{
		// @00: iload_0
		// @01: iconst_m1
		// @02: if_icmpeq @06
		// @05: return
		// @06: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @09: astore_3
		// @0A: aload_3
		// @0B: iload_2
		// @0C: bipush 121 (0x79)
		// @0E: invokevirtual game.C_100278_nd.func_101189_h(int, int)void
		// @11: aload_3
		// @12: dup
		// @13: getfield int game.C_100278_nd.field_101177_n
		// @16: iconst_1
		// @17: iadd
		// @18: putfield int game.C_100278_nd.field_101177_n
		// @1B: aload_3
		// @1C: getfield int game.C_100278_nd.field_101177_n
		// @1F: istore #4
		// @21: aload_3
		// @22: sipush 7838 (0x1E9E)
		// @25: iconst_1
		// @26: invokevirtual game.C_100278_nd.func_101169_f(int, int)void
		// @29: aload_3
		// @2A: iload_0
		// @2B: sipush 7839 (0x1E9F)
		// @2E: iadd
		// @2F: aload_1
		// @30: getfield int game.C_100075_uj.field_100660_p
		// @33: invokevirtual game.C_100278_nd.func_101169_f(int, int)void
		// @36: aload_3
		// @37: sipush 7838 (0x1E9E)
		// @3A: aload_1
		// @3B: getfield int game.C_100075_uj.field_100649_l
		// @3E: invokevirtual game.C_100278_nd.func_101169_f(int, int)void
		// @41: aload_3
		// @42: aload_1
		// @43: getfield int game.C_100075_uj.field_100662_x
		// @46: bipush 115 (0x73)
		// @48: invokevirtual game.C_100278_nd.func_101154_d(int, int)void
		// @4B: aload_3
		// @4C: aload_1
		// @4D: getfield int game.C_100075_uj.field_100648_o
		// @50: bipush 110 (0x6E)
		// @52: invokevirtual game.C_100278_nd.func_101154_d(int, int)void
		// @55: aload_3
		// @56: aload_1
		// @57: getfield int game.C_100075_uj.field_100652_k
		// @5A: bipush 88 (0x58)
		// @5C: invokevirtual game.C_100278_nd.func_101154_d(int, int)void
		// @5F: aload_3
		// @60: aload_1
		// @61: getfield int game.C_100075_uj.field_100658_r
		// @64: bipush -125 (0x83)
		// @66: invokevirtual game.C_100278_nd.func_101154_d(int, int)void
		// @69: aload_3
		// @6A: iload #4
		// @6C: sipush -16384 (0xC000)
		// @6F: invokevirtual game.C_100278_nd.func_101157_b(int, int)int
		// @72: pop
		// @73: aload_3
		// @74: iload #4
		// @76: ineg
		// @77: aload_3
		// @78: getfield int game.C_100278_nd.field_101177_n
		// @7B: iadd
		// @7C: bipush -110 (0x92)
		// @7E: invokevirtual game.C_100278_nd.func_101139_c(int, byte)void
		// @81: goto @C9
		// @84: astore_3
		// @85: aload_3
		// @86: new java.lang.StringBuilder
		// @89: dup
		// @8A: invokespecial java.lang.StringBuilder.<init>()void
		// @8D: getstatic java.lang.String[] game.C_100082_uf.field_100375_z
		// @90: bipush 9 (0x09)
		// @92: aaload
		// @93: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @96: iload_0
		// @97: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @9A: bipush 44 (0x2C)
		// @9C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9F: aload_1
		// @A0: ifnull @AC
		// @A3: getstatic java.lang.String[] game.C_100082_uf.field_100375_z
		// @A6: iconst_5
		// @A7: aaload
		// @A8: goto @B1
		// @AB: athrow
		// @AC: getstatic java.lang.String[] game.C_100082_uf.field_100375_z
		// @AF: iconst_3
		// @B0: aaload
		// @B1: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @B4: bipush 44 (0x2C)
		// @B6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B9: iload_2
		// @BA: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @BD: bipush 41 (0x29)
		// @BF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C2: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @C5: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @C8: athrow
		// @C9: return
	}
	
	C_100082_uf(C_100112_r arg0, int arg1, int arg2)
	{
		// @00: aload_0
		// @01: invokespecial java.lang.Object.<init>()void
		// @04: aload_0
		// @05: aload_1
		// @06: putfield game.C_100112_r game.C_100082_uf.field_100368_f
		// @09: aload_0
		// @0A: iload_2
		// @0B: putfield int game.C_100082_uf.field_100371_e
		// @0E: aload_0
		// @0F: iload_3
		// @10: putfield int game.C_100082_uf.field_100377_i
		// @13: goto @5C
		// @16: astore #4
		// @18: aload #4
		// @1A: new java.lang.StringBuilder
		// @1D: dup
		// @1E: invokespecial java.lang.StringBuilder.<init>()void
		// @21: getstatic java.lang.String[] game.C_100082_uf.field_100375_z
		// @24: iconst_4
		// @25: aaload
		// @26: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @29: aload_1
		// @2A: ifnull @36
		// @2D: getstatic java.lang.String[] game.C_100082_uf.field_100375_z
		// @30: iconst_5
		// @31: aaload
		// @32: goto @3B
		// @35: athrow
		// @36: getstatic java.lang.String[] game.C_100082_uf.field_100375_z
		// @39: iconst_3
		// @3A: aaload
		// @3B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3E: bipush 44 (0x2C)
		// @40: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @43: iload_2
		// @44: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @47: bipush 44 (0x2C)
		// @49: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4C: iload_3
		// @4D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @50: bipush 41 (0x29)
		// @52: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @55: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @58: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @5B: athrow
		// @5C: return
	}
	
	static
	{
		// @00: bipush 10 (0x0A)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "14p\u0010\u001b*;*\u0012Zm"
		// @09: invokestatic game.C_100082_uf.func_100366_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100082_uf.func_100364_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "14pnZ"
		// @14: invokestatic game.C_100082_uf.func_100366_z(java.lang.String)char[]
		// @17: invokestatic game.C_100082_uf.func_100364_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "14poZ"
		// @1F: invokestatic game.C_100082_uf.func_100366_z(java.lang.String)char[]
		// @22: invokestatic game.C_100082_uf.func_100364_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "*'2@"
		// @2A: invokestatic game.C_100082_uf.func_100366_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100082_uf.func_100364_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "14p\u0010\u001b*;*\u0012Z"
		// @35: invokestatic game.C_100082_uf.func_100366_z(java.lang.String)char[]
		// @38: invokestatic game.C_100082_uf.func_100364_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "?|p\u0002\u000f"
		// @40: invokestatic game.C_100082_uf.func_100366_z(java.lang.String)char[]
		// @43: invokestatic game.C_100082_uf.func_100364_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "14phZ"
		// @4C: invokestatic game.C_100082_uf.func_100366_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100082_uf.func_100364_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "x'c"
		// @58: invokestatic game.C_100082_uf.func_100366_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100082_uf.func_100364_z(char[])java.lang.String
		// @5E: aastore
		// @5F: dup
		// @60: bipush 8 (0x08)
		// @62: ldc "x}+\u0012"
		// @64: invokestatic game.C_100082_uf.func_100366_z(java.lang.String)char[]
		// @67: invokestatic game.C_100082_uf.func_100364_z(char[])java.lang.String
		// @6A: aastore
		// @6B: dup
		// @6C: bipush 9 (0x09)
		// @6E: ldc "14pmZ"
		// @70: invokestatic game.C_100082_uf.func_100366_z(java.lang.String)char[]
		// @73: invokestatic game.C_100082_uf.func_100364_z(char[])java.lang.String
		// @76: aastore
		// @77: putstatic java.lang.String[] game.C_100082_uf.field_100375_z
		// @7A: ldc "\r<(E\u0006!r3C\u0000!r.@\u0013=7,_^d=,\u000c\u0013(&;^\u001c%&7Z\u0017(+~X\u0000=r=D\u0013*57B\u0015d&6IRcn{\u001cLcr-I\u00060;0K\\"
		// @7C: invokestatic game.C_100082_uf.func_100366_z(java.lang.String)char[]
		// @7F: invokestatic game.C_100082_uf.func_100364_z(char[])java.lang.String
		// @82: putstatic java.lang.String game.C_100082_uf.field_100372_b
		// @85: new game.C_100130_tf
		// @88: dup
		// @89: invokespecial game.C_100130_tf.<init>()void
		// @8C: putstatic game.C_100130_tf game.C_100082_uf.field_100374_a
		// @8F: sipush 8192 (0x2000)
		// @92: newarray int[]
		// @94: putstatic int[] game.C_100082_uf.field_100373_c
		// @97: return
	}
	
	private static char[] func_100366_z(String arg0)
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
		// @0E: bipush 114 (0x72)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_100364_z(char[] arg0)
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
		// @35: bipush 82 (0x52)
		// @37: goto @46
		// @3A: bipush 94 (0x5E)
		// @3C: goto @46
		// @3F: bipush 44 (0x2C)
		// @41: goto @46
		// @44: bipush 114 (0x72)
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
