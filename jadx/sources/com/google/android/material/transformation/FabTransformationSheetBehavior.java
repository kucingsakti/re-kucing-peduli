package com.google.android.material.transformation;

import G.e;
import R2.d;
import U.U;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.kcstream.cing.R;
import java.util.HashMap;
import java.util.WeakHashMap;
import o1.c;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public HashMap f9979A;

    public FabTransformationSheetBehavior() {
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    public final c D(Context context, boolean z6) {
        int i10 = z6 ? R.animator.mtrl_fab_transformation_sheet_expand_spec : R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        c cVar = new c(20, false);
        cVar.f13623t = d.b(context, i10);
        cVar.f13624u = new za.c(10);
        return cVar;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public final void w(View view, View view2, boolean z6, boolean z10) {
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z6) {
                this.f9979A = new HashMap(childCount);
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                boolean z11 = (childAt.getLayoutParams() instanceof e) && (((e) childAt.getLayoutParams()).a instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z11) {
                    if (z6) {
                        this.f9979A.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        WeakHashMap weakHashMap = U.a;
                        childAt.setImportantForAccessibility(4);
                    } else {
                        HashMap map = this.f9979A;
                        if (map != null && map.containsKey(childAt)) {
                            int iIntValue = ((Integer) this.f9979A.get(childAt)).intValue();
                            WeakHashMap weakHashMap2 = U.a;
                            childAt.setImportantForAccessibility(iIntValue);
                        }
                    }
                }
            }
            if (!z6) {
                this.f9979A = null;
            }
        }
        super.w(view, view2, z6, z10);
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
