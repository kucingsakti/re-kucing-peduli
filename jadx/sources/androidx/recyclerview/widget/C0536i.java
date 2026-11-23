package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0536i extends AnimatorListenerAdapter {
    public final /* synthetic */ j a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f7074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f7075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f7076d;

    public C0536i(l lVar, j jVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f7076d = lVar;
        this.a = jVar;
        this.f7074b = viewPropertyAnimator;
        this.f7075c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f7074b.setListener(null);
        View view = this.f7075c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        j jVar = this.a;
        RecyclerView.a aVar = jVar.f7077b;
        l lVar = this.f7076d;
        lVar.c(aVar);
        lVar.f7096r.remove(jVar.f7077b);
        lVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView.a aVar = this.a.f7077b;
        this.f7076d.getClass();
    }
}
