package p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: renamed from: p.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0698d0 extends ToggleButton implements p000a0.s {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0719o f14057s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final T f14058t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C0730u f14059u;

    public C0698d0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        N0.a(this, getContext());
        C0719o c0719o = new C0719o(this);
        this.f14057s = c0719o;
        c0719o.d(attributeSet, R.attr.buttonStyleToggle);
        T t7 = new T(this);
        this.f14058t = t7;
        t7.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.buttonStyleToggle);
    }

    private C0730u getEmojiTextViewHelper() {
        if (this.f14059u == null) {
            this.f14059u = new C0730u(this);
        }
        return this.f14059u;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0719o c0719o = this.f14057s;
        if (c0719o != null) {
            c0719o.a();
        }
        T t7 = this.f14058t;
        if (t7 != null) {
            t7.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0719o c0719o = this.f14057s;
        if (c0719o != null) {
            return c0719o.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0719o c0719o = this.f14057s;
        if (c0719o != null) {
            return c0719o.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14058t.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14058t.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().c(z6);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0719o c0719o = this.f14057s;
        if (c0719o != null) {
            c0719o.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0719o c0719o = this.f14057s;
        if (c0719o != null) {
            c0719o.f(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        T t7 = this.f14058t;
        if (t7 != null) {
            t7.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        T t7 = this.f14058t;
        if (t7 != null) {
            t7.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z6) {
        getEmojiTextViewHelper().d(z6);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0719o c0719o = this.f14057s;
        if (c0719o != null) {
            c0719o.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0719o c0719o = this.f14057s;
        if (c0719o != null) {
            c0719o.i(mode);
        }
    }

    @Override // p000a0.s
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        T t7 = this.f14058t;
        t7.l(colorStateList);
        t7.b();
    }

    @Override // p000a0.s
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        T t7 = this.f14058t;
        t7.m(mode);
        t7.b();
    }
}
