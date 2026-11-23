package U;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.kcstream.cing.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class H {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static B0 b(View view, B0 b3, Rect rect) {
        WindowInsets windowInsetsG = b3.g();
        if (windowInsetsG != null) {
            return B0.h(view, view.computeSystemWindowInsets(windowInsetsG, rect));
        }
        rect.setEmpty();
        return b3;
    }

    public static boolean c(View view, float f10, float f11, boolean z6) {
        return view.dispatchNestedFling(f10, f11, z6);
    }

    public static boolean d(View view, float f10, float f11) {
        return view.dispatchNestedPreFling(f10, f11);
    }

    public static boolean e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
    }

    public static boolean f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
    }

    public static ColorStateList g(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode h(View view) {
        return view.getBackgroundTintMode();
    }

    public static float i(View view) {
        return view.getElevation();
    }

    public static B0 j(View view) {
        s0 q0Var;
        if (!o0.f4837d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = o0.a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) o0.f4835b.get(obj);
            Rect rect2 = (Rect) o0.f4836c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                q0Var = new r0();
            } else {
                q0Var = i10 >= 29 ? new q0() : new p0();
            }
            q0Var.e(L.c.b(rect.left, rect.top, rect.right, rect.bottom));
            q0Var.g(L.c.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
            B0 b0B = q0Var.b();
            b0B.a.p(b0B);
            b0B.a.d(view.getRootView());
            return b0B;
        } catch (IllegalAccessException e10) {
            Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e10.getMessage(), e10);
            return null;
        }
    }

    public static String k(View view) {
        return view.getTransitionName();
    }

    public static float l(View view) {
        return view.getTranslationZ();
    }

    public static float m(View view) {
        return view.getZ();
    }

    public static boolean n(View view) {
        return view.hasNestedScrollingParent();
    }

    public static boolean o(View view) {
        return view.isImportantForAccessibility();
    }

    public static boolean p(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void q(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void r(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void s(View view, float f10) {
        view.setElevation(f10);
    }

    public static void t(View view, boolean z6) {
        view.setNestedScrollingEnabled(z6);
    }

    public static void u(View view, InterfaceC0432s interfaceC0432s) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, interfaceC0432s);
        }
        if (interfaceC0432s == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new G(view, interfaceC0432s));
        }
    }

    public static void v(View view, String str) {
        view.setTransitionName(str);
    }

    public static void w(View view, float f10) {
        view.setTranslationZ(f10);
    }

    public static void x(View view, float f10) {
        view.setZ(f10);
    }

    public static boolean y(View view, int i10) {
        return view.startNestedScroll(i10);
    }

    public static void z(View view) {
        view.stopNestedScroll();
    }
}
