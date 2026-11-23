package k1;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final boolean a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f12683d;

    public a(boolean z6, boolean z10, boolean z11, boolean z12) {
        this.a = z6;
        this.f12681b = z10;
        this.f12682c = z11;
        this.f12683d = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.f12681b == aVar.f12681b && this.f12682c == aVar.f12682c && this.f12683d == aVar.f12683d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final int hashCode() {
        boolean z6 = this.a;
        ?? r10 = z6;
        if (z6) {
            r10 = 1;
        }
        int i10 = r10 * 31;
        boolean z10 = this.f12681b;
        ?? r11 = z10;
        if (z10) {
            r11 = 1;
        }
        int i11 = (i10 + r11) * 31;
        boolean z11 = this.f12682c;
        ?? r12 = z11;
        if (z11) {
            r12 = 1;
        }
        int i12 = (i11 + r12) * 31;
        boolean z12 = this.f12683d;
        return i12 + (z12 ? 1 : z12);
    }

    public final String toString() {
        return "NetworkState(isConnected=" + this.a + ", isValidated=" + this.f12681b + ", isMetered=" + this.f12682c + ", isNotRoaming=" + this.f12683d + ')';
    }
}
