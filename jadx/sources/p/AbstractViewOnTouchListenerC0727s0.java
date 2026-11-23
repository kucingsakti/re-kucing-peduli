package p;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: p.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0727s0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int[] f14117A = new int[2];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f14118s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f14119t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f14120u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final View f14121v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public RunnableC0725r0 f14122w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public RunnableC0725r0 f14123x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f14124y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f14125z;

    public AbstractViewOnTouchListenerC0727s0(View view) {
        this.f14121v = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f14118s = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f14119t = tapTimeout;
        this.f14120u = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC0725r0 runnableC0725r0 = this.f14123x;
        View view = this.f14121v;
        if (runnableC0725r0 != null) {
            view.removeCallbacks(runnableC0725r0);
        }
        RunnableC0725r0 runnableC0725r1 = this.f14122w;
        if (runnableC0725r1 != null) {
            view.removeCallbacks(runnableC0725r1);
        }
    }

    public abstract p136o.B b();

    public abstract boolean c();

    public boolean d() {
        p136o.B b3 = b();
        if (b3 == null || !b3.b()) {
            return true;
        }
        b3.dismiss();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z6;
        C0722p0 c0722p0F;
        boolean z10 = this.f14124y;
        View view2 = this.f14121v;
        if (z10) {
            p136o.B b3 = b();
            if (b3 != null && b3.b() && (c0722p0F = b3.f()) != null && c0722p0F.isShown()) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f14117A;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                c0722p0F.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zB = c0722p0F.b(motionEventObtainNoHistory, this.f14125z);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z11 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zB && z11) {
                    z6 = true;
                } else if (d()) {
                    z6 = false;
                } else {
                    z6 = true;
                }
            } else if (d()) {
                z6 = true;
            } else {
                z6 = false;
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.f14125z = motionEvent.getPointerId(0);
                    if (this.f14122w == null) {
                        this.f14122w = new RunnableC0725r0(this, 0);
                    }
                    view2.postDelayed(this.f14122w, this.f14119t);
                    if (this.f14123x == null) {
                        this.f14123x = new RunnableC0725r0(this, 1);
                    }
                    view2.postDelayed(this.f14123x, this.f14120u);
                } else if (actionMasked2 == 1) {
                    a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f14125z);
                    if (iFindPointerIndex >= 0) {
                        float x8 = motionEvent.getX(iFindPointerIndex);
                        float y6 = motionEvent.getY(iFindPointerIndex);
                        float f10 = this.f14118s;
                        float f11 = -f10;
                        if (x8 < f11 || y6 < f11 || x8 >= (view2.getRight() - view2.getLeft()) + f10 || y6 >= (view2.getBottom() - view2.getTop()) + f10) {
                            a();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            if (c()) {
                                z6 = true;
                            }
                        }
                    }
                } else if (actionMasked2 == 3) {
                    a();
                }
                z6 = false;
            } else {
                z6 = false;
            }
            if (z6) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f14124y = z6;
        return z6 || z10;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f14124y = false;
        this.f14125z = -1;
        RunnableC0725r0 runnableC0725r0 = this.f14122w;
        if (runnableC0725r0 != null) {
            this.f14121v.removeCallbacks(runnableC0725r0);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
