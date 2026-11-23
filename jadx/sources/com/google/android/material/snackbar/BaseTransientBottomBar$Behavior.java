package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import o1.h;
import p102k7.e;
import p190t3.d;

/* JADX INFO: loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final e f9808A;

    public BaseTransientBottomBar$Behavior() {
        e eVar = new e();
        this.f9485x = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f9486y = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f9484w = 0;
        this.f9808A = eVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, G.b
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        e eVar = this.f9808A;
        eVar.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                h.g().p((d) eVar.f12743s);
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            h.g().n((d) eVar.f12743s);
        }
        return super.k(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean w(View view) {
        this.f9808A.getClass();
        return view instanceof p190t3.e;
    }
}
