package p190t3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f15167b;

    public /* synthetic */ a(f fVar, int i10) {
        this.a = i10;
        this.f15167b = fVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.f15167b.b();
                break;
            case 1:
                this.f15167b.c();
                break;
            case 2:
                this.f15167b.b();
                break;
            default:
                this.f15167b.c();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                f fVar = this.f15167b;
                SnackbarContentLayout snackbarContentLayout = fVar.j;
                int i10 = fVar.f15190c;
                int i11 = fVar.a;
                int i12 = i10 - i11;
                snackbarContentLayout.f9809s.setAlpha(0.0f);
                long j = i11;
                ViewPropertyAnimator duration = snackbarContentLayout.f9809s.animate().alpha(1.0f).setDuration(j);
                TimeInterpolator timeInterpolator = snackbarContentLayout.f9811u;
                long j10 = i12;
                duration.setInterpolator(timeInterpolator).setStartDelay(j10).start();
                if (snackbarContentLayout.f9810t.getVisibility() == 0) {
                    snackbarContentLayout.f9810t.setAlpha(0.0f);
                    snackbarContentLayout.f9810t.animate().alpha(1.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j10).start();
                }
                break;
            case 2:
                f fVar2 = this.f15167b;
                SnackbarContentLayout snackbarContentLayout2 = fVar2.j;
                snackbarContentLayout2.f9809s.setAlpha(1.0f);
                ViewPropertyAnimator viewPropertyAnimatorAlpha = snackbarContentLayout2.f9809s.animate().alpha(0.0f);
                long j11 = fVar2.f15189b;
                ViewPropertyAnimator duration2 = viewPropertyAnimatorAlpha.setDuration(j11);
                TimeInterpolator timeInterpolator2 = snackbarContentLayout2.f9811u;
                long j12 = 0;
                duration2.setInterpolator(timeInterpolator2).setStartDelay(j12).start();
                if (snackbarContentLayout2.f9810t.getVisibility() == 0) {
                    snackbarContentLayout2.f9810t.setAlpha(1.0f);
                    snackbarContentLayout2.f9810t.animate().alpha(0.0f).setDuration(j11).setInterpolator(timeInterpolator2).setStartDelay(j12).start();
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ a(f fVar, int i10, int i11) {
        this.a = i11;
        this.f15167b = fVar;
    }
}
