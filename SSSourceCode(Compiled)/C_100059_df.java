package game;

final class C_100059_df extends C_100325_id
{
	static String field_101594_F;
	int field_101602_O;
	static int field_101592_D;
	static String field_101616_z;
	static C_100026_hb field_101599_L;
	static byte[] field_101603_H;
	int field_101607_Q;
	int field_101605_J;
	static String field_101612_v;
	static String[] field_101593_E;
	static String[] field_101597_B;
	boolean field_101617_y;
	static String[] field_101601_N;
	int field_101595_G;
	int field_101608_P;
	int field_101598_C;
	static boolean field_101613_u;
	static String field_101606_K;
	static int field_101611_w;
	static C_100127_tl field_101614_t;
	int field_101610_R;
	static C_100037_wb[] field_101604_I;
	static int[] field_101600_M;
	int field_101618_x;
	static C_100037_wb field_101615_s;
	C_100294_ki field_101596_A;
	private static final String[] field_101609_S;
	
	final void func_101591_j(int arg0)
	{
		// @00: aload_0
		// @01: aconst_null
		// @02: putfield game.C_100294_ki game.C_100059_df.field_101596_A
		// @05: iload_1
		// @06: bipush 8 (0x08)
		// @08: if_icmpgt @11
		// @0B: aload_0
		// @0C: bipush 114 (0x72)
		// @0E: putfield int game.C_100059_df.field_101618_x
		// @11: goto @35
		// @14: astore_2
		// @15: aload_2
		// @16: new java.lang.StringBuilder
		// @19: dup
		// @1A: invokespecial java.lang.StringBuilder.<init>()void
		// @1D: getstatic java.lang.String[] game.C_100059_df.field_101609_S
		// @20: iconst_4
		// @21: aaload
		// @22: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @25: iload_1
		// @26: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @29: bipush 41 (0x29)
		// @2B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @31: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @34: athrow
		// @35: return
	}
	
	public static void func_101590_k(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100059_df.field_101616_z
		// @04: aconst_null
		// @05: putstatic game.C_100037_wb game.C_100059_df.field_101615_s
		// @08: aconst_null
		// @09: putstatic game.C_100127_tl game.C_100059_df.field_101614_t
		// @0C: aconst_null
		// @0D: putstatic game.C_100026_hb game.C_100059_df.field_101599_L
		// @10: aconst_null
		// @11: putstatic java.lang.String game.C_100059_df.field_101612_v
		// @14: aconst_null
		// @15: putstatic java.lang.String game.C_100059_df.field_101606_K
		// @18: aconst_null
		// @19: putstatic java.lang.String game.C_100059_df.field_101594_F
		// @1C: aconst_null
		// @1D: putstatic byte[] game.C_100059_df.field_101603_H
		// @20: aconst_null
		// @21: putstatic game.C_100037_wb[] game.C_100059_df.field_101604_I
		// @24: iload_0
		// @25: sipush 128 (0x0080)
		// @28: if_icmpeq @36
		// @2B: aconst_null
		// @2C: checkcast java.lang.String
		// @2F: putstatic java.lang.String game.C_100059_df.field_101594_F
		// @32: goto @36
		// @35: athrow
		// @36: aconst_null
		// @37: putstatic int[] game.C_100059_df.field_101600_M
		// @3A: aconst_null
		// @3B: putstatic java.lang.String[] game.C_100059_df.field_101593_E
		// @3E: aconst_null
		// @3F: putstatic java.lang.String[] game.C_100059_df.field_101597_B
		// @42: aconst_null
		// @43: putstatic java.lang.String[] game.C_100059_df.field_101601_N
		// @46: goto @6A
		// @49: astore_1
		// @4A: aload_1
		// @4B: new java.lang.StringBuilder
		// @4E: dup
		// @4F: invokespecial java.lang.StringBuilder.<init>()void
		// @52: getstatic java.lang.String[] game.C_100059_df.field_101609_S
		// @55: iconst_2
		// @56: aaload
		// @57: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @5A: iload_0
		// @5B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5E: bipush 41 (0x29)
		// @60: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @63: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @66: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @69: athrow
		// @6A: return
	}
	
	static final void func_101587_i(int arg0)
	{
		// @00: sipush -18973 (0xB5E3)
		// @03: invokestatic game.C_100091_m.func_104503_a(int)void
		// @06: bipush -24 (0xE8)
		// @08: bipush 17 (0x11)
		// @0A: iload_0
		// @0B: isub
		// @0C: bipush 49 (0x31)
		// @0E: idiv
		// @0F: irem
		// @10: istore_1
		// @11: iconst_1
		// @12: iconst_4
		// @13: invokestatic game.C_100152_bd.func_105184_a(boolean, int)void
		// @16: goto @3A
		// @19: astore_1
		// @1A: aload_1
		// @1B: new java.lang.StringBuilder
		// @1E: dup
		// @1F: invokespecial java.lang.StringBuilder.<init>()void
		// @22: getstatic java.lang.String[] game.C_100059_df.field_101609_S
		// @25: iconst_0
		// @26: aaload
		// @27: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2A: iload_0
		// @2B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2E: bipush 41 (0x29)
		// @30: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @33: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @36: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @39: athrow
		// @3A: return
	}
	
	final void func_101586_a(int arg0, boolean arg1, int arg2, int arg3)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #9
		// @005: aload_0
		// @006: getfield int game.C_100059_df.field_101602_O
		// @009: ldc -588690648 (0xdce94b28)
		// @00B: ishr
		// @00C: iload_1
		// @00D: iadd
		// @00E: istore #5
		// @010: aload_0
		// @011: getfield int game.C_100059_df.field_101605_J
		// @014: ldc 1728229800 (0x6702b1a8)
		// @016: ishr
		// @017: iload #4
		// @019: iadd
		// @01A: istore #6
		// @01C: bipush -32 (0xE0)
		// @01E: iload #5
		// @020: if_icmpgt @04A
		// @023: iload #5
		// @025: sipush 672 (0x02A0)
		// @028: if_icmpgt @04A
		// @02B: goto @02F
		// @02E: athrow
		// @02F: bipush -32 (0xE0)
		// @031: iload #6
		// @033: if_icmpgt @04A
		// @036: goto @03A
		// @039: athrow
		// @03A: iload #6
		// @03C: sipush 672 (0x02A0)
		// @03F: if_icmpgt @04A
		// @042: goto @046
		// @045: athrow
		// @046: goto @04B
		// @049: athrow
		// @04A: return
		// @04B: bipush 8 (0x08)
		// @04D: aload_0
		// @04E: getfield int game.C_100059_df.field_101598_C
		// @051: imul
		// @052: aload_0
		// @053: getfield int game.C_100059_df.field_101618_x
		// @056: idiv
		// @057: istore #7
		// @059: iload #7
		// @05B: ifge @061
		// @05E: iconst_0
		// @05F: istore #7
		// @061: iload #7
		// @063: bipush 7 (0x07)
		// @065: if_icmple @06C
		// @068: bipush 7 (0x07)
		// @06A: istore #7
		// @06C: iconst_m1
		// @06D: aload_0
		// @06E: getfield int game.C_100059_df.field_101608_P
		// @071: iconst_m1
		// @072: ixor
		// @073: if_icmpne @0E1
		// @076: iload_2
		// @077: ifeq @41D
		// @07A: goto @07E
		// @07D: athrow
		// @07E: iconst_0
		// @07F: bipush 15 (0x0F)
		// @081: bipush 16 (0x10)
		// @083: aload_0
		// @084: getfield int game.C_100059_df.field_101598_C
		// @087: imul
		// @088: aload_0
		// @089: getfield int game.C_100059_df.field_101618_x
		// @08C: idiv
		// @08D: invokestatic java.lang.Math.min(int, int)int
		// @090: invokestatic java.lang.Math.max(int, int)int
		// @093: istore #7
		// @095: bipush 17 (0x11)
		// @097: istore #8
		// @099: getstatic game.C_100251_pm[] game.C_100084_ug.field_104485_j
		// @09C: iload #7
		// @09E: aaload
		// @09F: iload #8
		// @0A1: ineg
		// @0A2: iload #5
		// @0A4: iadd
		// @0A5: iload #8
		// @0A7: ineg
		// @0A8: iload #6
		// @0AA: iadd
		// @0AB: iconst_2
		// @0AC: iload #8
		// @0AE: imul
		// @0AF: iconst_2
		// @0B0: iload #8
		// @0B2: imul
		// @0B3: aload_0
		// @0B4: getfield int game.C_100059_df.field_101618_x
		// @0B7: iconst_2
		// @0B8: idiv
		// @0B9: aload_0
		// @0BA: getfield int game.C_100059_df.field_101598_C
		// @0BD: if_icmpgt @0D6
		// @0C0: sipush 500 (0x01F4)
		// @0C3: aload_0
		// @0C4: getfield int game.C_100059_df.field_101598_C
		// @0C7: imul
		// @0C8: aload_0
		// @0C9: getfield int game.C_100059_df.field_101618_x
		// @0CC: idiv
		// @0CD: ineg
		// @0CE: sipush 505 (0x01F9)
		// @0D1: iadd
		// @0D2: goto @0D9
		// @0D5: athrow
		// @0D6: sipush 255 (0x00FF)
		// @0D9: invokevirtual game.C_100251_pm.func_102359_a(int, int, int, int, int)void
		// @0DC: iload #9
		// @0DE: ifeq @41D
		// @0E1: aload_0
		// @0E2: getfield int game.C_100059_df.field_101608_P
		// @0E5: iconst_m1
		// @0E6: ixor
		// @0E7: bipush -2 (0xFE)
		// @0E9: if_icmpne @124
		// @0EC: goto @0F0
		// @0EF: athrow
		// @0F0: iload_2
		// @0F1: ifeq @0FC
		// @0F4: goto @0F8
		// @0F7: athrow
		// @0F8: goto @41D
		// @0FB: athrow
		// @0FC: bipush 16 (0x10)
		// @0FE: istore #8
		// @100: getstatic game.C_100037_wb[] game.C_100266_me.field_106651_e
		// @103: iload #7
		// @105: aaload
		// @106: iload #5
		// @108: iload #8
		// @10A: isub
		// @10B: iload #6
		// @10D: iload #8
		// @10F: ineg
		// @110: iadd
		// @111: iload #8
		// @113: iconst_2
		// @114: imul
		// @115: iload #8
		// @117: iconst_2
		// @118: imul
		// @119: sipush 128 (0x0080)
		// @11C: invokevirtual game.C_100037_wb.func_102377_b(int, int, int, int, int)void
		// @11F: iload #9
		// @121: ifeq @41D
		// @124: aload_0
		// @125: getfield int game.C_100059_df.field_101608_P
		// @128: iconst_m1
		// @129: ixor
		// @12A: bipush -4 (0xFC)
		// @12C: if_icmpne @163
		// @12F: goto @133
		// @132: athrow
		// @133: iload_2
		// @134: ifne @41D
		// @137: goto @13B
		// @13A: athrow
		// @13B: iconst_2
		// @13C: istore #8
		// @13E: getstatic game.C_100037_wb[] game.C_100266_me.field_106651_e
		// @141: iload #7
		// @143: aaload
		// @144: iload #8
		// @146: ineg
		// @147: iload #5
		// @149: iadd
		// @14A: iload #6
		// @14C: iload #8
		// @14E: ineg
		// @14F: iadd
		// @150: iload #8
		// @152: iconst_2
		// @153: imul
		// @154: iconst_2
		// @155: iload #8
		// @157: imul
		// @158: sipush 128 (0x0080)
		// @15B: invokevirtual game.C_100037_wb.func_102377_b(int, int, int, int, int)void
		// @15E: iload #9
		// @160: ifeq @41D
		// @163: aload_0
		// @164: getfield int game.C_100059_df.field_101608_P
		// @167: iconst_2
		// @168: if_icmpeq @3DE
		// @16B: goto @16F
		// @16E: athrow
		// @16F: aload_0
		// @170: getfield int game.C_100059_df.field_101608_P
		// @173: iconst_4
		// @174: if_icmpeq @3AA
		// @177: goto @17B
		// @17A: athrow
		// @17B: aload_0
		// @17C: getfield int game.C_100059_df.field_101608_P
		// @17F: iconst_5
		// @180: if_icmpne @1B7
		// @183: goto @187
		// @186: athrow
		// @187: iload_2
		// @188: ifne @41D
		// @18B: goto @18F
		// @18E: athrow
		// @18F: iconst_4
		// @190: istore #8
		// @192: getstatic game.C_100037_wb[] game.C_100101_fc.field_103405_Y
		// @195: iload #7
		// @197: aaload
		// @198: iload #5
		// @19A: iload #8
		// @19C: ineg
		// @19D: iadd
		// @19E: iload #8
		// @1A0: ineg
		// @1A1: iload #6
		// @1A3: iadd
		// @1A4: iconst_2
		// @1A5: iload #8
		// @1A7: imul
		// @1A8: iload #8
		// @1AA: iconst_2
		// @1AB: imul
		// @1AC: sipush 128 (0x0080)
		// @1AF: invokevirtual game.C_100037_wb.func_102377_b(int, int, int, int, int)void
		// @1B2: iload #9
		// @1B4: ifeq @41D
		// @1B7: bipush -7 (0xF9)
		// @1B9: aload_0
		// @1BA: getfield int game.C_100059_df.field_101608_P
		// @1BD: iconst_m1
		// @1BE: ixor
		// @1BF: if_icmpeq @377
		// @1C2: goto @1C6
		// @1C5: athrow
		// @1C6: bipush -8 (0xF8)
		// @1C8: aload_0
		// @1C9: getfield int game.C_100059_df.field_101608_P
		// @1CC: iconst_m1
		// @1CD: ixor
		// @1CE: if_icmpne @208
		// @1D1: goto @1D5
		// @1D4: athrow
		// @1D5: iload_2
		// @1D6: ifeq @1E1
		// @1D9: goto @1DD
		// @1DC: athrow
		// @1DD: goto @41D
		// @1E0: athrow
		// @1E1: iconst_1
		// @1E2: istore #8
		// @1E4: getstatic game.C_100037_wb[] game.C_100266_me.field_106651_e
		// @1E7: iload #7
		// @1E9: aaload
		// @1EA: iload #5
		// @1EC: iload #8
		// @1EE: ineg
		// @1EF: iadd
		// @1F0: iload #6
		// @1F2: iload #8
		// @1F4: isub
		// @1F5: iload #8
		// @1F7: iconst_2
		// @1F8: imul
		// @1F9: iconst_2
		// @1FA: iload #8
		// @1FC: imul
		// @1FD: sipush 128 (0x0080)
		// @200: invokevirtual game.C_100037_wb.func_102377_b(int, int, int, int, int)void
		// @203: iload #9
		// @205: ifeq @41D
		// @208: aload_0
		// @209: getfield int game.C_100059_df.field_101608_P
		// @20C: iconst_m1
		// @20D: ixor
		// @20E: bipush -9 (0xF7)
		// @210: if_icmpne @25F
		// @213: goto @217
		// @216: athrow
		// @217: iload_2
		// @218: ifeq @223
		// @21B: goto @21F
		// @21E: athrow
		// @21F: goto @41D
		// @222: athrow
		// @223: iconst_0
		// @224: bipush 15 (0x0F)
		// @226: bipush 16 (0x10)
		// @228: aload_0
		// @229: getfield int game.C_100059_df.field_101598_C
		// @22C: imul
		// @22D: aload_0
		// @22E: getfield int game.C_100059_df.field_101618_x
		// @231: idiv
		// @232: invokestatic java.lang.Math.min(int, int)int
		// @235: invokestatic java.lang.Math.max(int, int)int
		// @238: istore #7
		// @23A: iconst_4
		// @23B: istore #8
		// @23D: getstatic game.C_100251_pm[] game.C_100084_ug.field_104485_j
		// @240: iload #7
		// @242: aaload
		// @243: iload #5
		// @245: iload #8
		// @247: ineg
		// @248: iadd
		// @249: iload #8
		// @24B: ineg
		// @24C: iload #6
		// @24E: iadd
		// @24F: iconst_2
		// @250: iload #8
		// @252: imul
		// @253: iconst_2
		// @254: iload #8
		// @256: imul
		// @257: invokevirtual game.C_100251_pm.func_102364_d(int, int, int, int)void
		// @25A: iload #9
		// @25C: ifeq @41D
		// @25F: bipush -10 (0xF6)
		// @261: aload_0
		// @262: getfield int game.C_100059_df.field_101608_P
		// @265: iconst_m1
		// @266: ixor
		// @267: if_icmpne @2B0
		// @26A: goto @26E
		// @26D: athrow
		// @26E: iload_2
		// @26F: ifne @41D
		// @272: goto @276
		// @275: athrow
		// @276: iconst_4
		// @277: istore #8
		// @279: getstatic game.C_100037_wb[] game.C_100266_me.field_106651_e
		// @27C: bipush 7 (0x07)
		// @27E: iload #7
		// @280: ineg
		// @281: iadd
		// @282: aaload
		// @283: iload #5
		// @285: iload #8
		// @287: isub
		// @288: iload #8
		// @28A: ineg
		// @28B: iload #6
		// @28D: iadd
		// @28E: iload #8
		// @290: iconst_2
		// @291: imul
		// @292: iload #8
		// @294: iconst_2
		// @295: imul
		// @296: sipush 200 (0x00C8)
		// @299: aload_0
		// @29A: getfield int game.C_100059_df.field_101598_C
		// @29D: imul
		// @29E: aload_0
		// @29F: getfield int game.C_100059_df.field_101618_x
		// @2A2: idiv
		// @2A3: ineg
		// @2A4: sipush 200 (0x00C8)
		// @2A7: iadd
		// @2A8: invokevirtual game.C_100037_wb.func_102359_a(int, int, int, int, int)void
		// @2AB: iload #9
		// @2AD: ifeq @41D
		// @2B0: aload_0
		// @2B1: getfield int game.C_100059_df.field_101608_P
		// @2B4: bipush 12 (0x0C)
		// @2B6: if_icmpne @2FE
		// @2B9: goto @2BD
		// @2BC: athrow
		// @2BD: iload_2
		// @2BE: ifne @41D
		// @2C1: goto @2C5
		// @2C4: athrow
		// @2C5: iconst_2
		// @2C6: istore #8
		// @2C8: getstatic game.C_100037_wb[] game.C_100101_fc.field_103405_Y
		// @2CB: iconst_2
		// @2CC: iload #7
		// @2CE: iand
		// @2CF: aaload
		// @2D0: iload #5
		// @2D2: iload #8
		// @2D4: ineg
		// @2D5: iadd
		// @2D6: iload #8
		// @2D8: ineg
		// @2D9: iload #6
		// @2DB: iadd
		// @2DC: iload #8
		// @2DE: iconst_2
		// @2DF: imul
		// @2E0: iload #8
		// @2E2: iconst_2
		// @2E3: imul
		// @2E4: sipush 250 (0x00FA)
		// @2E7: aload_0
		// @2E8: getfield int game.C_100059_df.field_101598_C
		// @2EB: imul
		// @2EC: aload_0
		// @2ED: getfield int game.C_100059_df.field_101618_x
		// @2F0: idiv
		// @2F1: ineg
		// @2F2: sipush 250 (0x00FA)
		// @2F5: iadd
		// @2F6: invokevirtual game.C_100037_wb.func_102377_b(int, int, int, int, int)void
		// @2F9: iload #9
		// @2FB: ifeq @41D
		// @2FE: aload_0
		// @2FF: getfield int game.C_100059_df.field_101608_P
		// @302: iconst_m1
		// @303: ixor
		// @304: bipush -14 (0xF2)
		// @306: if_icmpeq @34E
		// @309: goto @30D
		// @30C: athrow
		// @30D: aload_0
		// @30E: getfield int game.C_100059_df.field_101608_P
		// @311: bipush 14 (0x0E)
		// @313: if_icmpne @41D
		// @316: goto @31A
		// @319: athrow
		// @31A: iload_2
		// @31B: ifne @41D
		// @31E: goto @322
		// @321: athrow
		// @322: iconst_2
		// @323: aload_0
		// @324: getfield int game.C_100059_df.field_101598_C
		// @327: ineg
		// @328: sipush 250 (0x00FA)
		// @32B: iadd
		// @32C: imul
		// @32D: bipush 125 (0x7D)
		// @32F: idiv
		// @330: istore #8
		// @332: iload #5
		// @334: ldc -1679623580 (0x9be2fa64)
		// @336: ishl
		// @337: iload #6
		// @339: ldc -1185769372 (0xb9529864)
		// @33B: ishl
		// @33C: iload #8
		// @33E: ldc 957204388 (0x390dc7a4)
		// @340: ishl
		// @341: bipush 31 (0x1F)
		// @343: getstatic int[] game.C_100129_tg.field_102747_tb
		// @346: invokestatic game.C_100196_rb.func_105787_a(int, int, int, int, int[])void
		// @349: iload #9
		// @34B: ifeq @41D
		// @34E: iload_2
		// @34F: ifne @41D
		// @352: goto @356
		// @355: athrow
		// @356: bipush 16 (0x10)
		// @358: istore #8
		// @35A: iload #5
		// @35C: ldc -1100027964 (0xbe6ee7c4)
		// @35E: ishl
		// @35F: iload #6
		// @361: ldc 1613298116 (0x6028f9c4)
		// @363: ishl
		// @364: iload #8
		// @366: ldc -488379132 (0xe2e3ed04)
		// @368: ishl
		// @369: sipush 249 (0x00F9)
		// @36C: getstatic int[] game.C_100129_tg.field_102753_wb
		// @36F: invokestatic game.C_100196_rb.func_105787_a(int, int, int, int, int[])void
		// @372: iload #9
		// @374: ifeq @41D
		// @377: iload_2
		// @378: ifeq @383
		// @37B: goto @37F
		// @37E: athrow
		// @37F: goto @41D
		// @382: athrow
		// @383: iconst_2
		// @384: istore #8
		// @386: getstatic game.C_100037_wb[] game.C_100101_fc.field_103405_Y
		// @389: iload #7
		// @38B: aaload
		// @38C: iload #5
		// @38E: iload #8
		// @390: ineg
		// @391: iadd
		// @392: iload #6
		// @394: iload #8
		// @396: isub
		// @397: iload #8
		// @399: iconst_2
		// @39A: imul
		// @39B: iload #8
		// @39D: iconst_2
		// @39E: imul
		// @39F: sipush 128 (0x0080)
		// @3A2: invokevirtual game.C_100037_wb.func_102377_b(int, int, int, int, int)void
		// @3A5: iload #9
		// @3A7: ifeq @41D
		// @3AA: iload_2
		// @3AB: ifeq @3B6
		// @3AE: goto @3B2
		// @3B1: athrow
		// @3B2: goto @41D
		// @3B5: athrow
		// @3B6: bipush 16 (0x10)
		// @3B8: istore #8
		// @3BA: getstatic game.C_100037_wb[] game.C_100101_fc.field_103405_Y
		// @3BD: iload #7
		// @3BF: aaload
		// @3C0: iload #8
		// @3C2: ineg
		// @3C3: iload #5
		// @3C5: iadd
		// @3C6: iload #6
		// @3C8: iload #8
		// @3CA: isub
		// @3CB: iconst_2
		// @3CC: iload #8
		// @3CE: imul
		// @3CF: iconst_2
		// @3D0: iload #8
		// @3D2: imul
		// @3D3: sipush 128 (0x0080)
		// @3D6: invokevirtual game.C_100037_wb.func_102377_b(int, int, int, int, int)void
		// @3D9: iload #9
		// @3DB: ifeq @41D
		// @3DE: iload_2
		// @3DF: ifeq @41D
		// @3E2: goto @3E6
		// @3E5: athrow
		// @3E6: iconst_0
		// @3E7: bipush 15 (0x0F)
		// @3E9: aload_0
		// @3EA: getfield int game.C_100059_df.field_101598_C
		// @3ED: bipush 16 (0x10)
		// @3EF: imul
		// @3F0: aload_0
		// @3F1: getfield int game.C_100059_df.field_101618_x
		// @3F4: idiv
		// @3F5: invokestatic java.lang.Math.min(int, int)int
		// @3F8: invokestatic java.lang.Math.max(int, int)int
		// @3FB: istore #7
		// @3FD: iconst_2
		// @3FE: istore #8
		// @400: getstatic game.C_100251_pm[] game.C_100084_ug.field_104485_j
		// @403: iload #7
		// @405: aaload
		// @406: iload #5
		// @408: iload #8
		// @40A: ineg
		// @40B: iadd
		// @40C: iload #8
		// @40E: ineg
		// @40F: iload #6
		// @411: iadd
		// @412: iconst_2
		// @413: iload #8
		// @415: imul
		// @416: iload #8
		// @418: iconst_2
		// @419: imul
		// @41A: invokevirtual game.C_100251_pm.func_102364_d(int, int, int, int)void
		// @41D: iload_3
		// @41E: sipush 4958 (0x135E)
		// @421: if_icmpeq @42C
		// @424: iconst_1
		// @425: putstatic boolean game.C_100059_df.field_101613_u
		// @428: goto @42C
		// @42B: athrow
		// @42C: goto @46E
		// @42F: astore #5
		// @431: aload #5
		// @433: new java.lang.StringBuilder
		// @436: dup
		// @437: invokespecial java.lang.StringBuilder.<init>()void
		// @43A: getstatic java.lang.String[] game.C_100059_df.field_101609_S
		// @43D: iconst_3
		// @43E: aaload
		// @43F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @442: iload_1
		// @443: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @446: bipush 44 (0x2C)
		// @448: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @44B: iload_2
		// @44C: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @44F: bipush 44 (0x2C)
		// @451: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @454: iload_3
		// @455: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @458: bipush 44 (0x2C)
		// @45A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @45D: iload #4
		// @45F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @462: bipush 41 (0x29)
		// @464: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @467: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @46A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @46D: athrow
		// @46E: return
	}
	
	final void func_101585_b(boolean arg0)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore_3
		// @004: iload_1
		// @005: ifeq @009
		// @008: return
		// @009: aload_0
		// @00A: getfield game.C_100294_ki game.C_100059_df.field_101596_A
		// @00D: ifnonnull @011
		// @010: return
		// @011: aload_0
		// @012: dup
		// @013: getfield int game.C_100059_df.field_101602_O
		// @016: aload_0
		// @017: getfield int game.C_100059_df.field_101595_G
		// @01A: iadd
		// @01B: putfield int game.C_100059_df.field_101602_O
		// @01E: aload_0
		// @01F: dup
		// @020: getfield int game.C_100059_df.field_101605_J
		// @023: aload_0
		// @024: getfield int game.C_100059_df.field_101607_Q
		// @027: iadd
		// @028: putfield int game.C_100059_df.field_101605_J
		// @02B: sipush -201 (0xFF37)
		// @02E: aload_0
		// @02F: getfield int game.C_100059_df.field_101598_C
		// @032: iconst_m1
		// @033: ixor
		// @034: if_icmplt @03B
		// @037: goto @04C
		// @03A: athrow
		// @03B: aload_0
		// @03C: dup
		// @03D: getfield int game.C_100059_df.field_101598_C
		// @040: invokestatic java.lang.Math.random()double
		// @043: ldc2_w 4.0
		// @046: dmul
		// @047: d2i
		// @048: iadd
		// @049: putfield int game.C_100059_df.field_101598_C
		// @04C: aload_0
		// @04D: getfield game.C_100294_ki game.C_100059_df.field_101596_A
		// @050: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @053: sipush 26294 (0x66B6)
		// @056: invokevirtual game.C_100171_cn.func_105559_a(int)int
		// @059: iconst_4
		// @05A: if_icmpne @061
		// @05D: goto @2A1
		// @060: athrow
		// @061: aload_0
		// @062: getfield boolean game.C_100059_df.field_101617_y
		// @065: ifeq @156
		// @068: aload_0
		// @069: getfield game.C_100294_ki game.C_100059_df.field_101596_A
		// @06C: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @06F: ldc 830205956 (0x317bf004)
		// @071: aload_0
		// @072: getfield int game.C_100059_df.field_101602_O
		// @075: ldc -1266522588 (0xb4826624)
		// @077: ishr
		// @078: invokevirtual game.C_100171_cn.func_105563_a(int, int)int
		// @07B: aload_0
		// @07C: getfield int game.C_100059_df.field_101605_J
		// @07F: ldc -1081539388 (0xbf8904c4)
		// @081: ishr
		// @082: ineg
		// @083: if_icmplt @08E
		// @086: goto @08A
		// @089: athrow
		// @08A: goto @260
		// @08D: athrow
		// @08E: aload_0
		// @08F: getfield int game.C_100059_df.field_101608_P
		// @092: iconst_2
		// @093: if_icmpeq @0CE
		// @096: bipush -4 (0xFC)
		// @098: aload_0
		// @099: getfield int game.C_100059_df.field_101608_P
		// @09C: iconst_m1
		// @09D: ixor
		// @09E: if_icmpeq @0CE
		// @0A1: goto @0A5
		// @0A4: athrow
		// @0A5: aload_0
		// @0A6: getfield int game.C_100059_df.field_101608_P
		// @0A9: iconst_m1
		// @0AA: ixor
		// @0AB: bipush -10 (0xF6)
		// @0AD: if_icmpeq @0CE
		// @0B0: goto @0B4
		// @0B3: athrow
		// @0B4: bipush 10 (0x0A)
		// @0B6: aload_0
		// @0B7: getfield int game.C_100059_df.field_101608_P
		// @0BA: if_icmpeq @0CE
		// @0BD: goto @0C1
		// @0C0: athrow
		// @0C1: aload_0
		// @0C2: getfield int game.C_100059_df.field_101608_P
		// @0C5: bipush 6 (0x06)
		// @0C7: if_icmpne @100
		// @0CA: goto @0CE
		// @0CD: athrow
		// @0CE: aload_0
		// @0CF: getfield game.C_100294_ki game.C_100059_df.field_101596_A
		// @0D2: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @0D5: ldc 830205956 (0x317bf004)
		// @0D7: aload_0
		// @0D8: getfield int game.C_100059_df.field_101602_O
		// @0DB: ldc 676877412 (0x28585464)
		// @0DD: ishr
		// @0DE: invokevirtual game.C_100171_cn.func_105563_a(int, int)int
		// @0E1: aload_0
		// @0E2: getfield game.C_100294_ki game.C_100059_df.field_101596_A
		// @0E5: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @0E8: sipush -25357 (0x9CF3)
		// @0EB: aload_0
		// @0EC: getfield int game.C_100059_df.field_101602_O
		// @0EF: ldc -487332540 (0xe2f3e544)
		// @0F1: ishr
		// @0F2: invokevirtual game.C_100171_cn.func_105555_b(int, int)int
		// @0F5: if_icmpne @100
		// @0F8: goto @0FC
		// @0FB: athrow
		// @0FC: goto @11B
		// @0FF: athrow
		// @100: aload_0
		// @101: aload_0
		// @102: getfield game.C_100294_ki game.C_100059_df.field_101596_A
		// @105: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @108: ldc 830205956 (0x317bf004)
		// @10A: aload_0
		// @10B: getfield int game.C_100059_df.field_101602_O
		// @10E: ldc -863873884 (0xcc8254a4)
		// @110: ishr
		// @111: invokevirtual game.C_100171_cn.func_105563_a(int, int)int
		// @114: ldc -1371293372 (0xae43b944)
		// @116: ishl
		// @117: ineg
		// @118: putfield int game.C_100059_df.field_101605_J
		// @11B: aload_0
		// @11C: getfield game.C_100294_ki game.C_100059_df.field_101596_A
		// @11F: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @122: ldc 830205956 (0x317bf004)
		// @124: aload_0
		// @125: getfield int game.C_100059_df.field_101602_O
		// @128: ldc 1931599076 (0x7321dce4)
		// @12A: ishr
		// @12B: invokevirtual game.C_100171_cn.func_105563_a(int, int)int
		// @12E: iconst_m1
		// @12F: ixor
		// @130: aload_0
		// @131: getfield game.C_100294_ki game.C_100059_df.field_101596_A
		// @134: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @137: sipush -25357 (0x9CF3)
		// @13A: aload_0
		// @13B: getfield int game.C_100059_df.field_101602_O
		// @13E: ldc 1283902756 (0x4c86cd24)
		// @140: ishr
		// @141: invokevirtual game.C_100171_cn.func_105555_b(int, int)int
		// @144: iconst_m1
		// @145: ixor
		// @146: if_icmpne @260
		// @149: aload_0
		// @14A: iconst_0
		// @14B: putfield boolean game.C_100059_df.field_101617_y
		// @14E: iload_3
		// @14F: ifeq @260
		// @152: goto @156
		// @155: athrow
		// @156: aload_0
		// @157: getfield game.C_100294_ki game.C_100059_df.field_101596_A
		// @15A: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @15D: sipush -25357 (0x9CF3)
		// @160: aload_0
		// @161: getfield int game.C_100059_df.field_101602_O
		// @164: ldc 341788644 (0x145f47e4)
		// @166: ishr
		// @167: invokevirtual game.C_100171_cn.func_105555_b(int, int)int
		// @16A: aload_0
		// @16B: getfield int game.C_100059_df.field_101605_J
		// @16E: ldc 1405789220 (0x53caa424)
		// @170: ishr
		// @171: ineg
		// @172: if_icmple @260
		// @175: goto @179
		// @178: athrow
		// @179: iconst_2
		// @17A: aload_0
		// @17B: getfield game.C_100294_ki game.C_100059_df.field_101596_A
		// @17E: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @181: sipush 26294 (0x66B6)
		// @184: invokevirtual game.C_100171_cn.func_105559_a(int)int
		// @187: if_icmpne @1C8
		// @18A: goto @18E
		// @18D: athrow
		// @18E: sipush -2049 (0xF7FF)
		// @191: aload_0
		// @192: getfield game.C_100294_ki game.C_100059_df.field_101596_A
		// @195: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @198: sipush -25357 (0x9CF3)
		// @19B: aload_0
		// @19C: getfield int game.C_100059_df.field_101602_O
		// @19F: ldc -1512280348 (0xa5dc6ee4)
		// @1A1: ishr
		// @1A2: invokevirtual game.C_100171_cn.func_105555_b(int, int)int
		// @1A5: iconst_m1
		// @1A6: ixor
		// @1A7: if_icmple @1C8
		// @1AA: goto @1AE
		// @1AD: athrow
		// @1AE: aload_0
		// @1AF: dup
		// @1B0: getfield int game.C_100059_df.field_101602_O
		// @1B3: aload_0
		// @1B4: getfield int game.C_100059_df.field_101595_G
		// @1B7: isub
		// @1B8: putfield int game.C_100059_df.field_101602_O
		// @1BB: aload_0
		// @1BC: iconst_0
		// @1BD: putfield int game.C_100059_df.field_101595_G
		// @1C0: iload_3
		// @1C1: ifeq @260
		// @1C4: goto @1C8
		// @1C7: athrow
		// @1C8: aload_0
		// @1C9: getfield int game.C_100059_df.field_101608_P
		// @1CC: iconst_m1
		// @1CD: ixor
		// @1CE: bipush -3 (0xFD)
		// @1D0: if_icmpeq @20E
		// @1D3: goto @1D7
		// @1D6: athrow
		// @1D7: aload_0
		// @1D8: getfield int game.C_100059_df.field_101608_P
		// @1DB: iconst_3
		// @1DC: if_icmpeq @20E
		// @1DF: goto @1E3
		// @1E2: athrow
		// @1E3: bipush -10 (0xF6)
		// @1E5: aload_0
		// @1E6: getfield int game.C_100059_df.field_101608_P
		// @1E9: iconst_m1
		// @1EA: ixor
		// @1EB: if_icmpeq @20E
		// @1EE: goto @1F2
		// @1F1: athrow
		// @1F2: bipush -11 (0xF5)
		// @1F4: aload_0
		// @1F5: getfield int game.C_100059_df.field_101608_P
		// @1F8: iconst_m1
		// @1F9: ixor
		// @1FA: if_icmpeq @20E
		// @1FD: goto @201
		// @200: athrow
		// @201: aload_0
		// @202: getfield int game.C_100059_df.field_101608_P
		// @205: bipush 6 (0x06)
		// @207: if_icmpne @240
		// @20A: goto @20E
		// @20D: athrow
		// @20E: aload_0
		// @20F: getfield game.C_100294_ki game.C_100059_df.field_101596_A
		// @212: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @215: ldc 830205956 (0x317bf004)
		// @217: aload_0
		// @218: getfield int game.C_100059_df.field_101602_O
		// @21B: ldc -932464060 (0xc86bba44)
		// @21D: ishr
		// @21E: invokevirtual game.C_100171_cn.func_105563_a(int, int)int
		// @221: iconst_m1
		// @222: ixor
		// @223: aload_0
		// @224: getfield game.C_100294_ki game.C_100059_df.field_101596_A
		// @227: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @22A: sipush -25357 (0x9CF3)
		// @22D: aload_0
		// @22E: getfield int game.C_100059_df.field_101602_O
		// @231: ldc 837576932 (0x31ec68e4)
		// @233: ishr
		// @234: invokevirtual game.C_100171_cn.func_105555_b(int, int)int
		// @237: iconst_m1
		// @238: ixor
		// @239: if_icmpeq @260
		// @23C: goto @240
		// @23F: athrow
		// @240: aload_0
		// @241: aload_0
		// @242: getfield game.C_100294_ki game.C_100059_df.field_101596_A
		// @245: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @248: sipush -25357 (0x9CF3)
		// @24B: aload_0
		// @24C: getfield int game.C_100059_df.field_101602_O
		// @24F: ldc 2034008420 (0x793c8164)
		// @251: ishr
		// @252: invokevirtual game.C_100171_cn.func_105555_b(int, int)int
		// @255: ldc 650318436 (0x26c31264)
		// @257: ishl
		// @258: ineg
		// @259: putfield int game.C_100059_df.field_101605_J
		// @25C: goto @260
		// @25F: athrow
		// @260: aload_0
		// @261: getfield game.C_100294_ki game.C_100059_df.field_101596_A
		// @264: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @267: bipush 109 (0x6D)
		// @269: aload_0
		// @26A: getfield int game.C_100059_df.field_101602_O
		// @26D: ldc 436987236 (0x1a0be564)
		// @26F: ishr
		// @270: invokevirtual game.C_100171_cn.func_105560_c(int, int)int
		// @273: iconst_m1
		// @274: ixor
		// @275: aload_0
		// @276: getfield int game.C_100059_df.field_101605_J
		// @279: ldc 690250660 (0x292463a4)
		// @27B: ishr
		// @27C: ineg
		// @27D: iconst_m1
		// @27E: ixor
		// @27F: if_icmplt @286
		// @282: goto @2A1
		// @285: athrow
		// @286: aload_0
		// @287: aload_0
		// @288: getfield game.C_100294_ki game.C_100059_df.field_101596_A
		// @28B: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @28E: bipush -75 (0xB5)
		// @290: aload_0
		// @291: getfield int game.C_100059_df.field_101602_O
		// @294: ldc -1107886140 (0xbdf6ffc4)
		// @296: ishr
		// @297: invokevirtual game.C_100171_cn.func_105560_c(int, int)int
		// @29A: ldc 193861508 (0xb8e1784)
		// @29C: ishl
		// @29D: ineg
		// @29E: putfield int game.C_100059_df.field_101605_J
		// @2A1: aload_0
		// @2A2: getfield int game.C_100059_df.field_101608_P
		// @2A5: bipush 10 (0x0A)
		// @2A7: if_icmpeq @2CE
		// @2AA: aload_0
		// @2AB: bipush 9 (0x09)
		// @2AD: aload_0
		// @2AE: getfield int game.C_100059_df.field_101595_G
		// @2B1: imul
		// @2B2: bipush 10 (0x0A)
		// @2B4: idiv
		// @2B5: putfield int game.C_100059_df.field_101595_G
		// @2B8: aload_0
		// @2B9: aload_0
		// @2BA: getfield int game.C_100059_df.field_101607_Q
		// @2BD: bipush 9 (0x09)
		// @2BF: imul
		// @2C0: bipush 10 (0x0A)
		// @2C2: idiv
		// @2C3: putfield int game.C_100059_df.field_101607_Q
		// @2C6: iload_3
		// @2C7: ifeq @30B
		// @2CA: goto @2CE
		// @2CD: athrow
		// @2CE: aload_0
		// @2CF: dup
		// @2D0: getfield int game.C_100059_df.field_101607_Q
		// @2D3: aload_0
		// @2D4: getfield game.C_100294_ki game.C_100059_df.field_101596_A
		// @2D7: getfield int game.C_100294_ki.field_106964_J
		// @2DA: iadd
		// @2DB: putfield int game.C_100059_df.field_101607_Q
		// @2DE: aload_0
		// @2DF: getfield int game.C_100059_df.field_101610_R
		// @2E2: iconst_0
		// @2E3: aload_0
		// @2E4: getfield boolean game.C_100059_df.field_101617_y
		// @2E7: aload_0
		// @2E8: getfield int game.C_100059_df.field_101605_J
		// @2EB: iconst_0
		// @2EC: aload_0
		// @2ED: getfield game.C_100294_ki game.C_100059_df.field_101596_A
		// @2F0: bipush -124 (0x84)
		// @2F2: aload_0
		// @2F3: getfield int game.C_100059_df.field_101602_O
		// @2F6: bipush 9 (0x09)
		// @2F8: bipush 100 (0x64)
		// @2FA: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @2FD: astore_2
		// @2FE: aload_0
		// @2FF: getfield game.C_100294_ki game.C_100059_df.field_101596_A
		// @302: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @305: bipush 124 (0x7C)
		// @307: aload_2
		// @308: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @30B: aload_0
		// @30C: dup
		// @30D: getfield int game.C_100059_df.field_101598_C
		// @310: iconst_1
		// @311: iadd
		// @312: putfield int game.C_100059_df.field_101598_C
		// @315: aload_0
		// @316: getfield int game.C_100059_df.field_101598_C
		// @319: aload_0
		// @31A: getfield int game.C_100059_df.field_101618_x
		// @31D: if_icmple @331
		// @320: aload_0
		// @321: getfield game.C_100294_ki game.C_100059_df.field_101596_A
		// @324: getfield game.C_100300_kc game.C_100294_ki.field_106950_D
		// @327: bipush 125 (0x7D)
		// @329: aload_0
		// @32A: invokevirtual game.C_100300_kc.func_107058_a(int, game.C_100325_id)void
		// @32D: goto @331
		// @330: athrow
		// @331: goto @355
		// @334: astore_2
		// @335: aload_2
		// @336: new java.lang.StringBuilder
		// @339: dup
		// @33A: invokespecial java.lang.StringBuilder.<init>()void
		// @33D: getstatic java.lang.String[] game.C_100059_df.field_101609_S
		// @340: iconst_1
		// @341: aaload
		// @342: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @345: iload_1
		// @346: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @349: bipush 41 (0x29)
		// @34B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @34E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @351: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @354: athrow
		// @355: return
	}
	
	static
	{
		// @000: iconst_5
		// @001: anewarray java.lang.String
		// @004: dup
		// @005: iconst_0
		// @006: ldc "uL&K\u007f"
		// @008: invokestatic game.C_100059_df.func_101589_z(java.lang.String)char[]
		// @00B: invokestatic game.C_100059_df.func_101588_z(char[])java.lang.String
		// @00E: aastore
		// @00F: dup
		// @010: iconst_1
		// @011: ldc "uL&J\u007f"
		// @013: invokestatic game.C_100059_df.func_101589_z(java.lang.String)char[]
		// @016: invokestatic game.C_100059_df.func_101588_z(char[])java.lang.String
		// @019: aastore
		// @01A: dup
		// @01B: iconst_2
		// @01C: ldc "uL&L\u007f"
		// @01E: invokestatic game.C_100059_df.func_101589_z(java.lang.String)char[]
		// @021: invokestatic game.C_100059_df.func_101588_z(char[])java.lang.String
		// @024: aastore
		// @025: dup
		// @026: iconst_3
		// @027: ldc "uL&M\u007f"
		// @029: invokestatic game.C_100059_df.func_101589_z(java.lang.String)char[]
		// @02C: invokestatic game.C_100059_df.func_101588_z(char[])java.lang.String
		// @02F: aastore
		// @030: dup
		// @031: iconst_4
		// @032: ldc "uL&I\u007f"
		// @034: invokestatic game.C_100059_df.func_101589_z(java.lang.String)char[]
		// @037: invokestatic game.C_100059_df.func_101588_z(char[])java.lang.String
		// @03A: aastore
		// @03B: putstatic java.lang.String[] game.C_100059_df.field_101609_S
		// @03E: iconst_3
		// @03F: newarray byte[]
		// @041: dup
		// @042: iconst_0
		// @043: iconst_2
		// @044: bastore
		// @045: dup
		// @046: iconst_1
		// @047: iconst_3
		// @048: bastore
		// @049: dup
		// @04A: iconst_2
		// @04B: bipush 6 (0x06)
		// @04D: bastore
		// @04E: putstatic byte[] game.C_100059_df.field_101603_H
		// @051: ldc "-\u000f96wfK{(3tY|z8hOl(5h\n4-g/"
		// @053: invokestatic game.C_100059_df.func_101589_z(java.lang.String)char[]
		// @056: invokestatic game.C_100059_df.func_101588_z(char[])java.lang.String
		// @059: putstatic java.lang.String game.C_100059_df.field_101594_F
		// @05C: bipush 48 (0x30)
		// @05E: putstatic int game.C_100059_df.field_101592_D
		// @061: ldc "RKem%p\n}xxuE\u007ffm1dgz:pF"
		// @063: invokestatic game.C_100059_df.func_101589_z(java.lang.String)char[]
		// @066: invokestatic game.C_100059_df.func_101588_z(char[])java.lang.String
		// @069: putstatic java.lang.String game.C_100059_df.field_101606_K
		// @06C: ldc "HE}(?p\\m(3tIda9tN(|?t\naf!x^i|>~D&"
		// @06E: invokestatic game.C_100059_df.func_101589_z(java.lang.String)char[]
		// @071: invokestatic game.C_100059_df.func_101588_z(char[])java.lang.String
		// @074: putstatic java.lang.String game.C_100059_df.field_101616_z
		// @077: bipush 11 (0x0B)
		// @079: newarray int[]
		// @07B: dup
		// @07C: iconst_0
		// @07D: bipush 108 (0x6C)
		// @07F: iastore
		// @080: dup
		// @081: iconst_1
		// @082: iconst_m1
		// @083: iastore
		// @084: dup
		// @085: iconst_2
		// @086: bipush 30 (0x1E)
		// @088: iastore
		// @089: dup
		// @08A: iconst_3
		// @08B: bipush 28 (0x1C)
		// @08D: iastore
		// @08E: dup
		// @08F: iconst_4
		// @090: bipush 29 (0x1D)
		// @092: iastore
		// @093: dup
		// @094: iconst_5
		// @095: iconst_m1
		// @096: iastore
		// @097: dup
		// @098: bipush 6 (0x06)
		// @09A: iconst_m1
		// @09B: iastore
		// @09C: dup
		// @09D: bipush 7 (0x07)
		// @09F: iconst_m1
		// @0A0: iastore
		// @0A1: dup
		// @0A2: bipush 8 (0x08)
		// @0A4: iconst_m1
		// @0A5: iastore
		// @0A6: dup
		// @0A7: bipush 9 (0x09)
		// @0A9: iconst_m1
		// @0AA: iastore
		// @0AB: dup
		// @0AC: bipush 10 (0x0A)
		// @0AE: iconst_m1
		// @0AF: iastore
		// @0B0: putstatic int[] game.C_100059_df.field_101600_M
		// @0B3: iconst_0
		// @0B4: putstatic int game.C_100059_df.field_101611_w
		// @0B7: ldc "W_dd"
		// @0B9: invokestatic game.C_100059_df.func_101589_z(java.lang.String)char[]
		// @0BC: invokestatic game.C_100059_df.func_101588_z(char[])java.lang.String
		// @0BF: putstatic java.lang.String game.C_100059_df.field_101612_v
		// @0C2: bipush 6 (0x06)
		// @0C4: anewarray java.lang.String
		// @0C7: dup
		// @0C8: iconst_0
		// @0C9: ldc "_kEM"
		// @0CB: invokestatic game.C_100059_df.func_101589_z(java.lang.String)char[]
		// @0CE: invokestatic game.C_100059_df.func_101588_z(char[])java.lang.String
		// @0D1: aastore
		// @0D2: dup
		// @0D3: iconst_1
		// @0D4: ldc "Ck\\A\u0019V"
		// @0D6: invokestatic game.C_100059_df.func_101589_z(java.lang.String)char[]
		// @0D9: invokestatic game.C_100059_df.func_101588_z(char[])java.lang.String
		// @0DC: aastore
		// @0DD: dup
		// @0DE: iconst_2
		// @0DF: ldc "AfIQ\u0012U"
		// @0E1: invokestatic game.C_100059_df.func_101589_z(java.lang.String)char[]
		// @0E4: invokestatic game.C_100059_df.func_101588_z(char[])java.lang.String
		// @0E7: aastore
		// @0E8: dup
		// @0E9: iconst_3
		// @0EA: ldc "FeF"
		// @0EC: invokestatic game.C_100059_df.func_101589_z(java.lang.String)char[]
		// @0EF: invokestatic game.C_100059_df.func_101588_z(char[])java.lang.String
		// @0F2: aastore
		// @0F3: dup
		// @0F4: iconst_4
		// @0F5: ldc "UxI_\u0019"
		// @0F7: invokestatic game.C_100059_df.func_101589_z(java.lang.String)char[]
		// @0FA: invokestatic game.C_100059_df.func_101588_z(char[])java.lang.String
		// @0FD: aastore
		// @0FE: dup
		// @0FF: iconst_5
		// @100: ldc "]e[\\"
		// @102: invokestatic game.C_100059_df.func_101589_z(java.lang.String)char[]
		// @105: invokestatic game.C_100059_df.func_101588_z(char[])java.lang.String
		// @108: aastore
		// @109: putstatic java.lang.String[] game.C_100059_df.field_101597_B
		// @10C: bipush 6 (0x06)
		// @10E: anewarray java.lang.String
		// @111: dup
		// @112: iconst_0
		// @113: ldc "\\E~mwsKkcweE(|?t\nxz2gCg}$1Gmf\"1Fm~2}\u0004"
		// @115: invokestatic game.C_100059_df.func_101589_z(java.lang.String)char[]
		// @118: invokestatic game.C_100059_df.func_101588_z(char[])java.lang.String
		// @11B: aastore
		// @11C: dup
		// @11D: iconst_1
		// @11E: ldc "CO|}%\u007f\n|gweBm(#~Z(d2gOd(8w\n|`21Gmf\"?"
		// @120: invokestatic game.C_100059_df.func_101589_z(java.lang.String)char[]
		// @123: invokestatic game.C_100059_df.func_101588_z(char[])java.lang.String
		// @126: aastore
		// @127: dup
		// @128: iconst_2
		// @129: ldc "P_|gzcO{x8\u007fN(|81^`mw}K{|weBaf01Cf(.~_z(4yK|( xDlg ?"
		// @12B: invokestatic game.C_100059_df.func_101589_z(java.lang.String)char[]
		// @12E: invokestatic game.C_100059_df.func_101588_z(char[])java.lang.String
		// @131: aastore
		// @132: dup
		// @133: iconst_3
		// @134: ldc "^ZmfweBm(\u0006dCkcwRBi|w|Of}y"
		// @136: invokestatic game.C_100059_df.func_101589_z(java.lang.String)char[]
		// @139: invokestatic game.C_100059_df.func_101588_z(char[])java.lang.String
		// @13C: aastore
		// @13D: dup
		// @13E: iconst_4
		// @13F: ldc "COxm6e\n|`21Fi{#1^`a9v\nqg\"1Yia3?"
		// @141: invokestatic game.C_100059_df.func_101589_z(java.lang.String)char[]
		// @144: invokestatic game.C_100059_df.func_101588_z(char[])java.lang.String
		// @147: aastore
		// @148: dup
		// @149: iconst_5
		// @14A: ldc "RFg{21^`mw@_ak<1i`i#1Gmf\"?"
		// @14C: invokestatic game.C_100059_df.func_101589_z(java.lang.String)char[]
		// @14F: invokestatic game.C_100059_df.func_101588_z(char[])java.lang.String
		// @152: aastore
		// @153: putstatic java.lang.String[] game.C_100059_df.field_101601_N
		// @156: return
	}
	
	private static char[] func_101589_z(String arg0)
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
		// @0E: bipush 87 (0x57)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_101588_z(char[] arg0)
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
		// @30: bipush 17 (0x11)
		// @32: goto @46
		// @35: bipush 42 (0x2A)
		// @37: goto @46
		// @3A: bipush 8 (0x08)
		// @3C: goto @46
		// @3F: bipush 8 (0x08)
		// @41: goto @46
		// @44: bipush 87 (0x57)
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
