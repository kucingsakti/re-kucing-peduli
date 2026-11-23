package G8;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class p extends o implements d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f1737g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Method method, Object obj) {
        super(method, false, 4);
        p210v8.i.f(method, "method");
        this.f1737g = obj;
    }

    @Override // G8.o, G8.e
    public final Object v(Object[] objArr) {
        p210v8.i.f(objArr, "args");
        C3.a.b(this, objArr);
        return c(this.f1737g, objArr);
    }
}
