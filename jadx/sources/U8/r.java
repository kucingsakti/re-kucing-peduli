package U8;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f4984d = new r(B.STRICT, 6);
    public final B a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p076h8.c f4985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B f4986c;

    public r(B b3, p076h8.c cVar, B b7) {
        this.a = b3;
        this.f4985b = cVar;
        this.f4986c = b7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.a == rVar.a && p210v8.i.a(this.f4985b, rVar.f4985b) && this.f4986c == rVar.f4986c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        p076h8.c cVar = this.f4985b;
        return this.f4986c.hashCode() + ((iHashCode + (cVar == null ? 0 : cVar.f11785v)) * 31);
    }

    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.a + ", sinceVersion=" + this.f4985b + ", reportLevelAfter=" + this.f4986c + ')';
    }

    public r(B b3, int i10) {
        this(b3, (i10 & 2) != 0 ? new p076h8.c(0, 0) : null, b3);
    }
}
