package p215w3;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import p170r3.g;

/* JADX INFO: loaded from: classes.dex */
public final class f extends g {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final /* synthetic */ int f15553R = 0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public e f15554Q;

    @Override // p170r3.g
    public final void f(Canvas canvas) {
        if (this.f15554Q.f15552r.isEmpty()) {
            super.f(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f15554Q.f15552r);
        } else {
            canvas.clipRect(this.f15554Q.f15552r, Region.Op.DIFFERENCE);
        }
        super.f(canvas);
        canvas.restore();
    }

    @Override // p170r3.g, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f15554Q = new e(this.f15554Q);
        return this;
    }

    public final void r(float f10, float f11, float f12, float f13) {
        RectF rectF = this.f15554Q.f15552r;
        if (f10 == rectF.left && f11 == rectF.top && f12 == rectF.right && f13 == rectF.bottom) {
            return;
        }
        rectF.set(f10, f11, f12, f13);
        invalidateSelf();
    }
}
