package p;

import X9.C0469o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: p.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0719o {
    public final View a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0469o f14090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0469o f14091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0469o f14092f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14089c = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f14088b = r.a();

    public C0719o(View view) {
        this.a = view;
    }

    public final void a() {
        View view = this.a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f14090d != null) {
                if (this.f14092f == null) {
                    this.f14092f = new C0469o();
                }
                C0469o c0469o = this.f14092f;
                c0469o.f5619c = null;
                c0469o.f5618b = false;
                c0469o.f5620d = null;
                c0469o.a = false;
                WeakHashMap weakHashMap = U.U.a;
                ColorStateList colorStateListG = U.H.g(view);
                if (colorStateListG != null) {
                    c0469o.f5618b = true;
                    c0469o.f5619c = colorStateListG;
                }
                PorterDuff.Mode modeH = U.H.h(view);
                if (modeH != null) {
                    c0469o.a = true;
                    c0469o.f5620d = modeH;
                }
                if (c0469o.f5618b || c0469o.a) {
                    r.e(background, c0469o, view.getDrawableState());
                    return;
                }
            }
            C0469o c0469o2 = this.f14091e;
            if (c0469o2 != null) {
                r.e(background, c0469o2, view.getDrawableState());
                return;
            }
            C0469o c0469o3 = this.f14090d;
            if (c0469o3 != null) {
                r.e(background, c0469o3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        C0469o c0469o = this.f14091e;
        if (c0469o != null) {
            return (ColorStateList) c0469o.f5619c;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        C0469o c0469o = this.f14091e;
        if (c0469o != null) {
            return (PorterDuff.Mode) c0469o.f5620d;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i10) {
        ColorStateList colorStateListI;
        View view = this.a;
        Context context = view.getContext();
        int[] iArr = p069h.a.f11608A;
        Y1.c cVarE = Y1.c.E(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) cVarE.f5671u;
        View view2 = this.a;
        U.U.m(view2, view2.getContext(), iArr, attributeSet, (TypedArray) cVarE.f5671u, i10);
        try {
            if (typedArray.hasValue(0)) {
                this.f14089c = typedArray.getResourceId(0, -1);
                r rVar = this.f14088b;
                Context context2 = view.getContext();
                int i11 = this.f14089c;
                synchronized (rVar) {
                    colorStateListI = rVar.a.i(context2, i11);
                }
                if (colorStateListI != null) {
                    g(colorStateListI);
                }
            }
            if (typedArray.hasValue(1)) {
                U.H.q(view, cVarE.u(1));
            }
            if (typedArray.hasValue(2)) {
                U.H.r(view, AbstractC0710j0.c(typedArray.getInt(2, -1), null));
            }
            cVarE.J();
        } catch (Throwable th) {
            cVarE.J();
            throw th;
        }
    }

    public final void e() {
        this.f14089c = -1;
        g(null);
        a();
    }

    public final void f(int i10) {
        ColorStateList colorStateListI;
        this.f14089c = i10;
        r rVar = this.f14088b;
        if (rVar != null) {
            Context context = this.a.getContext();
            synchronized (rVar) {
                colorStateListI = rVar.a.i(context, i10);
            }
        } else {
            colorStateListI = null;
        }
        g(colorStateListI);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f14090d == null) {
                this.f14090d = new C0469o();
            }
            C0469o c0469o = this.f14090d;
            c0469o.f5619c = colorStateList;
            c0469o.f5618b = true;
        } else {
            this.f14090d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f14091e == null) {
            this.f14091e = new C0469o();
        }
        C0469o c0469o = this.f14091e;
        c0469o.f5619c = colorStateList;
        c0469o.f5618b = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f14091e == null) {
            this.f14091e = new C0469o();
        }
        C0469o c0469o = this.f14091e;
        c0469o.f5620d = mode;
        c0469o.a = true;
        a();
    }
}
