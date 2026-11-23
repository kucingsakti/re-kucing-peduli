package V0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.kcstream.cing.R;

/* JADX INFO: loaded from: classes.dex */
public final class H extends AnimatorListenerAdapter implements n {
    public final ViewGroup a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f5090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f5091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5092d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0453h f5093e;

    public H(C0453h c0453h, ViewGroup viewGroup, View view, View view2) {
        this.f5093e = c0453h;
        this.a = viewGroup;
        this.f5090b = view;
        this.f5091c = view2;
    }

    @Override // V0.n
    public final void a(p pVar) {
        if (this.f5092d) {
            h();
        }
    }

    @Override // V0.n
    public final void d(p pVar) {
        pVar.C(this);
    }

    @Override // V0.n
    public final void e(p pVar) {
        throw null;
    }

    @Override // V0.n
    public final void f(p pVar) {
        pVar.C(this);
    }

    @Override // V0.n
    public final void g(p pVar) {
    }

    public final void h() {
        this.f5091c.setTag(R.id.save_overlay_view, null);
        this.a.getOverlay().remove(this.f5090b);
        this.f5092d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.a.getOverlay().remove(this.f5090b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f5090b;
        if (view.getParent() == null) {
            this.a.getOverlay().add(view);
        } else {
            this.f5093e.cancel();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z6) {
        if (z6) {
            View view = this.f5091c;
            View view2 = this.f5090b;
            view.setTag(R.id.save_overlay_view, view2);
            this.a.getOverlay().add(view2);
            this.f5092d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z6) {
        if (z6) {
            return;
        }
        h();
    }

    @Override // V0.n
    public final void b() {
    }

    @Override // V0.n
    public final void c() {
    }
}
