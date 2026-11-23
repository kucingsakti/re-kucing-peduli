package p109l3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f12923c;

    public g(h hVar, boolean z6, int i10) {
        this.f12923c = hVar;
        this.a = z6;
        this.f12922b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h hVar = this.f12923c;
        hVar.f12914b.setTranslationX(0.0f);
        hVar.c(0.0f, this.a, this.f12922b);
    }
}
