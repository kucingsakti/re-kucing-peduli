package O9;

import N9.C0338v;
import N9.InterfaceC0339w;
import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import p123m8.i;

/* JADX INFO: loaded from: classes.dex */
public final class b extends p123m8.a implements InterfaceC0339w {
    private volatile Object _preHandler;

    public b() {
        super(C0338v.f3487s);
        this._preHandler = this;
    }

    @Override // N9.InterfaceC0339w
    public final void handleException(i iVar, Throwable th) {
        Method declaredMethod;
        int i10 = Build.VERSION.SDK_INT;
        if (26 > i10 || i10 >= 28) {
            return;
        }
        Object obj = this._preHandler;
        if (obj != this) {
            declaredMethod = (Method) obj;
        } else {
            try {
                declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
                if (!Modifier.isPublic(declaredMethod.getModifiers()) || !Modifier.isStatic(declaredMethod.getModifiers())) {
                    declaredMethod = null;
                }
            } catch (Throwable unused) {
            }
            this._preHandler = declaredMethod;
        }
        Object objInvoke = declaredMethod != null ? declaredMethod.invoke(null, new Object[0]) : null;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = objInvoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) objInvoke : null;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
    }
}
