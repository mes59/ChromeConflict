package game;

final class C_100044_vm extends C_100261_md
{
	C_100202_qi field_100943_u;
	static C_100217_ao field_100947_q;
	private C_100210_qa field_100948_p;
	static C_100153_be field_100944_t;
	static String field_100942_v;
	C_100026_hb field_100949_n;
	static int field_100946_r;
	static String field_100952_y;
	static String field_100950_o;
	static int field_100945_s;
	static String field_100941_w;
	static String field_100953_x;
	private static final String[] field_100951_z;
	
	static final boolean func_100933_a(byte arg0)
	{
		// @00: iload_0
		// @01: bipush 82 (0x52)
		// @03: if_icmpeq @08
		// @06: iconst_1
		// @07: ireturn
		// @08: iconst_1
		// @09: invokestatic game.C_100254_pi.func_106444_a(int)boolean
		// @0C: ireturn
		// @0D: astore_1
		// @0E: aload_1
		// @0F: new java.lang.StringBuilder
		// @12: dup
		// @13: invokespecial java.lang.StringBuilder.<init>()void
		// @16: getstatic java.lang.String[] game.C_100044_vm.field_100951_z
		// @19: iconst_5
		// @1A: aaload
		// @1B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1E: iload_0
		// @1F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @22: bipush 41 (0x29)
		// @24: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @27: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @2A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @2D: athrow
	}
	
	final void func_100910_a(int[] arg0, int arg1, int arg2)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #7
		// @005: aload_0
		// @006: getfield game.C_100026_hb game.C_100044_vm.field_100949_n
		// @009: aload_1
		// @00A: iload_2
		// @00B: iload_3
		// @00C: invokevirtual game.C_100026_hb.func_100910_a(int[], int, int)void
		// @00F: aload_0
		// @010: getfield game.C_100202_qi game.C_100044_vm.field_100943_u
		// @013: bipush 116 (0x74)
		// @015: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @018: checkcast game.C_100121_ud
		// @01B: astore #6
		// @01D: aconst_null
		// @01E: aload #6
		// @020: if_acmpeq @0C4
		// @023: iload #7
		// @025: ifne @10E
		// @028: aload_0
		// @029: getfield game.C_100210_qa game.C_100044_vm.field_100948_p
		// @02C: aload #6
		// @02E: iconst_0
		// @02F: invokevirtual game.C_100210_qa.func_101044_b(game.C_100121_ud, int)boolean
		// @032: goto @036
		// @035: athrow
		// @036: ifne @0B1
		// @039: iload_2
		// @03A: istore #4
		// @03C: iload_3
		// @03D: istore #5
		// @03F: aload #6
		// @041: getfield int game.C_100121_ud.field_100727_k
		// @044: iconst_m1
		// @045: ixor
		// @046: iload #5
		// @048: iconst_m1
		// @049: ixor
		// @04A: if_icmple @092
		// @04D: aload_0
		// @04E: iload #4
		// @050: iload #5
		// @052: iadd
		// @053: aload #6
		// @055: sipush 31615 (0x7B7F)
		// @058: aload_1
		// @059: iload #4
		// @05B: aload #6
		// @05D: getfield int game.C_100121_ud.field_100727_k
		// @060: invokespecial game.C_100044_vm.func_100939_a(int, game.C_100121_ud, int, int[], int, int)void
		// @063: iload #4
		// @065: aload #6
		// @067: getfield int game.C_100121_ud.field_100727_k
		// @06A: iadd
		// @06B: istore #4
		// @06D: iload #5
		// @06F: aload #6
		// @071: getfield int game.C_100121_ud.field_100727_k
		// @074: isub
		// @075: istore #5
		// @077: aload_0
		// @078: getfield game.C_100210_qa game.C_100044_vm.field_100948_p
		// @07B: iload #5
		// @07D: iload #4
		// @07F: ldc 25751758 (0x188f0ce)
		// @081: aload #6
		// @083: aload_1
		// @084: invokevirtual game.C_100210_qa.func_101045_a(int, int, int, game.C_100121_ud, int[])boolean
		// @087: iload #7
		// @089: ifne @036
		// @08C: ifne @0B1
		// @08F: goto @03F
		// @092: aload_0
		// @093: iload #5
		// @095: iload #4
		// @097: iadd
		// @098: aload #6
		// @09A: sipush 31615 (0x7B7F)
		// @09D: aload_1
		// @09E: iload #4
		// @0A0: iload #5
		// @0A2: invokespecial game.C_100044_vm.func_100939_a(int, game.C_100121_ud, int, int[], int, int)void
		// @0A5: aload #6
		// @0A7: dup
		// @0A8: getfield int game.C_100121_ud.field_100727_k
		// @0AB: iload #5
		// @0AD: isub
		// @0AE: putfield int game.C_100121_ud.field_100727_k
		// @0B1: aload_0
		// @0B2: getfield game.C_100202_qi game.C_100044_vm.field_100943_u
		// @0B5: bipush 103 (0x67)
		// @0B7: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @0BA: checkcast game.C_100121_ud
		// @0BD: astore #6
		// @0BF: iload #7
		// @0C1: ifeq @01D
		// @0C4: goto @10E
		// @0C7: astore #4
		// @0C9: aload #4
		// @0CB: new java.lang.StringBuilder
		// @0CE: dup
		// @0CF: invokespecial java.lang.StringBuilder.<init>()void
		// @0D2: getstatic java.lang.String[] game.C_100044_vm.field_100951_z
		// @0D5: bipush 13 (0x0D)
		// @0D7: aaload
		// @0D8: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0DB: aload_1
		// @0DC: ifnull @0E8
		// @0DF: getstatic java.lang.String[] game.C_100044_vm.field_100951_z
		// @0E2: iconst_2
		// @0E3: aaload
		// @0E4: goto @0ED
		// @0E7: athrow
		// @0E8: getstatic java.lang.String[] game.C_100044_vm.field_100951_z
		// @0EB: iconst_0
		// @0EC: aaload
		// @0ED: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0F0: bipush 44 (0x2C)
		// @0F2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0F5: iload_2
		// @0F6: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0F9: bipush 44 (0x2C)
		// @0FB: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0FE: iload_3
		// @0FF: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @102: bipush 41 (0x29)
		// @104: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @107: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @10A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @10D: athrow
		// @10E: return
	}
	
	static final C_100153_be func_100934_a(C_100153_be arg0, int arg1, int[] arg2)
	{
		// @00: new game.C_100153_be
		// @03: dup
		// @04: iconst_0
		// @05: iconst_0
		// @06: iconst_0
		// @07: invokespecial game.C_100153_be.<init>(int, int, int)void
		// @0A: astore_3
		// @0B: aload_3
		// @0C: aload_0
		// @0D: getfield int game.C_100153_be.field_105303_s
		// @10: putfield int game.C_100153_be.field_105303_s
		// @13: aload_3
		// @14: aload_0
		// @15: getfield int game.C_100153_be.field_105297_l
		// @18: putfield int game.C_100153_be.field_105297_l
		// @1B: aload_3
		// @1C: aload_0
		// @1D: getfield int game.C_100153_be.field_105298_m
		// @20: putfield int game.C_100153_be.field_105298_m
		// @23: iload_1
		// @24: iconst_3
		// @25: if_icmpeq @2D
		// @28: aconst_null
		// @29: checkcast game.C_100153_be
		// @2C: areturn
		// @2D: aload_3
		// @2E: aload_0
		// @2F: getfield int game.C_100153_be.field_105304_r
		// @32: putfield int game.C_100153_be.field_105304_r
		// @35: aload_3
		// @36: aload_2
		// @37: putfield int[] game.C_100153_be.field_105320_t
		// @3A: aload_3
		// @3B: aload_0
		// @3C: getfield int game.C_100153_be.field_105300_k
		// @3F: putfield int game.C_100153_be.field_105300_k
		// @42: aload_3
		// @43: aload_0
		// @44: getfield int game.C_100153_be.field_105301_h
		// @47: putfield int game.C_100153_be.field_105301_h
		// @4A: aload_3
		// @4B: aload_0
		// @4C: getfield byte[] game.C_100153_be.field_105319_u
		// @4F: putfield byte[] game.C_100153_be.field_105319_u
		// @52: aload_3
		// @53: areturn
		// @54: astore_3
		// @55: aload_3
		// @56: new java.lang.StringBuilder
		// @59: dup
		// @5A: invokespecial java.lang.StringBuilder.<init>()void
		// @5D: getstatic java.lang.String[] game.C_100044_vm.field_100951_z
		// @60: iconst_1
		// @61: aaload
		// @62: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @65: aload_0
		// @66: ifnull @72
		// @69: getstatic java.lang.String[] game.C_100044_vm.field_100951_z
		// @6C: iconst_2
		// @6D: aaload
		// @6E: goto @77
		// @71: athrow
		// @72: getstatic java.lang.String[] game.C_100044_vm.field_100951_z
		// @75: iconst_0
		// @76: aaload
		// @77: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @7A: bipush 44 (0x2C)
		// @7C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7F: iload_1
		// @80: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @83: bipush 44 (0x2C)
		// @85: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @88: aload_2
		// @89: ifnull @95
		// @8C: getstatic java.lang.String[] game.C_100044_vm.field_100951_z
		// @8F: iconst_2
		// @90: aaload
		// @91: goto @9A
		// @94: athrow
		// @95: getstatic java.lang.String[] game.C_100044_vm.field_100951_z
		// @98: iconst_0
		// @99: aaload
		// @9A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @9D: bipush 41 (0x29)
		// @9F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A2: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @A5: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @A8: athrow
	}
	
	static final void func_100937_a(int arg0, String arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8)
	{
		// @000: getstatic game.C_100302_ka game.C_100146_bf.field_105127_a
		// @003: aload_1
		// @004: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @007: bipush -3 (0xFD)
		// @009: getstatic int game.C_100113_ek.field_104880_b
		// @00C: iconst_m1
		// @00D: ixor
		// @00E: if_icmpne @024
		// @011: getstatic game.C_100302_ka game.C_100032_gk.field_103140_X
		// @014: getstatic java.lang.String game.C_100146_bf.field_105121_f
		// @017: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @01A: getstatic int game.SteelSentinels.field_105275_O
		// @01D: ifeq @031
		// @020: goto @024
		// @023: athrow
		// @024: getstatic game.C_100302_ka game.C_100032_gk.field_103140_X
		// @027: getstatic java.lang.String game.C_100133_tk.field_104995_f
		// @02A: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @02D: goto @031
		// @030: athrow
		// @031: sipush 495 (0x01EF)
		// @034: istore #9
		// @036: iconst_5
		// @037: istore #10
		// @039: getstatic game.C_100302_ka game.C_100210_qa.field_101054_C
		// @03C: iconst_5
		// @03D: iload_0
		// @03E: iconst_m1
		// @03F: iload #10
		// @041: bipush -10 (0xF6)
		// @043: iload #9
		// @045: iadd
		// @046: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @049: getstatic game.C_100302_ka game.C_100235_om.field_106296_j
		// @04C: iconst_0
		// @04D: iload_0
		// @04E: iconst_m1
		// @04F: iconst_0
		// @050: getstatic game.C_100302_ka game.C_100127_tl.field_104946_d
		// @053: getfield int game.C_100302_ka.field_101886_Kb
		// @056: ineg
		// @057: getstatic game.C_100302_ka game.C_100210_qa.field_101054_C
		// @05A: getfield int game.C_100302_ka.field_101886_Kb
		// @05D: iadd
		// @05E: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @061: getstatic game.C_100302_ka game.C_100127_tl.field_104946_d
		// @064: getstatic game.C_100302_ka game.C_100235_om.field_106296_j
		// @067: getfield int game.C_100302_ka.field_101886_Kb
		// @06A: iload_0
		// @06B: iconst_m1
		// @06C: iconst_0
		// @06D: getstatic game.C_100302_ka game.C_100127_tl.field_104946_d
		// @070: getfield int game.C_100302_ka.field_101886_Kb
		// @073: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @076: iload #10
		// @078: iload #5
		// @07A: iload_0
		// @07B: iadd
		// @07C: iadd
		// @07D: istore #10
		// @07F: getstatic game.C_100302_ka game.C_100291_jj.field_106874_d
		// @082: iconst_5
		// @083: iload #7
		// @085: iconst_m1
		// @086: iload #10
		// @088: getstatic game.C_100302_ka game.C_100291_jj.field_106874_d
		// @08B: ldc 218000 (0x35390)
		// @08D: invokevirtual game.C_100302_ka.func_101818_j(int)int
		// @090: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @093: getstatic game.C_100302_ka game.C_100032_gk.field_103140_X
		// @096: ldc 218000 (0x35390)
		// @098: invokevirtual game.C_100302_ka.func_101818_j(int)int
		// @09B: istore #11
		// @09D: getstatic game.C_100302_ka game.C_100032_gk.field_103140_X
		// @0A0: iload #11
		// @0A2: ineg
		// @0A3: bipush -5 (0xFB)
		// @0A5: iadd
		// @0A6: iload #9
		// @0A8: iadd
		// @0A9: iload #7
		// @0AB: iconst_m1
		// @0AC: iload #10
		// @0AE: iload #11
		// @0B0: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @0B3: iload #10
		// @0B5: iload #7
		// @0B7: iadd
		// @0B8: bipush -5 (0xFB)
		// @0BA: isub
		// @0BB: istore #12
		// @0BD: iload_2
		// @0BE: bipush -65 (0xBF)
		// @0C0: if_icmplt @0CB
		// @0C3: iconst_0
		// @0C4: invokestatic game.C_100044_vm.func_100938_a(boolean)void
		// @0C7: goto @0CB
		// @0CA: athrow
		// @0CB: getstatic game.C_100302_ka game.C_100146_bf.field_105127_a
		// @0CE: iconst_0
		// @0CF: iload_3
		// @0D0: iconst_m1
		// @0D1: iconst_0
		// @0D2: iload #9
		// @0D4: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @0D7: getstatic game.C_100302_ka game.C_100018_wk.field_101531_T
		// @0DA: iconst_0
		// @0DB: iload #12
		// @0DD: iconst_m1
		// @0DE: iload_3
		// @0DF: iload #9
		// @0E1: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @0E4: iload #12
		// @0E6: iload_3
		// @0E7: iadd
		// @0E8: istore #12
		// @0EA: getstatic game.C_100302_ka game.C_100018_wk.field_101531_T
		// @0ED: ldc 11579568 (0xb0b0b0)
		// @0EF: iconst_1
		// @0F0: ldc 8421504 (0x808080)
		// @0F2: iconst_3
		// @0F3: ldc 2105376 (0x202020)
		// @0F5: getstatic game.C_100302_ka game.C_100018_wk.field_101531_T
		// @0F8: getfield int game.C_100302_ka.field_101848_lb
		// @0FB: invokestatic game.C_100265_mh.func_106563_a(int, boolean, int, int, int, int)game.C_100037_wb[]
		// @0FE: putfield game.C_100037_wb[] game.C_100302_ka.field_101862_T
		// @101: getstatic game.C_100302_ka game.C_100154_sl.field_105332_e
		// @104: iload #6
		// @106: iload #9
		// @108: iconst_2
		// @109: idiv
		// @10A: isub
		// @10B: iload #12
		// @10D: iconst_m1
		// @10E: iload #8
		// @110: iload #12
		// @112: iconst_2
		// @113: idiv
		// @114: isub
		// @115: iload #9
		// @117: invokevirtual game.C_100302_ka.func_101825_a(int, int, int, int, int)void
		// @11A: goto @19E
		// @11D: astore #9
		// @11F: aload #9
		// @121: new java.lang.StringBuilder
		// @124: dup
		// @125: invokespecial java.lang.StringBuilder.<init>()void
		// @128: getstatic java.lang.String[] game.C_100044_vm.field_100951_z
		// @12B: iconst_4
		// @12C: aaload
		// @12D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @130: iload_0
		// @131: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @134: bipush 44 (0x2C)
		// @136: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @139: aload_1
		// @13A: ifnull @146
		// @13D: getstatic java.lang.String[] game.C_100044_vm.field_100951_z
		// @140: iconst_2
		// @141: aaload
		// @142: goto @14B
		// @145: athrow
		// @146: getstatic java.lang.String[] game.C_100044_vm.field_100951_z
		// @149: iconst_0
		// @14A: aaload
		// @14B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @14E: bipush 44 (0x2C)
		// @150: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @153: iload_2
		// @154: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @157: bipush 44 (0x2C)
		// @159: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @15C: iload_3
		// @15D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @160: bipush 44 (0x2C)
		// @162: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @165: iload #4
		// @167: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @16A: bipush 44 (0x2C)
		// @16C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @16F: iload #5
		// @171: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @174: bipush 44 (0x2C)
		// @176: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @179: iload #6
		// @17B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @17E: bipush 44 (0x2C)
		// @180: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @183: iload #7
		// @185: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @188: bipush 44 (0x2C)
		// @18A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @18D: iload #8
		// @18F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @192: bipush 41 (0x29)
		// @194: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @197: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @19A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @19D: athrow
		// @19E: return
	}
	
	private final void func_100939_a(int arg0, C_100121_ud arg1, int arg2, int[] arg3, int arg4, int arg5)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #12
		// @005: iconst_m1
		// @006: iconst_4
		// @007: aload_0
		// @008: getfield game.C_100210_qa game.C_100044_vm.field_100948_p
		// @00B: getfield int[] game.C_100210_qa.field_101060_I
		// @00E: aload_2
		// @00F: getfield int game.C_100121_ud.field_100725_m
		// @012: iaload
		// @013: iand
		// @014: iconst_m1
		// @015: ixor
		// @016: if_icmpeq @18B
		// @019: iconst_m1
		// @01A: aload_2
		// @01B: getfield int game.C_100121_ud.field_100733_r
		// @01E: iconst_m1
		// @01F: ixor
		// @020: if_icmpge @18B
		// @023: goto @027
		// @026: athrow
		// @027: aload_0
		// @028: getfield game.C_100210_qa game.C_100044_vm.field_100948_p
		// @02B: getfield int[] game.C_100210_qa.field_101081_y
		// @02E: aload_2
		// @02F: getfield int game.C_100121_ud.field_100725_m
		// @032: iaload
		// @033: getstatic int game.C_100177_cj.field_105660_u
		// @036: idiv
		// @037: istore #7
		// @039: iload #7
		// @03B: ldc 1048575 (0xfffff)
		// @03D: iadd
		// @03E: aload_2
		// @03F: getfield int game.C_100121_ud.field_100713_D
		// @042: ineg
		// @043: iadd
		// @044: iload #7
		// @046: idiv
		// @047: istore #8
		// @049: iload #8
		// @04B: iload #6
		// @04D: if_icmple @05E
		// @050: iload #12
		// @052: ifne @08A
		// @055: iload #12
		// @057: ifeq @17D
		// @05A: goto @05E
		// @05D: athrow
		// @05E: aload_2
		// @05F: getfield game.C_100117_p game.C_100121_ud.field_100730_u
		// @062: aload #4
		// @064: iload #5
		// @066: iload #8
		// @068: invokevirtual game.C_100117_p.func_100910_a(int[], int, int)void
		// @06B: iload #5
		// @06D: iload #8
		// @06F: iadd
		// @070: istore #5
		// @072: aload_2
		// @073: dup
		// @074: getfield int game.C_100121_ud.field_100713_D
		// @077: iload #7
		// @079: iload #8
		// @07B: imul
		// @07C: ldc 1048576 (0x100000)
		// @07E: isub
		// @07F: iadd
		// @080: putfield int game.C_100121_ud.field_100713_D
		// @083: iload #6
		// @085: iload #8
		// @087: isub
		// @088: istore #6
		// @08A: getstatic int game.C_100177_cj.field_105660_u
		// @08D: bipush 100 (0x64)
		// @08F: idiv
		// @090: istore #9
		// @092: ldc 262144 (0x40000)
		// @094: iload #7
		// @096: idiv
		// @097: istore #10
		// @099: iload #9
		// @09B: iload #10
		// @09D: if_icmpgt @0A4
		// @0A0: goto @0A8
		// @0A3: athrow
		// @0A4: iload #10
		// @0A6: istore #9
		// @0A8: aload_2
		// @0A9: getfield game.C_100117_p game.C_100121_ud.field_100730_u
		// @0AC: astore #11
		// @0AE: iconst_m1
		// @0AF: aload_0
		// @0B0: getfield game.C_100210_qa game.C_100044_vm.field_100948_p
		// @0B3: getfield int[] game.C_100210_qa.field_101059_H
		// @0B6: aload_2
		// @0B7: getfield int game.C_100121_ud.field_100725_m
		// @0BA: iaload
		// @0BB: iconst_m1
		// @0BC: ixor
		// @0BD: if_icmpeq @112
		// @0C0: aload_2
		// @0C1: aload_2
		// @0C2: getfield game.C_100214_al game.C_100121_ud.field_100731_t
		// @0C5: aload #11
		// @0C7: invokevirtual game.C_100117_p.func_100983_k()int
		// @0CA: iconst_0
		// @0CB: aload #11
		// @0CD: invokevirtual game.C_100117_p.func_100969_i()int
		// @0D0: invokestatic game.C_100117_p.func_100978_a(game.C_100214_al, int, int, int)game.C_100117_p
		// @0D3: putfield game.C_100117_p game.C_100121_ud.field_100730_u
		// @0D6: aload_0
		// @0D7: getfield game.C_100210_qa game.C_100044_vm.field_100948_p
		// @0DA: aload_2
		// @0DB: getfield game.C_100236_on game.C_100121_ud.field_100726_j
		// @0DE: getfield short[] game.C_100236_on.field_100907_q
		// @0E1: aload_2
		// @0E2: getfield int game.C_100121_ud.field_100736_z
		// @0E5: saload
		// @0E6: iconst_m1
		// @0E7: ixor
		// @0E8: iconst_m1
		// @0E9: if_icmple @0F5
		// @0EC: goto @0F0
		// @0EF: athrow
		// @0F0: iconst_1
		// @0F1: goto @0F6
		// @0F4: athrow
		// @0F5: iconst_0
		// @0F6: aload_2
		// @0F7: iload_3
		// @0F8: sipush -31517 (0x84E3)
		// @0FB: iadd
		// @0FC: invokevirtual game.C_100210_qa.func_101046_a(boolean, game.C_100121_ud, int)void
		// @0FF: aload_2
		// @100: getfield game.C_100117_p game.C_100121_ud.field_100730_u
		// @103: iload #9
		// @105: aload #11
		// @107: invokevirtual game.C_100117_p.func_100988_j()int
		// @10A: invokevirtual game.C_100117_p.func_100965_a(int, int)void
		// @10D: iload #12
		// @10F: ifeq @130
		// @112: aload_2
		// @113: aload_2
		// @114: getfield game.C_100214_al game.C_100121_ud.field_100731_t
		// @117: aload #11
		// @119: invokevirtual game.C_100117_p.func_100983_k()int
		// @11C: aload #11
		// @11E: invokevirtual game.C_100117_p.func_100988_j()int
		// @121: aload #11
		// @123: invokevirtual game.C_100117_p.func_100969_i()int
		// @126: invokestatic game.C_100117_p.func_100978_a(game.C_100214_al, int, int, int)game.C_100117_p
		// @129: putfield game.C_100117_p game.C_100121_ud.field_100730_u
		// @12C: goto @130
		// @12F: athrow
		// @130: iconst_m1
		// @131: aload_2
		// @132: getfield game.C_100236_on game.C_100121_ud.field_100726_j
		// @135: getfield short[] game.C_100236_on.field_100907_q
		// @138: aload_2
		// @139: getfield int game.C_100121_ud.field_100736_z
		// @13C: saload
		// @13D: iconst_m1
		// @13E: ixor
		// @13F: if_icmpge @14E
		// @142: aload_2
		// @143: getfield game.C_100117_p game.C_100121_ud.field_100730_u
		// @146: iconst_m1
		// @147: invokevirtual game.C_100117_p.func_100966_j(int)void
		// @14A: goto @14E
		// @14D: athrow
		// @14E: aload #11
		// @150: iload #9
		// @152: invokevirtual game.C_100117_p.func_100972_g(int)void
		// @155: aload #11
		// @157: aload #4
		// @159: iload #5
		// @15B: iload_1
		// @15C: iload #5
		// @15E: ineg
		// @15F: iadd
		// @160: invokevirtual game.C_100117_p.func_100910_a(int[], int, int)void
		// @163: aload #11
		// @165: invokevirtual game.C_100117_p.func_100979_e()boolean
		// @168: ifeq @178
		// @16B: aload_0
		// @16C: getfield game.C_100026_hb game.C_100044_vm.field_100949_n
		// @16F: aload #11
		// @171: invokevirtual game.C_100026_hb.func_100924_b(game.C_100261_md)void
		// @174: goto @178
		// @177: athrow
		// @178: iload #12
		// @17A: ifeq @039
		// @17D: aload_2
		// @17E: dup
		// @17F: getfield int game.C_100121_ud.field_100713_D
		// @182: iload #7
		// @184: iload #6
		// @186: imul
		// @187: iadd
		// @188: putfield int game.C_100121_ud.field_100713_D
		// @18B: aload_2
		// @18C: getfield game.C_100117_p game.C_100121_ud.field_100730_u
		// @18F: aload #4
		// @191: iload #5
		// @193: iload #6
		// @195: invokevirtual game.C_100117_p.func_100910_a(int[], int, int)void
		// @198: iload_3
		// @199: sipush 31615 (0x7B7F)
		// @19C: if_icmpeq @1B7
		// @19F: aload_0
		// @1A0: bipush -111 (0x91)
		// @1A2: aconst_null
		// @1A3: checkcast game.C_100121_ud
		// @1A6: bipush 33 (0x21)
		// @1A8: aconst_null
		// @1A9: checkcast int[]
		// @1AC: bipush -58 (0xC6)
		// @1AE: bipush -113 (0x8F)
		// @1B0: invokespecial game.C_100044_vm.func_100939_a(int, game.C_100121_ud, int, int[], int, int)void
		// @1B3: goto @1B7
		// @1B6: athrow
		// @1B7: goto @230
		// @1BA: astore #7
		// @1BC: aload #7
		// @1BE: new java.lang.StringBuilder
		// @1C1: dup
		// @1C2: invokespecial java.lang.StringBuilder.<init>()void
		// @1C5: getstatic java.lang.String[] game.C_100044_vm.field_100951_z
		// @1C8: bipush 14 (0x0E)
		// @1CA: aaload
		// @1CB: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1CE: iload_1
		// @1CF: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1D2: bipush 44 (0x2C)
		// @1D4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1D7: aload_2
		// @1D8: ifnull @1E4
		// @1DB: getstatic java.lang.String[] game.C_100044_vm.field_100951_z
		// @1DE: iconst_2
		// @1DF: aaload
		// @1E0: goto @1E9
		// @1E3: athrow
		// @1E4: getstatic java.lang.String[] game.C_100044_vm.field_100951_z
		// @1E7: iconst_0
		// @1E8: aaload
		// @1E9: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1EC: bipush 44 (0x2C)
		// @1EE: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1F1: iload_3
		// @1F2: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1F5: bipush 44 (0x2C)
		// @1F7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1FA: aload #4
		// @1FC: ifnull @208
		// @1FF: getstatic java.lang.String[] game.C_100044_vm.field_100951_z
		// @202: iconst_2
		// @203: aaload
		// @204: goto @20D
		// @207: athrow
		// @208: getstatic java.lang.String[] game.C_100044_vm.field_100951_z
		// @20B: iconst_0
		// @20C: aaload
		// @20D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @210: bipush 44 (0x2C)
		// @212: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @215: iload #5
		// @217: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @21A: bipush 44 (0x2C)
		// @21C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @21F: iload #6
		// @221: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @224: bipush 41 (0x29)
		// @226: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @229: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @22C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @22F: athrow
		// @230: return
	}
	
	static final C_100346_ja func_100932_a(boolean arg0, int arg1, int arg2, int arg3)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #5
		// @05: getstatic game.C_100202_qi game.C_100205_qf.field_103676_f
		// @08: bipush 92 (0x5C)
		// @0A: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @0D: checkcast game.C_100346_ja
		// @10: astore #4
		// @12: aconst_null
		// @13: aload #4
		// @15: if_acmpeq @43
		// @18: aload #4
		// @1A: getfield int game.C_100346_ja.field_103493_s
		// @1D: iconst_m1
		// @1E: ixor
		// @1F: iload #5
		// @21: ifne @44
		// @24: iload_1
		// @25: iconst_m1
		// @26: ixor
		// @27: if_icmpne @31
		// @2A: goto @2E
		// @2D: athrow
		// @2E: aload #4
		// @30: areturn
		// @31: getstatic game.C_100202_qi game.C_100205_qf.field_103676_f
		// @34: bipush 30 (0x1E)
		// @36: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @39: checkcast game.C_100346_ja
		// @3C: astore #4
		// @3E: iload #5
		// @40: ifeq @12
		// @43: iload_0
		// @44: ifeq @52
		// @47: aconst_null
		// @48: checkcast game.C_100217_ao
		// @4B: putstatic game.C_100217_ao game.C_100044_vm.field_100947_q
		// @4E: goto @52
		// @51: athrow
		// @52: new game.C_100346_ja
		// @55: dup
		// @56: invokespecial game.C_100346_ja.<init>()void
		// @59: astore #4
		// @5B: aload #4
		// @5D: iload_1
		// @5E: putfield int game.C_100346_ja.field_103493_s
		// @61: aload #4
		// @63: iload_2
		// @64: putfield int game.C_100346_ja.field_103485_l
		// @67: getstatic game.C_100202_qi game.C_100205_qf.field_103676_f
		// @6A: bipush 125 (0x7D)
		// @6C: aload #4
		// @6E: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @71: aload #4
		// @73: bipush -9 (0xF7)
		// @75: iload_3
		// @76: invokestatic game.C_100213_ak.func_105985_a(game.C_100346_ja, byte, int)void
		// @79: aload #4
		// @7B: areturn
		// @7C: astore #4
		// @7E: aload #4
		// @80: new java.lang.StringBuilder
		// @83: dup
		// @84: invokespecial java.lang.StringBuilder.<init>()void
		// @87: getstatic java.lang.String[] game.C_100044_vm.field_100951_z
		// @8A: bipush 9 (0x09)
		// @8C: aaload
		// @8D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @90: iload_0
		// @91: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @94: bipush 44 (0x2C)
		// @96: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @99: iload_1
		// @9A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @9D: bipush 44 (0x2C)
		// @9F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A2: iload_2
		// @A3: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A6: bipush 44 (0x2C)
		// @A8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @AB: iload_3
		// @AC: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @AF: bipush 41 (0x29)
		// @B1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B4: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @B7: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @BA: athrow
	}
	
	final void func_100914_e(int arg0)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #4
		// @05: aload_0
		// @06: getfield game.C_100026_hb game.C_100044_vm.field_100949_n
		// @09: iload_1
		// @0A: invokevirtual game.C_100026_hb.func_100914_e(int)void
		// @0D: aload_0
		// @0E: getfield game.C_100202_qi game.C_100044_vm.field_100943_u
		// @11: bipush 22 (0x16)
		// @13: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @16: checkcast game.C_100121_ud
		// @19: astore_3
		// @1A: aload_3
		// @1B: ifnull @9E
		// @1E: iload #4
		// @20: ifne @C3
		// @23: aload_0
		// @24: getfield game.C_100210_qa game.C_100044_vm.field_100948_p
		// @27: aload_3
		// @28: iconst_0
		// @29: invokevirtual game.C_100210_qa.func_101044_b(game.C_100121_ud, int)boolean
		// @2C: ifeq @3C
		// @2F: goto @33
		// @32: athrow
		// @33: iload #4
		// @35: ifeq @8C
		// @38: goto @3C
		// @3B: athrow
		// @3C: iload_1
		// @3D: istore_2
		// @3E: aload_3
		// @3F: getfield int game.C_100121_ud.field_100727_k
		// @42: iload_2
		// @43: if_icmpge @76
		// @46: aload_0
		// @47: aload_3
		// @48: aload_3
		// @49: getfield int game.C_100121_ud.field_100727_k
		// @4C: bipush -49 (0xCF)
		// @4E: invokespecial game.C_100044_vm.func_100940_a(game.C_100121_ud, int, byte)void
		// @51: iload_2
		// @52: aload_3
		// @53: getfield int game.C_100121_ud.field_100727_k
		// @56: isub
		// @57: istore_2
		// @58: aload_0
		// @59: getfield game.C_100210_qa game.C_100044_vm.field_100948_p
		// @5C: iload_2
		// @5D: iconst_0
		// @5E: ldc 25751758 (0x188f0ce)
		// @60: aload_3
		// @61: aconst_null
		// @62: invokevirtual game.C_100210_qa.func_101045_a(int, int, int, game.C_100121_ud, int[])boolean
		// @65: ifeq @3E
		// @68: iload #4
		// @6A: ifne @82
		// @6D: iload #4
		// @6F: ifeq @8C
		// @72: goto @76
		// @75: athrow
		// @76: aload_0
		// @77: aload_3
		// @78: iload_2
		// @79: bipush -102 (0x9A)
		// @7B: invokespecial game.C_100044_vm.func_100940_a(game.C_100121_ud, int, byte)void
		// @7E: goto @82
		// @81: athrow
		// @82: aload_3
		// @83: dup
		// @84: getfield int game.C_100121_ud.field_100727_k
		// @87: iload_2
		// @88: isub
		// @89: putfield int game.C_100121_ud.field_100727_k
		// @8C: aload_0
		// @8D: getfield game.C_100202_qi game.C_100044_vm.field_100943_u
		// @90: bipush 64 (0x40)
		// @92: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @95: checkcast game.C_100121_ud
		// @98: astore_3
		// @99: iload #4
		// @9B: ifeq @1A
		// @9E: goto @C3
		// @A1: astore_2
		// @A2: aload_2
		// @A3: new java.lang.StringBuilder
		// @A6: dup
		// @A7: invokespecial java.lang.StringBuilder.<init>()void
		// @AA: getstatic java.lang.String[] game.C_100044_vm.field_100951_z
		// @AD: bipush 11 (0x0B)
		// @AF: aaload
		// @B0: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @B3: iload_1
		// @B4: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @B7: bipush 41 (0x29)
		// @B9: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @BC: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @BF: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @C2: athrow
		// @C3: return
	}
	
	final int func_100913_a()
	{
		// @0: iconst_0
		// @1: ireturn
		// @2: astore_1
		// @3: aload_1
		// @4: getstatic java.lang.String[] game.C_100044_vm.field_100951_z
		// @7: bipush 8 (0x08)
		// @9: aaload
		// @A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @D: athrow
	}
	
	final C_100261_md func_100912_c()
	{
		// @00: aload_0
		// @01: getfield game.C_100202_qi game.C_100044_vm.field_100943_u
		// @04: bipush 24 (0x18)
		// @06: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @09: checkcast game.C_100121_ud
		// @0C: astore_1
		// @0D: aconst_null
		// @0E: aload_1
		// @0F: if_acmpne @14
		// @12: aconst_null
		// @13: areturn
		// @14: aconst_null
		// @15: aload_1
		// @16: getfield game.C_100117_p game.C_100121_ud.field_100730_u
		// @19: if_acmpeq @21
		// @1C: aload_1
		// @1D: getfield game.C_100117_p game.C_100121_ud.field_100730_u
		// @20: areturn
		// @21: aload_0
		// @22: invokevirtual game.C_100044_vm.func_100916_d()game.C_100261_md
		// @25: areturn
		// @26: astore_1
		// @27: aload_1
		// @28: getstatic java.lang.String[] game.C_100044_vm.field_100951_z
		// @2B: bipush 10 (0x0A)
		// @2D: aaload
		// @2E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @31: athrow
	}
	
	private final void func_100940_a(C_100121_ud arg0, int arg1, byte arg2)
	{
		// @000: iload_3
		// @001: bipush -22 (0xEA)
		// @003: if_icmplt @00F
		// @006: aload_0
		// @007: invokevirtual game.C_100044_vm.func_100913_a()int
		// @00A: pop
		// @00B: goto @00F
		// @00E: athrow
		// @00F: aload_0
		// @010: getfield game.C_100210_qa game.C_100044_vm.field_100948_p
		// @013: getfield int[] game.C_100210_qa.field_101060_I
		// @016: aload_1
		// @017: getfield int game.C_100121_ud.field_100725_m
		// @01A: iaload
		// @01B: iconst_4
		// @01C: iand
		// @01D: ifeq @10A
		// @020: iconst_0
		// @021: aload_1
		// @022: getfield int game.C_100121_ud.field_100733_r
		// @025: if_icmple @10A
		// @028: goto @02C
		// @02B: athrow
		// @02C: aload_0
		// @02D: getfield game.C_100210_qa game.C_100044_vm.field_100948_p
		// @030: getfield int[] game.C_100210_qa.field_101081_y
		// @033: aload_1
		// @034: getfield int game.C_100121_ud.field_100725_m
		// @037: iaload
		// @038: getstatic int game.C_100177_cj.field_105660_u
		// @03B: idiv
		// @03C: istore #4
		// @03E: iload #4
		// @040: ldc 1048575 (0xfffff)
		// @042: aload_1
		// @043: getfield int game.C_100121_ud.field_100713_D
		// @046: isub
		// @047: iadd
		// @048: iload #4
		// @04A: idiv
		// @04B: istore #5
		// @04D: aload_1
		// @04E: iload #4
		// @050: iload_2
		// @051: imul
		// @052: aload_1
		// @053: getfield int game.C_100121_ud.field_100713_D
		// @056: iadd
		// @057: ldc 1048575 (0xfffff)
		// @059: iand
		// @05A: putfield int game.C_100121_ud.field_100713_D
		// @05D: iload #5
		// @05F: iconst_m1
		// @060: ixor
		// @061: iload_2
		// @062: iconst_m1
		// @063: ixor
		// @064: if_icmpge @06B
		// @067: goto @10A
		// @06A: athrow
		// @06B: iconst_m1
		// @06C: aload_0
		// @06D: getfield game.C_100210_qa game.C_100044_vm.field_100948_p
		// @070: getfield int[] game.C_100210_qa.field_101059_H
		// @073: aload_1
		// @074: getfield int game.C_100121_ud.field_100725_m
		// @077: iaload
		// @078: iconst_m1
		// @079: ixor
		// @07A: if_icmpne @0A7
		// @07D: aload_1
		// @07E: aload_1
		// @07F: getfield game.C_100214_al game.C_100121_ud.field_100731_t
		// @082: aload_1
		// @083: getfield game.C_100117_p game.C_100121_ud.field_100730_u
		// @086: invokevirtual game.C_100117_p.func_100983_k()int
		// @089: aload_1
		// @08A: getfield game.C_100117_p game.C_100121_ud.field_100730_u
		// @08D: invokevirtual game.C_100117_p.func_100988_j()int
		// @090: aload_1
		// @091: getfield game.C_100117_p game.C_100121_ud.field_100730_u
		// @094: invokevirtual game.C_100117_p.func_100969_i()int
		// @097: invokestatic game.C_100117_p.func_100978_a(game.C_100214_al, int, int, int)game.C_100117_p
		// @09A: putfield game.C_100117_p game.C_100121_ud.field_100730_u
		// @09D: getstatic int game.SteelSentinels.field_105275_O
		// @0A0: ifeq @0E7
		// @0A3: goto @0A7
		// @0A6: athrow
		// @0A7: aload_1
		// @0A8: aload_1
		// @0A9: getfield game.C_100214_al game.C_100121_ud.field_100731_t
		// @0AC: aload_1
		// @0AD: getfield game.C_100117_p game.C_100121_ud.field_100730_u
		// @0B0: invokevirtual game.C_100117_p.func_100983_k()int
		// @0B3: iconst_0
		// @0B4: aload_1
		// @0B5: getfield game.C_100117_p game.C_100121_ud.field_100730_u
		// @0B8: invokevirtual game.C_100117_p.func_100969_i()int
		// @0BB: invokestatic game.C_100117_p.func_100978_a(game.C_100214_al, int, int, int)game.C_100117_p
		// @0BE: putfield game.C_100117_p game.C_100121_ud.field_100730_u
		// @0C1: aload_0
		// @0C2: getfield game.C_100210_qa game.C_100044_vm.field_100948_p
		// @0C5: iconst_m1
		// @0C6: aload_1
		// @0C7: getfield game.C_100236_on game.C_100121_ud.field_100726_j
		// @0CA: getfield short[] game.C_100236_on.field_100907_q
		// @0CD: aload_1
		// @0CE: getfield int game.C_100121_ud.field_100736_z
		// @0D1: saload
		// @0D2: iconst_m1
		// @0D3: ixor
		// @0D4: if_icmpge @0E0
		// @0D7: goto @0DB
		// @0DA: athrow
		// @0DB: iconst_1
		// @0DC: goto @0E1
		// @0DF: athrow
		// @0E0: iconst_0
		// @0E1: aload_1
		// @0E2: bipush 117 (0x75)
		// @0E4: invokevirtual game.C_100210_qa.func_101046_a(boolean, game.C_100121_ud, int)void
		// @0E7: aload_1
		// @0E8: getfield game.C_100236_on game.C_100121_ud.field_100726_j
		// @0EB: getfield short[] game.C_100236_on.field_100907_q
		// @0EE: aload_1
		// @0EF: getfield int game.C_100121_ud.field_100736_z
		// @0F2: saload
		// @0F3: iflt @0FA
		// @0F6: goto @102
		// @0F9: athrow
		// @0FA: aload_1
		// @0FB: getfield game.C_100117_p game.C_100121_ud.field_100730_u
		// @0FE: iconst_m1
		// @0FF: invokevirtual game.C_100117_p.func_100966_j(int)void
		// @102: aload_1
		// @103: getfield int game.C_100121_ud.field_100713_D
		// @106: iload #4
		// @108: idiv
		// @109: istore_2
		// @10A: aload_1
		// @10B: getfield game.C_100117_p game.C_100121_ud.field_100730_u
		// @10E: iload_2
		// @10F: invokevirtual game.C_100117_p.func_100914_e(int)void
		// @112: goto @15C
		// @115: astore #4
		// @117: aload #4
		// @119: new java.lang.StringBuilder
		// @11C: dup
		// @11D: invokespecial java.lang.StringBuilder.<init>()void
		// @120: getstatic java.lang.String[] game.C_100044_vm.field_100951_z
		// @123: bipush 7 (0x07)
		// @125: aaload
		// @126: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @129: aload_1
		// @12A: ifnull @136
		// @12D: getstatic java.lang.String[] game.C_100044_vm.field_100951_z
		// @130: iconst_2
		// @131: aaload
		// @132: goto @13B
		// @135: athrow
		// @136: getstatic java.lang.String[] game.C_100044_vm.field_100951_z
		// @139: iconst_0
		// @13A: aaload
		// @13B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @13E: bipush 44 (0x2C)
		// @140: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @143: iload_2
		// @144: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @147: bipush 44 (0x2C)
		// @149: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @14C: iload_3
		// @14D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @150: bipush 41 (0x29)
		// @152: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @155: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @158: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @15B: athrow
		// @15C: return
	}
	
	final C_100261_md func_100916_d()
	{
		// @00: aload_0
		// @01: getfield game.C_100202_qi game.C_100044_vm.field_100943_u
		// @04: bipush 85 (0x55)
		// @06: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @09: checkcast game.C_100121_ud
		// @0C: astore_1
		// @0D: aload_1
		// @0E: ifnull @15
		// @11: goto @17
		// @14: athrow
		// @15: aconst_null
		// @16: areturn
		// @17: aload_1
		// @18: getfield game.C_100117_p game.C_100121_ud.field_100730_u
		// @1B: ifnull @23
		// @1E: aload_1
		// @1F: getfield game.C_100117_p game.C_100121_ud.field_100730_u
		// @22: areturn
		// @23: goto @00
		// @26: astore_1
		// @27: aload_1
		// @28: getstatic java.lang.String[] game.C_100044_vm.field_100951_z
		// @2B: bipush 12 (0x0C)
		// @2D: aaload
		// @2E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @31: athrow
	}
	
	public static void func_100938_a(boolean arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100044_vm.field_100953_x
		// @04: aconst_null
		// @05: putstatic game.C_100153_be game.C_100044_vm.field_100944_t
		// @08: aconst_null
		// @09: putstatic game.C_100217_ao game.C_100044_vm.field_100947_q
		// @0C: aconst_null
		// @0D: putstatic java.lang.String game.C_100044_vm.field_100942_v
		// @10: aconst_null
		// @11: putstatic java.lang.String game.C_100044_vm.field_100952_y
		// @14: aconst_null
		// @15: putstatic java.lang.String game.C_100044_vm.field_100941_w
		// @18: iload_0
		// @19: iconst_1
		// @1A: if_icmpeq @26
		// @1D: bipush -41 (0xD7)
		// @1F: putstatic int game.C_100044_vm.field_100945_s
		// @22: goto @26
		// @25: athrow
		// @26: aconst_null
		// @27: putstatic java.lang.String game.C_100044_vm.field_100950_o
		// @2A: goto @4E
		// @2D: astore_1
		// @2E: aload_1
		// @2F: new java.lang.StringBuilder
		// @32: dup
		// @33: invokespecial java.lang.StringBuilder.<init>()void
		// @36: getstatic java.lang.String[] game.C_100044_vm.field_100951_z
		// @39: iconst_3
		// @3A: aaload
		// @3B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3E: iload_0
		// @3F: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @42: bipush 41 (0x29)
		// @44: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @47: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4D: athrow
		// @4E: return
	}
	
	C_100044_vm(C_100210_qa arg0)
	{
		// @00: aload_0
		// @01: invokespecial game.C_100261_md.<init>()void
		// @04: aload_0
		// @05: new game.C_100202_qi
		// @08: dup
		// @09: invokespecial game.C_100202_qi.<init>()void
		// @0C: putfield game.C_100202_qi game.C_100044_vm.field_100943_u
		// @0F: aload_0
		// @10: new game.C_100026_hb
		// @13: dup
		// @14: invokespecial game.C_100026_hb.<init>()void
		// @17: putfield game.C_100026_hb game.C_100044_vm.field_100949_n
		// @1A: aload_0
		// @1B: aload_1
		// @1C: putfield game.C_100210_qa game.C_100044_vm.field_100948_p
		// @1F: goto @55
		// @22: astore_2
		// @23: aload_2
		// @24: new java.lang.StringBuilder
		// @27: dup
		// @28: invokespecial java.lang.StringBuilder.<init>()void
		// @2B: getstatic java.lang.String[] game.C_100044_vm.field_100951_z
		// @2E: bipush 6 (0x06)
		// @30: aaload
		// @31: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @34: aload_1
		// @35: ifnull @41
		// @38: getstatic java.lang.String[] game.C_100044_vm.field_100951_z
		// @3B: iconst_2
		// @3C: aaload
		// @3D: goto @46
		// @40: athrow
		// @41: getstatic java.lang.String[] game.C_100044_vm.field_100951_z
		// @44: iconst_0
		// @45: aaload
		// @46: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @49: bipush 41 (0x29)
		// @4B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @51: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @54: athrow
		// @55: return
	}
	
	static
	{
		// @000: bipush 15 (0x0F)
		// @002: anewarray java.lang.String
		// @005: dup
		// @006: iconst_0
		// @007: ldc "C8\u0000h"
		// @009: invokestatic game.C_100044_vm.func_100936_z(java.lang.String)char[]
		// @00C: invokestatic game.C_100044_vm.func_100935_z(char[])java.lang.String
		// @00F: aastore
		// @010: dup
		// @011: iconst_1
		// @012: ldc "[ BL;"
		// @014: invokestatic game.C_100044_vm.func_100936_z(java.lang.String)char[]
		// @017: invokestatic game.C_100044_vm.func_100935_z(char[])java.lang.String
		// @01A: aastore
		// @01B: dup
		// @01C: iconst_2
		// @01D: ldc "VcB*n"
		// @01F: invokestatic game.C_100044_vm.func_100936_z(java.lang.String)char[]
		// @022: invokestatic game.C_100044_vm.func_100935_z(char[])java.lang.String
		// @025: aastore
		// @026: dup
		// @027: iconst_3
		// @028: ldc "[ BQ;"
		// @02A: invokestatic game.C_100044_vm.func_100936_z(java.lang.String)char[]
		// @02D: invokestatic game.C_100044_vm.func_100935_z(char[])java.lang.String
		// @030: aastore
		// @031: dup
		// @032: iconst_4
		// @033: ldc "[ BP;"
		// @035: invokestatic game.C_100044_vm.func_100936_z(java.lang.String)char[]
		// @038: invokestatic game.C_100044_vm.func_100935_z(char[])java.lang.String
		// @03B: aastore
		// @03C: dup
		// @03D: iconst_5
		// @03E: ldc "[ BU;"
		// @040: invokestatic game.C_100044_vm.func_100936_z(java.lang.String)char[]
		// @043: invokestatic game.C_100044_vm.func_100935_z(char[])java.lang.String
		// @046: aastore
		// @047: dup
		// @048: bipush 6 (0x06)
		// @04A: ldc "[ B8zC$\u0018:;"
		// @04C: invokestatic game.C_100044_vm.func_100936_z(java.lang.String)char[]
		// @04F: invokestatic game.C_100044_vm.func_100935_z(char[])java.lang.String
		// @052: aastore
		// @053: dup
		// @054: bipush 7 (0x07)
		// @056: ldc "[ BV;"
		// @058: invokestatic game.C_100044_vm.func_100936_z(java.lang.String)char[]
		// @05B: invokestatic game.C_100044_vm.func_100935_z(char[])java.lang.String
		// @05E: aastore
		// @05F: dup
		// @060: bipush 8 (0x08)
		// @062: ldc "[ B@;\u0004"
		// @064: invokestatic game.C_100044_vm.func_100936_z(java.lang.String)char[]
		// @067: invokestatic game.C_100044_vm.func_100935_z(char[])java.lang.String
		// @06A: aastore
		// @06B: dup
		// @06C: bipush 9 (0x09)
		// @06E: ldc "[ BW;"
		// @070: invokestatic game.C_100044_vm.func_100936_z(java.lang.String)char[]
		// @073: invokestatic game.C_100044_vm.func_100935_z(char[])java.lang.String
		// @076: aastore
		// @077: dup
		// @078: bipush 10 (0x0A)
		// @07A: ldc "[ BA;\u0004"
		// @07C: invokestatic game.C_100044_vm.func_100936_z(java.lang.String)char[]
		// @07F: invokestatic game.C_100044_vm.func_100935_z(char[])java.lang.String
		// @082: aastore
		// @083: dup
		// @084: bipush 11 (0x0B)
		// @086: ldc "[ BF;"
		// @088: invokestatic game.C_100044_vm.func_100936_z(java.lang.String)char[]
		// @08B: invokestatic game.C_100044_vm.func_100935_z(char[])java.lang.String
		// @08E: aastore
		// @08F: dup
		// @090: bipush 12 (0x0C)
		// @092: ldc "[ BB;\u0004"
		// @094: invokestatic game.C_100044_vm.func_100936_z(java.lang.String)char[]
		// @097: invokestatic game.C_100044_vm.func_100935_z(char[])java.lang.String
		// @09A: aastore
		// @09B: dup
		// @09C: bipush 13 (0x0D)
		// @09E: ldc "[ BE;"
		// @0A0: invokestatic game.C_100044_vm.func_100936_z(java.lang.String)char[]
		// @0A3: invokestatic game.C_100044_vm.func_100935_z(char[])java.lang.String
		// @0A6: aastore
		// @0A7: dup
		// @0A8: bipush 14 (0x0E)
		// @0AA: ldc "[ BM;"
		// @0AC: invokestatic game.C_100044_vm.func_100936_z(java.lang.String)char[]
		// @0AF: invokestatic game.C_100044_vm.func_100935_z(char[])java.lang.String
		// @0B2: aastore
		// @0B3: putstatic java.lang.String[] game.C_100044_vm.field_100951_z
		// @0B6: new game.C_100217_ao
		// @0B9: dup
		// @0BA: bipush 13 (0x0D)
		// @0BC: iconst_0
		// @0BD: iconst_1
		// @0BE: iconst_0
		// @0BF: invokespecial game.C_100217_ao.<init>(int, int, int, int)void
		// @0C2: putstatic game.C_100217_ao game.C_100044_vm.field_100947_q
		// @0C5: ldc "~=\tggL9\t$/\u0008}R#`\r*\riv"
		// @0C7: invokestatic game.C_100044_vm.func_100936_z(java.lang.String)char[]
		// @0CA: invokestatic game.C_100044_vm.func_100935_z(char[])java.lang.String
		// @0CD: putstatic java.lang.String game.C_100044_vm.field_100942_v
		// @0D0: new game.C_100153_be
		// @0D3: dup
		// @0D4: sipush 192 (0x00C0)
		// @0D7: sipush 192 (0x00C0)
		// @0DA: sipush 256 (0x0100)
		// @0DD: invokespecial game.C_100153_be.<init>(int, int, int)void
		// @0E0: putstatic game.C_100153_be game.C_100044_vm.field_100944_t
		// @0E3: iconst_0
		// @0E4: istore_0
		// @0E5: bipush -96 (0xA0)
		// @0E7: istore_2
		// @0E8: bipush 96 (0x60)
		// @0EA: iload_2
		// @0EB: if_icmple @193
		// @0EE: bipush -96 (0xA0)
		// @0F0: istore_3
		// @0F1: iload_3
		// @0F2: bipush 96 (0x60)
		// @0F4: if_icmpge @18D
		// @0F7: ldc2_w 64.0
		// @0FA: iload_3
		// @0FB: invokestatic java.lang.Math.abs(int)int
		// @0FE: i2d
		// @0FF: iload_2
		// @100: i2d
		// @101: invokestatic java.lang.Math.atan2(double, double)double
		// @104: dmul
		// @105: ldc2_w 3.141592653589793
		// @108: ddiv
		// @109: d2i
		// @10A: istore_1
		// @10B: iconst_1
		// @10C: iload_1
		// @10D: if_icmpgt @114
		// @110: goto @116
		// @113: athrow
		// @114: iconst_1
		// @115: istore_1
		// @116: bipush -128 (0x80)
		// @118: iload_1
		// @119: iconst_m1
		// @11A: ixor
		// @11B: if_icmple @121
		// @11E: bipush 127 (0x7F)
		// @120: istore_1
		// @121: getstatic game.C_100153_be game.C_100044_vm.field_100944_t
		// @124: getfield byte[] game.C_100153_be.field_105319_u
		// @127: iload_0
		// @128: iinc #0 +1
		// @12B: iload_1
		// @12C: i2b
		// @12D: bastore
		// @12E: sipush 6724 (0x1A44)
		// @131: iload_3
		// @132: iload_3
		// @133: imul
		// @134: iload_2
		// @135: iload_2
		// @136: imul
		// @137: iadd
		// @138: if_icmpgt @13F
		// @13B: goto @14F
		// @13E: athrow
		// @13F: getstatic game.C_100153_be game.C_100044_vm.field_100944_t
		// @142: getfield byte[] game.C_100153_be.field_105319_u
		// @145: iconst_m1
		// @146: iload_0
		// @147: iadd
		// @148: dup2
		// @149: baload
		// @14A: bipush 127 (0x7F)
		// @14C: iadd
		// @14D: i2b
		// @14E: bastore
		// @14F: sipush 8100 (0x1FA4)
		// @152: iload_3
		// @153: iload_3
		// @154: imul
		// @155: iload_2
		// @156: iload_2
		// @157: imul
		// @158: iadd
		// @159: if_icmpge @16B
		// @15C: getstatic game.C_100153_be game.C_100044_vm.field_100944_t
		// @15F: getfield byte[] game.C_100153_be.field_105319_u
		// @162: iload_0
		// @163: iconst_m1
		// @164: iadd
		// @165: iconst_0
		// @166: bastore
		// @167: goto @16B
		// @16A: athrow
		// @16B: iload_2
		// @16C: iload_2
		// @16D: imul
		// @16E: iload_3
		// @16F: iload_3
		// @170: imul
		// @171: iadd
		// @172: sipush 4900 (0x1324)
		// @175: if_icmplt @17C
		// @178: goto @187
		// @17B: athrow
		// @17C: getstatic game.C_100153_be game.C_100044_vm.field_100944_t
		// @17F: getfield byte[] game.C_100153_be.field_105319_u
		// @182: iconst_m1
		// @183: iload_0
		// @184: iadd
		// @185: iconst_0
		// @186: bastore
		// @187: iinc #3 +1
		// @18A: goto @0F1
		// @18D: iinc #2 +1
		// @190: goto @0E8
		// @193: ldc "\u0011/\u001e:/N\"\u00009uK+\nbu\u0013,\u0002`3Y%\t$uB!\u0000kdD#\u000b$"
		// @195: invokestatic game.C_100044_vm.func_100936_z(java.lang.String)char[]
		// @198: invokestatic game.C_100044_vm.func_100935_z(char[])java.lang.String
		// @19B: putstatic java.lang.String game.C_100044_vm.field_100952_y
		// @19E: ldc "},\u001fwdB?\u0008w3@8\u001fp3O(LfvY:\ta}\rxLe}Im^43N%\rvrN9\tv`\r!\u0003jt"
		// @1A0: invokestatic game.C_100044_vm.func_100936_z(java.lang.String)char[]
		// @1A3: invokestatic game.C_100044_vm.func_100935_z(char[])java.lang.String
		// @1A6: putstatic java.lang.String game.C_100044_vm.field_100941_w
		// @1A9: ldc "~8\u000bcv^9\t`3C,\u0001a`\u0017m"
		// @1AB: invokestatic game.C_100044_vm.func_100936_z(java.lang.String)char[]
		// @1AE: invokestatic game.C_100044_vm.func_100935_z(char[])java.lang.String
		// @1B1: putstatic java.lang.String game.C_100044_vm.field_100950_o
		// @1B4: ldc "E"
		// @1B6: putstatic java.lang.String game.C_100044_vm.field_100953_x
		// @1B9: return
	}
	
	private static char[] func_100936_z(String arg0)
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
		// @0E: bipush 19 (0x13)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_100935_z(char[] arg0)
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
		// @10: tableswitch def: @43, for 0: @30, for 1: @35, for 2: @3A, for 3: @3F
		// @30: bipush 45 (0x2D)
		// @32: goto @45
		// @35: bipush 77 (0x4D)
		// @37: goto @45
		// @3A: bipush 108 (0x6C)
		// @3C: goto @45
		// @3F: iconst_4
		// @40: goto @45
		// @43: bipush 19 (0x13)
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
