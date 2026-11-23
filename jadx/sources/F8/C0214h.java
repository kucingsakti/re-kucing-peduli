package F8;

import java.lang.reflect.Constructor;

/* JADX INFO: renamed from: F8.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0214h extends t0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Constructor f1578t;

    public C0214h(Constructor constructor) {
        p210v8.i.f(constructor, "constructor");
        this.f1578t = constructor;
    }

    @Override // F8.t0
    public final String d() {
        Class<?>[] parameterTypes = this.f1578t.getParameterTypes();
        p210v8.i.e(parameterTypes, "constructor.parameterTypes");
        return p086i8.i.A(parameterTypes, "<init>(", ")V", C0208b.f1561w, 24);
    }
}
