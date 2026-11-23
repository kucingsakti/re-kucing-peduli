package p156q0;

import O3.z;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.e;
import java.util.Objects;
import p210v8.i;

/* JADX INFO: renamed from: q0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class AnimationAnimationListenerC0744c implements Animation.AnimationListener {
    public final /* synthetic */ U a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f14316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f14317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0745d f14318d;

    public AnimationAnimationListenerC0744c(U u3, ViewGroup viewGroup, View view, C0745d c0745d) {
        this.a = u3;
        this.f14316b = viewGroup;
        this.f14317c = view;
        this.f14318d = c0745d;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        i.f(animation, "animation");
        View view = this.f14317c;
        C0745d c0745d = this.f14318d;
        ViewGroup viewGroup = this.f14316b;
        viewGroup.post(new z(viewGroup, view, c0745d, 9));
        if (e.K(2)) {
            Objects.toString(this.a);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        i.f(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        i.f(animation, "animation");
        if (e.K(2)) {
            Objects.toString(this.a);
        }
    }
}
