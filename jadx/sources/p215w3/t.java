package p215w3;

import C8.E;
import D3.b;
import U.U;
import Y1.c;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.kcstream.cing.R;
import java.util.WeakHashMap;
import p.X;
import p091j3.C;

/* JADX INFO: loaded from: classes.dex */
public final class t extends LinearLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public View.OnLongClickListener f15638A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f15639B;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextInputLayout f15640s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final X f15641t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public CharSequence f15642u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final CheckableImageButton f15643v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ColorStateList f15644w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public PorterDuff.Mode f15645x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f15646y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ImageView.ScaleType f15647z;

    public t(TextInputLayout textInputLayout, c cVar) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f15640s = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f15643v = checkableImageButton;
        X x8 = new X(getContext(), null);
        this.f15641t = x8;
        if (E.u(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f15638A;
        checkableImageButton.setOnClickListener(null);
        b.D(checkableImageButton, onLongClickListener);
        this.f15638A = null;
        checkableImageButton.setOnLongClickListener(null);
        b.D(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) cVar.f5671u;
        if (typedArray.hasValue(69)) {
            this.f15644w = E.m(getContext(), cVar, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f15645x = C.k(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            b(cVar.v(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f15646y) {
            this.f15646y = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType scaleTypeF = b.f(typedArray.getInt(68, -1));
            this.f15647z = scaleTypeF;
            checkableImageButton.setScaleType(scaleTypeF);
        }
        x8.setVisibility(8);
        x8.setId(R.id.textinput_prefix_text);
        x8.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = U.a;
        x8.setAccessibilityLiveRegion(1);
        x8.setTextAppearance(typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            x8.setTextColor(cVar.u(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.f15642u = TextUtils.isEmpty(text2) ? null : text2;
        x8.setText(text2);
        e();
        addView(checkableImageButton);
        addView(x8);
    }

    public final int a() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.f15643v;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        WeakHashMap weakHashMap = U.a;
        return this.f15641t.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f15643v;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f15644w;
            PorterDuff.Mode mode = this.f15645x;
            TextInputLayout textInputLayout = this.f15640s;
            b.a(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            b.A(textInputLayout, checkableImageButton, this.f15644w);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.f15638A;
        checkableImageButton.setOnClickListener(null);
        b.D(checkableImageButton, onLongClickListener);
        this.f15638A = null;
        checkableImageButton.setOnLongClickListener(null);
        b.D(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z6) {
        CheckableImageButton checkableImageButton = this.f15643v;
        if ((checkableImageButton.getVisibility() == 0) != z6) {
            checkableImageButton.setVisibility(z6 ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        int paddingStart;
        EditText editText = this.f15640s.f9919v;
        if (editText == null) {
            return;
        }
        if (this.f15643v.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap weakHashMap = U.a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = U.a;
        this.f15641t.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void e() {
        int i10 = (this.f15642u == null || this.f15639B) ? 8 : 0;
        setVisibility((this.f15643v.getVisibility() == 0 || i10 == 0) ? 0 : 8);
        this.f15641t.setVisibility(i10);
        this.f15640s.q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        d();
    }
}
