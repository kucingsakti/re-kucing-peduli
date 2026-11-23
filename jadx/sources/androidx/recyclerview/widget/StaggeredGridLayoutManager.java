package androidx.recyclerview.widget;

import A1.RunnableC0094c;
import J0.AbstractC0266p;
import J0.C0256f;
import J0.C0260j;
import J0.C0263m;
import J0.K;
import J0.L;
import J0.M;
import U.U;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends w implements J0.C {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final G f7013C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f7014D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f7015E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f7016F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public SavedState f7017G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final Rect f7018H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final K f7019I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final boolean f7020J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int[] f7021K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final RunnableC0094c f7022L;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f7023q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final M[] f7024r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AbstractC0266p f7025s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AbstractC0266p f7026t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f7027u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f7028v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0260j f7029w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f7030x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final BitSet f7032z;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f7031y = false;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f7011A = -1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f7012B = Integer.MIN_VALUE;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new H();

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public boolean f7037A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public boolean f7038B;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f7039s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f7040t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f7041u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int[] f7042v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f7043w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int[] f7044x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public ArrayList f7045y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public boolean f7046z;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f7039s);
            parcel.writeInt(this.f7040t);
            parcel.writeInt(this.f7041u);
            if (this.f7041u > 0) {
                parcel.writeIntArray(this.f7042v);
            }
            parcel.writeInt(this.f7043w);
            if (this.f7043w > 0) {
                parcel.writeIntArray(this.f7044x);
            }
            parcel.writeInt(this.f7046z ? 1 : 0);
            parcel.writeInt(this.f7037A ? 1 : 0);
            parcel.writeInt(this.f7038B ? 1 : 0);
            parcel.writeList(this.f7045y);
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f7023q = -1;
        this.f7030x = false;
        G g8 = new G();
        this.f7013C = g8;
        this.f7014D = 2;
        this.f7018H = new Rect();
        this.f7019I = new K(this);
        this.f7020J = true;
        this.f7022L = new RunnableC0094c(this, 6);
        J0.y yVarN = w.N(context, attributeSet, i10, i11);
        int i12 = yVarN.a;
        if (i12 != 0 && i12 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i12 != this.f7027u) {
            this.f7027u = i12;
            AbstractC0266p abstractC0266p = this.f7025s;
            this.f7025s = this.f7026t;
            this.f7026t = abstractC0266p;
            u0();
        }
        int i13 = yVarN.f2353b;
        c(null);
        if (i13 != this.f7023q) {
            g8.a();
            u0();
            this.f7023q = i13;
            this.f7032z = new BitSet(this.f7023q);
            this.f7024r = new M[this.f7023q];
            for (int i14 = 0; i14 < this.f7023q; i14++) {
                this.f7024r[i14] = new M(this, i14);
            }
            u0();
        }
        boolean z6 = yVarN.f2354c;
        c(null);
        SavedState savedState = this.f7017G;
        if (savedState != null && savedState.f7046z != z6) {
            savedState.f7046z = z6;
        }
        this.f7030x = z6;
        u0();
        C0260j c0260j = new C0260j();
        c0260j.a = true;
        c0260j.f2316f = 0;
        c0260j.f2317g = 0;
        this.f7029w = c0260j;
        this.f7025s = AbstractC0266p.a(this, this.f7027u);
        this.f7026t = AbstractC0266p.a(this, 1 - this.f7027u);
    }

    public static int l1(int i10, int i11, int i12) {
        int mode;
        return (!(i11 == 0 && i12 == 0) && ((mode = View.MeasureSpec.getMode(i10)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode) : i10;
    }

    @Override // androidx.recyclerview.widget.w
    public final void A0(Rect rect, int i10, int i11) {
        int iH;
        int iH2;
        int i12 = this.f7023q;
        int iK = K() + J();
        int I2 = I() + L();
        if (this.f7027u == 1) {
            int iHeight = rect.height() + I2;
            RecyclerView recyclerView = this.f7121b;
            WeakHashMap weakHashMap = U.a;
            iH2 = w.h(i11, iHeight, recyclerView.getMinimumHeight());
            iH = w.h(i10, (this.f7028v * i12) + iK, this.f7121b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iK;
            RecyclerView recyclerView2 = this.f7121b;
            WeakHashMap weakHashMap2 = U.a;
            iH = w.h(i10, iWidth, recyclerView2.getMinimumWidth());
            iH2 = w.h(i11, (this.f7028v * i12) + I2, this.f7121b.getMinimumHeight());
        }
        this.f7121b.setMeasuredDimension(iH, iH2);
    }

    @Override // androidx.recyclerview.widget.w
    public final void G0(RecyclerView recyclerView, int i10) {
        C0263m c0263m = new C0263m(recyclerView.getContext());
        c0263m.a = i10;
        H0(c0263m);
    }

    @Override // androidx.recyclerview.widget.w
    public final boolean I0() {
        return this.f7017G == null;
    }

    public final boolean J0() {
        int iS0;
        if (w() != 0 && this.f7014D != 0 && this.f7126g) {
            if (this.f7031y) {
                iS0 = T0();
                S0();
            } else {
                iS0 = S0();
                T0();
            }
            G g8 = this.f7013C;
            if (iS0 == 0 && X0() != null) {
                g8.a();
                this.f7125f = true;
                u0();
                return true;
            }
        }
        return false;
    }

    public final int K0(J0.D d3) {
        if (w() == 0) {
            return 0;
        }
        AbstractC0266p abstractC0266p = this.f7025s;
        boolean z6 = !this.f7020J;
        return p068ga.d.f(d3, abstractC0266p, P0(z6), O0(z6), this, this.f7020J);
    }

    public final int L0(J0.D d3) {
        if (w() == 0) {
            return 0;
        }
        AbstractC0266p abstractC0266p = this.f7025s;
        boolean z6 = !this.f7020J;
        return p068ga.d.g(d3, abstractC0266p, P0(z6), O0(z6), this, this.f7020J, this.f7031y);
    }

    public final int M0(J0.D d3) {
        if (w() == 0) {
            return 0;
        }
        AbstractC0266p abstractC0266p = this.f7025s;
        boolean z6 = !this.f7020J;
        return p068ga.d.h(d3, abstractC0266p, P0(z6), O0(z6), this, this.f7020J);
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    public final int N0(A a, C0260j c0260j, J0.D d3) {
        M m2;
        ?? r10;
        int i10;
        int iJ;
        int iC;
        int iK;
        int iC2;
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        int i15 = 1;
        this.f7032z.set(0, this.f7023q, true);
        C0260j c0260j2 = this.f7029w;
        int i16 = c0260j2.f2319i ? c0260j.f2315e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : c0260j.f2315e == 1 ? c0260j.f2317g + c0260j.f2312b : c0260j.f2316f - c0260j.f2312b;
        int i17 = c0260j.f2315e;
        for (int i18 = 0; i18 < this.f7023q; i18++) {
            if (!((ArrayList) this.f7024r[i18].f2259f).isEmpty()) {
                k1(this.f7024r[i18], i17, i16);
            }
        }
        int iG = this.f7031y ? this.f7025s.g() : this.f7025s.k();
        boolean z6 = false;
        while (true) {
            int i19 = c0260j.f2313c;
            if (((i19 < 0 || i19 >= d3.b()) ? i14 : i15) == 0 || (!c0260j2.f2319i && this.f7032z.isEmpty())) {
                break;
            }
            View view = a.k(c0260j.f2313c, Long.MAX_VALUE).f7003s;
            c0260j.f2313c += c0260j.f2314d;
            L l4 = (L) view.getLayoutParams();
            int iD = l4.f7135s.d();
            G g8 = this.f7013C;
            int[] iArr = g8.a;
            int i20 = (iArr == null || iD >= iArr.length) ? -1 : iArr[iD];
            if (i20 == -1) {
                if (b1(c0260j.f2315e)) {
                    i13 = this.f7023q - i15;
                    i12 = -1;
                    i11 = -1;
                } else {
                    i11 = i15;
                    i12 = this.f7023q;
                    i13 = i14;
                }
                M m10 = null;
                if (c0260j.f2315e == i15) {
                    int iK2 = this.f7025s.k();
                    int i21 = Integer.MAX_VALUE;
                    while (i13 != i12) {
                        M m11 = this.f7024r[i13];
                        int iH = m11.h(iK2);
                        if (iH < i21) {
                            i21 = iH;
                            m10 = m11;
                        }
                        i13 += i11;
                    }
                } else {
                    int iG2 = this.f7025s.g();
                    int i22 = Integer.MIN_VALUE;
                    while (i13 != i12) {
                        M m12 = this.f7024r[i13];
                        int iJ2 = m12.j(iG2);
                        if (iJ2 > i22) {
                            m10 = m12;
                            i22 = iJ2;
                        }
                        i13 += i11;
                    }
                }
                m2 = m10;
                g8.b(iD);
                g8.a[iD] = m2.f2258e;
            } else {
                m2 = this.f7024r[i20];
            }
            l4.f2254w = m2;
            if (c0260j.f2315e == 1) {
                r10 = 0;
                b(view, -1, false);
            } else {
                r10 = 0;
                b(view, 0, false);
            }
            if (this.f7027u == 1) {
                i10 = 1;
                Z0(view, w.x(r10, this.f7028v, this.f7131m, r10, ((ViewGroup.MarginLayoutParams) l4).width), w.x(true, this.f7134p, this.f7132n, I() + L(), ((ViewGroup.MarginLayoutParams) l4).height));
            } else {
                i10 = 1;
                Z0(view, w.x(true, this.f7133o, this.f7131m, K() + J(), ((ViewGroup.MarginLayoutParams) l4).width), w.x(false, this.f7028v, this.f7132n, 0, ((ViewGroup.MarginLayoutParams) l4).height));
            }
            if (c0260j.f2315e == i10) {
                iC = m2.h(iG);
                iJ = this.f7025s.c(view) + iC;
            } else {
                iJ = m2.j(iG);
                iC = iJ - this.f7025s.c(view);
            }
            if (c0260j.f2315e == 1) {
                M m13 = l4.f2254w;
                m13.getClass();
                L l10 = (L) view.getLayoutParams();
                l10.f2254w = m13;
                ArrayList arrayList = (ArrayList) m13.f2259f;
                arrayList.add(view);
                m13.f2256c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    m13.f2255b = Integer.MIN_VALUE;
                }
                if (l10.f7135s.j() || l10.f7135s.m()) {
                    m13.f2257d = ((StaggeredGridLayoutManager) m13.f2260g).f7025s.c(view) + m13.f2257d;
                }
            } else {
                M m14 = l4.f2254w;
                m14.getClass();
                L l11 = (L) view.getLayoutParams();
                l11.f2254w = m14;
                ArrayList arrayList2 = (ArrayList) m14.f2259f;
                arrayList2.add(0, view);
                m14.f2255b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    m14.f2256c = Integer.MIN_VALUE;
                }
                if (l11.f7135s.j() || l11.f7135s.m()) {
                    m14.f2257d = ((StaggeredGridLayoutManager) m14.f2260g).f7025s.c(view) + m14.f2257d;
                }
            }
            if (Y0() && this.f7027u == 1) {
                iC2 = this.f7026t.g() - (((this.f7023q - 1) - m2.f2258e) * this.f7028v);
                iK = iC2 - this.f7026t.c(view);
            } else {
                iK = this.f7026t.k() + (m2.f2258e * this.f7028v);
                iC2 = this.f7026t.c(view) + iK;
            }
            if (this.f7027u == 1) {
                w.S(view, iK, iC, iC2, iJ);
            } else {
                w.S(view, iC, iK, iJ, iC2);
            }
            k1(m2, c0260j2.f2315e, i16);
            d1(a, c0260j2);
            if (c0260j2.f2318h && view.hasFocusable()) {
                this.f7032z.set(m2.f2258e, false);
            }
            i15 = 1;
            z6 = true;
            i14 = 0;
        }
        if (!z6) {
            d1(a, c0260j2);
        }
        int iK3 = c0260j2.f2315e == -1 ? this.f7025s.k() - V0(this.f7025s.k()) : U0(this.f7025s.g()) - this.f7025s.g();
        if (iK3 > 0) {
            return Math.min(c0260j.f2312b, iK3);
        }
        return 0;
    }

    public final View O0(boolean z6) {
        int iK = this.f7025s.k();
        int iG = this.f7025s.g();
        View view = null;
        for (int iW = w() - 1; iW >= 0; iW--) {
            View viewV = v(iW);
            int iE = this.f7025s.e(viewV);
            int iB = this.f7025s.b(viewV);
            if (iB > iK && iE < iG) {
                if (iB <= iG || !z6) {
                    return viewV;
                }
                if (view == null) {
                    view = viewV;
                }
            }
        }
        return view;
    }

    public final View P0(boolean z6) {
        int iK = this.f7025s.k();
        int iG = this.f7025s.g();
        int iW = w();
        View view = null;
        for (int i10 = 0; i10 < iW; i10++) {
            View viewV = v(i10);
            int iE = this.f7025s.e(viewV);
            if (this.f7025s.b(viewV) > iK && iE < iG) {
                if (iE >= iK || !z6) {
                    return viewV;
                }
                if (view == null) {
                    view = viewV;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.w
    public final boolean Q() {
        return this.f7014D != 0;
    }

    public final void Q0(A a, J0.D d3, boolean z6) {
        int iG;
        int iU0 = U0(Integer.MIN_VALUE);
        if (iU0 != Integer.MIN_VALUE && (iG = this.f7025s.g() - iU0) > 0) {
            int i10 = iG - (-h1(-iG, d3, a));
            if (!z6 || i10 <= 0) {
                return;
            }
            this.f7025s.p(i10);
        }
    }

    public final void R0(A a, J0.D d3, boolean z6) {
        int iK;
        int iV0 = V0(Integer.MAX_VALUE);
        if (iV0 != Integer.MAX_VALUE && (iK = iV0 - this.f7025s.k()) > 0) {
            int iH1 = iK - h1(iK, d3, a);
            if (!z6 || iH1 <= 0) {
                return;
            }
            this.f7025s.p(-iH1);
        }
    }

    public final int S0() {
        if (w() == 0) {
            return 0;
        }
        return w.M(v(0));
    }

    @Override // androidx.recyclerview.widget.w
    public final void T(int i10) {
        super.T(i10);
        for (int i11 = 0; i11 < this.f7023q; i11++) {
            M m2 = this.f7024r[i11];
            int i12 = m2.f2255b;
            if (i12 != Integer.MIN_VALUE) {
                m2.f2255b = i12 + i10;
            }
            int i13 = m2.f2256c;
            if (i13 != Integer.MIN_VALUE) {
                m2.f2256c = i13 + i10;
            }
        }
    }

    public final int T0() {
        int iW = w();
        if (iW == 0) {
            return 0;
        }
        return w.M(v(iW - 1));
    }

    @Override // androidx.recyclerview.widget.w
    public final void U(int i10) {
        super.U(i10);
        for (int i11 = 0; i11 < this.f7023q; i11++) {
            M m2 = this.f7024r[i11];
            int i12 = m2.f2255b;
            if (i12 != Integer.MIN_VALUE) {
                m2.f2255b = i12 + i10;
            }
            int i13 = m2.f2256c;
            if (i13 != Integer.MIN_VALUE) {
                m2.f2256c = i13 + i10;
            }
        }
    }

    public final int U0(int i10) {
        int iH = this.f7024r[0].h(i10);
        for (int i11 = 1; i11 < this.f7023q; i11++) {
            int iH2 = this.f7024r[i11].h(i10);
            if (iH2 > iH) {
                iH = iH2;
            }
        }
        return iH;
    }

    @Override // androidx.recyclerview.widget.w
    public final void V() {
        this.f7013C.a();
        for (int i10 = 0; i10 < this.f7023q; i10++) {
            this.f7024r[i10].b();
        }
    }

    public final int V0(int i10) {
        int iJ = this.f7024r[0].j(i10);
        for (int i11 = 1; i11 < this.f7023q; i11++) {
            int iJ2 = this.f7024r[i11].j(i10);
            if (iJ2 < iJ) {
                iJ = iJ2;
            }
        }
        return iJ;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0030  */
    /* JADX WARN: Code duplicated, block: B:22:0x0032 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0035  */
    /* JADX WARN: Code duplicated, block: B:26:0x003d  */
    /* JADX WARN: Code duplicated, block: B:29:0x004a A[LOOP:0: B:25:0x003b->B:29:0x004a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x004d A[EDGE_INSN: B:30:0x004d->B:31:0x004e BREAK  A[LOOP:0: B:25:0x003b->B:29:0x004a]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0050  */
    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b A[LOOP:1: B:34:0x005c->B:38:0x006b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0082  */
    /* JADX WARN: Code duplicated, block: B:44:0x008c  */
    /* JADX WARN: Code duplicated, block: B:47:0x009d  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:63:0x004d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x004e A[EDGE_INSN: B:64:0x004e->B:31:0x004e BREAK  A[LOOP:0: B:25:0x003b->B:29:0x004a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x006e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x006f A[EDGE_INSN: B:66:0x006f->B:40:0x006f BREAK  A[LOOP:1: B:34:0x005c->B:38:0x006b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public final void W0(int i10, int i11, int i12) {
        int i13;
        int i14;
        G g8;
        int[] iArr;
        int iT0;
        ArrayList arrayList;
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
        int size;
        int i15;
        int i16;
        int size2;
        int iT1 = this.f7031y ? T0() : S0();
        if (i12 == 8) {
            if (i10 < i11) {
                i13 = i11 + 1;
            } else {
                i13 = i10 + 1;
                i14 = i11;
            }
            g8 = this.f7013C;
            iArr = g8.a;
            if (iArr != null && i14 < iArr.length) {
                arrayList = g8.f6882b;
                if (arrayList != null) {
                    if (arrayList == null) {
                        size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 >= 0) {
                                staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = null;
                                break;
                            }
                            staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) g8.f6882b.get(size2);
                            if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7033s == i14) {
                                break;
                            } else {
                                size2--;
                            }
                        }
                    } else {
                        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = null;
                        break;
                    }
                    if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem != null) {
                        g8.f6882b.remove(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem);
                    }
                    size = g8.f6882b.size();
                    i15 = 0;
                    while (true) {
                        if (i15 < size) {
                            i15 = -1;
                            break;
                        } else if (((StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) g8.f6882b.get(i15)).f7033s >= i14) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                    if (i15 != -1) {
                        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2 = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) g8.f6882b.get(i15);
                        g8.f6882b.remove(i15);
                        i16 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.f7033s;
                    } else {
                        i16 = -1;
                    }
                } else {
                    i16 = -1;
                }
                if (i16 == -1) {
                    int[] iArr2 = g8.a;
                    Arrays.fill(iArr2, i14, iArr2.length, -1);
                    int length = g8.a.length;
                } else {
                    Arrays.fill(g8.a, i14, Math.min(i16 + 1, g8.a.length), -1);
                }
            }
            if (i12 != 1) {
                g8.c(i10, i11);
            } else if (i12 != 2) {
                g8.d(i10, i11);
            } else if (i12 == 8) {
                g8.d(i10, 1);
                g8.c(i11, 1);
            }
            if (i13 <= iT1) {
                return;
            }
            if (this.f7031y) {
                iT0 = S0();
            } else {
                iT0 = T0();
            }
            if (i14 <= iT0) {
                u0();
            }
        }
        i13 = i10 + i11;
        i14 = i10;
        g8 = this.f7013C;
        iArr = g8.a;
        if (iArr != null) {
            arrayList = g8.f6882b;
            if (arrayList != null) {
                if (arrayList == null) {
                    size2 = arrayList.size() - 1;
                    while (true) {
                        if (size2 >= 0) {
                            staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = null;
                            break;
                        }
                        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) g8.f6882b.get(size2);
                        if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7033s == i14) {
                            break;
                            break;
                        }
                        size2--;
                    }
                } else {
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = null;
                    break;
                }
                if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem != null) {
                    g8.f6882b.remove(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem);
                }
                size = g8.f6882b.size();
                i15 = 0;
                while (true) {
                    if (i15 < size) {
                        i15 = -1;
                        break;
                    } else {
                        if (((StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) g8.f6882b.get(i15)).f7033s >= i14) {
                            break;
                            break;
                        }
                        i15++;
                    }
                }
                if (i15 != -1) {
                    StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem3 = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) g8.f6882b.get(i15);
                    g8.f6882b.remove(i15);
                    i16 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem3.f7033s;
                } else {
                    i16 = -1;
                }
            } else {
                i16 = -1;
            }
            if (i16 == -1) {
                int[] iArr3 = g8.a;
                Arrays.fill(iArr3, i14, iArr3.length, -1);
                int length2 = g8.a.length;
            } else {
                Arrays.fill(g8.a, i14, Math.min(i16 + 1, g8.a.length), -1);
            }
        }
        if (i12 != 1) {
            g8.c(i10, i11);
        } else if (i12 != 2) {
            g8.d(i10, i11);
        } else if (i12 == 8) {
            g8.d(i10, 1);
            g8.c(i11, 1);
        }
        if (i13 <= iT1) {
            return;
        }
        if (this.f7031y) {
            iT0 = S0();
        } else {
            iT0 = T0();
        }
        if (i14 <= iT0) {
            u0();
        }
    }

    @Override // androidx.recyclerview.widget.w
    public final void X(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f7121b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f7022L);
        }
        for (int i10 = 0; i10 < this.f7023q; i10++) {
            this.f7024r[i10].b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:54:0x0102  */
    /* JADX WARN: Code duplicated, block: B:55:0x0104  */
    /* JADX WARN: Code duplicated, block: B:68:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x002c A[SYNTHETIC] */
    public final View X0() {
        boolean z6;
        boolean z10;
        int iW = w();
        int i10 = iW - 1;
        BitSet bitSet = new BitSet(this.f7023q);
        bitSet.set(0, this.f7023q, true);
        byte b3 = (this.f7027u == 1 && Y0()) ? (byte) 1 : (byte) -1;
        if (this.f7031y) {
            iW = -1;
        } else {
            i10 = 0;
        }
        int i11 = i10 < iW ? 1 : -1;
        while (i10 != iW) {
            View viewV = v(i10);
            L l4 = (L) viewV.getLayoutParams();
            if (bitSet.get(l4.f2254w.f2258e)) {
                M m2 = l4.f2254w;
                if (this.f7031y) {
                    int i12 = m2.f2256c;
                    if (i12 == Integer.MIN_VALUE) {
                        m2.a();
                        i12 = m2.f2256c;
                    }
                    if (i12 < this.f7025s.g()) {
                        ArrayList arrayList = (ArrayList) m2.f2259f;
                        ((L) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                        return viewV;
                    }
                } else {
                    int i13 = m2.f2255b;
                    if (i13 == Integer.MIN_VALUE) {
                        View view = (View) ((ArrayList) m2.f2259f).get(0);
                        L l10 = (L) view.getLayoutParams();
                        m2.f2255b = ((StaggeredGridLayoutManager) m2.f2260g).f7025s.e(view);
                        l10.getClass();
                        i13 = m2.f2255b;
                    }
                    if (i13 > this.f7025s.k()) {
                        ((L) ((View) ((ArrayList) m2.f2259f).get(0)).getLayoutParams()).getClass();
                        return viewV;
                    }
                }
                bitSet.clear(l4.f2254w.f2258e);
            }
            i10 += i11;
            if (i10 != iW) {
                View viewV2 = v(i10);
                if (this.f7031y) {
                    int iB = this.f7025s.b(viewV);
                    int iB2 = this.f7025s.b(viewV2);
                    if (iB >= iB2) {
                        if (iB == iB2) {
                            if (l4.f2254w.f2258e - ((L) viewV2.getLayoutParams()).f2254w.f2258e < 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (b3 < 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z6 != z10) {
                            }
                        } else {
                            continue;
                        }
                    }
                    return viewV;
                }
                int iE = this.f7025s.e(viewV);
                int iE2 = this.f7025s.e(viewV2);
                if (iE <= iE2) {
                    if (iE == iE2) {
                        if (l4.f2254w.f2258e - ((L) viewV2.getLayoutParams()).f2254w.f2258e < 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (b3 < 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z6 != z10) {
                        }
                    } else {
                        continue;
                    }
                }
                return viewV;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0046  */
    /* JADX WARN: Code duplicated, block: B:37:0x0051  */
    @Override // androidx.recyclerview.widget.w
    public final View Y(View view, int i10, A a, J0.D d3) {
        View viewE;
        int i11;
        if (w() != 0) {
            RecyclerView recyclerView = this.f7121b;
            if (recyclerView == null || (viewE = recyclerView.E(view)) == null || this.a.f7053c.contains(viewE)) {
                viewE = null;
            }
            if (viewE != null) {
                g1();
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 17) {
                            if (i10 != 33) {
                                if (i10 == 66 ? this.f7027u == 0 : !(i10 != 130 || this.f7027u != 1)) {
                                    i11 = 1;
                                }
                            } else if (this.f7027u == 1) {
                                i11 = -1;
                            }
                            i11 = Integer.MIN_VALUE;
                        } else if (this.f7027u == 0) {
                            i11 = -1;
                        } else {
                            i11 = Integer.MIN_VALUE;
                        }
                    } else if (this.f7027u != 1 && Y0()) {
                        i11 = -1;
                    } else {
                        i11 = 1;
                    }
                } else if (this.f7027u != 1 && Y0()) {
                    i11 = 1;
                } else {
                    i11 = -1;
                }
                if (i11 != Integer.MIN_VALUE) {
                    L l4 = (L) viewE.getLayoutParams();
                    l4.getClass();
                    M m2 = l4.f2254w;
                    int iT0 = i11 == 1 ? T0() : S0();
                    j1(iT0, d3);
                    i1(i11);
                    C0260j c0260j = this.f7029w;
                    c0260j.f2313c = c0260j.f2314d + iT0;
                    c0260j.f2312b = (int) (this.f7025s.l() * 0.33333334f);
                    c0260j.f2318h = true;
                    c0260j.a = false;
                    N0(a, c0260j, d3);
                    this.f7015E = this.f7031y;
                    View viewI = m2.i(iT0, i11);
                    if (viewI != null && viewI != viewE) {
                        return viewI;
                    }
                    if (b1(i11)) {
                        for (int i12 = this.f7023q - 1; i12 >= 0; i12--) {
                            View viewI2 = this.f7024r[i12].i(iT0, i11);
                            if (viewI2 != null && viewI2 != viewE) {
                                return viewI2;
                            }
                        }
                    } else {
                        for (int i13 = 0; i13 < this.f7023q; i13++) {
                            View viewI3 = this.f7024r[i13].i(iT0, i11);
                            if (viewI3 != null && viewI3 != viewE) {
                                return viewI3;
                            }
                        }
                    }
                    boolean z6 = (this.f7030x ^ true) == (i11 == -1);
                    View viewR = r(z6 ? m2.d() : m2.e());
                    if (viewR != null && viewR != viewE) {
                        return viewR;
                    }
                    if (b1(i11)) {
                        for (int i14 = this.f7023q - 1; i14 >= 0; i14--) {
                            if (i14 != m2.f2258e) {
                                View viewR2 = r(z6 ? this.f7024r[i14].d() : this.f7024r[i14].e());
                                if (viewR2 != null && viewR2 != viewE) {
                                    return viewR2;
                                }
                            }
                        }
                    } else {
                        for (int i15 = 0; i15 < this.f7023q; i15++) {
                            View viewR3 = r(z6 ? this.f7024r[i15].d() : this.f7024r[i15].e());
                            if (viewR3 != null && viewR3 != viewE) {
                                return viewR3;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final boolean Y0() {
        return H() == 1;
    }

    @Override // androidx.recyclerview.widget.w
    public final void Z(AccessibilityEvent accessibilityEvent) {
        super.Z(accessibilityEvent);
        if (w() > 0) {
            View viewP0 = P0(false);
            View viewO0 = O0(false);
            if (viewP0 == null || viewO0 == null) {
                return;
            }
            int iM = w.M(viewP0);
            int iM2 = w.M(viewO0);
            if (iM < iM2) {
                accessibilityEvent.setFromIndex(iM);
                accessibilityEvent.setToIndex(iM2);
            } else {
                accessibilityEvent.setFromIndex(iM2);
                accessibilityEvent.setToIndex(iM);
            }
        }
    }

    public final void Z0(View view, int i10, int i11) {
        Rect rect = this.f7018H;
        d(rect, view);
        L l4 = (L) view.getLayoutParams();
        int iL1 = l1(i10, ((ViewGroup.MarginLayoutParams) l4).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) l4).rightMargin + rect.right);
        int iL2 = l1(i11, ((ViewGroup.MarginLayoutParams) l4).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) l4).bottomMargin + rect.bottom);
        if (D0(view, iL1, iL2, l4)) {
            view.measure(iL1, iL2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000c  */
    @Override // J0.C
    public final PointF a(int i10) {
        int i11 = -1;
        if (w() != 0) {
            if ((i10 < S0()) == this.f7031y) {
                i11 = 1;
            }
        } else if (this.f7031y) {
            i11 = 1;
        }
        PointF pointF = new PointF();
        if (i11 == 0) {
            return null;
        }
        if (this.f7027u == 0) {
            pointF.x = i11;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i11;
        return pointF;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:109:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:123:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:131:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:133:0x0209  */
    /* JADX WARN: Code duplicated, block: B:255:0x0419  */
    /* JADX WARN: Code duplicated, block: B:266:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:0x01fc A[SYNTHETIC] */
    public final void a1(A a, J0.D d3, boolean z6) {
        boolean z10;
        SavedState savedState;
        int iW;
        int i10;
        int iM;
        int iM2;
        int iW2;
        int i11;
        boolean z11;
        SavedState savedState2 = this.f7017G;
        K k3 = this.f7019I;
        if (!(savedState2 == null && this.f7011A == -1) && d3.b() == 0) {
            q0(a);
            k3.a();
            return;
        }
        boolean z12 = (k3.f2251e && this.f7011A == -1 && this.f7017G == null) ? false : true;
        G g8 = this.f7013C;
        StaggeredGridLayoutManager staggeredGridLayoutManager = k3.f2253g;
        if (z12) {
            k3.a();
            SavedState savedState3 = this.f7017G;
            if (savedState3 != null) {
                int i12 = savedState3.f7041u;
                if (i12 > 0) {
                    if (i12 == this.f7023q) {
                        for (int i13 = 0; i13 < this.f7023q; i13++) {
                            this.f7024r[i13].b();
                            SavedState savedState4 = this.f7017G;
                            int iG = savedState4.f7042v[i13];
                            if (iG != Integer.MIN_VALUE) {
                                iG += savedState4.f7037A ? this.f7025s.g() : this.f7025s.k();
                            }
                            M m2 = this.f7024r[i13];
                            m2.f2255b = iG;
                            m2.f2256c = iG;
                        }
                    } else {
                        savedState3.f7042v = null;
                        savedState3.f7041u = 0;
                        savedState3.f7043w = 0;
                        savedState3.f7044x = null;
                        savedState3.f7045y = null;
                        savedState3.f7039s = savedState3.f7040t;
                    }
                }
                SavedState savedState5 = this.f7017G;
                this.f7016F = savedState5.f7038B;
                boolean z13 = savedState5.f7046z;
                c(null);
                SavedState savedState6 = this.f7017G;
                if (savedState6 != null && savedState6.f7046z != z13) {
                    savedState6.f7046z = z13;
                }
                this.f7030x = z13;
                u0();
                g1();
                SavedState savedState7 = this.f7017G;
                int i14 = savedState7.f7039s;
                if (i14 != -1) {
                    this.f7011A = i14;
                    k3.f2249c = savedState7.f7037A;
                } else {
                    k3.f2249c = this.f7031y;
                }
                if (savedState7.f7043w > 1) {
                    g8.a = savedState7.f7044x;
                    g8.f6882b = savedState7.f7045y;
                }
            } else {
                g1();
                k3.f2249c = this.f7031y;
            }
            if (d3.f2229g || (i11 = this.f7011A) == -1) {
                if (this.f7015E) {
                    int iB = d3.b();
                    iW2 = w() - 1;
                    while (true) {
                        if (iW2 < 0) {
                            iM2 = 0;
                            break;
                        }
                        iM2 = w.M(v(iW2));
                        if (iM2 < 0 && iM2 < iB) {
                            break;
                        } else {
                            iW2--;
                        }
                    }
                } else {
                    int iB2 = d3.b();
                    iW = w();
                    i10 = 0;
                    while (true) {
                        if (i10 >= iW) {
                            iM2 = 0;
                            break;
                        }
                        iM = w.M(v(i10));
                        if (iM < 0 && iM < iB2) {
                            iM2 = iM;
                            break;
                        }
                        i10++;
                    }
                }
                k3.a = iM2;
                k3.f2248b = Integer.MIN_VALUE;
            } else if (i11 < 0 || i11 >= d3.b()) {
                this.f7011A = -1;
                this.f7012B = Integer.MIN_VALUE;
                if (this.f7015E) {
                    int iB3 = d3.b();
                    iW2 = w() - 1;
                    while (true) {
                        if (iW2 < 0) {
                            iM2 = 0;
                            break;
                        } else {
                            iM2 = w.M(v(iW2));
                            if (iM2 < 0) {
                            }
                            iW2--;
                        }
                    }
                } else {
                    int iB4 = d3.b();
                    iW = w();
                    i10 = 0;
                    while (true) {
                        if (i10 >= iW) {
                            iM2 = 0;
                            break;
                        } else {
                            iM = w.M(v(i10));
                            if (iM < 0) {
                            }
                            i10++;
                        }
                    }
                }
                k3.a = iM2;
                k3.f2248b = Integer.MIN_VALUE;
            } else {
                SavedState savedState8 = this.f7017G;
                if (savedState8 == null || savedState8.f7039s == -1 || savedState8.f7041u < 1) {
                    View viewR = r(this.f7011A);
                    if (viewR != null) {
                        k3.a = this.f7031y ? T0() : S0();
                        if (this.f7012B != Integer.MIN_VALUE) {
                            if (k3.f2249c) {
                                k3.f2248b = (this.f7025s.g() - this.f7012B) - this.f7025s.b(viewR);
                            } else {
                                k3.f2248b = (this.f7025s.k() + this.f7012B) - this.f7025s.e(viewR);
                            }
                        } else if (this.f7025s.c(viewR) > this.f7025s.l()) {
                            k3.f2248b = k3.f2249c ? this.f7025s.g() : this.f7025s.k();
                        } else {
                            int iE = this.f7025s.e(viewR) - this.f7025s.k();
                            if (iE < 0) {
                                k3.f2248b = -iE;
                            } else {
                                int iG2 = this.f7025s.g() - this.f7025s.b(viewR);
                                if (iG2 < 0) {
                                    k3.f2248b = iG2;
                                } else {
                                    k3.f2248b = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i15 = this.f7011A;
                        k3.a = i15;
                        int i16 = this.f7012B;
                        if (i16 == Integer.MIN_VALUE) {
                            if (w() != 0) {
                                if ((i15 < S0()) != this.f7031y) {
                                    z11 = false;
                                } else {
                                    z11 = true;
                                }
                            } else if (this.f7031y) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            k3.f2249c = z11;
                            k3.f2248b = z11 ? staggeredGridLayoutManager.f7025s.g() : staggeredGridLayoutManager.f7025s.k();
                        } else if (k3.f2249c) {
                            k3.f2248b = staggeredGridLayoutManager.f7025s.g() - i16;
                        } else {
                            k3.f2248b = staggeredGridLayoutManager.f7025s.k() + i16;
                        }
                        k3.f2250d = true;
                    }
                } else {
                    k3.f2248b = Integer.MIN_VALUE;
                    k3.a = this.f7011A;
                }
            }
            k3.f2251e = true;
        }
        if (this.f7017G == null && this.f7011A == -1 && (k3.f2249c != this.f7015E || Y0() != this.f7016F)) {
            g8.a();
            k3.f2250d = true;
        }
        if (w() > 0 && ((savedState = this.f7017G) == null || savedState.f7041u < 1)) {
            if (k3.f2250d) {
                for (int i17 = 0; i17 < this.f7023q; i17++) {
                    this.f7024r[i17].b();
                    int i18 = k3.f2248b;
                    if (i18 != Integer.MIN_VALUE) {
                        M m10 = this.f7024r[i17];
                        m10.f2255b = i18;
                        m10.f2256c = i18;
                    }
                }
            } else if (z12 || k3.f2252f == null) {
                for (int i19 = 0; i19 < this.f7023q; i19++) {
                    M m11 = this.f7024r[i19];
                    boolean z14 = this.f7031y;
                    int i20 = k3.f2248b;
                    int iH = z14 ? m11.h(Integer.MIN_VALUE) : m11.j(Integer.MIN_VALUE);
                    m11.b();
                    if (iH != Integer.MIN_VALUE) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) m11.f2260g;
                        if ((!z14 || iH >= staggeredGridLayoutManager2.f7025s.g()) && (z14 || iH <= staggeredGridLayoutManager2.f7025s.k())) {
                            if (i20 != Integer.MIN_VALUE) {
                                iH += i20;
                            }
                            m11.f2256c = iH;
                            m11.f2255b = iH;
                        }
                    }
                }
                M[] mArr = this.f7024r;
                int length = mArr.length;
                int[] iArr = k3.f2252f;
                if (iArr == null || iArr.length < length) {
                    k3.f2252f = new int[staggeredGridLayoutManager.f7024r.length];
                }
                for (int i21 = 0; i21 < length; i21++) {
                    k3.f2252f[i21] = mArr[i21].j(Integer.MIN_VALUE);
                }
            } else {
                for (int i22 = 0; i22 < this.f7023q; i22++) {
                    M m12 = this.f7024r[i22];
                    m12.b();
                    int i23 = k3.f2252f[i22];
                    m12.f2255b = i23;
                    m12.f2256c = i23;
                }
            }
        }
        q(a);
        C0260j c0260j = this.f7029w;
        c0260j.a = false;
        int iL = this.f7026t.l();
        this.f7028v = iL / this.f7023q;
        View.MeasureSpec.makeMeasureSpec(iL, this.f7026t.i());
        j1(k3.a, d3);
        if (k3.f2249c) {
            i1(-1);
            N0(a, c0260j, d3);
            i1(1);
            c0260j.f2313c = k3.a + c0260j.f2314d;
            N0(a, c0260j, d3);
        } else {
            i1(1);
            N0(a, c0260j, d3);
            i1(-1);
            c0260j.f2313c = k3.a + c0260j.f2314d;
            N0(a, c0260j, d3);
        }
        if (this.f7026t.i() != 1073741824) {
            int iW3 = w();
            float fMax = 0.0f;
            for (int i24 = 0; i24 < iW3; i24++) {
                View viewV = v(i24);
                float fC = this.f7026t.c(viewV);
                if (fC >= fMax) {
                    ((L) viewV.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fC);
                }
            }
            int i25 = this.f7028v;
            int iRound = Math.round(fMax * this.f7023q);
            if (this.f7026t.i() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.f7026t.l());
            }
            this.f7028v = iRound / this.f7023q;
            View.MeasureSpec.makeMeasureSpec(iRound, this.f7026t.i());
            if (this.f7028v != i25) {
                for (int i26 = 0; i26 < iW3; i26++) {
                    View viewV2 = v(i26);
                    L l4 = (L) viewV2.getLayoutParams();
                    l4.getClass();
                    if (Y0() && this.f7027u == 1) {
                        int i27 = -((this.f7023q - 1) - l4.f2254w.f2258e);
                        viewV2.offsetLeftAndRight((this.f7028v * i27) - (i27 * i25));
                    } else {
                        int i28 = l4.f2254w.f2258e;
                        int i29 = this.f7028v * i28;
                        int i30 = i28 * i25;
                        if (this.f7027u == 1) {
                            viewV2.offsetLeftAndRight(i29 - i30);
                        } else {
                            viewV2.offsetTopAndBottom(i29 - i30);
                        }
                    }
                }
            }
        }
        if (w() > 0) {
            if (this.f7031y) {
                Q0(a, d3, true);
                R0(a, d3, false);
            } else {
                R0(a, d3, true);
                Q0(a, d3, false);
            }
        }
        if (z6 && !d3.f2229g && this.f7014D != 0 && w() > 0 && X0() != null) {
            RecyclerView recyclerView = this.f7121b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.f7022L);
            }
            z10 = J0();
        }
        if (d3.f2229g) {
            k3.a();
        }
        this.f7015E = k3.f2249c;
        this.f7016F = Y0();
        if (z10) {
            k3.a();
            a1(a, d3, false);
        }
    }

    public final boolean b1(int i10) {
        if (this.f7027u == 0) {
            return (i10 == -1) != this.f7031y;
        }
        return ((i10 == -1) == this.f7031y) == Y0();
    }

    @Override // androidx.recyclerview.widget.w
    public final void c(String str) {
        if (this.f7017G == null) {
            super.c(str);
        }
    }

    public final void c1(int i10, J0.D d3) {
        int iS0;
        int i11;
        if (i10 > 0) {
            iS0 = T0();
            i11 = 1;
        } else {
            iS0 = S0();
            i11 = -1;
        }
        C0260j c0260j = this.f7029w;
        c0260j.a = true;
        j1(iS0, d3);
        i1(i11);
        c0260j.f2313c = iS0 + c0260j.f2314d;
        c0260j.f2312b = Math.abs(i10);
    }

    @Override // androidx.recyclerview.widget.w
    public final void d0(int i10, int i11) {
        W0(i10, i11, 1);
    }

    public final void d1(A a, C0260j c0260j) {
        int iMin;
        if (!c0260j.a || c0260j.f2319i) {
            return;
        }
        if (c0260j.f2312b == 0) {
            if (c0260j.f2315e == -1) {
                e1(a, c0260j.f2317g);
                return;
            } else {
                f1(a, c0260j.f2316f);
                return;
            }
        }
        int i10 = 1;
        if (c0260j.f2315e == -1) {
            int i11 = c0260j.f2316f;
            int iJ = this.f7024r[0].j(i11);
            while (i10 < this.f7023q) {
                int iJ2 = this.f7024r[i10].j(i11);
                if (iJ2 > iJ) {
                    iJ = iJ2;
                }
                i10++;
            }
            int i12 = i11 - iJ;
            e1(a, i12 < 0 ? c0260j.f2317g : c0260j.f2317g - Math.min(i12, c0260j.f2312b));
            return;
        }
        int i13 = c0260j.f2317g;
        int iH = this.f7024r[0].h(i13);
        while (i10 < this.f7023q) {
            int iH2 = this.f7024r[i10].h(i13);
            if (iH2 < iH) {
                iH = iH2;
            }
            i10++;
        }
        int i14 = iH - c0260j.f2317g;
        if (i14 < 0) {
            iMin = c0260j.f2316f;
        } else {
            iMin = Math.min(i14, c0260j.f2312b) + c0260j.f2316f;
        }
        f1(a, iMin);
    }

    @Override // androidx.recyclerview.widget.w
    public final boolean e() {
        return this.f7027u == 0;
    }

    @Override // androidx.recyclerview.widget.w
    public final void e0() {
        this.f7013C.a();
        u0();
    }

    public final void e1(A a, int i10) {
        for (int iW = w() - 1; iW >= 0; iW--) {
            View viewV = v(iW);
            if (this.f7025s.e(viewV) < i10 || this.f7025s.o(viewV) < i10) {
                return;
            }
            L l4 = (L) viewV.getLayoutParams();
            l4.getClass();
            if (((ArrayList) l4.f2254w.f2259f).size() == 1) {
                return;
            }
            M m2 = l4.f2254w;
            ArrayList arrayList = (ArrayList) m2.f2259f;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            L l10 = (L) view.getLayoutParams();
            l10.f2254w = null;
            if (l10.f7135s.j() || l10.f7135s.m()) {
                m2.f2257d -= ((StaggeredGridLayoutManager) m2.f2260g).f7025s.c(view);
            }
            if (size == 1) {
                m2.f2255b = Integer.MIN_VALUE;
            }
            m2.f2256c = Integer.MIN_VALUE;
            s0(viewV, a);
        }
    }

    @Override // androidx.recyclerview.widget.w
    public final boolean f() {
        return this.f7027u == 1;
    }

    @Override // androidx.recyclerview.widget.w
    public final void f0(int i10, int i11) {
        W0(i10, i11, 8);
    }

    public final void f1(A a, int i10) {
        while (w() > 0) {
            View viewV = v(0);
            if (this.f7025s.b(viewV) > i10 || this.f7025s.n(viewV) > i10) {
                return;
            }
            L l4 = (L) viewV.getLayoutParams();
            l4.getClass();
            if (((ArrayList) l4.f2254w.f2259f).size() == 1) {
                return;
            }
            M m2 = l4.f2254w;
            ArrayList arrayList = (ArrayList) m2.f2259f;
            View view = (View) arrayList.remove(0);
            L l10 = (L) view.getLayoutParams();
            l10.f2254w = null;
            if (arrayList.size() == 0) {
                m2.f2256c = Integer.MIN_VALUE;
            }
            if (l10.f7135s.j() || l10.f7135s.m()) {
                m2.f2257d -= ((StaggeredGridLayoutManager) m2.f2260g).f7025s.c(view);
            }
            m2.f2255b = Integer.MIN_VALUE;
            s0(viewV, a);
        }
    }

    @Override // androidx.recyclerview.widget.w
    public final boolean g(x xVar) {
        return xVar instanceof L;
    }

    @Override // androidx.recyclerview.widget.w
    public final void g0(int i10, int i11) {
        W0(i10, i11, 2);
    }

    public final void g1() {
        if (this.f7027u == 1 || !Y0()) {
            this.f7031y = this.f7030x;
        } else {
            this.f7031y = !this.f7030x;
        }
    }

    public final int h1(int i10, J0.D d3, A a) {
        if (w() == 0 || i10 == 0) {
            return 0;
        }
        c1(i10, d3);
        C0260j c0260j = this.f7029w;
        int iN0 = N0(a, c0260j, d3);
        if (c0260j.f2312b >= iN0) {
            i10 = i10 < 0 ? -iN0 : iN0;
        }
        this.f7025s.p(-i10);
        this.f7015E = this.f7031y;
        c0260j.f2312b = 0;
        d1(a, c0260j);
        return i10;
    }

    @Override // androidx.recyclerview.widget.w
    public final void i(int i10, int i11, J0.D d3, C0256f c0256f) {
        C0260j c0260j;
        int iH;
        int iJ;
        if (this.f7027u != 0) {
            i10 = i11;
        }
        if (w() == 0 || i10 == 0) {
            return;
        }
        c1(i10, d3);
        int[] iArr = this.f7021K;
        if (iArr == null || iArr.length < this.f7023q) {
            this.f7021K = new int[this.f7023q];
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = this.f7023q;
            c0260j = this.f7029w;
            if (i12 >= i14) {
                break;
            }
            if (c0260j.f2314d == -1) {
                iH = c0260j.f2316f;
                iJ = this.f7024r[i12].j(iH);
            } else {
                iH = this.f7024r[i12].h(c0260j.f2317g);
                iJ = c0260j.f2317g;
            }
            int i15 = iH - iJ;
            if (i15 >= 0) {
                this.f7021K[i13] = i15;
                i13++;
            }
            i12++;
        }
        Arrays.sort(this.f7021K, 0, i13);
        for (int i16 = 0; i16 < i13; i16++) {
            int i17 = c0260j.f2313c;
            if (i17 < 0 || i17 >= d3.b()) {
                return;
            }
            c0256f.b(c0260j.f2313c, this.f7021K[i16]);
            c0260j.f2313c += c0260j.f2314d;
        }
    }

    @Override // androidx.recyclerview.widget.w
    public final void i0(RecyclerView recyclerView, int i10, int i11) {
        W0(i10, i11, 4);
    }

    public final void i1(int i10) {
        C0260j c0260j = this.f7029w;
        c0260j.f2315e = i10;
        c0260j.f2314d = this.f7031y != (i10 == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.w
    public final void j0(A a, J0.D d3) {
        a1(a, d3, true);
    }

    public final void j1(int i10, J0.D d3) {
        int iL;
        int iL2;
        int i11;
        C0260j c0260j = this.f7029w;
        boolean z6 = false;
        c0260j.f2312b = 0;
        c0260j.f2313c = i10;
        C0263m c0263m = this.f7124e;
        if (!(c0263m != null && c0263m.f2330e) || (i11 = d3.a) == -1) {
            iL = 0;
            iL2 = 0;
        } else {
            if (this.f7031y == (i11 < i10)) {
                iL = this.f7025s.l();
                iL2 = 0;
            } else {
                iL2 = this.f7025s.l();
                iL = 0;
            }
        }
        RecyclerView recyclerView = this.f7121b;
        if (recyclerView == null || !recyclerView.f6988z) {
            c0260j.f2317g = this.f7025s.f() + iL;
            c0260j.f2316f = -iL2;
        } else {
            c0260j.f2316f = this.f7025s.k() - iL2;
            c0260j.f2317g = this.f7025s.g() + iL;
        }
        c0260j.f2318h = false;
        c0260j.a = true;
        if (this.f7025s.i() == 0 && this.f7025s.f() == 0) {
            z6 = true;
        }
        c0260j.f2319i = z6;
    }

    @Override // androidx.recyclerview.widget.w
    public final int k(J0.D d3) {
        return K0(d3);
    }

    @Override // androidx.recyclerview.widget.w
    public final void k0(J0.D d3) {
        this.f7011A = -1;
        this.f7012B = Integer.MIN_VALUE;
        this.f7017G = null;
        this.f7019I.a();
    }

    public final void k1(M m2, int i10, int i11) {
        int i12 = m2.f2257d;
        int i13 = m2.f2258e;
        if (i10 != -1) {
            int i14 = m2.f2256c;
            if (i14 == Integer.MIN_VALUE) {
                m2.a();
                i14 = m2.f2256c;
            }
            if (i14 - i12 >= i11) {
                this.f7032z.set(i13, false);
                return;
            }
            return;
        }
        int i15 = m2.f2255b;
        if (i15 == Integer.MIN_VALUE) {
            View view = (View) ((ArrayList) m2.f2259f).get(0);
            L l4 = (L) view.getLayoutParams();
            m2.f2255b = ((StaggeredGridLayoutManager) m2.f2260g).f7025s.e(view);
            l4.getClass();
            i15 = m2.f2255b;
        }
        if (i15 + i12 <= i11) {
            this.f7032z.set(i13, false);
        }
    }

    @Override // androidx.recyclerview.widget.w
    public final int l(J0.D d3) {
        return L0(d3);
    }

    @Override // androidx.recyclerview.widget.w
    public final void l0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f7017G = savedState;
            if (this.f7011A != -1) {
                savedState.f7042v = null;
                savedState.f7041u = 0;
                savedState.f7039s = -1;
                savedState.f7040t = -1;
                savedState.f7042v = null;
                savedState.f7041u = 0;
                savedState.f7043w = 0;
                savedState.f7044x = null;
                savedState.f7045y = null;
            }
            u0();
        }
    }

    @Override // androidx.recyclerview.widget.w
    public final int m(J0.D d3) {
        return M0(d3);
    }

    @Override // androidx.recyclerview.widget.w
    public final Parcelable m0() {
        int iJ;
        int iK;
        int[] iArr;
        SavedState savedState = this.f7017G;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.f7041u = savedState.f7041u;
            savedState2.f7039s = savedState.f7039s;
            savedState2.f7040t = savedState.f7040t;
            savedState2.f7042v = savedState.f7042v;
            savedState2.f7043w = savedState.f7043w;
            savedState2.f7044x = savedState.f7044x;
            savedState2.f7046z = savedState.f7046z;
            savedState2.f7037A = savedState.f7037A;
            savedState2.f7038B = savedState.f7038B;
            savedState2.f7045y = savedState.f7045y;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        savedState3.f7046z = this.f7030x;
        savedState3.f7037A = this.f7015E;
        savedState3.f7038B = this.f7016F;
        G g8 = this.f7013C;
        if (g8 == null || (iArr = g8.a) == null) {
            savedState3.f7043w = 0;
        } else {
            savedState3.f7044x = iArr;
            savedState3.f7043w = iArr.length;
            savedState3.f7045y = g8.f6882b;
        }
        if (w() <= 0) {
            savedState3.f7039s = -1;
            savedState3.f7040t = -1;
            savedState3.f7041u = 0;
            return savedState3;
        }
        savedState3.f7039s = this.f7015E ? T0() : S0();
        View viewO0 = this.f7031y ? O0(true) : P0(true);
        savedState3.f7040t = viewO0 != null ? w.M(viewO0) : -1;
        int i10 = this.f7023q;
        savedState3.f7041u = i10;
        savedState3.f7042v = new int[i10];
        for (int i11 = 0; i11 < this.f7023q; i11++) {
            if (this.f7015E) {
                iJ = this.f7024r[i11].h(Integer.MIN_VALUE);
                if (iJ != Integer.MIN_VALUE) {
                    iK = this.f7025s.g();
                    iJ -= iK;
                }
            } else {
                iJ = this.f7024r[i11].j(Integer.MIN_VALUE);
                if (iJ != Integer.MIN_VALUE) {
                    iK = this.f7025s.k();
                    iJ -= iK;
                }
            }
            savedState3.f7042v[i11] = iJ;
        }
        return savedState3;
    }

    @Override // androidx.recyclerview.widget.w
    public final int n(J0.D d3) {
        return K0(d3);
    }

    @Override // androidx.recyclerview.widget.w
    public final void n0(int i10) {
        if (i10 == 0) {
            J0();
        }
    }

    @Override // androidx.recyclerview.widget.w
    public final int o(J0.D d3) {
        return L0(d3);
    }

    @Override // androidx.recyclerview.widget.w
    public final int p(J0.D d3) {
        return M0(d3);
    }

    @Override // androidx.recyclerview.widget.w
    public final x s() {
        return this.f7027u == 0 ? new L(-2, -1) : new L(-1, -2);
    }

    @Override // androidx.recyclerview.widget.w
    public final x t(Context context, AttributeSet attributeSet) {
        return new L(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.w
    public final x u(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new L((ViewGroup.MarginLayoutParams) layoutParams) : new L(layoutParams);
    }

    @Override // androidx.recyclerview.widget.w
    public final int v0(int i10, J0.D d3, A a) {
        return h1(i10, d3, a);
    }

    @Override // androidx.recyclerview.widget.w
    public final void w0(int i10) {
        SavedState savedState = this.f7017G;
        if (savedState != null && savedState.f7039s != i10) {
            savedState.f7042v = null;
            savedState.f7041u = 0;
            savedState.f7039s = -1;
            savedState.f7040t = -1;
        }
        this.f7011A = i10;
        this.f7012B = Integer.MIN_VALUE;
        u0();
    }

    @Override // androidx.recyclerview.widget.w
    public final int x0(int i10, J0.D d3, A a) {
        return h1(i10, d3, a);
    }
}
