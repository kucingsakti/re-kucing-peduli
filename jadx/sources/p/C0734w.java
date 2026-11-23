package p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* JADX INFO: renamed from: p.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0734w extends MultiAutoCompleteTextView implements p000a0.s {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int[] f14151v = {R.attr.popupBackground};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0719o f14152s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final T f14153t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C0738y f14154u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0734w(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.kcstream.cing.R.attr.autoCompleteTextViewStyle);
        O0.a(context);
        N0.a(this, getContext());
        Y1.c cVarE = Y1.c.E(getContext(), attributeSet, f14151v, com.kcstream.cing.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) cVarE.f5671u).hasValue(0)) {
            setDropDownBackgroundDrawable(cVarE.v(0));
        }
        cVarE.J();
        C0719o c0719o = new C0719o(this);
        this.f14152s = c0719o;
        c0719o.d(attributeSet, com.kcstream.cing.R.attr.autoCompleteTextViewStyle);
        T t7 = new T(this);
        this.f14153t = t7;
        t7.f(attributeSet, com.kcstream.cing.R.attr.autoCompleteTextViewStyle);
        t7.b();
        C0738y c0738y = new C0738y(this);
        this.f14154u = c0738y;
        c0738y.b(attributeSet, com.kcstream.cing.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerA = c0738y.a(keyListener);
        if (keyListenerA == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerA);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0719o c0719o = this.f14152s;
        if (c0719o != null) {
            c0719o.a();
        }
        T t7 = this.f14153t;
        if (t7 != null) {
            t7.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0719o c0719o = this.f14152s;
        if (c0719o != null) {
            return c0719o.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0719o c0719o = this.f14152s;
        if (c0719o != null) {
            return c0719o.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14153t.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14153t.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        com.bumptech.glide.d.w(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.f14154u.c(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0719o c0719o = this.f14152s;
        if (c0719o != null) {
            c0719o.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0719o c0719o = this.f14152s;
        if (c0719o != null) {
            c0719o.f(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        T t7 = this.f14153t;
        if (t7 != null) {
            t7.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        T t7 = this.f14153t;
        if (t7 != null) {
            t7.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(p068ga.l.g(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        this.f14154u.d(z6);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f14154u.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0719o c0719o = this.f14152s;
        if (c0719o != null) {
            c0719o.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0719o c0719o = this.f14152s;
        if (c0719o != null) {
            c0719o.i(mode);
        }
    }

    @Override // p000a0.s
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        T t7 = this.f14153t;
        t7.l(colorStateList);
        t7.b();
    }

    @Override // p000a0.s
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        T t7 = this.f14153t;
        t7.m(mode);
        t7.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        T t7 = this.f14153t;
        if (t7 != null) {
            t7.g(context, i10);
        }
    }
}
