package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0535h extends AnimatorListenerAdapter {
    public final /* synthetic */ j a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f7071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f7072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f7073d;

    public C0535h(l lVar, j jVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f7073d = lVar;
        this.a = jVar;
        this.f7071b = viewPropertyAnimator;
        this.f7072c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f7071b.setListener(null);
        View view = this.f7072c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        j jVar = this.a;
        RecyclerView.a aVar = jVar.a;
        l lVar = this.f7073d;
        lVar.c(aVar);
        lVar.f7096r.remove(jVar.a);
        lVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView.a aVar = this.a.a;
        this.f7073d.getClass();
    }
}
