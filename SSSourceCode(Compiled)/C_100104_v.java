package game;

abstract class C_100104_v
{
	static C_100302_ka field_104690_e;
	static String field_104698_j;
	static int[] field_104701_i;
	C_100300_kc field_104689_d;
	static String field_104704_p;
	static C_100037_wb field_104696_l;
	static int field_104692_c;
	C_100300_kc field_104700_h;
	C_100300_kc field_104693_a;
	C_100300_kc field_104695_o;
	int field_104688_g;
	long field_104703_q;
	C_100280_nf field_104699_k;
	volatile int field_104697_m;
	byte field_104702_r;
	C_100280_nf field_104687_f;
	volatile int field_104694_n;
	C_100192_rf field_104691_b;
	private static final String[] field_104705_z;
	
	abstract boolean func_104676_a(byte arg0);
	
	final boolean func_104684_a(int arg0)
	{
		// @00: iload_1
		// @01: bipush -101 (0x9B)
		// @03: if_icmple @11
		// @06: aload_0
		// @07: bipush 75 (0x4B)
		// @09: invokevirtual game.C_100104_v.func_104686_e(int)int
		// @0C: pop
		// @0D: goto @11
		// @10: athrow
		// @11: aload_0
		// @12: bipush 72 (0x48)
		// @14: invokevirtual game.C_100104_v.func_104686_e(int)int
		// @17: bipush 20 (0x14)
		// @19: if_icmplt @21
		// @1C: iconst_1
		// @1D: goto @22
		// @20: athrow
		// @21: iconst_0
		// @22: ireturn
		// @23: astore_2
		// @24: aload_2
		// @25: new java.lang.StringBuilder
		// @28: dup
		// @29: invokespecial java.lang.StringBuilder.<init>()void
		// @2C: getstatic java.lang.String[] game.C_100104_v.field_104705_z
		// @2F: iconst_2
		// @30: aaload
		// @31: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @34: iload_1
		// @35: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @38: bipush 41 (0x29)
		// @3A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @40: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @43: athrow
	}
	
	final int func_104675_b(int arg0)
	{
		// @00: iload_1
		// @01: ifeq @10
		// @04: aload_0
		// @05: aconst_null
		// @06: checkcast game.C_100280_nf
		// @09: putfield game.C_100280_nf game.C_100104_v.field_104699_k
		// @0C: goto @10
		// @0F: athrow
		// @10: aload_0
		// @11: getfield game.C_100300_kc game.C_100104_v.field_104689_d
		// @14: iload_1
		// @15: bipush 111 (0x6F)
		// @17: iadd
		// @18: invokevirtual game.C_100300_kc.func_107057_d(int)int
		// @1B: aload_0
		// @1C: getfield game.C_100300_kc game.C_100104_v.field_104700_h
		// @1F: iload_1
		// @20: bipush 112 (0x70)
		// @22: iadd
		// @23: invokevirtual game.C_100300_kc.func_107057_d(int)int
		// @26: ineg
		// @27: isub
		// @28: ireturn
		// @29: astore_2
		// @2A: aload_2
		// @2B: new java.lang.StringBuilder
		// @2E: dup
		// @2F: invokespecial java.lang.StringBuilder.<init>()void
		// @32: getstatic java.lang.String[] game.C_100104_v.field_104705_z
		// @35: iconst_0
		// @36: aaload
		// @37: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3A: iload_1
		// @3B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3E: bipush 41 (0x29)
		// @40: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @43: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @46: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @49: athrow
	}
	
	final boolean func_104674_c(int arg0)
	{
		// @00: iload_1
		// @01: ifeq @0F
		// @04: aload_0
		// @05: bipush -22 (0xEA)
		// @07: invokevirtual game.C_100104_v.func_104684_a(int)boolean
		// @0A: pop
		// @0B: goto @0F
		// @0E: athrow
		// @0F: bipush 20 (0x14)
		// @11: aload_0
		// @12: iload_1
		// @13: iconst_0
		// @14: ixor
		// @15: invokevirtual game.C_100104_v.func_104675_b(int)int
		// @18: if_icmpgt @20
		// @1B: iconst_1
		// @1C: goto @21
		// @1F: athrow
		// @20: iconst_0
		// @21: ireturn
		// @22: astore_2
		// @23: aload_2
		// @24: new java.lang.StringBuilder
		// @27: dup
		// @28: invokespecial java.lang.StringBuilder.<init>()void
		// @2B: getstatic java.lang.String[] game.C_100104_v.field_104705_z
		// @2E: iconst_1
		// @2F: aaload
		// @30: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @33: iload_1
		// @34: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @37: bipush 41 (0x29)
		// @39: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @42: athrow
	}
	
	final C_100192_rf func_104683_a(boolean arg0, int arg1, int arg2, int arg3, byte arg4)
	{
		// @00: iload_3
		// @01: i2l
		// @02: ldc 842106720 (0x32318760)
		// @04: lshl
		// @05: iload_2
		// @06: i2l
		// @07: ladd
		// @08: lstore #6
		// @0A: iload #4
		// @0C: bipush 124 (0x7C)
		// @0E: if_icmpgt @1A
		// @11: aload_0
		// @12: iconst_0
		// @13: invokevirtual game.C_100104_v.func_104681_a(boolean)void
		// @16: goto @1A
		// @19: athrow
		// @1A: new game.C_100192_rf
		// @1D: dup
		// @1E: invokespecial game.C_100192_rf.<init>()void
		// @21: astore #8
		// @23: aload #8
		// @25: lload #6
		// @27: putfield long game.C_100192_rf.field_101484_o
		// @2A: aload #8
		// @2C: iload #5
		// @2E: putfield byte game.C_100192_rf.field_101683_K
		// @31: aload #8
		// @33: iload_1
		// @34: putfield boolean game.C_100192_rf.field_101657_D
		// @37: iload_1
		// @38: ifeq @65
		// @3B: bipush -21 (0xEB)
		// @3D: aload_0
		// @3E: iconst_0
		// @3F: invokevirtual game.C_100104_v.func_104675_b(int)int
		// @42: iconst_m1
		// @43: ixor
		// @44: if_icmplt @54
		// @47: goto @4B
		// @4A: athrow
		// @4B: new java.lang.RuntimeException
		// @4E: dup
		// @4F: invokespecial java.lang.RuntimeException.<init>()void
		// @52: athrow
		// @53: athrow
		// @54: aload_0
		// @55: getfield game.C_100300_kc game.C_100104_v.field_104689_d
		// @58: bipush 124 (0x7C)
		// @5A: aload #8
		// @5C: invokevirtual game.C_100300_kc.func_107058_a(int, game.C_100325_id)void
		// @5F: getstatic int game.SteelSentinels.field_105275_O
		// @62: ifeq @8D
		// @65: bipush -21 (0xEB)
		// @67: aload_0
		// @68: bipush 63 (0x3F)
		// @6A: invokevirtual game.C_100104_v.func_104686_e(int)int
		// @6D: iconst_m1
		// @6E: ixor
		// @6F: if_icmpge @7A
		// @72: goto @76
		// @75: athrow
		// @76: goto @82
		// @79: athrow
		// @7A: new java.lang.RuntimeException
		// @7D: dup
		// @7E: invokespecial java.lang.RuntimeException.<init>()void
		// @81: athrow
		// @82: aload_0
		// @83: getfield game.C_100300_kc game.C_100104_v.field_104693_a
		// @86: bipush 126 (0x7E)
		// @88: aload #8
		// @8A: invokevirtual game.C_100300_kc.func_107058_a(int, game.C_100325_id)void
		// @8D: aload #8
		// @8F: areturn
		// @90: astore #6
		// @92: aload #6
		// @94: new java.lang.StringBuilder
		// @97: dup
		// @98: invokespecial java.lang.StringBuilder.<init>()void
		// @9B: getstatic java.lang.String[] game.C_100104_v.field_104705_z
		// @9E: iconst_3
		// @9F: aaload
		// @A0: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @A3: iload_1
		// @A4: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @A7: bipush 44 (0x2C)
		// @A9: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @AC: iload_2
		// @AD: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @B0: bipush 44 (0x2C)
		// @B2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B5: iload_3
		// @B6: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @B9: bipush 44 (0x2C)
		// @BB: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @BE: iload #4
		// @C0: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @C3: bipush 44 (0x2C)
		// @C5: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C8: iload #5
		// @CA: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @CD: bipush 41 (0x29)
		// @CF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D2: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @D5: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @D8: athrow
	}
	
	final int func_104686_e(int arg0)
	{
		// @00: iload_1
		// @01: bipush 56 (0x38)
		// @03: if_icmpgt @09
		// @06: bipush 15 (0x0F)
		// @08: ireturn
		// @09: aload_0
		// @0A: getfield game.C_100300_kc game.C_100104_v.field_104693_a
		// @0D: bipush 98 (0x62)
		// @0F: invokevirtual game.C_100300_kc.func_107057_d(int)int
		// @12: aload_0
		// @13: getfield game.C_100300_kc game.C_100104_v.field_104695_o
		// @16: bipush 113 (0x71)
		// @18: invokevirtual game.C_100300_kc.func_107057_d(int)int
		// @1B: ineg
		// @1C: isub
		// @1D: ireturn
		// @1E: astore_2
		// @1F: aload_2
		// @20: new java.lang.StringBuilder
		// @23: dup
		// @24: invokespecial java.lang.StringBuilder.<init>()void
		// @27: getstatic java.lang.String[] game.C_100104_v.field_104705_z
		// @2A: iconst_5
		// @2B: aaload
		// @2C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2F: iload_1
		// @30: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @33: bipush 41 (0x29)
		// @35: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @38: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3E: athrow
	}
	
	static final void func_104678_a(int arg0, int arg1, int arg2, boolean arg3, C_100037_wb arg4, int arg5)
	{
		// @000: iload_0
		// @001: iload_1
		// @002: ineg
		// @003: iadd
		// @004: ldc -268004728 (0xf0069288)
		// @006: ishl
		// @007: aload #4
		// @009: getfield int game.C_100037_wb.field_102341_y
		// @00C: idiv
		// @00D: istore #6
		// @00F: iload_2
		// @010: aload #4
		// @012: getfield int game.C_100037_wb.field_102332_H
		// @015: iadd
		// @016: istore_2
		// @017: aload #4
		// @019: getfield int game.C_100037_wb.field_102335_w
		// @01C: iload #6
		// @01E: imul
		// @01F: iload_1
		// @020: ldc -1538267256 (0xa44fe788)
		// @022: ishl
		// @023: iadd
		// @024: istore #7
		// @026: iload #5
		// @028: aload #4
		// @02A: getfield int game.C_100037_wb.field_102335_w
		// @02D: iadd
		// @02E: istore #5
		// @030: iload_2
		// @031: getstatic int game.C_100196_rb.field_105819_e
		// @034: imul
		// @035: iload #5
		// @037: iadd
		// @038: istore #8
		// @03A: iconst_0
		// @03B: istore #9
		// @03D: aload #4
		// @03F: getfield int game.C_100037_wb.field_102337_u
		// @042: istore #10
		// @044: aload #4
		// @046: getfield int game.C_100037_wb.field_102339_s
		// @049: istore #11
		// @04B: iload #11
		// @04D: ineg
		// @04E: getstatic int game.C_100196_rb.field_105819_e
		// @051: iadd
		// @052: istore #12
		// @054: iconst_0
		// @055: istore #13
		// @057: getstatic int game.C_100196_rb.field_105816_f
		// @05A: iload_2
		// @05B: if_icmple @086
		// @05E: iload_2
		// @05F: ineg
		// @060: getstatic int game.C_100196_rb.field_105816_f
		// @063: iadd
		// @064: istore #14
		// @066: iload #8
		// @068: iload #14
		// @06A: getstatic int game.C_100196_rb.field_105819_e
		// @06D: imul
		// @06E: iadd
		// @06F: istore #8
		// @071: getstatic int game.C_100196_rb.field_105816_f
		// @074: istore_2
		// @075: iload #10
		// @077: iload #14
		// @079: isub
		// @07A: istore #10
		// @07C: iload #9
		// @07E: iload #14
		// @080: iload #11
		// @082: imul
		// @083: iadd
		// @084: istore #9
		// @086: iload_2
		// @087: iload #10
		// @089: ineg
		// @08A: isub
		// @08B: iconst_m1
		// @08C: ixor
		// @08D: getstatic int game.C_100196_rb.field_105823_l
		// @090: iconst_m1
		// @091: ixor
		// @092: if_icmpge @0A3
		// @095: iload #10
		// @097: iload_2
		// @098: iload #10
		// @09A: iadd
		// @09B: getstatic int game.C_100196_rb.field_105823_l
		// @09E: ineg
		// @09F: iadd
		// @0A0: isub
		// @0A1: istore #10
		// @0A3: iload #5
		// @0A5: iconst_m1
		// @0A6: ixor
		// @0A7: getstatic int game.C_100196_rb.field_105827_i
		// @0AA: iconst_m1
		// @0AB: ixor
		// @0AC: if_icmple @0EA
		// @0AF: getstatic int game.C_100196_rb.field_105827_i
		// @0B2: iload #5
		// @0B4: ineg
		// @0B5: iadd
		// @0B6: istore #14
		// @0B8: iload #7
		// @0BA: iload #6
		// @0BC: iload #14
		// @0BE: imul
		// @0BF: iadd
		// @0C0: istore #7
		// @0C2: getstatic int game.C_100196_rb.field_105827_i
		// @0C5: istore #5
		// @0C7: iload #13
		// @0C9: iload #14
		// @0CB: iadd
		// @0CC: istore #13
		// @0CE: iload #8
		// @0D0: iload #14
		// @0D2: iadd
		// @0D3: istore #8
		// @0D5: iload #9
		// @0D7: iload #14
		// @0D9: iadd
		// @0DA: istore #9
		// @0DC: iload #11
		// @0DE: iload #14
		// @0E0: isub
		// @0E1: istore #11
		// @0E3: iload #12
		// @0E5: iload #14
		// @0E7: iadd
		// @0E8: istore #12
		// @0EA: iload #5
		// @0EC: iload #11
		// @0EE: iadd
		// @0EF: iconst_m1
		// @0F0: ixor
		// @0F1: getstatic int game.C_100196_rb.field_105820_b
		// @0F4: iconst_m1
		// @0F5: ixor
		// @0F6: if_icmpge @11A
		// @0F9: iload #5
		// @0FB: iload #11
		// @0FD: ineg
		// @0FE: isub
		// @0FF: getstatic int game.C_100196_rb.field_105820_b
		// @102: isub
		// @103: istore #14
		// @105: iload #13
		// @107: iload #14
		// @109: iadd
		// @10A: istore #13
		// @10C: iload #11
		// @10E: iload #14
		// @110: isub
		// @111: istore #11
		// @113: iload #12
		// @115: iload #14
		// @117: iadd
		// @118: istore #12
		// @11A: iload #11
		// @11C: ifle @12F
		// @11F: iload #10
		// @121: iconst_m1
		// @122: ixor
		// @123: iconst_m1
		// @124: if_icmpge @12F
		// @127: goto @12B
		// @12A: athrow
		// @12B: goto @130
		// @12E: athrow
		// @12F: return
		// @130: iload #10
		// @132: ineg
		// @133: istore_2
		// @134: iload_3
		// @135: iconst_1
		// @136: if_icmpeq @14D
		// @139: bipush -57 (0xC7)
		// @13B: bipush 99 (0x63)
		// @13D: bipush -96 (0xA0)
		// @13F: iconst_0
		// @140: aconst_null
		// @141: checkcast game.C_100037_wb
		// @144: bipush 61 (0x3D)
		// @146: invokestatic game.C_100104_v.func_104678_a(int, int, int, boolean, game.C_100037_wb, int)void
		// @149: goto @14D
		// @14C: athrow
		// @14D: iconst_0
		// @14E: iload_2
		// @14F: if_icmple @216
		// @152: iload #7
		// @154: istore #14
		// @156: iload #11
		// @158: ineg
		// @159: istore #5
		// @15B: iload #5
		// @15D: ifge @202
		// @160: iload #14
		// @162: ldc 498579144 (0x1db7b6c8)
		// @164: ishr
		// @165: istore #15
		// @167: iload #14
		// @169: iload #6
		// @16B: iadd
		// @16C: istore #14
		// @16E: sipush 256 (0x0100)
		// @171: iload #15
		// @173: isub
		// @174: istore #16
		// @176: iconst_0
		// @177: iload #15
		// @179: if_icmple @186
		// @17C: iinc #9 +1
		// @17F: iinc #8 +1
		// @182: goto @1FC
		// @185: athrow
		// @186: aload #4
		// @188: getfield int[] game.C_100037_wb.field_102388_J
		// @18B: iload #9
		// @18D: iinc #9 +1
		// @190: iaload
		// @191: istore #17
		// @193: iconst_m1
		// @194: iload #17
		// @196: iconst_m1
		// @197: ixor
		// @198: if_icmpeq @1F9
		// @19B: iload #15
		// @19D: sipush 255 (0x00FF)
		// @1A0: if_icmpgt @1F1
		// @1A3: goto @1A7
		// @1A6: athrow
		// @1A7: getstatic int[] game.C_100196_rb.field_105818_d
		// @1AA: iload #8
		// @1AC: iaload
		// @1AD: istore #18
		// @1AF: ldc 16711935 (0xff00ff)
		// @1B1: ldc 16711935 (0xff00ff)
		// @1B3: iload #18
		// @1B5: iand
		// @1B6: iload #16
		// @1B8: imul
		// @1B9: iload #15
		// @1BB: ldc 16711935 (0xff00ff)
		// @1BD: iload #17
		// @1BF: iand
		// @1C0: imul
		// @1C1: iadd
		// @1C2: ldc -1612516216 (0x9fe2f488)
		// @1C4: ishr
		// @1C5: iand
		// @1C6: istore #19
		// @1C8: getstatic int[] game.C_100196_rb.field_105818_d
		// @1CB: iload #8
		// @1CD: ldc 16711700 (0xff0014)
		// @1CF: iload #15
		// @1D1: iload #17
		// @1D3: ldc 65280 (0xff00)
		// @1D5: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @1D8: imul
		// @1D9: iload #16
		// @1DB: iload #18
		// @1DD: ldc 65280 (0xff00)
		// @1DF: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @1E2: imul
		// @1E3: iadd
		// @1E4: invokestatic game.C_100256_pk.func_100449_a(int, int)int
		// @1E7: ldc -819942200 (0xcf20acc8)
		// @1E9: ishr
		// @1EA: iload #19
		// @1EC: iadd
		// @1ED: iastore
		// @1EE: goto @1F9
		// @1F1: getstatic int[] game.C_100196_rb.field_105818_d
		// @1F4: iload #8
		// @1F6: iload #17
		// @1F8: iastore
		// @1F9: iinc #8 +1
		// @1FC: iinc #5 +1
		// @1FF: goto @15B
		// @202: iload #9
		// @204: iload #13
		// @206: iadd
		// @207: istore #9
		// @209: iload #8
		// @20B: iload #12
		// @20D: iadd
		// @20E: istore #8
		// @210: iinc #2 +1
		// @213: goto @14D
		// @216: goto @27F
		// @219: astore #6
		// @21B: aload #6
		// @21D: new java.lang.StringBuilder
		// @220: dup
		// @221: invokespecial java.lang.StringBuilder.<init>()void
		// @224: getstatic java.lang.String[] game.C_100104_v.field_104705_z
		// @227: bipush 7 (0x07)
		// @229: aaload
		// @22A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @22D: iload_0
		// @22E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @231: bipush 44 (0x2C)
		// @233: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @236: iload_1
		// @237: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @23A: bipush 44 (0x2C)
		// @23C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @23F: iload_2
		// @240: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @243: bipush 44 (0x2C)
		// @245: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @248: iload_3
		// @249: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @24C: bipush 44 (0x2C)
		// @24E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @251: aload #4
		// @253: ifnull @260
		// @256: getstatic java.lang.String[] game.C_100104_v.field_104705_z
		// @259: bipush 6 (0x06)
		// @25B: aaload
		// @25C: goto @266
		// @25F: athrow
		// @260: getstatic java.lang.String[] game.C_100104_v.field_104705_z
		// @263: bipush 8 (0x08)
		// @265: aaload
		// @266: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @269: bipush 44 (0x2C)
		// @26B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @26E: iload #5
		// @270: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @273: bipush 41 (0x29)
		// @275: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @278: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @27B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @27E: athrow
		// @27F: return
	}
	
	abstract void func_104685_d(int arg0);
	
	abstract void func_104681_a(boolean arg0);
	
	abstract void func_104677_a(boolean arg0, Object arg1, byte arg2);
	
	public static void func_104682_f(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100104_v.field_104698_j
		// @04: iload_0
		// @05: bipush -119 (0x89)
		// @07: if_icmplt @0B
		// @0A: return
		// @0B: aconst_null
		// @0C: putstatic game.C_100037_wb game.C_100104_v.field_104696_l
		// @0F: aconst_null
		// @10: putstatic java.lang.String game.C_100104_v.field_104704_p
		// @13: aconst_null
		// @14: putstatic game.C_100302_ka game.C_100104_v.field_104690_e
		// @17: aconst_null
		// @18: putstatic int[] game.C_100104_v.field_104701_i
		// @1B: goto @3F
		// @1E: astore_1
		// @1F: aload_1
		// @20: new java.lang.StringBuilder
		// @23: dup
		// @24: invokespecial java.lang.StringBuilder.<init>()void
		// @27: getstatic java.lang.String[] game.C_100104_v.field_104705_z
		// @2A: iconst_4
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
	
	C_100104_v()
	{
		// @00: aload_0
		// @01: invokespecial java.lang.Object.<init>()void
		// @04: aload_0
		// @05: new game.C_100300_kc
		// @08: dup
		// @09: invokespecial game.C_100300_kc.<init>()void
		// @0C: putfield game.C_100300_kc game.C_100104_v.field_104689_d
		// @0F: aload_0
		// @10: new game.C_100300_kc
		// @13: dup
		// @14: invokespecial game.C_100300_kc.<init>()void
		// @17: putfield game.C_100300_kc game.C_100104_v.field_104700_h
		// @1A: aload_0
		// @1B: new game.C_100300_kc
		// @1E: dup
		// @1F: invokespecial game.C_100300_kc.<init>()void
		// @22: putfield game.C_100300_kc game.C_100104_v.field_104693_a
		// @25: aload_0
		// @26: new game.C_100300_kc
		// @29: dup
		// @2A: invokespecial game.C_100300_kc.<init>()void
		// @2D: putfield game.C_100300_kc game.C_100104_v.field_104695_o
		// @30: aload_0
		// @31: new game.C_100280_nf
		// @34: dup
		// @35: bipush 6 (0x06)
		// @37: invokespecial game.C_100280_nf.<init>(int)void
		// @3A: putfield game.C_100280_nf game.C_100104_v.field_104699_k
		// @3D: aload_0
		// @3E: iconst_0
		// @3F: putfield byte game.C_100104_v.field_104702_r
		// @42: aload_0
		// @43: iconst_0
		// @44: putfield int game.C_100104_v.field_104697_m
		// @47: aload_0
		// @48: iconst_0
		// @49: putfield int game.C_100104_v.field_104694_n
		// @4C: aload_0
		// @4D: new game.C_100280_nf
		// @50: dup
		// @51: bipush 10 (0x0A)
		// @53: invokespecial game.C_100280_nf.<init>(int)void
		// @56: putfield game.C_100280_nf game.C_100104_v.field_104687_f
		// @59: return
	}
	
	static
	{
		// @00: bipush 9 (0x09)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "20rC"
		// @09: invokestatic game.C_100104_v.func_104680_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100104_v.func_104679_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "20hC"
		// @14: invokestatic game.C_100104_v.func_104680_z(java.lang.String)char[]
		// @17: invokestatic game.C_100104_v.func_104679_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "20lC"
		// @1F: invokestatic game.C_100104_v.func_104680_z(java.lang.String)char[]
		// @22: invokestatic game.C_100104_v.func_104679_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "20sC"
		// @2A: invokestatic game.C_100104_v.func_104680_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100104_v.func_104679_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "20nC"
		// @35: invokestatic game.C_100104_v.func_104680_z(java.lang.String)char[]
		// @38: invokestatic game.C_100104_v.func_104679_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "20oC"
		// @40: invokestatic game.C_100104_v.func_104680_z(java.lang.String)char[]
		// @43: invokestatic game.C_100104_v.func_104679_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "?0\rEv"
		// @4C: invokestatic game.C_100104_v.func_104680_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100104_v.func_104679_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "20mC"
		// @58: invokestatic game.C_100104_v.func_104680_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100104_v.func_104679_z(char[])java.lang.String
		// @5E: aastore
		// @5F: dup
		// @60: bipush 8 (0x08)
		// @62: ldc "*kO\u0007"
		// @64: invokestatic game.C_100104_v.func_104680_z(java.lang.String)char[]
		// @67: invokestatic game.C_100104_v.func_104679_z(char[])java.lang.String
		// @6A: aastore
		// @6B: putstatic java.lang.String[] game.C_100104_v.field_104705_z
		// @6E: bipush 10 (0x0A)
		// @70: newarray int[]
		// @72: dup
		// @73: iconst_0
		// @74: bipush 107 (0x6B)
		// @76: iastore
		// @77: dup
		// @78: iconst_1
		// @79: bipush 29 (0x1D)
		// @7B: iastore
		// @7C: dup
		// @7D: iconst_2
		// @7E: iconst_m1
		// @7F: iastore
		// @80: dup
		// @81: iconst_3
		// @82: iconst_m1
		// @83: iastore
		// @84: dup
		// @85: iconst_4
		// @86: iconst_m1
		// @87: iastore
		// @88: dup
		// @89: iconst_5
		// @8A: iconst_m1
		// @8B: iastore
		// @8C: dup
		// @8D: bipush 6 (0x06)
		// @8F: iconst_m1
		// @90: iastore
		// @91: dup
		// @92: bipush 7 (0x07)
		// @94: iconst_m1
		// @95: iastore
		// @96: dup
		// @97: bipush 8 (0x08)
		// @99: iconst_m1
		// @9A: iastore
		// @9B: dup
		// @9C: bipush 9 (0x09)
		// @9E: iconst_m1
		// @9F: iastore
		// @A0: putstatic int[] game.C_100104_v.field_104701_i
		// @A3: ldc "\u0010q\u0003\u000fb7\u007fA\u0007ndjK\u0002xd}L\u0005\u007f6qOG+'rJ\u0008`dqMK7'qOV:\")\u0015\n=z\"\u0006[5x1@\u0004gz>J\u0005+0vFKd4jJ\u0004e7>N\u000ee10"
		// @A5: invokestatic game.C_100104_v.func_104680_z(java.lang.String)char[]
		// @A8: invokestatic game.C_100104_v.func_104679_z(char[])java.lang.String
		// @AB: putstatic java.lang.String game.C_100104_v.field_104698_j
		// @AE: ldc "0q\u0003\u0000n!n\u0003\r~(rP\u0008y!{MKd6"
		// @B0: invokestatic game.C_100104_v.func_104680_z(java.lang.String)char[]
		// @B3: invokestatic game.C_100104_v.func_104679_z(char[])java.lang.String
		// @B6: putstatic java.lang.String game.C_100104_v.field_104704_p
		// @B9: return
	}
	
	private static char[] func_104680_z(String arg0)
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
		// @0E: bipush 11 (0x0B)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_104679_z(char[] arg0)
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
		// @35: bipush 30 (0x1E)
		// @37: goto @46
		// @3A: bipush 35 (0x23)
		// @3C: goto @46
		// @3F: bipush 107 (0x6B)
		// @41: goto @46
		// @44: bipush 11 (0x0B)
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
