package h2;

/* JADX INFO: loaded from: classes.dex */
public final class v extends I {
    public final H a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G f11722b;

    public v(H h10, G g8) {
        this.a = h10;
        this.f11722b = g8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof I) {
            I i10 = (I) obj;
            H h10 = this.a;
            if (h10 != null ? h10.equals(((v) i10).a) : ((v) i10).a == null) {
                G g8 = this.f11722b;
                if (g8 != null ? g8.equals(((v) i10).f11722b) : ((v) i10).f11722b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        H h10 = this.a;
        int iHashCode = ((h10 == null ? 0 : h10.hashCode()) ^ 1000003) * 1000003;
        G g8 = this.f11722b;
        return (g8 != null ? g8.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.f11722b + "}";
    }
}
