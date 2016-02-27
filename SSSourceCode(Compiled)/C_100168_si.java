package game;

import java.awt.Graphics;
import java.awt.Component;

final class C_100168_si extends C_100185_rm
{
	private Component field_105517_j;
	
	final void func_105474_a(int arg0, int arg1, Graphics arg2, int arg3)
	{
		// @00: bipush -84 (0xAC)
		// @02: bipush -42 (0xD6)
		// @04: iload_1
		// @05: isub
		// @06: bipush 49 (0x31)
		// @08: idiv
		// @09: irem
		// @0A: istore #5
		// @0C: aload_3
		// @0D: aload_0
		// @0E: getfield java.awt.Image game.C_100168_si.field_105482_f
		// @11: iload_2
		// @12: iload #4
		// @14: aload_0
		// @15: getfield java.awt.Component game.C_100168_si.field_105517_j
		// @18: invokevirtual java.awt.Graphics.drawImage(java.awt.Image, int, int, java.awt.image.ImageObserver)boolean
		// @1B: pop
		// @1C: goto @24
		// @1F: astore #5
		// @21: aload #5
		// @23: athrow
		// @24: return
	}
	
	final void func_105478_a(int arg0, int arg1, Component arg2, byte arg3)
	{
		// @00: aload_0
		// @01: iload_2
		// @02: putfield int game.C_100168_si.field_105483_g
		// @05: aload_0
		// @06: iload_1
		// @07: iload_2
		// @08: imul
		// @09: iconst_m1
		// @0A: isub
		// @0B: newarray int[]
		// @0D: putfield int[] game.C_100168_si.field_105486_b
		// @10: aload_0
		// @11: iload_1
		// @12: putfield int game.C_100168_si.field_105491_i
		// @15: iload #4
		// @17: bipush 15 (0x0F)
		// @19: if_icmpeq @28
		// @1C: aload_0
		// @1D: aconst_null
		// @1E: checkcast java.awt.Component
		// @21: putfield java.awt.Component game.C_100168_si.field_105517_j
		// @24: goto @28
		// @27: athrow
		// @28: new java.awt.image.DataBufferInt
		// @2B: dup
		// @2C: aload_0
		// @2D: getfield int[] game.C_100168_si.field_105486_b
		// @30: aload_0
		// @31: getfield int[] game.C_100168_si.field_105486_b
		// @34: arraylength
		// @35: invokespecial java.awt.image.DataBufferInt.<init>(int[], int)void
		// @38: astore #5
		// @3A: new java.awt.image.DirectColorModel
		// @3D: dup
		// @3E: bipush 32 (0x20)
		// @40: ldc 16711680 (0xff0000)
		// @42: ldc 65280 (0xff00)
		// @44: sipush 255 (0x00FF)
		// @47: invokespecial java.awt.image.DirectColorModel.<init>(int, int, int, int)void
		// @4A: astore #6
		// @4C: aload #6
		// @4E: aload_0
		// @4F: getfield int game.C_100168_si.field_105483_g
		// @52: aload_0
		// @53: getfield int game.C_100168_si.field_105491_i
		// @56: invokevirtual java.awt.image.ColorModel.createCompatibleSampleModel(int, int)java.awt.image.SampleModel
		// @59: aload #5
		// @5B: aconst_null
		// @5C: invokestatic java.awt.image.Raster.createWritableRaster(java.awt.image.SampleModel, java.awt.image.DataBuffer, java.awt.Point)java.awt.image.WritableRaster
		// @5F: astore #7
		// @61: aload_0
		// @62: new java.awt.image.BufferedImage
		// @65: dup
		// @66: aload #6
		// @68: aload #7
		// @6A: iconst_0
		// @6B: new java.util.Hashtable
		// @6E: dup
		// @6F: invokespecial java.util.Hashtable.<init>()void
		// @72: invokespecial java.awt.image.BufferedImage.<init>(java.awt.image.ColorModel, java.awt.image.WritableRaster, boolean, java.util.Hashtable)void
		// @75: putfield java.awt.Image game.C_100168_si.field_105482_f
		// @78: aload_0
		// @79: aload_3
		// @7A: putfield java.awt.Component game.C_100168_si.field_105517_j
		// @7D: aload_0
		// @7E: bipush 127 (0x7F)
		// @80: invokevirtual game.C_100168_si.func_105476_a(byte)void
		// @83: goto @8B
		// @86: astore #5
		// @88: aload #5
		// @8A: athrow
		// @8B: return
	}
}
