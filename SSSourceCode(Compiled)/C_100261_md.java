package game;

abstract class C_100261_md extends C_100158_da
{
	C_100229_oe field_100918_m;
	int field_100917_l;
	C_100261_md field_100919_j;
	volatile boolean field_100920_k;
	
	final void func_100911_b(int[] arg0, int arg1, int arg2)
	{
		// @00: aload_0
		// @01: getfield boolean game.C_100261_md.field_100920_k
		// @04: ifeq @11
		// @07: aload_0
		// @08: aload_1
		// @09: iload_2
		// @0A: iload_3
		// @0B: invokevirtual game.C_100261_md.func_100910_a(int[], int, int)void
		// @0E: goto @16
		// @11: aload_0
		// @12: iload_3
		// @13: invokevirtual game.C_100261_md.func_100914_e(int)void
		// @16: return
	}
	
	abstract int func_100913_a();
	
	abstract C_100261_md func_100916_d();
	
	abstract C_100261_md func_100912_c();
	
	int func_100915_b()
	{
		// @0: sipush 255 (0x00FF)
		// @3: ireturn
	}
	
	abstract void func_100910_a(int[] arg0, int arg1, int arg2);
	
	protected C_100261_md()
	{
		// @0: aload_0
		// @1: invokespecial game.C_100158_da.<init>()void
		// @4: aload_0
		// @5: iconst_1
		// @6: putfield boolean game.C_100261_md.field_100920_k
		// @9: return
	}
	
	abstract void func_100914_e(int arg0);
}
