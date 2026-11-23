package com.onesignal.inAppMessages.internal.display.impl;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final h INSTANCE = new h();

    private h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: animateViewColor$lambda-0, reason: not valid java name */
    public static final void m13animateViewColor$lambda0(View view, ValueAnimator valueAnimator) {
        p210v8.i.f(view, "$view");
        p210v8.i.f(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        p210v8.i.d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        view.setBackgroundColor(((Integer) animatedValue).intValue());
    }

    public final Animation animateViewByTranslation(View view, float f10, float f11, int i10, Interpolator interpolator, Animation.AnimationListener animationListener) {
        p210v8.i.f(view, "view");
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, f10, f11);
        translateAnimation.setDuration(i10);
        translateAnimation.setInterpolator(interpolator);
        if (animationListener != null) {
            translateAnimation.setAnimationListener(animationListener);
        }
        view.setAnimation(translateAnimation);
        return translateAnimation;
    }

    public final ValueAnimator animateViewColor(View view, int i10, int i11, int i12, Animator.AnimatorListener animatorListener) {
        p210v8.i.f(view, "view");
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(i10);
        valueAnimator.setIntValues(i11, i12);
        valueAnimator.setEvaluator(new ArgbEvaluator());
        valueAnimator.addUpdateListener(new X1.a(view, 1));
        if (animatorListener != null) {
            valueAnimator.addListener(animatorListener);
        }
        return valueAnimator;
    }

    public final Animation animateViewSmallToLarge(View view, int i10, Interpolator interpolator, Animation.AnimationListener animationListener) {
        p210v8.i.f(view, "view");
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(i10);
        scaleAnimation.setInterpolator(interpolator);
        if (animationListener != null) {
            scaleAnimation.setAnimationListener(animationListener);
        }
        view.setAnimation(scaleAnimation);
        return scaleAnimation;
    }
}
