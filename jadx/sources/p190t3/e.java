package p190t3;

import C8.E;
import U.F;
import U.H;
import U.U;
import X2.f;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.kcstream.cing.R;
import java.util.WeakHashMap;
import o1.h;
import p091j3.C;
import p170r3.g;
import p170r3.j;
import p225x3.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends FrameLayout {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final f f15171D = new f(1);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public PorterDuff.Mode f15172A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Rect f15173B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f15174C;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public f f15175s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j f15176t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f15177u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f15178v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final float f15179w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f15180x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f15181y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ColorStateList f15182z;

    public e(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        super(a.a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, Q2.a.f4003N);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = U.a;
            H.s(this, dimensionPixelSize);
        }
        this.f15177u = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f15176t = j.c(context2, attributeSet, 0, 0).a();
        }
        this.f15178v = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(E.n(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(C.k(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f15179w = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.f15180x = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f15181y = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(f15171D);
        setFocusable(true);
        if (getBackground() == null) {
            int iN = J7.a.n(J7.a.g(this, R.attr.colorSurface), getBackgroundOverlayColorAlpha(), J7.a.g(this, R.attr.colorOnSurface));
            j jVar = this.f15176t;
            if (jVar != null) {
                p178s0.a aVar = f.f15183u;
                g gVar = new g(jVar);
                gVar.l(ColorStateList.valueOf(iN));
                drawable = gVar;
            } else {
                Resources resources = getResources();
                p178s0.a aVar2 = f.f15183u;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(iN);
                drawable = gradientDrawable;
            }
            ColorStateList colorStateList = this.f15182z;
            if (colorStateList != null) {
                M.a.h(drawable, colorStateList);
            }
            WeakHashMap weakHashMap2 = U.a;
            setBackground(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBaseTransientBottomBar(f fVar) {
        this.f15175s = fVar;
    }

    public float getActionTextColorAlpha() {
        return this.f15179w;
    }

    public int getAnimationMode() {
        return this.f15177u;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f15178v;
    }

    public int getMaxInlineActionWidth() {
        return this.f15181y;
    }

    public int getMaxWidth() {
        return this.f15180x;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        WindowInsets rootWindowInsets;
        super.onAttachedToWindow();
        f fVar = this.f15175s;
        if (fVar != null && Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = fVar.f15196i.getRootWindowInsets()) != null) {
            fVar.f15202p = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
            fVar.e();
        }
        WeakHashMap weakHashMap = U.a;
        F.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        boolean z6;
        super.onDetachedFromWindow();
        f fVar = this.f15175s;
        if (fVar != null) {
            h hVarG = h.g();
            d dVar = fVar.f15206t;
            synchronized (hVarG.f13632s) {
                z6 = true;
                if (!hVarG.k(dVar)) {
                    h hVar = (h) hVarG.f13635v;
                    if (!(hVar != null && hVar.a.get() == dVar)) {
                        z6 = false;
                    }
                }
            }
            if (z6) {
                f.f15186x.post(new c(fVar, 1));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        super.onLayout(z6, i10, i11, i12, i13);
        f fVar = this.f15175s;
        if (fVar == null || !fVar.f15204r) {
            return;
        }
        fVar.d();
        fVar.f15204r = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int i12 = this.f15180x;
        if (i12 <= 0 || getMeasuredWidth() <= i12) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
    }

    public void setAnimationMode(int i10) {
        this.f15177u = i10;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f15182z != null) {
            drawable = drawable.mutate();
            M.a.h(drawable, this.f15182z);
            M.a.i(drawable, this.f15172A);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f15182z = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            M.a.h(drawableMutate, colorStateList);
            M.a.i(drawableMutate, this.f15172A);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f15172A = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            M.a.i(drawableMutate, mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (this.f15174C || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        this.f15173B = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        f fVar = this.f15175s;
        if (fVar != null) {
            p178s0.a aVar = f.f15183u;
            fVar.e();
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f15171D);
        super.setOnClickListener(onClickListener);
    }
}
