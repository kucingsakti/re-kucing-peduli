package p156q0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.e;
import o1.c;
import p210v8.i;

/* JADX INFO: renamed from: q0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0745d extends T {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0746e f14319c;

    public C0745d(C0746e c0746e) {
        this.f14319c = c0746e;
    }

    @Override // p156q0.T
    public final void a(ViewGroup viewGroup) {
        i.f(viewGroup, "container");
        C0746e c0746e = this.f14319c;
        U u3 = (U) c0746e.f577s;
        View view = u3.f14285c.c0;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        ((U) c0746e.f577s).c(this);
        if (e.K(2)) {
            u3.toString();
        }
    }

    @Override // p156q0.T
    public final void b(ViewGroup viewGroup) {
        i.f(viewGroup, "container");
        C0746e c0746e = this.f14319c;
        boolean zQ0 = c0746e.Q0();
        U u3 = (U) c0746e.f577s;
        if (zQ0) {
            u3.c(this);
            return;
        }
        Context context = viewGroup.getContext();
        View view = u3.f14285c.c0;
        i.e(context, "context");
        c cVarX0 = c0746e.X0(context);
        if (cVarX0 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Animation animation = (Animation) cVarX0.f13623t;
        if (animation == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (u3.a != 1) {
            view.startAnimation(animation);
            u3.c(this);
            return;
        }
        viewGroup.startViewTransition(view);
        x xVar = new x(animation, viewGroup, view);
        xVar.setAnimationListener(new AnimationAnimationListenerC0744c(u3, viewGroup, view, this));
        view.startAnimation(xVar);
        if (e.K(2)) {
            u3.toString();
        }
    }
}
