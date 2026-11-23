package Q3;

/* JADX INFO: renamed from: Q3.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0367a0 extends D0 {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f4167d;

    public C0367a0(int i10, int i11, String str, boolean z6) {
        this.a = str;
        this.f4165b = i10;
        this.f4166c = i11;
        this.f4167d = z6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof D0) {
            D0 d3 = (D0) obj;
            if (this.a.equals(((C0367a0) d3).a)) {
                C0367a0 c0367a0 = (C0367a0) d3;
                if (this.f4165b == c0367a0.f4165b && this.f4166c == c0367a0.f4166c && this.f4167d == c0367a0.f4167d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f4165b) * 1000003) ^ this.f4166c) * 1000003) ^ (this.f4167d ? 1231 : 1237);
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.a + ", pid=" + this.f4165b + ", importance=" + this.f4166c + ", defaultProcess=" + this.f4167d + "}";
    }
}
