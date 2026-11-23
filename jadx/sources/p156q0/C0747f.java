package p156q0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import androidx.fragment.app.e;
import java.util.Objects;
import p210v8.i;

/* JADX INFO: renamed from: q0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0747f extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f14323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f14324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ U f14325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0748g f14326e;

    public C0747f(ViewGroup viewGroup, View view, boolean z6, U u3, C0748g c0748g) {
        this.a = viewGroup;
        this.f14323b = view;
        this.f14324c = z6;
        this.f14325d = u3;
        this.f14326e = c0748g;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        i.f(animator, "anim");
        ViewGroup viewGroup = this.a;
        View view = this.f14323b;
        viewGroup.endViewTransition(view);
        boolean z6 = this.f14324c;
        U u3 = this.f14325d;
        if (z6) {
            int i10 = u3.a;
            i.e(view, "viewToAnimate");
            AbstractC0487g.a(i10, view, viewGroup);
        }
        C0748g c0748g = this.f14326e;
        ((U) c0748g.f14327c.f577s).c(c0748g);
        if (e.K(2)) {
            Objects.toString(u3);
        }
    }
}
