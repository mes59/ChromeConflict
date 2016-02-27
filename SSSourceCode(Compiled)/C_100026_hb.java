package game;

final class C_100026_hb extends C_100261_md
{
	private C_100202_qi field_100931_o;
	private C_100202_qi field_100928_q;
	private int field_100929_p;
	private int field_100930_n;
	
	final int func_100913_a()
	{
		// @0: iconst_0
		// @1: ireturn
	}
	
	final synchronized void func_100910_a(int[] arg0, int arg1, int arg2)
	{
		// @00: aload_0
		// @01: getfield int game.C_100026_hb.field_100929_p
		// @04: ifge @0F
		// @07: aload_0
		// @08: aload_1
		// @09: iload_2
		// @0A: iload_3
		// @0B: invokespecial game.C_100026_hb.func_100927_c(int[], int, int)void
		// @0E: return
		// @0F: aload_0
		// @10: getfield int game.C_100026_hb.field_100930_n
		// @13: iload_3
		// @14: iadd
		// @15: aload_0
		// @16: getfield int game.C_100026_hb.field_100929_p
		// @19: if_icmpge @2E
		// @1C: aload_0
		// @1D: dup
		// @1E: getfield int game.C_100026_hb.field_100930_n
		// @21: iload_3
		// @22: iadd
		// @23: putfield int game.C_100026_hb.field_100930_n
		// @26: aload_0
		// @27: aload_1
		// @28: iload_2
		// @29: iload_3
		// @2A: invokespecial game.C_100026_hb.func_100927_c(int[], int, int)void
		// @2D: return
		// @2E: aload_0
		// @2F: getfield int game.C_100026_hb.field_100929_p
		// @32: aload_0
		// @33: getfield int game.C_100026_hb.field_100930_n
		// @36: isub
		// @37: istore #4
		// @39: aload_0
		// @3A: aload_1
		// @3B: iload_2
		// @3C: iload #4
		// @3E: invokespecial game.C_100026_hb.func_100927_c(int[], int, int)void
		// @41: iload_2
		// @42: iload #4
		// @44: iadd
		// @45: istore_2
		// @46: iload_3
		// @47: iload #4
		// @49: isub
		// @4A: istore_3
		// @4B: aload_0
		// @4C: dup
		// @4D: getfield int game.C_100026_hb.field_100930_n
		// @50: iload #4
		// @52: iadd
		// @53: putfield int game.C_100026_hb.field_100930_n
		// @56: aload_0
		// @57: invokespecial game.C_100026_hb.func_100922_e()void
		// @5A: aload_0
		// @5B: getfield game.C_100202_qi game.C_100026_hb.field_100928_q
		// @5E: bipush 86 (0x56)
		// @60: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @63: checkcast game.C_100324_hm
		// @66: astore #5
		// @68: aload #5
		// @6A: dup
		// @6B: astore #6
		// @6D: monitorenter
		// @6E: aload #5
		// @70: aload_0
		// @71: invokevirtual game.C_100324_hm.func_101465_a(game.C_100026_hb)int
		// @74: istore #7
		// @76: iload #7
		// @78: ifge @8A
		// @7B: aload #5
		// @7D: iconst_0
		// @7E: putfield int game.C_100324_hm.field_101466_j
		// @81: aload_0
		// @82: aload #5
		// @84: invokespecial game.C_100026_hb.func_100926_a(game.C_100324_hm)void
		// @87: goto @9C
		// @8A: aload #5
		// @8C: iload #7
		// @8E: putfield int game.C_100324_hm.field_101466_j
		// @91: aload_0
		// @92: aload #5
		// @94: getfield game.C_100158_da game.C_100324_hm.field_100590_f
		// @97: aload #5
		// @99: invokespecial game.C_100026_hb.func_100921_a(game.C_100158_da, game.C_100324_hm)void
		// @9C: aload #6
		// @9E: monitorexit
		// @9F: goto @AA
		// @A2: astore #8
		// @A4: aload #6
		// @A6: monitorexit
		// @A7: aload #8
		// @A9: athrow
		// @AA: iload_3
		// @AB: ifne @AF
		// @AE: return
		// @AF: goto @00
	}
	
	final synchronized void func_100924_b(C_100261_md arg0)
	{
		// @0: aload_0
		// @1: getfield game.C_100202_qi game.C_100026_hb.field_100931_o
		// @4: sipush 15828 (0x3DD4)
		// @7: aload_1
		// @8: invokevirtual game.C_100202_qi.func_105903_b(int, game.C_100158_da)void
		// @B: return
	}
	
	private final void func_100926_a(C_100324_hm arg0)
	{
		// @00: aload_1
		// @01: bipush 45 (0x2D)
		// @03: invokevirtual game.C_100324_hm.func_100583_c(int)void
		// @06: aload_1
		// @07: invokevirtual game.C_100324_hm.func_101464_a()void
		// @0A: aload_0
		// @0B: getfield game.C_100202_qi game.C_100026_hb.field_100928_q
		// @0E: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @11: getfield game.C_100158_da game.C_100158_da.field_100590_f
		// @14: astore_2
		// @15: aload_2
		// @16: aload_0
		// @17: getfield game.C_100202_qi game.C_100026_hb.field_100928_q
		// @1A: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @1D: if_acmpne @28
		// @20: aload_0
		// @21: iconst_m1
		// @22: putfield int game.C_100026_hb.field_100929_p
		// @25: goto @33
		// @28: aload_0
		// @29: aload_2
		// @2A: checkcast game.C_100324_hm
		// @2D: getfield int game.C_100324_hm.field_101466_j
		// @30: putfield int game.C_100026_hb.field_100929_p
		// @33: return
	}
	
	private final void func_100923_f(int arg0)
	{
		// @00: aload_0
		// @01: getfield game.C_100202_qi game.C_100026_hb.field_100931_o
		// @04: bipush 56 (0x38)
		// @06: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @09: checkcast game.C_100261_md
		// @0C: astore_2
		// @0D: aload_2
		// @0E: ifnull @26
		// @11: aload_2
		// @12: iload_1
		// @13: invokevirtual game.C_100261_md.func_100914_e(int)void
		// @16: aload_0
		// @17: getfield game.C_100202_qi game.C_100026_hb.field_100931_o
		// @1A: bipush 54 (0x36)
		// @1C: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @1F: checkcast game.C_100261_md
		// @22: astore_2
		// @23: goto @0D
		// @26: return
	}
	
	private final void func_100921_a(C_100158_da arg0, C_100324_hm arg1)
	{
		// @00: aload_1
		// @01: aload_0
		// @02: getfield game.C_100202_qi game.C_100026_hb.field_100928_q
		// @05: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @08: if_acmpeq @21
		// @0B: aload_1
		// @0C: checkcast game.C_100324_hm
		// @0F: getfield int game.C_100324_hm.field_101466_j
		// @12: aload_2
		// @13: getfield int game.C_100324_hm.field_101466_j
		// @16: if_icmpgt @21
		// @19: aload_1
		// @1A: getfield game.C_100158_da game.C_100158_da.field_100590_f
		// @1D: astore_1
		// @1E: goto @00
		// @21: bipush 72 (0x48)
		// @23: aload_2
		// @24: aload_1
		// @25: invokestatic game.C_100042_we.func_104130_a(int, game.C_100158_da, game.C_100158_da)void
		// @28: aload_0
		// @29: aload_0
		// @2A: getfield game.C_100202_qi game.C_100026_hb.field_100928_q
		// @2D: getfield game.C_100158_da game.C_100202_qi.field_105915_e
		// @30: getfield game.C_100158_da game.C_100158_da.field_100590_f
		// @33: checkcast game.C_100324_hm
		// @36: getfield int game.C_100324_hm.field_101466_j
		// @39: putfield int game.C_100026_hb.field_100929_p
		// @3C: return
	}
	
	private final void func_100922_e()
	{
		// @00: aload_0
		// @01: getfield int game.C_100026_hb.field_100930_n
		// @04: ifle @47
		// @07: aload_0
		// @08: getfield game.C_100202_qi game.C_100026_hb.field_100928_q
		// @0B: bipush 34 (0x22)
		// @0D: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @10: checkcast game.C_100324_hm
		// @13: astore_1
		// @14: aload_1
		// @15: ifnull @35
		// @18: aload_1
		// @19: dup
		// @1A: getfield int game.C_100324_hm.field_101466_j
		// @1D: aload_0
		// @1E: getfield int game.C_100026_hb.field_100930_n
		// @21: isub
		// @22: putfield int game.C_100324_hm.field_101466_j
		// @25: aload_0
		// @26: getfield game.C_100202_qi game.C_100026_hb.field_100928_q
		// @29: bipush 73 (0x49)
		// @2B: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @2E: checkcast game.C_100324_hm
		// @31: astore_1
		// @32: goto @14
		// @35: aload_0
		// @36: dup
		// @37: getfield int game.C_100026_hb.field_100929_p
		// @3A: aload_0
		// @3B: getfield int game.C_100026_hb.field_100930_n
		// @3E: isub
		// @3F: putfield int game.C_100026_hb.field_100929_p
		// @42: aload_0
		// @43: iconst_0
		// @44: putfield int game.C_100026_hb.field_100930_n
		// @47: return
	}
	
	private final void func_100927_c(int[] arg0, int arg1, int arg2)
	{
		// @00: aload_0
		// @01: getfield game.C_100202_qi game.C_100026_hb.field_100931_o
		// @04: bipush 98 (0x62)
		// @06: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @09: checkcast game.C_100261_md
		// @0C: astore #4
		// @0E: aload #4
		// @10: ifnull @2C
		// @13: aload #4
		// @15: aload_1
		// @16: iload_2
		// @17: iload_3
		// @18: invokevirtual game.C_100261_md.func_100911_b(int[], int, int)void
		// @1B: aload_0
		// @1C: getfield game.C_100202_qi game.C_100026_hb.field_100931_o
		// @1F: bipush 103 (0x67)
		// @21: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @24: checkcast game.C_100261_md
		// @27: astore #4
		// @29: goto @0E
		// @2C: return
	}
	
	final C_100261_md func_100912_c()
	{
		// @0: aload_0
		// @1: getfield game.C_100202_qi game.C_100026_hb.field_100931_o
		// @4: bipush 37 (0x25)
		// @6: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @9: checkcast game.C_100261_md
		// @C: areturn
	}
	
	final synchronized void func_100914_e(int arg0)
	{
		// @00: aload_0
		// @01: getfield int game.C_100026_hb.field_100929_p
		// @04: ifge @0D
		// @07: aload_0
		// @08: iload_1
		// @09: invokespecial game.C_100026_hb.func_100923_f(int)void
		// @0C: return
		// @0D: aload_0
		// @0E: getfield int game.C_100026_hb.field_100930_n
		// @11: iload_1
		// @12: iadd
		// @13: aload_0
		// @14: getfield int game.C_100026_hb.field_100929_p
		// @17: if_icmpge @2A
		// @1A: aload_0
		// @1B: dup
		// @1C: getfield int game.C_100026_hb.field_100930_n
		// @1F: iload_1
		// @20: iadd
		// @21: putfield int game.C_100026_hb.field_100930_n
		// @24: aload_0
		// @25: iload_1
		// @26: invokespecial game.C_100026_hb.func_100923_f(int)void
		// @29: return
		// @2A: aload_0
		// @2B: getfield int game.C_100026_hb.field_100929_p
		// @2E: aload_0
		// @2F: getfield int game.C_100026_hb.field_100930_n
		// @32: isub
		// @33: istore_2
		// @34: aload_0
		// @35: iload_2
		// @36: invokespecial game.C_100026_hb.func_100923_f(int)void
		// @39: iload_1
		// @3A: iload_2
		// @3B: isub
		// @3C: istore_1
		// @3D: aload_0
		// @3E: dup
		// @3F: getfield int game.C_100026_hb.field_100930_n
		// @42: iload_2
		// @43: iadd
		// @44: putfield int game.C_100026_hb.field_100930_n
		// @47: aload_0
		// @48: invokespecial game.C_100026_hb.func_100922_e()void
		// @4B: aload_0
		// @4C: getfield game.C_100202_qi game.C_100026_hb.field_100928_q
		// @4F: bipush 96 (0x60)
		// @51: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @54: checkcast game.C_100324_hm
		// @57: astore_3
		// @58: aload_3
		// @59: dup
		// @5A: astore #4
		// @5C: monitorenter
		// @5D: aload_3
		// @5E: aload_0
		// @5F: invokevirtual game.C_100324_hm.func_101465_a(game.C_100026_hb)int
		// @62: istore #5
		// @64: iload #5
		// @66: ifge @76
		// @69: aload_3
		// @6A: iconst_0
		// @6B: putfield int game.C_100324_hm.field_101466_j
		// @6E: aload_0
		// @6F: aload_3
		// @70: invokespecial game.C_100026_hb.func_100926_a(game.C_100324_hm)void
		// @73: goto @85
		// @76: aload_3
		// @77: iload #5
		// @79: putfield int game.C_100324_hm.field_101466_j
		// @7C: aload_0
		// @7D: aload_3
		// @7E: getfield game.C_100158_da game.C_100324_hm.field_100590_f
		// @81: aload_3
		// @82: invokespecial game.C_100026_hb.func_100921_a(game.C_100158_da, game.C_100324_hm)void
		// @85: aload #4
		// @87: monitorexit
		// @88: goto @93
		// @8B: astore #6
		// @8D: aload #4
		// @8F: monitorexit
		// @90: aload #6
		// @92: athrow
		// @93: iload_1
		// @94: ifne @98
		// @97: return
		// @98: goto @00
	}
	
	final C_100261_md func_100916_d()
	{
		// @0: aload_0
		// @1: getfield game.C_100202_qi game.C_100026_hb.field_100931_o
		// @4: bipush 112 (0x70)
		// @6: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @9: checkcast game.C_100261_md
		// @C: areturn
	}
	
	final synchronized void func_100925_a(C_100261_md arg0)
	{
		// @0: aload_1
		// @1: bipush 45 (0x2D)
		// @3: invokevirtual game.C_100261_md.func_100583_c(int)void
		// @6: return
	}
	
	public C_100026_hb()
	{
		// @00: aload_0
		// @01: invokespecial game.C_100261_md.<init>()void
		// @04: aload_0
		// @05: new game.C_100202_qi
		// @08: dup
		// @09: invokespecial game.C_100202_qi.<init>()void
		// @0C: putfield game.C_100202_qi game.C_100026_hb.field_100931_o
		// @0F: aload_0
		// @10: new game.C_100202_qi
		// @13: dup
		// @14: invokespecial game.C_100202_qi.<init>()void
		// @17: putfield game.C_100202_qi game.C_100026_hb.field_100928_q
		// @1A: aload_0
		// @1B: iconst_m1
		// @1C: putfield int game.C_100026_hb.field_100929_p
		// @1F: aload_0
		// @20: iconst_0
		// @21: putfield int game.C_100026_hb.field_100930_n
		// @24: return
	}
}
