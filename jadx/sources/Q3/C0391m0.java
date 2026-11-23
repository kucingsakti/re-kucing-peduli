package Q3;

/* JADX INFO: renamed from: Q3.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0391m0 {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4266e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o1.c f4267f;

    public C0391m0(String str, String str2, String str3, String str4, int i10, o1.c cVar) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f4263b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f4264c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f4265d = str4;
        this.f4266e = i10;
        this.f4267f = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0391m0)) {
            return false;
        }
        C0391m0 c0391m0 = (C0391m0) obj;
        return this.a.equals(c0391m0.a) && this.f4263b.equals(c0391m0.f4263b) && this.f4264c.equals(c0391m0.f4264c) && this.f4265d.equals(c0391m0.f4265d) && this.f4266e == c0391m0.f4266e && this.f4267f.equals(c0391m0.f4267f);
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f4263b.hashCode()) * 1000003) ^ this.f4264c.hashCode()) * 1000003) ^ this.f4265d.hashCode()) * 1000003) ^ this.f4266e) * 1000003) ^ this.f4267f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.a + ", versionCode=" + this.f4263b + ", versionName=" + this.f4264c + ", installUuid=" + this.f4265d + ", deliveryMechanism=" + this.f4266e + ", developmentPlatformProvider=" + this.f4267f + "}";
    }
}
