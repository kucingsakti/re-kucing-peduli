package X2;

import U.B0;
import U.C0;
import U.D0;
import U.E0;
import U.H;
import U.U;
import android.content.res.ColorStateList;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.WeakHashMap;
import p086i8.C;

/* JADX INFO: loaded from: classes.dex */
public final class g extends c {
    public final Boolean a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B0 f5393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Window f5394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5395d;

    public g(View view, B0 b3) {
        ColorStateList colorStateListG;
        this.f5393b = b3;
        p170r3.g gVar = BottomSheetBehavior.B(view).f9488A;
        if (gVar != null) {
            colorStateListG = gVar.f14501s.f14472c;
        } else {
            WeakHashMap weakHashMap = U.a;
            colorStateListG = H.g(view);
        }
        if (colorStateListG != null) {
            this.a = Boolean.valueOf(J7.a.m(colorStateListG.getDefaultColor()));
            return;
        }
        ColorStateList colorStateListI = C.i(view.getBackground());
        Integer numValueOf = colorStateListI != null ? Integer.valueOf(colorStateListI.getDefaultColor()) : null;
        if (numValueOf != null) {
            this.a = Boolean.valueOf(J7.a.m(numValueOf.intValue()));
        } else {
            this.a = null;
        }
    }

    @Override // X2.c
    public final void a(View view) {
        d(view);
    }

    @Override // X2.c
    public final void b(View view) {
        d(view);
    }

    @Override // X2.c
    public final void c(View view, int i10) {
        d(view);
    }

    public final void d(View view) {
        J7.j d3;
        J7.j d8;
        int top = view.getTop();
        B0 b3 = this.f5393b;
        if (top < b3.d()) {
            Window window = this.f5394c;
            if (window != null) {
                Boolean bool = this.a;
                boolean zBooleanValue = bool == null ? this.f5395d : bool.booleanValue();
                p170r3.e eVar = new p170r3.e(window.getDecorView());
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 30) {
                    E0 e10 = new E0(window.getInsetsController(), eVar);
                    e10.f4780c = window;
                    d8 = e10;
                } else {
                    d8 = i10 >= 26 ? new D0(window, eVar) : new C0(window, eVar);
                }
                d8.F(zBooleanValue);
            }
            view.setPadding(view.getPaddingLeft(), b3.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.f5394c;
            if (window2 != null) {
                boolean z6 = this.f5395d;
                p170r3.e eVar2 = new p170r3.e(window2.getDecorView());
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 30) {
                    E0 e11 = new E0(window2.getInsetsController(), eVar2);
                    e11.f4780c = window2;
                    d3 = e11;
                } else {
                    d3 = i11 >= 26 ? new D0(window2, eVar2) : new C0(window2, eVar2);
                }
                d3.F(z6);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public final void e(Window window) {
        J7.j d3;
        if (this.f5394c == window) {
            return;
        }
        this.f5394c = window;
        if (window != null) {
            p170r3.e eVar = new p170r3.e(window.getDecorView());
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                E0 e10 = new E0(window.getInsetsController(), eVar);
                e10.f4780c = window;
                d3 = e10;
            } else {
                d3 = i10 >= 26 ? new D0(window, eVar) : new C0(window, eVar);
            }
            this.f5395d = d3.q();
        }
    }
}
