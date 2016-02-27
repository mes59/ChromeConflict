package game;

final class C_100024_hd extends C_100340_je
{
	private C_100309_lk field_102997_u;
	static int field_102999_s;
	static boolean field_103002_x;
	private C_100309_lk field_102995_w;
	static String field_102998_t;
	static int field_102996_v;
	static String field_103000_r;
	private static final String[] field_103001_z;
	
	private final boolean func_102994_a(int arg0, String arg1)
	{
		// @00: iload_1
		// @01: bipush -15 (0xF1)
		// @03: if_icmpeq @0F
		// @06: bipush 50 (0x32)
		// @08: putstatic int game.C_100024_hd.field_102996_v
		// @0B: goto @0F
		// @0E: athrow
		// @0F: aload_0
		// @10: getfield game.C_100309_lk game.C_100024_hd.field_102995_w
		// @13: getfield java.lang.String game.C_100309_lk.field_102534_C
		// @16: invokevirtual java.lang.String.toLowerCase()java.lang.String
		// @19: astore_3
		// @1A: aload_2
		// @1B: invokevirtual java.lang.String.toLowerCase()java.lang.String
		// @1E: astore #4
		// @20: iconst_m1
		// @21: aload_3
		// @22: invokevirtual java.lang.String.length()int
		// @25: iconst_m1
		// @26: ixor
		// @27: if_icmple @92
		// @2A: aload #4
		// @2C: invokevirtual java.lang.String.length()int
		// @2F: iconst_m1
		// @30: ixor
		// @31: iconst_m1
		// @32: if_icmpge @92
		// @35: goto @39
		// @38: athrow
		// @39: aload_3
		// @3A: ldc "@"
		// @3C: invokevirtual java.lang.String.lastIndexOf(java.lang.String)int
		// @3F: istore #5
		// @41: iconst_m1
		// @42: iload #5
		// @44: iconst_m1
		// @45: ixor
		// @46: if_icmplt @92
		// @49: iconst_m1
		// @4A: aload_3
		// @4B: invokevirtual java.lang.String.length()int
		// @4E: iadd
		// @4F: iconst_m1
		// @50: ixor
		// @51: iload #5
		// @53: iconst_m1
		// @54: ixor
		// @55: if_icmplt @60
		// @58: goto @5C
		// @5B: athrow
		// @5C: goto @92
		// @5F: athrow
		// @60: aload_3
		// @61: iconst_0
		// @62: iload #5
		// @64: invokevirtual java.lang.String.substring(int, int)java.lang.String
		// @67: astore #6
		// @69: aload_3
		// @6A: iload #5
		// @6C: iconst_1
		// @6D: iadd
		// @6E: invokevirtual java.lang.String.substring(int)java.lang.String
		// @71: astore #7
		// @73: iconst_m1
		// @74: aload #4
		// @76: aload #6
		// @78: invokevirtual java.lang.String.indexOf(java.lang.String)int
		// @7B: iconst_m1
		// @7C: ixor
		// @7D: if_icmplt @82
		// @80: iconst_1
		// @81: ireturn
		// @82: aload #4
		// @84: aload #7
		// @86: invokevirtual java.lang.String.indexOf(java.lang.String)int
		// @89: ifge @90
		// @8C: goto @92
		// @8F: athrow
		// @90: iconst_1
		// @91: ireturn
		// @92: iconst_0
		// @93: ireturn
		// @94: astore_3
		// @95: aload_3
		// @96: new java.lang.StringBuilder
		// @99: dup
		// @9A: invokespecial java.lang.StringBuilder.<init>()void
		// @9D: getstatic java.lang.String[] game.C_100024_hd.field_103001_z
		// @A0: bipush 7 (0x07)
		// @A2: aaload
		// @A3: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @A6: iload_1
		// @A7: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @AA: bipush 44 (0x2C)
		// @AC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @AF: aload_2
		// @B0: ifnull @BC
		// @B3: getstatic java.lang.String[] game.C_100024_hd.field_103001_z
		// @B6: iconst_2
		// @B7: aaload
		// @B8: goto @C1
		// @BB: athrow
		// @BC: getstatic java.lang.String[] game.C_100024_hd.field_103001_z
		// @BF: iconst_1
		// @C0: aaload
		// @C1: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @C4: bipush 41 (0x29)
		// @C6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C9: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @CC: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @CF: athrow
	}
	
	C_100024_hd(C_100309_lk arg0, C_100309_lk arg1, C_100309_lk arg2)
	{
		// @00: aload_0
		// @01: aload_1
		// @02: invokespecial game.C_100340_je.<init>(game.C_100309_lk)void
		// @05: aload_0
		// @06: aload_2
		// @07: putfield game.C_100309_lk game.C_100024_hd.field_102997_u
		// @0A: aload_0
		// @0B: aload_3
		// @0C: putfield game.C_100309_lk game.C_100024_hd.field_102995_w
		// @0F: goto @7A
		// @12: astore #4
		// @14: aload #4
		// @16: new java.lang.StringBuilder
		// @19: dup
		// @1A: invokespecial java.lang.StringBuilder.<init>()void
		// @1D: getstatic java.lang.String[] game.C_100024_hd.field_103001_z
		// @20: iconst_5
		// @21: aaload
		// @22: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @25: aload_1
		// @26: ifnull @32
		// @29: getstatic java.lang.String[] game.C_100024_hd.field_103001_z
		// @2C: iconst_2
		// @2D: aaload
		// @2E: goto @37
		// @31: athrow
		// @32: getstatic java.lang.String[] game.C_100024_hd.field_103001_z
		// @35: iconst_1
		// @36: aaload
		// @37: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3A: bipush 44 (0x2C)
		// @3C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3F: aload_2
		// @40: ifnull @4C
		// @43: getstatic java.lang.String[] game.C_100024_hd.field_103001_z
		// @46: iconst_2
		// @47: aaload
		// @48: goto @51
		// @4B: athrow
		// @4C: getstatic java.lang.String[] game.C_100024_hd.field_103001_z
		// @4F: iconst_1
		// @50: aaload
		// @51: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @54: bipush 44 (0x2C)
		// @56: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @59: aload_3
		// @5A: ifnull @66
		// @5D: getstatic java.lang.String[] game.C_100024_hd.field_103001_z
		// @60: iconst_2
		// @61: aaload
		// @62: goto @6B
		// @65: athrow
		// @66: getstatic java.lang.String[] game.C_100024_hd.field_103001_z
		// @69: iconst_1
		// @6A: aaload
		// @6B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @6E: bipush 41 (0x29)
		// @70: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @73: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @76: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @79: athrow
		// @7A: return
	}
	
	static final void func_102991_h(int arg0)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #6
		// @005: iconst_0
		// @006: putstatic boolean game.C_100007_fm.field_103631_c
		// @009: iconst_0
		// @00A: putstatic boolean game.C_100089_fa.field_103726_e
		// @00D: iconst_0
		// @00E: putstatic boolean game.C_100293_kj.field_106888_e
		// @011: iconst_0
		// @012: putstatic boolean game.C_100068_vc.field_104348_h
		// @015: iconst_0
		// @016: putstatic boolean game.C_100238_ol.field_101697_L
		// @019: iconst_0
		// @01A: putstatic boolean game.C_100332_ii.field_107321_i
		// @01D: iconst_0
		// @01E: putstatic boolean game.C_100249_pc.field_102329_A
		// @021: iconst_0
		// @022: putstatic boolean game.C_100264_mg.field_106524_a
		// @025: iload_0
		// @026: anewarray game.C_100049_vf
		// @029: astore_1
		// @02A: getstatic game.C_100327_ib game.C_100343_jf.field_104834_p
		// @02D: sipush 4095 (0x0FFF)
		// @030: bipush -116 (0x8C)
		// @032: aload_1
		// @033: invokevirtual game.C_100327_ib.func_102462_a(int, int, game.C_100049_vf[])game.C_100049_vf[]
		// @036: astore_1
		// @037: aload_1
		// @038: astore_2
		// @039: iconst_0
		// @03A: istore_3
		// @03B: aload_2
		// @03C: arraylength
		// @03D: iconst_m1
		// @03E: ixor
		// @03F: iload_3
		// @040: iconst_m1
		// @041: ixor
		// @042: if_icmpge @286
		// @045: aload_2
		// @046: iload_3
		// @047: aaload
		// @048: astore #4
		// @04A: iload #6
		// @04C: ifne @2A7
		// @04F: aload #4
		// @051: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @054: ifnull @07F
		// @057: goto @05B
		// @05A: athrow
		// @05B: aload #4
		// @05D: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @060: getfield int game.C_100327_ib.field_102494_P
		// @063: iconst_m1
		// @064: ixor
		// @065: bipush -90 (0xA6)
		// @067: if_icmpne @07F
		// @06A: goto @06E
		// @06D: athrow
		// @06E: iconst_1
		// @06F: putstatic boolean game.C_100089_fa.field_103726_e
		// @072: iconst_1
		// @073: putstatic boolean game.C_100332_ii.field_107321_i
		// @076: iload #6
		// @078: ifeq @27E
		// @07B: goto @07F
		// @07E: athrow
		// @07F: aload #4
		// @081: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @084: ifnull @0AB
		// @087: goto @08B
		// @08A: athrow
		// @08B: aload #4
		// @08D: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @090: getfield int game.C_100327_ib.field_102494_P
		// @093: iconst_m1
		// @094: ixor
		// @095: bipush -67 (0xBD)
		// @097: if_icmpne @0AB
		// @09A: goto @09E
		// @09D: athrow
		// @09E: iconst_1
		// @09F: putstatic boolean game.C_100089_fa.field_103726_e
		// @0A2: iload #6
		// @0A4: ifeq @27E
		// @0A7: goto @0AB
		// @0AA: athrow
		// @0AB: aload #4
		// @0AD: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @0B0: ifnull @0D7
		// @0B3: goto @0B7
		// @0B6: athrow
		// @0B7: aload #4
		// @0B9: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @0BC: getfield int game.C_100327_ib.field_102494_P
		// @0BF: iconst_m1
		// @0C0: ixor
		// @0C1: bipush -77 (0xB3)
		// @0C3: if_icmpne @0D7
		// @0C6: goto @0CA
		// @0C9: athrow
		// @0CA: iconst_1
		// @0CB: putstatic boolean game.C_100089_fa.field_103726_e
		// @0CE: iload #6
		// @0D0: ifeq @27E
		// @0D3: goto @0D7
		// @0D6: athrow
		// @0D7: aload #4
		// @0D9: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @0DC: ifnull @27E
		// @0DF: goto @0E3
		// @0E2: athrow
		// @0E3: bipush 83 (0x53)
		// @0E5: aload #4
		// @0E7: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @0EA: getfield int game.C_100327_ib.field_102494_P
		// @0ED: if_icmpeq @27E
		// @0F0: goto @0F4
		// @0F3: athrow
		// @0F4: sipush 1008 (0x03F0)
		// @0F7: aload #4
		// @0F9: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @0FC: getfield int game.C_100327_ib.field_102497_w
		// @0FF: iand
		// @100: ifne @10B
		// @103: goto @107
		// @106: athrow
		// @107: goto @27E
		// @10A: athrow
		// @10B: iconst_1
		// @10C: putstatic boolean game.C_100089_fa.field_103726_e
		// @10F: aload #4
		// @111: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @114: getfield int game.C_100327_ib.field_102494_P
		// @117: iload_0
		// @118: sipush -8444 (0xDF04)
		// @11B: iadd
		// @11C: invokestatic game.C_100021_wn.func_103867_a(int, int)int
		// @11F: istore #5
		// @121: iconst_1
		// @122: iload #5
		// @124: if_icmpne @130
		// @127: iload #6
		// @129: ifeq @207
		// @12C: goto @130
		// @12F: athrow
		// @130: iload #5
		// @132: ifne @142
		// @135: goto @139
		// @138: athrow
		// @139: iload #6
		// @13B: ifeq @210
		// @13E: goto @142
		// @141: athrow
		// @142: bipush -8 (0xF8)
		// @144: iload #5
		// @146: iconst_m1
		// @147: ixor
		// @148: if_icmpne @158
		// @14B: goto @14F
		// @14E: athrow
		// @14F: iload #6
		// @151: ifeq @221
		// @154: goto @158
		// @157: athrow
		// @158: iload #5
		// @15A: iconst_m1
		// @15B: ixor
		// @15C: bipush -9 (0xF7)
		// @15E: if_icmpeq @236
		// @161: goto @165
		// @164: athrow
		// @165: bipush -12 (0xF4)
		// @167: iload #5
		// @169: iconst_m1
		// @16A: ixor
		// @16B: if_icmpne @17B
		// @16E: goto @172
		// @171: athrow
		// @172: iload #6
		// @174: ifeq @258
		// @177: goto @17B
		// @17A: athrow
		// @17B: iload #5
		// @17D: bipush 12 (0x0C)
		// @17F: if_icmpne @18F
		// @182: goto @186
		// @185: athrow
		// @186: iload #6
		// @188: ifeq @258
		// @18B: goto @18F
		// @18E: athrow
		// @18F: bipush -14 (0xF2)
		// @191: iload #5
		// @193: iconst_m1
		// @194: ixor
		// @195: if_icmpeq @269
		// @198: goto @19C
		// @19B: athrow
		// @19C: iload #5
		// @19E: iconst_m1
		// @19F: ixor
		// @1A0: bipush -15 (0xF1)
		// @1A2: if_icmpeq @269
		// @1A5: goto @1A9
		// @1A8: athrow
		// @1A9: iload #5
		// @1AB: bipush 15 (0x0F)
		// @1AD: if_icmpeq @269
		// @1B0: goto @1B4
		// @1B3: athrow
		// @1B4: iload #5
		// @1B6: iconst_m1
		// @1B7: ixor
		// @1B8: bipush -17 (0xEF)
		// @1BA: if_icmpeq @269
		// @1BD: goto @1C1
		// @1C0: athrow
		// @1C1: iload #5
		// @1C3: iconst_m1
		// @1C4: ixor
		// @1C5: bipush -18 (0xEE)
		// @1C7: if_icmpeq @269
		// @1CA: goto @1CE
		// @1CD: athrow
		// @1CE: iload #5
		// @1D0: bipush 18 (0x12)
		// @1D2: if_icmpne @1E2
		// @1D5: goto @1D9
		// @1D8: athrow
		// @1D9: iload #6
		// @1DB: ifeq @269
		// @1DE: goto @1E2
		// @1E1: athrow
		// @1E2: bipush 19 (0x13)
		// @1E4: iload #5
		// @1E6: if_icmpne @1F6
		// @1E9: goto @1ED
		// @1EC: athrow
		// @1ED: iload #6
		// @1EF: ifeq @269
		// @1F2: goto @1F6
		// @1F5: athrow
		// @1F6: bipush -10 (0xF6)
		// @1F8: iload #5
		// @1FA: iconst_m1
		// @1FB: ixor
		// @1FC: if_icmpeq @276
		// @1FF: goto @203
		// @202: athrow
		// @203: goto @27E
		// @206: athrow
		// @207: iconst_1
		// @208: putstatic boolean game.C_100007_fm.field_103631_c
		// @20B: iload #6
		// @20D: ifeq @27E
		// @210: iconst_1
		// @211: putstatic boolean game.C_100068_vc.field_104348_h
		// @214: iconst_1
		// @215: putstatic boolean game.C_100007_fm.field_103631_c
		// @218: iload #6
		// @21A: ifeq @27E
		// @21D: goto @221
		// @220: athrow
		// @221: iconst_1
		// @222: putstatic boolean game.C_100007_fm.field_103631_c
		// @225: iconst_1
		// @226: putstatic boolean game.C_100068_vc.field_104348_h
		// @229: iconst_1
		// @22A: putstatic boolean game.C_100249_pc.field_102329_A
		// @22D: iload #6
		// @22F: ifeq @27E
		// @232: goto @236
		// @235: athrow
		// @236: bipush 47 (0x2F)
		// @238: aload #4
		// @23A: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @23D: getfield int game.C_100327_ib.field_102494_P
		// @240: if_icmpne @24F
		// @243: goto @247
		// @246: athrow
		// @247: iconst_1
		// @248: putstatic boolean game.C_100249_pc.field_102329_A
		// @24B: goto @24F
		// @24E: athrow
		// @24F: iconst_1
		// @250: putstatic boolean game.C_100068_vc.field_104348_h
		// @253: iload #6
		// @255: ifeq @27E
		// @258: iconst_1
		// @259: putstatic boolean game.C_100238_ol.field_101697_L
		// @25C: iconst_1
		// @25D: putstatic boolean game.C_100068_vc.field_104348_h
		// @260: iload #6
		// @262: ifeq @27E
		// @265: goto @269
		// @268: athrow
		// @269: iconst_1
		// @26A: putstatic boolean game.C_100264_mg.field_106524_a
		// @26D: iload #6
		// @26F: ifeq @27E
		// @272: goto @276
		// @275: athrow
		// @276: iconst_1
		// @277: putstatic boolean game.C_100293_kj.field_106888_e
		// @27A: goto @27E
		// @27D: athrow
		// @27E: iinc #3 +1
		// @281: iload #6
		// @283: ifeq @03B
		// @286: bipush -9 (0xF7)
		// @288: getstatic int game.C_100068_vc.field_104343_e
		// @28B: iconst_m1
		// @28C: ixor
		// @28D: if_icmpne @2A3
		// @290: getstatic boolean game.C_100264_mg.field_106524_a
		// @293: ifne @2A3
		// @296: goto @29A
		// @299: athrow
		// @29A: bipush 72 (0x48)
		// @29C: invokestatic game.C_100312_ld.func_107146_a(byte)void
		// @29F: goto @2A3
		// @2A2: athrow
		// @2A3: iconst_1
		// @2A4: putstatic boolean game.C_100202_qi.field_105917_c
		// @2A7: goto @2CC
		// @2AA: astore_1
		// @2AB: aload_1
		// @2AC: new java.lang.StringBuilder
		// @2AF: dup
		// @2B0: invokespecial java.lang.StringBuilder.<init>()void
		// @2B3: getstatic java.lang.String[] game.C_100024_hd.field_103001_z
		// @2B6: bipush 9 (0x09)
		// @2B8: aaload
		// @2B9: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2BC: iload_0
		// @2BD: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2C0: bipush 41 (0x29)
		// @2C2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2C5: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @2C8: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @2CB: athrow
		// @2CC: return
	}
	
	final C_100133_tk func_102974_b(String arg0, int arg1)
	{
		// @00: aload_0
		// @01: getfield game.C_100309_lk game.C_100024_hd.field_102997_u
		// @04: getfield java.lang.String game.C_100309_lk.field_102534_C
		// @07: invokevirtual java.lang.String.toLowerCase()java.lang.String
		// @0A: astore_3
		// @0B: aload_1
		// @0C: invokevirtual java.lang.String.toLowerCase()java.lang.String
		// @0F: astore #4
		// @11: aload #4
		// @13: invokevirtual java.lang.String.length()int
		// @16: iload_2
		// @17: if_icmpne @1E
		// @1A: getstatic game.C_100133_tk game.C_100256_pk.field_100466_a
		// @1D: areturn
		// @1E: aload_3
		// @1F: aload #4
		// @21: iconst_1
		// @22: invokestatic game.C_100022_hf.func_103889_a(java.lang.String, java.lang.String, boolean)boolean
		// @25: ifne @2C
		// @28: getstatic game.C_100133_tk game.C_100256_pk.field_100466_a
		// @2B: areturn
		// @2C: aload_0
		// @2D: bipush -15 (0xF1)
		// @2F: aload_1
		// @30: invokespecial game.C_100024_hd.func_102994_a(int, java.lang.String)boolean
		// @33: ifeq @3A
		// @36: getstatic game.C_100133_tk game.C_100256_pk.field_100466_a
		// @39: areturn
		// @3A: getstatic game.C_100133_tk game.C_100079_e.field_102670_tb
		// @3D: areturn
		// @3E: astore_3
		// @3F: aload_3
		// @40: new java.lang.StringBuilder
		// @43: dup
		// @44: invokespecial java.lang.StringBuilder.<init>()void
		// @47: getstatic java.lang.String[] game.C_100024_hd.field_103001_z
		// @4A: bipush 8 (0x08)
		// @4C: aaload
		// @4D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @50: aload_1
		// @51: ifnull @5D
		// @54: getstatic java.lang.String[] game.C_100024_hd.field_103001_z
		// @57: iconst_2
		// @58: aaload
		// @59: goto @62
		// @5C: athrow
		// @5D: getstatic java.lang.String[] game.C_100024_hd.field_103001_z
		// @60: iconst_1
		// @61: aaload
		// @62: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @65: bipush 44 (0x2C)
		// @67: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6A: iload_2
		// @6B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6E: bipush 41 (0x29)
		// @70: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @73: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @76: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @79: athrow
	}
	
	static final void func_102993_a(boolean arg0, boolean arg1)
	{
		// @00: iconst_1
		// @01: invokestatic game.C_100032_gk.func_103124_a(boolean)void
		// @04: getstatic game.C_100211_qd game.C_100068_vc.field_104342_d
		// @07: ifnull @29
		// @0A: getstatic game.C_100211_qd game.C_100068_vc.field_104342_d
		// @0D: getfield int game.C_100211_qd.field_102138_ec
		// @10: bipush -22 (0xEA)
		// @12: getstatic game.C_100211_qd game.C_100068_vc.field_104342_d
		// @15: getfield byte[] game.C_100211_qd.field_102165_jc
		// @18: iconst_2
		// @19: baload
		// @1A: invokestatic game.C_100084_ug.func_104471_a(int, int, int)boolean
		// @1D: ifeq @29
		// @20: goto @24
		// @23: athrow
		// @24: iconst_1
		// @25: goto @2A
		// @28: athrow
		// @29: iconst_0
		// @2A: istore_2
		// @2B: getstatic boolean game.C_100192_rf.field_101680_H
		// @2E: ifne @3B
		// @31: getstatic boolean game.C_100205_qf.field_103681_c
		// @34: ifeq @40
		// @37: goto @3B
		// @3A: athrow
		// @3B: iconst_1
		// @3C: goto @41
		// @3F: athrow
		// @40: iconst_0
		// @41: bipush 14 (0x0E)
		// @43: bipush 11 (0x0B)
		// @45: bipush 13 (0x0D)
		// @47: bipush -113 (0x8F)
		// @49: iload_2
		// @4A: iload_1
		// @4B: getstatic int game.C_100242_oh.field_106344_e
		// @4E: iconst_0
		// @4F: bipush 15 (0x0F)
		// @51: getstatic int game.C_100129_tg.field_102754_vb
		// @54: iconst_m1
		// @55: ixor
		// @56: bipush -51 (0xCD)
		// @58: if_icmpge @60
		// @5B: iconst_1
		// @5C: goto @61
		// @5F: athrow
		// @60: iconst_0
		// @61: iconst_1
		// @62: invokestatic game.C_100226_ae.func_106144_a(boolean, int, int, int, byte, boolean, boolean, int, int, int, boolean, boolean)void
		// @65: iload_0
		// @66: ifeq @79
		// @69: bipush -45 (0xD3)
		// @6B: bipush 119 (0x77)
		// @6D: bipush -68 (0xBC)
		// @6F: bipush 50 (0x32)
		// @71: invokestatic game.C_100024_hd.func_102990_a(int, int, int, int)game.C_100037_wb[]
		// @74: pop
		// @75: goto @79
		// @78: athrow
		// @79: getstatic boolean game.C_100265_mh.field_106616_b
		// @7C: ifeq @91
		// @7F: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @82: bipush 57 (0x39)
		// @84: bipush 119 (0x77)
		// @86: invokevirtual game.C_100278_nd.func_101189_h(int, int)void
		// @89: iconst_0
		// @8A: putstatic boolean game.C_100265_mh.field_106616_b
		// @8D: goto @91
		// @90: athrow
		// @91: getstatic boolean game.C_100288_jn.field_106842_e
		// @94: ifne @9B
		// @97: goto @A9
		// @9A: athrow
		// @9B: getstatic game.C_100278_nd game.C_100115_ej.field_102043_Yb
		// @9E: bipush 10 (0x0A)
		// @A0: bipush 120 (0x78)
		// @A2: invokevirtual game.C_100278_nd.func_101189_h(int, int)void
		// @A5: iconst_0
		// @A6: putstatic boolean game.C_100288_jn.field_106842_e
		// @A9: goto @D6
		// @AC: astore_2
		// @AD: aload_2
		// @AE: new java.lang.StringBuilder
		// @B1: dup
		// @B2: invokespecial java.lang.StringBuilder.<init>()void
		// @B5: getstatic java.lang.String[] game.C_100024_hd.field_103001_z
		// @B8: iconst_4
		// @B9: aaload
		// @BA: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @BD: iload_0
		// @BE: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @C1: bipush 44 (0x2C)
		// @C3: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C6: iload_1
		// @C7: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @CA: bipush 41 (0x29)
		// @CC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @CF: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @D2: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @D5: athrow
		// @D6: return
	}
	
	static final C_100037_wb[] func_102990_a(int arg0, int arg1, int arg2, int arg3)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #6
		// @05: iload_1
		// @06: iconst_m1
		// @07: if_icmpeq @15
		// @0A: aconst_null
		// @0B: checkcast java.lang.String
		// @0E: putstatic java.lang.String game.C_100024_hd.field_102998_t
		// @11: goto @15
		// @14: athrow
		// @15: bipush 9 (0x09)
		// @17: anewarray game.C_100037_wb
		// @1A: astore #4
		// @1C: aload #4
		// @1E: iconst_0
		// @1F: bipush 73 (0x49)
		// @21: iload_0
		// @22: iload_3
		// @23: invokestatic game.C_100169_co.func_105518_a(byte, int, int)game.C_100037_wb
		// @26: aastore
		// @27: iconst_1
		// @28: istore #5
		// @2A: iload #5
		// @2C: iconst_m1
		// @2D: ixor
		// @2E: bipush -10 (0xF6)
		// @30: if_icmple @4D
		// @33: aload #4
		// @35: iload #5
		// @37: aload #4
		// @39: iconst_0
		// @3A: aaload
		// @3B: aastore
		// @3C: iinc #5 +1
		// @3F: iload #6
		// @41: ifne @59
		// @44: iload #6
		// @46: ifeq @2A
		// @49: goto @4D
		// @4C: athrow
		// @4D: aload #4
		// @4F: iconst_4
		// @50: bipush 73 (0x49)
		// @52: bipush 64 (0x40)
		// @54: iload_2
		// @55: invokestatic game.C_100169_co.func_105518_a(byte, int, int)game.C_100037_wb
		// @58: aastore
		// @59: aload #4
		// @5B: areturn
		// @5C: astore #4
		// @5E: aload #4
		// @60: new java.lang.StringBuilder
		// @63: dup
		// @64: invokespecial java.lang.StringBuilder.<init>()void
		// @67: getstatic java.lang.String[] game.C_100024_hd.field_103001_z
		// @6A: bipush 10 (0x0A)
		// @6C: aaload
		// @6D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @70: iload_0
		// @71: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @74: bipush 44 (0x2C)
		// @76: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @79: iload_1
		// @7A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7D: bipush 44 (0x2C)
		// @7F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @82: iload_2
		// @83: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @86: bipush 44 (0x2C)
		// @88: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8B: iload_3
		// @8C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8F: bipush 41 (0x29)
		// @91: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @94: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @97: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @9A: athrow
	}
	
	static final boolean func_102988_a(char arg0, int arg1)
	{
		// @00: iload_0
		// @01: iconst_m1
		// @02: ixor
		// @03: bipush -33 (0xDF)
		// @05: if_icmpgt @14
		// @08: iload_0
		// @09: bipush 126 (0x7E)
		// @0B: if_icmpgt @14
		// @0E: goto @12
		// @11: athrow
		// @12: iconst_1
		// @13: ireturn
		// @14: sipush -161 (0xFF5F)
		// @17: iload_0
		// @18: iconst_m1
		// @19: ixor
		// @1A: if_icmplt @2A
		// @1D: sipush 255 (0x00FF)
		// @20: iload_0
		// @21: if_icmplt @2A
		// @24: goto @28
		// @27: athrow
		// @28: iconst_1
		// @29: ireturn
		// @2A: iload_1
		// @2B: sipush 339 (0x0153)
		// @2E: if_icmpeq @39
		// @31: iconst_0
		// @32: putstatic boolean game.C_100024_hd.field_103002_x
		// @35: goto @39
		// @38: athrow
		// @39: sipush 8364 (0x20AC)
		// @3C: iload_0
		// @3D: if_icmpeq @72
		// @40: sipush -339 (0xFEAD)
		// @43: iload_0
		// @44: iconst_m1
		// @45: ixor
		// @46: if_icmpeq @72
		// @49: goto @4D
		// @4C: athrow
		// @4D: iload_0
		// @4E: iconst_m1
		// @4F: ixor
		// @50: sipush -8213 (0xDFEB)
		// @53: if_icmpeq @72
		// @56: goto @5A
		// @59: athrow
		// @5A: sipush 339 (0x0153)
		// @5D: iload_0
		// @5E: if_icmpeq @72
		// @61: goto @65
		// @64: athrow
		// @65: sipush -377 (0xFE87)
		// @68: iload_0
		// @69: iconst_m1
		// @6A: ixor
		// @6B: if_icmpne @74
		// @6E: goto @72
		// @71: athrow
		// @72: iconst_1
		// @73: ireturn
		// @74: iconst_0
		// @75: ireturn
		// @76: astore_2
		// @77: aload_2
		// @78: new java.lang.StringBuilder
		// @7B: dup
		// @7C: invokespecial java.lang.StringBuilder.<init>()void
		// @7F: getstatic java.lang.String[] game.C_100024_hd.field_103001_z
		// @82: iconst_3
		// @83: aaload
		// @84: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @87: iload_0
		// @88: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8B: bipush 44 (0x2C)
		// @8D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @90: iload_1
		// @91: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @94: bipush 41 (0x29)
		// @96: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @99: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @9C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @9F: athrow
	}
	
	final String func_102975_a(byte arg0, String arg1)
	{
		// @00: iload_1
		// @01: bipush 16 (0x10)
		// @03: if_icmpeq @0F
		// @06: bipush -103 (0x99)
		// @08: invokestatic game.C_100024_hd.func_102991_h(int)void
		// @0B: goto @0F
		// @0E: athrow
		// @0F: aload_0
		// @10: getfield game.C_100309_lk game.C_100024_hd.field_102997_u
		// @13: getfield java.lang.String game.C_100309_lk.field_102534_C
		// @16: invokevirtual java.lang.String.toLowerCase()java.lang.String
		// @19: astore_3
		// @1A: aload_2
		// @1B: invokevirtual java.lang.String.toLowerCase()java.lang.String
		// @1E: astore #4
		// @20: iconst_m1
		// @21: aload #4
		// @23: invokevirtual java.lang.String.length()int
		// @26: iconst_m1
		// @27: ixor
		// @28: if_icmpne @2D
		// @2B: aconst_null
		// @2C: areturn
		// @2D: aload #4
		// @2F: astore #5
		// @31: aload #5
		// @33: bipush 115 (0x73)
		// @35: invokestatic game.C_100079_e.func_102661_a(java.lang.String, byte)boolean
		// @38: ifeq @3F
		// @3B: getstatic java.lang.String game.C_100044_vm.field_100941_w
		// @3E: areturn
		// @3F: aload #5
		// @41: sipush -17560 (0xBB68)
		// @44: invokestatic game.C_100052_eb.func_104223_a(java.lang.String, int)boolean
		// @47: ifne @4E
		// @4A: goto @52
		// @4D: athrow
		// @4E: getstatic java.lang.String game.C_100197_ra.field_100871_x
		// @51: areturn
		// @52: aload #5
		// @54: sipush 27048 (0x69A8)
		// @57: invokestatic game.C_100092_um.func_104523_a(java.lang.String, int)boolean
		// @5A: ifne @61
		// @5D: goto @65
		// @60: athrow
		// @61: getstatic java.lang.String game.C_100252_pn.field_105507_k
		// @64: areturn
		// @65: aload_0
		// @66: bipush -15 (0xF1)
		// @68: aload_2
		// @69: invokespecial game.C_100024_hd.func_102994_a(int, java.lang.String)boolean
		// @6C: ifeq @73
		// @6F: getstatic java.lang.String game.C_100000_gd.field_100358_b
		// @72: areturn
		// @73: aload_3
		// @74: invokevirtual java.lang.String.length()int
		// @77: iconst_m1
		// @78: ixor
		// @79: iconst_m1
		// @7A: if_icmplt @81
		// @7D: getstatic java.lang.String game.C_100027_hc.field_102604_Z
		// @80: areturn
		// @81: aload_3
		// @82: iconst_m1
		// @83: aload #5
		// @85: invokestatic game.C_100322_hn.func_107231_a(java.lang.String, int, java.lang.String)boolean
		// @88: ifne @8F
		// @8B: goto @93
		// @8E: athrow
		// @8F: getstatic java.lang.String game.C_100286_nl.field_106807_b
		// @92: areturn
		// @93: sipush -4787 (0xED4D)
		// @96: aload #5
		// @98: aload_3
		// @99: invokestatic game.C_100089_fa.func_103713_a(int, java.lang.String, java.lang.String)boolean
		// @9C: ifeq @A3
		// @9F: getstatic java.lang.String game.C_100022_hf.field_103898_c
		// @A2: areturn
		// @A3: aload #5
		// @A5: aload_3
		// @A6: iload_1
		// @A7: bipush 16 (0x10)
		// @A9: ixor
		// @AA: invokestatic game.C_100087_n.func_100680_a(java.lang.String, java.lang.String, int)boolean
		// @AD: ifeq @B4
		// @B0: getstatic java.lang.String game.C_100286_nl.field_106807_b
		// @B3: areturn
		// @B4: getstatic java.lang.String game.C_100044_vm.field_100941_w
		// @B7: areturn
		// @B8: astore_3
		// @B9: aload_3
		// @BA: new java.lang.StringBuilder
		// @BD: dup
		// @BE: invokespecial java.lang.StringBuilder.<init>()void
		// @C1: getstatic java.lang.String[] game.C_100024_hd.field_103001_z
		// @C4: iconst_0
		// @C5: aaload
		// @C6: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @C9: iload_1
		// @CA: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @CD: bipush 44 (0x2C)
		// @CF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D2: aload_2
		// @D3: ifnull @DF
		// @D6: getstatic java.lang.String[] game.C_100024_hd.field_103001_z
		// @D9: iconst_2
		// @DA: aaload
		// @DB: goto @E4
		// @DE: athrow
		// @DF: getstatic java.lang.String[] game.C_100024_hd.field_103001_z
		// @E2: iconst_1
		// @E3: aaload
		// @E4: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @E7: bipush 41 (0x29)
		// @E9: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @EC: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @EF: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @F2: athrow
	}
	
	public static void func_102992_g(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100024_hd.field_103000_r
		// @04: iload_0
		// @05: ifeq @09
		// @08: return
		// @09: aconst_null
		// @0A: putstatic java.lang.String game.C_100024_hd.field_102998_t
		// @0D: goto @32
		// @10: astore_1
		// @11: aload_1
		// @12: new java.lang.StringBuilder
		// @15: dup
		// @16: invokespecial java.lang.StringBuilder.<init>()void
		// @19: getstatic java.lang.String[] game.C_100024_hd.field_103001_z
		// @1C: bipush 6 (0x06)
		// @1E: aaload
		// @1F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @22: iload_0
		// @23: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @26: bipush 41 (0x29)
		// @28: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @2E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @31: athrow
		// @32: return
	}
	
	static
	{
		// @00: bipush 11 (0x0B)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "P~\u0008kq"
		// @09: invokestatic game.C_100024_hd.func_102989_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100024_hd.func_102987_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "VoJE"
		// @14: invokestatic game.C_100024_hd.func_102989_z(java.lang.String)char[]
		// @17: invokestatic game.C_100024_hd.func_102987_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "C4\u0008\u0007$"
		// @1F: invokestatic game.C_100024_hd.func_102989_z(java.lang.String)char[]
		// @22: invokestatic game.C_100024_hd.func_102987_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "P~\u0008mq"
		// @2A: invokestatic game.C_100024_hd.func_102989_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100024_hd.func_102987_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "P~\u0008nq"
		// @35: invokestatic game.C_100024_hd.func_102989_z(java.lang.String)char[]
		// @38: invokestatic game.C_100024_hd.func_102987_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "P~\u0008\u00150VsR\u0017q"
		// @40: invokestatic game.C_100024_hd.func_102989_z(java.lang.String)char[]
		// @43: invokestatic game.C_100024_hd.func_102987_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "P~\u0008aq"
		// @4C: invokestatic game.C_100024_hd.func_102989_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100024_hd.func_102987_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "P~\u0008hq"
		// @58: invokestatic game.C_100024_hd.func_102989_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100024_hd.func_102987_z(char[])java.lang.String
		// @5E: aastore
		// @5F: dup
		// @60: bipush 8 (0x08)
		// @62: ldc "P~\u0008oq"
		// @64: invokestatic game.C_100024_hd.func_102989_z(java.lang.String)char[]
		// @67: invokestatic game.C_100024_hd.func_102987_z(char[])java.lang.String
		// @6A: aastore
		// @6B: dup
		// @6C: bipush 9 (0x09)
		// @6E: ldc "P~\u0008jq"
		// @70: invokestatic game.C_100024_hd.func_102989_z(java.lang.String)char[]
		// @73: invokestatic game.C_100024_hd.func_102987_z(char[])java.lang.String
		// @76: aastore
		// @77: dup
		// @78: bipush 10 (0x0A)
		// @7A: ldc "P~\u0008lq"
		// @7C: invokestatic game.C_100024_hd.func_102989_z(java.lang.String)char[]
		// @7F: invokestatic game.C_100024_hd.func_102987_z(char[])java.lang.String
		// @82: aastore
		// @83: putstatic java.lang.String[] game.C_100024_hd.field_103001_z
		// @86: ldc "q|\u0006P6M:BFyVuRA0V}\u0006]1]:AH4]:Q@5T:TL/]hR\t-W:HF+U{J\t/Q\u007fQ\t0V:\u001a\u000ci\u0006:UL:WtB\u0007"
		// @88: invokestatic game.C_100024_hd.func_102989_z(java.lang.String)char[]
		// @8B: invokestatic game.C_100024_hd.func_102987_z(char[])java.lang.String
		// @8E: putstatic java.lang.String game.C_100024_hd.field_102998_t
		// @91: ldc "hvGP<Ji\u001c\te\u001d*\u0018\u0006e\u001d+\u0018"
		// @93: invokestatic game.C_100024_hd.func_102989_z(java.lang.String)char[]
		// @96: invokestatic game.C_100024_hd.func_102987_z(char[])java.lang.String
		// @99: putstatic java.lang.String game.C_100024_hd.field_103000_r
		// @9C: return
	}
	
	private static char[] func_102989_z(String arg0)
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
		// @0E: bipush 89 (0x59)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_102987_z(char[] arg0)
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
		// @30: bipush 56 (0x38)
		// @32: goto @46
		// @35: bipush 26 (0x1A)
		// @37: goto @46
		// @3A: bipush 38 (0x26)
		// @3C: goto @46
		// @3F: bipush 41 (0x29)
		// @41: goto @46
		// @44: bipush 89 (0x59)
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
