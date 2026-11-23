package com.google.android.material.behavior;

import G.b;
import U.U;
import U2.a;
import V.d;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import p032d0.f;

/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public f f9480s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p081i3.b f9481t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f9482u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f9483v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f9484w = 2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f9485x = 0.0f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f9486y = 0.5f;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final a f9487z = new a(this);

    @Override // G.b
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zO = this.f9482u;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zO = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f9482u = zO;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f9482u = false;
        }
        if (zO) {
            if (this.f9480s == null) {
                this.f9480s = new f(coordinatorLayout.getContext(), coordinatorLayout, this.f9487z);
            }
            if (!this.f9483v && this.f9480s.q(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // G.b
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        WeakHashMap weakHashMap = U.a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            U.k(view, 1048576);
            U.h(view, 0);
            if (w(view)) {
                U.l(view, d.f5071l, new P0.d(this, 7));
            }
        }
        return false;
    }

    @Override // G.b
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f9480s == null) {
            return false;
        }
        if (this.f9483v && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f9480s.j(motionEvent);
        return true;
    }

    public boolean w(View view) {
        return true;
    }
}
