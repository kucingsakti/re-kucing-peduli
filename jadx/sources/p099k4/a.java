package p099k4;

import p239z.e;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f12689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12690e;

    public a(String str, String str2, String str3, b bVar, int i10) {
        this.a = str;
        this.f12687b = str2;
        this.f12688c = str3;
        this.f12689d = bVar;
        this.f12690e = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.a;
        if (str == null) {
            if (aVar.a != null) {
                return false;
            }
        } else if (!str.equals(aVar.a)) {
            return false;
        }
        String str2 = this.f12687b;
        if (str2 == null) {
            if (aVar.f12687b != null) {
                return false;
            }
        } else if (!str2.equals(aVar.f12687b)) {
            return false;
        }
        String str3 = this.f12688c;
        if (str3 == null) {
            if (aVar.f12688c != null) {
                return false;
            }
        } else if (!str3.equals(aVar.f12688c)) {
            return false;
        }
        b bVar = this.f12689d;
        if (bVar == null) {
            if (aVar.f12689d != null) {
                return false;
            }
        } else if (!bVar.equals(aVar.f12689d)) {
            return false;
        }
        int i10 = this.f12690e;
        if (i10 == 0) {
            return aVar.f12690e == 0;
        }
        return e.b(i10, aVar.f12690e);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f12687b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f12688c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        b bVar = this.f12689d;
        int iHashCode4 = (iHashCode3 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        int i10 = this.f12690e;
        return (i10 != 0 ? e.d(i10) : 0) ^ iHashCode4;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.a);
        sb.append(", fid=");
        sb.append(this.f12687b);
        sb.append(", refreshToken=");
        sb.append(this.f12688c);
        sb.append(", authToken=");
        sb.append(this.f12689d);
        sb.append(", responseCode=");
        int i10 = this.f12690e;
        if (i10 != 1) {
            str = i10 != 2 ? "null" : "BAD_CONFIG";
        } else {
            str = "OK";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
