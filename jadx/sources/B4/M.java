package B4;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes.dex */
public final class M extends AbstractC0167o {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f636A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f637B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public K f638C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public L f639D;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f640s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Paint f641t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public AnimatorSet f642u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f643v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f644w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f645x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f646y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f647z;

    public final void a(boolean z6) {
        ValueAnimator valueAnimatorOfFloat;
        float f10 = z6 ? 100.0f : 95.0f;
        AnimatorSet animatorSet = this.f642u;
        if (animatorSet != null && animatorSet.isStarted()) {
            this.f642u.cancel();
        }
        float f11 = this.f636A;
        if (f11 == 0.0f) {
            f11 = 1.0E-8f;
        }
        this.f636A = f11;
        K k3 = this.f638C;
        if (z6) {
            if (f11 < 95.0f) {
                valueAnimatorOfFloat = ValueAnimator.ofFloat(f11, 95.0f);
                valueAnimatorOfFloat.setDuration((long) (((1.0f - (this.f636A / 100.0f)) - 0.05f) * this.f645x));
                valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
                valueAnimatorOfFloat.addUpdateListener(k3);
            } else {
                valueAnimatorOfFloat = null;
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
            objectAnimatorOfFloat.setDuration(this.f646y);
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(95.0f, 100.0f);
            valueAnimatorOfFloat2.setDuration(this.f646y);
            valueAnimatorOfFloat2.addUpdateListener(k3);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(objectAnimatorOfFloat, valueAnimatorOfFloat2);
            if (valueAnimatorOfFloat != null) {
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.play(animatorSet2).after(valueAnimatorOfFloat);
                animatorSet2 = animatorSet3;
            }
            animatorSet2.addListener(this.f639D);
            animatorSet2.start();
            this.f642u = animatorSet2;
        } else {
            AnimatorSet animatorSet4 = new AnimatorSet();
            float f12 = f10 * 0.6f;
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(this.f636A, f12);
            ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(f12, f10);
            float f13 = (long) (((1.0f - (this.f636A / 100.0f)) - 0.05f) * this.f644w);
            valueAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat3.setDuration((long) (f13 * 0.4f));
            valueAnimatorOfFloat3.addUpdateListener(k3);
            valueAnimatorOfFloat4.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat4.setDuration((long) (0.6f * f13));
            valueAnimatorOfFloat4.addUpdateListener(k3);
            animatorSet4.play(valueAnimatorOfFloat4).after(valueAnimatorOfFloat3);
            animatorSet4.start();
            this.f642u = animatorSet4;
        }
        this.f647z = 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, (this.f636A / 100.0f) * getWidth(), getHeight(), this.f641t);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f642u;
        if (animatorSet == null || !animatorSet.isStarted()) {
            return;
        }
        this.f642u.cancel();
        this.f642u = null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode == Integer.MIN_VALUE && size > getContext().getResources().getDisplayMetrics().widthPixels) {
            size = getContext().getResources().getDisplayMetrics().widthPixels;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = this.f637B;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int i14;
        super.onSizeChanged(i10, i11, i12, i13);
        this.f643v = getMeasuredWidth();
        int i15 = getContext().getResources().getDisplayMetrics().widthPixels;
        int i16 = this.f643v;
        if (i16 >= i15) {
            i14 = 450;
            this.f645x = 450;
            this.f644w = 8000;
        } else {
            float f10 = i16 / i15;
            this.f644w = (int) (8000.0f * f10);
            this.f645x = (int) (450.0f * f10);
            i14 = (int) (f10 * 600.0f);
        }
        this.f646y = i14;
        String str = AbstractC0162j.a;
    }

    public void setColor(int i10) {
        this.f640s = i10;
        this.f641t.setColor(i10);
    }

    public void setProgress(float f10) {
        if (getVisibility() == 8) {
            setVisibility(0);
        }
        if (f10 >= 95.0f && this.f647z != 2) {
            a(true);
        }
    }

    public void setColor(String str) {
        setColor(Color.parseColor(str));
    }

    @Override // B4.AbstractC0167o
    public void setProgress(int i10) {
        setProgress(i10);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }
}
