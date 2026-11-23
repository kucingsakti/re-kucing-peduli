package T6;

import A1.C0099h;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class l extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4700g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final S6.h f4701h;

    public l(C0099h c0099h) {
        super(c0099h);
        this.f4701h = new S6.h();
    }

    @Override // T6.a
    public final Animator a() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        return animatorSet;
    }

    public final k d(boolean z6) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (z6) {
            int i14 = this.f4697d;
            int i15 = this.f4699f;
            i10 = i14 + i15;
            int i16 = this.f4698e;
            i11 = i16 + i15;
            i12 = i14 - i15;
            i13 = i16 - i15;
        } else {
            int i17 = this.f4697d;
            int i18 = this.f4699f;
            i10 = i17 - i18;
            int i19 = this.f4698e;
            i11 = i19 - i18;
            i12 = i17 + i18;
            i13 = i19 + i18;
        }
        k kVar = new k();
        kVar.a = i10;
        kVar.f4694b = i11;
        kVar.f4695c = i12;
        kVar.f4696d = i13;
        return kVar;
    }

    public final ValueAnimator e(int i10, int i11, long j, boolean z6, S6.h hVar) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i10, i11);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.setDuration(j);
        valueAnimatorOfInt.addUpdateListener(new j(this, hVar, z6));
        return valueAnimatorOfInt;
    }

    public l f(float f10) {
        Animator animator = this.f4664c;
        if (animator != null) {
            long j = (long) (f10 * this.a);
            Iterator<Animator> it = ((AnimatorSet) animator).getChildAnimations().iterator();
            while (it.hasNext()) {
                ValueAnimator valueAnimator = (ValueAnimator) it.next();
                long duration = valueAnimator.getDuration();
                if (j <= duration) {
                    duration = j;
                }
                valueAnimator.setCurrentPlayTime(duration);
                j -= duration;
            }
        }
        return this;
    }
}
