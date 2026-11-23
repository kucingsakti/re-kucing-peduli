package p;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class X extends TextView implements p000a0.s {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0719o f14001s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final T f14002t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C0738y f14003u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C0730u f14004v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f14005w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public p102k7.e f14006x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Future f14007y;

    public X(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C0730u getEmojiTextViewHelper() {
        if (this.f14004v == null) {
            this.f14004v = new C0730u(this);
        }
        return this.f14004v;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0719o c0719o = this.f14001s;
        if (c0719o != null) {
            c0719o.a();
        }
        T t7 = this.f14002t;
        if (t7 != null) {
            t7.b();
        }
    }

    public final void g() {
        Future future = this.f14007y;
        if (future == null) {
            return;
        }
        try {
            this.f14007y = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            J7.j.m(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (f1.f14061c) {
            return super.getAutoSizeMaxTextSize();
        }
        T t7 = this.f14002t;
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
        T t7 = this.f14002t;
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
        T t7 = this.f14002t;
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
        T t7 = this.f14002t;
        return t7 != null ? t7.f13989i.f14052f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (f1.f14061c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        T t7 = this.f14002t;
        if (t7 != null) {
            return t7.f13989i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return J7.j.Y(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public U getSuperCaller() {
        if (this.f14006x == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                this.f14006x = new W(this);
            } else if (i10 >= 28) {
                this.f14006x = new V(this);
            } else if (i10 >= 26) {
                this.f14006x = new p102k7.e(this);
            }
        }
        return this.f14006x;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0719o c0719o = this.f14001s;
        if (c0719o != null) {
            return c0719o.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0719o c0719o = this.f14001s;
        if (c0719o != null) {
            return c0719o.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14002t.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14002t.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        g();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0738y c0738y;
        if (Build.VERSION.SDK_INT >= 28 || (c0738y = this.f14003u) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0738y.f14159c;
        return textClassifier == null ? M.a((TextView) c0738y.f14158b) : textClassifier;
    }

    public S.h getTextMetricsParamsCompat() {
        return J7.j.m(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f14002t.getClass();
        T.h(editorInfo, inputConnectionOnCreateInputConnection, this);
        com.bumptech.glide.d.w(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 || i10 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        super.onLayout(z6, i10, i11, i12, i13);
        T t7 = this.f14002t;
        if (t7 == null || f1.f14061c) {
            return;
        }
        t7.f13989i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        g();
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        T t7 = this.f14002t;
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
        T t7 = this.f14002t;
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
        T t7 = this.f14002t;
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
        T t7 = this.f14002t;
        if (t7 != null) {
            t7.k(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0719o c0719o = this.f14001s;
        if (c0719o != null) {
            c0719o.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0719o c0719o = this.f14001s;
        if (c0719o != null) {
            c0719o.f(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        T t7 = this.f14002t;
        if (t7 != null) {
            t7.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        T t7 = this.f14002t;
        if (t7 != null) {
            t7.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        T t7 = this.f14002t;
        if (t7 != null) {
            t7.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        T t7 = this.f14002t;
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

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().m(i10);
        } else {
            J7.j.I(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().h(i10);
        } else {
            J7.j.N(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        J7.j.O(this, i10);
    }

    public void setPrecomputedText(S.i iVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        J7.j.m(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0719o c0719o = this.f14001s;
        if (c0719o != null) {
            c0719o.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0719o c0719o = this.f14001s;
        if (c0719o != null) {
            c0719o.i(mode);
        }
    }

    @Override // p000a0.s
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        T t7 = this.f14002t;
        t7.l(colorStateList);
        t7.b();
    }

    @Override // p000a0.s
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        T t7 = this.f14002t;
        t7.m(mode);
        t7.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        T t7 = this.f14002t;
        if (t7 != null) {
            t7.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0738y c0738y;
        if (Build.VERSION.SDK_INT >= 28 || (c0738y = this.f14003u) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0738y.f14159c = textClassifier;
        }
    }

    public void setTextFuture(Future<S.i> future) {
        this.f14007y = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(S.h hVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = hVar.f4500b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i10 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i10 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i10 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i10 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i10 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i10 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i10 = 7;
            }
        }
        setTextDirection(i10);
        getPaint().set(hVar.a);
        p000a0.l.e(this, hVar.f4501c);
        p000a0.l.h(this, hVar.f4502d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f10) {
        boolean z6 = f1.f14061c;
        if (z6) {
            super.setTextSize(i10, f10);
            return;
        }
        T t7 = this.f14002t;
        if (t7 == null || z6) {
            return;
        }
        C0696c0 c0696c0 = t7.f13989i;
        if (c0696c0.f()) {
            return;
        }
        c0696c0.g(i10, f10);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i10) {
        Typeface typefaceCreate;
        if (this.f14005w) {
            return;
        }
        if (typeface == null || i10 <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            C4.a aVar = L.g.a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i10);
        }
        this.f14005w = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.f14005w = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        O0.a(context);
        this.f14005w = false;
        this.f14006x = null;
        N0.a(this, getContext());
        C0719o c0719o = new C0719o(this);
        this.f14001s = c0719o;
        c0719o.d(attributeSet, i10);
        T t7 = new T(this);
        this.f14002t = t7;
        t7.f(attributeSet, i10);
        t7.b();
        C0738y c0738y = new C0738y();
        c0738y.f14158b = this;
        this.f14003u = c0738y;
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i10, float f10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            getSuperCaller().n(i10, f10);
        } else if (i11 >= 34) {
            p000a0.o.a(this, i10, f10);
        } else {
            J7.j.O(this, Math.round(TypedValue.applyDimension(i10, f10, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? p068ga.l.g(context, i10) : null, i11 != 0 ? p068ga.l.g(context, i11) : null, i12 != 0 ? p068ga.l.g(context, i12) : null, i13 != 0 ? p068ga.l.g(context, i13) : null);
        T t7 = this.f14002t;
        if (t7 != null) {
            t7.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? p068ga.l.g(context, i10) : null, i11 != 0 ? p068ga.l.g(context, i11) : null, i12 != 0 ? p068ga.l.g(context, i12) : null, i13 != 0 ? p068ga.l.g(context, i13) : null);
        T t7 = this.f14002t;
        if (t7 != null) {
            t7.b();
        }
    }
}
