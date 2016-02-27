package game;

import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.AudioFormat;
import java.awt.Component;

final class C_100345_jh extends C_100177_cj
{
	private boolean field_105672_y;
	private int field_105673_x;
	private AudioFormat field_105669_v;
	private byte[] field_105668_w;
	private SourceDataLine field_105671_z;
	private static final String field_105670_A;
	
	final void func_105633_f()
	{
		// @00: sipush 256 (0x0100)
		// @03: istore_1
		// @04: getstatic boolean game.C_100345_jh.field_105646_g
		// @07: ifeq @0E
		// @0A: iload_1
		// @0B: iconst_1
		// @0C: ishl
		// @0D: istore_1
		// @0E: iconst_0
		// @0F: istore_2
		// @10: iload_2
		// @11: iload_1
		// @12: if_icmpge @50
		// @15: aload_0
		// @16: getfield int[] game.C_100345_jh.field_105663_r
		// @19: iload_2
		// @1A: iaload
		// @1B: istore_3
		// @1C: iload_3
		// @1D: ldc 8388608 (0x800000)
		// @1F: iadd
		// @20: ldc -16777216 (0xff000000)
		// @22: iand
		// @23: ifeq @2E
		// @26: ldc 8388607 (0x7fffff)
		// @28: iload_3
		// @29: bipush 31 (0x1F)
		// @2B: ishr
		// @2C: ixor
		// @2D: istore_3
		// @2E: aload_0
		// @2F: getfield byte[] game.C_100345_jh.field_105668_w
		// @32: iload_2
		// @33: iconst_2
		// @34: imul
		// @35: iload_3
		// @36: bipush 8 (0x08)
		// @38: ishr
		// @39: i2b
		// @3A: bastore
		// @3B: aload_0
		// @3C: getfield byte[] game.C_100345_jh.field_105668_w
		// @3F: iload_2
		// @40: iconst_2
		// @41: imul
		// @42: iconst_1
		// @43: iadd
		// @44: iload_3
		// @45: bipush 16 (0x10)
		// @47: ishr
		// @48: i2b
		// @49: bastore
		// @4A: iinc #2 +1
		// @4D: goto @10
		// @50: aload_0
		// @51: getfield javax.sound.sampled.SourceDataLine game.C_100345_jh.field_105671_z
		// @54: aload_0
		// @55: getfield byte[] game.C_100345_jh.field_105668_w
		// @58: iconst_0
		// @59: iload_1
		// @5A: iconst_1
		// @5B: ishl
		// @5C: invokeinterface javax.sound.sampled.SourceDataLine.write(byte[], int, int)int
		// @61: pop
		// @62: return
	}
	
	final void func_105629_a()
	{
		// @00: aload_0
		// @01: getfield javax.sound.sampled.SourceDataLine game.C_100345_jh.field_105671_z
		// @04: ifnull @15
		// @07: aload_0
		// @08: getfield javax.sound.sampled.SourceDataLine game.C_100345_jh.field_105671_z
		// @0B: invokeinterface javax.sound.sampled.SourceDataLine.close()void
		// @10: aload_0
		// @11: aconst_null
		// @12: putfield javax.sound.sampled.SourceDataLine game.C_100345_jh.field_105671_z
		// @15: return
	}
	
	final int func_105637_h()
	{
		// @00: aload_0
		// @01: getfield int game.C_100345_jh.field_105673_x
		// @04: aload_0
		// @05: getfield javax.sound.sampled.SourceDataLine game.C_100345_jh.field_105671_z
		// @08: invokeinterface javax.sound.sampled.SourceDataLine.available()int
		// @0D: getstatic boolean game.C_100345_jh.field_105646_g
		// @10: ifeq @17
		// @13: iconst_2
		// @14: goto @18
		// @17: iconst_1
		// @18: ishr
		// @19: isub
		// @1A: ireturn
	}
	
	C_100345_jh()
	{
		// @0: aload_0
		// @1: invokespecial game.C_100177_cj.<init>()void
		// @4: aload_0
		// @5: iconst_0
		// @6: putfield boolean game.C_100345_jh.field_105672_y
		// @9: return
	}
	
	final void func_105640_b() throws LineUnavailableException
	{
		// @00: aload_0
		// @01: getfield javax.sound.sampled.SourceDataLine game.C_100345_jh.field_105671_z
		// @04: invokeinterface javax.sound.sampled.SourceDataLine.flush()void
		// @09: aload_0
		// @0A: getfield boolean game.C_100345_jh.field_105672_y
		// @0D: ifeq @5E
		// @10: aload_0
		// @11: getfield javax.sound.sampled.SourceDataLine game.C_100345_jh.field_105671_z
		// @14: invokeinterface javax.sound.sampled.SourceDataLine.close()void
		// @19: aload_0
		// @1A: aconst_null
		// @1B: putfield javax.sound.sampled.SourceDataLine game.C_100345_jh.field_105671_z
		// @1E: new javax.sound.sampled.DataLine$Info
		// @21: dup
		// @22: ldc Class<javax.sound.sampled.SourceDataLine>
		// @24: aload_0
		// @25: getfield javax.sound.sampled.AudioFormat game.C_100345_jh.field_105669_v
		// @28: aload_0
		// @29: getfield int game.C_100345_jh.field_105673_x
		// @2C: getstatic boolean game.C_100345_jh.field_105646_g
		// @2F: ifeq @3B
		// @32: goto @36
		// @35: athrow
		// @36: iconst_2
		// @37: goto @3C
		// @3A: athrow
		// @3B: iconst_1
		// @3C: ishl
		// @3D: invokespecial javax.sound.sampled.DataLine$Info.<init>(java.lang.Class, javax.sound.sampled.AudioFormat, int)void
		// @40: astore_1
		// @41: aload_0
		// @42: aload_1
		// @43: invokestatic javax.sound.sampled.AudioSystem.getLine(javax.sound.sampled.Line$Info)javax.sound.sampled.Line
		// @46: checkcast javax.sound.sampled.SourceDataLine
		// @49: putfield javax.sound.sampled.SourceDataLine game.C_100345_jh.field_105671_z
		// @4C: aload_0
		// @4D: getfield javax.sound.sampled.SourceDataLine game.C_100345_jh.field_105671_z
		// @50: invokeinterface javax.sound.sampled.SourceDataLine.open()void
		// @55: aload_0
		// @56: getfield javax.sound.sampled.SourceDataLine game.C_100345_jh.field_105671_z
		// @59: invokeinterface javax.sound.sampled.SourceDataLine.start()void
		// @5E: return
	}
	
	final void func_105639_a(Component arg0)
	{
		// @00: invokestatic javax.sound.sampled.AudioSystem.getMixerInfo()javax.sound.sampled.Mixer$Info[]
		// @03: astore_2
		// @04: aload_2
		// @05: ifnull @44
		// @08: aload_2
		// @09: astore_3
		// @0A: iconst_0
		// @0B: istore #4
		// @0D: iload #4
		// @0F: aload_3
		// @10: arraylength
		// @11: if_icmpge @44
		// @14: aload_3
		// @15: iload #4
		// @17: aaload
		// @18: astore #5
		// @1A: aload #5
		// @1C: ifnull @3E
		// @1F: aload #5
		// @21: invokevirtual javax.sound.sampled.Mixer$Info.getName()java.lang.String
		// @24: astore #6
		// @26: aload #6
		// @28: ifnull @3E
		// @2B: aload #6
		// @2D: invokevirtual java.lang.String.toLowerCase()java.lang.String
		// @30: getstatic java.lang.String game.C_100345_jh.field_105670_A
		// @33: invokevirtual java.lang.String.indexOf(java.lang.String)int
		// @36: iflt @3E
		// @39: aload_0
		// @3A: iconst_1
		// @3B: putfield boolean game.C_100345_jh.field_105672_y
		// @3E: iinc #4 +1
		// @41: goto @0D
		// @44: aload_0
		// @45: new javax.sound.sampled.AudioFormat
		// @48: dup
		// @49: getstatic int game.C_100345_jh.field_105660_u
		// @4C: i2f
		// @4D: bipush 16 (0x10)
		// @4F: getstatic boolean game.C_100345_jh.field_105646_g
		// @52: ifeq @59
		// @55: iconst_2
		// @56: goto @5A
		// @59: iconst_1
		// @5A: iconst_1
		// @5B: iconst_0
		// @5C: invokespecial javax.sound.sampled.AudioFormat.<init>(float, int, int, boolean, boolean)void
		// @5F: putfield javax.sound.sampled.AudioFormat game.C_100345_jh.field_105669_v
		// @62: aload_0
		// @63: sipush 256 (0x0100)
		// @66: getstatic boolean game.C_100345_jh.field_105646_g
		// @69: ifeq @70
		// @6C: iconst_2
		// @6D: goto @71
		// @70: iconst_1
		// @71: ishl
		// @72: newarray byte[]
		// @74: putfield byte[] game.C_100345_jh.field_105668_w
		// @77: return
	}
	
	final void func_105630_a(int arg0) throws LineUnavailableException
	{
		// @00: new javax.sound.sampled.DataLine$Info
		// @03: dup
		// @04: ldc Class<javax.sound.sampled.SourceDataLine>
		// @06: aload_0
		// @07: getfield javax.sound.sampled.AudioFormat game.C_100345_jh.field_105669_v
		// @0A: iload_1
		// @0B: getstatic boolean game.C_100345_jh.field_105646_g
		// @0E: ifeq @16
		// @11: iconst_2
		// @12: goto @17
		// @15: athrow
		// @16: iconst_1
		// @17: ishl
		// @18: invokespecial javax.sound.sampled.DataLine$Info.<init>(java.lang.Class, javax.sound.sampled.AudioFormat, int)void
		// @1B: astore_2
		// @1C: aload_0
		// @1D: aload_2
		// @1E: invokestatic javax.sound.sampled.AudioSystem.getLine(javax.sound.sampled.Line$Info)javax.sound.sampled.Line
		// @21: checkcast javax.sound.sampled.SourceDataLine
		// @24: putfield javax.sound.sampled.SourceDataLine game.C_100345_jh.field_105671_z
		// @27: aload_0
		// @28: getfield javax.sound.sampled.SourceDataLine game.C_100345_jh.field_105671_z
		// @2B: invokeinterface javax.sound.sampled.SourceDataLine.open()void
		// @30: aload_0
		// @31: getfield javax.sound.sampled.SourceDataLine game.C_100345_jh.field_105671_z
		// @34: invokeinterface javax.sound.sampled.SourceDataLine.start()void
		// @39: aload_0
		// @3A: iload_1
		// @3B: putfield int game.C_100345_jh.field_105673_x
		// @3E: goto @5E
		// @41: astore_2
		// @42: iload_1
		// @43: bipush 62 (0x3E)
		// @45: invokestatic game.C_100303_kk.func_104778_a(int, byte)int
		// @48: iconst_1
		// @49: if_icmpeq @57
		// @4C: aload_0
		// @4D: iload_1
		// @4E: iconst_0
		// @4F: invokestatic game.C_100249_pc.func_102324_a(int, int)int
		// @52: invokevirtual game.C_100345_jh.func_105630_a(int)void
		// @55: return
		// @56: athrow
		// @57: aload_0
		// @58: aconst_null
		// @59: putfield javax.sound.sampled.SourceDataLine game.C_100345_jh.field_105671_z
		// @5C: aload_2
		// @5D: athrow
		// @5E: return
	}
	
	static
	{
		// @0: ldc "\u001b`\t0i\u0005n\u0004"
		// @2: invokestatic game.C_100345_jh.func_105667_z(java.lang.String)char[]
		// @5: invokestatic game.C_100345_jh.func_105666_z(char[])java.lang.String
		// @8: putstatic java.lang.String game.C_100345_jh.field_105670_A
		// @B: return
	}
	
	private static char[] func_105667_z(String arg0)
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
	
	private static String func_105666_z(char[] arg0)
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
		// @30: bipush 104 (0x68)
		// @32: goto @46
		// @35: bipush 15 (0x0F)
		// @37: goto @46
		// @3A: bipush 124 (0x7C)
		// @3C: goto @46
		// @3F: bipush 94 (0x5E)
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
