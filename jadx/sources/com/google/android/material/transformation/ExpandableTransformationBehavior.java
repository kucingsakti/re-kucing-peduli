package com.google.android.material.transformation;

import B4.L;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public AnimatorSet f9970t;

    public ExpandableTransformationBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    public void w(View view, View view2, boolean z6, boolean z10) {
        AnimatorSet animatorSet = this.f9970t;
        boolean z11 = animatorSet != null;
        if (z11) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSetX = x(view, view2, z6, z11);
        this.f9970t = animatorSetX;
        animatorSetX.addListener(new L(this, 13));
        this.f9970t.start();
        if (z10) {
            return;
        }
        this.f9970t.end();
    }

    public abstract AnimatorSet x(View view, View view2, boolean z6, boolean z10);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
