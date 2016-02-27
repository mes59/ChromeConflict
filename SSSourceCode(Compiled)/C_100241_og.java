package game;

final class C_100241_og
{
	private int field_106334_c;
	private int field_106335_a;
	private int field_106332_e;
	private int field_106333_b;
	private int[] field_106329_f;
	private int field_106330_g;
	private int field_106331_d;
	
	final void func_106328_a(float[] arg0, int arg1, boolean arg2)
	{
		// @000: iconst_0
		// @001: istore #4
		// @003: iload #4
		// @005: iload_2
		// @006: if_icmpge @014
		// @009: aload_1
		// @00A: iload #4
		// @00C: fconst_0
		// @00D: fastore
		// @00E: iinc #4 +1
		// @011: goto @003
		// @014: iload_3
		// @015: ifeq @019
		// @018: return
		// @019: getstatic game.C_100258_lm[] game.C_100319_hk.field_101450_m
		// @01C: aload_0
		// @01D: getfield int game.C_100241_og.field_106332_e
		// @020: aaload
		// @021: getfield int game.C_100258_lm.field_106495_c
		// @024: istore #4
		// @026: aload_0
		// @027: getfield int game.C_100241_og.field_106331_d
		// @02A: aload_0
		// @02B: getfield int game.C_100241_og.field_106330_g
		// @02E: isub
		// @02F: istore #5
		// @031: iload #5
		// @033: aload_0
		// @034: getfield int game.C_100241_og.field_106333_b
		// @037: idiv
		// @038: istore #6
		// @03A: iload #6
		// @03C: newarray int[]
		// @03E: astore #7
		// @040: iconst_0
		// @041: istore #8
		// @043: iload #8
		// @045: bipush 8 (0x08)
		// @047: if_icmpge @180
		// @04A: iconst_0
		// @04B: istore #9
		// @04D: iload #9
		// @04F: iload #6
		// @051: if_icmpge @17A
		// @054: iload #8
		// @056: ifne @099
		// @059: getstatic game.C_100258_lm[] game.C_100319_hk.field_101450_m
		// @05C: aload_0
		// @05D: getfield int game.C_100241_og.field_106332_e
		// @060: aaload
		// @061: invokevirtual game.C_100258_lm.func_106488_a()int
		// @064: istore #10
		// @066: iload #4
		// @068: iconst_1
		// @069: isub
		// @06A: istore #11
		// @06C: iload #11
		// @06E: iflt @099
		// @071: iload #9
		// @073: iload #11
		// @075: iadd
		// @076: iload #6
		// @078: if_icmpge @08A
		// @07B: aload #7
		// @07D: iload #9
		// @07F: iload #11
		// @081: iadd
		// @082: iload #10
		// @084: aload_0
		// @085: getfield int game.C_100241_og.field_106334_c
		// @088: irem
		// @089: iastore
		// @08A: iload #10
		// @08C: aload_0
		// @08D: getfield int game.C_100241_og.field_106334_c
		// @090: idiv
		// @091: istore #10
		// @093: iinc #11 +255
		// @096: goto @06C
		// @099: iconst_0
		// @09A: istore #10
		// @09C: iload #10
		// @09E: iload #4
		// @0A0: if_icmpge @177
		// @0A3: aload #7
		// @0A5: iload #9
		// @0A7: iaload
		// @0A8: istore #11
		// @0AA: aload_0
		// @0AB: getfield int[] game.C_100241_og.field_106329_f
		// @0AE: iload #11
		// @0B0: bipush 8 (0x08)
		// @0B2: imul
		// @0B3: iload #8
		// @0B5: iadd
		// @0B6: iaload
		// @0B7: istore #12
		// @0B9: iload #12
		// @0BB: iflt @164
		// @0BE: aload_0
		// @0BF: getfield int game.C_100241_og.field_106330_g
		// @0C2: iload #9
		// @0C4: aload_0
		// @0C5: getfield int game.C_100241_og.field_106333_b
		// @0C8: imul
		// @0C9: iadd
		// @0CA: istore #13
		// @0CC: getstatic game.C_100258_lm[] game.C_100319_hk.field_101450_m
		// @0CF: iload #12
		// @0D1: aaload
		// @0D2: astore #14
		// @0D4: aload_0
		// @0D5: getfield int game.C_100241_og.field_106335_a
		// @0D8: ifne @129
		// @0DB: aload_0
		// @0DC: getfield int game.C_100241_og.field_106333_b
		// @0DF: aload #14
		// @0E1: getfield int game.C_100258_lm.field_106495_c
		// @0E4: idiv
		// @0E5: istore #15
		// @0E7: iconst_0
		// @0E8: istore #16
		// @0EA: iload #16
		// @0EC: iload #15
		// @0EE: if_icmpge @126
		// @0F1: aload #14
		// @0F3: invokevirtual game.C_100258_lm.func_106487_c()float[]
		// @0F6: astore #17
		// @0F8: iconst_0
		// @0F9: istore #18
		// @0FB: iload #18
		// @0FD: aload #14
		// @0FF: getfield int game.C_100258_lm.field_106495_c
		// @102: if_icmpge @120
		// @105: aload_1
		// @106: iload #13
		// @108: iload #16
		// @10A: iadd
		// @10B: iload #18
		// @10D: iload #15
		// @10F: imul
		// @110: iadd
		// @111: dup2
		// @112: faload
		// @113: aload #17
		// @115: iload #18
		// @117: faload
		// @118: fadd
		// @119: fastore
		// @11A: iinc #18 +1
		// @11D: goto @0FB
		// @120: iinc #16 +1
		// @123: goto @0EA
		// @126: goto @164
		// @129: iconst_0
		// @12A: istore #15
		// @12C: iload #15
		// @12E: aload_0
		// @12F: getfield int game.C_100241_og.field_106333_b
		// @132: if_icmpge @164
		// @135: aload #14
		// @137: invokevirtual game.C_100258_lm.func_106487_c()float[]
		// @13A: astore #16
		// @13C: iconst_0
		// @13D: istore #17
		// @13F: iload #17
		// @141: aload #14
		// @143: getfield int game.C_100258_lm.field_106495_c
		// @146: if_icmpge @161
		// @149: aload_1
		// @14A: iload #13
		// @14C: iload #15
		// @14E: iadd
		// @14F: dup2
		// @150: faload
		// @151: aload #16
		// @153: iload #17
		// @155: faload
		// @156: fadd
		// @157: fastore
		// @158: iinc #15 +1
		// @15B: iinc #17 +1
		// @15E: goto @13F
		// @161: goto @12C
		// @164: iinc #9 +1
		// @167: iload #9
		// @169: iload #6
		// @16B: if_icmplt @171
		// @16E: goto @177
		// @171: iinc #10 +1
		// @174: goto @09C
		// @177: goto @04D
		// @17A: iinc #8 +1
		// @17D: goto @043
		// @180: return
	}
	
	C_100241_og()
	{
		// @00: aload_0
		// @01: invokespecial java.lang.Object.<init>()void
		// @04: aload_0
		// @05: bipush 16 (0x10)
		// @07: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @0A: putfield int game.C_100241_og.field_106335_a
		// @0D: aload_0
		// @0E: bipush 24 (0x18)
		// @10: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @13: putfield int game.C_100241_og.field_106330_g
		// @16: aload_0
		// @17: bipush 24 (0x18)
		// @19: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @1C: putfield int game.C_100241_og.field_106331_d
		// @1F: aload_0
		// @20: bipush 24 (0x18)
		// @22: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @25: iconst_1
		// @26: iadd
		// @27: putfield int game.C_100241_og.field_106333_b
		// @2A: aload_0
		// @2B: bipush 6 (0x06)
		// @2D: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @30: iconst_1
		// @31: iadd
		// @32: putfield int game.C_100241_og.field_106334_c
		// @35: aload_0
		// @36: bipush 8 (0x08)
		// @38: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @3B: putfield int game.C_100241_og.field_106332_e
		// @3E: aload_0
		// @3F: getfield int game.C_100241_og.field_106334_c
		// @42: newarray int[]
		// @44: astore_1
		// @45: iconst_0
		// @46: istore_2
		// @47: iload_2
		// @48: aload_0
		// @49: getfield int game.C_100241_og.field_106334_c
		// @4C: if_icmpge @7D
		// @4F: iconst_0
		// @50: istore_3
		// @51: iconst_3
		// @52: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @55: istore #4
		// @57: invokestatic game.C_100319_hk.func_101426_a()int
		// @5A: ifeq @61
		// @5D: iconst_1
		// @5E: goto @62
		// @61: iconst_0
		// @62: istore #5
		// @64: iload #5
		// @66: ifeq @6E
		// @69: iconst_5
		// @6A: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @6D: istore_3
		// @6E: aload_1
		// @6F: iload_2
		// @70: iload_3
		// @71: iconst_3
		// @72: ishl
		// @73: iload #4
		// @75: ior
		// @76: iastore
		// @77: iinc #2 +1
		// @7A: goto @47
		// @7D: aload_0
		// @7E: aload_0
		// @7F: getfield int game.C_100241_og.field_106334_c
		// @82: bipush 8 (0x08)
		// @84: imul
		// @85: newarray int[]
		// @87: putfield int[] game.C_100241_og.field_106329_f
		// @8A: iconst_0
		// @8B: istore_2
		// @8C: iload_2
		// @8D: aload_0
		// @8E: getfield int game.C_100241_og.field_106334_c
		// @91: bipush 8 (0x08)
		// @93: imul
		// @94: if_icmpge @BB
		// @97: aload_0
		// @98: getfield int[] game.C_100241_og.field_106329_f
		// @9B: iload_2
		// @9C: aload_1
		// @9D: iload_2
		// @9E: iconst_3
		// @9F: ishr
		// @A0: iaload
		// @A1: iconst_1
		// @A2: iload_2
		// @A3: bipush 7 (0x07)
		// @A5: iand
		// @A6: ishl
		// @A7: iand
		// @A8: ifeq @B3
		// @AB: bipush 8 (0x08)
		// @AD: invokestatic game.C_100319_hk.func_101422_f(int)int
		// @B0: goto @B4
		// @B3: iconst_m1
		// @B4: iastore
		// @B5: iinc #2 +1
		// @B8: goto @8C
		// @BB: return
	}
}
