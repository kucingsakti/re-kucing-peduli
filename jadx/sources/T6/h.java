package T6;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;

/* JADX INFO: loaded from: classes.dex */
public final class h extends g {
    @Override // T6.g
    public final PropertyValuesHolder g(boolean z6) {
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
        PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i10, i11);
        propertyValuesHolderOfInt.setEvaluator(new IntEvaluator());
        return propertyValuesHolderOfInt;
    }
}
