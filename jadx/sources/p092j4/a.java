package p092j4;

import B4.C0157e;
import p239z.e;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f12501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f12502f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f12503g;

    public a(String str, int i10, String str2, String str3, long j, long j10, String str4) {
        this.a = str;
        this.f12498b = i10;
        this.f12499c = str2;
        this.f12500d = str3;
        this.f12501e = j;
        this.f12502f = j10;
        this.f12503g = str4;
    }

    public final C0157e a() {
        C0157e c0157e = new C0157e(5);
        c0157e.f665b = this.a;
        c0157e.f666c = this.f12498b;
        c0157e.f667d = this.f12499c;
        c0157e.f668e = this.f12500d;
        c0157e.f669f = Long.valueOf(this.f12501e);
        c0157e.f670g = Long.valueOf(this.f12502f);
        c0157e.f671h = this.f12503g;
        return c0157e;
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
        if (!e.b(this.f12498b, aVar.f12498b)) {
            return false;
        }
        String str2 = aVar.f12499c;
        String str3 = this.f12499c;
        if (str3 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str3.equals(str2)) {
            return false;
        }
        String str4 = aVar.f12500d;
        String str5 = this.f12500d;
        if (str5 == null) {
            if (str4 != null) {
                return false;
            }
        } else if (!str5.equals(str4)) {
            return false;
        }
        if (this.f12501e != aVar.f12501e || this.f12502f != aVar.f12502f) {
            return false;
        }
        String str6 = aVar.f12503g;
        String str7 = this.f12503g;
        if (str7 == null) {
            return str6 == null;
        }
        return str7.equals(str6);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ e.d(this.f12498b)) * 1000003;
        String str2 = this.f12499c;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f12500d;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.f12501e;
        int i10 = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j10 = this.f12502f;
        int i11 = (i10 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        String str4 = this.f12503g;
        return (str4 != null ? str4.hashCode() : 0) ^ i11;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.a);
        sb.append(", registrationStatus=");
        int i10 = this.f12498b;
        if (i10 == 1) {
            str = "ATTEMPT_MIGRATION";
        } else if (i10 == 2) {
            str = "NOT_GENERATED";
        } else if (i10 == 3) {
            str = "UNREGISTERED";
        } else if (i10 != 4) {
            str = i10 != 5 ? "null" : "REGISTER_ERROR";
        } else {
            str = "REGISTERED";
        }
        sb.append(str);
        sb.append(", authToken=");
        sb.append(this.f12499c);
        sb.append(", refreshToken=");
        sb.append(this.f12500d);
        sb.append(", expiresInSecs=");
        sb.append(this.f12501e);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f12502f);
        sb.append(", fisError=");
        return E0.a.l(sb, this.f12503g, "}");
    }
}
