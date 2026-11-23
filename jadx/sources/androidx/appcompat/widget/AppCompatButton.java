package androidx.appcompat.widget;

import J7.j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.kcstream.cing.R;
import p.C0696c0;
import p.C0719o;
import p.C0730u;
import p.N0;
import p.O0;
import p.T;
import p.f1;
import p000a0.s;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatButton extends Button implements s {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0719o f6141s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final T f6142t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C0730u f6143u;

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    private C0730u getEmojiTextViewHelper() {
        if (this.f6143u == null) {
            this.f6143u = new C0730u(this);
        }
        return this.f6143u;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0719o c0719o = this.f6141s;
        if (c0719o != null) {
            c0719o.a();
        }
        T t7 = this.f6142t;
        if (t7 != null) {
            t7.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (f1.f14061c) {
            return super.getAutoSizeMaxTextSize();
        }
        T t7 = this.f6142t;
        if (t7 != null) {
            return Math.round(t7.f13989i.f14051e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (f1.f14061c) {
            return super.getAutoSizeMinTextSize();
        }
        T t7 = this.f6142t;
        if (t7 != null) {
            return Math.round(t7.f13989i.f14050d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (f1.f14061c) {
            return super.getAutoSizeStepGranularity();
        }
        T t7 = this.f6142t;
        if (t7 != null) {
            return Math.round(t7.f13989i.f14049c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (f1.f14061c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        T t7 = this.f6142t;
        return t7 != null ? t7.f13989i.f14052f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (f1.f14061c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        T t7 = this.f6142t;
        if (t7 != null) {
            return t7.f13989i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return j.Y(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0719o c0719o = this.f6141s;
        if (c0719o != null) {
            return c0719o.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0719o c0719o = this.f6141s;
        if (c0719o != null) {
            return c0719o.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f6142t.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f6142t.e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        super.onLayout(z6, i10, i11, i12, i13);
        T t7 = this.f6142t;
        if (t7 == null || f1.f14061c) {
            return;
        }
        t7.f13989i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        T t7 = this.f6142t;
        if (t7 == null || f1.f14061c) {
            return;
        }
        C0696c0 c0696c0 = t7.f13989i;
        if (c0696c0.f()) {
            c0696c0.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().c(z6);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (f1.f14061c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        T t7 = this.f6142t;
        if (t7 != null) {
            t7.i(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (f1.f14061c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        T t7 = this.f6142t;
        if (t7 != null) {
            t7.j(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (f1.f14061c) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        T t7 = this.f6142t;
        if (t7 != null) {
            t7.k(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0719o c0719o = this.f6141s;
        if (c0719o != null) {
            c0719o.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0719o c0719o = this.f6141s;
        if (c0719o != null) {
            c0719o.f(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(j.Z(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        getEmojiTextViewHelper().d(z6);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z6) {
        T t7 = this.f6142t;
        if (t7 != null) {
            t7.a.setAllCaps(z6);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0719o c0719o = this.f6141s;
        if (c0719o != null) {
            c0719o.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0719o c0719o = this.f6141s;
        if (c0719o != null) {
            c0719o.i(mode);
        }
    }

    @Override // p000a0.s
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        T t7 = this.f6142t;
        t7.l(colorStateList);
        t7.b();
    }

    @Override // p000a0.s
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        T t7 = this.f6142t;
        t7.m(mode);
        t7.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        T t7 = this.f6142t;
        if (t7 != null) {
            t7.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f10) {
        boolean z6 = f1.f14061c;
        if (z6) {
            super.setTextSize(i10, f10);
            return;
        }
        T t7 = this.f6142t;
        if (t7 == null || z6) {
            return;
        }
        C0696c0 c0696c0 = t7.f13989i;
        if (c0696c0.f()) {
            return;
        }
        c0696c0.g(i10, f10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        O0.a(context);
        N0.a(this, getContext());
        C0719o c0719o = new C0719o(this);
        this.f6141s = c0719o;
        c0719o.d(attributeSet, i10);
        T t7 = new T(this);
        this.f6142t = t7;
        t7.f(attributeSet, i10);
        t7.b();
        getEmojiTextViewHelper().b(attributeSet, i10);
    }
}
