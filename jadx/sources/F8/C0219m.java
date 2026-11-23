package F8;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: F8.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0219m extends t0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Method f1601t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Method f1602u;

    public C0219m(Method method, Method method2) {
        p210v8.i.f(method, "getterMethod");
        this.f1601t = method;
        this.f1602u = method2;
    }

    @Override // F8.t0
    public final String d() {
        return t0.c(this.f1601t);
    }
}
