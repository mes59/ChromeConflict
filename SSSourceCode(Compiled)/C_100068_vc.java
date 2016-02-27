package game;

final class C_100068_vc
{
	static int field_104343_e;
	static C_100202_qi field_104341_g;
	static C_100211_qd field_104342_d;
	static String field_104345_c;
	static int[] field_104340_f;
	static C_100037_wb[] field_104344_b;
	static boolean field_104348_h;
	static String field_104349_i;
	static int[] field_104346_a;
	private static final String[] field_104347_z;
	
	public static void func_104334_a(int arg0)
	{
		// @00: aconst_null
		// @01: putstatic int[] game.C_100068_vc.field_104340_f
		// @04: aconst_null
		// @05: putstatic game.C_100211_qd game.C_100068_vc.field_104342_d
		// @08: aconst_null
		// @09: putstatic game.C_100202_qi game.C_100068_vc.field_104341_g
		// @0C: aconst_null
		// @0D: putstatic java.lang.String game.C_100068_vc.field_104345_c
		// @10: bipush 24 (0x18)
		// @12: bipush 46 (0x2E)
		// @14: iload_0
		// @15: isub
		// @16: bipush 48 (0x30)
		// @18: idiv
		// @19: idiv
		// @1A: istore_1
		// @1B: aconst_null
		// @1C: putstatic java.lang.String game.C_100068_vc.field_104349_i
		// @1F: aconst_null
		// @20: putstatic game.C_100037_wb[] game.C_100068_vc.field_104344_b
		// @23: aconst_null
		// @24: putstatic int[] game.C_100068_vc.field_104346_a
		// @27: goto @4C
		// @2A: astore_1
		// @2B: aload_1
		// @2C: new java.lang.StringBuilder
		// @2F: dup
		// @30: invokespecial java.lang.StringBuilder.<init>()void
		// @33: getstatic java.lang.String[] game.C_100068_vc.field_104347_z
		// @36: bipush 6 (0x06)
		// @38: aaload
		// @39: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3C: iload_0
		// @3D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @40: bipush 41 (0x29)
		// @42: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @45: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @48: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @4B: athrow
		// @4C: return
	}
	
	static final void func_104338_a(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #12
		// @005: getstatic int game.C_100196_rb.field_105827_i
		// @008: iload #5
		// @00A: if_icmple @01B
		// @00D: iload_1
		// @00E: getstatic int game.C_100196_rb.field_105827_i
		// @011: iload #5
		// @013: isub
		// @014: isub
		// @015: istore_1
		// @016: getstatic int game.C_100196_rb.field_105827_i
		// @019: istore #5
		// @01B: iload_1
		// @01C: iload #5
		// @01E: iadd
		// @01F: iconst_m1
		// @020: ixor
		// @021: getstatic int game.C_100196_rb.field_105820_b
		// @024: iconst_m1
		// @025: ixor
		// @026: if_icmplt @02D
		// @029: goto @035
		// @02C: athrow
		// @02D: iload #5
		// @02F: ineg
		// @030: getstatic int game.C_100196_rb.field_105820_b
		// @033: iadd
		// @034: istore_1
		// @035: iload_0
		// @036: iconst_m1
		// @037: ixor
		// @038: getstatic int game.C_100196_rb.field_105816_f
		// @03B: iconst_m1
		// @03C: ixor
		// @03D: if_icmpgt @044
		// @040: goto @053
		// @043: athrow
		// @044: iload #4
		// @046: iload_0
		// @047: ineg
		// @048: getstatic int game.C_100196_rb.field_105816_f
		// @04B: iadd
		// @04C: isub
		// @04D: istore #4
		// @04F: getstatic int game.C_100196_rb.field_105816_f
		// @052: istore_0
		// @053: iload #4
		// @055: iload_0
		// @056: iadd
		// @057: getstatic int game.C_100196_rb.field_105823_l
		// @05A: if_icmpgt @061
		// @05D: goto @069
		// @060: athrow
		// @061: iload_0
		// @062: ineg
		// @063: getstatic int game.C_100196_rb.field_105823_l
		// @066: iadd
		// @067: istore #4
		// @069: iload_2
		// @06A: iload_1
		// @06B: iconst_m1
		// @06C: ixor
		// @06D: if_icmple @07A
		// @070: iconst_0
		// @071: iload #4
		// @073: if_icmplt @07B
		// @076: goto @07A
		// @079: athrow
		// @07A: return
		// @07B: iload_0
		// @07C: getstatic int game.C_100196_rb.field_105819_e
		// @07F: imul
		// @080: iload #5
		// @082: iadd
		// @083: istore #6
		// @085: iload_1
		// @086: ineg
		// @087: getstatic int game.C_100196_rb.field_105819_e
		// @08A: iadd
		// @08B: istore #7
		// @08D: iload #4
		// @08F: ineg
		// @090: istore_0
		// @091: iconst_0
		// @092: iload_0
		// @093: if_icmple @154
		// @096: iload #12
		// @098: ifne @1A9
		// @09B: iload_1
		// @09C: ineg
		// @09D: istore #5
		// @09F: iload #5
		// @0A1: ifge @145
		// @0A4: getstatic int[] game.C_100196_rb.field_105818_d
		// @0A7: iload #6
		// @0A9: iaload
		// @0AA: istore #8
		// @0AC: iload #8
		// @0AE: ldc -1991509336 (0x894bfaa8)
		// @0B0: ishr
		// @0B1: sipush 255 (0x00FF)
		// @0B4: iand
		// @0B5: iconst_m1
		// @0B6: ixor
		// @0B7: iload_3
		// @0B8: iconst_m1
		// @0B9: ixor
		// @0BA: iload #12
		// @0BC: ifne @149
		// @0BF: if_icmpge @13A
		// @0C2: goto @0C6
		// @0C5: athrow
		// @0C6: ldc 65280 (0xff00)
		// @0C8: iload #8
		// @0CA: iand
		// @0CB: ldc 1692389448 (0x64dfd048)
		// @0CD: ishr
		// @0CE: iconst_m1
		// @0CF: ixor
		// @0D0: iload #8
		// @0D2: ldc 16711680 (0xff0000)
		// @0D4: iand
		// @0D5: ldc -1563774000 (0xa2cab3d0)
		// @0D7: ishr
		// @0D8: iconst_m1
		// @0D9: ixor
		// @0DA: if_icmpgt @13A
		// @0DD: goto @0E1
		// @0E0: athrow
		// @0E1: bipush -60 (0xC4)
		// @0E3: iload #8
		// @0E5: ldc -1224153937 (0xb708e4af)
		// @0E7: ishr
		// @0E8: sipush 510 (0x01FE)
		// @0EB: iand
		// @0EC: iadd
		// @0ED: istore #9
		// @0EF: iload #9
		// @0F1: iconst_m1
		// @0F2: ixor
		// @0F3: sipush -256 (0xFF00)
		// @0F6: if_icmplt @0FD
		// @0F9: goto @102
		// @0FC: athrow
		// @0FD: sipush 255 (0x00FF)
		// @100: istore #9
		// @102: iload #8
		// @104: ldc 65280 (0xff00)
		// @106: iand
		// @107: istore #10
		// @109: iload #10
		// @10B: ldc -364156223 (0xea4b6ac1)
		// @10D: ishr
		// @10E: iload #10
		// @110: ldc 820741733 (0x30eb8665)
		// @112: ishr
		// @113: ineg
		// @114: iadd
		// @115: ldc 65280 (0xff00)
		// @117: iand
		// @118: istore #10
		// @11A: iload #8
		// @11C: sipush 255 (0x00FF)
		// @11F: iand
		// @120: ldc -1903673373 (0x8e883fe3)
		// @122: ishr
		// @123: istore #11
		// @125: getstatic int[] game.C_100196_rb.field_105818_d
		// @128: iload #6
		// @12A: iload #11
		// @12C: iload #10
		// @12E: iload #9
		// @130: ldc 1757118320 (0x68bb7f70)
		// @132: ishl
		// @133: invokestatic game.C_100116_ei.func_104117_a(int, int)int
		// @136: invokestatic game.C_100116_ei.func_104117_a(int, int)int
		// @139: iastore
		// @13A: iinc #6 +1
		// @13D: iinc #5 +1
		// @140: iload #12
		// @142: ifeq @09F
		// @145: iload #6
		// @147: iload #7
		// @149: iadd
		// @14A: istore #6
		// @14C: iinc #0 +1
		// @14F: iload #12
		// @151: ifeq @091
		// @154: goto @1A9
		// @157: astore #6
		// @159: aload #6
		// @15B: new java.lang.StringBuilder
		// @15E: dup
		// @15F: invokespecial java.lang.StringBuilder.<init>()void
		// @162: getstatic java.lang.String[] game.C_100068_vc.field_104347_z
		// @165: iconst_4
		// @166: aaload
		// @167: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @16A: iload_0
		// @16B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @16E: bipush 44 (0x2C)
		// @170: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @173: iload_1
		// @174: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @177: bipush 44 (0x2C)
		// @179: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @17C: iload_2
		// @17D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @180: bipush 44 (0x2C)
		// @182: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @185: iload_3
		// @186: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @189: bipush 44 (0x2C)
		// @18B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @18E: iload #4
		// @190: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @193: bipush 44 (0x2C)
		// @195: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @198: iload #5
		// @19A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @19D: bipush 41 (0x29)
		// @19F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1A2: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @1A5: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @1A8: athrow
		// @1A9: return
	}
	
	public final String toString()
	{
		// @00: new java.lang.IllegalStateException
		// @03: dup
		// @04: invokespecial java.lang.IllegalStateException.<init>()void
		// @07: athrow
		// @08: astore_1
		// @09: aload_1
		// @0A: getstatic java.lang.String[] game.C_100068_vc.field_104347_z
		// @0D: iconst_3
		// @0E: aaload
		// @0F: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @12: athrow
	}
	
	static final boolean func_104337_b(int arg0)
	{
		// @00: iload_0
		// @01: sipush 510 (0x01FE)
		// @04: if_icmpeq @09
		// @07: iconst_0
		// @08: ireturn
		// @09: getstatic boolean game.C_100247_pa.field_106416_c
		// @0C: ireturn
		// @0D: astore_1
		// @0E: aload_1
		// @0F: new java.lang.StringBuilder
		// @12: dup
		// @13: invokespecial java.lang.StringBuilder.<init>()void
		// @16: getstatic java.lang.String[] game.C_100068_vc.field_104347_z
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
	
	static final void func_104339_a(int arg0, String arg1, String arg2, int arg3, boolean arg4)
	{
		// @00: iload #4
		// @02: iconst_1
		// @03: if_icmpeq @11
		// @06: aconst_null
		// @07: checkcast game.C_100211_qd
		// @0A: putstatic game.C_100211_qd game.C_100068_vc.field_104342_d
		// @0D: goto @11
		// @10: athrow
		// @11: getstatic game.C_100302_ka game.C_100235_om.field_106296_j
		// @14: aload_2
		// @15: putfield java.lang.String game.C_100302_ka.field_101890_ab
		// @18: getstatic game.C_100302_ka game.C_100235_om.field_106296_j
		// @1B: aload_1
		// @1C: putfield java.lang.String game.C_100302_ka.field_101856_I
		// @1F: getstatic game.C_100302_ka game.C_100235_om.field_106296_j
		// @22: dup
		// @23: getfield int game.C_100302_ka.field_101886_Kb
		// @26: getstatic game.C_100302_ka game.C_100127_tl.field_104946_d
		// @29: getfield int game.C_100302_ka.field_101886_Kb
		// @2C: iadd
		// @2D: putfield int game.C_100302_ka.field_101886_Kb
		// @30: getstatic game.C_100302_ka game.C_100235_om.field_106296_j
		// @33: iload_3
		// @34: putfield int game.C_100302_ka.field_101830_gb
		// @37: getstatic game.C_100302_ka game.C_100127_tl.field_104946_d
		// @3A: dup
		// @3B: getfield int game.C_100302_ka.field_101841_Pb
		// @3E: getstatic game.C_100302_ka game.C_100127_tl.field_104946_d
		// @41: getfield int game.C_100302_ka.field_101886_Kb
		// @44: iadd
		// @45: putfield int game.C_100302_ka.field_101841_Pb
		// @48: getstatic game.C_100302_ka game.C_100127_tl.field_104946_d
		// @4B: iload_0
		// @4C: putfield int game.C_100302_ka.field_101886_Kb
		// @4F: getstatic game.C_100302_ka game.C_100235_om.field_106296_j
		// @52: dup
		// @53: getfield int game.C_100302_ka.field_101886_Kb
		// @56: getstatic game.C_100302_ka game.C_100127_tl.field_104946_d
		// @59: getfield int game.C_100302_ka.field_101886_Kb
		// @5C: isub
		// @5D: putfield int game.C_100302_ka.field_101886_Kb
		// @60: getstatic game.C_100302_ka game.C_100127_tl.field_104946_d
		// @63: dup
		// @64: getfield int game.C_100302_ka.field_101841_Pb
		// @67: getstatic game.C_100302_ka game.C_100127_tl.field_104946_d
		// @6A: getfield int game.C_100302_ka.field_101886_Kb
		// @6D: isub
		// @6E: putfield int game.C_100302_ka.field_101841_Pb
		// @71: goto @DE
		// @74: astore #5
		// @76: aload #5
		// @78: new java.lang.StringBuilder
		// @7B: dup
		// @7C: invokespecial java.lang.StringBuilder.<init>()void
		// @7F: getstatic java.lang.String[] game.C_100068_vc.field_104347_z
		// @82: iconst_0
		// @83: aaload
		// @84: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @87: iload_0
		// @88: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @8B: bipush 44 (0x2C)
		// @8D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @90: aload_1
		// @91: ifnull @9D
		// @94: getstatic java.lang.String[] game.C_100068_vc.field_104347_z
		// @97: iconst_2
		// @98: aaload
		// @99: goto @A2
		// @9C: athrow
		// @9D: getstatic java.lang.String[] game.C_100068_vc.field_104347_z
		// @A0: iconst_1
		// @A1: aaload
		// @A2: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @A5: bipush 44 (0x2C)
		// @A7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @AA: aload_2
		// @AB: ifnull @B7
		// @AE: getstatic java.lang.String[] game.C_100068_vc.field_104347_z
		// @B1: iconst_2
		// @B2: aaload
		// @B3: goto @BC
		// @B6: athrow
		// @B7: getstatic java.lang.String[] game.C_100068_vc.field_104347_z
		// @BA: iconst_1
		// @BB: aaload
		// @BC: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @BF: bipush 44 (0x2C)
		// @C1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @C4: iload_3
		// @C5: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @C8: bipush 44 (0x2C)
		// @CA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @CD: iload #4
		// @CF: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @D2: bipush 41 (0x29)
		// @D4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D7: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @DA: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @DD: athrow
		// @DE: return
	}
	
	static
	{
		// @00: bipush 7 (0x07)
		// @02: anewarray java.lang.String
		// @05: dup
		// @06: iconst_0
		// @07: ldc "*Y)\u001b%"
		// @09: invokestatic game.C_100068_vc.func_104336_z(java.lang.String)char[]
		// @0C: invokestatic game.C_100068_vc.func_104335_z(char[])java.lang.String
		// @0F: aastore
		// @10: dup
		// @11: iconst_1
		// @12: ldc "2Ok3"
		// @14: invokestatic game.C_100068_vc.func_104336_z(java.lang.String)char[]
		// @17: invokestatic game.C_100068_vc.func_104335_z(char[])java.lang.String
		// @1A: aastore
		// @1B: dup
		// @1C: iconst_2
		// @1D: ldc "'\u0014)qp"
		// @1F: invokestatic game.C_100068_vc.func_104336_z(java.lang.String)char[]
		// @22: invokestatic game.C_100068_vc.func_104335_z(char[])java.lang.String
		// @25: aastore
		// @26: dup
		// @27: iconst_3
		// @28: ldc "*Y)+b\u000fNu6c;\u0012."
		// @2A: invokestatic game.C_100068_vc.func_104336_z(java.lang.String)char[]
		// @2D: invokestatic game.C_100068_vc.func_104335_z(char[])java.lang.String
		// @30: aastore
		// @31: dup
		// @32: iconst_4
		// @33: ldc "*Y)\u001c%"
		// @35: invokestatic game.C_100068_vc.func_104336_z(java.lang.String)char[]
		// @38: invokestatic game.C_100068_vc.func_104335_z(char[])java.lang.String
		// @3B: aastore
		// @3C: dup
		// @3D: iconst_5
		// @3E: ldc "*Y)\u001d%"
		// @40: invokestatic game.C_100068_vc.func_104336_z(java.lang.String)char[]
		// @43: invokestatic game.C_100068_vc.func_104335_z(char[])java.lang.String
		// @46: aastore
		// @47: dup
		// @48: bipush 6 (0x06)
		// @4A: ldc "*Y)\u001e%"
		// @4C: invokestatic game.C_100068_vc.func_104336_z(java.lang.String)char[]
		// @4F: invokestatic game.C_100068_vc.func_104335_z(char[])java.lang.String
		// @52: aastore
		// @53: putstatic java.lang.String[] game.C_100068_vc.field_104347_z
		// @56: iconst_m1
		// @57: putstatic int game.C_100068_vc.field_104343_e
		// @5A: ldc "`\u001f7a7`\u001f6a1y\u00089"
		// @5C: invokestatic game.C_100068_vc.func_104336_z(java.lang.String)char[]
		// @5F: invokestatic game.C_100068_vc.func_104335_z(char[])java.lang.String
		// @62: putstatic java.lang.String game.C_100068_vc.field_104345_c
		// @65: new game.C_100202_qi
		// @68: dup
		// @69: invokespecial game.C_100202_qi.<init>()void
		// @6C: putstatic game.C_100202_qi game.C_100068_vc.field_104341_g
		// @6F: iconst_0
		// @70: putstatic boolean game.C_100068_vc.field_104348_h
		// @73: ldc "\u001fHb>y9"
		// @75: invokestatic game.C_100068_vc.func_104336_z(java.lang.String)char[]
		// @78: invokestatic game.C_100068_vc.func_104335_z(char[])java.lang.String
		// @7B: putstatic java.lang.String game.C_100068_vc.field_104349_i
		// @7E: bipush 36 (0x24)
		// @80: newarray int[]
		// @82: putstatic int[] game.C_100068_vc.field_104346_a
		// @85: getstatic int[] game.C_100068_vc.field_104346_a
		// @88: bipush 20 (0x14)
		// @8A: bipush 60 (0x3C)
		// @8C: iastore
		// @8D: getstatic int[] game.C_100068_vc.field_104346_a
		// @90: bipush 6 (0x06)
		// @92: bipush 30 (0x1E)
		// @94: iastore
		// @95: getstatic int[] game.C_100068_vc.field_104346_a
		// @98: bipush 33 (0x21)
		// @9A: sipush 180 (0x00B4)
		// @9D: iastore
		// @9E: getstatic int[] game.C_100068_vc.field_104346_a
		// @A1: bipush 7 (0x07)
		// @A3: bipush 30 (0x1E)
		// @A5: iastore
		// @A6: getstatic int[] game.C_100068_vc.field_104346_a
		// @A9: bipush 8 (0x08)
		// @AB: bipush 60 (0x3C)
		// @AD: iastore
		// @AE: getstatic int[] game.C_100068_vc.field_104346_a
		// @B1: bipush 9 (0x09)
		// @B3: bipush 30 (0x1E)
		// @B5: iastore
		// @B6: getstatic int[] game.C_100068_vc.field_104346_a
		// @B9: bipush 34 (0x22)
		// @BB: bipush 120 (0x78)
		// @BD: iastore
		// @BE: getstatic int[] game.C_100068_vc.field_104346_a
		// @C1: bipush 19 (0x13)
		// @C3: bipush 60 (0x3C)
		// @C5: iastore
		// @C6: getstatic int[] game.C_100068_vc.field_104346_a
		// @C9: bipush 32 (0x20)
		// @CB: sipush 360 (0x0168)
		// @CE: iastore
		// @CF: return
	}
	
	private static char[] func_104336_z(String arg0)
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
		// @0E: bipush 13 (0x0D)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_104335_z(char[] arg0)
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
		// @30: bipush 92 (0x5C)
		// @32: goto @46
		// @35: bipush 58 (0x3A)
		// @37: goto @46
		// @3A: bipush 7 (0x07)
		// @3C: goto @46
		// @3F: bipush 95 (0x5F)
		// @41: goto @46
		// @44: bipush 13 (0x0D)
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
