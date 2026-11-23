package com.google.android.material.appbar;

import F8.C0212f;
import U.H;
import U.U;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.kcstream.cing.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import p091j3.C;
import p136o.l;
import p170r3.g;

/* JADX INFO: loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final ImageView.ScaleType[] f9432u0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Integer f9433p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f9434q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f9435r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ImageView.ScaleType f9436s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Boolean f9437t0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(p225x3.a.a(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayI = C.i(context2, attributeSet, Q2.a.f3994E, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayI.hasValue(2)) {
            setNavigationIconTint(typedArrayI.getColor(2, -1));
        }
        this.f9434q0 = typedArrayI.getBoolean(4, false);
        this.f9435r0 = typedArrayI.getBoolean(3, false);
        int i10 = typedArrayI.getInt(1, -1);
        if (i10 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f9432u0;
            if (i10 < scaleTypeArr.length) {
                this.f9436s0 = scaleTypeArr[i10];
            }
        }
        if (typedArrayI.hasValue(0)) {
            this.f9437t0 = Boolean.valueOf(typedArrayI.getBoolean(0, false));
        }
        typedArrayI.recycle();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : p086i8.C.i(background);
        if (colorStateListValueOf != null) {
            g gVar = new g();
            gVar.l(colorStateListValueOf);
            gVar.j(context2);
            WeakHashMap weakHashMap = U.a;
            gVar.k(H.i(this));
            setBackground(gVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f9436s0;
    }

    public Integer getNavigationIconTint() {
        return this.f9433p0;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void m(int i10) {
        Menu menu = getMenu();
        boolean z6 = menu instanceof l;
        if (z6) {
            ((l) menu).y();
        }
        super.m(i10);
        if (z6) {
            ((l) menu).x();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        D3.b.F(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z6, i10, i11, i12, i13);
        ImageView imageView2 = null;
        if (this.f9434q0 || this.f9435r0) {
            ArrayList arrayListG = C.g(this, getTitle());
            boolean zIsEmpty = arrayListG.isEmpty();
            C0212f c0212f = C.f12371c;
            TextView textView = zIsEmpty ? null : (TextView) Collections.min(arrayListG, c0212f);
            ArrayList arrayListG2 = C.g(this, getSubtitle());
            TextView textView2 = arrayListG2.isEmpty() ? null : (TextView) Collections.max(arrayListG2, c0212f);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i14 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    View childAt = getChildAt(i15);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i14 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i14 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f9434q0 && textView != null) {
                    x(textView, pair);
                }
                if (this.f9435r0 && textView2 != null) {
                    x(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            for (int i16 = 0; i16 < getChildCount(); i16++) {
                View childAt2 = getChildAt(i16);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f9437t0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f9436s0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        D3.b.C(this, f10);
    }

    public void setLogoAdjustViewBounds(boolean z6) {
        Boolean bool = this.f9437t0;
        if (bool == null || bool.booleanValue() != z6) {
            this.f9437t0 = Boolean.valueOf(z6);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f9436s0 != scaleType) {
            this.f9436s0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f9433p0 != null) {
            drawable = drawable.mutate();
            M.a.g(drawable, this.f9433p0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i10) {
        this.f9433p0 = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z6) {
        if (this.f9435r0 != z6) {
            this.f9435r0 = z6;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z6) {
        if (this.f9434q0 != z6) {
            this.f9434q0 = z6;
            requestLayout();
        }
    }

    public final void x(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i10 += iMax;
            i11 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i10, textView.getTop(), i11, textView.getBottom());
    }
}
