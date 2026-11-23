package T6;

import B4.K;
import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;

/* JADX INFO: loaded from: classes.dex */
public final class e extends b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public S6.c f4676h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4677i;
    public int j;

    @Override // T6.b, T6.a
    /* JADX INFO: renamed from: d */
    public final ValueAnimator a() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350L);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new K(this, 4));
        return valueAnimator;
    }

    public final PropertyValuesHolder g(boolean z6) {
        int i10;
        int i11;
        String str;
        if (z6) {
            i11 = this.f4677i;
            i10 = i11 / 2;
            str = "ANIMATION_RADIUS_REVERSE";
        } else {
            i10 = this.f4677i;
            i11 = i10 / 2;
            str = "ANIMATION_RADIUS";
        }
        PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i10, i11);
        propertyValuesHolderOfInt.setEvaluator(new IntEvaluator());
        return propertyValuesHolderOfInt;
    }

    public final PropertyValuesHolder h(boolean z6) {
        int i10;
        String str;
        int i11 = 0;
        if (z6) {
            str = "ANIMATION_STROKE_REVERSE";
            i11 = this.f4677i;
            i10 = 0;
        } else {
            i10 = this.f4677i;
            str = "ANIMATION_STROKE";
        }
        PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i11, i10);
        propertyValuesHolderOfInt.setEvaluator(new IntEvaluator());
        return propertyValuesHolderOfInt;
    }
}
