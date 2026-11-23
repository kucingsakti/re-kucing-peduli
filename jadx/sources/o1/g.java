package o1;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13630c;

    public g(String str, int i10, int i11) {
        p210v8.i.f(str, "workSpecId");
        this.a = str;
        this.f13629b = i10;
        this.f13630c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return p210v8.i.a(this.a, gVar.a) && this.f13629b == gVar.f13629b && this.f13630c == gVar.f13630c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.f13629b) * 31) + this.f13630c;
    }

    public final String toString() {
        return "SystemIdInfo(workSpecId=" + this.a + ", generation=" + this.f13629b + ", systemId=" + this.f13630c + ')';
    }
}
