package T6;

import A1.C0099h;
import android.animation.Animator;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0099h f4663b;
    public long a = 350;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Animator f4664c = a();

    public a(C0099h c0099h) {
        this.f4663b = c0099h;
    }

    public abstract Animator a();

    public final void b(long j) {
        this.a = j;
        Animator animator = this.f4664c;
        if (animator instanceof ValueAnimator) {
            animator.setDuration(j);
        }
    }

    public final void c() {
        Animator animator = this.f4664c;
        if (animator == null || animator.isRunning()) {
            return;
        }
        this.f4664c.start();
    }
}
