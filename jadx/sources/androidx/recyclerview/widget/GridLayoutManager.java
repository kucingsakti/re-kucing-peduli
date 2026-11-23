package androidx.recyclerview.widget;

import J0.C0256f;
import J0.C0258h;
import J0.C0259i;
import J0.C0261k;
import J0.C0262l;
import U.U;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f6883F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f6884G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int[] f6885H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public View[] f6886I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final SparseIntArray f6887J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final SparseIntArray f6888K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public B6.b f6889L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final Rect f6890M;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f6883F = false;
        this.f6884G = -1;
        this.f6887J = new SparseIntArray();
        this.f6888K = new SparseIntArray();
        this.f6889L = new C0258h();
        this.f6890M = new Rect();
        v1(w.N(context, attributeSet, i10, i11).f2353b);
    }

    @Override // androidx.recyclerview.widget.w
    public final void A0(Rect rect, int i10, int i11) {
        int iH;
        int iH2;
        if (this.f6885H == null) {
            super.A0(rect, i10, i11);
        }
        int iK = K() + J();
        int I2 = I() + L();
        if (this.f6897q == 1) {
            int iHeight = rect.height() + I2;
            RecyclerView recyclerView = this.f7121b;
            WeakHashMap weakHashMap = U.a;
            iH2 = w.h(i11, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.f6885H;
            iH = w.h(i10, iArr[iArr.length - 1] + iK, this.f7121b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iK;
            RecyclerView recyclerView2 = this.f7121b;
            WeakHashMap weakHashMap2 = U.a;
            iH = w.h(i10, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f6885H;
            iH2 = w.h(i11, iArr2[iArr2.length - 1] + I2, this.f7121b.getMinimumHeight());
        }
        this.f7121b.setMeasuredDimension(iH, iH2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.w
    public final boolean I0() {
        return this.f6892A == null && !this.f6883F;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void K0(J0.D d3, n nVar, C0256f c0256f) {
        int i10;
        int iK = this.f6884G;
        for (int i11 = 0; i11 < this.f6884G && (i10 = nVar.f7105d) >= 0 && i10 < d3.b() && iK > 0; i11++) {
            int i12 = nVar.f7105d;
            c0256f.b(i12, Math.max(0, nVar.f7108g));
            iK -= this.f6889L.k(i12);
            nVar.f7105d += nVar.f7106e;
        }
    }

    @Override // androidx.recyclerview.widget.w
    public final int O(A a, J0.D d3) {
        if (this.f6897q == 0) {
            return this.f6884G;
        }
        if (d3.b() < 1) {
            return 0;
        }
        return r1(d3.b() - 1, d3, a) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View X0(A a, J0.D d3, boolean z6, boolean z10) {
        int i10;
        int iW;
        int iW2 = w();
        int i11 = 1;
        if (z10) {
            iW = w() - 1;
            i10 = -1;
            i11 = -1;
        } else {
            i10 = iW2;
            iW = 0;
        }
        int iB = d3.b();
        P0();
        int iK = this.f6899s.k();
        int iG = this.f6899s.g();
        View view = null;
        View view2 = null;
        while (iW != i10) {
            View viewV = v(iW);
            int iM = w.M(viewV);
            if (iM >= 0 && iM < iB && s1(iM, d3, a) == 0) {
                if (((x) viewV.getLayoutParams()).f7135s.j()) {
                    if (view2 == null) {
                        view2 = viewV;
                    }
                } else {
                    if (this.f6899s.e(viewV) < iG && this.f6899s.b(viewV) >= iK) {
                        return viewV;
                    }
                    if (view == null) {
                        view = viewV;
                    }
                }
            }
            iW += i11;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e0, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View Y(android.view.View r23, int r24, androidx.recyclerview.widget.A r25, J0.D r26) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.Y(android.view.View, int, androidx.recyclerview.widget.A, J0.D):android.view.View");
    }

    @Override // androidx.recyclerview.widget.w
    public final void a0(A a, J0.D d3, V.j jVar) {
        super.a0(a, d3, jVar);
        jVar.i(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.w
    public final void c0(A a, J0.D d3, View view, V.j jVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0259i)) {
            b0(view, jVar);
            return;
        }
        C0259i c0259i = (C0259i) layoutParams;
        int iR1 = r1(c0259i.f7135s.d(), d3, a);
        if (this.f6897q == 0) {
            jVar.j(V.i.a(c0259i.f2310w, c0259i.f2311x, iR1, 1, false, false));
        } else {
            jVar.j(V.i.a(iR1, 1, c0259i.f2310w, c0259i.f2311x, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.w
    public final void d0(int i10, int i11) {
        this.f6889L.l();
        ((SparseIntArray) this.f6889L.f726t).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void d1(A a, J0.D d3, n nVar, C0262l c0262l) {
        int i10;
        int i11;
        int i12;
        int iD;
        int iJ;
        int iL;
        int iD2;
        int iX;
        int iX2;
        boolean z6;
        int i13;
        View viewB;
        int iJ2 = this.f6899s.j();
        boolean z10 = iJ2 != 1073741824;
        int i14 = w() > 0 ? this.f6885H[this.f6884G] : 0;
        if (z10) {
            w1();
        }
        boolean z11 = nVar.f7106e == 1;
        int iS1 = this.f6884G;
        if (!z11) {
            iS1 = s1(nVar.f7105d, d3, a) + t1(nVar.f7105d, d3, a);
        }
        int i15 = 0;
        while (i15 < this.f6884G && (i13 = nVar.f7105d) >= 0 && i13 < d3.b() && iS1 > 0) {
            int i16 = nVar.f7105d;
            int iT1 = t1(i16, d3, a);
            if (iT1 > this.f6884G) {
                StringBuilder sb = new StringBuilder("Item at position ");
                sb.append(i16);
                sb.append(" requires ");
                sb.append(iT1);
                sb.append(" spans but GridLayoutManager has only ");
                throw new IllegalArgumentException(E0.a.j(sb, this.f6884G, " spans."));
            }
            iS1 -= iT1;
            if (iS1 < 0 || (viewB = nVar.b(a)) == null) {
                break;
            }
            this.f6886I[i15] = viewB;
            i15++;
        }
        if (i15 == 0) {
            c0262l.f2324b = true;
            return;
        }
        if (z11) {
            i12 = 1;
            i11 = i15;
            i10 = 0;
        } else {
            i10 = i15 - 1;
            i11 = -1;
            i12 = -1;
        }
        int i17 = 0;
        while (i10 != i11) {
            View view = this.f6886I[i10];
            C0259i c0259i = (C0259i) view.getLayoutParams();
            int iT2 = t1(w.M(view), d3, a);
            c0259i.f2311x = iT2;
            c0259i.f2310w = i17;
            i17 += iT2;
            i10 += i12;
        }
        float f10 = 0.0f;
        int i18 = 0;
        for (int i19 = 0; i19 < i15; i19++) {
            View view2 = this.f6886I[i19];
            if (nVar.f7111k != null) {
                z6 = false;
                if (z11) {
                    b(view2, -1, true);
                } else {
                    b(view2, 0, true);
                }
            } else if (z11) {
                z6 = false;
                b(view2, -1, false);
            } else {
                z6 = false;
                b(view2, 0, false);
            }
            d(this.f6890M, view2);
            u1(view2, iJ2, z6);
            int iC = this.f6899s.c(view2);
            if (iC > i18) {
                i18 = iC;
            }
            float fD = (this.f6899s.d(view2) * 1.0f) / ((C0259i) view2.getLayoutParams()).f2311x;
            if (fD > f10) {
                f10 = fD;
            }
        }
        if (z10) {
            o1(Math.max(Math.round(f10 * this.f6884G), i14));
            i18 = 0;
            for (int i20 = 0; i20 < i15; i20++) {
                View view3 = this.f6886I[i20];
                u1(view3, 1073741824, true);
                int iC2 = this.f6899s.c(view3);
                if (iC2 > i18) {
                    i18 = iC2;
                }
            }
        }
        for (int i21 = 0; i21 < i15; i21++) {
            View view4 = this.f6886I[i21];
            if (this.f6899s.c(view4) != i18) {
                C0259i c0259i2 = (C0259i) view4.getLayoutParams();
                Rect rect = c0259i2.f7136t;
                int i22 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0259i2).topMargin + ((ViewGroup.MarginLayoutParams) c0259i2).bottomMargin;
                int i23 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0259i2).leftMargin + ((ViewGroup.MarginLayoutParams) c0259i2).rightMargin;
                int iQ1 = q1(c0259i2.f2310w, c0259i2.f2311x);
                if (this.f6897q == 1) {
                    iX2 = w.x(false, iQ1, 1073741824, i23, ((ViewGroup.MarginLayoutParams) c0259i2).width);
                    iX = View.MeasureSpec.makeMeasureSpec(i18 - i22, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18 - i23, 1073741824);
                    iX = w.x(false, iQ1, 1073741824, i22, ((ViewGroup.MarginLayoutParams) c0259i2).height);
                    iX2 = iMakeMeasureSpec;
                }
                if (F0(view4, iX2, iX, (x) view4.getLayoutParams())) {
                    view4.measure(iX2, iX);
                }
            }
        }
        c0262l.a = i18;
        if (this.f6897q != 1) {
            if (nVar.f7107f == -1) {
                int i24 = nVar.f7103b;
                iJ = i24 - i18;
                iD = i24;
            } else {
                int i25 = nVar.f7103b;
                iD = i25 + i18;
                iJ = i25;
            }
            iL = 0;
            iD2 = 0;
        } else if (nVar.f7107f == -1) {
            iD2 = nVar.f7103b;
            iL = iD2 - i18;
            iJ = 0;
            iD = 0;
        } else {
            int i26 = nVar.f7103b;
            iL = i26;
            iD = 0;
            iD2 = i26 + i18;
            iJ = 0;
        }
        for (int i27 = 0; i27 < i15; i27++) {
            View view5 = this.f6886I[i27];
            C0259i c0259i3 = (C0259i) view5.getLayoutParams();
            if (this.f6897q != 1) {
                iL = L() + this.f6885H[c0259i3.f2310w];
                iD2 = this.f6899s.d(view5) + iL;
            } else if (c1()) {
                int iJ3 = J() + this.f6885H[this.f6884G - c0259i3.f2310w];
                iD = iJ3;
                iJ = iJ3 - this.f6899s.d(view5);
            } else {
                iJ = J() + this.f6885H[c0259i3.f2310w];
                iD = this.f6899s.d(view5) + iJ;
            }
            w.S(view5, iJ, iL, iD, iD2);
            if (c0259i3.f7135s.j() || c0259i3.f7135s.m()) {
                c0262l.f2325c = true;
            }
            c0262l.f2326d = view5.hasFocusable() | c0262l.f2326d;
        }
        Arrays.fill(this.f6886I, (Object) null);
    }

    @Override // androidx.recyclerview.widget.w
    public final void e0() {
        this.f6889L.l();
        ((SparseIntArray) this.f6889L.f726t).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void e1(A a, J0.D d3, C0261k c0261k, int i10) {
        w1();
        if (d3.b() > 0 && !d3.f2229g) {
            boolean z6 = i10 == 1;
            int iS1 = s1(c0261k.f2320b, d3, a);
            if (z6) {
                while (iS1 > 0) {
                    int i11 = c0261k.f2320b;
                    if (i11 <= 0) {
                        break;
                    }
                    int i12 = i11 - 1;
                    c0261k.f2320b = i12;
                    iS1 = s1(i12, d3, a);
                }
            } else {
                int iB = d3.b() - 1;
                int i13 = c0261k.f2320b;
                while (i13 < iB) {
                    int i14 = i13 + 1;
                    int iS2 = s1(i14, d3, a);
                    if (iS2 <= iS1) {
                        break;
                    }
                    i13 = i14;
                    iS1 = iS2;
                }
                c0261k.f2320b = i13;
            }
        }
        p1();
    }

    @Override // androidx.recyclerview.widget.w
    public final void f0(int i10, int i11) {
        this.f6889L.l();
        ((SparseIntArray) this.f6889L.f726t).clear();
    }

    @Override // androidx.recyclerview.widget.w
    public final boolean g(x xVar) {
        return xVar instanceof C0259i;
    }

    @Override // androidx.recyclerview.widget.w
    public final void g0(int i10, int i11) {
        this.f6889L.l();
        ((SparseIntArray) this.f6889L.f726t).clear();
    }

    @Override // androidx.recyclerview.widget.w
    public final void i0(RecyclerView recyclerView, int i10, int i11) {
        this.f6889L.l();
        ((SparseIntArray) this.f6889L.f726t).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.w
    public void j0(A a, J0.D d3) {
        boolean z6 = d3.f2229g;
        SparseIntArray sparseIntArray = this.f6888K;
        SparseIntArray sparseIntArray2 = this.f6887J;
        if (z6) {
            int iW = w();
            for (int i10 = 0; i10 < iW; i10++) {
                C0259i c0259i = (C0259i) v(i10).getLayoutParams();
                int iD = c0259i.f7135s.d();
                sparseIntArray2.put(iD, c0259i.f2311x);
                sparseIntArray.put(iD, c0259i.f2310w);
            }
        }
        super.j0(a, d3);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.w
    public final void k0(J0.D d3) {
        super.k0(d3);
        this.f6883F = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void k1(boolean z6) {
        if (z6) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.k1(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.w
    public final int l(J0.D d3) {
        return M0(d3);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.w
    public final int m(J0.D d3) {
        return N0(d3);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.w
    public final int o(J0.D d3) {
        return M0(d3);
    }

    public final void o1(int i10) {
        int i11;
        int[] iArr = this.f6885H;
        int i12 = this.f6884G;
        if (iArr == null || iArr.length != i12 + 1 || iArr[iArr.length - 1] != i10) {
            iArr = new int[i12 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i10 / i12;
        int i15 = i10 % i12;
        int i16 = 0;
        for (int i17 = 1; i17 <= i12; i17++) {
            i13 += i15;
            if (i13 <= 0 || i12 - i13 >= i15) {
                i11 = i14;
            } else {
                i11 = i14 + 1;
                i13 -= i12;
            }
            i16 += i11;
            iArr[i17] = i16;
        }
        this.f6885H = iArr;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.w
    public final int p(J0.D d3) {
        return N0(d3);
    }

    public final void p1() {
        View[] viewArr = this.f6886I;
        if (viewArr == null || viewArr.length != this.f6884G) {
            this.f6886I = new View[this.f6884G];
        }
    }

    public final int q1(int i10, int i11) {
        if (this.f6897q != 1 || !c1()) {
            int[] iArr = this.f6885H;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.f6885H;
        int i12 = this.f6884G;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    public final int r1(int i10, J0.D d3, A a) {
        if (!d3.f2229g) {
            return this.f6889L.i(i10, this.f6884G);
        }
        int iB = a.b(i10);
        if (iB != -1) {
            return this.f6889L.i(iB, this.f6884G);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.w
    public final x s() {
        return this.f6897q == 0 ? new C0259i(-2, -1) : new C0259i(-1, -2);
    }

    public final int s1(int i10, J0.D d3, A a) {
        if (!d3.f2229g) {
            return this.f6889L.j(i10, this.f6884G);
        }
        int i11 = this.f6888K.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int iB = a.b(i10);
        if (iB != -1) {
            return this.f6889L.j(iB, this.f6884G);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 0;
    }

    @Override // androidx.recyclerview.widget.w
    public final x t(Context context, AttributeSet attributeSet) {
        C0259i c0259i = new C0259i(context, attributeSet);
        c0259i.f2310w = -1;
        c0259i.f2311x = 0;
        return c0259i;
    }

    public final int t1(int i10, J0.D d3, A a) {
        if (!d3.f2229g) {
            return this.f6889L.k(i10);
        }
        int i11 = this.f6887J.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int iB = a.b(i10);
        if (iB != -1) {
            return this.f6889L.k(iB);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 1;
    }

    @Override // androidx.recyclerview.widget.w
    public final x u(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C0259i c0259i = new C0259i((ViewGroup.MarginLayoutParams) layoutParams);
            c0259i.f2310w = -1;
            c0259i.f2311x = 0;
            return c0259i;
        }
        C0259i c0259i2 = new C0259i(layoutParams);
        c0259i2.f2310w = -1;
        c0259i2.f2311x = 0;
        return c0259i2;
    }

    public final void u1(View view, int i10, boolean z6) {
        int iX;
        int iX2;
        C0259i c0259i = (C0259i) view.getLayoutParams();
        Rect rect = c0259i.f7136t;
        int i11 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0259i).topMargin + ((ViewGroup.MarginLayoutParams) c0259i).bottomMargin;
        int i12 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0259i).leftMargin + ((ViewGroup.MarginLayoutParams) c0259i).rightMargin;
        int iQ1 = q1(c0259i.f2310w, c0259i.f2311x);
        if (this.f6897q == 1) {
            iX2 = w.x(false, iQ1, i10, i12, ((ViewGroup.MarginLayoutParams) c0259i).width);
            iX = w.x(true, this.f6899s.l(), this.f7132n, i11, ((ViewGroup.MarginLayoutParams) c0259i).height);
        } else {
            int iX3 = w.x(false, iQ1, i10, i11, ((ViewGroup.MarginLayoutParams) c0259i).height);
            int iX4 = w.x(true, this.f6899s.l(), this.f7131m, i12, ((ViewGroup.MarginLayoutParams) c0259i).width);
            iX = iX3;
            iX2 = iX4;
        }
        x xVar = (x) view.getLayoutParams();
        if (z6 ? F0(view, iX2, iX, xVar) : D0(view, iX2, iX, xVar)) {
            view.measure(iX2, iX);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.w
    public final int v0(int i10, J0.D d3, A a) {
        w1();
        p1();
        return super.v0(i10, d3, a);
    }

    public final void v1(int i10) {
        if (i10 == this.f6884G) {
            return;
        }
        this.f6883F = true;
        if (i10 < 1) {
            throw new IllegalArgumentException(AbstractC0487g.g(i10, "Span count should be at least 1. Provided "));
        }
        this.f6884G = i10;
        this.f6889L.l();
        u0();
    }

    public final void w1() {
        int I2;
        int iL;
        if (this.f6897q == 1) {
            I2 = this.f7133o - K();
            iL = J();
        } else {
            I2 = this.f7134p - I();
            iL = L();
        }
        o1(I2 - iL);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.w
    public final int x0(int i10, J0.D d3, A a) {
        w1();
        p1();
        return super.x0(i10, d3, a);
    }

    @Override // androidx.recyclerview.widget.w
    public final int y(A a, J0.D d3) {
        if (this.f6897q == 1) {
            return this.f6884G;
        }
        if (d3.b() < 1) {
            return 0;
        }
        return r1(d3.b() - 1, d3, a) + 1;
    }

    public GridLayoutManager(int i10) {
        super(1);
        this.f6883F = false;
        this.f6884G = -1;
        this.f6887J = new SparseIntArray();
        this.f6888K = new SparseIntArray();
        this.f6889L = new C0258h();
        this.f6890M = new Rect();
        v1(i10);
    }

    public GridLayoutManager() {
        super(1);
        this.f6883F = false;
        this.f6884G = -1;
        this.f6887J = new SparseIntArray();
        this.f6888K = new SparseIntArray();
        this.f6889L = new C0258h();
        this.f6890M = new Rect();
        v1(1);
    }
}
