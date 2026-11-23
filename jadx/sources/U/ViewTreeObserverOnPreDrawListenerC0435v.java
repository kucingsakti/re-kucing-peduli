package U;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: U.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0435v implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final View f4857s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ViewTreeObserver f4858t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Runnable f4859u;

    public ViewTreeObserverOnPreDrawListenerC0435v(View view, Runnable runnable) {
        this.f4857s = view;
        this.f4858t = view.getViewTreeObserver();
        this.f4859u = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC0435v viewTreeObserverOnPreDrawListenerC0435v = new ViewTreeObserverOnPreDrawListenerC0435v(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0435v);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0435v);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f4858t.isAlive();
        View view = this.f4857s;
        if (zIsAlive) {
            this.f4858t.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f4859u.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f4858t = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f4858t.isAlive();
        View view2 = this.f4857s;
        if (zIsAlive) {
            this.f4858t.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
