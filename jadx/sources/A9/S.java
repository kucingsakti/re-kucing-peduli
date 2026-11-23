package A9;

/* JADX INFO: loaded from: classes.dex */
public abstract class S {
    public abstract int a();

    public abstract AbstractC0151y b();

    public abstract boolean c();

    public abstract S d(B9.f fVar);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s9 = (S) obj;
        return c() == s9.c() && a() == s9.a() && b().equals(s9.b());
    }

    public final int hashCode() {
        int iD = p239z.e.d(a());
        if (b0.l(b())) {
            return (iD * 31) + 19;
        }
        return (iD * 31) + (c() ? 17 : b().hashCode());
    }

    public final String toString() {
        if (c()) {
            return "*";
        }
        if (a() == 1) {
            return b().toString();
        }
        return E0.a.r(a()) + " " + b();
    }
}
