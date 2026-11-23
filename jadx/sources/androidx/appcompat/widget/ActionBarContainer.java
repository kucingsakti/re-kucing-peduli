package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.kcstream.cing.R;
import p.C0691a;
import p.L0;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f6069A;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f6070s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f6071t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public View f6072u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Drawable f6073v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Drawable f6074w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Drawable f6075x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f6076y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f6077z;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C0691a(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p069h.a.a);
        boolean z6 = false;
        this.f6073v = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f6074w = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f6069A = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f6076y = true;
            this.f6075x = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f6076y ? !(this.f6073v != null || this.f6074w != null) : this.f6075x == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f6073v;
        if (drawable != null && drawable.isStateful()) {
            this.f6073v.setState(getDrawableState());
        }
        Drawable drawable2 = this.f6074w;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f6074w.setState(getDrawableState());
        }
        Drawable drawable3 = this.f6075x;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f6075x.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f6073v;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f6074w;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f6075x;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f6071t = findViewById(R.id.action_bar);
        this.f6072u = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f6070s || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        super.onLayout(z6, i10, i11, i12, i13);
        boolean z10 = true;
        if (this.f6076y) {
            Drawable drawable = this.f6075x;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z10 = false;
            }
        } else {
            if (this.f6073v == null) {
                z10 = false;
            } else if (this.f6071t.getVisibility() == 0) {
                this.f6073v.setBounds(this.f6071t.getLeft(), this.f6071t.getTop(), this.f6071t.getRight(), this.f6071t.getBottom());
            } else {
                View view = this.f6072u;
                if (view == null || view.getVisibility() != 0) {
                    this.f6073v.setBounds(0, 0, 0, 0);
                } else {
                    this.f6073v.setBounds(this.f6072u.getLeft(), this.f6072u.getTop(), this.f6072u.getRight(), this.f6072u.getBottom());
                }
            }
            this.f6077z = false;
        }
        if (z10) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.f6071t == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = this.f6069A) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f6071t == null) {
            return;
        }
        View.MeasureSpec.getMode(i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f6073v;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f6073v);
        }
        this.f6073v = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f6071t;
            if (view != null) {
                this.f6073v.setBounds(view.getLeft(), this.f6071t.getTop(), this.f6071t.getRight(), this.f6071t.getBottom());
            }
        }
        boolean z6 = false;
        if (!this.f6076y ? !(this.f6073v != null || this.f6074w != null) : this.f6075x == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f6075x;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f6075x);
        }
        this.f6075x = drawable;
        boolean z6 = this.f6076y;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z6 && (drawable2 = this.f6075x) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z6 ? !(this.f6073v != null || this.f6074w != null) : this.f6075x == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f6074w;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f6074w);
        }
        this.f6074w = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f6077z && this.f6074w != null) {
                throw null;
            }
        }
        boolean z6 = false;
        if (!this.f6076y ? !(this.f6073v != null || this.f6074w != null) : this.f6075x == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z6) {
        this.f6070s = z6;
        setDescendantFocusability(z6 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z6 = i10 == 0;
        Drawable drawable = this.f6073v;
        if (drawable != null) {
            drawable.setVisible(z6, false);
        }
        Drawable drawable2 = this.f6074w;
        if (drawable2 != null) {
            drawable2.setVisible(z6, false);
        }
        Drawable drawable3 = this.f6075x;
        if (drawable3 != null) {
            drawable3.setVisible(z6, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f6073v;
        boolean z6 = this.f6076y;
        if (drawable == drawable2 && !z6) {
            return true;
        }
        if (drawable == this.f6074w && this.f6077z) {
            return true;
        }
        return (drawable == this.f6075x && z6) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }

    public void setTabContainer(L0 l4) {
    }
}
