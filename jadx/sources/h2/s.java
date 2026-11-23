package h2;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class s extends E {
    public final long a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f11709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f11710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f11712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f11713f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f11714g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v f11715h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p f11716i;

    public s(long j, Integer num, o oVar, long j10, byte[] bArr, String str, long j11, v vVar, p pVar) {
        this.a = j;
        this.f11709b = num;
        this.f11710c = oVar;
        this.f11711d = j10;
        this.f11712e = bArr;
        this.f11713f = str;
        this.f11714g = j11;
        this.f11715h = vVar;
        this.f11716i = pVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e10 = (E) obj;
        s sVar = (s) e10;
        if (this.a != sVar.a) {
            return false;
        }
        Integer num = this.f11709b;
        if (num == null) {
            if (sVar.f11709b != null) {
                return false;
            }
        } else if (!num.equals(sVar.f11709b)) {
            return false;
        }
        o oVar = this.f11710c;
        if (oVar == null) {
            if (sVar.f11710c != null) {
                return false;
            }
        } else if (!oVar.equals(sVar.f11710c)) {
            return false;
        }
        if (this.f11711d != sVar.f11711d) {
            return false;
        }
        if (!Arrays.equals(this.f11712e, e10 instanceof s ? ((s) e10).f11712e : sVar.f11712e)) {
            return false;
        }
        String str = sVar.f11713f;
        String str2 = this.f11713f;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.f11714g != sVar.f11714g) {
            return false;
        }
        v vVar = sVar.f11715h;
        v vVar2 = this.f11715h;
        if (vVar2 == null) {
            if (vVar != null) {
                return false;
            }
        } else if (!vVar2.equals(vVar)) {
            return false;
        }
        p pVar = sVar.f11716i;
        p pVar2 = this.f11716i;
        if (pVar2 == null) {
            return pVar == null;
        }
        return pVar2.equals(pVar);
    }

    public final int hashCode() {
        long j = this.a;
        int i10 = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f11709b;
        int iHashCode = (i10 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        o oVar = this.f11710c;
        int iHashCode2 = (iHashCode ^ (oVar == null ? 0 : oVar.hashCode())) * 1000003;
        long j10 = this.f11711d;
        int iHashCode3 = (((iHashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f11712e)) * 1000003;
        String str = this.f11713f;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j11 = this.f11714g;
        int i11 = (iHashCode4 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        v vVar = this.f11715h;
        int iHashCode5 = (i11 ^ (vVar == null ? 0 : vVar.hashCode())) * 1000003;
        p pVar = this.f11716i;
        return iHashCode5 ^ (pVar != null ? pVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.f11709b + ", complianceData=" + this.f11710c + ", eventUptimeMs=" + this.f11711d + ", sourceExtension=" + Arrays.toString(this.f11712e) + ", sourceExtensionJsonProto3=" + this.f11713f + ", timezoneOffsetSeconds=" + this.f11714g + ", networkConnectionInfo=" + this.f11715h + ", experimentIds=" + this.f11716i + "}";
    }
}
