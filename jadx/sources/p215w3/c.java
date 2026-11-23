package p215w3;

import E4.L;
import J7.j;
import R2.a;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.kcstream.cing.R;
import p181s3.d;

/* JADX INFO: loaded from: classes.dex */
public final class c extends m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15544f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f15545g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f15546h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public EditText f15547i;
    public final L j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final W1.c f15548k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AnimatorSet f15549l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ValueAnimator f15550m;

    public c(l lVar) {
        super(lVar);
        this.j = new L(this, 4);
        this.f15548k = new W1.c(this, 1);
        this.f15543e = j.C(lVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f15544f = j.C(lVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f15545g = j.D(lVar.getContext(), R.attr.motionEasingLinearInterpolator, a.a);
        this.f15546h = j.D(lVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, a.f4443d);
    }

    @Override // p215w3.m
    public final void a() {
        if (this.f15592b.f15577H != null) {
            return;
        }
        t(u());
    }

    @Override // p215w3.m
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // p215w3.m
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // p215w3.m
    public final View.OnFocusChangeListener e() {
        return this.f15548k;
    }

    @Override // p215w3.m
    public final View.OnClickListener f() {
        return this.j;
    }

    @Override // p215w3.m
    public final View.OnFocusChangeListener g() {
        return this.f15548k;
    }

    @Override // p215w3.m
    public final void m(EditText editText) {
        this.f15547i = editText;
        this.a.setEndIconVisible(u());
    }

    @Override // p215w3.m
    public final void p(boolean z6) {
        if (this.f15592b.f15577H == null) {
            return;
        }
        t(z6);
    }

    @Override // p215w3.m
    public final void r() {
        final int i10 = 1;
        final int i11 = 0;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f15546h);
        valueAnimatorOfFloat.setDuration(this.f15544f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: w3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f15541b;

            {
                this.f15541b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i10) {
                    case 0:
                        c cVar = this.f15541b;
                        cVar.getClass();
                        cVar.f15594d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        c cVar2 = this.f15541b;
                        cVar2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = cVar2.f15594d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f15545g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i12 = this.f15543e;
        valueAnimatorOfFloat2.setDuration(i12);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: w3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f15541b;

            {
                this.f15541b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i11) {
                    case 0:
                        c cVar = this.f15541b;
                        cVar.getClass();
                        cVar.f15594d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        c cVar2 = this.f15541b;
                        cVar2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = cVar2.f15594d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f15549l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f15549l.addListener(new b(this, i11));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i12);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: w3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f15541b;

            {
                this.f15541b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i11) {
                    case 0:
                        c cVar = this.f15541b;
                        cVar.getClass();
                        cVar.f15594d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        c cVar2 = this.f15541b;
                        cVar2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = cVar2.f15594d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.f15550m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new b(this, i10));
    }

    @Override // p215w3.m
    public final void s() {
        EditText editText = this.f15547i;
        if (editText != null) {
            editText.post(new d(this, 4));
        }
    }

    public final void t(boolean z6) {
        boolean z10 = this.f15592b.d() == z6;
        if (z6 && !this.f15549l.isRunning()) {
            this.f15550m.cancel();
            this.f15549l.start();
            if (z10) {
                this.f15549l.end();
                return;
            }
            return;
        }
        if (z6) {
            return;
        }
        this.f15549l.cancel();
        this.f15550m.start();
        if (z10) {
            this.f15550m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.f15547i;
        if (editText != null) {
            return (editText.hasFocus() || this.f15594d.hasFocus()) && this.f15547i.getText().length() > 0;
        }
        return false;
    }
}
