package p190t3;

import android.animation.ValueAnimator;
import p178s0.a;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f15168b;

    public /* synthetic */ b(f fVar, int i10, byte b3) {
        this.a = i10;
        this.f15168b = fVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        f fVar = this.f15168b;
        switch (this.a) {
            case 0:
                fVar.f15196i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fVar.f15196i.setScaleX(fFloatValue);
                fVar.f15196i.setScaleY(fFloatValue);
                break;
            case 2:
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                a aVar = f.f15183u;
                fVar.f15196i.setTranslationY(iIntValue);
                break;
            default:
                int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                a aVar2 = f.f15183u;
                fVar.f15196i.setTranslationY(iIntValue2);
                break;
        }
    }

    public b(f fVar, int i10) {
        this.a = 2;
        this.f15168b = fVar;
    }
}
