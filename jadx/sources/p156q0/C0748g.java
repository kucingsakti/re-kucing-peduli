package p156q0;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import java.util.Objects;
import o1.c;
import p031d.b;
import p210v8.i;

/* JADX INFO: renamed from: q0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0748g extends T {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0746e f14327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AnimatorSet f14328d;

    public C0748g(C0746e c0746e) {
        this.f14327c = c0746e;
    }

    @Override // p156q0.T
    public final void a(ViewGroup viewGroup) {
        i.f(viewGroup, "container");
        AnimatorSet animatorSet = this.f14328d;
        C0746e c0746e = this.f14327c;
        if (animatorSet == null) {
            ((U) c0746e.f577s).c(this);
            return;
        }
        U u3 = (U) c0746e.f577s;
        if (!u3.f14289g) {
            animatorSet.end();
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0750i.a.a(animatorSet);
        }
        if (e.K(2)) {
            u3.toString();
        }
    }

    @Override // p156q0.T
    public final void b(ViewGroup viewGroup) {
        i.f(viewGroup, "container");
        U u3 = (U) this.f14327c.f577s;
        AnimatorSet animatorSet = this.f14328d;
        if (animatorSet == null) {
            u3.c(this);
            return;
        }
        animatorSet.start();
        if (e.K(2)) {
            Objects.toString(u3);
        }
    }

    @Override // p156q0.T
    public final void c(b bVar, ViewGroup viewGroup) {
        i.f(bVar, "backEvent");
        i.f(viewGroup, "container");
        C0746e c0746e = this.f14327c;
        AnimatorSet animatorSet = this.f14328d;
        U u3 = (U) c0746e.f577s;
        if (animatorSet == null) {
            u3.c(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !u3.f14285c.f6614F) {
            return;
        }
        if (e.K(2)) {
            u3.toString();
        }
        long jA = C0749h.a.a(animatorSet);
        long j = (long) (bVar.f10433c * jA);
        if (j == 0) {
            j = 1;
        }
        if (j == jA) {
            j = jA - 1;
        }
        if (e.K(2)) {
            animatorSet.toString();
            u3.toString();
        }
        C0750i.a.b(animatorSet, j);
    }

    @Override // p156q0.T
    public final void d(ViewGroup viewGroup) {
        C0748g c0748g;
        i.f(viewGroup, "container");
        C0746e c0746e = this.f14327c;
        if (c0746e.Q0()) {
            return;
        }
        Context context = viewGroup.getContext();
        i.e(context, "context");
        c cVarX0 = c0746e.X0(context);
        this.f14328d = cVarX0 != null ? (AnimatorSet) cVarX0.f13624u : null;
        U u3 = (U) c0746e.f577s;
        androidx.fragment.app.b bVar = u3.f14285c;
        boolean z6 = u3.a == 3;
        View view = bVar.c0;
        viewGroup.startViewTransition(view);
        AnimatorSet animatorSet = this.f14328d;
        if (animatorSet != null) {
            c0748g = this;
            animatorSet.addListener(new C0747f(viewGroup, view, z6, u3, c0748g));
        } else {
            c0748g = this;
        }
        AnimatorSet animatorSet2 = c0748g.f14328d;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }
}
