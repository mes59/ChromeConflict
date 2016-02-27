package game;

final class C_100031_gl
{
	static int field_103969_j;
	static int field_103962_f;
	static int field_103966_b;
	static int field_103968_a;
	static int field_103965_e;
	static C_100302_ka field_103967_c;
	static String field_103964_d;
	static C_100186_rl field_103972_i;
	static String field_103971_h;
	static C_100302_ka field_103963_g;
	private static final String[] field_103970_z;
	
	static final void func_103960_a(byte arg0, String arg1)
	{
		// @00: iload_0
		// @01: bipush -56 (0xC8)
		// @03: if_icmplt @0F
		// @06: bipush 27 (0x1B)
		// @08: putstatic int game.C_100031_gl.field_103968_a
		// @0B: goto @0F
		// @0E: athrow
		// @0F: getstatic java.io.PrintStream java.lang.System.out
		// @12: new java.lang.StringBuilder
		// @15: dup
		// @16: invokespecial java.lang.StringBuilder.<init>()void
		// @19: getstatic java.lang.String[] game.C_100031_gl.field_103970_z
		// @1C: bipush 13 (0x0D)
		// @1E: aaload
		// @1F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @22: iconst_1
		// @23: aload_1
		// @24: ldc "\n"
		// @26: getstatic java.lang.String[] game.C_100031_gl.field_103970_z
		// @29: bipush 12 (0x0C)
		// @2B: aaload
		// @2C: invokestatic game.C_100263_mb.func_106497_a(int, java.lang.String, java.lang.String, java.lang.String)java.lang.String
		// @2F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @32: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @35: invokevirtual java.io.PrintStream.println(java.lang.String)void
		// @38: goto @3E
		// @3B: astore_2
		// @3C: aload_2
		// @3D: athrow
		// @3E: return
	}
	
	static final void func_103958_a(byte arg0)
	{
		// @00: getstatic boolean game.C_100191_rg.field_100847_m
		// @03: ifne @09
		// @06: goto @0A
		// @09: return
		// @0A: iconst_1
		// @0B: putstatic boolean game.C_100191_rg.field_100847_m
		// @0E: iload_0
		// @0F: bipush -56 (0xC8)
		// @11: if_icmplt @1F
		// @14: aconst_null
		// @15: checkcast game.C_100302_ka
		// @18: putstatic game.C_100302_ka game.C_100031_gl.field_103967_c
		// @1B: goto @1F
		// @1E: athrow
		// @1F: ldc Class<java.awt.Toolkit>
		// @21: astore_1
		// @22: aload_1
		// @23: getstatic java.lang.String[] game.C_100031_gl.field_103970_z
		// @26: bipush 15 (0x0F)
		// @28: aaload
		// @29: iconst_3
		// @2A: anewarray java.lang.Class
		// @2D: dup
		// @2E: iconst_0
		// @2F: ldc Class<java.awt.Image>
		// @31: aastore
		// @32: dup
		// @33: iconst_1
		// @34: ldc Class<java.awt.Point>
		// @36: aastore
		// @37: dup
		// @38: iconst_2
		// @39: ldc Class<java.lang.String>
		// @3B: aastore
		// @3C: invokevirtual java.lang.Class.getMethod(java.lang.String, java.lang.Class[])java.lang.reflect.Method
		// @3F: putstatic java.lang.reflect.Method game.C_100019_wl.field_103846_a
		// @42: getstatic java.lang.String[] game.C_100031_gl.field_103970_z
		// @45: bipush 14 (0x0E)
		// @47: aaload
		// @48: invokestatic java.lang.Class.forName(java.lang.String)java.lang.Class
		// @4B: astore_2
		// @4C: aload_2
		// @4D: iconst_3
		// @4E: anewarray java.lang.Class
		// @51: dup
		// @52: iconst_0
		// @53: getstatic java.lang.Class java.lang.Integer.TYPE
		// @56: aastore
		// @57: dup
		// @58: iconst_1
		// @59: getstatic java.lang.Class java.lang.Integer.TYPE
		// @5C: aastore
		// @5D: dup
		// @5E: iconst_2
		// @5F: getstatic java.lang.Class java.lang.Integer.TYPE
		// @62: aastore
		// @63: invokevirtual java.lang.Class.getConstructor(java.lang.Class[])java.lang.reflect.Constructor
		// @66: putstatic java.lang.reflect.Constructor game.C_100250_pl.field_106437_c
		// @69: aload_2
		// @6A: getstatic java.lang.String[] game.C_100031_gl.field_103970_z
		// @6D: bipush 17 (0x11)
		// @6F: aaload
		// @70: invokevirtual java.lang.Class.getField(java.lang.String)java.lang.reflect.Field
		// @73: aconst_null
		// @74: invokevirtual java.lang.reflect.Field.getInt(java.lang.Object)int
		// @77: putstatic int game.C_100127_tl.field_104950_a
		// @7A: aload_2
		// @7B: getstatic java.lang.String[] game.C_100031_gl.field_103970_z
		// @7E: bipush 18 (0x12)
		// @80: aaload
		// @81: bipush 7 (0x07)
		// @83: anewarray java.lang.Class
		// @86: dup
		// @87: iconst_0
		// @88: getstatic java.lang.Class java.lang.Integer.TYPE
		// @8B: aastore
		// @8C: dup
		// @8D: iconst_1
		// @8E: getstatic java.lang.Class java.lang.Integer.TYPE
		// @91: aastore
		// @92: dup
		// @93: iconst_2
		// @94: getstatic java.lang.Class java.lang.Integer.TYPE
		// @97: aastore
		// @98: dup
		// @99: iconst_3
		// @9A: getstatic java.lang.Class java.lang.Integer.TYPE
		// @9D: aastore
		// @9E: dup
		// @9F: iconst_4
		// @A0: ldc Class<[I>
		// @A2: aastore
		// @A3: dup
		// @A4: iconst_5
		// @A5: getstatic java.lang.Class java.lang.Integer.TYPE
		// @A8: aastore
		// @A9: dup
		// @AA: bipush 6 (0x06)
		// @AC: getstatic java.lang.Class java.lang.Integer.TYPE
		// @AF: aastore
		// @B0: invokevirtual java.lang.Class.getMethod(java.lang.String, java.lang.Class[])java.lang.reflect.Method
		// @B3: putstatic java.lang.reflect.Method game.C_100148_bh.field_101793_E
		// @B6: goto @D1
		// @B9: astore_2
		// @BA: aconst_null
		// @BB: putstatic java.lang.reflect.Method game.C_100019_wl.field_103846_a
		// @BE: return
		// @BF: astore_2
		// @C0: aconst_null
		// @C1: putstatic java.lang.reflect.Method game.C_100019_wl.field_103846_a
		// @C4: return
		// @C5: astore_2
		// @C6: aconst_null
		// @C7: putstatic java.lang.reflect.Method game.C_100019_wl.field_103846_a
		// @CA: return
		// @CB: astore_2
		// @CC: aconst_null
		// @CD: putstatic java.lang.reflect.Method game.C_100019_wl.field_103846_a
		// @D0: return
		// @D1: goto @F6
		// @D4: astore_1
		// @D5: aload_1
		// @D6: new java.lang.StringBuilder
		// @D9: dup
		// @DA: invokespecial java.lang.StringBuilder.<init>()void
		// @DD: getstatic java.lang.String[] game.C_100031_gl.field_103970_z
		// @E0: bipush 16 (0x10)
		// @E2: aaload
		// @E3: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @E6: iload_0
		// @E7: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @EA: bipush 41 (0x29)
		// @EC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @EF: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @F2: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @F5: athrow
		// @F6: return
	}
	
	static final void func_103961_a(boolean arg0, int arg1, C_100115_ej arg2, int arg3, int arg4)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #31
		// @005: iconst_0
		// @006: istore #5
		// @008: iconst_0
		// @009: istore #6
		// @00B: iconst_0
		// @00C: istore #7
		// @00E: iconst_0
		// @00F: istore #8
		// @011: getstatic game.C_100211_qd game.C_100068_vc.field_104342_d
		// @014: ifnull @148
		// @017: getstatic boolean[][] game.C_100245_pf.field_106386_d
		// @01A: ifnonnull @042
		// @01D: goto @021
		// @020: athrow
		// @021: aconst_null
		// @022: getstatic int[][] game.C_100332_ii.field_107319_k
		// @025: if_acmpne @042
		// @028: goto @02C
		// @02B: athrow
		// @02C: aconst_null
		// @02D: getstatic int[][] game.C_100151_bc.field_102939_V
		// @030: if_acmpne @042
		// @033: goto @037
		// @036: athrow
		// @037: aconst_null
		// @038: getstatic int[][] game.C_100231_oc.field_102194_Zb
		// @03B: if_acmpeq @148
		// @03E: goto @042
		// @041: athrow
		// @042: iconst_0
		// @043: istore #9
		// @045: iload #9
		// @047: getstatic int game.C_100137_bn.field_105038_l
		// @04A: if_icmpge @148
		// @04D: getstatic game.C_100211_qd game.C_100068_vc.field_104342_d
		// @050: getfield byte[] game.C_100211_qd.field_102165_jc
		// @053: iload #9
		// @055: baload
		// @056: sipush 255 (0x00FF)
		// @059: iand
		// @05A: istore #10
		// @05C: iload #31
		// @05E: ifne @16F
		// @061: aconst_null
		// @062: getstatic boolean[][] game.C_100245_pf.field_106386_d
		// @065: if_acmpeq @090
		// @068: goto @06C
		// @06B: athrow
		// @06C: getstatic boolean[][] game.C_100245_pf.field_106386_d
		// @06F: iload #9
		// @071: aaload
		// @072: ifnull @090
		// @075: goto @079
		// @078: athrow
		// @079: getstatic boolean[][] game.C_100245_pf.field_106386_d
		// @07C: iload #9
		// @07E: aaload
		// @07F: iload #10
		// @081: baload
		// @082: ifne @08D
		// @085: goto @089
		// @088: athrow
		// @089: goto @090
		// @08C: athrow
		// @08D: iconst_1
		// @08E: istore #5
		// @090: getstatic int[][] game.C_100332_ii.field_107319_k
		// @093: ifnull @0D4
		// @096: getstatic int[][] game.C_100332_ii.field_107319_k
		// @099: iload #9
		// @09B: aaload
		// @09C: ifnull @0D4
		// @09F: goto @0A3
		// @0A2: athrow
		// @0A3: getstatic int[][] game.C_100332_ii.field_107319_k
		// @0A6: iload #9
		// @0A8: aaload
		// @0A9: iload #10
		// @0AB: iaload
		// @0AC: istore #11
		// @0AE: iconst_0
		// @0AF: iload #11
		// @0B1: if_icmpeq @0C1
		// @0B4: getstatic boolean game.C_100154_sl.field_105330_g
		// @0B7: ifne @0C1
		// @0BA: goto @0BE
		// @0BD: athrow
		// @0BE: iconst_1
		// @0BF: istore #5
		// @0C1: iload #6
		// @0C3: iconst_m1
		// @0C4: ixor
		// @0C5: iload #11
		// @0C7: iconst_m1
		// @0C8: ixor
		// @0C9: if_icmpgt @0D0
		// @0CC: goto @0D4
		// @0CF: athrow
		// @0D0: iload #11
		// @0D2: istore #6
		// @0D4: getstatic int[][] game.C_100151_bc.field_102939_V
		// @0D7: ifnull @11D
		// @0DA: aconst_null
		// @0DB: getstatic int[][] game.C_100151_bc.field_102939_V
		// @0DE: iload #9
		// @0E0: aaload
		// @0E1: if_acmpne @0EC
		// @0E4: goto @0E8
		// @0E7: athrow
		// @0E8: goto @11D
		// @0EB: athrow
		// @0EC: getstatic int[][] game.C_100151_bc.field_102939_V
		// @0EF: iload #9
		// @0F1: aaload
		// @0F2: iload #10
		// @0F4: iaload
		// @0F5: istore #11
		// @0F7: iconst_0
		// @0F8: iload #11
		// @0FA: if_icmpeq @10E
		// @0FD: getstatic boolean game.C_100154_sl.field_105330_g
		// @100: ifeq @10B
		// @103: goto @107
		// @106: athrow
		// @107: goto @10E
		// @10A: athrow
		// @10B: iconst_1
		// @10C: istore #5
		// @10E: iload #7
		// @110: iload #11
		// @112: if_icmplt @119
		// @115: goto @11D
		// @118: athrow
		// @119: iload #11
		// @11B: istore #7
		// @11D: aconst_null
		// @11E: getstatic int[][] game.C_100231_oc.field_102194_Zb
		// @121: if_acmpeq @140
		// @124: aconst_null
		// @125: getstatic int[][] game.C_100231_oc.field_102194_Zb
		// @128: iload #9
		// @12A: aaload
		// @12B: if_acmpeq @140
		// @12E: goto @132
		// @131: athrow
		// @132: iload #8
		// @134: getstatic int[][] game.C_100231_oc.field_102194_Zb
		// @137: iload #9
		// @139: aaload
		// @13A: iload #10
		// @13C: iaload
		// @13D: ior
		// @13E: istore #8
		// @140: iinc #9 +1
		// @143: iload #31
		// @145: ifeq @045
		// @148: aload_2
		// @149: iconst_m1
		// @14A: iconst_2
		// @14B: getstatic int game.C_100033_gj.field_101917_jc
		// @14E: iconst_2
		// @14F: iadd
		// @150: imul
		// @151: iload #4
		// @153: getstatic int game.C_100033_gj.field_101917_jc
		// @156: iconst_2
		// @157: iadd
		// @158: iconst_4
		// @159: imul
		// @15A: imul
		// @15B: aload_2
		// @15C: getstatic game.C_100115_ej game.C_100346_ja.field_103486_m
		// @15F: if_acmpne @167
		// @162: iconst_1
		// @163: goto @168
		// @166: athrow
		// @167: iconst_0
		// @168: iconst_2
		// @169: iload_0
		// @16A: invokevirtual game.C_100115_ej.func_102034_a(int, int, int, boolean, int, boolean)boolean
		// @16D: istore #9
		// @16F: aload_2
		// @170: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @173: getfield game.C_100202_qi game.C_100302_ka.field_101891_Ob
		// @176: astore #10
		// @178: aconst_null
		// @179: astore #11
		// @17B: aload #10
		// @17D: bipush 26 (0x1A)
		// @17F: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @182: checkcast game.C_100054_ec
		// @185: astore #12
		// @187: aconst_null
		// @188: aload #12
		// @18A: if_acmpeq @D6C
		// @18D: iconst_0
		// @18E: istore #13
		// @190: iload #31
		// @192: ifne @D7D
		// @195: aload #12
		// @197: getfield game.C_100202_qi game.C_100054_ec.field_101891_Ob
		// @19A: ifnonnull @24D
		// @19D: goto @1A1
		// @1A0: athrow
		// @1A1: aload #12
		// @1A3: new game.C_100302_ka
		// @1A6: dup
		// @1A7: lconst_0
		// @1A8: getstatic game.C_100302_ka game.C_100160_sm.field_105414_e
		// @1AB: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @1AE: putfield game.C_100302_ka game.C_100054_ec.field_101967_nc
		// @1B1: aload #12
		// @1B3: bipush -94 (0xA2)
		// @1B5: aload #12
		// @1B7: getfield game.C_100302_ka game.C_100054_ec.field_101967_nc
		// @1BA: invokevirtual game.C_100054_ec.func_101824_b(int, game.C_100302_ka)void
		// @1BD: aload #12
		// @1BF: new game.C_100302_ka
		// @1C2: dup
		// @1C3: lconst_0
		// @1C4: getstatic game.C_100302_ka game.C_100299_kd.field_107022_C
		// @1C7: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @1CA: putfield game.C_100302_ka game.C_100054_ec.field_101970_lc
		// @1CD: getstatic boolean game.C_100273_mm.field_106682_e
		// @1D0: ifeq @1E7
		// @1D3: goto @1D7
		// @1D6: athrow
		// @1D7: aload #12
		// @1D9: bipush -95 (0xA1)
		// @1DB: aload #12
		// @1DD: getfield game.C_100302_ka game.C_100054_ec.field_101970_lc
		// @1E0: invokevirtual game.C_100054_ec.func_101824_b(int, game.C_100302_ka)void
		// @1E3: goto @1E7
		// @1E6: athrow
		// @1E7: aload #12
		// @1E9: getfield game.C_100302_ka game.C_100054_ec.field_101970_lc
		// @1EC: iconst_2
		// @1ED: putfield int game.C_100302_ka.field_101850_Fb
		// @1F0: aload #12
		// @1F2: new game.C_100302_ka
		// @1F5: dup
		// @1F6: lconst_0
		// @1F7: getstatic game.C_100302_ka game.C_100129_tg.field_102750_sb
		// @1FA: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @1FD: putfield game.C_100302_ka game.C_100054_ec.field_101959_fc
		// @200: aload #12
		// @202: bipush -78 (0xB2)
		// @204: aload #12
		// @206: getfield game.C_100302_ka game.C_100054_ec.field_101959_fc
		// @209: invokevirtual game.C_100054_ec.func_101824_b(int, game.C_100302_ka)void
		// @20C: aload #12
		// @20E: iconst_0
		// @20F: invokevirtual game.C_100054_ec.func_101821_k(int)void
		// @212: aload #12
		// @214: new game.C_100302_ka
		// @217: dup
		// @218: lconst_0
		// @219: getstatic game.C_100302_ka game.C_100338_jc.field_105375_i
		// @21C: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @21F: putfield game.C_100302_ka game.C_100054_ec.field_101965_mc
		// @222: aload #12
		// @224: bipush -103 (0x99)
		// @226: aload #12
		// @228: getfield game.C_100302_ka game.C_100054_ec.field_101965_mc
		// @22B: invokevirtual game.C_100054_ec.func_101824_b(int, game.C_100302_ka)void
		// @22E: aload #12
		// @230: new game.C_100302_ka
		// @233: dup
		// @234: lconst_0
		// @235: getstatic game.C_100302_ka game.C_100309_lk.field_103272_bb
		// @238: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @23B: putfield game.C_100302_ka game.C_100054_ec.field_101968_kc
		// @23E: iconst_1
		// @23F: istore #13
		// @241: aload #12
		// @243: bipush -73 (0xB7)
		// @245: aload #12
		// @247: getfield game.C_100302_ka game.C_100054_ec.field_101968_kc
		// @24A: invokevirtual game.C_100054_ec.func_101824_b(int, game.C_100302_ka)void
		// @24D: aload #12
		// @24F: getfield game.C_100302_ka game.C_100054_ec.field_101967_nc
		// @252: aconst_null
		// @253: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @256: aload #12
		// @258: getfield game.C_100302_ka game.C_100054_ec.field_101967_nc
		// @25B: iconst_0
		// @25C: putfield int game.C_100302_ka.field_101848_lb
		// @25F: aload #12
		// @261: getfield game.C_100302_ka game.C_100054_ec.field_101967_nc
		// @264: astore #14
		// @266: aload #14
		// @268: iconst_0
		// @269: putfield int game.C_100302_ka.field_101886_Kb
		// @26C: aload #12
		// @26E: getfield game.C_100302_ka game.C_100054_ec.field_101970_lc
		// @271: aconst_null
		// @272: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @275: aload #12
		// @277: getfield game.C_100302_ka game.C_100054_ec.field_101970_lc
		// @27A: iconst_0
		// @27B: putfield int game.C_100302_ka.field_101848_lb
		// @27E: aload #12
		// @280: getfield game.C_100302_ka game.C_100054_ec.field_101970_lc
		// @283: astore #15
		// @285: aload #15
		// @287: iconst_0
		// @288: putfield int game.C_100302_ka.field_101886_Kb
		// @28B: aload #12
		// @28D: getfield game.C_100302_ka game.C_100054_ec.field_101965_mc
		// @290: aconst_null
		// @291: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @294: aload #12
		// @296: getfield game.C_100302_ka game.C_100054_ec.field_101965_mc
		// @299: iconst_0
		// @29A: putfield int game.C_100302_ka.field_101848_lb
		// @29D: aload #12
		// @29F: getfield game.C_100302_ka game.C_100054_ec.field_101965_mc
		// @2A2: astore #16
		// @2A4: aload #16
		// @2A6: iconst_0
		// @2A7: putfield int game.C_100302_ka.field_101886_Kb
		// @2AA: aload #12
		// @2AC: getfield game.C_100302_ka game.C_100054_ec.field_101968_kc
		// @2AF: aconst_null
		// @2B0: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @2B3: aload #12
		// @2B5: getfield game.C_100302_ka game.C_100054_ec.field_101968_kc
		// @2B8: iconst_0
		// @2B9: putfield int game.C_100302_ka.field_101848_lb
		// @2BC: aload #12
		// @2BE: getfield game.C_100302_ka game.C_100054_ec.field_101968_kc
		// @2C1: astore #17
		// @2C3: aload #12
		// @2C5: getfield game.C_100302_ka game.C_100054_ec.field_101959_fc
		// @2C8: aconst_null
		// @2C9: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @2CC: aload #17
		// @2CE: iconst_0
		// @2CF: putfield int game.C_100302_ka.field_101886_Kb
		// @2D2: aload #12
		// @2D4: getfield game.C_100302_ka game.C_100054_ec.field_101959_fc
		// @2D7: astore #18
		// @2D9: aload #12
		// @2DB: getfield game.C_100302_ka game.C_100054_ec.field_101959_fc
		// @2DE: iconst_0
		// @2DF: putfield int game.C_100302_ka.field_101848_lb
		// @2E2: aload #18
		// @2E4: iconst_0
		// @2E5: putfield int game.C_100302_ka.field_101886_Kb
		// @2E8: aload #12
		// @2EA: aload_2
		// @2EB: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @2EE: getfield int game.C_100302_ka.field_101886_Kb
		// @2F1: putfield int game.C_100054_ec.field_101886_Kb
		// @2F4: iconst_0
		// @2F5: istore #19
		// @2F7: aload #12
		// @2F9: getfield java.lang.String game.C_100054_ec.field_101957_hc
		// @2FC: astore #20
		// @2FE: bipush 72 (0x48)
		// @300: istore #21
		// @302: getstatic game.C_100115_ej game.C_100179_ch.field_100811_n
		// @305: aload_2
		// @306: if_acmpeq @30D
		// @309: goto @310
		// @30C: athrow
		// @30D: iinc #21 +42
		// @310: aload #12
		// @312: getfield game.C_100302_ka game.C_100054_ec.field_101967_nc
		// @315: getfield game.C_100112_r game.C_100302_ka.field_101845_sb
		// @318: aload #20
		// @31A: iload #21
		// @31C: invokestatic game.C_100112_r.func_101748_a(game.C_100112_r, java.lang.String, int)java.lang.String
		// @31F: astore #20
		// @321: aload #20
		// @323: aload #12
		// @325: getfield java.lang.String game.C_100054_ec.field_101957_hc
		// @328: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @32B: ifne @333
		// @32E: iconst_1
		// @32F: goto @334
		// @332: athrow
		// @333: iconst_0
		// @334: istore #22
		// @336: bipush -5 (0xFB)
		// @338: aload #12
		// @33A: getfield int game.C_100054_ec.field_101953_gc
		// @33D: iconst_m1
		// @33E: ixor
		// @33F: if_icmpge @382
		// @342: aload #12
		// @344: getfield int game.C_100054_ec.field_101953_gc
		// @347: iconst_m1
		// @348: ixor
		// @349: iconst_m1
		// @34A: if_icmplt @355
		// @34D: goto @351
		// @350: athrow
		// @351: goto @3AF
		// @354: athrow
		// @355: new java.lang.StringBuilder
		// @358: dup
		// @359: invokespecial java.lang.StringBuilder.<init>()void
		// @35C: getstatic java.lang.String[] game.C_100031_gl.field_103970_z
		// @35F: iconst_5
		// @360: aaload
		// @361: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @364: iconst_m1
		// @365: aload #12
		// @367: getfield int game.C_100054_ec.field_101953_gc
		// @36A: iadd
		// @36B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @36E: ldc ">"
		// @370: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @373: aload #20
		// @375: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @378: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @37B: astore #20
		// @37D: iload #31
		// @37F: ifeq @3AF
		// @382: new java.lang.StringBuilder
		// @385: dup
		// @386: invokespecial java.lang.StringBuilder.<init>()void
		// @389: getstatic java.lang.String[] game.C_100031_gl.field_103970_z
		// @38C: iconst_5
		// @38D: aaload
		// @38E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @391: aload #12
		// @393: getfield int game.C_100054_ec.field_101953_gc
		// @396: iconst_4
		// @397: getstatic int game.C_100136_th.field_102620_Q
		// @39A: ineg
		// @39B: iadd
		// @39C: isub
		// @39D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3A0: ldc ">"
		// @3A2: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3A5: aload #20
		// @3A7: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3AA: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3AD: astore #20
		// @3AF: aload #12
		// @3B1: getfield game.C_100302_ka game.C_100054_ec.field_101967_nc
		// @3B4: aload #20
		// @3B6: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @3B9: aload #12
		// @3BB: bipush 118 (0x76)
		// @3BD: invokevirtual game.C_100054_ec.func_101951_m(int)boolean
		// @3C0: ifeq @3C7
		// @3C3: goto @6FB
		// @3C6: athrow
		// @3C7: ldc 16764006 (0xffcc66)
		// @3C9: istore #23
		// @3CB: ldc 16777215 (0xffffff)
		// @3CD: istore #24
		// @3CF: iload #5
		// @3D1: ifeq @3E0
		// @3D4: aload #12
		// @3D6: getfield boolean game.C_100054_ec.field_101958_ec
		// @3D9: ifeq @41C
		// @3DC: goto @3E0
		// @3DF: athrow
		// @3E0: aload #12
		// @3E2: getfield int game.C_100054_ec.field_101966_Vb
		// @3E5: iconst_m1
		// @3E6: ixor
		// @3E7: iload #6
		// @3E9: iconst_m1
		// @3EA: ixor
		// @3EB: if_icmpgt @41C
		// @3EE: goto @3F2
		// @3F1: athrow
		// @3F2: aload #12
		// @3F4: getfield int game.C_100054_ec.field_101972_cc
		// @3F7: iconst_m1
		// @3F8: ixor
		// @3F9: iload #7
		// @3FB: iconst_m1
		// @3FC: ixor
		// @3FD: if_icmpgt @41C
		// @400: goto @404
		// @403: athrow
		// @404: iconst_m1
		// @405: iload #8
		// @407: aload #12
		// @409: getfield int game.C_100054_ec.field_101969_ac
		// @40C: iconst_m1
		// @40D: ixor
		// @40E: iand
		// @40F: iconst_m1
		// @410: ixor
		// @411: if_icmpgt @41C
		// @414: goto @418
		// @417: athrow
		// @418: goto @424
		// @41B: athrow
		// @41C: ldc 8421504 (0x808080)
		// @41E: istore #24
		// @420: ldc 8414771 (0x806633)
		// @422: istore #23
		// @424: aload #12
		// @426: getfield game.C_100302_ka game.C_100054_ec.field_101967_nc
		// @429: aload #12
		// @42B: getfield game.C_100302_ka game.C_100054_ec.field_101967_nc
		// @42E: aload #12
		// @430: getfield game.C_100302_ka game.C_100054_ec.field_101967_nc
		// @433: iload #24
		// @435: dup_x1
		// @436: putfield int game.C_100302_ka.field_101872_Nb
		// @439: dup_x1
		// @43A: putfield int game.C_100302_ka.field_101868_Ab
		// @43D: putfield int game.C_100302_ka.field_101860_K
		// @440: aload #12
		// @442: getfield game.C_100302_ka game.C_100054_ec.field_101967_nc
		// @445: aload #12
		// @447: getfield game.C_100302_ka game.C_100054_ec.field_101970_lc
		// @44A: aload #12
		// @44C: getfield game.C_100302_ka game.C_100054_ec.field_101965_mc
		// @44F: iload #23
		// @451: dup_x1
		// @452: putfield int game.C_100302_ka.field_101830_gb
		// @455: dup_x1
		// @456: putfield int game.C_100302_ka.field_101830_gb
		// @459: putfield int game.C_100302_ka.field_101830_gb
		// @45C: aload #12
		// @45E: getfield game.C_100302_ka game.C_100054_ec.field_101970_lc
		// @461: aload #12
		// @463: getfield game.C_100302_ka game.C_100054_ec.field_101970_lc
		// @466: aload #12
		// @468: getfield game.C_100302_ka game.C_100054_ec.field_101970_lc
		// @46B: iload #24
		// @46D: dup_x1
		// @46E: putfield int game.C_100302_ka.field_101872_Nb
		// @471: dup_x1
		// @472: putfield int game.C_100302_ka.field_101868_Ab
		// @475: putfield int game.C_100302_ka.field_101860_K
		// @478: aload #12
		// @47A: getfield game.C_100302_ka game.C_100054_ec.field_101965_mc
		// @47D: aload #12
		// @47F: getfield game.C_100302_ka game.C_100054_ec.field_101965_mc
		// @482: aload #12
		// @484: getfield game.C_100302_ka game.C_100054_ec.field_101965_mc
		// @487: iload #24
		// @489: dup_x1
		// @48A: putfield int game.C_100302_ka.field_101872_Nb
		// @48D: dup_x1
		// @48E: putfield int game.C_100302_ka.field_101868_Ab
		// @491: putfield int game.C_100302_ka.field_101860_K
		// @494: aload_2
		// @495: getstatic game.C_100115_ej game.C_100009_fg.field_103654_g
		// @498: if_acmpeq @52E
		// @49B: aload #12
		// @49D: getfield boolean game.C_100054_ec.field_101971_bc
		// @4A0: ifne @500
		// @4A3: goto @4A7
		// @4A6: athrow
		// @4A7: aload #12
		// @4A9: getfield boolean game.C_100054_ec.field_101961_jc
		// @4AC: ifeq @4EC
		// @4AF: goto @4B3
		// @4B2: athrow
		// @4B3: aload #12
		// @4B5: getfield game.C_100302_ka game.C_100054_ec.field_101967_nc
		// @4B8: sipush -30945 (0x871F)
		// @4BB: iconst_1
		// @4BC: anewarray java.lang.String
		// @4BF: dup
		// @4C0: iconst_0
		// @4C1: aload #20
		// @4C3: aastore
		// @4C4: getstatic java.lang.String game.C_100048_vi.field_104184_i
		// @4C7: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @4CA: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @4CD: aload #12
		// @4CF: getfield game.C_100302_ka game.C_100054_ec.field_101965_mc
		// @4D2: getstatic java.lang.String game.C_100213_ak.field_105996_b
		// @4D5: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @4D8: aload #12
		// @4DA: getfield game.C_100302_ka game.C_100054_ec.field_101968_kc
		// @4DD: getstatic java.lang.String game.C_100275_na.field_103088_m
		// @4E0: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @4E3: iload #31
		// @4E5: ifeq @54A
		// @4E8: goto @4EC
		// @4EB: athrow
		// @4EC: aload #12
		// @4EE: getfield game.C_100302_ka game.C_100054_ec.field_101965_mc
		// @4F1: getstatic java.lang.String game.C_100012_fh.field_100510_N
		// @4F4: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @4F7: iload #31
		// @4F9: ifeq @54A
		// @4FC: goto @500
		// @4FF: athrow
		// @500: aload #12
		// @502: getfield game.C_100302_ka game.C_100054_ec.field_101967_nc
		// @505: sipush -30945 (0x871F)
		// @508: iconst_1
		// @509: anewarray java.lang.String
		// @50C: dup
		// @50D: iconst_0
		// @50E: aload #20
		// @510: aastore
		// @511: getstatic java.lang.String game.C_100141_tc.field_105059_d
		// @514: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @517: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @51A: aload #12
		// @51C: getfield game.C_100302_ka game.C_100054_ec.field_101968_kc
		// @51F: getstatic java.lang.String game.C_100246_pg.field_106400_f
		// @522: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @525: iload #31
		// @527: ifeq @54A
		// @52A: goto @52E
		// @52D: athrow
		// @52E: getstatic game.C_100211_qd game.C_100068_vc.field_104342_d
		// @531: getfield boolean game.C_100211_qd.field_102173_Ic
		// @534: ifeq @53F
		// @537: goto @53B
		// @53A: athrow
		// @53B: goto @54A
		// @53E: athrow
		// @53F: aload #12
		// @541: getfield game.C_100302_ka game.C_100054_ec.field_101968_kc
		// @544: getstatic java.lang.String game.C_100134_tj.field_105009_b
		// @547: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @54A: iconst_0
		// @54B: istore #25
		// @54D: aconst_null
		// @54E: getstatic game.C_100211_qd game.C_100068_vc.field_104342_d
		// @551: if_acmpeq @603
		// @554: bipush 46 (0x2E)
		// @556: invokestatic game.C_100227_af.func_106156_a(byte)boolean
		// @559: ifeq @603
		// @55C: goto @560
		// @55F: athrow
		// @560: getstatic long game.C_100321_hi.field_107215_f
		// @563: ldc2_w -1
		// @566: lxor
		// @567: aload #12
		// @569: getfield long game.C_100054_ec.field_101952_dc
		// @56C: ldc2_w -1
		// @56F: lxor
		// @570: lcmp
		// @571: ifne @57C
		// @574: goto @578
		// @577: athrow
		// @578: goto @603
		// @57B: athrow
		// @57C: aload #12
		// @57E: getfield game.C_100302_ka game.C_100054_ec.field_101965_mc
		// @581: getfield java.lang.String game.C_100302_ka.field_101890_ab
		// @584: ifnonnull @58B
		// @587: goto @5B7
		// @58A: athrow
		// @58B: aload #12
		// @58D: getfield game.C_100302_ka game.C_100054_ec.field_101965_mc
		// @590: ldc 218000 (0x35390)
		// @592: invokevirtual game.C_100302_ka.func_101818_j(int)int
		// @595: iconst_2
		// @596: getstatic int game.C_100244_pe.field_106375_d
		// @599: imul
		// @59A: ineg
		// @59B: isub
		// @59C: istore #26
		// @59E: aload #12
		// @5A0: getfield game.C_100302_ka game.C_100054_ec.field_101965_mc
		// @5A3: iload #25
		// @5A5: getstatic int game.C_100033_gj.field_101917_jc
		// @5A8: iconst_m1
		// @5A9: iload #19
		// @5AB: iload #26
		// @5AD: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @5B0: iload #25
		// @5B2: iload #26
		// @5B4: iadd
		// @5B5: istore #25
		// @5B7: aconst_null
		// @5B8: aload #12
		// @5BA: getfield game.C_100302_ka game.C_100054_ec.field_101968_kc
		// @5BD: getfield java.lang.String game.C_100302_ka.field_101890_ab
		// @5C0: if_acmpne @5C7
		// @5C3: goto @603
		// @5C6: athrow
		// @5C7: aload_2
		// @5C8: getstatic game.C_100115_ej game.C_100009_fg.field_103654_g
		// @5CB: if_acmpne @5D7
		// @5CE: bipush 40 (0x28)
		// @5D0: istore #26
		// @5D2: iload #31
		// @5D4: ifeq @5EA
		// @5D7: aload #12
		// @5D9: getfield game.C_100302_ka game.C_100054_ec.field_101968_kc
		// @5DC: ldc 218000 (0x35390)
		// @5DE: invokevirtual game.C_100302_ka.func_101818_j(int)int
		// @5E1: iconst_2
		// @5E2: getstatic int game.C_100244_pe.field_106375_d
		// @5E5: imul
		// @5E6: ineg
		// @5E7: isub
		// @5E8: istore #26
		// @5EA: aload #12
		// @5EC: getfield game.C_100302_ka game.C_100054_ec.field_101968_kc
		// @5EF: iload #25
		// @5F1: getstatic int game.C_100033_gj.field_101917_jc
		// @5F4: iconst_m1
		// @5F5: iload #19
		// @5F7: iload #26
		// @5F9: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @5FC: iload #25
		// @5FE: iload #26
		// @600: iadd
		// @601: istore #25
		// @603: aload #12
		// @605: getfield game.C_100302_ka game.C_100054_ec.field_101967_nc
		// @608: iload #25
		// @60A: getstatic int game.C_100033_gj.field_101917_jc
		// @60D: iconst_m1
		// @60E: iload #19
		// @610: iload #25
		// @612: ineg
		// @613: getstatic boolean game.C_100273_mm.field_106682_e
		// @616: ifne @61E
		// @619: iconst_0
		// @61A: goto @620
		// @61D: athrow
		// @61E: bipush 42 (0x2A)
		// @620: ineg
		// @621: aload #12
		// @623: getfield int game.C_100054_ec.field_101886_Kb
		// @626: iadd
		// @627: iadd
		// @628: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @62B: aload #12
		// @62D: getfield game.C_100302_ka game.C_100054_ec.field_101970_lc
		// @630: aload #12
		// @632: getfield int game.C_100054_ec.field_101966_Vb
		// @635: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @638: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @63B: aload #12
		// @63D: getfield game.C_100302_ka game.C_100054_ec.field_101970_lc
		// @640: aload #12
		// @642: getfield int game.C_100054_ec.field_101886_Kb
		// @645: bipush -40 (0xD8)
		// @647: iadd
		// @648: getstatic int game.C_100033_gj.field_101917_jc
		// @64B: iconst_m1
		// @64C: iload #19
		// @64E: bipush 40 (0x28)
		// @650: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @653: aload #12
		// @655: getfield game.C_100302_ka game.C_100054_ec.field_101967_nc
		// @658: getfield boolean game.C_100302_ka.field_101839_db
		// @65B: ifeq @667
		// @65E: iload #22
		// @660: ifne @6A5
		// @663: goto @667
		// @666: athrow
		// @667: aload #12
		// @669: getfield game.C_100302_ka game.C_100054_ec.field_101967_nc
		// @66C: getfield boolean game.C_100302_ka.field_101839_db
		// @66F: ifeq @6F3
		// @672: goto @676
		// @675: athrow
		// @676: getstatic java.lang.String[] game.C_100073_f.field_101718_B
		// @679: ifnull @6F3
		// @67C: goto @680
		// @67F: athrow
		// @680: getstatic java.lang.String[] game.C_100073_f.field_101718_B
		// @683: aload #12
		// @685: getfield int game.C_100054_ec.field_101953_gc
		// @688: aaload
		// @689: ifnull @6F3
		// @68C: goto @690
		// @68F: athrow
		// @690: getstatic java.lang.String[] game.C_100073_f.field_101718_B
		// @693: aload #12
		// @695: getfield int game.C_100054_ec.field_101953_gc
		// @698: aaload
		// @699: putstatic java.lang.String game.C_100321_hi.field_107220_c
		// @69C: iload #31
		// @69E: ifeq @6F3
		// @6A1: goto @6A5
		// @6A4: athrow
		// @6A5: aload #12
		// @6A7: getfield java.lang.String game.C_100054_ec.field_101957_hc
		// @6AA: putstatic java.lang.String game.C_100321_hi.field_107220_c
		// @6AD: getstatic java.lang.String[] game.C_100073_f.field_101718_B
		// @6B0: ifnull @6F3
		// @6B3: goto @6B7
		// @6B6: athrow
		// @6B7: getstatic java.lang.String[] game.C_100073_f.field_101718_B
		// @6BA: aload #12
		// @6BC: getfield int game.C_100054_ec.field_101953_gc
		// @6BF: aaload
		// @6C0: ifnull @6F3
		// @6C3: goto @6C7
		// @6C6: athrow
		// @6C7: new java.lang.StringBuilder
		// @6CA: dup
		// @6CB: invokespecial java.lang.StringBuilder.<init>()void
		// @6CE: getstatic java.lang.String game.C_100321_hi.field_107220_c
		// @6D1: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @6D4: getstatic java.lang.String[] game.C_100031_gl.field_103970_z
		// @6D7: bipush 8 (0x08)
		// @6D9: aaload
		// @6DA: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @6DD: getstatic java.lang.String[] game.C_100073_f.field_101718_B
		// @6E0: aload #12
		// @6E2: getfield int game.C_100054_ec.field_101953_gc
		// @6E5: aaload
		// @6E6: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @6E9: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @6EC: putstatic java.lang.String game.C_100321_hi.field_107220_c
		// @6EF: goto @6F3
		// @6F2: athrow
		// @6F3: iload #19
		// @6F5: getstatic int game.C_100033_gj.field_101917_jc
		// @6F8: iadd
		// @6F9: istore #19
		// @6FB: bipush 118 (0x76)
		// @6FD: aload #12
		// @6FF: getfield int game.C_100054_ec.field_101954_Zb
		// @702: aload #20
		// @704: invokestatic game.C_100052_eb.func_104227_a(byte, int, java.lang.String)java.lang.String
		// @707: astore #23
		// @709: aconst_null
		// @70A: aload #23
		// @70C: if_acmpeq @777
		// @70F: aload #12
		// @711: getfield game.C_100302_ka game.C_100054_ec.field_101959_fc
		// @714: getfield game.C_100112_r game.C_100302_ka.field_101845_sb
		// @717: aload #23
		// @719: getstatic int game.C_100244_pe.field_106375_d
		// @71C: ineg
		// @71D: getstatic int game.C_100244_pe.field_106375_d
		// @720: ineg
		// @721: aload #12
		// @723: getfield int game.C_100054_ec.field_101886_Kb
		// @726: iadd
		// @727: iadd
		// @728: invokevirtual game.C_100112_r.func_101724_c(java.lang.String, int)int
		// @72B: istore #24
		// @72D: aload #12
		// @72F: getfield game.C_100302_ka game.C_100054_ec.field_101959_fc
		// @732: aload #23
		// @734: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @737: aload #12
		// @739: getfield game.C_100302_ka game.C_100054_ec.field_101959_fc
		// @73C: aload #12
		// @73E: getfield int game.C_100054_ec.field_101962_ic
		// @741: sipush 256 (0x0100)
		// @744: imul
		// @745: getstatic int game.C_100055_ed.field_104241_d
		// @748: idiv
		// @749: putfield int game.C_100302_ka.field_101871_mb
		// @74C: aload #12
		// @74E: getfield game.C_100302_ka game.C_100054_ec.field_101959_fc
		// @751: getstatic int game.C_100244_pe.field_106375_d
		// @754: iload #24
		// @756: getstatic int game.C_100033_gj.field_101917_jc
		// @759: imul
		// @75A: iconst_m1
		// @75B: iload #19
		// @75D: iconst_2
		// @75E: getstatic int game.C_100244_pe.field_106375_d
		// @761: imul
		// @762: ineg
		// @763: aload #12
		// @765: getfield int game.C_100054_ec.field_101886_Kb
		// @768: iadd
		// @769: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @76C: iload #19
		// @76E: iload #24
		// @770: getstatic int game.C_100033_gj.field_101917_jc
		// @773: imul
		// @774: iadd
		// @775: istore #19
		// @777: iload #9
		// @779: ifne @78E
		// @77C: aload #12
		// @77E: iload #19
		// @780: aload #12
		// @782: getfield int game.C_100054_ec.field_101848_lb
		// @785: ineg
		// @786: iadd
		// @787: putfield int game.C_100054_ec.field_101832_tb
		// @78A: goto @78E
		// @78D: athrow
		// @78E: iload #13
		// @790: ifne @797
		// @793: goto @7A4
		// @796: athrow
		// @797: aload_2
		// @798: getfield game.C_100302_ka game.C_100115_ej.field_102036_Wb
		// @79B: aload #12
		// @79D: iconst_0
		// @79E: aload #11
		// @7A0: iconst_2
		// @7A1: invokevirtual game.C_100302_ka.func_101823_a(game.C_100302_ka, boolean, game.C_100302_ka, int)void
		// @7A4: iconst_m1
		// @7A5: aload #12
		// @7A7: getfield int game.C_100054_ec.field_101854_N
		// @7AA: iconst_m1
		// @7AB: ixor
		// @7AC: if_icmpeq @81C
		// @7AF: aload #12
		// @7B1: bipush 124 (0x7C)
		// @7B3: invokevirtual game.C_100054_ec.func_101951_m(int)boolean
		// @7B6: ifeq @7C1
		// @7B9: goto @7BD
		// @7BC: athrow
		// @7BD: goto @81C
		// @7C0: athrow
		// @7C1: iconst_0
		// @7C2: aload #12
		// @7C4: getfield game.C_100302_ka game.C_100054_ec.field_101965_mc
		// @7C7: getfield int game.C_100302_ka.field_101854_N
		// @7CA: if_icmpne @80C
		// @7CD: aload #12
		// @7CF: getfield game.C_100302_ka game.C_100054_ec.field_101968_kc
		// @7D2: getfield int game.C_100302_ka.field_101854_N
		// @7D5: iconst_m1
		// @7D6: ixor
		// @7D7: iconst_m1
		// @7D8: if_icmpne @7F8
		// @7DB: goto @7DF
		// @7DE: athrow
		// @7DF: aload_2
		// @7E0: getstatic int game.C_100340_je.field_102981_m
		// @7E3: iconst_0
		// @7E4: getstatic int game.C_100125_tm.field_100745_p
		// @7E7: aload #12
		// @7E9: iconst_0
		// @7EA: bipush 40 (0x28)
		// @7EC: invokestatic game.C_100161_sd.func_105420_a(game.C_100115_ej, int, int, int, game.C_100054_ec, int, byte)void
		// @7EF: iload #31
		// @7F1: ifeq @81C
		// @7F4: goto @7F8
		// @7F7: athrow
		// @7F8: bipush 27 (0x1B)
		// @7FA: iload_3
		// @7FB: aload #12
		// @7FD: getfield long game.C_100054_ec.field_101952_dc
		// @800: invokestatic game.C_100133_tk.func_104989_a(byte, int, long)void
		// @803: iload #31
		// @805: ifeq @81C
		// @808: goto @80C
		// @80B: athrow
		// @80C: sipush -1181 (0xFB63)
		// @80F: aload #12
		// @811: getfield long game.C_100054_ec.field_101952_dc
		// @814: iload_3
		// @815: invokestatic game.C_100212_qc.func_105967_a(int, long, int)void
		// @818: goto @81C
		// @81B: athrow
		// @81C: aload #12
		// @81E: astore #11
		// @820: aload #12
		// @822: getfield boolean game.C_100054_ec.field_101836_Hb
		// @825: ifeq @D5B
		// @828: aload #12
		// @82A: bipush 14 (0x0E)
		// @82C: invokevirtual game.C_100054_ec.func_101951_m(int)boolean
		// @82F: ifne @D5B
		// @832: goto @836
		// @835: athrow
		// @836: aconst_null
		// @837: astore #24
		// @839: aload #12
		// @83B: getfield long game.C_100054_ec.field_101952_dc
		// @83E: ldc2_w -1
		// @841: lxor
		// @842: getstatic long game.C_100321_hi.field_107215_f
		// @845: ldc2_w -1
		// @848: lxor
		// @849: lcmp
		// @84A: ifne @94A
		// @84D: iload #5
		// @84F: ifeq @862
		// @852: goto @856
		// @855: athrow
		// @856: aload #12
		// @858: getfield boolean game.C_100054_ec.field_101958_ec
		// @85B: ifeq @942
		// @85E: goto @862
		// @861: athrow
		// @862: aload #12
		// @864: getfield int game.C_100054_ec.field_101972_cc
		// @867: iload #7
		// @869: if_icmplt @90B
		// @86C: goto @870
		// @86F: athrow
		// @870: iload #6
		// @872: aload #12
		// @874: getfield int game.C_100054_ec.field_101966_Vb
		// @877: if_icmpgt @8ED
		// @87A: goto @87E
		// @87D: athrow
		// @87E: iconst_0
		// @87F: aload #12
		// @881: getfield int game.C_100054_ec.field_101969_ac
		// @884: iconst_m1
		// @885: ixor
		// @886: iload #8
		// @888: iand
		// @889: if_icmpne @894
		// @88C: goto @890
		// @88F: athrow
		// @890: goto @A70
		// @893: athrow
		// @894: iconst_0
		// @895: aload #12
		// @897: getfield int game.C_100054_ec.field_101969_ac
		// @89A: iconst_m1
		// @89B: ixor
		// @89C: iload #8
		// @89E: iand
		// @89F: invokestatic game.C_100195_rc.func_105769_a(boolean, int)int
		// @8A2: istore #25
		// @8A4: getstatic java.lang.String game.C_100247_pa.field_106417_a
		// @8A7: astore #24
		// @8A9: iload #25
		// @8AB: ifle @8EA
		// @8AE: aconst_null
		// @8AF: getstatic java.lang.String[][] game.C_100339_jb.field_107384_c
		// @8B2: if_acmpeq @8EA
		// @8B5: goto @8B9
		// @8B8: athrow
		// @8B9: getstatic java.lang.String[][] game.C_100339_jb.field_107384_c
		// @8BC: arraylength
		// @8BD: iconst_m1
		// @8BE: ixor
		// @8BF: iload #25
		// @8C1: iconst_m1
		// @8C2: ixor
		// @8C3: if_icmpgt @8EA
		// @8C6: goto @8CA
		// @8C9: athrow
		// @8CA: aconst_null
		// @8CB: getstatic java.lang.String[][] game.C_100339_jb.field_107384_c
		// @8CE: iload #25
		// @8D0: iconst_m1
		// @8D1: iadd
		// @8D2: aaload
		// @8D3: if_acmpne @8DE
		// @8D6: goto @8DA
		// @8D9: athrow
		// @8DA: goto @8EA
		// @8DD: athrow
		// @8DE: getstatic java.lang.String[][] game.C_100339_jb.field_107384_c
		// @8E1: iload #25
		// @8E3: iconst_m1
		// @8E4: iadd
		// @8E5: aaload
		// @8E6: iconst_1
		// @8E7: aaload
		// @8E8: astore #24
		// @8EA: goto @A70
		// @8ED: sipush -30945 (0x871F)
		// @8F0: iconst_2
		// @8F1: anewarray java.lang.String
		// @8F4: dup
		// @8F5: iconst_0
		// @8F6: aconst_null
		// @8F7: aastore
		// @8F8: dup
		// @8F9: iconst_1
		// @8FA: iload #6
		// @8FC: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @8FF: aastore
		// @900: getstatic java.lang.String game.C_100217_ao.field_106042_j
		// @903: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @906: astore #24
		// @908: goto @A70
		// @90B: aload #12
		// @90D: getfield int game.C_100054_ec.field_101972_cc
		// @910: ineg
		// @911: iload #7
		// @913: iadd
		// @914: istore #25
		// @916: iload #25
		// @918: iconst_m1
		// @919: ixor
		// @91A: bipush -2 (0xFE)
		// @91C: if_icmpne @924
		// @91F: getstatic java.lang.String game.C_100186_rl.field_105727_j
		// @922: astore #24
		// @924: sipush -30945 (0x871F)
		// @927: iconst_2
		// @928: anewarray java.lang.String
		// @92B: dup
		// @92C: iconst_0
		// @92D: aconst_null
		// @92E: aastore
		// @92F: dup
		// @930: iconst_1
		// @931: iload #25
		// @933: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @936: aastore
		// @937: getstatic java.lang.String game.C_100030_gm.field_103345_L
		// @93A: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @93D: astore #24
		// @93F: goto @A70
		// @942: getstatic java.lang.String game.C_100238_ol.field_101694_Q
		// @945: astore #24
		// @947: goto @A70
		// @94A: iload #5
		// @94C: ifeq @95B
		// @94F: aload #12
		// @951: getfield boolean game.C_100054_ec.field_101958_ec
		// @954: ifeq @A5C
		// @957: goto @95B
		// @95A: athrow
		// @95B: aload #12
		// @95D: getfield int game.C_100054_ec.field_101972_cc
		// @960: iload #7
		// @962: if_icmpge @9B0
		// @965: goto @969
		// @968: athrow
		// @969: iload #7
		// @96B: aload #12
		// @96D: getfield int game.C_100054_ec.field_101972_cc
		// @970: isub
		// @971: istore #25
		// @973: iload #25
		// @975: iconst_1
		// @976: if_icmpeq @97D
		// @979: goto @991
		// @97C: athrow
		// @97D: sipush -30945 (0x871F)
		// @980: iconst_1
		// @981: anewarray java.lang.String
		// @984: dup
		// @985: iconst_0
		// @986: aload #20
		// @988: aastore
		// @989: getstatic java.lang.String game.C_100129_tg.field_102748_Ab
		// @98C: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @98F: astore #24
		// @991: sipush -30945 (0x871F)
		// @994: iconst_2
		// @995: anewarray java.lang.String
		// @998: dup
		// @999: iconst_0
		// @99A: aload #20
		// @99C: aastore
		// @99D: dup
		// @99E: iconst_1
		// @99F: iload #25
		// @9A1: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @9A4: aastore
		// @9A5: getstatic java.lang.String game.C_100051_ea.field_103308_P
		// @9A8: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @9AB: astore #24
		// @9AD: goto @A70
		// @9B0: iload #6
		// @9B2: aload #12
		// @9B4: getfield int game.C_100054_ec.field_101966_Vb
		// @9B7: if_icmple @9D9
		// @9BA: sipush -30945 (0x871F)
		// @9BD: iconst_2
		// @9BE: anewarray java.lang.String
		// @9C1: dup
		// @9C2: iconst_0
		// @9C3: aload #20
		// @9C5: aastore
		// @9C6: dup
		// @9C7: iconst_1
		// @9C8: iload #6
		// @9CA: invokestatic java.lang.Integer.toString(int)java.lang.String
		// @9CD: aastore
		// @9CE: getstatic java.lang.String game.C_100341_jd.field_102645_jb
		// @9D1: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @9D4: astore #24
		// @9D6: goto @A70
		// @9D9: iconst_m1
		// @9DA: aload #12
		// @9DC: getfield int game.C_100054_ec.field_101969_ac
		// @9DF: iconst_m1
		// @9E0: ixor
		// @9E1: iload #8
		// @9E3: iand
		// @9E4: iconst_m1
		// @9E5: ixor
		// @9E6: if_icmpeq @A70
		// @9E9: iconst_0
		// @9EA: iload #8
		// @9EC: aload #12
		// @9EE: getfield int game.C_100054_ec.field_101969_ac
		// @9F1: iconst_m1
		// @9F2: ixor
		// @9F3: iand
		// @9F4: invokestatic game.C_100195_rc.func_105769_a(boolean, int)int
		// @9F7: istore #25
		// @9F9: sipush -30945 (0x871F)
		// @9FC: iconst_1
		// @9FD: anewarray java.lang.String
		// @A00: dup
		// @A01: iconst_0
		// @A02: aload #20
		// @A04: aastore
		// @A05: getstatic java.lang.String game.C_100051_ea.field_103310_R
		// @A08: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @A0B: astore #24
		// @A0D: iload #25
		// @A0F: ifle @A59
		// @A12: aconst_null
		// @A13: getstatic java.lang.String[][] game.C_100339_jb.field_107384_c
		// @A16: if_acmpeq @A59
		// @A19: goto @A1D
		// @A1C: athrow
		// @A1D: getstatic java.lang.String[][] game.C_100339_jb.field_107384_c
		// @A20: arraylength
		// @A21: iload #25
		// @A23: if_icmplt @A59
		// @A26: goto @A2A
		// @A29: athrow
		// @A2A: aconst_null
		// @A2B: getstatic java.lang.String[][] game.C_100339_jb.field_107384_c
		// @A2E: iconst_m1
		// @A2F: iload #25
		// @A31: iadd
		// @A32: aaload
		// @A33: if_acmpne @A3E
		// @A36: goto @A3A
		// @A39: athrow
		// @A3A: goto @A59
		// @A3D: athrow
		// @A3E: sipush -30945 (0x871F)
		// @A41: iconst_1
		// @A42: anewarray java.lang.String
		// @A45: dup
		// @A46: iconst_0
		// @A47: aload #20
		// @A49: aastore
		// @A4A: getstatic java.lang.String[][] game.C_100339_jb.field_107384_c
		// @A4D: iload #25
		// @A4F: iconst_m1
		// @A50: iadd
		// @A51: aaload
		// @A52: iconst_2
		// @A53: aaload
		// @A54: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @A57: astore #24
		// @A59: goto @A70
		// @A5C: sipush -30945 (0x871F)
		// @A5F: iconst_1
		// @A60: anewarray java.lang.String
		// @A63: dup
		// @A64: iconst_0
		// @A65: aload #20
		// @A67: aastore
		// @A68: getstatic java.lang.String game.C_100116_ei.field_104123_c
		// @A6B: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @A6E: astore #24
		// @A70: aload #24
		// @A72: ifnull @D5B
		// @A75: new java.lang.StringBuilder
		// @A78: dup
		// @A79: invokespecial java.lang.StringBuilder.<init>()void
		// @A7C: getstatic java.lang.String[] game.C_100031_gl.field_103970_z
		// @A7F: bipush 10 (0x0A)
		// @A81: aaload
		// @A82: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @A85: aload #24
		// @A87: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @A8A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @A8D: astore #24
		// @A8F: aconst_null
		// @A90: astore #25
		// @A92: iconst_0
		// @A93: istore #26
		// @A95: iconst_0
		// @A96: istore #27
		// @A98: getstatic int game.C_100137_bn.field_105038_l
		// @A9B: iload #27
		// @A9D: if_icmple @C30
		// @AA0: sipush 255 (0x00FF)
		// @AA3: getstatic game.C_100211_qd game.C_100068_vc.field_104342_d
		// @AA6: getfield byte[] game.C_100211_qd.field_102165_jc
		// @AA9: iload #27
		// @AAB: baload
		// @AAC: iand
		// @AAD: istore #28
		// @AAF: iconst_0
		// @AB0: istore #29
		// @AB2: aconst_null
		// @AB3: iload #31
		// @AB5: ifne @188
		// @AB8: getstatic boolean[][] game.C_100245_pf.field_106386_d
		// @ABB: if_acmpeq @AEB
		// @ABE: aconst_null
		// @ABF: getstatic boolean[][] game.C_100245_pf.field_106386_d
		// @AC2: iload #27
		// @AC4: aaload
		// @AC5: if_acmpne @AD0
		// @AC8: goto @ACC
		// @ACB: athrow
		// @ACC: goto @AEB
		// @ACF: athrow
		// @AD0: getstatic boolean[][] game.C_100245_pf.field_106386_d
		// @AD3: iload #27
		// @AD5: aaload
		// @AD6: iload #28
		// @AD8: baload
		// @AD9: ifeq @AEB
		// @ADC: aload #12
		// @ADE: getfield boolean game.C_100054_ec.field_101958_ec
		// @AE1: ifne @AEB
		// @AE4: goto @AE8
		// @AE7: athrow
		// @AE8: iconst_1
		// @AE9: istore #29
		// @AEB: aconst_null
		// @AEC: getstatic int[][] game.C_100332_ii.field_107319_k
		// @AEF: if_acmpeq @B3B
		// @AF2: aconst_null
		// @AF3: getstatic int[][] game.C_100332_ii.field_107319_k
		// @AF6: iload #27
		// @AF8: aaload
		// @AF9: if_acmpeq @B3B
		// @AFC: goto @B00
		// @AFF: athrow
		// @B00: getstatic int[][] game.C_100332_ii.field_107319_k
		// @B03: iload #27
		// @B05: aaload
		// @B06: iload #28
		// @B08: iaload
		// @B09: istore #30
		// @B0B: iconst_0
		// @B0C: iload #30
		// @B0E: if_icmpeq @B2A
		// @B11: getstatic boolean game.C_100154_sl.field_105330_g
		// @B14: ifne @B2A
		// @B17: goto @B1B
		// @B1A: athrow
		// @B1B: aload #12
		// @B1D: getfield boolean game.C_100054_ec.field_101958_ec
		// @B20: ifne @B2A
		// @B23: goto @B27
		// @B26: athrow
		// @B27: iconst_1
		// @B28: istore #29
		// @B2A: aload #12
		// @B2C: getfield int game.C_100054_ec.field_101966_Vb
		// @B2F: iload #30
		// @B31: if_icmplt @B38
		// @B34: goto @B3B
		// @B37: athrow
		// @B38: iconst_1
		// @B39: istore #29
		// @B3B: getstatic int[][] game.C_100151_bc.field_102939_V
		// @B3E: ifnull @B90
		// @B41: aconst_null
		// @B42: getstatic int[][] game.C_100151_bc.field_102939_V
		// @B45: iload #27
		// @B47: aaload
		// @B48: if_acmpne @B53
		// @B4B: goto @B4F
		// @B4E: athrow
		// @B4F: goto @B90
		// @B52: athrow
		// @B53: getstatic int[][] game.C_100151_bc.field_102939_V
		// @B56: iload #27
		// @B58: aaload
		// @B59: iload #28
		// @B5B: iaload
		// @B5C: istore #30
		// @B5E: iconst_m1
		// @B5F: iload #30
		// @B61: iconst_m1
		// @B62: ixor
		// @B63: if_icmpeq @B83
		// @B66: getstatic boolean game.C_100154_sl.field_105330_g
		// @B69: ifne @B83
		// @B6C: goto @B70
		// @B6F: athrow
		// @B70: aload #12
		// @B72: getfield boolean game.C_100054_ec.field_101958_ec
		// @B75: ifeq @B80
		// @B78: goto @B7C
		// @B7B: athrow
		// @B7C: goto @B83
		// @B7F: athrow
		// @B80: iconst_1
		// @B81: istore #29
		// @B83: iload #30
		// @B85: aload #12
		// @B87: getfield int game.C_100054_ec.field_101972_cc
		// @B8A: if_icmple @B90
		// @B8D: iconst_1
		// @B8E: istore #29
		// @B90: aconst_null
		// @B91: getstatic int[][] game.C_100231_oc.field_102194_Zb
		// @B94: if_acmpeq @BC7
		// @B97: aconst_null
		// @B98: getstatic int[][] game.C_100231_oc.field_102194_Zb
		// @B9B: iload #27
		// @B9D: aaload
		// @B9E: if_acmpeq @BC7
		// @BA1: goto @BA5
		// @BA4: athrow
		// @BA5: aload #12
		// @BA7: getfield int game.C_100054_ec.field_101969_ac
		// @BAA: iconst_m1
		// @BAB: ixor
		// @BAC: getstatic int[][] game.C_100231_oc.field_102194_Zb
		// @BAF: iload #27
		// @BB1: aaload
		// @BB2: iload #28
		// @BB4: iaload
		// @BB5: iand
		// @BB6: iconst_m1
		// @BB7: ixor
		// @BB8: iconst_m1
		// @BB9: if_icmpne @BC4
		// @BBC: goto @BC0
		// @BBF: athrow
		// @BC0: goto @BC7
		// @BC3: athrow
		// @BC4: iconst_1
		// @BC5: istore #29
		// @BC7: iload #29
		// @BC9: ifne @BD0
		// @BCC: goto @C28
		// @BCF: athrow
		// @BD0: new java.lang.StringBuilder
		// @BD3: dup
		// @BD4: invokespecial java.lang.StringBuilder.<init>()void
		// @BD7: getstatic java.lang.String[] game.C_100031_gl.field_103970_z
		// @BDA: bipush 10 (0x0A)
		// @BDC: aaload
		// @BDD: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @BE0: getstatic java.lang.String[] game.C_100036_gg.field_103155_R
		// @BE3: iload #27
		// @BE5: aaload
		// @BE6: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @BE9: getstatic java.lang.String[] game.C_100031_gl.field_103970_z
		// @BEC: bipush 11 (0x0B)
		// @BEE: aaload
		// @BEF: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @BF2: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @BF5: astore #30
		// @BF7: aconst_null
		// @BF8: aload #25
		// @BFA: if_acmpne @C06
		// @BFD: aload #30
		// @BFF: astore #25
		// @C01: iload #31
		// @C03: ifeq @C28
		// @C06: iconst_1
		// @C07: istore #26
		// @C09: new java.lang.StringBuilder
		// @C0C: dup
		// @C0D: invokespecial java.lang.StringBuilder.<init>()void
		// @C10: aload #25
		// @C12: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @C15: getstatic java.lang.String[] game.C_100031_gl.field_103970_z
		// @C18: bipush 6 (0x06)
		// @C1A: aaload
		// @C1B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @C1E: aload #30
		// @C20: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @C23: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @C26: astore #25
		// @C28: iinc #27 +1
		// @C2B: iload #31
		// @C2D: ifeq @A98
		// @C30: getstatic game.C_100115_ej game.C_100009_fg.field_103654_g
		// @C33: aload_2
		// @C34: if_acmpne @CAA
		// @C37: bipush 91 (0x5B)
		// @C39: invokestatic game.C_100227_af.func_106156_a(byte)boolean
		// @C3C: ifeq @CAA
		// @C3F: goto @C43
		// @C42: athrow
		// @C43: iload #26
		// @C45: ifne @C80
		// @C48: goto @C4C
		// @C4B: athrow
		// @C4C: new java.lang.StringBuilder
		// @C4F: dup
		// @C50: invokespecial java.lang.StringBuilder.<init>()void
		// @C53: aload #24
		// @C55: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @C58: getstatic java.lang.String[] game.C_100031_gl.field_103970_z
		// @C5B: bipush 9 (0x09)
		// @C5D: aaload
		// @C5E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @C61: sipush -30945 (0x871F)
		// @C64: iconst_1
		// @C65: anewarray java.lang.String
		// @C68: dup
		// @C69: iconst_0
		// @C6A: aload #25
		// @C6C: aastore
		// @C6D: getstatic java.lang.String game.C_100181_cf.field_105707_a
		// @C70: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @C73: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @C76: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @C79: astore #24
		// @C7B: iload #31
		// @C7D: ifeq @D0C
		// @C80: new java.lang.StringBuilder
		// @C83: dup
		// @C84: invokespecial java.lang.StringBuilder.<init>()void
		// @C87: aload #24
		// @C89: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @C8C: getstatic java.lang.String[] game.C_100031_gl.field_103970_z
		// @C8F: bipush 9 (0x09)
		// @C91: aaload
		// @C92: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @C95: getstatic java.lang.String game.C_100176_ci.field_105622_d
		// @C98: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @C9B: aload #25
		// @C9D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @CA0: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @CA3: astore #24
		// @CA5: iload #31
		// @CA7: ifeq @D0C
		// @CAA: iload #26
		// @CAC: ifne @CE7
		// @CAF: goto @CB3
		// @CB2: athrow
		// @CB3: new java.lang.StringBuilder
		// @CB6: dup
		// @CB7: invokespecial java.lang.StringBuilder.<init>()void
		// @CBA: aload #24
		// @CBC: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @CBF: getstatic java.lang.String[] game.C_100031_gl.field_103970_z
		// @CC2: bipush 9 (0x09)
		// @CC4: aaload
		// @CC5: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @CC8: sipush -30945 (0x871F)
		// @CCB: iconst_1
		// @CCC: anewarray java.lang.String
		// @CCF: dup
		// @CD0: iconst_0
		// @CD1: aload #25
		// @CD3: aastore
		// @CD4: getstatic java.lang.String game.C_100191_rg.field_100844_n
		// @CD7: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @CDA: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @CDD: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @CE0: astore #24
		// @CE2: iload #31
		// @CE4: ifeq @D0C
		// @CE7: new java.lang.StringBuilder
		// @CEA: dup
		// @CEB: invokespecial java.lang.StringBuilder.<init>()void
		// @CEE: aload #24
		// @CF0: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @CF3: getstatic java.lang.String[] game.C_100031_gl.field_103970_z
		// @CF6: bipush 9 (0x09)
		// @CF8: aaload
		// @CF9: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @CFC: getstatic java.lang.String game.C_100067_vd.field_104317_n
		// @CFF: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @D02: aload #25
		// @D04: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @D07: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @D0A: astore #24
		// @D0C: getstatic game.C_100115_ej game.C_100009_fg.field_103654_g
		// @D0F: aload_2
		// @D10: if_acmpne @D56
		// @D13: bipush 49 (0x31)
		// @D15: invokestatic game.C_100227_af.func_106156_a(byte)boolean
		// @D18: ifne @D56
		// @D1B: goto @D1F
		// @D1E: athrow
		// @D1F: getstatic game.C_100211_qd game.C_100068_vc.field_104342_d
		// @D22: getfield java.lang.String game.C_100211_qd.field_102155_dc
		// @D25: astore #27
		// @D27: new java.lang.StringBuilder
		// @D2A: dup
		// @D2B: invokespecial java.lang.StringBuilder.<init>()void
		// @D2E: aload #24
		// @D30: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @D33: getstatic java.lang.String[] game.C_100031_gl.field_103970_z
		// @D36: bipush 9 (0x09)
		// @D38: aaload
		// @D39: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @D3C: sipush -30945 (0x871F)
		// @D3F: iconst_1
		// @D40: anewarray java.lang.String
		// @D43: dup
		// @D44: iconst_0
		// @D45: aload #27
		// @D47: aastore
		// @D48: getstatic java.lang.String game.C_100157_db.field_103559_b
		// @D4B: invokestatic game.C_100132_td.func_104965_a(int, java.lang.String[], java.lang.String)java.lang.String
		// @D4E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @D51: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @D54: astore #24
		// @D56: aload #24
		// @D58: putstatic java.lang.String game.C_100321_hi.field_107220_c
		// @D5B: aload #10
		// @D5D: bipush 59 (0x3B)
		// @D5F: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @D62: checkcast game.C_100054_ec
		// @D65: astore #12
		// @D67: iload #31
		// @D69: ifeq @187
		// @D6C: iload_1
		// @D6D: bipush 57 (0x39)
		// @D6F: if_icmpge @D7D
		// @D72: aconst_null
		// @D73: checkcast game.C_100186_rl
		// @D76: putstatic game.C_100186_rl game.C_100031_gl.field_103972_i
		// @D79: goto @D7D
		// @D7C: athrow
		// @D7D: goto @DDA
		// @D80: astore #5
		// @D82: aload #5
		// @D84: new java.lang.StringBuilder
		// @D87: dup
		// @D88: invokespecial java.lang.StringBuilder.<init>()void
		// @D8B: getstatic java.lang.String[] game.C_100031_gl.field_103970_z
		// @D8E: bipush 7 (0x07)
		// @D90: aaload
		// @D91: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @D94: iload_0
		// @D95: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @D98: bipush 44 (0x2C)
		// @D9A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D9D: iload_1
		// @D9E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @DA1: bipush 44 (0x2C)
		// @DA3: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @DA6: aload_2
		// @DA7: ifnull @DB3
		// @DAA: getstatic java.lang.String[] game.C_100031_gl.field_103970_z
		// @DAD: iconst_1
		// @DAE: aaload
		// @DAF: goto @DB8
		// @DB2: athrow
		// @DB3: getstatic java.lang.String[] game.C_100031_gl.field_103970_z
		// @DB6: iconst_0
		// @DB7: aaload
		// @DB8: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @DBB: bipush 44 (0x2C)
		// @DBD: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @DC0: iload_3
		// @DC1: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @DC4: bipush 44 (0x2C)
		// @DC6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @DC9: iload #4
		// @DCB: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @DCE: bipush 41 (0x29)
		// @DD0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @DD3: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @DD6: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @DD9: athrow
		// @DDA: return
	}
	
	public static void func_103954_a(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic game.C_100186_rl game.C_100031_gl.field_103972_i
		// @04: aconst_null
		// @05: putstatic java.lang.String game.C_100031_gl.field_103971_h
		// @08: aconst_null
		// @09: putstatic game.C_100302_ka game.C_100031_gl.field_103967_c
		// @0C: iload_0
		// @0D: iconst_1
		// @0E: if_icmpeq @1A
		// @11: bipush -50 (0xCE)
		// @13: invokestatic game.C_100031_gl.func_103958_a(byte)void
		// @16: goto @1A
		// @19: athrow
		// @1A: aconst_null
		// @1B: putstatic game.C_100302_ka game.C_100031_gl.field_103963_g
		// @1E: aconst_null
		// @1F: putstatic java.lang.String game.C_100031_gl.field_103964_d
		// @22: goto @46
		// @25: astore_1
		// @26: aload_1
		// @27: new java.lang.StringBuilder
		// @2A: dup
		// @2B: invokespecial java.lang.StringBuilder.<init>()void
		// @2E: getstatic java.lang.String[] game.C_100031_gl.field_103970_z
		// @31: iconst_3
		// @32: aaload
		// @33: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @36: iload_0
		// @37: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3A: bipush 41 (0x29)
		// @3C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @42: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @45: athrow
		// @46: return
	}
	
	static final void func_103957_a(C_100037_wb[] arg0, int arg1, int arg2, int arg3, int arg4)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #10
		// @005: aload_0
		// @006: ifnull @010
		// @009: iload_1
		// @00A: iconst_m1
		// @00B: ixor
		// @00C: iconst_m1
		// @00D: if_icmplt @011
		// @010: return
		// @011: aload_0
		// @012: iconst_0
		// @013: aaload
		// @014: getfield int game.C_100037_wb.field_102341_y
		// @017: istore #5
		// @019: aload_0
		// @01A: iconst_2
		// @01B: aaload
		// @01C: getfield int game.C_100037_wb.field_102341_y
		// @01F: istore #6
		// @021: aload_0
		// @022: iconst_1
		// @023: aaload
		// @024: getfield int game.C_100037_wb.field_102341_y
		// @027: istore #7
		// @029: aload_0
		// @02A: iconst_0
		// @02B: aaload
		// @02C: iload #4
		// @02E: iload_3
		// @02F: invokevirtual game.C_100037_wb.func_102353_h(int, int)void
		// @032: aload_0
		// @033: iconst_2
		// @034: aaload
		// @035: iload #6
		// @037: ineg
		// @038: iload_1
		// @039: iadd
		// @03A: iload #4
		// @03C: iadd
		// @03D: iload_3
		// @03E: invokevirtual game.C_100037_wb.func_102353_h(int, int)void
		// @041: getstatic int[] game.C_100069_vb.field_104360_a
		// @044: invokestatic game.C_100196_rb.func_105801_a(int[])void
		// @047: iload #4
		// @049: iload #5
		// @04B: iadd
		// @04C: iload_3
		// @04D: iload #6
		// @04F: ineg
		// @050: iload #4
		// @052: iadd
		// @053: iload_1
		// @054: iadd
		// @055: aload_0
		// @056: iconst_1
		// @057: aaload
		// @058: getfield int game.C_100037_wb.field_102340_z
		// @05B: iload_3
		// @05C: iadd
		// @05D: invokestatic game.C_100196_rb.func_105779_e(int, int, int, int)void
		// @060: iload_2
		// @061: bipush -85 (0xAB)
		// @063: if_icmplt @078
		// @066: iconst_1
		// @067: bipush -35 (0xDD)
		// @069: aconst_null
		// @06A: checkcast game.C_100115_ej
		// @06D: bipush -31 (0xE1)
		// @06F: bipush 81 (0x51)
		// @071: invokestatic game.C_100031_gl.func_103961_a(boolean, int, game.C_100115_ej, int, int)void
		// @074: goto @078
		// @077: athrow
		// @078: iload #4
		// @07A: iload #5
		// @07C: ineg
		// @07D: isub
		// @07E: istore #8
		// @080: iload_1
		// @081: iload #4
		// @083: iadd
		// @084: iload #6
		// @086: ineg
		// @087: iadd
		// @088: istore #9
		// @08A: iload #8
		// @08C: istore #4
		// @08E: iload #9
		// @090: iload #4
		// @092: if_icmple @0B3
		// @095: aload_0
		// @096: iconst_1
		// @097: aaload
		// @098: iload #4
		// @09A: iload_3
		// @09B: invokevirtual game.C_100037_wb.func_102353_h(int, int)void
		// @09E: iload #4
		// @0A0: iload #7
		// @0A2: iadd
		// @0A3: istore #4
		// @0A5: iload #10
		// @0A7: ifne @0B9
		// @0AA: iload #10
		// @0AC: ifeq @08E
		// @0AF: goto @0B3
		// @0B2: athrow
		// @0B3: getstatic int[] game.C_100069_vb.field_104360_a
		// @0B6: invokestatic game.C_100196_rb.func_105777_b(int[])void
		// @0B9: goto @115
		// @0BC: astore #5
		// @0BE: aload #5
		// @0C0: new java.lang.StringBuilder
		// @0C3: dup
		// @0C4: invokespecial java.lang.StringBuilder.<init>()void
		// @0C7: getstatic java.lang.String[] game.C_100031_gl.field_103970_z
		// @0CA: iconst_2
		// @0CB: aaload
		// @0CC: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0CF: aload_0
		// @0D0: ifnull @0DC
		// @0D3: getstatic java.lang.String[] game.C_100031_gl.field_103970_z
		// @0D6: iconst_1
		// @0D7: aaload
		// @0D8: goto @0E1
		// @0DB: athrow
		// @0DC: getstatic java.lang.String[] game.C_100031_gl.field_103970_z
		// @0DF: iconst_0
		// @0E0: aaload
		// @0E1: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0E4: bipush 44 (0x2C)
		// @0E6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0E9: iload_1
		// @0EA: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0ED: bipush 44 (0x2C)
		// @0EF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0F2: iload_2
		// @0F3: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0F6: bipush 44 (0x2C)
		// @0F8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0FB: iload_3
		// @0FC: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0FF: bipush 44 (0x2C)
		// @101: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @104: iload #4
		// @106: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @109: bipush 41 (0x29)
		// @10B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @10E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @111: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @114: athrow
		// @115: return
	}
	
	static final void func_103956_a(int arg0, String arg1, String arg2)
	{
		// @00: iload_0
		// @01: iconst_2
		// @02: if_icmpeq @0E
		// @05: bipush 26 (0x1A)
		// @07: putstatic int game.C_100031_gl.field_103962_f
		// @0A: goto @0E
		// @0D: athrow
		// @0E: aload_2
		// @0F: iconst_0
		// @10: aload_1
		// @11: iconst_0
		// @12: invokestatic game.C_100318_hj.func_107193_a(java.lang.String, boolean, java.lang.String, boolean)void
		// @15: goto @6D
		// @18: astore_3
		// @19: aload_3
		// @1A: new java.lang.StringBuilder
		// @1D: dup
		// @1E: invokespecial java.lang.StringBuilder.<init>()void
		// @21: getstatic java.lang.String[] game.C_100031_gl.field_103970_z
		// @24: iconst_4
		// @25: aaload
		// @26: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @29: iload_0
		// @2A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2D: bipush 44 (0x2C)
		// @2F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @32: aload_1
		// @33: ifnull @3F
		// @36: getstatic java.lang.String[] game.C_100031_gl.field_103970_z
		// @39: iconst_1
		// @3A: aaload
		// @3B: goto @44
		// @3E: athrow
		// @3F: getstatic java.lang.String[] game.C_100031_gl.field_103970_z
		// @42: iconst_0
		// @43: aaload
		// @44: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @47: bipush 44 (0x2C)
		// @49: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4C: aload_2
		// @4D: ifnull @59
		// @50: getstatic java.lang.String[] game.C_100031_gl.field_103970_z
		// @53: iconst_1
		// @54: aaload
		// @55: goto @5E
		// @58: athrow
		// @59: getstatic java.lang.String[] game.C_100031_gl.field_103970_z
		// @5C: iconst_0
		// @5D: aaload
		// @5E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @61: bipush 41 (0x29)
		// @63: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @66: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @69: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @6C: athrow
		// @6D: return
	}
	
	static
	{
		// @000: bipush 19 (0x13)
		// @002: anewarray java.lang.String
		// @005: dup
		// @006: iconst_0
		// @007: ldc "s*//"
		// @009: invokestatic game.C_100031_gl.func_103959_z(java.lang.String)char[]
		// @00C: invokestatic game.C_100031_gl.func_103955_z(char[])java.lang.String
		// @00F: aastore
		// @010: dup
		// @011: iconst_1
		// @012: ldc "fqmm "
		// @014: invokestatic game.C_100031_gl.func_103959_z(java.lang.String)char[]
		// @017: invokestatic game.C_100031_gl.func_103955_z(char[])java.lang.String
		// @01A: aastore
		// @01B: dup
		// @01C: iconst_2
		// @01D: ldc "z3m\u0005u"
		// @01F: invokestatic game.C_100031_gl.func_103959_z(java.lang.String)char[]
		// @022: invokestatic game.C_100031_gl.func_103955_z(char[])java.lang.String
		// @025: aastore
		// @026: dup
		// @027: iconst_3
		// @028: ldc "z3m\u0007u"
		// @02A: invokestatic game.C_100031_gl.func_103959_z(java.lang.String)char[]
		// @02D: invokestatic game.C_100031_gl.func_103955_z(char[])java.lang.String
		// @030: aastore
		// @031: dup
		// @032: iconst_4
		// @033: ldc "z3m\u0006u"
		// @035: invokestatic game.C_100031_gl.func_103959_z(java.lang.String)char[]
		// @038: invokestatic game.C_100031_gl.func_103955_z(char[])java.lang.String
		// @03B: aastore
		// @03C: dup
		// @03D: iconst_5
		// @03E: ldc "!6.$`"
		// @040: invokestatic game.C_100031_gl.func_103959_z(java.lang.String)char[]
		// @043: invokestatic game.C_100031_gl.func_103955_z(char[])java.lang.String
		// @046: aastore
		// @047: dup
		// @048: bipush 6 (0x06)
		// @04A: ldc "1\u007f"
		// @04C: invokestatic game.C_100031_gl.func_103959_z(java.lang.String)char[]
		// @04F: invokestatic game.C_100031_gl.func_103955_z(char[])java.lang.String
		// @052: aastore
		// @053: dup
		// @054: bipush 7 (0x07)
		// @056: ldc "z3m\u0000u"
		// @058: invokestatic game.C_100031_gl.func_103959_z(java.lang.String)char[]
		// @05B: invokestatic game.C_100031_gl.func_103955_z(char[])java.lang.String
		// @05E: aastore
		// @05F: dup
		// @060: bipush 8 (0x08)
		// @062: ldc "=rc"
		// @064: invokestatic game.C_100031_gl.func_103959_z(java.lang.String)char[]
		// @067: invokestatic game.C_100031_gl.func_103955_z(char[])java.lang.String
		// @06A: aastore
		// @06B: dup
		// @06C: bipush 9 (0x09)
		// @06E: ldc "!=1}"
		// @070: invokestatic game.C_100031_gl.func_103959_z(java.lang.String)char[]
		// @073: invokestatic game.C_100031_gl.func_103955_z(char[])java.lang.String
		// @076: aastore
		// @077: dup
		// @078: bipush 10 (0x0A)
		// @07A: ldc "!<,/`\\ossm-a"
		// @07C: invokestatic game.C_100031_gl.func_103959_z(java.lang.String)char[]
		// @07F: invokestatic game.C_100031_gl.func_103955_z(char[])java.lang.String
		// @082: aastore
		// @083: dup
		// @084: bipush 11 (0x0B)
		// @086: ldc "!p ,1#"
		// @088: invokestatic game.C_100031_gl.func_103959_z(java.lang.String)char[]
		// @08B: invokestatic game.C_100031_gl.func_103955_z(char[])java.lang.String
		// @08E: aastore
		// @08F: dup
		// @090: bipush 12 (0x0C)
		// @092: ldc "8o\""
		// @094: invokestatic game.C_100031_gl.func_103959_z(java.lang.String)char[]
		// @097: invokestatic game.C_100031_gl.func_103955_z(char[])java.lang.String
		// @09A: aastore
		// @09B: dup
		// @09C: bipush 13 (0x0D)
		// @09E: ldc "X-1,/'\u007f"
		// @0A0: invokestatic game.C_100031_gl.func_103959_z(java.lang.String)char[]
		// @0A3: invokestatic game.C_100031_gl.func_103955_z(char[])java.lang.String
		// @0A6: aastore
		// @0A7: dup
		// @0A8: bipush 14 (0x0E)
		// @0AA: ldc "w>5\"s|(7m4p>$&s_*%%8o:'\n0|8&"
		// @0AC: invokestatic game.C_100031_gl.func_103959_z(java.lang.String)char[]
		// @0AF: invokestatic game.C_100031_gl.func_103955_z(char[])java.lang.String
		// @0B2: aastore
		// @0B3: dup
		// @0B4: bipush 15 (0x0F)
		// @0B6: ldc "~-&\")x\u001c60)r2\u00006/n01"
		// @0B8: invokestatic game.C_100031_gl.func_103959_z(java.lang.String)char[]
		// @0BB: invokestatic game.C_100031_gl.func_103955_z(char[])java.lang.String
		// @0BE: aastore
		// @0BF: dup
		// @0C0: bipush 16 (0x10)
		// @0C2: ldc "z3m\u0001u"
		// @0C4: invokestatic game.C_100031_gl.func_103959_z(java.lang.String)char[]
		// @0C7: invokestatic game.C_100031_gl.func_103955_z(char[])java.lang.String
		// @0CA: aastore
		// @0CB: dup
		// @0CC: bipush 17 (0x11)
		// @0CE: ldc "I\u0006\u0013\u0006\u0002T\u0011\u0017\u001c\u001cO\u0018\u0001"
		// @0D0: invokestatic game.C_100031_gl.func_103959_z(java.lang.String)char[]
		// @0D3: invokestatic game.C_100031_gl.func_103955_z(char[])java.lang.String
		// @0D6: aastore
		// @0D7: dup
		// @0D8: bipush 18 (0x12)
		// @0DA: ldc "n:7\u0011\u001a_"
		// @0DC: invokestatic game.C_100031_gl.func_103959_z(java.lang.String)char[]
		// @0DF: invokestatic game.C_100031_gl.func_103955_z(char[])java.lang.String
		// @0E2: aastore
		// @0E3: putstatic java.lang.String[] game.C_100031_gl.field_103970_z
		// @0E6: sipush 400 (0x0190)
		// @0E9: bipush 50 (0x32)
		// @0EB: invokestatic game.C_100020_wm.func_103853_a(int, int)void
		// @0EE: ldc "R\u0014"
		// @0F0: invokestatic game.C_100031_gl.func_103959_z(java.lang.String)char[]
		// @0F3: invokestatic game.C_100031_gl.func_103955_z(char[])java.lang.String
		// @0F6: putstatic java.lang.String game.C_100031_gl.field_103964_d
		// @0F9: new game.C_100186_rl
		// @0FC: dup
		// @0FD: invokespecial game.C_100186_rl.<init>()void
		// @100: putstatic game.C_100186_rl game.C_100031_gl.field_103972_i
		// @103: ldc "I7*0}z>.&}r/7*2s\u007f+\".=1,7}d:7c?x:-c(s3, 6x;c%2o\u007f6083"
		// @105: invokestatic game.C_100031_gl.func_103959_z(java.lang.String)char[]
		// @108: invokestatic game.C_100031_gl.func_103955_z(char[])java.lang.String
		// @10B: putstatic java.lang.String game.C_100031_gl.field_103971_h
		// @10E: return
	}
	
	private static char[] func_103959_z(String arg0)
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
		// @0E: bipush 93 (0x5D)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_103955_z(char[] arg0)
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
		// @30: bipush 29 (0x1D)
		// @32: goto @46
		// @35: bipush 95 (0x5F)
		// @37: goto @46
		// @3A: bipush 67 (0x43)
		// @3C: goto @46
		// @3F: bipush 67 (0x43)
		// @41: goto @46
		// @44: bipush 93 (0x5D)
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
