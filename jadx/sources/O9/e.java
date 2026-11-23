package O9;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import p076h8.g;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    private static volatile Choreographer choreographer;

    static {
        Object objD;
        try {
            objD = new d(a(Looper.getMainLooper()), false);
        } catch (Throwable th) {
            objD = J7.a.d(th);
        }
        if (objD instanceof g) {
            objD = null;
        }
    }

    public static final Handler a(Looper looper) throws IllegalAccessException, InvocationTargetException {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        i.d(objInvoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) objInvoke;
    }
}
