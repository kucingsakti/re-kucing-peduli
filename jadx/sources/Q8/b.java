package Q8;

import B4.C0157e;
import L9.n;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final Class a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0157e f4340b;

    public b(Class cls, C0157e c0157e) {
        this.a = cls;
        this.f4340b = c0157e;
    }

    public final String a() {
        return n.F(this.a.getName(), '.', '/').concat(".class");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return i.a(this.a, ((b) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b.class.getName() + ": " + this.a;
    }
}
