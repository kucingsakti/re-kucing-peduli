package h2;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class t extends F {
    public final long a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f11718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f11719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f11720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f11721f;

    public t(long j, long j10, n nVar, Integer num, String str, ArrayList arrayList) {
        J j11 = J.f11659s;
        this.a = j;
        this.f11717b = j10;
        this.f11718c = nVar;
        this.f11719d = num;
        this.f11720e = str;
        this.f11721f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        t tVar = (t) ((F) obj);
        if (this.a != tVar.a) {
            return false;
        }
        if (this.f11717b != tVar.f11717b) {
            return false;
        }
        if (!this.f11718c.equals(tVar.f11718c)) {
            return false;
        }
        Integer num = tVar.f11719d;
        Integer num2 = this.f11719d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str = tVar.f11720e;
        String str2 = this.f11720e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.f11721f.equals(tVar.f11721f)) {
            return false;
        }
        Object obj2 = J.f11659s;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        long j = this.a;
        long j10 = this.f11717b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f11718c.hashCode()) * 1000003;
        Integer num = this.f11719d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f11720e;
        return ((((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f11721f.hashCode()) * 1000003) ^ J.f11659s.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.f11717b + ", clientInfo=" + this.f11718c + ", logSource=" + this.f11719d + ", logSourceName=" + this.f11720e + ", logEvents=" + this.f11721f + ", qosTier=" + J.f11659s + "}";
    }
}
