package game;

import java.awt.GraphicsDevice;
import java.awt.Frame;
import java.awt.DisplayMode;

final class C_100221_ad
{
	private GraphicsDevice field_106072_a;
	private DisplayMode field_106071_b;
	
	public final int[] func_106068_listmodes()
	{
		// @00: aload_0
		// @01: getfield java.awt.GraphicsDevice game.C_100221_ad.field_106072_a
		// @04: invokevirtual java.awt.GraphicsDevice.getDisplayModes()java.awt.DisplayMode[]
		// @07: astore_1
		// @08: aload_1
		// @09: arraylength
		// @0A: ldc 303514242 (0x12174282)
		// @0C: ishl
		// @0D: newarray int[]
		// @0F: astore_2
		// @10: iconst_0
		// @11: istore_3
		// @12: aload_1
		// @13: arraylength
		// @14: iload_3
		// @15: if_icmple @55
		// @18: aload_2
		// @19: iload_3
		// @1A: ldc -1840639550 (0x924a11c2)
		// @1C: ishl
		// @1D: aload_1
		// @1E: iload_3
		// @1F: aaload
		// @20: invokevirtual java.awt.DisplayMode.getWidth()int
		// @23: iastore
		// @24: aload_2
		// @25: iload_3
		// @26: ldc 986354242 (0x3aca9242)
		// @28: ishl
		// @29: iconst_1
		// @2A: iadd
		// @2B: aload_1
		// @2C: iload_3
		// @2D: aaload
		// @2E: invokevirtual java.awt.DisplayMode.getHeight()int
		// @31: iastore
		// @32: aload_2
		// @33: iconst_2
		// @34: iload_3
		// @35: ldc 1439588226 (0x55ce5f82)
		// @37: ishl
		// @38: iadd
		// @39: aload_1
		// @3A: iload_3
		// @3B: aaload
		// @3C: invokevirtual java.awt.DisplayMode.getBitDepth()int
		// @3F: iastore
		// @40: aload_2
		// @41: iconst_3
		// @42: iload_3
		// @43: ldc -1611436766 (0x9ff36d22)
		// @45: ishl
		// @46: iadd
		// @47: aload_1
		// @48: iload_3
		// @49: aaload
		// @4A: invokevirtual java.awt.DisplayMode.getRefreshRate()int
		// @4D: iastore
		// @4E: iinc #3 +1
		// @51: goto @12
		// @54: athrow
		// @55: aload_2
		// @56: areturn
		// @57: astore_1
		// @58: aload_1
		// @59: athrow
	}
	
	public final void func_106067_exit()
	{
		// @00: aload_0
		// @01: getfield java.awt.DisplayMode game.C_100221_ad.field_106071_b
		// @04: ifnonnull @0B
		// @07: goto @37
		// @0A: athrow
		// @0B: aload_0
		// @0C: getfield java.awt.GraphicsDevice game.C_100221_ad.field_106072_a
		// @0F: aload_0
		// @10: getfield java.awt.DisplayMode game.C_100221_ad.field_106071_b
		// @13: invokevirtual java.awt.GraphicsDevice.setDisplayMode(java.awt.DisplayMode)void
		// @16: aload_0
		// @17: getfield java.awt.GraphicsDevice game.C_100221_ad.field_106072_a
		// @1A: invokevirtual java.awt.GraphicsDevice.getDisplayMode()java.awt.DisplayMode
		// @1D: aload_0
		// @1E: getfield java.awt.DisplayMode game.C_100221_ad.field_106071_b
		// @21: invokevirtual java.awt.DisplayMode.equals(java.awt.DisplayMode)boolean
		// @24: ifne @32
		// @27: new java.lang.RuntimeException
		// @2A: dup
		// @2B: ldc ""
		// @2D: invokespecial java.lang.RuntimeException.<init>(java.lang.String)void
		// @30: athrow
		// @31: athrow
		// @32: aload_0
		// @33: aconst_null
		// @34: putfield java.awt.DisplayMode game.C_100221_ad.field_106071_b
		// @37: aload_0
		// @38: bipush 48 (0x30)
		// @3A: aconst_null
		// @3B: invokespecial game.C_100221_ad.func_106069_a(int, java.awt.Frame)void
		// @3E: goto @44
		// @41: astore_1
		// @42: aload_1
		// @43: athrow
		// @44: return
	}
	
	private final void func_106069_a(int arg0, Frame arg1)
	{
		// @00: aload_0
		// @01: getfield java.awt.GraphicsDevice game.C_100221_ad.field_106072_a
		// @04: aload_2
		// @05: invokevirtual java.awt.GraphicsDevice.setFullScreenWindow(java.awt.Window)void
		// @08: bipush 77 (0x4D)
		// @0A: bipush -3 (0xFD)
		// @0C: iload_1
		// @0D: isub
		// @0E: bipush 36 (0x24)
		// @10: idiv
		// @11: idiv
		// @12: istore_3
		// @13: goto @1B
		// @16: astore #4
		// @18: aload #4
		// @1A: athrow
		// @1B: goto @21
		// @1E: astore_3
		// @1F: aload_3
		// @20: athrow
		// @21: return
	}
	
	public final void func_106070_enter(Frame arg0, int arg1, int arg2, int arg3, int arg4)
	{
		// @00: aload_0
		// @01: aload_0
		// @02: getfield java.awt.GraphicsDevice game.C_100221_ad.field_106072_a
		// @05: invokevirtual java.awt.GraphicsDevice.getDisplayMode()java.awt.DisplayMode
		// @08: putfield java.awt.DisplayMode game.C_100221_ad.field_106071_b
		// @0B: aconst_null
		// @0C: aload_0
		// @0D: getfield java.awt.DisplayMode game.C_100221_ad.field_106071_b
		// @10: if_acmpeq @17
		// @13: goto @1F
		// @16: athrow
		// @17: new java.lang.NullPointerException
		// @1A: dup
		// @1B: invokespecial java.lang.NullPointerException.<init>()void
		// @1E: athrow
		// @1F: aload_1
		// @20: iconst_1
		// @21: invokevirtual java.awt.Frame.setUndecorated(boolean)void
		// @24: aload_1
		// @25: iconst_0
		// @26: invokevirtual java.awt.Frame.enableInputMethods(boolean)void
		// @29: aload_0
		// @2A: bipush 50 (0x32)
		// @2C: aload_1
		// @2D: invokespecial game.C_100221_ad.func_106069_a(int, java.awt.Frame)void
		// @30: iconst_m1
		// @31: iload #5
		// @33: iconst_m1
		// @34: ixor
		// @35: if_icmpeq @3C
		// @38: goto @DE
		// @3B: athrow
		// @3C: aload_0
		// @3D: getfield java.awt.DisplayMode game.C_100221_ad.field_106071_b
		// @40: invokevirtual java.awt.DisplayMode.getRefreshRate()int
		// @43: istore #6
		// @45: aload_0
		// @46: getfield java.awt.GraphicsDevice game.C_100221_ad.field_106072_a
		// @49: invokevirtual java.awt.GraphicsDevice.getDisplayModes()java.awt.DisplayMode[]
		// @4C: astore #7
		// @4E: iconst_0
		// @4F: istore #8
		// @51: iconst_0
		// @52: istore #9
		// @54: iload #9
		// @56: iconst_m1
		// @57: ixor
		// @58: aload #7
		// @5A: arraylength
		// @5B: iconst_m1
		// @5C: ixor
		// @5D: if_icmple @D5
		// @60: aload #7
		// @62: iload #9
		// @64: aaload
		// @65: invokevirtual java.awt.DisplayMode.getWidth()int
		// @68: iconst_m1
		// @69: ixor
		// @6A: iload_2
		// @6B: iconst_m1
		// @6C: ixor
		// @6D: if_icmpne @CF
		// @70: goto @74
		// @73: athrow
		// @74: aload #7
		// @76: iload #9
		// @78: aaload
		// @79: invokevirtual java.awt.DisplayMode.getHeight()int
		// @7C: iconst_m1
		// @7D: ixor
		// @7E: iload_3
		// @7F: iconst_m1
		// @80: ixor
		// @81: if_icmpne @CF
		// @84: goto @88
		// @87: athrow
		// @88: iload #4
		// @8A: iconst_m1
		// @8B: ixor
		// @8C: aload #7
		// @8E: iload #9
		// @90: aaload
		// @91: invokevirtual java.awt.DisplayMode.getBitDepth()int
		// @94: iconst_m1
		// @95: ixor
		// @96: if_icmpne @CF
		// @99: goto @9D
		// @9C: athrow
		// @9D: aload #7
		// @9F: iload #9
		// @A1: aaload
		// @A2: invokevirtual java.awt.DisplayMode.getRefreshRate()int
		// @A5: istore #10
		// @A7: iload #8
		// @A9: ifeq @C8
		// @AC: iload #6
		// @AE: ineg
		// @AF: iload #10
		// @B1: iadd
		// @B2: invokestatic java.lang.Math.abs(int)int
		// @B5: iconst_m1
		// @B6: ixor
		// @B7: iload #5
		// @B9: iload #6
		// @BB: isub
		// @BC: invokestatic java.lang.Math.abs(int)int
		// @BF: iconst_m1
		// @C0: ixor
		// @C1: if_icmple @CF
		// @C4: goto @C8
		// @C7: athrow
		// @C8: iconst_1
		// @C9: istore #8
		// @CB: iload #10
		// @CD: istore #5
		// @CF: iinc #9 +1
		// @D2: goto @54
		// @D5: iload #8
		// @D7: ifne @DE
		// @DA: iload #6
		// @DC: istore #5
		// @DE: aload_0
		// @DF: getfield java.awt.GraphicsDevice game.C_100221_ad.field_106072_a
		// @E2: new java.awt.DisplayMode
		// @E5: dup
		// @E6: iload_2
		// @E7: iload_3
		// @E8: iload #4
		// @EA: iload #5
		// @EC: invokespecial java.awt.DisplayMode.<init>(int, int, int, int)void
		// @EF: invokevirtual java.awt.GraphicsDevice.setDisplayMode(java.awt.DisplayMode)void
		// @F2: goto @FA
		// @F5: astore #6
		// @F7: aload #6
		// @F9: athrow
		// @FA: return
	}
	
	public C_100221_ad() throws Exception
	{
		// @00: aload_0
		// @01: invokespecial java.lang.Object.<init>()void
		// @04: invokestatic java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment()java.awt.GraphicsEnvironment
		// @07: astore_1
		// @08: aload_0
		// @09: aload_1
		// @0A: invokevirtual java.awt.GraphicsEnvironment.getDefaultScreenDevice()java.awt.GraphicsDevice
		// @0D: putfield java.awt.GraphicsDevice game.C_100221_ad.field_106072_a
		// @10: aload_0
		// @11: getfield java.awt.GraphicsDevice game.C_100221_ad.field_106072_a
		// @14: invokevirtual java.awt.GraphicsDevice.isFullScreenSupported()boolean
		// @17: ifeq @1E
		// @1A: goto @64
		// @1D: athrow
		// @1E: aload_1
		// @1F: invokevirtual java.awt.GraphicsEnvironment.getScreenDevices()java.awt.GraphicsDevice[]
		// @22: astore_2
		// @23: aload_2
		// @24: astore_3
		// @25: iconst_0
		// @26: istore #4
		// @28: aload_3
		// @29: arraylength
		// @2A: iconst_m1
		// @2B: ixor
		// @2C: iload #4
		// @2E: iconst_m1
		// @2F: ixor
		// @30: if_icmpge @5C
		// @33: aload_3
		// @34: iload #4
		// @36: aaload
		// @37: astore #5
		// @39: aconst_null
		// @3A: aload #5
		// @3C: if_acmpeq @56
		// @3F: aload #5
		// @41: invokevirtual java.awt.GraphicsDevice.isFullScreenSupported()boolean
		// @44: ifne @4F
		// @47: goto @4B
		// @4A: athrow
		// @4B: goto @56
		// @4E: athrow
		// @4F: aload_0
		// @50: aload #5
		// @52: putfield java.awt.GraphicsDevice game.C_100221_ad.field_106072_a
		// @55: return
		// @56: iinc #4 +1
		// @59: goto @28
		// @5C: new java.lang.Exception
		// @5F: dup
		// @60: invokespecial java.lang.Exception.<init>()void
		// @63: athrow
		// @64: goto @6A
		// @67: astore_1
		// @68: aload_1
		// @69: athrow
		// @6A: return
	}
}
