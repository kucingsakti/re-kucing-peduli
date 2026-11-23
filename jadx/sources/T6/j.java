package T6;

import A1.C0099h;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class j implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ S6.h a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f4693c;

    public j(l lVar, S6.h hVar, boolean z6) {
        this.f4693c = lVar;
        this.a = hVar;
        this.f4692b = z6;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        l lVar = this.f4693c;
        lVar.getClass();
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        boolean z6 = lVar.f4700g;
        S6.h hVar = this.a;
        boolean z10 = this.f4692b;
        if (z6) {
            if (z10) {
                hVar.a = iIntValue;
            } else {
                hVar.f4541b = iIntValue;
            }
        } else if (z10) {
            hVar.f4541b = iIntValue;
        } else {
            hVar.a = iIntValue;
        }
        C0099h c0099h = lVar.f4663b;
        if (c0099h != null) {
            c0099h.p(hVar);
        }
    }
}
