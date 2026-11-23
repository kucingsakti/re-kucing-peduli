package androidx.recyclerview.widget;

import J0.AbstractC0266p;
import J0.C0256f;
import J0.C0261k;
import J0.C0262l;
import J0.C0263m;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends w implements J0.C {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public SavedState f6892A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C0261k f6893B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C0262l f6894C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f6895D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int[] f6896E;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f6897q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public n f6898r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public AbstractC0266p f6899s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f6900t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f6901u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f6902v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f6903w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f6904x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f6905y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f6906z;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new o();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f6907s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f6908t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f6909u;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f6907s);
            parcel.writeInt(this.f6908t);
            parcel.writeInt(this.f6909u ? 1 : 0);
        }
    }

    public LinearLayoutManager(int i10) {
        this.f6897q = 1;
        this.f6901u = false;
        this.f6902v = false;
        this.f6903w = false;
        this.f6904x = true;
        this.f6905y = -1;
        this.f6906z = Integer.MIN_VALUE;
        this.f6892A = null;
        this.f6893B = new C0261k();
        this.f6894C = new C0262l();
        this.f6895D = 2;
        this.f6896E = new int[2];
        j1(i10);
        c(null);
        if (this.f6901u) {
            this.f6901u = false;
            u0();
        }
    }

    @Override // androidx.recyclerview.widget.w
    public final boolean E0() {
        if (this.f7132n != 1073741824 && this.f7131m != 1073741824) {
            int iW = w();
            for (int i10 = 0; i10 < iW; i10++) {
                ViewGroup.LayoutParams layoutParams = v(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.w
    public void G0(RecyclerView recyclerView, int i10) {
        C0263m c0263m = new C0263m(recyclerView.getContext());
        c0263m.a = i10;
        H0(c0263m);
    }

    @Override // androidx.recyclerview.widget.w
    public boolean I0() {
        return this.f6892A == null && this.f6900t == this.f6903w;
    }

    public void J0(J0.D d3, int[] iArr) {
        int i10;
        int iL = d3.a != -1 ? this.f6899s.l() : 0;
        if (this.f6898r.f7107f == -1) {
            i10 = 0;
        } else {
            i10 = iL;
            iL = 0;
        }
        iArr[0] = iL;
        iArr[1] = i10;
    }

    public void K0(J0.D d3, n nVar, C0256f c0256f) {
        int i10 = nVar.f7105d;
        if (i10 < 0 || i10 >= d3.b()) {
            return;
        }
        c0256f.b(i10, Math.max(0, nVar.f7108g));
    }

    public final int L0(J0.D d3) {
        if (w() == 0) {
            return 0;
        }
        P0();
        AbstractC0266p abstractC0266p = this.f6899s;
        boolean z6 = !this.f6904x;
        return p068ga.d.f(d3, abstractC0266p, S0(z6), R0(z6), this, this.f6904x);
    }

    public final int M0(J0.D d3) {
        if (w() == 0) {
            return 0;
        }
        P0();
        AbstractC0266p abstractC0266p = this.f6899s;
        boolean z6 = !this.f6904x;
        return p068ga.d.g(d3, abstractC0266p, S0(z6), R0(z6), this, this.f6904x, this.f6902v);
    }

    public final int N0(J0.D d3) {
        if (w() == 0) {
            return 0;
        }
        P0();
        AbstractC0266p abstractC0266p = this.f6899s;
        boolean z6 = !this.f6904x;
        return p068ga.d.h(d3, abstractC0266p, S0(z6), R0(z6), this, this.f6904x);
    }

    public final int O0(int i10) {
        if (i10 == 1) {
            return (this.f6897q != 1 && c1()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.f6897q != 1 && c1()) ? -1 : 1;
        }
        if (i10 == 17) {
            return this.f6897q == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 == 33) {
            return this.f6897q == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 != 66) {
            return (i10 == 130 && this.f6897q == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.f6897q == 0 ? 1 : Integer.MIN_VALUE;
    }

    public final void P0() {
        if (this.f6898r == null) {
            n nVar = new n();
            nVar.a = true;
            nVar.f7109h = 0;
            nVar.f7110i = 0;
            nVar.f7111k = null;
            this.f6898r = nVar;
        }
    }

    @Override // androidx.recyclerview.widget.w
    public final boolean Q() {
        return true;
    }

    public final int Q0(A a, n nVar, J0.D d3, boolean z6) {
        int i10;
        int i11 = nVar.f7104c;
        int i12 = nVar.f7108g;
        if (i12 != Integer.MIN_VALUE) {
            if (i11 < 0) {
                nVar.f7108g = i12 + i11;
            }
            f1(a, nVar);
        }
        int i13 = nVar.f7104c + nVar.f7109h;
        while (true) {
            if ((!nVar.f7112l && i13 <= 0) || (i10 = nVar.f7105d) < 0 || i10 >= d3.b()) {
                break;
            }
            C0262l c0262l = this.f6894C;
            c0262l.a = 0;
            c0262l.f2324b = false;
            c0262l.f2325c = false;
            c0262l.f2326d = false;
            d1(a, d3, nVar, c0262l);
            if (!c0262l.f2324b) {
                int i14 = nVar.f7103b;
                int i15 = c0262l.a;
                nVar.f7103b = (nVar.f7107f * i15) + i14;
                if (!c0262l.f2325c || nVar.f7111k != null || !d3.f2229g) {
                    nVar.f7104c -= i15;
                    i13 -= i15;
                }
                int i16 = nVar.f7108g;
                if (i16 != Integer.MIN_VALUE) {
                    int i17 = i16 + i15;
                    nVar.f7108g = i17;
                    int i18 = nVar.f7104c;
                    if (i18 < 0) {
                        nVar.f7108g = i17 + i18;
                    }
                    f1(a, nVar);
                }
                if (z6 && c0262l.f2326d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i11 - nVar.f7104c;
    }

    public final View R0(boolean z6) {
        return this.f6902v ? W0(0, w(), z6) : W0(w() - 1, -1, z6);
    }

    public final View S0(boolean z6) {
        return this.f6902v ? W0(w() - 1, -1, z6) : W0(0, w(), z6);
    }

    public final int T0() {
        View viewW0 = W0(0, w(), false);
        if (viewW0 == null) {
            return -1;
        }
        return w.M(viewW0);
    }

    public final int U0() {
        View viewW0 = W0(w() - 1, -1, false);
        if (viewW0 == null) {
            return -1;
        }
        return w.M(viewW0);
    }

    public final View V0(int i10, int i11) {
        int i12;
        int i13;
        P0();
        if (i11 <= i10 && i11 >= i10) {
            return v(i10);
        }
        if (this.f6899s.e(v(i10)) < this.f6899s.k()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = 4097;
        }
        return this.f6897q == 0 ? this.f7122c.o(i10, i11, i12, i13) : this.f7123d.o(i10, i11, i12, i13);
    }

    public final View W0(int i10, int i11, boolean z6) {
        P0();
        int i12 = z6 ? 24579 : 320;
        return this.f6897q == 0 ? this.f7122c.o(i10, i11, i12, 320) : this.f7123d.o(i10, i11, i12, 320);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    public View X0(A a, J0.D d3, boolean z6, boolean z10) {
        int i10;
        int iW;
        int i11;
        P0();
        int iW2 = w();
        if (z10) {
            iW = w() - 1;
            i10 = -1;
            i11 = -1;
        } else {
            i10 = iW2;
            iW = 0;
            i11 = 1;
        }
        int iB = d3.b();
        int iK = this.f6899s.k();
        int iG = this.f6899s.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iW != i10) {
            View viewV = v(iW);
            int iM = w.M(viewV);
            int iE = this.f6899s.e(viewV);
            int iB2 = this.f6899s.b(viewV);
            if (iM >= 0 && iM < iB) {
                if (!((x) viewV.getLayoutParams()).f7135s.j()) {
                    boolean z11 = iB2 <= iK && iE < iK;
                    boolean z12 = iE >= iG && iB2 > iG;
                    if (!z11 && !z12) {
                        return viewV;
                    }
                    if (z6) {
                        if (z12) {
                            view2 = viewV;
                        } else if (view == null) {
                            view = viewV;
                        }
                    } else if (z11) {
                        view2 = viewV;
                    } else if (view == null) {
                        view = viewV;
                    }
                } else if (view3 == null) {
                    view3 = viewV;
                }
            }
            iW += i11;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.w
    public View Y(View view, int i10, A a, J0.D d3) {
        int iO0;
        View viewV0;
        h1();
        if (w() != 0 && (iO0 = O0(i10)) != Integer.MIN_VALUE) {
            P0();
            l1(iO0, (int) (this.f6899s.l() * 0.33333334f), false, d3);
            n nVar = this.f6898r;
            nVar.f7108g = Integer.MIN_VALUE;
            nVar.a = false;
            Q0(a, nVar, d3, true);
            if (iO0 == -1) {
                viewV0 = this.f6902v ? V0(w() - 1, -1) : V0(0, w());
            } else {
                viewV0 = this.f6902v ? V0(0, w()) : V0(w() - 1, -1);
            }
            View viewB1 = iO0 == -1 ? b1() : a1();
            if (!viewB1.hasFocusable()) {
                return viewV0;
            }
            if (viewV0 != null) {
                return viewB1;
            }
        }
        return null;
    }

    public final int Y0(int i10, A a, J0.D d3, boolean z6) {
        int iG;
        int iG2 = this.f6899s.g() - i10;
        if (iG2 <= 0) {
            return 0;
        }
        int i11 = -i1(-iG2, d3, a);
        int i12 = i10 + i11;
        if (!z6 || (iG = this.f6899s.g() - i12) <= 0) {
            return i11;
        }
        this.f6899s.p(iG);
        return iG + i11;
    }

    @Override // androidx.recyclerview.widget.w
    public final void Z(AccessibilityEvent accessibilityEvent) {
        super.Z(accessibilityEvent);
        if (w() > 0) {
            accessibilityEvent.setFromIndex(T0());
            accessibilityEvent.setToIndex(U0());
        }
    }

    public final int Z0(int i10, A a, J0.D d3, boolean z6) {
        int iK;
        int iK2 = i10 - this.f6899s.k();
        if (iK2 <= 0) {
            return 0;
        }
        int i11 = -i1(iK2, d3, a);
        int i12 = i10 + i11;
        if (!z6 || (iK = i12 - this.f6899s.k()) <= 0) {
            return i11;
        }
        this.f6899s.p(-iK);
        return i11 - iK;
    }

    @Override // J0.C
    public final PointF a(int i10) {
        if (w() == 0) {
            return null;
        }
        int i11 = (i10 < w.M(v(0))) != this.f6902v ? -1 : 1;
        return this.f6897q == 0 ? new PointF(i11, 0.0f) : new PointF(0.0f, i11);
    }

    public final View a1() {
        return v(this.f6902v ? 0 : w() - 1);
    }

    public final View b1() {
        return v(this.f6902v ? w() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.w
    public final void c(String str) {
        if (this.f6892A == null) {
            super.c(str);
        }
    }

    public final boolean c1() {
        return H() == 1;
    }

    public void d1(A a, J0.D d3, n nVar, C0262l c0262l) {
        int iJ;
        int i10;
        int i11;
        int iD;
        View viewB = nVar.b(a);
        if (viewB == null) {
            c0262l.f2324b = true;
            return;
        }
        x xVar = (x) viewB.getLayoutParams();
        if (nVar.f7111k == null) {
            if (this.f6902v == (nVar.f7107f == -1)) {
                b(viewB, -1, false);
            } else {
                b(viewB, 0, false);
            }
        } else {
            if (this.f6902v == (nVar.f7107f == -1)) {
                b(viewB, -1, true);
            } else {
                b(viewB, 0, true);
            }
        }
        x xVar2 = (x) viewB.getLayoutParams();
        Rect rectN = this.f7121b.N(viewB);
        int i12 = rectN.left + rectN.right;
        int i13 = rectN.top + rectN.bottom;
        int iX = w.x(e(), this.f7133o, this.f7131m, K() + J() + ((ViewGroup.MarginLayoutParams) xVar2).leftMargin + ((ViewGroup.MarginLayoutParams) xVar2).rightMargin + i12, ((ViewGroup.MarginLayoutParams) xVar2).width);
        int iX2 = w.x(f(), this.f7134p, this.f7132n, I() + L() + ((ViewGroup.MarginLayoutParams) xVar2).topMargin + ((ViewGroup.MarginLayoutParams) xVar2).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) xVar2).height);
        if (D0(viewB, iX, iX2, xVar2)) {
            viewB.measure(iX, iX2);
        }
        c0262l.a = this.f6899s.c(viewB);
        if (this.f6897q == 1) {
            if (c1()) {
                iD = this.f7133o - K();
                iJ = iD - this.f6899s.d(viewB);
            } else {
                iJ = J();
                iD = this.f6899s.d(viewB) + iJ;
            }
            if (nVar.f7107f == -1) {
                i10 = nVar.f7103b;
                i11 = i10 - c0262l.a;
            } else {
                i11 = nVar.f7103b;
                i10 = c0262l.a + i11;
            }
        } else {
            int iL = L();
            int iD2 = this.f6899s.d(viewB) + iL;
            if (nVar.f7107f == -1) {
                int i14 = nVar.f7103b;
                int i15 = i14 - c0262l.a;
                iD = i14;
                i10 = iD2;
                iJ = i15;
                i11 = iL;
            } else {
                int i16 = nVar.f7103b;
                int i17 = c0262l.a + i16;
                iJ = i16;
                i10 = iD2;
                i11 = iL;
                iD = i17;
            }
        }
        w.S(viewB, iJ, i11, iD, i10);
        if (xVar.f7135s.j() || xVar.f7135s.m()) {
            c0262l.f2325c = true;
        }
        c0262l.f2326d = viewB.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.w
    public final boolean e() {
        return this.f6897q == 0;
    }

    @Override // androidx.recyclerview.widget.w
    public final boolean f() {
        return this.f6897q == 1;
    }

    public final void f1(A a, n nVar) {
        if (!nVar.a || nVar.f7112l) {
            return;
        }
        int i10 = nVar.f7108g;
        int i11 = nVar.f7110i;
        if (nVar.f7107f == -1) {
            int iW = w();
            if (i10 < 0) {
                return;
            }
            int iF = (this.f6899s.f() - i10) + i11;
            if (this.f6902v) {
                for (int i12 = 0; i12 < iW; i12++) {
                    View viewV = v(i12);
                    if (this.f6899s.e(viewV) < iF || this.f6899s.o(viewV) < iF) {
                        g1(a, 0, i12);
                        return;
                    }
                }
                return;
            }
            int i13 = iW - 1;
            for (int i14 = i13; i14 >= 0; i14--) {
                View viewV2 = v(i14);
                if (this.f6899s.e(viewV2) < iF || this.f6899s.o(viewV2) < iF) {
                    g1(a, i13, i14);
                    return;
                }
            }
            return;
        }
        if (i10 < 0) {
            return;
        }
        int i15 = i10 - i11;
        int iW2 = w();
        if (!this.f6902v) {
            for (int i16 = 0; i16 < iW2; i16++) {
                View viewV3 = v(i16);
                if (this.f6899s.b(viewV3) > i15 || this.f6899s.n(viewV3) > i15) {
                    g1(a, 0, i16);
                    return;
                }
            }
            return;
        }
        int i17 = iW2 - 1;
        for (int i18 = i17; i18 >= 0; i18--) {
            View viewV4 = v(i18);
            if (this.f6899s.b(viewV4) > i15 || this.f6899s.n(viewV4) > i15) {
                g1(a, i17, i18);
                return;
            }
        }
    }

    public final void g1(A a, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                View viewV = v(i10);
                if (v(i10) != null) {
                    this.a.j(i10);
                }
                a.h(viewV);
                i10--;
            }
            return;
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            View viewV2 = v(i12);
            if (v(i12) != null) {
                this.a.j(i12);
            }
            a.h(viewV2);
        }
    }

    public final void h1() {
        if (this.f6897q == 1 || !c1()) {
            this.f6902v = this.f6901u;
        } else {
            this.f6902v = !this.f6901u;
        }
    }

    @Override // androidx.recyclerview.widget.w
    public final void i(int i10, int i11, J0.D d3, C0256f c0256f) {
        if (this.f6897q != 0) {
            i10 = i11;
        }
        if (w() == 0 || i10 == 0) {
            return;
        }
        P0();
        l1(i10 > 0 ? 1 : -1, Math.abs(i10), true, d3);
        K0(d3, this.f6898r, c0256f);
    }

    public final int i1(int i10, J0.D d3, A a) {
        if (w() != 0 && i10 != 0) {
            P0();
            this.f6898r.a = true;
            int i11 = i10 > 0 ? 1 : -1;
            int iAbs = Math.abs(i10);
            l1(i11, iAbs, true, d3);
            n nVar = this.f6898r;
            int iQ0 = Q0(a, nVar, d3, false) + nVar.f7108g;
            if (iQ0 >= 0) {
                if (iAbs > iQ0) {
                    i10 = i11 * iQ0;
                }
                this.f6899s.p(-i10);
                this.f6898r.j = i10;
                return i10;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.w
    public final void j(int i10, C0256f c0256f) {
        boolean z6;
        int i11;
        SavedState savedState = this.f6892A;
        if (savedState == null || (i11 = savedState.f6907s) < 0) {
            h1();
            z6 = this.f6902v;
            i11 = this.f6905y;
            if (i11 == -1) {
                i11 = z6 ? i10 - 1 : 0;
            }
        } else {
            z6 = savedState.f6909u;
        }
        int i12 = z6 ? -1 : 1;
        for (int i13 = 0; i13 < this.f6895D && i11 >= 0 && i11 < i10; i13++) {
            c0256f.b(i11, 0);
            i11 += i12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:107:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:110:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:114:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:118:0x0206 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:120:0x020a  */
    /* JADX WARN: Code duplicated, block: B:122:0x020d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x0211  */
    /* JADX WARN: Code duplicated, block: B:126:0x0214 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x0216  */
    /* JADX WARN: Code duplicated, block: B:129:0x021a  */
    /* JADX WARN: Code duplicated, block: B:131:0x021e  */
    /* JADX WARN: Code duplicated, block: B:133:0x0225  */
    /* JADX WARN: Code duplicated, block: B:134:0x022b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0189  */
    /* JADX WARN: Code duplicated, block: B:98:0x019e  */
    @Override // androidx.recyclerview.widget.w
    public void j0(A a, J0.D d3) {
        View focusedChild;
        int iB;
        RecyclerView recyclerView;
        View focusedChild2;
        boolean z6;
        boolean z10;
        View viewX0;
        int iE;
        int iB2;
        int iK;
        int iG;
        boolean z11;
        boolean z12;
        x xVar;
        int i10;
        int i11;
        int i12;
        List list;
        int i13;
        int i14;
        int iY0;
        int i15;
        View viewR;
        int iE2;
        int iG2;
        int i16;
        int i17 = -1;
        if (!(this.f6892A == null && this.f6905y == -1) && d3.b() == 0) {
            q0(a);
            return;
        }
        SavedState savedState = this.f6892A;
        if (savedState != null && (i16 = savedState.f6907s) >= 0) {
            this.f6905y = i16;
        }
        P0();
        this.f6898r.a = false;
        h1();
        RecyclerView recyclerView2 = this.f7121b;
        if (recyclerView2 == null || (focusedChild = recyclerView2.getFocusedChild()) == null || this.a.f7053c.contains(focusedChild)) {
            focusedChild = null;
        }
        C0261k c0261k = this.f6893B;
        if (!c0261k.f2323e || this.f6905y != -1 || this.f6892A != null) {
            c0261k.d();
            c0261k.f2322d = this.f6902v ^ this.f6903w;
            if (d3.f2229g || (i10 = this.f6905y) == -1) {
                if (w() != 0) {
                    recyclerView = this.f7121b;
                    if (recyclerView != null || (focusedChild2 = recyclerView.getFocusedChild()) == null || this.a.f7053c.contains(focusedChild2)) {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        xVar = (x) focusedChild2.getLayoutParams();
                        if (!xVar.f7135s.j() || xVar.f7135s.d() < 0 || xVar.f7135s.d() >= d3.b()) {
                            z6 = this.f6900t;
                            z10 = this.f6903w;
                            if (z6 == z10 || (viewX0 = X0(a, d3, c0261k.f2322d, z10)) == null) {
                                c0261k.a();
                                if (this.f6903w) {
                                    iB = d3.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                c0261k.f2320b = iB;
                            } else {
                                c0261k.b(viewX0, w.M(viewX0));
                                if (!d3.f2229g && I0()) {
                                    iE = this.f6899s.e(viewX0);
                                    iB2 = this.f6899s.b(viewX0);
                                    iK = this.f6899s.k();
                                    iG = this.f6899s.g();
                                    if (iB2 <= iK || iE >= iK) {
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                    }
                                    if (iE >= iG || iB2 <= iG) {
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                    }
                                    if (z11 || z12) {
                                        if (c0261k.f2322d) {
                                            iK = iG;
                                        }
                                        c0261k.f2321c = iK;
                                    }
                                }
                            }
                        } else {
                            c0261k.c(focusedChild2, w.M(focusedChild2));
                        }
                    } else {
                        z6 = this.f6900t;
                        z10 = this.f6903w;
                        if (z6 == z10) {
                            c0261k.a();
                            if (this.f6903w) {
                                iB = d3.b() - 1;
                            } else {
                                iB = 0;
                            }
                            c0261k.f2320b = iB;
                        } else {
                            c0261k.b(viewX0, w.M(viewX0));
                            if (!d3.f2229g) {
                                iE = this.f6899s.e(viewX0);
                                iB2 = this.f6899s.b(viewX0);
                                iK = this.f6899s.k();
                                iG = this.f6899s.g();
                                if (iB2 <= iK) {
                                    z11 = false;
                                } else {
                                    z11 = false;
                                }
                                if (iE >= iG) {
                                    z12 = false;
                                } else {
                                    z12 = false;
                                }
                                if (z11) {
                                    if (c0261k.f2322d) {
                                        iK = iG;
                                    }
                                    c0261k.f2321c = iK;
                                } else {
                                    if (c0261k.f2322d) {
                                        iK = iG;
                                    }
                                    c0261k.f2321c = iK;
                                }
                            }
                        }
                    }
                } else {
                    c0261k.a();
                    if (this.f6903w) {
                        iB = d3.b() - 1;
                    } else {
                        iB = 0;
                    }
                    c0261k.f2320b = iB;
                }
            } else if (i10 < 0 || i10 >= d3.b()) {
                this.f6905y = -1;
                this.f6906z = Integer.MIN_VALUE;
                if (w() != 0) {
                    recyclerView = this.f7121b;
                    if (recyclerView != null) {
                        focusedChild2 = null;
                    } else {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        xVar = (x) focusedChild2.getLayoutParams();
                        if (xVar.f7135s.j()) {
                            z6 = this.f6900t;
                            z10 = this.f6903w;
                            if (z6 == z10) {
                                c0261k.a();
                                if (this.f6903w) {
                                    iB = d3.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                c0261k.f2320b = iB;
                            } else {
                                c0261k.b(viewX0, w.M(viewX0));
                                if (!d3.f2229g) {
                                    iE = this.f6899s.e(viewX0);
                                    iB2 = this.f6899s.b(viewX0);
                                    iK = this.f6899s.k();
                                    iG = this.f6899s.g();
                                    if (iB2 <= iK) {
                                        z11 = false;
                                    } else {
                                        z11 = false;
                                    }
                                    if (iE >= iG) {
                                        z12 = false;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z11) {
                                        if (c0261k.f2322d) {
                                            iK = iG;
                                        }
                                        c0261k.f2321c = iK;
                                    } else {
                                        if (c0261k.f2322d) {
                                            iK = iG;
                                        }
                                        c0261k.f2321c = iK;
                                    }
                                }
                            }
                        } else {
                            z6 = this.f6900t;
                            z10 = this.f6903w;
                            if (z6 == z10) {
                                c0261k.a();
                                if (this.f6903w) {
                                    iB = d3.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                c0261k.f2320b = iB;
                            } else {
                                c0261k.b(viewX0, w.M(viewX0));
                                if (!d3.f2229g) {
                                    iE = this.f6899s.e(viewX0);
                                    iB2 = this.f6899s.b(viewX0);
                                    iK = this.f6899s.k();
                                    iG = this.f6899s.g();
                                    if (iB2 <= iK) {
                                        z11 = false;
                                    } else {
                                        z11 = false;
                                    }
                                    if (iE >= iG) {
                                        z12 = false;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z11) {
                                        if (c0261k.f2322d) {
                                            iK = iG;
                                        }
                                        c0261k.f2321c = iK;
                                    } else {
                                        if (c0261k.f2322d) {
                                            iK = iG;
                                        }
                                        c0261k.f2321c = iK;
                                    }
                                }
                            }
                        }
                    } else {
                        z6 = this.f6900t;
                        z10 = this.f6903w;
                        if (z6 == z10) {
                            c0261k.a();
                            if (this.f6903w) {
                                iB = d3.b() - 1;
                            } else {
                                iB = 0;
                            }
                            c0261k.f2320b = iB;
                        } else {
                            c0261k.b(viewX0, w.M(viewX0));
                            if (!d3.f2229g) {
                                iE = this.f6899s.e(viewX0);
                                iB2 = this.f6899s.b(viewX0);
                                iK = this.f6899s.k();
                                iG = this.f6899s.g();
                                if (iB2 <= iK) {
                                    z11 = false;
                                } else {
                                    z11 = false;
                                }
                                if (iE >= iG) {
                                    z12 = false;
                                } else {
                                    z12 = false;
                                }
                                if (z11) {
                                    if (c0261k.f2322d) {
                                        iK = iG;
                                    }
                                    c0261k.f2321c = iK;
                                } else {
                                    if (c0261k.f2322d) {
                                        iK = iG;
                                    }
                                    c0261k.f2321c = iK;
                                }
                            }
                        }
                    }
                } else {
                    c0261k.a();
                    if (this.f6903w) {
                        iB = d3.b() - 1;
                    } else {
                        iB = 0;
                    }
                    c0261k.f2320b = iB;
                }
            } else {
                int i18 = this.f6905y;
                c0261k.f2320b = i18;
                SavedState savedState2 = this.f6892A;
                if (savedState2 != null && savedState2.f6907s >= 0) {
                    boolean z13 = savedState2.f6909u;
                    c0261k.f2322d = z13;
                    if (z13) {
                        c0261k.f2321c = this.f6899s.g() - this.f6892A.f6908t;
                    } else {
                        c0261k.f2321c = this.f6899s.k() + this.f6892A.f6908t;
                    }
                } else if (this.f6906z == Integer.MIN_VALUE) {
                    View viewR2 = r(i18);
                    if (viewR2 == null) {
                        if (w() > 0) {
                            c0261k.f2322d = (this.f6905y < w.M(v(0))) == this.f6902v;
                        }
                        c0261k.a();
                    } else if (this.f6899s.c(viewR2) > this.f6899s.l()) {
                        c0261k.a();
                    } else if (this.f6899s.e(viewR2) - this.f6899s.k() < 0) {
                        c0261k.f2321c = this.f6899s.k();
                        c0261k.f2322d = false;
                    } else if (this.f6899s.g() - this.f6899s.b(viewR2) < 0) {
                        c0261k.f2321c = this.f6899s.g();
                        c0261k.f2322d = true;
                    } else {
                        c0261k.f2321c = c0261k.f2322d ? this.f6899s.m() + this.f6899s.b(viewR2) : this.f6899s.e(viewR2);
                    }
                } else {
                    boolean z14 = this.f6902v;
                    c0261k.f2322d = z14;
                    if (z14) {
                        c0261k.f2321c = this.f6899s.g() - this.f6906z;
                    } else {
                        c0261k.f2321c = this.f6899s.k() + this.f6906z;
                    }
                }
            }
            c0261k.f2323e = true;
        } else if (focusedChild != null && (this.f6899s.e(focusedChild) >= this.f6899s.g() || this.f6899s.b(focusedChild) <= this.f6899s.k())) {
            c0261k.c(focusedChild, w.M(focusedChild));
        }
        n nVar = this.f6898r;
        nVar.f7107f = nVar.j >= 0 ? 1 : -1;
        int[] iArr = this.f6896E;
        iArr[0] = 0;
        iArr[1] = 0;
        J0(d3, iArr);
        int iK2 = this.f6899s.k() + Math.max(0, iArr[0]);
        int iH = this.f6899s.h() + Math.max(0, iArr[1]);
        if (d3.f2229g && (i15 = this.f6905y) != -1 && this.f6906z != Integer.MIN_VALUE && (viewR = r(i15)) != null) {
            if (this.f6902v) {
                iG2 = this.f6899s.g() - this.f6899s.b(viewR);
                iE2 = this.f6906z;
            } else {
                iE2 = this.f6899s.e(viewR) - this.f6899s.k();
                iG2 = this.f6906z;
            }
            int i19 = iG2 - iE2;
            if (i19 > 0) {
                iK2 += i19;
            } else {
                iH -= i19;
            }
        }
        if (!c0261k.f2322d ? !this.f6902v : this.f6902v) {
            i17 = 1;
        }
        e1(a, d3, c0261k, i17);
        q(a);
        this.f6898r.f7112l = this.f6899s.i() == 0 && this.f6899s.f() == 0;
        this.f6898r.getClass();
        this.f6898r.f7110i = 0;
        if (c0261k.f2322d) {
            n1(c0261k.f2320b, c0261k.f2321c);
            n nVar2 = this.f6898r;
            nVar2.f7109h = iK2;
            Q0(a, nVar2, d3, false);
            n nVar3 = this.f6898r;
            i12 = nVar3.f7103b;
            int i20 = nVar3.f7105d;
            int i21 = nVar3.f7104c;
            if (i21 > 0) {
                iH += i21;
            }
            m1(c0261k.f2320b, c0261k.f2321c);
            n nVar4 = this.f6898r;
            nVar4.f7109h = iH;
            nVar4.f7105d += nVar4.f7106e;
            Q0(a, nVar4, d3, false);
            n nVar5 = this.f6898r;
            i11 = nVar5.f7103b;
            int i22 = nVar5.f7104c;
            if (i22 > 0) {
                n1(i20, i12);
                n nVar6 = this.f6898r;
                nVar6.f7109h = i22;
                Q0(a, nVar6, d3, false);
                i12 = this.f6898r.f7103b;
            }
        } else {
            m1(c0261k.f2320b, c0261k.f2321c);
            n nVar7 = this.f6898r;
            nVar7.f7109h = iH;
            Q0(a, nVar7, d3, false);
            n nVar8 = this.f6898r;
            i11 = nVar8.f7103b;
            int i23 = nVar8.f7105d;
            int i24 = nVar8.f7104c;
            if (i24 > 0) {
                iK2 += i24;
            }
            n1(c0261k.f2320b, c0261k.f2321c);
            n nVar9 = this.f6898r;
            nVar9.f7109h = iK2;
            nVar9.f7105d += nVar9.f7106e;
            Q0(a, nVar9, d3, false);
            n nVar10 = this.f6898r;
            int i25 = nVar10.f7103b;
            int i26 = nVar10.f7104c;
            if (i26 > 0) {
                m1(i23, i11);
                n nVar11 = this.f6898r;
                nVar11.f7109h = i26;
                Q0(a, nVar11, d3, false);
                i11 = this.f6898r.f7103b;
            }
            i12 = i25;
        }
        if (w() > 0) {
            if (this.f6902v ^ this.f6903w) {
                int iY1 = Y0(i11, a, d3, true);
                i13 = i12 + iY1;
                i14 = i11 + iY1;
                iY0 = Z0(i13, a, d3, false);
            } else {
                int iZ0 = Z0(i12, a, d3, true);
                i13 = i12 + iZ0;
                i14 = i11 + iZ0;
                iY0 = Y0(i14, a, d3, false);
            }
            i12 = i13 + iY0;
            i11 = i14 + iY0;
        }
        if (d3.f2232k && w() != 0 && !d3.f2229g && I0()) {
            List list2 = a.f6876d;
            int size = list2.size();
            int iM = w.M(v(0));
            int iC = 0;
            int iC2 = 0;
            for (int i27 = 0; i27 < size; i27++) {
                RecyclerView.a aVar = (RecyclerView.a) list2.get(i27);
                if (!aVar.j()) {
                    boolean z15 = aVar.d() < iM;
                    boolean z16 = this.f6902v;
                    View view = aVar.f7003s;
                    if (z15 != z16) {
                        iC += this.f6899s.c(view);
                    } else {
                        iC2 += this.f6899s.c(view);
                    }
                }
            }
            this.f6898r.f7111k = list2;
            if (iC > 0) {
                n1(w.M(b1()), i12);
                n nVar12 = this.f6898r;
                nVar12.f7109h = iC;
                nVar12.f7104c = 0;
                nVar12.a(null);
                Q0(a, this.f6898r, d3, false);
            }
            if (iC2 > 0) {
                m1(w.M(a1()), i11);
                n nVar13 = this.f6898r;
                nVar13.f7109h = iC2;
                nVar13.f7104c = 0;
                list = null;
                nVar13.a(null);
                Q0(a, this.f6898r, d3, false);
            } else {
                list = null;
            }
            this.f6898r.f7111k = list;
        }
        if (d3.f2229g) {
            c0261k.d();
        } else {
            AbstractC0266p abstractC0266p = this.f6899s;
            abstractC0266p.a = abstractC0266p.l();
        }
        this.f6900t = this.f6903w;
    }

    public final void j1(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(AbstractC0487g.g(i10, "invalid orientation:"));
        }
        c(null);
        if (i10 != this.f6897q || this.f6899s == null) {
            AbstractC0266p abstractC0266pA = AbstractC0266p.a(this, i10);
            this.f6899s = abstractC0266pA;
            this.f6893B.a = abstractC0266pA;
            this.f6897q = i10;
            u0();
        }
    }

    @Override // androidx.recyclerview.widget.w
    public final int k(J0.D d3) {
        return L0(d3);
    }

    @Override // androidx.recyclerview.widget.w
    public void k0(J0.D d3) {
        this.f6892A = null;
        this.f6905y = -1;
        this.f6906z = Integer.MIN_VALUE;
        this.f6893B.d();
    }

    public void k1(boolean z6) {
        c(null);
        if (this.f6903w == z6) {
            return;
        }
        this.f6903w = z6;
        u0();
    }

    @Override // androidx.recyclerview.widget.w
    public int l(J0.D d3) {
        return M0(d3);
    }

    @Override // androidx.recyclerview.widget.w
    public final void l0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f6892A = savedState;
            if (this.f6905y != -1) {
                savedState.f6907s = -1;
            }
            u0();
        }
    }

    public final void l1(int i10, int i11, boolean z6, J0.D d3) {
        int iK;
        this.f6898r.f7112l = this.f6899s.i() == 0 && this.f6899s.f() == 0;
        this.f6898r.f7107f = i10;
        int[] iArr = this.f6896E;
        iArr[0] = 0;
        iArr[1] = 0;
        J0(d3, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z10 = i10 == 1;
        n nVar = this.f6898r;
        int i12 = z10 ? iMax2 : iMax;
        nVar.f7109h = i12;
        if (!z10) {
            iMax = iMax2;
        }
        nVar.f7110i = iMax;
        if (z10) {
            nVar.f7109h = this.f6899s.h() + i12;
            View viewA1 = a1();
            n nVar2 = this.f6898r;
            nVar2.f7106e = this.f6902v ? -1 : 1;
            int iM = w.M(viewA1);
            n nVar3 = this.f6898r;
            nVar2.f7105d = iM + nVar3.f7106e;
            nVar3.f7103b = this.f6899s.b(viewA1);
            iK = this.f6899s.b(viewA1) - this.f6899s.g();
        } else {
            View viewB1 = b1();
            n nVar4 = this.f6898r;
            nVar4.f7109h = this.f6899s.k() + nVar4.f7109h;
            n nVar5 = this.f6898r;
            nVar5.f7106e = this.f6902v ? 1 : -1;
            int iM2 = w.M(viewB1);
            n nVar6 = this.f6898r;
            nVar5.f7105d = iM2 + nVar6.f7106e;
            nVar6.f7103b = this.f6899s.e(viewB1);
            iK = (-this.f6899s.e(viewB1)) + this.f6899s.k();
        }
        n nVar7 = this.f6898r;
        nVar7.f7104c = i11;
        if (z6) {
            nVar7.f7104c = i11 - iK;
        }
        nVar7.f7108g = iK;
    }

    @Override // androidx.recyclerview.widget.w
    public int m(J0.D d3) {
        return N0(d3);
    }

    @Override // androidx.recyclerview.widget.w
    public final Parcelable m0() {
        SavedState savedState = this.f6892A;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.f6907s = savedState.f6907s;
            savedState2.f6908t = savedState.f6908t;
            savedState2.f6909u = savedState.f6909u;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        if (w() <= 0) {
            savedState3.f6907s = -1;
            return savedState3;
        }
        P0();
        boolean z6 = this.f6900t ^ this.f6902v;
        savedState3.f6909u = z6;
        if (z6) {
            View viewA1 = a1();
            savedState3.f6908t = this.f6899s.g() - this.f6899s.b(viewA1);
            savedState3.f6907s = w.M(viewA1);
            return savedState3;
        }
        View viewB1 = b1();
        savedState3.f6907s = w.M(viewB1);
        savedState3.f6908t = this.f6899s.e(viewB1) - this.f6899s.k();
        return savedState3;
    }

    public final void m1(int i10, int i11) {
        this.f6898r.f7104c = this.f6899s.g() - i11;
        n nVar = this.f6898r;
        nVar.f7106e = this.f6902v ? -1 : 1;
        nVar.f7105d = i10;
        nVar.f7107f = 1;
        nVar.f7103b = i11;
        nVar.f7108g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.w
    public final int n(J0.D d3) {
        return L0(d3);
    }

    public final void n1(int i10, int i11) {
        this.f6898r.f7104c = i11 - this.f6899s.k();
        n nVar = this.f6898r;
        nVar.f7105d = i10;
        nVar.f7106e = this.f6902v ? 1 : -1;
        nVar.f7107f = -1;
        nVar.f7103b = i11;
        nVar.f7108g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.w
    public int o(J0.D d3) {
        return M0(d3);
    }

    @Override // androidx.recyclerview.widget.w
    public int p(J0.D d3) {
        return N0(d3);
    }

    @Override // androidx.recyclerview.widget.w
    public final View r(int i10) {
        int iW = w();
        if (iW == 0) {
            return null;
        }
        int iM = i10 - w.M(v(0));
        if (iM >= 0 && iM < iW) {
            View viewV = v(iM);
            if (w.M(viewV) == i10) {
                return viewV;
            }
        }
        return super.r(i10);
    }

    @Override // androidx.recyclerview.widget.w
    public x s() {
        return new x(-2, -2);
    }

    @Override // androidx.recyclerview.widget.w
    public int v0(int i10, J0.D d3, A a) {
        if (this.f6897q == 1) {
            return 0;
        }
        return i1(i10, d3, a);
    }

    @Override // androidx.recyclerview.widget.w
    public final void w0(int i10) {
        this.f6905y = i10;
        this.f6906z = Integer.MIN_VALUE;
        SavedState savedState = this.f6892A;
        if (savedState != null) {
            savedState.f6907s = -1;
        }
        u0();
    }

    @Override // androidx.recyclerview.widget.w
    public int x0(int i10, J0.D d3, A a) {
        if (this.f6897q == 0) {
            return 0;
        }
        return i1(i10, d3, a);
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f6897q = 1;
        this.f6901u = false;
        this.f6902v = false;
        this.f6903w = false;
        this.f6904x = true;
        this.f6905y = -1;
        this.f6906z = Integer.MIN_VALUE;
        this.f6892A = null;
        this.f6893B = new C0261k();
        this.f6894C = new C0262l();
        this.f6895D = 2;
        this.f6896E = new int[2];
        J0.y yVarN = w.N(context, attributeSet, i10, i11);
        j1(yVarN.a);
        boolean z6 = yVarN.f2354c;
        c(null);
        if (z6 != this.f6901u) {
            this.f6901u = z6;
            u0();
        }
        k1(yVarN.f2355d);
    }

    @Override // androidx.recyclerview.widget.w
    public final void X(RecyclerView recyclerView) {
    }

    public void e1(A a, J0.D d3, C0261k c0261k, int i10) {
    }
}
