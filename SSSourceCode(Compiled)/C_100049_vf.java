package game;

final class C_100049_vf
{
	int field_104203_a;
	int field_104216_s;
	int field_104198_g;
	int field_104209_k;
	static int field_104204_n;
	boolean field_104211_i;
	int field_104200_e;
	String field_104214_u;
	C_100327_ib field_104201_b;
	int field_104202_c;
	int field_104213_v;
	static boolean field_104210_h;
	static C_100037_wb[] field_104212_w;
	int field_104197_f;
	int field_104199_d;
	int field_104218_q;
	int field_104215_t;
	int field_104219_p;
	static String field_104205_o;
	int field_104208_j;
	static C_100185_rm field_104206_l;
	int field_104207_m;
	static String field_104217_r;
	private static final String[] field_104220_z;
	
	static final int func_104196_a(boolean arg0, int arg1)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #5
		// @005: getstatic int game.C_100113_ek.field_104882_a
		// @008: ldc 65536 (0x10000)
		// @00A: iadd
		// @00B: putstatic int game.C_100113_ek.field_104882_a
		// @00E: ldc 65536 (0x10000)
		// @010: getstatic int game.C_100338_jc.field_105366_e
		// @013: getstatic int game.C_100113_ek.field_104882_a
		// @016: bipush 49 (0x31)
		// @018: invokestatic game.C_100087_n.func_100684_a(int, int, byte)int
		// @01B: if_icmpgt @03E
		// @01E: getstatic int game.C_100287_nm.field_106826_b
		// @021: iconst_1
		// @022: iadd
		// @023: putstatic int game.C_100287_nm.field_106826_b
		// @026: getstatic int game.C_100113_ek.field_104882_a
		// @029: getstatic int game.C_100338_jc.field_105366_e
		// @02C: isub
		// @02D: iload #5
		// @02F: ifne @03F
		// @032: putstatic int game.C_100113_ek.field_104882_a
		// @035: iload #5
		// @037: ifeq @00E
		// @03A: goto @03E
		// @03D: athrow
		// @03E: iconst_m1
		// @03F: istore_2
		// @040: aconst_null
		// @041: getstatic game.C_100037_wb[] game.C_100097_k.field_104584_a
		// @044: if_acmpne @05F
		// @047: getstatic game.C_100037_wb[] game.C_100053_vn.field_102845_Z
		// @04A: ifnonnull @055
		// @04D: goto @051
		// @050: athrow
		// @051: goto @064
		// @054: athrow
		// @055: getstatic game.C_100037_wb[] game.C_100053_vn.field_102845_Z
		// @058: arraylength
		// @059: istore_2
		// @05A: iload #5
		// @05C: ifeq @064
		// @05F: getstatic game.C_100037_wb[] game.C_100097_k.field_104584_a
		// @062: arraylength
		// @063: istore_2
		// @064: iload_1
		// @065: bipush -26 (0xE6)
		// @067: if_icmplt @075
		// @06A: aconst_null
		// @06B: checkcast java.lang.String
		// @06E: putstatic java.lang.String game.C_100049_vf.field_104217_r
		// @071: goto @075
		// @074: athrow
		// @075: iload_2
		// @076: iconst_m1
		// @077: if_icmpne @07E
		// @07A: goto @177
		// @07D: athrow
		// @07E: getstatic int game.C_100042_we.field_104137_m
		// @081: getstatic int game.C_100338_jc.field_105373_k
		// @084: if_icmpge @0F6
		// @087: getstatic int game.C_100042_we.field_104137_m
		// @08A: iconst_1
		// @08B: iadd
		// @08C: putstatic int game.C_100042_we.field_104137_m
		// @08F: getstatic int game.C_100338_jc.field_105367_b
		// @092: getstatic int game.C_100042_we.field_104137_m
		// @095: if_icmpge @0C7
		// @098: goto @09C
		// @09B: athrow
		// @09C: aconst_null
		// @09D: getstatic game.C_100037_wb[] game.C_100097_k.field_104584_a
		// @0A0: if_acmpeq @0B6
		// @0A3: goto @0A7
		// @0A6: athrow
		// @0A7: aconst_null
		// @0A8: getstatic game.C_100037_wb[] game.C_100097_k.field_104584_a
		// @0AB: getstatic int game.C_100292_jk.field_101215_r
		// @0AE: aaload
		// @0AF: if_acmpne @0C7
		// @0B2: goto @0B6
		// @0B5: athrow
		// @0B6: getstatic int game.C_100042_we.field_104137_m
		// @0B9: iconst_1
		// @0BA: isub
		// @0BB: putstatic int game.C_100042_we.field_104137_m
		// @0BE: iload #5
		// @0C0: ifeq @0F6
		// @0C3: goto @0C7
		// @0C6: athrow
		// @0C7: getstatic int game.C_100338_jc.field_105373_k
		// @0CA: iconst_m1
		// @0CB: ixor
		// @0CC: getstatic int game.C_100042_we.field_104137_m
		// @0CF: iconst_m1
		// @0D0: ixor
		// @0D1: if_icmplt @0F6
		// @0D4: goto @0D8
		// @0D7: athrow
		// @0D8: getstatic game.C_100037_wb[] game.C_100097_k.field_104584_a
		// @0DB: getstatic int game.C_100292_jk.field_101215_r
		// @0DE: iconst_m1
		// @0DF: isub
		// @0E0: iload_2
		// @0E1: irem
		// @0E2: aaload
		// @0E3: ifnonnull @0F6
		// @0E6: goto @0EA
		// @0E9: athrow
		// @0EA: getstatic int game.C_100042_we.field_104137_m
		// @0ED: iconst_1
		// @0EE: isub
		// @0EF: putstatic int game.C_100042_we.field_104137_m
		// @0F2: goto @0F6
		// @0F5: athrow
		// @0F6: getstatic int game.C_100042_we.field_104137_m
		// @0F9: iconst_m1
		// @0FA: ixor
		// @0FB: getstatic int game.C_100338_jc.field_105373_k
		// @0FE: iconst_m1
		// @0FF: ixor
		// @100: if_icmpgt @166
		// @103: getstatic int game.C_100292_jk.field_101215_r
		// @106: putstatic int game.C_100107_u.field_104772_e
		// @109: getstatic boolean game.C_100145_ta.field_100427_l
		// @10C: ifne @139
		// @10F: goto @113
		// @112: athrow
		// @113: getstatic int game.C_100292_jk.field_101215_r
		// @116: iconst_1
		// @117: isub
		// @118: putstatic int game.C_100292_jk.field_101215_r
		// @11B: getstatic int game.C_100292_jk.field_101215_r
		// @11E: iconst_m1
		// @11F: ixor
		// @120: iconst_m1
		// @121: if_icmpgt @12C
		// @124: goto @128
		// @127: athrow
		// @128: goto @15C
		// @12B: athrow
		// @12C: getstatic int game.C_100292_jk.field_101215_r
		// @12F: iload_2
		// @130: iadd
		// @131: putstatic int game.C_100292_jk.field_101215_r
		// @134: iload #5
		// @136: ifeq @15C
		// @139: getstatic int game.C_100292_jk.field_101215_r
		// @13C: iconst_1
		// @13D: iadd
		// @13E: putstatic int game.C_100292_jk.field_101215_r
		// @141: iload_2
		// @142: iconst_m1
		// @143: ixor
		// @144: getstatic int game.C_100292_jk.field_101215_r
		// @147: iconst_m1
		// @148: ixor
		// @149: if_icmplt @15C
		// @14C: goto @150
		// @14F: athrow
		// @150: getstatic int game.C_100292_jk.field_101215_r
		// @153: iload_2
		// @154: isub
		// @155: putstatic int game.C_100292_jk.field_101215_r
		// @158: goto @15C
		// @15B: athrow
		// @15C: getstatic int game.C_100042_we.field_104137_m
		// @15F: getstatic int game.C_100338_jc.field_105373_k
		// @162: isub
		// @163: putstatic int game.C_100042_we.field_104137_m
		// @166: getstatic int game.C_100338_jc.field_105367_b
		// @169: getstatic int game.C_100042_we.field_104137_m
		// @16C: if_icmpge @177
		// @16F: iconst_1
		// @170: putstatic boolean game.C_100145_ta.field_100427_l
		// @173: goto @177
		// @176: athrow
		// @177: aconst_null
		// @178: getstatic game.C_100037_wb game.C_100309_lk.field_103275_Z
		// @17B: if_acmpne @182
		// @17E: goto @2AB
		// @181: athrow
		// @182: getstatic game.C_100037_wb game.C_100309_lk.field_103275_Z
		// @185: getfield int game.C_100037_wb.field_102340_z
		// @188: iconst_2
		// @189: idiv
		// @18A: ineg
		// @18B: sipush 357 (0x0165)
		// @18E: iadd
		// @18F: istore_3
		// @190: iconst_0
		// @191: istore #4
		// @193: iconst_0
		// @194: getstatic int game.C_100102_w.field_104636_c
		// @197: if_icmpeq @221
		// @19A: getstatic int game.C_100125_tm.field_100745_p
		// @19D: iconst_m1
		// @19E: ixor
		// @19F: iload_3
		// @1A0: iconst_m1
		// @1A1: ixor
		// @1A2: if_icmpge @221
		// @1A5: goto @1A9
		// @1A8: athrow
		// @1A9: iload_3
		// @1AA: getstatic game.C_100037_wb game.C_100309_lk.field_103275_Z
		// @1AD: getfield int game.C_100037_wb.field_102337_u
		// @1B0: ineg
		// @1B1: isub
		// @1B2: iconst_m1
		// @1B3: ixor
		// @1B4: getstatic int game.C_100125_tm.field_100745_p
		// @1B7: iconst_m1
		// @1B8: ixor
		// @1B9: if_icmpge @221
		// @1BC: goto @1C0
		// @1BF: athrow
		// @1C0: sipush 269 (0x010D)
		// @1C3: getstatic game.C_100037_wb game.C_100309_lk.field_103275_Z
		// @1C6: getfield int game.C_100037_wb.field_102339_s
		// @1C9: ineg
		// @1CA: iadd
		// @1CB: iconst_m1
		// @1CC: ixor
		// @1CD: getstatic int game.C_100340_je.field_102981_m
		// @1D0: iconst_m1
		// @1D1: ixor
		// @1D2: if_icmple @1F3
		// @1D5: goto @1D9
		// @1D8: athrow
		// @1D9: sipush 269 (0x010D)
		// @1DC: getstatic int game.C_100340_je.field_102981_m
		// @1DF: if_icmple @1F3
		// @1E2: goto @1E6
		// @1E5: athrow
		// @1E6: iconst_1
		// @1E7: istore #4
		// @1E9: iconst_0
		// @1EA: putstatic boolean game.C_100145_ta.field_100427_l
		// @1ED: getstatic int game.C_100338_jc.field_105373_k
		// @1F0: putstatic int game.C_100042_we.field_104137_m
		// @1F3: getstatic int game.C_100340_je.field_102981_m
		// @1F6: sipush 586 (0x024A)
		// @1F9: if_icmple @221
		// @1FC: sipush 586 (0x024A)
		// @1FF: getstatic game.C_100037_wb game.C_100309_lk.field_103275_Z
		// @202: getfield int game.C_100037_wb.field_102339_s
		// @205: iadd
		// @206: iconst_m1
		// @207: ixor
		// @208: getstatic int game.C_100340_je.field_102981_m
		// @20B: iconst_m1
		// @20C: ixor
		// @20D: if_icmpge @221
		// @210: goto @214
		// @213: athrow
		// @214: getstatic int game.C_100338_jc.field_105373_k
		// @217: putstatic int game.C_100042_we.field_104137_m
		// @21A: iconst_1
		// @21B: putstatic boolean game.C_100145_ta.field_100427_l
		// @21E: iconst_1
		// @21F: istore #4
		// @221: iload #4
		// @223: ifne @2AB
		// @226: getstatic int game.C_100042_we.field_104137_m
		// @229: getstatic int game.C_100338_jc.field_105367_b
		// @22C: if_icmple @2AB
		// @22F: goto @233
		// @232: athrow
		// @233: getstatic int game.C_100338_jc.field_105370_l
		// @236: iconst_m1
		// @237: ixor
		// @238: iload_3
		// @239: iconst_m1
		// @23A: ixor
		// @23B: if_icmpge @2AB
		// @23E: goto @242
		// @241: athrow
		// @242: getstatic int game.C_100338_jc.field_105370_l
		// @245: getstatic game.C_100037_wb game.C_100309_lk.field_103275_Z
		// @248: getfield int game.C_100037_wb.field_102337_u
		// @24B: iload_3
		// @24C: iadd
		// @24D: if_icmplt @258
		// @250: goto @254
		// @253: athrow
		// @254: goto @2AB
		// @257: athrow
		// @258: getstatic int game.C_100015_wh.field_103781_g
		// @25B: iconst_m1
		// @25C: ixor
		// @25D: getstatic game.C_100037_wb game.C_100309_lk.field_103275_Z
		// @260: getfield int game.C_100037_wb.field_102339_s
		// @263: ineg
		// @264: sipush 269 (0x010D)
		// @267: iadd
		// @268: iconst_m1
		// @269: ixor
		// @26A: if_icmpge @284
		// @26D: sipush 269 (0x010D)
		// @270: getstatic int game.C_100015_wh.field_103781_g
		// @273: if_icmple @284
		// @276: goto @27A
		// @279: athrow
		// @27A: getstatic int game.C_100338_jc.field_105367_b
		// @27D: putstatic int game.C_100042_we.field_104137_m
		// @280: goto @284
		// @283: athrow
		// @284: getstatic int game.C_100015_wh.field_103781_g
		// @287: sipush 586 (0x024A)
		// @28A: if_icmple @2AB
		// @28D: sipush 586 (0x024A)
		// @290: getstatic game.C_100037_wb game.C_100309_lk.field_103275_Z
		// @293: getfield int game.C_100037_wb.field_102339_s
		// @296: iadd
		// @297: getstatic int game.C_100015_wh.field_103781_g
		// @29A: if_icmple @2AB
		// @29D: goto @2A1
		// @2A0: athrow
		// @2A1: getstatic int game.C_100338_jc.field_105367_b
		// @2A4: putstatic int game.C_100042_we.field_104137_m
		// @2A7: goto @2AB
		// @2AA: athrow
		// @2AB: iload_0
		// @2AC: ifne @2B3
		// @2AF: goto @347
		// @2B2: athrow
		// @2B3: getstatic game.C_100333_ij game.C_100220_ac.field_106064_h
		// @2B6: bipush 26 (0x1A)
		// @2B8: getstatic int game.C_100125_tm.field_100745_p
		// @2BB: bipush 7 (0x07)
		// @2BD: getstatic int game.C_100340_je.field_102981_m
		// @2C0: invokestatic game.C_100141_tc.func_105046_a(int, int, int)int
		// @2C3: getstatic int game.C_100338_jc.field_105370_l
		// @2C6: bipush 7 (0x07)
		// @2C8: getstatic int game.C_100015_wh.field_103781_g
		// @2CB: invokestatic game.C_100141_tc.func_105046_a(int, int, int)int
		// @2CE: invokevirtual game.C_100333_ij.func_107335_a(int, int, int)void
		// @2D1: getstatic game.C_100333_ij game.C_100220_ac.field_106064_h
		// @2D4: iconst_1
		// @2D5: invokevirtual game.C_100333_ij.func_107339_b(boolean)boolean
		// @2D8: ifne @2DF
		// @2DB: goto @2FC
		// @2DE: athrow
		// @2DF: getstatic game.C_100333_ij game.C_100220_ac.field_106064_h
		// @2E2: getfield int game.C_100333_ij.field_107347_b
		// @2E5: iconst_m1
		// @2E6: ixor
		// @2E7: iconst_m1
		// @2E8: if_icmpne @2ED
		// @2EB: iconst_3
		// @2EC: ireturn
		// @2ED: getstatic game.C_100333_ij game.C_100220_ac.field_106064_h
		// @2F0: getfield int game.C_100333_ij.field_107347_b
		// @2F3: iconst_m1
		// @2F4: ixor
		// @2F5: bipush -2 (0xFE)
		// @2F7: if_icmpne @2FC
		// @2FA: iconst_2
		// @2FB: ireturn
		// @2FC: bipush 64 (0x40)
		// @2FE: invokestatic game.C_100189_ri.func_105748_a(int)boolean
		// @301: ifeq @347
		// @304: getstatic game.C_100333_ij game.C_100220_ac.field_106064_h
		// @307: bipush -5 (0xFB)
		// @309: iconst_0
		// @30A: invokevirtual game.C_100333_ij.func_107332_a(byte, int)void
		// @30D: getstatic game.C_100333_ij game.C_100220_ac.field_106064_h
		// @310: iconst_1
		// @311: invokevirtual game.C_100333_ij.func_107339_b(boolean)boolean
		// @314: ifne @31B
		// @317: goto @336
		// @31A: athrow
		// @31B: getstatic game.C_100333_ij game.C_100220_ac.field_106064_h
		// @31E: getfield int game.C_100333_ij.field_107347_b
		// @321: ifeq @328
		// @324: goto @32A
		// @327: athrow
		// @328: iconst_3
		// @329: ireturn
		// @32A: iconst_1
		// @32B: getstatic game.C_100333_ij game.C_100220_ac.field_106064_h
		// @32E: getfield int game.C_100333_ij.field_107347_b
		// @331: if_icmpne @336
		// @334: iconst_1
		// @335: ireturn
		// @336: bipush -14 (0xF2)
		// @338: getstatic int game.C_100293_kj.field_106890_c
		// @33B: iconst_m1
		// @33C: ixor
		// @33D: if_icmpne @2FC
		// @340: iconst_1
		// @341: iload #5
		// @343: ifne @348
		// @346: ireturn
		// @347: iconst_0
		// @348: ireturn
		// @349: astore_2
		// @34A: aload_2
		// @34B: new java.lang.StringBuilder
		// @34E: dup
		// @34F: invokespecial java.lang.StringBuilder.<init>()void
		// @352: getstatic java.lang.String[] game.C_100049_vf.field_104220_z
		// @355: bipush 8 (0x08)
		// @357: aaload
		// @358: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @35B: iload_0
		// @35C: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @35F: bipush 44 (0x2C)
		// @361: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @364: iload_1
		// @365: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @368: bipush 41 (0x29)
		// @36A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @36D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @370: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @373: athrow
	}
	
	C_100049_vf(int arg0, int arg1, int arg2, int arg3, int arg4)
	{
		// @0: aload_0
		// @1: iload_1
		// @2: iload_2
		// @3: iload_3
		// @4: iload #4
		// @6: iload #5
		// @8: iconst_0
		// @9: invokespecial game.C_100049_vf.<init>(int, int, int, int, int, boolean)void
		// @C: return
	}
	
	C_100049_vf(int arg0, int arg1, int arg2, int arg3, C_100327_ib arg4)
	{
		// @0: aload_0
		// @1: iload_1
		// @2: iload_2
		// @3: iload_3
		// @4: iload #4
		// @6: aload #5
		// @8: iconst_0
		// @9: invokespecial game.C_100049_vf.<init>(int, int, int, int, game.C_100327_ib, boolean)void
		// @C: return
	}
	
	static final void func_104195_a(int arg0, boolean arg1, int arg2)
	{
		// @00: getstatic game.C_100260_mc game.C_100228_nn.field_106189_c
		// @03: ifnull @4B
		// @06: getstatic game.C_100260_mc game.C_100228_nn.field_106189_c
		// @09: iload_1
		// @0A: bipush 71 (0x47)
		// @0C: invokevirtual game.C_100260_mc.func_102217_b(boolean, byte)int
		// @0F: istore_3
		// @10: bipush -2 (0xFE)
		// @12: iload_3
		// @13: if_icmpne @1A
		// @16: goto @4B
		// @19: athrow
		// @1A: iconst_m1
		// @1B: iload_3
		// @1C: if_icmpne @23
		// @1F: goto @42
		// @22: athrow
		// @23: getstatic game.C_100260_mc game.C_100228_nn.field_106189_c
		// @26: iconst_4
		// @27: invokevirtual game.C_100260_mc.func_102213_f(byte)boolean
		// @2A: istore #4
		// @2C: iload #4
		// @2E: bipush -33 (0xDF)
		// @30: iload_2
		// @31: iload_3
		// @32: getstatic game.C_100260_mc game.C_100228_nn.field_106189_c
		// @35: iconst_m1
		// @36: invokevirtual game.C_100260_mc.func_102220_o(int)java.lang.String
		// @39: getstatic game.C_100260_mc game.C_100228_nn.field_106189_c
		// @3C: getfield long game.C_100260_mc.field_102224_gc
		// @3F: invokestatic game.C_100160_sm.func_105409_a(boolean, byte, int, int, java.lang.String, long)void
		// @42: aconst_null
		// @43: putstatic game.C_100260_mc game.C_100228_nn.field_106189_c
		// @46: bipush 46 (0x2E)
		// @48: invokestatic game.C_100290_jm.func_106853_a(byte)void
		// @4B: iload_0
		// @4C: iconst_m1
		// @4D: if_icmpeq @5B
		// @50: aconst_null
		// @51: checkcast game.C_100185_rm
		// @54: putstatic game.C_100185_rm game.C_100049_vf.field_104206_l
		// @57: goto @5B
		// @5A: athrow
		// @5B: goto @91
		// @5E: astore_3
		// @5F: aload_3
		// @60: new java.lang.StringBuilder
		// @63: dup
		// @64: invokespecial java.lang.StringBuilder.<init>()void
		// @67: getstatic java.lang.String[] game.C_100049_vf.field_104220_z
		// @6A: iconst_4
		// @6B: aaload
		// @6C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @6F: iload_0
		// @70: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @73: bipush 44 (0x2C)
		// @75: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @78: iload_1
		// @79: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @7C: bipush 44 (0x2C)
		// @7E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @81: iload_2
		// @82: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @85: bipush 41 (0x29)
		// @87: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @8D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @90: athrow
		// @91: return
	}
	
	private final void func_104190_a(C_100049_vf arg0, boolean arg1, int arg2)
	{
		// @00: aload_0
		// @01: aload_1
		// @02: getfield int game.C_100049_vf.field_104207_m
		// @05: putfield int game.C_100049_vf.field_104207_m
		// @08: aload_0
		// @09: aload_1
		// @0A: getfield int game.C_100049_vf.field_104208_j
		// @0D: putfield int game.C_100049_vf.field_104208_j
		// @10: aload_0
		// @11: aload_1
		// @12: getfield int game.C_100049_vf.field_104213_v
		// @15: putfield int game.C_100049_vf.field_104213_v
		// @18: aload_0
		// @19: aload_1
		// @1A: getfield int game.C_100049_vf.field_104198_g
		// @1D: putfield int game.C_100049_vf.field_104198_g
		// @20: iload_3
		// @21: sipush -2274 (0xF71E)
		// @24: if_icmpeq @28
		// @27: return
		// @28: aload_0
		// @29: aload_1
		// @2A: getfield java.lang.String game.C_100049_vf.field_104214_u
		// @2D: putfield java.lang.String game.C_100049_vf.field_104214_u
		// @30: aload_0
		// @31: aload_1
		// @32: getfield int game.C_100049_vf.field_104218_q
		// @35: putfield int game.C_100049_vf.field_104218_q
		// @38: aload_0
		// @39: aload_1
		// @3A: getfield int game.C_100049_vf.field_104200_e
		// @3D: putfield int game.C_100049_vf.field_104200_e
		// @40: aload_0
		// @41: aload_1
		// @42: getfield int game.C_100049_vf.field_104215_t
		// @45: putfield int game.C_100049_vf.field_104215_t
		// @48: aload_0
		// @49: aload_1
		// @4A: getfield int game.C_100049_vf.field_104209_k
		// @4D: putfield int game.C_100049_vf.field_104209_k
		// @50: aload_0
		// @51: aload_1
		// @52: getfield int game.C_100049_vf.field_104203_a
		// @55: putfield int game.C_100049_vf.field_104203_a
		// @58: aload_1
		// @59: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @5C: ifnull @79
		// @5F: aload_0
		// @60: new game.C_100327_ib
		// @63: dup
		// @64: aload_1
		// @65: getfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @68: iload_2
		// @69: invokespecial game.C_100327_ib.<init>(game.C_100327_ib, boolean)void
		// @6C: putfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @6F: getstatic int game.SteelSentinels.field_105275_O
		// @72: ifeq @82
		// @75: goto @79
		// @78: athrow
		// @79: aload_0
		// @7A: aconst_null
		// @7B: putfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @7E: goto @82
		// @81: athrow
		// @82: aload_0
		// @83: aload_1
		// @84: getfield boolean game.C_100049_vf.field_104211_i
		// @87: putfield boolean game.C_100049_vf.field_104211_i
		// @8A: goto @D3
		// @8D: astore #4
		// @8F: aload #4
		// @91: new java.lang.StringBuilder
		// @94: dup
		// @95: invokespecial java.lang.StringBuilder.<init>()void
		// @98: getstatic java.lang.String[] game.C_100049_vf.field_104220_z
		// @9B: iconst_3
		// @9C: aaload
		// @9D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @A0: aload_1
		// @A1: ifnull @AD
		// @A4: getstatic java.lang.String[] game.C_100049_vf.field_104220_z
		// @A7: iconst_1
		// @A8: aaload
		// @A9: goto @B2
		// @AC: athrow
		// @AD: getstatic java.lang.String[] game.C_100049_vf.field_104220_z
		// @B0: iconst_2
		// @B1: aaload
		// @B2: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @B5: bipush 44 (0x2C)
		// @B7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @BA: iload_2
		// @BB: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @BE: bipush 44 (0x2C)
		// @C0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C3: iload_3
		// @C4: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @C7: bipush 41 (0x29)
		// @C9: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @CC: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @CF: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @D2: athrow
		// @D3: return
	}
	
	static final boolean func_104189_a(String arg0, int arg1, int arg2, int arg3, int arg4, byte arg5)
	{
		// @000: iload #5
		// @002: bipush 8 (0x08)
		// @004: if_icmpeq @010
		// @007: bipush 53 (0x35)
		// @009: invokestatic game.C_100049_vf.func_104192_a(int)void
		// @00C: goto @010
		// @00F: athrow
		// @010: getstatic int game.C_100015_wh.field_103781_g
		// @013: iconst_m1
		// @014: ixor
		// @015: iload_2
		// @016: iconst_m1
		// @017: ixor
		// @018: if_icmpgt @04E
		// @01B: iload_2
		// @01C: iload #4
		// @01E: iadd
		// @01F: iconst_m1
		// @020: ixor
		// @021: getstatic int game.C_100015_wh.field_103781_g
		// @024: iconst_m1
		// @025: ixor
		// @026: if_icmpge @04E
		// @029: goto @02D
		// @02C: athrow
		// @02D: iload_1
		// @02E: getstatic int game.C_100338_jc.field_105370_l
		// @031: if_icmpgt @04E
		// @034: goto @038
		// @037: athrow
		// @038: iload_1
		// @039: iload_3
		// @03A: iadd
		// @03B: iconst_m1
		// @03C: ixor
		// @03D: getstatic int game.C_100338_jc.field_105370_l
		// @040: iconst_m1
		// @041: ixor
		// @042: if_icmpge @04E
		// @045: goto @049
		// @048: athrow
		// @049: iconst_1
		// @04A: goto @04F
		// @04D: athrow
		// @04E: iconst_0
		// @04F: istore #6
		// @051: iload #6
		// @053: ifeq @05B
		// @056: iconst_0
		// @057: goto @05D
		// @05A: athrow
		// @05B: ldc 1146810 (0x117fba)
		// @05D: istore #7
		// @05F: iload #6
		// @061: ifeq @06B
		// @064: getstatic game.C_100037_wb[] game.C_100073_f.field_101717_A
		// @067: goto @06E
		// @06A: athrow
		// @06B: getstatic game.C_100037_wb[] game.C_100106_ef.field_104759_i
		// @06E: astore #8
		// @070: iload_2
		// @071: iload_1
		// @072: bipush 125 (0x7D)
		// @074: iload #4
		// @076: aload #8
		// @078: iload_3
		// @079: invokestatic game.C_100157_db.func_103554_a(int, int, int, int, game.C_100037_wb[], int)void
		// @07C: aconst_null
		// @07D: aload_0
		// @07E: if_acmpeq @0A5
		// @081: getstatic game.C_100193_re game.C_100151_bc.field_102942_S
		// @084: aload_0
		// @085: iload #4
		// @087: iconst_2
		// @088: idiv
		// @089: iload_2
		// @08A: iadd
		// @08B: iload_1
		// @08C: iconst_1
		// @08D: iload_3
		// @08E: iadd
		// @08F: getstatic game.C_100193_re game.C_100151_bc.field_102942_S
		// @092: getfield int game.C_100193_re.field_101769_u
		// @095: ineg
		// @096: isub
		// @097: iconst_2
		// @098: idiv
		// @099: ineg
		// @09A: isub
		// @09B: iload #7
		// @09D: iconst_m1
		// @09E: invokevirtual game.C_100193_re.func_101744_b(java.lang.String, int, int, int, int)void
		// @0A1: goto @0A5
		// @0A4: athrow
		// @0A5: iload #6
		// @0A7: ireturn
		// @0A8: astore #6
		// @0AA: aload #6
		// @0AC: new java.lang.StringBuilder
		// @0AF: dup
		// @0B0: invokespecial java.lang.StringBuilder.<init>()void
		// @0B3: getstatic java.lang.String[] game.C_100049_vf.field_104220_z
		// @0B6: iconst_5
		// @0B7: aaload
		// @0B8: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0BB: aload_0
		// @0BC: ifnull @0C8
		// @0BF: getstatic java.lang.String[] game.C_100049_vf.field_104220_z
		// @0C2: iconst_1
		// @0C3: aaload
		// @0C4: goto @0CD
		// @0C7: athrow
		// @0C8: getstatic java.lang.String[] game.C_100049_vf.field_104220_z
		// @0CB: iconst_2
		// @0CC: aaload
		// @0CD: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0D0: bipush 44 (0x2C)
		// @0D2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0D5: iload_1
		// @0D6: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0D9: bipush 44 (0x2C)
		// @0DB: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0DE: iload_2
		// @0DF: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0E2: bipush 44 (0x2C)
		// @0E4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0E7: iload_3
		// @0E8: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0EB: bipush 44 (0x2C)
		// @0ED: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0F0: iload #4
		// @0F2: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0F5: bipush 44 (0x2C)
		// @0F7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0FA: iload #5
		// @0FC: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0FF: bipush 41 (0x29)
		// @101: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @104: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @107: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @10A: athrow
	}
	
	static final int func_104191_a(int arg0, int arg1, int arg2)
	{
		// @000: iload_1
		// @001: ldc 852036511 (0x32c90b9f)
		// @003: ishr
		// @004: istore #4
		// @006: iload #4
		// @008: iload #4
		// @00A: iload_1
		// @00B: iadd
		// @00C: ixor
		// @00D: istore_1
		// @00E: iload_0
		// @00F: ldc 645821983 (0x267e761f)
		// @011: ishr
		// @012: istore #4
		// @014: iload #4
		// @016: iload #4
		// @018: iload_0
		// @019: iadd
		// @01A: ixor
		// @01B: istore_0
		// @01C: bipush 15 (0x0F)
		// @01E: bipush -31 (0xE1)
		// @020: iload_2
		// @021: isub
		// @022: bipush 32 (0x20)
		// @024: idiv
		// @025: idiv
		// @026: istore #4
		// @028: iconst_0
		// @029: istore_3
		// @02A: iload_1
		// @02B: iload_0
		// @02C: if_icmplt @033
		// @02F: goto @03B
		// @032: athrow
		// @033: iload_1
		// @034: istore #4
		// @036: iload_0
		// @037: istore_1
		// @038: iload #4
		// @03A: istore_0
		// @03B: iload_1
		// @03C: ldc 32768 (0x8000)
		// @03E: if_icmpge @045
		// @041: goto @09C
		// @044: athrow
		// @045: iload_1
		// @046: iconst_m1
		// @047: ixor
		// @048: ldc -1073741825 (0xbfffffff)
		// @04A: if_icmpgt @055
		// @04D: iload_1
		// @04E: bipush 16 (0x10)
		// @050: ishr
		// @051: istore_1
		// @052: iinc #3 +16
		// @055: iload_1
		// @056: iconst_m1
		// @057: ixor
		// @058: ldc -4194305 (0xffbfffff)
		// @05A: if_icmpgt @065
		// @05D: iinc #3 +8
		// @060: iload_1
		// @061: bipush 8 (0x08)
		// @063: ishr
		// @064: istore_1
		// @065: ldc 262144 (0x40000)
		// @067: iload_1
		// @068: if_icmple @06F
		// @06B: goto @076
		// @06E: athrow
		// @06F: iload_1
		// @070: iconst_4
		// @071: ishr
		// @072: istore_1
		// @073: iinc #3 +4
		// @076: iload_1
		// @077: iconst_m1
		// @078: ixor
		// @079: ldc -65537 (0xfffeffff)
		// @07B: if_icmpgt @085
		// @07E: iinc #3 +2
		// @081: iload_1
		// @082: iconst_2
		// @083: ishr
		// @084: istore_1
		// @085: iload_1
		// @086: iconst_m1
		// @087: ixor
		// @088: ldc -32769 (0xffff7fff)
		// @08A: if_icmple @091
		// @08D: goto @098
		// @090: athrow
		// @091: iload_1
		// @092: iconst_1
		// @093: ishr
		// @094: istore_1
		// @095: iinc #3 +1
		// @098: iload_0
		// @099: iload_3
		// @09A: ishr
		// @09B: istore_0
		// @09C: iload_0
		// @09D: ldc 206745861 (0xc52b105)
		// @09F: ishl
		// @0A0: iload_1
		// @0A1: if_icmpge @0A8
		// @0A4: iload_1
		// @0A5: iload_3
		// @0A6: ishl
		// @0A7: ireturn
		// @0A8: iload_1
		// @0A9: iload_1
		// @0AA: imul
		// @0AB: iload_0
		// @0AC: iload_0
		// @0AD: imul
		// @0AE: ineg
		// @0AF: isub
		// @0B0: istore_1
		// @0B1: ldc -65537 (0xfffeffff)
		// @0B3: iload_1
		// @0B4: iconst_m1
		// @0B5: ixor
		// @0B6: if_icmpge @123
		// @0B9: iload_1
		// @0BA: sipush 256 (0x0100)
		// @0BD: if_icmpge @0D8
		// @0C0: goto @0C4
		// @0C3: athrow
		// @0C4: iconst_0
		// @0C5: iload_1
		// @0C6: if_icmpgt @0D6
		// @0C9: goto @0CD
		// @0CC: athrow
		// @0CD: getstatic int[] game.C_100202_qi.field_105916_b
		// @0D0: iload_1
		// @0D1: iaload
		// @0D2: ldc -1094996756 (0xbebbacec)
		// @0D4: ishr
		// @0D5: ireturn
		// @0D6: iconst_m1
		// @0D7: ireturn
		// @0D8: sipush -4097 (0xEFFF)
		// @0DB: iload_1
		// @0DC: iconst_m1
		// @0DD: ixor
		// @0DE: if_icmplt @104
		// @0E1: sipush 16384 (0x4000)
		// @0E4: iload_1
		// @0E5: if_icmple @0F8
		// @0E8: goto @0EC
		// @0EB: athrow
		// @0EC: getstatic int[] game.C_100202_qi.field_105916_b
		// @0EF: iload_1
		// @0F0: ldc -624795834 (0xdac25f46)
		// @0F2: ishr
		// @0F3: iaload
		// @0F4: ldc -1754241175 (0x97706769)
		// @0F6: ishr
		// @0F7: ireturn
		// @0F8: getstatic int[] game.C_100202_qi.field_105916_b
		// @0FB: iload_1
		// @0FC: ldc 2099987080 (0x7d2b4288)
		// @0FE: ishr
		// @0FF: iaload
		// @100: ldc -1518254968 (0xa5814488)
		// @102: ishr
		// @103: ireturn
		// @104: iload_1
		// @105: sipush 1024 (0x0400)
		// @108: if_icmplt @117
		// @10B: getstatic int[] game.C_100202_qi.field_105916_b
		// @10E: iload_1
		// @10F: ldc -417941372 (0xe716b884)
		// @111: ishr
		// @112: iaload
		// @113: ldc 1193295178 (0x47203d4a)
		// @115: ishr
		// @116: ireturn
		// @117: getstatic int[] game.C_100202_qi.field_105916_b
		// @11A: iload_1
		// @11B: ldc -166768894 (0xf60f4f02)
		// @11D: ishr
		// @11E: iaload
		// @11F: ldc -339478101 (0xebc3f9ab)
		// @121: ishr
		// @122: ireturn
		// @123: ldc 16777216 (0x1000000)
		// @125: iload_1
		// @126: if_icmpgt @1C2
		// @129: ldc 268435456 (0x10000000)
		// @12B: iload_1
		// @12C: if_icmpgt @16E
		// @12F: goto @133
		// @132: athrow
		// @133: ldc 1073741824 (0x40000000)
		// @135: iload_1
		// @136: if_icmpgt @148
		// @139: goto @13D
		// @13C: athrow
		// @13D: getstatic int[] game.C_100202_qi.field_105916_b
		// @140: iload_1
		// @141: ldc -1385109672 (0xad70e758)
		// @143: ishr
		// @144: iaload
		// @145: iload_3
		// @146: ishl
		// @147: ireturn
		// @148: iload_3
		// @149: iconst_m1
		// @14A: ixor
		// @14B: bipush -2 (0xFE)
		// @14D: if_icmple @161
		// @150: getstatic int[] game.C_100202_qi.field_105916_b
		// @153: iload_1
		// @154: ldc 1628057814 (0x610a30d6)
		// @156: ishr
		// @157: iaload
		// @158: iload_3
		// @159: ineg
		// @15A: iconst_1
		// @15B: iadd
		// @15C: ishr
		// @15D: goto @16D
		// @160: athrow
		// @161: getstatic int[] game.C_100202_qi.field_105916_b
		// @164: iload_1
		// @165: ldc -87465066 (0xfac96396)
		// @167: ishr
		// @168: iaload
		// @169: iload_3
		// @16A: iconst_m1
		// @16B: iadd
		// @16C: ishl
		// @16D: ireturn
		// @16E: iload_1
		// @16F: iconst_m1
		// @170: ixor
		// @171: ldc -67108865 (0xfbffffff)
		// @173: if_icmple @19E
		// @176: iconst_3
		// @177: iload_3
		// @178: if_icmpgt @190
		// @17B: goto @17F
		// @17E: athrow
		// @17F: getstatic int[] game.C_100202_qi.field_105916_b
		// @182: iload_1
		// @183: ldc -421152302 (0xe6e5b9d2)
		// @185: ishr
		// @186: iaload
		// @187: bipush -3 (0xFD)
		// @189: iload_3
		// @18A: iadd
		// @18B: ishl
		// @18C: goto @19D
		// @18F: athrow
		// @190: getstatic int[] game.C_100202_qi.field_105916_b
		// @193: iload_1
		// @194: ldc 987527474 (0x3adc7932)
		// @196: ishr
		// @197: iaload
		// @198: iconst_3
		// @199: iload_3
		// @19A: ineg
		// @19B: iadd
		// @19C: ishr
		// @19D: ireturn
		// @19E: iconst_2
		// @19F: iload_3
		// @1A0: if_icmple @1B4
		// @1A3: getstatic int[] game.C_100202_qi.field_105916_b
		// @1A6: iload_1
		// @1A7: ldc -756914956 (0xd2e264f4)
		// @1A9: ishr
		// @1AA: iaload
		// @1AB: iload_3
		// @1AC: ineg
		// @1AD: iconst_2
		// @1AE: iadd
		// @1AF: ishr
		// @1B0: goto @1C1
		// @1B3: athrow
		// @1B4: getstatic int[] game.C_100202_qi.field_105916_b
		// @1B7: iload_1
		// @1B8: ldc -51618092 (0xfcec5ed4)
		// @1BA: ishr
		// @1BB: iaload
		// @1BC: iload_3
		// @1BD: bipush -2 (0xFE)
		// @1BF: iadd
		// @1C0: ishl
		// @1C1: ireturn
		// @1C2: iload_1
		// @1C3: ldc 1048576 (0x100000)
		// @1C5: if_icmplt @1EC
		// @1C8: iload_1
		// @1C9: iconst_m1
		// @1CA: ixor
		// @1CB: ldc -4194305 (0xffbfffff)
		// @1CD: if_icmpgt @1E0
		// @1D0: goto @1D4
		// @1D3: athrow
		// @1D4: getstatic int[] game.C_100202_qi.field_105916_b
		// @1D7: iload_1
		// @1D8: ldc 1020498416 (0x3cd391f0)
		// @1DA: ishr
		// @1DB: iaload
		// @1DC: ldc 977525636 (0x3a43db84)
		// @1DE: ishr
		// @1DF: ireturn
		// @1E0: getstatic int[] game.C_100202_qi.field_105916_b
		// @1E3: iload_1
		// @1E4: ldc 518320334 (0x1ee4f0ce)
		// @1E6: ishr
		// @1E7: iaload
		// @1E8: ldc 705213477 (0x2a08b425)
		// @1EA: ishr
		// @1EB: ireturn
		// @1EC: ldc 262144 (0x40000)
		// @1EE: iload_1
		// @1EF: if_icmple @1FE
		// @1F2: getstatic int[] game.C_100202_qi.field_105916_b
		// @1F5: iload_1
		// @1F6: ldc 284560458 (0x10f60c4a)
		// @1F8: ishr
		// @1F9: iaload
		// @1FA: ldc -1871169049 (0x907839e7)
		// @1FC: ishr
		// @1FD: ireturn
		// @1FE: getstatic int[] game.C_100202_qi.field_105916_b
		// @201: iload_1
		// @202: ldc -1996283348 (0x8903222c)
		// @204: ishr
		// @205: iaload
		// @206: ldc 493117478 (0x1d646026)
		// @208: ishr
		// @209: ireturn
		// @20A: astore_3
		// @20B: aload_3
		// @20C: new java.lang.StringBuilder
		// @20F: dup
		// @210: invokespecial java.lang.StringBuilder.<init>()void
		// @213: getstatic java.lang.String[] game.C_100049_vf.field_104220_z
		// @216: bipush 6 (0x06)
		// @218: aaload
		// @219: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @21C: iload_0
		// @21D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @220: bipush 44 (0x2C)
		// @222: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @225: iload_1
		// @226: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @229: bipush 44 (0x2C)
		// @22B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @22E: iload_2
		// @22F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @232: bipush 41 (0x29)
		// @234: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @237: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @23A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @23D: athrow
	}
	
	public static void func_104192_a(int arg0)
	{
		// @00: iload_0
		// @01: iconst_3
		// @02: if_icmpeq @06
		// @05: return
		// @06: aconst_null
		// @07: putstatic java.lang.String game.C_100049_vf.field_104217_r
		// @0A: aconst_null
		// @0B: putstatic java.lang.String game.C_100049_vf.field_104205_o
		// @0E: aconst_null
		// @0F: putstatic game.C_100037_wb[] game.C_100049_vf.field_104212_w
		// @12: aconst_null
		// @13: putstatic game.C_100185_rm game.C_100049_vf.field_104206_l
		// @16: goto @3B
		// @19: astore_1
		// @1A: aload_1
		// @1B: new java.lang.StringBuilder
		// @1E: dup
		// @1F: invokespecial java.lang.StringBuilder.<init>()void
		// @22: getstatic java.lang.String[] game.C_100049_vf.field_104220_z
		// @25: bipush 7 (0x07)
		// @27: aaload
		// @28: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2B: iload_0
		// @2C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2F: bipush 41 (0x29)
		// @31: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @34: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @37: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3A: athrow
		// @3B: return
	}
	
	C_100049_vf(C_100049_vf arg0, boolean arg1)
	{
		// @00: aload_0
		// @01: invokespecial java.lang.Object.<init>()void
		// @04: aload_0
		// @05: aload_1
		// @06: iload_2
		// @07: sipush -2274 (0xF71E)
		// @0A: invokespecial game.C_100049_vf.func_104190_a(game.C_100049_vf, boolean, int)void
		// @0D: goto @4B
		// @10: astore_3
		// @11: aload_3
		// @12: new java.lang.StringBuilder
		// @15: dup
		// @16: invokespecial java.lang.StringBuilder.<init>()void
		// @19: getstatic java.lang.String[] game.C_100049_vf.field_104220_z
		// @1C: iconst_0
		// @1D: aaload
		// @1E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @21: aload_1
		// @22: ifnull @2E
		// @25: getstatic java.lang.String[] game.C_100049_vf.field_104220_z
		// @28: iconst_1
		// @29: aaload
		// @2A: goto @33
		// @2D: athrow
		// @2E: getstatic java.lang.String[] game.C_100049_vf.field_104220_z
		// @31: iconst_2
		// @32: aaload
		// @33: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @36: bipush 44 (0x2C)
		// @38: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3B: iload_2
		// @3C: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @3F: bipush 41 (0x29)
		// @41: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @44: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @47: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4A: athrow
		// @4B: return
	}
	
	C_100049_vf(int arg0, int arg1, int arg2, int arg3, C_100327_ib arg4, boolean arg5)
	{
		// @00: aload_0
		// @01: invokespecial java.lang.Object.<init>()void
		// @04: aload_0
		// @05: iload #4
		// @07: putfield int game.C_100049_vf.field_104215_t
		// @0A: aload_0
		// @0B: iload_2
		// @0C: putfield int game.C_100049_vf.field_104209_k
		// @0F: aload_0
		// @10: aload #5
		// @12: putfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @15: aload_0
		// @16: iconst_m1
		// @17: putfield int game.C_100049_vf.field_104203_a
		// @1A: aload_0
		// @1B: iload_3
		// @1C: putfield int game.C_100049_vf.field_104198_g
		// @1F: aload_0
		// @20: iload_1
		// @21: putfield int game.C_100049_vf.field_104218_q
		// @24: aload_0
		// @25: iload #6
		// @27: putfield boolean game.C_100049_vf.field_104211_i
		// @2A: goto @91
		// @2D: astore #7
		// @2F: aload #7
		// @31: new java.lang.StringBuilder
		// @34: dup
		// @35: invokespecial java.lang.StringBuilder.<init>()void
		// @38: getstatic java.lang.String[] game.C_100049_vf.field_104220_z
		// @3B: iconst_0
		// @3C: aaload
		// @3D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @40: iload_1
		// @41: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @44: bipush 44 (0x2C)
		// @46: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @49: iload_2
		// @4A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4D: bipush 44 (0x2C)
		// @4F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @52: iload_3
		// @53: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @56: bipush 44 (0x2C)
		// @58: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5B: iload #4
		// @5D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @60: bipush 44 (0x2C)
		// @62: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @65: aload #5
		// @67: ifnull @73
		// @6A: getstatic java.lang.String[] game.C_100049_vf.field_104220_z
		// @6D: iconst_1
		// @6E: aaload
		// @6F: goto @78
		// @72: athrow
		// @73: getstatic java.lang.String[] game.C_100049_vf.field_104220_z
		// @76: iconst_2
		// @77: aaload
		// @78: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @7B: bipush 44 (0x2C)
		// @7D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @80: iload #6
		// @82: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @85: bipush 41 (0x29)
		// @87: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @8D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @90: athrow
		// @91: return
	}
	
	C_100049_vf(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5)
	{
		// @00: aload_0
		// @01: invokespecial java.lang.Object.<init>()void
		// @04: aload_0
		// @05: iload_3
		// @06: putfield int game.C_100049_vf.field_104198_g
		// @09: aload_0
		// @0A: iload_2
		// @0B: putfield int game.C_100049_vf.field_104209_k
		// @0E: aload_0
		// @0F: iload #5
		// @11: putfield int game.C_100049_vf.field_104203_a
		// @14: aload_0
		// @15: iload #6
		// @17: putfield boolean game.C_100049_vf.field_104211_i
		// @1A: aload_0
		// @1B: aconst_null
		// @1C: putfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @1F: aload_0
		// @20: iload #4
		// @22: putfield int game.C_100049_vf.field_104215_t
		// @25: aload_0
		// @26: iload_1
		// @27: putfield int game.C_100049_vf.field_104218_q
		// @2A: goto @80
		// @2D: astore #7
		// @2F: aload #7
		// @31: new java.lang.StringBuilder
		// @34: dup
		// @35: invokespecial java.lang.StringBuilder.<init>()void
		// @38: getstatic java.lang.String[] game.C_100049_vf.field_104220_z
		// @3B: iconst_0
		// @3C: aaload
		// @3D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @40: iload_1
		// @41: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @44: bipush 44 (0x2C)
		// @46: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @49: iload_2
		// @4A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4D: bipush 44 (0x2C)
		// @4F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @52: iload_3
		// @53: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @56: bipush 44 (0x2C)
		// @58: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5B: iload #4
		// @5D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @60: bipush 44 (0x2C)
		// @62: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @65: iload #5
		// @67: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6A: bipush 44 (0x2C)
		// @6C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6F: iload #6
		// @71: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @74: bipush 41 (0x29)
		// @76: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @79: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @7C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @7F: athrow
		// @80: return
	}
	
	C_100049_vf(String arg0)
	{
		// @00: aload_0
		// @01: invokespecial java.lang.Object.<init>()void
		// @04: aload_0
		// @05: iconst_m1
		// @06: putfield int game.C_100049_vf.field_104203_a
		// @09: aload_0
		// @0A: aconst_null
		// @0B: putfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @0E: aload_0
		// @0F: aload_1
		// @10: putfield java.lang.String game.C_100049_vf.field_104214_u
		// @13: goto @48
		// @16: astore_2
		// @17: aload_2
		// @18: new java.lang.StringBuilder
		// @1B: dup
		// @1C: invokespecial java.lang.StringBuilder.<init>()void
		// @1F: getstatic java.lang.String[] game.C_100049_vf.field_104220_z
		// @22: iconst_0
		// @23: aaload
		// @24: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @27: aload_1
		// @28: ifnull @34
		// @2B: getstatic java.lang.String[] game.C_100049_vf.field_104220_z
		// @2E: iconst_1
		// @2F: aaload
		// @30: goto @39
		// @33: athrow
		// @34: getstatic java.lang.String[] game.C_100049_vf.field_104220_z
		// @37: iconst_2
		// @38: aaload
		// @39: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3C: bipush 41 (0x29)
		// @3E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @41: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @44: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @47: athrow
		// @48: return
	}
	
	C_100049_vf(int arg0, int arg1, int arg2)
	{
		// @00: aload_0
		// @01: invokespecial java.lang.Object.<init>()void
		// @04: aload_0
		// @05: iload_2
		// @06: putfield int game.C_100049_vf.field_104213_v
		// @09: aload_0
		// @0A: iconst_m1
		// @0B: putfield int game.C_100049_vf.field_104203_a
		// @0E: aload_0
		// @0F: aconst_null
		// @10: putfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @13: aload_0
		// @14: iload_1
		// @15: putfield int game.C_100049_vf.field_104208_j
		// @18: goto @50
		// @1B: astore #4
		// @1D: aload #4
		// @1F: new java.lang.StringBuilder
		// @22: dup
		// @23: invokespecial java.lang.StringBuilder.<init>()void
		// @26: getstatic java.lang.String[] game.C_100049_vf.field_104220_z
		// @29: iconst_0
		// @2A: aaload
		// @2B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2E: iload_1
		// @2F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @32: bipush 44 (0x2C)
		// @34: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @37: iload_2
		// @38: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3B: bipush 44 (0x2C)
		// @3D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @40: iload_3
		// @41: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @44: bipush 41 (0x29)
		// @46: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @49: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4F: athrow
		// @50: return
	}
	
	C_100049_vf(int arg0, int arg1)
	{
		// @00: aload_0
		// @01: invokespecial java.lang.Object.<init>()void
		// @04: aload_0
		// @05: iload_2
		// @06: putfield int game.C_100049_vf.field_104207_m
		// @09: aload_0
		// @0A: aconst_null
		// @0B: putfield game.C_100327_ib game.C_100049_vf.field_104201_b
		// @0E: aload_0
		// @0F: iload_1
		// @10: putfield int game.C_100049_vf.field_104200_e
		// @13: aload_0
		// @14: iconst_m1
		// @15: putfield int game.C_100049_vf.field_104203_a
		// @18: goto @45
		// @1B: astore_3
		// @1C: aload_3
		// @1D: new java.lang.StringBuilder
		// @20: dup
		// @21: invokespecial java.lang.StringBuilder.<init>()void
		// @24: getstatic java.lang.String[] game.C_100049_vf.field_104220_z
		// @27: iconst_0
		// @28: aaload
		// @29: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2C: iload_1
		// @2D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @30: bipush 44 (0x2C)
		// @32: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @35: iload_2
		// @36: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @39: bipush 41 (0x29)
		// @3B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @41: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @44: athrow
		// @45: return
	}
	
	C_100049_vf(int arg0)
	{
		// @00: aload_0
		// @01: invokespecial java.lang.Object.<init>()void
		// @04: aload_0
		// @05: iconst_m1
		// @06: putfield int game.C_100049_vf.field_104203_a
		// @09: goto @2D
		// @0C: astore_2
		// @0D: aload_2
		// @0E: new java.lang.StringBuilder
		// @11: dup
		// @12: invokespecial java.lang.StringBuilder.<init>()void
		// @15: getstatic java.lang.String[] game.C_100049_vf.field_104220_z
		// @18: iconst_0
		// @19: aaload
		// @1A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1D: iload_1
		// @1E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @21: bipush 41 (0x29)
		// @23: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @26: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @29: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @2C: athrow
		// @2D: return
	}
	
	static
	{
		// @00: bipush 9 (0x09)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "EYS\u000e\u000e]V\t\u000cO"
		// @09: invokestatic game.C_100049_vf.func_104194_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100049_vf.func_104193_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "H\u0011S\u001c\u001a"
		// @14: invokestatic game.C_100049_vf.func_104194_z(java.lang.String)char[]
		// @17: invokestatic game.C_100049_vf.func_104193_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "]J\u0011^"
		// @1F: invokestatic game.C_100049_vf.func_104194_z(java.lang.String)char[]
		// @22: invokestatic game.C_100049_vf.func_104193_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "EYStO"
		// @2A: invokestatic game.C_100049_vf.func_104194_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100049_vf.func_104193_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "EYSwO"
		// @35: invokestatic game.C_100049_vf.func_104194_z(java.lang.String)char[]
		// @38: invokestatic game.C_100049_vf.func_104193_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "EYSpO"
		// @40: invokestatic game.C_100049_vf.func_104194_z(java.lang.String)char[]
		// @43: invokestatic game.C_100049_vf.func_104193_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "EYSqO"
		// @4C: invokestatic game.C_100049_vf.func_104194_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100049_vf.func_104193_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "EYSsO"
		// @58: invokestatic game.C_100049_vf.func_104194_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100049_vf.func_104193_z(char[])java.lang.String
		// @5E: aastore
		// @5F: dup
		// @60: bipush 8 (0x08)
		// @62: ldc "EYSvO"
		// @64: invokestatic game.C_100049_vf.func_104194_z(java.lang.String)char[]
		// @67: invokestatic game.C_100049_vf.func_104193_z(char[])java.lang.String
		// @6A: aastore
		// @6B: putstatic java.lang.String[] game.C_100049_vf.field_104220_z
		// @6E: bipush 22 (0x16)
		// @70: putstatic int game.C_100049_vf.field_104204_n
		// @73: ldc "\u007fP\u001cV\u000e]X]U\u0015RO\u0015[\u0004@"
		// @75: invokestatic game.C_100049_vf.func_104194_z(java.lang.String)char[]
		// @78: invokestatic game.C_100049_vf.func_104193_z(char[])java.lang.String
		// @7B: putstatic java.lang.String game.C_100049_vf.field_104205_o
		// @7E: ldc "fQ\u001b]\u0015GJ\u0013S\u0013VS\u0004\u0012\u0013[Z\u000fWGD^\u000e\u0012\u0006\u0013Y\u0012Q\u0012@\u001f\r@\u0008QS\u0018_GDW\u0014^\u0002\u0013L\u0018F\u0013ZQ\u001a\u0012\u0001FS\u0011A\u0004AZ\u0018\\G^P\u0019WI\u0013f\u0012GGPP\u0008^\u0003\u0013K\u000fKGWV\u000eS\u0005_V\u0013UGRQ\u0004\u0012\nFS\t[\u0017_Z]_\u0008]V\t]\u0015\u0013[\u000f[\u0011VM\u000e\u0012\u0008A\u001f\n[\tWP\n\u0012\u0002]W\u001c\\\u0004VR\u0018\\\u0013@\u0013][\u0001\u0013F\u0012GG[^\u000bWGRQ\u0004\u0012\u0002]^\u001f^\u0002W\u0011"
		// @80: invokestatic game.C_100049_vf.func_104194_z(java.lang.String)char[]
		// @83: invokestatic game.C_100049_vf.func_104193_z(char[])java.lang.String
		// @86: putstatic java.lang.String game.C_100049_vf.field_104217_r
		// @89: return
	}
	
	private static char[] func_104194_z(String arg0)
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
		// @0E: bipush 103 (0x67)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_104193_z(char[] arg0)
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
		// @30: bipush 51 (0x33)
		// @32: goto @46
		// @35: bipush 63 (0x3F)
		// @37: goto @46
		// @3A: bipush 125 (0x7D)
		// @3C: goto @46
		// @3F: bipush 50 (0x32)
		// @41: goto @46
		// @44: bipush 103 (0x67)
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
