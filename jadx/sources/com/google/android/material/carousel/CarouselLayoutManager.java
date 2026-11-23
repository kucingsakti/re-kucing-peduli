package com.google.android.material.carousel;

import B6.d;
import J0.C;
import J0.D;
import J0.q;
import K0.n;
import Q2.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import androidx.recyclerview.widget.A;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.w;
import androidx.recyclerview.widget.x;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.kcstream.cing.R;
import p003a3.b;
import p003a3.c;
import p003a3.e;

/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends w implements C {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f9582q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public n f9583r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final View.OnLayoutChangeListener f9584s;

    public CarouselLayoutManager() {
        e eVar = new e();
        new b();
        this.f9584s = new View.OnLayoutChangeListener() { // from class: a3.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                CarouselLayoutManager carouselLayoutManager = this.a;
                if (i10 == i14 && i11 == i15 && i12 == i16 && i13 == i17) {
                    return;
                }
                view.post(new d(carouselLayoutManager, 4));
            }
        };
        this.f9582q = eVar;
        u0();
        L0(0);
    }

    @Override // androidx.recyclerview.widget.w
    public final void A(Rect rect, View view) {
        super.A(rect, view);
        rect.centerY();
        if (J0()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.w
    public final void G0(RecyclerView recyclerView, int i10) {
        q qVar = new q(this, recyclerView.getContext(), 2);
        qVar.a = i10;
        H0(qVar);
    }

    public final boolean J0() {
        return this.f9583r.a == 0;
    }

    public final boolean K0() {
        return J0() && H() == 1;
    }

    public final void L0(int i10) {
        c cVar;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(AbstractC0487g.g(i10, "invalid orientation:"));
        }
        c(null);
        n nVar = this.f9583r;
        if (nVar == null || i10 != nVar.a) {
            if (i10 == 0) {
                cVar = new c(this, 1);
            } else {
                if (i10 != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                cVar = new c(this, 0);
            }
            this.f9583r = cVar;
            u0();
        }
    }

    @Override // androidx.recyclerview.widget.w
    public final boolean Q() {
        return true;
    }

    @Override // androidx.recyclerview.widget.w
    public final void W(RecyclerView recyclerView) {
        e eVar = this.f9582q;
        Context context = recyclerView.getContext();
        float dimension = eVar.a;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        eVar.a = dimension;
        float dimension2 = eVar.f6004b;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        eVar.f6004b = dimension2;
        u0();
        recyclerView.addOnLayoutChangeListener(this.f9584s);
    }

    @Override // androidx.recyclerview.widget.w
    public final void X(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f9584s);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0025  */
    /* JADX WARN: Code duplicated, block: B:19:0x0029  */
    /* JADX WARN: Code duplicated, block: B:23:0x0033  */
    @Override // androidx.recyclerview.widget.w
    public final View Y(View view, int i10, A a, D d3) {
        byte b3;
        if (w() == 0) {
            return null;
        }
        int i11 = this.f9583r.a;
        if (i10 == 1) {
            b3 = -1;
        } else if (i10 == 2) {
            b3 = 1;
        } else if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 == 130 && i11 == 1) {
                        b3 = 1;
                    } else {
                        b3 = -2147483648;
                    }
                } else if (i11 != 0) {
                    b3 = -2147483648;
                } else if (K0()) {
                    b3 = -1;
                } else {
                    b3 = 1;
                }
            } else if (i11 == 1) {
                b3 = -1;
            } else {
                b3 = -2147483648;
            }
        } else if (i11 != 0) {
            b3 = -2147483648;
        } else if (K0()) {
            b3 = 1;
        } else {
            b3 = -1;
        }
        if (b3 == -2147483648) {
            return null;
        }
        if (b3 == -1) {
            if (w.M(view) == 0) {
                return null;
            }
            int iM = w.M(v(0)) - 1;
            if (iM < 0 || iM >= G()) {
                return v(K0() ? w() - 1 : 0);
            }
            this.f9583r.f();
            throw null;
        }
        if (w.M(view) == G() - 1) {
            return null;
        }
        int iM2 = w.M(v(w() - 1)) + 1;
        if (iM2 < 0 || iM2 >= G()) {
            return v(K0() ? 0 : w() - 1);
        }
        this.f9583r.f();
        throw null;
    }

    @Override // androidx.recyclerview.widget.w
    public final void Z(AccessibilityEvent accessibilityEvent) {
        super.Z(accessibilityEvent);
        if (w() > 0) {
            accessibilityEvent.setFromIndex(w.M(v(0)));
            accessibilityEvent.setToIndex(w.M(v(w() - 1)));
        }
    }

    @Override // J0.C
    public final PointF a(int i10) {
        return null;
    }

    @Override // androidx.recyclerview.widget.w
    public final void d0(int i10, int i11) {
        G();
    }

    @Override // androidx.recyclerview.widget.w
    public final boolean e() {
        return J0();
    }

    @Override // androidx.recyclerview.widget.w
    public final boolean f() {
        return !J0();
    }

    @Override // androidx.recyclerview.widget.w
    public final void g0(int i10, int i11) {
        G();
    }

    @Override // androidx.recyclerview.widget.w
    public final void j0(A a, D d3) {
        if (d3.b() > 0) {
            if ((J0() ? this.f7133o : this.f7134p) > 0.0f) {
                K0();
                View view = a.k(0, Long.MAX_VALUE).f7003s;
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        q0(a);
    }

    @Override // androidx.recyclerview.widget.w
    public final int k(D d3) {
        w();
        return 0;
    }

    @Override // androidx.recyclerview.widget.w
    public final void k0(D d3) {
        if (w() == 0) {
            return;
        }
        w.M(v(0));
    }

    @Override // androidx.recyclerview.widget.w
    public final int l(D d3) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.w
    public final int m(D d3) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.w
    public final int n(D d3) {
        w();
        return 0;
    }

    @Override // androidx.recyclerview.widget.w
    public final int o(D d3) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.w
    public final int p(D d3) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.w
    public final x s() {
        return new x(-2, -2);
    }

    @Override // androidx.recyclerview.widget.w
    public final boolean t0(RecyclerView recyclerView, View view, Rect rect, boolean z6, boolean z10) {
        return false;
    }

    @Override // androidx.recyclerview.widget.w
    public final int v0(int i10, D d3, A a) {
        if (!J0() || w() == 0 || i10 == 0) {
            return 0;
        }
        View view = a.k(0, Long.MAX_VALUE).f7003s;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // androidx.recyclerview.widget.w
    public final void w0(int i10) {
    }

    @Override // androidx.recyclerview.widget.w
    public final int x0(int i10, D d3, A a) {
        if (!f() || w() == 0 || i10 == 0) {
            return 0;
        }
        View view = a.k(0, Long.MAX_VALUE).f7003s;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        new b();
        this.f9584s = new View.OnLayoutChangeListener() { // from class: a3.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                CarouselLayoutManager carouselLayoutManager = this.a;
                if (i12 == i16 && i13 == i17 && i14 == i18 && i15 == i19) {
                    return;
                }
                view.post(new d(carouselLayoutManager, 4));
            }
        };
        this.f9582q = new e();
        u0();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f4014h);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            u0();
            L0(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
