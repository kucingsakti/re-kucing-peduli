package T6;

import A1.C0099h;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f4669b;

    public c(d dVar, int i10) {
        this.f4669b = dVar;
        this.a = i10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        d dVar = this.f4669b;
        dVar.getClass();
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        int iD = p239z.e.d(this.a);
        S6.b bVar = dVar.f4675i;
        if (iD == 0) {
            bVar.a = iIntValue;
        } else if (iD == 1) {
            bVar.f4531b = iIntValue;
        } else if (iD == 2) {
            bVar.f4532c = iIntValue;
        }
        C0099h c0099h = dVar.f4663b;
        if (c0099h != null) {
            c0099h.p(bVar);
        }
    }
}
