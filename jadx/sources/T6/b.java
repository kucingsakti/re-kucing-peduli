package T6;

import A1.C0099h;
import B4.K;
import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;

/* JADX INFO: loaded from: classes.dex */
public class b extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public R6.a f4668g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(C0099h c0099h, int i10) {
        super(c0099h);
        this.f4665d = i10;
    }

    @Override // T6.a
    public Animator a() {
        switch (this.f4665d) {
            case 0:
                return a();
            case 1:
                ValueAnimator valueAnimator = new ValueAnimator();
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
                valueAnimator.addUpdateListener(new K(this, 6));
                return valueAnimator;
            default:
                ValueAnimator valueAnimator2 = new ValueAnimator();
                valueAnimator2.setDuration(350L);
                valueAnimator2.setInterpolator(new AccelerateDecelerateInterpolator());
                valueAnimator2.addUpdateListener(new K(this, 7));
                return valueAnimator2;
        }
    }

    /* JADX INFO: renamed from: d */
    public ValueAnimator a() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350L);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new K(this, 3));
        return valueAnimator;
    }

    public PropertyValuesHolder e(boolean z6) {
        int i10;
        int i11;
        String str;
        if (z6) {
            i10 = this.f4667f;
            i11 = this.f4666e;
            str = "ANIMATION_COLOR_REVERSE";
        } else {
            i10 = this.f4666e;
            i11 = this.f4667f;
            str = "ANIMATION_COLOR";
        }
        PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i10, i11);
        propertyValuesHolderOfInt.setEvaluator(new ArgbEvaluator());
        return propertyValuesHolderOfInt;
    }

    public a f(float f10) {
        Animator animator = this.f4664c;
        if (animator != null) {
            long j = (long) (f10 * this.a);
            if (((ValueAnimator) animator).getValues() != null && ((ValueAnimator) this.f4664c).getValues().length > 0) {
                ((ValueAnimator) this.f4664c).setCurrentPlayTime(j);
            }
        }
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(C0099h c0099h) {
        super(c0099h);
        this.f4665d = 0;
        this.f4668g = new S6.a();
    }
}
