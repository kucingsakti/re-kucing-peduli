package Q3;

/* JADX INFO: loaded from: classes.dex */
public final class B extends O0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f4046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f4047f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f4048g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f4049h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f4050i;
    public final String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final J f4051k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final G f4052l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final D f4053m;

    public B(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, String str8, J j, G g8, D d3) {
        this.f4043b = str;
        this.f4044c = str2;
        this.f4045d = i10;
        this.f4046e = str3;
        this.f4047f = str4;
        this.f4048g = str5;
        this.f4049h = str6;
        this.f4050i = str7;
        this.j = str8;
        this.f4051k = j;
        this.f4052l = g8;
        this.f4053m = d3;
    }

    public final A a() {
        A a = new A();
        a.a = this.f4043b;
        a.f4032b = this.f4044c;
        a.f4033c = this.f4045d;
        a.f4034d = this.f4046e;
        a.f4035e = this.f4047f;
        a.f4036f = this.f4048g;
        a.f4037g = this.f4049h;
        a.f4038h = this.f4050i;
        a.f4039i = this.j;
        a.j = this.f4051k;
        a.f4040k = this.f4052l;
        a.f4041l = this.f4053m;
        a.f4042m = (byte) 1;
        return a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof O0)) {
            return false;
        }
        B b3 = (B) ((O0) obj);
        if (!this.f4043b.equals(b3.f4043b)) {
            return false;
        }
        if (!this.f4044c.equals(b3.f4044c) || this.f4045d != b3.f4045d || !this.f4046e.equals(b3.f4046e)) {
            return false;
        }
        String str = b3.f4047f;
        String str2 = this.f4047f;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        String str3 = b3.f4048g;
        String str4 = this.f4048g;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = b3.f4049h;
        String str6 = this.f4049h;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        if (!this.f4050i.equals(b3.f4050i) || !this.j.equals(b3.j)) {
            return false;
        }
        J j = b3.f4051k;
        J j10 = this.f4051k;
        if (j10 == null) {
            if (j != null) {
                return false;
            }
        } else if (!j10.equals(j)) {
            return false;
        }
        G g8 = b3.f4052l;
        G g10 = this.f4052l;
        if (g10 == null) {
            if (g8 != null) {
                return false;
            }
        } else if (!g10.equals(g8)) {
            return false;
        }
        D d3 = b3.f4053m;
        D d8 = this.f4053m;
        if (d8 == null) {
            return d3 == null;
        }
        return d8.equals(d3);
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f4043b.hashCode() ^ 1000003) * 1000003) ^ this.f4044c.hashCode()) * 1000003) ^ this.f4045d) * 1000003) ^ this.f4046e.hashCode()) * 1000003;
        String str = this.f4047f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f4048g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f4049h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f4050i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
        J j = this.f4051k;
        int iHashCode5 = (iHashCode4 ^ (j == null ? 0 : j.hashCode())) * 1000003;
        G g8 = this.f4052l;
        int iHashCode6 = (iHashCode5 ^ (g8 == null ? 0 : g8.hashCode())) * 1000003;
        D d3 = this.f4053m;
        return iHashCode6 ^ (d3 != null ? d3.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f4043b + ", gmpAppId=" + this.f4044c + ", platform=" + this.f4045d + ", installationUuid=" + this.f4046e + ", firebaseInstallationId=" + this.f4047f + ", firebaseAuthenticationToken=" + this.f4048g + ", appQualitySessionId=" + this.f4049h + ", buildVersion=" + this.f4050i + ", displayVersion=" + this.j + ", session=" + this.f4051k + ", ndkPayload=" + this.f4052l + ", appExitInfo=" + this.f4053m + "}";
    }
}
