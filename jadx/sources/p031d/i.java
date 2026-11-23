package p031d;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0518m;
import androidx.lifecycle.InterfaceC0522q;
import androidx.lifecycle.InterfaceC0523s;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class i implements InterfaceC0522q {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static int f10447u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static Field f10448v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static Field f10449w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static Field f10450x;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f10451s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public m f10452t;

    public /* synthetic */ i() {
    }

    @Override // androidx.lifecycle.InterfaceC0522q
    public final void onStateChanged(InterfaceC0523s interfaceC0523s, EnumC0518m enumC0518m) {
        switch (this.f10451s) {
            case 0:
                if (enumC0518m != EnumC0518m.ON_CREATE || Build.VERSION.SDK_INT < 33) {
                    return;
                }
                x xVar = this.f10452t.f10471y;
                OnBackInvokedDispatcher onBackInvokedDispatcherA = j.a((m) interfaceC0523s);
                xVar.getClass();
                p210v8.i.f(onBackInvokedDispatcherA, "invoker");
                xVar.f10494e = onBackInvokedDispatcherA;
                xVar.b(xVar.f10496g);
                return;
            default:
                if (enumC0518m != EnumC0518m.ON_DESTROY) {
                    return;
                }
                if (f10447u == 0) {
                    try {
                        f10447u = 2;
                        Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                        f10449w = declaredField;
                        declaredField.setAccessible(true);
                        Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                        f10450x = declaredField2;
                        declaredField2.setAccessible(true);
                        Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                        f10448v = declaredField3;
                        declaredField3.setAccessible(true);
                        f10447u = 1;
                        break;
                    } catch (NoSuchFieldException unused) {
                    }
                }
                if (f10447u == 1) {
                    InputMethodManager inputMethodManager = (InputMethodManager) this.f10452t.getSystemService("input_method");
                    try {
                        Object obj = f10448v.get(inputMethodManager);
                        if (obj == null) {
                            return;
                        }
                        synchronized (obj) {
                            try {
                                try {
                                    View view = (View) f10449w.get(inputMethodManager);
                                    if (view != null) {
                                        if (!view.isAttachedToWindow()) {
                                            try {
                                                f10450x.set(inputMethodManager, null);
                                                inputMethodManager.isActive();
                                            } catch (IllegalAccessException unused2) {
                                            }
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            } catch (ClassCastException unused3) {
                            } catch (IllegalAccessException unused4) {
                            }
                        }
                        return;
                    } catch (IllegalAccessException unused5) {
                        return;
                    }
                }
                return;
        }
    }

    public i(m mVar) {
        this.f10452t = mVar;
    }
}
