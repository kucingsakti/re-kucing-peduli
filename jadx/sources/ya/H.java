package ya;

import android.os.Build;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import p188t1.AbstractC0856t;

/* JADX INFO: loaded from: classes.dex */
public class H {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final H f16147c;
    public final boolean a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Constructor f16148b;

    static {
        H h10;
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            h10 = new G(Build.VERSION.SDK_INT >= 24);
        } else {
            h10 = new H(true);
        }
        f16147c = h10;
    }

    public H(boolean z6) {
        this.a = z6;
        Constructor declaredConstructor = null;
        if (z6) {
            try {
                declaredConstructor = AbstractC0856t.e().getDeclaredConstructor(Class.class, Integer.TYPE);
                declaredConstructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f16148b = declaredConstructor;
    }

    public Executor a() {
        return null;
    }

    public Object b(Object obj, Method method, Object... objArr) {
        Constructor constructor = this.f16148b;
        return (constructor != null ? AbstractC0856t.j(constructor.newInstance(H4.a.class, -1)) : MethodHandles.lookup()).unreflectSpecial(method, H4.a.class).bindTo(obj).invokeWithArguments(objArr);
    }
}
