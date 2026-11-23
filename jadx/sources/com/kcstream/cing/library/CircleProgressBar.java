package com.kcstream.cing.library;

import D4.e;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.Keep;
import kotlin.Metadata;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0011\u0010\u000eJ\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0014J\u0015\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u0017J\r\u0010\u001b\u001a\u00020\u0012¢\u0006\u0004\b\u001b\u0010\u0014J\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0012¢\u0006\u0004\b\u001d\u0010\u0017J\u0015\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/kcstream/cing/library/CircleProgressBar;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "getStrokeWidth", "()F", "strokeWidth", "Lh8/m;", "setStrokeWidth", "(F)V", "getProgress", "progress", "setProgress", "", "getMin", "()I", "min", "setMin", "(I)V", "getMax", "max", "setMax", "getColor", "color", "setColor", "setProgressWithAnimation", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CircleProgressBar extends View {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Paint f10270A;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f10271s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f10272t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f10273u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10274v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f10275w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f10276x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final RectF f10277y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Paint f10278z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i.f(context, "context");
        i.f(attributeSet, "attrs");
        this.f10271s = 4.0f;
        this.f10274v = 100;
        this.f10275w = -90;
        this.f10276x = -12303292;
        this.f10277y = new RectF();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, e.a, 0, 0);
        i.e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.f10271s = typedArrayObtainStyledAttributes.getDimension(3, this.f10271s);
            this.f10272t = typedArrayObtainStyledAttributes.getFloat(2, this.f10272t);
            this.f10276x = typedArrayObtainStyledAttributes.getInt(4, this.f10276x);
            this.f10273u = typedArrayObtainStyledAttributes.getInt(1, this.f10273u);
            this.f10274v = typedArrayObtainStyledAttributes.getInt(0, this.f10274v);
            typedArrayObtainStyledAttributes.recycle();
            Paint paint = new Paint(1);
            this.f10278z = paint;
            int i10 = this.f10276x;
            paint.setColor(Color.argb(Math.round(Color.alpha(i10) * 0.3f), Color.red(i10), Color.green(i10), Color.blue(i10)));
            Paint paint2 = this.f10278z;
            i.c(paint2);
            Paint.Style style = Paint.Style.STROKE;
            paint2.setStyle(style);
            Paint paint3 = this.f10278z;
            i.c(paint3);
            paint3.setStrokeWidth(this.f10271s);
            Paint paint4 = new Paint(1);
            this.f10270A = paint4;
            paint4.setColor(this.f10276x);
            Paint paint5 = this.f10270A;
            i.c(paint5);
            paint5.setStyle(style);
            Paint paint6 = this.f10270A;
            i.c(paint6);
            paint6.setStrokeWidth(this.f10271s);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: getColor, reason: from getter */
    public final int getF10276x() {
        return this.f10276x;
    }

    /* JADX INFO: renamed from: getMax, reason: from getter */
    public final int getF10274v() {
        return this.f10274v;
    }

    /* JADX INFO: renamed from: getMin, reason: from getter */
    public final int getF10273u() {
        return this.f10273u;
    }

    /* JADX INFO: renamed from: getProgress, reason: from getter */
    public final float getF10272t() {
        return this.f10272t;
    }

    /* JADX INFO: renamed from: getStrokeWidth, reason: from getter */
    public final float getF10271s() {
        return this.f10271s;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        i.f(canvas, "canvas");
        super.onDraw(canvas);
        RectF rectF = this.f10277y;
        i.c(rectF);
        Paint paint = this.f10278z;
        i.c(paint);
        canvas.drawOval(rectF, paint);
        float f10 = (360 * this.f10272t) / this.f10274v;
        RectF rectF2 = this.f10277y;
        i.c(rectF2);
        float f11 = this.f10275w;
        Paint paint2 = this.f10270A;
        i.c(paint2);
        canvas.drawArc(rectF2, f11, f10, false, paint2);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int iMin = Math.min(View.getDefaultSize(getSuggestedMinimumWidth(), i10), View.getDefaultSize(getSuggestedMinimumHeight(), i11));
        setMeasuredDimension(iMin, iMin);
        RectF rectF = this.f10277y;
        i.c(rectF);
        float f10 = 0;
        float f11 = this.f10271s;
        float f12 = 2;
        float f13 = iMin;
        rectF.set((f11 / f12) + f10, (f11 / f12) + f10, f13 - (f11 / f12), f13 - (f11 / f12));
    }

    public final void setColor(int color) {
        this.f10276x = color;
        Paint paint = this.f10278z;
        i.c(paint);
        paint.setColor(Color.argb(Math.round(Color.alpha(color) * 0.3f), Color.red(color), Color.green(color), Color.blue(color)));
        Paint paint2 = this.f10270A;
        i.c(paint2);
        paint2.setColor(color);
        invalidate();
        requestLayout();
    }

    public final void setMax(int max) {
        this.f10274v = max;
        invalidate();
    }

    public final void setMin(int min) {
        this.f10273u = min;
        invalidate();
    }

    @Keep
    public final void setProgress(float progress) {
        this.f10272t = progress;
        invalidate();
    }

    public final void setProgressWithAnimation(float progress) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "progress", progress);
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        objectAnimatorOfFloat.start();
    }

    public final void setStrokeWidth(float strokeWidth) {
        this.f10271s = strokeWidth;
        Paint paint = this.f10278z;
        i.c(paint);
        paint.setStrokeWidth(strokeWidth);
        Paint paint2 = this.f10270A;
        i.c(paint2);
        paint2.setStrokeWidth(strokeWidth);
        invalidate();
        requestLayout();
    }
}
