package T6;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class i extends l {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public S6.g f4691i;

    @Override // T6.l
    public final /* bridge */ /* synthetic */ l f(float f10) {
        g(f10);
        return this;
    }

    public final void g(float f10) {
        Animator animator = this.f4664c;
        if (animator != null) {
            long j = (long) (f10 * this.a);
            int size = ((AnimatorSet) animator).getChildAnimations().size();
            for (int i10 = 0; i10 < size; i10++) {
                ValueAnimator valueAnimator = (ValueAnimator) ((AnimatorSet) this.f4664c).getChildAnimations().get(i10);
                long startDelay = j - valueAnimator.getStartDelay();
                long duration = valueAnimator.getDuration();
                if (startDelay > duration) {
                    startDelay = duration;
                } else if (startDelay < 0) {
                    startDelay = 0;
                }
                if ((i10 != size - 1 || startDelay > 0) && valueAnimator.getValues() != null && valueAnimator.getValues().length > 0) {
                    valueAnimator.setCurrentPlayTime(startDelay);
                }
            }
        }
    }
}
