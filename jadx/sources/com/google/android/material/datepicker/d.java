package com.google.android.material.datepicker;

import C8.E;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.kcstream.cing.R;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final c a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f9653b;

    public d(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C4.a.D(R.attr.materialCalendarStyle, context, m.class.getCanonicalName()).data, Q2.a.f4028w);
        c.a(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        c.a(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        c.a(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        c.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateListN = E.n(context, typedArrayObtainStyledAttributes, 7);
        this.a = c.a(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        c.a(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.f9653b = c.a(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(colorStateListN.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
