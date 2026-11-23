package J0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: renamed from: J0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0254d extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2274c;

    public C0254d(View view, boolean z6) {
        this.a = 2;
        this.f2273b = z6;
        this.f2274c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                this.f2273b = true;
                break;
            case 1:
                this.f2273b = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                if (!this.f2273b) {
                    C0255e c0255e = (C0255e) this.f2274c;
                    if (((Float) c0255e.f2302z.getAnimatedValue()).floatValue() != 0.0f) {
                        c0255e.f2277A = 2;
                        c0255e.f2295s.invalidate();
                    } else {
                        c0255e.f2277A = 0;
                        c0255e.g(0);
                    }
                } else {
                    this.f2273b = false;
                }
                break;
            case 1:
                p081i3.i iVar = (p081i3.i) this.f2274c;
                iVar.f12255r = 0;
                iVar.f12249l = null;
                if (!this.f2273b) {
                    iVar.f12256s.a(4, false);
                }
                break;
            default:
                if (!this.f2273b) {
                    ((View) this.f2274c).setVisibility(4);
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                p081i3.i iVar = (p081i3.i) this.f2274c;
                iVar.f12256s.a(0, false);
                iVar.f12255r = 1;
                iVar.f12249l = animator;
                this.f2273b = false;
                break;
            case 2:
                if (this.f2273b) {
                    ((View) this.f2274c).setVisibility(0);
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C0254d(p081i3.i iVar) {
        this.a = 1;
        this.f2274c = iVar;
    }

    public C0254d(C0255e c0255e) {
        this.a = 0;
        this.f2274c = c0255e;
        this.f2273b = false;
    }
}
