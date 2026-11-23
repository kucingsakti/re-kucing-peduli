package Q3;

/* JADX INFO: renamed from: Q3.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0379g0 extends H0 {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4218b;

    public C0379g0(String str, String str2) {
        this.a = str;
        this.f4218b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof H0) {
            H0 h10 = (H0) obj;
            if (this.a.equals(((C0379g0) h10).a) && this.f4218b.equals(((C0379g0) h10).f4218b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f4218b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutVariant{rolloutId=");
        sb.append(this.a);
        sb.append(", variantId=");
        return E0.a.l(sb, this.f4218b, "}");
    }
}
