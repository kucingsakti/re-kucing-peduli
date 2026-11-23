package com.google.android.material.datepicker;

import C8.E;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static c a(Context context, int i10) {
        xa.d.b("Cannot create a CalendarItemStyle with a styleResId of 0", i10 != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, Q2.a.f4029x);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        E.n(context, typedArrayObtainStyledAttributes, 4);
        E.n(context, typedArrayObtainStyledAttributes, 9);
        E.n(context, typedArrayObtainStyledAttributes, 7);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        p170r3.j.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0)).a();
        typedArrayObtainStyledAttributes.recycle();
        c cVar = new c();
        xa.d.c(rect.left);
        xa.d.c(rect.top);
        xa.d.c(rect.right);
        xa.d.c(rect.bottom);
        return cVar;
    }
}
