package game;

final class C_100310_lj extends C_100256_pk
{
	private int field_100545_A;
	private C_100037_wb[] field_100549_y;
	static int field_100548_z;
	static int[] field_100550_x;
	private int field_100544_v;
	static int[] field_100546_B;
	private int field_100543_w;
	private static final String[] field_100547_C;
	
	public C_100310_lj()
	{
		// @0: aload_0
		// @1: ldc 2188450 (0x2164a2)
		// @3: ldc 2591221 (0x2789f5)
		// @5: sipush 9543 (0x2547)
		// @8: invokespecial game.C_100310_lj.<init>(int, int, int)void
		// @B: return
	}
	
	static final void func_100542_a(int arg0, byte arg1)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore_3
		// @004: iload_0
		// @005: putstatic int game.C_100216_aj.field_104467_z
		// @008: iload_1
		// @009: bipush 76 (0x4C)
		// @00B: if_icmpge @017
		// @00E: bipush -119 (0x89)
		// @010: putstatic int game.C_100310_lj.field_100548_z
		// @013: goto @017
		// @016: athrow
		// @017: getstatic game.C_100202_qi game.C_100226_ae.field_106148_d
		// @01A: bipush 95 (0x5F)
		// @01C: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @01F: checkcast game.C_100179_ch
		// @022: astore_2
		// @023: aload_2
		// @024: ifnull @073
		// @027: aload_2
		// @028: getfield game.C_100158_da game.C_100179_ch.field_100817_k
		// @02B: sipush 31025 (0x7931)
		// @02E: invokevirtual game.C_100158_da.func_100587_d(int)boolean
		// @031: iload_3
		// @032: ifne @09B
		// @035: ifeq @059
		// @038: goto @03C
		// @03B: athrow
		// @03C: aload_2
		// @03D: getfield game.C_100117_p game.C_100179_ch.field_100808_r
		// @040: getstatic int game.C_100216_aj.field_104467_z
		// @043: aload_2
		// @044: getfield int game.C_100179_ch.field_100809_q
		// @047: imul
		// @048: bipush -128 (0x80)
		// @04A: isub
		// @04B: ldc -1544217368 (0xa3f51ce8)
		// @04D: ishr
		// @04E: invokevirtual game.C_100117_p.func_100984_i(int)void
		// @051: iload_3
		// @052: ifeq @063
		// @055: goto @059
		// @058: athrow
		// @059: aload_2
		// @05A: bipush 45 (0x2D)
		// @05C: invokevirtual game.C_100179_ch.func_100583_c(int)void
		// @05F: goto @063
		// @062: athrow
		// @063: getstatic game.C_100202_qi game.C_100226_ae.field_106148_d
		// @066: bipush 66 (0x42)
		// @068: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @06B: checkcast game.C_100179_ch
		// @06E: astore_2
		// @06F: iload_3
		// @070: ifeq @023
		// @073: getstatic game.C_100202_qi game.C_100205_qf.field_103680_b
		// @076: ifnull @0D6
		// @079: getstatic game.C_100202_qi game.C_100205_qf.field_103680_b
		// @07C: bipush 127 (0x7F)
		// @07E: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @081: checkcast game.C_100179_ch
		// @084: astore_2
		// @085: aload_2
		// @086: ifnull @0D6
		// @089: iload_3
		// @08A: ifne @103
		// @08D: aload_2
		// @08E: getfield game.C_100158_da game.C_100179_ch.field_100817_k
		// @091: sipush 31025 (0x7931)
		// @094: invokevirtual game.C_100158_da.func_100587_d(int)boolean
		// @097: goto @09B
		// @09A: athrow
		// @09B: ifne @0AC
		// @09E: aload_2
		// @09F: bipush 45 (0x2D)
		// @0A1: invokevirtual game.C_100179_ch.func_100583_c(int)void
		// @0A4: iload_3
		// @0A5: ifeq @0C6
		// @0A8: goto @0AC
		// @0AB: athrow
		// @0AC: aload_2
		// @0AD: getfield game.C_100117_p game.C_100179_ch.field_100808_r
		// @0B0: sipush 128 (0x0080)
		// @0B3: aload_2
		// @0B4: getfield int game.C_100179_ch.field_100809_q
		// @0B7: getstatic int game.C_100216_aj.field_104467_z
		// @0BA: imul
		// @0BB: iadd
		// @0BC: ldc -1692453880 (0x9b1f3408)
		// @0BE: ishr
		// @0BF: invokevirtual game.C_100117_p.func_100984_i(int)void
		// @0C2: goto @0C6
		// @0C5: athrow
		// @0C6: getstatic game.C_100202_qi game.C_100205_qf.field_103680_b
		// @0C9: bipush 54 (0x36)
		// @0CB: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @0CE: checkcast game.C_100179_ch
		// @0D1: astore_2
		// @0D2: iload_3
		// @0D3: ifeq @085
		// @0D6: goto @103
		// @0D9: astore_2
		// @0DA: aload_2
		// @0DB: new java.lang.StringBuilder
		// @0DE: dup
		// @0DF: invokespecial java.lang.StringBuilder.<init>()void
		// @0E2: getstatic java.lang.String[] game.C_100310_lj.field_100547_C
		// @0E5: iconst_2
		// @0E6: aaload
		// @0E7: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0EA: iload_0
		// @0EB: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0EE: bipush 44 (0x2C)
		// @0F0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0F3: iload_1
		// @0F4: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0F7: bipush 41 (0x29)
		// @0F9: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0FC: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @0FF: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @102: athrow
		// @103: return
	}
	
	static final int func_100538_b(int arg0, int arg1)
	{
		// @00: iconst_0
		// @01: istore_2
		// @02: iconst_0
		// @03: iload_0
		// @04: if_icmpgt @15
		// @07: iload_0
		// @08: ldc 65536 (0x10000)
		// @0A: if_icmpge @15
		// @0D: goto @11
		// @10: athrow
		// @11: goto @1D
		// @14: athrow
		// @15: iload_0
		// @16: bipush 16 (0x10)
		// @18: iushr
		// @19: istore_0
		// @1A: iinc #2 +16
		// @1D: iload_0
		// @1E: sipush 256 (0x0100)
		// @21: if_icmplt @2C
		// @24: iload_0
		// @25: bipush 8 (0x08)
		// @27: iushr
		// @28: istore_0
		// @29: iinc #2 +8
		// @2C: bipush -17 (0xEF)
		// @2E: iload_0
		// @2F: iconst_m1
		// @30: ixor
		// @31: if_icmpge @38
		// @34: goto @3F
		// @37: athrow
		// @38: iinc #2 +4
		// @3B: iload_0
		// @3C: iconst_4
		// @3D: iushr
		// @3E: istore_0
		// @3F: iload_0
		// @40: iconst_4
		// @41: if_icmplt @4B
		// @44: iload_0
		// @45: iconst_2
		// @46: iushr
		// @47: istore_0
		// @48: iinc #2 +2
		// @4B: iload_0
		// @4C: iconst_m1
		// @4D: ixor
		// @4E: bipush -2 (0xFE)
		// @50: if_icmpgt @5A
		// @53: iload_0
		// @54: iconst_1
		// @55: iushr
		// @56: istore_0
		// @57: iinc #2 +1
		// @5A: iload_1
		// @5B: sipush 18986 (0x4A2A)
		// @5E: if_icmpeq @6A
		// @61: bipush -104 (0x98)
		// @63: invokestatic game.C_100310_lj.func_100537_c(int)void
		// @66: goto @6A
		// @69: athrow
		// @6A: iload_2
		// @6B: iload_0
		// @6C: iadd
		// @6D: ireturn
		// @6E: astore_2
		// @6F: aload_2
		// @70: new java.lang.StringBuilder
		// @73: dup
		// @74: invokespecial java.lang.StringBuilder.<init>()void
		// @77: getstatic java.lang.String[] game.C_100310_lj.field_100547_C
		// @7A: iconst_3
		// @7B: aaload
		// @7C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @7F: iload_0
		// @80: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @83: bipush 44 (0x2C)
		// @85: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @88: iload_1
		// @89: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8C: bipush 41 (0x29)
		// @8E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @91: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @94: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @97: athrow
	}
	
	public static void func_100537_c(int arg0)
	{
		// @00: iload_0
		// @01: iconst_m1
		// @02: if_icmpeq @06
		// @05: return
		// @06: aconst_null
		// @07: putstatic int[] game.C_100310_lj.field_100550_x
		// @0A: aconst_null
		// @0B: putstatic int[] game.C_100310_lj.field_100546_B
		// @0E: goto @32
		// @11: astore_1
		// @12: aload_1
		// @13: new java.lang.StringBuilder
		// @16: dup
		// @17: invokespecial java.lang.StringBuilder.<init>()void
		// @1A: getstatic java.lang.String[] game.C_100310_lj.field_100547_C
		// @1D: iconst_4
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
	
	static final void func_100540_a(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5)
	{
		// @000: getstatic int[] game.C_100309_lk.field_103273_Y
		// @003: getstatic int game.C_100186_rl.field_105726_a
		// @006: iload #4
		// @008: iastore
		// @009: getstatic int[] game.C_100219_an.field_100876_n
		// @00C: getstatic int game.C_100186_rl.field_105726_a
		// @00F: getstatic int game.C_100186_rl.field_105726_a
		// @012: iastore
		// @013: getstatic int[] game.C_100222_aa.field_106080_f
		// @016: getstatic int game.C_100186_rl.field_105726_a
		// @019: iload #5
		// @01B: iastore
		// @01C: getstatic int game.C_100118_ub.field_102061_bc
		// @01F: iload #5
		// @021: if_icmpgt @028
		// @024: goto @02D
		// @027: athrow
		// @028: iload #5
		// @02A: putstatic int game.C_100161_sd.field_105426_b
		// @02D: getstatic int game.C_100321_hi.field_107224_l
		// @030: iload #5
		// @032: if_icmpge @03E
		// @035: iload #5
		// @037: putstatic int game.C_100255_pj.y
		// @03A: goto @03E
		// @03D: athrow
		// @03E: getstatic int[] game.C_100005_fk.field_103609_q
		// @041: getstatic int game.C_100186_rl.field_105726_a
		// @044: iload_1
		// @045: iastore
		// @046: getstatic int[] game.C_100188_rj.field_105738_b
		// @049: getstatic int game.C_100186_rl.field_105726_a
		// @04C: iload_3
		// @04D: iastore
		// @04E: getstatic int[] game.C_100143_bl.field_105102_e
		// @051: getstatic int game.C_100186_rl.field_105726_a
		// @054: iload_0
		// @055: iastore
		// @056: iload_0
		// @057: iload_1
		// @058: iload_3
		// @059: iadd
		// @05A: iadd
		// @05B: istore #6
		// @05D: iload #6
		// @05F: ifne @067
		// @062: iconst_0
		// @063: goto @06F
		// @066: athrow
		// @067: sipush 1000 (0x03E8)
		// @06A: iload_1
		// @06B: imul
		// @06C: iload #6
		// @06E: idiv
		// @06F: istore #7
		// @071: getstatic int[] game.C_100268_mk.field_106670_c
		// @074: getstatic int game.C_100186_rl.field_105726_a
		// @077: iload #7
		// @079: iastore
		// @07A: getstatic int game.C_100186_rl.field_105726_a
		// @07D: iconst_1
		// @07E: iadd
		// @07F: putstatic int game.C_100186_rl.field_105726_a
		// @082: bipush -48 (0xD0)
		// @084: bipush -24 (0xE8)
		// @086: iload_2
		// @087: isub
		// @088: bipush 34 (0x22)
		// @08A: idiv
		// @08B: idiv
		// @08C: istore #8
		// @08E: iload #7
		// @090: iconst_m1
		// @091: ixor
		// @092: getstatic int game.C_100255_pj.y
		// @095: iconst_m1
		// @096: ixor
		// @097: if_icmpge @0A3
		// @09A: iload #7
		// @09C: putstatic int game.C_100255_pj.y
		// @09F: goto @0A3
		// @0A2: athrow
		// @0A3: iload #7
		// @0A5: iconst_m1
		// @0A6: ixor
		// @0A7: getstatic int game.C_100161_sd.field_105426_b
		// @0AA: iconst_m1
		// @0AB: ixor
		// @0AC: if_icmple @0B8
		// @0AF: iload #7
		// @0B1: putstatic int game.C_100161_sd.field_105426_b
		// @0B4: goto @0B8
		// @0B7: athrow
		// @0B8: goto @10D
		// @0BB: astore #6
		// @0BD: aload #6
		// @0BF: new java.lang.StringBuilder
		// @0C2: dup
		// @0C3: invokespecial java.lang.StringBuilder.<init>()void
		// @0C6: getstatic java.lang.String[] game.C_100310_lj.field_100547_C
		// @0C9: iconst_0
		// @0CA: aaload
		// @0CB: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0CE: iload_0
		// @0CF: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0D2: bipush 44 (0x2C)
		// @0D4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0D7: iload_1
		// @0D8: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0DB: bipush 44 (0x2C)
		// @0DD: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0E0: iload_2
		// @0E1: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0E4: bipush 44 (0x2C)
		// @0E6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0E9: iload_3
		// @0EA: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0ED: bipush 44 (0x2C)
		// @0EF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0F2: iload #4
		// @0F4: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0F7: bipush 44 (0x2C)
		// @0F9: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0FC: iload #5
		// @0FE: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @101: bipush 41 (0x29)
		// @103: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @106: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @109: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @10C: athrow
		// @10D: return
	}
	
	public final void func_100362_a(boolean arg0, int arg1, int arg2, int arg3, C_100336_im arg4)
	{
		// @000: aload #5
		// @002: getfield boolean game.C_100336_im.field_102539_j
		// @005: ifne @016
		// @008: aload #5
		// @00A: bipush 97 (0x61)
		// @00C: invokevirtual game.C_100336_im.func_102515_d(byte)boolean
		// @00F: ifeq @01B
		// @012: goto @016
		// @015: athrow
		// @016: iconst_1
		// @017: goto @01C
		// @01A: athrow
		// @01B: iconst_0
		// @01C: istore #6
		// @01E: aload #5
		// @020: instanceof game.C_100218_am
		// @023: ifeq @031
		// @026: iload_1
		// @027: aload #5
		// @029: checkcast game.C_100218_am
		// @02C: getfield boolean game.C_100218_am.field_103113_L
		// @02F: iand
		// @030: istore_1
		// @031: iload_1
		// @032: ifeq @04D
		// @035: iload #6
		// @037: ifeq @046
		// @03A: goto @03E
		// @03D: athrow
		// @03E: aload_0
		// @03F: getfield int game.C_100310_lj.field_100544_v
		// @042: goto @051
		// @045: athrow
		// @046: aload_0
		// @047: getfield int game.C_100310_lj.field_100543_w
		// @04A: goto @051
		// @04D: aload_0
		// @04E: getfield int game.C_100310_lj.field_100545_A
		// @051: istore #7
		// @053: iload_1
		// @054: ifeq @05D
		// @057: ldc 16777215 (0xffffff)
		// @059: goto @05F
		// @05C: athrow
		// @05D: ldc 7105644 (0x6c6c6c)
		// @05F: istore #8
		// @061: bipush 51 (0x33)
		// @063: aload_0
		// @064: getfield game.C_100037_wb[] game.C_100310_lj.field_100549_y
		// @067: iload #7
		// @069: iload_3
		// @06A: aload #5
		// @06C: getfield int game.C_100336_im.field_102538_m
		// @06F: ineg
		// @070: isub
		// @071: aload #5
		// @073: getfield int game.C_100336_im.field_102541_w
		// @076: iload #4
		// @078: iadd
		// @079: aload #5
		// @07B: getfield int game.C_100336_im.field_102544_t
		// @07E: aload_0
		// @07F: getfield game.C_100037_wb[] game.C_100310_lj.field_100549_y
		// @082: iconst_0
		// @083: aaload
		// @084: getfield int game.C_100037_wb.field_102340_z
		// @087: isub
		// @088: ldc -242141503 (0xf19136c1)
		// @08A: ishr
		// @08B: ineg
		// @08C: isub
		// @08D: aload #5
		// @08F: getfield int game.C_100336_im.field_102537_l
		// @092: invokestatic game.C_100325_id.func_101474_a(byte, game.C_100037_wb[], int, int, int, int)void
		// @095: iload_2
		// @096: sipush -26568 (0x9838)
		// @099: if_icmpeq @0A8
		// @09C: aload_0
		// @09D: aconst_null
		// @09E: checkcast game.C_100037_wb[]
		// @0A1: putfield game.C_100037_wb[] game.C_100310_lj.field_100549_y
		// @0A4: goto @0A8
		// @0A7: athrow
		// @0A8: aload_0
		// @0A9: getfield game.C_100112_r game.C_100310_lj.field_100460_f
		// @0AC: aload #5
		// @0AE: getfield java.lang.String game.C_100336_im.field_102534_C
		// @0B1: iload_3
		// @0B2: aload #5
		// @0B4: getfield int game.C_100336_im.field_102538_m
		// @0B7: iadd
		// @0B8: bipush -2 (0xFE)
		// @0BA: iload #4
		// @0BC: aload #5
		// @0BE: getfield int game.C_100336_im.field_102541_w
		// @0C1: iadd
		// @0C2: iadd
		// @0C3: aload #5
		// @0C5: getfield int game.C_100336_im.field_102537_l
		// @0C8: aload #5
		// @0CA: getfield int game.C_100336_im.field_102544_t
		// @0CD: iload #8
		// @0CF: iconst_m1
		// @0D0: iconst_1
		// @0D1: iconst_1
		// @0D2: aload_0
		// @0D3: getfield game.C_100112_r game.C_100310_lj.field_100460_f
		// @0D6: getfield int game.C_100112_r.field_101772_Q
		// @0D9: invokevirtual game.C_100112_r.func_101729_a(java.lang.String, int, int, int, int, int, int, int, int, int)int
		// @0DC: pop
		// @0DD: goto @13C
		// @0E0: astore #6
		// @0E2: aload #6
		// @0E4: new java.lang.StringBuilder
		// @0E7: dup
		// @0E8: invokespecial java.lang.StringBuilder.<init>()void
		// @0EB: getstatic java.lang.String[] game.C_100310_lj.field_100547_C
		// @0EE: bipush 6 (0x06)
		// @0F0: aaload
		// @0F1: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0F4: iload_1
		// @0F5: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @0F8: bipush 44 (0x2C)
		// @0FA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0FD: iload_2
		// @0FE: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @101: bipush 44 (0x2C)
		// @103: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @106: iload_3
		// @107: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @10A: bipush 44 (0x2C)
		// @10C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @10F: iload #4
		// @111: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @114: bipush 44 (0x2C)
		// @116: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @119: aload #5
		// @11B: ifnull @128
		// @11E: getstatic java.lang.String[] game.C_100310_lj.field_100547_C
		// @121: bipush 7 (0x07)
		// @123: aaload
		// @124: goto @12D
		// @127: athrow
		// @128: getstatic java.lang.String[] game.C_100310_lj.field_100547_C
		// @12B: iconst_5
		// @12C: aaload
		// @12D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @130: bipush 41 (0x29)
		// @132: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @135: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @138: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @13B: athrow
		// @13C: return
	}
	
	private C_100310_lj(int arg0, int arg1, int arg2)
	{
		// @00: aload_0
		// @01: invokespecial game.C_100256_pk.<init>()void
		// @04: aload_0
		// @05: getstatic game.C_100112_r game.C_100185_rm.field_105484_d
		// @08: putfield game.C_100112_r game.C_100310_lj.field_100460_f
		// @0B: aload_0
		// @0C: getstatic game.C_100037_wb[] game.C_100103_eh.field_104664_d
		// @0F: putfield game.C_100037_wb[] game.C_100310_lj.field_100549_y
		// @12: aload_0
		// @13: iload_3
		// @14: putfield int game.C_100310_lj.field_100545_A
		// @17: aload_0
		// @18: iload_2
		// @19: putfield int game.C_100310_lj.field_100544_v
		// @1C: aload_0
		// @1D: iload_1
		// @1E: putfield int game.C_100310_lj.field_100543_w
		// @21: goto @59
		// @24: astore #4
		// @26: aload #4
		// @28: new java.lang.StringBuilder
		// @2B: dup
		// @2C: invokespecial java.lang.StringBuilder.<init>()void
		// @2F: getstatic java.lang.String[] game.C_100310_lj.field_100547_C
		// @32: iconst_1
		// @33: aaload
		// @34: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @37: iload_1
		// @38: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3B: bipush 44 (0x2C)
		// @3D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @40: iload_2
		// @41: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @44: bipush 44 (0x2C)
		// @46: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @49: iload_3
		// @4A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4D: bipush 41 (0x29)
		// @4F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @52: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @55: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @58: athrow
		// @59: return
	}
	
	static
	{
		// @000: bipush 8 (0x08)
		// @002: anewarray java.lang.String
		// @005: dup
		// @006: iconst_0
		// @007: ldc "4\u0019\u0018_i"
		// @009: invokestatic game.C_100310_lj.func_100541_z(java.lang.String)char[]
		// @00C: invokestatic game.C_100310_lj.func_100539_z(char[])java.lang.String
		// @00F: aastore
		// @010: dup
		// @011: iconst_1
		// @012: ldc "4\u0019\u0018&(6\u001aB$i"
		// @014: invokestatic game.C_100310_lj.func_100541_z(java.lang.String)char[]
		// @017: invokestatic game.C_100310_lj.func_100539_z(char[])java.lang.String
		// @01A: aastore
		// @01B: dup
		// @01C: iconst_2
		// @01D: ldc "4\u0019\u0018Xi"
		// @01F: invokestatic game.C_100310_lj.func_100541_z(java.lang.String)char[]
		// @022: invokestatic game.C_100310_lj.func_100539_z(char[])java.lang.String
		// @025: aastore
		// @026: dup
		// @027: iconst_3
		// @028: ldc "4\u0019\u0018[i"
		// @02A: invokestatic game.C_100310_lj.func_100541_z(java.lang.String)char[]
		// @02D: invokestatic game.C_100310_lj.func_100539_z(char[])java.lang.String
		// @030: aastore
		// @031: dup
		// @032: iconst_4
		// @033: ldc "4\u0019\u0018Yi"
		// @035: invokestatic game.C_100310_lj.func_100541_z(java.lang.String)char[]
		// @038: invokestatic game.C_100310_lj.func_100539_z(char[])java.lang.String
		// @03B: aastore
		// @03C: dup
		// @03D: iconst_5
		// @03E: ldc "6\u0006Zv"
		// @040: invokestatic game.C_100310_lj.func_100541_z(java.lang.String)char[]
		// @043: invokestatic game.C_100310_lj.func_100539_z(char[])java.lang.String
		// @046: aastore
		// @047: dup
		// @048: bipush 6 (0x06)
		// @04A: ldc "4\u0019\u0018^i"
		// @04C: invokestatic game.C_100310_lj.func_100541_z(java.lang.String)char[]
		// @04F: invokestatic game.C_100310_lj.func_100539_z(char[])java.lang.String
		// @052: aastore
		// @053: dup
		// @054: bipush 7 (0x07)
		// @056: ldc "#]\u00184<"
		// @058: invokestatic game.C_100310_lj.func_100541_z(java.lang.String)char[]
		// @05B: invokestatic game.C_100310_lj.func_100539_z(char[])java.lang.String
		// @05E: aastore
		// @05F: putstatic java.lang.String[] game.C_100310_lj.field_100547_C
		// @062: sipush 521 (0x0209)
		// @065: newarray int[]
		// @067: dup
		// @068: iconst_0
		// @069: iconst_m1
		// @06A: iastore
		// @06B: dup
		// @06C: iconst_1
		// @06D: iconst_m1
		// @06E: iastore
		// @06F: dup
		// @070: iconst_2
		// @071: iconst_m1
		// @072: iastore
		// @073: dup
		// @074: iconst_3
		// @075: iconst_m1
		// @076: iastore
		// @077: dup
		// @078: iconst_4
		// @079: iconst_m1
		// @07A: iastore
		// @07B: dup
		// @07C: iconst_5
		// @07D: iconst_m1
		// @07E: iastore
		// @07F: dup
		// @080: bipush 6 (0x06)
		// @082: iconst_m1
		// @083: iastore
		// @084: dup
		// @085: bipush 7 (0x07)
		// @087: iconst_m1
		// @088: iastore
		// @089: dup
		// @08A: bipush 8 (0x08)
		// @08C: bipush 85 (0x55)
		// @08E: iastore
		// @08F: dup
		// @090: bipush 9 (0x09)
		// @092: bipush 80 (0x50)
		// @094: iastore
		// @095: dup
		// @096: bipush 10 (0x0A)
		// @098: bipush 84 (0x54)
		// @09A: iastore
		// @09B: dup
		// @09C: bipush 11 (0x0B)
		// @09E: iconst_m1
		// @09F: iastore
		// @0A0: dup
		// @0A1: bipush 12 (0x0C)
		// @0A3: bipush 91 (0x5B)
		// @0A5: iastore
		// @0A6: dup
		// @0A7: bipush 13 (0x0D)
		// @0A9: iconst_m1
		// @0AA: iastore
		// @0AB: dup
		// @0AC: bipush 14 (0x0E)
		// @0AE: iconst_m1
		// @0AF: iastore
		// @0B0: dup
		// @0B1: bipush 15 (0x0F)
		// @0B3: iconst_m1
		// @0B4: iastore
		// @0B5: dup
		// @0B6: bipush 16 (0x10)
		// @0B8: bipush 81 (0x51)
		// @0BA: iastore
		// @0BB: dup
		// @0BC: bipush 17 (0x11)
		// @0BE: bipush 82 (0x52)
		// @0C0: iastore
		// @0C1: dup
		// @0C2: bipush 18 (0x12)
		// @0C4: bipush 86 (0x56)
		// @0C6: iastore
		// @0C7: dup
		// @0C8: bipush 19 (0x13)
		// @0CA: iconst_m1
		// @0CB: iastore
		// @0CC: dup
		// @0CD: bipush 20 (0x14)
		// @0CF: iconst_m1
		// @0D0: iastore
		// @0D1: dup
		// @0D2: bipush 21 (0x15)
		// @0D4: iconst_m1
		// @0D5: iastore
		// @0D6: dup
		// @0D7: bipush 22 (0x16)
		// @0D9: iconst_m1
		// @0DA: iastore
		// @0DB: dup
		// @0DC: bipush 23 (0x17)
		// @0DE: iconst_m1
		// @0DF: iastore
		// @0E0: dup
		// @0E1: bipush 24 (0x18)
		// @0E3: iconst_m1
		// @0E4: iastore
		// @0E5: dup
		// @0E6: bipush 25 (0x19)
		// @0E8: iconst_m1
		// @0E9: iastore
		// @0EA: dup
		// @0EB: bipush 26 (0x1A)
		// @0ED: iconst_m1
		// @0EE: iastore
		// @0EF: dup
		// @0F0: bipush 27 (0x1B)
		// @0F2: bipush 13 (0x0D)
		// @0F4: iastore
		// @0F5: dup
		// @0F6: bipush 28 (0x1C)
		// @0F8: iconst_m1
		// @0F9: iastore
		// @0FA: dup
		// @0FB: bipush 29 (0x1D)
		// @0FD: iconst_m1
		// @0FE: iastore
		// @0FF: dup
		// @100: bipush 30 (0x1E)
		// @102: iconst_m1
		// @103: iastore
		// @104: dup
		// @105: bipush 31 (0x1F)
		// @107: iconst_m1
		// @108: iastore
		// @109: dup
		// @10A: bipush 32 (0x20)
		// @10C: bipush 83 (0x53)
		// @10E: iastore
		// @10F: dup
		// @110: bipush 33 (0x21)
		// @112: bipush 104 (0x68)
		// @114: iastore
		// @115: dup
		// @116: bipush 34 (0x22)
		// @118: bipush 105 (0x69)
		// @11A: iastore
		// @11B: dup
		// @11C: bipush 35 (0x23)
		// @11E: bipush 103 (0x67)
		// @120: iastore
		// @121: dup
		// @122: bipush 36 (0x24)
		// @124: bipush 102 (0x66)
		// @126: iastore
		// @127: dup
		// @128: bipush 37 (0x25)
		// @12A: bipush 96 (0x60)
		// @12C: iastore
		// @12D: dup
		// @12E: bipush 38 (0x26)
		// @130: bipush 98 (0x62)
		// @132: iastore
		// @133: dup
		// @134: bipush 39 (0x27)
		// @136: bipush 97 (0x61)
		// @138: iastore
		// @139: dup
		// @13A: bipush 40 (0x28)
		// @13C: bipush 99 (0x63)
		// @13E: iastore
		// @13F: dup
		// @140: bipush 41 (0x29)
		// @142: iconst_m1
		// @143: iastore
		// @144: dup
		// @145: bipush 42 (0x2A)
		// @147: iconst_m1
		// @148: iastore
		// @149: dup
		// @14A: bipush 43 (0x2B)
		// @14C: iconst_m1
		// @14D: iastore
		// @14E: dup
		// @14F: bipush 44 (0x2C)
		// @151: iconst_m1
		// @152: iastore
		// @153: dup
		// @154: bipush 45 (0x2D)
		// @156: iconst_m1
		// @157: iastore
		// @158: dup
		// @159: bipush 46 (0x2E)
		// @15B: iconst_m1
		// @15C: iastore
		// @15D: dup
		// @15E: bipush 47 (0x2F)
		// @160: iconst_m1
		// @161: iastore
		// @162: dup
		// @163: bipush 48 (0x30)
		// @165: bipush 25 (0x19)
		// @167: iastore
		// @168: dup
		// @169: bipush 49 (0x31)
		// @16B: bipush 16 (0x10)
		// @16D: iastore
		// @16E: dup
		// @16F: bipush 50 (0x32)
		// @171: bipush 17 (0x11)
		// @173: iastore
		// @174: dup
		// @175: bipush 51 (0x33)
		// @177: bipush 18 (0x12)
		// @179: iastore
		// @17A: dup
		// @17B: bipush 52 (0x34)
		// @17D: bipush 19 (0x13)
		// @17F: iastore
		// @180: dup
		// @181: bipush 53 (0x35)
		// @183: bipush 20 (0x14)
		// @185: iastore
		// @186: dup
		// @187: bipush 54 (0x36)
		// @189: bipush 21 (0x15)
		// @18B: iastore
		// @18C: dup
		// @18D: bipush 55 (0x37)
		// @18F: bipush 22 (0x16)
		// @191: iastore
		// @192: dup
		// @193: bipush 56 (0x38)
		// @195: bipush 23 (0x17)
		// @197: iastore
		// @198: dup
		// @199: bipush 57 (0x39)
		// @19B: bipush 24 (0x18)
		// @19D: iastore
		// @19E: dup
		// @19F: bipush 58 (0x3A)
		// @1A1: iconst_m1
		// @1A2: iastore
		// @1A3: dup
		// @1A4: bipush 59 (0x3B)
		// @1A6: iconst_m1
		// @1A7: iastore
		// @1A8: dup
		// @1A9: bipush 60 (0x3C)
		// @1AB: iconst_m1
		// @1AC: iastore
		// @1AD: dup
		// @1AE: bipush 61 (0x3D)
		// @1B0: iconst_m1
		// @1B1: iastore
		// @1B2: dup
		// @1B3: bipush 62 (0x3E)
		// @1B5: iconst_m1
		// @1B6: iastore
		// @1B7: dup
		// @1B8: bipush 63 (0x3F)
		// @1BA: iconst_m1
		// @1BB: iastore
		// @1BC: dup
		// @1BD: bipush 64 (0x40)
		// @1BF: iconst_m1
		// @1C0: iastore
		// @1C1: dup
		// @1C2: bipush 65 (0x41)
		// @1C4: bipush 48 (0x30)
		// @1C6: iastore
		// @1C7: dup
		// @1C8: bipush 66 (0x42)
		// @1CA: bipush 68 (0x44)
		// @1CC: iastore
		// @1CD: dup
		// @1CE: bipush 67 (0x43)
		// @1D0: bipush 66 (0x42)
		// @1D2: iastore
		// @1D3: dup
		// @1D4: bipush 68 (0x44)
		// @1D6: bipush 50 (0x32)
		// @1D8: iastore
		// @1D9: dup
		// @1DA: bipush 69 (0x45)
		// @1DC: bipush 34 (0x22)
		// @1DE: iastore
		// @1DF: dup
		// @1E0: bipush 70 (0x46)
		// @1E2: bipush 51 (0x33)
		// @1E4: iastore
		// @1E5: dup
		// @1E6: bipush 71 (0x47)
		// @1E8: bipush 52 (0x34)
		// @1EA: iastore
		// @1EB: dup
		// @1EC: bipush 72 (0x48)
		// @1EE: bipush 53 (0x35)
		// @1F0: iastore
		// @1F1: dup
		// @1F2: bipush 73 (0x49)
		// @1F4: bipush 39 (0x27)
		// @1F6: iastore
		// @1F7: dup
		// @1F8: bipush 74 (0x4A)
		// @1FA: bipush 54 (0x36)
		// @1FC: iastore
		// @1FD: dup
		// @1FE: bipush 75 (0x4B)
		// @200: bipush 55 (0x37)
		// @202: iastore
		// @203: dup
		// @204: bipush 76 (0x4C)
		// @206: bipush 56 (0x38)
		// @208: iastore
		// @209: dup
		// @20A: bipush 77 (0x4D)
		// @20C: bipush 70 (0x46)
		// @20E: iastore
		// @20F: dup
		// @210: bipush 78 (0x4E)
		// @212: bipush 69 (0x45)
		// @214: iastore
		// @215: dup
		// @216: bipush 79 (0x4F)
		// @218: bipush 40 (0x28)
		// @21A: iastore
		// @21B: dup
		// @21C: bipush 80 (0x50)
		// @21E: bipush 41 (0x29)
		// @220: iastore
		// @221: dup
		// @222: bipush 81 (0x51)
		// @224: bipush 32 (0x20)
		// @226: iastore
		// @227: dup
		// @228: bipush 82 (0x52)
		// @22A: bipush 35 (0x23)
		// @22C: iastore
		// @22D: dup
		// @22E: bipush 83 (0x53)
		// @230: bipush 49 (0x31)
		// @232: iastore
		// @233: dup
		// @234: bipush 84 (0x54)
		// @236: bipush 36 (0x24)
		// @238: iastore
		// @239: dup
		// @23A: bipush 85 (0x55)
		// @23C: bipush 38 (0x26)
		// @23E: iastore
		// @23F: dup
		// @240: bipush 86 (0x56)
		// @242: bipush 67 (0x43)
		// @244: iastore
		// @245: dup
		// @246: bipush 87 (0x57)
		// @248: bipush 33 (0x21)
		// @24A: iastore
		// @24B: dup
		// @24C: bipush 88 (0x58)
		// @24E: bipush 65 (0x41)
		// @250: iastore
		// @251: dup
		// @252: bipush 89 (0x59)
		// @254: bipush 37 (0x25)
		// @256: iastore
		// @257: dup
		// @258: bipush 90 (0x5A)
		// @25A: bipush 64 (0x40)
		// @25C: iastore
		// @25D: dup
		// @25E: bipush 91 (0x5B)
		// @260: iconst_m1
		// @261: iastore
		// @262: dup
		// @263: bipush 92 (0x5C)
		// @265: iconst_m1
		// @266: iastore
		// @267: dup
		// @268: bipush 93 (0x5D)
		// @26A: iconst_m1
		// @26B: iastore
		// @26C: dup
		// @26D: bipush 94 (0x5E)
		// @26F: iconst_m1
		// @270: iastore
		// @271: dup
		// @272: bipush 95 (0x5F)
		// @274: iconst_m1
		// @275: iastore
		// @276: dup
		// @277: bipush 96 (0x60)
		// @279: sipush 228 (0x00E4)
		// @27C: iastore
		// @27D: dup
		// @27E: bipush 97 (0x61)
		// @280: sipush 231 (0x00E7)
		// @283: iastore
		// @284: dup
		// @285: bipush 98 (0x62)
		// @287: sipush 227 (0x00E3)
		// @28A: iastore
		// @28B: dup
		// @28C: bipush 99 (0x63)
		// @28E: sipush 233 (0x00E9)
		// @291: iastore
		// @292: dup
		// @293: bipush 100 (0x64)
		// @295: sipush 224 (0x00E0)
		// @298: iastore
		// @299: dup
		// @29A: bipush 101 (0x65)
		// @29C: sipush 219 (0x00DB)
		// @29F: iastore
		// @2A0: dup
		// @2A1: bipush 102 (0x66)
		// @2A3: sipush 225 (0x00E1)
		// @2A6: iastore
		// @2A7: dup
		// @2A8: bipush 103 (0x67)
		// @2AA: sipush 230 (0x00E6)
		// @2AD: iastore
		// @2AE: dup
		// @2AF: bipush 104 (0x68)
		// @2B1: sipush 226 (0x00E2)
		// @2B4: iastore
		// @2B5: dup
		// @2B6: bipush 105 (0x69)
		// @2B8: sipush 232 (0x00E8)
		// @2BB: iastore
		// @2BC: dup
		// @2BD: bipush 106 (0x6A)
		// @2BF: bipush 89 (0x59)
		// @2C1: iastore
		// @2C2: dup
		// @2C3: bipush 107 (0x6B)
		// @2C5: bipush 87 (0x57)
		// @2C7: iastore
		// @2C8: dup
		// @2C9: bipush 108 (0x6C)
		// @2CB: iconst_m1
		// @2CC: iastore
		// @2CD: dup
		// @2CE: bipush 109 (0x6D)
		// @2D0: bipush 88 (0x58)
		// @2D2: iastore
		// @2D3: dup
		// @2D4: bipush 110 (0x6E)
		// @2D6: sipush 229 (0x00E5)
		// @2D9: iastore
		// @2DA: dup
		// @2DB: bipush 111 (0x6F)
		// @2DD: bipush 90 (0x5A)
		// @2DF: iastore
		// @2E0: dup
		// @2E1: bipush 112 (0x70)
		// @2E3: iconst_1
		// @2E4: iastore
		// @2E5: dup
		// @2E6: bipush 113 (0x71)
		// @2E8: iconst_2
		// @2E9: iastore
		// @2EA: dup
		// @2EB: bipush 114 (0x72)
		// @2ED: iconst_3
		// @2EE: iastore
		// @2EF: dup
		// @2F0: bipush 115 (0x73)
		// @2F2: iconst_4
		// @2F3: iastore
		// @2F4: dup
		// @2F5: bipush 116 (0x74)
		// @2F7: iconst_5
		// @2F8: iastore
		// @2F9: dup
		// @2FA: bipush 117 (0x75)
		// @2FC: bipush 6 (0x06)
		// @2FE: iastore
		// @2FF: dup
		// @300: bipush 118 (0x76)
		// @302: bipush 7 (0x07)
		// @304: iastore
		// @305: dup
		// @306: bipush 119 (0x77)
		// @308: bipush 8 (0x08)
		// @30A: iastore
		// @30B: dup
		// @30C: bipush 120 (0x78)
		// @30E: bipush 9 (0x09)
		// @310: iastore
		// @311: dup
		// @312: bipush 121 (0x79)
		// @314: bipush 10 (0x0A)
		// @316: iastore
		// @317: dup
		// @318: bipush 122 (0x7A)
		// @31A: bipush 11 (0x0B)
		// @31C: iastore
		// @31D: dup
		// @31E: bipush 123 (0x7B)
		// @320: bipush 12 (0x0C)
		// @322: iastore
		// @323: dup
		// @324: bipush 124 (0x7C)
		// @326: iconst_m1
		// @327: iastore
		// @328: dup
		// @329: bipush 125 (0x7D)
		// @32B: iconst_m1
		// @32C: iastore
		// @32D: dup
		// @32E: bipush 126 (0x7E)
		// @330: iconst_m1
		// @331: iastore
		// @332: dup
		// @333: bipush 127 (0x7F)
		// @335: bipush 101 (0x65)
		// @337: iastore
		// @338: dup
		// @339: sipush 128 (0x0080)
		// @33C: iconst_m1
		// @33D: iastore
		// @33E: dup
		// @33F: sipush 129 (0x0081)
		// @342: iconst_m1
		// @343: iastore
		// @344: dup
		// @345: sipush 130 (0x0082)
		// @348: iconst_m1
		// @349: iastore
		// @34A: dup
		// @34B: sipush 131 (0x0083)
		// @34E: iconst_m1
		// @34F: iastore
		// @350: dup
		// @351: sipush 132 (0x0084)
		// @354: iconst_m1
		// @355: iastore
		// @356: dup
		// @357: sipush 133 (0x0085)
		// @35A: iconst_m1
		// @35B: iastore
		// @35C: dup
		// @35D: sipush 134 (0x0086)
		// @360: iconst_m1
		// @361: iastore
		// @362: dup
		// @363: sipush 135 (0x0087)
		// @366: iconst_m1
		// @367: iastore
		// @368: dup
		// @369: sipush 136 (0x0088)
		// @36C: iconst_m1
		// @36D: iastore
		// @36E: dup
		// @36F: sipush 137 (0x0089)
		// @372: iconst_m1
		// @373: iastore
		// @374: dup
		// @375: sipush 138 (0x008A)
		// @378: iconst_m1
		// @379: iastore
		// @37A: dup
		// @37B: sipush 139 (0x008B)
		// @37E: iconst_m1
		// @37F: iastore
		// @380: dup
		// @381: sipush 140 (0x008C)
		// @384: iconst_m1
		// @385: iastore
		// @386: dup
		// @387: sipush 141 (0x008D)
		// @38A: iconst_m1
		// @38B: iastore
		// @38C: dup
		// @38D: sipush 142 (0x008E)
		// @390: iconst_m1
		// @391: iastore
		// @392: dup
		// @393: sipush 143 (0x008F)
		// @396: iconst_m1
		// @397: iastore
		// @398: dup
		// @399: sipush 144 (0x0090)
		// @39C: iconst_m1
		// @39D: iastore
		// @39E: dup
		// @39F: sipush 145 (0x0091)
		// @3A2: iconst_m1
		// @3A3: iastore
		// @3A4: dup
		// @3A5: sipush 146 (0x0092)
		// @3A8: iconst_m1
		// @3A9: iastore
		// @3AA: dup
		// @3AB: sipush 147 (0x0093)
		// @3AE: iconst_m1
		// @3AF: iastore
		// @3B0: dup
		// @3B1: sipush 148 (0x0094)
		// @3B4: iconst_m1
		// @3B5: iastore
		// @3B6: dup
		// @3B7: sipush 149 (0x0095)
		// @3BA: iconst_m1
		// @3BB: iastore
		// @3BC: dup
		// @3BD: sipush 150 (0x0096)
		// @3C0: iconst_m1
		// @3C1: iastore
		// @3C2: dup
		// @3C3: sipush 151 (0x0097)
		// @3C6: iconst_m1
		// @3C7: iastore
		// @3C8: dup
		// @3C9: sipush 152 (0x0098)
		// @3CC: iconst_m1
		// @3CD: iastore
		// @3CE: dup
		// @3CF: sipush 153 (0x0099)
		// @3D2: iconst_m1
		// @3D3: iastore
		// @3D4: dup
		// @3D5: sipush 154 (0x009A)
		// @3D8: iconst_m1
		// @3D9: iastore
		// @3DA: dup
		// @3DB: sipush 155 (0x009B)
		// @3DE: bipush 100 (0x64)
		// @3E0: iastore
		// @3E1: dup
		// @3E2: sipush 156 (0x009C)
		// @3E5: iconst_m1
		// @3E6: iastore
		// @3E7: dup
		// @3E8: sipush 157 (0x009D)
		// @3EB: iconst_m1
		// @3EC: iastore
		// @3ED: dup
		// @3EE: sipush 158 (0x009E)
		// @3F1: iconst_m1
		// @3F2: iastore
		// @3F3: dup
		// @3F4: sipush 159 (0x009F)
		// @3F7: iconst_m1
		// @3F8: iastore
		// @3F9: dup
		// @3FA: sipush 160 (0x00A0)
		// @3FD: iconst_m1
		// @3FE: iastore
		// @3FF: dup
		// @400: sipush 161 (0x00A1)
		// @403: iconst_m1
		// @404: iastore
		// @405: dup
		// @406: sipush 162 (0x00A2)
		// @409: iconst_m1
		// @40A: iastore
		// @40B: dup
		// @40C: sipush 163 (0x00A3)
		// @40F: iconst_m1
		// @410: iastore
		// @411: dup
		// @412: sipush 164 (0x00A4)
		// @415: iconst_m1
		// @416: iastore
		// @417: dup
		// @418: sipush 165 (0x00A5)
		// @41B: iconst_m1
		// @41C: iastore
		// @41D: dup
		// @41E: sipush 166 (0x00A6)
		// @421: iconst_m1
		// @422: iastore
		// @423: dup
		// @424: sipush 167 (0x00A7)
		// @427: iconst_m1
		// @428: iastore
		// @429: dup
		// @42A: sipush 168 (0x00A8)
		// @42D: iconst_m1
		// @42E: iastore
		// @42F: dup
		// @430: sipush 169 (0x00A9)
		// @433: iconst_m1
		// @434: iastore
		// @435: dup
		// @436: sipush 170 (0x00AA)
		// @439: iconst_m1
		// @43A: iastore
		// @43B: dup
		// @43C: sipush 171 (0x00AB)
		// @43F: iconst_m1
		// @440: iastore
		// @441: dup
		// @442: sipush 172 (0x00AC)
		// @445: iconst_m1
		// @446: iastore
		// @447: dup
		// @448: sipush 173 (0x00AD)
		// @44B: iconst_m1
		// @44C: iastore
		// @44D: dup
		// @44E: sipush 174 (0x00AE)
		// @451: iconst_m1
		// @452: iastore
		// @453: dup
		// @454: sipush 175 (0x00AF)
		// @457: iconst_m1
		// @458: iastore
		// @459: dup
		// @45A: sipush 176 (0x00B0)
		// @45D: iconst_m1
		// @45E: iastore
		// @45F: dup
		// @460: sipush 177 (0x00B1)
		// @463: iconst_m1
		// @464: iastore
		// @465: dup
		// @466: sipush 178 (0x00B2)
		// @469: iconst_m1
		// @46A: iastore
		// @46B: dup
		// @46C: sipush 179 (0x00B3)
		// @46F: iconst_m1
		// @470: iastore
		// @471: dup
		// @472: sipush 180 (0x00B4)
		// @475: iconst_m1
		// @476: iastore
		// @477: dup
		// @478: sipush 181 (0x00B5)
		// @47B: iconst_m1
		// @47C: iastore
		// @47D: dup
		// @47E: sipush 182 (0x00B6)
		// @481: iconst_m1
		// @482: iastore
		// @483: dup
		// @484: sipush 183 (0x00B7)
		// @487: iconst_m1
		// @488: iastore
		// @489: dup
		// @48A: sipush 184 (0x00B8)
		// @48D: iconst_m1
		// @48E: iastore
		// @48F: dup
		// @490: sipush 185 (0x00B9)
		// @493: iconst_m1
		// @494: iastore
		// @495: dup
		// @496: sipush 186 (0x00BA)
		// @499: iconst_m1
		// @49A: iastore
		// @49B: dup
		// @49C: sipush 187 (0x00BB)
		// @49F: iconst_m1
		// @4A0: iastore
		// @4A1: dup
		// @4A2: sipush 188 (0x00BC)
		// @4A5: iconst_m1
		// @4A6: iastore
		// @4A7: dup
		// @4A8: sipush 189 (0x00BD)
		// @4AB: iconst_m1
		// @4AC: iastore
		// @4AD: dup
		// @4AE: sipush 190 (0x00BE)
		// @4B1: iconst_m1
		// @4B2: iastore
		// @4B3: dup
		// @4B4: sipush 191 (0x00BF)
		// @4B7: iconst_m1
		// @4B8: iastore
		// @4B9: dup
		// @4BA: sipush 192 (0x00C0)
		// @4BD: iconst_m1
		// @4BE: iastore
		// @4BF: dup
		// @4C0: sipush 193 (0x00C1)
		// @4C3: iconst_m1
		// @4C4: iastore
		// @4C5: dup
		// @4C6: sipush 194 (0x00C2)
		// @4C9: iconst_m1
		// @4CA: iastore
		// @4CB: dup
		// @4CC: sipush 195 (0x00C3)
		// @4CF: iconst_m1
		// @4D0: iastore
		// @4D1: dup
		// @4D2: sipush 196 (0x00C4)
		// @4D5: iconst_m1
		// @4D6: iastore
		// @4D7: dup
		// @4D8: sipush 197 (0x00C5)
		// @4DB: iconst_m1
		// @4DC: iastore
		// @4DD: dup
		// @4DE: sipush 198 (0x00C6)
		// @4E1: iconst_m1
		// @4E2: iastore
		// @4E3: dup
		// @4E4: sipush 199 (0x00C7)
		// @4E7: iconst_m1
		// @4E8: iastore
		// @4E9: dup
		// @4EA: sipush 200 (0x00C8)
		// @4ED: iconst_m1
		// @4EE: iastore
		// @4EF: dup
		// @4F0: sipush 201 (0x00C9)
		// @4F3: iconst_m1
		// @4F4: iastore
		// @4F5: dup
		// @4F6: sipush 202 (0x00CA)
		// @4F9: iconst_m1
		// @4FA: iastore
		// @4FB: dup
		// @4FC: sipush 203 (0x00CB)
		// @4FF: iconst_m1
		// @500: iastore
		// @501: dup
		// @502: sipush 204 (0x00CC)
		// @505: iconst_m1
		// @506: iastore
		// @507: dup
		// @508: sipush 205 (0x00CD)
		// @50B: iconst_m1
		// @50C: iastore
		// @50D: dup
		// @50E: sipush 206 (0x00CE)
		// @511: iconst_m1
		// @512: iastore
		// @513: dup
		// @514: sipush 207 (0x00CF)
		// @517: iconst_m1
		// @518: iastore
		// @519: dup
		// @51A: sipush 208 (0x00D0)
		// @51D: iconst_m1
		// @51E: iastore
		// @51F: dup
		// @520: sipush 209 (0x00D1)
		// @523: iconst_m1
		// @524: iastore
		// @525: dup
		// @526: sipush 210 (0x00D2)
		// @529: iconst_m1
		// @52A: iastore
		// @52B: dup
		// @52C: sipush 211 (0x00D3)
		// @52F: iconst_m1
		// @530: iastore
		// @531: dup
		// @532: sipush 212 (0x00D4)
		// @535: iconst_m1
		// @536: iastore
		// @537: dup
		// @538: sipush 213 (0x00D5)
		// @53B: iconst_m1
		// @53C: iastore
		// @53D: dup
		// @53E: sipush 214 (0x00D6)
		// @541: iconst_m1
		// @542: iastore
		// @543: dup
		// @544: sipush 215 (0x00D7)
		// @547: iconst_m1
		// @548: iastore
		// @549: dup
		// @54A: sipush 216 (0x00D8)
		// @54D: iconst_m1
		// @54E: iastore
		// @54F: dup
		// @550: sipush 217 (0x00D9)
		// @553: iconst_m1
		// @554: iastore
		// @555: dup
		// @556: sipush 218 (0x00DA)
		// @559: iconst_m1
		// @55A: iastore
		// @55B: dup
		// @55C: sipush 219 (0x00DB)
		// @55F: iconst_m1
		// @560: iastore
		// @561: dup
		// @562: sipush 220 (0x00DC)
		// @565: iconst_m1
		// @566: iastore
		// @567: dup
		// @568: sipush 221 (0x00DD)
		// @56B: iconst_m1
		// @56C: iastore
		// @56D: dup
		// @56E: sipush 222 (0x00DE)
		// @571: iconst_m1
		// @572: iastore
		// @573: dup
		// @574: sipush 223 (0x00DF)
		// @577: iconst_m1
		// @578: iastore
		// @579: dup
		// @57A: sipush 224 (0x00E0)
		// @57D: iconst_m1
		// @57E: iastore
		// @57F: dup
		// @580: sipush 225 (0x00E1)
		// @583: iconst_m1
		// @584: iastore
		// @585: dup
		// @586: sipush 226 (0x00E2)
		// @589: iconst_m1
		// @58A: iastore
		// @58B: dup
		// @58C: sipush 227 (0x00E3)
		// @58F: iconst_m1
		// @590: iastore
		// @591: dup
		// @592: sipush 228 (0x00E4)
		// @595: iconst_m1
		// @596: iastore
		// @597: dup
		// @598: sipush 229 (0x00E5)
		// @59B: iconst_m1
		// @59C: iastore
		// @59D: dup
		// @59E: sipush 230 (0x00E6)
		// @5A1: iconst_m1
		// @5A2: iastore
		// @5A3: dup
		// @5A4: sipush 231 (0x00E7)
		// @5A7: iconst_m1
		// @5A8: iastore
		// @5A9: dup
		// @5AA: sipush 232 (0x00E8)
		// @5AD: iconst_m1
		// @5AE: iastore
		// @5AF: dup
		// @5B0: sipush 233 (0x00E9)
		// @5B3: iconst_m1
		// @5B4: iastore
		// @5B5: dup
		// @5B6: sipush 234 (0x00EA)
		// @5B9: iconst_m1
		// @5BA: iastore
		// @5BB: dup
		// @5BC: sipush 235 (0x00EB)
		// @5BF: iconst_m1
		// @5C0: iastore
		// @5C1: dup
		// @5C2: sipush 236 (0x00EC)
		// @5C5: iconst_m1
		// @5C6: iastore
		// @5C7: dup
		// @5C8: sipush 237 (0x00ED)
		// @5CB: iconst_m1
		// @5CC: iastore
		// @5CD: dup
		// @5CE: sipush 238 (0x00EE)
		// @5D1: iconst_m1
		// @5D2: iastore
		// @5D3: dup
		// @5D4: sipush 239 (0x00EF)
		// @5D7: iconst_m1
		// @5D8: iastore
		// @5D9: dup
		// @5DA: sipush 240 (0x00F0)
		// @5DD: iconst_m1
		// @5DE: iastore
		// @5DF: dup
		// @5E0: sipush 241 (0x00F1)
		// @5E3: iconst_m1
		// @5E4: iastore
		// @5E5: dup
		// @5E6: sipush 242 (0x00F2)
		// @5E9: iconst_m1
		// @5EA: iastore
		// @5EB: dup
		// @5EC: sipush 243 (0x00F3)
		// @5EF: iconst_m1
		// @5F0: iastore
		// @5F1: dup
		// @5F2: sipush 244 (0x00F4)
		// @5F5: iconst_m1
		// @5F6: iastore
		// @5F7: dup
		// @5F8: sipush 245 (0x00F5)
		// @5FB: iconst_m1
		// @5FC: iastore
		// @5FD: dup
		// @5FE: sipush 246 (0x00F6)
		// @601: iconst_m1
		// @602: iastore
		// @603: dup
		// @604: sipush 247 (0x00F7)
		// @607: iconst_m1
		// @608: iastore
		// @609: dup
		// @60A: sipush 248 (0x00F8)
		// @60D: iconst_m1
		// @60E: iastore
		// @60F: dup
		// @610: sipush 249 (0x00F9)
		// @613: iconst_m1
		// @614: iastore
		// @615: dup
		// @616: sipush 250 (0x00FA)
		// @619: iconst_m1
		// @61A: iastore
		// @61B: dup
		// @61C: sipush 251 (0x00FB)
		// @61F: iconst_m1
		// @620: iastore
		// @621: dup
		// @622: sipush 252 (0x00FC)
		// @625: iconst_m1
		// @626: iastore
		// @627: dup
		// @628: sipush 253 (0x00FD)
		// @62B: iconst_m1
		// @62C: iastore
		// @62D: dup
		// @62E: sipush 254 (0x00FE)
		// @631: iconst_m1
		// @632: iastore
		// @633: dup
		// @634: sipush 255 (0x00FF)
		// @637: iconst_m1
		// @638: iastore
		// @639: dup
		// @63A: sipush 256 (0x0100)
		// @63D: iconst_m1
		// @63E: iastore
		// @63F: dup
		// @640: sipush 257 (0x0101)
		// @643: iconst_m1
		// @644: iastore
		// @645: dup
		// @646: sipush 258 (0x0102)
		// @649: iconst_m1
		// @64A: iastore
		// @64B: dup
		// @64C: sipush 259 (0x0103)
		// @64F: iconst_m1
		// @650: iastore
		// @651: dup
		// @652: sipush 260 (0x0104)
		// @655: iconst_m1
		// @656: iastore
		// @657: dup
		// @658: sipush 261 (0x0105)
		// @65B: iconst_m1
		// @65C: iastore
		// @65D: dup
		// @65E: sipush 262 (0x0106)
		// @661: iconst_m1
		// @662: iastore
		// @663: dup
		// @664: sipush 263 (0x0107)
		// @667: iconst_m1
		// @668: iastore
		// @669: dup
		// @66A: sipush 264 (0x0108)
		// @66D: iconst_m1
		// @66E: iastore
		// @66F: dup
		// @670: sipush 265 (0x0109)
		// @673: iconst_m1
		// @674: iastore
		// @675: dup
		// @676: sipush 266 (0x010A)
		// @679: iconst_m1
		// @67A: iastore
		// @67B: dup
		// @67C: sipush 267 (0x010B)
		// @67F: iconst_m1
		// @680: iastore
		// @681: dup
		// @682: sipush 268 (0x010C)
		// @685: iconst_m1
		// @686: iastore
		// @687: dup
		// @688: sipush 269 (0x010D)
		// @68B: iconst_m1
		// @68C: iastore
		// @68D: dup
		// @68E: sipush 270 (0x010E)
		// @691: iconst_m1
		// @692: iastore
		// @693: dup
		// @694: sipush 271 (0x010F)
		// @697: iconst_m1
		// @698: iastore
		// @699: dup
		// @69A: sipush 272 (0x0110)
		// @69D: iconst_m1
		// @69E: iastore
		// @69F: dup
		// @6A0: sipush 273 (0x0111)
		// @6A3: iconst_m1
		// @6A4: iastore
		// @6A5: dup
		// @6A6: sipush 274 (0x0112)
		// @6A9: iconst_m1
		// @6AA: iastore
		// @6AB: dup
		// @6AC: sipush 275 (0x0113)
		// @6AF: iconst_m1
		// @6B0: iastore
		// @6B1: dup
		// @6B2: sipush 276 (0x0114)
		// @6B5: iconst_m1
		// @6B6: iastore
		// @6B7: dup
		// @6B8: sipush 277 (0x0115)
		// @6BB: iconst_m1
		// @6BC: iastore
		// @6BD: dup
		// @6BE: sipush 278 (0x0116)
		// @6C1: iconst_m1
		// @6C2: iastore
		// @6C3: dup
		// @6C4: sipush 279 (0x0117)
		// @6C7: iconst_m1
		// @6C8: iastore
		// @6C9: dup
		// @6CA: sipush 280 (0x0118)
		// @6CD: iconst_m1
		// @6CE: iastore
		// @6CF: dup
		// @6D0: sipush 281 (0x0119)
		// @6D3: iconst_m1
		// @6D4: iastore
		// @6D5: dup
		// @6D6: sipush 282 (0x011A)
		// @6D9: iconst_m1
		// @6DA: iastore
		// @6DB: dup
		// @6DC: sipush 283 (0x011B)
		// @6DF: iconst_m1
		// @6E0: iastore
		// @6E1: dup
		// @6E2: sipush 284 (0x011C)
		// @6E5: iconst_m1
		// @6E6: iastore
		// @6E7: dup
		// @6E8: sipush 285 (0x011D)
		// @6EB: iconst_m1
		// @6EC: iastore
		// @6ED: dup
		// @6EE: sipush 286 (0x011E)
		// @6F1: iconst_m1
		// @6F2: iastore
		// @6F3: dup
		// @6F4: sipush 287 (0x011F)
		// @6F7: iconst_m1
		// @6F8: iastore
		// @6F9: dup
		// @6FA: sipush 288 (0x0120)
		// @6FD: iconst_m1
		// @6FE: iastore
		// @6FF: dup
		// @700: sipush 289 (0x0121)
		// @703: iconst_m1
		// @704: iastore
		// @705: dup
		// @706: sipush 290 (0x0122)
		// @709: iconst_m1
		// @70A: iastore
		// @70B: dup
		// @70C: sipush 291 (0x0123)
		// @70F: iconst_m1
		// @710: iastore
		// @711: dup
		// @712: sipush 292 (0x0124)
		// @715: iconst_m1
		// @716: iastore
		// @717: dup
		// @718: sipush 293 (0x0125)
		// @71B: iconst_m1
		// @71C: iastore
		// @71D: dup
		// @71E: sipush 294 (0x0126)
		// @721: iconst_m1
		// @722: iastore
		// @723: dup
		// @724: sipush 295 (0x0127)
		// @727: iconst_m1
		// @728: iastore
		// @729: dup
		// @72A: sipush 296 (0x0128)
		// @72D: iconst_m1
		// @72E: iastore
		// @72F: dup
		// @730: sipush 297 (0x0129)
		// @733: iconst_m1
		// @734: iastore
		// @735: dup
		// @736: sipush 298 (0x012A)
		// @739: iconst_m1
		// @73A: iastore
		// @73B: dup
		// @73C: sipush 299 (0x012B)
		// @73F: iconst_m1
		// @740: iastore
		// @741: dup
		// @742: sipush 300 (0x012C)
		// @745: iconst_m1
		// @746: iastore
		// @747: dup
		// @748: sipush 301 (0x012D)
		// @74B: iconst_m1
		// @74C: iastore
		// @74D: dup
		// @74E: sipush 302 (0x012E)
		// @751: iconst_m1
		// @752: iastore
		// @753: dup
		// @754: sipush 303 (0x012F)
		// @757: iconst_m1
		// @758: iastore
		// @759: dup
		// @75A: sipush 304 (0x0130)
		// @75D: iconst_m1
		// @75E: iastore
		// @75F: dup
		// @760: sipush 305 (0x0131)
		// @763: iconst_m1
		// @764: iastore
		// @765: dup
		// @766: sipush 306 (0x0132)
		// @769: iconst_m1
		// @76A: iastore
		// @76B: dup
		// @76C: sipush 307 (0x0133)
		// @76F: iconst_m1
		// @770: iastore
		// @771: dup
		// @772: sipush 308 (0x0134)
		// @775: iconst_m1
		// @776: iastore
		// @777: dup
		// @778: sipush 309 (0x0135)
		// @77B: iconst_m1
		// @77C: iastore
		// @77D: dup
		// @77E: sipush 310 (0x0136)
		// @781: iconst_m1
		// @782: iastore
		// @783: dup
		// @784: sipush 311 (0x0137)
		// @787: iconst_m1
		// @788: iastore
		// @789: dup
		// @78A: sipush 312 (0x0138)
		// @78D: iconst_m1
		// @78E: iastore
		// @78F: dup
		// @790: sipush 313 (0x0139)
		// @793: iconst_m1
		// @794: iastore
		// @795: dup
		// @796: sipush 314 (0x013A)
		// @799: iconst_m1
		// @79A: iastore
		// @79B: dup
		// @79C: sipush 315 (0x013B)
		// @79F: iconst_m1
		// @7A0: iastore
		// @7A1: dup
		// @7A2: sipush 316 (0x013C)
		// @7A5: iconst_m1
		// @7A6: iastore
		// @7A7: dup
		// @7A8: sipush 317 (0x013D)
		// @7AB: iconst_m1
		// @7AC: iastore
		// @7AD: dup
		// @7AE: sipush 318 (0x013E)
		// @7B1: iconst_m1
		// @7B2: iastore
		// @7B3: dup
		// @7B4: sipush 319 (0x013F)
		// @7B7: iconst_m1
		// @7B8: iastore
		// @7B9: dup
		// @7BA: sipush 320 (0x0140)
		// @7BD: iconst_m1
		// @7BE: iastore
		// @7BF: dup
		// @7C0: sipush 321 (0x0141)
		// @7C3: iconst_m1
		// @7C4: iastore
		// @7C5: dup
		// @7C6: sipush 322 (0x0142)
		// @7C9: iconst_m1
		// @7CA: iastore
		// @7CB: dup
		// @7CC: sipush 323 (0x0143)
		// @7CF: iconst_m1
		// @7D0: iastore
		// @7D1: dup
		// @7D2: sipush 324 (0x0144)
		// @7D5: iconst_m1
		// @7D6: iastore
		// @7D7: dup
		// @7D8: sipush 325 (0x0145)
		// @7DB: iconst_m1
		// @7DC: iastore
		// @7DD: dup
		// @7DE: sipush 326 (0x0146)
		// @7E1: iconst_m1
		// @7E2: iastore
		// @7E3: dup
		// @7E4: sipush 327 (0x0147)
		// @7E7: iconst_m1
		// @7E8: iastore
		// @7E9: dup
		// @7EA: sipush 328 (0x0148)
		// @7ED: iconst_m1
		// @7EE: iastore
		// @7EF: dup
		// @7F0: sipush 329 (0x0149)
		// @7F3: iconst_m1
		// @7F4: iastore
		// @7F5: dup
		// @7F6: sipush 330 (0x014A)
		// @7F9: iconst_m1
		// @7FA: iastore
		// @7FB: dup
		// @7FC: sipush 331 (0x014B)
		// @7FF: iconst_m1
		// @800: iastore
		// @801: dup
		// @802: sipush 332 (0x014C)
		// @805: iconst_m1
		// @806: iastore
		// @807: dup
		// @808: sipush 333 (0x014D)
		// @80B: iconst_m1
		// @80C: iastore
		// @80D: dup
		// @80E: sipush 334 (0x014E)
		// @811: iconst_m1
		// @812: iastore
		// @813: dup
		// @814: sipush 335 (0x014F)
		// @817: iconst_m1
		// @818: iastore
		// @819: dup
		// @81A: sipush 336 (0x0150)
		// @81D: iconst_m1
		// @81E: iastore
		// @81F: dup
		// @820: sipush 337 (0x0151)
		// @823: iconst_m1
		// @824: iastore
		// @825: dup
		// @826: sipush 338 (0x0152)
		// @829: iconst_m1
		// @82A: iastore
		// @82B: dup
		// @82C: sipush 339 (0x0153)
		// @82F: iconst_m1
		// @830: iastore
		// @831: dup
		// @832: sipush 340 (0x0154)
		// @835: iconst_m1
		// @836: iastore
		// @837: dup
		// @838: sipush 341 (0x0155)
		// @83B: iconst_m1
		// @83C: iastore
		// @83D: dup
		// @83E: sipush 342 (0x0156)
		// @841: iconst_m1
		// @842: iastore
		// @843: dup
		// @844: sipush 343 (0x0157)
		// @847: iconst_m1
		// @848: iastore
		// @849: dup
		// @84A: sipush 344 (0x0158)
		// @84D: iconst_m1
		// @84E: iastore
		// @84F: dup
		// @850: sipush 345 (0x0159)
		// @853: iconst_m1
		// @854: iastore
		// @855: dup
		// @856: sipush 346 (0x015A)
		// @859: iconst_m1
		// @85A: iastore
		// @85B: dup
		// @85C: sipush 347 (0x015B)
		// @85F: iconst_m1
		// @860: iastore
		// @861: dup
		// @862: sipush 348 (0x015C)
		// @865: iconst_m1
		// @866: iastore
		// @867: dup
		// @868: sipush 349 (0x015D)
		// @86B: iconst_m1
		// @86C: iastore
		// @86D: dup
		// @86E: sipush 350 (0x015E)
		// @871: iconst_m1
		// @872: iastore
		// @873: dup
		// @874: sipush 351 (0x015F)
		// @877: iconst_m1
		// @878: iastore
		// @879: dup
		// @87A: sipush 352 (0x0160)
		// @87D: iconst_m1
		// @87E: iastore
		// @87F: dup
		// @880: sipush 353 (0x0161)
		// @883: iconst_m1
		// @884: iastore
		// @885: dup
		// @886: sipush 354 (0x0162)
		// @889: iconst_m1
		// @88A: iastore
		// @88B: dup
		// @88C: sipush 355 (0x0163)
		// @88F: iconst_m1
		// @890: iastore
		// @891: dup
		// @892: sipush 356 (0x0164)
		// @895: iconst_m1
		// @896: iastore
		// @897: dup
		// @898: sipush 357 (0x0165)
		// @89B: iconst_m1
		// @89C: iastore
		// @89D: dup
		// @89E: sipush 358 (0x0166)
		// @8A1: iconst_m1
		// @8A2: iastore
		// @8A3: dup
		// @8A4: sipush 359 (0x0167)
		// @8A7: iconst_m1
		// @8A8: iastore
		// @8A9: dup
		// @8AA: sipush 360 (0x0168)
		// @8AD: iconst_m1
		// @8AE: iastore
		// @8AF: dup
		// @8B0: sipush 361 (0x0169)
		// @8B3: iconst_m1
		// @8B4: iastore
		// @8B5: dup
		// @8B6: sipush 362 (0x016A)
		// @8B9: iconst_m1
		// @8BA: iastore
		// @8BB: dup
		// @8BC: sipush 363 (0x016B)
		// @8BF: iconst_m1
		// @8C0: iastore
		// @8C1: dup
		// @8C2: sipush 364 (0x016C)
		// @8C5: iconst_m1
		// @8C6: iastore
		// @8C7: dup
		// @8C8: sipush 365 (0x016D)
		// @8CB: iconst_m1
		// @8CC: iastore
		// @8CD: dup
		// @8CE: sipush 366 (0x016E)
		// @8D1: iconst_m1
		// @8D2: iastore
		// @8D3: dup
		// @8D4: sipush 367 (0x016F)
		// @8D7: iconst_m1
		// @8D8: iastore
		// @8D9: dup
		// @8DA: sipush 368 (0x0170)
		// @8DD: iconst_m1
		// @8DE: iastore
		// @8DF: dup
		// @8E0: sipush 369 (0x0171)
		// @8E3: iconst_m1
		// @8E4: iastore
		// @8E5: dup
		// @8E6: sipush 370 (0x0172)
		// @8E9: iconst_m1
		// @8EA: iastore
		// @8EB: dup
		// @8EC: sipush 371 (0x0173)
		// @8EF: iconst_m1
		// @8F0: iastore
		// @8F1: dup
		// @8F2: sipush 372 (0x0174)
		// @8F5: iconst_m1
		// @8F6: iastore
		// @8F7: dup
		// @8F8: sipush 373 (0x0175)
		// @8FB: iconst_m1
		// @8FC: iastore
		// @8FD: dup
		// @8FE: sipush 374 (0x0176)
		// @901: iconst_m1
		// @902: iastore
		// @903: dup
		// @904: sipush 375 (0x0177)
		// @907: iconst_m1
		// @908: iastore
		// @909: dup
		// @90A: sipush 376 (0x0178)
		// @90D: iconst_m1
		// @90E: iastore
		// @90F: dup
		// @910: sipush 377 (0x0179)
		// @913: iconst_m1
		// @914: iastore
		// @915: dup
		// @916: sipush 378 (0x017A)
		// @919: iconst_m1
		// @91A: iastore
		// @91B: dup
		// @91C: sipush 379 (0x017B)
		// @91F: iconst_m1
		// @920: iastore
		// @921: dup
		// @922: sipush 380 (0x017C)
		// @925: iconst_m1
		// @926: iastore
		// @927: dup
		// @928: sipush 381 (0x017D)
		// @92B: iconst_m1
		// @92C: iastore
		// @92D: dup
		// @92E: sipush 382 (0x017E)
		// @931: iconst_m1
		// @932: iastore
		// @933: dup
		// @934: sipush 383 (0x017F)
		// @937: iconst_m1
		// @938: iastore
		// @939: dup
		// @93A: sipush 384 (0x0180)
		// @93D: iconst_m1
		// @93E: iastore
		// @93F: dup
		// @940: sipush 385 (0x0181)
		// @943: iconst_m1
		// @944: iastore
		// @945: dup
		// @946: sipush 386 (0x0182)
		// @949: iconst_m1
		// @94A: iastore
		// @94B: dup
		// @94C: sipush 387 (0x0183)
		// @94F: iconst_m1
		// @950: iastore
		// @951: dup
		// @952: sipush 388 (0x0184)
		// @955: iconst_m1
		// @956: iastore
		// @957: dup
		// @958: sipush 389 (0x0185)
		// @95B: iconst_m1
		// @95C: iastore
		// @95D: dup
		// @95E: sipush 390 (0x0186)
		// @961: iconst_m1
		// @962: iastore
		// @963: dup
		// @964: sipush 391 (0x0187)
		// @967: iconst_m1
		// @968: iastore
		// @969: dup
		// @96A: sipush 392 (0x0188)
		// @96D: iconst_m1
		// @96E: iastore
		// @96F: dup
		// @970: sipush 393 (0x0189)
		// @973: iconst_m1
		// @974: iastore
		// @975: dup
		// @976: sipush 394 (0x018A)
		// @979: iconst_m1
		// @97A: iastore
		// @97B: dup
		// @97C: sipush 395 (0x018B)
		// @97F: iconst_m1
		// @980: iastore
		// @981: dup
		// @982: sipush 396 (0x018C)
		// @985: iconst_m1
		// @986: iastore
		// @987: dup
		// @988: sipush 397 (0x018D)
		// @98B: iconst_m1
		// @98C: iastore
		// @98D: dup
		// @98E: sipush 398 (0x018E)
		// @991: iconst_m1
		// @992: iastore
		// @993: dup
		// @994: sipush 399 (0x018F)
		// @997: iconst_m1
		// @998: iastore
		// @999: dup
		// @99A: sipush 400 (0x0190)
		// @99D: iconst_m1
		// @99E: iastore
		// @99F: dup
		// @9A0: sipush 401 (0x0191)
		// @9A3: iconst_m1
		// @9A4: iastore
		// @9A5: dup
		// @9A6: sipush 402 (0x0192)
		// @9A9: iconst_m1
		// @9AA: iastore
		// @9AB: dup
		// @9AC: sipush 403 (0x0193)
		// @9AF: iconst_m1
		// @9B0: iastore
		// @9B1: dup
		// @9B2: sipush 404 (0x0194)
		// @9B5: iconst_m1
		// @9B6: iastore
		// @9B7: dup
		// @9B8: sipush 405 (0x0195)
		// @9BB: iconst_m1
		// @9BC: iastore
		// @9BD: dup
		// @9BE: sipush 406 (0x0196)
		// @9C1: iconst_m1
		// @9C2: iastore
		// @9C3: dup
		// @9C4: sipush 407 (0x0197)
		// @9C7: iconst_m1
		// @9C8: iastore
		// @9C9: dup
		// @9CA: sipush 408 (0x0198)
		// @9CD: iconst_m1
		// @9CE: iastore
		// @9CF: dup
		// @9D0: sipush 409 (0x0199)
		// @9D3: iconst_m1
		// @9D4: iastore
		// @9D5: dup
		// @9D6: sipush 410 (0x019A)
		// @9D9: iconst_m1
		// @9DA: iastore
		// @9DB: dup
		// @9DC: sipush 411 (0x019B)
		// @9DF: iconst_m1
		// @9E0: iastore
		// @9E1: dup
		// @9E2: sipush 412 (0x019C)
		// @9E5: iconst_m1
		// @9E6: iastore
		// @9E7: dup
		// @9E8: sipush 413 (0x019D)
		// @9EB: iconst_m1
		// @9EC: iastore
		// @9ED: dup
		// @9EE: sipush 414 (0x019E)
		// @9F1: iconst_m1
		// @9F2: iastore
		// @9F3: dup
		// @9F4: sipush 415 (0x019F)
		// @9F7: iconst_m1
		// @9F8: iastore
		// @9F9: dup
		// @9FA: sipush 416 (0x01A0)
		// @9FD: iconst_m1
		// @9FE: iastore
		// @9FF: dup
		// @A00: sipush 417 (0x01A1)
		// @A03: iconst_m1
		// @A04: iastore
		// @A05: dup
		// @A06: sipush 418 (0x01A2)
		// @A09: iconst_m1
		// @A0A: iastore
		// @A0B: dup
		// @A0C: sipush 419 (0x01A3)
		// @A0F: iconst_m1
		// @A10: iastore
		// @A11: dup
		// @A12: sipush 420 (0x01A4)
		// @A15: iconst_m1
		// @A16: iastore
		// @A17: dup
		// @A18: sipush 421 (0x01A5)
		// @A1B: iconst_m1
		// @A1C: iastore
		// @A1D: dup
		// @A1E: sipush 422 (0x01A6)
		// @A21: iconst_m1
		// @A22: iastore
		// @A23: dup
		// @A24: sipush 423 (0x01A7)
		// @A27: iconst_m1
		// @A28: iastore
		// @A29: dup
		// @A2A: sipush 424 (0x01A8)
		// @A2D: iconst_m1
		// @A2E: iastore
		// @A2F: dup
		// @A30: sipush 425 (0x01A9)
		// @A33: iconst_m1
		// @A34: iastore
		// @A35: dup
		// @A36: sipush 426 (0x01AA)
		// @A39: iconst_m1
		// @A3A: iastore
		// @A3B: dup
		// @A3C: sipush 427 (0x01AB)
		// @A3F: iconst_m1
		// @A40: iastore
		// @A41: dup
		// @A42: sipush 428 (0x01AC)
		// @A45: iconst_m1
		// @A46: iastore
		// @A47: dup
		// @A48: sipush 429 (0x01AD)
		// @A4B: iconst_m1
		// @A4C: iastore
		// @A4D: dup
		// @A4E: sipush 430 (0x01AE)
		// @A51: iconst_m1
		// @A52: iastore
		// @A53: dup
		// @A54: sipush 431 (0x01AF)
		// @A57: iconst_m1
		// @A58: iastore
		// @A59: dup
		// @A5A: sipush 432 (0x01B0)
		// @A5D: iconst_m1
		// @A5E: iastore
		// @A5F: dup
		// @A60: sipush 433 (0x01B1)
		// @A63: iconst_m1
		// @A64: iastore
		// @A65: dup
		// @A66: sipush 434 (0x01B2)
		// @A69: iconst_m1
		// @A6A: iastore
		// @A6B: dup
		// @A6C: sipush 435 (0x01B3)
		// @A6F: iconst_m1
		// @A70: iastore
		// @A71: dup
		// @A72: sipush 436 (0x01B4)
		// @A75: iconst_m1
		// @A76: iastore
		// @A77: dup
		// @A78: sipush 437 (0x01B5)
		// @A7B: iconst_m1
		// @A7C: iastore
		// @A7D: dup
		// @A7E: sipush 438 (0x01B6)
		// @A81: iconst_m1
		// @A82: iastore
		// @A83: dup
		// @A84: sipush 439 (0x01B7)
		// @A87: iconst_m1
		// @A88: iastore
		// @A89: dup
		// @A8A: sipush 440 (0x01B8)
		// @A8D: iconst_m1
		// @A8E: iastore
		// @A8F: dup
		// @A90: sipush 441 (0x01B9)
		// @A93: iconst_m1
		// @A94: iastore
		// @A95: dup
		// @A96: sipush 442 (0x01BA)
		// @A99: iconst_m1
		// @A9A: iastore
		// @A9B: dup
		// @A9C: sipush 443 (0x01BB)
		// @A9F: iconst_m1
		// @AA0: iastore
		// @AA1: dup
		// @AA2: sipush 444 (0x01BC)
		// @AA5: iconst_m1
		// @AA6: iastore
		// @AA7: dup
		// @AA8: sipush 445 (0x01BD)
		// @AAB: iconst_m1
		// @AAC: iastore
		// @AAD: dup
		// @AAE: sipush 446 (0x01BE)
		// @AB1: iconst_m1
		// @AB2: iastore
		// @AB3: dup
		// @AB4: sipush 447 (0x01BF)
		// @AB7: iconst_m1
		// @AB8: iastore
		// @AB9: dup
		// @ABA: sipush 448 (0x01C0)
		// @ABD: iconst_m1
		// @ABE: iastore
		// @ABF: dup
		// @AC0: sipush 449 (0x01C1)
		// @AC3: iconst_m1
		// @AC4: iastore
		// @AC5: dup
		// @AC6: sipush 450 (0x01C2)
		// @AC9: iconst_m1
		// @ACA: iastore
		// @ACB: dup
		// @ACC: sipush 451 (0x01C3)
		// @ACF: iconst_m1
		// @AD0: iastore
		// @AD1: dup
		// @AD2: sipush 452 (0x01C4)
		// @AD5: iconst_m1
		// @AD6: iastore
		// @AD7: dup
		// @AD8: sipush 453 (0x01C5)
		// @ADB: iconst_m1
		// @ADC: iastore
		// @ADD: dup
		// @ADE: sipush 454 (0x01C6)
		// @AE1: iconst_m1
		// @AE2: iastore
		// @AE3: dup
		// @AE4: sipush 455 (0x01C7)
		// @AE7: iconst_m1
		// @AE8: iastore
		// @AE9: dup
		// @AEA: sipush 456 (0x01C8)
		// @AED: iconst_m1
		// @AEE: iastore
		// @AEF: dup
		// @AF0: sipush 457 (0x01C9)
		// @AF3: iconst_m1
		// @AF4: iastore
		// @AF5: dup
		// @AF6: sipush 458 (0x01CA)
		// @AF9: iconst_m1
		// @AFA: iastore
		// @AFB: dup
		// @AFC: sipush 459 (0x01CB)
		// @AFF: iconst_m1
		// @B00: iastore
		// @B01: dup
		// @B02: sipush 460 (0x01CC)
		// @B05: iconst_m1
		// @B06: iastore
		// @B07: dup
		// @B08: sipush 461 (0x01CD)
		// @B0B: iconst_m1
		// @B0C: iastore
		// @B0D: dup
		// @B0E: sipush 462 (0x01CE)
		// @B11: iconst_m1
		// @B12: iastore
		// @B13: dup
		// @B14: sipush 463 (0x01CF)
		// @B17: iconst_m1
		// @B18: iastore
		// @B19: dup
		// @B1A: sipush 464 (0x01D0)
		// @B1D: iconst_m1
		// @B1E: iastore
		// @B1F: dup
		// @B20: sipush 465 (0x01D1)
		// @B23: iconst_m1
		// @B24: iastore
		// @B25: dup
		// @B26: sipush 466 (0x01D2)
		// @B29: iconst_m1
		// @B2A: iastore
		// @B2B: dup
		// @B2C: sipush 467 (0x01D3)
		// @B2F: iconst_m1
		// @B30: iastore
		// @B31: dup
		// @B32: sipush 468 (0x01D4)
		// @B35: iconst_m1
		// @B36: iastore
		// @B37: dup
		// @B38: sipush 469 (0x01D5)
		// @B3B: iconst_m1
		// @B3C: iastore
		// @B3D: dup
		// @B3E: sipush 470 (0x01D6)
		// @B41: iconst_m1
		// @B42: iastore
		// @B43: dup
		// @B44: sipush 471 (0x01D7)
		// @B47: iconst_m1
		// @B48: iastore
		// @B49: dup
		// @B4A: sipush 472 (0x01D8)
		// @B4D: iconst_m1
		// @B4E: iastore
		// @B4F: dup
		// @B50: sipush 473 (0x01D9)
		// @B53: iconst_m1
		// @B54: iastore
		// @B55: dup
		// @B56: sipush 474 (0x01DA)
		// @B59: iconst_m1
		// @B5A: iastore
		// @B5B: dup
		// @B5C: sipush 475 (0x01DB)
		// @B5F: iconst_m1
		// @B60: iastore
		// @B61: dup
		// @B62: sipush 476 (0x01DC)
		// @B65: iconst_m1
		// @B66: iastore
		// @B67: dup
		// @B68: sipush 477 (0x01DD)
		// @B6B: iconst_m1
		// @B6C: iastore
		// @B6D: dup
		// @B6E: sipush 478 (0x01DE)
		// @B71: iconst_m1
		// @B72: iastore
		// @B73: dup
		// @B74: sipush 479 (0x01DF)
		// @B77: iconst_m1
		// @B78: iastore
		// @B79: dup
		// @B7A: sipush 480 (0x01E0)
		// @B7D: iconst_m1
		// @B7E: iastore
		// @B7F: dup
		// @B80: sipush 481 (0x01E1)
		// @B83: iconst_m1
		// @B84: iastore
		// @B85: dup
		// @B86: sipush 482 (0x01E2)
		// @B89: iconst_m1
		// @B8A: iastore
		// @B8B: dup
		// @B8C: sipush 483 (0x01E3)
		// @B8F: iconst_m1
		// @B90: iastore
		// @B91: dup
		// @B92: sipush 484 (0x01E4)
		// @B95: iconst_m1
		// @B96: iastore
		// @B97: dup
		// @B98: sipush 485 (0x01E5)
		// @B9B: iconst_m1
		// @B9C: iastore
		// @B9D: dup
		// @B9E: sipush 486 (0x01E6)
		// @BA1: iconst_m1
		// @BA2: iastore
		// @BA3: dup
		// @BA4: sipush 487 (0x01E7)
		// @BA7: iconst_m1
		// @BA8: iastore
		// @BA9: dup
		// @BAA: sipush 488 (0x01E8)
		// @BAD: iconst_m1
		// @BAE: iastore
		// @BAF: dup
		// @BB0: sipush 489 (0x01E9)
		// @BB3: iconst_m1
		// @BB4: iastore
		// @BB5: dup
		// @BB6: sipush 490 (0x01EA)
		// @BB9: iconst_m1
		// @BBA: iastore
		// @BBB: dup
		// @BBC: sipush 491 (0x01EB)
		// @BBF: iconst_m1
		// @BC0: iastore
		// @BC1: dup
		// @BC2: sipush 492 (0x01EC)
		// @BC5: iconst_m1
		// @BC6: iastore
		// @BC7: dup
		// @BC8: sipush 493 (0x01ED)
		// @BCB: iconst_m1
		// @BCC: iastore
		// @BCD: dup
		// @BCE: sipush 494 (0x01EE)
		// @BD1: iconst_m1
		// @BD2: iastore
		// @BD3: dup
		// @BD4: sipush 495 (0x01EF)
		// @BD7: iconst_m1
		// @BD8: iastore
		// @BD9: dup
		// @BDA: sipush 496 (0x01F0)
		// @BDD: iconst_m1
		// @BDE: iastore
		// @BDF: dup
		// @BE0: sipush 497 (0x01F1)
		// @BE3: iconst_m1
		// @BE4: iastore
		// @BE5: dup
		// @BE6: sipush 498 (0x01F2)
		// @BE9: iconst_m1
		// @BEA: iastore
		// @BEB: dup
		// @BEC: sipush 499 (0x01F3)
		// @BEF: iconst_m1
		// @BF0: iastore
		// @BF1: dup
		// @BF2: sipush 500 (0x01F4)
		// @BF5: iconst_m1
		// @BF6: iastore
		// @BF7: dup
		// @BF8: sipush 501 (0x01F5)
		// @BFB: iconst_m1
		// @BFC: iastore
		// @BFD: dup
		// @BFE: sipush 502 (0x01F6)
		// @C01: iconst_m1
		// @C02: iastore
		// @C03: dup
		// @C04: sipush 503 (0x01F7)
		// @C07: iconst_m1
		// @C08: iastore
		// @C09: dup
		// @C0A: sipush 504 (0x01F8)
		// @C0D: iconst_m1
		// @C0E: iastore
		// @C0F: dup
		// @C10: sipush 505 (0x01F9)
		// @C13: iconst_m1
		// @C14: iastore
		// @C15: dup
		// @C16: sipush 506 (0x01FA)
		// @C19: iconst_m1
		// @C1A: iastore
		// @C1B: dup
		// @C1C: sipush 507 (0x01FB)
		// @C1F: iconst_m1
		// @C20: iastore
		// @C21: dup
		// @C22: sipush 508 (0x01FC)
		// @C25: iconst_m1
		// @C26: iastore
		// @C27: dup
		// @C28: sipush 509 (0x01FD)
		// @C2B: iconst_m1
		// @C2C: iastore
		// @C2D: dup
		// @C2E: sipush 510 (0x01FE)
		// @C31: iconst_m1
		// @C32: iastore
		// @C33: dup
		// @C34: sipush 511 (0x01FF)
		// @C37: iconst_m1
		// @C38: iastore
		// @C39: dup
		// @C3A: sipush 512 (0x0200)
		// @C3D: iconst_m1
		// @C3E: iastore
		// @C3F: dup
		// @C40: sipush 513 (0x0201)
		// @C43: iconst_m1
		// @C44: iastore
		// @C45: dup
		// @C46: sipush 514 (0x0202)
		// @C49: iconst_m1
		// @C4A: iastore
		// @C4B: dup
		// @C4C: sipush 515 (0x0203)
		// @C4F: iconst_m1
		// @C50: iastore
		// @C51: dup
		// @C52: sipush 516 (0x0204)
		// @C55: iconst_m1
		// @C56: iastore
		// @C57: dup
		// @C58: sipush 517 (0x0205)
		// @C5B: iconst_m1
		// @C5C: iastore
		// @C5D: dup
		// @C5E: sipush 518 (0x0206)
		// @C61: iconst_m1
		// @C62: iastore
		// @C63: dup
		// @C64: sipush 519 (0x0207)
		// @C67: iconst_m1
		// @C68: iastore
		// @C69: dup
		// @C6A: sipush 520 (0x0208)
		// @C6D: iconst_m1
		// @C6E: iastore
		// @C6F: putstatic int[] game.C_100310_lj.field_100550_x
		// @C72: bipush 9 (0x09)
		// @C74: newarray int[]
		// @C76: dup
		// @C77: iconst_0
		// @C78: iconst_0
		// @C79: iastore
		// @C7A: dup
		// @C7B: iconst_1
		// @C7C: iconst_1
		// @C7D: iastore
		// @C7E: dup
		// @C7F: iconst_2
		// @C80: bipush 28 (0x1C)
		// @C82: iastore
		// @C83: dup
		// @C84: iconst_3
		// @C85: iconst_5
		// @C86: iastore
		// @C87: dup
		// @C88: iconst_4
		// @C89: bipush 35 (0x23)
		// @C8B: iastore
		// @C8C: dup
		// @C8D: iconst_5
		// @C8E: iconst_4
		// @C8F: iastore
		// @C90: dup
		// @C91: bipush 6 (0x06)
		// @C93: iconst_3
		// @C94: iastore
		// @C95: dup
		// @C96: bipush 7 (0x07)
		// @C98: bipush 22 (0x16)
		// @C9A: iastore
		// @C9B: dup
		// @C9C: bipush 8 (0x08)
		// @C9E: bipush 19 (0x13)
		// @CA0: iastore
		// @CA1: putstatic int[] game.C_100310_lj.field_100546_B
		// @CA4: return
	}
	
	private static char[] func_100541_z(String arg0)
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
		// @0E: bipush 65 (0x41)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_100539_z(char[] arg0)
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
		// @30: bipush 88 (0x58)
		// @32: goto @46
		// @35: bipush 115 (0x73)
		// @37: goto @46
		// @3A: bipush 54 (0x36)
		// @3C: goto @46
		// @3F: bipush 26 (0x1A)
		// @41: goto @46
		// @44: bipush 65 (0x41)
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
