package Q3;

/* JADX INFO: loaded from: classes.dex */
public final class K extends v0 {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f4099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f4100f;

    public K(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.f4096b = str2;
        this.f4097c = str3;
        this.f4098d = str4;
        this.f4099e = str5;
        this.f4100f = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v0) {
            v0 v0Var = (v0) obj;
            if (this.a.equals(((K) v0Var).a)) {
                K k3 = (K) v0Var;
                if (this.f4096b.equals(k3.f4096b)) {
                    String str = k3.f4097c;
                    String str2 = this.f4097c;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        String str3 = k3.f4098d;
                        String str4 = this.f4098d;
                        if (str4 != null ? str4.equals(str3) : str3 == null) {
                            String str5 = k3.f4099e;
                            String str6 = this.f4099e;
                            if (str6 != null ? str6.equals(str5) : str5 == null) {
                                String str7 = k3.f4100f;
                                String str8 = this.f4100f;
                                if (str8 != null ? str8.equals(str7) : str7 == null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f4096b.hashCode()) * 1000003;
        String str = this.f4097c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.f4098d;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f4099e;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f4100f;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{identifier=");
        sb.append(this.a);
        sb.append(", version=");
        sb.append(this.f4096b);
        sb.append(", displayVersion=");
        sb.append(this.f4097c);
        sb.append(", organization=null, installationUuid=");
        sb.append(this.f4098d);
        sb.append(", developmentPlatform=");
        sb.append(this.f4099e);
        sb.append(", developmentPlatformVersion=");
        return E0.a.l(sb, this.f4100f, "}");
    }
}
