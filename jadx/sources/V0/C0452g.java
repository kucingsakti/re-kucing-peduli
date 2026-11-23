package V0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.kcstream.cing.R;

/* JADX INFO: renamed from: V0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0452g extends AnimatorListenerAdapter implements n {
    public final View a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5117b = false;

    public C0452g(View view) {
        this.a = view;
    }

    @Override // V0.n
    public final void b() {
        View view = this.a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? z.a.o(view) : 0.0f));
    }

    @Override // V0.n
    public final void c() {
        this.a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // V0.n
    public final void d(p pVar) {
        throw null;
    }

    @Override // V0.n
    public final void e(p pVar) {
        throw null;
    }

    @Override // V0.n
    public final void f(p pVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        z.a.A(this.a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f5117b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z6) {
        boolean z10 = this.f5117b;
        View view = this.a;
        if (z10) {
            view.setLayerType(0, null);
        }
        if (z6) {
            return;
        }
        E e10 = z.a;
        e10.A(view, 1.0f);
        e10.getClass();
    }

    @Override // V0.n
    public final void a(p pVar) {
    }

    @Override // V0.n
    public final void g(p pVar) {
    }
}
