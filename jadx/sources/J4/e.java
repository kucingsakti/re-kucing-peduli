package J4;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f2411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f2412d;

    public e(long j, long j10, String str, String str2) {
        this.a = str;
        this.f2410b = str2;
        this.f2411c = j;
        this.f2412d = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return p210v8.i.a(this.a, eVar.a) && p210v8.i.a(this.f2410b, eVar.f2410b) && this.f2411c == eVar.f2411c && this.f2412d == eVar.f2412d;
    }

    public final int hashCode() {
        int iA = p231y.a.a(this.a.hashCode() * 31, this.f2410b, 31);
        long j = this.f2411c;
        long j10 = this.f2412d;
        return ((iA + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "FileList(name=" + this.a + ", path=" + this.f2410b + ", date=" + this.f2411c + ", size=" + this.f2412d + ')';
    }
}
