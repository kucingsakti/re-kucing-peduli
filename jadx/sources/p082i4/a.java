package p082i4;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12265c;

    public a(String str, long j, long j10) {
        this.a = str;
        this.f12264b = j;
        this.f12265c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.a.equals(aVar.a) && this.f12264b == aVar.f12264b && this.f12265c == aVar.f12265c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.f12264b;
        long j10 = this.f12265c;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "InstallationTokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.f12264b + ", tokenCreationTimestamp=" + this.f12265c + "}";
    }
}
