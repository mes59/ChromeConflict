package game;

import java.util.Hashtable;

class C_100336_im extends C_100158_da
{
	static String field_102546_r;
	static String field_102548_p;
	int field_102541_w;
	int field_102532_A;
	boolean field_102539_j;
	static C_100098_h field_102545_s;
	C_100337_in field_102543_u;
	static String field_102542_v;
	int field_102537_l;
	static C_100033_gj field_102547_q;
	String field_102536_o;
	String field_102534_C;
	static int field_102540_k;
	int field_102544_t;
	int field_102550_y;
	int field_102538_m;
	int field_102551_x;
	static String field_102549_z;
	C_100326_ic field_102533_B;
	C_100205_qf field_102535_n;
	private static final String[] field_102531_D;
	
	String func_102525_c(byte arg0)
	{
		// @00: iload_1
		// @01: bipush 34 (0x22)
		// @03: if_icmpge @16
		// @06: iconst_1
		// @07: bipush 41 (0x29)
		// @09: bipush -35 (0xDD)
		// @0B: bipush -23 (0xE9)
		// @0D: bipush -92 (0xA4)
		// @0F: invokestatic game.C_100336_im.func_102509_a(int, int, byte, int, int)void
		// @12: goto @16
		// @15: athrow
		// @16: aload_0
		// @17: getfield boolean game.C_100336_im.field_102539_j
		// @1A: ifne @22
		// @1D: aconst_null
		// @1E: goto @26
		// @21: athrow
		// @22: aload_0
		// @23: getfield java.lang.String game.C_100336_im.field_102536_o
		// @26: areturn
		// @27: astore_2
		// @28: aload_2
		// @29: new java.lang.StringBuilder
		// @2C: dup
		// @2D: invokespecial java.lang.StringBuilder.<init>()void
		// @30: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @33: bipush 16 (0x10)
		// @35: aaload
		// @36: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @39: iload_1
		// @3A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3D: bipush 41 (0x29)
		// @3F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @42: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @45: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @48: athrow
	}
	
	static long func_102514_a(long arg0, long arg1)
	{
		// @00: lload_0
		// @01: lload_2
		// @02: land
		// @03: lreturn
		// @04: astore #4
		// @06: aload #4
		// @08: new java.lang.StringBuilder
		// @0B: dup
		// @0C: invokespecial java.lang.StringBuilder.<init>()void
		// @0F: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @12: bipush 30 (0x1E)
		// @14: aaload
		// @15: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @18: lload_0
		// @19: invokevirtual java.lang.StringBuilder.append(long)java.lang.StringBuilder
		// @1C: bipush 44 (0x2C)
		// @1E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @21: lload_2
		// @22: invokevirtual java.lang.StringBuilder.append(long)java.lang.StringBuilder
		// @25: bipush 41 (0x29)
		// @27: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @2D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @30: athrow
	}
	
	final boolean func_102508_a(int arg0, int arg1, int arg2, int arg3, int arg4)
	{
		// @00: iload_1
		// @01: bipush -127 (0x81)
		// @03: if_icmplt @11
		// @06: aconst_null
		// @07: checkcast java.lang.String
		// @0A: putstatic java.lang.String game.C_100336_im.field_102542_v
		// @0D: goto @11
		// @10: athrow
		// @11: iload_2
		// @12: iconst_m1
		// @13: ixor
		// @14: iload_3
		// @15: aload_0
		// @16: getfield int game.C_100336_im.field_102538_m
		// @19: iadd
		// @1A: iconst_m1
		// @1B: ixor
		// @1C: if_icmpgt @62
		// @1F: iload #5
		// @21: iload #4
		// @23: aload_0
		// @24: getfield int game.C_100336_im.field_102541_w
		// @27: ineg
		// @28: isub
		// @29: if_icmplt @62
		// @2C: goto @30
		// @2F: athrow
		// @30: aload_0
		// @31: getfield int game.C_100336_im.field_102537_l
		// @34: iload_3
		// @35: aload_0
		// @36: getfield int game.C_100336_im.field_102538_m
		// @39: ineg
		// @3A: isub
		// @3B: iadd
		// @3C: iconst_m1
		// @3D: ixor
		// @3E: iload_2
		// @3F: iconst_m1
		// @40: ixor
		// @41: if_icmpge @62
		// @44: goto @48
		// @47: athrow
		// @48: iload #5
		// @4A: aload_0
		// @4B: getfield int game.C_100336_im.field_102541_w
		// @4E: iload #4
		// @50: iadd
		// @51: aload_0
		// @52: getfield int game.C_100336_im.field_102544_t
		// @55: iadd
		// @56: if_icmpge @62
		// @59: goto @5D
		// @5C: athrow
		// @5D: iconst_1
		// @5E: goto @63
		// @61: athrow
		// @62: iconst_0
		// @63: ireturn
		// @64: astore #6
		// @66: aload #6
		// @68: new java.lang.StringBuilder
		// @6B: dup
		// @6C: invokespecial java.lang.StringBuilder.<init>()void
		// @6F: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @72: bipush 34 (0x22)
		// @74: aaload
		// @75: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @78: iload_1
		// @79: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7C: bipush 44 (0x2C)
		// @7E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @81: iload_2
		// @82: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @85: bipush 44 (0x2C)
		// @87: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @8A: iload_3
		// @8B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8E: bipush 44 (0x2C)
		// @90: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @93: iload #4
		// @95: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @98: bipush 44 (0x2C)
		// @9A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9D: iload #5
		// @9F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A2: bipush 41 (0x29)
		// @A4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A7: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @AA: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @AD: athrow
	}
	
	static final void func_102509_a(int arg0, int arg1, byte arg2, int arg3, int arg4)
	{
		// @00: iload_0
		// @01: iload_3
		// @02: iload_1
		// @03: iload #4
		// @05: ldc 12105914 (0xb8b8ba)
		// @07: invokestatic game.C_100196_rb.func_105784_h(int, int, int, int, int)void
		// @0A: iconst_1
		// @0B: iload_0
		// @0C: iadd
		// @0D: iload_3
		// @0E: iconst_1
		// @0F: iadd
		// @10: bipush -2 (0xFE)
		// @12: iload_1
		// @13: iadd
		// @14: bipush -2 (0xFE)
		// @16: iload #4
		// @18: iadd
		// @19: ldc 10461345 (0x9fa0a1)
		// @1B: ldc 16251129 (0xf7f8f9)
		// @1D: invokestatic game.C_100196_rb.func_105798_b(int, int, int, int, int, int)void
		// @20: bipush 64 (0x40)
		// @22: istore #5
		// @24: iload_2
		// @25: bipush -51 (0xCD)
		// @27: if_icmple @3C
		// @2A: bipush 81 (0x51)
		// @2C: bipush -55 (0xC9)
		// @2E: aconst_null
		// @2F: checkcast game.C_100098_h
		// @32: bipush -120 (0x88)
		// @34: invokestatic game.C_100336_im.func_102505_a(int, int, game.C_100098_h, int)game.C_100037_wb
		// @37: pop
		// @38: goto @3C
		// @3B: athrow
		// @3C: iconst_1
		// @3D: istore #6
		// @3F: iload #6
		// @41: bipush 6 (0x06)
		// @43: if_icmpge @71
		// @46: iload #6
		// @48: iload_0
		// @49: iadd
		// @4A: iload #6
		// @4C: iload_3
		// @4D: iadd
		// @4E: iload #6
		// @50: iconst_2
		// @51: imul
		// @52: ineg
		// @53: iload_1
		// @54: iadd
		// @55: iload #4
		// @57: iconst_2
		// @58: iload #6
		// @5A: imul
		// @5B: ineg
		// @5C: iadd
		// @5D: ldc 16251129 (0xf7f8f9)
		// @5F: iload #5
		// @61: invokestatic game.C_100196_rb.func_105810_f(int, int, int, int, int, int)void
		// @64: iload #5
		// @66: ldc -2027030431 (0x872df861)
		// @68: ishr
		// @69: istore #5
		// @6B: iinc #6 +1
		// @6E: goto @3F
		// @71: goto @BD
		// @74: astore #5
		// @76: aload #5
		// @78: new java.lang.StringBuilder
		// @7B: dup
		// @7C: invokespecial java.lang.StringBuilder.<init>()void
		// @7F: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @82: bipush 23 (0x17)
		// @84: aaload
		// @85: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @88: iload_0
		// @89: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8C: bipush 44 (0x2C)
		// @8E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @91: iload_1
		// @92: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @95: bipush 44 (0x2C)
		// @97: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9A: iload_2
		// @9B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @9E: bipush 44 (0x2C)
		// @A0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A3: iload_3
		// @A4: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A7: bipush 44 (0x2C)
		// @A9: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @AC: iload #4
		// @AE: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @B1: bipush 41 (0x29)
		// @B3: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B6: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @B9: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @BC: athrow
		// @BD: return
	}
	
	void func_102524_a(int arg0, int arg1, int arg2, int arg3, byte arg4)
	{
		// @00: aload_0
		// @01: iload_1
		// @02: putfield int game.C_100336_im.field_102544_t
		// @05: aload_0
		// @06: iload #4
		// @08: putfield int game.C_100336_im.field_102537_l
		// @0B: aload_0
		// @0C: iload_3
		// @0D: putfield int game.C_100336_im.field_102538_m
		// @10: bipush -29 (0xE3)
		// @12: iload #5
		// @14: bipush -11 (0xF5)
		// @16: isub
		// @17: bipush 48 (0x30)
		// @19: idiv
		// @1A: idiv
		// @1B: istore #6
		// @1D: aload_0
		// @1E: iload_2
		// @1F: putfield int game.C_100336_im.field_102541_w
		// @22: goto @6F
		// @25: astore #6
		// @27: aload #6
		// @29: new java.lang.StringBuilder
		// @2C: dup
		// @2D: invokespecial java.lang.StringBuilder.<init>()void
		// @30: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @33: bipush 28 (0x1C)
		// @35: aaload
		// @36: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @39: iload_1
		// @3A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3D: bipush 44 (0x2C)
		// @3F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @42: iload_2
		// @43: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @46: bipush 44 (0x2C)
		// @48: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4B: iload_3
		// @4C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4F: bipush 44 (0x2C)
		// @51: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @54: iload #4
		// @56: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @59: bipush 44 (0x2C)
		// @5B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5E: iload #5
		// @60: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @63: bipush 41 (0x29)
		// @65: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @68: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @6B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @6E: athrow
		// @6F: return
	}
	
	final boolean func_102529_a(int arg0, boolean arg1, int arg2, int arg3)
	{
		// @000: aload_0
		// @001: aload_0
		// @002: iload_1
		// @003: iconst_2
		// @004: iload_3
		// @005: invokevirtual game.C_100336_im.func_102513_a(game.C_100336_im, int, int, int)void
		// @008: iload #4
		// @00A: sipush -2408 (0xF698)
		// @00D: if_icmpeq @012
		// @010: iconst_1
		// @011: ireturn
		// @012: aload_0
		// @013: bipush 127 (0x7F)
		// @015: invokevirtual game.C_100336_im.func_102515_d(byte)boolean
		// @018: istore #5
		// @01A: iload_2
		// @01B: ifeq @0D6
		// @01E: getstatic int game.C_100242_oh.field_106344_e
		// @021: ifeq @048
		// @024: goto @028
		// @027: athrow
		// @028: iload #5
		// @02A: ifeq @048
		// @02D: goto @031
		// @030: athrow
		// @031: aload_0
		// @032: iload_1
		// @033: aload_0
		// @034: iload_3
		// @035: bipush -127 (0x81)
		// @037: getstatic int game.C_100242_oh.field_106344_e
		// @03A: getstatic int game.C_100015_wh.field_103781_g
		// @03D: getstatic int game.C_100338_jc.field_105370_l
		// @040: invokevirtual game.C_100336_im.func_102512_b(int, game.C_100336_im, int, int, int, int, int)boolean
		// @043: pop
		// @044: goto @048
		// @047: athrow
		// @048: getstatic int game.C_100102_w.field_104636_c
		// @04B: iconst_m1
		// @04C: ixor
		// @04D: iconst_m1
		// @04E: if_icmpne @055
		// @051: goto @07D
		// @054: athrow
		// @055: aload_0
		// @056: getstatic int game.C_100340_je.field_102981_m
		// @059: aload_0
		// @05A: bipush 99 (0x63)
		// @05C: getstatic int game.C_100125_tm.field_100745_p
		// @05F: iload_1
		// @060: iload_3
		// @061: getstatic int game.C_100102_w.field_104636_c
		// @064: invokevirtual game.C_100336_im.func_102520_a(int, game.C_100336_im, int, int, int, int, int)boolean
		// @067: ifeq @06F
		// @06A: iconst_0
		// @06B: istore_2
		// @06C: goto @07D
		// @06F: iload #5
		// @071: ifeq @07D
		// @074: aload_0
		// @075: iconst_0
		// @076: invokevirtual game.C_100336_im.func_102526_b(boolean)void
		// @079: goto @07D
		// @07C: athrow
		// @07D: getstatic int game.C_100083_c.field_103171_R
		// @080: iconst_m1
		// @081: ixor
		// @082: iconst_m1
		// @083: if_icmpne @0F1
		// @086: getstatic int game.C_100158_da.field_100598_h
		// @089: ifeq @0F1
		// @08C: goto @090
		// @08F: athrow
		// @090: aload_0
		// @091: bipush 122 (0x7A)
		// @093: iload_3
		// @094: getstatic int game.C_100015_wh.field_103781_g
		// @097: getstatic int game.C_100338_jc.field_105370_l
		// @09A: aload_0
		// @09B: iload_1
		// @09C: invokevirtual game.C_100336_im.func_102519_a(byte, int, int, int, game.C_100336_im, int)void
		// @09F: getstatic game.C_100101_fc game.C_100125_tm.field_100747_o
		// @0A2: astore #6
		// @0A4: aload #6
		// @0A6: ifnull @0D3
		// @0A9: aload #6
		// @0AB: getfield game.C_100337_in game.C_100101_fc.field_102543_u
		// @0AE: instanceof game.C_100204_qk
		// @0B1: ifne @0BC
		// @0B4: goto @0B8
		// @0B7: athrow
		// @0B8: goto @0CF
		// @0BB: athrow
		// @0BC: aload #6
		// @0BE: getfield game.C_100337_in game.C_100101_fc.field_102543_u
		// @0C1: checkcast game.C_100204_qk
		// @0C4: sipush 17388 (0x43EC)
		// @0C7: aconst_null
		// @0C8: aload #6
		// @0CA: invokeinterface game.C_100204_qk.func_102578_a(int, game.C_100095_fe, game.C_100101_fc)void
		// @0CF: aconst_null
		// @0D0: putstatic game.C_100101_fc game.C_100125_tm.field_100747_o
		// @0D3: goto @0F1
		// @0D6: iload #5
		// @0D8: ifeq @0F1
		// @0DB: iconst_m1
		// @0DC: getstatic int game.C_100102_w.field_104636_c
		// @0DF: iconst_m1
		// @0E0: ixor
		// @0E1: if_icmpne @0EC
		// @0E4: goto @0E8
		// @0E7: athrow
		// @0E8: goto @0F1
		// @0EB: athrow
		// @0EC: aload_0
		// @0ED: iconst_0
		// @0EE: invokevirtual game.C_100336_im.func_102526_b(boolean)void
		// @0F1: getstatic int game.C_100083_c.field_103171_R
		// @0F4: putstatic int game.C_100158_da.field_100598_h
		// @0F7: aload_0
		// @0F8: bipush 51 (0x33)
		// @0FA: invokevirtual game.C_100336_im.func_102525_c(byte)java.lang.String
		// @0FD: iload #4
		// @0FF: sipush 2407 (0x0967)
		// @102: iadd
		// @103: invokestatic game.C_100218_am.func_103106_a(java.lang.String, int)void
		// @106: iload_2
		// @107: ireturn
		// @108: astore #5
		// @10A: aload #5
		// @10C: new java.lang.StringBuilder
		// @10F: dup
		// @110: invokespecial java.lang.StringBuilder.<init>()void
		// @113: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @116: bipush 14 (0x0E)
		// @118: aaload
		// @119: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @11C: iload_1
		// @11D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @120: bipush 44 (0x2C)
		// @122: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @125: iload_2
		// @126: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @129: bipush 44 (0x2C)
		// @12B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @12E: iload_3
		// @12F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @132: bipush 44 (0x2C)
		// @134: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @137: iload #4
		// @139: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @13C: bipush 41 (0x29)
		// @13E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @141: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @144: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @147: athrow
	}
	
	boolean func_102522_a(int arg0, C_100336_im arg1)
	{
		// @00: iload_1
		// @01: iconst_1
		// @02: if_icmpeq @07
		// @05: iconst_0
		// @06: ireturn
		// @07: iconst_0
		// @08: ireturn
		// @09: astore_3
		// @0A: aload_3
		// @0B: new java.lang.StringBuilder
		// @0E: dup
		// @0F: invokespecial java.lang.StringBuilder.<init>()void
		// @12: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @15: bipush 36 (0x24)
		// @17: aaload
		// @18: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1B: iload_1
		// @1C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1F: bipush 44 (0x2C)
		// @21: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @24: aload_2
		// @25: ifnull @32
		// @28: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @2B: bipush 7 (0x07)
		// @2D: aaload
		// @2E: goto @37
		// @31: athrow
		// @32: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @35: iconst_4
		// @36: aaload
		// @37: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3A: bipush 41 (0x29)
		// @3C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @42: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @45: athrow
	}
	
	void func_102526_b(boolean arg0)
	{
		// @00: iload_1
		// @01: ifeq @16
		// @04: aload_0
		// @05: bipush -115 (0x8D)
		// @07: bipush 124 (0x7C)
		// @09: bipush 63 (0x3F)
		// @0B: bipush 79 (0x4F)
		// @0D: aconst_null
		// @0E: checkcast game.C_100336_im
		// @11: bipush -92 (0xA4)
		// @13: invokevirtual game.C_100336_im.func_102519_a(byte, int, int, int, game.C_100336_im, int)void
		// @16: goto @3B
		// @19: astore_2
		// @1A: aload_2
		// @1B: new java.lang.StringBuilder
		// @1E: dup
		// @1F: invokespecial java.lang.StringBuilder.<init>()void
		// @22: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @25: bipush 27 (0x1B)
		// @27: aaload
		// @28: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2B: iload_1
		// @2C: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @2F: bipush 41 (0x29)
		// @31: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @34: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @37: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3A: athrow
		// @3B: return
	}
	
	int func_102527_g(int arg0)
	{
		// @00: iload_1
		// @01: sipush -21742 (0xAB12)
		// @04: if_icmpeq @11
		// @07: aload_0
		// @08: bipush -81 (0xAF)
		// @0A: putfield int game.C_100336_im.field_102538_m
		// @0D: goto @11
		// @10: athrow
		// @11: iconst_0
		// @12: ireturn
		// @13: astore_2
		// @14: aload_2
		// @15: new java.lang.StringBuilder
		// @18: dup
		// @19: invokespecial java.lang.StringBuilder.<init>()void
		// @1C: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @1F: bipush 11 (0x0B)
		// @21: aaload
		// @22: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @25: iload_1
		// @26: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @29: bipush 41 (0x29)
		// @2B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @31: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @34: athrow
	}
	
	final boolean func_102516_a(Hashtable arg0, int arg1, StringBuilder arg2, byte arg3)
	{
		// @00: iload #4
		// @02: bipush -76 (0xB4)
		// @04: if_icmpeq @11
		// @07: aload_0
		// @08: bipush -29 (0xE3)
		// @0A: putfield int game.C_100336_im.field_102544_t
		// @0D: goto @11
		// @10: athrow
		// @11: aload_1
		// @12: aload_0
		// @13: invokevirtual java.util.Hashtable.containsKey(java.lang.Object)boolean
		// @16: ifeq @39
		// @19: aload_3
		// @1A: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @1D: bipush 19 (0x13)
		// @1F: aaload
		// @20: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @23: aload_0
		// @24: invokevirtual java.lang.Object.hashCode()int
		// @27: invokestatic java.lang.Integer.toHexString(int)java.lang.String
		// @2A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2D: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @30: bipush 21 (0x15)
		// @32: aaload
		// @33: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @36: pop
		// @37: iconst_0
		// @38: ireturn
		// @39: aload_1
		// @3A: aload_0
		// @3B: aload_0
		// @3C: invokevirtual java.util.Hashtable.put(java.lang.Object, java.lang.Object)java.lang.Object
		// @3F: pop
		// @40: iconst_1
		// @41: ireturn
		// @42: astore #5
		// @44: aload #5
		// @46: new java.lang.StringBuilder
		// @49: dup
		// @4A: invokespecial java.lang.StringBuilder.<init>()void
		// @4D: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @50: bipush 20 (0x14)
		// @52: aaload
		// @53: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @56: aload_1
		// @57: ifnull @64
		// @5A: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @5D: bipush 7 (0x07)
		// @5F: aaload
		// @60: goto @69
		// @63: athrow
		// @64: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @67: iconst_4
		// @68: aaload
		// @69: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @6C: bipush 44 (0x2C)
		// @6E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @71: iload_2
		// @72: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @75: bipush 44 (0x2C)
		// @77: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7A: aload_3
		// @7B: ifnull @88
		// @7E: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @81: bipush 7 (0x07)
		// @83: aaload
		// @84: goto @8D
		// @87: athrow
		// @88: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @8B: iconst_4
		// @8C: aaload
		// @8D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @90: bipush 44 (0x2C)
		// @92: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @95: iload #4
		// @97: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @9A: bipush 41 (0x29)
		// @9C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @A2: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @A5: athrow
	}
	
	public final String toString()
	{
		// @00: aload_0
		// @01: iconst_0
		// @02: bipush -111 (0x91)
		// @04: new java.lang.StringBuilder
		// @07: dup
		// @08: invokespecial java.lang.StringBuilder.<init>()void
		// @0B: new java.util.Hashtable
		// @0E: dup
		// @0F: invokespecial java.util.Hashtable.<init>()void
		// @12: invokevirtual game.C_100336_im.func_102510_a(int, byte, java.lang.StringBuilder, java.util.Hashtable)java.lang.StringBuilder
		// @15: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @18: areturn
		// @19: astore_1
		// @1A: aload_1
		// @1B: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @1E: bipush 12 (0x0C)
		// @20: aaload
		// @21: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @24: athrow
	}
	
	boolean func_102520_a(int arg0, C_100336_im arg1, int arg2, int arg3, int arg4, int arg5, int arg6)
	{
		// @00: bipush -16 (0xF0)
		// @02: bipush 32 (0x20)
		// @04: iload_3
		// @05: isub
		// @06: bipush 52 (0x34)
		// @08: idiv
		// @09: irem
		// @0A: istore #8
		// @0C: aload_0
		// @0D: bipush -128 (0x80)
		// @0F: iload_1
		// @10: iload #6
		// @12: iload #5
		// @14: iload #4
		// @16: invokevirtual game.C_100336_im.func_102508_a(int, int, int, int, int)boolean
		// @19: ifne @20
		// @1C: goto @26
		// @1F: athrow
		// @20: aload_0
		// @21: iload #7
		// @23: putfield int game.C_100336_im.field_102532_A
		// @26: iconst_0
		// @27: ireturn
		// @28: astore #8
		// @2A: aload #8
		// @2C: new java.lang.StringBuilder
		// @2F: dup
		// @30: invokespecial java.lang.StringBuilder.<init>()void
		// @33: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @36: bipush 33 (0x21)
		// @38: aaload
		// @39: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3C: iload_1
		// @3D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @40: bipush 44 (0x2C)
		// @42: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @45: aload_2
		// @46: ifnull @53
		// @49: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @4C: bipush 7 (0x07)
		// @4E: aaload
		// @4F: goto @58
		// @52: athrow
		// @53: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @56: iconst_4
		// @57: aaload
		// @58: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @5B: bipush 44 (0x2C)
		// @5D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @60: iload_3
		// @61: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @64: bipush 44 (0x2C)
		// @66: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @69: iload #4
		// @6B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6E: bipush 44 (0x2C)
		// @70: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @73: iload #5
		// @75: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @78: bipush 44 (0x2C)
		// @7A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7D: iload #6
		// @7F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @82: bipush 44 (0x2C)
		// @84: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @87: iload #7
		// @89: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8C: bipush 41 (0x29)
		// @8E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @91: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @94: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @97: athrow
	}
	
	final void func_102518_a(byte arg0, StringBuilder arg1, int arg2, Hashtable arg3)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #6
		// @005: aload_2
		// @006: aload_0
		// @007: invokevirtual java.lang.Object.getClass()java.lang.Class
		// @00A: invokevirtual java.lang.Class.getName()java.lang.String
		// @00D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @010: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @013: iconst_0
		// @014: aaload
		// @015: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @018: aload_0
		// @019: invokevirtual java.lang.Object.hashCode()int
		// @01C: invokestatic java.lang.Integer.toHexString(int)java.lang.String
		// @01F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @022: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @025: iconst_1
		// @026: aaload
		// @027: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @02A: aload_0
		// @02B: getfield int game.C_100336_im.field_102538_m
		// @02E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @031: ldc ","
		// @033: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @036: aload_0
		// @037: getfield int game.C_100336_im.field_102541_w
		// @03A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @03D: ldc " "
		// @03F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @042: aload_0
		// @043: getfield int game.C_100336_im.field_102537_l
		// @046: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @049: ldc "x"
		// @04B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @04E: aload_0
		// @04F: getfield int game.C_100336_im.field_102544_t
		// @052: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @055: pop
		// @056: aconst_null
		// @057: aload_0
		// @058: getfield java.lang.String game.C_100336_im.field_102534_C
		// @05B: if_acmpne @062
		// @05E: goto @078
		// @061: athrow
		// @062: aload_2
		// @063: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @066: iconst_2
		// @067: aaload
		// @068: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @06B: aload_0
		// @06C: getfield java.lang.String game.C_100336_im.field_102534_C
		// @06F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @072: bipush 34 (0x22)
		// @074: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @077: pop
		// @078: aload_0
		// @079: getfield boolean game.C_100336_im.field_102539_j
		// @07C: ifeq @08E
		// @07F: aload_2
		// @080: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @083: bipush 6 (0x06)
		// @085: aaload
		// @086: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @089: pop
		// @08A: goto @08E
		// @08D: athrow
		// @08E: bipush -41 (0xD7)
		// @090: bipush -69 (0xBB)
		// @092: iload_1
		// @093: isub
		// @094: bipush 46 (0x2E)
		// @096: idiv
		// @097: irem
		// @098: istore #5
		// @09A: aload_0
		// @09B: bipush 35 (0x23)
		// @09D: invokevirtual game.C_100336_im.func_102515_d(byte)boolean
		// @0A0: ifne @0A7
		// @0A3: goto @0B2
		// @0A6: athrow
		// @0A7: aload_2
		// @0A8: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @0AB: bipush 8 (0x08)
		// @0AD: aaload
		// @0AE: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0B1: pop
		// @0B2: aconst_null
		// @0B3: aload_0
		// @0B4: getfield game.C_100326_ic game.C_100336_im.field_102533_B
		// @0B7: if_acmpne @0BE
		// @0BA: goto @0F1
		// @0BD: athrow
		// @0BE: aload_2
		// @0BF: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @0C2: iconst_3
		// @0C3: aaload
		// @0C4: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0C7: pop
		// @0C8: aload_0
		// @0C9: getfield game.C_100326_ic game.C_100336_im.field_102533_B
		// @0CC: instanceof game.C_100336_im
		// @0CF: ifne @0E4
		// @0D2: aload_2
		// @0D3: aload_0
		// @0D4: getfield game.C_100326_ic game.C_100336_im.field_102533_B
		// @0D7: invokevirtual java.lang.StringBuilder.append(java.lang.Object)java.lang.StringBuilder
		// @0DA: pop
		// @0DB: iload #6
		// @0DD: ifeq @0F1
		// @0E0: goto @0E4
		// @0E3: athrow
		// @0E4: aload_0
		// @0E5: iload_3
		// @0E6: iconst_m1
		// @0E7: isub
		// @0E8: bipush -127 (0x81)
		// @0EA: aload_2
		// @0EB: aload #4
		// @0ED: invokevirtual game.C_100336_im.func_102510_a(int, byte, java.lang.StringBuilder, java.util.Hashtable)java.lang.StringBuilder
		// @0F0: astore_2
		// @0F1: aconst_null
		// @0F2: aload_0
		// @0F3: getfield game.C_100337_in game.C_100336_im.field_102543_u
		// @0F6: if_acmpeq @130
		// @0F9: aload_2
		// @0FA: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @0FD: iconst_5
		// @0FE: aaload
		// @0FF: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @102: pop
		// @103: aload_0
		// @104: getfield game.C_100337_in game.C_100336_im.field_102543_u
		// @107: instanceof game.C_100336_im
		// @10A: ifne @123
		// @10D: goto @111
		// @110: athrow
		// @111: aload_2
		// @112: aload_0
		// @113: getfield game.C_100337_in game.C_100336_im.field_102543_u
		// @116: invokevirtual java.lang.StringBuilder.append(java.lang.Object)java.lang.StringBuilder
		// @119: pop
		// @11A: iload #6
		// @11C: ifeq @130
		// @11F: goto @123
		// @122: athrow
		// @123: aload_0
		// @124: iload_3
		// @125: iconst_m1
		// @126: isub
		// @127: bipush 48 (0x30)
		// @129: aload_2
		// @12A: aload #4
		// @12C: invokevirtual game.C_100336_im.func_102510_a(int, byte, java.lang.StringBuilder, java.util.Hashtable)java.lang.StringBuilder
		// @12F: astore_2
		// @130: goto @197
		// @133: astore #5
		// @135: aload #5
		// @137: new java.lang.StringBuilder
		// @13A: dup
		// @13B: invokespecial java.lang.StringBuilder.<init>()void
		// @13E: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @141: bipush 9 (0x09)
		// @143: aaload
		// @144: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @147: iload_1
		// @148: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @14B: bipush 44 (0x2C)
		// @14D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @150: aload_2
		// @151: ifnull @15E
		// @154: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @157: bipush 7 (0x07)
		// @159: aaload
		// @15A: goto @163
		// @15D: athrow
		// @15E: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @161: iconst_4
		// @162: aaload
		// @163: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @166: bipush 44 (0x2C)
		// @168: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @16B: iload_3
		// @16C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @16F: bipush 44 (0x2C)
		// @171: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @174: aload #4
		// @176: ifnull @183
		// @179: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @17C: bipush 7 (0x07)
		// @17E: aaload
		// @17F: goto @188
		// @182: athrow
		// @183: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @186: iconst_4
		// @187: aaload
		// @188: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @18B: bipush 41 (0x29)
		// @18D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @190: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @193: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @196: athrow
		// @197: return
	}
	
	static final C_100037_wb func_102505_a(int arg0, int arg1, C_100098_h arg2, int arg3)
	{
		// @00: iload_3
		// @01: iconst_m1
		// @02: if_icmpeq @10
		// @05: aconst_null
		// @06: checkcast java.lang.String
		// @09: putstatic java.lang.String game.C_100336_im.field_102546_r
		// @0C: goto @10
		// @0F: athrow
		// @10: iload_0
		// @11: iconst_1
		// @12: aload_2
		// @13: iload_1
		// @14: invokestatic game.C_100333_ij.func_107341_a(int, boolean, game.C_100098_h, int)boolean
		// @17: ifne @1C
		// @1A: aconst_null
		// @1B: areturn
		// @1C: iload_3
		// @1D: iconst_1
		// @1E: iadd
		// @1F: invokestatic game.C_100208_qg.func_105951_c(int)game.C_100037_wb
		// @22: areturn
		// @23: astore #4
		// @25: aload #4
		// @27: new java.lang.StringBuilder
		// @2A: dup
		// @2B: invokespecial java.lang.StringBuilder.<init>()void
		// @2E: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @31: bipush 17 (0x11)
		// @33: aaload
		// @34: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @37: iload_0
		// @38: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3B: bipush 44 (0x2C)
		// @3D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @40: iload_1
		// @41: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @44: bipush 44 (0x2C)
		// @46: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @49: aload_2
		// @4A: ifnull @57
		// @4D: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @50: bipush 7 (0x07)
		// @52: aaload
		// @53: goto @5C
		// @56: athrow
		// @57: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @5A: iconst_4
		// @5B: aaload
		// @5C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @5F: bipush 44 (0x2C)
		// @61: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @64: iload_3
		// @65: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @68: bipush 41 (0x29)
		// @6A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @70: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @73: athrow
	}
	
	public static void func_102521_e(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic game.C_100098_h game.C_100336_im.field_102545_s
		// @04: aconst_null
		// @05: putstatic java.lang.String game.C_100336_im.field_102546_r
		// @08: aconst_null
		// @09: putstatic java.lang.String game.C_100336_im.field_102548_p
		// @0C: aconst_null
		// @0D: putstatic java.lang.String game.C_100336_im.field_102549_z
		// @10: iload_0
		// @11: sipush -8705 (0xDDFF)
		// @14: if_icmpeq @18
		// @17: return
		// @18: aconst_null
		// @19: putstatic java.lang.String game.C_100336_im.field_102542_v
		// @1C: aconst_null
		// @1D: putstatic game.C_100033_gj game.C_100336_im.field_102547_q
		// @20: goto @45
		// @23: astore_1
		// @24: aload_1
		// @25: new java.lang.StringBuilder
		// @28: dup
		// @29: invokespecial java.lang.StringBuilder.<init>()void
		// @2C: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @2F: bipush 24 (0x18)
		// @31: aaload
		// @32: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @35: iload_0
		// @36: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @39: bipush 41 (0x29)
		// @3B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @41: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @44: athrow
		// @45: return
	}
	
	StringBuilder func_102510_a(int arg0, byte arg1, StringBuilder arg2, Hashtable arg3)
	{
		// @00: iconst_m1
		// @01: iload_2
		// @02: bipush -42 (0xD6)
		// @04: isub
		// @05: bipush 63 (0x3F)
		// @07: idiv
		// @08: irem
		// @09: istore #5
		// @0B: aload_0
		// @0C: aload #4
		// @0E: iload_1
		// @0F: aload_3
		// @10: bipush -76 (0xB4)
		// @12: invokevirtual game.C_100336_im.func_102516_a(java.util.Hashtable, int, java.lang.StringBuilder, byte)boolean
		// @15: ifne @1C
		// @18: goto @26
		// @1B: athrow
		// @1C: aload_0
		// @1D: bipush -6 (0xFA)
		// @1F: aload_3
		// @20: iload_1
		// @21: aload #4
		// @23: invokevirtual game.C_100336_im.func_102518_a(byte, java.lang.StringBuilder, int, java.util.Hashtable)void
		// @26: aload_3
		// @27: areturn
		// @28: astore #5
		// @2A: aload #5
		// @2C: new java.lang.StringBuilder
		// @2F: dup
		// @30: invokespecial java.lang.StringBuilder.<init>()void
		// @33: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @36: bipush 35 (0x23)
		// @38: aaload
		// @39: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3C: iload_1
		// @3D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @40: bipush 44 (0x2C)
		// @42: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @45: iload_2
		// @46: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @49: bipush 44 (0x2C)
		// @4B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4E: aload_3
		// @4F: ifnull @5C
		// @52: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @55: bipush 7 (0x07)
		// @57: aaload
		// @58: goto @61
		// @5B: athrow
		// @5C: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @5F: iconst_4
		// @60: aaload
		// @61: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @64: bipush 44 (0x2C)
		// @66: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @69: aload #4
		// @6B: ifnull @78
		// @6E: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @71: bipush 7 (0x07)
		// @73: aaload
		// @74: goto @7D
		// @77: athrow
		// @78: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @7B: iconst_4
		// @7C: aaload
		// @7D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @80: bipush 41 (0x29)
		// @82: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @85: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @88: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @8B: athrow
	}
	
	boolean func_102506_a(char arg0, int arg1, int arg2, C_100336_im arg3)
	{
		// @00: iload_3
		// @01: sipush 22545 (0x5811)
		// @04: if_icmpeq @09
		// @07: iconst_1
		// @08: ireturn
		// @09: iconst_0
		// @0A: ireturn
		// @0B: astore #5
		// @0D: aload #5
		// @0F: new java.lang.StringBuilder
		// @12: dup
		// @13: invokespecial java.lang.StringBuilder.<init>()void
		// @16: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @19: bipush 31 (0x1F)
		// @1B: aaload
		// @1C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1F: iload_1
		// @20: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @23: bipush 44 (0x2C)
		// @25: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @28: iload_2
		// @29: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2C: bipush 44 (0x2C)
		// @2E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @31: iload_3
		// @32: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @35: bipush 44 (0x2C)
		// @37: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3A: aload #4
		// @3C: ifnull @49
		// @3F: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @42: bipush 7 (0x07)
		// @44: aaload
		// @45: goto @4E
		// @48: athrow
		// @49: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @4C: iconst_4
		// @4D: aaload
		// @4E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @51: bipush 41 (0x29)
		// @53: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @56: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @59: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @5C: athrow
	}
	
	boolean func_102512_b(int arg0, C_100336_im arg1, int arg2, int arg3, int arg4, int arg5, int arg6)
	{
		// @00: iload #4
		// @02: bipush -20 (0xEC)
		// @04: if_icmplt @15
		// @07: aload_0
		// @08: bipush -99 (0x9D)
		// @0A: bipush -27 (0xE5)
		// @0C: bipush 13 (0x0D)
		// @0E: invokevirtual game.C_100336_im.func_102523_a(int, int, int)void
		// @11: goto @15
		// @14: athrow
		// @15: iconst_0
		// @16: ireturn
		// @17: astore #8
		// @19: aload #8
		// @1B: new java.lang.StringBuilder
		// @1E: dup
		// @1F: invokespecial java.lang.StringBuilder.<init>()void
		// @22: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @25: bipush 29 (0x1D)
		// @27: aaload
		// @28: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2B: iload_1
		// @2C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2F: bipush 44 (0x2C)
		// @31: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @34: aload_2
		// @35: ifnull @42
		// @38: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @3B: bipush 7 (0x07)
		// @3D: aaload
		// @3E: goto @47
		// @41: athrow
		// @42: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @45: iconst_4
		// @46: aaload
		// @47: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4A: bipush 44 (0x2C)
		// @4C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4F: iload_3
		// @50: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @53: bipush 44 (0x2C)
		// @55: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @58: iload #4
		// @5A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5D: bipush 44 (0x2C)
		// @5F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @62: iload #5
		// @64: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @67: bipush 44 (0x2C)
		// @69: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6C: iload #6
		// @6E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @71: bipush 44 (0x2C)
		// @73: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @76: iload #7
		// @78: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7B: bipush 41 (0x29)
		// @7D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @80: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @83: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @86: athrow
	}
	
	void func_102513_a(C_100336_im arg0, int arg1, int arg2, int arg3)
	{
		// @00: aload_0
		// @01: iload_3
		// @02: sipush -130 (0xFF7E)
		// @05: iadd
		// @06: getstatic int game.C_100015_wh.field_103781_g
		// @09: iload #4
		// @0B: iload_2
		// @0C: getstatic int game.C_100338_jc.field_105370_l
		// @0F: invokevirtual game.C_100336_im.func_102508_a(int, int, int, int, int)boolean
		// @12: istore #5
		// @14: iload #5
		// @16: ifne @1E
		// @19: iconst_1
		// @1A: goto @1F
		// @1D: athrow
		// @1E: iconst_0
		// @1F: aload_0
		// @20: getfield boolean game.C_100336_im.field_102539_j
		// @23: if_icmpne @5B
		// @26: aload_0
		// @27: iload #5
		// @29: putfield boolean game.C_100336_im.field_102539_j
		// @2C: aload_0
		// @2D: getfield game.C_100337_in game.C_100336_im.field_102543_u
		// @30: ifnull @5B
		// @33: goto @37
		// @36: athrow
		// @37: aload_0
		// @38: getfield game.C_100337_in game.C_100336_im.field_102543_u
		// @3B: instanceof game.C_100279_ne
		// @3E: ifne @49
		// @41: goto @45
		// @44: athrow
		// @45: goto @5B
		// @48: athrow
		// @49: aload_0
		// @4A: getfield game.C_100337_in game.C_100336_im.field_102543_u
		// @4D: checkcast game.C_100279_ne
		// @50: sipush 31846 (0x7C66)
		// @53: aload_0
		// @54: iload #5
		// @56: invokeinterface game.C_100279_ne.func_103099_a(int, game.C_100336_im, boolean)void
		// @5B: iload_3
		// @5C: iconst_2
		// @5D: if_icmpeq @6E
		// @60: aload_0
		// @61: bipush -108 (0x94)
		// @63: bipush 76 (0x4C)
		// @65: iconst_1
		// @66: invokevirtual game.C_100336_im.func_102511_a(int, char, boolean)boolean
		// @69: pop
		// @6A: goto @6E
		// @6D: athrow
		// @6E: goto @C3
		// @71: astore #5
		// @73: aload #5
		// @75: new java.lang.StringBuilder
		// @78: dup
		// @79: invokespecial java.lang.StringBuilder.<init>()void
		// @7C: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @7F: bipush 15 (0x0F)
		// @81: aaload
		// @82: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @85: aload_1
		// @86: ifnull @93
		// @89: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @8C: bipush 7 (0x07)
		// @8E: aaload
		// @8F: goto @98
		// @92: athrow
		// @93: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @96: iconst_4
		// @97: aaload
		// @98: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @9B: bipush 44 (0x2C)
		// @9D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A0: iload_2
		// @A1: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A4: bipush 44 (0x2C)
		// @A6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A9: iload_3
		// @AA: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @AD: bipush 44 (0x2C)
		// @AF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B2: iload #4
		// @B4: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @B7: bipush 41 (0x29)
		// @B9: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @BC: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @BF: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @C2: athrow
		// @C3: return
	}
	
	void func_102519_a(byte arg0, int arg1, int arg2, int arg3, C_100336_im arg4, int arg5)
	{
		// @00: aload_0
		// @01: iconst_0
		// @02: putfield int game.C_100336_im.field_102532_A
		// @05: iload_1
		// @06: bipush 122 (0x7A)
		// @08: if_icmpeq @10
		// @0B: aload_0
		// @0C: iconst_1
		// @0D: putfield boolean game.C_100336_im.field_102539_j
		// @10: goto @79
		// @13: astore #7
		// @15: aload #7
		// @17: new java.lang.StringBuilder
		// @1A: dup
		// @1B: invokespecial java.lang.StringBuilder.<init>()void
		// @1E: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @21: bipush 10 (0x0A)
		// @23: aaload
		// @24: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @27: iload_1
		// @28: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2B: bipush 44 (0x2C)
		// @2D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @30: iload_2
		// @31: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @34: bipush 44 (0x2C)
		// @36: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @39: iload_3
		// @3A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3D: bipush 44 (0x2C)
		// @3F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @42: iload #4
		// @44: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @47: bipush 44 (0x2C)
		// @49: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4C: aload #5
		// @4E: ifnull @5B
		// @51: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @54: bipush 7 (0x07)
		// @56: aaload
		// @57: goto @60
		// @5A: athrow
		// @5B: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @5E: iconst_4
		// @5F: aaload
		// @60: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @63: bipush 44 (0x2C)
		// @65: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @68: iload #6
		// @6A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6D: bipush 41 (0x29)
		// @6F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @72: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @75: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @78: athrow
		// @79: return
	}
	
	C_100336_im(String arg0, C_100337_in arg1)
	{
		// @0: aload_0
		// @1: aload_1
		// @2: getstatic game.C_100233_oa game.C_100043_vl.field_101945_cc
		// @5: getfield game.C_100326_ic game.C_100233_oa.field_106252_w
		// @8: aload_2
		// @9: invokespecial game.C_100336_im.<init>(java.lang.String, game.C_100326_ic, game.C_100337_in)void
		// @C: return
	}
	
	final void func_102530_f(int arg0)
	{
		// @00: iload_1
		// @01: sipush 10945 (0x2AC1)
		// @04: if_icmpeq @12
		// @07: aconst_null
		// @08: checkcast game.C_100033_gj
		// @0B: putstatic game.C_100033_gj game.C_100336_im.field_102547_q
		// @0E: goto @12
		// @11: athrow
		// @12: aload_0
		// @13: aload_0
		// @14: getfield int game.C_100336_im.field_102544_t
		// @17: aload_0
		// @18: getfield int game.C_100336_im.field_102541_w
		// @1B: aload_0
		// @1C: getfield int game.C_100336_im.field_102538_m
		// @1F: aload_0
		// @20: getfield int game.C_100336_im.field_102537_l
		// @23: bipush -78 (0xB2)
		// @25: invokevirtual game.C_100336_im.func_102524_a(int, int, int, int, byte)void
		// @28: goto @4D
		// @2B: astore_2
		// @2C: aload_2
		// @2D: new java.lang.StringBuilder
		// @30: dup
		// @31: invokespecial java.lang.StringBuilder.<init>()void
		// @34: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @37: bipush 13 (0x0D)
		// @39: aaload
		// @3A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3D: iload_1
		// @3E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @41: bipush 41 (0x29)
		// @43: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @46: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @49: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4C: athrow
		// @4D: return
	}
	
	final boolean func_102511_a(int arg0, char arg1, boolean arg2)
	{
		// @00: aload_0
		// @01: bipush 107 (0x6B)
		// @03: invokevirtual game.C_100336_im.func_102515_d(byte)boolean
		// @06: ifeq @1C
		// @09: aload_0
		// @0A: iload_2
		// @0B: iload_1
		// @0C: sipush 22545 (0x5811)
		// @0F: aload_0
		// @10: invokevirtual game.C_100336_im.func_102506_a(char, int, int, game.C_100336_im)boolean
		// @13: ifeq @1C
		// @16: goto @1A
		// @19: athrow
		// @1A: iconst_1
		// @1B: ireturn
		// @1C: iload_3
		// @1D: iconst_1
		// @1E: if_icmpeq @2C
		// @21: aconst_null
		// @22: checkcast java.lang.String
		// @25: putstatic java.lang.String game.C_100336_im.field_102542_v
		// @28: goto @2C
		// @2B: athrow
		// @2C: iload_1
		// @2D: istore #4
		// @2F: iload #4
		// @31: iconst_m1
		// @32: ixor
		// @33: bipush -81 (0xAF)
		// @35: if_icmpeq @3C
		// @38: goto @43
		// @3B: athrow
		// @3C: aload_0
		// @3D: iconst_1
		// @3E: aload_0
		// @3F: invokevirtual game.C_100336_im.func_102522_a(int, game.C_100336_im)boolean
		// @42: ireturn
		// @43: iconst_0
		// @44: ireturn
		// @45: astore #4
		// @47: aload #4
		// @49: new java.lang.StringBuilder
		// @4C: dup
		// @4D: invokespecial java.lang.StringBuilder.<init>()void
		// @50: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @53: bipush 18 (0x12)
		// @55: aaload
		// @56: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @59: iload_1
		// @5A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5D: bipush 44 (0x2C)
		// @5F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @62: iload_2
		// @63: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @66: bipush 44 (0x2C)
		// @68: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6B: iload_3
		// @6C: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @6F: bipush 41 (0x29)
		// @71: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @74: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @77: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @7A: athrow
	}
	
	void func_102528_a(int arg0, int arg1, int arg2, byte arg3)
	{
		// @00: iload_1
		// @01: ifne @24
		// @04: aconst_null
		// @05: aload_0
		// @06: getfield game.C_100326_ic game.C_100336_im.field_102533_B
		// @09: if_acmpeq @24
		// @0C: goto @10
		// @0F: athrow
		// @10: aload_0
		// @11: getfield game.C_100326_ic game.C_100336_im.field_102533_B
		// @14: iconst_1
		// @15: sipush -26568 (0x9838)
		// @18: iload_3
		// @19: iload_2
		// @1A: aload_0
		// @1B: invokeinterface game.C_100326_ic.func_100362_a(boolean, int, int, int, game.C_100336_im)void
		// @20: goto @24
		// @23: athrow
		// @24: iload #4
		// @26: bipush -126 (0x82)
		// @28: if_icmplt @36
		// @2B: aconst_null
		// @2C: checkcast java.lang.String
		// @2F: putstatic java.lang.String game.C_100336_im.field_102548_p
		// @32: goto @36
		// @35: athrow
		// @36: goto @79
		// @39: astore #5
		// @3B: aload #5
		// @3D: new java.lang.StringBuilder
		// @40: dup
		// @41: invokespecial java.lang.StringBuilder.<init>()void
		// @44: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @47: bipush 25 (0x19)
		// @49: aaload
		// @4A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4D: iload_1
		// @4E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @51: bipush 44 (0x2C)
		// @53: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @56: iload_2
		// @57: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5A: bipush 44 (0x2C)
		// @5C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5F: iload_3
		// @60: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @63: bipush 44 (0x2C)
		// @65: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @68: iload #4
		// @6A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6D: bipush 41 (0x29)
		// @6F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @72: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @75: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @78: athrow
		// @79: return
	}
	
	final void func_102523_a(int arg0, int arg1, int arg2)
	{
		// @00: aload_0
		// @01: iload_3
		// @02: sipush -21742 (0xAB12)
		// @05: iadd
		// @06: invokevirtual game.C_100336_im.func_102527_g(int)int
		// @09: istore #4
		// @0B: iload_3
		// @0C: istore #5
		// @0E: iload #4
		// @10: iconst_m1
		// @11: ixor
		// @12: iload #5
		// @14: iconst_m1
		// @15: ixor
		// @16: if_icmpgt @2A
		// @19: aload_0
		// @1A: iload #5
		// @1C: iload_1
		// @1D: iload_2
		// @1E: bipush -128 (0x80)
		// @20: invokevirtual game.C_100336_im.func_102528_a(int, int, int, byte)void
		// @23: iinc #5 +1
		// @26: goto @0E
		// @29: athrow
		// @2A: bipush 78 (0x4E)
		// @2C: invokestatic game.C_100341_jd.func_102634_n(int)java.lang.String
		// @2F: astore #5
		// @31: aload #5
		// @33: ifnull @49
		// @36: getstatic game.C_100233_oa game.C_100043_vl.field_101945_cc
		// @39: aload #5
		// @3B: getstatic int game.C_100055_ed.field_104244_c
		// @3E: getstatic int game.C_100260_mc.field_102228_Yb
		// @41: iconst_0
		// @42: invokevirtual game.C_100233_oa.func_106224_a(java.lang.String, int, int, boolean)void
		// @45: goto @49
		// @48: athrow
		// @49: goto @82
		// @4C: astore #4
		// @4E: aload #4
		// @50: new java.lang.StringBuilder
		// @53: dup
		// @54: invokespecial java.lang.StringBuilder.<init>()void
		// @57: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @5A: bipush 32 (0x20)
		// @5C: aaload
		// @5D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @60: iload_1
		// @61: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @64: bipush 44 (0x2C)
		// @66: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @69: iload_2
		// @6A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6D: bipush 44 (0x2C)
		// @6F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @72: iload_3
		// @73: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @76: bipush 41 (0x29)
		// @78: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @7E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @81: athrow
		// @82: return
	}
	
	protected C_100336_im()
	{
		// @0: aload_0
		// @1: invokespecial game.C_100158_da.<init>()void
		// @4: aload_0
		// @5: iconst_0
		// @6: putfield int game.C_100336_im.field_102550_y
		// @9: aload_0
		// @A: iconst_0
		// @B: putfield int game.C_100336_im.field_102551_x
		// @E: return
	}
	
	C_100336_im(String arg0, C_100326_ic arg1, C_100337_in arg2)
	{
		// @00: aload_0
		// @01: invokespecial game.C_100158_da.<init>()void
		// @04: aload_0
		// @05: iconst_0
		// @06: putfield int game.C_100336_im.field_102550_y
		// @09: aload_0
		// @0A: iconst_0
		// @0B: putfield int game.C_100336_im.field_102551_x
		// @0E: aload_0
		// @0F: aload_2
		// @10: putfield game.C_100326_ic game.C_100336_im.field_102533_B
		// @13: aload_0
		// @14: aload_3
		// @15: putfield game.C_100337_in game.C_100336_im.field_102543_u
		// @18: aload_0
		// @19: aload_1
		// @1A: putfield java.lang.String game.C_100336_im.field_102534_C
		// @1D: aload_0
		// @1E: getfield game.C_100326_ic game.C_100336_im.field_102533_B
		// @21: instanceof game.C_100184_rn
		// @24: ifeq @4A
		// @27: aload_0
		// @28: getfield game.C_100326_ic game.C_100336_im.field_102533_B
		// @2B: checkcast game.C_100184_rn
		// @2E: astore #4
		// @30: aload_0
		// @31: aload #4
		// @33: aload_0
		// @34: iconst_0
		// @35: invokeinterface game.C_100184_rn.func_100438_a(game.C_100336_im, int)int
		// @3A: putfield int game.C_100336_im.field_102537_l
		// @3D: aload_0
		// @3E: aload #4
		// @40: iconst_3
		// @41: aload_0
		// @42: invokeinterface game.C_100184_rn.func_100442_a(int, game.C_100336_im)int
		// @47: putfield int game.C_100336_im.field_102544_t
		// @4A: goto @B9
		// @4D: astore #4
		// @4F: aload #4
		// @51: new java.lang.StringBuilder
		// @54: dup
		// @55: invokespecial java.lang.StringBuilder.<init>()void
		// @58: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @5B: bipush 22 (0x16)
		// @5D: aaload
		// @5E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @61: aload_1
		// @62: ifnull @6F
		// @65: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @68: bipush 7 (0x07)
		// @6A: aaload
		// @6B: goto @74
		// @6E: athrow
		// @6F: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @72: iconst_4
		// @73: aaload
		// @74: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @77: bipush 44 (0x2C)
		// @79: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7C: aload_2
		// @7D: ifnull @8A
		// @80: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @83: bipush 7 (0x07)
		// @85: aaload
		// @86: goto @8F
		// @89: athrow
		// @8A: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @8D: iconst_4
		// @8E: aaload
		// @8F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @92: bipush 44 (0x2C)
		// @94: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @97: aload_3
		// @98: ifnull @A5
		// @9B: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @9E: bipush 7 (0x07)
		// @A0: aaload
		// @A1: goto @AA
		// @A4: athrow
		// @A5: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @A8: iconst_4
		// @A9: aaload
		// @AA: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @AD: bipush 41 (0x29)
		// @AF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B2: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @B5: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @B8: athrow
		// @B9: return
	}
	
	boolean func_102515_d(byte arg0)
	{
		// @00: iload_1
		// @01: bipush 10 (0x0A)
		// @03: if_icmpge @0F
		// @06: aload_0
		// @07: iconst_0
		// @08: invokevirtual game.C_100336_im.func_102526_b(boolean)void
		// @0B: goto @0F
		// @0E: athrow
		// @0F: iconst_0
		// @10: ireturn
		// @11: astore_2
		// @12: aload_2
		// @13: new java.lang.StringBuilder
		// @16: dup
		// @17: invokespecial java.lang.StringBuilder.<init>()void
		// @1A: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @1D: bipush 26 (0x1A)
		// @1F: aaload
		// @20: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @23: iload_1
		// @24: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @27: bipush 41 (0x29)
		// @29: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @2F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @32: athrow
	}
	
	C_100336_im(int arg0, int arg1, int arg2, int arg3, C_100326_ic arg4, C_100337_in arg5)
	{
		// @00: aload_0
		// @01: invokespecial game.C_100158_da.<init>()void
		// @04: aload_0
		// @05: iconst_0
		// @06: putfield int game.C_100336_im.field_102550_y
		// @09: aload_0
		// @0A: iconst_0
		// @0B: putfield int game.C_100336_im.field_102551_x
		// @0E: aload_0
		// @0F: iload_2
		// @10: putfield int game.C_100336_im.field_102541_w
		// @13: aload_0
		// @14: aload #6
		// @16: putfield game.C_100337_in game.C_100336_im.field_102543_u
		// @19: aload_0
		// @1A: iload_1
		// @1B: putfield int game.C_100336_im.field_102538_m
		// @1E: aload_0
		// @1F: iload #4
		// @21: putfield int game.C_100336_im.field_102544_t
		// @24: aload_0
		// @25: iload_3
		// @26: putfield int game.C_100336_im.field_102537_l
		// @29: aload_0
		// @2A: aload #5
		// @2C: putfield game.C_100326_ic game.C_100336_im.field_102533_B
		// @2F: goto @AA
		// @32: astore #7
		// @34: aload #7
		// @36: new java.lang.StringBuilder
		// @39: dup
		// @3A: invokespecial java.lang.StringBuilder.<init>()void
		// @3D: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @40: bipush 22 (0x16)
		// @42: aaload
		// @43: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @46: iload_1
		// @47: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4A: bipush 44 (0x2C)
		// @4C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4F: iload_2
		// @50: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @53: bipush 44 (0x2C)
		// @55: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @58: iload_3
		// @59: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5C: bipush 44 (0x2C)
		// @5E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @61: iload #4
		// @63: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @66: bipush 44 (0x2C)
		// @68: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6B: aload #5
		// @6D: ifnull @7A
		// @70: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @73: bipush 7 (0x07)
		// @75: aaload
		// @76: goto @7F
		// @79: athrow
		// @7A: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @7D: iconst_4
		// @7E: aaload
		// @7F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @82: bipush 44 (0x2C)
		// @84: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @87: aload #6
		// @89: ifnull @96
		// @8C: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @8F: bipush 7 (0x07)
		// @91: aaload
		// @92: goto @9B
		// @95: athrow
		// @96: getstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @99: iconst_4
		// @9A: aaload
		// @9B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @9E: bipush 41 (0x29)
		// @A0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A3: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @A6: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @A9: athrow
		// @AA: return
	}
	
	static
	{
		// @000: bipush 37 (0x25)
		// @002: anewarray java.lang.String
		// @005: dup
		// @006: iconst_0
		// @007: ldc "iYJ"
		// @009: invokestatic game.C_100336_im.func_102517_z(java.lang.String)char[]
		// @00C: invokestatic game.C_100336_im.func_102507_z(char[])java.lang.String
		// @00F: aastore
		// @010: dup
		// @011: iconst_1
		// @012: ldc "oIr"
		// @014: invokestatic game.C_100336_im.func_102517_z(java.lang.String)char[]
		// @017: invokestatic game.C_100336_im.func_102507_z(char[])java.lang.String
		// @01A: aastore
		// @01B: dup
		// @01C: iconst_2
		// @01D: ldc "\u0012\u001dW\u000cW\u000fK"
		// @01F: invokestatic game.C_100336_im.func_102517_z(java.lang.String)char[]
		// @022: invokestatic game.C_100336_im.func_102507_z(char[])java.lang.String
		// @025: aastore
		// @026: dup
		// @027: iconst_3
		// @028: ldc "\u0012\u001bW\u001aGW\u001bW\u0006\u001e"
		// @02A: invokestatic game.C_100336_im.func_102517_z(java.lang.String)char[]
		// @02D: invokestatic game.C_100336_im.func_102507_z(char[])java.lang.String
		// @030: aastore
		// @031: dup
		// @032: iconst_4
		// @033: ldc "\\\u001c^\u0018"
		// @035: invokestatic game.C_100336_im.func_102517_z(java.lang.String)char[]
		// @038: invokestatic game.C_100336_im.func_102507_z(char[])java.lang.String
		// @03B: aastore
		// @03C: dup
		// @03D: iconst_5
		// @03E: ldc "\u0012\u0005[\u0007WW\u0007W\u0006\u001e"
		// @040: invokestatic game.C_100336_im.func_102517_z(java.lang.String)char[]
		// @043: invokestatic game.C_100336_im.func_102507_z(char[])java.lang.String
		// @046: aastore
		// @047: dup
		// @048: bipush 6 (0x06)
		// @04A: ldc "\u0012\u0004]\u0001PW\u0006D\u0011Q"
		// @04C: invokestatic game.C_100336_im.func_102517_z(java.lang.String)char[]
		// @04F: invokestatic game.C_100336_im.func_102507_z(char[])java.lang.String
		// @052: aastore
		// @053: dup
		// @054: bipush 7 (0x07)
		// @056: ldc "IG\u001cZ^"
		// @058: invokestatic game.C_100336_im.func_102517_z(java.lang.String)char[]
		// @05B: invokestatic game.C_100336_im.func_102507_z(char[])java.lang.String
		// @05E: aastore
		// @05F: dup
		// @060: bipush 8 (0x08)
		// @062: ldc "\u0012\u000f]\u0017VA\u000cV"
		// @064: invokestatic game.C_100336_im.func_102517_z(java.lang.String)char[]
		// @067: invokestatic game.C_100336_im.func_102507_z(char[])java.lang.String
		// @06A: aastore
		// @06B: dup
		// @06C: bipush 9 (0x09)
		// @06E: ldc "[\u0004\u001c?a\u001a"
		// @070: invokestatic game.C_100336_im.func_102517_z(java.lang.String)char[]
		// @073: invokestatic game.C_100336_im.func_102507_z(char[])java.lang.String
		// @076: aastore
		// @077: dup
		// @078: bipush 10 (0x0A)
		// @07A: ldc "[\u0004\u001c \u000b"
		// @07C: invokestatic game.C_100336_im.func_102517_z(java.lang.String)char[]
		// @07F: invokestatic game.C_100336_im.func_102507_z(char[])java.lang.String
		// @082: aastore
		// @083: dup
		// @084: bipush 11 (0x0B)
		// @086: ldc "[\u0004\u001c0b\u001a"
		// @088: invokestatic game.C_100336_im.func_102517_z(java.lang.String)char[]
		// @08B: invokestatic game.C_100336_im.func_102507_z(char[])java.lang.String
		// @08E: aastore
		// @08F: dup
		// @090: bipush 12 (0x0C)
		// @092: ldc "[\u0004\u001c\u0000La\u001d@\u001dMUA\u001b"
		// @094: invokestatic game.C_100336_im.func_102517_z(java.lang.String)char[]
		// @097: invokestatic game.C_100336_im.func_102507_z(char[])java.lang.String
		// @09A: aastore
		// @09B: dup
		// @09C: bipush 13 (0x0D)
		// @09E: ldc "[\u0004\u001c=a\u001a"
		// @0A0: invokestatic game.C_100336_im.func_102517_z(java.lang.String)char[]
		// @0A3: invokestatic game.C_100336_im.func_102507_z(char[])java.lang.String
		// @0A6: aastore
		// @0A7: dup
		// @0A8: bipush 14 (0x0E)
		// @0AA: ldc "[\u0004\u001c:a\u001a"
		// @0AC: invokestatic game.C_100336_im.func_102517_z(java.lang.String)char[]
		// @0AF: invokestatic game.C_100336_im.func_102507_z(char[])java.lang.String
		// @0B2: aastore
		// @0B3: dup
		// @0B4: bipush 15 (0x0F)
		// @0B6: ldc "[\u0004\u001c%\u000b"
		// @0B8: invokestatic game.C_100336_im.func_102517_z(java.lang.String)char[]
		// @0BB: invokestatic game.C_100336_im.func_102507_z(char[])java.lang.String
		// @0BE: aastore
		// @0BF: dup
		// @0C0: bipush 16 (0x10)
		// @0C2: ldc "[\u0004\u001c2\u000b"
		// @0C4: invokestatic game.C_100336_im.func_102517_z(java.lang.String)char[]
		// @0C7: invokestatic game.C_100336_im.func_102507_z(char[])java.lang.String
		// @0CA: aastore
		// @0CB: dup
		// @0CC: bipush 17 (0x11)
		// @0CE: ldc "[\u0004\u001c8a\u001a"
		// @0D0: invokestatic game.C_100336_im.func_102517_z(java.lang.String)char[]
		// @0D3: invokestatic game.C_100336_im.func_102507_z(char[])java.lang.String
		// @0D6: aastore
		// @0D7: dup
		// @0D8: bipush 18 (0x12)
		// @0DA: ldc "[\u0004\u001c$a\u001a"
		// @0DC: invokestatic game.C_100336_im.func_102517_z(java.lang.String)char[]
		// @0DF: invokestatic game.C_100336_im.func_102507_z(char[])java.lang.String
		// @0E2: aastore
		// @0E3: dup
		// @0E4: bipush 19 (0x13)
		// @0E6: ldc "\u000e\n[\u0006@G\u0005S\u0006\u0003iYJ"
		// @0E8: invokestatic game.C_100336_im.func_102517_z(java.lang.String)char[]
		// @0EB: invokestatic game.C_100336_im.func_102507_z(char[])java.lang.String
		// @0EE: aastore
		// @0EF: dup
		// @0F0: bipush 20 (0x14)
		// @0F2: ldc "[\u0004\u001c9a\u001a"
		// @0F4: invokestatic game.C_100336_im.func_102517_z(java.lang.String)char[]
		// @0F7: invokestatic game.C_100336_im.func_102507_z(char[])java.lang.String
		// @0FA: aastore
		// @0FB: dup
		// @0FC: bipush 21 (0x15)
		// @0FE: ldc "oW"
		// @100: invokestatic game.C_100336_im.func_102517_z(java.lang.String)char[]
		// @103: invokestatic game.C_100336_im.func_102507_z(char[])java.lang.String
		// @106: aastore
		// @107: dup
		// @108: bipush 22 (0x16)
		// @10A: ldc "[\u0004\u001cHJ\\\u0000FJ\u000b"
		// @10C: invokestatic game.C_100336_im.func_102517_z(java.lang.String)char[]
		// @10F: invokestatic game.C_100336_im.func_102507_z(char[])java.lang.String
		// @112: aastore
		// @113: dup
		// @114: bipush 23 (0x17)
		// @116: ldc "[\u0004\u001c<a\u001a"
		// @118: invokestatic game.C_100336_im.func_102517_z(java.lang.String)char[]
		// @11B: invokestatic game.C_100336_im.func_102507_z(char[])java.lang.String
		// @11E: aastore
		// @11F: dup
		// @120: bipush 24 (0x18)
		// @122: ldc "[\u0004\u001c3a\u001a"
		// @124: invokestatic game.C_100336_im.func_102517_z(java.lang.String)char[]
		// @127: invokestatic game.C_100336_im.func_102507_z(char[])java.lang.String
		// @12A: aastore
		// @12B: dup
		// @12C: bipush 25 (0x19)
		// @12E: ldc "[\u0004\u001c7\u000b"
		// @130: invokestatic game.C_100336_im.func_102517_z(java.lang.String)char[]
		// @133: invokestatic game.C_100336_im.func_102507_z(char[])java.lang.String
		// @136: aastore
		// @137: dup
		// @138: bipush 26 (0x1A)
		// @13A: ldc "[\u0004\u001c1b\u001a"
		// @13C: invokestatic game.C_100336_im.func_102517_z(java.lang.String)char[]
		// @13F: invokestatic game.C_100336_im.func_102507_z(char[])java.lang.String
		// @142: aastore
		// @143: dup
		// @144: bipush 27 (0x1B)
		// @146: ldc "[\u0004\u001c#\u000b"
		// @148: invokestatic game.C_100336_im.func_102517_z(java.lang.String)char[]
		// @14B: invokestatic game.C_100336_im.func_102507_z(char[])java.lang.String
		// @14E: aastore
		// @14F: dup
		// @150: bipush 28 (0x1C)
		// @152: ldc "[\u0004\u001c8b\u001a"
		// @154: invokestatic game.C_100336_im.func_102517_z(java.lang.String)char[]
		// @157: invokestatic game.C_100336_im.func_102507_z(char[])java.lang.String
		// @15A: aastore
		// @15B: dup
		// @15C: bipush 29 (0x1D)
		// @15E: ldc "[\u0004\u001c7b\u001a"
		// @160: invokestatic game.C_100336_im.func_102517_z(java.lang.String)char[]
		// @163: invokestatic game.C_100336_im.func_102507_z(char[])java.lang.String
		// @166: aastore
		// @167: dup
		// @168: bipush 30 (0x1E)
		// @16A: ldc "[\u0004\u001c%a\u001a"
		// @16C: invokestatic game.C_100336_im.func_102517_z(java.lang.String)char[]
		// @16F: invokestatic game.C_100336_im.func_102507_z(char[])java.lang.String
		// @172: aastore
		// @173: dup
		// @174: bipush 31 (0x1F)
		// @176: ldc "[\u0004\u001c2b\u001a"
		// @178: invokestatic game.C_100336_im.func_102517_z(java.lang.String)char[]
		// @17B: invokestatic game.C_100336_im.func_102507_z(char[])java.lang.String
		// @17E: aastore
		// @17F: dup
		// @180: bipush 32 (0x20)
		// @182: ldc "[\u0004\u001c;a\u001a"
		// @184: invokestatic game.C_100336_im.func_102517_z(java.lang.String)char[]
		// @187: invokestatic game.C_100336_im.func_102507_z(char[])java.lang.String
		// @18A: aastore
		// @18B: dup
		// @18C: bipush 33 (0x21)
		// @18E: ldc "[\u0004\u001c!\u000b"
		// @190: invokestatic game.C_100336_im.func_102517_z(java.lang.String)char[]
		// @193: invokestatic game.C_100336_im.func_102507_z(char[])java.lang.String
		// @196: aastore
		// @197: dup
		// @198: bipush 34 (0x22)
		// @19A: ldc "[\u0004\u001c>a\u001a"
		// @19C: invokestatic game.C_100336_im.func_102517_z(java.lang.String)char[]
		// @19F: invokestatic game.C_100336_im.func_102507_z(char[])java.lang.String
		// @1A2: aastore
		// @1A3: dup
		// @1A4: bipush 35 (0x23)
		// @1A6: ldc "[\u0004\u001c5b\u001a"
		// @1A8: invokestatic game.C_100336_im.func_102517_z(java.lang.String)char[]
		// @1AB: invokestatic game.C_100336_im.func_102507_z(char[])java.lang.String
		// @1AE: aastore
		// @1AF: dup
		// @1B0: bipush 36 (0x24)
		// @1B2: ldc "[\u0004\u001c'\u000b"
		// @1B4: invokestatic game.C_100336_im.func_102517_z(java.lang.String)char[]
		// @1B7: invokestatic game.C_100336_im.func_102507_z(char[])java.lang.String
		// @1BA: aastore
		// @1BB: putstatic java.lang.String[] game.C_100336_im.field_102531_D
		// @1BE: ldc "\u000eL\u0003J\u0003E\u0008ATGS\u0004S\u0013FVIP\r\u0003\u000eL\u0002J"
		// @1C0: invokestatic game.C_100336_im.func_102517_z(java.lang.String)char[]
		// @1C3: invokestatic game.C_100336_im.func_102507_z(char[])java.lang.String
		// @1C6: putstatic java.lang.String game.C_100336_im.field_102546_r
		// @1C9: ldc "a\u0001]\u0003\u0003Q\u0001S\u0000\u0003\u001aU\u0017D\u001d\u0012\u001c\\\u0006FS\r\u0012\u0019FA\u001aS\u0013FA@"
		// @1CB: invokestatic game.C_100336_im.func_102517_z(java.lang.String)char[]
		// @1CE: invokestatic game.C_100336_im.func_102507_z(char[])java.lang.String
		// @1D1: putstatic java.lang.String game.C_100336_im.field_102542_v
		// @1D4: ldc "f\u0001WT\u001f\u0017Y\u000cTKS\u001a\u0012\u0015O@\u000cS\u0010Z\u0012\u000bW\u0011M\u0012\u000c\\\u0013J\\\u000cW\u0006FVG"
		// @1D6: invokestatic game.C_100336_im.func_102517_z(java.lang.String)char[]
		// @1D9: invokestatic game.C_100336_im.func_102507_z(char[])java.lang.String
		// @1DC: putstatic java.lang.String game.C_100336_im.field_102548_p
		// @1DF: ldc "\u000e\n]\u0018\u001eT\u000fT\u0012ETWf\u001dNWS\u000e[@]\u0005\u000cT\u001f\u0017Y\u000c"
		// @1E1: invokestatic game.C_100336_im.func_102517_z(java.lang.String)char[]
		// @1E4: invokestatic game.C_100336_im.func_102507_z(char[])java.lang.String
		// @1E7: putstatic java.lang.String game.C_100336_im.field_102549_z
		// @1EA: return
	}
	
	private static char[] func_102517_z(String arg0)
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
		// @0E: bipush 35 (0x23)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_102507_z(char[] arg0)
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
		// @30: bipush 50 (0x32)
		// @32: goto @46
		// @35: bipush 105 (0x69)
		// @37: goto @46
		// @3A: bipush 50 (0x32)
		// @3C: goto @46
		// @3F: bipush 116 (0x74)
		// @41: goto @46
		// @44: bipush 35 (0x23)
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
