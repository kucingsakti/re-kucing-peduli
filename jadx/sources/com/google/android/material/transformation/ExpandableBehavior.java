package com.google.android.material.transformation;

import G.b;
import U.U;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p072h3.a;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExpandableBehavior extends b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9969s = 0;

    public ExpandableBehavior() {
    }

    @Override // G.b
    public abstract boolean f(View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // G.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Object obj = (a) view2;
        boolean z6 = ((FloatingActionButton) obj).f9721G.a;
        if (z6) {
            int i10 = this.f9969s;
            if (i10 != 0 && i10 != 2) {
                return false;
            }
        } else if (this.f9969s != 1) {
            return false;
        }
        this.f9969s = z6 ? 1 : 2;
        w((View) obj, view, z6, true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // G.b
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        a aVar;
        boolean z6;
        int i11;
        WeakHashMap weakHashMap = U.a;
        if (!view.isLaidOut()) {
            ArrayList arrayListK = coordinatorLayout.k(view);
            int size = arrayListK.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    aVar = null;
                    break;
                }
                View view2 = (View) arrayListK.get(i12);
                if (f(view, view2)) {
                    aVar = (a) view2;
                    break;
                }
                i12++;
            }
            if (aVar != null && (!(z6 = ((FloatingActionButton) aVar).f9721G.a) ? this.f9969s == 1 : !((i11 = this.f9969s) != 0 && i11 != 2))) {
                int i13 = z6 ? 1 : 2;
                this.f9969s = i13;
                view.getViewTreeObserver().addOnPreDrawListener(new p234y3.a(this, view, i13, aVar));
            }
        }
        return false;
    }

    public abstract void w(View view, View view2, boolean z6, boolean z10);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
