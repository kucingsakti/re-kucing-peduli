package J0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: J0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0263m {
    public int a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f2327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.recyclerview.widget.w f2328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f2331f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final B f2332g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2333h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinearInterpolator f2334i;
    public final DecelerateInterpolator j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PointF f2335k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f2336l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2337m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f2338n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2339o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f2340p;

    public C0263m(Context context) {
        B b3 = new B();
        b3.f2221d = -1;
        b3.f2223f = false;
        b3.a = 0;
        b3.f2219b = 0;
        b3.f2220c = Integer.MIN_VALUE;
        b3.f2222e = null;
        this.f2332g = b3;
        this.f2334i = new LinearInterpolator();
        this.j = new DecelerateInterpolator();
        this.f2337m = false;
        this.f2339o = 0;
        this.f2340p = 0;
        this.f2336l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == -1) {
            return i12 - i10;
        }
        if (i14 != 0) {
            if (i14 == 1) {
                return i13 - i11;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i15 = i12 - i10;
        if (i15 > 0) {
            return i15;
        }
        int i16 = i13 - i11;
        if (i16 < 0) {
            return i16;
        }
        return 0;
    }

    public int b(View view, int i10) {
        androidx.recyclerview.widget.w wVar = this.f2328c;
        if (wVar == null || !wVar.e()) {
            return 0;
        }
        androidx.recyclerview.widget.x xVar = (androidx.recyclerview.widget.x) view.getLayoutParams();
        return a(androidx.recyclerview.widget.w.B(view) - ((ViewGroup.MarginLayoutParams) xVar).leftMargin, androidx.recyclerview.widget.w.E(view) + ((ViewGroup.MarginLayoutParams) xVar).rightMargin, wVar.J(), wVar.f7133o - wVar.K(), i10);
    }

    public int c(View view, int i10) {
        androidx.recyclerview.widget.w wVar = this.f2328c;
        if (wVar == null || !wVar.f()) {
            return 0;
        }
        androidx.recyclerview.widget.x xVar = (androidx.recyclerview.widget.x) view.getLayoutParams();
        return a(androidx.recyclerview.widget.w.F(view) - ((ViewGroup.MarginLayoutParams) xVar).topMargin, androidx.recyclerview.widget.w.z(view) + ((ViewGroup.MarginLayoutParams) xVar).bottomMargin, wVar.L(), wVar.f7134p - wVar.I(), i10);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i10) {
        float fAbs = Math.abs(i10);
        if (!this.f2337m) {
            this.f2338n = d(this.f2336l);
            this.f2337m = true;
        }
        return (int) Math.ceil(fAbs * this.f2338n);
    }

    public PointF f(int i10) {
        Object obj = this.f2328c;
        if (obj instanceof C) {
            return ((C) obj).a(i10);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + C.class.getCanonicalName());
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f1  */
    public final void g(int i10, int i11) {
        PointF pointFF;
        RecyclerView recyclerView = this.f2327b;
        if (this.a == -1 || recyclerView == null) {
            i();
        }
        if (this.f2329d && this.f2331f == null && this.f2328c != null && (pointFF = f(this.a)) != null) {
            float f10 = pointFF.x;
            if (f10 != 0.0f || pointFF.y != 0.0f) {
                recyclerView.f0((int) Math.signum(f10), (int) Math.signum(pointFF.y), null);
            }
        }
        this.f2329d = false;
        View view = this.f2331f;
        B b3 = this.f2332g;
        if (view != null) {
            this.f2327b.getClass();
            RecyclerView.a aVarM = RecyclerView.M(view);
            if ((aVarM != null ? aVarM.d() : -1) == this.a) {
                View view2 = this.f2331f;
                D d3 = recyclerView.f6989z0;
                h(view2, b3);
                b3.a(recyclerView);
                i();
            } else {
                this.f2331f = null;
            }
        }
        if (this.f2330e) {
            D d8 = recyclerView.f6989z0;
            if (this.f2327b.f6928F.w() == 0) {
                i();
            } else {
                int i12 = this.f2339o;
                int i13 = i12 - i10;
                if (i12 * i13 <= 0) {
                    i13 = 0;
                }
                this.f2339o = i13;
                int i14 = this.f2340p;
                int i15 = i14 - i11;
                if (i14 * i15 <= 0) {
                    i15 = 0;
                }
                this.f2340p = i15;
                if (i13 == 0 && i15 == 0) {
                    PointF pointFF2 = f(this.a);
                    if (pointFF2 != null) {
                        float f11 = pointFF2.x;
                        if (f11 == 0.0f && pointFF2.y == 0.0f) {
                            b3.f2221d = this.a;
                            i();
                        } else {
                            float f12 = pointFF2.y;
                            float fSqrt = (float) Math.sqrt((f12 * f12) + (f11 * f11));
                            float f13 = pointFF2.x / fSqrt;
                            pointFF2.x = f13;
                            float f14 = pointFF2.y / fSqrt;
                            pointFF2.y = f14;
                            this.f2335k = pointFF2;
                            this.f2339o = (int) (f13 * 10000.0f);
                            this.f2340p = (int) (f14 * 10000.0f);
                            int iE = e(10000);
                            int i16 = (int) (this.f2339o * 1.2f);
                            int i17 = (int) (this.f2340p * 1.2f);
                            LinearInterpolator linearInterpolator = this.f2334i;
                            b3.a = i16;
                            b3.f2219b = i17;
                            b3.f2220c = (int) (iE * 1.2f);
                            b3.f2222e = linearInterpolator;
                            b3.f2223f = true;
                        }
                    } else {
                        b3.f2221d = this.a;
                        i();
                    }
                }
            }
            boolean z6 = b3.f2221d >= 0;
            b3.a(recyclerView);
            if (z6 && this.f2330e) {
                this.f2329d = true;
                recyclerView.f6983w0.b();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0015  */
    public void h(View view, B b3) {
        int i10;
        PointF pointF = this.f2335k;
        int i11 = 0;
        if (pointF != null) {
            float f10 = pointF.x;
            if (f10 == 0.0f) {
                i10 = 0;
            } else {
                i10 = f10 > 0.0f ? 1 : -1;
            }
        } else {
            i10 = 0;
        }
        int iB = b(view, i10);
        PointF pointF2 = this.f2335k;
        if (pointF2 != null) {
            float f11 = pointF2.y;
            if (f11 != 0.0f) {
                i11 = f11 > 0.0f ? 1 : -1;
            }
        }
        int iC = c(view, i11);
        int iCeil = (int) Math.ceil(((double) e((int) Math.sqrt((iC * iC) + (iB * iB)))) / 0.3356d);
        if (iCeil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.j;
            b3.a = -iB;
            b3.f2219b = -iC;
            b3.f2220c = iCeil;
            b3.f2222e = decelerateInterpolator;
            b3.f2223f = true;
        }
    }

    public final void i() {
        if (this.f2330e) {
            this.f2330e = false;
            this.f2340p = 0;
            this.f2339o = 0;
            this.f2335k = null;
            this.f2327b.f6989z0.a = -1;
            this.f2331f = null;
            this.a = -1;
            this.f2329d = false;
            androidx.recyclerview.widget.w wVar = this.f2328c;
            if (wVar.f7124e == this) {
                wVar.f7124e = null;
            }
            this.f2328c = null;
            this.f2327b = null;
        }
    }
}
