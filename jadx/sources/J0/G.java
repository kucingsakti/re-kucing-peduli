package J0;

import U.U;
import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class G implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2236s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2237t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public OverScroller f2238u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Interpolator f2239v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f2240w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f2241x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2242y;

    public G(RecyclerView recyclerView) {
        this.f2242y = recyclerView;
        s sVar = RecyclerView.f6916a1;
        this.f2239v = sVar;
        this.f2240w = false;
        this.f2241x = false;
        this.f2238u = new OverScroller(recyclerView.getContext(), sVar);
    }

    public final void a(int i10, int i11) {
        RecyclerView recyclerView = this.f2242y;
        recyclerView.setScrollState(2);
        this.f2237t = 0;
        this.f2236s = 0;
        Interpolator interpolator = this.f2239v;
        s sVar = RecyclerView.f6916a1;
        if (interpolator != sVar) {
            this.f2239v = sVar;
            this.f2238u = new OverScroller(recyclerView.getContext(), sVar);
        }
        this.f2238u.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.f2240w) {
            this.f2241x = true;
            return;
        }
        RecyclerView recyclerView = this.f2242y;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = U.a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i10, int i11, int i12, BaseInterpolator baseInterpolator) {
        RecyclerView recyclerView = this.f2242y;
        if (i12 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i10);
            int iAbs2 = Math.abs(i11);
            boolean z6 = iAbs > iAbs2;
            int width = z6 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z6) {
                iAbs = iAbs2;
            }
            i12 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i13 = i12;
        Interpolator interpolator = baseInterpolator;
        if (baseInterpolator == null) {
            interpolator = RecyclerView.f6916a1;
        }
        if (this.f2239v != interpolator) {
            this.f2239v = interpolator;
            this.f2238u = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f2237t = 0;
        this.f2236s = 0;
        recyclerView.setScrollState(2);
        this.f2238u.startScroll(0, 0, i10, i11, i13);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        RecyclerView recyclerView = this.f2242y;
        if (recyclerView.f6928F == null) {
            recyclerView.removeCallbacks(this);
            this.f2238u.abortAnimation();
            return;
        }
        this.f2241x = false;
        this.f2240w = true;
        recyclerView.p();
        OverScroller overScroller = this.f2238u;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i15 = currX - this.f2236s;
            int i16 = currY - this.f2237t;
            this.f2236s = currX;
            this.f2237t = currY;
            int iO = RecyclerView.o(i15, recyclerView.f6960d0, recyclerView.f0, recyclerView.getWidth());
            int iO2 = RecyclerView.o(i16, recyclerView.f6961e0, recyclerView.f6962g0, recyclerView.getHeight());
            int[] iArr = recyclerView.f6941L0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean zV = recyclerView.v(iO, iO2, 1, iArr, null);
            int[] iArr2 = recyclerView.f6941L0;
            if (zV) {
                iO -= iArr2[0];
                iO2 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.n(iO, iO2);
            }
            if (recyclerView.f6926E != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.f0(iO, iO2, iArr2);
                int i17 = iArr2[0];
                int i18 = iArr2[1];
                int i19 = iO - i17;
                int i20 = iO2 - i18;
                C0263m c0263m = recyclerView.f6928F.f7124e;
                if (c0263m != null && !c0263m.f2329d && c0263m.f2330e) {
                    int iB = recyclerView.f6989z0.b();
                    if (iB == 0) {
                        c0263m.i();
                    } else if (c0263m.a >= iB) {
                        c0263m.a = iB - 1;
                        c0263m.g(i17, i18);
                    } else {
                        c0263m.g(i17, i18);
                    }
                }
                i10 = i19;
                i12 = i17;
                i11 = i20;
                i13 = i18;
            } else {
                i10 = iO;
                i11 = iO2;
                i12 = 0;
                i13 = 0;
            }
            if (!recyclerView.f6932H.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f6941L0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.w(i12, i13, i10, i11, null, 1, iArr3);
            int i21 = i10 - iArr2[0];
            int i22 = i11 - iArr2[1];
            if (i12 != 0 || i13 != 0) {
                recyclerView.x(i12, i13);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z6 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i21 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i22 != 0));
            C0263m c0263m2 = recyclerView.f6928F.f7124e;
            if ((c0263m2 == null || !c0263m2.f2329d) && z6) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i21 < 0) {
                        i14 = -currVelocity;
                    } else {
                        i14 = i21 > 0 ? currVelocity : 0;
                    }
                    if (i22 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i22 <= 0) {
                        currVelocity = 0;
                    }
                    if (i14 < 0) {
                        recyclerView.z();
                        if (recyclerView.f6960d0.isFinished()) {
                            recyclerView.f6960d0.onAbsorb(-i14);
                        }
                    } else if (i14 > 0) {
                        recyclerView.A();
                        if (recyclerView.f0.isFinished()) {
                            recyclerView.f0.onAbsorb(i14);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.B();
                        if (recyclerView.f6961e0.isFinished()) {
                            recyclerView.f6961e0.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.y();
                        if (recyclerView.f6962g0.isFinished()) {
                            recyclerView.f6962g0.onAbsorb(currVelocity);
                        }
                    }
                    if (i14 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = U.a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.Y0) {
                    C0256f c0256f = recyclerView.f6987y0;
                    int[] iArr4 = (int[]) c0256f.f2305d;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    c0256f.f2304c = 0;
                }
            } else {
                b();
                androidx.recyclerview.widget.m mVar = recyclerView.f6985x0;
                if (mVar != null) {
                    mVar.a(recyclerView, i12, i13);
                }
            }
        }
        C0263m c0263m3 = recyclerView.f6928F.f7124e;
        if (c0263m3 != null && c0263m3.f2329d) {
            c0263m3.g(0, 0);
        }
        this.f2240w = false;
        if (!this.f2241x) {
            recyclerView.setScrollState(0);
            recyclerView.l0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = U.a;
            recyclerView.postOnAnimation(this);
        }
    }
}
