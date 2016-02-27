package game;

abstract class C_100249_pc extends C_100325_id
{
	static C_100037_wb[] field_102328_G;
	static String[] field_102330_B;
	int field_102339_s;
	static int field_102333_I;
	static String field_102338_t;
	static C_100302_ka field_102336_v;
	static String field_102327_F;
	int field_102340_z;
	static C_100202_qi field_102342_x;
	static String field_102325_D;
	int field_102337_u;
	int field_102332_H;
	static int field_102326_E;
	int field_102341_y;
	static boolean field_102329_A;
	int field_102335_w;
	static String field_102331_C;
	private static final String[] field_102334_K;
	
	static final boolean func_102317_d(byte arg0)
	{
		// @00: iload_0
		// @01: bipush 106 (0x6A)
		// @03: if_icmpeq @08
		// @06: iconst_0
		// @07: ireturn
		// @08: getstatic game.C_100068_vc game.C_100191_rg.field_100845_o
		// @0B: getstatic game.C_100068_vc game.C_100148_bh.field_101797_B
		// @0E: if_acmpne @16
		// @11: iconst_1
		// @12: goto @17
		// @15: athrow
		// @16: iconst_0
		// @17: ireturn
		// @18: astore_1
		// @19: aload_1
		// @1A: new java.lang.StringBuilder
		// @1D: dup
		// @1E: invokespecial java.lang.StringBuilder.<init>()void
		// @21: getstatic java.lang.String[] game.C_100249_pc.field_102334_K
		// @24: iconst_5
		// @25: aaload
		// @26: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @29: iload_0
		// @2A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2D: bipush 41 (0x29)
		// @2F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @32: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @35: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @38: athrow
	}
	
	static final void func_102322_a(C_100211_qd arg0, int arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore_3
		// @04: aload_0
		// @05: bipush 45 (0x2D)
		// @07: invokevirtual game.C_100211_qd.func_100583_c(int)void
		// @0A: getstatic game.C_100202_qi game.C_100335_il.field_107368_e
		// @0D: bipush 24 (0x18)
		// @0F: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @12: checkcast game.C_100211_qd
		// @15: astore_2
		// @16: iload_1
		// @17: bipush 103 (0x67)
		// @19: if_icmpgt @27
		// @1C: aconst_null
		// @1D: checkcast java.lang.String
		// @20: putstatic java.lang.String game.C_100249_pc.field_102327_F
		// @23: goto @27
		// @26: athrow
		// @27: aload_2
		// @28: ifnull @4D
		// @2B: aload_2
		// @2C: bipush 95 (0x5F)
		// @2E: aload_0
		// @2F: invokevirtual game.C_100211_qd.func_102132_a(byte, game.C_100211_qd)boolean
		// @32: iload_3
		// @33: ifne @69
		// @36: ifeq @4D
		// @39: goto @3D
		// @3C: athrow
		// @3D: getstatic game.C_100202_qi game.C_100335_il.field_107368_e
		// @40: bipush 99 (0x63)
		// @42: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @45: checkcast game.C_100211_qd
		// @48: astore_2
		// @49: iload_3
		// @4A: ifeq @27
		// @4D: aconst_null
		// @4E: aload_2
		// @4F: if_acmpne @63
		// @52: getstatic game.C_100202_qi game.C_100335_il.field_107368_e
		// @55: bipush 124 (0x7C)
		// @57: aload_0
		// @58: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @5B: iload_3
		// @5C: ifeq @6E
		// @5F: goto @63
		// @62: athrow
		// @63: bipush 72 (0x48)
		// @65: goto @69
		// @68: athrow
		// @69: aload_0
		// @6A: aload_2
		// @6B: invokestatic game.C_100042_we.func_104130_a(int, game.C_100158_da, game.C_100158_da)void
		// @6E: goto @AC
		// @71: astore_2
		// @72: aload_2
		// @73: new java.lang.StringBuilder
		// @76: dup
		// @77: invokespecial java.lang.StringBuilder.<init>()void
		// @7A: getstatic java.lang.String[] game.C_100249_pc.field_102334_K
		// @7D: iconst_3
		// @7E: aaload
		// @7F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @82: aload_0
		// @83: ifnull @8F
		// @86: getstatic java.lang.String[] game.C_100249_pc.field_102334_K
		// @89: iconst_2
		// @8A: aaload
		// @8B: goto @94
		// @8E: athrow
		// @8F: getstatic java.lang.String[] game.C_100249_pc.field_102334_K
		// @92: iconst_1
		// @93: aaload
		// @94: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @97: bipush 44 (0x2C)
		// @99: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9C: iload_1
		// @9D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @A0: bipush 41 (0x29)
		// @A2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A5: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @A8: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @AB: athrow
		// @AC: return
	}
	
	static final int func_102324_a(int arg0, int arg1)
	{
		// @00: iload_1
		// @01: ifeq @07
		// @04: bipush 63 (0x3F)
		// @06: ireturn
		// @07: iinc #0 +255
		// @0A: iload_0
		// @0B: iload_0
		// @0C: ldc -662522783 (0xd882b461)
		// @0E: iushr
		// @0F: ior
		// @10: istore_0
		// @11: iload_0
		// @12: iload_0
		// @13: ldc 1450302594 (0x5671dc82)
		// @15: iushr
		// @16: ior
		// @17: istore_0
		// @18: iload_0
		// @19: iload_0
		// @1A: ldc 1271703108 (0x4bcca644)
		// @1C: iushr
		// @1D: ior
		// @1E: istore_0
		// @1F: iload_0
		// @20: iload_0
		// @21: ldc 1711582056 (0x6604ab68)
		// @23: iushr
		// @24: ior
		// @25: istore_0
		// @26: iload_0
		// @27: iload_0
		// @28: ldc 1166261872 (0x4583be70)
		// @2A: iushr
		// @2B: ior
		// @2C: istore_0
		// @2D: iconst_1
		// @2E: iload_0
		// @2F: iadd
		// @30: ireturn
		// @31: astore_2
		// @32: aload_2
		// @33: new java.lang.StringBuilder
		// @36: dup
		// @37: invokespecial java.lang.StringBuilder.<init>()void
		// @3A: getstatic java.lang.String[] game.C_100249_pc.field_102334_K
		// @3D: bipush 7 (0x07)
		// @3F: aaload
		// @40: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @43: iload_0
		// @44: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @47: bipush 44 (0x2C)
		// @49: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4C: iload_1
		// @4D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @50: bipush 41 (0x29)
		// @52: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @55: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @58: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @5B: athrow
	}
	
	static final boolean func_102316_e(byte arg0)
	{
		// @00: iload_0
		// @01: iconst_5
		// @02: if_icmpeq @07
		// @05: iconst_0
		// @06: ireturn
		// @07: getstatic game.C_100118_ub game.C_100038_wa.field_104073_n
		// @0A: ifnull @12
		// @0D: iconst_1
		// @0E: goto @13
		// @11: athrow
		// @12: iconst_0
		// @13: ireturn
		// @14: astore_1
		// @15: aload_1
		// @16: new java.lang.StringBuilder
		// @19: dup
		// @1A: invokespecial java.lang.StringBuilder.<init>()void
		// @1D: getstatic java.lang.String[] game.C_100249_pc.field_102334_K
		// @20: bipush 6 (0x06)
		// @22: aaload
		// @23: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @26: iload_0
		// @27: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @2A: bipush 41 (0x29)
		// @2C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @2F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @32: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @35: athrow
	}
	
	static final int func_102318_a(int arg0, int arg1, int arg2)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #4
		// @05: iconst_0
		// @06: istore_3
		// @07: iload_1
		// @08: ldc 1711582056 (0x6604ab68)
		// @0A: if_icmpeq @10
		// @0D: bipush 56 (0x38)
		// @0F: ireturn
		// @10: iload_0
		// @11: iconst_m1
		// @12: ixor
		// @13: iconst_m1
		// @14: if_icmpge @31
		// @17: iload_2
		// @18: iconst_1
		// @19: iand
		// @1A: iload_3
		// @1B: ldc -1376290463 (0xadf77961)
		// @1D: ishl
		// @1E: ior
		// @1F: istore_3
		// @20: iinc #0 +255
		// @23: iload_2
		// @24: iconst_1
		// @25: iushr
		// @26: iload #4
		// @28: ifne @32
		// @2B: istore_2
		// @2C: iload #4
		// @2E: ifeq @10
		// @31: iload_3
		// @32: ireturn
		// @33: astore_3
		// @34: aload_3
		// @35: new java.lang.StringBuilder
		// @38: dup
		// @39: invokespecial java.lang.StringBuilder.<init>()void
		// @3C: getstatic java.lang.String[] game.C_100249_pc.field_102334_K
		// @3F: bipush 8 (0x08)
		// @41: aaload
		// @42: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @45: iload_0
		// @46: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @49: bipush 44 (0x2C)
		// @4B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4E: iload_1
		// @4F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @52: bipush 44 (0x2C)
		// @54: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @57: iload_2
		// @58: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5B: bipush 41 (0x29)
		// @5D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @60: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @63: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @66: athrow
	}
	
	public static void func_102319_i(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic game.C_100037_wb[] game.C_100249_pc.field_102328_G
		// @04: aconst_null
		// @05: putstatic java.lang.String game.C_100249_pc.field_102331_C
		// @08: aconst_null
		// @09: putstatic java.lang.String game.C_100249_pc.field_102327_F
		// @0C: iload_0
		// @0D: sipush 3120 (0x0C30)
		// @10: if_icmpeq @1E
		// @13: aconst_null
		// @14: checkcast game.C_100037_wb[]
		// @17: putstatic game.C_100037_wb[] game.C_100249_pc.field_102328_G
		// @1A: goto @1E
		// @1D: athrow
		// @1E: aconst_null
		// @1F: putstatic game.C_100202_qi game.C_100249_pc.field_102342_x
		// @22: aconst_null
		// @23: putstatic java.lang.String game.C_100249_pc.field_102325_D
		// @26: aconst_null
		// @27: putstatic game.C_100302_ka game.C_100249_pc.field_102336_v
		// @2A: aconst_null
		// @2B: putstatic java.lang.String game.C_100249_pc.field_102338_t
		// @2E: aconst_null
		// @2F: putstatic java.lang.String[] game.C_100249_pc.field_102330_B
		// @32: goto @56
		// @35: astore_1
		// @36: aload_1
		// @37: new java.lang.StringBuilder
		// @3A: dup
		// @3B: invokespecial java.lang.StringBuilder.<init>()void
		// @3E: getstatic java.lang.String[] game.C_100249_pc.field_102334_K
		// @41: iconst_4
		// @42: aaload
		// @43: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @46: iload_0
		// @47: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4A: bipush 41 (0x29)
		// @4C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4F: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @52: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @55: athrow
		// @56: return
	}
	
	static final void func_102323_a(int arg0, boolean arg1)
	{
		// @00: bipush 64 (0x40)
		// @02: invokestatic game.C_100087_n.func_100688_e(int)boolean
		// @05: ifeq @0A
		// @08: iconst_0
		// @09: istore_1
		// @0A: iload_1
		// @0B: bipush 82 (0x52)
		// @0D: invokestatic game.C_100105_eg.func_104726_a(boolean, byte)void
		// @10: bipush 95 (0x5F)
		// @12: invokestatic game.C_100294_ki.func_106936_a(byte)void
		// @15: iload_0
		// @16: sipush 15949 (0x3E4D)
		// @19: if_icmpeq @27
		// @1C: aconst_null
		// @1D: checkcast game.C_100037_wb[]
		// @20: putstatic game.C_100037_wb[] game.C_100249_pc.field_102328_G
		// @23: goto @27
		// @26: athrow
		// @27: goto @54
		// @2A: astore_2
		// @2B: aload_2
		// @2C: new java.lang.StringBuilder
		// @2F: dup
		// @30: invokespecial java.lang.StringBuilder.<init>()void
		// @33: getstatic java.lang.String[] game.C_100249_pc.field_102334_K
		// @36: iconst_0
		// @37: aaload
		// @38: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3B: iload_0
		// @3C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3F: bipush 44 (0x2C)
		// @41: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @44: iload_1
		// @45: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @48: bipush 41 (0x29)
		// @4A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @50: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @53: athrow
		// @54: return
	}
	
	static
	{
		// @00: bipush 9 (0x09)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "\u000e-c\u0018\u0008V"
		// @09: invokestatic game.C_100249_pc.func_102321_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100249_pc.func_102320_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "\u0010;! "
		// @14: invokestatic game.C_100249_pc.func_102321_z(java.lang.String)char[]
		// @17: invokestatic game.C_100249_pc.func_102320_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "\u0005`cb4"
		// @1F: invokestatic game.C_100249_pc.func_102321_z(java.lang.String)char[]
		// @22: invokestatic game.C_100249_pc.func_102320_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "\u000e-c\u001f\u0008V"
		// @2A: invokestatic game.C_100249_pc.func_102321_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100249_pc.func_102320_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "\u000e-c\u001d\u0008V"
		// @35: invokestatic game.C_100249_pc.func_102321_z(java.lang.String)char[]
		// @38: invokestatic game.C_100249_pc.func_102320_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "\u000e-c\u0019\u0008V"
		// @40: invokestatic game.C_100249_pc.func_102321_z(java.lang.String)char[]
		// @43: invokestatic game.C_100249_pc.func_102320_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "\u000e-c\u001b\u0008V"
		// @4C: invokestatic game.C_100249_pc.func_102321_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100249_pc.func_102320_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "\u000e-c\u001e\u0008V"
		// @58: invokestatic game.C_100249_pc.func_102321_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100249_pc.func_102320_z(char[])java.lang.String
		// @5E: aastore
		// @5F: dup
		// @60: bipush 8 (0x08)
		// @62: ldc "\u000e-c\u001a\u0008V"
		// @64: invokestatic game.C_100249_pc.func_102321_z(java.lang.String)char[]
		// @67: invokestatic game.C_100249_pc.func_102320_z(char[])java.lang.String
		// @6A: aastore
		// @6B: putstatic java.lang.String[] game.C_100249_pc.field_102334_K
		// @6E: iconst_3
		// @6F: putstatic int game.C_100249_pc.field_102333_I
		// @72: iconst_3
		// @73: anewarray java.lang.String
		// @76: dup
		// @77: iconst_0
		// @78: ldc "5\u0000\u0008\t\u0005^\u000c\u0008\n\u0006,\u000bm\u0015\u0006+\u001cm\u000f\u00060\u001f\u0018\t\u001b1\u001cl"
		// @7A: invokestatic game.C_100249_pc.func_102321_z(java.lang.String)char[]
		// @7D: invokestatic game.C_100249_pc.func_102320_z(char[])java.lang.String
		// @80: aastore
		// @81: dup
		// @82: iconst_1
		// @83: ldc "2!?(i</j-%Rn%)%\u000en )h"
		// @85: invokestatic game.C_100249_pc.func_102321_z(java.lang.String)char[]
		// @88: invokestatic game.C_100249_pc.func_102320_z(char[])java.lang.String
		// @8B: aastore
		// @8C: dup
		// @8D: iconst_2
		// @8E: ldc "2!?(i</j-%Rn%)%\u000en8?h"
		// @90: invokestatic game.C_100249_pc.func_102321_z(java.lang.String)char[]
		// @93: invokestatic game.C_100249_pc.func_102320_z(char[])java.lang.String
		// @96: aastore
		// @97: putstatic java.lang.String[] game.C_100249_pc.field_102330_B
		// @9A: ldc ".<(?:^\u000b\u001e\u000fi\u0018!?l\u0006\u000e:$#'\rn\u0000)'\u000b"
		// @9C: invokestatic game.C_100249_pc.func_102321_z(java.lang.String)char[]
		// @9F: invokestatic game.C_100249_pc.func_102320_z(char[])java.lang.String
		// @A2: putstatic java.lang.String game.C_100249_pc.field_102325_D
		// @A5: iconst_m1
		// @A6: putstatic int game.C_100249_pc.field_102326_E
		// @A9: ldc ".\u001c\u0002\u000b\u001b;\u001d\u001el\u000b;\u0017\u0002\u0002\r^\u001a\u0005\u0005\u001a^\u001e\u0002\u0005\u0007*n\u001f\t\u0018+\u0007\u001f\t\u001a^\u0017\u0002\u0019i*\u0001m\u0000\u00069n\u0004\u0002i1\u001cm\u000f\u001b;\u000f\u0019\ti?n\u000b\u001e\u000c;n\u000c\u000f\n1\u001b\u0003\u0018g"
		// @AB: invokestatic game.C_100249_pc.func_102321_z(java.lang.String)char[]
		// @AE: invokestatic game.C_100249_pc.func_102320_z(char[])java.lang.String
		// @B1: putstatic java.lang.String game.C_100249_pc.field_102338_t
		// @B4: iconst_0
		// @B5: putstatic boolean game.C_100249_pc.field_102329_A
		// @B8: ldc "*!mplNpwl"
		// @BA: invokestatic game.C_100249_pc.func_102321_z(java.lang.String)char[]
		// @BD: invokestatic game.C_100249_pc.func_102320_z(char[])java.lang.String
		// @C0: putstatic java.lang.String game.C_100249_pc.field_102331_C
		// @C3: ldc "-/;)i\u0018/;#<\u000c'9)"
		// @C5: invokestatic game.C_100249_pc.func_102321_z(java.lang.String)char[]
		// @C8: invokestatic game.C_100249_pc.func_102320_z(char[])java.lang.String
		// @CB: putstatic java.lang.String game.C_100249_pc.field_102327_F
		// @CE: new game.C_100202_qi
		// @D1: dup
		// @D2: invokespecial game.C_100202_qi.<init>()void
		// @D5: putstatic game.C_100202_qi game.C_100249_pc.field_102342_x
		// @D8: return
	}
	
	private static char[] func_102321_z(String arg0)
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
		// @0E: bipush 73 (0x49)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_102320_z(char[] arg0)
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
		// @30: bipush 126 (0x7E)
		// @32: goto @46
		// @35: bipush 78 (0x4E)
		// @37: goto @46
		// @3A: bipush 77 (0x4D)
		// @3C: goto @46
		// @3F: bipush 76 (0x4C)
		// @41: goto @46
		// @44: bipush 73 (0x49)
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
