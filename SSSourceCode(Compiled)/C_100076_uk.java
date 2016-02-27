package game;

final class C_100076_uk
{
	private int field_104419_c;
	private int field_104420_a;
	private C_100072_ui[] field_104418_b;
	
	final C_100214_al func_104415_b()
	{
		// @00: aload_0
		// @01: invokespecial game.C_100076_uk.func_104417_a()byte[]
		// @04: astore_1
		// @05: new game.C_100214_al
		// @08: dup
		// @09: sipush 22050 (0x5622)
		// @0C: aload_1
		// @0D: sipush 22050 (0x5622)
		// @10: aload_0
		// @11: getfield int game.C_100076_uk.field_104419_c
		// @14: imul
		// @15: sipush 1000 (0x03E8)
		// @18: idiv
		// @19: sipush 22050 (0x5622)
		// @1C: aload_0
		// @1D: getfield int game.C_100076_uk.field_104420_a
		// @20: imul
		// @21: sipush 1000 (0x03E8)
		// @24: idiv
		// @25: invokespecial game.C_100214_al.<init>(int, byte[], int, int)void
		// @28: areturn
	}
	
	private final byte[] func_104417_a()
	{
		// @00: iconst_0
		// @01: istore_1
		// @02: iconst_0
		// @03: istore_2
		// @04: iload_2
		// @05: bipush 10 (0x0A)
		// @07: if_icmpge @44
		// @0A: aload_0
		// @0B: getfield game.C_100072_ui[] game.C_100076_uk.field_104418_b
		// @0E: iload_2
		// @0F: aaload
		// @10: ifnull @3E
		// @13: aload_0
		// @14: getfield game.C_100072_ui[] game.C_100076_uk.field_104418_b
		// @17: iload_2
		// @18: aaload
		// @19: getfield int game.C_100072_ui.field_104386_n
		// @1C: aload_0
		// @1D: getfield game.C_100072_ui[] game.C_100076_uk.field_104418_b
		// @20: iload_2
		// @21: aaload
		// @22: getfield int game.C_100072_ui.field_104381_d
		// @25: iadd
		// @26: iload_1
		// @27: if_icmple @3E
		// @2A: aload_0
		// @2B: getfield game.C_100072_ui[] game.C_100076_uk.field_104418_b
		// @2E: iload_2
		// @2F: aaload
		// @30: getfield int game.C_100072_ui.field_104386_n
		// @33: aload_0
		// @34: getfield game.C_100072_ui[] game.C_100076_uk.field_104418_b
		// @37: iload_2
		// @38: aaload
		// @39: getfield int game.C_100072_ui.field_104381_d
		// @3C: iadd
		// @3D: istore_1
		// @3E: iinc #2 +1
		// @41: goto @04
		// @44: iload_1
		// @45: ifne @4C
		// @48: iconst_0
		// @49: newarray byte[]
		// @4B: areturn
		// @4C: sipush 22050 (0x5622)
		// @4F: iload_1
		// @50: imul
		// @51: sipush 1000 (0x03E8)
		// @54: idiv
		// @55: istore_2
		// @56: iload_2
		// @57: newarray byte[]
		// @59: astore_3
		// @5A: iconst_0
		// @5B: istore #4
		// @5D: iload #4
		// @5F: bipush 10 (0x0A)
		// @61: if_icmpge @F7
		// @64: aload_0
		// @65: getfield game.C_100072_ui[] game.C_100076_uk.field_104418_b
		// @68: iload #4
		// @6A: aaload
		// @6B: ifnull @F1
		// @6E: aload_0
		// @6F: getfield game.C_100072_ui[] game.C_100076_uk.field_104418_b
		// @72: iload #4
		// @74: aaload
		// @75: getfield int game.C_100072_ui.field_104386_n
		// @78: sipush 22050 (0x5622)
		// @7B: imul
		// @7C: sipush 1000 (0x03E8)
		// @7F: idiv
		// @80: istore #5
		// @82: aload_0
		// @83: getfield game.C_100072_ui[] game.C_100076_uk.field_104418_b
		// @86: iload #4
		// @88: aaload
		// @89: getfield int game.C_100072_ui.field_104381_d
		// @8C: sipush 22050 (0x5622)
		// @8F: imul
		// @90: sipush 1000 (0x03E8)
		// @93: idiv
		// @94: istore #6
		// @96: aload_0
		// @97: getfield game.C_100072_ui[] game.C_100076_uk.field_104418_b
		// @9A: iload #4
		// @9C: aaload
		// @9D: iload #5
		// @9F: aload_0
		// @A0: getfield game.C_100072_ui[] game.C_100076_uk.field_104418_b
		// @A3: iload #4
		// @A5: aaload
		// @A6: getfield int game.C_100072_ui.field_104386_n
		// @A9: invokevirtual game.C_100072_ui.func_104378_a(int, int)int[]
		// @AC: astore #7
		// @AE: iconst_0
		// @AF: istore #8
		// @B1: iload #8
		// @B3: iload #5
		// @B5: if_icmpge @F1
		// @B8: aload_3
		// @B9: iload #8
		// @BB: iload #6
		// @BD: iadd
		// @BE: baload
		// @BF: aload #7
		// @C1: iload #8
		// @C3: iaload
		// @C4: bipush 8 (0x08)
		// @C6: ishr
		// @C7: iadd
		// @C8: istore #9
		// @CA: iload #9
		// @CC: sipush 128 (0x0080)
		// @CF: iadd
		// @D0: sipush -256 (0xFF00)
		// @D3: iand
		// @D4: ifeq @E1
		// @D7: iload #9
		// @D9: bipush 31 (0x1F)
		// @DB: ishr
		// @DC: bipush 127 (0x7F)
		// @DE: ixor
		// @DF: istore #9
		// @E1: aload_3
		// @E2: iload #8
		// @E4: iload #6
		// @E6: iadd
		// @E7: iload #9
		// @E9: i2b
		// @EA: bastore
		// @EB: iinc #8 +1
		// @EE: goto @B1
		// @F1: iinc #4 +1
		// @F4: goto @5D
		// @F7: aload_3
		// @F8: areturn
	}
	
	static final C_100076_uk func_104416_a(C_100098_h arg0, int arg1, int arg2)
	{
		// @00: aload_0
		// @01: iload_1
		// @02: iconst_0
		// @03: iload_2
		// @04: invokevirtual game.C_100098_h.func_104610_b(int, int, int)byte[]
		// @07: astore_3
		// @08: aload_3
		// @09: ifnonnull @0E
		// @0C: aconst_null
		// @0D: areturn
		// @0E: new game.C_100076_uk
		// @11: dup
		// @12: new game.C_100280_nf
		// @15: dup
		// @16: aload_3
		// @17: invokespecial game.C_100280_nf.<init>(byte[])void
		// @1A: invokespecial game.C_100076_uk.<init>(game.C_100280_nf)void
		// @1D: areturn
	}
	
	private C_100076_uk(C_100280_nf arg0)
	{
		// @00: aload_0
		// @01: invokespecial java.lang.Object.<init>()void
		// @04: aload_0
		// @05: bipush 10 (0x0A)
		// @07: anewarray game.C_100072_ui
		// @0A: putfield game.C_100072_ui[] game.C_100076_uk.field_104418_b
		// @0D: iconst_0
		// @0E: istore_2
		// @0F: iload_2
		// @10: bipush 10 (0x0A)
		// @12: if_icmpge @49
		// @15: aload_1
		// @16: iconst_0
		// @17: invokevirtual game.C_100280_nf.func_101156_c(boolean)int
		// @1A: istore_3
		// @1B: iload_3
		// @1C: ifne @22
		// @1F: goto @43
		// @22: aload_1
		// @23: dup
		// @24: getfield int game.C_100280_nf.field_101177_n
		// @27: iconst_1
		// @28: isub
		// @29: putfield int game.C_100280_nf.field_101177_n
		// @2C: aload_0
		// @2D: getfield game.C_100072_ui[] game.C_100076_uk.field_104418_b
		// @30: iload_2
		// @31: new game.C_100072_ui
		// @34: dup
		// @35: invokespecial game.C_100072_ui.<init>()void
		// @38: aastore
		// @39: aload_0
		// @3A: getfield game.C_100072_ui[] game.C_100076_uk.field_104418_b
		// @3D: iload_2
		// @3E: aaload
		// @3F: aload_1
		// @40: invokevirtual game.C_100072_ui.func_104377_a(game.C_100280_nf)void
		// @43: iinc #2 +1
		// @46: goto @0F
		// @49: aload_0
		// @4A: aload_1
		// @4B: bipush -2 (0xFE)
		// @4D: invokevirtual game.C_100280_nf.func_101143_l(int)int
		// @50: putfield int game.C_100076_uk.field_104419_c
		// @53: aload_0
		// @54: aload_1
		// @55: bipush -2 (0xFE)
		// @57: invokevirtual game.C_100280_nf.func_101143_l(int)int
		// @5A: putfield int game.C_100076_uk.field_104420_a
		// @5D: return
	}
}
