package T6;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4672f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4673g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4674h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public S6.b f4675i;

    @Override // T6.a
    public final Animator a() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        return animatorSet;
    }

    public final ValueAnimator d(int i10, int i11, long j, int i12) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i10, i11);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.setDuration(j);
        valueAnimatorOfInt.addUpdateListener(new c(this, i12));
        return valueAnimatorOfInt;
    }
}
