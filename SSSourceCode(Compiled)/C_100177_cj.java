package game;

import java.awt.Component;

class C_100177_cj
{
	private int field_105657_k;
	private long field_105661_t;
	static boolean field_105646_g;
	private C_100261_md field_105654_l;
	private static int field_105653_o;
	private static C_100339_jb field_105655_m;
	private boolean field_105659_i;
	static int field_105660_u;
	int[] field_105663_r;
	private C_100261_md[] field_105664_q;
	private int field_105656_j;
	private boolean field_105648_e;
	private int field_105662_s;
	private C_100261_md[] field_105652_n;
	private int field_105650_c;
	private int field_105665_p;
	private long field_105645_f;
	private int field_105647_d;
	private int field_105649_b;
	private int field_105658_h;
	private long field_105651_a;
	
	void func_105633_f() throws Exception
	{
		// @0: return
	}
	
	private final void func_105628_b(int arg0)
	{
		// @00: aload_0
		// @01: dup
		// @02: getfield int game.C_100177_cj.field_105658_h
		// @05: iload_1
		// @06: isub
		// @07: putfield int game.C_100177_cj.field_105658_h
		// @0A: aload_0
		// @0B: getfield int game.C_100177_cj.field_105658_h
		// @0E: ifge @1A
		// @11: aload_0
		// @12: iconst_0
		// @13: putfield int game.C_100177_cj.field_105658_h
		// @16: goto @1A
		// @19: athrow
		// @1A: aload_0
		// @1B: getfield game.C_100261_md game.C_100177_cj.field_105654_l
		// @1E: ifnull @2D
		// @21: aload_0
		// @22: getfield game.C_100261_md game.C_100177_cj.field_105654_l
		// @25: iload_1
		// @26: invokevirtual game.C_100261_md.func_100914_e(int)void
		// @29: goto @2D
		// @2C: athrow
		// @2D: return
	}
	
	static final void func_105643_a(int arg0, boolean arg1, int arg2)
	{
		// @00: iload_0
		// @01: sipush 8000 (0x1F40)
		// @04: if_icmplt @11
		// @07: iload_0
		// @08: ldc 48000 (0xbb80)
		// @0A: if_icmple @1A
		// @0D: goto @11
		// @10: athrow
		// @11: new java.lang.IllegalArgumentException
		// @14: dup
		// @15: invokespecial java.lang.IllegalArgumentException.<init>()void
		// @18: athrow
		// @19: athrow
		// @1A: iload_0
		// @1B: putstatic int game.C_100177_cj.field_105660_u
		// @1E: iload_1
		// @1F: putstatic boolean game.C_100177_cj.field_105646_g
		// @22: iload_2
		// @23: putstatic int game.C_100177_cj.field_105653_o
		// @26: return
	}
	
	void func_105630_a(int arg0) throws Exception
	{
		// @0: return
	}
	
	private final void func_105642_a(C_100261_md arg0, int arg1)
	{
		// @00: iload_2
		// @01: iconst_5
		// @02: ishr
		// @03: istore_3
		// @04: aload_0
		// @05: getfield game.C_100261_md[] game.C_100177_cj.field_105652_n
		// @08: iload_3
		// @09: aaload
		// @0A: astore #4
		// @0C: aload #4
		// @0E: ifnonnull @1C
		// @11: aload_0
		// @12: getfield game.C_100261_md[] game.C_100177_cj.field_105664_q
		// @15: iload_3
		// @16: aload_1
		// @17: aastore
		// @18: goto @22
		// @1B: athrow
		// @1C: aload #4
		// @1E: aload_1
		// @1F: putfield game.C_100261_md game.C_100261_md.field_100919_j
		// @22: aload_0
		// @23: getfield game.C_100261_md[] game.C_100177_cj.field_105652_n
		// @26: iload_3
		// @27: aload_1
		// @28: aastore
		// @29: aload_1
		// @2A: iload_2
		// @2B: putfield int game.C_100261_md.field_100917_l
		// @2E: return
	}
	
	static final C_100177_cj func_105635_a(C_100201_qj arg0, Component arg1, int arg2, int arg3)
	{
		// @00: getstatic int game.C_100177_cj.field_105660_u
		// @03: ifne @0F
		// @06: new java.lang.IllegalStateException
		// @09: dup
		// @0A: invokespecial java.lang.IllegalStateException.<init>()void
		// @0D: athrow
		// @0E: athrow
		// @0F: iload_2
		// @10: iflt @1C
		// @13: iload_2
		// @14: iconst_2
		// @15: if_icmplt @25
		// @18: goto @1C
		// @1B: athrow
		// @1C: new java.lang.IllegalArgumentException
		// @1F: dup
		// @20: invokespecial java.lang.IllegalArgumentException.<init>()void
		// @23: athrow
		// @24: athrow
		// @25: iload_3
		// @26: sipush 256 (0x0100)
		// @29: if_icmpge @30
		// @2C: sipush 256 (0x0100)
		// @2F: istore_3
		// @30: new game.C_100345_jh
		// @33: dup
		// @34: invokespecial game.C_100345_jh.<init>()void
		// @37: astore #4
		// @39: aload #4
		// @3B: sipush 256 (0x0100)
		// @3E: getstatic boolean game.C_100177_cj.field_105646_g
		// @41: ifeq @49
		// @44: iconst_2
		// @45: goto @4A
		// @48: athrow
		// @49: iconst_1
		// @4A: imul
		// @4B: newarray int[]
		// @4D: putfield int[] game.C_100177_cj.field_105663_r
		// @50: aload #4
		// @52: iload_3
		// @53: putfield int game.C_100177_cj.field_105647_d
		// @56: aload #4
		// @58: aload_1
		// @59: invokevirtual game.C_100177_cj.func_105639_a(java.awt.Component)void
		// @5C: aload #4
		// @5E: iload_3
		// @5F: sipush -1024 (0xFC00)
		// @62: iand
		// @63: sipush 1024 (0x0400)
		// @66: iadd
		// @67: putfield int game.C_100177_cj.field_105662_s
		// @6A: aload #4
		// @6C: getfield int game.C_100177_cj.field_105662_s
		// @6F: sipush 16384 (0x4000)
		// @72: if_icmple @81
		// @75: aload #4
		// @77: sipush 16384 (0x4000)
		// @7A: putfield int game.C_100177_cj.field_105662_s
		// @7D: goto @81
		// @80: athrow
		// @81: aload #4
		// @83: aload #4
		// @85: getfield int game.C_100177_cj.field_105662_s
		// @88: invokevirtual game.C_100177_cj.func_105630_a(int)void
		// @8B: getstatic int game.C_100177_cj.field_105653_o
		// @8E: ifle @BD
		// @91: getstatic game.C_100339_jb game.C_100177_cj.field_105655_m
		// @94: ifnonnull @BD
		// @97: goto @9B
		// @9A: athrow
		// @9B: new game.C_100339_jb
		// @9E: dup
		// @9F: invokespecial game.C_100339_jb.<init>()void
		// @A2: putstatic game.C_100339_jb game.C_100177_cj.field_105655_m
		// @A5: getstatic game.C_100339_jb game.C_100177_cj.field_105655_m
		// @A8: aload_0
		// @A9: putfield game.C_100201_qj game.C_100339_jb.field_107386_n
		// @AC: aload_0
		// @AD: getstatic int game.C_100177_cj.field_105653_o
		// @B0: bipush 124 (0x7C)
		// @B2: getstatic game.C_100339_jb game.C_100177_cj.field_105655_m
		// @B5: invokevirtual game.C_100201_qj.func_105856_a(int, int, java.lang.Runnable)game.C_100331_ie
		// @B8: pop
		// @B9: goto @BD
		// @BC: athrow
		// @BD: getstatic game.C_100339_jb game.C_100177_cj.field_105655_m
		// @C0: ifnull @E5
		// @C3: getstatic game.C_100339_jb game.C_100177_cj.field_105655_m
		// @C6: getfield game.C_100177_cj[] game.C_100339_jb.field_107379_f
		// @C9: iload_2
		// @CA: aaload
		// @CB: ifnull @DB
		// @CE: goto @D2
		// @D1: athrow
		// @D2: new java.lang.IllegalArgumentException
		// @D5: dup
		// @D6: invokespecial java.lang.IllegalArgumentException.<init>()void
		// @D9: athrow
		// @DA: athrow
		// @DB: getstatic game.C_100339_jb game.C_100177_cj.field_105655_m
		// @DE: getfield game.C_100177_cj[] game.C_100339_jb.field_107379_f
		// @E1: iload_2
		// @E2: aload #4
		// @E4: aastore
		// @E5: aload #4
		// @E7: areturn
		// @E8: astore #4
		// @EA: new game.C_100177_cj
		// @ED: dup
		// @EE: invokespecial game.C_100177_cj.<init>()void
		// @F1: areturn
	}
	
	int func_105637_h() throws Exception
	{
		// @0: aload_0
		// @1: getfield int game.C_100177_cj.field_105662_s
		// @4: ireturn
	}
	
	private static final void func_105632_b(C_100261_md arg0)
	{
		// @00: aload_0
		// @01: iconst_0
		// @02: putfield boolean game.C_100261_md.field_100920_k
		// @05: aload_0
		// @06: getfield game.C_100229_oe game.C_100261_md.field_100918_m
		// @09: ifnull @18
		// @0C: aload_0
		// @0D: getfield game.C_100229_oe game.C_100261_md.field_100918_m
		// @10: iconst_0
		// @11: putfield int game.C_100229_oe.field_100882_j
		// @14: goto @18
		// @17: athrow
		// @18: aload_0
		// @19: invokevirtual game.C_100261_md.func_100912_c()game.C_100261_md
		// @1C: astore_1
		// @1D: aload_1
		// @1E: ifnull @2D
		// @21: aload_1
		// @22: invokestatic game.C_100177_cj.func_105632_b(game.C_100261_md)void
		// @25: aload_0
		// @26: invokevirtual game.C_100261_md.func_100916_d()game.C_100261_md
		// @29: astore_1
		// @2A: goto @1D
		// @2D: return
	}
	
	void func_105640_b() throws Exception
	{
		// @0: return
	}
	
	private final void func_105631_a(int[] arg0, int arg1)
	{
		// @000: iload_2
		// @001: istore_3
		// @002: getstatic boolean game.C_100177_cj.field_105646_g
		// @005: ifeq @00C
		// @008: iload_3
		// @009: iconst_1
		// @00A: ishl
		// @00B: istore_3
		// @00C: aload_1
		// @00D: iconst_0
		// @00E: iload_3
		// @00F: invokestatic game.C_100120_en.func_104910_a(int[], int, int)void
		// @012: aload_0
		// @013: dup
		// @014: getfield int game.C_100177_cj.field_105658_h
		// @017: iload_2
		// @018: isub
		// @019: putfield int game.C_100177_cj.field_105658_h
		// @01C: aload_0
		// @01D: getfield game.C_100261_md game.C_100177_cj.field_105654_l
		// @020: ifnull @1F5
		// @023: aload_0
		// @024: getfield int game.C_100177_cj.field_105658_h
		// @027: ifgt @1F5
		// @02A: goto @02E
		// @02D: athrow
		// @02E: aload_0
		// @02F: dup
		// @030: getfield int game.C_100177_cj.field_105658_h
		// @033: getstatic int game.C_100177_cj.field_105660_u
		// @036: iconst_4
		// @037: ishr
		// @038: iadd
		// @039: putfield int game.C_100177_cj.field_105658_h
		// @03C: aload_0
		// @03D: getfield game.C_100261_md game.C_100177_cj.field_105654_l
		// @040: invokestatic game.C_100177_cj.func_105632_b(game.C_100261_md)void
		// @043: aload_0
		// @044: aload_0
		// @045: getfield game.C_100261_md game.C_100177_cj.field_105654_l
		// @048: aload_0
		// @049: getfield game.C_100261_md game.C_100177_cj.field_105654_l
		// @04C: invokevirtual game.C_100261_md.func_100915_b()int
		// @04F: invokespecial game.C_100177_cj.func_105642_a(game.C_100261_md, int)void
		// @052: iconst_0
		// @053: istore #4
		// @055: sipush 255 (0x00FF)
		// @058: istore #5
		// @05A: bipush 7 (0x07)
		// @05C: istore #6
		// @05E: iload #5
		// @060: ifeq @1AB
		// @063: iload #6
		// @065: ifge @07C
		// @068: goto @06C
		// @06B: athrow
		// @06C: iload #6
		// @06E: iconst_3
		// @06F: iand
		// @070: istore #7
		// @072: iload #6
		// @074: iconst_2
		// @075: ishr
		// @076: ineg
		// @077: istore #8
		// @079: goto @083
		// @07C: iload #6
		// @07E: istore #7
		// @080: iconst_0
		// @081: istore #8
		// @083: iload #5
		// @085: iload #7
		// @087: iushr
		// @088: ldc 286331153 (0x11111111)
		// @08A: iand
		// @08B: istore #9
		// @08D: iload #9
		// @08F: ifne @096
		// @092: goto @1A5
		// @095: athrow
		// @096: iload #9
		// @098: iconst_1
		// @099: iand
		// @09A: ifne @0A1
		// @09D: goto @196
		// @0A0: athrow
		// @0A1: iload #5
		// @0A3: iconst_1
		// @0A4: iload #7
		// @0A6: ishl
		// @0A7: iconst_m1
		// @0A8: ixor
		// @0A9: iand
		// @0AA: istore #5
		// @0AC: aconst_null
		// @0AD: astore #10
		// @0AF: aload_0
		// @0B0: getfield game.C_100261_md[] game.C_100177_cj.field_105664_q
		// @0B3: iload #7
		// @0B5: aaload
		// @0B6: astore #11
		// @0B8: aload #11
		// @0BA: ifnull @196
		// @0BD: aload #11
		// @0BF: getfield game.C_100229_oe game.C_100261_md.field_100918_m
		// @0C2: astore #12
		// @0C4: aload #12
		// @0C6: ifnull @0EE
		// @0C9: aload #12
		// @0CB: getfield int game.C_100229_oe.field_100882_j
		// @0CE: iload #8
		// @0D0: if_icmple @0EE
		// @0D3: goto @0D7
		// @0D6: athrow
		// @0D7: iload #5
		// @0D9: iconst_1
		// @0DA: iload #7
		// @0DC: ishl
		// @0DD: ior
		// @0DE: istore #5
		// @0E0: aload #11
		// @0E2: astore #10
		// @0E4: aload #11
		// @0E6: getfield game.C_100261_md game.C_100261_md.field_100919_j
		// @0E9: astore #11
		// @0EB: goto @0B8
		// @0EE: aload #11
		// @0F0: iconst_1
		// @0F1: putfield boolean game.C_100261_md.field_100920_k
		// @0F4: aload #11
		// @0F6: invokevirtual game.C_100261_md.func_100913_a()int
		// @0F9: istore #13
		// @0FB: iload #4
		// @0FD: iload #13
		// @0FF: iadd
		// @100: istore #4
		// @102: aload #12
		// @104: ifnull @117
		// @107: aload #12
		// @109: dup
		// @10A: getfield int game.C_100229_oe.field_100882_j
		// @10D: iload #13
		// @10F: iadd
		// @110: putfield int game.C_100229_oe.field_100882_j
		// @113: goto @117
		// @116: athrow
		// @117: iload #4
		// @119: aload_0
		// @11A: getfield int game.C_100177_cj.field_105657_k
		// @11D: if_icmplt @124
		// @120: goto @1AB
		// @123: athrow
		// @124: aload #11
		// @126: invokevirtual game.C_100261_md.func_100912_c()game.C_100261_md
		// @129: astore #14
		// @12B: aload #14
		// @12D: ifnull @157
		// @130: aload #11
		// @132: getfield int game.C_100261_md.field_100917_l
		// @135: istore #15
		// @137: aload #14
		// @139: ifnull @157
		// @13C: aload_0
		// @13D: aload #14
		// @13F: iload #15
		// @141: aload #14
		// @143: invokevirtual game.C_100261_md.func_100915_b()int
		// @146: imul
		// @147: bipush 8 (0x08)
		// @149: ishr
		// @14A: invokespecial game.C_100177_cj.func_105642_a(game.C_100261_md, int)void
		// @14D: aload #11
		// @14F: invokevirtual game.C_100261_md.func_100916_d()game.C_100261_md
		// @152: astore #14
		// @154: goto @137
		// @157: aload #11
		// @159: getfield game.C_100261_md game.C_100261_md.field_100919_j
		// @15C: astore #15
		// @15E: aload #11
		// @160: aconst_null
		// @161: putfield game.C_100261_md game.C_100261_md.field_100919_j
		// @164: aload #10
		// @166: ifnonnull @176
		// @169: aload_0
		// @16A: getfield game.C_100261_md[] game.C_100177_cj.field_105664_q
		// @16D: iload #7
		// @16F: aload #15
		// @171: aastore
		// @172: goto @17D
		// @175: athrow
		// @176: aload #10
		// @178: aload #15
		// @17A: putfield game.C_100261_md game.C_100261_md.field_100919_j
		// @17D: aload #15
		// @17F: ifnonnull @18F
		// @182: aload_0
		// @183: getfield game.C_100261_md[] game.C_100177_cj.field_105652_n
		// @186: iload #7
		// @188: aload #10
		// @18A: aastore
		// @18B: goto @18F
		// @18E: athrow
		// @18F: aload #15
		// @191: astore #11
		// @193: goto @0B8
		// @196: iinc #7 +4
		// @199: iinc #8 +1
		// @19C: iload #9
		// @19E: iconst_4
		// @19F: iushr
		// @1A0: istore #9
		// @1A2: goto @08D
		// @1A5: iinc #6 +255
		// @1A8: goto @05E
		// @1AB: iconst_0
		// @1AC: istore #6
		// @1AE: iload #6
		// @1B0: bipush 8 (0x08)
		// @1B2: if_icmpge @1F5
		// @1B5: aload_0
		// @1B6: getfield game.C_100261_md[] game.C_100177_cj.field_105664_q
		// @1B9: iload #6
		// @1BB: aaload
		// @1BC: astore #7
		// @1BE: aload_0
		// @1BF: getfield game.C_100261_md[] game.C_100177_cj.field_105664_q
		// @1C2: astore #8
		// @1C4: iload #6
		// @1C6: istore #9
		// @1C8: aload_0
		// @1C9: getfield game.C_100261_md[] game.C_100177_cj.field_105652_n
		// @1CC: iload #6
		// @1CE: aconst_null
		// @1CF: aastore
		// @1D0: aload #8
		// @1D2: iload #9
		// @1D4: aconst_null
		// @1D5: aastore
		// @1D6: aload #7
		// @1D8: ifnull @1EF
		// @1DB: aload #7
		// @1DD: getfield game.C_100261_md game.C_100261_md.field_100919_j
		// @1E0: astore #10
		// @1E2: aload #7
		// @1E4: aconst_null
		// @1E5: putfield game.C_100261_md game.C_100261_md.field_100919_j
		// @1E8: aload #10
		// @1EA: astore #7
		// @1EC: goto @1D6
		// @1EF: iinc #6 +1
		// @1F2: goto @1AE
		// @1F5: aload_0
		// @1F6: getfield int game.C_100177_cj.field_105658_h
		// @1F9: ifge @205
		// @1FC: aload_0
		// @1FD: iconst_0
		// @1FE: putfield int game.C_100177_cj.field_105658_h
		// @201: goto @205
		// @204: athrow
		// @205: aload_0
		// @206: getfield game.C_100261_md game.C_100177_cj.field_105654_l
		// @209: ifnull @21A
		// @20C: aload_0
		// @20D: getfield game.C_100261_md game.C_100177_cj.field_105654_l
		// @210: aload_1
		// @211: iconst_0
		// @212: iload_2
		// @213: invokevirtual game.C_100261_md.func_100910_a(int[], int, int)void
		// @216: goto @21A
		// @219: athrow
		// @21A: aload_0
		// @21B: bipush 48 (0x30)
		// @21D: invokestatic game.C_100198_qn.func_105828_a(byte)long
		// @220: putfield long game.C_100177_cj.field_105661_t
		// @223: return
	}
	
	final synchronized void func_105636_g()
	{
		// @00: aload_0
		// @01: iconst_1
		// @02: putfield boolean game.C_100177_cj.field_105648_e
		// @05: aload_0
		// @06: invokevirtual game.C_100177_cj.func_105640_b()void
		// @09: goto @1E
		// @0C: astore_1
		// @0D: aload_0
		// @0E: invokevirtual game.C_100177_cj.func_105629_a()void
		// @11: aload_0
		// @12: bipush 54 (0x36)
		// @14: invokestatic game.C_100198_qn.func_105828_a(byte)long
		// @17: ldc2_w 2000
		// @1A: ladd
		// @1B: putfield long game.C_100177_cj.field_105651_a
		// @1E: return
	}
	
	void func_105639_a(Component arg0) throws Exception
	{
		// @0: return
	}
	
	final synchronized void func_105641_c()
	{
		// @000: aload_0
		// @001: getfield boolean game.C_100177_cj.field_105659_i
		// @004: ifeq @009
		// @007: return
		// @008: athrow
		// @009: bipush -70 (0xBA)
		// @00B: invokestatic game.C_100198_qn.func_105828_a(byte)long
		// @00E: lstore_1
		// @00F: lload_1
		// @010: aload_0
		// @011: getfield long game.C_100177_cj.field_105661_t
		// @014: ldc2_w 6000
		// @017: ladd
		// @018: lcmp
		// @019: ifle @029
		// @01C: aload_0
		// @01D: lload_1
		// @01E: ldc2_w 6000
		// @021: lsub
		// @022: putfield long game.C_100177_cj.field_105661_t
		// @025: goto @029
		// @028: athrow
		// @029: lload_1
		// @02A: aload_0
		// @02B: getfield long game.C_100177_cj.field_105661_t
		// @02E: ldc2_w 5000
		// @031: ladd
		// @032: lcmp
		// @033: ifle @056
		// @036: aload_0
		// @037: sipush 256 (0x0100)
		// @03A: invokespecial game.C_100177_cj.func_105628_b(int)void
		// @03D: aload_0
		// @03E: dup
		// @03F: getfield long game.C_100177_cj.field_105661_t
		// @042: ldc 256000 (0x3e800)
		// @044: getstatic int game.C_100177_cj.field_105660_u
		// @047: idiv
		// @048: i2l
		// @049: ladd
		// @04A: putfield long game.C_100177_cj.field_105661_t
		// @04D: bipush 95 (0x5F)
		// @04F: invokestatic game.C_100198_qn.func_105828_a(byte)long
		// @052: lstore_1
		// @053: goto @029
		// @056: goto @05F
		// @059: astore_3
		// @05A: aload_0
		// @05B: lload_1
		// @05C: putfield long game.C_100177_cj.field_105661_t
		// @05F: aload_0
		// @060: getfield int[] game.C_100177_cj.field_105663_r
		// @063: ifnonnull @068
		// @066: return
		// @067: athrow
		// @068: aload_0
		// @069: getfield long game.C_100177_cj.field_105651_a
		// @06C: lconst_0
		// @06D: lcmp
		// @06E: ifeq @08D
		// @071: lload_1
		// @072: aload_0
		// @073: getfield long game.C_100177_cj.field_105651_a
		// @076: lcmp
		// @077: ifge @07B
		// @07A: return
		// @07B: aload_0
		// @07C: aload_0
		// @07D: getfield int game.C_100177_cj.field_105662_s
		// @080: invokevirtual game.C_100177_cj.func_105630_a(int)void
		// @083: aload_0
		// @084: lconst_0
		// @085: putfield long game.C_100177_cj.field_105651_a
		// @088: aload_0
		// @089: iconst_1
		// @08A: putfield boolean game.C_100177_cj.field_105648_e
		// @08D: aload_0
		// @08E: invokevirtual game.C_100177_cj.func_105637_h()int
		// @091: istore_3
		// @092: aload_0
		// @093: getfield int game.C_100177_cj.field_105665_p
		// @096: iload_3
		// @097: isub
		// @098: aload_0
		// @099: getfield int game.C_100177_cj.field_105650_c
		// @09C: if_icmple @0AD
		// @09F: aload_0
		// @0A0: aload_0
		// @0A1: getfield int game.C_100177_cj.field_105665_p
		// @0A4: iload_3
		// @0A5: isub
		// @0A6: putfield int game.C_100177_cj.field_105650_c
		// @0A9: goto @0AD
		// @0AC: athrow
		// @0AD: aload_0
		// @0AE: getfield int game.C_100177_cj.field_105647_d
		// @0B1: aload_0
		// @0B2: getfield int game.C_100177_cj.field_105649_b
		// @0B5: iadd
		// @0B6: istore #4
		// @0B8: iload #4
		// @0BA: sipush 256 (0x0100)
		// @0BD: iadd
		// @0BE: sipush 16384 (0x4000)
		// @0C1: if_icmple @0C9
		// @0C4: sipush 16128 (0x3F00)
		// @0C7: istore #4
		// @0C9: iload #4
		// @0CB: sipush 256 (0x0100)
		// @0CE: iadd
		// @0CF: aload_0
		// @0D0: getfield int game.C_100177_cj.field_105662_s
		// @0D3: if_icmple @130
		// @0D6: aload_0
		// @0D7: dup
		// @0D8: getfield int game.C_100177_cj.field_105662_s
		// @0DB: sipush 1024 (0x0400)
		// @0DE: iadd
		// @0DF: putfield int game.C_100177_cj.field_105662_s
		// @0E2: aload_0
		// @0E3: getfield int game.C_100177_cj.field_105662_s
		// @0E6: sipush 16384 (0x4000)
		// @0E9: if_icmple @0FB
		// @0EC: goto @0F0
		// @0EF: athrow
		// @0F0: aload_0
		// @0F1: sipush 16384 (0x4000)
		// @0F4: putfield int game.C_100177_cj.field_105662_s
		// @0F7: goto @0FB
		// @0FA: athrow
		// @0FB: aload_0
		// @0FC: invokevirtual game.C_100177_cj.func_105629_a()void
		// @0FF: aload_0
		// @100: aload_0
		// @101: getfield int game.C_100177_cj.field_105662_s
		// @104: invokevirtual game.C_100177_cj.func_105630_a(int)void
		// @107: iconst_0
		// @108: istore_3
		// @109: aload_0
		// @10A: iconst_1
		// @10B: putfield boolean game.C_100177_cj.field_105648_e
		// @10E: iload #4
		// @110: sipush 256 (0x0100)
		// @113: iadd
		// @114: aload_0
		// @115: getfield int game.C_100177_cj.field_105662_s
		// @118: if_icmple @130
		// @11B: aload_0
		// @11C: getfield int game.C_100177_cj.field_105662_s
		// @11F: sipush 256 (0x0100)
		// @122: isub
		// @123: istore #4
		// @125: aload_0
		// @126: iload #4
		// @128: aload_0
		// @129: getfield int game.C_100177_cj.field_105647_d
		// @12C: isub
		// @12D: putfield int game.C_100177_cj.field_105649_b
		// @130: iload_3
		// @131: iload #4
		// @133: if_icmpge @14F
		// @136: aload_0
		// @137: aload_0
		// @138: getfield int[] game.C_100177_cj.field_105663_r
		// @13B: sipush 256 (0x0100)
		// @13E: invokespecial game.C_100177_cj.func_105631_a(int[], int)void
		// @141: aload_0
		// @142: invokevirtual game.C_100177_cj.func_105633_f()void
		// @145: wide (iinc) #3 +256
		// @14B: goto @130
		// @14E: athrow
		// @14F: lload_1
		// @150: aload_0
		// @151: getfield long game.C_100177_cj.field_105645_f
		// @154: lcmp
		// @155: ifle @1B4
		// @158: aload_0
		// @159: getfield boolean game.C_100177_cj.field_105648_e
		// @15C: ifne @1A1
		// @15F: goto @163
		// @162: athrow
		// @163: aload_0
		// @164: getfield int game.C_100177_cj.field_105650_c
		// @167: ifne @187
		// @16A: goto @16E
		// @16D: athrow
		// @16E: aload_0
		// @16F: getfield int game.C_100177_cj.field_105656_j
		// @172: ifne @187
		// @175: goto @179
		// @178: athrow
		// @179: aload_0
		// @17A: invokevirtual game.C_100177_cj.func_105629_a()void
		// @17D: aload_0
		// @17E: lload_1
		// @17F: ldc2_w 2000
		// @182: ladd
		// @183: putfield long game.C_100177_cj.field_105651_a
		// @186: return
		// @187: aload_0
		// @188: aload_0
		// @189: getfield int game.C_100177_cj.field_105656_j
		// @18C: aload_0
		// @18D: getfield int game.C_100177_cj.field_105650_c
		// @190: invokestatic java.lang.Math.min(int, int)int
		// @193: putfield int game.C_100177_cj.field_105649_b
		// @196: aload_0
		// @197: aload_0
		// @198: getfield int game.C_100177_cj.field_105650_c
		// @19B: putfield int game.C_100177_cj.field_105656_j
		// @19E: goto @1A6
		// @1A1: aload_0
		// @1A2: iconst_0
		// @1A3: putfield boolean game.C_100177_cj.field_105648_e
		// @1A6: aload_0
		// @1A7: iconst_0
		// @1A8: putfield int game.C_100177_cj.field_105650_c
		// @1AB: aload_0
		// @1AC: lload_1
		// @1AD: ldc2_w 2000
		// @1B0: ladd
		// @1B1: putfield long game.C_100177_cj.field_105645_f
		// @1B4: aload_0
		// @1B5: iload_3
		// @1B6: putfield int game.C_100177_cj.field_105665_p
		// @1B9: goto @1CA
		// @1BC: astore_3
		// @1BD: aload_0
		// @1BE: invokevirtual game.C_100177_cj.func_105629_a()void
		// @1C1: aload_0
		// @1C2: lload_1
		// @1C3: ldc2_w 2000
		// @1C6: ladd
		// @1C7: putfield long game.C_100177_cj.field_105651_a
		// @1CA: return
	}
	
	void func_105629_a()
	{
		// @0: return
	}
	
	final synchronized void func_105638_e()
	{
		// @00: getstatic game.C_100339_jb game.C_100177_cj.field_105655_m
		// @03: ifnull @67
		// @06: iconst_1
		// @07: istore_1
		// @08: iconst_0
		// @09: istore_2
		// @0A: iload_2
		// @0B: iconst_2
		// @0C: if_icmpge @3F
		// @0F: getstatic game.C_100339_jb game.C_100177_cj.field_105655_m
		// @12: getfield game.C_100177_cj[] game.C_100339_jb.field_107379_f
		// @15: iload_2
		// @16: aaload
		// @17: aload_0
		// @18: if_acmpne @2C
		// @1B: goto @1F
		// @1E: athrow
		// @1F: getstatic game.C_100339_jb game.C_100177_cj.field_105655_m
		// @22: getfield game.C_100177_cj[] game.C_100339_jb.field_107379_f
		// @25: iload_2
		// @26: aconst_null
		// @27: aastore
		// @28: goto @2C
		// @2B: athrow
		// @2C: getstatic game.C_100339_jb game.C_100177_cj.field_105655_m
		// @2F: getfield game.C_100177_cj[] game.C_100339_jb.field_107379_f
		// @32: iload_2
		// @33: aaload
		// @34: ifnull @39
		// @37: iconst_0
		// @38: istore_1
		// @39: iinc #2 +1
		// @3C: goto @0A
		// @3F: iload_1
		// @40: ifeq @67
		// @43: getstatic game.C_100339_jb game.C_100177_cj.field_105655_m
		// @46: iconst_1
		// @47: putfield boolean game.C_100339_jb.field_107388_m
		// @4A: goto @4E
		// @4D: athrow
		// @4E: getstatic game.C_100339_jb game.C_100177_cj.field_105655_m
		// @51: getfield boolean game.C_100339_jb.field_107385_a
		// @54: ifeq @63
		// @57: ldc2_w 50
		// @5A: bipush -126 (0x82)
		// @5C: invokestatic game.C_100138_bo.func_100396_a(long, int)void
		// @5F: goto @4E
		// @62: athrow
		// @63: aconst_null
		// @64: putstatic game.C_100339_jb game.C_100177_cj.field_105655_m
		// @67: aload_0
		// @68: invokevirtual game.C_100177_cj.func_105629_a()void
		// @6B: aload_0
		// @6C: aconst_null
		// @6D: putfield int[] game.C_100177_cj.field_105663_r
		// @70: aload_0
		// @71: iconst_1
		// @72: putfield boolean game.C_100177_cj.field_105659_i
		// @75: return
	}
	
	public static void func_105634_d()
	{
		// @0: aconst_null
		// @1: putstatic game.C_100339_jb game.C_100177_cj.field_105655_m
		// @4: return
	}
	
	final synchronized void func_105644_a(C_100261_md arg0)
	{
		// @0: aload_0
		// @1: aload_1
		// @2: putfield game.C_100261_md game.C_100177_cj.field_105654_l
		// @5: return
	}
	
	C_100177_cj()
	{
		// @00: aload_0
		// @01: invokespecial java.lang.Object.<init>()void
		// @04: aload_0
		// @05: iconst_0
		// @06: putfield boolean game.C_100177_cj.field_105659_i
		// @09: aload_0
		// @0A: bipush 32 (0x20)
		// @0C: putfield int game.C_100177_cj.field_105657_k
		// @0F: aload_0
		// @10: bipush 106 (0x6A)
		// @12: invokestatic game.C_100198_qn.func_105828_a(byte)long
		// @15: putfield long game.C_100177_cj.field_105661_t
		// @18: aload_0
		// @19: bipush 8 (0x08)
		// @1B: anewarray game.C_100261_md
		// @1E: putfield game.C_100261_md[] game.C_100177_cj.field_105664_q
		// @21: aload_0
		// @22: bipush 8 (0x08)
		// @24: anewarray game.C_100261_md
		// @27: putfield game.C_100261_md[] game.C_100177_cj.field_105652_n
		// @2A: aload_0
		// @2B: iconst_0
		// @2C: putfield int game.C_100177_cj.field_105650_c
		// @2F: aload_0
		// @30: iconst_0
		// @31: putfield int game.C_100177_cj.field_105665_p
		// @34: aload_0
		// @35: iconst_1
		// @36: putfield boolean game.C_100177_cj.field_105648_e
		// @39: aload_0
		// @3A: iconst_0
		// @3B: putfield int game.C_100177_cj.field_105656_j
		// @3E: aload_0
		// @3F: iconst_0
		// @40: putfield int game.C_100177_cj.field_105658_h
		// @43: aload_0
		// @44: lconst_0
		// @45: putfield long game.C_100177_cj.field_105645_f
		// @48: aload_0
		// @49: lconst_0
		// @4A: putfield long game.C_100177_cj.field_105651_a
		// @4D: return
	}
}
