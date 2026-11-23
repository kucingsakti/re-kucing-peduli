package T6;

import A1.C0099h;
import B4.K;
import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;

/* JADX INFO: loaded from: classes.dex */
public class g extends b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4689h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f4690i;
    public final S6.d j;

    public g(C0099h c0099h) {
        super(c0099h);
        this.j = new S6.d();
    }

    @Override // T6.b, T6.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final ValueAnimator a() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350L);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new K(this, 5));
        return valueAnimator;
    }

    public PropertyValuesHolder g(boolean z6) {
        int i10;
        int i11;
        String str;
        if (z6) {
            i11 = this.f4689h;
            i10 = (int) (i11 * this.f4690i);
            str = "ANIMATION_SCALE_REVERSE";
        } else {
            i10 = this.f4689h;
            i11 = (int) (i10 * this.f4690i);
            str = "ANIMATION_SCALE";
        }
        PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i11, i10);
        propertyValuesHolderOfInt.setEvaluator(new IntEvaluator());
        return propertyValuesHolderOfInt;
    }

    public final void h(int i10, int i11, int i12, float f10) {
        if (this.f4664c != null) {
            if (this.f4666e == i10 && this.f4667f == i11 && this.f4689h == i12 && this.f4690i == f10) {
                return;
            }
            this.f4666e = i10;
            this.f4667f = i11;
            this.f4689h = i12;
            this.f4690i = f10;
            ((ValueAnimator) this.f4664c).setValues(e(false), e(true), g(false), g(true));
        }
    }
}
