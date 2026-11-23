package p000a0;

import A1.RunnableC0094c;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import com.onesignal.core.activities.PermissionsActivity;
import p.C0722p0;

/* JADX INFO: loaded from: classes.dex */
public final class g implements View.OnTouchListener {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final int f5972J = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final float[] f5973A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final float[] f5974B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final float[] f5975C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f5976D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f5977E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f5978F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f5979G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f5980H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final C0722p0 f5981I;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a f5982s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AccelerateInterpolator f5983t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ListView f5984u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public RunnableC0094c f5985v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final float[] f5986w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final float[] f5987x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f5988y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f5989z;

    public g(C0722p0 c0722p0) {
        a aVar = new a();
        aVar.f5967e = Long.MIN_VALUE;
        aVar.f5969g = -1L;
        aVar.f5968f = 0L;
        this.f5982s = aVar;
        this.f5983t = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f5986w = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f5987x = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f5973A = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f5974B = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f5975C = fArr5;
        this.f5984u = c0722p0;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = ((int) ((1575.0f * f10) + 0.5f)) / 1000.0f;
        fArr5[0] = f11;
        fArr5[1] = f11;
        float f12 = ((int) ((f10 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f12;
        fArr4[1] = f12;
        this.f5988y = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f5989z = f5972J;
        aVar.a = PermissionsActivity.DELAY_TIME_CALLBACK_CALL;
        aVar.f5964b = PermissionsActivity.DELAY_TIME_CALLBACK_CALL;
        this.f5981I = c0722p0;
    }

    public static float b(float f10, float f11, float f12) {
        if (f10 > f12) {
            return f12;
        }
        return f10 < f11 ? f11 : f10;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    public final float a(int i10, float f10, float f11, float f12) {
        float fB;
        float interpolation;
        float fB2 = b(this.f5986w[i10] * f11, 0.0f, this.f5987x[i10]);
        float fC = c(f11 - f10, fB2) - c(f10, fB2);
        AccelerateInterpolator accelerateInterpolator = this.f5983t;
        if (fC >= 0.0f) {
            if (fC > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fC);
            } else {
                fB = 0.0f;
            }
            if (fB == 0.0f) {
                return 0.0f;
            }
            float f13 = this.f5973A[i10];
            float f14 = this.f5974B[i10];
            float f15 = this.f5975C[i10];
            float f16 = f13 * f12;
            return fB > 0.0f ? b(fB * f16, f14, f15) : -b((-fB) * f16, f14, f15);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fC);
        fB = b(interpolation, -1.0f, 1.0f);
        if (fB == 0.0f) {
            return 0.0f;
        }
        float f17 = this.f5973A[i10];
        float f18 = this.f5974B[i10];
        float f19 = this.f5975C[i10];
        float f110 = f17 * f12;
        if (fB > 0.0f) {
        }
    }

    public final float c(float f10, float f11) {
        if (f11 != 0.0f) {
            int i10 = this.f5988y;
            if (i10 == 0 || i10 == 1) {
                if (f10 < f11) {
                    if (f10 >= 0.0f) {
                        return 1.0f - (f10 / f11);
                    }
                    if (this.f5979G && i10 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i10 == 2 && f10 < 0.0f) {
                return f10 / (-f11);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i10 = 0;
        if (this.f5977E) {
            this.f5979G = false;
            return;
        }
        a aVar = this.f5982s;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i11 = (int) (jCurrentAnimationTimeMillis - aVar.f5967e);
        int i12 = aVar.f5964b;
        if (i11 > i12) {
            i10 = i12;
        } else if (i11 >= 0) {
            i10 = i11;
        }
        aVar.f5971i = i10;
        aVar.f5970h = aVar.a(jCurrentAnimationTimeMillis);
        aVar.f5969g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        C0722p0 c0722p0;
        int count;
        a aVar = this.f5982s;
        float f10 = aVar.f5966d;
        int iAbs = (int) (f10 / Math.abs(f10));
        Math.abs(aVar.f5965c);
        if (iAbs != 0 && (count = (c0722p0 = this.f5981I).getCount()) != 0) {
            int childCount = c0722p0.getChildCount();
            int firstVisiblePosition = c0722p0.getFirstVisiblePosition();
            int i10 = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && c0722p0.getChildAt(0).getTop() >= 0)) : !(i10 >= count && c0722p0.getChildAt(childCount - 1).getBottom() <= c0722p0.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f5980H
            r1 = 0
            if (r0 != 0) goto L7
            goto L7e
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7e
        L17:
            r7.d()
            return r1
        L1b:
            r7.f5978F = r2
            r7.f5976D = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.widget.ListView r4 = r7.f5984u
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r1, r0, r3, r5)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r2, r9, r8, r3)
            a0.a r9 = r7.f5982s
            r9.f5965c = r0
            r9.f5966d = r8
            boolean r8 = r7.f5979G
            if (r8 != 0) goto L7e
            boolean r8 = r7.e()
            if (r8 == 0) goto L7e
            A1.c r8 = r7.f5985v
            if (r8 != 0) goto L62
            A1.c r8 = new A1.c
            r9 = 16
            r8.<init>(r7, r9)
            r7.f5985v = r8
        L62:
            r7.f5979G = r2
            r7.f5977E = r2
            boolean r8 = r7.f5976D
            if (r8 != 0) goto L77
            int r8 = r7.f5989z
            if (r8 <= 0) goto L77
            A1.c r9 = r7.f5985v
            long r5 = (long) r8
            java.util.WeakHashMap r8 = U.U.a
            r4.postOnAnimationDelayed(r9, r5)
            goto L7c
        L77:
            A1.c r8 = r7.f5985v
            r8.run()
        L7c:
            r7.f5976D = r2
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a0.g.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
