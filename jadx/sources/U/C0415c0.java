package U;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;

/* JADX INFO: renamed from: U.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0415c0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4800b;

    public /* synthetic */ C0415c0(P0.d dVar, View view) {
        this.a = 0;
        this.f4800b = dVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ((View) ((p078i.S) ((P0.d) this.f4800b).f3811t).f12007e.getParent()).invalidate();
                break;
            case 1:
                Z2.c cVar = (Z2.c) this.f4800b;
                cVar.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cVar.j.setAlpha((int) (255.0f * fFloatValue));
                cVar.f5853x = fFloatValue;
                break;
            case 2:
                ((DrawerLayout) this.f4800b).setScrimColor(L.a.d(-1728053248, R2.a.c(p118m3.a.a, valueAnimator.getAnimatedFraction(), 0)));
                break;
            default:
                p215w3.i iVar = (p215w3.i) this.f4800b;
                iVar.getClass();
                iVar.f15594d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }

    public /* synthetic */ C0415c0(Object obj, int i10) {
        this.a = i10;
        this.f4800b = obj;
    }
}
