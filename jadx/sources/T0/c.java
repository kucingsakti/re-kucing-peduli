package T0;

import android.animation.Animator;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Animator.AnimatorListener {
    public final /* synthetic */ d a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f4590b;

    public c(e eVar, d dVar) {
        this.f4590b = eVar;
        this.a = dVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        e eVar = this.f4590b;
        d dVar = this.a;
        eVar.a(1.0f, dVar, true);
        dVar.f4599k = dVar.f4594e;
        dVar.f4600l = dVar.f4595f;
        dVar.f4601m = dVar.f4596g;
        dVar.a((dVar.j + 1) % dVar.f4598i.length);
        if (!eVar.f4618x) {
            eVar.f4617w += 1.0f;
            return;
        }
        eVar.f4618x = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        if (dVar.f4602n) {
            dVar.f4602n = false;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f4590b.f4617w = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }
}
