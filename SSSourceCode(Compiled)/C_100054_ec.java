package game;

final class C_100054_ec extends C_100302_ka
{
	int field_101969_ac;
	C_100302_ka field_101959_fc;
	String field_101964_Ub;
	C_100302_ka field_101970_lc;
	String field_101957_hc;
	C_100302_ka field_101968_kc;
	C_100302_ka field_101967_nc;
	boolean field_101961_jc;
	int field_101953_gc;
	long field_101952_dc;
	int field_101962_ic;
	int field_101954_Zb;
	boolean field_101971_bc;
	static int field_101955_Xb;
	static String field_101956_Yb;
	long field_101960_Wb;
	int field_101966_Vb;
	int field_101972_cc;
	boolean field_101958_ec;
	C_100302_ka field_101965_mc;
	private static final String[] field_101963_oc;
	
	final boolean func_101949_a(int arg0, C_100054_ec arg1)
	{
		// @00: aload_0
		// @01: getfield boolean game.C_100054_ec.field_101961_jc
		// @04: ifne @0C
		// @07: iconst_1
		// @08: goto @0D
		// @0B: athrow
		// @0C: iconst_0
		// @0D: aload_2
		// @0E: getfield boolean game.C_100054_ec.field_101961_jc
		// @11: if_icmpne @19
		// @14: aload_0
		// @15: getfield boolean game.C_100054_ec.field_101961_jc
		// @18: ireturn
		// @19: aload_2
		// @1A: getfield boolean game.C_100054_ec.field_101971_bc
		// @1D: ifne @25
		// @20: iconst_1
		// @21: goto @26
		// @24: athrow
		// @25: iconst_0
		// @26: aload_0
		// @27: getfield boolean game.C_100054_ec.field_101971_bc
		// @2A: ifne @32
		// @2D: iconst_1
		// @2E: goto @33
		// @31: athrow
		// @32: iconst_0
		// @33: if_icmpeq @3B
		// @36: aload_0
		// @37: getfield boolean game.C_100054_ec.field_101971_bc
		// @3A: ireturn
		// @3B: iload_1
		// @3C: ifeq @48
		// @3F: bipush -19 (0xED)
		// @41: putstatic int game.C_100054_ec.field_101955_Xb
		// @44: goto @48
		// @47: athrow
		// @48: aload_2
		// @49: getfield long game.C_100054_ec.field_101960_Wb
		// @4C: ldc2_w -1
		// @4F: lxor
		// @50: aload_0
		// @51: getfield long game.C_100054_ec.field_101960_Wb
		// @54: ldc2_w -1
		// @57: lxor
		// @58: lcmp
		// @59: ifge @61
		// @5C: iconst_1
		// @5D: goto @62
		// @60: athrow
		// @61: iconst_0
		// @62: ireturn
		// @63: astore_3
		// @64: aload_3
		// @65: new java.lang.StringBuilder
		// @68: dup
		// @69: invokespecial java.lang.StringBuilder.<init>()void
		// @6C: getstatic java.lang.String[] game.C_100054_ec.field_101963_oc
		// @6F: bipush 6 (0x06)
		// @71: aaload
		// @72: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @75: iload_1
		// @76: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @79: bipush 44 (0x2C)
		// @7B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7E: aload_2
		// @7F: ifnull @8B
		// @82: getstatic java.lang.String[] game.C_100054_ec.field_101963_oc
		// @85: iconst_4
		// @86: aaload
		// @87: goto @90
		// @8A: athrow
		// @8B: getstatic java.lang.String[] game.C_100054_ec.field_101963_oc
		// @8E: iconst_2
		// @8F: aaload
		// @90: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @93: bipush 41 (0x29)
		// @95: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @98: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @9B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @9E: athrow
	}
	
	final void func_101950_a(String arg0, int arg1, String arg2)
	{
		// @00: aload_0
		// @01: aload_1
		// @02: putfield java.lang.String game.C_100054_ec.field_101964_Ub
		// @05: aload_0
		// @06: aload_3
		// @07: putfield java.lang.String game.C_100054_ec.field_101957_hc
		// @0A: iload_2
		// @0B: sipush -8082 (0xE06E)
		// @0E: if_icmpeq @1D
		// @11: aload_0
		// @12: aconst_null
		// @13: checkcast game.C_100302_ka
		// @16: putfield game.C_100302_ka game.C_100054_ec.field_101967_nc
		// @19: goto @1D
		// @1C: athrow
		// @1D: bipush 36 (0x24)
		// @1F: aload_0
		// @20: getfield java.lang.String game.C_100054_ec.field_101964_Ub
		// @23: invokestatic game.C_100106_ef.func_104742_a(byte, java.lang.CharSequence)java.lang.String
		// @26: pop
		// @27: goto @81
		// @2A: astore #4
		// @2C: aload #4
		// @2E: new java.lang.StringBuilder
		// @31: dup
		// @32: invokespecial java.lang.StringBuilder.<init>()void
		// @35: getstatic java.lang.String[] game.C_100054_ec.field_101963_oc
		// @38: iconst_3
		// @39: aaload
		// @3A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3D: aload_1
		// @3E: ifnull @4A
		// @41: getstatic java.lang.String[] game.C_100054_ec.field_101963_oc
		// @44: iconst_4
		// @45: aaload
		// @46: goto @4F
		// @49: athrow
		// @4A: getstatic java.lang.String[] game.C_100054_ec.field_101963_oc
		// @4D: iconst_2
		// @4E: aaload
		// @4F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @52: bipush 44 (0x2C)
		// @54: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @57: iload_2
		// @58: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5B: bipush 44 (0x2C)
		// @5D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @60: aload_3
		// @61: ifnull @6D
		// @64: getstatic java.lang.String[] game.C_100054_ec.field_101963_oc
		// @67: iconst_4
		// @68: aaload
		// @69: goto @72
		// @6C: athrow
		// @6D: getstatic java.lang.String[] game.C_100054_ec.field_101963_oc
		// @70: iconst_2
		// @71: aaload
		// @72: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @75: bipush 41 (0x29)
		// @77: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @7D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @80: athrow
		// @81: return
	}
	
	final boolean func_101951_m(int arg0)
	{
		// @00: bipush 70 (0x46)
		// @02: iload_1
		// @03: bipush -63 (0xC1)
		// @05: isub
		// @06: bipush 39 (0x27)
		// @08: idiv
		// @09: idiv
		// @0A: istore_2
		// @0B: aload_0
		// @0C: bipush -57 (0xC7)
		// @0E: invokevirtual game.C_100054_ec.func_101469_a(byte)boolean
		// @11: ifne @19
		// @14: iconst_1
		// @15: goto @1A
		// @18: athrow
		// @19: iconst_0
		// @1A: ireturn
		// @1B: astore_2
		// @1C: aload_2
		// @1D: new java.lang.StringBuilder
		// @20: dup
		// @21: invokespecial java.lang.StringBuilder.<init>()void
		// @24: getstatic java.lang.String[] game.C_100054_ec.field_101963_oc
		// @27: iconst_0
		// @28: aaload
		// @29: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2C: iload_1
		// @2D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @30: bipush 41 (0x29)
		// @32: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @35: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @38: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3B: athrow
	}
	
	C_100054_ec(String arg0, String arg1, long arg2)
	{
		// @00: aload_0
		// @01: lconst_0
		// @02: aconst_null
		// @03: invokespecial game.C_100302_ka.<init>(long, game.C_100302_ka)void
		// @06: aload_0
		// @07: aload_2
		// @08: putfield java.lang.String game.C_100054_ec.field_101957_hc
		// @0B: aload_0
		// @0C: aload_1
		// @0D: putfield java.lang.String game.C_100054_ec.field_101964_Ub
		// @10: aload_0
		// @11: lload_3
		// @12: putfield long game.C_100054_ec.field_101952_dc
		// @15: bipush 38 (0x26)
		// @17: aload_0
		// @18: getfield java.lang.String game.C_100054_ec.field_101964_Ub
		// @1B: invokestatic game.C_100106_ef.func_104742_a(byte, java.lang.CharSequence)java.lang.String
		// @1E: pop
		// @1F: goto @79
		// @22: astore #5
		// @24: aload #5
		// @26: new java.lang.StringBuilder
		// @29: dup
		// @2A: invokespecial java.lang.StringBuilder.<init>()void
		// @2D: getstatic java.lang.String[] game.C_100054_ec.field_101963_oc
		// @30: iconst_5
		// @31: aaload
		// @32: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @35: aload_1
		// @36: ifnull @42
		// @39: getstatic java.lang.String[] game.C_100054_ec.field_101963_oc
		// @3C: iconst_4
		// @3D: aaload
		// @3E: goto @47
		// @41: athrow
		// @42: getstatic java.lang.String[] game.C_100054_ec.field_101963_oc
		// @45: iconst_2
		// @46: aaload
		// @47: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @4A: bipush 44 (0x2C)
		// @4C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4F: aload_2
		// @50: ifnull @5C
		// @53: getstatic java.lang.String[] game.C_100054_ec.field_101963_oc
		// @56: iconst_4
		// @57: aaload
		// @58: goto @61
		// @5B: athrow
		// @5C: getstatic java.lang.String[] game.C_100054_ec.field_101963_oc
		// @5F: iconst_2
		// @60: aaload
		// @61: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @64: bipush 44 (0x2C)
		// @66: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @69: lload_3
		// @6A: invokevirtual java.lang.StringBuilder.append(long)java.lang.StringBuilder
		// @6D: bipush 41 (0x29)
		// @6F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @72: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @75: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @78: athrow
		// @79: return
	}
	
	public static void func_101946_l(int arg0)
	{
		// @00: iload_0
		// @01: ifeq @05
		// @04: return
		// @05: aconst_null
		// @06: putstatic java.lang.String game.C_100054_ec.field_101956_Yb
		// @09: goto @2D
		// @0C: astore_1
		// @0D: aload_1
		// @0E: new java.lang.StringBuilder
		// @11: dup
		// @12: invokespecial java.lang.StringBuilder.<init>()void
		// @15: getstatic java.lang.String[] game.C_100054_ec.field_101963_oc
		// @18: iconst_1
		// @19: aaload
		// @1A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1D: iload_0
		// @1E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @21: bipush 41 (0x29)
		// @23: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @26: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @29: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @2C: athrow
		// @2D: return
	}
	
	static
	{
		// @00: bipush 7 (0x07)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "*nG_<"
		// @09: invokestatic game.C_100054_ec.func_101948_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100054_ec.func_101947_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "*nG^<"
		// @14: invokestatic game.C_100054_ec.func_101948_z(java.lang.String)char[]
		// @17: invokestatic game.C_100054_ec.func_101947_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "!x\u0005q"
		// @1F: invokestatic game.C_100054_ec.func_101948_z(java.lang.String)char[]
		// @22: invokestatic game.C_100054_ec.func_101947_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "*nGY<"
		// @2A: invokestatic game.C_100054_ec.func_101948_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100054_ec.func_101947_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "4#G3i"
		// @35: invokestatic game.C_100054_ec.func_101948_z(java.lang.String)char[]
		// @38: invokestatic game.C_100054_ec.func_101947_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "*nG!}!d\u001d#<"
		// @40: invokestatic game.C_100054_ec.func_101948_z(java.lang.String)char[]
		// @43: invokestatic game.C_100054_ec.func_101947_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "*nG\\<"
		// @4C: invokestatic game.C_100054_ec.func_101948_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100054_ec.func_101947_z(char[])java.lang.String
		// @52: aastore
		// @53: putstatic java.lang.String[] game.C_100054_ec.field_101963_oc
		// @56: ldc "\u000e~Id{:-\u0008oqox\u0007yq=-X.8oz\u000c=c cNi4<l\u001fx46b\u001co4*`\u0008txol\ryf*~\u001a={!-\u0006hfo~\u0010n`*`\u001a34\u0016b\u001co4*`\u0008txol\ryf*~\u001a=c&a\u0005=g;d\u0005q4-hIhg*iIi{oa\u0006z4&cE=v:yId{:-\u001erzhyIoq,d\u000ckqol\u0007d4*`\u0008tx<-\u000fo{\"-#|s*uG=R \u007fIp{=hItz)b\u001bpu;d\u0006s8o}\u0005xu<hI~|*n\u0002=`'hIoq#h\u001f|z;-\u0019|f;~Irrob\u001co4s(Y#('b\u001dnd yT-*\u001bh\u001bpgol\u0007y4\u000cb\u0007y};d\u0006sgs\"\u0001r`<}\u0006i*s(X#4.c\r=(j=W!| y\u001am{;0X#D=d\u001f|w6-9rx&n\u0010!;'b\u001dnd yW!1~3G"
		// @58: invokestatic game.C_100054_ec.func_101948_z(java.lang.String)char[]
		// @5B: invokestatic game.C_100054_ec.func_101947_z(char[])java.lang.String
		// @5E: putstatic java.lang.String game.C_100054_ec.field_101956_Yb
		// @61: return
	}
	
	private static char[] func_101948_z(String arg0)
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
		// @0E: bipush 20 (0x14)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_101947_z(char[] arg0)
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
		// @30: bipush 79 (0x4F)
		// @32: goto @46
		// @35: bipush 13 (0x0D)
		// @37: goto @46
		// @3A: bipush 105 (0x69)
		// @3C: goto @46
		// @3F: bipush 29 (0x1D)
		// @41: goto @46
		// @44: bipush 20 (0x14)
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
