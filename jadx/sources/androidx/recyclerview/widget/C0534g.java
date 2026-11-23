package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0534g extends AnimatorListenerAdapter {
    public final /* synthetic */ RecyclerView.a a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f7067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f7069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f7070f;

    public C0534g(l lVar, RecyclerView.a aVar, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
        this.f7070f = lVar;
        this.a = aVar;
        this.f7066b = i10;
        this.f7067c = view;
        this.f7068d = i11;
        this.f7069e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i10 = this.f7066b;
        View view = this.f7067c;
        if (i10 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f7068d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f7069e.setListener(null);
        l lVar = this.f7070f;
        RecyclerView.a aVar = this.a;
        lVar.c(aVar);
        lVar.f7094p.remove(aVar);
        lVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f7070f.getClass();
    }
}
