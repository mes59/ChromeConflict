package game;

final class C_100075_uj extends C_100158_da
{
	int field_100658_r;
	int field_100649_l;
	static int field_100656_t;
	static int[] field_100655_u;
	static C_100331_ie field_100654_v;
	static String field_100650_m;
	int field_100652_k;
	static String field_100651_j;
	static int[] field_100657_s;
	static int field_100653_w;
	static C_100302_ka field_100659_q;
	static int field_100647_n;
	int field_100648_o;
	int field_100660_p;
	int field_100662_x;
	private static final String[] field_100661_z;
	
	public static void func_100645_a(boolean arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100075_uj.field_100650_m
		// @04: aconst_null
		// @05: putstatic game.C_100302_ka game.C_100075_uj.field_100659_q
		// @08: aconst_null
		// @09: putstatic game.C_100331_ie game.C_100075_uj.field_100654_v
		// @0C: aconst_null
		// @0D: putstatic int[] game.C_100075_uj.field_100655_u
		// @10: aconst_null
		// @11: putstatic int[] game.C_100075_uj.field_100657_s
		// @14: aconst_null
		// @15: putstatic java.lang.String game.C_100075_uj.field_100651_j
		// @18: iload_0
		// @19: ifeq @28
		// @1C: iconst_1
		// @1D: bipush -46 (0xD2)
		// @1F: iconst_0
		// @20: iconst_m1
		// @21: aconst_null
		// @22: checkcast java.lang.String
		// @25: invokestatic game.C_100075_uj.func_100646_a(boolean, int, boolean, int, java.lang.String)void
		// @28: goto @4C
		// @2B: astore_1
		// @2C: aload_1
		// @2D: new java.lang.StringBuilder
		// @30: dup
		// @31: invokespecial java.lang.StringBuilder.<init>()void
		// @34: getstatic java.lang.String[] game.C_100075_uj.field_100661_z
		// @37: iconst_4
		// @38: aaload
		// @39: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3C: iload_0
		// @3D: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @40: bipush 41 (0x29)
		// @42: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @45: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @48: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4B: athrow
		// @4C: return
	}
	
	static final int func_100641_a(int arg0, int arg1, int arg2)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #8
		// @05: iload_1
		// @06: iconst_m1
		// @07: if_icmpeq @15
		// @0A: aconst_null
		// @0B: checkcast game.C_100331_ie
		// @0E: putstatic game.C_100331_ie game.C_100075_uj.field_100654_v
		// @11: goto @15
		// @14: athrow
		// @15: iconst_0
		// @16: istore_3
		// @17: getstatic int game.C_100078_ul.field_103291_rb
		// @1A: istore #4
		// @1C: iload_3
		// @1D: getstatic java.lang.String[] game.C_100046_vk.field_102766_xb
		// @20: arraylength
		// @21: if_icmpge @AC
		// @24: getstatic int[] game.C_100338_jc.field_105364_g
		// @27: iload_3
		// @28: iaload
		// @29: istore #5
		// @2B: iload #5
		// @2D: iload #8
		// @2F: ifne @AD
		// @32: ifge @46
		// @35: goto @39
		// @38: athrow
		// @39: iload #4
		// @3B: getstatic int game.C_100239_oi.field_102307_w
		// @3E: iadd
		// @3F: istore #4
		// @41: iload #8
		// @43: ifeq @A4
		// @46: iconst_1
		// @47: getstatic java.lang.String[] game.C_100046_vk.field_102766_xb
		// @4A: iload_3
		// @4B: aaload
		// @4C: sipush 17493 (0x4455)
		// @4F: invokestatic game.C_100223_ab.func_106097_a(boolean, java.lang.String, int)int
		// @52: istore #6
		// @54: getstatic int game.C_100101_fc.field_103406_X
		// @57: iload #6
		// @59: ldc -1893710207 (0x8f204681)
		// @5B: ishr
		// @5C: ineg
		// @5D: iadd
		// @5E: istore #7
		// @60: iload #4
		// @62: getstatic int game.C_100283_ni.field_106755_f
		// @65: iadd
		// @66: istore #4
		// @68: iload_0
		// @69: iload #4
		// @6B: iload_2
		// @6C: iload #7
		// @6E: getstatic int game.C_100099_fb.field_103048_s
		// @71: ineg
		// @72: iadd
		// @73: getstatic int game.C_100180_ce.field_104811_r
		// @76: ldc -69723423 (0xfbd81ae1)
		// @78: ishl
		// @79: getstatic int game.C_100003_ga.field_103539_s
		// @7C: iadd
		// @7D: bipush -53 (0xCB)
		// @7F: getstatic int game.C_100099_fb.field_103048_s
		// @82: ldc -1183029439 (0xb97c6741)
		// @84: ishl
		// @85: iload #6
		// @87: iadd
		// @88: invokestatic game.C_100081_ue.func_100666_a(int, int, int, int, int, int, int)boolean
		// @8B: ifeq @91
		// @8E: iload #5
		// @90: ireturn
		// @91: iload #4
		// @93: getstatic int game.C_100283_ni.field_106755_f
		// @96: getstatic int game.C_100180_ce.field_104811_r
		// @99: ldc -1206546015 (0xb81591a1)
		// @9B: ishl
		// @9C: getstatic int game.C_100003_ga.field_103539_s
		// @9F: iadd
		// @A0: iadd
		// @A1: iadd
		// @A2: istore #4
		// @A4: iinc #3 +1
		// @A7: iload #8
		// @A9: ifeq @1C
		// @AC: iconst_m1
		// @AD: ireturn
		// @AE: astore_3
		// @AF: aload_3
		// @B0: new java.lang.StringBuilder
		// @B3: dup
		// @B4: invokespecial java.lang.StringBuilder.<init>()void
		// @B7: getstatic java.lang.String[] game.C_100075_uj.field_100661_z
		// @BA: iconst_5
		// @BB: aaload
		// @BC: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @BF: iload_0
		// @C0: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @C3: bipush 44 (0x2C)
		// @C5: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C8: iload_1
		// @C9: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @CC: bipush 44 (0x2C)
		// @CE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D1: iload_2
		// @D2: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @D5: bipush 41 (0x29)
		// @D7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @DA: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @DD: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @E0: athrow
	}
	
	static final int func_100642_a(int arg0, int[] arg1, C_100327_ib arg2)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #7
		// @005: iconst_0
		// @006: istore_3
		// @007: aload_2
		// @008: sipush -3099 (0xF3E5)
		// @00B: invokevirtual game.C_100327_ib.func_102460_q(int)int
		// @00E: istore #4
		// @010: iconst_0
		// @011: istore #5
		// @013: iconst_0
		// @014: istore #6
		// @016: iload #6
		// @018: iload #4
		// @01A: if_icmpge @089
		// @01D: iconst_5
		// @01E: aload_1
		// @01F: iload #6
		// @021: iaload
		// @022: iload #7
		// @024: ifne @08B
		// @027: if_icmpne @031
		// @02A: goto @02E
		// @02D: athrow
		// @02E: iinc #3 +1
		// @031: bipush 6 (0x06)
		// @033: aload_1
		// @034: iload #6
		// @036: iaload
		// @037: if_icmpeq @03E
		// @03A: goto @041
		// @03D: athrow
		// @03E: iinc #3 +2
		// @041: bipush -8 (0xF8)
		// @043: aload_1
		// @044: iload #6
		// @046: iaload
		// @047: iconst_m1
		// @048: ixor
		// @049: if_icmpeq @050
		// @04C: goto @053
		// @04F: athrow
		// @050: iinc #3 +3
		// @053: bipush 8 (0x08)
		// @055: aload_1
		// @056: iload #6
		// @058: iaload
		// @059: if_icmpne @063
		// @05C: iinc #3 +4
		// @05F: goto @063
		// @062: athrow
		// @063: aload_1
		// @064: iload #6
		// @066: iaload
		// @067: bipush 34 (0x22)
		// @069: if_icmpne @06F
		// @06C: iconst_1
		// @06D: istore #5
		// @06F: bipush -10 (0xF6)
		// @071: aload_1
		// @072: iload #6
		// @074: iaload
		// @075: iconst_m1
		// @076: ixor
		// @077: if_icmpeq @07E
		// @07A: goto @081
		// @07D: athrow
		// @07E: iinc #3 +5
		// @081: iinc #6 +1
		// @084: iload #7
		// @086: ifeq @016
		// @089: iload_0
		// @08A: iconst_4
		// @08B: if_icmpeq @099
		// @08E: aconst_null
		// @08F: checkcast java.lang.String
		// @092: putstatic java.lang.String game.C_100075_uj.field_100650_m
		// @095: goto @099
		// @098: athrow
		// @099: iload #5
		// @09B: ifne @0A2
		// @09E: goto @0A5
		// @0A1: athrow
		// @0A2: iinc #3 +15
		// @0A5: iinc #3 +2
		// @0A8: iload_3
		// @0A9: ireturn
		// @0AA: astore_3
		// @0AB: aload_3
		// @0AC: new java.lang.StringBuilder
		// @0AF: dup
		// @0B0: invokespecial java.lang.StringBuilder.<init>()void
		// @0B3: getstatic java.lang.String[] game.C_100075_uj.field_100661_z
		// @0B6: bipush 6 (0x06)
		// @0B8: aaload
		// @0B9: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0BC: iload_0
		// @0BD: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0C0: bipush 44 (0x2C)
		// @0C2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0C5: aload_1
		// @0C6: ifnull @0D2
		// @0C9: getstatic java.lang.String[] game.C_100075_uj.field_100661_z
		// @0CC: iconst_1
		// @0CD: aaload
		// @0CE: goto @0D7
		// @0D1: athrow
		// @0D2: getstatic java.lang.String[] game.C_100075_uj.field_100661_z
		// @0D5: iconst_2
		// @0D6: aaload
		// @0D7: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0DA: bipush 44 (0x2C)
		// @0DC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0DF: aload_2
		// @0E0: ifnull @0EC
		// @0E3: getstatic java.lang.String[] game.C_100075_uj.field_100661_z
		// @0E6: iconst_1
		// @0E7: aaload
		// @0E8: goto @0F1
		// @0EB: athrow
		// @0EC: getstatic java.lang.String[] game.C_100075_uj.field_100661_z
		// @0EF: iconst_2
		// @0F0: aaload
		// @0F1: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0F4: bipush 41 (0x29)
		// @0F6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0F9: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @0FC: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @0FF: athrow
	}
	
	static final C_100061_dh func_100640_a(String arg0, int arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #6
		// @05: aconst_null
		// @06: getstatic game.C_100105_eg game.C_100003_ga.field_103533_h
		// @09: if_acmpne @0E
		// @0C: aconst_null
		// @0D: areturn
		// @0E: bipush 66 (0x42)
		// @10: aload_0
		// @11: invokestatic game.C_100106_ef.func_104742_a(byte, java.lang.CharSequence)java.lang.String
		// @14: astore_2
		// @15: aload_2
		// @16: ifnull @1D
		// @19: goto @1F
		// @1C: athrow
		// @1D: aload_0
		// @1E: astore_2
		// @1F: getstatic game.C_100105_eg game.C_100003_ga.field_103533_h
		// @22: sipush -16397 (0xBFF3)
		// @25: aload_2
		// @26: invokevirtual java.lang.String.hashCode()int
		// @29: i2l
		// @2A: invokevirtual game.C_100105_eg.func_104724_a(int, long)game.C_100325_id
		// @2D: checkcast game.C_100061_dh
		// @30: astore_3
		// @31: bipush -77 (0xB3)
		// @33: iload_1
		// @34: bipush 9 (0x09)
		// @36: isub
		// @37: bipush 41 (0x29)
		// @39: idiv
		// @3A: idiv
		// @3B: istore #4
		// @3D: aconst_null
		// @3E: aload_3
		// @3F: if_acmpeq @85
		// @42: bipush 125 (0x7D)
		// @44: aload_3
		// @45: getfield java.lang.String game.C_100061_dh.field_101993_nc
		// @48: invokestatic game.C_100106_ef.func_104742_a(byte, java.lang.CharSequence)java.lang.String
		// @4B: astore #5
		// @4D: aconst_null
		// @4E: iload #6
		// @50: ifne @86
		// @53: aload #5
		// @55: if_acmpeq @60
		// @58: goto @5C
		// @5B: athrow
		// @5C: goto @66
		// @5F: athrow
		// @60: aload_3
		// @61: getfield java.lang.String game.C_100061_dh.field_101993_nc
		// @64: astore #5
		// @66: aload #5
		// @68: aload_2
		// @69: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @6C: ifne @73
		// @6F: goto @75
		// @72: athrow
		// @73: aload_3
		// @74: areturn
		// @75: getstatic game.C_100105_eg game.C_100003_ga.field_103533_h
		// @78: iconst_m1
		// @79: invokevirtual game.C_100105_eg.func_104732_a(int)game.C_100325_id
		// @7C: checkcast game.C_100061_dh
		// @7F: astore_3
		// @80: iload #6
		// @82: ifeq @3D
		// @85: aconst_null
		// @86: areturn
		// @87: astore_2
		// @88: aload_2
		// @89: new java.lang.StringBuilder
		// @8C: dup
		// @8D: invokespecial java.lang.StringBuilder.<init>()void
		// @90: getstatic java.lang.String[] game.C_100075_uj.field_100661_z
		// @93: bipush 7 (0x07)
		// @95: aaload
		// @96: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @99: aload_0
		// @9A: ifnull @A6
		// @9D: getstatic java.lang.String[] game.C_100075_uj.field_100661_z
		// @A0: iconst_1
		// @A1: aaload
		// @A2: goto @AB
		// @A5: athrow
		// @A6: getstatic java.lang.String[] game.C_100075_uj.field_100661_z
		// @A9: iconst_2
		// @AA: aaload
		// @AB: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @AE: bipush 44 (0x2C)
		// @B0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B3: iload_1
		// @B4: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @B7: bipush 41 (0x29)
		// @B9: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @BC: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @BF: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @C2: athrow
	}
	
	private C_100075_uj() throws Throwable
	{
		// @00: aload_0
		// @01: invokespecial game.C_100158_da.<init>()void
		// @04: new java.lang.Error
		// @07: dup
		// @08: invokespecial java.lang.Error.<init>()void
		// @0B: athrow
		// @0C: astore_1
		// @0D: aload_1
		// @0E: getstatic java.lang.String[] game.C_100075_uj.field_100661_z
		// @11: iconst_3
		// @12: aaload
		// @13: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @16: athrow
	}
	
	static final void func_100646_a(boolean arg0, int arg1, boolean arg2, int arg3, String arg4)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #10
		// @005: iconst_1
		// @006: putstatic boolean game.C_100341_jd.field_102647_nb
		// @009: iload_1
		// @00A: putstatic int game.C_100054_ec.field_101955_Xb
		// @00D: aload #4
		// @00F: astore #5
		// @011: iload_0
		// @012: ifeq @01C
		// @015: getstatic java.lang.String game.C_100091_m.field_104519_h
		// @018: goto @01F
		// @01B: athrow
		// @01C: getstatic java.lang.String game.C_100198_qn.field_105836_a
		// @01F: astore #6
		// @021: getstatic int game.C_100054_ec.field_101955_Xb
		// @024: iconst_m1
		// @025: ixor
		// @026: iconst_m1
		// @027: if_icmpne @0E7
		// @02A: getstatic java.lang.String[] game.C_100233_oa.field_106239_b
		// @02D: sipush 480 (0x01E0)
		// @030: iconst_0
		// @031: aload #5
		// @033: getstatic game.C_100112_r game.C_100060_di.field_104269_d
		// @036: invokestatic game.C_100087_n.func_100686_a(java.lang.String[], int, boolean, java.lang.String, game.C_100112_r)int
		// @039: istore #7
		// @03B: iload #7
		// @03D: iconst_3
		// @03E: iadd
		// @03F: istore #8
		// @041: iload #8
		// @043: anewarray java.lang.String
		// @046: putstatic java.lang.String[] game.C_100046_vk.field_102766_xb
		// @049: iload #8
		// @04B: newarray int[]
		// @04D: putstatic int[] game.C_100338_jc.field_105364_g
		// @050: iconst_0
		// @051: istore #9
		// @053: iload #8
		// @055: iload #9
		// @057: if_icmple @072
		// @05A: getstatic int[] game.C_100338_jc.field_105364_g
		// @05D: iload #9
		// @05F: iconst_m1
		// @060: iastore
		// @061: iinc #9 +1
		// @064: iload #10
		// @066: ifne @078
		// @069: iload #10
		// @06B: ifeq @053
		// @06E: goto @072
		// @071: athrow
		// @072: iconst_2
		// @073: newarray int[]
		// @075: putstatic int[] game.C_100056_de.field_103187_ib
		// @078: iconst_0
		// @079: istore #9
		// @07B: iload #9
		// @07D: iconst_m1
		// @07E: ixor
		// @07F: iload #7
		// @081: iconst_m1
		// @082: ixor
		// @083: if_icmple @0A3
		// @086: getstatic java.lang.String[] game.C_100046_vk.field_102766_xb
		// @089: iload #9
		// @08B: getstatic java.lang.String[] game.C_100233_oa.field_106239_b
		// @08E: iload #9
		// @090: aaload
		// @091: aastore
		// @092: iinc #9 +1
		// @095: iload #10
		// @097: ifne @0E2
		// @09A: iload #10
		// @09C: ifeq @07B
		// @09F: goto @0A3
		// @0A2: athrow
		// @0A3: getstatic java.lang.String[] game.C_100046_vk.field_102766_xb
		// @0A6: bipush -3 (0xFD)
		// @0A8: iload #8
		// @0AA: iadd
		// @0AB: ldc ""
		// @0AD: aastore
		// @0AE: getstatic java.lang.String[] game.C_100046_vk.field_102766_xb
		// @0B1: bipush -2 (0xFE)
		// @0B3: iload #8
		// @0B5: iadd
		// @0B6: aload #6
		// @0B8: aastore
		// @0B9: getstatic int[] game.C_100338_jc.field_105364_g
		// @0BC: iload #8
		// @0BE: iconst_2
		// @0BF: isub
		// @0C0: iconst_0
		// @0C1: iastore
		// @0C2: getstatic int[] game.C_100056_de.field_103187_ib
		// @0C5: iconst_0
		// @0C6: iconst_1
		// @0C7: iastore
		// @0C8: getstatic java.lang.String[] game.C_100046_vk.field_102766_xb
		// @0CB: iconst_m1
		// @0CC: iload #8
		// @0CE: iadd
		// @0CF: getstatic java.lang.String game.C_100180_ce.field_104807_v
		// @0D2: aastore
		// @0D3: getstatic int[] game.C_100338_jc.field_105364_g
		// @0D6: iload #8
		// @0D8: iconst_m1
		// @0D9: iadd
		// @0DA: iconst_1
		// @0DB: iastore
		// @0DC: getstatic int[] game.C_100056_de.field_103187_ib
		// @0DF: iconst_1
		// @0E0: iconst_2
		// @0E1: iastore
		// @0E2: iload #10
		// @0E4: ifeq @1A1
		// @0E7: getstatic int game.C_100054_ec.field_101955_Xb
		// @0EA: iconst_m1
		// @0EB: ixor
		// @0EC: bipush -2 (0xFE)
		// @0EE: if_icmpne @198
		// @0F1: goto @0F5
		// @0F4: athrow
		// @0F5: getstatic java.lang.String[] game.C_100233_oa.field_106239_b
		// @0F8: sipush 480 (0x01E0)
		// @0FB: iconst_0
		// @0FC: aload #5
		// @0FE: getstatic game.C_100112_r game.C_100060_di.field_104269_d
		// @101: invokestatic game.C_100087_n.func_100686_a(java.lang.String[], int, boolean, java.lang.String, game.C_100112_r)int
		// @104: istore #7
		// @106: iload #7
		// @108: iconst_2
		// @109: iadd
		// @10A: istore #8
		// @10C: iload #8
		// @10E: newarray int[]
		// @110: putstatic int[] game.C_100338_jc.field_105364_g
		// @113: iload #8
		// @115: anewarray java.lang.String
		// @118: putstatic java.lang.String[] game.C_100046_vk.field_102766_xb
		// @11B: iconst_0
		// @11C: istore #9
		// @11E: iload #9
		// @120: iload #8
		// @122: if_icmpge @13D
		// @125: getstatic int[] game.C_100338_jc.field_105364_g
		// @128: iload #9
		// @12A: iconst_m1
		// @12B: iastore
		// @12C: iinc #9 +1
		// @12F: iload #10
		// @131: ifne @143
		// @134: iload #10
		// @136: ifeq @11E
		// @139: goto @13D
		// @13C: athrow
		// @13D: iconst_1
		// @13E: newarray int[]
		// @140: putstatic int[] game.C_100056_de.field_103187_ib
		// @143: iconst_0
		// @144: istore #9
		// @146: iload #9
		// @148: iconst_m1
		// @149: ixor
		// @14A: iload #7
		// @14C: iconst_m1
		// @14D: ixor
		// @14E: if_icmple @16E
		// @151: getstatic java.lang.String[] game.C_100046_vk.field_102766_xb
		// @154: iload #9
		// @156: getstatic java.lang.String[] game.C_100233_oa.field_106239_b
		// @159: iload #9
		// @15B: aaload
		// @15C: aastore
		// @15D: iinc #9 +1
		// @160: iload #10
		// @162: ifne @193
		// @165: iload #10
		// @167: ifeq @146
		// @16A: goto @16E
		// @16D: athrow
		// @16E: getstatic java.lang.String[] game.C_100046_vk.field_102766_xb
		// @171: bipush -2 (0xFE)
		// @173: iload #8
		// @175: iadd
		// @176: ldc ""
		// @178: aastore
		// @179: getstatic java.lang.String[] game.C_100046_vk.field_102766_xb
		// @17C: iload #8
		// @17E: iconst_1
		// @17F: isub
		// @180: getstatic java.lang.String game.C_100180_ce.field_104807_v
		// @183: aastore
		// @184: getstatic int[] game.C_100338_jc.field_105364_g
		// @187: iconst_m1
		// @188: iload #8
		// @18A: iadd
		// @18B: iconst_0
		// @18C: iastore
		// @18D: getstatic int[] game.C_100056_de.field_103187_ib
		// @190: iconst_0
		// @191: iconst_2
		// @192: iastore
		// @193: iload #10
		// @195: ifeq @1A1
		// @198: new java.lang.IllegalArgumentException
		// @19B: dup
		// @19C: invokespecial java.lang.IllegalArgumentException.<init>()void
		// @19F: athrow
		// @1A0: athrow
		// @1A1: getstatic game.C_100333_ij game.C_100143_bl.field_105101_d
		// @1A4: getstatic int[] game.C_100056_de.field_103187_ib
		// @1A7: arraylength
		// @1A8: putfield int game.C_100333_ij.field_107344_g
		// @1AB: iconst_0
		// @1AC: istore #7
		// @1AE: iconst_0
		// @1AF: istore #8
		// @1B1: getstatic java.lang.String[] game.C_100046_vk.field_102766_xb
		// @1B4: arraylength
		// @1B5: iload #8
		// @1B7: if_icmple @211
		// @1BA: getstatic int[] game.C_100338_jc.field_105364_g
		// @1BD: iload #8
		// @1BF: iaload
		// @1C0: iload #10
		// @1C2: ifne @222
		// @1C5: iflt @1D1
		// @1C8: goto @1CC
		// @1CB: athrow
		// @1CC: iconst_1
		// @1CD: goto @1D2
		// @1D0: athrow
		// @1D1: iconst_0
		// @1D2: getstatic java.lang.String[] game.C_100046_vk.field_102766_xb
		// @1D5: iload #8
		// @1D7: aaload
		// @1D8: sipush 17493 (0x4455)
		// @1DB: invokestatic game.C_100223_ab.func_106097_a(boolean, java.lang.String, int)int
		// @1DE: istore #9
		// @1E0: iconst_0
		// @1E1: getstatic int[] game.C_100338_jc.field_105364_g
		// @1E4: iload #8
		// @1E6: iaload
		// @1E7: iconst_m1
		// @1E8: ixor
		// @1E9: if_icmpne @1F0
		// @1EC: goto @1FA
		// @1EF: athrow
		// @1F0: iload #9
		// @1F2: getstatic int game.C_100099_fb.field_103048_s
		// @1F5: iconst_2
		// @1F6: imul
		// @1F7: iadd
		// @1F8: istore #9
		// @1FA: iload #9
		// @1FC: iload #7
		// @1FE: if_icmpgt @205
		// @201: goto @209
		// @204: athrow
		// @205: iload #9
		// @207: istore #7
		// @209: iinc #8 +1
		// @20C: iload #10
		// @20E: ifeq @1B1
		// @211: iload #7
		// @213: ldc 668463489 (0x27d7f181)
		// @215: ishr
		// @216: ineg
		// @217: iload #7
		// @219: iadd
		// @21A: getstatic int game.C_100101_fc.field_103406_X
		// @21D: iadd
		// @21E: putstatic int game.C_100033_gj.field_101920_oc
		// @221: iload_3
		// @222: ldc -69723423 (0xfbd81ae1)
		// @224: if_icmpeq @228
		// @227: return
		// @228: getstatic int game.C_100101_fc.field_103406_X
		// @22B: iload #7
		// @22D: ldc 2012700673 (0x77f76001)
		// @22F: ishr
		// @230: ineg
		// @231: iadd
		// @232: putstatic int game.C_100197_ra.field_100866_s
		// @235: getstatic int game.C_100180_ce.field_104811_r
		// @238: getstatic int game.C_100283_ni.field_106755_f
		// @23B: iadd
		// @23C: ldc 608474721 (0x24449661)
		// @23E: ishl
		// @23F: getstatic game.C_100333_ij game.C_100143_bl.field_105101_d
		// @242: getfield int game.C_100333_ij.field_107344_g
		// @245: imul
		// @246: putstatic int game.C_100093_fd.field_102785_S
		// @249: iconst_0
		// @24A: istore #8
		// @24C: getstatic java.lang.String[] game.C_100046_vk.field_102766_xb
		// @24F: arraylength
		// @250: iconst_m1
		// @251: ixor
		// @252: iload #8
		// @254: iconst_m1
		// @255: ixor
		// @256: if_icmpge @284
		// @259: getstatic int game.C_100093_fd.field_102785_S
		// @25C: getstatic int[] game.C_100338_jc.field_105364_g
		// @25F: iload #8
		// @261: iaload
		// @262: iload #10
		// @264: ifne @28E
		// @267: iflt @275
		// @26A: goto @26E
		// @26D: athrow
		// @26E: getstatic int game.C_100003_ga.field_103539_s
		// @271: goto @278
		// @274: athrow
		// @275: getstatic int game.C_100239_oi.field_102307_w
		// @278: iadd
		// @279: putstatic int game.C_100093_fd.field_102785_S
		// @27C: iinc #8 +1
		// @27F: iload #10
		// @281: ifeq @24C
		// @284: getstatic int game.C_100093_fd.field_102785_S
		// @287: ldc 972056929 (0x39f06961)
		// @289: ishr
		// @28A: ineg
		// @28B: getstatic int game.C_100163_sf.field_105436_d
		// @28E: iadd
		// @28F: putstatic int game.C_100078_ul.field_103291_rb
		// @292: getstatic game.C_100333_ij game.C_100143_bl.field_105101_d
		// @295: iload_3
		// @296: ldc 69723423 (0x427e51f)
		// @298: iadd
		// @299: getstatic int game.C_100015_wh.field_103781_g
		// @29C: iconst_m1
		// @29D: getstatic int game.C_100338_jc.field_105370_l
		// @2A0: invokestatic game.C_100075_uj.func_100641_a(int, int, int)int
		// @2A3: iconst_0
		// @2A4: iload_2
		// @2A5: invokevirtual game.C_100333_ij.func_107340_a(int, int, int, boolean)void
		// @2A8: goto @304
		// @2AB: astore #5
		// @2AD: aload #5
		// @2AF: new java.lang.StringBuilder
		// @2B2: dup
		// @2B3: invokespecial java.lang.StringBuilder.<init>()void
		// @2B6: getstatic java.lang.String[] game.C_100075_uj.field_100661_z
		// @2B9: iconst_0
		// @2BA: aaload
		// @2BB: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2BE: iload_0
		// @2BF: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @2C2: bipush 44 (0x2C)
		// @2C4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2C7: iload_1
		// @2C8: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2CB: bipush 44 (0x2C)
		// @2CD: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2D0: iload_2
		// @2D1: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @2D4: bipush 44 (0x2C)
		// @2D6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2D9: iload_3
		// @2DA: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2DD: bipush 44 (0x2C)
		// @2DF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2E2: aload #4
		// @2E4: ifnull @2F0
		// @2E7: getstatic java.lang.String[] game.C_100075_uj.field_100661_z
		// @2EA: iconst_1
		// @2EB: aaload
		// @2EC: goto @2F5
		// @2EF: athrow
		// @2F0: getstatic java.lang.String[] game.C_100075_uj.field_100661_z
		// @2F3: iconst_2
		// @2F4: aaload
		// @2F5: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2F8: bipush 41 (0x29)
		// @2FA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2FD: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @300: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @303: athrow
		// @304: return
	}
	
	static
	{
		// @00: bipush 8 (0x08)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "g\u0008+\u0005P"
		// @09: invokestatic game.C_100075_uj.func_100644_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100075_uj.func_100643_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "iL+h\u0005"
		// @14: invokestatic game.C_100075_uj.func_100644_z(java.lang.String)char[]
		// @17: invokestatic game.C_100075_uj.func_100643_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "|\u0017i*"
		// @1F: invokestatic game.C_100075_uj.func_100644_z(java.lang.String)char[]
		// @22: invokestatic game.C_100075_uj.func_100643_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "g\u0008+z\u0011|\u000bqxP;"
		// @2A: invokestatic game.C_100075_uj.func_100644_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100075_uj.func_100643_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "g\u0008+\u0004P"
		// @35: invokestatic game.C_100075_uj.func_100644_z(java.lang.String)char[]
		// @38: invokestatic game.C_100075_uj.func_100643_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "g\u0008+\u0002P"
		// @40: invokestatic game.C_100075_uj.func_100644_z(java.lang.String)char[]
		// @43: invokestatic game.C_100075_uj.func_100643_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "g\u0008+\u0003P"
		// @4C: invokestatic game.C_100075_uj.func_100644_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100075_uj.func_100643_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "g\u0008+\u0007P"
		// @58: invokestatic game.C_100075_uj.func_100644_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100075_uj.func_100643_z(char[])java.lang.String
		// @5E: aastore
		// @5F: putstatic java.lang.String[] game.C_100075_uj.field_100661_z
		// @62: iconst_2
		// @63: newarray int[]
		// @65: putstatic int[] game.C_100075_uj.field_100655_u
		// @68: ldc "@\u0007o#\u001bfB9cH,Bc4\u0017\u007fBq.\u0011aBb'\u0015w"
		// @6A: invokestatic game.C_100075_uj.func_100644_z(java.lang.String)char[]
		// @6D: invokestatic game.C_100075_uj.func_100643_z(char[])java.lang.String
		// @70: putstatic java.lang.String game.C_100075_uj.field_100650_m
		// @73: ldc ".\u0000wxDp\u0010;\u0005\u0014}\u0011`k\u001b}\u000fg'\u000c2\u0003q2\u0019q\t?fDq\ri{\u001et\u0004c \u001e,^ vF.Mf)\u0014,"
		// @75: invokestatic game.C_100075_uj.func_100644_z(java.lang.String)char[]
		// @78: invokestatic game.C_100075_uj.func_100643_z(char[])java.lang.String
		// @7B: putstatic java.lang.String game.C_100075_uj.field_100651_j
		// @7E: iconst_m1
		// @7F: putstatic int game.C_100075_uj.field_100647_n
		// @82: bipush 32 (0x20)
		// @84: putstatic int game.C_100075_uj.field_100653_w
		// @87: bipush 50 (0x32)
		// @89: putstatic int game.C_100075_uj.field_100656_t
		// @8C: return
	}
	
	private static char[] func_100644_z(String arg0)
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
		// @0E: bipush 120 (0x78)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_100643_z(char[] arg0)
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
		// @10: tableswitch def: @43, for 0: @30, for 1: @35, for 2: @3A, for 3: @3E
		// @30: bipush 18 (0x12)
		// @32: goto @45
		// @35: bipush 98 (0x62)
		// @37: goto @45
		// @3A: iconst_5
		// @3B: goto @45
		// @3E: bipush 70 (0x46)
		// @40: goto @45
		// @43: bipush 120 (0x78)
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
