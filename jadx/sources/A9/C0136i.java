package A9;

/* JADX INFO: renamed from: A9.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0136i {
    public final M8.h a;

    public C0136i(M8.h hVar) {
        p210v8.i.f(hVar, "annotations");
        this.a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0136i) {
            return p210v8.i.a(((C0136i) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
