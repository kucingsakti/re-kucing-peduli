package com.google.android.flexbox;

import J0.AbstractC0266p;
import J0.C;
import J0.C0263m;
import J0.C0265o;
import J0.D;
import J0.y;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.A;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.w;
import androidx.recyclerview.widget.x;
import java.util.ArrayList;
import java.util.List;
import p067g9.g;

/* JADX INFO: loaded from: classes.dex */
public class FlexboxLayoutManager extends w implements C {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final Rect f7700O = new Rect();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public p189t2.c f7701A;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public AbstractC0266p f7703C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public AbstractC0266p f7704D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public SavedState f7705E;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final Context f7711K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public View f7712L;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f7715q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f7716r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f7717s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f7719u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f7720v;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public A f7723y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public D f7724z;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f7718t = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f7721w = new ArrayList();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final a f7722x = new a(this);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final p189t2.b f7702B = new p189t2.b(this);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f7706F = -1;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f7707G = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f7708H = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f7709I = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final SparseArray f7710J = new SparseArray();

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f7713M = -1;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final g f7714N = new g();

    public static class LayoutParams extends x implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new b();

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public int f7725A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f7726B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public int f7727C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public int f7728D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public boolean f7729E;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public float f7730w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public float f7731x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f7732y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public float f7733z;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeFloat(this.f7730w);
            parcel.writeFloat(this.f7731x);
            parcel.writeInt(this.f7732y);
            parcel.writeFloat(this.f7733z);
            parcel.writeInt(this.f7725A);
            parcel.writeInt(this.f7726B);
            parcel.writeInt(this.f7727C);
            parcel.writeInt(this.f7728D);
            parcel.writeByte(this.f7729E ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new c();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f7734s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f7735t;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "SavedState{mAnchorPosition=" + this.f7734s + ", mAnchorOffset=" + this.f7735t + '}';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f7734s);
            parcel.writeInt(this.f7735t);
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        y yVarN = w.N(context, attributeSet, i10, i11);
        int i12 = yVarN.a;
        if (i12 != 0) {
            if (i12 == 1) {
                if (yVarN.f2354c) {
                    d1(3);
                } else {
                    d1(2);
                }
            }
        } else if (yVarN.f2354c) {
            d1(1);
        } else {
            d1(0);
        }
        int i13 = this.f7716r;
        if (i13 != 1) {
            if (i13 == 0) {
                p0();
                this.f7721w.clear();
                p189t2.b bVar = this.f7702B;
                p189t2.b.b(bVar);
                bVar.f15154d = 0;
            }
            this.f7716r = 1;
            this.f7703C = null;
            this.f7704D = null;
            u0();
        }
        if (this.f7717s != 4) {
            p0();
            this.f7721w.clear();
            p189t2.b bVar2 = this.f7702B;
            p189t2.b.b(bVar2);
            bVar2.f15154d = 0;
            this.f7717s = 4;
            u0();
        }
        this.f7127h = true;
        this.f7711K = context;
    }

    public static boolean R(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (i12 > 0 && i10 != i12) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i10;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i10;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.w
    public final void G0(RecyclerView recyclerView, int i10) {
        C0263m c0263m = new C0263m(recyclerView.getContext());
        c0263m.a = i10;
        H0(c0263m);
    }

    public final int J0(D d3) {
        if (w() == 0) {
            return 0;
        }
        int iB = d3.b();
        M0();
        View viewO0 = O0(iB);
        View viewQ0 = Q0(iB);
        if (d3.b() == 0 || viewO0 == null || viewQ0 == null) {
            return 0;
        }
        return Math.min(this.f7703C.l(), this.f7703C.b(viewQ0) - this.f7703C.e(viewO0));
    }

    public final int K0(D d3) {
        if (w() == 0) {
            return 0;
        }
        int iB = d3.b();
        View viewO0 = O0(iB);
        View viewQ0 = Q0(iB);
        if (d3.b() == 0 || viewO0 == null || viewQ0 == null) {
            return 0;
        }
        int iM = w.M(viewO0);
        int iM2 = w.M(viewQ0);
        int iAbs = Math.abs(this.f7703C.b(viewQ0) - this.f7703C.e(viewO0));
        int[] iArr = this.f7722x.f7737c;
        int i10 = iArr[iM];
        if (i10 == 0 || i10 == -1) {
            return 0;
        }
        return Math.round((i10 * (iAbs / ((iArr[iM2] - i10) + 1))) + (this.f7703C.k() - this.f7703C.e(viewO0)));
    }

    public final int L0(D d3) {
        if (w() != 0) {
            int iB = d3.b();
            View viewO0 = O0(iB);
            View viewQ0 = Q0(iB);
            if (d3.b() != 0 && viewO0 != null && viewQ0 != null) {
                View viewS0 = S0(0, w());
                int iM = viewS0 == null ? -1 : w.M(viewS0);
                View viewS1 = S0(w() - 1, -1);
                return (int) ((Math.abs(this.f7703C.b(viewQ0) - this.f7703C.e(viewO0)) / (((viewS1 != null ? w.M(viewS1) : -1) - iM) + 1)) * d3.b());
            }
        }
        return 0;
    }

    public final void M0() {
        if (this.f7703C != null) {
            return;
        }
        if (b1()) {
            if (this.f7716r == 0) {
                this.f7703C = new C0265o(this, 0);
                this.f7704D = new C0265o(this, 1);
                return;
            } else {
                this.f7703C = new C0265o(this, 1);
                this.f7704D = new C0265o(this, 0);
                return;
            }
        }
        if (this.f7716r == 0) {
            this.f7703C = new C0265o(this, 1);
            this.f7704D = new C0265o(this, 0);
        } else {
            this.f7703C = new C0265o(this, 0);
            this.f7704D = new C0265o(this, 1);
        }
    }

    public final int N0(A a, D d3, p189t2.c cVar) {
        int i10;
        boolean z6;
        int i11;
        int i12;
        int i13;
        int i14;
        Rect rect;
        int i15;
        int i16;
        int i17;
        Rect rect2;
        int i18 = cVar.f15163f;
        if (i18 != Integer.MIN_VALUE) {
            int i19 = cVar.a;
            if (i19 < 0) {
                cVar.f15163f = i18 + i19;
            }
            c1(a, cVar);
        }
        int i20 = cVar.a;
        boolean zB1 = b1();
        int i21 = i20;
        int i22 = 0;
        while (true) {
            if (i21 <= 0 && !this.f7701A.f15159b) {
                break;
            }
            List list = this.f7721w;
            int i23 = cVar.f15161d;
            if (i23 < 0 || i23 >= d3.b() || (i10 = cVar.f15160c) < 0 || i10 >= list.size()) {
                break;
            }
            p189t2.a aVar = (p189t2.a) this.f7721w.get(cVar.f15160c);
            cVar.f15161d = aVar.f15148k;
            boolean zB2 = b1();
            p189t2.b bVar = this.f7702B;
            a aVar2 = this.f7722x;
            Rect rect3 = f7700O;
            if (zB2) {
                int iJ = J();
                int iK = K();
                int i24 = this.f7133o;
                int i25 = cVar.f15162e;
                if (cVar.f15165h == -1) {
                    i25 -= aVar.f15141c;
                }
                int i26 = i25;
                int i27 = cVar.f15161d;
                float f10 = bVar.f15154d;
                float measuredWidth = iJ - f10;
                float measuredWidth2 = (i24 - iK) - f10;
                float fMax = Math.max(0.0f, 0.0f);
                int i28 = aVar.f15142d;
                int i29 = i27;
                int i30 = 0;
                while (i29 < i27 + i28) {
                    int i31 = i29;
                    View viewX0 = X0(i31);
                    boolean z10 = zB1;
                    if (cVar.f15165h == 1) {
                        d(rect3, viewX0);
                        b(viewX0, -1, false);
                    } else {
                        d(rect3, viewX0);
                        b(viewX0, i30, false);
                        i30++;
                    }
                    float f11 = measuredWidth2;
                    long j = aVar2.f7738d[i31];
                    int i32 = (int) j;
                    int i33 = (int) (j >> 32);
                    LayoutParams layoutParams = (LayoutParams) viewX0.getLayoutParams();
                    if (e1(viewX0, i32, i33, layoutParams)) {
                        viewX0.measure(i32, i33);
                    }
                    float f12 = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((x) viewX0.getLayoutParams()).f7136t.left;
                    float f13 = f11 - (((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + ((x) viewX0.getLayoutParams()).f7136t.right);
                    int i34 = i26 + ((x) viewX0.getLayoutParams()).f7136t.top;
                    int i35 = i30;
                    if (this.f7719u) {
                        rect2 = rect3;
                        this.f7722x.k(viewX0, aVar, Math.round(f13) - viewX0.getMeasuredWidth(), i34, Math.round(f13), viewX0.getMeasuredHeight() + i34);
                    } else {
                        rect2 = rect3;
                        this.f7722x.k(viewX0, aVar, Math.round(f12), i34, viewX0.getMeasuredWidth() + Math.round(f12), viewX0.getMeasuredHeight() + i34);
                    }
                    measuredWidth = f12 + viewX0.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + ((x) viewX0.getLayoutParams()).f7136t.right + fMax;
                    measuredWidth2 = f13 - (((viewX0.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) + ((x) viewX0.getLayoutParams()).f7136t.left) + fMax);
                    i29 = i31 + 1;
                    aVar2 = aVar2;
                    i27 = i27;
                    zB1 = z10;
                    i30 = i35;
                    i28 = i28;
                    rect3 = rect2;
                }
                z6 = zB1;
                cVar.f15160c += this.f7701A.f15165h;
                i14 = aVar.f15141c;
                i13 = i21;
            } else {
                z6 = zB1;
                a aVar3 = aVar2;
                Rect rect4 = rect3;
                int iL = L();
                int I2 = I();
                int i36 = this.f7134p;
                int i37 = cVar.f15162e;
                if (cVar.f15165h == -1) {
                    int i38 = aVar.f15141c;
                    i12 = i37 + i38;
                    i11 = i37 - i38;
                } else {
                    i11 = i37;
                    i12 = i11;
                }
                int i39 = cVar.f15161d;
                float f14 = i36 - I2;
                float f15 = bVar.f15154d;
                float f16 = iL - f15;
                float f17 = f14 - f15;
                float fMax2 = Math.max(0.0f, 0.0f);
                int i40 = aVar.f15142d;
                float measuredHeight = f17;
                int i41 = i39;
                int i42 = 0;
                while (i41 < i39 + i40) {
                    int i43 = i39;
                    View viewX1 = X0(i41);
                    a aVar4 = aVar3;
                    float f18 = f16;
                    long j10 = aVar3.f7738d[i41];
                    int i44 = (int) j10;
                    int i45 = (int) (j10 >> 32);
                    LayoutParams layoutParams2 = (LayoutParams) viewX1.getLayoutParams();
                    if (e1(viewX1, i44, i45, layoutParams2)) {
                        viewX1.measure(i44, i45);
                    }
                    float f19 = f18 + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((x) viewX1.getLayoutParams()).f7136t.top;
                    float f20 = measuredHeight - (((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin + ((x) viewX1.getLayoutParams()).f7136t.bottom);
                    if (cVar.f15165h == 1) {
                        rect = rect4;
                        d(rect, viewX1);
                        b(viewX1, -1, false);
                    } else {
                        rect = rect4;
                        d(rect, viewX1);
                        b(viewX1, i42, false);
                        i42++;
                    }
                    int i46 = i11 + ((x) viewX1.getLayoutParams()).f7136t.left;
                    int i47 = i12 - ((x) viewX1.getLayoutParams()).f7136t.right;
                    boolean z11 = this.f7719u;
                    if (!z11) {
                        i15 = i40;
                        i16 = i41;
                        i17 = i43;
                        if (this.f7720v) {
                            this.f7722x.l(viewX1, aVar, z11, i46, Math.round(f20) - viewX1.getMeasuredHeight(), viewX1.getMeasuredWidth() + i46, Math.round(f20));
                        } else {
                            this.f7722x.l(viewX1, aVar, z11, i46, Math.round(f19), viewX1.getMeasuredWidth() + i46, viewX1.getMeasuredHeight() + Math.round(f19));
                        }
                    } else if (this.f7720v) {
                        i15 = i40;
                        i17 = i43;
                        i16 = i41;
                        this.f7722x.l(viewX1, aVar, z11, i47 - viewX1.getMeasuredWidth(), Math.round(f20) - viewX1.getMeasuredHeight(), i47, Math.round(f20));
                    } else {
                        i15 = i40;
                        i16 = i41;
                        i17 = i43;
                        this.f7722x.l(viewX1, aVar, z11, i47 - viewX1.getMeasuredWidth(), Math.round(f19), i47, viewX1.getMeasuredHeight() + Math.round(f19));
                    }
                    float measuredHeight2 = viewX1.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((x) viewX1.getLayoutParams()).f7136t.bottom + fMax2 + f19;
                    measuredHeight = f20 - (((viewX1.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin) + ((x) viewX1.getLayoutParams()).f7136t.top) + fMax2);
                    i41 = i16 + 1;
                    f16 = measuredHeight2;
                    rect4 = rect;
                    i39 = i17;
                    i21 = i21;
                    aVar3 = aVar4;
                    i40 = i15;
                }
                i13 = i21;
                cVar.f15160c += this.f7701A.f15165h;
                i14 = aVar.f15141c;
            }
            i22 += i14;
            if (z6 || !this.f7719u) {
                cVar.f15162e = (aVar.f15141c * cVar.f15165h) + cVar.f15162e;
            } else {
                cVar.f15162e -= aVar.f15141c * cVar.f15165h;
            }
            i21 = i13 - aVar.f15141c;
            i20 = i20;
            zB1 = z6;
        }
        int i48 = i20;
        int i49 = cVar.a - i22;
        cVar.a = i49;
        int i50 = cVar.f15163f;
        if (i50 != Integer.MIN_VALUE) {
            int i51 = i50 + i22;
            cVar.f15163f = i51;
            if (i49 < 0) {
                cVar.f15163f = i51 + i49;
            }
            c1(a, cVar);
        }
        return i48 - cVar.a;
    }

    public final View O0(int i10) {
        View viewT0 = T0(0, w(), i10);
        if (viewT0 == null) {
            return null;
        }
        int i11 = this.f7722x.f7737c[w.M(viewT0)];
        if (i11 == -1) {
            return null;
        }
        return P0(viewT0, (p189t2.a) this.f7721w.get(i11));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    public final View P0(View view, p189t2.a aVar) {
        boolean zB1 = b1();
        int i10 = aVar.f15142d;
        for (int i11 = 1; i11 < i10; i11++) {
            View viewV = v(i11);
            if (viewV != null && viewV.getVisibility() != 8) {
                if (!this.f7719u || zB1) {
                    if (this.f7703C.e(view) > this.f7703C.e(viewV)) {
                        view = viewV;
                    }
                } else if (this.f7703C.b(view) < this.f7703C.b(viewV)) {
                    view = viewV;
                }
            }
        }
        return view;
    }

    public final View Q0(int i10) {
        View viewT0 = T0(w() - 1, -1, i10);
        if (viewT0 == null) {
            return null;
        }
        return R0(viewT0, (p189t2.a) this.f7721w.get(this.f7722x.f7737c[w.M(viewT0)]));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    public final View R0(View view, p189t2.a aVar) {
        boolean zB1 = b1();
        int iW = (w() - aVar.f15142d) - 1;
        for (int iW2 = w() - 2; iW2 > iW; iW2--) {
            View viewV = v(iW2);
            if (viewV != null && viewV.getVisibility() != 8) {
                if (!this.f7719u || zB1) {
                    if (this.f7703C.b(view) < this.f7703C.b(viewV)) {
                        view = viewV;
                    }
                } else if (this.f7703C.e(view) > this.f7703C.e(viewV)) {
                    view = viewV;
                }
            }
        }
        return view;
    }

    public final View S0(int i10, int i11) {
        int i12 = i11 > i10 ? 1 : -1;
        while (i10 != i11) {
            View viewV = v(i10);
            int iJ = J();
            int iL = L();
            int iK = this.f7133o - K();
            int I2 = this.f7134p - I();
            int iB = w.B(viewV) - ((ViewGroup.MarginLayoutParams) ((x) viewV.getLayoutParams())).leftMargin;
            int iF = w.F(viewV) - ((ViewGroup.MarginLayoutParams) ((x) viewV.getLayoutParams())).topMargin;
            int iE = w.E(viewV) + ((ViewGroup.MarginLayoutParams) ((x) viewV.getLayoutParams())).rightMargin;
            int iZ = w.z(viewV) + ((ViewGroup.MarginLayoutParams) ((x) viewV.getLayoutParams())).bottomMargin;
            boolean z6 = iB >= iK || iE >= iJ;
            boolean z10 = iF >= I2 || iZ >= iL;
            if (z6 && z10) {
                return viewV;
            }
            i10 += i12;
        }
        return null;
    }

    public final View T0(int i10, int i11, int i12) {
        M0();
        if (this.f7701A == null) {
            p189t2.c cVar = new p189t2.c();
            cVar.f15165h = 1;
            this.f7701A = cVar;
        }
        int iK = this.f7703C.k();
        int iG = this.f7703C.g();
        int i13 = i11 <= i10 ? -1 : 1;
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View viewV = v(i10);
            int iM = w.M(viewV);
            if (iM >= 0 && iM < i12) {
                if (((x) viewV.getLayoutParams()).f7135s.j()) {
                    if (view2 == null) {
                        view2 = viewV;
                    }
                } else {
                    if (this.f7703C.e(viewV) >= iK && this.f7703C.b(viewV) <= iG) {
                        return viewV;
                    }
                    if (view == null) {
                        view = viewV;
                    }
                }
            }
            i10 += i13;
        }
        return view != null ? view : view2;
    }

    public final int U0(int i10, A a, D d3, boolean z6) {
        int iZ0;
        int iG;
        if (b1() || !this.f7719u) {
            int iG2 = this.f7703C.g() - i10;
            if (iG2 <= 0) {
                return 0;
            }
            iZ0 = -Z0(-iG2, d3, a);
        } else {
            int iK = i10 - this.f7703C.k();
            if (iK <= 0) {
                return 0;
            }
            iZ0 = Z0(iK, d3, a);
        }
        int i11 = i10 + iZ0;
        if (!z6 || (iG = this.f7703C.g() - i11) <= 0) {
            return iZ0;
        }
        this.f7703C.p(iG);
        return iG + iZ0;
    }

    @Override // androidx.recyclerview.widget.w
    public final void V() {
        p0();
    }

    public final int V0(int i10, A a, D d3, boolean z6) {
        int iZ0;
        int iK;
        if (b1() || !this.f7719u) {
            int iK2 = i10 - this.f7703C.k();
            if (iK2 <= 0) {
                return 0;
            }
            iZ0 = -Z0(iK2, d3, a);
        } else {
            int iG = this.f7703C.g() - i10;
            if (iG <= 0) {
                return 0;
            }
            iZ0 = Z0(-iG, d3, a);
        }
        int i11 = i10 + iZ0;
        if (!z6 || (iK = i11 - this.f7703C.k()) <= 0) {
            return iZ0;
        }
        this.f7703C.p(-iK);
        return iZ0 - iK;
    }

    @Override // androidx.recyclerview.widget.w
    public final void W(RecyclerView recyclerView) {
        this.f7712L = (View) recyclerView.getParent();
    }

    public final int W0(View view) {
        return b1() ? ((x) view.getLayoutParams()).f7136t.top + ((x) view.getLayoutParams()).f7136t.bottom : ((x) view.getLayoutParams()).f7136t.left + ((x) view.getLayoutParams()).f7136t.right;
    }

    public final View X0(int i10) {
        View view = (View) this.f7710J.get(i10);
        return view != null ? view : this.f7723y.k(i10, Long.MAX_VALUE).f7003s;
    }

    public final int Y0() {
        if (this.f7721w.size() == 0) {
            return 0;
        }
        int size = this.f7721w.size();
        int iMax = Integer.MIN_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            iMax = Math.max(iMax, ((p189t2.a) this.f7721w.get(i10)).a);
        }
        return iMax;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x01df  */
    public final int Z0(int i10, D d3, A a) {
        int i11;
        if (w() != 0 && i10 != 0) {
            M0();
            this.f7701A.f15166i = true;
            boolean z6 = !b1() && this.f7719u;
            int i12 = (!z6 ? i10 > 0 : i10 < 0) ? -1 : 1;
            int iAbs = Math.abs(i10);
            this.f7701A.f15165h = i12;
            boolean zB1 = b1();
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f7133o, this.f7131m);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.f7134p, this.f7132n);
            boolean z10 = !zB1 && this.f7719u;
            a aVar = this.f7722x;
            if (i12 == 1) {
                View viewV = v(w() - 1);
                this.f7701A.f15162e = this.f7703C.b(viewV);
                int iM = w.M(viewV);
                View viewR0 = R0(viewV, (p189t2.a) this.f7721w.get(aVar.f7737c[iM]));
                p189t2.c cVar = this.f7701A;
                cVar.getClass();
                int i13 = iM + 1;
                cVar.f15161d = i13;
                int[] iArr = aVar.f7737c;
                if (iArr.length <= i13) {
                    cVar.f15160c = -1;
                } else {
                    cVar.f15160c = iArr[i13];
                }
                if (z10) {
                    cVar.f15162e = this.f7703C.e(viewR0);
                    this.f7701A.f15163f = this.f7703C.k() + (-this.f7703C.e(viewR0));
                    p189t2.c cVar2 = this.f7701A;
                    int i14 = cVar2.f15163f;
                    if (i14 < 0) {
                        i14 = 0;
                    }
                    cVar2.f15163f = i14;
                } else {
                    cVar.f15162e = this.f7703C.b(viewR0);
                    this.f7701A.f15163f = this.f7703C.b(viewR0) - this.f7703C.g();
                }
                int i15 = this.f7701A.f15160c;
                if ((i15 == -1 || i15 > this.f7721w.size() - 1) && this.f7701A.f15161d <= this.f7724z.b()) {
                    p189t2.c cVar3 = this.f7701A;
                    int i16 = iAbs - cVar3.f15163f;
                    g gVar = this.f7714N;
                    gVar.a = null;
                    if (i16 > 0) {
                        if (zB1) {
                            this.f7722x.a(gVar, iMakeMeasureSpec, iMakeMeasureSpec2, i16, cVar3.f15161d, -1, this.f7721w);
                        } else {
                            this.f7722x.a(gVar, iMakeMeasureSpec2, iMakeMeasureSpec, i16, cVar3.f15161d, -1, this.f7721w);
                            iMakeMeasureSpec2 = iMakeMeasureSpec2;
                            iMakeMeasureSpec = iMakeMeasureSpec;
                        }
                        aVar.d(iMakeMeasureSpec, iMakeMeasureSpec2, this.f7701A.f15161d);
                        aVar.p(this.f7701A.f15161d);
                    }
                }
            } else {
                View viewV2 = v(0);
                this.f7701A.f15162e = this.f7703C.e(viewV2);
                int iM2 = w.M(viewV2);
                View viewP0 = P0(viewV2, (p189t2.a) this.f7721w.get(aVar.f7737c[iM2]));
                p189t2.c cVar4 = this.f7701A;
                cVar4.getClass();
                int i17 = aVar.f7737c[iM2];
                if (i17 == -1) {
                    i17 = 0;
                }
                if (i17 > 0) {
                    this.f7701A.f15161d = iM2 - ((p189t2.a) this.f7721w.get(i17 - 1)).f15142d;
                } else {
                    cVar4.f15161d = -1;
                }
                p189t2.c cVar5 = this.f7701A;
                cVar5.f15160c = i17 > 0 ? i17 - 1 : 0;
                if (z10) {
                    cVar5.f15162e = this.f7703C.b(viewP0);
                    this.f7701A.f15163f = this.f7703C.b(viewP0) - this.f7703C.g();
                    p189t2.c cVar6 = this.f7701A;
                    int i18 = cVar6.f15163f;
                    if (i18 < 0) {
                        i18 = 0;
                    }
                    cVar6.f15163f = i18;
                } else {
                    cVar5.f15162e = this.f7703C.e(viewP0);
                    this.f7701A.f15163f = this.f7703C.k() + (-this.f7703C.e(viewP0));
                }
            }
            p189t2.c cVar7 = this.f7701A;
            int i19 = cVar7.f15163f;
            cVar7.a = iAbs - i19;
            int iN0 = N0(a, d3, cVar7) + i19;
            if (iN0 >= 0) {
                if (z6) {
                    if (iAbs > iN0) {
                        i11 = (-i12) * iN0;
                    } else {
                        i11 = i10;
                    }
                } else if (iAbs > iN0) {
                    i11 = i12 * iN0;
                } else {
                    i11 = i10;
                }
                this.f7703C.p(-i11);
                this.f7701A.f15164g = i11;
                return i11;
            }
        }
        return 0;
    }

    @Override // J0.C
    public final PointF a(int i10) {
        if (w() == 0) {
            return null;
        }
        int i11 = i10 < w.M(v(0)) ? -1 : 1;
        return b1() ? new PointF(0.0f, i11) : new PointF(i11, 0.0f);
    }

    public final int a1(int i10) {
        if (w() == 0 || i10 == 0) {
            return 0;
        }
        M0();
        boolean zB1 = b1();
        View view = this.f7712L;
        int width = zB1 ? view.getWidth() : view.getHeight();
        int i11 = zB1 ? this.f7133o : this.f7134p;
        int iH = H();
        p189t2.b bVar = this.f7702B;
        if (iH == 1) {
            int iAbs = Math.abs(i10);
            if (i10 < 0) {
                return -Math.min((i11 + bVar.f15154d) - width, iAbs);
            }
            int i12 = bVar.f15154d;
            if (i12 + i10 > 0) {
                return -i12;
            }
        } else {
            if (i10 > 0) {
                return Math.min((i11 - bVar.f15154d) - width, i10);
            }
            int i13 = bVar.f15154d;
            if (i13 + i10 < 0) {
                return -i13;
            }
        }
        return i10;
    }

    public final boolean b1() {
        int i10 = this.f7715q;
        return i10 == 0 || i10 == 1;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Code duplicated, block: B:29:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:74:0x006f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x010a A[SYNTHETIC] */
    public final void c1(A a, p189t2.c cVar) {
        int iW;
        if (cVar.f15166i) {
            int i10 = cVar.f15165h;
            int i11 = -1;
            a aVar = this.f7722x;
            if (i10 != -1) {
                if (cVar.f15163f >= 0 && (iW = w()) != 0) {
                    int i12 = aVar.f7737c[w.M(v(0))];
                    if (i12 == -1) {
                        return;
                    }
                    p189t2.a aVar2 = (p189t2.a) this.f7721w.get(i12);
                    for (int i13 = 0; i13 < iW; i13++) {
                        View viewV = v(i13);
                        int i14 = cVar.f15163f;
                        if (!b1() && this.f7719u) {
                            if (this.f7703C.f() - this.f7703C.e(viewV) > i14) {
                                break;
                            }
                            if (aVar2.f15149l != w.M(viewV)) {
                                if (i12 >= this.f7721w.size() - 1) {
                                    i11 = i13;
                                    break;
                                } else {
                                    i12 += cVar.f15165h;
                                    aVar2 = (p189t2.a) this.f7721w.get(i12);
                                    i11 = i13;
                                }
                            }
                        } else {
                            if (this.f7703C.b(viewV) > i14) {
                                break;
                            }
                            if (aVar2.f15149l != w.M(viewV)) {
                                if (i12 >= this.f7721w.size() - 1) {
                                    i11 = i13;
                                    break;
                                } else {
                                    i12 += cVar.f15165h;
                                    aVar2 = (p189t2.a) this.f7721w.get(i12);
                                    i11 = i13;
                                }
                            }
                        }
                    }
                    while (i11 >= 0) {
                        View viewV2 = v(i11);
                        if (v(i11) != null) {
                            this.a.j(i11);
                        }
                        a.h(viewV2);
                        i11--;
                    }
                    return;
                }
                return;
            }
            if (cVar.f15163f < 0) {
                return;
            }
            this.f7703C.f();
            int iW2 = w();
            if (iW2 == 0) {
                return;
            }
            int i15 = iW2 - 1;
            int i16 = aVar.f7737c[w.M(v(i15))];
            if (i16 == -1) {
                return;
            }
            p189t2.a aVar3 = (p189t2.a) this.f7721w.get(i16);
            for (int i17 = i15; i17 >= 0; i17--) {
                View viewV3 = v(i17);
                int i18 = cVar.f15163f;
                if (!b1() && this.f7719u) {
                    if (this.f7703C.b(viewV3) > i18) {
                        break;
                    }
                    if (aVar3.f15148k != w.M(viewV3)) {
                        if (i16 <= 0) {
                            iW2 = i17;
                            break;
                        } else {
                            i16 += cVar.f15165h;
                            aVar3 = (p189t2.a) this.f7721w.get(i16);
                            iW2 = i17;
                        }
                    }
                } else {
                    if (this.f7703C.e(viewV3) < this.f7703C.f() - i18) {
                        break;
                    }
                    if (aVar3.f15148k != w.M(viewV3)) {
                        if (i16 <= 0) {
                            iW2 = i17;
                            break;
                        } else {
                            i16 += cVar.f15165h;
                            aVar3 = (p189t2.a) this.f7721w.get(i16);
                            iW2 = i17;
                        }
                    }
                }
            }
            while (i15 >= iW2) {
                View viewV4 = v(i15);
                if (v(i15) != null) {
                    this.a.j(i15);
                }
                a.h(viewV4);
                i15--;
            }
        }
    }

    @Override // androidx.recyclerview.widget.w
    public final void d0(int i10, int i11) {
        f1(i10);
    }

    public final void d1(int i10) {
        if (this.f7715q != i10) {
            p0();
            this.f7715q = i10;
            this.f7703C = null;
            this.f7704D = null;
            this.f7721w.clear();
            p189t2.b bVar = this.f7702B;
            p189t2.b.b(bVar);
            bVar.f15154d = 0;
            u0();
        }
    }

    @Override // androidx.recyclerview.widget.w
    public final boolean e() {
        if (this.f7716r == 0) {
            return b1();
        }
        if (!b1()) {
            return true;
        }
        int i10 = this.f7133o;
        View view = this.f7712L;
        return i10 > (view != null ? view.getWidth() : 0);
    }

    public final boolean e1(View view, int i10, int i11, LayoutParams layoutParams) {
        return (!view.isLayoutRequested() && this.f7128i && R(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) layoutParams).width) && R(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
    }

    @Override // androidx.recyclerview.widget.w
    public final boolean f() {
        if (this.f7716r == 0) {
            return !b1();
        }
        if (!b1()) {
            int i10 = this.f7134p;
            View view = this.f7712L;
            if (i10 <= (view != null ? view.getHeight() : 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.w
    public final void f0(int i10, int i11) {
        f1(Math.min(i10, i11));
    }

    public final void f1(int i10) {
        View viewS0 = S0(w() - 1, -1);
        if (i10 >= (viewS0 != null ? w.M(viewS0) : -1)) {
            return;
        }
        int iW = w();
        a aVar = this.f7722x;
        aVar.f(iW);
        aVar.g(iW);
        aVar.e(iW);
        if (i10 >= aVar.f7737c.length) {
            return;
        }
        this.f7713M = i10;
        View viewV = v(0);
        if (viewV == null) {
            return;
        }
        this.f7706F = w.M(viewV);
        if (b1() || !this.f7719u) {
            this.f7707G = this.f7703C.e(viewV) - this.f7703C.k();
        } else {
            this.f7707G = this.f7703C.h() + this.f7703C.b(viewV);
        }
    }

    @Override // androidx.recyclerview.widget.w
    public final boolean g(x xVar) {
        return xVar instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.w
    public final void g0(int i10, int i11) {
        f1(i10);
    }

    public final void g1(p189t2.b bVar, boolean z6, boolean z10) {
        int i10;
        if (z10) {
            int i11 = b1() ? this.f7132n : this.f7131m;
            this.f7701A.f15159b = i11 == 0 || i11 == Integer.MIN_VALUE;
        } else {
            this.f7701A.f15159b = false;
        }
        if (b1() || !this.f7719u) {
            this.f7701A.a = this.f7703C.g() - bVar.f15153c;
        } else {
            this.f7701A.a = bVar.f15153c - K();
        }
        p189t2.c cVar = this.f7701A;
        cVar.f15161d = bVar.a;
        cVar.f15165h = 1;
        cVar.f15162e = bVar.f15153c;
        cVar.f15163f = Integer.MIN_VALUE;
        cVar.f15160c = bVar.f15152b;
        if (!z6 || this.f7721w.size() <= 1 || (i10 = bVar.f15152b) < 0 || i10 >= this.f7721w.size() - 1) {
            return;
        }
        p189t2.a aVar = (p189t2.a) this.f7721w.get(bVar.f15152b);
        p189t2.c cVar2 = this.f7701A;
        cVar2.f15160c++;
        cVar2.f15161d += aVar.f15142d;
    }

    @Override // androidx.recyclerview.widget.w
    public final void h0(int i10) {
        f1(i10);
    }

    public final void h1(p189t2.b bVar, boolean z6, boolean z10) {
        if (z10) {
            int i10 = b1() ? this.f7132n : this.f7131m;
            this.f7701A.f15159b = i10 == 0 || i10 == Integer.MIN_VALUE;
        } else {
            this.f7701A.f15159b = false;
        }
        if (b1() || !this.f7719u) {
            this.f7701A.a = bVar.f15153c - this.f7703C.k();
        } else {
            this.f7701A.a = (this.f7712L.getWidth() - bVar.f15153c) - this.f7703C.k();
        }
        p189t2.c cVar = this.f7701A;
        cVar.f15161d = bVar.a;
        cVar.f15165h = -1;
        cVar.f15162e = bVar.f15153c;
        cVar.f15163f = Integer.MIN_VALUE;
        int i11 = bVar.f15152b;
        cVar.f15160c = i11;
        if (!z6 || i11 <= 0) {
            return;
        }
        int size = this.f7721w.size();
        int i12 = bVar.f15152b;
        if (size > i12) {
            p189t2.a aVar = (p189t2.a) this.f7721w.get(i12);
            p189t2.c cVar2 = this.f7701A;
            cVar2.f15160c--;
            cVar2.f15161d -= aVar.f15142d;
        }
    }

    @Override // androidx.recyclerview.widget.w
    public final void i0(RecyclerView recyclerView, int i10, int i11) {
        f1(i10);
        f1(i10);
    }

    public final void i1(View view, int i10) {
        this.f7710J.put(i10, view);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0190  */
    /* JADX WARN: Code duplicated, block: B:109:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:111:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:112:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:114:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:116:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:117:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:126:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:128:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:129:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:133:0x0211  */
    /* JADX WARN: Code duplicated, block: B:137:0x0217  */
    /* JADX WARN: Code duplicated, block: B:140:0x0224  */
    /* JADX WARN: Code duplicated, block: B:141:0x0231  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:79:0x0106  */
    /* JADX WARN: Code duplicated, block: B:80:0x010b  */
    /* JADX WARN: Code duplicated, block: B:82:0x011a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0126  */
    /* JADX WARN: Code duplicated, block: B:85:0x0135  */
    /* JADX WARN: Code duplicated, block: B:86:0x0141  */
    /* JADX WARN: Code duplicated, block: B:88:0x0145  */
    /* JADX WARN: Code duplicated, block: B:89:0x0153  */
    /* JADX WARN: Code duplicated, block: B:91:0x015d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0163  */
    /* JADX WARN: Code duplicated, block: B:95:0x016f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0171  */
    /* JADX WARN: Code duplicated, block: B:99:0x0179  */
    @Override // androidx.recyclerview.widget.w
    public final void j0(A a, D d3) {
        View viewO0;
        FlexboxLayoutManager flexboxLayoutManager;
        AbstractC0266p abstractC0266p;
        int iM;
        int i10;
        int size;
        int i11;
        int i12;
        View viewR;
        boolean z6;
        int iE;
        boolean z10;
        int i13;
        int i14;
        int i15;
        int i16;
        this.f7723y = a;
        this.f7724z = d3;
        int iB = d3.b();
        if (iB == 0 && d3.f2229g) {
            return;
        }
        int iH = H();
        int i17 = this.f7715q;
        if (i17 == 0) {
            this.f7719u = iH == 1;
            this.f7720v = this.f7716r == 2;
        } else if (i17 == 1) {
            this.f7719u = iH != 1;
            this.f7720v = this.f7716r == 2;
        } else if (i17 == 2) {
            boolean z11 = iH == 1;
            this.f7719u = z11;
            if (this.f7716r == 2) {
                this.f7719u = !z11;
            }
            this.f7720v = false;
        } else if (i17 != 3) {
            this.f7719u = false;
            this.f7720v = false;
        } else {
            boolean z12 = iH == 1;
            this.f7719u = z12;
            if (this.f7716r == 2) {
                this.f7719u = !z12;
            }
            this.f7720v = true;
        }
        M0();
        if (this.f7701A == null) {
            p189t2.c cVar = new p189t2.c();
            cVar.f15165h = 1;
            this.f7701A = cVar;
        }
        a aVar = this.f7722x;
        aVar.f(iB);
        aVar.g(iB);
        aVar.e(iB);
        this.f7701A.f15166i = false;
        SavedState savedState = this.f7705E;
        if (savedState != null && (i16 = savedState.f7734s) >= 0 && i16 < iB) {
            this.f7706F = i16;
        }
        p189t2.b bVar = this.f7702B;
        if (!bVar.f15156f || this.f7706F != -1 || savedState != null) {
            p189t2.b.b(bVar);
            SavedState savedState2 = this.f7705E;
            if (d3.f2229g || (i12 = this.f7706F) == -1) {
                if (w() != 0) {
                    if (bVar.f15155e) {
                        viewO0 = Q0(d3.b());
                    } else {
                        viewO0 = O0(d3.b());
                    }
                    if (viewO0 != null) {
                        flexboxLayoutManager = bVar.f15158h;
                        if (flexboxLayoutManager.f7716r == 0) {
                            abstractC0266p = flexboxLayoutManager.f7704D;
                        } else {
                            abstractC0266p = flexboxLayoutManager.f7703C;
                        }
                        if (flexboxLayoutManager.b1() && flexboxLayoutManager.f7719u) {
                            if (bVar.f15155e) {
                                bVar.f15153c = abstractC0266p.m() + abstractC0266p.e(viewO0);
                            } else {
                                bVar.f15153c = abstractC0266p.b(viewO0);
                            }
                        } else if (bVar.f15155e) {
                            bVar.f15153c = abstractC0266p.m() + abstractC0266p.b(viewO0);
                        } else {
                            bVar.f15153c = abstractC0266p.e(viewO0);
                        }
                        iM = w.M(viewO0);
                        bVar.a = iM;
                        bVar.f15157g = false;
                        int[] iArr = flexboxLayoutManager.f7722x.f7737c;
                        if (iM == -1) {
                            iM = 0;
                        }
                        i10 = iArr[iM];
                        if (i10 == -1) {
                            i10 = 0;
                        }
                        bVar.f15152b = i10;
                        size = flexboxLayoutManager.f7721w.size();
                        i11 = bVar.f15152b;
                        if (size > i11) {
                            bVar.a = ((p189t2.a) flexboxLayoutManager.f7721w.get(i11)).f15148k;
                        }
                    } else {
                        p189t2.b.a(bVar);
                        bVar.a = 0;
                        bVar.f15152b = 0;
                    }
                } else {
                    p189t2.b.a(bVar);
                    bVar.a = 0;
                    bVar.f15152b = 0;
                }
            } else if (i12 < 0 || i12 >= d3.b()) {
                this.f7706F = -1;
                this.f7707G = Integer.MIN_VALUE;
                if (w() != 0) {
                    if (bVar.f15155e) {
                        viewO0 = Q0(d3.b());
                    } else {
                        viewO0 = O0(d3.b());
                    }
                    if (viewO0 != null) {
                        flexboxLayoutManager = bVar.f15158h;
                        if (flexboxLayoutManager.f7716r == 0) {
                            abstractC0266p = flexboxLayoutManager.f7704D;
                        } else {
                            abstractC0266p = flexboxLayoutManager.f7703C;
                        }
                        if (flexboxLayoutManager.b1()) {
                            if (bVar.f15155e) {
                                bVar.f15153c = abstractC0266p.m() + abstractC0266p.b(viewO0);
                            } else {
                                bVar.f15153c = abstractC0266p.e(viewO0);
                            }
                        } else if (bVar.f15155e) {
                            bVar.f15153c = abstractC0266p.m() + abstractC0266p.b(viewO0);
                        } else {
                            bVar.f15153c = abstractC0266p.e(viewO0);
                        }
                        iM = w.M(viewO0);
                        bVar.a = iM;
                        bVar.f15157g = false;
                        int[] iArr2 = flexboxLayoutManager.f7722x.f7737c;
                        if (iM == -1) {
                            iM = 0;
                        }
                        i10 = iArr2[iM];
                        if (i10 == -1) {
                            i10 = 0;
                        }
                        bVar.f15152b = i10;
                        size = flexboxLayoutManager.f7721w.size();
                        i11 = bVar.f15152b;
                        if (size > i11) {
                            bVar.a = ((p189t2.a) flexboxLayoutManager.f7721w.get(i11)).f15148k;
                        }
                    } else {
                        p189t2.b.a(bVar);
                        bVar.a = 0;
                        bVar.f15152b = 0;
                    }
                } else {
                    p189t2.b.a(bVar);
                    bVar.a = 0;
                    bVar.f15152b = 0;
                }
            } else {
                int i18 = this.f7706F;
                bVar.a = i18;
                bVar.f15152b = aVar.f7737c[i18];
                SavedState savedState3 = this.f7705E;
                if (savedState3 != null) {
                    int iB2 = d3.b();
                    int i19 = savedState3.f7734s;
                    if (i19 >= 0 && i19 < iB2) {
                        bVar.f15153c = this.f7703C.k() + savedState2.f7735t;
                        bVar.f15157g = true;
                        bVar.f15152b = -1;
                    } else if (this.f7707G == Integer.MIN_VALUE) {
                        viewR = r(this.f7706F);
                        if (viewR != null) {
                            if (w() > 0) {
                                if (this.f7706F < w.M(v(0))) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                bVar.f15155e = z6;
                            }
                            p189t2.b.a(bVar);
                        } else if (this.f7703C.c(viewR) > this.f7703C.l()) {
                            p189t2.b.a(bVar);
                        } else if (this.f7703C.e(viewR) - this.f7703C.k() < 0) {
                            bVar.f15153c = this.f7703C.k();
                            bVar.f15155e = false;
                        } else if (this.f7703C.g() - this.f7703C.b(viewR) < 0) {
                            bVar.f15153c = this.f7703C.g();
                            bVar.f15155e = true;
                        } else {
                            if (bVar.f15155e) {
                                iE = this.f7703C.m() + this.f7703C.b(viewR);
                            } else {
                                iE = this.f7703C.e(viewR);
                            }
                            bVar.f15153c = iE;
                        }
                    } else if (b1() && this.f7719u) {
                        bVar.f15153c = this.f7707G - this.f7703C.h();
                    } else {
                        bVar.f15153c = this.f7703C.k() + this.f7707G;
                    }
                } else if (this.f7707G == Integer.MIN_VALUE) {
                    viewR = r(this.f7706F);
                    if (viewR != null) {
                        if (w() > 0) {
                            if (this.f7706F < w.M(v(0))) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            bVar.f15155e = z6;
                        }
                        p189t2.b.a(bVar);
                    } else if (this.f7703C.c(viewR) > this.f7703C.l()) {
                        p189t2.b.a(bVar);
                    } else if (this.f7703C.e(viewR) - this.f7703C.k() < 0) {
                        bVar.f15153c = this.f7703C.k();
                        bVar.f15155e = false;
                    } else if (this.f7703C.g() - this.f7703C.b(viewR) < 0) {
                        bVar.f15153c = this.f7703C.g();
                        bVar.f15155e = true;
                    } else {
                        if (bVar.f15155e) {
                            iE = this.f7703C.m() + this.f7703C.b(viewR);
                        } else {
                            iE = this.f7703C.e(viewR);
                        }
                        bVar.f15153c = iE;
                    }
                } else if (b1()) {
                    bVar.f15153c = this.f7703C.k() + this.f7707G;
                } else {
                    bVar.f15153c = this.f7703C.k() + this.f7707G;
                }
            }
            bVar.f15156f = true;
        }
        q(a);
        if (bVar.f15155e) {
            h1(bVar, false, true);
        } else {
            g1(bVar, false, true);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f7133o, this.f7131m);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.f7134p, this.f7132n);
        int i20 = this.f7133o;
        int i21 = this.f7134p;
        boolean zB1 = b1();
        Context context = this.f7711K;
        if (zB1) {
            int i22 = this.f7708H;
            z10 = (i22 == Integer.MIN_VALUE || i22 == i20) ? false : true;
            p189t2.c cVar2 = this.f7701A;
            i13 = cVar2.f15159b ? context.getResources().getDisplayMetrics().heightPixels : cVar2.a;
        } else {
            int i23 = this.f7709I;
            z10 = (i23 == Integer.MIN_VALUE || i23 == i21) ? false : true;
            p189t2.c cVar3 = this.f7701A;
            i13 = cVar3.f15159b ? context.getResources().getDisplayMetrics().widthPixels : cVar3.a;
        }
        int i24 = i13;
        this.f7708H = i20;
        this.f7709I = i21;
        int i25 = this.f7713M;
        g gVar = this.f7714N;
        if (i25 != -1 || (this.f7706F == -1 && !z10)) {
            int iMin = i25 != -1 ? Math.min(i25, bVar.a) : bVar.a;
            gVar.a = null;
            if (b1()) {
                if (this.f7721w.size() > 0) {
                    aVar.c(this.f7721w, iMin);
                    this.f7722x.a(this.f7714N, iMakeMeasureSpec, iMakeMeasureSpec2, i24, iMin, bVar.a, this.f7721w);
                } else {
                    aVar.e(iB);
                    this.f7722x.a(this.f7714N, iMakeMeasureSpec, iMakeMeasureSpec2, i24, 0, -1, this.f7721w);
                }
            } else if (this.f7721w.size() > 0) {
                aVar.c(this.f7721w, iMin);
                int i26 = iMin;
                this.f7722x.a(this.f7714N, iMakeMeasureSpec2, iMakeMeasureSpec, i24, i26, bVar.a, this.f7721w);
                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
                iMin = i26;
            } else {
                aVar.e(iB);
                this.f7722x.a(this.f7714N, iMakeMeasureSpec2, iMakeMeasureSpec, i24, 0, -1, this.f7721w);
                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
            }
            this.f7721w = gVar.a;
            aVar.d(iMakeMeasureSpec, iMakeMeasureSpec2, iMin);
            aVar.p(iMin);
        } else if (!bVar.f15155e) {
            this.f7721w.clear();
            gVar.a = null;
            if (b1()) {
                this.f7722x.a(this.f7714N, iMakeMeasureSpec, iMakeMeasureSpec2, i24, 0, bVar.a, this.f7721w);
            } else {
                this.f7722x.a(this.f7714N, iMakeMeasureSpec2, iMakeMeasureSpec, i24, 0, bVar.a, this.f7721w);
                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
            }
            this.f7721w = gVar.a;
            aVar.d(iMakeMeasureSpec, iMakeMeasureSpec2, 0);
            aVar.p(0);
            int i27 = aVar.f7737c[bVar.a];
            bVar.f15152b = i27;
            this.f7701A.f15160c = i27;
        }
        if (bVar.f15155e) {
            N0(a, d3, this.f7701A);
            i15 = this.f7701A.f15162e;
            g1(bVar, true, false);
            N0(a, d3, this.f7701A);
            i14 = this.f7701A.f15162e;
        } else {
            N0(a, d3, this.f7701A);
            i14 = this.f7701A.f15162e;
            h1(bVar, true, false);
            N0(a, d3, this.f7701A);
            i15 = this.f7701A.f15162e;
        }
        if (w() > 0) {
            if (bVar.f15155e) {
                V0(U0(i14, a, d3, true) + i15, a, d3, false);
            } else {
                U0(V0(i15, a, d3, true) + i14, a, d3, false);
            }
        }
    }

    @Override // androidx.recyclerview.widget.w
    public final int k(D d3) {
        return J0(d3);
    }

    @Override // androidx.recyclerview.widget.w
    public final void k0(D d3) {
        this.f7705E = null;
        this.f7706F = -1;
        this.f7707G = Integer.MIN_VALUE;
        this.f7713M = -1;
        p189t2.b.b(this.f7702B);
        this.f7710J.clear();
    }

    @Override // androidx.recyclerview.widget.w
    public final int l(D d3) {
        return K0(d3);
    }

    @Override // androidx.recyclerview.widget.w
    public final void l0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f7705E = (SavedState) parcelable;
            u0();
        }
    }

    @Override // androidx.recyclerview.widget.w
    public final int m(D d3) {
        return L0(d3);
    }

    @Override // androidx.recyclerview.widget.w
    public final Parcelable m0() {
        SavedState savedState = this.f7705E;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.f7734s = savedState.f7734s;
            savedState2.f7735t = savedState.f7735t;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        if (w() <= 0) {
            savedState3.f7734s = -1;
            return savedState3;
        }
        View viewV = v(0);
        savedState3.f7734s = w.M(viewV);
        savedState3.f7735t = this.f7703C.e(viewV) - this.f7703C.k();
        return savedState3;
    }

    @Override // androidx.recyclerview.widget.w
    public final int n(D d3) {
        return J0(d3);
    }

    @Override // androidx.recyclerview.widget.w
    public final int o(D d3) {
        return K0(d3);
    }

    @Override // androidx.recyclerview.widget.w
    public final int p(D d3) {
        return L0(d3);
    }

    @Override // androidx.recyclerview.widget.w
    public final x s() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.f7730w = 0.0f;
        layoutParams.f7731x = 1.0f;
        layoutParams.f7732y = -1;
        layoutParams.f7733z = -1.0f;
        layoutParams.f7727C = 16777215;
        layoutParams.f7728D = 16777215;
        return layoutParams;
    }

    @Override // androidx.recyclerview.widget.w
    public final x t(Context context, AttributeSet attributeSet) {
        LayoutParams layoutParams = new LayoutParams(context, attributeSet);
        layoutParams.f7730w = 0.0f;
        layoutParams.f7731x = 1.0f;
        layoutParams.f7732y = -1;
        layoutParams.f7733z = -1.0f;
        layoutParams.f7727C = 16777215;
        layoutParams.f7728D = 16777215;
        return layoutParams;
    }

    @Override // androidx.recyclerview.widget.w
    public final int v0(int i10, D d3, A a) {
        if (!b1() || (this.f7716r == 0 && b1())) {
            int iZ0 = Z0(i10, d3, a);
            this.f7710J.clear();
            return iZ0;
        }
        int iA1 = a1(i10);
        this.f7702B.f15154d += iA1;
        this.f7704D.p(-iA1);
        return iA1;
    }

    @Override // androidx.recyclerview.widget.w
    public final void w0(int i10) {
        this.f7706F = i10;
        this.f7707G = Integer.MIN_VALUE;
        SavedState savedState = this.f7705E;
        if (savedState != null) {
            savedState.f7734s = -1;
        }
        u0();
    }

    @Override // androidx.recyclerview.widget.w
    public final int x0(int i10, D d3, A a) {
        if (b1() || (this.f7716r == 0 && !b1())) {
            int iZ0 = Z0(i10, d3, a);
            this.f7710J.clear();
            return iZ0;
        }
        int iA1 = a1(i10);
        this.f7702B.f15154d += iA1;
        this.f7704D.p(-iA1);
        return iA1;
    }

    @Override // androidx.recyclerview.widget.w
    public final void X(RecyclerView recyclerView) {
    }
}
