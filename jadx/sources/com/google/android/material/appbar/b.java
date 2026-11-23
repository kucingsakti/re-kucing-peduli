package com.google.android.material.appbar;

import U.C0412b;
import V.d;
import V.j;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes.dex */
public final class b extends C0412b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f9440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f9441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f9442f;

    public b(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.f9442f = baseBehavior;
        this.f9440d = appBarLayout;
        this.f9441e = coordinatorLayout;
    }

    @Override // U.C0412b
    public final void d(View view, j jVar) {
        AppBarLayout.BaseBehavior baseBehavior;
        View viewB;
        this.a.onInitializeAccessibilityNodeInfo(view, jVar.a);
        jVar.i(ScrollView.class.getName());
        AppBarLayout appBarLayout = this.f9440d;
        if (appBarLayout.getTotalScrollRange() == 0 || (viewB = AppBarLayout.BaseBehavior.B((baseBehavior = this.f9442f), this.f9441e)) == null) {
            return;
        }
        int childCount = appBarLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((S2.c) appBarLayout.getChildAt(i10).getLayoutParams()).a != 0) {
                if (baseBehavior.y() != (-appBarLayout.getTotalScrollRange())) {
                    jVar.b(d.f5068h);
                    jVar.l(true);
                }
                if (baseBehavior.y() != 0) {
                    if (!viewB.canScrollVertically(-1)) {
                        jVar.b(d.f5069i);
                        jVar.l(true);
                        return;
                    } else {
                        if ((-appBarLayout.getDownNestedPreScrollRange()) != 0) {
                            jVar.b(d.f5069i);
                            jVar.l(true);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    @Override // U.C0412b
    public final boolean g(View view, int i10, Bundle bundle) {
        AppBarLayout appBarLayout = this.f9440d;
        if (i10 == 4096) {
            appBarLayout.setExpanded(false);
            return true;
        }
        if (i10 != 8192) {
            return super.g(view, i10, bundle);
        }
        AppBarLayout.BaseBehavior baseBehavior = this.f9442f;
        if (baseBehavior.y() != 0) {
            View viewB = AppBarLayout.BaseBehavior.B(baseBehavior, this.f9441e);
            if (!viewB.canScrollVertically(-1)) {
                appBarLayout.setExpanded(true);
                return true;
            }
            int i11 = -appBarLayout.getDownNestedPreScrollRange();
            if (i11 != 0) {
                CoordinatorLayout coordinatorLayout = this.f9441e;
                AppBarLayout appBarLayout2 = this.f9440d;
                this.f9442f.E(coordinatorLayout, appBarLayout2, viewB, i11, new int[]{0, 0});
                return true;
            }
        }
        return false;
    }
}
