package p091j3;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class v extends FrameLayout {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Drawable f12476s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Rect f12477t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Rect f12478u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f12479v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f12480w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f12481x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f12482y;

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f12477t == null || this.f12476s == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        boolean z6 = this.f12479v;
        Rect rect = this.f12478u;
        if (z6) {
            rect.set(0, 0, width, this.f12477t.top);
            this.f12476s.setBounds(rect);
            this.f12476s.draw(canvas);
        }
        if (this.f12480w) {
            rect.set(0, height - this.f12477t.bottom, width, height);
            this.f12476s.setBounds(rect);
            this.f12476s.draw(canvas);
        }
        if (this.f12481x) {
            Rect rect2 = this.f12477t;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.f12476s.setBounds(rect);
            this.f12476s.draw(canvas);
        }
        if (this.f12482y) {
            Rect rect3 = this.f12477t;
            rect.set(width - rect3.right, rect3.top, width, height - rect3.bottom);
            this.f12476s.setBounds(rect);
            this.f12476s.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f12476s;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f12476s;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z6) {
        this.f12480w = z6;
    }

    public void setDrawLeftInsetForeground(boolean z6) {
        this.f12481x = z6;
    }

    public void setDrawRightInsetForeground(boolean z6) {
        this.f12482y = z6;
    }

    public void setDrawTopInsetForeground(boolean z6) {
        this.f12479v = z6;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f12476s = drawable;
    }
}
