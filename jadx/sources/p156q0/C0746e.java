package p156q0;

import B1.a;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.b;
import com.kcstream.cing.R;
import o1.c;
import p210v8.i;

/* JADX INFO: renamed from: q0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0746e extends a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f14320t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f14321u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public c f14322v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0746e(U u3, boolean z6) {
        super(u3);
        i.f(u3, "operation");
        this.f14320t = z6;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0027  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e7 A[Catch: RuntimeException -> 0x00ed, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x00ed, blocks: (B:78:0x00e1, B:80:0x00e7), top: B:91:0x00e1 }] */
    public final c X0(Context context) {
        int i10;
        c cVar;
        Animator animatorLoadAnimator;
        int iE;
        if (this.f14321u) {
            return this.f14322v;
        }
        U u3 = (U) this.f577s;
        b bVar = u3.f14285c;
        boolean z6 = u3.a == 2;
        C0760t c0760t = bVar.f0;
        int i11 = c0760t == null ? 0 : c0760t.f14362f;
        if (this.f14320t) {
            if (z6) {
                if (c0760t == null) {
                    i10 = 0;
                } else {
                    i10 = c0760t.f14360d;
                }
            } else if (c0760t == null) {
                i10 = 0;
            } else {
                i10 = c0760t.f14361e;
            }
        } else if (z6) {
            if (c0760t == null) {
                i10 = 0;
            } else {
                i10 = c0760t.f14358b;
            }
        } else if (c0760t == null) {
            i10 = 0;
        } else {
            i10 = c0760t.f14359c;
        }
        bVar.a0(0, 0, 0, 0);
        ViewGroup viewGroup = bVar.f6635b0;
        c cVar2 = null;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            bVar.f6635b0.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = bVar.f6635b0;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            if (i10 == 0 && i11 != 0) {
                if (i11 == 4097) {
                    iE = z6 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                } else if (i11 == 8194) {
                    iE = z6 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
                } else if (i11 == 8197) {
                    iE = z6 ? qa.b.E(context, android.R.attr.activityCloseEnterAnimation) : qa.b.E(context, android.R.attr.activityCloseExitAnimation);
                } else if (i11 == 4099) {
                    iE = z6 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
                } else if (i11 != 4100) {
                    iE = -1;
                } else {
                    iE = z6 ? qa.b.E(context, android.R.attr.activityOpenEnterAnimation) : qa.b.E(context, android.R.attr.activityOpenExitAnimation);
                }
                i10 = iE;
            }
            if (i10 != 0) {
                boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(i10));
                if (zEquals) {
                    try {
                        Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, i10);
                        if (animationLoadAnimation != null) {
                            cVar = new c(animationLoadAnimation, 17);
                            cVar2 = cVar;
                        }
                    } catch (Resources.NotFoundException e10) {
                        throw e10;
                    } catch (RuntimeException unused) {
                        try {
                            animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i10);
                            if (animatorLoadAnimator != null) {
                                cVar = new c(animatorLoadAnimator);
                                cVar2 = cVar;
                            }
                        } catch (RuntimeException e11) {
                            if (zEquals) {
                                throw e11;
                            }
                            Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, i10);
                            if (animationLoadAnimation2 != null) {
                                cVar2 = new c(animationLoadAnimation2, 17);
                            }
                        }
                    }
                } else {
                    animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i10);
                    if (animatorLoadAnimator != null) {
                        cVar = new c(animatorLoadAnimator);
                        cVar2 = cVar;
                    }
                }
            }
        }
        this.f14322v = cVar2;
        this.f14321u = true;
        return cVar2;
    }
}
