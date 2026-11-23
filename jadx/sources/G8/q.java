package G8;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class q extends o implements d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Method method) {
        super(method, false, 4);
        p210v8.i.f(method, "method");
    }

    @Override // G8.o, G8.e
    public final Object v(Object[] objArr) {
        p210v8.i.f(objArr, "args");
        C3.a.b(this, objArr);
        return c(null, objArr);
    }
}
