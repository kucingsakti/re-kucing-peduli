package p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes.dex */
public abstract class N0 {
    public static final ThreadLocal a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f13973b = {-16842910};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f13974c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f13975d = {R.attr.state_pressed};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f13976e = {R.attr.state_checked};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f13977f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f13978g = new int[1];

    public static void a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(p069h.a.j);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(ModuleDescriptor.MODULE_VERSION)) {
                view.getClass().toString();
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i10) {
        ColorStateList colorStateListD = d(context, i10);
        if (colorStateListD != null && colorStateListD.isStateful()) {
            return colorStateListD.getColorForState(f13973b, colorStateListD.getDefaultColor());
        }
        ThreadLocal threadLocal = a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f10 = typedValue.getFloat();
        int iC = c(context, i10);
        return L.a.d(iC, Math.round(Color.alpha(iC) * f10));
    }

    public static int c(Context context, int i10) {
        int[] iArr = f13978g;
        iArr[0] = i10;
        Y1.c cVarD = Y1.c.D(context, null, iArr);
        try {
            return ((TypedArray) cVarD.f5671u).getColor(0, 0);
        } finally {
            cVarD.J();
        }
    }

    public static ColorStateList d(Context context, int i10) {
        int[] iArr = f13978g;
        iArr[0] = i10;
        Y1.c cVarD = Y1.c.D(context, null, iArr);
        try {
            return cVarD.u(0);
        } finally {
            cVarD.J();
        }
    }
}
