package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0533f extends AnimatorListenerAdapter {
    public final /* synthetic */ RecyclerView.a a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f7063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f7064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f7065d;

    public C0533f(View view, ViewPropertyAnimator viewPropertyAnimator, l lVar, RecyclerView.a aVar) {
        this.f7065d = lVar;
        this.a = aVar;
        this.f7063b = view;
        this.f7064c = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f7063b.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f7064c.setListener(null);
        l lVar = this.f7065d;
        RecyclerView.a aVar = this.a;
        lVar.c(aVar);
        lVar.f7093o.remove(aVar);
        lVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f7065d.getClass();
    }
}
