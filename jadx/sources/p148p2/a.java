package p148p2;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f14201f = new a(200, 10000, 10485760, 604800000, 81920);
    public final long a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f14204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14205e;

    public a(int i10, int i11, long j, long j10, int i12) {
        this.a = j;
        this.f14202b = i10;
        this.f14203c = i11;
        this.f14204d = j10;
        this.f14205e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.a == aVar.a && this.f14202b == aVar.f14202b && this.f14203c == aVar.f14203c && this.f14204d == aVar.f14204d && this.f14205e == aVar.f14205e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int i10 = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f14202b) * 1000003) ^ this.f14203c) * 1000003;
        long j10 = this.f14204d;
        return ((i10 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f14205e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.a);
        sb.append(", loadBatchSize=");
        sb.append(this.f14202b);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.f14203c);
        sb.append(", eventCleanUpAge=");
        sb.append(this.f14204d);
        sb.append(", maxBlobByteSizePerRow=");
        return E0.a.j(sb, this.f14205e, "}");
    }
}
