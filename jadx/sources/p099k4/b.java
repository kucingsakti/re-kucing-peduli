package p099k4;

import A1.q;
import p239z.e;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12692c;

    public b(int i10, long j, String str) {
        this.a = str;
        this.f12691b = j;
        this.f12692c = i10;
    }

    public static q a() {
        q qVar = new q(5);
        qVar.f165d = 0L;
        return qVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        String str = this.a;
        if (str == null) {
            if (bVar.a != null) {
                return false;
            }
        } else if (!str.equals(bVar.a)) {
            return false;
        }
        if (this.f12691b != bVar.f12691b) {
            return false;
        }
        int i10 = bVar.f12692c;
        int i11 = this.f12692c;
        if (i11 == 0) {
            return i10 == 0;
        }
        return e.b(i11, i10);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.f12691b;
        int i10 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        int i11 = this.f12692c;
        return (i11 != 0 ? e.d(i11) : 0) ^ i10;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f12691b);
        sb.append(", responseCode=");
        int i10 = this.f12692c;
        if (i10 == 1) {
            str = "OK";
        } else if (i10 != 2) {
            str = i10 != 3 ? "null" : "AUTH_ERROR";
        } else {
            str = "BAD_CONFIG";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
