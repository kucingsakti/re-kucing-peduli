package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import p.C0719o;
import p.E;
import p.F;
import p.G;
import p.H;
import p.K;
import p.L;
import p.N0;
import p068ga.l;
import p118m3.k;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Spinner {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int[] f6277A = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0719o f6278s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Context f6279t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final E f6280u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public SpinnerAdapter f6281v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f6282w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final L f6283x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f6284y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Rect f6285z;

    /* JADX WARN: Code duplicated, block: B:26:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d7  */
    public c(Context context, AttributeSet attributeSet) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, com.kcstream.cing.R.attr.spinnerStyle);
        this.f6285z = new Rect();
        N0.a(this, getContext());
        int[] iArr = p069h.a.f11629v;
        Y1.c cVarE = Y1.c.E(context, attributeSet, iArr, com.kcstream.cing.R.attr.spinnerStyle);
        this.f6278s = new C0719o(this);
        TypedArray typedArray = (TypedArray) cVarE.f5671u;
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f6279t = new p125n.b(context, resourceId);
        } else {
            this.f6279t = context;
        }
        int i10 = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f6277A, com.kcstream.cing.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i10 = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Exception e10) {
                    e = e10;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                    if (typedArrayObtainStyledAttributes != null) {
                    }
                    if (i10 != 0) {
                        G g8 = new G(this);
                        this.f6283x = g8;
                        g8.f13943u = typedArray.getString(2);
                    } else if (i10 == 1) {
                        K k3 = new K(this, this.f6279t, attributeSet);
                        Y1.c cVarE2 = Y1.c.E(this.f6279t, attributeSet, iArr, com.kcstream.cing.R.attr.spinnerStyle);
                        this.f6284y = ((TypedArray) cVarE2.f5671u).getLayoutDimension(3, -2);
                        k3.h(cVarE2.v(1));
                        k3.f13958V = typedArray.getString(2);
                        cVarE2.J();
                        this.f6283x = k3;
                        this.f6280u = new E(this, this, k3);
                    }
                    textArray = typedArray.getTextArray(0);
                    if (textArray != null) {
                        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                        arrayAdapter.setDropDownViewResource(com.kcstream.cing.R.layout.support_simple_spinner_dropdown_item);
                        setAdapter((SpinnerAdapter) arrayAdapter);
                    }
                    cVarE.J();
                    this.f6282w = true;
                    spinnerAdapter = this.f6281v;
                    if (spinnerAdapter != null) {
                        setAdapter(spinnerAdapter);
                        this.f6281v = null;
                    }
                    this.f6278s.d(attributeSet, com.kcstream.cing.R.attr.spinnerStyle);
                }
            } catch (Throwable th) {
                th = th;
                typedArray2 = typedArrayObtainStyledAttributes;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray2 != null) {
                typedArray2.recycle();
            }
            throw th;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i10 != 0) {
            G g10 = new G(this);
            this.f6283x = g10;
            g10.f13943u = typedArray.getString(2);
        } else if (i10 == 1) {
            K k10 = new K(this, this.f6279t, attributeSet);
            Y1.c cVarE3 = Y1.c.E(this.f6279t, attributeSet, iArr, com.kcstream.cing.R.attr.spinnerStyle);
            this.f6284y = ((TypedArray) cVarE3.f5671u).getLayoutDimension(3, -2);
            k10.h(cVarE3.v(1));
            k10.f13958V = typedArray.getString(2);
            cVarE3.J();
            this.f6283x = k10;
            this.f6280u = new E(this, this, k10);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter2.setDropDownViewResource(com.kcstream.cing.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        cVarE.J();
        this.f6282w = true;
        spinnerAdapter = this.f6281v;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f6281v = null;
        }
        this.f6278s.d(attributeSet, com.kcstream.cing.R.attr.spinnerStyle);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f6285z;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0719o c0719o = this.f6278s;
        if (c0719o != null) {
            c0719o.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        L l4 = this.f6283x;
        return l4 != null ? l4.c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        L l4 = this.f6283x;
        return l4 != null ? l4.m() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f6283x != null ? this.f6284y : super.getDropDownWidth();
    }

    public final L getInternalPopup() {
        return this.f6283x;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        L l4 = this.f6283x;
        return l4 != null ? l4.e() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f6279t;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        L l4 = this.f6283x;
        return l4 != null ? l4.o() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0719o c0719o = this.f6278s;
        if (c0719o != null) {
            return c0719o.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0719o c0719o = this.f6278s;
        if (c0719o != null) {
            return c0719o.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        L l4 = this.f6283x;
        if (l4 == null || !l4.b()) {
            return;
        }
        l4.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f6283x == null || View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        AppCompatSpinner$SavedState appCompatSpinner$SavedState = (AppCompatSpinner$SavedState) parcelable;
        super.onRestoreInstanceState(appCompatSpinner$SavedState.getSuperState());
        if (!appCompatSpinner$SavedState.f6147s || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new k(this, 3));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        AppCompatSpinner$SavedState appCompatSpinner$SavedState = new AppCompatSpinner$SavedState(super.onSaveInstanceState());
        L l4 = this.f6283x;
        appCompatSpinner$SavedState.f6147s = l4 != null && l4.b();
        return appCompatSpinner$SavedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        E e10 = this.f6280u;
        if (e10 == null || !e10.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        L l4 = this.f6283x;
        if (l4 == null) {
            return super.performClick();
        }
        if (l4.b()) {
            return true;
        }
        this.f6283x.l(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0719o c0719o = this.f6278s;
        if (c0719o != null) {
            c0719o.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0719o c0719o = this.f6278s;
        if (c0719o != null) {
            c0719o.f(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        L l4 = this.f6283x;
        if (l4 == null) {
            super.setDropDownHorizontalOffset(i10);
        } else {
            l4.j(i10);
            l4.k(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        L l4 = this.f6283x;
        if (l4 != null) {
            l4.i(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f6283x != null) {
            this.f6284y = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        L l4 = this.f6283x;
        if (l4 != null) {
            l4.h(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(l.g(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        L l4 = this.f6283x;
        if (l4 != null) {
            l4.g(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0719o c0719o = this.f6278s;
        if (c0719o != null) {
            c0719o.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0719o c0719o = this.f6278s;
        if (c0719o != null) {
            c0719o.i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f6282w) {
            this.f6281v = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        L l4 = this.f6283x;
        if (l4 != null) {
            Context context = this.f6279t;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            H h10 = new H();
            h10.a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                h10.f13945b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                F.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            l4.p(h10);
        }
    }
}
