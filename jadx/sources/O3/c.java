package O3;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3520c;

    public c(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.a = str;
        this.f3519b = str2;
        this.f3520c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.a.equals(cVar.a)) {
                String str = cVar.f3519b;
                String str2 = this.f3519b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = cVar.f3520c;
                    String str4 = this.f3520c;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.f3519b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f3520c;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb.append(this.a);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f3519b);
        sb.append(", firebaseAuthenticationToken=");
        return E0.a.l(sb, this.f3520c, "}");
    }
}
