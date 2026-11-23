package p215w3;

import B4.C0154b;
import C8.E;
import D3.b;
import E0.a;
import E4.C0187a;
import U.U;
import Y1.c;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.kcstream.cing.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p.X;
import p091j3.C;
import p136o.ViewOnAttachStateChangeListenerC0686d;

/* JADX INFO: loaded from: classes.dex */
public final class l extends LinearLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f15570A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final LinkedHashSet f15571B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ColorStateList f15572C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f15573D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f15574E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public ImageView.ScaleType f15575F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public View.OnLongClickListener f15576G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public CharSequence f15577H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final X f15578I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f15579J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public EditText f15580K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final AccessibilityManager f15581L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public C0187a f15582M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final j f15583N;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextInputLayout f15584s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final FrameLayout f15585t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final CheckableImageButton f15586u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ColorStateList f15587v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public PorterDuff.Mode f15588w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public View.OnLongClickListener f15589x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final CheckableImageButton f15590y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C0154b f15591z;

    public l(TextInputLayout textInputLayout, c cVar) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f15570A = 0;
        this.f15571B = new LinkedHashSet();
        this.f15583N = new j(this);
        k kVar = new k(this);
        this.f15581L = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f15584s = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f15585t = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.f15586u = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.f15590y = checkableImageButtonA2;
        C0154b c0154b = new C0154b();
        c0154b.f661c = new SparseArray();
        c0154b.f662d = this;
        TypedArray typedArray = (TypedArray) cVar.f5671u;
        c0154b.a = typedArray.getResourceId(28, 0);
        c0154b.f660b = typedArray.getResourceId(52, 0);
        this.f15591z = c0154b;
        X x8 = new X(getContext(), null);
        this.f15578I = x8;
        TypedArray typedArray2 = (TypedArray) cVar.f5671u;
        if (typedArray2.hasValue(38)) {
            this.f15587v = E.m(getContext(), cVar, 38);
        }
        if (typedArray2.hasValue(39)) {
            this.f15588w = C.k(typedArray2.getInt(39, -1), null);
        }
        if (typedArray2.hasValue(37)) {
            i(cVar.v(37));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = U.a;
        checkableImageButtonA.setImportantForAccessibility(2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setFocusable(false);
        if (!typedArray2.hasValue(53)) {
            if (typedArray2.hasValue(32)) {
                this.f15572C = E.m(getContext(), cVar, 32);
            }
            if (typedArray2.hasValue(33)) {
                this.f15573D = C.k(typedArray2.getInt(33, -1), null);
            }
        }
        if (typedArray2.hasValue(30)) {
            g(typedArray2.getInt(30, 0));
            if (typedArray2.hasValue(27) && checkableImageButtonA2.getContentDescription() != (text = typedArray2.getText(27))) {
                checkableImageButtonA2.setContentDescription(text);
            }
            checkableImageButtonA2.setCheckable(typedArray2.getBoolean(26, true));
        } else if (typedArray2.hasValue(53)) {
            if (typedArray2.hasValue(54)) {
                this.f15572C = E.m(getContext(), cVar, 54);
            }
            if (typedArray2.hasValue(55)) {
                this.f15573D = C.k(typedArray2.getInt(55, -1), null);
            }
            g(typedArray2.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray2.getText(51);
            if (checkableImageButtonA2.getContentDescription() != text2) {
                checkableImageButtonA2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray2.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f15574E) {
            this.f15574E = dimensionPixelSize;
            checkableImageButtonA2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonA.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray2.hasValue(31)) {
            ImageView.ScaleType scaleTypeF = b.f(typedArray2.getInt(31, -1));
            this.f15575F = scaleTypeF;
            checkableImageButtonA2.setScaleType(scaleTypeF);
            checkableImageButtonA.setScaleType(scaleTypeF);
        }
        x8.setVisibility(8);
        x8.setId(R.id.textinput_suffix_text);
        x8.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        x8.setAccessibilityLiveRegion(1);
        x8.setTextAppearance(typedArray2.getResourceId(72, 0));
        if (typedArray2.hasValue(73)) {
            x8.setTextColor(cVar.u(73));
        }
        CharSequence text3 = typedArray2.getText(71);
        this.f15577H = TextUtils.isEmpty(text3) ? null : text3;
        x8.setText(text3);
        n();
        frameLayout.addView(checkableImageButtonA2);
        addView(x8);
        addView(frameLayout);
        addView(checkableImageButtonA);
        textInputLayout.f9922w0.add(kVar);
        if (textInputLayout.f9919v != null) {
            kVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0686d(this, 3));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i10);
        if (E.u(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final m b() {
        m dVar;
        int i10 = this.f15570A;
        C0154b c0154b = this.f15591z;
        SparseArray sparseArray = (SparseArray) c0154b.f661c;
        m mVar = (m) sparseArray.get(i10);
        if (mVar != null) {
            return mVar;
        }
        l lVar = (l) c0154b.f662d;
        if (i10 == -1) {
            dVar = new d(lVar, 0);
        } else if (i10 == 0) {
            dVar = new d(lVar, 1);
        } else if (i10 == 1) {
            dVar = new s(lVar, c0154b.f660b);
        } else if (i10 == 2) {
            dVar = new c(lVar);
        } else {
            if (i10 != 3) {
                throw new IllegalArgumentException(AbstractC0487g.g(i10, "Invalid end icon mode: "));
            }
            dVar = new i(lVar);
        }
        sparseArray.append(i10, dVar);
        return dVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f15590y;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap weakHashMap = U.a;
        return this.f15578I.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.f15585t.getVisibility() == 0 && this.f15590y.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f15586u.getVisibility() == 0;
    }

    public final void f(boolean z6) {
        boolean z10;
        boolean zIsActivated;
        boolean z11;
        m mVarB = b();
        boolean zK = mVarB.k();
        CheckableImageButton checkableImageButton = this.f15590y;
        boolean z12 = true;
        if (!zK || (z11 = checkableImageButton.f9734v) == mVarB.l()) {
            z10 = false;
        } else {
            checkableImageButton.setChecked(!z11);
            z10 = true;
        }
        if (!(mVarB instanceof i) || (zIsActivated = checkableImageButton.isActivated()) == mVarB.j()) {
            z12 = z10;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z6 || z12) {
            b.A(this.f15584s, checkableImageButton, this.f15572C);
        }
    }

    public final void g(int i10) {
        if (this.f15570A == i10) {
            return;
        }
        m mVarB = b();
        C0187a c0187a = this.f15582M;
        AccessibilityManager accessibilityManager = this.f15581L;
        if (c0187a != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new V.b(c0187a));
        }
        this.f15582M = null;
        mVarB.s();
        this.f15570A = i10;
        Iterator it = this.f15571B.iterator();
        if (it.hasNext()) {
            throw a.e(it);
        }
        h(i10 != 0);
        m mVarB2 = b();
        int iD = this.f15591z.a;
        if (iD == 0) {
            iD = mVarB2.d();
        }
        Drawable drawableG = iD != 0 ? p068ga.l.g(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.f15590y;
        checkableImageButton.setImageDrawable(drawableG);
        TextInputLayout textInputLayout = this.f15584s;
        if (drawableG != null) {
            b.a(textInputLayout, checkableImageButton, this.f15572C, this.f15573D);
            b.A(textInputLayout, checkableImageButton, this.f15572C);
        }
        int iC = mVarB2.c();
        CharSequence text = iC != 0 ? getResources().getText(iC) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(mVarB2.k());
        if (!mVarB2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
        }
        mVarB2.r();
        C0187a c0187aH = mVarB2.h();
        this.f15582M = c0187aH;
        if (c0187aH != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = U.a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new V.b(this.f15582M));
            }
        }
        View.OnClickListener onClickListenerF = mVarB2.f();
        View.OnLongClickListener onLongClickListener = this.f15576G;
        checkableImageButton.setOnClickListener(onClickListenerF);
        b.D(checkableImageButton, onLongClickListener);
        EditText editText = this.f15580K;
        if (editText != null) {
            mVarB2.m(editText);
            j(mVarB2);
        }
        b.a(textInputLayout, checkableImageButton, this.f15572C, this.f15573D);
        f(true);
    }

    public final void h(boolean z6) {
        if (d() != z6) {
            this.f15590y.setVisibility(z6 ? 0 : 8);
            k();
            m();
            this.f15584s.q();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f15586u;
        checkableImageButton.setImageDrawable(drawable);
        l();
        b.a(this.f15584s, checkableImageButton, this.f15587v, this.f15588w);
    }

    public final void j(m mVar) {
        if (this.f15580K == null) {
            return;
        }
        if (mVar.e() != null) {
            this.f15580K.setOnFocusChangeListener(mVar.e());
        }
        if (mVar.g() != null) {
            this.f15590y.setOnFocusChangeListener(mVar.g());
        }
    }

    public final void k() {
        this.f15585t.setVisibility((this.f15590y.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || ((this.f15577H == null || this.f15579J) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.f15586u;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f15584s;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f9857B.f15615q && textInputLayout.m()) ? 0 : 8);
        k();
        m();
        if (this.f15570A != 0) {
            return;
        }
        textInputLayout.q();
    }

    public final void m() {
        int paddingEnd;
        TextInputLayout textInputLayout = this.f15584s;
        if (textInputLayout.f9919v == null) {
            return;
        }
        if (d() || e()) {
            paddingEnd = 0;
        } else {
            EditText editText = textInputLayout.f9919v;
            WeakHashMap weakHashMap = U.a;
            paddingEnd = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f9919v.getPaddingTop();
        int paddingBottom = textInputLayout.f9919v.getPaddingBottom();
        WeakHashMap weakHashMap2 = U.a;
        this.f15578I.setPaddingRelative(dimensionPixelSize, paddingTop, paddingEnd, paddingBottom);
    }

    public final void n() {
        X x8 = this.f15578I;
        int visibility = x8.getVisibility();
        int i10 = (this.f15577H == null || this.f15579J) ? 8 : 0;
        if (visibility != i10) {
            b().p(i10 == 0);
        }
        k();
        x8.setVisibility(i10);
        this.f15584s.q();
    }
}
