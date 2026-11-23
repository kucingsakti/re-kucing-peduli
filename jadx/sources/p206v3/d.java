package p206v3;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f15424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f15425c;

    public d(e eVar, View view, View view2) {
        this.f15425c = eVar;
        this.a = view;
        this.f15424b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f15425c.c(this.a, this.f15424b, valueAnimator.getAnimatedFraction());
    }
}
