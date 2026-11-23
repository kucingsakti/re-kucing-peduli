package com.thefinestartist.finestwebview.views;

import J.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.kcstream.cing.R;
import p066g7.a;

/* JADX INFO: loaded from: classes.dex */
public class ShadowLayout extends FrameLayout {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f10330s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f10331t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f10332u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f10333v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f10334w;

    public ShadowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, a.a, 0, 0);
        if (typedArrayObtainStyledAttributes != null) {
            try {
                this.f10332u = typedArrayObtainStyledAttributes.getDimension(0, getResources().getDimension(R.dimen.defaultMenuDropShadowCornerRadius));
                this.f10331t = typedArrayObtainStyledAttributes.getDimension(4, getResources().getDimension(R.dimen.defaultMenuDropShadowSize));
                this.f10333v = typedArrayObtainStyledAttributes.getDimension(1, 0.0f);
                this.f10334w = typedArrayObtainStyledAttributes.getDimension(2, 0.0f);
                this.f10330s = typedArrayObtainStyledAttributes.getColor(3, b.a(getContext(), R.color.finestBlack10));
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        a();
    }

    public final void a() {
        int iAbs = (int) (Math.abs(this.f10333v) + this.f10331t);
        int iAbs2 = (int) (Math.abs(this.f10334w) + this.f10331t);
        setPadding(iAbs, iAbs2, iAbs, iAbs2);
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return 0;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return 0;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        float f10 = this.f10332u;
        float f11 = this.f10331t;
        float f12 = this.f10333v;
        float f13 = this.f10334w;
        int i10 = this.f10330s;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ALPHA_8);
        Canvas canvas2 = new Canvas(bitmapCreateBitmap);
        RectF rectF = new RectF(f11, f11, width - f11, height - f11);
        if (f13 > 0.0f) {
            rectF.top += f13;
            rectF.bottom -= f13;
        } else if (f13 < 0.0f) {
            rectF.top = Math.abs(f13) + rectF.top;
            rectF.bottom -= Math.abs(f13);
        }
        if (f12 > 0.0f) {
            rectF.left += f12;
            rectF.right -= f12;
        } else if (f12 < 0.0f) {
            rectF.left = Math.abs(f12) + rectF.left;
            rectF.right -= Math.abs(f12);
        }
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setShadowLayer(f11, f12, f13, i10);
        canvas2.drawRoundRect(rectF, f10, f10, paint);
        setBackground(new BitmapDrawable(getResources(), bitmapCreateBitmap));
    }

    public void setCornerRadius(float f10) {
        this.f10332u = f10;
        invalidate();
    }

    public void setDx(float f10) {
        this.f10333v = f10;
        a();
    }

    public void setDy(float f10) {
        this.f10334w = f10;
        a();
    }

    public void setShadowColor(int i10) {
        this.f10330s = i10;
        invalidate();
    }

    public void setShadowSize(float f10) {
        this.f10331t = f10;
        a();
    }
}
