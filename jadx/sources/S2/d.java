package S2;

import B4.I;
import U.U;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public VelocityTracker f4515A;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public I f4516u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public OverScroller f4517v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f4518w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f4519x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f4520y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f4521z;

    public final void A(CoordinatorLayout coordinatorLayout, View view, int i10) {
        z(coordinatorLayout, view, i10, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0048  */
    /* JADX WARN: Code duplicated, block: B:35:0x007f  */
    /* JADX WARN: Code duplicated, block: B:37:0x008b  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a5  */
    @Override // G.b
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int y6;
        boolean z6;
        OverScroller overScroller;
        View view2;
        int iFindPointerIndex;
        if (this.f4521z < 0) {
            this.f4521z = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f4518w) {
            int i10 = this.f4519x;
            if (i10 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i10)) != -1) {
                int y8 = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y8 - this.f4520y) > this.f4521z) {
                    this.f4520y = y8;
                    return true;
                }
                if (motionEvent.getActionMasked() == 0) {
                    this.f4519x = -1;
                    int x8 = (int) motionEvent.getX();
                    y6 = (int) motionEvent.getY();
                    WeakReference weakReference = ((AppBarLayout.BaseBehavior) this).f9426F;
                    if (weakReference == null) {
                    }
                    this.f4518w = z6;
                    if (z6) {
                        this.f4520y = y6;
                        this.f4519x = motionEvent.getPointerId(0);
                        if (this.f4515A == null) {
                            this.f4515A = VelocityTracker.obtain();
                        }
                        overScroller = this.f4517v;
                        if (overScroller != null) {
                            this.f4517v.abortAnimation();
                            return true;
                        }
                    }
                }
                velocityTracker = this.f4515A;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                this.f4519x = -1;
                int x10 = (int) motionEvent.getX();
                y6 = (int) motionEvent.getY();
                WeakReference weakReference2 = ((AppBarLayout.BaseBehavior) this).f9426F;
                z6 = !(weakReference2 == null && ((view2 = (View) weakReference2.get()) == null || !view2.isShown() || view2.canScrollVertically(-1))) && coordinatorLayout.o(view, x10, y6);
                this.f4518w = z6;
                if (z6) {
                    this.f4520y = y6;
                    this.f4519x = motionEvent.getPointerId(0);
                    if (this.f4515A == null) {
                        this.f4515A = VelocityTracker.obtain();
                    }
                    overScroller = this.f4517v;
                    if (overScroller != null && !overScroller.isFinished()) {
                        this.f4517v.abortAnimation();
                        return true;
                    }
                }
            }
            velocityTracker = this.f4515A;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fe A[ADDED_TO_REGION] */
    @Override // G.b
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z6;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f4519x);
                if (iFindPointerIndex != -1) {
                    int y6 = (int) motionEvent.getY(iFindPointerIndex);
                    int i10 = this.f4520y - y6;
                    this.f4520y = y6;
                    AppBarLayout appBarLayout = (AppBarLayout) view;
                    z(coordinatorLayout, view, y() - i10, appBarLayout.getTopInset() + (-appBarLayout.getDownNestedScrollRange()), 0);
                }
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i11 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.f4519x = motionEvent.getPointerId(i11);
                    this.f4520y = (int) (motionEvent.getY(i11) + 0.5f);
                }
            }
            z6 = false;
            velocityTracker2 = this.f4515A;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return !this.f4518w || z6;
        }
        VelocityTracker velocityTracker3 = this.f4515A;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            this.f4515A.computeCurrentVelocity(1000);
            float yVelocity = this.f4515A.getYVelocity(this.f4519x);
            AppBarLayout appBarLayout2 = (AppBarLayout) view;
            int i12 = -appBarLayout2.getTotalScrollRange();
            Runnable runnable = this.f4516u;
            if (runnable != null) {
                view.removeCallbacks(runnable);
                this.f4516u = null;
            }
            if (this.f4517v == null) {
                this.f4517v = new OverScroller(view.getContext());
            }
            this.f4517v.fling(0, w(), 0, Math.round(yVelocity), 0, 0, i12, 0);
            if (this.f4517v.computeScrollOffset()) {
                I i13 = new I(this, coordinatorLayout, view, 10);
                this.f4516u = i13;
                WeakHashMap weakHashMap = U.a;
                view.postOnAnimation(i13);
            } else {
                ((AppBarLayout.BaseBehavior) this).G(coordinatorLayout, appBarLayout2);
                if (appBarLayout2.f9401C) {
                    appBarLayout2.e(appBarLayout2.f(AppBarLayout.BaseBehavior.D(coordinatorLayout)));
                }
            }
            z6 = true;
        }
        this.f4518w = false;
        this.f4519x = -1;
        velocityTracker = this.f4515A;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f4515A = null;
        }
        velocityTracker2 = this.f4515A;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.f4518w) {
        }
        z6 = false;
        this.f4518w = false;
        this.f4519x = -1;
        velocityTracker = this.f4515A;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f4515A = null;
        }
        velocityTracker2 = this.f4515A;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.f4518w) {
        }
    }

    public abstract int y();

    public abstract int z(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12);
}
