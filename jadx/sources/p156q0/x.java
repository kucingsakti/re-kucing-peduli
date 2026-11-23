package p156q0;

import U.ViewTreeObserverOnPreDrawListenerC0435v;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes.dex */
public final class x extends AnimationSet implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ViewGroup f14373s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final View f14374t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f14375u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f14376v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f14377w;

    public x(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f14377w = true;
        this.f14373s = viewGroup;
        this.f14374t = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.f14377w = true;
        if (this.f14375u) {
            return !this.f14376v;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f14375u = true;
            ViewTreeObserverOnPreDrawListenerC0435v.a(this.f14373s, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z6 = this.f14375u;
        ViewGroup viewGroup = this.f14373s;
        if (z6 || !this.f14377w) {
            viewGroup.endViewTransition(this.f14374t);
            this.f14376v = true;
        } else {
            this.f14377w = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f10) {
        this.f14377w = true;
        if (this.f14375u) {
            return !this.f14376v;
        }
        if (!super.getTransformation(j, transformation, f10)) {
            this.f14375u = true;
            ViewTreeObserverOnPreDrawListenerC0435v.a(this.f14373s, this);
        }
        return true;
    }
}
