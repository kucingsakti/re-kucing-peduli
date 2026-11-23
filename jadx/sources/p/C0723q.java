package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.kcstream.cing.R;

/* JADX INFO: renamed from: p.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0723q extends CheckedTextView implements p000a0.s {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final N0.e f14109s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0719o f14110t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final T f14111u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C0730u f14112v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0723q(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        O0.a(context);
        N0.a(this, getContext());
        T t7 = new T(this);
        this.f14111u = t7;
        t7.f(attributeSet, R.attr.checkedTextViewStyle);
        t7.b();
        C0719o c0719o = new C0719o(this);
        this.f14110t = c0719o;
        c0719o.d(attributeSet, R.attr.checkedTextViewStyle);
        this.f14109s = new N0.e(this);
        Context context2 = getContext();
        int[] iArr = p069h.a.f11619l;
        Y1.c cVarE = Y1.c.E(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) cVarE.f5671u;
        U.U.m(this, getContext(), iArr, attributeSet, (TypedArray) cVarE.f5671u, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(p068ga.l.g(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(p068ga.l.g(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(p068ga.l.g(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(cVarE.u(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(AbstractC0710j0.c(typedArray.getInt(3, -1), null));
            }
            cVarE.J();
            getEmojiTextViewHelper().b(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            cVarE.J();
            throw th;
        }
    }

    private C0730u getEmojiTextViewHelper() {
        if (this.f14112v == null) {
            this.f14112v = new C0730u(this);
        }
        return this.f14112v;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        T t7 = this.f14111u;
        if (t7 != null) {
            t7.b();
        }
        C0719o c0719o = this.f14110t;
        if (c0719o != null) {
            c0719o.a();
        }
        N0.e eVar = this.f14109s;
        if (eVar != null) {
            eVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return J7.j.Y(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0719o c0719o = this.f14110t;
        if (c0719o != null) {
            return c0719o.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0719o c0719o = this.f14110t;
        if (c0719o != null) {
            return c0719o.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        N0.e eVar = this.f14109s;
        if (eVar != null) {
            return (ColorStateList) eVar.f3267e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        N0.e eVar = this.f14109s;
        if (eVar != null) {
            return (PorterDuff.Mode) eVar.f3268f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14111u.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14111u.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        com.bumptech.glide.d.w(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().c(z6);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0719o c0719o = this.f14110t;
        if (c0719o != null) {
            c0719o.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0719o c0719o = this.f14110t;
        if (c0719o != null) {
            c0719o.f(i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        N0.e eVar = this.f14109s;
        if (eVar != null) {
            if (eVar.f3265c) {
                eVar.f3265c = false;
            } else {
                eVar.f3265c = true;
                eVar.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        T t7 = this.f14111u;
        if (t7 != null) {
            t7.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        T t7 = this.f14111u;
        if (t7 != null) {
            t7.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(J7.j.Z(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        getEmojiTextViewHelper().d(z6);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0719o c0719o = this.f14110t;
        if (c0719o != null) {
            c0719o.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0719o c0719o = this.f14110t;
        if (c0719o != null) {
            c0719o.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        N0.e eVar = this.f14109s;
        if (eVar != null) {
            eVar.f3267e = colorStateList;
            eVar.a = true;
            eVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        N0.e eVar = this.f14109s;
        if (eVar != null) {
            eVar.f3268f = mode;
            eVar.f3264b = true;
            eVar.b();
        }
    }

    @Override // p000a0.s
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        T t7 = this.f14111u;
        t7.l(colorStateList);
        t7.b();
    }

    @Override // p000a0.s
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        T t7 = this.f14111u;
        t7.m(mode);
        t7.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        T t7 = this.f14111u;
        if (t7 != null) {
            t7.g(context, i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(p068ga.l.g(getContext(), i10));
    }
}
