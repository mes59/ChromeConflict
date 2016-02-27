package game;

final class C_100103_eh
{
	static int field_104672_h;
	static String field_104671_k;
	static long[] field_104673_i;
	static C_100277_nc[] field_104668_a;
	static String[] field_104665_e;
	static String field_104663_g;
	static int[] field_104662_f;
	static int field_104666_b;
	static C_100037_wb[] field_104664_d;
	static int field_104667_c;
	static C_100302_ka[] field_104669_j;
	private static final String[] field_104670_z;
	
	public static void func_104658_b(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100103_eh.field_104663_g
		// @04: aconst_null
		// @05: putstatic long[] game.C_100103_eh.field_104673_i
		// @08: aconst_null
		// @09: putstatic game.C_100037_wb[] game.C_100103_eh.field_104664_d
		// @0C: aconst_null
		// @0D: putstatic game.C_100277_nc[] game.C_100103_eh.field_104668_a
		// @10: iload_0
		// @11: sipush -20523 (0xAFD5)
		// @14: if_icmpeq @20
		// @17: bipush 49 (0x31)
		// @19: putstatic int game.C_100103_eh.field_104672_h
		// @1C: goto @20
		// @1F: athrow
		// @20: aconst_null
		// @21: putstatic java.lang.String[] game.C_100103_eh.field_104665_e
		// @24: aconst_null
		// @25: putstatic game.C_100302_ka[] game.C_100103_eh.field_104669_j
		// @28: aconst_null
		// @29: putstatic int[] game.C_100103_eh.field_104662_f
		// @2C: aconst_null
		// @2D: putstatic java.lang.String game.C_100103_eh.field_104671_k
		// @30: goto @54
		// @33: astore_1
		// @34: aload_1
		// @35: new java.lang.StringBuilder
		// @38: dup
		// @39: invokespecial java.lang.StringBuilder.<init>()void
		// @3C: getstatic java.lang.String[] game.C_100103_eh.field_104670_z
		// @3F: iconst_0
		// @40: aaload
		// @41: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @44: iload_0
		// @45: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @48: bipush 41 (0x29)
		// @4A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @50: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @53: athrow
		// @54: return
	}
	
	static final boolean func_104657_c(int arg0)
	{
		// @00: iconst_1
		// @01: putstatic boolean game.C_100170_cm.field_105539_e
		// @04: iload_0
		// @05: iconst_1
		// @06: if_icmpeq @12
		// @09: bipush 39 (0x27)
		// @0B: putstatic int game.C_100103_eh.field_104672_h
		// @0E: goto @12
		// @11: athrow
		// @12: bipush -63 (0xC1)
		// @14: invokestatic game.C_100198_qn.func_105828_a(byte)long
		// @17: ldc2_w -15000
		// @1A: lsub
		// @1B: putstatic long game.C_100293_kj.field_106887_d
		// @1E: bipush 11 (0x0B)
		// @20: getstatic int game.C_100087_n.field_100697_v
		// @23: if_icmpne @2B
		// @26: iconst_1
		// @27: goto @2C
		// @2A: athrow
		// @2B: iconst_0
		// @2C: ireturn
		// @2D: astore_1
		// @2E: aload_1
		// @2F: new java.lang.StringBuilder
		// @32: dup
		// @33: invokespecial java.lang.StringBuilder.<init>()void
		// @36: getstatic java.lang.String[] game.C_100103_eh.field_104670_z
		// @39: iconst_3
		// @3A: aaload
		// @3B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3E: iload_0
		// @3F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @42: bipush 41 (0x29)
		// @44: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @47: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @4A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4D: athrow
	}
	
	static final void func_104659_a(int arg0)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #6
		// @005: iload_0
		// @006: bipush 104 (0x68)
		// @008: if_icmpgt @00C
		// @00B: return
		// @00C: getstatic game.C_100278_nd game.C_100288_jn.field_106839_f
		// @00F: astore_1
		// @010: aload_1
		// @011: iconst_0
		// @012: invokevirtual game.C_100278_nd.func_101156_c(boolean)int
		// @015: istore_2
		// @016: iload_2
		// @017: ifne @08F
		// @01A: getstatic game.C_100202_qi game.C_100191_rg.field_100848_j
		// @01D: bipush 107 (0x6B)
		// @01F: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @022: checkcast game.C_100197_ra
		// @025: astore_3
		// @026: aconst_null
		// @027: aload_3
		// @028: if_acmpeq @02F
		// @02B: goto @036
		// @02E: athrow
		// @02F: sipush 13313 (0x3401)
		// @032: invokestatic game.C_100095_fe.func_103371_l(int)void
		// @035: return
		// @036: aload_1
		// @037: iconst_0
		// @038: invokevirtual game.C_100278_nd.func_101156_c(boolean)int
		// @03B: istore #4
		// @03D: iload #4
		// @03F: iconst_m1
		// @040: ixor
		// @041: iconst_m1
		// @042: if_icmpeq @05C
		// @045: iload #4
		// @047: newarray byte[]
		// @049: astore #5
		// @04B: aload_1
		// @04C: aload #5
		// @04E: iload #4
		// @050: iconst_0
		// @051: sipush -7623 (0xE239)
		// @054: invokevirtual game.C_100278_nd.func_101149_a(byte[], int, int, int)void
		// @057: iload #6
		// @059: ifeq @05F
		// @05C: aconst_null
		// @05D: astore #5
		// @05F: aload_1
		// @060: dup
		// @061: getfield int game.C_100278_nd.field_101177_n
		// @064: iconst_4
		// @065: iadd
		// @066: putfield int game.C_100278_nd.field_101177_n
		// @069: aload_1
		// @06A: bipush -34 (0xDE)
		// @06C: invokevirtual game.C_100278_nd.func_101150_k(int)boolean
		// @06F: ifne @079
		// @072: sipush 13313 (0x3401)
		// @075: invokestatic game.C_100095_fe.func_103371_l(int)void
		// @078: return
		// @079: aload_3
		// @07A: iconst_1
		// @07B: putfield boolean game.C_100197_ra.field_100863_v
		// @07E: aload_3
		// @07F: aload #5
		// @081: putfield byte[] game.C_100197_ra.field_100868_q
		// @084: aload_3
		// @085: bipush 45 (0x2D)
		// @087: invokevirtual game.C_100197_ra.func_100583_c(int)void
		// @08A: iload #6
		// @08C: ifeq @129
		// @08F: iconst_1
		// @090: iload_2
		// @091: if_icmpeq @0C6
		// @094: goto @098
		// @097: athrow
		// @098: iconst_1
		// @099: new java.lang.StringBuilder
		// @09C: dup
		// @09D: invokespecial java.lang.StringBuilder.<init>()void
		// @0A0: getstatic java.lang.String[] game.C_100103_eh.field_104670_z
		// @0A3: iconst_1
		// @0A4: aaload
		// @0A5: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0A8: bipush 68 (0x44)
		// @0AA: invokestatic game.C_100316_lc.func_102399_d(byte)java.lang.String
		// @0AD: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0B0: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @0B3: aconst_null
		// @0B4: invokestatic game.C_100036_gg.func_103142_a(int, java.lang.String, java.lang.Throwable)void
		// @0B7: sipush 13313 (0x3401)
		// @0BA: invokestatic game.C_100095_fe.func_103371_l(int)void
		// @0BD: iload #6
		// @0BF: ifeq @129
		// @0C2: goto @0C6
		// @0C5: athrow
		// @0C6: aload_1
		// @0C7: sipush -1543 (0xF9F9)
		// @0CA: invokevirtual game.C_100278_nd.func_101171_e(int)int
		// @0CD: istore_3
		// @0CE: getstatic game.C_100202_qi game.C_100291_jj.field_106877_c
		// @0D1: bipush 22 (0x16)
		// @0D3: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @0D6: checkcast game.C_100131_te
		// @0D9: astore #4
		// @0DB: aload #4
		// @0DD: ifnull @111
		// @0E0: iload_3
		// @0E1: iconst_m1
		// @0E2: ixor
		// @0E3: iload #6
		// @0E5: ifne @11E
		// @0E8: aload #4
		// @0EA: getfield int game.C_100131_te.field_100761_l
		// @0ED: iconst_m1
		// @0EE: ixor
		// @0EF: if_icmpne @0FF
		// @0F2: goto @0F6
		// @0F5: athrow
		// @0F6: iload #6
		// @0F8: ifeq @111
		// @0FB: goto @0FF
		// @0FE: athrow
		// @0FF: getstatic game.C_100202_qi game.C_100291_jj.field_106877_c
		// @102: bipush 46 (0x2E)
		// @104: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @107: checkcast game.C_100131_te
		// @10A: astore #4
		// @10C: iload #6
		// @10E: ifeq @0DB
		// @111: aconst_null
		// @112: aload #4
		// @114: if_acmpne @122
		// @117: sipush 13313 (0x3401)
		// @11A: goto @11E
		// @11D: athrow
		// @11E: invokestatic game.C_100095_fe.func_103371_l(int)void
		// @121: return
		// @122: aload #4
		// @124: bipush 45 (0x2D)
		// @126: invokevirtual game.C_100131_te.func_100583_c(int)void
		// @129: goto @14D
		// @12C: astore_1
		// @12D: aload_1
		// @12E: new java.lang.StringBuilder
		// @131: dup
		// @132: invokespecial java.lang.StringBuilder.<init>()void
		// @135: getstatic java.lang.String[] game.C_100103_eh.field_104670_z
		// @138: iconst_2
		// @139: aaload
		// @13A: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @13D: iload_0
		// @13E: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @141: bipush 41 (0x29)
		// @143: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @146: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @149: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @14C: athrow
		// @14D: return
	}
	
	static
	{
		// @00: iconst_4
		// @01: anewarray java.lang.String
		// @04: dup
		// @05: iconst_0
		// @06: ldc "tVRGS"
		// @08: invokestatic game.C_100103_eh.func_104661_z(java.lang.String)char[]
		// @0B: invokestatic game.C_100103_eh.func_104660_z(char[])java.lang.String
		// @0E: aastore
		// @0F: dup
		// @10: iconst_1
		// @11: ldc "P\u000fF&"
		// @13: invokestatic game.C_100103_eh.func_104661_z(java.lang.String)char[]
		// @16: invokestatic game.C_100103_eh.func_104660_z(char[])java.lang.String
		// @19: aastore
		// @1A: dup
		// @1B: iconst_2
		// @1C: ldc "tVRDS"
		// @1E: invokestatic game.C_100103_eh.func_104661_z(java.lang.String)char[]
		// @21: invokestatic game.C_100103_eh.func_104660_z(char[])java.lang.String
		// @24: aastore
		// @25: dup
		// @26: iconst_3
		// @27: ldc "tVRES"
		// @29: invokestatic game.C_100103_eh.func_104661_z(java.lang.String)char[]
		// @2C: invokestatic game.C_100103_eh.func_104660_z(char[])java.lang.String
		// @2F: aastore
		// @30: putstatic java.lang.String[] game.C_100103_eh.field_104670_z
		// @33: iconst_0
		// @34: putstatic int game.C_100103_eh.field_104672_h
		// @37: ldc "P\u001e\u0018c\u000fpW\u0010c\u001f1[\u0004v\u0017pP\u001dr\u0012~P\\i\u001d1[\u001de\u00131L\tj\u001e1]\u001dh[s[\\`\u0014dP\u0018&\u000fyL\u0013s\u001cy\u001e\u0008n\u001e1R\u0015h\u00101Q\u0012&\u0014dL\\q\u001esM\u0015r\u001e?\u0002\u001etE9W\u0012&\u000fy[\\N\u001e}N\\U\u001erJ\u0015i\u00158"
		// @39: invokestatic game.C_100103_eh.func_104661_z(java.lang.String)char[]
		// @3C: invokestatic game.C_100103_eh.func_104660_z(char[])java.lang.String
		// @3F: putstatic java.lang.String game.C_100103_eh.field_104663_g
		// @42: bipush 32 (0x20)
		// @44: newarray long[]
		// @46: putstatic long[] game.C_100103_eh.field_104673_i
		// @49: ldc "AR\u0019g\u0008t\u001e\u0019h\u000ftL\\\u007f\u0014dL\\b\u001ae[\\i\u001d1\\\u0015t\u000fy\u001e\u0008i[tP\u001dd\u0017t\u001e\u001fn\u001ae\u0004"
		// @4B: invokestatic game.C_100103_eh.func_104661_z(java.lang.String)char[]
		// @4E: invokestatic game.C_100103_eh.func_104660_z(char[])java.lang.String
		// @51: putstatic java.lang.String game.C_100103_eh.field_104671_k
		// @54: bipush 12 (0x0C)
		// @56: anewarray java.lang.String
		// @59: dup
		// @5A: iconst_0
		// @5B: ldc "Y{=J/Y"
		// @5D: invokestatic game.C_100103_eh.func_104661_z(java.lang.String)char[]
		// @60: invokestatic game.C_100103_eh.func_104660_z(char[])java.lang.String
		// @63: aastore
		// @64: dup
		// @65: iconst_1
		// @66: ldc "-\u001bL8[zn\u0011"
		// @68: invokestatic game.C_100103_eh.func_104661_z(java.lang.String)char[]
		// @6B: invokestatic game.C_100103_eh.func_104660_z(char[])java.lang.String
		// @6E: aastore
		// @6F: dup
		// @70: iconst_2
		// @71: ldc "Bv5C7Um"
		// @73: invokestatic game.C_100103_eh.func_104661_z(java.lang.String)char[]
		// @76: invokestatic game.C_100103_eh.func_104660_z(char[])java.lang.String
		// @79: aastore
		// @7A: dup
		// @7B: iconst_3
		// @7C: ldc "-\u001bL8[Vt"
		// @7E: invokestatic game.C_100103_eh.func_104661_z(java.lang.String)char[]
		// @81: invokestatic game.C_100103_eh.func_104660_z(char[])java.lang.String
		// @84: aastore
		// @85: dup
		// @86: iconst_4
		// @87: ldc "Tp9T<H\u001e?G+P}5R\""
		// @89: invokestatic game.C_100103_eh.func_104661_z(java.lang.String)char[]
		// @8C: invokestatic game.C_100103_eh.func_104660_z(char[])java.lang.String
		// @8F: aastore
		// @90: dup
		// @91: iconst_5
		// @92: ldc "-\u001bL8[Et"
		// @94: invokestatic game.C_100103_eh.func_104661_z(java.lang.String)char[]
		// @97: invokestatic game.C_100103_eh.func_104660_z(char[])java.lang.String
		// @9A: aastore
		// @9B: dup
		// @9C: bipush 6 (0x06)
		// @9E: ldc "Tp9T<H\u001e;C5Tl=R2^p"
		// @A0: invokestatic game.C_100103_eh.func_104661_z(java.lang.String)char[]
		// @A3: invokestatic game.C_100103_eh.func_104660_z(char[])java.lang.String
		// @A6: aastore
		// @A7: dup
		// @A8: bipush 7 (0x07)
		// @AA: ldc "-\u001bL8[VtSu"
		// @AC: invokestatic game.C_100103_eh.func_104661_z(java.lang.String)char[]
		// @AF: invokestatic game.C_100103_eh.func_104660_z(char[])java.lang.String
		// @B2: aastore
		// @B3: dup
		// @B4: bipush 8 (0x08)
		// @B6: ldc "[k1V"
		// @B8: invokestatic game.C_100103_eh.func_104661_z(java.lang.String)char[]
		// @BB: invokestatic game.C_100103_eh.func_104660_z(char[])java.lang.String
		// @BE: aastore
		// @BF: dup
		// @C0: bipush 9 (0x09)
		// @C2: ldc "-\u001bL8^"
		// @C4: invokestatic game.C_100103_eh.func_104661_z(java.lang.String)char[]
		// @C7: invokestatic game.C_100103_eh.func_104660_z(char[])java.lang.String
		// @CA: aastore
		// @CB: dup
		// @CC: bipush 10 (0x0A)
		// @CE: ldc "Ev.S(E"
		// @D0: invokestatic game.C_100103_eh.func_104661_z(java.lang.String)char[]
		// @D3: invokestatic game.C_100103_eh.func_104660_z(char[])java.lang.String
		// @D6: aastore
		// @D7: dup
		// @D8: bipush 11 (0x0B)
		// @DA: ldc "-\u001bL8^"
		// @DC: invokestatic game.C_100103_eh.func_104661_z(java.lang.String)char[]
		// @DF: invokestatic game.C_100103_eh.func_104660_z(char[])java.lang.String
		// @E2: aastore
		// @E3: putstatic java.lang.String[] game.C_100103_eh.field_104665_e
		// @E6: iconst_4
		// @E7: anewarray game.C_100302_ka
		// @EA: putstatic game.C_100302_ka[] game.C_100103_eh.field_104669_j
		// @ED: return
	}
	
	private static char[] func_104661_z(String arg0)
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
		// @0E: bipush 123 (0x7B)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_104660_z(char[] arg0)
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
		// @30: bipush 17 (0x11)
		// @32: goto @46
		// @35: bipush 62 (0x3E)
		// @37: goto @46
		// @3A: bipush 124 (0x7C)
		// @3C: goto @46
		// @3F: bipush 6 (0x06)
		// @41: goto @46
		// @44: bipush 123 (0x7B)
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
