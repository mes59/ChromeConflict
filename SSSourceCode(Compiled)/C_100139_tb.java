package game;

final class C_100139_tb extends C_100256_pk
{
	private C_100225_ah[] field_100530_v;
	static int[] field_100529_w;
	private C_100225_ah field_100535_y;
	static C_100202_qi field_100532_B;
	static C_100153_be[] field_100534_z;
	static C_100112_r field_100536_x;
	static String field_100531_A;
	private static final String[] field_100533_C;
	
	C_100139_tb(C_100139_tb arg0, boolean arg1)
	{
		// @00: aload_0
		// @01: invokespecial game.C_100139_tb.<init>()void
		// @04: aload_1
		// @05: aload_0
		// @06: iload_2
		// @07: bipush -96 (0xA0)
		// @09: invokespecial game.C_100139_tb.func_100526_a(game.C_100139_tb, boolean, int)void
		// @0C: goto @4B
		// @0F: astore_3
		// @10: aload_3
		// @11: new java.lang.StringBuilder
		// @14: dup
		// @15: invokespecial java.lang.StringBuilder.<init>()void
		// @18: getstatic java.lang.String[] game.C_100139_tb.field_100533_C
		// @1B: bipush 7 (0x07)
		// @1D: aaload
		// @1E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @21: aload_1
		// @22: ifnull @2E
		// @25: getstatic java.lang.String[] game.C_100139_tb.field_100533_C
		// @28: iconst_2
		// @29: aaload
		// @2A: goto @33
		// @2D: athrow
		// @2E: getstatic java.lang.String[] game.C_100139_tb.field_100533_C
		// @31: iconst_1
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
	
	public final void func_100362_a(boolean arg0, int arg1, int arg2, int arg3, C_100336_im arg4)
	{
		// @000: aload #5
		// @002: instanceof game.C_100218_am
		// @005: ifne @00D
		// @008: aconst_null
		// @009: goto @00F
		// @00C: athrow
		// @00D: aload #5
		// @00F: checkcast game.C_100218_am
		// @012: checkcast game.C_100218_am
		// @015: astore #6
		// @017: iload_2
		// @018: sipush 26451 (0x6753)
		// @01B: iadd
		// @01C: aload #5
		// @01E: getfield int game.C_100336_im.field_102544_t
		// @021: aload #5
		// @023: getfield int game.C_100336_im.field_102541_w
		// @026: iload #4
		// @028: iadd
		// @029: iadd
		// @02A: iload #4
		// @02C: aload #5
		// @02E: getfield int game.C_100336_im.field_102541_w
		// @031: ineg
		// @032: isub
		// @033: aload #5
		// @035: getfield int game.C_100336_im.field_102537_l
		// @038: iload_3
		// @039: aload #5
		// @03B: getfield int game.C_100336_im.field_102538_m
		// @03E: iadd
		// @03F: iadd
		// @040: iload_3
		// @041: aload #5
		// @043: getfield int game.C_100336_im.field_102538_m
		// @046: iadd
		// @047: invokestatic game.C_100209_qb.func_102687_b(int, int, int, int, int)void
		// @04A: iload_2
		// @04B: sipush -26568 (0x9838)
		// @04E: if_icmpeq @05F
		// @051: aload_0
		// @052: bipush -111 (0x91)
		// @054: aconst_null
		// @055: checkcast game.C_100037_wb
		// @058: invokevirtual game.C_100139_tb.func_100521_a(int, game.C_100037_wb)void
		// @05B: goto @05F
		// @05E: athrow
		// @05F: aload #6
		// @061: ifnull @06C
		// @064: iload_1
		// @065: aload #6
		// @067: getfield boolean game.C_100218_am.field_103113_L
		// @06A: iand
		// @06B: istore_1
		// @06C: aload_0
		// @06D: getfield game.C_100225_ah[] game.C_100139_tb.field_100530_v
		// @070: iconst_0
		// @071: aaload
		// @072: astore #7
		// @074: aload_0
		// @075: getfield game.C_100225_ah game.C_100139_tb.field_100535_y
		// @078: sipush 26632 (0x6808)
		// @07B: invokevirtual game.C_100225_ah.func_106115_c(int)void
		// @07E: aload #7
		// @080: aload #5
		// @082: aload_0
		// @083: aload_0
		// @084: getfield game.C_100225_ah game.C_100139_tb.field_100535_y
		// @087: iload_3
		// @088: iload #4
		// @08A: bipush 66 (0x42)
		// @08C: invokevirtual game.C_100225_ah.func_106118_a(game.C_100336_im, game.C_100139_tb, game.C_100225_ah, int, int, byte)void
		// @08F: aload #6
		// @091: ifnonnull @098
		// @094: goto @129
		// @097: athrow
		// @098: aload #6
		// @09A: getfield boolean game.C_100218_am.field_103120_K
		// @09D: ifne @0A4
		// @0A0: goto @0C7
		// @0A3: athrow
		// @0A4: aload_0
		// @0A5: getfield game.C_100225_ah[] game.C_100139_tb.field_100530_v
		// @0A8: iconst_1
		// @0A9: aaload
		// @0AA: astore #8
		// @0AC: aconst_null
		// @0AD: aload #8
		// @0AF: if_acmpne @0B6
		// @0B2: goto @0C7
		// @0B5: athrow
		// @0B6: aload #8
		// @0B8: aload #5
		// @0BA: aload_0
		// @0BB: aload_0
		// @0BC: getfield game.C_100225_ah game.C_100139_tb.field_100535_y
		// @0BF: iload_3
		// @0C0: iload #4
		// @0C2: bipush -116 (0x8C)
		// @0C4: invokevirtual game.C_100225_ah.func_106118_a(game.C_100336_im, game.C_100139_tb, game.C_100225_ah, int, int, byte)void
		// @0C7: aload #6
		// @0C9: getfield boolean game.C_100218_am.field_102539_j
		// @0CC: ifeq @129
		// @0CF: aload_0
		// @0D0: getfield game.C_100225_ah[] game.C_100139_tb.field_100530_v
		// @0D3: iconst_3
		// @0D4: aaload
		// @0D5: astore #8
		// @0D7: iconst_m1
		// @0D8: aload #6
		// @0DA: getfield int game.C_100218_am.field_102532_A
		// @0DD: iconst_m1
		// @0DE: ixor
		// @0DF: if_icmpeq @0EB
		// @0E2: aload #8
		// @0E4: ifnonnull @114
		// @0E7: goto @0EB
		// @0EA: athrow
		// @0EB: aload_0
		// @0EC: getfield game.C_100225_ah[] game.C_100139_tb.field_100530_v
		// @0EF: iconst_2
		// @0F0: aaload
		// @0F1: astore #9
		// @0F3: aconst_null
		// @0F4: aload #9
		// @0F6: if_acmpne @0FD
		// @0F9: goto @10E
		// @0FC: athrow
		// @0FD: aload #9
		// @0FF: aload #5
		// @101: aload_0
		// @102: aload_0
		// @103: getfield game.C_100225_ah game.C_100139_tb.field_100535_y
		// @106: iload_3
		// @107: iload #4
		// @109: bipush 80 (0x50)
		// @10B: invokevirtual game.C_100225_ah.func_106118_a(game.C_100336_im, game.C_100139_tb, game.C_100225_ah, int, int, byte)void
		// @10E: getstatic int game.SteelSentinels.field_105275_O
		// @111: ifeq @129
		// @114: aload #8
		// @116: aload #5
		// @118: aload_0
		// @119: aload_0
		// @11A: getfield game.C_100225_ah game.C_100139_tb.field_100535_y
		// @11D: iload_3
		// @11E: iload #4
		// @120: bipush -126 (0x82)
		// @122: invokevirtual game.C_100225_ah.func_106118_a(game.C_100336_im, game.C_100139_tb, game.C_100225_ah, int, int, byte)void
		// @125: goto @129
		// @128: athrow
		// @129: aload #5
		// @12B: bipush 33 (0x21)
		// @12D: invokevirtual game.C_100336_im.func_102515_d(byte)boolean
		// @130: ifeq @155
		// @133: aload_0
		// @134: getfield game.C_100225_ah[] game.C_100139_tb.field_100530_v
		// @137: iconst_5
		// @138: aaload
		// @139: astore #8
		// @13B: aload #8
		// @13D: ifnonnull @144
		// @140: goto @155
		// @143: athrow
		// @144: aload #8
		// @146: aload #5
		// @148: aload_0
		// @149: aload_0
		// @14A: getfield game.C_100225_ah game.C_100139_tb.field_100535_y
		// @14D: iload_3
		// @14E: iload #4
		// @150: bipush -114 (0x8E)
		// @152: invokevirtual game.C_100225_ah.func_106118_a(game.C_100336_im, game.C_100139_tb, game.C_100225_ah, int, int, byte)void
		// @155: iload_1
		// @156: ifne @17B
		// @159: aload_0
		// @15A: getfield game.C_100225_ah[] game.C_100139_tb.field_100530_v
		// @15D: iconst_4
		// @15E: aaload
		// @15F: astore #8
		// @161: aload #8
		// @163: ifnull @17B
		// @166: aload #8
		// @168: aload #5
		// @16A: aload_0
		// @16B: aload_0
		// @16C: getfield game.C_100225_ah game.C_100139_tb.field_100535_y
		// @16F: iload_3
		// @170: iload #4
		// @172: bipush -112 (0x90)
		// @174: invokevirtual game.C_100225_ah.func_106118_a(game.C_100336_im, game.C_100139_tb, game.C_100225_ah, int, int, byte)void
		// @177: goto @17B
		// @17A: athrow
		// @17B: aload_0
		// @17C: getfield game.C_100225_ah game.C_100139_tb.field_100535_y
		// @17F: bipush -6 (0xFA)
		// @181: iload_3
		// @182: aload #5
		// @184: aload_0
		// @185: iload #4
		// @187: invokevirtual game.C_100225_ah.func_106109_a(int, int, game.C_100336_im, game.C_100139_tb, int)void
		// @18A: bipush -77 (0xB3)
		// @18C: invokestatic game.C_100200_ba.func_105842_a(byte)void
		// @18F: goto @1EC
		// @192: astore #6
		// @194: aload #6
		// @196: new java.lang.StringBuilder
		// @199: dup
		// @19A: invokespecial java.lang.StringBuilder.<init>()void
		// @19D: getstatic java.lang.String[] game.C_100139_tb.field_100533_C
		// @1A0: iconst_3
		// @1A1: aaload
		// @1A2: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1A5: iload_1
		// @1A6: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @1A9: bipush 44 (0x2C)
		// @1AB: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1AE: iload_2
		// @1AF: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1B2: bipush 44 (0x2C)
		// @1B4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1B7: iload_3
		// @1B8: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1BB: bipush 44 (0x2C)
		// @1BD: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1C0: iload #4
		// @1C2: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1C5: bipush 44 (0x2C)
		// @1C7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1CA: aload #5
		// @1CC: ifnull @1D8
		// @1CF: getstatic java.lang.String[] game.C_100139_tb.field_100533_C
		// @1D2: iconst_2
		// @1D3: aaload
		// @1D4: goto @1DD
		// @1D7: athrow
		// @1D8: getstatic java.lang.String[] game.C_100139_tb.field_100533_C
		// @1DB: iconst_1
		// @1DC: aaload
		// @1DD: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1E0: bipush 41 (0x29)
		// @1E2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1E5: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @1E8: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @1EB: athrow
		// @1EC: return
	}
	
	public static void func_100524_a(byte arg0)
	{
		// @00: aconst_null
		// @01: putstatic game.C_100202_qi game.C_100139_tb.field_100532_B
		// @04: aconst_null
		// @05: putstatic game.C_100153_be[] game.C_100139_tb.field_100534_z
		// @08: aconst_null
		// @09: putstatic java.lang.String game.C_100139_tb.field_100531_A
		// @0C: aconst_null
		// @0D: putstatic game.C_100112_r game.C_100139_tb.field_100536_x
		// @10: iload_0
		// @11: bipush 97 (0x61)
		// @13: if_icmpeq @21
		// @16: aconst_null
		// @17: checkcast java.lang.String
		// @1A: putstatic java.lang.String game.C_100139_tb.field_100531_A
		// @1D: goto @21
		// @20: athrow
		// @21: aconst_null
		// @22: putstatic int[] game.C_100139_tb.field_100529_w
		// @25: goto @4A
		// @28: astore_1
		// @29: aload_1
		// @2A: new java.lang.StringBuilder
		// @2D: dup
		// @2E: invokespecial java.lang.StringBuilder.<init>()void
		// @31: getstatic java.lang.String[] game.C_100139_tb.field_100533_C
		// @34: bipush 6 (0x06)
		// @36: aaload
		// @37: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3A: iload_0
		// @3B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3E: bipush 41 (0x29)
		// @40: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @43: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @46: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @49: athrow
		// @4A: return
	}
	
	private final void func_100526_a(C_100139_tb arg0, boolean arg1, int arg2)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #7
		// @05: aload_0
		// @06: aload_1
		// @07: bipush -62 (0xC2)
		// @09: invokespecial game.C_100256_pk.func_100454_a(game.C_100256_pk, int)void
		// @0C: iload_3
		// @0D: bipush -4 (0xFC)
		// @0F: if_icmplt @13
		// @12: return
		// @13: iload_2
		// @14: ifeq @81
		// @17: iconst_0
		// @18: istore #4
		// @1A: bipush 6 (0x06)
		// @1C: iload #4
		// @1E: if_icmple @7C
		// @21: aload_0
		// @22: getfield game.C_100225_ah[] game.C_100139_tb.field_100530_v
		// @25: iload #4
		// @27: aaload
		// @28: astore #5
		// @2A: iload #7
		// @2C: ifne @94
		// @2F: aconst_null
		// @30: aload #5
		// @32: if_acmpne @4A
		// @35: goto @39
		// @38: athrow
		// @39: aload_1
		// @3A: getfield game.C_100225_ah[] game.C_100139_tb.field_100530_v
		// @3D: iload #4
		// @3F: aconst_null
		// @40: aastore
		// @41: iload #7
		// @43: ifeq @74
		// @46: goto @4A
		// @49: athrow
		// @4A: aload_1
		// @4B: getfield game.C_100225_ah[] game.C_100139_tb.field_100530_v
		// @4E: iload #4
		// @50: aaload
		// @51: astore #6
		// @53: aload #5
		// @55: bipush -93 (0xA3)
		// @57: aload #6
		// @59: ifnonnull @6F
		// @5C: aload_1
		// @5D: getfield game.C_100225_ah[] game.C_100139_tb.field_100530_v
		// @60: iload #4
		// @62: new game.C_100225_ah
		// @65: dup
		// @66: invokespecial game.C_100225_ah.<init>()void
		// @69: dup_x2
		// @6A: aastore
		// @6B: goto @71
		// @6E: athrow
		// @6F: aload #6
		// @71: invokevirtual game.C_100225_ah.func_106110_a(byte, game.C_100225_ah)void
		// @74: iinc #4 +1
		// @77: iload #7
		// @79: ifeq @1A
		// @7C: iload #7
		// @7E: ifeq @94
		// @81: aload_0
		// @82: getfield game.C_100225_ah[] game.C_100139_tb.field_100530_v
		// @85: iconst_0
		// @86: aload_1
		// @87: getfield game.C_100225_ah[] game.C_100139_tb.field_100530_v
		// @8A: iconst_0
		// @8B: bipush 6 (0x06)
		// @8D: invokestatic game.C_100120_en.func_104912_a(java.lang.Object[], int, java.lang.Object[], int, int)void
		// @90: goto @94
		// @93: athrow
		// @94: goto @DD
		// @97: astore #4
		// @99: aload #4
		// @9B: new java.lang.StringBuilder
		// @9E: dup
		// @9F: invokespecial java.lang.StringBuilder.<init>()void
		// @A2: getstatic java.lang.String[] game.C_100139_tb.field_100533_C
		// @A5: iconst_4
		// @A6: aaload
		// @A7: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @AA: aload_1
		// @AB: ifnull @B7
		// @AE: getstatic java.lang.String[] game.C_100139_tb.field_100533_C
		// @B1: iconst_2
		// @B2: aaload
		// @B3: goto @BC
		// @B6: athrow
		// @B7: getstatic java.lang.String[] game.C_100139_tb.field_100533_C
		// @BA: iconst_1
		// @BB: aaload
		// @BC: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @BF: bipush 44 (0x2C)
		// @C1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C4: iload_2
		// @C5: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @C8: bipush 44 (0x2C)
		// @CA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @CD: iload_3
		// @CE: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @D1: bipush 41 (0x29)
		// @D3: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D6: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @D9: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @DC: athrow
		// @DD: return
	}
	
	final C_100225_ah func_100528_b(int arg0, int arg1)
	{
		// @00: iload_1
		// @01: ifeq @0D
		// @04: bipush 114 (0x72)
		// @06: invokestatic game.C_100139_tb.func_100524_a(byte)void
		// @09: goto @0D
		// @0C: athrow
		// @0D: aload_0
		// @0E: getfield game.C_100225_ah[] game.C_100139_tb.field_100530_v
		// @11: iload_2
		// @12: new game.C_100225_ah
		// @15: dup
		// @16: invokespecial game.C_100225_ah.<init>()void
		// @19: dup_x2
		// @1A: aastore
		// @1B: areturn
		// @1C: astore_3
		// @1D: aload_3
		// @1E: new java.lang.StringBuilder
		// @21: dup
		// @22: invokespecial java.lang.StringBuilder.<init>()void
		// @25: getstatic java.lang.String[] game.C_100139_tb.field_100533_C
		// @28: bipush 10 (0x0A)
		// @2A: aaload
		// @2B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2E: iload_1
		// @2F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @32: bipush 44 (0x2C)
		// @34: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @37: iload_2
		// @38: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3B: bipush 41 (0x29)
		// @3D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @40: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @43: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @46: athrow
	}
	
	final void func_100522_a(int arg0, C_100037_wb[] arg1, boolean arg2)
	{
		// @00: iload_3
		// @01: ifeq @05
		// @04: return
		// @05: iload_1
		// @06: istore #4
		// @08: aload_0
		// @09: getfield game.C_100225_ah[] game.C_100139_tb.field_100530_v
		// @0C: iload #4
		// @0E: aaload
		// @0F: ifnull @16
		// @12: goto @24
		// @15: athrow
		// @16: aload_0
		// @17: getfield game.C_100225_ah[] game.C_100139_tb.field_100530_v
		// @1A: iload #4
		// @1C: new game.C_100225_ah
		// @1F: dup
		// @20: invokespecial game.C_100225_ah.<init>()void
		// @23: aastore
		// @24: aload_0
		// @25: getfield game.C_100225_ah[] game.C_100139_tb.field_100530_v
		// @28: iload_1
		// @29: aaload
		// @2A: aload_2
		// @2B: putfield game.C_100037_wb[] game.C_100225_ah.field_106124_c
		// @2E: goto @78
		// @31: astore #4
		// @33: aload #4
		// @35: new java.lang.StringBuilder
		// @38: dup
		// @39: invokespecial java.lang.StringBuilder.<init>()void
		// @3C: getstatic java.lang.String[] game.C_100139_tb.field_100533_C
		// @3F: bipush 9 (0x09)
		// @41: aaload
		// @42: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @45: iload_1
		// @46: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @49: bipush 44 (0x2C)
		// @4B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4E: aload_2
		// @4F: ifnull @5B
		// @52: getstatic java.lang.String[] game.C_100139_tb.field_100533_C
		// @55: iconst_2
		// @56: aaload
		// @57: goto @60
		// @5A: athrow
		// @5B: getstatic java.lang.String[] game.C_100139_tb.field_100533_C
		// @5E: iconst_1
		// @5F: aaload
		// @60: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @63: bipush 44 (0x2C)
		// @65: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @68: iload_3
		// @69: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @6C: bipush 41 (0x29)
		// @6E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @71: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @74: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @77: athrow
		// @78: return
	}
	
	public C_100139_tb()
	{
		// @00: aload_0
		// @01: invokespecial game.C_100256_pk.<init>()void
		// @04: aload_0
		// @05: bipush 6 (0x06)
		// @07: anewarray game.C_100225_ah
		// @0A: putfield game.C_100225_ah[] game.C_100139_tb.field_100530_v
		// @0D: aload_0
		// @0E: new game.C_100225_ah
		// @11: dup
		// @12: invokespecial game.C_100225_ah.<init>()void
		// @15: putfield game.C_100225_ah game.C_100139_tb.field_100535_y
		// @18: aload_0
		// @19: getfield game.C_100225_ah[] game.C_100139_tb.field_100530_v
		// @1C: iconst_0
		// @1D: new game.C_100225_ah
		// @20: dup
		// @21: invokespecial game.C_100225_ah.<init>()void
		// @24: dup_x2
		// @25: aastore
		// @26: astore_1
		// @27: aload_1
		// @28: sipush 26632 (0x6808)
		// @2B: invokevirtual game.C_100225_ah.func_106115_c(int)void
		// @2E: goto @3D
		// @31: astore_1
		// @32: aload_1
		// @33: getstatic java.lang.String[] game.C_100139_tb.field_100533_C
		// @36: bipush 8 (0x08)
		// @38: aaload
		// @39: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3C: athrow
		// @3D: return
	}
	
	final void func_100527_a(int arg0, C_100037_wb[] arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #6
		// @05: iload_1
		// @06: bipush -54 (0xCA)
		// @08: if_icmplt @16
		// @0B: aconst_null
		// @0C: checkcast game.C_100112_r
		// @0F: putstatic game.C_100112_r game.C_100139_tb.field_100536_x
		// @12: goto @16
		// @15: athrow
		// @16: aload_0
		// @17: getfield game.C_100225_ah[] game.C_100139_tb.field_100530_v
		// @1A: astore_3
		// @1B: iconst_0
		// @1C: istore #4
		// @1E: aload_3
		// @1F: arraylength
		// @20: iconst_m1
		// @21: ixor
		// @22: iload #4
		// @24: iconst_m1
		// @25: ixor
		// @26: if_icmpge @4F
		// @29: aload_3
		// @2A: iload #4
		// @2C: aaload
		// @2D: astore #5
		// @2F: iload #6
		// @31: ifne @8D
		// @34: aload #5
		// @36: ifnonnull @41
		// @39: goto @3D
		// @3C: athrow
		// @3D: goto @47
		// @40: athrow
		// @41: aload #5
		// @43: aload_2
		// @44: putfield game.C_100037_wb[] game.C_100225_ah.field_106124_c
		// @47: iinc #4 +1
		// @4A: iload #6
		// @4C: ifeq @1E
		// @4F: goto @8D
		// @52: astore_3
		// @53: aload_3
		// @54: new java.lang.StringBuilder
		// @57: dup
		// @58: invokespecial java.lang.StringBuilder.<init>()void
		// @5B: getstatic java.lang.String[] game.C_100139_tb.field_100533_C
		// @5E: iconst_5
		// @5F: aaload
		// @60: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @63: iload_1
		// @64: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @67: bipush 44 (0x2C)
		// @69: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6C: aload_2
		// @6D: ifnull @79
		// @70: getstatic java.lang.String[] game.C_100139_tb.field_100533_C
		// @73: iconst_2
		// @74: aaload
		// @75: goto @7E
		// @78: athrow
		// @79: getstatic java.lang.String[] game.C_100139_tb.field_100533_C
		// @7C: iconst_1
		// @7D: aaload
		// @7E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @81: bipush 41 (0x29)
		// @83: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @86: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @89: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @8C: athrow
		// @8D: return
	}
	
	final void func_100521_a(int arg0, C_100037_wb arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #7
		// @05: aload_0
		// @06: getfield game.C_100225_ah[] game.C_100139_tb.field_100530_v
		// @09: astore_3
		// @0A: bipush -119 (0x89)
		// @0C: iload_1
		// @0D: bipush -12 (0xF4)
		// @0F: isub
		// @10: bipush 47 (0x2F)
		// @12: idiv
		// @13: irem
		// @14: istore #4
		// @16: iconst_0
		// @17: istore #5
		// @19: aload_3
		// @1A: arraylength
		// @1B: iconst_m1
		// @1C: ixor
		// @1D: iload #5
		// @1F: iconst_m1
		// @20: ixor
		// @21: if_icmpge @4A
		// @24: aload_3
		// @25: iload #5
		// @27: aaload
		// @28: astore #6
		// @2A: iload #7
		// @2C: ifne @88
		// @2F: aload #6
		// @31: ifnull @42
		// @34: goto @38
		// @37: athrow
		// @38: aload #6
		// @3A: aload_2
		// @3B: putfield game.C_100037_wb game.C_100225_ah.field_106128_l
		// @3E: goto @42
		// @41: athrow
		// @42: iinc #5 +1
		// @45: iload #7
		// @47: ifeq @19
		// @4A: goto @88
		// @4D: astore_3
		// @4E: aload_3
		// @4F: new java.lang.StringBuilder
		// @52: dup
		// @53: invokespecial java.lang.StringBuilder.<init>()void
		// @56: getstatic java.lang.String[] game.C_100139_tb.field_100533_C
		// @59: iconst_0
		// @5A: aaload
		// @5B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @5E: iload_1
		// @5F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @62: bipush 44 (0x2C)
		// @64: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @67: aload_2
		// @68: ifnull @74
		// @6B: getstatic java.lang.String[] game.C_100139_tb.field_100533_C
		// @6E: iconst_2
		// @6F: aaload
		// @70: goto @79
		// @73: athrow
		// @74: getstatic java.lang.String[] game.C_100139_tb.field_100533_C
		// @77: iconst_1
		// @78: aaload
		// @79: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @7C: bipush 41 (0x29)
		// @7E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @81: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @84: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @87: athrow
		// @88: return
	}
	
	static
	{
		// @00: bipush 11 (0x0B)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "XD{\u0010!"
		// @09: invokestatic game.C_100139_tb.func_100525_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100139_tb.func_100523_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "BS99"
		// @14: invokestatic game.C_100139_tb.func_100525_z(java.lang.String)char[]
		// @17: invokestatic game.C_100139_tb.func_100523_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "W\u0008{{t"
		// @1F: invokestatic game.C_100139_tb.func_100525_z(java.lang.String)char[]
		// @22: invokestatic game.C_100139_tb.func_100523_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "XD{\u0011!"
		// @2A: invokestatic game.C_100139_tb.func_100525_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100139_tb.func_100523_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "XD{\u0012!"
		// @35: invokestatic game.C_100139_tb.func_100525_z(java.lang.String)char[]
		// @38: invokestatic game.C_100139_tb.func_100523_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "XD{\u0017!"
		// @40: invokestatic game.C_100139_tb.func_100525_z(java.lang.String)char[]
		// @43: invokestatic game.C_100139_tb.func_100523_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "XD{\u0016!"
		// @4C: invokestatic game.C_100139_tb.func_100525_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100139_tb.func_100523_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "XD{i`BO!k!"
		// @58: invokestatic game.C_100139_tb.func_100525_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100139_tb.func_100523_z(char[])java.lang.String
		// @5E: aastore
		// @5F: dup
		// @60: bipush 8 (0x08)
		// @62: ldc "XD{i`BO!k!\u0005"
		// @64: invokestatic game.C_100139_tb.func_100525_z(java.lang.String)char[]
		// @67: invokestatic game.C_100139_tb.func_100523_z(char[])java.lang.String
		// @6A: aastore
		// @6B: dup
		// @6C: bipush 9 (0x09)
		// @6E: ldc "XD{\u0013!"
		// @70: invokestatic game.C_100139_tb.func_100525_z(java.lang.String)char[]
		// @73: invokestatic game.C_100139_tb.func_100523_z(char[])java.lang.String
		// @76: aastore
		// @77: dup
		// @78: bipush 10 (0x0A)
		// @7A: ldc "XD{\u0014!"
		// @7C: invokestatic game.C_100139_tb.func_100525_z(java.lang.String)char[]
		// @7F: invokestatic game.C_100139_tb.func_100523_z(char[])java.lang.String
		// @82: aastore
		// @83: putstatic java.lang.String[] game.C_100139_tb.field_100533_C
		// @86: iconst_2
		// @87: invokestatic game.C_100015_wh.func_103779_b(int)int[]
		// @8A: putstatic int[] game.C_100139_tb.field_100529_w
		// @8D: ldc "\u0010\u0003dk)\\J 8dIR01)@O>0)M\u0006&!h@J01)NT<6b"
		// @8F: invokestatic game.C_100139_tb.func_100525_z(java.lang.String)char[]
		// @92: invokestatic game.C_100139_tb.func_100523_z(char[])java.lang.String
		// @95: putstatic java.lang.String game.C_100139_tb.field_100531_A
		// @98: return
	}
	
	private static char[] func_100525_z(String arg0)
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
		// @0E: bipush 9 (0x09)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_100523_z(char[] arg0)
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
		// @30: bipush 44 (0x2C)
		// @32: goto @46
		// @35: bipush 38 (0x26)
		// @37: goto @46
		// @3A: bipush 85 (0x55)
		// @3C: goto @46
		// @3F: bipush 85 (0x55)
		// @41: goto @46
		// @44: bipush 9 (0x09)
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
