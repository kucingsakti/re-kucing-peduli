package J0;

import A1.RunnableC0094c;
import U.U;
import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: J0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0255e extends x {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int[] f2275C = {R.attr.state_pressed};

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int[] f2276D = new int[0];

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f2277A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final RunnableC0094c f2278B;
    public final int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StateListDrawable f2280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Drawable f2281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2283f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StateListDrawable f2284g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Drawable f2285h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f2286i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2287k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2288l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f2289m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2290n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2291o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f2292p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final RecyclerView f2295s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ValueAnimator f2302z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2293q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2294r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f2296t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f2297u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f2298v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f2299w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int[] f2300x = new int[2];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int[] f2301y = new int[2];

    public C0255e(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f2302z = valueAnimatorOfFloat;
        this.f2277A = 0;
        RunnableC0094c runnableC0094c = new RunnableC0094c(this, 5);
        this.f2278B = runnableC0094c;
        C0253c c0253c = new C0253c(this);
        this.f2280c = stateListDrawable;
        this.f2281d = drawable;
        this.f2284g = stateListDrawable2;
        this.f2285h = drawable2;
        this.f2282e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f2283f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f2286i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.a = i11;
        this.f2279b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new C0254d(this));
        valueAnimatorOfFloat.addUpdateListener(new B4.K(this, 1));
        RecyclerView recyclerView2 = this.f2295s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            androidx.recyclerview.widget.w wVar = recyclerView2.f6928F;
            if (wVar != null) {
                wVar.c("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f6932H;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.R();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f2295s;
            recyclerView3.f6934I.remove(this);
            if (recyclerView3.f6936J == this) {
                recyclerView3.f6936J = null;
            }
            ArrayList arrayList2 = this.f2295s.f6921B0;
            if (arrayList2 != null) {
                arrayList2.remove(c0253c);
            }
            this.f2295s.removeCallbacks(runnableC0094c);
        }
        this.f2295s = recyclerView;
        if (recyclerView != null) {
            recyclerView.i(this);
            this.f2295s.f6934I.add(this);
            this.f2295s.j(c0253c);
        }
    }

    public static int f(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 != 0) {
            int i14 = i10 - i12;
            int i15 = (int) (((f11 - f10) / i13) * i14);
            int i16 = i11 + i15;
            if (i16 < i14 && i16 >= 0) {
                return i15;
            }
        }
        return 0;
    }

    @Override // J0.x
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        int i10 = this.f2293q;
        RecyclerView recyclerView2 = this.f2295s;
        if (i10 != recyclerView2.getWidth() || this.f2294r != recyclerView2.getHeight()) {
            this.f2293q = recyclerView2.getWidth();
            this.f2294r = recyclerView2.getHeight();
            g(0);
            return;
        }
        if (this.f2277A != 0) {
            if (this.f2296t) {
                int i11 = this.f2293q;
                int i12 = this.f2282e;
                int i13 = i11 - i12;
                int i14 = this.f2288l;
                int i15 = this.f2287k;
                int i16 = i14 - (i15 / 2);
                StateListDrawable stateListDrawable = this.f2280c;
                stateListDrawable.setBounds(0, 0, i12, i15);
                int i17 = this.f2294r;
                int i18 = this.f2283f;
                Drawable drawable = this.f2281d;
                drawable.setBounds(0, 0, i18, i17);
                WeakHashMap weakHashMap = U.a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i12, i16);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i12, -i16);
                } else {
                    canvas.translate(i13, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i16);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i13, -i16);
                }
            }
            if (this.f2297u) {
                int i19 = this.f2294r;
                int i20 = this.f2286i;
                int i21 = i19 - i20;
                int i22 = this.f2291o;
                int i23 = this.f2290n;
                int i24 = i22 - (i23 / 2);
                StateListDrawable stateListDrawable2 = this.f2284g;
                stateListDrawable2.setBounds(0, 0, i23, i20);
                int i25 = this.f2293q;
                int i26 = this.j;
                Drawable drawable2 = this.f2285h;
                drawable2.setBounds(0, 0, i25, i26);
                canvas.translate(0.0f, i21);
                drawable2.draw(canvas);
                canvas.translate(i24, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i24, -i21);
            }
        }
    }

    public final boolean d(float f10, float f11) {
        if (f11 < this.f2294r - this.f2286i) {
            return false;
        }
        int i10 = this.f2291o;
        int i11 = this.f2290n;
        return f10 >= ((float) (i10 - (i11 / 2))) && f10 <= ((float) ((i11 / 2) + i10));
    }

    public final boolean e(float f10, float f11) {
        RecyclerView recyclerView = this.f2295s;
        WeakHashMap weakHashMap = U.a;
        boolean z6 = recyclerView.getLayoutDirection() == 1;
        int i10 = this.f2282e;
        if (!z6 ? f10 >= this.f2293q - i10 : f10 <= i10) {
            int i11 = this.f2288l;
            int i12 = this.f2287k / 2;
            if (f11 >= i11 - i12 && f11 <= i12 + i11) {
                return true;
            }
        }
        return false;
    }

    public final void g(int i10) {
        RunnableC0094c runnableC0094c = this.f2278B;
        StateListDrawable stateListDrawable = this.f2280c;
        if (i10 == 2 && this.f2298v != 2) {
            stateListDrawable.setState(f2275C);
            this.f2295s.removeCallbacks(runnableC0094c);
        }
        if (i10 == 0) {
            this.f2295s.invalidate();
        } else {
            h();
        }
        if (this.f2298v == 2 && i10 != 2) {
            stateListDrawable.setState(f2276D);
            this.f2295s.removeCallbacks(runnableC0094c);
            this.f2295s.postDelayed(runnableC0094c, 1200);
        } else if (i10 == 1) {
            this.f2295s.removeCallbacks(runnableC0094c);
            this.f2295s.postDelayed(runnableC0094c, 1500);
        }
        this.f2298v = i10;
    }

    public final void h() {
        int i10 = this.f2277A;
        ValueAnimator valueAnimator = this.f2302z;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f2277A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
