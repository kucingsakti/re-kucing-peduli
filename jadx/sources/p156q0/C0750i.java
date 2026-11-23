package p156q0;

import android.animation.AnimatorSet;
import p210v8.i;

/* JADX INFO: renamed from: q0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0750i {
    public static final C0750i a = new C0750i();

    public final void a(AnimatorSet animatorSet) {
        i.f(animatorSet, "animatorSet");
        animatorSet.reverse();
    }

    public final void b(AnimatorSet animatorSet, long j) {
        i.f(animatorSet, "animatorSet");
        animatorSet.setCurrentPlayTime(j);
    }
}
