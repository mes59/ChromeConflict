package game;

import java.awt.Robot;
import java.awt.Point;
import java.awt.Component;

final class C_100344_ji
{
	private Robot field_107398_a;
	private Component field_107397_b;
	
	public final void func_107396_showcursor(Component arg0, boolean arg1)
	{
		// @00: iload_2
		// @01: ifne @16
		// @04: aconst_null
		// @05: aload_1
		// @06: if_acmpne @18
		// @09: goto @0D
		// @0C: athrow
		// @0D: new java.lang.NullPointerException
		// @10: dup
		// @11: invokespecial java.lang.NullPointerException.<init>()void
		// @14: athrow
		// @15: athrow
		// @16: aconst_null
		// @17: astore_1
		// @18: aload_0
		// @19: getfield java.awt.Component game.C_100344_ji.field_107397_b
		// @1C: aload_1
		// @1D: if_acmpeq @24
		// @20: goto @25
		// @23: athrow
		// @24: return
		// @25: aload_0
		// @26: getfield java.awt.Component game.C_100344_ji.field_107397_b
		// @29: ifnull @3D
		// @2C: aload_0
		// @2D: getfield java.awt.Component game.C_100344_ji.field_107397_b
		// @30: aconst_null
		// @31: invokevirtual java.awt.Component.setCursor(java.awt.Cursor)void
		// @34: aload_0
		// @35: aconst_null
		// @36: putfield java.awt.Component game.C_100344_ji.field_107397_b
		// @39: goto @3D
		// @3C: athrow
		// @3D: aload_1
		// @3E: ifnonnull @45
		// @41: goto @69
		// @44: athrow
		// @45: aload_1
		// @46: aload_1
		// @47: invokevirtual java.awt.Component.getToolkit()java.awt.Toolkit
		// @4A: new java.awt.image.BufferedImage
		// @4D: dup
		// @4E: iconst_1
		// @4F: iconst_1
		// @50: iconst_2
		// @51: invokespecial java.awt.image.BufferedImage.<init>(int, int, int)void
		// @54: new java.awt.Point
		// @57: dup
		// @58: iconst_0
		// @59: iconst_0
		// @5A: invokespecial java.awt.Point.<init>(int, int)void
		// @5D: aconst_null
		// @5E: invokevirtual java.awt.Toolkit.createCustomCursor(java.awt.Image, java.awt.Point, java.lang.String)java.awt.Cursor
		// @61: invokevirtual java.awt.Component.setCursor(java.awt.Cursor)void
		// @64: aload_0
		// @65: aload_1
		// @66: putfield java.awt.Component game.C_100344_ji.field_107397_b
		// @69: goto @6F
		// @6C: astore_3
		// @6D: aload_3
		// @6E: athrow
		// @6F: return
	}
	
	public C_100344_ji() throws Exception
	{
		// @00: aload_0
		// @01: invokespecial java.lang.Object.<init>()void
		// @04: aload_0
		// @05: new java.awt.Robot
		// @08: dup
		// @09: invokespecial java.awt.Robot.<init>()void
		// @0C: putfield java.awt.Robot game.C_100344_ji.field_107398_a
		// @0F: goto @15
		// @12: astore_1
		// @13: aload_1
		// @14: athrow
		// @15: return
	}
	
	public final void func_107394_movemouse(int arg0, int arg1)
	{
		// @00: aload_0
		// @01: getfield java.awt.Robot game.C_100344_ji.field_107398_a
		// @04: iload_1
		// @05: iload_2
		// @06: invokevirtual java.awt.Robot.mouseMove(int, int)void
		// @09: goto @0F
		// @0C: astore_3
		// @0D: aload_3
		// @0E: athrow
		// @0F: return
	}
	
	public final void func_107395_setcustomcursor(Component arg0, int[] arg1, int arg2, int arg3, Point arg4)
	{
		// @00: aconst_null
		// @01: aload_2
		// @02: if_acmpeq @32
		// @05: new java.awt.image.BufferedImage
		// @08: dup
		// @09: iload_3
		// @0A: iload #4
		// @0C: iconst_2
		// @0D: invokespecial java.awt.image.BufferedImage.<init>(int, int, int)void
		// @10: astore #6
		// @12: aload #6
		// @14: iconst_0
		// @15: iconst_0
		// @16: iload_3
		// @17: iload #4
		// @19: aload_2
		// @1A: iconst_0
		// @1B: iload_3
		// @1C: invokevirtual java.awt.image.BufferedImage.setRGB(int, int, int, int, int[], int, int)void
		// @1F: aload_1
		// @20: aload_1
		// @21: invokevirtual java.awt.Component.getToolkit()java.awt.Toolkit
		// @24: aload #6
		// @26: aload #5
		// @28: aconst_null
		// @29: invokevirtual java.awt.Toolkit.createCustomCursor(java.awt.Image, java.awt.Point, java.lang.String)java.awt.Cursor
		// @2C: invokevirtual java.awt.Component.setCursor(java.awt.Cursor)void
		// @2F: goto @37
		// @32: aload_1
		// @33: aconst_null
		// @34: invokevirtual java.awt.Component.setCursor(java.awt.Cursor)void
		// @37: goto @3F
		// @3A: astore #6
		// @3C: aload #6
		// @3E: athrow
		// @3F: return
	}
}
