package p091j3;

import B4.K;
import V0.p;
import V0.x;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class A extends p {
    @Override // V0.p
    public final void d(x xVar) {
        View view = xVar.f5163b;
        if (view instanceof TextView) {
            xVar.a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // V0.p
    public final void h(x xVar) {
        View view = xVar.f5163b;
        if (view instanceof TextView) {
            xVar.a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // V0.p
    public final Animator l(ViewGroup viewGroup, x xVar, x xVar2) {
        if (xVar == null || xVar2 == null || !(xVar.f5163b instanceof TextView)) {
            return null;
        }
        View view = xVar2.f5163b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        HashMap map = xVar.a;
        HashMap map2 = xVar2.a;
        float fFloatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        float fFloatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new K(textView, 10));
        return valueAnimatorOfFloat;
    }
}
