package game;

final class C_100200_ba
{
	static int field_105850_e;
	static String field_105853_a;
	static C_100302_ka field_105847_f;
	static C_100037_wb[] field_105851_b;
	static int field_105852_c;
	static String field_105848_g;
	static int field_105849_d;
	private static final String[] field_105854_z;
	
	static final void func_105845_a(int arg0, byte arg1)
	{
		// @00: ldc2_w 1000000000
		// @03: iload_0
		// @04: i2l
		// @05: ldiv
		// @06: putstatic long game.C_100042_we.field_104142_i
		// @09: iload_1
		// @0A: bipush 91 (0x5B)
		// @0C: if_icmpgt @16
		// @0F: bipush 66 (0x42)
		// @11: bipush 116 (0x74)
		// @13: invokestatic game.C_100200_ba.func_105845_a(int, byte)void
		// @16: goto @44
		// @19: astore_2
		// @1A: aload_2
		// @1B: new java.lang.StringBuilder
		// @1E: dup
		// @1F: invokespecial java.lang.StringBuilder.<init>()void
		// @22: getstatic java.lang.String[] game.C_100200_ba.field_105854_z
		// @25: bipush 6 (0x06)
		// @27: aaload
		// @28: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2B: iload_0
		// @2C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2F: bipush 44 (0x2C)
		// @31: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @34: iload_1
		// @35: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @38: bipush 41 (0x29)
		// @3A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @40: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @43: athrow
		// @44: return
	}
	
	static final void func_105842_a(byte arg0)
	{
		// @00: iload_0
		// @01: bipush -77 (0xB3)
		// @03: if_icmpeq @11
		// @06: aconst_null
		// @07: checkcast java.lang.String
		// @0A: putstatic java.lang.String game.C_100200_ba.field_105848_g
		// @0D: goto @11
		// @10: athrow
		// @11: getstatic game.C_100202_qi game.C_100189_ri.field_105754_b
		// @14: iload_0
		// @15: ldc 37168 (0x9130)
		// @17: iadd
		// @18: invokevirtual game.C_100202_qi.func_105908_a(int)game.C_100158_da
		// @1B: checkcast game.C_100045_vj
		// @1E: astore_1
		// @1F: aload_1
		// @20: ifnonnull @2C
		// @23: new java.lang.IllegalStateException
		// @26: dup
		// @27: invokespecial java.lang.IllegalStateException.<init>()void
		// @2A: athrow
		// @2B: athrow
		// @2C: aload_1
		// @2D: getfield int[] game.C_100045_vj.field_100617_q
		// @30: aload_1
		// @31: getfield int game.C_100045_vj.field_100610_j
		// @34: aload_1
		// @35: getfield int game.C_100045_vj.field_100615_s
		// @38: invokestatic game.C_100196_rb.func_105808_a(int[], int, int)void
		// @3B: aload_1
		// @3C: getfield int game.C_100045_vj.field_100606_n
		// @3F: aload_1
		// @40: getfield int game.C_100045_vj.field_100613_u
		// @43: aload_1
		// @44: getfield int game.C_100045_vj.field_100614_t
		// @47: aload_1
		// @48: getfield int game.C_100045_vj.field_100618_p
		// @4B: invokestatic game.C_100196_rb.func_105815_h(int, int, int, int)void
		// @4E: aload_1
		// @4F: aconst_null
		// @50: putfield int[] game.C_100045_vj.field_100617_q
		// @53: getstatic game.C_100202_qi game.C_100302_ka.field_101828_Qb
		// @56: bipush 127 (0x7F)
		// @58: aload_1
		// @59: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @5C: goto @81
		// @5F: astore_1
		// @60: aload_1
		// @61: new java.lang.StringBuilder
		// @64: dup
		// @65: invokespecial java.lang.StringBuilder.<init>()void
		// @68: getstatic java.lang.String[] game.C_100200_ba.field_105854_z
		// @6B: bipush 7 (0x07)
		// @6D: aaload
		// @6E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @71: iload_0
		// @72: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @75: bipush 41 (0x29)
		// @77: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @7D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @80: athrow
		// @81: return
	}
	
	public static void func_105840_a(int arg0)
	{
		// @00: iload_0
		// @01: bipush 57 (0x39)
		// @03: if_icmpgt @0F
		// @06: bipush 87 (0x57)
		// @08: putstatic int game.C_100200_ba.field_105852_c
		// @0B: goto @0F
		// @0E: athrow
		// @0F: aconst_null
		// @10: putstatic java.lang.String game.C_100200_ba.field_105853_a
		// @13: aconst_null
		// @14: putstatic java.lang.String game.C_100200_ba.field_105848_g
		// @17: aconst_null
		// @18: putstatic game.C_100037_wb[] game.C_100200_ba.field_105851_b
		// @1B: aconst_null
		// @1C: putstatic game.C_100302_ka game.C_100200_ba.field_105847_f
		// @1F: goto @43
		// @22: astore_1
		// @23: aload_1
		// @24: new java.lang.StringBuilder
		// @27: dup
		// @28: invokespecial java.lang.StringBuilder.<init>()void
		// @2B: getstatic java.lang.String[] game.C_100200_ba.field_105854_z
		// @2E: iconst_0
		// @2F: aaload
		// @30: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @33: iload_0
		// @34: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @37: bipush 41 (0x29)
		// @39: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @42: athrow
		// @43: return
	}
	
	static final void func_105838_b(int arg0, int arg1)
	{
		// @00: iload_1
		// @01: bipush -5 (0xFB)
		// @03: if_icmplt @07
		// @06: return
		// @07: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @0A: astore_2
		// @0B: aload_2
		// @0C: iload_0
		// @0D: bipush 109 (0x6D)
		// @0F: invokevirtual game.C_100278_nd.func_101189_h(int, int)void
		// @12: aload_2
		// @13: dup
		// @14: getfield int game.C_100278_nd.field_101177_n
		// @17: iconst_1
		// @18: iadd
		// @19: putfield int game.C_100278_nd.field_101177_n
		// @1C: aload_2
		// @1D: getfield int game.C_100278_nd.field_101177_n
		// @20: istore_3
		// @21: aload_2
		// @22: sipush 7838 (0x1E9E)
		// @25: iconst_5
		// @26: invokevirtual game.C_100278_nd.func_101169_f(int, int)void
		// @29: aload_2
		// @2A: sipush 7838 (0x1E9E)
		// @2D: getstatic game.C_100211_qd game.C_100068_vc.field_104342_d
		// @30: getfield int game.C_100211_qd.field_102160_Zb
		// @33: invokevirtual game.C_100278_nd.func_101169_f(int, int)void
		// @36: getstatic game.C_100211_qd game.C_100068_vc.field_104342_d
		// @39: getfield int game.C_100211_qd.field_102133_Fc
		// @3C: ldc 715855814 (0x2aab17c6)
		// @3E: ishl
		// @3F: getstatic game.C_100211_qd game.C_100068_vc.field_104342_d
		// @42: getfield int game.C_100211_qd.field_102159_sc
		// @45: iadd
		// @46: istore #4
		// @48: aload_2
		// @49: sipush 7838 (0x1E9E)
		// @4C: iload #4
		// @4E: invokevirtual game.C_100278_nd.func_101169_f(int, int)void
		// @51: aload_2
		// @52: getstatic game.C_100211_qd game.C_100068_vc.field_104342_d
		// @55: getfield byte[] game.C_100211_qd.field_102165_jc
		// @58: iconst_0
		// @59: getstatic game.C_100211_qd game.C_100068_vc.field_104342_d
		// @5C: getfield byte[] game.C_100211_qd.field_102165_jc
		// @5F: arraylength
		// @60: bipush -120 (0x88)
		// @62: invokevirtual game.C_100278_nd.func_101165_b(byte[], int, int, int)void
		// @65: aload_2
		// @66: iload_3
		// @67: ineg
		// @68: aload_2
		// @69: getfield int game.C_100278_nd.field_101177_n
		// @6C: iadd
		// @6D: bipush -124 (0x84)
		// @6F: invokevirtual game.C_100278_nd.func_101139_c(int, byte)void
		// @72: goto @9F
		// @75: astore_2
		// @76: aload_2
		// @77: new java.lang.StringBuilder
		// @7A: dup
		// @7B: invokespecial java.lang.StringBuilder.<init>()void
		// @7E: getstatic java.lang.String[] game.C_100200_ba.field_105854_z
		// @81: iconst_5
		// @82: aaload
		// @83: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @86: iload_0
		// @87: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8A: bipush 44 (0x2C)
		// @8C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8F: iload_1
		// @90: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @93: bipush 41 (0x29)
		// @95: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @98: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @9B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @9E: athrow
		// @9F: return
	}
	
	static final boolean func_105839_a(int arg0, int[] arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore_3
		// @04: iload_0
		// @05: sipush 16586 (0x40CA)
		// @08: if_icmpeq @0D
		// @0B: iconst_1
		// @0C: ireturn
		// @0D: iconst_0
		// @0E: istore_2
		// @0F: iload_2
		// @10: iconst_m1
		// @11: ixor
		// @12: bipush -9 (0xF7)
		// @14: if_icmple @35
		// @17: aload_1
		// @18: iload_2
		// @19: iaload
		// @1A: iconst_m1
		// @1B: ixor
		// @1C: iload_3
		// @1D: ifne @36
		// @20: iconst_m1
		// @21: if_icmpne @2C
		// @24: goto @28
		// @27: athrow
		// @28: goto @2E
		// @2B: athrow
		// @2C: iconst_1
		// @2D: ireturn
		// @2E: iinc #2 +1
		// @31: iload_3
		// @32: ifeq @0F
		// @35: iconst_0
		// @36: ireturn
		// @37: astore_2
		// @38: aload_2
		// @39: new java.lang.StringBuilder
		// @3C: dup
		// @3D: invokespecial java.lang.StringBuilder.<init>()void
		// @40: getstatic java.lang.String[] game.C_100200_ba.field_105854_z
		// @43: iconst_3
		// @44: aaload
		// @45: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @48: iload_0
		// @49: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4C: bipush 44 (0x2C)
		// @4E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @51: aload_1
		// @52: ifnull @5E
		// @55: getstatic java.lang.String[] game.C_100200_ba.field_105854_z
		// @58: iconst_4
		// @59: aaload
		// @5A: goto @63
		// @5D: athrow
		// @5E: getstatic java.lang.String[] game.C_100200_ba.field_105854_z
		// @61: iconst_2
		// @62: aaload
		// @63: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @66: bipush 41 (0x29)
		// @68: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @6E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @71: athrow
	}
	
	static final void func_105844_a(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #21
		// @005: ldc 1021128 (0xf94c8)
		// @007: istore #6
		// @009: iload_2
		// @00A: sipush -1472 (0xFA40)
		// @00D: if_icmpeq @01C
		// @010: bipush 33 (0x21)
		// @012: bipush 42 (0x2A)
		// @014: invokestatic game.C_100200_ba.func_105846_a(int, int)int
		// @017: pop
		// @018: goto @01C
		// @01B: athrow
		// @01C: bipush -6 (0xFA)
		// @01E: iload #4
		// @020: iadd
		// @021: istore #7
		// @023: iload_0
		// @024: bipush -3 (0xFD)
		// @026: isub
		// @027: istore #8
		// @029: bipush -6 (0xFA)
		// @02B: iload #5
		// @02D: iadd
		// @02E: istore #9
		// @030: iload_1
		// @031: bipush -3 (0xFD)
		// @033: isub
		// @034: istore #10
		// @036: iload #7
		// @038: iload_3
		// @039: imul
		// @03A: sipush 12200 (0x2FA8)
		// @03D: idiv
		// @03E: istore #11
		// @040: getstatic game.C_100317_lb game.C_100311_le.field_104719_A
		// @043: getstatic java.lang.String[] game.C_100200_ba.field_105854_z
		// @046: bipush 8 (0x08)
		// @048: aaload
		// @049: iload_0
		// @04A: iload_1
		// @04B: iload #5
		// @04D: ineg
		// @04E: isub
		// @04F: ldc 1021128 (0xf94c8)
		// @051: iconst_m1
		// @052: invokevirtual game.C_100317_lb.func_101746_a(java.lang.String, int, int, int, int)void
		// @055: sipush 12200 (0x2FA8)
		// @058: iload_3
		// @059: if_icmplt @060
		// @05C: goto @068
		// @05F: athrow
		// @060: ldc 1044724 (0xff0f4)
		// @062: istore #6
		// @064: iload #7
		// @066: istore #11
		// @068: iload #8
		// @06A: iload #10
		// @06C: iload #11
		// @06E: iload #9
		// @070: iload #6
		// @072: invokestatic game.C_100196_rb.func_105782_i(int, int, int, int, int)void
		// @075: iload_0
		// @076: iload_1
		// @077: iload #4
		// @079: iload #5
		// @07B: ldc 4408131 (0x434343)
		// @07D: invokestatic game.C_100196_rb.func_105784_h(int, int, int, int, int)void
		// @080: iload_0
		// @081: sipush 6100 (0x17D4)
		// @084: iload #4
		// @086: imul
		// @087: sipush 12200 (0x2FA8)
		// @08A: idiv
		// @08B: iadd
		// @08C: iload_1
		// @08D: iload #5
		// @08F: ldc 4408131 (0x434343)
		// @091: invokestatic game.C_100196_rb.func_105778_a(int, int, int, int)void
		// @094: getstatic java.lang.String game.C_100017_wj.field_103820_a
		// @097: astore #12
		// @099: iload_0
		// @09A: iload #4
		// @09C: iconst_4
		// @09D: idiv
		// @09E: ineg
		// @09F: isub
		// @0A0: istore #13
		// @0A2: sipush 6100 (0x17D4)
		// @0A5: iload_3
		// @0A6: if_icmplt @0AF
		// @0A9: ldc 1400960 (0x156080)
		// @0AB: goto @0B1
		// @0AE: athrow
		// @0AF: ldc 4210752 (0x404040)
		// @0B1: istore #14
		// @0B3: iconst_0
		// @0B4: istore #15
		// @0B6: bipush -3 (0xFD)
		// @0B8: iload #15
		// @0BA: iconst_m1
		// @0BB: ixor
		// @0BC: if_icmpge @173
		// @0BF: iload #13
		// @0C1: iload #7
		// @0C3: iconst_4
		// @0C4: idiv
		// @0C5: isub
		// @0C6: iload_1
		// @0C7: iconst_4
		// @0C8: isub
		// @0C9: iconst_3
		// @0CA: iload #14
		// @0CC: invokestatic game.C_100196_rb.func_105778_a(int, int, int, int)void
		// @0CF: iload #7
		// @0D1: iconst_4
		// @0D2: idiv
		// @0D3: iload #13
		// @0D5: iadd
		// @0D6: bipush -4 (0xFC)
		// @0D8: iload_1
		// @0D9: iadd
		// @0DA: iconst_3
		// @0DB: iload #14
		// @0DD: invokestatic game.C_100196_rb.func_105778_a(int, int, int, int)void
		// @0E0: iload #7
		// @0E2: iconst_4
		// @0E3: idiv
		// @0E4: ineg
		// @0E5: iload #13
		// @0E7: iadd
		// @0E8: iload_1
		// @0E9: iconst_4
		// @0EA: isub
		// @0EB: iload #7
		// @0ED: iconst_2
		// @0EE: idiv
		// @0EF: iload #14
		// @0F1: invokestatic game.C_100196_rb.func_105807_g(int, int, int, int)void
		// @0F4: iload #7
		// @0F6: iconst_4
		// @0F7: idiv
		// @0F8: ineg
		// @0F9: iload #13
		// @0FB: iadd
		// @0FC: iconst_1
		// @0FD: iload_1
		// @0FE: iload #5
		// @100: ineg
		// @101: isub
		// @102: iadd
		// @103: iconst_2
		// @104: iload #14
		// @106: invokestatic game.C_100196_rb.func_105778_a(int, int, int, int)void
		// @109: iload #13
		// @10B: iload #7
		// @10D: iconst_4
		// @10E: idiv
		// @10F: iadd
		// @110: iload #5
		// @112: iload_1
		// @113: iadd
		// @114: iconst_m1
		// @115: isub
		// @116: iconst_2
		// @117: iload #14
		// @119: invokestatic game.C_100196_rb.func_105778_a(int, int, int, int)void
		// @11C: iload #13
		// @11E: iload #7
		// @120: iconst_4
		// @121: idiv
		// @122: isub
		// @123: iload #5
		// @125: iload_1
		// @126: iadd
		// @127: iconst_3
		// @128: iadd
		// @129: iload #7
		// @12B: iconst_2
		// @12C: idiv
		// @12D: iload #14
		// @12F: invokestatic game.C_100196_rb.func_105807_g(int, int, int, int)void
		// @132: getstatic game.C_100317_lb game.C_100311_le.field_104719_A
		// @135: aload #12
		// @137: iload #13
		// @139: bipush -5 (0xFB)
		// @13B: iload_1
		// @13C: iadd
		// @13D: iload #14
		// @13F: iconst_m1
		// @140: invokevirtual game.C_100317_lb.func_101744_b(java.lang.String, int, int, int, int)void
		// @143: sipush 6100 (0x17D4)
		// @146: iload_3
		// @147: iload #21
		// @149: ifne @17B
		// @14C: if_icmpge @159
		// @14F: goto @153
		// @152: athrow
		// @153: ldc 1400960 (0x156080)
		// @155: goto @15B
		// @158: athrow
		// @159: ldc 4210752 (0x404040)
		// @15B: istore #14
		// @15D: iload #13
		// @15F: iload #4
		// @161: iconst_2
		// @162: idiv
		// @163: iadd
		// @164: istore #13
		// @166: getstatic java.lang.String game.C_100342_jg.field_102720_Wb
		// @169: astore #12
		// @16B: iinc #15 +1
		// @16E: iload #21
		// @170: ifeq @0B6
		// @173: iload_0
		// @174: iconst_m1
		// @175: ixor
		// @176: getstatic int game.C_100015_wh.field_103781_g
		// @179: iconst_m1
		// @17A: ixor
		// @17B: if_icmplt @23B
		// @17E: getstatic int game.C_100015_wh.field_103781_g
		// @181: iload #4
		// @183: iload_0
		// @184: iadd
		// @185: if_icmpge @23B
		// @188: goto @18C
		// @18B: athrow
		// @18C: iload_1
		// @18D: getstatic int game.C_100338_jc.field_105370_l
		// @190: if_icmpgt @23B
		// @193: goto @197
		// @196: athrow
		// @197: iload #5
		// @199: iload_1
		// @19A: iadd
		// @19B: iconst_m1
		// @19C: ixor
		// @19D: getstatic int game.C_100338_jc.field_105370_l
		// @1A0: iconst_m1
		// @1A1: ixor
		// @1A2: if_icmpge @23B
		// @1A5: goto @1A9
		// @1A8: athrow
		// @1A9: sipush 6100 (0x17D4)
		// @1AC: iload_3
		// @1AD: if_icmpge @1BB
		// @1B0: goto @1B4
		// @1B3: athrow
		// @1B4: getstatic java.lang.String game.C_100342_jg.field_102720_Wb
		// @1B7: goto @1BE
		// @1BA: athrow
		// @1BB: getstatic java.lang.String game.C_100017_wj.field_103820_a
		// @1BE: astore #15
		// @1C0: sipush -30945 (0x871F)
		// @1C3: iconst_2
		// @1C4: anewarray java.lang.String
		// @1C7: dup
		// @1C8: iconst_0
		// @1C9: iload_3
		// @1CA: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @1CD: aastore
		// @1CE: dup
		// @1CF: iconst_1
		// @1D0: aload #15
		// @1D2: aastore
		// @1D3: getstatic java.lang.String game.C_100225_ah.field_106125_a
		// @1D6: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @1D9: astore #16
		// @1DB: iload_0
		// @1DC: iload #4
		// @1DE: iconst_2
		// @1DF: idiv
		// @1E0: ineg
		// @1E1: isub
		// @1E2: istore #17
		// @1E4: bipush -18 (0xEE)
		// @1E6: iload_1
		// @1E7: iadd
		// @1E8: istore #18
		// @1EA: getstatic game.C_100317_lb game.C_100311_le.field_104719_A
		// @1ED: aload #16
		// @1EF: invokevirtual game.C_100317_lb.func_101739_b(java.lang.String)int
		// @1F2: bipush -8 (0xF8)
		// @1F4: isub
		// @1F5: istore #19
		// @1F7: bipush 13 (0x0D)
		// @1F9: istore #20
		// @1FB: iload #17
		// @1FD: iload #19
		// @1FF: iconst_2
		// @200: idiv
		// @201: isub
		// @202: istore #17
		// @204: bipush -4 (0xFC)
		// @206: iload #17
		// @208: iadd
		// @209: iload #18
		// @20B: iload #19
		// @20D: iload #20
		// @20F: iconst_0
		// @210: sipush 192 (0x00C0)
		// @213: invokestatic game.C_100196_rb.func_105804_g(int, int, int, int, int, int)void
		// @216: bipush -4 (0xFC)
		// @218: iload #17
		// @21A: iadd
		// @21B: iload #18
		// @21D: iload #19
		// @21F: iload #20
		// @221: ldc 1400960 (0x156080)
		// @223: sipush 192 (0x00C0)
		// @226: invokestatic game.C_100196_rb.func_105810_f(int, int, int, int, int, int)void
		// @229: getstatic game.C_100317_lb game.C_100311_le.field_104719_A
		// @22C: aload #16
		// @22E: iload #17
		// @230: iload #18
		// @232: bipush 10 (0x0A)
		// @234: iadd
		// @235: ldc 41727 (0xa2ff)
		// @237: iconst_m1
		// @238: invokevirtual game.C_100317_lb.func_101749_c(java.lang.String, int, int, int, int)void
		// @23B: goto @291
		// @23E: astore #6
		// @240: aload #6
		// @242: new java.lang.StringBuilder
		// @245: dup
		// @246: invokespecial java.lang.StringBuilder.<init>()void
		// @249: getstatic java.lang.String[] game.C_100200_ba.field_105854_z
		// @24C: bipush 9 (0x09)
		// @24E: aaload
		// @24F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @252: iload_0
		// @253: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @256: bipush 44 (0x2C)
		// @258: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @25B: iload_1
		// @25C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @25F: bipush 44 (0x2C)
		// @261: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @264: iload_2
		// @265: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @268: bipush 44 (0x2C)
		// @26A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @26D: iload_3
		// @26E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @271: bipush 44 (0x2C)
		// @273: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @276: iload #4
		// @278: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @27B: bipush 44 (0x2C)
		// @27D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @280: iload #5
		// @282: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @285: bipush 41 (0x29)
		// @287: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @28A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @28D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @290: athrow
		// @291: return
	}
	
	static final int func_105846_a(int arg0, int arg1)
	{
		// @00: iload_0
		// @01: iconst_m1
		// @02: if_icmpeq @10
		// @05: bipush 8 (0x08)
		// @07: bipush -57 (0xC7)
		// @09: invokestatic game.C_100200_ba.func_105845_a(int, byte)void
		// @0C: goto @10
		// @0F: athrow
		// @10: sipush 256 (0x0100)
		// @13: ireturn
		// @14: astore_2
		// @15: aload_2
		// @16: new java.lang.StringBuilder
		// @19: dup
		// @1A: invokespecial java.lang.StringBuilder.<init>()void
		// @1D: getstatic java.lang.String[] game.C_100200_ba.field_105854_z
		// @20: iconst_1
		// @21: aaload
		// @22: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @25: iload_0
		// @26: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @29: bipush 44 (0x2C)
		// @2B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2E: iload_1
		// @2F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @32: bipush 41 (0x29)
		// @34: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @37: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3D: athrow
	}
	
	static
	{
		// @00: bipush 10 (0x0A)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "\u0019\u001cEIZ"
		// @09: invokestatic game.C_100200_ba.func_105843_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100200_ba.func_105841_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "\u0019\u001cEHZ"
		// @14: invokestatic game.C_100200_ba.func_105843_z(java.lang.String)char[]
		// @17: invokestatic game.C_100200_ba.func_105841_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "\u0015\u0008\u0007g"
		// @1F: invokestatic game.C_100200_ba.func_105843_z(java.lang.String)char[]
		// @22: invokestatic game.C_100200_ba.func_105841_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "\u0019\u001cELZ"
		// @2A: invokestatic game.C_100200_ba.func_105843_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100200_ba.func_105841_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "\u0000SE%\u000f"
		// @35: invokestatic game.C_100200_ba.func_105843_z(java.lang.String)char[]
		// @38: invokestatic game.C_100200_ba.func_105841_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "\u0019\u001cEMZ"
		// @40: invokestatic game.C_100200_ba.func_105843_z(java.lang.String)char[]
		// @43: invokestatic game.C_100200_ba.func_105841_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "\u0019\u001cEOZ"
		// @4C: invokestatic game.C_100200_ba.func_105843_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100200_ba.func_105841_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "\u0019\u001cENZ"
		// @58: invokestatic game.C_100200_ba.func_105843_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100200_ba.func_105841_z(char[])java.lang.String
		// @5E: aastore
		// @5F: dup
		// @60: bipush 8 (0x08)
		// @62: ldc "G\u0014\u0006lOJC"
		// @64: invokestatic game.C_100200_ba.func_105843_z(java.lang.String)char[]
		// @67: invokestatic game.C_100200_ba.func_105841_z(char[])java.lang.String
		// @6A: aastore
		// @6B: dup
		// @6C: bipush 9 (0x09)
		// @6E: ldc "\u0019\u001cEJZ"
		// @70: invokestatic game.C_100200_ba.func_105843_z(java.lang.String)char[]
		// @73: invokestatic game.C_100200_ba.func_105841_z(char[])java.lang.String
		// @76: aastore
		// @77: putstatic java.lang.String[] game.C_100200_ba.field_105854_z
		// @7A: ldc "\u0016\u0012\u000f~\u001e\u001e\u000eQ7]\u0018\u0012\u00075"
		// @7C: invokestatic game.C_100200_ba.func_105843_z(java.lang.String)char[]
		// @7F: invokestatic game.C_100200_ba.func_105841_z(char[])java.lang.String
		// @82: putstatic java.lang.String game.C_100200_ba.field_105853_a
		// @85: iconst_1
		// @86: putstatic int game.C_100200_ba.field_105852_c
		// @89: ldc "GX[5R\u0008\u0018\u0008"
		// @8B: invokestatic game.C_100200_ba.func_105843_z(java.lang.String)char[]
		// @8E: invokestatic game.C_100200_ba.func_105841_z(char[])java.lang.String
		// @91: putstatic java.lang.String game.C_100200_ba.field_105848_g
		// @94: return
	}
	
	private static char[] func_105843_z(String arg0)
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
	
	private static String func_105841_z(char[] arg0)
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
		// @30: bipush 123 (0x7B)
		// @32: goto @46
		// @35: bipush 125 (0x7D)
		// @37: goto @46
		// @3A: bipush 107 (0x6B)
		// @3C: goto @46
		// @3F: bipush 11 (0x0B)
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
