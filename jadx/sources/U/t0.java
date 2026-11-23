package U;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class t0 extends y0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f4847h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Method f4848i;
    public static Class j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Field f4849k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static Field f4850l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowInsets f4851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public L.c[] f4852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public L.c f4853e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public B0 f4854f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public L.c f4855g;

    public t0(B0 b3, WindowInsets windowInsets) {
        super(b3);
        this.f4853e = null;
        this.f4851c = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    private L.c r(int i10, boolean z6) {
        L.c cVarA = L.c.f2711e;
        for (int i11 = 1; i11 <= 256; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                cVarA = L.c.a(cVarA, s(i11, z6));
            }
        }
        return cVarA;
    }

    private L.c t() {
        B0 b3 = this.f4854f;
        return b3 != null ? b3.a.h() : L.c.f2711e;
    }

    private L.c u(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f4847h) {
            v();
        }
        Method method = f4848i;
        if (method != null && j != null && f4849k != null) {
            try {
                Object objInvoke = method.invoke(view, new Object[0]);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f4849k.get(f4850l.get(objInvoke));
                if (rect != null) {
                    return L.c.b(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e10) {
                e10.getMessage();
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static void v() {
        try {
            f4848i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            j = cls;
            f4849k = cls.getDeclaredField("mVisibleInsets");
            f4850l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f4849k.setAccessible(true);
            f4850l.setAccessible(true);
        } catch (ReflectiveOperationException e10) {
            e10.getMessage();
        }
        f4847h = true;
    }

    @Override // U.y0
    public void d(View view) {
        L.c cVarU = u(view);
        if (cVarU == null) {
            cVarU = L.c.f2711e;
        }
        w(cVarU);
    }

    @Override // U.y0
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f4855g, ((t0) obj).f4855g);
        }
        return false;
    }

    @Override // U.y0
    public L.c f(int i10) {
        return r(i10, false);
    }

    @Override // U.y0
    public final L.c j() {
        if (this.f4853e == null) {
            WindowInsets windowInsets = this.f4851c;
            this.f4853e = L.c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f4853e;
    }

    @Override // U.y0
    public B0 l(int i10, int i11, int i12, int i13) {
        s0 q0Var;
        B0 b0H = B0.h(null, this.f4851c);
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 30) {
            q0Var = new r0(b0H);
        } else {
            q0Var = i14 >= 29 ? new q0(b0H) : new p0(b0H);
        }
        q0Var.g(B0.e(j(), i10, i11, i12, i13));
        q0Var.e(B0.e(h(), i10, i11, i12, i13));
        return q0Var.b();
    }

    @Override // U.y0
    public boolean n() {
        return this.f4851c.isRound();
    }

    @Override // U.y0
    public void o(L.c[] cVarArr) {
        this.f4852d = cVarArr;
    }

    @Override // U.y0
    public void p(B0 b3) {
        this.f4854f = b3;
    }

    public L.c s(int i10, boolean z6) {
        L.c cVarH;
        int i11;
        if (i10 == 1) {
            return z6 ? L.c.b(0, Math.max(t().f2712b, j().f2712b), 0, 0) : L.c.b(0, j().f2712b, 0, 0);
        }
        if (i10 == 2) {
            if (z6) {
                L.c cVarT = t();
                L.c cVarH2 = h();
                return L.c.b(Math.max(cVarT.a, cVarH2.a), 0, Math.max(cVarT.f2713c, cVarH2.f2713c), Math.max(cVarT.f2714d, cVarH2.f2714d));
            }
            L.c cVarJ = j();
            B0 b3 = this.f4854f;
            cVarH = b3 != null ? b3.a.h() : null;
            int iMin = cVarJ.f2714d;
            if (cVarH != null) {
                iMin = Math.min(iMin, cVarH.f2714d);
            }
            return L.c.b(cVarJ.a, 0, cVarJ.f2713c, iMin);
        }
        L.c cVar = L.c.f2711e;
        if (i10 == 8) {
            L.c[] cVarArr = this.f4852d;
            cVarH = cVarArr != null ? cVarArr[J7.a.k(8)] : null;
            if (cVarH != null) {
                return cVarH;
            }
            L.c cVarJ2 = j();
            L.c cVarT2 = t();
            int i12 = cVarJ2.f2714d;
            if (i12 > cVarT2.f2714d) {
                return L.c.b(0, 0, 0, i12);
            }
            L.c cVar2 = this.f4855g;
            return (cVar2 == null || cVar2.equals(cVar) || (i11 = this.f4855g.f2714d) <= cVarT2.f2714d) ? cVar : L.c.b(0, 0, 0, i11);
        }
        if (i10 == 16) {
            return i();
        }
        if (i10 == 32) {
            return g();
        }
        if (i10 == 64) {
            return k();
        }
        if (i10 != 128) {
            return cVar;
        }
        B0 b7 = this.f4854f;
        C0424j c0424jE = b7 != null ? b7.a.e() : e();
        if (c0424jE == null) {
            return cVar;
        }
        int i13 = Build.VERSION.SDK_INT;
        return L.c.b(i13 >= 28 ? AbstractC0423i.d(c0424jE.a) : 0, i13 >= 28 ? AbstractC0423i.f(c0424jE.a) : 0, i13 >= 28 ? AbstractC0423i.e(c0424jE.a) : 0, i13 >= 28 ? AbstractC0423i.c(c0424jE.a) : 0);
    }

    public void w(L.c cVar) {
        this.f4855g = cVar;
    }
}
