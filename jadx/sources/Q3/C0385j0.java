package Q3;

/* JADX INFO: renamed from: Q3.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0385j0 extends L0 {
    public final int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f4244d;

    public C0385j0(String str, int i10, String str2, boolean z6) {
        this.a = i10;
        this.f4242b = str;
        this.f4243c = str2;
        this.f4244d = z6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof L0) {
            L0 l4 = (L0) obj;
            if (this.a == ((C0385j0) l4).a) {
                C0385j0 c0385j0 = (C0385j0) l4;
                if (this.f4242b.equals(c0385j0.f4242b) && this.f4243c.equals(c0385j0.f4243c) && this.f4244d == c0385j0.f4244d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.f4242b.hashCode()) * 1000003) ^ this.f4243c.hashCode()) * 1000003) ^ (this.f4244d ? 1231 : 1237);
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.a + ", version=" + this.f4242b + ", buildVersion=" + this.f4243c + ", jailbroken=" + this.f4244d + "}";
    }
}
