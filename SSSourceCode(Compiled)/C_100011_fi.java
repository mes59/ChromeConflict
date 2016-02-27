package game;

import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import java.awt.Component;

final class C_100011_fi extends C_100089_fa implements MouseWheelListener
{
	private int field_103731_h;
	
	final void func_103720_a(byte arg0, Component arg1)
	{
		// @00: aload_2
		// @01: aload_0
		// @02: invokevirtual java.awt.Component.addMouseWheelListener(java.awt.event.MouseWheelListener)void
		// @05: iload_1
		// @06: bipush 69 (0x45)
		// @08: if_icmpgt @11
		// @0B: aload_0
		// @0C: bipush -69 (0xBB)
		// @0E: putfield int game.C_100011_fi.field_103731_h
		// @11: goto @17
		// @14: astore_3
		// @15: aload_3
		// @16: athrow
		// @17: return
	}
	
	final void func_103712_a(int arg0, Component arg1)
	{
		// @00: aload_2
		// @01: aload_0
		// @02: invokevirtual java.awt.Component.removeMouseWheelListener(java.awt.event.MouseWheelListener)void
		// @05: iload_1
		// @06: sipush 23265 (0x5AE1)
		// @09: if_icmpeq @14
		// @0C: aload_0
		// @0D: aconst_null
		// @0E: checkcast java.awt.event.MouseWheelEvent
		// @11: invokevirtual game.C_100011_fi.mouseWheelMoved(java.awt.event.MouseWheelEvent)void
		// @14: goto @1A
		// @17: astore_3
		// @18: aload_3
		// @19: athrow
		// @1A: return
	}
	
	final synchronized int func_103714_a(byte arg0)
	{
		// @00: iload_1
		// @01: bipush -47 (0xD1)
		// @03: if_icmplt @10
		// @06: aload_0
		// @07: bipush -77 (0xB3)
		// @09: putfield int game.C_100011_fi.field_103731_h
		// @0C: goto @10
		// @0F: athrow
		// @10: aload_0
		// @11: getfield int game.C_100011_fi.field_103731_h
		// @14: istore_2
		// @15: aload_0
		// @16: iconst_0
		// @17: putfield int game.C_100011_fi.field_103731_h
		// @1A: iload_2
		// @1B: ireturn
		// @1C: astore_2
		// @1D: aload_2
		// @1E: athrow
	}
	
	public final synchronized void mouseWheelMoved(MouseWheelEvent arg0)
	{
		// @00: aload_0
		// @01: dup
		// @02: getfield int game.C_100011_fi.field_103731_h
		// @05: aload_1
		// @06: invokevirtual java.awt.event.MouseWheelEvent.getWheelRotation()int
		// @09: iadd
		// @0A: putfield int game.C_100011_fi.field_103731_h
		// @0D: aload_1
		// @0E: invokevirtual java.awt.event.MouseWheelEvent.consume()void
		// @11: goto @17
		// @14: astore_2
		// @15: aload_2
		// @16: athrow
		// @17: return
	}
	
	C_100011_fi()
	{
		// @0: aload_0
		// @1: invokespecial game.C_100089_fa.<init>()void
		// @4: aload_0
		// @5: iconst_0
		// @6: putfield int game.C_100011_fi.field_103731_h
		// @9: return
	}
}
