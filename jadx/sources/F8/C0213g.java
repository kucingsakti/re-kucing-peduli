package F8;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: F8.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0213g extends t0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f1574t;

    public C0213g(Class cls) {
        p210v8.i.f(cls, "jClass");
        Object[] declaredMethods = cls.getDeclaredMethods();
        p210v8.i.e(declaredMethods, "jClass.declaredMethods");
        C0212f c0212f = new C0212f(0);
        if (declaredMethods.length != 0) {
            declaredMethods = Arrays.copyOf(declaredMethods, declaredMethods.length);
            p210v8.i.e(declaredMethods, "copyOf(...)");
            if (declaredMethods.length > 1) {
                Arrays.sort(declaredMethods, c0212f);
            }
        }
        this.f1574t = p086i8.i.l(declaredMethods);
    }

    @Override // F8.t0
    public final String d() {
        return p086i8.k.Z(this.f1574t, "", "<init>(", ")V", C0208b.f1560v, 24);
    }
}
