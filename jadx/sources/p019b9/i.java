package p019b9;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public final h a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7337b;

    public i(h hVar) {
        this.a = hVar;
        this.f7337b = false;
    }

    public static i a(i iVar, h hVar, boolean z6, int i10) {
        if ((i10 & 1) != 0) {
            hVar = iVar.a;
        }
        if ((i10 & 2) != 0) {
            z6 = iVar.f7337b;
        }
        iVar.getClass();
        p210v8.i.f(hVar, "qualifier");
        return new i(hVar, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a == iVar.a && this.f7337b == iVar.f7337b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        boolean z6 = this.f7337b;
        ?? r10 = z6;
        if (z6) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    public final String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.a + ", isForWarningOnly=" + this.f7337b + ')';
    }

    public i(h hVar, boolean z6) {
        this.a = hVar;
        this.f7337b = z6;
    }
}
