package F8;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: F8.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0209c {
    public static final o1.e a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o1.e f1567b;

    static {
        C0208b c0208b = C0208b.f1558t;
        int i10 = AbstractC0207a.a;
        a = new o1.e((p200u8.b) c0208b);
        f1567b = new o1.e((p200u8.b) C0208b.f1559u);
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [u8.b, v8.k] */
    public static final A a(Class cls) {
        Object objPutIfAbsent;
        p210v8.i.f(cls, "jClass");
        o1.e eVar = a;
        eVar.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) eVar.f13628u;
        Object objInvoke = concurrentHashMap.get(cls);
        if (objInvoke == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, (objInvoke = ((p210v8.k) eVar.f13627t).invoke(cls)))) != null) {
            objInvoke = objPutIfAbsent;
        }
        p210v8.i.d(objInvoke, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>");
        return (A) objInvoke;
    }
}
