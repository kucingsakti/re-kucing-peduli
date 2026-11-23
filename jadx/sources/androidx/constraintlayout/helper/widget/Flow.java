package androidx.constraintlayout.helper.widget;

import B.c;
import B.d;
import B.e;
import B.f;
import B.g;
import B.h;
import C.b;
import E.r;
import E.t;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends t {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final g f6288B;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1087s = new int[32];
        this.f1093y = new HashMap();
        this.f1089u = context;
        super.g(attributeSet);
        g gVar = new g();
        gVar.f556s0 = 0;
        gVar.f557t0 = 0;
        gVar.f558u0 = 0;
        gVar.f559v0 = 0;
        gVar.f560w0 = 0;
        gVar.f561x0 = 0;
        gVar.f562y0 = false;
        gVar.f563z0 = 0;
        gVar.f530A0 = 0;
        gVar.f531B0 = new b();
        gVar.f532C0 = null;
        gVar.f533D0 = -1;
        gVar.f534E0 = -1;
        gVar.f535F0 = -1;
        gVar.f536G0 = -1;
        gVar.f537H0 = -1;
        gVar.f538I0 = -1;
        gVar.f539J0 = 0.5f;
        gVar.f540K0 = 0.5f;
        gVar.f541L0 = 0.5f;
        gVar.f542M0 = 0.5f;
        gVar.f543N0 = 0.5f;
        gVar.f544O0 = 0.5f;
        gVar.f545P0 = 0;
        gVar.f546Q0 = 0;
        gVar.f547R0 = 2;
        gVar.f548S0 = 2;
        gVar.f549T0 = 0;
        gVar.U0 = -1;
        gVar.f550V0 = 0;
        gVar.f551W0 = new ArrayList();
        gVar.f552X0 = null;
        gVar.Y0 = null;
        gVar.f553Z0 = null;
        gVar.f555b1 = 0;
        this.f6288B = gVar;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f1277b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.f6288B.f550V0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    g gVar2 = this.f6288B;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar2.f556s0 = dimensionPixelSize;
                    gVar2.f557t0 = dimensionPixelSize;
                    gVar2.f558u0 = dimensionPixelSize;
                    gVar2.f559v0 = dimensionPixelSize;
                } else if (index == 18) {
                    g gVar3 = this.f6288B;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar3.f558u0 = dimensionPixelSize2;
                    gVar3.f560w0 = dimensionPixelSize2;
                    gVar3.f561x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f6288B.f559v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f6288B.f560w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f6288B.f556s0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f6288B.f561x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f6288B.f557t0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f6288B.f549T0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f6288B.f533D0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f6288B.f534E0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f6288B.f535F0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f6288B.f537H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f6288B.f536G0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f6288B.f538I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f6288B.f539J0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f6288B.f541L0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f6288B.f543N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f6288B.f542M0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f6288B.f544O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f6288B.f540K0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f6288B.f547R0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f6288B.f548S0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f6288B.f545P0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f6288B.f546Q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f6288B.U0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f1090v = this.f6288B;
        i();
    }

    @Override // E.c
    public final void h(d dVar, boolean z6) {
        g gVar = this.f6288B;
        int i10 = gVar.f558u0;
        if (i10 > 0 || gVar.f559v0 > 0) {
            if (z6) {
                gVar.f560w0 = gVar.f559v0;
                gVar.f561x0 = i10;
            } else {
                gVar.f560w0 = i10;
                gVar.f561x0 = gVar.f559v0;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:106:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:108:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:109:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:112:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:114:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:132:0x021a  */
    /* JADX WARN: Code duplicated, block: B:133:0x0232  */
    /* JADX WARN: Code duplicated, block: B:135:0x0236  */
    /* JADX WARN: Code duplicated, block: B:136:0x023d  */
    /* JADX WARN: Code duplicated, block: B:145:0x0263  */
    /* JADX WARN: Code duplicated, block: B:150:0x026c  */
    /* JADX WARN: Code duplicated, block: B:152:0x0274  */
    /* JADX WARN: Code duplicated, block: B:153:0x027e  */
    /* JADX WARN: Code duplicated, block: B:157:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:159:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:161:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:162:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:165:0x02df  */
    /* JADX WARN: Code duplicated, block: B:167:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:169:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:170:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:173:0x031f  */
    /* JADX WARN: Code duplicated, block: B:177:0x0334  */
    /* JADX WARN: Code duplicated, block: B:179:0x0344  */
    /* JADX WARN: Code duplicated, block: B:181:0x0348  */
    /* JADX WARN: Code duplicated, block: B:183:0x034e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:184:0x0350  */
    /* JADX WARN: Code duplicated, block: B:188:0x0358  */
    /* JADX WARN: Code duplicated, block: B:191:0x0360  */
    /* JADX WARN: Code duplicated, block: B:194:0x0369  */
    /* JADX WARN: Code duplicated, block: B:195:0x036b  */
    /* JADX WARN: Code duplicated, block: B:197:0x036f  */
    /* JADX WARN: Code duplicated, block: B:199:0x0375 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:200:0x0377  */
    /* JADX WARN: Code duplicated, block: B:204:0x037f  */
    /* JADX WARN: Code duplicated, block: B:207:0x0387  */
    /* JADX WARN: Code duplicated, block: B:213:0x0394  */
    /* JADX WARN: Code duplicated, block: B:222:0x03a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:223:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:224:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:229:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:238:0x03db  */
    /* JADX WARN: Code duplicated, block: B:241:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:243:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:245:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:256:0x0409  */
    /* JADX WARN: Code duplicated, block: B:261:0x041d  */
    /* JADX WARN: Code duplicated, block: B:266:0x042c  */
    /* JADX WARN: Code duplicated, block: B:268:0x0432 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:269:0x0434  */
    /* JADX WARN: Code duplicated, block: B:274:0x0445  */
    /* JADX WARN: Code duplicated, block: B:276:0x044b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:277:0x044d  */
    /* JADX WARN: Code duplicated, block: B:290:0x047c  */
    /* JADX WARN: Code duplicated, block: B:293:0x0490  */
    /* JADX WARN: Code duplicated, block: B:295:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:297:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:299:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:316:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:318:0x04f1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:319:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:321:0x0501  */
    /* JADX WARN: Code duplicated, block: B:323:0x0507  */
    /* JADX WARN: Code duplicated, block: B:325:0x0516  */
    /* JADX WARN: Code duplicated, block: B:342:0x053a  */
    /* JADX WARN: Code duplicated, block: B:344:0x0551  */
    /* JADX WARN: Code duplicated, block: B:346:0x0555  */
    /* JADX WARN: Code duplicated, block: B:354:0x057e  */
    /* JADX WARN: Code duplicated, block: B:359:0x0587  */
    /* JADX WARN: Code duplicated, block: B:361:0x058f  */
    /* JADX WARN: Code duplicated, block: B:362:0x0599  */
    /* JADX WARN: Code duplicated, block: B:366:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:368:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:370:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:371:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:374:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:376:0x0603  */
    /* JADX WARN: Code duplicated, block: B:378:0x0607  */
    /* JADX WARN: Code duplicated, block: B:379:0x0618  */
    /* JADX WARN: Code duplicated, block: B:37:0x0094  */
    /* JADX WARN: Code duplicated, block: B:382:0x063a  */
    /* JADX WARN: Code duplicated, block: B:386:0x064f  */
    /* JADX WARN: Code duplicated, block: B:389:0x0661  */
    /* JADX WARN: Code duplicated, block: B:391:0x0667  */
    /* JADX WARN: Code duplicated, block: B:392:0x0678  */
    /* JADX WARN: Code duplicated, block: B:395:0x06bb A[LOOP:18: B:394:0x06b9->B:395:0x06bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:400:0x06e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:401:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:402:0x06ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:403:0x06ef  */
    /* JADX WARN: Code duplicated, block: B:404:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:406:0x06f4  */
    /* JADX WARN: Code duplicated, block: B:407:0x06f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:408:0x06f9  */
    /* JADX WARN: Code duplicated, block: B:409:0x0700 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x009a  */
    /* JADX WARN: Code duplicated, block: B:410:0x0702  */
    /* JADX WARN: Code duplicated, block: B:411:0x0704  */
    /* JADX WARN: Code duplicated, block: B:414:0x0713  */
    /* JADX WARN: Code duplicated, block: B:415:0x0716  */
    /* JADX WARN: Code duplicated, block: B:426:0x00ce A[EDGE_INSN: B:426:0x00ce->B:59:0x00ce BREAK  A[LOOP:1: B:53:0x00ba->B:58:0x00ca], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:428:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x009e  */
    /* JADX WARN: Code duplicated, block: B:431:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:447:0x0366 A[EDGE_INSN: B:447:0x0366->B:193:0x0366 BREAK  A[LOOP:7: B:182:0x034c->B:192:0x0363], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:449:0x0363 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:450:0x046b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:456:0x0460 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:472:0x043d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:475:0x0456 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:477:0x038d A[EDGE_INSN: B:477:0x038d->B:209:0x038d BREAK  A[LOOP:13: B:198:0x0373->B:208:0x038a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:479:0x038a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00db  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:72:0x0108  */
    /* JADX WARN: Code duplicated, block: B:74:0x011d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0120  */
    /* JADX WARN: Code duplicated, block: B:78:0x0123  */
    /* JADX WARN: Code duplicated, block: B:80:0x0133  */
    /* JADX WARN: Code duplicated, block: B:83:0x0139  */
    /* JADX WARN: Code duplicated, block: B:85:0x0162  */
    /* JADX WARN: Code duplicated, block: B:87:0x0169  */
    /* JADX WARN: Code duplicated, block: B:89:0x017e  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // E.t
    public final void j(g gVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int[] iArr;
        int i16;
        int i17;
        d[] dVarArr;
        int i18;
        int i19;
        char c10;
        int i20;
        int i21;
        d[] dVarArr2;
        int i22;
        int i23;
        ArrayList arrayList;
        int i24;
        int i25;
        int i26;
        int[] iArr2;
        int i27;
        int i28;
        int i29;
        f fVar;
        int i30;
        char c11;
        int i31;
        int i32;
        int iMin;
        boolean z6;
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        int[] iArr3;
        int i33;
        f fVar2;
        int i34;
        int i35;
        int i36;
        d dVar;
        int iT;
        boolean z10;
        int i37;
        int size;
        boolean z11;
        int i38;
        int i39;
        int i40;
        int i41;
        c cVar5;
        c cVar6;
        int i42;
        int iMax;
        int i43;
        c cVar7;
        c cVar8;
        f fVar3;
        int iD;
        int iC;
        int i44;
        f fVar4;
        int i45;
        int i46;
        d dVar2;
        int iU;
        boolean z12;
        int i47;
        int i48;
        int iCeil;
        int iCeil2;
        int i49;
        int i50;
        int i51;
        d dVar3;
        int iT2;
        boolean z13;
        d[] dVarArr3;
        Object obj;
        d[] dVarArr4;
        int i52;
        int i53;
        int iU2;
        int i54;
        int iT3;
        d dVar4;
        d dVar5;
        int i55;
        int i56;
        d dVar6;
        d dVar7;
        d dVar8;
        int i57;
        int i58;
        int i59;
        d dVar9;
        int iU3;
        int i60;
        f fVar5;
        int i61;
        int i62;
        int i63;
        int i64;
        int i65;
        d dVar10;
        int iT4;
        int i66;
        boolean z14;
        int i67;
        int size2;
        boolean z15;
        int i68;
        int i69;
        int i70;
        int i71;
        c cVar9;
        c cVar10;
        int i72;
        int iMax2;
        int i73;
        c cVar11;
        c cVar12;
        f fVar6;
        int iD2;
        int iC2;
        int i74;
        f fVar7;
        int i75;
        int i76;
        int i77;
        d dVar11;
        int iU4;
        int i78;
        int i79;
        boolean z16;
        int i80;
        int i81;
        int i82;
        d[] dVarArr5;
        int i83;
        d dVar12;
        d[] dVarArr6;
        int mode = View.MeasureSpec.getMode(i10);
        int size3 = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size4 = View.MeasureSpec.getSize(i11);
        if (gVar == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (gVar.f571r0 <= 0) {
            i12 = gVar.f560w0;
            i13 = gVar.f561x0;
            i14 = gVar.f556s0;
            i15 = gVar.f557t0;
            iArr = new int[2];
            i16 = (size3 - i12) - i13;
            i17 = gVar.f550V0;
            if (i17 == 1) {
                i16 = (size4 - i14) - i15;
            }
            if (i17 == 0) {
                if (gVar.f533D0 == -1) {
                    gVar.f533D0 = 0;
                }
                if (gVar.f534E0 == -1) {
                    gVar.f534E0 = 0;
                }
            } else {
                if (gVar.f533D0 == -1) {
                    gVar.f533D0 = 0;
                }
                if (gVar.f534E0 == -1) {
                    gVar.f534E0 = 0;
                }
            }
            dVarArr = gVar.f570q0;
            i18 = 0;
            i19 = 0;
            c10 = 0;
            while (true) {
                i20 = gVar.f571r0;
                if (i18 < i20) {
                    break;
                }
                if (gVar.f570q0[i18].f464g0 == 8) {
                    i19++;
                }
                i18++;
            }
            if (i19 > 0) {
                dVarArr5 = new d[i20 - i19];
                i83 = 0;
                i21 = 0;
                while (i83 < gVar.f571r0) {
                    dVar12 = gVar.f570q0[i83];
                    int i84 = i12;
                    dVarArr6 = dVarArr5;
                    if (dVar12.f464g0 != 8) {
                        dVarArr6[i21] = dVar12;
                        i21++;
                    }
                    i83++;
                    i12 = i84;
                    dVarArr5 = dVarArr6;
                }
                dVarArr2 = dVarArr5;
            } else {
                i21 = i20;
                dVarArr2 = dVarArr;
            }
            i22 = i12;
            gVar.f554a1 = dVarArr2;
            gVar.f555b1 = i21;
            i23 = gVar.f549T0;
            arrayList = gVar.f551W0;
            if (i23 != 0) {
                cVar = gVar.f438J;
                cVar2 = gVar.f437I;
                cVar3 = gVar.f439K;
                cVar4 = gVar.f440L;
                iArr3 = gVar.f481p0;
                if (i23 != 1) {
                    i24 = i13;
                    i25 = i14;
                    i26 = i15;
                    iArr2 = iArr;
                    i27 = size4;
                    i28 = i22;
                    i33 = gVar.f550V0;
                    if (i21 != 0) {
                        arrayList.clear();
                        fVar2 = new f(gVar, i33, gVar.f437I, gVar.f438J, gVar.f439K, gVar.f440L, i16);
                        arrayList.add(fVar2);
                        if (i33 == 0) {
                            i45 = 0;
                            i35 = 0;
                            i46 = 0;
                            while (i45 < i21) {
                                dVar2 = dVarArr2[i45];
                                iU = gVar.U(dVar2, i16);
                                if (dVar2.f481p0[0] == 3) {
                                    i35++;
                                }
                                int i85 = i35;
                                z12 = (i46 != i16 || (gVar.f545P0 + i46) + iU > i16) && fVar2.f514b != null;
                                if (!z12 && i45 > 0 && (i47 = gVar.U0) > 0 && i45 % i47 == 0) {
                                    z12 = true;
                                }
                                if (z12) {
                                    fVar2 = new f(gVar, i33, gVar.f437I, gVar.f438J, gVar.f439K, gVar.f440L, i16);
                                    fVar2.f525n = i45;
                                    arrayList.add(fVar2);
                                } else {
                                    if (i45 > 0) {
                                        i46 = gVar.f545P0 + iU + i46;
                                    }
                                    fVar2.a(dVar2);
                                    i45++;
                                    i35 = i85;
                                }
                                i46 = iU;
                                fVar2.a(dVar2);
                                i45++;
                                i35 = i85;
                            }
                        } else {
                            i34 = 0;
                            i35 = 0;
                            i36 = 0;
                            while (i34 < i21) {
                                dVar = dVarArr2[i34];
                                iT = gVar.T(dVar, i16);
                                if (dVar.f481p0[1] == 3) {
                                    i35++;
                                }
                                int i86 = i35;
                                z10 = (i36 != i16 || (gVar.f546Q0 + i36) + iT > i16) && fVar2.f514b != null;
                                if (!z10 && i34 > 0 && (i37 = gVar.U0) > 0 && i34 % i37 == 0) {
                                    z10 = true;
                                }
                                if (z10) {
                                    fVar2 = new f(gVar, i33, gVar.f437I, gVar.f438J, gVar.f439K, gVar.f440L, i16);
                                    fVar2.f525n = i34;
                                    arrayList.add(fVar2);
                                } else {
                                    if (i34 > 0) {
                                        i36 = gVar.f546Q0 + iT + i36;
                                    }
                                    fVar2.a(dVar);
                                    i34++;
                                    i35 = i86;
                                }
                                i36 = iT;
                                fVar2.a(dVar);
                                i34++;
                                i35 = i86;
                            }
                        }
                        size = arrayList.size();
                        int i87 = gVar.f560w0;
                        int i88 = gVar.f556s0;
                        int i89 = gVar.f561x0;
                        int i90 = gVar.f557t0;
                        if (iArr3[0] != 2 || iArr3[1] == 2) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i35 > 0 && z11) {
                            for (i44 = 0; i44 < size; i44++) {
                                fVar4 = (f) arrayList.get(i44);
                                if (i33 == 0) {
                                    fVar4.e(i16 - fVar4.d());
                                } else {
                                    fVar4.e(i16 - fVar4.c());
                                }
                            }
                        }
                        i38 = i87;
                        i39 = i88;
                        i40 = i89;
                        i41 = i90;
                        cVar5 = cVar2;
                        cVar6 = cVar;
                        iMax = 0;
                        i43 = 0;
                        cVar7 = cVar3;
                        cVar8 = cVar4;
                        for (i42 = 0; i42 < size; i42++) {
                            fVar3 = (f) arrayList.get(i42);
                            if (i33 == 0) {
                                if (i42 < size - 1) {
                                    cVar8 = ((f) arrayList.get(i42 + 1)).f514b.f438J;
                                    i41 = 0;
                                } else {
                                    i41 = gVar.f557t0;
                                    cVar8 = cVar4;
                                }
                                c cVar13 = fVar3.f514b.f440L;
                                fVar3.f(i33, cVar5, cVar6, cVar7, cVar8, i38, i39, i40, i41, i16);
                                iMax = Math.max(iMax, fVar3.d());
                                iC = fVar3.c() + i43;
                                if (i42 > 0) {
                                    iC += gVar.f546Q0;
                                }
                                i43 = iC;
                                cVar6 = cVar13;
                                i39 = 0;
                            } else {
                                if (i42 < size - 1) {
                                    cVar7 = ((f) arrayList.get(i42 + 1)).f514b.f437I;
                                    i40 = 0;
                                } else {
                                    i40 = gVar.f561x0;
                                    cVar7 = cVar3;
                                }
                                c cVar14 = fVar3.f514b.f439K;
                                fVar3.f(i33, cVar5, cVar6, cVar7, cVar8, i38, i39, i40, i41, i16);
                                iD = fVar3.d() + iMax;
                                int iMax3 = Math.max(i43, fVar3.c());
                                if (i42 > 0) {
                                    iD += gVar.f545P0;
                                }
                                i43 = iMax3;
                                iMax = iD;
                                cVar5 = cVar14;
                                i38 = 0;
                            }
                        }
                        iArr2[0] = iMax;
                        iArr2[1] = i43;
                    }
                } else if (i23 != 2) {
                    i24 = i13;
                    i25 = i14;
                    i26 = i15;
                    iArr2 = iArr;
                    i27 = size4;
                    i28 = i22;
                    i48 = gVar.f550V0;
                    if (i48 == 0) {
                        i57 = gVar.U0;
                        if (i57 <= 0) {
                            i59 = 0;
                            iCeil2 = 0;
                            for (i58 = 0; i58 < i21; i58++) {
                                if (i58 > 0) {
                                    i59 += gVar.f545P0;
                                }
                                dVar9 = dVarArr2[i58];
                                if (dVar9 != null) {
                                    iU3 = gVar.U(dVar9, i16) + i59;
                                    if (iU3 > i16) {
                                        break;
                                    }
                                    iCeil2++;
                                    i59 = iU3;
                                }
                            }
                        } else {
                            iCeil2 = i57;
                        }
                        iCeil = 0;
                    } else {
                        iCeil = gVar.U0;
                        if (iCeil <= 0) {
                            i50 = 0;
                            i51 = 0;
                            for (i49 = 0; i49 < i21; i49++) {
                                if (i49 > 0) {
                                    i50 += gVar.f546Q0;
                                }
                                dVar3 = dVarArr2[i49];
                                if (dVar3 != null) {
                                    iT2 = gVar.T(dVar3, i16) + i50;
                                    if (iT2 > i16) {
                                        break;
                                    }
                                    i51++;
                                    i50 = iT2;
                                }
                            }
                            iCeil = i51;
                        }
                        iCeil2 = 0;
                    }
                    if (gVar.f553Z0 == null) {
                        gVar.f553Z0 = new int[2];
                    }
                    z13 = (iCeil != 0 && i48 == 1) || (iCeil2 == 0 && i48 == 0);
                    while (!z13) {
                        if (i48 == 0) {
                            iCeil = (int) Math.ceil(i21 / iCeil2);
                        } else {
                            iCeil2 = (int) Math.ceil(i21 / iCeil);
                        }
                        dVarArr3 = gVar.Y0;
                        if (dVarArr3 != null || dVarArr3.length < iCeil2) {
                            obj = null;
                            gVar.Y0 = new d[iCeil2];
                        } else {
                            obj = null;
                            Arrays.fill(dVarArr3, (Object) null);
                        }
                        dVarArr4 = gVar.f552X0;
                        if (dVarArr4 != null || dVarArr4.length < iCeil) {
                            gVar.f552X0 = new d[iCeil];
                        } else {
                            Arrays.fill(dVarArr4, obj);
                        }
                        for (i52 = 0; i52 < iCeil2; i52++) {
                            for (i55 = 0; i55 < iCeil; i55++) {
                                i56 = (i55 * iCeil2) + i52;
                                if (i48 == 1) {
                                    i56 = (i52 * iCeil) + i55;
                                }
                                if (i56 < dVarArr2.length && (dVar6 = dVarArr2[i56]) != null) {
                                    int iU5 = gVar.U(dVar6, i16);
                                    dVar7 = gVar.Y0[i52];
                                    if (dVar7 != null || dVar7.q() < iU5) {
                                        gVar.Y0[i52] = dVar6;
                                    }
                                    int iT5 = gVar.T(dVar6, i16);
                                    dVar8 = gVar.f552X0[i55];
                                    if (dVar8 != null || dVar8.k() < iT5) {
                                        gVar.f552X0[i55] = dVar6;
                                    }
                                }
                            }
                        }
                        iU2 = 0;
                        for (i53 = 0; i53 < iCeil2; i53++) {
                            dVar5 = gVar.Y0[i53];
                            if (dVar5 == null) {
                                if (i53 > 0) {
                                    iU2 += gVar.f545P0;
                                }
                                iU2 = gVar.U(dVar5, i16) + iU2;
                            }
                        }
                        iT3 = 0;
                        for (i54 = 0; i54 < iCeil; i54++) {
                            dVar4 = gVar.f552X0[i54];
                            if (dVar4 == null) {
                                if (i54 > 0) {
                                    iT3 += gVar.f546Q0;
                                }
                                iT3 = gVar.T(dVar4, i16) + iT3;
                            }
                        }
                        iArr2[0] = iU2;
                        iArr2[1] = iT3;
                        if (i48 == 0) {
                            if (iU2 > i16 || iCeil2 <= 1) {
                                z13 = true;
                            } else {
                                iCeil2--;
                            }
                        } else if (iT3 > i16 || iCeil <= 1) {
                            z13 = true;
                        } else {
                            iCeil--;
                        }
                    }
                    int[] iArr4 = gVar.f553Z0;
                    iArr4[0] = iCeil2;
                    iArr4[1] = iCeil;
                } else if (i23 != 3) {
                    i24 = i13;
                    i25 = i14;
                    i26 = i15;
                    iArr2 = iArr;
                    i27 = size4;
                    i28 = i22;
                } else {
                    i60 = gVar.f550V0;
                    if (i21 == 0) {
                        i24 = i13;
                        i25 = i14;
                        i26 = i15;
                        iArr2 = iArr;
                        i27 = size4;
                        i28 = i22;
                    } else {
                        arrayList.clear();
                        i28 = i22;
                        i24 = i13;
                        i25 = i14;
                        i26 = i15;
                        iArr2 = iArr;
                        fVar5 = new f(gVar, i60, gVar.f437I, gVar.f438J, gVar.f439K, gVar.f440L, i16);
                        arrayList.add(fVar5);
                        if (i60 == 0) {
                            i75 = 0;
                            i76 = 0;
                            i65 = 0;
                            i77 = 0;
                            while (i75 < i21) {
                                i76++;
                                dVar11 = dVarArr2[i75];
                                iU4 = gVar.U(dVar11, i16);
                                i78 = i60;
                                i79 = i75;
                                if (dVar11.f481p0[0] == 3) {
                                    i65++;
                                }
                                int i91 = i65;
                                z16 = (i77 != i16 || (gVar.f545P0 + i77) + iU4 > i16) && fVar5.f514b != null;
                                if (!z16 && i79 > 0 && (i82 = gVar.U0) > 0 && i76 > i82) {
                                    z16 = true;
                                }
                                if (z16) {
                                    i60 = i78;
                                    i80 = size4;
                                    i81 = i79;
                                    fVar5 = new f(gVar, i60, gVar.f437I, gVar.f438J, gVar.f439K, gVar.f440L, i16);
                                    fVar5.f525n = i81;
                                    arrayList.add(fVar5);
                                    i77 = iU4;
                                    i76 = 1;
                                } else {
                                    i60 = i78;
                                    i80 = size4;
                                    i81 = i79;
                                    if (i81 > 0) {
                                        i77 = gVar.f545P0 + iU4 + i77;
                                    } else {
                                        i77 = iU4;
                                    }
                                }
                                fVar5.a(dVar11);
                                i75 = i81 + 1;
                                i65 = i91;
                                size4 = i80;
                            }
                            i27 = size4;
                        } else {
                            i27 = size4;
                            i61 = 0;
                            i62 = 0;
                            i63 = 0;
                            i64 = 0;
                            while (i61 < i21) {
                                i62++;
                                dVar10 = dVarArr2[i61];
                                iT4 = gVar.T(dVar10, i16);
                                i66 = i60;
                                if (dVar10.f481p0[1] == 3) {
                                    i63++;
                                }
                                int i92 = i63;
                                z14 = (i64 != i16 || (gVar.f546Q0 + i64) + iT4 > i16) && fVar5.f514b != null;
                                if (!z14 && i61 > 0 && (i67 = gVar.U0) > 0 && i62 > i67) {
                                    z14 = true;
                                }
                                if (z14) {
                                    i60 = i66;
                                    fVar5 = new f(gVar, i60, gVar.f437I, gVar.f438J, gVar.f439K, gVar.f440L, i16);
                                    fVar5.f525n = i61;
                                    arrayList.add(fVar5);
                                    i64 = iT4;
                                    i62 = 1;
                                } else {
                                    i60 = i66;
                                    if (i61 > 0) {
                                        i64 = gVar.f546Q0 + iT4 + i64;
                                    } else {
                                        i64 = iT4;
                                    }
                                }
                                fVar5.a(dVar10);
                                i61++;
                                i63 = i92;
                            }
                            i65 = i63;
                        }
                        size2 = arrayList.size();
                        int i93 = gVar.f560w0;
                        int i94 = gVar.f556s0;
                        int i95 = gVar.f561x0;
                        int i96 = gVar.f557t0;
                        if (iArr3[0] != 2 || iArr3[1] == 2) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (i65 > 0 && z15) {
                            for (i74 = 0; i74 < size2; i74++) {
                                fVar7 = (f) arrayList.get(i74);
                                if (i60 == 0) {
                                    fVar7.e(i16 - fVar7.d());
                                } else {
                                    fVar7.e(i16 - fVar7.c());
                                }
                            }
                        }
                        i68 = i93;
                        i69 = i94;
                        i70 = i95;
                        i71 = i96;
                        cVar9 = cVar2;
                        cVar10 = cVar;
                        iMax2 = 0;
                        i73 = 0;
                        cVar11 = cVar3;
                        cVar12 = cVar4;
                        for (i72 = 0; i72 < size2; i72++) {
                            fVar6 = (f) arrayList.get(i72);
                            if (i60 == 0) {
                                if (i72 < size2 - 1) {
                                    cVar12 = ((f) arrayList.get(i72 + 1)).f514b.f438J;
                                    i71 = 0;
                                } else {
                                    i71 = gVar.f557t0;
                                    cVar12 = cVar4;
                                }
                                c cVar15 = fVar6.f514b.f440L;
                                fVar6.f(i60, cVar9, cVar10, cVar11, cVar12, i68, i69, i70, i71, i16);
                                iMax2 = Math.max(iMax2, fVar6.d());
                                iC2 = fVar6.c() + i73;
                                if (i72 > 0) {
                                    iC2 += gVar.f546Q0;
                                }
                                i73 = iC2;
                                cVar10 = cVar15;
                                i69 = 0;
                            } else {
                                if (i72 < size2 - 1) {
                                    cVar11 = ((f) arrayList.get(i72 + 1)).f514b.f437I;
                                    i70 = 0;
                                } else {
                                    i70 = gVar.f561x0;
                                    cVar11 = cVar3;
                                }
                                c cVar16 = fVar6.f514b.f439K;
                                fVar6.f(i60, cVar9, cVar10, cVar11, cVar12, i68, i69, i70, i71, i16);
                                iD2 = fVar6.d() + iMax2;
                                int iMax4 = Math.max(i73, fVar6.c());
                                if (i72 > 0) {
                                    iD2 += gVar.f545P0;
                                }
                                i73 = iMax4;
                                iMax2 = iD2;
                                cVar9 = cVar16;
                                i68 = 0;
                            }
                        }
                        iArr2[0] = iMax2;
                        iArr2[1] = i73;
                    }
                }
            } else {
                i24 = i13;
                i25 = i14;
                i26 = i15;
                iArr2 = iArr;
                i27 = size4;
                i28 = i22;
                i29 = gVar.f550V0;
                if (i21 == 0) {
                    if (arrayList.size() == 0) {
                        fVar = new f(gVar, i29, gVar.f437I, gVar.f438J, gVar.f439K, gVar.f440L, i16);
                        arrayList.add(fVar);
                    } else {
                        fVar = (f) arrayList.get(0);
                        fVar.f515c = 0;
                        fVar.f514b = null;
                        fVar.f523l = 0;
                        fVar.f524m = 0;
                        fVar.f525n = 0;
                        fVar.f526o = 0;
                        fVar.f527p = 0;
                        fVar.f(i29, gVar.f437I, gVar.f438J, gVar.f439K, gVar.f440L, gVar.f560w0, gVar.f556s0, gVar.f561x0, gVar.f557t0, i16);
                    }
                    for (i30 = 0; i30 < i21; i30++) {
                        fVar.a(dVarArr2[i30]);
                    }
                    c10 = 0;
                    iArr2[0] = fVar.d();
                    c11 = 1;
                    iArr2[1] = fVar.c();
                }
                i31 = iArr2[c10] + i28 + i24;
                i32 = iArr2[c11] + i25 + i26;
                if (mode != 1073741824) {
                    if (mode == Integer.MIN_VALUE) {
                        size3 = Math.min(i31, size3);
                    } else if (mode == 0) {
                        size3 = i31;
                    } else {
                        size3 = 0;
                    }
                }
                if (mode2 == 1073741824) {
                    iMin = i27;
                } else if (mode2 == Integer.MIN_VALUE) {
                    iMin = Math.min(i32, i27);
                } else if (mode2 == 0) {
                    iMin = i32;
                } else {
                    iMin = 0;
                }
                gVar.f563z0 = size3;
                gVar.f530A0 = iMin;
                gVar.O(size3);
                gVar.L(iMin);
                if (gVar.f571r0 > 0) {
                    z6 = c11;
                } else {
                    z6 = 0;
                }
                gVar.f562y0 = z6;
            }
            c11 = 1;
            i31 = iArr2[c10] + i28 + i24;
            i32 = iArr2[c11] + i25 + i26;
            if (mode != 1073741824) {
                if (mode == Integer.MIN_VALUE) {
                    size3 = Math.min(i31, size3);
                } else if (mode == 0) {
                    size3 = i31;
                } else {
                    size3 = 0;
                }
            }
            if (mode2 == 1073741824) {
                iMin = i27;
            } else if (mode2 == Integer.MIN_VALUE) {
                iMin = Math.min(i32, i27);
            } else if (mode2 == 0) {
                iMin = i32;
            } else {
                iMin = 0;
            }
            gVar.f563z0 = size3;
            gVar.f530A0 = iMin;
            gVar.O(size3);
            gVar.L(iMin);
            if (gVar.f571r0 > 0) {
                z6 = c11;
            } else {
                z6 = 0;
            }
            gVar.f562y0 = z6;
        } else {
            d dVar13 = gVar.f447T;
            E.f fVar8 = dVar13 != null ? ((e) dVar13).f508u0 : null;
            if (fVar8 == null) {
                gVar.f563z0 = 0;
                gVar.f530A0 = 0;
                gVar.f562y0 = false;
            } else {
                for (int i97 = 0; i97 < gVar.f571r0; i97++) {
                    d dVar14 = gVar.f570q0[i97];
                    if (dVar14 != null && !(dVar14 instanceof h)) {
                        int iJ = dVar14.j(0);
                        int iJ2 = dVar14.j(1);
                        if (iJ != 3 || dVar14.f483r == 1 || iJ2 != 3 || dVar14.f484s == 1) {
                            if (iJ == 3) {
                                iJ = 2;
                            }
                            if (iJ2 == 3) {
                                iJ2 = 2;
                            }
                            b bVar = gVar.f531B0;
                            bVar.a = iJ;
                            bVar.f803b = iJ2;
                            bVar.f804c = dVar14.q();
                            bVar.f805d = dVar14.k();
                            fVar8.b(dVar14, bVar);
                            dVar14.O(bVar.f806e);
                            dVar14.L(bVar.f807f);
                            dVar14.I(bVar.f808g);
                        }
                    }
                }
                i12 = gVar.f560w0;
                i13 = gVar.f561x0;
                i14 = gVar.f556s0;
                i15 = gVar.f557t0;
                iArr = new int[2];
                i16 = (size3 - i12) - i13;
                i17 = gVar.f550V0;
                if (i17 == 1) {
                    i16 = (size4 - i14) - i15;
                }
                if (i17 == 0) {
                    if (gVar.f533D0 == -1) {
                        gVar.f533D0 = 0;
                    }
                    if (gVar.f534E0 == -1) {
                        gVar.f534E0 = 0;
                    }
                } else {
                    if (gVar.f533D0 == -1) {
                        gVar.f533D0 = 0;
                    }
                    if (gVar.f534E0 == -1) {
                        gVar.f534E0 = 0;
                    }
                }
                dVarArr = gVar.f570q0;
                i18 = 0;
                i19 = 0;
                c10 = 0;
                while (true) {
                    i20 = gVar.f571r0;
                    if (i18 < i20) {
                        break;
                        break;
                    } else {
                        if (gVar.f570q0[i18].f464g0 == 8) {
                            i19++;
                        }
                        i18++;
                    }
                }
                if (i19 > 0) {
                    dVarArr5 = new d[i20 - i19];
                    i83 = 0;
                    i21 = 0;
                    while (i83 < gVar.f571r0) {
                        dVar12 = gVar.f570q0[i83];
                        int i810 = i12;
                        dVarArr6 = dVarArr5;
                        if (dVar12.f464g0 != 8) {
                            dVarArr6[i21] = dVar12;
                            i21++;
                        }
                        i83++;
                        i12 = i810;
                        dVarArr5 = dVarArr6;
                    }
                    dVarArr2 = dVarArr5;
                } else {
                    i21 = i20;
                    dVarArr2 = dVarArr;
                }
                i22 = i12;
                gVar.f554a1 = dVarArr2;
                gVar.f555b1 = i21;
                i23 = gVar.f549T0;
                arrayList = gVar.f551W0;
                if (i23 != 0) {
                    cVar = gVar.f438J;
                    cVar2 = gVar.f437I;
                    cVar3 = gVar.f439K;
                    cVar4 = gVar.f440L;
                    iArr3 = gVar.f481p0;
                    if (i23 != 1) {
                        i24 = i13;
                        i25 = i14;
                        i26 = i15;
                        iArr2 = iArr;
                        i27 = size4;
                        i28 = i22;
                        i33 = gVar.f550V0;
                        if (i21 != 0) {
                            arrayList.clear();
                            fVar2 = new f(gVar, i33, gVar.f437I, gVar.f438J, gVar.f439K, gVar.f440L, i16);
                            arrayList.add(fVar2);
                            if (i33 == 0) {
                                i45 = 0;
                                i35 = 0;
                                i46 = 0;
                                while (i45 < i21) {
                                    dVar2 = dVarArr2[i45];
                                    iU = gVar.U(dVar2, i16);
                                    if (dVar2.f481p0[0] == 3) {
                                        i35++;
                                    }
                                    int i811 = i35;
                                    if (i46 != i16) {
                                    }
                                    if (!z12) {
                                        z12 = true;
                                    }
                                    if (z12) {
                                        fVar2 = new f(gVar, i33, gVar.f437I, gVar.f438J, gVar.f439K, gVar.f440L, i16);
                                        fVar2.f525n = i45;
                                        arrayList.add(fVar2);
                                    } else {
                                        if (i45 > 0) {
                                            i46 = gVar.f545P0 + iU + i46;
                                        }
                                        fVar2.a(dVar2);
                                        i45++;
                                        i35 = i811;
                                    }
                                    i46 = iU;
                                    fVar2.a(dVar2);
                                    i45++;
                                    i35 = i811;
                                }
                            } else {
                                i34 = 0;
                                i35 = 0;
                                i36 = 0;
                                while (i34 < i21) {
                                    dVar = dVarArr2[i34];
                                    iT = gVar.T(dVar, i16);
                                    if (dVar.f481p0[1] == 3) {
                                        i35++;
                                    }
                                    int i812 = i35;
                                    if (i36 != i16) {
                                    }
                                    if (!z10) {
                                        z10 = true;
                                    }
                                    if (z10) {
                                        fVar2 = new f(gVar, i33, gVar.f437I, gVar.f438J, gVar.f439K, gVar.f440L, i16);
                                        fVar2.f525n = i34;
                                        arrayList.add(fVar2);
                                    } else {
                                        if (i34 > 0) {
                                            i36 = gVar.f546Q0 + iT + i36;
                                        }
                                        fVar2.a(dVar);
                                        i34++;
                                        i35 = i812;
                                    }
                                    i36 = iT;
                                    fVar2.a(dVar);
                                    i34++;
                                    i35 = i812;
                                }
                            }
                            size = arrayList.size();
                            int i813 = gVar.f560w0;
                            int i814 = gVar.f556s0;
                            int i815 = gVar.f561x0;
                            int i98 = gVar.f557t0;
                            if (iArr3[0] != 2) {
                                z11 = true;
                            } else {
                                z11 = true;
                            }
                            if (i35 > 0) {
                                while (i44 < size) {
                                    fVar4 = (f) arrayList.get(i44);
                                    if (i33 == 0) {
                                        fVar4.e(i16 - fVar4.d());
                                    } else {
                                        fVar4.e(i16 - fVar4.c());
                                    }
                                }
                            }
                            i38 = i813;
                            i39 = i814;
                            i40 = i815;
                            i41 = i98;
                            cVar5 = cVar2;
                            cVar6 = cVar;
                            iMax = 0;
                            i43 = 0;
                            cVar7 = cVar3;
                            cVar8 = cVar4;
                            while (i42 < size) {
                                fVar3 = (f) arrayList.get(i42);
                                if (i33 == 0) {
                                    if (i42 < size - 1) {
                                        cVar8 = ((f) arrayList.get(i42 + 1)).f514b.f438J;
                                        i41 = 0;
                                    } else {
                                        i41 = gVar.f557t0;
                                        cVar8 = cVar4;
                                    }
                                    c cVar17 = fVar3.f514b.f440L;
                                    fVar3.f(i33, cVar5, cVar6, cVar7, cVar8, i38, i39, i40, i41, i16);
                                    iMax = Math.max(iMax, fVar3.d());
                                    iC = fVar3.c() + i43;
                                    if (i42 > 0) {
                                        iC += gVar.f546Q0;
                                    }
                                    i43 = iC;
                                    cVar6 = cVar17;
                                    i39 = 0;
                                } else {
                                    if (i42 < size - 1) {
                                        cVar7 = ((f) arrayList.get(i42 + 1)).f514b.f437I;
                                        i40 = 0;
                                    } else {
                                        i40 = gVar.f561x0;
                                        cVar7 = cVar3;
                                    }
                                    c cVar18 = fVar3.f514b.f439K;
                                    fVar3.f(i33, cVar5, cVar6, cVar7, cVar8, i38, i39, i40, i41, i16);
                                    iD = fVar3.d() + iMax;
                                    int iMax5 = Math.max(i43, fVar3.c());
                                    if (i42 > 0) {
                                        iD += gVar.f545P0;
                                    }
                                    i43 = iMax5;
                                    iMax = iD;
                                    cVar5 = cVar18;
                                    i38 = 0;
                                }
                            }
                            iArr2[0] = iMax;
                            iArr2[1] = i43;
                        }
                    } else if (i23 != 2) {
                        i24 = i13;
                        i25 = i14;
                        i26 = i15;
                        iArr2 = iArr;
                        i27 = size4;
                        i28 = i22;
                        i48 = gVar.f550V0;
                        if (i48 == 0) {
                            i57 = gVar.U0;
                            if (i57 <= 0) {
                                i59 = 0;
                                iCeil2 = 0;
                                while (i58 < i21) {
                                    if (i58 > 0) {
                                        i59 += gVar.f545P0;
                                    }
                                    dVar9 = dVarArr2[i58];
                                    if (dVar9 != null) {
                                        iU3 = gVar.U(dVar9, i16) + i59;
                                        if (iU3 > i16) {
                                            break;
                                            break;
                                        } else {
                                            iCeil2++;
                                            i59 = iU3;
                                        }
                                    }
                                }
                            } else {
                                iCeil2 = i57;
                            }
                            iCeil = 0;
                        } else {
                            iCeil = gVar.U0;
                            if (iCeil <= 0) {
                                i50 = 0;
                                i51 = 0;
                                while (i49 < i21) {
                                    if (i49 > 0) {
                                        i50 += gVar.f546Q0;
                                    }
                                    dVar3 = dVarArr2[i49];
                                    if (dVar3 != null) {
                                        iT2 = gVar.T(dVar3, i16) + i50;
                                        if (iT2 > i16) {
                                            break;
                                            break;
                                        } else {
                                            i51++;
                                            i50 = iT2;
                                        }
                                    }
                                }
                                iCeil = i51;
                            }
                            iCeil2 = 0;
                        }
                        if (gVar.f553Z0 == null) {
                            gVar.f553Z0 = new int[2];
                        }
                        if (iCeil != 0) {
                        }
                        while (!z13) {
                            if (i48 == 0) {
                                iCeil = (int) Math.ceil(i21 / iCeil2);
                            } else {
                                iCeil2 = (int) Math.ceil(i21 / iCeil);
                            }
                            dVarArr3 = gVar.Y0;
                            if (dVarArr3 != null) {
                                obj = null;
                                gVar.Y0 = new d[iCeil2];
                            } else {
                                obj = null;
                                gVar.Y0 = new d[iCeil2];
                            }
                            dVarArr4 = gVar.f552X0;
                            if (dVarArr4 != null) {
                                gVar.f552X0 = new d[iCeil];
                            } else {
                                gVar.f552X0 = new d[iCeil];
                            }
                            while (i52 < iCeil2) {
                                while (i55 < iCeil) {
                                    i56 = (i55 * iCeil2) + i52;
                                    if (i48 == 1) {
                                        i56 = (i52 * iCeil) + i55;
                                    }
                                    if (i56 < dVarArr2.length) {
                                        int iU6 = gVar.U(dVar6, i16);
                                        dVar7 = gVar.Y0[i52];
                                        if (dVar7 != null) {
                                            gVar.Y0[i52] = dVar6;
                                        } else {
                                            gVar.Y0[i52] = dVar6;
                                        }
                                        int iT6 = gVar.T(dVar6, i16);
                                        dVar8 = gVar.f552X0[i55];
                                        if (dVar8 != null) {
                                            gVar.f552X0[i55] = dVar6;
                                        } else {
                                            gVar.f552X0[i55] = dVar6;
                                        }
                                    }
                                }
                            }
                            iU2 = 0;
                            while (i53 < iCeil2) {
                                dVar5 = gVar.Y0[i53];
                                if (dVar5 == null) {
                                    if (i53 > 0) {
                                        iU2 += gVar.f545P0;
                                    }
                                    iU2 = gVar.U(dVar5, i16) + iU2;
                                }
                            }
                            iT3 = 0;
                            while (i54 < iCeil) {
                                dVar4 = gVar.f552X0[i54];
                                if (dVar4 == null) {
                                    if (i54 > 0) {
                                        iT3 += gVar.f546Q0;
                                    }
                                    iT3 = gVar.T(dVar4, i16) + iT3;
                                }
                            }
                            iArr2[0] = iU2;
                            iArr2[1] = iT3;
                            if (i48 == 0) {
                                if (iU2 > i16) {
                                }
                                z13 = true;
                            } else {
                                if (iT3 > i16) {
                                }
                                z13 = true;
                            }
                        }
                        int[] iArr5 = gVar.f553Z0;
                        iArr5[0] = iCeil2;
                        iArr5[1] = iCeil;
                    } else if (i23 != 3) {
                        i24 = i13;
                        i25 = i14;
                        i26 = i15;
                        iArr2 = iArr;
                        i27 = size4;
                        i28 = i22;
                    } else {
                        i60 = gVar.f550V0;
                        if (i21 == 0) {
                            i24 = i13;
                            i25 = i14;
                            i26 = i15;
                            iArr2 = iArr;
                            i27 = size4;
                            i28 = i22;
                        } else {
                            arrayList.clear();
                            i28 = i22;
                            i24 = i13;
                            i25 = i14;
                            i26 = i15;
                            iArr2 = iArr;
                            fVar5 = new f(gVar, i60, gVar.f437I, gVar.f438J, gVar.f439K, gVar.f440L, i16);
                            arrayList.add(fVar5);
                            if (i60 == 0) {
                                i75 = 0;
                                i76 = 0;
                                i65 = 0;
                                i77 = 0;
                                while (i75 < i21) {
                                    i76++;
                                    dVar11 = dVarArr2[i75];
                                    iU4 = gVar.U(dVar11, i16);
                                    i78 = i60;
                                    i79 = i75;
                                    if (dVar11.f481p0[0] == 3) {
                                        i65++;
                                    }
                                    int i99 = i65;
                                    if (i77 != i16) {
                                    }
                                    if (!z16) {
                                        z16 = true;
                                    }
                                    if (z16) {
                                        i60 = i78;
                                        i80 = size4;
                                        i81 = i79;
                                        fVar5 = new f(gVar, i60, gVar.f437I, gVar.f438J, gVar.f439K, gVar.f440L, i16);
                                        fVar5.f525n = i81;
                                        arrayList.add(fVar5);
                                        i77 = iU4;
                                        i76 = 1;
                                    } else {
                                        i60 = i78;
                                        i80 = size4;
                                        i81 = i79;
                                        if (i81 > 0) {
                                            i77 = gVar.f545P0 + iU4 + i77;
                                        } else {
                                            i77 = iU4;
                                        }
                                    }
                                    fVar5.a(dVar11);
                                    i75 = i81 + 1;
                                    i65 = i99;
                                    size4 = i80;
                                }
                                i27 = size4;
                            } else {
                                i27 = size4;
                                i61 = 0;
                                i62 = 0;
                                i63 = 0;
                                i64 = 0;
                                while (i61 < i21) {
                                    i62++;
                                    dVar10 = dVarArr2[i61];
                                    iT4 = gVar.T(dVar10, i16);
                                    i66 = i60;
                                    if (dVar10.f481p0[1] == 3) {
                                        i63++;
                                    }
                                    int i910 = i63;
                                    if (i64 != i16) {
                                    }
                                    if (!z14) {
                                        z14 = true;
                                    }
                                    if (z14) {
                                        i60 = i66;
                                        fVar5 = new f(gVar, i60, gVar.f437I, gVar.f438J, gVar.f439K, gVar.f440L, i16);
                                        fVar5.f525n = i61;
                                        arrayList.add(fVar5);
                                        i64 = iT4;
                                        i62 = 1;
                                    } else {
                                        i60 = i66;
                                        if (i61 > 0) {
                                            i64 = gVar.f546Q0 + iT4 + i64;
                                        } else {
                                            i64 = iT4;
                                        }
                                    }
                                    fVar5.a(dVar10);
                                    i61++;
                                    i63 = i910;
                                }
                                i65 = i63;
                            }
                            size2 = arrayList.size();
                            int i911 = gVar.f560w0;
                            int i912 = gVar.f556s0;
                            int i913 = gVar.f561x0;
                            int i914 = gVar.f557t0;
                            if (iArr3[0] != 2) {
                                z15 = true;
                            } else {
                                z15 = true;
                            }
                            if (i65 > 0) {
                                while (i74 < size2) {
                                    fVar7 = (f) arrayList.get(i74);
                                    if (i60 == 0) {
                                        fVar7.e(i16 - fVar7.d());
                                    } else {
                                        fVar7.e(i16 - fVar7.c());
                                    }
                                }
                            }
                            i68 = i911;
                            i69 = i912;
                            i70 = i913;
                            i71 = i914;
                            cVar9 = cVar2;
                            cVar10 = cVar;
                            iMax2 = 0;
                            i73 = 0;
                            cVar11 = cVar3;
                            cVar12 = cVar4;
                            while (i72 < size2) {
                                fVar6 = (f) arrayList.get(i72);
                                if (i60 == 0) {
                                    if (i72 < size2 - 1) {
                                        cVar12 = ((f) arrayList.get(i72 + 1)).f514b.f438J;
                                        i71 = 0;
                                    } else {
                                        i71 = gVar.f557t0;
                                        cVar12 = cVar4;
                                    }
                                    c cVar19 = fVar6.f514b.f440L;
                                    fVar6.f(i60, cVar9, cVar10, cVar11, cVar12, i68, i69, i70, i71, i16);
                                    iMax2 = Math.max(iMax2, fVar6.d());
                                    iC2 = fVar6.c() + i73;
                                    if (i72 > 0) {
                                        iC2 += gVar.f546Q0;
                                    }
                                    i73 = iC2;
                                    cVar10 = cVar19;
                                    i69 = 0;
                                } else {
                                    if (i72 < size2 - 1) {
                                        cVar11 = ((f) arrayList.get(i72 + 1)).f514b.f437I;
                                        i70 = 0;
                                    } else {
                                        i70 = gVar.f561x0;
                                        cVar11 = cVar3;
                                    }
                                    c cVar110 = fVar6.f514b.f439K;
                                    fVar6.f(i60, cVar9, cVar10, cVar11, cVar12, i68, i69, i70, i71, i16);
                                    iD2 = fVar6.d() + iMax2;
                                    int iMax6 = Math.max(i73, fVar6.c());
                                    if (i72 > 0) {
                                        iD2 += gVar.f545P0;
                                    }
                                    i73 = iMax6;
                                    iMax2 = iD2;
                                    cVar9 = cVar110;
                                    i68 = 0;
                                }
                            }
                            iArr2[0] = iMax2;
                            iArr2[1] = i73;
                        }
                    }
                } else {
                    i24 = i13;
                    i25 = i14;
                    i26 = i15;
                    iArr2 = iArr;
                    i27 = size4;
                    i28 = i22;
                    i29 = gVar.f550V0;
                    if (i21 == 0) {
                        if (arrayList.size() == 0) {
                            fVar = new f(gVar, i29, gVar.f437I, gVar.f438J, gVar.f439K, gVar.f440L, i16);
                            arrayList.add(fVar);
                        } else {
                            fVar = (f) arrayList.get(0);
                            fVar.f515c = 0;
                            fVar.f514b = null;
                            fVar.f523l = 0;
                            fVar.f524m = 0;
                            fVar.f525n = 0;
                            fVar.f526o = 0;
                            fVar.f527p = 0;
                            fVar.f(i29, gVar.f437I, gVar.f438J, gVar.f439K, gVar.f440L, gVar.f560w0, gVar.f556s0, gVar.f561x0, gVar.f557t0, i16);
                        }
                        while (i30 < i21) {
                            fVar.a(dVarArr2[i30]);
                        }
                        c10 = 0;
                        iArr2[0] = fVar.d();
                        c11 = 1;
                        iArr2[1] = fVar.c();
                    }
                    i31 = iArr2[c10] + i28 + i24;
                    i32 = iArr2[c11] + i25 + i26;
                    if (mode != 1073741824) {
                        if (mode == Integer.MIN_VALUE) {
                            size3 = Math.min(i31, size3);
                        } else if (mode == 0) {
                            size3 = i31;
                        } else {
                            size3 = 0;
                        }
                    }
                    if (mode2 == 1073741824) {
                        iMin = i27;
                    } else if (mode2 == Integer.MIN_VALUE) {
                        iMin = Math.min(i32, i27);
                    } else if (mode2 == 0) {
                        iMin = i32;
                    } else {
                        iMin = 0;
                    }
                    gVar.f563z0 = size3;
                    gVar.f530A0 = iMin;
                    gVar.O(size3);
                    gVar.L(iMin);
                    if (gVar.f571r0 > 0) {
                        z6 = c11;
                    } else {
                        z6 = 0;
                    }
                    gVar.f562y0 = z6;
                }
                c11 = 1;
                i31 = iArr2[c10] + i28 + i24;
                i32 = iArr2[c11] + i25 + i26;
                if (mode != 1073741824) {
                    if (mode == Integer.MIN_VALUE) {
                        size3 = Math.min(i31, size3);
                    } else if (mode == 0) {
                        size3 = i31;
                    } else {
                        size3 = 0;
                    }
                }
                if (mode2 == 1073741824) {
                    iMin = i27;
                } else if (mode2 == Integer.MIN_VALUE) {
                    iMin = Math.min(i32, i27);
                } else if (mode2 == 0) {
                    iMin = i32;
                } else {
                    iMin = 0;
                }
                gVar.f563z0 = size3;
                gVar.f530A0 = iMin;
                gVar.O(size3);
                gVar.L(iMin);
                if (gVar.f571r0 > 0) {
                    z6 = c11;
                } else {
                    z6 = 0;
                }
                gVar.f562y0 = z6;
            }
        }
        setMeasuredDimension(gVar.f563z0, gVar.f530A0);
    }

    @Override // E.c, android.view.View
    public final void onMeasure(int i10, int i11) {
        j(this.f6288B, i10, i11);
    }

    public void setFirstHorizontalBias(float f10) {
        this.f6288B.f541L0 = f10;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i10) {
        this.f6288B.f535F0 = i10;
        requestLayout();
    }

    public void setFirstVerticalBias(float f10) {
        this.f6288B.f542M0 = f10;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i10) {
        this.f6288B.f536G0 = i10;
        requestLayout();
    }

    public void setHorizontalAlign(int i10) {
        this.f6288B.f547R0 = i10;
        requestLayout();
    }

    public void setHorizontalBias(float f10) {
        this.f6288B.f539J0 = f10;
        requestLayout();
    }

    public void setHorizontalGap(int i10) {
        this.f6288B.f545P0 = i10;
        requestLayout();
    }

    public void setHorizontalStyle(int i10) {
        this.f6288B.f533D0 = i10;
        requestLayout();
    }

    public void setLastHorizontalBias(float f10) {
        this.f6288B.f543N0 = f10;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i10) {
        this.f6288B.f537H0 = i10;
        requestLayout();
    }

    public void setLastVerticalBias(float f10) {
        this.f6288B.f544O0 = f10;
        requestLayout();
    }

    public void setLastVerticalStyle(int i10) {
        this.f6288B.f538I0 = i10;
        requestLayout();
    }

    public void setMaxElementsWrap(int i10) {
        this.f6288B.U0 = i10;
        requestLayout();
    }

    public void setOrientation(int i10) {
        this.f6288B.f550V0 = i10;
        requestLayout();
    }

    public void setPadding(int i10) {
        g gVar = this.f6288B;
        gVar.f556s0 = i10;
        gVar.f557t0 = i10;
        gVar.f558u0 = i10;
        gVar.f559v0 = i10;
        requestLayout();
    }

    public void setPaddingBottom(int i10) {
        this.f6288B.f557t0 = i10;
        requestLayout();
    }

    public void setPaddingLeft(int i10) {
        this.f6288B.f560w0 = i10;
        requestLayout();
    }

    public void setPaddingRight(int i10) {
        this.f6288B.f561x0 = i10;
        requestLayout();
    }

    public void setPaddingTop(int i10) {
        this.f6288B.f556s0 = i10;
        requestLayout();
    }

    public void setVerticalAlign(int i10) {
        this.f6288B.f548S0 = i10;
        requestLayout();
    }

    public void setVerticalBias(float f10) {
        this.f6288B.f540K0 = f10;
        requestLayout();
    }

    public void setVerticalGap(int i10) {
        this.f6288B.f546Q0 = i10;
        requestLayout();
    }

    public void setVerticalStyle(int i10) {
        this.f6288B.f534E0 = i10;
        requestLayout();
    }

    public void setWrapMode(int i10) {
        this.f6288B.f549T0 = i10;
        requestLayout();
    }
}
