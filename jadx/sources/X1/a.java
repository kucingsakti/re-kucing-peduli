package X1;

import android.animation.ValueAnimator;
import android.view.View;
import com.onesignal.inAppMessages.internal.display.impl.h;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f5380b;

    public /* synthetic */ a(View view, int i10) {
        this.a = i10;
        this.f5380b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                View view = this.f5380b;
                view.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                view.requestLayout();
                break;
            default:
                h.m13animateViewColor$lambda0(this.f5380b, valueAnimator);
                break;
        }
    }
}
