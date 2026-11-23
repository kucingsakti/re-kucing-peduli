package p170r3;

import C8.E;
import I4.b;
import Q2.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h f14509m = new h(0.5f);
    public E a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public E f14510b = new i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public E f14511c = new i();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public E f14512d = new i();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f14513e = new a(0.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f14514f = new a(0.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f14515g = new a(0.0f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f14516h = new a(0.0f);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e f14517i = new e(0);
    public e j = new e(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e f14518k = new e(0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e f14519l = new e(0);

    public static b a(Context context, int i10, int i11) {
        return b(context, i10, i11, new a(0));
    }

    public static b b(Context context, int i10, int i11, c cVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i11);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(a.f4001L);
        try {
            int i12 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i13 = typedArrayObtainStyledAttributes.getInt(3, i12);
            int i14 = typedArrayObtainStyledAttributes.getInt(4, i12);
            int i15 = typedArrayObtainStyledAttributes.getInt(2, i12);
            int i16 = typedArrayObtainStyledAttributes.getInt(1, i12);
            c cVarD = d(typedArrayObtainStyledAttributes, 5, cVar);
            c cVarD2 = d(typedArrayObtainStyledAttributes, 8, cVarD);
            c cVarD3 = d(typedArrayObtainStyledAttributes, 9, cVarD);
            c cVarD4 = d(typedArrayObtainStyledAttributes, 7, cVarD);
            c cVarD5 = d(typedArrayObtainStyledAttributes, 6, cVarD);
            b bVar = new b();
            E eG = D3.b.g(i13);
            bVar.a = eG;
            b.b(eG);
            bVar.f2072e = cVarD2;
            E eG2 = D3.b.g(i14);
            bVar.f2069b = eG2;
            b.b(eG2);
            bVar.f2073f = cVarD3;
            E eG3 = D3.b.g(i15);
            bVar.f2070c = eG3;
            b.b(eG3);
            bVar.f2074g = cVarD4;
            E eG4 = D3.b.g(i16);
            bVar.f2071d = eG4;
            b.b(eG4);
            bVar.f2075h = cVarD5;
            return bVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static b c(Context context, AttributeSet attributeSet, int i10, int i11) {
        a aVar = new a(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f3991B, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return b(context, resourceId, resourceId2, aVar);
    }

    public static c d(TypedArray typedArray, int i10, c cVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        if (typedValuePeekValue != null) {
            int i11 = typedValuePeekValue.type;
            if (i11 == 5) {
                return new a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i11 == 6) {
                return new h(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return cVar;
    }

    public final boolean e(RectF rectF) {
        boolean z6 = this.f14519l.getClass().equals(e.class) && this.j.getClass().equals(e.class) && this.f14517i.getClass().equals(e.class) && this.f14518k.getClass().equals(e.class);
        float fA = this.f14513e.a(rectF);
        return z6 && ((this.f14514f.a(rectF) > fA ? 1 : (this.f14514f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f14516h.a(rectF) > fA ? 1 : (this.f14516h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f14515g.a(rectF) > fA ? 1 : (this.f14515g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.f14510b instanceof i) && (this.a instanceof i) && (this.f14511c instanceof i) && (this.f14512d instanceof i));
    }

    public final b f() {
        b bVar = new b();
        bVar.a = this.a;
        bVar.f2069b = this.f14510b;
        bVar.f2070c = this.f14511c;
        bVar.f2071d = this.f14512d;
        bVar.f2072e = this.f14513e;
        bVar.f2073f = this.f14514f;
        bVar.f2074g = this.f14515g;
        bVar.f2075h = this.f14516h;
        bVar.f2076i = this.f14517i;
        bVar.j = this.j;
        bVar.f2077k = this.f14518k;
        bVar.f2078l = this.f14519l;
        return bVar;
    }
}
