package game;

final class C_100318_hj
{
	private C_100266_me field_107195_g;
	static C_100037_wb[] field_107204_h;
	static boolean field_107205_i;
	static C_100302_ka field_107196_d;
	static C_100286_nl field_107194_f;
	private int field_107200_a;
	private int field_107199_c;
	static C_100112_r field_107198_b;
	private C_100052_eb field_107203_k;
	static C_100209_qb field_107201_j;
	static C_100317_lb field_107197_e;
	private static final String[] field_107202_z;
	
	private final void func_107182_a(int arg0, long arg1)
	{
		// @00: bipush -61 (0xC3)
		// @02: bipush -46 (0xD2)
		// @04: iload_1
		// @05: isub
		// @06: bipush 48 (0x30)
		// @08: idiv
		// @09: idiv
		// @0A: istore #4
		// @0C: aload_0
		// @0D: getfield game.C_100266_me game.C_100318_hj.field_107195_g
		// @10: bipush 68 (0x44)
		// @12: lload_2
		// @13: invokevirtual game.C_100266_me.func_106644_a(byte, long)game.C_100158_da
		// @16: checkcast game.C_100316_lc
		// @19: astore #5
		// @1B: aload_0
		// @1C: aload #5
		// @1E: bipush -41 (0xD7)
		// @20: invokespecial game.C_100318_hj.func_107184_a(game.C_100316_lc, byte)void
		// @23: goto @52
		// @26: astore #4
		// @28: aload #4
		// @2A: new java.lang.StringBuilder
		// @2D: dup
		// @2E: invokespecial java.lang.StringBuilder.<init>()void
		// @31: getstatic java.lang.String[] game.C_100318_hj.field_107202_z
		// @34: iconst_3
		// @35: aaload
		// @36: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @39: iload_1
		// @3A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3D: bipush 44 (0x2C)
		// @3F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @42: lload_2
		// @43: invokevirtual java.lang.StringBuilder.append(long)java.lang.StringBuilder
		// @46: bipush 41 (0x29)
		// @48: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @51: athrow
		// @52: return
	}
	
	static final C_100037_wb[] func_107189_a(int arg0, int arg1, int arg2, byte arg3, int arg4)
	{
		// @00: iload_3
		// @01: bipush 14 (0x0E)
		// @03: if_icmpeq @17
		// @06: aconst_null
		// @07: checkcast java.lang.String
		// @0A: iconst_1
		// @0B: aconst_null
		// @0C: checkcast java.lang.String
		// @0F: iconst_0
		// @10: invokestatic game.C_100318_hj.func_107193_a(java.lang.String, boolean, java.lang.String, boolean)void
		// @13: goto @17
		// @16: athrow
		// @17: iload_1
		// @18: iconst_3
		// @19: iload #4
		// @1B: iconst_1
		// @1C: iconst_1
		// @1D: iconst_1
		// @1E: bipush -112 (0x90)
		// @20: iload_0
		// @21: iload_2
		// @22: invokestatic game.C_100239_oi.func_102283_a(int, int, int, int, int, int, byte, int, int)game.C_100037_wb[]
		// @25: areturn
		// @26: astore #5
		// @28: aload #5
		// @2A: new java.lang.StringBuilder
		// @2D: dup
		// @2E: invokespecial java.lang.StringBuilder.<init>()void
		// @31: getstatic java.lang.String[] game.C_100318_hj.field_107202_z
		// @34: bipush 7 (0x07)
		// @36: aaload
		// @37: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3A: iload_0
		// @3B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3E: bipush 44 (0x2C)
		// @40: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @43: iload_1
		// @44: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @47: bipush 44 (0x2C)
		// @49: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4C: iload_2
		// @4D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @50: bipush 44 (0x2C)
		// @52: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @55: iload_3
		// @56: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @59: bipush 44 (0x2C)
		// @5B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5E: iload #4
		// @60: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @63: bipush 41 (0x29)
		// @65: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @68: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @6B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @6E: athrow
	}
	
	private final void func_107184_a(C_100316_lc arg0, byte arg1)
	{
		// @00: iload_2
		// @01: bipush -41 (0xD7)
		// @03: if_icmpeq @07
		// @06: return
		// @07: aload_1
		// @08: ifnull @24
		// @0B: aload_1
		// @0C: bipush 45 (0x2D)
		// @0E: invokevirtual game.C_100316_lc.func_100583_c(int)void
		// @11: aload_1
		// @12: bipush 8 (0x08)
		// @14: invokevirtual game.C_100316_lc.func_101479_c(byte)void
		// @17: aload_0
		// @18: dup
		// @19: getfield int game.C_100318_hj.field_107200_a
		// @1C: aload_1
		// @1D: getfield int game.C_100316_lc.field_102414_s
		// @20: iadd
		// @21: putfield int game.C_100318_hj.field_107200_a
		// @24: goto @63
		// @27: astore_3
		// @28: aload_3
		// @29: new java.lang.StringBuilder
		// @2C: dup
		// @2D: invokespecial java.lang.StringBuilder.<init>()void
		// @30: getstatic java.lang.String[] game.C_100318_hj.field_107202_z
		// @33: bipush 12 (0x0C)
		// @35: aaload
		// @36: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @39: aload_1
		// @3A: ifnull @46
		// @3D: getstatic java.lang.String[] game.C_100318_hj.field_107202_z
		// @40: iconst_0
		// @41: aaload
		// @42: goto @4B
		// @45: athrow
		// @46: getstatic java.lang.String[] game.C_100318_hj.field_107202_z
		// @49: iconst_2
		// @4A: aaload
		// @4B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4E: bipush 44 (0x2C)
		// @50: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @53: iload_2
		// @54: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @57: bipush 41 (0x29)
		// @59: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @5F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @62: athrow
		// @63: return
	}
	
	final void func_107183_a(Object arg0, int arg1, long arg2)
	{
		// @00: iload_2
		// @01: ifeq @11
		// @04: aload_0
		// @05: bipush -72 (0xB8)
		// @07: ldc2_w -101
		// @0A: invokespecial game.C_100318_hj.func_107182_a(int, long)void
		// @0D: goto @11
		// @10: athrow
		// @11: aload_0
		// @12: iconst_1
		// @13: lload_3
		// @14: bipush 123 (0x7B)
		// @16: aload_1
		// @17: invokespecial game.C_100318_hj.func_107188_a(int, long, byte, java.lang.Object)void
		// @1A: goto @63
		// @1D: astore #5
		// @1F: aload #5
		// @21: new java.lang.StringBuilder
		// @24: dup
		// @25: invokespecial java.lang.StringBuilder.<init>()void
		// @28: getstatic java.lang.String[] game.C_100318_hj.field_107202_z
		// @2B: iconst_4
		// @2C: aaload
		// @2D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @30: aload_1
		// @31: ifnull @3D
		// @34: getstatic java.lang.String[] game.C_100318_hj.field_107202_z
		// @37: iconst_0
		// @38: aaload
		// @39: goto @42
		// @3C: athrow
		// @3D: getstatic java.lang.String[] game.C_100318_hj.field_107202_z
		// @40: iconst_2
		// @41: aaload
		// @42: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @45: bipush 44 (0x2C)
		// @47: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4A: iload_2
		// @4B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4E: bipush 44 (0x2C)
		// @50: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @53: lload_3
		// @54: invokevirtual java.lang.StringBuilder.append(long)java.lang.StringBuilder
		// @57: bipush 41 (0x29)
		// @59: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @5F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @62: athrow
		// @63: return
	}
	
	private final void func_107188_a(int arg0, long arg1, byte arg2, Object arg3)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #7
		// @05: iload_1
		// @06: iconst_m1
		// @07: ixor
		// @08: aload_0
		// @09: getfield int game.C_100318_hj.field_107199_c
		// @0C: iconst_m1
		// @0D: ixor
		// @0E: if_icmplt @15
		// @11: goto @1D
		// @14: athrow
		// @15: new java.lang.IllegalStateException
		// @18: dup
		// @19: invokespecial java.lang.IllegalStateException.<init>()void
		// @1C: athrow
		// @1D: aload_0
		// @1E: bipush -118 (0x8A)
		// @20: lload_2
		// @21: invokespecial game.C_100318_hj.func_107182_a(int, long)void
		// @24: aload_0
		// @25: dup
		// @26: getfield int game.C_100318_hj.field_107200_a
		// @29: iload_1
		// @2A: isub
		// @2B: putfield int game.C_100318_hj.field_107200_a
		// @2E: aload_0
		// @2F: getfield int game.C_100318_hj.field_107200_a
		// @32: ifge @50
		// @35: aload_0
		// @36: getfield game.C_100052_eb game.C_100318_hj.field_107203_k
		// @39: bipush -115 (0x8D)
		// @3B: invokevirtual game.C_100052_eb.func_104226_a(byte)game.C_100325_id
		// @3E: checkcast game.C_100316_lc
		// @41: astore #6
		// @43: aload_0
		// @44: aload #6
		// @46: bipush -41 (0xD7)
		// @48: invokespecial game.C_100318_hj.func_107184_a(game.C_100316_lc, byte)void
		// @4B: iload #7
		// @4D: ifeq @2E
		// @50: new game.C_100272_mn
		// @53: dup
		// @54: aload #5
		// @56: iload_1
		// @57: invokespecial game.C_100272_mn.<init>(java.lang.Object, int)void
		// @5A: astore #6
		// @5C: iload #4
		// @5E: bipush 123 (0x7B)
		// @60: if_icmpeq @64
		// @63: return
		// @64: aload_0
		// @65: getfield game.C_100266_me game.C_100318_hj.field_107195_g
		// @68: aload #6
		// @6A: lload_2
		// @6B: bipush 106 (0x6A)
		// @6D: invokevirtual game.C_100266_me.func_106639_a(game.C_100158_da, long, byte)void
		// @70: aload_0
		// @71: getfield game.C_100052_eb game.C_100318_hj.field_107203_k
		// @74: aload #6
		// @76: sipush -22953 (0xA657)
		// @79: invokevirtual game.C_100052_eb.func_104221_a(game.C_100325_id, int)void
		// @7C: aload #6
		// @7E: lconst_0
		// @7F: putfield long game.C_100316_lc.field_101484_o
		// @82: goto @D7
		// @85: astore #6
		// @87: aload #6
		// @89: new java.lang.StringBuilder
		// @8C: dup
		// @8D: invokespecial java.lang.StringBuilder.<init>()void
		// @90: getstatic java.lang.String[] game.C_100318_hj.field_107202_z
		// @93: bipush 9 (0x09)
		// @95: aaload
		// @96: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @99: iload_1
		// @9A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @9D: bipush 44 (0x2C)
		// @9F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A2: lload_2
		// @A3: invokevirtual java.lang.StringBuilder.append(long)java.lang.StringBuilder
		// @A6: bipush 44 (0x2C)
		// @A8: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @AB: iload #4
		// @AD: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @B0: bipush 44 (0x2C)
		// @B2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B5: aload #5
		// @B7: ifnull @C3
		// @BA: getstatic java.lang.String[] game.C_100318_hj.field_107202_z
		// @BD: iconst_0
		// @BE: aaload
		// @BF: goto @C8
		// @C2: athrow
		// @C3: getstatic java.lang.String[] game.C_100318_hj.field_107202_z
		// @C6: iconst_2
		// @C7: aaload
		// @C8: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @CB: bipush 41 (0x29)
		// @CD: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D0: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @D3: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @D6: athrow
		// @D7: return
	}
	
	final Object func_107190_a(long arg0, int arg1)
	{
		// @00: iload_3
		// @01: ifeq @09
		// @04: aconst_null
		// @05: checkcast java.lang.Object
		// @08: areturn
		// @09: aload_0
		// @0A: getfield game.C_100266_me game.C_100318_hj.field_107195_g
		// @0D: bipush 60 (0x3C)
		// @0F: lload_1
		// @10: invokevirtual game.C_100266_me.func_106644_a(byte, long)game.C_100158_da
		// @13: checkcast game.C_100316_lc
		// @16: astore #4
		// @18: aload #4
		// @1A: ifnonnull @1F
		// @1D: aconst_null
		// @1E: areturn
		// @1F: aload #4
		// @21: sipush 255 (0x00FF)
		// @24: invokevirtual game.C_100316_lc.func_102398_j(int)java.lang.Object
		// @27: astore #5
		// @29: aconst_null
		// @2A: aload #5
		// @2C: if_acmpne @4F
		// @2F: aload #4
		// @31: iload_3
		// @32: bipush 45 (0x2D)
		// @34: iadd
		// @35: invokevirtual game.C_100316_lc.func_100583_c(int)void
		// @38: aload #4
		// @3A: bipush 8 (0x08)
		// @3C: invokevirtual game.C_100316_lc.func_101479_c(byte)void
		// @3F: aload_0
		// @40: dup
		// @41: getfield int game.C_100318_hj.field_107200_a
		// @44: aload #4
		// @46: getfield int game.C_100316_lc.field_102414_s
		// @49: iadd
		// @4A: putfield int game.C_100318_hj.field_107200_a
		// @4D: aconst_null
		// @4E: areturn
		// @4F: aload #4
		// @51: iload_3
		// @52: sipush -20116 (0xB16C)
		// @55: iadd
		// @56: invokevirtual game.C_100316_lc.func_102402_i(int)boolean
		// @59: ifeq @A2
		// @5C: new game.C_100272_mn
		// @5F: dup
		// @60: aload #5
		// @62: aload #4
		// @64: getfield int game.C_100316_lc.field_102414_s
		// @67: invokespecial game.C_100272_mn.<init>(java.lang.Object, int)void
		// @6A: astore #6
		// @6C: aload_0
		// @6D: getfield game.C_100266_me game.C_100318_hj.field_107195_g
		// @70: aload #6
		// @72: aload #4
		// @74: getfield long game.C_100316_lc.field_100595_c
		// @77: bipush 107 (0x6B)
		// @79: invokevirtual game.C_100266_me.func_106639_a(game.C_100158_da, long, byte)void
		// @7C: aload_0
		// @7D: getfield game.C_100052_eb game.C_100318_hj.field_107203_k
		// @80: aload #6
		// @82: sipush -22953 (0xA657)
		// @85: invokevirtual game.C_100052_eb.func_104221_a(game.C_100325_id, int)void
		// @88: aload #6
		// @8A: lconst_0
		// @8B: putfield long game.C_100316_lc.field_101484_o
		// @8E: aload #4
		// @90: bipush 45 (0x2D)
		// @92: invokevirtual game.C_100316_lc.func_100583_c(int)void
		// @95: aload #4
		// @97: bipush 8 (0x08)
		// @99: invokevirtual game.C_100316_lc.func_101479_c(byte)void
		// @9C: getstatic int game.SteelSentinels.field_105275_O
		// @9F: ifeq @BA
		// @A2: aload_0
		// @A3: getfield game.C_100052_eb game.C_100318_hj.field_107203_k
		// @A6: aload #4
		// @A8: iload_3
		// @A9: sipush -22953 (0xA657)
		// @AC: ixor
		// @AD: invokevirtual game.C_100052_eb.func_104221_a(game.C_100325_id, int)void
		// @B0: aload #4
		// @B2: lconst_0
		// @B3: putfield long game.C_100316_lc.field_101484_o
		// @B6: goto @BA
		// @B9: athrow
		// @BA: aload #5
		// @BC: areturn
		// @BD: astore #4
		// @BF: aload #4
		// @C1: new java.lang.StringBuilder
		// @C4: dup
		// @C5: invokespecial java.lang.StringBuilder.<init>()void
		// @C8: getstatic java.lang.String[] game.C_100318_hj.field_107202_z
		// @CB: bipush 11 (0x0B)
		// @CD: aaload
		// @CE: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @D1: lload_1
		// @D2: invokevirtual java.lang.StringBuilder.append(long)java.lang.StringBuilder
		// @D5: bipush 44 (0x2C)
		// @D7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @DA: iload_3
		// @DB: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @DE: bipush 41 (0x29)
		// @E0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @E3: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @E6: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @E9: athrow
	}
	
	public static void func_107186_a(byte arg0)
	{
		// @00: aconst_null
		// @01: putstatic game.C_100317_lb game.C_100318_hj.field_107197_e
		// @04: aconst_null
		// @05: putstatic game.C_100302_ka game.C_100318_hj.field_107196_d
		// @08: aconst_null
		// @09: putstatic game.C_100112_r game.C_100318_hj.field_107198_b
		// @0C: iload_0
		// @0D: bipush 38 (0x26)
		// @0F: if_icmpeq @24
		// @12: bipush 113 (0x71)
		// @14: bipush -27 (0xE5)
		// @16: bipush -108 (0x94)
		// @18: bipush 84 (0x54)
		// @1A: bipush -128 (0x80)
		// @1C: invokestatic game.C_100318_hj.func_107189_a(int, int, int, byte, int)game.C_100037_wb[]
		// @1F: pop
		// @20: goto @24
		// @23: athrow
		// @24: aconst_null
		// @25: putstatic game.C_100037_wb[] game.C_100318_hj.field_107204_h
		// @28: aconst_null
		// @29: putstatic game.C_100209_qb game.C_100318_hj.field_107201_j
		// @2C: aconst_null
		// @2D: putstatic game.C_100286_nl game.C_100318_hj.field_107194_f
		// @30: goto @55
		// @33: astore_1
		// @34: aload_1
		// @35: new java.lang.StringBuilder
		// @38: dup
		// @39: invokespecial java.lang.StringBuilder.<init>()void
		// @3C: getstatic java.lang.String[] game.C_100318_hj.field_107202_z
		// @3F: bipush 6 (0x06)
		// @41: aaload
		// @42: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @45: iload_0
		// @46: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @49: bipush 41 (0x29)
		// @4B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @51: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @54: athrow
		// @55: return
	}
	
	C_100318_hj(int arg0)
	{
		// @0: aload_0
		// @1: iload_1
		// @2: iload_1
		// @3: invokespecial game.C_100318_hj.<init>(int, int)void
		// @6: return
	}
	
	static final void func_107192_a(String arg0, int arg1, C_100112_r arg2, int arg3, int arg4, int arg5, int arg6, byte arg7)
	{
		// @00: aload_2
		// @01: aload_0
		// @02: invokevirtual game.C_100112_r.func_101739_b(java.lang.String)int
		// @05: istore #8
		// @07: iload #4
		// @09: iload #8
		// @0B: iconst_2
		// @0C: idiv
		// @0D: bipush -3 (0xFD)
		// @0F: isub
		// @10: isub
		// @11: istore #4
		// @13: iinc #8 +5
		// @16: bipush 44 (0x2C)
		// @18: bipush 68 (0x44)
		// @1A: iload #7
		// @1C: isub
		// @1D: bipush 50 (0x32)
		// @1F: idiv
		// @20: irem
		// @21: istore #9
		// @23: iload #4
		// @25: iload #6
		// @27: aload_2
		// @28: getfield int game.C_100112_r.field_101769_u
		// @2B: iconst_2
		// @2C: iadd
		// @2D: isub
		// @2E: iload #8
		// @30: iconst_4
		// @31: aload_2
		// @32: getfield int game.C_100112_r.field_101769_u
		// @35: iadd
		// @36: iload_3
		// @37: invokestatic game.C_100196_rb.func_105782_i(int, int, int, int, int)void
		// @3A: iload #4
		// @3C: bipush -2 (0xFE)
		// @3E: iload #6
		// @40: iadd
		// @41: aload_2
		// @42: getfield int game.C_100112_r.field_101769_u
		// @45: ineg
		// @46: iadd
		// @47: iload #8
		// @49: aload_2
		// @4A: getfield int game.C_100112_r.field_101769_u
		// @4D: bipush -4 (0xFC)
		// @4F: isub
		// @50: iload_1
		// @51: invokestatic game.C_100196_rb.func_105784_h(int, int, int, int, int)void
		// @54: aload_2
		// @55: aload_0
		// @56: iload #4
		// @58: bipush -3 (0xFD)
		// @5A: isub
		// @5B: iload #6
		// @5D: iload #5
		// @5F: iconst_m1
		// @60: invokevirtual game.C_100112_r.func_101749_c(java.lang.String, int, int, int, int)void
		// @63: goto @EE
		// @66: astore #8
		// @68: aload #8
		// @6A: new java.lang.StringBuilder
		// @6D: dup
		// @6E: invokespecial java.lang.StringBuilder.<init>()void
		// @71: getstatic java.lang.String[] game.C_100318_hj.field_107202_z
		// @74: iconst_1
		// @75: aaload
		// @76: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @79: aload_0
		// @7A: ifnull @86
		// @7D: getstatic java.lang.String[] game.C_100318_hj.field_107202_z
		// @80: iconst_0
		// @81: aaload
		// @82: goto @8B
		// @85: athrow
		// @86: getstatic java.lang.String[] game.C_100318_hj.field_107202_z
		// @89: iconst_2
		// @8A: aaload
		// @8B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @8E: bipush 44 (0x2C)
		// @90: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @93: iload_1
		// @94: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @97: bipush 44 (0x2C)
		// @99: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9C: aload_2
		// @9D: ifnull @A9
		// @A0: getstatic java.lang.String[] game.C_100318_hj.field_107202_z
		// @A3: iconst_0
		// @A4: aaload
		// @A5: goto @AE
		// @A8: athrow
		// @A9: getstatic java.lang.String[] game.C_100318_hj.field_107202_z
		// @AC: iconst_2
		// @AD: aaload
		// @AE: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @B1: bipush 44 (0x2C)
		// @B3: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B6: iload_3
		// @B7: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @BA: bipush 44 (0x2C)
		// @BC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @BF: iload #4
		// @C1: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @C4: bipush 44 (0x2C)
		// @C6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C9: iload #5
		// @CB: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @CE: bipush 44 (0x2C)
		// @D0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D3: iload #6
		// @D5: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @D8: bipush 44 (0x2C)
		// @DA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @DD: iload #7
		// @DF: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @E2: bipush 41 (0x29)
		// @E4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @E7: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @EA: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @ED: athrow
		// @EE: return
	}
	
	static final void func_107191_a(boolean arg0, int arg1)
	{
		// @00: aconst_null
		// @01: getstatic java.lang.String game.C_100321_hi.field_107220_c
		// @04: if_acmpeq @14
		// @07: sipush 500 (0x01F4)
		// @0A: getstatic java.lang.String game.C_100321_hi.field_107220_c
		// @0D: invokestatic game.C_100213_ak.func_105990_a(int, java.lang.String)void
		// @10: goto @14
		// @13: athrow
		// @14: aconst_null
		// @15: getstatic game.C_100022_hf game.C_100136_th.field_102623_R
		// @18: if_acmpeq @29
		// @1B: getstatic game.C_100022_hf game.C_100136_th.field_102623_R
		// @1E: sipush 9324 (0x246C)
		// @21: iload_0
		// @22: invokevirtual game.C_100022_hf.func_103885_a(int, boolean)void
		// @25: goto @29
		// @28: athrow
		// @29: bipush 54 (0x36)
		// @2B: iload_0
		// @2C: invokestatic game.C_100244_pe.func_106373_a(int, boolean)void
		// @2F: iload_1
		// @30: sipush -11371 (0xD395)
		// @33: if_icmpeq @37
		// @36: return
		// @37: getstatic game.C_100260_mc game.C_100228_nn.field_106189_c
		// @3A: ifnull @4A
		// @3D: getstatic game.C_100260_mc game.C_100228_nn.field_106189_c
		// @40: bipush -126 (0x82)
		// @42: iload_0
		// @43: invokevirtual game.C_100260_mc.func_101809_a(byte, boolean)void
		// @46: goto @4A
		// @49: athrow
		// @4A: bipush -112 (0x90)
		// @4C: iload_0
		// @4D: invokestatic game.C_100038_wa.func_104055_a(byte, boolean)void
		// @50: goto @7D
		// @53: astore_2
		// @54: aload_2
		// @55: new java.lang.StringBuilder
		// @58: dup
		// @59: invokespecial java.lang.StringBuilder.<init>()void
		// @5C: getstatic java.lang.String[] game.C_100318_hj.field_107202_z
		// @5F: iconst_5
		// @60: aaload
		// @61: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @64: iload_0
		// @65: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @68: bipush 44 (0x2C)
		// @6A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6D: iload_1
		// @6E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @71: bipush 41 (0x29)
		// @73: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @76: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @79: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @7C: athrow
		// @7D: return
	}
	
	private C_100318_hj(int arg0, int arg1)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore #4
		// @05: aload_0
		// @06: invokespecial java.lang.Object.<init>()void
		// @09: aload_0
		// @0A: new game.C_100052_eb
		// @0D: dup
		// @0E: invokespecial game.C_100052_eb.<init>()void
		// @11: putfield game.C_100052_eb game.C_100318_hj.field_107203_k
		// @14: aload_0
		// @15: iload_1
		// @16: putfield int game.C_100318_hj.field_107200_a
		// @19: aload_0
		// @1A: iload_1
		// @1B: putfield int game.C_100318_hj.field_107199_c
		// @1E: iconst_1
		// @1F: istore_3
		// @20: iload_1
		// @21: iconst_m1
		// @22: ixor
		// @23: iload_3
		// @24: iload_3
		// @25: iadd
		// @26: iconst_m1
		// @27: ixor
		// @28: if_icmpge @39
		// @2B: iload_2
		// @2C: iload_3
		// @2D: if_icmple @39
		// @30: iload_3
		// @31: iload_3
		// @32: iadd
		// @33: istore_3
		// @34: iload #4
		// @36: ifeq @20
		// @39: aload_0
		// @3A: new game.C_100266_me
		// @3D: dup
		// @3E: iload_3
		// @3F: invokespecial game.C_100266_me.<init>(int)void
		// @42: putfield game.C_100266_me game.C_100318_hj.field_107195_g
		// @45: goto @73
		// @48: astore_3
		// @49: aload_3
		// @4A: new java.lang.StringBuilder
		// @4D: dup
		// @4E: invokespecial java.lang.StringBuilder.<init>()void
		// @51: getstatic java.lang.String[] game.C_100318_hj.field_107202_z
		// @54: bipush 10 (0x0A)
		// @56: aaload
		// @57: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @5A: iload_1
		// @5B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5E: bipush 44 (0x2C)
		// @60: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @63: iload_2
		// @64: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @67: bipush 41 (0x29)
		// @69: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @6F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @72: athrow
		// @73: return
	}
	
	static final void func_107193_a(String arg0, boolean arg1, String arg2, boolean arg3)
	{
		// @00: aload_0
		// @01: putstatic java.lang.String game.C_100342_jg.field_102721_Rb
		// @04: aload_2
		// @05: putstatic java.lang.String game.C_100322_hn.field_107239_c
		// @08: iload_3
		// @09: ifeq @1D
		// @0C: iconst_m1
		// @0D: bipush -85 (0xAB)
		// @0F: bipush -4 (0xFC)
		// @11: bipush -115 (0x8D)
		// @13: bipush -54 (0xCA)
		// @15: invokestatic game.C_100318_hj.func_107189_a(int, int, int, byte, int)game.C_100037_wb[]
		// @18: pop
		// @19: goto @1D
		// @1C: athrow
		// @1D: bipush 45 (0x2D)
		// @1F: getstatic java.lang.String game.C_100341_jd.field_102644_rb
		// @22: iload_1
		// @23: invokestatic game.C_100158_da.func_100589_a(int, java.lang.String, boolean)void
		// @26: goto @8A
		// @29: astore #4
		// @2B: aload #4
		// @2D: new java.lang.StringBuilder
		// @30: dup
		// @31: invokespecial java.lang.StringBuilder.<init>()void
		// @34: getstatic java.lang.String[] game.C_100318_hj.field_107202_z
		// @37: bipush 8 (0x08)
		// @39: aaload
		// @3A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3D: aload_0
		// @3E: ifnull @4A
		// @41: getstatic java.lang.String[] game.C_100318_hj.field_107202_z
		// @44: iconst_0
		// @45: aaload
		// @46: goto @4F
		// @49: athrow
		// @4A: getstatic java.lang.String[] game.C_100318_hj.field_107202_z
		// @4D: iconst_2
		// @4E: aaload
		// @4F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @52: bipush 44 (0x2C)
		// @54: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @57: iload_1
		// @58: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @5B: bipush 44 (0x2C)
		// @5D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @60: aload_2
		// @61: ifnull @6D
		// @64: getstatic java.lang.String[] game.C_100318_hj.field_107202_z
		// @67: iconst_0
		// @68: aaload
		// @69: goto @72
		// @6C: athrow
		// @6D: getstatic java.lang.String[] game.C_100318_hj.field_107202_z
		// @70: iconst_2
		// @71: aaload
		// @72: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @75: bipush 44 (0x2C)
		// @77: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7A: iload_3
		// @7B: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @7E: bipush 41 (0x29)
		// @80: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @83: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @86: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @89: athrow
		// @8A: return
	}
	
	static
	{
		// @00: bipush 13 (0x0D)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "|+XU("
		// @09: invokestatic game.C_100318_hj.func_107187_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100318_hj.func_107185_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "ooX?}"
		// @14: invokestatic game.C_100318_hj.func_107187_z(java.lang.String)char[]
		// @17: invokestatic game.C_100318_hj.func_107185_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "ip\u001a\u0017"
		// @1F: invokestatic game.C_100318_hj.func_107187_z(java.lang.String)char[]
		// @22: invokestatic game.C_100318_hj.func_107185_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "ooX1}"
		// @2A: invokestatic game.C_100318_hj.func_107187_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100318_hj.func_107185_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "ooX=}"
		// @35: invokestatic game.C_100318_hj.func_107187_z(java.lang.String)char[]
		// @38: invokestatic game.C_100318_hj.func_107185_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "ooX9}"
		// @40: invokestatic game.C_100318_hj.func_107187_z(java.lang.String)char[]
		// @43: invokestatic game.C_100318_hj.func_107185_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "ooX8}"
		// @4C: invokestatic game.C_100318_hj.func_107187_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100318_hj.func_107185_z(char[])java.lang.String
		// @52: aastore
		// @53: dup
		// @54: bipush 7 (0x07)
		// @56: ldc "ooX<}"
		// @58: invokestatic game.C_100318_hj.func_107187_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100318_hj.func_107185_z(char[])java.lang.String
		// @5E: aastore
		// @5F: dup
		// @60: bipush 8 (0x08)
		// @62: ldc "ooX2}"
		// @64: invokestatic game.C_100318_hj.func_107187_z(java.lang.String)char[]
		// @67: invokestatic game.C_100318_hj.func_107185_z(char[])java.lang.String
		// @6A: aastore
		// @6B: dup
		// @6C: bipush 9 (0x09)
		// @6E: ldc "ooX3}"
		// @70: invokestatic game.C_100318_hj.func_107187_z(java.lang.String)char[]
		// @73: invokestatic game.C_100318_hj.func_107185_z(char[])java.lang.String
		// @76: aastore
		// @77: dup
		// @78: bipush 10 (0x0A)
		// @7A: ldc "ooXG<il\u0002E}"
		// @7C: invokestatic game.C_100318_hj.func_107187_z(java.lang.String)char[]
		// @7F: invokestatic game.C_100318_hj.func_107185_z(char[])java.lang.String
		// @82: aastore
		// @83: dup
		// @84: bipush 11 (0x0B)
		// @86: ldc "ooX>}"
		// @88: invokestatic game.C_100318_hj.func_107187_z(java.lang.String)char[]
		// @8B: invokestatic game.C_100318_hj.func_107185_z(char[])java.lang.String
		// @8E: aastore
		// @8F: dup
		// @90: bipush 12 (0x0C)
		// @92: ldc "ooX:}"
		// @94: invokestatic game.C_100318_hj.func_107187_z(java.lang.String)char[]
		// @97: invokestatic game.C_100318_hj.func_107185_z(char[])java.lang.String
		// @9A: aastore
		// @9B: putstatic java.lang.String[] game.C_100318_hj.field_107202_z
		// @9E: return
	}
	
	private static char[] func_107187_z(String arg0)
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
		// @0E: bipush 85 (0x55)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_107185_z(char[] arg0)
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
		// @10: tableswitch def: @43, for 0: @30, for 1: @35, for 2: @39, for 3: @3E
		// @30: bipush 7 (0x07)
		// @32: goto @45
		// @35: iconst_5
		// @36: goto @45
		// @39: bipush 118 (0x76)
		// @3B: goto @45
		// @3E: bipush 123 (0x7B)
		// @40: goto @45
		// @43: bipush 85 (0x55)
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
