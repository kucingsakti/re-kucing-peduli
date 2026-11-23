package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.kcstream.cing.R;

/* JADX INFO: renamed from: p.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0740z extends RadioButton implements p000a0.r, p000a0.s {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final N0.e f14160s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0719o f14161t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final T f14162u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C0730u f14163v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0740z(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        O0.a(context);
        N0.a(this, getContext());
        N0.e eVar = new N0.e(this);
        this.f14160s = eVar;
        eVar.e(attributeSet, R.attr.radioButtonStyle);
        C0719o c0719o = new C0719o(this);
        this.f14161t = c0719o;
        c0719o.d(attributeSet, R.attr.radioButtonStyle);
        T t7 = new T(this);
        this.f14162u = t7;
        t7.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.radioButtonStyle);
    }

    private C0730u getEmojiTextViewHelper() {
        if (this.f14163v == null) {
            this.f14163v = new C0730u(this);
        }
        return this.f14163v;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0719o c0719o = this.f14161t;
        if (c0719o != null) {
            c0719o.a();
        }
        T t7 = this.f14162u;
        if (t7 != null) {
            t7.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0719o c0719o = this.f14161t;
        if (c0719o != null) {
            return c0719o.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0719o c0719o = this.f14161t;
        if (c0719o != null) {
            return c0719o.c();
        }
        return null;
    }

    @Override // p000a0.r
    public ColorStateList getSupportButtonTintList() {
        N0.e eVar = this.f14160s;
        if (eVar != null) {
            return (ColorStateList) eVar.f3267e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        N0.e eVar = this.f14160s;
        if (eVar != null) {
            return (PorterDuff.Mode) eVar.f3268f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14162u.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14162u.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().c(z6);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0719o c0719o = this.f14161t;
        if (c0719o != null) {
            c0719o.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0719o c0719o = this.f14161t;
        if (c0719o != null) {
            c0719o.f(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        N0.e eVar = this.f14160s;
        if (eVar != null) {
            if (eVar.f3265c) {
                eVar.f3265c = false;
            } else {
                eVar.f3265c = true;
                eVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        T t7 = this.f14162u;
        if (t7 != null) {
            t7.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        T t7 = this.f14162u;
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
        C0719o c0719o = this.f14161t;
        if (c0719o != null) {
            c0719o.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0719o c0719o = this.f14161t;
        if (c0719o != null) {
            c0719o.i(mode);
        }
    }

    @Override // p000a0.r
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        N0.e eVar = this.f14160s;
        if (eVar != null) {
            eVar.f3267e = colorStateList;
            eVar.a = true;
            eVar.a();
        }
    }

    @Override // p000a0.r
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        N0.e eVar = this.f14160s;
        if (eVar != null) {
            eVar.f3268f = mode;
            eVar.f3264b = true;
            eVar.a();
        }
    }

    @Override // p000a0.s
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        T t7 = this.f14162u;
        t7.l(colorStateList);
        t7.b();
    }

    @Override // p000a0.s
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        T t7 = this.f14162u;
        t7.m(mode);
        t7.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(p068ga.l.g(getContext(), i10));
    }
}
