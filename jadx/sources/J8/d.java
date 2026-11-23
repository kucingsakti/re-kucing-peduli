package J8;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final e a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2452b;

    public d(e eVar, int i10) {
        this.a = eVar;
        this.f2452b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a == dVar.a && this.f2452b == dVar.f2452b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.f2452b;
    }

    public final String toString() {
        return "KindWithArity(kind=" + this.a + ", arity=" + this.f2452b + ')';
    }
}
