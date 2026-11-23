package p090j2;

import p239z.e;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12360b;

    public a(int i10, long j) {
        if (i10 == 0) {
            throw new NullPointerException("Null status");
        }
        this.a = i10;
        this.f12360b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return e.b(this.a, aVar.a) && this.f12360b == aVar.f12360b;
    }

    public final int hashCode() {
        int iD = (e.d(this.a) ^ 1000003) * 1000003;
        long j = this.f12360b;
        return iD ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i10 = this.a;
        if (i10 == 1) {
            str = "OK";
        } else if (i10 == 2) {
            str = "TRANSIENT_ERROR";
        } else if (i10 != 3) {
            str = i10 != 4 ? "null" : "INVALID_PAYLOAD";
        } else {
            str = "FATAL_ERROR";
        }
        sb.append(str);
        sb.append(", nextRequestWaitMillis=");
        sb.append(this.f12360b);
        sb.append("}");
        return sb.toString();
    }
}
