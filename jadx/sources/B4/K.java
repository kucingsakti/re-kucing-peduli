package B4;

import A1.C0099h;
import J0.C0255e;
import android.animation.ValueAnimator;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.mukesh.OtpView;

/* JADX INFO: loaded from: classes.dex */
public final class K implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f634b;

    public /* synthetic */ K(Object obj, int i10) {
        this.a = i10;
        this.f634b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                M m2 = (M) this.f634b;
                m2.f636A = fFloatValue;
                m2.invalidate();
                break;
            case 1:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C0255e c0255e = (C0255e) this.f634b;
                c0255e.f2280c.setAlpha(iFloatValue);
                c0255e.f2281d.setAlpha(iFloatValue);
                c0255e.f2295s.invalidate();
                break;
            case 2:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                OtpView otpView = (OtpView) this.f634b;
                otpView.f10289F.setTextSize(otpView.getTextSize() * fFloatValue2);
                otpView.f10289F.setAlpha((int) (255.0f * fFloatValue2));
                otpView.postInvalidate();
                break;
            case 3:
                T6.b bVar = (T6.b) this.f634b;
                bVar.getClass();
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR")).intValue();
                int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
                S6.a aVar = (S6.a) bVar.f4668g;
                aVar.a = iIntValue;
                aVar.f4530b = iIntValue2;
                C0099h c0099h = bVar.f4663b;
                if (c0099h != null) {
                    c0099h.p(aVar);
                }
                break;
            case 4:
                T6.e eVar = (T6.e) this.f634b;
                eVar.getClass();
                int iIntValue3 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR")).intValue();
                int iIntValue4 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
                int iIntValue5 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_RADIUS")).intValue();
                int iIntValue6 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_RADIUS_REVERSE")).intValue();
                int iIntValue7 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_STROKE")).intValue();
                int iIntValue8 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_STROKE_REVERSE")).intValue();
                S6.c cVar = eVar.f4676h;
                cVar.a = iIntValue3;
                cVar.f4530b = iIntValue4;
                cVar.f4533c = iIntValue5;
                cVar.f4534d = iIntValue6;
                cVar.f4535e = iIntValue7;
                cVar.f4536f = iIntValue8;
                C0099h c0099h2 = eVar.f4663b;
                if (c0099h2 != null) {
                    c0099h2.p(cVar);
                }
                break;
            case 5:
                T6.g gVar = (T6.g) this.f634b;
                gVar.getClass();
                int iIntValue9 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR")).intValue();
                int iIntValue10 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
                int iIntValue11 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_SCALE")).intValue();
                int iIntValue12 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_SCALE_REVERSE")).intValue();
                S6.d dVar = gVar.j;
                dVar.a = iIntValue9;
                dVar.f4530b = iIntValue10;
                dVar.f4537c = iIntValue11;
                dVar.f4538d = iIntValue12;
                C0099h c0099h3 = gVar.f4663b;
                if (c0099h3 != null) {
                    c0099h3.p(dVar);
                }
                break;
            case 6:
                T6.b bVar2 = (T6.b) this.f634b;
                bVar2.getClass();
                int iIntValue13 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE")).intValue();
                S6.e eVar2 = (S6.e) bVar2.f4668g;
                eVar2.a = iIntValue13;
                C0099h c0099h4 = bVar2.f4663b;
                if (c0099h4 != null) {
                    c0099h4.p(eVar2);
                }
                break;
            case 7:
                T6.b bVar3 = (T6.b) this.f634b;
                bVar3.getClass();
                int iIntValue14 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE")).intValue();
                int iIntValue15 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE_REVERSE")).intValue();
                S6.f fVar = (S6.f) bVar3.f4668g;
                fVar.a = iIntValue14;
                fVar.f4539b = iIntValue15;
                C0099h c0099h5 = bVar3.f4663b;
                if (c0099h5 != null) {
                    c0099h5.p(fVar);
                }
                break;
            case 8:
                T6.i iVar = (T6.i) this.f634b;
                iVar.getClass();
                int iIntValue16 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                S6.g gVar2 = iVar.f4691i;
                gVar2.f4540c = iIntValue16;
                C0099h c0099h6 = iVar.f4663b;
                if (c0099h6 != null) {
                    c0099h6.p(gVar2);
                }
                break;
            case 9:
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p170r3.g gVar3 = ((BottomSheetBehavior) this.f634b).f9488A;
                if (gVar3 != null) {
                    gVar3.m(fFloatValue3);
                }
                break;
            case 10:
                float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView textView = (TextView) this.f634b;
                textView.setScaleX(fFloatValue4);
                textView.setScaleY(fFloatValue4);
                break;
            case 11:
                ((TabLayout) this.f634b).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                break;
            default:
                ((TextInputLayout) this.f634b).f9882N0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
