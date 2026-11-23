package p202v;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Drawable {
    public float a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f15369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f15370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f15371d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f15372e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ColorStateList f15375h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f15376i;
    public ColorStateList j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15373f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15374g = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f15377k = PorterDuff.Mode.SRC_IN;

    public b(ColorStateList colorStateList, float f10) {
        this.a = f10;
        Paint paint = new Paint(5);
        this.f15369b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f15375h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f15375h.getDefaultColor()));
        this.f15370c = new RectF();
        this.f15371d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.f15370c;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.f15371d;
        rect2.set(rect);
        if (this.f15373f) {
            rect2.inset((int) Math.ceil(c.a(this.f15372e, this.a, this.f15374g)), (int) Math.ceil(c.b(this.f15372e, this.a, this.f15374g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z6;
        Paint paint = this.f15369b;
        if (this.f15376i == null || paint.getColorFilter() != null) {
            z6 = false;
        } else {
            paint.setColorFilter(this.f15376i);
            z6 = true;
        }
        RectF rectF = this.f15370c;
        float f10 = this.a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z6) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f15371d, this.a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f15375h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f15375h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f15369b;
        boolean z6 = colorForState != paint.getColor();
        if (z6) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.j;
        if (colorStateList2 == null || (mode = this.f15377k) == null) {
            return z6;
        }
        this.f15376i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f15369b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f15369b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        this.f15376i = a(colorStateList, this.f15377k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f15377k = mode;
        this.f15376i = a(this.j, mode);
        invalidateSelf();
    }
}
