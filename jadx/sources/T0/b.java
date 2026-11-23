package T0;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ d a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f4589b;

    public b(e eVar, d dVar) {
        this.f4589b = eVar;
        this.a = dVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        e eVar = this.f4589b;
        eVar.getClass();
        d dVar = this.a;
        e.d(fFloatValue, dVar);
        eVar.a(fFloatValue, dVar, false);
        eVar.invalidateSelf();
    }
}
