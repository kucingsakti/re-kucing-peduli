package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0532e extends AnimatorListenerAdapter {
    public final /* synthetic */ RecyclerView.a a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f7060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f7061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f7062d;

    public C0532e(View view, ViewPropertyAnimator viewPropertyAnimator, l lVar, RecyclerView.a aVar) {
        this.f7062d = lVar;
        this.a = aVar;
        this.f7060b = viewPropertyAnimator;
        this.f7061c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f7060b.setListener(null);
        this.f7061c.setAlpha(1.0f);
        l lVar = this.f7062d;
        RecyclerView.a aVar = this.a;
        lVar.c(aVar);
        lVar.f7095q.remove(aVar);
        lVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f7062d.getClass();
    }
}
