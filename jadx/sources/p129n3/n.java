package p129n3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class n extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f13377b;

    public /* synthetic */ n(o oVar, int i10) {
        this.a = i10;
        this.f13377b = oVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationEnd(animator);
                o oVar = this.f13377b;
                oVar.c();
                c cVar = oVar.f13382B;
                if (cVar != null) {
                    cVar.a((k) oVar.f725s);
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationRepeat(animator);
                o oVar = this.f13377b;
                oVar.f13387y = (oVar.f13387y + 1) % oVar.f13386x.f13390c.length;
                oVar.f13388z = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
