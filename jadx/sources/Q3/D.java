package Q3;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class D extends q0 {
    public final int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f4065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f4066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f4067g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f4068h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f4069i;

    public D(int i10, String str, int i11, int i12, long j, long j10, long j11, String str2, List list) {
        this.a = i10;
        this.f4062b = str;
        this.f4063c = i11;
        this.f4064d = i12;
        this.f4065e = j;
        this.f4066f = j10;
        this.f4067g = j11;
        this.f4068h = str2;
        this.f4069i = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q0) {
            q0 q0Var = (q0) obj;
            if (this.a == ((D) q0Var).a) {
                D d3 = (D) q0Var;
                if (this.f4062b.equals(d3.f4062b) && this.f4063c == d3.f4063c && this.f4064d == d3.f4064d && this.f4065e == d3.f4065e && this.f4066f == d3.f4066f && this.f4067g == d3.f4067g) {
                    String str = d3.f4068h;
                    String str2 = this.f4068h;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        List list = d3.f4069i;
                        List list2 = this.f4069i;
                        if (list2 != null ? list2.equals(list) : list == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.a ^ 1000003) * 1000003) ^ this.f4062b.hashCode()) * 1000003) ^ this.f4063c) * 1000003) ^ this.f4064d) * 1000003;
        long j = this.f4065e;
        int i10 = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j10 = this.f4066f;
        int i11 = (i10 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f4067g;
        int i12 = (i11 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str = this.f4068h;
        int iHashCode2 = (i12 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f4069i;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.a + ", processName=" + this.f4062b + ", reasonCode=" + this.f4063c + ", importance=" + this.f4064d + ", pss=" + this.f4065e + ", rss=" + this.f4066f + ", timestamp=" + this.f4067g + ", traceFile=" + this.f4068h + ", buildIdMappingForArch=" + this.f4069i + "}";
    }
}
