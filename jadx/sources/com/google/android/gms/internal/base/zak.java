package com.google.android.gms.internal.base;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class zak extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f8311s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f8312t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f8313u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f8314v;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i10 = this.f8311s;
        boolean z6 = false;
        boolean z10 = true;
        if (i10 != 1) {
            if (i10 == 2 && this.f8312t >= 0) {
                float f10 = 0;
                float fUptimeMillis = (SystemClock.uptimeMillis() - this.f8312t) / f10;
                z10 = fUptimeMillis >= 1.0f;
                if (z10) {
                    this.f8311s = 0;
                }
                this.f8314v = (int) ((Math.min(fUptimeMillis, 1.0f) * f10) + 0.0f);
            }
            z6 = z10;
        } else {
            this.f8312t = SystemClock.uptimeMillis();
            this.f8311s = 2;
        }
        if (!z6) {
            throw null;
        }
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        super.getChangingConfigurations();
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.f8314v == this.f8313u) {
            this.f8314v = i10;
        }
        this.f8313u = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
