package p081i3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import p170r3.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    public boolean a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f12226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f12227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f12228d;

    public h(k kVar) {
        this.f12228d = kVar;
    }

    public abstract float a();

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float f10 = (int) this.f12227c;
        g gVar = this.f12228d.f12240b;
        if (gVar != null) {
            gVar.k(f10);
        }
        this.a = false;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z6 = this.a;
        k kVar = this.f12228d;
        if (!z6) {
            g gVar = kVar.f12240b;
            this.f12226b = gVar == null ? 0.0f : gVar.f14501s.f14481m;
            this.f12227c = a();
            this.a = true;
        }
        float f10 = this.f12226b;
        float animatedFraction = (int) ((valueAnimator.getAnimatedFraction() * (this.f12227c - f10)) + f10);
        g gVar2 = kVar.f12240b;
        if (gVar2 != null) {
            gVar2.k(animatedFraction);
        }
    }
}
