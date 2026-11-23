package p097k;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import qa.b;

/* JADX INFO: loaded from: classes.dex */
public final class c extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ObjectAnimator f12613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f12614e;

    public c(AnimationDrawable animationDrawable, boolean z6, boolean z10) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i10 = z6 ? numberOfFrames - 1 : 0;
        int i11 = z6 ? 0 : numberOfFrames - 1;
        d dVar = new d();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        dVar.f12615b = numberOfFrames2;
        int[] iArr = dVar.a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            dVar.a = new int[numberOfFrames2];
        }
        int[] iArr2 = dVar.a;
        int i12 = 0;
        for (int i13 = 0; i13 < numberOfFrames2; i13++) {
            int duration = animationDrawable.getDuration(z6 ? (numberOfFrames2 - i13) - 1 : i13);
            iArr2[i13] = duration;
            i12 += duration;
        }
        dVar.f12616c = i12;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i10, i11);
        objectAnimatorOfInt.setAutoCancel(true);
        objectAnimatorOfInt.setDuration(dVar.f12616c);
        objectAnimatorOfInt.setInterpolator(dVar);
        this.f12614e = z10;
        this.f12613d = objectAnimatorOfInt;
    }

    @Override // qa.b
    public final void C() {
        this.f12613d.start();
    }

    @Override // qa.b
    public final void D() {
        this.f12613d.cancel();
    }

    @Override // qa.b
    public final boolean b() {
        return this.f12614e;
    }

    @Override // qa.b
    public final void z() {
        this.f12613d.reverse();
    }
}
