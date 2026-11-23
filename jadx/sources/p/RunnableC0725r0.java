package p;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: p.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0725r0 implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f14115s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AbstractViewOnTouchListenerC0727s0 f14116t;

    public /* synthetic */ RunnableC0725r0(AbstractViewOnTouchListenerC0727s0 abstractViewOnTouchListenerC0727s0, int i10) {
        this.f14115s = i10;
        this.f14116t = abstractViewOnTouchListenerC0727s0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14115s) {
            case 0:
                ViewParent parent = this.f14116t.f14121v.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                AbstractViewOnTouchListenerC0727s0 abstractViewOnTouchListenerC0727s0 = this.f14116t;
                abstractViewOnTouchListenerC0727s0.a();
                View view = abstractViewOnTouchListenerC0727s0.f14121v;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0727s0.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    abstractViewOnTouchListenerC0727s0.f14124y = true;
                    break;
                }
                break;
        }
    }
}
