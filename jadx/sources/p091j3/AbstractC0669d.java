package p091j3;

import Q2.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import p.AbstractC0731u0;

/* JADX INFO: renamed from: j3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0669d extends AbstractC0731u0 {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public Drawable f12431H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final Rect f12432I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final Rect f12433J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f12434K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final boolean f12435L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f12436M;

    public AbstractC0669d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12432I = new Rect();
        this.f12433J = new Rect();
        this.f12434K = 119;
        this.f12435L = true;
        this.f12436M = false;
        int[] iArr = a.f4022q;
        C.a(context, attributeSet, 0, 0);
        C.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f12434K = typedArrayObtainStyledAttributes.getInt(1, this.f12434K);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f12435L = typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f12431H;
        if (drawable != null) {
            if (this.f12436M) {
                this.f12436M = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z6 = this.f12435L;
                Rect rect = this.f12432I;
                if (z6) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i10 = this.f12434K;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f12433J;
                Gravity.apply(i10, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f12431H;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f12431H;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f12431H.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f12431H;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f12434K;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f12431H;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // p.AbstractC0731u0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        super.onLayout(z6, i10, i11, i12, i13);
        this.f12436M = z6 | this.f12436M;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f12436M = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f12431H;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f12431H);
            }
            this.f12431H = drawable;
            this.f12436M = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f12434K == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i10) {
        if (this.f12434K != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f12434K = i10;
            if (i10 == 119 && this.f12431H != null) {
                this.f12431H.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f12431H;
    }
}
