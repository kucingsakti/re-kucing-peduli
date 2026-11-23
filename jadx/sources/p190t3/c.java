package p190t3;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;
import android.view.ViewParent;
import p091j3.C;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f15169s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f15170t;

    public /* synthetic */ c(f fVar, int i10) {
        this.f15169s = i10;
        this.f15170t = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        f fVar = this.f15170t;
        int i10 = 1;
        byte b3 = 0;
        switch (this.f15169s) {
            case 0:
                if (fVar.f15196i != null && (context = fVar.f15195h) != null) {
                    int iHeight = C.f(context).height();
                    int[] iArr = new int[2];
                    e eVar = fVar.f15196i;
                    eVar.getLocationInWindow(iArr);
                    int height = (iHeight - (eVar.getHeight() + iArr[1])) + ((int) fVar.f15196i.getTranslationY());
                    int i11 = fVar.f15202p;
                    if (height < i11) {
                        ViewGroup.LayoutParams layoutParams = fVar.f15196i.getLayoutParams();
                        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                            Log.w(f.f15188z, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                        } else {
                            int i12 = fVar.f15202p;
                            fVar.f15203q = i12;
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.bottomMargin = (i12 - height) + marginLayoutParams.bottomMargin;
                            fVar.f15196i.requestLayout();
                        }
                    } else {
                        fVar.f15203q = i11;
                    }
                    break;
                }
                break;
            case 1:
                fVar.b();
                break;
            default:
                e eVar2 = fVar.f15196i;
                if (eVar2 != null) {
                    ViewParent parent = eVar2.getParent();
                    e eVar3 = fVar.f15196i;
                    if (parent != null) {
                        eVar3.setVisibility(0);
                    }
                    if (eVar3.getAnimationMode() != 1) {
                        int height2 = eVar3.getHeight();
                        ViewGroup.LayoutParams layoutParams2 = eVar3.getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            height2 += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        }
                        eVar3.setTranslationY(height2);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        valueAnimator.setIntValues(height2, 0);
                        valueAnimator.setInterpolator(fVar.f15192e);
                        valueAnimator.setDuration(fVar.f15190c);
                        valueAnimator.addListener(new a(fVar, i10));
                        valueAnimator.addUpdateListener(new b(fVar, height2));
                        valueAnimator.start();
                    } else {
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.setInterpolator(fVar.f15191d);
                        valueAnimatorOfFloat.addUpdateListener(new b(fVar, b3, b3));
                        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
                        valueAnimatorOfFloat2.setInterpolator(fVar.f15193f);
                        valueAnimatorOfFloat2.addUpdateListener(new b(fVar, i10, b3));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
                        animatorSet.setDuration(fVar.a);
                        animatorSet.addListener(new a(fVar, 3));
                        animatorSet.start();
                    }
                    break;
                }
                break;
        }
    }
}
