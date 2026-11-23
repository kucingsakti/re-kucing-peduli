package V0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class G extends AnimatorListenerAdapter implements n {
    public final View a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f5086c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5089f = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5087d = true;

    public G(View view, int i10) {
        this.a = view;
        this.f5085b = i10;
        this.f5086c = (ViewGroup) view.getParent();
        h(true);
    }

    @Override // V0.n
    public final void b() {
        h(false);
        if (this.f5089f) {
            return;
        }
        z.b(this.a, this.f5085b);
    }

    @Override // V0.n
    public final void c() {
        h(true);
        if (this.f5089f) {
            return;
        }
        z.b(this.a, 0);
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

    public final void h(boolean z6) {
        ViewGroup viewGroup;
        if (!this.f5087d || this.f5088e == z6 || (viewGroup = this.f5086c) == null) {
            return;
        }
        this.f5088e = z6;
        oa.b.o(viewGroup, z6);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f5089f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f5089f) {
            z.b(this.a, this.f5085b);
            ViewGroup viewGroup = this.f5086c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        h(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z6) {
        if (z6) {
            z.b(this.a, 0);
            ViewGroup viewGroup = this.f5086c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z6) {
        if (z6) {
            return;
        }
        if (!this.f5089f) {
            z.b(this.a, this.f5085b);
            ViewGroup viewGroup = this.f5086c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        h(false);
    }

    @Override // V0.n
    public final void a(p pVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
