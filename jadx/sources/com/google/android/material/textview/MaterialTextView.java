package com.google.android.material.textview;

import C8.E;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p.X;
import p225x3.a;

/* JADX INFO: loaded from: classes.dex */
public class MaterialTextView extends X {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = getContext();
        if (C4.a.C(context2, com.kcstream.cing.R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = Q2.a.f3993D;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int[] iArr2 = {1, 2};
            int iP = -1;
            for (int i10 = 0; i10 < 2 && iP < 0; i10++) {
                iP = E.p(context2, typedArrayObtainStyledAttributes, iArr2[i10], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iP != -1) {
                return;
            }
            TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
            typedArrayObtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, Q2.a.f3992C);
                Context context3 = getContext();
                int[] iArr3 = {1, 2};
                int iP2 = -1;
                for (int i11 = 0; i11 < 2 && iP2 < 0; i11++) {
                    iP2 = E.p(context3, typedArrayObtainStyledAttributes3, iArr3[i11], -1);
                }
                typedArrayObtainStyledAttributes3.recycle();
                if (iP2 >= 0) {
                    setLineHeight(iP2);
                }
            }
        }
    }

    @Override // p.X, android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        if (C4.a.C(context, com.kcstream.cing.R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i10, Q2.a.f3992C);
            Context context2 = getContext();
            int[] iArr = {1, 2};
            int iP = -1;
            for (int i11 = 0; i11 < 2 && iP < 0; i11++) {
                iP = E.p(context2, typedArrayObtainStyledAttributes, iArr[i11], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iP >= 0) {
                setLineHeight(iP);
            }
        }
    }
}
