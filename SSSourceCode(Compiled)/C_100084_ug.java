package game;

import java.util.Iterator;
import java.math.BigInteger;

final class C_100084_ug implements Iterator
{
	static C_100251_pm[] field_104485_j;
	private C_100325_id field_104480_d;
	static int field_104484_a;
	private C_100325_id field_104482_b;
	static C_100037_wb[] field_104487_k;
	private C_100052_eb field_104479_g;
	static C_100302_ka[] field_104478_f;
	static C_100302_ka field_104481_e;
	static BigInteger field_104488_h;
	static String field_104483_c;
	static C_100002_gf field_104489_i;
	private static final String[] field_104486_z;
	
	static final int func_104476_a(int arg0, long arg1)
	{
		// @00: ldc2_w 6148914691236517205
		// @03: lload_1
		// @04: ldc -705429247 (0xd5f40101)
		// @06: lushr
		// @07: land
		// @08: ldc2_w 6148914691236517205
		// @0B: lload_1
		// @0C: land
		// @0D: ladd
		// @0E: lstore_1
		// @0F: ldc2_w 3689348814741910323
		// @12: lload_1
		// @13: land
		// @14: lload_1
		// @15: ldc -6003582 (0xffa46482)
		// @17: lushr
		// @18: ldc2_w 3689348814741910323
		// @1B: land
		// @1C: ladd
		// @1D: lstore_1
		// @1E: ldc2_w 1085102592571150095
		// @21: lload_1
		// @22: ldc 1366831812 (0x517832c4)
		// @24: lushr
		// @25: lload_1
		// @26: ladd
		// @27: land
		// @28: lstore_1
		// @29: iload_0
		// @2A: sipush 29219 (0x7223)
		// @2D: if_icmpeq @3B
		// @30: aconst_null
		// @31: checkcast game.C_100302_ka[]
		// @34: putstatic game.C_100302_ka[] game.C_100084_ug.field_104478_f
		// @37: goto @3B
		// @3A: athrow
		// @3B: lload_1
		// @3C: lload_1
		// @3D: ldc -1104208056 (0xbe2f1f48)
		// @3F: lushr
		// @40: ladd
		// @41: lstore_1
		// @42: lload_1
		// @43: lload_1
		// @44: ldc 445543312 (0x1a8e7390)
		// @46: lushr
		// @47: ladd
		// @48: lstore_1
		// @49: lload_1
		// @4A: lload_1
		// @4B: ldc -382718112 (0xe9302f60)
		// @4D: lushr
		// @4E: ladd
		// @4F: lstore_1
		// @50: ldc2_w 255
		// @53: lload_1
		// @54: land
		// @55: l2i
		// @56: ireturn
		// @57: astore_3
		// @58: aload_3
		// @59: new java.lang.StringBuilder
		// @5C: dup
		// @5D: invokespecial java.lang.StringBuilder.<init>()void
		// @60: getstatic java.lang.String[] game.C_100084_ug.field_104486_z
		// @63: iconst_1
		// @64: aaload
		// @65: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @68: iload_0
		// @69: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6C: bipush 44 (0x2C)
		// @6E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @71: lload_1
		// @72: invokevirtual java.lang.StringBuilder.append(long)java.lang.StringBuilder
		// @75: bipush 41 (0x29)
		// @77: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @7D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @80: athrow
	}
	
	public final Object next()
	{
		// @00: aload_0
		// @01: getfield game.C_100325_id game.C_100084_ug.field_104482_b
		// @04: astore_1
		// @05: aload_0
		// @06: getfield game.C_100052_eb game.C_100084_ug.field_104479_g
		// @09: getfield game.C_100325_id game.C_100052_eb.field_104232_c
		// @0C: aload_1
		// @0D: if_acmpne @1A
		// @10: aconst_null
		// @11: astore_1
		// @12: aload_0
		// @13: aconst_null
		// @14: putfield game.C_100325_id game.C_100084_ug.field_104482_b
		// @17: goto @22
		// @1A: aload_0
		// @1B: aload_1
		// @1C: getfield game.C_100325_id game.C_100325_id.field_101483_n
		// @1F: putfield game.C_100325_id game.C_100084_ug.field_104482_b
		// @22: aload_0
		// @23: aload_1
		// @24: putfield game.C_100325_id game.C_100084_ug.field_104480_d
		// @27: aload_1
		// @28: areturn
		// @29: astore_1
		// @2A: aload_1
		// @2B: getstatic java.lang.String[] game.C_100084_ug.field_104486_z
		// @2E: iconst_2
		// @2F: aaload
		// @30: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @33: athrow
	}
	
	static final void func_104472_b(int arg0)
	{
		// @00: new game.C_100043_vl
		// @03: dup
		// @04: getstatic game.C_100302_ka game.C_100097_k.field_104578_f
		// @07: getstatic game.C_100302_ka game.C_100151_bc.field_102932_cb
		// @0A: getstatic game.C_100302_ka game.C_100164_se.field_105456_h
		// @0D: getstatic game.C_100302_ka game.C_100129_tg.field_102750_sb
		// @10: getstatic game.C_100122_em game.C_100119_ua.field_104902_b
		// @13: getstatic game.C_100302_ka game.C_100236_on.field_100906_r
		// @16: invokespecial game.C_100043_vl.<init>(game.C_100302_ka, game.C_100302_ka, game.C_100302_ka, game.C_100302_ka, game.C_100302_ka, game.C_100302_ka)void
		// @19: putstatic game.C_100043_vl game.C_100343_jf.field_104825_l
		// @1C: iload_0
		// @1D: bipush -29 (0xE3)
		// @1F: if_icmplt @27
		// @22: bipush 52 (0x34)
		// @24: invokestatic game.C_100084_ug.func_104472_b(int)void
		// @27: goto @4B
		// @2A: astore_1
		// @2B: aload_1
		// @2C: new java.lang.StringBuilder
		// @2F: dup
		// @30: invokespecial java.lang.StringBuilder.<init>()void
		// @33: getstatic java.lang.String[] game.C_100084_ug.field_104486_z
		// @36: iconst_4
		// @37: aaload
		// @38: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3B: iload_0
		// @3C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3F: bipush 41 (0x29)
		// @41: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @44: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @47: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4A: athrow
		// @4B: return
	}
	
	public final boolean hasNext()
	{
		// @00: aload_0
		// @01: getfield game.C_100052_eb game.C_100084_ug.field_104479_g
		// @04: getfield game.C_100325_id game.C_100052_eb.field_104232_c
		// @07: aload_0
		// @08: getfield game.C_100325_id game.C_100084_ug.field_104482_b
		// @0B: if_acmpeq @13
		// @0E: iconst_1
		// @0F: goto @14
		// @12: athrow
		// @13: iconst_0
		// @14: ireturn
		// @15: astore_1
		// @16: aload_1
		// @17: getstatic java.lang.String[] game.C_100084_ug.field_104486_z
		// @1A: iconst_0
		// @1B: aaload
		// @1C: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @1F: athrow
	}
	
	static final void func_104477_a(int arg0, int arg1)
	{
		// @00: sipush 400 (0x0190)
		// @03: iload_1
		// @04: imul
		// @05: sipush 150 (0x0096)
		// @08: idiv
		// @09: putstatic int game.C_100338_jc.field_105373_k
		// @0C: iload_1
		// @0D: ldc 1254952528 (0x4acd0e50)
		// @0F: ishl
		// @10: sipush 150 (0x0096)
		// @13: idiv
		// @14: putstatic int game.C_100338_jc.field_105366_e
		// @17: bipush 100 (0x64)
		// @19: iload_1
		// @1A: imul
		// @1B: sipush 150 (0x0096)
		// @1E: idiv
		// @1F: putstatic int game.C_100338_jc.field_105367_b
		// @22: iload_0
		// @23: bipush 32 (0x20)
		// @25: if_icmpeq @2F
		// @28: aconst_null
		// @29: checkcast game.C_100302_ka[]
		// @2C: putstatic game.C_100302_ka[] game.C_100084_ug.field_104478_f
		// @2F: goto @5C
		// @32: astore_2
		// @33: aload_2
		// @34: new java.lang.StringBuilder
		// @37: dup
		// @38: invokespecial java.lang.StringBuilder.<init>()void
		// @3B: getstatic java.lang.String[] game.C_100084_ug.field_104486_z
		// @3E: iconst_3
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
		// @5C: return
	}
	
	public final void remove()
	{
		// @00: aconst_null
		// @01: aload_0
		// @02: getfield game.C_100325_id game.C_100084_ug.field_104480_d
		// @05: if_acmpne @11
		// @08: new java.lang.IllegalStateException
		// @0B: dup
		// @0C: invokespecial java.lang.IllegalStateException.<init>()void
		// @0F: athrow
		// @10: athrow
		// @11: aload_0
		// @12: getfield game.C_100325_id game.C_100084_ug.field_104480_d
		// @15: bipush 8 (0x08)
		// @17: invokevirtual game.C_100325_id.func_101479_c(byte)void
		// @1A: aload_0
		// @1B: aconst_null
		// @1C: putfield game.C_100325_id game.C_100084_ug.field_104480_d
		// @1F: goto @2E
		// @22: astore_1
		// @23: aload_1
		// @24: getstatic java.lang.String[] game.C_100084_ug.field_104486_z
		// @27: bipush 11 (0x0B)
		// @29: aaload
		// @2A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @2D: athrow
		// @2E: return
	}
	
	static final boolean func_104471_a(int arg0, int arg1, int arg2)
	{
		// @00: iload_2
		// @01: iconst_m1
		// @02: ixor
		// @03: bipush -2 (0xFE)
		// @05: if_icmpeq @14
		// @08: bipush -5 (0xFB)
		// @0A: iload_2
		// @0B: iconst_m1
		// @0C: ixor
		// @0D: if_icmpne @20
		// @10: goto @14
		// @13: athrow
		// @14: iload_0
		// @15: iconst_2
		// @16: irem
		// @17: ifeq @20
		// @1A: goto @1E
		// @1D: athrow
		// @1E: iconst_0
		// @1F: ireturn
		// @20: bipush -6 (0xFA)
		// @22: iload_2
		// @23: iconst_m1
		// @24: ixor
		// @25: if_icmpne @3B
		// @28: bipush -3 (0xFD)
		// @2A: iload_0
		// @2B: iconst_m1
		// @2C: ixor
		// @2D: if_icmpne @39
		// @30: goto @34
		// @33: athrow
		// @34: iconst_1
		// @35: goto @3A
		// @38: athrow
		// @39: iconst_0
		// @3A: ireturn
		// @3B: bipush -121 (0x87)
		// @3D: iload_1
		// @3E: bipush -88 (0xA8)
		// @40: isub
		// @41: bipush 34 (0x22)
		// @43: idiv
		// @44: idiv
		// @45: istore_3
		// @46: bipush -3 (0xFD)
		// @48: iload_0
		// @49: iconst_m1
		// @4A: ixor
		// @4B: if_icmplt @53
		// @4E: iconst_1
		// @4F: goto @54
		// @52: athrow
		// @53: iconst_0
		// @54: ireturn
		// @55: astore_3
		// @56: aload_3
		// @57: new java.lang.StringBuilder
		// @5A: dup
		// @5B: invokespecial java.lang.StringBuilder.<init>()void
		// @5E: getstatic java.lang.String[] game.C_100084_ug.field_104486_z
		// @61: bipush 9 (0x09)
		// @63: aaload
		// @64: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @67: iload_0
		// @68: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6B: bipush 44 (0x2C)
		// @6D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @70: iload_1
		// @71: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @74: bipush 44 (0x2C)
		// @76: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @79: iload_2
		// @7A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @7D: bipush 41 (0x29)
		// @7F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @82: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @85: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @88: athrow
	}
	
	public static void func_104473_a(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.math.BigInteger game.C_100084_ug.field_104488_h
		// @04: aconst_null
		// @05: putstatic game.C_100037_wb[] game.C_100084_ug.field_104487_k
		// @08: aconst_null
		// @09: putstatic game.C_100251_pm[] game.C_100084_ug.field_104485_j
		// @0C: aconst_null
		// @0D: putstatic java.lang.String game.C_100084_ug.field_104483_c
		// @10: aconst_null
		// @11: putstatic game.C_100302_ka[] game.C_100084_ug.field_104478_f
		// @14: aconst_null
		// @15: putstatic game.C_100302_ka game.C_100084_ug.field_104481_e
		// @18: iload_0
		// @19: bipush 13 (0x0D)
		// @1B: if_icmpge @1F
		// @1E: return
		// @1F: aconst_null
		// @20: putstatic game.C_100002_gf game.C_100084_ug.field_104489_i
		// @23: goto @48
		// @26: astore_1
		// @27: aload_1
		// @28: new java.lang.StringBuilder
		// @2B: dup
		// @2C: invokespecial java.lang.StringBuilder.<init>()void
		// @2F: getstatic java.lang.String[] game.C_100084_ug.field_104486_z
		// @32: bipush 10 (0x0A)
		// @34: aaload
		// @35: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @38: iload_0
		// @39: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3C: bipush 41 (0x29)
		// @3E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @41: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @44: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @47: athrow
		// @48: return
	}
	
	C_100084_ug(C_100052_eb arg0)
	{
		// @00: aload_0
		// @01: invokespecial java.lang.Object.<init>()void
		// @04: aload_0
		// @05: aconst_null
		// @06: putfield game.C_100325_id game.C_100084_ug.field_104480_d
		// @09: aload_0
		// @0A: aload_1
		// @0B: putfield game.C_100052_eb game.C_100084_ug.field_104479_g
		// @0E: aload_0
		// @0F: aload_0
		// @10: getfield game.C_100052_eb game.C_100084_ug.field_104479_g
		// @13: getfield game.C_100325_id game.C_100052_eb.field_104232_c
		// @16: getfield game.C_100325_id game.C_100325_id.field_101483_n
		// @19: putfield game.C_100325_id game.C_100084_ug.field_104482_b
		// @1C: aload_0
		// @1D: aconst_null
		// @1E: putfield game.C_100325_id game.C_100084_ug.field_104480_d
		// @21: goto @59
		// @24: astore_2
		// @25: aload_2
		// @26: new java.lang.StringBuilder
		// @29: dup
		// @2A: invokespecial java.lang.StringBuilder.<init>()void
		// @2D: getstatic java.lang.String[] game.C_100084_ug.field_104486_z
		// @30: bipush 8 (0x08)
		// @32: aaload
		// @33: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @36: aload_1
		// @37: ifnull @44
		// @3A: getstatic java.lang.String[] game.C_100084_ug.field_104486_z
		// @3D: bipush 7 (0x07)
		// @3F: aaload
		// @40: goto @4A
		// @43: athrow
		// @44: getstatic java.lang.String[] game.C_100084_ug.field_104486_z
		// @47: bipush 6 (0x06)
		// @49: aaload
		// @4A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4D: bipush 41 (0x29)
		// @4F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @52: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @55: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @58: athrow
		// @59: return
	}
	
	static final void func_104470_a(int arg0, int arg1, int arg2, C_100112_r arg3, int arg4, int arg5, int arg6, C_100127_tl arg7, int arg8, int arg9, int arg10, C_100127_tl arg11, int arg12, int arg13, C_100127_tl arg14, int arg15, C_100112_r arg16, int arg17, int arg18, int arg19)
	{
		// @000: aload_3
		// @001: putstatic game.C_100112_r game.C_100060_di.field_104269_d
		// @004: iload #9
		// @006: bipush -2 (0xFE)
		// @008: if_icmpeq @016
		// @00B: aconst_null
		// @00C: checkcast game.C_100302_ka
		// @00F: putstatic game.C_100302_ka game.C_100084_ug.field_104481_e
		// @012: goto @016
		// @015: athrow
		// @016: aload #16
		// @018: putstatic game.C_100112_r game.C_100045_vj.field_100609_m
		// @01B: iload #5
		// @01D: iconst_0
		// @01E: iload_0
		// @01F: iload #6
		// @021: iload #18
		// @023: invokestatic game.C_100217_ao.func_106031_a(int, int, int, int, int)void
		// @026: aload #14
		// @028: iload #15
		// @02A: bipush 120 (0x78)
		// @02C: iload #12
		// @02E: invokestatic game.C_100003_ga.func_103517_a(game.C_100127_tl, int, byte, int)void
		// @031: iload #10
		// @033: bipush -85 (0xAB)
		// @035: iload #17
		// @037: aload #11
		// @039: aload #7
		// @03B: iload_2
		// @03C: invokestatic game.C_100346_ja.func_103479_a(int, byte, int, game.C_100127_tl, game.C_100127_tl, int)void
		// @03F: iload #8
		// @041: iconst_m1
		// @042: iload #19
		// @044: invokestatic game.C_100138_bo.func_100399_a(int, int, int)void
		// @047: iload #13
		// @049: bipush -113 (0x8F)
		// @04B: iload #4
		// @04D: iload_1
		// @04E: invokestatic game.C_100071_va.func_101647_a(int, int, int, int)void
		// @051: goto @191
		// @054: astore #20
		// @056: aload #20
		// @058: new java.lang.StringBuilder
		// @05B: dup
		// @05C: invokespecial java.lang.StringBuilder.<init>()void
		// @05F: getstatic java.lang.String[] game.C_100084_ug.field_104486_z
		// @062: iconst_5
		// @063: aaload
		// @064: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @067: iload_0
		// @068: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @06B: bipush 44 (0x2C)
		// @06D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @070: iload_1
		// @071: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @074: bipush 44 (0x2C)
		// @076: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @079: iload_2
		// @07A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @07D: bipush 44 (0x2C)
		// @07F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @082: aload_3
		// @083: ifnull @090
		// @086: getstatic java.lang.String[] game.C_100084_ug.field_104486_z
		// @089: bipush 7 (0x07)
		// @08B: aaload
		// @08C: goto @096
		// @08F: athrow
		// @090: getstatic java.lang.String[] game.C_100084_ug.field_104486_z
		// @093: bipush 6 (0x06)
		// @095: aaload
		// @096: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @099: bipush 44 (0x2C)
		// @09B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @09E: iload #4
		// @0A0: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0A3: bipush 44 (0x2C)
		// @0A5: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0A8: iload #5
		// @0AA: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0AD: bipush 44 (0x2C)
		// @0AF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0B2: iload #6
		// @0B4: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0B7: bipush 44 (0x2C)
		// @0B9: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0BC: aload #7
		// @0BE: ifnull @0CB
		// @0C1: getstatic java.lang.String[] game.C_100084_ug.field_104486_z
		// @0C4: bipush 7 (0x07)
		// @0C6: aaload
		// @0C7: goto @0D1
		// @0CA: athrow
		// @0CB: getstatic java.lang.String[] game.C_100084_ug.field_104486_z
		// @0CE: bipush 6 (0x06)
		// @0D0: aaload
		// @0D1: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0D4: bipush 44 (0x2C)
		// @0D6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0D9: iload #8
		// @0DB: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0DE: bipush 44 (0x2C)
		// @0E0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0E3: iload #9
		// @0E5: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0E8: bipush 44 (0x2C)
		// @0EA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0ED: iload #10
		// @0EF: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0F2: bipush 44 (0x2C)
		// @0F4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @0F7: aload #11
		// @0F9: ifnull @106
		// @0FC: getstatic java.lang.String[] game.C_100084_ug.field_104486_z
		// @0FF: bipush 7 (0x07)
		// @101: aaload
		// @102: goto @10C
		// @105: athrow
		// @106: getstatic java.lang.String[] game.C_100084_ug.field_104486_z
		// @109: bipush 6 (0x06)
		// @10B: aaload
		// @10C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @10F: bipush 44 (0x2C)
		// @111: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @114: iload #12
		// @116: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @119: bipush 44 (0x2C)
		// @11B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @11E: iload #13
		// @120: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @123: bipush 44 (0x2C)
		// @125: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @128: aload #14
		// @12A: ifnull @137
		// @12D: getstatic java.lang.String[] game.C_100084_ug.field_104486_z
		// @130: bipush 7 (0x07)
		// @132: aaload
		// @133: goto @13D
		// @136: athrow
		// @137: getstatic java.lang.String[] game.C_100084_ug.field_104486_z
		// @13A: bipush 6 (0x06)
		// @13C: aaload
		// @13D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @140: bipush 44 (0x2C)
		// @142: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @145: iload #15
		// @147: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @14A: bipush 44 (0x2C)
		// @14C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @14F: aload #16
		// @151: ifnull @15E
		// @154: getstatic java.lang.String[] game.C_100084_ug.field_104486_z
		// @157: bipush 7 (0x07)
		// @159: aaload
		// @15A: goto @164
		// @15D: athrow
		// @15E: getstatic java.lang.String[] game.C_100084_ug.field_104486_z
		// @161: bipush 6 (0x06)
		// @163: aaload
		// @164: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @167: bipush 44 (0x2C)
		// @169: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @16C: iload #17
		// @16E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @171: bipush 44 (0x2C)
		// @173: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @176: iload #18
		// @178: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @17B: bipush 44 (0x2C)
		// @17D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @180: iload #19
		// @182: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @185: bipush 41 (0x29)
		// @187: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @18A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @18D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @190: athrow
		// @191: return
	}
	
	static
	{
		// @00: bipush 12 (0x0C)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "\u0005\u000e*X-\u0003'aH8X@"
		// @09: invokestatic game.C_100084_ug.func_104475_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100084_ug.func_104474_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "\u0005\u000e*qd"
		// @14: invokestatic game.C_100084_ug.func_104475_z(java.lang.String)char[]
		// @17: invokestatic game.C_100084_ug.func_104474_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "\u0005\u000e*^)\u0008\u001d,\u0019"
		// @1F: invokestatic game.C_100084_ug.func_104475_z(java.lang.String)char[]
		// @22: invokestatic game.C_100084_ug.func_104474_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "\u0005\u000e*ud"
		// @2A: invokestatic game.C_100084_ug.func_104475_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100084_ug.func_104474_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "\u0005\u000e*rd"
		// @35: invokestatic game.C_100084_ug.func_104475_z(java.lang.String)char[]
		// @38: invokestatic game.C_100084_ug.func_104474_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "\u0005\u000e*td"
		// @40: invokestatic game.C_100084_ug.func_104475_z(java.lang.String)char[]
		// @43: invokestatic game.C_100084_ug.func_104474_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "\u001e\u001ch\\"
		// @4C: invokestatic game.C_100084_ug.func_104475_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100084_ug.func_104474_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "\u000bG*\u001e1"
		// @58: invokestatic game.C_100084_ug.func_104475_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100084_ug.func_104474_z(char[])java.lang.String
		// @5E: aastore
		// @5F: dup
		// @60: bipush 8 (0x08)
		// @62: ldc "\u0005\u000e*\u000c%\u001e\u0000p\u000ed"
		// @64: invokestatic game.C_100084_ug.func_104475_z(java.lang.String)char[]
		// @67: invokestatic game.C_100084_ug.func_104474_z(char[])java.lang.String
		// @6A: aastore
		// @6B: dup
		// @6C: bipush 9 (0x09)
		// @6E: ldc "\u0005\u000e*sd"
		// @70: invokestatic game.C_100084_ug.func_104475_z(java.lang.String)char[]
		// @73: invokestatic game.C_100084_ug.func_104474_z(char[])java.lang.String
		// @76: aastore
		// @77: dup
		// @78: bipush 10 (0x0A)
		// @7A: ldc "\u0005\u000e*vd"
		// @7C: invokestatic game.C_100084_ug.func_104475_z(java.lang.String)char[]
		// @7F: invokestatic game.C_100084_ug.func_104474_z(char[])java.lang.String
		// @82: aastore
		// @83: dup
		// @84: bipush 11 (0x0B)
		// @86: ldc "\u0005\u000e*B)\u001d\u0006rUdY"
		// @88: invokestatic game.C_100084_ug.func_104475_z(java.lang.String)char[]
		// @8B: invokestatic game.C_100084_ug.func_104474_z(char[])java.lang.String
		// @8E: aastore
		// @8F: putstatic java.lang.String[] game.C_100084_ug.field_104486_z
		// @92: bipush 110 (0x6E)
		// @94: anewarray game.C_100037_wb
		// @97: putstatic game.C_100037_wb[] game.C_100084_ug.field_104487_k
		// @9A: bipush 32 (0x20)
		// @9C: anewarray game.C_100302_ka
		// @9F: putstatic game.C_100302_ka[] game.C_100084_ug.field_104478_f
		// @A2: iconst_0
		// @A3: putstatic int game.C_100084_ug.field_104484_a
		// @A6: new java.math.BigInteger
		// @A9: dup
		// @AA: ldc "I]=\u0008y@_2\u0001zEP3\u0006uA\\=\u0008\u007fFP1\u0008|H\\4\u0007}@Z7\u0001uH]2\u0006yD[2\u0008uBX=\u0002yDY<\u0006xA^4\u0003x@P=\u0002\u007fIQ7\u0000uGZ2\ttE^"
		// @AC: invokestatic game.C_100084_ug.func_104475_z(java.lang.String)char[]
		// @AF: invokestatic game.C_100084_ug.func_104474_z(char[])java.lang.String
		// @B2: invokespecial java.math.BigInteger.<init>(java.lang.String)void
		// @B5: putstatic java.math.BigInteger game.C_100084_ug.field_104488_h
		// @B8: ldc "\"\u001cjU\u001f\u0013\u0008tUl\u0013\u0005e^"
		// @BA: invokestatic game.C_100084_ug.func_104475_z(java.lang.String)char[]
		// @BD: invokestatic game.C_100084_ug.func_104474_z(char[])java.lang.String
		// @C0: putstatic java.lang.String game.C_100084_ug.field_104483_c
		// @C3: return
	}
	
	private static char[] func_104475_z(String arg0)
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
		// @0E: bipush 76 (0x4C)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_104474_z(char[] arg0)
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
		// @30: bipush 112 (0x70)
		// @32: goto @45
		// @35: bipush 105 (0x69)
		// @37: goto @45
		// @3A: iconst_4
		// @3B: goto @45
		// @3E: bipush 48 (0x30)
		// @40: goto @45
		// @43: bipush 76 (0x4C)
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
