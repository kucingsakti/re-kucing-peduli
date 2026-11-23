package com.google.android.material.bottomnavigation;

import Q2.a;
import W2.b;
import Y1.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.navigation.d;
import com.kcstream.cing.R;
import p091j3.C;

/* JADX INFO: loaded from: classes.dex */
public class BottomNavigationView extends d {
    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c cVarJ = C.j(getContext(), attributeSet, a.f4011e, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView, new int[0]);
        TypedArray typedArray = (TypedArray) cVarJ.f5671u;
        setItemHorizontalTranslationEnabled(typedArray.getBoolean(2, true));
        if (typedArray.hasValue(0)) {
            setMinimumHeight(typedArray.getDimensionPixelSize(0, 0));
        }
        typedArray.getBoolean(1, true);
        cVarJ.J();
        C.d(this, new p230x9.d(12));
    }

    @Override // com.google.android.material.navigation.d
    public int getMaxItemCount() {
        return 5;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i11) != 1073741824 && suggestedMinimumHeight > 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i11), getPaddingBottom() + getPaddingTop() + suggestedMinimumHeight), 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public void setItemHorizontalTranslationEnabled(boolean z6) {
        b bVar = (b) getMenuView();
        if (bVar.f5325g0 != z6) {
            bVar.setItemHorizontalTranslationEnabled(z6);
            getPresenter().e(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(W2.c cVar) {
        setOnItemReselectedListener(cVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(W2.d dVar) {
        setOnItemSelectedListener(dVar);
    }
}
