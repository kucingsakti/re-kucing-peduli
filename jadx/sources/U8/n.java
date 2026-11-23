package U8;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    public final p019b9.i a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Collection f4976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4977c;

    public n(p019b9.i iVar, Collection collection, boolean z6) {
        p210v8.i.f(collection, "qualifierApplicabilityTypes");
        this.a = iVar;
        this.f4976b = collection;
        this.f4977c = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return p210v8.i.a(this.a, nVar.a) && p210v8.i.a(this.f4976b, nVar.f4976b) && this.f4977c == nVar.f4977c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    public final int hashCode() {
        int iHashCode = (this.f4976b.hashCode() + (this.a.hashCode() * 31)) * 31;
        boolean z6 = this.f4977c;
        ?? r10 = z6;
        if (z6) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    public final String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.a + ", qualifierApplicabilityTypes=" + this.f4976b + ", definitelyNotNull=" + this.f4977c + ')';
    }

    public n(p019b9.i iVar, Collection collection) {
        this(iVar, collection, iVar.a == p019b9.h.f7335u);
    }
}
