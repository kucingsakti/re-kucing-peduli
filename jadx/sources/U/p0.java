package U;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class p0 extends s0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Field f4838e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f4839f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Constructor f4840g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f4841h = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WindowInsets f4842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public L.c f4843d;

    public p0() {
        this.f4842c = i();
    }

    private static WindowInsets i() {
        if (!f4839f) {
            try {
                f4838e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
            }
            f4839f = true;
        }
        Field field = f4838e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
            }
        }
        if (!f4841h) {
            try {
                f4840g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e12) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
            }
            f4841h = true;
        }
        Constructor constructor = f4840g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e13) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
            }
        }
        return null;
    }

    @Override // U.s0
    public B0 b() {
        a();
        B0 b0H = B0.h(null, this.f4842c);
        L.c[] cVarArr = this.f4846b;
        y0 y0Var = b0H.a;
        y0Var.o(cVarArr);
        y0Var.q(this.f4843d);
        return b0H;
    }

    @Override // U.s0
    public void e(L.c cVar) {
        this.f4843d = cVar;
    }

    @Override // U.s0
    public void g(L.c cVar) {
        WindowInsets windowInsets = this.f4842c;
        if (windowInsets != null) {
            this.f4842c = windowInsets.replaceSystemWindowInsets(cVar.a, cVar.f2712b, cVar.f2713c, cVar.f2714d);
        }
    }

    public p0(B0 b3) {
        super(b3);
        this.f4842c = b3.g();
    }
}
