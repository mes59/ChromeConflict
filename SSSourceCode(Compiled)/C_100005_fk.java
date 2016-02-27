package game;

import java.io.RandomAccessFile;
import java.io.IOException;
import java.io.File;

final class C_100005_fk
{
	static int[] field_103605_u;
	static int[][] field_103608_r;
	static int[] field_103602_h;
	static int[][][] field_103595_a;
	static int[] field_103600_j;
	static int field_103599_m;
	static int field_103603_i;
	static int[] field_103604_v;
	static int[] field_103597_o;
	static int[] field_103610_p;
	private long field_103598_l;
	static int[] field_103592_e;
	static int[] field_103607_s;
	static String field_103594_c;
	private long field_103589_f;
	private RandomAccessFile field_103601_k;
	static int[] field_103606_t;
	static int[][] field_103596_n;
	static C_100037_wb[] field_103593_b;
	static boolean field_103590_g;
	static int[] field_103609_q;
	static C_100153_be field_103591_d;
	private static final String[] field_103611_z;
	
	final long func_103585_a(int arg0) throws IOException
	{
		// @00: iload_1
		// @01: bipush -112 (0x90)
		// @03: if_icmple @15
		// @06: iconst_1
		// @07: bipush -45 (0xD3)
		// @09: aconst_null
		// @0A: checkcast java.lang.CharSequence
		// @0D: invokestatic game.C_100005_fk.func_103584_a(boolean, byte, java.lang.CharSequence)java.lang.String
		// @10: pop
		// @11: goto @15
		// @14: athrow
		// @15: aload_0
		// @16: getfield java.io.RandomAccessFile game.C_100005_fk.field_103601_k
		// @19: invokevirtual java.io.RandomAccessFile.length()long
		// @1C: lreturn
		// @1D: astore_2
		// @1E: aload_2
		// @1F: new java.lang.StringBuilder
		// @22: dup
		// @23: invokespecial java.lang.StringBuilder.<init>()void
		// @26: getstatic java.lang.String[] game.C_100005_fk.field_103611_z
		// @29: iconst_5
		// @2A: aaload
		// @2B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2E: iload_1
		// @2F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @32: bipush 41 (0x29)
		// @34: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @37: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3D: athrow
	}
	
	public static void func_103581_a(byte arg0)
	{
		// @00: iload_0
		// @01: bipush -20 (0xEC)
		// @03: if_icmple @11
		// @06: aconst_null
		// @07: checkcast java.lang.String
		// @0A: putstatic java.lang.String game.C_100005_fk.field_103594_c
		// @0D: goto @11
		// @10: athrow
		// @11: aconst_null
		// @12: checkcast int[][]
		// @15: putstatic int[][] game.C_100005_fk.field_103596_n
		// @18: aconst_null
		// @19: putstatic int[] game.C_100005_fk.field_103606_t
		// @1C: aconst_null
		// @1D: putstatic int[] game.C_100005_fk.field_103610_p
		// @20: aconst_null
		// @21: putstatic int[] game.C_100005_fk.field_103597_o
		// @24: aconst_null
		// @25: putstatic int[] game.C_100005_fk.field_103607_s
		// @28: aconst_null
		// @29: putstatic game.C_100153_be game.C_100005_fk.field_103591_d
		// @2C: aconst_null
		// @2D: checkcast int[][]
		// @30: putstatic int[][] game.C_100005_fk.field_103608_r
		// @33: aconst_null
		// @34: putstatic game.C_100037_wb[] game.C_100005_fk.field_103593_b
		// @37: aconst_null
		// @38: checkcast int[][][]
		// @3B: putstatic int[][][] game.C_100005_fk.field_103595_a
		// @3E: aconst_null
		// @3F: putstatic int[] game.C_100005_fk.field_103602_h
		// @42: aconst_null
		// @43: putstatic java.lang.String game.C_100005_fk.field_103594_c
		// @46: aconst_null
		// @47: putstatic int[] game.C_100005_fk.field_103592_e
		// @4A: aconst_null
		// @4B: putstatic int[] game.C_100005_fk.field_103609_q
		// @4E: aconst_null
		// @4F: putstatic int[] game.C_100005_fk.field_103604_v
		// @52: aconst_null
		// @53: putstatic int[] game.C_100005_fk.field_103600_j
		// @56: aconst_null
		// @57: putstatic int[] game.C_100005_fk.field_103605_u
		// @5A: goto @7E
		// @5D: astore_1
		// @5E: aload_1
		// @5F: new java.lang.StringBuilder
		// @62: dup
		// @63: invokespecial java.lang.StringBuilder.<init>()void
		// @66: getstatic java.lang.String[] game.C_100005_fk.field_103611_z
		// @69: iconst_3
		// @6A: aaload
		// @6B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @6E: iload_0
		// @6F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @72: bipush 41 (0x29)
		// @74: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @77: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @7A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @7D: athrow
		// @7E: return
	}
	
	final void func_103588_a(int arg0, byte[] arg1, int arg2, int arg3) throws IOException
	{
		// @00: iload_3
		// @01: i2l
		// @02: aload_0
		// @03: getfield long game.C_100005_fk.field_103589_f
		// @06: ladd
		// @07: aload_0
		// @08: getfield long game.C_100005_fk.field_103598_l
		// @0B: lcmp
		// @0C: ifgt @13
		// @0F: goto @2E
		// @12: athrow
		// @13: aload_0
		// @14: getfield java.io.RandomAccessFile game.C_100005_fk.field_103601_k
		// @17: aload_0
		// @18: getfield long game.C_100005_fk.field_103598_l
		// @1B: invokevirtual java.io.RandomAccessFile.seek(long)void
		// @1E: aload_0
		// @1F: getfield java.io.RandomAccessFile game.C_100005_fk.field_103601_k
		// @22: iconst_1
		// @23: invokevirtual java.io.RandomAccessFile.write(int)void
		// @26: new java.io.EOFException
		// @29: dup
		// @2A: invokespecial java.io.EOFException.<init>()void
		// @2D: athrow
		// @2E: bipush 27 (0x1B)
		// @30: iload #4
		// @32: bipush -27 (0xE5)
		// @34: isub
		// @35: bipush 41 (0x29)
		// @37: idiv
		// @38: irem
		// @39: istore #5
		// @3B: aload_0
		// @3C: getfield java.io.RandomAccessFile game.C_100005_fk.field_103601_k
		// @3F: aload_2
		// @40: iload_1
		// @41: iload_3
		// @42: invokevirtual java.io.RandomAccessFile.write(byte[], int, int)void
		// @45: aload_0
		// @46: dup
		// @47: getfield long game.C_100005_fk.field_103589_f
		// @4A: iload_3
		// @4B: i2l
		// @4C: ladd
		// @4D: putfield long game.C_100005_fk.field_103589_f
		// @50: goto @A3
		// @53: astore #5
		// @55: aload #5
		// @57: new java.lang.StringBuilder
		// @5A: dup
		// @5B: invokespecial java.lang.StringBuilder.<init>()void
		// @5E: getstatic java.lang.String[] game.C_100005_fk.field_103611_z
		// @61: iconst_0
		// @62: aaload
		// @63: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @66: iload_1
		// @67: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @6A: bipush 44 (0x2C)
		// @6C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6F: aload_2
		// @70: ifnull @7C
		// @73: getstatic java.lang.String[] game.C_100005_fk.field_103611_z
		// @76: iconst_1
		// @77: aaload
		// @78: goto @81
		// @7B: athrow
		// @7C: getstatic java.lang.String[] game.C_100005_fk.field_103611_z
		// @7F: iconst_2
		// @80: aaload
		// @81: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @84: bipush 44 (0x2C)
		// @86: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @89: iload_3
		// @8A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8D: bipush 44 (0x2C)
		// @8F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @92: iload #4
		// @94: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @97: bipush 41 (0x29)
		// @99: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @9C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @9F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @A2: athrow
		// @A3: return
	}
	
	protected final void finalize() throws Throwable
	{
		// @00: aconst_null
		// @01: aload_0
		// @02: getfield java.io.RandomAccessFile game.C_100005_fk.field_103601_k
		// @05: if_acmpne @0C
		// @08: goto @1A
		// @0B: athrow
		// @0C: getstatic java.io.PrintStream java.lang.System.out
		// @0F: ldc ""
		// @11: invokevirtual java.io.PrintStream.println(java.lang.String)void
		// @14: aload_0
		// @15: bipush 61 (0x3D)
		// @17: invokevirtual game.C_100005_fk.func_103586_b(byte)void
		// @1A: goto @28
		// @1D: astore_1
		// @1E: aload_1
		// @1F: getstatic java.lang.String[] game.C_100005_fk.field_103611_z
		// @22: iconst_4
		// @23: aaload
		// @24: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @27: athrow
		// @28: return
	}
	
	final void func_103587_a(long arg0, byte arg1) throws IOException
	{
		// @00: iload_3
		// @01: bipush -119 (0x89)
		// @03: if_icmple @14
		// @06: aconst_null
		// @07: checkcast int[][]
		// @0A: checkcast int[][]
		// @0D: putstatic int[][] game.C_100005_fk.field_103596_n
		// @10: goto @14
		// @13: athrow
		// @14: aload_0
		// @15: getfield java.io.RandomAccessFile game.C_100005_fk.field_103601_k
		// @18: lload_1
		// @19: invokevirtual java.io.RandomAccessFile.seek(long)void
		// @1C: aload_0
		// @1D: lload_1
		// @1E: putfield long game.C_100005_fk.field_103589_f
		// @21: goto @51
		// @24: astore #4
		// @26: aload #4
		// @28: new java.lang.StringBuilder
		// @2B: dup
		// @2C: invokespecial java.lang.StringBuilder.<init>()void
		// @2F: getstatic java.lang.String[] game.C_100005_fk.field_103611_z
		// @32: bipush 10 (0x0A)
		// @34: aaload
		// @35: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @38: lload_1
		// @39: invokevirtual java.lang.StringBuilder.append(long)java.lang.StringBuilder
		// @3C: bipush 44 (0x2C)
		// @3E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @41: iload_3
		// @42: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @45: bipush 41 (0x29)
		// @47: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @50: athrow
		// @51: return
	}
	
	final int func_103579_a(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException
	{
		// @00: bipush 59 (0x3B)
		// @02: iload_1
		// @03: bipush 49 (0x31)
		// @05: isub
		// @06: bipush 62 (0x3E)
		// @08: idiv
		// @09: irem
		// @0A: istore #5
		// @0C: aload_0
		// @0D: getfield java.io.RandomAccessFile game.C_100005_fk.field_103601_k
		// @10: aload_3
		// @11: iload #4
		// @13: iload_2
		// @14: invokevirtual java.io.RandomAccessFile.read(byte[], int, int)int
		// @17: istore #6
		// @19: iconst_0
		// @1A: iload #6
		// @1C: if_icmplt @23
		// @1F: goto @2F
		// @22: athrow
		// @23: aload_0
		// @24: dup
		// @25: getfield long game.C_100005_fk.field_103589_f
		// @28: iload #6
		// @2A: i2l
		// @2B: ladd
		// @2C: putfield long game.C_100005_fk.field_103589_f
		// @2F: iload #6
		// @31: ireturn
		// @32: astore #5
		// @34: aload #5
		// @36: new java.lang.StringBuilder
		// @39: dup
		// @3A: invokespecial java.lang.StringBuilder.<init>()void
		// @3D: getstatic java.lang.String[] game.C_100005_fk.field_103611_z
		// @40: bipush 7 (0x07)
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
		// @58: aload_3
		// @59: ifnull @65
		// @5C: getstatic java.lang.String[] game.C_100005_fk.field_103611_z
		// @5F: iconst_1
		// @60: aaload
		// @61: goto @6A
		// @64: athrow
		// @65: getstatic java.lang.String[] game.C_100005_fk.field_103611_z
		// @68: iconst_2
		// @69: aaload
		// @6A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @6D: bipush 44 (0x2C)
		// @6F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @72: iload #4
		// @74: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @77: bipush 41 (0x29)
		// @79: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @7C: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @7F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @82: athrow
	}
	
	static final String func_103584_a(boolean arg0, byte arg1, CharSequence arg2)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #8
		// @005: aload_2
		// @006: ifnull @00D
		// @009: goto @011
		// @00C: athrow
		// @00D: getstatic java.lang.String game.C_100290_jm.field_106866_h
		// @010: areturn
		// @011: aload_2
		// @012: invokeinterface java.lang.CharSequence.length()int
		// @017: istore_3
		// @018: iconst_1
		// @019: iload_3
		// @01A: if_icmpgt @02D
		// @01D: bipush -13 (0xF3)
		// @01F: iload_3
		// @020: iconst_m1
		// @021: ixor
		// @022: if_icmpgt @02D
		// @025: goto @029
		// @028: athrow
		// @029: goto @031
		// @02C: athrow
		// @02D: getstatic java.lang.String game.C_100290_jm.field_106866_h
		// @030: areturn
		// @031: iload_1
		// @032: bipush 22 (0x16)
		// @034: if_icmpeq @03C
		// @037: aconst_null
		// @038: checkcast java.lang.String
		// @03B: areturn
		// @03C: bipush 68 (0x44)
		// @03E: aload_2
		// @03F: invokestatic game.C_100106_ef.func_104742_a(byte, java.lang.CharSequence)java.lang.String
		// @042: astore #4
		// @044: aconst_null
		// @045: aload #4
		// @047: if_acmpeq @057
		// @04A: iconst_1
		// @04B: aload #4
		// @04D: invokevirtual java.lang.String.length()int
		// @050: if_icmple @05B
		// @053: goto @057
		// @056: athrow
		// @057: getstatic java.lang.String game.C_100290_jm.field_106866_h
		// @05A: areturn
		// @05B: bipush -96 (0xA0)
		// @05D: aload #4
		// @05F: iconst_0
		// @060: invokevirtual java.lang.String.charAt(int)char
		// @063: invokestatic game.C_100053_vn.func_102812_a(int, char)boolean
		// @066: ifne @087
		// @069: iload_1
		// @06A: bipush -118 (0x8A)
		// @06C: iadd
		// @06D: aload #4
		// @06F: aload #4
		// @071: invokevirtual java.lang.String.length()int
		// @074: iconst_m1
		// @075: iadd
		// @076: invokevirtual java.lang.String.charAt(int)char
		// @079: invokestatic game.C_100053_vn.func_102812_a(int, char)boolean
		// @07C: ifne @087
		// @07F: goto @083
		// @082: athrow
		// @083: goto @08B
		// @086: athrow
		// @087: getstatic java.lang.String game.C_100244_pe.field_106378_c
		// @08A: areturn
		// @08B: iconst_0
		// @08C: istore #5
		// @08E: iconst_0
		// @08F: istore #6
		// @091: iload #6
		// @093: iconst_m1
		// @094: ixor
		// @095: aload_2
		// @096: invokeinterface java.lang.CharSequence.length()int
		// @09B: iconst_m1
		// @09C: ixor
		// @09D: if_icmple @0ED
		// @0A0: aload_2
		// @0A1: iload #6
		// @0A3: invokeinterface java.lang.CharSequence.charAt(int)char
		// @0A8: istore #7
		// @0AA: bipush -96 (0xA0)
		// @0AC: iload #7
		// @0AE: invokestatic game.C_100053_vn.func_102812_a(int, char)boolean
		// @0B1: iload #8
		// @0B3: ifne @0EE
		// @0B6: ifeq @0C9
		// @0B9: goto @0BD
		// @0BC: athrow
		// @0BD: iinc #5 +1
		// @0C0: iload #8
		// @0C2: ifeq @0CC
		// @0C5: goto @0C9
		// @0C8: athrow
		// @0C9: iconst_0
		// @0CA: istore #5
		// @0CC: iload #5
		// @0CE: iconst_m1
		// @0CF: ixor
		// @0D0: bipush -3 (0xFD)
		// @0D2: if_icmpgt @0E5
		// @0D5: iload_0
		// @0D6: ifeq @0E1
		// @0D9: goto @0DD
		// @0DC: athrow
		// @0DD: goto @0E5
		// @0E0: athrow
		// @0E1: getstatic java.lang.String game.C_100128_ca.field_102809_R
		// @0E4: areturn
		// @0E5: iinc #6 +1
		// @0E8: iload #8
		// @0EA: ifeq @091
		// @0ED: iconst_0
		// @0EE: iload #5
		// @0F0: if_icmplt @0F7
		// @0F3: goto @0FB
		// @0F6: athrow
		// @0F7: getstatic java.lang.String game.C_100244_pe.field_106378_c
		// @0FA: areturn
		// @0FB: aconst_null
		// @0FC: areturn
		// @0FD: astore_3
		// @0FE: aload_3
		// @0FF: new java.lang.StringBuilder
		// @102: dup
		// @103: invokespecial java.lang.StringBuilder.<init>()void
		// @106: getstatic java.lang.String[] game.C_100005_fk.field_103611_z
		// @109: bipush 8 (0x08)
		// @10B: aaload
		// @10C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @10F: iload_0
		// @110: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @113: bipush 44 (0x2C)
		// @115: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @118: iload_1
		// @119: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @11C: bipush 44 (0x2C)
		// @11E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @121: aload_2
		// @122: ifnull @12E
		// @125: getstatic java.lang.String[] game.C_100005_fk.field_103611_z
		// @128: iconst_1
		// @129: aaload
		// @12A: goto @133
		// @12D: athrow
		// @12E: getstatic java.lang.String[] game.C_100005_fk.field_103611_z
		// @131: iconst_2
		// @132: aaload
		// @133: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @136: bipush 41 (0x29)
		// @138: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @13B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @13E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @141: athrow
	}
	
	final void func_103586_b(byte arg0) throws IOException
	{
		// @00: aconst_null
		// @01: aload_0
		// @02: getfield java.io.RandomAccessFile game.C_100005_fk.field_103601_k
		// @05: if_acmpeq @18
		// @08: aload_0
		// @09: getfield java.io.RandomAccessFile game.C_100005_fk.field_103601_k
		// @0C: invokevirtual java.io.RandomAccessFile.close()void
		// @0F: aload_0
		// @10: aconst_null
		// @11: putfield java.io.RandomAccessFile game.C_100005_fk.field_103601_k
		// @14: goto @18
		// @17: athrow
		// @18: iload_1
		// @19: bipush 61 (0x3D)
		// @1B: if_icmpeq @29
		// @1E: aconst_null
		// @1F: checkcast int[]
		// @22: putstatic int[] game.C_100005_fk.field_103602_h
		// @25: goto @29
		// @28: athrow
		// @29: goto @4E
		// @2C: astore_2
		// @2D: aload_2
		// @2E: new java.lang.StringBuilder
		// @31: dup
		// @32: invokespecial java.lang.StringBuilder.<init>()void
		// @35: getstatic java.lang.String[] game.C_100005_fk.field_103611_z
		// @38: bipush 9 (0x09)
		// @3A: aaload
		// @3B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3E: iload_1
		// @3F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @42: bipush 41 (0x29)
		// @44: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @47: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4D: athrow
		// @4E: return
	}
	
	static final void func_103583_a(boolean arg0)
	{
		// @00: getstatic int game.SteelSentinels.field_105275_O
		// @03: istore_3
		// @04: iload_0
		// @05: ifeq @16
		// @08: aconst_null
		// @09: checkcast int[][]
		// @0C: checkcast int[][]
		// @0F: putstatic int[][] game.C_100005_fk.field_103608_r
		// @12: goto @16
		// @15: athrow
		// @16: sipush 255 (0x00FF)
		// @19: istore_1
		// @1A: iconst_0
		// @1B: istore_2
		// @1C: iload_2
		// @1D: bipush 50 (0x32)
		// @1F: if_icmpge @3F
		// @22: iconst_0
		// @23: iload_2
		// @24: sipush 640 (0x0280)
		// @27: ldc 1052688 (0x101010)
		// @29: iload_1
		// @2A: invokestatic game.C_100196_rb.func_105800_f(int, int, int, int, int)void
		// @2D: iinc #1 +251
		// @30: iinc #2 +1
		// @33: iload_3
		// @34: ifne @64
		// @37: iload_3
		// @38: ifeq @1C
		// @3B: goto @3F
		// @3E: athrow
		// @3F: goto @64
		// @42: astore_1
		// @43: aload_1
		// @44: new java.lang.StringBuilder
		// @47: dup
		// @48: invokespecial java.lang.StringBuilder.<init>()void
		// @4B: getstatic java.lang.String[] game.C_100005_fk.field_103611_z
		// @4E: bipush 11 (0x0B)
		// @50: aaload
		// @51: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @54: iload_0
		// @55: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @58: bipush 41 (0x29)
		// @5A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @60: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @63: athrow
		// @64: return
	}
	
	C_100005_fk(File arg0, String arg1, long arg2) throws IOException
	{
		// @00: aload_0
		// @01: invokespecial java.lang.Object.<init>()void
		// @04: lload_3
		// @05: ldc2_w -1
		// @08: lxor
		// @09: lconst_0
		// @0A: lcmp
		// @0B: ifne @12
		// @0E: ldc2_w 9223372036854775807
		// @11: lstore_3
		// @12: aload_1
		// @13: invokevirtual java.io.File.length()long
		// @16: lload_3
		// @17: lcmp
		// @18: ifle @24
		// @1B: aload_1
		// @1C: invokevirtual java.io.File.delete()boolean
		// @1F: pop
		// @20: goto @24
		// @23: athrow
		// @24: aload_0
		// @25: new java.io.RandomAccessFile
		// @28: dup
		// @29: aload_1
		// @2A: aload_2
		// @2B: invokespecial java.io.RandomAccessFile.<init>(java.io.File, java.lang.String)void
		// @2E: putfield java.io.RandomAccessFile game.C_100005_fk.field_103601_k
		// @31: aload_0
		// @32: lload_3
		// @33: putfield long game.C_100005_fk.field_103598_l
		// @36: aload_0
		// @37: lconst_0
		// @38: putfield long game.C_100005_fk.field_103589_f
		// @3B: aload_0
		// @3C: getfield java.io.RandomAccessFile game.C_100005_fk.field_103601_k
		// @3F: invokevirtual java.io.RandomAccessFile.read()int
		// @42: istore #5
		// @44: iload #5
		// @46: iconst_m1
		// @47: ixor
		// @48: ifeq @6D
		// @4B: aload_2
		// @4C: ldc "r"
		// @4E: invokevirtual java.lang.String.equals(java.lang.Object)boolean
		// @51: ifne @6D
		// @54: goto @58
		// @57: athrow
		// @58: aload_0
		// @59: getfield java.io.RandomAccessFile game.C_100005_fk.field_103601_k
		// @5C: lconst_0
		// @5D: invokevirtual java.io.RandomAccessFile.seek(long)void
		// @60: aload_0
		// @61: getfield java.io.RandomAccessFile game.C_100005_fk.field_103601_k
		// @64: iload #5
		// @66: invokevirtual java.io.RandomAccessFile.write(int)void
		// @69: goto @6D
		// @6C: athrow
		// @6D: aload_0
		// @6E: getfield java.io.RandomAccessFile game.C_100005_fk.field_103601_k
		// @71: lconst_0
		// @72: invokevirtual java.io.RandomAccessFile.seek(long)void
		// @75: goto @D0
		// @78: astore #5
		// @7A: aload #5
		// @7C: new java.lang.StringBuilder
		// @7F: dup
		// @80: invokespecial java.lang.StringBuilder.<init>()void
		// @83: getstatic java.lang.String[] game.C_100005_fk.field_103611_z
		// @86: bipush 6 (0x06)
		// @88: aaload
		// @89: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @8C: aload_1
		// @8D: ifnull @99
		// @90: getstatic java.lang.String[] game.C_100005_fk.field_103611_z
		// @93: iconst_1
		// @94: aaload
		// @95: goto @9E
		// @98: athrow
		// @99: getstatic java.lang.String[] game.C_100005_fk.field_103611_z
		// @9C: iconst_2
		// @9D: aaload
		// @9E: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @A1: bipush 44 (0x2C)
		// @A3: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @A6: aload_2
		// @A7: ifnull @B3
		// @AA: getstatic java.lang.String[] game.C_100005_fk.field_103611_z
		// @AD: iconst_1
		// @AE: aaload
		// @AF: goto @B8
		// @B2: athrow
		// @B3: getstatic java.lang.String[] game.C_100005_fk.field_103611_z
		// @B6: iconst_2
		// @B7: aaload
		// @B8: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @BB: bipush 44 (0x2C)
		// @BD: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C0: lload_3
		// @C1: invokevirtual java.lang.StringBuilder.append(long)java.lang.StringBuilder
		// @C4: bipush 41 (0x29)
		// @C6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C9: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @CC: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @CF: athrow
		// @D0: return
	}
	
	static
	{
		// @0000: bipush 12 (0x0C)
		// @0002: anewarray java.lang.String
		// @0005: dup
		// @0006: iconst_0
		// @0007: ldc "\u0001N\u000e\n_"
		// @0009: invokestatic game.C_100005_fk.func_103582_z(java.lang.String)char[]
		// @000C: invokestatic game.C_100005_fk.func_103580_z(char[])java.lang.String
		// @000F: aastore
		// @0010: dup
		// @0011: iconst_1
		// @0012: ldc "\u001c\u000b\u000ea\n"
		// @0014: invokestatic game.C_100005_fk.func_103582_z(java.lang.String)char[]
		// @0017: invokestatic game.C_100005_fk.func_103580_z(char[])java.lang.String
		// @001A: aastore
		// @001B: dup
		// @001C: iconst_2
		// @001D: ldc "\tPL#"
		// @001F: invokestatic game.C_100005_fk.func_103582_z(java.lang.String)char[]
		// @0022: invokestatic game.C_100005_fk.func_103580_z(char[])java.lang.String
		// @0025: aastore
		// @0026: dup
		// @0027: iconst_3
		// @0028: ldc "\u0001N\u000e\t_"
		// @002A: invokestatic game.C_100005_fk.func_103582_z(java.lang.String)char[]
		// @002D: invokestatic game.C_100005_fk.func_103580_z(char[])java.lang.String
		// @0030: aastore
		// @0031: dup
		// @0032: iconst_4
		// @0033: ldc "\u0001N\u000e)\u001e\tDL&\r\u0002\r\t"
		// @0035: invokestatic game.C_100005_fk.func_103582_z(java.lang.String)char[]
		// @0038: invokestatic game.C_100005_fk.func_103580_z(char[])java.lang.String
		// @003B: aastore
		// @003C: dup
		// @003D: iconst_5
		// @003E: ldc "\u0001N\u000e\r_"
		// @0040: invokestatic game.C_100005_fk.func_103582_z(java.lang.String)char[]
		// @0043: invokestatic game.C_100005_fk.func_103580_z(char[])java.lang.String
		// @0046: aastore
		// @0047: dup
		// @0048: bipush 6 (0x06)
		// @004A: ldc "\u0001N\u000es\u001e\tLTq_"
		// @004C: invokestatic game.C_100005_fk.func_103582_z(java.lang.String)char[]
		// @004F: invokestatic game.C_100005_fk.func_103580_z(char[])java.lang.String
		// @0052: aastore
		// @0053: dup
		// @0054: bipush 7 (0x07)
		// @0056: ldc "\u0001N\u000e\u0007_"
		// @0058: invokestatic game.C_100005_fk.func_103582_z(java.lang.String)char[]
		// @005B: invokestatic game.C_100005_fk.func_103580_z(char[])java.lang.String
		// @005E: aastore
		// @005F: dup
		// @0060: bipush 8 (0x08)
		// @0062: ldc "\u0001N\u000e\u000c_"
		// @0064: invokestatic game.C_100005_fk.func_103582_z(java.lang.String)char[]
		// @0067: invokestatic game.C_100005_fk.func_103580_z(char[])java.lang.String
		// @006A: aastore
		// @006B: dup
		// @006C: bipush 9 (0x09)
		// @006E: ldc "\u0001N\u000e\u000e_"
		// @0070: invokestatic game.C_100005_fk.func_103582_z(java.lang.String)char[]
		// @0073: invokestatic game.C_100005_fk.func_103580_z(char[])java.lang.String
		// @0076: aastore
		// @0077: dup
		// @0078: bipush 10 (0x0A)
		// @007A: ldc "\u0001N\u000e\u0008_"
		// @007C: invokestatic game.C_100005_fk.func_103582_z(java.lang.String)char[]
		// @007F: invokestatic game.C_100005_fk.func_103580_z(char[])java.lang.String
		// @0082: aastore
		// @0083: dup
		// @0084: bipush 11 (0x0B)
		// @0086: ldc "\u0001N\u000e\u000b_"
		// @0088: invokestatic game.C_100005_fk.func_103582_z(java.lang.String)char[]
		// @008B: invokestatic game.C_100005_fk.func_103580_z(char[])java.lang.String
		// @008E: aastore
		// @008F: putstatic java.lang.String[] game.C_100005_fk.field_103611_z
		// @0092: bipush 30 (0x1E)
		// @0094: anewarray int[]
		// @0097: putstatic int[][] game.C_100005_fk.field_103608_r
		// @009A: bipush 20 (0x14)
		// @009C: newarray int[]
		// @009E: dup
		// @009F: iconst_0
		// @00A0: iconst_0
		// @00A1: iastore
		// @00A2: dup
		// @00A3: iconst_1
		// @00A4: bipush 37 (0x25)
		// @00A6: iastore
		// @00A7: dup
		// @00A8: iconst_2
		// @00A9: bipush 96 (0x60)
		// @00AB: iastore
		// @00AC: dup
		// @00AD: iconst_3
		// @00AE: bipush 29 (0x1D)
		// @00B0: iastore
		// @00B1: dup
		// @00B2: iconst_4
		// @00B3: iconst_1
		// @00B4: iastore
		// @00B5: dup
		// @00B6: iconst_5
		// @00B7: bipush 17 (0x11)
		// @00B9: iastore
		// @00BA: dup
		// @00BB: bipush 6 (0x06)
		// @00BD: iconst_3
		// @00BE: iastore
		// @00BF: dup
		// @00C0: bipush 7 (0x07)
		// @00C2: bipush 26 (0x1A)
		// @00C4: iastore
		// @00C5: dup
		// @00C6: bipush 8 (0x08)
		// @00C8: bipush 26 (0x1A)
		// @00CA: iastore
		// @00CB: dup
		// @00CC: bipush 9 (0x09)
		// @00CE: bipush 26 (0x1A)
		// @00D0: iastore
		// @00D1: dup
		// @00D2: bipush 10 (0x0A)
		// @00D4: iconst_2
		// @00D5: iastore
		// @00D6: dup
		// @00D7: bipush 11 (0x0B)
		// @00D9: bipush 30 (0x1E)
		// @00DB: iastore
		// @00DC: dup
		// @00DD: bipush 12 (0x0C)
		// @00DF: iconst_0
		// @00E0: iastore
		// @00E1: dup
		// @00E2: bipush 13 (0x0D)
		// @00E4: bipush 21 (0x15)
		// @00E6: iastore
		// @00E7: dup
		// @00E8: bipush 14 (0x0E)
		// @00EA: bipush 10 (0x0A)
		// @00EC: iastore
		// @00ED: dup
		// @00EE: bipush 15 (0x0F)
		// @00F0: bipush 26 (0x1A)
		// @00F2: iastore
		// @00F3: dup
		// @00F4: bipush 16 (0x10)
		// @00F6: iconst_m1
		// @00F7: iastore
		// @00F8: dup
		// @00F9: bipush 17 (0x11)
		// @00FB: iconst_m1
		// @00FC: iastore
		// @00FD: dup
		// @00FE: bipush 18 (0x12)
		// @0100: iconst_m1
		// @0101: iastore
		// @0102: dup
		// @0103: bipush 19 (0x13)
		// @0105: iconst_m1
		// @0106: iastore
		// @0107: putstatic int[] game.C_100005_fk.field_103604_v
		// @010A: bipush 19 (0x13)
		// @010C: newarray int[]
		// @010E: dup
		// @010F: iconst_0
		// @0110: bipush 57 (0x39)
		// @0112: iastore
		// @0113: dup
		// @0114: iconst_1
		// @0115: bipush 98 (0x62)
		// @0117: iastore
		// @0118: dup
		// @0119: iconst_2
		// @011A: bipush 21 (0x15)
		// @011C: iastore
		// @011D: dup
		// @011E: iconst_3
		// @011F: bipush 23 (0x17)
		// @0121: iastore
		// @0122: dup
		// @0123: iconst_4
		// @0124: bipush 23 (0x17)
		// @0126: iastore
		// @0127: dup
		// @0128: iconst_5
		// @0129: bipush 60 (0x3C)
		// @012B: iastore
		// @012C: dup
		// @012D: bipush 6 (0x06)
		// @012F: bipush 58 (0x3A)
		// @0131: iastore
		// @0132: dup
		// @0133: bipush 7 (0x07)
		// @0135: bipush 21 (0x15)
		// @0137: iastore
		// @0138: dup
		// @0139: bipush 8 (0x08)
		// @013B: bipush 23 (0x17)
		// @013D: iastore
		// @013E: dup
		// @013F: bipush 9 (0x09)
		// @0141: bipush 23 (0x17)
		// @0143: iastore
		// @0144: dup
		// @0145: bipush 10 (0x0A)
		// @0147: bipush 59 (0x3B)
		// @0149: iastore
		// @014A: dup
		// @014B: bipush 11 (0x0B)
		// @014D: iconst_0
		// @014E: iastore
		// @014F: dup
		// @0150: bipush 12 (0x0C)
		// @0152: iconst_5
		// @0153: iastore
		// @0154: dup
		// @0155: bipush 13 (0x0D)
		// @0157: bipush 16 (0x10)
		// @0159: iastore
		// @015A: dup
		// @015B: bipush 14 (0x0E)
		// @015D: bipush 10 (0x0A)
		// @015F: iastore
		// @0160: dup
		// @0161: bipush 15 (0x0F)
		// @0163: iconst_m1
		// @0164: iastore
		// @0165: dup
		// @0166: bipush 16 (0x10)
		// @0168: iconst_m1
		// @0169: iastore
		// @016A: dup
		// @016B: bipush 17 (0x11)
		// @016D: iconst_m1
		// @016E: iastore
		// @016F: dup
		// @0170: bipush 18 (0x12)
		// @0172: iconst_m1
		// @0173: iastore
		// @0174: putstatic int[] game.C_100005_fk.field_103607_s
		// @0177: bipush 20 (0x14)
		// @0179: newarray int[]
		// @017B: dup
		// @017C: iconst_0
		// @017D: bipush 55 (0x37)
		// @017F: iastore
		// @0180: dup
		// @0181: iconst_1
		// @0182: bipush 53 (0x35)
		// @0184: iastore
		// @0185: dup
		// @0186: iconst_2
		// @0187: bipush 18 (0x12)
		// @0189: iastore
		// @018A: dup
		// @018B: iconst_3
		// @018C: bipush 24 (0x18)
		// @018E: iastore
		// @018F: dup
		// @0190: iconst_4
		// @0191: bipush 24 (0x18)
		// @0193: iastore
		// @0194: dup
		// @0195: iconst_5
		// @0196: bipush 24 (0x18)
		// @0198: iastore
		// @0199: dup
		// @019A: bipush 6 (0x06)
		// @019C: bipush 54 (0x36)
		// @019E: iastore
		// @019F: dup
		// @01A0: bipush 7 (0x07)
		// @01A2: bipush 29 (0x1D)
		// @01A4: iastore
		// @01A5: dup
		// @01A6: bipush 8 (0x08)
		// @01A8: bipush 56 (0x38)
		// @01AA: iastore
		// @01AB: dup
		// @01AC: bipush 9 (0x09)
		// @01AE: bipush 29 (0x1D)
		// @01B0: iastore
		// @01B1: dup
		// @01B2: bipush 10 (0x0A)
		// @01B4: bipush 29 (0x1D)
		// @01B6: iastore
		// @01B7: dup
		// @01B8: bipush 11 (0x0B)
		// @01BA: bipush 97 (0x61)
		// @01BC: iastore
		// @01BD: dup
		// @01BE: bipush 12 (0x0C)
		// @01C0: bipush 17 (0x11)
		// @01C2: iastore
		// @01C3: dup
		// @01C4: bipush 13 (0x0D)
		// @01C6: iconst_m1
		// @01C7: iastore
		// @01C8: dup
		// @01C9: bipush 14 (0x0E)
		// @01CB: iconst_m1
		// @01CC: iastore
		// @01CD: dup
		// @01CE: bipush 15 (0x0F)
		// @01D0: iconst_m1
		// @01D1: iastore
		// @01D2: dup
		// @01D3: bipush 16 (0x10)
		// @01D5: iconst_m1
		// @01D6: iastore
		// @01D7: dup
		// @01D8: bipush 17 (0x11)
		// @01DA: iconst_m1
		// @01DB: iastore
		// @01DC: dup
		// @01DD: bipush 18 (0x12)
		// @01DF: iconst_m1
		// @01E0: iastore
		// @01E1: dup
		// @01E2: bipush 19 (0x13)
		// @01E4: iconst_m1
		// @01E5: iastore
		// @01E6: putstatic int[] game.C_100005_fk.field_103605_u
		// @01E9: bipush 30 (0x1E)
		// @01EB: anewarray int[][]
		// @01EE: putstatic int[][][] game.C_100005_fk.field_103595_a
		// @01F1: ldc "!\u0014"
		// @01F3: invokestatic game.C_100005_fk.func_103582_z(java.lang.String)char[]
		// @01F6: invokestatic game.C_100005_fk.func_103580_z(char[])java.lang.String
		// @01F9: putstatic java.lang.String game.C_100005_fk.field_103594_c
		// @01FC: bipush 20 (0x14)
		// @01FE: newarray int[]
		// @0200: dup
		// @0201: iconst_0
		// @0202: bipush 75 (0x4B)
		// @0204: iastore
		// @0205: dup
		// @0206: iconst_1
		// @0207: bipush 78 (0x4E)
		// @0209: iastore
		// @020A: dup
		// @020B: iconst_2
		// @020C: bipush 27 (0x1B)
		// @020E: iastore
		// @020F: dup
		// @0210: iconst_3
		// @0211: bipush 77 (0x4D)
		// @0213: iastore
		// @0214: dup
		// @0215: iconst_4
		// @0216: bipush 24 (0x18)
		// @0218: iastore
		// @0219: dup
		// @021A: iconst_5
		// @021B: bipush 76 (0x4C)
		// @021D: iastore
		// @021E: dup
		// @021F: bipush 6 (0x06)
		// @0221: bipush 28 (0x1C)
		// @0223: iastore
		// @0224: dup
		// @0225: bipush 7 (0x07)
		// @0227: bipush 83 (0x53)
		// @0229: iastore
		// @022A: dup
		// @022B: bipush 8 (0x08)
		// @022D: bipush 24 (0x18)
		// @022F: iastore
		// @0230: dup
		// @0231: bipush 9 (0x09)
		// @0233: bipush 24 (0x18)
		// @0235: iastore
		// @0236: dup
		// @0237: bipush 10 (0x0A)
		// @0239: bipush 45 (0x2D)
		// @023B: iastore
		// @023C: dup
		// @023D: bipush 11 (0x0B)
		// @023F: bipush 102 (0x66)
		// @0241: iastore
		// @0242: dup
		// @0243: bipush 12 (0x0C)
		// @0245: iconst_2
		// @0246: iastore
		// @0247: dup
		// @0248: bipush 13 (0x0D)
		// @024A: bipush 7 (0x07)
		// @024C: iastore
		// @024D: dup
		// @024E: bipush 14 (0x0E)
		// @0250: bipush 12 (0x0C)
		// @0252: iastore
		// @0253: dup
		// @0254: bipush 15 (0x0F)
		// @0256: bipush 17 (0x11)
		// @0258: iastore
		// @0259: dup
		// @025A: bipush 16 (0x10)
		// @025C: bipush 31 (0x1F)
		// @025E: iastore
		// @025F: dup
		// @0260: bipush 17 (0x11)
		// @0262: iconst_m1
		// @0263: iastore
		// @0264: dup
		// @0265: bipush 18 (0x12)
		// @0267: iconst_m1
		// @0268: iastore
		// @0269: dup
		// @026A: bipush 19 (0x13)
		// @026C: iconst_m1
		// @026D: iastore
		// @026E: putstatic int[] game.C_100005_fk.field_103592_e
		// @0271: iconst_0
		// @0272: putstatic int game.C_100005_fk.field_103599_m
		// @0275: iconst_0
		// @0276: putstatic int game.C_100005_fk.field_103603_i
		// @0279: bipush 26 (0x1A)
		// @027B: newarray int[]
		// @027D: dup
		// @027E: iconst_0
		// @027F: bipush 79 (0x4F)
		// @0281: iastore
		// @0282: dup
		// @0283: iconst_1
		// @0284: bipush 81 (0x51)
		// @0286: iastore
		// @0287: dup
		// @0288: iconst_2
		// @0289: bipush 51 (0x33)
		// @028B: iastore
		// @028C: dup
		// @028D: iconst_3
		// @028E: bipush 51 (0x33)
		// @0290: iastore
		// @0291: dup
		// @0292: iconst_4
		// @0293: bipush 51 (0x33)
		// @0295: iastore
		// @0296: dup
		// @0297: iconst_5
		// @0298: bipush 80 (0x50)
		// @029A: iastore
		// @029B: dup
		// @029C: bipush 6 (0x06)
		// @029E: bipush 24 (0x18)
		// @02A0: iastore
		// @02A1: dup
		// @02A2: bipush 7 (0x07)
		// @02A4: bipush 24 (0x18)
		// @02A6: iastore
		// @02A7: dup
		// @02A8: bipush 8 (0x08)
		// @02AA: bipush 24 (0x18)
		// @02AC: iastore
		// @02AD: dup
		// @02AE: bipush 9 (0x09)
		// @02B0: bipush 24 (0x18)
		// @02B2: iastore
		// @02B3: dup
		// @02B4: bipush 10 (0x0A)
		// @02B6: bipush 24 (0x18)
		// @02B8: iastore
		// @02B9: dup
		// @02BA: bipush 11 (0x0B)
		// @02BC: bipush 24 (0x18)
		// @02BE: iastore
		// @02BF: dup
		// @02C0: bipush 12 (0x0C)
		// @02C2: bipush 24 (0x18)
		// @02C4: iastore
		// @02C5: dup
		// @02C6: bipush 13 (0x0D)
		// @02C8: bipush 103 (0x67)
		// @02CA: iastore
		// @02CB: dup
		// @02CC: bipush 14 (0x0E)
		// @02CE: bipush 38 (0x26)
		// @02D0: iastore
		// @02D1: dup
		// @02D2: bipush 15 (0x0F)
		// @02D4: bipush 36 (0x24)
		// @02D6: iastore
		// @02D7: dup
		// @02D8: bipush 16 (0x10)
		// @02DA: bipush 82 (0x52)
		// @02DC: iastore
		// @02DD: dup
		// @02DE: bipush 17 (0x11)
		// @02E0: bipush 44 (0x2C)
		// @02E2: iastore
		// @02E3: dup
		// @02E4: bipush 18 (0x12)
		// @02E6: iconst_3
		// @02E7: iastore
		// @02E8: dup
		// @02E9: bipush 19 (0x13)
		// @02EB: bipush 8 (0x08)
		// @02ED: iastore
		// @02EE: dup
		// @02EF: bipush 20 (0x14)
		// @02F1: bipush 16 (0x10)
		// @02F3: iastore
		// @02F4: dup
		// @02F5: bipush 21 (0x15)
		// @02F7: bipush 19 (0x13)
		// @02F9: iastore
		// @02FA: dup
		// @02FB: bipush 22 (0x16)
		// @02FD: iconst_m1
		// @02FE: iastore
		// @02FF: dup
		// @0300: bipush 23 (0x17)
		// @0302: iconst_m1
		// @0303: iastore
		// @0304: dup
		// @0305: bipush 24 (0x18)
		// @0307: iconst_m1
		// @0308: iastore
		// @0309: dup
		// @030A: bipush 25 (0x19)
		// @030C: iconst_m1
		// @030D: iastore
		// @030E: putstatic int[] game.C_100005_fk.field_103600_j
		// @0311: bipush 20 (0x14)
		// @0313: newarray int[]
		// @0315: dup
		// @0316: iconst_0
		// @0317: bipush 72 (0x48)
		// @0319: iastore
		// @031A: dup
		// @031B: iconst_1
		// @031C: bipush 34 (0x22)
		// @031E: iastore
		// @031F: dup
		// @0320: iconst_2
		// @0321: bipush 43 (0x2B)
		// @0323: iastore
		// @0324: dup
		// @0325: iconst_3
		// @0326: bipush 73 (0x49)
		// @0328: iastore
		// @0329: dup
		// @032A: iconst_4
		// @032B: bipush 23 (0x17)
		// @032D: iastore
		// @032E: dup
		// @032F: iconst_5
		// @0330: bipush 23 (0x17)
		// @0332: iastore
		// @0333: dup
		// @0334: bipush 6 (0x06)
		// @0336: bipush 23 (0x17)
		// @0338: iastore
		// @0339: dup
		// @033A: bipush 7 (0x07)
		// @033C: bipush 23 (0x17)
		// @033E: iastore
		// @033F: dup
		// @0340: bipush 8 (0x08)
		// @0342: bipush 23 (0x17)
		// @0344: iastore
		// @0345: dup
		// @0346: bipush 9 (0x09)
		// @0348: bipush 23 (0x17)
		// @034A: iastore
		// @034B: dup
		// @034C: bipush 10 (0x0A)
		// @034E: bipush 74 (0x4A)
		// @0350: iastore
		// @0351: dup
		// @0352: bipush 11 (0x0B)
		// @0354: bipush 25 (0x19)
		// @0356: iastore
		// @0357: dup
		// @0358: bipush 12 (0x0C)
		// @035A: iconst_2
		// @035B: iastore
		// @035C: dup
		// @035D: bipush 13 (0x0D)
		// @035F: bipush 7 (0x07)
		// @0361: iastore
		// @0362: dup
		// @0363: bipush 14 (0x0E)
		// @0365: bipush 16 (0x10)
		// @0367: iastore
		// @0368: dup
		// @0369: bipush 15 (0x0F)
		// @036B: bipush 12 (0x0C)
		// @036D: iastore
		// @036E: dup
		// @036F: bipush 16 (0x10)
		// @0371: bipush 27 (0x1B)
		// @0373: iastore
		// @0374: dup
		// @0375: bipush 17 (0x11)
		// @0377: bipush 25 (0x19)
		// @0379: iastore
		// @037A: dup
		// @037B: bipush 18 (0x12)
		// @037D: bipush 22 (0x16)
		// @037F: iastore
		// @0380: dup
		// @0381: bipush 19 (0x13)
		// @0383: iconst_m1
		// @0384: iastore
		// @0385: putstatic int[] game.C_100005_fk.field_103597_o
		// @0388: bipush 23 (0x17)
		// @038A: newarray int[]
		// @038C: dup
		// @038D: iconst_0
		// @038E: bipush 69 (0x45)
		// @0390: iastore
		// @0391: dup
		// @0392: iconst_1
		// @0393: bipush 68 (0x44)
		// @0395: iastore
		// @0396: dup
		// @0397: iconst_2
		// @0398: bipush 19 (0x13)
		// @039A: iastore
		// @039B: dup
		// @039C: iconst_3
		// @039D: bipush 70 (0x46)
		// @039F: iastore
		// @03A0: dup
		// @03A1: iconst_4
		// @03A2: bipush 24 (0x18)
		// @03A4: iastore
		// @03A5: dup
		// @03A6: iconst_5
		// @03A7: bipush 24 (0x18)
		// @03A9: iastore
		// @03AA: dup
		// @03AB: bipush 6 (0x06)
		// @03AD: bipush 24 (0x18)
		// @03AF: iastore
		// @03B0: dup
		// @03B1: bipush 7 (0x07)
		// @03B3: bipush 20 (0x14)
		// @03B5: iastore
		// @03B6: dup
		// @03B7: bipush 8 (0x08)
		// @03B9: bipush 71 (0x47)
		// @03BB: iastore
		// @03BC: dup
		// @03BD: bipush 9 (0x09)
		// @03BF: bipush 33 (0x21)
		// @03C1: iastore
		// @03C2: dup
		// @03C3: bipush 10 (0x0A)
		// @03C5: bipush 100 (0x64)
		// @03C7: iastore
		// @03C8: dup
		// @03C9: bipush 11 (0x0B)
		// @03CB: bipush 24 (0x18)
		// @03CD: iastore
		// @03CE: dup
		// @03CF: bipush 12 (0x0C)
		// @03D1: bipush 24 (0x18)
		// @03D3: iastore
		// @03D4: dup
		// @03D5: bipush 13 (0x0D)
		// @03D7: bipush 24 (0x18)
		// @03D9: iastore
		// @03DA: dup
		// @03DB: bipush 14 (0x0E)
		// @03DD: bipush 20 (0x14)
		// @03DF: iastore
		// @03E0: dup
		// @03E1: bipush 15 (0x0F)
		// @03E3: iconst_1
		// @03E4: iastore
		// @03E5: dup
		// @03E6: bipush 16 (0x10)
		// @03E8: bipush 6 (0x06)
		// @03EA: iastore
		// @03EB: dup
		// @03EC: bipush 17 (0x11)
		// @03EE: bipush 28 (0x1C)
		// @03F0: iastore
		// @03F1: dup
		// @03F2: bipush 18 (0x12)
		// @03F4: bipush 29 (0x1D)
		// @03F6: iastore
		// @03F7: dup
		// @03F8: bipush 19 (0x13)
		// @03FA: bipush 22 (0x16)
		// @03FC: iastore
		// @03FD: dup
		// @03FE: bipush 20 (0x14)
		// @0400: iconst_m1
		// @0401: iastore
		// @0402: dup
		// @0403: bipush 21 (0x15)
		// @0405: iconst_m1
		// @0406: iastore
		// @0407: dup
		// @0408: bipush 22 (0x16)
		// @040A: iconst_m1
		// @040B: iastore
		// @040C: putstatic int[] game.C_100005_fk.field_103610_p
		// @040F: bipush 18 (0x12)
		// @0411: newarray int[]
		// @0413: dup
		// @0414: iconst_0
		// @0415: bipush 65 (0x41)
		// @0417: iastore
		// @0418: dup
		// @0419: iconst_1
		// @041A: bipush 99 (0x63)
		// @041C: iastore
		// @041D: dup
		// @041E: iconst_2
		// @041F: bipush 22 (0x16)
		// @0421: iastore
		// @0422: dup
		// @0423: iconst_3
		// @0424: bipush 22 (0x16)
		// @0426: iastore
		// @0427: dup
		// @0428: iconst_4
		// @0429: bipush 64 (0x40)
		// @042B: iastore
		// @042C: dup
		// @042D: iconst_5
		// @042E: bipush 67 (0x43)
		// @0430: iastore
		// @0431: dup
		// @0432: bipush 6 (0x06)
		// @0434: bipush 25 (0x19)
		// @0436: iastore
		// @0437: dup
		// @0438: bipush 7 (0x07)
		// @043A: bipush 25 (0x19)
		// @043C: iastore
		// @043D: dup
		// @043E: bipush 8 (0x08)
		// @0440: bipush 66 (0x42)
		// @0442: iastore
		// @0443: dup
		// @0444: bipush 9 (0x09)
		// @0446: bipush 32 (0x20)
		// @0448: iastore
		// @0449: dup
		// @044A: bipush 10 (0x0A)
		// @044C: iconst_1
		// @044D: iastore
		// @044E: dup
		// @044F: bipush 11 (0x0B)
		// @0451: bipush 6 (0x06)
		// @0453: iastore
		// @0454: dup
		// @0455: bipush 12 (0x0C)
		// @0457: bipush 6 (0x06)
		// @0459: iastore
		// @045A: dup
		// @045B: bipush 13 (0x0D)
		// @045D: bipush 11 (0x0B)
		// @045F: iastore
		// @0460: dup
		// @0461: bipush 14 (0x0E)
		// @0463: bipush 18 (0x12)
		// @0465: iastore
		// @0466: dup
		// @0467: bipush 15 (0x0F)
		// @0469: iconst_m1
		// @046A: iastore
		// @046B: dup
		// @046C: bipush 16 (0x10)
		// @046E: iconst_m1
		// @046F: iastore
		// @0470: dup
		// @0471: bipush 17 (0x11)
		// @0473: iconst_m1
		// @0474: iastore
		// @0475: putstatic int[] game.C_100005_fk.field_103602_h
		// @0478: bipush 19 (0x13)
		// @047A: newarray int[]
		// @047C: dup
		// @047D: iconst_0
		// @047E: bipush 62 (0x3E)
		// @0480: iastore
		// @0481: dup
		// @0482: iconst_1
		// @0483: bipush 61 (0x3D)
		// @0485: iastore
		// @0486: dup
		// @0487: iconst_2
		// @0488: bipush 20 (0x14)
		// @048A: iastore
		// @048B: dup
		// @048C: iconst_3
		// @048D: iconst_3
		// @048E: iastore
		// @048F: dup
		// @0490: iconst_4
		// @0491: bipush 24 (0x18)
		// @0493: iastore
		// @0494: dup
		// @0495: iconst_5
		// @0496: bipush 24 (0x18)
		// @0498: iastore
		// @0499: dup
		// @049A: bipush 6 (0x06)
		// @049C: bipush 24 (0x18)
		// @049E: iastore
		// @049F: dup
		// @04A0: bipush 7 (0x07)
		// @04A2: bipush 20 (0x14)
		// @04A4: iastore
		// @04A5: dup
		// @04A6: bipush 8 (0x08)
		// @04A8: bipush 37 (0x25)
		// @04AA: iastore
		// @04AB: dup
		// @04AC: bipush 9 (0x09)
		// @04AE: bipush 37 (0x25)
		// @04B0: iastore
		// @04B1: dup
		// @04B2: bipush 10 (0x0A)
		// @04B4: bipush 31 (0x1F)
		// @04B6: iastore
		// @04B7: dup
		// @04B8: bipush 11 (0x0B)
		// @04BA: iconst_1
		// @04BB: iastore
		// @04BC: dup
		// @04BD: bipush 12 (0x0C)
		// @04BF: bipush 6 (0x06)
		// @04C1: iastore
		// @04C2: dup
		// @04C3: bipush 13 (0x0D)
		// @04C5: bipush 22 (0x16)
		// @04C7: iastore
		// @04C8: dup
		// @04C9: bipush 14 (0x0E)
		// @04CB: bipush 33 (0x21)
		// @04CD: iastore
		// @04CE: dup
		// @04CF: bipush 15 (0x0F)
		// @04D1: bipush 21 (0x15)
		// @04D3: iastore
		// @04D4: dup
		// @04D5: bipush 16 (0x10)
		// @04D7: iconst_m1
		// @04D8: iastore
		// @04D9: dup
		// @04DA: bipush 17 (0x11)
		// @04DC: iconst_m1
		// @04DD: iastore
		// @04DE: dup
		// @04DF: bipush 18 (0x12)
		// @04E1: iconst_m1
		// @04E2: iastore
		// @04E3: putstatic int[] game.C_100005_fk.field_103606_t
		// @04E6: bipush 30 (0x1E)
		// @04E8: iconst_4
		// @04E9: multianewarray int[][] (init: 2)
		// @04ED: putstatic int[][] game.C_100005_fk.field_103596_n
		// @04F0: iconst_0
		// @04F1: sipush 8000 (0x1F40)
		// @04F4: bipush 19 (0x13)
		// @04F6: newarray int[]
		// @04F8: dup
		// @04F9: iconst_0
		// @04FA: bipush 55 (0x37)
		// @04FC: iastore
		// @04FD: dup
		// @04FE: iconst_1
		// @04FF: bipush 53 (0x35)
		// @0501: iastore
		// @0502: dup
		// @0503: iconst_2
		// @0504: iconst_m1
		// @0505: iastore
		// @0506: dup
		// @0507: iconst_3
		// @0508: iconst_m1
		// @0509: iastore
		// @050A: dup
		// @050B: iconst_4
		// @050C: iconst_m1
		// @050D: iastore
		// @050E: dup
		// @050F: iconst_5
		// @0510: iconst_m1
		// @0511: iastore
		// @0512: dup
		// @0513: bipush 6 (0x06)
		// @0515: iconst_m1
		// @0516: iastore
		// @0517: dup
		// @0518: bipush 7 (0x07)
		// @051A: bipush 56 (0x38)
		// @051C: iastore
		// @051D: dup
		// @051E: bipush 8 (0x08)
		// @0520: bipush 29 (0x1D)
		// @0522: iastore
		// @0523: dup
		// @0524: bipush 9 (0x09)
		// @0526: bipush 29 (0x1D)
		// @0528: iastore
		// @0529: dup
		// @052A: bipush 10 (0x0A)
		// @052C: bipush 97 (0x61)
		// @052E: iastore
		// @052F: dup
		// @0530: bipush 11 (0x0B)
		// @0532: bipush 17 (0x11)
		// @0534: iastore
		// @0535: dup
		// @0536: bipush 12 (0x0C)
		// @0538: iconst_m1
		// @0539: iastore
		// @053A: dup
		// @053B: bipush 13 (0x0D)
		// @053D: iconst_m1
		// @053E: iastore
		// @053F: dup
		// @0540: bipush 14 (0x0E)
		// @0542: iconst_m1
		// @0543: iastore
		// @0544: dup
		// @0545: bipush 15 (0x0F)
		// @0547: iconst_m1
		// @0548: iastore
		// @0549: dup
		// @054A: bipush 16 (0x10)
		// @054C: iconst_m1
		// @054D: iastore
		// @054E: dup
		// @054F: bipush 17 (0x11)
		// @0551: iconst_m1
		// @0552: iastore
		// @0553: dup
		// @0554: bipush 18 (0x12)
		// @0556: iconst_m1
		// @0557: iastore
		// @0558: iconst_3
		// @0559: anewarray int[]
		// @055C: dup
		// @055D: iconst_0
		// @055E: iconst_1
		// @055F: newarray int[]
		// @0561: dup
		// @0562: iconst_0
		// @0563: iconst_1
		// @0564: iastore
		// @0565: aastore
		// @0566: dup
		// @0567: iconst_1
		// @0568: iconst_1
		// @0569: newarray int[]
		// @056B: dup
		// @056C: iconst_0
		// @056D: iconst_1
		// @056E: iastore
		// @056F: aastore
		// @0570: dup
		// @0571: iconst_2
		// @0572: iconst_2
		// @0573: newarray int[]
		// @0575: dup
		// @0576: iconst_0
		// @0577: iconst_1
		// @0578: iastore
		// @0579: dup
		// @057A: iconst_1
		// @057B: iconst_1
		// @057C: iastore
		// @057D: aastore
		// @057E: iconst_0
		// @057F: iconst_m1
		// @0580: bipush 126 (0x7E)
		// @0582: invokestatic game.C_100051_ea.func_103304_a(int, int, int[], int[][], int, int, byte)void
		// @0585: iconst_0
		// @0586: sipush 8000 (0x1F40)
		// @0589: bipush 26 (0x1A)
		// @058B: newarray int[]
		// @058D: dup
		// @058E: iconst_0
		// @058F: bipush 55 (0x37)
		// @0591: iastore
		// @0592: dup
		// @0593: iconst_1
		// @0594: bipush 53 (0x35)
		// @0596: iastore
		// @0597: dup
		// @0598: iconst_2
		// @0599: bipush 18 (0x12)
		// @059B: iastore
		// @059C: dup
		// @059D: iconst_3
		// @059E: bipush 24 (0x18)
		// @05A0: iastore
		// @05A1: dup
		// @05A2: iconst_4
		// @05A3: bipush 24 (0x18)
		// @05A5: iastore
		// @05A6: dup
		// @05A7: iconst_5
		// @05A8: bipush 24 (0x18)
		// @05AA: iastore
		// @05AB: dup
		// @05AC: bipush 6 (0x06)
		// @05AE: bipush 54 (0x36)
		// @05B0: iastore
		// @05B1: dup
		// @05B2: bipush 7 (0x07)
		// @05B4: bipush 83 (0x53)
		// @05B6: iastore
		// @05B7: dup
		// @05B8: bipush 8 (0x08)
		// @05BA: bipush 24 (0x18)
		// @05BC: iastore
		// @05BD: dup
		// @05BE: bipush 9 (0x09)
		// @05C0: bipush 24 (0x18)
		// @05C2: iastore
		// @05C3: dup
		// @05C4: bipush 10 (0x0A)
		// @05C6: bipush 56 (0x38)
		// @05C8: iastore
		// @05C9: dup
		// @05CA: bipush 11 (0x0B)
		// @05CC: bipush 83 (0x53)
		// @05CE: iastore
		// @05CF: dup
		// @05D0: bipush 12 (0x0C)
		// @05D2: bipush 24 (0x18)
		// @05D4: iastore
		// @05D5: dup
		// @05D6: bipush 13 (0x0D)
		// @05D8: bipush 24 (0x18)
		// @05DA: iastore
		// @05DB: dup
		// @05DC: bipush 14 (0x0E)
		// @05DE: bipush 83 (0x53)
		// @05E0: iastore
		// @05E1: dup
		// @05E2: bipush 15 (0x0F)
		// @05E4: bipush 24 (0x18)
		// @05E6: iastore
		// @05E7: dup
		// @05E8: bipush 16 (0x10)
		// @05EA: bipush 24 (0x18)
		// @05EC: iastore
		// @05ED: dup
		// @05EE: bipush 17 (0x11)
		// @05F0: bipush 97 (0x61)
		// @05F2: iastore
		// @05F3: dup
		// @05F4: bipush 18 (0x12)
		// @05F6: bipush 17 (0x11)
		// @05F8: iastore
		// @05F9: dup
		// @05FA: bipush 19 (0x13)
		// @05FC: iconst_m1
		// @05FD: iastore
		// @05FE: dup
		// @05FF: bipush 20 (0x14)
		// @0601: iconst_m1
		// @0602: iastore
		// @0603: dup
		// @0604: bipush 21 (0x15)
		// @0606: iconst_m1
		// @0607: iastore
		// @0608: dup
		// @0609: bipush 22 (0x16)
		// @060B: iconst_m1
		// @060C: iastore
		// @060D: dup
		// @060E: bipush 23 (0x17)
		// @0610: iconst_m1
		// @0611: iastore
		// @0612: dup
		// @0613: bipush 24 (0x18)
		// @0615: iconst_m1
		// @0616: iastore
		// @0617: dup
		// @0618: bipush 25 (0x19)
		// @061A: iconst_m1
		// @061B: iastore
		// @061C: iconst_3
		// @061D: anewarray int[]
		// @0620: dup
		// @0621: iconst_0
		// @0622: iconst_1
		// @0623: newarray int[]
		// @0625: dup
		// @0626: iconst_0
		// @0627: iconst_3
		// @0628: iastore
		// @0629: aastore
		// @062A: dup
		// @062B: iconst_1
		// @062C: iconst_1
		// @062D: newarray int[]
		// @062F: dup
		// @0630: iconst_0
		// @0631: iconst_3
		// @0632: iastore
		// @0633: aastore
		// @0634: dup
		// @0635: iconst_2
		// @0636: iconst_2
		// @0637: newarray int[]
		// @0639: dup
		// @063A: iconst_0
		// @063B: iconst_3
		// @063C: iastore
		// @063D: dup
		// @063E: iconst_1
		// @063F: iconst_3
		// @0640: iastore
		// @0641: aastore
		// @0642: iconst_0
		// @0643: iconst_m1
		// @0644: bipush 127 (0x7F)
		// @0646: invokestatic game.C_100051_ea.func_103304_a(int, int, int[], int[][], int, int, byte)void
		// @0649: iconst_0
		// @064A: sipush 8000 (0x1F40)
		// @064D: getstatic int[] game.C_100005_fk.field_103605_u
		// @0650: iconst_4
		// @0651: anewarray int[]
		// @0654: dup
		// @0655: iconst_0
		// @0656: iconst_2
		// @0657: newarray int[]
		// @0659: dup
		// @065A: iconst_0
		// @065B: iconst_1
		// @065C: iastore
		// @065D: dup
		// @065E: iconst_1
		// @065F: iconst_1
		// @0660: iastore
		// @0661: aastore
		// @0662: dup
		// @0663: iconst_1
		// @0664: iconst_2
		// @0665: newarray int[]
		// @0667: dup
		// @0668: iconst_0
		// @0669: bipush 8 (0x08)
		// @066B: iastore
		// @066C: dup
		// @066D: iconst_1
		// @066E: bipush 8 (0x08)
		// @0670: iastore
		// @0671: aastore
		// @0672: dup
		// @0673: iconst_2
		// @0674: iconst_3
		// @0675: newarray int[]
		// @0677: dup
		// @0678: iconst_0
		// @0679: iconst_1
		// @067A: iastore
		// @067B: dup
		// @067C: iconst_1
		// @067D: iconst_0
		// @067E: iastore
		// @067F: dup
		// @0680: iconst_2
		// @0681: bipush 8 (0x08)
		// @0683: iastore
		// @0684: aastore
		// @0685: dup
		// @0686: iconst_3
		// @0687: iconst_1
		// @0688: newarray int[]
		// @068A: dup
		// @068B: iconst_0
		// @068C: bipush 9 (0x09)
		// @068E: iastore
		// @068F: aastore
		// @0690: iconst_0
		// @0691: iconst_5
		// @0692: bipush 126 (0x7E)
		// @0694: invokestatic game.C_100051_ea.func_103304_a(int, int, int[], int[][], int, int, byte)void
		// @0697: iconst_0
		// @0698: sipush 8000 (0x1F40)
		// @069B: bipush 19 (0x13)
		// @069D: newarray int[]
		// @069F: dup
		// @06A0: iconst_0
		// @06A1: bipush 57 (0x39)
		// @06A3: iastore
		// @06A4: dup
		// @06A5: iconst_1
		// @06A6: bipush 98 (0x62)
		// @06A8: iastore
		// @06A9: dup
		// @06AA: iconst_2
		// @06AB: bipush 21 (0x15)
		// @06AD: iastore
		// @06AE: dup
		// @06AF: iconst_3
		// @06B0: iconst_m1
		// @06B1: iastore
		// @06B2: dup
		// @06B3: iconst_4
		// @06B4: iconst_m1
		// @06B5: iastore
		// @06B6: dup
		// @06B7: iconst_5
		// @06B8: bipush 60 (0x3C)
		// @06BA: iastore
		// @06BB: dup
		// @06BC: bipush 6 (0x06)
		// @06BE: bipush 58 (0x3A)
		// @06C0: iastore
		// @06C1: dup
		// @06C2: bipush 7 (0x07)
		// @06C4: bipush 21 (0x15)
		// @06C6: iastore
		// @06C7: dup
		// @06C8: bipush 8 (0x08)
		// @06CA: iconst_m1
		// @06CB: iastore
		// @06CC: dup
		// @06CD: bipush 9 (0x09)
		// @06CF: iconst_m1
		// @06D0: iastore
		// @06D1: dup
		// @06D2: bipush 10 (0x0A)
		// @06D4: bipush 59 (0x3B)
		// @06D6: iastore
		// @06D7: dup
		// @06D8: bipush 11 (0x0B)
		// @06DA: iconst_0
		// @06DB: iastore
		// @06DC: dup
		// @06DD: bipush 12 (0x0C)
		// @06DF: iconst_5
		// @06E0: iastore
		// @06E1: dup
		// @06E2: bipush 13 (0x0D)
		// @06E4: iconst_m1
		// @06E5: iastore
		// @06E6: dup
		// @06E7: bipush 14 (0x0E)
		// @06E9: iconst_m1
		// @06EA: iastore
		// @06EB: dup
		// @06EC: bipush 15 (0x0F)
		// @06EE: iconst_m1
		// @06EF: iastore
		// @06F0: dup
		// @06F1: bipush 16 (0x10)
		// @06F3: iconst_m1
		// @06F4: iastore
		// @06F5: dup
		// @06F6: bipush 17 (0x11)
		// @06F8: iconst_m1
		// @06F9: iastore
		// @06FA: dup
		// @06FB: bipush 18 (0x12)
		// @06FD: iconst_m1
		// @06FE: iastore
		// @06FF: iconst_1
		// @0700: anewarray int[]
		// @0703: dup
		// @0704: iconst_0
		// @0705: iconst_0
		// @0706: newarray int[]
		// @0708: aastore
		// @0709: iconst_0
		// @070A: iconst_m1
		// @070B: bipush 127 (0x7F)
		// @070D: invokestatic game.C_100051_ea.func_103304_a(int, int, int[], int[][], int, int, byte)void
		// @0710: iconst_0
		// @0711: sipush 8000 (0x1F40)
		// @0714: bipush 19 (0x13)
		// @0716: newarray int[]
		// @0718: dup
		// @0719: iconst_0
		// @071A: bipush 57 (0x39)
		// @071C: iastore
		// @071D: dup
		// @071E: iconst_1
		// @071F: bipush 98 (0x62)
		// @0721: iastore
		// @0722: dup
		// @0723: iconst_2
		// @0724: bipush 21 (0x15)
		// @0726: iastore
		// @0727: dup
		// @0728: iconst_3
		// @0729: iconst_m1
		// @072A: iastore
		// @072B: dup
		// @072C: iconst_4
		// @072D: iconst_m1
		// @072E: iastore
		// @072F: dup
		// @0730: iconst_5
		// @0731: bipush 60 (0x3C)
		// @0733: iastore
		// @0734: dup
		// @0735: bipush 6 (0x06)
		// @0737: bipush 58 (0x3A)
		// @0739: iastore
		// @073A: dup
		// @073B: bipush 7 (0x07)
		// @073D: bipush 21 (0x15)
		// @073F: iastore
		// @0740: dup
		// @0741: bipush 8 (0x08)
		// @0743: iconst_m1
		// @0744: iastore
		// @0745: dup
		// @0746: bipush 9 (0x09)
		// @0748: iconst_m1
		// @0749: iastore
		// @074A: dup
		// @074B: bipush 10 (0x0A)
		// @074D: bipush 59 (0x3B)
		// @074F: iastore
		// @0750: dup
		// @0751: bipush 11 (0x0B)
		// @0753: iconst_0
		// @0754: iastore
		// @0755: dup
		// @0756: bipush 12 (0x0C)
		// @0758: iconst_5
		// @0759: iastore
		// @075A: dup
		// @075B: bipush 13 (0x0D)
		// @075D: iconst_m1
		// @075E: iastore
		// @075F: dup
		// @0760: bipush 14 (0x0E)
		// @0762: iconst_m1
		// @0763: iastore
		// @0764: dup
		// @0765: bipush 15 (0x0F)
		// @0767: iconst_m1
		// @0768: iastore
		// @0769: dup
		// @076A: bipush 16 (0x10)
		// @076C: iconst_m1
		// @076D: iastore
		// @076E: dup
		// @076F: bipush 17 (0x11)
		// @0771: iconst_m1
		// @0772: iastore
		// @0773: dup
		// @0774: bipush 18 (0x12)
		// @0776: iconst_m1
		// @0777: iastore
		// @0778: iconst_5
		// @0779: anewarray int[]
		// @077C: dup
		// @077D: iconst_0
		// @077E: iconst_3
		// @077F: newarray int[]
		// @0781: dup
		// @0782: iconst_0
		// @0783: iconst_1
		// @0784: iastore
		// @0785: dup
		// @0786: iconst_1
		// @0787: iconst_1
		// @0788: iastore
		// @0789: dup
		// @078A: iconst_2
		// @078B: iconst_1
		// @078C: iastore
		// @078D: aastore
		// @078E: dup
		// @078F: iconst_1
		// @0790: iconst_3
		// @0791: newarray int[]
		// @0793: dup
		// @0794: iconst_0
		// @0795: bipush 8 (0x08)
		// @0797: iastore
		// @0798: dup
		// @0799: iconst_1
		// @079A: iconst_1
		// @079B: iastore
		// @079C: dup
		// @079D: iconst_2
		// @079E: iconst_1
		// @079F: iastore
		// @07A0: aastore
		// @07A1: dup
		// @07A2: iconst_2
		// @07A3: iconst_3
		// @07A4: newarray int[]
		// @07A6: dup
		// @07A7: iconst_0
		// @07A8: iconst_0
		// @07A9: iastore
		// @07AA: dup
		// @07AB: iconst_1
		// @07AC: iconst_1
		// @07AD: iastore
		// @07AE: dup
		// @07AF: iconst_2
		// @07B0: iconst_1
		// @07B1: iastore
		// @07B2: aastore
		// @07B3: dup
		// @07B4: iconst_3
		// @07B5: iconst_3
		// @07B6: newarray int[]
		// @07B8: dup
		// @07B9: iconst_0
		// @07BA: iconst_0
		// @07BB: iastore
		// @07BC: dup
		// @07BD: iconst_1
		// @07BE: bipush 8 (0x08)
		// @07C0: iastore
		// @07C1: dup
		// @07C2: iconst_2
		// @07C3: iconst_1
		// @07C4: iastore
		// @07C5: aastore
		// @07C6: dup
		// @07C7: iconst_4
		// @07C8: iconst_1
		// @07C9: newarray int[]
		// @07CB: dup
		// @07CC: iconst_0
		// @07CD: bipush 9 (0x09)
		// @07CF: iastore
		// @07D0: aastore
		// @07D1: iconst_0
		// @07D2: iconst_5
		// @07D3: bipush 126 (0x7E)
		// @07D5: invokestatic game.C_100051_ea.func_103304_a(int, int, int[], int[][], int, int, byte)void
		// @07D8: iconst_0
		// @07D9: sipush 8000 (0x1F40)
		// @07DC: getstatic int[] game.C_100005_fk.field_103607_s
		// @07DF: iconst_4
		// @07E0: anewarray int[]
		// @07E3: dup
		// @07E4: iconst_0
		// @07E5: iconst_3
		// @07E6: newarray int[]
		// @07E8: dup
		// @07E9: iconst_0
		// @07EA: iconst_1
		// @07EB: iastore
		// @07EC: dup
		// @07ED: iconst_1
		// @07EE: iconst_1
		// @07EF: iastore
		// @07F0: dup
		// @07F1: iconst_2
		// @07F2: iconst_1
		// @07F3: iastore
		// @07F4: aastore
		// @07F5: dup
		// @07F6: iconst_1
		// @07F7: iconst_3
		// @07F8: newarray int[]
		// @07FA: dup
		// @07FB: iconst_0
		// @07FC: bipush 21 (0x15)
		// @07FE: iastore
		// @07FF: dup
		// @0800: iconst_1
		// @0801: bipush 21 (0x15)
		// @0803: iastore
		// @0804: dup
		// @0805: iconst_2
		// @0806: bipush 21 (0x15)
		// @0808: iastore
		// @0809: aastore
		// @080A: dup
		// @080B: iconst_2
		// @080C: iconst_1
		// @080D: newarray int[]
		// @080F: dup
		// @0810: iconst_0
		// @0811: bipush 9 (0x09)
		// @0813: iastore
		// @0814: aastore
		// @0815: dup
		// @0816: iconst_3
		// @0817: iconst_1
		// @0818: newarray int[]
		// @081A: dup
		// @081B: iconst_0
		// @081C: bipush 8 (0x08)
		// @081E: iastore
		// @081F: aastore
		// @0820: iconst_0
		// @0821: iconst_m1
		// @0822: bipush 127 (0x7F)
		// @0824: invokestatic game.C_100051_ea.func_103304_a(int, int, int[], int[][], int, int, byte)void
		// @0827: iconst_2
		// @0828: sipush 16000 (0x3E80)
		// @082B: getstatic int[] game.C_100005_fk.field_103607_s
		// @082E: iconst_5
		// @082F: anewarray int[]
		// @0832: dup
		// @0833: iconst_0
		// @0834: iconst_2
		// @0835: newarray int[]
		// @0837: dup
		// @0838: iconst_0
		// @0839: bipush 9 (0x09)
		// @083B: iastore
		// @083C: dup
		// @083D: iconst_1
		// @083E: bipush 8 (0x08)
		// @0840: iastore
		// @0841: aastore
		// @0842: dup
		// @0843: iconst_1
		// @0844: iconst_2
		// @0845: newarray int[]
		// @0847: dup
		// @0848: iconst_0
		// @0849: bipush 8 (0x08)
		// @084B: iastore
		// @084C: dup
		// @084D: iconst_1
		// @084E: bipush 8 (0x08)
		// @0850: iastore
		// @0851: aastore
		// @0852: dup
		// @0853: iconst_2
		// @0854: iconst_2
		// @0855: newarray int[]
		// @0857: dup
		// @0858: iconst_0
		// @0859: bipush 9 (0x09)
		// @085B: iastore
		// @085C: dup
		// @085D: iconst_1
		// @085E: bipush 9 (0x09)
		// @0860: iastore
		// @0861: aastore
		// @0862: dup
		// @0863: iconst_3
		// @0864: iconst_3
		// @0865: newarray int[]
		// @0867: dup
		// @0868: iconst_0
		// @0869: bipush 9 (0x09)
		// @086B: iastore
		// @086C: dup
		// @086D: iconst_1
		// @086E: bipush 8 (0x08)
		// @0870: iastore
		// @0871: dup
		// @0872: iconst_2
		// @0873: bipush 9 (0x09)
		// @0875: iastore
		// @0876: aastore
		// @0877: dup
		// @0878: iconst_4
		// @0879: iconst_1
		// @087A: newarray int[]
		// @087C: dup
		// @087D: iconst_0
		// @087E: bipush 7 (0x07)
		// @0880: iastore
		// @0881: aastore
		// @0882: sipush 258 (0x0102)
		// @0885: iconst_5
		// @0886: bipush 127 (0x7F)
		// @0888: invokestatic game.C_100051_ea.func_103304_a(int, int, int[], int[][], int, int, byte)void
		// @088B: iconst_0
		// @088C: sipush 8000 (0x1F40)
		// @088F: bipush 17 (0x11)
		// @0891: newarray int[]
		// @0893: dup
		// @0894: iconst_0
		// @0895: iconst_0
		// @0896: iastore
		// @0897: dup
		// @0898: iconst_1
		// @0899: bipush 37 (0x25)
		// @089B: iastore
		// @089C: dup
		// @089D: iconst_2
		// @089E: bipush 96 (0x60)
		// @08A0: iastore
		// @08A1: dup
		// @08A2: iconst_3
		// @08A3: iconst_m1
		// @08A4: iastore
		// @08A5: dup
		// @08A6: iconst_4
		// @08A7: iconst_1
		// @08A8: iastore
		// @08A9: dup
		// @08AA: iconst_5
		// @08AB: iconst_m1
		// @08AC: iastore
		// @08AD: dup
		// @08AE: bipush 6 (0x06)
		// @08B0: iconst_m1
		// @08B1: iastore
		// @08B2: dup
		// @08B3: bipush 7 (0x07)
		// @08B5: iconst_2
		// @08B6: iastore
		// @08B7: dup
		// @08B8: bipush 8 (0x08)
		// @08BA: bipush 30 (0x1E)
		// @08BC: iastore
		// @08BD: dup
		// @08BE: bipush 9 (0x09)
		// @08C0: iconst_0
		// @08C1: iastore
		// @08C2: dup
		// @08C3: bipush 10 (0x0A)
		// @08C5: bipush 21 (0x15)
		// @08C7: iastore
		// @08C8: dup
		// @08C9: bipush 11 (0x0B)
		// @08CB: bipush 10 (0x0A)
		// @08CD: iastore
		// @08CE: dup
		// @08CF: bipush 12 (0x0C)
		// @08D1: bipush 26 (0x1A)
		// @08D3: iastore
		// @08D4: dup
		// @08D5: bipush 13 (0x0D)
		// @08D7: iconst_m1
		// @08D8: iastore
		// @08D9: dup
		// @08DA: bipush 14 (0x0E)
		// @08DC: iconst_m1
		// @08DD: iastore
		// @08DE: dup
		// @08DF: bipush 15 (0x0F)
		// @08E1: iconst_m1
		// @08E2: iastore
		// @08E3: dup
		// @08E4: bipush 16 (0x10)
		// @08E6: iconst_m1
		// @08E7: iastore
		// @08E8: iconst_0
		// @08E9: anewarray int[]
		// @08EC: iconst_0
		// @08ED: iconst_m1
		// @08EE: bipush 127 (0x7F)
		// @08F0: invokestatic game.C_100051_ea.func_103304_a(int, int, int[], int[][], int, int, byte)void
		// @08F3: iconst_0
		// @08F4: sipush 8000 (0x1F40)
		// @08F7: bipush 17 (0x11)
		// @08F9: newarray int[]
		// @08FB: dup
		// @08FC: iconst_0
		// @08FD: iconst_0
		// @08FE: iastore
		// @08FF: dup
		// @0900: iconst_1
		// @0901: bipush 37 (0x25)
		// @0903: iastore
		// @0904: dup
		// @0905: iconst_2
		// @0906: bipush 96 (0x60)
		// @0908: iastore
		// @0909: dup
		// @090A: iconst_3
		// @090B: bipush 29 (0x1D)
		// @090D: iastore
		// @090E: dup
		// @090F: iconst_4
		// @0910: iconst_1
		// @0911: iastore
		// @0912: dup
		// @0913: iconst_5
		// @0914: iconst_m1
		// @0915: iastore
		// @0916: dup
		// @0917: bipush 6 (0x06)
		// @0919: iconst_m1
		// @091A: iastore
		// @091B: dup
		// @091C: bipush 7 (0x07)
		// @091E: iconst_2
		// @091F: iastore
		// @0920: dup
		// @0921: bipush 8 (0x08)
		// @0923: bipush 30 (0x1E)
		// @0925: iastore
		// @0926: dup
		// @0927: bipush 9 (0x09)
		// @0929: iconst_0
		// @092A: iastore
		// @092B: dup
		// @092C: bipush 10 (0x0A)
		// @092E: bipush 21 (0x15)
		// @0930: iastore
		// @0931: dup
		// @0932: bipush 11 (0x0B)
		// @0934: bipush 10 (0x0A)
		// @0936: iastore
		// @0937: dup
		// @0938: bipush 12 (0x0C)
		// @093A: bipush 26 (0x1A)
		// @093C: iastore
		// @093D: dup
		// @093E: bipush 13 (0x0D)
		// @0940: iconst_m1
		// @0941: iastore
		// @0942: dup
		// @0943: bipush 14 (0x0E)
		// @0945: iconst_m1
		// @0946: iastore
		// @0947: dup
		// @0948: bipush 15 (0x0F)
		// @094A: iconst_m1
		// @094B: iastore
		// @094C: dup
		// @094D: bipush 16 (0x10)
		// @094F: iconst_m1
		// @0950: iastore
		// @0951: iconst_4
		// @0952: anewarray int[]
		// @0955: dup
		// @0956: iconst_0
		// @0957: iconst_3
		// @0958: newarray int[]
		// @095A: dup
		// @095B: iconst_0
		// @095C: iconst_1
		// @095D: iastore
		// @095E: dup
		// @095F: iconst_1
		// @0960: iconst_1
		// @0961: iastore
		// @0962: dup
		// @0963: iconst_2
		// @0964: iconst_1
		// @0965: iastore
		// @0966: aastore
		// @0967: dup
		// @0968: iconst_1
		// @0969: iconst_2
		// @096A: newarray int[]
		// @096C: dup
		// @096D: iconst_0
		// @096E: bipush 8 (0x08)
		// @0970: iastore
		// @0971: dup
		// @0972: iconst_1
		// @0973: bipush 8 (0x08)
		// @0975: iastore
		// @0976: aastore
		// @0977: dup
		// @0978: iconst_2
		// @0979: iconst_3
		// @097A: newarray int[]
		// @097C: dup
		// @097D: iconst_0
		// @097E: iconst_1
		// @097F: iastore
		// @0980: dup
		// @0981: iconst_1
		// @0982: bipush 9 (0x09)
		// @0984: iastore
		// @0985: dup
		// @0986: iconst_2
		// @0987: bipush 9 (0x09)
		// @0989: iastore
		// @098A: aastore
		// @098B: dup
		// @098C: iconst_3
		// @098D: iconst_3
		// @098E: newarray int[]
		// @0990: dup
		// @0991: iconst_0
		// @0992: bipush 9 (0x09)
		// @0994: iastore
		// @0995: dup
		// @0996: iconst_1
		// @0997: bipush 8 (0x08)
		// @0999: iastore
		// @099A: dup
		// @099B: iconst_2
		// @099C: bipush 9 (0x09)
		// @099E: iastore
		// @099F: aastore
		// @09A0: iconst_0
		// @09A1: iconst_5
		// @09A2: bipush 126 (0x7E)
		// @09A4: invokestatic game.C_100051_ea.func_103304_a(int, int, int[], int[][], int, int, byte)void
		// @09A7: iconst_0
		// @09A8: sipush 8000 (0x1F40)
		// @09AB: getstatic int[] game.C_100005_fk.field_103604_v
		// @09AE: iconst_0
		// @09AF: anewarray int[]
		// @09B2: iconst_0
		// @09B3: iconst_m1
		// @09B4: bipush 126 (0x7E)
		// @09B6: invokestatic game.C_100051_ea.func_103304_a(int, int, int[], int[][], int, int, byte)void
		// @09B9: iconst_1
		// @09BA: sipush 16000 (0x3E80)
		// @09BD: getstatic int[] game.C_100005_fk.field_103605_u
		// @09C0: iconst_5
		// @09C1: anewarray int[]
		// @09C4: dup
		// @09C5: iconst_0
		// @09C6: iconst_1
		// @09C7: newarray int[]
		// @09C9: dup
		// @09CA: iconst_0
		// @09CB: bipush 9 (0x09)
		// @09CD: iastore
		// @09CE: aastore
		// @09CF: dup
		// @09D0: iconst_1
		// @09D1: iconst_3
		// @09D2: newarray int[]
		// @09D4: dup
		// @09D5: iconst_0
		// @09D6: iconst_1
		// @09D7: iastore
		// @09D8: dup
		// @09D9: iconst_1
		// @09DA: iconst_1
		// @09DB: iastore
		// @09DC: dup
		// @09DD: iconst_2
		// @09DE: iconst_1
		// @09DF: iastore
		// @09E0: aastore
		// @09E1: dup
		// @09E2: iconst_2
		// @09E3: iconst_1
		// @09E4: newarray int[]
		// @09E6: dup
		// @09E7: iconst_0
		// @09E8: bipush 7 (0x07)
		// @09EA: iastore
		// @09EB: aastore
		// @09EC: dup
		// @09ED: iconst_3
		// @09EE: iconst_2
		// @09EF: newarray int[]
		// @09F1: dup
		// @09F2: iconst_0
		// @09F3: bipush 8 (0x08)
		// @09F5: iastore
		// @09F6: dup
		// @09F7: iconst_1
		// @09F8: bipush 8 (0x08)
		// @09FA: iastore
		// @09FB: aastore
		// @09FC: dup
		// @09FD: iconst_4
		// @09FE: bipush 6 (0x06)
		// @0A00: newarray int[]
		// @0A02: dup
		// @0A03: iconst_0
		// @0A04: iconst_1
		// @0A05: iastore
		// @0A06: dup
		// @0A07: iconst_1
		// @0A08: iconst_1
		// @0A09: iastore
		// @0A0A: dup
		// @0A0B: iconst_2
		// @0A0C: iconst_0
		// @0A0D: iastore
		// @0A0E: dup
		// @0A0F: iconst_3
		// @0A10: iconst_0
		// @0A11: iastore
		// @0A12: dup
		// @0A13: iconst_4
		// @0A14: iconst_1
		// @0A15: iastore
		// @0A16: dup
		// @0A17: iconst_5
		// @0A18: iconst_1
		// @0A19: iastore
		// @0A1A: aastore
		// @0A1B: iconst_1
		// @0A1C: iconst_5
		// @0A1D: bipush 126 (0x7E)
		// @0A1F: invokestatic game.C_100051_ea.func_103304_a(int, int, int[], int[][], int, int, byte)void
		// @0A22: iconst_1
		// @0A23: sipush 16000 (0x3E80)
		// @0A26: getstatic int[] game.C_100005_fk.field_103607_s
		// @0A29: iconst_5
		// @0A2A: anewarray int[]
		// @0A2D: dup
		// @0A2E: iconst_0
		// @0A2F: iconst_3
		// @0A30: newarray int[]
		// @0A32: dup
		// @0A33: iconst_0
		// @0A34: iconst_3
		// @0A35: iastore
		// @0A36: dup
		// @0A37: iconst_1
		// @0A38: iconst_3
		// @0A39: iastore
		// @0A3A: dup
		// @0A3B: iconst_2
		// @0A3C: iconst_3
		// @0A3D: iastore
		// @0A3E: aastore
		// @0A3F: dup
		// @0A40: iconst_1
		// @0A41: iconst_1
		// @0A42: newarray int[]
		// @0A44: dup
		// @0A45: iconst_0
		// @0A46: bipush 7 (0x07)
		// @0A48: iastore
		// @0A49: aastore
		// @0A4A: dup
		// @0A4B: iconst_2
		// @0A4C: iconst_1
		// @0A4D: newarray int[]
		// @0A4F: dup
		// @0A50: iconst_0
		// @0A51: bipush 7 (0x07)
		// @0A53: iastore
		// @0A54: aastore
		// @0A55: dup
		// @0A56: iconst_3
		// @0A57: iconst_1
		// @0A58: newarray int[]
		// @0A5A: dup
		// @0A5B: iconst_0
		// @0A5C: bipush 10 (0x0A)
		// @0A5E: iastore
		// @0A5F: aastore
		// @0A60: dup
		// @0A61: iconst_4
		// @0A62: iconst_3
		// @0A63: newarray int[]
		// @0A65: dup
		// @0A66: iconst_0
		// @0A67: bipush 8 (0x08)
		// @0A69: iastore
		// @0A6A: dup
		// @0A6B: iconst_1
		// @0A6C: bipush 10 (0x0A)
		// @0A6E: iastore
		// @0A6F: dup
		// @0A70: iconst_2
		// @0A71: bipush 8 (0x08)
		// @0A73: iastore
		// @0A74: aastore
		// @0A75: bipush 17 (0x11)
		// @0A77: iconst_5
		// @0A78: bipush 127 (0x7F)
		// @0A7A: invokestatic game.C_100051_ea.func_103304_a(int, int, int[], int[][], int, int, byte)void
		// @0A7D: iconst_1
		// @0A7E: sipush 16000 (0x3E80)
		// @0A81: bipush 16 (0x10)
		// @0A83: newarray int[]
		// @0A85: dup
		// @0A86: iconst_0
		// @0A87: bipush 62 (0x3E)
		// @0A89: iastore
		// @0A8A: dup
		// @0A8B: iconst_1
		// @0A8C: bipush 61 (0x3D)
		// @0A8E: iastore
		// @0A8F: dup
		// @0A90: iconst_2
		// @0A91: iconst_m1
		// @0A92: iastore
		// @0A93: dup
		// @0A94: iconst_3
		// @0A95: iconst_m1
		// @0A96: iastore
		// @0A97: dup
		// @0A98: iconst_4
		// @0A99: iconst_m1
		// @0A9A: iastore
		// @0A9B: dup
		// @0A9C: iconst_5
		// @0A9D: bipush 37 (0x25)
		// @0A9F: iastore
		// @0AA0: dup
		// @0AA1: bipush 6 (0x06)
		// @0AA3: bipush 37 (0x25)
		// @0AA5: iastore
		// @0AA6: dup
		// @0AA7: bipush 7 (0x07)
		// @0AA9: bipush 31 (0x1F)
		// @0AAB: iastore
		// @0AAC: dup
		// @0AAD: bipush 8 (0x08)
		// @0AAF: iconst_1
		// @0AB0: iastore
		// @0AB1: dup
		// @0AB2: bipush 9 (0x09)
		// @0AB4: bipush 6 (0x06)
		// @0AB6: iastore
		// @0AB7: dup
		// @0AB8: bipush 10 (0x0A)
		// @0ABA: bipush 22 (0x16)
		// @0ABC: iastore
		// @0ABD: dup
		// @0ABE: bipush 11 (0x0B)
		// @0AC0: bipush 33 (0x21)
		// @0AC2: iastore
		// @0AC3: dup
		// @0AC4: bipush 12 (0x0C)
		// @0AC6: iconst_m1
		// @0AC7: iastore
		// @0AC8: dup
		// @0AC9: bipush 13 (0x0D)
		// @0ACB: iconst_m1
		// @0ACC: iastore
		// @0ACD: dup
		// @0ACE: bipush 14 (0x0E)
		// @0AD0: iconst_m1
		// @0AD1: iastore
		// @0AD2: dup
		// @0AD3: bipush 15 (0x0F)
		// @0AD5: iconst_m1
		// @0AD6: iastore
		// @0AD7: iconst_4
		// @0AD8: anewarray int[]
		// @0ADB: dup
		// @0ADC: iconst_0
		// @0ADD: iconst_4
		// @0ADE: newarray int[]
		// @0AE0: dup
		// @0AE1: iconst_0
		// @0AE2: iconst_1
		// @0AE3: iastore
		// @0AE4: dup
		// @0AE5: iconst_1
		// @0AE6: iconst_1
		// @0AE7: iastore
		// @0AE8: dup
		// @0AE9: iconst_2
		// @0AEA: iconst_1
		// @0AEB: iastore
		// @0AEC: dup
		// @0AED: iconst_3
		// @0AEE: iconst_1
		// @0AEF: iastore
		// @0AF0: aastore
		// @0AF1: dup
		// @0AF2: iconst_1
		// @0AF3: iconst_2
		// @0AF4: newarray int[]
		// @0AF6: dup
		// @0AF7: iconst_0
		// @0AF8: bipush 7 (0x07)
		// @0AFA: iastore
		// @0AFB: dup
		// @0AFC: iconst_1
		// @0AFD: iconst_5
		// @0AFE: iastore
		// @0AFF: aastore
		// @0B00: dup
		// @0B01: iconst_2
		// @0B02: iconst_2
		// @0B03: newarray int[]
		// @0B05: dup
		// @0B06: iconst_0
		// @0B07: bipush 9 (0x09)
		// @0B09: iastore
		// @0B0A: dup
		// @0B0B: iconst_1
		// @0B0C: bipush 9 (0x09)
		// @0B0E: iastore
		// @0B0F: aastore
		// @0B10: dup
		// @0B11: iconst_3
		// @0B12: iconst_4
		// @0B13: newarray int[]
		// @0B15: dup
		// @0B16: iconst_0
		// @0B17: bipush 7 (0x07)
		// @0B19: iastore
		// @0B1A: dup
		// @0B1B: iconst_1
		// @0B1C: iconst_5
		// @0B1D: iastore
		// @0B1E: dup
		// @0B1F: iconst_2
		// @0B20: iconst_5
		// @0B21: iastore
		// @0B22: dup
		// @0B23: iconst_3
		// @0B24: iconst_5
		// @0B25: iastore
		// @0B26: aastore
		// @0B27: bipush 33 (0x21)
		// @0B29: iconst_5
		// @0B2A: bipush 127 (0x7F)
		// @0B2C: invokestatic game.C_100051_ea.func_103304_a(int, int, int[], int[][], int, int, byte)void
		// @0B2F: iconst_1
		// @0B30: sipush 16000 (0x3E80)
		// @0B33: getstatic int[] game.C_100005_fk.field_103606_t
		// @0B36: iconst_4
		// @0B37: anewarray int[]
		// @0B3A: dup
		// @0B3B: iconst_0
		// @0B3C: iconst_3
		// @0B3D: newarray int[]
		// @0B3F: dup
		// @0B40: iconst_0
		// @0B41: iconst_2
		// @0B42: iastore
		// @0B43: dup
		// @0B44: iconst_1
		// @0B45: bipush 9 (0x09)
		// @0B47: iastore
		// @0B48: dup
		// @0B49: iconst_2
		// @0B4A: iconst_2
		// @0B4B: iastore
		// @0B4C: aastore
		// @0B4D: dup
		// @0B4E: iconst_1
		// @0B4F: iconst_2
		// @0B50: newarray int[]
		// @0B52: dup
		// @0B53: iconst_0
		// @0B54: bipush 7 (0x07)
		// @0B56: iastore
		// @0B57: dup
		// @0B58: iconst_1
		// @0B59: bipush 8 (0x08)
		// @0B5B: iastore
		// @0B5C: aastore
		// @0B5D: dup
		// @0B5E: iconst_2
		// @0B5F: iconst_3
		// @0B60: newarray int[]
		// @0B62: dup
		// @0B63: iconst_0
		// @0B64: bipush 8 (0x08)
		// @0B66: iastore
		// @0B67: dup
		// @0B68: iconst_1
		// @0B69: iconst_0
		// @0B6A: iastore
		// @0B6B: dup
		// @0B6C: iconst_2
		// @0B6D: bipush 7 (0x07)
		// @0B6F: iastore
		// @0B70: aastore
		// @0B71: dup
		// @0B72: iconst_3
		// @0B73: iconst_1
		// @0B74: newarray int[]
		// @0B76: dup
		// @0B77: iconst_0
		// @0B78: bipush 10 (0x0A)
		// @0B7A: iastore
		// @0B7B: aastore
		// @0B7C: bipush 49 (0x31)
		// @0B7E: iconst_5
		// @0B7F: bipush 126 (0x7E)
		// @0B81: invokestatic game.C_100051_ea.func_103304_a(int, int, int[], int[][], int, int, byte)void
		// @0B84: iconst_0
		// @0B85: sipush 16000 (0x3E80)
		// @0B88: getstatic int[] game.C_100005_fk.field_103605_u
		// @0B8B: iconst_5
		// @0B8C: anewarray int[]
		// @0B8F: dup
		// @0B90: iconst_0
		// @0B91: iconst_1
		// @0B92: newarray int[]
		// @0B94: dup
		// @0B95: iconst_0
		// @0B96: bipush 7 (0x07)
		// @0B98: iastore
		// @0B99: aastore
		// @0B9A: dup
		// @0B9B: iconst_1
		// @0B9C: iconst_2
		// @0B9D: newarray int[]
		// @0B9F: dup
		// @0BA0: iconst_0
		// @0BA1: bipush 10 (0x0A)
		// @0BA3: iastore
		// @0BA4: dup
		// @0BA5: iconst_1
		// @0BA6: bipush 10 (0x0A)
		// @0BA8: iastore
		// @0BA9: aastore
		// @0BAA: dup
		// @0BAB: iconst_2
		// @0BAC: iconst_3
		// @0BAD: newarray int[]
		// @0BAF: dup
		// @0BB0: iconst_0
		// @0BB1: bipush 9 (0x09)
		// @0BB3: iastore
		// @0BB4: dup
		// @0BB5: iconst_1
		// @0BB6: bipush 9 (0x09)
		// @0BB8: iastore
		// @0BB9: dup
		// @0BBA: iconst_2
		// @0BBB: bipush 9 (0x09)
		// @0BBD: iastore
		// @0BBE: aastore
		// @0BBF: dup
		// @0BC0: iconst_3
		// @0BC1: iconst_2
		// @0BC2: newarray int[]
		// @0BC4: dup
		// @0BC5: iconst_0
		// @0BC6: bipush 11 (0x0B)
		// @0BC8: iastore
		// @0BC9: dup
		// @0BCA: iconst_1
		// @0BCB: iconst_0
		// @0BCC: iastore
		// @0BCD: aastore
		// @0BCE: dup
		// @0BCF: iconst_4
		// @0BD0: iconst_2
		// @0BD1: newarray int[]
		// @0BD3: dup
		// @0BD4: iconst_0
		// @0BD5: bipush 11 (0x0B)
		// @0BD7: iastore
		// @0BD8: dup
		// @0BD9: iconst_1
		// @0BDA: bipush 11 (0x0B)
		// @0BDC: iastore
		// @0BDD: aastore
		// @0BDE: bipush 32 (0x20)
		// @0BE0: iconst_5
		// @0BE1: bipush 127 (0x7F)
		// @0BE3: invokestatic game.C_100051_ea.func_103304_a(int, int, int[], int[][], int, int, byte)void
		// @0BE6: iconst_0
		// @0BE7: sipush 16000 (0x3E80)
		// @0BEA: bipush 16 (0x10)
		// @0BEC: newarray int[]
		// @0BEE: dup
		// @0BEF: iconst_0
		// @0BF0: bipush 65 (0x41)
		// @0BF2: iastore
		// @0BF3: dup
		// @0BF4: iconst_1
		// @0BF5: bipush 99 (0x63)
		// @0BF7: iastore
		// @0BF8: dup
		// @0BF9: iconst_2
		// @0BFA: iconst_m1
		// @0BFB: iastore
		// @0BFC: dup
		// @0BFD: iconst_3
		// @0BFE: iconst_m1
		// @0BFF: iastore
		// @0C00: dup
		// @0C01: iconst_4
		// @0C02: bipush 64 (0x40)
		// @0C04: iastore
		// @0C05: dup
		// @0C06: iconst_5
		// @0C07: iconst_m1
		// @0C08: iastore
		// @0C09: dup
		// @0C0A: bipush 6 (0x06)
		// @0C0C: bipush 66 (0x42)
		// @0C0E: iastore
		// @0C0F: dup
		// @0C10: bipush 7 (0x07)
		// @0C12: bipush 32 (0x20)
		// @0C14: iastore
		// @0C15: dup
		// @0C16: bipush 8 (0x08)
		// @0C18: iconst_1
		// @0C19: iastore
		// @0C1A: dup
		// @0C1B: bipush 9 (0x09)
		// @0C1D: bipush 6 (0x06)
		// @0C1F: iastore
		// @0C20: dup
		// @0C21: bipush 10 (0x0A)
		// @0C23: bipush 11 (0x0B)
		// @0C25: iastore
		// @0C26: dup
		// @0C27: bipush 11 (0x0B)
		// @0C29: bipush 18 (0x12)
		// @0C2B: iastore
		// @0C2C: dup
		// @0C2D: bipush 12 (0x0C)
		// @0C2F: iconst_m1
		// @0C30: iastore
		// @0C31: dup
		// @0C32: bipush 13 (0x0D)
		// @0C34: iconst_m1
		// @0C35: iastore
		// @0C36: dup
		// @0C37: bipush 14 (0x0E)
		// @0C39: iconst_m1
		// @0C3A: iastore
		// @0C3B: dup
		// @0C3C: bipush 15 (0x0F)
		// @0C3E: iconst_m1
		// @0C3F: iastore
		// @0C40: iconst_4
		// @0C41: anewarray int[]
		// @0C44: dup
		// @0C45: iconst_0
		// @0C46: iconst_2
		// @0C47: newarray int[]
		// @0C49: dup
		// @0C4A: iconst_0
		// @0C4B: bipush 9 (0x09)
		// @0C4D: iastore
		// @0C4E: dup
		// @0C4F: iconst_1
		// @0C50: bipush 9 (0x09)
		// @0C52: iastore
		// @0C53: aastore
		// @0C54: dup
		// @0C55: iconst_1
		// @0C56: iconst_2
		// @0C57: newarray int[]
		// @0C59: dup
		// @0C5A: iconst_0
		// @0C5B: iconst_0
		// @0C5C: iastore
		// @0C5D: dup
		// @0C5E: iconst_1
		// @0C5F: bipush 7 (0x07)
		// @0C61: iastore
		// @0C62: aastore
		// @0C63: dup
		// @0C64: iconst_2
		// @0C65: iconst_3
		// @0C66: newarray int[]
		// @0C68: dup
		// @0C69: iconst_0
		// @0C6A: bipush 20 (0x14)
		// @0C6C: iastore
		// @0C6D: dup
		// @0C6E: iconst_1
		// @0C6F: bipush 8 (0x08)
		// @0C71: iastore
		// @0C72: dup
		// @0C73: iconst_2
		// @0C74: bipush 20 (0x14)
		// @0C76: iastore
		// @0C77: aastore
		// @0C78: dup
		// @0C79: iconst_3
		// @0C7A: iconst_1
		// @0C7B: newarray int[]
		// @0C7D: dup
		// @0C7E: iconst_0
		// @0C7F: bipush 11 (0x0B)
		// @0C81: iastore
		// @0C82: aastore
		// @0C83: bipush 48 (0x30)
		// @0C85: iconst_5
		// @0C86: bipush 126 (0x7E)
		// @0C88: invokestatic game.C_100051_ea.func_103304_a(int, int, int[], int[][], int, int, byte)void
		// @0C8B: iconst_1
		// @0C8C: sipush 16000 (0x3E80)
		// @0C8F: getstatic int[] game.C_100005_fk.field_103602_h
		// @0C92: bipush 6 (0x06)
		// @0C94: anewarray int[]
		// @0C97: dup
		// @0C98: iconst_0
		// @0C99: iconst_3
		// @0C9A: newarray int[]
		// @0C9C: dup
		// @0C9D: iconst_0
		// @0C9E: bipush 9 (0x09)
		// @0CA0: iastore
		// @0CA1: dup
		// @0CA2: iconst_1
		// @0CA3: bipush 9 (0x09)
		// @0CA5: iastore
		// @0CA6: dup
		// @0CA7: iconst_2
		// @0CA8: bipush 9 (0x09)
		// @0CAA: iastore
		// @0CAB: aastore
		// @0CAC: dup
		// @0CAD: iconst_1
		// @0CAE: iconst_2
		// @0CAF: newarray int[]
		// @0CB1: dup
		// @0CB2: iconst_0
		// @0CB3: bipush 7 (0x07)
		// @0CB5: iastore
		// @0CB6: dup
		// @0CB7: iconst_1
		// @0CB8: bipush 8 (0x08)
		// @0CBA: iastore
		// @0CBB: aastore
		// @0CBC: dup
		// @0CBD: iconst_2
		// @0CBE: iconst_3
		// @0CBF: newarray int[]
		// @0CC1: dup
		// @0CC2: iconst_0
		// @0CC3: iconst_1
		// @0CC4: iastore
		// @0CC5: dup
		// @0CC6: iconst_1
		// @0CC7: iconst_1
		// @0CC8: iastore
		// @0CC9: dup
		// @0CCA: iconst_2
		// @0CCB: bipush 20 (0x14)
		// @0CCD: iastore
		// @0CCE: aastore
		// @0CCF: dup
		// @0CD0: iconst_3
		// @0CD1: iconst_1
		// @0CD2: newarray int[]
		// @0CD4: dup
		// @0CD5: iconst_0
		// @0CD6: bipush 12 (0x0C)
		// @0CD8: iastore
		// @0CD9: aastore
		// @0CDA: dup
		// @0CDB: iconst_4
		// @0CDC: iconst_3
		// @0CDD: newarray int[]
		// @0CDF: dup
		// @0CE0: iconst_0
		// @0CE1: bipush 9 (0x09)
		// @0CE3: iastore
		// @0CE4: dup
		// @0CE5: iconst_1
		// @0CE6: bipush 9 (0x09)
		// @0CE8: iastore
		// @0CE9: dup
		// @0CEA: iconst_2
		// @0CEB: bipush 9 (0x09)
		// @0CED: iastore
		// @0CEE: aastore
		// @0CEF: dup
		// @0CF0: iconst_5
		// @0CF1: iconst_2
		// @0CF2: newarray int[]
		// @0CF4: dup
		// @0CF5: iconst_0
		// @0CF6: bipush 10 (0x0A)
		// @0CF8: iastore
		// @0CF9: dup
		// @0CFA: iconst_1
		// @0CFB: bipush 10 (0x0A)
		// @0CFD: iastore
		// @0CFE: aastore
		// @0CFF: bipush 65 (0x41)
		// @0D01: iconst_5
		// @0D02: bipush 126 (0x7E)
		// @0D04: invokestatic game.C_100051_ea.func_103304_a(int, int, int[], int[][], int, int, byte)void
		// @0D07: iconst_2
		// @0D08: sipush 16000 (0x3E80)
		// @0D0B: getstatic int[] game.C_100005_fk.field_103606_t
		// @0D0E: iconst_5
		// @0D0F: anewarray int[]
		// @0D12: dup
		// @0D13: iconst_0
		// @0D14: iconst_4
		// @0D15: newarray int[]
		// @0D17: dup
		// @0D18: iconst_0
		// @0D19: bipush 9 (0x09)
		// @0D1B: iastore
		// @0D1C: dup
		// @0D1D: iconst_1
		// @0D1E: bipush 9 (0x09)
		// @0D20: iastore
		// @0D21: dup
		// @0D22: iconst_2
		// @0D23: bipush 9 (0x09)
		// @0D25: iastore
		// @0D26: dup
		// @0D27: iconst_3
		// @0D28: bipush 9 (0x09)
		// @0D2A: iastore
		// @0D2B: aastore
		// @0D2C: dup
		// @0D2D: iconst_1
		// @0D2E: iconst_2
		// @0D2F: newarray int[]
		// @0D31: dup
		// @0D32: iconst_0
		// @0D33: iconst_5
		// @0D34: iastore
		// @0D35: dup
		// @0D36: iconst_1
		// @0D37: iconst_5
		// @0D38: iastore
		// @0D39: aastore
		// @0D3A: dup
		// @0D3B: iconst_2
		// @0D3C: iconst_3
		// @0D3D: newarray int[]
		// @0D3F: dup
		// @0D40: iconst_0
		// @0D41: bipush 11 (0x0B)
		// @0D43: iastore
		// @0D44: dup
		// @0D45: iconst_1
		// @0D46: bipush 8 (0x08)
		// @0D48: iastore
		// @0D49: dup
		// @0D4A: iconst_2
		// @0D4B: bipush 8 (0x08)
		// @0D4D: iastore
		// @0D4E: aastore
		// @0D4F: dup
		// @0D50: iconst_3
		// @0D51: iconst_2
		// @0D52: newarray int[]
		// @0D54: dup
		// @0D55: iconst_0
		// @0D56: bipush 12 (0x0C)
		// @0D58: iastore
		// @0D59: dup
		// @0D5A: iconst_1
		// @0D5B: bipush 12 (0x0C)
		// @0D5D: iastore
		// @0D5E: aastore
		// @0D5F: dup
		// @0D60: iconst_4
		// @0D61: iconst_5
		// @0D62: newarray int[]
		// @0D64: dup
		// @0D65: iconst_0
		// @0D66: bipush 12 (0x0C)
		// @0D68: iastore
		// @0D69: dup
		// @0D6A: iconst_1
		// @0D6B: bipush 9 (0x09)
		// @0D6D: iastore
		// @0D6E: dup
		// @0D6F: iconst_2
		// @0D70: bipush 9 (0x09)
		// @0D72: iastore
		// @0D73: dup
		// @0D74: iconst_3
		// @0D75: bipush 9 (0x09)
		// @0D77: iastore
		// @0D78: dup
		// @0D79: iconst_4
		// @0D7A: bipush 9 (0x09)
		// @0D7C: iastore
		// @0D7D: aastore
		// @0D7E: iconst_2
		// @0D7F: iconst_3
		// @0D80: bipush 127 (0x7F)
		// @0D82: invokestatic game.C_100051_ea.func_103304_a(int, int, int[], int[][], int, int, byte)void
		// @0D85: iconst_2
		// @0D86: sipush 16000 (0x3E80)
		// @0D89: getstatic int[] game.C_100005_fk.field_103602_h
		// @0D8C: iconst_5
		// @0D8D: anewarray int[]
		// @0D90: dup
		// @0D91: iconst_0
		// @0D92: iconst_2
		// @0D93: newarray int[]
		// @0D95: dup
		// @0D96: iconst_0
		// @0D97: bipush 12 (0x0C)
		// @0D99: iastore
		// @0D9A: dup
		// @0D9B: iconst_1
		// @0D9C: bipush 12 (0x0C)
		// @0D9E: iastore
		// @0D9F: aastore
		// @0DA0: dup
		// @0DA1: iconst_1
		// @0DA2: iconst_4
		// @0DA3: newarray int[]
		// @0DA5: dup
		// @0DA6: iconst_0
		// @0DA7: bipush 9 (0x09)
		// @0DA9: iastore
		// @0DAA: dup
		// @0DAB: iconst_1
		// @0DAC: bipush 9 (0x09)
		// @0DAE: iastore
		// @0DAF: dup
		// @0DB0: iconst_2
		// @0DB1: bipush 9 (0x09)
		// @0DB3: iastore
		// @0DB4: dup
		// @0DB5: iconst_3
		// @0DB6: bipush 9 (0x09)
		// @0DB8: iastore
		// @0DB9: aastore
		// @0DBA: dup
		// @0DBB: iconst_2
		// @0DBC: iconst_3
		// @0DBD: newarray int[]
		// @0DBF: dup
		// @0DC0: iconst_0
		// @0DC1: bipush 12 (0x0C)
		// @0DC3: iastore
		// @0DC4: dup
		// @0DC5: iconst_1
		// @0DC6: bipush 7 (0x07)
		// @0DC8: iastore
		// @0DC9: dup
		// @0DCA: iconst_2
		// @0DCB: bipush 12 (0x0C)
		// @0DCD: iastore
		// @0DCE: aastore
		// @0DCF: dup
		// @0DD0: iconst_3
		// @0DD1: iconst_3
		// @0DD2: newarray int[]
		// @0DD4: dup
		// @0DD5: iconst_0
		// @0DD6: bipush 11 (0x0B)
		// @0DD8: iastore
		// @0DD9: dup
		// @0DDA: iconst_1
		// @0DDB: bipush 11 (0x0B)
		// @0DDD: iastore
		// @0DDE: dup
		// @0DDF: iconst_2
		// @0DE0: bipush 8 (0x08)
		// @0DE2: iastore
		// @0DE3: aastore
		// @0DE4: dup
		// @0DE5: iconst_4
		// @0DE6: iconst_3
		// @0DE7: newarray int[]
		// @0DE9: dup
		// @0DEA: iconst_0
		// @0DEB: bipush 12 (0x0C)
		// @0DED: iastore
		// @0DEE: dup
		// @0DEF: iconst_1
		// @0DF0: bipush 10 (0x0A)
		// @0DF2: iastore
		// @0DF3: dup
		// @0DF4: iconst_2
		// @0DF5: bipush 12 (0x0C)
		// @0DF7: iastore
		// @0DF8: aastore
		// @0DF9: bipush 18 (0x12)
		// @0DFB: iconst_3
		// @0DFC: bipush 127 (0x7F)
		// @0DFE: invokestatic game.C_100051_ea.func_103304_a(int, int, int[], int[][], int, int, byte)void
		// @0E01: iconst_2
		// @0E02: sipush 16000 (0x3E80)
		// @0E05: getstatic int[] game.C_100005_fk.field_103610_p
		// @0E08: bipush 6 (0x06)
		// @0E0A: anewarray int[]
		// @0E0D: dup
		// @0E0E: iconst_0
		// @0E0F: iconst_3
		// @0E10: newarray int[]
		// @0E12: dup
		// @0E13: iconst_0
		// @0E14: bipush 9 (0x09)
		// @0E16: iastore
		// @0E17: dup
		// @0E18: iconst_1
		// @0E19: bipush 7 (0x07)
		// @0E1B: iastore
		// @0E1C: dup
		// @0E1D: iconst_2
		// @0E1E: bipush 8 (0x08)
		// @0E20: iastore
		// @0E21: aastore
		// @0E22: dup
		// @0E23: iconst_1
		// @0E24: iconst_2
		// @0E25: newarray int[]
		// @0E27: dup
		// @0E28: iconst_0
		// @0E29: bipush 10 (0x0A)
		// @0E2B: iastore
		// @0E2C: dup
		// @0E2D: iconst_1
		// @0E2E: bipush 7 (0x07)
		// @0E30: iastore
		// @0E31: aastore
		// @0E32: dup
		// @0E33: iconst_2
		// @0E34: iconst_2
		// @0E35: newarray int[]
		// @0E37: dup
		// @0E38: iconst_0
		// @0E39: bipush 11 (0x0B)
		// @0E3B: iastore
		// @0E3C: dup
		// @0E3D: iconst_1
		// @0E3E: bipush 10 (0x0A)
		// @0E40: iastore
		// @0E41: aastore
		// @0E42: dup
		// @0E43: iconst_3
		// @0E44: iconst_2
		// @0E45: newarray int[]
		// @0E47: dup
		// @0E48: iconst_0
		// @0E49: bipush 12 (0x0C)
		// @0E4B: iastore
		// @0E4C: dup
		// @0E4D: iconst_1
		// @0E4E: bipush 11 (0x0B)
		// @0E50: iastore
		// @0E51: aastore
		// @0E52: dup
		// @0E53: iconst_4
		// @0E54: iconst_4
		// @0E55: newarray int[]
		// @0E57: dup
		// @0E58: iconst_0
		// @0E59: bipush 12 (0x0C)
		// @0E5B: iastore
		// @0E5C: dup
		// @0E5D: iconst_1
		// @0E5E: bipush 12 (0x0C)
		// @0E60: iastore
		// @0E61: dup
		// @0E62: iconst_2
		// @0E63: bipush 12 (0x0C)
		// @0E65: iastore
		// @0E66: dup
		// @0E67: iconst_3
		// @0E68: bipush 12 (0x0C)
		// @0E6A: iastore
		// @0E6B: aastore
		// @0E6C: dup
		// @0E6D: iconst_5
		// @0E6E: iconst_1
		// @0E6F: newarray int[]
		// @0E71: dup
		// @0E72: iconst_0
		// @0E73: bipush 17 (0x11)
		// @0E75: iastore
		// @0E76: aastore
		// @0E77: bipush 34 (0x22)
		// @0E79: iconst_3
		// @0E7A: bipush 126 (0x7E)
		// @0E7C: invokestatic game.C_100051_ea.func_103304_a(int, int, int[], int[][], int, int, byte)void
		// @0E7F: iconst_2
		// @0E80: sipush 16000 (0x3E80)
		// @0E83: getstatic int[] game.C_100005_fk.field_103602_h
		// @0E86: iconst_5
		// @0E87: anewarray int[]
		// @0E8A: dup
		// @0E8B: iconst_0
		// @0E8C: iconst_2
		// @0E8D: newarray int[]
		// @0E8F: dup
		// @0E90: iconst_0
		// @0E91: bipush 7 (0x07)
		// @0E93: iastore
		// @0E94: dup
		// @0E95: iconst_1
		// @0E96: bipush 8 (0x08)
		// @0E98: iastore
		// @0E99: aastore
		// @0E9A: dup
		// @0E9B: iconst_1
		// @0E9C: iconst_2
		// @0E9D: newarray int[]
		// @0E9F: dup
		// @0EA0: iconst_0
		// @0EA1: bipush 9 (0x09)
		// @0EA3: iastore
		// @0EA4: dup
		// @0EA5: iconst_1
		// @0EA6: bipush 9 (0x09)
		// @0EA8: iastore
		// @0EA9: aastore
		// @0EAA: dup
		// @0EAB: iconst_2
		// @0EAC: iconst_2
		// @0EAD: newarray int[]
		// @0EAF: dup
		// @0EB0: iconst_0
		// @0EB1: bipush 12 (0x0C)
		// @0EB3: iastore
		// @0EB4: dup
		// @0EB5: iconst_1
		// @0EB6: bipush 12 (0x0C)
		// @0EB8: iastore
		// @0EB9: aastore
		// @0EBA: dup
		// @0EBB: iconst_3
		// @0EBC: iconst_3
		// @0EBD: newarray int[]
		// @0EBF: dup
		// @0EC0: iconst_0
		// @0EC1: iconst_1
		// @0EC2: iastore
		// @0EC3: dup
		// @0EC4: iconst_1
		// @0EC5: iconst_1
		// @0EC6: iastore
		// @0EC7: dup
		// @0EC8: iconst_2
		// @0EC9: iconst_0
		// @0ECA: iastore
		// @0ECB: aastore
		// @0ECC: dup
		// @0ECD: iconst_4
		// @0ECE: iconst_2
		// @0ECF: newarray int[]
		// @0ED1: dup
		// @0ED2: iconst_0
		// @0ED3: bipush 10 (0x0A)
		// @0ED5: iastore
		// @0ED6: dup
		// @0ED7: iconst_1
		// @0ED8: bipush 10 (0x0A)
		// @0EDA: iastore
		// @0EDB: aastore
		// @0EDC: bipush 50 (0x32)
		// @0EDE: iconst_5
		// @0EDF: bipush 126 (0x7E)
		// @0EE1: invokestatic game.C_100051_ea.func_103304_a(int, int, int[], int[][], int, int, byte)void
		// @0EE4: iconst_2
		// @0EE5: sipush 16000 (0x3E80)
		// @0EE8: getstatic int[] game.C_100005_fk.field_103610_p
		// @0EEB: bipush 6 (0x06)
		// @0EED: anewarray int[]
		// @0EF0: dup
		// @0EF1: iconst_0
		// @0EF2: iconst_2
		// @0EF3: newarray int[]
		// @0EF5: dup
		// @0EF6: iconst_0
		// @0EF7: bipush 9 (0x09)
		// @0EF9: iastore
		// @0EFA: dup
		// @0EFB: iconst_1
		// @0EFC: bipush 9 (0x09)
		// @0EFE: iastore
		// @0EFF: aastore
		// @0F00: dup
		// @0F01: iconst_1
		// @0F02: iconst_4
		// @0F03: newarray int[]
		// @0F05: dup
		// @0F06: iconst_0
		// @0F07: bipush 9 (0x09)
		// @0F09: iastore
		// @0F0A: dup
		// @0F0B: iconst_1
		// @0F0C: bipush 9 (0x09)
		// @0F0E: iastore
		// @0F0F: dup
		// @0F10: iconst_2
		// @0F11: bipush 9 (0x09)
		// @0F13: iastore
		// @0F14: dup
		// @0F15: iconst_3
		// @0F16: bipush 9 (0x09)
		// @0F18: iastore
		// @0F19: aastore
		// @0F1A: dup
		// @0F1B: iconst_2
		// @0F1C: bipush 6 (0x06)
		// @0F1E: newarray int[]
		// @0F20: dup
		// @0F21: iconst_0
		// @0F22: bipush 9 (0x09)
		// @0F24: iastore
		// @0F25: dup
		// @0F26: iconst_1
		// @0F27: bipush 9 (0x09)
		// @0F29: iastore
		// @0F2A: dup
		// @0F2B: iconst_2
		// @0F2C: bipush 9 (0x09)
		// @0F2E: iastore
		// @0F2F: dup
		// @0F30: iconst_3
		// @0F31: bipush 9 (0x09)
		// @0F33: iastore
		// @0F34: dup
		// @0F35: iconst_4
		// @0F36: bipush 9 (0x09)
		// @0F38: iastore
		// @0F39: dup
		// @0F3A: iconst_5
		// @0F3B: bipush 9 (0x09)
		// @0F3D: iastore
		// @0F3E: aastore
		// @0F3F: dup
		// @0F40: iconst_3
		// @0F41: bipush 8 (0x08)
		// @0F43: newarray int[]
		// @0F45: dup
		// @0F46: iconst_0
		// @0F47: bipush 9 (0x09)
		// @0F49: iastore
		// @0F4A: dup
		// @0F4B: iconst_1
		// @0F4C: bipush 9 (0x09)
		// @0F4E: iastore
		// @0F4F: dup
		// @0F50: iconst_2
		// @0F51: bipush 9 (0x09)
		// @0F53: iastore
		// @0F54: dup
		// @0F55: iconst_3
		// @0F56: bipush 9 (0x09)
		// @0F58: iastore
		// @0F59: dup
		// @0F5A: iconst_4
		// @0F5B: bipush 9 (0x09)
		// @0F5D: iastore
		// @0F5E: dup
		// @0F5F: iconst_5
		// @0F60: bipush 9 (0x09)
		// @0F62: iastore
		// @0F63: dup
		// @0F64: bipush 6 (0x06)
		// @0F66: bipush 9 (0x09)
		// @0F68: iastore
		// @0F69: dup
		// @0F6A: bipush 7 (0x07)
		// @0F6C: bipush 9 (0x09)
		// @0F6E: iastore
		// @0F6F: aastore
		// @0F70: dup
		// @0F71: iconst_4
		// @0F72: bipush 10 (0x0A)
		// @0F74: newarray int[]
		// @0F76: dup
		// @0F77: iconst_0
		// @0F78: bipush 9 (0x09)
		// @0F7A: iastore
		// @0F7B: dup
		// @0F7C: iconst_1
		// @0F7D: bipush 9 (0x09)
		// @0F7F: iastore
		// @0F80: dup
		// @0F81: iconst_2
		// @0F82: bipush 9 (0x09)
		// @0F84: iastore
		// @0F85: dup
		// @0F86: iconst_3
		// @0F87: bipush 9 (0x09)
		// @0F89: iastore
		// @0F8A: dup
		// @0F8B: iconst_4
		// @0F8C: bipush 9 (0x09)
		// @0F8E: iastore
		// @0F8F: dup
		// @0F90: iconst_5
		// @0F91: bipush 9 (0x09)
		// @0F93: iastore
		// @0F94: dup
		// @0F95: bipush 6 (0x06)
		// @0F97: bipush 9 (0x09)
		// @0F99: iastore
		// @0F9A: dup
		// @0F9B: bipush 7 (0x07)
		// @0F9D: bipush 9 (0x09)
		// @0F9F: iastore
		// @0FA0: dup
		// @0FA1: bipush 8 (0x08)
		// @0FA3: bipush 9 (0x09)
		// @0FA5: iastore
		// @0FA6: dup
		// @0FA7: bipush 9 (0x09)
		// @0FA9: bipush 9 (0x09)
		// @0FAB: iastore
		// @0FAC: aastore
		// @0FAD: dup
		// @0FAE: iconst_5
		// @0FAF: bipush 6 (0x06)
		// @0FB1: newarray int[]
		// @0FB3: dup
		// @0FB4: iconst_0
		// @0FB5: bipush 13 (0x0D)
		// @0FB7: iastore
		// @0FB8: dup
		// @0FB9: iconst_1
		// @0FBA: bipush 13 (0x0D)
		// @0FBC: iastore
		// @0FBD: dup
		// @0FBE: iconst_2
		// @0FBF: bipush 9 (0x09)
		// @0FC1: iastore
		// @0FC2: dup
		// @0FC3: iconst_3
		// @0FC4: bipush 9 (0x09)
		// @0FC6: iastore
		// @0FC7: dup
		// @0FC8: iconst_4
		// @0FC9: bipush 9 (0x09)
		// @0FCB: iastore
		// @0FCC: dup
		// @0FCD: iconst_5
		// @0FCE: bipush 9 (0x09)
		// @0FD0: iastore
		// @0FD1: aastore
		// @0FD2: bipush 66 (0x42)
		// @0FD4: iconst_3
		// @0FD5: bipush 126 (0x7E)
		// @0FD7: invokestatic game.C_100051_ea.func_103304_a(int, int, int[], int[][], int, int, byte)void
		// @0FDA: iconst_1
		// @0FDB: sipush 16000 (0x3E80)
		// @0FDE: getstatic int[] game.C_100005_fk.field_103610_p
		// @0FE1: iconst_5
		// @0FE2: anewarray int[]
		// @0FE5: dup
		// @0FE6: iconst_0
		// @0FE7: iconst_1
		// @0FE8: newarray int[]
		// @0FEA: dup
		// @0FEB: iconst_0
		// @0FEC: bipush 13 (0x0D)
		// @0FEE: iastore
		// @0FEF: aastore
		// @0FF0: dup
		// @0FF1: iconst_1
		// @0FF2: iconst_3
		// @0FF3: newarray int[]
		// @0FF5: dup
		// @0FF6: iconst_0
		// @0FF7: iconst_2
		// @0FF8: iastore
		// @0FF9: dup
		// @0FFA: iconst_1
		// @0FFB: iconst_2
		// @0FFC: iastore
		// @0FFD: dup
		// @0FFE: iconst_2
		// @0FFF: iconst_2
		// @1000: iastore
		// @1001: aastore
		// @1002: dup
		// @1003: iconst_2
		// @1004: iconst_5
		// @1005: newarray int[]
		// @1007: dup
		// @1008: iconst_0
		// @1009: bipush 13 (0x0D)
		// @100B: iastore
		// @100C: dup
		// @100D: iconst_1
		// @100E: bipush 9 (0x09)
		// @1010: iastore
		// @1011: dup
		// @1012: iconst_2
		// @1013: bipush 9 (0x09)
		// @1015: iastore
		// @1016: dup
		// @1017: iconst_3
		// @1018: bipush 9 (0x09)
		// @101A: iastore
		// @101B: dup
		// @101C: iconst_4
		// @101D: bipush 9 (0x09)
		// @101F: iastore
		// @1020: aastore
		// @1021: dup
		// @1022: iconst_3
		// @1023: iconst_3
		// @1024: newarray int[]
		// @1026: dup
		// @1027: iconst_0
		// @1028: bipush 8 (0x08)
		// @102A: iastore
		// @102B: dup
		// @102C: iconst_1
		// @102D: bipush 8 (0x08)
		// @102F: iastore
		// @1030: dup
		// @1031: iconst_2
		// @1032: bipush 8 (0x08)
		// @1034: iastore
		// @1035: aastore
		// @1036: dup
		// @1037: iconst_4
		// @1038: iconst_3
		// @1039: newarray int[]
		// @103B: dup
		// @103C: iconst_0
		// @103D: bipush 13 (0x0D)
		// @103F: iastore
		// @1040: dup
		// @1041: iconst_1
		// @1042: bipush 13 (0x0D)
		// @1044: iastore
		// @1045: dup
		// @1046: iconst_2
		// @1047: bipush 13 (0x0D)
		// @1049: iastore
		// @104A: aastore
		// @104B: bipush 81 (0x51)
		// @104D: iconst_3
		// @104E: bipush 127 (0x7F)
		// @1050: invokestatic game.C_100051_ea.func_103304_a(int, int, int[], int[][], int, int, byte)void
		// @1053: iconst_0
		// @1054: sipush 16000 (0x3E80)
		// @1057: getstatic int[] game.C_100005_fk.field_103597_o
		// @105A: bipush 6 (0x06)
		// @105C: anewarray int[]
		// @105F: dup
		// @1060: iconst_0
		// @1061: iconst_4
		// @1062: newarray int[]
		// @1064: dup
		// @1065: iconst_0
		// @1066: iconst_1
		// @1067: iastore
		// @1068: dup
		// @1069: iconst_1
		// @106A: iconst_1
		// @106B: iastore
		// @106C: dup
		// @106D: iconst_2
		// @106E: iconst_3
		// @106F: iastore
		// @1070: dup
		// @1071: iconst_3
		// @1072: iconst_3
		// @1073: iastore
		// @1074: aastore
		// @1075: dup
		// @1076: iconst_1
		// @1077: iconst_3
		// @1078: newarray int[]
		// @107A: dup
		// @107B: iconst_0
		// @107C: iconst_2
		// @107D: iastore
		// @107E: dup
		// @107F: iconst_1
		// @1080: iconst_2
		// @1081: iastore
		// @1082: dup
		// @1083: iconst_2
		// @1084: iconst_2
		// @1085: iastore
		// @1086: aastore
		// @1087: dup
		// @1088: iconst_2
		// @1089: iconst_4
		// @108A: newarray int[]
		// @108C: dup
		// @108D: iconst_0
		// @108E: iconst_0
		// @108F: iastore
		// @1090: dup
		// @1091: iconst_1
		// @1092: iconst_0
		// @1093: iastore
		// @1094: dup
		// @1095: iconst_2
		// @1096: bipush 9 (0x09)
		// @1098: iastore
		// @1099: dup
		// @109A: iconst_3
		// @109B: bipush 9 (0x09)
		// @109D: iastore
		// @109E: aastore
		// @109F: dup
		// @10A0: iconst_3
		// @10A1: iconst_1
		// @10A2: newarray int[]
		// @10A4: dup
		// @10A5: iconst_0
		// @10A6: bipush 10 (0x0A)
		// @10A8: iastore
		// @10A9: aastore
		// @10AA: dup
		// @10AB: iconst_4
		// @10AC: iconst_2
		// @10AD: newarray int[]
		// @10AF: dup
		// @10B0: iconst_0
		// @10B1: bipush 12 (0x0C)
		// @10B3: iastore
		// @10B4: dup
		// @10B5: iconst_1
		// @10B6: bipush 12 (0x0C)
		// @10B8: iastore
		// @10B9: aastore
		// @10BA: dup
		// @10BB: iconst_5
		// @10BC: iconst_2
		// @10BD: newarray int[]
		// @10BF: dup
		// @10C0: iconst_0
		// @10C1: bipush 11 (0x0B)
		// @10C3: iastore
		// @10C4: dup
		// @10C5: iconst_1
		// @10C6: bipush 11 (0x0B)
		// @10C8: iastore
		// @10C9: aastore
		// @10CA: bipush 64 (0x40)
		// @10CC: iconst_3
		// @10CD: bipush 126 (0x7E)
		// @10CF: invokestatic game.C_100051_ea.func_103304_a(int, int, int[], int[][], int, int, byte)void
		// @10D2: iconst_1
		// @10D3: sipush 16000 (0x3E80)
		// @10D6: getstatic int[] game.C_100005_fk.field_103597_o
		// @10D9: iconst_5
		// @10DA: anewarray int[]
		// @10DD: dup
		// @10DE: iconst_0
		// @10DF: iconst_3
		// @10E0: newarray int[]
		// @10E2: dup
		// @10E3: iconst_0
		// @10E4: bipush 8 (0x08)
		// @10E6: iastore
		// @10E7: dup
		// @10E8: iconst_1
		// @10E9: bipush 8 (0x08)
		// @10EB: iastore
		// @10EC: dup
		// @10ED: iconst_2
		// @10EE: bipush 8 (0x08)
		// @10F0: iastore
		// @10F1: aastore
		// @10F2: dup
		// @10F3: iconst_1
		// @10F4: iconst_2
		// @10F5: newarray int[]
		// @10F7: dup
		// @10F8: iconst_0
		// @10F9: bipush 7 (0x07)
		// @10FB: iastore
		// @10FC: dup
		// @10FD: iconst_1
		// @10FE: bipush 7 (0x07)
		// @1100: iastore
		// @1101: aastore
		// @1102: dup
		// @1103: iconst_2
		// @1104: iconst_1
		// @1105: newarray int[]
		// @1107: dup
		// @1108: iconst_0
		// @1109: bipush 13 (0x0D)
		// @110B: iastore
		// @110C: aastore
		// @110D: dup
		// @110E: iconst_3
		// @110F: iconst_2
		// @1110: newarray int[]
		// @1112: dup
		// @1113: iconst_0
		// @1114: bipush 20 (0x14)
		// @1116: iastore
		// @1117: dup
		// @1118: iconst_1
		// @1119: bipush 20 (0x14)
		// @111B: iastore
		// @111C: aastore
		// @111D: dup
		// @111E: iconst_4
		// @111F: iconst_1
		// @1120: newarray int[]
		// @1122: dup
		// @1123: iconst_0
		// @1124: bipush 14 (0x0E)
		// @1126: iastore
		// @1127: aastore
		// @1128: bipush 97 (0x61)
		// @112A: iconst_3
		// @112B: bipush 126 (0x7E)
		// @112D: invokestatic game.C_100051_ea.func_103304_a(int, int, int[], int[][], int, int, byte)void
		// @1130: iconst_2
		// @1131: sipush 16000 (0x3E80)
		// @1134: getstatic int[] game.C_100005_fk.field_103607_s
		// @1137: iconst_5
		// @1138: anewarray int[]
		// @113B: dup
		// @113C: iconst_0
		// @113D: iconst_1
		// @113E: newarray int[]
		// @1140: dup
		// @1141: iconst_0
		// @1142: bipush 7 (0x07)
		// @1144: iastore
		// @1145: aastore
		// @1146: dup
		// @1147: iconst_1
		// @1148: iconst_1
		// @1149: newarray int[]
		// @114B: dup
		// @114C: iconst_0
		// @114D: bipush 10 (0x0A)
		// @114F: iastore
		// @1150: aastore
		// @1151: dup
		// @1152: iconst_2
		// @1153: iconst_1
		// @1154: newarray int[]
		// @1156: dup
		// @1157: iconst_0
		// @1158: bipush 13 (0x0D)
		// @115A: iastore
		// @115B: aastore
		// @115C: dup
		// @115D: iconst_3
		// @115E: iconst_1
		// @115F: newarray int[]
		// @1161: dup
		// @1162: iconst_0
		// @1163: bipush 24 (0x18)
		// @1165: iastore
		// @1166: aastore
		// @1167: dup
		// @1168: iconst_4
		// @1169: iconst_1
		// @116A: newarray int[]
		// @116C: dup
		// @116D: iconst_0
		// @116E: bipush 14 (0x0E)
		// @1170: iastore
		// @1171: aastore
		// @1172: bipush 82 (0x52)
		// @1174: iconst_3
		// @1175: bipush 126 (0x7E)
		// @1177: invokestatic game.C_100051_ea.func_103304_a(int, int, int[], int[][], int, int, byte)void
		// @117A: iconst_3
		// @117B: sipush 16000 (0x3E80)
		// @117E: getstatic int[] game.C_100005_fk.field_103592_e
		// @1181: iconst_5
		// @1182: anewarray int[]
		// @1185: dup
		// @1186: iconst_0
		// @1187: iconst_5
		// @1188: newarray int[]
		// @118A: dup
		// @118B: iconst_0
		// @118C: iconst_1
		// @118D: iastore
		// @118E: dup
		// @118F: iconst_1
		// @1190: iconst_1
		// @1191: iastore
		// @1192: dup
		// @1193: iconst_2
		// @1194: iconst_3
		// @1195: iastore
		// @1196: dup
		// @1197: iconst_3
		// @1198: iconst_3
		// @1199: iastore
		// @119A: dup
		// @119B: iconst_4
		// @119C: iconst_5
		// @119D: iastore
		// @119E: aastore
		// @119F: dup
		// @11A0: iconst_1
		// @11A1: iconst_4
		// @11A2: newarray int[]
		// @11A4: dup
		// @11A5: iconst_0
		// @11A6: bipush 20 (0x14)
		// @11A8: iastore
		// @11A9: dup
		// @11AA: iconst_1
		// @11AB: bipush 20 (0x14)
		// @11AD: iastore
		// @11AE: dup
		// @11AF: iconst_2
		// @11B0: bipush 20 (0x14)
		// @11B2: iastore
		// @11B3: dup
		// @11B4: iconst_3
		// @11B5: bipush 8 (0x08)
		// @11B7: iastore
		// @11B8: aastore
		// @11B9: dup
		// @11BA: iconst_2
		// @11BB: iconst_2
		// @11BC: newarray int[]
		// @11BE: dup
		// @11BF: iconst_0
		// @11C0: bipush 10 (0x0A)
		// @11C2: iastore
		// @11C3: dup
		// @11C4: iconst_1
		// @11C5: bipush 7 (0x07)
		// @11C7: iastore
		// @11C8: aastore
		// @11C9: dup
		// @11CA: iconst_3
		// @11CB: iconst_3
		// @11CC: newarray int[]
		// @11CE: dup
		// @11CF: iconst_0
		// @11D0: iconst_0
		// @11D1: iastore
		// @11D2: dup
		// @11D3: iconst_1
		// @11D4: iconst_0
		// @11D5: iastore
		// @11D6: dup
		// @11D7: iconst_2
		// @11D8: bipush 11 (0x0B)
		// @11DA: iastore
		// @11DB: aastore
		// @11DC: dup
		// @11DD: iconst_4
		// @11DE: iconst_1
		// @11DF: newarray int[]
		// @11E1: dup
		// @11E2: iconst_0
		// @11E3: bipush 14 (0x0E)
		// @11E5: iastore
		// @11E6: aastore
		// @11E7: iconst_3
		// @11E8: iconst_3
		// @11E9: bipush 127 (0x7F)
		// @11EB: invokestatic game.C_100051_ea.func_103304_a(int, int, int[], int[][], int, int, byte)void
		// @11EE: iconst_3
		// @11EF: sipush 16000 (0x3E80)
		// @11F2: getstatic int[] game.C_100005_fk.field_103597_o
		// @11F5: iconst_4
		// @11F6: anewarray int[]
		// @11F9: dup
		// @11FA: iconst_0
		// @11FB: iconst_1
		// @11FC: newarray int[]
		// @11FE: dup
		// @11FF: iconst_0
		// @1200: iconst_1
		// @1201: iastore
		// @1202: aastore
		// @1203: dup
		// @1204: iconst_1
		// @1205: iconst_4
		// @1206: newarray int[]
		// @1208: dup
		// @1209: iconst_0
		// @120A: bipush 12 (0x0C)
		// @120C: iastore
		// @120D: dup
		// @120E: iconst_1
		// @120F: bipush 12 (0x0C)
		// @1211: iastore
		// @1212: dup
		// @1213: iconst_2
		// @1214: bipush 12 (0x0C)
		// @1216: iastore
		// @1217: dup
		// @1218: iconst_3
		// @1219: bipush 12 (0x0C)
		// @121B: iastore
		// @121C: aastore
		// @121D: dup
		// @121E: iconst_2
		// @121F: iconst_2
		// @1220: newarray int[]
		// @1222: dup
		// @1223: iconst_0
		// @1224: bipush 14 (0x0E)
		// @1226: iastore
		// @1227: dup
		// @1228: iconst_1
		// @1229: bipush 8 (0x08)
		// @122B: iastore
		// @122C: aastore
		// @122D: dup
		// @122E: iconst_3
		// @122F: iconst_1
		// @1230: newarray int[]
		// @1232: dup
		// @1233: iconst_0
		// @1234: bipush 15 (0x0F)
		// @1236: iastore
		// @1237: aastore
		// @1238: bipush 19 (0x13)
		// @123A: iconst_2
		// @123B: bipush 126 (0x7E)
		// @123D: invokestatic game.C_100051_ea.func_103304_a(int, int, int[], int[][], int, int, byte)void
		// @1240: iconst_1
		// @1241: sipush 16000 (0x3E80)
		// @1244: getstatic int[] game.C_100005_fk.field_103600_j
		// @1247: bipush 6 (0x06)
		// @1249: anewarray int[]
		// @124C: dup
		// @124D: iconst_0
		// @124E: iconst_2
		// @124F: newarray int[]
		// @1251: dup
		// @1252: iconst_0
		// @1253: bipush 10 (0x0A)
		// @1255: iastore
		// @1256: dup
		// @1257: iconst_1
		// @1258: bipush 11 (0x0B)
		// @125A: iastore
		// @125B: aastore
		// @125C: dup
		// @125D: iconst_1
		// @125E: iconst_2
		// @125F: newarray int[]
		// @1261: dup
		// @1262: iconst_0
		// @1263: bipush 8 (0x08)
		// @1265: iastore
		// @1266: dup
		// @1267: iconst_1
		// @1268: bipush 8 (0x08)
		// @126A: iastore
		// @126B: aastore
		// @126C: dup
		// @126D: iconst_2
		// @126E: iconst_1
		// @126F: newarray int[]
		// @1271: dup
		// @1272: iconst_0
		// @1273: bipush 15 (0x0F)
		// @1275: iastore
		// @1276: aastore
		// @1277: dup
		// @1278: iconst_3
		// @1279: iconst_2
		// @127A: newarray int[]
		// @127C: dup
		// @127D: iconst_0
		// @127E: iconst_0
		// @127F: iastore
		// @1280: dup
		// @1281: iconst_1
		// @1282: bipush 12 (0x0C)
		// @1284: iastore
		// @1285: aastore
		// @1286: dup
		// @1287: iconst_4
		// @1288: iconst_4
		// @1289: newarray int[]
		// @128B: dup
		// @128C: iconst_0
		// @128D: bipush 24 (0x18)
		// @128F: iastore
		// @1290: dup
		// @1291: iconst_1
		// @1292: bipush 7 (0x07)
		// @1294: iastore
		// @1295: dup
		// @1296: iconst_2
		// @1297: bipush 7 (0x07)
		// @1299: iastore
		// @129A: dup
		// @129B: iconst_3
		// @129C: bipush 7 (0x07)
		// @129E: iastore
		// @129F: aastore
		// @12A0: dup
		// @12A1: iconst_5
		// @12A2: iconst_1
		// @12A3: newarray int[]
		// @12A5: dup
		// @12A6: iconst_0
		// @12A7: bipush 14 (0x0E)
		// @12A9: iastore
		// @12AA: aastore
		// @12AB: bipush 113 (0x71)
		// @12AD: iconst_1
		// @12AE: bipush 126 (0x7E)
		// @12B0: invokestatic game.C_100051_ea.func_103304_a(int, int, int[], int[][], int, int, byte)void
		// @12B3: iconst_1
		// @12B4: sipush 16000 (0x3E80)
		// @12B7: getstatic int[] game.C_100005_fk.field_103610_p
		// @12BA: iconst_5
		// @12BB: anewarray int[]
		// @12BE: dup
		// @12BF: iconst_0
		// @12C0: iconst_2
		// @12C1: newarray int[]
		// @12C3: dup
		// @12C4: iconst_0
		// @12C5: bipush 6 (0x06)
		// @12C7: iastore
		// @12C8: dup
		// @12C9: iconst_1
		// @12CA: bipush 6 (0x06)
		// @12CC: iastore
		// @12CD: aastore
		// @12CE: dup
		// @12CF: iconst_1
		// @12D0: iconst_2
		// @12D1: newarray int[]
		// @12D3: dup
		// @12D4: iconst_0
		// @12D5: bipush 13 (0x0D)
		// @12D7: iastore
		// @12D8: dup
		// @12D9: iconst_1
		// @12DA: bipush 13 (0x0D)
		// @12DC: iastore
		// @12DD: aastore
		// @12DE: dup
		// @12DF: iconst_2
		// @12E0: iconst_1
		// @12E1: newarray int[]
		// @12E3: dup
		// @12E4: iconst_0
		// @12E5: bipush 15 (0x0F)
		// @12E7: iastore
		// @12E8: aastore
		// @12E9: dup
		// @12EA: iconst_3
		// @12EB: iconst_2
		// @12EC: newarray int[]
		// @12EE: dup
		// @12EF: iconst_0
		// @12F0: bipush 14 (0x0E)
		// @12F2: iastore
		// @12F3: dup
		// @12F4: iconst_1
		// @12F5: bipush 24 (0x18)
		// @12F7: iastore
		// @12F8: aastore
		// @12F9: dup
		// @12FA: iconst_4
		// @12FB: iconst_4
		// @12FC: newarray int[]
		// @12FE: dup
		// @12FF: iconst_0
		// @1300: bipush 23 (0x17)
		// @1302: iastore
		// @1303: dup
		// @1304: iconst_1
		// @1305: bipush 23 (0x17)
		// @1307: iastore
		// @1308: dup
		// @1309: iconst_2
		// @130A: bipush 23 (0x17)
		// @130C: iastore
		// @130D: dup
		// @130E: iconst_3
		// @130F: bipush 23 (0x17)
		// @1311: iastore
		// @1312: aastore
		// @1313: sipush 129 (0x0081)
		// @1316: iconst_0
		// @1317: bipush 126 (0x7E)
		// @1319: invokestatic game.C_100051_ea.func_103304_a(int, int, int[], int[][], int, int, byte)void
		// @131C: iconst_0
		// @131D: putstatic boolean game.C_100005_fk.field_103590_g
		// @1320: return
	}
	
	private static char[] func_103582_z(String arg0)
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
		// @0E: bipush 119 (0x77)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_103580_z(char[] arg0)
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
		// @30: bipush 103 (0x67)
		// @32: goto @46
		// @35: bipush 37 (0x25)
		// @37: goto @46
		// @3A: bipush 32 (0x20)
		// @3C: goto @46
		// @3F: bipush 79 (0x4F)
		// @41: goto @46
		// @44: bipush 119 (0x77)
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
