package o1;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13636b;

    public i(String str, int i10) {
        p210v8.i.f(str, "workSpecId");
        this.a = str;
        this.f13636b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return p210v8.i.a(this.a, iVar.a) && this.f13636b == iVar.f13636b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.f13636b;
    }

    public final String toString() {
        return "WorkGenerationalId(workSpecId=" + this.a + ", generation=" + this.f13636b + ')';
    }
}
