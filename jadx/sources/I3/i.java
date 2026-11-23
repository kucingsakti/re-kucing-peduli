package I3;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public final p a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2035b;

    public i(p pVar, boolean z6) {
        this.a = pVar;
        this.f2035b = z6;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.a.equals(this.a) && iVar.f2035b == this.f2035b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f2035b).hashCode();
    }
}
