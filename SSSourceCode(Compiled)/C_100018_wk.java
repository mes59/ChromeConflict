package game;

final class C_100018_wk extends C_100325_id
{
	static C_100302_ka field_101531_T;
	boolean field_101547_v;
	boolean field_101513_E;
	int field_101545_fb;
	static C_100037_wb field_101550_s;
	private int field_101515_cb;
	int field_101548_u;
	int field_101526_I;
	boolean field_101542_Z;
	int field_101514_F;
	private int field_101554_x;
	private int field_101521_M;
	static String field_101512_D;
	C_100314_lf field_101517_A;
	boolean field_101534_V;
	boolean field_101522_N;
	int field_101516_G;
	C_100314_lf[] field_101553_y;
	int field_101551_ab;
	int field_101533_W;
	boolean field_101523_O;
	int field_101537_S;
	private boolean field_101535_Q;
	static boolean field_101549_t;
	boolean field_101525_eb;
	private boolean field_101518_B;
	C_100314_lf field_101520_L;
	int field_101519_C;
	static String field_101552_z;
	private int field_101538_R;
	int field_101527_J;
	private C_100294_ki field_101540_bb;
	boolean field_101530_U;
	int field_101543_db;
	private boolean field_101544_hb;
	int field_101539_Y;
	C_100314_lf field_101529_K;
	int field_101541_X;
	int field_101546_w;
	static String field_101536_P;
	int field_101524_H;
	private boolean field_101528_gb;
	private static final String[] field_101532_ib;
	
	private final boolean func_101492_a(int arg0, boolean arg1)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #11
		// @005: iload_2
		// @006: ifeq @012
		// @009: aload_0
		// @00A: iconst_1
		// @00B: putfield boolean game.C_100018_wk.field_101522_N
		// @00E: goto @012
		// @011: athrow
		// @012: sipush 300 (0x012C)
		// @015: istore_3
		// @016: aload_0
		// @017: getfield int game.C_100018_wk.field_101516_G
		// @01A: iconst_m1
		// @01B: ixor
		// @01C: bipush -21 (0xEB)
		// @01E: if_icmpgt @2D1
		// @021: sipush 128 (0x0080)
		// @024: aload_0
		// @025: getfield int game.C_100018_wk.field_101516_G
		// @028: if_icmple @264
		// @02B: goto @02F
		// @02E: athrow
		// @02F: aconst_null
		// @030: aload_0
		// @031: getfield game.C_100314_lf game.C_100018_wk.field_101529_K
		// @034: if_acmpne @03F
		// @037: goto @03B
		// @03A: athrow
		// @03B: goto @07D
		// @03E: athrow
		// @03F: aload_0
		// @040: getfield game.C_100314_lf game.C_100018_wk.field_101529_K
		// @043: getfield boolean game.C_100314_lf.field_101403_Rb
		// @046: ifne @074
		// @049: aload_0
		// @04A: aload_0
		// @04B: getfield game.C_100314_lf game.C_100018_wk.field_101529_K
		// @04E: getfield int game.C_100314_lf.field_101377_tc
		// @051: putfield int game.C_100018_wk.field_101548_u
		// @054: aload_0
		// @055: aload_0
		// @056: getfield game.C_100314_lf game.C_100018_wk.field_101529_K
		// @059: getfield int game.C_100314_lf.field_101299_xc
		// @05C: ldc 127521955 (0x799d4a3)
		// @05E: ishl
		// @05F: ineg
		// @060: aload_0
		// @061: getfield game.C_100314_lf game.C_100018_wk.field_101529_K
		// @064: getfield int game.C_100314_lf.field_101395_rc
		// @067: iadd
		// @068: putfield int game.C_100018_wk.field_101537_S
		// @06B: iload #11
		// @06D: ifeq @07D
		// @070: goto @074
		// @073: athrow
		// @074: aload_0
		// @075: aconst_null
		// @076: putfield game.C_100314_lf game.C_100018_wk.field_101529_K
		// @079: goto @07D
		// @07C: athrow
		// @07D: aload_0
		// @07E: getfield int game.C_100018_wk.field_101514_F
		// @081: ineg
		// @082: aload_0
		// @083: getfield int game.C_100018_wk.field_101548_u
		// @086: iadd
		// @087: bipush 10 (0x0A)
		// @089: idiv
		// @08A: istore #4
		// @08C: aload_0
		// @08D: getfield int game.C_100018_wk.field_101537_S
		// @090: aload_0
		// @091: getfield int game.C_100018_wk.field_101545_fb
		// @094: isub
		// @095: bipush 10 (0x0A)
		// @097: idiv
		// @098: istore #5
		// @09A: iload #4
		// @09C: iconst_0
		// @09D: iload #5
		// @09F: invokestatic game.C_100209_qb.func_102681_a(int, boolean, int)int
		// @0A2: istore #6
		// @0A4: aload_0
		// @0A5: getfield int game.C_100018_wk.field_101519_C
		// @0A8: iconst_0
		// @0A9: aload_0
		// @0AA: getfield int game.C_100018_wk.field_101527_J
		// @0AD: invokestatic game.C_100209_qb.func_102681_a(int, boolean, int)int
		// @0B0: istore #7
		// @0B2: sipush 8191 (0x1FFF)
		// @0B5: sipush 4096 (0x1000)
		// @0B8: iload #7
		// @0BA: ineg
		// @0BB: iload #6
		// @0BD: iadd
		// @0BE: iadd
		// @0BF: iand
		// @0C0: sipush 4096 (0x1000)
		// @0C3: isub
		// @0C4: istore #8
		// @0C6: aload_0
		// @0C7: getfield int game.C_100018_wk.field_101527_J
		// @0CA: aload_0
		// @0CB: getfield int game.C_100018_wk.field_101519_C
		// @0CE: bipush -109 (0x93)
		// @0D0: invokestatic game.C_100049_vf.func_104191_a(int, int, int)int
		// @0D3: istore #9
		// @0D5: sipush 1023 (0x03FF)
		// @0D8: iload #8
		// @0DA: iconst_m1
		// @0DB: ixor
		// @0DC: if_icmplt @105
		// @0DF: iload #8
		// @0E1: sipush 1024 (0x0400)
		// @0E4: if_icmpgt @105
		// @0E7: goto @0EB
		// @0EA: athrow
		// @0EB: iload #9
		// @0ED: iconst_m1
		// @0EE: ixor
		// @0EF: sipush -301 (0xFED3)
		// @0F2: if_icmpgt @0FD
		// @0F5: goto @0F9
		// @0F8: athrow
		// @0F9: goto @127
		// @0FC: athrow
		// @0FD: iinc #9 +5
		// @100: iload #11
		// @102: ifeq @127
		// @105: sipush 300 (0x012C)
		// @108: iload #9
		// @10A: if_icmpgt @115
		// @10D: goto @111
		// @110: athrow
		// @111: goto @118
		// @114: athrow
		// @115: iinc #9 +5
		// @118: sipush 300 (0x012C)
		// @11B: iload #9
		// @11D: if_icmpge @127
		// @120: iinc #9 +251
		// @123: goto @127
		// @126: athrow
		// @127: bipush 16 (0x10)
		// @129: iload #8
		// @12B: if_icmplt @132
		// @12E: goto @136
		// @131: athrow
		// @132: bipush 16 (0x10)
		// @134: istore #8
		// @136: iload #8
		// @138: bipush -16 (0xF0)
		// @13A: if_icmpge @141
		// @13D: bipush -16 (0xF0)
		// @13F: istore #8
		// @141: iconst_0
		// @142: aload_0
		// @143: getfield int game.C_100018_wk.field_101519_C
		// @146: iload #4
		// @148: imul
		// @149: if_icmple @197
		// @14C: iconst_0
		// @14D: aload_0
		// @14E: getfield int game.C_100018_wk.field_101554_x
		// @151: aload_0
		// @152: getfield int game.C_100018_wk.field_101519_C
		// @155: imul
		// @156: if_icmpge @197
		// @159: goto @15D
		// @15C: athrow
		// @15D: aload_0
		// @15E: getfield int game.C_100018_wk.field_101521_M
		// @161: aload_0
		// @162: getfield int game.C_100018_wk.field_101527_J
		// @165: imul
		// @166: iconst_m1
		// @167: ixor
		// @168: iconst_m1
		// @169: if_icmpge @197
		// @16C: goto @170
		// @16F: athrow
		// @170: aconst_null
		// @171: aload_0
		// @172: getfield game.C_100314_lf game.C_100018_wk.field_101529_K
		// @175: if_acmpeq @197
		// @178: goto @17C
		// @17B: athrow
		// @17C: iconst_m1
		// @17D: aload_0
		// @17E: getfield int game.C_100018_wk.field_101519_C
		// @181: iload #8
		// @183: aload_0
		// @184: getfield int game.C_100018_wk.field_101527_J
		// @187: imul
		// @188: imul
		// @189: iconst_m1
		// @18A: ixor
		// @18B: if_icmpge @197
		// @18E: goto @192
		// @191: athrow
		// @192: iload #8
		// @194: ineg
		// @195: istore #8
		// @197: iload #7
		// @199: iload #8
		// @19B: iadd
		// @19C: istore #7
		// @19E: aload_0
		// @19F: iload #7
		// @1A1: iconst_0
		// @1A2: invokestatic game.C_100273_mm.func_106673_a(int, boolean)int
		// @1A5: iload #9
		// @1A7: imul
		// @1A8: ldc 681753360 (0x28a2bb10)
		// @1AA: ishr
		// @1AB: putfield int game.C_100018_wk.field_101519_C
		// @1AE: aload_0
		// @1AF: iconst_3
		// @1B0: iload #7
		// @1B2: invokestatic game.C_100284_nj.func_106768_a(int, int)int
		// @1B5: iload #9
		// @1B7: imul
		// @1B8: ldc -909739632 (0xc9c67990)
		// @1BA: ishr
		// @1BB: putfield int game.C_100018_wk.field_101527_J
		// @1BE: aload_0
		// @1BF: iconst_0
		// @1C0: putfield boolean game.C_100018_wk.field_101544_hb
		// @1C3: aload_0
		// @1C4: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @1C7: getfield boolean game.C_100294_ki.field_106969_V
		// @1CA: ifne @25F
		// @1CD: aload_0
		// @1CE: getfield boolean game.C_100018_wk.field_101513_E
		// @1D1: ifne @25F
		// @1D4: goto @1D8
		// @1D7: athrow
		// @1D8: iload_1
		// @1D9: aload_0
		// @1DA: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @1DD: getfield int game.C_100294_ki.field_106951_E
		// @1E0: iadd
		// @1E1: iconst_1
		// @1E2: iand
		// @1E3: ifne @25F
		// @1E6: goto @1EA
		// @1E9: athrow
		// @1EA: aload_0
		// @1EB: getfield int game.C_100018_wk.field_101514_F
		// @1EE: aload_0
		// @1EF: getfield int game.C_100018_wk.field_101519_C
		// @1F2: ineg
		// @1F3: iconst_2
		// @1F4: idiv
		// @1F5: aload_0
		// @1F6: getfield boolean game.C_100018_wk.field_101534_V
		// @1F9: aload_0
		// @1FA: getfield int game.C_100018_wk.field_101545_fb
		// @1FD: aload_0
		// @1FE: getfield int game.C_100018_wk.field_101527_J
		// @201: ineg
		// @202: iconst_2
		// @203: idiv
		// @204: aload_0
		// @205: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @208: bipush -124 (0x84)
		// @20A: aload_0
		// @20B: getfield int game.C_100018_wk.field_101514_F
		// @20E: iconst_2
		// @20F: sipush 200 (0x00C8)
		// @212: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @215: astore #10
		// @217: aload_0
		// @218: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @21B: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @21E: bipush 124 (0x7C)
		// @220: aload #10
		// @222: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @225: aload_0
		// @226: getfield int game.C_100018_wk.field_101514_F
		// @229: aload_0
		// @22A: getfield int game.C_100018_wk.field_101519_C
		// @22D: ineg
		// @22E: iconst_2
		// @22F: idiv
		// @230: aload_0
		// @231: getfield boolean game.C_100018_wk.field_101534_V
		// @234: aload_0
		// @235: getfield int game.C_100018_wk.field_101545_fb
		// @238: aload_0
		// @239: getfield int game.C_100018_wk.field_101527_J
		// @23C: ineg
		// @23D: iconst_2
		// @23E: idiv
		// @23F: aload_0
		// @240: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @243: bipush -124 (0x84)
		// @245: aload_0
		// @246: getfield int game.C_100018_wk.field_101514_F
		// @249: iconst_3
		// @24A: bipush 50 (0x32)
		// @24C: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @24F: astore #10
		// @251: aload_0
		// @252: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @255: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @258: bipush 124 (0x7C)
		// @25A: aload #10
		// @25C: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @25F: iload #11
		// @261: ifeq @3C8
		// @264: aload_0
		// @265: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @268: getfield boolean game.C_100294_ki.field_106969_V
		// @26B: ifne @3C8
		// @26E: goto @272
		// @271: athrow
		// @272: aload_0
		// @273: getfield boolean game.C_100018_wk.field_101513_E
		// @276: ifne @3C8
		// @279: goto @27D
		// @27C: athrow
		// @27D: iload_1
		// @27E: aload_0
		// @27F: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @282: getfield int game.C_100294_ki.field_106951_E
		// @285: iadd
		// @286: iconst_1
		// @287: iand
		// @288: iconst_m1
		// @289: ixor
		// @28A: iconst_m1
		// @28B: if_icmpne @3C8
		// @28E: goto @292
		// @291: athrow
		// @292: aload_0
		// @293: getfield int game.C_100018_wk.field_101514_F
		// @296: aload_0
		// @297: getfield int game.C_100018_wk.field_101519_C
		// @29A: ineg
		// @29B: iconst_2
		// @29C: idiv
		// @29D: aload_0
		// @29E: getfield boolean game.C_100018_wk.field_101534_V
		// @2A1: aload_0
		// @2A2: getfield int game.C_100018_wk.field_101545_fb
		// @2A5: aload_0
		// @2A6: getfield int game.C_100018_wk.field_101527_J
		// @2A9: ineg
		// @2AA: iconst_2
		// @2AB: idiv
		// @2AC: aload_0
		// @2AD: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @2B0: bipush -124 (0x84)
		// @2B2: aload_0
		// @2B3: getfield int game.C_100018_wk.field_101514_F
		// @2B6: iconst_3
		// @2B7: bipush 50 (0x32)
		// @2B9: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @2BC: astore #4
		// @2BE: aload_0
		// @2BF: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @2C2: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @2C5: bipush 125 (0x7D)
		// @2C7: aload #4
		// @2C9: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @2CC: iload #11
		// @2CE: ifeq @3C8
		// @2D1: aload_0
		// @2D2: getfield int game.C_100018_wk.field_101519_C
		// @2D5: istore #4
		// @2D7: aload_0
		// @2D8: getfield int game.C_100018_wk.field_101527_J
		// @2DB: istore #5
		// @2DD: iload #5
		// @2DF: iload #5
		// @2E1: imul
		// @2E2: iload #4
		// @2E4: iload #4
		// @2E6: imul
		// @2E7: iadd
		// @2E8: i2d
		// @2E9: invokestatic java.lang.Math.sqrt(double)double
		// @2EC: d2i
		// @2ED: istore #6
		// @2EF: iload #6
		// @2F1: iconst_1
		// @2F2: if_icmpge @2F8
		// @2F5: iconst_1
		// @2F6: istore #6
		// @2F8: aload_0
		// @2F9: iload #5
		// @2FB: aload_0
		// @2FC: getfield int game.C_100018_wk.field_101516_G
		// @2FF: bipush -5 (0xFB)
		// @301: isub
		// @302: imul
		// @303: iload_3
		// @304: imul
		// @305: bipush 25 (0x19)
		// @307: iload #6
		// @309: imul
		// @30A: idiv
		// @30B: putfield int game.C_100018_wk.field_101527_J
		// @30E: aload_0
		// @30F: aload_0
		// @310: getfield int game.C_100018_wk.field_101516_G
		// @313: iconst_5
		// @314: iadd
		// @315: iload #4
		// @317: iload_3
		// @318: imul
		// @319: imul
		// @31A: bipush 25 (0x19)
		// @31C: iload #6
		// @31E: imul
		// @31F: idiv
		// @320: putfield int game.C_100018_wk.field_101519_C
		// @323: aload_0
		// @324: iconst_0
		// @325: putfield boolean game.C_100018_wk.field_101544_hb
		// @328: aload_0
		// @329: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @32C: getfield boolean game.C_100294_ki.field_106969_V
		// @32F: ifne @3C8
		// @332: aload_0
		// @333: getfield boolean game.C_100018_wk.field_101513_E
		// @336: ifne @3C8
		// @339: goto @33D
		// @33C: athrow
		// @33D: iconst_1
		// @33E: iload_1
		// @33F: aload_0
		// @340: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @343: getfield int game.C_100294_ki.field_106951_E
		// @346: iadd
		// @347: iand
		// @348: ifeq @353
		// @34B: goto @34F
		// @34E: athrow
		// @34F: goto @3C8
		// @352: athrow
		// @353: aload_0
		// @354: getfield int game.C_100018_wk.field_101514_F
		// @357: aload_0
		// @358: getfield int game.C_100018_wk.field_101519_C
		// @35B: ineg
		// @35C: iconst_2
		// @35D: idiv
		// @35E: aload_0
		// @35F: getfield boolean game.C_100018_wk.field_101534_V
		// @362: aload_0
		// @363: getfield int game.C_100018_wk.field_101545_fb
		// @366: aload_0
		// @367: getfield int game.C_100018_wk.field_101527_J
		// @36A: ineg
		// @36B: iconst_2
		// @36C: idiv
		// @36D: aload_0
		// @36E: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @371: bipush -124 (0x84)
		// @373: aload_0
		// @374: getfield int game.C_100018_wk.field_101514_F
		// @377: iconst_2
		// @378: sipush 200 (0x00C8)
		// @37B: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @37E: astore #7
		// @380: aload_0
		// @381: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @384: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @387: bipush 124 (0x7C)
		// @389: aload #7
		// @38B: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @38E: aload_0
		// @38F: getfield int game.C_100018_wk.field_101514_F
		// @392: aload_0
		// @393: getfield int game.C_100018_wk.field_101519_C
		// @396: ineg
		// @397: iconst_2
		// @398: idiv
		// @399: aload_0
		// @39A: getfield boolean game.C_100018_wk.field_101534_V
		// @39D: aload_0
		// @39E: getfield int game.C_100018_wk.field_101545_fb
		// @3A1: aload_0
		// @3A2: getfield int game.C_100018_wk.field_101527_J
		// @3A5: ineg
		// @3A6: iconst_2
		// @3A7: idiv
		// @3A8: aload_0
		// @3A9: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @3AC: bipush -124 (0x84)
		// @3AE: aload_0
		// @3AF: getfield int game.C_100018_wk.field_101514_F
		// @3B2: iconst_3
		// @3B3: bipush 50 (0x32)
		// @3B5: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @3B8: astore #7
		// @3BA: aload_0
		// @3BB: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @3BE: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @3C1: bipush 124 (0x7C)
		// @3C3: aload #7
		// @3C5: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @3C8: aload_0
		// @3C9: iconst_4
		// @3CA: putfield int game.C_100018_wk.field_101515_cb
		// @3CD: iconst_0
		// @3CE: ireturn
		// @3CF: astore_3
		// @3D0: aload_3
		// @3D1: new java.lang.StringBuilder
		// @3D4: dup
		// @3D5: invokespecial java.lang.StringBuilder.<init>()void
		// @3D8: getstatic java.lang.String[] game.C_100018_wk.field_101532_ib
		// @3DB: bipush 7 (0x07)
		// @3DD: aaload
		// @3DE: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3E1: iload_1
		// @3E2: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3E5: bipush 44 (0x2C)
		// @3E7: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3EA: iload_2
		// @3EB: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @3EE: bipush 41 (0x29)
		// @3F0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3F3: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @3F6: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @3F9: athrow
	}
	
	private final void func_101505_a(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #8
		// @005: aconst_null
		// @006: aload_0
		// @007: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @00A: if_acmpeq @031
		// @00D: aload_0
		// @00E: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @011: getfield int game.C_100314_lf.field_101343_vb
		// @014: iconst_m1
		// @015: ixor
		// @016: bipush -42 (0xD6)
		// @018: if_icmpeq @023
		// @01B: goto @01F
		// @01E: athrow
		// @01F: goto @031
		// @022: athrow
		// @023: iload #4
		// @025: iconst_4
		// @026: imul
		// @027: istore #4
		// @029: iload_2
		// @02A: iconst_2
		// @02B: imul
		// @02C: istore_2
		// @02D: iload_1
		// @02E: iconst_2
		// @02F: imul
		// @030: istore_1
		// @031: aload_0
		// @032: getfield boolean game.C_100018_wk.field_101547_v
		// @035: ifeq @041
		// @038: aload_0
		// @039: iconst_1
		// @03A: putfield boolean game.C_100018_wk.field_101523_O
		// @03D: goto @041
		// @040: athrow
		// @041: aload_0
		// @042: getfield boolean game.C_100018_wk.field_101513_E
		// @045: ifne @057
		// @048: aload_0
		// @049: getfield boolean game.C_100018_wk.field_101547_v
		// @04C: ifne @057
		// @04F: goto @053
		// @052: athrow
		// @053: goto @058
		// @056: athrow
		// @057: return
		// @058: bipush 32 (0x20)
		// @05A: aload_0
		// @05B: getfield int game.C_100018_wk.field_101541_X
		// @05E: if_icmpeq @153
		// @061: bipush -2 (0xFE)
		// @063: aload_0
		// @064: getfield int game.C_100018_wk.field_101541_X
		// @067: if_icmpeq @153
		// @06A: goto @06E
		// @06D: athrow
		// @06E: bipush -9 (0xF7)
		// @070: aload_0
		// @071: getfield int game.C_100018_wk.field_101541_X
		// @074: iconst_m1
		// @075: ixor
		// @076: if_icmpeq @13A
		// @079: goto @07D
		// @07C: athrow
		// @07D: iload_2
		// @07E: iconst_m1
		// @07F: ixor
		// @080: bipush -51 (0xCD)
		// @082: if_icmpgt @126
		// @085: goto @089
		// @088: athrow
		// @089: iload_2
		// @08A: iconst_m1
		// @08B: ixor
		// @08C: bipush -101 (0x9B)
		// @08E: if_icmpgt @112
		// @091: goto @095
		// @094: athrow
		// @095: iload_2
		// @096: sipush 150 (0x0096)
		// @099: if_icmpge @0BE
		// @09C: goto @0A0
		// @09F: athrow
		// @0A0: aload_0
		// @0A1: getfield int game.C_100018_wk.field_101514_F
		// @0A4: bipush 88 (0x58)
		// @0A6: iload #6
		// @0A8: ifne @0B4
		// @0AB: goto @0AF
		// @0AE: athrow
		// @0AF: iconst_1
		// @0B0: goto @0B5
		// @0B3: athrow
		// @0B4: iconst_0
		// @0B5: invokestatic game.C_100143_bl.func_105098_a(int, int, boolean)game.C_100179_ch
		// @0B8: pop
		// @0B9: iload #8
		// @0BB: ifeq @153
		// @0BE: sipush 200 (0x00C8)
		// @0C1: iload_2
		// @0C2: if_icmpgt @0FE
		// @0C5: goto @0C9
		// @0C8: athrow
		// @0C9: iload_2
		// @0CA: iconst_m1
		// @0CB: ixor
		// @0CC: sipush -251 (0xFF05)
		// @0CF: if_icmpgt @0EA
		// @0D2: goto @0D6
		// @0D5: athrow
		// @0D6: aload_0
		// @0D7: getfield int game.C_100018_wk.field_101514_F
		// @0DA: bipush 54 (0x36)
		// @0DC: iconst_1
		// @0DD: invokestatic game.C_100143_bl.func_105098_a(int, int, boolean)game.C_100179_ch
		// @0E0: pop
		// @0E1: iload #8
		// @0E3: ifeq @153
		// @0E6: goto @0EA
		// @0E9: athrow
		// @0EA: aload_0
		// @0EB: getfield int game.C_100018_wk.field_101514_F
		// @0EE: bipush 53 (0x35)
		// @0F0: iconst_1
		// @0F1: invokestatic game.C_100143_bl.func_105098_a(int, int, boolean)game.C_100179_ch
		// @0F4: pop
		// @0F5: iload #8
		// @0F7: ifeq @153
		// @0FA: goto @0FE
		// @0FD: athrow
		// @0FE: aload_0
		// @0FF: getfield int game.C_100018_wk.field_101514_F
		// @102: bipush 89 (0x59)
		// @104: iconst_1
		// @105: invokestatic game.C_100143_bl.func_105098_a(int, int, boolean)game.C_100179_ch
		// @108: pop
		// @109: iload #8
		// @10B: ifeq @153
		// @10E: goto @112
		// @111: athrow
		// @112: aload_0
		// @113: getfield int game.C_100018_wk.field_101514_F
		// @116: bipush 87 (0x57)
		// @118: iconst_1
		// @119: invokestatic game.C_100143_bl.func_105098_a(int, int, boolean)game.C_100179_ch
		// @11C: pop
		// @11D: iload #8
		// @11F: ifeq @153
		// @122: goto @126
		// @125: athrow
		// @126: aload_0
		// @127: getfield int game.C_100018_wk.field_101514_F
		// @12A: bipush 86 (0x56)
		// @12C: iconst_1
		// @12D: invokestatic game.C_100143_bl.func_105098_a(int, int, boolean)game.C_100179_ch
		// @130: pop
		// @131: iload #8
		// @133: ifeq @153
		// @136: goto @13A
		// @139: athrow
		// @13A: aload_0
		// @13B: getfield int game.C_100018_wk.field_101514_F
		// @13E: bipush 17 (0x11)
		// @140: iload #6
		// @142: ifne @14E
		// @145: goto @149
		// @148: athrow
		// @149: iconst_1
		// @14A: goto @14F
		// @14D: athrow
		// @14E: iconst_0
		// @14F: invokestatic game.C_100143_bl.func_105098_a(int, int, boolean)game.C_100179_ch
		// @152: pop
		// @153: new game.C_100058_dg
		// @156: dup
		// @157: aload_0
		// @158: getfield int game.C_100018_wk.field_101514_F
		// @15B: aload_0
		// @15C: getfield int game.C_100018_wk.field_101545_fb
		// @15F: iconst_0
		// @160: iconst_0
		// @161: iload_2
		// @162: aload_0
		// @163: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @166: iload #5
		// @168: ifeq @173
		// @16B: aload_0
		// @16C: getfield game.C_100314_lf[] game.C_100018_wk.field_101553_y
		// @16F: goto @174
		// @172: athrow
		// @173: aconst_null
		// @174: aload_0
		// @175: invokespecial game.C_100058_dg.<init>(int, int, int, int, int, game.C_100294_ki, game.C_100314_lf[], game.C_100018_wk)void
		// @178: astore #7
		// @17A: aload #7
		// @17C: aload_0
		// @17D: getfield boolean game.C_100018_wk.field_101525_eb
		// @180: putfield boolean game.C_100058_dg.field_101567_C
		// @183: iload #6
		// @185: ifeq @192
		// @188: aload_0
		// @189: bipush 67 (0x43)
		// @18B: putfield int game.C_100018_wk.field_101554_x
		// @18E: goto @192
		// @191: athrow
		// @192: aload #7
		// @194: iload #4
		// @196: putfield int game.C_100058_dg.field_101576_w
		// @199: aload #7
		// @19B: iload_3
		// @19C: putfield int game.C_100058_dg.field_101571_O
		// @19F: aload #7
		// @1A1: iload_1
		// @1A2: putfield int game.C_100058_dg.field_101565_A
		// @1A5: aload_0
		// @1A6: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @1A9: getfield game.C_100202_qi game.C_100294_ki.field_106991_fb
		// @1AC: bipush 124 (0x7C)
		// @1AE: aload #7
		// @1B0: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @1B3: goto @20A
		// @1B6: astore #7
		// @1B8: aload #7
		// @1BA: new java.lang.StringBuilder
		// @1BD: dup
		// @1BE: invokespecial java.lang.StringBuilder.<init>()void
		// @1C1: getstatic java.lang.String[] game.C_100018_wk.field_101532_ib
		// @1C4: bipush 22 (0x16)
		// @1C6: aaload
		// @1C7: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1CA: iload_1
		// @1CB: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1CE: bipush 44 (0x2C)
		// @1D0: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1D3: iload_2
		// @1D4: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1D7: bipush 44 (0x2C)
		// @1D9: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1DC: iload_3
		// @1DD: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1E0: bipush 44 (0x2C)
		// @1E2: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1E5: iload #4
		// @1E7: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1EA: bipush 44 (0x2C)
		// @1EC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1EF: iload #5
		// @1F1: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @1F4: bipush 44 (0x2C)
		// @1F6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1F9: iload #6
		// @1FB: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @1FE: bipush 41 (0x29)
		// @200: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @203: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @206: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @209: athrow
		// @20A: return
	}
	
	final void func_101499_a(int arg0, int arg1, boolean arg2)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #22
		// @005: iload_3
		// @006: iconst_1
		// @007: if_icmpeq @013
		// @00A: aload_0
		// @00B: iconst_1
		// @00C: putfield boolean game.C_100018_wk.field_101513_E
		// @00F: goto @013
		// @012: athrow
		// @013: iload_2
		// @014: aload_0
		// @015: getfield int game.C_100018_wk.field_101514_F
		// @018: ldc 1960250472 (0x74d70c68)
		// @01A: ishr
		// @01B: iadd
		// @01C: istore #4
		// @01E: iload_1
		// @01F: aload_0
		// @020: getfield int game.C_100018_wk.field_101545_fb
		// @023: ldc 1267466472 (0x4b8c00e8)
		// @025: ishr
		// @026: ineg
		// @027: isub
		// @028: istore #5
		// @02A: bipush 8 (0x08)
		// @02C: istore #6
		// @02E: aload_0
		// @02F: getfield int game.C_100018_wk.field_101519_C
		// @032: ineg
		// @033: i2d
		// @034: aload_0
		// @035: getfield int game.C_100018_wk.field_101527_J
		// @038: ineg
		// @039: i2d
		// @03A: invokestatic java.lang.Math.atan2(double, double)double
		// @03D: ldc2_w 65536.0
		// @040: dmul
		// @041: ldc2_w 6.283185307179586
		// @044: ddiv
		// @045: d2i
		// @046: istore #7
		// @048: bipush -20 (0xEC)
		// @04A: aload_0
		// @04B: getfield int game.C_100018_wk.field_101539_Y
		// @04E: iconst_m1
		// @04F: ixor
		// @050: if_icmpeq @057
		// @053: goto @064
		// @056: athrow
		// @057: iload #4
		// @059: iload #5
		// @05B: bipush 100 (0x64)
		// @05D: ldc 16777215 (0xffffff)
		// @05F: bipush 16 (0x10)
		// @061: invokestatic game.C_100196_rb.func_105796_c(int, int, int, int, int)void
		// @064: aload_0
		// @065: getfield int game.C_100018_wk.field_101539_Y
		// @068: iconst_m1
		// @069: ixor
		// @06A: bipush -13 (0xF3)
		// @06C: if_icmpgt @0D0
		// @06F: aload_0
		// @070: getfield int game.C_100018_wk.field_101539_Y
		// @073: bipush 16 (0x10)
		// @075: if_icmpgt @0D0
		// @078: goto @07C
		// @07B: athrow
		// @07C: aload_0
		// @07D: getfield int game.C_100018_wk.field_101519_C
		// @080: iconst_1
		// @081: if_icmpne @0AF
		// @084: goto @088
		// @087: athrow
		// @088: getstatic game.C_100037_wb game.C_100309_lk.field_103268_P
		// @08B: getstatic game.C_100037_wb game.C_100017_wj.field_103818_b
		// @08E: getfield int game.C_100037_wb.field_102341_y
		// @091: iconst_2
		// @092: idiv
		// @093: ineg
		// @094: iload #4
		// @096: iadd
		// @097: iload #5
		// @099: getstatic game.C_100037_wb game.C_100017_wj.field_103818_b
		// @09C: getfield int game.C_100037_wb.field_102340_z
		// @09F: iconst_2
		// @0A0: idiv
		// @0A1: ineg
		// @0A2: iadd
		// @0A3: invokevirtual game.C_100037_wb.func_102353_h(int, int)void
		// @0A6: iload #22
		// @0A8: ifeq @0D0
		// @0AB: goto @0AF
		// @0AE: athrow
		// @0AF: getstatic game.C_100037_wb game.C_100017_wj.field_103818_b
		// @0B2: iload #4
		// @0B4: getstatic game.C_100037_wb game.C_100017_wj.field_103818_b
		// @0B7: getfield int game.C_100037_wb.field_102341_y
		// @0BA: iconst_2
		// @0BB: idiv
		// @0BC: ineg
		// @0BD: iadd
		// @0BE: iload #5
		// @0C0: getstatic game.C_100037_wb game.C_100017_wj.field_103818_b
		// @0C3: getfield int game.C_100037_wb.field_102340_z
		// @0C6: iconst_2
		// @0C7: idiv
		// @0C8: isub
		// @0C9: invokevirtual game.C_100037_wb.func_102353_h(int, int)void
		// @0CC: goto @0D0
		// @0CF: athrow
		// @0D0: iload #4
		// @0D2: iconst_m1
		// @0D3: ixor
		// @0D4: bipush 31 (0x1F)
		// @0D6: if_icmpgt @102
		// @0D9: sipush 672 (0x02A0)
		// @0DC: iload #4
		// @0DE: if_icmplt @102
		// @0E1: goto @0E5
		// @0E4: athrow
		// @0E5: iload #5
		// @0E7: iconst_m1
		// @0E8: ixor
		// @0E9: bipush 31 (0x1F)
		// @0EB: if_icmpgt @102
		// @0EE: goto @0F2
		// @0F1: athrow
		// @0F2: sipush 672 (0x02A0)
		// @0F5: iload #5
		// @0F7: if_icmplt @102
		// @0FA: goto @0FE
		// @0FD: athrow
		// @0FE: goto @103
		// @101: athrow
		// @102: return
		// @103: aload_0
		// @104: getfield int game.C_100018_wk.field_101539_Y
		// @107: iconst_2
		// @108: if_icmpne @1AA
		// @10B: aload_0
		// @10C: getfield int game.C_100018_wk.field_101541_X
		// @10F: bipush -17 (0xEF)
		// @111: isub
		// @112: bipush 109 (0x6D)
		// @114: invokestatic game.C_100209_qb.func_102686_b(int, byte)game.C_100327_ib
		// @117: astore #8
		// @119: aconst_null
		// @11A: aload #8
		// @11C: if_acmpeq @1A5
		// @11F: aload #8
		// @121: getfield game.C_100153_be game.C_100327_ib.field_102492_T
		// @124: aload #8
		// @126: getfield game.C_100153_be game.C_100327_ib.field_102492_T
		// @129: getfield int game.C_100153_be.field_105301_h
		// @12C: ldc 1876375363 (0x6fd73743)
		// @12E: ishl
		// @12F: aload #8
		// @131: getfield game.C_100153_be game.C_100327_ib.field_102492_T
		// @134: getfield int game.C_100153_be.field_105303_s
		// @137: ldc 1309325827 (0x4e0aba03)
		// @139: ishl
		// @13A: iload #4
		// @13C: ldc 1071136228 (0x3fd83de4)
		// @13E: ishl
		// @13F: iload #5
		// @141: ldc 1837149348 (0x6d80aca4)
		// @143: ishl
		// @144: iload #7
		// @146: sipush 1024 (0x0400)
		// @149: invokevirtual game.C_100153_be.func_105316_a(int, int, int, int, int, int)void
		// @14C: bipush 32 (0x20)
		// @14E: aload_0
		// @14F: getfield int game.C_100018_wk.field_101541_X
		// @152: if_icmpeq @15D
		// @155: goto @159
		// @158: athrow
		// @159: goto @1A5
		// @15C: athrow
		// @15D: iload #6
		// @15F: iconst_3
		// @160: imul
		// @161: iconst_2
		// @162: idiv
		// @163: istore #9
		// @165: getstatic game.C_100037_wb[] game.C_100056_de.field_103185_gb
		// @168: iconst_0
		// @169: aload_0
		// @16A: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @16D: getfield int game.C_100294_ki.field_106951_E
		// @170: bipush 10 (0x0A)
		// @172: idiv
		// @173: bipush 6 (0x06)
		// @175: irem
		// @176: ineg
		// @177: isub
		// @178: aaload
		// @179: aload_0
		// @17A: getfield int game.C_100018_wk.field_101519_C
		// @17D: ldc 1497074758 (0x593b8c46)
		// @17F: ishr
		// @180: ineg
		// @181: iload #9
		// @183: ineg
		// @184: iload #4
		// @186: iadd
		// @187: iadd
		// @188: aload_0
		// @189: getfield int game.C_100018_wk.field_101527_J
		// @18C: ldc -318618458 (0xed0244a6)
		// @18E: ishr
		// @18F: ineg
		// @190: iload #9
		// @192: ineg
		// @193: iload #5
		// @195: iadd
		// @196: iadd
		// @197: iload #9
		// @199: iconst_2
		// @19A: imul
		// @19B: iload #9
		// @19D: iconst_2
		// @19E: imul
		// @19F: sipush 192 (0x00C0)
		// @1A2: invokevirtual game.C_100037_wb.func_102377_b(int, int, int, int, int)void
		// @1A5: iload #22
		// @1A7: ifeq @809
		// @1AA: aload_0
		// @1AB: getfield int game.C_100018_wk.field_101539_Y
		// @1AE: iconst_4
		// @1AF: if_icmpne @5D2
		// @1B2: goto @1B6
		// @1B5: athrow
		// @1B6: aload_0
		// @1B7: getfield int game.C_100018_wk.field_101515_cb
		// @1BA: bipush 32 (0x20)
		// @1BC: if_icmpne @1C7
		// @1BF: goto @1C3
		// @1C2: athrow
		// @1C3: goto @809
		// @1C6: athrow
		// @1C7: bipush 120 (0x78)
		// @1C9: istore #8
		// @1CB: bipush 49 (0x31)
		// @1CD: istore #9
		// @1CF: ldc 1114111 (0x10ffff)
		// @1D1: istore #10
		// @1D3: getstatic int[] game.C_100235_om.field_106286_f
		// @1D6: astore #11
		// @1D8: aload_0
		// @1D9: getfield int game.C_100018_wk.field_101541_X
		// @1DC: iconst_m1
		// @1DD: ixor
		// @1DE: bipush -18 (0xEE)
		// @1E0: if_icmpeq @1E7
		// @1E3: goto @1EF
		// @1E6: athrow
		// @1E7: bipush 120 (0x78)
		// @1E9: istore #8
		// @1EB: ldc 8978431 (0x88ffff)
		// @1ED: istore #10
		// @1EF: bipush 30 (0x1E)
		// @1F1: aload_0
		// @1F2: getfield int game.C_100018_wk.field_101541_X
		// @1F5: if_icmpeq @1FC
		// @1F8: goto @204
		// @1FB: athrow
		// @1FC: ldc 16777215 (0xffffff)
		// @1FE: istore #10
		// @200: bipush 120 (0x78)
		// @202: istore #8
		// @204: bipush 35 (0x23)
		// @206: aload_0
		// @207: getfield int game.C_100018_wk.field_101541_X
		// @20A: if_icmpne @21B
		// @20D: getstatic int[] game.C_100235_om.field_106294_l
		// @210: astore #11
		// @212: sipush 180 (0x00B4)
		// @215: istore #8
		// @217: bipush 99 (0x63)
		// @219: istore #9
		// @21B: bipush -22 (0xEA)
		// @21D: aload_0
		// @21E: getfield int game.C_100018_wk.field_101541_X
		// @221: iconst_m1
		// @222: ixor
		// @223: if_icmpeq @22A
		// @226: goto @233
		// @229: athrow
		// @22A: bipush 96 (0x60)
		// @22C: istore #8
		// @22E: getstatic int[] game.C_100235_om.field_106294_l
		// @231: astore #11
		// @233: bipush -11 (0xF5)
		// @235: aload_0
		// @236: getfield int game.C_100018_wk.field_101541_X
		// @239: iconst_m1
		// @23A: ixor
		// @23B: if_icmpne @247
		// @23E: getstatic int[] game.C_100235_om.field_106294_l
		// @241: astore #11
		// @243: bipush 64 (0x40)
		// @245: istore #8
		// @247: bipush 21 (0x15)
		// @249: aload_0
		// @24A: getfield int game.C_100018_wk.field_101541_X
		// @24D: if_icmpeq @280
		// @250: bipush -11 (0xF5)
		// @252: aload_0
		// @253: getfield int game.C_100018_wk.field_101541_X
		// @256: iconst_m1
		// @257: ixor
		// @258: if_icmpeq @280
		// @25B: goto @25F
		// @25E: athrow
		// @25F: iload #8
		// @261: iconst_2
		// @262: imul
		// @263: istore #8
		// @265: iload #8
		// @267: bipush 32 (0x20)
		// @269: aload_0
		// @26A: getfield int game.C_100018_wk.field_101516_G
		// @26D: imul
		// @26E: isub
		// @26F: istore #8
		// @271: iconst_m1
		// @272: iload #8
		// @274: iconst_m1
		// @275: ixor
		// @276: if_icmplt @27D
		// @279: goto @280
		// @27C: athrow
		// @27D: iconst_0
		// @27E: istore #8
		// @280: iload #8
		// @282: ldc 97343973 (0x5cd59e5)
		// @284: ishr
		// @285: istore #12
		// @287: aload_0
		// @288: getfield int game.C_100018_wk.field_101515_cb
		// @28B: iconst_2
		// @28C: iadd
		// @28D: aload_0
		// @28E: getfield int game.C_100018_wk.field_101519_C
		// @291: imul
		// @292: ldc 1189960132 (0x46ed59c4)
		// @294: ishr
		// @295: ineg
		// @296: istore #13
		// @298: iconst_2
		// @299: aload_0
		// @29A: getfield int game.C_100018_wk.field_101515_cb
		// @29D: iadd
		// @29E: aload_0
		// @29F: getfield int game.C_100018_wk.field_101527_J
		// @2A2: imul
		// @2A3: ldc 1928552996 (0x72f36224)
		// @2A5: ishr
		// @2A6: ineg
		// @2A7: istore #14
		// @2A9: bipush -3 (0xFD)
		// @2AB: iload #12
		// @2AD: iconst_m1
		// @2AE: ixor
		// @2AF: if_icmplt @2B6
		// @2B2: goto @2B9
		// @2B5: athrow
		// @2B6: iconst_2
		// @2B7: istore #12
		// @2B9: bipush -18 (0xEE)
		// @2BB: aload_0
		// @2BC: getfield int game.C_100018_wk.field_101541_X
		// @2BF: iconst_m1
		// @2C0: ixor
		// @2C1: if_icmpne @2D0
		// @2C4: iload #14
		// @2C6: iconst_2
		// @2C7: idiv
		// @2C8: istore #14
		// @2CA: iload #13
		// @2CC: iconst_2
		// @2CD: idiv
		// @2CE: istore #13
		// @2D0: getstatic boolean game.C_100050_vg.field_100637_q
		// @2D3: ifeq @2EA
		// @2D6: bipush -4 (0xFC)
		// @2D8: iload #12
		// @2DA: iconst_m1
		// @2DB: ixor
		// @2DC: if_icmplt @2E7
		// @2DF: goto @2E3
		// @2E2: athrow
		// @2E3: goto @2EA
		// @2E6: athrow
		// @2E7: iconst_3
		// @2E8: istore #12
		// @2EA: iload #12
		// @2EC: newarray int[]
		// @2EE: astore #15
		// @2F0: iconst_0
		// @2F1: istore #16
		// @2F3: aload #15
		// @2F5: arraylength
		// @2F6: iconst_m1
		// @2F7: ixor
		// @2F8: iload #16
		// @2FA: iconst_m1
		// @2FB: ixor
		// @2FC: if_icmpge @329
		// @2FF: aload #15
		// @301: iload #16
		// @303: aload #11
		// @305: bipush 127 (0x7F)
		// @307: aload_0
		// @308: getfield int game.C_100018_wk.field_101524_H
		// @30B: imul
		// @30C: iload #9
		// @30E: idiv
		// @30F: iload #16
		// @311: imul
		// @312: aload #15
		// @314: arraylength
		// @315: idiv
		// @316: iaload
		// @317: iastore
		// @318: iinc #16 +1
		// @31B: iload #22
		// @31D: ifne @3C4
		// @320: iload #22
		// @322: ifeq @2F3
		// @325: goto @329
		// @328: athrow
		// @329: bipush 21 (0x15)
		// @32B: aload_0
		// @32C: getfield int game.C_100018_wk.field_101541_X
		// @32F: if_icmpne @3C4
		// @332: ldc2_w 0.25
		// @335: ldc2_w 0.5
		// @338: invokestatic java.lang.Math.random()double
		// @33B: dmul
		// @33C: dadd
		// @33D: dstore #16
		// @33F: ldc2_w -0.25
		// @342: ldc2_w 0.5
		// @345: invokestatic java.lang.Math.random()double
		// @348: dmul
		// @349: dadd
		// @34A: dstore #18
		// @34C: iload #13
		// @34E: i2d
		// @34F: dload #16
		// @351: dmul
		// @352: iload #14
		// @354: i2d
		// @355: dload #18
		// @357: dmul
		// @358: dadd
		// @359: d2i
		// @35A: istore #20
		// @35C: aload_0
		// @35D: iload #13
		// @35F: iload #14
		// @361: aload #15
		// @363: iload #4
		// @365: iload #12
		// @367: iconst_m1
		// @368: iadd
		// @369: iload #10
		// @36B: iload #5
		// @36D: sipush 32401 (0x7E91)
		// @370: invokespecial game.C_100018_wk.func_101508_a(int, int, int[], int, int, int, int, int)void
		// @373: dload #16
		// @375: iload #14
		// @377: i2d
		// @378: dmul
		// @379: dload #18
		// @37B: iload #13
		// @37D: i2d
		// @37E: dmul
		// @37F: dsub
		// @380: d2i
		// @381: istore #21
		// @383: aload_0
		// @384: iload #20
		// @386: iload #21
		// @388: aload #15
		// @38A: iload #4
		// @38C: iload #12
		// @38E: iload #10
		// @390: iload #5
		// @392: sipush 32401 (0x7E91)
		// @395: invokespecial game.C_100018_wk.func_101508_a(int, int, int[], int, int, int, int, int)void
		// @398: aload_0
		// @399: iload #13
		// @39B: iload #20
		// @39D: ineg
		// @39E: iadd
		// @39F: iload #14
		// @3A1: iload #21
		// @3A3: isub
		// @3A4: aload #15
		// @3A6: iload #20
		// @3A8: bipush 16 (0x10)
		// @3AA: idiv
		// @3AB: iload #4
		// @3AD: iadd
		// @3AE: iload #12
		// @3B0: iload #10
		// @3B2: iload #5
		// @3B4: iload #21
		// @3B6: bipush 16 (0x10)
		// @3B8: idiv
		// @3B9: ineg
		// @3BA: isub
		// @3BB: sipush 32401 (0x7E91)
		// @3BE: invokespecial game.C_100018_wk.func_101508_a(int, int, int[], int, int, int, int, int)void
		// @3C1: goto @5CD
		// @3C4: aload_0
		// @3C5: getfield int game.C_100018_wk.field_101541_X
		// @3C8: bipush 17 (0x11)
		// @3CA: if_icmpne @42C
		// @3CD: iload #5
		// @3CF: iconst_4
		// @3D0: ishl
		// @3D1: istore #5
		// @3D3: iload #14
		// @3D5: iconst_2
		// @3D6: ishr
		// @3D7: istore #14
		// @3D9: iload #13
		// @3DB: iconst_2
		// @3DC: ishr
		// @3DD: istore #13
		// @3DF: iload #4
		// @3E1: iconst_4
		// @3E2: ishl
		// @3E3: istore #4
		// @3E5: bipush 15 (0x0F)
		// @3E7: istore #16
		// @3E9: iconst_m1
		// @3EA: iload #16
		// @3EC: iconst_m1
		// @3ED: ixor
		// @3EE: if_icmple @427
		// @3F1: iload #4
		// @3F3: iload #5
		// @3F5: iconst_3
		// @3F6: iload #16
		// @3F8: imul
		// @3F9: bipush 32 (0x20)
		// @3FB: iadd
		// @3FC: iload #16
		// @3FE: iconst_2
		// @3FF: imul
		// @400: iconst_1
		// @401: iadd
		// @402: getstatic int[] game.C_100129_tg.field_102747_tb
		// @405: invokestatic game.C_100196_rb.func_105787_a(int, int, int, int, int[])void
		// @408: iload #4
		// @40A: iload #13
		// @40C: iadd
		// @40D: istore #4
		// @40F: iload #5
		// @411: iload #14
		// @413: iadd
		// @414: istore #5
		// @416: iinc #16 +255
		// @419: iload #22
		// @41B: ifne @5CD
		// @41E: iload #22
		// @420: ifeq @3E9
		// @423: goto @427
		// @426: athrow
		// @427: iload #22
		// @429: ifeq @5CD
		// @42C: bipush -11 (0xF5)
		// @42E: aload_0
		// @42F: getfield int game.C_100018_wk.field_101541_X
		// @432: iconst_m1
		// @433: ixor
		// @434: if_icmpne @497
		// @437: goto @43B
		// @43A: athrow
		// @43B: iload #5
		// @43D: iconst_4
		// @43E: ishl
		// @43F: istore #5
		// @441: iload #4
		// @443: iconst_4
		// @444: ishl
		// @445: istore #4
		// @447: iload #13
		// @449: iconst_3
		// @44A: ishr
		// @44B: istore #13
		// @44D: iload #14
		// @44F: iconst_3
		// @450: ishr
		// @451: istore #14
		// @453: bipush 15 (0x0F)
		// @455: istore #16
		// @457: iload #16
		// @459: ifle @492
		// @45C: iload #4
		// @45E: iload #5
		// @460: iconst_3
		// @461: iload #16
		// @463: imul
		// @464: bipush 32 (0x20)
		// @466: iadd
		// @467: iconst_2
		// @468: iload #16
		// @46A: imul
		// @46B: iconst_1
		// @46C: iadd
		// @46D: getstatic int[] game.C_100129_tg.field_102752_xb
		// @470: invokestatic game.C_100196_rb.func_105787_a(int, int, int, int, int[])void
		// @473: iload #5
		// @475: iload #14
		// @477: iadd
		// @478: istore #5
		// @47A: iload #4
		// @47C: iload #13
		// @47E: iadd
		// @47F: istore #4
		// @481: iinc #16 +255
		// @484: iload #22
		// @486: ifne @5CD
		// @489: iload #22
		// @48B: ifeq @457
		// @48E: goto @492
		// @491: athrow
		// @492: iload #22
		// @494: ifeq @5CD
		// @497: bipush 35 (0x23)
		// @499: aload_0
		// @49A: getfield int game.C_100018_wk.field_101541_X
		// @49D: if_icmpne @50D
		// @4A0: goto @4A4
		// @4A3: athrow
		// @4A4: aload_0
		// @4A5: getfield int game.C_100018_wk.field_101516_G
		// @4A8: bipush 8 (0x08)
		// @4AA: if_icmple @50D
		// @4AD: goto @4B1
		// @4B0: athrow
		// @4B1: iload #13
		// @4B3: iconst_3
		// @4B4: ishr
		// @4B5: istore #13
		// @4B7: iload #14
		// @4B9: iconst_3
		// @4BA: ishr
		// @4BB: istore #14
		// @4BD: iload #5
		// @4BF: iconst_4
		// @4C0: ishl
		// @4C1: istore #5
		// @4C3: iload #4
		// @4C5: iconst_4
		// @4C6: ishl
		// @4C7: istore #4
		// @4C9: bipush 15 (0x0F)
		// @4CB: istore #16
		// @4CD: iload #16
		// @4CF: ifle @508
		// @4D2: iload #4
		// @4D4: iload #5
		// @4D6: iload #16
		// @4D8: iconst_3
		// @4D9: imul
		// @4DA: bipush 32 (0x20)
		// @4DC: iadd
		// @4DD: iconst_1
		// @4DE: iconst_2
		// @4DF: iload #16
		// @4E1: imul
		// @4E2: iadd
		// @4E3: getstatic int[] game.C_100129_tg.field_102752_xb
		// @4E6: invokestatic game.C_100196_rb.func_105787_a(int, int, int, int, int[])void
		// @4E9: iload #5
		// @4EB: iload #14
		// @4ED: iadd
		// @4EE: istore #5
		// @4F0: iload #4
		// @4F2: iload #13
		// @4F4: iadd
		// @4F5: istore #4
		// @4F7: iinc #16 +255
		// @4FA: iload #22
		// @4FC: ifne @5CD
		// @4FF: iload #22
		// @501: ifeq @4CD
		// @504: goto @508
		// @507: athrow
		// @508: iload #22
		// @50A: ifeq @5CD
		// @50D: aload_0
		// @50E: getfield int game.C_100018_wk.field_101541_X
		// @511: bipush 30 (0x1E)
		// @513: if_icmpne @585
		// @516: goto @51A
		// @519: athrow
		// @51A: aload_0
		// @51B: getfield int game.C_100018_wk.field_101516_G
		// @51E: iconst_m1
		// @51F: ixor
		// @520: bipush -5 (0xFB)
		// @522: if_icmpge @585
		// @525: goto @529
		// @528: athrow
		// @529: iload #13
		// @52B: iconst_3
		// @52C: ishr
		// @52D: istore #13
		// @52F: iload #14
		// @531: iconst_3
		// @532: ishr
		// @533: istore #14
		// @535: iload #5
		// @537: iconst_4
		// @538: ishl
		// @539: istore #5
		// @53B: iload #4
		// @53D: iconst_4
		// @53E: ishl
		// @53F: istore #4
		// @541: bipush 15 (0x0F)
		// @543: istore #16
		// @545: iload #16
		// @547: ifle @580
		// @54A: iload #4
		// @54C: iload #5
		// @54E: iconst_3
		// @54F: iload #16
		// @551: imul
		// @552: bipush 32 (0x20)
		// @554: iadd
		// @555: iconst_2
		// @556: iload #16
		// @558: imul
		// @559: iconst_1
		// @55A: iadd
		// @55B: getstatic int[] game.C_100129_tg.field_102747_tb
		// @55E: invokestatic game.C_100196_rb.func_105787_a(int, int, int, int, int[])void
		// @561: iload #5
		// @563: iload #14
		// @565: iadd
		// @566: istore #5
		// @568: iload #4
		// @56A: iload #13
		// @56C: iadd
		// @56D: istore #4
		// @56F: iinc #16 +255
		// @572: iload #22
		// @574: ifne @5CD
		// @577: iload #22
		// @579: ifeq @545
		// @57C: goto @580
		// @57F: athrow
		// @580: iload #22
		// @582: ifeq @5CD
		// @585: iconst_2
		// @586: iload #12
		// @588: if_icmpge @5AD
		// @58B: goto @58F
		// @58E: athrow
		// @58F: aload_0
		// @590: iload #13
		// @592: iload #14
		// @594: aload #15
		// @596: iload #4
		// @598: iload #12
		// @59A: iload #10
		// @59C: iload #5
		// @59E: sipush 32401 (0x7E91)
		// @5A1: invokespecial game.C_100018_wk.func_101508_a(int, int, int[], int, int, int, int, int)void
		// @5A4: iload #22
		// @5A6: ifeq @5CD
		// @5A9: goto @5AD
		// @5AC: athrow
		// @5AD: iload #4
		// @5AF: iload #5
		// @5B1: iload #4
		// @5B3: iload #13
		// @5B5: ldc 1653610532 (0x62901824)
		// @5B7: ishr
		// @5B8: iadd
		// @5B9: iload #14
		// @5BB: ldc 1478728004 (0x58239944)
		// @5BD: ishr
		// @5BE: iload #5
		// @5C0: iadd
		// @5C1: iload #10
		// @5C3: sipush 192 (0x00C0)
		// @5C6: invokestatic game.C_100196_rb.func_105813_h(int, int, int, int, int, int)void
		// @5C9: goto @5CD
		// @5CC: athrow
		// @5CD: iload #22
		// @5CF: ifeq @809
		// @5D2: aload_0
		// @5D3: getfield int game.C_100018_wk.field_101539_Y
		// @5D6: iconst_m1
		// @5D7: ixor
		// @5D8: bipush -7 (0xF9)
		// @5DA: if_icmpeq @5E5
		// @5DD: goto @5E1
		// @5E0: athrow
		// @5E1: goto @809
		// @5E4: athrow
		// @5E5: sipush 2000 (0x07D0)
		// @5E8: istore #8
		// @5EA: iload #8
		// @5EC: ldc -1656435065 (0x9d44ce87)
		// @5EE: ishr
		// @5EF: istore #9
		// @5F1: sipush 1024 (0x0400)
		// @5F4: newarray int[]
		// @5F6: astore #10
		// @5F8: iconst_0
		// @5F9: istore #11
		// @5FB: iload #11
		// @5FD: sipush 512 (0x0200)
		// @600: if_icmpge @6AF
		// @603: iload #11
		// @605: bipush 6 (0x06)
		// @607: idiv
		// @608: istore #12
		// @60A: iload #11
		// @60C: iconst_5
		// @60D: idiv
		// @60E: istore #13
		// @610: iload #11
		// @612: iconst_4
		// @613: idiv
		// @614: istore #14
		// @616: sipush 448 (0x01C0)
		// @619: iload #11
		// @61B: iload #22
		// @61D: ifne @6E3
		// @620: if_icmpge @660
		// @623: goto @627
		// @626: athrow
		// @627: iload #12
		// @629: sipush -1024 (0xFC00)
		// @62C: sipush -192 (0xFF40)
		// @62F: iload #11
		// @631: iadd
		// @632: iconst_4
		// @633: imul
		// @634: iadd
		// @635: iconst_4
		// @636: idiv
		// @637: iadd
		// @638: istore #12
		// @63A: iload #13
		// @63C: iconst_4
		// @63D: iload #11
		// @63F: sipush 192 (0x00C0)
		// @642: isub
		// @643: imul
		// @644: sipush -1024 (0xFC00)
		// @647: iadd
		// @648: iconst_3
		// @649: idiv
		// @64A: iadd
		// @64B: istore #13
		// @64D: iload #14
		// @64F: iconst_4
		// @650: iload #11
		// @652: sipush -192 (0xFF40)
		// @655: iadd
		// @656: imul
		// @657: sipush -1024 (0xFC00)
		// @65A: iadd
		// @65B: iconst_2
		// @65C: idiv
		// @65D: iadd
		// @65E: istore #14
		// @660: iload #14
		// @662: sipush 255 (0x00FF)
		// @665: if_icmple @66D
		// @668: sipush 255 (0x00FF)
		// @66B: istore #14
		// @66D: iload #12
		// @66F: iconst_m1
		// @670: ixor
		// @671: sipush -256 (0xFF00)
		// @674: if_icmplt @67B
		// @677: goto @680
		// @67A: athrow
		// @67B: sipush 255 (0x00FF)
		// @67E: istore #12
		// @680: sipush 255 (0x00FF)
		// @683: iload #13
		// @685: if_icmplt @68C
		// @688: goto @691
		// @68B: athrow
		// @68C: sipush 255 (0x00FF)
		// @68F: istore #13
		// @691: aload #10
		// @693: iload #11
		// @695: iload #13
		// @697: sipush 256 (0x0100)
		// @69A: imul
		// @69B: ldc 65536 (0x10000)
		// @69D: iload #12
		// @69F: imul
		// @6A0: iadd
		// @6A1: iconst_1
		// @6A2: iload #14
		// @6A4: imul
		// @6A5: iadd
		// @6A6: iastore
		// @6A7: iinc #11 +1
		// @6AA: iload #22
		// @6AC: ifeq @5FB
		// @6AF: sipush 10000 (0x2710)
		// @6B2: iload #5
		// @6B4: ldc -354646268 (0xeadc8704)
		// @6B6: ishl
		// @6B7: iload #4
		// @6B9: ldc 752892164 (0x2ce03904)
		// @6BB: ishl
		// @6BC: bipush 126 (0x7E)
		// @6BE: iload #9
		// @6C0: ldc -1849151996 (0x91c82e04)
		// @6C2: ishl
		// @6C3: invokestatic game.C_100222_aa.func_106075_a(int, int, int, byte, int)void
		// @6C6: iload #4
		// @6C8: ldc -2134495868 (0x80c62d84)
		// @6CA: ishl
		// @6CB: iload #5
		// @6CD: ldc -830666364 (0xce7d0984)
		// @6CF: ishl
		// @6D0: iload #9
		// @6D2: ldc -261009084 (0xf0715144)
		// @6D4: ishl
		// @6D5: sipush 500 (0x01F4)
		// @6D8: aload #10
		// @6DA: invokestatic game.C_100196_rb.func_105787_a(int, int, int, int, int[])void
		// @6DD: bipush 18 (0x12)
		// @6DF: aload_0
		// @6E0: getfield int game.C_100018_wk.field_101541_X
		// @6E3: if_icmpne @74E
		// @6E6: aload_0
		// @6E7: getfield int game.C_100018_wk.field_101516_G
		// @6EA: i2d
		// @6EB: ldc2_w 0.2
		// @6EE: dmul
		// @6EF: invokestatic java.lang.Math.cos(double)double
		// @6F2: ldc2_w 150.0
		// @6F5: dmul
		// @6F6: d2i
		// @6F7: istore #11
		// @6F9: aload_0
		// @6FA: getfield int game.C_100018_wk.field_101516_G
		// @6FD: i2d
		// @6FE: ldc2_w 0.2
		// @701: dmul
		// @702: invokestatic java.lang.Math.sin(double)double
		// @705: ldc2_w 150.0
		// @708: dmul
		// @709: d2i
		// @70A: istore #12
		// @70C: iload #4
		// @70E: ldc -172457116 (0xf5b88364)
		// @710: ishl
		// @711: iload #11
		// @713: ineg
		// @714: isub
		// @715: iload #12
		// @717: iload #5
		// @719: ldc -561016348 (0xde8f91e4)
		// @71B: ishl
		// @71C: iadd
		// @71D: iload #9
		// @71F: ldc -1165093949 (0xba8e13c3)
		// @721: ishl
		// @722: sipush 250 (0x00FA)
		// @725: aload #10
		// @727: invokestatic game.C_100196_rb.func_105787_a(int, int, int, int, int[])void
		// @72A: iload #4
		// @72C: ldc -156167452 (0xf6b112e4)
		// @72E: ishl
		// @72F: iload #11
		// @731: ineg
		// @732: iadd
		// @733: iload #5
		// @735: ldc -1195201788 (0xb8c2ab04)
		// @737: ishl
		// @738: iload #12
		// @73A: ineg
		// @73B: iadd
		// @73C: iload #9
		// @73E: ldc -1685086685 (0x9b8f9e23)
		// @740: ishl
		// @741: sipush 250 (0x00FA)
		// @744: aload #10
		// @746: invokestatic game.C_100196_rb.func_105787_a(int, int, int, int, int[])void
		// @749: iload #22
		// @74B: ifeq @809
		// @74E: aload_0
		// @74F: getfield int game.C_100018_wk.field_101541_X
		// @752: bipush 31 (0x1F)
		// @754: if_icmpeq @75F
		// @757: goto @75B
		// @75A: athrow
		// @75B: goto @809
		// @75E: athrow
		// @75F: ldc2_w 0.2
		// @762: aload_0
		// @763: getfield int game.C_100018_wk.field_101516_G
		// @766: i2d
		// @767: dmul
		// @768: invokestatic java.lang.Math.cos(double)double
		// @76B: ldc2_w 150.0
		// @76E: dmul
		// @76F: d2i
		// @770: istore #11
		// @772: ldc2_w 150.0
		// @775: ldc2_w 0.2
		// @778: aload_0
		// @779: getfield int game.C_100018_wk.field_101516_G
		// @77C: i2d
		// @77D: dmul
		// @77E: invokestatic java.lang.Math.sin(double)double
		// @781: dmul
		// @782: d2i
		// @783: istore #12
		// @785: iload #4
		// @787: ldc -416515420 (0xe72c7aa4)
		// @789: ishl
		// @78A: iload #11
		// @78C: iadd
		// @78D: iload #5
		// @78F: ldc 408896132 (0x185f4284)
		// @791: ishl
		// @792: iload #12
		// @794: iadd
		// @795: iload #9
		// @797: ldc -818092157 (0xcf3ce783)
		// @799: ishl
		// @79A: sipush 250 (0x00FA)
		// @79D: aload #10
		// @79F: invokestatic game.C_100196_rb.func_105787_a(int, int, int, int, int[])void
		// @7A2: iload #11
		// @7A4: ineg
		// @7A5: iload #4
		// @7A7: ldc 1018642180 (0x3cb73f04)
		// @7A9: ishl
		// @7AA: iadd
		// @7AB: iload #12
		// @7AD: ineg
		// @7AE: iload #5
		// @7B0: ldc 1264852804 (0x4b641f44)
		// @7B2: ishl
		// @7B3: iadd
		// @7B4: iload #9
		// @7B6: ldc -1635563773 (0x9e834703)
		// @7B8: ishl
		// @7B9: sipush 250 (0x00FA)
		// @7BC: aload #10
		// @7BE: invokestatic game.C_100196_rb.func_105787_a(int, int, int, int, int[])void
		// @7C1: iload #12
		// @7C3: iconst_2
		// @7C4: imul
		// @7C5: istore #12
		// @7C7: iload #11
		// @7C9: iconst_2
		// @7CA: imul
		// @7CB: istore #11
		// @7CD: iload #4
		// @7CF: ldc 321210148 (0x13254724)
		// @7D1: ishl
		// @7D2: iload #12
		// @7D4: ineg
		// @7D5: isub
		// @7D6: iload #5
		// @7D8: ldc 1423208900 (0x54d471c4)
		// @7DA: ishl
		// @7DB: iload #11
		// @7DD: isub
		// @7DE: iload #9
		// @7E0: ldc 508346051 (0x1e4cbec3)
		// @7E2: ishl
		// @7E3: sipush 250 (0x00FA)
		// @7E6: aload #10
		// @7E8: invokestatic game.C_100196_rb.func_105787_a(int, int, int, int, int[])void
		// @7EB: iload #4
		// @7ED: ldc 610078756 (0x245d1024)
		// @7EF: ishl
		// @7F0: iload #12
		// @7F2: ineg
		// @7F3: iadd
		// @7F4: iload #5
		// @7F6: ldc -639669788 (0xd9df69e4)
		// @7F8: ishl
		// @7F9: iload #11
		// @7FB: iadd
		// @7FC: iload #9
		// @7FE: ldc 688998467 (0x29114843)
		// @800: ishl
		// @801: sipush 250 (0x00FA)
		// @804: aload #10
		// @806: invokestatic game.C_100196_rb.func_105787_a(int, int, int, int, int[])void
		// @809: goto @842
		// @80C: astore #4
		// @80E: aload #4
		// @810: new java.lang.StringBuilder
		// @813: dup
		// @814: invokespecial java.lang.StringBuilder.<init>()void
		// @817: getstatic java.lang.String[] game.C_100018_wk.field_101532_ib
		// @81A: bipush 10 (0x0A)
		// @81C: aaload
		// @81D: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @820: iload_1
		// @821: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @824: bipush 44 (0x2C)
		// @826: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @829: iload_2
		// @82A: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @82D: bipush 44 (0x2C)
		// @82F: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @832: iload_3
		// @833: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @836: bipush 41 (0x29)
		// @838: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @83B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @83E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @841: athrow
		// @842: return
	}
	
	static final void func_101490_a(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13)
	{
		// @000: iload_0
		// @001: iconst_4
		// @002: ishl
		// @003: iload #13
		// @005: isub
		// @006: istore #14
		// @008: iload #11
		// @00A: istore #15
		// @00C: iload_1
		// @00D: istore #16
		// @00F: iload_2
		// @010: istore #17
		// @012: iload #8
		// @014: istore #18
		// @016: iload #18
		// @018: iload #9
		// @01A: if_icmpge @10B
		// @01D: iload #16
		// @01F: iload #5
		// @021: if_icmpge @10B
		// @024: goto @028
		// @027: athrow
		// @028: iload #18
		// @02A: iconst_4
		// @02B: ishl
		// @02C: iload #12
		// @02E: isub
		// @02F: istore #19
		// @031: iload #16
		// @033: iload #4
		// @035: ishl
		// @036: iload #6
		// @038: idiv
		// @039: istore #20
		// @03B: getstatic int[] game.C_100100_i.field_102020_Ub
		// @03E: iload #20
		// @040: iaload
		// @041: iload #10
		// @043: imul
		// @044: bipush 15 (0x0F)
		// @046: ishr
		// @047: istore #21
		// @049: iload #18
		// @04B: iload #19
		// @04D: iload #21
		// @04F: imul
		// @050: ldc 131072 (0x20000)
		// @052: iadd
		// @053: bipush 18 (0x12)
		// @055: ishr
		// @056: iadd
		// @057: istore #22
		// @059: iload #22
		// @05B: sipush 639 (0x027F)
		// @05E: if_icmple @066
		// @061: sipush 639 (0x027F)
		// @064: istore #22
		// @066: iload_0
		// @067: iload #14
		// @069: iload #21
		// @06B: imul
		// @06C: ldc 131072 (0x20000)
		// @06E: iadd
		// @06F: bipush 18 (0x12)
		// @071: ishr
		// @072: iadd
		// @073: istore #23
		// @075: iload #23
		// @077: ifge @07D
		// @07A: iconst_0
		// @07B: istore #23
		// @07D: getstatic int[] game.C_100196_rb.field_105818_d
		// @080: iload #23
		// @082: sipush 640 (0x0280)
		// @085: imul
		// @086: iload #22
		// @088: iadd
		// @089: iaload
		// @08A: istore #24
		// @08C: bipush 64 (0x40)
		// @08E: getstatic int[] game.C_100100_i.field_102018_Wb
		// @091: iload #20
		// @093: iaload
		// @094: iload #10
		// @096: imul
		// @097: bipush 17 (0x11)
		// @099: ishr
		// @09A: iadd
		// @09B: istore #25
		// @09D: iload #25
		// @09F: ifge @0A7
		// @0A2: iload #25
		// @0A4: ineg
		// @0A5: istore #25
		// @0A7: iload #24
		// @0A9: ldc 16711935 (0xff00ff)
		// @0AB: iand
		// @0AC: iload #25
		// @0AE: imul
		// @0AF: istore #26
		// @0B1: iload #24
		// @0B3: ldc 65280 (0xff00)
		// @0B5: iand
		// @0B6: iload #25
		// @0B8: imul
		// @0B9: istore #25
		// @0BB: iload #26
		// @0BD: ldc 1069563840 (0x3fc03fc0)
		// @0BF: iand
		// @0C0: iload #25
		// @0C2: ldc 4177920 (0x3fc000)
		// @0C4: iand
		// @0C5: iadd
		// @0C6: istore #24
		// @0C8: iload #26
		// @0CA: ldc -1073692672 (0xc000c000)
		// @0CC: iand
		// @0CD: iload #25
		// @0CF: ldc 12582912 (0xc00000)
		// @0D1: iand
		// @0D2: iadd
		// @0D3: istore #26
		// @0D5: iload #26
		// @0D7: iload #26
		// @0D9: iconst_1
		// @0DA: iushr
		// @0DB: ior
		// @0DC: ldc 1077952512 (0x40404000)
		// @0DE: iand
		// @0DF: istore #26
		// @0E1: getstatic int[] game.C_100196_rb.field_105818_d
		// @0E4: iload #15
		// @0E6: iinc #15 +1
		// @0E9: iload #24
		// @0EB: iload #26
		// @0ED: iload #26
		// @0EF: bipush 8 (0x08)
		// @0F1: iushr
		// @0F2: isub
		// @0F3: ior
		// @0F4: bipush 6 (0x06)
		// @0F6: iushr
		// @0F7: iastore
		// @0F8: iload #16
		// @0FA: iload #17
		// @0FC: iadd
		// @0FD: istore #16
		// @0FF: iload #17
		// @101: iload_3
		// @102: iadd
		// @103: istore #17
		// @105: iinc #18 +1
		// @108: goto @016
		// @10B: iload #11
		// @10D: istore #15
		// @10F: iload_1
		// @110: istore #16
		// @112: iload_2
		// @113: istore #17
		// @115: iload #8
		// @117: iconst_1
		// @118: isub
		// @119: istore #18
		// @11B: iload #18
		// @11D: iload #7
		// @11F: if_icmplt @20B
		// @122: iload #17
		// @124: iload_3
		// @125: isub
		// @126: istore #17
		// @128: iload #16
		// @12A: iload #17
		// @12C: isub
		// @12D: istore #16
		// @12F: iload #16
		// @131: iload #5
		// @133: if_icmplt @13A
		// @136: goto @20B
		// @139: athrow
		// @13A: iload #18
		// @13C: iconst_4
		// @13D: ishl
		// @13E: iload #12
		// @140: isub
		// @141: istore #19
		// @143: iload #16
		// @145: iload #4
		// @147: ishl
		// @148: iload #6
		// @14A: idiv
		// @14B: istore #20
		// @14D: getstatic int[] game.C_100100_i.field_102020_Ub
		// @150: iload #20
		// @152: iaload
		// @153: iload #10
		// @155: imul
		// @156: bipush 15 (0x0F)
		// @158: ishr
		// @159: istore #21
		// @15B: iload #18
		// @15D: iload #19
		// @15F: iload #21
		// @161: imul
		// @162: ldc 131072 (0x20000)
		// @164: iadd
		// @165: bipush 18 (0x12)
		// @167: ishr
		// @168: iadd
		// @169: istore #22
		// @16B: iload #22
		// @16D: ifge @173
		// @170: iconst_0
		// @171: istore #22
		// @173: iload_0
		// @174: iload #14
		// @176: iload #21
		// @178: imul
		// @179: ldc 131072 (0x20000)
		// @17B: iadd
		// @17C: bipush 18 (0x12)
		// @17E: ishr
		// @17F: iadd
		// @180: istore #23
		// @182: iload #23
		// @184: ifge @18A
		// @187: iconst_0
		// @188: istore #23
		// @18A: getstatic int[] game.C_100196_rb.field_105818_d
		// @18D: iload #23
		// @18F: sipush 640 (0x0280)
		// @192: imul
		// @193: iload #22
		// @195: iadd
		// @196: iaload
		// @197: istore #24
		// @199: bipush 64 (0x40)
		// @19B: getstatic int[] game.C_100100_i.field_102018_Wb
		// @19E: iload #20
		// @1A0: iaload
		// @1A1: iload #10
		// @1A3: imul
		// @1A4: bipush 17 (0x11)
		// @1A6: ishr
		// @1A7: iadd
		// @1A8: istore #25
		// @1AA: iload #25
		// @1AC: ifge @1B4
		// @1AF: iload #25
		// @1B1: ineg
		// @1B2: istore #25
		// @1B4: iload #24
		// @1B6: ldc 16711935 (0xff00ff)
		// @1B8: iand
		// @1B9: iload #25
		// @1BB: imul
		// @1BC: istore #26
		// @1BE: iload #24
		// @1C0: ldc 65280 (0xff00)
		// @1C2: iand
		// @1C3: iload #25
		// @1C5: imul
		// @1C6: istore #25
		// @1C8: iload #26
		// @1CA: ldc 1069563840 (0x3fc03fc0)
		// @1CC: iand
		// @1CD: iload #25
		// @1CF: ldc 4177920 (0x3fc000)
		// @1D1: iand
		// @1D2: iadd
		// @1D3: istore #24
		// @1D5: iload #26
		// @1D7: ldc -1073692672 (0xc000c000)
		// @1D9: iand
		// @1DA: iload #25
		// @1DC: ldc 12582912 (0xc00000)
		// @1DE: iand
		// @1DF: iadd
		// @1E0: istore #26
		// @1E2: iload #26
		// @1E4: iload #26
		// @1E6: iconst_1
		// @1E7: iushr
		// @1E8: ior
		// @1E9: ldc 1077952512 (0x40404000)
		// @1EB: iand
		// @1EC: istore #26
		// @1EE: getstatic int[] game.C_100196_rb.field_105818_d
		// @1F1: iinc #15 +255
		// @1F4: iload #15
		// @1F6: iload #24
		// @1F8: iload #26
		// @1FA: iload #26
		// @1FC: bipush 8 (0x08)
		// @1FE: iushr
		// @1FF: isub
		// @200: ior
		// @201: bipush 6 (0x06)
		// @203: iushr
		// @204: iastore
		// @205: iinc #18 +255
		// @208: goto @11B
		// @20B: return
	}
	
	static final String func_101497_a(String arg0, String arg1, int arg2, String arg3)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #12
		// @005: aload_1
		// @006: invokevirtual java.lang.String.length()int
		// @009: istore #4
		// @00B: aload_3
		// @00C: invokevirtual java.lang.String.length()int
		// @00F: istore #5
		// @011: aload_0
		// @012: invokevirtual java.lang.String.length()int
		// @015: istore #6
		// @017: iconst_m1
		// @018: iload #5
		// @01A: iconst_m1
		// @01B: ixor
		// @01C: if_icmpeq @023
		// @01F: goto @031
		// @022: athrow
		// @023: new java.lang.IllegalArgumentException
		// @026: dup
		// @027: getstatic java.lang.String[] game.C_100018_wk.field_101532_ib
		// @02A: bipush 12 (0x0C)
		// @02C: aaload
		// @02D: invokespecial java.lang.IllegalArgumentException.<init>(java.lang.String)void
		// @030: athrow
		// @031: iload #4
		// @033: istore #7
		// @035: iload #5
		// @037: ineg
		// @038: iload #6
		// @03A: iadd
		// @03B: istore #8
		// @03D: iconst_m1
		// @03E: iload #8
		// @040: iconst_m1
		// @041: ixor
		// @042: if_icmpeq @06C
		// @045: iconst_0
		// @046: istore #9
		// @048: aload_1
		// @049: aload_3
		// @04A: iload #9
		// @04C: invokevirtual java.lang.String.indexOf(java.lang.String, int)int
		// @04F: istore #9
		// @051: iconst_m1
		// @052: iload #9
		// @054: iconst_m1
		// @055: ixor
		// @056: if_icmplt @06C
		// @059: iload #7
		// @05B: iload #8
		// @05D: iadd
		// @05E: istore #7
		// @060: iload #9
		// @062: iload #5
		// @064: iadd
		// @065: istore #9
		// @067: iload #12
		// @069: ifeq @048
		// @06C: new java.lang.StringBuilder
		// @06F: dup
		// @070: iload #7
		// @072: invokespecial java.lang.StringBuilder.<init>(int)void
		// @075: astore #9
		// @077: iconst_0
		// @078: istore #10
		// @07A: aload_1
		// @07B: aload_3
		// @07C: iload #10
		// @07E: invokevirtual java.lang.String.indexOf(java.lang.String, int)int
		// @081: istore #11
		// @083: iconst_0
		// @084: iload #11
		// @086: if_icmpgt @0B3
		// @089: aload #9
		// @08B: aload_1
		// @08C: iload #10
		// @08E: iload #11
		// @090: invokevirtual java.lang.String.substring(int, int)java.lang.String
		// @093: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @096: pop
		// @097: iload #5
		// @099: iload #11
		// @09B: iadd
		// @09C: istore #10
		// @09E: aload #9
		// @0A0: aload_0
		// @0A1: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0A4: pop
		// @0A5: iload #12
		// @0A7: ifne @0E9
		// @0AA: iload #12
		// @0AC: ifeq @07A
		// @0AF: goto @0B3
		// @0B2: athrow
		// @0B3: iload_2
		// @0B4: sipush 25557 (0x63D5)
		// @0B7: if_icmpeq @0DD
		// @0BA: bipush 105 (0x69)
		// @0BC: bipush 126 (0x7E)
		// @0BE: bipush 11 (0x0B)
		// @0C0: bipush 33 (0x21)
		// @0C2: bipush 74 (0x4A)
		// @0C4: bipush 11 (0x0B)
		// @0C6: bipush -47 (0xD1)
		// @0C8: bipush -8 (0xF8)
		// @0CA: bipush 9 (0x09)
		// @0CC: bipush 101 (0x65)
		// @0CE: bipush -14 (0xF2)
		// @0D0: bipush -118 (0x8A)
		// @0D2: bipush 54 (0x36)
		// @0D4: bipush -122 (0x86)
		// @0D6: invokestatic game.C_100018_wk.func_101490_a(int, int, int, int, int, int, int, int, int, int, int, int, int, int)void
		// @0D9: goto @0DD
		// @0DC: athrow
		// @0DD: aload #9
		// @0DF: aload_1
		// @0E0: iload #10
		// @0E2: invokevirtual java.lang.String.substring(int)java.lang.String
		// @0E5: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0E8: pop
		// @0E9: aload #9
		// @0EB: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @0EE: areturn
		// @0EF: astore #4
		// @0F1: aload #4
		// @0F3: new java.lang.StringBuilder
		// @0F6: dup
		// @0F7: invokespecial java.lang.StringBuilder.<init>()void
		// @0FA: getstatic java.lang.String[] game.C_100018_wk.field_101532_ib
		// @0FD: bipush 13 (0x0D)
		// @0FF: aaload
		// @100: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @103: aload_0
		// @104: ifnull @110
		// @107: getstatic java.lang.String[] game.C_100018_wk.field_101532_ib
		// @10A: iconst_4
		// @10B: aaload
		// @10C: goto @115
		// @10F: athrow
		// @110: getstatic java.lang.String[] game.C_100018_wk.field_101532_ib
		// @113: iconst_2
		// @114: aaload
		// @115: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @118: bipush 44 (0x2C)
		// @11A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @11D: aload_1
		// @11E: ifnull @12A
		// @121: getstatic java.lang.String[] game.C_100018_wk.field_101532_ib
		// @124: iconst_4
		// @125: aaload
		// @126: goto @12F
		// @129: athrow
		// @12A: getstatic java.lang.String[] game.C_100018_wk.field_101532_ib
		// @12D: iconst_2
		// @12E: aaload
		// @12F: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @132: bipush 44 (0x2C)
		// @134: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @137: iload_2
		// @138: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @13B: bipush 44 (0x2C)
		// @13D: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @140: aload_3
		// @141: ifnull @14D
		// @144: getstatic java.lang.String[] game.C_100018_wk.field_101532_ib
		// @147: iconst_4
		// @148: aaload
		// @149: goto @152
		// @14C: athrow
		// @14D: getstatic java.lang.String[] game.C_100018_wk.field_101532_ib
		// @150: iconst_2
		// @151: aaload
		// @152: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @155: bipush 41 (0x29)
		// @157: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @15A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @15D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @160: athrow
	}
	
	static final void func_101502_a(int arg0, byte arg1, int arg2, String arg3, long arg4)
	{
		// @00: iload_2
		// @01: putstatic int game.C_100291_jj.field_106876_b
		// @04: iconst_1
		// @05: putstatic boolean game.C_100211_qd.field_102158_yc
		// @08: lload #4
		// @0A: putstatic long game.C_100217_ao.field_106035_d
		// @0D: aload_3
		// @0E: putstatic java.lang.String game.C_100253_ph.field_101100_C
		// @11: iload_0
		// @12: putstatic int game.C_100333_ij.field_107350_n
		// @15: iload_1
		// @16: bipush -53 (0xCB)
		// @18: if_icmpeq @22
		// @1B: aconst_null
		// @1C: checkcast game.C_100037_wb
		// @1F: putstatic game.C_100037_wb game.C_100018_wk.field_101550_s
		// @22: goto @7E
		// @25: astore #6
		// @27: aload #6
		// @29: new java.lang.StringBuilder
		// @2C: dup
		// @2D: invokespecial java.lang.StringBuilder.<init>()void
		// @30: getstatic java.lang.String[] game.C_100018_wk.field_101532_ib
		// @33: iconst_3
		// @34: aaload
		// @35: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @38: iload_0
		// @39: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3C: bipush 44 (0x2C)
		// @3E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @41: iload_1
		// @42: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @45: bipush 44 (0x2C)
		// @47: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4A: iload_2
		// @4B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4E: bipush 44 (0x2C)
		// @50: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @53: aload_3
		// @54: ifnull @60
		// @57: getstatic java.lang.String[] game.C_100018_wk.field_101532_ib
		// @5A: iconst_4
		// @5B: aaload
		// @5C: goto @65
		// @5F: athrow
		// @60: getstatic java.lang.String[] game.C_100018_wk.field_101532_ib
		// @63: iconst_2
		// @64: aaload
		// @65: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @68: bipush 44 (0x2C)
		// @6A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @6D: lload #4
		// @6F: invokevirtual java.lang.StringBuilder.append(long)java.lang.StringBuilder
		// @72: bipush 41 (0x29)
		// @74: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @77: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @7A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @7D: athrow
		// @7E: return
	}
	
	private final boolean func_101494_d(int arg0, int arg1)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #4
		// @005: aload_0
		// @006: bipush 32 (0x20)
		// @008: putfield int game.C_100018_wk.field_101515_cb
		// @00B: aload_0
		// @00C: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @00F: getfield boolean game.C_100294_ki.field_106969_V
		// @012: ifne @058
		// @015: aload_0
		// @016: getfield boolean game.C_100018_wk.field_101513_E
		// @019: ifne @058
		// @01C: goto @020
		// @01F: athrow
		// @020: aload_0
		// @021: getfield int game.C_100018_wk.field_101514_F
		// @024: aload_0
		// @025: getfield int game.C_100018_wk.field_101519_C
		// @028: ineg
		// @029: iconst_2
		// @02A: idiv
		// @02B: aload_0
		// @02C: getfield boolean game.C_100018_wk.field_101534_V
		// @02F: aload_0
		// @030: getfield int game.C_100018_wk.field_101545_fb
		// @033: aload_0
		// @034: getfield int game.C_100018_wk.field_101527_J
		// @037: ineg
		// @038: iconst_2
		// @039: idiv
		// @03A: aload_0
		// @03B: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @03E: bipush -124 (0x84)
		// @040: aload_0
		// @041: getfield int game.C_100018_wk.field_101514_F
		// @044: iconst_2
		// @045: bipush 10 (0x0A)
		// @047: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @04A: astore_3
		// @04B: aload_0
		// @04C: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @04F: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @052: bipush 126 (0x7E)
		// @054: aload_3
		// @055: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @058: aload_0
		// @059: getfield int game.C_100018_wk.field_101524_H
		// @05C: iconst_m1
		// @05D: ixor
		// @05E: bipush -51 (0xCD)
		// @060: if_icmpgt @067
		// @063: goto @072
		// @066: athrow
		// @067: aload_0
		// @068: dup
		// @069: getfield int game.C_100018_wk.field_101524_H
		// @06C: bipush 6 (0x06)
		// @06E: imul
		// @06F: putfield int game.C_100018_wk.field_101524_H
		// @072: aload_0
		// @073: dup
		// @074: getfield int game.C_100018_wk.field_101516_G
		// @077: iconst_1
		// @078: iadd
		// @079: putfield int game.C_100018_wk.field_101516_G
		// @07C: aload_0
		// @07D: getfield int game.C_100018_wk.field_101516_G
		// @080: aload_0
		// @081: getfield int game.C_100018_wk.field_101524_H
		// @084: if_icmpgt @092
		// @087: aload_0
		// @088: getfield boolean game.C_100018_wk.field_101518_B
		// @08B: ifeq @100
		// @08E: goto @092
		// @091: athrow
		// @092: iconst_m1
		// @093: aload_0
		// @094: getfield int game.C_100018_wk.field_101541_X
		// @097: iconst_m1
		// @098: ixor
		// @099: if_icmpne @0B6
		// @09C: goto @0A0
		// @09F: athrow
		// @0A0: aload_0
		// @0A1: sipush 500 (0x01F4)
		// @0A4: bipush 100 (0x64)
		// @0A6: iconst_2
		// @0A7: iconst_2
		// @0A8: bipush -3 (0xFD)
		// @0AA: invokevirtual game.C_100018_wk.func_101510_a(int, int, int, int, int)void
		// @0AD: iload #4
		// @0AF: ifeq @0D8
		// @0B2: goto @0B6
		// @0B5: athrow
		// @0B6: bipush -12 (0xF4)
		// @0B8: aload_0
		// @0B9: getfield int game.C_100018_wk.field_101541_X
		// @0BC: iconst_m1
		// @0BD: ixor
		// @0BE: if_icmpne @0D8
		// @0C1: goto @0C5
		// @0C4: athrow
		// @0C5: aload_0
		// @0C6: sipush 750 (0x02EE)
		// @0C9: sipush 500 (0x01F4)
		// @0CC: iconst_2
		// @0CD: bipush 10 (0x0A)
		// @0CF: bipush -3 (0xFD)
		// @0D1: invokevirtual game.C_100018_wk.func_101510_a(int, int, int, int, int)void
		// @0D4: goto @0D8
		// @0D7: athrow
		// @0D8: aload_0
		// @0D9: getfield boolean game.C_100018_wk.field_101547_v
		// @0DC: ifne @0F5
		// @0DF: aload_0
		// @0E0: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0E3: getfield game.C_100300_kc game.C_100294_ki.field_106950_D
		// @0E6: bipush 124 (0x7C)
		// @0E8: aload_0
		// @0E9: invokevirtual game.C_100300_kc.func_107058_a(int, game.C_100325_id)void
		// @0EC: iload #4
		// @0EE: ifeq @0FE
		// @0F1: goto @0F5
		// @0F4: athrow
		// @0F5: aload_0
		// @0F6: iconst_1
		// @0F7: putfield boolean game.C_100018_wk.field_101523_O
		// @0FA: goto @0FE
		// @0FD: athrow
		// @0FE: iconst_1
		// @0FF: ireturn
		// @100: iload_2
		// @101: bipush -28 (0xE4)
		// @103: if_icmple @113
		// @106: aload_0
		// @107: bipush -68 (0xBC)
		// @109: bipush 54 (0x36)
		// @10B: invokespecial game.C_100018_wk.func_101501_a(int, int)boolean
		// @10E: pop
		// @10F: goto @113
		// @112: athrow
		// @113: iconst_0
		// @114: ireturn
		// @115: astore_3
		// @116: aload_3
		// @117: new java.lang.StringBuilder
		// @11A: dup
		// @11B: invokespecial java.lang.StringBuilder.<init>()void
		// @11E: getstatic java.lang.String[] game.C_100018_wk.field_101532_ib
		// @121: iconst_0
		// @122: aaload
		// @123: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @126: iload_1
		// @127: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @12A: bipush 44 (0x2C)
		// @12C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @12F: iload_2
		// @130: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @133: bipush 41 (0x29)
		// @135: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @138: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @13B: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @13E: athrow
	}
	
	final void func_101507_i(int arg0)
	{
		// @0000: getstatic int game.SteelSentinels.field_105275_O
		// @0003: istore #9
		// @0005: aload_0
		// @0006: iconst_1
		// @0007: putfield boolean game.C_100018_wk.field_101544_hb
		// @000A: aload_0
		// @000B: aload_0
		// @000C: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @000F: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @0012: sipush -25357 (0x9CF3)
		// @0015: aload_0
		// @0016: getfield int game.C_100018_wk.field_101514_F
		// @0019: ldc -125749212 (0xf8813824)
		// @001B: ishr
		// @001C: invokevirtual game.C_100171_cn.func_105555_b(int, int)int
		// @001F: iconst_m1
		// @0020: ixor
		// @0021: aload_0
		// @0022: getfield int game.C_100018_wk.field_101545_fb
		// @0025: ldc 837893572 (0x31f13dc4)
		// @0027: ishr
		// @0028: ineg
		// @0029: iconst_m1
		// @002A: ixor
		// @002B: if_icmpge @0033
		// @002E: iconst_1
		// @002F: goto @0034
		// @0032: athrow
		// @0033: iconst_0
		// @0034: putfield boolean game.C_100018_wk.field_101534_V
		// @0037: bipush 19 (0x13)
		// @0039: aload_0
		// @003A: getfield int game.C_100018_wk.field_101539_Y
		// @003D: if_icmpne @01AC
		// @0040: aload_0
		// @0041: aload_0
		// @0042: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0045: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @0048: sipush -25357 (0x9CF3)
		// @004B: aload_0
		// @004C: getfield int game.C_100018_wk.field_101514_F
		// @004F: ldc -722529884 (0xd4ef11a4)
		// @0051: ishr
		// @0052: invokevirtual game.C_100171_cn.func_105555_b(int, int)int
		// @0055: ineg
		// @0056: ldc 578277252 (0x2277cf84)
		// @0058: ishl
		// @0059: putfield int game.C_100018_wk.field_101545_fb
		// @005C: aload_0
		// @005D: dup
		// @005E: getfield int game.C_100018_wk.field_101516_G
		// @0061: iconst_1
		// @0062: iadd
		// @0063: putfield int game.C_100018_wk.field_101516_G
		// @0066: sipush -251 (0xFF05)
		// @0069: aload_0
		// @006A: getfield int game.C_100018_wk.field_101516_G
		// @006D: iconst_m1
		// @006E: ixor
		// @006F: if_icmplt @007A
		// @0072: goto @0076
		// @0075: athrow
		// @0076: goto @0097
		// @0079: athrow
		// @007A: aload_0
		// @007B: dup
		// @007C: getfield int game.C_100018_wk.field_101545_fb
		// @007F: bipush 10 (0x0A)
		// @0081: sipush -250 (0xFF06)
		// @0084: aload_0
		// @0085: getfield int game.C_100018_wk.field_101516_G
		// @0088: iadd
		// @0089: sipush -250 (0xFF06)
		// @008C: aload_0
		// @008D: getfield int game.C_100018_wk.field_101516_G
		// @0090: iadd
		// @0091: imul
		// @0092: imul
		// @0093: isub
		// @0094: putfield int game.C_100018_wk.field_101545_fb
		// @0097: sipush 400 (0x0190)
		// @009A: aload_0
		// @009B: getfield int game.C_100018_wk.field_101516_G
		// @009E: if_icmpgt @00F0
		// @00A1: sipush -451 (0xFE3D)
		// @00A4: aload_0
		// @00A5: getfield int game.C_100018_wk.field_101516_G
		// @00A8: iconst_m1
		// @00A9: ixor
		// @00AA: if_icmplt @00B5
		// @00AD: goto @00B1
		// @00B0: athrow
		// @00B1: goto @00F0
		// @00B4: athrow
		// @00B5: ldc 900000 (0xdbba0)
		// @00B7: aload_0
		// @00B8: getfield int game.C_100018_wk.field_101516_G
		// @00BB: sipush 2000 (0x07D0)
		// @00BE: imul
		// @00BF: ineg
		// @00C0: iadd
		// @00C1: istore_2
		// @00C2: aload_0
		// @00C3: dup
		// @00C4: getfield int game.C_100018_wk.field_101545_fb
		// @00C7: iload_2
		// @00C8: isub
		// @00C9: putfield int game.C_100018_wk.field_101545_fb
		// @00CC: sipush -10000 (0xD8F0)
		// @00CF: aload_0
		// @00D0: getfield int game.C_100018_wk.field_101516_G
		// @00D3: bipush 25 (0x19)
		// @00D5: imul
		// @00D6: iadd
		// @00D7: istore_3
		// @00D8: aload_0
		// @00D9: iload_3
		// @00DA: bipush 50 (0x32)
		// @00DC: iadd
		// @00DD: bipush 10 (0x0A)
		// @00DF: iconst_3
		// @00E0: iconst_5
		// @00E1: bipush -3 (0xFD)
		// @00E3: invokevirtual game.C_100018_wk.func_101510_a(int, int, int, int, int)void
		// @00E6: aload_0
		// @00E7: dup
		// @00E8: getfield int game.C_100018_wk.field_101545_fb
		// @00EB: iload_2
		// @00EC: iadd
		// @00ED: putfield int game.C_100018_wk.field_101545_fb
		// @00F0: aload_0
		// @00F1: getfield int game.C_100018_wk.field_101516_G
		// @00F4: iconst_m1
		// @00F5: ixor
		// @00F6: sipush -451 (0xFE3D)
		// @00F9: if_icmpne @010D
		// @00FC: aload_0
		// @00FD: sipush 4000 (0x0FA0)
		// @0100: bipush 50 (0x32)
		// @0102: iconst_3
		// @0103: iconst_0
		// @0104: iconst_0
		// @0105: iconst_0
		// @0106: invokespecial game.C_100018_wk.func_101505_a(int, int, int, int, boolean, boolean)void
		// @0109: goto @010D
		// @010C: athrow
		// @010D: aload_0
		// @010E: getfield int game.C_100018_wk.field_101516_G
		// @0111: sipush 450 (0x01C2)
		// @0114: if_icmple @0196
		// @0117: iconst_m1
		// @0118: aload_0
		// @0119: getfield int game.C_100018_wk.field_101516_G
		// @011C: iconst_1
		// @011D: iand
		// @011E: iconst_2
		// @011F: imul
		// @0120: iadd
		// @0121: istore_2
		// @0122: aload_0
		// @0123: getfield int game.C_100018_wk.field_101516_G
		// @0126: sipush 450 (0x01C2)
		// @0129: isub
		// @012A: iload_2
		// @012B: imul
		// @012C: sipush 750 (0x02EE)
		// @012F: imul
		// @0130: istore_3
		// @0131: aload_0
		// @0132: dup
		// @0133: getfield int game.C_100018_wk.field_101514_F
		// @0136: iload_3
		// @0137: iadd
		// @0138: putfield int game.C_100018_wk.field_101514_F
		// @013B: aload_0
		// @013C: aload_0
		// @013D: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0140: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @0143: sipush -25357 (0x9CF3)
		// @0146: aload_0
		// @0147: getfield int game.C_100018_wk.field_101514_F
		// @014A: ldc 1857203844 (0x6eb2ae84)
		// @014C: ishr
		// @014D: invokevirtual game.C_100171_cn.func_105555_b(int, int)int
		// @0150: ineg
		// @0151: ldc -1669605692 (0x9c7bd6c4)
		// @0153: ishl
		// @0154: putfield int game.C_100018_wk.field_101545_fb
		// @0157: aload_0
		// @0158: sipush 256 (0x0100)
		// @015B: aload_0
		// @015C: getfield int game.C_100018_wk.field_101516_G
		// @015F: iconst_5
		// @0160: imul
		// @0161: sipush 2250 (0x08CA)
		// @0164: isub
		// @0165: bipush 50 (0x32)
		// @0167: iadd
		// @0168: iconst_4
		// @0169: bipush 100 (0x64)
		// @016B: bipush -3 (0xFD)
		// @016D: invokevirtual game.C_100018_wk.func_101510_a(int, int, int, int, int)void
		// @0170: aload_0
		// @0171: aload_0
		// @0172: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0175: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @0178: sipush -25357 (0x9CF3)
		// @017B: aload_0
		// @017C: getfield int game.C_100018_wk.field_101514_F
		// @017F: ldc -1332956444 (0xb08cb2e4)
		// @0181: ishr
		// @0182: invokevirtual game.C_100171_cn.func_105555_b(int, int)int
		// @0185: ineg
		// @0186: ldc -1026474844 (0xc2d13ca4)
		// @0188: ishl
		// @0189: putfield int game.C_100018_wk.field_101545_fb
		// @018C: aload_0
		// @018D: dup
		// @018E: getfield int game.C_100018_wk.field_101514_F
		// @0191: iload_3
		// @0192: isub
		// @0193: putfield int game.C_100018_wk.field_101514_F
		// @0196: sipush -501 (0xFE0B)
		// @0199: aload_0
		// @019A: getfield int game.C_100018_wk.field_101516_G
		// @019D: iconst_m1
		// @019E: ixor
		// @019F: if_icmpge @01A6
		// @01A2: goto @01AB
		// @01A5: athrow
		// @01A6: aload_0
		// @01A7: iconst_0
		// @01A8: putfield int game.C_100018_wk.field_101516_G
		// @01AB: return
		// @01AC: bipush 12 (0x0C)
		// @01AE: aload_0
		// @01AF: getfield int game.C_100018_wk.field_101539_Y
		// @01B2: if_icmpgt @086A
		// @01B5: aload_0
		// @01B6: getfield int game.C_100018_wk.field_101539_Y
		// @01B9: bipush 16 (0x10)
		// @01BB: if_icmpgt @086A
		// @01BE: goto @01C2
		// @01C1: athrow
		// @01C2: aload_0
		// @01C3: getfield int game.C_100018_wk.field_101516_G
		// @01C6: ifne @01D9
		// @01C9: goto @01CD
		// @01CC: athrow
		// @01CD: iconst_m1
		// @01CE: bipush 81 (0x51)
		// @01D0: iconst_1
		// @01D1: invokestatic game.C_100143_bl.func_105098_a(int, int, boolean)game.C_100179_ch
		// @01D4: pop
		// @01D5: goto @01D9
		// @01D8: athrow
		// @01D9: iconst_m1
		// @01DA: bipush 61 (0x3D)
		// @01DC: aload_0
		// @01DD: getfield int game.C_100018_wk.field_101516_G
		// @01E0: iand
		// @01E1: iconst_m1
		// @01E2: ixor
		// @01E3: if_icmpne @01F4
		// @01E6: aload_0
		// @01E7: getfield int game.C_100018_wk.field_101514_F
		// @01EA: iconst_2
		// @01EB: iconst_1
		// @01EC: invokestatic game.C_100143_bl.func_105098_a(int, int, boolean)game.C_100179_ch
		// @01EF: pop
		// @01F0: goto @01F4
		// @01F3: athrow
		// @01F4: aload_0
		// @01F5: dup
		// @01F6: getfield int game.C_100018_wk.field_101516_G
		// @01F9: iconst_1
		// @01FA: iadd
		// @01FB: putfield int game.C_100018_wk.field_101516_G
		// @01FE: sipush 5100 (0x13EC)
		// @0201: istore_2
		// @0202: iconst_1
		// @0203: aload_0
		// @0204: getfield int game.C_100018_wk.field_101519_C
		// @0207: if_icmpeq @023C
		// @020A: aload_0
		// @020B: iload_2
		// @020C: ineg
		// @020D: aload_0
		// @020E: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0211: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @0214: sipush 23156 (0x5A74)
		// @0217: invokevirtual game.C_100171_cn.func_105552_b(int)int
		// @021A: iconst_2
		// @021B: iload_2
		// @021C: imul
		// @021D: ineg
		// @021E: isub
		// @021F: sipush 500 (0x01F4)
		// @0222: aload_0
		// @0223: getfield int game.C_100018_wk.field_101516_G
		// @0226: isub
		// @0227: imul
		// @0228: sipush 500 (0x01F4)
		// @022B: idiv
		// @022C: iadd
		// @022D: ldc -922975612 (0xc8fc8284)
		// @022F: ishl
		// @0230: putfield int game.C_100018_wk.field_101514_F
		// @0233: iload #9
		// @0235: ifeq @0265
		// @0238: goto @023C
		// @023B: athrow
		// @023C: aload_0
		// @023D: iload_2
		// @023E: ineg
		// @023F: aload_0
		// @0240: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0243: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @0246: sipush 23156 (0x5A74)
		// @0249: invokevirtual game.C_100171_cn.func_105552_b(int)int
		// @024C: iload_2
		// @024D: iconst_2
		// @024E: imul
		// @024F: ineg
		// @0250: isub
		// @0251: aload_0
		// @0252: getfield int game.C_100018_wk.field_101516_G
		// @0255: imul
		// @0256: sipush 500 (0x01F4)
		// @0259: idiv
		// @025A: iadd
		// @025B: ldc 127552740 (0x79a4ce4)
		// @025D: ishl
		// @025E: putfield int game.C_100018_wk.field_101514_F
		// @0261: goto @0265
		// @0264: athrow
		// @0265: aload_0
		// @0266: ldc -150000 (0xfffdb610)
		// @0268: sipush 30000 (0x7530)
		// @026B: sipush -250 (0xFF06)
		// @026E: aload_0
		// @026F: getfield int game.C_100018_wk.field_101516_G
		// @0272: iadd
		// @0273: invokestatic java.lang.Math.abs(int)int
		// @0276: imul
		// @0277: sipush 250 (0x00FA)
		// @027A: idiv
		// @027B: isub
		// @027C: putfield int game.C_100018_wk.field_101545_fb
		// @027F: bipush -14 (0xF2)
		// @0281: aload_0
		// @0282: getfield int game.C_100018_wk.field_101539_Y
		// @0285: iconst_m1
		// @0286: ixor
		// @0287: if_icmpeq @029B
		// @028A: aload_0
		// @028B: getfield int game.C_100018_wk.field_101539_Y
		// @028E: bipush 15 (0x0F)
		// @0290: if_icmpeq @029B
		// @0293: goto @0297
		// @0296: athrow
		// @0297: goto @02B8
		// @029A: athrow
		// @029B: aload_0
		// @029C: dup
		// @029D: getfield int game.C_100018_wk.field_101516_G
		// @02A0: iconst_1
		// @02A1: iadd
		// @02A2: putfield int game.C_100018_wk.field_101516_G
		// @02A5: aload_0
		// @02A6: ldc -100000 (0xfffe7960)
		// @02A8: sipush 30000 (0x7530)
		// @02AB: aload_0
		// @02AC: getfield int game.C_100018_wk.field_101516_G
		// @02AF: imul
		// @02B0: sipush 500 (0x01F4)
		// @02B3: idiv
		// @02B4: isub
		// @02B5: putfield int game.C_100018_wk.field_101545_fb
		// @02B8: bipush 16 (0x10)
		// @02BA: aload_0
		// @02BB: getfield int game.C_100018_wk.field_101539_Y
		// @02BE: if_icmpeq @02C5
		// @02C1: goto @044F
		// @02C4: athrow
		// @02C5: aload_0
		// @02C6: aload_0
		// @02C7: getfield int game.C_100018_wk.field_101516_G
		// @02CA: aload_0
		// @02CB: getfield int game.C_100018_wk.field_101516_G
		// @02CE: sipush 1800 (0x0708)
		// @02D1: imul
		// @02D2: imul
		// @02D3: ldc 250000 (0x3d090)
		// @02D5: idiv
		// @02D6: sipush 400 (0x0190)
		// @02D9: imul
		// @02DA: ldc -180000 (0xfffd40e0)
		// @02DC: iadd
		// @02DD: putfield int game.C_100018_wk.field_101545_fb
		// @02E0: sipush -181 (0xFF4B)
		// @02E3: aload_0
		// @02E4: getfield int game.C_100018_wk.field_101516_G
		// @02E7: iconst_m1
		// @02E8: ixor
		// @02E9: if_icmpne @030A
		// @02EC: aload_0
		// @02ED: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @02F0: iconst_1
		// @02F1: putfield int game.C_100294_ki.field_106961_H
		// @02F4: aload_0
		// @02F5: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @02F8: sipush 1550 (0x060E)
		// @02FB: putfield int game.C_100294_ki.field_106972_S
		// @02FE: iconst_m1
		// @02FF: bipush 60 (0x3C)
		// @0301: iconst_1
		// @0302: invokestatic game.C_100143_bl.func_105098_a(int, int, boolean)game.C_100179_ch
		// @0305: pop
		// @0306: goto @030A
		// @0309: athrow
		// @030A: sipush -251 (0xFF05)
		// @030D: aload_0
		// @030E: getfield int game.C_100018_wk.field_101516_G
		// @0311: iconst_m1
		// @0312: ixor
		// @0313: if_icmple @0395
		// @0316: aload_0
		// @0317: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @031A: getfield game.C_100300_kc game.C_100294_ki.field_106950_D
		// @031D: bipush 125 (0x7D)
		// @031F: aload_0
		// @0320: invokevirtual game.C_100300_kc.func_107058_a(int, game.C_100325_id)void
		// @0323: aload_0
		// @0324: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0327: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @032A: bipush 59 (0x3B)
		// @032C: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @032F: checkcast game.C_100314_lf
		// @0332: astore_3
		// @0333: aconst_null
		// @0334: aload_3
		// @0335: if_acmpeq @0390
		// @0338: iconst_m1
		// @0339: aload_3
		// @033A: getfield int game.C_100314_lf.field_101356_w
		// @033D: iconst_m1
		// @033E: ixor
		// @033F: iload #9
		// @0341: ifne @059C
		// @0344: if_icmple @037B
		// @0347: goto @034B
		// @034A: athrow
		// @034B: aload_3
		// @034C: aload_3
		// @034D: getfield int game.C_100314_lf.field_101377_tc
		// @0350: aload_0
		// @0351: getfield int game.C_100018_wk.field_101514_F
		// @0354: if_icmpgt @0362
		// @0357: goto @035B
		// @035A: athrow
		// @035B: sipush -3000 (0xF448)
		// @035E: goto @0365
		// @0361: athrow
		// @0362: sipush 3000 (0x0BB8)
		// @0365: putfield int game.C_100314_lf.field_101344_Y
		// @0368: aload_3
		// @0369: sipush -3000 (0xF448)
		// @036C: putfield int game.C_100314_lf.field_101294_gc
		// @036F: aload_3
		// @0370: sipush -21013 (0xADEB)
		// @0373: invokevirtual game.C_100314_lf.func_101258_k(int)void
		// @0376: aload_3
		// @0377: iconst_0
		// @0378: putfield boolean game.C_100314_lf.field_101403_Rb
		// @037B: aload_0
		// @037C: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @037F: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @0382: bipush 115 (0x73)
		// @0384: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @0387: checkcast game.C_100314_lf
		// @038A: astore_3
		// @038B: iload #9
		// @038D: ifeq @0333
		// @0390: iload #9
		// @0392: ifeq @044F
		// @0395: aload_0
		// @0396: getfield int game.C_100018_wk.field_101516_G
		// @0399: sipush 250 (0x00FA)
		// @039C: if_icmpne @044F
		// @039F: goto @03A3
		// @03A2: athrow
		// @03A3: aload_0
		// @03A4: getfield int game.C_100018_wk.field_101514_F
		// @03A7: istore_3
		// @03A8: aload_0
		// @03A9: getfield int game.C_100018_wk.field_101545_fb
		// @03AC: istore #4
		// @03AE: bipush -6 (0xFA)
		// @03B0: bipush 31 (0x1F)
		// @03B2: aload_0
		// @03B3: getfield int game.C_100018_wk.field_101516_G
		// @03B6: iand
		// @03B7: iconst_m1
		// @03B8: ixor
		// @03B9: if_icmpne @03CE
		// @03BC: aload_0
		// @03BD: sipush 2000 (0x07D0)
		// @03C0: bipush 20 (0x14)
		// @03C2: iconst_0
		// @03C3: bipush 50 (0x32)
		// @03C5: bipush -3 (0xFD)
		// @03C7: invokevirtual game.C_100018_wk.func_101510_a(int, int, int, int, int)void
		// @03CA: goto @03CE
		// @03CD: athrow
		// @03CE: aload_0
		// @03CF: dup
		// @03D0: getfield int game.C_100018_wk.field_101514_F
		// @03D3: sipush 25000 (0x61A8)
		// @03D6: isub
		// @03D7: putfield int game.C_100018_wk.field_101514_F
		// @03DA: aload_0
		// @03DB: dup
		// @03DC: getfield int game.C_100018_wk.field_101545_fb
		// @03DF: sipush 10000 (0x2710)
		// @03E2: isub
		// @03E3: putfield int game.C_100018_wk.field_101545_fb
		// @03E6: bipush 31 (0x1F)
		// @03E8: aload_0
		// @03E9: getfield int game.C_100018_wk.field_101516_G
		// @03EC: iand
		// @03ED: iconst_m1
		// @03EE: ixor
		// @03EF: iconst_m1
		// @03F0: if_icmpeq @03F7
		// @03F3: goto @0405
		// @03F6: athrow
		// @03F7: aload_0
		// @03F8: sipush 2000 (0x07D0)
		// @03FB: bipush 20 (0x14)
		// @03FD: iconst_0
		// @03FE: bipush 50 (0x32)
		// @0400: bipush -3 (0xFD)
		// @0402: invokevirtual game.C_100018_wk.func_101510_a(int, int, int, int, int)void
		// @0405: aload_0
		// @0406: dup
		// @0407: getfield int game.C_100018_wk.field_101514_F
		// @040A: ldc 50000 (0xc350)
		// @040C: iadd
		// @040D: putfield int game.C_100018_wk.field_101514_F
		// @0410: aload_0
		// @0411: dup
		// @0412: getfield int game.C_100018_wk.field_101545_fb
		// @0415: sipush 30000 (0x7530)
		// @0418: iadd
		// @0419: putfield int game.C_100018_wk.field_101545_fb
		// @041C: bipush 31 (0x1F)
		// @041E: aload_0
		// @041F: getfield int game.C_100018_wk.field_101516_G
		// @0422: iand
		// @0423: iconst_m1
		// @0424: ixor
		// @0425: bipush -11 (0xF5)
		// @0427: if_icmpne @043C
		// @042A: aload_0
		// @042B: sipush 2000 (0x07D0)
		// @042E: bipush 20 (0x14)
		// @0430: iconst_0
		// @0431: bipush 50 (0x32)
		// @0433: bipush -3 (0xFD)
		// @0435: invokevirtual game.C_100018_wk.func_101510_a(int, int, int, int, int)void
		// @0438: goto @043C
		// @043B: athrow
		// @043C: aload_0
		// @043D: iload #4
		// @043F: putfield int game.C_100018_wk.field_101545_fb
		// @0442: aload_0
		// @0443: iload_3
		// @0444: putfield int game.C_100018_wk.field_101514_F
		// @0447: iconst_m1
		// @0448: bipush 104 (0x68)
		// @044A: iconst_1
		// @044B: invokestatic game.C_100143_bl.func_105098_a(int, int, boolean)game.C_100179_ch
		// @044E: pop
		// @044F: aload_0
		// @0450: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0453: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @0456: bipush 33 (0x21)
		// @0458: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @045B: checkcast game.C_100314_lf
		// @045E: astore_3
		// @045F: aload_3
		// @0460: ifnull @04E7
		// @0463: iconst_0
		// @0464: aload_3
		// @0465: getfield int game.C_100314_lf.field_101356_w
		// @0468: iload #9
		// @046A: ifne @059C
		// @046D: if_icmpge @04D2
		// @0470: goto @0474
		// @0473: athrow
		// @0474: aload_3
		// @0475: getfield boolean game.C_100314_lf.field_101403_Rb
		// @0478: ifne @04D2
		// @047B: goto @047F
		// @047E: athrow
		// @047F: aload_3
		// @0480: getfield boolean game.C_100314_lf.field_101307_pb
		// @0483: ifeq @04D2
		// @0486: goto @048A
		// @0489: athrow
		// @048A: sipush 25000 (0x61A8)
		// @048D: aload_0
		// @048E: getfield int game.C_100018_wk.field_101545_fb
		// @0491: iadd
		// @0492: iconst_m1
		// @0493: ixor
		// @0494: aload_3
		// @0495: getfield int game.C_100314_lf.field_101395_rc
		// @0498: iconst_m1
		// @0499: ixor
		// @049A: if_icmpge @04D2
		// @049D: goto @04A1
		// @04A0: athrow
		// @04A1: aload_3
		// @04A2: getfield int game.C_100314_lf.field_101377_tc
		// @04A5: aload_0
		// @04A6: getfield int game.C_100018_wk.field_101514_F
		// @04A9: isub
		// @04AA: invokestatic java.lang.Math.abs(int)int
		// @04AD: ldc 65000 (0xfde8)
		// @04AF: if_icmpge @04D2
		// @04B2: goto @04B6
		// @04B5: athrow
		// @04B6: aload_3
		// @04B7: iconst_1
		// @04B8: putfield boolean game.C_100314_lf.field_101338_S
		// @04BB: aload_3
		// @04BC: sipush -21013 (0xADEB)
		// @04BF: invokevirtual game.C_100314_lf.func_101258_k(int)void
		// @04C2: aload_3
		// @04C3: sipush 3000 (0x0BB8)
		// @04C6: aload_0
		// @04C7: getfield int game.C_100018_wk.field_101519_C
		// @04CA: imul
		// @04CB: putfield int game.C_100314_lf.field_101344_Y
		// @04CE: goto @04D2
		// @04D1: athrow
		// @04D2: aload_0
		// @04D3: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @04D6: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @04D9: bipush 127 (0x7F)
		// @04DB: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @04DE: checkcast game.C_100314_lf
		// @04E1: astore_3
		// @04E2: iload #9
		// @04E4: ifeq @045F
		// @04E7: aload_0
		// @04E8: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @04EB: getfield boolean game.C_100294_ki.field_106969_V
		// @04EE: ifne @0596
		// @04F1: aload_0
		// @04F2: getfield int game.C_100018_wk.field_101514_F
		// @04F5: iconst_0
		// @04F6: iconst_0
		// @04F7: sipush 29000 (0x7148)
		// @04FA: aload_0
		// @04FB: getfield int game.C_100018_wk.field_101545_fb
		// @04FE: iadd
		// @04FF: bipush 100 (0x64)
		// @0501: aload_0
		// @0502: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0505: bipush -124 (0x84)
		// @0507: aload_0
		// @0508: getfield int game.C_100018_wk.field_101514_F
		// @050B: sipush 9000 (0x2328)
		// @050E: aload_0
		// @050F: getfield int game.C_100018_wk.field_101519_C
		// @0512: imul
		// @0513: ineg
		// @0514: isub
		// @0515: iconst_1
		// @0516: bipush 50 (0x32)
		// @0518: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @051B: astore_3
		// @051C: aload_0
		// @051D: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0520: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @0523: bipush 125 (0x7D)
		// @0525: aload_3
		// @0526: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0529: aload_0
		// @052A: getfield int game.C_100018_wk.field_101514_F
		// @052D: iconst_0
		// @052E: iconst_0
		// @052F: sipush 32000 (0x7D00)
		// @0532: aload_0
		// @0533: getfield int game.C_100018_wk.field_101545_fb
		// @0536: iadd
		// @0537: bipush 100 (0x64)
		// @0539: aload_0
		// @053A: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @053D: bipush -124 (0x84)
		// @053F: sipush 15000 (0x3A98)
		// @0542: aload_0
		// @0543: getfield int game.C_100018_wk.field_101519_C
		// @0546: imul
		// @0547: aload_0
		// @0548: getfield int game.C_100018_wk.field_101514_F
		// @054B: iadd
		// @054C: iconst_1
		// @054D: bipush 50 (0x32)
		// @054F: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @0552: astore_3
		// @0553: aload_0
		// @0554: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0557: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @055A: bipush 123 (0x7B)
		// @055C: aload_3
		// @055D: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0560: aload_0
		// @0561: getfield int game.C_100018_wk.field_101514_F
		// @0564: iconst_0
		// @0565: iconst_0
		// @0566: ldc 35000 (0x88b8)
		// @0568: aload_0
		// @0569: getfield int game.C_100018_wk.field_101545_fb
		// @056C: iadd
		// @056D: bipush 100 (0x64)
		// @056F: aload_0
		// @0570: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0573: bipush -124 (0x84)
		// @0575: aload_0
		// @0576: getfield int game.C_100018_wk.field_101519_C
		// @0579: sipush 21000 (0x5208)
		// @057C: imul
		// @057D: aload_0
		// @057E: getfield int game.C_100018_wk.field_101514_F
		// @0581: iadd
		// @0582: iconst_1
		// @0583: bipush 50 (0x32)
		// @0585: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @0588: astore_3
		// @0589: aload_0
		// @058A: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @058D: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @0590: bipush 126 (0x7E)
		// @0592: aload_3
		// @0593: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0596: bipush 12 (0x0C)
		// @0598: aload_0
		// @0599: getfield int game.C_100018_wk.field_101539_Y
		// @059C: if_icmpeq @075C
		// @059F: bipush 13 (0x0D)
		// @05A1: aload_0
		// @05A2: getfield int game.C_100018_wk.field_101539_Y
		// @05A5: if_icmpeq @06F4
		// @05A8: goto @05AC
		// @05AB: athrow
		// @05AC: aload_0
		// @05AD: getfield int game.C_100018_wk.field_101539_Y
		// @05B0: iconst_m1
		// @05B1: ixor
		// @05B2: bipush -16 (0xF0)
		// @05B4: if_icmpeq @06F4
		// @05B7: goto @05BB
		// @05BA: athrow
		// @05BB: bipush -15 (0xF1)
		// @05BD: aload_0
		// @05BE: getfield int game.C_100018_wk.field_101539_Y
		// @05C1: iconst_m1
		// @05C2: ixor
		// @05C3: if_icmpeq @05CE
		// @05C6: goto @05CA
		// @05C9: athrow
		// @05CA: goto @07D2
		// @05CD: athrow
		// @05CE: iconst_m1
		// @05CF: bipush 7 (0x07)
		// @05D1: aload_0
		// @05D2: getfield int game.C_100018_wk.field_101516_G
		// @05D5: iand
		// @05D6: iconst_m1
		// @05D7: ixor
		// @05D8: if_icmpne @07D2
		// @05DB: sipush -251 (0xFF05)
		// @05DE: aload_0
		// @05DF: getfield int game.C_100018_wk.field_101516_G
		// @05E2: iconst_m1
		// @05E3: ixor
		// @05E4: if_icmpgt @05EF
		// @05E7: goto @05EB
		// @05EA: athrow
		// @05EB: goto @07D2
		// @05EE: athrow
		// @05EF: new game.C_100018_wk
		// @05F2: dup
		// @05F3: aload_0
		// @05F4: getfield int game.C_100018_wk.field_101514_F
		// @05F7: aload_0
		// @05F8: getfield int game.C_100018_wk.field_101519_C
		// @05FB: ldc 48000 (0xbb80)
		// @05FD: imul
		// @05FE: isub
		// @05FF: aload_0
		// @0600: getfield int game.C_100018_wk.field_101545_fb
		// @0603: sipush 8000 (0x1F40)
		// @0606: iadd
		// @0607: bipush -50 (0xCE)
		// @0609: aload_0
		// @060A: getfield int game.C_100018_wk.field_101519_C
		// @060D: imul
		// @060E: bipush 25 (0x19)
		// @0610: iconst_1
		// @0611: iconst_1
		// @0612: iconst_3
		// @0613: aload_0
		// @0614: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0617: aconst_null
		// @0618: bipush 50 (0x32)
		// @061A: iconst_0
		// @061B: bipush 6 (0x06)
		// @061D: invokespecial game.C_100018_wk.<init>(int, int, int, int, int, int, int, game.C_100294_ki, game.C_100314_lf, int, int, int)void
		// @0620: astore_3
		// @0621: aload_3
		// @0622: iconst_1
		// @0623: putfield boolean game.C_100018_wk.field_101542_Z
		// @0626: aload_0
		// @0627: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @062A: getfield game.C_100202_qi game.C_100294_ki.field_106977_f
		// @062D: bipush 123 (0x7B)
		// @062F: aload_3
		// @0630: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0633: aload_0
		// @0634: getfield int game.C_100018_wk.field_101514_F
		// @0637: bipush 14 (0x0E)
		// @0639: iconst_1
		// @063A: invokestatic game.C_100143_bl.func_105098_a(int, int, boolean)game.C_100179_ch
		// @063D: pop
		// @063E: aload_3
		// @063F: aconst_null
		// @0640: putfield game.C_100314_lf game.C_100018_wk.field_101529_K
		// @0643: aload_0
		// @0644: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0647: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @064A: bipush 67 (0x43)
		// @064C: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @064F: checkcast game.C_100314_lf
		// @0652: astore #4
		// @0654: aload #4
		// @0656: ifnull @06EA
		// @0659: iconst_0
		// @065A: aload #4
		// @065C: getfield int game.C_100314_lf.field_101356_w
		// @065F: iload #9
		// @0661: ifne @07D9
		// @0664: if_icmpge @06D4
		// @0667: goto @066B
		// @066A: athrow
		// @066B: aload #4
		// @066D: getfield boolean game.C_100314_lf.field_101403_Rb
		// @0670: ifne @06D4
		// @0673: goto @0677
		// @0676: athrow
		// @0677: aload #4
		// @0679: getfield boolean game.C_100314_lf.field_101307_pb
		// @067C: ifne @0687
		// @067F: goto @0683
		// @0682: athrow
		// @0683: goto @06D4
		// @0686: athrow
		// @0687: aconst_null
		// @0688: aload_3
		// @0689: getfield game.C_100314_lf game.C_100018_wk.field_101529_K
		// @068C: if_acmpeq @06B4
		// @068F: aload_3
		// @0690: getfield int game.C_100018_wk.field_101514_F
		// @0693: ineg
		// @0694: aload #4
		// @0696: getfield int game.C_100314_lf.field_101377_tc
		// @0699: iadd
		// @069A: invokestatic java.lang.Math.abs(int)int
		// @069D: aload_3
		// @069E: getfield game.C_100314_lf game.C_100018_wk.field_101529_K
		// @06A1: getfield int game.C_100314_lf.field_101377_tc
		// @06A4: aload_3
		// @06A5: getfield int game.C_100018_wk.field_101514_F
		// @06A8: ineg
		// @06A9: iadd
		// @06AA: invokestatic java.lang.Math.abs(int)int
		// @06AD: if_icmpge @06D4
		// @06B0: goto @06B4
		// @06B3: athrow
		// @06B4: aload_3
		// @06B5: aload #4
		// @06B7: putfield game.C_100314_lf game.C_100018_wk.field_101529_K
		// @06BA: aload_3
		// @06BB: aload_3
		// @06BC: getfield game.C_100314_lf game.C_100018_wk.field_101529_K
		// @06BF: getfield int game.C_100314_lf.field_101395_rc
		// @06C2: putfield int game.C_100018_wk.field_101537_S
		// @06C5: aload_3
		// @06C6: aload_3
		// @06C7: getfield game.C_100314_lf game.C_100018_wk.field_101529_K
		// @06CA: getfield int game.C_100314_lf.field_101377_tc
		// @06CD: putfield int game.C_100018_wk.field_101548_u
		// @06D0: goto @06D4
		// @06D3: athrow
		// @06D4: aload_0
		// @06D5: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @06D8: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @06DB: bipush 127 (0x7F)
		// @06DD: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @06E0: checkcast game.C_100314_lf
		// @06E3: astore #4
		// @06E5: iload #9
		// @06E7: ifeq @0654
		// @06EA: aload_3
		// @06EB: aconst_null
		// @06EC: putfield game.C_100314_lf game.C_100018_wk.field_101529_K
		// @06EF: iload #9
		// @06F1: ifeq @07D2
		// @06F4: new game.C_100018_wk
		// @06F7: dup
		// @06F8: sipush 30000 (0x7530)
		// @06FB: aload_0
		// @06FC: getfield int game.C_100018_wk.field_101519_C
		// @06FF: imul
		// @0700: ineg
		// @0701: aload_0
		// @0702: getfield int game.C_100018_wk.field_101514_F
		// @0705: iadd
		// @0706: aload_0
		// @0707: getfield int game.C_100018_wk.field_101545_fb
		// @070A: sipush -29000 (0x8EB8)
		// @070D: isub
		// @070E: sipush 300 (0x012C)
		// @0711: aload_0
		// @0712: getfield int game.C_100018_wk.field_101519_C
		// @0715: imul
		// @0716: sipush 200 (0x00C8)
		// @0719: bipush 50 (0x32)
		// @071B: iconst_1
		// @071C: iconst_4
		// @071D: aload_0
		// @071E: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0721: aconst_null
		// @0722: bipush 10 (0x0A)
		// @0724: iconst_0
		// @0725: bipush 17 (0x11)
		// @0727: invokespecial game.C_100018_wk.<init>(int, int, int, int, int, int, int, game.C_100294_ki, game.C_100314_lf, int, int, int)void
		// @072A: astore_3
		// @072B: aload_3
		// @072C: iconst_1
		// @072D: putfield boolean game.C_100018_wk.field_101542_Z
		// @0730: aload_0
		// @0731: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0734: getfield game.C_100202_qi game.C_100294_ki.field_106977_f
		// @0737: bipush 125 (0x7D)
		// @0739: aload_3
		// @073A: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @073D: iconst_0
		// @073E: aload_0
		// @073F: getfield int game.C_100018_wk.field_101516_G
		// @0742: bipush 50 (0x32)
		// @0744: irem
		// @0745: if_icmpne @0757
		// @0748: aload_0
		// @0749: getfield int game.C_100018_wk.field_101514_F
		// @074C: bipush 67 (0x43)
		// @074E: iconst_1
		// @074F: invokestatic game.C_100143_bl.func_105098_a(int, int, boolean)game.C_100179_ch
		// @0752: pop
		// @0753: goto @0757
		// @0756: athrow
		// @0757: iload #9
		// @0759: ifeq @07D2
		// @075C: aload_0
		// @075D: getfield int game.C_100018_wk.field_101516_G
		// @0760: bipush 31 (0x1F)
		// @0762: iand
		// @0763: iconst_m1
		// @0764: ixor
		// @0765: iconst_m1
		// @0766: if_icmpne @07D2
		// @0769: goto @076D
		// @076C: athrow
		// @076D: sipush 250 (0x00FA)
		// @0770: aload_0
		// @0771: getfield int game.C_100018_wk.field_101516_G
		// @0774: if_icmplt @077F
		// @0777: goto @077B
		// @077A: athrow
		// @077B: goto @07D2
		// @077E: athrow
		// @077F: new game.C_100018_wk
		// @0782: dup
		// @0783: aload_0
		// @0784: getfield int game.C_100018_wk.field_101514_F
		// @0787: sipush 24000 (0x5DC0)
		// @078A: aload_0
		// @078B: getfield int game.C_100018_wk.field_101519_C
		// @078E: imul
		// @078F: ineg
		// @0790: iadd
		// @0791: sipush 23000 (0x59D8)
		// @0794: aload_0
		// @0795: getfield int game.C_100018_wk.field_101545_fb
		// @0798: iadd
		// @0799: bipush -50 (0xCE)
		// @079B: aload_0
		// @079C: getfield int game.C_100018_wk.field_101519_C
		// @079F: imul
		// @07A0: bipush 50 (0x32)
		// @07A2: iconst_1
		// @07A3: iconst_1
		// @07A4: bipush 6 (0x06)
		// @07A6: aload_0
		// @07A7: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @07AA: aconst_null
		// @07AB: sipush 500 (0x01F4)
		// @07AE: iconst_0
		// @07AF: bipush 31 (0x1F)
		// @07B1: invokespecial game.C_100018_wk.<init>(int, int, int, int, int, int, int, game.C_100294_ki, game.C_100314_lf, int, int, int)void
		// @07B4: astore_3
		// @07B5: aload_3
		// @07B6: iconst_1
		// @07B7: putfield boolean game.C_100018_wk.field_101542_Z
		// @07BA: aload_0
		// @07BB: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @07BE: getfield game.C_100202_qi game.C_100294_ki.field_106977_f
		// @07C1: bipush 125 (0x7D)
		// @07C3: aload_3
		// @07C4: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @07C7: aload_0
		// @07C8: getfield int game.C_100018_wk.field_101514_F
		// @07CB: bipush 62 (0x3E)
		// @07CD: iconst_1
		// @07CE: invokestatic game.C_100143_bl.func_105098_a(int, int, boolean)game.C_100179_ch
		// @07D1: pop
		// @07D2: aload_0
		// @07D3: getfield int game.C_100018_wk.field_101516_G
		// @07D6: sipush 500 (0x01F4)
		// @07D9: if_icmplt @0869
		// @07DC: aload_0
		// @07DD: sipush -500 (0xFE0C)
		// @07E0: putfield int game.C_100018_wk.field_101516_G
		// @07E3: aload_0
		// @07E4: aload_0
		// @07E5: getfield int game.C_100018_wk.field_101519_C
		// @07E8: ineg
		// @07E9: putfield int game.C_100018_wk.field_101519_C
		// @07EC: aload_0
		// @07ED: getfield int game.C_100018_wk.field_101539_Y
		// @07F0: iconst_m1
		// @07F1: ixor
		// @07F2: bipush -13 (0xF3)
		// @07F4: if_icmpeq @085F
		// @07F7: goto @07FB
		// @07FA: athrow
		// @07FB: bipush 14 (0x0E)
		// @07FD: aload_0
		// @07FE: getfield int game.C_100018_wk.field_101539_Y
		// @0801: if_icmpeq @0850
		// @0804: goto @0808
		// @0807: athrow
		// @0808: aload_0
		// @0809: getfield int game.C_100018_wk.field_101539_Y
		// @080C: bipush 13 (0x0D)
		// @080E: if_icmpne @082B
		// @0811: goto @0815
		// @0814: athrow
		// @0815: aload_0
		// @0816: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0819: getfield game.C_100300_kc game.C_100294_ki.field_106950_D
		// @081C: bipush 127 (0x7F)
		// @081E: aload_0
		// @081F: invokevirtual game.C_100300_kc.func_107058_a(int, game.C_100325_id)void
		// @0822: iload #9
		// @0824: ifeq @0869
		// @0827: goto @082B
		// @082A: athrow
		// @082B: aload_0
		// @082C: getfield int game.C_100018_wk.field_101539_Y
		// @082F: iconst_m1
		// @0830: ixor
		// @0831: bipush -17 (0xEF)
		// @0833: if_icmpeq @083E
		// @0836: goto @083A
		// @0839: athrow
		// @083A: goto @0869
		// @083D: athrow
		// @083E: aload_0
		// @083F: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0842: getfield game.C_100300_kc game.C_100294_ki.field_106950_D
		// @0845: bipush 125 (0x7D)
		// @0847: aload_0
		// @0848: invokevirtual game.C_100300_kc.func_107058_a(int, game.C_100325_id)void
		// @084B: iload #9
		// @084D: ifeq @0869
		// @0850: aload_0
		// @0851: bipush 13 (0x0D)
		// @0853: putfield int game.C_100018_wk.field_101539_Y
		// @0856: iload #9
		// @0858: ifeq @0869
		// @085B: goto @085F
		// @085E: athrow
		// @085F: aload_0
		// @0860: bipush 13 (0x0D)
		// @0862: putfield int game.C_100018_wk.field_101539_Y
		// @0865: goto @0869
		// @0868: athrow
		// @0869: return
		// @086A: aload_0
		// @086B: getfield int game.C_100018_wk.field_101539_Y
		// @086E: bipush 17 (0x11)
		// @0870: if_icmpeq @0877
		// @0873: goto @0D10
		// @0876: athrow
		// @0877: aload_0
		// @0878: getfield game.C_100314_lf game.C_100018_wk.field_101529_K
		// @087B: ifnull @08B1
		// @087E: iconst_0
		// @087F: aload_0
		// @0880: getfield game.C_100314_lf game.C_100018_wk.field_101529_K
		// @0883: getfield int game.C_100314_lf.field_101356_w
		// @0886: if_icmpge @089F
		// @0889: goto @088D
		// @088C: athrow
		// @088D: aload_0
		// @088E: getfield game.C_100314_lf game.C_100018_wk.field_101529_K
		// @0891: getfield boolean game.C_100314_lf.field_101326_I
		// @0894: ifne @089F
		// @0897: goto @089B
		// @089A: athrow
		// @089B: goto @0992
		// @089E: athrow
		// @089F: aload_0
		// @08A0: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @08A3: getfield game.C_100300_kc game.C_100294_ki.field_106950_D
		// @08A6: bipush 125 (0x7D)
		// @08A8: aload_0
		// @08A9: invokevirtual game.C_100300_kc.func_107058_a(int, game.C_100325_id)void
		// @08AC: iload #9
		// @08AE: ifeq @0992
		// @08B1: aload_0
		// @08B2: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @08B5: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @08B8: bipush 31 (0x1F)
		// @08BA: invokevirtual game.C_100202_qi.func_105899_c(int)game.C_100158_da
		// @08BD: checkcast game.C_100314_lf
		// @08C0: astore_2
		// @08C1: aload_2
		// @08C2: ifnull @0978
		// @08C5: iload #9
		// @08C7: ifne @0984
		// @08CA: iconst_m1
		// @08CB: aload_2
		// @08CC: getfield int game.C_100314_lf.field_101356_w
		// @08CF: iconst_m1
		// @08D0: ixor
		// @08D1: if_icmple @0963
		// @08D4: goto @08D8
		// @08D7: athrow
		// @08D8: aload_2
		// @08D9: getfield boolean game.C_100314_lf.field_101403_Rb
		// @08DC: ifne @0963
		// @08DF: goto @08E3
		// @08E2: athrow
		// @08E3: aload_2
		// @08E4: getfield int game.C_100314_lf.field_101346_Z
		// @08E7: iconst_m1
		// @08E8: ixor
		// @08E9: bipush -2 (0xFE)
		// @08EB: if_icmpne @08FF
		// @08EE: goto @08F2
		// @08F1: athrow
		// @08F2: aload_0
		// @08F3: getfield int game.C_100018_wk.field_101519_C
		// @08F6: iconst_m1
		// @08F7: ixor
		// @08F8: ifeq @0916
		// @08FB: goto @08FF
		// @08FE: athrow
		// @08FF: aload_2
		// @0900: getfield int game.C_100314_lf.field_101346_Z
		// @0903: ifne @0963
		// @0906: goto @090A
		// @0909: athrow
		// @090A: aload_0
		// @090B: getfield int game.C_100018_wk.field_101519_C
		// @090E: iconst_1
		// @090F: if_icmpne @0963
		// @0912: goto @0916
		// @0915: athrow
		// @0916: aload_0
		// @0917: getfield game.C_100314_lf game.C_100018_wk.field_101529_K
		// @091A: ifnull @0948
		// @091D: goto @0921
		// @0920: athrow
		// @0921: aload_2
		// @0922: getfield int game.C_100314_lf.field_101377_tc
		// @0925: aload_0
		// @0926: getfield int game.C_100018_wk.field_101514_F
		// @0929: isub
		// @092A: invokestatic java.lang.Math.abs(int)int
		// @092D: aload_0
		// @092E: getfield int game.C_100018_wk.field_101514_F
		// @0931: ineg
		// @0932: aload_0
		// @0933: getfield game.C_100314_lf game.C_100018_wk.field_101529_K
		// @0936: getfield int game.C_100314_lf.field_101377_tc
		// @0939: iadd
		// @093A: invokestatic java.lang.Math.abs(int)int
		// @093D: if_icmplt @0948
		// @0940: goto @0944
		// @0943: athrow
		// @0944: goto @0963
		// @0947: athrow
		// @0948: aload_0
		// @0949: aload_2
		// @094A: putfield game.C_100314_lf game.C_100018_wk.field_101529_K
		// @094D: aload_0
		// @094E: aload_0
		// @094F: getfield game.C_100314_lf game.C_100018_wk.field_101529_K
		// @0952: getfield int game.C_100314_lf.field_101395_rc
		// @0955: putfield int game.C_100018_wk.field_101537_S
		// @0958: aload_0
		// @0959: aload_0
		// @095A: getfield game.C_100314_lf game.C_100018_wk.field_101529_K
		// @095D: getfield int game.C_100314_lf.field_101377_tc
		// @0960: putfield int game.C_100018_wk.field_101548_u
		// @0963: aload_0
		// @0964: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0967: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @096A: bipush 27 (0x1B)
		// @096C: invokevirtual game.C_100202_qi.func_105907_c(byte)game.C_100158_da
		// @096F: checkcast game.C_100314_lf
		// @0972: astore_2
		// @0973: iload #9
		// @0975: ifeq @08C1
		// @0978: aconst_null
		// @0979: aload_0
		// @097A: getfield game.C_100314_lf game.C_100018_wk.field_101529_K
		// @097D: if_acmpeq @0984
		// @0980: goto @0991
		// @0983: athrow
		// @0984: aload_0
		// @0985: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0988: getfield game.C_100300_kc game.C_100294_ki.field_106950_D
		// @098B: bipush 126 (0x7E)
		// @098D: aload_0
		// @098E: invokevirtual game.C_100300_kc.func_107058_a(int, game.C_100325_id)void
		// @0991: return
		// @0992: aload_0
		// @0993: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0996: getfield boolean game.C_100294_ki.field_106969_V
		// @0999: ifne @0A25
		// @099C: bipush 125 (0x7D)
		// @099E: aload_0
		// @099F: getfield int game.C_100018_wk.field_101516_G
		// @09A2: if_icmpgt @09AD
		// @09A5: goto @09A9
		// @09A8: athrow
		// @09A9: goto @0A25
		// @09AC: athrow
		// @09AD: invokestatic java.lang.Math.random()double
		// @09B0: ldc2_w 3.14
		// @09B3: dmul
		// @09B4: dstore_2
		// @09B5: ldc2_w 1024.0
		// @09B8: dload_2
		// @09B9: invokestatic java.lang.Math.sin(double)double
		// @09BC: dmul
		// @09BD: d2i
		// @09BE: istore #4
		// @09C0: ldc2_w 1024.0
		// @09C3: dload_2
		// @09C4: invokestatic java.lang.Math.cos(double)double
		// @09C7: dmul
		// @09C8: d2i
		// @09C9: istore #5
		// @09CB: aload_0
		// @09CC: getfield int game.C_100018_wk.field_101516_G
		// @09CF: iconst_4
		// @09D0: idiv
		// @09D1: ineg
		// @09D2: bipush 50 (0x32)
		// @09D4: iadd
		// @09D5: invokestatic java.lang.Math.random()double
		// @09D8: aload_0
		// @09D9: getfield int game.C_100018_wk.field_101516_G
		// @09DC: i2d
		// @09DD: dmul
		// @09DE: ldc2_w 4.0
		// @09E1: ddiv
		// @09E2: d2i
		// @09E3: ineg
		// @09E4: iadd
		// @09E5: istore #6
		// @09E7: aload_0
		// @09E8: getfield int game.C_100018_wk.field_101514_F
		// @09EB: iload #4
		// @09ED: aload_0
		// @09EE: getfield boolean game.C_100018_wk.field_101534_V
		// @09F1: iload #5
		// @09F3: iload #6
		// @09F5: imul
		// @09F6: ineg
		// @09F7: aload_0
		// @09F8: getfield int game.C_100018_wk.field_101545_fb
		// @09FB: iadd
		// @09FC: iload #5
		// @09FE: aload_0
		// @09FF: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0A02: bipush -124 (0x84)
		// @0A04: iload #4
		// @0A06: iload #6
		// @0A08: imul
		// @0A09: ineg
		// @0A0A: aload_0
		// @0A0B: getfield int game.C_100018_wk.field_101514_F
		// @0A0E: iadd
		// @0A0F: iconst_4
		// @0A10: bipush 50 (0x32)
		// @0A12: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @0A15: astore #7
		// @0A17: aload_0
		// @0A18: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0A1B: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @0A1E: bipush 126 (0x7E)
		// @0A20: aload #7
		// @0A22: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0A25: aload_0
		// @0A26: getfield int game.C_100018_wk.field_101516_G
		// @0A29: bipush 100 (0x64)
		// @0A2B: if_icmplt @0AFB
		// @0A2E: aload_0
		// @0A2F: getfield int game.C_100018_wk.field_101516_G
		// @0A32: iconst_m1
		// @0A33: ixor
		// @0A34: sipush -1001 (0xFC17)
		// @0A37: if_icmpgt @0A42
		// @0A3A: goto @0A3E
		// @0A3D: athrow
		// @0A3E: goto @0AFB
		// @0A41: athrow
		// @0A42: aload_0
		// @0A43: dup
		// @0A44: getfield int game.C_100018_wk.field_101514_F
		// @0A47: sipush 1000 (0x03E8)
		// @0A4A: aload_0
		// @0A4B: getfield int game.C_100018_wk.field_101519_C
		// @0A4E: imul
		// @0A4F: iadd
		// @0A50: putfield int game.C_100018_wk.field_101514_F
		// @0A53: aload_0
		// @0A54: getfield int game.C_100018_wk.field_101514_F
		// @0A57: aload_0
		// @0A58: getfield int game.C_100018_wk.field_101514_F
		// @0A5B: ineg
		// @0A5C: aload_0
		// @0A5D: getfield game.C_100314_lf game.C_100018_wk.field_101529_K
		// @0A60: getfield int game.C_100314_lf.field_101377_tc
		// @0A63: iadd
		// @0A64: bipush -100 (0x9C)
		// @0A66: aload_0
		// @0A67: getfield int game.C_100018_wk.field_101516_G
		// @0A6A: iadd
		// @0A6B: imul
		// @0A6C: sipush 900 (0x0384)
		// @0A6F: idiv
		// @0A70: iadd
		// @0A71: istore_2
		// @0A72: aload_0
		// @0A73: getfield int game.C_100018_wk.field_101545_fb
		// @0A76: aload_0
		// @0A77: getfield int game.C_100018_wk.field_101545_fb
		// @0A7A: ineg
		// @0A7B: aload_0
		// @0A7C: getfield game.C_100314_lf game.C_100018_wk.field_101529_K
		// @0A7F: getfield int game.C_100314_lf.field_101395_rc
		// @0A82: iadd
		// @0A83: bipush -100 (0x9C)
		// @0A85: aload_0
		// @0A86: getfield int game.C_100018_wk.field_101516_G
		// @0A89: iadd
		// @0A8A: imul
		// @0A8B: sipush 900 (0x0384)
		// @0A8E: idiv
		// @0A8F: iadd
		// @0A90: istore_3
		// @0A91: aload_0
		// @0A92: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0A95: getfield boolean game.C_100294_ki.field_106969_V
		// @0A98: ifne @0AFB
		// @0A9B: aload_0
		// @0A9C: getfield int game.C_100018_wk.field_101514_F
		// @0A9F: iconst_0
		// @0AA0: aload_0
		// @0AA1: getfield boolean game.C_100018_wk.field_101534_V
		// @0AA4: iload_3
		// @0AA5: aload_0
		// @0AA6: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0AA9: getfield int game.C_100294_ki.field_106951_E
		// @0AAC: iconst_1
		// @0AAD: iand
		// @0AAE: sipush 1000 (0x03E8)
		// @0AB1: imul
		// @0AB2: sipush -500 (0xFE0C)
		// @0AB5: iadd
		// @0AB6: aload_0
		// @0AB7: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0ABA: bipush -124 (0x84)
		// @0ABC: iload_2
		// @0ABD: iconst_4
		// @0ABE: bipush 50 (0x32)
		// @0AC0: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @0AC3: astore #4
		// @0AC5: aload_0
		// @0AC6: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0AC9: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @0ACC: bipush 125 (0x7D)
		// @0ACE: aload #4
		// @0AD0: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0AD3: aload_0
		// @0AD4: getfield int game.C_100018_wk.field_101514_F
		// @0AD7: iconst_0
		// @0AD8: aload_0
		// @0AD9: getfield boolean game.C_100018_wk.field_101534_V
		// @0ADC: iload_3
		// @0ADD: iconst_0
		// @0ADE: aload_0
		// @0ADF: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0AE2: bipush -124 (0x84)
		// @0AE4: iload_2
		// @0AE5: iconst_1
		// @0AE6: bipush 100 (0x64)
		// @0AE8: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @0AEB: astore #4
		// @0AED: aload_0
		// @0AEE: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0AF1: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @0AF4: bipush 127 (0x7F)
		// @0AF6: aload #4
		// @0AF8: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0AFB: aload_0
		// @0AFC: dup
		// @0AFD: getfield int game.C_100018_wk.field_101516_G
		// @0B00: iconst_1
		// @0B01: iadd
		// @0B02: putfield int game.C_100018_wk.field_101516_G
		// @0B05: sipush -1001 (0xFC17)
		// @0B08: aload_0
		// @0B09: getfield int game.C_100018_wk.field_101516_G
		// @0B0C: iconst_m1
		// @0B0D: ixor
		// @0B0E: if_icmpge @0B15
		// @0B11: goto @0D0F
		// @0B14: athrow
		// @0B15: aload_0
		// @0B16: aload_0
		// @0B17: getfield game.C_100314_lf game.C_100018_wk.field_101529_K
		// @0B1A: getfield int game.C_100314_lf.field_101377_tc
		// @0B1D: putfield int game.C_100018_wk.field_101514_F
		// @0B20: aload_0
		// @0B21: aload_0
		// @0B22: getfield game.C_100314_lf game.C_100018_wk.field_101529_K
		// @0B25: getfield int game.C_100314_lf.field_101395_rc
		// @0B28: putfield int game.C_100018_wk.field_101545_fb
		// @0B2B: aload_0
		// @0B2C: sipush 5000 (0x1388)
		// @0B2F: sipush 200 (0x00C8)
		// @0B32: iconst_0
		// @0B33: sipush 1000 (0x03E8)
		// @0B36: bipush -3 (0xFD)
		// @0B38: invokevirtual game.C_100018_wk.func_101510_a(int, int, int, int, int)void
		// @0B3B: iconst_m1
		// @0B3C: istore_2
		// @0B3D: iconst_0
		// @0B3E: istore_3
		// @0B3F: bipush -3 (0xFD)
		// @0B41: iload_3
		// @0B42: iconst_m1
		// @0B43: ixor
		// @0B44: if_icmpge @0BA3
		// @0B47: aload_0
		// @0B48: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0B4B: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @0B4E: getfield int[] game.C_100171_cn.field_105580_p
		// @0B51: iload_3
		// @0B52: iaload
		// @0B53: istore #4
		// @0B55: sipush -1080 (0xFBC8)
		// @0B58: istore #5
		// @0B5A: sipush 4800 (0x12C0)
		// @0B5D: istore #6
		// @0B5F: aload_0
		// @0B60: getfield int game.C_100018_wk.field_101514_F
		// @0B63: ldc -1988185084 (0x897eb404)
		// @0B65: ishr
		// @0B66: iload #4
		// @0B68: ineg
		// @0B69: iadd
		// @0B6A: istore #7
		// @0B6C: aload_0
		// @0B6D: getfield int game.C_100018_wk.field_101545_fb
		// @0B70: ldc 425360420 (0x195a7c24)
		// @0B72: ishr
		// @0B73: iload #5
		// @0B75: ineg
		// @0B76: iadd
		// @0B77: istore #8
		// @0B79: iload #8
		// @0B7B: iload #8
		// @0B7D: imul
		// @0B7E: iload #7
		// @0B80: iload #7
		// @0B82: imul
		// @0B83: iadd
		// @0B84: iconst_m1
		// @0B85: ixor
		// @0B86: iload #6
		// @0B88: iload #6
		// @0B8A: imul
		// @0B8B: iconst_m1
		// @0B8C: ixor
		// @0B8D: iload #9
		// @0B8F: ifne @0BA8
		// @0B92: if_icmple @0B9B
		// @0B95: goto @0B99
		// @0B98: athrow
		// @0B99: iload_3
		// @0B9A: istore_2
		// @0B9B: iinc #3 +1
		// @0B9E: iload #9
		// @0BA0: ifeq @0B3F
		// @0BA3: aload_0
		// @0BA4: getfield int game.C_100018_wk.field_101519_C
		// @0BA7: iconst_1
		// @0BA8: if_icmpne @0C54
		// @0BAB: iconst_1
		// @0BAC: iload_2
		// @0BAD: if_icmpne @0C54
		// @0BB0: goto @0BB4
		// @0BB3: athrow
		// @0BB4: aload_0
		// @0BB5: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0BB8: getfield int game.C_100294_ki.field_106987_m
		// @0BBB: bipush 8 (0x08)
		// @0BBD: iand
		// @0BBE: iconst_m1
		// @0BBF: ixor
		// @0BC0: iconst_m1
		// @0BC1: if_icmpeq @0C34
		// @0BC4: goto @0BC8
		// @0BC7: athrow
		// @0BC8: aload_0
		// @0BC9: dup
		// @0BCA: getfield int game.C_100018_wk.field_101545_fb
		// @0BCD: sipush 10000 (0x2710)
		// @0BD0: iadd
		// @0BD1: putfield int game.C_100018_wk.field_101545_fb
		// @0BD4: aload_0
		// @0BD5: dup
		// @0BD6: getfield int game.C_100018_wk.field_101514_F
		// @0BD9: sipush 25000 (0x61A8)
		// @0BDC: iadd
		// @0BDD: putfield int game.C_100018_wk.field_101514_F
		// @0BE0: aload_0
		// @0BE1: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0BE4: dup
		// @0BE5: getfield int game.C_100294_ki.field_106987_m
		// @0BE8: bipush 32 (0x20)
		// @0BEA: ior
		// @0BEB: putfield int game.C_100294_ki.field_106987_m
		// @0BEE: aload_0
		// @0BEF: sipush 5000 (0x1388)
		// @0BF2: sipush 400 (0x0190)
		// @0BF5: iconst_0
		// @0BF6: sipush 2000 (0x07D0)
		// @0BF9: bipush -3 (0xFD)
		// @0BFB: invokevirtual game.C_100018_wk.func_101510_a(int, int, int, int, int)void
		// @0BFE: aload_0
		// @0BFF: dup
		// @0C00: getfield int game.C_100018_wk.field_101545_fb
		// @0C03: sipush 30000 (0x7530)
		// @0C06: isub
		// @0C07: putfield int game.C_100018_wk.field_101545_fb
		// @0C0A: aload_0
		// @0C0B: dup
		// @0C0C: getfield int game.C_100018_wk.field_101514_F
		// @0C0F: ldc 50000 (0xc350)
		// @0C11: isub
		// @0C12: putfield int game.C_100018_wk.field_101514_F
		// @0C15: aload_0
		// @0C16: sipush 5000 (0x1388)
		// @0C19: sipush 500 (0x01F4)
		// @0C1C: iconst_0
		// @0C1D: sipush 2000 (0x07D0)
		// @0C20: bipush -3 (0xFD)
		// @0C22: invokevirtual game.C_100018_wk.func_101510_a(int, int, int, int, int)void
		// @0C25: aload_0
		// @0C26: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0C29: iconst_1
		// @0C2A: sipush 256 (0x0100)
		// @0C2D: invokevirtual game.C_100294_ki.func_106905_d(int, int)void
		// @0C30: goto @0C34
		// @0C33: athrow
		// @0C34: aload_0
		// @0C35: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0C38: dup
		// @0C39: getfield int game.C_100294_ki.field_106987_m
		// @0C3C: bipush 8 (0x08)
		// @0C3E: ior
		// @0C3F: putfield int game.C_100294_ki.field_106987_m
		// @0C42: aload_0
		// @0C43: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0C46: dup
		// @0C47: getfield int game.C_100294_ki.field_106987_m
		// @0C4A: iconst_2
		// @0C4B: ior
		// @0C4C: putfield int game.C_100294_ki.field_106987_m
		// @0C4F: iload #9
		// @0C51: ifeq @0D02
		// @0C54: aload_0
		// @0C55: getfield int game.C_100018_wk.field_101519_C
		// @0C58: iconst_m1
		// @0C59: if_icmpne @0D02
		// @0C5C: goto @0C60
		// @0C5F: athrow
		// @0C60: iconst_0
		// @0C61: iload_2
		// @0C62: if_icmpne @0D02
		// @0C65: goto @0C69
		// @0C68: athrow
		// @0C69: iconst_4
		// @0C6A: aload_0
		// @0C6B: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0C6E: getfield int game.C_100294_ki.field_106987_m
		// @0C71: iand
		// @0C72: iconst_m1
		// @0C73: ixor
		// @0C74: iconst_m1
		// @0C75: if_icmpeq @0CE8
		// @0C78: goto @0C7C
		// @0C7B: athrow
		// @0C7C: aload_0
		// @0C7D: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0C80: dup
		// @0C81: getfield int game.C_100294_ki.field_106987_m
		// @0C84: bipush 16 (0x10)
		// @0C86: ior
		// @0C87: putfield int game.C_100294_ki.field_106987_m
		// @0C8A: aload_0
		// @0C8B: dup
		// @0C8C: getfield int game.C_100018_wk.field_101545_fb
		// @0C8F: sipush 10000 (0x2710)
		// @0C92: iadd
		// @0C93: putfield int game.C_100018_wk.field_101545_fb
		// @0C96: aload_0
		// @0C97: dup
		// @0C98: getfield int game.C_100018_wk.field_101514_F
		// @0C9B: sipush 25000 (0x61A8)
		// @0C9E: isub
		// @0C9F: putfield int game.C_100018_wk.field_101514_F
		// @0CA2: aload_0
		// @0CA3: sipush 5000 (0x1388)
		// @0CA6: sipush 400 (0x0190)
		// @0CA9: iconst_0
		// @0CAA: sipush 2000 (0x07D0)
		// @0CAD: bipush -3 (0xFD)
		// @0CAF: invokevirtual game.C_100018_wk.func_101510_a(int, int, int, int, int)void
		// @0CB2: aload_0
		// @0CB3: dup
		// @0CB4: getfield int game.C_100018_wk.field_101514_F
		// @0CB7: ldc 50000 (0xc350)
		// @0CB9: iadd
		// @0CBA: putfield int game.C_100018_wk.field_101514_F
		// @0CBD: aload_0
		// @0CBE: dup
		// @0CBF: getfield int game.C_100018_wk.field_101545_fb
		// @0CC2: sipush 30000 (0x7530)
		// @0CC5: isub
		// @0CC6: putfield int game.C_100018_wk.field_101545_fb
		// @0CC9: aload_0
		// @0CCA: sipush 5000 (0x1388)
		// @0CCD: sipush 500 (0x01F4)
		// @0CD0: iconst_0
		// @0CD1: sipush 2000 (0x07D0)
		// @0CD4: bipush -3 (0xFD)
		// @0CD6: invokevirtual game.C_100018_wk.func_101510_a(int, int, int, int, int)void
		// @0CD9: aload_0
		// @0CDA: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0CDD: iconst_0
		// @0CDE: sipush 256 (0x0100)
		// @0CE1: invokevirtual game.C_100294_ki.func_106905_d(int, int)void
		// @0CE4: goto @0CE8
		// @0CE7: athrow
		// @0CE8: aload_0
		// @0CE9: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0CEC: dup
		// @0CED: getfield int game.C_100294_ki.field_106987_m
		// @0CF0: iconst_4
		// @0CF1: ior
		// @0CF2: putfield int game.C_100294_ki.field_106987_m
		// @0CF5: aload_0
		// @0CF6: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0CF9: dup
		// @0CFA: getfield int game.C_100294_ki.field_106987_m
		// @0CFD: iconst_1
		// @0CFE: ior
		// @0CFF: putfield int game.C_100294_ki.field_106987_m
		// @0D02: aload_0
		// @0D03: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0D06: getfield game.C_100300_kc game.C_100294_ki.field_106950_D
		// @0D09: bipush 124 (0x7C)
		// @0D0B: aload_0
		// @0D0C: invokevirtual game.C_100300_kc.func_107058_a(int, game.C_100325_id)void
		// @0D0F: return
		// @0D10: iload_1
		// @0D11: bipush 123 (0x7B)
		// @0D13: if_icmpge @0D20
		// @0D16: aload_0
		// @0D17: bipush -110 (0x92)
		// @0D19: putfield int game.C_100018_wk.field_101533_W
		// @0D1C: goto @0D20
		// @0D1F: athrow
		// @0D20: bipush -12 (0xF4)
		// @0D22: aload_0
		// @0D23: getfield int game.C_100018_wk.field_101539_Y
		// @0D26: iconst_m1
		// @0D27: ixor
		// @0D28: if_icmpeq @0D2F
		// @0D2B: goto @129D
		// @0D2E: athrow
		// @0D2F: aload_0
		// @0D30: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0D33: getfield boolean game.C_100294_ki.field_106969_V
		// @0D36: ifne @0DBC
		// @0D39: aload_0
		// @0D3A: getfield int game.C_100018_wk.field_101516_G
		// @0D3D: bipush 125 (0x7D)
		// @0D3F: if_icmpge @0DBC
		// @0D42: goto @0D46
		// @0D45: athrow
		// @0D46: invokestatic java.lang.Math.random()double
		// @0D49: ldc2_w 3.14
		// @0D4C: dmul
		// @0D4D: dstore_2
		// @0D4E: ldc2_w 1024.0
		// @0D51: dload_2
		// @0D52: invokestatic java.lang.Math.sin(double)double
		// @0D55: dmul
		// @0D56: d2i
		// @0D57: istore #4
		// @0D59: ldc2_w 1024.0
		// @0D5C: dload_2
		// @0D5D: invokestatic java.lang.Math.cos(double)double
		// @0D60: dmul
		// @0D61: d2i
		// @0D62: istore #5
		// @0D64: bipush 50 (0x32)
		// @0D66: aload_0
		// @0D67: getfield int game.C_100018_wk.field_101516_G
		// @0D6A: iconst_4
		// @0D6B: idiv
		// @0D6C: isub
		// @0D6D: invokestatic java.lang.Math.random()double
		// @0D70: aload_0
		// @0D71: getfield int game.C_100018_wk.field_101516_G
		// @0D74: i2d
		// @0D75: dmul
		// @0D76: ldc2_w 4.0
		// @0D79: ddiv
		// @0D7A: d2i
		// @0D7B: isub
		// @0D7C: istore #6
		// @0D7E: aload_0
		// @0D7F: getfield int game.C_100018_wk.field_101514_F
		// @0D82: iload #4
		// @0D84: aload_0
		// @0D85: getfield boolean game.C_100018_wk.field_101534_V
		// @0D88: aload_0
		// @0D89: getfield int game.C_100018_wk.field_101545_fb
		// @0D8C: iload #6
		// @0D8E: iload #5
		// @0D90: imul
		// @0D91: ineg
		// @0D92: iadd
		// @0D93: iload #5
		// @0D95: aload_0
		// @0D96: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0D99: bipush -124 (0x84)
		// @0D9B: iload #4
		// @0D9D: iload #6
		// @0D9F: imul
		// @0DA0: ineg
		// @0DA1: aload_0
		// @0DA2: getfield int game.C_100018_wk.field_101514_F
		// @0DA5: iadd
		// @0DA6: iconst_4
		// @0DA7: bipush 50 (0x32)
		// @0DA9: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @0DAC: astore #7
		// @0DAE: aload_0
		// @0DAF: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0DB2: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @0DB5: bipush 126 (0x7E)
		// @0DB7: aload #7
		// @0DB9: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0DBC: aload_0
		// @0DBD: getfield int game.C_100018_wk.field_101516_G
		// @0DC0: bipush 100 (0x64)
		// @0DC2: if_icmplt @102D
		// @0DC5: sipush 1000 (0x03E8)
		// @0DC8: aload_0
		// @0DC9: getfield int game.C_100018_wk.field_101516_G
		// @0DCC: if_icmple @102D
		// @0DCF: goto @0DD3
		// @0DD2: athrow
		// @0DD3: aload_0
		// @0DD4: getfield int game.C_100018_wk.field_101514_F
		// @0DD7: bipush -100 (0x9C)
		// @0DD9: aload_0
		// @0DDA: getfield int game.C_100018_wk.field_101516_G
		// @0DDD: iadd
		// @0DDE: aload_0
		// @0DDF: getfield int game.C_100018_wk.field_101514_F
		// @0DE2: ineg
		// @0DE3: aload_0
		// @0DE4: getfield int game.C_100018_wk.field_101538_R
		// @0DE7: iadd
		// @0DE8: imul
		// @0DE9: sipush 400 (0x0190)
		// @0DEC: idiv
		// @0DED: iadd
		// @0DEE: istore_2
		// @0DEF: ldc 80000 (0x13880)
		// @0DF1: iload_2
		// @0DF2: aload_0
		// @0DF3: getfield int game.C_100018_wk.field_101538_R
		// @0DF6: ineg
		// @0DF7: iadd
		// @0DF8: invokestatic java.lang.Math.abs(int)int
		// @0DFB: if_icmple @0E3A
		// @0DFE: aload_0
		// @0DFF: getfield int game.C_100018_wk.field_101519_C
		// @0E02: iconst_1
		// @0E03: if_icmpne @0E1D
		// @0E06: goto @0E0A
		// @0E09: athrow
		// @0E0A: iconst_1
		// @0E0B: aload_0
		// @0E0C: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0E0F: getfield int game.C_100294_ki.field_106987_m
		// @0E12: iand
		// @0E13: iconst_m1
		// @0E14: ixor
		// @0E15: iconst_m1
		// @0E16: if_icmpeq @0ECB
		// @0E19: goto @0E1D
		// @0E1C: athrow
		// @0E1D: aload_0
		// @0E1E: getfield int game.C_100018_wk.field_101519_C
		// @0E21: iconst_m1
		// @0E22: if_icmpne @0E3A
		// @0E25: goto @0E29
		// @0E28: athrow
		// @0E29: iconst_0
		// @0E2A: iconst_2
		// @0E2B: aload_0
		// @0E2C: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0E2F: getfield int game.C_100294_ki.field_106987_m
		// @0E32: iand
		// @0E33: if_icmpeq @0ECB
		// @0E36: goto @0E3A
		// @0E39: athrow
		// @0E3A: aload_0
		// @0E3B: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0E3E: getfield boolean game.C_100294_ki.field_106969_V
		// @0E41: ifeq @0E4C
		// @0E44: goto @0E48
		// @0E47: athrow
		// @0E48: goto @102D
		// @0E4B: athrow
		// @0E4C: aload_0
		// @0E4D: getfield int game.C_100018_wk.field_101514_F
		// @0E50: iconst_0
		// @0E51: aload_0
		// @0E52: getfield boolean game.C_100018_wk.field_101534_V
		// @0E55: aload_0
		// @0E56: getfield int game.C_100018_wk.field_101545_fb
		// @0E59: aload_0
		// @0E5A: getfield int game.C_100018_wk.field_101516_G
		// @0E5D: bipush 40 (0x28)
		// @0E5F: imul
		// @0E60: ineg
		// @0E61: iadd
		// @0E62: sipush 4000 (0x0FA0)
		// @0E65: iadd
		// @0E66: sipush -500 (0xFE0C)
		// @0E69: iconst_1
		// @0E6A: aload_0
		// @0E6B: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0E6E: getfield int game.C_100294_ki.field_106951_E
		// @0E71: iand
		// @0E72: sipush 1000 (0x03E8)
		// @0E75: imul
		// @0E76: iadd
		// @0E77: aload_0
		// @0E78: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0E7B: bipush -124 (0x84)
		// @0E7D: iload_2
		// @0E7E: iconst_4
		// @0E7F: bipush 50 (0x32)
		// @0E81: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @0E84: astore_3
		// @0E85: aload_0
		// @0E86: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0E89: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @0E8C: bipush 123 (0x7B)
		// @0E8E: aload_3
		// @0E8F: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0E92: aload_0
		// @0E93: getfield int game.C_100018_wk.field_101514_F
		// @0E96: iconst_0
		// @0E97: aload_0
		// @0E98: getfield boolean game.C_100018_wk.field_101534_V
		// @0E9B: aload_0
		// @0E9C: getfield int game.C_100018_wk.field_101545_fb
		// @0E9F: bipush 40 (0x28)
		// @0EA1: aload_0
		// @0EA2: getfield int game.C_100018_wk.field_101516_G
		// @0EA5: bipush 100 (0x64)
		// @0EA7: isub
		// @0EA8: imul
		// @0EA9: isub
		// @0EAA: iconst_0
		// @0EAB: aload_0
		// @0EAC: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0EAF: bipush -124 (0x84)
		// @0EB1: iload_2
		// @0EB2: iconst_1
		// @0EB3: bipush 100 (0x64)
		// @0EB5: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @0EB8: astore_3
		// @0EB9: aload_0
		// @0EBA: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0EBD: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @0EC0: bipush 125 (0x7D)
		// @0EC2: aload_3
		// @0EC3: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0EC6: iload #9
		// @0EC8: ifeq @102D
		// @0ECB: new game.C_100038_wa
		// @0ECE: dup
		// @0ECF: iconst_1
		// @0ED0: newarray int[]
		// @0ED2: dup
		// @0ED3: iconst_0
		// @0ED4: aload_0
		// @0ED5: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0ED8: getfield int game.C_100294_ki.field_106951_E
		// @0EDB: iastore
		// @0EDC: invokespecial game.C_100038_wa.<init>(int[])void
		// @0EDF: astore_3
		// @0EE0: iconst_0
		// @0EE1: istore #4
		// @0EE3: iload #4
		// @0EE5: iconst_m1
		// @0EE6: ixor
		// @0EE7: bipush -8 (0xF8)
		// @0EE9: if_icmple @0FDD
		// @0EEC: new game.C_100018_wk
		// @0EEF: dup
		// @0EF0: iload_2
		// @0EF1: sipush 4000 (0x0FA0)
		// @0EF4: aload_0
		// @0EF5: getfield int game.C_100018_wk.field_101516_G
		// @0EF8: bipush 40 (0x28)
		// @0EFA: imul
		// @0EFB: isub
		// @0EFC: aload_0
		// @0EFD: getfield int game.C_100018_wk.field_101545_fb
		// @0F00: iadd
		// @0F01: iconst_0
		// @0F02: iconst_0
		// @0F03: aload_0
		// @0F04: getfield int game.C_100018_wk.field_101524_H
		// @0F07: aload_0
		// @0F08: getfield int game.C_100018_wk.field_101515_cb
		// @0F0B: bipush 6 (0x06)
		// @0F0D: aload_0
		// @0F0E: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0F11: aload_0
		// @0F12: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @0F15: sipush 500 (0x01F4)
		// @0F18: aload_0
		// @0F19: getfield int game.C_100018_wk.field_101538_R
		// @0F1C: bipush 31 (0x1F)
		// @0F1E: invokespecial game.C_100018_wk.<init>(int, int, int, int, int, int, int, game.C_100294_ki, game.C_100314_lf, int, int, int)void
		// @0F21: astore #5
		// @0F23: aload #5
		// @0F25: aload_0
		// @0F26: getfield boolean game.C_100018_wk.field_101513_E
		// @0F29: putfield boolean game.C_100018_wk.field_101513_E
		// @0F2C: aload #5
		// @0F2E: bipush 31 (0x1F)
		// @0F30: putfield int game.C_100018_wk.field_101516_G
		// @0F33: aload #5
		// @0F35: aload_0
		// @0F36: getfield boolean game.C_100018_wk.field_101542_Z
		// @0F39: putfield boolean game.C_100018_wk.field_101542_Z
		// @0F3C: aload_0
		// @0F3D: getfield boolean game.C_100018_wk.field_101513_E
		// @0F40: iload #9
		// @0F42: ifne @0FE1
		// @0F45: ifne @0F4F
		// @0F48: goto @0F4C
		// @0F4B: athrow
		// @0F4C: goto @0F55
		// @0F4F: aload #5
		// @0F51: aconst_null
		// @0F52: putfield game.C_100314_lf[] game.C_100018_wk.field_101553_y
		// @0F55: aload #5
		// @0F57: aload_0
		// @0F58: getfield int game.C_100018_wk.field_101543_db
		// @0F5B: putfield int game.C_100018_wk.field_101543_db
		// @0F5E: aload #5
		// @0F60: dup
		// @0F61: getfield int game.C_100018_wk.field_101519_C
		// @0F64: iconst_3
		// @0F65: aload_0
		// @0F66: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0F69: getfield int game.C_100294_ki.field_106951_E
		// @0F6C: iload #4
		// @0F6E: sipush 8192 (0x2000)
		// @0F71: imul
		// @0F72: bipush 7 (0x07)
		// @0F74: idiv
		// @0F75: iadd
		// @0F76: invokestatic game.C_100284_nj.func_106768_a(int, int)int
		// @0F79: bipush 16 (0x10)
		// @0F7B: aload_3
		// @0F7C: bipush -120 (0x88)
		// @0F7E: invokestatic game.C_100294_ki.func_106900_a(int, game.C_100038_wa, byte)int
		// @0F81: imul
		// @0F82: ldc -864209075 (0xcc7d374d)
		// @0F84: ishr
		// @0F85: iadd
		// @0F86: putfield int game.C_100018_wk.field_101519_C
		// @0F89: aload #5
		// @0F8B: aload #5
		// @0F8D: getfield int game.C_100018_wk.field_101519_C
		// @0F90: invokestatic java.lang.Math.abs(int)int
		// @0F93: aload_0
		// @0F94: getfield int game.C_100018_wk.field_101519_C
		// @0F97: ineg
		// @0F98: imul
		// @0F99: putfield int game.C_100018_wk.field_101519_C
		// @0F9C: aload #5
		// @0F9E: dup
		// @0F9F: getfield int game.C_100018_wk.field_101527_J
		// @0FA2: aload_0
		// @0FA3: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0FA6: getfield int game.C_100294_ki.field_106951_E
		// @0FA9: iload #4
		// @0FAB: sipush 8192 (0x2000)
		// @0FAE: imul
		// @0FAF: bipush 7 (0x07)
		// @0FB1: idiv
		// @0FB2: iadd
		// @0FB3: iconst_0
		// @0FB4: invokestatic game.C_100273_mm.func_106673_a(int, boolean)int
		// @0FB7: bipush 16 (0x10)
		// @0FB9: aload_3
		// @0FBA: bipush -96 (0xA0)
		// @0FBC: invokestatic game.C_100294_ki.func_106900_a(int, game.C_100038_wa, byte)int
		// @0FBF: imul
		// @0FC0: ldc -291932979 (0xee9974cd)
		// @0FC2: ishr
		// @0FC3: iadd
		// @0FC4: putfield int game.C_100018_wk.field_101527_J
		// @0FC7: aload_0
		// @0FC8: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0FCB: getfield game.C_100202_qi game.C_100294_ki.field_106981_b
		// @0FCE: bipush 125 (0x7D)
		// @0FD0: aload #5
		// @0FD2: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0FD5: iinc #4 +1
		// @0FD8: iload #9
		// @0FDA: ifeq @0EE3
		// @0FDD: aload_0
		// @0FDE: getfield int game.C_100018_wk.field_101519_C
		// @0FE1: iconst_1
		// @0FE2: if_icmpeq @0FE9
		// @0FE5: goto @0FF6
		// @0FE8: athrow
		// @0FE9: aload_0
		// @0FEA: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0FED: dup
		// @0FEE: getfield int game.C_100294_ki.field_106987_m
		// @0FF1: iconst_1
		// @0FF2: ior
		// @0FF3: putfield int game.C_100294_ki.field_106987_m
		// @0FF6: iconst_m1
		// @0FF7: aload_0
		// @0FF8: getfield int game.C_100018_wk.field_101519_C
		// @0FFB: if_icmpne @100F
		// @0FFE: aload_0
		// @0FFF: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @1002: dup
		// @1003: getfield int game.C_100294_ki.field_106987_m
		// @1006: iconst_2
		// @1007: ior
		// @1008: putfield int game.C_100294_ki.field_106987_m
		// @100B: goto @100F
		// @100E: athrow
		// @100F: iconst_0
		// @1010: aload_0
		// @1011: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @1014: getfield int game.C_100294_ki.field_106961_H
		// @1017: if_icmpeq @101E
		// @101A: goto @1026
		// @101D: athrow
		// @101E: aload_0
		// @101F: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @1022: iconst_1
		// @1023: putfield int game.C_100294_ki.field_106961_H
		// @1026: aload_0
		// @1027: sipush 1000 (0x03E8)
		// @102A: putfield int game.C_100018_wk.field_101516_G
		// @102D: aload_0
		// @102E: dup
		// @102F: getfield int game.C_100018_wk.field_101516_G
		// @1032: iconst_1
		// @1033: iadd
		// @1034: putfield int game.C_100018_wk.field_101516_G
		// @1037: sipush -501 (0xFE0B)
		// @103A: aload_0
		// @103B: getfield int game.C_100018_wk.field_101516_G
		// @103E: iconst_m1
		// @103F: ixor
		// @1040: if_icmpne @1223
		// @1043: iconst_1
		// @1044: aload_0
		// @1045: getfield int game.C_100018_wk.field_101519_C
		// @1048: if_icmpne @1061
		// @104B: goto @104F
		// @104E: athrow
		// @104F: iconst_0
		// @1050: bipush 16 (0x10)
		// @1052: aload_0
		// @1053: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @1056: getfield int game.C_100294_ki.field_106987_m
		// @1059: iand
		// @105A: if_icmpeq @107F
		// @105D: goto @1061
		// @1060: athrow
		// @1061: iconst_m1
		// @1062: aload_0
		// @1063: getfield int game.C_100018_wk.field_101519_C
		// @1066: if_icmpne @1223
		// @1069: goto @106D
		// @106C: athrow
		// @106D: iconst_0
		// @106E: bipush 32 (0x20)
		// @1070: aload_0
		// @1071: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @1074: getfield int game.C_100294_ki.field_106987_m
		// @1077: iand
		// @1078: if_icmpne @1223
		// @107B: goto @107F
		// @107E: athrow
		// @107F: aload_0
		// @1080: dup
		// @1081: getfield int game.C_100018_wk.field_101545_fb
		// @1084: sipush 16000 (0x3E80)
		// @1087: isub
		// @1088: putfield int game.C_100018_wk.field_101545_fb
		// @108B: aload_0
		// @108C: aload_0
		// @108D: getfield int game.C_100018_wk.field_101538_R
		// @1090: putfield int game.C_100018_wk.field_101514_F
		// @1093: aload_0
		// @1094: sipush 5000 (0x1388)
		// @1097: sipush 200 (0x00C8)
		// @109A: iconst_0
		// @109B: sipush 1000 (0x03E8)
		// @109E: bipush -3 (0xFD)
		// @10A0: invokevirtual game.C_100018_wk.func_101510_a(int, int, int, int, int)void
		// @10A3: bipush -2 (0xFE)
		// @10A5: aload_0
		// @10A6: getfield int game.C_100018_wk.field_101519_C
		// @10A9: iconst_m1
		// @10AA: ixor
		// @10AB: if_icmpeq @1172
		// @10AE: goto @10B2
		// @10B1: athrow
		// @10B2: aload_0
		// @10B3: getfield int game.C_100018_wk.field_101519_C
		// @10B6: iconst_m1
		// @10B7: ixor
		// @10B8: ifne @121C
		// @10BB: goto @10BF
		// @10BE: athrow
		// @10BF: aload_0
		// @10C0: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @10C3: getfield int game.C_100294_ki.field_106987_m
		// @10C6: bipush 8 (0x08)
		// @10C8: iand
		// @10C9: iconst_m1
		// @10CA: ixor
		// @10CB: iconst_m1
		// @10CC: if_icmpne @10D7
		// @10CF: goto @10D3
		// @10D2: athrow
		// @10D3: goto @113F
		// @10D6: athrow
		// @10D7: aload_0
		// @10D8: dup
		// @10D9: getfield int game.C_100018_wk.field_101545_fb
		// @10DC: sipush 10000 (0x2710)
		// @10DF: iadd
		// @10E0: putfield int game.C_100018_wk.field_101545_fb
		// @10E3: aload_0
		// @10E4: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @10E7: dup
		// @10E8: getfield int game.C_100294_ki.field_106987_m
		// @10EB: bipush 32 (0x20)
		// @10ED: ior
		// @10EE: putfield int game.C_100294_ki.field_106987_m
		// @10F1: aload_0
		// @10F2: dup
		// @10F3: getfield int game.C_100018_wk.field_101514_F
		// @10F6: sipush 25000 (0x61A8)
		// @10F9: iadd
		// @10FA: putfield int game.C_100018_wk.field_101514_F
		// @10FD: aload_0
		// @10FE: sipush 5000 (0x1388)
		// @1101: sipush 400 (0x0190)
		// @1104: iconst_0
		// @1105: sipush 2000 (0x07D0)
		// @1108: bipush -3 (0xFD)
		// @110A: invokevirtual game.C_100018_wk.func_101510_a(int, int, int, int, int)void
		// @110D: aload_0
		// @110E: dup
		// @110F: getfield int game.C_100018_wk.field_101545_fb
		// @1112: sipush 30000 (0x7530)
		// @1115: isub
		// @1116: putfield int game.C_100018_wk.field_101545_fb
		// @1119: aload_0
		// @111A: dup
		// @111B: getfield int game.C_100018_wk.field_101514_F
		// @111E: ldc 50000 (0xc350)
		// @1120: isub
		// @1121: putfield int game.C_100018_wk.field_101514_F
		// @1124: aload_0
		// @1125: sipush 5000 (0x1388)
		// @1128: sipush 500 (0x01F4)
		// @112B: iconst_0
		// @112C: sipush 2000 (0x07D0)
		// @112F: bipush -3 (0xFD)
		// @1131: invokevirtual game.C_100018_wk.func_101510_a(int, int, int, int, int)void
		// @1134: aload_0
		// @1135: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @1138: iconst_1
		// @1139: sipush 256 (0x0100)
		// @113C: invokevirtual game.C_100294_ki.func_106905_d(int, int)void
		// @113F: aload_0
		// @1140: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @1143: getfield int game.C_100294_ki.field_106987_m
		// @1146: iconst_2
		// @1147: iand
		// @1148: iconst_m1
		// @1149: ixor
		// @114A: iconst_m1
		// @114B: if_icmpne @1152
		// @114E: goto @1160
		// @1151: athrow
		// @1152: aload_0
		// @1153: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @1156: dup
		// @1157: getfield int game.C_100294_ki.field_106987_m
		// @115A: bipush 8 (0x08)
		// @115C: ior
		// @115D: putfield int game.C_100294_ki.field_106987_m
		// @1160: aload_0
		// @1161: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @1164: dup
		// @1165: getfield int game.C_100294_ki.field_106987_m
		// @1168: iconst_2
		// @1169: ior
		// @116A: putfield int game.C_100294_ki.field_106987_m
		// @116D: iload #9
		// @116F: ifeq @121C
		// @1172: iconst_m1
		// @1173: aload_0
		// @1174: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @1177: getfield int game.C_100294_ki.field_106987_m
		// @117A: iconst_4
		// @117B: iand
		// @117C: iconst_m1
		// @117D: ixor
		// @117E: if_icmpeq @11F1
		// @1181: goto @1185
		// @1184: athrow
		// @1185: aload_0
		// @1186: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @1189: dup
		// @118A: getfield int game.C_100294_ki.field_106987_m
		// @118D: bipush 16 (0x10)
		// @118F: ior
		// @1190: putfield int game.C_100294_ki.field_106987_m
		// @1193: aload_0
		// @1194: dup
		// @1195: getfield int game.C_100018_wk.field_101545_fb
		// @1198: sipush 10000 (0x2710)
		// @119B: iadd
		// @119C: putfield int game.C_100018_wk.field_101545_fb
		// @119F: aload_0
		// @11A0: dup
		// @11A1: getfield int game.C_100018_wk.field_101514_F
		// @11A4: sipush 25000 (0x61A8)
		// @11A7: isub
		// @11A8: putfield int game.C_100018_wk.field_101514_F
		// @11AB: aload_0
		// @11AC: sipush 5000 (0x1388)
		// @11AF: sipush 400 (0x0190)
		// @11B2: iconst_0
		// @11B3: sipush 2000 (0x07D0)
		// @11B6: bipush -3 (0xFD)
		// @11B8: invokevirtual game.C_100018_wk.func_101510_a(int, int, int, int, int)void
		// @11BB: aload_0
		// @11BC: dup
		// @11BD: getfield int game.C_100018_wk.field_101514_F
		// @11C0: ldc 50000 (0xc350)
		// @11C2: iadd
		// @11C3: putfield int game.C_100018_wk.field_101514_F
		// @11C6: aload_0
		// @11C7: dup
		// @11C8: getfield int game.C_100018_wk.field_101545_fb
		// @11CB: sipush 30000 (0x7530)
		// @11CE: isub
		// @11CF: putfield int game.C_100018_wk.field_101545_fb
		// @11D2: aload_0
		// @11D3: sipush 5000 (0x1388)
		// @11D6: sipush 500 (0x01F4)
		// @11D9: iconst_0
		// @11DA: sipush 2000 (0x07D0)
		// @11DD: bipush -3 (0xFD)
		// @11DF: invokevirtual game.C_100018_wk.func_101510_a(int, int, int, int, int)void
		// @11E2: aload_0
		// @11E3: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @11E6: iconst_0
		// @11E7: sipush 256 (0x0100)
		// @11EA: invokevirtual game.C_100294_ki.func_106905_d(int, int)void
		// @11ED: goto @11F1
		// @11F0: athrow
		// @11F1: iconst_0
		// @11F2: iconst_1
		// @11F3: aload_0
		// @11F4: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @11F7: getfield int game.C_100294_ki.field_106987_m
		// @11FA: iand
		// @11FB: if_icmpeq @120F
		// @11FE: aload_0
		// @11FF: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @1202: dup
		// @1203: getfield int game.C_100294_ki.field_106987_m
		// @1206: iconst_4
		// @1207: ior
		// @1208: putfield int game.C_100294_ki.field_106987_m
		// @120B: goto @120F
		// @120E: athrow
		// @120F: aload_0
		// @1210: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @1213: dup
		// @1214: getfield int game.C_100294_ki.field_106987_m
		// @1217: iconst_1
		// @1218: ior
		// @1219: putfield int game.C_100294_ki.field_106987_m
		// @121C: aload_0
		// @121D: sipush 1000 (0x03E8)
		// @1220: putfield int game.C_100018_wk.field_101516_G
		// @1223: aload_0
		// @1224: getfield int game.C_100018_wk.field_101516_G
		// @1227: iconst_m1
		// @1228: ixor
		// @1229: sipush -1001 (0xFC17)
		// @122C: if_icmpgt @129C
		// @122F: aload_0
		// @1230: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @1233: ifnull @128F
		// @1236: goto @123A
		// @1239: athrow
		// @123A: iconst_m1
		// @123B: aload_0
		// @123C: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @123F: getfield int game.C_100294_ki.field_106993_w
		// @1242: if_icmpeq @124D
		// @1245: goto @1249
		// @1248: athrow
		// @1249: goto @125B
		// @124C: athrow
		// @124D: aload_0
		// @124E: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @1251: aload_0
		// @1252: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @1255: getfield int game.C_100314_lf.field_101347_Gb
		// @1258: putfield int game.C_100294_ki.field_106993_w
		// @125B: aload_0
		// @125C: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @125F: dup
		// @1260: getfield int game.C_100314_lf.field_101313_D
		// @1263: iconst_1
		// @1264: iadd
		// @1265: putfield int game.C_100314_lf.field_101313_D
		// @1268: aload_0
		// @1269: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @126C: bipush 50 (0x32)
		// @126E: putfield int game.C_100314_lf.field_101349_o
		// @1271: aload_0
		// @1272: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @1275: dup
		// @1276: getfield int game.C_100314_lf.field_101316_G
		// @1279: sipush 10000 (0x2710)
		// @127C: iadd
		// @127D: putfield int game.C_100314_lf.field_101316_G
		// @1280: aload_0
		// @1281: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @1284: dup
		// @1285: getfield int game.C_100314_lf.field_101348_n
		// @1288: sipush 10000 (0x2710)
		// @128B: iadd
		// @128C: putfield int game.C_100314_lf.field_101348_n
		// @128F: aload_0
		// @1290: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @1293: getfield game.C_100300_kc game.C_100294_ki.field_106950_D
		// @1296: bipush 126 (0x7E)
		// @1298: aload_0
		// @1299: invokevirtual game.C_100300_kc.func_107058_a(int, game.C_100325_id)void
		// @129C: return
		// @129D: iconst_0
		// @129E: istore_2
		// @129F: aload_0
		// @12A0: getfield int game.C_100018_wk.field_101515_cb
		// @12A3: iload_2
		// @12A4: if_icmplt @1DDD
		// @12A7: aload_0
		// @12A8: dup
		// @12A9: getfield int game.C_100018_wk.field_101545_fb
		// @12AC: aload_0
		// @12AD: getfield int game.C_100018_wk.field_101527_J
		// @12B0: iadd
		// @12B1: putfield int game.C_100018_wk.field_101545_fb
		// @12B4: aload_0
		// @12B5: dup
		// @12B6: getfield int game.C_100018_wk.field_101514_F
		// @12B9: aload_0
		// @12BA: getfield int game.C_100018_wk.field_101519_C
		// @12BD: iadd
		// @12BE: putfield int game.C_100018_wk.field_101514_F
		// @12C1: iconst_4
		// @12C2: aload_0
		// @12C3: getfield int game.C_100018_wk.field_101539_Y
		// @12C6: iload #9
		// @12C8: ifne @1F07
		// @12CB: if_icmpeq @12E2
		// @12CE: goto @12D2
		// @12D1: athrow
		// @12D2: aload_0
		// @12D3: getfield int game.C_100018_wk.field_101539_Y
		// @12D6: iconst_5
		// @12D7: if_icmpeq @12E2
		// @12DA: goto @12DE
		// @12DD: athrow
		// @12DE: goto @12F4
		// @12E1: athrow
		// @12E2: aload_0
		// @12E3: getfield int game.C_100018_wk.field_101545_fb
		// @12E6: ldc -180000 (0xfffd40e0)
		// @12E8: if_icmplt @12EF
		// @12EB: goto @12F4
		// @12EE: athrow
		// @12EF: aload_0
		// @12F0: iconst_1
		// @12F1: putfield boolean game.C_100018_wk.field_101523_O
		// @12F4: aload_0
		// @12F5: getfield int game.C_100018_wk.field_101539_Y
		// @12F8: iconst_4
		// @12F9: if_icmpeq @13D4
		// @12FC: iconst_2
		// @12FD: aload_0
		// @12FE: getfield int game.C_100018_wk.field_101539_Y
		// @1301: if_icmpeq @13C9
		// @1304: goto @1308
		// @1307: athrow
		// @1308: aload_0
		// @1309: getfield int game.C_100018_wk.field_101539_Y
		// @130C: bipush 7 (0x07)
		// @130E: if_icmpne @1328
		// @1311: goto @1315
		// @1314: athrow
		// @1315: aload_0
		// @1316: iload_2
		// @1317: bipush -128 (0x80)
		// @1319: invokespecial game.C_100018_wk.func_101494_d(int, int)boolean
		// @131C: ifne @1327
		// @131F: goto @1323
		// @1322: athrow
		// @1323: goto @13DE
		// @1326: athrow
		// @1327: return
		// @1328: aload_0
		// @1329: getfield int game.C_100018_wk.field_101539_Y
		// @132C: ifne @1342
		// @132F: aload_0
		// @1330: bipush 124 (0x7C)
		// @1332: iload_2
		// @1333: invokespecial game.C_100018_wk.func_101498_a(byte, int)boolean
		// @1336: ifne @1341
		// @1339: goto @133D
		// @133C: athrow
		// @133D: goto @13DE
		// @1340: athrow
		// @1341: return
		// @1342: aload_0
		// @1343: getfield int game.C_100018_wk.field_101539_Y
		// @1346: iconst_1
		// @1347: if_icmpeq @13BD
		// @134A: bipush -21 (0xEB)
		// @134C: aload_0
		// @134D: getfield int game.C_100018_wk.field_101539_Y
		// @1350: iconst_m1
		// @1351: ixor
		// @1352: if_icmpeq @13BD
		// @1355: goto @1359
		// @1358: athrow
		// @1359: aload_0
		// @135A: getfield int game.C_100018_wk.field_101539_Y
		// @135D: iconst_m1
		// @135E: ixor
		// @135F: bipush -9 (0xF7)
		// @1361: if_icmpeq @13B3
		// @1364: goto @1368
		// @1367: athrow
		// @1368: iconst_5
		// @1369: aload_0
		// @136A: getfield int game.C_100018_wk.field_101539_Y
		// @136D: if_icmpne @1383
		// @1370: goto @1374
		// @1373: athrow
		// @1374: aload_0
		// @1375: bipush 64 (0x40)
		// @1377: iload_2
		// @1378: invokespecial game.C_100018_wk.func_101511_c(int, int)boolean
		// @137B: ifeq @13DE
		// @137E: goto @1382
		// @1381: athrow
		// @1382: return
		// @1383: aload_0
		// @1384: getfield int game.C_100018_wk.field_101539_Y
		// @1387: bipush 6 (0x06)
		// @1389: if_icmpne @1396
		// @138C: aload_0
		// @138D: iload_2
		// @138E: iconst_3
		// @138F: invokespecial game.C_100018_wk.func_101506_b(int, int)boolean
		// @1392: ifeq @13DE
		// @1395: return
		// @1396: bipush -4 (0xFC)
		// @1398: aload_0
		// @1399: getfield int game.C_100018_wk.field_101539_Y
		// @139C: iconst_m1
		// @139D: ixor
		// @139E: if_icmpeq @13A5
		// @13A1: goto @13DE
		// @13A4: athrow
		// @13A5: aload_0
		// @13A6: iload_2
		// @13A7: iconst_0
		// @13A8: invokespecial game.C_100018_wk.func_101492_a(int, boolean)boolean
		// @13AB: ifne @13B2
		// @13AE: goto @13DE
		// @13B1: athrow
		// @13B2: return
		// @13B3: aload_0
		// @13B4: iconst_1
		// @13B5: iload_2
		// @13B6: invokespecial game.C_100018_wk.func_101509_a(boolean, int)boolean
		// @13B9: ifeq @13DE
		// @13BC: return
		// @13BD: aload_0
		// @13BE: iload_2
		// @13BF: sipush 1000 (0x03E8)
		// @13C2: invokespecial game.C_100018_wk.func_101501_a(int, int)boolean
		// @13C5: ifeq @13DE
		// @13C8: return
		// @13C9: aload_0
		// @13CA: iload_2
		// @13CB: bipush 101 (0x65)
		// @13CD: invokespecial game.C_100018_wk.func_101491_b(int, byte)boolean
		// @13D0: ifeq @13DE
		// @13D3: return
		// @13D4: aload_0
		// @13D5: iconst_1
		// @13D6: iload_2
		// @13D7: invokespecial game.C_100018_wk.func_101503_b(byte, int)boolean
		// @13DA: ifeq @13DE
		// @13DD: return
		// @13DE: aconst_null
		// @13DF: aload_0
		// @13E0: getfield game.C_100314_lf[] game.C_100018_wk.field_101553_y
		// @13E3: if_acmpeq @13F1
		// @13E6: aload_0
		// @13E7: iload_2
		// @13E8: bipush 8 (0x08)
		// @13EA: invokespecial game.C_100018_wk.func_101504_c(int, byte)void
		// @13ED: goto @13F1
		// @13F0: athrow
		// @13F1: aload_0
		// @13F2: getfield boolean game.C_100018_wk.field_101523_O
		// @13F5: ifne @1482
		// @13F8: aload_0
		// @13F9: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @13FC: aload_0
		// @13FD: getfield int game.C_100018_wk.field_101514_F
		// @1400: bipush -94 (0xA2)
		// @1402: invokevirtual game.C_100294_ki.func_106929_c(int, byte)boolean
		// @1405: ifeq @1456
		// @1408: goto @140C
		// @140B: athrow
		// @140C: aload_0
		// @140D: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @1410: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @1413: sipush -25357 (0x9CF3)
		// @1416: aload_0
		// @1417: getfield int game.C_100018_wk.field_101514_F
		// @141A: ldc_w -1264293532 (0xb4a46964)
		// @141D: ishr
		// @141E: invokevirtual game.C_100171_cn.func_105555_b(int, int)int
		// @1421: aload_0
		// @1422: getfield int game.C_100018_wk.field_101545_fb
		// @1425: ldc_w 189485412 (0xb4b5164)
		// @1428: ishr
		// @1429: ineg
		// @142A: if_icmple @1456
		// @142D: goto @1431
		// @1430: athrow
		// @1431: aload_0
		// @1432: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @1435: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @1438: ldc_w 830205956 (0x317bf004)
		// @143B: aload_0
		// @143C: getfield int game.C_100018_wk.field_101514_F
		// @143F: ldc_w -2020682012 (0x878ed6e4)
		// @1442: ishr
		// @1443: invokevirtual game.C_100171_cn.func_105563_a(int, int)int
		// @1446: aload_0
		// @1447: getfield int game.C_100018_wk.field_101545_fb
		// @144A: ldc_w 989053284 (0x3af3c164)
		// @144D: ishr
		// @144E: ineg
		// @144F: if_icmplt @1482
		// @1452: goto @1456
		// @1455: athrow
		// @1456: aload_0
		// @1457: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @145A: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @145D: bipush 120 (0x78)
		// @145F: aload_0
		// @1460: getfield int game.C_100018_wk.field_101514_F
		// @1463: ldc_w -602088284 (0xdc1cdca4)
		// @1466: ishr
		// @1467: invokevirtual game.C_100171_cn.func_105560_c(int, int)int
		// @146A: iconst_m1
		// @146B: ixor
		// @146C: aload_0
		// @146D: getfield int game.C_100018_wk.field_101545_fb
		// @1470: ldc_w 1912647748 (0x7200b044)
		// @1473: ishr
		// @1474: ineg
		// @1475: iconst_m1
		// @1476: ixor
		// @1477: if_icmplt @1482
		// @147A: goto @147E
		// @147D: athrow
		// @147E: goto @1D78
		// @1481: athrow
		// @1482: aconst_null
		// @1483: aload_0
		// @1484: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @1487: if_acmpeq @14E5
		// @148A: aload_0
		// @148B: getfield boolean game.C_100018_wk.field_101513_E
		// @148E: ifne @14E5
		// @1491: goto @1495
		// @1494: athrow
		// @1495: aload_0
		// @1496: getfield boolean game.C_100018_wk.field_101523_O
		// @1499: ifne @14E5
		// @149C: goto @14A0
		// @149F: athrow
		// @14A0: aload_0
		// @14A1: getfield int game.C_100018_wk.field_101516_G
		// @14A4: iconst_m1
		// @14A5: ixor
		// @14A6: aload_0
		// @14A7: getfield int game.C_100018_wk.field_101533_W
		// @14AA: iconst_m1
		// @14AB: ixor
		// @14AC: if_icmpgt @14E5
		// @14AF: goto @14B3
		// @14B2: athrow
		// @14B3: aload_0
		// @14B4: getfield game.C_100314_lf game.C_100018_wk.field_101529_K
		// @14B7: ifnull @14CA
		// @14BA: goto @14BE
		// @14BD: athrow
		// @14BE: iconst_3
		// @14BF: aload_0
		// @14C0: getfield int game.C_100018_wk.field_101539_Y
		// @14C3: if_icmpeq @14E5
		// @14C6: goto @14CA
		// @14C9: athrow
		// @14CA: aload_0
		// @14CB: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @14CE: sipush -200 (0xFF38)
		// @14D1: putfield int game.C_100314_lf.field_101406_Cb
		// @14D4: aload_0
		// @14D5: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @14D8: dup
		// @14D9: getfield int game.C_100314_lf.field_101411_jb
		// @14DC: iconst_1
		// @14DD: iadd
		// @14DE: putfield int game.C_100314_lf.field_101411_jb
		// @14E1: goto @14E5
		// @14E4: athrow
		// @14E5: iconst_m1
		// @14E6: aload_0
		// @14E7: getfield int game.C_100018_wk.field_101539_Y
		// @14EA: iconst_m1
		// @14EB: ixor
		// @14EC: if_icmpne @157F
		// @14EF: iconst_1
		// @14F0: aload_0
		// @14F1: getfield int game.C_100018_wk.field_101541_X
		// @14F4: if_icmpeq @1544
		// @14F7: goto @14FB
		// @14FA: athrow
		// @14FB: bipush -13 (0xF3)
		// @14FD: aload_0
		// @14FE: getfield int game.C_100018_wk.field_101541_X
		// @1501: iconst_m1
		// @1502: ixor
		// @1503: if_icmpne @151F
		// @1506: goto @150A
		// @1509: athrow
		// @150A: aload_0
		// @150B: bipush 64 (0x40)
		// @150D: bipush 20 (0x14)
		// @150F: iconst_1
		// @1510: iconst_3
		// @1511: iconst_0
		// @1512: iconst_0
		// @1513: invokespecial game.C_100018_wk.func_101505_a(int, int, int, int, boolean, boolean)void
		// @1516: iload #9
		// @1518: ifeq @1554
		// @151B: goto @151F
		// @151E: athrow
		// @151F: aload_0
		// @1520: getfield int game.C_100018_wk.field_101541_X
		// @1523: iconst_m1
		// @1524: ixor
		// @1525: bipush -27 (0xE5)
		// @1527: if_icmpeq @1532
		// @152A: goto @152E
		// @152D: athrow
		// @152E: goto @1554
		// @1531: athrow
		// @1532: aload_0
		// @1533: bipush 96 (0x60)
		// @1535: bipush 30 (0x1E)
		// @1537: iconst_1
		// @1538: bipush 6 (0x06)
		// @153A: iconst_0
		// @153B: iconst_0
		// @153C: invokespecial game.C_100018_wk.func_101505_a(int, int, int, int, boolean, boolean)void
		// @153F: iload #9
		// @1541: ifeq @1554
		// @1544: aload_0
		// @1545: bipush 64 (0x40)
		// @1547: bipush 10 (0x0A)
		// @1549: iconst_1
		// @154A: iconst_1
		// @154B: iconst_0
		// @154C: iconst_0
		// @154D: invokespecial game.C_100018_wk.func_101505_a(int, int, int, int, boolean, boolean)void
		// @1550: goto @1554
		// @1553: athrow
		// @1554: aload_0
		// @1555: getfield boolean game.C_100018_wk.field_101547_v
		// @1558: ifeq @1569
		// @155B: aload_0
		// @155C: iconst_1
		// @155D: putfield boolean game.C_100018_wk.field_101523_O
		// @1560: iload #9
		// @1562: ifeq @1D77
		// @1565: goto @1569
		// @1568: athrow
		// @1569: aload_0
		// @156A: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @156D: getfield game.C_100300_kc game.C_100294_ki.field_106950_D
		// @1570: bipush 127 (0x7F)
		// @1572: aload_0
		// @1573: invokevirtual game.C_100300_kc.func_107058_a(int, game.C_100325_id)void
		// @1576: iload #9
		// @1578: ifeq @1D77
		// @157B: goto @157F
		// @157E: athrow
		// @157F: aload_0
		// @1580: getfield int game.C_100018_wk.field_101539_Y
		// @1583: bipush 7 (0x07)
		// @1585: if_icmpeq @1D0F
		// @1588: goto @158C
		// @158B: athrow
		// @158C: bipush -5 (0xFB)
		// @158E: aload_0
		// @158F: getfield int game.C_100018_wk.field_101539_Y
		// @1592: iconst_m1
		// @1593: ixor
		// @1594: if_icmpne @174F
		// @1597: goto @159B
		// @159A: athrow
		// @159B: aload_0
		// @159C: getfield int game.C_100018_wk.field_101541_X
		// @159F: iconst_m1
		// @15A0: ixor
		// @15A1: bipush -11 (0xF5)
		// @15A3: if_icmpne @15BF
		// @15A6: goto @15AA
		// @15A9: athrow
		// @15AA: aload_0
		// @15AB: bipush 32 (0x20)
		// @15AD: bipush 10 (0x0A)
		// @15AF: iconst_2
		// @15B0: iconst_1
		// @15B1: iconst_0
		// @15B2: iconst_0
		// @15B3: invokespecial game.C_100018_wk.func_101505_a(int, int, int, int, boolean, boolean)void
		// @15B6: iload #9
		// @15B8: ifeq @1724
		// @15BB: goto @15BF
		// @15BE: athrow
		// @15BF: bipush 21 (0x15)
		// @15C1: aload_0
		// @15C2: getfield int game.C_100018_wk.field_101541_X
		// @15C5: if_icmpeq @1713
		// @15C8: goto @15CC
		// @15CB: athrow
		// @15CC: aload_0
		// @15CD: getfield boolean game.C_100018_wk.field_101523_O
		// @15D0: ifne @169D
		// @15D3: goto @15D7
		// @15D6: athrow
		// @15D7: aload_0
		// @15D8: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @15DB: getfield boolean game.C_100294_ki.field_106969_V
		// @15DE: ifne @1635
		// @15E1: goto @15E5
		// @15E4: athrow
		// @15E5: aload_0
		// @15E6: getfield boolean game.C_100018_wk.field_101513_E
		// @15E9: ifne @1635
		// @15EC: goto @15F0
		// @15EF: athrow
		// @15F0: aload_0
		// @15F1: getfield int game.C_100018_wk.field_101514_F
		// @15F4: iconst_0
		// @15F5: aload_0
		// @15F6: getfield boolean game.C_100018_wk.field_101534_V
		// @15F9: aload_0
		// @15FA: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @15FD: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @1600: bipush 94 (0x5E)
		// @1602: aload_0
		// @1603: getfield int game.C_100018_wk.field_101514_F
		// @1606: ldc_w -147942076 (0xf72e9544)
		// @1609: ishr
		// @160A: invokevirtual game.C_100171_cn.func_105560_c(int, int)int
		// @160D: ldc_w 431992228 (0x19bfada4)
		// @1610: ishl
		// @1611: ineg
		// @1612: bipush -8 (0xF8)
		// @1614: iadd
		// @1615: iconst_0
		// @1616: aload_0
		// @1617: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @161A: bipush -124 (0x84)
		// @161C: aload_0
		// @161D: getfield int game.C_100018_wk.field_101514_F
		// @1620: iconst_2
		// @1621: sipush 250 (0x00FA)
		// @1624: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @1627: astore_3
		// @1628: aload_0
		// @1629: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @162C: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @162F: bipush 124 (0x7C)
		// @1631: aload_3
		// @1632: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @1635: aload_0
		// @1636: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @1639: getfield boolean game.C_100294_ki.field_106969_V
		// @163C: ifne @1724
		// @163F: aload_0
		// @1640: getfield boolean game.C_100018_wk.field_101513_E
		// @1643: ifne @1724
		// @1646: goto @164A
		// @1649: athrow
		// @164A: aload_0
		// @164B: getfield int game.C_100018_wk.field_101514_F
		// @164E: aload_0
		// @164F: getfield int game.C_100018_wk.field_101519_C
		// @1652: ineg
		// @1653: iconst_2
		// @1654: idiv
		// @1655: aload_0
		// @1656: getfield boolean game.C_100018_wk.field_101534_V
		// @1659: aload_0
		// @165A: getfield int game.C_100018_wk.field_101545_fb
		// @165D: aload_0
		// @165E: getfield int game.C_100018_wk.field_101527_J
		// @1661: ineg
		// @1662: iconst_2
		// @1663: idiv
		// @1664: aload_0
		// @1665: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @1668: bipush -124 (0x84)
		// @166A: aload_0
		// @166B: getfield int game.C_100018_wk.field_101514_F
		// @166E: bipush 13 (0x0D)
		// @1670: aload_0
		// @1671: getfield int game.C_100018_wk.field_101541_X
		// @1674: iconst_m1
		// @1675: ixor
		// @1676: bipush -18 (0xEE)
		// @1678: if_icmpeq @1685
		// @167B: goto @167F
		// @167E: athrow
		// @167F: bipush 20 (0x14)
		// @1681: goto @1687
		// @1684: athrow
		// @1685: bipush 100 (0x64)
		// @1687: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @168A: astore_3
		// @168B: aload_0
		// @168C: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @168F: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @1692: bipush 127 (0x7F)
		// @1694: aload_3
		// @1695: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @1698: iload #9
		// @169A: ifeq @1724
		// @169D: aload_0
		// @169E: bipush 32 (0x20)
		// @16A0: bipush 10 (0x0A)
		// @16A2: iconst_1
		// @16A3: iconst_1
		// @16A4: iconst_0
		// @16A5: iconst_0
		// @16A6: invokespecial game.C_100018_wk.func_101505_a(int, int, int, int, boolean, boolean)void
		// @16A9: aload_0
		// @16AA: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @16AD: getfield boolean game.C_100294_ki.field_106969_V
		// @16B0: ifne @1724
		// @16B3: goto @16B7
		// @16B6: athrow
		// @16B7: aload_0
		// @16B8: getfield boolean game.C_100018_wk.field_101513_E
		// @16BB: ifne @1724
		// @16BE: goto @16C2
		// @16C1: athrow
		// @16C2: aload_0
		// @16C3: getfield int game.C_100018_wk.field_101514_F
		// @16C6: aload_0
		// @16C7: getfield int game.C_100018_wk.field_101519_C
		// @16CA: ineg
		// @16CB: iconst_2
		// @16CC: idiv
		// @16CD: aload_0
		// @16CE: getfield boolean game.C_100018_wk.field_101534_V
		// @16D1: aload_0
		// @16D2: getfield int game.C_100018_wk.field_101545_fb
		// @16D5: aload_0
		// @16D6: getfield int game.C_100018_wk.field_101527_J
		// @16D9: ineg
		// @16DA: iconst_2
		// @16DB: idiv
		// @16DC: aload_0
		// @16DD: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @16E0: bipush -124 (0x84)
		// @16E2: aload_0
		// @16E3: getfield int game.C_100018_wk.field_101514_F
		// @16E6: bipush 13 (0x0D)
		// @16E8: aload_0
		// @16E9: getfield int game.C_100018_wk.field_101541_X
		// @16EC: bipush 17 (0x11)
		// @16EE: if_icmpne @16FB
		// @16F1: goto @16F5
		// @16F4: athrow
		// @16F5: bipush 100 (0x64)
		// @16F7: goto @16FD
		// @16FA: athrow
		// @16FB: bipush 20 (0x14)
		// @16FD: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @1700: astore_3
		// @1701: aload_0
		// @1702: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @1705: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @1708: bipush 124 (0x7C)
		// @170A: aload_3
		// @170B: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @170E: iload #9
		// @1710: ifeq @1724
		// @1713: aload_0
		// @1714: sipush 1500 (0x05DC)
		// @1717: bipush 20 (0x14)
		// @1719: iconst_2
		// @171A: iconst_3
		// @171B: iconst_0
		// @171C: iconst_0
		// @171D: invokespecial game.C_100018_wk.func_101505_a(int, int, int, int, boolean, boolean)void
		// @1720: goto @1724
		// @1723: athrow
		// @1724: aload_0
		// @1725: getfield boolean game.C_100018_wk.field_101547_v
		// @1728: ifeq @1739
		// @172B: aload_0
		// @172C: iconst_1
		// @172D: putfield boolean game.C_100018_wk.field_101523_O
		// @1730: iload #9
		// @1732: ifeq @1D77
		// @1735: goto @1739
		// @1738: athrow
		// @1739: aload_0
		// @173A: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @173D: getfield game.C_100300_kc game.C_100294_ki.field_106950_D
		// @1740: bipush 127 (0x7F)
		// @1742: aload_0
		// @1743: invokevirtual game.C_100300_kc.func_107058_a(int, game.C_100325_id)void
		// @1746: iload #9
		// @1748: ifeq @1D77
		// @174B: goto @174F
		// @174E: athrow
		// @174F: bipush -2 (0xFE)
		// @1751: aload_0
		// @1752: getfield int game.C_100018_wk.field_101539_Y
		// @1755: iconst_m1
		// @1756: ixor
		// @1757: if_icmpeq @1B7F
		// @175A: goto @175E
		// @175D: athrow
		// @175E: aload_0
		// @175F: getfield int game.C_100018_wk.field_101539_Y
		// @1762: bipush 20 (0x14)
		// @1764: if_icmpeq @1B7F
		// @1767: goto @176B
		// @176A: athrow
		// @176B: bipush 8 (0x08)
		// @176D: aload_0
		// @176E: getfield int game.C_100018_wk.field_101539_Y
		// @1771: if_icmpeq @1B11
		// @1774: goto @1778
		// @1777: athrow
		// @1778: aload_0
		// @1779: getfield int game.C_100018_wk.field_101539_Y
		// @177C: iconst_m1
		// @177D: ixor
		// @177E: bipush -7 (0xF9)
		// @1780: if_icmpeq @1A7A
		// @1783: goto @1787
		// @1786: athrow
		// @1787: aload_0
		// @1788: getfield int game.C_100018_wk.field_101539_Y
		// @178B: iconst_m1
		// @178C: ixor
		// @178D: bipush -3 (0xFD)
		// @178F: if_icmpeq @18DA
		// @1792: goto @1796
		// @1795: athrow
		// @1796: aload_0
		// @1797: getfield int game.C_100018_wk.field_101539_Y
		// @179A: iconst_3
		// @179B: if_icmpne @1813
		// @179E: goto @17A2
		// @17A1: athrow
		// @17A2: bipush 6 (0x06)
		// @17A4: aload_0
		// @17A5: getfield int game.C_100018_wk.field_101541_X
		// @17A8: if_icmpne @17C6
		// @17AB: goto @17AF
		// @17AE: athrow
		// @17AF: aload_0
		// @17B0: sipush 300 (0x012C)
		// @17B3: bipush 25 (0x19)
		// @17B5: iconst_0
		// @17B6: bipush 25 (0x19)
		// @17B8: bipush -3 (0xFD)
		// @17BA: invokevirtual game.C_100018_wk.func_101510_a(int, int, int, int, int)void
		// @17BD: iload #9
		// @17BF: ifeq @17E8
		// @17C2: goto @17C6
		// @17C5: athrow
		// @17C6: bipush -35 (0xDD)
		// @17C8: aload_0
		// @17C9: getfield int game.C_100018_wk.field_101541_X
		// @17CC: iconst_m1
		// @17CD: ixor
		// @17CE: if_icmpne @17E8
		// @17D1: goto @17D5
		// @17D4: athrow
		// @17D5: aload_0
		// @17D6: sipush 500 (0x01F4)
		// @17D9: bipush 75 (0x4B)
		// @17DB: iconst_0
		// @17DC: sipush 200 (0x00C8)
		// @17DF: bipush -3 (0xFD)
		// @17E1: invokevirtual game.C_100018_wk.func_101510_a(int, int, int, int, int)void
		// @17E4: goto @17E8
		// @17E7: athrow
		// @17E8: aload_0
		// @17E9: getfield boolean game.C_100018_wk.field_101547_v
		// @17EC: ifeq @17FD
		// @17EF: aload_0
		// @17F0: iconst_1
		// @17F1: putfield boolean game.C_100018_wk.field_101523_O
		// @17F4: iload #9
		// @17F6: ifeq @1D77
		// @17F9: goto @17FD
		// @17FC: athrow
		// @17FD: aload_0
		// @17FE: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @1801: getfield game.C_100300_kc game.C_100294_ki.field_106950_D
		// @1804: bipush 127 (0x7F)
		// @1806: aload_0
		// @1807: invokevirtual game.C_100300_kc.func_107058_a(int, game.C_100325_id)void
		// @180A: iload #9
		// @180C: ifeq @1D77
		// @180F: goto @1813
		// @1812: athrow
		// @1813: aload_0
		// @1814: getfield int game.C_100018_wk.field_101539_Y
		// @1817: iconst_5
		// @1818: if_icmpne @18AB
		// @181B: goto @181F
		// @181E: athrow
		// @181F: aload_0
		// @1820: getfield int game.C_100018_wk.field_101541_X
		// @1823: iconst_3
		// @1824: if_icmpne @183F
		// @1827: goto @182B
		// @182A: athrow
		// @182B: aload_0
		// @182C: bipush 50 (0x32)
		// @182E: iconst_5
		// @182F: iconst_0
		// @1830: iconst_2
		// @1831: iconst_0
		// @1832: iconst_0
		// @1833: invokespecial game.C_100018_wk.func_101505_a(int, int, int, int, boolean, boolean)void
		// @1836: iload #9
		// @1838: ifeq @1880
		// @183B: goto @183F
		// @183E: athrow
		// @183F: bipush 16 (0x10)
		// @1841: aload_0
		// @1842: getfield int game.C_100018_wk.field_101541_X
		// @1845: if_icmpne @1860
		// @1848: goto @184C
		// @184B: athrow
		// @184C: aload_0
		// @184D: bipush 100 (0x64)
		// @184F: iconst_5
		// @1850: iconst_0
		// @1851: iconst_4
		// @1852: iconst_0
		// @1853: iconst_0
		// @1854: invokespecial game.C_100018_wk.func_101505_a(int, int, int, int, boolean, boolean)void
		// @1857: iload #9
		// @1859: ifeq @1880
		// @185C: goto @1860
		// @185F: athrow
		// @1860: aload_0
		// @1861: getfield int game.C_100018_wk.field_101541_X
		// @1864: iconst_m1
		// @1865: ixor
		// @1866: bipush -30 (0xE2)
		// @1868: if_icmpne @1880
		// @186B: goto @186F
		// @186E: athrow
		// @186F: aload_0
		// @1870: sipush 150 (0x0096)
		// @1873: iconst_5
		// @1874: iconst_0
		// @1875: bipush 8 (0x08)
		// @1877: iconst_0
		// @1878: iconst_0
		// @1879: invokespecial game.C_100018_wk.func_101505_a(int, int, int, int, boolean, boolean)void
		// @187C: goto @1880
		// @187F: athrow
		// @1880: aload_0
		// @1881: getfield boolean game.C_100018_wk.field_101547_v
		// @1884: ifeq @1895
		// @1887: aload_0
		// @1888: iconst_1
		// @1889: putfield boolean game.C_100018_wk.field_101523_O
		// @188C: iload #9
		// @188E: ifeq @1D77
		// @1891: goto @1895
		// @1894: athrow
		// @1895: aload_0
		// @1896: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @1899: getfield game.C_100300_kc game.C_100294_ki.field_106950_D
		// @189C: bipush 127 (0x7F)
		// @189E: aload_0
		// @189F: invokevirtual game.C_100300_kc.func_107058_a(int, game.C_100325_id)void
		// @18A2: iload #9
		// @18A4: ifeq @1D77
		// @18A7: goto @18AB
		// @18AA: athrow
		// @18AB: aload_0
		// @18AC: getfield boolean game.C_100018_wk.field_101547_v
		// @18AF: ifeq @18C4
		// @18B2: goto @18B6
		// @18B5: athrow
		// @18B6: aload_0
		// @18B7: iconst_1
		// @18B8: putfield boolean game.C_100018_wk.field_101523_O
		// @18BB: iload #9
		// @18BD: ifeq @1D77
		// @18C0: goto @18C4
		// @18C3: athrow
		// @18C4: aload_0
		// @18C5: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @18C8: getfield game.C_100300_kc game.C_100294_ki.field_106950_D
		// @18CB: bipush 125 (0x7D)
		// @18CD: aload_0
		// @18CE: invokevirtual game.C_100300_kc.func_107058_a(int, game.C_100325_id)void
		// @18D1: iload #9
		// @18D3: ifeq @1D77
		// @18D6: goto @18DA
		// @18D9: athrow
		// @18DA: bipush -10 (0xF6)
		// @18DC: aload_0
		// @18DD: getfield int game.C_100018_wk.field_101541_X
		// @18E0: iconst_m1
		// @18E1: ixor
		// @18E2: if_icmpeq @1A36
		// @18E5: goto @18E9
		// @18E8: athrow
		// @18E9: bipush -8 (0xF8)
		// @18EB: aload_0
		// @18EC: getfield int game.C_100018_wk.field_101541_X
		// @18EF: iconst_m1
		// @18F0: ixor
		// @18F1: if_icmpeq @1A1F
		// @18F4: goto @18F8
		// @18F7: athrow
		// @18F8: aload_0
		// @18F9: getfield int game.C_100018_wk.field_101541_X
		// @18FC: iconst_m1
		// @18FD: ixor
		// @18FE: bipush -9 (0xF7)
		// @1900: if_icmpne @191F
		// @1903: goto @1907
		// @1906: athrow
		// @1907: aload_0
		// @1908: sipush 1000 (0x03E8)
		// @190B: bipush 25 (0x19)
		// @190D: bipush 8 (0x08)
		// @190F: bipush 50 (0x32)
		// @1911: bipush -3 (0xFD)
		// @1913: invokevirtual game.C_100018_wk.func_101510_a(int, int, int, int, int)void
		// @1916: iload #9
		// @1918: ifeq @1A4F
		// @191B: goto @191F
		// @191E: athrow
		// @191F: bipush 20 (0x14)
		// @1921: aload_0
		// @1922: getfield int game.C_100018_wk.field_101541_X
		// @1925: if_icmpne @1945
		// @1928: goto @192C
		// @192B: athrow
		// @192C: aload_0
		// @192D: sipush 1500 (0x05DC)
		// @1930: sipush 150 (0x0096)
		// @1933: iconst_0
		// @1934: sipush 200 (0x00C8)
		// @1937: bipush -3 (0xFD)
		// @1939: invokevirtual game.C_100018_wk.func_101510_a(int, int, int, int, int)void
		// @193C: iload #9
		// @193E: ifeq @1A4F
		// @1941: goto @1945
		// @1944: athrow
		// @1945: aload_0
		// @1946: getfield int game.C_100018_wk.field_101541_X
		// @1949: iconst_m1
		// @194A: ixor
		// @194B: bipush -34 (0xDE)
		// @194D: if_icmpne @196D
		// @1950: goto @1954
		// @1953: athrow
		// @1954: aload_0
		// @1955: sipush 2500 (0x09C4)
		// @1958: sipush 200 (0x00C8)
		// @195B: iconst_0
		// @195C: sipush 400 (0x0190)
		// @195F: bipush -3 (0xFD)
		// @1961: invokevirtual game.C_100018_wk.func_101510_a(int, int, int, int, int)void
		// @1964: iload #9
		// @1966: ifeq @1A4F
		// @1969: goto @196D
		// @196C: athrow
		// @196D: bipush -20 (0xEC)
		// @196F: aload_0
		// @1970: getfield int game.C_100018_wk.field_101541_X
		// @1973: iconst_m1
		// @1974: ixor
		// @1975: if_icmpeq @1A08
		// @1978: goto @197C
		// @197B: athrow
		// @197C: aload_0
		// @197D: getfield int game.C_100018_wk.field_101541_X
		// @1980: iconst_m1
		// @1981: ixor
		// @1982: bipush -33 (0xDF)
		// @1984: if_icmpeq @198F
		// @1987: goto @198B
		// @198A: athrow
		// @198B: goto @1A4F
		// @198E: athrow
		// @198F: aload_0
		// @1990: getfield boolean game.C_100018_wk.field_101547_v
		// @1993: ifne @19B0
		// @1996: aload_0
		// @1997: getfield boolean game.C_100018_wk.field_101513_E
		// @199A: ifeq @19A5
		// @199D: goto @19A1
		// @19A0: athrow
		// @19A1: goto @19B0
		// @19A4: athrow
		// @19A5: aload_0
		// @19A6: getfield int game.C_100018_wk.field_101514_F
		// @19A9: bipush 104 (0x68)
		// @19AB: iconst_1
		// @19AC: invokestatic game.C_100143_bl.func_105098_a(int, int, boolean)game.C_100179_ch
		// @19AF: pop
		// @19B0: aload_0
		// @19B1: sipush 1500 (0x05DC)
		// @19B4: bipush 50 (0x32)
		// @19B6: iconst_0
		// @19B7: sipush 250 (0x00FA)
		// @19BA: bipush -3 (0xFD)
		// @19BC: invokevirtual game.C_100018_wk.func_101510_a(int, int, int, int, int)void
		// @19BF: aload_0
		// @19C0: sipush 5000 (0x1388)
		// @19C3: sipush 500 (0x01F4)
		// @19C6: iconst_2
		// @19C7: sipush 5000 (0x1388)
		// @19CA: bipush -3 (0xFD)
		// @19CC: invokevirtual game.C_100018_wk.func_101510_a(int, int, int, int, int)void
		// @19CF: aload_0
		// @19D0: sipush 2500 (0x09C4)
		// @19D3: sipush 500 (0x01F4)
		// @19D6: iconst_3
		// @19D7: sipush 5000 (0x1388)
		// @19DA: bipush -3 (0xFD)
		// @19DC: invokevirtual game.C_100018_wk.func_101510_a(int, int, int, int, int)void
		// @19DF: aload_0
		// @19E0: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @19E3: getfield int game.C_100294_ki.field_106961_H
		// @19E6: iconst_m1
		// @19E7: ixor
		// @19E8: iconst_m1
		// @19E9: if_icmpne @1A4F
		// @19EC: aload_0
		// @19ED: getfield boolean game.C_100018_wk.field_101513_E
		// @19F0: ifeq @19FB
		// @19F3: goto @19F7
		// @19F6: athrow
		// @19F7: goto @1A4F
		// @19FA: athrow
		// @19FB: aload_0
		// @19FC: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @19FF: iconst_1
		// @1A00: putfield int game.C_100294_ki.field_106961_H
		// @1A03: iload #9
		// @1A05: ifeq @1A4F
		// @1A08: aload_0
		// @1A09: sipush 256 (0x0100)
		// @1A0C: bipush 10 (0x0A)
		// @1A0E: iconst_0
		// @1A0F: bipush 10 (0x0A)
		// @1A11: bipush -3 (0xFD)
		// @1A13: invokevirtual game.C_100018_wk.func_101510_a(int, int, int, int, int)void
		// @1A16: iload #9
		// @1A18: ifeq @1A4F
		// @1A1B: goto @1A1F
		// @1A1E: athrow
		// @1A1F: aload_0
		// @1A20: sipush 1000 (0x03E8)
		// @1A23: bipush 50 (0x32)
		// @1A25: iconst_0
		// @1A26: bipush 25 (0x19)
		// @1A28: bipush -3 (0xFD)
		// @1A2A: invokevirtual game.C_100018_wk.func_101510_a(int, int, int, int, int)void
		// @1A2D: iload #9
		// @1A2F: ifeq @1A4F
		// @1A32: goto @1A36
		// @1A35: athrow
		// @1A36: aload_0
		// @1A37: iconst_1
		// @1A38: putfield boolean game.C_100018_wk.field_101525_eb
		// @1A3B: aload_0
		// @1A3C: sipush 1000 (0x03E8)
		// @1A3F: sipush 1500 (0x05DC)
		// @1A42: iconst_2
		// @1A43: sipush 500 (0x01F4)
		// @1A46: bipush -3 (0xFD)
		// @1A48: invokevirtual game.C_100018_wk.func_101510_a(int, int, int, int, int)void
		// @1A4B: goto @1A4F
		// @1A4E: athrow
		// @1A4F: aload_0
		// @1A50: getfield boolean game.C_100018_wk.field_101547_v
		// @1A53: ifeq @1A64
		// @1A56: aload_0
		// @1A57: iconst_1
		// @1A58: putfield boolean game.C_100018_wk.field_101523_O
		// @1A5B: iload #9
		// @1A5D: ifeq @1D77
		// @1A60: goto @1A64
		// @1A63: athrow
		// @1A64: aload_0
		// @1A65: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @1A68: getfield game.C_100300_kc game.C_100294_ki.field_106950_D
		// @1A6B: bipush 127 (0x7F)
		// @1A6D: aload_0
		// @1A6E: invokevirtual game.C_100300_kc.func_107058_a(int, game.C_100325_id)void
		// @1A71: iload #9
		// @1A73: ifeq @1D77
		// @1A76: goto @1A7A
		// @1A79: athrow
		// @1A7A: aload_0
		// @1A7B: getfield int game.C_100018_wk.field_101541_X
		// @1A7E: iconst_5
		// @1A7F: if_icmpne @1A9D
		// @1A82: goto @1A86
		// @1A85: athrow
		// @1A86: aload_0
		// @1A87: sipush 500 (0x01F4)
		// @1A8A: bipush 50 (0x32)
		// @1A8C: iconst_3
		// @1A8D: bipush 25 (0x19)
		// @1A8F: bipush -3 (0xFD)
		// @1A91: invokevirtual game.C_100018_wk.func_101510_a(int, int, int, int, int)void
		// @1A94: iload #9
		// @1A96: ifeq @1AE6
		// @1A99: goto @1A9D
		// @1A9C: athrow
		// @1A9D: bipush -19 (0xED)
		// @1A9F: aload_0
		// @1AA0: getfield int game.C_100018_wk.field_101541_X
		// @1AA3: iconst_m1
		// @1AA4: ixor
		// @1AA5: if_icmpne @1AC4
		// @1AA8: goto @1AAC
		// @1AAB: athrow
		// @1AAC: aload_0
		// @1AAD: sipush 750 (0x02EE)
		// @1AB0: bipush 75 (0x4B)
		// @1AB2: iconst_3
		// @1AB3: sipush 200 (0x00C8)
		// @1AB6: bipush -3 (0xFD)
		// @1AB8: invokevirtual game.C_100018_wk.func_101510_a(int, int, int, int, int)void
		// @1ABB: iload #9
		// @1ABD: ifeq @1AE6
		// @1AC0: goto @1AC4
		// @1AC3: athrow
		// @1AC4: aload_0
		// @1AC5: getfield int game.C_100018_wk.field_101541_X
		// @1AC8: iconst_m1
		// @1AC9: ixor
		// @1ACA: bipush -32 (0xE0)
		// @1ACC: if_icmpeq @1AD7
		// @1ACF: goto @1AD3
		// @1AD2: athrow
		// @1AD3: goto @1AE6
		// @1AD6: athrow
		// @1AD7: aload_0
		// @1AD8: sipush 1000 (0x03E8)
		// @1ADB: bipush 100 (0x64)
		// @1ADD: iconst_3
		// @1ADE: sipush 500 (0x01F4)
		// @1AE1: bipush -3 (0xFD)
		// @1AE3: invokevirtual game.C_100018_wk.func_101510_a(int, int, int, int, int)void
		// @1AE6: aload_0
		// @1AE7: getfield boolean game.C_100018_wk.field_101547_v
		// @1AEA: ifne @1B03
		// @1AED: aload_0
		// @1AEE: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @1AF1: getfield game.C_100300_kc game.C_100294_ki.field_106950_D
		// @1AF4: bipush 127 (0x7F)
		// @1AF6: aload_0
		// @1AF7: invokevirtual game.C_100300_kc.func_107058_a(int, game.C_100325_id)void
		// @1AFA: iload #9
		// @1AFC: ifeq @1D77
		// @1AFF: goto @1B03
		// @1B02: athrow
		// @1B03: aload_0
		// @1B04: iconst_1
		// @1B05: putfield boolean game.C_100018_wk.field_101523_O
		// @1B08: iload #9
		// @1B0A: ifeq @1D77
		// @1B0D: goto @1B11
		// @1B10: athrow
		// @1B11: aload_0
		// @1B12: getfield int game.C_100018_wk.field_101541_X
		// @1B15: iconst_2
		// @1B16: if_icmpeq @1B43
		// @1B19: goto @1B1D
		// @1B1C: athrow
		// @1B1D: aload_0
		// @1B1E: getfield int game.C_100018_wk.field_101541_X
		// @1B21: iconst_m1
		// @1B22: ixor
		// @1B23: bipush -20 (0xEC)
		// @1B25: if_icmpeq @1B30
		// @1B28: goto @1B2C
		// @1B2B: athrow
		// @1B2C: goto @1B54
		// @1B2F: athrow
		// @1B30: aload_0
		// @1B31: sipush 500 (0x01F4)
		// @1B34: bipush 25 (0x19)
		// @1B36: iconst_0
		// @1B37: bipush 15 (0x0F)
		// @1B39: bipush -3 (0xFD)
		// @1B3B: invokevirtual game.C_100018_wk.func_101510_a(int, int, int, int, int)void
		// @1B3E: iload #9
		// @1B40: ifeq @1B54
		// @1B43: aload_0
		// @1B44: sipush 256 (0x0100)
		// @1B47: bipush 50 (0x32)
		// @1B49: iconst_4
		// @1B4A: iconst_5
		// @1B4B: bipush -3 (0xFD)
		// @1B4D: invokevirtual game.C_100018_wk.func_101510_a(int, int, int, int, int)void
		// @1B50: goto @1B54
		// @1B53: athrow
		// @1B54: aload_0
		// @1B55: getfield boolean game.C_100018_wk.field_101547_v
		// @1B58: ifeq @1B69
		// @1B5B: aload_0
		// @1B5C: iconst_1
		// @1B5D: putfield boolean game.C_100018_wk.field_101523_O
		// @1B60: iload #9
		// @1B62: ifeq @1D77
		// @1B65: goto @1B69
		// @1B68: athrow
		// @1B69: aload_0
		// @1B6A: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @1B6D: getfield game.C_100300_kc game.C_100294_ki.field_106950_D
		// @1B70: bipush 127 (0x7F)
		// @1B72: aload_0
		// @1B73: invokevirtual game.C_100300_kc.func_107058_a(int, game.C_100325_id)void
		// @1B76: iload #9
		// @1B78: ifeq @1D77
		// @1B7B: goto @1B7F
		// @1B7E: athrow
		// @1B7F: bipush -3 (0xFD)
		// @1B81: aload_0
		// @1B82: getfield int game.C_100018_wk.field_101541_X
		// @1B85: iconst_m1
		// @1B86: ixor
		// @1B87: if_icmpeq @1CD5
		// @1B8A: goto @1B8E
		// @1B8D: athrow
		// @1B8E: bipush 13 (0x0D)
		// @1B90: aload_0
		// @1B91: getfield int game.C_100018_wk.field_101541_X
		// @1B94: if_icmpne @1BB1
		// @1B97: goto @1B9B
		// @1B9A: athrow
		// @1B9B: aload_0
		// @1B9C: bipush 32 (0x20)
		// @1B9E: bipush 50 (0x32)
		// @1BA0: iconst_0
		// @1BA1: bipush 10 (0x0A)
		// @1BA3: bipush -3 (0xFD)
		// @1BA5: invokevirtual game.C_100018_wk.func_101510_a(int, int, int, int, int)void
		// @1BA8: iload #9
		// @1BAA: ifeq @1CE4
		// @1BAD: goto @1BB1
		// @1BB0: athrow
		// @1BB1: bipush 15 (0x0F)
		// @1BB3: aload_0
		// @1BB4: getfield int game.C_100018_wk.field_101541_X
		// @1BB7: if_icmpeq @1C86
		// @1BBA: goto @1BBE
		// @1BBD: athrow
		// @1BBE: bipush 14 (0x0E)
		// @1BC0: aload_0
		// @1BC1: getfield int game.C_100018_wk.field_101541_X
		// @1BC4: if_icmpeq @1C42
		// @1BC7: goto @1BCB
		// @1BCA: athrow
		// @1BCB: bipush 28 (0x1C)
		// @1BCD: aload_0
		// @1BCE: getfield int game.C_100018_wk.field_101541_X
		// @1BD1: if_icmpeq @1BFE
		// @1BD4: goto @1BD8
		// @1BD7: athrow
		// @1BD8: bipush -28 (0xE4)
		// @1BDA: aload_0
		// @1BDB: getfield int game.C_100018_wk.field_101541_X
		// @1BDE: iconst_m1
		// @1BDF: ixor
		// @1BE0: if_icmpeq @1BEB
		// @1BE3: goto @1BE7
		// @1BE6: athrow
		// @1BE7: goto @1CE4
		// @1BEA: athrow
		// @1BEB: aload_0
		// @1BEC: sipush 512 (0x0200)
		// @1BEF: bipush 50 (0x32)
		// @1BF1: iconst_0
		// @1BF2: bipush 20 (0x14)
		// @1BF4: bipush -3 (0xFD)
		// @1BF6: invokevirtual game.C_100018_wk.func_101510_a(int, int, int, int, int)void
		// @1BF9: iload #9
		// @1BFB: ifeq @1CE4
		// @1BFE: aload_0
		// @1BFF: getfield int game.C_100018_wk.field_101516_G
		// @1C02: bipush 20 (0x14)
		// @1C04: if_icmplt @1C22
		// @1C07: goto @1C0B
		// @1C0A: athrow
		// @1C0B: aload_0
		// @1C0C: sipush 1500 (0x05DC)
		// @1C0F: bipush 50 (0x32)
		// @1C11: iconst_0
		// @1C12: bipush 40 (0x28)
		// @1C14: bipush -3 (0xFD)
		// @1C16: invokevirtual game.C_100018_wk.func_101510_a(int, int, int, int, int)void
		// @1C19: iload #9
		// @1C1B: ifeq @1CE4
		// @1C1E: goto @1C22
		// @1C21: athrow
		// @1C22: aload_0
		// @1C23: dup
		// @1C24: getfield int game.C_100018_wk.field_101546_w
		// @1C27: iconst_2
		// @1C28: idiv
		// @1C29: putfield int game.C_100018_wk.field_101546_w
		// @1C2C: aload_0
		// @1C2D: bipush 100 (0x64)
		// @1C2F: bipush 50 (0x32)
		// @1C31: iconst_0
		// @1C32: bipush 10 (0x0A)
		// @1C34: bipush -3 (0xFD)
		// @1C36: invokevirtual game.C_100018_wk.func_101510_a(int, int, int, int, int)void
		// @1C39: iload #9
		// @1C3B: ifeq @1CE4
		// @1C3E: goto @1C42
		// @1C41: athrow
		// @1C42: bipush 20 (0x14)
		// @1C44: aload_0
		// @1C45: getfield int game.C_100018_wk.field_101516_G
		// @1C48: if_icmpgt @1C66
		// @1C4B: goto @1C4F
		// @1C4E: athrow
		// @1C4F: aload_0
		// @1C50: sipush 750 (0x02EE)
		// @1C53: bipush 25 (0x19)
		// @1C55: iconst_0
		// @1C56: bipush 20 (0x14)
		// @1C58: bipush -3 (0xFD)
		// @1C5A: invokevirtual game.C_100018_wk.func_101510_a(int, int, int, int, int)void
		// @1C5D: iload #9
		// @1C5F: ifeq @1CE4
		// @1C62: goto @1C66
		// @1C65: athrow
		// @1C66: aload_0
		// @1C67: dup
		// @1C68: getfield int game.C_100018_wk.field_101546_w
		// @1C6B: iconst_2
		// @1C6C: idiv
		// @1C6D: putfield int game.C_100018_wk.field_101546_w
		// @1C70: aload_0
		// @1C71: bipush 32 (0x20)
		// @1C73: bipush 25 (0x19)
		// @1C75: iconst_0
		// @1C76: bipush 10 (0x0A)
		// @1C78: bipush -3 (0xFD)
		// @1C7A: invokevirtual game.C_100018_wk.func_101510_a(int, int, int, int, int)void
		// @1C7D: iload #9
		// @1C7F: ifeq @1CE4
		// @1C82: goto @1C86
		// @1C85: athrow
		// @1C86: aload_0
		// @1C87: getfield int game.C_100018_wk.field_101516_G
		// @1C8A: aload_0
		// @1C8B: getfield int game.C_100018_wk.field_101533_W
		// @1C8E: if_icmplt @1CC0
		// @1C91: goto @1C95
		// @1C94: athrow
		// @1C95: aload_0
		// @1C96: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @1C99: ifnull @1CC0
		// @1C9C: goto @1CA0
		// @1C9F: athrow
		// @1CA0: aload_0
		// @1CA1: getfield boolean game.C_100018_wk.field_101530_U
		// @1CA4: ifeq @1CC0
		// @1CA7: goto @1CAB
		// @1CAA: athrow
		// @1CAB: aload_0
		// @1CAC: bipush 32 (0x20)
		// @1CAE: bipush 25 (0x19)
		// @1CB0: iconst_0
		// @1CB1: iconst_5
		// @1CB2: iconst_0
		// @1CB3: iconst_0
		// @1CB4: invokespecial game.C_100018_wk.func_101505_a(int, int, int, int, boolean, boolean)void
		// @1CB7: iload #9
		// @1CB9: ifeq @1CE4
		// @1CBC: goto @1CC0
		// @1CBF: athrow
		// @1CC0: aload_0
		// @1CC1: bipush 32 (0x20)
		// @1CC3: bipush 25 (0x19)
		// @1CC5: iconst_0
		// @1CC6: iconst_5
		// @1CC7: iconst_0
		// @1CC8: iconst_0
		// @1CC9: invokespecial game.C_100018_wk.func_101505_a(int, int, int, int, boolean, boolean)void
		// @1CCC: iload #9
		// @1CCE: ifeq @1CE4
		// @1CD1: goto @1CD5
		// @1CD4: athrow
		// @1CD5: aload_0
		// @1CD6: bipush 32 (0x20)
		// @1CD8: iconst_5
		// @1CD9: iconst_1
		// @1CDA: iconst_1
		// @1CDB: bipush -3 (0xFD)
		// @1CDD: invokevirtual game.C_100018_wk.func_101510_a(int, int, int, int, int)void
		// @1CE0: goto @1CE4
		// @1CE3: athrow
		// @1CE4: aload_0
		// @1CE5: getfield boolean game.C_100018_wk.field_101547_v
		// @1CE8: ifeq @1CF9
		// @1CEB: aload_0
		// @1CEC: iconst_1
		// @1CED: putfield boolean game.C_100018_wk.field_101523_O
		// @1CF0: iload #9
		// @1CF2: ifeq @1D77
		// @1CF5: goto @1CF9
		// @1CF8: athrow
		// @1CF9: aload_0
		// @1CFA: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @1CFD: getfield game.C_100300_kc game.C_100294_ki.field_106950_D
		// @1D00: bipush 126 (0x7E)
		// @1D02: aload_0
		// @1D03: invokevirtual game.C_100300_kc.func_107058_a(int, game.C_100325_id)void
		// @1D06: iload #9
		// @1D08: ifeq @1D77
		// @1D0B: goto @1D0F
		// @1D0E: athrow
		// @1D0F: iconst_0
		// @1D10: aload_0
		// @1D11: getfield int game.C_100018_wk.field_101541_X
		// @1D14: if_icmpeq @1D40
		// @1D17: goto @1D1B
		// @1D1A: athrow
		// @1D1B: bipush 11 (0x0B)
		// @1D1D: aload_0
		// @1D1E: getfield int game.C_100018_wk.field_101541_X
		// @1D21: if_icmpne @1D51
		// @1D24: goto @1D28
		// @1D27: athrow
		// @1D28: aload_0
		// @1D29: sipush 750 (0x02EE)
		// @1D2C: sipush 500 (0x01F4)
		// @1D2F: iconst_2
		// @1D30: bipush 10 (0x0A)
		// @1D32: bipush -3 (0xFD)
		// @1D34: invokevirtual game.C_100018_wk.func_101510_a(int, int, int, int, int)void
		// @1D37: iload #9
		// @1D39: ifeq @1D51
		// @1D3C: goto @1D40
		// @1D3F: athrow
		// @1D40: aload_0
		// @1D41: sipush 500 (0x01F4)
		// @1D44: bipush 100 (0x64)
		// @1D46: iconst_2
		// @1D47: iconst_2
		// @1D48: bipush -3 (0xFD)
		// @1D4A: invokevirtual game.C_100018_wk.func_101510_a(int, int, int, int, int)void
		// @1D4D: goto @1D51
		// @1D50: athrow
		// @1D51: aload_0
		// @1D52: getfield boolean game.C_100018_wk.field_101547_v
		// @1D55: ifne @1D6E
		// @1D58: aload_0
		// @1D59: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @1D5C: getfield game.C_100300_kc game.C_100294_ki.field_106950_D
		// @1D5F: bipush 124 (0x7C)
		// @1D61: aload_0
		// @1D62: invokevirtual game.C_100300_kc.func_107058_a(int, game.C_100325_id)void
		// @1D65: iload #9
		// @1D67: ifeq @1D77
		// @1D6A: goto @1D6E
		// @1D6D: athrow
		// @1D6E: aload_0
		// @1D6F: iconst_1
		// @1D70: putfield boolean game.C_100018_wk.field_101523_O
		// @1D73: goto @1D77
		// @1D76: athrow
		// @1D77: return
		// @1D78: aload_0
		// @1D79: getfield boolean game.C_100018_wk.field_101523_O
		// @1D7C: ifeq @1D8A
		// @1D7F: aload_0
		// @1D80: getfield boolean game.C_100018_wk.field_101547_v
		// @1D83: ifne @1DDD
		// @1D86: goto @1D8A
		// @1D89: athrow
		// @1D8A: aload_0
		// @1D8B: getfield boolean game.C_100018_wk.field_101523_O
		// @1D8E: ifne @1D99
		// @1D91: goto @1D95
		// @1D94: athrow
		// @1D95: goto @1DD1
		// @1D98: athrow
		// @1D99: aconst_null
		// @1D9A: aload_0
		// @1D9B: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @1D9E: if_acmpeq @1DC7
		// @1DA1: aload_0
		// @1DA2: getfield int game.C_100018_wk.field_101539_Y
		// @1DA5: iconst_m1
		// @1DA6: ixor
		// @1DA7: bipush -3 (0xFD)
		// @1DA9: if_icmpne @1DC7
		// @1DAC: goto @1DB0
		// @1DAF: athrow
		// @1DB0: aload_0
		// @1DB1: getfield boolean game.C_100018_wk.field_101528_gb
		// @1DB4: ifeq @1DBF
		// @1DB7: goto @1DBB
		// @1DBA: athrow
		// @1DBB: goto @1DC7
		// @1DBE: athrow
		// @1DBF: aload_0
		// @1DC0: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @1DC3: iconst_0
		// @1DC4: putfield int game.C_100314_lf.field_101351_m
		// @1DC7: aload_0
		// @1DC8: iload_2
		// @1DC9: putfield int game.C_100018_wk.field_101515_cb
		// @1DCC: iload #9
		// @1DCE: ifeq @1DDD
		// @1DD1: iinc #2 +1
		// @1DD4: iload #9
		// @1DD6: ifeq @129F
		// @1DD9: goto @1DDD
		// @1DDC: athrow
		// @1DDD: aload_0
		// @1DDE: getfield boolean game.C_100018_wk.field_101525_eb
		// @1DE1: ifeq @1EF6
		// @1DE4: aload_0
		// @1DE5: getfield boolean game.C_100018_wk.field_101513_E
		// @1DE8: ifne @1EF6
		// @1DEB: goto @1DEF
		// @1DEE: athrow
		// @1DEF: new game.C_100019_wl
		// @1DF2: dup
		// @1DF3: aload_0
		// @1DF4: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @1DF7: getfield game.C_100202_qi game.C_100294_ki.field_106981_b
		// @1DFA: invokespecial game.C_100019_wl.<init>(game.C_100202_qi)void
		// @1DFD: astore_2
		// @1DFE: aload_2
		// @1DFF: bipush -128 (0x80)
		// @1E01: invokevirtual game.C_100019_wl.func_103827_a(byte)game.C_100158_da
		// @1E04: checkcast game.C_100018_wk
		// @1E07: astore_3
		// @1E08: aconst_null
		// @1E09: aload_3
		// @1E0A: if_acmpeq @1EF6
		// @1E0D: aload_0
		// @1E0E: getfield int game.C_100018_wk.field_101514_F
		// @1E11: aload_3
		// @1E12: getfield int game.C_100018_wk.field_101514_F
		// @1E15: ineg
		// @1E16: iadd
		// @1E17: istore #4
		// @1E19: aload_3
		// @1E1A: getfield int game.C_100018_wk.field_101545_fb
		// @1E1D: ineg
		// @1E1E: aload_0
		// @1E1F: getfield int game.C_100018_wk.field_101545_fb
		// @1E22: iadd
		// @1E23: istore #5
		// @1E25: aload_3
		// @1E26: getfield int game.C_100018_wk.field_101539_Y
		// @1E29: iconst_m1
		// @1E2A: ixor
		// @1E2B: bipush -3 (0xFD)
		// @1E2D: iload #9
		// @1E2F: ifne @1F07
		// @1E32: if_icmpeq @1E57
		// @1E35: goto @1E39
		// @1E38: athrow
		// @1E39: bipush -4 (0xFC)
		// @1E3B: aload_3
		// @1E3C: getfield int game.C_100018_wk.field_101539_Y
		// @1E3F: iconst_m1
		// @1E40: ixor
		// @1E41: if_icmpeq @1E57
		// @1E44: goto @1E48
		// @1E47: athrow
		// @1E48: aload_3
		// @1E49: getfield int game.C_100018_wk.field_101539_Y
		// @1E4C: iconst_m1
		// @1E4D: ixor
		// @1E4E: bipush -21 (0xEB)
		// @1E50: if_icmpne @1EE6
		// @1E53: goto @1E57
		// @1E56: athrow
		// @1E57: aload_3
		// @1E58: getfield int game.C_100018_wk.field_101541_X
		// @1E5B: iconst_m1
		// @1E5C: ixor
		// @1E5D: bipush -33 (0xDF)
		// @1E5F: if_icmpeq @1EE6
		// @1E62: goto @1E66
		// @1E65: athrow
		// @1E66: sipush -257 (0xFEFF)
		// @1E69: iload #4
		// @1E6B: invokestatic java.lang.Math.abs(int)int
		// @1E6E: iconst_m1
		// @1E6F: ixor
		// @1E70: if_icmpgt @1EE6
		// @1E73: goto @1E77
		// @1E76: athrow
		// @1E77: iload #5
		// @1E79: invokestatic java.lang.Math.abs(int)int
		// @1E7C: iconst_m1
		// @1E7D: ixor
		// @1E7E: sipush -257 (0xFEFF)
		// @1E81: if_icmplt @1EE6
		// @1E84: goto @1E88
		// @1E87: athrow
		// @1E88: bipush 20 (0x14)
		// @1E8A: aload_3
		// @1E8B: getfield int game.C_100018_wk.field_101539_Y
		// @1E8E: if_icmpne @1E99
		// @1E91: goto @1E95
		// @1E94: athrow
		// @1E95: goto @1E9E
		// @1E98: athrow
		// @1E99: aload_3
		// @1E9A: iconst_1
		// @1E9B: putfield boolean game.C_100018_wk.field_101523_O
		// @1E9E: aload_0
		// @1E9F: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @1EA2: ifnull @1EC5
		// @1EA5: aload_0
		// @1EA6: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @1EA9: aload_3
		// @1EAA: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @1EAD: if_acmpeq @1EC5
		// @1EB0: goto @1EB4
		// @1EB3: athrow
		// @1EB4: aload_0
		// @1EB5: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @1EB8: dup
		// @1EB9: getfield int game.C_100314_lf.field_101340_mb
		// @1EBC: iconst_1
		// @1EBD: iadd
		// @1EBE: putfield int game.C_100314_lf.field_101340_mb
		// @1EC1: goto @1EC5
		// @1EC4: athrow
		// @1EC5: bipush -8 (0xF8)
		// @1EC7: aload_0
		// @1EC8: getfield int game.C_100018_wk.field_101539_Y
		// @1ECB: iconst_m1
		// @1ECC: ixor
		// @1ECD: if_icmpeq @1ED4
		// @1ED0: goto @1ED9
		// @1ED3: athrow
		// @1ED4: aload_0
		// @1ED5: iconst_1
		// @1ED6: putfield boolean game.C_100018_wk.field_101518_B
		// @1ED9: aload_3
		// @1EDA: iconst_1
		// @1EDB: putfield boolean game.C_100018_wk.field_101522_N
		// @1EDE: aload_3
		// @1EDF: aload_0
		// @1EE0: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @1EE3: putfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @1EE6: aload_2
		// @1EE7: sipush -30820 (0x879C)
		// @1EEA: invokevirtual game.C_100019_wl.func_103836_b(int)game.C_100158_da
		// @1EED: checkcast game.C_100018_wk
		// @1EF0: astore_3
		// @1EF1: iload #9
		// @1EF3: ifeq @1E08
		// @1EF6: aload_0
		// @1EF7: dup
		// @1EF8: getfield int game.C_100018_wk.field_101516_G
		// @1EFB: iconst_1
		// @1EFC: iadd
		// @1EFD: putfield int game.C_100018_wk.field_101516_G
		// @1F00: aload_0
		// @1F01: getfield int game.C_100018_wk.field_101515_cb
		// @1F04: iconst_m1
		// @1F05: ixor
		// @1F06: iconst_m1
		// @1F07: if_icmpge @1F18
		// @1F0A: aload_0
		// @1F0B: dup
		// @1F0C: getfield int game.C_100018_wk.field_101515_cb
		// @1F0F: iconst_1
		// @1F10: isub
		// @1F11: putfield int game.C_100018_wk.field_101515_cb
		// @1F14: goto @1F18
		// @1F17: athrow
		// @1F18: aload_0
		// @1F19: getfield boolean game.C_100018_wk.field_101544_hb
		// @1F1C: ifne @1F23
		// @1F1F: goto @1F51
		// @1F22: athrow
		// @1F23: aload_0
		// @1F24: dup
		// @1F25: getfield int game.C_100018_wk.field_101527_J
		// @1F28: aload_0
		// @1F29: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @1F2C: getfield int game.C_100294_ki.field_106964_J
		// @1F2F: iadd
		// @1F30: putfield int game.C_100018_wk.field_101527_J
		// @1F33: iconst_4
		// @1F34: aload_0
		// @1F35: getfield int game.C_100018_wk.field_101539_Y
		// @1F38: if_icmpne @1F51
		// @1F3B: aload_0
		// @1F3C: dup
		// @1F3D: getfield int game.C_100018_wk.field_101527_J
		// @1F40: aload_0
		// @1F41: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @1F44: getfield int game.C_100294_ki.field_106964_J
		// @1F47: iconst_3
		// @1F48: imul
		// @1F49: iadd
		// @1F4A: putfield int game.C_100018_wk.field_101527_J
		// @1F4D: goto @1F51
		// @1F50: athrow
		// @1F51: bipush 127 (0x7F)
		// @1F53: aload_0
		// @1F54: getfield int game.C_100018_wk.field_101514_F
		// @1F57: iconst_m1
		// @1F58: ixor
		// @1F59: if_icmplt @1F80
		// @1F5C: aload_0
		// @1F5D: getfield int game.C_100018_wk.field_101514_F
		// @1F60: iconst_m1
		// @1F61: ixor
		// @1F62: sipush 128 (0x0080)
		// @1F65: aload_0
		// @1F66: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @1F69: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @1F6C: sipush 23156 (0x5A74)
		// @1F6F: invokevirtual game.C_100171_cn.func_105552_b(int)int
		// @1F72: ldc_w -1520453436 (0xa55fb8c4)
		// @1F75: ishl
		// @1F76: iadd
		// @1F77: iconst_m1
		// @1F78: ixor
		// @1F79: if_icmpge @1FAA
		// @1F7C: goto @1F80
		// @1F7F: athrow
		// @1F80: aload_0
		// @1F81: getfield boolean game.C_100018_wk.field_101547_v
		// @1F84: ifeq @1F99
		// @1F87: goto @1F8B
		// @1F8A: athrow
		// @1F8B: aload_0
		// @1F8C: iconst_1
		// @1F8D: putfield boolean game.C_100018_wk.field_101523_O
		// @1F90: iload #9
		// @1F92: ifeq @1FAA
		// @1F95: goto @1F99
		// @1F98: athrow
		// @1F99: aload_0
		// @1F9A: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @1F9D: getfield game.C_100300_kc game.C_100294_ki.field_106950_D
		// @1FA0: bipush 125 (0x7D)
		// @1FA2: aload_0
		// @1FA3: invokevirtual game.C_100300_kc.func_107058_a(int, game.C_100325_id)void
		// @1FA6: goto @1FAA
		// @1FA9: athrow
		// @1FAA: goto @1FCE
		// @1FAD: astore_2
		// @1FAE: aload_2
		// @1FAF: new java.lang.StringBuilder
		// @1FB2: dup
		// @1FB3: invokespecial java.lang.StringBuilder.<init>()void
		// @1FB6: getstatic java.lang.String[] game.C_100018_wk.field_101532_ib
		// @1FB9: iconst_1
		// @1FBA: aaload
		// @1FBB: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1FBE: iload_1
		// @1FBF: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1FC2: bipush 41 (0x29)
		// @1FC4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1FC7: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @1FCA: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @1FCD: athrow
		// @1FCE: return
	}
	
	private final boolean func_101503_b(byte arg0, int arg1)
	{
		// @000: aload_0
		// @001: iconst_1
		// @002: invokespecial game.C_100018_wk.func_101500_b(boolean)void
		// @005: aload_0
		// @006: getfield int game.C_100018_wk.field_101541_X
		// @009: iconst_m1
		// @00A: ixor
		// @00B: bipush -11 (0xF5)
		// @00D: if_icmpeq @16E
		// @010: bipush 21 (0x15)
		// @012: aload_0
		// @013: getfield int game.C_100018_wk.field_101541_X
		// @016: if_icmpeq @16E
		// @019: goto @01D
		// @01C: athrow
		// @01D: aload_0
		// @01E: iconst_0
		// @01F: putfield boolean game.C_100018_wk.field_101544_hb
		// @022: aload_0
		// @023: bipush 32 (0x20)
		// @025: putfield int game.C_100018_wk.field_101515_cb
		// @028: aload_0
		// @029: getfield int game.C_100018_wk.field_101541_X
		// @02C: bipush 35 (0x23)
		// @02E: if_icmpne @0D5
		// @031: goto @035
		// @034: athrow
		// @035: aload_0
		// @036: getfield boolean game.C_100018_wk.field_101513_E
		// @039: ifne @0D5
		// @03C: goto @040
		// @03F: athrow
		// @040: aload_0
		// @041: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @044: getfield boolean game.C_100294_ki.field_106969_V
		// @047: ifeq @052
		// @04A: goto @04E
		// @04D: athrow
		// @04E: goto @0D5
		// @051: athrow
		// @052: iconst_m1
		// @053: iconst_3
		// @054: aload_0
		// @055: getfield int game.C_100018_wk.field_101516_G
		// @058: iload_2
		// @059: iadd
		// @05A: iand
		// @05B: iconst_m1
		// @05C: ixor
		// @05D: if_icmpne @0D5
		// @060: aload_0
		// @061: getfield int game.C_100018_wk.field_101524_H
		// @064: bipush 7 (0x07)
		// @066: iand
		// @067: ifeq @072
		// @06A: goto @06E
		// @06D: athrow
		// @06E: goto @0D5
		// @071: athrow
		// @072: aload_0
		// @073: getfield int game.C_100018_wk.field_101524_H
		// @076: bipush -50 (0xCE)
		// @078: iadd
		// @079: invokestatic java.lang.Math.abs(int)int
		// @07C: bipush 10 (0x0A)
		// @07E: idiv
		// @07F: ineg
		// @080: iconst_5
		// @081: iadd
		// @082: istore_3
		// @083: aload_0
		// @084: getfield int game.C_100018_wk.field_101514_F
		// @087: aload_0
		// @088: getfield int game.C_100018_wk.field_101527_J
		// @08B: ineg
		// @08C: i2d
		// @08D: invokestatic java.lang.Math.random()double
		// @090: iload_3
		// @091: iconst_2
		// @092: imul
		// @093: i2d
		// @094: dmul
		// @095: iload_3
		// @096: i2d
		// @097: dsub
		// @098: dmul
		// @099: d2i
		// @09A: aload_0
		// @09B: getfield boolean game.C_100018_wk.field_101534_V
		// @09E: aload_0
		// @09F: getfield int game.C_100018_wk.field_101545_fb
		// @0A2: aload_0
		// @0A3: getfield int game.C_100018_wk.field_101519_C
		// @0A6: i2d
		// @0A7: invokestatic java.lang.Math.random()double
		// @0AA: iconst_2
		// @0AB: iload_3
		// @0AC: imul
		// @0AD: i2d
		// @0AE: dmul
		// @0AF: iload_3
		// @0B0: i2d
		// @0B1: dsub
		// @0B2: dmul
		// @0B3: d2i
		// @0B4: aload_0
		// @0B5: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0B8: bipush -124 (0x84)
		// @0BA: aload_0
		// @0BB: getfield int game.C_100018_wk.field_101514_F
		// @0BE: bipush 14 (0x0E)
		// @0C0: bipush 8 (0x08)
		// @0C2: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @0C5: astore #4
		// @0C7: aload_0
		// @0C8: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0CB: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @0CE: bipush 127 (0x7F)
		// @0D0: aload #4
		// @0D2: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0D5: bipush -36 (0xDC)
		// @0D7: aload_0
		// @0D8: getfield int game.C_100018_wk.field_101541_X
		// @0DB: iconst_m1
		// @0DC: ixor
		// @0DD: if_icmpne @119
		// @0E0: aload_0
		// @0E1: getfield boolean game.C_100018_wk.field_101513_E
		// @0E4: ifne @119
		// @0E7: goto @0EB
		// @0EA: athrow
		// @0EB: aload_0
		// @0EC: getfield int game.C_100018_wk.field_101516_G
		// @0EF: bipush 8 (0x08)
		// @0F1: if_icmpne @119
		// @0F4: goto @0F8
		// @0F7: athrow
		// @0F8: aload_0
		// @0F9: getfield int game.C_100018_wk.field_101524_H
		// @0FC: bipush 7 (0x07)
		// @0FE: iand
		// @0FF: ifne @10A
		// @102: goto @106
		// @105: athrow
		// @106: goto @119
		// @109: athrow
		// @10A: aload_0
		// @10B: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @10E: getfield game.C_100300_kc game.C_100294_ki.field_106950_D
		// @111: bipush 125 (0x7D)
		// @113: aload_0
		// @114: invokevirtual game.C_100300_kc.func_107058_a(int, game.C_100325_id)void
		// @117: iconst_1
		// @118: ireturn
		// @119: aload_0
		// @11A: getfield int game.C_100018_wk.field_101541_X
		// @11D: iconst_m1
		// @11E: ixor
		// @11F: bipush -31 (0xE1)
		// @121: if_icmpne @174
		// @124: bipush -5 (0xFB)
		// @126: aload_0
		// @127: getfield int game.C_100018_wk.field_101516_G
		// @12A: iconst_m1
		// @12B: ixor
		// @12C: if_icmpne @174
		// @12F: goto @133
		// @132: athrow
		// @133: iconst_0
		// @134: iconst_3
		// @135: aload_0
		// @136: getfield int game.C_100018_wk.field_101524_H
		// @139: iand
		// @13A: if_icmpeq @174
		// @13D: goto @141
		// @140: athrow
		// @141: aload_0
		// @142: getfield boolean game.C_100018_wk.field_101547_v
		// @145: ifeq @15B
		// @148: goto @14C
		// @14B: athrow
		// @14C: aload_0
		// @14D: iconst_1
		// @14E: putfield boolean game.C_100018_wk.field_101523_O
		// @151: getstatic int game.SteelSentinels.field_105275_O
		// @154: ifeq @16C
		// @157: goto @15B
		// @15A: athrow
		// @15B: aload_0
		// @15C: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @15F: getfield game.C_100300_kc game.C_100294_ki.field_106950_D
		// @162: bipush 126 (0x7E)
		// @164: aload_0
		// @165: invokevirtual game.C_100300_kc.func_107058_a(int, game.C_100325_id)void
		// @168: goto @16C
		// @16B: athrow
		// @16C: iconst_1
		// @16D: ireturn
		// @16E: aload_0
		// @16F: bipush 32 (0x20)
		// @171: putfield int game.C_100018_wk.field_101515_cb
		// @174: iload_1
		// @175: iconst_1
		// @176: if_icmpeq @17B
		// @179: iconst_0
		// @17A: ireturn
		// @17B: iconst_0
		// @17C: ireturn
		// @17D: astore_3
		// @17E: aload_3
		// @17F: new java.lang.StringBuilder
		// @182: dup
		// @183: invokespecial java.lang.StringBuilder.<init>()void
		// @186: getstatic java.lang.String[] game.C_100018_wk.field_101532_ib
		// @189: bipush 6 (0x06)
		// @18B: aaload
		// @18C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @18F: iload_1
		// @190: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @193: bipush 44 (0x2C)
		// @195: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @198: iload_2
		// @199: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @19C: bipush 41 (0x29)
		// @19E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1A1: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @1A4: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @1A7: athrow
	}
	
	private final void func_101504_c(int arg0, byte arg1)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #26
		// @005: iload_2
		// @006: bipush 8 (0x08)
		// @008: if_icmpeq @01D
		// @00B: aload_0
		// @00C: bipush -98 (0x9E)
		// @00E: bipush -74 (0xB6)
		// @010: bipush 113 (0x71)
		// @012: bipush 26 (0x1A)
		// @014: iconst_0
		// @015: iconst_0
		// @016: invokespecial game.C_100018_wk.func_101505_a(int, int, int, int, boolean, boolean)void
		// @019: goto @01D
		// @01C: athrow
		// @01D: iconst_0
		// @01E: istore_3
		// @01F: aload_0
		// @020: getfield game.C_100314_lf[] game.C_100018_wk.field_101553_y
		// @023: arraylength
		// @024: iconst_m1
		// @025: ixor
		// @026: iload_3
		// @027: iconst_m1
		// @028: ixor
		// @029: if_icmpge @AEC
		// @02C: aload_0
		// @02D: getfield game.C_100314_lf[] game.C_100018_wk.field_101553_y
		// @030: iload_3
		// @031: aaload
		// @032: astore #4
		// @034: iload #26
		// @036: ifne @B1A
		// @039: aconst_null
		// @03A: aload #4
		// @03C: if_acmpeq @AE4
		// @03F: goto @043
		// @042: athrow
		// @043: aload #4
		// @045: aload_0
		// @046: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @049: if_acmpne @063
		// @04C: goto @050
		// @04F: athrow
		// @050: bipush -8 (0xF8)
		// @052: aload_0
		// @053: getfield int game.C_100018_wk.field_101539_Y
		// @056: iconst_m1
		// @057: ixor
		// @058: if_icmpne @063
		// @05B: goto @05F
		// @05E: athrow
		// @05F: goto @AE4
		// @062: athrow
		// @063: aload_0
		// @064: getfield int game.C_100018_wk.field_101514_F
		// @067: aload #4
		// @069: getfield int game.C_100314_lf.field_101377_tc
		// @06C: isub
		// @06D: istore #5
		// @06F: aload_0
		// @070: getfield int game.C_100018_wk.field_101545_fb
		// @073: aload #4
		// @075: getfield int game.C_100314_lf.field_101395_rc
		// @078: ineg
		// @079: aload #4
		// @07B: getfield int game.C_100314_lf.field_101299_xc
		// @07E: ldc_w -905614685 (0xca056aa3)
		// @081: ishl
		// @082: ineg
		// @083: isub
		// @084: iadd
		// @085: istore #6
		// @087: iload #5
		// @089: invokestatic java.lang.Math.abs(int)int
		// @08C: aload #4
		// @08E: getfield int game.C_100314_lf.field_101380_Hb
		// @091: ldc_w -297310589 (0xee476683)
		// @094: ishl
		// @095: if_icmpgt @AE4
		// @098: iload #6
		// @09A: invokestatic java.lang.Math.abs(int)int
		// @09D: iconst_m1
		// @09E: ixor
		// @09F: aload #4
		// @0A1: getfield int game.C_100314_lf.field_101299_xc
		// @0A4: ldc_w 1929504291 (0x7301e623)
		// @0A7: ishl
		// @0A8: iconst_m1
		// @0A9: ixor
		// @0AA: if_icmplt @AE4
		// @0AD: goto @0B1
		// @0B0: athrow
		// @0B1: aload #4
		// @0B3: aload_0
		// @0B4: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @0B7: if_acmpne @0CD
		// @0BA: goto @0BE
		// @0BD: athrow
		// @0BE: aload_0
		// @0BF: getfield int game.C_100018_wk.field_101516_G
		// @0C2: iconst_m1
		// @0C3: ixor
		// @0C4: bipush -11 (0xF5)
		// @0C6: if_icmpge @AE4
		// @0C9: goto @0CD
		// @0CC: athrow
		// @0CD: iconst_0
		// @0CE: aload #4
		// @0D0: getfield int game.C_100314_lf.field_101356_w
		// @0D3: if_icmplt @0DE
		// @0D6: goto @0DA
		// @0D9: athrow
		// @0DA: goto @AE4
		// @0DD: athrow
		// @0DE: aload_0
		// @0DF: getfield int game.C_100018_wk.field_101515_cb
		// @0E2: aload_0
		// @0E3: getfield int game.C_100018_wk.field_101519_C
		// @0E6: aload_0
		// @0E7: getfield int game.C_100018_wk.field_101546_w
		// @0EA: imul
		// @0EB: imul
		// @0EC: bipush 10 (0x0A)
		// @0EE: aload #4
		// @0F0: getfield int game.C_100314_lf.field_101332_T
		// @0F3: imul
		// @0F4: idiv
		// @0F5: istore #7
		// @0F7: aload_0
		// @0F8: getfield int game.C_100018_wk.field_101546_w
		// @0FB: aload_0
		// @0FC: getfield int game.C_100018_wk.field_101519_C
		// @0FF: aload_0
		// @100: getfield int game.C_100018_wk.field_101515_cb
		// @103: imul
		// @104: imul
		// @105: bipush 10 (0x0A)
		// @107: aload #4
		// @109: getfield int game.C_100314_lf.field_101332_T
		// @10C: imul
		// @10D: idiv
		// @10E: istore #8
		// @110: aload_0
		// @111: getfield int game.C_100018_wk.field_101539_Y
		// @114: iconst_m1
		// @115: ixor
		// @116: iconst_m1
		// @117: if_icmpeq @12A
		// @11A: aload_0
		// @11B: getfield int game.C_100018_wk.field_101539_Y
		// @11E: iconst_5
		// @11F: if_icmpeq @12A
		// @122: goto @126
		// @125: athrow
		// @126: goto @136
		// @129: athrow
		// @12A: iload #8
		// @12C: iconst_2
		// @12D: idiv
		// @12E: istore #8
		// @130: iload #7
		// @132: iconst_2
		// @133: idiv
		// @134: istore #7
		// @136: aload_0
		// @137: getfield int game.C_100018_wk.field_101541_X
		// @13A: iconst_m1
		// @13B: ixor
		// @13C: bipush -15 (0xF1)
		// @13E: if_icmpeq @150
		// @141: bipush -29 (0xE3)
		// @143: aload_0
		// @144: getfield int game.C_100018_wk.field_101541_X
		// @147: iconst_m1
		// @148: ixor
		// @149: if_icmpne @165
		// @14C: goto @150
		// @14F: athrow
		// @150: aload_0
		// @151: getfield int game.C_100018_wk.field_101516_G
		// @154: iconst_m1
		// @155: ixor
		// @156: bipush -21 (0xEB)
		// @158: if_icmple @165
		// @15B: goto @15F
		// @15E: athrow
		// @15F: iconst_0
		// @160: istore #7
		// @162: iconst_0
		// @163: istore #8
		// @165: aload #4
		// @167: ldc_w 312774288 (0x12a48e90)
		// @16A: bipush 31 (0x1F)
		// @16C: invokevirtual game.C_100314_lf.func_101268_f(int, int)boolean
		// @16F: ifeq @18A
		// @172: aload #4
		// @174: getfield boolean game.C_100314_lf.field_101307_pb
		// @177: ifne @18A
		// @17A: goto @17E
		// @17D: athrow
		// @17E: iload #8
		// @180: iconst_2
		// @181: idiv
		// @182: istore #8
		// @184: iload #7
		// @186: iconst_2
		// @187: idiv
		// @188: istore #7
		// @18A: aload #4
		// @18C: iload_2
		// @18D: ldc_w 312774280 (0x12a48e88)
		// @190: iadd
		// @191: bipush 29 (0x1D)
		// @193: invokevirtual game.C_100314_lf.func_101268_f(int, int)boolean
		// @196: ifeq @1B1
		// @199: aload #4
		// @19B: getfield boolean game.C_100314_lf.field_101307_pb
		// @19E: ifeq @1B1
		// @1A1: goto @1A5
		// @1A4: athrow
		// @1A5: iload #7
		// @1A7: iconst_2
		// @1A8: idiv
		// @1A9: istore #7
		// @1AB: iload #8
		// @1AD: iconst_2
		// @1AE: idiv
		// @1AF: istore #8
		// @1B1: bipush 109 (0x6D)
		// @1B3: aload #4
		// @1B5: getfield game.C_100327_ib game.C_100314_lf.field_101357_v
		// @1B8: getfield int game.C_100327_ib.field_102494_P
		// @1BB: if_icmpeq @1C2
		// @1BE: goto @1C8
		// @1C1: athrow
		// @1C2: iconst_0
		// @1C3: istore #8
		// @1C5: iconst_0
		// @1C6: istore #7
		// @1C8: aload #4
		// @1CA: getfield int game.C_100314_lf.field_101297_Ub
		// @1CD: iconst_m1
		// @1CE: ixor
		// @1CF: iconst_m1
		// @1D0: if_icmpge @1D9
		// @1D3: iconst_0
		// @1D4: istore #7
		// @1D6: iconst_0
		// @1D7: istore #8
		// @1D9: iconst_4
		// @1DA: aload_0
		// @1DB: getfield int game.C_100018_wk.field_101539_Y
		// @1DE: if_icmpeq @20C
		// @1E1: iconst_m1
		// @1E2: aload #4
		// @1E4: getfield int game.C_100314_lf.field_101295_gb
		// @1E7: iconst_m1
		// @1E8: ixor
		// @1E9: if_icmpne @20C
		// @1EC: goto @1F0
		// @1EF: athrow
		// @1F0: aload #4
		// @1F2: dup
		// @1F3: getfield int game.C_100314_lf.field_101294_gc
		// @1F6: iload #8
		// @1F8: iadd
		// @1F9: putfield int game.C_100314_lf.field_101294_gc
		// @1FC: aload #4
		// @1FE: dup
		// @1FF: getfield int game.C_100314_lf.field_101344_Y
		// @202: iload #7
		// @204: iadd
		// @205: putfield int game.C_100314_lf.field_101344_Y
		// @208: goto @20C
		// @20B: athrow
		// @20C: aload_0
		// @20D: getfield boolean game.C_100018_wk.field_101528_gb
		// @210: ifne @290
		// @213: aload_0
		// @214: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @217: ifnonnull @222
		// @21A: goto @21E
		// @21D: athrow
		// @21E: goto @290
		// @221: athrow
		// @222: aload_0
		// @223: iconst_1
		// @224: putfield boolean game.C_100018_wk.field_101528_gb
		// @227: iconst_2
		// @228: aload_0
		// @229: getfield int game.C_100018_wk.field_101539_Y
		// @22C: if_icmpne @240
		// @22F: aload_0
		// @230: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @233: dup
		// @234: getfield int game.C_100314_lf.field_101351_m
		// @237: iconst_1
		// @238: iadd
		// @239: putfield int game.C_100314_lf.field_101351_m
		// @23C: goto @240
		// @23F: athrow
		// @240: iconst_2
		// @241: aload_0
		// @242: getfield int game.C_100018_wk.field_101539_Y
		// @245: if_icmpeq @257
		// @248: bipush -2 (0xFE)
		// @24A: aload_0
		// @24B: getfield int game.C_100018_wk.field_101539_Y
		// @24E: iconst_m1
		// @24F: ixor
		// @250: if_icmpne @26F
		// @253: goto @257
		// @256: athrow
		// @257: aload #4
		// @259: getfield boolean game.C_100314_lf.field_101307_pb
		// @25C: ifeq @26F
		// @25F: goto @263
		// @262: athrow
		// @263: aload #4
		// @265: getfield int game.C_100314_lf.field_101354_fb
		// @268: ifle @26F
		// @26B: goto @26F
		// @26E: athrow
		// @26F: iconst_3
		// @270: aload_0
		// @271: getfield int game.C_100018_wk.field_101539_Y
		// @274: if_icmpne @290
		// @277: aload #4
		// @279: getfield boolean game.C_100314_lf.field_101307_pb
		// @27C: ifeq @290
		// @27F: goto @283
		// @282: athrow
		// @283: iconst_0
		// @284: aload #4
		// @286: getfield int game.C_100314_lf.field_101354_fb
		// @289: if_icmpge @290
		// @28C: goto @290
		// @28F: athrow
		// @290: aload_0
		// @291: iconst_1
		// @292: putfield boolean game.C_100018_wk.field_101523_O
		// @295: iconst_0
		// @296: iload #7
		// @298: if_icmpne @2A4
		// @29B: iload #8
		// @29D: ifeq @2BB
		// @2A0: goto @2A4
		// @2A3: athrow
		// @2A4: aload #4
		// @2A6: getfield boolean game.C_100314_lf.field_101307_pb
		// @2A9: ifeq @2B4
		// @2AC: goto @2B0
		// @2AF: athrow
		// @2B0: goto @2BB
		// @2B3: athrow
		// @2B4: aload #4
		// @2B6: bipush 25 (0x19)
		// @2B8: putfield int game.C_100314_lf.field_101354_fb
		// @2BB: aload_0
		// @2BC: getfield game.C_100314_lf[] game.C_100018_wk.field_101553_y
		// @2BF: iload_3
		// @2C0: aconst_null
		// @2C1: aastore
		// @2C2: iconst_0
		// @2C3: aload #4
		// @2C5: getfield int game.C_100314_lf.field_101352_j
		// @2C8: iconst_m1
		// @2C9: ixor
		// @2CA: if_icmpeq @2E6
		// @2CD: aload_0
		// @2CE: getfield int game.C_100018_wk.field_101541_X
		// @2D1: aload #4
		// @2D3: getfield int game.C_100314_lf.field_101352_j
		// @2D6: if_icmpeq @2E6
		// @2D9: goto @2DD
		// @2DC: athrow
		// @2DD: iload #26
		// @2DF: ifeq @AE4
		// @2E2: goto @2E6
		// @2E5: athrow
		// @2E6: aload #4
		// @2E8: dup
		// @2E9: getfield int game.C_100314_lf.field_101413_Bb
		// @2EC: aload_0
		// @2ED: getfield int game.C_100018_wk.field_101543_db
		// @2F0: isub
		// @2F1: putfield int game.C_100314_lf.field_101413_Bb
		// @2F4: aload_0
		// @2F5: getfield int game.C_100018_wk.field_101543_db
		// @2F8: ifle @335
		// @2FB: goto @2FF
		// @2FE: athrow
		// @2FF: aload #4
		// @301: getfield int game.C_100314_lf.field_101310_Mb
		// @304: ifle @335
		// @307: goto @30B
		// @30A: athrow
		// @30B: aload #4
		// @30D: bipush 56 (0x38)
		// @30F: invokevirtual game.C_100314_lf.func_101279_e(int)boolean
		// @312: ifeq @335
		// @315: goto @319
		// @318: athrow
		// @319: aload #4
		// @31B: iload_2
		// @31C: bipush 45 (0x2D)
		// @31E: ixor
		// @31F: aload_0
		// @320: getfield int game.C_100018_wk.field_101543_db
		// @323: bipush 50 (0x32)
		// @325: idiv
		// @326: aload #4
		// @328: getfield int game.C_100314_lf.field_101310_Mb
		// @32B: invokestatic java.lang.Math.min(int, int)int
		// @32E: invokevirtual game.C_100314_lf.func_101260_j(int, int)void
		// @331: goto @335
		// @334: athrow
		// @335: aload #4
		// @337: getfield int game.C_100314_lf.field_101413_Bb
		// @33A: iflt @341
		// @33D: goto @347
		// @340: athrow
		// @341: aload #4
		// @343: iconst_0
		// @344: putfield int game.C_100314_lf.field_101413_Bb
		// @347: aload #4
		// @349: bipush 100 (0x64)
		// @34B: putfield int game.C_100314_lf.field_101401_Sb
		// @34E: bipush -5 (0xFB)
		// @350: aload_0
		// @351: getfield int game.C_100018_wk.field_101539_Y
		// @354: iconst_m1
		// @355: ixor
		// @356: if_icmpeq @833
		// @359: bipush 6 (0x06)
		// @35B: aload_0
		// @35C: getfield int game.C_100018_wk.field_101539_Y
		// @35F: if_icmpeq @833
		// @362: goto @366
		// @365: athrow
		// @366: aload_0
		// @367: getfield int game.C_100018_wk.field_101539_Y
		// @36A: iconst_m1
		// @36B: ixor
		// @36C: bipush -8 (0xF8)
		// @36E: if_icmpeq @833
		// @371: goto @375
		// @374: athrow
		// @375: iconst_0
		// @376: aload #4
		// @378: getfield int game.C_100314_lf.field_101356_w
		// @37B: if_icmpge @39D
		// @37E: goto @382
		// @381: athrow
		// @382: iconst_m1
		// @383: aload #4
		// @385: getfield int game.C_100314_lf.field_101297_Ub
		// @388: iconst_m1
		// @389: ixor
		// @38A: if_icmpgt @39D
		// @38D: goto @391
		// @390: athrow
		// @391: aload #4
		// @393: bipush -121 (0x87)
		// @395: aload_0
		// @396: invokevirtual game.C_100314_lf.func_101276_a(byte, game.C_100018_wk)void
		// @399: goto @39D
		// @39C: athrow
		// @39D: iconst_0
		// @39E: aload #4
		// @3A0: getfield int game.C_100314_lf.field_101356_w
		// @3A3: if_icmpge @3B1
		// @3A6: aload_0
		// @3A7: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @3AA: ifnonnull @3E9
		// @3AD: goto @3B1
		// @3B0: athrow
		// @3B1: aload #4
		// @3B3: getfield int game.C_100314_lf.field_101356_w
		// @3B6: ifle @7DE
		// @3B9: goto @3BD
		// @3BC: athrow
		// @3BD: aconst_null
		// @3BE: aload_0
		// @3BF: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @3C2: if_acmpne @7DE
		// @3C5: goto @3C9
		// @3C8: athrow
		// @3C9: aload #4
		// @3CB: getfield int game.C_100314_lf.field_101297_Ub
		// @3CE: ifgt @7DE
		// @3D1: goto @3D5
		// @3D4: athrow
		// @3D5: aload #4
		// @3D7: aload_0
		// @3D8: getfield int game.C_100018_wk.field_101546_w
		// @3DB: bipush 30 (0x1E)
		// @3DD: invokevirtual game.C_100314_lf.func_101262_a(int, int)void
		// @3E0: iload #26
		// @3E2: ifeq @7DE
		// @3E5: goto @3E9
		// @3E8: athrow
		// @3E9: bipush 7 (0x07)
		// @3EB: aload_0
		// @3EC: getfield int game.C_100018_wk.field_101539_Y
		// @3EF: if_icmpeq @481
		// @3F2: goto @3F6
		// @3F5: athrow
		// @3F6: iconst_m1
		// @3F7: aload_0
		// @3F8: getfield int game.C_100018_wk.field_101539_Y
		// @3FB: iconst_m1
		// @3FC: ixor
		// @3FD: if_icmpeq @481
		// @400: goto @404
		// @403: athrow
		// @404: aload_0
		// @405: getfield int game.C_100018_wk.field_101539_Y
		// @408: iconst_m1
		// @409: ixor
		// @40A: bipush -6 (0xFA)
		// @40C: if_icmpeq @481
		// @40F: goto @413
		// @412: athrow
		// @413: aload_0
		// @414: getfield int game.C_100018_wk.field_101539_Y
		// @417: iconst_m1
		// @418: ixor
		// @419: bipush -2 (0xFE)
		// @41B: if_icmpeq @45B
		// @41E: goto @422
		// @421: athrow
		// @422: iconst_2
		// @423: aload_0
		// @424: getfield int game.C_100018_wk.field_101539_Y
		// @427: if_icmpeq @45B
		// @42A: goto @42E
		// @42D: athrow
		// @42E: aload_0
		// @42F: getfield int game.C_100018_wk.field_101539_Y
		// @432: iconst_3
		// @433: if_icmpeq @45B
		// @436: goto @43A
		// @439: athrow
		// @43A: bipush 20 (0x14)
		// @43C: aload_0
		// @43D: getfield int game.C_100018_wk.field_101539_Y
		// @440: if_icmpeq @45B
		// @443: goto @447
		// @446: athrow
		// @447: aload_0
		// @448: getfield int game.C_100018_wk.field_101514_F
		// @44B: bipush 55 (0x37)
		// @44D: iconst_1
		// @44E: invokestatic game.C_100143_bl.func_105098_a(int, int, boolean)game.C_100179_ch
		// @451: pop
		// @452: iload #26
		// @454: ifeq @4A4
		// @457: goto @45B
		// @45A: athrow
		// @45B: aload_0
		// @45C: getfield int game.C_100018_wk.field_101514_F
		// @45F: bipush 51 (0x33)
		// @461: iconst_1
		// @462: invokestatic game.C_100143_bl.func_105098_a(int, int, boolean)game.C_100179_ch
		// @465: pop
		// @466: aload #4
		// @468: bipush 33 (0x21)
		// @46A: bipush 33 (0x21)
		// @46C: invokevirtual game.C_100314_lf.func_101288_i(int, int)int
		// @46F: istore #9
		// @471: aload_0
		// @472: aload_0
		// @473: getfield int game.C_100018_wk.field_101546_w
		// @476: iload #9
		// @478: ishr
		// @479: putfield int game.C_100018_wk.field_101546_w
		// @47C: iload #26
		// @47E: ifeq @4A4
		// @481: aload_0
		// @482: getfield int game.C_100018_wk.field_101514_F
		// @485: bipush 49 (0x31)
		// @487: iconst_1
		// @488: invokestatic game.C_100143_bl.func_105098_a(int, int, boolean)game.C_100179_ch
		// @48B: pop
		// @48C: aload #4
		// @48E: bipush 32 (0x20)
		// @490: iload_2
		// @491: bipush 25 (0x19)
		// @493: iadd
		// @494: invokevirtual game.C_100314_lf.func_101288_i(int, int)int
		// @497: istore #9
		// @499: aload_0
		// @49A: aload_0
		// @49B: getfield int game.C_100018_wk.field_101546_w
		// @49E: iload #9
		// @4A0: ishr
		// @4A1: putfield int game.C_100018_wk.field_101546_w
		// @4A4: bipush -16 (0xF0)
		// @4A6: aload_0
		// @4A7: getfield int game.C_100018_wk.field_101541_X
		// @4AA: iconst_m1
		// @4AB: ixor
		// @4AC: if_icmpne @4D7
		// @4AF: aload_0
		// @4B0: getfield int game.C_100018_wk.field_101516_G
		// @4B3: aload_0
		// @4B4: getfield int game.C_100018_wk.field_101533_W
		// @4B7: if_icmplt @4D7
		// @4BA: goto @4BE
		// @4BD: athrow
		// @4BE: aload_0
		// @4BF: getfield boolean game.C_100018_wk.field_101530_U
		// @4C2: ifeq @4D7
		// @4C5: goto @4C9
		// @4C8: athrow
		// @4C9: aload_0
		// @4CA: dup
		// @4CB: getfield int game.C_100018_wk.field_101546_w
		// @4CE: iconst_4
		// @4CF: imul
		// @4D0: putfield int game.C_100018_wk.field_101546_w
		// @4D3: goto @4D7
		// @4D6: athrow
		// @4D7: bipush -15 (0xF1)
		// @4D9: aload_0
		// @4DA: getfield int game.C_100018_wk.field_101541_X
		// @4DD: iconst_m1
		// @4DE: ixor
		// @4DF: if_icmpeq @4EF
		// @4E2: aload_0
		// @4E3: getfield int game.C_100018_wk.field_101541_X
		// @4E6: bipush 28 (0x1C)
		// @4E8: if_icmpne @50A
		// @4EB: goto @4EF
		// @4EE: athrow
		// @4EF: bipush 20 (0x14)
		// @4F1: aload_0
		// @4F2: getfield int game.C_100018_wk.field_101516_G
		// @4F5: if_icmple @50A
		// @4F8: goto @4FC
		// @4FB: athrow
		// @4FC: aload_0
		// @4FD: dup
		// @4FE: getfield int game.C_100018_wk.field_101546_w
		// @501: iconst_4
		// @502: idiv
		// @503: putfield int game.C_100018_wk.field_101546_w
		// @506: goto @50A
		// @509: athrow
		// @50A: aload #4
		// @50C: getfield int game.C_100314_lf.field_101297_Ub
		// @50F: iconst_m1
		// @510: ixor
		// @511: iconst_m1
		// @512: if_icmplt @583
		// @515: aload #4
		// @517: getfield int game.C_100314_lf.field_101356_w
		// @51A: ifle @583
		// @51D: goto @521
		// @520: athrow
		// @521: aload #4
		// @523: aload_0
		// @524: getfield int game.C_100018_wk.field_101546_w
		// @527: bipush 30 (0x1E)
		// @529: invokevirtual game.C_100314_lf.func_101262_a(int, int)void
		// @52C: bipush -33 (0xDF)
		// @52E: aload_0
		// @52F: getfield int game.C_100018_wk.field_101541_X
		// @532: iconst_m1
		// @533: ixor
		// @534: if_icmpne @583
		// @537: goto @53B
		// @53A: athrow
		// @53B: iconst_m1
		// @53C: aload #4
		// @53E: getfield int game.C_100314_lf.field_101356_w
		// @541: iconst_m1
		// @542: ixor
		// @543: if_icmpgt @583
		// @546: goto @54A
		// @549: athrow
		// @54A: aload #4
		// @54C: getfield int game.C_100314_lf.field_101387_Xb
		// @54F: ifeq @566
		// @552: goto @556
		// @555: athrow
		// @556: bipush -12 (0xF4)
		// @558: aload #4
		// @55A: getfield int game.C_100314_lf.field_101387_Xb
		// @55D: iconst_m1
		// @55E: ixor
		// @55F: if_icmpne @583
		// @562: goto @566
		// @565: athrow
		// @566: aconst_null
		// @567: aload_0
		// @568: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @56B: if_acmpeq @583
		// @56E: goto @572
		// @571: athrow
		// @572: aload_0
		// @573: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @576: dup
		// @577: getfield int game.C_100314_lf.field_101325_eb
		// @57A: iconst_1
		// @57B: iadd
		// @57C: putfield int game.C_100314_lf.field_101325_eb
		// @57F: goto @583
		// @582: athrow
		// @583: aload_0
		// @584: getfield int game.C_100018_wk.field_101546_w
		// @587: istore #9
		// @589: iload #9
		// @58B: iconst_m1
		// @58C: ixor
		// @58D: aload #4
		// @58F: getfield int game.C_100314_lf.field_101356_w
		// @592: iconst_m1
		// @593: ixor
		// @594: if_icmplt @59B
		// @597: goto @5A2
		// @59A: athrow
		// @59B: aload #4
		// @59D: getfield int game.C_100314_lf.field_101356_w
		// @5A0: istore #9
		// @5A2: iload #9
		// @5A4: ifge @5AA
		// @5A7: iconst_0
		// @5A8: istore #9
		// @5AA: aload #4
		// @5AC: ldc_w 312774288 (0x12a48e90)
		// @5AF: bipush 26 (0x1A)
		// @5B1: invokevirtual game.C_100314_lf.func_101268_f(int, int)boolean
		// @5B4: ifne @5BB
		// @5B7: goto @5D1
		// @5BA: athrow
		// @5BB: aload #4
		// @5BD: aload #4
		// @5BF: getfield int game.C_100314_lf.field_101358_u
		// @5C2: aload #4
		// @5C4: getfield int game.C_100314_lf.field_101413_Bb
		// @5C7: iload #9
		// @5C9: ineg
		// @5CA: isub
		// @5CB: invokestatic java.lang.Math.min(int, int)int
		// @5CE: putfield int game.C_100314_lf.field_101413_Bb
		// @5D1: bipush 8 (0x08)
		// @5D3: aload #4
		// @5D5: getfield int game.C_100314_lf.field_101387_Xb
		// @5D8: if_icmpne @5DF
		// @5DB: goto @6C7
		// @5DE: athrow
		// @5DF: aload #4
		// @5E1: getfield int game.C_100314_lf.field_101346_Z
		// @5E4: aload_0
		// @5E5: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @5E8: getfield int game.C_100314_lf.field_101346_Z
		// @5EB: if_icmpne @631
		// @5EE: iconst_0
		// @5EF: aload #4
		// @5F1: getfield int game.C_100314_lf.field_101297_Ub
		// @5F4: if_icmpge @5FF
		// @5F7: goto @5FB
		// @5FA: athrow
		// @5FB: goto @6C7
		// @5FE: athrow
		// @5FF: aload_0
		// @600: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @603: aload #4
		// @605: if_acmpne @60C
		// @608: goto @6C7
		// @60B: athrow
		// @60C: aload_0
		// @60D: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @610: bipush 10 (0x0A)
		// @612: iload #9
		// @614: aload #4
		// @616: getfield int game.C_100314_lf.field_101345_X
		// @619: imul
		// @61A: aload #4
		// @61C: getfield int game.C_100314_lf.field_101332_T
		// @61F: idiv
		// @620: aload_0
		// @621: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @624: getfield int game.C_100294_ki.field_106994_v
		// @627: imul
		// @628: ineg
		// @629: invokevirtual game.C_100314_lf.func_101264_g(int, int)void
		// @62C: iload #26
		// @62E: ifeq @6C7
		// @631: aload #4
		// @633: getfield int game.C_100314_lf.field_101297_Ub
		// @636: iconst_m1
		// @637: ixor
		// @638: iconst_m1
		// @639: if_icmpge @644
		// @63C: goto @640
		// @63F: athrow
		// @640: goto @672
		// @643: athrow
		// @644: aload_0
		// @645: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @648: iload_2
		// @649: iconst_2
		// @64A: iadd
		// @64B: aload_0
		// @64C: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @64F: getfield int game.C_100294_ki.field_106994_v
		// @652: iload #9
		// @654: aload #4
		// @656: getfield int game.C_100314_lf.field_101345_X
		// @659: imul
		// @65A: aload #4
		// @65C: getfield int game.C_100314_lf.field_101332_T
		// @65F: idiv
		// @660: imul
		// @661: invokevirtual game.C_100314_lf.func_101264_g(int, int)void
		// @664: aload_0
		// @665: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @668: dup
		// @669: getfield int game.C_100314_lf.field_101385_Pb
		// @66C: iload #9
		// @66E: iadd
		// @66F: putfield int game.C_100314_lf.field_101385_Pb
		// @672: aload_0
		// @673: getfield boolean game.C_100018_wk.field_101513_E
		// @676: ifne @6C7
		// @679: aload_0
		// @67A: getfield int game.C_100018_wk.field_101533_W
		// @67D: aload_0
		// @67E: getfield int game.C_100018_wk.field_101516_G
		// @681: if_icmpgt @6C7
		// @684: goto @688
		// @687: athrow
		// @688: aload_0
		// @689: getfield game.C_100314_lf game.C_100018_wk.field_101529_K
		// @68C: ifnull @6A3
		// @68F: goto @693
		// @692: athrow
		// @693: aload_0
		// @694: getfield int game.C_100018_wk.field_101539_Y
		// @697: iconst_3
		// @698: if_icmpne @6A3
		// @69B: goto @69F
		// @69E: athrow
		// @69F: goto @6C7
		// @6A2: athrow
		// @6A3: aload_0
		// @6A4: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @6A7: getfield int game.C_100314_lf.field_101406_Cb
		// @6AA: iflt @6BA
		// @6AD: aload_0
		// @6AE: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @6B1: bipush 100 (0x64)
		// @6B3: putfield int game.C_100314_lf.field_101406_Cb
		// @6B6: goto @6BA
		// @6B9: athrow
		// @6BA: aload_0
		// @6BB: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @6BE: dup
		// @6BF: getfield int game.C_100314_lf.field_101376_tb
		// @6C2: iconst_1
		// @6C3: iadd
		// @6C4: putfield int game.C_100314_lf.field_101376_tb
		// @6C7: iload #9
		// @6C9: ifgt @6D8
		// @6CC: aload #4
		// @6CE: getfield int game.C_100314_lf.field_101356_w
		// @6D1: ifgt @6E8
		// @6D4: goto @6D8
		// @6D7: athrow
		// @6D8: aload #4
		// @6DA: getfield int game.C_100314_lf.field_101343_vb
		// @6DD: iconst_m1
		// @6DE: ixor
		// @6DF: bipush -39 (0xD9)
		// @6E1: if_icmpne @7DE
		// @6E4: goto @6E8
		// @6E7: athrow
		// @6E8: aload_0
		// @6E9: iconst_0
		// @6EA: putfield boolean game.C_100018_wk.field_101523_O
		// @6ED: aload_0
		// @6EE: iconst_0
		// @6EF: putfield boolean game.C_100018_wk.field_101528_gb
		// @6F2: iconst_0
		// @6F3: iload #5
		// @6F5: if_icmpne @724
		// @6F8: goto @6FC
		// @6FB: athrow
		// @6FC: iload #6
		// @6FE: ifne @724
		// @701: goto @705
		// @704: athrow
		// @705: aload_0
		// @706: aload_0
		// @707: getfield int game.C_100018_wk.field_101519_C
		// @70A: ineg
		// @70B: iconst_2
		// @70C: idiv
		// @70D: putfield int game.C_100018_wk.field_101519_C
		// @710: aload_0
		// @711: aload_0
		// @712: getfield int game.C_100018_wk.field_101527_J
		// @715: ineg
		// @716: iconst_2
		// @717: idiv
		// @718: putfield int game.C_100018_wk.field_101527_J
		// @71B: iload #26
		// @71D: ifeq @7D4
		// @720: goto @724
		// @723: athrow
		// @724: aload #4
		// @726: getfield int game.C_100314_lf.field_101380_Hb
		// @729: i2d
		// @72A: aload #4
		// @72C: getfield int game.C_100314_lf.field_101299_xc
		// @72F: i2d
		// @730: ddiv
		// @731: invokestatic java.lang.Math.abs(double)double
		// @734: dstore #10
		// @736: dload #10
		// @738: iload #5
		// @73A: i2d
		// @73B: dmul
		// @73C: dstore #12
		// @73E: iload #6
		// @740: i2d
		// @741: dstore #14
		// @743: dload #14
		// @745: dload #14
		// @747: dmul
		// @748: dload #12
		// @74A: dload #12
		// @74C: dmul
		// @74D: dadd
		// @74E: invokestatic java.lang.Math.sqrt(double)double
		// @751: dstore #16
		// @753: dload #16
		// @755: dconst_0
		// @756: dcmpl
		// @757: ifne @75E
		// @75A: goto @76C
		// @75D: athrow
		// @75E: dload #12
		// @760: dload #16
		// @762: ddiv
		// @763: dstore #12
		// @765: dload #14
		// @767: dload #16
		// @769: ddiv
		// @76A: dstore #14
		// @76C: dload #14
		// @76E: dneg
		// @76F: dstore #18
		// @771: dload #12
		// @773: dstore #20
		// @775: dload #12
		// @777: aload_0
		// @778: getfield int game.C_100018_wk.field_101519_C
		// @77B: i2d
		// @77C: dmul
		// @77D: aload_0
		// @77E: getfield int game.C_100018_wk.field_101527_J
		// @781: i2d
		// @782: dload #14
		// @784: dmul
		// @785: dadd
		// @786: dstore #22
		// @788: aload_0
		// @789: getfield int game.C_100018_wk.field_101527_J
		// @78C: i2d
		// @78D: dload #20
		// @78F: dmul
		// @790: dload #18
		// @792: aload_0
		// @793: getfield int game.C_100018_wk.field_101519_C
		// @796: i2d
		// @797: dmul
		// @798: dadd
		// @799: dstore #24
		// @79B: dload #24
		// @79D: dneg
		// @79E: dstore #24
		// @7A0: aload_0
		// @7A1: dload #12
		// @7A3: dload #22
		// @7A5: dmul
		// @7A6: dload #24
		// @7A8: dload #18
		// @7AA: dmul
		// @7AB: dadd
		// @7AC: d2i
		// @7AD: putfield int game.C_100018_wk.field_101519_C
		// @7B0: aload_0
		// @7B1: dload #22
		// @7B3: dload #14
		// @7B5: dmul
		// @7B6: dload #20
		// @7B8: dload #24
		// @7BA: dmul
		// @7BB: dadd
		// @7BC: d2i
		// @7BD: putfield int game.C_100018_wk.field_101527_J
		// @7C0: aload_0
		// @7C1: dup
		// @7C2: getfield int game.C_100018_wk.field_101519_C
		// @7C5: iconst_2
		// @7C6: idiv
		// @7C7: putfield int game.C_100018_wk.field_101519_C
		// @7CA: aload_0
		// @7CB: dup
		// @7CC: getfield int game.C_100018_wk.field_101527_J
		// @7CF: iconst_2
		// @7D0: idiv
		// @7D1: putfield int game.C_100018_wk.field_101527_J
		// @7D4: aload_0
		// @7D5: dup
		// @7D6: getfield int game.C_100018_wk.field_101546_w
		// @7D9: iconst_2
		// @7DA: idiv
		// @7DB: putfield int game.C_100018_wk.field_101546_w
		// @7DE: aload_0
		// @7DF: getfield int game.C_100018_wk.field_101543_db
		// @7E2: iconst_m1
		// @7E3: ixor
		// @7E4: aload #4
		// @7E6: getfield int game.C_100314_lf.field_101399_Ab
		// @7E9: iconst_m1
		// @7EA: ixor
		// @7EB: if_icmpge @809
		// @7EE: aload #4
		// @7F0: bipush 54 (0x36)
		// @7F2: invokevirtual game.C_100314_lf.func_101279_e(int)boolean
		// @7F5: ifeq @809
		// @7F8: goto @7FC
		// @7FB: athrow
		// @7FC: aload #4
		// @7FE: aload_0
		// @7FF: getfield int game.C_100018_wk.field_101543_db
		// @802: putfield int game.C_100314_lf.field_101399_Ab
		// @805: goto @809
		// @808: athrow
		// @809: aload #4
		// @80B: getfield boolean game.C_100314_lf.field_101307_pb
		// @80E: ifeq @AE4
		// @811: aload #4
		// @813: ldc_w 312774288 (0x12a48e90)
		// @816: bipush 29 (0x1D)
		// @818: invokevirtual game.C_100314_lf.func_101268_f(int, int)boolean
		// @81B: ifeq @826
		// @81E: goto @822
		// @821: athrow
		// @822: goto @AE4
		// @825: athrow
		// @826: aload #4
		// @828: sipush 200 (0x00C8)
		// @82B: putfield int game.C_100314_lf.field_101402_Jb
		// @82E: iload #26
		// @830: ifeq @AE4
		// @833: iconst_0
		// @834: aload #4
		// @836: getfield int game.C_100314_lf.field_101413_Bb
		// @839: if_icmpge @84F
		// @83C: goto @840
		// @83F: athrow
		// @840: aload_0
		// @841: getfield int game.C_100018_wk.field_101514_F
		// @844: bipush 27 (0x1B)
		// @846: iconst_1
		// @847: invokestatic game.C_100143_bl.func_105098_a(int, int, boolean)game.C_100179_ch
		// @84A: pop
		// @84B: goto @84F
		// @84E: athrow
		// @84F: aload #4
		// @851: dup
		// @852: getfield int game.C_100314_lf.field_101413_Bb
		// @855: aload_0
		// @856: getfield int game.C_100018_wk.field_101546_w
		// @859: isub
		// @85A: putfield int game.C_100314_lf.field_101413_Bb
		// @85D: iconst_0
		// @85E: aload #4
		// @860: getfield int game.C_100314_lf.field_101413_Bb
		// @863: if_icmpgt @86A
		// @866: goto @AE4
		// @869: athrow
		// @86A: aload_0
		// @86B: getfield int game.C_100018_wk.field_101514_F
		// @86E: bipush 50 (0x32)
		// @870: iconst_1
		// @871: invokestatic game.C_100143_bl.func_105098_a(int, int, boolean)game.C_100179_ch
		// @874: pop
		// @875: aload #4
		// @877: getfield int game.C_100314_lf.field_101356_w
		// @87A: ifle @898
		// @87D: iconst_m1
		// @87E: aload #4
		// @880: getfield int game.C_100314_lf.field_101297_Ub
		// @883: iconst_m1
		// @884: ixor
		// @885: if_icmple @890
		// @888: goto @88C
		// @88B: athrow
		// @88C: goto @898
		// @88F: athrow
		// @890: aload #4
		// @892: bipush -128 (0x80)
		// @894: aload_0
		// @895: invokevirtual game.C_100314_lf.func_101276_a(byte, game.C_100018_wk)void
		// @898: aload #4
		// @89A: getfield int game.C_100314_lf.field_101356_w
		// @89D: iconst_m1
		// @89E: ixor
		// @89F: iconst_m1
		// @8A0: if_icmpge @8AF
		// @8A3: aconst_null
		// @8A4: aload_0
		// @8A5: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @8A8: if_acmpne @931
		// @8AB: goto @8AF
		// @8AE: athrow
		// @8AF: aload #4
		// @8B1: getfield int game.C_100314_lf.field_101356_w
		// @8B4: iconst_m1
		// @8B5: ixor
		// @8B6: iconst_m1
		// @8B7: if_icmpge @A94
		// @8BA: goto @8BE
		// @8BD: athrow
		// @8BE: aconst_null
		// @8BF: aload_0
		// @8C0: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @8C3: if_acmpne @A94
		// @8C6: goto @8CA
		// @8C9: athrow
		// @8CA: aload #4
		// @8CC: getfield int game.C_100314_lf.field_101297_Ub
		// @8CF: iconst_m1
		// @8D0: ixor
		// @8D1: iconst_m1
		// @8D2: if_icmpge @8DD
		// @8D5: goto @8D9
		// @8D8: athrow
		// @8D9: goto @8EA
		// @8DC: athrow
		// @8DD: aload #4
		// @8DF: aload #4
		// @8E1: getfield int game.C_100314_lf.field_101413_Bb
		// @8E4: ineg
		// @8E5: bipush 30 (0x1E)
		// @8E7: invokevirtual game.C_100314_lf.func_101262_a(int, int)void
		// @8EA: aload #4
		// @8EC: ldc_w 312774288 (0x12a48e90)
		// @8EF: bipush 26 (0x1A)
		// @8F1: invokevirtual game.C_100314_lf.func_101268_f(int, int)boolean
		// @8F4: ifeq @906
		// @8F7: aload #4
		// @8F9: getfield int game.C_100314_lf.field_101413_Bb
		// @8FC: iconst_m1
		// @8FD: ixor
		// @8FE: iconst_m1
		// @8FF: if_icmpgt @915
		// @902: goto @906
		// @905: athrow
		// @906: aload #4
		// @908: iconst_0
		// @909: putfield int game.C_100314_lf.field_101413_Bb
		// @90C: iload #26
		// @90E: ifeq @A94
		// @911: goto @915
		// @914: athrow
		// @915: aload #4
		// @917: aload #4
		// @919: getfield int game.C_100314_lf.field_101413_Bb
		// @91C: ineg
		// @91D: aload #4
		// @91F: getfield int game.C_100314_lf.field_101358_u
		// @922: invokestatic java.lang.Math.min(int, int)int
		// @925: putfield int game.C_100314_lf.field_101413_Bb
		// @928: iload #26
		// @92A: ifeq @A94
		// @92D: goto @931
		// @930: athrow
		// @931: aload #4
		// @933: getfield int game.C_100314_lf.field_101413_Bb
		// @936: ineg
		// @937: istore #9
		// @939: iload #9
		// @93B: iconst_m1
		// @93C: ixor
		// @93D: aload #4
		// @93F: getfield int game.C_100314_lf.field_101356_w
		// @942: iconst_m1
		// @943: ixor
		// @944: if_icmpge @94E
		// @947: aload #4
		// @949: getfield int game.C_100314_lf.field_101356_w
		// @94C: istore #9
		// @94E: iconst_m1
		// @94F: iload #9
		// @951: iconst_m1
		// @952: ixor
		// @953: if_icmpge @959
		// @956: iconst_0
		// @957: istore #9
		// @959: aload #4
		// @95B: getfield int game.C_100314_lf.field_101387_Xb
		// @95E: iconst_m1
		// @95F: ixor
		// @960: bipush -9 (0xF7)
		// @962: if_icmpeq @9F1
		// @965: iconst_0
		// @966: aload #4
		// @968: getfield int game.C_100314_lf.field_101297_Ub
		// @96B: if_icmplt @9F1
		// @96E: goto @972
		// @971: athrow
		// @972: aload_0
		// @973: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @976: getfield int game.C_100314_lf.field_101346_Z
		// @979: iconst_m1
		// @97A: ixor
		// @97B: aload #4
		// @97D: getfield int game.C_100314_lf.field_101346_Z
		// @980: iconst_m1
		// @981: ixor
		// @982: if_icmpne @9C0
		// @985: goto @989
		// @988: athrow
		// @989: aload_0
		// @98A: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @98D: aload #4
		// @98F: if_acmpeq @9F1
		// @992: goto @996
		// @995: athrow
		// @996: aload_0
		// @997: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @99A: iload_2
		// @99B: iconst_2
		// @99C: ixor
		// @99D: aload_0
		// @99E: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @9A1: getfield int game.C_100294_ki.field_106994_v
		// @9A4: iload #9
		// @9A6: aload #4
		// @9A8: getfield int game.C_100314_lf.field_101345_X
		// @9AB: imul
		// @9AC: aload #4
		// @9AE: getfield int game.C_100314_lf.field_101332_T
		// @9B1: idiv
		// @9B2: imul
		// @9B3: ineg
		// @9B4: invokevirtual game.C_100314_lf.func_101264_g(int, int)void
		// @9B7: iload #26
		// @9B9: ifeq @9F1
		// @9BC: goto @9C0
		// @9BF: athrow
		// @9C0: aload_0
		// @9C1: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @9C4: dup
		// @9C5: getfield int game.C_100314_lf.field_101385_Pb
		// @9C8: iload #9
		// @9CA: iadd
		// @9CB: putfield int game.C_100314_lf.field_101385_Pb
		// @9CE: aload_0
		// @9CF: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @9D2: bipush 10 (0x0A)
		// @9D4: aload_0
		// @9D5: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @9D8: getfield int game.C_100294_ki.field_106994_v
		// @9DB: aload #4
		// @9DD: getfield int game.C_100314_lf.field_101345_X
		// @9E0: iload #9
		// @9E2: imul
		// @9E3: aload #4
		// @9E5: getfield int game.C_100314_lf.field_101332_T
		// @9E8: idiv
		// @9E9: imul
		// @9EA: invokevirtual game.C_100314_lf.func_101264_g(int, int)void
		// @9ED: goto @9F1
		// @9F0: athrow
		// @9F1: aload #4
		// @9F3: getfield int game.C_100314_lf.field_101297_Ub
		// @9F6: iconst_m1
		// @9F7: ixor
		// @9F8: iconst_m1
		// @9F9: if_icmpge @A00
		// @9FC: goto @A94
		// @9FF: athrow
		// @A00: aload #4
		// @A02: aload #4
		// @A04: getfield int game.C_100314_lf.field_101413_Bb
		// @A07: ineg
		// @A08: bipush 30 (0x1E)
		// @A0A: invokevirtual game.C_100314_lf.func_101262_a(int, int)void
		// @A0D: iconst_m1
		// @A0E: aload #4
		// @A10: getfield int game.C_100314_lf.field_101356_w
		// @A13: iconst_m1
		// @A14: ixor
		// @A15: if_icmpgt @A53
		// @A18: aload_0
		// @A19: getfield int game.C_100018_wk.field_101541_X
		// @A1C: bipush 32 (0x20)
		// @A1E: if_icmpne @A53
		// @A21: goto @A25
		// @A24: athrow
		// @A25: aload #4
		// @A27: getfield int game.C_100314_lf.field_101387_Xb
		// @A2A: iconst_m1
		// @A2B: ixor
		// @A2C: iconst_m1
		// @A2D: if_icmpeq @A46
		// @A30: goto @A34
		// @A33: athrow
		// @A34: bipush 11 (0x0B)
		// @A36: aload #4
		// @A38: getfield int game.C_100314_lf.field_101387_Xb
		// @A3B: if_icmpeq @A46
		// @A3E: goto @A42
		// @A41: athrow
		// @A42: goto @A53
		// @A45: athrow
		// @A46: aload_0
		// @A47: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @A4A: dup
		// @A4B: getfield int game.C_100314_lf.field_101325_eb
		// @A4E: iconst_1
		// @A4F: iadd
		// @A50: putfield int game.C_100314_lf.field_101325_eb
		// @A53: aload #4
		// @A55: iload_2
		// @A56: ldc_w 312774280 (0x12a48e88)
		// @A59: iadd
		// @A5A: bipush 26 (0x1A)
		// @A5C: invokevirtual game.C_100314_lf.func_101268_f(int, int)boolean
		// @A5F: ifeq @A6E
		// @A62: aload #4
		// @A64: getfield int game.C_100314_lf.field_101413_Bb
		// @A67: iflt @A7D
		// @A6A: goto @A6E
		// @A6D: athrow
		// @A6E: aload #4
		// @A70: iconst_0
		// @A71: putfield int game.C_100314_lf.field_101413_Bb
		// @A74: iload #26
		// @A76: ifeq @A94
		// @A79: goto @A7D
		// @A7C: athrow
		// @A7D: aload #4
		// @A7F: aload #4
		// @A81: getfield int game.C_100314_lf.field_101413_Bb
		// @A84: ineg
		// @A85: aload #4
		// @A87: getfield int game.C_100314_lf.field_101358_u
		// @A8A: invokestatic java.lang.Math.min(int, int)int
		// @A8D: putfield int game.C_100314_lf.field_101413_Bb
		// @A90: goto @A94
		// @A93: athrow
		// @A94: aload_0
		// @A95: getfield int game.C_100018_wk.field_101543_db
		// @A98: iconst_m1
		// @A99: ixor
		// @A9A: aload #4
		// @A9C: getfield int game.C_100314_lf.field_101399_Ab
		// @A9F: iconst_m1
		// @AA0: ixor
		// @AA1: if_icmpge @ABF
		// @AA4: aload #4
		// @AA6: bipush 81 (0x51)
		// @AA8: invokevirtual game.C_100314_lf.func_101279_e(int)boolean
		// @AAB: ifne @AB6
		// @AAE: goto @AB2
		// @AB1: athrow
		// @AB2: goto @ABF
		// @AB5: athrow
		// @AB6: aload #4
		// @AB8: aload_0
		// @AB9: getfield int game.C_100018_wk.field_101543_db
		// @ABC: putfield int game.C_100314_lf.field_101399_Ab
		// @ABF: aload #4
		// @AC1: getfield boolean game.C_100314_lf.field_101307_pb
		// @AC4: ifeq @AE4
		// @AC7: aload #4
		// @AC9: ldc_w 312774288 (0x12a48e90)
		// @ACC: bipush 29 (0x1D)
		// @ACE: invokevirtual game.C_100314_lf.func_101268_f(int, int)boolean
		// @AD1: ifeq @ADC
		// @AD4: goto @AD8
		// @AD7: athrow
		// @AD8: goto @AE4
		// @ADB: athrow
		// @ADC: aload #4
		// @ADE: sipush 200 (0x00C8)
		// @AE1: putfield int game.C_100314_lf.field_101402_Jb
		// @AE4: iinc #3 +1
		// @AE7: iload #26
		// @AE9: ifeq @01F
		// @AEC: goto @B1A
		// @AEF: astore_3
		// @AF0: aload_3
		// @AF1: new java.lang.StringBuilder
		// @AF4: dup
		// @AF5: invokespecial java.lang.StringBuilder.<init>()void
		// @AF8: getstatic java.lang.String[] game.C_100018_wk.field_101532_ib
		// @AFB: bipush 17 (0x11)
		// @AFD: aaload
		// @AFE: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @B01: iload_1
		// @B02: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @B05: bipush 44 (0x2C)
		// @B07: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B0A: iload_2
		// @B0B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @B0E: bipush 41 (0x29)
		// @B10: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @B13: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @B16: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @B19: athrow
		// @B1A: return
	}
	
	private final boolean func_101491_b(int arg0, byte arg1)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #7
		// @005: iconst_m1
		// @006: aload_0
		// @007: getfield int game.C_100018_wk.field_101516_G
		// @00A: iconst_m1
		// @00B: ixor
		// @00C: if_icmpne @03A
		// @00F: iconst_m1
		// @010: iload_1
		// @011: iconst_m1
		// @012: ixor
		// @013: if_icmpne @03A
		// @016: goto @01A
		// @019: athrow
		// @01A: aload_0
		// @01B: aload_0
		// @01C: getfield int game.C_100018_wk.field_101548_u
		// @01F: aload_0
		// @020: getfield int game.C_100018_wk.field_101514_F
		// @023: ineg
		// @024: iadd
		// @025: putfield int game.C_100018_wk.field_101548_u
		// @028: aload_0
		// @029: aload_0
		// @02A: getfield int game.C_100018_wk.field_101545_fb
		// @02D: ineg
		// @02E: aload_0
		// @02F: getfield int game.C_100018_wk.field_101537_S
		// @032: iadd
		// @033: putfield int game.C_100018_wk.field_101537_S
		// @036: goto @03A
		// @039: athrow
		// @03A: sipush 200 (0x00C8)
		// @03D: istore_3
		// @03E: bipush -11 (0xF5)
		// @040: aload_0
		// @041: getfield int game.C_100018_wk.field_101516_G
		// @044: iconst_m1
		// @045: ixor
		// @046: if_icmpge @0D7
		// @049: aload_0
		// @04A: getfield int game.C_100018_wk.field_101548_u
		// @04D: istore #4
		// @04F: aload_0
		// @050: getfield int game.C_100018_wk.field_101537_S
		// @053: istore #5
		// @055: iload #5
		// @057: iload #5
		// @059: bipush 100 (0x64)
		// @05B: idiv
		// @05C: imul
		// @05D: iload #4
		// @05F: iload #4
		// @061: bipush 100 (0x64)
		// @063: idiv
		// @064: imul
		// @065: iadd
		// @066: i2d
		// @067: invokestatic java.lang.Math.sqrt(double)double
		// @06A: d2i
		// @06B: bipush 10 (0x0A)
		// @06D: imul
		// @06E: istore #6
		// @070: iconst_1
		// @071: iload #6
		// @073: if_icmpgt @07A
		// @076: goto @07D
		// @079: athrow
		// @07A: iconst_1
		// @07B: istore #6
		// @07D: bipush 32 (0x20)
		// @07F: aload_0
		// @080: getfield int game.C_100018_wk.field_101541_X
		// @083: if_icmpeq @0AC
		// @086: aconst_null
		// @087: aload_0
		// @088: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @08B: if_acmpeq @0A7
		// @08E: goto @092
		// @091: athrow
		// @092: aload_0
		// @093: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @096: getfield int game.C_100314_lf.field_101387_Xb
		// @099: iconst_m1
		// @09A: ixor
		// @09B: iconst_m1
		// @09C: if_icmpeq @0A7
		// @09F: goto @0A3
		// @0A2: athrow
		// @0A3: goto @0AC
		// @0A6: athrow
		// @0A7: aload_0
		// @0A8: iconst_0
		// @0A9: putfield boolean game.C_100018_wk.field_101544_hb
		// @0AC: aload_0
		// @0AD: iload #4
		// @0AF: aload_0
		// @0B0: getfield int game.C_100018_wk.field_101516_G
		// @0B3: imul
		// @0B4: iload_3
		// @0B5: imul
		// @0B6: bipush 10 (0x0A)
		// @0B8: iload #6
		// @0BA: imul
		// @0BB: idiv
		// @0BC: putfield int game.C_100018_wk.field_101519_C
		// @0BF: aload_0
		// @0C0: iload_3
		// @0C1: iload #5
		// @0C3: imul
		// @0C4: aload_0
		// @0C5: getfield int game.C_100018_wk.field_101516_G
		// @0C8: imul
		// @0C9: bipush 10 (0x0A)
		// @0CB: iload #6
		// @0CD: imul
		// @0CE: idiv
		// @0CF: putfield int game.C_100018_wk.field_101527_J
		// @0D2: iload #7
		// @0D4: ifeq @3A7
		// @0D7: aload_0
		// @0D8: getfield int game.C_100018_wk.field_101516_G
		// @0DB: iconst_m1
		// @0DC: ixor
		// @0DD: bipush -21 (0xEB)
		// @0DF: if_icmple @159
		// @0E2: goto @0E6
		// @0E5: athrow
		// @0E6: aload_0
		// @0E7: getfield int game.C_100018_wk.field_101519_C
		// @0EA: aload_0
		// @0EB: getfield int game.C_100018_wk.field_101519_C
		// @0EE: imul
		// @0EF: aload_0
		// @0F0: getfield int game.C_100018_wk.field_101527_J
		// @0F3: aload_0
		// @0F4: getfield int game.C_100018_wk.field_101527_J
		// @0F7: imul
		// @0F8: iadd
		// @0F9: i2d
		// @0FA: invokestatic java.lang.Math.sqrt(double)double
		// @0FD: d2i
		// @0FE: istore #4
		// @100: iload #4
		// @102: iconst_m1
		// @103: ixor
		// @104: bipush -2 (0xFE)
		// @106: if_icmple @10C
		// @109: iconst_1
		// @10A: istore #4
		// @10C: aload_0
		// @10D: iload_3
		// @10E: aload_0
		// @10F: getfield int game.C_100018_wk.field_101527_J
		// @112: imul
		// @113: iload #4
		// @115: idiv
		// @116: putfield int game.C_100018_wk.field_101527_J
		// @119: bipush -33 (0xDF)
		// @11B: aload_0
		// @11C: getfield int game.C_100018_wk.field_101541_X
		// @11F: iconst_m1
		// @120: ixor
		// @121: if_icmpeq @147
		// @124: aload_0
		// @125: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @128: ifnull @142
		// @12B: goto @12F
		// @12E: athrow
		// @12F: iconst_0
		// @130: aload_0
		// @131: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @134: getfield int game.C_100314_lf.field_101387_Xb
		// @137: if_icmpeq @142
		// @13A: goto @13E
		// @13D: athrow
		// @13E: goto @147
		// @141: athrow
		// @142: aload_0
		// @143: iconst_0
		// @144: putfield boolean game.C_100018_wk.field_101544_hb
		// @147: aload_0
		// @148: aload_0
		// @149: getfield int game.C_100018_wk.field_101519_C
		// @14C: iload_3
		// @14D: imul
		// @14E: iload #4
		// @150: idiv
		// @151: putfield int game.C_100018_wk.field_101519_C
		// @154: iload #7
		// @156: ifeq @3A7
		// @159: bipush 9 (0x09)
		// @15B: aload_0
		// @15C: getfield int game.C_100018_wk.field_101541_X
		// @15F: if_icmpne @17C
		// @162: goto @166
		// @165: athrow
		// @166: aload_0
		// @167: getfield int game.C_100018_wk.field_101516_G
		// @16A: bipush 30 (0x1E)
		// @16C: if_icmpne @17C
		// @16F: goto @173
		// @172: athrow
		// @173: aload_0
		// @174: iconst_1
		// @175: putfield boolean game.C_100018_wk.field_101523_O
		// @178: goto @17C
		// @17B: athrow
		// @17C: bipush 19 (0x13)
		// @17E: aload_0
		// @17F: getfield int game.C_100018_wk.field_101541_X
		// @182: if_icmpne @3A7
		// @185: bipush -31 (0xE1)
		// @187: aload_0
		// @188: getfield int game.C_100018_wk.field_101516_G
		// @18B: iconst_m1
		// @18C: ixor
		// @18D: if_icmpeq @198
		// @190: goto @194
		// @193: athrow
		// @194: goto @3A7
		// @197: athrow
		// @198: aload_0
		// @199: iconst_1
		// @19A: putfield boolean game.C_100018_wk.field_101523_O
		// @19D: new game.C_100038_wa
		// @1A0: dup
		// @1A1: iconst_1
		// @1A2: newarray int[]
		// @1A4: dup
		// @1A5: iconst_0
		// @1A6: aload_0
		// @1A7: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @1AA: getfield int game.C_100294_ki.field_106951_E
		// @1AD: iastore
		// @1AE: invokespecial game.C_100038_wa.<init>(int[])void
		// @1B1: astore #4
		// @1B3: aload_0
		// @1B4: getfield boolean game.C_100018_wk.field_101513_E
		// @1B7: ifeq @2B7
		// @1BA: aload_0
		// @1BB: getfield boolean game.C_100018_wk.field_101547_v
		// @1BE: ifne @3A7
		// @1C1: goto @1C5
		// @1C4: athrow
		// @1C5: iconst_0
		// @1C6: istore #5
		// @1C8: iload #5
		// @1CA: iconst_m1
		// @1CB: ixor
		// @1CC: bipush -8 (0xF8)
		// @1CE: if_icmple @2B2
		// @1D1: new game.C_100018_wk
		// @1D4: dup
		// @1D5: aload_0
		// @1D6: getfield int game.C_100018_wk.field_101514_F
		// @1D9: aload_0
		// @1DA: getfield int game.C_100018_wk.field_101545_fb
		// @1DD: aload_0
		// @1DE: getfield int game.C_100018_wk.field_101519_C
		// @1E1: aload_0
		// @1E2: getfield int game.C_100018_wk.field_101527_J
		// @1E5: aload_0
		// @1E6: getfield int game.C_100018_wk.field_101524_H
		// @1E9: aload_0
		// @1EA: getfield int game.C_100018_wk.field_101515_cb
		// @1ED: iconst_2
		// @1EE: aload_0
		// @1EF: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @1F2: aload_0
		// @1F3: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @1F6: aload_0
		// @1F7: getfield int game.C_100018_wk.field_101546_w
		// @1FA: iconst_2
		// @1FB: idiv
		// @1FC: aload_0
		// @1FD: getfield int game.C_100018_wk.field_101538_R
		// @200: aload_0
		// @201: getfield int game.C_100018_wk.field_101541_X
		// @204: invokespecial game.C_100018_wk.<init>(int, int, int, int, int, int, int, game.C_100294_ki, game.C_100314_lf, int, int, int)void
		// @207: astore #6
		// @209: aload #6
		// @20B: aload_0
		// @20C: getfield boolean game.C_100018_wk.field_101513_E
		// @20F: putfield boolean game.C_100018_wk.field_101513_E
		// @212: aload #6
		// @214: bipush 31 (0x1F)
		// @216: putfield int game.C_100018_wk.field_101516_G
		// @219: aload #6
		// @21B: aload_0
		// @21C: getfield boolean game.C_100018_wk.field_101542_Z
		// @21F: putfield boolean game.C_100018_wk.field_101542_Z
		// @222: aload_0
		// @223: getfield boolean game.C_100018_wk.field_101513_E
		// @226: iload #7
		// @228: ifne @3A8
		// @22B: ifeq @23C
		// @22E: goto @232
		// @231: athrow
		// @232: aload #6
		// @234: aconst_null
		// @235: putfield game.C_100314_lf[] game.C_100018_wk.field_101553_y
		// @238: goto @23C
		// @23B: athrow
		// @23C: aload #6
		// @23E: aload_0
		// @23F: getfield int game.C_100018_wk.field_101543_db
		// @242: putfield int game.C_100018_wk.field_101543_db
		// @245: aload #6
		// @247: dup
		// @248: getfield int game.C_100018_wk.field_101519_C
		// @24B: iconst_3
		// @24C: iload #5
		// @24E: sipush 8192 (0x2000)
		// @251: imul
		// @252: bipush 7 (0x07)
		// @254: idiv
		// @255: aload_0
		// @256: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @259: getfield int game.C_100294_ki.field_106951_E
		// @25C: ineg
		// @25D: isub
		// @25E: invokestatic game.C_100284_nj.func_106768_a(int, int)int
		// @261: bipush 16 (0x10)
		// @263: aload #4
		// @265: bipush -128 (0x80)
		// @267: invokestatic game.C_100294_ki.func_106900_a(int, game.C_100038_wa, byte)int
		// @26A: imul
		// @26B: ldc_w -97403889 (0xfa31bc0f)
		// @26E: ishr
		// @26F: iadd
		// @270: putfield int game.C_100018_wk.field_101519_C
		// @273: aload #6
		// @275: dup
		// @276: getfield int game.C_100018_wk.field_101527_J
		// @279: aload_0
		// @27A: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @27D: getfield int game.C_100294_ki.field_106951_E
		// @280: sipush 8192 (0x2000)
		// @283: iload #5
		// @285: imul
		// @286: bipush 7 (0x07)
		// @288: idiv
		// @289: iadd
		// @28A: iconst_0
		// @28B: invokestatic game.C_100273_mm.func_106673_a(int, boolean)int
		// @28E: bipush 16 (0x10)
		// @290: aload #4
		// @292: bipush -106 (0x96)
		// @294: invokestatic game.C_100294_ki.func_106900_a(int, game.C_100038_wa, byte)int
		// @297: imul
		// @298: ldc_w 1924620687 (0x72b7618f)
		// @29B: ishr
		// @29C: iadd
		// @29D: putfield int game.C_100018_wk.field_101527_J
		// @2A0: getstatic game.C_100202_qi game.C_100265_mh.field_106586_D
		// @2A3: bipush 124 (0x7C)
		// @2A5: aload #6
		// @2A7: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @2AA: iinc #5 +1
		// @2AD: iload #7
		// @2AF: ifeq @1C8
		// @2B2: iload #7
		// @2B4: ifeq @3A7
		// @2B7: iconst_0
		// @2B8: istore #5
		// @2BA: bipush -8 (0xF8)
		// @2BC: iload #5
		// @2BE: iconst_m1
		// @2BF: ixor
		// @2C0: if_icmpge @3A7
		// @2C3: new game.C_100018_wk
		// @2C6: dup
		// @2C7: aload_0
		// @2C8: getfield int game.C_100018_wk.field_101514_F
		// @2CB: aload_0
		// @2CC: getfield int game.C_100018_wk.field_101545_fb
		// @2CF: aload_0
		// @2D0: getfield int game.C_100018_wk.field_101519_C
		// @2D3: aload_0
		// @2D4: getfield int game.C_100018_wk.field_101527_J
		// @2D7: aload_0
		// @2D8: getfield int game.C_100018_wk.field_101524_H
		// @2DB: aload_0
		// @2DC: getfield int game.C_100018_wk.field_101515_cb
		// @2DF: iconst_2
		// @2E0: aload_0
		// @2E1: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @2E4: aload_0
		// @2E5: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @2E8: aload_0
		// @2E9: getfield int game.C_100018_wk.field_101546_w
		// @2EC: iconst_2
		// @2ED: idiv
		// @2EE: aload_0
		// @2EF: getfield int game.C_100018_wk.field_101538_R
		// @2F2: aload_0
		// @2F3: getfield int game.C_100018_wk.field_101541_X
		// @2F6: invokespecial game.C_100018_wk.<init>(int, int, int, int, int, int, int, game.C_100294_ki, game.C_100314_lf, int, int, int)void
		// @2F9: astore #6
		// @2FB: aload #6
		// @2FD: bipush 31 (0x1F)
		// @2FF: putfield int game.C_100018_wk.field_101516_G
		// @302: aload #6
		// @304: aload_0
		// @305: getfield boolean game.C_100018_wk.field_101542_Z
		// @308: putfield boolean game.C_100018_wk.field_101542_Z
		// @30B: aload #6
		// @30D: aload_0
		// @30E: getfield boolean game.C_100018_wk.field_101513_E
		// @311: putfield boolean game.C_100018_wk.field_101513_E
		// @314: aload #6
		// @316: aload_0
		// @317: getfield int game.C_100018_wk.field_101543_db
		// @31A: putfield int game.C_100018_wk.field_101543_db
		// @31D: aload_0
		// @31E: getfield boolean game.C_100018_wk.field_101513_E
		// @321: iload #7
		// @323: ifne @3A8
		// @326: ifeq @337
		// @329: goto @32D
		// @32C: athrow
		// @32D: aload #6
		// @32F: aconst_null
		// @330: putfield game.C_100314_lf[] game.C_100018_wk.field_101553_y
		// @333: goto @337
		// @336: athrow
		// @337: aload #6
		// @339: dup
		// @33A: getfield int game.C_100018_wk.field_101519_C
		// @33D: iconst_3
		// @33E: aload_0
		// @33F: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @342: getfield int game.C_100294_ki.field_106951_E
		// @345: sipush 8192 (0x2000)
		// @348: iload #5
		// @34A: imul
		// @34B: bipush 7 (0x07)
		// @34D: idiv
		// @34E: iadd
		// @34F: invokestatic game.C_100284_nj.func_106768_a(int, int)int
		// @352: bipush 16 (0x10)
		// @354: aload #4
		// @356: bipush -82 (0xAE)
		// @358: invokestatic game.C_100294_ki.func_106900_a(int, game.C_100038_wa, byte)int
		// @35B: imul
		// @35C: ldc_w 811794735 (0x3063012f)
		// @35F: ishr
		// @360: iadd
		// @361: putfield int game.C_100018_wk.field_101519_C
		// @364: aload #6
		// @366: dup
		// @367: getfield int game.C_100018_wk.field_101527_J
		// @36A: aload_0
		// @36B: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @36E: getfield int game.C_100294_ki.field_106951_E
		// @371: iload #5
		// @373: sipush 8192 (0x2000)
		// @376: imul
		// @377: bipush 7 (0x07)
		// @379: idiv
		// @37A: iadd
		// @37B: iconst_0
		// @37C: invokestatic game.C_100273_mm.func_106673_a(int, boolean)int
		// @37F: bipush 16 (0x10)
		// @381: aload #4
		// @383: bipush -128 (0x80)
		// @385: invokestatic game.C_100294_ki.func_106900_a(int, game.C_100038_wa, byte)int
		// @388: imul
		// @389: ldc_w 561435599 (0x2176d3cf)
		// @38C: ishr
		// @38D: iadd
		// @38E: putfield int game.C_100018_wk.field_101527_J
		// @391: aload_0
		// @392: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @395: getfield game.C_100202_qi game.C_100294_ki.field_106981_b
		// @398: bipush 124 (0x7C)
		// @39A: aload #6
		// @39C: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @39F: iinc #5 +1
		// @3A2: iload #7
		// @3A4: ifeq @2BA
		// @3A7: iload_2
		// @3A8: bipush 31 (0x1F)
		// @3AA: if_icmpge @3B7
		// @3AD: aload_0
		// @3AE: bipush 82 (0x52)
		// @3B0: putfield int game.C_100018_wk.field_101541_X
		// @3B3: goto @3B7
		// @3B6: athrow
		// @3B7: aload_0
		// @3B8: bipush 12 (0x0C)
		// @3BA: putfield int game.C_100018_wk.field_101515_cb
		// @3BD: aload_0
		// @3BE: getfield int game.C_100018_wk.field_101541_X
		// @3C1: bipush 32 (0x20)
		// @3C3: if_icmpne @3D3
		// @3C6: bipush 10 (0x0A)
		// @3C8: aload_0
		// @3C9: getfield int game.C_100018_wk.field_101516_G
		// @3CC: if_icmplt @478
		// @3CF: goto @3D3
		// @3D2: athrow
		// @3D3: aload_0
		// @3D4: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @3D7: getfield boolean game.C_100294_ki.field_106969_V
		// @3DA: ifne @58A
		// @3DD: goto @3E1
		// @3E0: athrow
		// @3E1: aload_0
		// @3E2: getfield boolean game.C_100018_wk.field_101513_E
		// @3E5: ifne @58A
		// @3E8: goto @3EC
		// @3EB: athrow
		// @3EC: iconst_1
		// @3ED: aload_0
		// @3EE: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @3F1: getfield int game.C_100294_ki.field_106951_E
		// @3F4: iload_1
		// @3F5: iadd
		// @3F6: iand
		// @3F7: ifne @58A
		// @3FA: goto @3FE
		// @3FD: athrow
		// @3FE: aload_0
		// @3FF: getfield int game.C_100018_wk.field_101514_F
		// @402: aload_0
		// @403: getfield int game.C_100018_wk.field_101519_C
		// @406: ineg
		// @407: iconst_2
		// @408: idiv
		// @409: aload_0
		// @40A: getfield boolean game.C_100018_wk.field_101534_V
		// @40D: aload_0
		// @40E: getfield int game.C_100018_wk.field_101545_fb
		// @411: aload_0
		// @412: getfield int game.C_100018_wk.field_101527_J
		// @415: ineg
		// @416: iconst_2
		// @417: idiv
		// @418: aload_0
		// @419: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @41C: bipush -124 (0x84)
		// @41E: aload_0
		// @41F: getfield int game.C_100018_wk.field_101514_F
		// @422: iconst_2
		// @423: bipush 50 (0x32)
		// @425: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @428: astore #4
		// @42A: aload_0
		// @42B: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @42E: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @431: bipush 123 (0x7B)
		// @433: aload #4
		// @435: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @438: aload_0
		// @439: getfield int game.C_100018_wk.field_101514_F
		// @43C: aload_0
		// @43D: getfield int game.C_100018_wk.field_101519_C
		// @440: ineg
		// @441: iconst_2
		// @442: idiv
		// @443: aload_0
		// @444: getfield boolean game.C_100018_wk.field_101534_V
		// @447: aload_0
		// @448: getfield int game.C_100018_wk.field_101545_fb
		// @44B: aload_0
		// @44C: getfield int game.C_100018_wk.field_101527_J
		// @44F: ineg
		// @450: iconst_2
		// @451: idiv
		// @452: aload_0
		// @453: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @456: bipush -124 (0x84)
		// @458: aload_0
		// @459: getfield int game.C_100018_wk.field_101514_F
		// @45C: iconst_3
		// @45D: sipush 250 (0x00FA)
		// @460: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @463: astore #4
		// @465: aload_0
		// @466: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @469: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @46C: bipush 125 (0x7D)
		// @46E: aload #4
		// @470: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @473: iload #7
		// @475: ifeq @58A
		// @478: aload_0
		// @479: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @47C: getfield boolean game.C_100294_ki.field_106969_V
		// @47F: ifne @577
		// @482: goto @486
		// @485: athrow
		// @486: aload_0
		// @487: getfield boolean game.C_100018_wk.field_101513_E
		// @48A: ifne @577
		// @48D: goto @491
		// @490: athrow
		// @491: iconst_m1
		// @492: aload_0
		// @493: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @496: getfield int game.C_100294_ki.field_106951_E
		// @499: iload_1
		// @49A: iadd
		// @49B: iconst_1
		// @49C: iand
		// @49D: iconst_m1
		// @49E: ixor
		// @49F: if_icmpeq @4AA
		// @4A2: goto @4A6
		// @4A5: athrow
		// @4A6: goto @577
		// @4A9: athrow
		// @4AA: bipush 20 (0x14)
		// @4AC: aload_0
		// @4AD: getfield int game.C_100018_wk.field_101519_C
		// @4B0: imul
		// @4B1: ineg
		// @4B2: aload_0
		// @4B3: getfield int game.C_100018_wk.field_101514_F
		// @4B6: iadd
		// @4B7: istore #4
		// @4B9: aload_0
		// @4BA: getfield int game.C_100018_wk.field_101545_fb
		// @4BD: aload_0
		// @4BE: getfield int game.C_100018_wk.field_101527_J
		// @4C1: bipush 20 (0x14)
		// @4C3: imul
		// @4C4: isub
		// @4C5: istore #5
		// @4C7: aload_0
		// @4C8: getfield int game.C_100018_wk.field_101514_F
		// @4CB: aload_0
		// @4CC: getfield int game.C_100018_wk.field_101519_C
		// @4CF: ineg
		// @4D0: aload_0
		// @4D1: getfield int game.C_100018_wk.field_101527_J
		// @4D4: ineg
		// @4D5: iadd
		// @4D6: aload_0
		// @4D7: getfield boolean game.C_100018_wk.field_101534_V
		// @4DA: iload #5
		// @4DC: aload_0
		// @4DD: getfield int game.C_100018_wk.field_101519_C
		// @4E0: aload_0
		// @4E1: getfield int game.C_100018_wk.field_101527_J
		// @4E4: isub
		// @4E5: aload_0
		// @4E6: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @4E9: bipush -124 (0x84)
		// @4EB: iload #4
		// @4ED: iconst_1
		// @4EE: bipush 50 (0x32)
		// @4F0: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @4F3: astore #6
		// @4F5: aload_0
		// @4F6: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @4F9: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @4FC: bipush 124 (0x7C)
		// @4FE: aload #6
		// @500: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @503: aload_0
		// @504: getfield int game.C_100018_wk.field_101514_F
		// @507: aload_0
		// @508: getfield int game.C_100018_wk.field_101519_C
		// @50B: ineg
		// @50C: aload_0
		// @50D: getfield int game.C_100018_wk.field_101527_J
		// @510: iadd
		// @511: aload_0
		// @512: getfield boolean game.C_100018_wk.field_101534_V
		// @515: iload #5
		// @517: aload_0
		// @518: getfield int game.C_100018_wk.field_101519_C
		// @51B: ineg
		// @51C: aload_0
		// @51D: getfield int game.C_100018_wk.field_101527_J
		// @520: ineg
		// @521: iadd
		// @522: aload_0
		// @523: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @526: bipush -124 (0x84)
		// @528: iload #4
		// @52A: iconst_1
		// @52B: bipush 50 (0x32)
		// @52D: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @530: astore #6
		// @532: aload_0
		// @533: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @536: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @539: bipush 123 (0x7B)
		// @53B: aload #6
		// @53D: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @540: aload_0
		// @541: getfield int game.C_100018_wk.field_101514_F
		// @544: aload_0
		// @545: getfield int game.C_100018_wk.field_101519_C
		// @548: ineg
		// @549: iconst_2
		// @54A: idiv
		// @54B: aload_0
		// @54C: getfield boolean game.C_100018_wk.field_101534_V
		// @54F: iload #5
		// @551: aload_0
		// @552: getfield int game.C_100018_wk.field_101527_J
		// @555: ineg
		// @556: iconst_2
		// @557: idiv
		// @558: aload_0
		// @559: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @55C: bipush -124 (0x84)
		// @55E: iload #4
		// @560: iconst_0
		// @561: sipush 250 (0x00FA)
		// @564: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @567: astore #6
		// @569: aload_0
		// @56A: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @56D: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @570: bipush 124 (0x7C)
		// @572: aload #6
		// @574: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @577: aload_0
		// @578: aload_0
		// @579: getfield int game.C_100018_wk.field_101516_G
		// @57C: iconst_2
		// @57D: irem
		// @57E: ifne @586
		// @581: iconst_1
		// @582: goto @587
		// @585: athrow
		// @586: iconst_0
		// @587: putfield boolean game.C_100018_wk.field_101544_hb
		// @58A: iconst_0
		// @58B: ireturn
		// @58C: astore_3
		// @58D: aload_3
		// @58E: new java.lang.StringBuilder
		// @591: dup
		// @592: invokespecial java.lang.StringBuilder.<init>()void
		// @595: getstatic java.lang.String[] game.C_100018_wk.field_101532_ib
		// @598: bipush 21 (0x15)
		// @59A: aaload
		// @59B: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @59E: iload_1
		// @59F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5A2: bipush 44 (0x2C)
		// @5A4: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5A7: iload_2
		// @5A8: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @5AB: bipush 41 (0x29)
		// @5AD: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5B0: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @5B3: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @5B6: athrow
	}
	
	private final boolean func_101498_a(byte arg0, int arg1)
	{
		// @00: aload_0
		// @01: bipush 10 (0x0A)
		// @03: putfield int game.C_100018_wk.field_101515_cb
		// @06: aload_0
		// @07: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0A: getfield boolean game.C_100294_ki.field_106969_V
		// @0D: ifne @67
		// @10: aload_0
		// @11: getfield boolean game.C_100018_wk.field_101513_E
		// @14: ifeq @1F
		// @17: goto @1B
		// @1A: athrow
		// @1B: goto @67
		// @1E: athrow
		// @1F: aload_0
		// @20: getfield int game.C_100018_wk.field_101514_F
		// @23: aload_0
		// @24: getfield int game.C_100018_wk.field_101519_C
		// @27: ineg
		// @28: iconst_2
		// @29: idiv
		// @2A: aload_0
		// @2B: getfield boolean game.C_100018_wk.field_101534_V
		// @2E: aload_0
		// @2F: getfield int game.C_100018_wk.field_101545_fb
		// @32: aload_0
		// @33: getfield int game.C_100018_wk.field_101527_J
		// @36: ineg
		// @37: iconst_2
		// @38: idiv
		// @39: aload_0
		// @3A: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @3D: bipush -124 (0x84)
		// @3F: aload_0
		// @40: getfield int game.C_100018_wk.field_101514_F
		// @43: iconst_3
		// @44: bipush 10 (0x0A)
		// @46: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @49: astore_3
		// @4A: aload_3
		// @4B: aload_0
		// @4C: getfield int game.C_100018_wk.field_101516_G
		// @4F: bipush 10 (0x0A)
		// @51: imul
		// @52: aload_0
		// @53: getfield int game.C_100018_wk.field_101524_H
		// @56: idiv
		// @57: putfield int game.C_100059_df.field_101598_C
		// @5A: aload_0
		// @5B: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @5E: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @61: bipush 123 (0x7B)
		// @63: aload_3
		// @64: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @67: aload_0
		// @68: getfield int game.C_100018_wk.field_101524_H
		// @6B: aload_0
		// @6C: getfield int game.C_100018_wk.field_101516_G
		// @6F: if_icmpge @9F
		// @72: aload_0
		// @73: getfield boolean game.C_100018_wk.field_101547_v
		// @76: ifeq @8C
		// @79: goto @7D
		// @7C: athrow
		// @7D: aload_0
		// @7E: iconst_1
		// @7F: putfield boolean game.C_100018_wk.field_101523_O
		// @82: getstatic int game.SteelSentinels.field_105275_O
		// @85: ifeq @9D
		// @88: goto @8C
		// @8B: athrow
		// @8C: aload_0
		// @8D: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @90: getfield game.C_100300_kc game.C_100294_ki.field_106950_D
		// @93: bipush 125 (0x7D)
		// @95: aload_0
		// @96: invokevirtual game.C_100300_kc.func_107058_a(int, game.C_100325_id)void
		// @99: goto @9D
		// @9C: athrow
		// @9D: iconst_1
		// @9E: ireturn
		// @9F: aload_0
		// @A0: iconst_0
		// @A1: putfield boolean game.C_100018_wk.field_101544_hb
		// @A4: iload_1
		// @A5: bipush 97 (0x61)
		// @A7: if_icmpge @B3
		// @AA: aload_0
		// @AB: iconst_0
		// @AC: putfield boolean game.C_100018_wk.field_101522_N
		// @AF: goto @B3
		// @B2: athrow
		// @B3: iconst_0
		// @B4: ireturn
		// @B5: astore_3
		// @B6: aload_3
		// @B7: new java.lang.StringBuilder
		// @BA: dup
		// @BB: invokespecial java.lang.StringBuilder.<init>()void
		// @BE: getstatic java.lang.String[] game.C_100018_wk.field_101532_ib
		// @C1: bipush 16 (0x10)
		// @C3: aaload
		// @C4: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @C7: iload_1
		// @C8: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @CB: bipush 44 (0x2C)
		// @CD: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D0: iload_2
		// @D1: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @D4: bipush 41 (0x29)
		// @D6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D9: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @DC: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @DF: athrow
	}
	
	private final void func_101508_a(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #22
		// @005: iload_1
		// @006: iload_2
		// @007: ineg
		// @008: isub
		// @009: iflt @010
		// @00C: goto @02A
		// @00F: athrow
		// @010: iload #4
		// @012: iload_1
		// @013: ldc_w -1129636092 (0xbcab1f04)
		// @016: ishr
		// @017: iadd
		// @018: istore #4
		// @01A: iload_1
		// @01B: ineg
		// @01C: istore_1
		// @01D: iload #7
		// @01F: iload_2
		// @020: ldc_w -949316412 (0xc76a94c4)
		// @023: ishr
		// @024: iadd
		// @025: istore #7
		// @027: iload_2
		// @028: ineg
		// @029: istore_2
		// @02A: getstatic int game.C_100196_rb.field_105827_i
		// @02D: istore #9
		// @02F: getstatic int game.C_100196_rb.field_105820_b
		// @032: istore #10
		// @034: getstatic int game.C_100196_rb.field_105816_f
		// @037: istore #11
		// @039: getstatic int game.C_100196_rb.field_105823_l
		// @03C: istore #12
		// @03E: getstatic int game.C_100196_rb.field_105819_e
		// @041: istore #13
		// @043: iload #8
		// @045: sipush 32401 (0x7E91)
		// @048: if_icmpeq @056
		// @04B: aconst_null
		// @04C: checkcast game.C_100302_ka
		// @04F: putstatic game.C_100302_ka game.C_100018_wk.field_101531_T
		// @052: goto @056
		// @055: athrow
		// @056: getstatic int[] game.C_100196_rb.field_105818_d
		// @059: astore #17
		// @05B: aload_0
		// @05C: getfield boolean game.C_100018_wk.field_101525_eb
		// @05F: ifne @09B
		// @062: aload_0
		// @063: getfield int game.C_100018_wk.field_101541_X
		// @066: iconst_m1
		// @067: ixor
		// @068: bipush -36 (0xDC)
		// @06A: if_icmpeq @09B
		// @06D: goto @071
		// @070: athrow
		// @071: iconst_4
		// @072: aload_0
		// @073: getfield int game.C_100018_wk.field_101541_X
		// @076: if_icmpne @081
		// @079: goto @07D
		// @07C: athrow
		// @07D: goto @09B
		// @080: athrow
		// @081: iload #4
		// @083: iload #7
		// @085: iload #5
		// @087: iconst_1
		// @088: isub
		// @089: ldc 16777215 (0xffffff)
		// @08B: invokestatic game.C_100196_rb.func_105795_d(int, int, int, int)void
		// @08E: iload #4
		// @090: iload #7
		// @092: iload #5
		// @094: iconst_m1
		// @095: iadd
		// @096: iload #6
		// @098: invokestatic game.C_100196_rb.func_105776_b(int, int, int, int)void
		// @09B: iload_1
		// @09C: iload_2
		// @09D: if_icmpgt @231
		// @0A0: iload #9
		// @0A2: iload #5
		// @0A4: iadd
		// @0A5: istore #9
		// @0A7: iload #4
		// @0A9: bipush 16 (0x10)
		// @0AB: ishl
		// @0AC: istore #4
		// @0AE: iload #10
		// @0B0: iload #5
		// @0B2: isub
		// @0B3: istore #10
		// @0B5: iload_2
		// @0B6: iconst_4
		// @0B7: ishr
		// @0B8: istore_2
		// @0B9: iload #4
		// @0BB: ldc_w 32768 (0x8000)
		// @0BE: iadd
		// @0BF: istore #4
		// @0C1: iload_1
		// @0C2: bipush 12 (0x0C)
		// @0C4: ishl
		// @0C5: istore_1
		// @0C6: iload_1
		// @0C7: i2d
		// @0C8: iload_2
		// @0C9: i2d
		// @0CA: ddiv
		// @0CB: ldc2_w 0.5
		// @0CE: dadd
		// @0CF: invokestatic java.lang.Math.floor(double)double
		// @0D2: d2i
		// @0D3: istore #18
		// @0D5: iload_2
		// @0D6: iload #7
		// @0D8: iadd
		// @0D9: istore_2
		// @0DA: iload #7
		// @0DC: iload #11
		// @0DE: if_icmpge @0F3
		// @0E1: iload #4
		// @0E3: iload #7
		// @0E5: ineg
		// @0E6: iload #11
		// @0E8: iadd
		// @0E9: iload #18
		// @0EB: imul
		// @0EC: iadd
		// @0ED: istore #4
		// @0EF: iload #11
		// @0F1: istore #7
		// @0F3: iload_2
		// @0F4: iload #12
		// @0F6: if_icmpge @0FD
		// @0F9: goto @102
		// @0FC: athrow
		// @0FD: iload #12
		// @0FF: iconst_m1
		// @100: iadd
		// @101: istore_2
		// @102: iload_2
		// @103: iconst_m1
		// @104: ixor
		// @105: iload #7
		// @107: iconst_m1
		// @108: ixor
		// @109: if_icmpgt @22C
		// @10C: iload #4
		// @10E: ldc_w -641811088 (0xd9bebd70)
		// @111: ishr
		// @112: istore #19
		// @114: iload #4
		// @116: iload #18
		// @118: iadd
		// @119: istore #4
		// @11B: iload #22
		// @11D: ifne @3D6
		// @120: iload #9
		// @122: iload #19
		// @124: if_icmpgt @224
		// @127: goto @12B
		// @12A: athrow
		// @12B: iload #10
		// @12D: iconst_m1
		// @12E: ixor
		// @12F: iload #19
		// @131: iconst_m1
		// @132: ixor
		// @133: if_icmplt @13E
		// @136: goto @13A
		// @139: athrow
		// @13A: goto @224
		// @13D: athrow
		// @13E: iload #5
		// @140: ineg
		// @141: iload #7
		// @143: iload #13
		// @145: imul
		// @146: iload #19
		// @148: iadd
		// @149: iadd
		// @14A: istore #14
		// @14C: iconst_0
		// @14D: istore #20
		// @14F: iload #20
		// @151: iload #5
		// @153: if_icmpge @1B5
		// @156: aload_3
		// @157: iload #20
		// @159: iaload
		// @15A: istore #6
		// @15C: iinc #14 +1
		// @15F: aload #17
		// @161: iload #14
		// @163: iaload
		// @164: istore #15
		// @166: iload #15
		// @168: iload #6
		// @16A: iadd
		// @16B: istore #16
		// @16D: ldc 16711935 (0xff00ff)
		// @16F: iload #15
		// @171: iand
		// @172: ldc 16711935 (0xff00ff)
		// @174: iload #6
		// @176: iand
		// @177: iadd
		// @178: istore #21
		// @17A: iload #21
		// @17C: ldc_w 16777472 (0x1000100)
		// @17F: iand
		// @180: ldc 65536 (0x10000)
		// @182: iload #16
		// @184: iload #21
		// @186: isub
		// @187: iand
		// @188: ineg
		// @189: isub
		// @18A: istore #15
		// @18C: aload #17
		// @18E: iload #14
		// @190: iload #15
		// @192: ldc_w 1997857128 (0x7714e168)
		// @195: iushr
		// @196: ineg
		// @197: iload #15
		// @199: iadd
		// @19A: iload #16
		// @19C: iload #15
		// @19E: ineg
		// @19F: iadd
		// @1A0: invokestatic game.C_100116_ei.func_104117_a(int, int)int
		// @1A3: iastore
		// @1A4: iinc #20 +1
		// @1A7: iload #22
		// @1A9: ifne @1BC
		// @1AC: iload #22
		// @1AE: ifeq @14F
		// @1B1: goto @1B5
		// @1B4: athrow
		// @1B5: iload #14
		// @1B7: iload #5
		// @1B9: iadd
		// @1BA: istore #14
		// @1BC: iconst_1
		// @1BD: istore #20
		// @1BF: iload #5
		// @1C1: iload #20
		// @1C3: if_icmple @224
		// @1C6: iinc #14 +255
		// @1C9: aload_3
		// @1CA: iload #20
		// @1CC: iaload
		// @1CD: istore #6
		// @1CF: aload #17
		// @1D1: iload #14
		// @1D3: iaload
		// @1D4: istore #15
		// @1D6: iload #6
		// @1D8: iload #15
		// @1DA: iadd
		// @1DB: istore #16
		// @1DD: iload #15
		// @1DF: ldc 16711935 (0xff00ff)
		// @1E1: iand
		// @1E2: iload #6
		// @1E4: ldc 16711935 (0xff00ff)
		// @1E6: iand
		// @1E7: iadd
		// @1E8: istore #21
		// @1EA: ldc_w 16777472 (0x1000100)
		// @1ED: iload #21
		// @1EF: iand
		// @1F0: iload #16
		// @1F2: iload #21
		// @1F4: isub
		// @1F5: ldc 65536 (0x10000)
		// @1F7: iand
		// @1F8: ineg
		// @1F9: isub
		// @1FA: istore #15
		// @1FC: aload #17
		// @1FE: iload #14
		// @200: iload #15
		// @202: iload #15
		// @204: ldc_w 1759317896 (0x68dd0f88)
		// @207: iushr
		// @208: isub
		// @209: iload #16
		// @20B: iload #15
		// @20D: ineg
		// @20E: iadd
		// @20F: invokestatic game.C_100116_ei.func_104117_a(int, int)int
		// @212: iastore
		// @213: iinc #20 +1
		// @216: iload #22
		// @218: ifne @227
		// @21B: iload #22
		// @21D: ifeq @1BF
		// @220: goto @224
		// @223: athrow
		// @224: iinc #7 +1
		// @227: iload #22
		// @229: ifeq @102
		// @22C: iload #22
		// @22E: ifeq @3D6
		// @231: iload #7
		// @233: bipush 16 (0x10)
		// @235: ishl
		// @236: istore #7
		// @238: iload #11
		// @23A: iload #5
		// @23C: iadd
		// @23D: istore #11
		// @23F: iload #12
		// @241: iload #5
		// @243: isub
		// @244: istore #12
		// @246: iload #7
		// @248: ldc_w 32768 (0x8000)
		// @24B: iadd
		// @24C: istore #7
		// @24E: iload_1
		// @24F: iconst_4
		// @250: ishr
		// @251: istore_1
		// @252: iload_2
		// @253: bipush 12 (0x0C)
		// @255: ishl
		// @256: istore_2
		// @257: ldc2_w 0.5
		// @25A: iload_2
		// @25B: i2d
		// @25C: iload_1
		// @25D: i2d
		// @25E: ddiv
		// @25F: dadd
		// @260: invokestatic java.lang.Math.floor(double)double
		// @263: d2i
		// @264: istore #18
		// @266: iload_1
		// @267: iload #4
		// @269: iadd
		// @26A: istore_1
		// @26B: iload_1
		// @26C: iload #10
		// @26E: if_icmplt @276
		// @271: iconst_m1
		// @272: iload #10
		// @274: iadd
		// @275: istore_1
		// @276: iload #9
		// @278: iconst_m1
		// @279: ixor
		// @27A: iload #4
		// @27C: iconst_m1
		// @27D: ixor
		// @27E: if_icmplt @285
		// @281: goto @297
		// @284: athrow
		// @285: iload #7
		// @287: iload #18
		// @289: iload #9
		// @28B: iload #4
		// @28D: ineg
		// @28E: iadd
		// @28F: imul
		// @290: iadd
		// @291: istore #7
		// @293: iload #9
		// @295: istore #4
		// @297: iload_1
		// @298: iconst_m1
		// @299: ixor
		// @29A: iload #4
		// @29C: iconst_m1
		// @29D: ixor
		// @29E: if_icmpgt @3D6
		// @2A1: iload #7
		// @2A3: ldc_w 725666000 (0x2b40c8d0)
		// @2A6: ishr
		// @2A7: istore #19
		// @2A9: iload #22
		// @2AB: ifne @452
		// @2AE: iload #19
		// @2B0: iconst_m1
		// @2B1: ixor
		// @2B2: iload #11
		// @2B4: iconst_m1
		// @2B5: ixor
		// @2B6: if_icmpgt @3C7
		// @2B9: goto @2BD
		// @2BC: athrow
		// @2BD: iload #19
		// @2BF: iconst_m1
		// @2C0: ixor
		// @2C1: iload #12
		// @2C3: iconst_m1
		// @2C4: ixor
		// @2C5: if_icmpgt @2D0
		// @2C8: goto @2CC
		// @2CB: athrow
		// @2CC: goto @3C7
		// @2CF: athrow
		// @2D0: iload #13
		// @2D2: iload #5
		// @2D4: imul
		// @2D5: ineg
		// @2D6: iload #4
		// @2D8: iadd
		// @2D9: iload #19
		// @2DB: iload #13
		// @2DD: imul
		// @2DE: ineg
		// @2DF: isub
		// @2E0: istore #14
		// @2E2: iconst_0
		// @2E3: istore #20
		// @2E5: iload #20
		// @2E7: iload #5
		// @2E9: if_icmpge @34F
		// @2EC: aload_3
		// @2ED: iload #20
		// @2EF: iaload
		// @2F0: istore #6
		// @2F2: iload #14
		// @2F4: iload #13
		// @2F6: iadd
		// @2F7: istore #14
		// @2F9: aload #17
		// @2FB: iload #14
		// @2FD: iaload
		// @2FE: istore #15
		// @300: iload #6
		// @302: iload #15
		// @304: ineg
		// @305: isub
		// @306: istore #16
		// @308: iload #15
		// @30A: ldc 16711935 (0xff00ff)
		// @30C: iand
		// @30D: ldc 16711935 (0xff00ff)
		// @30F: iload #6
		// @311: iand
		// @312: iadd
		// @313: istore #21
		// @315: ldc 65536 (0x10000)
		// @317: iload #16
		// @319: iload #21
		// @31B: isub
		// @31C: iand
		// @31D: ldc_w 16777472 (0x1000100)
		// @320: iload #21
		// @322: iand
		// @323: iadd
		// @324: istore #15
		// @326: aload #17
		// @328: iload #14
		// @32A: iload #15
		// @32C: ldc_w 198499560 (0xbd4dce8)
		// @32F: iushr
		// @330: ineg
		// @331: iload #15
		// @333: iadd
		// @334: iload #16
		// @336: iload #15
		// @338: ineg
		// @339: iadd
		// @33A: invokestatic game.C_100116_ei.func_104117_a(int, int)int
		// @33D: iastore
		// @33E: iinc #20 +1
		// @341: iload #22
		// @343: ifne @359
		// @346: iload #22
		// @348: ifeq @2E5
		// @34B: goto @34F
		// @34E: athrow
		// @34F: iload #14
		// @351: iload #13
		// @353: iload #5
		// @355: imul
		// @356: iadd
		// @357: istore #14
		// @359: iconst_1
		// @35A: istore #20
		// @35C: iload #5
		// @35E: iload #20
		// @360: if_icmple @3C7
		// @363: iload #14
		// @365: iload #13
		// @367: isub
		// @368: istore #14
		// @36A: aload_3
		// @36B: iload #20
		// @36D: iaload
		// @36E: istore #6
		// @370: aload #17
		// @372: iload #14
		// @374: iaload
		// @375: istore #15
		// @377: iload #6
		// @379: iload #15
		// @37B: ineg
		// @37C: isub
		// @37D: istore #16
		// @37F: iload #6
		// @381: ldc 16711935 (0xff00ff)
		// @383: iand
		// @384: ldc 16711935 (0xff00ff)
		// @386: iload #15
		// @388: iand
		// @389: ineg
		// @38A: isub
		// @38B: istore #21
		// @38D: ldc 65536 (0x10000)
		// @38F: iload #16
		// @391: iload #21
		// @393: isub
		// @394: iand
		// @395: ldc_w 16777472 (0x1000100)
		// @398: iload #21
		// @39A: iand
		// @39B: iadd
		// @39C: istore #15
		// @39E: aload #17
		// @3A0: iload #14
		// @3A2: iload #15
		// @3A4: ineg
		// @3A5: iload #16
		// @3A7: iadd
		// @3A8: iload #15
		// @3AA: ldc_w 922170312 (0x36f733c8)
		// @3AD: iushr
		// @3AE: ineg
		// @3AF: iload #15
		// @3B1: iadd
		// @3B2: invokestatic game.C_100116_ei.func_104117_a(int, int)int
		// @3B5: iastore
		// @3B6: iinc #20 +1
		// @3B9: iload #22
		// @3BB: ifne @3D1
		// @3BE: iload #22
		// @3C0: ifeq @35C
		// @3C3: goto @3C7
		// @3C6: athrow
		// @3C7: iload #7
		// @3C9: iload #18
		// @3CB: iadd
		// @3CC: istore #7
		// @3CE: iinc #4 +1
		// @3D1: iload #22
		// @3D3: ifeq @297
		// @3D6: goto @452
		// @3D9: astore #9
		// @3DB: aload #9
		// @3DD: new java.lang.StringBuilder
		// @3E0: dup
		// @3E1: invokespecial java.lang.StringBuilder.<init>()void
		// @3E4: getstatic java.lang.String[] game.C_100018_wk.field_101532_ib
		// @3E7: bipush 15 (0x0F)
		// @3E9: aaload
		// @3EA: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3ED: iload_1
		// @3EE: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3F1: bipush 44 (0x2C)
		// @3F3: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3F6: iload_2
		// @3F7: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3FA: bipush 44 (0x2C)
		// @3FC: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @3FF: aload_3
		// @400: ifnull @40C
		// @403: getstatic java.lang.String[] game.C_100018_wk.field_101532_ib
		// @406: iconst_4
		// @407: aaload
		// @408: goto @411
		// @40B: athrow
		// @40C: getstatic java.lang.String[] game.C_100018_wk.field_101532_ib
		// @40F: iconst_2
		// @410: aaload
		// @411: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @414: bipush 44 (0x2C)
		// @416: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @419: iload #4
		// @41B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @41E: bipush 44 (0x2C)
		// @420: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @423: iload #5
		// @425: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @428: bipush 44 (0x2C)
		// @42A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @42D: iload #6
		// @42F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @432: bipush 44 (0x2C)
		// @434: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @437: iload #7
		// @439: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @43C: bipush 44 (0x2C)
		// @43E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @441: iload #8
		// @443: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @446: bipush 41 (0x29)
		// @448: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @44B: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @44E: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @451: athrow
		// @452: return
	}
	
	private final boolean func_101511_c(int arg0, int arg1)
	{
		// @000: aload_0
		// @001: bipush 8 (0x08)
		// @003: putfield int game.C_100018_wk.field_101515_cb
		// @006: aload_0
		// @007: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @00A: getfield boolean game.C_100294_ki.field_106969_V
		// @00D: ifne @0DF
		// @010: aload_0
		// @011: getfield boolean game.C_100018_wk.field_101513_E
		// @014: ifne @0DF
		// @017: goto @01B
		// @01A: athrow
		// @01B: bipush 100 (0x64)
		// @01D: istore_3
		// @01E: ldc2_w 0.5
		// @021: dstore #4
		// @023: bipush -4 (0xFC)
		// @025: aload_0
		// @026: getfield int game.C_100018_wk.field_101541_X
		// @029: iconst_m1
		// @02A: ixor
		// @02B: if_icmpne @036
		// @02E: ldc2_w 0.5
		// @031: dstore #4
		// @033: bipush 100 (0x64)
		// @035: istore_3
		// @036: bipush 16 (0x10)
		// @038: aload_0
		// @039: getfield int game.C_100018_wk.field_101541_X
		// @03C: if_icmpne @047
		// @03F: bipush 100 (0x64)
		// @041: istore_3
		// @042: ldc2_w 0.4
		// @045: dstore #4
		// @047: aload_0
		// @048: getfield int game.C_100018_wk.field_101541_X
		// @04B: bipush 29 (0x1D)
		// @04D: if_icmpne @059
		// @050: sipush 200 (0x00C8)
		// @053: istore_3
		// @054: ldc2_w 0.3
		// @057: dstore #4
		// @059: aload_0
		// @05A: getfield int game.C_100018_wk.field_101519_C
		// @05D: aload_0
		// @05E: getfield int game.C_100018_wk.field_101519_C
		// @061: imul
		// @062: aload_0
		// @063: getfield int game.C_100018_wk.field_101527_J
		// @066: aload_0
		// @067: getfield int game.C_100018_wk.field_101527_J
		// @06A: imul
		// @06B: ineg
		// @06C: isub
		// @06D: i2d
		// @06E: invokestatic java.lang.Math.sqrt(double)double
		// @071: d2i
		// @072: istore #6
		// @074: iload_3
		// @075: i2d
		// @076: aload_0
		// @077: getfield int game.C_100018_wk.field_101516_G
		// @07A: aload_0
		// @07B: getfield int game.C_100018_wk.field_101515_cb
		// @07E: imul
		// @07F: iload_2
		// @080: iadd
		// @081: i2d
		// @082: dload #4
		// @084: dmul
		// @085: invokestatic java.lang.Math.sin(double)double
		// @088: dmul
		// @089: d2i
		// @08A: istore #7
		// @08C: iload #6
		// @08E: ifgt @095
		// @091: goto @0DF
		// @094: athrow
		// @095: iload #7
		// @097: aload_0
		// @098: getfield int game.C_100018_wk.field_101527_J
		// @09B: imul
		// @09C: iload #6
		// @09E: idiv
		// @09F: istore #8
		// @0A1: iload #7
		// @0A3: aload_0
		// @0A4: getfield int game.C_100018_wk.field_101519_C
		// @0A7: ineg
		// @0A8: imul
		// @0A9: iload #6
		// @0AB: idiv
		// @0AC: istore #9
		// @0AE: aload_0
		// @0AF: getfield int game.C_100018_wk.field_101514_F
		// @0B2: iload #8
		// @0B4: aload_0
		// @0B5: getfield boolean game.C_100018_wk.field_101534_V
		// @0B8: aload_0
		// @0B9: getfield int game.C_100018_wk.field_101545_fb
		// @0BC: iload #9
		// @0BE: aload_0
		// @0BF: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0C2: bipush -124 (0x84)
		// @0C4: aload_0
		// @0C5: getfield int game.C_100018_wk.field_101514_F
		// @0C8: bipush 6 (0x06)
		// @0CA: bipush 100 (0x64)
		// @0CC: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @0CF: astore #10
		// @0D1: aload_0
		// @0D2: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0D5: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @0D8: bipush 126 (0x7E)
		// @0DA: aload #10
		// @0DC: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0DF: iload_1
		// @0E0: bipush 64 (0x40)
		// @0E2: if_icmpeq @0E7
		// @0E5: iconst_1
		// @0E6: ireturn
		// @0E7: iconst_0
		// @0E8: ireturn
		// @0E9: astore_3
		// @0EA: aload_3
		// @0EB: new java.lang.StringBuilder
		// @0EE: dup
		// @0EF: invokespecial java.lang.StringBuilder.<init>()void
		// @0F2: getstatic java.lang.String[] game.C_100018_wk.field_101532_ib
		// @0F5: bipush 20 (0x14)
		// @0F7: aaload
		// @0F8: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @0FB: iload_1
		// @0FC: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @0FF: bipush 44 (0x2C)
		// @101: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @104: iload_2
		// @105: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @108: bipush 41 (0x29)
		// @10A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @10D: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @110: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @113: athrow
	}
	
	private final boolean func_101501_a(int arg0, int arg1)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #6
		// @005: aload_0
		// @006: getfield int game.C_100018_wk.field_101515_cb
		// @009: ifeq @01B
		// @00C: bipush -8 (0xF8)
		// @00E: aload_0
		// @00F: getfield int game.C_100018_wk.field_101515_cb
		// @012: iconst_m1
		// @013: ixor
		// @014: if_icmpne @025
		// @017: goto @01B
		// @01A: athrow
		// @01B: aload_0
		// @01C: bipush 8 (0x08)
		// @01E: putfield int game.C_100018_wk.field_101515_cb
		// @021: goto @025
		// @024: athrow
		// @025: iload_2
		// @026: sipush 1000 (0x03E8)
		// @029: if_icmpeq @035
		// @02C: aload_0
		// @02D: iconst_0
		// @02E: invokespecial game.C_100018_wk.func_101500_b(boolean)void
		// @031: goto @035
		// @034: athrow
		// @035: bipush 15 (0x0F)
		// @037: aload_0
		// @038: getfield int game.C_100018_wk.field_101541_X
		// @03B: if_icmpeq @042
		// @03E: goto @048
		// @041: athrow
		// @042: aload_0
		// @043: bipush 16 (0x10)
		// @045: putfield int game.C_100018_wk.field_101515_cb
		// @048: iconst_2
		// @049: aload_0
		// @04A: getfield int game.C_100018_wk.field_101541_X
		// @04D: if_icmpne @339
		// @050: aload_0
		// @051: getfield int game.C_100018_wk.field_101516_G
		// @054: iconst_m1
		// @055: ixor
		// @056: aload_0
		// @057: getfield int game.C_100018_wk.field_101526_I
		// @05A: iconst_m1
		// @05B: ixor
		// @05C: if_icmplt @06E
		// @05F: goto @063
		// @062: athrow
		// @063: aload_0
		// @064: getfield boolean game.C_100018_wk.field_101522_N
		// @067: ifeq @339
		// @06A: goto @06E
		// @06D: athrow
		// @06E: aload_0
		// @06F: iconst_1
		// @070: putfield boolean game.C_100018_wk.field_101523_O
		// @073: aload_0
		// @074: getfield boolean game.C_100018_wk.field_101522_N
		// @077: ifeq @091
		// @07A: goto @07E
		// @07D: athrow
		// @07E: aload_0
		// @07F: iconst_0
		// @080: putfield int game.C_100018_wk.field_101527_J
		// @083: aload_0
		// @084: iconst_0
		// @085: putfield int game.C_100018_wk.field_101519_C
		// @088: iload #6
		// @08A: ifeq @0A9
		// @08D: goto @091
		// @090: athrow
		// @091: aload_0
		// @092: dup
		// @093: getfield int game.C_100018_wk.field_101527_J
		// @096: iconst_2
		// @097: idiv
		// @098: putfield int game.C_100018_wk.field_101527_J
		// @09B: aload_0
		// @09C: dup
		// @09D: getfield int game.C_100018_wk.field_101519_C
		// @0A0: iconst_2
		// @0A1: idiv
		// @0A2: putfield int game.C_100018_wk.field_101519_C
		// @0A5: goto @0A9
		// @0A8: athrow
		// @0A9: aload_0
		// @0AA: getfield boolean game.C_100018_wk.field_101513_E
		// @0AD: ifeq @1CE
		// @0B0: aload_0
		// @0B1: getfield boolean game.C_100018_wk.field_101547_v
		// @0B4: ifne @2E7
		// @0B7: goto @0BB
		// @0BA: athrow
		// @0BB: new game.C_100038_wa
		// @0BE: dup
		// @0BF: iconst_3
		// @0C0: newarray int[]
		// @0C2: dup
		// @0C3: iconst_0
		// @0C4: aload_0
		// @0C5: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0C8: getfield int game.C_100294_ki.field_106951_E
		// @0CB: iastore
		// @0CC: dup
		// @0CD: iconst_1
		// @0CE: aload_0
		// @0CF: getfield int game.C_100018_wk.field_101514_F
		// @0D2: iastore
		// @0D3: dup
		// @0D4: iconst_2
		// @0D5: aload_0
		// @0D6: getfield int game.C_100018_wk.field_101545_fb
		// @0D9: iastore
		// @0DA: invokespecial game.C_100038_wa.<init>(int[])void
		// @0DD: astore_3
		// @0DE: iconst_0
		// @0DF: istore #4
		// @0E1: iload #4
		// @0E3: iconst_m1
		// @0E4: ixor
		// @0E5: aload_0
		// @0E6: getfield int game.C_100018_wk.field_101551_ab
		// @0E9: iconst_m1
		// @0EA: ixor
		// @0EB: if_icmple @1C9
		// @0EE: new game.C_100018_wk
		// @0F1: dup
		// @0F2: aload_0
		// @0F3: getfield int game.C_100018_wk.field_101514_F
		// @0F6: aload_0
		// @0F7: getfield int game.C_100018_wk.field_101545_fb
		// @0FA: aload_0
		// @0FB: getfield int game.C_100018_wk.field_101519_C
		// @0FE: aload_0
		// @0FF: getfield int game.C_100018_wk.field_101527_J
		// @102: aload_0
		// @103: getfield int game.C_100018_wk.field_101524_H
		// @106: aload_0
		// @107: getfield int game.C_100018_wk.field_101515_cb
		// @10A: bipush 8 (0x08)
		// @10C: aload_0
		// @10D: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @110: aload_0
		// @111: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @114: aload_0
		// @115: getfield int game.C_100018_wk.field_101546_w
		// @118: aload_0
		// @119: getfield int game.C_100018_wk.field_101538_R
		// @11C: aload_0
		// @11D: getfield int game.C_100018_wk.field_101541_X
		// @120: invokespecial game.C_100018_wk.<init>(int, int, int, int, int, int, int, game.C_100294_ki, game.C_100314_lf, int, int, int)void
		// @123: astore #5
		// @125: aload #5
		// @127: aload_0
		// @128: getfield boolean game.C_100018_wk.field_101513_E
		// @12B: putfield boolean game.C_100018_wk.field_101513_E
		// @12E: aload #5
		// @130: aload_0
		// @131: getfield boolean game.C_100018_wk.field_101542_Z
		// @134: putfield boolean game.C_100018_wk.field_101542_Z
		// @137: aload_0
		// @138: getfield boolean game.C_100018_wk.field_101513_E
		// @13B: iload #6
		// @13D: ifne @2EE
		// @140: ifeq @151
		// @143: goto @147
		// @146: athrow
		// @147: aload #5
		// @149: aconst_null
		// @14A: putfield game.C_100314_lf[] game.C_100018_wk.field_101553_y
		// @14D: goto @151
		// @150: athrow
		// @151: aload #5
		// @153: aload_0
		// @154: getfield int game.C_100018_wk.field_101543_db
		// @157: putfield int game.C_100018_wk.field_101543_db
		// @15A: aload #5
		// @15C: dup
		// @15D: getfield int game.C_100018_wk.field_101519_C
		// @160: iload_2
		// @161: sipush -997 (0xFC1B)
		// @164: iadd
		// @165: iload #4
		// @167: sipush 8192 (0x2000)
		// @16A: imul
		// @16B: bipush 10 (0x0A)
		// @16D: idiv
		// @16E: aload_0
		// @16F: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @172: getfield int game.C_100294_ki.field_106951_E
		// @175: ineg
		// @176: isub
		// @177: invokestatic game.C_100284_nj.func_106768_a(int, int)int
		// @17A: bipush 64 (0x40)
		// @17C: aload_3
		// @17D: bipush -77 (0xB3)
		// @17F: invokestatic game.C_100294_ki.func_106900_a(int, game.C_100038_wa, byte)int
		// @182: imul
		// @183: ldc_w 490148304 (0x1d3711d0)
		// @186: ishr
		// @187: iadd
		// @188: putfield int game.C_100018_wk.field_101519_C
		// @18B: aload #5
		// @18D: dup
		// @18E: getfield int game.C_100018_wk.field_101527_J
		// @191: aload_0
		// @192: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @195: getfield int game.C_100294_ki.field_106951_E
		// @198: sipush 8192 (0x2000)
		// @19B: iload #4
		// @19D: imul
		// @19E: bipush 10 (0x0A)
		// @1A0: idiv
		// @1A1: iadd
		// @1A2: iconst_0
		// @1A3: invokestatic game.C_100273_mm.func_106673_a(int, boolean)int
		// @1A6: bipush 48 (0x30)
		// @1A8: aload_3
		// @1A9: bipush -113 (0x8F)
		// @1AB: invokestatic game.C_100294_ki.func_106900_a(int, game.C_100038_wa, byte)int
		// @1AE: imul
		// @1AF: ldc_w 1868575024 (0x6f603130)
		// @1B2: ishr
		// @1B3: iadd
		// @1B4: putfield int game.C_100018_wk.field_101527_J
		// @1B7: getstatic game.C_100202_qi game.C_100265_mh.field_106586_D
		// @1BA: bipush 126 (0x7E)
		// @1BC: aload #5
		// @1BE: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @1C1: iinc #4 +1
		// @1C4: iload #6
		// @1C6: ifeq @0E1
		// @1C9: iload #6
		// @1CB: ifeq @2E7
		// @1CE: new game.C_100038_wa
		// @1D1: dup
		// @1D2: iconst_3
		// @1D3: newarray int[]
		// @1D5: dup
		// @1D6: iconst_0
		// @1D7: aload_0
		// @1D8: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @1DB: getfield int game.C_100294_ki.field_106951_E
		// @1DE: iastore
		// @1DF: dup
		// @1E0: iconst_1
		// @1E1: aload_0
		// @1E2: getfield int game.C_100018_wk.field_101514_F
		// @1E5: iastore
		// @1E6: dup
		// @1E7: iconst_2
		// @1E8: aload_0
		// @1E9: getfield int game.C_100018_wk.field_101545_fb
		// @1EC: iastore
		// @1ED: invokespecial game.C_100038_wa.<init>(int[])void
		// @1F0: astore_3
		// @1F1: iconst_0
		// @1F2: istore #4
		// @1F4: iload #4
		// @1F6: iconst_m1
		// @1F7: ixor
		// @1F8: aload_0
		// @1F9: getfield int game.C_100018_wk.field_101551_ab
		// @1FC: iconst_m1
		// @1FD: ixor
		// @1FE: if_icmple @2E7
		// @201: new game.C_100018_wk
		// @204: dup
		// @205: aload_0
		// @206: getfield int game.C_100018_wk.field_101514_F
		// @209: aload_0
		// @20A: getfield int game.C_100018_wk.field_101545_fb
		// @20D: aload_0
		// @20E: getfield int game.C_100018_wk.field_101519_C
		// @211: aload_0
		// @212: getfield int game.C_100018_wk.field_101527_J
		// @215: aload_0
		// @216: getfield int game.C_100018_wk.field_101524_H
		// @219: aload_0
		// @21A: getfield int game.C_100018_wk.field_101515_cb
		// @21D: bipush 8 (0x08)
		// @21F: aload_0
		// @220: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @223: aload_0
		// @224: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @227: aload_0
		// @228: getfield int game.C_100018_wk.field_101546_w
		// @22B: aload_0
		// @22C: getfield int game.C_100018_wk.field_101538_R
		// @22F: aload_0
		// @230: getfield int game.C_100018_wk.field_101541_X
		// @233: invokespecial game.C_100018_wk.<init>(int, int, int, int, int, int, int, game.C_100294_ki, game.C_100314_lf, int, int, int)void
		// @236: astore #5
		// @238: aload #5
		// @23A: aload_0
		// @23B: getfield game.C_100314_lf game.C_100018_wk.field_101517_A
		// @23E: putfield game.C_100314_lf game.C_100018_wk.field_101517_A
		// @241: aload #5
		// @243: aload_0
		// @244: getfield boolean game.C_100018_wk.field_101513_E
		// @247: putfield boolean game.C_100018_wk.field_101513_E
		// @24A: aload #5
		// @24C: aload_0
		// @24D: getfield boolean game.C_100018_wk.field_101542_Z
		// @250: putfield boolean game.C_100018_wk.field_101542_Z
		// @253: aload #5
		// @255: aload_0
		// @256: getfield int game.C_100018_wk.field_101543_db
		// @259: putfield int game.C_100018_wk.field_101543_db
		// @25C: aload_0
		// @25D: getfield boolean game.C_100018_wk.field_101513_E
		// @260: iload #6
		// @262: ifne @2EE
		// @265: ifne @26F
		// @268: goto @26C
		// @26B: athrow
		// @26C: goto @275
		// @26F: aload #5
		// @271: aconst_null
		// @272: putfield game.C_100314_lf[] game.C_100018_wk.field_101553_y
		// @275: aload #5
		// @277: dup
		// @278: getfield int game.C_100018_wk.field_101519_C
		// @27B: iload_2
		// @27C: sipush -997 (0xFC1B)
		// @27F: iadd
		// @280: aload_0
		// @281: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @284: getfield int game.C_100294_ki.field_106951_E
		// @287: iload #4
		// @289: sipush 8192 (0x2000)
		// @28C: imul
		// @28D: bipush 10 (0x0A)
		// @28F: idiv
		// @290: iadd
		// @291: invokestatic game.C_100284_nj.func_106768_a(int, int)int
		// @294: bipush 64 (0x40)
		// @296: aload_3
		// @297: bipush -98 (0x9E)
		// @299: invokestatic game.C_100294_ki.func_106900_a(int, game.C_100038_wa, byte)int
		// @29C: imul
		// @29D: ldc_w 907882544 (0x361d3030)
		// @2A0: ishr
		// @2A1: iadd
		// @2A2: putfield int game.C_100018_wk.field_101519_C
		// @2A5: aload #5
		// @2A7: dup
		// @2A8: getfield int game.C_100018_wk.field_101527_J
		// @2AB: aload_0
		// @2AC: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @2AF: getfield int game.C_100294_ki.field_106951_E
		// @2B2: sipush 8192 (0x2000)
		// @2B5: iload #4
		// @2B7: imul
		// @2B8: bipush 10 (0x0A)
		// @2BA: idiv
		// @2BB: iadd
		// @2BC: iconst_0
		// @2BD: invokestatic game.C_100273_mm.func_106673_a(int, boolean)int
		// @2C0: bipush 48 (0x30)
		// @2C2: aload_3
		// @2C3: bipush -91 (0xA5)
		// @2C5: invokestatic game.C_100294_ki.func_106900_a(int, game.C_100038_wa, byte)int
		// @2C8: imul
		// @2C9: ldc_w -893472176 (0xcabeb250)
		// @2CC: ishr
		// @2CD: iadd
		// @2CE: putfield int game.C_100018_wk.field_101527_J
		// @2D1: aload_0
		// @2D2: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @2D5: getfield game.C_100202_qi game.C_100294_ki.field_106981_b
		// @2D8: bipush 124 (0x7C)
		// @2DA: aload #5
		// @2DC: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @2DF: iinc #4 +1
		// @2E2: iload #6
		// @2E4: ifeq @1F4
		// @2E7: aload_0
		// @2E8: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @2EB: getfield boolean game.C_100294_ki.field_106969_V
		// @2EE: ifne @614
		// @2F1: aload_0
		// @2F2: getfield boolean game.C_100018_wk.field_101513_E
		// @2F5: ifne @614
		// @2F8: goto @2FC
		// @2FB: athrow
		// @2FC: aload_0
		// @2FD: getfield int game.C_100018_wk.field_101514_F
		// @300: aload_0
		// @301: getfield int game.C_100018_wk.field_101519_C
		// @304: ineg
		// @305: iconst_2
		// @306: idiv
		// @307: aload_0
		// @308: getfield boolean game.C_100018_wk.field_101534_V
		// @30B: aload_0
		// @30C: getfield int game.C_100018_wk.field_101545_fb
		// @30F: aload_0
		// @310: getfield int game.C_100018_wk.field_101527_J
		// @313: ineg
		// @314: iconst_2
		// @315: idiv
		// @316: aload_0
		// @317: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @31A: bipush -124 (0x84)
		// @31C: aload_0
		// @31D: getfield int game.C_100018_wk.field_101514_F
		// @320: iconst_2
		// @321: bipush 25 (0x19)
		// @323: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @326: astore_3
		// @327: aload_0
		// @328: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @32B: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @32E: bipush 126 (0x7E)
		// @330: aload_3
		// @331: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @334: iload #6
		// @336: ifeq @614
		// @339: bipush -3 (0xFD)
		// @33B: aload_0
		// @33C: getfield int game.C_100018_wk.field_101541_X
		// @33F: iconst_m1
		// @340: ixor
		// @341: if_icmpeq @58B
		// @344: goto @348
		// @347: athrow
		// @348: aload_0
		// @349: getfield int game.C_100018_wk.field_101541_X
		// @34C: bipush 14 (0x0E)
		// @34E: if_icmpeq @477
		// @351: goto @355
		// @354: athrow
		// @355: bipush 28 (0x1C)
		// @357: aload_0
		// @358: getfield int game.C_100018_wk.field_101541_X
		// @35B: if_icmpeq @477
		// @35E: goto @362
		// @361: athrow
		// @362: aload_0
		// @363: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @366: getfield boolean game.C_100294_ki.field_106969_V
		// @369: ifne @614
		// @36C: goto @370
		// @36F: athrow
		// @370: aload_0
		// @371: getfield boolean game.C_100018_wk.field_101513_E
		// @374: ifne @614
		// @377: goto @37B
		// @37A: athrow
		// @37B: aload_0
		// @37C: getfield int game.C_100018_wk.field_101514_F
		// @37F: aload_0
		// @380: getfield int game.C_100018_wk.field_101519_C
		// @383: ineg
		// @384: iconst_2
		// @385: idiv
		// @386: aload_0
		// @387: getfield boolean game.C_100018_wk.field_101534_V
		// @38A: aload_0
		// @38B: getfield int game.C_100018_wk.field_101545_fb
		// @38E: aload_0
		// @38F: getfield int game.C_100018_wk.field_101527_J
		// @392: ineg
		// @393: iconst_2
		// @394: idiv
		// @395: aload_0
		// @396: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @399: bipush -124 (0x84)
		// @39B: aload_0
		// @39C: getfield int game.C_100018_wk.field_101514_F
		// @39F: iconst_3
		// @3A0: iconst_5
		// @3A1: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @3A4: astore_3
		// @3A5: aload_0
		// @3A6: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @3A9: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @3AC: iload_2
		// @3AD: sipush 916 (0x0394)
		// @3B0: ixor
		// @3B1: aload_3
		// @3B2: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @3B5: bipush -28 (0xE4)
		// @3B7: aload_0
		// @3B8: getfield int game.C_100018_wk.field_101541_X
		// @3BB: iconst_m1
		// @3BC: ixor
		// @3BD: if_icmpne @401
		// @3C0: aload_0
		// @3C1: getfield int game.C_100018_wk.field_101514_F
		// @3C4: aload_0
		// @3C5: getfield int game.C_100018_wk.field_101519_C
		// @3C8: ineg
		// @3C9: iconst_2
		// @3CA: idiv
		// @3CB: aload_0
		// @3CC: getfield boolean game.C_100018_wk.field_101534_V
		// @3CF: aload_0
		// @3D0: getfield int game.C_100018_wk.field_101545_fb
		// @3D3: aload_0
		// @3D4: getfield int game.C_100018_wk.field_101527_J
		// @3D7: ineg
		// @3D8: iconst_2
		// @3D9: idiv
		// @3DA: aload_0
		// @3DB: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @3DE: bipush -124 (0x84)
		// @3E0: aload_0
		// @3E1: getfield int game.C_100018_wk.field_101514_F
		// @3E4: bipush 8 (0x08)
		// @3E6: bipush 25 (0x19)
		// @3E8: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @3EB: astore_3
		// @3EC: aload_0
		// @3ED: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @3F0: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @3F3: iload_2
		// @3F4: sipush 917 (0x0395)
		// @3F7: ixor
		// @3F8: aload_3
		// @3F9: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @3FC: iload #6
		// @3FE: ifeq @472
		// @401: aload_0
		// @402: getfield int game.C_100018_wk.field_101514_F
		// @405: aload_0
		// @406: getfield int game.C_100018_wk.field_101519_C
		// @409: ineg
		// @40A: iconst_2
		// @40B: idiv
		// @40C: aload_0
		// @40D: getfield boolean game.C_100018_wk.field_101534_V
		// @410: aload_0
		// @411: getfield int game.C_100018_wk.field_101545_fb
		// @414: aload_0
		// @415: getfield int game.C_100018_wk.field_101527_J
		// @418: ineg
		// @419: iconst_2
		// @41A: idiv
		// @41B: aload_0
		// @41C: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @41F: bipush -124 (0x84)
		// @421: aload_0
		// @422: getfield int game.C_100018_wk.field_101514_F
		// @425: bipush 8 (0x08)
		// @427: bipush 10 (0x0A)
		// @429: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @42C: astore_3
		// @42D: bipush 15 (0x0F)
		// @42F: aload_0
		// @430: getfield int game.C_100018_wk.field_101541_X
		// @433: if_icmpne @465
		// @436: aload_0
		// @437: getfield int game.C_100018_wk.field_101533_W
		// @43A: aload_0
		// @43B: getfield int game.C_100018_wk.field_101516_G
		// @43E: if_icmpgt @465
		// @441: goto @445
		// @444: athrow
		// @445: aconst_null
		// @446: aload_0
		// @447: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @44A: if_acmpeq @465
		// @44D: goto @451
		// @450: athrow
		// @451: aload_0
		// @452: getfield boolean game.C_100018_wk.field_101530_U
		// @455: ifeq @465
		// @458: goto @45C
		// @45B: athrow
		// @45C: aload_3
		// @45D: iconst_3
		// @45E: putfield int game.C_100059_df.field_101608_P
		// @461: goto @465
		// @464: athrow
		// @465: aload_0
		// @466: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @469: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @46C: bipush 125 (0x7D)
		// @46E: aload_3
		// @46F: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @472: iload #6
		// @474: ifeq @614
		// @477: aload_0
		// @478: iconst_1
		// @479: putfield boolean game.C_100018_wk.field_101544_hb
		// @47C: aload_0
		// @47D: bipush 16 (0x10)
		// @47F: putfield int game.C_100018_wk.field_101515_cb
		// @482: aload_0
		// @483: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @486: getfield boolean game.C_100294_ki.field_106969_V
		// @489: ifne @614
		// @48C: goto @490
		// @48F: athrow
		// @490: aload_0
		// @491: getfield boolean game.C_100018_wk.field_101513_E
		// @494: ifeq @49F
		// @497: goto @49B
		// @49A: athrow
		// @49B: goto @614
		// @49E: athrow
		// @49F: aload_0
		// @4A0: getfield int game.C_100018_wk.field_101541_X
		// @4A3: bipush 28 (0x1C)
		// @4A5: if_icmpne @4FD
		// @4A8: iconst_3
		// @4A9: aload_0
		// @4AA: getfield int game.C_100018_wk.field_101516_G
		// @4AD: if_icmple @4FD
		// @4B0: goto @4B4
		// @4B3: athrow
		// @4B4: aload_0
		// @4B5: getfield int game.C_100018_wk.field_101514_F
		// @4B8: aload_0
		// @4B9: getfield int game.C_100018_wk.field_101519_C
		// @4BC: ineg
		// @4BD: iconst_2
		// @4BE: idiv
		// @4BF: aload_0
		// @4C0: getfield boolean game.C_100018_wk.field_101534_V
		// @4C3: aload_0
		// @4C4: getfield int game.C_100018_wk.field_101545_fb
		// @4C7: aload_0
		// @4C8: getfield int game.C_100018_wk.field_101527_J
		// @4CB: ineg
		// @4CC: iconst_2
		// @4CD: idiv
		// @4CE: aload_0
		// @4CF: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @4D2: bipush -124 (0x84)
		// @4D4: aload_0
		// @4D5: getfield int game.C_100018_wk.field_101514_F
		// @4D8: iconst_1
		// @4D9: bipush 35 (0x23)
		// @4DB: aload_0
		// @4DC: getfield int game.C_100018_wk.field_101516_G
		// @4DF: bipush 10 (0x0A)
		// @4E1: imul
		// @4E2: ineg
		// @4E3: iadd
		// @4E4: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @4E7: astore_3
		// @4E8: aload_0
		// @4E9: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @4EC: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @4EF: iload_2
		// @4F0: sipush 916 (0x0394)
		// @4F3: ixor
		// @4F4: aload_3
		// @4F5: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @4F8: iload #6
		// @4FA: ifeq @614
		// @4FD: iconst_1
		// @4FE: aload_0
		// @4FF: getfield int game.C_100018_wk.field_101516_G
		// @502: if_icmple @54F
		// @505: goto @509
		// @508: athrow
		// @509: aload_0
		// @50A: getfield int game.C_100018_wk.field_101514_F
		// @50D: aload_0
		// @50E: getfield int game.C_100018_wk.field_101519_C
		// @511: ineg
		// @512: iconst_2
		// @513: idiv
		// @514: aload_0
		// @515: getfield boolean game.C_100018_wk.field_101534_V
		// @518: aload_0
		// @519: getfield int game.C_100018_wk.field_101545_fb
		// @51C: aload_0
		// @51D: getfield int game.C_100018_wk.field_101527_J
		// @520: ineg
		// @521: iconst_2
		// @522: idiv
		// @523: aload_0
		// @524: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @527: bipush -124 (0x84)
		// @529: aload_0
		// @52A: getfield int game.C_100018_wk.field_101514_F
		// @52D: iconst_1
		// @52E: bipush 8 (0x08)
		// @530: aload_0
		// @531: getfield int game.C_100018_wk.field_101516_G
		// @534: imul
		// @535: ineg
		// @536: bipush 18 (0x12)
		// @538: iadd
		// @539: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @53C: astore_3
		// @53D: aload_0
		// @53E: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @541: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @544: bipush 127 (0x7F)
		// @546: aload_3
		// @547: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @54A: iload #6
		// @54C: ifeq @614
		// @54F: aload_0
		// @550: getfield int game.C_100018_wk.field_101514_F
		// @553: aload_0
		// @554: getfield int game.C_100018_wk.field_101519_C
		// @557: ineg
		// @558: iconst_2
		// @559: idiv
		// @55A: aload_0
		// @55B: getfield boolean game.C_100018_wk.field_101534_V
		// @55E: aload_0
		// @55F: getfield int game.C_100018_wk.field_101545_fb
		// @562: aload_0
		// @563: getfield int game.C_100018_wk.field_101527_J
		// @566: ineg
		// @567: iconst_2
		// @568: idiv
		// @569: aload_0
		// @56A: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @56D: bipush -124 (0x84)
		// @56F: aload_0
		// @570: getfield int game.C_100018_wk.field_101514_F
		// @573: iconst_3
		// @574: iconst_5
		// @575: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @578: astore_3
		// @579: aload_0
		// @57A: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @57D: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @580: bipush 126 (0x7E)
		// @582: aload_3
		// @583: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @586: iload #6
		// @588: ifeq @614
		// @58B: aload_0
		// @58C: aload_0
		// @58D: getfield int game.C_100018_wk.field_101515_cb
		// @590: iconst_m1
		// @591: ixor
		// @592: bipush -4 (0xFC)
		// @594: if_icmpeq @5A0
		// @597: goto @59B
		// @59A: athrow
		// @59B: iconst_1
		// @59C: goto @5A1
		// @59F: athrow
		// @5A0: iconst_0
		// @5A1: putfield boolean game.C_100018_wk.field_101544_hb
		// @5A4: aload_0
		// @5A5: getfield int game.C_100018_wk.field_101515_cb
		// @5A8: iconst_m1
		// @5A9: ixor
		// @5AA: bipush -3 (0xFD)
		// @5AC: if_icmpeq @5C2
		// @5AF: aload_0
		// @5B0: getfield int game.C_100018_wk.field_101515_cb
		// @5B3: iconst_m1
		// @5B4: ixor
		// @5B5: bipush -9 (0xF7)
		// @5B7: if_icmpeq @5C2
		// @5BA: goto @5BE
		// @5BD: athrow
		// @5BE: goto @5C7
		// @5C1: athrow
		// @5C2: aload_0
		// @5C3: iconst_4
		// @5C4: putfield int game.C_100018_wk.field_101515_cb
		// @5C7: aload_0
		// @5C8: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @5CB: getfield boolean game.C_100294_ki.field_106969_V
		// @5CE: ifne @614
		// @5D1: aload_0
		// @5D2: getfield boolean game.C_100018_wk.field_101513_E
		// @5D5: ifne @614
		// @5D8: goto @5DC
		// @5DB: athrow
		// @5DC: aload_0
		// @5DD: getfield int game.C_100018_wk.field_101514_F
		// @5E0: aload_0
		// @5E1: getfield int game.C_100018_wk.field_101519_C
		// @5E4: ineg
		// @5E5: iconst_2
		// @5E6: idiv
		// @5E7: aload_0
		// @5E8: getfield boolean game.C_100018_wk.field_101534_V
		// @5EB: aload_0
		// @5EC: getfield int game.C_100018_wk.field_101545_fb
		// @5EF: aload_0
		// @5F0: getfield int game.C_100018_wk.field_101527_J
		// @5F3: ineg
		// @5F4: iconst_2
		// @5F5: idiv
		// @5F6: aload_0
		// @5F7: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @5FA: bipush -124 (0x84)
		// @5FC: aload_0
		// @5FD: getfield int game.C_100018_wk.field_101514_F
		// @600: iconst_2
		// @601: bipush 25 (0x19)
		// @603: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @606: astore_3
		// @607: aload_0
		// @608: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @60B: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @60E: bipush 124 (0x7C)
		// @610: aload_3
		// @611: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @614: iconst_0
		// @615: ireturn
		// @616: astore_3
		// @617: aload_3
		// @618: new java.lang.StringBuilder
		// @61B: dup
		// @61C: invokespecial java.lang.StringBuilder.<init>()void
		// @61F: getstatic java.lang.String[] game.C_100018_wk.field_101532_ib
		// @622: bipush 9 (0x09)
		// @624: aaload
		// @625: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @628: iload_1
		// @629: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @62C: bipush 44 (0x2C)
		// @62E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @631: iload_2
		// @632: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @635: bipush 41 (0x29)
		// @637: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @63A: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @63D: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @640: athrow
	}
	
	private final void func_101500_b(boolean arg0)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #9
		// @005: iconst_0
		// @006: istore_2
		// @007: iload_1
		// @008: iconst_1
		// @009: if_icmpeq @017
		// @00C: aconst_null
		// @00D: checkcast java.lang.String
		// @010: putstatic java.lang.String game.C_100018_wk.field_101512_D
		// @013: goto @017
		// @016: athrow
		// @017: iconst_3
		// @018: aload_0
		// @019: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @01C: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @01F: sipush 26294 (0x66B6)
		// @022: invokevirtual game.C_100171_cn.func_105559_a(int)int
		// @025: if_icmpne @07C
		// @028: aload_0
		// @029: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @02C: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @02F: sipush 23156 (0x5A74)
		// @032: invokevirtual game.C_100171_cn.func_105552_b(int)int
		// @035: ldc_w -722423231 (0xd4f0b241)
		// @038: ishr
		// @039: istore_3
		// @03A: sipush 600 (0x0258)
		// @03D: istore #4
		// @03F: sipush 5120 (0x1400)
		// @042: istore #5
		// @044: aload_0
		// @045: getfield int game.C_100018_wk.field_101514_F
		// @048: ldc_w -1726265724 (0x991b4684)
		// @04B: ishr
		// @04C: iload_3
		// @04D: isub
		// @04E: istore #6
		// @050: iload #4
		// @052: ineg
		// @053: aload_0
		// @054: getfield int game.C_100018_wk.field_101545_fb
		// @057: ldc_w -1005830428 (0xc40c3ee4)
		// @05A: ishr
		// @05B: iadd
		// @05C: istore #7
		// @05E: iload #6
		// @060: iload #6
		// @062: imul
		// @063: iload #7
		// @065: iload #7
		// @067: imul
		// @068: iadd
		// @069: iload #5
		// @06B: iload #5
		// @06D: imul
		// @06E: if_icmplt @075
		// @071: goto @077
		// @074: athrow
		// @075: iconst_1
		// @076: istore_2
		// @077: iload #9
		// @079: ifeq @108
		// @07C: iconst_4
		// @07D: aload_0
		// @07E: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @081: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @084: sipush 26294 (0x66B6)
		// @087: invokevirtual game.C_100171_cn.func_105559_a(int)int
		// @08A: if_icmpne @108
		// @08D: goto @091
		// @090: athrow
		// @091: iconst_0
		// @092: istore_3
		// @093: bipush -3 (0xFD)
		// @095: iload_3
		// @096: iconst_m1
		// @097: ixor
		// @098: if_icmpge @108
		// @09B: iconst_0
		// @09C: iconst_1
		// @09D: iload_3
		// @09E: iadd
		// @09F: aload_0
		// @0A0: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0A3: getfield int game.C_100294_ki.field_106987_m
		// @0A6: iand
		// @0A7: iload #9
		// @0A9: ifne @116
		// @0AC: if_icmpne @100
		// @0AF: goto @0B3
		// @0B2: athrow
		// @0B3: aload_0
		// @0B4: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0B7: getfield game.C_100171_cn game.C_100294_ki.field_106995_u
		// @0BA: getfield int[] game.C_100171_cn.field_105580_p
		// @0BD: iload_3
		// @0BE: iaload
		// @0BF: istore #4
		// @0C1: sipush -1080 (0xFBC8)
		// @0C4: istore #5
		// @0C6: sipush 4800 (0x12C0)
		// @0C9: istore #6
		// @0CB: iload #4
		// @0CD: ineg
		// @0CE: aload_0
		// @0CF: getfield int game.C_100018_wk.field_101514_F
		// @0D2: ldc_w -223202076 (0xf2b234e4)
		// @0D5: ishr
		// @0D6: iadd
		// @0D7: istore #7
		// @0D9: iload #5
		// @0DB: ineg
		// @0DC: aload_0
		// @0DD: getfield int game.C_100018_wk.field_101545_fb
		// @0E0: ldc_w 716198916 (0x2ab05404)
		// @0E3: ishr
		// @0E4: iadd
		// @0E5: istore #8
		// @0E7: iload #6
		// @0E9: iload #6
		// @0EB: imul
		// @0EC: iload #8
		// @0EE: iload #8
		// @0F0: imul
		// @0F1: iload #7
		// @0F3: iload #7
		// @0F5: imul
		// @0F6: iadd
		// @0F7: if_icmpgt @0FE
		// @0FA: goto @100
		// @0FD: athrow
		// @0FE: iconst_1
		// @0FF: istore_2
		// @100: iinc #3 +1
		// @103: iload #9
		// @105: ifeq @093
		// @108: aload_0
		// @109: getfield boolean game.C_100018_wk.field_101535_Q
		// @10C: ifne @114
		// @10F: iconst_1
		// @110: goto @115
		// @113: athrow
		// @114: iconst_0
		// @115: iload_2
		// @116: if_icmpne @122
		// @119: aload_0
		// @11A: iconst_1
		// @11B: putfield boolean game.C_100018_wk.field_101523_O
		// @11E: goto @122
		// @121: athrow
		// @122: aload_0
		// @123: iload_2
		// @124: putfield boolean game.C_100018_wk.field_101535_Q
		// @127: goto @14C
		// @12A: astore_2
		// @12B: aload_2
		// @12C: new java.lang.StringBuilder
		// @12F: dup
		// @130: invokespecial java.lang.StringBuilder.<init>()void
		// @133: getstatic java.lang.String[] game.C_100018_wk.field_101532_ib
		// @136: bipush 14 (0x0E)
		// @138: aaload
		// @139: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @13C: iload_1
		// @13D: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @140: bipush 41 (0x29)
		// @142: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @145: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @148: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @14B: athrow
		// @14C: return
	}
	
	final void func_101510_a(int arg0, int arg1, int arg2, int arg3, int arg4)
	{
		// @00: aload_0
		// @01: iload_1
		// @02: iload_2
		// @03: iload_3
		// @04: iload #4
		// @06: iconst_1
		// @07: iconst_0
		// @08: invokespecial game.C_100018_wk.func_101505_a(int, int, int, int, boolean, boolean)void
		// @0B: iload #5
		// @0D: bipush -3 (0xFD)
		// @0F: if_icmpeq @18
		// @12: aload_0
		// @13: bipush 82 (0x52)
		// @15: putfield int game.C_100018_wk.field_101546_w
		// @18: goto @65
		// @1B: astore #6
		// @1D: aload #6
		// @1F: new java.lang.StringBuilder
		// @22: dup
		// @23: invokespecial java.lang.StringBuilder.<init>()void
		// @26: getstatic java.lang.String[] game.C_100018_wk.field_101532_ib
		// @29: bipush 8 (0x08)
		// @2B: aaload
		// @2C: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @2F: iload_1
		// @30: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @33: bipush 44 (0x2C)
		// @35: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @38: iload_2
		// @39: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3C: bipush 44 (0x2C)
		// @3E: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @41: iload_3
		// @42: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @45: bipush 44 (0x2C)
		// @47: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @4A: iload #4
		// @4C: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @4F: bipush 44 (0x2C)
		// @51: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @54: iload #5
		// @56: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @59: bipush 41 (0x29)
		// @5B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @5E: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @61: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @64: athrow
		// @65: return
	}
	
	private final boolean func_101509_a(boolean arg0, int arg1)
	{
		// @00: aload_0
		// @01: iconst_1
		// @02: iload_2
		// @03: iand
		// @04: iconst_m1
		// @05: ixor
		// @06: iconst_m1
		// @07: if_icmpne @0F
		// @0A: iconst_1
		// @0B: goto @10
		// @0E: athrow
		// @0F: iconst_0
		// @10: putfield boolean game.C_100018_wk.field_101544_hb
		// @13: iload_1
		// @14: iconst_1
		// @15: if_icmpeq @2E
		// @18: aconst_null
		// @19: checkcast java.lang.String
		// @1C: aconst_null
		// @1D: checkcast java.lang.String
		// @20: bipush 29 (0x1D)
		// @22: aconst_null
		// @23: checkcast java.lang.String
		// @26: invokestatic game.C_100018_wk.func_101497_a(java.lang.String, java.lang.String, int, java.lang.String)java.lang.String
		// @29: pop
		// @2A: goto @2E
		// @2D: athrow
		// @2E: aload_0
		// @2F: iconst_2
		// @30: putfield int game.C_100018_wk.field_101515_cb
		// @33: aload_0
		// @34: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @37: getfield boolean game.C_100294_ki.field_106969_V
		// @3A: ifne @80
		// @3D: aload_0
		// @3E: getfield boolean game.C_100018_wk.field_101513_E
		// @41: ifne @80
		// @44: goto @48
		// @47: athrow
		// @48: aload_0
		// @49: getfield int game.C_100018_wk.field_101514_F
		// @4C: aload_0
		// @4D: getfield int game.C_100018_wk.field_101519_C
		// @50: ineg
		// @51: iconst_2
		// @52: idiv
		// @53: aload_0
		// @54: getfield boolean game.C_100018_wk.field_101534_V
		// @57: aload_0
		// @58: getfield int game.C_100018_wk.field_101545_fb
		// @5B: aload_0
		// @5C: getfield int game.C_100018_wk.field_101527_J
		// @5F: ineg
		// @60: iconst_2
		// @61: idiv
		// @62: aload_0
		// @63: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @66: bipush -124 (0x84)
		// @68: aload_0
		// @69: getfield int game.C_100018_wk.field_101514_F
		// @6C: iconst_2
		// @6D: bipush 25 (0x19)
		// @6F: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @72: astore_3
		// @73: aload_0
		// @74: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @77: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @7A: bipush 126 (0x7E)
		// @7C: aload_3
		// @7D: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @80: aload_0
		// @81: getfield int game.C_100018_wk.field_101541_X
		// @84: iconst_m1
		// @85: ixor
		// @86: bipush -3 (0xFD)
		// @88: if_icmpne @B7
		// @8B: aload_0
		// @8C: getfield boolean game.C_100018_wk.field_101522_N
		// @8F: ifeq @B7
		// @92: goto @96
		// @95: athrow
		// @96: aload_0
		// @97: getfield boolean game.C_100018_wk.field_101523_O
		// @9A: ifeq @A5
		// @9D: goto @A1
		// @A0: athrow
		// @A1: goto @B7
		// @A4: athrow
		// @A5: aload_0
		// @A6: sipush 256 (0x0100)
		// @A9: bipush 50 (0x32)
		// @AB: iconst_4
		// @AC: iconst_5
		// @AD: bipush -3 (0xFD)
		// @AF: invokevirtual game.C_100018_wk.func_101510_a(int, int, int, int, int)void
		// @B2: aload_0
		// @B3: iconst_1
		// @B4: putfield boolean game.C_100018_wk.field_101523_O
		// @B7: iconst_0
		// @B8: ireturn
		// @B9: astore_3
		// @BA: aload_3
		// @BB: new java.lang.StringBuilder
		// @BE: dup
		// @BF: invokespecial java.lang.StringBuilder.<init>()void
		// @C2: getstatic java.lang.String[] game.C_100018_wk.field_101532_ib
		// @C5: bipush 11 (0x0B)
		// @C7: aaload
		// @C8: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @CB: iload_1
		// @CC: invokevirtual java.lang.StringBuilder.append(boolean)java.lang.StringBuilder
		// @CF: bipush 44 (0x2C)
		// @D1: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @D4: iload_2
		// @D5: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @D8: bipush 41 (0x29)
		// @DA: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @DD: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @E0: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @E3: athrow
	}
	
	C_100018_wk(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, C_100294_ki arg7, C_100314_lf arg8, int arg9, int arg10, int arg11)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #16
		// @005: aload_0
		// @006: invokespecial game.C_100325_id.<init>()void
		// @009: aload_0
		// @00A: bipush 50 (0x32)
		// @00C: putfield int game.C_100018_wk.field_101526_I
		// @00F: aload_0
		// @010: bipush 10 (0x0A)
		// @012: putfield int game.C_100018_wk.field_101551_ab
		// @015: aload_0
		// @016: aload #9
		// @018: putfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @01B: aload_0
		// @01C: aload #8
		// @01E: putfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @021: aload_0
		// @022: iload #4
		// @024: iconst_m1
		// @025: ixor
		// @026: iconst_m1
		// @027: if_icmpgt @03B
		// @02A: iload #4
		// @02C: iconst_m1
		// @02D: ixor
		// @02E: iconst_m1
		// @02F: if_icmpne @037
		// @032: iconst_0
		// @033: goto @03C
		// @036: athrow
		// @037: iconst_1
		// @038: goto @03C
		// @03B: iconst_m1
		// @03C: putfield int game.C_100018_wk.field_101521_M
		// @03F: aload_0
		// @040: iload #4
		// @042: putfield int game.C_100018_wk.field_101527_J
		// @045: aload_0
		// @046: iload #10
		// @048: putfield int game.C_100018_wk.field_101546_w
		// @04B: aload_0
		// @04C: iload_2
		// @04D: putfield int game.C_100018_wk.field_101545_fb
		// @050: aload_0
		// @051: iload_3
		// @052: putfield int game.C_100018_wk.field_101519_C
		// @055: aload_0
		// @056: aload #9
		// @058: putfield game.C_100314_lf game.C_100018_wk.field_101517_A
		// @05B: aload_0
		// @05C: iload #7
		// @05E: putfield int game.C_100018_wk.field_101539_Y
		// @061: aload_0
		// @062: iload_1
		// @063: putfield int game.C_100018_wk.field_101514_F
		// @066: aload_0
		// @067: iload #11
		// @069: putfield int game.C_100018_wk.field_101538_R
		// @06C: aload_0
		// @06D: iconst_0
		// @06E: iload_3
		// @06F: if_icmple @077
		// @072: iconst_m1
		// @073: goto @081
		// @076: athrow
		// @077: iload_3
		// @078: ifne @080
		// @07B: iconst_0
		// @07C: goto @081
		// @07F: athrow
		// @080: iconst_1
		// @081: putfield int game.C_100018_wk.field_101554_x
		// @084: aload_0
		// @085: iload #12
		// @087: putfield int game.C_100018_wk.field_101541_X
		// @08A: aload_0
		// @08B: iconst_0
		// @08C: putfield int game.C_100018_wk.field_101516_G
		// @08F: aload_0
		// @090: iload #6
		// @092: putfield int game.C_100018_wk.field_101515_cb
		// @095: aload_0
		// @096: iload #5
		// @098: putfield int game.C_100018_wk.field_101524_H
		// @09B: aload_0
		// @09C: aload_0
		// @09D: getfield int game.C_100018_wk.field_101514_F
		// @0A0: putfield int game.C_100018_wk.field_101548_u
		// @0A3: aload_0
		// @0A4: aload_0
		// @0A5: getfield int game.C_100018_wk.field_101545_fb
		// @0A8: putfield int game.C_100018_wk.field_101537_S
		// @0AB: aload_0
		// @0AC: iconst_1
		// @0AD: invokespecial game.C_100018_wk.func_101500_b(boolean)void
		// @0B0: aconst_null
		// @0B1: aload_0
		// @0B2: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @0B5: if_acmpeq @0C7
		// @0B8: aload_0
		// @0B9: aload_0
		// @0BA: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @0BD: getfield boolean game.C_100314_lf.field_101391_lb
		// @0C0: putfield boolean game.C_100018_wk.field_101534_V
		// @0C3: goto @0C7
		// @0C6: athrow
		// @0C7: aload_0
		// @0C8: bipush -16 (0xF0)
		// @0CA: aload_0
		// @0CB: getfield int game.C_100018_wk.field_101541_X
		// @0CE: iconst_m1
		// @0CF: ixor
		// @0D0: if_icmpne @0F5
		// @0D3: aconst_null
		// @0D4: aload_0
		// @0D5: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @0D8: if_acmpeq @0F5
		// @0DB: goto @0DF
		// @0DE: athrow
		// @0DF: aload_0
		// @0E0: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @0E3: getfield int game.C_100314_lf.field_101406_Cb
		// @0E6: iconst_m1
		// @0E7: ixor
		// @0E8: iconst_m1
		// @0E9: if_icmpge @0F5
		// @0EC: goto @0F0
		// @0EF: athrow
		// @0F0: iconst_1
		// @0F1: goto @0F6
		// @0F4: athrow
		// @0F5: iconst_0
		// @0F6: putfield boolean game.C_100018_wk.field_101530_U
		// @0F9: aload_0
		// @0FA: iconst_0
		// @0FB: putfield boolean game.C_100018_wk.field_101528_gb
		// @0FE: aload_0
		// @0FF: iconst_4
		// @100: iconst_5
		// @101: aload_0
		// @102: getfield int game.C_100018_wk.field_101539_Y
		// @105: if_icmpeq @117
		// @108: bipush -16 (0xF0)
		// @10A: aload_0
		// @10B: getfield int game.C_100018_wk.field_101541_X
		// @10E: iconst_m1
		// @10F: ixor
		// @110: if_icmpne @11D
		// @113: goto @117
		// @116: athrow
		// @117: bipush 42 (0x2A)
		// @119: goto @11F
		// @11C: athrow
		// @11D: bipush 75 (0x4B)
		// @11F: imul
		// @120: aload_0
		// @121: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @124: getfield int game.C_100294_ki.field_106964_J
		// @127: idiv
		// @128: putfield int game.C_100018_wk.field_101533_W
		// @12B: aload_0
		// @12C: iconst_0
		// @12D: putfield boolean game.C_100018_wk.field_101523_O
		// @130: aload_0
		// @131: iconst_0
		// @132: putfield int game.C_100018_wk.field_101543_db
		// @135: aload_0
		// @136: iconst_0
		// @137: putfield boolean game.C_100018_wk.field_101522_N
		// @13A: aload_0
		// @13B: iconst_0
		// @13C: putfield boolean game.C_100018_wk.field_101525_eb
		// @13F: aload_0
		// @140: aload_0
		// @141: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @144: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @147: sipush -14829 (0xC613)
		// @14A: invokevirtual game.C_100202_qi.func_105912_d(int)int
		// @14D: anewarray game.C_100314_lf
		// @150: putfield game.C_100314_lf[] game.C_100018_wk.field_101553_y
		// @153: iconst_0
		// @154: istore #13
		// @156: new game.C_100019_wl
		// @159: dup
		// @15A: aload_0
		// @15B: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @15E: getfield game.C_100202_qi game.C_100294_ki.field_106979_d
		// @161: invokespecial game.C_100019_wl.<init>(game.C_100202_qi)void
		// @164: astore #14
		// @166: aload #14
		// @168: bipush -128 (0x80)
		// @16A: invokevirtual game.C_100019_wl.func_103827_a(byte)game.C_100158_da
		// @16D: checkcast game.C_100314_lf
		// @170: astore #15
		// @172: aconst_null
		// @173: aload #15
		// @175: if_acmpeq @1D9
		// @178: iload #16
		// @17A: ifne @28E
		// @17D: aload #15
		// @17F: getfield game.C_100327_ib game.C_100314_lf.field_101357_v
		// @182: getfield int game.C_100327_ib.field_102494_P
		// @185: iconst_m1
		// @186: ixor
		// @187: getstatic int[] game.C_100242_oh.field_106346_c
		// @18A: iconst_0
		// @18B: iaload
		// @18C: iconst_m1
		// @18D: ixor
		// @18E: if_icmpne @1BB
		// @191: goto @195
		// @194: athrow
		// @195: aconst_null
		// @196: aload_0
		// @197: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @19A: if_acmpeq @1BB
		// @19D: goto @1A1
		// @1A0: athrow
		// @1A1: getstatic int[] game.C_100242_oh.field_106346_c
		// @1A4: iconst_0
		// @1A5: iaload
		// @1A6: aload_0
		// @1A7: getfield game.C_100314_lf game.C_100018_wk.field_101520_L
		// @1AA: getfield game.C_100327_ib game.C_100314_lf.field_101357_v
		// @1AD: getfield int game.C_100327_ib.field_102494_P
		// @1B0: if_icmpne @1BB
		// @1B3: goto @1B7
		// @1B6: athrow
		// @1B7: goto @1C7
		// @1BA: athrow
		// @1BB: aload_0
		// @1BC: getfield game.C_100314_lf[] game.C_100018_wk.field_101553_y
		// @1BF: iload #13
		// @1C1: iinc #13 +1
		// @1C4: aload #15
		// @1C6: aastore
		// @1C7: aload #14
		// @1C9: sipush -30820 (0x879C)
		// @1CC: invokevirtual game.C_100019_wl.func_103836_b(int)game.C_100158_da
		// @1CF: checkcast game.C_100314_lf
		// @1D2: astore #15
		// @1D4: iload #16
		// @1D6: ifeq @172
		// @1D9: goto @28E
		// @1DC: astore #13
		// @1DE: aload #13
		// @1E0: new java.lang.StringBuilder
		// @1E3: dup
		// @1E4: invokespecial java.lang.StringBuilder.<init>()void
		// @1E7: getstatic java.lang.String[] game.C_100018_wk.field_101532_ib
		// @1EA: bipush 18 (0x12)
		// @1EC: aaload
		// @1ED: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1F0: iload_1
		// @1F1: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1F4: bipush 44 (0x2C)
		// @1F6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1F9: iload_2
		// @1FA: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1FD: bipush 44 (0x2C)
		// @1FF: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @202: iload_3
		// @203: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @206: bipush 44 (0x2C)
		// @208: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @20B: iload #4
		// @20D: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @210: bipush 44 (0x2C)
		// @212: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @215: iload #5
		// @217: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @21A: bipush 44 (0x2C)
		// @21C: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @21F: iload #6
		// @221: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @224: bipush 44 (0x2C)
		// @226: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @229: iload #7
		// @22B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @22E: bipush 44 (0x2C)
		// @230: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @233: aload #8
		// @235: ifnull @241
		// @238: getstatic java.lang.String[] game.C_100018_wk.field_101532_ib
		// @23B: iconst_4
		// @23C: aaload
		// @23D: goto @246
		// @240: athrow
		// @241: getstatic java.lang.String[] game.C_100018_wk.field_101532_ib
		// @244: iconst_2
		// @245: aaload
		// @246: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @249: bipush 44 (0x2C)
		// @24B: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @24E: aload #9
		// @250: ifnull @25C
		// @253: getstatic java.lang.String[] game.C_100018_wk.field_101532_ib
		// @256: iconst_4
		// @257: aaload
		// @258: goto @261
		// @25B: athrow
		// @25C: getstatic java.lang.String[] game.C_100018_wk.field_101532_ib
		// @25F: iconst_2
		// @260: aaload
		// @261: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @264: bipush 44 (0x2C)
		// @266: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @269: iload #10
		// @26B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @26E: bipush 44 (0x2C)
		// @270: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @273: iload #11
		// @275: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @278: bipush 44 (0x2C)
		// @27A: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @27D: iload #12
		// @27F: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @282: bipush 41 (0x29)
		// @284: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @287: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @28A: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @28D: athrow
		// @28E: return
	}
	
	private final boolean func_101506_b(int arg0, int arg1)
	{
		// @000: getstatic int game.SteelSentinels.field_105275_O
		// @003: istore #4
		// @005: iload_2
		// @006: iconst_3
		// @007: if_icmpeq @014
		// @00A: aload_0
		// @00B: bipush -29 (0xE3)
		// @00D: putfield int game.C_100018_wk.field_101543_db
		// @010: goto @014
		// @013: athrow
		// @014: aload_0
		// @015: iconst_1
		// @016: invokespecial game.C_100018_wk.func_101500_b(boolean)void
		// @019: aload_0
		// @01A: bipush 8 (0x08)
		// @01C: putfield int game.C_100018_wk.field_101515_cb
		// @01F: aload_0
		// @020: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @023: getfield boolean game.C_100294_ki.field_106969_V
		// @026: ifne @1B4
		// @029: aload_0
		// @02A: getfield boolean game.C_100018_wk.field_101513_E
		// @02D: ifne @1B4
		// @030: goto @034
		// @033: athrow
		// @034: iconst_m1
		// @035: iload_1
		// @036: iconst_m1
		// @037: ixor
		// @038: if_icmpeq @043
		// @03B: goto @03F
		// @03E: athrow
		// @03F: goto @1B4
		// @042: athrow
		// @043: bipush 18 (0x12)
		// @045: aload_0
		// @046: getfield int game.C_100018_wk.field_101541_X
		// @049: if_icmpne @064
		// @04C: bipush 15 (0x0F)
		// @04E: iload_1
		// @04F: aload_0
		// @050: getfield int game.C_100018_wk.field_101515_cb
		// @053: aload_0
		// @054: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @057: getfield int game.C_100294_ki.field_106951_E
		// @05A: imul
		// @05B: iadd
		// @05C: iand
		// @05D: ifeq @112
		// @060: goto @064
		// @063: athrow
		// @064: bipush -32 (0xE0)
		// @066: aload_0
		// @067: getfield int game.C_100018_wk.field_101541_X
		// @06A: iconst_m1
		// @06B: ixor
		// @06C: if_icmpne @1B4
		// @06F: goto @073
		// @072: athrow
		// @073: aload_0
		// @074: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @077: getfield int game.C_100294_ki.field_106951_E
		// @07A: bipush 7 (0x07)
		// @07C: iand
		// @07D: iconst_m1
		// @07E: ixor
		// @07F: iconst_m1
		// @080: if_icmpne @0C0
		// @083: goto @087
		// @086: athrow
		// @087: aload_0
		// @088: getfield int game.C_100018_wk.field_101514_F
		// @08B: aload_0
		// @08C: getfield int game.C_100018_wk.field_101527_J
		// @08F: ineg
		// @090: aload_0
		// @091: getfield boolean game.C_100018_wk.field_101534_V
		// @094: aload_0
		// @095: getfield int game.C_100018_wk.field_101545_fb
		// @098: aload_0
		// @099: getfield int game.C_100018_wk.field_101519_C
		// @09C: aload_0
		// @09D: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0A0: bipush -124 (0x84)
		// @0A2: aload_0
		// @0A3: getfield int game.C_100018_wk.field_101514_F
		// @0A6: iconst_4
		// @0A7: sipush 200 (0x00C8)
		// @0AA: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @0AD: astore_3
		// @0AE: aload_0
		// @0AF: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0B2: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @0B5: bipush 127 (0x7F)
		// @0B7: aload_3
		// @0B8: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @0BB: iload #4
		// @0BD: ifeq @1B4
		// @0C0: bipush -5 (0xFB)
		// @0C2: aload_0
		// @0C3: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0C6: getfield int game.C_100294_ki.field_106951_E
		// @0C9: bipush 7 (0x07)
		// @0CB: iand
		// @0CC: iconst_m1
		// @0CD: ixor
		// @0CE: if_icmpeq @0D9
		// @0D1: goto @0D5
		// @0D4: athrow
		// @0D5: goto @1B4
		// @0D8: athrow
		// @0D9: aload_0
		// @0DA: getfield int game.C_100018_wk.field_101514_F
		// @0DD: aload_0
		// @0DE: getfield int game.C_100018_wk.field_101527_J
		// @0E1: aload_0
		// @0E2: getfield boolean game.C_100018_wk.field_101534_V
		// @0E5: aload_0
		// @0E6: getfield int game.C_100018_wk.field_101545_fb
		// @0E9: aload_0
		// @0EA: getfield int game.C_100018_wk.field_101519_C
		// @0ED: ineg
		// @0EE: aload_0
		// @0EF: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @0F2: bipush -124 (0x84)
		// @0F4: aload_0
		// @0F5: getfield int game.C_100018_wk.field_101514_F
		// @0F8: iconst_4
		// @0F9: sipush 200 (0x00C8)
		// @0FC: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @0FF: astore_3
		// @100: aload_0
		// @101: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @104: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @107: bipush 123 (0x7B)
		// @109: aload_3
		// @10A: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @10D: iload #4
		// @10F: ifeq @1B4
		// @112: iconst_m1
		// @113: aload_0
		// @114: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @117: getfield int game.C_100294_ki.field_106951_E
		// @11A: iconst_3
		// @11B: iand
		// @11C: iconst_m1
		// @11D: ixor
		// @11E: if_icmpne @164
		// @121: goto @125
		// @124: athrow
		// @125: aload_0
		// @126: getfield int game.C_100018_wk.field_101514_F
		// @129: aload_0
		// @12A: getfield int game.C_100018_wk.field_101527_J
		// @12D: ineg
		// @12E: iconst_2
		// @12F: idiv
		// @130: aload_0
		// @131: getfield boolean game.C_100018_wk.field_101534_V
		// @134: aload_0
		// @135: getfield int game.C_100018_wk.field_101545_fb
		// @138: aload_0
		// @139: getfield int game.C_100018_wk.field_101519_C
		// @13C: iconst_2
		// @13D: idiv
		// @13E: aload_0
		// @13F: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @142: bipush -124 (0x84)
		// @144: aload_0
		// @145: getfield int game.C_100018_wk.field_101514_F
		// @148: iconst_5
		// @149: sipush 200 (0x00C8)
		// @14C: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @14F: astore_3
		// @150: aload_0
		// @151: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @154: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @157: iload_2
		// @158: bipush 124 (0x7C)
		// @15A: ixor
		// @15B: aload_3
		// @15C: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @15F: iload #4
		// @161: ifeq @1B4
		// @164: aload_0
		// @165: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @168: getfield int game.C_100294_ki.field_106951_E
		// @16B: iconst_3
		// @16C: iand
		// @16D: iconst_m1
		// @16E: ixor
		// @16F: bipush -3 (0xFD)
		// @171: if_icmpeq @17C
		// @174: goto @178
		// @177: athrow
		// @178: goto @1B4
		// @17B: athrow
		// @17C: aload_0
		// @17D: getfield int game.C_100018_wk.field_101514_F
		// @180: aload_0
		// @181: getfield int game.C_100018_wk.field_101527_J
		// @184: iconst_2
		// @185: idiv
		// @186: aload_0
		// @187: getfield boolean game.C_100018_wk.field_101534_V
		// @18A: aload_0
		// @18B: getfield int game.C_100018_wk.field_101545_fb
		// @18E: aload_0
		// @18F: getfield int game.C_100018_wk.field_101519_C
		// @192: ineg
		// @193: iconst_2
		// @194: idiv
		// @195: aload_0
		// @196: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @199: bipush -124 (0x84)
		// @19B: aload_0
		// @19C: getfield int game.C_100018_wk.field_101514_F
		// @19F: iconst_5
		// @1A0: sipush 200 (0x00C8)
		// @1A3: invokestatic game.C_100157_db.func_103553_a(int, int, boolean, int, int, game.C_100294_ki, byte, int, int, int)game.C_100059_df
		// @1A6: astore_3
		// @1A7: aload_0
		// @1A8: getfield game.C_100294_ki game.C_100018_wk.field_101540_bb
		// @1AB: getfield game.C_100202_qi game.C_100294_ki.field_106949_hb
		// @1AE: bipush 124 (0x7C)
		// @1B0: aload_3
		// @1B1: invokevirtual game.C_100202_qi.func_105901_a(int, game.C_100158_da)void
		// @1B4: iconst_0
		// @1B5: ireturn
		// @1B6: astore_3
		// @1B7: aload_3
		// @1B8: new java.lang.StringBuilder
		// @1BB: dup
		// @1BC: invokespecial java.lang.StringBuilder.<init>()void
		// @1BF: getstatic java.lang.String[] game.C_100018_wk.field_101532_ib
		// @1C2: iconst_5
		// @1C3: aaload
		// @1C4: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @1C7: iload_1
		// @1C8: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1CB: bipush 44 (0x2C)
		// @1CD: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1D0: iload_2
		// @1D1: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @1D4: bipush 41 (0x29)
		// @1D6: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @1D9: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @1DC: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @1DF: athrow
	}
	
	public static void func_101493_d(byte arg0)
	{
		// @00: aconst_null
		// @01: putstatic java.lang.String game.C_100018_wk.field_101552_z
		// @04: aconst_null
		// @05: putstatic java.lang.String game.C_100018_wk.field_101536_P
		// @08: aconst_null
		// @09: putstatic game.C_100037_wb game.C_100018_wk.field_101550_s
		// @0C: aconst_null
		// @0D: putstatic java.lang.String game.C_100018_wk.field_101512_D
		// @10: iload_0
		// @11: bipush -94 (0xA2)
		// @13: if_icmple @21
		// @16: aconst_null
		// @17: checkcast game.C_100302_ka
		// @1A: putstatic game.C_100302_ka game.C_100018_wk.field_101531_T
		// @1D: goto @21
		// @20: athrow
		// @21: aconst_null
		// @22: putstatic game.C_100302_ka game.C_100018_wk.field_101531_T
		// @25: goto @4A
		// @28: astore_1
		// @29: aload_1
		// @2A: new java.lang.StringBuilder
		// @2D: dup
		// @2E: invokespecial java.lang.StringBuilder.<init>()void
		// @31: getstatic java.lang.String[] game.C_100018_wk.field_101532_ib
		// @34: bipush 19 (0x13)
		// @36: aaload
		// @37: invokevirtual java.lang.StringBuilder.append(java.lang.String)java.lang.StringBuilder
		// @3A: iload_0
		// @3B: invokevirtual java.lang.StringBuilder.append(int)java.lang.StringBuilder
		// @3E: bipush 41 (0x29)
		// @40: invokevirtual java.lang.StringBuilder.append(char)java.lang.StringBuilder
		// @43: invokevirtual java.lang.StringBuilder.toString()java.lang.String
		// @46: invokestatic game.C_100181_cf.func_105695_a(java.lang.Throwable, java.lang.String)game.C_100170_cm
		// @49: athrow
		// @4A: return
	}
	
	static
	{
		// @000: bipush 23 (0x17)
		// @002: anewarray java.lang.String
		// @005: dup
		// @006: iconst_0
		// @007: ldc "x\u0000eKK'"
		// @009: invokestatic game.C_100018_wk.func_101496_z(java.lang.String)char[]
		// @00C: invokestatic game.C_100018_wk.func_101495_z(char[])java.lang.String
		// @00F: aastore
		// @010: dup
		// @011: iconst_1
		// @012: ldc_w "x\u0000eJ\""
		// @015: invokestatic game.C_100018_wk.func_101496_z(java.lang.String)char[]
		// @018: invokestatic game.C_100018_wk.func_101495_z(char[])java.lang.String
		// @01B: aastore
		// @01C: dup
		// @01D: iconst_2
		// @01E: ldc "a\u001e'n"
		// @020: invokestatic game.C_100018_wk.func_101496_z(java.lang.String)char[]
		// @023: invokestatic game.C_100018_wk.func_101495_z(char[])java.lang.String
		// @026: aastore
		// @027: dup
		// @028: iconst_3
		// @029: ldc "x\u0000eA\""
		// @02B: invokestatic game.C_100018_wk.func_101496_z(java.lang.String)char[]
		// @02E: invokestatic game.C_100018_wk.func_101495_z(char[])java.lang.String
		// @031: aastore
		// @032: dup
		// @033: iconst_4
		// @034: ldc "tEe,w"
		// @036: invokestatic game.C_100018_wk.func_101496_z(java.lang.String)char[]
		// @039: invokestatic game.C_100018_wk.func_101495_z(char[])java.lang.String
		// @03C: aastore
		// @03D: dup
		// @03E: iconst_5
		// @03F: ldc_w "x\u0000eC\""
		// @042: invokestatic game.C_100018_wk.func_101496_z(java.lang.String)char[]
		// @045: invokestatic game.C_100018_wk.func_101495_z(char[])java.lang.String
		// @048: aastore
		// @049: dup
		// @04A: bipush 6 (0x06)
		// @04C: ldc_w "x\u0000eG\""
		// @04F: invokestatic game.C_100018_wk.func_101496_z(java.lang.String)char[]
		// @052: invokestatic game.C_100018_wk.func_101495_z(char[])java.lang.String
		// @055: aastore
		// @056: dup
		// @057: bipush 7 (0x07)
		// @059: ldc "x\u0000eF\""
		// @05B: invokestatic game.C_100018_wk.func_101496_z(java.lang.String)char[]
		// @05E: invokestatic game.C_100018_wk.func_101495_z(char[])java.lang.String
		// @061: aastore
		// @062: dup
		// @063: bipush 8 (0x08)
		// @065: ldc_w "x\u0000eK\""
		// @068: invokestatic game.C_100018_wk.func_101496_z(java.lang.String)char[]
		// @06B: invokestatic game.C_100018_wk.func_101495_z(char[])java.lang.String
		// @06E: aastore
		// @06F: dup
		// @070: bipush 9 (0x09)
		// @072: ldc_w "x\u0000eIK'"
		// @075: invokestatic game.C_100018_wk.func_101496_z(java.lang.String)char[]
		// @078: invokestatic game.C_100018_wk.func_101495_z(char[])java.lang.String
		// @07B: aastore
		// @07C: dup
		// @07D: bipush 10 (0x0A)
		// @07F: ldc "x\u0000e@\""
		// @081: invokestatic game.C_100018_wk.func_101496_z(java.lang.String)char[]
		// @084: invokestatic game.C_100018_wk.func_101495_z(char[])java.lang.String
		// @087: aastore
		// @088: dup
		// @089: bipush 11 (0x0B)
		// @08B: ldc_w "x\u0000eV\""
		// @08E: invokestatic game.C_100018_wk.func_101496_z(java.lang.String)char[]
		// @091: invokestatic game.C_100018_wk.func_101495_z(char[])java.lang.String
		// @094: aastore
		// @095: dup
		// @096: bipush 12 (0x0C)
		// @098: ldc "D\u000e2\"in\u0005%m~/\u0003*to/\u0011.pe/\u0007.lm{\u0003"
		// @09A: invokestatic game.C_100018_wk.func_101496_z(java.lang.String)char[]
		// @09D: invokestatic game.C_100018_wk.func_101495_z(char[])java.lang.String
		// @0A0: aastore
		// @0A1: dup
		// @0A2: bipush 13 (0x0D)
		// @0A4: ldc "x\u0000eNK'"
		// @0A6: invokestatic game.C_100018_wk.func_101496_z(java.lang.String)char[]
		// @0A9: invokestatic game.C_100018_wk.func_101495_z(char[])java.lang.String
		// @0AC: aastore
		// @0AD: dup
		// @0AE: bipush 14 (0x0E)
		// @0B0: ldc_w "x\u0000eQ\""
		// @0B3: invokestatic game.C_100018_wk.func_101496_z(java.lang.String)char[]
		// @0B6: invokestatic game.C_100018_wk.func_101495_z(char[])java.lang.String
		// @0B9: aastore
		// @0BA: dup
		// @0BB: bipush 15 (0x0F)
		// @0BD: ldc_w "x\u0000eMK'"
		// @0C0: invokestatic game.C_100018_wk.func_101496_z(java.lang.String)char[]
		// @0C3: invokestatic game.C_100018_wk.func_101495_z(char[])java.lang.String
		// @0C6: aastore
		// @0C7: dup
		// @0C8: bipush 16 (0x10)
		// @0CA: ldc_w "x\u0000eS\""
		// @0CD: invokestatic game.C_100018_wk.func_101496_z(java.lang.String)char[]
		// @0D0: invokestatic game.C_100018_wk.func_101495_z(char[])java.lang.String
		// @0D3: aastore
		// @0D4: dup
		// @0D5: bipush 17 (0x11)
		// @0D7: ldc_w "x\u0000eE\""
		// @0DA: invokestatic game.C_100018_wk.func_101496_z(java.lang.String)char[]
		// @0DD: invokestatic game.C_100018_wk.func_101495_z(char[])java.lang.String
		// @0E0: aastore
		// @0E1: dup
		// @0E2: bipush 18 (0x12)
		// @0E4: ldc_w "x\u0000e>ca\u0002?<\""
		// @0E7: invokestatic game.C_100018_wk.func_101496_z(java.lang.String)char[]
		// @0EA: invokestatic game.C_100018_wk.func_101495_z(char[])java.lang.String
		// @0ED: aastore
		// @0EE: dup
		// @0EF: bipush 19 (0x13)
		// @0F1: ldc_w "x\u0000eP\""
		// @0F4: invokestatic game.C_100018_wk.func_101496_z(java.lang.String)char[]
		// @0F7: invokestatic game.C_100018_wk.func_101495_z(char[])java.lang.String
		// @0FA: aastore
		// @0FB: dup
		// @0FC: bipush 20 (0x14)
		// @0FE: ldc_w "x\u0000eOK'"
		// @101: invokestatic game.C_100018_wk.func_101496_z(java.lang.String)char[]
		// @104: invokestatic game.C_100018_wk.func_101495_z(char[])java.lang.String
		// @107: aastore
		// @108: dup
		// @109: bipush 21 (0x15)
		// @10B: ldc_w "x\u0000eHK'"
		// @10E: invokestatic game.C_100018_wk.func_101496_z(java.lang.String)char[]
		// @111: invokestatic game.C_100018_wk.func_101495_z(char[])java.lang.String
		// @114: aastore
		// @115: dup
		// @116: bipush 22 (0x16)
		// @118: ldc "x\u0000eLK'"
		// @11A: invokestatic game.C_100018_wk.func_101496_z(java.lang.String)char[]
		// @11D: invokestatic game.C_100018_wk.func_101495_z(char[])java.lang.String
		// @120: aastore
		// @121: putstatic java.lang.String[] game.C_100018_wk.field_101532_ib
		// @124: iconst_0
		// @125: putstatic boolean game.C_100018_wk.field_101549_t
		// @128: ldc_w "[\u0002;q"
		// @12B: invokestatic game.C_100018_wk.func_101496_z(java.lang.String)char[]
		// @12E: invokestatic game.C_100018_wk.func_101495_z(char[])java.lang.String
		// @131: putstatic java.lang.String game.C_100018_wk.field_101512_D
		// @134: ldc_w "M\n8ki/($ohn\u001f"
		// @137: invokestatic game.C_100018_wk.func_101496_z(java.lang.String)char[]
		// @13A: invokestatic game.C_100018_wk.func_101495_z(char[])java.lang.String
		// @13D: putstatic java.lang.String game.C_100018_wk.field_101552_z
		// @140: ldc_w "G\u0002/g*\u007f\u0007*{o}\u0018kkd/Wn24(\u0018kekb\u000e"
		// @143: invokestatic game.C_100018_wk.func_101496_z(java.lang.String)char[]
		// @146: invokestatic game.C_100018_wk.func_101495_z(char[])java.lang.String
		// @149: putstatic java.lang.String game.C_100018_wk.field_101536_P
		// @14C: return
	}
	
	private static char[] func_101496_z(String arg0)
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
		// @0E: bipush 10 (0x0A)
		// @10: ixor
		// @11: i2c
		// @12: castore
		// @13: areturn
	}
	
	private static String func_101495_z(char[] arg0)
	{
		// @00: aload_0
		// @01: dup
		// @02: arraylength
		// @03: swap
		// @04: iconst_0
		// @05: istore_1
		// @06: goto @4B
		// @09: dup
		// @0A: iload_1
		// @0B: dup2
		// @0C: caload
		// @0D: iload_1
		// @0E: iconst_5
		// @0F: irem
		// @10: tableswitch def: @43, for 0: @30, for 1: @35, for 2: @3A, for 3: @3F
		// @30: bipush 15 (0x0F)
		// @32: goto @45
		// @35: bipush 107 (0x6B)
		// @37: goto @45
		// @3A: bipush 75 (0x4B)
		// @3C: goto @45
		// @3F: iconst_2
		// @40: goto @45
		// @43: bipush 10 (0x0A)
		// @45: ixor
		// @46: i2c
		// @47: castore
		// @48: iinc #1 +1
		// @4B: swap
		// @4C: dup_x1
		// @4D: iload_1
		// @4E: if_icmpgt @09
		// @51: new java.lang.String
		// @54: dup_x1
		// @55: swap
		// @56: invokespecial java.lang.String.<init>(char[])void
		// @59: invokevirtual java.lang.String.intern()java.lang.String
		// @5C: areturn
	}
}
